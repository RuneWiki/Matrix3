package com.rs.game.npc.combat.impl.dung;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.WorldGorgerShukarhazh;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.utils.Utils;

public class WorldGorgerShukarhazhCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 12478 };
	}

	@Override
	public int attack(NPC npc, final Entity target) {
		final WorldGorgerShukarhazh boss = (WorldGorgerShukarhazh) npc;
		final DungeonManager manager = boss.getManager();

		boolean smash = false;
		for (Player player : manager.getParty().getTeam()) {
			if (Utils.colides(player.getX(), player.getY(), player.getSize(), npc.getX(), npc.getY(), npc.getSize())) {
				smash = true;
				player.getPackets().sendGameMessage("The creature crushes you as you move underneath it.");
				delayHit(npc, 0, player, getRegularHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, player)));
			}
		}
		if (smash) {
			npc.setNextAnimation(new Animation(14894));
			return 6;
		}

		if (Utils.random(manager.getParty().getTeam().size() > 1 ? 20 : 5) == 0 && Utils.isOnRange(npc.getX(), npc.getY(), npc.getSize(), target.getX(), target.getY(), target.getSize(), 0)) {
			npc.setNextAnimation(new Animation(14892));
			delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
		} else {
			npc.setNextAnimation(new Animation(14893));
			npc.setNextGraphics(new Graphics(2846, 0, 100));
			target.setNextGraphics(new Graphics(2848, 75, 100));
			delayHit(npc, 2, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
		}
		return 6;
	}
}
