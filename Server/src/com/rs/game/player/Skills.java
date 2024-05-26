package com.rs.game.player;

import java.io.Serializable;
import java.util.Arrays;

import com.rs.Settings;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.randomEvent.CombatEventNPC;
import com.rs.utils.Utils;

public final class Skills implements Serializable {

	private static final long serialVersionUID = -7086829989489745985L;

	public static final double MAXIMUM_EXP = 200000000;
	public static final double RANDOM_EVENT_EXP = 50000;
	
	
	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2, HITPOINTS = 3, RANGE = 4, PRAYER = 5, MAGIC = 6, COOKING = 7, WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11,
			CRAFTING = 12, SMITHING = 13, MINING = 14, HERBLORE = 15, AGILITY = 16, THIEVING = 17, SLAYER = 18, FARMING = 19, RUNECRAFTING = 20, CONSTRUCTION = 22, HUNTER = 21, SUMMONING = 23,
			DUNGEONEERING = 24, DIVINATION = 25;

	public static final String[] SKILL_NAME =
	{
		"Attack",
		"Defence",
		"Strength",
		"Constitution",
		"Ranged",
		"Prayer",
		"Magic",
		"Cooking",
		"Woodcutting",
		"Fletching",
		"Fishing",
		"Firemaking",
		"Crafting",
		"Smithing",
		"Mining",
		"Herblore",
		"Agility",
		"Thieving",
		"Slayer",
		"Farming",
		"Runecrafting",
		"Hunter",
		"Construction",
		"Summoning",
		"Dungeoneering",
		"Divination" 
		};
	
	public static int[] FIXED_SLOTS = { ATTACK, HITPOINTS, MINING, STRENGTH, AGILITY, SMITHING, DEFENCE, HERBLORE,
		FISHING, RANGE, THIEVING, COOKING, PRAYER, CRAFTING, FIREMAKING, MAGIC, FLETCHING, WOODCUTTING, RUNECRAFTING,
		SLAYER, FARMING, CONSTRUCTION, HUNTER, SUMMONING, DUNGEONEERING, DIVINATION };

	private short level[];
	private double xp[];
	private double[] xpTracks;
	private boolean[] trackSkills;
	private byte[] trackSkillsIds;
	private boolean xpDisplay, xpPopup;
	private int elapsedBonusMinutes;
	private double trackXPREvent;
	private transient double xpBonusTrack;

	private transient int currentCounter;
	private transient Player player;

	public void passLevels(Player p) {
		this.level = p.getSkills().level;
		this.xp = p.getSkills().xp;
	}

	public Skills() {
		level = new short[26];
		xp = new double[26];
		for (int i = 0; i < level.length; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
		level[HERBLORE] = 3;
		xp[HERBLORE] = 250;
		xpPopup = true;
		xpTracks = new double[3];
		trackSkills = new boolean[3];
		trackSkillsIds = new byte[3];
		trackSkills[0] = true;
		for (int i = 0; i < trackSkillsIds.length; i++)
			trackSkillsIds[i] = 30;

	}

	public void sendXPDisplay() {
		for (int i = 0; i < trackSkills.length; i++) {
			player.getVarsManager().sendVarBit(229 + i, trackSkills[i] ? 1 : 0);
			player.getVarsManager().sendVarBit(225 + i, trackSkillsIds[i] + 1);
			refreshCounterXp(i);
		}
		refreshXpPopup();
		refreshXPDisplay();
		refreshCurrentCounter();
	}


	public void refreshCurrentCounter() {
		player.getVarsManager().sendVar(96, currentCounter + 1);
	}

	public void setCurrentCounter(int counter) {
		if (counter != currentCounter) {
			currentCounter = counter;
			refreshCurrentCounter();
		}
	}

	public void switchTrackCounter() {
		trackSkills[currentCounter] = !trackSkills[currentCounter];
		player.getVarsManager().sendVarBit(229 + currentCounter, trackSkills[currentCounter] ? 1 : 0);
	}

	public void resetCounterXP() {
		xpTracks[currentCounter] = 0;
		refreshCounterXp(currentCounter);
	}

	public void setCounterSkill(int skill) {
		xpTracks[currentCounter] = 0;
		trackSkillsIds[currentCounter] = (byte) skill;
		player.getVarsManager().sendVarBit(225 + currentCounter, trackSkillsIds[currentCounter] + 1);
		refreshCounterXp(currentCounter);
	}

	public void refreshCounterXp(int counter) {
		player.getVarsManager().sendVar(91 + counter, (int) (xpTracks[counter] * 10));
	}

	public void handleSetupXPCounter(int componentId) {
		if (componentId >= 13 && componentId <= 31)
			setCurrentCounter((componentId - 13) / 8);
		else if (componentId == 36)
			switchTrackCounter();
		else if (componentId == 70)
			resetCounterXP();
		else if (componentId == 2)
			switchXPDisplay();
		else if (componentId >= 41 && componentId <= 68)
			if (componentId == 43)
				setCounterSkill(4);
			else if (componentId == 44)
				setCounterSkill(2);
			else if (componentId == 45)
				setCounterSkill(3);
			else if (componentId == 52)
				setCounterSkill(18);
			else if (componentId == 59)
				setCounterSkill(11);
			else
				setCounterSkill(componentId >= 67 ? componentId - 38 : componentId - 41);
	}

	public void unlockSkills(boolean menu) {
		player.getPackets().sendIComponentSettings(menu ? 320 : 1466, menu ? 13 : 11, 0, 26, 30);
	}
	
	public void refreshXpPopup() {
		player.getVarsManager().sendVarBit(228, xpPopup ? 0 : 1);
	}
	
	public void refreshXPDisplay() {
		player.getVarsManager().sendVarBit(19964, xpDisplay ? 0 : 1);
	}

	public void switchXPDisplay() {
		xpDisplay = !xpDisplay;
		refreshXPDisplay();
	}

	public void switchXPPopup() {
		xpPopup = !xpPopup;
		refreshXpPopup();
		player.getPackets().sendGameMessage("XP pop-ups are now " + (xpPopup ? "en" : "dis") + "abled.");
	}

	public void restoreSkills() {
		for (int skill = 0; skill < level.length; skill++) {
			level[skill] = (short) getLevelForXp(skill);
			refresh(skill);
		}
	}

	public void setPlayer(Player player) {
		this.player = player;
		// temporary
		if (xpTracks == null) {
			xpPopup = true;
			xpTracks = new double[3];
			trackSkills = new boolean[3];
			trackSkillsIds = new byte[3];
			trackSkills[0] = true;
			for (int i = 0; i < trackSkillsIds.length; i++)
				trackSkillsIds[i] = 30;
		}
		
		if (xp.length != 26) {
			xp = Arrays.copyOf(xp, 26);
			level = Arrays.copyOf(level, 26);
			level[DIVINATION] = 1;
		}
	}

	public short[] getLevels() {
		return level;
	}

	public double[] getXp() {
		return xp;
	}

	public int getLevel(int skill) {
		return level[skill];
	}

	public double getXp(int skill) {
		return xp[skill];
	}

	public boolean hasRequiriments(int... skills) {
		for (int i = 0; i < skills.length; i += 2) {
			int skillId = skills[i];
			if (skillId == DUNGEONEERING)
				continue;
			int skillLevel = skills[i + 1];
			if (getLevelForXp(skillId) < skillLevel)
				return false;

		}
		return true;
	}

	public int getTotalLevel() {
		int level = 0;
		for (int i = 0; i < xp.length; i++)
			level += getLevelForXp(i);
		return level;
	}

	public long getTotalXp() {
		long xp = 0;
		for (int i = 0; i < this.xp.length; i++)
			xp += this.xp[i];
		return xp;
	}

	public int getCombatLevel() {
		int attack = getLevelForXp(0);
		int defence = getLevelForXp(1);
		int strength = getLevelForXp(2);
		int hitpoints = getLevelForXp(3);
		int prayer = getLevelForXp(5);
		int ranged = getLevelForXp(4);
		int magic = getLevelForXp(6);
		double combatLevel = (defence + hitpoints + Math.floor(prayer / 2)) * 0.25;
		double warrior = (attack + strength) * 0.325;
		double ranger = ranged * 0.4875;
		double mage = magic * 0.4875;
		combatLevel += Math.max(warrior, Math.max(ranger, mage));
		return (int) combatLevel;
	}

	public int getCombatLevelWithSummoning() {
		return getCombatLevel() + getSummoningCombatLevel();
	}

	public int getSummoningCombatLevel() {
		double summon = Math.floor(getLevelForXp(Skills.SUMMONING) / 2) * 0.25;
		return (int) summon;
	}

	public void set(int skill, int newLevel) {
		level[skill] = (short) newLevel;
		refresh(skill);
	}

	public int drainLevel(int skill, int drain) {
		int drainLeft = drain - level[skill];
		if (drainLeft < 0) {
			drainLeft = 0;
		}
		level[skill] -= drain;
		if (level[skill] < 0) {
			level[skill] = 0;
		}
		refresh(skill);
		return drainLeft;
	}

	public void drainSummoning(int amt) {
		int level = getLevel(Skills.SUMMONING);
		if (level == 0)
			return;
		set(Skills.SUMMONING, amt > level ? 0 : level - amt);
	}

	public static int getXPForLevel(int level) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= level; lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			if (lvl >= level) {
				return output;
			}
			output = (int) Math.floor(points / 4);
		}
		return 0;
	}

	public int getLevelForXp(int skill) {
		return getLevelForXp(xp[skill], skill == DUNGEONEERING ? 120 : 99);
	}
	
	public static int getLevelForXp(double exp, int max) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= max; lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return max;
	}
	
	
	
	public static double getXPRate(int level, boolean combatSkill) {
		return level >= 99 ? 10 : ((combatSkill ? 2 : 1) * ((double)level / 4d + 1d));
	}

	public int getHighestSkillLevel() {
		int maxLevel = 1;
		for (int skill = 0; skill < level.length; skill++) {
			int level = getLevelForXp(skill);
			if (level > maxLevel)
				maxLevel = level;
		}
		return maxLevel;
	}

	public void init() {
		for (int skill = 0; skill < level.length; skill++)
			refresh(skill);
		sendXPDisplay();
		if (!Settings.XP_BONUS_ENABLED)
			elapsedBonusMinutes = 0;
		else
			refreshXpBonus();
	}

	private double getXpBonusMultiplier() {
		if (elapsedBonusMinutes >= 600)
			return 1.1;
		double hours = elapsedBonusMinutes / 60;
		return Math.pow((hours - 10) / 7.5, 2) + 1.1;
	}

	public void refreshBonusXp() {
		player.getVarsManager().sendVarOld(1878, (int) (xpBonusTrack * 10));
	}

	public void refreshXpBonus() {
		player.getVarsManager().sendVarBitOld(7232, 1);
		refreshElapsedBonusMinutes();
		refreshBonusXp();
	}

	public void increaseElapsedBonusMinues() {
		elapsedBonusMinutes++;
		refreshElapsedBonusMinutes();
	}

	public void refreshElapsedBonusMinutes() {
		player.getVarsManager().sendVarBitOld(7233, elapsedBonusMinutes);
	}

	public void refresh(int skill) {
		player.getPackets().sendSkillLevel(skill);
	}

	/*
	 * if(componentId == 33) setCounterSkill(4); else if(componentId == 34)
	 * setCounterSkill(2); else if(componentId == 35) setCounterSkill(3); else
	 * if(componentId == 42) setCounterSkill(18); else if(componentId == 49)
	 * setCounterSkill(11);
	 */

	public static int getCounterSkill(int skill) {
		switch (skill) {
		case ATTACK:
			return 0;
		case STRENGTH:
			return 1;
		case DEFENCE:
			return 4;
		case RANGE:
			return 2;
		case HITPOINTS:
			return 5;
		case PRAYER:
			return 6;
		case AGILITY:
			return 7;
		case HERBLORE:
			return 8;
		case THIEVING:
			return 9;
		case CRAFTING:
			return 10;
		case MINING:
			return 12;
		case SMITHING:
			return 13;
		case FISHING:
			return 14;
		case COOKING:
			return 15;
		case FIREMAKING:
			return 16;
		case WOODCUTTING:
			return 17;
		case SLAYER:
			return 19;
		case FARMING:
			return 20;
		case CONSTRUCTION:
			return 21;
		case HUNTER:
			return 22;
		case SUMMONING:
			return 23;
		case DUNGEONEERING:
			return 24;
		case DIVINATION:
			return 25;
		case MAGIC:
			return 3;
		case FLETCHING:
			return 18;
		case RUNECRAFTING:
			return 11;
		default:
			return -1;
		}

	}

	public double addXp(int skill, double exp) {
		return addXp(skill, exp, false);
	}

	public double addXp(int skill, double exp, boolean forceRSXp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		if (player.isXpLocked())
			return 0;
		if (player.getAuraManager().usingWisdom())
			exp *= 1.025;
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);
		double bonus = 0;
		if (!forceRSXp && (!player.isCanPvp() || !combatSkill)) {
			if(exp < RANDOM_EVENT_EXP && CombatEventNPC.canRandomEvent(player)) {
				trackXPREvent += exp;
				if(trackXPREvent >= RANDOM_EVENT_EXP) {
					trackXPREvent = 0;
					if(Utils.random(3) == 0) //random factor
						CombatEventNPC.startRandomEvent(player, skill);
				}
			}
			exp *= getXPRate(getLevelForXp(skill), combatSkill);//combatSkill ? Settings.getCombatXpRate(player) : Settings.getXpRate(player);
			
	//		exp *= player.isExtremeDonator() ? rate + 2 : player.isDonator() ? rate + 1 : rate;
			/*if (player.hasVotedInLast12Hours()) {
				double oldExp = exp;
				exp *= 1.25;
				bonus += exp - oldExp;
			}
			if (player.isBeginningAccount()) {
				double newexp = exp * 2.0;
				double expDifference = newexp - exp;
				bonus += expDifference;
				refreshBonusXp();
			} else if (Settings.XP_BONUS_ENABLED) {
				double newexp = exp * getXpBonusMultiplier();
				double expDifference = newexp - exp;
				xpBonusTrack += expDifference;
				bonus += expDifference;
				exp = newexp;
				refreshBonusXp();
			}*/
		}
		player.getVarsManager().sendVarOld(2044, (int) (bonus * 10));
		
		int oldLevel = getLevelForXp(skill);
		int oldCombatLevel = getCombatLevelWithSummoning();
		for (int i = 0; i < trackSkills.length; i++) {
			if (trackSkills[i]) {
				if (trackSkillsIds[i] == 30 || (trackSkillsIds[i] == 29 && (skill == Skills.ATTACK || skill == Skills.DEFENCE || skill == Skills.STRENGTH || skill == Skills.MAGIC || skill == Skills.RANGE || skill == Skills.HITPOINTS)) || trackSkillsIds[i] == getCounterSkill(skill)) {
					xpTracks[i] += exp;
					refreshCounterXp(i);
				}
			}
		}
		if (xp[skill] == MAXIMUM_EXP)
			return 0;
		double oldXp = xp[skill];
		xp[skill] += exp;
		if (xp[skill] > MAXIMUM_EXP) 
			xp[skill] = MAXIMUM_EXP;
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			sendLevelUpInterface(skill);
			player.getAppearence().generateAppearenceData();
			if (combatSkill) {
				if(oldCombatLevel != getCombatLevelWithSummoning())
					sendCombatLevel();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 100);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
			player.getQuestManager().checkCompleted();
			player.getControlerManager().trackLevelUp(skill, level[skill]);
		}
		sendNews(skill, newLevel > oldLevel, oldCombatLevel, oldXp);
		refresh(skill);
		return exp;
	}
	
	public void sendCombatLevel() {
		player.getPackets().sendCSVarInteger(1000, getCombatLevelWithSummoning());
	}
	
	public void sendNews(int skill, boolean levelUP, int combatLevelBefore, double oldXp) {
		if (Settings.HOSTED)
			return;
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);
		if (combatSkill && Settings.SPAWN_WORLD)
			return;
		if (!levelUP) {
			if(xp[skill] > 50000000) { //50m
				if(getLevelForXp(oldXp, 120) != 120 && getLevelForXp(xp[skill], 120) == 120) 
					World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
				else{
					int next = (int) (xp[skill] / 50000000);
					int xpachievement = next * 50000000;
					if (oldXp < xpachievement && xp[skill] >= xpachievement) 
						World.sendNews(player, player.getDisplayName() + " has achieved "+(next*50)+"m " + Skills.SKILL_NAME[skill] + " xp.", World.SERVER_NEWS);
				}
			}
		} else {
			if (combatSkill && combatLevelBefore != 138 && getCombatLevelWithSummoning() == 138) {
				World.sendNews(player, player.getDisplayName() + " has achieved level 138 combat.", World.SERVER_NEWS);
				return;
			}
			int level = getLevelForXp(skill);
			millestone: if (level % 10 == 0 || level == 99) {
				for (int i = 0; i < Skills.SKILL_NAME.length; i++) {
					if (player.getSkills().getLevelForXp(i) < level)
						break millestone;
				}
				World.sendNews(player, player.getDisplayName() + " has just achieved at least level " + level + " in all skills!", level == 99 ? World.WORLD_NEWS : World.FRIEND_NEWS);
				return;
			}
			if (level == 99)
				World.sendNews(player, player.getDisplayName() + " has achieved " + level + " " + Skills.SKILL_NAME[skill] + ".", World.SERVER_NEWS);
			else if (level == 120)
				World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
		}
	}

	public static final int[] LEVEL_MUSIC =
	{ 30, 38, 66, 48, 58, 56, 52, 34, 70, 44, 42, 40, 36, 64, 54, 46, 28, 68, 61, 10, 60, 50, 32, 301, 417, -1 };

	private void sendLevelUpInterface(int skill) {
		int iconValue = getIconValue(skill);
		player.getPackets().sendCSVarInteger(1756, iconValue);
		player.getInterfaceManager().setWindowInterface(InterfaceManager.LEVEL_UP_COMPONENT_ID, 1216);
		int level = player.getSkills().getLevelForXp(skill);
		player.getTemporaryAttributtes().put("leveledUp", skill);
		player.getTemporaryAttributtes().put("leveledUp[" + skill + "]", Boolean.TRUE);
		player.setNextGraphics(new Graphics(199));
		if (level == 99 || level == 120)
			player.setNextGraphics(new Graphics(1765));
		String name = Skills.SKILL_NAME[skill];
		player.getPackets().sendGameMessage("You've just advanced a" + (name.startsWith("A") ? "n" : "") + " " + name + " level! You have reached level " + level + ".");
		//player.getVarsManager().sendVarBit(3292, iconValue);
		switchFlash(player, skill, true);
		player.getPackets().sendMusicEffectOld(LEVEL_MUSIC[skill]);
	}

	public static int getIconValue(int skill) {
		if (skill == Skills.ATTACK)
			return 1;
		if (skill == Skills.STRENGTH)
			return 2;
		if (skill == Skills.RANGE)
			return 3;
		if (skill == Skills.MAGIC)
			return 4;
		if (skill == Skills.DEFENCE)
			return 5;
		if (skill == Skills.HITPOINTS)
			return 6;
		if (skill == Skills.PRAYER)
			return 7;
		if (skill == Skills.AGILITY)
			return 8;
		if (skill == Skills.HERBLORE)
			return 9;
		if (skill == Skills.THIEVING)
			return 10;
		if (skill == Skills.CRAFTING)
			return 11;
		if (skill == Skills.RUNECRAFTING)
			return 12;
		if (skill == Skills.MINING)
			return 13;
		if (skill == Skills.SMITHING)
			return 14;
		if (skill == Skills.FISHING)
			return 15;
		if (skill == Skills.COOKING)
			return 16;
		if (skill == Skills.FIREMAKING)
			return 17;
		if (skill == Skills.WOODCUTTING)
			return 18;
		if (skill == Skills.FLETCHING)
			return 19;
		if (skill == Skills.SLAYER)
			return 20;
		if (skill == Skills.FARMING)
			return 21;
		if (skill == Skills.CONSTRUCTION)
			return 22;
		if (skill == Skills.HUNTER)
			return 23;
		if (skill == Skills.SUMMONING)
			return 24;
		else if (skill == Skills.DUNGEONEERING)
			return 25;
		return 26;
	}

	public static void switchFlash(Player player, int skill, boolean on) {
		int id = 0;
		if (skill == Skills.ATTACK)
			id = 3267;
		else if (skill == Skills.STRENGTH)
			id = 3268;
		else if (skill == Skills.DEFENCE)
			id = 3269;
		else if (skill == Skills.RANGE)
			id = 3270;
		else if (skill == Skills.PRAYER)
			id = 3271;
		else if (skill == Skills.MAGIC)
			id = 3272;
		else if (skill == Skills.HITPOINTS)
			id = 3273;
		else if (skill == Skills.AGILITY)
			id = 3274;
		else if (skill == Skills.HERBLORE)
			id = 3275;
		else if (skill == Skills.THIEVING)
			id = 3276;
		else if (skill == Skills.CRAFTING)
			id = 3277;
		else if (skill == Skills.FLETCHING)
			id = 3278;
		else if (skill == Skills.MINING)
			id = 3279;
		else if (skill == Skills.SMITHING)
			id = 3280;
		else if (skill == Skills.FISHING)
			id = 3281;
		else if (skill == Skills.COOKING)
			id = 3282;
		else if (skill == Skills.FIREMAKING)
			id = 3283;
		else if (skill == Skills.WOODCUTTING)
			id = 3284;
		else if (skill == Skills.RUNECRAFTING)
			id = 3285;
		else if (skill == Skills.SLAYER)
			id = 3286;
		else if (skill == Skills.FARMING)
			id = 3287;
		else if (skill == Skills.CONSTRUCTION)
			id = 3288;
		else if (skill == Skills.HUNTER)
			id = 3289;
		else if (skill == Skills.SUMMONING)
			id = 3290;
		else if (skill == Skills.DUNGEONEERING)
			id = 3291;
		else if (skill == Skills.DIVINATION)
			id = 20114;
		player.getVarsManager().sendVarBit(id, on ? 1 : 0);
	}

	public double addXpStore(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		for (int i = 0; i < trackSkills.length; i++) {
			if (trackSkills[i]) {
				if (trackSkillsIds[i] == 30 || (trackSkillsIds[i] == 29 && (skill == Skills.ATTACK || skill == Skills.DEFENCE || skill == Skills.STRENGTH || skill == Skills.MAGIC || skill == Skills.RANGE || skill == Skills.HITPOINTS)) || trackSkillsIds[i] == getCounterSkill(skill)) {
					xpTracks[i] += exp;
					refreshCounterXp(i);
				}
			}
		}

		if (xp[skill] > MAXIMUM_EXP) {
			xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 100);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
			player.getQuestManager().checkCompleted();
		}
		refresh(skill);
		return exp;
	}

	public double addXpLamp(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		if (player.isXpLocked())
			return 0;
		exp *= Settings.getLampXpRate(player);
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		for (int i = 0; i < trackSkills.length; i++) {
			if (trackSkills[i]) {
				if (trackSkillsIds[i] == 30 || (trackSkillsIds[i] == 29 && (skill == Skills.ATTACK || skill == Skills.DEFENCE || skill == Skills.STRENGTH || skill == Skills.MAGIC || skill == Skills.RANGE || skill == Skills.HITPOINTS)) || trackSkillsIds[i] == getCounterSkill(skill)) {
					xpTracks[i] += exp;
					refreshCounterXp(i);
				}
			}
		}

		if (xp[skill] > MAXIMUM_EXP) {
			xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 10);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
			player.getQuestManager().checkCompleted();
		}
		refresh(skill);
		return exp;
	}

	public void addSkillXpRefresh(int skill, double xp) {
		this.xp[skill] += xp;
		level[skill] = (short) getLevelForXp(skill);
	}

	public void resetSkillNoRefresh(int skill) {
		xp[skill] = 0;
		level[skill] = 1;
	}

	public void setXp(int skill, double exp) {
		xp[skill] = exp;
		refresh(skill);
	}

	public boolean canObtainTrimmed() {
		int count99 = 0;
		for (int skill = 0; skill < SKILL_NAME.length; skill++) {
			if (level[skill] == 99)
				count99++;
		}
		return count99 >= 2;
	}

	public void setXp(double[] xp) {
		// TODO remove
		this.xp = xp;
	}
}
