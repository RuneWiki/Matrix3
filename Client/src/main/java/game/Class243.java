package game;

/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class243 implements Interface26 {
	Class248 aClass248_2666;
	String aString2667;
	public static Class248 aClass248_2668;

	Class243(Class248 class248, String string) {
		((Class243) this).aClass248_2666 = class248;
		((Class243) this).aString2667 = string;
	}

	public int method136(int i) {
		if (((Class243) this).aClass248_2666.method3405(((Class243) this).aString2667, (byte) 1))
			return 100;
		return 0;
	}

	public Class258 method142(int i) {
		return Class258.aClass258_2782;
	}

	public int method143() {
		if (((Class243) this).aClass248_2666.method3405(((Class243) this).aString2667, (byte) 1))
			return 100;
		return 0;
	}

	public Class258 method144() {
		return Class258.aClass258_2782;
	}

	public Class258 method141() {
		return Class258.aClass258_2782;
	}

	public Class258 method145() {
		return Class258.aClass258_2782;
	}

	static final void method3343(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == 1472719885 * client.anInt8861 && i_0_ < 681720871 * client.anInt8860)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_0_].anInt208 * 1118703299;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static String method3344(int i, int i_1_, boolean bool, short i_2_) {
		if (i_1_ < 2 || i_1_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_1_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_1_);
		int i_3_ = 2;
		int i_4_ = i / i_1_;
		while (0 != i_4_) {
			i_4_ /= i_1_;
			i_3_++;
		}
		char[] cs = new char[i_3_];
		cs[0] = '+';
		for (int i_5_ = i_3_ - 1; i_5_ > 0; i_5_--) {
			int i_6_ = i;
			i /= i_1_;
			int i_7_ = i_6_ - i * i_1_;
			if (i_7_ >= 10)
				cs[i_5_] = (char) (i_7_ + 87);
			else
				cs[i_5_] = (char) (i_7_ + 48);
		}
		return new String(cs);
	}
}
