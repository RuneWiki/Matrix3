package com.rs.game.npc.dungeonnering;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.combat.impl.dung.YkLagorThunderousCombat;
import com.rs.game.player.Player;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class YkLagorThunderous extends DungeonBoss {

	private static int[][] BROKEN_FLOORS_TILES =
	{
	{ 5, 11 },
	{ 2, 13 },
	{ 10, 11 },
	{ 13, 12 },
	{ 11, 8 },
	{ 11, 6 },
	{ 13, 4 },
	{ 9, 5 },
	{ 10, 3 },
	{ 3, 3 },
	{ 4, 9 },
	{ 7, 4 },
	{ 4, 6 } };
	private static int[][] PILLAR_SAFEZONE =
	{
	{ 1, 6 },
	{ 1, 9 },
	{ 14, 9 },
	{ 14, 6 } };
	private static final Graphics EARTH_QUAKE_GRAPHICS = new Graphics(1551, 10, 20);

	private YkLagorMage[] mysteriousMages;
	private int startCountdown;
	private int nextAttack;

	private boolean loaded;

	public YkLagorThunderous(int id, WorldTile tile, DungeonManager manager, RoomReference reference) {
		super(id, tile, manager, reference);
		setCantInteract(true);
		setCantFollowUnderCombat(true);
		setMages();
		loaded = true;
	}

	private void setMages() {
		int index = 0;
		mysteriousMages = new YkLagorMage[8];
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 7, 3), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 4, 5), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 3, 8), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 4, 11), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 7, 12), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 10, 11), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 11, 8), getManager(), 1);
		mysteriousMages[index++] = new YkLagorMage(this, 11887, getManager().getTile(getReference(), 10, 5), getManager(), 1);
	}

	private final static String[] QUOTES =
	{ "We will break you!", "You've outlived your use!", "You do not belong here.", "Your soul belongs to us!", "Mah zodas'bakh me'ah." };
	private final static int[] QUOTES_SOUNDS =
	{ 1899, 1903, 1902, 1901, 1900 };

	public YkLagorMage[] getMages() {
		return mysteriousMages;
	}

	@Override
	public void processNPC() {
		if (!loaded)
			return;
		if (isCantInteract()) {
			if (startCountdown > 0) {
				startCountdown--;
				if (startCountdown == 0) {
					YkLagorThunderousCombat.sendMagicalAttack(this, true);
					getCombat().setCombatDelay(5);
					setCantInteract(false);
					mysteriousMages = null;
				}
				return;
			}
			int distractedMages = 0;
			for (YkLagorMage mage : mysteriousMages) {
				if (mage.isUnderCombat() || mage.isDead() || mage.hasFinished())
					distractedMages++;
			}
			if (distractedMages >= 4 && Utils.random(5) == 0) {
				setNextAnimation(new Animation(14443));
				setNextGraphics(new Graphics(166));
				setNextForceTalk(new ForceTalk("MY TURN!"));
				playSoundEffect(1935);
				playMusic();
				startCountdown = 10;
				return;
			}
			setNextAnimation(new Animation(14442));
			setNextGraphics(new Graphics(165));
			if (Utils.random(33) == 0 && !getPossibleTargets().isEmpty()) {
				YkLagorMage mage = mysteriousMages[Utils.random(mysteriousMages.length)];
				if (mage.isUnderCombat() || mage.isDead() || mage.hasFinished())
					return;
				int index = Utils.random(QUOTES.length);
				mage.setNextForceTalk(new ForceTalk(QUOTES[index]));
				mage.playSoundEffect(QUOTES_SOUNDS[index]);
			}

			return;
		}
		super.processNPC();
	}

	public void playMusic() {
		for (Player player : getManager().getParty().getTeam()) {
			if (player.isDead() || !getManager().isAtBossRoom(player))
				continue;
			player.getMusicsManager().forcePlayMusic(863);
		}
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.6;
	}

	/* public ArrayList<Entity> getPossibleTargets(boolean special, boolean npc) {
	ArrayList<Entity> possibleTargets = super.getPossibleTargets(npc, true);
	if (special) {
	    for (int index = 0; index < PILLAR_SAFEZONE.length; index++) {
		WorldTile tile = getManager().getTile(getReference(), PILLAR_SAFEZONE[index][0], PILLAR_SAFEZONE[index][1]);
		for (Entity t : possibleTargets) {
		    if (t.getX() == tile.getX() && t.getY() == tile.getY())
			possibleTargets.remove(t);
		}
	    }
	}
	return possibleTargets;
	}*/

	public void sendBrokenFloor() {
		for (int index = 0; index < BROKEN_FLOORS_TILES.length; index++) {
			WorldTile tile = getManager().getTile(getReference(), BROKEN_FLOORS_TILES[index][0], BROKEN_FLOORS_TILES[index][1]);
			World.sendGraphics(this, EARTH_QUAKE_GRAPHICS, tile);
		}
	}

	public int getNextAttack() {
		return nextAttack;
	}

	public void increaseNextAttack(int nextAttack) {
		this.nextAttack += nextAttack;
	}

	public static boolean isBehindPillar(Player player, DungeonManager manager, RoomReference rRef) {
		for (int index = 0; index < PILLAR_SAFEZONE.length; index++) {
			WorldTile tile = manager.getTile(rRef, PILLAR_SAFEZONE[index][0], PILLAR_SAFEZONE[index][1]);
			if (player.getX() == tile.getX() && player.getY() == tile.getY())
				return true;
		}
		return false;
	}
}
