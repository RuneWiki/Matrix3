package game;

/* Class665_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub3 extends Class665 {
	public int method8122(int i) {
		return -767431539 * volume;
	}

	public Class665_Sub3(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	int method7856(int i) {
		return 1;
	}

	int method7858(byte i) {
		return 0;
	}

	int method7863(int i, int i_0_) {
		return 1;
	}

	public Class665_Sub3(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	int method7857(int i) {
		return 1;
	}

	int method7861() {
		return 0;
	}

	int method7862(int i) {
		return 1;
	}

	public int method8123() {
		return -767431539 * volume;
	}

	int method7864(int i) {
		return 1;
	}

	public void method8124(byte i) {
		/* empty */
	}

	void method7865(int i) {
		volume = i * 2081142341;
	}

	void method7855(int i) {
		volume = i * 2081142341;
	}

	public void method8125() {
		/* empty */
	}

	public void method8126() {
		/* empty */
	}

	public int method8127() {
		return -767431539 * volume;
	}

	void setVolume(int i, byte i_1_) {
		volume = i * 2081142341;
	}

	static void method8128(Cs2Executor class441, int i) {
		int i_2_ = Class345.method4318((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), (byte) 101);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_2_;
	}

	static final void method8129(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		client.aShort8849 = (short) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8849 <= 0)
			client.aShort8849 = (short) 256;
		client.aShort8668 = (short) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		if (client.aShort8668 <= 0)
			client.aShort8668 = (short) 320;
	}
}
