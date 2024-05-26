package com.rs.net.decoders.handlers;

import java.util.List;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.npc.others.PolyporeCreature;
import com.rs.game.npc.others.Revenant;
import com.rs.game.player.ActionBar.MagicAbilityShortcut;
import com.rs.game.player.Equipment;
import com.rs.game.player.Inventory;
import com.rs.game.player.MoneyPouch;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Firemaking;
import com.rs.game.player.actions.Fletching2;
import com.rs.game.player.actions.Fletching2.FletchData;
import com.rs.game.player.actions.GemCutting;
import com.rs.game.player.actions.HerbCleaning;
import com.rs.game.player.actions.Herblore;
import com.rs.game.player.actions.Smithing;
import com.rs.game.player.actions.TrapAction;
import com.rs.game.player.content.AccessorySmithing;
import com.rs.game.player.content.AncientEffigies;
import com.rs.game.player.content.Consumables;
import com.rs.game.player.content.Dicing;
import com.rs.game.player.content.DragonfireShield;
import com.rs.game.player.content.Drinkables;
import com.rs.game.player.content.Drinkables.Drink;
import com.rs.game.player.content.DwarfMultiCannon;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.FlyingEntityHunter;
import com.rs.game.player.content.FlyingEntityHunter.FlyingEntities;
import com.rs.game.player.content.GodswordCreating;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.ItemTransportation;
import com.rs.game.player.content.Lamps;
import com.rs.game.player.content.LightSource;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.Nest;
import com.rs.game.player.content.OrnamentKits;
import com.rs.game.player.content.PrayerBooks;
import com.rs.game.player.content.Runecrafting;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.Slayer;
import com.rs.game.player.content.SpiritshieldCreating;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.content.TreeSaplings;
import com.rs.game.player.content.WeaponPoison;
import com.rs.game.player.content.prayer.Burying.Bone;
import com.rs.game.player.controllers.Barrows;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.SorceressGarden;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.dialogues.impl.AmuletAttaching;
import com.rs.game.player.dialogues.impl.AttachingOrbsDialouge;
import com.rs.game.player.dialogues.impl.CombinationsD.Combinations;
import com.rs.game.player.dialogues.impl.LeatherCraftingD;
import com.rs.game.player.dialogues.impl.SqirkFruitSqueeze;
import com.rs.game.player.dialogues.impl.SqirkFruitSqueeze.SqirkFruit;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class InventoryOptionsHandler {

	public static void handleItemOption2(final Player player, final int slotId, final int itemId, Item item) {
		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		if (Firemaking.isFiremaking(player, itemId))
			return;
		else if (itemId == 4155)
			player.getSlayerManager().checkKillsLeft();
		else if (itemId == 15262)
			ItemSets.openSkillPack(player, itemId, 12183, 5000, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15362)
			ItemSets.openSkillPack(player, itemId, 230, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15363)
			ItemSets.openSkillPack(player, itemId, 228, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15364)
			ItemSets.openSkillPack(player, itemId, 222, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15365)
			ItemSets.openSkillPack(player, itemId, 9979, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 1225) {
			// player.getPackets().sendInputIntegerScript("What would you like to do when you grow up?");
			// player.getTemporaryAttributtes().put("xformring", Boolean.TRUE);
		}
		else if (itemId >= 5509 && itemId <= 5514) {
			int pouch = -1;
			if (itemId == 5509)
				pouch = 0;
			if (itemId == 5510 || itemId == 5511)
				pouch = 1;
			if (itemId == 5512)
				pouch = 2;
			if (itemId == 5514)
				pouch = 3;
			Runecrafting.emptyPouch(player, pouch);
			player.stopAll(false);
		}
		else if (itemId >= 15086 && itemId <= 15100) {
			Dicing.handleRoll(player, itemId, true);
			return;
		}
		else if (itemId == 6583 || itemId == 7927) {
			AccessorySmithing.ringTransformation(player, itemId);
		}
		else if (item.getDefinitions().containsInventoryOption(1, "Extinguish")) {
			if (LightSource.extinguishSource(player, slotId, false))
				return;
		}
		else {
			handleWear(player, slotId, item);
		}
	}

	public static void handleWear(final Player player, final int slotId, Item item) {
		if (player.isEquipDisabled())
			return;
		if (player.getSwitchItemCache().isEmpty()) {
			player.getSwitchItemCache().add(slotId);
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					List<Integer> slots = player.getSwitchItemCache();
					int[] slot = new int[slots.size()];
					for (int i = 0; i < slot.length; i++)
						slot[i] = slots.get(i);
					player.getSwitchItemCache().clear();
					ButtonHandler.processWear(player, slot);
					player.stopAll(false, true, false);
				}
			});
		}
		else if (!player.getSwitchItemCache().contains(slotId)) {
			player.getSwitchItemCache().add(slotId);
		}
	}

	public static void dig(final Player player) {
		player.resetWalkSteps();
		player.setNextAnimation(new Animation(830));
		player.lock();
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.unlock();
				if (player.getTreasureTrailsManager().useDig())
					return;
				if (Barrows.digIntoGrave(player))
					return;
				if (player.getX() == 3005 && player.getY() == 3376 || player.getX() == 2999 && player.getY() == 3375 || player.getX() == 2996 && player.getY() == 3377 || player.getX() == 2989 && player.getY() == 3378 || player.getX() == 2987 && player.getY() == 3387 || player.getX() == 2984 && player.getY() == 3387) {
					// mole
					player.setNextWorldTile(new WorldTile(1752, 5137, 0));
					player.getPackets().sendGameMessage("You seem to have dropped down into a network of mole tunnels.");
					return;
				}
				else if (player.withinDistance(new WorldTile(2748, 3734, 0), 2)) {
					player.lock();
					player.setNextGraphics(new Graphics(80, 5, 60));
					FadingScreen.fade(player, 1000, new Runnable() {

						@Override
						public void run() {
							player.unlock();
							player.setNextWorldTile(new WorldTile(2696, 10121, 0));
						}
					});
					player.getPackets().sendGameMessage("You fall through the ground into a network of tunnels.");
					return;
				}
				player.getPackets().sendGameMessage("You find nothing.");
			}

		});
	}

	public static void handleItemOption1(final Player player, final int slotId, final int itemId, Item item) {
		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		if (Drinkables.drink(player, item, slotId))
			return;
		player.stopAll(false);
		Pouch sumPouch = Pouch.forId(itemId);
		if (sumPouch != null)
			Summoning.spawnFamiliar(player, sumPouch);
		int leatherIndex = LeatherCraftingD.getIndex(item.getId());
		if (leatherIndex != -1) {
			player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex, false);
			return;
		}
		else if (player.getTreasureTrailsManager().useItem(item, slotId))
			return;
		else if (Consumables.eat(player, slotId, item))
			return;
		else if (AttachingOrbsDialouge.isAttachingOrb(player, item, new Item(AttachingOrbsDialouge.BATTLESTAFF)))
			return;
		else if (itemId == 2574)
			player.getTreasureTrailsManager().useSextant();
		else if (itemId == 1856)
			player.getPackets().sendOpenURL(Settings.HELP_LINK);
		else if (item.getId() == 20667)
			Magic.useVecnaSkull(player);
		else if (item.getId() == 25205) {
			if (Settings.WORLD_ID == 3) {
				player.getPackets().sendGameMessage("You can't set a deposit box in this world.");
				return;
			}
			if (!World.isTileFree(player.getPlane(), player.getX(), player.getY() - 1, 3)) {
				player.getPackets().sendGameMessage("You need clear space outside in order to place a deposit box.");
				return;
			}
			if (player.getControlerManager().getControler() != null && !(player.getControlerManager().getControler() instanceof Wilderness)) {
				player.getPackets().sendGameMessage("You can't set a deposit box here.");
				return;
			}
			player.getInventory().deleteItem(slotId, item);
			player.setNextAnimation(new Animation(832));
			player.lock(1);
			World.spawnObjectTemporary(new WorldObject(73268, 10, 0, player.getX() + 1, player.getY(), player.getPlane()), 3600 * 1000);
		}
		else if (itemId >= 5509 && itemId <= 5514) {
			int pouch = -1;
			if (itemId == 5509)
				pouch = 0;
			if (itemId == 5510)
				pouch = 1;
			if (itemId == 5512)
				pouch = 2;
			if (itemId == 5514)
				pouch = 3;
			Runecrafting.fillPouch(player, pouch);
			return;
		}
		else if (itemId == 952) {// spade
			dig(player);
			return;
		}
		else if (itemId == 10952) {
			if (Slayer.isUsingBell(player))
				return;
		}
		else if (HerbCleaning.clean(player, item, slotId))
			return;
		else if (TrapAction.isTrap(player, new WorldTile(player), itemId))
			return;
		else if (Bone.forId(itemId) != null) {
			Bone.bury(player, slotId);
			return;
		}
		else if (Magic.useTabTeleport(player, itemId))
			return;
		else if (item.getId() == 22370)
			Summoning.openDreadNipSelection(player);
		else if (item.getId() == 7509 || item.getId() == 7510) {
			player.setNextForceTalk(new ForceTalk("Ow! It nearly broke my tooth!"));
			player.getPackets().sendGameMessage("The rock cake resists all attempts to eat it.");
			player.applyHit(new Hit(player, player.getHitpoints() - 10 < 35 ? player.getHitpoints() - 35 < 0 ? 0 : player.getHitpoints() - 35 : 10, HitLook.REGULAR_DAMAGE));

		}
		else if (ItemTransportation.transportationDialogue(player, item, true))
			return;
		else if (Lamps.isSelectable(itemId) || Lamps.isSkillLamp(itemId) || Lamps.isOtherLamp(itemId))
			Lamps.processLampClick(player, slotId, itemId);
		else if (LightSource.lightSource(player, slotId))
			return;
		else if (LightSource.extinguishSource(player, slotId, false))
			return;
		else if (itemId == 299) {
			if (player.withinDistance(Settings.START_PLAYER_LOCATION, 120)) {
				player.getPackets().sendGameMessage("Planting flowers in this area has been disabled.");
				return;
			}
			else if (player.isCanPvp()) {
				player.getPackets().sendGameMessage("You cant plant a seed while doing this action.");
				return;
			}
			else if (World.getStandartObject(player) != null) {
				player.getPackets().sendGameMessage("You can't plant a flower here.");
				return;
			}
			player.setNextAnimation(new Animation(827));
			final WorldObject object = new WorldObject(2980 + Utils.random(8), 10, 0, player.getX(), player.getY(), player.getPlane());
			World.spawnObjectTemporary(object, 25000);
			player.getInventory().deleteItem(299, 1);
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1))
						if (!player.addWalkSteps(player.getX() + 1, player.getY(), 1))
							if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
								if (!player.addWalkSteps(player.getX(), player.getY() - 1, 1))
									return;
					player.getDialogueManager().startDialogue("FlowerPickD", object);
				}
			}, 2);
		}
		else if (itemId == 4251)
			Magic.useEctoPhial(player, item);
		else if (itemId == 15262)
			ItemSets.openSkillPack(player, itemId, 12183, 5000, 1);
		else if (itemId == 15362)
			ItemSets.openSkillPack(player, itemId, 230, 50, 1);
		else if (itemId == 15363)
			ItemSets.openSkillPack(player, itemId, 228, 50, 1);
		else if (itemId == 15364)
			ItemSets.openSkillPack(player, itemId, 222, 50, 1);
		else if (itemId == 15365)
			ItemSets.openSkillPack(player, itemId, 9979, 50, 1);
		else if (Herblore.isRawIngredient(player, itemId))
			return;
		else if (itemId == 2798 || itemId == 3565 || itemId == 3576 || itemId == 19042)
			player.getTreasureTrailsManager().openPuzzle(itemId);
		else if (itemId == 22445)
			player.getDialogueManager().startDialogue("NeemDrupeSqueeze");
		else if (itemId == 1775 || itemId == 23193)
			player.getDialogueManager().startDialogue("GlassBlowingD", itemId == 23193 ? 1 : 0);
		else if (itemId == 22444)
			PolyporeCreature.sprinkleOil(player, null);
		else if (itemId == 550)
			player.getInterfaceManager().sendCentralInterface(270);
		else if (itemId == 24154 || itemId == 24155)
			player.getSquealOfFortune().processItemClick(slotId, itemId, item);
		else if (itemId == AncientEffigies.SATED_ANCIENT_EFFIGY || itemId == AncientEffigies.GORGED_ANCIENT_EFFIGY || itemId == AncientEffigies.NOURISHED_ANCIENT_EFFIGY || itemId == AncientEffigies.STARVED_ANCIENT_EFFIGY)
			player.getDialogueManager().startDialogue("AncientEffigiesD", itemId);
		else if (itemId == 4155)
			player.getDialogueManager().startDialogue("EnchantedGemDialouge", player.getSlayerManager().getCurrentMaster().getNPCId());
		else if (itemId >= 23653 && itemId <= 23658)
			FightKiln.useCrystal(player, itemId);
		else if (itemId == 20124 || itemId == 20123 || itemId == 20122 || itemId == 20121)
			GodswordCreating.attachKeys(player);
		else if (itemId == 6)
			DwarfMultiCannon.setUp(player);
		else if (itemId == 15707)
			player.getDungManager().openPartyInterface();
		else if (Nest.isNest(itemId))
			Nest.searchNest(player, slotId);
		else if (itemId == 14057) // broomstick
			player.setNextAnimation(new Animation(10532));
		else if (itemId == 21776) {
			if (player.getSkills().getLevel(Skills.CRAFTING) < 77) {
				player.getPackets().sendGameMessage("You need a Crafting level of at least 77 in order to combine the shards.");
				return;
			}
			else if (player.getInventory().containsItem(itemId, 100)) {
				player.setNextAnimation(new Animation(713));
				player.setNextGraphics(new Graphics(1383));
				player.getInventory().deleteItem(new Item(itemId, 100));
				player.getInventory().addItem(new Item(21775, 1));
				player.getSkills().addXp(Skills.CRAFTING, 150);
				player.getPackets().sendGameMessage("You combine the shards into an orb.");
			}
			else {
				player.getPackets().sendGameMessage("You need at least 100 shards in order to create an orb of armadyl.");
			}
		}
		else if (itemId == 5974) {
			if (!player.getInventory().containsItemToolBelt(Smithing.HAMMER)) {
				player.getDialogueManager().startDialogue("SimpleMessage", "You need a hammer in order to break open a coconut.");
				return;
			}
			player.getInventory().addItem(new Item(5976, 1));
			player.getInventory().deleteItem(new Item(5974, 1));
			player.getPackets().sendGameMessage("You smash the coconut with a hammer and it breaks into two symmetrical pieces.");
		}else if (itemId == 24352) 
			player.getDialogueManager().startDialogue("DragonBoneUpgradeKiteInfoD");
		else if (itemId == SqirkFruitSqueeze.SqirkFruit.AUTUMM.getFruitId())
			player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.AUTUMM);
		else if (itemId == SqirkFruitSqueeze.SqirkFruit.SPRING.getFruitId())
			player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.SPRING);
		else if (itemId == SqirkFruitSqueeze.SqirkFruit.SUMMER.getFruitId())
			player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.SUMMER);
		else if (itemId == SqirkFruitSqueeze.SqirkFruit.WINTER.getFruitId())
			player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.WINTER);
		else if (item.getDefinitions().getName().startsWith("Burnt"))
			player.getDialogueManager().startDialogue("SimplePlayerMessage", "Ugh, this is inedible.");
		else if ((item.getDefinitions().containsInventoryOption(0, "Craft") || item.getDefinitions().containsInventoryOption(0, "Fletch") || item.getDefinitions().containsInventoryOption(0, "String")) && SkillsDialogue.selectTool(player, item.getId())) {
			return;
		}
		else
			player.getPackets().sendGameMessage("Nothing interesting happens.");
		if (Settings.DEBUG)
			Logger.log("ItemHandler", "Item option 1:" + itemId + ", Slot Id:" + slotId);
	}

	/*
	 * returns the other
	 */
	public static Item contains(int id1, Item item1, Item item2) {
		if (item1.getId() == id1)
			return item2;
		if (item2.getId() == id1)
			return item1;
		return null;
	}

	public static boolean contains(int id1, int id2, Item... items) {
		boolean containsId1 = false;
		boolean containsId2 = false;
		for (Item item : items) {
			if (item.getId() == id1)
				containsId1 = true;
			else if (item.getId() == id2)
				containsId2 = true;
		}
		return containsId1 && containsId2;
	}

	public static void handleInterfaceOnInterface(final Player player, InputStream stream) {
		
		int usedWithId = stream.readUnsignedShortLE();
		int interface1 = stream.readInt();
		int fromSlot = stream.readUnsignedShort128();
		int itemUsedId = stream.readUnsignedShortLE();
		int toSlot = stream.readUnsignedShortLE();
		int interface2 = stream.readInt();

		int interfaceId = interface1 >> 16;
		int interfaceComponent = interface1 - (interfaceId << 16);
		int interfaceId2 = interface2 >> 16;
		@SuppressWarnings("unused")
		int interface2Component = interface2 - (interfaceId2 << 16);

		if (Settings.DEBUG)
			Logger.log("ItemHandler", "ItemOnItem " + usedWithId + ", " + toSlot + ", " + interfaceId + ", " + interfaceComponent + ", " + fromSlot + ", " + itemUsedId);

		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll();
		if (interfaceId == 1430 && interfaceComponent >= 55 && interfaceComponent <= 229 && (interfaceId2 == Inventory.INVENTORY_INTERFACE || interfaceId2 == Inventory.INVENTORY_INTERFACE_2) && !player.getInterfaceManager().containsInventoryInter()) {
			Item item = player.getInventory().getItem(toSlot);
			if (item == null || item.getId() != usedWithId)
				return;
			player.getActionbar().pushShortcutOnSomething((interfaceComponent - 55) / 13, item);
			return;
		}
		if ((interfaceId == 747 || interfaceId == 662) && (interfaceId2 == Inventory.INVENTORY_INTERFACE || interfaceId2 == Inventory.INVENTORY_INTERFACE_2)) {
			if (player.getFamiliar() != null) {
				player.getFamiliar().setSpecial(true);
				if (player.getFamiliar().getSpecialAttack() == SpecialAttack.ITEM) {
					if (player.getFamiliar().hasSpecialOn())
						player.getFamiliar().submitSpecial(toSlot);
				}
			}
			return;
		}
		if ((interfaceId == Inventory.INVENTORY_INTERFACE || interfaceId == Inventory.INVENTORY_INTERFACE_2) && interfaceId == interfaceId2 && !player.getInterfaceManager().containsInventoryInter()) {
			if (toSlot >= 28 || fromSlot >= 28 || toSlot == fromSlot)
				return;
			Item usedWith = player.getInventory().getItem(toSlot);
			Item itemUsed = player.getInventory().getItem(fromSlot);
			if (itemUsed == null || usedWith == null || itemUsed.getId() != itemUsedId || usedWith.getId() != usedWithId)
				return;
			if (!player.getControlerManager().canUseItemOnItem(itemUsed, usedWith))
				return;
			FletchData fletch = Fletching2.isFletchingCombination(usedWith, itemUsed);
			if (fletch != null) {
				player.getDialogueManager().startDialogue("FletchingD", fletch);
				return;
			}
			int herblore = Herblore.isHerbloreSkill(itemUsed, usedWith);
			if (herblore > -1) {
				player.getDialogueManager().startDialogue("HerbloreD", herblore, itemUsed, usedWith);
				return;
			}
			int leatherIndex = LeatherCraftingD.getIndex(itemUsedId) == -1 ? LeatherCraftingD.getIndex(usedWithId) : LeatherCraftingD.getIndex(itemUsedId);
			if (leatherIndex != -1 && ((itemUsedId == 1733 || usedWithId == 1733) || LeatherCraftingD.isExtraItem(usedWithId) || LeatherCraftingD.isExtraItem(itemUsedId))) {
				player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex, false);
				return;
			}
			Combinations combination = Combinations.isCombining(itemUsedId, usedWithId);
			if (combination != null) {
				player.getDialogueManager().startDialogue("CombinationsD", combination);
				return;
			}
			else if (Firemaking.isFiremaking(player, itemUsed, usedWith))
				return;
			else if (OrnamentKits.attachKit(player, itemUsed, usedWith, fromSlot, toSlot))
				return;
			else if (AmuletAttaching.isAttaching(itemUsedId, usedWithId))
				player.getDialogueManager().startDialogue("AmuletAttaching");
			else if (GemCutting.isCutting(player, itemUsed, usedWith))
				return;
			else if (AttachingOrbsDialouge.isAttachingOrb(player, itemUsed, usedWith))
				return;
			else if (TreeSaplings.hasSaplingRequest(player, itemUsedId, usedWithId)) {
				if (itemUsedId == 5354)
					TreeSaplings.plantSeed(player, usedWithId, fromSlot);
				else
					TreeSaplings.plantSeed(player, itemUsedId, toSlot);
			}
			else if (Drinkables.mixPot(player, itemUsed, usedWith, fromSlot, toSlot, true) != -1)
				return;
			else if (WeaponPoison.poison(player, itemUsed, usedWith, false))
				return;
			else if (PrayerBooks.isGodBook(itemUsedId, false) || PrayerBooks.isGodBook(usedWithId, false)) {
				PrayerBooks.bindPages(player, itemUsed.getName().contains(" page ") ? usedWithId : itemUsedId);
			}
			else if (contains(22498, 554, itemUsed, usedWith) || contains(22498, 22448, itemUsed, usedWith)) {
				if (player.getSkills().getLevel(Skills.FARMING) < 80) {
					player.getPackets().sendGameMessage("You need a Farming level of 80 in order to make a polypore staff.");
					return;
				}
				else if (!player.getInventory().containsItem(22448, 3000)) {
					player.getPackets().sendGameMessage("You need 3,000 polypore spores in order to make a polypore staff.");
					return;
				}
				else if (!player.getInventory().containsItem(554, 15000)) {
					player.getPackets().sendGameMessage("You need 15,000 fire runes in order to make a polypore staff.");
					return;
				}
				player.setNextAnimation(new Animation(15434));
				player.lock(2);
				player.getInventory().deleteItem(554, 15000);
				player.getInventory().deleteItem(22448, 3000);
				player.getInventory().deleteItem(22498, 1);
				player.getInventory().addItem(22494, 1);
				player.getPackets().sendGameMessage("You attach the polypore spores and infuse the fire runes to the stick in order to create a staff.");
			}
			else if (contains(22496, 22448, itemUsed, usedWith)) {
				if (player.getSkills().getLevel(Skills.FARMING) < 80) {
					player.getPackets().sendGameMessage("You need a Farming level of 80 in order to recharge polypore staff.");
					return;
				}
				int charges = 3000 - player.getCharges().getCharges(22496);
				if (!player.getInventory().containsItem(22448, charges)) {
					player.getPackets().sendGameMessage("You need " + charges + " polypore spores in order to recharge polypore staff.");
					return;
				}
				player.setNextAnimation(new Animation(15434));
				player.lock(2);
				player.getInventory().deleteItem(22448, charges);
				player.getInventory().deleteItem(22496, 1);
				player.getCharges().resetCharges(22496);
				player.getInventory().addItem(22494, 1);
				player.getPackets().sendGameMessage("You attach the polypore spores to the staff.");
			}
			else if (contains(11710, 11712, itemUsed, usedWith) || contains(11710, 11714, itemUsed, usedWith) || contains(11712, 11714, itemUsed, usedWith))
				GodswordCreating.joinPieces(player, false);
			else if (Slayer.createSlayerHelmet(player, itemUsedId, usedWithId))
				return;
			else if (itemUsedId == 23191 || usedWithId == 23191) {
				Drink pot = Drinkables.getDrink(itemUsedId == 23191 ? usedWithId : itemUsedId);
				if (pot == null)
					return;
				player.getDialogueManager().startDialogue("FlaskDecantingD", pot);
			}
			else if (contains(11690, 11702, itemUsed, usedWith))
				GodswordCreating.attachHilt(player, 0);
			else if (contains(11690, 11704, itemUsed, usedWith))
				GodswordCreating.attachHilt(player, 1);
			else if (contains(11690, 11706, itemUsed, usedWith))
				GodswordCreating.attachHilt(player, 2);
			else if (contains(11690, 11708, itemUsed, usedWith))
				GodswordCreating.attachHilt(player, 3);
			else if (contains(SpiritshieldCreating.HOLY_ELIXIR, SpiritshieldCreating.SPIRIT_SHIELD, itemUsed, usedWith))
				player.getPackets().sendGameMessage("The shield must be blessed at an altar.");
			else if (contains(SpiritshieldCreating.SPIRIT_SHIELD, 13746, itemUsed, usedWith) || contains(SpiritshieldCreating.SPIRIT_SHIELD, 13748, itemUsed, usedWith) || contains(SpiritshieldCreating.SPIRIT_SHIELD, 13750, itemUsed, usedWith) || contains(SpiritshieldCreating.SPIRIT_SHIELD, 13752, itemUsed, usedWith))
				player.getPackets().sendGameMessage("You need a blessed spirit shield to attach the sigil to.");
			else if (contains(SqirkFruitSqueeze.SqirkFruit.AUTUMM.getFruitId(), Herblore.PESTLE_AND_MORTAR, itemUsed, usedWith))
				player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.AUTUMM);
			else if (contains(SqirkFruitSqueeze.SqirkFruit.SPRING.getFruitId(), Herblore.PESTLE_AND_MORTAR, itemUsed, usedWith))
				player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.SPRING);
			else if (contains(SqirkFruitSqueeze.SqirkFruit.SUMMER.getFruitId(), Herblore.PESTLE_AND_MORTAR, itemUsed, usedWith))
				player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.SUMMER);
			else if (contains(SqirkFruitSqueeze.SqirkFruit.WINTER.getFruitId(), Herblore.PESTLE_AND_MORTAR, itemUsed, usedWith))
				player.getDialogueManager().startDialogue("SqirkFruitSqueeze", SqirkFruit.WINTER);
			else if (contains(5976, 229, itemUsed, usedWith)) {
				player.getInventory().deleteItem(new Item(5976, 1));
				player.getInventory().deleteItem(new Item(229, 1));
				player.getInventory().addItem(new Item(Herblore.COCONUT_MILK, 1));
				player.getInventory().addItem(new Item(5978, 1));
				player.getPackets().sendGameMessage("You pour the milk of the coconut into a vial.");
			}
			else if (contains(4151, 21369, itemUsed, usedWith)) {
				if (!player.getSkills().hasRequiriments(Skills.ATTACK, 75, Skills.SLAYER, 80)) {
					player.getPackets().sendGameMessage("You need an attack level of 75 and slayer level of 80 in order to attach the whip vine to the whip.");
					return;
				}
				player.getInventory().replaceItem(21371, 1, toSlot);
				player.getInventory().deleteItem(fromSlot, itemUsed);
				player.getPackets().sendGameMessage("You attach the whip vine to the abbysal whip.");
			}
			else if (contains(985, 987, itemUsed, usedWith)) { // crystal key
				// make
				player.getInventory().deleteItem(toSlot, usedWith);
				itemUsed.setId(989);
				player.getInventory().refresh(fromSlot);
				player.getPackets().sendGameMessage("You join the two halves of the key together.");
			}
			else
				player.getPackets().sendGameMessage("Nothing interesting happens.");
			if (Settings.DEBUG)
				Logger.log("ItemHandler", "Used:" + itemUsed.getId() + ", With:" + usedWith.getId());
		}
		else if ((interfaceId == 1461 && interfaceComponent == 1) && (interfaceId2 == Inventory.INVENTORY_INTERFACE || interfaceId2 == Inventory.INVENTORY_INTERFACE_2) && !player.getInterfaceManager().containsInventoryInter()) {
			if (toSlot >= 28)
				return;
			Item item = player.getInventory().getItem(toSlot);
			if (item == null || item.getId() != usedWithId)
				return;
			player.getActionbar().useAbility(new MagicAbilityShortcut(fromSlot), item);
			//Magic.handleSpellOnItem(player, fromSlot, (byte) toSlot);
		}
	}

	public static void handleItemOption3(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		FlyingEntities impJar = FlyingEntities.forItem((short) itemId);
		if (impJar != null)
			FlyingEntityHunter.openJar(player, impJar, slotId);
		if (LightSource.lightSource(player, slotId))
			return;
		if (OrnamentKits.splitKit(player, item))
			return;
		if (item.getDefinitions().isBindItem())
			player.getDungManager().bind(item, slotId);
		else if (itemId >= 11095 && itemId <= 11103 && (itemId & 0x1) != 0)
			Revenant.useForinthryBrace(player, item, slotId);
		else if (itemId >= 13281 && itemId <= 13288)
			player.getSlayerManager().checkKillsLeft();
		else if (itemId == 15707)
			Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2603, 1, 0, new WorldTile(3447, 3694, 0), 10, true, Magic.ITEM_TELEPORT);
		else if (itemId == 32151 || itemId == 32152 || itemId == 32153 || itemId == 20767 || itemId == 20769 || itemId == 20771)
			SkillCapeCustomizer.startCustomizing(player, itemId);
		else if (itemId == 24437 || itemId == 24439 || itemId == 24440 || itemId == 24441)
			player.getDialogueManager().startDialogue("FlamingSkull", item, slotId);
		else if (Equipment.getItemSlot(itemId) == Equipment.SLOT_AURA)
			player.getAuraManager().sendTimeRemaining(itemId);
		else if (PrayerBooks.isGodBook(itemId, true))
			PrayerBooks.sermanize(player, itemId);
		else if (itemId == 21371) {
			player.getInventory().replaceItem(4151, 1, slotId);
			player.getInventory().addItem(21369, 1);
			player.getPackets().sendGameMessage("You split the whip vine from the abbysal whip.");
		}
		else if (itemId == 4155) {
			player.getInterfaceManager().sendCentralInterface(1309);
			player.getPackets().sendIComponentText(1309, 37, "List Co-Op Partner");
		}
		else if (itemId == 11694 || itemId == 11696 || itemId == 11698 || itemId == 11700)
			GodswordCreating.dismantleGS(player, item, slotId);
		else if (itemId == 23044 || itemId == 23045 || itemId == 23046 || itemId == 23047)
			player.getDialogueManager().startDialogue("MindSpikeD", itemId, slotId);
		else if (item.getDefinitions().containsOption("Teleport") && ItemTransportation.transportationDialogue(player, item, true))
			return;
		else if (player.getCharges().checkCharges(item))
			return;
		if (Settings.DEBUG)
			System.out.println("Option 3");
	}

	public static void handleItemOption4(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 4");
	}

	public static void handleItemOption5(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 5");
	}

	public static void handleItemOption6(Player player, int slot, int itemId, Item item) {
		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		if (player.getToolbelt().addItem(slot, item))
			return;
		if ((item.getDefinitions().containsOption("Rub") || item.getDefinitions().containsOption("Cabbage-port")) && ItemTransportation.transportationDialogue(player, item, true))
			return;
		else if (Drinkables.emptyPot(player, item, slot))
			return;
		else if (item.getDefinitions().isBindItem())
			player.getDungManager().bind(item, slot);
		else if (itemId == 995) {
			if (player.isCanPvp()) {
				player.getPackets().sendGameMessage("You cannot acess your money pouch within a player-vs-player zone.");
				return;
			}
			player.getMoneyPouch().sendDynamicInteraction(item.getAmount(), false, MoneyPouch.TYPE_POUCH_INVENTORY);
		}
		else if (itemId == 1438)
			Runecrafting.locate(player, 3127, 3405);
		else if (itemId == 1440)
			Runecrafting.locate(player, 3306, 3474);
		else if (itemId == 1442)
			Runecrafting.locate(player, 3313, 3255);
		else if (itemId == 1444)
			Runecrafting.locate(player, 3185, 3165);
		else if (itemId == 1446)
			Runecrafting.locate(player, 3053, 3445);
		else if (itemId == 1448)
			Runecrafting.locate(player, 2982, 3514);
		else if (itemId == 1458)
			Runecrafting.locate(player, 2858, 3381);
		else if (itemId == 1454)
			Runecrafting.locate(player, 2408, 4377);
		else if (itemId == 1452)
			Runecrafting.locate(player, 3060, 3591);
		else if (itemId == 1462)
			Runecrafting.locate(player, 2872, 3020);
		else if (itemId == 14057)
			SorceressGarden.teleportToSocreressGarden(player, true);
		else if (itemId == 21776) {
			if (Herblore.isRawIngredient(player, item.getId()))
				return;
		}
		else if (itemId == 11283)
			DragonfireShield.empty(player);
		else if (itemId == 15492 || itemId == 13263)
			Slayer.dissasembleSlayerHelmet(player, itemId == 15492);
		else if (Slayer.isBlackMask(itemId)) {
			player.getInventory().replaceItem(8921, 1, slot);
			player.getPackets().sendGameMessage("You remove all the charges from the black mask.");
		}
		else
			player.getPackets().sendGameMessage("Nothing interesting happens.");
	}

	public static void handleItemOption7(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.isStunned() || player.getEmotesManager().isDoingEmote())
			return;
		if (!player.getControlerManager().canDropItem(item))
			return;
		player.stopAll(false);
		if (item.getDefinitions().isDestroyItem()) {
			player.getDialogueManager().startDialogue("DestroyItemOption", slotId, item);
			return;
		}
		if (player.getPetManager().spawnPet(itemId, true))
			return;
		if (item.getId() == 707 || item.getId() == 703) {
			player.setNextForceTalk(new ForceTalk("Ow! The " + item.getName().toLowerCase() + " exploded!"));
			int damage = item.getId() == 703 ? 350 : 650;
			player.applyHit(new Hit(player, player.getHitpoints() - damage < 35 ? player.getHitpoints() - 35 < 0 ? 0 : player.getHitpoints() - 35 : damage, HitLook.REGULAR_DAMAGE));
			player.setNextAnimation(new Animation(827));
			player.setNextGraphics(new Graphics(954));
			player.getInventory().deleteItem(slotId, item);
			return;
		}
		player.getInventory().deleteItem(slotId, item);
		if (player.getCharges().degradeCompletly(item))
			return;
		if (player.isBeginningAccount()) {
			World.addGroundItem(item, new WorldTile(player), player, true, 60, 2, 0);
		}
		else if (player.getControlerManager().getControler() instanceof Wilderness && ItemConstants.isTradeable(item))
			World.addGroundItem(item, new WorldTile(player), player, false, -1);
		else
			World.addGroundItem(item, new WorldTile(player), player, true, 60);
		Logger.globalLog(player.getUsername(), player.getSession().getIP(), new String(" has dropped item [ id: " + item.getId() + ", amount: " + item.getAmount() + " ]."));
	}

	public static void handleItemOption8(Player player, int slotId, int itemId, Item item) {
		if (itemId >= 15084 && itemId <= 15100)
			Dicing.handleRoll(player, itemId, true);
		player.getInventory().sendExamine(slotId);
	}
}
