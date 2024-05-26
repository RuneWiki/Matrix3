package game;

/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64 {
	public static boolean aBool676 = false;
	static int anInt677;

	Class64() throws Throwable {
		throw new Error();
	}

	static final void method1024(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class506.method6031(class73, class83, class441, -1724390481);
	}

	static final void method1025(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (Class328.aClass196Array4209 != null && i_0_ < Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641 && (Class328.aClass196Array4209[i_0_].aString2349.equalsIgnoreCase(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username)))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method1026(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_1_ | 1 << i_2_;
	}

	static final void method1027(Cs2Executor class441, int i) {
		Class439.method5276(false, (byte) 8);
	}

	static void method1028(int i) {
		if (null != Class272_Sub2.aClass106_9517) {
			client.aClass613_8605.method7296(1238821597);
			Class556.method6584(-48448870);
			Class120.method2180(1879206078);
			Class557.method6589((byte) -35);
			Class174.method2749((byte) -44);
			client.aClass613_8605.method7298(true, 802041578);
			MapSize.method1539(23332072);
			Class22.method707(-862483449);
			Class556.method6587(false, -2122979256);
			Class285.method3855(452959022);
			Class338.method4249(-1777522838);
			Class93.method1534(1517788309);
			for (int i_3_ = 0; i_3_ < client.aClass575Array8594.length; i_3_++) {
				if (null != client.aClass575Array8594[i_3_])
					client.aClass575Array8594[i_3_].aClass89_7664 = null;
			}
			for (int i_4_ = 0; i_4_ < 2048; i_4_++) {
				Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_4_];
				if (null != class456_sub1_sub2_sub3_sub2) {
					for (int i_5_ = 0; i_5_ < (class456_sub1_sub2_sub3_sub2.models).length; i_5_++)
						class456_sub1_sub2_sub3_sub2.models[i_5_] = null;
				}
			}
			for (int i_6_ = 0; i_6_ < client.anInt8624 * 617551237; i_6_++) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) client.aClass572_Sub9Array8623[i_6_].anObject9081);
				if (null != class456_sub1_sub2_sub3_sub1) {
					for (int i_7_ = 0; i_7_ < (class456_sub1_sub2_sub3_sub1.models).length; i_7_++)
						class456_sub1_sub2_sub3_sub1.models[i_7_] = null;
				}
			}
			client.aClass676_8747.method7964((byte) 66);
			Class272_Sub2.aClass106_9517.method1666(-1732052192);
			Class272_Sub2.aClass106_9517 = null;
		}
	}

	static final void method1029(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt781 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -1373509273;
		Class555.method6575(class73, (short) 21143);
	}

	static final void method1030(Cs2Executor class441, byte i) {
		if (Class637.aBool8266) {
			Class654[] class654s = Class18.method680(1873624541);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class654s.length;
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}
