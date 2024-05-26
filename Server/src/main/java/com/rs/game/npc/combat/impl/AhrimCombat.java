package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class AhrimCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 2025 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		int damage = getMaxHit(npc, NPCCombatDefinitions.MAGE, target);
		if (damage != 0 && target instanceof Player && Utils.random(6) == 0) {
			target.setNextGraphics(new Graphics(400, 0, 100));
			Player targetPlayer = (Player) target;
			int currentLevel = targetPlayer.getSkills().getLevel(Skills.STRENGTH);
			targetPlayer.getSkills().set(Skills.STRENGTH, currentLevel < 5 ? 0 : currentLevel - 5);
		}
		Projectile projectile = World.sendProjectileNew(target, npc, defs.getAttackProjectile(), 41, 16, 35, 2, 16, Utils.random(5));
		npc.setNextGraphics(new Graphics(defs.getAttackGfx()));
		delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()), target, getMagicHit(npc, damage));
		return npc.getAttackSpeed();
	}
}
