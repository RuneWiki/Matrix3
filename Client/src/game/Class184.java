package game;

/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class184 {
	static int[] anIntArray2154;
	static final int anInt2155 = 1;
	static boolean $assertionsDisabled = !Class184.class.desiredAssertionStatus();
	static int[] anIntArray2156;
	static RSByteBuffer[] aClass572_Sub15Array2157;
	static RSByteBuffer[] aClass572_Sub15Array2158;
	static byte[] aByteArray2159;
	static int anInt2160;
	static byte[] aByteArray2161 = new byte[2048];
	static int[] anIntArray2162;
	public static int anInt2163;
	static int anInt2164;
	static final int anInt2165 = 2;
	static Class6[] aClass6Array2166;
	public static String aString2167;

	static final void method2821(Class572_Sub15_Sub2 class572_sub15_sub2) {
		int i = 0;
		class572_sub15_sub2.method10397(-860683894);
		for (int i_0_ = 0; i_0_ < 1657484935 * anInt2163; i_0_++) {
			int i_1_ = anIntArray2154[i_0_];
			if ((aByteArray2161[i_1_] & 0x1) == 0) {
				if (i > 0) {
					i--;
					aByteArray2161[i_1_] |= 0x2;
				} else {
					int i_2_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_2_ == 0) {
						i = Class175.method2757(class572_sub15_sub2, 16711935);
						aByteArray2161[i_1_] |= 0x2;
					} else
						Class104_Sub1.method9921(class572_sub15_sub2, i_1_, -226980365);
				}
			}
		}
		class572_sub15_sub2.method10395(-1347952088);
		if (0 != i)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_3_ = 0; i_3_ < 1657484935 * anInt2163; i_3_++) {
			int i_4_ = anIntArray2154[i_3_];
			if (0 != (aByteArray2161[i_4_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray2161[i_4_] |= 0x2;
				} else {
					int i_5_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (0 == i_5_) {
						i = Class175.method2757(class572_sub15_sub2, 16711935);
						aByteArray2161[i_4_] |= 0x2;
					} else
						Class104_Sub1.method9921(class572_sub15_sub2, i_4_, -1341659044);
				}
			}
		}
		class572_sub15_sub2.method10395(-2100606814);
		if (0 != i)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_6_ = 0; i_6_ < 33123591 * anInt2160; i_6_++) {
			int i_7_ = anIntArray2162[i_6_];
			if (0 != (aByteArray2161[i_7_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray2161[i_7_] |= 0x2;
				} else {
					int i_8_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (0 == i_8_) {
						i = Class175.method2757(class572_sub15_sub2, 16711935);
						aByteArray2161[i_7_] |= 0x2;
					} else if (Class402.method4781(class572_sub15_sub2, i_7_, (byte) -41))
						aByteArray2161[i_7_] |= 0x2;
				}
			}
		}
		class572_sub15_sub2.method10395(-1833845628);
		if (0 != i)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_9_ = 0; i_9_ < anInt2160 * 33123591; i_9_++) {
			int i_10_ = anIntArray2162[i_9_];
			if (0 == (aByteArray2161[i_10_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray2161[i_10_] |= 0x2;
				} else {
					int i_11_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_11_ == 0) {
						i = Class175.method2757(class572_sub15_sub2, 16711935);
						aByteArray2161[i_10_] |= 0x2;
					} else if (Class402.method4781(class572_sub15_sub2, i_10_, (byte) -72))
						aByteArray2161[i_10_] |= 0x2;
				}
			}
		}
		class572_sub15_sub2.method10395(-998968886);
		if (0 != i)
			throw new RuntimeException();
		anInt2163 = 0;
		anInt2160 = 0;
		for (int i_12_ = 1; i_12_ < 2048; i_12_++) {
			aByteArray2161[i_12_] >>= 1;
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_12_];
			if (class456_sub1_sub2_sub3_sub2 != null)
				anIntArray2154[(anInt2163 += -425218249) * 1657484935 - 1] = i_12_;
			else
				anIntArray2162[(anInt2160 += 285241527) * 33123591 - 1] = i_12_;
		}
	}

	static {
		aByteArray2159 = new byte[2048];
		aClass572_Sub15Array2157 = new RSByteBuffer[2048];
		aClass572_Sub15Array2158 = new RSByteBuffer[2048];
		anInt2163 = 0;
		anIntArray2154 = new int[2048];
		anInt2160 = 0;
		anIntArray2162 = new int[2048];
		aClass6Array2166 = new Class6[2048];
		anInt2164 = 0;
		anIntArray2156 = new int[2048];
	}

	static final void method2822(Class572_Sub15_Sub2 class572_sub15_sub2) {
		class572_sub15_sub2.method10397(-860683894);
		int i = -1921142451 * client.anInt8728;
		Player class456_sub1_sub2_sub3_sub2 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i] = (new Player(client.aClass613_8605.method7285(1093313269))));
		class456_sub1_sub2_sub3_sub2.anInt11633 = 2118180903 * i;
		int i_13_ = class572_sub15_sub2.readBits(30, -1809904620);
		byte i_14_ = (byte) (i_13_ >> 28);
		int i_15_ = i_13_ >> 14 & 0x3fff;
		int i_16_ = i_13_ & 0x3fff;
		Class497 class497 = client.aClass613_8605.method7280((byte) -102);
		class456_sub1_sub2_sub3_sub2.screenX[0] = i_15_ - -2109597897 * class497.localX;
		class456_sub1_sub2_sub3_sub2.screenY[0] = i_16_ - class497.localY * 417324155;
		class456_sub1_sub2_sub3_sub2.method5395((float) ((class456_sub1_sub2_sub3_sub2.screenX[0] << 9) + (class456_sub1_sub2_sub3_sub2.method10556((short) -14217) << 8)), (class456_sub1_sub2_sub3_sub2.method5400().aClass240_2647.aFloat2656), (float) ((class456_sub1_sub2_sub3_sub2.screenY[0] << 9) + (class456_sub1_sub2_sub3_sub2.method10556((short) -7446) << 8)));
		Class274.anInt2911 = (class456_sub1_sub2_sub3_sub2.aByte9009 = class456_sub1_sub2_sub3_sub2.aByte9008 = i_14_) * 1607700641;
		if (client.aClass613_8605.method7287((byte) 53).method3689(class456_sub1_sub2_sub3_sub2.screenX[0], class456_sub1_sub2_sub3_sub2.screenY[0], -1963456391))
			class456_sub1_sub2_sub3_sub2.aByte9008++;
		if (aClass572_Sub15Array2157[i] != null)
			class456_sub1_sub2_sub3_sub2.decodePlayerAppearance(aClass572_Sub15Array2157[i], (byte) 16);
		if (null != aClass572_Sub15Array2158[i])
			class456_sub1_sub2_sub3_sub2.decodeHeadIcons(aClass572_Sub15Array2158[i], 1130515724);
		anInt2163 = 0;
		anIntArray2154[(anInt2163 += -425218249) * 1657484935 - 1] = i;
		aByteArray2161[i] = (byte) 0;
		anInt2160 = 0;
		for (int i_17_ = 1; i_17_ < 2048; i_17_++) {
			if (i != i_17_) {
				int i_18_ = class572_sub15_sub2.readBits(18, -1809904620);
				int i_19_ = i_18_ >> 16 & 0x3;
				int i_20_ = i_18_ >> 8 & 0xff;
				int i_21_ = i_18_ & 0xff;
				Class6 class6 = aClass6Array2166[i_17_] = new Class6();
				((Class6) class6).anInt33 = -634631159 * ((i_20_ << 14) + (i_19_ << 28) + i_21_);
				((Class6) class6).anInt34 = 0;
				((Class6) class6).anInt36 = 660647749;
				((Class6) class6).aClass47_35 = Class47.aClass47_467;
				((Class6) class6).aBool32 = false;
				anIntArray2162[(anInt2160 += 285241527) * 33123591 - 1] = i_17_;
				aByteArray2161[i_17_] = (byte) 0;
			}
		}
		class572_sub15_sub2.method10395(-1871180293);
		Class413 class413 = Class133_Sub1.aClass411_Sub1_9827.method4994(997761594);
		if (class413 == Class413.aClass413_4915) {
			Class423_Sub3 class423_sub3 = ((Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -57));
			class423_sub3.method9313(-966975016);
		}
		Class416 class416 = Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 29);
		if (Class416.aClass416_4935 == class416) {
			Class658_Sub3 class658_sub3 = ((Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040));
			class658_sub3.method8977(-1050417047);
		}
	}

	static void method2823() {
		anInt2163 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass572_Sub15Array2157[i] = null;
			aClass572_Sub15Array2158[i] = null;
			aByteArray2159[i] = Class453.aClass453_5177.aByte5183;
			aClass6Array2166[i] = null;
		}
	}

	Class184() throws Throwable {
		throw new Error();
	}

	static void method2824() {
		anInt2163 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass572_Sub15Array2157[i] = null;
			aClass572_Sub15Array2158[i] = null;
			aByteArray2159[i] = Class453.aClass453_5177.aByte5183;
			aClass6Array2166[i] = null;
		}
	}

	static void method2825() {
		anInt2163 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass572_Sub15Array2157[i] = null;
			aClass572_Sub15Array2158[i] = null;
			aByteArray2159[i] = Class453.aClass453_5177.aByte5183;
			aClass6Array2166[i] = null;
		}
	}

	static final void method2826(Class572_Sub15_Sub2 class572_sub15_sub2) {
		class572_sub15_sub2.method10397(-860683894);
		int i = -1921142451 * client.anInt8728;
		Player class456_sub1_sub2_sub3_sub2 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i] = (new Player(client.aClass613_8605.method7285(1727537195))));
		class456_sub1_sub2_sub3_sub2.anInt11633 = 2118180903 * i;
		int i_22_ = class572_sub15_sub2.readBits(30, -1809904620);
		byte i_23_ = (byte) (i_22_ >> 28);
		int i_24_ = i_22_ >> 14 & 0x3fff;
		int i_25_ = i_22_ & 0x3fff;
		Class497 class497 = client.aClass613_8605.method7280((byte) -2);
		class456_sub1_sub2_sub3_sub2.screenX[0] = i_24_ - -2109597897 * class497.localX;
		class456_sub1_sub2_sub3_sub2.screenY[0] = i_25_ - class497.localY * 417324155;
		class456_sub1_sub2_sub3_sub2.method5395((float) ((class456_sub1_sub2_sub3_sub2.screenX[0] << 9) + (class456_sub1_sub2_sub3_sub2.method10556((short) -2812) << 8)), (class456_sub1_sub2_sub3_sub2.method5400().aClass240_2647.aFloat2656), (float) ((class456_sub1_sub2_sub3_sub2.screenY[0] << 9) + (class456_sub1_sub2_sub3_sub2.method10556((short) -1640) << 8)));
		Class274.anInt2911 = (class456_sub1_sub2_sub3_sub2.aByte9009 = class456_sub1_sub2_sub3_sub2.aByte9008 = i_23_) * 1607700641;
		if (client.aClass613_8605.method7287((byte) -77).method3689(class456_sub1_sub2_sub3_sub2.screenX[0], class456_sub1_sub2_sub3_sub2.screenY[0], -2012867199))
			class456_sub1_sub2_sub3_sub2.aByte9008++;
		if (aClass572_Sub15Array2157[i] != null)
			class456_sub1_sub2_sub3_sub2.decodePlayerAppearance(aClass572_Sub15Array2157[i], (byte) 16);
		if (null != aClass572_Sub15Array2158[i])
			class456_sub1_sub2_sub3_sub2.decodeHeadIcons(aClass572_Sub15Array2158[i], 1130515724);
		anInt2163 = 0;
		anIntArray2154[(anInt2163 += -425218249) * 1657484935 - 1] = i;
		aByteArray2161[i] = (byte) 0;
		anInt2160 = 0;
		for (int i_26_ = 1; i_26_ < 2048; i_26_++) {
			if (i != i_26_) {
				int i_27_ = class572_sub15_sub2.readBits(18, -1809904620);
				int i_28_ = i_27_ >> 16 & 0x3;
				int i_29_ = i_27_ >> 8 & 0xff;
				int i_30_ = i_27_ & 0xff;
				Class6 class6 = aClass6Array2166[i_26_] = new Class6();
				((Class6) class6).anInt33 = -634631159 * ((i_29_ << 14) + (i_28_ << 28) + i_30_);
				((Class6) class6).anInt34 = 0;
				((Class6) class6).anInt36 = 660647749;
				((Class6) class6).aClass47_35 = Class47.aClass47_467;
				((Class6) class6).aBool32 = false;
				anIntArray2162[(anInt2160 += 285241527) * 33123591 - 1] = i_26_;
				aByteArray2161[i_26_] = (byte) 0;
			}
		}
		class572_sub15_sub2.method10395(-2069468278);
		Class413 class413 = Class133_Sub1.aClass411_Sub1_9827.method4994(2084833417);
		if (class413 == Class413.aClass413_4915) {
			Class423_Sub3 class423_sub3 = ((Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -117));
			class423_sub3.method9313(-966975016);
		}
		Class416 class416 = Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 105);
		if (Class416.aClass416_4935 == class416) {
			Class658_Sub3 class658_sub3 = ((Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040));
			class658_sub3.method8977(-1050417047);
		}
	}

	static Class409 method2827(int i, byte i_31_) {
		if (i == Class409.aClass409_4782.anInt4781 * 1262034027)
			return Class409.aClass409_4782;
		if (1262034027 * Class409.aClass409_4783.anInt4781 == i)
			return Class409.aClass409_4783;
		return null;
	}

	static final void method2828(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class375_Sub1.anInt9423 * -1459158013;
	}

	static final void method2829(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool821 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 11299);
	}
}
