package game;

/* Class423_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class423_Sub1 extends Class423 {
	float aFloat9685;
	float[] aFloatArray9686;
	int anInt9687 = 0;
	Class236[] aClass236Array9688;
	float aFloat9689;
	int[] anIntArray9690;

	public Class572_Sub17 method5160() {
		Class240 class240 = method5159((byte) -60);
		return new Class572_Sub17(0, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
	}

	public void method9218(Class236 class236, int i, float f, byte i_0_) {
		if (((Class423_Sub1) this).aClass236Array9688 == null) {
			((Class423_Sub1) this).aClass236Array9688 = new Class236[] { class236 };
			((Class423_Sub1) this).aFloatArray9686 = new float[] { f };
			((Class423_Sub1) this).anIntArray9690 = new int[] { i };
		} else {
			Class236[] class236s = (new Class236[((Class423_Sub1) this).aClass236Array9688.length + 1]);
			float[] fs = (new float[1 + ((Class423_Sub1) this).aClass236Array9688.length]);
			int[] is = (new int[((Class423_Sub1) this).aClass236Array9688.length + 1]);
			System.arraycopy(((Class423_Sub1) this).aClass236Array9688, 0, class236s, 0, ((Class423_Sub1) this).aClass236Array9688.length);
			System.arraycopy(((Class423_Sub1) this).aFloatArray9686, 0, fs, 0, ((Class423_Sub1) this).aClass236Array9688.length);
			System.arraycopy(((Class423_Sub1) this).anIntArray9690, 0, is, 0, ((Class423_Sub1) this).aClass236Array9688.length);
			((Class423_Sub1) this).aClass236Array9688 = class236s;
			((Class423_Sub1) this).aFloatArray9686 = fs;
			((Class423_Sub1) this).anIntArray9690 = is;
			((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).aClass236Array9688.length - 1] = class236;
			((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).aFloatArray9686.length - 1] = f;
			((Class423_Sub1) this).anIntArray9690[((Class423_Sub1) this).anIntArray9690.length - 1] = i;
		}
	}

	public void method5167(RSByteBuffer class572_sub15) {
		((Class423_Sub1) this).aFloat9685 = 0.0F;
		((Class423_Sub1) this).aFloat9689 = 0.0F;
		((Class423_Sub1) this).anInt9687 = 0;
		int i = class572_sub15.readUnsignedByte(-30526748);
		((Class423_Sub1) this).aClass236Array9688 = new Class236[i];
		((Class423_Sub1) this).aFloatArray9686 = new float[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			((Class423_Sub1) this).aClass236Array9688[i_1_] = new Class236(class572_sub15);
			((Class423_Sub1) this).aFloatArray9686[i_1_] = class572_sub15.method8448((byte) 2);
		}
		method9223(class572_sub15, i, -1497172460);
	}

	public float method9219() {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	public float method9220() {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	abstract void method9221(byte i);

	public boolean method5145(int i) {
		return ((Class423_Sub1) this).aClass236Array9688 != null;
	}

	public Class240 method5159(byte i) {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3229(((Class423_Sub1) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public double[] method5144(int i) {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3229(((Class423_Sub1) this).aFloat9685);
	}

	public void method5142(float f, int[][][] is, Class274 class274, int i, int i_2_, int i_3_) {
		Class236 class236 = (((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687]);
		if ((((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397]) > 0.0F) {
			if ((((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397]) >= f) {
				((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397] -= f;
				return;
			}
			f -= (((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687]);
			((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687] = 0.0F;
		}
		float f_4_ = 1.0F / (float) Class425.method5176(1721572294);
		while (f > 0.0F) {
			float f_5_ = class236.method3240();
			if (((Class423_Sub1) this).aFloat9685 >= f_5_) {
				if (((Class423_Sub1) this).aClass236Array9688.length == 1 + 1406844397 * ((Class423_Sub1) this).anInt9687)
					break;
				if ((((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687 + 1]) >= f) {
					((Class423_Sub1) this).aFloatArray9686[1 + 1406844397 * ((Class423_Sub1) this).anInt9687] -= f;
					break;
				}
				((Class423_Sub1) this).anInt9687 += -816240667;
				f -= (((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687]);
				((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397] = 0.0F;
				method9221((byte) 39);
				((Class423_Sub1) this).aFloat9685 = 0.0F;
				((Class423_Sub1) this).aFloat9689 = 0.0F;
				class236 = (((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397]);
				f_5_ = class236.method3240();
			}
			while (f > 0.0F && ((Class423_Sub1) this).aFloat9685 < f_5_) {
				((Class423_Sub1) this).aFloat9689 = method9227(f_5_, ((Class423_Sub1) this).aFloat9689, Math.min(f, f_4_), (byte) 1);
				f -= f_4_;
				method9233(((Class423_Sub1) this).aFloat9689, f_5_, 1378797775);
			}
		}
	}

	public float method9222(byte i) {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	public float method5147(byte i) {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3232(((Class423_Sub1) this).aFloat9685);
	}

	public void method5148(Class403 class403, int i, int i_6_, int i_7_) {
		Class240 class240 = method5159((byte) -92);
		class403.anInt4748 = ((int) class240.aFloat2653 - i) * -1776656325;
		class403.anInt4747 = (int) -class240.aFloat2656 * 962175953;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_6_) * 243738067;
	}

	public void method5162(RSByteBuffer class572_sub15, byte i) {
		((Class423_Sub1) this).aFloat9685 = 0.0F;
		((Class423_Sub1) this).aFloat9689 = 0.0F;
		((Class423_Sub1) this).anInt9687 = 0;
		int i_8_ = class572_sub15.readUnsignedByte(1356278566);
		((Class423_Sub1) this).aClass236Array9688 = new Class236[i_8_];
		((Class423_Sub1) this).aFloatArray9686 = new float[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			((Class423_Sub1) this).aClass236Array9688[i_9_] = new Class236(class572_sub15);
			((Class423_Sub1) this).aFloatArray9686[i_9_] = class572_sub15.method8448((byte) 2);
		}
		method9223(class572_sub15, i_8_, -1606971602);
	}

	abstract void method9223(RSByteBuffer class572_sub15, int i, int i_10_);

	public Class240 method5156() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3229(((Class423_Sub1) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	abstract void method9224();

	public float method9225() {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	abstract void method9226(RSByteBuffer class572_sub15, int i);

	public void method5150(float f, int[][][] is, Class274 class274, int i, int i_11_) {
		Class236 class236 = (((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687]);
		if ((((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397]) > 0.0F) {
			if ((((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397]) >= f) {
				((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397] -= f;
				return;
			}
			f -= (((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687]);
			((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687] = 0.0F;
		}
		float f_12_ = 1.0F / (float) Class425.method5176(965013116);
		while (f > 0.0F) {
			float f_13_ = class236.method3240();
			if (((Class423_Sub1) this).aFloat9685 >= f_13_) {
				if (((Class423_Sub1) this).aClass236Array9688.length == 1 + 1406844397 * ((Class423_Sub1) this).anInt9687)
					break;
				if ((((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687 + 1]) >= f) {
					((Class423_Sub1) this).aFloatArray9686[1 + 1406844397 * ((Class423_Sub1) this).anInt9687] -= f;
					break;
				}
				((Class423_Sub1) this).anInt9687 += -816240667;
				f -= (((Class423_Sub1) this).aFloatArray9686[1406844397 * ((Class423_Sub1) this).anInt9687]);
				((Class423_Sub1) this).aFloatArray9686[((Class423_Sub1) this).anInt9687 * 1406844397] = 0.0F;
				method9221((byte) 102);
				((Class423_Sub1) this).aFloat9685 = 0.0F;
				((Class423_Sub1) this).aFloat9689 = 0.0F;
				class236 = (((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397]);
				f_13_ = class236.method3240();
			}
			while (f > 0.0F && ((Class423_Sub1) this).aFloat9685 < f_13_) {
				((Class423_Sub1) this).aFloat9689 = method9227(f_13_, ((Class423_Sub1) this).aFloat9689, Math.min(f, f_12_), (byte) 1);
				f -= f_12_;
				method9233(((Class423_Sub1) this).aFloat9689, f_13_, 116113534);
			}
		}
	}

	public Class572_Sub17 method5146(int i) {
		Class240 class240 = method5159((byte) -93);
		return new Class572_Sub17(0, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
	}

	public boolean method5152() {
		return ((Class423_Sub1) this).aClass236Array9688 != null;
	}

	public boolean method5149() {
		return ((Class423_Sub1) this).aClass236Array9688 != null;
	}

	public boolean method5154() {
		return ((Class423_Sub1) this).aClass236Array9688 != null;
	}

	abstract float method9227(float f, float f_14_, float f_15_, byte i);

	public void method5166(RSByteBuffer class572_sub15) {
		((Class423_Sub1) this).aFloat9685 = 0.0F;
		((Class423_Sub1) this).aFloat9689 = 0.0F;
		((Class423_Sub1) this).anInt9687 = 0;
		int i = class572_sub15.readUnsignedByte(-82509218);
		((Class423_Sub1) this).aClass236Array9688 = new Class236[i];
		((Class423_Sub1) this).aFloatArray9686 = new float[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			((Class423_Sub1) this).aClass236Array9688[i_16_] = new Class236(class572_sub15);
			((Class423_Sub1) this).aFloatArray9686[i_16_] = class572_sub15.method8448((byte) 2);
		}
		method9223(class572_sub15, i, 838131410);
	}

	public Class572_Sub17 method5157() {
		Class240 class240 = method5159((byte) -29);
		return new Class572_Sub17(0, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
	}

	public double[] method5158() {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3229(((Class423_Sub1) this).aFloat9685);
	}

	public float method5153() {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3232(((Class423_Sub1) this).aFloat9685);
	}

	public float method5143() {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3232(((Class423_Sub1) this).aFloat9685);
	}

	public void method5161(Class403 class403, int i, int i_17_) {
		Class240 class240 = method5159((byte) -112);
		class403.anInt4748 = ((int) class240.aFloat2653 - i) * -1776656325;
		class403.anInt4747 = (int) -class240.aFloat2656 * 962175953;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_17_) * 243738067;
	}

	public void method5165(Class403 class403, int i, int i_18_) {
		Class240 class240 = method5159((byte) -119);
		class403.anInt4748 = ((int) class240.aFloat2653 - i) * -1776656325;
		class403.anInt4747 = (int) -class240.aFloat2656 * 962175953;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_18_) * 243738067;
	}

	abstract void method9228(RSByteBuffer class572_sub15, int i);

	public double[] method5164() {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3229(((Class423_Sub1) this).aFloat9685);
	}

	public double[] method5163() {
		return ((Class423_Sub1) this).aClass236Array9688[((Class423_Sub1) this).anInt9687 * 1406844397].method3229(((Class423_Sub1) this).aFloat9685);
	}

	public float method9229() {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	void method9230(float f, float f_19_) {
		((Class423_Sub1) this).aFloat9685 += f;
		if (((Class423_Sub1) this).aFloat9685 > f_19_)
			((Class423_Sub1) this).aFloat9685 = f_19_;
	}

	public boolean method5151() {
		return ((Class423_Sub1) this).aClass236Array9688 != null;
	}

	void method9231(float f, float f_20_) {
		((Class423_Sub1) this).aFloat9685 += f;
		if (((Class423_Sub1) this).aFloat9685 > f_20_)
			((Class423_Sub1) this).aFloat9685 = f_20_;
	}

	void method9232(float f, float f_21_) {
		((Class423_Sub1) this).aFloat9685 += f;
		if (((Class423_Sub1) this).aFloat9685 > f_21_)
			((Class423_Sub1) this).aFloat9685 = f_21_;
	}

	void method9233(float f, float f_22_, int i) {
		((Class423_Sub1) this).aFloat9685 += f;
		if (((Class423_Sub1) this).aFloat9685 > f_22_)
			((Class423_Sub1) this).aFloat9685 = f_22_;
	}

	abstract float method9234(float f, float f_23_, float f_24_);

	public float method9235() {
		return ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3230(((Class423_Sub1) this).aFloat9685);
	}

	Class423_Sub1(Class411 class411) {
		super(class411);
		((Class423_Sub1) this).aFloat9685 = 0.0F;
		((Class423_Sub1) this).aFloat9689 = 0.0F;
	}

	public Class240 method5155() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1) this).aClass236Array9688[1406844397 * ((Class423_Sub1) this).anInt9687].method3229(((Class423_Sub1) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}
}
