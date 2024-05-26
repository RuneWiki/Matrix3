package game;

/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class202 implements Interface18 {
	protected int anInt2402;

	public int method45() {
		return -951433963 * anInt2402;
	}

	public int method113(byte i) {
		return -951433963 * anInt2402;
	}

	Class202(Class437 class437, Class435 class435, int i) {
		anInt2402 = 1062068797 * i;
	}

	static final void method2994(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		class73.anInt774 = 1306580513 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (-1883230751 * class73.anInt774 > 722211665 * class73.anInt802 - 669238293 * class73.anInt764)
			class73.anInt774 = (-392940687 * class73.anInt802 - 1839584437 * class73.anInt764);
		if (class73.anInt774 * -1883230751 < 0)
			class73.anInt774 = 0;
		class73.anInt775 = (-650326201 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]));
		if (-2139739529 * class73.anInt775 > class73.anInt902 * 382019713 - class73.anInt765 * 1360982075)
			class73.anInt775 = (-1817539897 * class73.anInt902 - -727165603 * class73.anInt765);
		if (class73.anInt775 * -2139739529 < 0)
			class73.anInt775 = 0;
		Class555.method6575(class73, (short) 3364);
		if (-1 == class73.activeComponent * -1665128073 && !class83.aBool1079)
			Class639_Sub22.method9025(-1718435171 * class73.selfId, 1448758939);
	}

	static final void method2995(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -1600);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class539.method6402(class73, class83, true, 1, class441, (byte) -35);
	}

	static final void method2996(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 6422);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt762 * 278882041;
	}

	static final void method2997(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class202_Sub1_Sub1.getContainerAmount(i_2_, i_3_, true, (byte) 0);
	}

	static void method2998(Cs2Executor class441, Class574 class574, Exception exception, String string, int i) {
		StringBuilder stringbuilder = new StringBuilder(30);
		stringbuilder.append(new StringBuilder().append(string).append(" ").toString()).append(381237825124074065L * ((Cs2Executor) class441).current.hash).append(" ");
		for (int i_4_ = -1384972465 * ((Cs2Executor) class441).callStackPtr - 1; i_4_ >= 0; i_4_--)
			stringbuilder.append("").append((((Cs2CallPointer) ((Cs2Executor) class441).callStack[i_4_]).script.hash) * 381237825124074065L).append(" ");
		stringbuilder.append("").append(Integer.valueOf(class574.anInt7657 * 797464557));
		Class640.method7592(stringbuilder.toString(), exception, 1808798703);
	}
}
