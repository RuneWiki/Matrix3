package game;

/* Class331_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub1 extends Class331 {
	int anInt9508;
	int anInt9509;
	int anInt9510;
	int anInt9511;
	int anInt9512;
	int anInt9513;
	int anInt9514;
	int anInt9515;
	byte[] aByteArray9516;

	void method8872(int i, byte i_0_) {
		((Class331_Sub1) this).aByteArray9516[i] = i_0_;
	}

	Class331_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f, float f_5_, float f_6_) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		((Class331_Sub1) this).anInt9514 = (int) (f_6_ * 4096.0F);
		((Class331_Sub1) this).anInt9515 = (int) (f_5_ * 4096.0F);
		((Class331_Sub1) this).anInt9509 = ((Class331_Sub1) this).anInt9508 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method4176() {
		((Class331_Sub1) this).anInt9509 = ((Class331_Sub1) this).anInt9508;
		((Class331_Sub1) this).anInt9513 >>= 4;
		if (((Class331_Sub1) this).anInt9513 < 0)
			((Class331_Sub1) this).anInt9513 = 0;
		else if (((Class331_Sub1) this).anInt9513 > 255)
			((Class331_Sub1) this).anInt9513 = 255;
		method8874(((Class331_Sub1) this).anInt9511++, (byte) ((Class331_Sub1) this).anInt9513);
		((Class331_Sub1) this).anInt9513 = 0;
	}

	void method4159() {
		((Class331_Sub1) this).anInt9511 = 0;
		((Class331_Sub1) this).anInt9513 = 0;
	}

	void method4163(int i, int i_7_) {
		if (i != 0) {
			((Class331_Sub1) this).anInt9512 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9514) >> 12;
			if (((Class331_Sub1) this).anInt9512 < 0)
				((Class331_Sub1) this).anInt9512 = 0;
			else if (((Class331_Sub1) this).anInt9512 > 4096)
				((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_7_ < 0 ? -i_7_ : i_7_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9512) >> 12;
			((Class331_Sub1) this).anInt9513 += (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9509) >> 12;
			((Class331_Sub1) this).anInt9509 = (((Class331_Sub1) this).anInt9509 * ((Class331_Sub1) this).anInt9508) >> 12;
		} else {
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_7_ < 0 ? -i_7_ : i_7_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9513 = ((Class331_Sub1) this).anInt9510;
		}
	}

	void method8873(int i, byte i_8_) {
		((Class331_Sub1) this).aByteArray9516[i] = i_8_;
	}

	void method8874(int i, byte i_9_) {
		((Class331_Sub1) this).aByteArray9516[i] = i_9_;
	}

	void method4167() {
		((Class331_Sub1) this).anInt9509 = ((Class331_Sub1) this).anInt9508;
		((Class331_Sub1) this).anInt9513 >>= 4;
		if (((Class331_Sub1) this).anInt9513 < 0)
			((Class331_Sub1) this).anInt9513 = 0;
		else if (((Class331_Sub1) this).anInt9513 > 255)
			((Class331_Sub1) this).anInt9513 = 255;
		method8874(((Class331_Sub1) this).anInt9511++, (byte) ((Class331_Sub1) this).anInt9513);
		((Class331_Sub1) this).anInt9513 = 0;
	}

	void method4172() {
		((Class331_Sub1) this).anInt9509 = ((Class331_Sub1) this).anInt9508;
		((Class331_Sub1) this).anInt9513 >>= 4;
		if (((Class331_Sub1) this).anInt9513 < 0)
			((Class331_Sub1) this).anInt9513 = 0;
		else if (((Class331_Sub1) this).anInt9513 > 255)
			((Class331_Sub1) this).anInt9513 = 255;
		method8874(((Class331_Sub1) this).anInt9511++, (byte) ((Class331_Sub1) this).anInt9513);
		((Class331_Sub1) this).anInt9513 = 0;
	}

	void method4169(int i, int i_10_) {
		if (i != 0) {
			((Class331_Sub1) this).anInt9512 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9514) >> 12;
			if (((Class331_Sub1) this).anInt9512 < 0)
				((Class331_Sub1) this).anInt9512 = 0;
			else if (((Class331_Sub1) this).anInt9512 > 4096)
				((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_10_ < 0 ? -i_10_ : i_10_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9512) >> 12;
			((Class331_Sub1) this).anInt9513 += (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9509) >> 12;
			((Class331_Sub1) this).anInt9509 = (((Class331_Sub1) this).anInt9509 * ((Class331_Sub1) this).anInt9508) >> 12;
		} else {
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_10_ < 0 ? -i_10_ : i_10_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9513 = ((Class331_Sub1) this).anInt9510;
		}
	}

	void method4161(int i, int i_11_) {
		if (i != 0) {
			((Class331_Sub1) this).anInt9512 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9514) >> 12;
			if (((Class331_Sub1) this).anInt9512 < 0)
				((Class331_Sub1) this).anInt9512 = 0;
			else if (((Class331_Sub1) this).anInt9512 > 4096)
				((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_11_ < 0 ? -i_11_ : i_11_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9512) >> 12;
			((Class331_Sub1) this).anInt9513 += (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9509) >> 12;
			((Class331_Sub1) this).anInt9509 = (((Class331_Sub1) this).anInt9509 * ((Class331_Sub1) this).anInt9508) >> 12;
		} else {
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_11_ < 0 ? -i_11_ : i_11_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9513 = ((Class331_Sub1) this).anInt9510;
		}
	}

	void method4171(int i, int i_12_) {
		if (i != 0) {
			((Class331_Sub1) this).anInt9512 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9514) >> 12;
			if (((Class331_Sub1) this).anInt9512 < 0)
				((Class331_Sub1) this).anInt9512 = 0;
			else if (((Class331_Sub1) this).anInt9512 > 4096)
				((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_12_ < 0 ? -i_12_ : i_12_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9512) >> 12;
			((Class331_Sub1) this).anInt9513 += (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9509) >> 12;
			((Class331_Sub1) this).anInt9509 = (((Class331_Sub1) this).anInt9509 * ((Class331_Sub1) this).anInt9508) >> 12;
		} else {
			((Class331_Sub1) this).anInt9510 = ((Class331_Sub1) this).anInt9515 - (i_12_ < 0 ? -i_12_ : i_12_);
			((Class331_Sub1) this).anInt9510 = (((Class331_Sub1) this).anInt9510 * ((Class331_Sub1) this).anInt9510) >> 12;
			((Class331_Sub1) this).anInt9512 = 4096;
			((Class331_Sub1) this).anInt9513 = ((Class331_Sub1) this).anInt9510;
		}
	}

	void method4168() {
		((Class331_Sub1) this).anInt9511 = 0;
		((Class331_Sub1) this).anInt9513 = 0;
	}

	void method4178() {
		((Class331_Sub1) this).anInt9511 = 0;
		((Class331_Sub1) this).anInt9513 = 0;
	}
}
