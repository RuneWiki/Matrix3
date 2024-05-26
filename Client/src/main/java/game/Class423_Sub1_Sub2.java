package game;

/* Class423_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class423_Sub1_Sub2 extends Class423_Sub1 {
	float[] aFloatArray11159;
	float[] aFloatArray11160;
	int anInt11161 = 0;

	void method9233(float f, float f_0_, int i) {
		((Class423_Sub1_Sub2) this).aFloat9685 += f;
		if (((Class423_Sub1_Sub2) this).aFloat9685 > (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3228())
			((Class423_Sub1_Sub2) this).aFloat9685 = (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[(1868696013 * ((Class423_Sub1_Sub2) this).anInt11161)].method3228();
	}

	void method9221(byte i) {
		((Class423_Sub1_Sub2) this).anInt11161 += 1565657861;
	}

	float method9227(float f, float f_1_, float f_2_, byte i) {
		float f_3_ = (((Class423_Sub1_Sub2) this).aFloat9685 / (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[1868696013 * (((Class423_Sub1_Sub2) this).anInt11161)].method3228());
		float f_4_ = ((((((Class423_Sub1_Sub2) this).aFloatArray11159[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161]) - (((Class423_Sub1_Sub2) this).aFloatArray11160[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161])) * f_3_) + (((Class423_Sub1_Sub2) this).aFloatArray11160[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013]));
		return f_4_;
	}

	void method9224() {
		((Class423_Sub1_Sub2) this).anInt11161 += 1565657861;
	}

	public Class240 method5156() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1_Sub2) this).aClass236Array9688[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	void method9226(RSByteBuffer class572_sub15, int i) {
		((Class423_Sub1_Sub2) this).aFloatArray11160 = new float[i];
		((Class423_Sub1_Sub2) this).aFloatArray11159 = new float[i];
		((Class423_Sub1_Sub2) this).anInt11161 = 0;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			((Class423_Sub1_Sub2) this).aFloatArray11160[i_5_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub2) this).aFloatArray11159[i_5_] = class572_sub15.method8448((byte) 2);
		}
	}

	public float method9222(byte i) {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}

	public float method9225() {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}

	void method9223(RSByteBuffer class572_sub15, int i, int i_6_) {
		((Class423_Sub1_Sub2) this).aFloatArray11160 = new float[i];
		((Class423_Sub1_Sub2) this).aFloatArray11159 = new float[i];
		((Class423_Sub1_Sub2) this).anInt11161 = 0;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			((Class423_Sub1_Sub2) this).aFloatArray11160[i_7_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub2) this).aFloatArray11159[i_7_] = class572_sub15.method8448((byte) 2);
		}
	}

	public double[] method5164() {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public Class240 method5155() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1_Sub2) this).aClass236Array9688[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	void method9228(RSByteBuffer class572_sub15, int i) {
		((Class423_Sub1_Sub2) this).aFloatArray11160 = new float[i];
		((Class423_Sub1_Sub2) this).aFloatArray11159 = new float[i];
		((Class423_Sub1_Sub2) this).anInt11161 = 0;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			((Class423_Sub1_Sub2) this).aFloatArray11160[i_8_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub2) this).aFloatArray11159[i_8_] = class572_sub15.method8448((byte) 2);
		}
	}

	public Class240 method5159(byte i) {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class423_Sub1_Sub2) this).aClass236Array9688[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public Class423_Sub1_Sub2(Class411 class411) {
		super(class411);
	}

	public float method5147(byte i) {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3233(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public float method5153() {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3233(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public float method5143() {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3233(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public double[] method5158() {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public double[] method5144(int i) {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	public double[] method5163() {
		return ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3231(((Class423_Sub1_Sub2) this).aFloat9685);
	}

	void method9230(float f, float f_9_) {
		((Class423_Sub1_Sub2) this).aFloat9685 += f;
		if (((Class423_Sub1_Sub2) this).aFloat9685 > (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3228())
			((Class423_Sub1_Sub2) this).aFloat9685 = (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[(1868696013 * ((Class423_Sub1_Sub2) this).anInt11161)].method3228();
	}

	void method9231(float f, float f_10_) {
		((Class423_Sub1_Sub2) this).aFloat9685 += f;
		if (((Class423_Sub1_Sub2) this).aFloat9685 > (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3228())
			((Class423_Sub1_Sub2) this).aFloat9685 = (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[(1868696013 * ((Class423_Sub1_Sub2) this).anInt11161)].method3228();
	}

	void method9232(float f, float f_11_) {
		((Class423_Sub1_Sub2) this).aFloat9685 += f;
		if (((Class423_Sub1_Sub2) this).aFloat9685 > (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013].method3228())
			((Class423_Sub1_Sub2) this).aFloat9685 = (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[(1868696013 * ((Class423_Sub1_Sub2) this).anInt11161)].method3228();
	}

	public float method9235() {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}

	float method9234(float f, float f_12_, float f_13_) {
		float f_14_ = (((Class423_Sub1_Sub2) this).aFloat9685 / (float) ((Class423_Sub1_Sub2) this).aClass236Array9688[1868696013 * (((Class423_Sub1_Sub2) this).anInt11161)].method3228());
		float f_15_ = ((((((Class423_Sub1_Sub2) this).aFloatArray11159[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161]) - (((Class423_Sub1_Sub2) this).aFloatArray11160[1868696013 * ((Class423_Sub1_Sub2) this).anInt11161])) * f_14_) + (((Class423_Sub1_Sub2) this).aFloatArray11160[((Class423_Sub1_Sub2) this).anInt11161 * 1868696013]));
		return f_15_;
	}

	public float method9219() {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}

	public float method9229() {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}

	public float method9220() {
		return ((Class423_Sub1_Sub2) this).aFloat9685;
	}
}
