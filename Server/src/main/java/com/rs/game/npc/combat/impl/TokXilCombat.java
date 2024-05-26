package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class TokXilCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { "Tok-Xil", 15205 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int style = Utils.random(!Utils.isOnRange(npc, target, 0) ? 1 : 0, 2);
		switch (style) {
			case 0://MELEE
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
				break;
			case 1://MAGIC
				npc.setNextAnimation(new Animation(16132));
				Projectile projectile = World.sendProjectileNew(npc, target, 2993, 34, 16, 35, 2, 10, 0);
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
				break;
		}
		return npc.getAttackSpeed();
	}
}
