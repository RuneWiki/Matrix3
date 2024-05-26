/* TwitchEventChatUserInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import game.Class534;

public class TwitchEventChatUserInfo extends TwitchEvent {
	public String displayName;
	public int userState;
	public int nameColourARGB;
	public boolean ignore;
	public int modes;
	public int subscriptions;

	public TwitchEventChatUserInfo(int i, int i_0_, String string, int i_1_, boolean bool, int i_2_, int i_3_) {
		super(i);
		userState = i_0_;
		displayName = string;
		nameColourARGB = i_1_;
		ignore = bool;
		modes = i_2_;
		subscriptions = i_3_;
	}

	public Class534 method7459() {
		return null;
	}

	public void method7458(int[] is, long[] ls, Object[] objects) {
		/* empty */
	}

	public Class534 method7460() {
		return null;
	}

	public Class534 method7461() {
		return null;
	}

	public Class534 method7462() {
		return null;
	}

	public Class534 method7463() {
		return null;
	}

	public void method7464(int[] is, long[] ls, Object[] objects) {
		/* empty */
	}
}
