package com.rs.game.npc.godwars.zaros;

import java.util.ArrayList;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class ZarosMinion extends NPC {

	/**
	 * We can change this later if it's too difficult.
	 */
	private static final int CAP_BONUS = 200;

	//melee, melee, melee, magic, range
	private static final int[][] BONUS_IDXS =
	{
	{ 5, 6, 7 },
	{ 9 },
	{},
	{ 8 } };

	public ZarosMinion(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public ArrayList<Entity> getPossibleTargets() {
		ArrayList<Entity> targets = getPossibleTargets(true, true);
		ArrayList<Entity> targetsCleaned = new ArrayList<Entity>();
		for (Entity t : targets) {
			if (t instanceof ZarosMinion || t instanceof Familiar || hasSuperiourBonuses(t))
				continue;
			targetsCleaned.add(t);
		}
		return targetsCleaned;
	}

	private boolean hasSuperiourBonuses(Entity t) {
		if (!(t instanceof Player))
			return false;
		Player player = (Player) t;
		for (int bonus : BONUS_IDXS[getId() - 13456]) {
			if (player.getCombatDefinitions().getBonuses()[bonus] >= (bonus == 9 ? 100 : CAP_BONUS))
				return true;
		}
		return false;
	}

	@Override
	public void sendDeath(final Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		getCombat().removeTarget();
		setNextAnimation(null);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop >= defs.getDeathDelay()) {
					if (source instanceof Player) {
						Player player = (Player) source;
						Controller controler = player.getControlerManager().getControler();
						if (controler != null && controler instanceof GodWars) {
							GodWars godControler = (GodWars) controler;
							godControler.incrementKillCount(4);
						}
					}
					giveXP();
					drop();
					reset();
					setLocation(getRespawnTile());
					finish();
					if (!isSpawned())
						setRespawnTask();
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	public static boolean isNexArmour(String name) {
		return name.contains("pernix") || name.contains("torva") || name.contains("virtus") || name.contains("zaryte");
	}
}