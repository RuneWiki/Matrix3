package game;

/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60 {
	float[][] aFloatArrayArray533;
	int[] anIntArray534;
	int anInt535;
	int anInt536;
	int[] anIntArray537;
	int anInt538 = 0;
	int anInt539 = 0;
	int[] anIntArray540;

	static int method1007(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1; Class109.method2068(i_1_, i_0_, (byte) 52) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	void method1008(Class79 class79) {
		class79.method1197(((Class60) this).anInt538 * 8 + ((Class60) this).anInt539);
	}

	void method1009(Class79 class79) {
		int i = class79.method1194();
		int i_2_ = class79.method1193();
		class79.method1197(24);
		((Class60) this).anInt536 = class79.method1197(16);
		((Class60) this).anInt535 = class79.method1197(24);
		if (((Class60) this).anIntArray534 == null || (((Class60) this).anIntArray534.length != ((Class60) this).anInt535))
			((Class60) this).anIntArray534 = new int[((Class60) this).anInt535];
		boolean bool = class79.method1196() != 0;
		if (bool) {
			int i_3_ = 0;
			int i_4_ = class79.method1197(5) + 1;
			while (i_3_ < ((Class60) this).anInt535) {
				int i_5_ = class79.method1197(Class522.method6220(((((Class60) this).anInt535) - i_3_), -1900694424));
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
					((Class60) this).anIntArray534[i_3_++] = i_4_;
				i_4_++;
			}
		} else {
			boolean bool_7_ = class79.method1196() != 0;
			for (int i_8_ = 0; i_8_ < ((Class60) this).anInt535; i_8_++) {
				if (bool_7_ && class79.method1196() == 0)
					((Class60) this).anIntArray534[i_8_] = 0;
				else
					((Class60) this).anIntArray534[i_8_] = class79.method1197(5) + 1;
			}
		}
		method1016();
		int i_9_ = class79.method1197(4);
		if (i_9_ > 0) {
			float f = class79.method1191(class79.method1197(32));
			float f_10_ = class79.method1191(class79.method1197(32));
			int i_11_ = class79.method1197(4) + 1;
			boolean bool_12_ = class79.method1196() != 0;
			int i_13_;
			if (i_9_ == 1)
				i_13_ = method1007(((Class60) this).anInt535, ((Class60) this).anInt536);
			else
				i_13_ = ((Class60) this).anInt535 * ((Class60) this).anInt536;
			((Class60) this).anIntArray537 = new int[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				((Class60) this).anIntArray537[i_14_] = class79.method1197(i_11_);
			((Class60) this).aFloatArrayArray533 = (new float[((Class60) this).anInt535][((Class60) this).anInt536]);
			if (i_9_ == 1) {
				for (int i_15_ = 0; i_15_ < ((Class60) this).anInt535; i_15_++) {
					float f_16_ = 0.0F;
					int i_17_ = 1;
					for (int i_18_ = 0; i_18_ < ((Class60) this).anInt536; i_18_++) {
						int i_19_ = i_15_ / i_17_ % i_13_;
						float f_20_ = (((float) ((Class60) this).anIntArray537[i_19_] * f_10_) + f + f_16_);
						((Class60) this).aFloatArrayArray533[i_15_][i_18_] = f_20_;
						if (bool_12_)
							f_16_ = f_20_;
						i_17_ *= i_13_;
					}
				}
			} else {
				for (int i_21_ = 0; i_21_ < ((Class60) this).anInt535; i_21_++) {
					float f_22_ = 0.0F;
					int i_23_ = i_21_ * ((Class60) this).anInt536;
					for (int i_24_ = 0; i_24_ < ((Class60) this).anInt536; i_24_++) {
						float f_25_ = (((float) ((Class60) this).anIntArray537[i_23_] * f_10_) + f + f_22_);
						((Class60) this).aFloatArrayArray533[i_21_][i_24_] = f_25_;
						if (bool_12_)
							f_22_ = f_25_;
						i_23_++;
					}
				}
			}
		}
		((Class60) this).anInt539 = class79.method1194() - i;
		((Class60) this).anInt538 = class79.method1193() - i_2_;
	}

	int method1010(Class79 class79) {
		int i;
		for (i = 0; ((Class60) this).anIntArray540[i] >= 0; i = (class79.method1196() != 0 ? ((Class60) this).anIntArray540[i] : i + 1)) {
			/* empty */
		}
		return ((Class60) this).anIntArray540[i] ^ 0xffffffff;
	}

	static int method1011(int i, int i_26_) {
		int i_27_;
		for (i_27_ = (int) Math.pow((double) i, 1.0 / (double) i_26_) + 1; Class109.method2068(i_27_, i_26_, (byte) 30) > i; i_27_--) {
			/* empty */
		}
		return i_27_;
	}

	Class60() {
		/* empty */
	}

	static int method1012(int i, int i_28_) {
		int i_29_;
		for (i_29_ = (int) Math.pow((double) i, 1.0 / (double) i_28_) + 1; Class109.method2068(i_29_, i_28_, (byte) 48) > i; i_29_--) {
			/* empty */
		}
		return i_29_;
	}

	static int method1013(int i, int i_30_) {
		int i_31_;
		for (i_31_ = (int) Math.pow((double) i, 1.0 / (double) i_30_) + 1; Class109.method2068(i_31_, i_30_, (byte) 58) > i; i_31_--) {
			/* empty */
		}
		return i_31_;
	}

	float[] method1014(Class79 class79) {
		return ((Class60) this).aFloatArrayArray533[method1010(class79)];
	}

	void method1015() {
		int[] is = new int[((Class60) this).anInt535];
		int[] is_32_ = new int[33];
		for (int i = 0; i < ((Class60) this).anInt535; i++) {
			int i_33_ = ((Class60) this).anIntArray534[i];
			if (i_33_ != 0) {
				int i_34_ = 1 << 32 - i_33_;
				int i_35_ = is_32_[i_33_];
				is[i] = i_35_;
				int i_36_;
				if ((i_35_ & i_34_) != 0)
					i_36_ = is_32_[i_33_ - 1];
				else {
					i_36_ = i_35_ | i_34_;
					for (int i_37_ = i_33_ - 1; i_37_ >= 1; i_37_--) {
						int i_38_ = is_32_[i_37_];
						if (i_38_ != i_35_)
							break;
						int i_39_ = 1 << 32 - i_37_;
						if ((i_38_ & i_39_) != 0) {
							is_32_[i_37_] = is_32_[i_37_ - 1];
							break;
						}
						is_32_[i_37_] = i_38_ | i_39_;
					}
				}
				is_32_[i_33_] = i_36_;
				for (int i_40_ = i_33_ + 1; i_40_ <= 32; i_40_++) {
					int i_41_ = is_32_[i_40_];
					if (i_41_ == i_35_)
						is_32_[i_40_] = i_36_;
				}
			}
		}
		((Class60) this).anIntArray540 = new int[8];
		int i = 0;
		for (int i_42_ = 0; i_42_ < ((Class60) this).anInt535; i_42_++) {
			int i_43_ = ((Class60) this).anIntArray534[i_42_];
			if (i_43_ != 0) {
				int i_44_ = is[i_42_];
				int i_45_ = 0;
				for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
					int i_47_ = -2147483648 >>> i_46_;
					if ((i_44_ & i_47_) != 0) {
						if (((Class60) this).anIntArray540[i_45_] == 0)
							((Class60) this).anIntArray540[i_45_] = i;
						i_45_ = ((Class60) this).anIntArray540[i_45_];
					} else
						i_45_++;
					if (i_45_ >= ((Class60) this).anIntArray540.length) {
						int[] is_48_ = (new int[((Class60) this).anIntArray540.length * 2]);
						for (int i_49_ = 0; i_49_ < ((Class60) this).anIntArray540.length; i_49_++)
							is_48_[i_49_] = ((Class60) this).anIntArray540[i_49_];
						((Class60) this).anIntArray540 = is_48_;
					}
					i_47_ >>>= 1;
				}
				((Class60) this).anIntArray540[i_45_] = i_42_ ^ 0xffffffff;
				if (i_45_ >= i)
					i = i_45_ + 1;
			}
		}
	}

	void method1016() {
		int[] is = new int[((Class60) this).anInt535];
		int[] is_50_ = new int[33];
		for (int i = 0; i < ((Class60) this).anInt535; i++) {
			int i_51_ = ((Class60) this).anIntArray534[i];
			if (i_51_ != 0) {
				int i_52_ = 1 << 32 - i_51_;
				int i_53_ = is_50_[i_51_];
				is[i] = i_53_;
				int i_54_;
				if ((i_53_ & i_52_) != 0)
					i_54_ = is_50_[i_51_ - 1];
				else {
					i_54_ = i_53_ | i_52_;
					for (int i_55_ = i_51_ - 1; i_55_ >= 1; i_55_--) {
						int i_56_ = is_50_[i_55_];
						if (i_56_ != i_53_)
							break;
						int i_57_ = 1 << 32 - i_55_;
						if ((i_56_ & i_57_) != 0) {
							is_50_[i_55_] = is_50_[i_55_ - 1];
							break;
						}
						is_50_[i_55_] = i_56_ | i_57_;
					}
				}
				is_50_[i_51_] = i_54_;
				for (int i_58_ = i_51_ + 1; i_58_ <= 32; i_58_++) {
					int i_59_ = is_50_[i_58_];
					if (i_59_ == i_53_)
						is_50_[i_58_] = i_54_;
				}
			}
		}
		((Class60) this).anIntArray540 = new int[8];
		int i = 0;
		for (int i_60_ = 0; i_60_ < ((Class60) this).anInt535; i_60_++) {
			int i_61_ = ((Class60) this).anIntArray534[i_60_];
			if (i_61_ != 0) {
				int i_62_ = is[i_60_];
				int i_63_ = 0;
				for (int i_64_ = 0; i_64_ < i_61_; i_64_++) {
					int i_65_ = -2147483648 >>> i_64_;
					if ((i_62_ & i_65_) != 0) {
						if (((Class60) this).anIntArray540[i_63_] == 0)
							((Class60) this).anIntArray540[i_63_] = i;
						i_63_ = ((Class60) this).anIntArray540[i_63_];
					} else
						i_63_++;
					if (i_63_ >= ((Class60) this).anIntArray540.length) {
						int[] is_66_ = (new int[((Class60) this).anIntArray540.length * 2]);
						for (int i_67_ = 0; i_67_ < ((Class60) this).anIntArray540.length; i_67_++)
							is_66_[i_67_] = ((Class60) this).anIntArray540[i_67_];
						((Class60) this).anIntArray540 = is_66_;
					}
					i_65_ >>>= 1;
				}
				((Class60) this).anIntArray540[i_63_] = i_60_ ^ 0xffffffff;
				if (i_63_ >= i)
					i = i_63_ + 1;
			}
		}
	}
}
