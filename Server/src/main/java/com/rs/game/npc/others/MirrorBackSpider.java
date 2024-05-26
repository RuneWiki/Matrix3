package com.rs.game.npc.others;

import com.rs.game.Animation;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class MirrorBackSpider extends NPC {

	private Entity owner;

	public MirrorBackSpider(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, true);
	}

	public void setOwner(Entity owner) {
		this.owner = owner;
		playAnimation();
	}

	@Override
	public void processNPC() {
		if (owner == null) {
			finish();
			return;
		} else if (owner.isDead() || owner.hasFinished()) {
			owner.getEffectsManager().removeEffect(EffectType.MIRRORBACK_SPIDER);
			return;
		} else if (!withinDistance(owner, 12)) {
			setNextWorldTile(owner);
			return;
		} else if (!getCombat().process())
			sendFollow();
	}

	private void sendFollow() {
		if (getLastFaceEntity() != owner.getClientIndex())
			setNextFaceEntity(owner);
		if (isBound() || isStunned())
			return;
		int size = getSize();
		int targetSize = owner.getSize();
		if (Utils.colides(getX(), getY(), size, owner.getX(), owner.getY(), targetSize) && !owner.hasWalkSteps()) {
			resetWalkSteps();
			if (!addWalkSteps(owner.getX() + targetSize, getY())) {
				resetWalkSteps();
				if (!addWalkSteps(owner.getX() - size, getY())) {
					resetWalkSteps();
					if (!addWalkSteps(getX(), owner.getY() + targetSize)) {
						resetWalkSteps();
						if (!addWalkSteps(getX(), owner.getY() - size)) {
							return;
						}
					}
				}
			}
			return;
		}
		resetWalkSteps();
		if (!clipedProjectile(owner, true) || !Utils.isOnRange(getX(), getY(), size, owner.getX(), owner.getY(), targetSize, 0))
			calcFollow(owner, 2, true, false);
	}

	private void playAnimation() {
		setNextAnimation(new Animation(24054));
		setNextGraphics(new Graphics(4982));
	}
}
