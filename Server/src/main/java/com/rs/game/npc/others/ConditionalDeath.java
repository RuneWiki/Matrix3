package com.rs.game.npc.others;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;

@SuppressWarnings("serial")
public class ConditionalDeath extends NPC {

	private int[] requiredItems;
	private String deathMessage;
	private boolean checkInventory, lastLegs;

	public ConditionalDeath(int[] requiredItem, String deathMessage, boolean checkInventory, int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		this.requiredItems = requiredItem;
		this.deathMessage = deathMessage;
		this.checkInventory = checkInventory;
	}

	public ConditionalDeath(int requiredItem, String deathMessage, boolean checkInventory, int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		this(new int[]
		{ requiredItem }, deathMessage, checkInventory, id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	public int[] getRequiredItem() {
		return requiredItems;
	}

	private boolean removeItem(Player player) {
		if (!checkInventory)
			return true;
		for (int requiredItem : requiredItems) {
			if (player.getInventory().containsItem(requiredItem, 1)) {
				ItemDefinitions defs = ItemDefinitions.getItemDefinitions(requiredItem);
				if (checkInventory && defs.isStackable())
					player.getInventory().deleteItem(requiredItem, 1);
				return true;
			}
		}
		return false;
	}

	public boolean useHammer(Player player) {
		if (isDead() || !lastLegs)
			return false;
		if (removeItem(player)) {
			if (deathMessage != null)
				player.getPackets().sendGameMessage(deathMessage);
			if (getId() == 14849)
				player.setNextAnimation(new Animation(15845));
			setHitpoints(0);
			super.sendDeath(player);
			lastLegs = false;
			return true;
		}
		return false;
	}

	@Override
	public void processHit(Hit hit) {
		super.processHit(hit);
		if (getHitpoints() < (getMaxHitpoints() * 0.1)) {
			Entity source = hit.getSource();
			if (source instanceof Player) {
				Player player = (Player) source;
				if (!lastLegs) {
					lastLegs = true;
					player.getPackets().sendGameMessage("The " + getName() + " is on its last legs! Finish it quickly!");
				}
				boolean canContinue = player.getSlayerManager().hasLearnedQuickBlows() && checkInventory;
				if (!canContinue) {
					for (int requiredItem : requiredItems) {
						if (player.getEquipment().getWeaponId() == requiredItem || player.getEquipment().getGlovesId() == requiredItem) {
							canContinue = true;
							break;
						}
					}
					if (getName().equalsIgnoreCase("Turoth")) {
						int ammoId = player.getEquipment().getAmmoId();
						if (hit.getLook() == HitLook.RANGE_DAMAGE && (ammoId == 13280 || ammoId == 4160))
							canContinue = true;
					}
				}
				if (canContinue && useHammer(player))
					return;
			}
		}
	}

	@Override
	public void sendDeath(Entity source) {
		setHitpoints(1);
	}
}
