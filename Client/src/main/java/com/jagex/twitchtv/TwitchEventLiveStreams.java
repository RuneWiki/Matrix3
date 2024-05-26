/* TwitchEventLiveStreams - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import game.Class534;

public class TwitchEventLiveStreams extends TwitchEvent {
	public int streamCount;
	public String[] channelUrls;
	public String[] previewUrlTemplates;
	public String[] streamTitles;
	public String[] channelDisplayNames;
	public int[] viewerCounts;

	public TwitchEventLiveStreams(int i, int i_0_) {
		super(i);
		streamCount = i_0_;
		if (streamCount > 0) {
			channelUrls = new String[streamCount];
			previewUrlTemplates = new String[streamCount];
			streamTitles = new String[streamCount];
			channelDisplayNames = new String[streamCount];
			viewerCounts = new int[streamCount];
		}
	}

	public void SetStream(int i, String string, String string_1_, String string_2_, String string_3_, int i_4_) {
		if (i >= 0 && i < streamCount) {
			channelUrls[i] = string;
			previewUrlTemplates[i] = string_1_;
			streamTitles[i] = string_2_;
			channelDisplayNames[i] = string_3_;
			viewerCounts[i] = i_4_;
		}
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
