package com.rs.game.npc.familiar.impl;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Summoning.Pouch;

public class Spiritterrorbird extends Familiar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5259052583696765531L;

	public Spiritterrorbird(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Tireless Run";
	}

	@Override
	public String getSpecialDescription() {
		return "Restores the player's run energy, by half the players agility level rounded up.";
	}

	@Override
	public int getBOBSize() {
		return 12;
	}

	@Override
	public int getSpecialAmount() {
		return 8;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		Player player = (Player) object;
		if (player.getRunEnergy() == 100) {
			player.getPackets().sendGameMessage("This wouldn't effect you at all.");
			return false;
		}
		int newLevel = getOwner().getSkills().getLevel(Skills.AGILITY) + 2;
		int runEnergy = (int) (player.getRunEnergy() +  Math.round(newLevel / 2.0));
		if (newLevel > getOwner().getSkills().getLevelForXp(Skills.AGILITY) + 2)
			newLevel = getOwner().getSkills().getLevelForXp(Skills.AGILITY) + 2;
		setNextAnimation(new Animation(8229));
		setNextGraphics(new Graphics(1521));
		player.setNextGraphics(new Graphics(1300));
		player.setNextAnimation(new Animation(7660));
		player.getSkills().set(Skills.AGILITY, newLevel);
		player.setRunEnergy(runEnergy > 100 ? 100 : runEnergy);
		return true;
	}
}
