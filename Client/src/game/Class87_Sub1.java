package game;

/* Class87_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub1 extends Class87 {
	int anInt9966;
	public int[] anIntArray9967;
	public int anInt9968;
	public byte[] aByteArray9969;
	public int anInt9970;
	int anInt9971;
	public byte[] aByteArray9972;
	int anInt9973;
	int anInt9974;

	public int method1330() {
		return ((Class87_Sub1) this).anInt9966;
	}

	public boolean method1282() {
		return true;
	}

	public boolean method1322() {
		return aByteArray9972 != null;
	}

	public int method1329() {
		return ((Class87_Sub1) this).anInt9973;
	}

	public void method1296() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_0_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_1_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_0_ < i_1_; i_0_++) {
					i_1_--;
					byte i_2_ = is[i_0_];
					is[i_0_] = is[i_1_];
					is[i_1_] = i_2_;
				}
			}
		} else {
			byte[] is_3_ = aByteArray9972;
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_4_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_5_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_4_ < i_5_; i_4_++) {
					i_5_--;
					byte i_6_ = is[i_4_];
					is[i_4_] = is[i_5_];
					is[i_5_] = i_6_;
					i_6_ = is_3_[i_4_];
					is_3_[i_4_] = is_3_[i_5_];
					is_3_[i_5_] = i_6_;
				}
			}
		}
		int i = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i;
	}

	public int method1310() {
		return (((Class87_Sub1) this).anInt9973 + anInt9968 + ((Class87_Sub1) this).anInt9974);
	}

	public int method1305() {
		return (((Class87_Sub1) this).anInt9966 + anInt9970 + ((Class87_Sub1) this).anInt9971);
	}

	public boolean method1304() {
		return true;
	}

	public int method1317() {
		return ((Class87_Sub1) this).anInt9974;
	}

	public int method1313() {
		return (((Class87_Sub1) this).anInt9966 + anInt9970 + ((Class87_Sub1) this).anInt9971);
	}

	public void method1306(int i) {
		int i_7_ = method1283();
		int i_8_ = method1305();
		if (((Class87_Sub1) this).anInt9973 != i_7_ || ((Class87_Sub1) this).anInt9966 != i_8_) {
			int i_9_ = i;
			if (i_9_ > anInt9968)
				i_9_ = anInt9968;
			int i_10_ = i;
			if (i_10_ + anInt9968 + ((Class87_Sub1) this).anInt9973 > i_7_)
				i_10_ = i_7_ - anInt9968 - ((Class87_Sub1) this).anInt9973;
			int i_11_ = i;
			if (i_11_ > anInt9970)
				i_11_ = anInt9970;
			int i_12_ = i;
			if (i_12_ + anInt9970 + ((Class87_Sub1) this).anInt9966 > i_8_)
				i_12_ = i_8_ - anInt9970 - ((Class87_Sub1) this).anInt9966;
			int i_13_ = ((Class87_Sub1) this).anInt9973 + i_9_ + i_10_;
			int i_14_ = ((Class87_Sub1) this).anInt9966 + i_11_ + i_12_;
			byte[] is = new byte[i_13_ * i_14_];
			if (aByteArray9972 == null) {
				for (int i_15_ = 0; i_15_ < ((Class87_Sub1) this).anInt9966; i_15_++) {
					int i_16_ = i_15_ * ((Class87_Sub1) this).anInt9973;
					int i_17_ = (i_15_ + i_11_) * i_13_ + i_9_;
					for (int i_18_ = 0; i_18_ < ((Class87_Sub1) this).anInt9973; i_18_++)
						is[i_17_++] = aByteArray9969[i_16_++];
				}
			} else {
				byte[] is_19_ = new byte[i_13_ * i_14_];
				for (int i_20_ = 0; i_20_ < ((Class87_Sub1) this).anInt9966; i_20_++) {
					int i_21_ = i_20_ * ((Class87_Sub1) this).anInt9973;
					int i_22_ = (i_20_ + i_11_) * i_13_ + i_9_;
					for (int i_23_ = 0; i_23_ < ((Class87_Sub1) this).anInt9973; i_23_++) {
						is_19_[i_22_] = aByteArray9972[i_21_];
						is[i_22_++] = aByteArray9969[i_21_++];
					}
				}
				aByteArray9972 = is_19_;
			}
			anInt9968 -= i_9_;
			anInt9970 -= i_11_;
			((Class87_Sub1) this).anInt9974 -= i_10_;
			((Class87_Sub1) this).anInt9971 -= i_12_;
			((Class87_Sub1) this).anInt9973 = i_13_;
			((Class87_Sub1) this).anInt9966 = i_14_;
			aByteArray9969 = is;
		}
	}

	public void method1326() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_24_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_25_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_24_ < i_25_; i_24_++) {
					i_25_--;
					byte i_26_ = is[i_24_];
					is[i_24_] = is[i_25_];
					is[i_25_] = i_26_;
				}
			}
		} else {
			byte[] is_27_ = aByteArray9972;
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_28_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_29_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_28_ < i_29_; i_28_++) {
					i_29_--;
					byte i_30_ = is[i_28_];
					is[i_28_] = is[i_29_];
					is[i_29_] = i_30_;
					i_30_ = is_27_[i_28_];
					is_27_[i_28_] = is_27_[i_29_];
					is_27_[i_29_] = i_30_;
				}
			}
		}
		int i = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i;
	}

	public void method1293(int i) {
		int i_31_ = method1283();
		int i_32_ = method1305();
		if (((Class87_Sub1) this).anInt9973 != i_31_ || ((Class87_Sub1) this).anInt9966 != i_32_) {
			int i_33_ = i;
			if (i_33_ > anInt9968)
				i_33_ = anInt9968;
			int i_34_ = i;
			if (i_34_ + anInt9968 + ((Class87_Sub1) this).anInt9973 > i_31_)
				i_34_ = i_31_ - anInt9968 - ((Class87_Sub1) this).anInt9973;
			int i_35_ = i;
			if (i_35_ > anInt9970)
				i_35_ = anInt9970;
			int i_36_ = i;
			if (i_36_ + anInt9970 + ((Class87_Sub1) this).anInt9966 > i_32_)
				i_36_ = i_32_ - anInt9970 - ((Class87_Sub1) this).anInt9966;
			int i_37_ = ((Class87_Sub1) this).anInt9973 + i_33_ + i_34_;
			int i_38_ = ((Class87_Sub1) this).anInt9966 + i_35_ + i_36_;
			byte[] is = new byte[i_37_ * i_38_];
			if (aByteArray9972 == null) {
				for (int i_39_ = 0; i_39_ < ((Class87_Sub1) this).anInt9966; i_39_++) {
					int i_40_ = i_39_ * ((Class87_Sub1) this).anInt9973;
					int i_41_ = (i_39_ + i_35_) * i_37_ + i_33_;
					for (int i_42_ = 0; i_42_ < ((Class87_Sub1) this).anInt9973; i_42_++)
						is[i_41_++] = aByteArray9969[i_40_++];
				}
			} else {
				byte[] is_43_ = new byte[i_37_ * i_38_];
				for (int i_44_ = 0; i_44_ < ((Class87_Sub1) this).anInt9966; i_44_++) {
					int i_45_ = i_44_ * ((Class87_Sub1) this).anInt9973;
					int i_46_ = (i_44_ + i_35_) * i_37_ + i_33_;
					for (int i_47_ = 0; i_47_ < ((Class87_Sub1) this).anInt9973; i_47_++) {
						is_43_[i_46_] = aByteArray9972[i_45_];
						is[i_46_++] = aByteArray9969[i_45_++];
					}
				}
				aByteArray9972 = is_43_;
			}
			anInt9968 -= i_33_;
			anInt9970 -= i_35_;
			((Class87_Sub1) this).anInt9974 -= i_34_;
			((Class87_Sub1) this).anInt9971 -= i_36_;
			((Class87_Sub1) this).anInt9973 = i_37_;
			((Class87_Sub1) this).anInt9966 = i_38_;
			aByteArray9969 = is;
		}
	}

	public void method1294(int i) {
		int i_48_ = -1;
		if (anIntArray9967.length < 255) {
			for (int i_49_ = 0; i_49_ < anIntArray9967.length; i_49_++) {
				if (anIntArray9967[i_49_] == i) {
					i_48_ = i_49_;
					break;
				}
			}
			if (i_48_ == -1) {
				i_48_ = anIntArray9967.length;
				int[] is = new int[anIntArray9967.length + 1];
				System.arraycopy(anIntArray9967, 0, is, 0, anIntArray9967.length);
				anIntArray9967 = is;
				is[i_48_] = i;
			}
		} else {
			int i_50_ = 2147483647;
			int i_51_ = i >> 16 & 0xff;
			int i_52_ = i >> 8 & 0xff;
			int i_53_ = i & 0xff;
			for (int i_54_ = 0; i_54_ < anIntArray9967.length; i_54_++) {
				int i_55_ = anIntArray9967[i_54_];
				int i_56_ = i_55_ >> 16 & 0xff;
				int i_57_ = i_55_ >> 8 & 0xff;
				int i_58_ = i_55_ & 0xff;
				int i_59_ = i_51_ - i_56_;
				if (i_59_ < 0)
					i_59_ = -i_59_;
				int i_60_ = i_52_ - i_57_;
				if (i_60_ < 0)
					i_60_ = -i_60_;
				int i_61_ = i_53_ - i_58_;
				if (i_61_ < 0)
					i_61_ = -i_61_;
				int i_62_ = i_59_ + i_60_ + i_61_;
				if (i_62_ < i_50_) {
					i_50_ = i_62_;
					i_48_ = i_54_;
				}
			}
		}
		int i_63_ = 0;
		byte[] is = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
		for (int i_64_ = 0; i_64_ < ((Class87_Sub1) this).anInt9966; i_64_++) {
			for (int i_65_ = 0; i_65_ < ((Class87_Sub1) this).anInt9973; i_65_++) {
				int i_66_ = aByteArray9969[i_63_] & 0xff;
				if (anIntArray9967[i_66_] == 0) {
					if (i_65_ > 0 && (anIntArray9967[aByteArray9969[i_63_ - 1] & 0xff] != 0))
						i_66_ = i_48_;
					else if (i_64_ > 0 && (anIntArray9967[((aByteArray9969[i_63_ - ((Class87_Sub1) this).anInt9973]) & 0xff)]) != 0)
						i_66_ = i_48_;
					else if (i_65_ < ((Class87_Sub1) this).anInt9973 - 1 && (anIntArray9967[aByteArray9969[i_63_ + 1] & 0xff]) != 0)
						i_66_ = i_48_;
					else if (i_64_ < ((Class87_Sub1) this).anInt9966 - 1 && (anIntArray9967[((aByteArray9969[i_63_ + ((Class87_Sub1) this).anInt9973]) & 0xff)]) != 0)
						i_66_ = i_48_;
				}
				is[i_63_++] = (byte) i_66_;
			}
		}
		aByteArray9969 = is;
	}

	public void method1290() {
		((Class87_Sub1) this).anInt9971 = 0;
		anInt9970 = 0;
		((Class87_Sub1) this).anInt9974 = 0;
		anInt9968 = 0;
	}

	public boolean method1307() {
		return aByteArray9972 != null;
	}

	public void method1281() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_67_ = i * ((Class87_Sub1) this).anInt9973;
				int i_68_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_69_ = -((Class87_Sub1) this).anInt9973; i_69_ < 0; i_69_++) {
					byte i_70_ = is[i_67_];
					is[i_67_] = is[i_68_];
					is[i_68_] = i_70_;
					i_67_++;
					i_68_++;
				}
			}
		} else {
			byte[] is_71_ = aByteArray9972;
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_72_ = i * ((Class87_Sub1) this).anInt9973;
				int i_73_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_74_ = -((Class87_Sub1) this).anInt9973; i_74_ < 0; i_74_++) {
					byte i_75_ = is[i_72_];
					is[i_72_] = is[i_73_];
					is[i_73_] = i_75_;
					i_75_ = is_71_[i_72_];
					is_71_[i_72_] = is_71_[i_73_];
					is_71_[i_73_] = i_75_;
					i_72_++;
					i_73_++;
				}
			}
		}
		int i = anInt9970;
		anInt9970 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = i;
	}

	public int[] method1328(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_76_ = 0; i_76_ < ((Class87_Sub1) this).anInt9966; i_76_++) {
					int i_77_ = i_76_ * ((Class87_Sub1) this).anInt9973;
					int i_78_ = anInt9968 + (i_76_ + anInt9970) * i;
					for (int i_79_ = 0; i_79_ < ((Class87_Sub1) this).anInt9973; i_79_++) {
						is[i_78_++] = (aByteArray9972[i_77_] << 24 | anIntArray9967[aByteArray9969[i_77_] & 0xff]);
						i_77_++;
					}
				}
			} else {
				for (int i_80_ = 0; i_80_ < ((Class87_Sub1) this).anInt9966; i_80_++) {
					int i_81_ = i_80_ * ((Class87_Sub1) this).anInt9973;
					int i_82_ = anInt9968 + (i_80_ + anInt9970) * i;
					for (int i_83_ = 0; i_83_ < ((Class87_Sub1) this).anInt9973; i_83_++) {
						int i_84_ = anIntArray9967[aByteArray9969[i_81_++] & 0xff];
						if (i_84_ != 0)
							is[i_82_++] = ~0xffffff | i_84_;
						else
							is[i_82_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_85_ = 0;
			if (aByteArray9972 != null) {
				for (int i_86_ = 0; i_86_ < ((Class87_Sub1) this).anInt9966; i_86_++) {
					for (int i_87_ = 0; i_87_ < ((Class87_Sub1) this).anInt9973; i_87_++) {
						is[i_85_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_88_ = 0; i_88_ < ((Class87_Sub1) this).anInt9966; i_88_++) {
					for (int i_89_ = 0; i_89_ < ((Class87_Sub1) this).anInt9973; i_89_++) {
						int i_90_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_85_++] = i_90_ != 0 ? ~0xffffff | i_90_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method1285(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_91_ = 0; i_91_ < ((Class87_Sub1) this).anInt9966; i_91_++) {
					int i_92_ = i_91_ * ((Class87_Sub1) this).anInt9973;
					int i_93_ = anInt9968 + (i_91_ + anInt9970) * i;
					for (int i_94_ = 0; i_94_ < ((Class87_Sub1) this).anInt9973; i_94_++) {
						is[i_93_++] = (aByteArray9972[i_92_] << 24 | anIntArray9967[aByteArray9969[i_92_] & 0xff]);
						i_92_++;
					}
				}
			} else {
				for (int i_95_ = 0; i_95_ < ((Class87_Sub1) this).anInt9966; i_95_++) {
					int i_96_ = i_95_ * ((Class87_Sub1) this).anInt9973;
					int i_97_ = anInt9968 + (i_95_ + anInt9970) * i;
					for (int i_98_ = 0; i_98_ < ((Class87_Sub1) this).anInt9973; i_98_++) {
						int i_99_ = anIntArray9967[aByteArray9969[i_96_++] & 0xff];
						if (i_99_ != 0)
							is[i_97_++] = ~0xffffff | i_99_;
						else
							is[i_97_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_100_ = 0;
			if (aByteArray9972 != null) {
				for (int i_101_ = 0; i_101_ < ((Class87_Sub1) this).anInt9966; i_101_++) {
					for (int i_102_ = 0; i_102_ < ((Class87_Sub1) this).anInt9973; i_102_++) {
						is[i_100_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_103_ = 0; i_103_ < ((Class87_Sub1) this).anInt9966; i_103_++) {
					for (int i_104_ = 0; i_104_ < ((Class87_Sub1) this).anInt9973; i_104_++) {
						int i_105_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_100_++] = i_105_ != 0 ? ~0xffffff | i_105_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method1300(int i, int i_106_, int i_107_) {
		for (int i_108_ = 1; i_108_ < anIntArray9967.length; i_108_++) {
			if (anIntArray9967[i_108_] != 1 && anIntArray9967[i_108_] != 16711935) {
				int i_109_ = anIntArray9967[i_108_] >> 16 & 0xff;
				i_109_ += i;
				if (i_109_ < 0)
					i_109_ = 0;
				else if (i_109_ > 255)
					i_109_ = 255;
				int i_110_ = anIntArray9967[i_108_] >> 8 & 0xff;
				i_110_ += i_106_;
				if (i_110_ < 0)
					i_110_ = 0;
				else if (i_110_ > 255)
					i_110_ = 255;
				int i_111_ = anIntArray9967[i_108_] >> 0 & 0xff;
				i_111_ += i_107_;
				if (i_111_ < 0)
					i_111_ = 0;
				else if (i_111_ > 255)
					i_111_ = 255;
				anIntArray9967[i_108_] = i_109_ << 16 | i_110_ << 8 | i_111_;
			}
		}
	}

	public int method1334(int i, int i_112_) {
		return (anIntArray9967[(aByteArray9969[i + i_112_ * ((Class87_Sub1) this).anInt9973] & 0xff)]);
	}

	public boolean method1302() {
		return true;
	}

	public boolean method1325() {
		return true;
	}

	public int method1283() {
		return (((Class87_Sub1) this).anInt9973 + anInt9968 + ((Class87_Sub1) this).anInt9974);
	}

	public boolean method1284() {
		return true;
	}

	public boolean method1292() {
		return aByteArray9972 != null;
	}

	public int method1289() {
		return ((Class87_Sub1) this).anInt9971;
	}

	public boolean method1308() {
		return aByteArray9972 != null;
	}

	public int method1318() {
		return anInt9970;
	}

	public int method1287() {
		return anInt9970;
	}

	public int method1311() {
		return (((Class87_Sub1) this).anInt9966 + anInt9970 + ((Class87_Sub1) this).anInt9971);
	}

	public void method1299() {
		byte[] is = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
		int i = 0;
		if (aByteArray9972 == null) {
			for (int i_113_ = 0; i_113_ < ((Class87_Sub1) this).anInt9973; i_113_++) {
				for (int i_114_ = ((Class87_Sub1) this).anInt9966 - 1; i_114_ >= 0; i_114_--)
					is[i++] = aByteArray9969[i_113_ + i_114_ * ((Class87_Sub1) this).anInt9973];
			}
			aByteArray9969 = is;
		} else {
			byte[] is_115_ = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			for (int i_116_ = 0; i_116_ < ((Class87_Sub1) this).anInt9973; i_116_++) {
				for (int i_117_ = ((Class87_Sub1) this).anInt9966 - 1; i_117_ >= 0; i_117_--) {
					is[i] = aByteArray9969[i_116_ + i_117_ * ((Class87_Sub1) this).anInt9973];
					is_115_[i++] = aByteArray9972[i_116_ + i_117_ * ((Class87_Sub1) this).anInt9973];
				}
			}
			aByteArray9969 = is;
			aByteArray9972 = is_115_;
		}
		int i_118_ = anInt9970;
		anInt9970 = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i_118_;
		i_118_ = ((Class87_Sub1) this).anInt9966;
		((Class87_Sub1) this).anInt9966 = ((Class87_Sub1) this).anInt9973;
		((Class87_Sub1) this).anInt9973 = i_118_;
	}

	public int method1312() {
		return (((Class87_Sub1) this).anInt9966 + anInt9970 + ((Class87_Sub1) this).anInt9971);
	}

	public int method1298() {
		return anInt9968;
	}

	public int method1315() {
		return anInt9968;
	}

	public int method1316() {
		return ((Class87_Sub1) this).anInt9974;
	}

	Class87_Sub1() {
		/* empty */
	}

	public void method1339() {
		byte[] is = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
		int i = 0;
		if (aByteArray9972 == null) {
			for (int i_119_ = 0; i_119_ < ((Class87_Sub1) this).anInt9973; i_119_++) {
				for (int i_120_ = ((Class87_Sub1) this).anInt9966 - 1; i_120_ >= 0; i_120_--)
					is[i++] = aByteArray9969[i_119_ + i_120_ * ((Class87_Sub1) this).anInt9973];
			}
			aByteArray9969 = is;
		} else {
			byte[] is_121_ = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			for (int i_122_ = 0; i_122_ < ((Class87_Sub1) this).anInt9973; i_122_++) {
				for (int i_123_ = ((Class87_Sub1) this).anInt9966 - 1; i_123_ >= 0; i_123_--) {
					is[i] = aByteArray9969[i_122_ + i_123_ * ((Class87_Sub1) this).anInt9973];
					is_121_[i++] = aByteArray9972[i_122_ + i_123_ * ((Class87_Sub1) this).anInt9973];
				}
			}
			aByteArray9969 = is;
			aByteArray9972 = is_121_;
		}
		int i_124_ = anInt9970;
		anInt9970 = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i_124_;
		i_124_ = ((Class87_Sub1) this).anInt9966;
		((Class87_Sub1) this).anInt9966 = ((Class87_Sub1) this).anInt9973;
		((Class87_Sub1) this).anInt9973 = i_124_;
	}

	public int method1319() {
		return ((Class87_Sub1) this).anInt9971;
	}

	public void method1320() {
		((Class87_Sub1) this).anInt9971 = 0;
		anInt9970 = 0;
		((Class87_Sub1) this).anInt9974 = 0;
		anInt9968 = 0;
	}

	public int method1301(int i, int i_125_) {
		return (anIntArray9967[(aByteArray9969[i + i_125_ * ((Class87_Sub1) this).anInt9973] & 0xff)]);
	}

	public void method1303(int i) {
		int i_126_ = -1;
		if (anIntArray9967.length < 255) {
			for (int i_127_ = 0; i_127_ < anIntArray9967.length; i_127_++) {
				if (anIntArray9967[i_127_] == i) {
					i_126_ = i_127_;
					break;
				}
			}
			if (i_126_ == -1) {
				i_126_ = anIntArray9967.length;
				int[] is = new int[anIntArray9967.length + 1];
				System.arraycopy(anIntArray9967, 0, is, 0, anIntArray9967.length);
				anIntArray9967 = is;
				is[i_126_] = i;
			}
		} else {
			int i_128_ = 2147483647;
			int i_129_ = i >> 16 & 0xff;
			int i_130_ = i >> 8 & 0xff;
			int i_131_ = i & 0xff;
			for (int i_132_ = 0; i_132_ < anIntArray9967.length; i_132_++) {
				int i_133_ = anIntArray9967[i_132_];
				int i_134_ = i_133_ >> 16 & 0xff;
				int i_135_ = i_133_ >> 8 & 0xff;
				int i_136_ = i_133_ & 0xff;
				int i_137_ = i_129_ - i_134_;
				if (i_137_ < 0)
					i_137_ = -i_137_;
				int i_138_ = i_130_ - i_135_;
				if (i_138_ < 0)
					i_138_ = -i_138_;
				int i_139_ = i_131_ - i_136_;
				if (i_139_ < 0)
					i_139_ = -i_139_;
				int i_140_ = i_137_ + i_138_ + i_139_;
				if (i_140_ < i_128_) {
					i_128_ = i_140_;
					i_126_ = i_132_;
				}
			}
		}
		int i_141_ = 0;
		byte[] is = new byte[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
		for (int i_142_ = 0; i_142_ < ((Class87_Sub1) this).anInt9966; i_142_++) {
			for (int i_143_ = 0; i_143_ < ((Class87_Sub1) this).anInt9973; i_143_++) {
				int i_144_ = aByteArray9969[i_141_] & 0xff;
				if (anIntArray9967[i_144_] == 0) {
					if (i_143_ > 0 && (anIntArray9967[aByteArray9969[i_141_ - 1] & 0xff] != 0))
						i_144_ = i_126_;
					else if (i_142_ > 0 && (anIntArray9967[((aByteArray9969[i_141_ - ((Class87_Sub1) this).anInt9973]) & 0xff)]) != 0)
						i_144_ = i_126_;
					else if (i_143_ < ((Class87_Sub1) this).anInt9973 - 1 && (anIntArray9967[aByteArray9969[i_141_ + 1] & 0xff]) != 0)
						i_144_ = i_126_;
					else if (i_142_ < ((Class87_Sub1) this).anInt9966 - 1 && (anIntArray9967[((aByteArray9969[i_141_ + ((Class87_Sub1) this).anInt9973]) & 0xff)]) != 0)
						i_144_ = i_126_;
				}
				is[i_141_++] = (byte) i_144_;
			}
		}
		aByteArray9969 = is;
	}

	public void method1297(int i) {
		int i_145_ = method1283();
		int i_146_ = method1305();
		if (((Class87_Sub1) this).anInt9973 != i_145_ || ((Class87_Sub1) this).anInt9966 != i_146_) {
			int i_147_ = i;
			if (i_147_ > anInt9968)
				i_147_ = anInt9968;
			int i_148_ = i;
			if (i_148_ + anInt9968 + ((Class87_Sub1) this).anInt9973 > i_145_)
				i_148_ = i_145_ - anInt9968 - ((Class87_Sub1) this).anInt9973;
			int i_149_ = i;
			if (i_149_ > anInt9970)
				i_149_ = anInt9970;
			int i_150_ = i;
			if (i_150_ + anInt9970 + ((Class87_Sub1) this).anInt9966 > i_146_)
				i_150_ = i_146_ - anInt9970 - ((Class87_Sub1) this).anInt9966;
			int i_151_ = ((Class87_Sub1) this).anInt9973 + i_147_ + i_148_;
			int i_152_ = ((Class87_Sub1) this).anInt9966 + i_149_ + i_150_;
			byte[] is = new byte[i_151_ * i_152_];
			if (aByteArray9972 == null) {
				for (int i_153_ = 0; i_153_ < ((Class87_Sub1) this).anInt9966; i_153_++) {
					int i_154_ = i_153_ * ((Class87_Sub1) this).anInt9973;
					int i_155_ = (i_153_ + i_149_) * i_151_ + i_147_;
					for (int i_156_ = 0; i_156_ < ((Class87_Sub1) this).anInt9973; i_156_++)
						is[i_155_++] = aByteArray9969[i_154_++];
				}
			} else {
				byte[] is_157_ = new byte[i_151_ * i_152_];
				for (int i_158_ = 0; i_158_ < ((Class87_Sub1) this).anInt9966; i_158_++) {
					int i_159_ = i_158_ * ((Class87_Sub1) this).anInt9973;
					int i_160_ = (i_158_ + i_149_) * i_151_ + i_147_;
					for (int i_161_ = 0; i_161_ < ((Class87_Sub1) this).anInt9973; i_161_++) {
						is_157_[i_160_] = aByteArray9972[i_159_];
						is[i_160_++] = aByteArray9969[i_159_++];
					}
				}
				aByteArray9972 = is_157_;
			}
			anInt9968 -= i_147_;
			anInt9970 -= i_149_;
			((Class87_Sub1) this).anInt9974 -= i_148_;
			((Class87_Sub1) this).anInt9971 -= i_150_;
			((Class87_Sub1) this).anInt9973 = i_151_;
			((Class87_Sub1) this).anInt9966 = i_152_;
			aByteArray9969 = is;
		}
	}

	public void method1324(int i) {
		int i_162_ = -1;
		if (anIntArray9967.length < 255) {
			for (int i_163_ = 0; i_163_ < anIntArray9967.length; i_163_++) {
				if (anIntArray9967[i_163_] == i) {
					i_162_ = i_163_;
					break;
				}
			}
			if (i_162_ == -1) {
				i_162_ = anIntArray9967.length;
				int[] is = new int[anIntArray9967.length + 1];
				System.arraycopy(anIntArray9967, 0, is, 0, anIntArray9967.length);
				anIntArray9967 = is;
				is[i_162_] = i;
			}
		} else {
			int i_164_ = 2147483647;
			int i_165_ = i >> 16 & 0xff;
			int i_166_ = i >> 8 & 0xff;
			int i_167_ = i & 0xff;
			for (int i_168_ = 0; i_168_ < anIntArray9967.length; i_168_++) {
				int i_169_ = anIntArray9967[i_168_];
				int i_170_ = i_169_ >> 16 & 0xff;
				int i_171_ = i_169_ >> 8 & 0xff;
				int i_172_ = i_169_ & 0xff;
				int i_173_ = i_165_ - i_170_;
				if (i_173_ < 0)
					i_173_ = -i_173_;
				int i_174_ = i_166_ - i_171_;
				if (i_174_ < 0)
					i_174_ = -i_174_;
				int i_175_ = i_167_ - i_172_;
				if (i_175_ < 0)
					i_175_ = -i_175_;
				int i_176_ = i_173_ + i_174_ + i_175_;
				if (i_176_ < i_164_) {
					i_164_ = i_176_;
					i_162_ = i_168_;
				}
			}
		}
		for (int i_177_ = ((Class87_Sub1) this).anInt9966 - 1; i_177_ > 0; i_177_--) {
			int i_178_ = i_177_ * ((Class87_Sub1) this).anInt9973;
			for (int i_179_ = ((Class87_Sub1) this).anInt9973 - 1; i_179_ > 0; i_179_--) {
				if (anIntArray9967[aByteArray9969[i_179_ + i_178_] & 0xff] == 0 && (anIntArray9967[aByteArray9969[(i_179_ + i_178_ - 1 - (((Class87_Sub1) this).anInt9973))] & 0xff] != 0))
					aByteArray9969[i_179_ + i_178_] = (byte) i_162_;
			}
		}
	}

	public void method1323() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_180_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_181_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_180_ < i_181_; i_180_++) {
					i_181_--;
					byte i_182_ = is[i_180_];
					is[i_180_] = is[i_181_];
					is[i_181_] = i_182_;
				}
			}
		} else {
			byte[] is_183_ = aByteArray9972;
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_184_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_185_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_184_ < i_185_; i_184_++) {
					i_185_--;
					byte i_186_ = is[i_184_];
					is[i_184_] = is[i_185_];
					is[i_185_] = i_186_;
					i_186_ = is_183_[i_184_];
					is_183_[i_184_] = is_183_[i_185_];
					is_183_[i_185_] = i_186_;
				}
			}
		}
		int i = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i;
	}

	public int method1288() {
		return anInt9970;
	}

	public void method1327() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_187_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_188_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_187_ < i_188_; i_187_++) {
					i_188_--;
					byte i_189_ = is[i_187_];
					is[i_187_] = is[i_188_];
					is[i_188_] = i_189_;
				}
			}
		} else {
			byte[] is_190_ = aByteArray9972;
			for (int i = ((Class87_Sub1) this).anInt9966 - 1; i >= 0; i--) {
				int i_191_ = i * ((Class87_Sub1) this).anInt9973;
				for (int i_192_ = (i + 1) * ((Class87_Sub1) this).anInt9973; i_191_ < i_192_; i_191_++) {
					i_192_--;
					byte i_193_ = is[i_191_];
					is[i_191_] = is[i_192_];
					is[i_192_] = i_193_;
					i_193_ = is_190_[i_191_];
					is_190_[i_191_] = is_190_[i_192_];
					is_190_[i_192_] = i_193_;
				}
			}
		}
		int i = anInt9968;
		anInt9968 = ((Class87_Sub1) this).anInt9974;
		((Class87_Sub1) this).anInt9974 = i;
	}

	public int method1309() {
		return ((Class87_Sub1) this).anInt9973;
	}

	public int[] method1321(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_194_ = 0; i_194_ < ((Class87_Sub1) this).anInt9966; i_194_++) {
					int i_195_ = i_194_ * ((Class87_Sub1) this).anInt9973;
					int i_196_ = anInt9968 + (i_194_ + anInt9970) * i;
					for (int i_197_ = 0; i_197_ < ((Class87_Sub1) this).anInt9973; i_197_++) {
						is[i_196_++] = (aByteArray9972[i_195_] << 24 | (anIntArray9967[aByteArray9969[i_195_] & 0xff]));
						i_195_++;
					}
				}
			} else {
				for (int i_198_ = 0; i_198_ < ((Class87_Sub1) this).anInt9966; i_198_++) {
					int i_199_ = i_198_ * ((Class87_Sub1) this).anInt9973;
					int i_200_ = anInt9968 + (i_198_ + anInt9970) * i;
					for (int i_201_ = 0; i_201_ < ((Class87_Sub1) this).anInt9973; i_201_++) {
						int i_202_ = anIntArray9967[aByteArray9969[i_199_++] & 0xff];
						if (i_202_ != 0)
							is[i_200_++] = ~0xffffff | i_202_;
						else
							is[i_200_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_203_ = 0;
			if (aByteArray9972 != null) {
				for (int i_204_ = 0; i_204_ < ((Class87_Sub1) this).anInt9966; i_204_++) {
					for (int i_205_ = 0; i_205_ < ((Class87_Sub1) this).anInt9973; i_205_++) {
						is[i_203_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_206_ = 0; i_206_ < ((Class87_Sub1) this).anInt9966; i_206_++) {
					for (int i_207_ = 0; i_207_ < ((Class87_Sub1) this).anInt9973; i_207_++) {
						int i_208_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_203_++] = i_208_ != 0 ? ~0xffffff | i_208_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method1333(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_209_ = 0; i_209_ < ((Class87_Sub1) this).anInt9966; i_209_++) {
					int i_210_ = i_209_ * ((Class87_Sub1) this).anInt9973;
					int i_211_ = anInt9968 + (i_209_ + anInt9970) * i;
					for (int i_212_ = 0; i_212_ < ((Class87_Sub1) this).anInt9973; i_212_++) {
						is[i_211_++] = (aByteArray9972[i_210_] << 24 | (anIntArray9967[aByteArray9969[i_210_] & 0xff]));
						i_210_++;
					}
				}
			} else {
				for (int i_213_ = 0; i_213_ < ((Class87_Sub1) this).anInt9966; i_213_++) {
					int i_214_ = i_213_ * ((Class87_Sub1) this).anInt9973;
					int i_215_ = anInt9968 + (i_213_ + anInt9970) * i;
					for (int i_216_ = 0; i_216_ < ((Class87_Sub1) this).anInt9973; i_216_++) {
						int i_217_ = anIntArray9967[aByteArray9969[i_214_++] & 0xff];
						if (i_217_ != 0)
							is[i_215_++] = ~0xffffff | i_217_;
						else
							is[i_215_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_218_ = 0;
			if (aByteArray9972 != null) {
				for (int i_219_ = 0; i_219_ < ((Class87_Sub1) this).anInt9966; i_219_++) {
					for (int i_220_ = 0; i_220_ < ((Class87_Sub1) this).anInt9973; i_220_++) {
						is[i_218_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_221_ = 0; i_221_ < ((Class87_Sub1) this).anInt9966; i_221_++) {
					for (int i_222_ = 0; i_222_ < ((Class87_Sub1) this).anInt9973; i_222_++) {
						int i_223_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_218_++] = i_223_ != 0 ? ~0xffffff | i_223_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method1331(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_224_ = 0; i_224_ < ((Class87_Sub1) this).anInt9966; i_224_++) {
					int i_225_ = i_224_ * ((Class87_Sub1) this).anInt9973;
					int i_226_ = anInt9968 + (i_224_ + anInt9970) * i;
					for (int i_227_ = 0; i_227_ < ((Class87_Sub1) this).anInt9973; i_227_++) {
						is[i_226_++] = (aByteArray9972[i_225_] << 24 | (anIntArray9967[aByteArray9969[i_225_] & 0xff]));
						i_225_++;
					}
				}
			} else {
				for (int i_228_ = 0; i_228_ < ((Class87_Sub1) this).anInt9966; i_228_++) {
					int i_229_ = i_228_ * ((Class87_Sub1) this).anInt9973;
					int i_230_ = anInt9968 + (i_228_ + anInt9970) * i;
					for (int i_231_ = 0; i_231_ < ((Class87_Sub1) this).anInt9973; i_231_++) {
						int i_232_ = anIntArray9967[aByteArray9969[i_229_++] & 0xff];
						if (i_232_ != 0)
							is[i_230_++] = ~0xffffff | i_232_;
						else
							is[i_230_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_233_ = 0;
			if (aByteArray9972 != null) {
				for (int i_234_ = 0; i_234_ < ((Class87_Sub1) this).anInt9966; i_234_++) {
					for (int i_235_ = 0; i_235_ < ((Class87_Sub1) this).anInt9973; i_235_++) {
						is[i_233_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_236_ = 0; i_236_ < ((Class87_Sub1) this).anInt9966; i_236_++) {
					for (int i_237_ = 0; i_237_ < ((Class87_Sub1) this).anInt9973; i_237_++) {
						int i_238_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_233_++] = i_238_ != 0 ? ~0xffffff | i_238_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method1332(boolean bool) {
		int[] is;
		if (bool) {
			int i = method1283();
			is = new int[i * method1305()];
			if (aByteArray9972 != null) {
				for (int i_239_ = 0; i_239_ < ((Class87_Sub1) this).anInt9966; i_239_++) {
					int i_240_ = i_239_ * ((Class87_Sub1) this).anInt9973;
					int i_241_ = anInt9968 + (i_239_ + anInt9970) * i;
					for (int i_242_ = 0; i_242_ < ((Class87_Sub1) this).anInt9973; i_242_++) {
						is[i_241_++] = (aByteArray9972[i_240_] << 24 | (anIntArray9967[aByteArray9969[i_240_] & 0xff]));
						i_240_++;
					}
				}
			} else {
				for (int i_243_ = 0; i_243_ < ((Class87_Sub1) this).anInt9966; i_243_++) {
					int i_244_ = i_243_ * ((Class87_Sub1) this).anInt9973;
					int i_245_ = anInt9968 + (i_243_ + anInt9970) * i;
					for (int i_246_ = 0; i_246_ < ((Class87_Sub1) this).anInt9973; i_246_++) {
						int i_247_ = anIntArray9967[aByteArray9969[i_244_++] & 0xff];
						if (i_247_ != 0)
							is[i_245_++] = ~0xffffff | i_247_;
						else
							is[i_245_++] = 0;
					}
				}
			}
		} else {
			is = new int[(((Class87_Sub1) this).anInt9973 * ((Class87_Sub1) this).anInt9966)];
			int i = 0;
			int i_248_ = 0;
			if (aByteArray9972 != null) {
				for (int i_249_ = 0; i_249_ < ((Class87_Sub1) this).anInt9966; i_249_++) {
					for (int i_250_ = 0; i_250_ < ((Class87_Sub1) this).anInt9973; i_250_++) {
						is[i_248_++] = (aByteArray9972[i] << 24 | anIntArray9967[aByteArray9969[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_251_ = 0; i_251_ < ((Class87_Sub1) this).anInt9966; i_251_++) {
					for (int i_252_ = 0; i_252_ < ((Class87_Sub1) this).anInt9973; i_252_++) {
						int i_253_ = anIntArray9967[aByteArray9969[i++] & 0xff];
						is[i_248_++] = i_253_ != 0 ? ~0xffffff | i_253_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method1291(int i, int i_254_, int i_255_) {
		for (int i_256_ = 1; i_256_ < anIntArray9967.length; i_256_++) {
			if (anIntArray9967[i_256_] != 1 && anIntArray9967[i_256_] != 16711935) {
				int i_257_ = anIntArray9967[i_256_] >> 16 & 0xff;
				i_257_ += i;
				if (i_257_ < 0)
					i_257_ = 0;
				else if (i_257_ > 255)
					i_257_ = 255;
				int i_258_ = anIntArray9967[i_256_] >> 8 & 0xff;
				i_258_ += i_254_;
				if (i_258_ < 0)
					i_258_ = 0;
				else if (i_258_ > 255)
					i_258_ = 255;
				int i_259_ = anIntArray9967[i_256_] >> 0 & 0xff;
				i_259_ += i_255_;
				if (i_259_ < 0)
					i_259_ = 0;
				else if (i_259_ > 255)
					i_259_ = 255;
				anIntArray9967[i_256_] = i_257_ << 16 | i_258_ << 8 | i_259_;
			}
		}
	}

	public int method1286() {
		return anInt9968;
	}

	public int method1335(int i, int i_260_) {
		return (anIntArray9967[(aByteArray9969[i + i_260_ * ((Class87_Sub1) this).anInt9973] & 0xff)]);
	}

	public int method1336() {
		return ((Class87_Sub1) this).anInt9966;
	}

	public void method1314() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_261_ = i * ((Class87_Sub1) this).anInt9973;
				int i_262_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_263_ = -((Class87_Sub1) this).anInt9973; i_263_ < 0; i_263_++) {
					byte i_264_ = is[i_261_];
					is[i_261_] = is[i_262_];
					is[i_262_] = i_264_;
					i_261_++;
					i_262_++;
				}
			}
		} else {
			byte[] is_265_ = aByteArray9972;
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_266_ = i * ((Class87_Sub1) this).anInt9973;
				int i_267_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_268_ = -((Class87_Sub1) this).anInt9973; i_268_ < 0; i_268_++) {
					byte i_269_ = is[i_266_];
					is[i_266_] = is[i_267_];
					is[i_267_] = i_269_;
					i_269_ = is_265_[i_266_];
					is_265_[i_266_] = is_265_[i_267_];
					is_265_[i_267_] = i_269_;
					i_266_++;
					i_267_++;
				}
			}
		}
		int i = anInt9970;
		anInt9970 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = i;
	}

	public void method1337() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_270_ = i * ((Class87_Sub1) this).anInt9973;
				int i_271_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_272_ = -((Class87_Sub1) this).anInt9973; i_272_ < 0; i_272_++) {
					byte i_273_ = is[i_270_];
					is[i_270_] = is[i_271_];
					is[i_271_] = i_273_;
					i_270_++;
					i_271_++;
				}
			}
		} else {
			byte[] is_274_ = aByteArray9972;
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_275_ = i * ((Class87_Sub1) this).anInt9973;
				int i_276_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_277_ = -((Class87_Sub1) this).anInt9973; i_277_ < 0; i_277_++) {
					byte i_278_ = is[i_275_];
					is[i_275_] = is[i_276_];
					is[i_276_] = i_278_;
					i_278_ = is_274_[i_275_];
					is_274_[i_275_] = is_274_[i_276_];
					is_274_[i_276_] = i_278_;
					i_275_++;
					i_276_++;
				}
			}
		}
		int i = anInt9970;
		anInt9970 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = i;
	}

	public void method1338() {
		byte[] is = aByteArray9969;
		if (aByteArray9972 == null) {
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_279_ = i * ((Class87_Sub1) this).anInt9973;
				int i_280_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_281_ = -((Class87_Sub1) this).anInt9973; i_281_ < 0; i_281_++) {
					byte i_282_ = is[i_279_];
					is[i_279_] = is[i_280_];
					is[i_280_] = i_282_;
					i_279_++;
					i_280_++;
				}
			}
		} else {
			byte[] is_283_ = aByteArray9972;
			for (int i = (((Class87_Sub1) this).anInt9966 >> 1) - 1; i >= 0; i--) {
				int i_284_ = i * ((Class87_Sub1) this).anInt9973;
				int i_285_ = ((((Class87_Sub1) this).anInt9966 - i - 1) * ((Class87_Sub1) this).anInt9973);
				for (int i_286_ = -((Class87_Sub1) this).anInt9973; i_286_ < 0; i_286_++) {
					byte i_287_ = is[i_284_];
					is[i_284_] = is[i_285_];
					is[i_285_] = i_287_;
					i_287_ = is_283_[i_284_];
					is_283_[i_284_] = is_283_[i_285_];
					is_283_[i_285_] = i_287_;
					i_284_++;
					i_285_++;
				}
			}
		}
		int i = anInt9970;
		anInt9970 = ((Class87_Sub1) this).anInt9971;
		((Class87_Sub1) this).anInt9971 = i;
	}

	public void method1295(int i) {
		int i_288_ = -1;
		if (anIntArray9967.length < 255) {
			for (int i_289_ = 0; i_289_ < anIntArray9967.length; i_289_++) {
				if (anIntArray9967[i_289_] == i) {
					i_288_ = i_289_;
					break;
				}
			}
			if (i_288_ == -1) {
				i_288_ = anIntArray9967.length;
				int[] is = new int[anIntArray9967.length + 1];
				System.arraycopy(anIntArray9967, 0, is, 0, anIntArray9967.length);
				anIntArray9967 = is;
				is[i_288_] = i;
			}
		} else {
			int i_290_ = 2147483647;
			int i_291_ = i >> 16 & 0xff;
			int i_292_ = i >> 8 & 0xff;
			int i_293_ = i & 0xff;
			for (int i_294_ = 0; i_294_ < anIntArray9967.length; i_294_++) {
				int i_295_ = anIntArray9967[i_294_];
				int i_296_ = i_295_ >> 16 & 0xff;
				int i_297_ = i_295_ >> 8 & 0xff;
				int i_298_ = i_295_ & 0xff;
				int i_299_ = i_291_ - i_296_;
				if (i_299_ < 0)
					i_299_ = -i_299_;
				int i_300_ = i_292_ - i_297_;
				if (i_300_ < 0)
					i_300_ = -i_300_;
				int i_301_ = i_293_ - i_298_;
				if (i_301_ < 0)
					i_301_ = -i_301_;
				int i_302_ = i_299_ + i_300_ + i_301_;
				if (i_302_ < i_290_) {
					i_290_ = i_302_;
					i_288_ = i_294_;
				}
			}
		}
		for (int i_303_ = ((Class87_Sub1) this).anInt9966 - 1; i_303_ > 0; i_303_--) {
			int i_304_ = i_303_ * ((Class87_Sub1) this).anInt9973;
			for (int i_305_ = ((Class87_Sub1) this).anInt9973 - 1; i_305_ > 0; i_305_--) {
				if (anIntArray9967[aByteArray9969[i_305_ + i_304_] & 0xff] == 0 && (anIntArray9967[aByteArray9969[(i_305_ + i_304_ - 1 - (((Class87_Sub1) this).anInt9973))] & 0xff] != 0))
					aByteArray9969[i_305_ + i_304_] = (byte) i_288_;
			}
		}
	}
}
