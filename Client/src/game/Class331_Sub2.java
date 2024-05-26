package game;

/* Class331_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub2 extends Class331 {
	int[] anIntArray9745 = new int[((Class331_Sub2) this).anInt4247];
	int anInt9746;
	int anInt9747;
	byte[] aByteArray9748;

	void method4163(int i, int i_0_) {
		((Class331_Sub2) this).anInt9747 += i_0_ * ((Class331_Sub2) this).anIntArray9745[i] >> 12;
	}

	void method4159() {
		((Class331_Sub2) this).anInt9746 = 0;
		((Class331_Sub2) this).anInt9747 = 0;
	}

	void method9260(int i, byte i_1_) {
		((Class331_Sub2) this).aByteArray9748[((Class331_Sub2) this).anInt9746++] = (byte) (127 + ((i_1_ & 0xff) >> 1));
	}

	void method4172() {
		((Class331_Sub2) this).anInt9747 = Math.abs(((Class331_Sub2) this).anInt9747);
		if (((Class331_Sub2) this).anInt9747 >= 4096)
			((Class331_Sub2) this).anInt9747 = 4095;
		method9263(((Class331_Sub2) this).anInt9746++, (byte) (((Class331_Sub2) this).anInt9747 >> 4));
		((Class331_Sub2) this).anInt9747 = 0;
	}

	void method4178() {
		((Class331_Sub2) this).anInt9746 = 0;
		((Class331_Sub2) this).anInt9747 = 0;
	}

	void method9261(int i, byte i_2_) {
		((Class331_Sub2) this).aByteArray9748[((Class331_Sub2) this).anInt9746++] = (byte) (127 + ((i_2_ & 0xff) >> 1));
	}

	void method9262(int i, byte i_3_) {
		((Class331_Sub2) this).aByteArray9748[((Class331_Sub2) this).anInt9746++] = (byte) (127 + ((i_3_ & 0xff) >> 1));
	}

	void method4176() {
		((Class331_Sub2) this).anInt9747 = Math.abs(((Class331_Sub2) this).anInt9747);
		if (((Class331_Sub2) this).anInt9747 >= 4096)
			((Class331_Sub2) this).anInt9747 = 4095;
		method9263(((Class331_Sub2) this).anInt9746++, (byte) (((Class331_Sub2) this).anInt9747 >> 4));
		((Class331_Sub2) this).anInt9747 = 0;
	}

	void method4171(int i, int i_4_) {
		((Class331_Sub2) this).anInt9747 += i_4_ * ((Class331_Sub2) this).anIntArray9745[i] >> 12;
	}

	void method4167() {
		((Class331_Sub2) this).anInt9747 = Math.abs(((Class331_Sub2) this).anInt9747);
		if (((Class331_Sub2) this).anInt9747 >= 4096)
			((Class331_Sub2) this).anInt9747 = 4095;
		method9263(((Class331_Sub2) this).anInt9746++, (byte) (((Class331_Sub2) this).anInt9747 >> 4));
		((Class331_Sub2) this).anInt9747 = 0;
	}

	Class331_Sub2(int i, int i_5_, int i_6_, int i_7_, int i_8_, float f) {
		super(i, i_5_, i_6_, i_7_, i_8_);
		for (int i_9_ = 0; i_9_ < ((Class331_Sub2) this).anInt4247; i_9_++)
			((Class331_Sub2) this).anIntArray9745[i_9_] = (short) (int) (Math.pow((double) f, (double) i_9_) * 4096.0);
	}

	void method4169(int i, int i_10_) {
		((Class331_Sub2) this).anInt9747 += i_10_ * ((Class331_Sub2) this).anIntArray9745[i] >> 12;
	}

	void method4161(int i, int i_11_) {
		((Class331_Sub2) this).anInt9747 += i_11_ * ((Class331_Sub2) this).anIntArray9745[i] >> 12;
	}

	void method9263(int i, byte i_12_) {
		((Class331_Sub2) this).aByteArray9748[((Class331_Sub2) this).anInt9746++] = (byte) (127 + ((i_12_ & 0xff) >> 1));
	}

	void method4168() {
		((Class331_Sub2) this).anInt9746 = 0;
		((Class331_Sub2) this).anInt9747 = 0;
	}

	void method9264(int i, byte i_13_) {
		((Class331_Sub2) this).aByteArray9748[((Class331_Sub2) this).anInt9746++] = (byte) (127 + ((i_13_ & 0xff) >> 1));
	}
}
