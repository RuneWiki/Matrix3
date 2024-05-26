package com.rs.game.player.content.surpriseevents;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.executor.GameExecutorManager;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class TeamVsTeam implements SurpriseEvent {
	
	/**
	 * 3 minutes before the event starts.
	 */
	public static final int PREP_MINS = 5;
	/**
	 * Maximum game time.
	 */
	public static final int GAME_MINS = 15;
	
	/**
	 * Blue cape override id.
	 */
	public static final int CAPE_BLUE = 14642;
	/**
	 * Red cape override id.
	 */
	public static final int CAPE_RED = 14641;
	
	
	/**
	 * Combat level requirement to join.
	 */
	public static final int COMBAT_LEVEL_REQ = 70;
	
	/**
	 * Cash for event winner.
	 */
	public static final int REWARD_CASH_FINAL = 3000000;
	/**
	 * Spins for event winner.
	 */
	public static final int REWARD_SPINS_FINAL = 10;
	
	/**
	 * Drop rate modifier.
	 */
	public static final double REWARD_DROP_MOD_PER_KILL = 0.1;
	/**
	 * Cash reward for single kill.
	 */
	public static final int REWARD_CASH_PER_KILL = 50000;
	
	

	/**
	 * Phases...
	 * 0 - Pre-start
	 * 1 - Initializing area
	 * 2 - Accepting players/waiting till game
	 * 3 - Game
	 * 4 - Shutdown
	 */
	private int phase = 0;
	
	/**
	 * Our arena.
	 */
	public EventArena arena;
	/**
	 * Our task.
	 */
	private TimerTask task;
	
	
	/**
	 * When we will start game and end game.
	 */
	private long startTime, endTime;
	
	/**
	 * Our lock
	 */
	private Object lock = new Object();
	
	/**
	 * List of all players.
	 */
	private List<Player> blue = new ArrayList<Player>();
	
	/**
	 * List of all players.
	 */
	private List<Player> red = new ArrayList<Player>();
	
	/**
	 * Our scores.
	 */
	private int scoreRed, scoreBlue;
	
	
	public void start() {
		if (phase != 0)
			return;
		phase = 1;
		GameExecutorManager.fastExecutor.schedule(task = new TimerTask() {
			@Override
			public void run() {
				try {
					if (phase == 2 || phase == 3)
						TeamVsTeam.this.run();
					else if (phase == 4) {
						task.cancel();
						task = null;
						
						GameExecutorManager.slowExecutor.execute(new Runnable() {
							@Override
							public void run() {
								arena.destroy();
								arena = null;
							}
						});
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0L, 1000);
		
		GameExecutorManager.slowExecutor.execute(new Runnable() {
			@Override
			public void run() {
				arena = ArenaFactory.randomEventArena(true);
				arena.create();
				phase = 2;
				timerinit();
			}
		});
	}
	

	private void timerinit() {
		startTime = Utils.currentTimeMillis() + (1000 * 60 * PREP_MINS);
		endTime = startTime + (1000 * 60 * GAME_MINS);
		World.sendNews(null, "Team vs Team event will start in " + PREP_MINS + " minute! Talk to oracle to get there.", World.WORLD_NEWS);
	}
	
	

	private void run() {
		if (phase == 2 && canBegin())
			begin();
		else if (phase == 3 && canEnd())
			end();
	}
	
	private boolean canBegin() {
		synchronized (lock) {
			if (blue.size() < 1 || red.size() < 1)
				return false;
		}
		return Utils.currentTimeMillis() >= startTime;
	}
	
	private void begin() {
		phase = 3;
		synchronized (lock) {
			for (Player player : blue) 
				player.setCanPvp(true);
			for (Player player : red)
				player.setCanPvp(true);
		}
		World.sendNews(null, "Team vs Team event has started!", World.WORLD_NEWS);
	}
	
	private boolean canEnd() {
		synchronized (lock) {
			return Utils.currentTimeMillis() >= endTime || red.size() < 1 || blue.size() < 1;
		}
	}
	
	private void end() {
		phase = 4;
		
		synchronized (lock) {	
			if (scoreBlue == scoreRed) {
				World.sendNews(null, "Team vs Team event has ended in tie. Score: " + scoreBlue, World.WORLD_NEWS);
			}
			else if (scoreBlue > scoreRed) {
				World.sendNews(null, "Team vs Team event has ended, blue team has won! Score: " + scoreBlue + " vs " + scoreRed, World.WORLD_NEWS);
			
				for (Player winner : blue) {
					winner.getSquealOfFortune().giveEarnedSpins(REWARD_SPINS_FINAL);
					winner.getInventory().addItemDrop(995, REWARD_CASH_FINAL);
				}
			}
			else if (scoreRed > scoreBlue) {
				World.sendNews(null, "Team vs Team event has ended, red team has won! Score: " + scoreBlue + " vs " + scoreRed, World.WORLD_NEWS);
			
				for (Player winner : red) {
					winner.getSquealOfFortune().giveEarnedSpins(REWARD_SPINS_FINAL);
					winner.getInventory().addItemDrop(995, REWARD_CASH_FINAL);
				}
			}
			
			List<Player> ps = new ArrayList<Player>();
			ps.addAll(red);
			ps.addAll(blue);
			for (Player player : ps)
				player.getControlerManager().forceStop();
		}
	
	}

	public void forceleave(final Player player) {
		synchronized (lock) {
			player.setCanPvp(false);
			player.stopAll();
			player.reset();
			player.getAppearence().setHidden(false);
			player.getAppearence().setIdentityHide(false);
			player.getAppearence().setForcedCape(-1);
			player.useStairs(-1, Settings.START_PLAYER_LOCATION, 0, 1);
			
			blue.remove(player);
			red.remove(player);
		}
	}
	
	@Override
	public void tryJoin(final Player player) {
		if (phase != 2)
			return;
		
		if (player.getSkills().getCombatLevel() < COMBAT_LEVEL_REQ) {
			player.getPackets().sendGameMessage("You must be at least level " + COMBAT_LEVEL_REQ + " to join this event.");
			return;
		}
		
		final boolean isRed;
		synchronized (lock) {
			int redcmbs = 0, bluecmbs = 0;
			for (Player p : red)
				redcmbs += p.getSkills().getCombatLevelWithSummoning();
			for (Player p : blue)
				bluecmbs += p.getSkills().getCombatLevelWithSummoning();
			
			isRed = redcmbs < bluecmbs;
			
			if (isRed)
				red.add(player);
			else
				blue.add(player);
		}	
		
		
		player.stopAll();
		player.reset();
		player.getAppearence().setHidden(false);
		player.getAppearence().setIdentityHide(true);
		player.getAppearence().setForcedCape(isRed ? CAPE_RED : CAPE_BLUE);
		player.useStairs(-1, arena.randomSpawn(), 0, 1);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				player.getControlerManager().startControler("TeamVsTeamController", TeamVsTeam.this, isRed);
			}
		}, 1);
	}
	
	
	public void inc(boolean red) {
		if (red)
			scoreRed++;
		else
			scoreBlue++;
	}
	
	
	public int getPhase() {
		return phase;
	}
	
	public long startTime() {
		return startTime;
	}
	
	public long endTime() {
		return endTime;
	}
	
	public Object getLock() {
		return lock;
	}
	
	public List<Player> getRed() {
		return red;
	}
	
	public List<Player> getBlue() {
		return blue;
	}
	
	public int blueScore() {
		return scoreBlue;
	}
	
	public int redScore() {
		return scoreRed;
	}
	
	
	public EventArena getArena() {
		return arena;
	}

}
