package game;

/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class615 implements Interface21 {
	static int anInt8040;

	static void method7370(Cs2Executor class441, short i) {
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) != 0);
		Class163.method2666(bool, 1895013959);
	}

	static final void method7371(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (-1 != -507155049 * client.anInt8790) {
			if (i_0_ == 0) {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -507155049 * client.anInt8790;
				return;
			}
			i_0_--;
		}
		Class572_Sub29 class572_sub29 = (Class572_Sub29) client.aClass676_8760.method7968((byte) 26);
		while (i_0_-- > 0)
			class572_sub29 = (Class572_Sub29) client.aClass676_8760.method7969(-64551505);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class572_sub29.anInt9301 * 493419501;
	}
}
