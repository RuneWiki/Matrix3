package game;

/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17 {
	static Class17 aClass17_135;
	static Class17 aClass17_136 = new Class17();
	public static Class161 aClass161_137;

	Class17() {
		/* empty */
	}

	static {
		aClass17_135 = new Class17();
	}

	public static String method672(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		if (Class25.aBool165 || class572_sub12_sub10 == null)
			return "";
		return ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11393;
	}

	static final void method673(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 19363);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class452.method5376(class73, class83, class441, -726241895);
	}

	static final void method674(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 9157);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class289_Sub2.method8865(class73, class83, class441, 144741249);
	}

	static final void method675(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt797 * -1688915011;
	}

	public static Class437 method676(int i, int i_2_) {
		Class437[] class437s = Class494.method5901(-1178839593);
		for (int i_3_ = 0; i_3_ < class437s.length; i_3_++) {
			Class437 class437 = class437s[i_3_];
			if (1002594281 * class437.anInt5076 == i)
				return class437;
		}
		return null;
	}

	static String method677(int i, int i_4_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method678(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub6_9222, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 624389576);
		client.aClass613_8605.method7302(-1935468629);
		Class623.method7443(-2003164843);
		client.aBool8854 = false;
	}
}
