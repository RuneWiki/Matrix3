package game;

/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class571 {
	int anInt6400;
	static final int anInt6401 = 0;
	static final int anInt6402 = 1;
	int anInt6403;
	static final int anInt6404 = 2;
	int anInt6405;
	int anInt6406;
	int anInt6407;
	static Model aClass89_6408;
	boolean aBool6409;
	int anInt6410;
	int anInt6411;
	static final int anInt6412 = 24;
	int anInt6413;
	int anInt6414;
	int anInt6415;
	int anInt6416;
	int anInt6417;
	int anInt6418;
	int anInt6419;
	static final int anInt6420 = 24;
	static Class161 aClass161_6421;
	static final int anInt6422 = 512;
	static final int anInt6423 = 192;
	static final int anInt6424 = 128;
	static final int anInt6425 = 13;
	static final int anInt6426 = 16;
	Class161 aClass161_6427;
	static Class161 aClass161_6428;
	int anInt6429;
	static int[] anIntArray6430 = new int[4];

	static void method6779(Class106 class106) {
		if (aClass161_6421 == null) {
			int[] is = new int[16384];
			int[] is_0_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_1_ = 64 - i;
				i_1_ *= i_1_;
				int i_2_ = 128 - i - 1;
				int i_3_ = i * 128;
				int i_4_ = i_2_ * 128;
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					int i_6_ = 64 - i_5_;
					i_6_ *= i_6_;
					int i_7_ = 128 - i_5_ - 1;
					int i_8_ = 256 - (i_6_ + i_1_ << 8) / 4096;
					i_8_ = i_8_ * 3072 / 1536;
					if (i_8_ < 0)
						i_8_ = 0;
					else if (i_8_ > 255)
						i_8_ = 255;
					int i_9_ = i_8_ / 2;
					is_0_[i_3_ + i_5_] = is_0_[i_3_ + i_7_] = is_0_[i_4_ + i_5_] = is_0_[i_4_ + i_7_] = ~0xffffff | i_8_ << 16;
					is[i_3_ + i_5_] = is[i_3_ + i_7_] = is[i_4_ + i_5_] = is[i_4_ + i_7_] = 127 - i_9_ << 24 | 0xffffff;
				}
			}
			aClass161_6421 = class106.method1744(is_0_, 0, 128, 128, 128, -356936343);
			aClass161_6428 = class106.method1744(is, 0, 128, 128, 128, -827389072);
		}
	}

	static void method6780(Class106 class106) {
		if (aClass89_6408 == null) {
			Class159 class159 = new Class159(580, 1104, 1);
			class159.method2552((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class159.method2560(0, 128, 0);
			class159.method2560(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_10_ = i * 8192 / 24;
				int i_11_ = Class325.anIntArray4103[i_10_];
				int i_12_ = Class325.anIntArray4105[i_10_];
				for (int i_13_ = 1; i_13_ < 24; i_13_++) {
					int i_14_ = i_13_ * 8192 / 24;
					int i_15_ = Class325.anIntArray4105[i_14_] >> 7;
					int i_16_ = Class325.anIntArray4103[i_14_] * i_11_ >> 21;
					int i_17_ = Class325.anIntArray4103[i_14_] * i_12_ >> 21;
					class159.method2560(i_17_, i_15_, -i_16_);
				}
				if (i > 0) {
					int i_18_ = i * 23 + 2;
					int i_19_ = i_18_ - 23;
					class159.method2557(0, i_19_, i_18_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_20_ = 1; i_20_ < 23; i_20_++) {
						int i_21_ = i_19_ + 1;
						int i_22_ = i_18_ + 1;
						class159.method2557(i_19_, i_21_, i_18_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class159.method2557(i_21_, i_22_, i_18_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_19_ = i_21_;
						i_18_ = i_22_;
					}
					class159.method2557(i_18_, i_19_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class159.anInt1775 = class159.anInt1791;
			class159.anIntArray1780 = null;
			class159.anIntArray1813 = null;
			class159.aByteArray1799 = null;
			aClass89_6408 = class106.method1755(class159, 51200, 33, 64, 768);
		}
	}

	void method6781(Class106 class106, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		if (((Class571) this).aClass161_6427 != null) {
			float[] fs = new float[3];
			float f = (float) -(((Class571) this).anInt6406 - i_28_ << 16);
			float f_32_ = (float) (((Class571) this).anInt6407 - i_29_ << 15);
			float f_33_ = (float) -(((Class571) this).anInt6417 - i_30_ << 16);
			float[] fs_34_ = new float[3];
			class106.method1762().method3586(fs_34_);
			f += fs_34_[0];
			f_32_ += fs_34_[1];
			f_33_ += fs_34_[2];
			class106.method2035(f, f_32_, f_33_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_35_ = (int) (fs[0] - (float) (((Class571) this).anInt6429 / 2));
				int i_36_ = (int) (fs[1] - (float) (((Class571) this).anInt6429 / 2));
				if (i_36_ < i_25_ && i_36_ + ((Class571) this).anInt6429 > 0 && i_35_ < i_24_ && i_35_ + ((Class571) this).anInt6429 > 0)
					((Class571) this).aClass161_6427.method2598(i_35_, i_36_, ((Class571) this).anInt6429, ((Class571) this).anInt6429, 0, i_31_ << 24 | 0xffffff, 1);
			}
		}
	}

	static void method6782(Class106 class106) {
		if (aClass89_6408 == null) {
			Class159 class159 = new Class159(580, 1104, 1);
			class159.method2552((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class159.method2560(0, 128, 0);
			class159.method2560(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_37_ = i * 8192 / 24;
				int i_38_ = Class325.anIntArray4103[i_37_];
				int i_39_ = Class325.anIntArray4105[i_37_];
				for (int i_40_ = 1; i_40_ < 24; i_40_++) {
					int i_41_ = i_40_ * 8192 / 24;
					int i_42_ = Class325.anIntArray4105[i_41_] >> 7;
					int i_43_ = Class325.anIntArray4103[i_41_] * i_38_ >> 21;
					int i_44_ = Class325.anIntArray4103[i_41_] * i_39_ >> 21;
					class159.method2560(i_44_, i_42_, -i_43_);
				}
				if (i > 0) {
					int i_45_ = i * 23 + 2;
					int i_46_ = i_45_ - 23;
					class159.method2557(0, i_46_, i_45_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_47_ = 1; i_47_ < 23; i_47_++) {
						int i_48_ = i_46_ + 1;
						int i_49_ = i_45_ + 1;
						class159.method2557(i_46_, i_48_, i_45_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class159.method2557(i_48_, i_49_, i_45_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_46_ = i_48_;
						i_45_ = i_49_;
					}
					class159.method2557(i_45_, i_46_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class159.anInt1775 = class159.anInt1791;
			class159.anIntArray1780 = null;
			class159.anIntArray1813 = null;
			class159.aByteArray1799 = null;
			aClass89_6408 = class106.method1755(class159, 51200, 33, 64, 768);
		}
	}

	void method6783(Class106 class106, Class571 class571_50_) {
		Class159 class159 = Class159.method2569(Class124.aClass248_1508, ((Class571) this).anInt6410, 0);
		if (class159 != null) {
			class106.method1718(anIntArray6430);
			class106.method1715(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415);
			class106.method1719(2, 0);
			class106.method1725(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, 0, 0);
			int i = 0;
			int i_51_ = 0;
			int i_52_ = 256;
			if (class571_50_ != null) {
				if (((Class571) class571_50_).aBool6409) {
					i = -((Class571) class571_50_).anInt6406;
					i_51_ = -((Class571) class571_50_).anInt6407;
					i_52_ = -((Class571) class571_50_).anInt6417;
				} else {
					i = (((Class571) this).anInt6406 - ((Class571) class571_50_).anInt6406);
					i_51_ = (((Class571) this).anInt6407 - ((Class571) class571_50_).anInt6407);
					i_52_ = (((Class571) this).anInt6417 - ((Class571) class571_50_).anInt6417);
				}
			}
			if (((Class571) this).anInt6416 != 0) {
				int i_53_ = -((Class571) this).anInt6416 & 0x3fff;
				int i_54_ = Class325.anIntArray4103[i_53_];
				int i_55_ = Class325.anIntArray4105[i_53_];
				int i_56_ = i_51_ * i_55_ - i_52_ * i_54_ >> 14;
				i_52_ = i_51_ * i_54_ + i_52_ * i_55_ >> 14;
				i_51_ = i_56_;
			}
			if (((Class571) this).anInt6413 != 0) {
				int i_57_ = -((Class571) this).anInt6413 & 0x3fff;
				int i_58_ = Class325.anIntArray4103[i_57_];
				int i_59_ = Class325.anIntArray4105[i_57_];
				int i_60_ = i_52_ * i_58_ + i * i_59_ >> 14;
				i_52_ = i_52_ * i_59_ - i * i_58_ >> 14;
				i = i_60_;
			}
			class106.method1709(1.0F);
			class106.method1767(((Class571) this).anInt6411, 1.0F, 1.0F, (float) i, (float) i_51_, (float) i_52_);
			class159.method2565(((Class571) this).anInt6418 & 0x3fff, ((Class571) this).anInt6400 & 0x3fff, ((Class571) this).anInt6419 & 0x3fff);
			Model model = class106.method1755(class159, 2048, 0, 64, 768);
			int i_61_ = model.method1381() - model.method1380();
			int i_62_ = model.method1356() - model.method1382();
			int i_63_ = i_61_ > i_62_ ? i_61_ : i_62_;
			int i_64_ = 1024 * ((Class571) this).anInt6415 / i_63_;
			Class250 class250 = class106.method1765();
			Class250 class250_65_ = class106.method1752();
			class250_65_.method3454((float) (((Class571) this).anInt6415 / 2), (float) (((Class571) this).anInt6415 / 2), (float) i_64_, (float) i_64_, 50.0F, 50000.0F, (float) class106.method1683(-702135710).method1648(), (float) class106.method1683(1788813008).method1646(), 1024.0F);
			class106.method1764(class250_65_);
			Class261 class261 = new Class261();
			class106.method1761(class261);
			Class261 class261_66_ = class106.method1753();
			class261_66_.method3588(0.0F, 0.0F, (float) (50 - model.method1384()));
			model.method1375(class261_66_, null, 1);
			((Class571) this).aClass161_6427 = class106.method1821(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, true);
			((Class571) this).aClass161_6427.method2594(0, 0, 3);
			class106.method1764(class250);
			class106.method1715(anIntArray6430[0], anIntArray6430[1], anIntArray6430[2], anIntArray6430[3]);
		}
	}

	boolean method6784(int i, int i_67_, int i_68_, int i_69_) {
		int i_70_;
		int i_71_;
		int i_72_;
		if (!((Class571) this).aBool6409) {
			i_70_ = ((Class571) this).anInt6406 - i;
			i_71_ = ((Class571) this).anInt6407 - i_67_;
			i_72_ = ((Class571) this).anInt6417 - i_68_;
			((Class571) this).anInt6414 = (int) Math.sqrt((double) (i_70_ * i_70_ + i_71_ * i_71_ + i_72_ * i_72_));
			if (((Class571) this).anInt6414 == 0)
				((Class571) this).anInt6414 = 1;
			i_70_ = (i_70_ << 8) / ((Class571) this).anInt6414;
			i_71_ = (i_71_ << 8) / ((Class571) this).anInt6414;
			i_72_ = (i_72_ << 8) / ((Class571) this).anInt6414;
		} else {
			((Class571) this).anInt6414 = 1073741823;
			i_70_ = ((Class571) this).anInt6406;
			i_71_ = ((Class571) this).anInt6407;
			i_72_ = ((Class571) this).anInt6417;
		}
		int i_73_ = (int) (Math.sqrt((double) (i_70_ * i_70_ + i_71_ * i_71_ + i_72_ * i_72_)) * 256.0);
		if (i_73_ > 128) {
			i_70_ = (i_70_ << 16) / i_73_;
			i_71_ = (i_71_ << 16) / i_73_;
			i_72_ = (i_72_ << 16) / i_73_;
			((Class571) this).anInt6429 = (((Class571) this).anInt6405 * i_69_ / (((Class571) this).aBool6409 ? 1024 : ((Class571) this).anInt6414));
		} else
			((Class571) this).anInt6429 = 0;
		if (((Class571) this).anInt6429 < 8) {
			((Class571) this).aClass161_6427 = null;
			return false;
		}
		int i_74_ = HashTable.nextPowerOfTwo(((Class571) this).anInt6429, 1795857393);
		if (i_74_ > i_69_)
			i_74_ = Cs2CallPointer.method5627(i_69_, 326245663);
		if (i_74_ > 512)
			i_74_ = 512;
		if (i_74_ != ((Class571) this).anInt6415)
			((Class571) this).anInt6415 = i_74_;
		((Class571) this).anInt6416 = (int) (Math.asin((double) ((float) i_71_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		((Class571) this).anInt6413 = (int) (Math.atan2((double) i_70_, (double) -i_72_) * 2607.5945876176133) & 0x3fff;
		((Class571) this).aClass161_6427 = null;
		return true;
	}

	static void method6785(Class106 class106) {
		if (aClass89_6408 == null) {
			Class159 class159 = new Class159(580, 1104, 1);
			class159.method2552((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class159.method2560(0, 128, 0);
			class159.method2560(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_75_ = i * 8192 / 24;
				int i_76_ = Class325.anIntArray4103[i_75_];
				int i_77_ = Class325.anIntArray4105[i_75_];
				for (int i_78_ = 1; i_78_ < 24; i_78_++) {
					int i_79_ = i_78_ * 8192 / 24;
					int i_80_ = Class325.anIntArray4105[i_79_] >> 7;
					int i_81_ = Class325.anIntArray4103[i_79_] * i_76_ >> 21;
					int i_82_ = Class325.anIntArray4103[i_79_] * i_77_ >> 21;
					class159.method2560(i_82_, i_80_, -i_81_);
				}
				if (i > 0) {
					int i_83_ = i * 23 + 2;
					int i_84_ = i_83_ - 23;
					class159.method2557(0, i_84_, i_83_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_85_ = 1; i_85_ < 23; i_85_++) {
						int i_86_ = i_84_ + 1;
						int i_87_ = i_83_ + 1;
						class159.method2557(i_84_, i_86_, i_83_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class159.method2557(i_86_, i_87_, i_83_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_84_ = i_86_;
						i_83_ = i_87_;
					}
					class159.method2557(i_83_, i_84_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class159.anInt1775 = class159.anInt1791;
			class159.anIntArray1780 = null;
			class159.anIntArray1813 = null;
			class159.aByteArray1799 = null;
			aClass89_6408 = class106.method1755(class159, 51200, 33, 64, 768);
		}
	}

	static void method6786(Class106 class106) {
		if (aClass161_6421 == null) {
			int[] is = new int[16384];
			int[] is_88_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_89_ = 64 - i;
				i_89_ *= i_89_;
				int i_90_ = 128 - i - 1;
				int i_91_ = i * 128;
				int i_92_ = i_90_ * 128;
				for (int i_93_ = 0; i_93_ < 64; i_93_++) {
					int i_94_ = 64 - i_93_;
					i_94_ *= i_94_;
					int i_95_ = 128 - i_93_ - 1;
					int i_96_ = 256 - (i_94_ + i_89_ << 8) / 4096;
					i_96_ = i_96_ * 3072 / 1536;
					if (i_96_ < 0)
						i_96_ = 0;
					else if (i_96_ > 255)
						i_96_ = 255;
					int i_97_ = i_96_ / 2;
					is_88_[i_91_ + i_93_] = is_88_[i_91_ + i_95_] = is_88_[i_92_ + i_93_] = is_88_[i_92_ + i_95_] = ~0xffffff | i_96_ << 16;
					is[i_91_ + i_93_] = is[i_91_ + i_95_] = is[i_92_ + i_93_] = is[i_92_ + i_95_] = 127 - i_97_ << 24 | 0xffffff;
				}
			}
			aClass161_6421 = class106.method1744(is_88_, 0, 128, 128, 128, -1212698732);
			aClass161_6428 = class106.method1744(is, 0, 128, 128, 128, 284828914);
		}
	}

	static void method6787() {
		aClass89_6408 = null;
		aClass161_6421 = null;
	}

	static void method6788() {
		aClass89_6408 = null;
		aClass161_6421 = null;
	}

	boolean method6789(Class106 class106, Class571 class571_98_) {
		return (((Class571) this).aClass161_6427 != null || method6790(class106, class571_98_));
	}

	public Class571(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, boolean bool, int i_105_, int i_106_, int i_107_) {
		((Class571) this).anInt6406 = i_100_;
		((Class571) this).anInt6407 = i_101_;
		((Class571) this).anInt6417 = i_102_;
		((Class571) this).aBool6409 = bool;
		((Class571) this).anInt6410 = i_99_;
		((Class571) this).anInt6411 = i_104_;
		((Class571) this).anInt6405 = i_103_;
		((Class571) this).anInt6403 = i;
		((Class571) this).anInt6418 = i_105_;
		((Class571) this).anInt6400 = i_106_;
		((Class571) this).anInt6419 = i_107_;
	}

	boolean method6790(Class106 class106, Class571 class571_108_) {
		if (((Class571) this).aClass161_6427 == null) {
			if (((Class571) this).anInt6403 == 0) {
				if (Class580.anInterface5_7693.method25(((Class571) this).anInt6410, Class514.aClass514_5713, 0.7F, ((Class571) this).anInt6415, ((Class571) this).anInt6415, false, 1201095042)) {
					int[] is = (Class580.anInterface5_7693.method24(((Class571) this).anInt6410, 0.7F, ((Class571) this).anInt6415, ((Class571) this).anInt6415, false, 1371302107));
					((Class571) this).aClass161_6427 = class106.method1744(is, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, ((Class571) this).anInt6415, -152111448);
				}
			} else if (((Class571) this).anInt6403 == 2)
				method6783(class106, class571_108_);
			else if (((Class571) this).anInt6403 == 1)
				method6792(class106, class571_108_);
		}
		return ((Class571) this).aClass161_6427 != null;
	}

	static void method6791() {
		aClass89_6408 = null;
		aClass161_6421 = null;
	}

	void method6792(Class106 class106, Class571 class571_109_) {
		method6785(class106);
		method6786(class106);
		class106.method1718(anIntArray6430);
		class106.method1715(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415);
		class106.method1719(2, 0);
		class106.method1725(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, ~0xffffff | ((Class571) this).anInt6411, 0);
		int i = 0;
		int i_110_ = 0;
		int i_111_ = 256;
		if (class571_109_ != null) {
			if (((Class571) class571_109_).aBool6409) {
				i = -((Class571) class571_109_).anInt6406;
				i_110_ = -((Class571) class571_109_).anInt6407;
				i_111_ = -((Class571) class571_109_).anInt6417;
			} else {
				i = (((Class571) class571_109_).anInt6406 - ((Class571) this).anInt6406);
				i_110_ = (((Class571) class571_109_).anInt6407 - ((Class571) this).anInt6407);
				i_111_ = (((Class571) class571_109_).anInt6417 - ((Class571) this).anInt6417);
			}
		}
		if (((Class571) this).anInt6416 != 0) {
			int i_112_ = Class325.anIntArray4103[((Class571) this).anInt6416];
			int i_113_ = Class325.anIntArray4105[((Class571) this).anInt6416];
			int i_114_ = i_110_ * i_113_ - i_111_ * i_112_ >> 14;
			i_111_ = i_110_ * i_112_ + i_111_ * i_113_ >> 14;
			i_110_ = i_114_;
		}
		if (((Class571) this).anInt6413 != 0) {
			int i_115_ = Class325.anIntArray4103[((Class571) this).anInt6413];
			int i_116_ = Class325.anIntArray4105[((Class571) this).anInt6413];
			int i_117_ = i_111_ * i_115_ + i * i_116_ >> 14;
			i_111_ = i_111_ * i_116_ - i * i_115_ >> 14;
			i = i_117_;
		}
		Model model = aClass89_6408.method1351((byte) 0, 51200, true);
		model.method1494((short) 0, (short) ((Class571) this).anInt6410);
		class106.method1709(1.0F);
		class106.method1767(16777215, 1.0F, 1.0F, (float) i, (float) i_110_, (float) i_111_);
		int i_118_ = (1024 * ((Class571) this).anInt6415 / (model.method1381() - model.method1380()));
		if (((Class571) this).anInt6411 != 0)
			i_118_ = i_118_ * 13 / 16;
		Class250 class250 = class106.method1765();
		Class250 class250_119_ = class106.method1752();
		class250_119_.method3454((float) (((Class571) this).anInt6415 / 2), (float) (((Class571) this).anInt6415 / 2), (float) i_118_, (float) i_118_, 50.0F, 50000.0F, (float) class106.method1683(979196672).method1648(), (float) class106.method1683(2053826794).method1646(), 1024.0F);
		class106.method1764(class250_119_);
		class106.method1761(new Class261());
		Class261 class261 = new Class261();
		class261.method3588(0.0F, 0.0F, (float) (50 - model.method1384()));
		model.method1375(class261, null, 1);
		int i_120_ = ((Class571) this).anInt6415 * 13 / 16;
		int i_121_ = (((Class571) this).anInt6415 - i_120_) / 2;
		aClass161_6428.method2598(i_121_, i_121_, i_120_, i_120_, 0, ~0xffffff | ((Class571) this).anInt6411, 1);
		((Class571) this).aClass161_6427 = class106.method1821(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, true);
		class106.method1719(2, 0);
		class106.method1725(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, 0, 0);
		aClass161_6421.method2598(0, 0, ((Class571) this).anInt6415, ((Class571) this).anInt6415, 1, 0, 0);
		((Class571) this).aClass161_6427.method2594(0, 0, 3);
		class106.method1764(class250);
		class106.method1715(anIntArray6430[0], anIntArray6430[1], anIntArray6430[2], anIntArray6430[3]);
	}
}
