package com.rs.game.player.dialogues.impl;

import com.rs.game.player.actions.WaterFilling;
import com.rs.game.player.actions.WaterFilling.Fill;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class WaterFillingD extends Dialogue {

//	private Fill fill;

	@Override
	public void start() {
		Fill fill = (Fill) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, fill.getFull());
		
		/*SkillsDialogueOld.sendSkillsDialogue(player, SkillsDialogueOld.MAKE, "Choose how many you wish to fill,<br>then click on the item to begin.", player.getInventory().getItems().getNumberOf(fill.getEmpty()), new int[]
		{ fill.getEmpty() }, null);*/
	}

	@Override
	public void run(int interfaceId, int componentId) {
		
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		Fill fill = WaterFilling.getFillByProduce(result.getProduce());
		if(fill == null)
			return;
		player.getActionManager().setAction(new WaterFilling(fill, result.getQuantity()));
		
	}

	@Override
	public void finish() {

	}

}
