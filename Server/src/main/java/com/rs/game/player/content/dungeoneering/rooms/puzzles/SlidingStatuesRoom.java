package com.rs.game.player.content.dungeoneering.rooms.puzzles;

import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.WorldTile;
import com.rs.game.minigames.stealingcreation.Helper;
import com.rs.game.npc.NPC;
import com.rs.game.npc.dungeonnering.DungeonNPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.dungeoneering.rooms.PuzzleRoom;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class SlidingStatuesRoom extends PuzzleRoom {

	public final int[][] STATUES_INACTIVE =
	{
		//{7809, 7810, 7811, 7812}, //??
		//range1, warr1, range2, warr2
		{ 10942, 10943, 10944, 10945 }, //frozen
		{ 10946, 10947, 10948, 10949 }, //aba
		{ 10950, 10951, 10952, 10953 }, //furn
		{ 12117, 12118, 12119, 12120 }, //occ
		{ 12952, 12953, 12954, 12955 }, //warp
	};

	public final int[][] STATUES_ACTIVE =
	{
		//{7813, 7814, 7815, 7817}, //??
		{ 10954, 10955, 10956, 10957 },
		{ 10958, 10959, 10960, 10961 },
		{ 10962, 10963, 10964, 10965 },
		{ 12121, 12122, 12123, 12124 },
		{ 12956, 12957, 12958, 12959 },

	};

	public final int[][] STATUE_LOCATIONS =
	{
	{ 2, 9 },
	{ 9, 9 },
	{ 2, 2 },
	{ 9, 2 }, };

	private WorldTile[] statues;

	@Override
	public void openRoom() {
		statues = new WorldTile[8];
		WorldTile base = manager.getRoomBaseTile(reference);
		int index = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				while_: while (true) {
					WorldTile inactive = base.transform(STATUE_LOCATIONS[i][0] + Utils.random(5), STATUE_LOCATIONS[i][1] + Utils.random(5), 0);
					WorldTile active = base.transform(STATUE_LOCATIONS[i + 2][0] + Utils.random(5), STATUE_LOCATIONS[i + 2][1] + Utils.random(5), 0);
					for (WorldTile statue : statues) {
						if (statue != null && (inactive.matches(statue) || active.matches(statue))) { //doing some redundant checks this way but it's short
							continue while_;
						}
					}
					if (active.transform(0, 7, 0).matches(inactive)) {
						continue while_;
					}
					statues[index] = manager.spawnNPC(STATUES_INACTIVE[type][index], 0, inactive, reference, DungeonConstants.NORMAL_NPC, 0);
					statues[index + 4] = new Statue(STATUES_ACTIVE[type][index], active, STATUE_LOCATIONS[i + 2][0], STATUE_LOCATIONS[i + 2][1]);
					index++;
					break;
				}
			}
		}
		manager.spawnRandomNPCS(reference);
	}

	public class Statue extends DungeonNPC {

		private static final long serialVersionUID = -1770292505264759755L;

		private int baseX, baseY;

		public Statue(int id, WorldTile tile, int baseX, int baseY) {
			super(id, tile, manager, 0);
			this.baseX = baseX;
			this.baseY = baseY;
		}

		public void handle(final Player player, final boolean push) {
			//TODO: make sure 2 players can't move 2 statues ontop of eachother in the same tick? although it doesn't really matter
			boolean pull = !push;
			int x = transform(-baseX, -baseY, 0).getXInChunk();
			int y = transform(-baseX, -baseY, 0).getYInChunk();
			final int dx = push ? getX() - player.getX() : player.getX() - getX();
			final int dy = push ? getY() - player.getY() : player.getY() - getY();
			if (x + dx < 0 || x + dx > 4 || y + dy < 0 || y + dy > 4) {
				player.getPackets().sendGameMessage("You cannot push the statue there.");
				return;
			}
			final WorldTile nTarget = transform(dx, dy, 0);
			final WorldTile pTarget = player.transform(dx, dy, 0);

			if (!SlidingStatuesRoom.this.canMove(null, nTarget) || (pull && !SlidingStatuesRoom.this.canMove(null, pTarget))) {
				player.getPackets().sendGameMessage("A statue is blocking the way.");
				return;
			}
			for (Player team : manager.getParty().getTeam()) {
				if (team != player && team.matches(nTarget)) {
					player.getPackets().sendGameMessage("A party member is blocking the way.");
					return;
				}
			}

			player.lock(2);
			WorldTasksManager.schedule(new WorldTask() {

				private boolean moved;

				@Override
				public void run() {
					if (!moved) {
						moved = true;
						addWalkSteps(getX() + dx, getY() + dy);
						WorldTile fromTile = new WorldTile(player.getX(), player.getY(), player.getPlane());
						player.setNextWorldTile(pTarget);
						player.setNextForceMovement(new ForceMovement(fromTile, 0, pTarget, 1, Helper.getFaceDirection(Statue.this, player)));
						player.setNextAnimation(new Animation(push ? 3065 : 3065));
					} else {
						checkComplete();
						stop();
					}
				}
			}, 0, 0);

		}

	}

	private void checkComplete() {
		if (isComplete())
			return;
		for (int i = 0; i < 4; i++) {
			if (!statues[i + 4].transform(0, 7, 0).matches(statues[i])) {
				return;
			}
		}
		setComplete();
	}

	@Override
	public boolean canMove(Player player, WorldTile to) {
		for (WorldTile statue : statues) {
			if (to.matches(statue)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean processNPCClick1(Player player, NPC npc) {
		if (npc instanceof Statue) {
			((Statue) npc).handle(player, true);
			return false;
		}
		return true;
	}

	@Override
	public boolean processNPCClick2(Player player, NPC npc) {
		if (npc instanceof Statue) {
			((Statue) npc).handle(player, false);
			return false;
		}
		return true;
	}

}
