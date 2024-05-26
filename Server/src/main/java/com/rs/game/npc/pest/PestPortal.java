package com.rs.game.npc.pest;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.minigames.pest.PestControl;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class PestPortal extends NPC {
    
    private static final String[] PORTAL_DESCRIPTIONS = {
	    "The purple, western",
	    "The blue, eastern",
	    "The yellow, south-eastern",
	    "The red, south-western"
    };

    private PestControl control;
    private int nextWave;

    public PestPortal(int id, boolean canbeAttackedOutOfArea, WorldTile tile, PestControl control) {
	super(id, tile, -1, canbeAttackedOutOfArea, true);
	this.control = control;
	setCantFollowUnderCombat(true);
    }

    public void unlock() {
	if (getId() >= 6146) {
	    setNextNPCTransformation(getId() - 4);
	    control.sendTeamMessage(PORTAL_DESCRIPTIONS[getId() - 6142] + " portal shield has been dropped!");
	}
    }

    public boolean isLocked() {
	return getId() < 6146;
    }

    private int getIndexForId() {
	switch (getId()) {
	case 6146:
	case 6142:
	    return 0;
	case 6147:
	case 6143:
	    return 1;
	case 6148:
	case 6144:
	    return 2;
	case 6149:
	case 6145:
	    return 3;
	case 3782:
	case 3784:
	case 3785:
	    return 4;
	}
	return -1;
    }

    @Override
    public void processNPC() {
	super.processNPC();
	nextWave++;
	if (nextWave % 15 == 0) {
	    if (control.createPestNPC(getIndexForId())) {
		if (Utils.random(5) == 0) // double spawn xD
		    control.createPestNPC(getIndexForId());
	    }
	}
	if (isDead() || isLocked())
	    return;
	cancelFaceEntityNoCheck();
    }

    @Override
    public void sendDeath(Entity source) {
	final NPCCombatDefinitions defs = getCombatDefinitions();
	resetWalkSteps();
	setNextAnimation(null);
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    setNextAnimation(new Animation(defs.getDeathEmote()));
		} else if (loop >= defs.getDeathDelay()) {
		    NPC knight = control.getKnight();
		    if (knight != null)
			knight.heal(5000);
		    finish();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }
}