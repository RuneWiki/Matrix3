package game;

/* Class102_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102_Sub3 extends Class102 {
	int[] anIntArray10346;
	Class106_Sub2 aClass106_Sub2_10347;
	Class161[] aClass161Array10348;
	Class161[] aClass161Array10349;
	int[] anIntArray10350;
	int[] anIntArray10351;
	int[] anIntArray10352;

	void method1621(char c, int i, int i_0_, int i_1_, boolean bool, Class167 class167, int i_2_, int i_3_) {
		/* empty */
	}

	void method1609(char c, int i, int i_4_, int i_5_, boolean bool) {
		if ((((Class106_Sub2) ((Class102_Sub3) this).aClass106_Sub2_10347).anIntArray10218) != null) {
			i += ((Class102_Sub3) this).anIntArray10352[c];
			i_4_ += ((Class102_Sub3) this).anIntArray10351[c];
			if (bool)
				((Class102_Sub3) this).aClass161Array10348[c].method2619(i, i_4_, 1, i_5_, 1);
			else
				((Class102_Sub3) this).aClass161Array10349[c].method2619(i, i_4_, 1, i_5_, 1);
		}
	}

	void method1623(char c, int i, int i_6_, int i_7_, boolean bool, Class167 class167, int i_8_, int i_9_) {
		/* empty */
	}

	Class102_Sub3(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub2[] class87_sub2s, int[] is, int[] is_10_) {
		super(class106_sub2, class284);
		((Class102_Sub3) this).aClass106_Sub2_10347 = class106_sub2;
		((Class102_Sub3) this).aClass106_Sub2_10347 = class106_sub2;
		((Class102_Sub3) this).anIntArray10350 = is;
		((Class102_Sub3) this).anIntArray10346 = is_10_;
		((Class102_Sub3) this).aClass161Array10349 = new Class161[class87_sub2s.length];
		((Class102_Sub3) this).aClass161Array10348 = new Class161[class87_sub2s.length];
		((Class102_Sub3) this).anIntArray10351 = new int[class87_sub2s.length];
		((Class102_Sub3) this).anIntArray10352 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			((Class102_Sub3) this).aClass161Array10349[i] = ((Class102_Sub3) this).aClass106_Sub2_10347.method1711(class87_sub2s[i], false);
			int[] is_11_ = (int[]) class87_sub2s[i].method1285(false).clone();
			for (int i_12_ = 0; i_12_ < is_11_.length; i_12_++) {
				int i_13_ = is_11_[i_12_];
				int i_14_ = (byte) (((i_13_ >> 8 & 0xff) * 4 + 3 * (i_13_ >> 16 & 0xff) + (i_13_ & 0xff)) >> 3);
				is_11_[i_12_] = (is_11_[i_12_] & ~0xffffff | i_14_ << 16 | i_14_ << 8 | i_14_);
			}
			((Class102_Sub3) this).aClass161Array10348[i] = (((Class102_Sub3) this).aClass106_Sub2_10347.method1960(is_11_, 0, ((Class102_Sub3) this).anIntArray10350[i], ((Class102_Sub3) this).anIntArray10350[i], ((Class102_Sub3) this).anIntArray10346[i], false));
			((Class102_Sub3) this).anIntArray10351[i] = class87_sub2s[i].method1288();
			((Class102_Sub3) this).anIntArray10352[i] = class87_sub2s[i].method1286();
		}
	}

	void method1622(char c, int i, int i_15_, int i_16_, boolean bool) {
		if ((((Class106_Sub2) ((Class102_Sub3) this).aClass106_Sub2_10347).anIntArray10218) != null) {
			i += ((Class102_Sub3) this).anIntArray10352[c];
			i_15_ += ((Class102_Sub3) this).anIntArray10351[c];
			if (bool)
				((Class102_Sub3) this).aClass161Array10348[c].method2619(i, i_15_, 1, i_16_, 1);
			else
				((Class102_Sub3) this).aClass161Array10349[c].method2619(i, i_15_, 1, i_16_, 1);
		}
	}

	void method1624(char c, int i, int i_17_, int i_18_, boolean bool, Class167 class167, int i_19_, int i_20_) {
		/* empty */
	}

	void method1625(char c, int i, int i_21_, int i_22_, boolean bool, Class167 class167, int i_23_, int i_24_) {
		/* empty */
	}

	public static void method9564(Entity class456_sub1_sub2_sub3, int[] is, int[] is_25_, int[] is_26_, byte i) {
		for (int i_27_ = 0; i_27_ < is.length; i_27_++) {
			int i_28_ = is[i_27_];
			int i_29_ = is_26_[i_27_];
			int i_30_ = is_25_[i_27_];
			for (int i_31_ = 0; 0 != i_29_ && i_31_ < (class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650).length; i_29_ >>>= 1) {
				if ((i_29_ & 0x1) != 0) {
					if (-1 == i_28_)
						class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_31_] = null;
					else {
						AnimationDefinition class132 = (AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_28_, 1040658852);
						int i_32_ = -730435523 * class132.anInt1558;
						Class663_Sub3_Sub1 class663_sub3_sub1 = (class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_31_]);
						if (class663_sub3_sub1 != null && class663_sub3_sub1.method7786(-476021966)) {
							if (i_28_ == class663_sub3_sub1.method7795(-1478180242)) {
								if (0 == i_32_) {
									class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_31_] = null;
									class663_sub3_sub1 = null;
								} else if (1 == i_32_) {
									class663_sub3_sub1.method7799(1145174470);
									class663_sub3_sub1.anInt11267 = i_30_ * -1120408503;
								} else if (i_32_ == 2)
									class663_sub3_sub1.method7831(-199494231);
							} else if (1882694951 * class132.priority >= ((class663_sub3_sub1.method7787(153948485).priority) * 1882694951)) {
								class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_31_] = null;
								class663_sub3_sub1 = null;
							}
						}
						if (class663_sub3_sub1 == null || !class663_sub3_sub1.method7786(1469704242)) {
							class663_sub3_sub1 = class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_31_] = (new Class663_Sub3_Sub1(class456_sub1_sub2_sub3));
							class663_sub3_sub1.method7801(i_28_, 751680147);
							class663_sub3_sub1.anInt11267 = -1120408503 * i_30_;
						}
					}
				}
				i_31_++;
			}
		}
	}
}
