package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.EffectsManager;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class SpinolypCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { "Spinolyp" };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		switch (Utils.random(2)) {
			case 0:
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				Projectile projectile = World.sendProjectileNew(npc, target, 2705, 34, 16, 35, 2, 10, 0);
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
				break;
			case 1:
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				projectile = World.sendProjectileNew(npc, target, 473, 34, 16, 35, 2, 10, 0);
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, target)));
				break;
		}
		if (Utils.random(10) == 0)
			EffectsManager.makePoisoned(target, 68);
		return npc.getAttackSpeed();
	}
}
