package com.rs.game.player.content.dungeoneering.rooms.puzzles;

import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.stealingcreation.Helper;
import com.rs.game.npc.NPC;
import com.rs.game.npc.dungeonnering.DungeonNPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.rooms.PuzzleRoom;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class ColouredRecessRoom extends PuzzleRoom {

	public static final int[] SHELVES =
	{ 35243, 35242, 35241, 35245, 35246 };

	//+1-4 for colors
	public static final int[] BASE_BLOCKS =
	{ 13024, 13029, 13034, 13039, 13044 };

	public static final int[][] LOCATIONS =
	{
	{ 5, 10 },
	{ 10, 10 },
	{ 10, 5 },
	{ 5, 5 }, };

	private Block[] blocks;
	private boolean[] used;

	@Override
	public void openRoom() {
		manager.spawnRandomNPCS(reference);
		blocks = new Block[4];
		used = new boolean[4];
		for (int i = 0; i < blocks.length; i++) {
			while_: while (true) {
				WorldTile tile = manager.getTile(reference, 4 + Utils.random(8), 4 + Utils.random(8));
				if (!World.isTileFree(0, tile.getX(), tile.getY(), 1)) {
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (blocks[j].matches(tile)) {
						continue while_;
					}
				}
				blocks[i] = new Block(tile);
				break;
			}
		}

	}

	public void checkComplete() {
		if(isComplete())
			return;
		outer: for (Block block : blocks) {
			for (int tileColor = 0; tileColor < LOCATIONS.length; tileColor++) {
				int[] location = LOCATIONS[tileColor];
				if (manager.getTile(reference, location[0], location[1]).matches(block)) {
					int color = block.getId() - BASE_BLOCKS[type] - 1;
					if (color == tileColor) {
						continue outer;
					} else {
						return;
					}

				}
			}
			return;
		}
		setComplete();
	}

	public class Block extends DungeonNPC {

		private static final long serialVersionUID = -1770292505264759755L;

		public Block(WorldTile tile) {
			super(BASE_BLOCKS[type], tile, manager, 0);
		}

		public void handle(final Player player, final boolean push) {
			//TODO: make sure 2 players can't move 2 statues ontop of eachother in the same tick? although it doesn't really matter
			boolean pull = !push;

			int[] nPos = manager.getRoomPos(this);
			int[] pPos = manager.getRoomPos(player);

			final int dx = push ? getX() - player.getX() : player.getX() - getX();
			final int dy = push ? getY() - player.getY() : player.getY() - getY();
			final int ldx = push ? nPos[0] - pPos[0] : pPos[0] - nPos[0];
			final int ldy = push ? nPos[1] - pPos[1] : pPos[1] - nPos[1];
			
			if (nPos[0] + ldx < 4 || nPos[0] + ldx > 11 || nPos[1] + ldy < 4 || nPos[1] + ldy > 11) {
				player.getPackets().sendGameMessage("You cannot push the block there.");
				return;
			}
			final WorldTile nTarget = transform(dx, dy, 0);
			final WorldTile pTarget = player.transform(dx, dy, 0);

			if (!World.isTileFree(0, nTarget.getX(), nTarget.getY(), 1) || !World.isTileFree(0, pTarget.getX(), pTarget.getY(), 1)) {
				player.getPackets().sendGameMessage("Something is blocking the way.");
				return;
			}
			if (!ColouredRecessRoom.this.canMove(null, nTarget) || (pull && !ColouredRecessRoom.this.canMove(null, pTarget))) {
				player.getPackets().sendGameMessage("A block is blocking the way.");
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
						player.setNextForceMovement(new ForceMovement(fromTile, 0, pTarget, 1, Helper.getFaceDirection(Block.this, player)));
						player.setNextAnimation(new Animation(push ? 3065 : 3065));
					} else {
						checkComplete();
						stop();
					}
				}
			}, 0, 0);

		}

		public boolean useItem(Player player, Item item) {
			int color = (item.getId() - 19869) / 2;
			if (color < 0 || color > 3) {
				return true;
			}
			if (getId() != BASE_BLOCKS[type]) {
				return true;
			}
			if (used[color]) {
				return true;
			}
			used[color] = true;
			player.getInventory().deleteItem(item);
			player.setNextAnimation(new Animation(832));
			setNextNPCTransformation(getId() + color + 1);
			checkComplete();
			return false;
		}

	}

	@Override
	public boolean canMove(Player player, WorldTile to) {
		for (WorldTile block : blocks) {
			if (to.matches(block)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean processObjectClick1(Player p, WorldObject object) {
		if (object.getId() == SHELVES[type]) {
			p.getDialogueManager().startDialogue("ColouredRecessShelvesD", (Object[])null);
			return false;
		}
		return true;
	}

	@Override
	public boolean processNPCClick1(Player player, NPC npc) {
		if (npc instanceof Block) {
			((Block) npc).handle(player, true);
			return false;
		}
		return true;
	}

	@Override
	public boolean processNPCClick2(Player player, NPC npc) {
		if (npc instanceof Block) {
			((Block) npc).handle(player, false);
			return false;
		}
		return true;
	}

}
