package com.rs.game.npc.familiar.impl;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Braveworldbearer extends Familiar {

	private static final long serialVersionUID = -422253696115269167L;

	public Braveworldbearer(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Second Wind";
	}

	@Override
	public String getSpecialDescription() {
		return "Each use of the scroll restores up to 28% of the player's run energy.";
	}

	@Override
	public int getBOBSize() {
		return 20;
	}

	@Override
	public int getSpecialAmount() {
		return 2;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		Player player = (Player) object;
		int runEnergy = (int) (player.getRunEnergy() * 1.28);
		if (player.getRunEnergy() == 100) {
			player.getPackets().sendGameMessage("Your run energy is completely full.");
			return false;
		}
		player.setRunEnergy(runEnergy > 100 ? 100 : runEnergy);
		getOwner().setNextGraphics(new Graphics(1300));
		getOwner().setNextAnimation(new Animation(7660));
		return true;
	}
}
