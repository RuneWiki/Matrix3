package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.Combat;
import com.rs.game.player.content.DragonfireShield;
import com.rs.utils.Utils;

public class MetalDragonCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ "Bronze dragon", "Iron dragon", "Steel dragon" };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		NPCCombatDefinitions defs = npc.getCombatDefinitions();
		if (Utils.isOnRange(npc, target, 0) && Utils.random(2) == 0) {
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, NPCCombatDefinitions.MELEE, target)));
		} else {
			int damage = getMaxHit(npc, NPCCombatDefinitions.MAGE, target);
			if (damage > 200 && target instanceof Player) {
				Player player = (Player) target;
				//Rest should all be types of dragon-fire.

				boolean hasSuperPot = player.getEffectsManager().hasActiveEffect(EffectType.SUPER_FIRE_IMMUNITY);
				boolean hasRegularPot = player.getEffectsManager().hasActiveEffect(EffectType.FIRE_IMMUNITY);
				boolean hasShield = Combat.hasAntiDragProtection(target);
				if (hasSuperPot) {
					damage = 0;
					player.getPackets().sendGameMessage("Your potion fully protects you from the dragon's fiery breath.");
				} else {
					if (hasRegularPot)
						damage *= 0.5;
					if (hasShield) {
						player.getPackets().sendGameMessage("Your shield absorbs some of the dragon's fiery breath!");
						damage = hasRegularPot ? 0 : damage / 2;
					}
				}
				DragonfireShield.chargeDFS(player, false);
			}
			npc.setNextAnimation(new Animation(13160));
			Projectile projectile = World.sendProjectileNew(npc, target, 2464, 28, 16, 35, 2, 16, 0);
			delayHit(npc, Utils.projectileTimeToCycles(projectile.getEndTime()) - 1, target, getRegularHit(npc, damage));
		}
		return npc.getAttackSpeed();
	}

}
