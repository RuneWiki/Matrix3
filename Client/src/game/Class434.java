package game;

/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashSet;
import java.util.Set;

public class Class434 implements Interface52 {
	public static Class434 aClass434_5038;
	public static Class434 aClass434_5039;
	static Class434 aClass434_5040;
	int anInt5041;
	static Class434 aClass434_5042;
	public static Class434 aClass434_5043;
	public static Class434 aClass434_5044;
	public static Class434 aClass434_5045;
	static Class434 aClass434_5046;
	public static Class434 aClass434_5047 = new Class434("", 4);
	public static Class434 aClass434_5048;
	static Class434 aClass434_5049;
	Set aSet5050;

	static final void method5250(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.anInt8604 * -1784648141;
	}

	Class434(String string, int i) {
		((Class434) this).aSet5050 = new HashSet();
		((Class434) this).anInt5041 = -1544771803 * i;
	}

	public int method45() {
		return -617669459 * ((Class434) this).anInt5041;
	}

	public int getId(int i) {
		return -617669459 * ((Class434) this).anInt5041;
	}

	public static Class434[] method5251(int i) {
		return new Class434[] { aClass434_5039, aClass434_5040, aClass434_5043, aClass434_5049, aClass434_5044, aClass434_5048, aClass434_5042, aClass434_5046, aClass434_5045, aClass434_5047,
			aClass434_5038 };
	}

	static {
		aClass434_5039 = new Class434("", 3, new Class440[] { Class440.aClass440_5094 });
		aClass434_5040 = new Class434("", 11, new Class440[] { Class440.aClass440_5094 });
		aClass434_5038 = new Class434("", 5, new Class440[] { Class440.aClass440_5094, Class440.aClass440_5096 });
		aClass434_5042 = new Class434("", 8, new Class440[] { Class440.aClass440_5094, Class440.aClass440_5096 });
		aClass434_5043 = new Class434("", 2, new Class440[] { Class440.aClass440_5094, Class440.aClass440_5095 });
		aClass434_5049 = new Class434("", 9, new Class440[] { Class440.aClass440_5094, Class440.aClass440_5095 });
		aClass434_5045 = new Class434("", 1, new Class440[] { Class440.aClass440_5094, Class440.aClass440_5096 });
		aClass434_5046 = new Class434("", 6, new Class440[] { Class440.aClass440_5096 });
		aClass434_5044 = new Class434("", 0, new Class440[] { Class440.aClass440_5096 });
		aClass434_5048 = new Class434("", 10, new Class440[] { Class440.aClass440_5094 });
		method5251(1351167327);
	}

	public int method143() {
		return -617669459 * ((Class434) this).anInt5041;
	}

	public boolean method5252(Class440 class440, int i) {
		return ((Class434) this).aSet5050.contains(class440);
	}

	Class434(String string, int i, Class440[] class440s) {
		((Class434) this).aSet5050 = new HashSet();
		((Class434) this).anInt5041 = -1544771803 * i;
		Class440[] class440s_0_ = class440s;
		for (int i_1_ = 0; i_1_ < class440s_0_.length; i_1_++) {
			Class440 class440 = class440s_0_[i_1_];
			((Class434) this).aSet5050.add(class440);
		}
	}

	public int method61() {
		return -617669459 * ((Class434) this).anInt5041;
	}

	static void method5253(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class122.method2199(Class272_Sub2.aClass106_9517, (short) 17238);
	}

	public int method43() {
		return -617669459 * ((Class434) this).anInt5041;
	}

	static final void method5254(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 2266);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class289_Sub2.method8865(class73, class83, class441, -430187926);
	}
}
