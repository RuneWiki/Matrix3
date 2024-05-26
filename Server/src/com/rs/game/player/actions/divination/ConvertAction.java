package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.utils.Utils;

public class ConvertAction extends Action {

	// inter cs 357
	private static final double[] EXPERIENCE = { 45.0D, 42.0D, 38.0D, 35.0D, 32.0D, 25.0D,
		19.0D, 12.0D, 7.0D, 5.0D, 4.0D, 3.0D };
	private static final int[] MEMORIES = {
		/*Enriched Memories*/29406, 29405, 29404, 29403, 29402, 29401, 29400, 29399, 29398, 29397, 29396,
		/*Regular Memories*/29395, 29394, 29393, 29392, 29391, 29390, 29389, 29388, 29387, 29386, 29385, 29384 };
	private static final int[] ENERGY = {
		29324,29323, 29322, 29321, 29320, 29319, 29318, 29317, 29316, 29315, 29314, 29313,
	};

	private int type, nextMemory;
	private boolean enriched;

	public ConvertAction(int type) {
		this.type = type;
	}

	@Override
	public boolean start(Player player) {
		player.getInterfaceManager().removeCentralInterface();
		checkAvailableMemory(player);
		return nextMemory != -1;
	}

	@Override
	public boolean process(Player player) {
		checkAvailableMemory(player);
		return nextMemory != -1;
	}

	@Override
	public int processWithDelay(Player player) {
		Animation convertAnim = new Animation(type == 6 ? 21234 : 21232);
		Graphics convertGFX = new Graphics(type == 1 ? 4239 : 4240);
		double exp = type == 1 ? 1 : EXPERIENCE[nextMemory];
		if (type == 7) // Both energy and memory
			exp *= 1.25;
		if (enriched) // Enriched double's all exp gain.
			exp *= 2;

		if (type == 1 || type == 7) {
			int energyId = getEnergyForMemory(nextMemory);
			int energyAmount = type == 7 ? 5 : Utils.random(2, 5);
			if (enriched)
				energyAmount *= 2;
			if (type == 7 && !player.getInventory().containsItem(energyId, energyAmount)) {
				type = 6;
				return 0;
			}
			Item energy = new Item(energyId, energyAmount);
			if (type == 1)
				player.getInventory().addItem(energy);
			else
				player.getInventory().deleteItem(energy);
		}

		if (type != 1)
			player.getInventory().deleteItem(new Item(MEMORIES[nextMemory], 1));

		player.setNextAnimation(convertAnim);
		player.setNextGraphics(convertGFX);
		player.getSkills().addXp(Skills.DIVINATION, exp);
		player.getPackets().sendGameMessage(type == 1 ? "You convert the memory into energy."
				: type == 6 ? "You convert the memory into experience."
						: "You convert the memory and energy into an enhanced amount of experience.");
		return 3;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}

	public static int getNextMemory(Player player) {
		for (int nextMemory = 0; nextMemory < MEMORIES.length; nextMemory++) {
			if (player.getInventory().containsItem(MEMORIES[nextMemory], 1))
				return nextMemory;
		}
		return -1;
	}
	
	public static int getEnergyForMemory(int nextMemory) {
		return ENERGY[nextMemory >= 11 ? nextMemory - 11 : nextMemory];
	}

	private void checkAvailableMemory(Player player) {
		nextMemory = getNextMemory(player);
		enriched = nextMemory < 11;
	}
}
