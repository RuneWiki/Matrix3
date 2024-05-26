package game;

/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151 implements Interface11 {
	int anInt1699;
	int anInt1700;
	float[] aFloatArray1701;
	public static Class434 aClass434_1702;

	public void method38() {
		/* empty */
	}

	public int method42() {
		return 729012775 * ((Class151) this).anInt1699;
	}

	public int method41() {
		return 1775602059 * ((Class151) this).anInt1700;
	}

	Class151(int i, int i_0_) {
		((Class151) this).anInt1699 = 384169367 * i;
		((Class151) this).anInt1700 = i_0_ * 654104099;
		((Class151) this).aFloatArray1701 = new float[(1775602059 * ((Class151) this).anInt1700 * (((Class151) this).anInt1699 * 729012775))];
	}

	public int method45() {
		return 729012775 * ((Class151) this).anInt1699;
	}

	public int method44() {
		return 1775602059 * ((Class151) this).anInt1700;
	}

	public void method39() {
		/* empty */
	}

	public int method40() {
		return 1775602059 * ((Class151) this).anInt1700;
	}

	public int method43() {
		return 729012775 * ((Class151) this).anInt1699;
	}

	static final void method2500(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		Class344.method4316(((UnderlayDefinition) underlayDefinition).aClass73_5135, i_1_, i_2_, -1450329323);
	}

	static final void method2501(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass15_11655.method645(-1141865308) >> 3;
	}

	static final void method2502(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_3_ != Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9153(-119524718)) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub32_9202), i_3_, 1031098033);
			Class623.method7443(-1285385216);
			client.aBool8854 = false;
			client.aClass613_8605.method7302(-1789875281);
		}
	}

	static final void method2503(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728);
	}

	public static int method2504(int i) {
		return 913778609 * Class428.anInt5011;
	}

	static final void method2505(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, byte i_12_) {
		if (i_5_ >= 1 && i_6_ >= 1 && i_5_ <= client.aClass613_8605.method7347(1896378817) - 2 && i_6_ <= client.aClass613_8605.method7278(277214477) - 2) {
			int i_13_ = i;
			if (i_13_ < 3 && client.aClass613_8605.method7287((byte) -26).method3689(i_5_, i_6_, -2111420904))
				i_13_++;
			if (client.aClass613_8605.method7285(1799071600) != null) {
				client.aClass613_8605.method7293(-1915572903).method8815(Class272_Sub2.aClass106_9517, i, i_4_, i_5_, i_6_, (byte) -14);
				if (i_7_ >= 0) {
					int i_14_ = Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method9109(-477232025);
					Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub28_9218, 1, 2001553698);
					client.aClass613_8605.method7293(18083332).method8810(Class272_Sub2.aClass106_9517, i_13_, i, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, 1789134599);
					Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub28_9218, i_14_, 1247462199);
				}
				Class639_Sub21.method9013((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), 1231185265);
			}
		}
	}
}
