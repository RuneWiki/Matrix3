package com.rs.game.npc.dungeonnering;

import java.util.List;

import com.rs.game.Animation;
import com.rs.game.EffectsManager.Effect;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.NewForceMovement;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.combat.impl.dung.YkLagorThunderousCombat;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class KalGerWarmonger extends DungeonBoss {

	private static final int SIZE = 5;
	private static final int[] WEAPONS =
		{ -1, 56057, 56054, 56056, 56055, 56053 };
	private static final int[][] FLY_COORDINATES =
		{ { 4, 2 },//correct
		{ 0, 0 },//correct cuz he doesn't even fly
		{ 10, 10 },//correct
		{ 10, 2 },//correct
		{ 5, 10 },//correct
		{ 5, 3 } };//correct

	private WarpedSphere sphere;
	private WorldTile nextFlyTile;
	private WorldObject nextWeapon;
	private int type, typeTicks, pullTicks, annoyanceMeter;
	private boolean stolenEffects;

	public KalGerWarmonger(int id, WorldTile tile, final DungeonManager manager, final RoomReference reference) {
		super(id, tile, manager, reference);
		//setName("Lord Fungus");
		setCapDamage(5000);
		setCantInteract(true);
		typeTicks = -1;
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				playSoundEffect(3033);
				setNextForceTalk(new ForceTalk("NOW IT'S YOUR TURN!"));
				sphere = new WarpedSphere(reference, 12842, manager.getTile(reference, 11, 12), manager, 0.0);
				beginFlyCount();
			}
		}, 3);
	}

	private void beginFlyCount() {
		type++;
		if (type != 1)
			setHitpoints((int) (getHitpoints() + (getMaxHitpoints() * .15D)));// He heals a bit not 100% sure what the multiplier is
		typeTicks = type == 2 ? 7 : 0;
		setCantInteract(true);
		setNextFaceEntity(null);//Resets?
	}
	
	

	@Override
	public void processHit(Hit hit) {
		if (type != 6) {
			int max_hp = getMaxHitpoints(), nextStageHP = (int) (max_hp - (max_hp * (type * .20)));
			if (getHitpoints() - hit.getDamage() < nextStageHP) {
				hit.setDamage(getHitpoints() - (nextStageHP - 1));
				beginFlyCount();
			}
		}
		super.processHit(hit);
	}

	@Override
	public Hit handleOutgoingHit(Hit hit, Entity target) {
		if (annoyanceMeter == 10) {
			annoyanceMeter = 0;// resets it
			if (target instanceof Player) {
				Player player = (Player) target;
				player.getEffectsManager().startEffect(new Effect(EffectType.PROTECTION_DISABLED, 8));
				player.getPrayer().closeAllPrayers();
				player.getPackets().sendGameMessage("You have been injured and cannot use protective prayers.");
			}
			hit.setDamage(target.getHitpoints() - 1);
			return hit;
		} else if (hit.getDamage() == 0) {
			if (target instanceof Player) {
				Player player = (Player) target;
				if (player.getPrayer().isUsingProtectionPrayer())
					annoyanceMeter++;
			}
		}
		return hit;
	}

	@Override
	public void processNPC() {
		super.processNPC();
		if (typeTicks >= 0) {
			processNextType();
			typeTicks++;
		} else {
			if (type != 0) {
				pullTicks++;
				if (isMaximumPullTicks()) {
					submitPullAttack();
					return;
				}
			}
		}
	}

	public boolean isUsingMelee() {
		return getAttackStyle() == NPCCombatDefinitions.MELEE;
	}

	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		playSoundEffect(2997);
		setNextGraphics(new Graphics(2754));
		setNextForceTalk(new ForceTalk("IMPOSSIBRU!"));// <-- did that on purpose, npc's name is also called lord fungus

		final NPC boss = this;
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				for (Entity t : getPossibleTargets()) {
					if (Utils.inCircle(t, boss, 8))
						t.applyHit(new Hit(boss, Utils.random(300, 990), HitLook.REGULAR_DAMAGE));
				}
			}
		}, 2);
	}

	@Override
	public int getMaxHit() {
		return getCombatLevel() < 300 ? 400 : 650;
	}

	@Override
	public int getMaxHitpoints() {
		return super.getMaxHitpoints() * 2;//Maybe * 3
	}

	@Override
	public double getMagePrayerMultiplier() {
		return .6;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return .6;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return stolenEffects ? 1 : type == 4 ? .3 : .6;
	}

	private void processNextType() {
		if (getManager().isDestroyed()) // Should fix some nullpointers
			return;
		
		if (typeTicks == 1) {
			setNextAnimation(new Animation(14995));
			setNextGraphics(new Graphics(2870));
			final int[] FLY_LOCATION = FLY_COORDINATES[type - 1];
			nextFlyTile = getManager().getTile(getReference(), FLY_LOCATION[0], FLY_LOCATION[1], SIZE, SIZE);
			setNextForceMovement(new NewForceMovement(this, 1, nextFlyTile, 5, Utils.getAngle(nextFlyTile.getX() - getX(), nextFlyTile.getY() - getY())));
		} else if (typeTicks == 6) {
			setNextGraphics(new Graphics(2870));
			setNextWorldTile(nextFlyTile);
		} else if (typeTicks == 9) {
			if (type == 1) {
				typeTicks = 16;
				return;
			}
			int selectedWeapon = WEAPONS[type - 1];
			outer: for (int x = 0; x < 16; x++) {
				for (int y = 0; y < 16; y++) {
					WorldObject next = getManager().getObjectWithType(getReference(), 10, x, y);
					if (next != null && next.getId() == selectedWeapon) {
						nextWeapon = next;
						break outer;
					}
				}
			}
			calcFollow(nextWeapon, false);
		} else if (typeTicks == 11) {
			faceObject(nextWeapon);
			setNextAnimation(new Animation(15027));
		} else if (typeTicks == 13) {
			setNextAnimation(new Animation(14923 + (type - 1)));
		} else if (typeTicks == 14) {
			setNextNPCTransformation(getId() + 17);
			World.removeObject(nextWeapon);
		} else if (typeTicks == 17) {
			if (type == 6)
				stealPlayerEffects();
			sphere.nextStage();
			setCantInteract(false);
			typeTicks = -2;// cuz it increments by one
		}
	}

	private void submitPullAttack() {
		playSoundEffect(3025);
		setNextForceTalk(new ForceTalk("You dare hide from me? BURN!"));
		setNextAnimation(new Animation(14996));
		final NPC boss = this;
		WorldTasksManager.schedule(new WorldTask() {

			private int ticks;
			private List<Entity> possibleTargets;

			@Override
			public void run() {
				ticks++;
				if (ticks == 1) {
					possibleTargets = getPossibleTargets();
					WorldTile tile = getManager().getTile(getReference(), 9, 8);
					for (Entity t : possibleTargets) {
						if (t instanceof Player) {
							Player player = (Player) t;
							player.setCantWalk(true);
							YkLagorThunderousCombat.sendPullAttack(tile, player, false);
						}
					}
				} else if (ticks == 10) {
					for (Entity t : getPossibleTargets())
						t.setNextWorldTile(boss);
					stop();
					pullTicks = 0;
					return;
				} else if (ticks > 3) {
					for (Entity t : possibleTargets) {
						if (!getManager().isAtBossRoom(t))
							continue;
						((Player) t).setCantWalk(false);
						if (Utils.random(5) == 0)
							t.setNextForceTalk(new ForceTalk("Ow!"));
						if (ticks == 8) {
							t.setNextAnimation(new Animation(14388));
							setNextAnimation(new Animation(14996));
						}
						t.applyHit(new Hit(boss, Utils.random(33, 87), HitLook.REGULAR_DAMAGE));
					}
				}
			}
		}, 0, 0);
	}

	private void stealPlayerEffects() {
		playSoundEffect(3029);
		setNextForceTalk(new ForceTalk("Your gods can't help you now!"));
		for (Player player : getManager().getParty().getTeam()) {
			if (!getManager().getCurrentRoomReference(player).equals(getReference()))
				continue;
			boolean usingPiety = player.getPrayer().usingPrayer(0, 19);
			boolean usingTurmoil = player.getPrayer().usingPrayer(1, 25);
			if (!usingPiety && !usingTurmoil)
				continue;
			player.getPackets().sendGameMessage("The Warmonger steals your " + (usingPiety ? "Piety" : "Turmoil") + " effects!");
			stolenEffects = true;
		}
	}

	public int getType() {
		return type;
	}

	public void setPullTicks(int pullCount) {
		this.pullTicks = pullCount;
	}

	public boolean hasStolenEffects() {
		return stolenEffects;
	}

	public int getAnnoyanceMeter() {
		return annoyanceMeter;
	}

	public void setAnnoyanceMeter(int annoyanceMeter) {
		this.annoyanceMeter = annoyanceMeter;
	}

	public boolean isMaximumPullTicks() {
		return pullTicks == 35;
	}
}
