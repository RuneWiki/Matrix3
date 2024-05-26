package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.others.Nechryael;
import com.rs.utils.Utils;

public class NechryaelCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] {"Nechryael"};
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Nechryael n = (Nechryael) npc;
		if (Utils.random(10) == 0 && !n.hasActiveSpawns())
			n.summonDeathSpawns();
		npc.setNextAnimation(new Animation(npc.getCombatDefinitions().getAttackEmote()));
		delayHit(npc, 0, target, getMagicHit(npc, getMaxHit(npc, npc.getAttackStyle(), target)));
		return npc.getAttackSpeed();
	}
}
