package game;

/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6 {
	boolean aBool32;
	int anInt33;
	int anInt34;
	Class47 aClass47_35 = Class47.aClass47_467;
	int anInt36;

	Class6() {
		/* empty */
	}

	public static Class393 method491(int i, int i_0_) {
		if (1374191795 * ((Class393) Class393.aClass393_4669).anInt4671 == i)
			return Class393.aClass393_4669;
		if (((Class393) Class393.aClass393_4665).anInt4671 * 1374191795 == i)
			return Class393.aClass393_4665;
		if (i == ((Class393) Class393.aClass393_4667).anInt4671 * 1374191795)
			return Class393.aClass393_4667;
		if (((Class393) Class393.aClass393_4668).anInt4671 * 1374191795 == i)
			return Class393.aClass393_4668;
		if (((Class393) Class393.aClass393_4666).anInt4671 * 1374191795 == i)
			return Class393.aClass393_4666;
		if (i == ((Class393) Class393.aClass393_4670).anInt4671 * 1374191795)
			return Class393.aClass393_4670;
		return null;
	}

	static final void method492(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -2817);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		OutgoingPacket.method4056(class73, class83, class441, (byte) 1);
	}

	static final void method493(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = GraphicsDefinition.method7770(i_2_, (byte) 62);
	}

	static void method494(Class250 class250, boolean bool, float f, float f_3_, float f_4_, float f_5_, int i, int i_6_, int i_7_) {
		int i_8_ = client.aClass613_8605.method7313((byte) -111);
		int i_9_ = client.aClass613_8605.method7284(155221149);
		class250.method3452(f, f_3_, f_4_, f_5_, (float) i_9_, (float) i_8_, (float) i, (float) i_6_);
	}

	static final void method495(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		Class193[] class193s = client.aClass193Array8593;
		for (int i_16_ = 0; i_16_ < class193s.length; i_16_++) {
			Class193 class193 = class193s[i_16_];
			if (null != class193 && 2 == class193.anInt2319 * -910441311) {
				Class268.method3654((((Class193) class193).anInt2314 * 1078592559), class193.anInt2315 * 230762203, -810969519 * class193.anInt2321, 0, (493114218 * ((Class193) class193).anInt2317), false, false, -224798381);
				if (client.aFloatArray8677[0] > -1.0F && client.cycles % 20 < 10) {
					Class161 class161 = (Class1.aClass161Array11[((Class193) class193).anInt2312 * -1800233957]);
					int i_17_ = (int) ((float) i + client.aFloatArray8677[0] - 12.0F);
					int i_18_ = (int) (client.aFloatArray8677[1] + (float) i_10_ - 28.0F);
					class161.method2595(i_17_, i_18_);
				}
			}
		}
	}

	static void method496(Cs2Executor class441, int i) {
		Class386 class386 = ((Class386) Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), -1176248019));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (class386.anIntArray4634 == null ? 0 : class386.anIntArray4634.length);
	}

	static final void method497(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((Cs2Executor) class441).current_clan.method4205((String) (((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581)]), -738601406));
	}

	static final void method498(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool835 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 32323);
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class552.method6551(-1718435171 * class73.selfId, 1291690084);
	}

	static void method499(int i, int i_19_, int i_20_, int i_21_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(11, (long) i);
		class572_sub12_sub11.method10338(1446116905);
		((GameTask) class572_sub12_sub11).p1 = i_19_ * 720886855;
		((GameTask) class572_sub12_sub11).p2 = i_20_ * 1921029481;
	}
}
