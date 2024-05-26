package com.rs.game.npc.dungeonnering;

import java.util.ArrayList;

import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class HopeDevourer extends DungeonBoss {

	private int auraTicks;
	private int auraDamage;

	public HopeDevourer(int id, WorldTile tile, DungeonManager manager, RoomReference reference) {
		super(id, tile, manager, reference);
		setLureDelay(10000);
		setForceFollowClose(true);
		this.auraDamage = (int) Utils.random(getMaxHit() * .1, getMaxHit() * .15);
	}

	@Override
	public void processNPC() {
		super.processNPC();
		auraTicks++;
		if (auraTicks == 20) {
			sendAuraAttack();
			auraTicks = 0;
		}
	}

	@Override
	public boolean canMove(int dir) {
		int nextX = Utils.DIRECTION_DELTA_X[dir] + getX();
		int nextY = Utils.DIRECTION_DELTA_Y[dir] + getY();
		int size = getSize(); //i always do this instead of calling at loop cuz it grabs npcdef from hashmap every call
		for (Player player : getManager().getParty().getTeam()) {
			if (Utils.colides(player.getX(), player.getY(), player.getSize(), nextX, nextY, size))
				return false;
		}
		return true;
	}

	private void sendAuraAttack() {
		for (Entity t : super.getPossibleTargets()) {
			t.applyHit(new Hit(this, auraDamage, HitLook.REGULAR_DAMAGE, 60));
			if (t instanceof Player) {
				Player player = (Player) t;
				int combatSkill = Utils.random(Skills.MAGIC);
				if (combatSkill == 3)
					combatSkill = 1;
				player.getSkills().set(combatSkill, (int) (player.getSkills().getLevel(combatSkill) * Utils.random(0.94, .99)));
				player.getPackets().sendGameMessage("You feel hopeless...");
			}
		}
	}

	@Override
	public ArrayList<Entity> getPossibleTargets() {
		ArrayList<Entity> targets = super.getPossibleTargets();
		if (getAttackedBy() == null)
			return targets;
		else {
			ArrayList<Entity> possibleTargets = new ArrayList<Entity>();
			for (Entity t : targets) {
				if (t.getAttackedByDelay() > Utils.currentTimeMillis())
					possibleTargets.add(t);
			}
			return possibleTargets;
		}
	}
}
