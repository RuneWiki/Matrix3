package game;

/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320 {
	static Class320 aClass320_3890;
	static Class320 aClass320_3891;
	static Class320 aClass320_3892 = new Class320();
	static String aString3893;
	static Class248 aClass248_3894;

	public int method4095(int i, int i_0_, int i_1_) {
		int i_2_ = (Class269.anInt2861 * 1960824389 > i_0_ ? Class269.anInt2861 * 1960824389 : i_0_);
		if (aClass320_3892 == this)
			return 0;
		if (this == aClass320_3890)
			return i_2_ - i;
		if (this == aClass320_3891)
			return (i_2_ - i) / 2;
		return 0;
	}

	public int method4096(int i, int i_3_) {
		int i_4_ = (Class269.anInt2861 * 1960824389 > i_3_ ? Class269.anInt2861 * 1960824389 : i_3_);
		if (aClass320_3892 == this)
			return 0;
		if (this == aClass320_3890)
			return i_4_ - i;
		if (this == aClass320_3891)
			return (i_4_ - i) / 2;
		return 0;
	}

	static {
		aClass320_3891 = new Class320();
		aClass320_3890 = new Class320();
	}

	public int method4097(int i, int i_5_) {
		int i_6_ = (Class269.anInt2861 * 1960824389 > i_5_ ? Class269.anInt2861 * 1960824389 : i_5_);
		if (aClass320_3892 == this)
			return 0;
		if (this == aClass320_3890)
			return i_6_ - i;
		if (this == aClass320_3891)
			return (i_6_ - i) / 2;
		return 0;
	}

	public int method4098(int i, int i_7_) {
		int i_8_ = (Class269.anInt2861 * 1960824389 > i_7_ ? Class269.anInt2861 * 1960824389 : i_7_);
		if (aClass320_3892 == this)
			return 0;
		if (this == aClass320_3890)
			return i_8_ - i;
		if (this == aClass320_3891)
			return (i_8_ - i) / 2;
		return 0;
	}

	public int method4099(int i, int i_9_) {
		int i_10_ = (Class269.anInt2861 * 1960824389 > i_9_ ? Class269.anInt2861 * 1960824389 : i_9_);
		if (aClass320_3892 == this)
			return 0;
		if (this == aClass320_3890)
			return i_10_ - i;
		if (this == aClass320_3891)
			return (i_10_ - i) / 2;
		return 0;
	}

	Class320() {
		/* empty */
	}

	static boolean method4100(int i) {
		if (835742603 * client.anInt8580 != 12)
			return false;
		if (Class574.method6808(-742645076) || Class665_Sub26.method9099(-603674042))
			return false;
		return true;
	}

	public static Class161 method4101(byte i) {
		return Class520.aClass161_5817;
	}

	static void method4102(Class83 class83, InterfaceDefinitions class73, byte i) {
		if (class73 != null) {
			if (-1 != class73.activeComponent * -1665128073) {
				InterfaceDefinitions class73_11_ = class83.method1256(-1604592419 * class73.anInt768, 982891294);
				if (null != class73_11_) {
					if (class73_11_.aClass73Array916 == class73_11_.aClass73Array917) {
						class73_11_.aClass73Array917 = new InterfaceDefinitions[class73_11_.aClass73Array916.length];
						class73_11_.aClass73Array917[class73_11_.aClass73Array917.length - 1] = class73;
						Class432.method5246(class73_11_.aClass73Array916, 0, class73_11_.aClass73Array917, 0, -1665128073 * class73.activeComponent);
						Class432.method5246(class73_11_.aClass73Array916, 1 + class73.activeComponent * -1665128073, class73_11_.aClass73Array917, class73.activeComponent * -1665128073, ((class73_11_.aClass73Array916).length - -1665128073 * class73.activeComponent - 1));
					} else {
						int i_12_ = 0;
						InterfaceDefinitions[] class73s;
						for (class73s = class73_11_.aClass73Array917; (i_12_ < class73s.length && class73s[i_12_] != class73); i_12_++) {
							/* empty */
						}
						if (i_12_ < class73s.length) {
							Class432.method5246(class73s, i_12_ + 1, class73s, i_12_, class73s.length - i_12_ - 1);
							class73s[class73_11_.aClass73Array917.length - 1] = class73;
						}
					}
				}
			} else {
				InterfaceDefinitions[] class73s = class83.method1255((byte) -23);
				int i_13_;
				for (i_13_ = 0; i_13_ < class73s.length && class73 != class73s[i_13_]; i_13_++) {
					/* empty */
				}
				if (i_13_ < class73s.length) {
					Class432.method5246(class73s, i_13_ + 1, class73s, i_13_, class73s.length - i_13_ - 1);
					class73s[class73s.length - 1] = class73;
				}
			}
		}
	}

	static final void method4103(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_14_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_15_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class530_Sub1.getContainerItemId(i_14_, i_15_, true, (byte) 3);
	}

	static final void method4104(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class516.anInt5744 * -1077286783;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1126929967 * Class336.anInt4307;
	}

	static void method4105(int i, int i_16_) {
		Class193.anInt2313 = 1367272153 * i;
		Class193.aClass127_2322.method2231((byte) -68);
	}

	static final void method4106(Cs2Executor class441, byte i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_17_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_18_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_19_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_20_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		Class240 class240 = Class240.method3316((float) i_17_, (float) i_18_, (float) i_19_);
		if (-1.0F == class240.aFloat2653)
			class240.aFloat2653 = Float.POSITIVE_INFINITY;
		if (-1.0F == class240.aFloat2656)
			class240.aFloat2656 = Float.POSITIVE_INFINITY;
		if (class240.aFloat2657 == -1.0F)
			class240.aFloat2657 = Float.POSITIVE_INFINITY;
		Class133_Sub1.aClass411_Sub1_9827.method5024(class240, -50960793);
		Class133_Sub1.aClass411_Sub1_9827.method4974((float) i_20_ / 1000.0F, -815366615);
		class240.method3261();
	}

	static final void method4107(Cs2Executor class441, int i) {
		int i_21_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_21_, (short) -4356);
		Class83 class83 = Class534.aClass83Array5975[i_21_ >> 16];
		Class126.method2218(class73, class83, class441, -308954870);
	}
}
