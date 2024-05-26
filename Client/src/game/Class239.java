package game;

/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class239 {
	float aFloat2649;
	Class240[] aClass240Array2650 = new Class240[4];
	float[] aFloatArray2651;

	Class239() {
		for (int i = 0; i < 4; i++)
			((Class239) this).aClass240Array2650[i] = new Class240();
		method3260();
	}

	void method3251() {
		int i = 20;
		double[] ds = method3254(0.0F);
		float f = 0.0F;
		Class240 class240 = Class240.method3306();
		for (int i_0_ = 1; i_0_ <= i; i_0_++) {
			double[] ds_1_ = method3254((float) i_0_ / (float) i);
			class240.aFloat2653 = (float) (ds_1_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_1_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_1_[2] - ds[2]);
			f += class240.method3301();
			ds = ds_1_;
		}
		int i_2_ = (int) (f / 20.0F);
		if (i_2_ < i)
			i_2_ = i;
		((Class239) this).aFloatArray2651 = new float[i_2_];
		ds = method3254(0.0F);
		float f_3_ = 0.0F;
		for (int i_4_ = 1; i_4_ <= i_2_; i_4_++) {
			double[] ds_5_ = method3254((float) i_4_ / (float) i_2_);
			class240.aFloat2653 = (float) (ds_5_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_5_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_5_[2] - ds[2]);
			float f_6_ = class240.method3301();
			f_3_ += f_6_;
			((Class239) this).aFloatArray2651[i_4_ - 1] = f_6_;
			ds = ds_5_;
		}
		((Class239) this).aFloat2649 = f_3_;
	}

	void method3252(int i, Class240 class240) {
		((Class239) this).aClass240Array2650[i].method3269(class240);
		method3260();
	}

	Class240 method3253(int i) {
		return ((Class239) this).aClass240Array2650[i];
	}

	double[] method3254(float f) {
		double[] ds = new double[3];
		float f_7_ = f * f;
		float f_8_ = f_7_ * f;
		double d = (double) (3.0F * (((Class239) this).aClass240Array2650[1].aFloat2653 - (((Class239) this).aClass240Array2650[0].aFloat2653)));
		double d_9_ = ((double) (3.0F * (((Class239) this).aClass240Array2650[2].aFloat2653 - (((Class239) this).aClass240Array2650[1].aFloat2653))) - d);
		double d_10_ = ((double) (((Class239) this).aClass240Array2650[3].aFloat2653 - ((Class239) this).aClass240Array2650[0].aFloat2653) - d - d_9_);
		ds[0] = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f + (double) ((Class239) this).aClass240Array2650[0].aFloat2653);
		d = (double) (3.0F * (((Class239) this).aClass240Array2650[1].aFloat2656 - (((Class239) this).aClass240Array2650[0].aFloat2656)));
		d_9_ = (double) (3.0F * (((Class239) this).aClass240Array2650[2].aFloat2656 - (((Class239) this).aClass240Array2650[1].aFloat2656))) - d;
		d_10_ = ((double) (((Class239) this).aClass240Array2650[3].aFloat2656 - ((Class239) this).aClass240Array2650[0].aFloat2656) - d - d_9_);
		ds[1] = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f + (double) ((Class239) this).aClass240Array2650[0].aFloat2656);
		d = (double) (3.0F * (((Class239) this).aClass240Array2650[1].aFloat2657 - (((Class239) this).aClass240Array2650[0].aFloat2657)));
		d_9_ = (double) (3.0F * (((Class239) this).aClass240Array2650[2].aFloat2657 - (((Class239) this).aClass240Array2650[1].aFloat2657))) - d;
		d_10_ = ((double) (((Class239) this).aClass240Array2650[3].aFloat2657 - ((Class239) this).aClass240Array2650[0].aFloat2657) - d - d_9_);
		ds[2] = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f + (double) ((Class239) this).aClass240Array2650[0].aFloat2657);
		return ds;
	}

	float method3255(float f) {
		if (((Class239) this).aFloat2649 == -1.0F)
			method3256();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= ((Class239) this).aFloat2649)
			return 1.0F;
		float f_11_ = 0.0F;
		float f_12_ = ((Class239) this).aFloatArray2651[0];
		for (int i = 1; i < ((Class239) this).aFloatArray2651.length; i++) {
			if (f < f_12_) {
				float f_13_ = (f - f_11_) / (f_12_ - f_11_);
				float f_14_ = ((float) (i - 1) / (float) ((Class239) this).aFloatArray2651.length);
				float f_15_ = ((float) i / (float) ((Class239) this).aFloatArray2651.length);
				return f_14_ + (f_15_ - f_14_) * f_13_;
			}
			f_11_ = f_12_;
			f_12_ += ((Class239) this).aFloatArray2651[i];
		}
		float f_16_ = (f - f_11_) / (f_12_ - f_11_);
		float f_17_ = ((float) (((Class239) this).aFloatArray2651.length - 1) / (float) ((Class239) this).aFloatArray2651.length);
		return f_17_ + (1.0F - f_17_) * f_16_;
	}

	void method3256() {
		int i = 20;
		double[] ds = method3254(0.0F);
		float f = 0.0F;
		Class240 class240 = Class240.method3306();
		for (int i_18_ = 1; i_18_ <= i; i_18_++) {
			double[] ds_19_ = method3254((float) i_18_ / (float) i);
			class240.aFloat2653 = (float) (ds_19_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_19_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_19_[2] - ds[2]);
			f += class240.method3301();
			ds = ds_19_;
		}
		int i_20_ = (int) (f / 20.0F);
		if (i_20_ < i)
			i_20_ = i;
		((Class239) this).aFloatArray2651 = new float[i_20_];
		ds = method3254(0.0F);
		float f_21_ = 0.0F;
		for (int i_22_ = 1; i_22_ <= i_20_; i_22_++) {
			double[] ds_23_ = method3254((float) i_22_ / (float) i_20_);
			class240.aFloat2653 = (float) (ds_23_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_23_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_23_[2] - ds[2]);
			float f_24_ = class240.method3301();
			f_21_ += f_24_;
			((Class239) this).aFloatArray2651[i_22_ - 1] = f_24_;
			ds = ds_23_;
		}
		((Class239) this).aFloat2649 = f_21_;
	}

	float method3257() {
		if (((Class239) this).aFloat2649 == -1.0F)
			method3256();
		return ((Class239) this).aFloat2649;
	}

	void method3258() {
		int i = 20;
		double[] ds = method3254(0.0F);
		float f = 0.0F;
		Class240 class240 = Class240.method3306();
		for (int i_25_ = 1; i_25_ <= i; i_25_++) {
			double[] ds_26_ = method3254((float) i_25_ / (float) i);
			class240.aFloat2653 = (float) (ds_26_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_26_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_26_[2] - ds[2]);
			f += class240.method3301();
			ds = ds_26_;
		}
		int i_27_ = (int) (f / 20.0F);
		if (i_27_ < i)
			i_27_ = i;
		((Class239) this).aFloatArray2651 = new float[i_27_];
		ds = method3254(0.0F);
		float f_28_ = 0.0F;
		for (int i_29_ = 1; i_29_ <= i_27_; i_29_++) {
			double[] ds_30_ = method3254((float) i_29_ / (float) i_27_);
			class240.aFloat2653 = (float) (ds_30_[0] - ds[0]);
			class240.aFloat2656 = (float) (ds_30_[1] - ds[1]);
			class240.aFloat2657 = (float) (ds_30_[2] - ds[2]);
			float f_31_ = class240.method3301();
			f_28_ += f_31_;
			((Class239) this).aFloatArray2651[i_29_ - 1] = f_31_;
			ds = ds_30_;
		}
		((Class239) this).aFloat2649 = f_28_;
	}

	float method3259() {
		if (((Class239) this).aFloat2649 == -1.0F)
			method3256();
		return ((Class239) this).aFloat2649;
	}

	void method3260() {
		((Class239) this).aFloat2649 = -1.0F;
		((Class239) this).aFloatArray2651 = null;
	}
}
