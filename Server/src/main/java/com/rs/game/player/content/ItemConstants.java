package com.rs.game.player.content;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.player.Player;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.Skills;
import com.rs.game.player.TreasureTrailsManager;
import com.rs.game.player.content.commands.Commands;

public class ItemConstants {

	// return amt of charges
	public static int getItemDefaultCharges(int id) {
		// Pvp Armors
		if (id == 13910 || id == 13913 || id == 13916 || id == 13919 || id == 13922 || id == 13925 || id == 13928 || id == 13931 || id == 13934 || id == 13937 || id == 13940 || id == 13943 || id == 13946 || id == 13949 || id == 13952)
			return 1500 * Settings.getDegradeGearRate(); // 15minutes
		if (id == 13960 || id == 13963 || id == 13966 || id == 13969 || id == 13972 || id == 13975)
			return 2000 * Settings.getDegradeGearRate();// 20 min.
		if (id == 13860 || id == 13863 || id == 13866 || id == 13869 || id == 13872 || id == 13875 || id == 13878 || id == 13886 || id == 13889 || id == 13892 || id == 13895 || id == 13898 || id == 13901 || id == 13904 || id == 13907 || id == 13960)
			return 6000 * Settings.getDegradeGearRate(); // 1hour
		// Nex Armor
		if (id == 20137 || id == 20141 || id == 20145 || id == 20149 || id == 20153 || id == 20157 || id == 20161 || id == 20165 || id == 20169)
			return 60000 * Settings.getDegradeGearRate(); // 10 hour
		//Crystal bow
		if (id == 4214 || id == 4215 || id == 4216 || id == 4217 || id == 4218 || id == 4219 || id == 4220 || id == 4221 || id == 4222 || id == 4223)
			return 250;
		if (id == 4225 || id == 4226 || id == 4227 || id == 4228 || id == 4229 || id == 4230 || id == 4231 || id == 4232 || id == 4233 || id == 4234)
			return 250;
		//barrows degraded already
		if ((id >= 21762 && id <= 21765) || (id >= 21754 && id <= 21757) || (id >= 21746 && id <= 21749) || (id >= 21738 && id <= 21741) || (id >= 4856 && id <= 4859) || (id >= 4862 && id <= 4865) || (id >= 4868 && id <= 4871) || (id >= 4874 && id <= 4877) || (id >= 4880 && id <= 4883) || (id >= 4886 && id <= 4889) || (id >= 4892 && id <= 4895) || (id >= 4898 && id <= 4901) || (id >= 4904 && id <= 4907) || (id >= 4910 && id <= 4913) || (id >= 4916 && id <= 4919) || (id >= 4922 && id <= 4925) || (id >= 4928 && id <= 4931) || (id >= 4934 && id <= 4937) || (id >= 4940 && id <= 4943) || (id >= 4946 && id <= 4949) || (id >= 4952 && id <= 4955) || (id >= 4958 && id <= 4961) || (id >= 4964 && id <= 4967) || (id >= 4970 && id <= 4973) || (id >= 4976 && id <= 4979) || (id >= 4982 && id <= 4985) || (id >= 4988 && id <= 4991) || (id >= 4994 && id <= 4997))
			return 30000 * Settings.getDegradeGearRate();
		if (id >= 24450 && id <= 24454) // rouge gloves
			return 6000;
		if (id >= 22358 && id <= 22369) // dominion gloves
			return 24000 * Settings.getDegradeGearRate();
		if (id == 22444) //neem oil
			return 2000;
		//polipore armors
		if (id == 22460 || id == 22464 || id == 22468 || id == 22472 || id == 22476 || id == 22480 || id == 22484 || id == 22488 || id == 22492)
			return 60000 * Settings.getDegradeGearRate(); // 10 hour
		if (id == 18349 || id == 18351 || id == 18353 || id == 18355 || id == 18357 || id == 18359 || id == 18361 || id == 18363 || id == 18365 || id == 18367 || id == 18369 || id == 18371 || id == 18373)
			return 30000 * Settings.getDegradeGearRate(); // 5 hour
		if (id == 22496)
			return 3000;
		if (id == 20173)
			return 60000;
		if (id == 11283)
			return 50;
		return -1;
	}

	/*
	 * all items should degrade when dying, small exeption for polypore
	 */
	public static boolean itemDegradesInDeath(int id) {
		if (id == 22460 || id == 22464 || id == 22468 || id == 22472 || id == 22476 || id == 22480 || id == 22484 || id == 22488 || id == 22492)
			return false;//polypore
		if (id == 18349 || id == 18351 || id == 18353 || id == 18355 || id == 18357 || id == 18359 || id == 18361 || id == 18363 || id == 18365 || id == 18367 || id == 18369 || id == 18371 || id == 18373)
			return false;//choatics
		return true;
	}

	// return what id it degrades to when charges end, -1 for disapear which is
	// default so we
	public static int getItemDegrade(int id) {
		if (id == 11283) // DFS
			return 11284;
		if (id == 22444) //neem oil
			return 1935;
		// nex armors
		if (id == 20137 || id == 20141 || id == 20145 || id == 20149 || id == 20153 || id == 20157 || id == 20161 || id == 20165 || id == 20169)
			return id + 1;
		//dung items (chaotics)
		if (id == 18349 || id == 18351 || id == 18353 || id == 18355 || id == 18357 || id == 18359 || id == 18361 || id == 18363 || id == 18365 || id == 18367 || id == 18369 || id == 18371 || id == 18373)
			return id + 1;
		//new barrows equipment
		if (id == 4708 || id == 4710 || id == 4712 || id == 4714 || id == 4716 || id == 4718 || id == 4720 || id == 4722 || id == 4724 || id == 4726 || id == 4728 || id == 4730 || id == 4732 || id == 4734 || id == 4736 || id == 4738)
			return 4856 + (((id - 4708) / 2) * 6);
		if (id == 4745 || id == 4747 || id == 4749 || id == 4751 || id == 4753 || id == 4756 || id == 4759)
			return 4952 + (((id - 4745) / 2) * 6);
		if (id == 21736 || id == 21744 || id == 21752 || id == 21760)
			return id + 2;
		//barrows degraded
		if ((id >= 4856 && id <= 4859) || (id >= 4862 && id <= 4865) || (id >= 4868 && id <= 4871) || (id >= 4874 && id <= 4877) || (id >= 4880 && id <= 4883) || (id >= 4886 && id <= 4889) || (id >= 4892 && id <= 4895) || (id >= 4898 && id <= 4901) || (id >= 4904 && id <= 4907) || (id >= 4910 && id <= 4913) || (id >= 4916 && id <= 4919) || (id >= 4922 && id <= 4925) || (id >= 4928 && id <= 4931) || (id >= 4934 && id <= 4937) || (id >= 4940 && id <= 4943) || (id >= 4946 && id <= 4949) || (id >= 4952 && id <= 4955) || (id >= 4958 && id <= 4961) || (id >= 4964 && id <= 4967) || (id >= 4970 && id <= 4973) || (id >= 4976 && id <= 4979) || (id >= 4982 && id <= 4985) || (id >= 4988 && id <= 4991) || (id >= 4994 && id <= 4997))
			return id + 1;
		//Crystal bow
		if (id == 4214 || id == 4215 || id == 4216 || id == 4217 || id == 4218 || id == 4219 || id == 4220 || id == 4221 || id == 4222)
			return id + 1;
		//Crystal shield
		if (id == 4225 || id == 4226 || id == 4227 || id == 4228 || id == 4229 || id == 4230 || id == 4231 || id == 4232 || id == 4233)
			return id + 1;
		if (id == 4223 || id == 4234)
			return 4207;
		//visor
		if (id == 22460 || id == 22472 || id == 22484)
			return 22452;
		if (id == 22464 || id == 22476 || id == 22488)
			return 22454;
		if (id == 22468 || id == 22480 || id == 22492)
			return 22456;
		if (id == 22496) //polypore staff
			return 22498; //stick
		if (id == 20173)
			return 20174;
		return -1;
	}

	// returns what it degrades into when wear(usualy first time)
	public static int getDegradeItemWhenWear(int id) {
		// Pvp armors
		if (id == 13958 || id == 13961 || id == 13964 || id == 13967 || id == 13970 || id == 13973 || id == 13908 || id == 13911 || id == 13914 || id == 13917 || id == 13920 || id == 13923 || id == 13941 || id == 13944 || id == 13947 || id == 13950 || id == 13958 || id == 13938 || id == 13926 || id == 13929 || id == 13932 || id == 13935)
			return id + 2; // When equiping it becomes Corrupted
		return -1;
	}

	// returns what it degrades into when start to combating(usualy first time)
	public static int getDegradeItemWhenCombating(int id) {
		// Nex and Pvp
		if (id == 20135 || id == 20139 || id == 20143 || id == 20147 || id == 20151 || id == 20155 || id == 20159 || id == 20163 || id == 20167 || id == 20171 || id == 13858 || id == 13861 || id == 13864 || id == 13867 || id == 13870 || id == 13873 || id == 13876 || id == 13884 || id == 13887 || id == 13890 || id == 13893 || id == 13896 || id == 13905 || id == 13902 || id == 13899)
			return id + 2;
		//polipore armors
		if (id == 22458 || id == 22462 || id == 22466 || id == 22470 || id == 22474 || id == 22478 || id == 22482 || id == 22486 || id == 22490)
			return id + 2;
		//Crystal bow new
		if (id == 4212)
			return id + 2;
		//Crystal bow shield new
		if (id == 4224)
			return id + 1;
		//polypore staff
		if (id == 22494)
			return id + 2;
		//new barrows equipment
		if (id == 4708 || id == 4710 || id == 4712 || id == 4714 || id == 4716 || id == 4718 || id == 4720 || id == 4722 || id == 4724 || id == 4726 || id == 4728 || id == 4730 || id == 4732 || id == 4734 || id == 4736 || id == 4738)
			return 4856 + (((id - 4708) / 2) * 6);
		if (id == 4745 || id == 4747 || id == 4749 || id == 4751 || id == 4753 || id == 4756 || id == 4759)
			return 4952 + (((id - 4745) / 2) * 6);
		if (id == 21736 || id == 21744 || id == 21752 || id == 21760)
			return id + 2;
		return -1;
	}

	public static boolean itemDegradesWhileHit(int id) {
		if (id == 4225 || id == 4226 || id == 4227 || id == 4228 || id == 4229 || id == 4230 || id == 4231 || id == 4232 || id == 4233 || id == 4234)
			return true;
		return false;
	}

	// removes a charge per ticket when wearing this
	public static boolean itemDegradesWhileWearing(int id) {
		//	String name = ItemDefinitions.getItemDefinitions(id).getName().toLowerCase();
		if (id >= 13908 && id <= 13990) //pvp gear corrupt
			return true;
		return false;
	}

	// removes a charge per ticket when wearing this and attacking
	public static boolean itemDegradesWhileCombating(int id) {
		// nex armors
		if (id == 20135 || id == 20137 || id == 20139 || id == 20141  || id == 20143 || id == 20145 || id == 20147 || id == 20149 || id == 20151 || id == 20153 || id == 20155 || id == 20157 || id == 20159 || id == 20161 || id == 20163 || id == 20165 || id == 20167 || id == 20169)
			return true; // 10 hour
		//polypore gear
		if (id == 22460 || id == 22464 || id == 22468 || id == 22472 || id == 22476 || id == 22480 || id == 22484 || id == 22488 || id == 22492)
			return true;
		if (id == 20173) // zaryte bow
			return true;
		if (id == 18349 || id == 18351 || id == 18353 || id == 18355 || id == 18357 || id == 18359 || id == 18361 || id == 18363 || id == 18365 || id == 18367 || id == 18369 || id == 18371 || id == 18373)
			return true;
		if (id >= 24450 && id <= 24454 // rouge gloves
				|| id >= 22358 && id <= 22369) // dominion gloves
			return true;

		if (id >= 13858 && id <= 13907) //pvp gear non corrupt
			return true;
		if (id == 4745 || id == 4747 || id == 4749 || id == 4751 || id == 4753 || id == 4756 || id == 4759 || id == 21736 || id == 21744 || id == 21752 || id == 21760 || id == 4708 || id == 4710 || id == 4712 || id == 4714 || id == 4716 || id == 4718 || id == 4720 || id == 4722 || id == 4724 || id == 4726 || id == 4728 || id == 4730 || id == 4732 || id == 4734 || id == 4736 || id == 4738)
			return true;
		//barrows degraded already
		if ((id >= 21762 && id <= 21765) || (id >= 21754 && id <= 21757) || (id >= 21746 && id <= 21749) || (id >= 21738 && id <= 21741) || (id >= 4856 && id <= 4859) || (id >= 4862 && id <= 4865) || (id >= 4868 && id <= 4871) || (id >= 4874 && id <= 4877) || (id >= 4880 && id <= 4883) || (id >= 4886 && id <= 4889) || (id >= 4892 && id <= 4895) || (id >= 4898 && id <= 4901) || (id >= 4904 && id <= 4907) || (id >= 4910 && id <= 4913) || (id >= 4916 && id <= 4919) || (id >= 4922 && id <= 4925) || (id >= 4928 && id <= 4931) || (id >= 4934 && id <= 4937) || (id >= 4940 && id <= 4943) || (id >= 4946 && id <= 4949) || (id >= 4952 && id <= 4955) || (id >= 4958 && id <= 4961) || (id >= 4964 && id <= 4967) || (id >= 4970 && id <= 4973) || (id >= 4976 && id <= 4979) || (id >= 4982 && id <= 4985) || (id >= 4988 && id <= 4991) || (id >= 4994 && id <= 4997))
			return true;
		return false;
	}

	public static boolean hasCompletionistCapeTrimmedReqs(Player player, boolean sendMessage) {
		if (player.getKillCount() < 100) {
			if (sendMessage)
				player.getPackets().sendGameMessage("You need to have killed at least 100 players to use this cape.");
			return false;
		}
		if (player.getDominionTower().getKilledBossesCount() < 100) {
			if (sendMessage)
				player.getPackets().sendGameMessage("You need to have kill at least 100 bosses in the Dominion tower to use this cape.");
			return false;
		}
		if (player.getFinishedCastleWars() < 25) {
			if (sendMessage)
				player.getPackets().sendGameMessage("You need to have finished at least 37 Castle Wars Games.");
			return false;
		}
		if (player.getFinishedStealingCreations() < 25) {
			if (sendMessage)
				player.getPackets().sendGameMessage("You need to have finished at least 25 Stealing Creation Games.");
			return false;
		}
		return true;
	}

	public static boolean canWear(Item item, Player player) {
		if (player.getRights() >= 2)
			return true;
		if (!item.getDefinitions().isWearItem())
			return false;
		else if (item.getId() == 20767) {
			/*  if(Settings.SPAWN_WORLD && player.getKillCount() > 750)
			return true;
			  else if (Settings.SPAWN_WORLD) {
			player.getPackets().sendGameMessage("You need to have killed at least 750 players to use this item.");
			return false;
			  } */
			for (int skill = 0; skill < 25; skill++) {
				if (player.getSkills().getLevelForXp(skill) < 99) {
					player.getPackets().sendGameMessage("You must have the maximum level of each skill in order to use this cape.");
					return false;
				}
			}
		} else if ((item.getId() == 20769 || item.getId() == 20771)) {
			/* if(Settings.SPAWN_WORLD && player.getKillCount() > (item.getId() == 20771 ? 2000 : 1500))
			return true;
			 else if (Settings.SPAWN_WORLD) {
			player.getPackets().sendGameMessage("You need to have killed at least " + (item.getId() == 20771 ? 2000 : 1500) + " players to use this item.");
			return false;
			 } */
			for (int skill = 0; skill < 25; skill++) {
				if (player.getSkills().getLevelForXp(skill) < (skill == Skills.DUNGEONEERING ? 120 : 99)) {
					player.getPackets().sendGameMessage("You must have the maximum level of each skill in order to use this cape.");
					return false;
				}
			}
			if (player.getLastBork() == 0) {
				player.getPackets().sendGameMessage("You need to have killed bork to wear this cape.");
				return false;
			}
			if (!player.isFoundShootingStar() || player.getLastStarSprite() == 0) {
				player.getPackets().sendGameMessage("You need to find and mine a shooting star to wear this cape.");
				return false;
			}
			if (!player.isKilledWildyWyrm()) {
				player.getPackets().sendGameMessage("You need to have killed at least one wildy wyrm to wear this cape.");
				return false;
			}
			if (player.getKillCount() < 50) {
				player.getPackets().sendGameMessage("You need to have killed at least 50 players to use this cape.");
				return false;
			}
			if (!player.isCompletedStealingCreation()) {
				player.getPackets().sendGameMessage("You need to complete at least once stealing creation minigame to use this cape.");
				return false;
			}
			if (!player.isCapturedCastleWarsFlag()) {
				player.getPackets().sendGameMessage("You need to capture Castle Wars Flag at least once to use this cape.");
				return false;
			}
			if (!player.isCompletedFightKiln()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight kiln minigame to use this cape.");
				return false;
			}
			if (!player.isWonFightPits()) {
				player.getPackets().sendGameMessage("You need to win at least once fight pits minigame to use this cape.");
				return false;
			}
			if (!player.isKilledQueenBlackDragon()) {
				player.getPackets().sendGameMessage("You need to have killed the Queen Black Dragon atleast once to use this cape.");
				return false;
			}
			if (!player.getQuestManager().completedQuest(Quests.NOMADS_REQUIEM)) {
				player.getPackets().sendGameMessage("You need to have completed Nomad's Requiem miniquest to use this cape.");
				return false;
			}
			if (item.getId() == 20771 && !hasCompletionistCapeTrimmedReqs(player, true))
				item.setId(20769);
			else if (item.getId() == 20769 && hasCompletionistCapeTrimmedReqs(player, false))
				item.setId(20771);
		} else if (item.getId() == 6570 || item.getId() == 10566 || item.getId() == 10637) {
			/*if(Settings.SPAWN_WORLD && player.getKillCount() > 500)
			return true;
			else if (Settings.SPAWN_WORLD) {
			player.getPackets().sendGameMessage("You need to have killed at least 500 players to use this item.");
			return false;
			}*/
			if (!player.isCompletedFightCaves()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight cave minigame to use this cape.");
				return false;
			}
		} else if (item.getId() >= 7455 && item.getId() <= 7462) {
			if (!Settings.SPAWN_WORLD) {
				if (!player.getQuestManager().completedQuest(Quests.RECIPE_FOR_DISASTER)) {
					player.getPackets().sendGameMessage("You need to have the skill requirements of Recipe For Disaster in order to equip these gloves.");
					return false;
				}
			}
			return true;
		} else if (item.getId() == 23659) {
			/* if(Settings.SPAWN_WORLD && player.getKillCount() > 1000)
			return true;
			else if (Settings.SPAWN_WORLD) {
			player.getPackets().sendGameMessage("You need to have killed at least 1000 players to use this cape.");
			return false;
			} */
			if (!player.isCompletedFightKiln()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight kiln minigame to use this cape.");
				return false;
			}
		} else if (item.getId() == 8856) {
			if (!WarriorsGuild.inCatapultArea(player)) {
				player.getPackets().sendGameMessage("You may not equip this shield outside of the catapult room in the Warrior's Guild.");
				return false;
			}
		} else if (item.getId() == 19784) {
			if (!player.getQuestManager().completedQuest(Quests.VOID_STARES_BACK)) {
				player.getPackets().sendGameMessage("You must have completed the void stares back in order to equip a korasi.");
				return false;
			}
		} else if (Slayer.isSlayerHelmet(item)) {
			if (!Settings.SPAWN_WORLD) {
				if (!player.getSlayerManager().hasLearnedSlayerHelmet()) {
					player.getPackets().sendGameMessage("You must learn how to make a helmet before equipping one!");
					return false;
				}
			}
			return true;
		} else if (item.getId() == 15433 || item.getId() == 15435 || item.getId() == 15432 || item.getId() == 15434) {
			if (Settings.SPAWN_WORLD && player.getKillCount() > 250)
				return true;
			else if (Settings.SPAWN_WORLD) {
				player.getPackets().sendGameMessage("You need to have killed at least 250 players to use this item.");
				return false;
			}
			if (!player.getQuestManager().completedQuest(Quests.NOMADS_REQUIEM)) {
				player.getPackets().sendGameMessage("You need to have completed Nomad's Requiem miniquest to use this cape.");
				return false;
			}
		}
		return Commands.canWearItem(player, item.getId());
	}

	public static boolean isDestroy(Item item) {
		return item.getDefinitions().isDestroyItem() || item.getDefinitions().isLended();
	}

	public static boolean isTradeable(Item item) {
		for (int i = 0; i < Settings.TRADEABLE_EXCEPTION.length; i++)
			if (item.getId() == Settings.TRADEABLE_EXCEPTION[i])
				return true;
		if (item.getDefinitions().isDestroyItem() || item.getDefinitions().isLended())
			return false;
		int charges = ItemConstants.getItemDefaultCharges(item.getId());
		if (charges != -1 && charges != 0)
			return false;
		for (int id : TreasureTrailsManager.CLUE_SCROLLS)
			if (item.getId() == id)
				return false;
		for (int id : TreasureTrailsManager.SCROLL_BOXES)
			if (item.getId() == id)
				return false;
		for (int id : TreasureTrailsManager.PUZZLES)
			if (item.getId() == id)
				return false;
		for (int id : AccessorySmithing.POST_IMBUED_RINGS)
			if (item.getId() == id)
				return false;
		if (Slayer.isSlayerHelmet(item))
			return false;
		//1st dung update
		if (item.getId() >= 18330 && item.getId() <= 18374)
			return false;
		//2nd dung update, warped
		if (item.getId() >= 19669 && item.getId() <= 19675)
			return false;
		//3rd dung update, warped
		if (item.getId() >= 19886 && item.getId() <= 19895)
			return false;
		if (OrnamentKits.getKit(item) != null)
			return false;

		switch (item.getId()) {
		case Settings.VOTE_TOKENS_ITEM_ID:
		case 13650:// <--- old vote tokens.
		case 19467: //biscuits
			//prayer books
		case 3839:
		case 3840:
		case 3841:
		case 3842:
		case 3843:
		case 3844:
		case 19612:
		case 19613:
		case 19614:
		case 19615:
		case 19616:
		case 19617:
			// void
		case 8839:
		case 8840:
		case 8841:
		case 8842:
		case 10611:
		case 11663:
		case 11664:
		case 11665:
		case 11674:
		case 11675:
		case 11676:
		case 19711:
		case 19712:
			//vinewhip
		case 21371:
		case 21372:
		case 21373:
		case 21374:
		case 21375:
		case 2677:
		case 2801:
		case 2722:
		case 19043:
		case 23193:
		case 23194:
		case 20763: //veteran cape
		case 20767: //max cape and hood
		case 20768:
		case 10844: //sq'irk
		case 10845:
		case 10846:
		case 10847:
		case 10848:
		case 10849:
		case 10850:
		case 10581:
		case 23044: //mindspike
		case 23045:
		case 23046:
		case 23047:
		case 35: // excalibur
		case 22496: //polypore degraded gear
		case 22492:
		case 22488:
		case 22484:
		case 22480:
		case 22476:
		case 22472:
		case 22468:
		case 22464:
		case 22460:
		case 11283: //dragonfire shield
		case 24444: //neem drupe stuff
		case 24445:
		case 10588: // Salve amulet (e)
		case 772: // dramen staff
		case 6570: // firecape
		case 6529: // tokkul
		case 7462: // barrow gloves
		case 23659: // tookhaar-kal
		case 19784: // korasi
		case 24455:// crucible weapons
		case 24456:
		case 24457:
		case 15433:// red and blue cape from nomad
		case 15435:
		case 15432:
		case 15434:
		case 12158:
		case 12159:
		case 12160:
		case 12163:
			// bird nests with search
		case 5070:
		case 5071:
		case 5072:
		case 5073:
		case 5074:
		case 7413:
		case 11966:
			// stealing creation capes
		case 14387:
		case 14389:
		case 20072: // defenders
		case 8844:
		case 8845:
		case 8846:
		case 8847:
		case 8848:
		case 8849:
		case 8850:
			return false;
		default:
			return true;
		}
	}

	private static final int[][] REPAIR =
		{
		{ 20135, 500000, 20000 },//nex helm
		{ 20159, 500000, 20000 },//virtus helm
		{ 20147, 500000, 20000 },//pernix helm
		{ 20139, 2000000, 65000 },//torva platebody
		{ 20163, 2000000, 65000 },//virtus body
		{ 20151, 2000000, 65000 },//pernix body
		{ 20143, 1000000, 40000 },//torva legs
		{ 20167, 1000000, 40000 },//virtus legs
		{ 20155, 1000000, 40000 },//pernix legs
		{ 20171, 2000000, 65000 },//Zaryte bow
		//barrows helms
		{ 4708, 60000, 3000 },
		{ 4716, 60000, 3000 },
		{ 4724, 60000, 3000 },
		{ 4732, 60000, 3000 },
		{ 4745, 60000, 3000 },
		{ 4753, 60000, 3000 },
		{ 21736, 60000, 3000 },
		//barrows weapons
		{ 4710, 100000, 15000 },
		{ 4718, 100000, 15000 },
		{ 4726, 100000, 15000 },
		{ 4734, 100000, 15000 },
		{ 4747, 100000, 15000 },
		{ 4755, 100000, 15000 },
		{ 21744, 100000, 15000 },
		//barrows body
		{ 4712, 90000, 10000 },
		{ 4720, 90000, 10000},
		{ 4728, 90000, 10000 },
		{ 4736, 90000, 10000 },
		{ 4749, 90000, 10000 },
		{ 4757, 90000, 10000 },
		{ 21752, 90000, 10000 },
		//barrows legs
		{ 4714, 80000, 7000 },
		{ 4722, 80000, 7000 },
		{ 4730, 80000, 7000 },
		{ 4738, 80000, 7000 },
		{ 4751, 80000, 7000 },
		{ 4759, 80000, 7000 },
		{ 21762, 80000, 7000 },
		//Chaotic weapons
		{ 18349, 10000000, 50000 },
		{ 18351, 10000000, 50000 },
		{ 18353, 10000000, 50000 },
		{ 18355, 10000000, 50000 },
		{ 18357, 10000000, 50000 },
		{ 18359, 10000000, 50000 },
		{ 18361, 10000000, 50000 },
		{ 18363, 10000000, 50000 },
		//Gravite
		{ 18365, 5000000, 25000 },
		{ 18367, 5000000, 25000 },
		{ 18369, 5000000, 25000 },
		{ 18371, 5000000, 25000 },
		{ 18373, 5000000, 25000 }, };

	private static final int ITEMS_RANGE = 500;

	public static boolean repairItem(Player player, int slot, boolean dungeoneering) {
		Item item = player.getInventory().getItem(slot);
		int[] prices = getRepairIdx(item.getId());
		if (prices == null && !isRepairable(item.getName()))
			return false;
		String itemName = item.getName().toLowerCase().replace(" (broken)", "").replace(" (damaged)", "").replace(" 0", "").replace(" 25", "").replace(" 50", "").replace(" 75", "").replace(" 100", "");
		for (int nextId = item.getId() - ITEMS_RANGE; nextId < item.getId() + ITEMS_RANGE; nextId++) {
			ItemDefinitions def = ItemDefinitions.getItemDefinitions(nextId);
			if (def == null || !def.getName().toLowerCase().contains(itemName))
				continue;
			prices = getRepairIdx(nextId);
			if (prices == null)
				return false;
			String indexName = item.getName().toLowerCase().replace(itemName, "").replace(" (", "").replace(")", "").replace(" ", "");
			if (indexName.equals("")) {
				int charges = player.getCharges().getCharges(item.getId());
				if (charges == 0) {
					player.getPackets().sendGameMessage("The item doesn't have a dent in it.");
					return true;
				}
				double percentage = (double) charges / ItemConstants.getItemDefaultCharges(item.getId());
				percentage = 1.0 - percentage;
				if (charges == 0)
					percentage = 1.0;
				prices[0] *= percentage;
			} else if (!indexName.equals("") && !indexName.equals("broken") && !itemName.equals("damaged"))
				prices[0] *= (1 - (Integer.parseInt(indexName) * .01));
			player.getDialogueManager().startDialogue("RepairD", slot, prices, nextId, dungeoneering);
			return true;
		}
		return false;
	}

	private static int[] getRepairIdx(int nextId) {
		for (int[] ids : REPAIR) {
			if (nextId == ids[0]) {
				if (ids.length == 3)
					return new int[] { ids[1], ids[2] };
				else
					return new int[] { ids[1] };
			}
		}
		return null;
	}

	private static boolean isRepairable(String itemName) {
		return itemName.endsWith(" (broken)") || itemName.endsWith(" (damaged)") || itemName.endsWith(" 0") || itemName.endsWith(" 25") || itemName.endsWith(" 50") || itemName.endsWith(" 75") || itemName.endsWith(" 100");
	}
}
