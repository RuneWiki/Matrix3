package game;

/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class42 {
	int anInt426;
	int[] anIntArray427;
	int[] anIntArray428;
	boolean[][] aBoolArrayArray429;
	int[] anIntArray430;
	int[] anIntArray431;
	int[][] anIntArrayArray432;
	boolean[] aBoolArray433;
	int[][] anIntArrayArray434;
	int[] anIntArray435;
	Class79 aClass79_436;
	int[][] anIntArrayArray437;
	static int[] anIntArray438 = { 256, 128, 86, 64 };
	static float[] aFloatArray439 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F,
		2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
		4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F,
		1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F,
		2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F,
		5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F,
		1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F,
		2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F,
		5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
		1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
		2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F,
		6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F,
		0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F,
		0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F,
		0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
		0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F,
		0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
		0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F,
		0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F,
		0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	void method804(int i, int i_0_, int i_1_) {
		if (i < i_0_) {
			int i_2_ = i;
			int i_3_ = ((Class42) this).anIntArrayArray432[i_1_][i_2_];
			int i_4_ = ((Class42) this).anIntArrayArray434[i_1_][i_2_];
			boolean bool = ((Class42) this).aBoolArrayArray429[i_1_][i_2_];
			for (int i_5_ = i + 1; i_5_ <= i_0_; i_5_++) {
				int i_6_ = ((Class42) this).anIntArrayArray432[i_1_][i_5_];
				if (i_6_ < i_3_) {
					((Class42) this).anIntArrayArray432[i_1_][i_2_] = i_6_;
					((Class42) this).anIntArrayArray434[i_1_][i_2_] = ((Class42) this).anIntArrayArray434[i_1_][i_5_];
					((Class42) this).aBoolArrayArray429[i_1_][i_2_] = ((Class42) this).aBoolArrayArray429[i_1_][i_5_];
					i_2_++;
					((Class42) this).anIntArrayArray432[i_1_][i_5_] = ((Class42) this).anIntArrayArray432[i_1_][i_2_];
					((Class42) this).anIntArrayArray434[i_1_][i_5_] = ((Class42) this).anIntArrayArray434[i_1_][i_2_];
					((Class42) this).aBoolArrayArray429[i_1_][i_5_] = ((Class42) this).aBoolArrayArray429[i_1_][i_2_];
				}
			}
			((Class42) this).anIntArrayArray432[i_1_][i_2_] = i_3_;
			((Class42) this).anIntArrayArray434[i_1_][i_2_] = i_4_;
			((Class42) this).aBoolArrayArray429[i_1_][i_2_] = bool;
			method814(i, i_2_ - 1, i_1_);
			method814(i_2_ + 1, i_0_, i_1_);
		}
	}

	void method805(Class79 class79, int i) {
		((Class42) this).aClass79_436 = class79;
		int i_7_ = ((Class42) this).aClass79_436.method1197(16);
		if (i_7_ != 1)
			throw new RuntimeException();
		if (((Class42) this).aBoolArray433 == null || ((Class42) this).aBoolArray433.length != i)
			((Class42) this).aBoolArray433 = new boolean[i];
		else {
			for (int i_8_ = 0; i_8_ < ((Class42) this).aBoolArray433.length; i_8_++)
				((Class42) this).aBoolArray433[i_8_] = false;
		}
		int i_9_ = ((Class42) this).aClass79_436.method1197(5);
		int i_10_ = 0;
		if (((Class42) this).anIntArray428 == null || ((Class42) this).anIntArray428.length != i_9_)
			((Class42) this).anIntArray428 = new int[i_9_];
		else
			method813(((Class42) this).anIntArray428);
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			int i_12_ = ((Class42) this).aClass79_436.method1197(4);
			((Class42) this).anIntArray428[i_11_] = i_12_;
			if (i_12_ >= i_10_)
				i_10_ = i_12_ + 1;
		}
		if (((Class42) this).anIntArray430 == null || ((Class42) this).anIntArray430.length != i_10_)
			((Class42) this).anIntArray430 = new int[i_10_];
		else
			method813(((Class42) this).anIntArray430);
		if (((Class42) this).anIntArray427 == null || ((Class42) this).anIntArray427.length != i_10_)
			((Class42) this).anIntArray427 = new int[i_10_];
		else
			method813(((Class42) this).anIntArray427);
		if (((Class42) this).anIntArray431 == null || ((Class42) this).anIntArray431.length != i_10_)
			((Class42) this).anIntArray431 = new int[i_10_];
		else
			method813(((Class42) this).anIntArray431);
		if (((Class42) this).anIntArrayArray437 == null || ((Class42) this).anIntArrayArray437.length != i_10_)
			((Class42) this).anIntArrayArray437 = new int[i_10_][];
		for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
			((Class42) this).anIntArray430[i_13_] = ((Class42) this).aClass79_436.method1197(3) + 1;
			int i_14_ = (((Class42) this).anIntArray427[i_13_] = ((Class42) this).aClass79_436.method1197(2));
			if (i_14_ != 0)
				((Class42) this).anIntArray431[i_13_] = ((Class42) this).aClass79_436.method1197(8);
			i_14_ = 1 << i_14_;
			int[] is = new int[i_14_];
			((Class42) this).anIntArrayArray437[i_13_] = is;
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
				is[i_15_] = ((Class42) this).aClass79_436.method1197(8) - 1;
		}
		((Class42) this).anInt426 = ((Class42) this).aClass79_436.method1197(2) + 1;
		int i_16_ = ((Class42) this).aClass79_436.method1197(4);
		int i_17_ = 2;
		for (int i_18_ = 0; i_18_ < i_9_; i_18_++)
			i_17_ += (((Class42) this).anIntArray430[((Class42) this).anIntArray428[i_18_]]);
		if (((Class42) this).anIntArray435 == null || ((Class42) this).anIntArray435.length != i_17_)
			((Class42) this).anIntArray435 = new int[i_17_];
		else
			method813(((Class42) this).anIntArray435);
		((Class42) this).anIntArray435[0] = 0;
		((Class42) this).anIntArray435[1] = 1 << i_16_;
		i_17_ = 2;
		for (int i_19_ = 0; i_19_ < i_9_; i_19_++) {
			int i_20_ = ((Class42) this).anIntArray428[i_19_];
			for (int i_21_ = 0; i_21_ < ((Class42) this).anIntArray430[i_20_]; i_21_++)
				((Class42) this).anIntArray435[i_17_++] = ((Class42) this).aClass79_436.method1197(i_16_);
		}
		if (((Class42) this).anIntArrayArray432 == null || ((Class42) this).anIntArrayArray432.length < i_17_) {
			((Class42) this).anIntArrayArray432 = new int[i][i_17_];
			((Class42) this).anIntArrayArray434 = new int[i][i_17_];
			((Class42) this).aBoolArrayArray429 = new boolean[i][i_17_];
		}
	}

	static int method806(int[] is, int i) {
		int i_22_ = is[i];
		int i_23_ = -1;
		int i_24_ = -2147483648;
		for (int i_25_ = 0; i_25_ < i; i_25_++) {
			int i_26_ = is[i_25_];
			if (i_26_ < i_22_ && i_26_ > i_24_) {
				i_23_ = i_25_;
				i_24_ = i_26_;
			}
		}
		return i_23_;
	}

	static int method807(int[] is, int i) {
		int i_27_ = is[i];
		int i_28_ = -1;
		int i_29_ = 2147483647;
		for (int i_30_ = 0; i_30_ < i; i_30_++) {
			int i_31_ = is[i_30_];
			if (i_31_ > i_27_ && i_31_ < i_29_) {
				i_28_ = i_30_;
				i_29_ = i_31_;
			}
		}
		return i_28_;
	}

	int method808(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i_34_ - i_32_;
		int i_37_ = i_33_ - i;
		int i_38_ = i_36_ < 0 ? -i_36_ : i_36_;
		int i_39_ = i_38_ * (i_35_ - i);
		int i_40_ = i_39_ / i_37_;
		return i_36_ < 0 ? i_32_ - i_40_ : i_32_ + i_40_;
	}

	void method809(int i, int i_41_, int i_42_, int i_43_, Class61 class61, int i_44_) {
		int i_45_ = i_43_ - i_41_;
		int i_46_ = i_42_ - i;
		int i_47_ = i_45_ < 0 ? -i_45_ : i_45_;
		int i_48_ = i_45_ / i_46_;
		int i_49_ = i_41_;
		int i_50_ = 0;
		int i_51_ = i_45_ < 0 ? i_48_ - 1 : i_48_ + 1;
		i_47_ = i_47_ - (i_48_ < 0 ? -i_48_ : i_48_) * i_46_;
		((Class61) class61).aFloatArray541[i] *= aFloatArray439[i_49_];
		if (i_42_ > i_44_)
			i_42_ = i_44_;
		for (int i_52_ = i + 1; i_52_ < i_42_; i_52_++) {
			i_50_ += i_47_;
			if (i_50_ >= i_46_) {
				i_50_ -= i_46_;
				i_49_ += i_51_;
			} else
				i_49_ += i_48_;
			((Class61) class61).aFloatArray541[i_52_] *= aFloatArray439[i_49_];
		}
	}

	void method810(int i) {
		if (((Class42) this).aBoolArray433[i]) {
			int i_53_ = ((Class42) this).anIntArray435.length;
			int i_54_ = anIntArray438[((Class42) this).anInt426 - 1];
			boolean[] bools = ((Class42) this).aBoolArrayArray429[i];
			((Class42) this).aBoolArrayArray429[i][1] = true;
			bools[0] = true;
			for (int i_55_ = 2; i_55_ < i_53_; i_55_++) {
				int i_56_ = method806(((Class42) this).anIntArray435, i_55_);
				int i_57_ = method807(((Class42) this).anIntArray435, i_55_);
				int i_58_ = method808(((Class42) this).anIntArray435[i_56_], ((Class42) this).anIntArrayArray434[i][i_56_], ((Class42) this).anIntArray435[i_57_], ((Class42) this).anIntArrayArray434[i][i_57_], ((Class42) this).anIntArray435[i_55_]);
				int i_59_ = ((Class42) this).anIntArrayArray434[i][i_55_];
				int i_60_ = i_54_ - i_58_;
				int i_61_ = i_58_;
				int i_62_ = (i_60_ < i_61_ ? i_60_ : i_61_) << 1;
				if (i_59_ != 0) {
					boolean[] bools_63_ = ((Class42) this).aBoolArrayArray429[i];
					int i_64_ = i_56_;
					((Class42) this).aBoolArrayArray429[i][i_57_] = true;
					bools_63_[i_64_] = true;
					((Class42) this).aBoolArrayArray429[i][i_55_] = true;
					if (i_59_ >= i_62_)
						((Class42) this).anIntArrayArray434[i][i_55_] = (i_60_ > i_61_ ? i_59_ - i_61_ + i_58_ : i_58_ - i_59_ + i_60_ - 1);
					else
						((Class42) this).anIntArrayArray434[i][i_55_] = ((i_59_ & 0x1) != 0 ? i_58_ - (i_59_ + 1 >> 1) : i_58_ + (i_59_ >> 1));
				} else {
					((Class42) this).aBoolArrayArray429[i][i_55_] = false;
					((Class42) this).anIntArrayArray434[i][i_55_] = i_58_;
				}
			}
			for (int i_65_ = 0; i_65_ < i_53_; i_65_++) {
				if (!((Class42) this).aBoolArrayArray429[i][i_65_])
					((Class42) this).anIntArrayArray434[i][i_65_] = -1;
			}
		}
	}

	boolean method811(int i) {
		boolean bool = ((Class42) this).aClass79_436.method1196() != 0;
		((Class42) this).aBoolArray433[i] = bool;
		if (!bool)
			return false;
		int i_66_ = ((Class42) this).anIntArray435.length;
		for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
			((Class42) this).anIntArrayArray432[i][i_67_] = ((Class42) this).anIntArray435[i_67_];
		int i_68_ = anIntArray438[((Class42) this).anInt426 - 1];
		int i_69_ = Class522.method6220(i_68_ - 1, 1522398926);
		((Class42) this).anIntArrayArray434[i][0] = ((Class42) this).aClass79_436.method1197(i_69_);
		((Class42) this).anIntArrayArray434[i][1] = ((Class42) this).aClass79_436.method1197(i_69_);
		int i_70_ = 2;
		for (int i_71_ = 0; i_71_ < ((Class42) this).anIntArray428.length; i_71_++) {
			int i_72_ = ((Class42) this).anIntArray428[i_71_];
			int i_73_ = ((Class42) this).anIntArray430[i_72_];
			int i_74_ = ((Class42) this).anIntArray427[i_72_];
			int i_75_ = (1 << i_74_) - 1;
			int i_76_ = 0;
			if (i_74_ > 0)
				i_76_ = ((Class79) ((Class42) this).aClass79_436).aClass60Array1013[((Class42) this).anIntArray431[i_72_]].method1010(((Class42) this).aClass79_436);
			for (int i_77_ = 0; i_77_ < i_73_; i_77_++) {
				int i_78_ = (((Class42) this).anIntArrayArray437[i_72_][i_76_ & i_75_]);
				i_76_ >>>= i_74_;
				((Class42) this).anIntArrayArray434[i][i_70_] = (i_78_ >= 0 ? ((Class79) ((Class42) this).aClass79_436).aClass60Array1013[i_78_].method1010(((Class42) this).aClass79_436) : 0);
				i_70_++;
			}
		}
		return true;
	}

	Class42() {
		/* empty */
	}

	void method812(Class61 class61, int i, int i_79_) {
		if (((Class42) this).aBoolArray433[i_79_]) {
			int i_80_ = ((Class42) this).anIntArray435.length;
			method814(0, i_80_ - 1, i_79_);
			int i_81_ = 0;
			int i_82_ = (((Class42) this).anIntArrayArray434[i_79_][0] * ((Class42) this).anInt426);
			for (int i_83_ = 1; i_83_ < i_80_; i_83_++) {
				if (((Class42) this).anIntArrayArray434[i_79_][i_83_] >= 0) {
					int i_84_ = ((Class42) this).anIntArrayArray432[i_79_][i_83_];
					int i_85_ = (((Class42) this).anIntArrayArray434[i_79_][i_83_] * ((Class42) this).anInt426);
					method809(i_81_, i_82_, i_84_, i_85_, class61, i);
					if (i_84_ < i) {
						/* empty */
					}
					i_81_ = i_84_;
					i_82_ = i_85_;
				}
			}
			float f = aFloatArray439[i_82_];
			for (int i_86_ = i_81_; i_86_ < i; i_86_++)
				((Class61) class61).aFloatArray541[i_86_] *= f;
		}
	}

	void method813(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method814(int i, int i_87_, int i_88_) {
		if (i < i_87_) {
			int i_89_ = i;
			int i_90_ = ((Class42) this).anIntArrayArray432[i_88_][i_89_];
			int i_91_ = ((Class42) this).anIntArrayArray434[i_88_][i_89_];
			boolean bool = ((Class42) this).aBoolArrayArray429[i_88_][i_89_];
			for (int i_92_ = i + 1; i_92_ <= i_87_; i_92_++) {
				int i_93_ = ((Class42) this).anIntArrayArray432[i_88_][i_92_];
				if (i_93_ < i_90_) {
					((Class42) this).anIntArrayArray432[i_88_][i_89_] = i_93_;
					((Class42) this).anIntArrayArray434[i_88_][i_89_] = ((Class42) this).anIntArrayArray434[i_88_][i_92_];
					((Class42) this).aBoolArrayArray429[i_88_][i_89_] = ((Class42) this).aBoolArrayArray429[i_88_][i_92_];
					i_89_++;
					((Class42) this).anIntArrayArray432[i_88_][i_92_] = ((Class42) this).anIntArrayArray432[i_88_][i_89_];
					((Class42) this).anIntArrayArray434[i_88_][i_92_] = ((Class42) this).anIntArrayArray434[i_88_][i_89_];
					((Class42) this).aBoolArrayArray429[i_88_][i_92_] = ((Class42) this).aBoolArrayArray429[i_88_][i_89_];
				}
			}
			((Class42) this).anIntArrayArray432[i_88_][i_89_] = i_90_;
			((Class42) this).anIntArrayArray434[i_88_][i_89_] = i_91_;
			((Class42) this).aBoolArrayArray429[i_88_][i_89_] = bool;
			method814(i, i_89_ - 1, i_88_);
			method814(i_89_ + 1, i_87_, i_88_);
		}
	}

	void method815(int i, int i_94_, int i_95_) {
		if (i < i_94_) {
			int i_96_ = i;
			int i_97_ = ((Class42) this).anIntArrayArray432[i_95_][i_96_];
			int i_98_ = ((Class42) this).anIntArrayArray434[i_95_][i_96_];
			boolean bool = ((Class42) this).aBoolArrayArray429[i_95_][i_96_];
			for (int i_99_ = i + 1; i_99_ <= i_94_; i_99_++) {
				int i_100_ = ((Class42) this).anIntArrayArray432[i_95_][i_99_];
				if (i_100_ < i_97_) {
					((Class42) this).anIntArrayArray432[i_95_][i_96_] = i_100_;
					((Class42) this).anIntArrayArray434[i_95_][i_96_] = ((Class42) this).anIntArrayArray434[i_95_][i_99_];
					((Class42) this).aBoolArrayArray429[i_95_][i_96_] = ((Class42) this).aBoolArrayArray429[i_95_][i_99_];
					i_96_++;
					((Class42) this).anIntArrayArray432[i_95_][i_99_] = ((Class42) this).anIntArrayArray432[i_95_][i_96_];
					((Class42) this).anIntArrayArray434[i_95_][i_99_] = ((Class42) this).anIntArrayArray434[i_95_][i_96_];
					((Class42) this).aBoolArrayArray429[i_95_][i_99_] = ((Class42) this).aBoolArrayArray429[i_95_][i_96_];
				}
			}
			((Class42) this).anIntArrayArray432[i_95_][i_96_] = i_97_;
			((Class42) this).anIntArrayArray434[i_95_][i_96_] = i_98_;
			((Class42) this).aBoolArrayArray429[i_95_][i_96_] = bool;
			method814(i, i_96_ - 1, i_95_);
			method814(i_96_ + 1, i_94_, i_95_);
		}
	}

	void method816(int i) {
		if (((Class42) this).aBoolArray433[i]) {
			int i_101_ = ((Class42) this).anIntArray435.length;
			int i_102_ = anIntArray438[((Class42) this).anInt426 - 1];
			boolean[] bools = ((Class42) this).aBoolArrayArray429[i];
			((Class42) this).aBoolArrayArray429[i][1] = true;
			bools[0] = true;
			for (int i_103_ = 2; i_103_ < i_101_; i_103_++) {
				int i_104_ = method806(((Class42) this).anIntArray435, i_103_);
				int i_105_ = method807(((Class42) this).anIntArray435, i_103_);
				int i_106_ = method808(((Class42) this).anIntArray435[i_104_], ((Class42) this).anIntArrayArray434[i][i_104_], ((Class42) this).anIntArray435[i_105_], ((Class42) this).anIntArrayArray434[i][i_105_], ((Class42) this).anIntArray435[i_103_]);
				int i_107_ = ((Class42) this).anIntArrayArray434[i][i_103_];
				int i_108_ = i_102_ - i_106_;
				int i_109_ = i_106_;
				int i_110_ = (i_108_ < i_109_ ? i_108_ : i_109_) << 1;
				if (i_107_ != 0) {
					boolean[] bools_111_ = ((Class42) this).aBoolArrayArray429[i];
					int i_112_ = i_104_;
					((Class42) this).aBoolArrayArray429[i][i_105_] = true;
					bools_111_[i_112_] = true;
					((Class42) this).aBoolArrayArray429[i][i_103_] = true;
					if (i_107_ >= i_110_)
						((Class42) this).anIntArrayArray434[i][i_103_] = (i_108_ > i_109_ ? i_107_ - i_109_ + i_106_ : i_106_ - i_107_ + i_108_ - 1);
					else
						((Class42) this).anIntArrayArray434[i][i_103_] = ((i_107_ & 0x1) != 0 ? i_106_ - (i_107_ + 1 >> 1) : i_106_ + (i_107_ >> 1));
				} else {
					((Class42) this).aBoolArrayArray429[i][i_103_] = false;
					((Class42) this).anIntArrayArray434[i][i_103_] = i_106_;
				}
			}
			for (int i_113_ = 0; i_113_ < i_101_; i_113_++) {
				if (!((Class42) this).aBoolArrayArray429[i][i_113_])
					((Class42) this).anIntArrayArray434[i][i_113_] = -1;
			}
		}
	}

	void method817(int i) {
		if (((Class42) this).aBoolArray433[i]) {
			int i_114_ = ((Class42) this).anIntArray435.length;
			int i_115_ = anIntArray438[((Class42) this).anInt426 - 1];
			boolean[] bools = ((Class42) this).aBoolArrayArray429[i];
			((Class42) this).aBoolArrayArray429[i][1] = true;
			bools[0] = true;
			for (int i_116_ = 2; i_116_ < i_114_; i_116_++) {
				int i_117_ = method806(((Class42) this).anIntArray435, i_116_);
				int i_118_ = method807(((Class42) this).anIntArray435, i_116_);
				int i_119_ = method808(((Class42) this).anIntArray435[i_117_], ((Class42) this).anIntArrayArray434[i][i_117_], ((Class42) this).anIntArray435[i_118_], ((Class42) this).anIntArrayArray434[i][i_118_], ((Class42) this).anIntArray435[i_116_]);
				int i_120_ = ((Class42) this).anIntArrayArray434[i][i_116_];
				int i_121_ = i_115_ - i_119_;
				int i_122_ = i_119_;
				int i_123_ = (i_121_ < i_122_ ? i_121_ : i_122_) << 1;
				if (i_120_ != 0) {
					boolean[] bools_124_ = ((Class42) this).aBoolArrayArray429[i];
					int i_125_ = i_117_;
					((Class42) this).aBoolArrayArray429[i][i_118_] = true;
					bools_124_[i_125_] = true;
					((Class42) this).aBoolArrayArray429[i][i_116_] = true;
					if (i_120_ >= i_123_)
						((Class42) this).anIntArrayArray434[i][i_116_] = (i_121_ > i_122_ ? i_120_ - i_122_ + i_119_ : i_119_ - i_120_ + i_121_ - 1);
					else
						((Class42) this).anIntArrayArray434[i][i_116_] = ((i_120_ & 0x1) != 0 ? i_119_ - (i_120_ + 1 >> 1) : i_119_ + (i_120_ >> 1));
				} else {
					((Class42) this).aBoolArrayArray429[i][i_116_] = false;
					((Class42) this).anIntArrayArray434[i][i_116_] = i_119_;
				}
			}
			for (int i_126_ = 0; i_126_ < i_114_; i_126_++) {
				if (!((Class42) this).aBoolArrayArray429[i][i_126_])
					((Class42) this).anIntArrayArray434[i][i_126_] = -1;
			}
		}
	}
}
