package game;

/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51 implements Interface2 {
	Class46 this$0;
	public static Class278 aClass278_491;

	public void method16(Class49 class49) {
		class49.method866((byte) 0);
	}

	public void method15(Class49 class49, int i) {
		class49.method866((byte) 0);
	}

	Class51(Class46 class46) {
		((Class51) this).this$0 = class46;
	}

	public void method17(Class49 class49) {
		class49.method866((byte) 0);
	}

	public static void method904(Class530 class530, int i, int i_0_, Interface65 interface65, byte i_1_) {
		Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
		((Cs2Executor) class441).anInterface65_5117 = interface65;
		Class309.method4041(class530, i, i_0_, class441, -627862136);
		((Cs2Executor) class441).anInterface65_5117 = null;
	}

	static final void method905(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1957439894;
		class73.anInt860 = -501513339 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		class73.anInt797 = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]) * 1317609365);
		class73.anInt798 = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]) * 1502543429);
		class73.anInt799 = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]) * 1267443815);
		class73.anInt800 = 371863735 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 4]);
		class73.anInt804 = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 5]) * -1342032263);
		Class555.method6575(class73, (short) 26738);
		if (-1 == class73.activeComponent * -1665128073 && !class83.aBool1079) {
			Class251.method3504(-1718435171 * class73.selfId, -1672592104);
			Class572_Sub17.method8580(class73.selfId * -1718435171, (byte) -110);
		}
	}

	static final void method906(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class133_Sub23.playerVarsProvider.method2961(i_2_, 1958764803);
	}

	static final void method907(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_5_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class411_Sub1.method9572((((Cs2Executor) class441).entity.aClass83_11622), i_3_ & 0xffff, i_4_, i_5_, ((Cs2Executor) class441).aBool5128, class441, (byte) 10);
	}

	static final void method908(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		short i_7_ = (short) (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		short i_8_ = (short) (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_6_ >= 0 && i_6_ < 5) {
			class73.method1106(i_6_, i_7_, i_8_, (byte) -20);
			Class555.method6575(class73, (short) 19613);
			if (-1 == -1665128073 * class73.activeComponent && !class83.aBool1079)
				Class202_Sub1.method9210(class73.selfId * -1718435171, i_6_, 1229209322);
		}
	}
}
