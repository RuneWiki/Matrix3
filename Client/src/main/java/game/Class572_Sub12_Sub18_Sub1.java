package game;

/* Class572_Sub12_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub18_Sub1 extends Class572_Sub12_Sub18 {
	int anInt11730;
	int anInt11731;
	static final int anInt11732 = 16;
	int anInt11733;
	byte[] aByteArray11734;
	int anInt11735;

	void method10622(int i, int i_0_, int i_1_, int i_2_) {
		((Class572_Sub12_Sub18_Sub1) this).anInt11733 = i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11735 = i_0_;
		((Class572_Sub12_Sub18_Sub1) this).anInt11731 = i_1_ - i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11730 = i_2_ - i_0_;
	}

	void method10623(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = 0;
		if (i_3_ != i)
			i_8_ = (i_6_ - i_5_ << 16) / (i_3_ - i);
		int i_9_ = 0;
		if (i_4_ != i_3_)
			i_9_ = (i_7_ - i_6_ << 16) / (i_4_ - i_3_);
		int i_10_ = 0;
		if (i_4_ != i)
			i_10_ = (i_5_ - i_7_ << 16) / (i - i_4_);
		if (i <= i_3_ && i <= i_4_) {
			if (i_3_ < i_4_) {
				i_7_ = i_5_ <<= 16;
				if (i < 0) {
					i_7_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_6_ <<= 16;
				if (i_3_ < 0) {
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				if (i != i_3_ && i_10_ < i_8_ || i == i_3_ && i_10_ > i_9_) {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_3_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_3_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			} else {
				i_6_ = i_5_ <<= 16;
				if (i < 0) {
					i_6_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_9_ * i_4_;
					i_4_ = 0;
				}
				if (i != i_4_ && i_10_ < i_8_ || i == i_4_ && i_9_ > i_8_) {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_6_ >> 16, i_5_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_3_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_5_ >> 16, i_6_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_3_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			}
		} else if (i_3_ <= i_4_) {
			if (i_4_ < i) {
				i_5_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_5_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_10_ * i_4_;
					i_4_ = 0;
				}
				if (i_3_ != i_4_ && i_8_ < i_9_ || i_3_ == i_4_ && i_8_ > i_10_) {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_5_ >> 16, i_7_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_7_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			} else {
				i_7_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_7_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_5_ <<= 16;
				if (i < 0) {
					i_5_ -= i_10_ * i;
					i = 0;
				}
				if (i_8_ < i_9_) {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_4_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			}
		} else if (i < i_3_) {
			i_6_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_6_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_5_ <<= 16;
			if (i < 0) {
				i_5_ -= i_8_ * i;
				i = 0;
			}
			if (i_9_ < i_10_) {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i_3_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_6_ >> 16, i_5_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			} else {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i_3_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_5_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			}
		} else {
			i_5_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_5_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_6_ <<= 16;
			if (i_3_ < 0) {
				i_6_ -= i_8_ * i_3_;
				i_3_ = 0;
			}
			if (i_9_ < i_10_) {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i_3_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_5_ >> 16, i_7_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			} else {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i_3_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_7_ >> 16, i_5_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			}
		}
	}

	void method10624(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		int i_16_ = 0;
		if (i_11_ != i)
			i_16_ = (i_14_ - i_13_ << 16) / (i_11_ - i);
		int i_17_ = 0;
		if (i_12_ != i_11_)
			i_17_ = (i_15_ - i_14_ << 16) / (i_12_ - i_11_);
		int i_18_ = 0;
		if (i_12_ != i)
			i_18_ = (i_13_ - i_15_ << 16) / (i - i_12_);
		if (i <= i_11_ && i <= i_12_) {
			if (i_11_ < i_12_) {
				i_15_ = i_13_ <<= 16;
				if (i < 0) {
					i_15_ -= i_18_ * i;
					i_13_ -= i_16_ * i;
					i = 0;
				}
				i_14_ <<= 16;
				if (i_11_ < 0) {
					i_14_ -= i_17_ * i_11_;
					i_11_ = 0;
				}
				if (i != i_11_ && i_18_ < i_16_ || i == i_11_ && i_18_ > i_17_) {
					i_12_ -= i_11_;
					i_11_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_11_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_15_ >> 16, i_13_ >> 16);
						i_15_ += i_18_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_15_ >> 16, i_14_ >> 16);
						i_15_ += i_18_;
						i_14_ += i_17_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_12_ -= i_11_;
					i_11_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_11_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_13_ >> 16, i_15_ >> 16);
						i_15_ += i_18_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_14_ >> 16, i_15_ >> 16);
						i_15_ += i_18_;
						i_14_ += i_17_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			} else {
				i_14_ = i_13_ <<= 16;
				if (i < 0) {
					i_14_ -= i_18_ * i;
					i_13_ -= i_16_ * i;
					i = 0;
				}
				i_15_ <<= 16;
				if (i_12_ < 0) {
					i_15_ -= i_17_ * i_12_;
					i_12_ = 0;
				}
				if (i != i_12_ && i_18_ < i_16_ || i == i_12_ && i_17_ > i_16_) {
					i_11_ -= i_12_;
					i_12_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_14_ >> 16, i_13_ >> 16);
						i_14_ += i_18_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_11_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_15_ >> 16, i_13_ >> 16);
						i_15_ += i_17_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_11_ -= i_12_;
					i_12_ -= i;
					i *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_13_ >> 16, i_14_ >> 16);
						i_14_ += i_18_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_11_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i, 0, i_13_ >> 16, i_15_ >> 16);
						i_15_ += i_17_;
						i_13_ += i_16_;
						i += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			}
		} else if (i_11_ <= i_12_) {
			if (i_12_ < i) {
				i_13_ = i_14_ <<= 16;
				if (i_11_ < 0) {
					i_13_ -= i_16_ * i_11_;
					i_14_ -= i_17_ * i_11_;
					i_11_ = 0;
				}
				i_15_ <<= 16;
				if (i_12_ < 0) {
					i_15_ -= i_18_ * i_12_;
					i_12_ = 0;
				}
				if (i_11_ != i_12_ && i_16_ < i_17_ || i_11_ == i_12_ && i_16_ > i_18_) {
					i -= i_12_;
					i_12_ -= i_11_;
					i_11_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_13_ >> 16, i_14_ >> 16);
						i_13_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_13_ >> 16, i_15_ >> 16);
						i_13_ += i_16_;
						i_15_ += i_18_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i -= i_12_;
					i_12_ -= i_11_;
					i_11_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_14_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_15_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_15_ += i_18_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			} else {
				i_15_ = i_14_ <<= 16;
				if (i_11_ < 0) {
					i_15_ -= i_16_ * i_11_;
					i_14_ -= i_17_ * i_11_;
					i_11_ = 0;
				}
				i_13_ <<= 16;
				if (i < 0) {
					i_13_ -= i_18_ * i;
					i = 0;
				}
				if (i_16_ < i_17_) {
					i_12_ -= i;
					i -= i_11_;
					i_11_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_15_ >> 16, i_14_ >> 16);
						i_15_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_13_ >> 16, i_14_ >> 16);
						i_13_ += i_18_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				} else {
					i_12_ -= i;
					i -= i_11_;
					i_11_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					while (--i >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_14_ >> 16, i_15_ >> 16);
						i_15_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
					while (--i_12_ >= 0) {
						method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_11_, 0, i_14_ >> 16, i_13_ >> 16);
						i_13_ += i_18_;
						i_14_ += i_17_;
						i_11_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
					}
				}
			}
		} else if (i < i_11_) {
			i_14_ = i_15_ <<= 16;
			if (i_12_ < 0) {
				i_14_ -= i_17_ * i_12_;
				i_15_ -= i_18_ * i_12_;
				i_12_ = 0;
			}
			i_13_ <<= 16;
			if (i < 0) {
				i_13_ -= i_16_ * i;
				i = 0;
			}
			if (i_17_ < i_18_) {
				i_11_ -= i;
				i -= i_12_;
				i_12_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_14_ >> 16, i_15_ >> 16);
					i_14_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i_11_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_14_ >> 16, i_13_ >> 16);
					i_14_ += i_17_;
					i_13_ += i_16_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			} else {
				i_11_ -= i;
				i -= i_12_;
				i_12_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_15_ >> 16, i_14_ >> 16);
					i_14_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i_11_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_13_ >> 16, i_14_ >> 16);
					i_14_ += i_17_;
					i_13_ += i_16_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			}
		} else {
			i_13_ = i_15_ <<= 16;
			if (i_12_ < 0) {
				i_13_ -= i_17_ * i_12_;
				i_15_ -= i_18_ * i_12_;
				i_12_ = 0;
			}
			i_14_ <<= 16;
			if (i_11_ < 0) {
				i_14_ -= i_16_ * i_11_;
				i_11_ = 0;
			}
			if (i_17_ < i_18_) {
				i -= i_11_;
				i_11_ -= i_12_;
				i_12_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i_11_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_13_ >> 16, i_15_ >> 16);
					i_13_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_14_ >> 16, i_15_ >> 16);
					i_14_ += i_16_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			} else {
				i -= i_11_;
				i_11_ -= i_12_;
				i_12_ *= ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				while (--i_11_ >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_15_ >> 16, i_13_ >> 16);
					i_13_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
				while (--i >= 0) {
					method10625((((Class572_Sub12_Sub18_Sub1) this).aByteArray11734), i_12_, 0, i_15_ >> 16, i_14_ >> 16);
					i_14_ += i_16_;
					i_15_ += i_18_;
					i_12_ += ((Class572_Sub12_Sub18_Sub1) this).anInt11731;
				}
			}
		}
	}

	static final void method10625(byte[] is, int i, int i_19_, int i_20_, int i_21_) {
		if (i_20_ < i_21_) {
			i += i_20_;
			i_19_ = i_21_ - i_20_ >> 2;
			while (--i_19_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_19_ = i_21_ - i_20_ & 0x3;
			while (--i_19_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method10626(int i, int i_22_, int i_23_, int i_24_) {
		((Class572_Sub12_Sub18_Sub1) this).anInt11733 = i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11735 = i_22_;
		((Class572_Sub12_Sub18_Sub1) this).anInt11731 = i_23_ - i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11730 = i_24_ - i_22_;
	}

	boolean method10627(int i, int i_25_) {
		return (((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length >= i * i_25_);
	}

	void method10628() {
		int i = -1;
		int i_26_ = ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 8;
		while (i < i_26_) {
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
		}
		while (i < ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 1)
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
	}

	void method10629() {
		int i = -1;
		int i_27_ = ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 8;
		while (i < i_27_) {
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
		}
		while (i < ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 1)
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
	}

	void method10630() {
		int i = -1;
		int i_28_ = ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 8;
		while (i < i_28_) {
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
		}
		while (i < ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 1)
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
	}

	void method10631() {
		int i = -1;
		int i_29_ = ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 8;
		while (i < i_29_) {
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
		}
		while (i < ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 1)
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
	}

	void method10632() {
		int i = -1;
		int i_30_ = ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 8;
		while (i < i_30_) {
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
		}
		while (i < ((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length - 1)
			((Class572_Sub12_Sub18_Sub1) this).aByteArray11734[++i] = (byte) 0;
	}

	boolean method10633(int i, int i_31_) {
		return (((Class572_Sub12_Sub18_Sub1) this).aByteArray11734.length >= i * i_31_);
	}

	Class572_Sub12_Sub18_Sub1(Class106_Sub1 class106_sub1, int i, int i_32_) {
		((Class572_Sub12_Sub18_Sub1) this).aByteArray11734 = new byte[i * i_32_];
	}

	void method10634(int i, int i_33_, int i_34_, int i_35_) {
		((Class572_Sub12_Sub18_Sub1) this).anInt11733 = i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11735 = i_33_;
		((Class572_Sub12_Sub18_Sub1) this).anInt11731 = i_34_ - i;
		((Class572_Sub12_Sub18_Sub1) this).anInt11730 = i_35_ - i_33_;
	}
}
