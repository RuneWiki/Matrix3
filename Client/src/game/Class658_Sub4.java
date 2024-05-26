package game;

/* Class658_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class658_Sub4 extends Class658 {
	float aFloat9571;
	float[] aFloatArray9572;
	int anInt9573 = 0;
	int[] anIntArray9574;
	float aFloat9575;
	Class236[] aClass236Array9576;

	public void method7733(float f) {
		Class236 class236 = (((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573]);
		if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) > 0.0F) {
			if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
				((Class658_Sub4) this).aFloatArray9572[1285473931 * ((Class658_Sub4) this).anInt9573] -= f;
				return;
			}
			f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
			((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
		}
		float f_0_ = 1.0F / (float) Class425.method5176(397355074);
		while (f > 0.0F) {
			float f_1_ = class236.method3240();
			if (((Class658_Sub4) this).aFloat9571 >= f_1_) {
				if (1 + 1285473931 * ((Class658_Sub4) this).anInt9573 == ((Class658_Sub4) this).aClass236Array9576.length)
					break;
				if ((((Class658_Sub4) this).aFloatArray9572[1 + ((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
					((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931 + 1] -= f;
					break;
				}
				((Class658_Sub4) this).anInt9573 += 375845155;
				f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
				((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
				method8992((byte) 27);
				((Class658_Sub4) this).aFloat9571 = 0.0F;
				((Class658_Sub4) this).aFloat9575 = 0.0F;
				class236 = (((Class658_Sub4) this).aClass236Array9576[((Class658_Sub4) this).anInt9573 * 1285473931]);
				f_1_ = class236.method3240();
			}
			while (f > 0.0F && ((Class658_Sub4) this).aFloat9571 < f_1_) {
				((Class658_Sub4) this).aFloat9575 = method8998(f_1_, ((Class658_Sub4) this).aFloat9575, Math.min(f, f_0_), 1713178924);
				f -= f_0_;
				method8991(((Class658_Sub4) this).aFloat9575, f_1_, -200060993);
			}
		}
	}

	public void method8990(Class236 class236, int i, float f, int i_2_) {
		if (((Class658_Sub4) this).aClass236Array9576 == null) {
			((Class658_Sub4) this).aClass236Array9576 = new Class236[] { class236 };
			((Class658_Sub4) this).aFloatArray9572 = new float[] { f };
			((Class658_Sub4) this).anIntArray9574 = new int[] { i };
		} else {
			Class236[] class236s = (new Class236[1 + ((Class658_Sub4) this).aClass236Array9576.length]);
			float[] fs = (new float[1 + ((Class658_Sub4) this).aClass236Array9576.length]);
			int[] is = (new int[1 + ((Class658_Sub4) this).aClass236Array9576.length]);
			System.arraycopy(((Class658_Sub4) this).aClass236Array9576, 0, class236s, 0, ((Class658_Sub4) this).aClass236Array9576.length);
			System.arraycopy(((Class658_Sub4) this).aFloatArray9572, 0, fs, 0, ((Class658_Sub4) this).aClass236Array9576.length);
			System.arraycopy(((Class658_Sub4) this).anIntArray9574, 0, is, 0, ((Class658_Sub4) this).aClass236Array9576.length);
			((Class658_Sub4) this).aClass236Array9576 = class236s;
			((Class658_Sub4) this).aFloatArray9572 = fs;
			((Class658_Sub4) this).anIntArray9574 = is;
			((Class658_Sub4) this).aClass236Array9576[((Class658_Sub4) this).aClass236Array9576.length - 1] = class236;
			((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).aFloatArray9572.length - 1] = f;
			((Class658_Sub4) this).anIntArray9574[((Class658_Sub4) this).anIntArray9574.length - 1] = i;
		}
	}

	public void method7734(float f, int i) {
		Class236 class236 = (((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573]);
		if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) > 0.0F) {
			if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
				((Class658_Sub4) this).aFloatArray9572[1285473931 * ((Class658_Sub4) this).anInt9573] -= f;
				return;
			}
			f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
			((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
		}
		float f_3_ = 1.0F / (float) Class425.method5176(792917267);
		while (f > 0.0F) {
			float f_4_ = class236.method3240();
			if (((Class658_Sub4) this).aFloat9571 >= f_4_) {
				if (1 + 1285473931 * ((Class658_Sub4) this).anInt9573 == ((Class658_Sub4) this).aClass236Array9576.length)
					break;
				if ((((Class658_Sub4) this).aFloatArray9572[1 + ((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
					((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931 + 1] -= f;
					break;
				}
				((Class658_Sub4) this).anInt9573 += 375845155;
				f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
				((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
				method8992((byte) -59);
				((Class658_Sub4) this).aFloat9571 = 0.0F;
				((Class658_Sub4) this).aFloat9575 = 0.0F;
				class236 = (((Class658_Sub4) this).aClass236Array9576[((Class658_Sub4) this).anInt9573 * 1285473931]);
				f_4_ = class236.method3240();
			}
			while (f > 0.0F && ((Class658_Sub4) this).aFloat9571 < f_4_) {
				((Class658_Sub4) this).aFloat9575 = method8998(f_4_, ((Class658_Sub4) this).aFloat9575, Math.min(f, f_3_), -356653881);
				f -= f_3_;
				method8991(((Class658_Sub4) this).aFloat9575, f_4_, -200060993);
			}
		}
	}

	void method8991(float f, float f_5_, int i) {
		((Class658_Sub4) this).aFloat9571 += f;
		if (((Class658_Sub4) this).aFloat9571 > f_5_)
			((Class658_Sub4) this).aFloat9571 = f_5_;
	}

	public Class240 method7749() {
		return method7736(-1825913611);
	}

	abstract void method8992(byte i);

	public Class240 method7736(int i) {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	double[] method8993() {
		return ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
	}

	public Class240 method7745(int i) {
		return method7736(-2043005840);
	}

	public void method7739(Class403 class403, Class261 class261, int i, int i_6_, float f, byte i_7_) {
		double[] ds = ((Class658_Sub4) this).aClass411_8421.method4996(-1171198583);
		ds[0] -= (double) i;
		ds[2] -= (double) i_6_;
		double[] ds_8_ = method9005((byte) 100);
		ds_8_[0] -= (double) i;
		ds_8_[2] -= (double) i_6_;
		ds[1] *= -1.0;
		ds_8_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_8_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_8_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_8_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_9_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_10_ = Class240.method3281(class240, class240_9_);
		class240_9_ = Class240.method3281(class240_10_, class240);
		class240_9_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_8_[0], ds_8_[1], ds_8_[2], class240_9_.aFloat2653, class240_9_.aFloat2656, class240_9_.aFloat2657);
		class240_9_.method3261();
	}

	Class658_Sub4(Class411 class411) {
		super(class411);
		((Class658_Sub4) this).aFloat9571 = 0.0F;
		((Class658_Sub4) this).aFloat9575 = 0.0F;
	}

	abstract void method8994(RSByteBuffer class572_sub15, int i, byte i_11_);

	public Class240 method7754() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	abstract void method8995();

	abstract void method8996();

	abstract void method8997(RSByteBuffer class572_sub15, int i);

	abstract float method8998(float f, float f_12_, float f_13_, int i);

	public void method7741(float f) {
		Class236 class236 = (((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573]);
		if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) > 0.0F) {
			if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
				((Class658_Sub4) this).aFloatArray9572[1285473931 * ((Class658_Sub4) this).anInt9573] -= f;
				return;
			}
			f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
			((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
		}
		float f_14_ = 1.0F / (float) Class425.method5176(643877353);
		while (f > 0.0F) {
			float f_15_ = class236.method3240();
			if (((Class658_Sub4) this).aFloat9571 >= f_15_) {
				if (1 + 1285473931 * ((Class658_Sub4) this).anInt9573 == ((Class658_Sub4) this).aClass236Array9576.length)
					break;
				if ((((Class658_Sub4) this).aFloatArray9572[1 + ((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
					((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931 + 1] -= f;
					break;
				}
				((Class658_Sub4) this).anInt9573 += 375845155;
				f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
				((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
				method8992((byte) 16);
				((Class658_Sub4) this).aFloat9571 = 0.0F;
				((Class658_Sub4) this).aFloat9575 = 0.0F;
				class236 = (((Class658_Sub4) this).aClass236Array9576[((Class658_Sub4) this).anInt9573 * 1285473931]);
				f_15_ = class236.method3240();
			}
			while (f > 0.0F && ((Class658_Sub4) this).aFloat9571 < f_15_) {
				((Class658_Sub4) this).aFloat9575 = method8998(f_15_, ((Class658_Sub4) this).aFloat9575, Math.min(f, f_14_), 1322565026);
				f -= f_14_;
				method8991(((Class658_Sub4) this).aFloat9575, f_15_, -200060993);
			}
		}
	}

	public void method7738(float f) {
		Class236 class236 = (((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573]);
		if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) > 0.0F) {
			if ((((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
				((Class658_Sub4) this).aFloatArray9572[1285473931 * ((Class658_Sub4) this).anInt9573] -= f;
				return;
			}
			f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
			((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
		}
		float f_16_ = 1.0F / (float) Class425.method5176(1989972330);
		while (f > 0.0F) {
			float f_17_ = class236.method3240();
			if (((Class658_Sub4) this).aFloat9571 >= f_17_) {
				if (1 + 1285473931 * ((Class658_Sub4) this).anInt9573 == ((Class658_Sub4) this).aClass236Array9576.length)
					break;
				if ((((Class658_Sub4) this).aFloatArray9572[1 + ((Class658_Sub4) this).anInt9573 * 1285473931]) >= f) {
					((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931 + 1] -= f;
					break;
				}
				((Class658_Sub4) this).anInt9573 += 375845155;
				f -= (((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931]);
				((Class658_Sub4) this).aFloatArray9572[((Class658_Sub4) this).anInt9573 * 1285473931] = 0.0F;
				method8992((byte) 3);
				((Class658_Sub4) this).aFloat9571 = 0.0F;
				((Class658_Sub4) this).aFloat9575 = 0.0F;
				class236 = (((Class658_Sub4) this).aClass236Array9576[((Class658_Sub4) this).anInt9573 * 1285473931]);
				f_17_ = class236.method3240();
			}
			while (f > 0.0F && ((Class658_Sub4) this).aFloat9571 < f_17_) {
				((Class658_Sub4) this).aFloat9575 = method8998(f_17_, ((Class658_Sub4) this).aFloat9575, Math.min(f, f_16_), 390355642);
				f -= f_16_;
				method8991(((Class658_Sub4) this).aFloat9575, f_17_, -200060993);
			}
		}
	}

	public boolean method7743() {
		return null != ((Class658_Sub4) this).aClass236Array9576;
	}

	public boolean method7744() {
		return null != ((Class658_Sub4) this).aClass236Array9576;
	}

	public void method7748(Class403 class403, Class261 class261, int i, int i_18_, float f) {
		double[] ds = ((Class658_Sub4) this).aClass411_8421.method4996(1888806265);
		ds[0] -= (double) i;
		ds[2] -= (double) i_18_;
		double[] ds_19_ = method9005((byte) -55);
		ds_19_[0] -= (double) i;
		ds_19_[2] -= (double) i_18_;
		ds[1] *= -1.0;
		ds_19_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_19_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_19_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_19_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_20_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_21_ = Class240.method3281(class240, class240_20_);
		class240_20_ = Class240.method3281(class240_21_, class240);
		class240_20_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_19_[0], ds_19_[1], ds_19_[2], class240_20_.aFloat2653, class240_20_.aFloat2656, class240_20_.aFloat2657);
		class240_20_.method3261();
	}

	public void method7737(RSByteBuffer class572_sub15, int i) {
		((Class658_Sub4) this).aFloat9571 = 0.0F;
		((Class658_Sub4) this).aFloat9575 = 0.0F;
		((Class658_Sub4) this).anInt9573 = 0;
		int i_22_ = class572_sub15.readUnsignedByte(42733510);
		((Class658_Sub4) this).aClass236Array9576 = new Class236[i_22_];
		((Class658_Sub4) this).aFloatArray9572 = new float[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
			((Class658_Sub4) this).aClass236Array9576[i_23_] = new Class236(class572_sub15);
			((Class658_Sub4) this).aFloatArray9572[i_23_] = class572_sub15.method8448((byte) 2);
		}
		method8994(class572_sub15, i_22_, (byte) -97);
	}

	public void method7751(RSByteBuffer class572_sub15) {
		((Class658_Sub4) this).aFloat9571 = 0.0F;
		((Class658_Sub4) this).aFloat9575 = 0.0F;
		((Class658_Sub4) this).anInt9573 = 0;
		int i = class572_sub15.readUnsignedByte(1665017640);
		((Class658_Sub4) this).aClass236Array9576 = new Class236[i];
		((Class658_Sub4) this).aFloatArray9572 = new float[i];
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			((Class658_Sub4) this).aClass236Array9576[i_24_] = new Class236(class572_sub15);
			((Class658_Sub4) this).aFloatArray9572[i_24_] = class572_sub15.method8448((byte) 2);
		}
		method8994(class572_sub15, i, (byte) -68);
	}

	public Class240 method7752() {
		return method7736(-1850611876);
	}

	public void method7747(Class403 class403, Class261 class261, int i, int i_25_, float f) {
		double[] ds = ((Class658_Sub4) this).aClass411_8421.method4996(689073372);
		ds[0] -= (double) i;
		ds[2] -= (double) i_25_;
		double[] ds_26_ = method9005((byte) 3);
		ds_26_[0] -= (double) i;
		ds_26_[2] -= (double) i_25_;
		ds[1] *= -1.0;
		ds_26_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_26_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_26_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_26_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_27_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_28_ = Class240.method3281(class240, class240_27_);
		class240_27_ = Class240.method3281(class240_28_, class240);
		class240_27_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_26_[0], ds_26_[1], ds_26_[2], class240_27_.aFloat2653, class240_27_.aFloat2656, class240_27_.aFloat2657);
		class240_27_.method3261();
	}

	double[] method8999() {
		return ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
	}

	public void method7750(RSByteBuffer class572_sub15) {
		((Class658_Sub4) this).aFloat9571 = 0.0F;
		((Class658_Sub4) this).aFloat9575 = 0.0F;
		((Class658_Sub4) this).anInt9573 = 0;
		int i = class572_sub15.readUnsignedByte(1786552710);
		((Class658_Sub4) this).aClass236Array9576 = new Class236[i];
		((Class658_Sub4) this).aFloatArray9572 = new float[i];
		for (int i_29_ = 0; i_29_ < i; i_29_++) {
			((Class658_Sub4) this).aClass236Array9576[i_29_] = new Class236(class572_sub15);
			((Class658_Sub4) this).aFloatArray9572[i_29_] = class572_sub15.method8448((byte) 2);
		}
		method8994(class572_sub15, i, (byte) -26);
	}

	public boolean method7735(byte i) {
		return null != ((Class658_Sub4) this).aClass236Array9576;
	}

	public Class240 method7740() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public Class240 method7753() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	abstract float method9000(float f, float f_30_, float f_31_);

	public void method7746(Class403 class403, Class261 class261, int i, int i_32_, float f) {
		double[] ds = ((Class658_Sub4) this).aClass411_8421.method4996(257582814);
		ds[0] -= (double) i;
		ds[2] -= (double) i_32_;
		double[] ds_33_ = method9005((byte) -51);
		ds_33_[0] -= (double) i;
		ds_33_[2] -= (double) i_32_;
		ds[1] *= -1.0;
		ds_33_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_33_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_33_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_33_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_34_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_35_ = Class240.method3281(class240, class240_34_);
		class240_34_ = Class240.method3281(class240_35_, class240);
		class240_34_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_33_[0], ds_33_[1], ds_33_[2], class240_34_.aFloat2653, class240_34_.aFloat2656, class240_34_.aFloat2657);
		class240_34_.method3261();
	}

	void method9001(float f, float f_36_) {
		((Class658_Sub4) this).aFloat9571 += f;
		if (((Class658_Sub4) this).aFloat9571 > f_36_)
			((Class658_Sub4) this).aFloat9571 = f_36_;
	}

	void method9002(float f, float f_37_) {
		((Class658_Sub4) this).aFloat9571 += f;
		if (((Class658_Sub4) this).aFloat9571 > f_37_)
			((Class658_Sub4) this).aFloat9571 = f_37_;
	}

	double[] method9003() {
		return ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
	}

	double[] method9004() {
		return ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
	}

	public boolean method7742() {
		return null != ((Class658_Sub4) this).aClass236Array9576;
	}

	double[] method9005(byte i) {
		return ((Class658_Sub4) this).aClass236Array9576[1285473931 * ((Class658_Sub4) this).anInt9573].method3229(((Class658_Sub4) this).aFloat9571);
	}
}
