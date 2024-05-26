package com.rs.game.player.content;

import java.util.List;

import com.rs.Settings;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class DonatorZone {

	public static final int DONATOR_ZONE_GUIDE = 20366;
	
	public static void enterDonatorzone(final Player player) {
//		player.setNextGraphics(new Graphics(3224));
	//	Magic.sendTeleportSpell(player, 17108, -2, 3225, 3019, 1, 0, new WorldTile(2582, 3910, 0), 18, true, 0);
		//ppl dont like slow tp
		if(!Magic.sendNormalTeleportSpell(player, 0, 0, Settings.START_DZ_LOCATION))
			return;
		List<Integer> npcIndexes = World.getRegion(Settings.START_DZ_LOCATION.getRegionId()).getNPCsIndexes();
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if(!player.isEnteredDonatorZone()) {
					player.getDialogueManager().startDialogue("DZGuideD", 20366);
					player.setEnteredDonatorZone();
				}
				if (npcIndexes != null) {
					for (int npcIndex : npcIndexes) {
						final NPC n = World.getNPCs().get(npcIndex);
						if (n == null || n.getId() != 5445 && n.getId() != 20366)
							continue;
						n.setNextForceTalk(new ForceTalk(n.getId() == 20366 ? "Everyone welcome " + player.getDisplayName() + " to the donator zone."
								: "Welcome!"));
					}
				}
			}
			
		}, 5);
	}
}
