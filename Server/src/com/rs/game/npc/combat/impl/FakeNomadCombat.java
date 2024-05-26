package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class FakeNomadCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 8529 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		npc.setNextAnimation(new Animation(12697));
		int hit = getMaxHit(npc, NPCCombatDefinitions.MAGE, target);
		Projectile projectile = World.sendProjectileNew(npc, target, 1657, 30, 25, 30, 4, 0, 0);
		delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getRegularHit(npc, hit));
		if (hit == 0)
			target.setNextGraphics(new Graphics(2278, projectile.getEndTime(), 100));
		return npc.getAttackSpeed();
	}
}
