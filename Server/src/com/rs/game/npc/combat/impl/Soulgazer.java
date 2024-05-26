package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.DungeonSlayerNPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.utils.Utils;

public class Soulgazer extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 10705 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		DungeonSlayerNPC dungeonNPC = (DungeonSlayerNPC) npc;
		DungeonManager manager = dungeonNPC.getManager();
		if (manager.isDestroyed())
			return -1;
		npc.setNextAnimation(new Animation(13779));
		for (Player player : manager.getParty().getTeam()) {
			if (!player.withinDistance(npc, 8) || !npc.clipedProjectile(target, true))
				continue;
			Projectile projectile = World.sendProjectileNew(npc, target, 2615, 41, 16, 35, 2, 10, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
		}
		return npc.getAttackSpeed();
	}
}
