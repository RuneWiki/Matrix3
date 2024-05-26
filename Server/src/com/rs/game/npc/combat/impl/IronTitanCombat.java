package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.utils.Utils;

public class IronTitanCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 7376, 7375 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		boolean isDistanced = !Utils.isOnRange(npc, target, 0);
		if (usingSpecial) {// priority over regular attack
			npc.setNextAnimation(new Animation(7954));
			npc.setNextGraphics(new Graphics(1450));
			if (isDistanced)// range hit
				delayHit(npc, 2, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)), getMagicHit(npc, getMaxHit(npc, 220, NPCCombatDefinitions.MAGE, target)), getMagicHit(npc, getMaxHit(npc, 220, NPCCombatDefinitions.MAGE, target)));
			else // melee hit
				delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)), getMeleeHit(npc, getMaxHit(npc, 230, NPCCombatDefinitions.MELEE, target)), getMeleeHit(npc, getMaxHit(npc, 230, NPCCombatDefinitions.MELEE, target)));
		} else {
			if (isDistanced) {
				npc.setNextAnimation(new Animation(7694));
				Projectile projectile = World.sendProjectileNew(npc, target, 1452, 34, 16, 36, 2, 16, 0);
				delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, (int) (getMaxHit(npc, NPCCombatDefinitions.MAGE, target) * 0.85)));
			} else {// melee
				npc.setNextAnimation(new Animation(7946));
				npc.setNextGraphics(new Graphics(1447));
				delayHit(npc, 0, target, getMeleeHit(npc, (int) (getMaxHit(npc, NPCCombatDefinitions.MELEE, target) * 0.85)));
			}
		}
		return npc.getAttackSpeed();
	}

}
