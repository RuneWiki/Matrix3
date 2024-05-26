package com.rs.game.player.actions.sawmill;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Action;

public class StackOfLogs extends Action {

	private int amount;

	public StackOfLogs(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean start(Player player) {
		if (process(player)) {
			player.getPackets().sendGameMessage((amount == 1 ? "You select a suitable log" : "You start selecting suitable logs") + " from the pile.", true);
			return true;
		}
		return false;
	}

	@Override
	public boolean process(Player player) {
		if (!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendGameMessage("Your inventory is full.");
			return false;
		}
		return amount > 0;
	}

	@Override
	public int processWithDelay(Player player) {
		player.setNextAnimation(new Animation(8908));
		player.getInventory().addItem(new Item(1511));
		return amount-- == 1 ? -1 : 1;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}

}
