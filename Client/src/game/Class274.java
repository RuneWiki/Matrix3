package game;

/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class274 {
	static final int anInt2903 = 2;
	public static final int anInt2904 = 8;
	static final int anInt2905 = 2;
	public static final int anInt2906 = 4;
	static final int anInt2907 = 16;
	public static final int anInt2908 = 2;
	public byte[][][] aByteArrayArrayArray2909;
	public static Interface5 anInterface5_2910;
	public static int anInt2911;

	public void method3681(int i) {
		for (int i_0_ = 0; i_0_ < aByteArrayArrayArray2909.length; i_0_++) {
			for (int i_1_ = 0; i_1_ < aByteArrayArrayArray2909[0].length; i_1_++) {
				for (int i_2_ = 0; i_2_ < aByteArrayArrayArray2909[0][0].length; i_2_++)
					aByteArrayArrayArray2909[i_0_][i_1_][i_2_] = (byte) 0;
			}
		}
	}

	public boolean method3682(int i, int i_3_, byte i_4_) {
		if (i < 0 || i_3_ < 0 || i >= aByteArrayArrayArray2909[3].length || i_3_ >= aByteArrayArrayArray2909[3][i].length)
			return false;
		return (aByteArrayArrayArray2909[3][i][i_3_] & 0x2) != 0;
	}

	public Class274(int i, int i_5_, int i_6_) {
		aByteArrayArrayArray2909 = new byte[i][i_5_][i_6_];
	}

	public boolean method3683(int i, int i_7_, int i_8_, int i_9_, byte i_10_) {
		if ((aByteArrayArrayArray2909[0][i_8_][i_9_] & 0x2) != 0)
			return true;
		if (0 != (aByteArrayArrayArray2909[i_7_][i_8_][i_9_] & 0x10))
			return false;
		if (method3684(i_7_, i_8_, i_9_, (byte) -29) == i)
			return true;
		return false;
	}

	int method3684(int i, int i_11_, int i_12_, byte i_13_) {
		if ((aByteArrayArrayArray2909[i][i_11_][i_12_] & 0x8) != 0)
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray2909[1][i_11_][i_12_] & 0x2))
			return i - 1;
		return i;
	}

	public boolean method3685(int i, int i_14_) {
		if (i < 0 || i_14_ < 0 || i >= aByteArrayArrayArray2909[1].length || i_14_ >= aByteArrayArrayArray2909[1][i].length)
			return false;
		if (0 != (aByteArrayArrayArray2909[1][i][i_14_] & 0x2))
			return true;
		return false;
	}

	public boolean method3686(int i, int i_15_) {
		if (i < 0 || i_15_ < 0 || i >= aByteArrayArrayArray2909[3].length || i_15_ >= aByteArrayArrayArray2909[3][i].length)
			return false;
		return (aByteArrayArrayArray2909[3][i][i_15_] & 0x2) != 0;
	}

	public boolean method3687(int i, int i_16_) {
		if (i < 0 || i_16_ < 0 || i >= aByteArrayArrayArray2909[3].length || i_16_ >= aByteArrayArrayArray2909[3][i].length)
			return false;
		return (aByteArrayArrayArray2909[3][i][i_16_] & 0x2) != 0;
	}

	public void method3688() {
		for (int i = 0; i < aByteArrayArrayArray2909.length; i++) {
			for (int i_17_ = 0; i_17_ < aByteArrayArrayArray2909[0].length; i_17_++) {
				for (int i_18_ = 0; i_18_ < aByteArrayArrayArray2909[0][0].length; i_18_++)
					aByteArrayArrayArray2909[i][i_17_][i_18_] = (byte) 0;
			}
		}
	}

	public boolean method3689(int i, int i_19_, int i_20_) {
		if (i < 0 || i_19_ < 0 || i >= aByteArrayArrayArray2909[1].length || i_19_ >= aByteArrayArrayArray2909[1][i].length)
			return false;
		if (0 != (aByteArrayArrayArray2909[1][i][i_19_] & 0x2))
			return true;
		return false;
	}

	public boolean method3690(int i, int i_21_, int i_22_, int i_23_) {
		if ((aByteArrayArrayArray2909[0][i_22_][i_23_] & 0x2) != 0)
			return true;
		if (0 != (aByteArrayArrayArray2909[i_21_][i_22_][i_23_] & 0x10))
			return false;
		if (method3684(i_21_, i_22_, i_23_, (byte) 18) == i)
			return true;
		return false;
	}

	public void method3691() {
		for (int i = 0; i < aByteArrayArrayArray2909.length; i++) {
			for (int i_24_ = 0; i_24_ < aByteArrayArrayArray2909[0].length; i_24_++) {
				for (int i_25_ = 0; i_25_ < aByteArrayArrayArray2909[0][0].length; i_25_++)
					aByteArrayArrayArray2909[i][i_24_][i_25_] = (byte) 0;
			}
		}
	}

	static final void method3692(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_26_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class572_Sub29 class572_sub29 = (Class572_Sub29) client.aClass676_8760.get((long) i_26_);
		if (class572_sub29 != null && 3 == -1157473207 * class572_sub29.anInt9300)
			Class96.method1554(class572_sub29, true, true, 1206317309);
	}

	static final void method3693(Cs2Executor class441, int i) {
		/* empty */
	}

	public static int[][] method3694(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, float f, boolean bool, int i_32_) {
		int[][] is = new int[i_27_][i];
		Class572_Sub1_Sub1 class572_sub1_sub1 = new Class572_Sub1_Sub1();
		((Class572_Sub1_Sub1) class572_sub1_sub1).aBool11496 = bool;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11492 = 1227768497 * i_29_;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11493 = i_30_ * -1562570597;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11483 = -1443931021 * i_31_;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11495 = (int) (4096.0F * f) * -1697195083;
		class572_sub1_sub1.method10463(1713909708);
		Class275.method3696(i, i_27_, -542812379);
		for (int i_33_ = 0; i_33_ < i_27_; i_33_++)
			class572_sub1_sub1.method10466(i_33_, is[i_33_], 2041851818);
		return is;
	}
}
