package game;

/* Class665_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub11 extends Class665 {
	static Class490[] aClass490Array8930;
	public static final int anInt8931 = 0;
	public static final int anInt8932 = 1;

	public boolean method8199() {
		return true;
	}

	public int method7864(int i) {
		if (i != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			return 3;
		if (i == 0 || aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) -34) == 1)
			return 1;
		return 2;
	}

	public void method8200(int i) {
		if (0 != -767431539 * volume && aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) -83) != 1)
			volume = 0;
		if (volume * -767431539 != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			volume = 0;
		if (volume * -767431539 < 0 || volume * -767431539 > 1)
			volume = method7858((byte) -123) * 2081142341;
	}

	int method7858(byte i) {
		return 1;
	}

	public boolean method8201(int i) {
		return true;
	}

	public Class665_Sub11(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	void setVolume(int i, byte i_0_) {
		volume = i * 2081142341;
	}

	public boolean method8202() {
		return true;
	}

	int method7861() {
		return 1;
	}

	void method7855(int i) {
		volume = i * 2081142341;
	}

	public int method8203(int i) {
		return volume * -767431539;
	}

	public int method7856(int i) {
		if (i != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			return 3;
		if (i == 0 || aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) -10) == 1)
			return 1;
		return 2;
	}

	public int method7857(int i) {
		if (i != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			return 3;
		if (i == 0 || (aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) 21) == 1))
			return 1;
		return 2;
	}

	void method7865(int i) {
		volume = i * 2081142341;
	}

	public Class665_Sub11(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	public void method8204() {
		if (0 != -767431539 * volume && aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) -26) != 1)
			volume = 0;
		if (volume * -767431539 != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			volume = 0;
		if (volume * -767431539 < 0 || volume * -767431539 > 1)
			volume = method7858((byte) -61) * 2081142341;
	}

	public void method8205() {
		if (0 != -767431539 * volume && (aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) 43) != 1))
			volume = 0;
		if (volume * -767431539 != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			volume = 0;
		if (volume * -767431539 < 0 || volume * -767431539 > 1)
			volume = method7858((byte) -61) * 2081142341;
	}

	public int method7863(int i, int i_1_) {
		if (i != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			return 3;
		if (i == 0 || (aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) 49) == 1))
			return 1;
		return 2;
	}

	public int method7862(int i) {
		if (i != 0 && aClass572_Sub24_8494.aClass665_Sub34_9223.method9173(1824130277) == 2)
			return 3;
		if (i == 0 || (aClass572_Sub24_8494.aClass665_Sub23_9208.method9058((byte) 5) == 1))
			return 1;
		return 2;
	}

	public int method8206() {
		return volume * -767431539;
	}

	static final int[] method8207(String string, Cs2Executor class441, int i) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
			if (i_2_ > 0) {
				is = new int[i_2_];
				while (i_2_-- > 0)
					is[i_2_] = (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
			}
		}
		return is;
	}

	static final void method8208(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6460(i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff);
		if (class572_sub12_sub5 == null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -2130748737 * class572_sub12_sub5.anInt11325;
	}
}
