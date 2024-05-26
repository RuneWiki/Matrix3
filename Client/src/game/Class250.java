package game;

/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public final class Class250 {
	public static Class250 aClass250_2727 = new Class250();
	public float[] aFloatArray2728;

	public String method3440() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_0_ = 0; i_0_ < 4; i_0_++) {
				if (i_0_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray2728[i * 4 + i_0_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public Class250(Class250 class250_1_) {
		aFloatArray2728 = new float[16];
		method3442(class250_1_);
	}

	public void method3441(float f, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_) {
		aFloatArray2728[0] = 2.0F / (f_2_ - f);
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = 2.0F / (f_4_ - f_3_);
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = 0.0F;
		aFloatArray2728[9] = 0.0F;
		aFloatArray2728[10] = 2.0F / (f_6_ - f_5_);
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = -(f_2_ + f) / (f_2_ - f);
		aFloatArray2728[13] = -(f_4_ + f_3_) / (f_4_ - f_3_);
		aFloatArray2728[14] = -(f_6_ + f_5_) / (f_6_ - f_5_);
		aFloatArray2728[15] = 1.0F;
	}

	public void method3442(Class250 class250_7_) {
		System.arraycopy(class250_7_.aFloatArray2728, 0, aFloatArray2728, 0, 16);
	}

	public float method3443() {
		return (-(aFloatArray2728[15] + aFloatArray2728[14]) / (aFloatArray2728[11] + aFloatArray2728[10]));
	}

	public void method3444() {
		aFloatArray2728[0] = 1.0F;
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = 1.0F;
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = 0.0F;
		aFloatArray2728[9] = 0.0F;
		aFloatArray2728[10] = 1.0F;
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = 0.0F;
		aFloatArray2728[15] = 1.0F;
	}

	public void method3445(Class250 class250_8_) {
		float f = (aFloatArray2728[0] * class250_8_.aFloatArray2728[0] + aFloatArray2728[1] * class250_8_.aFloatArray2728[4] + aFloatArray2728[2] * class250_8_.aFloatArray2728[8] + aFloatArray2728[3] * class250_8_.aFloatArray2728[12]);
		float f_9_ = (aFloatArray2728[0] * class250_8_.aFloatArray2728[1] + aFloatArray2728[1] * class250_8_.aFloatArray2728[5] + aFloatArray2728[2] * class250_8_.aFloatArray2728[9] + aFloatArray2728[3] * class250_8_.aFloatArray2728[13]);
		float f_10_ = (aFloatArray2728[0] * class250_8_.aFloatArray2728[2] + aFloatArray2728[1] * class250_8_.aFloatArray2728[6] + aFloatArray2728[2] * class250_8_.aFloatArray2728[10] + aFloatArray2728[3] * class250_8_.aFloatArray2728[14]);
		float f_11_ = (aFloatArray2728[0] * class250_8_.aFloatArray2728[3] + aFloatArray2728[1] * class250_8_.aFloatArray2728[7] + aFloatArray2728[2] * class250_8_.aFloatArray2728[11] + aFloatArray2728[3] * class250_8_.aFloatArray2728[15]);
		float f_12_ = (aFloatArray2728[4] * class250_8_.aFloatArray2728[0] + aFloatArray2728[5] * class250_8_.aFloatArray2728[4] + aFloatArray2728[6] * class250_8_.aFloatArray2728[8] + aFloatArray2728[7] * class250_8_.aFloatArray2728[12]);
		float f_13_ = (aFloatArray2728[4] * class250_8_.aFloatArray2728[1] + aFloatArray2728[5] * class250_8_.aFloatArray2728[5] + aFloatArray2728[6] * class250_8_.aFloatArray2728[9] + aFloatArray2728[7] * class250_8_.aFloatArray2728[13]);
		float f_14_ = (aFloatArray2728[4] * class250_8_.aFloatArray2728[2] + aFloatArray2728[5] * class250_8_.aFloatArray2728[6] + aFloatArray2728[6] * class250_8_.aFloatArray2728[10] + aFloatArray2728[7] * class250_8_.aFloatArray2728[14]);
		float f_15_ = (aFloatArray2728[4] * class250_8_.aFloatArray2728[3] + aFloatArray2728[5] * class250_8_.aFloatArray2728[7] + aFloatArray2728[6] * class250_8_.aFloatArray2728[11] + aFloatArray2728[7] * class250_8_.aFloatArray2728[15]);
		float f_16_ = (aFloatArray2728[8] * class250_8_.aFloatArray2728[0] + aFloatArray2728[9] * class250_8_.aFloatArray2728[4] + aFloatArray2728[10] * class250_8_.aFloatArray2728[8] + aFloatArray2728[11] * class250_8_.aFloatArray2728[12]);
		float f_17_ = (aFloatArray2728[8] * class250_8_.aFloatArray2728[1] + aFloatArray2728[9] * class250_8_.aFloatArray2728[5] + aFloatArray2728[10] * class250_8_.aFloatArray2728[9] + aFloatArray2728[11] * class250_8_.aFloatArray2728[13]);
		float f_18_ = (aFloatArray2728[8] * class250_8_.aFloatArray2728[2] + aFloatArray2728[9] * class250_8_.aFloatArray2728[6] + aFloatArray2728[10] * class250_8_.aFloatArray2728[10] + aFloatArray2728[11] * class250_8_.aFloatArray2728[14]);
		float f_19_ = (aFloatArray2728[8] * class250_8_.aFloatArray2728[3] + aFloatArray2728[9] * class250_8_.aFloatArray2728[7] + aFloatArray2728[10] * class250_8_.aFloatArray2728[11] + aFloatArray2728[11] * class250_8_.aFloatArray2728[15]);
		float f_20_ = (aFloatArray2728[12] * class250_8_.aFloatArray2728[0] + aFloatArray2728[13] * class250_8_.aFloatArray2728[4] + aFloatArray2728[14] * class250_8_.aFloatArray2728[8] + aFloatArray2728[15] * class250_8_.aFloatArray2728[12]);
		float f_21_ = (aFloatArray2728[12] * class250_8_.aFloatArray2728[1] + aFloatArray2728[13] * class250_8_.aFloatArray2728[5] + aFloatArray2728[14] * class250_8_.aFloatArray2728[9] + aFloatArray2728[15] * class250_8_.aFloatArray2728[13]);
		float f_22_ = (aFloatArray2728[12] * class250_8_.aFloatArray2728[2] + aFloatArray2728[13] * class250_8_.aFloatArray2728[6] + aFloatArray2728[14] * class250_8_.aFloatArray2728[10] + aFloatArray2728[15] * class250_8_.aFloatArray2728[14]);
		float f_23_ = (aFloatArray2728[12] * class250_8_.aFloatArray2728[3] + aFloatArray2728[13] * class250_8_.aFloatArray2728[7] + aFloatArray2728[14] * class250_8_.aFloatArray2728[11] + aFloatArray2728[15] * class250_8_.aFloatArray2728[15]);
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = f_9_;
		aFloatArray2728[2] = f_10_;
		aFloatArray2728[3] = f_11_;
		aFloatArray2728[4] = f_12_;
		aFloatArray2728[5] = f_13_;
		aFloatArray2728[6] = f_14_;
		aFloatArray2728[7] = f_15_;
		aFloatArray2728[8] = f_16_;
		aFloatArray2728[9] = f_17_;
		aFloatArray2728[10] = f_18_;
		aFloatArray2728[11] = f_19_;
		aFloatArray2728[12] = f_20_;
		aFloatArray2728[13] = f_21_;
		aFloatArray2728[14] = f_22_;
		aFloatArray2728[15] = f_23_;
	}

	public void method3446(Class261 class261) {
		aFloatArray2728[0] = ((Class261) class261).aFloat2802;
		aFloatArray2728[1] = ((Class261) class261).aFloat2799;
		aFloatArray2728[2] = ((Class261) class261).aFloat2809;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = ((Class261) class261).aFloat2801;
		aFloatArray2728[5] = ((Class261) class261).aFloat2805;
		aFloatArray2728[6] = ((Class261) class261).aFloat2803;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = ((Class261) class261).aFloat2804;
		aFloatArray2728[9] = ((Class261) class261).aFloat2797;
		aFloatArray2728[10] = ((Class261) class261).aFloat2806;
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = ((Class261) class261).aFloat2807;
		aFloatArray2728[13] = ((Class261) class261).aFloat2808;
		aFloatArray2728[14] = ((Class261) class261).aFloat2798;
		aFloatArray2728[15] = 1.0F;
	}

	public void method3447(float f, float f_24_, float f_25_) {
		method3441(-10000.0F / f_25_, 10000.0F / f_25_, -10000.0F / f_25_, 10000.0F / f_25_, f, f_24_);
	}

	public void method3448(float f, float f_26_, float f_27_, float f_28_) {
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = f_26_;
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = 0.0F;
		aFloatArray2728[9] = 0.0F;
		aFloatArray2728[10] = f_27_;
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = 0.0F;
		aFloatArray2728[15] = f_28_;
	}

	public void method3449(float f, float f_29_, float f_30_, float[] fs) {
		fs[0] = (aFloatArray2728[0] * f + aFloatArray2728[4] * f_29_ + aFloatArray2728[8] * f_30_ + aFloatArray2728[12]);
		fs[1] = (aFloatArray2728[1] * f + aFloatArray2728[5] * f_29_ + aFloatArray2728[9] * f_30_ + aFloatArray2728[13]);
		fs[2] = (aFloatArray2728[2] * f + aFloatArray2728[6] * f_29_ + aFloatArray2728[10] * f_30_ + aFloatArray2728[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray2728[3] * f + aFloatArray2728[7] * f_29_ + aFloatArray2728[11] * f_30_ + aFloatArray2728[15]);
	}

	public void method3450(float f, float f_31_, float f_32_, float f_33_) {
		float f_34_ = (float) (Math.tan((double) (f_32_ / 2.0F)) * (double) f);
		float f_35_ = (float) (Math.tan((double) (f_33_ / 2.0F)) * (double) f);
		method3458(-f_34_, f_34_, -f_35_, f_35_, f, f_31_);
	}

	public void method3451(float f, float f_36_, float f_37_) {
		method3441(-10000.0F / f_37_, 10000.0F / f_37_, -10000.0F / f_37_, 10000.0F / f_37_, f, f_36_);
	}

	public void method3452(float f, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, float f_44_) {
		aFloatArray2728[0] = f_39_ * 2.0F / f_43_;
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = f_40_ * 2.0F / f_44_;
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = 2.0F * f / f_43_ - 1.0F;
		aFloatArray2728[9] = 2.0F * f_38_ / f_44_ - 1.0F;
		aFloatArray2728[10] = (f_42_ + f_41_) / (f_42_ - f_41_);
		aFloatArray2728[11] = 1.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = 2.0F * f_42_ * f_41_ / (f_41_ - f_42_);
		aFloatArray2728[15] = 0.0F;
	}

	public float method3453() {
		return (-(aFloatArray2728[15] + aFloatArray2728[14]) / (aFloatArray2728[11] + aFloatArray2728[10]));
	}

	public void method3454(float f, float f_45_, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_, float f_51_, float f_52_) {
		method3441(-(f * f_52_) / f_46_, f_52_ * (f_50_ - f) / f_46_, -(f_45_ * f_52_) / f_47_, f_52_ * (f_51_ - f_45_) / f_47_, f_48_, f_49_);
	}

	public float[] method3455(float[] fs) {
		float f = aFloatArray2728[3] + aFloatArray2728[0];
		float f_53_ = aFloatArray2728[7] + aFloatArray2728[4];
		float f_54_ = aFloatArray2728[11] + aFloatArray2728[8];
		double d = Math.sqrt((double) (f * f + f_53_ * f_53_ + f_54_ * f_54_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_53_ / d);
		fs[2] = (float) ((double) f_54_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] + aFloatArray2728[12]) / d);
		return fs;
	}

	public float[] method3456(float[] fs) {
		float f = aFloatArray2728[3] - aFloatArray2728[1];
		float f_55_ = aFloatArray2728[7] - aFloatArray2728[5];
		float f_56_ = aFloatArray2728[11] - aFloatArray2728[9];
		double d = Math.sqrt((double) (f * f + f_55_ * f_55_ + f_56_ * f_56_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_55_ / d);
		fs[2] = (float) ((double) f_56_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] - aFloatArray2728[13]) / d);
		return fs;
	}

	public float[] method3457(float[] fs) {
		float f = aFloatArray2728[3] + aFloatArray2728[1];
		float f_57_ = aFloatArray2728[7] + aFloatArray2728[5];
		float f_58_ = aFloatArray2728[11] + aFloatArray2728[9];
		double d = Math.sqrt((double) (f * f + f_57_ * f_57_ + f_58_ * f_58_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_57_ / d);
		fs[2] = (float) ((double) f_58_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] + aFloatArray2728[13]) / d);
		return fs;
	}

	void method3458(float f, float f_59_, float f_60_, float f_61_, float f_62_, float f_63_) {
		aFloatArray2728[0] = 2.0F * f_62_ / (f_59_ - f);
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = 2.0F * f_62_ / (f_61_ - f_60_);
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = (f_59_ + f) / (f_59_ - f);
		aFloatArray2728[9] = (f_61_ + f_60_) / (f_61_ - f_60_);
		aFloatArray2728[10] = (f_63_ + f_62_) / (f_63_ - f_62_);
		aFloatArray2728[11] = 1.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = -(2.0F * f_63_ * f_62_) / (f_63_ - f_62_);
		aFloatArray2728[15] = 0.0F;
	}

	public float[] method3459(float[] fs) {
		float f = aFloatArray2728[3] + aFloatArray2728[2];
		float f_64_ = aFloatArray2728[7] + aFloatArray2728[6];
		float f_65_ = aFloatArray2728[11] + aFloatArray2728[10];
		double d = Math.sqrt((double) (f * f + f_64_ * f_64_ + f_65_ * f_65_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_64_ / d);
		fs[2] = (float) ((double) f_65_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] + aFloatArray2728[14]) / d);
		return fs;
	}

	public float[] method3460(float[] fs) {
		float f = aFloatArray2728[3] - aFloatArray2728[2];
		float f_66_ = aFloatArray2728[7] - aFloatArray2728[6];
		float f_67_ = aFloatArray2728[11] - aFloatArray2728[10];
		double d = Math.sqrt((double) (f * f + f_66_ * f_66_ + f_67_ * f_67_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_66_ / d);
		fs[2] = (float) ((double) f_67_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] - aFloatArray2728[14]) / d);
		return fs;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class250))
			return false;
		Class250 class250_68_ = (Class250) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray2728[i] != class250_68_.aFloatArray2728[i])
				return false;
		}
		return true;
	}

	public float[] method3461(float[] fs) {
		System.arraycopy(aFloatArray2728, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method3462() {
		float f = 1.0F / method3491();
		float f_69_ = (aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[15] - aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[14] - aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[15] + aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[13] + aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[14] - (aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[13])) * f;
		float f_70_ = (-aFloatArray2728[1] * aFloatArray2728[10] * aFloatArray2728[15] + aFloatArray2728[1] * aFloatArray2728[11] * aFloatArray2728[14] + aFloatArray2728[2] * aFloatArray2728[9] * aFloatArray2728[15] - aFloatArray2728[2] * aFloatArray2728[11] * aFloatArray2728[13] - aFloatArray2728[3] * aFloatArray2728[9] * aFloatArray2728[14] + (aFloatArray2728[3] * aFloatArray2728[10] * aFloatArray2728[13])) * f;
		float f_71_ = ((aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[15] - aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[14] - aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[15] + aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[13] + aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[14] - (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[13])) * f);
		float f_72_ = ((-aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[11] + aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[10] + aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[11] - aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[9] - aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[10] + aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[9]) * f);
		float f_73_ = (-aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[15] + aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[14] + aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[15] - aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[12] - aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[14] + (aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[12])) * f;
		float f_74_ = (aFloatArray2728[0] * aFloatArray2728[10] * aFloatArray2728[15] - aFloatArray2728[0] * aFloatArray2728[11] * aFloatArray2728[14] - aFloatArray2728[2] * aFloatArray2728[8] * aFloatArray2728[15] + aFloatArray2728[2] * aFloatArray2728[11] * aFloatArray2728[12] + aFloatArray2728[3] * aFloatArray2728[8] * aFloatArray2728[14] - (aFloatArray2728[3] * aFloatArray2728[10] * aFloatArray2728[12])) * f;
		float f_75_ = ((-aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[15] + aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[14] + aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[15] - aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[12] - aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[14] + (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[12])) * f);
		float f_76_ = ((aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[11] - aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[10] - aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[11] + aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[8] + aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[10] - aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[8]) * f);
		float f_77_ = (aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[15] - aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[13] - aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[15] + aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[12] + aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[13] - (aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_78_ = (-aFloatArray2728[0] * aFloatArray2728[9] * aFloatArray2728[15] + aFloatArray2728[0] * aFloatArray2728[11] * aFloatArray2728[13] + aFloatArray2728[1] * aFloatArray2728[8] * aFloatArray2728[15] - aFloatArray2728[1] * aFloatArray2728[11] * aFloatArray2728[12] - aFloatArray2728[3] * aFloatArray2728[8] * aFloatArray2728[13] + (aFloatArray2728[3] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_79_ = ((aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[15] - aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[13] - aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[15] + aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[12] + aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[13] - (aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[12])) * f);
		float f_80_ = ((-aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[11] + aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[9] + aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[11] - aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[8] - aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[9] + aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[8]) * f);
		float f_81_ = (-aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[14] + aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[13] + aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[14] - aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[12] - aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[13] + (aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_82_ = (aFloatArray2728[0] * aFloatArray2728[9] * aFloatArray2728[14] - aFloatArray2728[0] * aFloatArray2728[10] * aFloatArray2728[13] - aFloatArray2728[1] * aFloatArray2728[8] * aFloatArray2728[14] + aFloatArray2728[1] * aFloatArray2728[10] * aFloatArray2728[12] + aFloatArray2728[2] * aFloatArray2728[8] * aFloatArray2728[13] - (aFloatArray2728[2] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_83_ = ((-aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[14] + aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[13] + aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[14] - aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[12] - aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[13] + (aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[12])) * f);
		float f_84_ = ((aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[10] - aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[9] - aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[10] + aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[8] + aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[9] - aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[8]) * f);
		aFloatArray2728[0] = f_69_;
		aFloatArray2728[1] = f_70_;
		aFloatArray2728[2] = f_71_;
		aFloatArray2728[3] = f_72_;
		aFloatArray2728[4] = f_73_;
		aFloatArray2728[5] = f_74_;
		aFloatArray2728[6] = f_75_;
		aFloatArray2728[7] = f_76_;
		aFloatArray2728[8] = f_77_;
		aFloatArray2728[9] = f_78_;
		aFloatArray2728[10] = f_79_;
		aFloatArray2728[11] = f_80_;
		aFloatArray2728[12] = f_81_;
		aFloatArray2728[13] = f_82_;
		aFloatArray2728[14] = f_83_;
		aFloatArray2728[15] = f_84_;
	}

	public float[] method3463(float[] fs) {
		fs[0] = aFloatArray2728[0];
		fs[1] = aFloatArray2728[4];
		fs[2] = aFloatArray2728[8];
		fs[3] = aFloatArray2728[12];
		fs[4] = aFloatArray2728[1];
		fs[5] = aFloatArray2728[5];
		fs[6] = aFloatArray2728[9];
		fs[7] = aFloatArray2728[13];
		fs[8] = aFloatArray2728[2];
		fs[9] = aFloatArray2728[6];
		fs[10] = aFloatArray2728[10];
		fs[11] = aFloatArray2728[14];
		fs[12] = aFloatArray2728[3];
		fs[13] = aFloatArray2728[7];
		fs[14] = aFloatArray2728[11];
		fs[15] = aFloatArray2728[15];
		return fs;
	}

	public float[] method3464(float[] fs) {
		fs[0] = aFloatArray2728[0];
		fs[1] = aFloatArray2728[4];
		fs[2] = aFloatArray2728[8];
		fs[3] = aFloatArray2728[12];
		fs[4] = aFloatArray2728[1];
		fs[5] = aFloatArray2728[5];
		fs[6] = aFloatArray2728[9];
		fs[7] = aFloatArray2728[13];
		return fs;
	}

	public float[] method3465(float[] fs) {
		fs[0] = aFloatArray2728[0];
		fs[1] = aFloatArray2728[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray2728[4];
		fs[5] = aFloatArray2728[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray2728[12];
		fs[9] = aFloatArray2728[13];
		fs[10] = aFloatArray2728[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method3466(float[] fs) {
		float f = fs[0];
		float f_85_ = fs[1];
		float f_86_ = fs[2];
		fs[0] = (aFloatArray2728[0] * f + aFloatArray2728[4] * f_85_ + aFloatArray2728[8] * f_86_ + aFloatArray2728[12]);
		fs[1] = (aFloatArray2728[1] * f + aFloatArray2728[5] * f_85_ + aFloatArray2728[9] * f_86_ + aFloatArray2728[13]);
		fs[2] = (aFloatArray2728[2] * f + aFloatArray2728[6] * f_85_ + aFloatArray2728[10] * f_86_ + aFloatArray2728[14]);
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_87_ = 0; i_87_ < 4; i_87_++) {
				if (i_87_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray2728[i * 4 + i_87_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray2728);
		return i;
	}

	public int method3467() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray2728);
		return i;
	}

	public int method3468() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray2728);
		return i;
	}

	public String method3469() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_88_ = 0; i_88_ < 4; i_88_++) {
				if (i_88_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray2728[i * 4 + i_88_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public boolean method3470(Object object) {
		if (!(object instanceof Class250))
			return false;
		Class250 class250_89_ = (Class250) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray2728[i] != class250_89_.aFloatArray2728[i])
				return false;
		}
		return true;
	}

	public float[] method3471(float[] fs) {
		fs[0] = aFloatArray2728[0];
		fs[1] = aFloatArray2728[1];
		fs[2] = aFloatArray2728[4];
		fs[3] = aFloatArray2728[5];
		fs[4] = aFloatArray2728[8];
		fs[5] = aFloatArray2728[9];
		fs[6] = aFloatArray2728[12];
		fs[7] = aFloatArray2728[13];
		return fs;
	}

	public void method3472(int i, int i_90_, int i_91_, float f, float f_92_, float f_93_) {
		if (i != 0) {
			float f_94_ = Class229.aFloatArray2619[i & 0x3fff];
			float f_95_ = Class229.aFloatArray2620[i & 0x3fff];
			aFloatArray2728[0] = f_94_ * (float) i_90_;
			aFloatArray2728[5] = f_94_ * (float) i_91_;
			aFloatArray2728[1] = f_95_ * (float) i_90_;
			aFloatArray2728[4] = -f_95_ * (float) i_91_;
			aFloatArray2728[10] = 1.0F;
			float[] fs = aFloatArray2728;
			float[] fs_96_ = aFloatArray2728;
			float[] fs_97_ = aFloatArray2728;
			aFloatArray2728[9] = 0.0F;
			fs_97_[8] = 0.0F;
			fs_96_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray2728[0] = (float) i_90_;
			aFloatArray2728[5] = (float) i_91_;
			aFloatArray2728[10] = 1.0F;
			float[] fs = aFloatArray2728;
			float[] fs_98_ = aFloatArray2728;
			float[] fs_99_ = aFloatArray2728;
			float[] fs_100_ = aFloatArray2728;
			float[] fs_101_ = aFloatArray2728;
			aFloatArray2728[9] = 0.0F;
			fs_101_[8] = 0.0F;
			fs_100_[6] = 0.0F;
			fs_99_[4] = 0.0F;
			fs_98_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray2728;
		float[] fs_102_ = aFloatArray2728;
		aFloatArray2728[11] = 0.0F;
		fs_102_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray2728[15] = 1.0F;
		aFloatArray2728[12] = f;
		aFloatArray2728[13] = f_92_;
		aFloatArray2728[14] = f_93_;
	}

	public void method3473(Class250 class250_103_, Class250 class250_104_) {
		float f = ((class250_103_.aFloatArray2728[0] * class250_104_.aFloatArray2728[0]) + (class250_103_.aFloatArray2728[1] * class250_104_.aFloatArray2728[4]) + (class250_103_.aFloatArray2728[2] * class250_104_.aFloatArray2728[8]) + (class250_103_.aFloatArray2728[3] * class250_104_.aFloatArray2728[12]));
		float f_105_ = ((class250_103_.aFloatArray2728[0] * class250_104_.aFloatArray2728[1]) + (class250_103_.aFloatArray2728[1] * class250_104_.aFloatArray2728[5]) + (class250_103_.aFloatArray2728[2] * class250_104_.aFloatArray2728[9]) + (class250_103_.aFloatArray2728[3] * class250_104_.aFloatArray2728[13]));
		float f_106_ = ((class250_103_.aFloatArray2728[0] * class250_104_.aFloatArray2728[2]) + (class250_103_.aFloatArray2728[1] * class250_104_.aFloatArray2728[6]) + (class250_103_.aFloatArray2728[2] * class250_104_.aFloatArray2728[10]) + (class250_103_.aFloatArray2728[3] * class250_104_.aFloatArray2728[14]));
		float f_107_ = ((class250_103_.aFloatArray2728[0] * class250_104_.aFloatArray2728[3]) + (class250_103_.aFloatArray2728[1] * class250_104_.aFloatArray2728[7]) + (class250_103_.aFloatArray2728[2] * class250_104_.aFloatArray2728[11]) + (class250_103_.aFloatArray2728[3] * class250_104_.aFloatArray2728[15]));
		float f_108_ = ((class250_103_.aFloatArray2728[4] * class250_104_.aFloatArray2728[0]) + (class250_103_.aFloatArray2728[5] * class250_104_.aFloatArray2728[4]) + (class250_103_.aFloatArray2728[6] * class250_104_.aFloatArray2728[8]) + (class250_103_.aFloatArray2728[7] * class250_104_.aFloatArray2728[12]));
		float f_109_ = ((class250_103_.aFloatArray2728[4] * class250_104_.aFloatArray2728[1]) + (class250_103_.aFloatArray2728[5] * class250_104_.aFloatArray2728[5]) + (class250_103_.aFloatArray2728[6] * class250_104_.aFloatArray2728[9]) + (class250_103_.aFloatArray2728[7] * class250_104_.aFloatArray2728[13]));
		float f_110_ = ((class250_103_.aFloatArray2728[4] * class250_104_.aFloatArray2728[2]) + (class250_103_.aFloatArray2728[5] * class250_104_.aFloatArray2728[6]) + (class250_103_.aFloatArray2728[6] * class250_104_.aFloatArray2728[10]) + (class250_103_.aFloatArray2728[7] * class250_104_.aFloatArray2728[14]));
		float f_111_ = ((class250_103_.aFloatArray2728[4] * class250_104_.aFloatArray2728[3]) + (class250_103_.aFloatArray2728[5] * class250_104_.aFloatArray2728[7]) + (class250_103_.aFloatArray2728[6] * class250_104_.aFloatArray2728[11]) + (class250_103_.aFloatArray2728[7] * class250_104_.aFloatArray2728[15]));
		float f_112_ = ((class250_103_.aFloatArray2728[8] * class250_104_.aFloatArray2728[0]) + (class250_103_.aFloatArray2728[9] * class250_104_.aFloatArray2728[4]) + (class250_103_.aFloatArray2728[10] * class250_104_.aFloatArray2728[8]) + (class250_103_.aFloatArray2728[11] * class250_104_.aFloatArray2728[12]));
		float f_113_ = ((class250_103_.aFloatArray2728[8] * class250_104_.aFloatArray2728[1]) + (class250_103_.aFloatArray2728[9] * class250_104_.aFloatArray2728[5]) + (class250_103_.aFloatArray2728[10] * class250_104_.aFloatArray2728[9]) + (class250_103_.aFloatArray2728[11] * class250_104_.aFloatArray2728[13]));
		float f_114_ = ((class250_103_.aFloatArray2728[8] * class250_104_.aFloatArray2728[2]) + (class250_103_.aFloatArray2728[9] * class250_104_.aFloatArray2728[6]) + (class250_103_.aFloatArray2728[10] * class250_104_.aFloatArray2728[10]) + (class250_103_.aFloatArray2728[11] * class250_104_.aFloatArray2728[14]));
		float f_115_ = ((class250_103_.aFloatArray2728[8] * class250_104_.aFloatArray2728[3]) + (class250_103_.aFloatArray2728[9] * class250_104_.aFloatArray2728[7]) + (class250_103_.aFloatArray2728[10] * class250_104_.aFloatArray2728[11]) + (class250_103_.aFloatArray2728[11] * class250_104_.aFloatArray2728[15]));
		float f_116_ = ((class250_103_.aFloatArray2728[12] * class250_104_.aFloatArray2728[0]) + (class250_103_.aFloatArray2728[13] * class250_104_.aFloatArray2728[4]) + (class250_103_.aFloatArray2728[14] * class250_104_.aFloatArray2728[8]) + (class250_103_.aFloatArray2728[15] * class250_104_.aFloatArray2728[12]));
		float f_117_ = ((class250_103_.aFloatArray2728[12] * class250_104_.aFloatArray2728[1]) + (class250_103_.aFloatArray2728[13] * class250_104_.aFloatArray2728[5]) + (class250_103_.aFloatArray2728[14] * class250_104_.aFloatArray2728[9]) + (class250_103_.aFloatArray2728[15] * class250_104_.aFloatArray2728[13]));
		float f_118_ = ((class250_103_.aFloatArray2728[12] * class250_104_.aFloatArray2728[2]) + (class250_103_.aFloatArray2728[13] * class250_104_.aFloatArray2728[6]) + (class250_103_.aFloatArray2728[14] * class250_104_.aFloatArray2728[10]) + (class250_103_.aFloatArray2728[15] * class250_104_.aFloatArray2728[14]));
		float f_119_ = ((class250_103_.aFloatArray2728[12] * class250_104_.aFloatArray2728[3]) + (class250_103_.aFloatArray2728[13] * class250_104_.aFloatArray2728[7]) + (class250_103_.aFloatArray2728[14] * class250_104_.aFloatArray2728[11]) + (class250_103_.aFloatArray2728[15] * class250_104_.aFloatArray2728[15]));
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = f_105_;
		aFloatArray2728[2] = f_106_;
		aFloatArray2728[3] = f_107_;
		aFloatArray2728[4] = f_108_;
		aFloatArray2728[5] = f_109_;
		aFloatArray2728[6] = f_110_;
		aFloatArray2728[7] = f_111_;
		aFloatArray2728[8] = f_112_;
		aFloatArray2728[9] = f_113_;
		aFloatArray2728[10] = f_114_;
		aFloatArray2728[11] = f_115_;
		aFloatArray2728[12] = f_116_;
		aFloatArray2728[13] = f_117_;
		aFloatArray2728[14] = f_118_;
		aFloatArray2728[15] = f_119_;
	}

	public void method3474() {
		float f = aFloatArray2728[0];
		float f_120_ = aFloatArray2728[4];
		float f_121_ = aFloatArray2728[8];
		float f_122_ = aFloatArray2728[12];
		float f_123_ = aFloatArray2728[1];
		float f_124_ = aFloatArray2728[5];
		float f_125_ = aFloatArray2728[9];
		float f_126_ = aFloatArray2728[13];
		float f_127_ = aFloatArray2728[2];
		float f_128_ = aFloatArray2728[6];
		float f_129_ = aFloatArray2728[10];
		float f_130_ = aFloatArray2728[14];
		float f_131_ = aFloatArray2728[3];
		float f_132_ = aFloatArray2728[7];
		float f_133_ = aFloatArray2728[11];
		float f_134_ = aFloatArray2728[15];
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = f_120_;
		aFloatArray2728[2] = f_121_;
		aFloatArray2728[3] = f_122_;
		aFloatArray2728[4] = f_123_;
		aFloatArray2728[5] = f_124_;
		aFloatArray2728[6] = f_125_;
		aFloatArray2728[7] = f_126_;
		aFloatArray2728[8] = f_127_;
		aFloatArray2728[9] = f_128_;
		aFloatArray2728[10] = f_129_;
		aFloatArray2728[11] = f_130_;
		aFloatArray2728[12] = f_131_;
		aFloatArray2728[13] = f_132_;
		aFloatArray2728[14] = f_133_;
		aFloatArray2728[15] = f_134_;
	}

	public float[] method3475(float[] fs) {
		float f = aFloatArray2728[3] - aFloatArray2728[0];
		float f_135_ = aFloatArray2728[7] - aFloatArray2728[4];
		float f_136_ = aFloatArray2728[11] - aFloatArray2728[8];
		double d = Math.sqrt((double) (f * f + f_135_ * f_135_ + f_136_ * f_136_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_135_ / d);
		fs[2] = (float) ((double) f_136_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] - aFloatArray2728[12]) / d);
		return fs;
	}

	public void method3476() {
		float f = 1.0F / method3491();
		float f_137_ = (aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[15] - aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[14] - aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[15] + aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[13] + aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[14] - (aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[13])) * f;
		float f_138_ = (-aFloatArray2728[1] * aFloatArray2728[10] * aFloatArray2728[15] + aFloatArray2728[1] * aFloatArray2728[11] * aFloatArray2728[14] + aFloatArray2728[2] * aFloatArray2728[9] * aFloatArray2728[15] - aFloatArray2728[2] * aFloatArray2728[11] * aFloatArray2728[13] - aFloatArray2728[3] * aFloatArray2728[9] * aFloatArray2728[14] + (aFloatArray2728[3] * aFloatArray2728[10] * aFloatArray2728[13])) * f;
		float f_139_ = ((aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[15] - aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[14] - aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[15] + aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[13] + aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[14] - (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[13])) * f);
		float f_140_ = ((-aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[11] + aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[10] + aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[11] - aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[9] - aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[10] + aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[9]) * f);
		float f_141_ = (-aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[15] + aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[14] + aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[15] - aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[12] - aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[14] + (aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[12])) * f;
		float f_142_ = (aFloatArray2728[0] * aFloatArray2728[10] * aFloatArray2728[15] - aFloatArray2728[0] * aFloatArray2728[11] * aFloatArray2728[14] - aFloatArray2728[2] * aFloatArray2728[8] * aFloatArray2728[15] + aFloatArray2728[2] * aFloatArray2728[11] * aFloatArray2728[12] + aFloatArray2728[3] * aFloatArray2728[8] * aFloatArray2728[14] - (aFloatArray2728[3] * aFloatArray2728[10] * aFloatArray2728[12])) * f;
		float f_143_ = ((-aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[15] + aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[14] + aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[15] - aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[12] - aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[14] + (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[12])) * f);
		float f_144_ = ((aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[11] - aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[10] - aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[11] + aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[8] + aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[10] - aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[8]) * f);
		float f_145_ = (aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[15] - aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[13] - aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[15] + aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[12] + aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[13] - (aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_146_ = (-aFloatArray2728[0] * aFloatArray2728[9] * aFloatArray2728[15] + aFloatArray2728[0] * aFloatArray2728[11] * aFloatArray2728[13] + aFloatArray2728[1] * aFloatArray2728[8] * aFloatArray2728[15] - aFloatArray2728[1] * aFloatArray2728[11] * aFloatArray2728[12] - aFloatArray2728[3] * aFloatArray2728[8] * aFloatArray2728[13] + (aFloatArray2728[3] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_147_ = ((aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[15] - aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[13] - aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[15] + aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[12] + aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[13] - (aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[12])) * f);
		float f_148_ = ((-aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[11] + aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[9] + aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[11] - aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[8] - aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[9] + aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[8]) * f);
		float f_149_ = (-aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[14] + aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[13] + aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[14] - aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[12] - aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[13] + (aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_150_ = (aFloatArray2728[0] * aFloatArray2728[9] * aFloatArray2728[14] - aFloatArray2728[0] * aFloatArray2728[10] * aFloatArray2728[13] - aFloatArray2728[1] * aFloatArray2728[8] * aFloatArray2728[14] + aFloatArray2728[1] * aFloatArray2728[10] * aFloatArray2728[12] + aFloatArray2728[2] * aFloatArray2728[8] * aFloatArray2728[13] - (aFloatArray2728[2] * aFloatArray2728[9] * aFloatArray2728[12])) * f;
		float f_151_ = ((-aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[14] + aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[13] + aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[14] - aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[12] - aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[13] + (aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[12])) * f);
		float f_152_ = ((aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[10] - aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[9] - aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[10] + aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[8] + aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[9] - aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[8]) * f);
		aFloatArray2728[0] = f_137_;
		aFloatArray2728[1] = f_138_;
		aFloatArray2728[2] = f_139_;
		aFloatArray2728[3] = f_140_;
		aFloatArray2728[4] = f_141_;
		aFloatArray2728[5] = f_142_;
		aFloatArray2728[6] = f_143_;
		aFloatArray2728[7] = f_144_;
		aFloatArray2728[8] = f_145_;
		aFloatArray2728[9] = f_146_;
		aFloatArray2728[10] = f_147_;
		aFloatArray2728[11] = f_148_;
		aFloatArray2728[12] = f_149_;
		aFloatArray2728[13] = f_150_;
		aFloatArray2728[14] = f_151_;
		aFloatArray2728[15] = f_152_;
	}

	public void method3477(float f, float f_153_, float f_154_, float f_155_) {
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = 0.0F;
		aFloatArray2728[2] = 0.0F;
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[4] = 0.0F;
		aFloatArray2728[5] = f_153_;
		aFloatArray2728[6] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[8] = 0.0F;
		aFloatArray2728[9] = 0.0F;
		aFloatArray2728[10] = f_154_;
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = 0.0F;
		aFloatArray2728[15] = f_155_;
	}

	public boolean method3478() {
		return (aFloatArray2728[0] == 1.0F && aFloatArray2728[1] == 0.0F && aFloatArray2728[2] == 0.0F && aFloatArray2728[3] == 0.0F && aFloatArray2728[4] == 0.0F && aFloatArray2728[5] == 1.0F && aFloatArray2728[6] == 0.0F && aFloatArray2728[7] == 0.0F && aFloatArray2728[8] == 0.0F && aFloatArray2728[9] == 0.0F && aFloatArray2728[10] == 1.0F && aFloatArray2728[11] == 0.0F && aFloatArray2728[12] == 0.0F && aFloatArray2728[13] == 0.0F && aFloatArray2728[14] == 0.0F && aFloatArray2728[15] == 1.0F);
	}

	public boolean method3479(Object object) {
		if (!(object instanceof Class250))
			return false;
		Class250 class250_156_ = (Class250) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray2728[i] != class250_156_.aFloatArray2728[i])
				return false;
		}
		return true;
	}

	public float[] method3480(float[] fs) {
		fs[0] = aFloatArray2728[0];
		fs[1] = aFloatArray2728[1];
		fs[2] = aFloatArray2728[2];
		fs[3] = aFloatArray2728[4];
		fs[4] = aFloatArray2728[5];
		fs[5] = aFloatArray2728[6];
		fs[6] = aFloatArray2728[8];
		fs[7] = aFloatArray2728[9];
		fs[8] = aFloatArray2728[10];
		return fs;
	}

	public float method3481() {
		return (-(aFloatArray2728[15] + aFloatArray2728[14]) / (aFloatArray2728[11] + aFloatArray2728[10]));
	}

	public boolean method3482() {
		return (aFloatArray2728[0] == 1.0F && aFloatArray2728[1] == 0.0F && aFloatArray2728[2] == 0.0F && aFloatArray2728[3] == 0.0F && aFloatArray2728[4] == 0.0F && aFloatArray2728[5] == 1.0F && aFloatArray2728[6] == 0.0F && aFloatArray2728[7] == 0.0F && aFloatArray2728[8] == 0.0F && aFloatArray2728[9] == 0.0F && aFloatArray2728[10] == 1.0F && aFloatArray2728[11] == 0.0F && aFloatArray2728[12] == 0.0F && aFloatArray2728[13] == 0.0F && aFloatArray2728[14] == 0.0F && aFloatArray2728[15] == 1.0F);
	}

	public void method3483(float f, float f_157_, float f_158_, float[] fs) {
		fs[0] = (aFloatArray2728[0] * f + aFloatArray2728[4] * f_157_ + aFloatArray2728[8] * f_158_);
		fs[1] = (aFloatArray2728[1] * f + aFloatArray2728[5] * f_157_ + aFloatArray2728[9] * f_158_);
		fs[2] = (aFloatArray2728[2] * f + aFloatArray2728[6] * f_157_ + aFloatArray2728[10] * f_158_);
		if (fs.length > 3)
			fs[3] = (aFloatArray2728[3] * f + aFloatArray2728[7] * f_157_ + aFloatArray2728[11] * f_158_);
	}

	public float[] method3484(float[] fs) {
		float f = aFloatArray2728[3] + aFloatArray2728[1];
		float f_159_ = aFloatArray2728[7] + aFloatArray2728[5];
		float f_160_ = aFloatArray2728[11] + aFloatArray2728[9];
		double d = Math.sqrt((double) (f * f + f_159_ * f_159_ + f_160_ * f_160_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_159_ / d);
		fs[2] = (float) ((double) f_160_ / d);
		fs[3] = (float) ((double) (aFloatArray2728[15] + aFloatArray2728[13]) / d);
		return fs;
	}

	public void method3485() {
		float f = aFloatArray2728[0];
		float f_161_ = aFloatArray2728[4];
		float f_162_ = aFloatArray2728[8];
		float f_163_ = aFloatArray2728[12];
		float f_164_ = aFloatArray2728[1];
		float f_165_ = aFloatArray2728[5];
		float f_166_ = aFloatArray2728[9];
		float f_167_ = aFloatArray2728[13];
		float f_168_ = aFloatArray2728[2];
		float f_169_ = aFloatArray2728[6];
		float f_170_ = aFloatArray2728[10];
		float f_171_ = aFloatArray2728[14];
		float f_172_ = aFloatArray2728[3];
		float f_173_ = aFloatArray2728[7];
		float f_174_ = aFloatArray2728[11];
		float f_175_ = aFloatArray2728[15];
		aFloatArray2728[0] = f;
		aFloatArray2728[1] = f_161_;
		aFloatArray2728[2] = f_162_;
		aFloatArray2728[3] = f_163_;
		aFloatArray2728[4] = f_164_;
		aFloatArray2728[5] = f_165_;
		aFloatArray2728[6] = f_166_;
		aFloatArray2728[7] = f_167_;
		aFloatArray2728[8] = f_168_;
		aFloatArray2728[9] = f_169_;
		aFloatArray2728[10] = f_170_;
		aFloatArray2728[11] = f_171_;
		aFloatArray2728[12] = f_172_;
		aFloatArray2728[13] = f_173_;
		aFloatArray2728[14] = f_174_;
		aFloatArray2728[15] = f_175_;
	}

	public void method3486(Class250 class250_176_) {
		System.arraycopy(class250_176_.aFloatArray2728, 0, aFloatArray2728, 0, 11);
		aFloatArray2728[3] = 0.0F;
		aFloatArray2728[7] = 0.0F;
		aFloatArray2728[11] = 0.0F;
		aFloatArray2728[12] = 0.0F;
		aFloatArray2728[13] = 0.0F;
		aFloatArray2728[14] = 0.0F;
		aFloatArray2728[15] = 1.0F;
	}

	public float method3487() {
		return ((aFloatArray2728[14] - aFloatArray2728[15]) / (aFloatArray2728[11] - aFloatArray2728[10]));
	}

	public Class250() {
		aFloatArray2728 = new float[16];
		method3444();
	}

	public float method3488() {
		return ((aFloatArray2728[14] - aFloatArray2728[15]) / (aFloatArray2728[11] - aFloatArray2728[10]));
	}

	public float method3489() {
		return (-(aFloatArray2728[15] + aFloatArray2728[14]) / (aFloatArray2728[11] + aFloatArray2728[10]));
	}

	public int method3490() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray2728);
		return i;
	}

	float method3491() {
		return ((aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[15]) - (aFloatArray2728[0] * aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[14]) - (aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[15]) + (aFloatArray2728[0] * aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[13]) + (aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[14]) - (aFloatArray2728[0] * aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[13]) - (aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[15]) + (aFloatArray2728[1] * aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[14]) + (aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[15]) - (aFloatArray2728[1] * aFloatArray2728[6] * aFloatArray2728[11] * aFloatArray2728[12]) - (aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[14]) + (aFloatArray2728[1] * aFloatArray2728[7] * aFloatArray2728[10] * aFloatArray2728[12]) + (aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[15]) - (aFloatArray2728[2] * aFloatArray2728[4] * aFloatArray2728[11] * aFloatArray2728[13]) - (aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[15]) + (aFloatArray2728[2] * aFloatArray2728[5] * aFloatArray2728[11] * aFloatArray2728[12]) + (aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[8] * aFloatArray2728[13]) - (aFloatArray2728[2] * aFloatArray2728[7] * aFloatArray2728[9] * aFloatArray2728[12]) - (aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[9] * aFloatArray2728[14]) + (aFloatArray2728[3] * aFloatArray2728[4] * aFloatArray2728[10] * aFloatArray2728[13]) + (aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[8] * aFloatArray2728[14]) - (aFloatArray2728[3] * aFloatArray2728[5] * aFloatArray2728[10] * aFloatArray2728[12]) - (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[8] * aFloatArray2728[13]) + (aFloatArray2728[3] * aFloatArray2728[6] * aFloatArray2728[9] * aFloatArray2728[12]));
	}

	public float[] method3492(float[] fs) {
		System.arraycopy(aFloatArray2728, 0, fs, 0, 16);
		return fs;
	}
}
