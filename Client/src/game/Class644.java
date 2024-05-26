package game;

/* Class644 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class644 implements Interface72 {
	Class aClass8311;

	public Interface17 method460(int i, Interface18 interface18) {
		Interface17 interface17;
		try {
			Interface17 interface17_0_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_0_).method468(i, -1412584499);
			interface17 = interface17_0_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Interface17 method458(int i, Interface18 interface18, int i_1_) {
		Interface17 interface17;
		try {
			Interface17 interface17_2_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_2_).method468(i, -1412584499);
			interface17 = interface17_2_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Class method459(int i) {
		return ((Class644) this).aClass8311;
	}

	public Class644(Class var_class) {
		((Class644) this).aClass8311 = var_class;
	}

	public Interface17 method465(int i, Interface18 interface18) {
		Interface17 interface17;
		try {
			Interface17 interface17_3_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_3_).method468(i, -1412584499);
			interface17 = interface17_3_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Interface17 method462(int i, Interface18 interface18) {
		Interface17 interface17;
		try {
			Interface17 interface17_4_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_4_).method468(i, -1412584499);
			interface17 = interface17_4_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Class method467() {
		return ((Class644) this).aClass8311;
	}

	public Interface17 method464(int i, Interface18 interface18) {
		Interface17 interface17;
		try {
			Interface17 interface17_5_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_5_).method468(i, -1412584499);
			interface17 = interface17_5_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Interface17 method463(int i, Interface18 interface18) {
		Interface17 interface17;
		try {
			Interface17 interface17_6_ = (Interface17) ((Class644) this).aClass8311.newInstance();
			((Interface73) interface17_6_).method468(i, -1412584499);
			interface17 = interface17_6_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface17;
	}

	public Class method461() {
		return ((Class644) this).aClass8311;
	}

	public Class method466() {
		return ((Class644) this).aClass8311;
	}

	static final void method7629(int i) {
		Class572_Sub15_Sub2 buff = ((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330;
		for (int i_7_ = 0; i_7_ < client.anInt8627 * 865439581; i_7_++) {
			int i_8_ = client.anIntArray8628[i_7_];
			NPC maskBuilder = ((NPC) (((LinkableObject) client.aClass676_8622.get((long) i_8_)).anObject9081));
			buff.readUnsignedShort(647518597);
			int i_9_ = buff.readUnsignedByte(923900725);
			if (0 != (i_9_ & 0x80))
				i_9_ += buff.readUnsignedByte(1119556372) << 8;
			if (0 != (i_9_ & 0x8000))
				i_9_ += buff.readUnsignedByte(448415435) << 16;
			if ((i_9_ & 0x100000) != 0)
				i_9_ += buff.readUnsignedByte(-82333526) << 24;
			if ((i_9_ & 0x100) != 0) {
				maskBuilder.anInt11804 = buff.readUnsignedShortLE128((byte) 110) * -787969919;
				if (65535 == 1235203969 * maskBuilder.anInt11804)
					maskBuilder.anInt11804 = 787969919;
			}
			if (0 != (i_9_ & 0x1000)) {
				maskBuilder.anInt11634 = buff.readByte(2026550868) * 466976275;
				maskBuilder.anInt11636 = buff.readByteC(16711935) * -866081399;
				maskBuilder.anInt11635 = buff.read128Byte(1842273101) * -1178286551;
				maskBuilder.anInt11637 = buff.readByteC(16711935) * -1276586765;
				maskBuilder.anInt11638 = (buff.readUnsignedShortLE128((byte) 63) + client.cycles) * 1549695573;
				maskBuilder.anInt11639 = (buff.readUnsignedShort128((byte) 70) + client.cycles) * 2072899299;
				maskBuilder.anInt11624 = buff.readUnsignedShortLE((byte) 44) * 266972297;
				maskBuilder.anInt11634 += (maskBuilder.screenX[0] * 466976275);
				maskBuilder.anInt11636 += (maskBuilder.screenY[0] * -866081399);
				maskBuilder.anInt11635 += (maskBuilder.screenX[0] * -1178286551);
				maskBuilder.anInt11637 += (-1276586765 * maskBuilder.screenY[0]);
				maskBuilder.stepsCount = -298115053;
				maskBuilder.anInt11663 = 0;
			}
			if ((i_9_ & 0x800000) != 0) {
				int i_10_ = (maskBuilder.aClass410_11803.anIntArray4854).length;
				int i_11_ = 0;
				if (null != (maskBuilder.aClass410_11803.aShortArray4798))
					i_11_ = (maskBuilder.aClass410_11803.aShortArray4798).length;
				int i_12_ = 0;
				if ((maskBuilder.aClass410_11803.aShortArray4801) != null)
					i_11_ = (maskBuilder.aClass410_11803.aShortArray4801).length;
				int i_13_ = buff.readUnsignedByte128(-1927732441);
				if ((i_13_ & 0x1) != 1) {
					buff.o += 620787510;
					int[] is = null;
					if ((i_13_ & 0x2) == 2) {
						is = new int[i_10_];
						for (int i_14_ = 0; i_14_ < i_10_; i_14_++)
							is[i_14_] = buff.readBigSmart((byte) 71);
					}
					short[] is_15_ = null;
					if ((i_13_ & 0x4) == 4) {
						is_15_ = new short[i_11_];
						for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
							is_15_[i_16_] = (short) buff.readUnsignedShort128((byte) 64);
					}
					short[] is_17_ = null;
					if (8 == (i_13_ & 0x8)) {
						is_17_ = new short[i_12_];
						for (int i_18_ = 0; i_18_ < i_12_; i_18_++)
							is_17_[i_18_] = (short) buff.readUnsignedShort(647518597);
					}
					long l = (long) ((NPC.anInt11812 += -1225347919) * 907025489 - 1);
					new Class399(l, is, null, null, null, is_15_, is_17_);
				}
			}
			if (0 != (i_9_ & 0x200)) {
				int i_19_ = buff.readUnsigned128Byte((byte) 118);
				int[] is = new int[i_19_];
				int[] is_20_ = new int[i_19_];
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					int i_22_ = buff.readUnsignedShort128((byte) 31);
					if (49152 == (i_22_ & 0xc000)) {
						int i_23_ = buff.readUnsignedShort128((byte) 120);
						is[i_21_] = i_22_ << 16 | i_23_;
					} else
						is[i_21_] = i_22_;
					is_20_[i_21_] = buff.readUnsignedShort(647518597);
				}
				maskBuilder.method10518(is, is_20_, (byte) -50);
			}
			if (0 != (i_9_ & 0x2000000)) {
				maskBuilder.aByte11643 = buff.readByte(413790441);
				maskBuilder.aByte11644 = buff.readByte(2075318647);
				maskBuilder.aByte11626 = buff.read128Byte(1007102971);
				maskBuilder.aByte11605 = (byte) buff.readUnsignedByte128(1582116810);
				maskBuilder.anInt11641 = ((client.cycles + buff.readUnsignedShortLE((byte) -46)) * 1008238467);
				maskBuilder.anInt11642 = ((client.cycles + buff.readUnsignedShortLE128((byte) 63)) * -1559016237);
			}
			if ((i_9_ & 0x400000) != 0) {
				maskBuilder.anInt11806 = buff.readUnsignedShortLE((byte) -13) * 80538835;
				if (65535 == 1667386203 * maskBuilder.anInt11806)
					maskBuilder.anInt11806 = 1325621039 * (maskBuilder.aClass410_11803.anInt4812);
			}
			if ((i_9_ & 0x40) != 0) {
				int[] is = new int[4];
				for (int i_24_ = 0; i_24_ < 4; i_24_++)
					is[i_24_] = buff.readBigSmart((byte) 78);
				int i_25_ = buff.readUnsignedByte(1115146782);
				Class565.method6699(maskBuilder, is, i_25_, true, (short) -12599);
			}
			if ((i_9_ & 0x20000) != 0) {
				int i_26_ = ((buff.b[((buff.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					int i_28_ = buff.readUnsignedByte(1336359603);
					int i_29_ = buff.readIntLE(2104380161);
					int i_30_ = buff.read24BitIntegerV3(-1230144492);
					maskBuilder.method10691(i_28_, i_29_, i_30_, -1590126923);
				}
			}
			if ((i_9_ & 0x400) != 0) {
				int i_31_ = (maskBuilder.aClass410_11803.anIntArray4793).length;
				int i_32_ = 0;
				if (null != (maskBuilder.aClass410_11803.aShortArray4798))
					i_32_ = (maskBuilder.aClass410_11803.aShortArray4798).length;
				int i_33_ = 0;
				if (null != (maskBuilder.aClass410_11803.aShortArray4801))
					i_33_ = (maskBuilder.aClass410_11803.aShortArray4801).length;
				int i_34_ = buff.readUnsignedByte(792002435);
				if ((i_34_ & 0x1) == 1)
					maskBuilder.aClass399_11801 = null;
				else {
					buff.o += 620787510;
					int[] is = null;
					float[] fs = null;
					int[][] is_35_ = null;
					int[][] is_36_ = null;
					if ((i_34_ & 0x2) == 2) {
						is = new int[i_31_];
						if (16 == (i_34_ & 0x10)) {
							fs = new float[i_31_];
							is_35_ = new int[i_31_][3];
							is_36_ = new int[i_31_][3];
						}
						for (int i_37_ = 0; i_37_ < i_31_; i_37_++) {
							is[i_37_] = buff.readBigSmart((byte) 125);
							if ((i_34_ & 0x10) == 16 && is[i_37_] != -1) {
								fs[i_37_] = buff.method8448((byte) 2);
								for (int i_38_ = 0; i_38_ < 3; i_38_++)
									is_35_[i_37_][i_38_] = buff.method8548((byte) -45);
								for (int i_39_ = 0; i_39_ < 3; i_39_++)
									is_36_[i_37_][i_39_] = buff.method8516(1903331256);
							}
						}
					}
					short[] is_40_ = null;
					if ((i_34_ & 0x4) == 4) {
						is_40_ = new short[i_32_];
						for (int i_41_ = 0; i_41_ < i_32_; i_41_++)
							is_40_[i_41_] = (short) buff.readUnsignedShort128((byte) 39);
					}
					short[] is_42_ = null;
					if (8 == (i_34_ & 0x8)) {
						is_42_ = new short[i_33_];
						for (int i_43_ = 0; i_43_ < i_33_; i_43_++)
							is_42_[i_43_] = (short) buff.readUnsignedShortLE128((byte) 122);
					}
					long l = (long) ((NPC.anInt11811 += 845878597) * 1342584205 - 1);
					maskBuilder.aClass399_11801 = new Class399(l, is, fs, is_35_, is_36_, is_40_, is_42_);
				}
			}
			if (0 != (i_9_ & 0x4))
				maskBuilder.method10688(buff.readString(1295706626), 0, 0, -1147462096);
			if ((i_9_ & 0x80000) != 0) {
				int i_44_ = buff.readUnsignedByteC(-1182049062);
				int[] is = new int[8];
				short[] is_45_ = new short[8];
				for (int i_46_ = 0; i_46_ < 8; i_46_++) {
					if ((i_44_ & 1 << i_46_) != 0) {
						is[i_46_] = buff.readBigSmart((byte) 112);
						is_45_[i_46_] = (short) buff.readSmart((byte) 115);
					} else {
						is[i_46_] = -1;
						is_45_[i_46_] = (short) -1;
					}
				}
				maskBuilder.aClass418_11813 = new Class418(is, is_45_);
			}
			if ((i_9_ & 0x20) != 0) {
				int i_47_ = buff.readUnsignedShort(647518597);
				int i_48_ = buff.readInt(-839085561);
				if (i_47_ == 65535)
					i_47_ = -1;
				int i_49_ = buff.readUnsignedByteC(-130450541);
				int i_50_ = i_49_ & 0x7;
				int i_51_ = i_49_ >> 3 & 0xf;
				if (i_51_ == 15)
					i_51_ = -1;
				boolean bool = 1 == (i_49_ >> 7 & 0x1);
				maskBuilder.method10520(i_47_, i_48_, i_50_, i_51_, bool, 0, 931172410);
			}
			if (0 != (i_9_ & 0x4000)) {
				int i_52_ = buff.readUnsignedByte128(2135694579);
				int[] is = new int[i_52_];
				int[] is_53_ = new int[i_52_];
				int[] is_54_ = new int[i_52_];
				for (int i_55_ = 0; i_55_ < i_52_; i_55_++) {
					int i_56_ = buff.readBigSmart((byte) 109);
					is[i_55_] = i_56_;
					is_53_[i_55_] = buff.readUnsignedByte128(-1857142393);
					is_54_[i_55_] = buff.readUnsignedShortLE128((byte) 42);
				}
				Class102_Sub3.method9564(maskBuilder, is, is_53_, is_54_, (byte) 4);
			}
			if (0 != (i_9_ & 0x10000000))
				maskBuilder.anInt11808 = buff.readUnsignedByte128(1232330171) * -702649873;
			if (0 != (i_9_ & 0x8000000)) {
				int i_57_ = buff.readUnsignedShortLE128((byte) 15);
				int i_58_ = buff.readIntV1((byte) 0);
				if (65535 == i_57_)
					i_57_ = -1;
				int i_59_ = buff.readUnsignedByteC(435205531);
				int i_60_ = i_59_ & 0x7;
				int i_61_ = i_59_ >> 3 & 0xf;
				if (15 == i_61_)
					i_61_ = -1;
				boolean bool = (i_59_ >> 7 & 0x1) == 1;
				maskBuilder.method10520(i_57_, i_58_, i_60_, i_61_, bool, 3, 931172410);
			}
			if ((i_9_ & 0x4000000) != 0) {
				int i_62_ = buff.readUnsignedShortLE((byte) 15);
				int i_63_ = buff.readIntLE(2128698936);
				if (i_62_ == 65535)
					i_62_ = -1;
				int i_64_ = buff.readUnsignedByte(1642650507);
				int i_65_ = i_64_ & 0x7;
				int i_66_ = i_64_ >> 3 & 0xf;
				if (i_66_ == 15)
					i_66_ = -1;
				boolean bool = (i_64_ >> 7 & 0x1) == 1;
				maskBuilder.method10520(i_62_, i_63_, i_65_, i_66_, bool, 2, 931172410);
			}
			if (0 != (i_9_ & 0x1)) {
				maskBuilder.anInt11799 = buff.readUnsignedShort128((byte) 97) * -919549415;
				maskBuilder.anInt11800 = buff.readUnsignedShortLE((byte) -43) * 564443067;
			}
			if (0 != (i_9_ & 0x10000)) {
				buff.o += 620787510;
				int i_67_ = ((buff.b[((buff.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					int i_69_ = buff.readUnsignedByteC(-859995292);
					BaseVarType class609 = ((BaseVarType) Class455.method5387(BaseVarType.method7258((byte) -66), i_69_, -1923823439));
					Class323 class323 = (Class624.aClass202_Sub1_Sub2_8080.method9205(buff, class609, -141889912));
					maskBuilder.anInterface71_11669.method443(class323.anInt4079 * 380662693, class323.anObject4078, -457563809);
				}
			}
			if (0 != (i_9_ & 0x8)) {
				int i_70_ = buff.readUnsigned128Byte((byte) 73);
				if (i_70_ > 0) {
					for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
						int i_72_ = -1;
						int i_73_ = -1;
						int i_74_ = -1;
						int i_75_ = buff.readUnsignedSmart(-124403480);
						if (32767 == i_75_) {
							i_75_ = buff.readUnsignedSmart(340777008);
							i_73_ = buff.readUnsignedSmart(-295839809);
							i_72_ = buff.readUnsignedSmart(-406222086);
							i_74_ = buff.readUnsignedSmart(616296187);
						} else if (i_75_ != 32766)
							i_73_ = buff.readUnsignedSmart(-1540247200);
						else {
							i_75_ = -1;
							i_73_ = buff.readUnsignedByteC(1324000998);
						}
						int i_76_ = buff.readUnsignedSmart(1177931073);
						maskBuilder.method10522(i_75_, i_73_, i_72_, i_74_, (client.cycles), i_76_, -1678591374);
					}
				}
				int i_77_ = buff.readUnsignedByte128(2088706934);
				if (i_77_ > 0) {
					for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
						int i_79_ = buff.readUnsignedSmart(766894024);
						int i_80_ = buff.readUnsignedSmart(-1857535051);
						if (32767 != i_80_) {
							int i_81_ = buff.readUnsignedSmart(-1876855085);
							int i_82_ = buff.readUnsignedByte(934920887);
							int i_83_ = (i_80_ > 0 ? buff.readUnsignedByte(2079671634) : i_82_);
							maskBuilder.method10571(i_79_, client.cycles, i_80_, i_81_, i_82_, i_83_, -1949234147);
						} else
							maskBuilder.method10524(i_79_, 16711935);
					}
				}
			}
			if (0 != (i_9_ & 0x10)) {
				maskBuilder.anInt11619 = buff.readUnsignedShort128((byte) 103) * 320688299;
				if (-1639699965 * maskBuilder.anInt11619 == 65535)
					maskBuilder.anInt11619 = -320688299;
			}
			if ((i_9_ & 0x40000) != 0) {
				maskBuilder.aString11807 = buff.readString(1295706626);
				if ("".equals(maskBuilder.aString11807) || (maskBuilder.aString11807.equals(maskBuilder.aClass410_11803.aString4791)))
					maskBuilder.aString11807 = (maskBuilder.aClass410_11803.aString4791);
			}
			if ((i_9_ & 0x1000000) != 0) {
				int i_84_ = buff.readUnsignedShortLE128((byte) 35);
				int i_85_ = buff.readIntV2(958088067);
				if (i_84_ == 65535)
					i_84_ = -1;
				int i_86_ = buff.readUnsignedByte128(-941271531);
				int i_87_ = i_86_ & 0x7;
				int i_88_ = i_86_ >> 3 & 0xf;
				if (i_88_ == 15)
					i_88_ = -1;
				boolean bool = 1 == (i_86_ >> 7 & 0x1);
				maskBuilder.method10520(i_84_, i_85_, i_87_, i_88_, bool, 4, 931172410);
			}
			if (0 != (i_9_ & 0x200000)) {
				maskBuilder.anInterface71_11669.method22((byte) -74);
				buff.o += 620787510;
				int i_89_ = ((buff.b[((buff.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
					int i_91_ = buff.readUnsignedByte128(1073900076);
					BaseVarType class609 = ((BaseVarType) Class455.method5387(BaseVarType.method7258((byte) -56), i_91_, -2019203165));
					Class323 class323 = (Class624.aClass202_Sub1_Sub2_8080.method9205(buff, class609, -141889912));
					maskBuilder.anInterface71_11669.method443(class323.anInt4079 * 380662693, class323.anObject4078, -1742970873);
				}
			}
			if (0 != (i_9_ & 0x2)) {
				if (maskBuilder.aClass410_11803.method4955((short) 229))
					Class259.method3561(maskBuilder, 1410710176);
				maskBuilder.method10687((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(buff.readBigSmart((byte) 114), -352237550)), 0 == (i_9_ & 0x40000), 0 == (i_9_ & 0x400000), true, (byte) -30);
				maskBuilder.method10525(358769667 * (maskBuilder.aClass410_11803.anInt4792), (byte) -68);
				maskBuilder.anInt11653 = -631722783 * (-1233753521 * (maskBuilder.aClass410_11803.anInt4823) << 3);
				if (maskBuilder.aClass410_11803.method4955((short) 229))
					Class617.method7399(maskBuilder.aByte9009, (maskBuilder.screenX[0]), (maskBuilder.screenY[0]), 0, null, maskBuilder, null, -1845719814);
			}
			if ((i_9_ & 0x2000) != 0) {
				int i_92_ = buff.readUnsignedShortLE((byte) -2);
				int i_93_ = buff.readIntLE(2041503212);
				if (i_92_ == 65535)
					i_92_ = -1;
				int i_94_ = buff.readUnsigned128Byte((byte) 90);
				int i_95_ = i_94_ & 0x7;
				int i_96_ = i_94_ >> 3 & 0xf;
				if (i_96_ == 15)
					i_96_ = -1;
				boolean bool = (i_94_ >> 7 & 0x1) == 1;
				maskBuilder.method10520(i_92_, i_93_, i_95_, i_96_, bool, 1, 931172410);
			}
		}
	}
}
