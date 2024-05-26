package game;

/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class175 {
	public int anInt2090;
	public Class175 aClass175_2091;
	public int anInt2092;
	public int anInt2093;
	public int anInt2094;
	public int anInt2095;
	public Class250 aClass250_2096;

	public Class309 method2750(Interface37 interface37, byte i) {
		return interface37.method212(anInt2094 * -1925194305, -351667785);
	}

	Class175(int i, int i_0_) {
		anInt2094 = i * -1634790849;
		anInt2092 = -8270449 * i_0_;
	}

	Class175 method2751(int i, short i_1_) {
		return new Class175(anInt2094 * -1925194305, i);
	}

	static final void method2752(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub26_9240, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1360989163);
		Class623.method7443(-1552926692);
		client.aBool8854 = false;
	}

	static final void method2753(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_3_ = Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728);
		if (i_2_ != i_3_) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub15_9226), i_2_, 2022135300);
			Class623.method7443(-1429489497);
			client.aBool8854 = false;
		}
	}

	static void method2754(byte i) {
		if (Class434.aClass434_5047 != Class151.aClass434_1702)
			Class212.aClass212_2457.method3057((byte) 54);
	}

	static int method2755(int i, int i_4_, int i_5_) {
		if (Class516.aClass516_5738.anInt5742 * 1870735441 == i || i == 1870735441 * Class516.aClass516_5728.anInt5742)
			return Class456_Sub1_Sub4_Sub2.anIntArray11573[i_4_ & 0x3];
		return Class456_Sub1_Sub4_Sub2.anIntArray11574[i_4_ & 0x3];
	}

	static void method2756(int i, int i_6_, int i_7_) {
		Class25.anInt184 = -1629590941 * i;
		Class25.anInt185 = i_6_ * -396431279;
	}

	static int method2757(Class572_Sub15_Sub2 class572_sub15_sub2, int i) {
		int i_8_ = class572_sub15_sub2.readBits(2, -1809904620);
		int i_9_;
		if (0 == i_8_)
			i_9_ = 0;
		else if (1 == i_8_)
			i_9_ = class572_sub15_sub2.readBits(5, -1809904620);
		else if (2 == i_8_)
			i_9_ = class572_sub15_sub2.readBits(8, -1809904620);
		else
			i_9_ = class572_sub15_sub2.readBits(11, -1809904620);
		return i_9_;
	}
}
