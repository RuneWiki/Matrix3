package com.rs.game.player.dialogues.impl;

import com.rs.game.player.actions.GemCutting;
import com.rs.game.player.actions.GemCutting.Gem;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class GemCuttingD extends Dialogue {

//	private Gem gem;

	@Override
	public void start() {
		Gem gem = (Gem) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, gem.getCut());
		
		/*killsDialogue.sendSkillsDialogue(player, SkillsDialogue.CUT, "Choose how many you wish to cut,<br>then click on the item to begin.", player.getInventory().getItems().getNumberOf(gem.getUncut()), new int[]
		{ gem.getUncut() }, null);*/

	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		Gem gem = GemCutting.getGemByProduce(result.getProduce());
		if(gem == null)
			return;
		player.getActionManager().setAction(new GemCutting(gem, result.getQuantity()));
	}

	@Override
	public void finish() {

	}

}
