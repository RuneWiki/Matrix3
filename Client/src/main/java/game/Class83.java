package game;

/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83 {
	public boolean aBool1079;
	InterfaceDefinitions[] aClass73Array1080;
	public InterfaceDefinitions[] aClass73Array1081;

	Class83(boolean bool, InterfaceDefinitions[] class73s) {
		aClass73Array1081 = class73s;
		aBool1079 = bool;
	}

	public InterfaceDefinitions[] method1255(byte i) {
		if (((Class83) this).aClass73Array1080 == null) {
			int i_0_ = aClass73Array1081.length;
			((Class83) this).aClass73Array1080 = new InterfaceDefinitions[i_0_];
			System.arraycopy(aClass73Array1081, 0, ((Class83) this).aClass73Array1080, 0, aClass73Array1081.length);
		}
		return ((Class83) this).aClass73Array1080;
	}

	public InterfaceDefinitions method1256(int i, int i_1_) {
		if (-1718435171 * aClass73Array1081[0].selfId >>> 16 != i >>> 16)
			throw new IllegalArgumentException();
		return aClass73Array1081[i & 0xffff];
	}

	public InterfaceDefinitions[] method1257(int i) {
		return (null == ((Class83) this).aClass73Array1080 ? aClass73Array1081 : ((Class83) this).aClass73Array1080);
	}

	static boolean method1258(int i, int i_2_) {
		return (59 == i || 2 == i || i == 8 || i == 17 || i == 15 || 16 == i || 58 == i);
	}

	static final void method1259(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class296.method3965(class73, class83, class441, -469223998);
	}

	static final void method1260(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class133_Sub17.method9500(string, (byte) -46);
	}

	static final void method1261(Cs2Executor class441, byte i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -13) != Class416.aClass416_4933)
			throw new RuntimeException();
		((Class658_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8932((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 2031183448);
	}

	static final void method1262(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class105.method1657(class73, class441, (byte) -22);
	}

	static void method1263(Cs2Executor class441, int i) {
		Class386 class386 = ((Class386) Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), -345100996));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (null == class386.anIntArray4627 ? 0 : class386.anIntArray4627.length);
	}

	static final void method1264(int i, int[] is, int i_3_) {
		if (Class569.method6760(i, is, -1445532978)) {
			InterfaceDefinitions[] class73s = Class534.aClass83Array5975[i].aClass73Array1081;
			for (int i_4_ = 0; i_4_ < class73s.length; i_4_++) {
				InterfaceDefinitions class73 = class73s[i_4_];
				if (null != class73 && null != class73.aClass663_915)
					class73.aClass663_915.method7799(1373385300);
			}
		}
	}

	static final void method1265(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8734 && !client.aBool8596 ? 1 : 0;
	}
}
