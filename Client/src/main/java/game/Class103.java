package game;

/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class103 {
	protected static Class643[] aClass643Array1383;
	static int[] anIntArray1384;

	Class103() {
		/* empty */
	}

	public static void method1642(int i) {
		Class534.aClass83Array5975 = new Class83[Class306.aClass248_3544.method3377(-1778577324)];
		Class572_Sub12_Sub2.aBoolArray11253 = new boolean[Class306.aClass248_3544.method3377(1119230085)];
	}

	public static final int method1643(int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ > 243)
			i_0_ >>= 4;
		else if (i_1_ > 217)
			i_0_ >>= 3;
		else if (i_1_ > 192)
			i_0_ >>= 2;
		else if (i_1_ > 179)
			i_0_ >>= 1;
		return (i_0_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_1_ >> 1);
	}

	static final void method1644(Cs2Executor class441, int i) {
		/* empty */
	}

	static final void method1645(Cs2Executor class441, int i) {
		Class390.method4710((byte) 0);
		Class301.method3994((byte) 20);
		client.aClass613_8605.method7302(-681407594);
		Class623.method7443(-1086906712);
		client.aBool8854 = false;
	}
}
