package com.rs.game.npc.combat.impl.dung;

import com.rs.game.Animation;
import com.rs.game.EffectsManager;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.Sagittare;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class SagittareCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 9753 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final Sagittare boss = (Sagittare) npc;
		if (boss.isUsingSpecial() && !boss.isCantInteract()) {
			sendRainDropAttack(boss);
			return 10;
		}
		int attack = Utils.random(5);
		switch (attack) {
		case 0://Normal range
		case 1://Normal magic
		case 2://Multi magic
			npc.setNextAnimation(new Animation(13271));
			npc.setNextGraphics(new Graphics(attack == 0 ? 2532 : 2534, 0, 96));
			for (Entity t : npc.getPossibleTargets()) {
				if ((attack == 0 || attack == 1) && t != target)
					continue;
				World.sendProjectile(npc, t, attack == 0 ? 2533 : 2535, 65, 50, 54, 35, 5, 0);
				if (attack == 0)
					delayHit(npc, 1, t, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, t)));
				else
					delayHit(npc, 1, t, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, t)));
			}
			break;
		case 3://Bind attacks
		case 4:
			boolean isMagicAttack = attack == 3;
			npc.setNextAnimation(new Animation(13271));
			npc.setNextGraphics(new Graphics(isMagicAttack ? 2536 : 2539, 0, 96));

			for (Entity t : npc.getPossibleTargets()) {
				if (!(t instanceof Player))
					continue;
				Player player = (Player) t;
				boolean bindTarget = false;

				World.sendProjectile(npc, t, isMagicAttack ? 2537 : 2540, 65, 50, 54, 35, 5, 0);
				if (isMagicAttack) {
					if (!player.getPrayer().isMageProtecting())
						bindTarget = true;
					delayHit(npc, 1, t, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, t)));
				} else {
					bindTarget = Utils.random(2) == 0;//50/50
					delayHit(npc, 1, t, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, t)));
				}
				if (bindTarget) {
					if (!player.getEffectsManager().hasActiveEffect(EffectType.BOUND))
						EffectsManager.addBoundEffect(player, 5, false, 3);
					player.setRun(false);
				}
				player.setNextGraphics(new Graphics(2541, 75, 65));
			}
			break;

		}
		return 5;
	}

	private void sendRainDropAttack(final Sagittare boss) {
		boss.setCantInteract(true);
		boss.setNextForceTalk(new ForceTalk("Back off!"));
		final WorldTile center = new WorldTile(boss);
		final DungeonManager manager = boss.getManager();
		final RoomReference rRef = manager.getCurrentRoomReference(center);
		if (rRef == null)
			return;
		WorldTasksManager.schedule(new WorldTask() {

			int cycles;

			@Override
			public void run() {
				cycles++;

				if (boss == null || boss.isDead()) {
					stop();
					return;
				}

				if (cycles == 2) {
					boss.setNextForceTalk(new ForceTalk("Arrow-rain!"));
					boss.setNextAnimation(new Animation(13270));
					boss.setNextGraphics(new Graphics(2542, 0, 93));
				} else if (cycles == 5) {
					boss.setCantInteract(false);
					boss.setNextAnimation(new Animation(8939));
					boss.setNextGraphics(new Graphics(1576));
				} else if (cycles == 7) {
					int stage = boss.getStage();
					WorldTile teleport = Utils.getFreeTile(manager.getTile(rRef, 6, 6), 1);

					if (stage != 1 && stage != -1) {
						int corner = Utils.random(4);
						if (corner == 0)//this is good
							teleport = manager.getTile(rRef, 1, Utils.random(14) + 1);//1,1 14, 1, 14, 14, 2, 14
						else if (corner == 1)//this is good
							teleport = manager.getTile(rRef, 14 - Utils.random(14), 1);
						else if (corner == 2)//this is good
							teleport = manager.getTile(rRef, 14, 14 - Utils.random(14));
						else
							//this is good
							teleport = manager.getTile(rRef, Utils.random(14) + 1, 14);
					}

					for (int x = -1; x < 2; x++) {//3x3 area
						for (int y = -1; y < 2; y++) {
							World.sendProjectile(boss, center.transform(x, y, 0), 2533, 250, 0, 40, 0, 0, 0);
						}
					}
					boss.setNextWorldTile(teleport);
					boss.setNextAnimation(new Animation(8941));
					boss.setNextGraphics(new Graphics(1577));
				} else if (cycles == 8) {
					targetL: for (Entity target : boss.getPossibleTargets()) {
						if (!(target instanceof Player))
							continue;
						Player player = (Player) target;
						for (int x = -1; x < 2; x++) {//3x3 area
							for (int y = -1; y < 2; y++) {
								WorldTile projectileTile = center.transform(x, y, 0);
								if (player.getX() != projectileTile.getX() || player.getY() != projectileTile.getY())
									continue targetL;
							}
						}
						player.setRun(false);
						player.setStunDelay(8);
						player.getPackets().sendGameMessage("You have been injured and can't move.");
						int hit = (int) (boss.getMaxHit() * .1 + getMaxHit(boss, (int) (boss.getMaxHit() * .90), NPCCombatDefinitions.RANGE, player));
						player.applyHit(new Hit(boss, hit, HitLook.REGULAR_DAMAGE));
					}
					boss.setUsingSpecial(false);
					stop();
					return;
				}
			}
		}, 0, 0);
	}
}
