package game;

/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90 {
	public int anInt1229;
	public int anInt1230;
	public int anInt1231;
	public boolean aBool1232 = false;
	public int anInt1233;
	public int anInt1234;

	public boolean method1509(int i, int i_0_) {
		if (!aBool1232)
			return false;
		int i_1_ = anInt1234 - anInt1230;
		int i_2_ = anInt1233 - anInt1231;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt1230 * i_1_ + anInt1231 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt1230 - i;
			int i_6_ = anInt1231 - i_0_;
			return i_5_ * i_5_ + i_6_ * i_6_ < anInt1229 * anInt1229;
		}
		if (i_4_ > i_3_) {
			int i_7_ = anInt1234 - i;
			int i_8_ = anInt1233 - i_0_;
			return i_7_ * i_7_ + i_8_ * i_8_ < anInt1229 * anInt1229;
		}
		int i_9_ = 10;
		if (i_4_ != (i_4_ & 0x1fffff))
			i_9_ = 5;
		i_4_ = (i_4_ << i_9_) / i_3_;
		int i_10_ = anInt1230 + (i_1_ * i_4_ >> i_9_) - i;
		int i_11_ = anInt1231 + (i_2_ * i_4_ >> i_9_) - i_0_;
		return i_10_ * i_10_ + i_11_ * i_11_ < anInt1229 * anInt1229;
	}

	public boolean method1510(int i, int i_12_) {
		if (!aBool1232)
			return false;
		int i_13_ = anInt1234 - anInt1230;
		int i_14_ = anInt1233 - anInt1231;
		int i_15_ = i_13_ * i_13_ + i_14_ * i_14_;
		int i_16_ = (i * i_13_ + i_12_ * i_14_ - (anInt1230 * i_13_ + anInt1231 * i_14_));
		if (i_16_ <= 0) {
			int i_17_ = anInt1230 - i;
			int i_18_ = anInt1231 - i_12_;
			return i_17_ * i_17_ + i_18_ * i_18_ < anInt1229 * anInt1229;
		}
		if (i_16_ > i_15_) {
			int i_19_ = anInt1234 - i;
			int i_20_ = anInt1233 - i_12_;
			return i_19_ * i_19_ + i_20_ * i_20_ < anInt1229 * anInt1229;
		}
		int i_21_ = 10;
		if (i_16_ != (i_16_ & 0x1fffff))
			i_21_ = 5;
		i_16_ = (i_16_ << i_21_) / i_15_;
		int i_22_ = anInt1230 + (i_13_ * i_16_ >> i_21_) - i;
		int i_23_ = anInt1231 + (i_14_ * i_16_ >> i_21_) - i_12_;
		return i_22_ * i_22_ + i_23_ * i_23_ < anInt1229 * anInt1229;
	}

	public void method1511(Class326 class326, Class250 class250, Class250 class250_24_, float f, float f_25_, float f_26_, float f_27_) {
		boolean bool = false;
		aBool1232 = true;
		int i = (int) (class326.aFloat4113 + class326.aFloat4109) >> 1;
		int i_28_ = (int) (class326.aFloat4108 + class326.aFloat4111) >> 1;
		int i_29_ = i;
		int i_30_ = (int) class326.aFloat4106;
		int i_31_ = i_28_;
		float f_32_ = (class250_24_.aFloatArray2728[0] * (float) i_29_ + class250_24_.aFloatArray2728[4] * (float) i_30_ + class250_24_.aFloatArray2728[8] * (float) i_31_ + class250_24_.aFloatArray2728[12]);
		float f_33_ = (class250_24_.aFloatArray2728[1] * (float) i_29_ + class250_24_.aFloatArray2728[5] * (float) i_30_ + class250_24_.aFloatArray2728[9] * (float) i_31_ + class250_24_.aFloatArray2728[13]);
		float f_34_ = (class250_24_.aFloatArray2728[2] * (float) i_29_ + class250_24_.aFloatArray2728[6] * (float) i_30_ + class250_24_.aFloatArray2728[10] * (float) i_31_ + class250_24_.aFloatArray2728[14]);
		float f_35_ = (class250_24_.aFloatArray2728[3] * (float) i_29_ + class250_24_.aFloatArray2728[7] * (float) i_30_ + class250_24_.aFloatArray2728[11] * (float) i_31_ + class250_24_.aFloatArray2728[15]);
		if (f_34_ >= -f_35_) {
			anInt1230 = (int) (f + f_26_ * f_32_ / f_35_);
			anInt1231 = (int) (f_25_ + f_27_ * f_33_ / f_35_);
		} else
			bool = true;
		i_29_ = i;
		i_30_ = (int) class326.aFloat4110;
		i_31_ = i_28_;
		float f_36_ = (class250_24_.aFloatArray2728[0] * (float) i_29_ + class250_24_.aFloatArray2728[4] * (float) i_30_ + class250_24_.aFloatArray2728[8] * (float) i_31_ + class250_24_.aFloatArray2728[12]);
		float f_37_ = (class250_24_.aFloatArray2728[1] * (float) i_29_ + class250_24_.aFloatArray2728[5] * (float) i_30_ + class250_24_.aFloatArray2728[9] * (float) i_31_ + class250_24_.aFloatArray2728[13]);
		float f_38_ = (class250_24_.aFloatArray2728[2] * (float) i_29_ + class250_24_.aFloatArray2728[6] * (float) i_30_ + class250_24_.aFloatArray2728[10] * (float) i_31_ + class250_24_.aFloatArray2728[14]);
		float f_39_ = (class250_24_.aFloatArray2728[3] * (float) i_29_ + class250_24_.aFloatArray2728[7] * (float) i_30_ + class250_24_.aFloatArray2728[11] * (float) i_31_ + class250_24_.aFloatArray2728[15]);
		if (f_38_ >= -f_39_) {
			anInt1234 = (int) (f + f_26_ * f_36_ / f_39_);
			anInt1233 = (int) (f_25_ + f_27_ * f_37_ / f_39_);
		} else
			bool = true;
		if (bool) {
			if (f_34_ < -f_35_ && f_38_ < -f_39_)
				aBool1232 = false;
			else if (f_34_ < -f_35_) {
				float f_40_ = (f_34_ + f_35_) / (f_38_ + f_39_) - 1.0F;
				float f_41_ = f_32_ + f_40_ * (f_36_ - f_32_);
				float f_42_ = f_33_ + f_40_ * (f_37_ - f_33_);
				float f_43_ = f_35_ + f_40_ * (f_39_ - f_35_);
				anInt1230 = (int) (f + f_26_ * f_41_ / f_43_);
				anInt1231 = (int) (f_25_ + f_27_ * f_42_ / f_43_);
			} else if (f_38_ < -f_39_) {
				float f_44_ = (f_38_ + f_39_) / (f_34_ + f_35_) - 1.0F;
				float f_45_ = f_36_ + f_44_ * (f_32_ - f_36_);
				float f_46_ = f_37_ + f_44_ * (f_33_ - f_37_);
				float f_47_ = f_39_ + f_44_ * (f_35_ - f_39_);
				anInt1234 = (int) (f + f_26_ * f_45_ / f_47_);
				anInt1233 = (int) (f_25_ + f_27_ * f_46_ / f_47_);
			}
		}
		if (aBool1232) {
			float f_48_ = ((float) Math.sqrt(Math.pow((double) (class326.aFloat4109 - class326.aFloat4113), 2.0) + Math.pow((double) (class326.aFloat4111 - (class326.aFloat4108)), 2.0)) / 2.0F);
			if (f_34_ / f_35_ > f_38_ / f_39_) {
				float f_49_ = (f_32_ + class250.aFloatArray2728[0] * f_48_ + class250.aFloatArray2728[12]);
				float f_50_ = (f_35_ + class250.aFloatArray2728[3] * f_48_ + class250.aFloatArray2728[15]);
				anInt1229 = (int) (f - (float) anInt1230 + f_26_ * f_49_ / f_50_);
			} else {
				float f_51_ = (f_36_ + class250.aFloatArray2728[0] * f_48_ + class250.aFloatArray2728[12]);
				float f_52_ = (f_39_ + class250.aFloatArray2728[3] * f_48_ + class250.aFloatArray2728[15]);
				anInt1229 = (int) (f - (float) anInt1234 + f_26_ * f_51_ / f_52_);
			}
			aBool1232 = true;
		}
	}

	public boolean method1512(int i, int i_53_) {
		if (!aBool1232)
			return false;
		int i_54_ = anInt1234 - anInt1230;
		int i_55_ = anInt1233 - anInt1231;
		int i_56_ = i_54_ * i_54_ + i_55_ * i_55_;
		int i_57_ = (i * i_54_ + i_53_ * i_55_ - (anInt1230 * i_54_ + anInt1231 * i_55_));
		if (i_57_ <= 0) {
			int i_58_ = anInt1230 - i;
			int i_59_ = anInt1231 - i_53_;
			return i_58_ * i_58_ + i_59_ * i_59_ < anInt1229 * anInt1229;
		}
		if (i_57_ > i_56_) {
			int i_60_ = anInt1234 - i;
			int i_61_ = anInt1233 - i_53_;
			return i_60_ * i_60_ + i_61_ * i_61_ < anInt1229 * anInt1229;
		}
		int i_62_ = 10;
		if (i_57_ != (i_57_ & 0x1fffff))
			i_62_ = 5;
		i_57_ = (i_57_ << i_62_) / i_56_;
		int i_63_ = anInt1230 + (i_54_ * i_57_ >> i_62_) - i;
		int i_64_ = anInt1231 + (i_55_ * i_57_ >> i_62_) - i_53_;
		return i_63_ * i_63_ + i_64_ * i_64_ < anInt1229 * anInt1229;
	}
}
