package game;

/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class547 {
	static int anInt6121;
	static byte[] aByteArray6122;
	protected static Class639_Sub16 aClass639_Sub16_6123;
	static RSByteBuffer aClass572_Sub15_6124;
	static int[] anIntArray6125;
	protected static int anInt6126;
	protected static Interface15 anInterface15_6127;
	public static float aFloat6128;
	public static Class572_Sub12_Sub5 aClass572_Sub12_Sub5_6129;
	protected static boolean aBool6130;
	protected static Class248 idx41;
	static Class676 aClass676_6132 = new Class676(16);
	static Class639_Sub2 aClass639_Sub2_6133;
	protected static int anInt6134 = (int) (Math.random() * 11.0) - 5;
	protected static Class127 aClass127_6135;
	protected static int anInt6136;
	static int[] anIntArray6137;
	static byte[] aByteArray6138;
	public static float aFloat6139;
	static int[][] anIntArrayArray6140;
	protected static Class548 aClass548_6141;
	static Class248 idx23;
	public static int anInt6143;
	static boolean[] aBoolArray6144;
	protected static int anInt6145;
	static int[] anIntArray6146;
	static Class639_Sub6 aClass639_Sub6_6147;
	static byte[] aByteArray6148;
	protected static Class675 aClass675_6149;
	static short[] aShortArray6150;
	protected static int anInt6151;
	static byte[] aByteArray6152;
	static Object[] anObjectArray6153;
	static int[] anIntArray6154;
	protected static Class639_Sub1 aClass639_Sub1_6155;
	protected static int anInt6156;
	protected static int anInt6157;
	static int anInt6158;
	protected static Interface13 anInterface13_6159;
	static int anInt6160;
	static int anInt6161;
	static int anInt6162;
	static int anInt6163;
	static int anInt6164;
	public static int anInt6165;
	protected static byte[][][] aByteArrayArrayArray6166;
	protected static int anInt6167;
	protected static Class127 aClass127_6168;
	protected static Class127 aClass127_6169;
	protected static int anInt6170;
	static ArrayList anArrayList6171;
	static int anInt6172;
	protected static Class639_Sub12 aClass639_Sub12_6173;
	protected static int anInt6174;
	static int anInt6175;
	static final int anInt6176 = 64;
	static byte[] aByteArray6177;
	protected static boolean aBool6178;
	static boolean[][] aBoolArrayArray6179;
	static int[] anIntArray6180;
	public static Class482 aClass482_6181;
	static HashMap[][][] aHashMapArrayArrayArray6182;
	protected static int anInt6183;
	static int anInt6184;
	protected static int anInt6185;
	protected static int anInt6186;
	protected static int anInt6187;
	static byte[] aByteArray6188;
	static int anInt6189;
	static int anInt6190;
	static RSByteBuffer aClass572_Sub15_6191;

	static void method6457(int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i + (i_2_ - i_0_ - 1) * i_2_;
		for (int i_5_ = 0; i_5_ < i_1_; i_5_++)
			is[i_4_ + i_5_ * i_2_] = i_3_;
	}

	static void method6458() {
		aByteArray6148 = new byte[anInt6145 * anInt6151];
		aByteArray6122 = new byte[anInt6145 * anInt6151];
		aByteArray6152 = new byte[anInt6145 * anInt6151];
		anObjectArray6153 = new Object[anInt6145 * anInt6151];
		aByteArray6188 = new byte[anInt6145 * anInt6151];
		aHashMapArrayArrayArray6182 = new HashMap[3][anInt6145 >> 6][anInt6151 >> 6];
		anIntArray6125 = new int[aClass639_Sub2_6133.anInt8284 * 1292974489 + 1];
		aBoolArrayArray6179 = new boolean[anInt6145 / 8][anInt6151 / 8];
	}

	static void method6459() {
		aByteArray6148 = null;
		aByteArray6177 = null;
		aShortArray6150 = null;
		aByteArray6122 = null;
		aByteArray6152 = null;
		anObjectArray6153 = null;
		aByteArray6188 = null;
		aHashMapArrayArrayArray6182 = null;
		anIntArray6125 = null;
		aBoolArrayArray6179 = null;
	}

	public static Class572_Sub12_Sub5 method6460(int i, int i_6_) {
		for (Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.method7968((byte) 32); class572_sub12_sub5 != null; class572_sub12_sub5 = ((Class572_Sub12_Sub5) aClass676_6132.method7969(202029082))) {
			if (((Class572_Sub12_Sub5) class572_sub12_sub5).aBool11330 && class572_sub12_sub5.method10294(i, i_6_, (byte) 0))
				return class572_sub12_sub5;
		}
		return null;
	}

	public static Class572_Sub12_Sub5 method6461(int i) {
		return (Class572_Sub12_Sub5) aClass676_6132.get((long) i);
	}

	static void method6462(MapSize mapSize, int i, int i_7_) {
		for (int i_8_ = 0; i_8_ < aClass639_Sub2_6133.anInt8284 * 1292974489; i_8_++)
			anIntArray6125[i_8_ + 1] = method6463(mapSize, i_8_, i, i_7_);
	}

	static int method6463(MapSize mapSize, int i, int i_9_, int i_10_) {
		return method6464(aClass639_Sub2_6133, mapSize, i, i_9_, i_10_);
	}

	static int method6464(Interface18 interface18, MapSize mapSize, int i, int i_11_, int i_12_) {
		Class468 class468 = (Class468) interface18.getDefinition(i, 177470047);
		if (class468 == null)
			return 0;
		int i_13_ = class468.anInt5261 * -1569651533;
		if (i_13_ >= 0 && mapSize.getTexture(i_13_, 1196018585).aBool1350)
			i_13_ = -1;
		int i_14_;
		if (class468.anInt5271 * 1981966121 >= 0) {
			int i_15_ = class468.anInt5271 * 1981966121;
			int i_16_ = (i_15_ & 0x7f) + i_12_;
			if (i_16_ < 0)
				i_16_ = 0;
			else if (i_16_ > 127)
				i_16_ = 127;
			int i_17_ = (i_15_ + i_11_ & 0xfc00) + (i_15_ & 0x380) + i_16_;
			i_14_ = (~0xffffff | (Class460.anIntArray4096[Class658.method1823(Class622.method7442(i_17_, 96, (short) 256), -1059400493) & 0xffff]));
		} else if (i_13_ >= 0)
			i_14_ = (~0xffffff | (Class460.anIntArray4096[Class658.method1823(Class622.method7442((mapSize.getTexture(i_13_, -63649276).aShort1317), 96, (short) 256), -460227980) & 0xffff]));
		else if (class468.anInt5260 * -1320134675 == -1)
			i_14_ = 0;
		else {
			int i_18_ = class468.anInt5260 * -1320134675;
			int i_19_ = (i_18_ & 0x7f) + i_12_;
			if (i_19_ < 0)
				i_19_ = 0;
			else if (i_19_ > 127)
				i_19_ = 127;
			int i_20_ = (i_18_ + i_11_ & 0xfc00) + (i_18_ & 0x380) + i_19_;
			i_14_ = (~0xffffff | (Class460.anIntArray4096[Class658.method1823(Class622.method7442(i_20_, 96, (short) 256), 1699712400) & 0xffff]));
		}
		return i_14_;
	}

	static void method6465() {
		for (int i = 0; i < anInt6145; i++) {
			for (int i_21_ = 0; i_21_ < anInt6151; i_21_++) {
				Object object = anObjectArray6153[i + i_21_ * anInt6145];
				if (object != null) {
					if (object instanceof Class572_Sub4) {
						Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
						if (class572_sub4 != null) {
							for (int i_22_ = 0; i_22_ < (((Class572_Sub4) class572_sub4).anIntArray8970).length; i_22_++) {
								ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class572_Sub4) class572_sub4).anIntArray8970[i_22_]), 2100416845)));
								int i_23_ = class509.anInt5642 * -105296855;
								if (class509.anIntArray5605 != null) {
									class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
									if (class509 != null)
										i_23_ = class509.anInt5642 * -105296855;
								}
								if (i_23_ != -1) {
									Class572_Sub19 class572_sub19 = new Class572_Sub19(i_23_);
									class572_sub19.anInt9140 = i * -1585994073;
									class572_sub19.anInt9141 = i_21_ * 1485372681;
									aClass675_6149.method7940(class572_sub19, -1789190476);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(integer.intValue(), -1122764558));
						int i_24_ = class509.anInt5642 * -105296855;
						if (class509.anIntArray5605 != null) {
							class509 = class509.method6047(anInterface15_6127, anInterface13_6159, 623307957);
							if (class509 != null)
								i_24_ = class509.anInt5642 * -105296855;
						}
						if (i_24_ != -1) {
							Class572_Sub19 class572_sub19 = new Class572_Sub19(i_24_);
							class572_sub19.anInt9140 = i * -1585994073;
							class572_sub19.anInt9141 = i_21_ * 1485372681;
							aClass675_6149.method7940(class572_sub19, -1736785706);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_25_ = 0; i_25_ < aHashMapArrayArrayArray6182[0].length; i_25_++) {
				for (int i_26_ = 0; i_26_ < aHashMapArrayArrayArray6182[0][0].length; i_26_++) {
					HashMap hashmap = aHashMapArrayArrayArray6182[i][i_25_][i_26_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class546 class546 = (Class546) iterator.next();
							if (((Class546) class546).anIntArray6119 != null) {
								for (int i_27_ = 0; i_27_ < (((Class546) class546).anIntArray6119).length; i_27_++) {
									ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class546) class546).anIntArray6119[i_27_]), -1809138309)));
									int i_28_ = class509.anInt5642 * -105296855;
									if (class509.anIntArray5605 != null) {
										class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
										if (class509 != null)
											i_28_ = (class509.anInt5642 * -105296855);
									}
									if (i_28_ != -1) {
										Class572_Sub19 class572_sub19 = new Class572_Sub19(i_28_);
										class572_sub19.anInt9140 = ((i_25_ + (anInt6143 >> 6)) * 64 + (((Class546) class546).aByte6120) - anInt6143) * -1585994073;
										class572_sub19.anInt9141 = ((i_26_ + (anInt6165 >> 6)) * 64 + (((Class546) class546).aByte6117) - anInt6165) * 1485372681;
										aClass675_6149.method7940(class572_sub19, -1885148523);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6466(byte[] is, byte[] is_29_, short[] is_30_, int i, int i_31_) {
		int[] is_32_ = new int[anInt6151];
		int[] is_33_ = new int[anInt6151];
		int[] is_34_ = new int[anInt6151];
		int[] is_35_ = new int[anInt6151];
		int[] is_36_ = new int[anInt6151];
		for (int i_37_ = -5; i_37_ < anInt6145; i_37_++) {
			int i_38_ = i_37_ + 5;
			int i_39_ = i_37_ - 5;
			for (int i_40_ = 0; i_40_ < anInt6151; i_40_++) {
				if (i_38_ < anInt6145) {
					int i_41_ = is[i_38_ + i_40_ * anInt6145] & 0xff;
					if (i_41_ > 0) {
						Class670 class670 = ((Class670) aClass639_Sub6_6147.getDefinition(i_41_ - 1, -2016223957));
						is_32_[i_40_] += class670.anInt8528 * 269102535;
						is_33_[i_40_] += class670.anInt8521 * 285293977;
						is_34_[i_40_] += class670.anInt8527 * 1437308965;
						is_35_[i_40_] += class670.anInt8529 * 1906066391;
						is_36_[i_40_]++;
					}
				}
				if (i_39_ >= 0) {
					int i_42_ = is[i_39_ + i_40_ * anInt6145] & 0xff;
					if (i_42_ > 0) {
						Class670 class670 = ((Class670) aClass639_Sub6_6147.getDefinition(i_42_ - 1, -2065777166));
						is_32_[i_40_] -= class670.anInt8528 * 269102535;
						is_33_[i_40_] -= class670.anInt8521 * 285293977;
						is_34_[i_40_] -= class670.anInt8527 * 1437308965;
						is_35_[i_40_] -= class670.anInt8529 * 1906066391;
						is_36_[i_40_]--;
					}
				}
			}
			if (i_37_ >= 0) {
				int i_43_ = 0;
				int i_44_ = 0;
				int i_45_ = 0;
				int i_46_ = 0;
				int i_47_ = 0;
				for (int i_48_ = -5; i_48_ < anInt6151; i_48_++) {
					int i_49_ = i_48_ + 5;
					if (i_49_ < anInt6151) {
						i_43_ += is_32_[i_49_];
						i_44_ += is_33_[i_49_];
						i_45_ += is_34_[i_49_];
						i_46_ += is_35_[i_49_];
						i_47_ += is_36_[i_49_];
					}
					int i_50_ = i_48_ - 5;
					if (i_50_ >= 0) {
						i_43_ -= is_32_[i_50_];
						i_44_ -= is_33_[i_50_];
						i_45_ -= is_34_[i_50_];
						i_46_ -= is_35_[i_50_];
						i_47_ -= is_36_[i_50_];
					}
					if (i_48_ >= 0 && i_47_ > 0) {
						if ((is[i_37_ + i_48_ * anInt6145] & 0xff) == 0) {
							int i_51_ = i_37_ + i_48_ * anInt6145;
							is_29_[i_51_] = (byte) 0;
							is_30_[i_51_] = (short) 0;
						} else {
							int i_52_ = (i_46_ == 0 ? 0 : Class103.method1643(i_43_ * 256 / i_46_, i_44_ / i_47_, i_45_ / i_47_, 97964133));
							int i_53_ = (i_52_ & 0x7f) + i_31_;
							if (i_53_ < 0)
								i_53_ = 0;
							else if (i_53_ > 127)
								i_53_ = 127;
							int i_54_ = ((i_52_ + i & 0xfc00) + (i_52_ & 0x380) + i_53_);
							int i_55_ = i_37_ + i_48_ * anInt6145;
							int i_56_ = (Class460.anIntArray4096[(Class658.method1823(Class66.method1048(i_54_, 96, (byte) 43), 94902077)) & 0xffff]);
							is_29_[i_55_] = (byte) (i_56_ >> 16 & 0xff);
							is_30_[i_55_] = (short) (i_56_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method6467() {
		int[] is = new int[3];
		for (int i = 0; i < aClass548_6141.anInt6194 * 613080349; i++) {
			boolean bool = (aClass572_Sub12_Sub5_6129.method10290(aClass548_6141.anIntArray6192[i] >> 28 & 0x3, aClass548_6141.anIntArray6192[i] >> 14 & 0x3fff, aClass548_6141.anIntArray6192[i] & 0x3fff, is, (byte) 1));
			if (bool) {
				Class572_Sub19 class572_sub19 = new Class572_Sub19(aClass548_6141.anIntArray6193[i]);
				class572_sub19.anInt9140 = (is[1] - anInt6143) * -1585994073;
				class572_sub19.anInt9141 = (is[2] - anInt6165) * 1485372681;
				aClass675_6149.method7940(class572_sub19, -1567271361);
			}
		}
	}

	static void method6468(int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.get((long) i);
		if (class572_sub12_sub5 != null && class572_sub12_sub5 != aClass572_Sub12_Sub5_6129) {
			aClass572_Sub12_Sub5_6129 = class572_sub12_sub5;
			aBool6130 = (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5376 * -982340345);
		}
	}

	static void method6469(Class106 class106, boolean bool, boolean bool_57_, boolean bool_58_, boolean bool_59_) {
		int i = anInt6183 - anInt6157;
		int i_60_ = anInt6170 - anInt6156;
		int i_61_ = (anInt6187 - anInt6185 << 16) / i;
		int i_62_ = (anInt6167 - anInt6186 << 16) / i_60_;
		method6470(class106, bool, bool_57_, i_61_, i_62_, 0, 0, bool_58_, bool_59_);
	}

	static void method6470(Class106 class106, boolean bool, boolean bool_63_, int i, int i_64_, int i_65_, int i_66_, boolean bool_67_, boolean bool_68_) {
		int i_69_ = anInt6183 - anInt6157;
		int i_70_ = anInt6170 - anInt6156;
		if (anInt6183 < anInt6145)
			i_69_++;
		if (anInt6170 < anInt6151)
			i_70_++;
		int i_71_ = anInt6157 / 64;
		int i_72_ = anInt6156 / 64;
		int i_73_ = (anInt6157 + i_69_) / 64;
		int i_74_ = (anInt6156 + i_70_) / 64;
		int i_75_;
		int i_76_;
		if (bool_68_) {
			i_75_ = (anInt6187 - anInt6185) / ((anInt6183 - anInt6157) / 64);
			i_76_ = i_75_;
		} else {
			i_75_ = method6471();
			i_76_ = (int) Math.ceil((double) (64.0F * aFloat6139 / 2.0F));
		}
		anArrayList6171.clear();
		int i_77_ = 0;
		int i_78_ = i_75_ * i_75_;
		for (int i_79_ = i_71_; i_79_ <= i_73_; i_79_++) {
			for (int i_80_ = i_72_; i_80_ <= i_74_; i_80_++) {
				int i_81_ = (i_79_ << 16) + i_80_;
				int i_82_ = method6480((long) i_81_);
				if (i_82_ != i_75_) {
					if (i_79_ < 0 || i_79_ * 64 >= anInt6145 || i_80_ < 0 || i_80_ * 64 >= anInt6151)
						method6492(class106, i_79_, i_80_, i_75_, i_81_);
					else if (i_82_ == -1) {
						method6478(i_79_, i_80_, i_75_, i_81_, bool, bool_63_, bool_67_, class106);
						i_77_ += i_78_;
					} else
						anArrayList6171.add(Integer.valueOf(i_81_));
				}
			}
		}
		if (!anArrayList6171.isEmpty() && i_77_ < anInt6172) {
			for (Iterator iterator = anArrayList6171.iterator(); i_77_ < anInt6172 && iterator.hasNext(); i_77_ += i_78_) {
				int i_83_ = ((Integer) iterator.next()).intValue();
				int i_84_ = i_83_ >> 16 & 0xffff;
				int i_85_ = i_83_ & 0xffff;
				method6478(i_84_, i_85_, i_75_, i_83_, bool, bool_63_, bool_67_, class106);
			}
		}
		for (int i_86_ = i_71_; i_86_ <= i_73_; i_86_++) {
			int i_87_ = i_86_ * 64;
			int i_88_ = i_87_ - anInt6157;
			int i_89_ = i_76_;
			int i_90_ = (i_65_ + i * i_88_ >> 16) + anInt6185;
			int i_91_ = (i_65_ + i * (i_88_ + 64) >> 16) + anInt6185;
			if (i_90_ + i_89_ != i_91_)
				i_89_ = i_91_ - i_90_;
			for (int i_92_ = i_72_; i_92_ <= i_74_; i_92_++) {
				int i_93_ = i_92_ * 64;
				int i_94_ = i_93_ - anInt6156;
				int i_95_ = (i_86_ << 16) + i_92_;
				int i_96_ = i_76_;
				int i_97_ = anInt6167 - (i_66_ + i_64_ * i_94_ >> 16);
				int i_98_ = anInt6167 - (i_66_ + i_64_ * (i_94_ + 64) >> 16);
				if (i_97_ - i_96_ != i_98_)
					i_96_ = i_97_ - i_98_;
				i_97_ -= i_96_;
				Class161 class161 = (Class161) aClass127_6169.method2246((long) i_95_);
				if (class161 == null)
					throw new RuntimeException();
				if (class161.method2587() == i_89_ && class161.method2588() == i_96_)
					class161.method2595(i_90_, i_97_);
				else
					class161.method2597(i_90_, i_97_, i_89_, i_96_);
			}
		}
	}

	static int method6471() {
		return (int) (64.0F * aFloat6128 / 2.0F);
	}

	static void method6472(Class106 class106, Class572_Sub19 class572_sub19, Class78 class78) {
		if (class78.anIntArray1002 != null) {
			int[] is = new int[class78.anIntArray1002.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_99_ = (class78.anIntArray1002[i * 2] + class572_sub19.anInt9140 * -1389911785);
				int i_100_ = (class78.anIntArray1002[i * 2 + 1] + class572_sub19.anInt9141 * 599105849);
				is[i * 2] = anInt6185 + ((anInt6187 - anInt6185) * (i_99_ - anInt6157) / (anInt6183 - anInt6157));
				is[i * 2 + 1] = anInt6167 - ((anInt6167 - anInt6186) * (i_100_ - anInt6156) / (anInt6170 - anInt6156));
			}
			Class98.method1582(class106, is, class78.anInt990 * 1661024195);
			if (class78.anInt991 * -726241895 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_101_ = is[i * 2];
					int i_102_ = is[i * 2 + 1];
					int i_103_ = is[(i + 1) * 2];
					int i_104_ = is[(i + 1) * 2 + 1];
					if (i_103_ < i_101_) {
						int i_105_ = i_101_;
						int i_106_ = i_102_;
						i_101_ = i_103_;
						i_102_ = i_104_;
						i_103_ = i_105_;
						i_104_ = i_106_;
					} else if (i_103_ == i_101_ && i_104_ < i_102_) {
						int i_107_ = i_102_;
						i_102_ = i_104_;
						i_104_ = i_107_;
					}
					class106.method1732(i_101_, i_102_, i_103_, i_104_, (class78.anIntArray998[class78.aByteArray999[i] & 0xff]), 1, class78.anInt991 * -726241895, class78.anInt992 * -1511734647, class78.anInt993 * 1161461629);
				}
				int i = is[is.length - 2];
				int i_108_ = is[is.length - 1];
				int i_109_ = is[0];
				int i_110_ = is[1];
				if (i_109_ < i) {
					int i_111_ = i;
					int i_112_ = i_108_;
					i = i_109_;
					i_108_ = i_110_;
					i_109_ = i_111_;
					i_110_ = i_112_;
				} else if (i_109_ == i && i_110_ < i_108_) {
					int i_113_ = i_108_;
					i_108_ = i_110_;
					i_110_ = i_113_;
				}
				class106.method1732(i, i_108_, i_109_, i_110_, (class78.anIntArray998[((class78.aByteArray999[class78.aByteArray999.length - 1]) & 0xff)]), 1, class78.anInt991 * -726241895, class78.anInt992 * -1511734647, class78.anInt993 * 1161461629);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class106.method1776(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class78.anIntArray998[class78.aByteArray999[i] & 0xff]), -1865787686);
				class106.method1776(is[is.length - 2], is[is.length - 1], is[0], is[1], (class78.anIntArray998[((class78.aByteArray999[class78.aByteArray999.length - 1]) & 0xff)]), -1640952965);
			}
		}
	}

	static void method6473(Class106 class106, int[] is, int i, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_) {
		Object object = anObjectArray6153[i_118_];
		if (object != null) {
			if (object instanceof Class572_Sub4) {
				Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
				if (class572_sub4 != null)
					method6474(class106, is, i, i_114_, i_115_, ((Class572_Sub4) class572_sub4).anIntArray8970, ((Class572_Sub4) class572_sub4).aByteArray8971);
			} else {
				Integer integer = (Integer) object;
				anIntArray6137[0] = integer.intValue();
				aByteArray6138[0] = aByteArray6188[i_116_ + i_117_ * anInt6145];
				method6474(class106, is, i, i_114_, i_115_, anIntArray6137, aByteArray6138);
			}
		}
	}

	static void method6474(Class106 class106, int[] is, int i, int i_119_, int i_120_, int[] is_121_, byte[] is_122_) {
		if (is_121_ != null) {
			for (int i_123_ = 0; i_123_ < is_121_.length; i_123_++) {
				ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(is_121_[i_123_], 102716418));
				int i_124_ = class509.anInt5623 * 337621963;
				if (i_124_ != -1) {
					Class242 class242 = ((Class242) aClass639_Sub1_6155.getDefinition(i_124_, -1782813557));
					Class161 class161 = class242.method3335(class106, (class509.aBool5662 ? is_122_[i_123_] >> 6 & 0x3 : 0), (class509.aBool5678 ? class509.aBool5647 : false), (byte) 55);
					int[] is_125_ = class242.method3329(class106, (class509.aBool5662 ? is_122_[i_123_] >> 6 & 0x3 : 0), (class509.aBool5678 ? class509.aBool5647 : false), (short) 3553);
					if (class161 != null) {
						int i_126_ = class161.method45();
						int i_127_ = class161.method2589();
						int i_128_ = i * i_126_ / 64 >> 2;
						int i_129_ = i * i_127_ / 64 >> 2;
						if (class242.aBool2664) {
							int i_130_ = class509.sizeX * -876498849;
							int i_131_ = class509.sizeY * 1922784011;
							if ((is_122_[i_123_] >> 6 & 0x1) == 1) {
								int i_132_ = i_130_;
								i_130_ = i_131_;
								i_131_ = i_132_;
							}
							i_128_ = i_130_ * i / 64;
							i_129_ = i_131_ * i / 64;
						}
						if (i_128_ != 0 && i_129_ != 0) {
							int i_133_ = i_119_ * i / 64;
							int i_134_ = (64 - i_120_) * i / 64 - i_129_ + 1;
							for (int i_135_ = 0; i_135_ < i_128_; i_135_++) {
								int i_136_ = i_135_ + i_133_;
								if (i_136_ >= 0) {
									if (i_136_ >= i)
										break;
									for (int i_137_ = 0; i_137_ < i_129_; i_137_++) {
										int i_138_ = i_137_ + i_134_;
										if (i_138_ >= 0) {
											if (i_138_ >= i)
												break;
											int i_139_ = (is_125_[(i_135_ * i_126_ / i_128_ + i_126_ * (i_137_ * i_127_ / i_129_))]);
											int i_140_ = i_139_ >> 24 & 0xff;
											if (i_140_ != 0)
												is[i_136_ + i * i_138_] = i_139_;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static Class675 method6475(Class106 class106) {
		int i = anInt6183 - anInt6157;
		int i_141_ = anInt6170 - anInt6156;
		int i_142_ = (anInt6187 - anInt6185 << 16) / i;
		int i_143_ = (anInt6167 - anInt6186 << 16) / i_141_;
		return method6476(class106, i_142_, i_143_, 0, 0);
	}

	static Class675 method6476(Class106 class106, int i, int i_144_, int i_145_, int i_146_) {
		for (Class572_Sub19 class572_sub19 = (Class572_Sub19) aClass675_6149.method7932((byte) 50); class572_sub19 != null; class572_sub19 = (Class572_Sub19) aClass675_6149.method7926(497825637))
			method6477(class106, class572_sub19, i, i_144_, i_145_, i_146_);
		return aClass675_6149;
	}

	static void method6477(Class106 class106, Class572_Sub19 class572_sub19, int i, int i_147_, int i_148_, int i_149_) {
		class572_sub19.anInt9138 = (anInt6185 + (i_148_ + i * (class572_sub19.anInt9140 * -1389911785 - anInt6157) >> 16)) * 979469989;
		class572_sub19.anInt9143 = (anInt6167 - (i_149_ + i_147_ * (class572_sub19.anInt9141 * 599105849 - anInt6156) >> 16)) * -927598265;
	}

	static void method6478(int i, int i_150_, int i_151_, int i_152_, boolean bool, boolean bool_153_, boolean bool_154_, Class106 class106) {
		int i_155_ = i * 64;
		int i_156_ = i_150_ * 64;
		if (anIntArray6146 == null || anIntArray6146.length != i_151_ * i_151_)
			anIntArray6146 = new int[i_151_ * i_151_];
		boolean bool_157_ = aBool6130 && !bool_154_;
		for (int i_158_ = 0; i_158_ < 64; i_158_++) {
			int i_159_ = i_155_ + i_158_;
			int i_160_ = i_158_ * i_151_ / 64;
			int i_161_ = (i_158_ + 1) * i_151_ / 64 - 1;
			if (i_161_ < i_160_)
				i_161_ = i_160_;
			for (int i_162_ = 0; i_162_ < 64; i_162_++) {
				int i_163_ = i_156_ + i_162_;
				boolean bool_164_ = bool;
				if (bool_157_ && !method6479(i_159_, i_163_))
					bool_164_ = false;
				int i_165_ = i_159_ + i_163_ * anInt6145;
				boolean bool_166_ = false;
				boolean bool_167_ = false;
				Object object = null;
				int i_168_ = ((aByteArray6177[i_165_] & 0xff) << 16 | aShortArray6150[i_165_] & 0xffff);
				if (i_168_ != 0)
					i_168_ |= ~0xffffff;
				int i_169_ = aByteArray6122[i_165_] & 0xff;
				object = anObjectArray6153[i_165_];
				int i_170_ = i_162_ * i_151_ / 64;
				int i_171_ = (i_162_ + 1) * i_151_ / 64 - 1;
				if (i_171_ < i_170_)
					i_171_ = i_170_;
				if (object != null) {
					if (object instanceof Class572_Sub4) {
						Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
						if (class572_sub4 != null)
							method6502(anIntArray6146, i_160_, i_161_, i_170_, i_171_, i_151_, bool_164_, i_168_, i_169_, aByteArray6152[i_165_], (((Class572_Sub4) class572_sub4).anIntArray8970), (((Class572_Sub4) class572_sub4).aByteArray8971), true);
					} else {
						Integer integer = (Integer) object;
						anIntArray6137[0] = integer.intValue();
						aByteArray6138[0] = aByteArray6188[i_165_];
						method6502(anIntArray6146, i_160_, i_161_, i_170_, i_171_, i_151_, bool_164_, i_168_, i_169_, aByteArray6152[i_165_], anIntArray6137, aByteArray6138, true);
					}
				} else
					method6502(anIntArray6146, i_160_, i_161_, i_170_, i_171_, i_151_, bool_164_, i_168_, i_169_, aByteArray6152[i_165_], null, null, true);
			}
		}
		if (bool_153_) {
			for (int i_172_ = 0; i_172_ < 64; i_172_++) {
				int i_173_ = i_155_ + i_172_;
				boolean bool_174_ = i_172_ == 0 && i_173_ != 0;
				for (int i_175_ = 0; i_175_ < 64; i_175_++) {
					int i_176_ = i_156_ + i_175_;
					if (!bool_157_ || method6479(i_173_, i_176_)) {
						boolean bool_177_ = i_175_ == 0 && i_176_ != 0;
						int i_178_ = i_173_ + i_176_ * anInt6145;
						if (bool_174_ && bool_177_)
							method6473(class106, anIntArray6146, i_151_, -1, -1, i_173_ - 1, i_176_ - 1, i_178_ - 1 - anInt6145);
						if (bool_174_)
							method6473(class106, anIntArray6146, i_151_, -1, i_175_, i_173_ - 1, i_176_, i_178_ - 1);
						if (bool_177_)
							method6473(class106, anIntArray6146, i_151_, i_172_, -1, i_173_, i_176_ - 1, i_178_ - anInt6145);
						method6473(class106, anIntArray6146, i_151_, i_172_, i_175_, i_173_, i_176_, i_178_);
					}
				}
			}
		}
		int i_179_ = i * 64 / 64;
		int i_180_ = i_150_ * 64 / 64;
		for (int i_181_ = 0; i_181_ < 3; i_181_++) {
			for (int i_182_ = 0; i_182_ < 64; i_182_++) {
				int i_183_ = i_155_ + i_182_;
				int i_184_ = i_183_ & 0x3f;
				int i_185_ = i_182_ * i_151_ / 64;
				int i_186_ = (i_182_ + 1) * i_151_ / 64 - 1;
				if (i_186_ < i_185_)
					i_186_ = i_185_;
				for (int i_187_ = 0; i_187_ < 64; i_187_++) {
					int i_188_ = i_156_ + i_187_;
					boolean bool_189_ = bool;
					if (bool_157_ && !method6479(i_183_, i_188_))
						bool_189_ = false;
					int i_190_ = i_188_ & 0x3f;
					int i_191_ = i_187_ * i_151_ / 64;
					int i_192_ = (i_187_ + 1) * i_151_ / 64 - 1;
					if (i_192_ < i_191_)
						i_192_ = i_191_;
					HashMap hashmap = aHashMapArrayArrayArray6182[i_181_][i_179_][i_180_];
					if (hashmap != null) {
						Class546 class546 = ((Class546) hashmap.get(Integer.valueOf((i_184_ << 8) + i_190_)));
						if (class546 != null)
							method6502(anIntArray6146, i_185_, i_186_, i_191_, i_192_, i_151_, bool_189_, ((Class546) class546).anInt6116, ((Class546) class546).aByte6114 & 0xff, ((Class546) class546).aByte6118, ((Class546) class546).anIntArray6119, ((Class546) class546).aByteArray6115, false);
					}
				}
			}
			for (int i_193_ = 0; i_193_ < 64; i_193_++) {
				int i_194_ = i_155_ + i_193_;
				int i_195_ = i_194_ & 0x3f;
				for (int i_196_ = 0; i_196_ < 64; i_196_++) {
					int i_197_ = i_156_ + i_196_;
					if (!bool_157_ || method6479(i_194_, i_197_)) {
						int i_198_ = i_197_ & 0x3f;
						HashMap hashmap = (aHashMapArrayArrayArray6182[i_181_][i_179_][i_180_]);
						if (hashmap != null) {
							Class546 class546 = ((Class546) hashmap.get(Integer.valueOf((i_195_ << 8) + i_198_)));
							if (class546 != null)
								method6474(class106, anIntArray6146, i_151_, i_193_, i_196_, (((Class546) class546).anIntArray6119), (((Class546) class546).aByteArray6115));
						}
					}
				}
			}
		}
		if (bool_157_) {
			int i_199_ = 8;
			for (int i_200_ = 0; i_200_ < i_199_; i_200_++) {
				int i_201_ = i_155_ + i_200_ * 8;
				int i_202_ = i_200_ * i_151_ / i_199_;
				int i_203_ = (i_200_ + 1) * i_151_ / i_199_ - 1;
				for (int i_204_ = 0; i_204_ < i_199_; i_204_++) {
					int i_205_ = i_156_ + i_204_ * 8;
					if (!method6479(i_201_, i_205_)) {
						int i_206_ = i_204_ * i_151_ / i_199_;
						int i_207_ = (i_204_ + 1) * i_151_ / i_199_ - 1;
						if (i_151_ < 64)
							method6483(anIntArray6146, i_202_, i_203_, i_206_, i_207_, i_151_);
						else {
							aBoolArray6144[anInt6158] = method6479(i_201_, i_205_ + 8);
							aBoolArray6144[anInt6121] = method6479(i_201_ + 8, i_205_ + 8);
							aBoolArray6144[anInt6160] = method6479(i_201_ + 8, i_205_);
							aBoolArray6144[anInt6161] = method6479(i_201_ + 8, i_205_ - 8);
							aBoolArray6144[anInt6162] = method6479(i_201_, i_205_ - 8);
							aBoolArray6144[anInt6163] = method6479(i_201_ - 8, i_205_ - 8);
							aBoolArray6144[anInt6164] = method6479(i_201_ - 8, i_205_);
							aBoolArray6144[anInt6184] = method6479(i_201_ - 8, i_205_ + 8);
							method6482(anIntArray6146, i_202_, i_203_, i_206_, i_207_, i_151_);
						}
					}
				}
			}
		}
		aClass127_6169.method2229(class106.method1960(anIntArray6146, 0, i_151_, i_151_, i_151_, true), (long) i_152_);
	}

	static boolean method6479(int i, int i_208_) {
		int i_209_ = i >> 3;
		int i_210_ = i_208_ >> 3;
		if (i_209_ < 0 || i_210_ < 0 || i_209_ >= aBoolArrayArray6179.length || i_210_ >= aBoolArrayArray6179[i_209_].length)
			return false;
		return aBoolArrayArray6179[i_209_][i_210_];
	}

	static int method6480(long l) {
		Class161 class161 = (Class161) aClass127_6169.method2246(l);
		if (class161 != null)
			return class161.method2587();
		return -1;
	}

	static void method6481(int[] is, int i, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_) {
		for (int i_216_ = i; i_216_ <= i_211_; i_216_++) {
			for (int i_217_ = i_212_; i_217_ <= i_213_; i_217_++)
				is[(i_214_ - i_217_ - 1) * i_214_ + i_216_] = i_215_;
		}
	}

	static void method6482(int[] is, int i, int i_218_, int i_219_, int i_220_, int i_221_) {
		int i_222_ = aClass482_6181.anInt5377 * -63267125 >> 24 & 0xff;
		int i_223_ = 255 - i_222_;
		if ((!aBoolArray6144[anInt6158] || !aBoolArray6144[anInt6160] && !aBoolArray6144[anInt6164]) && (!aBoolArray6144[anInt6162] || !aBoolArray6144[anInt6160] && !aBoolArray6144[anInt6164])) {
			method6484(is, i, i_218_, i_219_, i_220_, i_221_, i_222_, i_223_, true, true, true, true);
			if (aBoolArray6144[anInt6121]) {
				is[(i_221_ - i_220_ - 1) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_220_) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_220_ - 1) * i_221_ + i_218_ - 1] = aClass482_6181.anInt5382 * 1697142415;
			}
			if (aBoolArray6144[anInt6161]) {
				is[(i_221_ - i_219_ - 1) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_219_ - 2) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_219_ - 1) * i_221_ + i_218_ - 1] = aClass482_6181.anInt5382 * 1697142415;
			}
			if (aBoolArray6144[anInt6163]) {
				is[(i_221_ - i_219_ - 1) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_219_ - 2) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_219_ - 1) * i_221_ + i + 1] = aClass482_6181.anInt5382 * 1697142415;
			}
			if (aBoolArray6144[anInt6184]) {
				is[(i_221_ - i_220_ - 1) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_220_) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
				is[(i_221_ - i_220_ - 1) * i_221_ + i + 1] = aClass482_6181.anInt5382 * 1697142415;
			}
		} else {
			if (aBoolArray6144[anInt6158] && aBoolArray6144[anInt6160])
				method6485(is, i_218_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_220_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_221_, i_222_, i_223_, anInt6121);
			else {
				method6484(is, i_218_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_218_, i_220_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_220_, i_221_, i_222_, i_223_, true, true, false, false);
				if (aBoolArray6144[anInt6121]) {
					is[(i_221_ - i_220_ - 1) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_220_) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_220_ - 1) * i_221_ + i_218_ - 1] = aClass482_6181.anInt5382 * 1697142415;
				}
			}
			if (aBoolArray6144[anInt6162] && aBoolArray6144[anInt6160])
				method6485(is, i_218_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_219_, i_221_, i_222_, i_223_, anInt6161);
			else {
				method6484(is, i_218_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_218_, i_219_, i_219_ + aClass482_6181.anInt5379 * 1638293055 - 1, i_221_, i_222_, i_223_, false, true, true, false);
				if (aBoolArray6144[anInt6161]) {
					is[(i_221_ - i_219_ - 1) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_219_ - 2) * i_221_ + i_218_] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_219_ - 1) * i_221_ + i_218_ - 1] = aClass482_6181.anInt5382 * 1697142415;
				}
			}
			if (aBoolArray6144[anInt6162] && aBoolArray6144[anInt6164])
				method6485(is, i, i_219_, i_221_, i_222_, i_223_, anInt6163);
			else {
				method6484(is, i, i + aClass482_6181.anInt5379 * 1638293055 - 1, i_219_, i_219_ + aClass482_6181.anInt5379 * 1638293055 - 1, i_221_, i_222_, i_223_, false, false, true, true);
				if (aBoolArray6144[anInt6163]) {
					is[(i_221_ - i_219_ - 1) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_219_ - 2) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_219_ - 1) * i_221_ + i + 1] = aClass482_6181.anInt5382 * 1697142415;
				}
			}
			if (aBoolArray6144[anInt6158] && aBoolArray6144[anInt6164])
				method6485(is, i, i_220_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_221_, i_222_, i_223_, anInt6184);
			else {
				method6484(is, i, i + aClass482_6181.anInt5379 * 1638293055 - 1, i_220_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_220_, i_221_, i_222_, i_223_, true, false, false, true);
				if (aBoolArray6144[anInt6184]) {
					is[(i_221_ - i_220_ - 1) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_220_) * i_221_ + i] = aClass482_6181.anInt5382 * 1697142415;
					is[(i_221_ - i_220_ - 1) * i_221_ + i + 1] = aClass482_6181.anInt5382 * 1697142415;
				}
			}
			if (i + aClass482_6181.anInt5379 * 1638293055 < i_218_ - aClass482_6181.anInt5379 * 1638293055)
				method6484(is, i + aClass482_6181.anInt5379 * 1638293055, i_218_ - aClass482_6181.anInt5379 * 1638293055, i_219_, i_220_, i_221_, i_222_, i_223_, true, false, true, false);
			if (i_219_ + aClass482_6181.anInt5379 * 1638293055 + 1 < i_220_ - aClass482_6181.anInt5379 * 1638293055 - 1) {
				method6484(is, i, i + aClass482_6181.anInt5379 * 1638293055 - 1, i_219_ + aClass482_6181.anInt5379 * 1638293055, i_220_ - aClass482_6181.anInt5379 * 1638293055, i_221_, i_222_, i_223_, false, false, false, true);
				method6484(is, i_218_ - aClass482_6181.anInt5379 * 1638293055 + 1, i_218_, i_219_ + aClass482_6181.anInt5379 * 1638293055, i_220_ - aClass482_6181.anInt5379 * 1638293055, i_221_, i_222_, i_223_, false, true, false, false);
			}
		}
	}

	static void method6483(int[] is, int i, int i_224_, int i_225_, int i_226_, int i_227_) {
		int i_228_ = aClass482_6181.anInt5377 * -63267125 >> 24 & 0xff;
		int i_229_ = 255 - i_228_;
		for (int i_230_ = i; i_230_ <= i_224_; i_230_++) {
			for (int i_231_ = i_225_; i_231_ <= i_226_; i_231_++) {
				int i_232_ = is[(i_227_ - i_231_ - 1) * i_227_ + i_230_];
				if (i_232_ != anInt6189) {
					anInt6189 = i_232_;
					anInt6190 = (~0xffffff | ((((aClass482_6181.anInt5377 * -63267125 & 0xff00ff) * i_228_ + (i_232_ & 0xff00ff) * i_229_) & ~0xff00ff) + (((aClass482_6181.anInt5377 * -63267125 & 0xff00) * i_228_ + (i_232_ & 0xff00) * i_229_) & 0xff0000)) >> 8);
				}
				is[(i_227_ - i_231_ - 1) * i_227_ + i_230_] = anInt6190;
			}
		}
	}

	static void method6484(int[] is, int i, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, boolean bool, boolean bool_239_, boolean bool_240_, boolean bool_241_) {
		for (int i_242_ = i; i_242_ <= i_233_; i_242_++) {
			boolean bool_243_ = bool_239_ ? (aBoolArray6144[anInt6160] && i_233_ - i_242_ < (aClass482_6181.anInt5378 * 145738907)) : false;
			boolean bool_244_ = (bool_241_ ? (aBoolArray6144[anInt6164] && i_242_ - i < aClass482_6181.anInt5378 * 145738907) : false);
			for (int i_245_ = i_234_; i_245_ <= i_235_; i_245_++) {
				if (bool_243_ || bool_244_)
					is[(i_236_ - i_245_ - 1) * i_236_ + i_242_] = aClass482_6181.anInt5382 * 1697142415;
				else {
					boolean bool_246_ = (bool ? (aBoolArray6144[anInt6158] && (i_235_ - i_245_ < aClass482_6181.anInt5378 * 145738907)) : false);
					boolean bool_247_ = (bool_240_ ? (aBoolArray6144[anInt6162] && (i_245_ - i_234_ < aClass482_6181.anInt5378 * 145738907)) : false);
					if (bool_246_ || bool_247_)
						is[(i_236_ - i_245_ - 1) * i_236_ + i_242_] = aClass482_6181.anInt5382 * 1697142415;
					else {
						int i_248_ = is[(i_236_ - i_245_ - 1) * i_236_ + i_242_];
						if (i_248_ != anInt6189) {
							anInt6189 = i_248_;
							anInt6190 = (~0xffffff | ((((aClass482_6181.anInt5377 * -63267125 & 0xff00ff) * i_237_ + (i_248_ & 0xff00ff) * i_238_) & ~0xff00ff) + (((aClass482_6181.anInt5377 * -63267125 & 0xff00) * i_237_ + (i_248_ & 0xff00) * i_238_) & 0xff0000)) >> 8);
						}
						is[(i_236_ - i_245_ - 1) * i_236_ + i_242_] = anInt6190;
					}
				}
			}
		}
	}

	static void method6485(int[] is, int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_) {
		for (int i_254_ = 0; i_254_ < aClass482_6181.anInt5379 * 1638293055; i_254_++) {
			int i_255_ = i_254_;
			if (i_253_ == anInt6121 || i_253_ == anInt6161)
				i_255_ = aClass482_6181.anInt5379 * 1638293055 - i_254_ - 1;
			for (int i_256_ = 0; i_256_ < aClass482_6181.anInt5379 * 1638293055; i_256_++) {
				int i_257_ = i_256_;
				if (i_253_ == anInt6161 || i_253_ == anInt6163)
					i_257_ = aClass482_6181.anInt5379 * 1638293055 - i_256_ - 1;
				int i_258_ = anIntArrayArray6140[i_255_][i_257_];
				if (i_258_ != 0) {
					if (i_258_ == 1) {
						int i_259_ = is[((i_250_ - i_249_ - i_256_ - 1) * i_250_ + i + i_254_)];
						if (i_259_ != anInt6189) {
							anInt6189 = i_259_;
							anInt6190 = (~0xffffff | ((((aClass482_6181.anInt5377 * -63267125 & 0xff00ff) * i_251_ + (i_259_ & 0xff00ff) * i_252_) & ~0xff00ff) + (((aClass482_6181.anInt5377 * -63267125 & 0xff00) * i_251_ + (i_259_ & 0xff00) * i_252_) & 0xff0000)) >> 8);
						}
						is[((i_250_ - i_249_ - i_256_ - 1) * i_250_ + i + i_254_)] = anInt6190;
					} else if (i_258_ == 2)
						is[((i_250_ - i_249_ - i_256_ - 1) * i_250_ + i + i_254_)] = aClass482_6181.anInt5382 * 1697142415;
				}
			}
		}
	}

	static boolean method6486(Class572_Sub12_Sub5 class572_sub12_sub5) {
		if (class572_sub12_sub5 != null && class572_sub12_sub5 != aClass572_Sub12_Sub5_6129) {
			aClass572_Sub12_Sub5_6129 = class572_sub12_sub5;
			aBool6130 = (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5376 * -982340345);
			return true;
		}
		return false;
	}

	static void method6487(int[] is, int i, int i_260_, int i_261_, int i_262_, int i_263_) {
		int i_264_ = i + (i_262_ - i_260_ - 1) * i_262_;
		for (int i_265_ = 0; i_265_ < i_261_; i_265_++)
			is[i_264_ + i_265_] = i_263_;
	}

	static {
		anInt6126 = (int) (Math.random() * 17.0) - 8;
		anIntArray6137 = new int[1];
		aByteArray6138 = new byte[1];
		aClass675_6149 = new Class675();
		aBool6130 = true;
		anIntArrayArray6140 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
		anInt6158 = Class661.aClass661_8448.getId(-1181902668);
		anInt6121 = Class661.aClass661_8444.getId(-1806407375);
		anInt6160 = Class661.aClass661_8445.getId(253484671);
		anInt6161 = Class661.aClass661_8443.getId(945915428);
		anInt6162 = Class661.aClass661_8447.getId(-65245192);
		anInt6163 = Class661.aClass661_8452.getId(-176202769);
		anInt6164 = Class661.aClass661_8449.getId(1628908710);
		anInt6184 = Class661.aClass661_8450.getId(-823010051);
		aClass127_6135 = new Class127(4096, 256);
		aClass127_6168 = new Class127(4096, 1024);
		aClass127_6169 = aClass127_6135;
		anArrayList6171 = new ArrayList();
		anInt6172 = 262144;
		anInt6174 = 0;
		anInt6175 = 5;
		aClass572_Sub15_6124 = null;
		aClass572_Sub15_6191 = null;
		aBool6178 = true;
		new Date();
		anInt6189 = 0;
		anInt6190 = 0;
		aBoolArray6144 = new boolean[8];
	}

	static void method6488() {
		aByteArray6148 = null;
		aByteArray6177 = null;
		aShortArray6150 = null;
		aByteArray6122 = null;
		aByteArray6152 = null;
		anObjectArray6153 = null;
		aByteArray6188 = null;
		aHashMapArrayArrayArray6182 = null;
		anIntArray6125 = null;
		aBoolArrayArray6179 = null;
	}

	static void method6489() {
		aByteArray6148 = new byte[anInt6145 * anInt6151];
		aByteArray6122 = new byte[anInt6145 * anInt6151];
		aByteArray6152 = new byte[anInt6145 * anInt6151];
		anObjectArray6153 = new Object[anInt6145 * anInt6151];
		aByteArray6188 = new byte[anInt6145 * anInt6151];
		aHashMapArrayArrayArray6182 = new HashMap[3][anInt6145 >> 6][anInt6151 >> 6];
		anIntArray6125 = new int[aClass639_Sub2_6133.anInt8284 * 1292974489 + 1];
		aBoolArrayArray6179 = new boolean[anInt6145 / 8][anInt6151 / 8];
	}

	static void method6490(Class106 class106, RSByteBuffer class572_sub15, int i, int i_266_, int i_267_, int i_268_, int[] is, int[] is_269_) {
		int i_270_ = class572_sub15.readUnsignedByte(2041218126);
		if ((i_270_ & 0x1) == 0) {
			boolean bool = (i_270_ & 0x2) == 0;
			int i_271_ = i_270_ >> 2 & 0x3f;
			if (i_271_ != 62) {
				if (i_271_ == 63)
					i_271_ = class572_sub15.readUnsignedByte(912264744);
				else if (bool)
					i_271_ = is[i_271_];
				else
					i_271_ = is_269_[i_271_];
				if (bool) {
					aByteArray6148[i_267_ + i_268_ * anInt6145] = (byte) i_271_;
					aByteArray6122[i_267_ + i_268_ * anInt6145] = (byte) 0;
				} else {
					aByteArray6122[i_267_ + i_268_ * anInt6145] = (byte) i_271_;
					aByteArray6152[i_267_ + i_268_ * anInt6145] = (byte) 0;
					aByteArray6148[i_267_ + i_268_ * anInt6145] = class572_sub15.readByte(1190121223);
				}
			}
		} else {
			int i_272_ = (i_270_ >> 1 & 0x3) + 1;
			boolean bool = (i_270_ & 0x8) != 0;
			boolean bool_273_ = (i_270_ & 0x10) != 0;
			for (int i_274_ = 0; i_274_ < i_272_; i_274_++) {
				int i_275_ = class572_sub15.readUnsignedByte(806236173);
				int i_276_ = 0;
				int i_277_ = 0;
				if (bool) {
					i_276_ = class572_sub15.readUnsignedByte(1239554902);
					i_277_ = class572_sub15.readUnsignedByte(641311955);
				}
				int i_278_ = 0;
				if (bool_273_)
					i_278_ = class572_sub15.readUnsignedByte(1465344696);
				if (i_274_ == 0) {
					aByteArray6148[i_267_ + i_268_ * anInt6145] = (byte) i_275_;
					aByteArray6122[i_267_ + i_268_ * anInt6145] = (byte) i_276_;
					aByteArray6152[i_267_ + i_268_ * anInt6145] = (byte) i_277_;
					if (i_278_ == 1) {
						anObjectArray6153[i_267_ + i_268_ * anInt6145] = new Integer(class572_sub15.readBigSmart((byte) 105));
						aByteArray6188[i_267_ + i_268_ * anInt6145] = class572_sub15.readByte(32175834);
					} else if (i_278_ > 1) {
						int[] is_279_ = new int[i_278_];
						byte[] is_280_ = new byte[i_278_];
						for (int i_281_ = 0; i_281_ < i_278_; i_281_++) {
							is_279_[i_281_] = class572_sub15.readBigSmart((byte) 56);
							is_280_[i_281_] = class572_sub15.readByte(538039443);
						}
						anObjectArray6153[i_267_ + i_268_ * anInt6145] = new Class572_Sub4(is_279_, is_280_);
					}
				} else {
					int[] is_282_ = null;
					byte[] is_283_ = null;
					if (i_278_ > 0) {
						is_282_ = new int[i_278_];
						is_283_ = new byte[i_278_];
						for (int i_284_ = 0; i_284_ < i_278_; i_284_++) {
							is_282_[i_284_] = class572_sub15.readBigSmart((byte) 24);
							is_283_[i_284_] = class572_sub15.readByte(1676799618);
						}
					}
					if ((aHashMapArrayArrayArray6182[i_274_ - 1][i - (anInt6143 >> 6)][i_266_ - (anInt6165 >> 6)]) == null)
						aHashMapArrayArrayArray6182[i_274_ - 1][i - (anInt6143 >> 6)][i_266_ - (anInt6165 >> 6)] = new HashMap();
					int i_285_ = ((i_267_ & 0x3f) << 8) + (i_268_ & 0x3f);
					Class546 class546 = new Class546(i_267_ & 0x3f, i_268_ & 0x3f, i_275_, i_276_, i_277_, is_282_, is_283_);
					aHashMapArrayArrayArray6182[i_274_ - 1][i - (anInt6143 >> 6)][i_266_ - (anInt6165 >> 6)].put(Integer.valueOf(i_285_), class546);
				}
			}
		}
	}

	static void method6491(int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.get((long) i);
		if (class572_sub12_sub5 != null && class572_sub12_sub5 != aClass572_Sub12_Sub5_6129) {
			aClass572_Sub12_Sub5_6129 = class572_sub12_sub5;
			aBool6130 = (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5376 * -982340345);
		}
	}

	static void method6492(Class106 class106, int i, int i_286_, int i_287_, int i_288_) {
		Class161 class161 = (Class161) aClass127_6169.method2246(-1L);
		if (class161 == null || class161.method2587() != i_287_) {
			int i_289_;
			if ((((Class572_Sub12_Sub5) aClass572_Sub12_Sub5_6129).anInt11324 * -716592509) != -1)
				i_289_ = (~0xffffff | (((Class572_Sub12_Sub5) aClass572_Sub12_Sub5_6129).anInt11324) * -716592509);
			else
				i_289_ = -16777216;
			if (anIntArray6146 == null || anIntArray6146.length != i_287_ * i_287_)
				anIntArray6146 = new int[i_287_ * i_287_];
			Arrays.fill(anIntArray6146, i_289_);
			class161 = class106.method1960(anIntArray6146, 0, i_287_, i_287_, i_287_, true);
			aClass127_6169.method2229(class161, -1L);
		}
		aClass127_6169.method2229(class161, (long) i_288_);
	}

	public static Class664 method6493(int i, int i_290_) {
		Class664 class664 = new Class664();
		for (Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.method7968((byte) -16); class572_sub12_sub5 != null; class572_sub12_sub5 = ((Class572_Sub12_Sub5) aClass676_6132.method7969(1285620388))) {
			if (((Class572_Sub12_Sub5) class572_sub12_sub5).aBool11330 && class572_sub12_sub5.method10294(i, i_290_, (byte) 0))
				class664.method7842(class572_sub12_sub5, 685617385);
		}
		return class664;
	}

	static boolean method6494(Class106 class106, int i, int i_291_, boolean bool) {
		long l = Class69.method1067(-2023513400);
		if (anInt6174 == 0) {
			if (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5380 * -808595613) {
				int i_292_ = idx41.method3413((aClass572_Sub12_Sub5_6129.mapName), -1361623929);
				if (aClass572_Sub15_6191 == null)
					aClass572_Sub15_6191 = new RSByteBuffer(idx41.getFile(i_292_, 0, -1539987618));
				aClass572_Sub15_6124 = aClass572_Sub15_6191;
				aClass572_Sub15_6124.o = 0;
			} else {
				int i_293_ = idx41.method3413((aClass572_Sub12_Sub5_6129.mapName), -178584334);
				aClass572_Sub15_6124 = (new RSByteBuffer(idx41.getFile(i_293_, 0, -807653563)));
			}
			int i_294_ = aClass572_Sub15_6124.readUnsignedByte(1802806471);
			anIntArray6154 = new int[i_294_];
			for (int i_295_ = 0; i_295_ < i_294_; i_295_++)
				anIntArray6154[i_295_] = aClass572_Sub15_6124.readUnsignedSmart(59964264);
			int i_296_ = aClass572_Sub15_6124.readUnsignedByte(942352514);
			anIntArray6180 = new int[i_296_];
			for (int i_297_ = 0; i_297_ < i_296_; i_297_++)
				anIntArray6180[i_297_] = aClass572_Sub15_6124.readUnsignedSmart(-667814742);
		}
		while (aClass572_Sub15_6124 != null && (aClass572_Sub15_6124.o * -1585139053 < aClass572_Sub15_6124.b.length) && (!bool || (Class69.method1067(-2059773620) < l + (long) anInt6175))) {
			if (aClass572_Sub15_6124.readUnsignedByte(1766022969) == 0) {
				int i_298_ = aClass572_Sub15_6124.readUnsignedByte(173074000);
				int i_299_ = aClass572_Sub15_6124.readUnsignedByte(54662667);
				for (int i_300_ = 0; i_300_ < 8; i_300_++) {
					int i_301_ = aClass572_Sub15_6124.readUnsignedByte(1612552740);
					int i_302_ = i_298_ * 8 + i_300_ - anInt6143 / 8;
					for (int i_303_ = 0; i_303_ < 8; i_303_++) {
						int i_304_ = i_299_ * 8 + i_303_ - anInt6165 / 8;
						aBoolArrayArray6179[i_302_][i_304_] = (i_301_ & 1 << i_303_) != 0;
					}
				}
				for (int i_305_ = 0; i_305_ < 64; i_305_++) {
					for (int i_306_ = 0; i_306_ < 64; i_306_++) {
						int i_307_ = i_298_ * 64 + i_305_ - anInt6143;
						int i_308_ = i_299_ * 64 + i_306_ - anInt6165;
						method6490(class106, aClass572_Sub15_6124, i_298_, i_299_, i_307_, i_308_, anIntArray6154, anIntArray6180);
					}
				}
			} else {
				int i_309_ = aClass572_Sub15_6124.readUnsignedByte(627590162);
				int i_310_ = aClass572_Sub15_6124.readUnsignedByte(435180759);
				int i_311_ = aClass572_Sub15_6124.readUnsignedByte(418702527);
				int i_312_ = aClass572_Sub15_6124.readUnsignedByte(-45646281);
				aBoolArrayArray6179[i_309_ * 8 + i_311_ - anInt6143 / 8][i_310_ * 8 + i_312_ - anInt6165 / 8] = aClass572_Sub15_6124.readUnsignedByte(420177463) != 0;
				for (int i_313_ = 0; i_313_ < 8; i_313_++) {
					for (int i_314_ = 0; i_314_ < 8; i_314_++) {
						int i_315_ = i_309_ * 64 + i_311_ * 8 + i_313_ - anInt6143;
						int i_316_ = i_310_ * 64 + i_312_ * 8 + i_314_ - anInt6165;
						method6490(class106, aClass572_Sub15_6124, i_309_, i_310_, i_315_, i_316_, anIntArray6154, anIntArray6180);
					}
				}
			}
		}
		if (aClass572_Sub15_6124 != null) {
			anInt6174 = aClass572_Sub15_6124.o * -1585139053;
			if (aClass572_Sub15_6124.o * -1585139053 < aClass572_Sub15_6124.b.length)
				return false;
		}
		aClass572_Sub15_6124 = null;
		anIntArray6180 = null;
		anIntArray6154 = null;
		if (aByteArray6148 != null) {
			aByteArray6177 = new byte[anInt6145 * anInt6151];
			aShortArray6150 = new short[anInt6145 * anInt6151];
			for (int i_317_ = 0; i_317_ < 3; i_317_++) {
				byte[] is = new byte[anInt6145 * anInt6151];
				for (int i_318_ = 0; i_318_ < aHashMapArrayArrayArray6182[i_317_].length; i_318_++) {
					for (int i_319_ = 0; (i_319_ < aHashMapArrayArrayArray6182[i_317_][0].length); i_319_++) {
						HashMap hashmap = (aHashMapArrayArrayArray6182[i_317_][i_318_][i_319_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class546 class546 = (Class546) iterator.next();
								is[(i_318_ * 64 + ((Class546) class546).aByte6120 + ((i_319_ * 64 + ((Class546) class546).aByte6117) * anInt6145))] = (byte) ((Class546) class546).anInt6116;
							}
						}
					}
				}
				method6466(is, aByteArray6177, aShortArray6150, i, i_291_);
				for (int i_320_ = 0; i_320_ < aHashMapArrayArrayArray6182[i_317_].length; i_320_++) {
					for (int i_321_ = 0; (i_321_ < aHashMapArrayArrayArray6182[i_317_][0].length); i_321_++) {
						HashMap hashmap = (aHashMapArrayArrayArray6182[i_317_][i_320_][i_321_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class546 class546 = (Class546) iterator.next();
								int i_322_ = (i_320_ * 64 + ((Class546) class546).aByte6120 + ((i_321_ * 64 + ((Class546) class546).aByte6117) * anInt6145));
								((Class546) class546).anInt6116 = ((aByteArray6177[i_322_] & 0xff) << 16 | aShortArray6150[i_322_] & 0xffff);
								if (((Class546) class546).anInt6116 != 0)
									((Class546) class546).anInt6116 |= ~0xffffff;
							}
						}
					}
				}
			}
			method6466(aByteArray6148, aByteArray6177, aShortArray6150, i, i_291_);
			aByteArray6148 = null;
		}
		if (!bool || Class69.method1067(-1960232966) < l + (long) anInt6175) {
			method6465();
			return true;
		}
		return false;
	}

	Class547() throws Throwable {
		throw new Error();
	}

	static void method6495() {
		for (int i = 0; i < anInt6145; i++) {
			for (int i_323_ = 0; i_323_ < anInt6151; i_323_++) {
				Object object = anObjectArray6153[i + i_323_ * anInt6145];
				if (object != null) {
					if (object instanceof Class572_Sub4) {
						Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
						if (class572_sub4 != null) {
							for (int i_324_ = 0; i_324_ < (((Class572_Sub4) class572_sub4).anIntArray8970).length; i_324_++) {
								ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class572_Sub4) class572_sub4).anIntArray8970[i_324_]), -677659787)));
								int i_325_ = class509.anInt5642 * -105296855;
								if (class509.anIntArray5605 != null) {
									class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
									if (class509 != null)
										i_325_ = class509.anInt5642 * -105296855;
								}
								if (i_325_ != -1) {
									Class572_Sub19 class572_sub19 = new Class572_Sub19(i_325_);
									class572_sub19.anInt9140 = i * -1585994073;
									class572_sub19.anInt9141 = i_323_ * 1485372681;
									aClass675_6149.method7940(class572_sub19, -1641077413);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(integer.intValue(), -1016877910));
						int i_326_ = class509.anInt5642 * -105296855;
						if (class509.anIntArray5605 != null) {
							class509 = class509.method6047(anInterface15_6127, anInterface13_6159, 623307957);
							if (class509 != null)
								i_326_ = class509.anInt5642 * -105296855;
						}
						if (i_326_ != -1) {
							Class572_Sub19 class572_sub19 = new Class572_Sub19(i_326_);
							class572_sub19.anInt9140 = i * -1585994073;
							class572_sub19.anInt9141 = i_323_ * 1485372681;
							aClass675_6149.method7940(class572_sub19, -1665810652);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_327_ = 0; i_327_ < aHashMapArrayArrayArray6182[0].length; i_327_++) {
				for (int i_328_ = 0; i_328_ < aHashMapArrayArrayArray6182[0][0].length; i_328_++) {
					HashMap hashmap = aHashMapArrayArrayArray6182[i][i_327_][i_328_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class546 class546 = (Class546) iterator.next();
							if (((Class546) class546).anIntArray6119 != null) {
								for (int i_329_ = 0; i_329_ < (((Class546) class546).anIntArray6119).length; i_329_++) {
									ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class546) class546).anIntArray6119[i_329_]), -474253027)));
									int i_330_ = class509.anInt5642 * -105296855;
									if (class509.anIntArray5605 != null) {
										class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
										if (class509 != null)
											i_330_ = (class509.anInt5642 * -105296855);
									}
									if (i_330_ != -1) {
										Class572_Sub19 class572_sub19 = new Class572_Sub19(i_330_);
										class572_sub19.anInt9140 = ((i_327_ + (anInt6143 >> 6)) * 64 + (((Class546) class546).aByte6120) - anInt6143) * -1585994073;
										class572_sub19.anInt9141 = ((i_328_ + (anInt6165 >> 6)) * 64 + (((Class546) class546).aByte6117) - anInt6165) * 1485372681;
										aClass675_6149.method7940(class572_sub19, -1989997842);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6496() {
		for (int i = 0; i < anInt6145; i++) {
			for (int i_331_ = 0; i_331_ < anInt6151; i_331_++) {
				Object object = anObjectArray6153[i + i_331_ * anInt6145];
				if (object != null) {
					if (object instanceof Class572_Sub4) {
						Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
						if (class572_sub4 != null) {
							for (int i_332_ = 0; i_332_ < (((Class572_Sub4) class572_sub4).anIntArray8970).length; i_332_++) {
								ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class572_Sub4) class572_sub4).anIntArray8970[i_332_]), 1253490044)));
								int i_333_ = class509.anInt5642 * -105296855;
								if (class509.anIntArray5605 != null) {
									class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
									if (class509 != null)
										i_333_ = class509.anInt5642 * -105296855;
								}
								if (i_333_ != -1) {
									Class572_Sub19 class572_sub19 = new Class572_Sub19(i_333_);
									class572_sub19.anInt9140 = i * -1585994073;
									class572_sub19.anInt9141 = i_331_ * 1485372681;
									aClass675_6149.method7940(class572_sub19, -1916316347);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(integer.intValue(), 180961893));
						int i_334_ = class509.anInt5642 * -105296855;
						if (class509.anIntArray5605 != null) {
							class509 = class509.method6047(anInterface15_6127, anInterface13_6159, 623307957);
							if (class509 != null)
								i_334_ = class509.anInt5642 * -105296855;
						}
						if (i_334_ != -1) {
							Class572_Sub19 class572_sub19 = new Class572_Sub19(i_334_);
							class572_sub19.anInt9140 = i * -1585994073;
							class572_sub19.anInt9141 = i_331_ * 1485372681;
							aClass675_6149.method7940(class572_sub19, -1940422748);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_335_ = 0; i_335_ < aHashMapArrayArrayArray6182[0].length; i_335_++) {
				for (int i_336_ = 0; i_336_ < aHashMapArrayArrayArray6182[0][0].length; i_336_++) {
					HashMap hashmap = aHashMapArrayArrayArray6182[i][i_335_][i_336_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class546 class546 = (Class546) iterator.next();
							if (((Class546) class546).anIntArray6119 != null) {
								for (int i_337_ = 0; i_337_ < (((Class546) class546).anIntArray6119).length; i_337_++) {
									ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class546) class546).anIntArray6119[i_337_]), -1090110525)));
									int i_338_ = class509.anInt5642 * -105296855;
									if (class509.anIntArray5605 != null) {
										class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
										if (class509 != null)
											i_338_ = (class509.anInt5642 * -105296855);
									}
									if (i_338_ != -1) {
										Class572_Sub19 class572_sub19 = new Class572_Sub19(i_338_);
										class572_sub19.anInt9140 = ((i_335_ + (anInt6143 >> 6)) * 64 + (((Class546) class546).aByte6120) - anInt6143) * -1585994073;
										class572_sub19.anInt9141 = ((i_336_ + (anInt6165 >> 6)) * 64 + (((Class546) class546).aByte6117) - anInt6165) * 1485372681;
										aClass675_6149.method7940(class572_sub19, -1650425349);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6497() {
		for (int i = 0; i < anInt6145; i++) {
			for (int i_339_ = 0; i_339_ < anInt6151; i_339_++) {
				Object object = anObjectArray6153[i + i_339_ * anInt6145];
				if (object != null) {
					if (object instanceof Class572_Sub4) {
						Class572_Sub4 class572_sub4 = (Class572_Sub4) object;
						if (class572_sub4 != null) {
							for (int i_340_ = 0; i_340_ < (((Class572_Sub4) class572_sub4).anIntArray8970).length; i_340_++) {
								ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class572_Sub4) class572_sub4).anIntArray8970[i_340_]), 1232784868)));
								int i_341_ = class509.anInt5642 * -105296855;
								if (class509.anIntArray5605 != null) {
									class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
									if (class509 != null)
										i_341_ = class509.anInt5642 * -105296855;
								}
								if (i_341_ != -1) {
									Class572_Sub19 class572_sub19 = new Class572_Sub19(i_341_);
									class572_sub19.anInt9140 = i * -1585994073;
									class572_sub19.anInt9141 = i_339_ * 1485372681;
									aClass675_6149.method7940(class572_sub19, -1938428994);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(integer.intValue(), -856565750));
						int i_342_ = class509.anInt5642 * -105296855;
						if (class509.anIntArray5605 != null) {
							class509 = class509.method6047(anInterface15_6127, anInterface13_6159, 623307957);
							if (class509 != null)
								i_342_ = class509.anInt5642 * -105296855;
						}
						if (i_342_ != -1) {
							Class572_Sub19 class572_sub19 = new Class572_Sub19(i_342_);
							class572_sub19.anInt9140 = i * -1585994073;
							class572_sub19.anInt9141 = i_339_ * 1485372681;
							aClass675_6149.method7940(class572_sub19, -1532334045);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_343_ = 0; i_343_ < aHashMapArrayArrayArray6182[0].length; i_343_++) {
				for (int i_344_ = 0; i_344_ < aHashMapArrayArrayArray6182[0][0].length; i_344_++) {
					HashMap hashmap = aHashMapArrayArrayArray6182[i][i_343_][i_344_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class546 class546 = (Class546) iterator.next();
							if (((Class546) class546).anIntArray6119 != null) {
								for (int i_345_ = 0; i_345_ < (((Class546) class546).anIntArray6119).length; i_345_++) {
									ObjectDefinitions class509 = ((ObjectDefinitions) (aClass639_Sub16_6123.getDefinition((((Class546) class546).anIntArray6119[i_345_]), 1998265573)));
									int i_346_ = class509.anInt5642 * -105296855;
									if (class509.anIntArray5605 != null) {
										class509 = (class509.method6047(anInterface15_6127, anInterface13_6159, 623307957));
										if (class509 != null)
											i_346_ = (class509.anInt5642 * -105296855);
									}
									if (i_346_ != -1) {
										Class572_Sub19 class572_sub19 = new Class572_Sub19(i_346_);
										class572_sub19.anInt9140 = ((i_343_ + (anInt6143 >> 6)) * 64 + (((Class546) class546).aByte6120) - anInt6143) * -1585994073;
										class572_sub19.anInt9141 = ((i_344_ + (anInt6165 >> 6)) * 64 + (((Class546) class546).aByte6117) - anInt6165) * 1485372681;
										aClass675_6149.method7940(class572_sub19, -1849729390);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6498() {
		int[] is = new int[3];
		for (int i = 0; i < aClass548_6141.anInt6194 * 613080349; i++) {
			boolean bool = (aClass572_Sub12_Sub5_6129.method10290(aClass548_6141.anIntArray6192[i] >> 28 & 0x3, aClass548_6141.anIntArray6192[i] >> 14 & 0x3fff, aClass548_6141.anIntArray6192[i] & 0x3fff, is, (byte) 1));
			if (bool) {
				Class572_Sub19 class572_sub19 = new Class572_Sub19(aClass548_6141.anIntArray6193[i]);
				class572_sub19.anInt9140 = (is[1] - anInt6143) * -1585994073;
				class572_sub19.anInt9141 = (is[2] - anInt6165) * 1485372681;
				aClass675_6149.method7940(class572_sub19, -1601743869);
			}
		}
	}

	static void method6499() {
		int[] is = new int[3];
		for (int i = 0; i < aClass548_6141.anInt6194 * 613080349; i++) {
			boolean bool = (aClass572_Sub12_Sub5_6129.method10290(aClass548_6141.anIntArray6192[i] >> 28 & 0x3, aClass548_6141.anIntArray6192[i] >> 14 & 0x3fff, aClass548_6141.anIntArray6192[i] & 0x3fff, is, (byte) 1));
			if (bool) {
				Class572_Sub19 class572_sub19 = new Class572_Sub19(aClass548_6141.anIntArray6193[i]);
				class572_sub19.anInt9140 = (is[1] - anInt6143) * -1585994073;
				class572_sub19.anInt9141 = (is[2] - anInt6165) * 1485372681;
				aClass675_6149.method7940(class572_sub19, -1642936239);
			}
		}
	}

	static void method6500() {
		int[] is = new int[3];
		for (int i = 0; i < aClass548_6141.anInt6194 * 613080349; i++) {
			boolean bool = (aClass572_Sub12_Sub5_6129.method10290(aClass548_6141.anIntArray6192[i] >> 28 & 0x3, aClass548_6141.anIntArray6192[i] >> 14 & 0x3fff, aClass548_6141.anIntArray6192[i] & 0x3fff, is, (byte) 1));
			if (bool) {
				Class572_Sub19 class572_sub19 = new Class572_Sub19(aClass548_6141.anIntArray6193[i]);
				class572_sub19.anInt9140 = (is[1] - anInt6143) * -1585994073;
				class572_sub19.anInt9141 = (is[2] - anInt6165) * 1485372681;
				aClass675_6149.method7940(class572_sub19, -2007243319);
			}
		}
	}

	static void method6501() {
		aByteArray6148 = null;
		aByteArray6177 = null;
		aShortArray6150 = null;
		aByteArray6122 = null;
		aByteArray6152 = null;
		anObjectArray6153 = null;
		aByteArray6188 = null;
		aHashMapArrayArrayArray6182 = null;
		anIntArray6125 = null;
		aBoolArrayArray6179 = null;
	}

	static void method6502(int[] is, int i, int i_347_, int i_348_, int i_349_, int i_350_, boolean bool, int i_351_, int i_352_, int i_353_, int[] is_354_, byte[] is_355_, boolean bool_356_) {
		if (bool_356_ || i_351_ != 0 || i_352_ > 0) {
			if (i_352_ == 0)
				method6481(is, i, i_347_, i_348_, i_349_, i_350_, i_351_ | ~0xffffff);
			else {
				int i_357_ = i_353_ & 0x3f;
				if (i_357_ == 0 || anInt6136 == 0) {
					int i_358_ = anIntArray6125[i_352_];
					if (bool_356_ || i_358_ != 0)
						method6481(is, i, i_347_, i_348_, i_349_, i_350_, i_358_ | ~0xffffff);
				} else {
					int i_359_ = bool_356_ ? 0 : 1;
					int i_360_ = VarDefinition.method2775(i_353_ >> 6 & 0x3, i_357_, 2108407398);
					i_357_ = Class280.method3792(i_357_, (byte) 88);
					method6505(is, i, i_347_, i_348_, i_349_, i_350_, i_351_, anIntArray6125[i_352_], aByteArrayArrayArray6166[i_357_ - 1][i_360_], anInt6136, i_359_);
				}
			}
		}
		if (bool && is_354_ != null) {
			int i_361_ = i_347_ - i + 1;
			int i_362_ = i_349_ - i_348_ + 1;
			for (int i_363_ = 0; i_363_ < is_354_.length; i_363_++) {
				int i_364_ = is_355_[i_363_] & 0x3f;
				if (i_364_ == Class516.aClass516_5743.anInt5742 * 1870735441 || i_364_ == Class516.aClass516_5729.anInt5742 * 1870735441 || i_364_ == Class516.aClass516_5728.anInt5742 * 1870735441 || (i_364_ == Class516.aClass516_5720.anInt5742 * 1870735441)) {
					ObjectDefinitions class509 = ((ObjectDefinitions) aClass639_Sub16_6123.getDefinition(is_354_[i_363_], -1243264730));
					if (class509.anInt5623 * 337621963 == -1) {
						int i_365_ = -3355444;
						if (class509.anInt5627 * -1262171129 == 1)
							i_365_ = -3407872;
						int i_366_ = is_355_[i_363_] >> 6 & 0x3;
						if (i_364_ == (Class516.aClass516_5743.anInt5742 * 1870735441)) {
							if (i_366_ == 0)
								method6457(is, i, i_349_, i_362_, i_350_, i_365_);
							else if (i_366_ == 1)
								method6487(is, i, i_349_, i_361_, i_350_, i_365_);
							else if (i_366_ == 2)
								method6457(is, i_347_, i_349_, i_362_, i_350_, i_365_);
							else
								method6487(is, i, i_348_, i_361_, i_350_, i_365_);
						} else if (i_364_ == (Class516.aClass516_5729.anInt5742 * 1870735441)) {
							if (i_366_ == 0) {
								method6457(is, i, i_349_, i_362_, i_350_, -1);
								method6487(is, i, i_349_, i_361_, i_350_, i_365_);
							} else if (i_366_ == 1) {
								method6457(is, i_347_, i_349_, i_362_, i_350_, -1);
								method6487(is, i, i_349_, i_361_, i_350_, i_365_);
							} else if (i_366_ == 2) {
								method6457(is, i_347_, i_349_, i_362_, i_350_, -1);
								method6487(is, i, i_348_, i_361_, i_350_, i_365_);
							} else {
								method6457(is, i, i_349_, i_362_, i_350_, -1);
								method6487(is, i, i_348_, i_361_, i_350_, i_365_);
							}
						} else if (i_364_ == (Class516.aClass516_5728.anInt5742 * 1870735441)) {
							if (i_366_ == 0)
								method6487(is, i, i_349_, 1, i_350_, i_365_);
							else if (i_366_ == 1)
								method6487(is, i_347_, i_349_, 1, i_350_, i_365_);
							else if (i_366_ == 2)
								method6487(is, i_347_, i_348_, 1, i_350_, i_365_);
							else
								method6487(is, i, i_348_, 1, i_350_, i_365_);
						} else if (i_364_ == (Class516.aClass516_5720.anInt5742 * 1870735441)) {
							if (i_366_ == 0 || i_366_ == 2) {
								for (int i_367_ = 0; i_367_ < i_362_; i_367_++)
									method6487(is, i + i_367_, i_348_ + i_367_, 1, i_350_, i_365_);
							} else {
								for (int i_368_ = 0; i_368_ < i_362_; i_368_++)
									method6487(is, i + i_368_, i_349_ - i_368_, 1, i_350_, i_365_);
							}
						}
					}
				}
			}
		}
	}

	public static void method6503(Class248 class248, Class248 class248_369_, Class639_Sub2 class639_sub2, Class639_Sub6 class639_sub6, Class639_Sub16 class639_sub16, Class639_Sub12 class639_sub12, Class639_Sub1 class639_sub1, Interface15 interface15, Interface13 interface13) {
		idx23 = class248;
		idx41 = class248_369_;
		aClass639_Sub2_6133 = class639_sub2;
		aClass639_Sub6_6147 = class639_sub6;
		aClass639_Sub16_6123 = class639_sub16;
		aClass639_Sub12_6173 = class639_sub12;
		aClass639_Sub1_6155 = class639_sub1;
		anInterface15_6127 = interface15;
		anInterface13_6159 = interface13;
		aClass676_6132.method7964((byte) 106);
		int[] is = idx23.method3374(0, 1864440497);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class572_Sub12_Sub5 class572_sub12_sub5 = Class343.method4303(idx23, is[i], (byte) 5);
				aClass676_6132.put(class572_sub12_sub5, (long) ((class572_sub12_sub5.anInt11325) * -2130748737));
			}
		}
		Class245.method3353(true, false, (byte) 80);
	}

	static int method6504() {
		return (int) (64.0F * aFloat6128 / 2.0F);
	}

	static void method6505(int[] is, int i, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, byte[] is_376_, int i_377_, int i_378_) {
		int i_379_ = 0;
		int i_380_ = 0;
		int i_381_ = i_370_ - i + 1;
		int i_382_ = i_372_ - i_371_ + 1;
		int i_383_ = (i_377_ << 16) / i_381_;
		int i_384_ = (is_376_.length / i_377_ << 16) / i_382_;
		int i_385_ = i + (i_373_ - i_372_ - 1) * i_373_;
		int i_386_ = i_374_ >> 24;
		int i_387_ = i_375_ >> 24;
		if (i_378_ == 0 || i_378_ == 1 && i_386_ == 255 && i_387_ == 255) {
			int i_388_ = i_379_;
			for (int i_389_ = -i_382_; i_389_ < 0; i_389_++) {
				int i_390_ = (i_380_ >> 16) * i_377_;
				for (int i_391_ = -i_381_; i_391_ < 0; i_391_++) {
					if (is_376_[(i_379_ >> 16) + i_390_] != 0)
						is[i_385_++] = i_375_;
					else
						is[i_385_++] = i_374_;
					i_379_ += i_383_;
				}
				i_380_ += i_384_;
				i_379_ = i_388_;
				i_385_ += i_373_ - i_381_;
			}
		} else if (i_378_ == 1) {
			int i_392_ = i_379_;
			for (int i_393_ = -i_382_; i_393_ < 0; i_393_++) {
				int i_394_ = (i_380_ >> 16) * i_377_;
				for (int i_395_ = -i_381_; i_395_ < 0; i_395_++) {
					int i_396_ = i_374_;
					if (is_376_[(i_379_ >> 16) + i_394_] != 0)
						i_396_ = i_375_;
					int i_397_ = i_396_ >>> 24;
					int i_398_ = 255 - i_397_;
					int i_399_ = is[i_385_];
					is[i_385_++] = ~0xffffff | ((((i_396_ & 0xff00ff) * i_397_ + (i_399_ & 0xff00ff) * i_398_) & ~0xff00ff) + (((i_396_ & 0xff00) * i_397_ + (i_399_ & 0xff00) * i_398_) & 0xff0000)) >> 8;
					i_379_ += i_383_;
				}
				i_380_ += i_384_;
				i_379_ = i_392_;
				i_385_ += i_373_ - i_381_;
			}
		} else
			throw new IllegalArgumentException();
	}

	static void method6506(int i, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_, int i_405_, int i_406_) {
		anInt6157 = i - anInt6143;
		anInt6170 = i_400_ - anInt6165;
		anInt6183 = i_401_ - anInt6143;
		anInt6156 = i_402_ - anInt6165;
		anInt6185 = i_403_;
		anInt6186 = i_404_;
		anInt6187 = i_405_;
		anInt6167 = i_406_;
	}

	static void method6507(int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.get((long) i);
		if (class572_sub12_sub5 != null && class572_sub12_sub5 != aClass572_Sub12_Sub5_6129) {
			aClass572_Sub12_Sub5_6129 = class572_sub12_sub5;
			aBool6130 = (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5376 * -982340345);
		}
	}

	static void method6508(int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) aClass676_6132.get((long) i);
		if (class572_sub12_sub5 != null && class572_sub12_sub5 != aClass572_Sub12_Sub5_6129) {
			aClass572_Sub12_Sub5_6129 = class572_sub12_sub5;
			aBool6130 = (aClass572_Sub12_Sub5_6129.anInt11325 * -2130748737 == aClass482_6181.anInt5376 * -982340345);
		}
	}
}
