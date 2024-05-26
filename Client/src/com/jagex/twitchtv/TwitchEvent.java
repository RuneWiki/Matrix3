/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import game.Class534;

public abstract class TwitchEvent {
	public int eventType;

	public TwitchEvent(int i) {
		eventType = i;
	}

	public abstract void method7458(int[] is, long[] ls, Object[] objects);

	public abstract Class534 method7459();

	public abstract Class534 method7460();

	public abstract Class534 method7461();

	public abstract Class534 method7462();

	public abstract Class534 method7463();

	public abstract void method7464(int[] is, long[] ls, Object[] objects);
}
