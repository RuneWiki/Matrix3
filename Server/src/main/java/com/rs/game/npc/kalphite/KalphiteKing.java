package com.rs.game.npc.kalphite;

import com.rs.game.Animation;
import com.rs.game.EffectsManager.Effect;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.TimersManager.RecordKey;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class KalphiteKing extends NPC {
	
	/*
	 * What was wrong and what has been done (x)
	 * Asked this to both streamers and a couple of friends who has done kk a lot
	 * 3 attacks then special(x)
	 * start at ANY colour rather then always melee(x)
	 * dig resets the atks to special(x)
	 * 
	 * theres a couple more, but ill fix those later on
	 * 
	 * charge only N, E, S, or W.
	 * 
	 * */
	


	private long lastSwitch;
	private int movesUntilSpecial;
	private int spawnCount;
	private boolean usedImmortality;
	private boolean useStunDartNext;
	private int specialMovesUse;
	private boolean specificSpecial;
	
	public KalphiteKing(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setLureDelay(Integer.MAX_VALUE);
		setRun(true);
		setIntelligentRouteFinder(true);
		start();

	}
	
	//this boss isnt stun imune. exeption
	@Override
	public boolean isStunImmune() {
		return false;
	}
	
	public void resetMovesUntilSpecial() {
		movesUntilSpecial = /*Utils.random(1, 5)*/ 3;
	}
	
	public boolean isSpecificSpecial() {
		return specificSpecial;
	}
	
	public int getSpecialMovesUse() {
		return specialMovesUse;
	}
	
	public void setSpecificSpecial(boolean specificSpecial) {
		this.specificSpecial = specificSpecial;
	}
	
	public void setSpecialMovesUse(int specialMovesUse) {
		this.specialMovesUse = specialMovesUse;
	}
	
	
	@Override
	public void spawn() {
		super.spawn();
		start();
	}
	
	@Override
	public void sendDeath(final Entity source) {
		if(!usedImmortality && Utils.random(100) < 15) { //15% chance using imortality :p
			Entity target = getCombat().getTarget();
			setCantInteract(true);
			resetReceivedHits();
			setHitpoints((int) (getMaxHitpoints() * 0.40));
			usedImmortality = true;
			setNextAnimation(new Animation(19483));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					if(getBossInstance() != null && !getBossInstance().isInstanceReady())
						return;
					setCantInteract(false);
					if(target != null)
						setTarget(target);
				}
				
			}, 7);
			return;
		}
		if(getBossInstance() != null) { //wont save if wasnt active
			for(Player player : getBossInstance().getPlayers()) {
				player.getTimersManager().removeTimer(RecordKey.KALPHITE_KING);
			}
		}
		super.sendDeath(source);
	}
	
	private void start() {
		spawnCount = 0;
		auraTicks = 0;
		usedImmortality = false;
		specialMovesUse = 0;
		specificSpecial = false;
		resetSwitch();
		getOutsideEarth(null);
		resetMovesUntilSpecial();
		setDirection(Utils.getAngle(0, -1));
		addTimer();
	}
	
	public void addTimer() {
		if(getBossInstance() != null) { //removes if player leaves aswell
			for(Player player : getBossInstance().getPlayers())
				player.getTimersManager().sendTimer(); //starts timer
		}
	}
	
	public boolean canSpecial() {
		return movesUntilSpecial == 0;
	}
	
	public void reduceMovesUntilSpecial() {
		if(auraTicks == 0)
			movesUntilSpecial--;
	}
	
	public boolean canSwitch() {
		return lastSwitch + 200 <= Utils.currentWorldCycle();
	}
	
	private void resetSwitch() {
		lastSwitch = Utils.currentWorldCycle();
	}
	
	
	public int getHPPercentage() {
		return getHitpoints() * 100 / getMaxHitpoints();
	}
	@Override
	public void processNPC() {
		if (isDead())
			return;
		if(canSwitch()) 
			switchPhase();
		if((getHPPercentage() < 75 && spawnCount < 1)
				|| (getHPPercentage() < 25 && spawnCount < 2))
			battleCry();
		if(auraTicks == 1) {
			auraTicks = 0;
			if(!attackedSomeone)
				heal(24000);
		}else if (auraTicks > 0){
			auraTicks--;
			setNextGraphics(new Graphics(siphon ? 3737: 3736));
		}
		
		//dmg for being under
		if(!isCantInteract() && this.getCombat().getCombatDelay() == 0) {
			//dmg for being under
			for(Entity t : getPossibleTargets()) {
				if(Utils.colides(this, t)) {
					t.applyHit(new Hit(this, Utils.random(1280)+1, HitLook.REGULAR_DAMAGE));
				}
			}
		}
		
		//kk will remove stun/bound randomly sometimes
		if((isStunned() || isBound()) && Utils.random(7) == 0) {
			getEffectsManager().removeEffect(EffectType.STUNNED);
			getEffectsManager().removeEffect(EffectType.BOUND);
			getEffectsManager().removeEffect(EffectType.BINDING_SHOT);
		}
		
		
		super.processNPC();
	}
	
	private void battleCry() {
		spawnCount++;
		setNextAnimation(new Animation(19462));
		for(Entity t : getPossibleTargets()) { //battle cry
			if(Utils.isOnRange(this, t, 3)) { //if nearby when he uses it u get dmg
				t.applyHit(new Hit(this, Utils.random(1280)+1, HitLook.REGULAR_DAMAGE));
				t.setStunDelay(5); //stuns fo 3 sec
			}
		}
		
		if(getBossInstance() == null)
			return;
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if(!getBossInstance().isInstanceReady())
					return;
				for(int i = 0; i < 6; i++) {
					NPC minion = World.spawnNPC(16706, getBossInstance().getTile(2963+Utils.random(20), 1749 + Utils.random(20), 0), -1, true, true);
					minion.setForceTargetDistance(64);
					minion.setNextAnimation(new Animation(19492));
					minion.setNextGraphics(new Graphics(3748));
					minion.setBossInstance(getBossInstance());
					for(Entity target : minion.getPossibleTargets()) 
						if(Utils.colides(minion, target)) 
							target.applyHit(new Hit(minion, Utils.random(400, 401), HitLook.MELEE_DAMAGE));
				}
			}
			
		}, 5);
	}
	
	
	/*
	 * randomly switches every 2min
	 */
	private void switchPhase() {
		int currentPhase = getCurrentPhase();
		int nextPhase = (currentPhase + Utils.random(2) + 1) % 3;
		setNextNPCTransformation(16697+nextPhase);
		setNextGraphics(new Graphics(nextPhase == 0 ? 3750 : nextPhase == 1 ? 3749 : 3751));
		resetSwitch();
		resetMovesUntilSpecial();
		if(getId() == 16699)
			setUseStunDartNext(true);
	}
	
	public void setUseStunDartNext(boolean useStunDartNext) {
		this.useStunDartNext = useStunDartNext;
	}
	
	public boolean isUseStunDartNext() {
		return useStunDartNext;
	}
	
	public int getCurrentPhase() {
		return getId() - 16697;
	}
	
	@Override
	public void reset() {
		setNPC(16697+Utils.random(3));
		super.reset();
	}
	
	private boolean siphon;
	private int auraTicks;
	private boolean attackedSomeone;
	
	public void useAura() {
		siphon = Utils.random(2) == 1;
		attackedSomeone = false;
		auraTicks = 17;
	}
	
	@Override
	public void handleIngoingHit(Hit hit) {
		if (auraTicks > 0 && siphon)
			hit.setHealHit();
		else{
			Entity source = hit.getSource();
			if(source != null) {
				if(source.getEffectsManager().hasActiveEffect(EffectType.UNLOAD) || source.getEffectsManager().hasActiveEffect(EffectType.FRENZY))
					useBarricade();
			}
		}
		
		super.handleIngoingHit(hit);
	}
	
	private void useBarricade() {
		if(!getEffectsManager().hasActiveEffect(EffectType.BARRICADE))
			getEffectsManager().startEffect(new Effect(EffectType.BARRICADE, 17));
	}
	
	@Override
	public Hit handleOutgoingHit(Hit hit, Entity target) {
		if (auraTicks > 0) {
			attackedSomeone = true;
			if(!siphon)
				heal(hit.getDamage());
		}
		return hit;
	}
	
	public void dig(final Entity target) {
		resetMovesUntilSpecial();
		setNextAnimation(new Animation(19453));
		setNextGraphics(new Graphics(3746));
		setCantInteract(true);
		WorldTasksManager.schedule(new WorldTask() {

			boolean part1 = true;
			
			@Override
			public void run() {
				if(getBossInstance() != null && !getBossInstance().isInstanceReady() || isDead()) {
					stop();
					return;
				}
				if(part1) {
					setFinished(true);
					part1 = false;
				}
				else {
					stop();

					//if instance spawned be sure that the player didnt leave or the boss would tp outside
					//if npc dont make it tp under to be sure it doesnt bug (shouldnt happen anyway)
					if (target instanceof Player && (getBossInstance() == null || getBossInstance().isPlayerInside((Player) target))) {
						WorldTile loc = new WorldTile(target.getX() - (getSize() / 2), target.getY() - (getSize() / 2), target.getPlane());
						if (World.isFloorFree(loc.getPlane(), loc.getX(), loc.getY(), getSize()))
							setLocation(loc);
					}
					setFinished(false);
					getOutsideEarth(target);
				}
			}
		}, 6, 5);
		
	}
	
	private void getOutsideEarth(Entity target) {
		setNextAnimation(new Animation(19451));
		setNextGraphics(new Graphics(3745));
		setCantInteract(true);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if(getBossInstance() != null && !getBossInstance().isInstanceReady())
					return;
				setCantInteract(false);
				if(target != null)
					setTarget(target);
				getCombat().setCombatDelay(5);
				setNextAnimation(new Animation(-1));
				for(Entity target : getPossibleTargets()) {
					if(Utils.colides(KalphiteKing.this, target)) {
						target.applyHit(new Hit(KalphiteKing.this, Utils.random(3000, 5001), HitLook.REGULAR_DAMAGE));
						if(target instanceof Player) 
							target.setNextAnimation(new Animation(10070));
					}
				}
				
			}
			
		}, 5);
	}
	
	
	
	
}
