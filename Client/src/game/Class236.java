package game;

/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class236 {
	float[] aFloatArray2643;
	Class239[] aClass239Array2644 = new Class239[1];

	public float method3227() {
		float f = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++)
			f += ((Class236) this).aClass239Array2644[i].method3259();
		return f;
	}

	public int method3228() {
		return ((Class236) this).aClass239Array2644.length;
	}

	public double[] method3229(float f) {
		float f_0_ = 0.0F;
		float f_1_ = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++) {
			f_1_ += ((Class236) this).aClass239Array2644[i].method3259();
			if (f < f_1_) {
				float f_2_ = ((Class236) this).aClass239Array2644[i].method3255(f - f_0_);
				return ((Class236) this).aClass239Array2644[i].method3254(f_2_);
			}
			f_0_ = f_1_;
		}
		return ((Class236) this).aClass239Array2644[((Class236) this).aClass239Array2644.length - 1].method3254(1.0F);
	}

	public float method3230(float f) {
		float f_3_ = 0.0F;
		float f_4_ = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++) {
			f_4_ += ((Class236) this).aClass239Array2644[i].method3259();
			if (f < f_4_)
				return (((Class236) this).aClass239Array2644[i].method3255(f - f_3_) + (float) i);
			f_3_ = f_4_;
		}
		return (float) ((Class236) this).aClass239Array2644.length;
	}

	public double[] method3231(float f) {
		int i = (int) f;
		if (i < ((Class236) this).aClass239Array2644.length)
			return ((Class236) this).aClass239Array2644[i].method3254(f - (float) i);
		return ((Class236) this).aClass239Array2644[((Class236) this).aClass239Array2644.length - 1].method3254(1.0F);
	}

	public float method3232(float f) {
		return method3233(method3230(f));
	}

	public float method3233(float f) {
		int i = (int) f;
		if (i + 1 < ((Class236) this).aFloatArray2643.length) {
			float f_5_ = ((Class236) this).aFloatArray2643[i];
			float f_6_ = ((Class236) this).aFloatArray2643[i + 1];
			float f_7_ = f - (float) i;
			return (1.0F - f_7_) * f_5_ + f_7_ * f_6_;
		}
		return (((Class236) this).aFloatArray2643[((Class236) this).aFloatArray2643.length - 1]);
	}

	public Class236(RSByteBuffer class572_sub15) {
		((Class236) this).aFloatArray2643 = new float[2];
		int i = class572_sub15.readUnsignedSmart(1404288949);
		((Class236) this).aClass239Array2644[0] = new Class239();
		((Class236) this).aClass239Array2644[0].method3252(0, Class240.method3264(class572_sub15));
		((Class236) this).aClass239Array2644[0].method3252(1, Class240.method3264(class572_sub15));
		((Class236) this).aFloatArray2643[0] = class572_sub15.method8448((byte) 2);
		Class240 class240 = Class240.method3264(class572_sub15);
		Class240 class240_8_ = Class240.method3264(class572_sub15);
		Class240 class240_9_ = Class240.method3277(class240, class240_8_);
		class240_8_.method3261();
		class240_8_ = class240_9_;
		class240_8_.method3305(class240);
		((Class236) this).aClass239Array2644[0].method3252(3, class240);
		((Class236) this).aClass239Array2644[0].method3252(2, class240_8_);
		((Class236) this).aFloatArray2643[1] = class572_sub15.method8448((byte) 2);
		for (int i_10_ = 2; i_10_ < i; i_10_++) {
			Class240 class240_11_ = Class240.method3264(class572_sub15);
			Class240 class240_12_ = Class240.method3264(class572_sub15);
			Class240 class240_13_ = Class240.method3277(class240_11_, class240_12_);
			class240_12_.method3261();
			class240_12_ = class240_13_;
			class240_12_.method3305(class240_11_);
			method3236(class240_11_, class240_12_, class572_sub15.method8448((byte) 2));
		}
	}

	public int method3234() {
		return ((Class236) this).aClass239Array2644.length;
	}

	public float method3235() {
		float f = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++)
			f += ((Class236) this).aClass239Array2644[i].method3259();
		return f;
	}

	void method3236(Class240 class240, Class240 class240_14_, float f) {
		Class239[] class239s = new Class239[((Class236) this).aClass239Array2644.length + 1];
		System.arraycopy(((Class236) this).aClass239Array2644, 0, class239s, 0, ((Class236) this).aClass239Array2644.length);
		Class239 class239 = new Class239();
		Class239 class239_15_ = (((Class236) this).aClass239Array2644[((Class236) this).aClass239Array2644.length - 1]);
		class239.method3252(0, class239_15_.method3253(3));
		Class240 class240_16_ = Class240.method3277(class239_15_.method3253(3), class239_15_.method3253(2));
		class239.method3252(1, Class240.method3303(class239_15_.method3253(3), class240_16_));
		class239.method3252(3, class240);
		class239.method3252(2, class240_14_);
		class239s[class239s.length - 1] = class239;
		((Class236) this).aClass239Array2644 = class239s;
		float[] fs = new float[((Class236) this).aFloatArray2643.length + 1];
		System.arraycopy(((Class236) this).aFloatArray2643, 0, fs, 0, ((Class236) this).aFloatArray2643.length);
		fs[fs.length - 1] = f;
		((Class236) this).aFloatArray2643 = fs;
	}

	public float method3237(float f) {
		float f_17_ = 0.0F;
		float f_18_ = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++) {
			f_18_ += ((Class236) this).aClass239Array2644[i].method3259();
			if (f < f_18_)
				return (((Class236) this).aClass239Array2644[i].method3255(f - f_17_) + (float) i);
			f_17_ = f_18_;
		}
		return (float) ((Class236) this).aClass239Array2644.length;
	}

	public float method3238(float f) {
		return method3233(method3230(f));
	}

	public int method3239() {
		return ((Class236) this).aClass239Array2644.length;
	}

	public float method3240() {
		float f = 0.0F;
		for (int i = 0; i < ((Class236) this).aClass239Array2644.length; i++)
			f += ((Class236) this).aClass239Array2644[i].method3259();
		return f;
	}
}
