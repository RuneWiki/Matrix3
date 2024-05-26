package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class Wisp extends NPC {
	
	private int lifeTime;
	private int value;
	
	private static final int[] REQUIRED_LEVELS = {1, 10, 20, 30, 40, 50, 60, 70, 80, 85, 90, 95};

	public Wisp(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		lifeTime = 0;
		if(getOriginalId() > 18150)
			value = getOriginalId() == 18150 ? 1 : ((getOriginalId()-(getDefinitions().getName().contains("Enriched") ? 1 : 0) - 18149) / 2 + 1);
		else
			value = getId() == 18150 ? 1 :((getId()-(getDefinitions().getName().contains("Enriched") ? 1 : 0) - 18149) / 2 + 1);
	}
	
	@Override
	public void processEntity() {
		super.processEntity();
		if(lifeTime > 0) {
			lifeTime--;
			if(lifeTime <= 0)
				sendDeath(this);
		}
	}
	
	@Override
	public void sendDeath(Entity source) {
		setNextAnimation(new Animation(21203));
		WorldTasksManager.schedule(new WorldTask() {
			int count = 0;
			@Override
			public void run() {
				if(count >= 2) {
					reset();
					finish();
					setRespawnTask();
					stop();
					if(Utils.random(50) == 1)
						World.spawnNPC(18204, transform(0,0,0), -1, false);
				}
				count++;
			}
		}, 0, 1);
	}
	
	@Override
	public void reset() {
		super.reset();
		this.lifeTime = 0;
		setRandomWalk(NPC.NORMAL_WALK);
		setNextNPCTransformation(getOriginalId());
	}
	
	public void interact(Player player) {
		if(REQUIRED_LEVELS[getValue()-1] > player.getSkills().getLevel(Skills.DIVINATION)) {
			player.getPackets().sendGameMessage("You need a level of  : " + REQUIRED_LEVELS[getValue()-1] + " to harvest this wisp!");
			return;
		}
		if(lifeTime == 0) {
			this.lifeTime = 10 + Utils.random(40);
			setRandomWalk(0);
			setNextNPCTransformation(getId() + 23);
		}
		player.getActionManager().setAction(new HarvestAction(this));
	}

	public int getLifeTime() {
		return lifeTime;
	}
	
	public int getOriginalId() {
		return getId()-23;
	}

	public int getValue() {
		return value;
	}
}
