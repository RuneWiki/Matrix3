package game;

/* Class530_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class530_Sub1 extends Class530 {
	Class530_Sub1(String string, int i, boolean bool, boolean bool_0_) {
		super(string, i, bool, null, bool_0_, null);
	}

	static final void method8371(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 10116);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class124.method2205(class73, class83, class441, 2096520077);
	}

	public static int getContainerItemId(int key, int index, boolean split, byte i_3_) {
		//if (!RS3Applet.HOSTED)
		//	System.out.println("getContainerItemId(" + key + "," + index + "," + split + ")");
		ItemsContainer class572_sub31 = Class447.getContainer(key, split, 70829790);
		if (null == class572_sub31)
			return -1;
		if (index < 0 || index >= ((ItemsContainer) class572_sub31).itemIds.length)
			return -1;
		return ((ItemsContainer) class572_sub31).itemIds[index];
	}
}
