package com.rs.game.npc.dungeonnering;

import java.util.List;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.Drop;
import com.rs.game.npc.Drops;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.utils.NPCDrops;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class DungeonBoss extends DungeonNPC {

	private RoomReference reference;

	public DungeonBoss(int id, WorldTile tile, DungeonManager manager, RoomReference reference) {
		this(id, tile, manager, reference, 1);
	}

	public DungeonBoss(int id, WorldTile tile, DungeonManager manager, RoomReference reference, double multiplier) {
		super(id, tile, manager, multiplier);
		this.setReference(reference);
		setForceAgressive(true);
		setIntelligentRouteFinder(true);
		setLureDelay(0);
	}

	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		getManager().openStairs(getReference());
	}

	@Override
	public void drop() {
		Drops drops = NPCDrops.getDrops(getId());
		if (drops == null)
			return;
		
		Drop[] dropsA = drops.getDrops(Drops.COMMOM);
		if(dropsA == null)
			return;
		Drop drop;
		if(getManager().getParty().getSize() == DungeonConstants.LARGE_DUNGEON)
			drop = dropsA[Utils.random(100) < 90 ? dropsA.length-1 : Utils.random(dropsA.length)];
		else if(getManager().getParty().getSize() == DungeonConstants.LARGE_DUNGEON)
			drop = dropsA[Utils.random(100) < 60 ? dropsA.length-1 : Utils.random(dropsA.length)];
		else
			drop = dropsA[Utils.random(dropsA.length)];
	//	Drop drop = drops.getDrop(Drops.COMMOM, Double.MAX_VALUE); //to make 100% chance
		if (drop == null) //shouldnt
			return;
		List<Player> players = getManager().getParty().getTeam();
		if (players.size() == 0)
			return;
		Player luckyPlayer = players.get(Utils.random(players.size()));
		Item item = sendDrop(luckyPlayer, drop);
		luckyPlayer.getPackets().sendGameMessage("You received: " + item.getAmount() + " " + item.getName() + ".");
		for (Player p2 : players) {
			if (p2 == luckyPlayer)
				continue;
			p2.getPackets().sendGameMessage("" + luckyPlayer.getDisplayName() + " received: " + item.getAmount() + " " + item.getName() + ".");
		}
	}

	
	@Override
	public Item sendDrop(Player player, Drop drop) {
		Item item = new Item(drop.getItemId());
		player.getInventory().addItemDrop(item.getId(), item.getAmount());
		return item;
	}
	
	@Override
	public boolean isPoisonImmune() {
		return true;
	}

	public RoomReference getReference() {
		return reference;
	}

	public void setReference(RoomReference reference) {
		this.reference = reference;
	}
}
