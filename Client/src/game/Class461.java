package game;

/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class461 {
	volatile String aString5215;
	public volatile int anInt5216 = -489783823;

	Class461(String string) {
		((Class461) this).aString5215 = string;
	}

	static final void method5466(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class21.anInt148 * 1020999889;
	}

	static final void method5467(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	public static boolean method5468(char c, short i) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = Class436.aCharArray5066;
			for (int i_0_ = 0; i_0_ < cs.length; i_0_++) {
				char c_1_ = cs[i_0_];
				if (c == c_1_)
					return true;
			}
		}
		return false;
	}

	static final void method5469(Entity class456_sub1_sub2_sub3, boolean bool, int i) {
		int i_2_ = Class453.aClass453_5176.aByte5183;
		int i_3_ = 0;
		if (class456_sub1_sub2_sub3.anInt11638 * 88781565 > client.cycles)
			Class611.method7272(class456_sub1_sub2_sub3, (short) 2275);
		else if (class456_sub1_sub2_sub3.anInt11639 * -1601124661 >= client.cycles)
			Class393.method4734(class456_sub1_sub2_sub3, 479651714);
		else {
			Class9.method533(class456_sub1_sub2_sub3, bool, -543794053);
			i_2_ = 1927859097 * IncomingPacket.anInt4077;
			i_3_ = 1062500197 * Class270.anInt2863;
		}
		Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
		if ((int) class240.aFloat2653 < 512 || (int) class240.aFloat2657 < 512 || ((int) class240.aFloat2653 >= (client.aClass613_8605.method7347(-631124072) - 1) * 512) || ((int) class240.aFloat2657 >= (client.aClass613_8605.method7278(277214477) - 1) * 512)) {
			class456_sub1_sub2_sub3.aClass663_11670.method7801(-1, 751680147);
			for (int i_4_ = 0; i_4_ < class456_sub1_sub2_sub3.currentGraphics.length; i_4_++) {
				class456_sub1_sub2_sub3.currentGraphics[i_4_].id = 803171811;
				class456_sub1_sub2_sub3.currentGraphics[i_4_].aClass663_7776.method7801(-1, 751680147);
			}
			class456_sub1_sub2_sub3.anIntArray11640 = null;
			class456_sub1_sub2_sub3.anInt11638 = 0;
			class456_sub1_sub2_sub3.anInt11639 = 0;
			i_2_ = Class453.aClass453_5176.aByte5183;
			i_3_ = 0;
			class456_sub1_sub2_sub3.method5395((float) (class456_sub1_sub2_sub3.screenX[0] * 512 + class456_sub1_sub2_sub3.method10556((short) -24522) * 256), class240.aFloat2656, (float) (class456_sub1_sub2_sub3.screenY[0] * 512 + (class456_sub1_sub2_sub3.method10556((short) -173) * 256)));
			class456_sub1_sub2_sub3.method10521((byte) -88);
		}
		if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == class456_sub1_sub2_sub3) && ((int) class240.aFloat2653 < 6144 || (int) class240.aFloat2657 < 6144 || ((int) class240.aFloat2653 >= ((client.aClass613_8605.method7347(207845313) - 12) * 512)) || ((int) class240.aFloat2657 >= ((client.aClass613_8605.method7278(277214477) - 12) * 512)))) {
			class456_sub1_sub2_sub3.aClass663_11670.method7801(-1, 751680147);
			for (int i_5_ = 0; i_5_ < class456_sub1_sub2_sub3.currentGraphics.length; i_5_++) {
				class456_sub1_sub2_sub3.currentGraphics[i_5_].id = 803171811;
				class456_sub1_sub2_sub3.currentGraphics[i_5_].aClass663_7776.method7801(-1, 751680147);
			}
			class456_sub1_sub2_sub3.anIntArray11640 = null;
			class456_sub1_sub2_sub3.anInt11638 = 0;
			class456_sub1_sub2_sub3.anInt11639 = 0;
			i_2_ = Class453.aClass453_5176.aByte5183;
			i_3_ = 0;
			class456_sub1_sub2_sub3.method5395((float) (512 * class456_sub1_sub2_sub3.screenX[0] + (class456_sub1_sub2_sub3.method10556((short) -3162) * 256)), class240.aFloat2656, (float) (class456_sub1_sub2_sub3.screenY[0] * 512 + (class456_sub1_sub2_sub3.method10556((short) -9977) * 256)));
			class456_sub1_sub2_sub3.method10521((byte) -34);
		}
		int i_6_ = Class625.method7457(class456_sub1_sub2_sub3, -627135155);
		Class592.method7016(class456_sub1_sub2_sub3, (byte) 87);
		Class534.method6373(class456_sub1_sub2_sub3, i_2_, i_3_, i_6_, (byte) 26);
		Class600.method7062(class456_sub1_sub2_sub3, i_2_, 1984177300);
		Class52.method910(class456_sub1_sub2_sub3, (byte) 2);
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(class456_sub1_sub2_sub3.aClass15_11655.method645(-1537152942)), Class325.method4146(class456_sub1_sub2_sub3.aClass15_11657.method645(-1222758169)), Class325.method4146(class456_sub1_sub2_sub3.aClass15_11656.method645(51761059)));
		class456_sub1_sub2_sub3.method5404(class230);
		class230.method3165();
	}

	static boolean method5470(int i) {
		if (null == Class88.aClass572_Sub12_Sub10_1224)
			return false;
		if (-44467871 * ((Class572_Sub12_Sub10) Class88.aClass572_Sub12_Sub10_1224).anInt11402 >= 2000)
			((Class572_Sub12_Sub10) Class88.aClass572_Sub12_Sub10_1224).anInt11402 -= -2119628336;
		if (1007 == -44467871 * ((Class572_Sub12_Sub10) Class88.aClass572_Sub12_Sub10_1224).anInt11402)
			return true;
		return false;
	}

	static final void method5471(Cs2Executor class441, byte i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -1672);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class167.method2680(class73, class83, class441, 1342150666);
	}

	static final void method5472(Cs2Executor class441, int i) {
		Class481_Sub1 class481_sub1 = NPC.method10692(-494742572);
		if (null != class481_sub1) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1695041271 * class481_sub1.anInt8939;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class481_sub1.anInt5358 * 39075705;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.aString8937;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class481_sub1.method8229(-108144266);
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.method8230(-1158612527);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class481_sub1.anInt5360 * -1371162219;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 944028155 * class481_sub1.anInt8940;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.aString8938;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}
}
