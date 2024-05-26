package com.rs.game.player.actions.construction;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.construction.HouseConstants;
import com.rs.game.player.content.prayer.Burying.Bone;

public class BoneOffering extends Action {

	private static final double[] BASE_ALTAR_PERCENT_BOOST =
	{ 1D, 1.1D, 1.25D, 1.5D, 1.75D, 2D, 2.5D };
	private static final Animation OFFERING_ANIMATION = new Animation(3705);
	private static final Graphics OFFERING_GRAPHICS = new Graphics(624, 0, 100);

	private double totalExperience;
	private final int litBurners;
	private final Bone bone;
	private final WorldObject altar;
	private int ticks;

	public BoneOffering(WorldObject altar, Bone bone, int litBurners) {
		this.altar = altar;
		this.bone = bone;
		this.litBurners = litBurners;
	}

	@Override
	public boolean start(Player player) {
		ticks = player.getInventory().getAmountOf(bone.getId());
		totalExperience = bone.getExperience() * (BASE_ALTAR_PERCENT_BOOST[HouseConstants.Builds.ALTAR.getSingleHObjectSlot(altar.getId())] + (litBurners > 2 ? 2 : litBurners * 0.5));
		return true;
	}

	@Override
	public boolean process(Player player) {
		return ticks > 0;
	}

	@Override
	public int processWithDelay(Player player) {
		if (ticks > 0) {
			player.setNextAnimation(OFFERING_ANIMATION);
			World.sendGraphics(player, OFFERING_GRAPHICS, altar);
			player.getSkills().addXp(Skills.PRAYER, totalExperience);
			player.getInventory().deleteItem(bone.getId(), 1);
			ticks--;
			return 2;
		}
		return -1;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}
}
