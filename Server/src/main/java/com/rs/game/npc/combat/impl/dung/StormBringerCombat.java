package com.rs.game.npc.combat.impl.dung;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class StormBringerCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 11126, 11128, 11130, 11132, 11134, 11136, 11138, 11140, 11142, 11144, 11146 };
	}

	@Override
	public int attack(NPC npc, final Entity target) {
		NPCCombatDefinitions def = npc.getCombatDefinitions();
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		int tier = (npc.getId() - 11126) / 2;

		int damage = 0;
		if (usingSpecial) {
			damage = getMaxHit(npc, (int) (npc.getMaxHit(NPCCombatDefinitions.MAGE) * (1.05 * tier)), NPCCombatDefinitions.MAGE, target);
			if (Utils.random(11 - tier) == 0)
				target.setBoundDelay(8); // Five seconds cannot move.
		} else
			damage = getMaxHit(npc, NPCCombatDefinitions.MAGE, target);
		npc.setNextGraphics(new Graphics(2591));
		npc.setNextAnimation(new Animation(13620));
		World.sendProjectile(npc, target, 2592, 41, 16, 41, 35, 16, 0);//2593
		delayHit(npc, 2, target, getRangeHit(npc, damage));
		if (damage > 0) {
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					target.setNextGraphics(new Graphics(2593));
				}
			}, 2);
		}
		return npc.getAttackSpeed();
	}
}
