package game;

/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class281 implements Interface52 {
	String aString3215;
	static Class281 aClass281_3216;
	int anInt3217;
	static Class281 aClass281_3218;
	static Class281 aClass281_3219 = new Class281("UNCOMPRESSED", 0);
	public static Class248 aClass248_3220;
	static int anInt3221;

	Class281(String string, int i) {
		((Class281) this).aString3215 = string;
		((Class281) this).anInt3217 = i * 1449025725;
	}

	static {
		aClass281_3216 = new Class281("BZIP2", 1);
		aClass281_3218 = new Class281("GZIP", 2);
	}

	public int method45() {
		return ((Class281) this).anInt3217 * 1180736149;
	}

	static Class281[] method3796(int i) {
		return (new Class281[] { aClass281_3218, aClass281_3216, aClass281_3219 });
	}

	public int method43() {
		return ((Class281) this).anInt3217 * 1180736149;
	}

	public int method61() {
		return ((Class281) this).anInt3217 * 1180736149;
	}

	public int getId(int i) {
		return ((Class281) this).anInt3217 * 1180736149;
	}

	public int method143() {
		return ((Class281) this).anInt3217 * 1180736149;
	}

	static boolean method3797(int i, int i_0_) {
		if (18 == i || i == 19 || i == 20 || 21 == i || i == 22 || 1004 == i)
			return true;
		if (i == 17)
			return true;
		return false;
	}

	public static void method3798(InterfaceDefinitions[] class73s, int i) {
		for (int i_1_ = 0; i_1_ < class73s.length; i_1_++) {
			InterfaceDefinitions class73 = class73s[i_1_];
			if (class73.anObjectArray788 != null) {
				Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
				class572_sub20.thizInterface = class73;
				class572_sub20.params = class73.anObjectArray788;
				Class531.executeCs2(class572_sub20, 2000000, -1657604569);
			}
		}
	}

	static final void method3799(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 943);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class523.method6298(class73, class83, class441, -111960769);
	}

	static boolean method3800(int i, int i_3_) {
		return 57 == i || 58 == i || i == 1007 || 25 == i || i == 30;
	}
}
