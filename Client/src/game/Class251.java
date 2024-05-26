package game;

/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class251 implements Interface72 {
	Class248 aClass248_2729;
	Class127 aClass127_2730;
	public static Class572_Sub10 aClass572_Sub10_2731;

	void method3493(int i, int i_0_) {
		((Class251) this).aClass127_2730 = new Class127(i);
	}

	void method3494() {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2234((byte) 55);
		}
	}

	void method3495(int i) {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2231((byte) -30);
		}
	}

	void method3496(int i) {
		((Class251) this).aClass127_2730 = new Class127(i);
	}

	void method3497(int i) {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2234((byte) -48);
		}
	}

	void method3498(int i) {
		((Class251) this).aClass127_2730 = new Class127(i);
	}

	void method3499(int i, short i_1_) {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2235(i, 1476738573);
		}
	}

	void method3500() {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2234((byte) -46);
		}
	}

	Class251(Class248 class248, int i) {
		((Class251) this).aClass248_2729 = class248;
		((Class251) this).aClass127_2730 = new Class127(i);
	}

	void method3501() {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2234((byte) -68);
		}
	}

	void method3502() {
		synchronized (((Class251) this).aClass127_2730) {
			((Class251) this).aClass127_2730.method2234((byte) 99);
		}
	}

	public static String method3503(CharSequence charsequence, PacketsDecoder class207, int i) {
		if (null == charsequence)
			return null;
		int i_2_ = 0;
		int i_3_;
		for (i_3_ = charsequence.length(); (i_2_ < i_3_ && Class345.method4320(charsequence.charAt(i_2_), 1889315238)); i_2_++) {
			/* empty */
		}
		for (/**/; i_3_ > i_2_ && Class345.method4320(charsequence.charAt(i_3_ - 1), -419936610); i_3_--) {
			/* empty */
		}
		int i_4_ = i_3_ - i_2_;
		if (i_4_ < 1 || i_4_ > Class189.method2863(class207, (byte) -18))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_4_);
		for (int i_5_ = i_2_; i_5_ < i_3_; i_5_++) {
			char c = charsequence.charAt(i_5_);
			if (Class8.method526(c, (short) 16383)) {
				char c_6_ = Class125.method2209(c, -1437399538);
				if ('\0' != c_6_)
					stringbuilder.append(c_6_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	public static void method3504(int i, int i_7_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(8, (long) i);
		class572_sub12_sub11.method10384(-1814171560);
	}
}
