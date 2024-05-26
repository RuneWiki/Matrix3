package game;

/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98 {
	static int anInt1256;
	static int anInt1257;
	static int anInt1258;
	static int[] anIntArray1259;
	static int anInt1260;
	static int anInt1261;
	static int anInt1262;
	static int anInt1263;

	static void method1569() {
		anInt1260 = 0;
	}

	static void method1570(int i, int i_0_) {
		for (/**/; i_0_ >= i + 8; i_0_ -= 4) {
			boolean bool = true;
			for (int i_1_ = i + 4; i_1_ < i_0_; i_1_ += 4) {
				int i_2_ = anIntArray1259[i_1_ - 4];
				int i_3_ = anIntArray1259[i_1_];
				if (i_2_ > i_3_) {
					bool = false;
					anIntArray1259[i_1_ - 4] = i_3_;
					anIntArray1259[i_1_] = i_2_;
					i_2_ = anIntArray1259[i_1_ - 2];
					anIntArray1259[i_1_ - 2] = anIntArray1259[i_1_ + 2];
					anIntArray1259[i_1_ + 2] = i_2_;
					i_2_ = anIntArray1259[i_1_ - 1];
					anIntArray1259[i_1_ - 1] = anIntArray1259[i_1_ + 3];
					anIntArray1259[i_1_ + 3] = i_2_;
				}
			}
			if (bool)
				break;
		}
	}

	public static void method1571(Class106 class106, int[] is, int i, int[] is_4_, int[] is_5_) {
		method1572(class106, is, 0, is.length, i, is_4_, is_5_);
	}

	static void method1572(Class106 class106, int[] is, int i, int i_6_, int i_7_, int[] is_8_, int[] is_9_) {
		int[] is_10_ = new int[4];
		class106.method1718(is_10_);
		if (is_8_ != null && is_10_[3] - is_10_[1] != is_8_.length)
			throw new IllegalStateException();
		method1579();
		method1574(is, i, i_6_);
		method1575(is_10_[1]);
		while (method1580(is_10_[3])) {
			int i_11_ = anInt1256;
			int i_12_ = anInt1257;
			int i_13_ = anInt1258;
			if (is_8_ != null) {
				int i_14_ = i_13_ - is_10_[1];
				if (i_11_ < is_8_[i_14_] + is_10_[0])
					i_11_ = is_8_[i_14_] + is_10_[0];
				if (i_12_ > is_8_[i_14_] + is_9_[i_14_] + is_10_[0])
					i_12_ = is_8_[i_14_] + is_9_[i_14_] + is_10_[0];
				if (i_12_ - i_11_ <= 0)
					continue;
			}
			class106.method1728(i_11_, i_13_, i_12_ - i_11_, i_7_, 1);
		}
	}

	static boolean method1573(int i) {
		int i_15_ = anInt1262;
		int i_16_ = anInt1263;
		int i_17_ = anInt1258;
		int i_18_;
		for (/**/; i_16_ >= i_15_; i_16_ = i_18_) {
			anInt1258 = ++i_17_;
			if (i_17_ >= i)
				return false;
			i_18_ = anInt1261;
			for (/**/; i_15_ < anInt1260; i_15_ += 4) {
				int i_19_ = anIntArray1259[i_15_ + 1];
				if (i_17_ < i_19_)
					break;
				int i_20_ = anIntArray1259[i_15_];
				int i_21_ = anIntArray1259[i_15_ + 2];
				int i_22_ = anIntArray1259[i_15_ + 3];
				int i_23_ = (i_21_ - i_20_ << 16) / (i_22_ - i_19_);
				int i_24_ = (i_20_ << 16) + 32768;
				anIntArray1259[i_15_] = i_24_;
				anIntArray1259[i_15_ + 2] = i_23_;
			}
			for (int i_25_ = i_18_; i_25_ < i_15_; i_25_ += 4) {
				int i_26_ = anIntArray1259[i_25_ + 3];
				if (i_17_ >= i_26_) {
					anIntArray1259[i_25_] = anIntArray1259[i_18_];
					anIntArray1259[i_25_ + 1] = anIntArray1259[i_18_ + 1];
					anIntArray1259[i_25_ + 2] = anIntArray1259[i_18_ + 2];
					anIntArray1259[i_25_ + 3] = anIntArray1259[i_18_ + 3];
					i_18_ += 4;
				}
			}
			if (i_18_ == anInt1260) {
				anInt1260 = 0;
				return false;
			}
			method1578(i_18_, i_15_);
			anInt1261 = i_18_;
			anInt1262 = i_15_;
		}
		anInt1256 = anIntArray1259[i_16_] >> 16;
		anInt1257 = anIntArray1259[i_16_ + 4] >> 16;
		anIntArray1259[i_16_] += anIntArray1259[i_16_ + 2];
		anIntArray1259[i_16_ + 4] += anIntArray1259[i_16_ + 6];
		i_16_ += 8;
		anInt1263 = i_16_;
		return true;
	}

	static void method1574(int[] is, int i, int i_27_) {
		int i_28_ = anInt1260 + (i_27_ << 1);
		if (anIntArray1259 == null || anIntArray1259.length < i_28_) {
			int[] is_29_ = new int[i_28_];
			for (int i_30_ = 0; i_30_ < anInt1260; i_30_++)
				is_29_[i_30_] = anIntArray1259[i_30_];
			anIntArray1259 = is_29_;
		}
		i_27_ += i;
		int i_31_ = i_27_ - 2;
		for (int i_32_ = i; i_32_ < i_27_; i_32_ += 2) {
			int i_33_ = is[i_31_ + 1];
			int i_34_ = is[i_32_ + 1];
			if (i_33_ < i_34_) {
				anIntArray1259[anInt1260++] = is[i_31_];
				anIntArray1259[anInt1260++] = i_33_;
				anIntArray1259[anInt1260++] = is[i_32_];
				anIntArray1259[anInt1260++] = i_34_;
			} else if (i_34_ < i_33_) {
				anIntArray1259[anInt1260++] = is[i_32_];
				anIntArray1259[anInt1260++] = i_34_;
				anIntArray1259[anInt1260++] = is[i_31_];
				anIntArray1259[anInt1260++] = i_33_;
			}
			i_31_ = i_32_;
		}
	}

	static void method1575(int i) {
		if (anInt1260 < 0) {
			anInt1263 = 0;
			anInt1262 = 0;
			anInt1261 = 0;
			anInt1258 = 2147483646;
		} else {
			method1591(0, anInt1260);
			int i_35_ = anIntArray1259[1];
			if (i_35_ < i)
				i_35_ = i;
			int i_36_ = 0;
			int i_37_;
			for (i_37_ = 0; i_37_ < anInt1260; i_37_ += 4) {
				int i_38_ = anIntArray1259[i_37_ + 1];
				if (i_35_ < i_38_)
					break;
				int i_39_ = anIntArray1259[i_37_];
				int i_40_ = anIntArray1259[i_37_ + 2];
				int i_41_ = anIntArray1259[i_37_ + 3];
				int i_42_ = (i_40_ - i_39_ << 16) / (i_41_ - i_38_);
				int i_43_ = (i_39_ << 16) + 32768;
				anIntArray1259[i_37_] = i_43_ + (i_35_ - i_38_) * i_42_;
				anIntArray1259[i_37_ + 2] = i_42_;
			}
			anInt1261 = i_36_;
			anInt1262 = i_37_;
			anInt1263 = i_37_;
			anInt1258 = i_35_ - 1;
		}
	}

	static void method1576(int i, int i_44_) {
		for (/**/; i_44_ >= i + 8; i_44_ -= 4) {
			boolean bool = true;
			for (int i_45_ = i + 4; i_45_ < i_44_; i_45_ += 4) {
				int i_46_ = anIntArray1259[i_45_ - 4];
				int i_47_ = anIntArray1259[i_45_];
				if (i_46_ > i_47_) {
					bool = false;
					anIntArray1259[i_45_ - 4] = i_47_;
					anIntArray1259[i_45_] = i_46_;
					i_46_ = anIntArray1259[i_45_ - 2];
					anIntArray1259[i_45_ - 2] = anIntArray1259[i_45_ + 2];
					anIntArray1259[i_45_ + 2] = i_46_;
					i_46_ = anIntArray1259[i_45_ - 1];
					anIntArray1259[i_45_ - 1] = anIntArray1259[i_45_ + 3];
					anIntArray1259[i_45_ + 3] = i_46_;
				}
			}
			if (bool)
				break;
		}
	}

	static boolean method1577(int i) {
		int i_48_ = anInt1262;
		int i_49_ = anInt1263;
		int i_50_ = anInt1258;
		int i_51_;
		for (/**/; i_49_ >= i_48_; i_49_ = i_51_) {
			anInt1258 = ++i_50_;
			if (i_50_ >= i)
				return false;
			i_51_ = anInt1261;
			for (/**/; i_48_ < anInt1260; i_48_ += 4) {
				int i_52_ = anIntArray1259[i_48_ + 1];
				if (i_50_ < i_52_)
					break;
				int i_53_ = anIntArray1259[i_48_];
				int i_54_ = anIntArray1259[i_48_ + 2];
				int i_55_ = anIntArray1259[i_48_ + 3];
				int i_56_ = (i_54_ - i_53_ << 16) / (i_55_ - i_52_);
				int i_57_ = (i_53_ << 16) + 32768;
				anIntArray1259[i_48_] = i_57_;
				anIntArray1259[i_48_ + 2] = i_56_;
			}
			for (int i_58_ = i_51_; i_58_ < i_48_; i_58_ += 4) {
				int i_59_ = anIntArray1259[i_58_ + 3];
				if (i_50_ >= i_59_) {
					anIntArray1259[i_58_] = anIntArray1259[i_51_];
					anIntArray1259[i_58_ + 1] = anIntArray1259[i_51_ + 1];
					anIntArray1259[i_58_ + 2] = anIntArray1259[i_51_ + 2];
					anIntArray1259[i_58_ + 3] = anIntArray1259[i_51_ + 3];
					i_51_ += 4;
				}
			}
			if (i_51_ == anInt1260) {
				anInt1260 = 0;
				return false;
			}
			method1578(i_51_, i_48_);
			anInt1261 = i_51_;
			anInt1262 = i_48_;
		}
		anInt1256 = anIntArray1259[i_49_] >> 16;
		anInt1257 = anIntArray1259[i_49_ + 4] >> 16;
		anIntArray1259[i_49_] += anIntArray1259[i_49_ + 2];
		anIntArray1259[i_49_ + 4] += anIntArray1259[i_49_ + 6];
		i_49_ += 8;
		anInt1263 = i_49_;
		return true;
	}

	static void method1578(int i, int i_60_) {
		for (/**/; i_60_ >= i + 8; i_60_ -= 4) {
			boolean bool = true;
			for (int i_61_ = i + 4; i_61_ < i_60_; i_61_ += 4) {
				int i_62_ = anIntArray1259[i_61_ - 4];
				int i_63_ = anIntArray1259[i_61_];
				if (i_62_ > i_63_) {
					bool = false;
					anIntArray1259[i_61_ - 4] = i_63_;
					anIntArray1259[i_61_] = i_62_;
					i_62_ = anIntArray1259[i_61_ - 2];
					anIntArray1259[i_61_ - 2] = anIntArray1259[i_61_ + 2];
					anIntArray1259[i_61_ + 2] = i_62_;
					i_62_ = anIntArray1259[i_61_ - 1];
					anIntArray1259[i_61_ - 1] = anIntArray1259[i_61_ + 3];
					anIntArray1259[i_61_ + 3] = i_62_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1579() {
		anInt1260 = 0;
	}

	static boolean method1580(int i) {
		int i_64_ = anInt1262;
		int i_65_ = anInt1263;
		int i_66_ = anInt1258;
		int i_67_;
		for (/**/; i_65_ >= i_64_; i_65_ = i_67_) {
			anInt1258 = ++i_66_;
			if (i_66_ >= i)
				return false;
			i_67_ = anInt1261;
			for (/**/; i_64_ < anInt1260; i_64_ += 4) {
				int i_68_ = anIntArray1259[i_64_ + 1];
				if (i_66_ < i_68_)
					break;
				int i_69_ = anIntArray1259[i_64_];
				int i_70_ = anIntArray1259[i_64_ + 2];
				int i_71_ = anIntArray1259[i_64_ + 3];
				int i_72_ = (i_70_ - i_69_ << 16) / (i_71_ - i_68_);
				int i_73_ = (i_69_ << 16) + 32768;
				anIntArray1259[i_64_] = i_73_;
				anIntArray1259[i_64_ + 2] = i_72_;
			}
			for (int i_74_ = i_67_; i_74_ < i_64_; i_74_ += 4) {
				int i_75_ = anIntArray1259[i_74_ + 3];
				if (i_66_ >= i_75_) {
					anIntArray1259[i_74_] = anIntArray1259[i_67_];
					anIntArray1259[i_74_ + 1] = anIntArray1259[i_67_ + 1];
					anIntArray1259[i_74_ + 2] = anIntArray1259[i_67_ + 2];
					anIntArray1259[i_74_ + 3] = anIntArray1259[i_67_ + 3];
					i_67_ += 4;
				}
			}
			if (i_67_ == anInt1260) {
				anInt1260 = 0;
				return false;
			}
			method1578(i_67_, i_64_);
			anInt1261 = i_67_;
			anInt1262 = i_64_;
		}
		anInt1256 = anIntArray1259[i_65_] >> 16;
		anInt1257 = anIntArray1259[i_65_ + 4] >> 16;
		anIntArray1259[i_65_] += anIntArray1259[i_65_ + 2];
		anIntArray1259[i_65_ + 4] += anIntArray1259[i_65_ + 6];
		i_65_ += 8;
		anInt1263 = i_65_;
		return true;
	}

	static void method1581(int i) {
		if (anInt1260 < 0) {
			anInt1263 = 0;
			anInt1262 = 0;
			anInt1261 = 0;
			anInt1258 = 2147483646;
		} else {
			method1591(0, anInt1260);
			int i_76_ = anIntArray1259[1];
			if (i_76_ < i)
				i_76_ = i;
			int i_77_ = 0;
			int i_78_;
			for (i_78_ = 0; i_78_ < anInt1260; i_78_ += 4) {
				int i_79_ = anIntArray1259[i_78_ + 1];
				if (i_76_ < i_79_)
					break;
				int i_80_ = anIntArray1259[i_78_];
				int i_81_ = anIntArray1259[i_78_ + 2];
				int i_82_ = anIntArray1259[i_78_ + 3];
				int i_83_ = (i_81_ - i_80_ << 16) / (i_82_ - i_79_);
				int i_84_ = (i_80_ << 16) + 32768;
				anIntArray1259[i_78_] = i_84_ + (i_76_ - i_79_) * i_83_;
				anIntArray1259[i_78_ + 2] = i_83_;
			}
			anInt1261 = i_77_;
			anInt1262 = i_78_;
			anInt1263 = i_78_;
			anInt1258 = i_76_ - 1;
		}
	}

	public static void method1582(Class106 class106, int[] is, int i) {
		method1572(class106, is, 0, is.length, i, null, null);
	}

	static boolean method1583(int i) {
		int i_85_ = anInt1262;
		int i_86_ = anInt1263;
		int i_87_ = anInt1258;
		int i_88_;
		for (/**/; i_86_ >= i_85_; i_86_ = i_88_) {
			anInt1258 = ++i_87_;
			if (i_87_ >= i)
				return false;
			i_88_ = anInt1261;
			for (/**/; i_85_ < anInt1260; i_85_ += 4) {
				int i_89_ = anIntArray1259[i_85_ + 1];
				if (i_87_ < i_89_)
					break;
				int i_90_ = anIntArray1259[i_85_];
				int i_91_ = anIntArray1259[i_85_ + 2];
				int i_92_ = anIntArray1259[i_85_ + 3];
				int i_93_ = (i_91_ - i_90_ << 16) / (i_92_ - i_89_);
				int i_94_ = (i_90_ << 16) + 32768;
				anIntArray1259[i_85_] = i_94_;
				anIntArray1259[i_85_ + 2] = i_93_;
			}
			for (int i_95_ = i_88_; i_95_ < i_85_; i_95_ += 4) {
				int i_96_ = anIntArray1259[i_95_ + 3];
				if (i_87_ >= i_96_) {
					anIntArray1259[i_95_] = anIntArray1259[i_88_];
					anIntArray1259[i_95_ + 1] = anIntArray1259[i_88_ + 1];
					anIntArray1259[i_95_ + 2] = anIntArray1259[i_88_ + 2];
					anIntArray1259[i_95_ + 3] = anIntArray1259[i_88_ + 3];
					i_88_ += 4;
				}
			}
			if (i_88_ == anInt1260) {
				anInt1260 = 0;
				return false;
			}
			method1578(i_88_, i_85_);
			anInt1261 = i_88_;
			anInt1262 = i_85_;
		}
		anInt1256 = anIntArray1259[i_86_] >> 16;
		anInt1257 = anIntArray1259[i_86_ + 4] >> 16;
		anIntArray1259[i_86_] += anIntArray1259[i_86_ + 2];
		anIntArray1259[i_86_ + 4] += anIntArray1259[i_86_ + 6];
		i_86_ += 8;
		anInt1263 = i_86_;
		return true;
	}

	Class98() throws Throwable {
		throw new Error();
	}

	static void method1584(int i, int i_97_) {
		if (i_97_ > i + 4) {
			int i_98_ = i;
			int i_99_ = anIntArray1259[i_98_];
			int i_100_ = anIntArray1259[i_98_ + 1];
			int i_101_ = anIntArray1259[i_98_ + 2];
			int i_102_ = anIntArray1259[i_98_ + 3];
			for (int i_103_ = i + 4; i_103_ < i_97_; i_103_ += 4) {
				int i_104_ = anIntArray1259[i_103_ + 1];
				if (i_104_ < i_100_) {
					anIntArray1259[i_98_] = anIntArray1259[i_103_];
					anIntArray1259[i_98_ + 1] = i_104_;
					anIntArray1259[i_98_ + 2] = anIntArray1259[i_103_ + 2];
					anIntArray1259[i_98_ + 3] = anIntArray1259[i_103_ + 3];
					i_98_ += 4;
					anIntArray1259[i_103_] = anIntArray1259[i_98_];
					anIntArray1259[i_103_ + 1] = anIntArray1259[i_98_ + 1];
					anIntArray1259[i_103_ + 2] = anIntArray1259[i_98_ + 2];
					anIntArray1259[i_103_ + 3] = anIntArray1259[i_98_ + 3];
				}
			}
			anIntArray1259[i_98_] = i_99_;
			anIntArray1259[i_98_ + 1] = i_100_;
			anIntArray1259[i_98_ + 2] = i_101_;
			anIntArray1259[i_98_ + 3] = i_102_;
			method1591(i, i_98_);
			method1591(i_98_ + 4, i_97_);
		}
	}

	static void method1585(int i, int i_105_) {
		if (i_105_ > i + 4) {
			int i_106_ = i;
			int i_107_ = anIntArray1259[i_106_];
			int i_108_ = anIntArray1259[i_106_ + 1];
			int i_109_ = anIntArray1259[i_106_ + 2];
			int i_110_ = anIntArray1259[i_106_ + 3];
			for (int i_111_ = i + 4; i_111_ < i_105_; i_111_ += 4) {
				int i_112_ = anIntArray1259[i_111_ + 1];
				if (i_112_ < i_108_) {
					anIntArray1259[i_106_] = anIntArray1259[i_111_];
					anIntArray1259[i_106_ + 1] = i_112_;
					anIntArray1259[i_106_ + 2] = anIntArray1259[i_111_ + 2];
					anIntArray1259[i_106_ + 3] = anIntArray1259[i_111_ + 3];
					i_106_ += 4;
					anIntArray1259[i_111_] = anIntArray1259[i_106_];
					anIntArray1259[i_111_ + 1] = anIntArray1259[i_106_ + 1];
					anIntArray1259[i_111_ + 2] = anIntArray1259[i_106_ + 2];
					anIntArray1259[i_111_ + 3] = anIntArray1259[i_106_ + 3];
				}
			}
			anIntArray1259[i_106_] = i_107_;
			anIntArray1259[i_106_ + 1] = i_108_;
			anIntArray1259[i_106_ + 2] = i_109_;
			anIntArray1259[i_106_ + 3] = i_110_;
			method1591(i, i_106_);
			method1591(i_106_ + 4, i_105_);
		}
	}

	static void method1586(int i, int i_113_) {
		for (/**/; i_113_ >= i + 8; i_113_ -= 4) {
			boolean bool = true;
			for (int i_114_ = i + 4; i_114_ < i_113_; i_114_ += 4) {
				int i_115_ = anIntArray1259[i_114_ - 4];
				int i_116_ = anIntArray1259[i_114_];
				if (i_115_ > i_116_) {
					bool = false;
					anIntArray1259[i_114_ - 4] = i_116_;
					anIntArray1259[i_114_] = i_115_;
					i_115_ = anIntArray1259[i_114_ - 2];
					anIntArray1259[i_114_ - 2] = anIntArray1259[i_114_ + 2];
					anIntArray1259[i_114_ + 2] = i_115_;
					i_115_ = anIntArray1259[i_114_ - 1];
					anIntArray1259[i_114_ - 1] = anIntArray1259[i_114_ + 3];
					anIntArray1259[i_114_ + 3] = i_115_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1587(int i, int i_117_) {
		for (/**/; i_117_ >= i + 8; i_117_ -= 4) {
			boolean bool = true;
			for (int i_118_ = i + 4; i_118_ < i_117_; i_118_ += 4) {
				int i_119_ = anIntArray1259[i_118_ - 4];
				int i_120_ = anIntArray1259[i_118_];
				if (i_119_ > i_120_) {
					bool = false;
					anIntArray1259[i_118_ - 4] = i_120_;
					anIntArray1259[i_118_] = i_119_;
					i_119_ = anIntArray1259[i_118_ - 2];
					anIntArray1259[i_118_ - 2] = anIntArray1259[i_118_ + 2];
					anIntArray1259[i_118_ + 2] = i_119_;
					i_119_ = anIntArray1259[i_118_ - 1];
					anIntArray1259[i_118_ - 1] = anIntArray1259[i_118_ + 3];
					anIntArray1259[i_118_ + 3] = i_119_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1588(int i, int i_121_) {
		for (/**/; i_121_ >= i + 8; i_121_ -= 4) {
			boolean bool = true;
			for (int i_122_ = i + 4; i_122_ < i_121_; i_122_ += 4) {
				int i_123_ = anIntArray1259[i_122_ - 4];
				int i_124_ = anIntArray1259[i_122_];
				if (i_123_ > i_124_) {
					bool = false;
					anIntArray1259[i_122_ - 4] = i_124_;
					anIntArray1259[i_122_] = i_123_;
					i_123_ = anIntArray1259[i_122_ - 2];
					anIntArray1259[i_122_ - 2] = anIntArray1259[i_122_ + 2];
					anIntArray1259[i_122_ + 2] = i_123_;
					i_123_ = anIntArray1259[i_122_ - 1];
					anIntArray1259[i_122_ - 1] = anIntArray1259[i_122_ + 3];
					anIntArray1259[i_122_ + 3] = i_123_;
				}
			}
			if (bool)
				break;
		}
	}

	static boolean method1589(int i) {
		int i_125_ = anInt1262;
		int i_126_ = anInt1263;
		int i_127_ = anInt1258;
		int i_128_;
		for (/**/; i_126_ >= i_125_; i_126_ = i_128_) {
			anInt1258 = ++i_127_;
			if (i_127_ >= i)
				return false;
			i_128_ = anInt1261;
			for (/**/; i_125_ < anInt1260; i_125_ += 4) {
				int i_129_ = anIntArray1259[i_125_ + 1];
				if (i_127_ < i_129_)
					break;
				int i_130_ = anIntArray1259[i_125_];
				int i_131_ = anIntArray1259[i_125_ + 2];
				int i_132_ = anIntArray1259[i_125_ + 3];
				int i_133_ = (i_131_ - i_130_ << 16) / (i_132_ - i_129_);
				int i_134_ = (i_130_ << 16) + 32768;
				anIntArray1259[i_125_] = i_134_;
				anIntArray1259[i_125_ + 2] = i_133_;
			}
			for (int i_135_ = i_128_; i_135_ < i_125_; i_135_ += 4) {
				int i_136_ = anIntArray1259[i_135_ + 3];
				if (i_127_ >= i_136_) {
					anIntArray1259[i_135_] = anIntArray1259[i_128_];
					anIntArray1259[i_135_ + 1] = anIntArray1259[i_128_ + 1];
					anIntArray1259[i_135_ + 2] = anIntArray1259[i_128_ + 2];
					anIntArray1259[i_135_ + 3] = anIntArray1259[i_128_ + 3];
					i_128_ += 4;
				}
			}
			if (i_128_ == anInt1260) {
				anInt1260 = 0;
				return false;
			}
			method1578(i_128_, i_125_);
			anInt1261 = i_128_;
			anInt1262 = i_125_;
		}
		anInt1256 = anIntArray1259[i_126_] >> 16;
		anInt1257 = anIntArray1259[i_126_ + 4] >> 16;
		anIntArray1259[i_126_] += anIntArray1259[i_126_ + 2];
		anIntArray1259[i_126_ + 4] += anIntArray1259[i_126_ + 6];
		i_126_ += 8;
		anInt1263 = i_126_;
		return true;
	}

	static void method1590(int i, int i_137_) {
		for (/**/; i_137_ >= i + 8; i_137_ -= 4) {
			boolean bool = true;
			for (int i_138_ = i + 4; i_138_ < i_137_; i_138_ += 4) {
				int i_139_ = anIntArray1259[i_138_ - 4];
				int i_140_ = anIntArray1259[i_138_];
				if (i_139_ > i_140_) {
					bool = false;
					anIntArray1259[i_138_ - 4] = i_140_;
					anIntArray1259[i_138_] = i_139_;
					i_139_ = anIntArray1259[i_138_ - 2];
					anIntArray1259[i_138_ - 2] = anIntArray1259[i_138_ + 2];
					anIntArray1259[i_138_ + 2] = i_139_;
					i_139_ = anIntArray1259[i_138_ - 1];
					anIntArray1259[i_138_ - 1] = anIntArray1259[i_138_ + 3];
					anIntArray1259[i_138_ + 3] = i_139_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1591(int i, int i_141_) {
		if (i_141_ > i + 4) {
			int i_142_ = i;
			int i_143_ = anIntArray1259[i_142_];
			int i_144_ = anIntArray1259[i_142_ + 1];
			int i_145_ = anIntArray1259[i_142_ + 2];
			int i_146_ = anIntArray1259[i_142_ + 3];
			for (int i_147_ = i + 4; i_147_ < i_141_; i_147_ += 4) {
				int i_148_ = anIntArray1259[i_147_ + 1];
				if (i_148_ < i_144_) {
					anIntArray1259[i_142_] = anIntArray1259[i_147_];
					anIntArray1259[i_142_ + 1] = i_148_;
					anIntArray1259[i_142_ + 2] = anIntArray1259[i_147_ + 2];
					anIntArray1259[i_142_ + 3] = anIntArray1259[i_147_ + 3];
					i_142_ += 4;
					anIntArray1259[i_147_] = anIntArray1259[i_142_];
					anIntArray1259[i_147_ + 1] = anIntArray1259[i_142_ + 1];
					anIntArray1259[i_147_ + 2] = anIntArray1259[i_142_ + 2];
					anIntArray1259[i_147_ + 3] = anIntArray1259[i_142_ + 3];
				}
			}
			anIntArray1259[i_142_] = i_143_;
			anIntArray1259[i_142_ + 1] = i_144_;
			anIntArray1259[i_142_ + 2] = i_145_;
			anIntArray1259[i_142_ + 3] = i_146_;
			method1591(i, i_142_);
			method1591(i_142_ + 4, i_141_);
		}
	}
}
