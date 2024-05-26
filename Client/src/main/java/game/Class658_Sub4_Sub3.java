package game;

/* Class658_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub4_Sub3 extends Class658_Sub4 {
	float[] aFloatArray11525;
	float[] aFloatArray11526;
	float[] aFloatArray11527;
	int anInt11528 = 0;

	void method8996() {
		((Class658_Sub4_Sub3) this).anInt11528 += -884783077;
	}

	void method8992(byte i) {
		((Class658_Sub4_Sub3) this).anInt11528 += -884783077;
	}

	float method8998(float f, float f_0_, float f_1_, int i) {
		float f_2_ = ((Class658_Sub4_Sub3) this).aFloat9571 / f;
		if (f_2_ < 0.0F)
			f_2_ = 0.0F;
		if (f_2_ > 1.0F)
			f_2_ = 1.0F;
		return (((((Class658_Sub4_Sub3) this).aFloatArray11525[((Class658_Sub4_Sub3) this).anInt11528 * -2025106925]) + (f_2_ * ((((Class658_Sub4_Sub3) this).aFloatArray11526[((Class658_Sub4_Sub3) this).anInt11528 * -2025106925]) - (((Class658_Sub4_Sub3) this).aFloatArray11525[(((Class658_Sub4_Sub3) this).anInt11528 * -2025106925)])))) * (f / (((Class658_Sub4_Sub3) this).aFloatArray11527[(-2025106925 * ((Class658_Sub4_Sub3) this).anInt11528)])));
	}

	void method8997(RSByteBuffer class572_sub15, int i) {
		((Class658_Sub4_Sub3) this).aFloatArray11525 = new float[i];
		((Class658_Sub4_Sub3) this).aFloatArray11526 = new float[i];
		((Class658_Sub4_Sub3) this).aFloatArray11527 = new float[i];
		((Class658_Sub4_Sub3) this).anInt11528 = 0;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			((Class658_Sub4_Sub3) this).aFloatArray11525[i_3_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub3) this).aFloatArray11526[i_3_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub3) this).aFloatArray11527[i_3_] = class572_sub15.method8448((byte) 2);
		}
	}

	float method9000(float f, float f_4_, float f_5_) {
		float f_6_ = ((Class658_Sub4_Sub3) this).aFloat9571 / f;
		if (f_6_ < 0.0F)
			f_6_ = 0.0F;
		if (f_6_ > 1.0F)
			f_6_ = 1.0F;
		return (((((Class658_Sub4_Sub3) this).aFloatArray11525[((Class658_Sub4_Sub3) this).anInt11528 * -2025106925]) + (f_6_ * ((((Class658_Sub4_Sub3) this).aFloatArray11526[((Class658_Sub4_Sub3) this).anInt11528 * -2025106925]) - (((Class658_Sub4_Sub3) this).aFloatArray11525[(((Class658_Sub4_Sub3) this).anInt11528 * -2025106925)])))) * (f / (((Class658_Sub4_Sub3) this).aFloatArray11527[(-2025106925 * ((Class658_Sub4_Sub3) this).anInt11528)])));
	}

	void method8995() {
		((Class658_Sub4_Sub3) this).anInt11528 += -884783077;
	}

	void method8994(RSByteBuffer class572_sub15, int i, byte i_7_) {
		((Class658_Sub4_Sub3) this).aFloatArray11525 = new float[i];
		((Class658_Sub4_Sub3) this).aFloatArray11526 = new float[i];
		((Class658_Sub4_Sub3) this).aFloatArray11527 = new float[i];
		((Class658_Sub4_Sub3) this).anInt11528 = 0;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			((Class658_Sub4_Sub3) this).aFloatArray11525[i_8_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub3) this).aFloatArray11526[i_8_] = class572_sub15.method8448((byte) 2);
			((Class658_Sub4_Sub3) this).aFloatArray11527[i_8_] = class572_sub15.method8448((byte) 2);
		}
	}

	public Class658_Sub4_Sub3(Class411 class411) {
		super(class411);
	}
}
