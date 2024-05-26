package game;

/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15 {
	int anInt124;
	public int anInt125;
	public static int anInt126;

	public boolean method642(int i, int i_0_, int i_1_) {
		int i_2_ = 120781313 * ((Class15) this).anInt124;
		if (i == anInt125 * 452190977 && 0 == ((Class15) this).anInt124 * 120781313)
			return false;
		boolean bool;
		if (0 == 120781313 * ((Class15) this).anInt124) {
			if (i > 452190977 * anInt125 && i <= i_0_ + 452190977 * anInt125 || (i < anInt125 * 452190977 && i >= 452190977 * anInt125 - i_0_)) {
				anInt125 = -447406847 * i;
				return false;
			}
			bool = true;
		} else if (120781313 * ((Class15) this).anInt124 > 0 && i > anInt125 * 452190977) {
			int i_3_ = (120781313 * ((Class15) this).anInt124 * (((Class15) this).anInt124 * 120781313) / (2 * i_0_));
			int i_4_ = 452190977 * anInt125 + i_3_;
			if (i_4_ >= i || i_4_ < 452190977 * anInt125)
				bool = false;
			else
				bool = true;
		} else if (120781313 * ((Class15) this).anInt124 < 0 && i < anInt125 * 452190977) {
			int i_5_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (i_0_ * 2));
			int i_6_ = 452190977 * anInt125 - i_5_;
			if (i_6_ <= i || i_6_ > anInt125 * 452190977)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 452190977 * anInt125) {
				((Class15) this).anInt124 += i_0_ * 1827735041;
				if (i_1_ != 0 && 120781313 * ((Class15) this).anInt124 > i_1_)
					((Class15) this).anInt124 = i_1_ * 1827735041;
			} else {
				((Class15) this).anInt124 -= i_0_ * 1827735041;
				if (0 != i_1_ && ((Class15) this).anInt124 * 120781313 < -i_1_)
					((Class15) this).anInt124 = 1827735041 * -i_1_;
			}
			if (i_2_ != ((Class15) this).anInt124 * 120781313) {
				int i_7_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (2 * i_0_));
				if (i > 452190977 * anInt125) {
					if (i_7_ + 452190977 * anInt125 > i)
						((Class15) this).anInt124 = 1827735041 * i_2_;
				} else if (i < 452190977 * anInt125 && 452190977 * anInt125 - i_7_ < i)
					((Class15) this).anInt124 = 1827735041 * i_2_;
			}
		} else if (120781313 * ((Class15) this).anInt124 > 0) {
			((Class15) this).anInt124 -= 1827735041 * i_0_;
			if (120781313 * ((Class15) this).anInt124 < 0)
				((Class15) this).anInt124 = 0;
		} else {
			((Class15) this).anInt124 += i_0_ * 1827735041;
			if (120781313 * ((Class15) this).anInt124 > 0)
				((Class15) this).anInt124 = 0;
		}
		anInt125 += -447406847 * (i_2_ + 120781313 * ((Class15) this).anInt124 >> 1);
		return bool;
	}

	public boolean method643(int i, int i_8_, int i_9_, byte i_10_) {
		int i_11_ = 120781313 * ((Class15) this).anInt124;
		if (i == anInt125 * 452190977 && 0 == ((Class15) this).anInt124 * 120781313)
			return false;
		boolean bool;
		if (0 == 120781313 * ((Class15) this).anInt124) {
			if (i > 452190977 * anInt125 && i <= i_8_ + 452190977 * anInt125 || (i < anInt125 * 452190977 && i >= 452190977 * anInt125 - i_8_)) {
				anInt125 = -447406847 * i;
				return false;
			}
			bool = true;
		} else if (120781313 * ((Class15) this).anInt124 > 0 && i > anInt125 * 452190977) {
			int i_12_ = (120781313 * ((Class15) this).anInt124 * (((Class15) this).anInt124 * 120781313) / (2 * i_8_));
			int i_13_ = 452190977 * anInt125 + i_12_;
			if (i_13_ >= i || i_13_ < 452190977 * anInt125)
				bool = false;
			else
				bool = true;
		} else if (120781313 * ((Class15) this).anInt124 < 0 && i < anInt125 * 452190977) {
			int i_14_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (i_8_ * 2));
			int i_15_ = 452190977 * anInt125 - i_14_;
			if (i_15_ <= i || i_15_ > anInt125 * 452190977)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 452190977 * anInt125) {
				((Class15) this).anInt124 += i_8_ * 1827735041;
				if (i_9_ != 0 && 120781313 * ((Class15) this).anInt124 > i_9_)
					((Class15) this).anInt124 = i_9_ * 1827735041;
			} else {
				((Class15) this).anInt124 -= i_8_ * 1827735041;
				if (0 != i_9_ && ((Class15) this).anInt124 * 120781313 < -i_9_)
					((Class15) this).anInt124 = 1827735041 * -i_9_;
			}
			if (i_11_ != ((Class15) this).anInt124 * 120781313) {
				int i_16_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (2 * i_8_));
				if (i > 452190977 * anInt125) {
					if (i_16_ + 452190977 * anInt125 > i)
						((Class15) this).anInt124 = 1827735041 * i_11_;
				} else if (i < 452190977 * anInt125 && 452190977 * anInt125 - i_16_ < i)
					((Class15) this).anInt124 = 1827735041 * i_11_;
			}
		} else if (120781313 * ((Class15) this).anInt124 > 0) {
			((Class15) this).anInt124 -= 1827735041 * i_8_;
			if (120781313 * ((Class15) this).anInt124 < 0)
				((Class15) this).anInt124 = 0;
		} else {
			((Class15) this).anInt124 += i_8_ * 1827735041;
			if (120781313 * ((Class15) this).anInt124 > 0)
				((Class15) this).anInt124 = 0;
		}
		anInt125 += -447406847 * (i_11_ + 120781313 * ((Class15) this).anInt124 >> 1);
		return bool;
	}

	public void method644(int i, byte i_17_) {
		anInt125 = i * -447406847;
		((Class15) this).anInt124 = 0;
	}

	public int method645(int i) {
		return anInt125 * 452190977 & 0x3fff;
	}

	public boolean method646(int i, int i_18_, int i_19_) {
		int i_20_ = 120781313 * ((Class15) this).anInt124;
		if (i == anInt125 * 452190977 && 0 == ((Class15) this).anInt124 * 120781313)
			return false;
		boolean bool;
		if (0 == 120781313 * ((Class15) this).anInt124) {
			if (i > 452190977 * anInt125 && i <= i_18_ + 452190977 * anInt125 || (i < anInt125 * 452190977 && i >= 452190977 * anInt125 - i_18_)) {
				anInt125 = -447406847 * i;
				return false;
			}
			bool = true;
		} else if (120781313 * ((Class15) this).anInt124 > 0 && i > anInt125 * 452190977) {
			int i_21_ = (120781313 * ((Class15) this).anInt124 * (((Class15) this).anInt124 * 120781313) / (2 * i_18_));
			int i_22_ = 452190977 * anInt125 + i_21_;
			if (i_22_ >= i || i_22_ < 452190977 * anInt125)
				bool = false;
			else
				bool = true;
		} else if (120781313 * ((Class15) this).anInt124 < 0 && i < anInt125 * 452190977) {
			int i_23_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (i_18_ * 2));
			int i_24_ = 452190977 * anInt125 - i_23_;
			if (i_24_ <= i || i_24_ > anInt125 * 452190977)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 452190977 * anInt125) {
				((Class15) this).anInt124 += i_18_ * 1827735041;
				if (i_19_ != 0 && 120781313 * ((Class15) this).anInt124 > i_19_)
					((Class15) this).anInt124 = i_19_ * 1827735041;
			} else {
				((Class15) this).anInt124 -= i_18_ * 1827735041;
				if (0 != i_19_ && ((Class15) this).anInt124 * 120781313 < -i_19_)
					((Class15) this).anInt124 = 1827735041 * -i_19_;
			}
			if (i_20_ != ((Class15) this).anInt124 * 120781313) {
				int i_25_ = (((Class15) this).anInt124 * 120781313 * (120781313 * ((Class15) this).anInt124) / (2 * i_18_));
				if (i > 452190977 * anInt125) {
					if (i_25_ + 452190977 * anInt125 > i)
						((Class15) this).anInt124 = 1827735041 * i_20_;
				} else if (i < 452190977 * anInt125 && 452190977 * anInt125 - i_25_ < i)
					((Class15) this).anInt124 = 1827735041 * i_20_;
			}
		} else if (120781313 * ((Class15) this).anInt124 > 0) {
			((Class15) this).anInt124 -= 1827735041 * i_18_;
			if (120781313 * ((Class15) this).anInt124 < 0)
				((Class15) this).anInt124 = 0;
		} else {
			((Class15) this).anInt124 += i_18_ * 1827735041;
			if (120781313 * ((Class15) this).anInt124 > 0)
				((Class15) this).anInt124 = 0;
		}
		anInt125 += -447406847 * (i_20_ + 120781313 * ((Class15) this).anInt124 >> 1);
		return bool;
	}

	public void method647(byte i) {
		anInt125 = (anInt125 * 452190977 & 0x3fff) * -447406847;
	}

	public int method648() {
		return anInt125 * 452190977 & 0x3fff;
	}

	public int method649() {
		return anInt125 * 452190977 & 0x3fff;
	}

	public void method650() {
		anInt125 = (anInt125 * 452190977 & 0x3fff) * -447406847;
	}

	public void method651() {
		anInt125 = (anInt125 * 452190977 & 0x3fff) * -447406847;
	}

	static int method652(int i) {
		if (client.aClass73_8770 == null) {
			if (!Class25.aBool165) {
				if (Class586.aClass502_7779.aBool5550) {
					if (Class580.aClass572_Sub12_Sub10_7702 != null)
						return (762395871 * (((Class572_Sub12_Sub10) Class580.aClass572_Sub12_Sub10_7702).anInt11396));
				} else if (Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 != null)
					return (762395871 * ((Class572_Sub12_Sub10) (Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311)).anInt11396);
			} else {
				Class284 class284 = VarBitDefinition.method5230(-1468141001);
				int i_26_ = Class26.aClass564_216.method6657((short) 5236);
				int i_27_ = Class26.aClass564_216.method6658((byte) -52);
				if (!Class25.aBool166) {
					if (i_26_ > Class442.anInt5133 * -699022169 && i_26_ < (-1568261905 * Class25.anInt180 + Class442.anInt5133 * -699022169)) {
						int i_28_ = -1;
						for (int i_29_ = 0; i_29_ < 357782167 * Class25.anInt172; i_29_++) {
							if (Class25.aBool191) {
								int i_30_ = (-801958417 * class284.anInt3412 + (20 + (Class202_Sub1.anInt9650 * 1113238055)) + 1 + ((357782167 * Class25.anInt172 - 1 - i_29_) * (-211596715 * Class25.anInt162)));
								if (i_27_ > (i_30_ - -801958417 * class284.anInt3412 - 1) && i_27_ < (-2086019023 * class284.anInt3413) + i_30_)
									i_28_ = i_29_;
							} else {
								int i_31_ = (((357782167 * Class25.anInt172 - 1 - i_29_) * (-211596715 * Class25.anInt162)) + (1113238055 * Class202_Sub1.anInt9650 + 31));
								if (i_27_ > (i_31_ - -801958417 * class284.anInt3412 - 1) && i_27_ < (-2086019023 * class284.anInt3413) + i_31_)
									i_28_ = i_29_;
							}
						}
						if (-1 != i_28_) {
							int i_32_ = 0;
							Class656 class656 = new Class656(Class25.aClass675_174);
							for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) class656.method7715((byte) 0)); null != class572_sub12_sub10; class572_sub12_sub10 = ((Class572_Sub12_Sub10) class656.next())) {
								if (i_32_++ == i_28_)
									return 762395871 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11396);
							}
						}
					}
				} else if (i_26_ > Class442.anInt5133 * -699022169 && i_26_ < (Class442.anInt5133 * -699022169 + -1568261905 * Class25.anInt180)) {
					int i_33_ = -1;
					for (int i_34_ = 0; i_34_ < Class25.anInt173 * 234065809; i_34_++) {
						if (Class25.aBool191) {
							int i_35_ = (i_34_ * (Class25.anInt162 * -211596715) + (1 + (-801958417 * class284.anInt3412 + (20 + (Class202_Sub1.anInt9650 * 1113238055)))));
							if ((i_27_ > i_35_ - class284.anInt3412 * -801958417 - 1) && i_27_ < i_35_ + (class284.anInt3413 * -2086019023))
								i_33_ = i_34_;
						} else {
							int i_36_ = (-211596715 * Class25.anInt162 * i_34_ + (1113238055 * Class202_Sub1.anInt9650 + 31));
							if ((i_27_ > i_36_ - class284.anInt3412 * -801958417 - 1) && i_27_ < (class284.anInt3413 * -2086019023 + i_36_))
								i_33_ = i_34_;
						}
					}
					if (-1 != i_33_) {
						int i_37_ = 0;
						Class677 class677 = new Class677(Class25.aClass664_176);
						for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) class677.method7979(-209327294)); null != class572_sub12_sub19; class572_sub12_sub19 = (Class572_Sub12_Sub19) class677.next()) {
							if (i_37_++ == i_33_)
								return 762395871 * (((Class572_Sub12_Sub10) (Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)).anInt11396);
						}
					}
				} else if (Class25.aClass572_Sub12_Sub19_178 != null && i_26_ > -1647258031 * Class310.anInt3663 && i_26_ < (Class2.anInt20 * 673354219 + -1647258031 * Class310.anInt3663)) {
					int i_38_ = -1;
					for (int i_39_ = 0; i_39_ < (((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).anInt11482) * 944917463; i_39_++) {
						if (Class25.aBool191) {
							int i_40_ = (i_39_ * (-211596715 * Class25.anInt162) + (1 + (class284.anInt3412 * -801958417 + (Class463.anInt5234 * -1069919945 + 20))));
							if ((i_27_ > i_40_ - class284.anInt3412 * -801958417 - 1) && i_27_ < i_40_ + (class284.anInt3413 * -2086019023))
								i_38_ = i_39_;
						} else {
							int i_41_ = (Class25.anInt162 * -211596715 * i_39_ + (Class463.anInt5234 * -1069919945 + 31));
							if ((i_27_ > i_41_ - class284.anInt3412 * -801958417 - 1) && i_27_ < (class284.anInt3413 * -2086019023 + i_41_))
								i_38_ = i_39_;
						}
					}
					if (i_38_ != -1) {
						int i_42_ = 0;
						Class677 class677 = new Class677(((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).aClass664_11480);
						for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) class677.method7979(1483815886)); null != class572_sub12_sub10; class572_sub12_sub10 = (Class572_Sub12_Sub10) class677.next()) {
							if (i_42_++ == i_38_)
								return (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11396 * 762395871);
						}
					}
				}
			}
		}
		return -1;
	}

	static final void method653(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class384.method4656(class73, class441, 1037846520);
	}

	static void method654(int i) {
		if (1545763299 * client.anInt8645 < 0) {
			Class284 class284 = VarBitDefinition.method5230(633253923);
			if (!Class25.aBool165)
				Class25.aBool166 = ((Class25.anInt193 * 1779724825 != -1 && (Class25.anInt172 * 357782167 >= 1779724825 * Class25.anInt193)) || (((Class25.aBool191 ? 26 : 22) + 357782167 * Class25.anInt172 * (Class25.anInt162 * -211596715)) > Class584.anInt7739 * -530390519));
			Class25.aClass675_203.method7918(-605014500);
			Class25.aClass675_177.method7918(-434094524);
			for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(356568978))) {
				int i_43_ = (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 * -44467871);
				if (i_43_ < 1000) {
					class572_sub12_sub10.method6794((byte) 78);
					if (59 == i_43_ || i_43_ == 2 || i_43_ == 8 || 17 == i_43_ || 15 == i_43_ || i_43_ == 16 || i_43_ == 58)
						Class25.aClass675_177.method7940(class572_sub12_sub10, -1888017164);
					else
						Class25.aClass675_203.method7940(class572_sub12_sub10, -1531674573);
				}
			}
			Class25.aClass675_203.method7923(Class25.aClass675_174, 1861431349);
			Class25.aClass675_177.method7923(Class25.aClass675_174, 1994321200);
			if (Class25.anInt172 * 357782167 > 1) {
				if (Class572_Sub30.method8665((short) 8597) && Class25.anInt172 * 357782167 > 2)
					Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 = ((Class572_Sub12_Sub10) (Class25.aClass675_174.aClass572_8547.aClass572_6431.aClass572_6431));
				else
					Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 = (Class572_Sub12_Sub10) (Class25.aClass675_174.aClass572_8547.aClass572_6431);
				Class88.aClass572_Sub12_Sub10_1224 = ((Class572_Sub12_Sub10) Class25.aClass675_174.aClass572_8547.aClass572_6431);
				if (Class25.anInt172 * 357782167 > 2)
					Class580.aClass572_Sub12_Sub10_7702 = ((Class572_Sub12_Sub10) Class88.aClass572_Sub12_Sub10_1224.aClass572_6431);
				else
					Class580.aClass572_Sub12_Sub10_7702 = null;
			} else {
				Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 = null;
				Class88.aClass572_Sub12_Sub10_1224 = null;
				Class580.aClass572_Sub12_Sub10_7702 = null;
			}
			Class572_Sub13 class572_sub13 = (Class572_Sub13) client.aClass675_8745.method7932((byte) 50);
			int i_44_;
			int i_45_;
			if (null != class572_sub13) {
				i_44_ = class572_sub13.method8417(1636759235);
				i_45_ = class572_sub13.method8425(-1749784373);
			} else {
				i_44_ = Class26.aClass564_216.method6657((short) -8212);
				i_45_ = Class26.aClass564_216.method6658((byte) -102);
			}
			if (Class25.aBool165) {
				if (Class106.method2056((Class586.aClass502_7779.anInterface57_5552), class572_sub13, (byte) -124)) {
					if (Class25.aClass572_Sub12_Sub19_178 != null && i_44_ >= -1647258031 * Class310.anInt3663 && i_44_ <= (Class310.anInt3663 * -1647258031 + 673354219 * Class2.anInt20) && i_45_ >= -1069919945 * Class463.anInt5234 && i_45_ <= (Class463.anInt5234 * -1069919945 + 491353989 * Class612.anInt7989)) {
						int i_46_ = -1;
						for (int i_47_ = 0; i_47_ < (944917463 * (((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).anInt11482)); i_47_++) {
							if (Class25.aBool191) {
								int i_48_ = (-211596715 * Class25.anInt162 * i_47_ + (1 + (-801958417 * class284.anInt3412 + (20 + (Class463.anInt5234 * -1069919945)))));
								if (i_45_ > (i_48_ - class284.anInt3412 * -801958417 - 1) && i_45_ < (-2086019023 * class284.anInt3413) + i_48_)
									i_46_ = i_47_;
							} else {
								int i_49_ = (Class463.anInt5234 * -1069919945 + 31 + (Class25.anInt162 * -211596715 * i_47_));
								if (i_45_ > i_49_ - 13 && i_45_ < i_49_ + 3)
									i_46_ = i_47_;
							}
						}
						if (-1 != i_46_) {
							int i_50_ = 0;
							Class677 class677 = new Class677(((Class572_Sub12_Sub19) (Class25.aClass572_Sub12_Sub19_178)).aClass664_11480);
							for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) class677.method7979(-14315084)); null != class572_sub12_sub10; class572_sub12_sub10 = ((Class572_Sub12_Sub10) class677.next())) {
								if (i_50_ == i_46_) {
									Class319.method4094(class572_sub12_sub10, i_44_, i_45_, (byte) -42);
									break;
								}
								i_50_++;
							}
						}
						Class35.method782((short) 582);
					} else if (i_44_ >= Class442.anInt5133 * -699022169 && i_44_ <= (Class442.anInt5133 * -699022169 + Class25.anInt180 * -1568261905) && i_45_ >= Class202_Sub1.anInt9650 * 1113238055 && (i_45_ <= (Class202_Sub1.anInt9650 * 1113238055 + (-776124211 * Class665_Sub31.anInt9619)))) {
						if (!Class25.aBool166) {
							int i_51_ = -1;
							for (int i_52_ = 0; i_52_ < 357782167 * Class25.anInt172; i_52_++) {
								if (Class25.aBool191) {
									int i_53_ = (((357782167 * Class25.anInt172 - 1 - i_52_) * (-211596715 * Class25.anInt162)) + (20 + (1113238055 * Class202_Sub1.anInt9650) + class284.anInt3412 * -801958417 + 1));
									if (i_45_ > i_53_ - (class284.anInt3412 * -801958417) - 1 && (i_45_ < i_53_ + (-2086019023 * class284.anInt3413)))
										i_51_ = i_52_;
								} else {
									int i_54_ = (((Class25.anInt172 * 357782167 - 1 - i_52_) * (Class25.anInt162 * -211596715)) + (31 + 1113238055 * (Class202_Sub1.anInt9650)));
									if (i_45_ > i_54_ - 13 && i_45_ < i_54_ + 3)
										i_51_ = i_52_;
								}
							}
							if (-1 != i_51_) {
								int i_55_ = 0;
								Class656 class656 = new Class656(Class25.aClass675_174);
								for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) class656.method7715((byte) 0)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) class656.next())) {
									if (i_55_ == i_51_) {
										Class319.method4094(class572_sub12_sub10, i_44_, i_45_, (byte) 25);
										break;
									}
									i_55_++;
								}
							}
							Class35.method782((short) 582);
						} else {
							int i_56_ = -1;
							for (int i_57_ = 0; i_57_ < 234065809 * Class25.anInt173; i_57_++) {
								if (Class25.aBool191) {
									int i_58_ = (1113238055 * Class202_Sub1.anInt9650 + 20 + class284.anInt3412 * -801958417 + 1 + (Class25.anInt162 * -211596715 * i_57_));
									if (i_45_ > i_58_ - (class284.anInt3412 * -801958417) - 1 && i_45_ < i_58_ + (-2086019023 * (class284.anInt3413))) {
										i_56_ = i_57_;
										break;
									}
								} else {
									int i_59_ = (Class202_Sub1.anInt9650 * 1113238055 + 31 + (-211596715 * Class25.anInt162 * i_57_));
									if (i_45_ > i_59_ - 13 && i_45_ < i_59_ + 3) {
										i_56_ = i_57_;
										break;
									}
								}
							}
							if (i_56_ != -1) {
								int i_60_ = 0;
								Class677 class677 = new Class677(Class25.aClass664_176);
								for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) class677.method7979(1850541151)); null != class572_sub12_sub19; class572_sub12_sub19 = ((Class572_Sub12_Sub19) class677.next())) {
									if (i_56_ == i_60_) {
										Class319.method4094(((Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)), i_44_, i_45_, (byte) 32);
										Class35.method782((short) 582);
										break;
									}
									i_60_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != Class25.aClass572_Sub12_Sub19_178) {
						if (i_44_ < -1647258031 * Class310.anInt3663 - 10 || i_44_ > 10 + (-1647258031 * Class310.anInt3663 + Class2.anInt20 * 673354219) || i_45_ < Class463.anInt5234 * -1069919945 - 10 || i_45_ > (Class612.anInt7989 * 491353989 + -1069919945 * Class463.anInt5234 + 10))
							Class69.method1070(765037962);
						else
							bool = true;
					}
					if (!bool) {
						if (i_44_ < Class442.anInt5133 * -699022169 - 10 || i_44_ > (-1568261905 * Class25.anInt180 + Class442.anInt5133 * -699022169 + 10) || (i_45_ < Class202_Sub1.anInt9650 * 1113238055 - 10) || i_45_ > (-776124211 * Class665_Sub31.anInt9619 + Class202_Sub1.anInt9650 * 1113238055 + 10))
							Class35.method782((short) 582);
						else if (Class25.aBool166) {
							int i_61_ = -1;
							int i_62_ = -1;
							for (int i_63_ = 0; i_63_ < Class25.anInt173 * 234065809; i_63_++) {
								if (Class25.aBool191) {
									int i_64_ = ((Class25.anInt162 * -211596715 * i_63_) + (1 + ((-801958417 * class284.anInt3412) + (20 + (Class202_Sub1.anInt9650 * 1113238055)))));
									if (i_45_ > i_64_ - (class284.anInt3412 * -801958417) - 1 && i_45_ < i_64_ + (-2086019023 * (class284.anInt3413))) {
										i_61_ = i_63_;
										i_62_ = i_64_ - (class284.anInt3412 * -801958417) - 1;
										break;
									}
								} else {
									int i_65_ = (31 + (1113238055 * Class202_Sub1.anInt9650) + i_63_ * (-211596715 * Class25.anInt162));
									if (i_45_ > i_65_ - 13 && i_45_ < 3 + i_65_) {
										i_61_ = i_63_;
										i_62_ = i_65_ - 13;
										break;
									}
								}
							}
							if (-1 != i_61_) {
								int i_66_ = 0;
								Class677 class677 = new Class677(Class25.aClass664_176);
								for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) class677.method7979(1171351529)); class572_sub12_sub19 != null; class572_sub12_sub19 = ((Class572_Sub12_Sub19) class677.next())) {
									if (i_61_ == i_66_) {
										if ((944917463 * (((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482)) > 1)
											Class65.method1036(class572_sub12_sub19, i_62_, 2129887630);
										break;
									}
									i_66_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class106.method2056((Class586.aClass502_7779.anInterface57_5554), class572_sub13, (byte) -45);
				boolean bool_67_ = Class106.method2056((Class586.aClass502_7779.anInterface57_5547), class572_sub13, (byte) -104);
				boolean bool_68_ = Class106.method2056((Class586.aClass502_7779.anInterface57_5555), class572_sub13, (byte) -105);
				if ((bool || bool_67_) && ((1 == -343113449 * client.anInt8637 && Class25.anInt172 * 357782167 > 2) || Class461.method5470(-2101797875)))
					bool_68_ = true;
				if (bool_68_ && 357782167 * Class25.anInt172 > 0) {
					if (null == client.aClass73_8770 && 0 == 808909649 * client.anInt8844)
						Class398.method4765(i_44_, i_45_, -1979247602);
					else
						Class25.anInt164 = -2050229898;
				} else if (bool_67_) {
					if (null != Class580.aClass572_Sub12_Sub10_7702)
						Class319.method4094((Class580.aClass572_Sub12_Sub10_7702), i_44_, i_45_, (byte) -65);
				} else if (bool) {
					if (Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 != null) {
						boolean bool_69_ = (client.aClass73_8770 != null || client.anInt8844 * 808909649 > 0);
						if (bool_69_) {
							Class25.anInt164 = 1122368699;
							Class108.aClass572_Sub12_Sub10_1425 = (Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311);
						} else
							Class319.method4094((Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311), i_44_, i_45_, (byte) 75);
					} else if (client.aBool8754)
						Class131.method2286(-1705608345);
				}
				if (client.aClass73_8770 == null && 808909649 * client.anInt8844 == 0) {
					Class25.anInt164 = 0;
					Class108.aClass572_Sub12_Sub10_1425 = null;
				}
			}
		}
	}
}
