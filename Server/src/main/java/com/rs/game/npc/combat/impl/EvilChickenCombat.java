package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class EvilChickenCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ "Evil Chicken" };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		if(!Utils.isOnRange(npc, target, 0))
			return 0;
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		switch (Utils.random(5)) {
		case 0:
			npc.setNextForceTalk(new ForceTalk("Bwuk"));
			break;
		case 1:
			npc.setNextForceTalk(new ForceTalk("Bwuk bwuk bwuk"));
			break;
		case 2:
			String name = "";
			if (target instanceof Player)
				name = ((Player) target).getDisplayName();
			npc.setNextForceTalk(new ForceTalk("Flee from me, " + name));
			break;
		case 3:
			name = "";
			if (target instanceof Player)
				name = ((Player) target).getDisplayName();
			npc.setNextForceTalk(new ForceTalk("Begone, " + name));
			break;
		case 4:
			npc.setNextForceTalk(new ForceTalk("Bwaaaauuuuk bwuk bwuk"));
			break;
		case 5:
			npc.setNextForceTalk(new ForceTalk("MUAHAHAHAHAAA!"));
			break;
		}
		target.setNextGraphics(new Graphics(337));
		delayHit(npc, 0, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
		return npc.getAttackSpeed();
	}
}
