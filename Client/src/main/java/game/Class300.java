package game;

/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class300 {
	static Class300 aClass300_3485 = new Class300();
	static Class300 aClass300_3486 = new Class300();
	static Class300 aClass300_3487 = new Class300();
	public static Class635_Sub2 aClass635_Sub2_3488;
	public static Class639_Sub13 aClass639_Sub13_3489;

	Class300() {
		/* empty */
	}

	public int method3984(int i, int i_0_) {
		int i_1_ = (-530390519 * Class584.anInt7739 > i_0_ ? -530390519 * Class584.anInt7739 : i_0_);
		if (this == aClass300_3485)
			return 0;
		if (aClass300_3487 == this)
			return i_1_ - i;
		if (this == aClass300_3486)
			return (i_1_ - i) / 2;
		return 0;
	}

	public int method3985(int i, int i_2_) {
		int i_3_ = (-530390519 * Class584.anInt7739 > i_2_ ? -530390519 * Class584.anInt7739 : i_2_);
		if (this == aClass300_3485)
			return 0;
		if (aClass300_3487 == this)
			return i_3_ - i;
		if (this == aClass300_3486)
			return (i_3_ - i) / 2;
		return 0;
	}

	public int method3986(int i, int i_4_, int i_5_) {
		int i_6_ = (-530390519 * Class584.anInt7739 > i_4_ ? -530390519 * Class584.anInt7739 : i_4_);
		if (this == aClass300_3485)
			return 0;
		if (aClass300_3487 == this)
			return i_6_ - i;
		if (this == aClass300_3486)
			return (i_6_ - i) / 2;
		return 0;
	}

	public static void method3987(int i) {
		Class428.aBool5019 = true;
		Class255_Sub1.aString8948 = Class13.aString70;
		Class320.aString3893 = Class13.aString103;
		Class439.method5276(false, (byte) 8);
		Class67.method1054((byte) -105);
		Class428.aClass398Array5010 = null;
		Class41.aClass259_425 = null;
		Class463.method5478(16, 441814015);
	}

	static final void method3988(Cs2Executor class441, short i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) 1611);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class539.method6402(class73, class83, true, 2, class441, (byte) -61);
	}

	static final void method3989(Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_8_, (short) 16163);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1942295757 * class73.anInt784;
	}

	static final void method3990(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_9_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		float f = Class325.method4146(((Cs2Executor) class441).intStack[1 + (((Cs2Executor) class441).intStackPtr * 1369304407)]);
		Class572_Sub12_Sub17 class572_sub12_sub17 = Class133_Sub1.aClass411_Sub1_9827.method4987(i_9_, -325223660);
		if (null == class572_sub12_sub17)
			throw new RuntimeException("");
		if (!(class572_sub12_sub17 instanceof Class572_Sub12_Sub17_Sub1))
			throw new RuntimeException("");
		((Class572_Sub12_Sub17_Sub1) class572_sub12_sub17).method10618(f, 2098295507);
	}

	static final void method3991(Cs2Executor class441, int i) {
		boolean bool = false;
		if (client.aBool8559) {
			try {
				Object object = (Class212.aClass212_2451.method3055((new Object[] { Integer.valueOf(BaseVarType.anInt7965 * -1205417433),
					Boolean.valueOf((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte11820) == 1),
					Integer.valueOf(((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) }), 1612080495));
				if (object != null)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = bool ? 1 : 0;
	}

	public static final void method3992(byte i) {
		client.aBool8783 = true;
	}

	public static void method3993(Class257 class257, int i) {
		Class587.method6962(new Class525(class257), (byte) 0);
	}
}
