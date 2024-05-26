package com.rs.game.player.actions;

import com.rs.cache.loaders.GeneralRequirementMap;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

public class WoodCutting2 extends Action {
	
	private static final int ITEM_ID_KEY = 2213, LEVEL_REQUIREMENT_KEY = 2212, NAME_KEY = 2210, DUNGEONEERING_KEY = 2219;
	private static final int LOGS_CS2_MAP = 7889;
	
	enum Tree {
		NORMAL(3693, 25.0D),
		
		ACHEY(3694, 25.0D),
		
		LIGHT_JUNGLE(3695, 25.0D),
		
		OAK(3696, 37.5D),
		
		MEDIUM_JUNGLE(3697, 25.0D),
		
		WILLOW(3698, 67.5D),
		
		DENSE_JUNGLE(3699, 25.0D),
		
		TEAK(3700, 85.0D),
		
		MAPLE(3702, 100.0D),
		
		HOLLOW(3703, 82.5D),
		
		MAHOGANY(3704, 125.0D),
		
		ARTIC_PINE(3705, 140.2D),
		
		EUCALYPTUS(3706, 165.0D),
		
		YEW(3707, 175.0D),
		
		CHOKING_IVY(3708, 332.5D),
		
		MAGIC(3709, 250.0D),
		
		ELDER(23235, 325.0D),
		
		CRYSTAL(23236, 434.5D),
		
		BLISTERWOOD(3710, 320.0D),
		
		CURSED_MAGIC(3712, 275.0D),
		
		STRAIGHT_ROOT(3713, 161.0D),
		
		CURLY_ROOT(3714, 161.0D),
		
		MUTATED_ROOT(3715, 161.0D),
		
		TANGLE_GUM(-1, 35),
		
		SEEPING_ELM(3745, 60.0D),
		
		BLOOD_SPINDLE(3747, 85.0D),
		
		UTUKU(3749, 115.0D),
		
		SPINEBEAM(3751, 145.0D),
		
		BOVISTRANGLER(3753, 175.0D),
		
		THIGAT(3755, 210.0D),
		
		CORPESTHORN(3757, 245.0D),
		
		ENTGALLOW(3759, 285.0D),
		
		GRAVE_CREEPER(3761, 330.0D),
		
		BLOODWOOD(9786, 320.0D)
		
		;
		
		private int scriptId;
		private double exp;
		
		private Tree(int scriptId, double exp) {
			this.scriptId = scriptId;
			this.exp = exp;
		}
		
		public int getLogId() {
			return GeneralRequirementMap.getMap(scriptId).getIntValue(ITEM_ID_KEY);
		}
		
		public int getLevelRequired() {
			return GeneralRequirementMap.getMap(scriptId).getIntValue(LEVEL_REQUIREMENT_KEY);
		}
		
		public double getExp() {
			return exp;
		}
		
		public String getActualName() {
			return GeneralRequirementMap.getMap(scriptId).getStringValue(NAME_KEY);
		}
		
		public boolean isDungeoneeringTree() {
			return GeneralRequirementMap.getMap(scriptId).getIntValue(DUNGEONEERING_KEY) == 0;
		}
	}
	
	enum Hatchet {
		
		BRONZE(3717),
		
		IRON(3718),
		
		STEEL(3719),
		
		BLACK(3720),
		
		MITHRIL(3721),
		
		ADAMANT(3722),
		
		SACRED_CLAY(3723),
		
		VOLITILE(3724),
		
		RUNE(3725),
		
		DRAGON(3726),
		
		INFERNO(3727),
		
		CRYSTAL(29504),
		
		NOVITE(-1),
		
		BATHUS(3746),
		
		MARMAROS(3748),
		
		KRATONITE(3750),
		
		FRACTITE(3752),
		
		ZEPHYRIUM(3754),
		
		ARGONITE(3756),
		
		KATAGON(3758),
		
		GORGONITE(3760),
		
		PROMETHIUM(3762),
		
		PRIMAL(3763),
		
		;
		
		private int scriptId;
		
		private Hatchet(int scriptId) {
			this.scriptId = scriptId;
		}
		
		public int getHatchetId() {
			if (this == NOVITE) return 16361;
			return GeneralRequirementMap.getMap(scriptId).getIntValue(ITEM_ID_KEY);
		}
		
		public int getLevelRequired() {
			if (this == NOVITE) return 1;
			return GeneralRequirementMap.getMap(scriptId).getIntValue(LEVEL_REQUIREMENT_KEY);
		}
		
		public boolean isDungeoneeringHatchet() {
			return GeneralRequirementMap.getMap(scriptId).getIntValue(DUNGEONEERING_KEY) == 0;
		}
		
		public static Hatchet getHatchetForId(int hatchetId) {
			for (Hatchet hatchet : Hatchet.values()) {
				if (hatchet.getHatchetId() == hatchetId)
					return hatchet;
			}
			return null;
		}
	}
	
	private Hatchet hatchet;
	private Tree tree;
	
	private boolean checkAll(Player player) {
		if (hatchet == null) {
			player.getPackets().sendGameMessage("You dont have the required level to use that axe or you don't have a hatchet.");
			return false;
		}
		if (player.getSkills().getLevel(Skills.WOODCUTTING) < tree.getLevelRequired()) {
			player.getPackets().sendGameMessage("You need a Woodcutting level of "+tree.getLevelRequired()+" in order to chop this tree.");
			return false;
		}
		
		if (!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendEntityMessage(1, 0xFFFFFF, player, "Your inventory is too full to hold logs.");
			return false;
		}
		return true;
	}
	

	@Override
	public boolean start(Player player) {
		hatchet = getHatchet(player);
		if (!checkAll(player))
			return false;
		return true;
	}

	@Override
	public boolean process(Player player) {
		return false;
	}

	@Override
	public int processWithDelay(Player player) {
		return 0;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}
	

	private static Hatchet getHatchet(Player player) {
		Hatchet hatchet = Hatchet.getHatchetForId(player.getEquipment().getWeaponId());
		if (hatchet != null)
			return hatchet;
		Hatchet[] hatchets = Hatchet.values();
		for (int nextHatchet = hatchets.length; nextHatchet > 0; nextHatchet--) {
			hatchet = hatchets[nextHatchet];
			if ((!hatchet.isDungeoneeringHatchet() && player.getDungManager().isInside())
				|| hatchet.isDungeoneeringHatchet() && !player.getDungManager().isInside()
				|| !player.getInventory().containsItem(hatchet.getHatchetId(), 1))
				continue;
			if (hatchet == Hatchet.INFERNO) {
				if (player.getSkills().getLevel(Skills.FIREMAKING) < 92)
					continue;
			}
			if (player.getSkills().getLevel(Skills.WOODCUTTING) < hatchet.getLevelRequired())
				continue;
			return hatchet;
		}
		return null;
	}
}
