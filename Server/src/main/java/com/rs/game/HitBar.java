package com.rs.game;

import com.rs.game.player.Player;

public abstract class HitBar {
	
	public abstract int getType();
	public abstract int getPercentage();
	
	public int getToPercentage() {
		return getPercentage();
	}
	
	public int getDelay() {
		return 0;
	}
	

	public boolean display(Player player) {
		return true;
	}
}
