package com.rs.game.npc.others;

import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class Nechryael extends NPC {

	private NPC[] deathSpawns;

	public Nechryael(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	}

	@Override
	public void processNPC() {
		if (hasActiveSpawns() && !isUnderCombat())
			removeDeathSpawns();
		super.processNPC();
	}

	public void summonDeathSpawns() {
		deathSpawns = new NPC[2];
		Entity target = getCombat().getTarget();
		for (int idx = 0; idx < deathSpawns.length; idx++) {
			deathSpawns[idx] = World.spawnNPC(getId() + 1, Utils.getFreeTile(this, 2), -1, true, true);
			if (target != null)
				deathSpawns[idx].setTarget(target);
		}
	}

	private void removeDeathSpawns() {
		for (NPC npc : deathSpawns)
			npc.finish();
		deathSpawns = null;
	}
	
	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		removeDeathSpawns();
	}

	public boolean hasActiveSpawns() {
		return deathSpawns != null;
	}
}
