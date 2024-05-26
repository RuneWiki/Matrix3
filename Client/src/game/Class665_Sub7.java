package game;

/* Class665_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub7 extends Class665 {
	public static final int anInt8919 = 0;
	public static final int anInt8920 = 1;
	public static final int anInt8921 = 2;

	void method7855(int i) {
		volume = i * 2081142341;
	}

	void method7865(int i) {
		volume = i * 2081142341;
	}

	public void method8163(int i) {
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -45) * 2081142341;
	}

	public Class665_Sub7(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	public boolean method8164(byte i) {
		return true;
	}

	public int method7863(int i, int i_0_) {
		return 1;
	}

	void setVolume(int i, byte i_1_) {
		volume = i * 2081142341;
	}

	public int method8165(int i) {
		return -767431539 * volume;
	}

	int method7861() {
		if (aClass572_Sub24_8494.aClass665_Sub30_9205.method9132(-2101560639) && Class548.method6511(aClass572_Sub24_8494.aClass665_Sub30_9205.method9129(1660066034), (byte) -26))
			return 1;
		return 0;
	}

	public int method7862(int i) {
		return 1;
	}

	public void method8166() {
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -18) * 2081142341;
	}

	public int method7857(int i) {
		return 1;
	}

	public int method7864(int i) {
		return 1;
	}

	int method7858(byte i) {
		if (aClass572_Sub24_8494.aClass665_Sub30_9205.method9132(-1056040399) && Class548.method6511(aClass572_Sub24_8494.aClass665_Sub30_9205.method9129(1847658628), (byte) -13))
			return 1;
		return 0;
	}

	public int method7856(int i) {
		return 1;
	}

	public void method8167() {
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -59) * 2081142341;
	}

	public Class665_Sub7(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	public boolean method8168() {
		return true;
	}

	public int method8169() {
		return -767431539 * volume;
	}

	static final void method8170(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (i_2_ & 1 << i_3_) != 0 ? 1 : 0;
	}

	static final void method8171(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (Class637.aBool8266) {
			Class572_Sub8_Sub1.method10279(3, i_4_, i_5_, false, 623786968);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = null != Class554.aFrame6320 ? 1 : 0;
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}
