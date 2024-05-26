package game;

/* Class331_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub1_Sub2 extends Class331_Sub1 {
	byte[] aByteArray11316;

	byte[] method10282(int i, int i_0_, int i_1_) {
		((Class331_Sub1_Sub2) this).aByteArray11316 = new byte[i * i_0_ * i_1_ * 2];
		method4160(i, i_0_, i_1_);
		return ((Class331_Sub1_Sub2) this).aByteArray11316;
	}

	void method8872(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_3_++] = (byte) -1;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	Class331_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method8873(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_6_++] = (byte) -1;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_6_] = (byte) (3 * i_7_ >> 5);
	}

	void method8874(int i, byte i_8_) {
		int i_9_ = i * 2;
		int i_10_ = i_8_ & 0xff;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_9_++] = (byte) -1;
		((Class331_Sub1_Sub2) this).aByteArray11316[i_9_] = (byte) (3 * i_10_ >> 5);
	}
}
