package game;

/* Class650 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class650 {
	static final int anInt8369 = 1020;
	int anInt8370;
	static final int anInt8371 = 256;
	int anInt8372;
	int[] anIntArray8373;
	int[] anIntArray8374 = new int[256];
	static final int anInt8375 = 8;
	int anInt8376;
	int anInt8377;

	public final int method7679(byte i) {
		if (RS3Applet.USING_ISAAC)
			return 0;
		if (974441089 * ((Class650) this).anInt8372 == 0) {
			method7680(-2093482566);
			((Class650) this).anInt8372 = 2037743872;
		}
		return (((Class650) this).anIntArray8373[(((Class650) this).anInt8372 -= -2072414847) * 974441089]);
	}

	final void method7680(int i) {
		((Class650) this).anInt8370 += (((Class650) this).anInt8376 += -1135222137) * -990436591;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			int i_1_ = ((Class650) this).anIntArray8374[i_0_];
			if (0 == (i_0_ & 0x2)) {
				if (0 == (i_0_ & 0x1))
					((Class650) this).anInt8377 = ((((Class650) this).anInt8377 * 209915585 ^ ((Class650) this).anInt8377 * 209915585 << 13) * 617251137);
				else
					((Class650) this).anInt8377 = ((209915585 * ((Class650) this).anInt8377 ^ ((Class650) this).anInt8377 * 209915585 >>> 6) * 617251137);
			} else if ((i_0_ & 0x1) == 0)
				((Class650) this).anInt8377 = ((((Class650) this).anInt8377 * 209915585 ^ 209915585 * ((Class650) this).anInt8377 << 2) * 617251137);
			else
				((Class650) this).anInt8377 = ((((Class650) this).anInt8377 * 209915585 ^ ((Class650) this).anInt8377 * 209915585 >>> 16) * 617251137);
			((Class650) this).anInt8377 += (617251137 * ((Class650) this).anIntArray8374[128 + i_0_ & 0xff]);
			int i_2_;
			((Class650) this).anIntArray8374[i_0_] = i_2_ = (209915585 * ((Class650) this).anInt8377 + ((Class650) this).anIntArray8374[(i_1_ & 0x3fc) >> 2] + ((Class650) this).anInt8370 * -605621817);
			((Class650) this).anIntArray8373[i_0_] = (((Class650) this).anInt8370 = ((((Class650) this).anIntArray8374[(i_2_ >> 8 & 0x3fc) >> 2]) + i_1_) * 736985079) * -605621817;
		}
	}

	public Class650(int[] is) {
		((Class650) this).anIntArray8373 = new int[256];
		for (int i = 0; i < is.length; i++)
			((Class650) this).anIntArray8373[i] = is[i];
		method7682(1194045177);
	}

	final void method7682(int i) {
		int i_13_ = -1640531527;
		int i_14_ = -1640531527;
		int i_15_ = -1640531527;
		int i_16_ = -1640531527;
		int i_17_ = -1640531527;
		int i_18_ = -1640531527;
		int i_19_ = -1640531527;
		int i_20_ = -1640531527;
		for (int i_21_ = 0; i_21_ < 4; i_21_++) {
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
		}
		for (int i_22_ = 0; i_22_ < 256; i_22_ += 8) {
			i_20_ += ((Class650) this).anIntArray8373[i_22_];
			i_19_ += ((Class650) this).anIntArray8373[1 + i_22_];
			i_18_ += ((Class650) this).anIntArray8373[i_22_ + 2];
			i_17_ += ((Class650) this).anIntArray8373[i_22_ + 3];
			i_16_ += ((Class650) this).anIntArray8373[4 + i_22_];
			i_15_ += ((Class650) this).anIntArray8373[i_22_ + 5];
			i_14_ += ((Class650) this).anIntArray8373[i_22_ + 6];
			i_13_ += ((Class650) this).anIntArray8373[7 + i_22_];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
			((Class650) this).anIntArray8374[i_22_] = i_20_;
			((Class650) this).anIntArray8374[1 + i_22_] = i_19_;
			((Class650) this).anIntArray8374[i_22_ + 2] = i_18_;
			((Class650) this).anIntArray8374[3 + i_22_] = i_17_;
			((Class650) this).anIntArray8374[i_22_ + 4] = i_16_;
			((Class650) this).anIntArray8374[5 + i_22_] = i_15_;
			((Class650) this).anIntArray8374[i_22_ + 6] = i_14_;
			((Class650) this).anIntArray8374[i_22_ + 7] = i_13_;
		}
		for (int i_23_ = 0; i_23_ < 256; i_23_ += 8) {
			i_20_ += ((Class650) this).anIntArray8374[i_23_];
			i_19_ += ((Class650) this).anIntArray8374[1 + i_23_];
			i_18_ += ((Class650) this).anIntArray8374[i_23_ + 2];
			i_17_ += ((Class650) this).anIntArray8374[i_23_ + 3];
			i_16_ += ((Class650) this).anIntArray8374[4 + i_23_];
			i_15_ += ((Class650) this).anIntArray8374[5 + i_23_];
			i_14_ += ((Class650) this).anIntArray8374[i_23_ + 6];
			i_13_ += ((Class650) this).anIntArray8374[7 + i_23_];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
			((Class650) this).anIntArray8374[i_23_] = i_20_;
			((Class650) this).anIntArray8374[1 + i_23_] = i_19_;
			((Class650) this).anIntArray8374[i_23_ + 2] = i_18_;
			((Class650) this).anIntArray8374[3 + i_23_] = i_17_;
			((Class650) this).anIntArray8374[i_23_ + 4] = i_16_;
			((Class650) this).anIntArray8374[5 + i_23_] = i_15_;
			((Class650) this).anIntArray8374[i_23_ + 6] = i_14_;
			((Class650) this).anIntArray8374[7 + i_23_] = i_13_;
		}
		method7680(-1993128875);
		((Class650) this).anInt8372 = 2037743872;
	}

	public final int method7692(int i) {
		if (RS3Applet.USING_ISAAC)
			return 0;
		if (0 == ((Class650) this).anInt8372 * 974441089) {
			method7680(-1674281545);
			((Class650) this).anInt8372 = 2037743872;
		}
		return (((Class650) this).anIntArray8373[974441089 * ((Class650) this).anInt8372 - 1]);
	}
}
