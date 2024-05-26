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

public class MinotaurCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 6854, 6853, 6856, 6855, 6858, 6857, 6860, 6859, 6862, 6861, 6864, 6863 };
	}

	@Override
	public int attack(final NPC npc, Entity target) {
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		if (usingSpecial) {// priority over regular attack
			familiar.submitSpecial(familiar.getOwner());
			npc.setNextAnimation(new Animation(8026));
			npc.setNextGraphics(new Graphics(1496));

			Projectile projectile = World.sendProjectileNew(npc, target, 1497, 34, 16, 35, 2, 16, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
			npc.setNextGraphics(new Graphics(1408, projectile.getEndTime(), 0));
		}
		else {
			npc.setNextAnimation(new Animation(8024));
			delayHit(npc, 1, target, getMagicHit(npc, (int) (getMaxHit(npc, NPCCombatDefinitions.MAGE, target) * 0.85)));
		}
		return npc.getAttackSpeed();
	}
}
