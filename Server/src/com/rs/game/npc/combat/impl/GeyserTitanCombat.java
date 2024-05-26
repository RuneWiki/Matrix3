package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.utils.Utils;

public class GeyserTitanCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 7340, 7339 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		boolean isDistanced = !Utils.isOnRange(npc, target, 0);
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		if (usingSpecial) {// priority over regular attack
			npc.setNextAnimation(new Animation(7883));
			npc.setNextGraphics(new Graphics(1373));
			int endTime = Utils.projectileTimeToCycles(World.sendProjectileNew(npc, target, 1376, 34, 16, 35, 2, 10, 0).getEndTime());
			if (isDistanced) {// range hit
				if (Utils.random(2) == 0)
					delayHit(npc, endTime, target, getRangeHit(npc, getMaxHit(npc, NPCCombatDefinitions.RANGE, target)));
				else
					delayHit(npc, endTime, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
			}
			else
				// melee hit
				delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
		}
		else {
			if (isDistanced) {// range
				npc.setNextAnimation(new Animation(7883));
				npc.setNextGraphics(new Graphics(1375));
				delayHit(npc, Utils.projectileTimeToCycles(World.sendProjectileNew(npc, target, 1374, 34, 16, 35, 3, 10, 0).getEndTime()), target, getRangeHit(npc, (int) (getMaxHit(npc, NPCCombatDefinitions.RANGE, target) * 0.85)));
			}
			else {// melee
				npc.setNextAnimation(new Animation(7879));
				delayHit(npc, 0, target, getMeleeHit(npc, (int) (getMaxHit(npc, NPCCombatDefinitions.MELEE, target) * 0.85)));
			}
		}
		return npc.getAttackSpeed();
	}
}
