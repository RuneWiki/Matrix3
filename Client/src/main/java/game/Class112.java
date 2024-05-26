package game;

/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class112 {
	int anInt1429;
	static Class112 aClass112_1430;
	static Class112 aClass112_1431 = new Class112(4);
	static Class112 aClass112_1432;
	static Class112 music;
	static Class112 aClass112_1434;
	static Class112 aClass112_1435;
	public static int anInt1436;

	Class112(int i) {
		((Class112) this).anInt1429 = -1232404067 * i;
	}

	int method2083(short i) {
		if (this == aClass112_1431)
			return -1;
		return 0x1000000 | 290360501 * ((Class112) this).anInt1429;
	}

	int method2084() {
		if (this == aClass112_1431)
			return -1;
		return 0x1000000 | 290360501 * ((Class112) this).anInt1429;
	}

	static {
		aClass112_1430 = new Class112(3);
		music = new Class112(1);
		aClass112_1432 = new Class112(5);
		aClass112_1435 = new Class112(0);
		aClass112_1434 = new Class112(2);
	}

	int method2085() {
		if (this == aClass112_1431)
			return -1;
		return 0x1000000 | 290360501 * ((Class112) this).anInt1429;
	}

	static final void method2086(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 24354);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class534.method6372(class73, class83, class441, -1112796366);
	}

	static final void method2087(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class194.method2925(string, 1 == i_1_, 1109469539);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 43052443 * Class626.anInt8089;
	}
}
