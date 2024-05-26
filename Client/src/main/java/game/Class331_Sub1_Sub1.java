package game;

/* Class331_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub1_Sub1 extends Class331_Sub1 {
	byte[] aByteArray11312;

	void method8872(int i, byte i_0_) {
		int i_1_ = i * 2;
		int i_2_ = i_0_ & 0xff;
		((Class331_Sub1_Sub1) this).aByteArray11312[i_1_++] = (byte) (3 * i_2_ >> 5);
		((Class331_Sub1_Sub1) this).aByteArray11312[i_1_] = (byte) (3 * i_2_ >> 5);
	}

	byte[] method10280(int i, int i_3_, int i_4_) {
		((Class331_Sub1_Sub1) this).aByteArray11312 = new byte[i * i_3_ * i_4_ * 2];
		method4160(i, i_3_, i_4_);
		return ((Class331_Sub1_Sub1) this).aByteArray11312;
	}

	Class331_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method8873(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class331_Sub1_Sub1) this).aByteArray11312[i_6_++] = (byte) (3 * i_7_ >> 5);
		((Class331_Sub1_Sub1) this).aByteArray11312[i_6_] = (byte) (3 * i_7_ >> 5);
	}

	void method8874(int i, byte i_8_) {
		int i_9_ = i * 2;
		int i_10_ = i_8_ & 0xff;
		((Class331_Sub1_Sub1) this).aByteArray11312[i_9_++] = (byte) (3 * i_10_ >> 5);
		((Class331_Sub1_Sub1) this).aByteArray11312[i_9_] = (byte) (3 * i_10_ >> 5);
	}
}
