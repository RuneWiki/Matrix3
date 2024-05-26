package game;

/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class133 {
	public int anInt1566;

	void method2302() {
		/* empty */
	}

	public abstract void method2303(int i);

	void method2304(int i) {
		/* empty */
	}

	boolean method2305(int i) {
		return true;
	}

	Class133(RSByteBuffer class572_sub15) {
		anInt1566 = class572_sub15.readUnsignedShort(647518597) * -1166451145;
	}

	boolean method2306() {
		return true;
	}

	boolean method2307() {
		return true;
	}

	boolean method2308() {
		return true;
	}

	public abstract void method2309();

	static final void method2310(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_0_ = (String) (((Cs2Executor) class441).objectStack[1 + 1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831 != null && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831.aBool5314))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = string_0_;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = string;
	}

	static final void method2311(Cs2Executor class441, short i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class240 class240 = Class240.method3316((float) i_1_, (float) i_1_, (float) i_1_);
		if (-1.0F == class240.aFloat2653)
			class240.aFloat2653 = Float.POSITIVE_INFINITY;
		if (class240.aFloat2656 == -1.0F)
			class240.aFloat2656 = Float.POSITIVE_INFINITY;
		if (class240.aFloat2657 == -1.0F)
			class240.aFloat2657 = Float.POSITIVE_INFINITY;
		Class133_Sub1.aClass411_Sub1_9827.method4976(class240, (short) -718);
		Class133_Sub1.aClass411_Sub1_9827.method4988((float) i_2_ / 1000.0F, (byte) -114);
		class240.method3261();
	}

	static final void method2312(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) -19147);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class539.method6402(class73, class83, false, 2, class441, (byte) 0);
	}

	static void method2313(int i, int i_4_) {
		int i_5_;
		if (0 == i)
			i_5_ = 0;
		else if (i == 1)
			i_5_ = 1;
		else if (2 == i)
			i_5_ = 2;
		else
			return;
		int i_6_;
		if ((double) Class547_Sub1.aFloat6128 == 2.0)
			i_6_ = 0;
		else if (3.0 == (double) Class547_Sub1.aFloat6128)
			i_6_ = 1;
		else if ((double) Class547_Sub1.aFloat6128 == 4.0)
			i_6_ = 2;
		else if ((double) Class547_Sub1.aFloat6128 == 6.0)
			i_6_ = 3;
		else if ((double) Class547_Sub1.aFloat6128 >= 8.0)
			i_6_ = 4;
		else
			return;
		Class579.aClass102_7676 = Class547_Sub1.aClass102ArrayArray8988[i_5_][i_6_];
		Class335_Sub1.aClass284_9695 = Class547_Sub1.aClass284ArrayArray8992[i_5_][i_6_];
	}
}
