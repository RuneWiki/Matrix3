package game;

/* Class280_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;

public class Class280_Sub1 extends Class280 {
	static final int anInt9436 = 2;
	static boolean aBool9437;
	static final int anInt9438 = 0;
	static final int anInt9439 = 1;
	int anInt9440 = -2051844721;
	static final int anInt9441 = 3;
	static int[] anIntArray9442;
	static int[] anIntArray9443;
	static int[] anIntArray9444;
	static int[] anIntArray9445;
	static boolean aBool9446 = false;
	Class501 aClass501_9447;
	Class639_Sub16 aClass639_Sub16_9448;

	public final void method8807(Class106 class106, RSByteBuffer class572_sub15, int i, int i_0_, byte i_1_) {
		if (!aBool3140) {
			class572_sub15.o += -1811817256;
			boolean bool = false;
			Class472 class472 = null;
			boolean bool_2_ = false;
			while (-1585139053 * class572_sub15.o < class572_sub15.b.length) {
				int i_3_ = class572_sub15.readUnsignedByte(1867953725);
				if (i_3_ == 0) {
					if (class472 == null)
						class472 = new Class472(class572_sub15, (((Class280_Sub1) this).aClass501_9447));
					else
						class472.method5569(class572_sub15, (((Class280_Sub1) this).aClass501_9447), (short) 26503);
				} else if (i_3_ == 1) {
					int i_4_ = class572_sub15.readUnsignedByte(1141292367);
					if (i_4_ > 0) {
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							Class541 class541 = new Class541(class106, (aClass523_3156.anInt5858 * 406704825), class572_sub15, 2);
							if (-250358827 * class541.anInt6091 == 31) {
								Class266 class266 = ((Class266) (Class565.aClass639_Sub7_6360.getDefinition(class572_sub15.readUnsignedShort(647518597), -1052195579)));
								class541.method6422(1180605969 * class266.anInt2840, class266.anInt2843 * 1716776663, -1680730439 * class266.anInt2842, 682155699 * class266.anInt2841, (byte) 23);
							}
							if (class106.method1849() > 0) {
								Class572_Sub36 class572_sub36 = class541.aClass572_Sub36_6086;
								int i_6_ = (class572_sub36.method8720(-1172130943) + (i << 9));
								int i_7_ = (class572_sub36.method8722(-874634669) + (i_0_ << 9));
								int i_8_ = i_6_ >> 9;
								int i_9_ = i_7_ >> 9;
								if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < anInt3137 * -113535507 && i_9_ < anInt3159 * -686830021) {
									class572_sub36.method8726(i_6_, ((anIntArrayArrayArray3141[1399368809 * class541.anInt6079][i_8_][i_9_]) - class572_sub36.method8721((byte) -8)), i_7_, (byte) 9);
									aClass523_3156.method6262(class541, (byte) -93);
								}
							}
						}
					}
				} else if (i_3_ == 2) {
					if (null == class472)
						class472 = new Class472();
					class472.method5578(class572_sub15, -2116719617);
				} else if (3 == i_3_) {
					if (class472 == null)
						class472 = new Class472();
					class472.method5574(class572_sub15, 221974465);
				} else if (128 == i_3_) {
					if (class472 == null)
						class472 = new Class472();
					class472.method5572(class572_sub15, ((Class280_Sub1) this).aClass501_9447, 1903693914);
				} else if (i_3_ == 129) {
					if (aByteArrayArrayArray3142 == null)
						aByteArrayArrayArray3142 = new byte[4][][];
					for (int i_10_ = 0; i_10_ < 4; i_10_++) {
						byte i_11_ = class572_sub15.readByte(1324189694);
						if (i_11_ == 0 && null != aByteArrayArrayArray3142[i_10_]) {
							int i_12_ = i;
							int i_13_ = 64 + i;
							int i_14_ = i_0_;
							int i_15_ = i_0_ + 64;
							if (i_12_ < 0)
								i_12_ = 0;
							else if (i_12_ >= -113535507 * anInt3137)
								i_12_ = -113535507 * anInt3137;
							if (i_13_ < 0)
								i_13_ = 0;
							else if (i_13_ >= -113535507 * anInt3137)
								i_13_ = -113535507 * anInt3137;
							if (i_14_ < 0)
								i_14_ = 0;
							else if (i_14_ >= -686830021 * anInt3159)
								i_14_ = -686830021 * anInt3159;
							if (i_15_ < 0)
								i_15_ = 0;
							else if (i_15_ >= anInt3159 * -686830021)
								i_15_ = anInt3159 * -686830021;
							for (/**/; i_12_ < i_13_; i_12_++) {
								for (/**/; i_14_ < i_15_; i_14_++)
									aByteArrayArrayArray3142[i_10_][i_12_][i_14_] = (byte) 0;
							}
						} else if (i_11_ == 1) {
							if (aByteArrayArrayArray3142[i_10_] == null)
								aByteArrayArrayArray3142[i_10_] = (new byte[anInt3137 * -113535507 + 1][-686830021 * anInt3159 + 1]);
							for (int i_16_ = 0; i_16_ < 64; i_16_ += 4) {
								for (int i_17_ = 0; i_17_ < 64; i_17_ += 4) {
									byte i_18_ = class572_sub15.readByte(63307980);
									for (int i_19_ = i_16_ + i; i_19_ < 4 + (i_16_ + i); i_19_++) {
										for (int i_20_ = i_17_ + i_0_; i_20_ < i_0_ + i_17_ + 4; i_20_++) {
											if (i_19_ >= 0 && (i_19_ < -113535507 * anInt3137) && i_20_ >= 0 && (i_20_ < anInt3159 * -686830021))
												aByteArrayArrayArray3142[i_10_][i_19_][i_20_] = i_18_;
										}
									}
								}
							}
						} else if (2 == i_11_) {
							if (null == aByteArrayArrayArray3142[i_10_])
								aByteArrayArrayArray3142[i_10_] = (new byte[1 + anInt3137 * -113535507][anInt3159 * -686830021 + 1]);
							if (i_10_ > 0) {
								int i_21_ = i;
								int i_22_ = 64 + i;
								int i_23_ = i_0_;
								int i_24_ = 64 + i_0_;
								if (i_21_ < 0)
									i_21_ = 0;
								else if (i_21_ >= -113535507 * anInt3137)
									i_21_ = -113535507 * anInt3137;
								if (i_22_ < 0)
									i_22_ = 0;
								else if (i_22_ >= anInt3137 * -113535507)
									i_22_ = anInt3137 * -113535507;
								if (i_23_ < 0)
									i_23_ = 0;
								else if (i_23_ >= anInt3159 * -686830021)
									i_23_ = anInt3159 * -686830021;
								if (i_24_ < 0)
									i_24_ = 0;
								else if (i_24_ >= -686830021 * anInt3159)
									i_24_ = -686830021 * anInt3159;
								for (/**/; i_21_ < i_22_; i_21_++) {
									for (/**/; i_23_ < i_24_; i_23_++)
										aByteArrayArrayArray3142[i_10_][i_21_][i_23_] = (aByteArrayArrayArray3142[i_10_ - 1][i_21_][i_23_]);
								}
							}
						}
					}
					bool = true;
				} else if (130 == i_3_)
					bool_2_ = true;
				else
					throw new IllegalStateException("");
			}
			for (int i_25_ = 0; i_25_ < 8; i_25_++) {
				for (int i_26_ = 0; i_26_ < 8; i_26_++) {
					int i_27_ = i_25_ + (i >> 3);
					int i_28_ = (i_0_ >> 3) + i_26_;
					if (i_27_ >= 0 && i_27_ < anInt3137 * -113535507 >> 3 && i_28_ >= 0 && i_28_ < -686830021 * anInt3159 >> 3) {
						if (null != class472)
							((Class280_Sub1) this).aClass501_9447.method5963(i_27_, i_28_, class472, -466558944);
						Class267.method3653(i_27_, i_28_, bool_2_, (byte) 109);
					}
				}
			}
			if (!bool && null != aByteArrayArrayArray3142) {
				for (int i_29_ = 0; i_29_ < 4; i_29_++) {
					if (null != aByteArrayArrayArray3142[i_29_]) {
						for (int i_30_ = 0; i_30_ < 16; i_30_++) {
							for (int i_31_ = 0; i_31_ < 16; i_31_++) {
								int i_32_ = i_30_ + (i >> 2);
								int i_33_ = (i_0_ >> 2) + i_31_;
								if (i_32_ >= 0 && i_32_ < 26 && i_33_ >= 0 && i_33_ < 26)
									aByteArrayArrayArray3142[i_29_][i_32_][i_33_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	public final void method8808(Class106 class106, RSByteBuffer class572_sub15, int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		if (!aBool3140) {
			class572_sub15.o += -1811817256;
			boolean bool = false;
			Class472 class472 = null;
			boolean bool_41_ = false;
			int i_42_ = 8 * (i_37_ & 0x7);
			int i_43_ = 8 * (i_38_ & 0x7);
			while (class572_sub15.o * -1585139053 < class572_sub15.b.length) {
				int i_44_ = class572_sub15.readUnsignedByte(1451881920);
				if (i_44_ == 0) {
					if (null == class472)
						class472 = new Class472(class572_sub15, (((Class280_Sub1) this).aClass501_9447));
					else
						class472.method5569(class572_sub15, (((Class280_Sub1) this).aClass501_9447), (short) 22465);
				} else if (i_44_ == 1) {
					int i_45_ = class572_sub15.readUnsignedByte(517918014);
					if (i_45_ > 0) {
						for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
							Class541 class541 = new Class541(class106, (406704825 * aClass523_3156.anInt5858), class572_sub15, 2);
							if (31 == class541.anInt6091 * -250358827) {
								Class266 class266 = ((Class266) (Class565.aClass639_Sub7_6360.getDefinition(class572_sub15.readUnsignedShort(647518597), 2146562916)));
								class541.method6422(class266.anInt2840 * 1180605969, 1716776663 * class266.anInt2843, class266.anInt2842 * -1680730439, class266.anInt2841 * 682155699, (byte) 114);
							}
							if (class106.method1849() > 0) {
								Class572_Sub36 class572_sub36 = class541.aClass572_Sub36_6086;
								int i_47_ = (class572_sub36.method8720(-519978934) >> 9);
								int i_48_ = (class572_sub36.method8722(559611622) >> 9);
								if (i_36_ == class541.anInt6079 * 1399368809 && i_47_ >= i_42_ && i_47_ < i_42_ + 8 && i_48_ >= i_43_ && i_48_ < i_43_ + 8) {
									int i_49_ = ((i_34_ << 9) + (Class348.method4337((class572_sub36.method8720(-246427554) & 0xfff), (class572_sub36.method8722(1755376428) & 0xfff), i_39_, -2101665168)));
									int i_50_ = ((i_35_ << 9) + (Class169.method2701((class572_sub36.method8720(813101411) & 0xfff), (class572_sub36.method8722(-447505283) & 0xfff), i_39_, -1316977956)));
									i_47_ = i_49_ >> 9;
									i_48_ = i_50_ >> 9;
									if (i_47_ >= 0 && i_48_ >= 0 && i_47_ < -113535507 * anInt3137 && i_48_ < anInt3159 * -686830021) {
										class541.anInt6079 = -22567975 * i;
										class572_sub36.method8726(i_49_, ((anIntArrayArrayArray3141[(class541.anInt6079 * 1399368809)][i_47_][i_48_]) - class572_sub36.method8721((byte) -50)), i_50_, (byte) 9);
										aClass523_3156.method6262(class541, (byte) -111);
									}
								}
							}
						}
					}
				} else if (2 == i_44_) {
					if (class472 == null)
						class472 = new Class472();
					class472.method5578(class572_sub15, -1421293551);
				} else if (3 == i_44_) {
					if (class472 == null)
						class472 = new Class472();
					class472.method5574(class572_sub15, 221974465);
				} else if (i_44_ == 128) {
					if (null == class472)
						class472 = new Class472();
					class472.method5572(class572_sub15, ((Class280_Sub1) this).aClass501_9447, 1555097258);
				} else if (i_44_ == 129) {
					if (null == aByteArrayArrayArray3142)
						aByteArrayArrayArray3142 = new byte[4][][];
					for (int i_51_ = 0; i_51_ < 4; i_51_++) {
						byte i_52_ = class572_sub15.readByte(1567908623);
						if (0 == i_52_ && aByteArrayArrayArray3142[i] != null) {
							if (i_51_ <= i_36_) {
								int i_53_ = i_34_;
								int i_54_ = i_34_ + 7;
								int i_55_ = i_35_;
								int i_56_ = 7 + i_35_;
								if (i_53_ < 0)
									i_53_ = 0;
								else if (i_53_ >= -113535507 * anInt3137)
									i_53_ = anInt3137 * -113535507;
								if (i_54_ < 0)
									i_54_ = 0;
								else if (i_54_ >= anInt3137 * -113535507)
									i_54_ = -113535507 * anInt3137;
								if (i_55_ < 0)
									i_55_ = 0;
								else if (i_55_ >= anInt3159 * -686830021)
									i_55_ = anInt3159 * -686830021;
								if (i_56_ < 0)
									i_56_ = 0;
								else if (i_56_ >= anInt3159 * -686830021)
									i_56_ = anInt3159 * -686830021;
								for (/**/; i_53_ < i_54_; i_53_++) {
									for (/**/; i_55_ < i_56_; i_55_++)
										aByteArrayArrayArray3142[i][i_53_][i_55_] = (byte) 0;
								}
							}
						} else if (i_52_ == 1) {
							if (null == aByteArrayArrayArray3142[i])
								aByteArrayArrayArray3142[i] = (new byte[1 + anInt3137 * -113535507][anInt3159 * -686830021 + 1]);
							for (int i_57_ = 0; i_57_ < 64; i_57_ += 4) {
								for (int i_58_ = 0; i_58_ < 64; i_58_ += 4) {
									byte i_59_ = class572_sub15.readByte(1624182784);
									if (i_51_ <= i_36_) {
										for (int i_60_ = i_57_; i_60_ < i_57_ + 4; i_60_++) {
											for (int i_61_ = i_58_; i_61_ < 4 + i_58_; i_61_++) {
												if (i_60_ >= i_42_ && i_60_ < 8 + i_42_ && i_61_ >= i_43_ && i_61_ < i_43_ + 8) {
													int i_62_ = (i_34_ + (Class185.method2836(i_60_ & 0x7, i_61_ & 0x7, i_39_, -441240859)));
													int i_63_ = (i_35_ + (Class481.method5735(i_60_ & 0x7, i_61_ & 0x7, i_39_, 811964390)));
													if (i_62_ >= 0 && (i_62_ < (-113535507 * anInt3137)) && i_63_ >= 0 && (i_63_ < (-686830021 * anInt3159))) {
														aByteArrayArrayArray3142[i][i_62_][i_63_] = i_59_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (i_52_ == 2)
							continue;
					}
				} else if (130 == i_44_)
					bool_41_ = true;
				else
					throw new IllegalStateException("");
			}
			if (class472 != null)
				((Class280_Sub1) this).aClass501_9447.method5963(i_34_ >> 3, i_35_ >> 3, class472, -82329762);
			Class267.method3653(i_34_ >> 3, i_35_ >> 3, bool_41_, (byte) 23);
			if (!bool && aByteArrayArrayArray3142 != null && null != aByteArrayArrayArray3142[i]) {
				int i_64_ = i_34_ + 7;
				int i_65_ = i_35_ + 7;
				for (int i_66_ = i_34_; i_66_ < i_64_; i_66_++) {
					for (int i_67_ = i_35_; i_67_ < i_65_; i_67_++)
						aByteArrayArrayArray3142[i][i_66_][i_67_] = (byte) 0;
				}
			}
		}
	}

	public final void method8809(Class106 class106, byte[] is, int i, int i_68_, int i_69_) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		int i_70_ = -1;
		for (;;) {
			int i_71_ = class572_sub15.readSmart2(-1764600051);
			if (i_71_ == 0)
				break;
			i_70_ += i_71_;
			int i_72_ = 0;
			for (;;) {
				int i_73_ = class572_sub15.readUnsignedSmart(-633452433);
				if (0 == i_73_)
					break;
				i_72_ += i_73_ - 1;
				int i_74_ = i_72_ & 0x3f;
				int i_75_ = i_72_ >> 6 & 0x3f;
				int i_76_ = i_72_ >> 12;
				int i_77_ = class572_sub15.readUnsignedByte(-59397664);
				int i_78_ = i_77_ >> 2;
				int i_79_ = i_77_ & 0x3;
				int i_80_ = i_75_ + i;
				int i_81_ = i_68_ + i_74_;
				ObjectDefinitions class509 = (ObjectDefinitions) ((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(i_70_, -555740566);
				int i_82_;
				int i_83_;
				if (0 == (i_79_ & 0x1)) {
					i_82_ = -876498849 * class509.sizeX;
					i_83_ = 1922784011 * class509.sizeY;
				} else {
					i_82_ = class509.sizeY * 1922784011;
					i_83_ = class509.sizeX * -876498849;
				}
				int i_84_ = i_82_ + i_80_;
				int i_85_ = i_81_ + i_83_;
				if (i_80_ < anInt3137 * -113535507 && i_81_ < anInt3159 * -686830021 && i_84_ > 0 && i_85_ > 0 && (Class516.aClass516_5739.anInt5742 * 1870735441 == i_78_ || (Class516.aClass516_5740.anInt5742 * 1870735441 == i_78_) || (i_80_ > 0 && i_81_ > 0 && i_80_ < anInt3137 * -113535507 - 1 && i_81_ < anInt3159 * -686830021 - 1))) {
					method8810(class106, i_76_, i_76_, i_80_, i_81_, i_70_, i_79_, i_78_, -1, 0, 1752928549);
				}
			}
		}
	}

	final void method8810(Class106 class106, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		if (i_86_ < 1741817325 * ((Class280_Sub1) this).anInt9440)
			((Class280_Sub1) this).anInt9440 = 1324163045 * i_86_;
		ObjectDefinitions class509 = (ObjectDefinitions) ((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(i_89_, -84905389);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1680324150) != 0 || !class509.aBool5633) {
			int i_95_;
			int i_96_;
			if (1 == i_90_ || i_90_ == 3) {
				i_95_ = 1922784011 * class509.sizeY;
				i_96_ = -876498849 * class509.sizeX;
			} else {
				i_95_ = class509.sizeX * -876498849;
				i_96_ = class509.sizeY * 1922784011;
			}
			int i_97_;
			int i_98_;
			if (i_95_ + i_87_ <= anInt3137 * -113535507) {
				i_97_ = i_87_ + (i_95_ >> 1);
				i_98_ = (1 + i_95_ >> 1) + i_87_;
			} else {
				i_97_ = i_87_;
				i_98_ = i_87_ + 1;
			}
			int i_99_;
			int i_100_;
			if (i_96_ + i_88_ <= -686830021 * anInt3159) {
				i_99_ = i_88_ + (i_96_ >> 1);
				i_100_ = (1 + i_96_ >> 1) + i_88_;
			} else {
				i_99_ = i_88_;
				i_100_ = i_88_ + 1;
			}
			Class174 class174 = aClass523_3156.aClass174Array5875[i];
			int i_101_;
			if (i_91_ == 1870735441 * Class516.aClass516_5739.anInt5742 || i_91_ == Class516.aClass516_5740.anInt5742 * 1870735441)
				i_101_ = (class174.method2720(i_97_, i_99_, -166654492) + class174.method2720(i_98_, i_99_, -1096492412) + class174.method2720(i_97_, i_100_, -996428526) + class174.method2720(i_98_, i_100_, -1065108691)) >> 2;
			else
				i_101_ = (class174.method2713(i_97_, i_99_, -1597817767) + class174.method2713(i_98_, i_99_, -1008537860) + class174.method2713(i_97_, i_100_, 136973878) + class174.method2713(i_98_, i_100_, 1141760229)) >> 2;
			int i_102_ = (i_87_ << 9) + (i_95_ << 8);
			int i_103_ = (i_96_ << 8) + (i_88_ << 9);
			boolean bool = aBool3144 && !aBool3140 && class509.aBool5630;
			if (class509.method6049(-1504280342))
				Class617.method7399(i_86_, i_87_, i_88_, i_90_, class509, null, null, -2075352514);
			boolean bool_104_ = (i_92_ == -1 && (!class509.method6050(1100268264) || class509.aBool5636 && (Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9153(-2054405095) == 0)) && class509.anIntArray5605 == null && !class509.aBool5677 && !class509.aBool5667);
			if (!aBool9446 || ((!Class44.method822(i_91_, (byte) -79) || 1 == class509.anInt5680 * 2061831979) && (!Class572_Sub16_Sub4.method10068(i_91_, (short) 15320) || 0 != 2061831979 * class509.anInt5680))) {
				if (i_91_ == Class516.aClass516_5741.anInt5742 * 1870735441) {
					if (Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method9109(-477232025) != 0 || 0 != class509.anInt5627 * -1262171129 || 1 == -665518601 * class509.anInt5626 || class509.aBool5658) {
						Class456_Sub1_Sub1 class456_sub1_sub1;
						if (bool_104_) {
							Class456_Sub1_Sub1_Sub2 class456_sub1_sub1_sub2 = (new Class456_Sub1_Sub1_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_90_, bool));
							if (class456_sub1_sub1_sub2.method388((byte) 0))
								class456_sub1_sub1_sub2.method386(class106, -2073313960);
							class456_sub1_sub1 = class456_sub1_sub1_sub2;
						} else
							class456_sub1_sub1 = (new Class456_Sub1_Sub1_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_90_, i_92_, i_93_));
						aClass523_3156.method6237(i_86_, i_87_, i_88_, class456_sub1_sub1, -2146101086);
					}
				} else if ((1870735441 * Class516.aClass516_5739.anInt5742 == i_91_) || (1870735441 * Class516.aClass516_5740.anInt5742 == i_91_)) {
					Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1 = null;
					Class456_Sub1_Sub2 class456_sub1_sub2;
					int i_105_;
					if (bool_104_) {
						Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1_106_ = (new Class456_Sub1_Sub2_Sub1(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_87_, i_87_ + i_95_ - 1, i_88_, i_96_ + i_88_ - 1, i_91_, i_90_, bool, (class509.aClass512_5683 != Class512.aClass512_5699)));
						i_105_ = class456_sub1_sub2_sub1_106_.method10479(-1014640472);
						class456_sub1_sub2 = class456_sub1_sub2_sub1_106_;
						class456_sub1_sub2_sub1 = class456_sub1_sub2_sub1_106_;
					} else {
						class456_sub1_sub2 = (new Class456_Sub1_Sub2_Sub2(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_87_, i_95_ + i_87_ - 1, i_88_, i_96_ + i_88_ - 1, i_91_, i_90_, i_92_, i_93_, (class509.aClass512_5683 != Class512.aClass512_5699)));
						i_105_ = 15;
					}
					if (aClass523_3156.method6232(class456_sub1_sub2, false, 464698929)) {
						if (class456_sub1_sub2_sub1 != null && class456_sub1_sub2_sub1.method388((byte) 0))
							class456_sub1_sub2_sub1.method386(class106, -748352579);
						if (class509.aBool5648 && aBool3144) {
							if (i_105_ > 30)
								i_105_ = 30;
							for (int i_107_ = 0; i_107_ <= i_95_; i_107_++) {
								for (int i_108_ = 0; i_108_ <= i_96_; i_108_++)
									class174.method2711(i_107_ + i_87_, i_88_ + i_108_, i_105_);
							}
						}
					}
				} else if (Class572_Sub16_Sub4.method10068(i_91_, (short) 3708) || Class85.method1272(i_91_, (short) 997)) {
					Class456_Sub1_Sub2 class456_sub1_sub2;
					if (bool_104_) {
						Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1 = (new Class456_Sub1_Sub2_Sub1(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_87_, i_95_ + i_87_ - 1, i_88_, i_96_ + i_88_ - 1, i_91_, i_90_, bool, true));
						if (class456_sub1_sub2_sub1.method388((byte) 0))
							class456_sub1_sub2_sub1.method386(class106, -557696794);
						class456_sub1_sub2 = class456_sub1_sub2_sub1;
					} else
						class456_sub1_sub2 = (new Class456_Sub1_Sub2_Sub2(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_86_, i, i_102_, i_101_, i_103_, aBool3140, i_87_, i_95_ + i_87_ - 1, i_88_, i_96_ + i_88_ - 1, i_91_, i_90_, i_92_, i_93_, true));
					aClass523_3156.method6232(class456_sub1_sub2, false, 370894428);
					if (aBool3144 && !aBool3140 && Class572_Sub16_Sub4.method10068(i_91_, (short) 5605) && (i_91_ != Class516.aClass516_5730.anInt5742 * 1870735441) && i_86_ > 0 && 2061831979 * class509.anInt5680 != 0)
						aByteArrayArrayArray3148[i_86_][i_87_][i_88_] |= 0x4;
				} else if (method8816(class106, i_91_, i_90_, bool_104_, class509, i_92_, i_93_, i_86_, i, i_102_, i_101_, i_103_, i_87_, i_88_, bool, class174, i_95_, i_96_, (short) 12449) || method8811(class106, i_91_, i_90_, bool_104_, class509, i_92_, i_93_, i_86_, i, i_102_, i_101_, i_103_, i_87_, i_88_, (short) -15244)) {
					/* empty */
				}
			}
		}
	}

	boolean method8811(Class106 class106, int i, int i_109_, boolean bool, ObjectDefinitions class509, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, short i_119_) {
		if (i == 1870735441 * Class516.aClass516_5723.anInt5742) {
			Class456_Sub1_Sub3 class456_sub1_sub3;
			if (bool) {
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1 = new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, i_109_);
				if (class456_sub1_sub3_sub1.method388((byte) 0))
					class456_sub1_sub3_sub1.method386(class106, -1644990310);
				class456_sub1_sub3 = class456_sub1_sub3_sub1;
			} else
				class456_sub1_sub3 = new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, i_109_, i_110_, i_111_);
			aClass523_3156.method6290(i_112_, i_117_, i_118_, class456_sub1_sub3, null, 1312576291);
			return true;
		}
		if (i == Class516.aClass516_5725.anInt5742 * 1870735441) {
			int i_120_ = 65;
			Interface65 interface65 = (Interface65) aClass523_3156.method6277(i_112_, i_117_, i_118_, -1982419800);
			if (null != interface65)
				i_120_ = (((ObjectDefinitions) (((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(interface65.method136(-2045839222), 1267055092))).anInt5637) * -174948383 + 1;
			Class456_Sub1_Sub3 class456_sub1_sub3;
			if (bool) {
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1 = (new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, anIntArray9442[i_109_] * i_120_, i_120_ * anIntArray9443[i_109_], i, i_109_));
				if (class456_sub1_sub3_sub1.method388((byte) 0))
					class456_sub1_sub3_sub1.method386(class106, 253920443);
				class456_sub1_sub3 = class456_sub1_sub3_sub1;
			} else
				class456_sub1_sub3 = (new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, i_120_ * anIntArray9442[i_109_], i_120_ * anIntArray9443[i_109_], i, i_109_, i_110_, i_111_));
			aClass523_3156.method6290(i_112_, i_117_, i_118_, class456_sub1_sub3, null, -1126271496);
			return true;
		}
		if (i == 1870735441 * Class516.aClass516_5726.anInt5742) {
			int i_121_ = 33;
			Interface65 interface65 = (Interface65) aClass523_3156.method6277(i_112_, i_117_, i_118_, -1827787629);
			if (null != interface65)
				i_121_ = (((ObjectDefinitions) (((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(interface65.method136(-1774988127), -904903146))).anInt5637) * -174948383 / 2 + 1;
			Class456_Sub1_Sub3 class456_sub1_sub3;
			if (bool) {
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1 = (new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, i_121_ * anIntArray9442[i_109_], anIntArray9443[i_109_] * i_121_, i, i_109_ + 4));
				if (class456_sub1_sub3_sub1.method388((byte) 0))
					class456_sub1_sub3_sub1.method386(class106, -1919745386);
				class456_sub1_sub3 = class456_sub1_sub3_sub1;
			} else
				class456_sub1_sub3 = (new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, i_121_ * anIntArray9444[i_109_], i_121_ * anIntArray9445[i_109_], i, 4 + i_109_, i_110_, i_111_));
			aClass523_3156.method6290(i_112_, i_117_, i_118_, class456_sub1_sub3, null, 1533441048);
			return true;
		}
		if (Class516.aClass516_5727.anInt5742 * 1870735441 == i) {
			int i_122_ = 2 + i_109_ & 0x3;
			Class456_Sub1_Sub3 class456_sub1_sub3;
			if (bool) {
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1 = new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, 4 + i_122_);
				if (class456_sub1_sub3_sub1.method388((byte) 0))
					class456_sub1_sub3_sub1.method386(class106, -1241969792);
				class456_sub1_sub3 = class456_sub1_sub3_sub1;
			} else
				class456_sub1_sub3 = new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, i_122_ + 4, i_110_, i_111_);
			aClass523_3156.method6290(i_112_, i_117_, i_118_, class456_sub1_sub3, null, -247169435);
			return true;
		}
		if (i == 1870735441 * Class516.aClass516_5731.anInt5742) {
			int i_123_ = 2 + i_109_ & 0x3;
			int i_124_ = 33;
			Interface65 interface65 = (Interface65) aClass523_3156.method6277(i_112_, i_117_, i_118_, -1469765006);
			if (null != interface65)
				i_124_ = (((ObjectDefinitions) (((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(interface65.method136(-2080242997), 332406453))).anInt5637) * -174948383 / 2 + 1;
			Class456_Sub1_Sub3 class456_sub1_sub3;
			Class456_Sub1_Sub3 class456_sub1_sub3_125_;
			if (bool) {
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1 = (new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, anIntArray9444[i_109_] * i_124_, i_124_ * anIntArray9445[i_109_], i, i_109_ + 4));
				Class456_Sub1_Sub3_Sub1 class456_sub1_sub3_sub1_126_ = new Class456_Sub1_Sub3_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, i_123_ + 4);
				if (class456_sub1_sub3_sub1.method388((byte) 0))
					class456_sub1_sub3_sub1.method386(class106, -686901636);
				if (class456_sub1_sub3_sub1_126_.method388((byte) 0))
					class456_sub1_sub3_sub1_126_.method386(class106, -812009647);
				class456_sub1_sub3 = class456_sub1_sub3_sub1;
				class456_sub1_sub3_125_ = class456_sub1_sub3_sub1_126_;
			} else {
				Class456_Sub1_Sub3_Sub2 class456_sub1_sub3_sub2 = (new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, ((Class280_Sub1) this).aClass639_Sub16_9448, class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, anIntArray9444[i_109_] * i_124_, i_124_ * anIntArray9445[i_109_], i, i_109_ + 4, i_110_, i_111_));
				Class456_Sub1_Sub3_Sub2 class456_sub1_sub3_sub2_127_ = new Class456_Sub1_Sub3_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_112_, i_113_, i_114_, i_115_, i_116_, aBool3140, 0, 0, i, i_123_ + 4, i_110_, i_111_);
				class456_sub1_sub3 = class456_sub1_sub3_sub2;
				class456_sub1_sub3_125_ = class456_sub1_sub3_sub2_127_;
			}
			aClass523_3156.method6290(i_112_, i_117_, i_118_, class456_sub1_sub3, class456_sub1_sub3_125_, 651973359);
			return true;
		}
		return false;
	}

	Interface65 method8812(int i, int i_128_, int i_129_, int i_130_, int i_131_) {
		Interface65 interface65 = null;
		if (i_128_ == 0)
			interface65 = (Interface65) aClass523_3156.method6277(i, i_129_, i_130_, -2141513461);
		if (1 == i_128_)
			interface65 = (Interface65) aClass523_3156.method6251(i, i_129_, i_130_, -2110357359);
		if (i_128_ == 2)
			interface65 = ((Interface65) aClass523_3156.method6246(i, i_129_, i_130_, client.anInterface62_8873, (byte) 18));
		if (i_128_ == 3)
			interface65 = (Interface65) aClass523_3156.method6254(i, i_129_, i_130_, 213020315);
		return interface65;
	}

	public final void method8813(Class106 class106, boolean bool, byte i) {
		aClass523_3156.method6285();
		if (!bool) {
			if (anInt3186 * 1097116465 > 1) {
				for (int i_132_ = 0; i_132_ < anInt3137 * -113535507; i_132_++) {
					for (int i_133_ = 0; i_133_ < anInt3159 * -686830021; i_133_++) {
						if (2 == ((aClass274_3177.aByteArrayArrayArray2909[1][i_132_][i_133_]) & 0x2))
							aClass523_3156.method6226(i_132_, i_133_, (byte) -18);
					}
				}
			}
			for (int i_134_ = 0; i_134_ < anInt3186 * 1097116465; i_134_++) {
				for (int i_135_ = 0; i_135_ <= anInt3159 * -686830021; i_135_++) {
					for (int i_136_ = 0; i_136_ <= -113535507 * anInt3137; i_136_++) {
						if (0 != ((aByteArrayArrayArray3148[i_134_][i_136_][i_135_]) & 0x4)) {
							int i_137_ = i_136_;
							int i_138_ = i_136_;
							int i_139_ = i_135_;
							int i_140_;
							for (i_140_ = i_135_; (i_139_ > 0 && 0 != ((aByteArrayArrayArray3148[i_134_][i_136_][i_139_ - 1]) & 0x4) && i_140_ - i_139_ < 10); i_139_--) {
								/* empty */
							}
							for (/**/; (i_140_ < anInt3159 * -686830021 && ((aByteArrayArrayArray3148[i_134_][i_136_][i_140_ + 1]) & 0x4) != 0 && i_140_ - i_139_ < 10); i_140_++) {
								/* empty */
							}
							while_65_: for (/**/; i_137_ > 0 && i_138_ - i_137_ < 10; i_137_--) {
								for (int i_141_ = i_139_; i_141_ <= i_140_; i_141_++) {
									if (0 == ((aByteArrayArrayArray3148[i_134_][i_137_ - 1][i_141_]) & 0x4))
										break while_65_;
								}
							}
							while_66_: for (/**/; (i_138_ < anInt3137 * -113535507 && i_138_ - i_137_ < 10); i_138_++) {
								for (int i_142_ = i_139_; i_142_ <= i_140_; i_142_++) {
									if (((aByteArrayArrayArray3148[i_134_][1 + i_138_][i_142_]) & 0x4) == 0)
										break while_66_;
								}
							}
							if ((i_140_ - i_139_ + 1) * (i_138_ - i_137_ + 1) >= 4) {
								int i_143_ = (anIntArrayArrayArray3141[i_134_][i_137_][i_139_]);
								aClass523_3156.aClass533_5828.method6358(4, i_134_, i_137_ << 9, 512 + (i_138_ << 9), i_139_ << 9, (i_140_ << 9) + 512, i_143_, i_143_);
								for (int i_144_ = i_137_; i_144_ <= i_138_; i_144_++) {
									for (int i_145_ = i_139_; i_145_ <= i_140_; i_145_++)
										aByteArrayArrayArray3148[i_134_][i_144_][i_145_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass523_3156.aClass533_5828.method6347();
		}
		aByteArrayArrayArray3148 = null;
	}

	static {
		aBool9437 = false;
		anIntArray9442 = new int[] { 1, 0, -1, 0 };
		anIntArray9443 = new int[] { 0, -1, 0, 1 };
		anIntArray9444 = new int[] { 1, -1, -1, 1 };
		anIntArray9445 = new int[] { -1, -1, 1, 1 };
	}

	public final void method8814(Class106 class106, byte[] is, int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, byte i_152_) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		int i_153_ = -1;
		for (;;) {
			int i_154_ = class572_sub15.readSmart2(-1692760696);
			if (i_154_ == 0)
				break;
			i_153_ += i_154_;
			int i_155_ = 0;
			for (;;) {
				int i_156_ = class572_sub15.readUnsignedSmart(1980962262);
				if (i_156_ == 0)
					break;
				i_155_ += i_156_ - 1;
				int i_157_ = i_155_ & 0x3f;
				int i_158_ = i_155_ >> 6 & 0x3f;
				int i_159_ = i_155_ >> 12;
				int i_160_ = class572_sub15.readUnsignedByte(803570411);
				int i_161_ = i_160_ >> 2;
				int i_162_ = i_160_ & 0x3;
				if (i_159_ == i_148_ && i_158_ >= i_149_ && i_158_ < 8 + i_149_ && i_157_ >= i_150_ && i_157_ < 8 + i_150_) {
					ObjectDefinitions class509 = ((ObjectDefinitions) ((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(i_153_, 486255221));
					int i_163_;
					int i_164_;
					if ((i_162_ & 0x1) == 0) {
						i_163_ = class509.sizeX * -876498849;
						i_164_ = class509.sizeY * 1922784011;
					} else {
						i_163_ = class509.sizeY * 1922784011;
						i_164_ = -876498849 * class509.sizeX;
					}
					int i_165_ = i_146_ + Class286.method3860(i_158_ & 0x7, i_157_ & 0x7, i_151_, (-876498849 * class509.sizeX), (1922784011 * class509.sizeY), i_162_, 1067554713);
					int i_166_ = i_147_ + Class291.method3943(i_158_ & 0x7, i_157_ & 0x7, i_151_, (-876498849 * class509.sizeX), (class509.sizeY * 1922784011), i_162_, 1358446638);
					int i_167_ = i_165_ + i_163_;
					int i_168_ = i_166_ + i_164_;
					if (i_165_ < anInt3137 * -113535507 && i_166_ < anInt3159 * -686830021 && i_167_ > 0 && i_168_ > 0 && ((1870735441 * Class516.aClass516_5739.anInt5742 == i_161_) || (1870735441 * Class516.aClass516_5740.anInt5742 == i_161_) || (i_165_ > 0 && i_166_ > 0 && i_165_ < anInt3137 * -113535507 - 1 && i_166_ < -686830021 * anInt3159 - 1)))
						method8810(class106, i, i, i_165_, i_166_, i_153_, i_162_ + i_151_ & 0x3, i_161_, -1, 0, 1790815496);
				}
			}
		}
	}

	public Class280_Sub1(Class523 class523, Class639_Sub16 class639_sub16, int i, int i_169_, int i_170_, boolean bool, Class274 class274, Class501 class501) {
		super(class523, i, i_169_, i_170_, bool, Class131.aClass639_Sub2_1540, Class314.aClass639_Sub6_3814, class274);
		((Class280_Sub1) this).aClass639_Sub16_9448 = class639_sub16;
		((Class280_Sub1) this).aClass501_9447 = class501;
	}

	void method8815(Class106 class106, int i, int i_171_, int i_172_, int i_173_, byte i_174_) {
		Interface65 interface65 = method8812(i, i_171_, i_172_, i_173_, -2126318490);
		if (interface65 != null) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class280_Sub1) this).aClass639_Sub16_9448.getDefinition(interface65.method136(-1477276134), 1080692330)));
			int i_175_ = interface65.method304(916290143);
			int i_176_ = interface65.method383(-167925519);
			if (class509.method6049(-1504280342))
				Class133_Sub5.method9344(i, i_172_, i_173_, class509, -1178642031);
			if (interface65.method388((byte) 0))
				interface65.method390(class106, (byte) 1);
			if (i_171_ == 0) {
				aClass523_3156.method6243(i, i_172_, i_173_, 1968079517);
				aClass523_3156.method6244(i, i_172_, i_173_, -600395737);
				if (2061831979 * class509.anInt5680 == 1) {
					if (i_176_ == 0)
						aClass523_3156.aClass533_5828.method6349(1, i, i_172_, i_173_);
					else if (1 == i_176_)
						aClass523_3156.aClass533_5828.method6349(2, i, i_172_, 1 + i_173_);
					else if (i_176_ == 2)
						aClass523_3156.aClass533_5828.method6349(1, i, i_172_ + 1, i_173_);
					else if (i_176_ == 3)
						aClass523_3156.aClass533_5828.method6349(2, i, i_172_, i_173_);
				}
			} else if (1 == i_171_) {
				aClass523_3156.method6245(i, i_172_, i_173_, -71736120);
				aClass523_3156.method6264(i, i_172_, i_173_, -255705864);
			} else if (2 == i_171_) {
				aClass523_3156.method6247(i, i_172_, i_173_, client.anInterface62_8873, (byte) -38);
				if (i_175_ == Class516.aClass516_5720.anInt5742 * 1870735441) {
					if (0 == (i_176_ & 0x1))
						aClass523_3156.aClass533_5828.method6349(8, i, i_172_, i_173_);
					else
						aClass523_3156.aClass533_5828.method6349(16, i, i_172_, i_173_);
				}
			} else if (i_171_ == 3)
				aClass523_3156.method6275(i, i_172_, i_173_, (short) 170);
		}
	}

	boolean method8816(Class106 class106, int i, int i_177_, boolean bool, ObjectDefinitions class509, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, boolean bool_187_, Class174 class174, int i_188_, int i_189_, short i_190_) {
		if (i == Class516.aClass516_5743.anInt5742 * 1870735441) {
			int i_191_ = 2061831979 * class509.anInt5680;
			if (aBool9437 && 2061831979 * class509.anInt5680 == -1)
				i_191_ = 1;
			Class456_Sub1_Sub4 class456_sub1_sub4;
			if (bool) {
				Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = new Class456_Sub1_Sub4_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, bool_187_);
				if (class456_sub1_sub4_sub1.method388((byte) 0))
					class456_sub1_sub4_sub1.method386(class106, -1494287052);
				class456_sub1_sub4 = class456_sub1_sub4_sub1;
			} else
				class456_sub1_sub4 = new Class456_Sub1_Sub4_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, i_178_, i_179_);
			aClass523_3156.method6239(i_180_, i_185_, i_186_, class456_sub1_sub4, null, -1811655234);
			if (0 == i_177_) {
				if (aBool3144 && class509.aBool5648) {
					class174.method2711(i_185_, i_186_, 50);
					class174.method2711(i_185_, 1 + i_186_, 50);
				}
				if (i_191_ == 1 && !aBool3140)
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, class509.anInt5664 * -1015120561);
			} else if (1 == i_177_) {
				if (aBool3144 && class509.aBool5648) {
					class174.method2711(i_185_, i_186_ + 1, 50);
					class174.method2711(1 + i_185_, i_186_ + 1, 50);
				}
				if (i_191_ == 1 && !aBool3140)
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, i_186_ + 1, 1512293311 * class509.anInt5632, -(-1015120561 * class509.anInt5664));
			} else if (2 == i_177_) {
				if (aBool3144 && class509.aBool5648) {
					class174.method2711(i_185_ + 1, i_186_, 50);
					class174.method2711(i_185_ + 1, 1 + i_186_, 50);
				}
				if (i_191_ == 1 && !aBool3140)
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_ + 1, i_186_, class509.anInt5632 * 1512293311, -(-1015120561 * class509.anInt5664));
			} else if (3 == i_177_) {
				if (aBool3144 && class509.aBool5648) {
					class174.method2711(i_185_, i_186_, 50);
					class174.method2711(1 + i_185_, i_186_, 50);
				}
				if (1 == i_191_ && !aBool3140)
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, -1015120561 * class509.anInt5664);
			}
			if (-174948383 * class509.anInt5637 != 64)
				aClass523_3156.method6292(i_180_, i_185_, i_186_, class509.anInt5637 * -174948383, -421724041);
			return true;
		}
		if (i == Class516.aClass516_5738.anInt5742 * 1870735441) {
			Class456_Sub1_Sub4 class456_sub1_sub4;
			if (bool) {
				Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = new Class456_Sub1_Sub4_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, bool_187_);
				if (class456_sub1_sub4_sub1.method388((byte) 0))
					class456_sub1_sub4_sub1.method386(class106, 436745622);
				class456_sub1_sub4 = class456_sub1_sub4_sub1;
			} else
				class456_sub1_sub4 = new Class456_Sub1_Sub4_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, i_178_, i_179_);
			aClass523_3156.method6239(i_180_, i_185_, i_186_, class456_sub1_sub4, null, -1850904645);
			if (class509.aBool5648 && aBool3144) {
				if (i_177_ == 0)
					class174.method2711(i_185_, 1 + i_186_, 50);
				else if (1 == i_177_)
					class174.method2711(1 + i_185_, i_186_ + 1, 50);
				else if (i_177_ == 2)
					class174.method2711(1 + i_185_, i_186_, 50);
				else if (i_177_ == 3)
					class174.method2711(i_185_, i_186_, 50);
			}
			return true;
		}
		if (1870735441 * Class516.aClass516_5729.anInt5742 == i) {
			int i_192_ = 1 + i_177_ & 0x3;
			Class456_Sub1_Sub4 class456_sub1_sub4;
			Class456_Sub1_Sub4 class456_sub1_sub4_193_;
			if (bool) {
				Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = new Class456_Sub1_Sub4_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, 4 + i_177_, bool_187_);
				Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1_194_ = new Class456_Sub1_Sub4_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_192_, bool_187_);
				if (class456_sub1_sub4_sub1.method388((byte) 0))
					class456_sub1_sub4_sub1.method386(class106, -1515388356);
				if (class456_sub1_sub4_sub1_194_.method388((byte) 0))
					class456_sub1_sub4_sub1_194_.method386(class106, -1596548528);
				class456_sub1_sub4 = class456_sub1_sub4_sub1;
				class456_sub1_sub4_193_ = class456_sub1_sub4_sub1_194_;
			} else {
				class456_sub1_sub4 = new Class456_Sub1_Sub4_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_ + 4, i_178_, i_179_);
				class456_sub1_sub4_193_ = new Class456_Sub1_Sub4_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_192_, i_178_, i_179_);
			}
			aClass523_3156.method6239(i_180_, i_185_, i_186_, class456_sub1_sub4, class456_sub1_sub4_193_, -2145493126);
			if ((class509.anInt5680 * 2061831979 == 1 || aBool9437 && 2061831979 * class509.anInt5680 == -1) && !aBool3140) {
				if (i_177_ == 0) {
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, -1015120561 * class509.anInt5664);
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, 1 + i_186_, class509.anInt5632 * 1512293311, -1015120561 * class509.anInt5664);
				} else if (1 == i_177_) {
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_ + 1, i_186_, class509.anInt5632 * 1512293311, -1015120561 * class509.anInt5664);
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, 1 + i_186_, class509.anInt5632 * 1512293311, -1015120561 * class509.anInt5664);
				} else if (i_177_ == 2) {
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_ + 1, i_186_, class509.anInt5632 * 1512293311, class509.anInt5664 * -1015120561);
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, class509.anInt5664 * -1015120561);
				} else if (i_177_ == 3) {
					aClass523_3156.aClass533_5828.method6348(1, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, class509.anInt5664 * -1015120561);
					aClass523_3156.aClass533_5828.method6348(2, i_180_, i_185_, i_186_, class509.anInt5632 * 1512293311, class509.anInt5664 * -1015120561);
				}
			}
			if (class509.anInt5637 * -174948383 != 64)
				aClass523_3156.method6292(i_180_, i_185_, i_186_, class509.anInt5637 * -174948383, -421724041);
			return true;
		}
		if (1870735441 * Class516.aClass516_5728.anInt5742 == i) {
			Class456_Sub1_Sub4 class456_sub1_sub4;
			if (bool) {
				Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = new Class456_Sub1_Sub4_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, bool_187_);
				if (class456_sub1_sub4_sub1.method388((byte) 0))
					class456_sub1_sub4_sub1.method386(class106, -1872780724);
				class456_sub1_sub4 = class456_sub1_sub4_sub1;
			} else
				class456_sub1_sub4 = new Class456_Sub1_Sub4_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i, i_177_, i_178_, i_179_);
			aClass523_3156.method6239(i_180_, i_185_, i_186_, class456_sub1_sub4, null, -1334414673);
			if (class509.aBool5648 && aBool3144) {
				if (0 == i_177_)
					class174.method2711(i_185_, 1 + i_186_, 50);
				else if (1 == i_177_)
					class174.method2711(1 + i_185_, 1 + i_186_, 50);
				else if (i_177_ == 2)
					class174.method2711(i_185_ + 1, i_186_, 50);
				else if (i_177_ == 3)
					class174.method2711(i_185_, i_186_, 50);
			}
			return true;
		}
		if (i == Class516.aClass516_5720.anInt5742 * 1870735441) {
			Class456_Sub1_Sub2 class456_sub1_sub2;
			if (bool) {
				Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1 = new Class456_Sub1_Sub2_Sub1(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i_185_, i_185_, i_186_, i_186_, i, i_177_, bool_187_, true);
				if (class456_sub1_sub2_sub1.method388((byte) 0))
					class456_sub1_sub2_sub1.method386(class106, -1919170375);
				class456_sub1_sub2 = class456_sub1_sub2_sub1;
			} else
				class456_sub1_sub2 = new Class456_Sub1_Sub2_Sub2(aClass523_3156, class106, (((Class280_Sub1) this).aClass639_Sub16_9448), class509, i_180_, i_181_, i_182_, i_183_, i_184_, aBool3140, i_185_, i_188_ + i_185_ - 1, i_186_, i_186_ + i_189_ - 1, i, i_177_, i_178_, i_179_, true);
			aClass523_3156.method6232(class456_sub1_sub2, false, -236726206);
			if (2061831979 * class509.anInt5680 == 1 && !aBool3140) {
				int i_195_;
				if (0 == (i_177_ & 0x1))
					i_195_ = 8;
				else
					i_195_ = 16;
				aClass523_3156.aClass533_5828.method6348(i_195_, i_180_, i_185_, i_186_, (class509.anInt5632 * 1512293311), 0);
			}
			if (-174948383 * class509.anInt5637 != 64)
				aClass523_3156.method6292(i_180_, i_185_, i_186_, class509.anInt5637 * -174948383, -421724041);
			return true;
		}
		return false;
	}

	public static void method8817(float f, Class240 class240, Class230 class230, Class240 class240_196_, Class240 class240_197_, Class240 class240_198_, Class240 class240_199_, float f_200_, float f_201_, float f_202_, float f_203_, short i) {
		if (!class240_196_.method3271(class240)) {
			Class240 class240_204_ = Class240.method3316(0.0F, 0.0F, 0.0F);
			Class240 class240_205_ = Class240.method3276(Class240.method3277(class240_196_, class240));
			class240_205_.method3288(class230);
			Class240 class240_206_ = Class240.method3277(class240_205_, class240_204_);
			float f_207_ = class240_206_.method3301();
			if (f_200_ > 0.0F) {
				class240_198_ = Class240.method3276(class240_198_);
				class240_198_.method3284(f_207_ / f_200_ * f_201_);
			}
			if (Float.POSITIVE_INFINITY == class240_198_.aFloat2653 || Float.isNaN(class240.aFloat2653) || f_207_ > f_202_ || f_207_ < f_203_) {
				class240.method3269(class240_196_);
				class240_197_.method3270();
			} else {
				class230.method3175();
				Class240 class240_208_ = Class240.method3316(1.0F, 0.0F, 0.0F);
				Class240 class240_209_ = Class240.method3316(0.0F, 1.0F, 0.0F);
				Class240 class240_210_ = Class240.method3316(0.0F, 0.0F, 1.0F);
				class240_208_.method3288(class230);
				class240_209_.method3288(class230);
				class240_210_.method3288(class230);
				Class240 class240_211_ = Class240.method3316(Class240.method3275(class240_208_, class240_197_), Class240.method3275(class240_209_, class240_197_), Class240.method3275(class240_210_, class240_197_));
				Class240 class240_212_ = Class240.method3276(class240_211_);
				class240_212_.method3282();
				Class240 class240_213_ = Class240.method3263(Class240.method3283(class240_212_, class240_212_), Class240.method3287(class240_198_, 2.0F));
				Class240 class240_214_ = Class240.method3276(class240_206_);
				class240_214_.method3282();
				Class240 class240_215_ = Class240.method3276(class240_211_);
				if (class240_213_.aFloat2653 > class240_214_.aFloat2653) {
					if (class240_206_.aFloat2653 < 0.0F) {
						class240_215_.aFloat2653 += class240_198_.aFloat2653 * f;
						if (class240_215_.aFloat2653 > 0.0F)
							class240_215_.aFloat2653 = 0.0F;
					} else {
						class240_215_.aFloat2653 -= f * class240_198_.aFloat2653;
						if (class240_215_.aFloat2653 < 0.0F)
							class240_215_.aFloat2653 = 0.0F;
					}
				} else if (class240_212_.aFloat2653 < class240_199_.aFloat2653) {
					if (class240_206_.aFloat2653 < 0.0F) {
						class240_215_.aFloat2653 -= f * class240_198_.aFloat2653;
						if (class240_215_.aFloat2653 < -class240_199_.aFloat2653)
							class240_215_.aFloat2653 = -class240_199_.aFloat2653;
					} else {
						class240_215_.aFloat2653 += class240_198_.aFloat2653 * f;
						if (class240_215_.aFloat2653 > class240_199_.aFloat2653)
							class240_215_.aFloat2653 = class240_199_.aFloat2653;
					}
				}
				if (class240_213_.aFloat2656 > class240_214_.aFloat2656) {
					if (class240_206_.aFloat2656 < 0.0F) {
						class240_215_.aFloat2656 += class240_198_.aFloat2656 * f;
						if (class240_215_.aFloat2656 > 0.0F)
							class240_215_.aFloat2656 = 0.0F;
					} else {
						class240_215_.aFloat2656 -= class240_198_.aFloat2656 * f;
						if (class240_215_.aFloat2656 < 0.0F)
							class240_215_.aFloat2656 = 0.0F;
					}
				} else if (class240_212_.aFloat2656 < class240_199_.aFloat2656) {
					if (class240_206_.aFloat2656 < 0.0F) {
						class240_215_.aFloat2656 -= f * class240_198_.aFloat2656;
						if (class240_215_.aFloat2656 < -class240_199_.aFloat2656)
							class240_215_.aFloat2656 = -class240_199_.aFloat2656;
					} else {
						class240_215_.aFloat2656 += class240_198_.aFloat2656 * f;
						if (class240_215_.aFloat2656 > class240_199_.aFloat2656)
							class240_215_.aFloat2656 = class240_199_.aFloat2656;
					}
				}
				if (class240_213_.aFloat2657 > class240_214_.aFloat2657) {
					if (class240_206_.aFloat2657 < 0.0F) {
						class240_215_.aFloat2657 += class240_198_.aFloat2657 * f;
						if (class240_215_.aFloat2657 > 0.0F)
							class240_215_.aFloat2657 = 0.0F;
					} else {
						class240_215_.aFloat2657 -= class240_198_.aFloat2657 * f;
						if (class240_215_.aFloat2657 < 0.0F)
							class240_215_.aFloat2657 = 0.0F;
					}
				} else if (class240_212_.aFloat2657 < class240_199_.aFloat2657) {
					if (class240_206_.aFloat2657 < 0.0F) {
						class240_215_.aFloat2657 -= class240_198_.aFloat2657 * f;
						if (class240_215_.aFloat2657 < -class240_199_.aFloat2657)
							class240_215_.aFloat2657 = -class240_199_.aFloat2657;
					} else {
						class240_215_.aFloat2657 += f * class240_198_.aFloat2657;
						if (class240_215_.aFloat2657 > class240_199_.aFloat2657)
							class240_215_.aFloat2657 = class240_199_.aFloat2657;
					}
				}
				Class240 class240_216_ = Class240.method3287(class240_208_, class240_215_.aFloat2653);
				class240_216_.method3274(class240_209_, class240_215_.aFloat2656);
				class240_216_.method3274(class240_210_, class240_215_.aFloat2657);
				class240_197_.method3315(class240_216_, 0.8F);
				class240.method3305(Class240.method3287(class240_197_, f));
				class240_212_.method3261();
				class240_215_.method3261();
				class240_214_.method3261();
			}
		}
	}

	static Class414 method8818(int i, byte i_217_) {
		if (((Class414) Class414.aClass414_4919).anInt4921 * 1490236019 == i)
			return Class414.aClass414_4919;
		if (((Class414) Class414.aClass414_4918).anInt4921 * 1490236019 == i)
			return Class414.aClass414_4918;
		if (((Class414) Class414.aClass414_4920).anInt4921 * 1490236019 == i)
			return Class414.aClass414_4920;
		return null;
	}

	static final void method8819(int i) {
		if (1 != Class13.anInt97 * -465965699 && 100 != Class13.anInt97 * -465965699) {
			do {
				try {
					int i_218_;
					if (0 == -647473771 * Class13.anInt101 && Class13.anInt97 * -465965699 < 96)
						i_218_ = 500;
					else
						i_218_ = 2000;
					if (Class13.aBool67 && Class13.anInt97 * -465965699 >= 63)
						i_218_ = 6000;
					if ((Class13.anInt64 * -298874073 == 210 && 216 != -465965699 * Class13.anInt97 && -1586424751 * Class13.anInt106 != 42) || (Class13.anInt64 * -298874073 == 176 && 49 != Class13.anInt105 * 655322057 && 52 != Class13.anInt105 * 655322057))
						Class13.anInt100 += -2088187177;
					if (-1785739033 * Class13.anInt100 > i_218_) {
						Class13.aClass195_96.method2943(-1954214084);
						if (Class13.anInt101 * -647473771 < 3) {
							if (Class13.anInt64 * -298874073 == 210)
								Class633.aClass641_8197.method7596((byte) 46);
							else
								Class633.aClass641_8208.method7596((byte) -5);
							Class13.anInt100 = 0;
							Class13.anInt101 += -1768993347;
							Class13.anInt97 = -185065007;
						} else {
							Class13.anInt97 = 1307292629;
							Class276.method3715(-5, 1429119869);
							Class430.method5240(-50117002);
							break;
						}
					}
					if (Class13.anInt97 * -465965699 == 13) {
						if (210 == Class13.anInt64 * -298874073)
							Class13.aClass195_96.method2931((Class402_Sub1.method9215(Class633.aClass641_8197.method7594((short) -19607), 15000, 1267313657)), Class633.aClass641_8197.address, -1657220979);
						else
							Class13.aClass195_96.method2931((Class402_Sub1.method9215(Class633.aClass641_8208.method7594((short) 24368), 15000, 1474371408)), Class633.aClass641_8208.address, -1657220979);
						Class13.aClass195_96.method2926((byte) 26);
						Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
						if (Class13.aBool67) {
							class572_sub25.aRsByteBuffer.writeByte((Class315.aClass315_3815.anInt3827 * -540596227), -1384395473);
							class572_sub25.aRsByteBuffer.writeShort(0, -1718599984);
							int i_219_ = (-1585139053 * (class572_sub25.aRsByteBuffer.o));
							class572_sub25.aRsByteBuffer.writeInt(831, -1743753997);
							class572_sub25.aRsByteBuffer.writeInt(1, -1743753997);
							if (210 == -298874073 * Class13.anInt64)
								class572_sub25.aRsByteBuffer.writeByte((client.anInt8580 * 835742603 == 13 ? 1 : 0), -1384395473);
							RSByteBuffer class572_sub15 = Class502.method6003(-832324364);
							Class81.method1243(class572_sub15, (long) (-2082178003 * Class13.anInt68));
							Class677.aLong8557 = (4523376393117331477L * (long) Class13.anInt68);
							class572_sub15.writeByte((-2082178003 * Class13.anInt68), -1384395473);
							class572_sub15.writeByte(Class594.aClass435_7823.getId(366591320), -1384395473);
							class572_sub15.writeInt((client.anInt8808 * -1421244803), -1743753997);
							for (int i_220_ = 0; i_220_ < 5; i_220_++)
								class572_sub15.writeInt((int) (Math.random() * 9.9999999E7), -1743753997);
							class572_sub15.method8514(client.aLong8767 * 5568742277358735529L);
							class572_sub15.writeByte(((client.aClass437_8705.anInt5076) * 1002594281), -1384395473);
							class572_sub15.writeByte((int) (Math.random() * 9.9999999E7), -1384395473);
							class572_sub15.method8537(Class18.LOGIN_PUBLIC_EXPONENT, Class18.LOGIN_MODULUS, 1952155020);
							class572_sub25.aRsByteBuffer.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 4);
							class572_sub25.aRsByteBuffer.method8464(-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_219_, -1404479454);
						} else
							class572_sub25.aRsByteBuffer.writeByte((-540596227 * Class315.aClass315_3824.anInt3827), -1384395473);
						Class13.aClass195_96.method2929(class572_sub25, (byte) -6);
						Class13.aClass195_96.method2936((byte) -106);
						Class13.anInt97 = 1871365835;
					}
					if (31 == -465965699 * Class13.anInt97) {
						if (!Class13.aClass195_96.method2933(-1816564411).method6559(1, 1322393758))
							break;
						Class13.aClass195_96.method2933(-1987447086).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1881146409);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						int i_221_ = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedByte(9382386);
						if (i_221_ != 0) {
							Class13.anInt97 = 1307292629;
							Class133_Sub9.method9350(i_221_, (byte) 3);
							Class276.method3715(i_221_, 155618089);
							Class13.aClass195_96.method2943(-2061179994);
							Class430.method5240(374491642);
							break;
						}
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						if (Class13.aBool67)
							Class13.anInt97 = 5918790;
						else
							Class13.anInt97 = 2065309027;
					}
					if (46 == Class13.anInt97 * -465965699) {
						if (!Class13.aClass195_96.method2933(-2085701488).method6559(2, 881592187))
							break;
						Class13.aClass195_96.method2933(-1890756991).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 2, 1955716422);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedShort(647518597) * 310393755;
						Class13.anInt97 = -740260028;
					}
					if (52 == -465965699 * Class13.anInt97) {
						if (!Class13.aClass195_96.method2933(-1833298302).method6559(-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o), 1700142890))
							break;
						Class13.aClass195_96.method2933(-2054211093).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, -1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o), 2012775204);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method8530(Class345.anIntArray4373, 1562361153);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						String string = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readVersionedString(-1873272759);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						String string_222_ = Class212.aClass212_2455.method3063(-1850453998);
						Class447.method5347(string, true, string_222_, client.aBool8621, 1583244695);
						Class13.anInt97 = 755057003;
					}
					if (63 == -465965699 * Class13.anInt97) {
						if (!Class13.aClass195_96.method2933(-1811309601).method6559(1, 659561175))
							break;
						Class13.aClass195_96.method2933(-1823063408).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1392234956);
						if (((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff) == 1)
							Class13.anInt97 = 569991996;
					}
					if (76 == -465965699 * Class13.anInt97) {
						if (!Class13.aClass195_96.method2933(-1818353336).method6559(16, 1725937689))
							break;
						Class13.aClass195_96.method2933(-1948319284).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 16, 1482653591);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 671332784;
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method8530(Class345.anIntArray4373, 1056367598);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						Class13.aLong79 = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method8476((byte) 4) * 4922727120155625359L;
						Class13.aLong98 = (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method8476((byte) 4) * -2993361953026542521L);
						Class13.anInt97 = 2065309027;
					}
					if (87 == -465965699 * Class13.anInt97) {
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						Class13.aClass195_96.method2926((byte) 57);
						Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
						Class572_Sub15_Sub2 class572_sub15_sub2 = class572_sub25.aRsByteBuffer;
						if (210 == -298874073 * Class13.anInt64) {
							Class315 class315;
							if (Class13.aBool67)
								class315 = Class315.aClass315_3825;
							else
								class315 = Class315.aClass315_3822;
							class572_sub15_sub2.writeByte((class315.anInt3827 * -540596227), -1384395473);
							class572_sub15_sub2.writeShort(0, -1569920867);
							int i_223_ = -1585139053 * class572_sub15_sub2.o;
							int i_224_ = class572_sub15_sub2.o * -1585139053;
							if (!Class13.aBool67) {
								class572_sub15_sub2.writeInt(831, -1743753997);
								class572_sub15_sub2.writeInt(RS3Applet.MINOR_VERSION, -1743753997);
								class572_sub15_sub2.writeByte((13 == 835742603 * client.anInt8580 ? 1 : 0), -1384395473);
								i_224_ = (-1585139053 * class572_sub15_sub2.o);
								RSByteBuffer class572_sub15 = Class623.method7449(1573048970);
								class572_sub15_sub2.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 59);
								i_224_ = (class572_sub15_sub2.o * -1585139053);
								class572_sub15_sub2.writeByte((Class13.aLong79 * -1112276700564261009L == -1L) ? 1 : 0, -1384395473);
								if (-1112276700564261009L * Class13.aLong79 == -1L)
									class572_sub15_sub2.writeString(Class13.aString70, (byte) -36);
								else
									class572_sub15_sub2.method8514(-1112276700564261009L * Class13.aLong79);
							}
							class572_sub15_sub2.writeByte(Class344_Sub2.method9253(-1617460976), -1384395473);
							class572_sub15_sub2.writeShort((Class269.anInt2861 * 1960824389), -1640637417);
							class572_sub15_sub2.writeShort((-530390519 * (Class584.anInt7739)), -2053822345);
							class572_sub15_sub2.writeByte(Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(2089233650), -1384395473);
							Class324.method4145(class572_sub15_sub2, (byte) 1);
							class572_sub15_sub2.writeString(client.aString8561, (byte) -10);
							class572_sub15_sub2.writeInt((client.anInt8808 * -1421244803), -1743753997);
							RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(-986351768);
							class572_sub15_sub2.writeByte(((class572_sub15.o) * -1585139053), -1384395473);
							class572_sub15_sub2.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) -15);
							client.aBool8854 = true;
							RSByteBuffer class572_sub15_225_ = (new RSByteBuffer(Class272_Sub1.aClass572_Sub5_9450.method8377((short) 530)));
							Class272_Sub1.aClass572_Sub5_9450.method8376(class572_sub15_225_, -248085495);
							class572_sub15_sub2.writeBytes(class572_sub15_225_.b, 0, class572_sub15_225_.b.length, (byte) 18);
							class572_sub15_sub2.writeInt((client.anInt8614 * 1217022041), -1743753997);
							class572_sub15_sub2.writeInt((client.anInt8567 * 413351069), -1743753997);
							class572_sub15_sub2.writeInt((client.anInt8566 * 2093536371), -1743753997);
							class572_sub15_sub2.writeString((Class572_Sub25.aString9256), (byte) -88);
							class572_sub15_sub2.writeByte(null == client.aString8570 ? 0 : 1, -1384395473);
							if (null != client.aString8570)
								class572_sub15_sub2.writeString((client.aString8570), (byte) -75);
							class572_sub15_sub2.writeByte((client.aBool8559 ? 1 : 0), -1384395473);
							class572_sub15_sub2.writeByte((client.aBool8574 ? 1 : 0), -1384395473);
							class572_sub15_sub2.writeByte(1917276009 * Class382.anInt4603 & 0x1, -1384395473);
							class572_sub15_sub2.writeInt((client.anInt8773 * -321661039), -1743753997);
							class572_sub15_sub2.writeString(client.aString8838, (byte) -20);
							class572_sub15_sub2.writeByte((null == Class10.aClass641_48 || ((2112639107 * Class10.aClass641_48.id) != (Class633.aClass641_8197.id * 2112639107))) ? 1 : 0, -1384395473);
							class572_sub15_sub2.writeShort(((Class633.aClass641_8208.id) * 2112639107), -2021802297);
							class572_sub15_sub2.writeShort(((Class633.aClass641_8196.id) * 2112639107), -1097025693);
							Class249.method3439(class572_sub15_sub2, (short) 14138);
							class572_sub15_sub2.method8489(Class345.anIntArray4373, i_224_, -1585139053 * class572_sub15_sub2.o, 2122496836);
							class572_sub15_sub2.method8464((-1585139053 * class572_sub15_sub2.o - i_223_), -1404479454);
						} else {
							Class315 class315;
							if (Class13.aBool67)
								class315 = Class315.aClass315_3825;
							else
								class315 = Class315.aClass315_3818;
							class572_sub15_sub2.writeByte((-540596227 * (class315.anInt3827)), -1384395473);
							class572_sub15_sub2.writeShort(0, -1864653816);
							int i_226_ = class572_sub15_sub2.o * -1585139053;
							int i_227_ = class572_sub15_sub2.o * -1585139053;
							if (!Class13.aBool67) {
								class572_sub15_sub2.writeInt(831, -1743753997);
								class572_sub15_sub2.writeInt(RS3Applet.MINOR_VERSION, -1743753997);
								RSByteBuffer class572_sub15 = Class623.method7449(1573048970);
								class572_sub15_sub2.writeBytes(class572_sub15.b, 0, -1585139053 * class572_sub15.o, (byte) -9);
								i_227_ = (-1585139053 * class572_sub15_sub2.o);
								class572_sub15_sub2.writeByte(-1L == (-1112276700564261009L * Class13.aLong79) ? 1 : 0, -1384395473);
								if (-1L == -1112276700564261009L * Class13.aLong79)
									class572_sub15_sub2.writeString(Class13.aString70, (byte) -94);
								else
									class572_sub15_sub2.method8514(-1112276700564261009L * Class13.aLong79);
							}
							class572_sub15_sub2.writeByte(((client.aClass437_8705.anInt5076) * 1002594281), -1384395473);
							class572_sub15_sub2.writeByte(Class594.aClass435_7823.getId(1208482616), -1384395473);
							class572_sub15_sub2.writeByte(Class344_Sub2.method9253(323545830), -1384395473);
							class572_sub15_sub2.writeShort((1960824389 * (Class269.anInt2861)), -1297505193);
							class572_sub15_sub2.writeShort((-530390519 * (Class584.anInt7739)), -1884871747);
							class572_sub15_sub2.writeByte(Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(1365615582), -1384395473);
							Class324.method4145(class572_sub15_sub2, (byte) 1);
							class572_sub15_sub2.writeString(client.aString8561, (byte) -72);
							RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(-177889625);
							class572_sub15_sub2.writeByte((-1585139053 * (class572_sub15.o)), -1384395473);
							class572_sub15_sub2.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) -51);
							RSByteBuffer class572_sub15_228_ = (new RSByteBuffer(Class272_Sub1.aClass572_Sub5_9450.method8377((short) 530)));
							Class272_Sub1.aClass572_Sub5_9450.method8376(class572_sub15_228_, -248085495);
							class572_sub15_sub2.writeBytes(class572_sub15_228_.b, 0, class572_sub15_228_.b.length, (byte) -67);
							class572_sub15_sub2.writeInt((client.anInt8614 * 1217022041), -1743753997);
							class572_sub15_sub2.writeString((Class572_Sub25.aString9256), (byte) -87);
							class572_sub15_sub2.writeInt((client.anInt8808 * -1421244803), -1743753997);
							class572_sub15_sub2.writeInt((client.anInt8773 * -321661039), -1743753997);
							class572_sub15_sub2.writeString(client.aString8838, (byte) -98);
							class572_sub15_sub2.writeByte(1917276009 * Class382.anInt4603 & 0x1, -1384395473);
							Class249.method3439(class572_sub15_sub2, (short) 15139);
							class572_sub15_sub2.method8489(Class345.anIntArray4373, i_227_, class572_sub15_sub2.o * -1585139053, 2109420829);
							class572_sub15_sub2.method8464((-1585139053 * class572_sub15_sub2.o - i_226_), -1404479454);
						}
						Class13.aClass195_96.method2929(class572_sub25, (byte) -95);
						Class13.aClass195_96.method2936((byte) -18);
						Class13.aClass195_96.aClass650_2340 = new Class650(Class345.anIntArray4373);
						for (int i_229_ = 0; i_229_ < 4; i_229_++)
							Class345.anIntArray4373[i_229_] += 50;
						((Class195) Class13.aClass195_96).aClass650_2331 = new Class650(Class345.anIntArray4373);
						new Class650(Class345.anIntArray4373);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method10388(((Class195) Class13.aClass195_96).aClass650_2331, (byte) -41);
						Class345.anIntArray4373 = null;
						Class13.anInt97 = 946040800;
					}
					if (-465965699 * Class13.anInt97 == 96) {
						if (!Class13.aClass195_96.method2933(-2040543301).method6559(1, 2129661943))
							break;
						Class13.aClass195_96.method2933(-1858725985).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1312901002);
						int i_230_ = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedByte(563494976);
						((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
						if (21 == i_230_)
							Class13.anInt97 = 202821377;
						else {
							if (1 == i_230_) {
								Class13.anInt97 = 1880244020;
								Class276.method3715(i_230_, -869483083);
								break;
							}
							if (52 == i_230_) {
								Class34.anInt384 = 107753853 * i_230_;
								Class13.anInt97 = 2083065397;
							} else if (i_230_ == 2) {
								if (Class13.aBool116) {
									Class13.aBool116 = false;
									Class13.anInt97 = -185065007;
									break;
								}
								if (210 == -298874073 * Class13.anInt64) {
									Class306.clientConfigsDomain.method9960(-958887768);
									Class13.anInt97 = 405642754;
								} else
									Class13.anInt97 = -355333039;
							} else if (15 == i_230_) {
								((Class195) Class13.aClass195_96).anInt2333 = -895291654;
								Class13.anInt97 = -907568665;
							} else {
								if (23 == i_230_ && -647473771 * Class13.anInt101 < 3) {
									Class13.anInt100 = 0;
									Class13.anInt101 += -1768993347;
									Class13.anInt97 = -185065007;
									Class13.aClass195_96.method2943(-2106712848);
									break;
								}
								if (42 == i_230_) {
									Class13.anInt97 = -1092633672;
									Class276.method3715(i_230_, 1754215229);
									break;
								}
								if (Class13.anInt64 * -298874073 == 176 && i_230_ == 49 && 4 != client.anInt8580 * 835742603) {
									if (Class13.anInt105 * 655322057 != 52)
										Class276.method3715(i_230_, 548328653);
									break;
								}
								if (Class13.aBool66 && !Class13.aBool67 && -2082178003 * Class13.anInt68 != -1 && 35 == i_230_) {
									Class13.aBool67 = true;
									Class13.anInt100 = 0;
									Class13.anInt97 = -185065007;
									Class13.aClass195_96.method2943(-2078904781);
									break;
								}
								if (i_230_ == 53)
									Class13.anInt97 = 778732163;
								else {
									Class13.anInt97 = 1307292629;
									Class276.method3715(i_230_, 612084222);
									Class13.aClass195_96.method2943(-1739954945);
									Class430.method5240(-1558585585);
									break;
								}
							}
						}
					}
					if (125 == -465965699 * Class13.anInt97) {
						if (Class13.aClass195_96.method2933(-1943656180).method6559(1, 1672108985)) {
							Class13.aClass195_96.method2933(-2065001407).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1369478276);
							int i_231_ = ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff);
							Class13.anInt110 = i_231_ * -1799109718;
							Class13.anInt97 = 1307292629;
							Class276.method3715(21, 1857177266);
							Class13.aClass195_96.method2943(-2093982219);
							Class430.method5240(73457536);
						}
					} else if (-465965699 * Class13.anInt97 == 216) {
						if (Class13.aClass195_96.method2933(-1917448690).method6559(2, 746723696)) {
							Class13.aClass195_96.method2933(-1904126765).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 2, 1976741396);
							Class13.anInt113 = (((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[1]) & 0xff) + (((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff) << 8)) * -933068029;
							Class13.anInt97 = 946040800;
						}
					} else if (Class13.anInt97 * -465965699 == 247) {
						if (Class13.aClass195_96.method2933(-1797335091).method6559(4, 777739177)) {
							Class13.aClass195_96.method2933(-1832263257).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 4, 1876381003);
							Class13.anInt115 = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readInt(903626683) * 1483570923;
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							Class13.anInt97 = 1307292629;
							Class276.method3715(53, 1864770785);
							Class13.aClass195_96.method2943(-1624284517);
							Class430.method5240(-641886420);
						}
					} else if (196 == Class13.anInt97 * -465965699) {
						if (-376533035 * Class34.anInt384 == 29) {
							if (!Class13.aClass195_96.method2933(-2085859401).method6559(1, 1968280903))
								break;
							Class13.aClass195_96.method2933(-1957464283).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1802083894);
							Class13.anInt90 = (-394872319 * ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff));
						} else if (45 == -376533035 * Class34.anInt384) {
							if (!Class13.aClass195_96.method2933(-1996230406).method6559(3, 757322415))
								break;
							Class13.aClass195_96.method2933(-2060834207).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 3, 1713265712);
							Class13.anInt90 = (-394872319 * ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff));
							Class13.anInt111 = ((((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[1]) & 0xff) << 8) + ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[2]) & 0xff)) * -1150282425;
						} else
							throw new IllegalStateException();
						Class13.anInt97 = 1307292629;
						Class276.method3715(-376533035 * Class34.anInt384, -811813887);
						Class13.aClass195_96.method2943(-1639470159);
						Class430.method5240(-884095144);
						if (Class19.method692(835742603 * client.anInt8580, (byte) 4)) {
							Class439.method5276(true, (byte) 8);
							Class13.anInt106 = Class34.anInt384 * 1666922053;
						}
					} else if (225 == -465965699 * Class13.anInt97) {
						if (Class13.aClass195_96.method2933(-1924092529).method6559(2, 509330008)) {
							Class13.aClass195_96.method2933(-1824905187).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 2, 2123809541);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							Class285.anInt3419 = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedShort(647518597) * 52013433;
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							Class13.anInt97 = -343495459;
						}
					} else if (233 == Class13.anInt97 * -465965699) {
						if (Class13.aClass195_96.method2933(-1928387213).method6559(1142780105 * Class285.anInt3419, 657157429)) {
							Class13.aClass195_96.method2933(-2009001408).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, Class285.anInt3419 * 1142780105, 1923170364);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							byte[] is = (new byte[1142780105 * Class285.anInt3419 + 1]);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.method10393(is, 0, 1142780105 * Class285.anInt3419, 1956985323);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							RSByteBuffer class572_sub15 = new RSByteBuffer(is);
							String string = class572_sub15.readString(1295706626);
							Class611.method7271(string, true, client.aBool8621, (byte) 35);
							Class276.method3715(-376533035 * Class34.anInt384, -759590320);
							if (Class13.anInt64 * -298874073 == 176 && 4 != client.anInt8580 * 835742603)
								Class13.anInt97 = 946040800;
							else {
								Class13.anInt97 = 1307292629;
								Class13.aClass195_96.method2943(-1807383825);
								Class430.method5240(-2086134896);
							}
						}
					} else {
						if (-465965699 * Class13.anInt97 == 250) {
							if (!Class13.aClass195_96.method2933(-1908127036).method6559(2, 1982295899))
								break;
							Class13.aClass195_96.method2933(-2037192088).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 2, 1729126221);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							((Class195) Class13.aClass195_96).anInt2333 = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedShort(647518597) * -1699837821;
							Class13.anInt97 = 220577747;
						}
						if (-465965699 * Class13.anInt97 == 263) {
							if (!Class13.aClass195_96.method2933(-1826214396).method6559((((Class195) Class13.aClass195_96).anInt2333 * -875297237), 815658490))
								break;
							Class13.aClass195_96.method2933(-1861689181).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, (((Class195) Class13.aClass195_96).anInt2333 * -875297237), 2039846219);
							((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
							boolean bool = (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedByte(1999472983) == 1);
							while (((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o) * -1585139053) < (-875297237 * (((Class195) Class13.aClass195_96).anInt2333))) {
								Class323 class323 = (Class389.aClass202_Sub1_Sub2_4652.method9203((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330), 1636172509));
								Class306.clientConfigsDomain.anInterface71_1567.method443(380662693 * class323.anInt4079, class323.anObject4078, -1054136487);
							}
							if (bool) {
								Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
								Class572_Sub15_Sub2 class572_sub15_sub2 = class572_sub25.aRsByteBuffer;
								class572_sub15_sub2.writeByte((Class315.aClass315_3817.anInt3827 * -540596227), -1384395473);
								Class13.aClass195_96.method2929(class572_sub25, (byte) -85);
								Class13.aClass195_96.method2936((byte) 4);
								Class13.anInt97 = 17756370;
							} else
								Class13.anInt97 = 405642754;
						}
						if (138 == Class13.anInt97 * -465965699) {
							if (!Class13.aClass195_96.method2933(-2030904382).method6559(1, 2010652511))
								break;
							Class13.aClass195_96.method2933(-1993772669).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1830714085);
							int i_232_ = ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff);
							if (2 != i_232_) {
								if (i_232_ == 29 || i_232_ == 45) {
									Class34.anInt384 = 107753853 * i_232_;
									Class13.anInt97 = -1468682476;
								} else {
									Class13.anInt97 = 1307292629;
									Class276.method3715(i_232_, 1693247256);
									Class13.aClass195_96.method2943(-2139306661);
									Class430.method5240(383658720);
									if (Class19.method692((client.anInt8580 * 835742603), (byte) 4)) {
										Class439.method5276(true, (byte) 8);
										Class13.anInt106 = 2080945329 * i_232_;
									}
									break;
								}
								break;
							}
							Class13.anInt97 = -355333039;
						}
						if (141 == Class13.anInt97 * -465965699) {
							if (!Class13.aClass195_96.method2933(-1996311682).method6559(1, 1142221188))
								break;
							Class13.aClass195_96.method2933(-1954301951).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 1, 1318334885);
							Class465.anInt5236 = (2113210537 * ((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b[0]) & 0xff));
							Class13.anInt97 = -167308637;
						}
						if (151 == -465965699 * Class13.anInt97) {
							Class572_Sub15_Sub2 class572_sub15_sub2 = (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330);
							if (210 == Class13.anInt64 * -298874073) {
								if (!Class13.aClass195_96.method2933(-1837887805).method6559(-1912333415 * Class465.anInt5236, 49870813))
									break;
								Class13.aClass195_96.method2933(-1955749971).method6560(class572_sub15_sub2.b, 0, -1912333415 * Class465.anInt5236, 1534884364);
								class572_sub15_sub2.o = 0;
								Class104_Sub2.method9936(class572_sub15_sub2, (short) 1000);
								client.rights = class572_sub15_sub2.readUnsignedByte(386720697) * -419992949;
								client.anInt8702 = (class572_sub15_sub2.readUnsignedByte(1652442879) * -1214737179);
								client.aBool8734 = class572_sub15_sub2.readUnsignedByte(1133141183) == 1;
								client.aBool8596 = class572_sub15_sub2.readUnsignedByte(-62124077) == 1;
								client.aBool8736 = class572_sub15_sub2.readUnsignedByte(1168421519) == 1;
								client.aBool8738 = class572_sub15_sub2.readUnsignedByte(320674710) == 1;
								client.anInt8728 = class572_sub15_sub2.readUnsignedShort(647518597) * 1675423621;
								client.aBool8659 = class572_sub15_sub2.readUnsignedByte(1271970259) == 1;
								BaseVarType.anInt7965 = (class572_sub15_sub2.method8491(-1075736219) * -1091304041);
								client.aBool8731 = (class572_sub15_sub2.readUnsignedByte(26485428) == 1);
								Class7.aString38 = class572_sub15_sub2.readString(1295706626);
								Class133_Sub6.aLong9845 = ((class572_sub15_sub2.method8475(633597784) - Class69.method1067(-1716847362)) * 5347586602140463037L);
								client.aClass613_8605.method7288(685212190).method8964(client.aBool8731, 154782237);
								Class204.aClass602_2411.method7078(1625572382).method7288(410227846).method8964(client.aBool8731, -904861024);
								Class672.aClass639_Sub5_8533.method8899(client.aBool8731, (short) 255);
								Class197.aClass639_Sub15_2360.method8955(client.aBool8731, (byte) 1);
							} else {
								if (!Class13.aClass195_96.method2933(-2005990681).method6559(-1912333415 * Class465.anInt5236, 88740665))
									break;
								Class13.aClass195_96.method2933(-1961635564).method6560(class572_sub15_sub2.b, 0, Class465.anInt5236 * -1912333415, 1489612115);
								class572_sub15_sub2.o = 0;
								Class104_Sub2.method9936(class572_sub15_sub2, (short) 1000);
								client.rights = class572_sub15_sub2.readUnsignedByte(1391064240) * -419992949;
								client.anInt8702 = class572_sub15_sub2.readUnsignedByte(-93583157) * -1214737179;
								client.aBool8734 = (class572_sub15_sub2.readUnsignedByte(76748590) == 1);
								BaseVarType.anInt7965 = (class572_sub15_sub2.method8491(-1075736219) * -1091304041);
								Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte11820 = (byte) class572_sub15_sub2.readUnsignedByte(1645910060);
								client.aBool8596 = class572_sub15_sub2.readUnsignedByte(982300060) == 1;
								client.aBool8736 = class572_sub15_sub2.readUnsignedByte(1388606580) == 1;
								Class341.aLong4351 = (class572_sub15_sub2.method8476((byte) 4) * 4829452931188915117L);
								Class133_Sub6.aLong9845 = (((9220716807180722213L * Class341.aLong4351) - Class69.method1067(-2114022115) - class572_sub15_sub2.method8474(-1782546387)) * 5347586602140463037L);
								int i_233_ = class572_sub15_sub2.readUnsignedByte(1674866818);
								client.aBool8659 = 0 != (i_233_ & 0x1);
								Class633.aBool8209 = (i_233_ & 0x2) != 0;
								Class419.anInt4956 = class572_sub15_sub2.readInt(2073334419) * 1771123497;
								Class112.anInt1436 = (class572_sub15_sub2.readInt(1600729482) * -1301189225);
								Class614.anInt8038 = class572_sub15_sub2.readUnsignedShort(647518597) * 2019980237;
								Class598.anInt7851 = class572_sub15_sub2.readUnsignedShort(647518597) * -1264936993;
								Class375_Sub1.anInt9423 = class572_sub15_sub2.readUnsignedShort(647518597) * 554878635;
								Class128.anInt1525 = class572_sub15_sub2.readInt(-598515504) * -684269819;
								Class420.aClass20_4967 = new Class20(-1191963187 * Class128.anInt1525);
								new Thread(Class420.aClass20_4967).start();
								Class13.anInt118 = class572_sub15_sub2.readUnsignedByte(328187949) * -1365194469;
								Class423_Sub2.anInt9762 = class572_sub15_sub2.readUnsignedShort(647518597) * 1322490155;
								Class572_Sub12_Sub1.anInt11251 = class572_sub15_sub2.readUnsignedShort(647518597) * -68188525;
								Class442.aBool5131 = class572_sub15_sub2.readUnsignedByte(291030183) == 1;
								Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.displayName = RuntimeException_Sub5.aString11783 = class572_sub15_sub2.readVersionedString(-1467878084);
								Class40_Sub1.anInt9949 = class572_sub15_sub2.readUnsignedByte(1961451541) * -842741601;
								Class532.anInt5937 = (class572_sub15_sub2.readInt(-793645425) * -1137931045);
								Class10.aClass641_48 = new RSSocket(false);
								Class10.aClass641_48.id = class572_sub15_sub2.readUnsignedShort(647518597) * -1002799573;
								if (Class10.aClass641_48.id * 2112639107 == 65535)
									Class10.aClass641_48.id = 1002799573;
								Class10.aClass641_48.address = class572_sub15_sub2.readVersionedString(-939769026);
								if (Class434.aClass434_5044 != Class151.aClass434_1702) {
									Class10.aClass641_48.port = ((-984285601 * Class10.aClass641_48.id) + -1352120000);
									Class10.aClass641_48.securePort = (974886224 + (Class10.aClass641_48.id * -172050845));
								}
								if ((Class434.aClass434_5047 != Class151.aClass434_1702) && ((Class151.aClass434_1702 != Class434.aClass434_5043) || client.rights * -1550439133 < 2) && (Class633.aClass641_8197.method7597(Class633.aClass641_8203, -258392767)))
									Class38.method791(-1285710176);
							}
							if (client.aBool8734 && !client.aBool8736 || client.aBool8659) {
								try {
									Class277.method3718(VarTransmitLevel.anApplet8067, "zap", 974535694);
								} catch (Throwable throwable) {
									if (client.aBool8840) {
										try {
											VarTransmitLevel.anApplet8067.getAppletContext().showDocument(new URL(VarTransmitLevel.anApplet8067.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class277.method3718(VarTransmitLevel.anApplet8067, "unzap", 974535694);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class151.aClass434_1702 == Class434.aClass434_5044)
								Class212.aClass212_2454.method3057((byte) 53);
							if (-298874073 * Class13.anInt64 == 210)
								Class13.anInt97 = -537438651;
							else {
								Class13.anInt97 = 1307292629;
								Class276.method3715(2, 1896097054);
								Class545.method6455((byte) 0);
								Class463.method5478(5, -1613203293);
								((Class195) Class13.aClass195_96).currentPacket = null;
								break;
							}
						}
						if (-465965699 * Class13.anInt97 == 177) {
							if (!Class13.aClass195_96.method2933(-1928597573).method6559(3, 770907036))
								break;
							Class13.aClass195_96.method2933(-2143754577).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 3, 1878455323);
							Class13.anInt97 = -910528060;
						}
						if (180 == -465965699 * Class13.anInt97) {
							Class572_Sub15_Sub2 class572_sub15_sub2 = (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330);
							class572_sub15_sub2.o = 0;
							if (class572_sub15_sub2.method10391(1831284443)) {
								if (!Class13.aClass195_96.method2933(-1960478106).method6559(1, 744698391))
									break;
								Class13.aClass195_96.method2933(-1963861524).method6560(class572_sub15_sub2.b, 3, 1, 1592054139);
							}
							((Class195) Class13.aClass195_96).currentPacket = (Class121.method2181(2026219137)[class572_sub15_sub2.method10392((short) 27732)]);
							((Class195) Class13.aClass195_96).anInt2333 = (class572_sub15_sub2.readUnsignedShort(647518597) * -1699837821);
							Class13.anInt97 = 581829576;
						}
						if (168 == -465965699 * Class13.anInt97) {
							if (Class13.aClass195_96.method2933(-1890368095).method6559((((Class195) Class13.aClass195_96).anInt2333 * -875297237), 1646482826)) {
								Class13.aClass195_96.method2933(-1798737056).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, (-875297237 * (((Class195) Class13.aClass195_96).anInt2333)), 1967322962);
								((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
								int i_234_ = (((Class195) Class13.aClass195_96).anInt2333) * -875297237;
								Class13.anInt97 = 1307292629;
								Class276.method3715(2, 1204159875);
								Class108.method2062(-802813507);
								Class13.method618((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330), 520472076);
								int i_235_ = (i_234_ - (-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o)));
								Class572_Sub15_Sub2 class572_sub15_sub2 = new Class572_Sub15_Sub2(i_235_);
								System.arraycopy((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), (-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o)), class572_sub15_sub2.b, 0, i_235_);
								((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o += i_235_ * 310393755;
								if ((((Class195) Class13.aClass195_96).currentPacket) == IncomingPacket.INSTANCED_MAP_SCENE)
									client.aClass613_8605.method7348(new Class598(Class569.aClass569_6396, class572_sub15_sub2), -726425755);
								else
									client.aClass613_8605.method7348(new Class598(Class569.aClass569_6391, class572_sub15_sub2), -647961708);
								if (i_234_ != (-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o)))
									throw new RuntimeException(new StringBuilder().append((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o) * -1585139053).append(" ").append(i_234_).toString());
								((Class195) Class13.aClass195_96).currentPacket = null;
							}
						} else {
							if (Class13.anInt97 * -465965699 != 203)
								break;
							if (-2 == (-875297237 * (((Class195) Class13.aClass195_96).anInt2333))) {
								if (!Class13.aClass195_96.method2933(-1991156367).method6559(2, 108502053))
									break;
								Class13.aClass195_96.method2933(-1968809029).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, 2, 2105865257);
								((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
								((Class195) Class13.aClass195_96).anInt2333 = ((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.readUnsignedShort(647518597) * -1699837821;
							}
							if (Class13.aClass195_96.method2933(-1804278399).method6559((((Class195) Class13.aClass195_96).anInt2333 * -875297237), 725953039)) {
								Class13.aClass195_96.method2933(-1877878094).method6560((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.b), 0, (((Class195) Class13.aClass195_96).anInt2333) * -875297237, 1273150766);
								((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
								int i_236_ = (((Class195) Class13.aClass195_96).anInt2333) * -875297237;
								Class13.anInt97 = 1307292629;
								Class276.method3715(15, 615037844);
								Class133_Sub5.method9345(1901471770);
								Class13.method618((((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330), 520472076);
								if ((-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o)) != i_236_)
									throw new RuntimeException(new StringBuilder().append(-1585139053 * (((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o)).append(" ").append(i_236_).toString());
								((Class195) Class13.aClass195_96).currentPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class13.aClass195_96.method2943(-1911638963);
					if (-647473771 * Class13.anInt101 < 3) {
						if (-298874073 * Class13.anInt64 == 210)
							Class633.aClass641_8197.method7596((byte) 39);
						else
							Class633.aClass641_8208.method7596((byte) -45);
						Class13.anInt100 = 0;
						Class13.anInt101 += -1768993347;
						Class13.anInt97 = -185065007;
					} else {
						Class13.anInt97 = 1307292629;
						Class276.method3715(-4, 1139947874);
						Class430.method5240(840291002);
					}
					break;
				}
				break;
			} while (false);
		}
	}
}
