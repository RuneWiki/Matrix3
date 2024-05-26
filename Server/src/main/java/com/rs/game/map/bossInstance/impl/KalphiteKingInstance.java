package com.rs.game.map.bossInstance.impl;

import com.rs.game.World;
import com.rs.game.map.bossInstance.BossInstance;
import com.rs.game.map.bossInstance.InstanceSettings;
import com.rs.game.npc.kalphite.KalphiteKing;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class KalphiteKingInstance extends BossInstance {

	public KalphiteKingInstance(Player owner, InstanceSettings settings) {
		super(owner, settings);
	}

	@Override
	public int[] getMapPos() {
		return new int[] { 368, 216 };
	}

	@Override
	public int[] getMapSize() {
		return new int[] { 1, 1 };
	}

	@Override
	public void leaveInstance(Player player, int type) {
		player.getTimersManager().removeTimer(); //removes timer without saving
		super.leaveInstance(player, type);
	}

	@Override
	public void loadMapInstance() {
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if (!KalphiteKingInstance.this.isInstanceReady())
					return;
				KalphiteKing king = (KalphiteKing) World.spawnNPC(16697+Utils.random(3), getTile(2974, 1759, 0), -1, true);// can spawn all colours
				king.setBossInstance(KalphiteKingInstance.this);
				king.addTimer(); //king wont set timer by itself first time due to boss instance not being added yet
			}

		}, 10);
	}

}
