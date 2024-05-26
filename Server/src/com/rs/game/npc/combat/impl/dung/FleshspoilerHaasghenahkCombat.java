package com.rs.game.npc.combat.impl.dung;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.FleshspoilerHaasghenahk;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class FleshspoilerHaasghenahkCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 11925, 11895 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final FleshspoilerHaasghenahk boss = (FleshspoilerHaasghenahk) npc;

		for (Entity t : npc.getPossibleTargets()) {
			if (Utils.colides(t.getX(), t.getY(), t.getSize(), npc.getX(), npc.getY(), npc.getSize()))
				delayHit(npc, 0, t, getRegularHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, t)));
		}
		if (boss.isSecondStage())
			return 0;
		boolean magicOnly = boss.canUseMagicOnly();
		if (magicOnly || Utils.random(5) == 0) {
			if (magicOnly) {
				if (target instanceof Player) {
					Player player = (Player) target;
					if (player.getPrayer().isMageProtecting() && Utils.random(3) == 0)
						boss.setUseMagicOnly(false);
				}
			}
			npc.setNextAnimation(new Animation(14463));
			delayHit(npc, 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
		} else {
			npc.setNextAnimation(new Animation(13320));
			delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
		}
		return 6;
	}
}
