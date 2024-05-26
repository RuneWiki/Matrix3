package game;

/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class110 implements Interface31 {
	Class54 this$0;

	public float method153() {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9243.method8970(660014728) / 255.0F);
	}

	public float method152(byte i) {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9243.method8970(660014728) / 255.0F);
	}

	Class110(Class54 class54) {
		((Class110) this).this$0 = class54;
	}

	public static void method2071(Class523 class523, Class106 class106, byte i) {
		Iterator iterator = Class491.aList5467.iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			if (((Class485) class485).aBool5429)
				class485.method5776(class523, class106);
		}
	}

	static final void method2072(Cs2Executor class441, int i) {
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		Class167_Sub1.method10038(bool, -1711076338);
	}

	static boolean method2073(int i) {
		return Class25.anInt172 * 357782167 > 0;
	}

	static final void method2074(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class24.method722(i_0_, (byte) 6);
	}
}
