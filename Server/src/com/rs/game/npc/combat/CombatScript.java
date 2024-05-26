package com.rs.game.npc.combat;

import com.rs.game.EffectsManager;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombatNew;
import com.rs.game.player.content.Combat;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public abstract class CombatScript {

	/*
	 * Returns ids and names
	 */
	public abstract Object[] getKeys();

	/*
	 * Returns Move Delay
	 */
	public abstract int attack(NPC npc, Entity target);

	public static void delayHit(NPC npc, int delay, final Entity target, final Hit... hits) {
		npc.getCombat().addAttackedByDelay(target);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				for (Hit hit : hits) {
					NPC npc = (NPC) hit.getSource();
					if (npc.isDead() || npc.hasFinished() || target.isDead() || target.hasFinished())
						return;
					if (target.getEffectsManager().hasActiveEffect(EffectType.ANTICIPATION))
						hit.setDamage((int) (hit.getDamage() * 0.90));
					target.applyHit(hit);
					npc.getCombat().doDefenceEmote(target, hit);
					if (target instanceof Player) {
						Player p2 = (Player) target;
						p2.closeInterfaces();
						if (!npc.isCantSetTargetAutoRelatio() && p2.getCombatDefinitions().isAutoRelatie() && !p2.getActionManager().hasSkillWorking() && !p2.hasWalkSteps())
							p2.getActionManager().setAction(new PlayerCombatNew(npc));
					} else {
						NPC n = (NPC) target;
						if (!n.isUnderCombat() || n.canBeAttackedByAutoRelatie())
							n.setTarget(npc);
					}

				}
			}

		}, delay);
	}

	public static Hit getRangeHit(NPC npc, int damage) {
		return new Hit(npc, damage, HitLook.RANGE_DAMAGE);
	}

	public static Hit getMagicHit(NPC npc, int damage) {
		return new Hit(npc, damage, HitLook.MAGIC_DAMAGE);
	}

	public static Hit getRegularHit(NPC npc, int damage) {
		return new Hit(npc, damage, HitLook.REGULAR_DAMAGE);
	}

	public static Hit getMeleeHit(NPC npc, int damage) {
		return new Hit(npc, damage, HitLook.MELEE_DAMAGE);
	}

	public static int getMaxHit(NPC npc, int attackType, Entity target) {
		return getMaxHit(npc, npc.getMaxHit(attackType), attackType, target);
	}

	public static int getMaxHit(NPC npc, int maxHit, int attackType, Entity target) {
		double hitChance = Combat.getHitChance(npc, target, attackType, true);
		EffectsManager effects = target.getEffectsManager();
		if (effects.hasActiveEffect(EffectType.MODIFY_DAMAGE))
			maxHit *= (double) effects.getEffectForType(EffectType.MODIFY_DAMAGE).getArguments()[0];
		if (effects.hasActiveEffect(EffectType.PULVERISE))
			maxHit *= 0.75;
		if (hitChance < Utils.random(100))
			return 0;
		return (int) Utils.random(maxHit) + 1;
	}
}
