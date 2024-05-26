package com.rs.game.player.content.dungeoneering.rooms.puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.dungeonnering.DungeonNPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.DungeonUtils;
import com.rs.game.player.content.dungeoneering.VisibleRoom;
import com.rs.game.player.content.dungeoneering.rooms.PuzzleRoom;
import com.rs.game.player.controllers.DungeonController;
import com.rs.utils.Utils;

public class SlidingTilesRoom extends PuzzleRoom {

	private static final int[] BASE_TILE =
	{ 12125, 12133, 12141, 12149, 12963 };

	private static final int[][] TILE_COORDS =
	{
	{ 5, 9 },
	{ 7, 9 },
	{ 9, 9 },
	{ 5, 7 },
	{ 7, 7 },
	{ 9, 7 },
	{ 5, 5 },
	{ 7, 5 },
	{ 9, 5 }, };

	private static final int[][] VALID_MOVES =
	{
	{ 1, 3 },
	{ 0, 2, 4 },
	{ 1, 5 },
	{ 0, 4, 6 },
	{ 1, 3, 5, 7 },
	{ 2, 4, 8 },
	{ 3, 7 },
	{ 4, 6, 8 },
	{ 5, 7 } };

	private DungeonNPC[] tiles;
	private int freeIndex = 8;
	private int[] shuffledNpcOrder;
	private int[] solveOrder;
	private int solveIndex;

	@Override
	public void openRoom() {
		int npcCount = Utils.random(4);
		for (int i = 0; i < npcCount; i++) {
			int x = Utils.random(2) + 1;
			int y = Utils.random(2) + 1;
			if (Utils.random(2) == 0) { //vertical spawn
				x += Utils.random(2) == 0 ? 0 : 11; //left or right side
				y = Utils.random(14) + 1;
			} else { //horizontal spawn
				y += Utils.random(2) == 0 ? 0 : 11; //bottom or top
				x = Utils.random(14) + 1;
			}

			manager.spawnNPC(reference, DungeonUtils.getGuardianCreature(), x, y, true, DungeonConstants.GUARDIAN_DOOR, 0.5);
		}

		shuffle();
		tiles = new SlidingTile[9];
		for (int i = 0; i < 9; i++) {
			if (shuffledNpcOrder[i] != 0) {
				int[] coords = DungeonManager.translate(TILE_COORDS[i][0], TILE_COORDS[i][1], 0, 2, 2, 0);
				WorldTile base = manager.getRoomBaseTile(reference);
				tiles[i] = new SlidingTile(shuffledNpcOrder[i], new WorldTile(base.getX() + coords[0], base.getY() + coords[1], 0), manager, 0.0);
			}
		}
	}

	@SuppressWarnings("serial")
	public static class SlidingTile extends DungeonNPC {

		public SlidingTile(int id, WorldTile tile, DungeonManager manager, double multiplier) {
			super(id, tile, manager, multiplier);
		}

		@Override
		public int getDirection() {
			return 0;
		}
	}

	public void shuffle() {
		int type = manager.getParty().getFloorType();
		shuffledNpcOrder = new int[9];
		solveOrder = new int[8];
		for (int i = 0; i < 8; i++) {
			shuffledNpcOrder[i] = BASE_TILE[type] + i;
		}
		List<Integer> set = new ArrayList<Integer>();
		boolean[] used = new boolean[9];
		while (true) {
			for (int i = 0; i < VALID_MOVES[freeIndex].length; i++) {
				if (!used[VALID_MOVES[freeIndex][i]]) {
					set.add(VALID_MOVES[freeIndex][i]);
				}
			}
			if (set.isEmpty()) {
				break;
			}
			Collections.shuffle(set);
			int next = set.get(0);
			set.clear();
			used[freeIndex] = true;
			solveOrder[solveIndex++] = freeIndex;
			shuffledNpcOrder[freeIndex] = shuffledNpcOrder[next];
			shuffledNpcOrder[next] = 0;
			freeIndex = next;

		}
	}

	public static boolean handleSlidingBlock(Player player, NPC npc) {
		if (!npc.getDefinitions().name.equals("Sliding block") || player.getControlerManager().getControler() == null || !(player.getControlerManager().getControler() instanceof DungeonController)) {
			return false;
		}
		DungeonManager manager = player.getDungManager().getParty().getDungeon();
		VisibleRoom room = manager.getVisibleRoom(manager.getCurrentRoomReference(player));
		if (room == null) {
			return false;
		}
		if (!(room instanceof SlidingTilesRoom)) {
			return false;
		}
		final SlidingTilesRoom puzzle = (SlidingTilesRoom) room;
		for (int i = 0; i < puzzle.tiles.length; i++) {
			if (puzzle.tiles[i] == npc) {
				player.lock(1);
				if (i == puzzle.solveOrder[puzzle.solveIndex - 1]) {
					puzzle.solveIndex--;
					if (puzzle.solveIndex == 0) {
						puzzle.setComplete();
						//players can keep clicking after it's done but will take damage
						puzzle.solveIndex = 1;
						puzzle.solveOrder[0] = -1;
					}
					int[] coords = DungeonManager.translate(TILE_COORDS[puzzle.freeIndex][0], TILE_COORDS[puzzle.freeIndex][1], 0, 2, 2, 0);
					WorldTile base = puzzle.manager.getRoomBaseTile(puzzle.reference);
					npc.addWalkSteps(base.getX() + coords[0], base.getY() + coords[1]);

					puzzle.tiles[puzzle.freeIndex] = puzzle.tiles[i];
					puzzle.tiles[i] = null;
					puzzle.freeIndex = i;
					return true;
				} else {
					player.getPackets().sendGameMessage("You strain your powers of telekenesis, but the tile just doesn't want to go there.");
					player.applyHit(new Hit(player, (int) (player.getMaxHitpoints() * .2), HitLook.REGULAR_DAMAGE));
					return true;
				}
			}
		}

		return true;
	}

	@Override
	public String getCompleteMessage() {
		return "You hear a click as a nearby door unlocks.";//This is correct
	}

}
