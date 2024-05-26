package game;

/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class548 {
	public int[] anIntArray6192;
	public int[] anIntArray6193;
	public int anInt6194;

	public Class548(int i) {
		anInt6194 = i * -437203659;
		anIntArray6192 = new int[anInt6194 * 613080349];
		anIntArray6193 = new int[anInt6194 * 613080349];
	}

	static final void method6509(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class108.method2064(class73, class83, class441, 218490108);
	}

	static final void method6510(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class589.aString7805.startsWith("mac") ? 1 : 0;
	}

	public static boolean method6511(int i, byte i_0_) {
		return i == 0 || i == 2;
	}
}
