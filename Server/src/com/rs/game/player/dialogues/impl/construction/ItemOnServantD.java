package com.rs.game.player.dialogues.impl.construction;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.TemporaryAtributtes.Key;
import com.rs.game.minigames.Sawmill;
import com.rs.game.minigames.Sawmill.Plank;
import com.rs.game.npc.construction.ServantNPC;
import com.rs.game.player.content.construction.HouseConstants;
import com.rs.game.player.dialogues.Dialogue;

public class ItemOnServantD extends Dialogue {

	private ServantNPC servant;
	private int item;

	@Override
	public void start() {
		this.servant = (ServantNPC) parameters[0];
		item = (int) this.parameters[1];
		boolean procceed = false;
		for (int index = 0; index < HouseConstants.BANKABLE_ITEMS.length; index++) {
			for (int bankable : HouseConstants.BANKABLE_ITEMS[index]) {
				if (item == bankable) {
					procceed = true;
					break;
				}
			}
		}
		ItemDefinitions definition = ItemDefinitions.getItemDefinitions(item);
		final Plank plank = Sawmill.getPlankForLog(item);
		if (plank != null || definition.isNoted())
			procceed = true;
		if (!procceed) {
			end();
			return;
		}
		int paymentStage = player.getHouse().getPaymentStage();
		if (paymentStage == 1) {
			sendNPCDialogue(servant.getId(), NORMAL, "Excuse me, but before I can continue working you must pay my fee.");
			stage = 3;
		}
		String name = definition.getName().toLowerCase();

		if (definition.isNoted()) {
			sendOptionsDialogue("Un-cert this item?", "Un-cert " + name + ".", "Fetch another " + name + ".", "Bank", "Cancel");
			stage = 0;
		} else if ((boolean) this.parameters[2] && plank != null) {
			sendOptionsDialogue("Take this to the sawmill?", "Take it to the sawmill.", "Bank", "Cancel");
			stage = 2;
		} else {
			sendOptionsDialogue("Take this item to the bank?", "Fetch another " + name + ".", "Bank", "Cancel");
			stage = 1;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 0) {
			if (componentId == OPTION_1) {
				setFetchAttributes(2, "How many would you like to un-note?");
			} else if (componentId == OPTION_2) {
				setFetchAttributes(0, "How many would you like to retrieve?");
			} else if (componentId == OPTION_3) {
				setFetchAttributes(3, "How many would you like to bank?");
			} else
				end();
		} else if (stage == 1) {
			if (componentId == OPTION_1) {
				setFetchAttributes(0, "How many would you like to retrieve?");
			} else if (componentId == OPTION_2) {
				setFetchAttributes(3, "How many would you like to bank?");
			} else
				end();
		} else if (stage == 2) {
			if (componentId == OPTION_1) {
				setFetchAttributes(1, "How many would you like to create?");
			} else if (componentId == OPTION_2) {
				setFetchAttributes(3, "How many would you like to bank?");
			} else
				end();
		} else if (stage == 3) {
			end();
		}
	}

	private void setFetchAttributes(int type, String title) {
		player.getTemporaryAttributtes().put(Key.SERVANT_REQUEST_TYPE, type);
		player.getTemporaryAttributtes().put(Key.SERVANT_REQUEST_ITEM, item);
		player.getPackets().sendInputIntegerScript(title);
		end();
	}

	@Override
	public void finish() {

	}
}
