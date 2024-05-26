package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.actions.HomeTeleport;
import com.rs.game.player.dialogues.Dialogue;

public class WildernessLodestone extends Dialogue {


	@Override
	public void start() {
		sendDialogue("The lodestone you have chosen is in level 15 Wilderness. Are you sure you want to teleport there?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if(stage == -1) {
			stage = 0;
			sendOptionsDialogue("Teleport to the wilderness?", "Yes.", "No.");
		}else{
			if (componentId == OPTION_1) {
				player.getActionManager().setAction(new HomeTeleport(new WorldTile(51498548)));
				player.setPreviousLodestone(35);
			}
			end();
		}
	}
	@Override
	public void finish() {

	}

}
