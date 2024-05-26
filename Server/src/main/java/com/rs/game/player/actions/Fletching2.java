package com.rs.game.player.actions;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

public class Fletching2 extends Action {

	private static final int LEVEL_OPCODE = 2645, BASE_OPCODE = 2655,
			PERMENANT_SECONDARY_OPCODE = 2650, REMOVEABLE_SECONDARY_OPCODE = 2656, EXPERIENCE_OPCODE = 2697,
			CREATION_COUNT_OPCODE = 2653;

	private static final int[] PRODUCTS = {2861, 52, 53, 54, 60, 64, 68, 72, 806, 839, 841, 877, 879, 882, 2864, 2866, 9174, 9446, 9450, 10158, 16867, 16427, 17742, 25982, 25983, 25984, 25985, 25986, 25987, 25988, 25989, 25990, 17747, 21364, 21582, 24122, 29736, 30574 };

	private final FletchData data;
	private int product, cycles, incrementPerCycle, level;
	private double experience;

	public Fletching2(FletchData data, int product, int cycles) {
		this.data = data;
		this.product = product;
		this.cycles = cycles;
		ItemDefinitions defs = ItemDefinitions.getItemDefinitions(product);
		this.incrementPerCycle = defs.getCSOpcode(CREATION_COUNT_OPCODE);
		this.level = defs.getCSOpcode(LEVEL_OPCODE);
		this.experience = defs.getCSOpcode(EXPERIENCE_OPCODE) / 10.0;
	}

	public boolean checkAll(Player player) {
		if (player.getSkills().getLevel(Skills.FLETCHING) < level)
			return false;
		else if (!player.getSlayerManager().hasLearnedBroad()) {
			if (product == 4160 || product == 13280) {
				player.getPackets().sendGameMessage("You lack the knowledge to create a broad accessory, perhaps a Slayer Master could assist you.");
				return false;
			}
		}
		return continueNextCycle(player);
	}

	@Override
	public boolean start(Player player) {
		if (!checkAll(player))
			return false;
		return true;
	}

	@Override
	public boolean process(Player player) {
		return continueNextCycle(player) && cycles > 0;
	}

	private boolean continueNextCycle(Player player) {
		return player.getInventory().containsItemToolBelt(data.getSecondary()) && player.getInventory().containsItem(data.getNode(), 1);
	}

	@Override
	public int processWithDelay(Player player) {
		cycles--;
		boolean isShaft = product == 52;
		if (incrementPerCycle > 0) {
			if (data.canDeleteSecondary()) {
				int nodeCount = player.getInventory().getAmountOf(data.getNode());
				int secondaryCount = player.getInventory().getAmountOf(data.getSecondary());
				if (!isShaft) {
					if (nodeCount < incrementPerCycle)
						incrementPerCycle = nodeCount;
					if (secondaryCount < incrementPerCycle)
						incrementPerCycle = secondaryCount;
				}
			}
		} else
			incrementPerCycle = 1;
		if (data.canDeleteSecondary())
			player.getInventory().deleteItem(data.getSecondary(), incrementPerCycle);
		player.getInventory().deleteItem(data.getNode(), isShaft ? 1 : incrementPerCycle);
		player.getSkills().addXp(Skills.FLETCHING, experience * incrementPerCycle);
		player.getInventory().addItem(product, incrementPerCycle * (incrementPerCycle != 1 ? Settings.getCraftRate() : incrementPerCycle));

		//You carefully cut the wood into a Shieldbow (u).
		//You add a string to the bow.

		//TODO animation and message display.
		return 4;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}

	public static FletchData isFletching(int material) {
		for (int product : PRODUCTS) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(product);
			int secondary = defs.getCSOpcode(PERMENANT_SECONDARY_OPCODE);
			if (secondary == 0)
				continue;
			int nodeId = defs.getCSOpcode(BASE_OPCODE);
			if (nodeId == material)
				return new FletchData(product, nodeId, secondary, secondary == 0);
		}
		return null;
	}

	public static FletchData isFletchingCombination(Item node, Item secondary) {
		for (int product : PRODUCTS) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(product);
			int nodeId = defs.getCSOpcode(BASE_OPCODE);
			int fixedSecondaryId = defs.getCSOpcode(PERMENANT_SECONDARY_OPCODE);
			int removeableSecondaryId = defs.getCSOpcode(REMOVEABLE_SECONDARY_OPCODE);
			if (fixedSecondaryId == 0 && removeableSecondaryId == 0)
				removeableSecondaryId = 314;//Feather isn't in cache idk why
			if (node.getId() == nodeId && (secondary.getId() == fixedSecondaryId || secondary.getId() == removeableSecondaryId))
				return new FletchData(product, nodeId, secondary.getId(), fixedSecondaryId == 0);
			else if ((node.getId() == fixedSecondaryId || node.getId() == removeableSecondaryId) && secondary.getId() == nodeId)
				return new FletchData(product, secondary.getId(), nodeId, fixedSecondaryId == 0);
		}
		return null;
	}

	public static class FletchData {
		private int product;
		private final int node;
		private final int secondary;
		private final boolean deleteSecondary;

		public FletchData(int product, int node, int secondary, boolean deleteSecondary) {
			System.out.println(product);
			this.product = product;
			this.node = node;
			this.secondary = secondary;
			this.deleteSecondary = deleteSecondary;
		}

		public int getProduct() {
			return product;
		}

		public int getNode() {
			return node;
		}

		public int getSecondary() {
			return secondary;
		}

		public boolean canDeleteSecondary() {
			return deleteSecondary;
		}
	}
}
