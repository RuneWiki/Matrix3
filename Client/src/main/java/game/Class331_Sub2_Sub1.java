package game;

/* Class331_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub2_Sub1 extends Class331_Sub2 {
	byte[] aByteArray11122;

	void method9260(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		((Class331_Sub2_Sub1) this).aByteArray11122[i_1_++] = i_0_;
		((Class331_Sub2_Sub1) this).aByteArray11122[i_1_] = i_0_;
	}

	byte[] method10130(int i, int i_2_, int i_3_) {
		((Class331_Sub2_Sub1) this).aByteArray11122 = new byte[i * i_2_ * i_3_ * 2];
		method4160(i, i_2_, i_3_);
		return ((Class331_Sub2_Sub1) this).aByteArray11122;
	}

	void method9263(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		((Class331_Sub2_Sub1) this).aByteArray11122[i_5_++] = i_4_;
		((Class331_Sub2_Sub1) this).aByteArray11122[i_5_] = i_4_;
	}

	Class331_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	void method9261(int i, byte i_6_) {
		int i_7_ = i * 2;
		i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
		((Class331_Sub2_Sub1) this).aByteArray11122[i_7_++] = i_6_;
		((Class331_Sub2_Sub1) this).aByteArray11122[i_7_] = i_6_;
	}

	void method9262(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		((Class331_Sub2_Sub1) this).aByteArray11122[i_9_++] = i_8_;
		((Class331_Sub2_Sub1) this).aByteArray11122[i_9_] = i_8_;
	}

	void method9264(int i, byte i_10_) {
		int i_11_ = i * 2;
		i_10_ = (byte) (127 + ((i_10_ & 0xff) >> 1));
		((Class331_Sub2_Sub1) this).aByteArray11122[i_11_++] = i_10_;
		((Class331_Sub2_Sub1) this).aByteArray11122[i_11_] = i_10_;
	}

	byte[] method10131(int i, int i_12_, int i_13_) {
		((Class331_Sub2_Sub1) this).aByteArray11122 = new byte[i * i_12_ * i_13_ * 2];
		method4160(i, i_12_, i_13_);
		return ((Class331_Sub2_Sub1) this).aByteArray11122;
	}
}
