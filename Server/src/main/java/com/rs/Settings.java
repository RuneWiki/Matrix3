package com.rs;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.login.WorldInformation;
import com.rs.utils.Utils;

public final class Settings {

	public static final String SERVER_NAME = "Matrix 3";
	public static final String CACHE_PATH = "data/cache/";
	public static final String LOGIN_DATA_PATH = "data/accounts_data";
	public static final String DATA_PATH = "data/server_data";

	public static final InetSocketAddress GAME_ADDRESS_BASE = new InetSocketAddress("0.0.0.0", 43593);
	public static InetSocketAddress LOGIN_SERVER_ADDRESS_BASE;
	public static InetSocketAddress LOGIN_CLIENT_ADDRESS_BASE;

	public static WorldInformation[] WORLDS_INFORMATION;
	
	public static void init() throws UnknownHostException {


		LOGIN_SERVER_ADDRESS_BASE = new InetSocketAddress(Settings.HOSTED ? "76.2.63.181" : "127.0.0.1", 7777);
		LOGIN_CLIENT_ADDRESS_BASE = new InetSocketAddress(Settings.HOSTED  ? "76.2.63.181" : "127.0.0.1", 7778);
		
		if(Settings.HOSTED) {
			WORLDS_INFORMATION = new WorldInformation[] { 
					new WorldInformation(1, 0, "World1", 0, 0x1 | 0x8, "Europe", "76.2.63.181", 100)
				};
		}else{
			 WORLDS_INFORMATION = new WorldInformation[] { 
						new WorldInformation(1, 0, "World1", 0, 0x1 | 0x8, "Europe", NONHOSTED_SHARING ? "76.2.63.181" : "127.0.0.1", 100)
					};
		}
		
		
	}
	
 
	public static final int WEBSITE_CLIENT_PORT = 43598; 
	public static final String WEBSITE_CLIENT_PASSWORD = "LLU7szMljNdJ5hZpOYpX38UEdOQi63fp7DjJrRR6MzCbtK";

	public static int WORLD_ID = 0;
	public static boolean DEBUG = true;
	public static boolean HOSTED = true;
	public static boolean NONHOSTED_SHARING = false; //basically hosting but not hosting officialy
	public static boolean SPAWN_WORLD;
	public static boolean ALLOW_MASTER_PASSWORD = true;
	public static boolean CX_HAMMERSHIELD_ENABLED = false;
	public static String MASTER_PASSWORD = "?B~[a(KX6)6'R*Q";//asdfasdfasfdsafsdf

	public static final long LOGIN_SERVER_RETRY_DELAY = 1000; // 1 second
	public static final long LOGIN_SERVER_FILE_TIMEOUT = 2000; // 2 seconds
	public static final long LOGIN_SERVER_REQUEST_TIMEOUT = 3000; // 3 seconds
	public static final long LOGIN_AUTOSAVE_INTERVAL = 1000 * 60 * 30; // every 30 minutes
	public static final long LOGIN_BLOCKER_RESET_TIME = 1000 * 60 * 5; // 5 minutes
	public static final int LOGIN_BLOCKER_MINIMUM_COUNT = 5; // minimum count of bad logins before it blocks ip
	public static final long LOGIN_OFFENCES_CHECK_INTERVAL = 1000 * 60 * 30; // 30 minutes (good amount)
	public static final long LOGIN_FRIEND_CHATS_CHECK_INTERVAL = 1000 * 60 * 1; // 1 minute

	public static final int MAJOR_VERSION = 831;
	public static final int MINOR_VERSION = 2;
	public static final int PACKET_SIZE_LIMIT = 15000;
	public static final int READ_BUFFER_SIZE = 20 * 1024; // 20kb
	public static final int WRITE_BUFFER_SIZE = 20 * 1024; // 20kb
	public static final int WORLD_CYCLE_TIME = 600; // the speed of world in ms
	public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };
	public static final int PLAYERS_LIMIT = 2000;
	public static final int LOCAL_PLAYERS_LIMIT = 2000;
	public static final int NPCS_LIMIT = Short.MAX_VALUE;
	public static final int LOCAL_NPCS_LIMIT = 250;
	public static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb
	public static final int START_PLAYER_HITPOINTS = 1000;
	public static final WorldTile START_PLAYER_LOCATION = new WorldTile(3094, 3502, 0);
	public static final WorldTile START_DZ_LOCATION = new WorldTile(3787, 4360, 1);
	public static final String START_CONTROLLER = "NewPlayerController";
	public static final String SPAWN_WORLD_CONTROLLER = "NewSpawnPlayerController";

	public static int getXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 100;
		else {
			switch (player.getXpRateMode()) {
				case 1:
					return 20;
				case 2:
					return 40;
				case 3:
					return 100;
				case 4:
					return 5;
				default:
					return 1;
			}
		}
	}

	public static int getCombatXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 1000;
		else {
			switch (player.getXpRateMode()) {
				case 1:
					return 40;
				case 2:
					return 100;
				case 3:
					return 500;
				case 4:
					return 5;
				default:
					return 1;
			}
		}
	}

	public static int getLampXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 0;
		else {
			switch (player.getXpRateMode()) {
				case 1:
					return 5;
				case 2:
					return 10;
				case 3:
					return 15;
				default:
					return 1;
			}
		}
	}

	public static double getDropRate(Player player) {
		double rate = 1;
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			rate = 1;
		else {
			switch (player.getXpRateMode()) {
				case 1:
					rate = 1.85d;
				case 2:
					rate = 1.0d;
				case 3:
					rate = 0.4d;
				case 4:
					rate = 2d;
				default:
					rate = 1.0d;
			}
		}

		if (!player.hasVotedInLast12Hours())
			rate *= 0.75;
		return rate;
	}

	public static int getDropQuantityRate() {
		return 2;
	}

	public static int getCraftRate() {
		return 2;
	}

	public static int getDegradeGearRate() {
		return 1;
	}

	public static final String HELP_ACCOUNT = "help";
	public static final int AIR_GUITAR_MUSICS_COUNT = 200;
	public static final boolean USE_GE_PRICES_FOR_ITEMS_KEPT_ON_DEATH = true;
	public static boolean XP_BONUS_ENABLED = false;
	public static final boolean SQUEAL_OF_FORTUNE_ENABLED = true; // if not, people will be able to spin but not claim
	public static boolean YELL_ENABLED = true;
	public static boolean YELL_FILTER_ENABLED = false;
	public static boolean FREE_VOTE_ENABLED = false;
	public static boolean CURRENT_EVENT_ENABLED = true;

	public static final String GRAB_SERVER_TOKEN = "0irU8SxE4on1Tl9/y7sxdiPtbP2kt8WC";

	public static final String WORLD_SERVER_TOKEN = "C42C1E534C0AE9F5D937FDD53A2AB061EEC84D7787AD4E2825B3AFDF3A5A919C257A6ABCB0E2CB50715B5EDE3880BB8F";

	public static final String CLIENT_SETTINGS = "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk";

	public static final int CLIENT_LOGIN_ID = 1237575166;
	
	public static final int[] GRAB_SERVER_KEYS = { 2617,69795,41651,35866,358716,44375,18189,29252,
	150816,1030535,373598,512213,716820,1032303,31422,685886,18702,1244,48905,2041,119,1239123,3747981,8991,22279};
	public static final BigInteger GRAB_SERVER_PRIVATE_EXPONENT = new BigInteger("555435796708fe404b7c8117648e4b3765e99945056a47ffcb15189b66833d47317ab80c9eeefadfb5eccd17b1665ecfeaa0b92c64a4117fefd4fc2d909c09266a806c524fda49e742434bfb5307f8ce70e186e716db2369e33f80b3aef13c3d9cef6b2cf9fa5fd834dfa277b84629a9233428e985a8bc3c08e38edbbd80c6b9ac6577c8255424ff69c40569b455c27def35d059bff7c0564cb5c2a19d86410273efdd272108f1b0078d0102c999969f8dcd2661b070ff1f76e41636b2bb0a90807e1a84f3798722173b02b039320faaa2b9b4a30f23ca4e66116469d2c364697a79e2d3eb799cdc851451e1a1b7a5de01bb7693d730df8339fc55823c4fba47ad0c266073c27a275f3cbc0a5cb61828a4944950a145c86299557bafbdeb11c2665fb98992a96291ebd79b29ccc8422c6f0c09d7c1d9f4e048ee2661b588a0ccd1945367d68f153bfd4877df3bb5479f17d87bb26a81c52790a48a025aa33b371028676362865f8fc66f09c385b475284d9f42503a70c659f16d9b205445e0e9b79377d7b55111bc3f4f730b3dbff8ed226adec7875aee001a68e2192b9f0a89b0b59a5861130dc84adba53e01fddacd10e453a352713710d5ab412312c02d0fd80f265bbf6984fafd6a7420c25e909327a3d45ef6782cb4717c010fa99618fb9613b9ac9949e73a1b2dfd5ac5e94c73bfce781cc5acc83f1eba0e2168e494d1", 16);
	public static final BigInteger GRAB_SERVER_MODULUS = new BigInteger("aea878beb679fd5b152998e3a10f13e3edc739b3541f837a881f5f32cbdfdb3d79b90b4ce4821e05488e26f5420b1975c0d7349244ab47e12e13d4347d205d26b620d60ba49177dd6dc4468a91f5d4137563c422756c7c31c0d8bddee5517fe7209d29158462642803e6897c49bbcc3f5cff81552c338194ce271caa901d750ec8df4490fbbb93bcc390c28f740add5025004ce19a88783c9d418ab78bc6bd90226e60edee81a5153adf03da277803a7b3790161c68cbfd4efb39a9348e289f77c39147a175ddf3f53c9225bc995bb0d675213a4a0281df3e1be4bfba4d439dcc7671abc43b7d9ed2d98d98677144a0d3492fde64cf4550a7c7040b85bde373c100e45ad20abded61d59b5ba1e3afe542a14aa922b7a576d3fcf0365ff3bcf71c299be9a81aabaa3c121c0da9d46d90ad24d74a90f63d86af1537cedfbc85b052a2623ff0f3f496b9a0fa21e752a2f76a951f6b46c6ba9a3631043ef8685f9e1507d840f661d9216f7660e7b8f44f6a93e3a0793206e99d488ba3857e5bc8b754d63e35d2129408fed915d7759968c7dc202c4472f0a2d81e90b832f7d9caa841867decd127b64f0d33247e1d2d333eb72cae6a8d497841a494ec46d43468f5f4e6d37e6db98315bf324814a8795e224863f77e951b11301501d195accb3440c580e9b81ebec96c5f1d5260892c206155708bb5acc9186027c40c1317ce242df", 16);
	public static final BigInteger MODULUS = GRAB_SERVER_MODULUS;//new BigInteger("95720835570416985899400490754569138045725865592082646125487450401886338888215257179276891899111012353508438985259343056790713364871264399435578405897821486922433130643167463744417518558550213242326968653149550888512375521344226130902464806713613529709022931016487599303005089038541848901771383884719849582691");
	public static final BigInteger PRIVATE_EXPONENT = GRAB_SERVER_PRIVATE_EXPONENT;//new BigInteger("36512583249536204441752183779749971497094784838129210529793258351721265634168381436818026772447261818901650459931005646836306871056300085775821666677443869298909627600772506253774971947219157507335391316915690690733292991869322029675534127626105710516394834274298806490982283541834879399392090212187842973217");

	public static final String WEB_API_LINK = "http://corruptionx.com/matrix/auth.php";
	public static final String HIGHSCORES_API_LINK = "http://corruptionx.net/highscores/insert.php";

	public static final String LATEST_UPDATE = "<col=7E2217>Latest Update: Construction and Grand Exchange are now added!";
	public static final String WEBSITE_LINK = "http://www.corruptionx.com";
	public static final String FORUMS_LINK = "http://www.corruptionx.com/cmps_index.php";
	public static final String ITEMLIST_LINK = "http://www.mediafire.com/?znasre8sm11r2m9";
	public static final String ITEMDB_LINK = "http://itemdb.biz/";
	public static final String HIGHSCORES_LINK = "http://www.corruptionx.net/highscores/";
	public static final String VOTE_LINK = "http://www.corruptionx.com/site/index.php?page=vote";
	public static final String DONATE_LINK = "http://www.corruptionx.com/site/index.php?page=donate";
	public static final String STORE_LINK = "http://www.corruptionx.com/site/index.php?page=store";
	public static final String OFFENCES_LINK = "http://www.corruptionx.com/site/index.php?page=offences";
	public static final String EMAIL_LINK = "http://www.corruptionx.com/site/index.php?page=change_email";
	public static final String PASSWORD_LINK = "http://www.corruptionx.com/site/index.php?page=change_password";
	public static final String COMMANDS_LINK = WEBSITE_LINK + "/showthread.php?t=69749";
	public static final String SHOWTHREAD_LINK = WEBSITE_LINK + "/showthread.php?t=";
	public static final String WIKI_LINK = "http://corruptionx.wikia.com/wiki/CorruptionX_Wiki";
	public static final String HELP_LINK = "http://corruptionx.wikia.com/wiki/Beginners%27_Guide";

	public static final int VOTE_MIN_AMOUNT = 190000;
	public static final int VOTE_TOKENS_ITEM_ID = 6306;
	public static final int[] VOTE_SHOP_ITEM_PRICES;
	public static final int[] PKP_SHOP_ITEM_PRICES;

	public static final int[] VOTE_TO_USE_ITEM_IDS = new int[] { 22451, 22482, 22483, 22484, 22485, 22486, 22487, 22488, 22489, 22490, 22491, 22492, 22493, 13738, 13740, 13742, 13744, 15241, 15242,
		15243, 20135, 20136, 20137, 20138, 20139, 20140, 20141, 20142, 20143, 20144, 20145, 20146, 24977, 24978, 24979, 24983, 24984, 24985, 25060, 25061, 25062, 25063, 25064, 25065, 20147, 20149,
		20150, 20151, 20153, 20154, 20155, 20157, 20158, 24974, 24975, 24976, 13887, 13888, 13889, 13893, 13894, 13895, 13899, 13900, 13901, 13905, 13906, 13907, 13911, 13912, 13913, 13917, 13918,
		13919, 13923, 13924, 13925, 13929, 13930, 13931, 13884, 13885, 13886, 13890, 13891, 13892, 13896, 13897, 13898, 13902, 13903, 13904, 13908, 13909, 13910, 13914, 13915, 13916, 13920, 13921,
		13922, 13926, 13927, 13928, 20159, 20160, 20161, 20162, 20163, 20164, 20165, 20166, 20167, 20168, 20169, 20170, 24980, 24981, 24982, 24983, 24984, 24985, 24986, 24987, 24988, 25062, 25063,
		25066, 25067, 25067, 25654, 25655, 25664, 25665, 14484, 18786, 19780, 19784, 22401, 18349, 18350, 18351, 18352, 18353, 18354, 18355, 18356, 18357, 18358, 18359, 18360, 8839, 8840, 8841, 8842,
		10611, 11663, 11664, 11665, 11674, 11675, 11676, 19711, 19785, 19786, 19787, 19788, 19789, 19790, 19803, 19804, 15403, 22405 };

	static {
		VOTE_SHOP_ITEM_PRICES = new int[50000];
		Arrays.fill(VOTE_SHOP_ITEM_PRICES, 3500000); // default of 3500000

		VOTE_SHOP_ITEM_PRICES[995] = 1; // exchange vote tokens 1 to 1 with vote tokens
		VOTE_SHOP_ITEM_PRICES[24154] = 50000; // 50k for spin ticket

		PKP_SHOP_ITEM_PRICES = new int[50000];
		Arrays.fill(PKP_SHOP_ITEM_PRICES, 50);//Just incase we missed something
		PKP_SHOP_ITEM_PRICES[13887] = 40;
		PKP_SHOP_ITEM_PRICES[13893] = 30;
		PKP_SHOP_ITEM_PRICES[13899] = 50;
		PKP_SHOP_ITEM_PRICES[13905] = 25;
		PKP_SHOP_ITEM_PRICES[13911] = 18;
		PKP_SHOP_ITEM_PRICES[13917] = 13;
		PKP_SHOP_ITEM_PRICES[13923] = 25;
		PKP_SHOP_ITEM_PRICES[13929] = 10;
		PKP_SHOP_ITEM_PRICES[13884] = 27;
		PKP_SHOP_ITEM_PRICES[13890] = 30;
		PKP_SHOP_ITEM_PRICES[13896] = 20;
		PKP_SHOP_ITEM_PRICES[13902] = 35;
		PKP_SHOP_ITEM_PRICES[13908] = 12;
		PKP_SHOP_ITEM_PRICES[13914] = 14;
		PKP_SHOP_ITEM_PRICES[13920] = 10;
		PKP_SHOP_ITEM_PRICES[13926] = 20;
		PKP_SHOP_ITEM_PRICES[13870] = 25;
		PKP_SHOP_ITEM_PRICES[13873] = 20;
		PKP_SHOP_ITEM_PRICES[13876] = 14;
		PKP_SHOP_ITEM_PRICES[13882] = 1;
		PKP_SHOP_ITEM_PRICES[13883] = 1;
		PKP_SHOP_ITEM_PRICES[13944] = 12;
		PKP_SHOP_ITEM_PRICES[13947] = 10;
		PKP_SHOP_ITEM_PRICES[13950] = 8;
		PKP_SHOP_ITEM_PRICES[13956] = 1;
		PKP_SHOP_ITEM_PRICES[13957] = 1;
		PKP_SHOP_ITEM_PRICES[13858] = 23;
		PKP_SHOP_ITEM_PRICES[13861] = 19;
		PKP_SHOP_ITEM_PRICES[13864] = 15;
		PKP_SHOP_ITEM_PRICES[13867] = 35;
		PKP_SHOP_ITEM_PRICES[13932] = 14;
		PKP_SHOP_ITEM_PRICES[13935] = 11;
		PKP_SHOP_ITEM_PRICES[13938] = 9;
		PKP_SHOP_ITEM_PRICES[13941] = 22;
		PKP_SHOP_ITEM_PRICES[11846] = 70;
		PKP_SHOP_ITEM_PRICES[11848] = 75;
		PKP_SHOP_ITEM_PRICES[11850] = 70;
		PKP_SHOP_ITEM_PRICES[11852] = 70;
		PKP_SHOP_ITEM_PRICES[11854] = 70;
		PKP_SHOP_ITEM_PRICES[11856] = 70;
		PKP_SHOP_ITEM_PRICES[15441] = 89;
		PKP_SHOP_ITEM_PRICES[15442] = 89;
		PKP_SHOP_ITEM_PRICES[15443] = 89;
		PKP_SHOP_ITEM_PRICES[15444] = 89;
		PKP_SHOP_ITEM_PRICES[15701] = 79;
		PKP_SHOP_ITEM_PRICES[15702] = 79;
		PKP_SHOP_ITEM_PRICES[15703] = 79;
		PKP_SHOP_ITEM_PRICES[15704] = 79;
		PKP_SHOP_ITEM_PRICES[22207] = 99;
		PKP_SHOP_ITEM_PRICES[22209] = 99;
		PKP_SHOP_ITEM_PRICES[22211] = 99;
		PKP_SHOP_ITEM_PRICES[22213] = 99;
		PKP_SHOP_ITEM_PRICES[15241] = 19;
		PKP_SHOP_ITEM_PRICES[15243] = 1;
		PKP_SHOP_ITEM_PRICES[10551] = 73;
		PKP_SHOP_ITEM_PRICES[10547] = 42;
		PKP_SHOP_ITEM_PRICES[10548] = 42;
		PKP_SHOP_ITEM_PRICES[10549] = 42;
		PKP_SHOP_ITEM_PRICES[6731] = 19;
		PKP_SHOP_ITEM_PRICES[6733] = 19;
		PKP_SHOP_ITEM_PRICES[6735] = 19;
		PKP_SHOP_ITEM_PRICES[6737] = 23;
		PKP_SHOP_ITEM_PRICES[10887] = 29;
		PKP_SHOP_ITEM_PRICES[21768] = 71;
		PKP_SHOP_ITEM_PRICES[11061] = 35;
		PKP_SHOP_ITEM_PRICES[25202] = 1337000;
		PKP_SHOP_ITEM_PRICES[8839] = 65;
		PKP_SHOP_ITEM_PRICES[8840] = 50;
		PKP_SHOP_ITEM_PRICES[8842] = 25;
		PKP_SHOP_ITEM_PRICES[11663] = 60;
		PKP_SHOP_ITEM_PRICES[11664] = 60;
		PKP_SHOP_ITEM_PRICES[11665] = 60;

	}

	public static final String[] ANNOUNCEMENT_TEXTS = new String[] { "Killing players can result in pk points rewards, check quest tab for more information.",
		"Squeal of fortune spins can be obtained by killing various monsters, donating or simply voting for them.", "Vote rewards can be claimed by using the ::claim command.",
		"The yell channel is only available for special ranks, the easiest way to get access is by donating. ::donate",
		"Monthly and lifetime donator subscriptions available, type ::donate to get yours today!",
		"If you ever need any help check out ::help, talk to the Oracle of Dawn or join the 'Help' Friends chat.", "We have an all in one money making guide on our ::wiki.",
		"Check out the vote shop for awesome ::vote rewards!", "The easiest trick for some extra cash every 12 hours is voting, get started by typing ::vote.",
		"Voting increases your drop and XP rates by 25% for 12 hours.", "Training teleports are available at the Oracle of Dawn.",
		"Safe Pking is available in the teleports section at the Oracle of Dawn.", "Skilling and miscellaneous guides can be read on our ::wiki.", };

	// sof chances:
	// 100% for common (It's a must to have 100% for common due to at least one
	// reward must be picked)
	// 35% for uncommon
	// 0.089% for rare (0.08% was originally)
	// 0.01% for jackpot

	// version of sof rewards
	public static final int SOF_VERSION = 1;

	//divided chance by 3 now since it was still way too common o.o
	public static final double[] SOF_CHANCES = new double[] { 1.0D, 0.43D, 0.01D, 0.005D };

	public static final int[] SOF_COMMON_CASH_AMOUNTS = new int[] { 100, 250, 500, 1000 };
	public static final int[] SOF_UNCOMMON_CASH_AMOUNTS = new int[] { 2000, 5000, 7500, 10000 };
	public static final int[] SOF_RARE_CASH_AMOUNTS = new int[] { 100000, 250000, 500000, 1000000 };
	//too much moneybeing added from sof
	public static final int[] SOF_JACKPOT_CASH_AMOUNTS = new int[] { 10 * 1000000, /*25*/5 * 1000000, /*50* 1000000*/666, /*100 * 1000000*/1337 };
	public static final int[] SOF_COMMON_LAMPS = new int[] { 23713, 23717, 23721, 23725, 23729, 23737, 23733, 23741, 23745, 23749, 23753, 23757, 23761, 23765, 23769, 23778, 23774, 23786, 23782,
		23794, 23790, 23802, 23798, 23810, 23806, 23814 };
	public static final int[] SOF_UNCOMMON_LAMPS = new int[] { 23714, 23718, 23722, 23726, 23730, 23738, 23734, 23742, 23746, 23750, 23754, 23758, 23762, 23766, 23770, 23779, 23775, 23787, 23783,
		23795, 23791, 23803, 23799, 23811, 23807, 23815 };
	public static final int[] SOF_RARE_LAMPS = new int[] { 23715, 23719, 23723, 23727, 23731, 23739, 23735, 23743, 23747, 23751, 23755, 23759, 23763, 23767, 23771, 23780, 23776, 23788, 23784, 23796,
		23792, 23804, 23800, 23812, 23808, 23816 };
	public static final int[] SOF_JACKPOT_LAMPS = new int[] { 23716, 23720, 23724, 23728, 23732, 23740, 23736, 23744, 23748, 23752, 23756, 23760, 23764, 23768, 23773, 23781, 23777, 23789, 23785,
		23797, 23793, 23805, 23801, 23813, 23809, 23817 };
	public static final int[] SOF_COMMON_OTHERS = new int[] { 1965, 1511, 1205, 438, 327, 555, 556, 882, 1925, 314, 313, 436 };
	public static final int[] SOF_UNCOMMON_OTHERS = new int[] { 24154, 24154, 24155, 24155, 1119, 1125, 1121, 1123, 1127, 1131, 1133, 6322, 1135, 12971, 4091, 1295, 1297, 1299, 1303, 1301, 1327,
		1325, 1331, 1329, 1311, 1333, 1315, 1313, 1319, 1317, 1367, 1365, 1371, 1369, 1273, 1373, 1361, 1271, 1275, 843, 849, 1355, 1357, 9174, 9177, 853, 857, 9183, 9181, 9179 };
	public static final int[] SOF_RARE_OTHERS = new int[] {
		// cash
		995, 995, 995, 995, 995, 995, 995, 995,
		// lucky items
		23665, 23666, 23667, 23668, 23669, 23670, 23671, 23672, 23673, 23674, 23675, 23676, 23677, 23678, 23679, 23680, 23681, 23682, 23691, 23692, 23693, 23694, 23695, 23696, 23687, 23688, 23689,
		23684, 23686, 23685, 23697, 23690, 23699, 23700, 23683, 23698,
		// auras
		22905, 22899, 23848, 22907, 22901, 23850, 20958, 20962, 20967, 22280, 22284, 20966, 20965, 22288, };

	public static final int[] SOF_JACKPOT_OTHERS = new int[] {
		// cash
		995, 995, 995, 995, 995, 995, 995, 995,
		// auras
		22909, 22903, 23852, 23874, 23876, 23854, 22268, 22270, 22272, 22282, 22286, 22274, 22276, 22290, 22292, 22294, 22300,
		// pets
		21512, 12471, 12473, 12475, 12477,

	};

	public static final int[] TRADEABLE_EXCEPTION = new int[] { 22905, 22899, 23848, 22907, 22901, 23850, 20958, 20962, 20967, 22280, 22284, 20966, 20965, 22288, 22909, 22903, 23852, 23874, 23876,
		23854, 22268, 22270, 22272, 22282, 22286, 22274, 22276, 22290, 22292, 22294, 22300, };

}
