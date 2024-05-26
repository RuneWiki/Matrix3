package com.rs.game.npc.combat.impl.dung;

import java.util.LinkedList;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.NecroLord;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class NecroLordCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[]
		{ 11737 };
	}

	@Override
	public int attack(NPC npc, final Entity target) {
		final NecroLord boss = (NecroLord) npc;

		if (Utils.random(10) == 0) {
			final int skeletonCount = boss.getManager().getParty().getTeam().size();
			final List<WorldTile> projectileTile = new LinkedList<WorldTile>();
			WorldTasksManager.schedule(new WorldTask() {
				int cycles;

				@Override
				public void run() {
					cycles++;

					if (cycles == 2) {
						for (int i = 0; i < skeletonCount; i++) {
							WorldTile tile = Utils.getFreeTile(boss.getManager().getTile(boss.getReference(), Utils.random(2) == 0 ? 5 : 10, 5), 4);
							projectileTile.add(tile);
							World.sendProjectile(boss, tile, 2590, 65, 0, 30, 0, 16, 0);
						}
					} else if (cycles == 4) {
						for (WorldTile tile : projectileTile)
							boss.addSkeleton(tile);
						stop();
						return;
					}
				}
			}, 0, 0);
		}

		final int attack = Utils.random(4);
		switch (attack) {
		case 0://main attack
		case 1:
			npc.setNextAnimation(new Animation(14209));
			npc.setNextGraphics(new Graphics(2716));
			World.sendProjectile(npc, target, 2721, 38, 18, 50, 50, 0, 0);
			delayHit(npc, 1, target, getMagicHit(npc, getMaxHit(npc, NPCCombatDefinitions.MAGE, target)));
			target.setNextGraphics(new Graphics(2726, 75, 80));
			break;
		case 2:
		case 3:
			final WorldTile tile = new WorldTile(target);
			npc.setNextAnimation(new Animation(attack == 2 ? 710 : 729));
			npc.setNextGraphics(new Graphics(attack == 2 ? 177 : 167, 0, 65));
			World.sendProjectile(npc, tile, attack == 2 ? 178 : 168, 40, 18, 55, 70, 5, 0);
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					for (Entity t : boss.getPossibleTargets()) {
						int damage = getMaxHit(boss, boss.getMaxHit(), NPCCombatDefinitions.MAGE, t);
						if (!t.withinDistance(tile, 1))
							continue;
						if (damage > 0) {
							if (attack == 2)
								t.setBoundDelay(8);
							else {
								if (t instanceof Player) {
									Player p2 = (Player) t;
									p2.getPackets().sendGameMessage("You feel weary.");
									p2.setRunEnergy((int) (p2.getRunEnergy() * .5));
								}
								t.applyHit(new Hit(boss, Utils.random(boss.getMaxHit()) + 1, HitLook.MAGIC_DAMAGE));
							}
							t.setNextGraphics(new Graphics(attack == 2 ? 179 : 169, 60, 65));
						}
					}
				}
			}, 1);

			break;
		}
		return Utils.random(2) == 0 ? 4 : 5;
	}
}
