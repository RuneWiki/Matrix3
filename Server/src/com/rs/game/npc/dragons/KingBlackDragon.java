package com.rs.game.npc.dragons;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.TimersManager.RecordKey;

@SuppressWarnings("serial")
public class KingBlackDragon extends NPC {

	public KingBlackDragon(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setLureDelay(0);
		setDropRateFactor(2); //double chance
		setIntelligentRouteFinder(true);
	}
	

	@Override
	public void sendDeath(final Entity source) {
		increaseKills(RecordKey.KING_BLACK_DRAGON, false);
		super.sendDeath(source);
	}
	


}
