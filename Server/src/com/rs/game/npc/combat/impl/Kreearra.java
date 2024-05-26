package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class Kreearra extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 6222 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		if (!npc.isUnderCombat()) {
			npc.setNextAnimation(new Animation(17396));
			delayHit(npc, 1, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
			return npc.getAttackSpeed();
		}
		npc.setNextAnimation(new Animation(17397));
		boolean isMagic = Utils.random(2) == 0;
		for (Entity t : npc.getPossibleTargets()) {
			Projectile projectile = World.sendProjectileNew(npc, t, isMagic ? 3388 : 3389, 41, 16, 30, 2, 0, 0);
			if (isMagic)
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, t, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, t)));
			else {
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, t, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, t)));
				for (int c = 0; c < 10; c++) {
					int dir = Utils.random(Utils.DIRECTION_DELTA_X.length);
					if (World.checkWalkStep(target.getPlane(), target.getX(), target.getY(), dir, 1)) {
						t.setNextWorldTile(new WorldTile(target.getX() + Utils.DIRECTION_DELTA_X[dir], target.getY() + Utils.DIRECTION_DELTA_Y[dir], target.getPlane()));
						break;
					}
				}
			}
		}
		return npc.getAttackSpeed();
	}
}
