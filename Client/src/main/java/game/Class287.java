package game;

/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class287 implements Interface21 {
	protected static int anInt3421;

	static void method3870(int[] is, float[] fs, float[] fs_0_, int i, int i_1_, int i_2_) {
		if (i < i_1_) {
			int i_3_ = (i_1_ + i) / 2;
			int i_4_ = i;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			float f = fs[i_3_];
			fs[i_3_] = fs[i_1_];
			fs[i_1_] = f;
			float f_6_ = fs_0_[i_3_];
			fs_0_[i_3_] = fs_0_[i_1_];
			fs_0_[i_1_] = f_6_;
			int i_7_ = (long) i_5_ == 9223372036854775807L ? 0 : 1;
			for (int i_8_ = i; i_8_ < i_1_; i_8_++) {
				if (is[i_8_] < (i_8_ & i_7_) + i_5_) {
					int i_9_ = is[i_8_];
					is[i_8_] = is[i_4_];
					is[i_4_] = i_9_;
					float f_10_ = fs[i_8_];
					fs[i_8_] = fs[i_4_];
					fs[i_4_] = f_10_;
					float f_11_ = fs_0_[i_8_];
					fs_0_[i_8_] = fs_0_[i_4_];
					fs_0_[i_4_] = f_11_;
					i_4_++;
				}
			}
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			fs[i_1_] = fs[i_4_];
			fs[i_4_] = f;
			fs_0_[i_1_] = fs_0_[i_4_];
			fs_0_[i_4_] = f_6_;
			method3870(is, fs, fs_0_, i, i_4_ - 1, -189482145);
			method3870(is, fs, fs_0_, 1 + i_4_, i_1_, -1575900710);
		}
	}

	static void method3871(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = ((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), -479516519))).anInt4623 * 181253835;
	}

	static final void method3872(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class539.method6402(class73, class83, true, 0, class441, (byte) -109);
	}

	static final void method3873(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1500201679 * client.anInt8765;
	}

	static final void method3874(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(-1208884892);
	}

	static final void method3875(Cs2Executor class441, int i) {
		if (5 == client.anInt8580 * 835742603)
			Class633.aBool8198 = (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1;
	}

	static final void method3876(Cs2Executor class441, int i) {
		Class668 class668 = Class391.method4723(42314972);
		String string = Class133_Sub8.method9349(-1334384365);
		if (string == null)
			string = "";
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class668.getId(339355460);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	static final void method3877(InterfaceDefinitions[] class73s, int i, int i_12_) {
		for (int i_13_ = 0; i_13_ < class73s.length; i_13_++) {
			InterfaceDefinitions class73 = class73s[i_13_];
			if (class73 != null && class73.anInt768 * -1604592419 == i && !client.method8077(class73)) {
				if (0 == -1285279191 * class73.anInt752) {
					method3877(class73s, class73.selfId * -1718435171, -1482856541);
					if (class73.aClass73Array917 != null)
						method3877(class73.aClass73Array917, -1718435171 * class73.selfId, -1482856541);
					Class572_Sub29 class572_sub29 = ((Class572_Sub29) (client.aClass676_8760.get((long) (-1718435171 * class73.selfId))));
					if (null != class572_sub29)
						Class244.method3347((493419501 * class572_sub29.anInt9301), 1772258696);
				}
				if (-1285279191 * class73.anInt752 == 6 && class73.anInt926 * -1286545333 != -1) {
					if (class73.aClass663_915 == null) {
						class73.aClass663_915 = new Class663_Sub1();
						class73.aClass663_915.method7801((class73.anInt926 * -1286545333), 751680147);
					}
					if (class73.aClass663_915.method7802((855188961 * client.anInt8674), -650440638) && class73.aClass663_915.method7800(-24083291))
						class73.aClass663_915.method7799(1698061372);
				}
			}
		}
	}

	static final void method3878(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.anInt106 * -1586424751;
	}

	static final void method3879(int i, int i_14_, int i_15_, boolean bool, int i_16_) {
		if (Class569.method6760(i, null, -2015382405))
			Class133_Sub3.method9337((Class534.aClass83Array5975[i].aClass73Array1081), -1, i_14_, i_15_, bool, 2028169747);
	}
}
