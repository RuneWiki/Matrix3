package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class LivingRockStrickerCombat extends CombatScript {

	@Override
	public Object[] getKeys() {

		return new Object[]
		{ 8833 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		if (!Utils.isOnRange(target, npc, 0)) {
			// TODO add projectile
			npc.setNextAnimation(new Animation(12196));
			delayHit(npc, 1, target, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, target)));
		} else {
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, 84, NPCCombatDefinitions.MELEE, target)));
			return npc.getAttackSpeed();
		}
		return npc.getAttackSpeed();
	}
}
