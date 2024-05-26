package game;

/* Class572_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub1_Sub1 extends Class572_Sub1 {
	int anInt11483;
	static final int anInt11484 = 4;
	static final int anInt11485 = 4;
	short[] aShortArray11486;
	static final boolean aBool11487 = true;
	short[] aShortArray11488;
	static final int anInt11489 = 0;
	byte[] aByteArray11490 = new byte[512];
	int anInt11491 = 0;
	int anInt11492 = 616106692;
	int anInt11493 = -1955315092;
	static final int anInt11494 = 1638;
	int anInt11495;
	boolean aBool11496;
	static final int anInt11497 = 8;

	void method10461(byte i) {
		if (((Class572_Sub1_Sub1) this).anInt11495 * -640976227 > 0) {
			((Class572_Sub1_Sub1) this).aShortArray11488 = (new short[((Class572_Sub1_Sub1) this).anInt11483 * -1919637317]);
			((Class572_Sub1_Sub1) this).aShortArray11486 = (new short[-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483]);
			for (int i_0_ = 0; i_0_ < ((Class572_Sub1_Sub1) this).anInt11483 * -1919637317; i_0_++) {
				((Class572_Sub1_Sub1) this).aShortArray11488[i_0_] = (short) (int) ((Math.pow((double) ((float) (-640976227 * ((Class572_Sub1_Sub1) this).anInt11495) / 4096.0F), (double) i_0_)) * 4096.0);
				((Class572_Sub1_Sub1) this).aShortArray11486[i_0_] = (short) (int) Math.pow(2.0, (double) i_0_);
			}
		} else if (null != ((Class572_Sub1_Sub1) this).aShortArray11488 && (-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483 == (((Class572_Sub1_Sub1) this).aShortArray11488).length)) {
			((Class572_Sub1_Sub1) this).aShortArray11486 = (new short[-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483]);
			for (int i_1_ = 0; i_1_ < -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483; i_1_++)
				((Class572_Sub1_Sub1) this).aShortArray11486[i_1_] = (short) (int) Math.pow(2.0, (double) i_1_);
		}
	}

	int method10462(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = i >> 12;
		int i_9_ = 1 + i_8_;
		if (i_9_ >= i_6_)
			i_9_ = 0;
		i &= 0xfff;
		i_8_ &= 0xff;
		i_9_ &= 0xff;
		int i_10_ = i - 4096;
		int i_11_ = i_2_ - 4096;
		int i_12_ = Class331.anIntArray4252[i];
		int i_13_ = ((Class572_Sub1_Sub1) this).aByteArray11490[i_3_ + i_8_] & 0x3;
		int i_14_;
		if (i_13_ <= 1)
			i_14_ = 0 == i_13_ ? i_2_ + i : i_2_ - i;
		else
			i_14_ = i_13_ == 2 ? i - i_2_ : -i - i_2_;
		i_13_ = ((Class572_Sub1_Sub1) this).aByteArray11490[i_9_ + i_3_] & 0x3;
		int i_15_;
		if (i_13_ <= 1)
			i_15_ = 0 == i_13_ ? i_2_ + i_10_ : i_2_ - i_10_;
		else
			i_15_ = i_13_ == 2 ? i_10_ - i_2_ : -i_10_ - i_2_;
		int i_16_ = i_14_ + (i_12_ * (i_15_ - i_14_) >> 12);
		i_13_ = ((Class572_Sub1_Sub1) this).aByteArray11490[i_4_ + i_8_] & 0x3;
		if (i_13_ <= 1)
			i_14_ = 0 == i_13_ ? i_11_ + i : i_11_ - i;
		else
			i_14_ = 2 == i_13_ ? i - i_11_ : -i - i_11_;
		i_13_ = ((Class572_Sub1_Sub1) this).aByteArray11490[i_9_ + i_4_] & 0x3;
		if (i_13_ <= 1)
			i_15_ = 0 == i_13_ ? i_11_ + i_10_ : i_11_ - i_10_;
		else
			i_15_ = i_13_ == 2 ? i_10_ - i_11_ : -i_10_ - i_11_;
		int i_17_ = ((i_15_ - i_14_) * i_12_ >> 12) + i_14_;
		return i_16_ + (i_5_ * (i_17_ - i_16_) >> 12);
	}

	void method10463(int i) {
		((Class572_Sub1_Sub1) this).aByteArray11490 = Class275.method3697((148906313 * ((Class572_Sub1_Sub1) this).anInt11491), 509534441);
		method10461((byte) 16);
		for (int i_18_ = -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483 - 1; i_18_ >= 1; i_18_--) {
			short i_19_ = ((Class572_Sub1_Sub1) this).aShortArray11488[i_18_];
			if (i_19_ > 8 || i_19_ < -8)
				break;
			((Class572_Sub1_Sub1) this).anInt11483 -= -1443931021;
		}
	}

	Class572_Sub1_Sub1() {
		super(0, true);
		((Class572_Sub1_Sub1) this).anInt11483 = -1480756788;
		((Class572_Sub1_Sub1) this).anInt11495 = -1161705442;
		((Class572_Sub1_Sub1) this).aBool11496 = true;
	}

	void method10464() {
		((Class572_Sub1_Sub1) this).aByteArray11490 = Class275.method3697((148906313 * ((Class572_Sub1_Sub1) this).anInt11491), 2017447327);
		method10461((byte) 16);
		for (int i = -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483 - 1; i >= 1; i--) {
			short i_20_ = ((Class572_Sub1_Sub1) this).aShortArray11488[i];
			if (i_20_ > 8 || i_20_ < -8)
				break;
			((Class572_Sub1_Sub1) this).anInt11483 -= -1443931021;
		}
	}

	void method10465() {
		((Class572_Sub1_Sub1) this).aByteArray11490 = Class275.method3697((148906313 * ((Class572_Sub1_Sub1) this).anInt11491), 1171104566);
		method10461((byte) 16);
		for (int i = -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483 - 1; i >= 1; i--) {
			short i_21_ = ((Class572_Sub1_Sub1) this).aShortArray11488[i];
			if (i_21_ > 8 || i_21_ < -8)
				break;
			((Class572_Sub1_Sub1) this).anInt11483 -= -1443931021;
		}
	}

	void method10466(int i, int[] is, int i_22_) {
		int i_23_ = (Class275.anIntArray2916[i] * (1214535059 * ((Class572_Sub1_Sub1) this).anInt11493));
		if (1 == ((Class572_Sub1_Sub1) this).anInt11483 * -1919637317) {
			int i_24_ = ((Class572_Sub1_Sub1) this).aShortArray11488[0];
			int i_25_ = ((Class572_Sub1_Sub1) this).aShortArray11486[0] << 12;
			int i_26_ = (((Class572_Sub1_Sub1) this).anInt11493 * 1214535059 * i_25_ >> 12);
			int i_27_ = (i_25_ * (((Class572_Sub1_Sub1) this).anInt11492 * -12007855) >> 12);
			int i_28_ = i_23_ * i_25_ >> 12;
			int i_29_ = i_28_ >> 12;
			int i_30_ = i_29_ + 1;
			if (i_30_ >= i_26_)
				i_30_ = 0;
			i_28_ &= 0xfff;
			int i_31_ = Class331.anIntArray4252[i_28_];
			int i_32_ = (((Class572_Sub1_Sub1) this).aByteArray11490[i_29_ & 0xff] & 0xff);
			int i_33_ = (((Class572_Sub1_Sub1) this).aByteArray11490[i_30_ & 0xff] & 0xff);
			if (((Class572_Sub1_Sub1) this).aBool11496) {
				for (int i_34_ = 0; i_34_ < Class275.anInt2913 * 37782955; i_34_++) {
					int i_35_ = (((Class572_Sub1_Sub1) this).anInt11492 * -12007855 * Class275.anIntArray2915[i_34_]);
					int i_36_ = method10462(i_25_ * i_35_ >> 12, i_28_, i_32_, i_33_, i_31_, i_27_, -825377086);
					i_36_ = i_36_ * i_24_ >> 12;
					is[i_34_] = (i_36_ >> 1) + 2048;
				}
			} else {
				for (int i_37_ = 0; i_37_ < Class275.anInt2913 * 37782955; i_37_++) {
					int i_38_ = (-12007855 * ((Class572_Sub1_Sub1) this).anInt11492 * Class275.anIntArray2915[i_37_]);
					int i_39_ = method10462(i_25_ * i_38_ >> 12, i_28_, i_32_, i_33_, i_31_, i_27_, -2103176132);
					is[i_37_] = i_24_ * i_39_ >> 12;
				}
			}
		} else {
			int i_40_ = ((Class572_Sub1_Sub1) this).aShortArray11488[0];
			if (i_40_ > 8 || i_40_ < -8) {
				int i_41_ = ((Class572_Sub1_Sub1) this).aShortArray11486[0] << 12;
				int i_42_ = ((((Class572_Sub1_Sub1) this).anInt11493 * 1214535059 * i_41_) >> 12);
				int i_43_ = (i_41_ * (((Class572_Sub1_Sub1) this).anInt11492 * -12007855) >> 12);
				int i_44_ = i_23_ * i_41_ >> 12;
				int i_45_ = i_44_ >> 12;
				int i_46_ = i_45_ + 1;
				if (i_46_ >= i_42_)
					i_46_ = 0;
				i_44_ &= 0xfff;
				int i_47_ = Class331.anIntArray4252[i_44_];
				int i_48_ = ((((Class572_Sub1_Sub1) this).aByteArray11490[i_45_ & 0xff]) & 0xff);
				int i_49_ = ((((Class572_Sub1_Sub1) this).aByteArray11490[i_46_ & 0xff]) & 0xff);
				for (int i_50_ = 0; i_50_ < 37782955 * Class275.anInt2913; i_50_++) {
					int i_51_ = (Class275.anIntArray2915[i_50_] * (((Class572_Sub1_Sub1) this).anInt11492 * -12007855));
					int i_52_ = method10462(i_51_ * i_41_ >> 12, i_44_, i_48_, i_49_, i_47_, i_43_, -617254246);
					is[i_50_] = i_52_ * i_40_ >> 12;
				}
			}
			for (int i_53_ = 1; i_53_ < -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483; i_53_++) {
				i_40_ = ((Class572_Sub1_Sub1) this).aShortArray11488[i_53_];
				if (i_40_ > 8 || i_40_ < -8) {
					int i_54_ = (((Class572_Sub1_Sub1) this).aShortArray11486[i_53_] << 12);
					int i_55_ = i_54_ * (((Class572_Sub1_Sub1) this).anInt11493 * 1214535059) >> 12;
					int i_56_ = ((-12007855 * ((Class572_Sub1_Sub1) this).anInt11492 * i_54_) >> 12);
					int i_57_ = i_23_ * i_54_ >> 12;
					int i_58_ = i_57_ >> 12;
					int i_59_ = i_58_ + 1;
					if (i_59_ >= i_55_)
						i_59_ = 0;
					i_57_ &= 0xfff;
					int i_60_ = Class331.anIntArray4252[i_57_];
					int i_61_ = ((((Class572_Sub1_Sub1) this).aByteArray11490[i_58_ & 0xff]) & 0xff);
					int i_62_ = ((((Class572_Sub1_Sub1) this).aByteArray11490[i_59_ & 0xff]) & 0xff);
					if (((Class572_Sub1_Sub1) this).aBool11496 && i_53_ == -1919637317 * (((Class572_Sub1_Sub1) this).anInt11483) - 1) {
						for (int i_63_ = 0; i_63_ < 37782955 * Class275.anInt2913; i_63_++) {
							int i_64_ = (((Class572_Sub1_Sub1) this).anInt11492 * -12007855 * Class275.anIntArray2915[i_63_]);
							int i_65_ = method10462(i_54_ * i_64_ >> 12, i_57_, i_61_, i_62_, i_60_, i_56_, -1296540892);
							i_65_ = is[i_63_] + (i_65_ * i_40_ >> 12);
							is[i_63_] = (i_65_ >> 1) + 2048;
						}
					} else {
						for (int i_66_ = 0; i_66_ < 37782955 * Class275.anInt2913; i_66_++) {
							int i_67_ = (Class275.anIntArray2915[i_66_] * (((Class572_Sub1_Sub1) this).anInt11492 * -12007855));
							int i_68_ = method10462(i_67_ * i_54_ >> 12, i_57_, i_61_, i_62_, i_60_, i_56_, -772492866);
							is[i_66_] += i_68_ * i_40_ >> 12;
						}
					}
				}
			}
		}
	}

	void method10467() {
		if (((Class572_Sub1_Sub1) this).anInt11495 * -640976227 > 0) {
			((Class572_Sub1_Sub1) this).aShortArray11488 = (new short[((Class572_Sub1_Sub1) this).anInt11483 * -1919637317]);
			((Class572_Sub1_Sub1) this).aShortArray11486 = (new short[-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483]);
			for (int i = 0; i < ((Class572_Sub1_Sub1) this).anInt11483 * -1919637317; i++) {
				((Class572_Sub1_Sub1) this).aShortArray11488[i] = (short) (int) ((Math.pow((double) ((float) (-640976227 * ((Class572_Sub1_Sub1) this).anInt11495) / 4096.0F), (double) i)) * 4096.0);
				((Class572_Sub1_Sub1) this).aShortArray11486[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (null != ((Class572_Sub1_Sub1) this).aShortArray11488 && (-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483 == (((Class572_Sub1_Sub1) this).aShortArray11488).length)) {
			((Class572_Sub1_Sub1) this).aShortArray11486 = (new short[-1919637317 * ((Class572_Sub1_Sub1) this).anInt11483]);
			for (int i = 0; i < -1919637317 * ((Class572_Sub1_Sub1) this).anInt11483; i++)
				((Class572_Sub1_Sub1) this).aShortArray11486[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	static final void method10468(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.anInt105 * 655322057;
	}
}
