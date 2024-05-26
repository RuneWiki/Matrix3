package com.rs.game.npc.combat.impl;

import java.util.ArrayList;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.NewForceMovement;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.others.WildyWyrm;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class WildyWyrmCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 3334 };
	}

	public static void attackMageTarget(final WorldTile tile, final List<Player> arrayList, Entity fromEntity, final NPC npc, Entity t, final int projectile, final int gfx, final int damage) {
		if (damage < 20)
			return;
		final Entity target = t == null ? KalphiteQueenCombat.getTarget(arrayList, fromEntity, npc) : t;
		if (target == null)
			return;

		if (target instanceof Player)
			arrayList.add((Player) target);
		final Projectile proj = World.sendProjectileNew(fromEntity, target, projectile, fromEntity == npc ? 100 : 20, 30, 30, 3, 0, 0);
		int endTime = Utils.projectileTimeToCycles(proj.getEndTime()) - 1;
		delayHit(npc, endTime, target, getMagicHit(npc, damage));
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				target.setNextGraphics(new Graphics(gfx, 0, 100));
				attackMageTarget(tile, arrayList, target, npc, null, projectile, gfx, damage / 2);
			}
		}, endTime);
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();

		final List<Entity> possibleTargets = npc.getPossibleTargets();
		int size = npc.getSize();
		for (Entity t : possibleTargets) {
			if (Utils.colides(t.getX(), t.getY(), t.getSize(), npc.getX(), npc.getY(), size))
				delayHit(npc, 0, t, getRegularHit(npc, Utils.random(500) + 600));
		}

		if (npc instanceof WildyWyrm && Utils.random(10) == 0) {
			((WildyWyrm) npc).emerge();
			final WorldTile to = npc.getMiddleWorldTile();
			for (final Entity t : possibleTargets) {
				if (t.withinDistance(target, 1)) {
					//	t.setNextAnimation(new Animation(14388));
					//t.setNextGraphics(new Graphics(2767));
					t.setNextForceMovement(new NewForceMovement(t, 0, to, 2, Utils.getAngle(to.getX() - t.getX(), to.getY() - t.getY())));
					t.setBoundDelay(2);
					t.resetWalkSteps();
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							t.setNextWorldTile(to);
							
						}
					}, 1);
				}
			}
			return npc.getAttackSpeed();
		}
		int attackStyle = Utils.random(Utils.isOnRange(npc.getX(), npc.getY(), size, target.getX(), target.getY(), target.getSize(), 0) ? 3 : 2);
		switch (attackStyle) {
			case 0: //magic
				npc.setNextAnimation(new Animation(12794));
				attackMageTarget(new WorldTile(target), new ArrayList<Player>(), npc, npc, target, 2731, 2738, Utils.random(300) + 300);
				break;
			case 1://range
				final WorldTile tile = new WorldTile(target);
				npc.setNextAnimation(new Animation(12794));
				final Projectile projectile = World.sendProjectileNew(npc, target, 2735, 100, 25, 35, 3, 10, 0);
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						for (Entity t : possibleTargets) {
							if (!t.withinDistance(tile, 5))
								continue;
							Projectile p = World.sendProjectileNew(tile, t, 2735, 0, 16, projectile.getEndTime(), 2, 10, 0);
							delayHit(npc, Utils.projectileTimeToCycles(p.getEndTime()) - 1, t, getRangeHit(npc, Utils.random(1001) + 3000));
						}
					}
				});
				break;
			default: //melee
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				for (Entity t : possibleTargets) {
					if (t.withinDistance(target, 1))
						delayHit(npc, 0, t, getMeleeHit(npc, getMaxHit(npc, 2000, NPCCombatDefinitions.MELEE, t)));
				}
				break;
		}
		return npc.getAttackSpeed();
	}

}
