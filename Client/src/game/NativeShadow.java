package game;

/* Class572_Sub12_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NativeShadow extends Class572_Sub12_Sub18 {
	byte[] aByteArray11761;
	int anInt11762;
	static final int anInt11763 = 16;
	int x;
	int y;
	int anInt11766;

	void method10649(int i, int i_0_, int i_1_, int i_2_) {
		((NativeShadow) this).x = i;
		((NativeShadow) this).y = i_0_;
		((NativeShadow) this).anInt11762 = i_1_ - i;
		((NativeShadow) this).anInt11766 = i_2_ - i_0_;
	}

	void method10650(int i, int i_3_, int i_4_, int i_5_) {
		((NativeShadow) this).x = i;
		((NativeShadow) this).y = i_3_;
		((NativeShadow) this).anInt11762 = i_4_ - i;
		((NativeShadow) this).anInt11766 = i_5_ - i_3_;
	}

	boolean method10651(int i, int i_6_) {
		return (((NativeShadow) this).aByteArray11761.length >= i * i_6_);
	}

	void method10652() {
		int i = -1;
		int i_7_ = ((NativeShadow) this).aByteArray11761.length - 8;
		while (i < i_7_) {
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
		}
		while (i < ((NativeShadow) this).aByteArray11761.length - 1)
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
	}

	void method10653(int i, int i_8_, int i_9_, int i_10_) {
		((NativeShadow) this).x = i;
		((NativeShadow) this).y = i_8_;
		((NativeShadow) this).anInt11762 = i_9_ - i;
		((NativeShadow) this).anInt11766 = i_10_ - i_8_;
	}

	void method10654(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
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
					i *= ((NativeShadow) this).anInt11762;
					while (--i_11_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_15_ >> 16, i_13_ >> 16);
						i_15_ += i_18_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_15_ >> 16, i_14_ >> 16);
						i_15_ += i_18_;
						i_14_ += i_17_;
						i += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_12_ -= i_11_;
					i_11_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_11_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_13_ >> 16, i_15_ >> 16);
						i_15_ += i_18_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_14_ >> 16, i_15_ >> 16);
						i_15_ += i_18_;
						i_14_ += i_17_;
						i += ((NativeShadow) this).anInt11762;
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
					i *= ((NativeShadow) this).anInt11762;
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_14_ >> 16, i_13_ >> 16);
						i_14_ += i_18_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_11_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_15_ >> 16, i_13_ >> 16);
						i_15_ += i_17_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_11_ -= i_12_;
					i_12_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_13_ >> 16, i_14_ >> 16);
						i_14_ += i_18_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_11_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_13_ >> 16, i_15_ >> 16);
						i_15_ += i_17_;
						i_13_ += i_16_;
						i += ((NativeShadow) this).anInt11762;
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
					i_11_ *= ((NativeShadow) this).anInt11762;
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_13_ >> 16, i_14_ >> 16);
						i_13_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_13_ >> 16, i_15_ >> 16);
						i_13_ += i_16_;
						i_15_ += i_18_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
				} else {
					i -= i_12_;
					i_12_ -= i_11_;
					i_11_ *= ((NativeShadow) this).anInt11762;
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_14_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_15_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_15_ += i_18_;
						i_11_ += ((NativeShadow) this).anInt11762;
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
					i_11_ *= ((NativeShadow) this).anInt11762;
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_15_ >> 16, i_14_ >> 16);
						i_15_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_13_ >> 16, i_14_ >> 16);
						i_13_ += i_18_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_12_ -= i;
					i -= i_11_;
					i_11_ *= ((NativeShadow) this).anInt11762;
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_14_ >> 16, i_15_ >> 16);
						i_15_ += i_16_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
					}
					while (--i_12_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_11_, 0, i_14_ >> 16, i_13_ >> 16);
						i_13_ += i_18_;
						i_14_ += i_17_;
						i_11_ += ((NativeShadow) this).anInt11762;
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
				i_12_ *= ((NativeShadow) this).anInt11762;
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_14_ >> 16, i_15_ >> 16);
					i_14_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
				while (--i_11_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_14_ >> 16, i_13_ >> 16);
					i_14_ += i_17_;
					i_13_ += i_16_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
			} else {
				i_11_ -= i;
				i -= i_12_;
				i_12_ *= ((NativeShadow) this).anInt11762;
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_15_ >> 16, i_14_ >> 16);
					i_14_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
				while (--i_11_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_13_ >> 16, i_14_ >> 16);
					i_14_ += i_17_;
					i_13_ += i_16_;
					i_12_ += ((NativeShadow) this).anInt11762;
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
				i_12_ *= ((NativeShadow) this).anInt11762;
				while (--i_11_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_13_ >> 16, i_15_ >> 16);
					i_13_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_14_ >> 16, i_15_ >> 16);
					i_14_ += i_16_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
			} else {
				i -= i_11_;
				i_11_ -= i_12_;
				i_12_ *= ((NativeShadow) this).anInt11762;
				while (--i_11_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_15_ >> 16, i_13_ >> 16);
					i_13_ += i_17_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_12_, 0, i_15_ >> 16, i_14_ >> 16);
					i_14_ += i_16_;
					i_15_ += i_18_;
					i_12_ += ((NativeShadow) this).anInt11762;
				}
			}
		}
	}

	void fill(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		int i_24_ = 0;
		if (i_19_ != i)
			i_24_ = (i_22_ - i_21_ << 16) / (i_19_ - i);
		int i_25_ = 0;
		if (i_20_ != i_19_)
			i_25_ = (i_23_ - i_22_ << 16) / (i_20_ - i_19_);
		int i_26_ = 0;
		if (i_20_ != i)
			i_26_ = (i_21_ - i_23_ << 16) / (i - i_20_);
		if (i <= i_19_ && i <= i_20_) {
			if (i_19_ < i_20_) {
				i_23_ = i_21_ <<= 16;
				if (i < 0) {
					i_23_ -= i_26_ * i;
					i_21_ -= i_24_ * i;
					i = 0;
				}
				i_22_ <<= 16;
				if (i_19_ < 0) {
					i_22_ -= i_25_ * i_19_;
					i_19_ = 0;
				}
				if (i != i_19_ && i_26_ < i_24_ || i == i_19_ && i_26_ > i_25_) {
					i_20_ -= i_19_;
					i_19_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_19_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_23_ >> 16, i_21_ >> 16);
						i_23_ += i_26_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_23_ >> 16, i_22_ >> 16);
						i_23_ += i_26_;
						i_22_ += i_25_;
						i += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_20_ -= i_19_;
					i_19_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_19_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_21_ >> 16, i_23_ >> 16);
						i_23_ += i_26_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_22_ >> 16, i_23_ >> 16);
						i_23_ += i_26_;
						i_22_ += i_25_;
						i += ((NativeShadow) this).anInt11762;
					}
				}
			} else {
				i_22_ = i_21_ <<= 16;
				if (i < 0) {
					i_22_ -= i_26_ * i;
					i_21_ -= i_24_ * i;
					i = 0;
				}
				i_23_ <<= 16;
				if (i_20_ < 0) {
					i_23_ -= i_25_ * i_20_;
					i_20_ = 0;
				}
				if (i != i_20_ && i_26_ < i_24_ || i == i_20_ && i_25_ > i_24_) {
					i_19_ -= i_20_;
					i_20_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_22_ >> 16, i_21_ >> 16);
						i_22_ += i_26_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_19_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_23_ >> 16, i_21_ >> 16);
						i_23_ += i_25_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_19_ -= i_20_;
					i_20_ -= i;
					i *= ((NativeShadow) this).anInt11762;
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_21_ >> 16, i_22_ >> 16);
						i_22_ += i_26_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
					while (--i_19_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i, 0, i_21_ >> 16, i_23_ >> 16);
						i_23_ += i_25_;
						i_21_ += i_24_;
						i += ((NativeShadow) this).anInt11762;
					}
				}
			}
		} else if (i_19_ <= i_20_) {
			if (i_20_ < i) {
				i_21_ = i_22_ <<= 16;
				if (i_19_ < 0) {
					i_21_ -= i_24_ * i_19_;
					i_22_ -= i_25_ * i_19_;
					i_19_ = 0;
				}
				i_23_ <<= 16;
				if (i_20_ < 0) {
					i_23_ -= i_26_ * i_20_;
					i_20_ = 0;
				}
				if (i_19_ != i_20_ && i_24_ < i_25_ || i_19_ == i_20_ && i_24_ > i_26_) {
					i -= i_20_;
					i_20_ -= i_19_;
					i_19_ *= ((NativeShadow) this).anInt11762;
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_21_ >> 16, i_22_ >> 16);
						i_21_ += i_24_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_21_ >> 16, i_23_ >> 16);
						i_21_ += i_24_;
						i_23_ += i_26_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
				} else {
					i -= i_20_;
					i_20_ -= i_19_;
					i_19_ *= ((NativeShadow) this).anInt11762;
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_22_ >> 16, i_21_ >> 16);
						i_21_ += i_24_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_23_ >> 16, i_21_ >> 16);
						i_21_ += i_24_;
						i_23_ += i_26_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
				}
			} else {
				i_23_ = i_22_ <<= 16;
				if (i_19_ < 0) {
					i_23_ -= i_24_ * i_19_;
					i_22_ -= i_25_ * i_19_;
					i_19_ = 0;
				}
				i_21_ <<= 16;
				if (i < 0) {
					i_21_ -= i_26_ * i;
					i = 0;
				}
				if (i_24_ < i_25_) {
					i_20_ -= i;
					i -= i_19_;
					i_19_ *= ((NativeShadow) this).anInt11762;
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_23_ >> 16, i_22_ >> 16);
						i_23_ += i_24_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_21_ >> 16, i_22_ >> 16);
						i_21_ += i_26_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
				} else {
					i_20_ -= i;
					i -= i_19_;
					i_19_ *= ((NativeShadow) this).anInt11762;
					while (--i >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_22_ >> 16, i_23_ >> 16);
						i_23_ += i_24_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
					while (--i_20_ >= 0) {
						method10658((((NativeShadow) this).aByteArray11761), i_19_, 0, i_22_ >> 16, i_21_ >> 16);
						i_21_ += i_26_;
						i_22_ += i_25_;
						i_19_ += ((NativeShadow) this).anInt11762;
					}
				}
			}
		} else if (i < i_19_) {
			i_22_ = i_23_ <<= 16;
			if (i_20_ < 0) {
				i_22_ -= i_25_ * i_20_;
				i_23_ -= i_26_ * i_20_;
				i_20_ = 0;
			}
			i_21_ <<= 16;
			if (i < 0) {
				i_21_ -= i_24_ * i;
				i = 0;
			}
			if (i_25_ < i_26_) {
				i_19_ -= i;
				i -= i_20_;
				i_20_ *= ((NativeShadow) this).anInt11762;
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_22_ >> 16, i_23_ >> 16);
					i_22_ += i_25_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
				while (--i_19_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_22_ >> 16, i_21_ >> 16);
					i_22_ += i_25_;
					i_21_ += i_24_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
			} else {
				i_19_ -= i;
				i -= i_20_;
				i_20_ *= ((NativeShadow) this).anInt11762;
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_23_ >> 16, i_22_ >> 16);
					i_22_ += i_25_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
				while (--i_19_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_21_ >> 16, i_22_ >> 16);
					i_22_ += i_25_;
					i_21_ += i_24_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
			}
		} else {
			i_21_ = i_23_ <<= 16;
			if (i_20_ < 0) {
				i_21_ -= i_25_ * i_20_;
				i_23_ -= i_26_ * i_20_;
				i_20_ = 0;
			}
			i_22_ <<= 16;
			if (i_19_ < 0) {
				i_22_ -= i_24_ * i_19_;
				i_19_ = 0;
			}
			if (i_25_ < i_26_) {
				i -= i_19_;
				i_19_ -= i_20_;
				i_20_ *= ((NativeShadow) this).anInt11762;
				while (--i_19_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_21_ >> 16, i_23_ >> 16);
					i_21_ += i_25_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_22_ >> 16, i_23_ >> 16);
					i_22_ += i_24_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
			} else {
				i -= i_19_;
				i_19_ -= i_20_;
				i_20_ *= ((NativeShadow) this).anInt11762;
				while (--i_19_ >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_23_ >> 16, i_21_ >> 16);
					i_21_ += i_25_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
				while (--i >= 0) {
					method10658((((NativeShadow) this).aByteArray11761), i_20_, 0, i_23_ >> 16, i_22_ >> 16);
					i_22_ += i_24_;
					i_23_ += i_26_;
					i_20_ += ((NativeShadow) this).anInt11762;
				}
			}
		}
	}

	void method10656(int i, int i_27_, int i_28_, int i_29_) {
		((NativeShadow) this).x = i;
		((NativeShadow) this).y = i_27_;
		((NativeShadow) this).anInt11762 = i_28_ - i;
		((NativeShadow) this).anInt11766 = i_29_ - i_27_;
	}

	void method10657() {
		int i = -1;
		int i_30_ = ((NativeShadow) this).aByteArray11761.length - 8;
		while (i < i_30_) {
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
		}
		while (i < ((NativeShadow) this).aByteArray11761.length - 1)
			((NativeShadow) this).aByteArray11761[++i] = (byte) 0;
	}

	static final void method10658(byte[] is, int i, int i_31_, int i_32_, int i_33_) {
		if (i_32_ < i_33_) {
			i += i_32_;
			i_31_ = i_33_ - i_32_ >> 2;
			while (--i_31_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_31_ = i_33_ - i_32_ & 0x3;
			while (--i_31_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	NativeShadow(Class106_Sub3 class106_sub3, int i, int i_34_) {
		((NativeShadow) this).aByteArray11761 = new byte[i * i_34_];
	}
}
