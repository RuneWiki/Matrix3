package game;

/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39 implements Interface52 {
	static Class39 aClass39_397 = new Class39(0, 0);
	public static Class39 aClass39_398 = new Class39(2, 1);
	static Class39 aClass39_399 = new Class39(1, 2);
	int anInt400;
	public int anInt401;
	public static int anInt402;

	Class39(int i, int i_0_) {
		anInt401 = 1729974335 * i;
		((Class39) this).anInt400 = i_0_ * -1554202607;
	}

	public int method143() {
		return -1561579279 * ((Class39) this).anInt400;
	}

	public int method61() {
		return -1561579279 * ((Class39) this).anInt400;
	}

	public int method45() {
		return -1561579279 * ((Class39) this).anInt400;
	}

	public int method43() {
		return -1561579279 * ((Class39) this).anInt400;
	}

	public int getId(int i) {
		return -1561579279 * ((Class39) this).anInt400;
	}

	static final void method795(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_1_ < i_2_ ? i_1_ : i_2_;
	}

	static final void method796(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -586790413 * Class185.anInt2172 + Class547.anInt6143;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class386.anInt4642 * 1172032773 + Class547.anInt6165;
	}

	static void method797(RSByteBuffer class572_sub15, int i) {
		for (int i_3_ = 0; i_3_ < -1261354053 * Class488.anInt5456; i_3_++) {
			int i_4_ = class572_sub15.readUnsignedSmart(-849409944);
			int i_5_ = class572_sub15.readUnsignedShort(647518597);
			if (i_5_ == 65535)
				i_5_ = -1;
			if (null != Class488.aClass481_Sub1Array5455[i_4_])
				Class488.aClass481_Sub1Array5455[i_4_].anInt5360 = i_5_ * 1687210429;
		}
	}

	public static int method798(CharSequence charsequence, int i) {
		int i_6_ = charsequence.length();
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++)
			i_7_ = (i_7_ << 5) - i_7_ + charsequence.charAt(i_8_);
		return i_7_;
	} // yep see its hashing method

	static final void method799(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (1472719885 * client.anInt8861 == 2 && i_9_ < client.anInt8860 * 681720871)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = client.aClass26Array8863[i_9_].aString211;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}
}
