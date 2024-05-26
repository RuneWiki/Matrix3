package com.rs.game.player.content;

import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.OwnedObjectManager.ProcessEvent;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.Wilderness;
import com.rs.utils.Utils;

public class DwarfMultiCannon {

	
	private static int[] CANNON_PIECES =
	{ 6, 8, 10, 12 };
	private static int[] CANNON_OBJECTS =
	{ 7, 8, 9, 6 };
	private static int[] CANNON_EMOTES =
	{ 303, 305, 307, 289, 184, 182, 178, 291 };

	public static void fire(Player player) {
		if (player.getCannonBalls() < 30) {
			int ammount = player.getInventory().getAmountOf(2);
			if (ammount == 0)
				player.getPackets().sendGameMessage("You need to load your cannon with cannon balls before firing it!");
			else {
				int add = 30 - player.getCannonBalls();
				if (ammount > add)
					ammount = add;
				player.addCannonBalls(ammount);
				player.getInventory().deleteItem(2, ammount);
				player.getPackets().sendGameMessage("You load the cannon with " + ammount + " cannon balls.");
			}
		} else
			player.getPackets().sendGameMessage("Your cannon is full.");
	}

	public static void pickupCannon(Player player, int stage, WorldObject object) {
		if (!OwnedObjectManager.isPlayerObject(player, object))
			player.getPackets().sendGameMessage("This is not your cannon.");
		else {
			int space = player.getCannonBalls() > 0 ? stage + 1 : stage;
			if (player.getInventory().getFreeSlots() < space) {
				player.getPackets().sendGameMessage("You need atleast " + space + " inventory spots to pickup your cannon.");
				return;
			}
			if(!OwnedObjectManager.removeObject(player, object))
				return;
			player.lock(3);
			player.getPackets().sendGameMessage("You pick up the cannon. It's really heavy.");
			for (int i = 0; i < stage; i++)
				player.getInventory().addItem(CANNON_PIECES[i], 1);
			if (player.getCannonBalls() > 0) {
				player.getInventory().addItem(2, player.getCannonBalls());
				player.removeCannonBalls();
			}
	
		}
	}

	public static int getAngle(int i) {
		return i * 360 / CANNON_EMOTES.length;
	}
	
	public static void setUp(Player player) {
		if (OwnedObjectManager.containsObjectValue(player, CANNON_OBJECTS)) {
			player.getPackets().sendGameMessage("You can only have one cannon setted at same time.");
			return;
		}
		Controller controler = player.getControlerManager().getControler();
		if (controler != null && !(controler instanceof Wilderness)) {
			player.getPackets().sendGameMessage("You can't place your cannon here.");
			return;
		}
		int count = 0;
		for (int item : CANNON_PIECES) {
			if (!player.getInventory().containsItem(item, 1))
				break;
			count++;
		}
		WorldTile pos = player.transform(-3, -3, 0);
		if (!World.isTileFree(pos.getPlane(), pos.getX(), pos.getY(), 3) || World.getStandartObject(player) != null || World.getStandartObject(pos) != null) {// World.getRegion(player.getRegionId()).getSpawnedObject(pos)
			player.getPackets().sendGameMessage("There isn't enough space to setup here.");
			return;
		}
		WorldObject[] objects = new WorldObject[count];
		for (int i = 0; i < count; i++)
			objects[i] = getObject(i, pos);
		final long[] cycles = new long[count];
		for (int i = 0; i < count - 1; i++)
			cycles[i] = 1200;
		cycles[count - 1] = 1500000;
		player.resetWalkSteps();
		player.lock();
		player.setNextFaceWorldTile(pos);
		OwnedObjectManager.addOwnedObjectManager(player, objects, cycles, new ProcessEvent() {

			private int step;
			private int rotation;
			private boolean warned;
			private long disapearTime;

			@Override
			public void spawnObject(Player player, WorldObject object) {
				player.setNextAnimation(new Animation(827));
				if (step == 0)
					player.getPackets().sendGameMessage("You place the cannon base on the ground.");
				else if (step == 1)
					player.getPackets().sendGameMessage("You add the stand.");
				else if (step == 2)
					player.getPackets().sendGameMessage("You add the barrels.");
				else if (step == 3) {
					player.getPackets().sendGameMessage("You add the furnance.");
					disapearTime = Utils.currentTimeMillis() + cycles[cycles.length - 1];
				}
				player.getInventory().deleteItem(CANNON_PIECES[step], 1);
				if (step++ == cycles.length - 1)
					player.lock(1);
			}

			@Override
			public void process(Player player, WorldObject currentObject) {
				if (step != CANNON_PIECES.length || !player.clientHasLoadedMapRegion() || player.hasFinished())
					return;
				if (!warned && (disapearTime - Utils.currentTimeMillis()) < 5*1000*60) {
					player.getPackets().sendGameMessage("<col=480000>Your cannon is about to decay!");
					warned = true;
				}
				if (player.getCannonBalls() == 0)
					return;
				rotation++;
				if (rotation == CANNON_EMOTES.length * 2)
					rotation = 0;
				if (rotation % 2 == 0) 
					return;
				World.sendObjectAnimation(player, currentObject, new Animation(CANNON_EMOTES[rotation / 2]));
				NPC nearestN = null;
				double lastD = Integer.MAX_VALUE;
				int angle = getAngle(rotation / 2);
				int objectSizeX = currentObject.getDefinitions().sizeX;
				int objectSizeY = currentObject.getDefinitions().sizeY;
				for(int regionId : player.getMapRegionsIds()) {
					Region region = World.getRegion(regionId);
					List<Integer> npcIndexes = region.getNPCsIndexes();
					if (npcIndexes == null)
						continue;
					for (int npcIndex : npcIndexes) {
						NPC npc = World.getNPCs().get(npcIndex);
						if(npc == null || npc == player.getFamiliar() || npc.isDead() || npc.hasFinished() ||  npc.getPlane() != currentObject.getPlane() || !Utils.isOnRange(npc.getX(), npc.getY(), npc.getSize(), currentObject.getX(), currentObject.getY(), objectSizeX, 10)
								|| !npc.getDefinitions().hasAttackOption() || !npc.clipedProjectile(currentObject, false) || npc.isCantInteract())
							continue;
						if(!player.getControlerManager().canHit(npc)) 
							continue;
						int size = npc.getSize();
						double xOffset = (npc.getX()+size/2) - (currentObject.getX()+objectSizeX/2);
						double yOffset = (npc.getY()+size/2) - (currentObject.getY()+objectSizeY/2);
						double distance = Math.hypot(xOffset, yOffset);
						double targetAngle = Math.toDegrees(Math.atan2(xOffset, yOffset));
						if(targetAngle < 0)
							targetAngle += 360;
						double ratioAngle = 22.5;//Math.toDegrees(Math.atan(distance)) / 2;
						if(targetAngle < angle-ratioAngle || targetAngle > angle+ratioAngle || lastD <= distance)
							continue;
						lastD = distance;
						nearestN = npc;
					}
				}
				if(nearestN != null) {
				
					double hitChance = Combat.getHitChance(player, nearestN, player.getCombatDefinitions().getStyle(true), true);
					
					int damage = hitChance < Utils.random(100) ? 0 :  Utils.random(700);
					World.sendProjectile(currentObject.transform(objectSizeX/2, objectSizeY/2, 0), nearestN, 53, 38, 38, 30, 40, 0, 0);
					nearestN.applyHit(new Hit(player, damage, HitLook.CANNON_DAMAGE, 60));
					player.addCannonBalls(-1);
					boolean twoBalls = player.getCannonBalls() > 0 && Utils.random(4) == 0;
					player.getSkills().addXp(Skills.RANGE, damage / 5);
					if(twoBalls) {
						damage = hitChance < Utils.random(100) ? 0 : Utils.random(700);
						World.sendProjectile(currentObject.transform(objectSizeX/2, objectSizeY/2, 0), nearestN, 53, 38, 38, 30, 60, 0, 0);
						nearestN.applyHit(new Hit(player, damage, HitLook.CANNON_DAMAGE, 80));
						player.getSkills().addXp(Skills.RANGE, damage / 5);
						player.addCannonBalls(-1);
					}
					nearestN.setTarget(player);
					if (nearestN instanceof Familiar)
						player.setWildernessSkull();
				}
			}
		});
	}

	private static WorldObject getObject(int i, WorldTile tile) {
		return new WorldObject(CANNON_OBJECTS[i], 10, 0, tile.getX(), tile.getY(), tile.getPlane());
	}

}
