package game;

/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166 {
	static Class106 aClass106_2051;

	Class166() throws Throwable {
		throw new Error();
	}

	static void method2673(byte i) {
		if (-28144385 * Class190.anInt2236 > 0) {
			int i_0_ = 0;
			for (int i_1_ = 0; i_1_ < LinkableInt.aStringArray9257.length; i_1_++) {
				if (LinkableInt.aStringArray9257[i_1_].indexOf("--> ") != -1 && ++i_0_ == Class190.anInt2236 * -28144385) {
					Class190.aString2235 = (LinkableInt.aStringArray9257[i_1_].substring(LinkableInt.aStringArray9257[i_1_].indexOf('>') + 2));
					break;
				}
			}
		} else
			Class190.aString2235 = "";
	}

	static final int method2674(int i, int i_2_, byte i_3_) {
		int i_4_ = (Class673.method7909(i - 1, i_2_ - 1, 668680306) + Class673.method7909(i + 1, i_2_ - 1, 976170739) + Class673.method7909(i - 1, 1 + i_2_, -208256699) + Class673.method7909(1 + i, i_2_ + 1, 1657808713));
		int i_5_ = (Class673.method7909(i - 1, i_2_, 906828986) + Class673.method7909(1 + i, i_2_, -522179916) + Class673.method7909(i, i_2_ - 1, -186221618) + Class673.method7909(i, i_2_ + 1, 1317578842));
		int i_6_ = Class673.method7909(i, i_2_, 322481923);
		return i_6_ / 4 + (i_4_ / 16 + i_5_ / 8);
	}

	static final void method2675(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1] = (((Cs2Executor) class441).aClass572_Sub10_5104.method8396((short) -15619)[(((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1])]);
	}

	public static Class195 method2676(byte i) {
		if (Class19.method692(835742603 * client.anInt8580, (byte) 4) || 835742603 * client.anInt8580 == 6)
			return client.aClass195_8632;
		return client.aClass195_8589;
	}

	static final void method2677(Cs2Executor class441, int i) {
		Class285.method3859(((Class456_Sub1) ((Cs2Executor) class441).anInterface65_5117), (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), true, (byte) 68);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[0];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[1];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[2];
	}

	static final void method2678(Cs2Executor class441, int i) {
		Class279.method3766(-2043757278);
	}
}
