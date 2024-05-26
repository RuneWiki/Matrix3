package com.rs.tools;

import java.io.File;
import java.io.FileOutputStream;

import minifs.MiniFS;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.player.Player;
import com.rs.game.player.content.FishingSpotsHandler;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controllers.ControlerHandler;
import com.rs.game.player.cutscenes.CutscenesHandler;
import com.rs.game.player.dialogues.DialogueHandler;
import com.rs.utils.Censor;
import com.rs.utils.ItemDestroys;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSpawns;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;
import com.rs.utils.MapAreas;
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
import com.rs.utils.huffman.Huffman;

public class AccDumper {

	public static void main(String[] args) throws Throwable {
		Settings.HOSTED = false;
		Logger.log("Launcher", "Initing File System...");
		SerializableFilesManager.init();
		Logger.log("Launcher", "Initing Cache...");
		Cache.init();
		Huffman.init();
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
		ItemDestroys.init();
		ItemSpawns.init();
		MusicHints.init();
		ShopsHandler.init();
		GrandExchange.init();
		Logger.log("Launcher", "Initing Controlers...");
		ControlerHandler.init();
		Logger.log("Launcher", "Initing Fishing Spots...");
		FishingSpotsHandler.init();
		Logger.log("Launcher", "Initing NPC Combat Scripts...");
		CombatScriptsHandler.init();
		Logger.log("Launcher", "Initing Dialogues...");
		DialogueHandler.init();
		Logger.log("Launcher", "Initing Cutscenes...");
		CutscenesHandler.init();
		Logger.log("Launcher", "Initing Clans Manager...");
		ClansManager.init();

		MiniFS fs = MiniFS.open(Settings.DATA_PATH);
		String[] accs = fs.listFiles("characters/");

		int last = 0;
		int amt = 0;
		int errors = 0;

		FileOutputStream fos = new FileOutputStream(new File("dump.dat"));

		for (String acc : accs) {
			try {
				if ((amt - last) > 5000) {
					last = amt;
					System.err.println("Progress:" + amt + "/" + accs.length + ", errors:" + errors);
					fos.flush();
				}

				Player player = (Player) SerializationUtilities.loadObject(fs.getFile(acc));

				AccData data = new AccData();
				data.username = acc.substring(11, acc.length() - 2);
				data.password = (String) Player.class.getMethod("getPassword").invoke(player);
				;

				data.pouch = player.getMoneyPouch().getCoinsAmount();

				data.inventory = player.getInventory().getItems().getItems();
				data.bank = player.getBank().getContainerCopy();
				data.equipment = player.getEquipment().getItems().getItems();

				data.exp = player.getSkills().getXp();
				data.ge = player.getGeManager();

				byte[] d = SerializationUtilities.storeObject(data);

				fos.write(d.length);
				fos.write(d.length >> 8);
				fos.write(d.length >> 16);
				fos.write(d.length >> 24);
				fos.write(d);
				amt++;
			} catch (Throwable t) {
				//t.printStackTrace();
				errors++;
			}
		}

		fos.flush();
		fos.close();

		System.out.println("Finished");

	}

}
