package com.rs.game.player.actions.mining;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public abstract class MiningBase extends Action {

	public enum PickAxeDefinitions {

		NOVITE(16295, 1, 13074, 1),

		BATHUS(16297, 10, 13075, 3),

		MARMAROS(16299, 20, 13076, 5),

		KRATONITE(16301, 30, 13077, 7),

		FRACTITE(16303, 40, 13078, 10),

		ZEPHYRIUM(16305, 50, 13079, 12),

		ARGONITE(16307, 60, 13080, 13),

		KATAGON(16309, 70, 13081, 15),

		GORGONITE(16311, 80, 13082, 16),

		PROMETHIUM(16313, 90, 13083, 17),

		PRIMAL(16315, 99, 13084, 20),

		BRONZE(1265, 1, 625, 1),

		IRON(1267, 1, 626, 2),

		STEEL(1269, 6, 627, 3),

		MITHRIL(1273, 21, 629, 5),

		ADAMANT(1271, 31, 628, 7),

		RUNE(1275, 41, 624, 10),

		DRAGON(15259, 61, 12189, 13),

		ADZ(13661, 61, 10222, 13);

		private int pickAxeId, levelRequried, animationId, pickAxeTime;

		private PickAxeDefinitions(int pickAxeId, int levelRequried, int animationId, int pickAxeTime) {
			this.pickAxeId = pickAxeId;
			this.levelRequried = levelRequried;
			this.animationId = animationId;
			this.pickAxeTime = pickAxeTime;
		}

		public int getPickAxeId() {
			return pickAxeId;
		}

		public int getLevelRequried() {
			return levelRequried;
		}

		public int getAnimationId() {
			return animationId;
		}

		public int getPickAxeTime() {
			return pickAxeTime;
		}
	}

	public static void propect(final Player player, final String endMessage) {
		propect(player, "You examine the rock for ores....", endMessage);
	}

	public static void propect(final Player player, String startMessage, final String endMessage) {
		player.getPackets().sendGameMessage(startMessage, true);
		player.lock(5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				player.getPackets().sendGameMessage(endMessage);
			}
		}, 4);
	}

	public static PickAxeDefinitions getPickAxeDefinitions(Player player, boolean dungeoneering) {
		for (int i = dungeoneering ? 10 : PickAxeDefinitions.values().length - 1; i >= (dungeoneering ? 0 : 11); i--) { //from best to worst
			PickAxeDefinitions def = PickAxeDefinitions.values()[i];
			if (player.getInventory().containsItemToolBelt(def.pickAxeId) || player.getEquipment().getWeaponId() == def.pickAxeId) {
				if (player.getSkills().getLevel(Skills.MINING) >= def.levelRequried)
					return def;
			}
		}
		return null;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}
}
