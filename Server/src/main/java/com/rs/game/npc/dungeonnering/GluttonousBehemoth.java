package com.rs.game.npc.dungeonnering;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public final class GluttonousBehemoth extends DungeonBoss {

	private WorldObject heal;
	private int ticks;

	public GluttonousBehemoth(int id, WorldTile tile, DungeonManager manager, RoomReference reference) {
		super(id, tile, manager, reference);
		setCantFollowUnderCombat(true);
	}

	public void setHeal(WorldObject food) {
		ticks = 0;
		heal = food;
		removeTarget();
	}

	@Override
	public void processNPC() {
		if (heal != null) {
			setNextFaceEntity(null);
			ticks++;
			if (ticks == 1) {
				calcFollow(heal, true);
			} else if (ticks == 5) {
				setNextAnimation(new Animation(13720));
			} else if (ticks < 900 && ticks > 7) {
				if (getHitpoints() >= (getMaxHitpoints() * 0.75)) {
					setNextAnimation(new Animation(-1));
					calcFollow(getRespawnTile(), true);
					ticks = 995;
					return;
				}
				heal(50 + Utils.random(50));
				setNextAnimation(new Animation(13720));
			} else if (ticks > 1000)
				heal = null;
			return;
		}
		super.processNPC();
	}

}
