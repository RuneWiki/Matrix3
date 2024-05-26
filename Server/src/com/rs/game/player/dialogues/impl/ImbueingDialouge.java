package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.content.AccessorySmithing;
import com.rs.game.player.dialogues.Dialogue;

public class ImbueingDialouge extends Dialogue {

	@Override
	public void start() {
		sendDialogue("Warning. Imbueing rings costs a reasonable amount of money [3m for donators : 1.5m for extremes].");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			stage = 0;
			sendOptionsDialogue("Would you like to imbue your ring?", "Yes.", "No.");
		} else if (stage == 0) {
			if (componentId == OPTION_1) {
				int itemId = (int) this.parameters[0];
				if (player.getInventory().getCoinsAmount() >= (player.isExtremeDonator() ? 1500000 : 3000000)) {
					player.getInventory().removeItemMoneyPouch(new Item(995, player.isExtremeDonator() ? 1500000 : 3000000));
					player.getInventory().deleteItem(itemId, 1);
					player.getInventory().addItemDrop(AccessorySmithing.getImbuedId(itemId), 1);
					sendDialogue("You dip the ring into the fountain and it begins to brightly shimmer.");
				} else
					sendDialogue("You need at least " + (player.isExtremeDonator() ? "1.5 million" : "three million") + " coins in order to imbue a ring.");
				stage = 1;
			} else
				end();
		} else if (stage == 1) {
			end();
		}
	}

	@Override
	public void finish() {

	}
}
