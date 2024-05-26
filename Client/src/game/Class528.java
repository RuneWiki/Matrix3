package game;

/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528 implements Interface52 {
	static Class528 aClass528_5897;
	static Class528 aClass528_5898 = new Class528(0);
	static Class528 aClass528_5899;
	static Class528 aClass528_5900;
	static Class528 aClass528_5901;
	static Class528 aClass528_5902;
	int anInt5903;

	public int method61() {
		return -580873867 * ((Class528) this).anInt5903;
	}

	public int getId(int i) {
		return -580873867 * ((Class528) this).anInt5903;
	}

	static {
		aClass528_5897 = new Class528(1);
		aClass528_5899 = new Class528(2);
		aClass528_5900 = new Class528(3);
		aClass528_5901 = new Class528(4);
		aClass528_5902 = new Class528(5);
	}

	Class528(int i) {
		((Class528) this).anInt5903 = i * 15529693;
	}

	public int method45() {
		return -580873867 * ((Class528) this).anInt5903;
	}

	public int method43() {
		return -580873867 * ((Class528) this).anInt5903;
	}

	public int method143() {
		return -580873867 * ((Class528) this).anInt5903;
	}

	static final void method6322(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class4.method486(class73, class83, class441, (byte) 58);
	}

	static int method6323(char c, int i) {
		if (c >= 0 && c < Class449.anIntArray5167.length)
			return Class449.anIntArray5167[c];
		return -1;
	}
}
