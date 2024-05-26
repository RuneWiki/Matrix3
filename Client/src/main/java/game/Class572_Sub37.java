package game;

/* Class572_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub37 extends Class572 {
	int anInt9365;
	Class106_Sub1 aClass106_Sub1_9366;
	Class572_Sub36 aClass572_Sub36_9367;
	int anInt9368;
	Class174_Sub3 aClass174_Sub3_9369;
	int anInt9370;
	int anInt9371;
	int anInt9372;
	int anInt9373;
	Interface12 anInterface12_9374;
	Interface9 anInterface9_9375;
	Class142 aClass142_9376;
	Class142 aClass142_9377;
	float[][] aFloatArrayArray9378;
	RSByteBuffer aClass572_Sub15_9379;
	float[][] aFloatArrayArray9380;
	float[][] aFloatArrayArray9381;
	Class572_Sub15_Sub1 aClass572_Sub15_Sub1_9382;
	Class676 aClass676_9383;

	void method8758(short i) {
		if (((Class106_Sub1) ((Class572_Sub37) this).aClass106_Sub1_9366).aBool10153)
			((Class572_Sub37) this).aClass572_Sub15_9379.writeShort(i, -1387022694);
		else
			((Class572_Sub37) this).aClass572_Sub15_9379.method8453(i, 1133571720);
	}

	void method8759(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2088) * 212267571);
		int i_6_ = i_4_ + (i_2_ << (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2088) * 212267571);
		int i_7_ = ((Class572_Sub37) this).aClass174_Sub3_9369.method2726(i_5_, i_6_, 358769667);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class572_Sub11 class572_sub11 = ((Class572_Sub11) ((Class572_Sub37) this).aClass676_9383.get(l));
			if (class572_sub11 != null) {
				method8758(class572_sub11.aShort9091);
				return;
			}
		}
		short i_8_ = (short) ((Class572_Sub37) this).anInt9372++;
		if (l != -1L)
			((Class572_Sub37) this).aClass676_9383.put(new Class572_Sub11(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = ((Class572_Sub37) this).aFloatArrayArray9378[i][i_0_];
			f_9_ = ((Class572_Sub37) this).aFloatArrayArray9381[i][i_0_];
			f_10_ = ((Class572_Sub37) this).aFloatArrayArray9380[i][i_0_];
		} else if (i_3_ == (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771 && i_4_ == 0) {
			f = ((Class572_Sub37) this).aFloatArrayArray9378[i + 1][i_0_];
			f_9_ = ((Class572_Sub37) this).aFloatArrayArray9381[i + 1][i_0_];
			f_10_ = ((Class572_Sub37) this).aFloatArrayArray9380[i + 1][i_0_];
		} else if (i_3_ == (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771 && i_4_ == (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771) {
			f = ((Class572_Sub37) this).aFloatArrayArray9378[i + 1][i_0_ + 1];
			f_9_ = (((Class572_Sub37) this).aFloatArrayArray9381[i + 1][i_0_ + 1]);
			f_10_ = (((Class572_Sub37) this).aFloatArrayArray9380[i + 1][i_0_ + 1]);
		} else if (i_3_ == 0 && i_4_ == (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771) {
			f = ((Class572_Sub37) this).aFloatArrayArray9378[i][i_0_ + 1];
			f_9_ = ((Class572_Sub37) this).aFloatArrayArray9381[i][i_0_ + 1];
			f_10_ = ((Class572_Sub37) this).aFloatArrayArray9380[i][i_0_ + 1];
		} else {
			float f_11_ = (float) i_3_ / (float) ((((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771);
			float f_12_ = (float) i_4_ / (float) ((((Class572_Sub37) this).aClass174_Sub3_9369.anInt2087) * 2129890771);
			float f_13_ = ((Class572_Sub37) this).aFloatArrayArray9378[i][i_0_];
			float f_14_ = ((Class572_Sub37) this).aFloatArrayArray9381[i][i_0_];
			float f_15_ = ((Class572_Sub37) this).aFloatArrayArray9380[i][i_0_];
			float f_16_ = ((Class572_Sub37) this).aFloatArrayArray9378[i + 1][i_0_];
			float f_17_ = ((Class572_Sub37) this).aFloatArrayArray9381[i + 1][i_0_];
			float f_18_ = ((Class572_Sub37) this).aFloatArrayArray9380[i + 1][i_0_];
			f_13_ += (((Class572_Sub37) this).aFloatArrayArray9378[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (((Class572_Sub37) this).aFloatArrayArray9381[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (((Class572_Sub37) this).aFloatArrayArray9380[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += ((((Class572_Sub37) this).aFloatArrayArray9378[i + 1][i_0_ + 1]) - f_16_) * f_11_;
			f_17_ += ((((Class572_Sub37) this).aFloatArrayArray9381[i + 1][i_0_ + 1]) - f_17_) * f_11_;
			f_18_ += ((((Class572_Sub37) this).aFloatArrayArray9380[i + 1][i_0_ + 1]) - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (((Class572_Sub37) this).aClass572_Sub36_9367.method8720(-665936675) - i_5_);
		float f_20_ = (float) (((Class572_Sub37) this).aClass572_Sub36_9367.method8721((byte) -73) - i_7_);
		float f_21_ = (float) (((Class572_Sub37) this).aClass572_Sub36_9367.method8722(1945227131) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) ((Class572_Sub37) this).aClass572_Sub36_9367.method8752((byte) 24);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = ((Class572_Sub37) this).aClass572_Sub36_9367.method8723(-1288611141);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		if (((Class106_Sub1) ((Class572_Sub37) this).aClass106_Sub1_9366).aBool10153) {
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10299((float) i_5_);
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10299((float) i_7_);
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10299((float) i_6_);
		} else {
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10298((float) i_5_);
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10298((float) i_7_);
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.method10298((float) i_6_);
		}
		((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.writeByte(i_29_, -1384395473);
		((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.writeByte(i_30_, -1384395473);
		((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.writeByte(i_31_, -1384395473);
		((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.writeByte(255, -1384395473);
		method8758(i_8_);
	}

	void method8760(short i) {
		if (((Class106_Sub1) ((Class572_Sub37) this).aClass106_Sub1_9366).aBool10153)
			((Class572_Sub37) this).aClass572_Sub15_9379.writeShort(i, -1006590283);
		else
			((Class572_Sub37) this).aClass572_Sub15_9379.method8453(i, 1309780880);
	}

	Class572_Sub37(Class106_Sub1 class106_sub1, Class174_Sub3 class174_sub3, Class572_Sub36 class572_sub36, int[] is) {
		((Class572_Sub37) this).aClass106_Sub1_9366 = class106_sub1;
		((Class572_Sub37) this).aClass572_Sub36_9367 = class572_sub36;
		((Class572_Sub37) this).aClass174_Sub3_9369 = class174_sub3;
		int i = (((Class572_Sub37) this).aClass572_Sub36_9367.method8752((byte) 90) - (class174_sub3.anInt2087 * 2129890771 >> 1));
		((Class572_Sub37) this).anInt9365 = (((Class572_Sub37) this).aClass572_Sub36_9367.method8720(2110107066) - i >> class174_sub3.anInt2088 * 212267571);
		((Class572_Sub37) this).anInt9368 = (((Class572_Sub37) this).aClass572_Sub36_9367.method8720(686241131) + i >> class174_sub3.anInt2088 * 212267571);
		((Class572_Sub37) this).anInt9371 = (((Class572_Sub37) this).aClass572_Sub36_9367.method8722(-331393753) - i >> class174_sub3.anInt2088 * 212267571);
		((Class572_Sub37) this).anInt9370 = (((Class572_Sub37) this).aClass572_Sub36_9367.method8722(1890170093) + i >> class174_sub3.anInt2088 * 212267571);
		int i_32_ = (((Class572_Sub37) this).anInt9368 - ((Class572_Sub37) this).anInt9365 + 1);
		int i_33_ = (((Class572_Sub37) this).anInt9370 - ((Class572_Sub37) this).anInt9371 + 1);
		((Class572_Sub37) this).aFloatArrayArray9378 = new float[i_32_ + 1][i_33_ + 1];
		((Class572_Sub37) this).aFloatArrayArray9381 = new float[i_32_ + 1][i_33_ + 1];
		((Class572_Sub37) this).aFloatArrayArray9380 = new float[i_32_ + 1][i_33_ + 1];
		for (int i_34_ = 0; i_34_ <= i_33_; i_34_++) {
			int i_35_ = i_34_ + ((Class572_Sub37) this).anInt9371;
			if (i_35_ > 0 && i_35_ < (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2089) * 792439321 - 1) {
				for (int i_36_ = 0; i_36_ <= i_32_; i_36_++) {
					int i_37_ = i_36_ + ((Class572_Sub37) this).anInt9365;
					if (i_37_ > 0 && i_37_ < (((Class572_Sub37) this).aClass174_Sub3_9369.anInt2086) * -1715487093 - 1) {
						int i_38_ = (class174_sub3.method2713(i_37_ + 1, i_35_, 530484625) - class174_sub3.method2713(i_37_ - 1, i_35_, 1594935229));
						int i_39_ = (class174_sub3.method2713(i_37_, i_35_ + 1, 367679748) - class174_sub3.method2713(i_37_, i_35_ - 1, 244734648));
						float f = (float) (1.0 / Math.sqrt((double) (i_38_ * i_38_ + 65536 + (i_39_ * i_39_))));
						((Class572_Sub37) this).aFloatArrayArray9378[i_36_][i_34_] = (float) i_38_ * f;
						((Class572_Sub37) this).aFloatArrayArray9381[i_36_][i_34_] = -256.0F * f;
						((Class572_Sub37) this).aFloatArrayArray9380[i_36_][i_34_] = (float) i_39_ * f;
					}
				}
			}
		}
		int i_40_ = 0;
		for (int i_41_ = ((Class572_Sub37) this).anInt9371; i_41_ <= ((Class572_Sub37) this).anInt9370; i_41_++) {
			if (i_41_ >= 0 && i_41_ < class174_sub3.anInt2089 * 792439321) {
				for (int i_42_ = ((Class572_Sub37) this).anInt9365; i_42_ <= ((Class572_Sub37) this).anInt9368; i_42_++) {
					if (i_42_ >= 0 && i_42_ < class174_sub3.anInt2086 * -1715487093) {
						int i_43_ = is[i_40_];
						int[] is_44_ = (((Class174_Sub3) class174_sub3).anIntArrayArrayArray10873[i_42_][i_41_]);
						if (is_44_ != null && i_43_ != 0) {
							if (i_43_ == 1) {
								for (int i_45_ = 0; i_45_ < is_44_.length; i_45_ += 3) {
									if (is_44_[i_45_] != -1 && is_44_[i_45_ + 1] != -1 && is_44_[i_45_ + 2] != -1)
										((Class572_Sub37) this).anInt9373 += 3;
								}
							} else
								((Class572_Sub37) this).anInt9373 += 3;
						}
					}
					i_40_++;
				}
			} else
				i_40_ += (((Class572_Sub37) this).anInt9368 - ((Class572_Sub37) this).anInt9365);
		}
		if (((Class572_Sub37) this).anInt9373 > 0) {
			((Class572_Sub37) this).aClass572_Sub15_9379 = new RSByteBuffer(((Class572_Sub37) this).anInt9373 * 2);
			((Class572_Sub37) this).aClass572_Sub15_Sub1_9382 = new Class572_Sub15_Sub1(((Class572_Sub37) this).anInt9373 * 16);
			((Class572_Sub37) this).aClass676_9383 = new Class676(HashTable.nextPowerOfTwo((((Class572_Sub37) this).anInt9373), 135143048));
			int i_46_ = 0;
			i_40_ = 0;
			for (int i_47_ = ((Class572_Sub37) this).anInt9371; i_47_ <= ((Class572_Sub37) this).anInt9370; i_47_++) {
				if (i_47_ >= 0 && i_47_ < class174_sub3.anInt2089 * 792439321) {
					int i_48_ = 0;
					for (int i_49_ = ((Class572_Sub37) this).anInt9365; i_49_ <= ((Class572_Sub37) this).anInt9368; i_49_++) {
						if (i_49_ >= 0 && i_49_ < class174_sub3.anInt2086 * -1715487093) {
							int i_50_ = is[i_40_];
							int[] is_51_ = (((Class174_Sub3) class174_sub3).anIntArrayArrayArray10873[i_49_][i_47_]);
							if (is_51_ != null && i_50_ != 0) {
								if (i_50_ == 1) {
									int[] is_52_ = (((Class174_Sub3) class174_sub3).anIntArrayArrayArray10905[i_49_][i_47_]);
									int[] is_53_ = (((Class174_Sub3) class174_sub3).anIntArrayArrayArray10896[i_49_][i_47_]);
									int i_54_ = 0;
									while (i_54_ < is_51_.length) {
										if (is_51_[i_54_] != -1 && is_51_[i_54_ + 1] != -1 && is_51_[i_54_ + 2] != -1) {
											method8759(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method8759(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method8759(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
										} else
											i_54_ += 3;
									}
								} else if (i_50_ == 3) {
									method8759(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), 0);
									method8759(i_48_, i_46_, i_49_, i_47_, 0, (class174_sub3.anInt2087 * 2129890771));
								} else if (i_50_ == 2) {
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), 0);
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), (class174_sub3.anInt2087 * 2129890771));
									method8759(i_48_, i_46_, i_49_, i_47_, 0, 0);
								} else if (i_50_ == 5) {
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), (class174_sub3.anInt2087 * 2129890771));
									method8759(i_48_, i_46_, i_49_, i_47_, 0, (class174_sub3.anInt2087 * 2129890771));
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), 0);
								} else if (i_50_ == 4) {
									method8759(i_48_, i_46_, i_49_, i_47_, 0, (class174_sub3.anInt2087 * 2129890771));
									method8759(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method8759(i_48_, i_46_, i_49_, i_47_, (class174_sub3.anInt2087 * 2129890771), (class174_sub3.anInt2087 * 2129890771));
								}
							}
						}
						i_40_++;
						i_48_++;
					}
				} else
					i_40_ += (((Class572_Sub37) this).anInt9368 - ((Class572_Sub37) this).anInt9365);
				i_46_++;
			}
			((Class572_Sub37) this).anInterface12_9374 = (((Class572_Sub37) this).aClass106_Sub1_9366.method9412(5123, (((Class572_Sub37) this).aClass572_Sub15_9379.b), (((Class572_Sub37) this).aClass572_Sub15_9379.o * -1585139053), false));
			((Class572_Sub37) this).anInterface9_9375 = (((Class572_Sub37) this).aClass106_Sub1_9366.method9413(16, (((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.b), (((Class572_Sub37) this).aClass572_Sub15_Sub1_9382.o) * -1585139053, false));
			((Class572_Sub37) this).aClass142_9376 = new Class142(((Class572_Sub37) this).anInterface9_9375, 5126, 3, 0);
			((Class572_Sub37) this).aClass142_9377 = new Class142(((Class572_Sub37) this).anInterface9_9375, 5121, 4, 12);
		} else {
			((Class572_Sub37) this).anInterface12_9374 = null;
			((Class572_Sub37) this).anInterface9_9375 = null;
			((Class572_Sub37) this).aClass142_9376 = null;
			((Class572_Sub37) this).aClass142_9377 = null;
		}
		((Class572_Sub37) this).aClass572_Sub15_Sub1_9382 = null;
		((Class572_Sub37) this).aClass572_Sub15_9379 = null;
		((Class572_Sub37) this).aClass676_9383 = null;
		((Class572_Sub37) this).aFloatArrayArray9380 = null;
		((Class572_Sub37) this).aFloatArrayArray9381 = null;
		((Class572_Sub37) this).aFloatArrayArray9378 = null;
	}

	void method8761(short i) {
		if (((Class106_Sub1) ((Class572_Sub37) this).aClass106_Sub1_9366).aBool10153)
			((Class572_Sub37) this).aClass572_Sub15_9379.writeShort(i, -1250293173);
		else
			((Class572_Sub37) this).aClass572_Sub15_9379.method8453(i, 1051912213);
	}

	void method8762(int i, int i_55_, int i_56_, boolean[][] bools) {
		if (((Class572_Sub37) this).anInterface12_9374 != null && ((Class572_Sub37) this).anInt9365 <= i + i_56_ && ((Class572_Sub37) this).anInt9368 >= i - i_56_ && ((Class572_Sub37) this).anInt9371 <= i_55_ + i_56_ && ((Class572_Sub37) this).anInt9370 >= i_55_ - i_56_) {
			for (int i_57_ = ((Class572_Sub37) this).anInt9371; i_57_ <= ((Class572_Sub37) this).anInt9370; i_57_++) {
				for (int i_58_ = ((Class572_Sub37) this).anInt9365; i_58_ <= ((Class572_Sub37) this).anInt9368; i_58_++) {
					int i_59_ = i_58_ - i;
					int i_60_ = i_57_ - i_55_;
					if (i_59_ > -i_56_ && i_59_ < i_56_ && i_60_ > -i_56_ && i_60_ < i_56_ && bools[i_59_ + i_56_][i_60_ + i_56_]) {
						((Class572_Sub37) this).aClass106_Sub1_9366.method9425((int) (((Class572_Sub37) this).aClass572_Sub36_9367.method8724((byte) 79) * 255.0F) << 24);
						((Class572_Sub37) this).aClass106_Sub1_9366.method9416(((Class572_Sub37) this).aClass142_9376, null, ((Class572_Sub37) this).aClass142_9377, null);
						((Class572_Sub37) this).aClass106_Sub1_9366.method9411(((Class572_Sub37) this).anInterface12_9374, 4, 0, ((Class572_Sub37) this).anInt9373);
						return;
					}
				}
			}
		}
	}

	void method8763(short i) {
		if (((Class106_Sub1) ((Class572_Sub37) this).aClass106_Sub1_9366).aBool10153)
			((Class572_Sub37) this).aClass572_Sub15_9379.writeShort(i, -914502003);
		else
			((Class572_Sub37) this).aClass572_Sub15_9379.method8453(i, 1796117940);
	}
}
