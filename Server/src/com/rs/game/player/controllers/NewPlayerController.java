package com.rs.game.player.controllers;

import java.util.ArrayList;

import com.rs.Settings;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.content.EconomyManager;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class NewPlayerController extends Controller {
	private static ArrayList<String> ips = new ArrayList<String>();

	private NPC target;
	private int stage = 0;
	private int startSceneDelay;

	@Override
	public void start() {
		stage = 0;
		player.setNextWorldTile(Settings.START_PLAYER_LOCATION);
		player.getMusicsManager().forcePlayMusic(89);
		player.getInterfaceManager().setRootInterface(1507, false);
	}
	
	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
		if(interfaceId == 1507) {
			if(componentId == 8 || componentId == 5) {
				if(player.isLegacyMode() != (componentId == 8))
					player.switchLegacyMode();
				player.getInterfaceManager().setRootInterface(548, false);
			}
			return false;
		}else if(interfaceId == 548 && componentId == 4) 
				startSceneDelay = 60;
		return true;
	}

	private Dialogue getStartDialogue() {
		return new Dialogue() {
			@Override
			public void start() {
				sendDialogue("As you awake from the strange dream, you feel a sudden urge to find the mysterious Oracle of Dawn.", "Follow the minimap arrow to find it!");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				end();
			}

			@Override
			public void finish() {
			}

		};
	}

	private Dialogue getEndDialogue() {
		return new Dialogue() {
			int stage = 0;

			@Override
			public void start() {
				sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "Hello there " + player.getDisplayName() + "!", "I hope my introduction wasn't too long and boring?");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				if (stage == 0) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "Wait! Are you saying it wasn't my dream?");
					stage = 1;
				} else if (stage == 1) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "What makes you think I can't appear in your dreams?");
					stage = 2;
				} else if (stage == 2) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "Whatever...");
					stage = 3;
				} else if (stage == 3) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "And since we're already talking, can you tell me more about the server?", "Where can I find shops, teleports, commands?");
					stage = 4;
				} else if (stage == 4) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "Everything you will need can be found by talking to me!", "This includes all shops, teleports, information & more.");
					stage = 5;
				} else if (stage == 5) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "I can also help you change your password or display name, set your title & more.");
					stage = 6;
				} else if (stage == 6) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "Make sure you check out our beginner's guide or join friends chat \"help\" for more information.");
					stage = 7;
				} else if (stage == 7) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "Okay, that's nice..", "Now can I get started already?");
					stage = 8;
				} else if (stage == 8) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "One more thing!");
					stage = 9;
				} else if (stage == 9) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "Yes?");
					stage = 11;
				} else if (stage == 11) {
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "To get started you need to choose your xp and drop rates.", "This is <u><col=FF0000>very important</col></u> choice, as you will not be able to change them ever again!");
					stage = 12;
				} else if (stage == 12) {
					sendOptionsDialogue("Please choose your xp and drop rates", "x5 xp, x5 combat xp, x2.5 drop rate", "x20 xp, x40 combat xp, x2 drop rate", "x40 xp, x100 combat xp, x1 drop rate (Recommended)", "x100 xp, x500 combat xp, x0.4 drop rate");
					stage = 13;
				} else if (stage == 13) {
					if (componentId == OPTION_1)
						player.setXpRateMode(4);
					else if (componentId == OPTION_2)
						player.setXpRateMode(1);
					else if (componentId == OPTION_3)
						player.setXpRateMode(2);
					else if (componentId == OPTION_4)
						player.setXpRateMode(3);
					sendEntityDialogue(Dialogue.IS_NPC, target != null ? target.getName() : "", target != null ? target.getId() : 0, 9760, "Now you can start your adventures in strange & dangerious world of " + Settings.SERVER_NAME + "!<br>", "Good luck!");
					stage = 14;
				} else if (stage == 14) {
					sendEntityDialogue(Dialogue.IS_PLAYER, -1, 9760, "Thanks!");
					stage = 15;
				} else if (stage == 15) {
					sendDialogue("As you finish talking with Oracle, you feel some strange magical force fill your inventory with various goods!");
					stage = 16;
				} else {
					end();
				}
			}

			@Override
			public void finish() {
			}

		};
	}

	@Override
	public void process() {
		if (stage == 0) {
			NPC closest = null;
			double dist = 999999;
			for (NPC npc : World.getNPCs()) {
				if (npc == null || !EconomyManager.isEconomyManagerNpc(npc.getId()))
					continue;
				int xDelta = player.getX() - npc.getX();
				int yDelta = player.getY() - npc.getY();
				double d = Math.sqrt(xDelta * xDelta + yDelta * yDelta);
				if (closest == null || d < dist) {
					closest = npc;
					dist = d;
				}
			}

			if (closest != null) {
				target = closest;
				player.getHintIconsManager().addHintIcon(closest, 0, -1, false);
				stage = 1;
			}
		}else if (player.getInterfaceManager().getWindowsPane() == 548) {
			startSceneDelay++;
			if(startSceneDelay >= 60) {
				player.getInterfaceManager().setDefaultRootInterface();
				stage = 2;
			}
		} else if (stage == 2) {
			//if (Settings.HOSTED)
				player.stopAll();
				player.getCutscenesManager().play("HomeCutScene3");
			stage = 3;
		} else if (stage == 3 && !player.getCutscenesManager().hasCutscene()) {
			player.getDialogueManager().startDialogue(getStartDialogue());
			stage = 4;
		} else if (stage == 5 && player.getDialogueManager().getLast() == null) {
			player.getDialogueManager().startDialogue(getEndDialogue());
			stage = 6;
		} else if (stage == 6 && player.getDialogueManager().getLast() == null) {
			if (player.getXpRateMode() == 0) {
				player.getDialogueManager().startDialogue(getEndDialogue());
				stage = 4;
			} else {
				player.getControlerManager().forceStop();
			}
		}
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		return false;
	}

	@Override
	public boolean processObjectClick2(WorldObject object) {
		return false;
	}

	@Override
	public boolean processObjectClick3(WorldObject object) {
		return false;
	}

	@Override
	public boolean processNPCClick1(NPC npc) {
		if (stage == 4 && npc == target) {
			stage = 5;
		}
		return false;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean login() {
		start();
		return false;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean logout() {
		return false;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean keepCombating(Entity target) {
		return false;
	}

	@Override
	public boolean canAttack(Entity target) {
		return false;
	}

	@Override
	public boolean canHit(Entity target) {
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public void forceClose() {
		player.getHintIconsManager().removeUnsavedHintIcon();
		player.getMusicsManager().reset();
		if (Settings.HOSTED)
			FriendsChat.requestJoin(player, Utils.formatPlayerNameForDisplay("help"));
		String ip = player.getSession() != null ? player.getSession().getIP() : null;
		if (ip != null && !ips.contains(ip)) {
			ips.add(ip);
			player.getInventory().addItem(new Item(995, 3001337));
			player.getInventory().addItem(new Item(386, 100));
		} else {
			player.getPackets().sendGameMessage("You have already received starting items on another account.");
			player.getSquealOfFortune().setDailySpins(0);
		}
		player.getDialogueManager().startDialogue("SimpleNPCMessage", 13930, "You are currently under new player protection, this will last for 1 hour. As a result, you have been blessed with Double EXP rates, but you will be unable to interact with other players until the protection has run out.");
		player.getInventory().addItem(new Item(1333, 1));
		player.getInventory().addItem(new Item(1323, 1));
		player.getInventory().addItem(new Item(1153, 1));
		player.getInventory().addItem(new Item(1115, 1));
		player.getInventory().addItem(new Item(1067, 1));
		player.getInventory().addItem(new Item(1540, 1));
		player.getInventory().addItem(new Item(1712, 1));
		player.getInventory().addItem(new Item(2552, 1));
		player.getInventory().addItem(new Item(3853, 1));
		player.getInventory().addItem(new Item(15707, 1));
		player.getInventory().addItem(new Item(1856, 1));
	}
}
