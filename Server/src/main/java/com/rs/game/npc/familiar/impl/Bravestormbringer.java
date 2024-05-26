package com.rs.game.npc.familiar.impl;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Bravestormbringer extends Familiar {

	private static final long serialVersionUID = -5492385075362654275L;

	public Bravestormbringer(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Snaring Wave";
	}

	@Override
	public String getSpecialDescription() {
		return "Deals a more damaging attack that is 25% more accurate, deals more damage, and immobilises the opponent.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 20;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.ENTITY;
	}

	@Override
	public boolean submitSpecial(Object object) {//COMBAT SPECIAL
		setNextGraphics(new Graphics(2445));
		getOwner().setNextGraphics(new Graphics(1316));
		getOwner().setNextAnimation(new Animation(7660));
		return true;
	}
}
