package com.rs.game.npc.familiar.impl;

import com.rs.game.WorldTile;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.Summoning.Pouch;

public class Voidtorcher extends Familiar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -753902161581119980L;

	public Voidtorcher(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Call To Arms";
	}

	@Override
	public String getSpecialDescription() {
		return "Teleports the player to Void Outpost.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 4;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		Magic.sendTeleportSpell((Player) object, 14388, -1, 1503, 1502, 0, 0, new WorldTile(2662, 2649, 0), 3, true, Magic.OBJECT_TELEPORT);
		return true;
	}
}
