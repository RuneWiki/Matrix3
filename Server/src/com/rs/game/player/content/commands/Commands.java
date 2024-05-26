package com.rs.game.player.content.commands;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;

import com.rs.GameLauncher;
import com.rs.Settings;
import com.rs.cache.loaders.AnimationDefinitions;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.Colour;
import com.rs.game.EffectsManager;
import com.rs.game.EffectsManager.Effect;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Region;
import com.rs.game.SecondaryBar;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.minigames.FightPits;
import com.rs.game.minigames.clanwars.ClanWars;
import com.rs.game.minigames.clanwars.WallHandler;
import com.rs.game.minigames.stealingcreation.GameArea;
import com.rs.game.minigames.stealingcreation.Helper;
import com.rs.game.minigames.stealingcreation.StealingCreationController;
import com.rs.game.minigames.stealingcreation.StealingCreationManager;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.impl.NexCombat;
import com.rs.game.npc.randomEvent.CombatEventNPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.SlayerManager;
import com.rs.game.player.actions.HomeTeleport;
import com.rs.game.player.content.DonatorZone;
import com.rs.game.player.content.EconomyManager;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.LoyaltyProgram;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.Slayer.SlayerMaster;
import com.rs.game.player.content.StealingCreationShop;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.content.TicketSystem;
import com.rs.game.player.content.WildernessObelisk;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.DungeonPartyManager;
import com.rs.game.player.content.dungeoneering.DungeonRewardShop;
import com.rs.game.player.content.dungeoneering.Room;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.surpriseevents.ArenaFactory;
import com.rs.game.player.content.surpriseevents.EventArena;
import com.rs.game.player.content.surpriseevents.LastManStanding;
import com.rs.game.player.content.surpriseevents.SurpriseEvent;
import com.rs.game.player.content.surpriseevents.TeamVsTeam;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.Kalaboss;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.cutscenes.DZGuideScene;
import com.rs.game.player.cutscenes.NexCutScene;
import com.rs.game.route.Flags;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.WalkRouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.LoginClientChannelManager;
import com.rs.net.LoginProtocol;
import com.rs.net.encoders.LoginChannelsPacketEncoder;
import com.rs.utils.Censor;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

/*
 * doesnt let it be extended
 */
public final class Commands {

    /*
     * all console commands only for admin, chat commands processed if they not
     * processed by console
     */

    /**
     * returns if command was processed
     */
    public static boolean processCommand(Player player, String command, boolean console, boolean clientCommand) {
	if (command.length() == 0 || player.isLobby()) // if they used
						       // ::(nothing) theres no
						       // command
	    return false;
	String[] cmd = command.split(" ");
	if (cmd.length == 0)
	    return false;
	archiveLogs(player, cmd);
	if (player.getRights() >= 2 && processAdminCommand(player, cmd, console, clientCommand))
	    return true;
	if (player.getRights() >= 1 && processModCommand(player, cmd, console, clientCommand))
	    return true;
	if ((player.isSupporter() || player.getRights() >= 1)
		&& processSupportCommands(player, cmd, console, clientCommand))
	    return true;
	if ((player.isSupporter() || player.getRights() >= 1)
		&& processPunishmentCommand(player, cmd, console, clientCommand))
	    return true;
	if (!Settings.SPAWN_WORLD) {
	    return processNormalCommand(player, cmd, console, clientCommand);
	} else {
	    return processNormalCommand(player, cmd, console, clientCommand)
		    || processNormalSpawnCommand(player, cmd, console, clientCommand);
	}
    }

    public static boolean processPunishmentCommand(final Player player, String[] cmd, boolean console,
	    boolean clientCommand) {
	if (clientCommand)
	    return false;
	switch (cmd[0].toLowerCase()) {
	case "teletome":
	    if (player.getRights() < 2) {
		player.getPackets().sendGameMessage("Admin+ only!");
		return true;
	    }

	    String name = "";
	    for (int i = 1; i < cmd.length; i++)
		name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    Player target = World.getPlayerByDisplayName(name);
	    if (target == null)
		player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
	    else {
		target.lock(15);
		performTeleEmote(target);
		final Player _target = target;
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			_target.setNextAnimation(new Animation(-1));
			_target.setNextWorldTile(player);

		    }
		}, 5);
	    }
	    return true;
	case "colour":
	    player.setNextColour(new Colour(0, Integer.valueOf(cmd[5]), Integer.valueOf(cmd[1]),
		    Integer.valueOf(cmd[2]), Integer.valueOf(cmd[3]), Integer.valueOf(cmd[4])));
	    return true;
	case "unban":
	    if (player.getRights() < 2) {
		player.getPackets().sendGameMessage("Admin+ only!");
		return true;
	    }

	    name = "";
	    for (int i = 1; i < cmd.length; i++)
		name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    name = Utils.formatPlayerNameForDisplay(name);
	    LoginClientChannelManager.sendUnreliablePacket(LoginChannelsPacketEncoder
		    .encodeRemoveOffence(LoginProtocol.OFFENCE_REMOVETYPE_BANS, name, player.getUsername())
		    .getBuffer());
	    return true;
	case "unmute":
	    if (player.getRights() < 2) {
		player.getPackets().sendGameMessage("Admin+ only!");
		return true;
	    }

	    name = "";
	    for (int i = 1; i < cmd.length; i++)
		name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    name = Utils.formatPlayerNameForDisplay(name);
	    LoginClientChannelManager.sendUnreliablePacket(LoginChannelsPacketEncoder
		    .encodeRemoveOffence(LoginProtocol.OFFENCE_REMOVETYPE_MUTES, name, player.getUsername())
		    .getBuffer());
	    return true;
	case "punish":
	    name = "";
	    for (int i = 1; i < cmd.length; i++)
		name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    name = Utils.formatPlayerNameForDisplay(name);
	    player.getDialogueManager().startDialogue("AddOffenceD", name);
	    return true;
	case "forcekick":
	    if (player.getRights() < 2) {
		player.getPackets().sendGameMessage("Admin+ only!");
		return true;
	    }

	    name = "";
	    for (int i = 1; i < cmd.length; i++)
		name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    target = World.getPlayerByDisplayName(name);
	    if (target == null) {
		player.getPackets().sendGameMessage(Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
		return true;
	    }
	    target.disconnect(true, false);
	    player.getPackets().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
	    return true;
	default:
	    return false;
	}
    }

    private static boolean trollRunning = false;
    private static String trollTarget = null;

    private static TimerTask prjDebugTask = null;
    private static int prjDebugInterval = 600;
    private static int prjDebugTarget = -1, prjDebugStartAnim = -1, prjDebugStartGfx = -1, prjDebugPrjGfx = -1,
	    prjDebugDestAnim = -1, prjDebugDestGfx = -1, prjDebugStartHeight = -1, prjDebugEndHeight = -1,
	    prjDebugDelay = -1, prjDebugSpeed = -1, prjDebugSlope = -1, prjDebugAngle = -1;
    private static SurpriseEvent tst;

    public static boolean processAdminCommand(final Player player, String[] cmd, boolean console,
	    boolean clientCommand) {
	if (clientCommand) {
	    switch (cmd[0]) {
	    case "tele":
		cmd = cmd[1].split(",");
		int plane = Integer.valueOf(cmd[0]);
		int x = Integer.valueOf(cmd[1]) << 6 | Integer.valueOf(cmd[3]);
		int y = Integer.valueOf(cmd[2]) << 6 | Integer.valueOf(cmd[4]);
		player.setNextWorldTile(new WorldTile(x, y, plane));
		return true;
	    }
	} else {
	    String name;
	    Player target;
	    WorldObject object;
	    switch (cmd[0].toLowerCase()) {
	    case "emusic":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emusic effectId");
		    return true;
		}
		try {
		    player.getMusicsManager().playMusicEffect(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emusic effectId");
		}
		return true;
	    case "it":
		// new KingBlackDragonInstance(player, 1, 1, 0, 0, false);
		return true;

	    case "wave":
		World.sendGraphics(player, new Graphics(3560, 0, 0, Integer.parseInt(cmd[1]), true),
			new WorldTile(player));
		break;
	    case "hint":
		player.getHintIconsManager().addHintIcon(player, 3, 8000, false);
		break;
	    case "praybook":
		player.getPrayer().setPrayerBook(!player.getPrayer().isAncientCurses());
		break;
	    case "qbd":
		player.getControlerManager().startControler("QueenBlackDragonControler");
		break;
	    case "fade":
		FadingScreen.unfade(player, FadingScreen.fade(player, 1000), new Runnable() {

		    @Override
		    public void run() {

		    }

		});
		break;
	    case "task":
		// player.getPackets().sendExecuteScript(3971);
		player.getPackets().sendExecuteScriptReverse(3982, "123 lol", 1);
		// boolean open task, int unknown, task id
		// player.getPackets().sendExecuteScript(3976, 1,0, 10);

		player.getPackets().sendPanelBoxMessage("Sent1");
		return true;
	    case "pmsg":
		player.getPackets().sendEntityMessage(Integer.parseInt(cmd[2]), 0xFFFFFF, player, cmd[1]);
		return true;
	    case "ptest":
		EffectsManager.makePoisoned(player, Integer.parseInt(cmd[1]));
		return true;
	    case "girl":
		player.getAppearence().female();
		player.getAppearence().generateAppearenceData();
		return true;
	    case "randomevent":
		CombatEventNPC.startRandomEvent(player, Integer.parseInt(cmd[1]));
		return true;
	    case "book":
		player.getCombatDefinitions().setSpellBook(Integer.parseInt(cmd[1]));
		return true;
	    case "corruptxp":
		int skillid = Integer.parseInt(cmd[1]);
		target = World.getPlayer(cmd[2]);
		if (target != null)
		    target.getSkills().setXp(skillid, 14000000);
		return true;
	    case "anon":
		player.getAppearence().setIdentityHide(!player.getAppearence().isIdentityHidden());
		return true;
	    case "tvtcrt":
		tst = new TeamVsTeam();
		tst.start();
		return true;
	    case "lmscrt":
		tst = new LastManStanding();
		tst.start();
		return true;
	    case "lmsjoin":
		if (tst == null)
		    return true;
		tst.tryJoin(player);
		return true;
	    case "evearena":
		EventArena a = ArenaFactory.randomEventArena(true);
		if (a != null) {
		    a.create();
		    player.getPackets().sendGameMessage("Pos:" + a.minX() + "," + a.minY());

		    player.setForceNextMapLoadRefresh(true);
		    player.loadMapRegions();
		    player.setNextWorldTile(new WorldTile(a.minX(), a.minY(), 0));
		}
		break;
	    case "costumecolor":
		SkillCapeCustomizer.costumeColorCustomize(player);
		break;
	    case "comp":
		player.setCapturedCastleWarsFlag();
		player.setCompletedFightCaves();
		return true;
	    case "blatest":
		// player.getInterfaceManager()
		return true;
	    case "setprice":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: ::setprice i i");
		    return true;
		}
		GrandExchange.setPrice(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
		GrandExchange.savePrices();
		return true;
	    case "decantt":
		return true;
	    case "floorf":
		System.out.println(World.isFloorFree(player.getPlane(), player.getX(), player.getY()));
		return true;
	    case "leak":
		GameExecutorManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {

		    @Override
		    public void run() {
			if (player.hasFinished()) {
			    cancel();
			    return;
			}
			player.setForceNextMapLoadRefresh(true);
			player.loadMapRegions();

		    }

		}, 0, 5000);
		return true;
	    case "startlms":
		if (player.getRights() < 2) {
		    player.getPackets().sendGameMessage("Admin+ only!");
		    return true;
		}
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		if (name.length() <= 0) {
		    player.getPackets().sendGameMessage("bad name.");
		    return true;
		}
		if (player.getControlerManager().getControler() != null) {
		    player.getPackets().sendGameMessage("You can't start event here");
		    return true;
		}
		EconomyManager.startEvent(name, null, new LastManStanding());
		return true;
	    case "starttvt":
		if (player.getRights() < 2) {
		    player.getPackets().sendGameMessage("Admin+ only!");
		    return true;
		}
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		if (name.length() <= 0) {
		    player.getPackets().sendGameMessage("bad name.");
		    return true;
		}
		if (player.getControlerManager().getControler() != null) {
		    player.getPackets().sendGameMessage("You can't start event here");
		    return true;
		}
		EconomyManager.startEvent(name, null, new TeamVsTeam());
		return true;
	    case "startevent":
		if (player.getRights() < 2) {
		    player.getPackets().sendGameMessage("Admin+ only!");
		    return true;
		}
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		if (name.length() <= 0) {
		    player.getPackets().sendGameMessage("bad name.");
		    return true;
		}
		if (player.getControlerManager().getControler() != null) {
		    player.getPackets().sendGameMessage("You can't start event here");
		    return true;
		}
		EconomyManager.startEvent(name, new WorldTile(player.getX(), player.getY(), player.getPlane()), null);
		return true;
	    case "reloadshops":
		ShopsHandler.forceReload();
		return true;
	    case "shop":
		ShopsHandler.openShop(player, Integer.parseInt(cmd[1]));
		return true;
	    case "stopevent":
		if (player.getRights() < 2) {
		    player.getPackets().sendGameMessage("Admin+ only!");
		    return true;
		}
		EconomyManager.stopEvent();
		return true;
	    case "resethouse":
		player.getHouse().reset();
		player.getPackets().sendGameMessage("Reseted!");
		return true;
	    case "pestpoints":
		player.setCommendation(500);
		return true;
	    case "hide":
		player.getAppearence().setHidden(!player.getAppearence().isHidden());
		player.getPackets().sendGameMessage("Hidden:" + player.getAppearence().isHidden());
		return true;
	    case "maxdung":
		player.getDungManager().setMaxComplexity(6);
		player.getDungManager().setMaxFloor(60);
		return true;
	    case "empty":
		player.getInventory().reset();
		return true;
	    case "sprite":
		for (int i = 0; i < 100; i++)
		    player.getPackets().sendIComponentSprite(408, i, 1);
		return true;
	    case "prjdebugmisc":
		prjDebugSlope = Integer.parseInt(cmd[1]);
		prjDebugAngle = Integer.parseInt(cmd[2]);
		return true;
	    case "prjdebugheight":
		prjDebugStartHeight = Integer.parseInt(cmd[1]);
		prjDebugEndHeight = Integer.parseInt(cmd[2]);
		return true;
	    case "prjdebugdelay":
		prjDebugDelay = Integer.parseInt(cmd[1]);
		prjDebugSpeed = Integer.parseInt(cmd[2]);
		return true;
	    case "nextclue":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target != null) {
		    player.getTreasureTrailsManager().setNextClue(0);
		    player.getPackets().sendGameMessage("Complete.");
		    target.getPackets().sendGameMessage("Your clue has been automatically completed.");
		} else {
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		}
		return true;
	    case "forceitem":
		name = cmd[1];
		target = World.getPlayerByDisplayName(Utils.formatPlayerNameForProtocol(name));
		if (target != null) {
		    target.getInventory().addItemDrop(Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]));
		    player.getPackets().sendGameMessage("Complete.");
		    target.getPackets().sendGameMessage("Your have been given an item by " + player.getDisplayName());
		} else {
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		}
		return true;
	    case "prjdebugemote":
		prjDebugStartAnim = Integer.parseInt(cmd[1]);
		prjDebugStartGfx = Integer.parseInt(cmd[2]);
		prjDebugPrjGfx = Integer.parseInt(cmd[3]);
		prjDebugDestAnim = Integer.parseInt(cmd[4]);
		prjDebugDestGfx = Integer.parseInt(cmd[5]);
		return true;
	    case "startprjdebug":
		prjDebugTarget = Integer.parseInt(cmd[1]);
		int interval = Integer.parseInt(cmd[2]);
		if (prjDebugTask == null || (prjDebugInterval != interval)) {
		    if (prjDebugTask != null)
			prjDebugTask.cancel();
		    prjDebugInterval = interval;
		    GameExecutorManager.fastExecutor.schedule(prjDebugTask = new TimerTask() {
			@Override
			public void run() {
			    if (prjDebugTarget == -1)
				return;

			    Entity _target = null;
			    if (prjDebugTarget >= 0)
				_target = World.getNPCs().get(prjDebugTarget);
			    else
				_target = World.getPlayers().get((-prjDebugTarget) - 2);

			    if (_target == null)
				return;

			    player.getPackets().sendProjectileProper(player, player.getSize(), player.getSize(),
				    _target, _target.getSize(), _target.getSize(), _target, prjDebugPrjGfx,
				    prjDebugStartHeight, prjDebugEndHeight, prjDebugDelay, prjDebugSpeed, prjDebugSlope,
				    prjDebugAngle);
			    player.setNextAnimation(new Animation(prjDebugStartAnim));
			    player.setNextGraphics(new Graphics(prjDebugStartGfx));
			    _target.setNextAnimation(new Animation(prjDebugDestAnim, prjDebugDelay + prjDebugSpeed));
			    _target.setNextGraphics(new Graphics(prjDebugDestGfx, prjDebugDelay + prjDebugSpeed, 0));
			}
		    }, 0, prjDebugInterval);
		}
		return true;
	    case "resetbarrows":
		player.resetBarrows();
		return true;
	    case "stopprjdebug":
		prjDebugTarget = -1;
		return true;
	    case "enablebxp":
		World.sendWorldMessage("<col=551177>[Server Message] Bonus EXP has been" + "<col=88aa11> enabled.",
			false);
		if (!Settings.XP_BONUS_ENABLED)
		    World.addIncreaseElapsedBonusMinutesTak();
		Settings.XP_BONUS_ENABLED = true;
		return true;
	    case "disablebxp":
		World.sendWorldMessage("<col=551177>[Server Message] Bonus EXP has been" + "<col=990022> disabled.",
			false);
		Settings.XP_BONUS_ENABLED = false;
		return true;
	    case "stopsupertroll":
		trollTarget = null;
		return true;
	    case "checkpin":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target == null || !target.isRunning()) {
		    target.getPackets().sendGameMessage("Your target is currently offline.");
		    return true;
		}
		int pin = target.getBank().getPin();

		if (pin == -1) {
		    player.getPackets().sendGameMessage("Target has no current pin.");
		    return true;
		}

		int pin1 = pin >> 12;
		pin -= pin1 << 12;
		int pin2 = pin >> 8;
		pin -= pin2 << 8;
		int pin3 = pin >> 4;
		pin -= pin3 << 4;
		player.getPackets()
			.sendGameMessage("Target's pin is [" + pin1 + ", " + pin2 + ", " + pin3 + ", " + pin + "].");
		return true;
	    case "resetotheracc":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target == null) {
		    player.getPackets().sendGameMessage(name.toUpperCase() + " is currently offline.");
		    return true;
		}
		target.completeReset();
		player.getPackets().sendGameMessage(target.getDisplayName() + " has been successfully reset.");
		return true;

	    case "scshop":
		player.increaseStealingCreationPoints(100);
		StealingCreationShop.openInterface(player);
		return true;
	    case "clipflag":
		int mask = World.getMask(player.getPlane(), player.getX(), player.getY());
		StringBuilder flagbuilder = new StringBuilder();
		flagbuilder.append('(');
		for (Field field : Flags.class.getDeclaredFields()) {
		    try {
			if ((mask & field.getInt(null)) == 0)
			    continue;
		    } catch (Throwable t) {
			continue;
		    }

		    if (flagbuilder.length() <= 1) {
			flagbuilder.append("Flags." + field.getName());
		    } else {
			flagbuilder.append(" | Flags." + field.getName());
		    }
		}
		flagbuilder.append(')');
		System.err.println("Flag is:" + flagbuilder.toString());
		System.out.println(player.getXInRegion() + ", " + player.getYInRegion());
		return true;
	    case "walkto":
		int wx = Integer.parseInt(cmd[1]);
		int wy = Integer.parseInt(cmd[2]);
		boolean checked = cmd.length > 3 ? Boolean.parseBoolean(cmd[3]) : false;
		long rstart = System.nanoTime();
		int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, player.getX(), player.getY(),
			player.getPlane(), player.getSize(), new FixedTileStrategy(wx, wy), false);
		long rtook = (System.nanoTime() - rstart) - WalkRouteFinder.debug_transmittime;
		player.getPackets().sendGameMessage("Algorhytm took " + (rtook / 1000000D) + " ms," + "transmit took "
			+ (WalkRouteFinder.debug_transmittime / 1000000D) + " ms, steps:" + steps);
		int[] bufferX = RouteFinder.getLastPathBufferX();
		int[] bufferY = RouteFinder.getLastPathBufferY();
		for (int i = steps - 1; i >= 0; i--) {
		    player.addWalkSteps(bufferX[i], bufferY[i], Integer.MAX_VALUE, checked);
		}

		return true;
	    case "givespinsall":
		int type = Integer.parseInt(cmd[1]);
		if (type == 0) {
		    World.sendWorldMessage("<img=7><col=ff0000>News: " + player.getDisplayName()
			    + " has given everyone that's online " + cmd[2] + " earned spins!", false);
		    for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning())
			    continue;
			p.getSquealOfFortune().giveEarnedSpins(Integer.parseInt(cmd[2]));
		    }
		} else if (type == 1) {
		    World.sendWorldMessage("<img=7><col=ff0000>News: " + player.getDisplayName()
			    + " has given everyone that's online " + cmd[2] + " bought spins!", false);
		    for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning())
			    continue;
			p.getSquealOfFortune().giveBoughtSpins(Integer.parseInt(cmd[2]));
		    }
		} else if (type == 2) {
		    World.sendWorldMessage(
			    "<img=7><col=ff0000>News: " + player.getDisplayName() + " has reset that's online spins!",
			    false);
		    for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning())
			    continue;
			p.getSquealOfFortune().resetSpins();
		    }
		}
		return true;
	    case "loyalty":
		LoyaltyProgram.open(player);
		return true;
	    case "getspins":
		type = Integer.parseInt(cmd[1]);
		if (type == 0)
		    player.getSquealOfFortune().giveDailySpins();
		else if (type == 1)
		    player.getSquealOfFortune().giveEarnedSpins(Integer.parseInt(cmd[2]));
		else if (type == 2)
		    player.getSquealOfFortune().giveBoughtSpins(Integer.parseInt(cmd[2]));
		else if (type == 3)
		    player.getSquealOfFortune().resetSpins();
		else if (type == 4)
		    player.getSquealOfFortune().setDailySpins(Integer.parseInt(cmd[2]));
		return true;
	    case "ugd":
		player.getControlerManager().startControler("UnderGroundDungeon", false, true, true);
		return true;
	    case "ss2":
		player.getMoneyPouch().init();
		return true;
	    case "sendscriptblank":
		player.getPackets().sendExecuteScriptReverse(Integer.parseInt(cmd[1]));
		return true;
	    case "script":
		player.getPackets().sendExecuteScriptReverse(Integer.parseInt(cmd[1]));
		return true;
	    case "script1":
		player.getPackets().sendExecuteScript(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
		return true;
	    case "script2":
		player.getPackets().sendExecuteScript(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]),
			Integer.parseInt(cmd[3]));
		return true;
	    case "ss":
		player.getPackets().sendExecuteScriptReverse(8865, Integer.parseInt(cmd[1]));
		return true;
	    case "testresetsof":
		player.getPackets().sendExecuteScriptReverse(5879); // sof_setupHooks();
		// should work
		return true;
	    case "sendsofempty":
		player.getPackets().sendItems(665, new Item[13]);
		return true;
	    case "sendsofitems":
		Item[] items = new Item[13];
		for (int i = 0; i < items.length; i++)
		    items[i] = new Item(995, i + 1);// items[i] = new
		// Item(995,
		// Utils.random(1000000000)
		// + 1);
		player.getPackets().sendItems(665, items);
		return true;
	    case "senditems":
		for (int i = 0; i < 5000; i++)
		    player.getPackets().sendItems(i, new Item[] { new Item(i, 1) });
		return true;
	    case "forcewep":
		player.getAppearence().setForcedWeapon(Integer.parseInt(cmd[1]));
		return true;
	    case "clearst":
		for (Player p2 : World.getPlayers())
		    p2.getSlayerManager().skipCurrentTask(false);
		return true;
	    case "ectest":
		player.getDialogueManager().startDialogue("EconomyTutorialCutsceneDialog");
		return true;
	    case "ecotestcutscene":
		player.getCutscenesManager().play("EconomyTutorialCutscene");
		return true;
	    case "istest":
		player.getSlayerManager().sendSlayerInterface(SlayerManager.BUY_INTERFACE);
		return true;
	    case "st":
		player.getSlayerManager().setCurrentTask(true, SlayerMaster.KURADAL);
		return true;
	    case "addpoints":
		player.getSlayerManager().setPoints(5000);
		return true;
	    case "testdeath":
		player.getInterfaceManager().sendCentralInterface(18);
		player.getPackets().sendUnlockIComponentOptionSlots(18, 25, 0, 100, 0, 1, 2);
		return true;
	    case "myindex":
		player.getPackets().sendGameMessage("My index is:" + player.getIndex());
		return true;
	    case "gw":
		player.getControlerManager().startControler("GodWars");
		return true;
	    case "getspawned": {
		List<WorldObject> spawned = World.getRegion(player.getRegionId()).getSpawnedObjects();
		player.getPackets().sendGameMessage("region:" + player.getRegionId());
		player.getPackets().sendGameMessage("-------");
		for (WorldObject o : spawned) {
		    if (o.getChunkX() == player.getChunkX() && o.getChunkY() == player.getChunkY()
			    && o.getPlane() == player.getPlane()) {
			player.getPackets()
				.sendGameMessage(o.getId() + "," + o.getX() + "," + o.getY() + "," + o.getPlane());
		    }
		}
		player.getPackets().sendGameMessage("-------");
		return true;
	    }
	    case "removeobjects": {
		List<WorldObject> objects = World.getRegion(player.getRegionId()).getAllObjects();
		for (WorldObject o : objects) {
		    if (o.getChunkX() == player.getChunkX() && o.getChunkY() == player.getChunkY()
			    && o.getPlane() == player.getPlane()) {
			World.removeObject(o);
		    }
		}
		return true;
	    }
	    case "clearspot":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target != null) {
		    target.getFarmingManager().resetSpots();
		    player.getPackets().sendGameMessage("You have cleared the target's spot.");
		}
		return true;
	    case "switchyell":
		Settings.YELL_ENABLED = !Settings.YELL_ENABLED;
		player.getPackets().sendGameMessage("All yells are currently " + Settings.YELL_ENABLED);
		return true;
	    case "switchbadboy":
		Settings.YELL_FILTER_ENABLED = !Settings.YELL_FILTER_ENABLED;
		player.getPackets().sendGameMessage("The donators are currently "
			+ (Settings.YELL_FILTER_ENABLED ? "bad boys like obito." : "good boys like tobi."));
		return true;
	    case "clearall":// fail safe only
		for (Player p2 : World.getPlayers()) {
		    if (p2 == null)
			continue;
		    p2.getFarmingManager().resetSpots();
		}
		return true;
	    case "reward":
		DungeonRewardShop.openRewardShop(player);
		return true;
	    case "getclipflag": {
		mask = World.getMask(player.getPlane(), player.getX(), player.getY());
		player.getPackets().sendGameMessage("[" + mask + "]");
		return true;
	    }
	    case "scbariertest": {
		int minX = (player.getChunkX() << 3) + Helper.BARRIER_MIN[0];
		int minY = (player.getChunkY() << 3) + Helper.BARRIER_MIN[1];
		int maxX = (player.getChunkX() << 3) + Helper.BARRIER_MAX[0];
		int maxY = (player.getChunkY() << 3) + Helper.BARRIER_MAX[1];

		World.spawnObject(new WorldObject(39615, 1, 1, new WorldTile(minX, minY, 0)));
		World.spawnObject(new WorldObject(39615, 1, 2, new WorldTile(minX, maxY, 0)));
		World.spawnObject(new WorldObject(39615, 1, 3, new WorldTile(maxX, maxY, 0)));
		World.spawnObject(new WorldObject(39615, 1, 0, new WorldTile(maxX, minY, 0)));

		for (int x = minX + 1; x <= maxX - 1; x++) {
		    World.spawnObject(new WorldObject(39615, 0, 1, new WorldTile(x, minY, 0)));
		    World.spawnObject(new WorldObject(39615, 0, 3, new WorldTile(x, maxY, 0)));
		}
		for (int y = minY + 1; y <= maxY - 1; y++) {
		    World.spawnObject(new WorldObject(39615, 0, 2, new WorldTile(minX, y, 0)));
		    World.spawnObject(new WorldObject(39615, 0, 0, new WorldTile(maxX, y, 0)));
		}
		return true;
	    }
	    case "startscblue": {
		boolean team = cmd[0].contains("red");
		List<Player> blue = new ArrayList<Player>();
		List<Player> red = new ArrayList<Player>();
		(team ? red : blue).add(player);
		StealingCreationManager.createGame(8, blue, red);
		return true;
	    }
	    case "startscred": {
		boolean team = cmd[0].contains("red");
		List<Player> blue = new ArrayList<Player>();
		List<Player> red = new ArrayList<Player>();
		(team ? red : blue).add(player);
		Player p2 = World.getPlayer("cjaytest");
		if (p2 != null)
		    blue.add(p2);
		StealingCreationManager.createGame(8, blue, red);
		return true;
	    }
	    case "hugemap":
		player.setForceNextMapLoadRefresh(true);
		player.setMapSize(3);
		return true;
	    case "normmap":
		player.setForceNextMapLoadRefresh(true);
		player.setMapSize(0);
		return true;
	    case "testmap":
		player.setForceNextMapLoadRefresh(true);
		player.setMapSize(5);
		return true;
	    case "test":
		player.getInterfaceManager().sendMinigameInterface(316);
		player.getVarsManager().forceSendVar(3008, 1);
		return true;
	    case "testscarea":
		int size = cmd.length < 2 ? 8 : Integer.parseInt(cmd[1]);
		GameArea area = new GameArea(size);
		area.calculate();
		area.create();
		player.setNextWorldTile(new WorldTile(area.getMinX(), area.getMinY(), 0));
		return true;
	    case "sgar":
		player.getControlerManager().startControler("SorceressGarden");
		return true;
	    case "scg":
		player.getControlerManager().startControler("StealingCreationsGame", true);
		return true;
	    case "gesearch":
		player.getInterfaceManager().setInterface(true, 752, 7, 389);
		player.getPackets().sendExecuteScriptReverse(570, "Grand Exchange Item Search");
		return true;
	    case "ge":
		player.getGeManager().openGrandExchange();
		return true;
	    case "ge2":
		player.getGeManager().openCollectionBox();
		return true;
	    case "ge3":
		player.getGeManager().openHistory();
		return true;
	    case "configsize":
		player.getPackets().sendGameMessage("Config definitions size: 2633, BConfig size: 1929.");
		return true;
	    case "npcmask":
		for (NPC n : World.getNPCs()) {
		    if (n != null && Utils.getDistance(player, n) < 30) {
			n.setNextSecondaryBar(new SecondaryBar(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]),
				Integer.parseInt(cmd[3]), Boolean.parseBoolean(cmd[4])));
		    }
		}
		return true;
	    case "runespan":
		player.getControlerManager().startControler("RuneSpanControler");
		return true;
	    case "house":
		player.getHouse().enterMyHouse();
		return true;
	    case "killingfields":
		player.getControlerManager().startControler("KillingFields");
		return true;

	    case "isprite":
		player.getPackets().sendIComponentSprite(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
			Integer.valueOf(cmd[3]));
		// player.getPackets().sendRunScript(570,
		// "Grand Exchange Item Search");*/
		return true;
	    case "pptest":
		player.getDialogueManager().startDialogue("SimplePlayerMessage", "123");
		return true;
	    case "sd":
		/*
		 * int v = Integer.valueOf(cmd[1]);
		 * player.getAppearence().setHairStyle(v);
		 * player.getAppearence().setTopStyle(v);
		 * player.getAppearence().setBootsStyle(v);
		 * player.getAppearence().setArmsStyle(v);
		 * player.getAppearence().setHandsStyle(v);
		 * player.getAppearence().setLegsStyle(v);
		 * player.getAppearence().setBeardStyle(v);
		 * player.getAppearence().generateAppearenceData();
		 */
		return true;

	    case "debugobjects":
		Region r = World.getRegion(player.getRegionY() | (player.getRegionX() << 8));
		if (r == null) {
		    player.getPackets().sendGameMessage("Region is null!");
		    return true;
		}
		List<WorldObject> objects = r.getAllObjects();
		if (objects == null) {
		    player.getPackets().sendGameMessage("Objects are null!");
		    return true;
		}
		for (WorldObject o : objects) {
		    if (o == null || !o.matches(player)) {
			continue;
		    }
		    System.out.println("Objects coords: " + o.getX() + ", " + o.getY());
		    System.out.println(
			    "[Object]: id=" + o.getId() + ", type=" + o.getType() + ", rot=" + o.getRotation() + ".");
		}
		return true;
	    case "telesupport":
		for (Player staff : World.getPlayers()) {
		    if (!staff.isSupporter())
			continue;
		    staff.setNextWorldTile(player);
		    staff.getPackets()
			    .sendGameMessage("You been teleported for a staff meeting by " + player.getDisplayName());
		}
		return true;
	    case "telemods":
		for (Player staff : World.getPlayers()) {
		    if (staff.getRights() != 1)
			continue;
		    staff.setNextWorldTile(player);
		    staff.getPackets()
			    .sendGameMessage("You been teleported for a staff meeting by " + player.getDisplayName());
		}
		return true;
	    case "telestaff":
		for (Player staff : World.getPlayers()) {
		    if (!staff.isSupporter() && staff.getRights() != 1)
			continue;
		    staff.setNextWorldTile(player);
		    staff.getPackets()
			    .sendGameMessage("You been teleported for a staff meeting by " + player.getDisplayName());
		}
		return true;
	    case "teleallfree":
		for (Player p2 : World.getPlayers()) {
		    if (p2 == null || p2.getControlerManager().getControler() != null)
			continue;
		    p2.setNextWorldTile(player);
		}
		return true;
	    case "pickuppet":
		if (player.getPet() != null) {
		    player.getPet().pickup();
		    return true;
		}
		player.getPackets().sendGameMessage("You do not have a pet to pickup!");
		return true;
	    case "canceltask":
		name = "";
		for (int i = 1; i < cmd.length; i++) {
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		}
		target = World.getPlayerByDisplayName(name);
		if (target != null)
		    target.getSlayerManager().skipCurrentTask(false);
		return true;
	    case "messagetest":
		player.getPackets().sendMessage(Integer.parseInt(cmd[1]), "YO", player);
		return true;
	    case "restartfp":
		FightPits.endGame();
		player.getPackets().sendGameMessage("Fight pits restarted!");
		return true;
	    case "modelid":
		int id = Integer.parseInt(cmd[1]);
		player.getPackets().sendMessage(99,
			"Model id for item " + id + " is: " + ItemDefinitions.getItemDefinitions(id).modelId, player);
		return true;

	    case "pos":
		try {
		    File file = new File("data/positions.txt");
		    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		    writer.write("|| player.getX() == " + player.getX() + " && player.getY() == " + player.getY() + "");
		    writer.newLine();
		    writer.flush();
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return true;

	    case "agilitytest":
		player.getControlerManager().startControler("BrimhavenAgility");
		return true;
	    case "scare":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target != null) {
		    target.getPackets().sendOpenURL("http://puu.sh/1BUNT");
		    player.getPackets().sendGameMessage("You have scared: " + target.getDisplayName() + ".");
		}
		return true;

	    case "partyroom":
		player.getInterfaceManager().sendCentralInterface(647);
		player.getInterfaceManager().sendInventoryInterface(336);
		player.getPackets().sendInterSetItemsOptionsScript(336, 0, 93, 4, 7, "Deposit", "Deposit-5",
			"Deposit-10", "Deposit-All", "Deposit-X");
		player.getPackets().sendIComponentSettings(336, 0, 0, 27, 1278);
		player.getPackets().sendInterSetItemsOptionsScript(336, 30, 90, 4, 7, "Value");
		player.getPackets().sendIComponentSettings(647, 30, 0, 27, 1150);
		player.getPackets().sendInterSetItemsOptionsScript(647, 33, 90, 4, 7, "Examine");
		player.getPackets().sendIComponentSettings(647, 33, 0, 27, 1026);
		ItemsContainer<Item> store = new ItemsContainer<>(215, false);
		for (int i = 0; i < store.getSize(); i++) {
		    store.add(new Item(1048, i));
		}
		player.getPackets().sendItems(529, true, store); // .sendItems(-1,
		// -2, 529,
		// store);

		ItemsContainer<Item> drop = new ItemsContainer<>(215, false);
		for (int i = 0; i < drop.getSize(); i++) {
		    drop.add(new Item(1048, i));
		}
		player.getPackets().sendItems(91, true, drop);// sendItems(-1,
		// -2, 91,
		// drop);

		ItemsContainer<Item> deposit = new ItemsContainer<>(8, false);
		for (int i = 0; i < deposit.getSize(); i++) {
		    deposit.add(new Item(1048, i));
		}
		player.getPackets().sendItems(92, true, deposit);// sendItems(-1,
		// -2, 92,
		// deposit);
		return true;

	    case "objectname":
		name = cmd[1].replaceAll("_", " ");
		String option = cmd.length > 2 ? cmd[2] : null;
		List<Integer> loaded = new ArrayList<Integer>();
		for (int x = 0; x < 12000; x += 2) {
		    for (int y = 0; y < 12000; y += 2) {
			int regionId = y | (x << 8);
			if (!loaded.contains(regionId)) {
			    loaded.add(regionId);
			    r = World.getRegion(regionId, false);
			    r.loadRegionMap();
			    List<WorldObject> list = r.getAllObjects();
			    if (list == null) {
				continue;
			    }
			    for (WorldObject o : list) {
				if (o.getDefinitions().name.equalsIgnoreCase(name)
					&& (option == null || o.getDefinitions().containsOption(option))) {
				    System.out.println("Object found - [id=" + o.getId() + ", x=" + o.getX() + ", y="
					    + o.getY() + "]");
				    // player.getPackets().sendGameMessage("Object
				    // found - [id="
				    // + o.getId() + ", x=" + o.getX() +
				    // ", y="
				    // + o.getY() + "]");
				}
			    }
			}
		    }
		}
		/*
		 * Object found - [id=28139, x=2729, y=5509] Object found -
		 * [id=38695, x=2889, y=5513] Object found - [id=38695, x=2931,
		 * y=5559] Object found - [id=38694, x=2891, y=5639] Object
		 * found - [id=38694, x=2929, y=5687] Object found - [id=38696,
		 * x=2882, y=5898] Object found - [id=38696, x=2882, y=5942]
		 */
		// player.getPackets().sendGameMessage("Done!");
		System.out.println("Done!");
		return true;

	    case "bork":
		player.getControlerManager().startControler("BorkController");
		return true;

	    case "killnpc":
		for (NPC n : World.getNPCs()) {
		    if (n == null || n.getId() != Integer.parseInt(cmd[1]))
			continue;
		    n.applyHit(new Hit(player, n.getMaxHitpoints(), HitLook.REGULAR_DAMAGE));
		}
		return true;
	    case "sound":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::sound soundid");
		    return true;
		}
		try {
		    player.getPackets().sendSoundEffect(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::sound soundid");
		}
		return true;

	    case "music":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::music musicid");
		    return true;
		}
		try {
		    player.getMusicsManager().playMusic(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::music musicid");
		}
		return true;
	    case "testdialogue":
		player.getDialogueManager().startDialogue("DagonHai", 7137, player, Integer.parseInt(cmd[1]));
		return true;

	    case "removenpcs":
		for (NPC n : World.getNPCs()) {
		    if (n.getId() == Integer.parseInt(cmd[1])) {
			n.reset();
			n.finish();
		    }
		}
		return true;
	    case "resetkdr":
		player.setKillCount(0);
		player.setDeathCount(0);
		return true;

	    case "newtut":
		player.getControlerManager().startControler("TutorialIsland", 0);
		return true;

	    case "removecontroler":
		player.getControlerManager().forceStop();
		player.getInterfaceManager().sendInterfaces();
		return true;

	    case "nomads":
		for (Player p : World.getPlayers())
		    p.getControlerManager().startControler("NomadsRequiem");
		return true;

	    case "item":
		if (cmd.length < 2) {
		    player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
		    return true;
		} else if (player.getUsername().equalsIgnoreCase("elyx")) {
		    player.getPackets().sendGameMessage("Fuck off you mexican cunt.");
		    return true;
		}
		try {
		    int itemId = Integer.valueOf(cmd[1]);
		    player.getInventory().addItem(itemId, cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
		    player.stopAll();
		} catch (NumberFormatException e) {
		    player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
		}
		return true;

	    case "copy":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		Player p2 = World.getPlayerByDisplayName(name);
		if (p2 == null) {
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		    return true;
		}
		items = p2.getEquipment().getItems().getItemsCopy();
		for (int i = 0; i < items.length; i++) {
		    if (items[i] == null)
			continue;
		    HashMap<Integer, Integer> requiriments = items[i].getDefinitions().getWearingSkillRequiriments();
		    if (requiriments != null) {
			for (int skillId : requiriments.keySet()) {
			    if (skillId > 24 || skillId < 0)
				continue;
			    int level = requiriments.get(skillId);
			    if (level < 0 || level > 120)
				continue;
			    if (player.getSkills().getLevelForXp(skillId) < level) {
				name = Skills.SKILL_NAME[skillId].toLowerCase();
				player.getPackets().sendGameMessage("You need to have a"
					+ (name.startsWith("a") ? "n" : "") + " " + name + " level of " + level + ".");
			    }

			}
		    }
		    player.getEquipment().getItems().set(i, items[i]);
		    player.getEquipment().refresh(i);
		}
		player.getAppearence().generateAppearenceData();
		return true;

	    case "god":
		player.setHitpoints(1000000);
		player.getEquipment().setEquipmentHpIncrease(player.getMaxHitpoints() - 9900);
		for (int i = 0; i < 8; i++)
		    player.getCombatDefinitions().getStats()[i] = 50000;
		return true;

	    case "prayertest":
		player.getEffectsManager().startEffect(new Effect(EffectType.PROTECTION_DISABLED, 8));
		return true;

	    case "karamja":
		player.getDialogueManager().startDialogue("KaramjaTrip",
			Utils.getRandom(1) == 0 ? 11701 : (Utils.getRandom(1) == 0 ? 11702 : 11703));
		return true;
	    case "clanwars":
		// player.setClanWars(new ClanWars(player, player));
		// player.getClanWars().setWhiteTeam(true);
		// ClanChallengeInterface.openInterface(player);
		return true;
	    case "watereast":
		for (int i = 0; i < 10; i++) {
		    World.spawnObjectTemporary(new WorldObject(37227, 10, 0,
			    new WorldTile(player.getX() + i * 2, player.getY() + 1, player.getPlane())), 2000);
		    World.spawnObjectTemporary(new WorldObject(37227, 10, 2,
			    new WorldTile(player.getX() + i * 2, player.getY() - 4, player.getPlane())), 2000);
		}
		return true;
	    case "dungsmall":
		player.getDungManager().leaveParty();
		DungeonPartyManager testParty = new DungeonPartyManager();
		testParty.add(player);
		testParty.setFloor(50);
		testParty.setComplexity(6);
		testParty.setDificulty(1);
		testParty.setKeyShare(true);
		testParty.setSize(DungeonConstants.LARGE_DUNGEON);
		testParty.start();
		return true;
	    case "dung":
		player.getDungManager().leaveParty();
		DungeonPartyManager party = new DungeonPartyManager();
		party.add(player);
		party.setFloor(48);// 60
		party.setComplexity(6);
		party.setDificulty(1);
		party.setSize(DungeonConstants.TEST_DUNGEON);
		party.setKeyShare(true);
		party.start();
		return true;
	    case "dungtest":
		party = player.getDungManager().getParty();
		for (Player p : World.getPlayers()) {
		    if (p == player || !p.hasStarted() || p.hasFinished()
			    || !(p.getControlerManager().getControler() instanceof Kalaboss))
			continue;
		    p.getDungManager().leaveParty();
		    party.add(p);
		}
		party.setFloor(1);
		party.setComplexity(6);
		party.setDificulty(party.getTeam().size());
		party.setSize(DungeonConstants.TEST_DUNGEON);
		party.setKeyShare(true);
		player.getDungManager().enterDungeon(false);
		return true;
	    case "objects":
		for (int i = 0; i < 4; i++) {
		    object = World.getObjectWithSlot(player, i);
		    player.getPackets()
			    .sendPanelBoxMessage("object: " + (object == null ? ("null "
				    + i)
				    : ("id: " + object.getId() + ", " + object.getType() + ", "
					    + object.getRotation())));
		}
		// int setting =
		// World.getRegion(player.getRegionId()).getSettings(player.getPlane(),
		// player.getXInRegion(), player.getYInChunk());
		player.getPackets().sendPanelBoxMessage("setting: " + player.getXInRegion() + ", "
			+ player.getYInRegion() + ", " + player.getRegionId());
		return true;
	    case "checkdisplay":
		for (Player p : World.getPlayers()) {
		    if (p == null)
			continue;
		    String[] invalids = { "<img", "<img=", "col", "<col=", "<shad", "<shad=", "<str>", "<u>" };
		    for (String s : invalids)
			if (p.getDisplayName().contains(s)) {
			    player.getPackets().sendGameMessage(Utils.formatPlayerNameForDisplay(p.getUsername()));
			} else {
			    player.getPackets().sendGameMessage("None exist!");
			}
		}
		return true;
	    case "cutscene":
		player.getPackets().sendCutscene(Integer.parseInt(cmd[1]));
		return true;
	    case "dzs":
		player.getCutscenesManager().play(new DZGuideScene());
		return true;
	    case "noescape":
		player.getCutscenesManager().play(new NexCutScene(NexCombat.NO_ESCAPE_TELEPORTS[1], 1));
		return true;
	    case "dungcoords":
		int chunkX = player.getX() / 16 * 2;
		int chunkY = player.getY() / 16 * 2;
		int x = player.getX() - chunkX * 8;
		int y = player.getY() - chunkY * 8;

		player.getPackets()
			.sendPanelBoxMessage("Room chunk : " + chunkX + ", " + chunkY + ", pos: " + x + ", " + y);

		if (player.getDungManager().isInside()) {
		    Room room = player.getDungManager().getParty().getDungeon()
			    .getRoom(player.getDungManager().getParty().getDungeon().getCurrentRoomReference(player));

		    if (room != null) {
			int[] xy = DungeonManager.translate(x, y, (4 - room.getRotation()) & 0x3, 1, 1, 0);
			player.getPackets()
				.sendPanelBoxMessage("Dungeon Detected! Current rotation: " + room.getRotation());
			player.getPackets().sendPanelBoxMessage("Real Room chunk : " + room.getRoom().getChunkX() + ", "
				+ room.getRoom().getChunkY() + ", real pos for rot0: " + xy[0] + ", " + xy[1]);
		    }
		}

		return true;
	    case "coords":
		StringSelection selection = new StringSelection(
			player.getX() + " " + player.getY() + " " + player.getPlane());

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		player.getPackets().sendPanelBoxMessage("Coords: " + player.getX() + ", " + player.getY() + ", "
			+ player.getPlane() + ", regionId: " + player.getRegionId() + ", rx: " + player.getChunkX()
			+ ", ry: " + player.getChunkY() + ", int: " + player.getTileHash());
		return true;
	    case "ccoords":
		selection = new StringSelection(player.getX() + ", " + player.getY() + ", " + player.getPlane());
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		player.getPackets().sendPanelBoxMessage("Coords: " + player.getX() + ", " + player.getY() + ", "
			+ player.getPlane() + ", regionId: " + player.getRegionId() + ", rx: " + player.getChunkX()
			+ ", ry: " + player.getChunkY() + ", int: " + player.getTileHash());
		return true;
	    case "hash":
		selection = new StringSelection("" + player.getTileHash());
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		return true;
	    case "itemoni":
		player.getPackets().sendItemOnIComponent(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
			Integer.valueOf(cmd[3]), 1);
		return true;

	    case "items":
		for (int i = 0; i < 2000; i++) {
		    player.getPackets().sendItems(i, new Item[] { new Item(i, 1) });
		}
		return true;

	    case "trade":

		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");

		target = World.getPlayerByDisplayName(name);
		if (target != null) {
		    player.getTrade().openTrade(target);
		    target.getTrade().openTrade(player);
		}
		return true;

	    case "setlevel":
		if (cmd.length < 3) {
		    player.getPackets().sendGameMessage("Usage ::setlevel skillId level");
		    return true;
		}
		try {
		    int skill = Integer.parseInt(cmd[1]);
		    int level = Integer.parseInt(cmd[2]);
		    if (level < 0 || level > 99) {
			player.getPackets().sendGameMessage("Please choose a valid level.");
			return true;
		    }
		    player.getSkills().set(skill, level);
		    player.getSkills().setXp(skill, Skills.getXPForLevel(level));
		    player.getAppearence().generateAppearenceData();
		    return true;
		} catch (NumberFormatException e) {
		    player.getPackets().sendGameMessage("Usage ::setlevel skillId level");
		}
		return true;

	    case "npc":
		try {
		    World.spawnNPC(Integer.parseInt(cmd[1]), player, -1, true, true);
		    return true;
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::npc id(Integer)");
		}
		return true;

	    case "loadwalls":
		WallHandler.loadWall(player.getCurrentFriendsChat().getClanWars());
		return true;

	    case "cwbase":
		ClanWars cw = player.getCurrentFriendsChat().getClanWars();
		WorldTile base = cw.getBaseLocation();
		player.getPackets().sendGameMessage("Base x=" + base.getX() + ", base y=" + base.getY());
		base = cw.getBaseLocation().transform(
			cw.getAreaType().getNorthEastTile().getX() - cw.getAreaType().getSouthWestTile().getX(),
			cw.getAreaType().getNorthEastTile().getY() - cw.getAreaType().getSouthWestTile().getY(), 0);
		player.getPackets().sendGameMessage("Offset x=" + base.getX() + ", offset y=" + base.getY());
		return true;

	    case "object":
		try {
		    type = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 10;
		    int rotation = cmd.length > 3 ? Integer.parseInt(cmd[3]) : 0;
		    if (type > 22 || type < 0) {
			type = 10;
		    }
		    World.spawnObject(new WorldObject(Integer.valueOf(cmd[1]), type, rotation, player.getX(),
			    player.getY(), player.getPlane()));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: setkills id");
		}
		return true;
	    case "ltab":
		player.getInterfaceManager().sendLockGameTab(Integer.valueOf(cmd[1]), true);
		return true;
	    case "otab":
		player.getInterfaceManager().openGameTab(Integer.valueOf(cmd[1]));
		return true;
	    case "tab":
		try {
		    player.getInterfaceManager().setWindowInterface(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: tab id inter");
		}
		return true;

	    case "killme":
		player.applyHit(new Hit(player, 2000, HitLook.REGULAR_DAMAGE));
		return true;
	    case "hidec":
		if (cmd.length < 4) {
		    player.getPackets().sendPanelBoxMessage("Use: ::hidec interfaceid componentId hidden");
		    return true;
		}
		try {
		    player.getPackets().sendHideIComponent(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[3]),
			    Boolean.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::hidec interfaceid componentId hidden");
		}
		return true;

	    case "string":
		try {
		    player.getInterfaceManager().sendCentralInterface(Integer.valueOf(cmd[1]));
		    for (int i = 0; i <= Integer.valueOf(cmd[2]); i++)
			player.getPackets().sendIComponentText(Integer.valueOf(cmd[1]), i, "child: " + i);
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: string inter childid");
		}
		return true;

	    case "istringl":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}

		try {
		    for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
			player.getPackets().sendCSVarString(i, "String " + i);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;

	    case "istring":
		try {
		    player.getPackets().sendCSVarString(Integer.valueOf(cmd[1]), "String " + Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: String id value");
		}
		return true;

	    case "iconfig":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
			player.getPackets().sendCSVarInteger(Integer.parseInt(cmd[2]), i);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "nisvar":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: nisvar id value");
		    return true;
		}
		try {
		    player.getPackets().sendNISVar(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "var":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    player.getVarsManager().forceSendVar(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "forcemovement":
		WorldTile toTile = player.transform(0, 5, 0);
		player.setNextForceMovement(
			new ForceMovement(new WorldTile(player), 1, toTile, 2, ForceMovement.NORTH));

		return true;

	    case "ab":
		player.getVarsManager().sendVar(727, (Integer.valueOf(cmd[1]) << 4 | 7));
		return true;

	    case "varbit":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    player.getVarsManager().sendVarBit(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;

	    case "hit":
		HitLook.MELEE_DAMAGE.setMark(Integer.valueOf(cmd[1]));
		player.applyHit(new Hit(player, 300, HitLook.MELEE_DAMAGE, 0));

		return true;
	    case "menu":
		/*
		 * player.getPackets().sendExecuteScript(8862, 0, 7);
		 * player.getPackets().sendExecuteScript(8862, 0, 8);
		 * player.getPackets().sendExecuteScript(8862, 1, 5);
		 */
		player.getInterfaceManager().openMenu(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		return true;

	    case "iloop":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++)
			player.getInterfaceManager().sendCentralInterface(i);
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;

	    case "tloop":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++)
			player.getInterfaceManager().setWindowInterface(i, Integer.valueOf(cmd[3]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "hloop":
		if (cmd.length < 5) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[2]); i < Integer.valueOf(cmd[3]); i++) {
			player.getPackets().sendHideIComponent(Integer.valueOf(cmd[1]), i, Boolean.valueOf(cmd[4]));
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "varloop":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++) {
			player.getVarsManager().sendVar(i, Integer.valueOf(cmd[3]));
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "varloop2":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++) {
			player.getVarsManager().sendVar(i, i);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "varbitloop":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++)
			player.getVarsManager().sendVarBit(i, Integer.valueOf(cmd[3]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;
	    case "objectanim":

		object = cmd.length == 4
			? World.getStandartObject(
				new WorldTile(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), player.getPlane()))
			: World.getObjectWithType(
				new WorldTile(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), player.getPlane()),
				Integer.parseInt(cmd[3]));
		if (object == null) {
		    player.getPackets().sendPanelBoxMessage("No object was found.");
		    return true;
		}
		player.getPackets().sendObjectAnimation(object,
			new Animation(Integer.parseInt(cmd[cmd.length == 4 ? 3 : 4])));
		return true;
	    case "gitem":
		World.addGroundItem(new Item(4151, 1), player);
		break;
	    case "loopoanim":
		x = Integer.parseInt(cmd[1]);
		y = Integer.parseInt(cmd[2]);
		final WorldObject object1 = World.getObjectWithSlot(player, Region.OBJECT_SLOT_FLOOR);
		if (object1 == null) {
		    player.getPackets().sendPanelBoxMessage(
			    "Could not find object at [x=" + x + ", y=" + y + ", z=" + player.getPlane() + "].");
		    return true;
		}
		System.out.println("Object found: " + object1.getId());
		final int start = cmd.length > 3 ? Integer.parseInt(cmd[3]) : 10;
		final int end = cmd.length > 4 ? Integer.parseInt(cmd[4]) : 20000;
		GameExecutorManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
		    int current = start;

		    @Override
		    public void run() {
			while (AnimationDefinitions.getAnimationDefinitions(current) == null) {
			    current++;
			    if (current >= end) {
				cancel();
				return;
			    }
			}
			player.getPackets().sendPanelBoxMessage("Current object animation: " + current + ".");
			player.getPackets().sendObjectAnimation(object1, new Animation(current++));
			if (current >= end) {
			    cancel();
			}
		    }
		}, 1800, 1800);
		return true;
	    case "bconfigloop":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		    return true;
		}
		try {
		    for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++) {
			player.getPackets().sendCSVarInteger(i, Integer.valueOf(cmd[3]));
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: config id value");
		}
		return true;

	    case "reset":
		if (cmd.length < 2) {
		    for (int skill = 0; skill < Skills.SKILL_NAME.length; skill++) {
			player.getSkills().setXp(skill, 0);
			player.getSkills().set(skill, 1);
		    }
		    player.getSkills().init();
		    return true;
		}
		try {
		    player.getSkills().setXp(Integer.valueOf(cmd[1]), 0);
		    player.getSkills().set(Integer.valueOf(cmd[1]), 1);

		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::master skill");
		}
		return true;
	    case "build":
		player.getVarsManager().sendVarOld(483, 1024);
		player.getVarsManager().sendVarOld(483, 1025);
		player.getVarsManager().sendVarOld(483, 1026);
		player.getVarsManager().sendVarOld(483, 1027);
		player.getVarsManager().sendVarOld(483, 1028);
		player.getVarsManager().sendVarOld(483, 1029);
		player.getVarsManager().sendVarOld(483, 1030);
		player.getVarsManager().sendVarOld(483, 1031);
		player.getVarsManager().sendVarOld(483, 1032);
		player.getVarsManager().sendVarOld(483, 1033);
		player.getVarsManager().sendVarOld(483, 1034);
		player.getVarsManager().sendVarOld(483, 1035);
		player.getVarsManager().sendVarOld(483, 1036);
		player.getVarsManager().sendVarOld(483, 1037);
		player.getVarsManager().sendVarOld(483, 1038);
		player.getVarsManager().sendVarOld(483, 1039);
		player.getVarsManager().sendVarOld(483, 1040);
		player.getVarsManager().sendVarOld(483, 1041);
		player.getVarsManager().sendVarOld(483, 1042);
		player.getVarsManager().sendVarOld(483, 1043);
		player.getVarsManager().sendVarOld(483, 1044);
		player.getVarsManager().sendVarOld(483, 1045);
		player.getVarsManager().sendVarOld(483, 1024);
		player.getVarsManager().sendVarOld(483, 1027);
		player.getPackets().sendCSVarInteger(841, 0);
		player.getPackets().sendCSVarInteger(199, -1);
		player.getPackets().sendIComponentSettings(1306, 55, -1, -1, 0);
		player.getPackets().sendIComponentSettings(1306, 8, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 15, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 22, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 29, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 36, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 43, 4, 4, 1);
		player.getPackets().sendIComponentSettings(1306, 50, 4, 4, 1);
		System.out.println("Build");
		return true;
	    case "givexp":
		String n = "";
		for (int i = 3; i < cmd.length; i++)
		    n += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		Player t = World.getPlayerByDisplayName(n);
		t.getSkills().addXp(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]), true);
		player.getPackets().sendGameMessage("Giving " + t.getDisplayName() + " " + Integer.valueOf(cmd[2])
			+ " xp in " + Integer.valueOf(cmd[1]));
		return true;
	    case "pintest":
		player.getBank().setRecoveryTime(50000);
		return true;
	    case "givetokens":
		String na = "";
		for (int i = 2; i < cmd.length; i++)
		    na += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		Player ta = World.getPlayerByDisplayName(na);
		ta.getDungManager().addTokens(Integer.valueOf(cmd[1]));
		player.getPackets()
			.sendGameMessage("Giving " + ta.getDisplayName() + " " + Integer.valueOf(cmd[1]) + " tokens.");
		return true;
	    case "master":
		if (cmd.length < 2) {
		    for (int skill = 0; skill < 26; skill++)
			player.getSkills().addXp(skill, 150000000);
		    return true;
		}
		try {
		    player.getSkills().addXp(Integer.valueOf(cmd[1]), 150000000, true);
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::master skill");
		}
		return true;
	    case "addxp":
		for (int skill = 0; skill < 26; skill++)
		    player.getSkills().addXp(skill, 1000000, true);
		return true;
	    case "window":
		player.getInterfaceManager().setRootInterface(1143, false);
		return true;
	    case "bconfig":
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: bconfig id value");
		    return true;
		}
		try {
		    player.getPackets().sendCSVarInteger(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: bconfig id value");
		}
		return true;

	    case "tonpc":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::tonpc id(-1 for player)");
		    return true;
		}
		try {
		    player.getAppearence().transformIntoNPC(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::tonpc id(-1 for player)");
		}
		return true;

	    case "inter":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		    return true;
		}
		try {
		    if (Integer.valueOf(cmd[1]) > Utils.getInterfaceDefinitionsSize())
			return true;
		    player.getInterfaceManager().sendCentralInterface(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		}
		return true;
	    case "pane":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::pane interfaceId");
		    return true;
		}
		try {
		    player.getPackets().sendRootInterface(Integer.valueOf(cmd[1]), 0);
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::pane interfaceId");
		}
		return true;
	    case "overlay":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		    return true;
		}
		int child = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 28;
		try {
		    player.getInterfaceManager().setInterface(true,
			    player.getInterfaceManager().hasRezizableScreen() ? 746 : 548, child,
			    Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		}
		return true;

	    case "resetprices":
		player.getPackets().sendGameMessage("Starting!");
		GrandExchange.reset(true, false);
		player.getPackets().sendGameMessage("Done!");
		return true;
	    case "recalcprices":
		player.getPackets().sendGameMessage("Starting!");
		GrandExchange.recalcPrices();
		player.getPackets().sendGameMessage("Done!");
		return true;

	    case "interh2":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		    return true;
		}

		try {
		    int interId = Integer.valueOf(cmd[1]);
		    for (int componentId = Integer.valueOf(cmd[2]); componentId < Integer
			    .valueOf(cmd[3]); componentId++) {
			player.getPackets().sendHideIComponent(interId, componentId, false);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		}
		return true;
	    case "interh":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		    return true;
		}

		try {
		    int interId = Integer.valueOf(cmd[1]);
		    for (int componentId = 0; componentId < Utils
			    .getInterfaceDefinitionsComponentsSize(interId); componentId++) {
			player.getPackets().sendHideIComponent(interId, componentId, false);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		}
		return true;

	    case "inters":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		    return true;
		}

		try {
		    int interId = Integer.valueOf(cmd[1]);
		    for (int componentId = 0; componentId < Utils
			    .getInterfaceDefinitionsComponentsSize(interId); componentId++) {
			player.getPackets().sendIComponentText(interId, componentId, "cid: " + componentId);
		    }
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
		}
		return true;

	    case "kill":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target == null)
		    return true;
		target.applyHit(new Hit(target, player.getHitpoints(), HitLook.REGULAR_DAMAGE));
		target.stopAll();
		return true;

	    case "killall":
		if (Settings.HOSTED) {
		    player.getPackets().sendGameMessage("What are you doing?!?!");
		    return true;
		}
		for (Player loop : World.getPlayers()) {
		    loop.applyHit(new Hit(loop, player.getHitpoints(), HitLook.REGULAR_DAMAGE));
		    loop.stopAll();
		}
		return true;
	    case "bank":
		player.getBank().openBank();
		return true;
	    case "tele":
		if (cmd.length == 2) {
		    player.setNextWorldTile(new WorldTile(Integer.valueOf(cmd[1])));
		    return true;
		}
		if (cmd.length < 3) {
		    player.getPackets().sendPanelBoxMessage("Use: ::tele coordX coordY");
		    return true;
		}
		try {
		    player.resetWalkSteps();
		    player.setNextWorldTile(new WorldTile(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
			    cmd.length >= 4 ? Integer.valueOf(cmd[3]) : player.getPlane()));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::tele coordX coordY plane");
		}
		return true;

	    case "shutdown":
		int delay = 60;
		if (cmd.length >= 2) {
		    try {
			delay = Integer.valueOf(cmd[1]);
		    } catch (NumberFormatException e) {
			player.getPackets().sendPanelBoxMessage("Use: ::restart secondsDelay(IntegerValue)");
			return true;
		    }
		}
		GameLauncher.initDelayedShutdown(delay);
		return true;

	    case "emote":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emote id");
		    return true;
		}
		try {
		    player.setNextAnimation(new Animation(Integer.valueOf(cmd[1])));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emote id");
		}
		return true;

	    case "remote":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emote id");
		    return true;
		}
		try {
		    player.getAppearence().setRenderEmote(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emote id");
		}
		return true;

	    case "quake":
		player.getPackets().sendCameraShake(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
			Integer.valueOf(cmd[3]), Integer.valueOf(cmd[4]), Integer.valueOf(cmd[5]));
		return true;

	    case "getrender":
		player.getPackets().sendGameMessage("Testing renders");
		for (int i = 0; i < 3000; i++) {
		    try {
			player.getAppearence().setRenderEmote(i);
			player.getPackets().sendGameMessage("Testing " + i);
			Thread.sleep(600);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		    }
		}
		return true;

	    case "spec":
		player.getCombatDefinitions().increaseSpecialAttack(100);
		return true;

	    case "setlook":
		PlayerLook.setSet(player, Integer.valueOf(cmd[1]));
		return true;
	    case "color":
		PlayerLook.openCharacterCustomizing(player);
		return true;

	    case "tryinter":
		WorldTasksManager.schedule(new WorldTask() {
		    int i = 1;

		    @Override
		    public void run() {
			if (player.hasFinished()) {
			    stop();
			}
			player.getInterfaceManager().sendCentralInterface(i);
			System.out.println("Inter - " + i);
			i++;
		    }
		}, 0, 1);
		return true;

	    case "tryanim":
		WorldTasksManager.schedule(new WorldTask() {
		    int i = 16700;

		    @Override
		    public void run() {
			if (i >= Utils.getAnimationDefinitionsSize()) {
			    stop();
			    return;
			}
			if (player.getLastAnimationEnd() > Utils.currentTimeMillis()) {
			    player.setNextAnimation(new Animation(-1));
			}
			if (player.hasFinished()) {
			    stop();
			}
			player.setNextAnimation(new Animation(i));
			System.out.println("Anim - " + i);
			i++;
		    }
		}, 0, 3);
		return true;

	    case "animcount":
		System.out.println(Utils.getAnimationDefinitionsSize() + " anims.");
		return true;

	    case "trygfx":
		WorldTasksManager.schedule(new WorldTask() {
		    int i = 2100;

		    @Override
		    public void run() {
			if (i >= Utils.getGraphicDefinitionsSize()) {
			    stop();
			}
			if (player.hasFinished()) {
			    stop();
			}
			player.setNextGraphics(new Graphics(i));
			System.out.println("GFX - " + i);
			i++;
		    }
		}, 0, 3);
		return true;

	    case "gfx":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
		    return true;
		}
		try {
		    player.setNextGraphics(
			    new Graphics(Integer.valueOf(cmd[1]), cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 0,
				    cmd.length == 4 ? Integer.valueOf(cmd[3]) : 0));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
		}
		return true;
	    case "gfxp":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
		    return true;
		}
		try {
		    player.getPackets().sendGraphics(new Graphics(Integer.valueOf(cmd[1])), new WorldTile(player));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
		}
		return true;
	    case "sync":
		int animId = Integer.parseInt(cmd[1]);
		int gfxId = Integer.parseInt(cmd[2]);
		int height = cmd.length > 3 ? Integer.parseInt(cmd[3]) : 0;
		player.setNextAnimation(new Animation(animId));
		player.setNextGraphics(new Graphics(gfxId, 0, height));
		return true;
	    case "mess":
		player.getPackets().sendMessage(Integer.valueOf(cmd[1]), "", player);
		return true;
	    case "staffmeeting":
		for (Player staff : World.getPlayers()) {
		    if (staff.getRights() == 0)
			continue;
		    staff.setNextWorldTile(new WorldTile(2675, 10418, 0));
		    staff.getPackets()
			    .sendGameMessage("You been teleported for a staff meeting by " + player.getDisplayName());
		}
		return true;
	    case "fightkiln":
		FightKiln.enterFightKiln(player, true);
		return true;
	    }
	}
	return false;
    }

    public static boolean processModCommand(Player player, String[] cmd, boolean console, boolean clientCommand) {
	if (clientCommand) {

	} else {
	    switch (cmd[0].toLowerCase()) {
	    case "teleto":

		if (player.getRights() < 2) {
		    if ((player.isLocked() || player.getControlerManager().getControler() != null)) {
			player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
			return true;
		    }
		}

		String name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		Player target = World.getPlayerByDisplayName(name);
		if (target == null)
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		else {
		    player.setNextWorldTile(target);
		}
		return true;
	    case "sendhome":
		name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		target = World.getPlayerByDisplayName(name);
		if (target == null)
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		else {
		    target.unlock();
		    target.getControlerManager().forceStop();
		    if (target.getNextWorldTile() == null)
			target.setNextWorldTile(Settings.START_PLAYER_LOCATION);
		    player.getPackets().sendGameMessage("You have unnulled: " + target.getDisplayName() + ".");
		    return true;
		}
		return true;
	    }
	}
	return false;
    }

    public static boolean processSupportCommands(Player player, String[] cmd, boolean console, boolean clientCommand) {
	if (clientCommand) {

	} else {
	    switch (cmd[0].toLowerCase()) {
	    case "sz":
	    case "staffzone":
		Magic.sendNormalTeleportSpell(player, 1, 0, new WorldTile(4192, 6304, 0));
		return true;
	    case "dz":
	    case "donatorzone":
		DonatorZone.enterDonatorzone(player);
		return true;
	    case "realnames":
		for (int i = 10; i < World.getPlayers().size() + 10; i++)
		    player.getPackets().sendIComponentText(275, i, "");
		for (int i = 0; i < World.getPlayers().size() + 1; i++) {
		    Player p2 = World.getPlayers().get(i);
		    if (p2 == null)
			continue;
		    player.getPackets().sendIComponentText(275, i + 10,
			    p2.getDisplayName() + " - " + Utils.formatPlayerNameForDisplay(p2.getUsername()));
		}
		player.getPackets().sendIComponentText(275, 1, "Displayname - Username");
		player.getInterfaceManager().sendCentralInterface(275);
		return true;
	    case "sy":
	    case "staffyell":
		String message2 = "";
		for (int i = 1; i < cmd.length; i++)
		    message2 += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		sendYell(player, Utils.fixChatMessage(message2), true);
		return true;
	    case "ticket":
		TicketSystem.openNextTicket(player);
		return true;
	    case "endticket":
		TicketSystem.closeCurrentTicket(player);
		return true;

	    }
	}
	return false;
    }

    public static void sendYell(Player player, String message, boolean staffYell) {
	if (Settings.YELL_FILTER_ENABLED)
	    message = Censor.getFilteredMessage(message);
	if (!player.isDonator() && !player.isExtremeDonator()
		&& (player.getRights() == 0 && !player.isSupporter() && !player.isGraphicDesigner()))
	    return;
	else if (!Settings.YELL_ENABLED && player.getRights() != 2) {
	    player.getPackets().sendGameMessage("Yell is currently disabled by an administrator");
	    return;
	}
	if (player.isMuted()) {
	    player.getPackets().sendGameMessage("You temporary muted. Recheck in 48 hours.");
	    return;
	}
	if (staffYell) {
	    World.sendIgnoreableWorldMessage(player,
		    "[<col=ff0000>Staff Yell</col>] "
			    + (player.getRights() > 1 ? "<img=1>" : (player.isSupporter() ? "" : "<img=0>"))
			    + player.getDisplayName() + ": <col=ff0000>" + message + ".</col>",
		    true);
	    return;
	}
	if (message.length() > 100)
	    message = message.substring(0, 100);

	if (player.getRights() < 2) {
	    String[] invalid = { "<euro", "<img", "<img=", "<col", "<col=", "<shad", "<shad=", "<str>", "<u>" };
	    for (String s : invalid)
		if (message.contains(s)) {
		    player.getPackets().sendGameMessage("You cannot add additional code to the message.");
		    return;
		}

	    if (player.isGraphicDesigner())
		World.sendIgnoreableWorldMessage(player, "[<img=9><col=00ACE6>Graphic Designer</shad></col>] <img=9>"
			+ player.getDisplayName() + ": <col=00ACE6><shad=000000>" + message + "", false);
	    else if (player.isSupporter() && player.getRights() == 0)
		World.sendIgnoreableWorldMessage(player, "[<col=58ACFA><shad=2E2EFE>Support Team</shad></col>] "
			+ player.getDisplayName() + ": <col=58ACFA><shad=2E2EFE>" + message + "</shad></col>.", false);

	    else if (player.isExtremeDonator() && player.getRights() == 0)
		World.sendIgnoreableWorldMessage(player,
			"[<col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ff0000"
				: player.getYellColor()) + ">Extreme Donator</col>] <img=11>" + player.getDisplayName()
				+ ": <col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null
					? "ff0000" : player.getYellColor())
				+ ">" + message + "</col>",
			false);

	    else if (player.isDonator() && player.getRights() == 0)
		World.sendIgnoreableWorldMessage(player, "[<col=02ab2f>Donator</col>] <img=8>" + player.getDisplayName()
			+ ": <col=02ab2f>" + message + "</col>", false);

	    else
		World.sendIgnoreableWorldMessage(player,
			"[<img=0><col="
				+ (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099"
					: player.getYellColor())
				+ ">" + ("Global Mod") + "</col><img=0>]" + player.getDisplayName() + ": <col="
				+ (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099"
					: player.getYellColor())
				+ ">" + message + "</col>",
			false);
	    return;
	}
	World.sendIgnoreableWorldMessage(player,
		"[<img=1><col="
			+ (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "1589FF"
				: player.getYellColor())
			+ ">Admin</col>] <img=1>" + player.getDisplayName() + ": <col="
			+ (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "1589FF"
				: player.getYellColor())
			+ ">" + message + "</col>",
		false);
    }

    // private static final int[] POTS_COMMAND = { 23280, 23256, 23352, 23568,
    // 15273, 557, 560, 565, 9075, 555 };

    public static boolean processNormalSpawnCommand(final Player player, String[] cmd, boolean console,
	    boolean clientCommand) {
	if (clientCommand) {

	} else {
	    switch (cmd[0].toLowerCase()) {
	    case "emusic":
		if (cmd.length < 2) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emusic effectId");
		    return true;
		}
		try {
		    player.getMusicsManager().playMusicEffect(Integer.valueOf(cmd[1]));
		} catch (NumberFormatException e) {
		    player.getPackets().sendPanelBoxMessage("Use: ::emusic effectId");
		}
		return true;
	    case "sets":
		if (!player.isDonator()) {
		    player.getDialogueManager().startDialogue("SimpleMessage",
			    "You've to be a donator to use this feature.");
		    return true;
		}
		player.stopAll();
		ItemSets.openSets(player);
		return true;
	    case "veng":
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't spawn while you're in this area.");
		    return true;
		}
		player.getInventory().addItem(557, 10000);
		player.getInventory().addItem(560, 2000);
		player.getInventory().addItem(9075, 4000);
		player.getCombatDefinitions().setSpellBook(2);
		return true;
	    case "barrage":

		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't spawn while you're in this area.");
		    return true;
		}
		player.getInventory().addItem(555, 6000);
		player.getInventory().addItem(565, 4000);
		player.getInventory().addItem(560, 3000);
		player.getCombatDefinitions().setSpellBook(1);
		return true;
	    case "dharok":
		if (player.isDonator()) {
		    if (!player.canSpawn()) {
			player.getPackets().sendGameMessage("You can't spawn while you're in this area.");
			return true;
		    }
		    player.getInventory().addItem(4716, 1);
		    player.getInventory().addItem(4718, 1);
		    player.getInventory().addItem(4720, 1);
		    player.getInventory().addItem(4722, 1);
		}
		return true;

	    case "dz":
	    case "donatorzone":
		if (player.isDonator() && player.canSpawn()) {
		    DonatorZone.enterDonatorzone(player);
		} else {
		    player.getPackets().sendGameMessage("You must be donator to use this feature.");
		}
		return true;
	    case "empty":
		player.getInventory().reset();
		return true;
	    case "home":
		WorldTile tile = Settings.START_PLAYER_LOCATION;
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile));
		return true;
	    case "itemn": {
		if (!player.canSpawn() && player.getRights() < 2) {
		    player.getPackets().sendGameMessage("You can't spawn while you're in this area.");
		    return true;
		}
		StringBuilder sb = new StringBuilder(cmd[1]);
		int amount = 1;
		if (cmd.length > 2) {
		    for (int i = 2; i < cmd.length; i++) {
			if (cmd[i].startsWith("+")) {
			    amount = Integer.parseInt(cmd[i].replace("+", ""));
			} else {
			    sb.append(" ").append(cmd[i]);
			}
		    }
		}

		String name = sb.toString().toLowerCase().replace("[", "(").replace("]", ")").replaceAll(",", "'");
		for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
		    ItemDefinitions def = ItemDefinitions.getItemDefinitions(i);
		    if (def.getName().toLowerCase().equalsIgnoreCase(name)) {
			if (!canSpawnItem(player, def.getId(), amount))
			    return true;
			player.getInventory().addItem(i, amount);
			player.getPackets().sendGameMessage("Found item " + name + " - id: " + i + ".");
			return true;
		    }
		}
		player.getPackets().sendGameMessage("Could not find item by the name " + name + ".");
	    }
		return true;

	    case "item":
		if (cmd.length < 2) {
		    player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
		    return true;
		}
		try {
		    if (!player.canSpawn()) {
			player.getPackets().sendGameMessage("You can't spawn while you're in this area.");
			return true;
		    }
		    if (!canSpawnItem(player, Integer.valueOf(cmd[1]), cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1))
			return true;
		    player.getInventory().addItem(Integer.valueOf(cmd[1]),
			    cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
		} catch (NumberFormatException e) {
		    player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
		}
		return true;
	    case "restore":
		if (!player.isExtremeDonator()) {
		    player.getDialogueManager().startDialogue("SimpleMessage",
			    "You've to be an extreme donator to use this feature.");
		    return true;
		}
		try {
		    if (!player.canSpawn()) {
			player.getPackets().sendGameMessage("You can't restore yourself while you're in this area.");
			return true;
		    }
		    Long time = (Long) player.getTemporaryAttributtes().get("Recover_Special_Pot");
		    if (time != null && Utils.currentTimeMillis() - time < 120000) {
			player.getPackets().sendGameMessage("You may only use this command every two minutes.");
			return true;
		    }
		    player.getCombatDefinitions().restoreSpecialAttack(100);
		    player.getTemporaryAttributtes().put("Recover_Special_Pot", Utils.currentTimeMillis());
		    player.heal(player.getMaxHitpoints());
		    player.getPrayer().restorePrayer(player.getSkills().getLevelForXp(Skills.PRAYER) * 10);
		} catch (NumberFormatException e) {
		    player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
		}
		return true;
	    case "blueskin":
		if (!player.isDonator()) {
		    player.getPackets().sendGameMessage("You do not have the privileges to use this.");
		    return true;
		}
		player.getAppearence().setSkinColor(12);
		player.getAppearence().generateAppearenceData();
		return true;

	    case "greenskin":
		if (!player.isDonator()) {
		    player.getPackets().sendGameMessage("You do not have the privileges to use this.");
		    return true;
		}
		player.getAppearence().setSkinColor(13);
		player.getAppearence().generateAppearenceData();
		return true;
	    case "bank":
		if (!player.isDonator()) {
		    player.getPackets().sendGameMessage("You do not have the privileges to use this.");
		    return true;
		}
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't bank while you're in this area.");
		    return true;
		}
		player.stopAll();
		player.getBank().openBank();
		return true;


	    case "pray":
	    case "curses":
	    case "regular":
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't use this command while in a dangerous area.");
		    return true;
		}
		boolean usingCurses = false;
		if (cmd[0].equals("curses"))
		    usingCurses = true;
		else if (cmd[0].equals("pray"))
		    usingCurses = !player.getPrayer().isAncientCurses();
		player.getPrayer().setPrayerBook(usingCurses);
		player.getPackets().sendGameMessage("You have switched your prayer book.");
		return true;
	    case "spellbook":
	    case "modern":
	    case "ancient":
	    case "lunar":
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You cannot use this command in this area.");
		    return true;
		}
		switch (cmd[0]) {
		case "modern":
		    player.getCombatDefinitions().setSpellBook(0);
		    player.getPackets().sendGameMessage("You've switched to modern spellbook.");
		    return true;
		case "ancient":
		    player.getCombatDefinitions().setSpellBook(1);
		    player.getPackets().sendGameMessage("You've switched to ancient spellbook.");
		    return true;
		case "lunar":
		    player.getCombatDefinitions().setSpellBook(2);
		    player.getPackets().sendGameMessage("You've switched to lunar spellbook.");
		    return true;
		default:
		    int book = player.getCombatDefinitions().getSpellBook();
		    player.getCombatDefinitions().setSpellBook(book == 192 ? 1 : book == 193 ? 2 : 0);
		    player.getPackets().sendGameMessage("You've toggled your spellbook.");
		}
		return true;
	    case "pots":
	    case "food":
		int[] POTS_COMMAND = { 1 };
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't use this command while in a dangerous area.");
		    return true;
		}
		for (int consumables : POTS_COMMAND) {
		    if (!player.getInventory()
			    .addItem(new Item(consumables, cmd.length == 2 ? Integer.parseInt(cmd[1]) : 100)))
			break;
		}
		if (cmd.length != 2)
		    player.getPackets()
			    .sendGameMessage("Given default amount, type a number if you want more than 100.");
		return true;
	    case "wolp":
		if (!player.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't use this command while in a dangerous area.");
		    return true;
		}
		if (player.getInventory().addItem(new Item(12437, 1000))) {
		    if (player.getFamiliar() == null)
			Summoning.spawnFamiliar(player, Pouch.WOLPERTINGER);
		    player.getSkills().restoreSkills();
		}
		return true;
	    case "multi":
		WorldTile tile1 = new WorldTile(2945, 3370, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile1);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile1));
		return true;

	    case "clw":
		WorldTile tile7 = new WorldTile(2993, 9681, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 0, 0, tile7);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile7));
		return true;
	    case "zerk":
		WorldTile tile8 = new WorldTile(3039, 3560, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 0, 0, tile8);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile8));
		return true;
	    case "50ports":
		WorldTile tile10 = new WorldTile(3307, 3916, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 0, 0, tile10);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile10));
		return true;
	    case "gdz":
		WorldTile tile9 = new WorldTile(3287, 3882, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 0, 0, tile9);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile9));
		return true;
	    case "mb":
	    case "magebank":
		WorldTile tile2 = new WorldTile(2539, 4716, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile2);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile2));
		return true;
	    case "easts":
		WorldTile tile3 = new WorldTile(3360, 3658, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile3);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile3));
		return true;
	    case "wests":
		WorldTile tile5 = new WorldTile(2984, 3596, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile5);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile5));
		return true;
	    case "wild":
	    case "wilderness":
	    case "obelisk":
		WorldTile tile4 = WildernessObelisk.OBELISK_CENTER_TILES[Utils
			.random(WildernessObelisk.OBELISK_CENTER_TILES.length)].transform(2, 2, 0);
		if (player.canSpawn())
		    Magic.sendNormalTeleportSpell(player, 1, 0, tile4);
		else if (Wilderness.isAtWild(player))
		    player.getActionManager().setAction(new HomeTeleport(tile4));
		return true;
	    case "copy":
		String name = "";
		for (int i = 1; i < cmd.length; i++)
		    name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		Player p2 = World.getPlayerByDisplayName(name);
		if (p2 == null) {
		    player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
		    return true;
		}
		if (!player.isDonator()) {
		    player.getPackets().sendGameMessage("You do not have the privileges to use this.");
		    return true;
		}
		if (p2.getRights() > player.getRights()) {
		    player.getPackets().sendGameMessage("You don't have permission to copy this player.");
		    return true;
		}
		if (!player.canSpawn() || !p2.canSpawn()) {
		    player.getPackets().sendGameMessage("You can't do that now.");
		    return true;
		}

		double[] xp = p2.getSkills().getXp();
		for (int z = 0; z < 25; z++) {
		    if (z > 6 && z <= 22 || z == 24)
			continue;
		    player.getSkills().setXp(z, xp[z]);
		}
		player.getSkills().restoreSkills();
		Item[] invo = p2.getInventory().getItems().getItemsCopy();
		for (int n = 0; n < invo.length; n++) {
		    if (invo[n] == null)
			continue;
		    player.getInventory().reset();
		    player.getInventory().getItems().addAll(invo);
		    player.getInventory().init();
		}
		player.getEquipment().reset();// to avoid problems in the future

		Item[] items = p2.getEquipment().getItems().getItemsCopy();
		for (int i = 0; i < items.length; i++) {
		    if (items[i] == null)
			continue;
		    boolean hasRequirements = true;
		    HashMap<Integer, Integer> requiriments = items[i].getDefinitions().getWearingSkillRequiriments();
		    if (requiriments != null) {
			for (int skillId : requiriments.keySet()) {
			    if (skillId > 24 || skillId < 0)
				continue;
			    int level = requiriments.get(skillId);
			    if (level < 0 || level > 120)
				continue;
			    if (player.getSkills().getLevelForXp(skillId) < level) {
				hasRequirements = false;
				name = Skills.SKILL_NAME[skillId].toLowerCase();
				player.getPackets().sendGameMessage("You need to have a"
					+ (name.startsWith("a") ? "n" : "") + " " + name + " level of " + level + ".");
			    }

			}
		    }
		    if (!hasRequirements)
			continue;
		    hasRequirements = canSpawnItem(player, items[i].getId(), items[i].getAmount())
			    && ItemConstants.canWear(items[i], player);
		    if (hasRequirements) {
			player.getEquipment().getItems().set(i, items[i]);
			player.getEquipment().init();
		    }
		}
		player.getAppearence().generateAppearenceData();
		return true;

	    }
	}
	return false;
    }

    public static boolean canSpawnItem(Player player, int itemId, int ammount) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(itemId);
	if (defs.isLended()) {
	    player.getPackets().sendGameMessage("You can't spawn lent items.");
	    return false;
	}
	if (defs.isOverSized()) {
	    player.getPackets().sendGameMessage("The item appears to be oversized.");
	    return false;
	}

	if (itemId >= 15753 && itemId <= 18329 || itemId >= 20821 && itemId <= 20833 || itemId == 20874) {
	    player.getPackets().sendGameMessage("You can't spawn items from inside dungeoneering.");
	    return false;
	}

	if (itemId == 15377 || itemId == 6637) {
	    // player.getPackets().sendGameMessage("Try to spawn this again and
	    // you will be banned.");
	    // World.sendWorldMessage(player.getUsername() + " is attempting to
	    // spawn " + name + ".", true); //only staff sees
	    return false;
	}

	return canWearItem(player, itemId);
    }

    int[] EXTREME_DONATOR_ONLY = {
	    /* VIRTUS */
	    20159, 20160, 20161, 20162, 20163, 20164, 20165, 20166, 20167, 20168, 20169, 20170, 20180, 24981, 24982,
	    24986, 24987, 24988, 25062, 25063, 25066, 25067, 25067, 25654, 25655, 25664, 25665,

	    /* TORVA */
	    20135, 20136, 20137, 20138, 20139, 20140, 20141, 20142, 20143, 20144, 20145, 20146, 24977, 24978, 24979,
	    24983, 24984, 24985, 25060, 25061, 25064, 25065,

	    /* Pernix */
	    20147, 20148, 20149, 20150, 20151, 20152, 20153, 20154, 20155, 20156, 20157, 20158, 24974, 24975, 24976,
	    24989, 24990, 24991, 25058, 25059, 25068, 25069, 20171, 20172, 20173, 20174,

	    /* Divine */
	    13740, 13741,

    };

    int[] DONATOR_ONLY = {
	    /* Spirit shields */
	    13734, 13735, 13736, 13737, 13738, 13739, 13742, 13743, 13744, 13745,

	    /* Choatic */
	    18349, 18350, 18351, 18352, 18353, 18354, 18355, 18356, 18357, 18358, 18359, 18360, 24253,

	    /* Dom Gloves */
	    22358, 22359, 22360, 22361, 22362, 22363, 22364, 22365, 22366, 22367, 22368, 22369,

	    /* Subjunct */
	    24992, 24993, 24994, 24995, 24996, 24997, 24998, 24999, 25000, 25001, 25002, 25003, 25004, 25005, 25006,
	    25007, 25008, 25009, };

    private static final int[] VOTE_OR_DONATOR = {
	    /* VIRTUS */
	    20159, 20160, 20161, 20162, 20163, 20164, 20165, 20166, 20167, 20168, 20169, 20170, 20180, 24981, 24982,
	    24986, 24987, 24988, 25062, 25063, 25066, 25067, 25067, 25654, 25655, 25664, 25665,

	    /* TORVA */
	    20135, 20136, 20137, 20138, 20139, 20140, 20141, 20142, 20143, 20144, 20145, 20146, 24977, 24978, 24979,
	    24983, 24984, 24985, 25060, 25061, 25064, 25065,

	    /* Pernix */
	    20147, 20148, 20149, 20150, 20151, 20152, 20153, 20154, 20155, 20156, 20157, 20158, 24974, 24975, 24976,
	    24989, 24990, 24991, 25058, 25059, 25068, 25069, 20171, 20172, 20173, 20174,

	    /* Divine */
	    13740, 13741,

	    /* 90's sets */

	    26579, 26581, 26583, 26585, 26587, 26589, 26591, 26593, 26595, 26597, 26599, 26601, 26322, 26323, 26324,
	    26325, 26326, 26327, 26328, 26329, 26330, 26331, 26332, 26333, 26496, 26497, 26498,

	    26346, 26347, 26348, 26349, 26350, 26351, 26352, 26353, 26354, 26355, 26356, 26357, 26502, 26503, 26504,
	    30574, 30575,

	    26334, 26335, 26336, 26337, 26338, 26339, 26340, 26341, 26342, 26343, 26344, 26345, 26499, 26500, 26501,

	    30005, 30007, 30008, 30010, 30011, 30013, 30014, 30016, 30017, 28437, 28439, 28441, 28443,

	    28608, 28609, 28610, 28611, 28612, 28613, 28614, 28615, 28616,

	    31203, 31205, 30022, 30024, 29854, 29856, 29858, 29860, 29862, 28617, 28619, 28621, 28623

    };

    private static final int[] PVP_DISABLED_ITEMS = { 24458, 24461, 24460, 24456, 24457, 24459, 24455 // CRUCIBLE
	    , 25867, 25868, 25869, 25870, 25871, 25872 };

    public static boolean canWearItem(Player player, int itemId) {
	if (!Settings.SPAWN_WORLD)
	    return true;
	if (!player.isExtremeDonator() && !player.hasVotedInLast12Hours()) {
	    for (int id : Settings.VOTE_TO_USE_ITEM_IDS) {
		if (itemId == id) {
		    player.getPackets().sendGameMessage(
			    "Please have vote bonus enabled or be extreme donator to use this item first.");
		    return false;
		}
	    }
	}
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(itemId);
	if (defs.isStealingCreationItem()) {
	    if (player.getControlerManager().getControler() instanceof StealingCreationController)
		return true;
	    player.getPackets().sendGameMessage("Stealing creation items are disabled.");
	    return false;
	}

	if (!player.getDungManager().isInside() && defs.isDungeoneeringItem()) {
	    player.getPackets().sendGameMessage("Dungoneering items are disabled outside of dungeoneering.");
	    player.getInventory().deleteItem(itemId, player.getInventory().getAmountOf(itemId));
	    return false;
	}

	/*
	 * if (defs.getName().contains("Noxious") && !player.isExtremeDonator())
	 * { player.getPackets().sendGameMessage(
	 * "You must be extreme donator to wear this item. (::donate)"); return
	 * false; }
	 * 
	 * for (int item : VOTE_OR_DONATOR) { if (itemId == item &&
	 * !player.isDonator() && !player.hasVotedInLast12Hours()) {
	 * player.getPackets().sendGameMessage(
	 * "You must be donator or vote to wear this item. (::donate) (::vote)"
	 * ); return false; } }
	 */

	for (int item : PVP_DISABLED_ITEMS) {
	    if (itemId == item) {
		player.getPackets().sendGameMessage("This item has been disabled.");
		return false;
	    }
	}

	/*
	 * for (int item : EXTREME_DONATOR_ONLY) { if (itemId == item &&
	 * !player.isExtremeDonator()) { player.getPackets().sendGameMessage(
	 * "You must be extreme donator to wear this item. (::donate)"); return
	 * false; } }
	 * 
	 * for (int item : DONATOR_ONLY) { if (itemId == item &&
	 * !player.isDonator()) { player.getPackets().sendGameMessage(
	 * "You must be donator to wear this item. (::donate)"); return false; }
	 * }
	 */

	return true;
    }

    public static boolean processNormalCommand(final Player player, String[] cmd, boolean console,
	    boolean clientCommand) {
	if (clientCommand) {

	} else {
	    String message;
	    switch (cmd[0].toLowerCase()) {
	    case "mode":
		player.setNextForceTalk(new ForceTalk("<col=ff0000>My xp rate mode is: x" + Settings.getXpRate(player)
			+ " xp, x" + Settings.getCombatXpRate(player) + " combat xp."));
		return true;
	    case "score":
	    case "kdr":
		double kill = player.getKillCount();
		double death = player.getDeathCount();
		double dr = kill / death;
		player.setNextForceTalk(new ForceTalk("<col=ff0000>I'VE KILLED " + player.getKillCount()
			+ " PLAYERS AND BEEN SLAYED " + player.getDeathCount() + " TIMES. DR: " + dr));
		return true;
	    case "players":
		player.getPackets().sendGameMessage("There are currently " + World.getPlayers().size()
			+ " players playing " + Settings.SERVER_NAME + ".");
		return true;
	    case "checkvote":
	    case "claim":
	    case "claimvote":
		player.getPackets().sendGameMessage("<col=FF0000>Please note that vote system has changed!</col>");
		player.getPackets().sendGameMessage(
			"<col=FF0000>To claim your tokens please log into website using game account username and password</col>");
		player.getPackets().sendGameMessage(
			"<col=FF0000>and enter your code into auth code box, then click Claim tokens</col>");
		player.getPackets().sendOpenURL(Settings.VOTE_LINK);
		return true;
	    case "help":
		player.getPackets().sendOpenURL(Settings.HELP_LINK);
		return true;
	    case "wiki":
		player.getPackets().sendOpenURL(Settings.WIKI_LINK);
		return true;
	    case "vote":
		player.getPackets().sendOpenURL(Settings.VOTE_LINK);
		return true;
	    case "hs":
	    case "highscores":
		player.getPackets().sendOpenURL(Settings.HIGHSCORES_LINK);
		return true;
	    case "donate":
		player.getPackets().sendOpenURL(Settings.DONATE_LINK);
		return true;
	    case "itemdb":
		player.getPackets().sendOpenURL(Settings.ITEMDB_LINK);
		return true;
	    case "commands":
		player.getPackets().sendOpenURL(Settings.COMMANDS_LINK);
		return true;
	    case "itemlist":
		player.getPackets().sendOpenURL(Settings.ITEMLIST_LINK);
		return true;
	    case "website":
		player.getPackets().sendOpenURL(Settings.WEBSITE_LINK);
		return true;
	    case "livechat":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/site/index.php?page=donate_other");
		return true;
	    case "reportplayer":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/forms.php?do=form&fid=4");
		return true;
	    case "reportbug":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/misc.php?do=form&fid=3");
		return true;
	    case "recoverpass":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/misc.php?do=form&fid=1");
		return true;
	    case "appealoffence":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/misc.php?do=form&fid=2");
		return true;
	    case "checkreport":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/forumdisplay.php?153-Player-reports");
		return true;
	    case "checkappeal":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/forumdisplay.php?142-Offence-Appeal");
		return true;
	    case "rules":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/announcement.php?f=52&a=32");
		return true;
	    case "guides":
		player.getPackets().sendOpenURL("http://www.corruptionx.com/showthread.php?61570-Guide-of-Guides");
		return true;
	    case "thread":// REQUESTED BY BO, DONT YELL AT CJAY FOR IT K9K
		player.getPackets()
			.sendOpenURL("http://www.corruptionx.com/showthread.php?" + Integer.parseInt(cmd[1]));
		return true;
	    case "yell":
		message = "";
		for (int i = 1; i < cmd.length; i++)
		    message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
		sendYell(player, Utils.fixChatMessage(message), false);
		return true;
	    case "switchitemslook":
	    case "sil":
		player.switchItemsLook();
		player.getPackets().sendGameMessage(
			"You are now playing with " + (player.isOldItemsLook() ? "old" : "new") + " item looks.");
		return true;
	    }
	}
	return false;
    }

    public static void archiveLogs(Player player, String[] cmd) {
	try {
	    if (player.getRights() < 1)
		return;
	    String location = "";
	    if (player.getRights() == 2) {
		location = "data/logs/commands/admin/" + player.getUsername() + ".txt";
	    } else if (player.getRights() == 1) {
		location = "data/logs/commands/mod/" + player.getUsername() + ".txt";
	    }
	    String afterCMD = "";
	    for (int i = 1; i < cmd.length; i++)
		afterCMD += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
	    BufferedWriter writer = new BufferedWriter(new FileWriter(location, true));
	    writer.write("[" + Utils.currentTime("dd MMMMM yyyy 'at' hh:mm:ss z") + "] - ::" + cmd[0] + " " + afterCMD);
	    writer.newLine();
	    writer.flush();
	    writer.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void performPointEmote(Player teleto) {
	teleto.setNextAnimation(new Animation(17540));
	teleto.setNextGraphics(new Graphics(3401));
    }

    public static void performTeleEmote(Player target) {
	target.setNextAnimation(new Animation(17544));
	target.setNextGraphics(new Graphics(3403));
    }

    public static void performKickBanEmote(Player target) {
	target.setNextAnimation(new Animation(17542));
	target.setNextGraphics(new Graphics(3402));
    }

    /*
     * doesnt let it be instanced
     */
    private Commands() {

    }
}