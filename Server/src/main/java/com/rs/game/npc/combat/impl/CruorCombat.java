package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class CruorCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 13453 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		npc.setNextGraphics(new Graphics(3354));
		for (final Entity t : ZarosGodwars.nex.getPossibleTargets()) {
			Projectile projectile = World.sendProjectileNew(npc, t, 374, 41, 25, 20, 3, 15, Utils.random(5));
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()), t, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, t)));
			t.setNextGraphics(new Graphics(375, projectile.getEndTime(), 0));
		}
		return npc.getAttackSpeed();
	}
}