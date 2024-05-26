package game;

/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class423 {
	Class411 aClass411_4989;

	Class423(Class411 class411) {
		((Class423) this).aClass411_4989 = class411;
	}

	public abstract void method5142(float f, int[][][] is, Class274 class274, int i, int i_0_, int i_1_);

	public abstract float method5143();

	public abstract double[] method5144(int i);

	public abstract boolean method5145(int i);

	public abstract Class572_Sub17 method5146(int i);

	public abstract float method5147(byte i);

	public abstract void method5148(Class403 class403, int i, int i_2_, int i_3_);

	public abstract boolean method5149();

	public abstract void method5150(float f, int[][][] is, Class274 class274, int i, int i_4_);

	public abstract boolean method5151();

	public abstract boolean method5152();

	public abstract float method5153();

	public abstract boolean method5154();

	public abstract Class240 method5155();

	public abstract Class240 method5156();

	public abstract Class572_Sub17 method5157();

	public abstract double[] method5158();

	public abstract Class240 method5159(byte i);

	public abstract Class572_Sub17 method5160();

	public abstract void method5161(Class403 class403, int i, int i_5_);

	public abstract void method5162(RSByteBuffer class572_sub15, byte i);

	public abstract double[] method5163();

	public abstract double[] method5164();

	public abstract void method5165(Class403 class403, int i, int i_6_);

	public abstract void method5166(RSByteBuffer class572_sub15);

	public abstract void method5167(RSByteBuffer class572_sub15);

	public static int method5168(int i) {
		if (-1448797863 * Class520.anInt5796 == 3)
			return -1;
		if (0 != -1448797863 * Class520.anInt5796)
			return Class520.anInt5797 * 968849811;
		if (null == Class520.aStringArray5799) {
			if (Class589.aString7805.startsWith("mac ")) {
				if (Class589.aString7806.startsWith("ppc")) {
					Class520.anInt5796 = -1781605189;
					return -1;
				}
				Class520.aStringArray5799 = new String[3];
				Class520.aStringArray5799[0] = "sdk-mac-dynamic";
				Class520.aStringArray5799[1] = "twitchsdk";
				Class520.aStringArray5799[2] = "twitchtv";
				Class520.aBoolArray5798 = new boolean[3];
				Class520.aBoolArray5798[0] = false;
				Class520.aBoolArray5798[1] = false;
				Class520.aBoolArray5798[2] = true;
			} else if (Class589.aString7805.startsWith("win")) {
				Class520.aStringArray5799 = new String[6];
				Class520.aStringArray5799[0] = "avutil-ttv-51";
				Class520.aStringArray5799[1] = "libmp3lame-ttv";
				Class520.aStringArray5799[2] = "swresample-ttv-0";
				Class520.aStringArray5799[5] = "twitchtv";
				if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64")) {
					Class520.aStringArray5799[3] = "libmfxsw64";
					Class520.aStringArray5799[4] = "twitchsdk_64_release";
				} else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86")) {
					Class520.aStringArray5799[3] = "libmfxsw32";
					Class520.aStringArray5799[4] = "twitchsdk_32_release";
				} else {
					Class520.anInt5796 = -1781605189;
					return -1;
				}
				Class520.aBoolArray5798 = new boolean[6];
				Class520.aBoolArray5798[0] = true;
				Class520.aBoolArray5798[1] = true;
				Class520.aBoolArray5798[2] = true;
				Class520.aBoolArray5798[3] = false;
				Class520.aBoolArray5798[4] = true;
				Class520.aBoolArray5798[5] = true;
			} else {
				Class520.anInt5796 = -1781605189;
				return -1;
			}
		}
		Class520.anInt5796 = 837787369;
		return 0;
	}

	static final void method5169(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.exchangeSlots[i_7_].method7006(-1828918008);
	}

	static final void method5170(Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6461(i_8_);
		if (null == class572_sub12_sub5)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub5.location * 323852201;
	}
}
