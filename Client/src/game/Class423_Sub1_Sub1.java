package game;

/* Class423_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class423_Sub1_Sub1 extends Class423_Sub1 {
	float[] aFloatArray11125;
	float[] aFloatArray11126;
	float[] aFloatArray11127;
	int anInt11128 = 0;

	void method9226(RSByteBuffer class572_sub15, int i) {
		((Class423_Sub1_Sub1) this).aFloatArray11127 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11125 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11126 = new float[i];
		((Class423_Sub1_Sub1) this).anInt11128 = 0;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			((Class423_Sub1_Sub1) this).aFloatArray11127[i_0_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11125[i_0_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11126[i_0_] = class572_sub15.method8448((byte) 2);
		}
	}

	float method9227(float f, float f_1_, float f_2_, byte i) {
		float f_3_ = ((Class423_Sub1_Sub1) this).aFloat9685 / f;
		if (f_3_ < 0.0F)
			f_3_ = 0.0F;
		if (f_3_ > 1.0F)
			f_3_ = 1.0F;
		return (((((Class423_Sub1_Sub1) this).aFloatArray11127[((Class423_Sub1_Sub1) this).anInt11128 * 68812351]) + (((((Class423_Sub1_Sub1) this).aFloatArray11125[((Class423_Sub1_Sub1) this).anInt11128 * 68812351]) - (((Class423_Sub1_Sub1) this).aFloatArray11127[68812351 * ((Class423_Sub1_Sub1) this).anInt11128])) * f_3_)) * (f / (((Class423_Sub1_Sub1) this).aFloatArray11126[((Class423_Sub1_Sub1) this).anInt11128 * 68812351])));
	}

	public Class423_Sub1_Sub1(Class411 class411) {
		super(class411);
	}

	void method9223(RSByteBuffer class572_sub15, int i, int i_4_) {
		((Class423_Sub1_Sub1) this).aFloatArray11127 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11125 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11126 = new float[i];
		((Class423_Sub1_Sub1) this).anInt11128 = 0;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			((Class423_Sub1_Sub1) this).aFloatArray11127[i_5_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11125[i_5_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11126[i_5_] = class572_sub15.method8448((byte) 2);
		}
	}

	float method9234(float f, float f_6_, float f_7_) {
		float f_8_ = ((Class423_Sub1_Sub1) this).aFloat9685 / f;
		if (f_8_ < 0.0F)
			f_8_ = 0.0F;
		if (f_8_ > 1.0F)
			f_8_ = 1.0F;
		return (((((Class423_Sub1_Sub1) this).aFloatArray11127[((Class423_Sub1_Sub1) this).anInt11128 * 68812351]) + (((((Class423_Sub1_Sub1) this).aFloatArray11125[((Class423_Sub1_Sub1) this).anInt11128 * 68812351]) - (((Class423_Sub1_Sub1) this).aFloatArray11127[68812351 * ((Class423_Sub1_Sub1) this).anInt11128])) * f_8_)) * (f / (((Class423_Sub1_Sub1) this).aFloatArray11126[((Class423_Sub1_Sub1) this).anInt11128 * 68812351])));
	}

	void method9224() {
		((Class423_Sub1_Sub1) this).anInt11128 += -616631873;
	}

	void method9228(RSByteBuffer class572_sub15, int i) {
		((Class423_Sub1_Sub1) this).aFloatArray11127 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11125 = new float[i];
		((Class423_Sub1_Sub1) this).aFloatArray11126 = new float[i];
		((Class423_Sub1_Sub1) this).anInt11128 = 0;
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			((Class423_Sub1_Sub1) this).aFloatArray11127[i_9_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11125[i_9_] = class572_sub15.method8448((byte) 2);
			((Class423_Sub1_Sub1) this).aFloatArray11126[i_9_] = class572_sub15.method8448((byte) 2);
		}
	}

	void method9221(byte i) {
		((Class423_Sub1_Sub1) this).anInt11128 += -616631873;
	}
}
