/* TwitchTV - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

public class TwitchTV {
	public static final int anInt218 = 0;
	public static final int anInt219 = 12;
	public static final int anInt220 = 23;
	public static final int anInt221 = 42;
	public static final int anInt222 = 2072;
	public static final int anInt223 = -995;
	public static final int anInt224 = 7;
	public static final int anInt225 = 8;
	public static final int anInt226 = 9;
	public static final int anInt227 = 10;
	public static final int anInt228 = 30;
	public static final int anInt229 = 33;
	public static final int anInt230 = 34;
	public static final int anInt231 = 5;
	public static final int anInt232 = 0;
	public static final int anInt233 = 1;
	public static final int anInt234 = 2;

	public native int InitialiseTTV(String string);

	public native int ShutdownTTV();

	public native int Login(String string, String string_0_);

	public native int Logout();

	public native String GetUsername();

	public native TwitchEvent[] Service();

	public native int GetLoginState();

	public native void SetAuthResponse(String string, int i, String string_1_);

	public native int RequestLiveStreams(String string);

	public native int StartStreaming(int i, int i_2_, int i_3_, int i_4_, boolean bool, float f, int i_5_, boolean bool_6_);

	public native int Pause();

	public native int GetStreamState();

	public native boolean IsStreaming();

	public native boolean IsReadyToStream();

	public native void FlushStreamingEvents();

	public native int StopStreaming();

	public native int RunCommercial();

	public native long GetNextFreeFrameBuffer();

	public native int SubmitFrame(long l, boolean bool, boolean bool_7_, int i, int i_8_);

	public native int SubmitFrameRaw(int[] is, boolean bool, int i, int i_9_);

	public native int[] GetRecommendedSettings(int i, int i_10_, int i_11_, int i_12_, int i_13_, float f, boolean bool);

	public native void SetUserStreamRefreshInterval(int i);

	public native int GetViewerCount();

	public native int SetStreamTitle(String string, String string_14_);

	public native int ChatSendMessage(String string);

	public native int GetChatState();

	public native int GetWebcamState();

	public native int GetWebcamFrameData(int i, TwitchWebcamFrameData twitchwebcamframedata);

	public native int[] GetWebcamFrameResolution(int i);

	public native int StartWebcamDevice(int i, int i_15_);

	public native int StopWebcamDevice(int i);

	public native TwitchWebcamDevice[] GetWebcamDevices();

	public native void RestartWebcamDevice();
}
