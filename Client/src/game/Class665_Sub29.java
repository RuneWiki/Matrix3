package game;

/* Class665_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub29 extends Class665 {
	public int method9119() {
		return volume * -767431539;
	}

	public int method7863(int i, int i_0_) {
		int i_1_ = aClass572_Sub24_8494.method8614((byte) 77).method7908(-1902092819);
		if (i_1_ < 245)
			return 3;
		if (i == -148076679 * Class65.aClass65_683.anInt684 && i_1_ < 500)
			return 3;
		return 1;
	}

	public void method9120(int i) {
		int i_2_ = aClass572_Sub24_8494.method8614((byte) 86).method7908(-1261717375);
		if (i_2_ < 245)
			volume = -1249670755 * Class65.aClass65_681.anInt684;
		if ((-767431539 * volume == Class65.aClass65_683.anInt684 * -148076679) && i_2_ < 500)
			volume = Class65.aClass65_680.anInt684 * -1249670755;
		if (-767431539 * volume < -148076679 * Class65.aClass65_681.anInt684 || (volume * -767431539 > -148076679 * Class65.aClass65_682.anInt684))
			volume = method7858((byte) -71) * 2081142341;
	}

	public int method9121(int i) {
		return volume * -767431539;
	}

	public boolean method9122(int i) {
		int i_3_ = aClass572_Sub24_8494.method8614((byte) 26).method7908(1274163177);
		if (i_3_ < 245)
			return false;
		return true;
	}

	public Class665_Sub29(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	void setVolume(int i, byte i_4_) {
		volume = 2081142341 * i;
	}

	public int method7862(int i) {
		int i_5_ = aClass572_Sub24_8494.method8614((byte) 86).method7908(699729131);
		if (i_5_ < 245)
			return 3;
		if (i == -148076679 * Class65.aClass65_683.anInt684 && i_5_ < 500)
			return 3;
		return 1;
	}

	int method7861() {
		return Class65.aClass65_681.anInt684 * -148076679;
	}

	public void method9123() {
		int i = aClass572_Sub24_8494.method8614((byte) 13).method7908(-119067812);
		if (i < 245)
			volume = -1249670755 * Class65.aClass65_681.anInt684;
		if ((-767431539 * volume == Class65.aClass65_683.anInt684 * -148076679) && i < 500)
			volume = Class65.aClass65_680.anInt684 * -1249670755;
		if (-767431539 * volume < -148076679 * Class65.aClass65_681.anInt684 || (volume * -767431539 > -148076679 * Class65.aClass65_682.anInt684))
			volume = method7858((byte) -13) * 2081142341;
	}

	public int method7856(int i) {
		int i_6_ = aClass572_Sub24_8494.method8614((byte) 72).method7908(894660966);
		if (i_6_ < 245)
			return 3;
		if (i == -148076679 * Class65.aClass65_683.anInt684 && i_6_ < 500)
			return 3;
		return 1;
	}

	public int method7857(int i) {
		int i_7_ = aClass572_Sub24_8494.method8614((byte) 20).method7908(394384696);
		if (i_7_ < 245)
			return 3;
		if (i == -148076679 * Class65.aClass65_683.anInt684 && i_7_ < 500)
			return 3;
		return 1;
	}

	public Class665_Sub29(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	void method7865(int i) {
		volume = 2081142341 * i;
	}

	int method7858(byte i) {
		return Class65.aClass65_681.anInt684 * -148076679;
	}

	public void method9124() {
		int i = aClass572_Sub24_8494.method8614((byte) 119).method7908(-780910401);
		if (i < 245)
			volume = -1249670755 * Class65.aClass65_681.anInt684;
		if ((-767431539 * volume == Class65.aClass65_683.anInt684 * -148076679) && i < 500)
			volume = Class65.aClass65_680.anInt684 * -1249670755;
		if (-767431539 * volume < -148076679 * Class65.aClass65_681.anInt684 || (volume * -767431539 > -148076679 * Class65.aClass65_682.anInt684))
			volume = method7858((byte) -127) * 2081142341;
	}

	public int method7864(int i) {
		int i_8_ = aClass572_Sub24_8494.method8614((byte) 15).method7908(-1252088293);
		if (i_8_ < 245)
			return 3;
		if (i == -148076679 * Class65.aClass65_683.anInt684 && i_8_ < 500)
			return 3;
		return 1;
	}

	public boolean method9125() {
		int i = aClass572_Sub24_8494.method8614((byte) 76).method7908(-1388383542);
		if (i < 245)
			return false;
		return true;
	}

	public boolean method9126() {
		int i = aClass572_Sub24_8494.method8614((byte) 35).method7908(596110932);
		if (i < 245)
			return false;
		return true;
	}

	void method7855(int i) {
		volume = 2081142341 * i;
	}

	public int method9127() {
		return volume * -767431539;
	}

	public static final boolean method9128(String string, String string_9_, String string_10_, String string_11_, byte i) {
		if (null == string || string_10_ == null)
			return false;
		if (string.startsWith("#") || string_10_.startsWith("#"))
			return string.equals(string_10_);
		return string_9_.equals(string_11_);
	}
}
