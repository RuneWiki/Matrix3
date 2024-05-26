/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import game.Class534;

public class TwitchEventChatMessage extends TwitchEvent {
	public String name;
	public String message;
	public int nameColourARGB;
	public int modes;
	public int subscriptions;
	public boolean isAction;

	public TwitchEventChatMessage(int i, String string, String string_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		super(i);
		name = string;
		message = string_0_;
		nameColourARGB = i_1_;
		modes = i_2_;
		subscriptions = i_3_;
		isAction = bool;
	}

	public void method7458(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public Class534 method7459() {
		return Class534.aClass534_5970;
	}

	public Class534 method7460() {
		return Class534.aClass534_5970;
	}

	public Class534 method7461() {
		return Class534.aClass534_5970;
	}

	public Class534 method7462() {
		return Class534.aClass534_5970;
	}

	public Class534 method7463() {
		return Class534.aClass534_5970;
	}

	public void method7464(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}
}
