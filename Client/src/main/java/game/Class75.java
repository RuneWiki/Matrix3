package game;

/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75 implements Interface52 {
	int anInt938;
	static Class75 aClass75_939 = new Class75(2, 0);
	static Class75 aClass75_940;
	public int anInt941;
	public static Class75 aClass75_942 = new Class75(0, 1);
	static int anInt943;

	Class75(int i, int i_0_) {
		anInt941 = i * 820369269;
		((Class75) this).anInt938 = i_0_ * -958567803;
	}

	public int getId(int i) {
		return -66322867 * ((Class75) this).anInt938;
	}

	static {
		aClass75_940 = new Class75(1, 2);
	}

	public int method143() {
		return -66322867 * ((Class75) this).anInt938;
	}

	public int method45() {
		return -66322867 * ((Class75) this).anInt938;
	}

	public int method61() {
		return -66322867 * ((Class75) this).anInt938;
	}

	public int method43() {
		return -66322867 * ((Class75) this).anInt938;
	}

	static final void method1140(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, -1256382056));
		if (1138984625 * class631.anInt8169 >= 0 && class631.anInt8170 * -290938977 >= 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -290938977 * class631.anInt8170;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_1_;
	}

	static final void method1141(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt780 * 449197009;
	}

	public static int method1142(int i) {
		return BaseVarType.aClass412_7963.method5047(-1013775000);
	}
}
