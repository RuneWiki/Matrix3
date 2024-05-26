package com.rs.game.player.dialogues.impl.construction;

import com.rs.game.WorldObject;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.dialogues.Dialogue;

public class ClimbHouseStairD extends Dialogue {

	private WorldObject object;
	private House house;

	@Override
	public void start() {
		this.object = (WorldObject) parameters[0];
		this.house = (House) parameters[1];
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Climb up.", "Climb down.", "Cancel");

	}

	@Override
	public void run(int interfaceId, int componentId) {
		end();
		if (componentId != OPTION_3 && house.containsPlayer(player)) //cuz player might have left with dialogue open
			house.climbStaircase(player, object, componentId == OPTION_1, false);

	}

	@Override
	public void finish() {

	}

}
