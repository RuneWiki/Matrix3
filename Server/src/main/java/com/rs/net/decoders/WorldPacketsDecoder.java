package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.QuickChatOptionDefinition;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.TemporaryAtributtes.Key;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.map.bossInstance.BossInstanceHandler;
import com.rs.game.map.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.minigames.Sawmill;
import com.rs.game.minigames.Sawmill.Plank;
import com.rs.game.minigames.clanwars.ClanWars;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.stealingcreation.StealingCreationController;
import com.rs.game.minigames.stealingcreation.StealingCreationLobbyController;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.npc.others.DoorSupport;
import com.rs.game.player.ActionBar;
import com.rs.game.player.ActionBar.DefenceAbilityShortcut;
import com.rs.game.player.ActionBar.HealAbilityShortcut;
import com.rs.game.player.ActionBar.ItemShortcut;
import com.rs.game.player.ActionBar.MagicAbilityShortcut;
import com.rs.game.player.ActionBar.MeleeAbilityShortcut;
import com.rs.game.player.ActionBar.PrayerShortcut;
import com.rs.game.player.ActionBar.RangeAbilityShortcut;
import com.rs.game.player.ActionBar.StrengthAbilityShortcut;
import com.rs.game.player.ChatMessage;
import com.rs.game.player.FarmingManager.FarmingSpot;
import com.rs.game.player.FarmingManager.SpotInfo;
import com.rs.game.player.InterfaceManager;
import com.rs.game.player.Inventory;
import com.rs.game.player.LogicPacket;
import com.rs.game.player.MoneyPouch;
import com.rs.game.player.Player;
import com.rs.game.player.PublicChatMessage;
import com.rs.game.player.QuickChatMessage;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Firemaking;
import com.rs.game.player.actions.Firemaking.Fire;
import com.rs.game.player.actions.PlayerCombatNew;
import com.rs.game.player.actions.PlayerFollow;
import com.rs.game.player.actions.Smithing;
import com.rs.game.player.content.AccessorySmithing;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.Shop;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.TicketSystem;
import com.rs.game.player.content.TicketSystem.TicketEntry;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.commands.Commands;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.construction.TabletMaking;
import com.rs.game.player.content.pet.Pets;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.DungeonController;
import com.rs.game.player.controllers.SawmillController;
import com.rs.game.player.dialogues.impl.EnchantingOrbsDialogue;
import com.rs.game.player.dialogues.impl.PetShopOwner;
import com.rs.game.player.dialogues.impl.SkillAlchemist;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.net.LoginClientChannelManager;
import com.rs.net.LoginProtocol;
import com.rs.net.Session;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.net.decoders.handlers.InventoryOptionsHandler;
import com.rs.net.decoders.handlers.NPCHandler;
import com.rs.net.decoders.handlers.ObjectHandler;
import com.rs.net.encoders.LoginChannelsPacketEncoder;
import com.rs.utils.Logger;
import com.rs.utils.ReportAbuse;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public final class WorldPacketsDecoder extends Decoder {

	private static final byte[] PACKET_SIZES = new byte[121];

	private final static int WALKING_PACKET = 50; 
	private final static int MINI_WALKING_PACKET = 63;
	public final static int ACTION_BUTTON1_PACKET = 103;
	public final static int ACTION_BUTTON2_PACKET = 7;
	public final static int ACTION_BUTTON3_PACKET = 113;
	public final static int ACTION_BUTTON4_PACKET = 29;
	public final static int ACTION_BUTTON5_PACKET = 65;
	public final static int ACTION_BUTTON6_PACKET = 87;
	public final static int ACTION_BUTTON7_PACKET = 21;
	public final static int ACTION_BUTTON8_PACKET = 66;
	public final static int ACTION_BUTTON9_PACKET = 27;
	public final static int ACTION_BUTTON10_PACKET = 64;
	public final static int WORLD_MAP_CLICK = 40;
	public final static int RECEIVE_PACKET_COUNT_PACKET = 58;
	private final static int PLAYER_OPTION_3_PACKET = 55;
	private final static int PLAYER_OPTION_4_PACKET = 106;
	private final static int PLAYER_OPTION_6_PACKET = 98;
	private final static int MOVE_CAMERA_PACKET = 16;
	private final static int INTERFACE_ON_OBJECT = 109;
	private final static int CLICK_PACKET = 95;
	private final static int CLICK_PACKET_2 = 59;
	private final static int MOUVE_MOUSE_PACKET = 46;
	private final static int MOUSE_MOVEMENT_DELAY = 2;
	private final static int KEY_TYPED_PACKET = 68;
	private final static int CLOSE_INTERFACE_PACKET = 36;
	private final static int COMMANDS_PACKET = 24;
	private final static int INTERFACE_ON_INTERFACE = 90;
	private final static int IN_OUT_SCREEN_PACKET = 54;
	private final static int DONE_LOADING_REGION_PACKET = 61;
	private final static int PING_PACKET = 100;
	private final static int SCREEN_PACKET = 86;
	private final static int CHAT_TYPE_PACKET = 91;
	private final static int CHAT_PACKET = 77;
	private final static int PUBLIC_QUICK_CHAT_PACKET = 20;
	private final static int ADD_FRIEND_PACKET = 85;
	private final static int ADD_IGNORE_PACKET = 80;
	private final static int REMOVE_IGNORE_PACKET = 53;
	private final static int JOIN_FRIEND_CHAT_PACKET = 43;
	private final static int CHANGE_FRIEND_CHAT_PACKET = 51;
	private final static int KICK_FRIEND_CHAT_PACKET = 28;
	private final static int KICK_CLAN_CHAT_PACKET = 71;
	private final static int REMOVE_FRIEND_PACKET = 14;
	private final static int SEND_FRIEND_MESSAGE_PACKET = 47;
	private final static int SEND_FRIEND_QUICK_CHAT_PACKET = 101;
	private final static int OBJECT_CLICK1_PACKET = 38;
	private final static int OBJECT_CLICK2_PACKET = 42;
	private final static int OBJECT_CLICK3_PACKET = 94;
	private final static int OBJECT_CLICK4_PACKET = 41;
	private final static int OBJECT_CLICK5_PACKET = 17;
	private final static int OBJECT_EXAMINE_PACKET = 118;
	private final static int NPC_CLICK1_PACKET = 92;
	private final static int ATTACK_NPC_PACKET = 32;
	private final static int NPC_CLICK2_PACKET = 60;
	private final static int NPC_CLICK3_PACKET = 117;
	private final static int NPC_CLICK4_PACKET = 1;
	private static final int NPC_EXAMINE_PACKET = 0;
	private final static int PLAYER_OPTION_1_PACKET = 3;
	private final static int PLAYER_OPTION_2_PACKET = 110;
	private final static int PLAYER_OPTION_9_PACKET = 39;
	private final static int ITEM_TAKE_PACKET = 12;
	private final static int GROUND_ITEM_OPTION_2 = 75;
	private final static int DIALOGUE_CONTINUE_PACKET = 104;
	private final static int ENTER_INTEGER_PACKET = 116;
	private final static int ENTER_NAME_PACKET = 23;
	private final static int ENTER_LONG_TEXT_PACKET = 76;
	private final static int SWITCH_INTERFACE_COMPONENTS_PACKET = 74;
	private final static int INTERFACE_ON_PLAYER = 114;
	private final static int INTERFACE_ON_NPC = 37;
	private final static int COLOR_ID_PACKET = 93;
	private static final int FORUM_THREAD_ID_PACKET = 31;
	private final static int OPEN_URL_PACKET = 108;
	private final static int REPORT_ABUSE_PACKET = 49;
	private final static int GRAND_EXCHANGE_ITEM_SELECT_PACKET = 69;
	private final static int WORLD_LIST_UPDATE = 79;
	private final static int UPDATE_GAMEBAR_PACKET = 111;
	private final static int NIS_VAR_PACKET = 119;
	private final static int MUSIC_PACKET = 99;
	private final static int REQUEST_PLAY_MUSIC_PACKET = 45;
	private final static int CUTSCENE_DONE_PACKET = 62;
	private final static int GARBAGE_CLEAR_PACKET = 13;

	static {
		loadPacketSizes();
	}

	public static void loadPacketSizes() {
		PACKET_SIZES[0] = 3;
		PACKET_SIZES[1] = 3;
		PACKET_SIZES[2] = -1;
		PACKET_SIZES[3] = 3;
		PACKET_SIZES[4] = 0;
		PACKET_SIZES[5] = -2;
		PACKET_SIZES[6] = 15;
		PACKET_SIZES[7] = 8;
		PACKET_SIZES[8] = -1;
		PACKET_SIZES[9] = 4;
		PACKET_SIZES[10] = -1;
		PACKET_SIZES[11] = -1;
		PACKET_SIZES[12] = 7;
		PACKET_SIZES[13] = 4;
		PACKET_SIZES[14] = -1;
		PACKET_SIZES[15] = -2;
		PACKET_SIZES[16] = 4;
		PACKET_SIZES[17] = 9;
		PACKET_SIZES[18] = 3;
		PACKET_SIZES[19] = -1;
		PACKET_SIZES[20] = -1;
		PACKET_SIZES[21] = 8;
		PACKET_SIZES[22] = -1;
		PACKET_SIZES[23] = -1;
		PACKET_SIZES[24] = -1;
		PACKET_SIZES[25] = 7;
		PACKET_SIZES[26] = -1;
		PACKET_SIZES[27] = 8;
		PACKET_SIZES[28] = -1;
		PACKET_SIZES[29] = 8;
		PACKET_SIZES[30] = 15;
		PACKET_SIZES[31] = -1;
		PACKET_SIZES[32] = 3;
		PACKET_SIZES[33] = 1;
		PACKET_SIZES[34] = -2;
		PACKET_SIZES[35] = -1;
		PACKET_SIZES[36] = 0;
		PACKET_SIZES[37] = 11;
		PACKET_SIZES[38] = 9;
		PACKET_SIZES[39] = 3;
		PACKET_SIZES[40] = 4;
		PACKET_SIZES[41] = 9;
		PACKET_SIZES[42] = 9;
		PACKET_SIZES[43] = -1;
		PACKET_SIZES[44] = 9;
		PACKET_SIZES[45] = 4;
		PACKET_SIZES[46] = -1;
		PACKET_SIZES[47] = -2;
		PACKET_SIZES[48] = -1;
		PACKET_SIZES[49] = -1;
		PACKET_SIZES[50] = 5;
		PACKET_SIZES[51] = -1;
		PACKET_SIZES[52] = 0;
		PACKET_SIZES[53] = -1;
		PACKET_SIZES[54] = 1;
		PACKET_SIZES[55] = 3;
		PACKET_SIZES[56] = 9;
		PACKET_SIZES[57] = -2;
		PACKET_SIZES[58] = 4;
		PACKET_SIZES[59] = 7;
		PACKET_SIZES[60] = 3;
		PACKET_SIZES[61] = 0;
		PACKET_SIZES[62] = 1;
		PACKET_SIZES[63] = 18;
		PACKET_SIZES[64] = 8;
		PACKET_SIZES[65] = 8;
		PACKET_SIZES[66] = 8;
		PACKET_SIZES[67] = 1;
		PACKET_SIZES[68] = -2;
		PACKET_SIZES[69] = 2;
		PACKET_SIZES[70] = 0;
		PACKET_SIZES[71] = -1;
		PACKET_SIZES[72] = 4;
		PACKET_SIZES[73] = 12;
		PACKET_SIZES[74] = 16;
		PACKET_SIZES[75] = 7;
		PACKET_SIZES[76] = -1;
		PACKET_SIZES[77] = -1;
		PACKET_SIZES[78] = 1;
		PACKET_SIZES[79] = 4;
		PACKET_SIZES[80] = -1;
		PACKET_SIZES[81] = -1;
		PACKET_SIZES[82] = 18;
		PACKET_SIZES[83] = -1;
		PACKET_SIZES[84] = 7;
		PACKET_SIZES[85] = -1;
		PACKET_SIZES[86] = 6;
		PACKET_SIZES[87] = 8;
		PACKET_SIZES[88] = -2;
		PACKET_SIZES[89] = 5;
		PACKET_SIZES[90] = 16;
		PACKET_SIZES[91] = 1;
		PACKET_SIZES[92] = 3;
		PACKET_SIZES[93] = 2;
		PACKET_SIZES[94] = 9;
		PACKET_SIZES[95] = 6;
		PACKET_SIZES[96] = 2;
		PACKET_SIZES[97] = 3;
		PACKET_SIZES[98] = 3;
		PACKET_SIZES[99] = 4;
		PACKET_SIZES[100] = 0;
		PACKET_SIZES[101] = -1;
		PACKET_SIZES[102] = 3;
		PACKET_SIZES[103] = 8;
		PACKET_SIZES[104] = 6;
		PACKET_SIZES[105] = 7;
		PACKET_SIZES[106] = 3;
		PACKET_SIZES[107] = 7;
		PACKET_SIZES[108] = -2;
		PACKET_SIZES[109] = 17;
		PACKET_SIZES[110] = 3;
		PACKET_SIZES[111] = 3;
		PACKET_SIZES[112] = -2;
		PACKET_SIZES[113] = 8;
		PACKET_SIZES[114] = 11;
		PACKET_SIZES[115] = 3;
		PACKET_SIZES[116] = 4;
		PACKET_SIZES[117] = 3;
		PACKET_SIZES[118] = 9;
		PACKET_SIZES[119] = -2;
		PACKET_SIZES[120] = -2;
	}

	private Player player;
	private int chatType;

	// temp spam protection
	private int[] pthrotlecounter = new int[256];
	private long[] pthrotletimer = new long[256];

	// temp spam protection

	public WorldPacketsDecoder(Session session, Player player) {
		super(session);
		this.player = player;
	}



	@Override
	public int decode(InputStream stream) {
		while (stream.getRemaining() > 0 && !player.hasFinished()) {
			int start = stream.getOffset();
			int opcode = stream.readPacket(player);
			if (opcode < 0 || opcode >= PACKET_SIZES.length) {
				if (Settings.DEBUG)
					System.out.println("Invalid opcode: " + opcode + ".");
				return -1; // drop
			}

			int length = PACKET_SIZES[opcode];
			if ((length == -1 && stream.getRemaining() < 1) || (length == -2 && stream.getRemaining() < 2))
				return start;		

			if (length == -1)
				length = stream.readUnsignedByte();
			else if (length == -2)
				length = stream.readUnsignedShort();

			if (stream.getRemaining() < length) {
				return start;
			}

			byte[] data = new byte[length];
			stream.readBytes(data);
			try {
				processPackets(opcode, new InputStream(data));
			}catch(Throwable e) {
				Logger.handle(e);
			}
		}
		return stream.getOffset();
	}

	public static void decodeLogicPacket(final Player player, LogicPacket packet) {
		int opcode = packet.getId();
		InputStream stream = packet.getStream();
		if (opcode == WALKING_PACKET || opcode == MINI_WALKING_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			if (player.isLocked() || player.isCantWalk() || player.isStunned())
				return;
			if (player.isBound()) {
				player.getPackets().sendGameMessage("A magical force prevents you from moving.");
				return;
			}
			int toX = stream.readUnsignedShort();
			boolean forceRun = stream.readUnsigned128Byte() == 1;
			int toY = stream.readUnsignedShortLE();
			player.stopAll();
			if (forceRun)
				player.setRun(forceRun);
			int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, player.getX(), player.getY(), player.getPlane(), player.getSize(), new FixedTileStrategy(toX, toY), true);
			int[] bufferX = RouteFinder.getLastPathBufferX();
			int[] bufferY = RouteFinder.getLastPathBufferY();
			int last = -1;
			for (int i = steps - 1; i >= 0; i--) {
				if (!player.addWalkSteps(bufferX[i], bufferY[i], 25, true))
					break;
				last = i;
			}

			if (last != -1) {
				WorldTile tile = new WorldTile(bufferX[last], bufferY[last], player.getPlane());
				player.getPackets().sendMinimapFlag(tile.getXInScene(player), tile.getYInScene(player));
			} else {
				player.getPackets().sendResetMinimapFlag();
			}
		} else if (opcode == INTERFACE_ON_PLAYER) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote())
				return;
			final int slot = stream.readUnsignedShortLE();
			final boolean forceRun = stream.readByte128() == 1;
			int interfaceHash = stream.readIntV1();
			final int itemId = stream.readUnsignedShortLE128();
			int playerIndex = stream.readUnsignedShortLE();
			int interfaceId = interfaceHash >> 16;
			int componentId = interfaceHash & 0xFF;
			if (Settings.DEBUG)
				System.out.println("interface on player - player index:" + playerIndex+", inter "+interfaceId+", "+componentId+", "+slot+", "+itemId);
			if (Utils.getInterfaceDefinitionsSize() <= interfaceId)
				return;
			if (!player.getInterfaceManager().containsInterface(interfaceId))
				return;
			if (componentId == 65535)
				componentId = -1;
			if (componentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId)
				return;
			final Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			player.stopAll();
			if (forceRun)
				player.setRun(forceRun);
			switch (interfaceId) {
				case 1430:
					if(componentId >= 55 && componentId <= 229) 
						player.getActionbar().pushShortcutOnSomething((componentId - 55) / 13, p2);
					break;
				case 1110:
				case 1140:
				case 234:
					if ((interfaceId == 1110 && componentId == 16)
							|| (interfaceId == 1140 && componentId == 10)
							|| (interfaceId == 234 && componentId == 10))
						ClansManager.invite(player, p2);
					break;
				case Inventory.INVENTORY_INTERFACE:
				case Inventory.INVENTORY_INTERFACE_2:
					final Item item = player.getInventory().getItem(slot);
					if (item == null || item.getId() != itemId)
						return;
					player.setRouteEvent(new RouteEvent(p2, new Runnable() {
						@Override
						public void run() {
							if (!player.getControlerManager().processItemOnPlayer(p2, item, slot))
								return;
							if (itemId == 4155)
								player.getSlayerManager().invitePlayer(p2);
						}
					}));
					break;
				case 662:
				case 747:
					if (player.getFamiliar() == null)
						return;
					player.resetWalkSteps();
					if ((interfaceId == 747 && componentId == 15) || (interfaceId == 662 && componentId == 65) || (interfaceId == 662 && componentId == 74) || interfaceId == 747 && componentId == 18) {
						if ((interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 24 || interfaceId == 747 && componentId == 18)) {
							if (player.getFamiliar().getSpecialAttack() != SpecialAttack.ENTITY)
								return;
						}
						if (!player.isCanPvp() || !p2.isCanPvp()) {
							player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
							return;
						}
						if (!player.getFamiliar().canAttack(p2)) {
							player.getPackets().sendGameMessage("You can only use your familiar in a multi-zone area.");
							return;
						} else {
							player.getFamiliar().setSpecial(interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 18);
							player.getFamiliar().setTarget(p2);
						}
					}
					break;
				case 1461:
					if(componentId == 1)
						player.getActionbar().useAbility(new MagicAbilityShortcut(slot), p2);
					//Magic.handleSpellOnEntity(player, interfaceSlot, p2);
					break;
				case 1449:
					if(componentId == 1)
						player.getActionbar().useAbility(player.getCombatDefinitions().onDefenceMenu() ? new DefenceAbilityShortcut(slot) : new HealAbilityShortcut(slot), p2);
					break;
				case 1460:
					if(componentId == 1)
						player.getActionbar().useAbility(player.getCombatDefinitions().onStrengthMenu() ? new StrengthAbilityShortcut(slot) : new MeleeAbilityShortcut(slot), p2);
					break;
				case 1452:
					if(componentId == 1)
						player.getActionbar().useAbility(new RangeAbilityShortcut(slot), p2);
					break;
			}
		} else if (opcode == INTERFACE_ON_NPC) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote())
				return;


			int interfaceHash = stream.readIntLE();
			int interfaceSlot = stream.readUnsignedShort();
			int interfaceSlot2 = stream.readUnsignedShort();
			int npcIndex = stream.readUnsignedShort();
			boolean forceRun = stream.readByte128() == 1;

			int interfaceId = interfaceHash >> 16;
					int componentId = interfaceHash - (interfaceId << 16);

					if (Settings.DEBUG)
						System.out.println("interface on npc - player index:" + npcIndex+", inter "+interfaceId+", "+componentId+", "+interfaceSlot+", "+interfaceSlot2);


					if (Utils.getInterfaceDefinitionsSize() <= interfaceId)
						return;
					if (!player.getInterfaceManager().containsInterface(interfaceId))
						return;
					if (componentId == 65535)
						componentId = -1;
					if (componentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId)
						return;
					NPC npc = World.getNPCs().get(npcIndex);
					if (npc == null || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
						return;
					player.stopAll();
					if (forceRun)
						player.setRun(forceRun);
					switch (interfaceId) {
						case 1430:
							if(componentId >= 55 && componentId <= 229) 
								player.getActionbar().pushShortcutOnSomething((componentId - 55) / 13, npc);
							break;
						case Inventory.INVENTORY_INTERFACE:
						case Inventory.INVENTORY_INTERFACE_2:
							Item item = player.getInventory().getItem(interfaceSlot);
							if (item == null || !player.getControlerManager().processItemOnNPC(npc, item))
								return;
							else if (npc instanceof Familiar) {
								Familiar familiar = (Familiar) npc;
								if (familiar != player.getFamiliar()) {
									player.getPackets().sendGameMessage("This is not your familiar!");
									return;
								}
							}
							NPCHandler.handleItemOnNPC(player, npc, interfaceSlot, item);
							break;
						case 1165:
							/* if (componentId == 3) {
				if (!player.getControlerManager().canAttack(npc)) {
				    player.getInterfaceManager().closeInventory();
				    return;
				} else if (player.getAttackedBy() == null) {
				    player.getPackets().sendGameMessage("You need to have a target in order to deploy a dreadnip.");
				    player.getInterfaceManager().closeInventory();
				    return;
				}
				player.getInventory().deleteItem(22370, 1);
				Dreadnip dread = new Dreadnip(player, Utils.getFreeTile(player, 2), -1, true);
				dread.getCombat().setTarget(dread.getTarget().getAttackedBy());
				}*/
							break;
						case 662:
						case 747:
							if (player.getFamiliar() == null)
								return;
							player.resetWalkSteps();
							if ((interfaceId == 747 && componentId == 15) || (interfaceId == 662 && componentId == 65) || (interfaceId == 662 && componentId == 74) || interfaceId == 747 && componentId == 18 || interfaceId == 747 && componentId == 24) {
								if ((interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 18)) {
									if (player.getFamiliar().getSpecialAttack() != SpecialAttack.ENTITY)
										return;
								}
								if (npc instanceof Familiar) {
									Familiar familiar = (Familiar) npc;
									if (familiar == player.getFamiliar()) {
										player.getPackets().sendGameMessage("You can't attack your own familiar.");
										return;
									}
									if (!player.getFamiliar().canAttack(familiar.getOwner())) {
										player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
										return;
									}
								}else if (!npc.getDefinitions().hasAttackOption()) {
									player.getPackets().sendGameMessage("You can't attack this npc.");
									return;
								}
								if (!player.getFamiliar().canAttack(npc)) {
									player.getPackets().sendGameMessage("You can only use your familiar in a multi-zone area.");
									return;
								} else {
									player.getFamiliar().setSpecial(interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 18);
									player.getFamiliar().setTarget(npc);
								}
							}
							break;
						case 1461:
							if(componentId == 1)
								player.getActionbar().useAbility(new MagicAbilityShortcut(interfaceSlot), npc);
							//	Magic.handleSpellOnEntity(player, interfaceSlot, npc);
							break;
						case 1449:
							if(componentId == 1)
								player.getActionbar().useAbility(player.getCombatDefinitions().onDefenceMenu() ? new DefenceAbilityShortcut(interfaceSlot) : new HealAbilityShortcut(interfaceSlot), npc);
							break;
						case 1452:
							if(componentId == 1)
								player.getActionbar().useAbility(new RangeAbilityShortcut(interfaceSlot), npc);
							break;
						case 1460:
							if(componentId == 1)
								player.getActionbar().useAbility(player.getCombatDefinitions().onStrengthMenu() ? new StrengthAbilityShortcut(interfaceSlot) : new MeleeAbilityShortcut(interfaceSlot), npc);
							break;
					}
		} else if (opcode == INTERFACE_ON_OBJECT) {

			boolean forceRun = stream.readByte() == 1;
			int interfaceHash = stream.readInt();
			int slotId = stream.readShort128();
			int x = stream.readShortLE128();
			int objectId = stream.readIntV1();
			int y = stream.readShortLE();
			int itemId = stream.readShort();

			final int interfaceId = interfaceHash >> 16;
							int componentId = interfaceHash - (interfaceId << 16);

							if(Settings.DEBUG)
								Logger.log(WorldPacketsDecoder.class, "inter on object - "+interfaceId+", "+componentId+", "+x+", "+y+", "+objectId+", "+slotId+", "+itemId);

							if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
								return;
							if (player.isLocked() || player.getEmotesManager().isDoingEmote())
								return;
							final WorldTile tile = new WorldTile(x, y, player.getPlane());
							int regionId = tile.getRegionId();
							if (!player.getMapRegionsIds().contains(regionId))
								return;
							WorldObject mapObject = World.getObjectWithId(tile, objectId);
							if (mapObject == null || mapObject.getId() != objectId)
								return;
							final WorldObject object = mapObject;
							if (player.isDead() || Utils.getInterfaceDefinitionsSize() <= interfaceId)
								return;
							if (player.isLocked())
								return;
							if (!player.getInterfaceManager().containsInterface(interfaceId))
								return;
							player.stopAll();
							if (forceRun)
								player.setRun(forceRun);
							switch (interfaceId) {
								case Inventory.INVENTORY_INTERFACE: // inventory
								case Inventory.INVENTORY_INTERFACE_2:
									ObjectHandler.handleItemOnObject(player, object, interfaceId, slotId, itemId);
									break;
								case 430://lunars
									switch (componentId) {
										case 55:
											if (player.getSkills().getLevel(Skills.MAGIC) < 66) {
												player.getPackets().sendGameMessage("You need a level of 65 in order to cast Cure Plant.");
												return;
											}
											if (!Magic.checkRunes(player, true, Magic.ASTRAL_RUNE, 1, Magic.EARTH_RUNE, 8))
												return;
											final FarmingSpot spot = player.getFarmingManager().getSpot(SpotInfo.getInfo(object.getId()));
											if (spot == null || spot.isDead()) {
												player.getPackets().sendGameMessage("This cannot be cured.");
												return;
											} else if (!spot.isDiseased()) {
												player.getPackets().sendGameMessage("Your patch is not diseased.");
												return;
											}
											player.lock(3);
											WorldTasksManager.schedule(new WorldTask() {

												@Override
												public void run() {
													spot.setDiseased(false);
													spot.refresh();
												}
											}, 2);
											player.getSkills().addXp(Skills.MAGIC, 60);
											player.setNextGraphics(new Graphics(742, 0, 150));
											player.setNextAnimation(new Animation(4409));
											player.getPackets().sendGameMessage("You cast the spell and your patch is in perfect health.");
											break;
									}
									break;
								case 192: //regular spellbook
									switch (componentId) {
										case 60: // water charge
										case 64: // earth charge
										case 71: // fire charge
										case 74: // air charge
											for (int index = 0; index < 3; index++) {
												if (EnchantingOrbsDialogue.COMPONENTS[index] == componentId) {
													if (!Magic.checkRunes(player, false, EnchantingOrbsDialogue.REQUIRED_RUNES[index]))
														break;
													else if (!Magic.checkSpellLevel(player, EnchantingOrbsDialogue.LEVELS[index]))
														break;
													else {
														if (object.getId() == EnchantingOrbsDialogue.OBJECTS[index]) {
															player.faceObject(object);
															player.getDialogueManager().startDialogue("EnchantingOrbsDialogue", index);
														}
													}
												}
											}
											break;
									}
									break;
							}
		} else if (opcode == PLAYER_OPTION_1_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();

			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote() || !player.getControlerManager().canPlayerOption1(p2))
				return;
			if (!player.isCanPvp())
				return;
			if (!player.getControlerManager().canAttack(p2))
				return;
			if (!player.isCanPvp() || !p2.isCanPvp()) {
				player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
				return;
			}


			player.getActionManager().setAction(new PlayerCombatNew(p2));
		} else if (opcode == PLAYER_OPTION_2_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked() || player.isCantWalk())
				return;
			if (!player.getControlerManager().canPlayerOption2(p2))
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.getActionManager().setAction(new PlayerFollow(p2));
		} else if (opcode == PLAYER_OPTION_3_PACKET) {
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			final Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked())
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.setRouteEvent(new RouteEvent(p2, new Runnable() {
				@Override
				public void run() {
					if (!player.getControlerManager().canPlayerOption3(p2))
						return;
				}
			}));
		} else if (opcode == PLAYER_OPTION_4_PACKET) {
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			final Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked())
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.setRouteEvent(new RouteEvent(p2, new Runnable() {
				@Override
				public void run() {
					if (!player.getControlerManager().canPlayerOption4(p2))
						return;
					player.stopAll();
					if (player.isBeginningAccount()) {
						player.getPackets().sendGameMessage("Starter accounts cannot trade for the first hour of playing time.");
						return;
					}
					if (player.isCantTrade() || player.getControlerManager().getControler() != null && player.getControlerManager().getControler() instanceof StealingCreationLobbyController) {
						player.getPackets().sendGameMessage("You are busy.");
						return;
					}
					if (p2.isBeginningAccount()) {
						player.getPackets().sendGameMessage("Your target is a starter account, which cannot trade for the first hour of playing time.");
						return;
					}
					if (p2.getInterfaceManager().containsScreenInterface() || p2.isCantTrade() || p2.getControlerManager().getControler() != null && p2.getControlerManager().getControler() instanceof StealingCreationLobbyController || p2.isLocked()) {
						player.getPackets().sendGameMessage("The other player is busy.");
						return;
					}
					if (!p2.withinDistance(player, 14)) {
						player.getPackets().sendGameMessage("Unable to find target " + p2.getDisplayName());
						return;
					}
					if (!player.getBank().hasVerified(10)) {
						return;
					}
					if (p2.getTemporaryAttributtes().get("TradeTarget") == player) {
						p2.getTemporaryAttributtes().remove("TradeTarget");
						player.getTrade().openTrade(p2);
						p2.getTrade().openTrade(player);
						return;
					}
					player.getTemporaryAttributtes().put("TradeTarget", p2);
					player.getPackets().sendGameMessage("Sending " + p2.getDisplayName() + " a request...");
					p2.getPackets().sendTradeRequestMessage(player);
				}
			}));
		} else if (opcode == PLAYER_OPTION_6_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked())
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.getPlayerExamineManager().openExamineDetails(p2);
			
		} else if (opcode == PLAYER_OPTION_9_PACKET) {//TODO no longer used
			boolean forceRun = stream.readUnsignedByte128() == 1;
			int playerIndex = stream.readUnsignedShort128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked())
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			if (ClansManager.viewInvite(player, p2))
				return;
			if (p2.getTemporaryAttributtes().get("social_request") == player)
				player.getSlayerManager().invitePlayer(p2);
		} else if (opcode == ATTACK_NPC_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			boolean forceRun = stream.readUnsignedByteC() == 1;
			int npcIndex = stream.readUnsignedShort128();
			NPC npc = World.getNPCs().get(npcIndex);
			if (npc == null || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || !npc.getDefinitions().hasAttackOption())
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote())
				return;
			if (!player.getControlerManager().canAttack(npc))
				return;
			if (forceRun) //you scrwed up cutscenes
				player.setRun(forceRun);
			player.stopAll();
			if (npc instanceof Familiar) {
				Familiar familiar = (Familiar) npc;
				if (familiar == player.getFamiliar()) {
					player.getPackets().sendGameMessage("You can't attack your own familiar.");
					return;
				}
				if (!familiar.canAttack(player)) {
					player.getPackets().sendGameMessage("You can't attack this npc.");
					return;
				}
			}else if (npc instanceof DoorSupport) {
				if(!((DoorSupport)npc).canDestroy(player)) {
					player.getPackets().sendGameMessage("You cannot see a way to open this door...");
					return;
				}
			}
			player.getActionManager().setAction(new PlayerCombatNew(npc));
		} else if (opcode == NPC_CLICK1_PACKET)
			NPCHandler.handleOption1(player, stream);
		else if (opcode == NPC_CLICK2_PACKET)
			NPCHandler.handleOption2(player, stream);
		else if (opcode == NPC_CLICK3_PACKET)
			NPCHandler.handleOption3(player, stream);
		else if (opcode == NPC_CLICK4_PACKET)
			NPCHandler.handleOption4(player, stream);
		else if (opcode == OBJECT_CLICK1_PACKET)
			ObjectHandler.handleOption(player, stream, 1);
		else if (opcode == OBJECT_CLICK2_PACKET)
			ObjectHandler.handleOption(player, stream, 2);
		else if (opcode == OBJECT_CLICK3_PACKET)
			ObjectHandler.handleOption(player, stream, 3);
		else if (opcode == OBJECT_CLICK4_PACKET)
			ObjectHandler.handleOption(player, stream, 4);
		else if (opcode == OBJECT_CLICK5_PACKET)
			ObjectHandler.handleOption(player, stream, 5);
		else if (opcode == ITEM_TAKE_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			if (player.isLocked())
				return;
			int y = stream.readUnsignedShortLE128();
			int id = stream.readUnsignedShort128();
			boolean forceRun = stream.readByte() == 1;
			int x = stream.readShort128();
			final WorldTile tile = new WorldTile(x, y, player.getPlane());
			final int regionId = tile.getRegionId();
			if (!player.getMapRegionsIds().contains(regionId))
				return;
			final FloorItem item = World.getRegion(regionId).getGroundItem(id, tile, player);
			if (item == null)
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.setRouteEvent(new RouteEvent(item, new Runnable() {
				@Override
				public void run() {
					final FloorItem item = World.getRegion(regionId).getGroundItem(id, tile, player);
					if (item == null || !player.getControlerManager().canTakeItem(item))
						return;
					if (World.removeGroundItem(player, item))
						Logger.globalLog(player.getUsername(), player.getSession().getIP(), new String(" has picked up item [ id: " + item.getId() + ", amount: " + item.getAmount() + " ] originally owned to " + (item.getOwner() == null ? "no owner" : item.getOwner()) + "."));
				}
			}));
		} else if (opcode == GROUND_ITEM_OPTION_2) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
				return;
			if (player.isLocked())
				return;
			int y = stream.readUnsignedShortLE128();
			int id = stream.readUnsignedShort128();
			boolean forceRun = stream.readByte() == 1;
			int x = stream.readShort128();
			final WorldTile tile = new WorldTile(x, y, player.getPlane());
			final int regionId = tile.getRegionId();
			if (!player.getMapRegionsIds().contains(regionId))
				return;
			final FloorItem item = World.getRegion(regionId).getGroundItem(id, tile, player);
			if (item == null)
				return;
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			player.setRouteEvent(new RouteEvent(item, new Runnable() {
				@Override
				public void run() {
					final FloorItem item = World.getRegion(regionId).getGroundItem(id, tile, player);
					if (item == null)
						return;
					for (Fire fire : Fire.values()) {
						if (item.getId() == fire.getLogId()) {
							player.getActionManager().setAction(new Firemaking(fire, true));
							return;
						}
					}
				}
			}));
		}
	}

	public void processPackets(final int opcode, InputStream stream) {
		if (opcode != NIS_VAR_PACKET) { //dont want interface t oget messed up <...<
			long ctime = System.nanoTime();
			if ((ctime - pthrotletimer[opcode]) > (1000000 * 600)) {
				pthrotlecounter[opcode] = 0;
				pthrotletimer[opcode] = ctime;
			}

			if (++pthrotlecounter[opcode] > 10) {
				pthrotletimer[opcode] = ctime; // reset timer to completly mitigate ddos
				return;
			}
		}
		//System.out.println("packet: "+packetId +", "+ Thread.currentThread().getName());
		if (opcode == PING_PACKET) {
			player.getPackets().sendPing();
		}else if(opcode == 26) { //testing
			int shorta = stream.readShort();
			boolean b =  stream.readUnsignedByte() == 1;
			String s = stream.readString();
			System.out.println("p26: "+shorta+", "+b+", "+s);
		}else if (opcode == CUTSCENE_DONE_PACKET) {
			@SuppressWarnings("unused")
			boolean done = stream.readUnsignedByte() == 1;
			//if not done means skipped
			player.loadMapRegions();
		}else if (opcode == NIS_VAR_PACKET) {
			@SuppressWarnings("unused")
			boolean unknown = stream.readUnsignedByte() == 1;
			int count = (stream.getLength() - 1) / 6;
			for(int i = 0; i < count; i++) {
				Integer id = stream.readUnsignedShort();
				Integer value = stream.readInt();
				//	System.out.println("nisvar: "+id+", "+value);
				if(value == 0) 
					player.getILayoutVars().remove(id);
				else
					player.getILayoutVars().put(id, value);
			}
			//	System.out.println(player.getILayoutVars().size()+", "+player.getILayoutVars());
			if(player.getILayoutVars().size() > 1000) 
				player.resetILayoutVars();
			player.getPackets().sendResetNISVars();
		}else if (opcode == MUSIC_PACKET) {
			int archiveId = stream.readInt(); //started playing, request send again
			//player.getMusicsManager().resetMusicDelay(player.getMusicsManager().getMusicId(archiveId));
			player.getMusicsManager().resetMusicDelay(player.getMusicsManager().getMusicId(archiveId));
		}else if (opcode == REQUEST_PLAY_MUSIC_PACKET) { //request play such as after turn off and on
			int archiveId = stream.readInt();
			player.getMusicsManager().resetMusicDelay(player.getMusicsManager().getMusicId(archiveId));
		} else if (opcode == WORLD_LIST_UPDATE) {
			if(!player.isLobby())
				return;
			int checksum = stream.readInt();
			LoginClientChannelManager.sendReliablePacket(LoginChannelsPacketEncoder.encodePlayerWorldListStatusRequest(player.getUsername(), checksum).getBuffer());
		} else if (opcode == MOUVE_MOUSE_PACKET || opcode == MOUSE_MOVEMENT_DELAY) {
			// USELESS PACKET
		} else if (opcode == KEY_TYPED_PACKET) {
			// USELESS PACKET
		} else if (opcode == RECEIVE_PACKET_COUNT_PACKET) {
			//count
			stream.readInt();
		} else if (opcode == INTERFACE_ON_INTERFACE) {
			InventoryOptionsHandler.handleInterfaceOnInterface(player, stream);
		} else if (opcode == CLOSE_INTERFACE_PACKET) {
			player.stopAll();
		} else if (opcode == MOVE_CAMERA_PACKET) {
			// not using it atm
			stream.readShort();
			stream.readShortLE128();
		} else if (opcode == IN_OUT_SCREEN_PACKET) {
			// not using this check because not 100% efficient
			@SuppressWarnings("unused")
			boolean inScreen = stream.readByte() == 1;
		} else if (opcode == SCREEN_PACKET) {
			int displayMode = stream.readUnsignedByte();
			player.setScreenWidth(stream.readUnsignedShort());
			player.setScreenHeight(stream.readUnsignedShort());
			@SuppressWarnings("unused")
			boolean switchScreenMode = stream.readUnsignedByte() == 1;
			if (!player.hasStarted() || player.hasFinished() || displayMode == player.getDisplayMode()/* || !player.getInterfaceManager().containsInterface(742)*/)
				return;
			player.setDisplayMode(displayMode);
			/*player.getInterfaceManager().removeAll();
			player.getInterfaceManager().sendInterfaces();
			player.getInterfaceManager().sendCentralInterface(742);*/
		} else if (opcode == CLICK_PACKET) {
			int mouseHash = stream.readShort128();
			int mouseButton = mouseHash >> 15;
							int time = mouseHash - (mouseButton << 15); // time
							int positionHash = stream.readInt();
							int y = positionHash >> 16; // y;
							int x = positionHash - (y << 16); // x
							@SuppressWarnings("unused")
							boolean clicked;
							// mass click or stupid autoclicker, lets stop lagg
							if (time <= 1 || x < 0 || x > player.getScreenWidth() || y < 0 || y > player.getScreenHeight()) {
								// player.getSession().getChannel().close();
								clicked = false;
								return;
							}
							clicked = true;
		} else if (opcode == CLICK_PACKET_2) { //TODO

		} else if (opcode == DIALOGUE_CONTINUE_PACKET) {
			int junk = stream.readShortLE128();
			int interfaceHash = stream.readIntV2();
			int interfaceId = interfaceHash >> 16;
							int buttonId = (interfaceHash & 0xFF);
							if (Utils.getInterfaceDefinitionsSize() <= interfaceId) {
								// hack, or server error or client error
								// player.getSession().getChannel().close();
								return;
							}
							if (Settings.DEBUG)
								Logger.log(this, "Dialogue: " + interfaceId + ", " + buttonId + ", " + junk);
							if (!player.isRunning() || !player.getInterfaceManager().containsInterface(interfaceId))
								return;
							int componentId = interfaceHash - (interfaceId << 16);
							player.getDialogueManager().continueDialogue(interfaceId, componentId);
		} else if (opcode == WORLD_MAP_CLICK) {
			int coordinateHash = stream.readIntV2();
			int x = coordinateHash >> 14;
							int y = coordinateHash & 0x3fff;
							int plane = coordinateHash >> 28;
							Integer hash = (Integer) player.getTemporaryAttributtes().get("worldHash");
							if (hash == null || coordinateHash != hash)
								player.getTemporaryAttributtes().put("worldHash", coordinateHash);
							else {
								player.getTemporaryAttributtes().remove("worldHash");
								player.getHintIconsManager().addHintIcon(x, y, plane, 20, 0, 2, -1, true);
								player.getVarsManager().sendVar(2807, coordinateHash);
							}
		} else if (opcode == ACTION_BUTTON1_PACKET || opcode == ACTION_BUTTON2_PACKET || opcode == ACTION_BUTTON4_PACKET || opcode == ACTION_BUTTON5_PACKET || opcode == ACTION_BUTTON6_PACKET || opcode == ACTION_BUTTON7_PACKET || opcode == ACTION_BUTTON8_PACKET || opcode == ACTION_BUTTON3_PACKET || opcode == ACTION_BUTTON9_PACKET || opcode == ACTION_BUTTON10_PACKET) {
			ButtonHandler.handleButtons(player, stream, opcode);
		} else if (opcode == ENTER_NAME_PACKET) {
			if (!player.isRunning() || player.isDead() || !player.getInterfaceManager().containsInputTextInterface())
				return;
			player.getInterfaceManager().removeInputTextInterface();
			String value = stream.readString();
			if (value.equals(""))
				return;
			if (player.getInterfaceManager().containsInterface(1108))
				player.getFriendsIgnores().setChatPrefix(value);
			else if (player.getTemporaryAttributtes().remove("setclan") != null)
				ClansManager.createClan(player, value);
			else if (player.getTemporaryAttributtes().remove("joinguestclan") != null)
				ClansManager.connectToClan(player, value, true);
			else if (player.getTemporaryAttributtes().remove("banclanplayer") != null)
				ClansManager.banPlayer(player, value);
			else if (player.getTemporaryAttributtes().remove("unbanclanplayer") != null)
				ClansManager.unbanPlayer(player, value);
			else if (player.getTemporaryAttributtes().remove(Key.DUNGEON_INVITE) != null)
				player.getDungManager().invite(value);
			else if (player.getTemporaryAttributtes().remove(Key.CLAN_WARS_VIEW) != null)
				ClanWars.enter(player, value);
			else if (player.getTemporaryAttributtes().remove("enterhouse") != null)
				House.enterHouse(player, value);
			else{
				Boss boss = (Boss) player.getTemporaryAttributtes().remove(Key.JOIN_BOSS_INSTANCE);
				if(boss != null)
					BossInstanceHandler.joinInstance(player, boss, value.toLowerCase(), false);
			}
		} else if (opcode == ENTER_LONG_TEXT_PACKET) {
			if (!player.isRunning() || player.isDead() || !player.getInterfaceManager().containsInputTextInterface())
				return;
			player.getInterfaceManager().removeInputTextInterface();
			String value = stream.readString();
			if (value.equals(""))
				return;
			if(player.getTemporaryAttributtes().remove(Key.PERSONAL_MESSAGE) != null) {
				player.getPlayerExamineManager().setPersonalMessage(value);
			}else if (player.getTemporaryAttributtes().remove("entering_note") == Boolean.TRUE)
				player.getNotes().add(value);
			else if (player.getTemporaryAttributtes().remove("editing_note") == Boolean.TRUE)
				player.getNotes().edit(value);
			else if (player.getTemporaryAttributtes().remove("ticket_other") != null) {
				TicketSystem.addTicket(player, new TicketEntry(player, value));
				player.getDialogueManager().startDialogue("SimpleMessage", "Your ticket has been submitted.");
			} else if (player.getTemporaryAttributtes().remove("forum_authuserinput") == Boolean.TRUE) {
				player.getTemporaryAttributtes().put("forum_authuser", value);
				player.getTemporaryAttributtes().put("forum_authpasswordinput", true);
				player.getPackets().sendInputLongTextScript("Enter your forum password:");
			} else if (player.getTemporaryAttributtes().remove("forum_authpasswordinput") == Boolean.TRUE) {
				String authuser = (String) player.getTemporaryAttributtes().get("forum_authuser");
				String authpassword = value;
				if (authuser == null || authpassword == null)
					return;
				LoginClientChannelManager.sendReliablePacket(LoginChannelsPacketEncoder.encodeAccountVarUpdate(player.getUsername(), LoginProtocol.VAR_TYPE_AUTH, authuser + "@AUTHSPLIT@" + authpassword).getBuffer());
				player.getTemporaryAttributtes().remove("forum_authuser");
				//player.getPackets().sendGameMessage("Feature disabled due to rework.");
			} else if (player.getTemporaryAttributtes().remove("change_troll_name") == Boolean.TRUE) {
				value = Utils.formatPlayerNameForDisplay(value);
				if (value.length() < 3 || value.length() > 14) {
					player.getPackets().sendGameMessage("You can't use a name shorter than 3 or longer than 14 characters.");
					return;
				}
				if (value.equalsIgnoreCase("none")) {
					player.getPetManager().setTrollBabyName(null);
				} else {
					player.getPetManager().setTrollBabyName(value);
					if (player.getPet() != null && player.getPet().getId() == Pets.TROLL_BABY.getBabyNpcId()) {
						player.getPet().setName(value);
					}
				}
			} else if (player.getTemporaryAttributtes().remove("yellcolor") == Boolean.TRUE) {
				if (value.length() != 6) {
					player.getPackets().sendGameMessage("The HEX yell color you wanted to pick cannot be longer and shorter then 6.");
				} else if (Utils.containsInvalidCharacter(value) || value.contains("_")) {
					player.getPackets().sendGameMessage("The requested yell color can only contain numeric and regular characters.");
				} else {
					player.setYellColor(value);
					player.getPackets().sendGameMessage("Your yell color has been changed to <col=" + player.getYellColor() + ">" + player.getYellColor() + "</col>.");
				}
			} else if (player.getTemporaryAttributtes().remove("setdisplay") == Boolean.TRUE) {
				if (Utils.invalidAccountName(Utils.formatPlayerNameForProtocol(value))) {
					player.getPackets().sendGameMessage("Name contains invalid characters or is too short/long.");
					return;
				}
				LoginClientChannelManager.sendReliablePacket(LoginChannelsPacketEncoder.encodeAccountVarUpdate(player.getUsername(), LoginProtocol.VAR_TYPE_DISPLAY_NAME, Utils.formatPlayerNameForDisplay(value)).getBuffer());
				//player.getPackets().sendGameMessage("Feature disabled due to rework.");
			} else if (player.getTemporaryAttributtes().remove(Key.CLAN_MOTTO) == Boolean.TRUE)
				ClansManager.setClanMottoInterface(player, value);
		} else if (opcode == ENTER_INTEGER_PACKET) {
			if (!player.isRunning() || player.isDead() || !player.getInterfaceManager().containsInputTextInterface())
				return;
			player.getInterfaceManager().removeInputTextInterface();
			int value = stream.readInt();
			if (value < 0)
				return;
			if ((player.getInterfaceManager().containsInterface(762)) || player.getInterfaceManager().containsInterface(11)) {
				Integer bank_item_X_Slot = (Integer) player.getTemporaryAttributtes().remove("bank_item_X_Slot");
				if (bank_item_X_Slot == null)
					return;
				player.getBank().setLastX(value);
				player.getBank().refreshLastX();
				if (player.getTemporaryAttributtes().remove("bank_isWithdraw") != null)
					player.getBank().withdrawItem(bank_item_X_Slot, value);
				else
					player.getBank().depositItem(bank_item_X_Slot, value, player.getInterfaceManager().containsInterface(11) ? false : true);
			} else if (player.getInterfaceManager().containsInterface(631) && player.getTemporaryAttributtes().get(Key.DUEL_COIN_WITHDRAWL) != null) {
				DuelArena arena = (DuelArena) player.getTemporaryAttributtes().get(Key.DUEL_COIN_WITHDRAWL);
				Controller control = player.getControlerManager().getControler();
				if (control == null || control != arena)
					return;
				int coinsAmount = player.getInventory().getCoinsAmount();
				if (coinsAmount == 0)
					return;
				else if (value >= coinsAmount)
					value = coinsAmount;
				arena.addItem(new Item(995, value));
			} else if (player.getInterfaceManager().containsInterface(300) && player.getTemporaryAttributtes().get(Key.FORGE_X) != null) {
				Integer index = (Integer) player.getTemporaryAttributtes().remove(Key.FORGE_X);
				if (index == null)
					return;
				boolean dungeoneering = false;
				if (index > 100) {
					index -= 100;
					dungeoneering = true;
				}
				player.closeInterfaces();
				player.getActionManager().setAction(new Smithing(index, value, dungeoneering));
			} else if (player.getInterfaceManager().containsInterface(AccessorySmithing.ACCESSORY_INTERFACE) && player.getTemporaryAttributtes().get(Key.JEWLERY_SMITH_COMP) != null) {
				AccessorySmithing.handleButtonClick(player, (int) player.getTemporaryAttributtes().get(Key.JEWLERY_SMITH_COMP), value);
			} else if (player.getInterfaceManager().containsInterface(Summoning.POUCHES_INTERFACE) && player.getTemporaryAttributtes().get(Key.INFUSE_X) != null) {
				boolean dungeoneering = (boolean) player.getTemporaryAttributtes().remove(Key.INFUSE_X);
				int item = (int) player.getTemporaryAttributtes().remove(Key.INFUSE_ITEM);
				Summoning.handlePouchInfusion(player, item >> 16, item & 0xFF, value, dungeoneering);
			} else if (player.getInterfaceManager().containsInterface(206) && player.getInterfaceManager().containsInterface(207)) {
				Integer pc_item_X_Slot = (Integer) player.getTemporaryAttributtes().remove("pc_item_X_Slot");
				if (pc_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("pc_isRemove") != null)
					player.getPriceCheckManager().removeItem(pc_item_X_Slot, value);
				else
					player.getPriceCheckManager().addItem(pc_item_X_Slot, value);
			} else if (player.getInterfaceManager().containsInterface(400)) {
				Integer create_tab_X_component = (Integer) player.getTemporaryAttributtes().remove("create_tab_X_component");
				if (create_tab_X_component == null)
					return;
				TabletMaking.handleTabletCreation(player, create_tab_X_component, value);
			} else if (player.getInterfaceManager().containsInterface(671) && player.getInterfaceManager().containsInterface(665)) {
				if (player.getFamiliar() == null || player.getFamiliar().getBob() == null)
					return;
				Integer bob_item_X_Slot = (Integer) player.getTemporaryAttributtes().remove("bob_item_X_Slot");
				if (bob_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("bob_isRemove") != null)
					player.getFamiliar().getBob().removeItem(bob_item_X_Slot, value);
				else
					player.getFamiliar().getBob().addItem(bob_item_X_Slot, value);
			} else if (player.getInterfaceManager().containsInterface(335) && player.getInterfaceManager().containsInterface(336)) {
				if (player.getTemporaryAttributtes().remove(Key.TRADE_COIN_WITHDRAWL) != null) {
					int coinsAmount = player.getInventory().getCoinsAmount();
					if (coinsAmount == 0)
						return;
					else if (value >= coinsAmount)
						value = coinsAmount;
					Item item = new Item(995, value);
					player.getInventory().removeItemMoneyPouch(item);
					player.getTrade().addItem(item);
					return;
				}
				Integer trade_item_X_Slot = (Integer) player.getTemporaryAttributtes().remove("trade_item_X_Slot");
				if (trade_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("trade_isRemove") != null)
					player.getTrade().removeItem(trade_item_X_Slot, value);
				else
					player.getTrade().addItem(trade_item_X_Slot, value);
			} else if (player.getInterfaceManager().containsInterface(403) && player.getTemporaryAttributtes().get("PlanksConvert") != null) {
				Sawmill.convertPlanks(player, (Plank) player.getTemporaryAttributtes().remove("PlanksConvert"), value);
			} else if (player.getInterfaceManager().containsInterface(902) && player.getTemporaryAttributtes().get("PlankMake") != null) {
				Integer type = (Integer) player.getTemporaryAttributtes().remove("PlankMake");
				if (player.getControlerManager().getControler() instanceof SawmillController)
					((SawmillController) player.getControlerManager().getControler()).cutPlank(type, value);
			} else if (player.getInterfaceManager().containsInterface(903) && player.getTemporaryAttributtes().get("PlankWithdraw") != null) {
				Integer type = (Integer) player.getTemporaryAttributtes().remove("PlankWithdraw");
				if (player.getControlerManager().getControler() instanceof SawmillController)
					((SawmillController) player.getControlerManager().getControler()).withdrawFromCart(type, value);
			} else if (player.getInterfaceManager().containsInterface(105) && player.getTemporaryAttributtes().remove("GEPRICESET") != null) {
				player.getGeManager().modifyPricePerItem(value);
			} else if (player.getInterfaceManager().containsInterface(105) && player.getTemporaryAttributtes().remove("GEQUANTITYSET") != null) {
				player.getGeManager().modifyAmount(value);
			} else if (player.getTemporaryAttributtes().remove("withdrawingPouch") == Boolean.TRUE) {
				player.getMoneyPouch().sendDynamicInteraction(value, true, MoneyPouch.TYPE_POUCH_INVENTORY);
			} else if (player.getControlerManager().getControler() != null && player.getTemporaryAttributtes().get(Key.SERVANT_REQUEST_ITEM) != null) {
				Integer type = (Integer) player.getTemporaryAttributtes().remove(Key.SERVANT_REQUEST_TYPE);
				Integer item = (Integer) player.getTemporaryAttributtes().remove(Key.SERVANT_REQUEST_ITEM);
				if (!player.getHouse().isLoaded() || !player.getHouse().getPlayers().contains(player) || type == null || item == null)
					return;
				player.getHouse().getServantInstance().requestType(item, value, type.byteValue());
			} else if (player.getTemporaryAttributtes().remove("xformring") == Boolean.TRUE)
				player.getAppearence().transformIntoNPC(value);
			else if (player.getTemporaryAttributtes().remove(Key.SELL_SPIRIT_SHARDS) != null)
				PetShopOwner.sellShards(player, value);
			else if (player.getTemporaryAttributtes().get("selected_neg") != null) {
				int selectedSkill = (int) player.getTemporaryAttributtes().get("selected_neg");
				int skillLevel = player.getSkills().getLevelForXp(selectedSkill);
				if (value >= skillLevel) {
					if (skillLevel == 1)
						value = 1;
					else
						value = skillLevel - 1;
				} else if (value == 0)
					value = 1;
				int skillOffset = skillLevel - value;
				if (skillOffset <= 0)
					skillOffset = 0;
				int price = SkillAlchemist.calculatePrice(player, skillOffset);
				player.getDialogueManager().finishDialogue();
				if (player.getInventory().getCoinsAmount() < price) {
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 5585, "You need " + price + " amount of coins, in order to reduce your level by " + skillOffset + ".");
					return;
				} else if (player.getEquipment().wearingArmour()) {
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 5585, "Please remove any equipment you have equipped, the tranmutation possibly could damage other metals and fabrics.");
					return;
				} else {
					if (player.getFamiliar() != null)
						player.getFamiliar().dissmissFamiliar(false);
					player.getPrayer().closeAllPrayers();
					player.getSkills().set(selectedSkill, value);
					player.getSkills().setXp(selectedSkill, Skills.getXPForLevel(value));
					player.getAppearence().generateAppearenceData();
					player.getInventory().removeItemMoneyPouch(new Item(995, price));
					player.getDialogueManager().startDialogue("SimpleMessage", "As your coins transmute, you begin feel like your forgetting something...");
					if (player.isExtremeDonator())
						player.getPackets().sendGameMessage("You notice that your gold is still the same quantity as before....");
				}
			} else if (player.getTemporaryAttributtes().remove("kilnX") != null) {
				int componentId = (Integer) player.getTemporaryAttributtes().get("sc_component");
				if (player.getControlerManager().getControler() instanceof StealingCreationController) {
					StealingCreationController controller = (StealingCreationController) player.getControlerManager().getControler();
					player.getTemporaryAttributtes().put("sc_amount_making", value);
					controller.processKilnExchange(componentId, 50);
				}
			} else if (player.getTemporaryAttributtes().get("sc_request") != null) {
				int requestedId = (int) player.getTemporaryAttributtes().get("sc_request");
				WorldTile tile = (WorldTile) player.getTemporaryAttributtes().get("sc_object");
				if (ItemDefinitions.getItemDefinitions(requestedId).isStackable()) {
					FloorItem item = World.getRegion(player.getRegionId()).getGroundItem(requestedId, tile, player);
					if (item == null)
						return;
					if (item.getAmount() > value) {
						World.addGroundItem(new Item(requestedId, item.getAmount() - value), tile);
						item.setAmount(value);
					}
					if (player.getControlerManager().canTakeItem(item))
						World.removeGroundItem(player, item);
				} else {
					if (value > 28)
						value = 28;
					for (int i = 0; i < value; i++) {
						FloorItem item = World.getRegion(player.getRegionId()).getGroundItem(requestedId, tile, player);
						if (item == null || !player.getControlerManager().canTakeItem(item))
							break;
						World.removeGroundItem(player, item);
					}
				}
			} else if (player.getTemporaryAttributtes().get("skillId") != null) {
				Integer skill = (Integer) player.getTemporaryAttributtes().remove("skillId");
				player.getDialogueManager().finishDialogue();
				if (value > 99) {
					player.getPackets().sendGameMessage("Please choose a valid level.");
					return;
				}
				player.getSkills().set(skill, value);
				player.getSkills().setXp(skill, Skills.getXPForLevel(value));
				player.getPrayer().closeAllPrayers();
				player.getAppearence().generateAppearenceData();
			}
		} else if (opcode == SWITCH_INTERFACE_COMPONENTS_PACKET) {
			int toSlotId2 = stream.readUnsignedShort128();
			int fromSlotId2 = stream.readUnsignedShortLE128();
			int toInterfaceHash = stream.readIntV1();
			int fromInterfaceHash = stream.readInt();
			int toSlot = stream.readUnsignedShortLE128();
			int fromSlot = stream.readUnsignedShort();

			int toInterfaceId = toInterfaceHash >> 16;
			int toComponentId = toInterfaceHash - (toInterfaceId << 16);
			int fromInterfaceId = fromInterfaceHash >> 16;
			int fromComponentId = fromInterfaceHash - (fromInterfaceId << 16);
			if (Settings.DEBUG)
				System.out.println("Switch item " + fromInterfaceId + ", " + toInterfaceId+", "+fromSlot + ", " + toSlot+", "+fromComponentId+", "+toComponentId);

			if (Utils.getInterfaceDefinitionsSize() <= fromInterfaceId || Utils.getInterfaceDefinitionsSize() <= toInterfaceId)
				return;
			if (!player.getInterfaceManager().containsInterface(fromInterfaceId) || !player.getInterfaceManager().containsInterface(toInterfaceId))
				return;
			if (fromComponentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(fromInterfaceId) <= fromComponentId)
				return;
			if (toComponentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(toInterfaceId) <= toComponentId)
				return;
			if ((fromInterfaceId == Inventory.INVENTORY_INTERFACE || fromInterfaceId == Inventory.INVENTORY_INTERFACE_2) && (toInterfaceId == Inventory.INVENTORY_INTERFACE || toInterfaceId == Inventory.INVENTORY_INTERFACE_2)) {
				if (toSlot < 0 || toSlot >= player.getInventory().getItemsContainerSize() || fromSlot >= player.getInventory().getItemsContainerSize())
					return;
				player.getInventory().switchItem(fromSlot, toSlot);
			} else if ((fromInterfaceId == Inventory.INVENTORY_INTERFACE || fromInterfaceId == Inventory.INVENTORY_INTERFACE_2) && ((toInterfaceId == 1462 && toComponentId == 14) || (toInterfaceId == 1464 && toComponentId == 15)) ) {
				if (fromSlot >= player.getInventory().getItemsContainerSize() || player.getInterfaceManager().containsInventoryInter())
					return;
				Item item = player.getInventory().getItem(fromSlot);
				if(item == null)
					return;
				ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item.getId());
				if(!defs.isWearItem())
					return;
				InventoryOptionsHandler.handleItemOption2(player, fromSlot, item.getId(), item);
			} else if (((fromInterfaceId == 1462 && fromComponentId == 14) || (fromInterfaceId == 1464 && fromComponentId == 15)) && (toInterfaceId == Inventory.INVENTORY_INTERFACE || toInterfaceId == Inventory.INVENTORY_INTERFACE_2) ) {
				if (fromSlot >= player.getEquipment().getItems().getSize() || player.getInterfaceManager().containsInventoryInter())
					return;

				Item item = player.getEquipment().getItem(fromSlot);
				if(item == null)
					return;
				ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item.getId());
				if(!defs.isWearItem())
					return;
				player.getEquipment().handleEquipment(defs.getEquipSlot(), item.getId(), WorldPacketsDecoder.ACTION_BUTTON1_PACKET);
			} else if (toInterfaceId == 1430 && (toComponentId >= 55 && toComponentId <= 229)
					|| (toInterfaceId == 1436 && (toComponentId >= 25 && toComponentId <= 194))) {  //ability bar
				//switch shortcut
				if (fromInterfaceId == 1430 && (fromComponentId >= 55 && fromComponentId <= 229)
						|| (fromInterfaceId == 1436 && (fromComponentId >= 25 && fromComponentId <= 194)))
					player.getActionbar().switchShortcut((fromComponentId - (fromInterfaceId == 1430 ? 55 : 25)) / 13, (toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13);
				//item shortcut inv
				else if(fromInterfaceId == Inventory.INVENTORY_INTERFACE || fromInterfaceId == Inventory.INVENTORY_INTERFACE_2) {
					if (fromSlot >= player.getInventory().getItemsContainerSize())
						return;
					Item item = player.getInventory().getItem(fromSlot);
					if(item == null || item.getId() != fromSlotId2)
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, new ItemShortcut(item.getId()));
					//item shortcut equip
				} else if((fromInterfaceId == 1464 && fromComponentId == 15)|| (fromInterfaceId == 1464 && fromComponentId == 14)) {
					if (fromSlot >= player.getEquipment().getItems().getSize())
						return;
					Item item = player.getEquipment().getItem(fromSlot);
					if(item == null || item.getId() != fromSlotId2)
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, new ItemShortcut(item.getId()));
					//spell shortcut
					//Switch item 1464, 1430, 3, 65535, 15, 142
				} else if (fromInterfaceId == 1461 && fromComponentId == 1) {
					if (Magic.getSpellData(fromSlot) == null) //fake spell
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, new MagicAbilityShortcut(fromSlot));

				} else if (fromInterfaceId == 1449 && fromComponentId == 1) {
					boolean usingDefenceAbilities = player.getCombatDefinitions().onDefenceMenu();
					if (ActionBar.getAbilityData(usingDefenceAbilities ? ActionBar.DEFENCE_ABILITY_SHORTCUT : ActionBar.HEAL_ABILITY_SHORTCUT, fromSlot) == null) //fake spell
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, usingDefenceAbilities ? new DefenceAbilityShortcut(fromSlot) : new HealAbilityShortcut(fromSlot));
				} else if (fromInterfaceId == 1452 && fromComponentId == 1) {
					if (ActionBar.getAbilityData(ActionBar.RANGED_ABILITY_SHORTCUT, fromSlot) == null) //fake spell
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, new RangeAbilityShortcut(fromSlot));
					//prayer shortcut
				} else if (fromInterfaceId == 1460 && fromComponentId == 1) {
					boolean usingStrAbilities = player.getCombatDefinitions().onStrengthMenu();
					if (ActionBar.getAbilityData(usingStrAbilities ? ActionBar.STRENGTH_ABILITY_SHORTCUT : ActionBar.MELEE_ABILITY_SHORTCUT, fromSlot) == null) //fake spell 
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, usingStrAbilities ? new StrengthAbilityShortcut(fromSlot) : new MeleeAbilityShortcut(fromSlot));
				} else if (fromInterfaceId == 1458 && fromComponentId == 31) {
					if(!player.getPrayer().exists(fromSlot))
						return;
					player.getActionbar().setShortcut((toComponentId - (toInterfaceId == 1430 ? 55 : 25)) / 13, new PrayerShortcut(fromSlot, player.getPrayer().isAncientCurses()));
				}
			} else if (fromInterfaceId == 1430 && (fromComponentId >= 55 && fromComponentId <= 229)
					|| (fromInterfaceId == 1436 && (fromComponentId >= 25 && fromComponentId <= 194))) { //ability bar drag
				//inventory droping drag
				if((toInterfaceId == InterfaceManager.RESIZABLE_WINDOW_ID && toComponentId == 18)) 
					player.getActionbar().clearShortcut((fromComponentId - (fromInterfaceId == 1430 ? 55 : 25)) / 13);
			} else if ((fromInterfaceId == Inventory.INVENTORY_INTERFACE || fromInterfaceId == Inventory.INVENTORY_INTERFACE_2) && (toInterfaceId == InterfaceManager.RESIZABLE_WINDOW_ID && toComponentId == 18)) {
				if (fromSlot >= player.getInventory().getItemsContainerSize())
					return;
				Item item = player.getInventory().getItem(fromSlot);
				if(item == null || item.getId() != fromSlotId2)
					return;
				InventoryOptionsHandler.handleItemOption7(player, fromSlot, fromSlotId2, item);
			} else if (fromInterfaceId == 762 && toInterfaceId == 762) {
				if(fromComponentId == 7 && toComponentId == 7) {
					if (toSlot >= player.getInventory().getItemsContainerSize() || fromSlot >= player.getInventory().getItemsContainerSize())
						return;
					player.getInventory().switchItem(fromSlot, toSlot);
				}else if (fromComponentId == 215 && toComponentId == 215) {
					player.getBank().switchItem(fromSlot, toSlot, fromComponentId, toComponentId);
				}
			} else if (fromInterfaceId == 1265 && toInterfaceId == 1266 && player.getTemporaryAttributtes().get("is_buying") != null) {
				if ((boolean) player.getTemporaryAttributtes().get("is_buying") == true) {
					Shop shop = (Shop) player.getTemporaryAttributtes().get("shop_instance");
					if (shop == null)
						return;
					// shop.buyItem(player, fromSlot, 1);
				}
			} else if ((fromInterfaceId == 34 || fromInterfaceId == 1417) && (toInterfaceId == 34 || toInterfaceId == 1417))
				player.getNotes().switchNotes(fromSlot, toSlot);
		} else if (opcode == DONE_LOADING_REGION_PACKET) {
			/*
			 * if(!player.clientHasLoadedMapRegion()) { //load objects and items
			 * here player.setClientHasLoadedMapRegion(); }
			 * //player.refreshSpawnedObjects(); //player.refreshSpawnedItems();
			 */
			if(!player.isRunAfterLoad())
				player.runAfterLoad();
			if (!player.clientHasLoadedMapRegionFinished()) {
				// load objects and items here
				player.setClientHasLoadedMapRegion();
				player.refreshSpawnedObjects();
				player.refreshSpawnedItems();
			}
		}else if (opcode == GARBAGE_CLEAR_PACKET) {
			if(!player.isRunAfterLoad())
				player.runAfterLoad();
			if (!player.clientHasLoadedMapRegionFinished()) {
				// load objects and items here
				player.setClientHasLoadedMapRegion();
				player.refreshSpawnedObjects();
				player.refreshSpawnedItems();
			}
		} else if (opcode == WALKING_PACKET || opcode == MINI_WALKING_PACKET || opcode == GROUND_ITEM_OPTION_2 || opcode == ITEM_TAKE_PACKET || opcode == PLAYER_OPTION_2_PACKET || opcode == PLAYER_OPTION_3_PACKET || opcode == PLAYER_OPTION_4_PACKET || opcode == PLAYER_OPTION_6_PACKET || opcode == PLAYER_OPTION_9_PACKET || opcode == PLAYER_OPTION_1_PACKET || opcode == ATTACK_NPC_PACKET || opcode == INTERFACE_ON_PLAYER || opcode == INTERFACE_ON_NPC || opcode == NPC_CLICK1_PACKET || opcode == NPC_CLICK2_PACKET || opcode == NPC_CLICK3_PACKET || opcode == NPC_CLICK4_PACKET || opcode == OBJECT_CLICK1_PACKET || opcode == SWITCH_INTERFACE_COMPONENTS_PACKET || opcode == OBJECT_CLICK2_PACKET || opcode == OBJECT_CLICK3_PACKET || opcode == OBJECT_CLICK4_PACKET || opcode == OBJECT_CLICK5_PACKET || opcode == INTERFACE_ON_OBJECT) {
			if (!player.isRunning())
				return;
			player.addLogicPacketToQueue(new LogicPacket(opcode, stream));
		} else if (opcode == OBJECT_EXAMINE_PACKET) {
			ObjectHandler.handleOption(player, stream, -1);
		} else if (opcode == NPC_EXAMINE_PACKET) {
			NPCHandler.handleExamine(player, stream);
		} else if (opcode == JOIN_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			String str = stream.getLength() == 0 ? null : stream.readString();
			if (str == null)
				FriendsChat.requestLeave(player);
			else
				FriendsChat.requestJoin(player, Utils.formatPlayerNameForDisplay(str));
		} else if (opcode == KICK_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if (player.getCurrentFriendsChat() != null)
				player.getCurrentFriendsChat().kickMember(player, Utils.formatPlayerNameForDisplay(stream.readString()));
		} else if (opcode == KICK_CLAN_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			boolean guest = stream.readByte() == 1;
			if (!guest)
				return;
			stream.readUnsignedShort();
			player.kickPlayerFromClanChannel(stream.readString());
		} else if (opcode == CHANGE_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted() || !player.getInterfaceManager().containsInterface(1108))
				return;
			player.getFriendsIgnores().changeRank(Utils.formatPlayerNameForDisplay(stream.readString()), stream.readUnsignedByteC());
		} else if (opcode == UPDATE_GAMEBAR_PACKET) {
			if (!player.hasStarted())
				return;
			int public_ = stream.readUnsignedByte();
			int private_ = stream.readUnsignedByte();
			int trade = stream.readUnsignedByte();
			if (!player.isLobby()) {
				player.setPublicStatus(public_);
				player.setTradeStatus(trade);
			}
			player.getFriendsIgnores().setPmStatus(private_, true);
		} else if (opcode == ADD_FRIEND_PACKET) {
			if (!player.hasStarted())
				return;
			player.getFriendsIgnores().addFriend(Utils.formatPlayerNameForDisplay(stream.readString()));
		} else if (opcode == REMOVE_FRIEND_PACKET) {
			if (!player.hasStarted())
				return;
			player.getFriendsIgnores().removeFriend(Utils.formatPlayerNameForDisplay(stream.readString()));
		} else if (opcode == ADD_IGNORE_PACKET) {
			if (!player.hasStarted())
				return;
			player.getFriendsIgnores().addIgnore(Utils.formatPlayerNameForDisplay(stream.readString()), stream.readUnsignedByte() == 1);
		} else if (opcode == REMOVE_IGNORE_PACKET) {
			if (!player.hasStarted())
				return;
			player.getFriendsIgnores().removeIgnore(Utils.formatPlayerNameForDisplay(stream.readString()));
		} else if (opcode == SEND_FRIEND_MESSAGE_PACKET) {
			if (!player.hasStarted())
				return;
			String target = stream.readString();
			String message = Huffman.decodeString(150, stream);
			player.getFriendsIgnores().sendPrivateMessage(target, message);
		} else if (opcode == SEND_FRIEND_QUICK_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			String target = stream.readString();
			int qcFileId = stream.readUnsignedShort();
			long[] data = null;
			QuickChatOptionDefinition option = QuickChatOptionDefinition.loadOption(qcFileId);
			if (option.dynamicDataTypes != null) {
				data = new long[option.dynamicDataTypes.length];
				for (int i = 0; i < option.dynamicDataTypes.length; i++) {
					if (option.getType(i).clientToServerBytes > 0) {
						data[i] = stream.readDynamic(option.getType(i).clientToServerBytes);
					}

				}
			}
			player.getFriendsIgnores().sendPrivateMessage(target, option, data);
		} else if (opcode == PUBLIC_QUICK_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if (player.getLastPublicMessage() > Utils.currentTimeMillis())
				return;
			player.setLastPublicMessage(Utils.currentTimeMillis() + 300);

			int quickChatType = stream.readUnsignedByte(); //quickchat does not use chattype as it's only temporary!!!

			int qcFileId = stream.readUnsignedShort();

			long[] data = null;
			QuickChatOptionDefinition option = QuickChatOptionDefinition.loadOption(qcFileId);
			if (option.dynamicDataTypes != null) {
				data = new long[option.dynamicDataTypes.length];
				for (int i = 0; i < option.dynamicDataTypes.length; i++) {
					if (option.getType(i).clientToServerBytes > 0) {
						data[i] = stream.readDynamic(option.getType(i).clientToServerBytes);
					}

				}
			}
			if (quickChatType == 0)
				player.sendPublicChatMessage(new QuickChatMessage(player, option, data));
			else if (quickChatType == 1) {
				if (player.getCurrentFriendsChat() != null)
					player.getCurrentFriendsChat().sendMessage(player, option, data);
			} else if (quickChatType == 2)
				player.sendClanChannelQuickMessage(new QuickChatMessage(player, option, data));
			else if (quickChatType == 3)
				player.sendGuestClanChannelQuickMessage(new QuickChatMessage(player, option, data));
			else if (Settings.DEBUG)
				Logger.log(this, "Unknown chat type: " + quickChatType);
		} else if (opcode == CHAT_TYPE_PACKET) {
			chatType = stream.readUnsignedByte();
		} else if (opcode == CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if (player.getLastPublicMessage() > Utils.currentTimeMillis())
				return;
			player.setLastPublicMessage(Utils.currentTimeMillis() + 300);
			int colorEffect = stream.readUnsignedByte();
			int moveEffect = stream.readUnsignedByte();
			String message = Huffman.decodeString(200, stream);
			if (message == null || message.replaceAll(" ", "").equals(""))
				return;
			if (message.startsWith("::") || message.startsWith(";;")) {
				// if command exists and processed wont send message as public
				// message
				Commands.processCommand(player, message.replace("::", "").replace(";;", ""), false, false);
				return;
			}
			if (player.isMuted()) {
				player.getPackets().sendGameMessage("You temporary muted. Recheck in 48 hours.");
				return;
			}
			int effects = (colorEffect << 8) | (moveEffect & 0xff);
			if ((effects & 0x8000) != 0)
				return; //someone trying to crash server using qc as chat effect in normal chat
			if (chatType == 1) {
				if (player.getCurrentFriendsChat() != null) {
					if(message.equals("[Attempting to kick/ban user from this Friends Chat.]")) 
						return;
					player.getCurrentFriendsChat().sendMessage(player, message);
				}
			} else if (chatType == 2)
				player.sendClanChannelMessage(new ChatMessage(message));
			else if (chatType == 3)
				player.sendGuestClanChannelMessage(new ChatMessage(message));
			else {
				//Think i also fixed the large view scene thing, but just incase, spoof message
				if (player.getControlerManager().getControler() instanceof DungeonController) {
					for (Player party : player.getDungManager().getParty().getTeam()) {
						/*if (player.getLocalPlayerUpdate().getLocalPlayers()[party.getIndex()] == null || party.getLocalPlayerUpdate().getLocalPlayers()[player.getIndex()] == null) {
							party.getPackets().sendGameMessage(player.getDisplayName() + ":<col=7fa9ff> " + message);
						}*/
						party.getPackets().sendPublicMessage(player, new PublicChatMessage(message, effects));
					}
				} else
					player.sendPublicChatMessage(new PublicChatMessage(message, effects));
			}
			if (Settings.DEBUG)
				Logger.log(this, "Chat type: " + chatType);
		} else if (opcode == COMMANDS_PACKET) {
			if (!player.isRunning())
				return;
			boolean clientCommand = stream.readUnsignedByte() == 1;
			@SuppressWarnings("unused")
			boolean unknown = stream.readUnsignedByte() == 1;
			String command = stream.readString();
			if (!Commands.processCommand(player, command, true, clientCommand) && Settings.DEBUG)
				Logger.log(this, "Command: " + command);
		} else if (opcode == COLOR_ID_PACKET) {
			if (!player.hasStarted())
				return;
			int colorId = stream.readUnsignedShort();
			if (player.getTemporaryAttributtes().get("SkillcapeCustomize") != null)
				SkillCapeCustomizer.handleSkillCapeCustomizerColor(player, colorId);
			else if (player.getTemporaryAttributtes().get("MottifCustomize") != null)
				ClansManager.setMottifColor(player, colorId);
			else if (player.getTemporaryAttributtes().remove(Key.COSTUME_COLOR_CUSTOMIZE) != null)
				SkillCapeCustomizer.handleCostumeColor(player, colorId);
		} else if (opcode == REPORT_ABUSE_PACKET) {
			if (!player.hasStarted())
				return;
			String displayName = stream.readString();
			int type = stream.readUnsignedByte();
			boolean mute = stream.readUnsignedByte() == 1;
			@SuppressWarnings("unused")
			String unknown2 = stream.readString();
			ReportAbuse.report(player, displayName, type, mute);
		} else if (opcode == FORUM_THREAD_ID_PACKET) {
			String threadId = stream.readString();
			if (player.getInterfaceManager().containsInterface(1100))
				ClansManager.setThreadIdInterface(player, threadId);
			else if (Settings.DEBUG)
				Logger.log(this, "Called FORUM_THREAD_ID_PACKET: " + threadId);
		} else if (opcode == OPEN_URL_PACKET) {
			String type = stream.readString();
			String path = stream.readString();
			String unknown = stream.readString();
			int flag = stream.readUnsignedByte();
			if (Settings.DEBUG)
				Logger.log(WorldPacketsDecoder.class, "openUrl(" + type + "," + path + "," + unknown + "," + flag + ")");
			if (type.equals("clan-forum"))
				player.getPackets().sendOpenURL(Settings.SHOWTHREAD_LINK + path.replace("threads.ws?threadid=", ""));
			else if (path.contains("messages"))
				player.getPackets().sendOpenURL(Settings.VOTE_LINK);
			else if (path.contains("set_members_dob") || path.contains("userdetails"))
				player.getPackets().sendOpenURL(Settings.STORE_LINK);
			else if (path.contains("recoveries"))
				player.getPackets().sendOpenURL(Settings.OFFENCES_LINK);
			else if (path.contains("mod=email"))
				player.getPackets().sendOpenURL(Settings.EMAIL_LINK);
			else if (path.contains("title.ws") || path.toLowerCase().contains("squeal"))
				player.getPackets().sendOpenURL(Settings.FORUMS_LINK);
		} else if (opcode == GRAND_EXCHANGE_ITEM_SELECT_PACKET) {
			int itemId = stream.readUnsignedShort();
			player.getGeManager().chooseItem(itemId);
		} else {
			if (Settings.DEBUG)
				Logger.log(this, "Missing packet " + opcode + ", length: " + stream.getLength() + ", sizedef: " + PACKET_SIZES[opcode]);
		}
	}
}
