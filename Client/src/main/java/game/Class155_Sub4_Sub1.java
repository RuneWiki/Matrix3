package game;

/* Class155_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class155_Sub4_Sub1 extends Class155_Sub4 {
	float aFloat11231;
	int anInt11232;
	boolean aBool11233;
	float aFloat11234;
	boolean aBool11235;
	int anInt11236;

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_0_, int i_1_) {
		super(class106_sub1, i, class171, class88, i_0_, i_1_);
		((Class155_Sub4_Sub1) this).anInt11236 = i_0_;
		((Class155_Sub4_Sub1) this).anInt11232 = i_1_;
		if (((Class155_Sub4_Sub1) this).anInt1744 == 34037) {
			((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_1_;
			((Class155_Sub4_Sub1) this).aFloat11234 = (float) i_0_;
			((Class155_Sub4_Sub1) this).aBool11235 = false;
		} else {
			((Class155_Sub4_Sub1) this).aFloat11231 = 1.0F;
			((Class155_Sub4_Sub1) this).aFloat11234 = 1.0F;
			((Class155_Sub4_Sub1) this).aBool11235 = true;
		}
		((Class155_Sub4_Sub1) this).aBool11233 = false;
	}

	static Class155_Sub4_Sub1 method10177(Class106_Sub1 class106_sub1, int i, int i_2_, boolean bool, int[] is, int i_3_, int i_4_) {
		if (((Class106_Sub1) class106_sub1).aBool10154 || (Class521.method6219(i, (byte) 49) && Class521.method6219(i_2_, (byte) 23)))
			return new Class155_Sub4_Sub1(class106_sub1, 3553, i, i_2_, bool, is, i_3_, i_4_);
		if (((Class106_Sub1) class106_sub1).aBool10169)
			return new Class155_Sub4_Sub1(class106_sub1, 34037, i, i_2_, bool, is, i_3_, i_4_);
		return new Class155_Sub4_Sub1(class106_sub1, i, i_2_, HashTable.nextPowerOfTwo(i, 1313417932), HashTable.nextPowerOfTwo(i_2_, 1902027652), is);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, int i_5_, int i_6_, boolean bool, int[] is, int i_7_, int i_8_) {
		super(class106_sub1, i, i_5_, i_6_, bool, is, i_7_, i_8_, true);
		((Class155_Sub4_Sub1) this).anInt11236 = i_5_;
		((Class155_Sub4_Sub1) this).anInt11232 = i_6_;
		if (((Class155_Sub4_Sub1) this).anInt1744 == 34037) {
			((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_6_;
			((Class155_Sub4_Sub1) this).aFloat11234 = (float) i_5_;
			((Class155_Sub4_Sub1) this).aBool11235 = false;
		} else {
			((Class155_Sub4_Sub1) this).aFloat11231 = 1.0F;
			((Class155_Sub4_Sub1) this).aFloat11234 = 1.0F;
			((Class155_Sub4_Sub1) this).aBool11235 = true;
		}
		((Class155_Sub4_Sub1) this).aBool11233 = false;
	}

	static Class155_Sub4_Sub1 method10178(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_9_, boolean bool, byte[] is, Class171 class171_10_) {
		if (((Class106_Sub1) class106_sub1).aBool10154 || (Class521.method6219(i, (byte) 71) && Class521.method6219(i_9_, (byte) 21)))
			return new Class155_Sub4_Sub1(class106_sub1, 3553, class171, class88, i, i_9_, bool, is, class171_10_);
		if (((Class106_Sub1) class106_sub1).aBool10169)
			return new Class155_Sub4_Sub1(class106_sub1, 34037, class171, class88, i, i_9_, bool, is, class171_10_);
		return new Class155_Sub4_Sub1(class106_sub1, class171, class88, i, i_9_, HashTable.nextPowerOfTwo(i, 161386233), HashTable.nextPowerOfTwo(i_9_, 1892257719), is, class171_10_);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool) {
		super(class106_sub1, i, i_11_, i_12_, i_13_, i_14_);
		((Class155_Sub4_Sub1) this).anInt11236 = i_13_;
		((Class155_Sub4_Sub1) this).anInt11232 = i_14_;
		if (((Class155_Sub4_Sub1) this).anInt1744 == 34037) {
			((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_14_;
			((Class155_Sub4_Sub1) this).aFloat11234 = (float) i_13_;
			((Class155_Sub4_Sub1) this).aBool11235 = false;
		} else {
			((Class155_Sub4_Sub1) this).aFloat11231 = 1.0F;
			((Class155_Sub4_Sub1) this).aFloat11234 = 1.0F;
			((Class155_Sub4_Sub1) this).aBool11235 = true;
		}
		((Class155_Sub4_Sub1) this).aBool11233 = false;
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, int i_15_, int i_16_, int i_17_, int[] is) {
		super(class106_sub1, 3553, Class171.aClass171_2071, Class88.aClass88_1218, i_16_, i_17_);
		((Class155_Sub4_Sub1) this).anInt11236 = i;
		((Class155_Sub4_Sub1) this).anInt11232 = i_15_;
		method9197(0, i_17_ - i_15_, i, i_15_, is, 0, 0, true);
		((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_15_ / (float) i_17_;
		((Class155_Sub4_Sub1) this).aFloat11234 = (float) i / (float) i_16_;
		((Class155_Sub4_Sub1) this).aBool11235 = false;
		((Class155_Sub4_Sub1) this).aBool11233 = true;
		method9195(false, false);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_18_, int i_19_, int i_20_) {
		super(class106_sub1, 3553, class171, class88, i_19_, i_20_);
		((Class155_Sub4_Sub1) this).anInt11236 = i;
		((Class155_Sub4_Sub1) this).anInt11232 = i_18_;
		((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_18_ / (float) i_20_;
		((Class155_Sub4_Sub1) this).aFloat11234 = (float) i / (float) i_19_;
		((Class155_Sub4_Sub1) this).aBool11235 = false;
		((Class155_Sub4_Sub1) this).aBool11233 = true;
		method9195(false, false);
	}

	void method2517(boolean bool) {
		super.method2517(bool && !((Class155_Sub4_Sub1) this).aBool11233);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_21_, int i_22_, int i_23_, byte[] is, Class171 class171_24_) {
		super(class106_sub1, 3553, class171, class88, i_22_, i_23_);
		((Class155_Sub4_Sub1) this).anInt11236 = i;
		((Class155_Sub4_Sub1) this).anInt11232 = i_21_;
		method9196(0, i_23_ - i_21_, i, i_21_, is, class171_24_, 0, 0, true);
		((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_21_ / (float) i_23_;
		((Class155_Sub4_Sub1) this).aFloat11234 = (float) i / (float) i_22_;
		((Class155_Sub4_Sub1) this).aBool11235 = false;
		((Class155_Sub4_Sub1) this).aBool11233 = true;
		method9195(false, false);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool) {
		super(class106_sub1, 3553, i, i_25_, i_28_, i_29_);
		((Class155_Sub4_Sub1) this).anInt11236 = i_26_;
		((Class155_Sub4_Sub1) this).anInt11232 = i_27_;
		((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_27_ / (float) i_29_;
		((Class155_Sub4_Sub1) this).aFloat11234 = (float) i_26_ / (float) i_28_;
		((Class155_Sub4_Sub1) this).aBool11235 = false;
		((Class155_Sub4_Sub1) this).aBool11233 = true;
		method9195(false, false);
	}

	Class155_Sub4_Sub1(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_30_, int i_31_, boolean bool, byte[] is, Class171 class171_32_) {
		super(class106_sub1, i, class171, class88, i_30_, i_31_, bool, is, class171_32_, true);
		((Class155_Sub4_Sub1) this).anInt11236 = i_30_;
		((Class155_Sub4_Sub1) this).anInt11232 = i_31_;
		if (((Class155_Sub4_Sub1) this).anInt1744 == 34037) {
			((Class155_Sub4_Sub1) this).aFloat11231 = (float) i_31_;
			((Class155_Sub4_Sub1) this).aFloat11234 = (float) i_30_;
			((Class155_Sub4_Sub1) this).aBool11235 = false;
		} else {
			((Class155_Sub4_Sub1) this).aFloat11231 = 1.0F;
			((Class155_Sub4_Sub1) this).aFloat11234 = 1.0F;
			((Class155_Sub4_Sub1) this).aBool11235 = true;
		}
		((Class155_Sub4_Sub1) this).aBool11233 = false;
	}

	static Class155_Sub4_Sub1 method10179(Class106_Sub1 class106_sub1, int i, int i_33_, int i_34_, int i_35_) {
		if (((Class106_Sub1) class106_sub1).aBool10154 || (Class521.method6219(i_34_, (byte) 120) && Class521.method6219(i_35_, (byte) 101)))
			return new Class155_Sub4_Sub1(class106_sub1, 3553, i, i_33_, i_34_, i_35_, true);
		if (((Class106_Sub1) class106_sub1).aBool10169)
			return new Class155_Sub4_Sub1(class106_sub1, 34037, i, i_33_, i_34_, i_35_, true);
		return new Class155_Sub4_Sub1(class106_sub1, i, i_33_, i_34_, i_35_, HashTable.nextPowerOfTwo(i_34_, 1859134007), HashTable.nextPowerOfTwo(i_35_, 1737684241), true);
	}

	static Class155_Sub4_Sub1 method10180(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_36_) {
		if (((Class106_Sub1) class106_sub1).aBool10154 || (Class521.method6219(i, (byte) 70) && Class521.method6219(i_36_, (byte) 72)))
			return new Class155_Sub4_Sub1(class106_sub1, 3553, class171, class88, i, i_36_);
		if (((Class106_Sub1) class106_sub1).aBool10169)
			return new Class155_Sub4_Sub1(class106_sub1, 34037, class171, class88, i, i_36_);
		return new Class155_Sub4_Sub1(class106_sub1, class171, class88, i, i_36_, HashTable.nextPowerOfTwo(i, 1641549518), HashTable.nextPowerOfTwo(i_36_, 1199150092));
	}
}
