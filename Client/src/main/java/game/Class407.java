package game;

/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class407 {
	static Class407 aClass407_4766;
	static Class407 aClass407_4767 = new Class407(0);
	static int anInt4768;

	static {
		aClass407_4766 = new Class407(1);
	}

	Class407(int i) {
		/* empty */
	}

	public static void method4927(int[] is, Object[] objects, byte i) {
		Class540.method6413(is, objects, 0, is.length - 1, (byte) -49);
	}

	static final void method4928(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		int i_0_ = 10;
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class249.method3433(class73, i_0_, i_1_, class441, 1212191308);
	}

	static final void method4929(Cs2Executor class441, byte i) {
		long l = (((Cs2Executor) class441).longStack[(((Cs2Executor) class441).longStackPtr -= -879214973) * 1097105451]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	static final void method4930(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8120(1688352803);
	}

	static void method4931(int i, int i_2_, byte i_3_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(13, (long) i);
		class572_sub12_sub11.method10338(1860347088);
		((GameTask) class572_sub12_sub11).p1 = 720886855 * i_2_;
	}
}
