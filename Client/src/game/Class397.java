package game;

/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class397 implements Interface15 {
	public VarBitDefinition method98(int i) {
		return ((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i, -193478294));
	}

	public VarBitDefinition method99(int i) {
		return ((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i, 1534768779));
	}

	public VarBitDefinition method95(int i, int i_0_) {
		return ((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i, 279091159));
	}

	public VarDefinition method94(VarDomainType class272, int i, byte i_1_) {
		return (VarDefinition) ((Interface18) Class196.aMap2354.get(class272)).getDefinition(i, -347892968);
	}

	public VarDefinition method97(VarDomainType class272, int i) {
		return (VarDefinition) ((Interface18) Class196.aMap2354.get(class272)).getDefinition(i, 140001582);
	}

	public VarDefinition method96(VarDomainType class272, int i) {
		return (VarDefinition) ((Interface18) Class196.aMap2354.get(class272)).getDefinition(i, -77746348);
	}

	static void method4760(int i) {
		if (null == Class460.anIntArray4096)
			Class460.anIntArray4096 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < 512; i_3_++) {
			float f = ((float) (i_3_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_4_ = 0.0625F + (float) (i_3_ & 0x7) / 8.0F;
			for (int i_5_ = 0; i_5_ < 128; i_5_++) {
				float f_6_ = (float) i_5_ / 128.0F;
				float f_7_ = 0.0F;
				float f_8_ = 0.0F;
				float f_9_ = 0.0F;
				float f_10_ = f / 60.0F;
				int i_11_ = (int) f_10_;
				int i_12_ = i_11_ % 6;
				float f_13_ = f_10_ - (float) i_11_;
				float f_14_ = f_6_ * (1.0F - f_4_);
				float f_15_ = f_6_ * (1.0F - f_13_ * f_4_);
				float f_16_ = f_6_ * (1.0F - (1.0F - f_13_) * f_4_);
				if (i_12_ == 0) {
					f_7_ = f_6_;
					f_8_ = f_16_;
					f_9_ = f_14_;
				} else if (1 == i_12_) {
					f_7_ = f_15_;
					f_8_ = f_6_;
					f_9_ = f_14_;
				} else if (i_12_ == 2) {
					f_7_ = f_14_;
					f_8_ = f_6_;
					f_9_ = f_16_;
				} else if (3 == i_12_) {
					f_7_ = f_14_;
					f_8_ = f_15_;
					f_9_ = f_6_;
				} else if (i_12_ == 4) {
					f_7_ = f_16_;
					f_8_ = f_14_;
					f_9_ = f_6_;
				} else if (i_12_ == 5) {
					f_7_ = f_6_;
					f_8_ = f_14_;
					f_9_ = f_15_;
				}
				f_7_ = (float) Math.pow((double) f_7_, d);
				f_8_ = (float) Math.pow((double) f_8_, d);
				f_9_ = (float) Math.pow((double) f_9_, d);
				int i_17_ = (int) (256.0F * f_7_);
				int i_18_ = (int) (256.0F * f_8_);
				int i_19_ = (int) (256.0F * f_9_);
				int i_20_ = i_19_ + (-16777216 + (i_17_ << 16) + (i_18_ << 8));
				Class460.anIntArray4096[i_2_++] = i_20_;
			}
		}
	}

	static final void method4761(Cs2Executor class441, int i) {
		if (Class637.aBool8266 && Class554.aFrame6320 != null)
			Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(1029303552), -1, -1, false, 623786968);
		if (Class554.method6557(-1735190722) == Class578.aClass578_7670) {
			Class614.method7367(239906896);
			System.exit(0);
		} else
			Class414.method5086((short) -22197);
	}

	public static String method4762(int i, boolean bool, int i_21_) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class243.method3344(i, 10, bool, (short) 12108);
	}

	static final void method4763(Cs2Executor class441, int i) {
		Class572_Sub17 class572_sub17 = Class12.method563(((Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581])), 1231143488);
		((Cs2Executor) class441).intStackPtr -= 126695836;
		class572_sub17.anInt9123 += 280995799 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		class572_sub17.anInt9126 += ((((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 1365537015);
		class572_sub17.anInt9127 += ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]) * 664138447);
		class572_sub17.anInt9124 += (-683445149 * (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]));
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = class572_sub17;
	}
}
