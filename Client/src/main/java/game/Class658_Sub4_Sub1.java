package game;

/* Class658_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub4_Sub1 extends Class658_Sub4 {
	int anInt11264 = 0;
	float[] aFloatArray11265;
	float[] aFloatArray11266;

	public Class658_Sub4_Sub1(Class411 class411) {
		super(class411);
	}

	public Class240 method7745(int i) {
		return method7736(-2027252997);
	}

	float method8998(float f, float f_0_, float f_1_, int i) {
		float f_2_ = (((Class658_Sub4_Sub1) this).aFloat9571 / (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * (((Class658_Sub4_Sub1) this).anInt11264)].method3228());
		float f_3_ = ((f_2_ * ((((Class658_Sub4_Sub1) this).aFloatArray11266[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]) - (((Class658_Sub4_Sub1) this).aFloatArray11265[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]))) + (((Class658_Sub4_Sub1) this).aFloatArray11265[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]));
		return f_3_;
	}

	void method8991(float f, float f_4_, int i) {
		((Class658_Sub4_Sub1) this).aFloat9571 += f;
		if (((Class658_Sub4_Sub1) this).aFloat9571 > (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3228())
			((Class658_Sub4_Sub1) this).aFloat9571 = (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[(((Class658_Sub4_Sub1) this).anInt11264 * 524242171)].method3228();
	}

	public Class240 method7736(int i) {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	double[] method9005(byte i) {
		return ((Class658_Sub4_Sub1) this).aClass236Array9576[((Class658_Sub4_Sub1) this).anInt11264 * 524242171].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
	}

	void method9002(float f, float f_5_) {
		((Class658_Sub4_Sub1) this).aFloat9571 += f;
		if (((Class658_Sub4_Sub1) this).aFloat9571 > (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3228())
			((Class658_Sub4_Sub1) this).aFloat9571 = (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[(((Class658_Sub4_Sub1) this).anInt11264 * 524242171)].method3228();
	}

	void method8994(RSByteBuffer class572_sub15, int i, byte i_6_) {
		((Class658_Sub4_Sub1) this).aFloatArray11265 = new float[i];
		((Class658_Sub4_Sub1) this).aFloatArray11266 = new float[i];
		((Class658_Sub4_Sub1) this).anInt11264 = 0;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			((Class658_Sub4_Sub1) this).aFloatArray11265[i_7_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub1) this).aFloatArray11266[i_7_] = class572_sub15.method8448((byte) 2);
		}
	}

	float method9000(float f, float f_8_, float f_9_) {
		float f_10_ = (((Class658_Sub4_Sub1) this).aFloat9571 / (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * (((Class658_Sub4_Sub1) this).anInt11264)].method3228());
		float f_11_ = ((f_10_ * ((((Class658_Sub4_Sub1) this).aFloatArray11266[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]) - (((Class658_Sub4_Sub1) this).aFloatArray11265[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]))) + (((Class658_Sub4_Sub1) this).aFloatArray11265[((Class658_Sub4_Sub1) this).anInt11264 * 524242171]));
		return f_11_;
	}

	void method8995() {
		((Class658_Sub4_Sub1) this).anInt11264 += 1866915379;
	}

	void method8996() {
		((Class658_Sub4_Sub1) this).anInt11264 += 1866915379;
	}

	double[] method8999() {
		return ((Class658_Sub4_Sub1) this).aClass236Array9576[((Class658_Sub4_Sub1) this).anInt11264 * 524242171].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
	}

	public Class240 method7752() {
		return method7736(-1765997696);
	}

	public Class240 method7749() {
		return method7736(-1948477772);
	}

	public Class240 method7740() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public Class240 method7753() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public Class240 method7754() {
		Class240 class240 = Class240.method3306();
		double[] ds = ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	void method9001(float f, float f_12_) {
		((Class658_Sub4_Sub1) this).aFloat9571 += f;
		if (((Class658_Sub4_Sub1) this).aFloat9571 > (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[524242171 * ((Class658_Sub4_Sub1) this).anInt11264].method3228())
			((Class658_Sub4_Sub1) this).aFloat9571 = (float) ((Class658_Sub4_Sub1) this).aClass236Array9576[(((Class658_Sub4_Sub1) this).anInt11264 * 524242171)].method3228();
	}

	void method8997(RSByteBuffer class572_sub15, int i) {
		((Class658_Sub4_Sub1) this).aFloatArray11265 = new float[i];
		((Class658_Sub4_Sub1) this).aFloatArray11266 = new float[i];
		((Class658_Sub4_Sub1) this).anInt11264 = 0;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			((Class658_Sub4_Sub1) this).aFloatArray11265[i_13_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub1) this).aFloatArray11266[i_13_] = class572_sub15.method8448((byte) 2);
		}
	}

	double[] method9003() {
		return ((Class658_Sub4_Sub1) this).aClass236Array9576[((Class658_Sub4_Sub1) this).anInt11264 * 524242171].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
	}

	double[] method9004() {
		return ((Class658_Sub4_Sub1) this).aClass236Array9576[((Class658_Sub4_Sub1) this).anInt11264 * 524242171].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
	}

	double[] method8993() {
		return ((Class658_Sub4_Sub1) this).aClass236Array9576[((Class658_Sub4_Sub1) this).anInt11264 * 524242171].method3231(((Class658_Sub4_Sub1) this).aFloat9571);
	}

	void method8992(byte i) {
		((Class658_Sub4_Sub1) this).anInt11264 += 1866915379;
	}
}
