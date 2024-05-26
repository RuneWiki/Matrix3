package com.rs.game.player.dialogues.impl.construction;

import java.util.LinkedList;
import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.TemporaryAtributtes.Key;
import com.rs.game.item.Item;
import com.rs.game.npc.construction.ServantNPC;
import com.rs.game.player.content.construction.HouseConstants;
import com.rs.game.player.dialogues.Dialogue;

public class NewServantD extends Dialogue {

	private ServantNPC servant;
	private byte page = -1;

	@Override
	public void start() {
		this.servant = (ServantNPC) parameters[0];
		servant.setFollowing(true);
		int paymentStage = player.getHouse().getPaymentStage();
		if (paymentStage == 10) {
			stage = 13;
			sendNPCDialogue(servant.getId(), NORMAL, "Excuse me, but before I can continue working you must pay my fee.");
		} else {
			if ((boolean) parameters[1])
				sendBeginningOption();
			else
				sendNPCDialogue(servant.getId(), NORMAL, "I am at thy command, my master");
		}
	}

	private void sendBeginningOption() {
		if (servant.getServantData().isSawmill()) {
			sendOptionsDialogue("Select an Option", "Take something to the bank", "Bring something from the bank", "Take something to the sawmill");
		} else {
			sendOptionsDialogue("Select an Option", "Take something to the bank", "Bring something from the bank");
		}
		stage = 9;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Select an Option", "Go to the bank/sawmill...", "Misc...", "Stop following me", "You're fired");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1) {
				sendBeginningOption();
			} else if (componentId == OPTION_2) {
				sendOptionsDialogue("Select an Option", "Make tea", "Serve dinner", "Serve drinks", "Greet guests");
				stage = 4;
			} else if (componentId == OPTION_3) {
				sendBeginningOption();
			} else if (componentId == OPTION_4) {
				sendOptionsDialogue("Do you really want to fire your servant?", "Yes.", "No.");
				stage = 3;
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1) {
				sendPlayerDialogue(NORMAL, "You are dismissed.");
				servant.fire();
			} else {
				end();
			}
			stage = 99;
		} else if (stage == 4) {
			if (componentId == OPTION_1) {
				sendNPCDialogue(servant.getId(), NORMAL, "Thou shall taste the very tea of the Demon Lords themselves!");
				stage = 6;
			} else if (componentId == OPTION_2) {
				sendNPCDialogue(servant.getId(), NORMAL, "I shall prepare thee a banquet fit for the lords of Pandemonium!");
				stage = 7;
			} else if (componentId == OPTION_3) {
				sendPlayerDialogue(NORMAL, "Serve drinks please.");
				stage = 8;
			} else if (componentId == OPTION_4) {
				sendPlayerDialogue(NORMAL, "Stay at the entrance and greet guests.");
				stage = 5;
			}
		} else if (stage == 5) {
			servant.setGreetGuests(true);
			servant.setFollowing(false);
			servant.setNextWorldTile(servant.getRespawnTile());
		} else if (stage == 6) {
			end();
			servant.makeFood(HouseConstants.TEA_BUILDS);
		} else if (stage == 7) {
			end();
			servant.makeFood(HouseConstants.DINNER_BUILDS);
		} else if (stage == 8) {
			end();
			servant.makeFood(HouseConstants.DRINKS_BUILDS);
		} else if (stage == 9) {
			if (componentId == OPTION_1) {
				sendNPCDialogue(servant.getId(), NORMAL, "Give any item to me and I shall take it swiftly to the bank where it will be safe from thieves and harm.");
				stage = 99;
			} else if (componentId == OPTION_2) {
				sendOptionsDialogue("What would you like from the bank?", getPageOptions());
			} else {
				sendNPCDialogue(servant.getId(), NORMAL, "Give me some logs and I will return as fast as possible.");
				stage = 99;
			}
		} else if (stage == 10 || stage == 11 || stage == 12) {
			if (componentId == (stage == 10 ? OPTION_4 : OPTION_5)) {
				sendOptionsDialogue("What would you like from the bank?", getPageOptions());
			} else {
				player.getTemporaryAttributtes().put(Key.SERVANT_REQUEST_TYPE, 0);
				player.getTemporaryAttributtes().put(Key.SERVANT_REQUEST_ITEM, HouseConstants.BANKABLE_ITEMS[page][componentId == 11 ? 0 : componentId - 12]);
				player.getPackets().sendInputIntegerScript("How many would you like?");
				end();
			}
		} else if (stage == 13) {
			sendOptionsDialogue("Would you you like to pay the fee of " + servant.getServantData().getCost() + "?", "Yes", "No", "Fire.");
			stage = 14;
		} else if (stage == 14) {
			if (componentId == OPTION_1) {
				int cost = servant.getServantData().getCost();
				if (player.getInventory().getCoinsAmount() < cost) {
					sendNPCDialogue(servant.getId(), NORMAL, "You do not have enough coins to cover up my cost.");
					stage = 99;
					return;
				}
				player.getInventory().removeItemMoneyPouch(new Item(995, cost));
				player.getHouse().resetPaymentStage();
				sendNPCDialogue(servant.getId(), NORMAL, "Thank you!");
				stage = -1;
			} else if (componentId == OPTION_2) {
				end();
			} else if (componentId == OPTION_3) {
				sendOptionsDialogue("Do you really want to fire your servant?", "Yes.", "No.");
				stage = 3;
			}
		} else if (stage == 99) {
			end();
		}
	}

	private String[] getPageOptions() {
		List<String> options = new LinkedList<String>();
		page = (byte) (stage == 12 ? 0 : page + 1);
		int[] items = HouseConstants.BANKABLE_ITEMS[page];
		for (int index = 0; index < items.length; index++) {
			options.add(ItemDefinitions.getItemDefinitions(items[index]).getName());
		}
		options.add("More...");
		stage = (byte) (page + 10);
		return options.toArray(new String[options.size()]);
	}

	@Override
	public void finish() {

	}
}
