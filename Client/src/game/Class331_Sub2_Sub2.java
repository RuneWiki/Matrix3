package game;

/* Class331_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331_Sub2_Sub2 extends Class331_Sub2 {
	byte[] aByteArray11153;

	byte[] method10150(int i, int i_0_, int i_1_) {
		((Class331_Sub2_Sub2) this).aByteArray11153 = new byte[i * i_0_ * i_1_ * 2];
		method4160(i, i_0_, i_1_);
		return ((Class331_Sub2_Sub2) this).aByteArray11153;
	}

	void method9262(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		((Class331_Sub2_Sub2) this).aByteArray11153[i_3_++] = i_2_;
		((Class331_Sub2_Sub2) this).aByteArray11153[i_3_] = i_2_;
	}

	byte[] method10151(int i, int i_4_, int i_5_) {
		((Class331_Sub2_Sub2) this).aByteArray11153 = new byte[i * i_4_ * i_5_ * 2];
		method4160(i, i_4_, i_5_);
		return ((Class331_Sub2_Sub2) this).aByteArray11153;
	}

	void method9261(int i, byte i_6_) {
		int i_7_ = i * 2;
		i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
		((Class331_Sub2_Sub2) this).aByteArray11153[i_7_++] = i_6_;
		((Class331_Sub2_Sub2) this).aByteArray11153[i_7_] = i_6_;
	}

	void method9263(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		((Class331_Sub2_Sub2) this).aByteArray11153[i_9_++] = i_8_;
		((Class331_Sub2_Sub2) this).aByteArray11153[i_9_] = i_8_;
	}

	void method9264(int i, byte i_10_) {
		int i_11_ = i * 2;
		i_10_ = (byte) (127 + ((i_10_ & 0xff) >> 1));
		((Class331_Sub2_Sub2) this).aByteArray11153[i_11_++] = i_10_;
		((Class331_Sub2_Sub2) this).aByteArray11153[i_11_] = i_10_;
	}

	void method9260(int i, byte i_12_) {
		int i_13_ = i * 2;
		i_12_ = (byte) (127 + ((i_12_ & 0xff) >> 1));
		((Class331_Sub2_Sub2) this).aByteArray11153[i_13_++] = i_12_;
		((Class331_Sub2_Sub2) this).aByteArray11153[i_13_] = i_12_;
	}

	Class331_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
