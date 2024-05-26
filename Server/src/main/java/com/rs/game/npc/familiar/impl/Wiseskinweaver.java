package com.rs.game.npc.familiar.impl;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Wiseskinweaver extends Familiar {

	private static final long serialVersionUID = 8073842237001323628L;

	public Wiseskinweaver(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Glimmer of Light";
	}

	@Override
	public String getSpecialDescription() {
		return "Restores 80 hitpoints.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 13;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		Player player = (Player) object;
		player.heal(80);//Increases by 10 each time
		getOwner().setNextGraphics(new Graphics(1300));
		getOwner().setNextAnimation(new Animation(7660));
		return true;
	}
}
