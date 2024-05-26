package game;

/* Class674 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class674 {
	static final int anInt8538 = 16;
	static final int anInt8539 = 4096;
	static final int anInt8540 = 23;
	static final int anInt8541 = 0;
	static final int anInt8542 = 1;
	static final int anInt8543 = 6;
	static final int anInt8544 = 50;
	static Class636 aClass636_8545 = new Class636();

	static void method7910(int[] is, int[] is_0_, int[] is_1_, byte[] is_2_, int i, int i_3_, int i_4_) {
		int i_5_ = 0;
		for (int i_6_ = i; i_6_ <= i_3_; i_6_++) {
			for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
				if (is_2_[i_7_] == i_6_) {
					is_1_[i_5_] = i_7_;
					i_5_++;
				}
			}
		}
		for (int i_8_ = 0; i_8_ < 23; i_8_++)
			is_0_[i_8_] = 0;
		for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
			is_0_[is_2_[i_9_] + 1]++;
		for (int i_10_ = 1; i_10_ < 23; i_10_++)
			is_0_[i_10_] += is_0_[i_10_ - 1];
		for (int i_11_ = 0; i_11_ < 23; i_11_++)
			is[i_11_] = 0;
		int i_12_ = 0;
		for (int i_13_ = i; i_13_ <= i_3_; i_13_++) {
			i_12_ += is_0_[i_13_ + 1] - is_0_[i_13_];
			is[i_13_] = i_12_ - 1;
			i_12_ <<= 1;
		}
		for (int i_14_ = i + 1; i_14_ <= i_3_; i_14_++)
			is_0_[i_14_] = (is[i_14_ - 1] + 1 << 1) - is_0_[i_14_];
	}

	static void method7911(Class636 class636) {
		byte i = ((Class636) class636).aByte8241;
		int i_15_ = ((Class636) class636).anInt8242 * 1400551979;
		int i_16_ = ((Class636) class636).anInt8263 * -1219345193;
		int i_17_ = ((Class636) class636).anInt8256 * 211507549;
		int[] is = Class97.anIntArray1255;
		int i_18_ = ((Class636) class636).anInt8247 * 517775571;
		byte[] is_19_ = ((Class636) class636).aByteArray8254;
		int i_20_ = ((Class636) class636).anInt8238 * -509110135;
		int i_21_ = ((Class636) class636).anInt8239 * -1781375213;
		int i_22_ = i_21_;
		int i_23_ = ((Class636) class636).anInt8259 * 1161377083 + 1;
		while_42_: for (;;) {
			if (i_15_ > 0) {
				for (;;) {
					if (i_21_ == 0)
						break while_42_;
					if (i_15_ == 1)
						break;
					is_19_[i_20_] = i;
					i_15_--;
					i_20_++;
					i_21_--;
				}
				if (i_21_ == 0) {
					i_15_ = 1;
					break;
				}
				is_19_[i_20_] = i;
				i_20_++;
				i_21_--;
			}
			for (;;) {
				if (i_16_ == i_23_) {
					i_15_ = 0;
					break while_42_;
				}
				i = (byte) i_17_;
				i_18_ = is[i_18_];
				int i_24_ = (byte) i_18_;
				i_18_ >>= 8;
				i_16_++;
				if (i_24_ != i_17_) {
					i_17_ = i_24_;
					if (i_21_ == 0) {
						i_15_ = 1;
						break while_42_;
					}
					is_19_[i_20_] = i;
					i_20_++;
					i_21_--;
				} else {
					if (i_16_ != i_23_)
						break;
					if (i_21_ == 0) {
						i_15_ = 1;
						break while_42_;
					}
					is_19_[i_20_] = i;
					i_20_++;
					i_21_--;
				}
			}
			i_15_ = 2;
			i_18_ = is[i_18_];
			int i_25_ = (byte) i_18_;
			i_18_ >>= 8;
			if (++i_16_ != i_23_) {
				if (i_25_ != i_17_)
					i_17_ = i_25_;
				else {
					i_15_ = 3;
					i_18_ = is[i_18_];
					i_25_ = (byte) i_18_;
					i_18_ >>= 8;
					if (++i_16_ != i_23_) {
						if (i_25_ != i_17_)
							i_17_ = i_25_;
						else {
							i_18_ = is[i_18_];
							i_25_ = (byte) i_18_;
							i_18_ >>= 8;
							i_16_++;
							i_15_ = (i_25_ & 0xff) + 4;
							i_18_ = is[i_18_];
							i_17_ = (byte) i_18_;
							i_18_ >>= 8;
							i_16_++;
						}
					}
				}
			}
		}
		int i_26_ = ((Class636) class636).anInt8258 * 192063815;
		((Class636) class636).anInt8258 += (i_22_ - i_21_) * 2103062647;
		if (((Class636) class636).anInt8258 * 192063815 >= i_26_) {
			/* empty */
		}
		((Class636) class636).aByte8241 = i;
		((Class636) class636).anInt8242 = i_15_ * 673592451;
		((Class636) class636).anInt8263 = i_16_ * -1864569113;
		((Class636) class636).anInt8256 = i_17_ * -1017658635;
		Class97.anIntArray1255 = is;
		((Class636) class636).anInt8247 = i_18_ * 729069403;
		((Class636) class636).aByteArray8254 = is_19_;
		((Class636) class636).anInt8238 = i_20_ * 1064394169;
		((Class636) class636).anInt8239 = i_21_ * 337265435;
	}

	static void method7912(Class636 class636) {
		boolean bool = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		boolean bool_31_ = false;
		boolean bool_32_ = false;
		boolean bool_33_ = false;
		boolean bool_34_ = false;
		boolean bool_35_ = false;
		boolean bool_36_ = false;
		boolean bool_37_ = false;
		boolean bool_38_ = false;
		boolean bool_39_ = false;
		boolean bool_40_ = false;
		boolean bool_41_ = false;
		boolean bool_42_ = false;
		boolean bool_43_ = false;
		int i = 0;
		int[] is = null;
		int[] is_44_ = null;
		int[] is_45_ = null;
		((Class636) class636).anInt8245 = 407651227;
		if (Class97.anIntArray1255 == null)
			Class97.anIntArray1255 = new int[((Class636) class636).anInt8245 * 499027424];
		boolean bool_46_ = true;
		while (bool_46_) {
			byte i_47_ = method7916(class636);
			if (i_47_ == 23)
				break;
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7916(class636);
			i_47_ = method7913(class636);
			if (i_47_ == 0) {
				/* empty */
			}
			((Class636) class636).anInt8246 = 0;
			int i_48_ = method7916(class636);
			((Class636) class636).anInt8246 = (((Class636) class636).anInt8246 * 194736243 << 8 | i_48_ & 0xff) * -150162245;
			i_48_ = method7916(class636);
			((Class636) class636).anInt8246 = (((Class636) class636).anInt8246 * 194736243 << 8 | i_48_ & 0xff) * -150162245;
			i_48_ = method7916(class636);
			((Class636) class636).anInt8246 = (((Class636) class636).anInt8246 * 194736243 << 8 | i_48_ & 0xff) * -150162245;
			for (int i_49_ = 0; i_49_ < 16; i_49_++) {
				i_47_ = method7913(class636);
				if (i_47_ == 1)
					((Class636) class636).aBoolArray8240[i_49_] = true;
				else
					((Class636) class636).aBoolArray8240[i_49_] = false;
			}
			for (int i_50_ = 0; i_50_ < 256; i_50_++)
				((Class636) class636).aBoolArray8253[i_50_] = false;
			for (int i_51_ = 0; i_51_ < 16; i_51_++) {
				if (((Class636) class636).aBoolArray8240[i_51_]) {
					for (int i_52_ = 0; i_52_ < 16; i_52_++) {
						i_47_ = method7913(class636);
						if (i_47_ == 1)
							((Class636) class636).aBoolArray8253[(i_51_ * 16 + i_52_)] = true;
					}
				}
			}
			method7915(class636);
			int i_53_ = ((Class636) class636).anInt8252 * -1363858345 + 2;
			int i_54_ = method7914(3, class636);
			int i_55_ = method7914(15, class636);
			for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
				int i_57_ = 0;
				for (;;) {
					i_47_ = method7913(class636);
					if (i_47_ == 0)
						break;
					i_57_++;
				}
				((Class636) class636).aByteArray8250[i_56_] = (byte) i_57_;
			}
			byte[] is_58_ = new byte[6];
			for (byte i_59_ = 0; i_59_ < i_54_; i_59_++)
				is_58_[i_59_] = i_59_;
			for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
				byte i_61_ = ((Class636) class636).aByteArray8250[i_60_];
				byte i_62_ = is_58_[i_61_];
				for (/**/; i_61_ > 0; i_61_--)
					is_58_[i_61_] = is_58_[i_61_ - 1];
				is_58_[0] = i_62_;
				((Class636) class636).aByteArray8255[i_60_] = i_62_;
			}
			for (int i_63_ = 0; i_63_ < i_54_; i_63_++) {
				int i_64_ = method7914(5, class636);
				for (int i_65_ = 0; i_65_ < i_53_; i_65_++) {
					for (;;) {
						i_47_ = method7913(class636);
						if (i_47_ == 0)
							break;
						i_47_ = method7913(class636);
						if (i_47_ == 0)
							i_64_++;
						else
							i_64_--;
					}
					((Class636) class636).aByteArrayArray8260[i_63_][i_65_] = (byte) i_64_;
				}
			}
			for (int i_66_ = 0; i_66_ < i_54_; i_66_++) {
				int i_67_ = 32;
				byte i_68_ = 0;
				for (int i_69_ = 0; i_69_ < i_53_; i_69_++) {
					if (((Class636) class636).aByteArrayArray8260[i_66_][i_69_] > i_68_)
						i_68_ = (((Class636) class636).aByteArrayArray8260[i_66_][i_69_]);
					if (((Class636) class636).aByteArrayArray8260[i_66_][i_69_] < i_67_)
						i_67_ = (((Class636) class636).aByteArrayArray8260[i_66_][i_69_]);
				}
				method7910(((Class636) class636).anIntArrayArray8237[i_66_], ((Class636) class636).anIntArrayArray8262[i_66_], ((Class636) class636).anIntArrayArray8243[i_66_], ((Class636) class636).aByteArrayArray8260[i_66_], i_67_, i_68_, i_53_);
				((Class636) class636).anIntArray8264[i_66_] = i_67_;
			}
			int i_70_ = ((Class636) class636).anInt8252 * -1363858345 + 1;
			int i_71_ = -1;
			int i_72_ = 0;
			for (int i_73_ = 0; i_73_ <= 255; i_73_++)
				((Class636) class636).anIntArray8228[i_73_] = 0;
			int i_74_ = 4095;
			for (int i_75_ = 15; i_75_ >= 0; i_75_--) {
				for (int i_76_ = 15; i_76_ >= 0; i_76_--) {
					((Class636) class636).aByteArray8249[i_74_] = (byte) (i_75_ * 16 + i_76_);
					i_74_--;
				}
				((Class636) class636).anIntArray8257[i_75_] = i_74_ + 1;
			}
			int i_77_ = 0;
			if (i_72_ == 0) {
				i_71_++;
				i_72_ = 50;
				byte i_78_ = ((Class636) class636).aByteArray8255[i_71_];
				i = ((Class636) class636).anIntArray8264[i_78_];
				is = ((Class636) class636).anIntArrayArray8237[i_78_];
				is_45_ = ((Class636) class636).anIntArrayArray8243[i_78_];
				is_44_ = ((Class636) class636).anIntArrayArray8262[i_78_];
			}
			i_72_--;
			int i_79_ = i;
			int i_80_;
			int i_81_;
			for (i_81_ = method7914(i_79_, class636); i_81_ > is[i_79_]; i_81_ = i_81_ << 1 | i_80_) {
				i_79_++;
				i_80_ = method7913(class636);
			}
			int i_82_ = is_45_[i_81_ - is_44_[i_79_]];
			while (i_82_ != i_70_) {
				if (i_82_ == 0 || i_82_ == 1) {
					int i_83_ = -1;
					int i_84_ = 1;
					do {
						if (i_82_ == 0)
							i_83_ += 1 * i_84_;
						else if (i_82_ == 1)
							i_83_ += 2 * i_84_;
						i_84_ *= 2;
						if (i_72_ == 0) {
							i_71_++;
							i_72_ = 50;
							byte i_85_ = ((Class636) class636).aByteArray8255[i_71_];
							i = ((Class636) class636).anIntArray8264[i_85_];
							is = (((Class636) class636).anIntArrayArray8237[i_85_]);
							is_45_ = (((Class636) class636).anIntArrayArray8243[i_85_]);
							is_44_ = (((Class636) class636).anIntArrayArray8262[i_85_]);
						}
						i_72_--;
						i_79_ = i;
						for (i_81_ = method7914(i_79_, class636); i_81_ > is[i_79_]; i_81_ = i_81_ << 1 | i_80_) {
							i_79_++;
							i_80_ = method7913(class636);
						}
						i_82_ = is_45_[i_81_ - is_44_[i_79_]];
					} while (i_82_ == 0 || i_82_ == 1);
					i_83_++;
					i_48_ = (((Class636) class636).aByteArray8230[((((Class636) class636).aByteArray8249[((Class636) class636).anIntArray8257[0]]) & 0xff)]);
					((Class636) class636).anIntArray8228[i_48_ & 0xff] += i_83_;
					for (/**/; i_83_ > 0; i_83_--) {
						Class97.anIntArray1255[i_77_] = i_48_ & 0xff;
						i_77_++;
					}
				} else {
					int i_86_ = i_82_ - 1;
					if (i_86_ < 16) {
						int i_87_ = ((Class636) class636).anIntArray8257[0];
						i_47_ = (((Class636) class636).aByteArray8249[i_87_ + i_86_]);
						for (/**/; i_86_ > 3; i_86_ -= 4) {
							int i_88_ = i_87_ + i_86_;
							((Class636) class636).aByteArray8249[i_88_] = (((Class636) class636).aByteArray8249[i_88_ - 1]);
							((Class636) class636).aByteArray8249[i_88_ - 1] = (((Class636) class636).aByteArray8249[i_88_ - 2]);
							((Class636) class636).aByteArray8249[i_88_ - 2] = (((Class636) class636).aByteArray8249[i_88_ - 3]);
							((Class636) class636).aByteArray8249[i_88_ - 3] = (((Class636) class636).aByteArray8249[i_88_ - 4]);
						}
						for (/**/; i_86_ > 0; i_86_--)
							((Class636) class636).aByteArray8249[i_87_ + i_86_] = (((Class636) class636).aByteArray8249[i_87_ + i_86_ - 1]);
						((Class636) class636).aByteArray8249[i_87_] = i_47_;
					} else {
						int i_89_ = i_86_ / 16;
						int i_90_ = i_86_ % 16;
						int i_91_ = (((Class636) class636).anIntArray8257[i_89_] + i_90_);
						i_47_ = ((Class636) class636).aByteArray8249[i_91_];
						for (/**/; (i_91_ > ((Class636) class636).anIntArray8257[i_89_]); i_91_--)
							((Class636) class636).aByteArray8249[i_91_] = (((Class636) class636).aByteArray8249[i_91_ - 1]);
						((Class636) class636).anIntArray8257[i_89_]++;
						for (/**/; i_89_ > 0; i_89_--) {
							((Class636) class636).anIntArray8257[i_89_]--;
							((Class636) class636).aByteArray8249[((Class636) class636).anIntArray8257[i_89_]] = (((Class636) class636).aByteArray8249[(((Class636) class636).anIntArray8257[i_89_ - 1]) + 16 - 1]);
						}
						((Class636) class636).anIntArray8257[0]--;
						((Class636) class636).aByteArray8249[((Class636) class636).anIntArray8257[0]] = i_47_;
						if (((Class636) class636).anIntArray8257[0] == 0) {
							i_74_ = 4095;
							for (int i_92_ = 15; i_92_ >= 0; i_92_--) {
								for (int i_93_ = 15; i_93_ >= 0; i_93_--) {
									((Class636) class636).aByteArray8249[i_74_] = (((Class636) class636).aByteArray8249[(((Class636) class636).anIntArray8257[i_92_]) + i_93_]);
									i_74_--;
								}
								((Class636) class636).anIntArray8257[i_92_] = i_74_ + 1;
							}
						}
					}
					((Class636) class636).anIntArray8228[(((Class636) class636).aByteArray8230[i_47_ & 0xff] & 0xff)]++;
					Class97.anIntArray1255[i_77_] = (((Class636) class636).aByteArray8230[i_47_ & 0xff] & 0xff);
					i_77_++;
					if (i_72_ == 0) {
						i_71_++;
						i_72_ = 50;
						byte i_94_ = ((Class636) class636).aByteArray8255[i_71_];
						i = ((Class636) class636).anIntArray8264[i_94_];
						is = ((Class636) class636).anIntArrayArray8237[i_94_];
						is_45_ = ((Class636) class636).anIntArrayArray8243[i_94_];
						is_44_ = ((Class636) class636).anIntArrayArray8262[i_94_];
					}
					i_72_--;
					i_79_ = i;
					for (i_81_ = method7914(i_79_, class636); i_81_ > is[i_79_]; i_81_ = i_81_ << 1 | i_80_) {
						i_79_++;
						i_80_ = method7913(class636);
					}
					i_82_ = is_45_[i_81_ - is_44_[i_79_]];
				}
			}
			((Class636) class636).anInt8242 = 0;
			((Class636) class636).aByte8241 = (byte) 0;
			((Class636) class636).anIntArray8251[0] = 0;
			for (int i_95_ = 1; i_95_ <= 256; i_95_++)
				((Class636) class636).anIntArray8251[i_95_] = ((Class636) class636).anIntArray8228[i_95_ - 1];
			for (int i_96_ = 1; i_96_ <= 256; i_96_++)
				((Class636) class636).anIntArray8251[i_96_] += ((Class636) class636).anIntArray8251[i_96_ - 1];
			for (int i_97_ = 0; i_97_ < i_77_; i_97_++) {
				i_48_ = (byte) (Class97.anIntArray1255[i_97_] & 0xff);
				Class97.anIntArray1255[(((Class636) class636).anIntArray8251[i_48_ & 0xff])] |= i_97_ << 8;
				((Class636) class636).anIntArray8251[i_48_ & 0xff]++;
			}
			((Class636) class636).anInt8247 = ((Class97.anIntArray1255[((Class636) class636).anInt8246 * 194736243]) >> 8) * 729069403;
			((Class636) class636).anInt8263 = 0;
			((Class636) class636).anInt8247 = (Class97.anIntArray1255[((Class636) class636).anInt8247 * 517775571]) * 729069403;
			((Class636) class636).anInt8256 = ((byte) (((Class636) class636).anInt8247 * 517775571 & 0xff) * -1017658635);
			Class636 class636_98_;
			((Class636) (class636_98_ = class636)).anInt8247 = ((((Class636) class636_98_).anInt8247 * 517775571 >> 8) * 729069403);
			((Class636) class636).anInt8263 += -1864569113;
			((Class636) class636).anInt8259 = i_77_ * -1477714957;
			method7911(class636);
			if ((((Class636) class636).anInt8263 * -1219345193 == ((Class636) class636).anInt8259 * 1161377083 + 1) && ((Class636) class636).anInt8242 * 1400551979 == 0)
				bool_46_ = true;
			else
				bool_46_ = false;
		}
	}

	Class674() throws Throwable {
		throw new Error();
	}

	static byte method7913(Class636 class636) {
		return (byte) method7914(1, class636);
	}

	static int method7914(int i, Class636 class636) {
		for (;;) {
			if (((Class636) class636).anInt8244 * 1760161423 >= i) {
				int i_99_ = ((((Class636) class636).anInt8265 * 263874979 >> ((Class636) class636).anInt8244 * 1760161423 - i) & (1 << i) - 1);
				((Class636) class636).anInt8244 -= i * -1675792273;
				return i_99_;
			}
			((Class636) class636).anInt8265 = ((((Class636) class636).anInt8265 * 263874979 << 8 | (((Class636) class636).aByteArray8234[((Class636) class636).anInt8235 * 2031973743]) & 0xff) * -2094001653);
			((Class636) class636).anInt8244 += -521436296;
			((Class636) class636).anInt8235 += -620918385;
			((Class636) class636).anInt8236 += -729093299;
			if (((Class636) class636).anInt8236 * -402111099 == 0) {
				/* empty */
			}
		}
	}

	static void method7915(Class636 class636) {
		((Class636) class636).anInt8252 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class636) class636).aBoolArray8253[i]) {
				((Class636) class636).aByteArray8230[((Class636) class636).anInt8252 * -1363858345] = (byte) i;
				((Class636) class636).anInt8252 += 994344807;
			}
		}
	}

	static byte method7916(Class636 class636) {
		return (byte) method7914(8, class636);
	}

	public static int method7917(byte[] is, int i, byte[] is_100_, int i_101_, int i_102_) {
		synchronized (aClass636_8545) {
			((Class636) aClass636_8545).aByteArray8234 = is_100_;
			((Class636) aClass636_8545).anInt8235 = i_102_ * -620918385;
			((Class636) aClass636_8545).aByteArray8254 = is;
			((Class636) aClass636_8545).anInt8238 = 0;
			((Class636) aClass636_8545).anInt8239 = i * 337265435;
			((Class636) aClass636_8545).anInt8244 = 0;
			((Class636) aClass636_8545).anInt8265 = 0;
			((Class636) aClass636_8545).anInt8236 = 0;
			((Class636) aClass636_8545).anInt8258 = 0;
			method7912(aClass636_8545);
			i -= ((Class636) aClass636_8545).anInt8239 * -1781375213;
			((Class636) aClass636_8545).aByteArray8234 = null;
			((Class636) aClass636_8545).aByteArray8254 = null;
			int i_103_ = i;
			return i_103_;
		}
	}
}
