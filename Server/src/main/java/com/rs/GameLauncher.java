package com.rs;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.alex.store.Index;
import com.rs.cache.Cache;
import com.rs.cache.loaders.BodyDefinitions;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.executor.GameExecutorManager;
import com.rs.executor.PlayerHandlerThread;
import com.rs.game.World;
import com.rs.game.map.MapBuilder;
import com.rs.game.map.bossInstance.BossInstanceHandler;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.player.Player;
import com.rs.game.player.content.FishingSpotsHandler;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controllers.ControlerHandler;
import com.rs.game.player.cutscenes.CutscenesHandler;
import com.rs.game.player.dialogues.DialogueHandler;
import com.rs.net.GameChannelsManager;
import com.rs.net.LoginClientChannelManager;
import com.rs.utils.Censor;
import com.rs.utils.ItemDestroys;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSpawns;
import com.rs.utils.ItemWeights;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;
import com.rs.utils.MapAreas;
import com.rs.utils.MusicEffects;
import com.rs.utils.MusicHints;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.NPCExamines;
import com.rs.utils.NPCSpawns;
import com.rs.utils.ObjectExamines;
import com.rs.utils.ObjectSpawns;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.SerializationUtilities;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public class GameLauncher {

	/**
	 * Whether shutdown has been started
	 */
	public static volatile boolean shutdown; 
	/**
	 * Time when delayed shutdown started.
	 */
	public static volatile long delayedShutdownStart;
	/**
	 * Delay in seconds when delayed shutdown will start.
	 */
	public static volatile int delayedShutdownDelay;

	public static void main(String[] args) throws Exception {
		if (args.length < 5) {
			System.out.println("USE: worldid(int) debug(boolean) hosted(boolean) pvpworld(boolean) hammershield_enabled(boolean)");
			Settings.WORLD_ID = 1;
			Settings.DEBUG = true;
			Settings.HOSTED = false;
			Settings.SPAWN_WORLD = false;
			Settings.CX_HAMMERSHIELD_ENABLED = false;
		} else {
			Settings.WORLD_ID = Integer.parseInt(args[0]);
			Settings.DEBUG = Boolean.parseBoolean(args[1]);
			Settings.HOSTED = Boolean.parseBoolean(args[2]);
			Settings.SPAWN_WORLD = Boolean.parseBoolean(args[3]);
			Settings.CX_HAMMERSHIELD_ENABLED = Boolean.parseBoolean(args[4]);
		}
		Settings.init();
		
		
		long currentTime = Utils.currentTimeMillis();
		Logger.log("Launcher", "Initing File System...");  
		SerializableFilesManager.init();
		Logger.log("Launcher", "Initing Cache...");
		Cache.init();
		Huffman.init();
		BodyDefinitions.init();
		Logger.log("Launcher", "Initing Data Files...");
		Censor.init();
		MapArchiveKeys.init();
		MapAreas.init();
		ObjectSpawns.init();
		ObjectExamines.init();
		NPCSpawns.init();
		NPCCombatDefinitionsL.init();
		NPCDrops.init();
		NPCExamines.init();
		ItemExamines.init();
		ItemWeights.init();
		ItemDestroys.init();
		ItemSpawns.init();
		MusicHints.init();
		MusicEffects.init();
		ShopsHandler.init();
		GrandExchange.init();
		Logger.log("Launcher", "Initing Controlers...");
		ControlerHandler.init();
		Logger.log("Launcher", "Initing Boss Instances...");
		BossInstanceHandler.init();
		Logger.log("Launcher", "Initing Fishing Spots...");
		FishingSpotsHandler.init();
		Logger.log("Launcher", "Initing NPC Combat Scripts...");
		CombatScriptsHandler.init();
		Logger.log("Launcher", "Initing Dialogues...");
		DialogueHandler.init();
		Logger.log("Launcher", "Initing Cutscenes...");
		CutscenesHandler.init();
		Logger.log("Launcher", "Initing Friend Chats...");
		FriendsChat.init();
		Logger.log("Launcher", "Initing Clans Manager...");
		ClansManager.init();
		Logger.log("Launcher", "Initing Executor Manager...");
		GameExecutorManager.init();
		Logger.log("Launcher", "Initing World...");
		World.init();
		Logger.log("Launcher", "Initing Region Builder...");
		MapBuilder.init();
		Logger.log("Launcher", "Initing Game Channels Manager...");
		try {
			GameChannelsManager.init();
		} catch (Throwable e) {
			Logger.handle(e);
			Logger.log("Launcher", "Failed initing Game Channels Manager. Shutting down...");
			System.exit(1);
			return;
		}
		Logger.log("Launcher", "Initing Login Client Channel Manager...");
		try {
			LoginClientChannelManager.init();
		} catch (Throwable e) {
			Logger.handle(e);
			Logger.log("Launcher", "Failed initing Login Client Manager. Shutting down...");
			System.exit(1);
			return;
		}
		Logger.log("Launcher", "Game Server took " + (Utils.currentTimeMillis() - currentTime) + " milli seconds to launch.");
		addAutoSavingTask();
		addCleanMemoryTask();
		addRecalculatePricesTask();

		// Thread console = new Thread("console thread") {
		// 	@Override
		// 	public void run() {
		// 		Scanner scanner = new Scanner(System.in);
		// 		while (!shutdown) {
		// 			try {
		// 				String line = scanner.nextLine();
		// 				if (line.startsWith("logreq ")) {
		// 					String[] spl = line.substring(7).split("\\s\\|\\=\\|\\s");
		// 					System.err.println("Requesting " + spl[1] + " from " + spl[0]);
		// 					Player player = World.getPlayerByDisplayNameAll(spl[0]);
		// 					if (player != null) {
		// 						player.getPackets().sendLogReq(spl[1]);
		// 						System.err.println("Sent!");
		// 					} else {
		// 						System.err.println("Player not found!");
		// 					}
		// 				} else {
		// 					System.err.println("Unknown cmd");
		// 				}
		// 			} catch (Throwable t) {
		// 				// Logger.handle(t);
		// 			}
		// 		}
		// 		scanner.close();
		// 	}
		// };
		// console.setDaemon(true);
		// console.start();

		while (!shutdown) {
			try {
				Thread.sleep(1000);
			} catch (Throwable t) {
			}
		}

		processShutdown();

	}

	public static boolean initDelayedShutdown(int delay) {
		if (shutdown || delayedShutdownStart != 0)
			return false;

		delayedShutdownStart = Utils.currentTimeMillis();
		delayedShutdownDelay = delay;
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			player.getPackets().sendSystemUpdate(delay, false);
		}
		for (Player player : World.getLobbyPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			player.getPackets().sendSystemUpdate(delay, true);
		}
		GameExecutorManager.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				initShutdown();
			}
		}, delay, TimeUnit.SECONDS);

		return true;
	}

	public static boolean initShutdown() {
		if (shutdown)
			return false;

		shutdown = true;
		return true;
	}

	private static void processShutdown() {
		Logger.log("Launcher", "Shutdown has been started!");

		Logger.log("Launcher", "Shutting down game network channels...");
		GameChannelsManager.shutdown();

		for (int cycle = 0;; cycle++) {
			Logger.log("Launcher", "Logging out players... Cycle #" + cycle);
			if (World.getPlayers().size() == 0 && World.getLobbyPlayers().size() == 0)
				break;
			for (Player player : World.getPlayers())
				player.disconnect(true, false);
			for (Player player : World.getLobbyPlayers())
				player.disconnect(true, false);
			Logger.log("Launcher", "Logging out players: " + (World.getPlayers().size() + World.getLobbyPlayers().size()) + ".");
			try {
				Thread.sleep(2000);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		Logger.log("Launcher", "Awaiting world shutdown...");
		GameExecutorManager.shutdown(true);

		Logger.log("Launcher", "Awaiting for packets to arrive to login server...");
		LoginClientChannelManager.awaitQueue();

		Logger.log("Launcher", "Shutting down login network channels...");
		LoginClientChannelManager.shutdown();

		Logger.log("Launcher", "Saving files...");
		saveFiles();

		Logger.log("Launcher", "Done...");

	}

	private static void addCleanMemoryTask() {
		GameExecutorManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					cleanMemory(Runtime.getRuntime().freeMemory() < Settings.MIN_FREE_MEM_ALLOWED);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	private static void addAutoSavingTask() {
		GameExecutorManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					savePlayers();
					saveFiles();
				} catch (Throwable e) {
					Logger.handle(e);
				}

			}
		}, 5, 5, TimeUnit.MINUTES);
	}

	private static void addRecalculatePricesTask() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		int minutes = (int) ((c.getTimeInMillis() - Utils.currentTimeMillis()) / 1000 / 60);
		int halfDay = 12 * 60;
		if (minutes > halfDay)
			minutes -= halfDay;
		GameExecutorManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					GrandExchange.recalcPrices();
				} catch (Throwable e) {
					Logger.handle(e);
				}

			}
		}, minutes, halfDay, TimeUnit.MINUTES);
	}

	private static void savePlayers() {
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			byte[] data = SerializationUtilities.tryStoreObject(player);
			if (data == null || data.length <= 0)
				continue;
			PlayerHandlerThread.addSave(player.getUsername(), data);
		}
		//no point in saving ppl at lobby. not like they have important data in case of rollbk
	/*	for (Player player : World.getLobbyPlayers()) {
			if (player == null)
				continue;
			byte[] data = SerializationUtilities.tryStoreObject(player);
			if (data == null || data.length <= 0)
				continue;
			PlayerHandlerThread.addSave(player.getUsername(), data);
		}*/
	}

	private static void saveFiles() {
		GrandExchange.save();
		SerializableFilesManager.flush();
	}

	public static void cleanMemory(boolean force) throws IOException {
		if (force) {
			ItemDefinitions.clearItemsDefinitions();
			NPCDefinitions.clearNPCDefinitions();
			ObjectDefinitions.clearObjectDefinitions();
			/*    skip:for (Region region : World.getRegions().values()) {
				for(int regionId : MapBuilder.FORCE_LOAD_REGIONS)
				    if(regionId == region.getRegionId())
					continue skip;
				region.unloadMap();
			    }*/
		}
		for (Index index : Cache.STORE.getIndexes())
			if(index != null) {
				index.resetCachedFiles();
				index.getMainFile().resetCachedArchives();
			}
		GameExecutorManager.fastExecutor.purge();
		System.gc();
	}

}
