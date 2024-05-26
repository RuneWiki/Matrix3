package com.rs.game.player.controllers.bossInstance;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.map.bossInstance.BossInstance;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class KalphiteKingInstanceController extends BossInstanceController {

	@Override
	public boolean processObjectClick5(final WorldObject object) {
		if (object.getId() == 82016) {
			player.lock();
			player.setNextAnimation(new Animation(19499));
			WorldTasksManager.schedule(new WorldTask() { //to remove at same time it teleports
				@Override
				public void run() {
					player.setNextAnimation(new Animation(-1));
					getInstance().leaveInstance(player, BossInstance.EXITED);
					removeControler();
				}
			}, 3);
			return false;
		}
		return true;
	}
}
