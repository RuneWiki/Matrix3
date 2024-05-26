package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class DarkBeastCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 2783 };
	}

	@Override
	public int attack(NPC npc, final Entity target) {
		npc.setNextAnimation(new Animation(2731));
		if (Utils.isOnRange(target, npc, 0))
			delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, npc.getAttackStyle(), target)));
		else {
			Projectile projectile = World.sendProjectileNew(npc, target, 2181, 41, 16, 35, 3, 10, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
		}
		return npc.getAttackSpeed();
	}
}
