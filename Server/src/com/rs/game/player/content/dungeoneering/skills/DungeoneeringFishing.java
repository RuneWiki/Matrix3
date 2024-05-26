package com.rs.game.player.content.dungeoneering.skills;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.dungeonnering.DungeonFishSpot;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.utils.Utils;

public class DungeoneeringFishing extends Action {

	public enum Fish {

		HEIM_CRAB(17797, 1, 9),

		RED_EYE(17799, 10, 27),

		DUSK_EEL(17801, 20, 45),

		GIANT_FLATFISH(17803, 30, 63),

		SHORTFINNED_EEL(17805, 40, 81),

		WEB_SNIPPER(17807, 50, 99),

		BOULDABASS(17809, 60, 117),

		SALVE_EEL(17811, 70, 135),

		BLUE_CRAB(17813, 80, 153),

		CAVE_MORAY(17815, 90, 171),

		VILE_FISH(17374, 1, 0);

		private final int id, level;
		private final double xp;

		private Fish(int id, int level, double xp) {
			this.id = id;
			this.level = level;
			this.xp = xp;
		}

		public int getId() {
			return id;
		}

		public int getLevel() {
			return level;
		}

		public double getXp() {
			return xp;
		}
	}

	public static final int FLY_FISHING_ROAD_EMOTE = 622;
	public static final int FLY_FISHING_ROAD = 17794, FEATHER = 17796;

	private DungeonFishSpot spot;

	public DungeoneeringFishing(DungeonFishSpot spot) {
		this.spot = spot;
	}

	@Override
	public boolean start(Player player) {
		if (!checkAll(player))
			return false;
		player.getPackets().sendGameMessage("You attempt to capture a fish...", true);
		setActionDelay(player, getFishingDelay(player));
		return true;
	}

	@Override
	public boolean process(Player player) {
		player.setNextAnimation(new Animation(FLY_FISHING_ROAD_EMOTE));
		return checkAll(player);
	}

	private int getFishingDelay(Player player) {
		int playerLevel = player.getSkills().getLevel(Skills.FISHING);
		int fishLevel = spot.getFish().getLevel();
		int modifier = spot.getFish().getLevel();
		int randomAmt = Utils.random(4);
		double cycleCount = 1, otherBonus = 0;
		if (player.getFamiliar() != null)
			otherBonus = getSpecialFamiliarBonus(player.getFamiliar().getId());
		cycleCount = Math.ceil(((fishLevel + otherBonus) * 50 - playerLevel * 10) / modifier * 0.25 - randomAmt * 4);
		if (cycleCount < 1)
			cycleCount = 1;
		int delay = (int) cycleCount + 1;
		delay /= player.getAuraManager().getFishingAccurayMultiplier();
		return delay;

	}

	private int getSpecialFamiliarBonus(int id) {
		switch (id) {
		case 6796:
		case 6795:// rock crab
			return 1;
		}
		return -1;
	}

	@Override
	public int processWithDelay(Player player) {
		addFish(player);
		return getFishingDelay(player);
	}

	private void addFish(Player player) {
		player.getPackets().sendGameMessage("You manage to catch a " + ItemDefinitions.getItemDefinitions(spot.getFish().id).getName().toLowerCase() + ".", true);
		player.getInventory().deleteItem(FEATHER, 1);
		player.getSkills().addXp(Skills.FISHING, spot.getFish().xp);
		player.getInventory().addItem(spot.getFish().id, 1);
		if (spot.desecreaseFishes() <= 1) {
			if (spot.getFish() == Fish.VILE_FISH) {
				spot.addFishes();
				player.applyHit(new Hit(player, (int) (player.getMaxHitpoints() * .3), HitLook.REGULAR_DAMAGE));
				player.getPackets().sendGameMessage("You have a hilarious fishing accident that one day you'll tell your grandchildren about.");
				return;
			}
			spot.finish();
			player.setNextAnimation(new Animation(-1));
			player.getPackets().sendGameMessage("You have depleted this resource.");
		}
	}

	private boolean checkAll(Player player) {
		if (player.getSkills().getLevel(Skills.FISHING) < spot.getFish().getLevel()) {
			player.getDialogueManager().startDialogue("SimpleMessage", "You need a fishing level of " + spot.getFish().getLevel() + " to fish here.");
			return false;
		}
		if (!player.getInventory().containsItemToolBelt(FLY_FISHING_ROAD)) {
			player.getPackets().sendGameMessage("You need a " + ItemDefinitions.getItemDefinitions(FLY_FISHING_ROAD).getName().toLowerCase() + " to fish here.");
			return false;
		}
		if (!player.getInventory().containsOneItem(FEATHER)) {
			player.getPackets().sendGameMessage("You don't have " + ItemDefinitions.getItemDefinitions(FEATHER).getName().toLowerCase() + " to fish here.");
			return false;
		}
		if (!player.getInventory().hasFreeSlots()) {
			player.setNextAnimation(new Animation(-1));
			player.getDialogueManager().startDialogue("SimpleMessage", "You don't have enough inventory space.");
			return false;
		}
		return !spot.hasFinished();
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}
}
