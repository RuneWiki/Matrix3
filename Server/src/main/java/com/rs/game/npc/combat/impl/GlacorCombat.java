package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.glacior.Glacor;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class GlacorCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 14301 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		Glacor glacor = (Glacor) npc;
		if (Utils.random(4) == 0)
			glacor.setRangeAttack(!glacor.isRangeAttack());
		if (target instanceof Player) {
			Player player = (Player) target;
			if (glacor.getEffect() == 1)
				player.getPrayer().drainPrayer(50);
			switch (Utils.random(5)) {
				case 0:
				case 1:
				case 2:
					sendDistancedAttack(glacor, target);
					break;
				case 3:
					if (Utils.isOnRange(npc.getX(), npc.getY(), npc.getSize(), target.getX(), target.getY(), target.getSize(), 0)) {
						npc.setNextAnimation(new Animation(9955));
						delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
					}
					else
						sendDistancedAttack(glacor, target);
					break;
				case 4:
					final WorldTile tile = new WorldTile(target);
					npc.setNextAnimation(new Animation(9955));
					Projectile projectile = World.sendProjectileNew(npc, tile, 2314, 50, 0, 20, 1, 0, 0);
					glacor.setRangeAttack(true);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							for (Entity e : npc.getPossibleTargets()) {
								if (e instanceof Player) {
									Player player = (Player) e;
									if (player.matches(tile))
										player.applyHit(new Hit(npc, player.getHitpoints() / 2, HitLook.RANGE_DAMAGE));
									player.getPackets().sendGraphics(new Graphics(2315), tile);
								}
							}
						}
					}, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1);
					break;
			}
		}
		return npc.getAttackSpeed();
	}

	private void sendDistancedAttack(Glacor npc, final Entity target) {
		boolean isRangedAttack = npc.isRangeAttack();
		if (isRangedAttack) {
			Projectile projectile = World.sendProjectileNew(npc, target, 962, 50, 30, 30, 1, 0, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, target)));
		}
		else {
			Projectile projectile = World.sendProjectileNew(npc, target, 634, 50, 30, 30, 1, 5, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
			if (Utils.random(5) == 0) {
				WorldTasksManager.schedule(new WorldTask() {

					@Override
					public void run() {
						target.setNextGraphics(new Graphics(369));
						target.setBoundDelay(9);
					}
				}, projectile.getEndTime() - 1);
			}
		}
		npc.setNextAnimation(new Animation(isRangedAttack ? 9968 : 9967));
	}

}
