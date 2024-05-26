package game;

/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class34 implements Interface2 {
	Class46 this$0;
	Class323 aClass323_382;
	static Class653 aClass653_383;
	static int anInt384;

	public void method15(Class49 class49, int i) {
		if (((Class34) this).aClass323_382 != null)
			class49.method864((byte) 2).method80(((VarDefinition) (((Class46) ((Class34) this).this$0).anInterface1_463.method2(209806500).getDefinition(((Class34) this).aClass323_382.anInt4079 * 380662693, -1329220009))), ((Class34) this).aClass323_382.anObject4078, -30259456);
	}

	public void method17(Class49 class49) {
		if (((Class34) this).aClass323_382 != null)
			class49.method864((byte) 20).method80(((VarDefinition) (((Class46) ((Class34) this).this$0).anInterface1_463.method2(-505264301).getDefinition(((Class34) this).aClass323_382.anInt4079 * 380662693, -2039275418))), ((Class34) this).aClass323_382.anObject4078, -30259456);
	}

	public void method16(Class49 class49) {
		if (((Class34) this).aClass323_382 != null)
			class49.method864((byte) -68).method80(((VarDefinition) (((Class46) ((Class34) this).this$0).anInterface1_463.method2(58906635).getDefinition(((Class34) this).aClass323_382.anInt4079 * 380662693, -1540470495))), ((Class34) this).aClass323_382.anObject4078, -30259456);
	}

	Class34(Class46 class46, RSByteBuffer class572_sub15) {
		((Class34) this).this$0 = class46;
		if (class572_sub15.readUnsignedShort(647518597) != 65535) {
			class572_sub15.o -= 620787510;
			((Class34) this).aClass323_382 = ((Class46) class46).anInterface1_463.method2(-1636119936).method9203(class572_sub15, -554980993);
		} else
			((Class34) this).aClass323_382 = null;
	}

	static final int method778(int i, int i_0_, int i_1_, byte i_2_) {
		int i_3_ = i / i_1_;
		int i_4_ = i & i_1_ - 1;
		int i_5_ = i_0_ / i_1_;
		int i_6_ = i_0_ & i_1_ - 1;
		int i_7_ = Class166.method2674(i_3_, i_5_, (byte) -82);
		int i_8_ = Class166.method2674(1 + i_3_, i_5_, (byte) -50);
		int i_9_ = Class166.method2674(i_3_, i_5_ + 1, (byte) -42);
		int i_10_ = Class166.method2674(i_3_ + 1, 1 + i_5_, (byte) -109);
		int i_11_ = Class525.method6307(i_7_, i_8_, i_4_, i_1_, (byte) 25);
		int i_12_ = Class525.method6307(i_9_, i_10_, i_4_, i_1_, (byte) 77);
		return Class525.method6307(i_11_, i_12_, i_6_, i_1_, (byte) 78);
	}

	public static void executeCs2(Cs2LaunchArgs class572_sub20, int i) {
		Class531.executeCs2(class572_sub20, 200000, 1596067630);
	}

	static final void method780(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		long l = (long) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		long l_13_ = (long) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		long l_14_ = (long) (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (l * l_14_ / l_13_);
	}

	static final void method781(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.anInt8684 * 1915481369 - client.anInt8683 * -519332127;
	}
}
