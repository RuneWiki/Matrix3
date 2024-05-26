/* TwitchEventReport - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import game.Class534;

public class TwitchEventReport extends TwitchEvent {
	public String message;

	public TwitchEventReport(int i, String string) {
		super(i);
		message = string;
	}

	public void method7458(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}

	public Class534 method7459() {
		return Class534.aClass534_5971;
	}

	public Class534 method7460() {
		return Class534.aClass534_5971;
	}

	public Class534 method7461() {
		return Class534.aClass534_5971;
	}

	public Class534 method7462() {
		return Class534.aClass534_5971;
	}

	public Class534 method7463() {
		return Class534.aClass534_5971;
	}

	public void method7464(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}
}
