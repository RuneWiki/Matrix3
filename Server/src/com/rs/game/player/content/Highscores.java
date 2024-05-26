package com.rs.game.player.content;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.rs.Settings;
import com.rs.executor.GameExecutorManager;
import com.rs.game.TemporaryAtributtes.Key;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

public class Highscores {

	public static void updatePlayer(final Player player) {
		if (player.getRights() >= 2 || !Settings.HOSTED)
			return;
		GameExecutorManager.slowExecutor.execute(new Runnable() {
			@Override
			public void run() {
				try {
					updateSkill(player);
				} catch (Throwable e) {
				//	e.printStackTrace();
					//failed to update highscore, w/e, updaten ex time u logout then
				}
			}
		});
	}

	private static void updateSkill(Player player) throws Throwable {
		if (Settings.WORLD_ID != 1)
			return;
		String url = Settings.HIGHSCORES_API_LINK + "?xpmode=" + player.getXpRateMode();
		url += "&username=" + URLEncoder.encode(player.getUsername(), "UTF-8");
		url += "&displayname=" + URLEncoder.encode(player.getDisplayName(), "UTF-8");
		for (int i = 0; i < Skills.SKILL_NAME.length; i++) {
			url += "&s" + i + "=" + (i + 1);
			url += "&l" + i + "=" + player.getSkills().getLevelForXp(i);
			url += "&x" + i + "=" + (int) player.getSkills().getXp(i);
		}
		url += "&s" + Skills.SKILL_NAME.length + "=0";
		url += "&l" + Skills.SKILL_NAME.length + "=" + player.getSkills().getTotalLevel();
		url += "&x" + Skills.SKILL_NAME.length + "=" + (long) player.getSkills().getTotalXp();
		URLConnection c = new URL(url).openConnection();
		c.setConnectTimeout(3000);
		BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		reader.close();
	}
	
	
	public static void openHighscoresWebPage(Player player) {
		player.getPackets().sendOpenURL(Settings.HIGHSCORES_LINK);
	}
	
	
	private static void setHighscoreTable(Player player, int spriteId, int skillId, String[] lines) {
		
		
		
		int index = skillId == -1 ? 0 : (skillId+1);
		
		int rank = lines == null || lines[index] == null ? -1 : (Integer.parseInt(lines[index].split("=")[1]) + 1);
		
		
		player.getPackets().sendExecuteScript(7828, spriteId, skillId == -1 ? "Overall" : Skills.SKILL_NAME[skillId], rank, "Not Ranked");
	}
	/*
	 * 0 - skill. 1 -  seasonal.  2 - activitiess
	 */
	public static void loadHighscores(Player player, int menu) {
		Integer currentMenu = (Integer) player.getTemporaryAttributtes().get(Key.HIGHSCORES);
		if(currentMenu != null && currentMenu == menu)
			return;
		setLoadingStage(player, 0);
		player.getTemporaryAttributtes().put(Key.HIGHSCORES, menu);
		GameExecutorManager.slowExecutor.execute(new Runnable() {
			@Override
			public void run() {
				try {
					if (menu == 0) {
						Integer currentMenu = (Integer) player.getTemporaryAttributtes().get(Key.HIGHSCORES);
						if(currentMenu == null || currentMenu != menu)
							return;
						setLoadingStage(player, 1);
						URLConnection c = new URL(Settings.HIGHSCORES_LINK+"query_npe.php?getrank="+URLEncoder.encode(player.getUsername(), "UTF-8")).openConnection();
						c.setConnectTimeout(3000);
						BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
						String line = reader.readLine();
						String[] lines = null;
						if(line.startsWith("xpmode=")) {
							lines = new String[Skills.SKILL_NAME.length+1];
							for(int i = 0; i < lines.length; i++) {
								lines[i] = reader.readLine();
							}
						}
						reader.close();
						currentMenu = (Integer) player.getTemporaryAttributtes().get(Key.HIGHSCORES);
						if(currentMenu == null || currentMenu != menu)
							return;
						player.getPackets().sendExecuteScript(7825, 0);
						player.getPackets().sendIComponentText(1419, 34, "Skills");
						//they get added by the order you send. this is rs order. not skills order(kinda separates by categories
						setHighscoreTable(player, 20232, -1, lines);
						setHighscoreTable(player, 1478, Skills.ATTACK, lines);
						setHighscoreTable(player, 1479, Skills.STRENGTH, lines);
						setHighscoreTable(player, 1481, Skills.RANGE, lines);
						setHighscoreTable(player, 1483, Skills.MAGIC, lines);
						setHighscoreTable(player, 1480, Skills.DEFENCE, lines);
						setHighscoreTable(player, 1484, Skills.HITPOINTS, lines);
						setHighscoreTable(player, 1482, Skills.PRAYER, lines);
						setHighscoreTable(player, 1485, Skills.AGILITY, lines);
						setHighscoreTable(player, 1486, Skills.HERBLORE, lines);
						setHighscoreTable(player, 1487, Skills.THIEVING, lines);
						setHighscoreTable(player, 1488, Skills.CRAFTING, lines);
						setHighscoreTable(player, 1496, Skills.RUNECRAFTING, lines);
						setHighscoreTable(player, 1490, Skills.MINING, lines);
						setHighscoreTable(player, 1491, Skills.SMITHING, lines);
						setHighscoreTable(player, 1492, Skills.FISHING, lines);
						setHighscoreTable(player, 1493, Skills.COOKING, lines);
						setHighscoreTable(player, 1494, Skills.FIREMAKING, lines);
						setHighscoreTable(player, 1495, Skills.WOODCUTTING, lines);
						setHighscoreTable(player, 1489, Skills.FLETCHING, lines);
						setHighscoreTable(player, 1497, Skills.SLAYER, lines);
						setHighscoreTable(player, 1498, Skills.FARMING, lines);
						setHighscoreTable(player, 1502, Skills.CONSTRUCTION, lines);
						setHighscoreTable(player, 1501, Skills.HUNTER, lines);
						setHighscoreTable(player, 1503, Skills.SUMMONING, lines);
						setHighscoreTable(player, 3032, Skills.DUNGEONEERING, lines);
						setHighscoreTable(player, 9204, Skills.DIVINATION, lines);
						setLoadingStage(player, 3);
					}
					else if (menu == 1) {
						setLoadingStage(player, 1);
						player.getPackets().sendIComponentText(1419, 34, "Seasonal");
						player.getPackets().sendExecuteScript(7825, 1);
						//player.getPackets().sendExecuteScript(7827, 24947, "Clue Scrolls", "The total number of Clue Scrolls completed.", -1, "Not Ranked", 0, 0, 0);
					///	player.getPackets().sendExecuteScript(7827, 24948, "Time online", "The time you have been online.", -1, "Not Ranked", 0, 7, 0);
					//	player.getPackets().sendExecuteScript(7827, 24948, "Deaths", "The total number of Deaths, not including safe minigames or Hardcore ironman mode.", -1, "Not Ranked", 0, 7, 0);
						player.getPackets().sendExecuteScript(7827, 24948, "PVP Kills", "The total number of Kills, not including safe minigames or Hardcore ironman mode.", -1, "Not Ranked", 0, 0, 0);
						//	player.getPackets().sendExecuteScript(7827, 18892, "Penance Kings Killed", "Total number of Penance King kills", -1, "Not Ranked", 8, 7, 0);
					//	player.getPackets().sendExecuteScript(7827, 18891, "Penance Queens Killed", "Total number of Penance Queen kills.", -1, "Not Ranked", 8, 7, 0);

						player.getPackets().sendExecuteScript(7826, 1);
						setLoadingStage(player, 4);

					}else if(menu == 2) {
						player.getPackets().sendExecuteScript(7825, 0);
						player.getPackets().sendIComponentText(1419, 34, "Activities");
						player.getPackets().sendExecuteScript(7826, 0);
						setLoadingStage(player, 3);
					}
				}
				catch (Throwable e) {
					setLoadingStage(player, 2);

					//e.printStackTrace();
				}
			}
		});
	}
	
	/*
	2-  highscores something has gone wrong
	0 - Waiting for highscores to be calculated.
	1 - highscores are being calculated
	3 - highscore loaded
	4 - seasonal highscore loaded
	*/
	private static void setLoadingStage(Player player, int stage) {
		player.getPackets().sendHideIComponent(1419, 5, stage != 0);
		player.getPackets().sendHideIComponent(1419, 6, stage != 1);
		player.getPackets().sendHideIComponent(1419, 3, stage != 2);
		player.getPackets().sendHideIComponent(1419, 8, stage != 3);
		player.getPackets().sendHideIComponent(1419, 9, stage != 4);
		
	}

}
