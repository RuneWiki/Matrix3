package game;

/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class398 {
	public int anInt4692;
	static Class398 aClass398_4693;
	static Class398 aClass398_4694;
	static Class398 aClass398_4695;
	static Class398 aClass398_4696;
	static Class398 aClass398_4697;
	static Class398 aClass398_4698;
	static Class398 aClass398_4699;
	int anInt4700;
	static Class398 aClass398_4701;
	static Class398 aClass398_4702;
	static Class398 aClass398_4703;
	boolean aBool4704;
	static Class398 aClass398_4705;
	boolean aBool4706;
	static Class398 aClass398_4707;
	static Class398 aClass398_4708;
	static Class398 aClass398_4709;
	static Class398 aClass398_4710;
	Class279 aClass279_4711;
	Class279 aClass279_4712;
	int anInt4713;
	static Class398 aClass398_4714 = new Class398(0, Class279.aClass279_3072, 2);
	static Class398 aClass398_4715;
	static Class398 aClass398_4716;
	static String[] aStringArray4717;
	public static int anInt4718;

	static {
		aClass398_4693 = new Class398(1, Class279.aClass279_3072, Class279.aClass279_3072, 2, 3);
		aClass398_4694 = new Class398(2, Class279.aClass279_3072, 3);
		aClass398_4695 = new Class398(3, Class279.aClass279_3072, Class279.aClass279_3072, 3, 4);
		aClass398_4696 = new Class398(4, Class279.aClass279_3072, 4);
		aClass398_4697 = new Class398(5, Class279.aClass279_3072, Class279.aClass279_3072, 4, 5);
		aClass398_4698 = new Class398(6, Class279.aClass279_3072, Class279.aClass279_3072, 5, 98, true, true);
		aClass398_4699 = new Class398(7, Class279.aClass279_3072, 99);
		aClass398_4709 = new Class398(8, Class279.aClass279_3072, 100);
		aClass398_4716 = new Class398(9, Class279.aClass279_3124, Class279.aClass279_3124, 0, 92, true, true);
		aClass398_4702 = new Class398(10, Class279.aClass279_3124, Class279.aClass279_3124, 92, 93);
		aClass398_4703 = new Class398(11, Class279.aClass279_3124, Class279.aClass279_3124, 94, 95);
		aClass398_4701 = new Class398(12, Class279.aClass279_3124, Class279.aClass279_3124, 96, 97);
		aClass398_4705 = new Class398(13, Class279.aClass279_3124, 97);
		aClass398_4710 = new Class398(14, Class279.aClass279_3124, 97);
		aClass398_4707 = new Class398(15, Class279.aClass279_3124, 100);
		aClass398_4708 = new Class398(16, Class279.aClass279_3124, 100);
		aClass398_4715 = new Class398(17, Class279.aClass279_3124, 100);
	}

	Class398(int i, Class279 class279, int i_0_) {
		this(i, class279, class279, i_0_, i_0_, true, false);
	}

	static Class398[] method4764(int i) {
		return (new Class398[] { aClass398_4714, aClass398_4693, aClass398_4694, aClass398_4695, aClass398_4696, aClass398_4697, aClass398_4698, aClass398_4699, aClass398_4709, aClass398_4716,
			aClass398_4702, aClass398_4703, aClass398_4701, aClass398_4705, aClass398_4710, aClass398_4707, aClass398_4708, aClass398_4715 });
	}

	Class398(int i, Class279 class279, Class279 class279_1_, int i_2_, int i_3_, boolean bool, boolean bool_4_) {
		anInt4692 = i * 1335744189;
		((Class398) this).aClass279_4711 = class279;
		((Class398) this).aClass279_4712 = class279_1_;
		((Class398) this).anInt4713 = i_2_ * 87058245;
		((Class398) this).anInt4700 = i_3_ * -89110377;
		((Class398) this).aBool4706 = bool;
		((Class398) this).aBool4704 = bool_4_;
	}

	Class398(int i, Class279 class279, Class279 class279_5_, int i_6_, int i_7_) {
		this(i, class279, class279_5_, i_6_, i_7_, true, false);
	}

	static void method4765(int i, int i_8_, int i_9_) {
		if (JS5ConfigGroup.aClass484_2593.aBool5395 || (357782167 * Class25.anInt172 != 1 && (!Class212.aBool2460 || 2 != 357782167 * Class25.anInt172 || !(((Class572_Sub12_Sub10) Class88.aClass572_Sub12_Sub10_1224).aString11393.equals(Class279.aClass279_3084.method3758((Class594.aClass435_7823), 16711935)))))) {
			Class284 class284 = VarBitDefinition.method5230(-978705416);
			int i_10_ = (class284.method3832(Class279.aClass279_3081.method3758(Class594.aClass435_7823, 16711935), (byte) 100));
			int i_11_;
			if (!Class25.aBool166) {
				for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); null != class572_sub12_sub10; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(241285887))) {
					int i_12_ = Class86.method1278(class572_sub12_sub10, class284, (byte) 28);
					if (i_12_ > i_10_)
						i_10_ = i_12_;
				}
				i_10_ += 8;
				i_11_ = Class25.anInt172 * 357782167 * (Class25.anInt162 * -211596715) + 21;
				Class665_Sub31.anInt9619 = (357782167 * Class25.anInt172 * (-211596715 * Class25.anInt162) + (Class25.aBool191 ? 26 : 22)) * -1739332603;
			} else {
				for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7848(-1042067865)); class572_sub12_sub19 != null; class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7845(-1672160182))) {
					int i_13_;
					if (1 == 944917463 * ((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482)
						i_13_ = Class86.method1278(((Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)), class284, (byte) 28);
					else
						i_13_ = Class639_Sub7.method8915(class572_sub12_sub19, class284, 1228216313);
					if (i_13_ > i_10_)
						i_10_ = i_13_;
				}
				i_10_ += 8;
				i_11_ = 21 + (Class25.anInt162 * -211596715 * (234065809 * Class25.anInt173));
				Class665_Sub31.anInt9619 = -1739332603 * ((234065809 * Class25.anInt173 * (-211596715 * Class25.anInt162)) + (Class25.aBool191 ? 26 : 22));
			}
			i_10_ += 10;
			int i_14_ = i - i_10_ / 2;
			if (i_10_ + i_14_ > 1960824389 * Class269.anInt2861)
				i_14_ = Class269.anInt2861 * 1960824389 - i_10_;
			if (i_14_ < 0)
				i_14_ = 0;
			int i_15_ = i_8_;
			if (i_15_ + i_11_ > Class584.anInt7739 * -530390519)
				i_15_ = -530390519 * Class584.anInt7739 - i_11_;
			if (i_15_ < 0)
				i_15_ = 0;
			Class442.anInt5133 = i_14_ * 1860412183;
			Class202_Sub1.anInt9650 = i_15_ * -916314729;
			Class25.anInt180 = 895743503 * i_10_;
			Class25.anInt192 = (int) (Math.random() * 24.0) * 1570174409;
			Class25.aBool165 = true;
		}
	}

	static final void method4766(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		long l = (long) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		long l_16_ = (long) (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (l + l_16_ * l / 100L);
	}

	public static Class572_Sub13_Sub1 method4767(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
		synchronized (Class572_Sub13_Sub1.aClass572_Sub13_Sub1Array11364) {
			Class572_Sub13_Sub1 class572_sub13_sub1;
			if (0 == 1684094803 * Class133_Sub3.anInt9832)
				class572_sub13_sub1 = new Class572_Sub13_Sub1();
			else
				class572_sub13_sub1 = (Class572_Sub13_Sub1.aClass572_Sub13_Sub1Array11364[(Class133_Sub3.anInt9832 -= 287268059) * 1684094803]);
			((Class572_Sub13_Sub1) class572_sub13_sub1).anInt11334 = i * -879690673;
			((Class572_Sub13_Sub1) class572_sub13_sub1).anInt11365 = -1972408767 * i_17_;
			((Class572_Sub13_Sub1) class572_sub13_sub1).anInt11337 = i_18_ * -619581573;
			((Class572_Sub13_Sub1) class572_sub13_sub1).anInt11362 = i_19_ * 1166468223;
			((Class572_Sub13_Sub1) class572_sub13_sub1).aLong11363 = Class69.method1067(-1625605476) * -1638790109011361685L;
			Class572_Sub13_Sub1 class572_sub13_sub1_21_ = class572_sub13_sub1;
			return class572_sub13_sub1_21_;
		}
	}
}
