package game;

/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class520 {
	static boolean aBool5783 = false;
	static final int anInt5784 = 1;
	static final int anInt5785 = 1;
	static int anInt5786;
	static final int anInt5787 = 3;
	static final int anInt5788 = 0;
	static LinkedList aLinkedList5789;
	static final int anInt5790 = 2000;
	static int anInt5791;
	static int anInt5792;
	static int anInt5793;
	static boolean aBool5794;
	static int anInt5795;
	static int anInt5796;
	static int anInt5797;
	static boolean[] aBoolArray5798;
	static String[] aStringArray5799;
	static boolean aBool5800;
	static long aLong5801;
	static long aLong5802;
	static long aLong5803;
	static final int anInt5804 = 2;
	static int anInt5805;
	static boolean aBool5806;
	static TwitchWebcamFrameData aTwitchWebcamFrameData5807;
	static LinkedList aLinkedList5808;
	static final int anInt5809 = 0;
	public static TwitchEventLiveStreams aTwitchEventLiveStreams5810;
	static boolean aBool5811;
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray5812;
	static long aLong5813;
	static final int anInt5814 = 2;
	static float aFloat5815 = 0.2F;
	static boolean aBool5816;
	static Class161 aClass161_5817;

	static void method6170() {
		aBool5811 = false;
		Class386.anIntArray4640 = null;
		Class165.anIntArray2048 = null;
		aLinkedList5808.clear();
		aLinkedList5789.clear();
		Class272_Sub2.aClass106_9517.method2018();
	}

	public static void method6171() {
		anInt5805 = 1921292913;
	}

	public static int method6172() {
		if (aTwitchEventLiveStreams5810 == null || (anInt5805 * 2049710447 >= aTwitchEventLiveStreams5810.streamCount - 1))
			return -1;
		return (anInt5805 += -1921292913) * 2049710447;
	}

	public static int method6173() {
		if (aTwitchEventLiveStreams5810 == null || (anInt5805 * 2049710447 >= aTwitchEventLiveStreams5810.streamCount - 1))
			return -1;
		return (anInt5805 += -1921292913) * 2049710447;
	}

	static void method6174(int i, int i_0_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
		Class534 class534 = twitcheventresult.method7459();
		if (null != class534)
			VarTransmitLevel.method7439(class534.getId(-110505465), twitcheventresult, 2113908428);
	}

	public static void method6175(boolean bool) {
		/* empty */
	}

	public static void method6176(boolean bool) {
		/* empty */
	}

	public static void method6177(boolean bool) {
		/* empty */
	}

	public static void method6178(boolean bool) {
		/* empty */
	}

	public static void method6179(boolean bool) {
		/* empty */
	}

	static void method6180() {
		if (aClass161_5817 == null || aClass161_5817.method2587() != aTwitchWebcamFrameData5807.width || (aClass161_5817.method2588() != aTwitchWebcamFrameData5807.height))
			aClass161_5817 = (Class272_Sub2.aClass106_9517.method1960(aTwitchWebcamFrameData5807.buffer, 0, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.height, false));
		else
			aClass161_5817.method2591(0, 0, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.height, aTwitchWebcamFrameData5807.buffer, 0, aTwitchWebcamFrameData5807.width);
	}

	public static int method6181() {
		if (-1448797863 * anInt5796 == 3)
			return -1;
		if (0 != -1448797863 * anInt5796)
			return anInt5797 * 968849811;
		if (null == aStringArray5799) {
			if (Class589.aString7805.startsWith("mac ")) {
				if (Class589.aString7806.startsWith("ppc")) {
					anInt5796 = -1781605189;
					return -1;
				}
				aStringArray5799 = new String[3];
				aStringArray5799[0] = "sdk-mac-dynamic";
				aStringArray5799[1] = "twitchsdk";
				aStringArray5799[2] = "twitchtv";
				aBoolArray5798 = new boolean[3];
				aBoolArray5798[0] = false;
				aBoolArray5798[1] = false;
				aBoolArray5798[2] = true;
			} else if (Class589.aString7805.startsWith("win")) {
				aStringArray5799 = new String[6];
				aStringArray5799[0] = "avutil-ttv-51";
				aStringArray5799[1] = "libmp3lame-ttv";
				aStringArray5799[2] = "swresample-ttv-0";
				aStringArray5799[5] = "twitchtv";
				if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64")) {
					aStringArray5799[3] = "libmfxsw64";
					aStringArray5799[4] = "twitchsdk_64_release";
				} else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86")) {
					aStringArray5799[3] = "libmfxsw32";
					aStringArray5799[4] = "twitchsdk_32_release";
				} else {
					anInt5796 = -1781605189;
					return -1;
				}
				aBoolArray5798 = new boolean[6];
				aBoolArray5798[0] = true;
				aBoolArray5798[1] = true;
				aBoolArray5798[2] = true;
				aBoolArray5798[3] = false;
				aBoolArray5798[4] = true;
				aBoolArray5798[5] = true;
			} else {
				anInt5796 = -1781605189;
				return -1;
			}
		}
		anInt5796 = 837787369;
		return 0;
	}

	public static int method6182() {
		if (-1448797863 * anInt5796 == 3)
			return -1;
		if (0 != -1448797863 * anInt5796)
			return anInt5797 * 968849811;
		if (null == aStringArray5799) {
			if (Class589.aString7805.startsWith("mac ")) {
				if (Class589.aString7806.startsWith("ppc")) {
					anInt5796 = -1781605189;
					return -1;
				}
				aStringArray5799 = new String[3];
				aStringArray5799[0] = "sdk-mac-dynamic";
				aStringArray5799[1] = "twitchsdk";
				aStringArray5799[2] = "twitchtv";
				aBoolArray5798 = new boolean[3];
				aBoolArray5798[0] = false;
				aBoolArray5798[1] = false;
				aBoolArray5798[2] = true;
			} else if (Class589.aString7805.startsWith("win")) {
				aStringArray5799 = new String[6];
				aStringArray5799[0] = "avutil-ttv-51";
				aStringArray5799[1] = "libmp3lame-ttv";
				aStringArray5799[2] = "swresample-ttv-0";
				aStringArray5799[5] = "twitchtv";
				if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64")) {
					aStringArray5799[3] = "libmfxsw64";
					aStringArray5799[4] = "twitchsdk_64_release";
				} else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86")) {
					aStringArray5799[3] = "libmfxsw32";
					aStringArray5799[4] = "twitchsdk_32_release";
				} else {
					anInt5796 = -1781605189;
					return -1;
				}
				aBoolArray5798 = new boolean[6];
				aBoolArray5798[0] = true;
				aBoolArray5798[1] = true;
				aBoolArray5798[2] = true;
				aBoolArray5798[3] = false;
				aBoolArray5798[4] = true;
				aBoolArray5798[5] = true;
			} else {
				anInt5796 = -1781605189;
				return -1;
			}
		}
		anInt5796 = 837787369;
		return 0;
	}

	public static int method6183() {
		return anInt5796 * -1448797863;
	}

	static int method6184() {
		try {
			for (int i = 0; i < aStringArray5799.length; i++) {
				if (null != aStringArray5799[i] && aBoolArray5798[i])
					Class597.method7040(987634845).method421(aStringArray5799[i], (byte) 36);
			}
		} catch (Exception_Sub7 exception_sub7) {
			return 3;
		}
		Class572_Sub2.aTwitchTV8969 = new TwitchTV();
		int i = Class572_Sub2.aTwitchTV8969.InitialiseTTV(Class260.method3564(-839505981));
		if (i == 0)
			aBool5800 = true;
		else
			Class640.method7592(new StringBuilder().append(10).append(Class3.aString23).append(i).toString(), new RuntimeException(), 1148179057);
		return 2;
	}

	static int method6185() {
		try {
			for (int i = 0; i < aStringArray5799.length; i++) {
				if (null != aStringArray5799[i] && aBoolArray5798[i])
					Class597.method7040(-65057469).method421(aStringArray5799[i], (byte) 62);
			}
		} catch (Exception_Sub7 exception_sub7) {
			return 3;
		}
		Class572_Sub2.aTwitchTV8969 = new TwitchTV();
		int i = Class572_Sub2.aTwitchTV8969.InitialiseTTV(Class260.method3564(-839505981));
		if (i == 0)
			aBool5800 = true;
		else
			Class640.method7592(new StringBuilder().append(10).append(Class3.aString23).append(i).toString(), new RuntimeException(), 895391527);
		return 2;
	}

	public static void method6186() {
		if (aBool5800) {
			int i = Class572_Sub2.aTwitchTV8969.ShutdownTTV();
			if (0 == i) {
				Class572_Sub2.aTwitchTV8969 = null;
				aBool5800 = false;
			}
		}
	}

	public static void method6187() {
		if (aBool5800) {
			int i = Class572_Sub2.aTwitchTV8969.ShutdownTTV();
			if (0 == i) {
				Class572_Sub2.aTwitchTV8969 = null;
				aBool5800 = false;
			}
		}
	}

	public static int method6188() {
		return Class572_Sub2.aTwitchTV8969.GetLoginState();
	}

	public static int method6189() {
		return Class572_Sub2.aTwitchTV8969.GetStreamState();
	}

	Class520() throws Throwable {
		throw new Error();
	}

	public static int method6190() {
		if (!Class672.method7894((byte) -125))
			return 0;
		return anInt5786 * -1732728929;
	}

	public static boolean method6191() {
		return (null != Class572_Sub2.aTwitchTV8969 && Class572_Sub2.aTwitchTV8969.IsStreaming());
	}

	static {
		anInt5792 = 1695470385;
		anInt5793 = 781020960;
		anInt5795 = 0;
		anInt5791 = -901442992;
		anInt5796 = 0;
		anInt5797 = 0;
		aBoolArray5798 = null;
		aStringArray5799 = null;
		aBool5800 = false;
		aLong5801 = 0L;
		aLong5802 = 0L;
		aLong5803 = 0L;
		anInt5786 = 0;
		aBool5811 = false;
		aBool5806 = false;
		aTwitchWebcamFrameData5807 = null;
		aLinkedList5808 = new LinkedList();
		aLinkedList5789 = new LinkedList();
		anInt5805 = 1921292913;
		aTwitchWebcamDeviceArray5812 = null;
		aLong5813 = 0L;
		aClass161_5817 = null;
		aBool5794 = false;
		aBool5816 = false;
	}

	public static boolean method6192() {
		return aBool5811;
	}

	public static boolean method6193() {
		return aBool5811;
	}

	public static int method6194() {
		if (-1448797863 * anInt5796 == 3)
			return -1;
		if (0 != -1448797863 * anInt5796)
			return anInt5797 * 968849811;
		if (null == aStringArray5799) {
			if (Class589.aString7805.startsWith("mac ")) {
				if (Class589.aString7806.startsWith("ppc")) {
					anInt5796 = -1781605189;
					return -1;
				}
				aStringArray5799 = new String[3];
				aStringArray5799[0] = "sdk-mac-dynamic";
				aStringArray5799[1] = "twitchsdk";
				aStringArray5799[2] = "twitchtv";
				aBoolArray5798 = new boolean[3];
				aBoolArray5798[0] = false;
				aBoolArray5798[1] = false;
				aBoolArray5798[2] = true;
			} else if (Class589.aString7805.startsWith("win")) {
				aStringArray5799 = new String[6];
				aStringArray5799[0] = "avutil-ttv-51";
				aStringArray5799[1] = "libmp3lame-ttv";
				aStringArray5799[2] = "swresample-ttv-0";
				aStringArray5799[5] = "twitchtv";
				if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64")) {
					aStringArray5799[3] = "libmfxsw64";
					aStringArray5799[4] = "twitchsdk_64_release";
				} else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86")) {
					aStringArray5799[3] = "libmfxsw32";
					aStringArray5799[4] = "twitchsdk_32_release";
				} else {
					anInt5796 = -1781605189;
					return -1;
				}
				aBoolArray5798 = new boolean[6];
				aBoolArray5798[0] = true;
				aBoolArray5798[1] = true;
				aBoolArray5798[2] = true;
				aBoolArray5798[3] = false;
				aBoolArray5798[4] = true;
				aBoolArray5798[5] = true;
			} else {
				anInt5796 = -1781605189;
				return -1;
			}
		}
		anInt5796 = 837787369;
		return 0;
	}

	public static boolean method6195() {
		return (null != Class572_Sub2.aTwitchTV8969 && Class572_Sub2.aTwitchTV8969.IsStreaming());
	}

	public static int method6196() {
		return Class572_Sub2.aTwitchTV8969.GetChatState();
	}

	public static int method6197() {
		if (-1448797863 * anInt5796 == 3)
			return -1;
		if (0 != -1448797863 * anInt5796)
			return anInt5797 * 968849811;
		if (null == aStringArray5799) {
			if (Class589.aString7805.startsWith("mac ")) {
				if (Class589.aString7806.startsWith("ppc")) {
					anInt5796 = -1781605189;
					return -1;
				}
				aStringArray5799 = new String[3];
				aStringArray5799[0] = "sdk-mac-dynamic";
				aStringArray5799[1] = "twitchsdk";
				aStringArray5799[2] = "twitchtv";
				aBoolArray5798 = new boolean[3];
				aBoolArray5798[0] = false;
				aBoolArray5798[1] = false;
				aBoolArray5798[2] = true;
			} else if (Class589.aString7805.startsWith("win")) {
				aStringArray5799 = new String[6];
				aStringArray5799[0] = "avutil-ttv-51";
				aStringArray5799[1] = "libmp3lame-ttv";
				aStringArray5799[2] = "swresample-ttv-0";
				aStringArray5799[5] = "twitchtv";
				if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64")) {
					aStringArray5799[3] = "libmfxsw64";
					aStringArray5799[4] = "twitchsdk_64_release";
				} else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86")) {
					aStringArray5799[3] = "libmfxsw32";
					aStringArray5799[4] = "twitchsdk_32_release";
				} else {
					anInt5796 = -1781605189;
					return -1;
				}
				aBoolArray5798 = new boolean[6];
				aBoolArray5798[0] = true;
				aBoolArray5798[1] = true;
				aBoolArray5798[2] = true;
				aBoolArray5798[3] = false;
				aBoolArray5798[4] = true;
				aBoolArray5798[5] = true;
			} else {
				anInt5796 = -1781605189;
				return -1;
			}
		}
		anInt5796 = 837787369;
		return 0;
	}

	static void method6198(int i, int i_1_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_1_);
		Class534 class534 = twitcheventresult.method7459();
		if (null != class534)
			VarTransmitLevel.method7439(class534.getId(-731244778), twitcheventresult, -134659097);
	}

	static void method6199(int i, int i_2_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_2_);
		Class534 class534 = twitcheventresult.method7459();
		if (null != class534)
			VarTransmitLevel.method7439(class534.getId(749833018), twitcheventresult, 2034213709);
	}

	static void method6200(int i, int i_3_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_3_);
		Class534 class534 = twitcheventresult.method7459();
		if (null != class534)
			VarTransmitLevel.method7439(class534.getId(-2056740732), twitcheventresult, -2060230103);
	}

	public static int method6201() {
		return (aTwitchWebcamDeviceArray5812 == null ? 0 : aTwitchWebcamDeviceArray5812.length);
	}

	static void method6202() {
		if (aClass161_5817 == null || aClass161_5817.method2587() != aTwitchWebcamFrameData5807.width || (aClass161_5817.method2588() != aTwitchWebcamFrameData5807.height))
			aClass161_5817 = (Class272_Sub2.aClass106_9517.method1960(aTwitchWebcamFrameData5807.buffer, 0, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.height, false));
		else
			aClass161_5817.method2591(0, 0, aTwitchWebcamFrameData5807.width, aTwitchWebcamFrameData5807.height, aTwitchWebcamFrameData5807.buffer, 0, aTwitchWebcamFrameData5807.width);
	}

	static void method6203() {
		aTwitchWebcamDeviceArray5812 = Class572_Sub2.aTwitchTV8969.GetWebcamDevices();
	}

	public static int method6204() {
		return (aTwitchWebcamDeviceArray5812 == null ? 0 : aTwitchWebcamDeviceArray5812.length);
	}

	static void method6205() {
		aBool5811 = false;
		Class386.anIntArray4640 = null;
		Class165.anIntArray2048 = null;
		aLinkedList5808.clear();
		aLinkedList5789.clear();
		Class272_Sub2.aClass106_9517.method2018();
	}

	public static boolean method6206() {
		return aBool5811;
	}

	public static boolean method6207() {
		return aBool5811;
	}

	public static int method6208() {
		return Class572_Sub2.aTwitchTV8969.GetViewerCount();
	}

	public static int method6209() {
		return Class572_Sub2.aTwitchTV8969.GetViewerCount();
	}

	public static boolean method6210() {
		if (Class589.aString7805.startsWith("win"))
			return true;
		return false;
	}

	static void method6211() {
		aBool5811 = false;
		Class386.anIntArray4640 = null;
		Class165.anIntArray2048 = null;
		aLinkedList5808.clear();
		aLinkedList5789.clear();
		Class272_Sub2.aClass106_9517.method2018();
	}

	static final void method6212(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class456_Sub1_Sub2.method10472(class73, class83, class441, 1237428763);
	}

	static final void method6213(Cs2Executor class441, int i) throws Exception_Sub4 {
		Class133_Sub1.aClass411_Sub1_9827.method4974((float) (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) / 1000.0F, 660013632);
	}

	static final void method6214(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) -13814);
		Class83 class83 = Class534.aClass83Array5975[i_4_ >> 16];
		Class109.method2070(class73, class83, class441, (short) 22356);
	}

	public static String method6215(int i, int i_5_) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}
}
