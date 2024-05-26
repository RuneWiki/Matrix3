package game;

/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class285 implements Comparable {
	long aLong3415;
	Object anObject3416;
	Object anObject3417;
	long aLong3418;
	static int anInt3419;

	public boolean method3849(Object object) {
		if (object instanceof Class285)
			return ((Class285) this).anObject3417.equals(((Class285) (Class285) object).anObject3417);
		throw new IllegalArgumentException();
	}

	int method3850(Class285 class285_0_, int i) {
		if (((Class285) this).aLong3415 * -5801544172590749101L < -5801544172590749101L * ((Class285) class285_0_).aLong3415)
			return -1;
		if (-5801544172590749101L * ((Class285) this).aLong3415 > -5801544172590749101L * ((Class285) class285_0_).aLong3415)
			return 1;
		return 0;
	}

	Class285(Object object, Object object_1_) {
		((Class285) this).anObject3416 = object;
		((Class285) this).anObject3417 = object_1_;
	}

	public int method3851() {
		return ((Class285) this).anObject3417.hashCode();
	}

	public int compareTo(Object object) {
		return method3850((Class285) object, 1511266687);
	}

	public boolean method3852(Object object) {
		if (object instanceof Class285)
			return ((Class285) this).anObject3417.equals(((Class285) (Class285) object).anObject3417);
		throw new IllegalArgumentException();
	}

	public int method3853() {
		return ((Class285) this).anObject3417.hashCode();
	}

	public int method3854() {
		return ((Class285) this).anObject3417.hashCode();
	}

	public boolean equals(Object object) {
		if (object instanceof Class285)
			return ((Class285) this).anObject3417.equals(((Class285) (Class285) object).anObject3417);
		throw new IllegalArgumentException();
	}

	public int hashCode() {
		return ((Class285) this).anObject3417.hashCode();
	}

	static void method3855(int i) {
		Class298.aClass102_3481 = null;
		Class512.aClass102_5703 = null;
		Class1.aClass102_16 = null;
		Class1.aClass161Array11 = null;
		Class572_Sub40.aClass161Array9402 = null;
		Class409.aClass161Array4784 = null;
		Class481.aClass161Array5362 = null;
		Class628_Sub1.aClass161Array9537 = null;
		Class14.aClass161Array123 = null;
		Class121.aClass161_1478 = null;
		Class458.aClass161_5208 = null;
		Class80.aClass161Array1075 = null;
	}

	static final void method3856(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) -15027);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class342_Sub1.method9245(class73, class83, class441, (byte) 15);
	}

	static final void method3857(Cs2Executor class441, int i) {
		throw new RuntimeException("");
	}

	static final void method3858(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		UnderlayDefinition underlayDefinition;
		if (((Cs2Executor) class441).aBool5128)
			underlayDefinition = ((Cs2Executor) class441).aClass443_5112;
		else
			underlayDefinition = ((Cs2Executor) class441).aClass443_5126;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = underlayDefinition.method5285((((Cs2Executor) class441).entity.aClass83_11622), i_3_, i_4_, (byte) -86) ? 1 : 0;
	}

	public static final void method3859(Class456_Sub1 class456_sub1, int i, boolean bool, byte i_5_) {
		Class133_Sub4.method9341(class456_sub1, i, true, bool, 321226140);
	}
}
