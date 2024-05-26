package game;

/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class387 {
	int[] anIntArray4645;
	byte[] aByteArray4646;
	int[] anIntArray4647;

	int method4687(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_, byte i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_6_ = is[i] & 0xff;
			int i_7_ = ((Class387) this).anIntArray4647[i_6_];
			int i_8_ = ((Class387) this).aByteArray4646[i_6_];
			if (0 == i_8_)
				throw new RuntimeException(new StringBuilder().append("").append(i_6_).toString());
			int i_9_ = i_5_ >> 3;
			int i_10_ = i_5_ & 0x7;
			i_4_ &= -i_10_ >> 31;
			int i_11_ = i_9_ + (i_8_ + i_10_ - 1 >> 3);
			i_10_ += 24;
			is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
				i_9_++;
				i_10_ -= 8;
				is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
				if (i_9_ < i_11_) {
					i_9_++;
					i_10_ -= 8;
					is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_9_++;
						i_10_ -= 8;
						is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_9_++;
							i_10_ -= 8;
							is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
						}
					}
				}
			}
			i_5_ += i_8_;
		}
		return (7 + i_5_ >> 3) - i_2_;
	}

	public Class387(byte[] is) {
		int i = is.length;
		((Class387) this).anIntArray4647 = new int[i];
		((Class387) this).aByteArray4646 = is;
		int[] is_12_ = new int[33];
		((Class387) this).anIntArray4645 = new int[8];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			int i_15_ = is[i_14_];
			if (0 != i_15_) {
				int i_16_ = 1 << 32 - i_15_;
				int i_17_ = is_12_[i_15_];
				((Class387) this).anIntArray4647[i_14_] = i_17_;
				int i_18_;
				if ((i_17_ & i_16_) != 0)
					i_18_ = is_12_[i_15_ - 1];
				else {
					i_18_ = i_17_ | i_16_;
					for (int i_19_ = i_15_ - 1; i_19_ >= 1; i_19_--) {
						int i_20_ = is_12_[i_19_];
						if (i_17_ != i_20_)
							break;
						int i_21_ = 1 << 32 - i_19_;
						if (0 != (i_20_ & i_21_)) {
							is_12_[i_19_] = is_12_[i_19_ - 1];
							break;
						}
						is_12_[i_19_] = i_20_ | i_21_;
					}
				}
				is_12_[i_15_] = i_18_;
				for (int i_22_ = 1 + i_15_; i_22_ <= 32; i_22_++) {
					if (is_12_[i_22_] == i_17_)
						is_12_[i_22_] = i_18_;
				}
				int i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_15_; i_24_++) {
					int i_25_ = -2147483648 >>> i_24_;
					if ((i_17_ & i_25_) != 0) {
						if (((Class387) this).anIntArray4645[i_23_] == 0)
							((Class387) this).anIntArray4645[i_23_] = i_13_;
						i_23_ = ((Class387) this).anIntArray4645[i_23_];
					} else
						i_23_++;
					if (i_23_ >= ((Class387) this).anIntArray4645.length) {
						int[] is_26_ = (new int[((Class387) this).anIntArray4645.length * 2]);
						for (int i_27_ = 0; i_27_ < ((Class387) this).anIntArray4645.length; i_27_++)
							is_26_[i_27_] = ((Class387) this).anIntArray4645[i_27_];
						((Class387) this).anIntArray4645 = is_26_;
					}
					i_25_ >>>= 1;
				}
				((Class387) this).anIntArray4645[i_23_] = i_14_ ^ 0xffffffff;
				if (i_23_ >= i_13_)
					i_13_ = i_23_ + 1;
			}
		}
	}

	int method4688(byte[] is, int i, byte[] is_28_, int i_29_, int i_30_, int i_31_) {
		if (i_30_ == 0)
			return 0;
		int i_32_ = 0;
		i_30_ += i_29_;
		int i_33_ = i;
		for (;;) {
			byte i_34_ = is[i_33_];
			if (i_34_ < 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			int i_35_;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x40) != 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x20) != 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x10) != 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x8) != 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x4) != 0)
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x2))
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x1))
				i_32_ = ((Class387) this).anIntArray4645[i_32_];
			else
				i_32_++;
			if ((i_35_ = ((Class387) this).anIntArray4645[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			i_33_++;
		}
		return i_33_ + 1 - i;
	}

	static Class417[] method4689(int i) {
		return (new Class417[] { Class417.aClass417_4942, Class417.aClass417_4941, Class417.aClass417_4940 });
	}
}
