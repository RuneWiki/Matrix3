package com.rs.game.player.content.dungeoneering;

import java.util.Arrays;

import com.rs.Settings;
import com.rs.game.WorldTile;
import com.rs.game.npc.dungeonnering.DungeonNPC;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Smelting.SmeltingBar;
import com.rs.game.player.content.dungeoneering.rooms.BossRoom;
import com.rs.game.player.content.dungeoneering.rooms.HandledPuzzleRoom;
import com.rs.game.player.content.dungeoneering.rooms.HandledRoom;
import com.rs.game.player.content.dungeoneering.rooms.NormalRoom;
import com.rs.game.player.content.dungeoneering.rooms.RoomEvent;
import com.rs.game.player.content.dungeoneering.rooms.StartRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.ColouredRecessRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.CrystalPuzzleRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.FishingFerretRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.FlipTilesRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.FlowerRootsRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.FremennikCampRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.LeverRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.PoltergeistRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.ReturnTheFlowRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.SlidingStatuesRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.SlidingTilesRoom;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.ToxinMaze;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.UnhappyGhostRoom;

public class DungeonConstants {

	public static final int[] MIN_CRIT_PATH =
	{ 5, 10, 19 }, MAX_CRIT_PATH =
	{ 7, 13, 23 };

	public static final WorldTile OUTSIDE = new WorldTile(3460, 3720, 1);

	public static final int ROTATIONS_COUNT = 4;

	public static final int TINDERBOX = 17678;

	public static final int SMUGGLER = 11226;

	public static final int[] LADDERS = new int[]
	{ 49696, 49698, 49700, 53748, 55484 };

	public static final int FLOORS_COUNT = 60;

	public static final int GROUP_GATESTONE = 18829, GATESTONE = 17489;

	/*
	 * objects handling
	 */
	public static final int[] DUNGEON_DOORS = new int[]
	{ 50342, 50343, 50344, 53948, 55762 };
	public static final int[] DUNGEON_BOSS_DOORS = new int[]
	{ 50350, 50351, 50352, 53950, 55764 };

	public static final int[] DUNGEON_GUARDIAN_DOORS =
	{ 50346, 50347, 50348, 53949, 55763 };

	/*
	 * novite ores
	 */
	public static final int[] MINING_RESOURCES =
	{ 49806, 49786, 49766, 53771, 55514 };

	/*
	 * Tangle gum tree
	 */
	public static final int[] WOODCUTTING_RESOURCES =
	{ 49745, 49725, 49705, 53751, 55494 };

	/*
	 * Salve nettles
	 */
	public static final int[] FARMING_RESOURCES =
	{ 49866, 49846, 49826, 53791, 55534 };

	public static final int[] THIEF_CHEST_LOCKED =
	{ 49345, 49346, 49347, 54407, 32462 };
	public static final int[] THIEF_CHEST_OPEN =
	{ 49348, 49349, 49350, 54408, 32679 };
	public static final double[] THIEF_CHEST_XP =
	{ 25.5, 57, 115, 209, 331.5, 485, 661.5, 876, 1118, 1410.5 };

	public static final int RUSTY_COINS = 18201, BANANA = 18199;

	public static final int[] CHARMS =
	{ 18017, 18018, 18019, 18020 };

	public static final int[] ARROWS =
	{ 16427, 16432, 16437, 16442, 16447, 16452, 16457, 16462, 16467, 16472, 16477 };

	public static final int[] RUNES =
	{ 17780, 17781, 17782, 17783, 17784, 17785, 17786, 17787, 17788, 17789, 17790, 17791, 17792, 17793 };

	public static final int RUNE_ESSENCE = 17776, FEATHER = 17796;

	public static final int[] DUNGEON_KEY_DOORS =
	{ 50353, 50417, 50481, 53884, 55675 };

	public static enum SkillDoors {
		RUNED_DOOR(Skills.RUNECRAFTING, new int[]
		{ 50278, 50279, 50280, 53953, 55741 }, 791, 186, -1, -1, -1, -1, "You imbue the door with the wrong type of rune energy, and it reacts explosively."),
		BARRED_DOOR(Skills.STRENGTH, new int[]
		{ 50272, 50273, 50274, 53951, 55739 }, new int[]
		{ 50275, 50276, 50277, 53952, 55740 }, -1, -1, -1, -1, -1, -1, "You pull a muscle while attempting to move the plank."),
		PILE_OF_ROCKS(Skills.MINING, new int[]
		{ 50305, 50306, 50307, 53962, 55750 }, -2, -1, 13559, -1, -1, 2420, "You fail to mine the obstruction, and are harmed by falling debris."),
		FLAMMABLE_DEBRIS(Skills.FIREMAKING, new int[]
		{ 50314, 50315, 50316, 53965, 55753 }, 16700, -1, 13562, 13563, -1, -1, "The pile of debris fails to ignite. The same cannot be said for your clothes."),
		MAGICAL_BARRIER(Skills.MAGIC, new int[]
		{ 50329, 50330, 50331, 53970, 55758 }, 4411, -1, 13551, 13550, -1, -1, "You fail to dispel the barrier and take a surge of magical energy to the face."),
		DARK_SPIRIT(Skills.PRAYER, new int[]
		{ 50332, 50333, 50334, 53971, 55759 }, 645, -1, 13557, 13556, -1, -1, "The gods snub your prayer, and the dark spirit attacks you."),
		WOODEN_BARRICADE(Skills.WOODCUTTING, new int[]
		{ 50317, 50318, 50319, 53966, 55754 }, new int[]
		{ 50320, 50321, 50322, 53967, 55755 }, -3, -1, 13582, -1, -1, -1, "You swing the axe against the grain and are showered with sharp splinters of wood."),
		BROKEN_KEY_DOOR(Skills.SMITHING, new int[]
		{ 50308, 50309, 50310, 53963, 55751 }, new int[]
		{ 50311, 50312, 50313, 53964, 55752 }, 13759, -1, -1, -1, -1, -1, "You hit your hand with the hammer. Needless to say, the key is still broken."),
		BROKEN_PULLEY_DOOR(Skills.CRAFTING, new int[]
		{ 50299, 50300, 50301, 53960, 55748 }, new int[]
		{ 50302, 50303, 50304, 53961, 55749 }, 13547, -1, -1, -1, -1, -1, "The rope snaps again as you attempt to fix it, and you crush your hands in the mechanism."),
		LOCKED_DOOR(Skills.AGILITY, new int[]
		{ -1, 50288, 50289, 53956, 55744 }, new int[]
		{ 50290, 50291, 50292, 53957, 55745 }, 14550, -1, -1, -1, -1, -1, "You miss the chain, and set off the trap."),
		PADLOCKED_DOOR(Skills.THIEVING, new int[]
		{ -1, 50294, 50295, 53958, 55746 }, new int[]
		{ 50296, 50297, 50298, 53959, 55747 }, 14568, -1, -1, -1, 14569, -1, "You set off a booby trap inside the lock, and fail to pick it."),
		RAMOKEE_EXILE(Skills.SUMMONING, new int[]
		{ -1, 50327, 50328, 53969, 55757 }, 725, 1207, -1, -1, -1, -1, "You fail to dismiss the rogue familiar, and it punches you in anger."),
		LIQUID_LOCK_DOOR(Skills.HERBLORE, new int[]
		{ -1, 50336, 50337, 53972, 55760 }, new int[]
		{ 50338, 50339, 50340, 53973, 55761 }, 14568, -1, -1, -1, -1, -1, "You incorrectly mix the ingredients, making it explode."),
		VINE_COVERED_DOOR(Skills.FARMING, new int[]
		{ -1, 50324, 50325, 53968, 55756 }, 2275, -1, 13572, -1, -1, -1, "You hurt your hands on the vicious thorns covering the vines."),
		COLLAPSING_DOORFRAME(Skills.CONSTRUCTION, new int[]
		{ -1, 50282, 50283, 53954, 55742 }, new int[]
		{ 50284, 50285, 50286, 53955, 55743 }, 14566, -1, -1, -1, 14567, -1, "You dislodge some debris while attempting to fix the door, and it falls on you.");

		private SkillDoors(int skillId, int[] closedThemeObjects, int openAnim, int openGfx, int openObjectAnim, int failObjectAnim, int failAnim, int failGfx, String failMessage) {
			this(skillId, closedThemeObjects, null, openAnim, openGfx, openObjectAnim, failObjectAnim, failAnim, failGfx, failMessage);
		}

		private int skillId, openAnim, openGfx, openObjectAnim, failObjectAnim, failAnim, failGfx;
		private int[] closedThemeObjects, openThemeObjects;
		private String failMessage;

		/*
		 * set openThemeObjects if u want it to disappear after open
		 */
		private SkillDoors(int skillId, int[] closedThemeObjects, int[] openThemeObjects, int openAnim, int openGfx, int openObjectAnim, int failObjectAnim, int failAnim, int failGfx, String failMessage) {
			this.skillId = skillId;
			this.closedThemeObjects = closedThemeObjects;
			this.openThemeObjects = openThemeObjects;
			this.failMessage = failMessage;
			this.openAnim = openAnim;
			this.openGfx = openGfx;
			this.openObjectAnim = openObjectAnim;
			this.failObjectAnim = failObjectAnim;
			this.failGfx = failGfx;
			this.failAnim = failAnim;
		}

		public int getSkillId() {
			return skillId;
		}

		public int getFailGfx() {
			return failGfx;
		}

		public int getFailAnim() {
			return failAnim;
		}

		public int getFailObjectAnim() {
			return failObjectAnim;
		}

		public int getOpenObjectAnim() {
			return openObjectAnim;
		}

		public int getOpenAnim() {
			return openAnim;
		}

		public int getOpenGfx() {
			return openGfx;
		}

		public int getClosedObject(int type) {
			return closedThemeObjects[type];
		}

		public int getOpenObject(int type) {
			return openThemeObjects == null ? -1 : openThemeObjects[type];
		}

		public String getFailMessage() {
			return failMessage;
		}
	}

	/*
	 * keydoors only require the unlock objectid and itemid
	 */
	public static enum KeyDoors {
		ORANGE_TRIANGLE(0),
		ORANGE_DIAMOND(1),
		ORANGE_RECTANGLE(2),
		ORANGE_PENTAGON(3),
		ORANGE_CORNER(4),
		ORANGE_CRESCENT(5),
		ORANGE_WEDGE(6),
		ORANGE_SHIELD(7),
		SILVER_TRIANGLE(8),
		SILVER_DIAMOND(9),
		SILVER_RECTANGLE(10),
		SILVER_PENTAGON(11),
		SILVER_CORNER(12),
		SILVER_CRESCENT(13),
		SILVER_WEDGE(14),
		SILVER_SHIELD(15),
		YELLOW_TRIANGLE(16),
		YELLOW_DIAMOND(17),
		YELLOW_RECTANGLE(18),
		YELLOW_PENTAGON(19),
		YELLOW_CORNER(20),
		YELLOW_CRESCENT(21),
		YELLOW_WEDGE(22),
		YELLOW_SHIELD(23),
		GREEN_TRIANGLE(24),
		GREEN_DIAMOND(25),
		GREEN_RECTANGLE(26),
		GREEN_PENTAGON(27),
		GREEN_CORNER(28),
		GREEN_CRESCENT(29),
		GREEN_WEDGE(30),
		GREEN_SHIELD(31),
		BLUE_TRIANGLE(32),
		BLUE_DIAMOND(33),
		BLUE_RECTANGLE(34),
		BLUE_PENTAGON(35),
		BLUE_CORNER(36),
		BLUE_CRESCENT(37),
		BLUE_WEDGE(38),
		BLUE_SHIELD(39),
		PURPLE_TRIANGLE(40),
		PURPLE_DIAMOND(41),
		PURPLE_RECTANGLE(42),
		PURPLE_PENTAGON(43),
		PURPLE_CORNER(44),
		PURPLE_CRESCENT(45),
		PURPLE_WEDGE(46),
		PURPLE_SHIELD(47),
		CRIMSON_TRIANGLE(48),
		CRIMSON_DIAMOND(49),
		CRIMSON_RECTANGLE(50),
		CRIMSON_PENTAGON(51),
		CRIMSON_CORNER(52),
		CRIMSON_CRESCENT(53),
		CRIMSON_WEDGE(54),
		CRIMSON_SHIELD(55),
		GOLD_TRIANGLE(56),
		GOLD_DIAMOND(57),
		GOLD_RECTANGLE(58),
		GOLD_PENTAGON(59),
		GOLD_CORNER(60),
		GOLD_CRESCENT(61),
		GOLD_WEDGE(62),
		GOLD_SHIELD(63);
		private int index;

		private KeyDoors(int index) {
			this.index = index;
		}

		public int getObjectId() {
			return getLowestObjectId() + index;
		}

		public int getDoorId(int floorType) {
			return getLowestDoorId(floorType) + index;
		}

		public static int getLowestObjectId() {
			return 50208;
		}

		public static int getLowestDoorId(int floorType) {
			return DUNGEON_KEY_DOORS[floorType];
		}

		public static int getMaxObjectId() {
			return 50208 + KeyDoors.values().length;
		}

		public static int getMaxDoorId(int floorType) {
			return DUNGEON_KEY_DOORS[floorType] + KeyDoors.values().length;
		}

		public int getKeyId() {
			return getLowestKeyId() + (index * 2);
		}

		public static int getLowestKeyId() {
			return 18202;
		}

		public int getIndex() {
			return index;
		}
	}

	public static final int NORMAL_DOOR = 0, GUARDIAN_DOOR = 1, SKILL_DOOR = 2, CHALLENGE_DOOR = 3, KEY_DOOR = 4;

	public static final double UNBALANCED_PARTY_PENALTY = 0.4;
	public static final double[] DUNGEON_SIZE_BONUS =
	{ 0, 0.07, 0.15 };
	public static final double[] COMPLEXIYY_PENALTY_BASE =
	{ 0.32, 0.35, 0.37 };
	public static final double MAX_BONUS_ROOM = 0.13;
	public static final double[][] DUNGEON_DIFFICULTY_RATIO_BONUS =
	{
	{ 0 },
	{ -0.07, 0.05 },
	{ -0.14, 0.02, 0.1 },
	{ -0.21, -0.07, 0.06, 0.15 },
	{ -0.29, -0.12, 0.04, 0.11, 0.19 } };
	/*
	 * floor types
	 */
	public static final int FROZEN_FLOORS = 0, ABANDONED_FLOORS = 1, FURNISHED_FLOORS = 2, OCCULT_FLOORS = 3, WARPED_FLOORS = 4;

	/*
	 * dungeon sizes
	 */
	public static final int SMALL_DUNGEON = 0, MEDIUM_DUNGEON = 1, LARGE_DUNGEON = 2, TEST_DUNGEON = 3;

	// 4x4, 4x8 and 4x8, 2x1(just boss room for test)
	public static final int[][] DUNGEON_RATIO = new int[][]
	{ new int[]
	{ 4, 4 }, new int[]
	{ 4, 8 }, new int[]
	{ 8, 8 }, new int[]
	{ 2, 1 } };

	public static final int XP_RATE = 4; //4x for now

	/*
	 * door directions
	 */
	public static final int EAST_DOOR = 2, WEST_DOOR = 0, NORTH_DOOR = 1, SOUTH_DOOR = 3;

	public static final int[] START_ROOM_MUSICS = new int[]
	{ 822, 797, 765, 884, 935 };

	public static final int[][] DANGEROUS_MUSICS =
	{
	{ 832, 834, 827, 811, 824, 808, 831, 810, 833, 837 }, //frozen
		{ 779, 781, 799, 802, 794, 780, 771, 790, 775, 801 }, //abandoned
		{ 748, 769, 741, 739, 742, 753, 761, 757, 747, 756 }, //furnished
		{ 873, 882, 880, 860, 886, 872, 885, 889, 870, 864 }, //occult floor
		{ 930, 914, 917, 911, 927, 939, 938, 920, 925, 936 }, //warped floor
	};

	public static final int[][] SAFE_MUSICS =
	{
		// FROZEN_FLOORS
		{ 804, 805, 806, 807, 809, 812, 813, 814, 812, 813, 814, 821, 822 }, //frozen
		{ 772, 773, 775, 776, 777, 778, 788, 789, 791, 792, 793, 795, 796 }, //abandoned
		{ 740, 744, 745, 749, 750, 751, 752, 754, 755, 758, 760, 762, 764 }, //furnished
		{ 861, 862, 866, 867, 868, 869, 871, 874, 875, 878, 879, 881, 883 }, //occult
		{ 912, 915, 918, 919, 921, 923, 926, 928, 929, 931, 932, 933, 934 } //warped floor
	};

	/*
	 * Creatures
	 */
	public static final int[][] GUARDIAN_CREATURES =
	{
		//ALL FLOORs
		{ 10831, 10906, 10910, 10821, 10630, 10680, 10693, 10364, 10480, 10726 }
		// FROZEN
		,
		{ 10618, 10460, 10762, 10157, 10782, 10225, 10212, 10791, 10770 }
		// ABANDONED
		,
		{ 10168, 10496, 10178, 10469, 10604, 10706, 10706 }
		// Furnished
		,
		{ 10797, 10496, 10776, 10706 }
		// Occult
		,
		{ 10744, 10722, 10496, 10754, 10718, 10188, 10492, 10815 }
		// Warped
		,
		{ 10744, 10736, 10722, 10219, 10496, 10754, 10718, 10492, 12941 } };

	public static final int[][] FORGOTTEN_WARRIORS =
	{
		//warrior
		{ 10507, 10439, 10246, 10288, 10528 },
		//mage
		{ 10560, 10570, 10575, 10580, 10585, 10590, 10595, 10600 },
		//range
		{ 10320, 10325, 10330, 10335, 10340, 10345, 10350, 10355, 10360 } };

	public static final int[] SLAYER_CREATURES =
	{ 10694, 10695, 10696, 10697, 10698, 10699, 10700, 10701, 10702, 10704, 10705 };

	/*
	 * id - lvl
	 */
	public static final int[] HUNTER_CREATURES =
	{ 11086, 11087, 11088, 11089, 11090, 11091, 11092, 11093, 11094, 11095 };

	public static final StartRoom[] START_ROOMS = new StartRoom[]
	{
		// FROZEN_FLOORS
		new StartRoom(14, 632, EAST_DOOR, WEST_DOOR, NORTH_DOOR, SOUTH_DOOR),
		new StartRoom(14, 624, SOUTH_DOOR),
		new StartRoom(14, 626, WEST_DOOR, SOUTH_DOOR),
		new StartRoom(14, 630, WEST_DOOR, NORTH_DOOR, SOUTH_DOOR) };

	public static final NormalRoom[] NORMAL_ROOMS = new NormalRoom[]
	{
		new NormalRoom(8, 240, spot(3, 7), SOUTH_DOOR),
		new NormalRoom(8, 242, spot(3, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(8, 244, spot(3, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(8, 246, spot(4, 13), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(8, 248, spot(3, 12), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(8, 256, spot(12, 12), SOUTH_DOOR),
		new NormalRoom(8, 258, spot(12, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(8, 260, spot(11, 6), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(8, 262, spot(12, 6), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(8, 264, spot(12, 12), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(10, 240, spot(3, 3), SOUTH_DOOR),
		new NormalRoom(10, 242, spot(7, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(10, 244, spot(2, 4), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(10, 246, spot(2, 12), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(10, 248, spot(2, 12), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(10, 256, spot(8, 12), SOUTH_DOOR),
		new NormalRoom(10, 258, spot(12, 2), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(10, 260, spot(3, 4), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(10, 262, spot(7, 8), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(10, 264, spot(5, 10), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(12, 240, spot(3, 7), SOUTH_DOOR),
		new NormalRoom(12, 242, spot(11, 7), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(12, 244, spot(3, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(12, 246, spot(10, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(12, 248, spot(10, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(12, 256, spot(9, 7), SOUTH_DOOR),
		new NormalRoom(12, 258, spot(3, 6), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(12, 260, spot(4, 10), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(12, 262, spot(9, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(12, 264, spot(3, 6), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(14, 240, spot(7, 10), SOUTH_DOOR),

		new NormalRoom(14, 256, spot(4, 13), SOUTH_DOOR),
		new NormalRoom(14, 258, spot(12, 9), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(14, 260, spot(12, 13), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(14, 262, spot(7, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(14, 264, spot(11, 13), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(16, 240, spot(7, 10), SOUTH_DOOR),

		new NormalRoom(16, 256, spot(4, 12), SOUTH_DOOR),
		new NormalRoom(16, 258, spot(7, 11), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(16, 260, spot(4, 3), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(16, 262, spot(7, 8), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(16, 264, spot(7, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(18, 240, spot(7, 10), SOUTH_DOOR),
		new NormalRoom(18, 260, spot(5, 12), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(18, 264, spot(3, 12), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(20, 240, spot(9, 13), SOUTH_DOOR),

		new NormalRoom(20, 258, spot(11, 9), SOUTH_DOOR, WEST_DOOR),

		new NormalRoom(22, 240, spot(8, 9), SOUTH_DOOR),

		new NormalRoom(22, 256, spot(7, 10), SOUTH_DOOR),
		new NormalRoom(22, 258, spot(11, 10), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(22, 260, spot(7, 8), SOUTH_DOOR, NORTH_DOOR),
		new NormalRoom(22, 262, spot(7, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR),
		new NormalRoom(22, 264, spot(7, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(24, 242, spot(7, 7), SOUTH_DOOR, WEST_DOOR),

		new NormalRoom(24, 258, spot(12, 10), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(24, 264, spot(7, 7), SOUTH_DOOR, NORTH_DOOR, WEST_DOOR, EAST_DOOR),

		new NormalRoom(26, 242, spot(9, 9), SOUTH_DOOR, WEST_DOOR),

		new NormalRoom(28, 246, spot(11, 8), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(30, 244, spot(3, 6), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(32, 244, spot(3, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(34, 242, spot(12, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(36, 248, spot(2, 13), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(38, 246, spot(12, 10), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(40, 244, spot(3, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(42, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(44, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(46, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(48, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(50, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),

		new NormalRoom(52, 240, spot(7, 11), SOUTH_DOOR),
		new NormalRoom(54, 240, spot(8, 11), SOUTH_DOOR),
		new NormalRoom(56, 240, spot(3, 10), SOUTH_DOOR),
		new NormalRoom(58, 240, spot(3, 12), SOUTH_DOOR),
		new NormalRoom(60, 240, spot(9, 12), SOUTH_DOOR),
		new NormalRoom(62, 240, spot(12, 12), SOUTH_DOOR),
		new NormalRoom(64, 240, spot(2, 12), SOUTH_DOOR),
		new NormalRoom(66, 240, spot(8, 10), SOUTH_DOOR),
		new NormalRoom(68, 240, spot(3, 7), SOUTH_DOOR),
		new NormalRoom(70, 240, spot(8, 12), SOUTH_DOOR),
		new NormalRoom(72, 240, spot(12, 7), SOUTH_DOOR),
		new NormalRoom(74, 240, spot(4, 10), SOUTH_DOOR),
		new NormalRoom(76, 240, spot(8, 7), SOUTH_DOOR),
		new NormalRoom(78, 240, spot(3, 4), SOUTH_DOOR),

		new NormalRoom(62, 242, spot(13, 11), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(62, 244, spot(2, 3), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(62, 246, spot(13, 11), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(62, 248, spot(2, 3), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(64, 242, spot(7, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(64, 244, spot(13, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(64, 246, spot(7, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(64, 248, spot(7, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(66, 242, spot(12, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(66, 244, spot(3, 4), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(66, 246, spot(12, 12), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(66, 248, spot(3, 3), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(68, 242, spot(12, 8), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(68, 244, spot(5, 8), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(68, 246, spot(5, 8), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(70, 242, spot(11, 10), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(70, 244, spot(8, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(70, 246, spot(8, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(72, 242, spot(9, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(72, 244, spot(10, 8), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(72, 246, spot(11, 8), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(72, 248, spot(8, 5), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(74, 242, spot(3, 6), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(74, 244, spot(7, 5), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(74, 246, spot(3, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(74, 248, spot(2, 6), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(76, 242, spot(11, 9), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(76, 244, spot(7, 7), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(76, 246, spot(7, 7), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(76, 248, spot(7, 11), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		new NormalRoom(78, 242, spot(12, 12), SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(78, 244, spot(12, 12), NORTH_DOOR, SOUTH_DOOR),
		new NormalRoom(78, 246, spot(12, 3), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR),
		new NormalRoom(78, 248, spot(2, 3), NORTH_DOOR, SOUTH_DOOR, WEST_DOOR, EAST_DOOR), };

	public static enum MapRoomIcon {

		MAP_1(2791, true, SOUTH_DOOR),
		MAP_2(2792, true, WEST_DOOR),
		MAP_3(2793, true, NORTH_DOOR),
		MAP_4(2794, true, EAST_DOOR),
		MAP_5(2795, true, WEST_DOOR, SOUTH_DOOR),
		MAP_6(2796, true, WEST_DOOR, NORTH_DOOR),
		MAP_7(2797, true, NORTH_DOOR, EAST_DOOR),
		MAP_8(2798, true, SOUTH_DOOR, EAST_DOOR),
		MAP_9(2799, true, SOUTH_DOOR, WEST_DOOR, NORTH_DOOR),
		MAP_10(2800, true, WEST_DOOR, NORTH_DOOR, EAST_DOOR),
		MAP_11(2801, true, SOUTH_DOOR, NORTH_DOOR, EAST_DOOR),
		MAP_12(2802, true, SOUTH_DOOR, WEST_DOOR, EAST_DOOR),
		MAP_13(2803, true, SOUTH_DOOR, NORTH_DOOR, EAST_DOOR, WEST_DOOR),
		MAP_14(2804, true, SOUTH_DOOR, NORTH_DOOR),
		MAP_15(2805, true, WEST_DOOR, EAST_DOOR),
		MAP_16(2787, false, SOUTH_DOOR),
		MAP_17(2788, false, WEST_DOOR),
		MAP_18(2789, false, NORTH_DOOR),
		MAP_19(2790, false, EAST_DOOR);

		private int[] doorsDirections;
		private int spriteId;
		private boolean open;

		private MapRoomIcon(int spriteId, boolean open, int... doorsDirections) {
			this.doorsDirections = doorsDirections;
			this.open = open;
			this.spriteId = spriteId;
		}

		public int[] getDoorDirections() {
			return doorsDirections;
		}

		public boolean hasSouthDoor() {
			return hasDoor(SOUTH_DOOR);
		}

		public boolean hasNorthDoor() {
			return hasDoor(NORTH_DOOR);
		}

		public boolean hasWestDoor() {
			return hasDoor(WEST_DOOR);
		}

		public boolean hasEastDoor() {
			return hasDoor(EAST_DOOR);
		}

		public boolean hasDoor(int direction) {
			for (int dir : doorsDirections)
				if (dir == direction)
					return true;
			return false;
		}

		public int getSpriteId() {
			return spriteId;
		}

		public boolean isOpen() {
			return open;
		}
	}

	public static final int[][] PUZZLE_DOOR_ORDER = new int[][]
	{
	{ SOUTH_DOOR, WEST_DOOR },
	{ SOUTH_DOOR, EAST_DOOR },
	{ SOUTH_DOOR, NORTH_DOOR },
	{ SOUTH_DOOR, NORTH_DOOR, WEST_DOOR },
	{ SOUTH_DOOR, EAST_DOOR, WEST_DOOR },
	{ SOUTH_DOOR, EAST_DOOR, NORTH_DOOR },
	{ SOUTH_DOOR, EAST_DOOR, NORTH_DOOR, WEST_DOOR }, };

	public static final HandledRoom[] PUZZLE_ROOMS;

	public static enum Puzzle {

		CRYSTAL_PUZZLE(12, CrystalPuzzleRoom.class, all(spot(13, 5))),
		TOXIN_MAZE(20, ToxinMaze.class, all(spot(7, 8)), false),
		FLIP_TILES(24, FlipTilesRoom.class, list(spot(1, 3), spot(1, 12), spot(1, 3), spot(14, 11), spot(14, 11), spot(1, 9), spot(1, 3))),
		FREMENNIK_CAMP(26, FremennikCampRoom.class, list(spot(6, 14), spot(10, 2), spot(14, 6), spot(5, 12), spot(13, 10), spot(3, 5), spot(13, 10))),
		FISHING_FERRET(32, FishingFerretRoom.class, all(spot(2, 1)), false),
		LEVERS(38, LeverRoom.class, list(spot(1, 5), spot(10, 14), spot(1, 5), spot(10, 14), spot(1, 5), spot(10, 14), spot(1, 5))),
		SLIDING_STATUES(42, SlidingStatuesRoom.class, all(spot(1, 3)), false),
		FLOWER_ROOTS(50, FlowerRootsRoom.class, list(spot(9, 10), spot(6, 7), spot(13, 12), spot(12, 12), spot(3, 6), spot(2, 11), spot(3, 11)), false),
		POLTERGEIST(52, PoltergeistRoom.class, list(spot(1, 10), spot(2, 10), spot(3, 5), spot(2, 4), spot(13, 4), spot(2, 12), spot(3, 4))),
		UNHAPPY_GHOST(60, UnhappyGhostRoom.class, list(spot(2, 3), spot(3, 5), spot(3, 5), spot(2, 2), spot(3, 3), spot(2, 2), spot(4, 3)), false),
		RETURN_THE_FLOW(66, ReturnTheFlowRoom.class, list(spot(3, 3), spot(2, 12), spot(2, 2), spot(4, 2), spot(3, 3), spot(2, 2), spot(2, 2))),
		COLOURED_RECESS(68, ColouredRecessRoom.class, list(spot(2, 3), spot(2, 3), spot(2, 3), spot(2, 3), spot(2, 3), spot(2, 5), spot(2, 3)), false),
		SLIDING_TILES(76, SlidingTilesRoom.class, list(spot(1, 2), spot(13, 7), spot(1, 2), spot(13, 7), spot(1, 2), spot(13, 7), spot(1, 2)));

		private int chunkX;
		private Class<? extends VisibleRoom> clazz;
		private boolean allowResources;
		private int[][] keys;

		private Puzzle(int chunkX, Class<? extends VisibleRoom> clazz) {
			this(chunkX, clazz, null);
		}

		private Puzzle(int chunkX, Class<? extends VisibleRoom> clazz, int[][] key) {
			this(chunkX, clazz, key, true);
		}

		private Puzzle(int chunkX, Class<? extends VisibleRoom> clazz, int[][] keys, boolean allowResources) {
			this.chunkX = chunkX;
			this.clazz = clazz;
			this.keys = keys;
			this.allowResources = allowResources;
		}

		public int getChunkX() {
			return chunkX;
		}

		public VisibleRoom newInstance() {
			try {
				return clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				System.err.println("error creating puzzle instance");
				return null;
			}
		}

		public boolean isAvailableOnFloorType(int floorType) {
			//I think constructor args are uglier because some are exclude and some are include
			if (this == POLTERGEIST && floorType == 0) {
				return false;
			}
			if (this == FLOWER_ROOTS && floorType == 0) {
				return false;
			}
			//if(this == ICY_PRESSURE_PAD && floorType != 0) {
			//return false;
			//}
			return true;
		}

		public boolean allowResources() {
			return allowResources;
		}

		public int[] getKeySpot(int i) {
			if (keys == null || i >= keys.length) {
				return null;
			}
			return keys[i];
		}

		private static int[][] all(int[] spot) {
			return new int[][]
			{ spot, spot, spot, spot, spot, spot, spot };
		}

		private static int[][] list(int[]... list) {
			if (list.length != 7) {
				System.err.println("Error in key list " + Arrays.toString(list));
				return null;
			}
			return list;
		}

	}

	private static int[] spot(int x, int y) {
		return new int[]
		{ x, y };
	}

	static {

		int ptr = 0;
		PUZZLE_ROOMS = new HandledRoom[Puzzle.values().length * PUZZLE_DOOR_ORDER.length];
		for (Puzzle puzzle : Puzzle.values()) {
			//Force puzzle
			if (!Settings.HOSTED) {
				puzzle = Puzzle.SLIDING_STATUES;
			}/* else if(puzzle == Puzzle.COLOURED_RECESS) {
				//don't use in progress one on live instead replace it with last added one (more bug testers!)
				puzzle = Puzzle.SLIDING_STATUES;
			}*/
			for (int i = 0; i < PUZZLE_DOOR_ORDER.length; i++) {
				PUZZLE_ROOMS[ptr++] = new HandledPuzzleRoom(i, puzzle);
			}
		}

		//8 Monolith spot
		//(4,4),(4,4),(4,4),(4,4),(4,4),(4,4),(4,5)
		//10 Collapsing room (7, 1)
		//14 Ghosts (3, 10) in small one,	(3, 3)
		//(1,2),(3,10),(1,3),(1,3),(1,3),(1,3),(3,3)
		//16 Three statue weapon (Combat triangle statues) (8, 7) + chisel too
		//18 Follow the leader (Emotes) (7, 6) 
		//22 	Frozen: Icy Pressure Pad,
		//		(8, 1), (8, 1), (8, 1), (1, 8), (14, 8), (14, 8), (8, 14)
		//	Aba: Seeker Sentinel, //where no door else entrance? (8, 2) south (13, 7) east (7, 13)
		//		(), (), (), (), (), (), ()
		//	Furnished: Sleeping guards,
		//		(8, 10),all
		//	Occcult: Coloured bookcases,
		//		(8, 11), (14, 3), (4, 3), (10, 11), (5, 1), (7, 2), (3, 3)
		//	Warped: Portal maze
		//		(13, 6), all
		//28 Ten statue weapon (was 2-3 pairs on 1:1 on rs) (7, 8) on chisel
		//30 Lodestone power //east of crystal? (10, 1) (14, 4)
		//34 Suspicious grooves (11, 11) usually or opposite side
		//(5, 12 or 10,12
		//36 Agility Maze (4, 2) start always
		//40 Barrel puzzle (6, 11) barrel part at (7, 11) or (9, 2)
		//42 Sliding statues (1, 3)
		//1,3 or 3,1
		//44 Hunter ferret (8, 8) key ferret on (7, 8)
		//ferrets: (8, 7), (8, 7), (7, 7), (8, 7), (7, 8), (8, 7), (8, 7)
		//keys:    (7, 7), (8, 7), (7, 7), (7, 7), (7, 8), (7, 7), (8, 6)
		//46 Magical Construct (8, 6)
		//(), (), (), (), (), (), ()
		//48 Enigmatic Hoardstalker (Riddles) (NOT ON FROZEN) (7, 8)
		//(), (), (), (), (), (), ()
		//54 Keystone bridge (NOT ON FROZEN)
		//(9, 7), ??, (10,2) crit or (5, 13) bonus, (6, 2), (6, 2), (6, 2), (9, 2)
		//56 Grapple tightrope
		//(6, 2), (2, 2), (5, 1), (7, 2), (6, 1), (13, 1), (6, 1)
		//58 Pondskaters
		//(2, 2) or (13, 10), (<), (14, 8), (1, 6), (13, 7), (2,2 or 13,7), (13, 2)
		//60 Unhappy ghost
		//(2, 3), (3, 5), (3, 5), (2, 2), (3, 3), (2, 2), (4, 3)
		//62 Broken plank bridge
		//(6, 1), (6, 1), (6, 1), (6, 1), (7, 2), (6, 1), (6, 1)
		//64 Statue bridge
		//(13, 2), (9, 2), (4, 1), (6, 1), (9, 2), (8, 2), (9, 1)
		//68 Coloured recess 
		//(2, 3), (2, 3), (2, 3), (2, 3), (2, 3), (2, 5), (2, 3)
		//70 Winch bridge (6, 1), (1, 3), (9, 1), (9, 2), (8, 2), (6, 1), (8, 2)
		//72 Mercenary leader (combat) (12, 13), (3, 11), (2, 13), (4, 4), (4 , 2), (3, 4), (2, 3)
		//74 Ramokee familiars (combat) (4, 2), (3, 12), (2, 3), (2, 3), (2, 12), (3, 12), (5, 2)
		//78 Coloured ferrets (1, 3), (14, 4), (2, 13), (2, 2), (3, 5), (2, 2), (1, 6)
	}

	public static final BossRoom[][] BOSS_ROOMS =
	{
		// FROZEN_FLOORS
		{

			//To'Kash The Blood Chiller
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10024, 5, 10, false, BOSS_NPC);
				}
			}, 820, 9, 26, 626)

			//Plane-freezer Lakhrahnaz
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					DungeonNPC npc = dungeon.spawnNPC(reference, 9929, 7, 11, false, BOSS_NPC);
					npc.setCantSetTargetAutoRelatio(true);
				}
			}, 819, 6, 26, 624)

			//Luminscent Icefiend
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9912, 7, 11, false, BOSS_NPC);
				}
			}, 818, 3, 26, 626)

			//Icy Bones

			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10040, 7, 11, false, BOSS_NPC);
				}
			}, 815, 1, 24, 626)

			// Gluttonous behemoth

			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9948, 5, 10, false, BOSS_NPC);
					dungeon.spawnObject(reference, 49283, 10, 3, 0, 11);
					if (dungeon.getParty().getTeam().size() >= 2)
						dungeon.spawnObject(reference, 49283, 10, 0, 11, 11);
				}
			}, 817, 1, 28, 624),

			// Astea Frostweb
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9965, 8, 12, false, BOSS_NPC);
				}
			}, 816, 1, 30, 624) },
		//ABANDONED BOSSES
		{
			//Bal'Lak The Pummeler
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10128, 6, 8, false, BOSS_NPC);
				}
			}, 786, 33, 26, 642),

			//Shadow-forger Ihlakhizan
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10143, 6, 6, false, BOSS_NPC);
				}
			}, 783, 30, 28, 640),

			//Unholy cursebearer
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10111, 6, 8, false, BOSS_NPC);
				}
			}, 784, 15, 26, 640),

			//Bulwark beast
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10073, 5, 10, false, BOSS_NPC);
				}
			}, 785, 12, 24, 642),

			//Hobgoblin Geomancer
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10059, 6, 8, false, BOSS_NPC);
				}
			}, 787, 12, 24, 640)

			//Divine Skinweaver
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 10058, 5, 2, false, BOSS_NPC);
				}
			}, 782, 12, 30, 640) },
		//FURNISHED BOSSES
		{

			//Night-gazer Khighorahk
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9725, 6, 6, false, BOSS_NPC);
				}
			}, 759, 26, 24, 656)

			//Sagittare
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9753, 6, 6, false, BOSS_NPC);
				}
			}, 768, 23, 24, 658)

			//Lexicus Runewright
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9842, 8, 7, false, BOSS_NPC);
				}
			}, 738, 20, 26, 658)

			//Lakk The Rift Splitter
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9898, 6, 6, false, BOSS_NPC);
				}
			}, 767, 18, 28, 656)

			//Stomp
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 9782, 6, 9, false, BOSS_NPC);
				}
			}, 743, 18, 30, 656)

			//Rammernaut
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					//this one appears at middle of arena instead
					dungeon.spawnNPC(reference, 9767, 7, 7, false, BOSS_NPC);
				}
			}, 746, 18, 26, 656)

		},

		{

			//Yk'lagoor the thunderous
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11872, 5, 5, false, BOSS_NPC);
				}

			}, 890, 45, 26, 672)

			//Flesh-spoiler Haasghenahk
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11925, 8, 7, false, BOSS_NPC);
				}

			}, 892, 42, 24, 674)

			//Necro Lord
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11737, 7, 10, false, BOSS_NPC);
				}

			}, 876, 39, 30, 672)

			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11708, 5, 5, false, BOSS_NPC);
				}

			}, 891, 36, 28, 672)

			//Runebound Behemoth
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11812, 6, 8, false, BOSS_NPC);
				}

			}, 877, 36, 26, 674)

			//Skeletal Trio
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 11940, 5, 6, false, BOSS_NPC, 0.5D);
					dungeon.spawnNPC(reference, 12044, 7, 9, false, BOSS_NPC, 0.5D);
					dungeon.spawnNPC(reference, 11999, 7, 6, false, BOSS_NPC, 0.5D);
				}

			}, 865, 36, 24, 672)

		},

		//201 5513 0 for blink
		{

			//Warmonger
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12752, 6, 9, false, BOSS_NPC);
				}

			}, 924, 57, 24, 690)

			//World Gorger
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12478, 5, 6, false, BOSS_NPC);
				}

			}, 937, 54, 26, 690)

			//Hope Devourer
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12886, 8, 6, false, BOSS_NPC);
				}

			}, 916, 51, 30, 688)

			//Blink
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12865, 5, 6, false, BOSS_NPC);
				}

			}, 940, 48, 24, 688)

			//Dreadnaut
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12848, 7, 5, false, BOSS_NPC);
				}

			}, 913, 48, 28, 688)

			//Warped Gulega
			,
			new BossRoom(new RoomEvent() {
				@Override
				public void openRoom(DungeonManager dungeon, RoomReference reference) {
					dungeon.spawnNPC(reference, 12737, 8, 8, false, BOSS_NPC);
				}

			}, 922, 48, 26, 688) }

	};

	public static final int[][] WALL_BASE_X_Y =
	{
	{ 14, 1, 0, 14 },
	{ 1, 1, 14, 0 },
	{ 1, 1, 0, 14 },
	{ 1, 14, 14, 0 } };

	public static final int SET_RESOURCES_MAX_TRY = 300;

	public static final int FISH_SPOT_OBJECT_ID = 49922, FISH_SPOT_NPC_ID = 2859;

	public static final long[] FARMING_CYCLES =
	{ 0, 30000, 60000, Integer.MAX_VALUE };
	public static final int FARMING_PATCH_BEGINING = 50040, FARMING_PATCH_END = 50189;
	public static final int EMPTY_FARMING_PATCH = 50038;

	public static final int ESSENCE = 17776;

	public static final int NORMAL_NPC = 0, GUARDIAN_NPC = 1, FISH_SPOT_NPC = 2, BOSS_NPC = 3, FORGOTTEN_WARRIOR = 4, SLAYER_NPC = 5, HUNTER_NPC = 6, PUZZLE_NPC = 7;

	public static SmeltingBar[] SMELTING_BARS = new SmeltingBar[]
	{
		SmeltingBar.NOVITE,
		SmeltingBar.BATHUS,
		SmeltingBar.MARMAROS,
		SmeltingBar.KRATONITE,
		SmeltingBar.FRACTITE,
		SmeltingBar.ZEPHYRIUM,
		SmeltingBar.ARGONITE,
		SmeltingBar.KATAGON,
		SmeltingBar.GORGONITE,
		SmeltingBar.PROMETHIUM };

	public static int[] GROUP_GATESTONE_RUNES =
	{ 17792, 3 };

	public static final int[][] HOARDSTALKER_ITEMS =
	{
	{ 17630, 17424, 17682, 17448, 17797 },
	{ 17632, 17426, 17684, 17450, 17799 },
	{ 17634, 17428, 17686, 17452, 17801 },
	{ 17636, 17430, 17688, 17454, 17803 },
	{ 17638, 17432, 17700, 17456, 17805 },
	{ 17640, 17434, 17702, 17458, 17807 },
	{ 17642, 17436, 17704, 17460, 17809 },
	{ 17644, 17438, 17706, 17462, 17811 },
	{ 17646, 17440, 17708, 17464, 17813 },
	{ 17648, 17442, 17710, 17466, 17815 }, };

	public static final int[] SLAYER_LEVELS =
	{ 5, 10, 17, 30, 41, 52, 63, 71, 80, 90, 99 };

}
