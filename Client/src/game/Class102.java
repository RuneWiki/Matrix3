package game;

/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class102 {
	static int anInt1369 = -1797575269;
	static int anInt1370;
	public static final int anInt1371 = 0;
	public static final int anInt1372 = 1;
	public static final int anInt1373 = 0;
	static int anInt1374;
	static int anInt1375 = -161794945;
	static int anInt1376 = 0;
	static int anInt1377 = 0;
	Class106 aClass106_1378;
	Class284 aClass284_1379;
	static int anInt1380;
	static int anInt1381;
	static String[] aStringArray1382;

	abstract void method1609(char c, int i, int i_0_, int i_1_, boolean bool);

	void method1610(String string, int i, int i_2_, Class161[] class161s, int[] is, Class167 class167, int i_3_, int i_4_, int i_5_) {
		i_2_ -= ((Class102) this).aClass284_1379.anInt3411 * -1605051853;
		int i_6_ = -1;
		int i_7_ = -1;
		int i_8_ = string.length();
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			char c = (char) (Class525.method6305(string.charAt(i_9_), -962688464) & 0xff);
			if (60 == c)
				i_6_ = i_9_;
			else {
				if (62 == c && -1 != i_6_) {
					String string_10_ = string.substring(i_6_ + 1, i_9_);
					i_6_ = -1;
					if (string_10_.equals("lt"))
						c = '<';
					else if (string_10_.equals("gt"))
						c = '>';
					else if (string_10_.equals("nbsp"))
						c = '\u00a0';
					else if (string_10_.equals("shy"))
						c = '\u00ad';
					else if (string_10_.equals("times"))
						c = '\u00d7';
					else if (string_10_.equals("euro"))
						c = '\u20ac';
					else if (string_10_.equals("copy"))
						c = '\u00a9';
					else if (string_10_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_10_.startsWith("img=")) {
							try {
								int i_11_ = Class97.method1565(string_10_.substring(4), (byte) -51);
								Class161 class161 = class161s[i_11_];
								int i_12_ = (null != is ? is[i_11_] : class161.method2589());
								if ((-1820710531 * anInt1377 & ~0xffffff) == -16777216)
									class161.method2619(i, (i_2_ + (-1605051853 * (((Class102) this).aClass284_1379.anInt3411)) - i_12_), 1, -1, 1);
								else
									class161.method2619(i, i_2_ + ((((Class102) this).aClass284_1379.anInt3411) * -1605051853) - i_12_, 0, (-1820710531 * anInt1377 & ~0xffffff | 0xffffff), 1);
								i += class161s[i_11_].method45();
								i_7_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method1629(string_10_, -1454119917);
						continue;
					}
				}
				if (-1 == i_6_) {
					if (i_7_ != -1)
						i += ((Class102) this).aClass284_1379.method3842(i_7_, c, -2080222680);
					if (c != 32) {
						if (class167 == null) {
							if (0 != (-586589605 * anInt1370 & ~0xffffff))
								method1609(c, i + 1, 1 + i_2_, anInt1370 * -586589605, true);
							method1609(c, i, i_2_, anInt1377 * -1820710531, false);
						} else {
							if (0 != (anInt1370 * -586589605 & ~0xffffff))
								method1621(c, i + 1, 1 + i_2_, anInt1370 * -586589605, true, class167, i_3_, i_4_);
							method1621(c, i, i_2_, -1820710531 * anInt1377, false, class167, i_3_, i_4_);
						}
					} else if (anInt1381 * 137367697 > 0) {
						anInt1380 += anInt1381 * -1881121973;
						i += 1861459475 * anInt1380 >> 8;
						anInt1380 = -999105509 * (1861459475 * anInt1380 & 0xff);
					}
					int i_13_ = ((Class102) this).aClass284_1379.method3839(c, (byte) -21);
					if (1843171181 * anInt1369 != -1)
						((Class102) this).aClass106_1378.method1722(i, i_2_ + (int) ((double) ((((Class102) this).aClass284_1379.anInt3411) * -1605051853) * 0.7), i_13_, anInt1369 * 1843171181, (byte) 5);
					if (-1 != -482380671 * anInt1375)
						((Class102) this).aClass106_1378.method1722(i, 1 + (-1605051853 * (((Class102) this).aClass284_1379.anInt3411) + i_2_), i_13_, anInt1375 * -482380671, (byte) 71);
					i += i_13_;
					i_7_ = c;
				}
			}
		}
	}

	public void method1611(String string, int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (string != null) {
			method1617(i_15_, i_16_, 30871020);
			method1610(string, i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100), i_14_, null, null, null, 0, 0, 661897206);
		}
	}

	public void method1612(String string, int i, int i_18_, int i_19_, int i_20_, byte i_21_) {
		if (string != null) {
			method1617(i_19_, i_20_, 30871020);
			method1610(string, i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100) / 2, i_18_, null, null, null, 0, 0, -2054184515);
		}
	}

	public int method1613(String string, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, Class161[] class161s, int[] is, Class167 class167, int i_30_, int i_31_, byte i_32_) {
		return method1628(string, i, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, 0, class161s, is, class167, i_30_, i_31_, -523669046);
	}

	public void method1614(String string, int i, int i_33_, int i_34_, int i_35_, int i_36_, byte i_37_) {
		if (null != string) {
			method1617(i_34_, i_35_, 30871020);
			int i_38_ = string.length();
			int[] is = new int[i_38_];
			int[] is_39_ = new int[i_38_];
			for (int i_40_ = 0; i_40_ < i_38_; i_40_++) {
				is[i_40_] = (int) (Math.sin((double) i_40_ / 5.0 + (double) i_36_ / 5.0) * 5.0);
				is_39_[i_40_] = (int) (Math.sin((double) i_40_ / 3.0 + (double) i_36_ / 5.0) * 5.0);
			}
			method1619(string, i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100) / 2, i_33_, null, null, is, is_39_, 855188961);
		}
	}

	public void method1615(String string, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (null != string) {
			method1617(i_42_, i_43_, 30871020);
			double d = 7.0 - (double) i_45_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_47_ = string.length();
			int[] is = new int[i_47_];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
				is[i_48_] = (int) (Math.sin((double) i_44_ / 1.0 + (double) i_48_ / 1.5) * d);
			method1619(string, i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100) / 2, i_41_, null, null, null, is, 855188961);
		}
	}

	public int method1616(String string, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, Random random, int i_56_, int[] is, Class161[] class161s, int[] is_57_, byte i_58_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_56_);
		int i_59_ = 192 + (random.nextInt() & 0x1f);
		method1617(i_59_ << 24 | i_52_ & 0xffffff, i_53_ == -1 ? 0 : i_59_ << 24 | i_53_ & 0xffffff, 30871020);
		int i_60_ = string.length();
		int[] is_61_ = new int[i_60_];
		int i_62_ = 0;
		for (int i_63_ = 0; i_63_ < i_60_; i_63_++) {
			is_61_[i_63_] = i_62_;
			if ((random.nextInt() & 0x3) == 0)
				i_62_++;
		}
		int i_64_ = i;
		int i_65_ = i_49_ + -801958417 * ((Class102) this).aClass284_1379.anInt3412;
		int i_66_ = -1;
		if (i_55_ == 1)
			i_65_ += (i_51_ - -801958417 * ((Class102) this).aClass284_1379.anInt3412 - (-2086019023 * ((Class102) this).aClass284_1379.anInt3413)) / 2;
		else if (2 == i_55_)
			i_65_ = i_51_ + i_49_ - -2086019023 * (((Class102) this).aClass284_1379.anInt3413);
		if (i_54_ == 1) {
			i_66_ = (((Class102) this).aClass284_1379.method3832(string, (byte) 100) + i_62_);
			i_64_ += (i_50_ - i_66_) / 2;
		} else if (i_54_ == 2) {
			i_66_ = (((Class102) this).aClass284_1379.method3832(string, (byte) 100) + i_62_);
			i_64_ += i_50_ - i_66_;
		}
		method1619(string, i_64_, i_65_, class161s, is_57_, is_61_, null, 855188961);
		if (is != null) {
			if (-1 == i_66_)
				i_66_ = ((Class102) this).aClass284_1379.method3832(string, (byte) 100) + i_62_;
			is[0] = i_64_;
			is[1] = i_65_ - (((Class102) this).aClass284_1379.anInt3412 * -801958417);
			is[2] = i_66_;
			is[3] = (((Class102) this).aClass284_1379.anInt3413 * -2086019023 + ((Class102) this).aClass284_1379.anInt3412 * -801958417);
		}
		return i_62_;
	}

	void method1617(int i, int i_67_, int i_68_) {
		anInt1369 = -1797575269;
		anInt1375 = -161794945;
		anInt1377 = (anInt1376 = i * -1958593057) * -109725493;
		anInt1381 = 0;
		anInt1380 = 0;
		if (-1 == i_67_)
			i_67_ = 0;
		anInt1370 = (anInt1374 = 462122977 * i_67_) * 450395187;
	}

	void method1618(String string, int i, int i_69_) {
		int i_70_ = 0;
		boolean bool = false;
		for (int i_71_ = 0; i_71_ < string.length(); i_71_++) {
			char c = string.charAt(i_71_);
			if ('<' == c)
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool && c == ' ')
				i_70_++;
		}
		if (i_70_ > 0)
			anInt1381 = (i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100) << 8) / i_70_ * 60141681;
	}

	void method1619(String string, int i, int i_72_, Class161[] class161s, int[] is, int[] is_73_, int[] is_74_, int i_75_) {
		i_72_ -= -1605051853 * ((Class102) this).aClass284_1379.anInt3411;
		int i_76_ = -1;
		int i_77_ = -1;
		int i_78_ = 0;
		int i_79_ = string.length();
		for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
			char c = (char) (Class525.method6305(string.charAt(i_80_), 1135041941) & 0xff);
			if (c == 60)
				i_76_ = i_80_;
			else {
				if (c == 62 && i_76_ != -1) {
					String string_81_ = string.substring(i_76_ + 1, i_80_);
					i_76_ = -1;
					if (string_81_.equals("lt"))
						c = '<';
					else if (string_81_.equals("gt"))
						c = '>';
					else if (string_81_.equals("nbsp"))
						c = '\u00a0';
					else if (string_81_.equals("shy"))
						c = '\u00ad';
					else if (string_81_.equals("times"))
						c = '\u00d7';
					else if (string_81_.equals("euro"))
						c = '\u20ac';
					else if (string_81_.equals("copy"))
						c = '\u00a9';
					else if (string_81_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_81_.startsWith("img=")) {
							try {
								int i_82_;
								if (is_73_ != null)
									i_82_ = is_73_[i_78_];
								else
									i_82_ = 0;
								int i_83_;
								if (is_74_ != null)
									i_83_ = is_74_[i_78_];
								else
									i_83_ = 0;
								i_78_++;
								int i_84_ = Class97.method1565(string_81_.substring(4), (byte) -65);
								Class161 class161 = class161s[i_84_];
								int i_85_ = (null != is ? is[i_84_] : class161.method2589());
								class161.method2619(i + i_82_, (i_72_ + ((((Class102) this).aClass284_1379.anInt3411) * -1605051853) - i_85_ + i_83_), 1, -1, 1);
								i += class161s[i_84_].method45();
								i_77_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method1629(string_81_, -1454119917);
						continue;
					}
				}
				if (-1 == i_76_) {
					if (-1 != i_77_)
						i += ((Class102) this).aClass284_1379.method3842(i_77_, c, -1827551390);
					int i_86_;
					if (null != is_73_)
						i_86_ = is_73_[i_78_];
					else
						i_86_ = 0;
					int i_87_;
					if (is_74_ != null)
						i_87_ = is_74_[i_78_];
					else
						i_87_ = 0;
					i_78_++;
					if (32 != c) {
						if (0 != (anInt1370 * -586589605 & ~0xffffff))
							method1609(c, i_86_ + (1 + i), i_87_ + (1 + i_72_), -586589605 * anInt1370, true);
						method1609(c, i + i_86_, i_87_ + i_72_, -1820710531 * anInt1377, false);
					} else if (137367697 * anInt1381 > 0) {
						anInt1380 += -1881121973 * anInt1381;
						i += anInt1380 * 1861459475 >> 8;
						anInt1380 = (1861459475 * anInt1380 & 0xff) * -999105509;
					}
					int i_88_ = ((Class102) this).aClass284_1379.method3839(c, (byte) 9);
					if (-1 != anInt1369 * 1843171181)
						((Class102) this).aClass106_1378.method1722(i, i_72_ + (int) ((double) (-1605051853 * (((Class102) this).aClass284_1379.anInt3411)) * 0.7), i_88_, anInt1369 * 1843171181, (byte) 111);
					if (-1 != anInt1375 * -482380671)
						((Class102) this).aClass106_1378.method1722(i, -1605051853 * (((Class102) this).aClass284_1379.anInt3411) + i_72_, i_88_, -482380671 * anInt1375, (byte) 10);
					i += i_88_;
					i_77_ = c;
				}
			}
		}
	}

	public void method1620(String string, int i, int i_89_, int i_90_, int i_91_, int i_92_) {
		if (string != null) {
			method1617(i_90_, i_91_, 30871020);
			method1610(string, i, i_89_, null, null, null, 0, 0, 518029145);
		}
	}

	abstract void method1621(char c, int i, int i_93_, int i_94_, boolean bool, Class167 class167, int i_95_, int i_96_);

	static {
		anInt1374 = 0;
		anInt1370 = 0;
		anInt1381 = 0;
		anInt1380 = 0;
		aStringArray1382 = new String[100];
	}

	abstract void method1622(char c, int i, int i_97_, int i_98_, boolean bool);

	abstract void method1623(char c, int i, int i_99_, int i_100_, boolean bool, Class167 class167, int i_101_, int i_102_);

	abstract void method1624(char c, int i, int i_103_, int i_104_, boolean bool, Class167 class167, int i_105_, int i_106_);

	abstract void method1625(char c, int i, int i_107_, int i_108_, boolean bool, Class167 class167, int i_109_, int i_110_);

	public int method1626(String string, int i, int i_111_, int i_112_, int i_113_, Random random, int i_114_, Class161[] class161s, int[] is, int i_115_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_114_);
		int i_116_ = 192 + (random.nextInt() & 0x1f);
		method1617(i_116_ << 24 | i_112_ & 0xffffff, i_116_ << 24 | i_113_ & 0xffffff, 30871020);
		int i_117_ = string.length();
		int[] is_118_ = new int[i_117_];
		int i_119_ = 0;
		for (int i_120_ = 0; i_120_ < i_117_; i_120_++) {
			is_118_[i_120_] = i_119_;
			if ((random.nextInt() & 0x3) == 0)
				i_119_++;
		}
		method1619(string, i, i_111_, class161s, is, is_118_, null, 855188961);
		return i_119_;
	}

	void method1627(String string) {
		try {
			if (string.startsWith("col="))
				anInt1377 = (anInt1377 * -1820710531 & ~0xffffff | (Class572_Sub16_Sub5.method10069(string.substring(4), 16, 1795361658) & 0xffffff)) * 938104789;
			else if (string.equals("/col"))
				anInt1377 = 938104789 * (-1820710531 * anInt1377 & ~0xffffff | anInt1376 * 1255259679 & 0xffffff);
			if (string.startsWith("argb="))
				anInt1377 = Class572_Sub16_Sub5.method10069(string.substring(5), 16, 2072591858) * 938104789;
			else if (string.equals("/argb"))
				anInt1377 = anInt1376 * -109725493;
			else if (string.startsWith("str="))
				anInt1369 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(4), 16, 2089366680)) * 1797575269);
			else if (string.equals("str"))
				anInt1369 = 1797575269 * (-1820710531 * anInt1377 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1369 = -1797575269;
			else if (string.startsWith("u="))
				anInt1375 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(2), 16, 1918888106)) * 161794945);
			else if (string.equals("u"))
				anInt1375 = 161794945 * (-1820710531 * anInt1377 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1375 = -161794945;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1370 = 0;
			else if (string.startsWith("shad="))
				anInt1370 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(5), 16, 2116931359)) * 1188054483);
			else if (string.equals("shad"))
				anInt1370 = (-1820710531 * anInt1377 & ~0xffffff) * 1188054483;
			else if (string.equals("/shad"))
				anInt1370 = anInt1374 * 450395187;
			else if (string.equals("br"))
				method1617(anInt1376 * 1255259679, 191435809 * anInt1374, 30871020);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public int method1628(String string, int i, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, Class161[] class161s, int[] is, Class167 class167, int i_130_, int i_131_, int i_132_) {
		if (null == string)
			return 0;
		method1617(i_124_, i_125_, 30871020);
		if (i_128_ == 0)
			i_128_ = ((Class102) this).aClass284_1379.anInt3411 * -1605051853;
		int[] is_133_;
		if ((i_123_ < (i_128_ + (((Class102) this).aClass284_1379.anInt3413 * -2086019023 + -801958417 * ((Class102) this).aClass284_1379.anInt3412))) && i_123_ < i_128_ + i_128_)
			is_133_ = null;
		else
			is_133_ = new int[] { i_122_ };
		int i_134_ = ((Class102) this).aClass284_1379.method3834(string, is_133_, aStringArray1382, class161s, -191774930);
		if (-1 == i_129_) {
			i_129_ = i_123_ / i_128_;
			if (i_129_ <= 0)
				i_129_ = 1;
		}
		if (i_129_ > 0 && i_134_ >= i_129_) {
			aStringArray1382[i_129_ - 1] = ((Class102) this).aClass284_1379.method3831((aStringArray1382[i_129_ - 1]), i_122_, class161s, (byte) -79);
			i_134_ = i_129_;
		}
		if (3 == i_127_ && i_134_ == 1)
			i_127_ = 1;
		int i_135_;
		if (i_127_ == 0)
			i_135_ = (((Class102) this).aClass284_1379.anInt3412 * -801958417 + i_121_);
		else if (i_127_ == 1)
			i_135_ = ((i_123_ - ((Class102) this).aClass284_1379.anInt3412 * -801958417 - ((Class102) this).aClass284_1379.anInt3413 * -2086019023 - (i_134_ - 1) * i_128_) / 2 + (-801958417 * ((Class102) this).aClass284_1379.anInt3412 + i_121_));
		else if (2 == i_127_)
			i_135_ = (i_123_ + i_121_ - -2086019023 * ((Class102) this).aClass284_1379.anInt3413 - (i_134_ - 1) * i_128_);
		else {
			int i_136_ = ((i_123_ - -801958417 * ((Class102) this).aClass284_1379.anInt3412 - -2086019023 * ((Class102) this).aClass284_1379.anInt3413 - (i_134_ - 1) * i_128_) / (1 + i_134_));
			if (i_136_ < 0)
				i_136_ = 0;
			i_135_ = (-801958417 * ((Class102) this).aClass284_1379.anInt3412 + i_121_ + i_136_);
			i_128_ += i_136_;
		}
		for (int i_137_ = 0; i_137_ < i_134_; i_137_++) {
			if (i_126_ == 0)
				method1610(aStringArray1382[i_137_], i, i_135_, class161s, is, class167, i_130_, i_131_, -1925547136);
			else if (1 == i_126_)
				method1610(aStringArray1382[i_137_], i + ((i_122_ - (((Class102) this).aClass284_1379.method3832(aStringArray1382[i_137_], (byte) 100))) / 2), i_135_, class161s, is, class167, i_130_, i_131_, 2011225628);
			else if (2 == i_126_)
				method1610(aStringArray1382[i_137_], (i + i_122_ - (((Class102) this).aClass284_1379.method3832(aStringArray1382[i_137_], (byte) 100))), i_135_, class161s, is, class167, i_130_, i_131_, 1285528117);
			else if (i_134_ - 1 == i_137_)
				method1610(aStringArray1382[i_137_], i, i_135_, class161s, is, class167, i_130_, i_131_, -368489000);
			else {
				method1618(aStringArray1382[i_137_], i_122_, -865752965);
				method1610(aStringArray1382[i_137_], i, i_135_, class161s, is, class167, i_130_, i_131_, 711343435);
				anInt1381 = 0;
			}
			i_135_ += i_128_;
		}
		return i_134_;
	}

	void method1629(String string, int i) {
		try {
			if (string.startsWith("col="))
				anInt1377 = (anInt1377 * -1820710531 & ~0xffffff | (Class572_Sub16_Sub5.method10069(string.substring(4), 16, 1638296847) & 0xffffff)) * 938104789;
			else if (string.equals("/col"))
				anInt1377 = 938104789 * (-1820710531 * anInt1377 & ~0xffffff | anInt1376 * 1255259679 & 0xffffff);
			if (string.startsWith("argb="))
				anInt1377 = Class572_Sub16_Sub5.method10069(string.substring(5), 16, 1961966312) * 938104789;
			else if (string.equals("/argb"))
				anInt1377 = anInt1376 * -109725493;
			else if (string.startsWith("str="))
				anInt1369 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(4), 16, 1715746060)) * 1797575269);
			else if (string.equals("str"))
				anInt1369 = 1797575269 * (-1820710531 * anInt1377 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1369 = -1797575269;
			else if (string.startsWith("u="))
				anInt1375 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(2), 16, 2075542030)) * 161794945);
			else if (string.equals("u"))
				anInt1375 = 161794945 * (-1820710531 * anInt1377 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1375 = -161794945;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1370 = 0;
			else if (string.startsWith("shad="))
				anInt1370 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(5), 16, 2051464561)) * 1188054483);
			else if (string.equals("shad"))
				anInt1370 = (-1820710531 * anInt1377 & ~0xffffff) * 1188054483;
			else if (string.equals("/shad"))
				anInt1370 = anInt1374 * 450395187;
			else if (string.equals("br"))
				method1617(anInt1376 * 1255259679, 191435809 * anInt1374, 30871020);
		} catch (Exception exception) {
			/* empty */
		}
	}

	Class102(Class106 class106, Class284 class284) {
		((Class102) this).aClass106_1378 = class106;
		((Class102) this).aClass284_1379 = class284;
	}

	public void method1630(String string, int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
		if (null != string) {
			method1617(i_139_, i_140_, 30871020);
			int i_143_ = string.length();
			int[] is = new int[i_143_];
			for (int i_144_ = 0; i_144_ < i_143_; i_144_++)
				is[i_144_] = (int) (Math.sin((double) i_144_ / 2.0 + (double) i_141_ / 5.0) * 5.0);
			method1619(string, i - ((Class102) this).aClass284_1379.method3832(string, (byte) 100) / 2, i_138_, null, null, null, is, 855188961);
		}
	}

	void method1631(String string) {
		try {
			if (string.startsWith("col="))
				anInt1377 = (anInt1377 * -1820710531 & ~0xffffff | (Class572_Sub16_Sub5.method10069(string.substring(4), 16, 1898113606) & 0xffffff)) * 938104789;
			else if (string.equals("/col"))
				anInt1377 = 938104789 * (-1820710531 * anInt1377 & ~0xffffff | anInt1376 * 1255259679 & 0xffffff);
			if (string.startsWith("argb="))
				anInt1377 = Class572_Sub16_Sub5.method10069(string.substring(5), 16, 2142047807) * 938104789;
			else if (string.equals("/argb"))
				anInt1377 = anInt1376 * -109725493;
			else if (string.startsWith("str="))
				anInt1369 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(4), 16, 1812671591)) * 1797575269);
			else if (string.equals("str"))
				anInt1369 = 1797575269 * (-1820710531 * anInt1377 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1369 = -1797575269;
			else if (string.startsWith("u="))
				anInt1375 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(2), 16, 2102564609)) * 161794945);
			else if (string.equals("u"))
				anInt1375 = 161794945 * (-1820710531 * anInt1377 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1375 = -161794945;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1370 = 0;
			else if (string.startsWith("shad="))
				anInt1370 = ((-1820710531 * anInt1377 & ~0xffffff | Class572_Sub16_Sub5.method10069(string.substring(5), 16, 1616356856)) * 1188054483);
			else if (string.equals("shad"))
				anInt1370 = (-1820710531 * anInt1377 & ~0xffffff) * 1188054483;
			else if (string.equals("/shad"))
				anInt1370 = anInt1374 * 450395187;
			else if (string.equals("br"))
				method1617(anInt1376 * 1255259679, 191435809 * anInt1374, 30871020);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static void method1632(short i) {
		Class649 class649 = Class504.method6027("2", client.aClass437_8705.aString5074, false, -925247386);
		Class306.clientConfigsDomain.method9962(class649, (byte) -34);
	}

	static Class506[] method1633(int i) {
		return (new Class506[] { Class506.aClass506_5594, Class506.aClass506_5596, Class506.aClass506_5595 });
	}

	static final void method1634(Cs2Executor class441, int i) {
		int i_145_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_145_, (short) -12625);
		Class83 class83 = Class534.aClass83Array5975[i_145_ >> 16];
		Class474.method5622(class73, class83, class441, (byte) -47);
	}

	static final void method1635(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1801579973 * Class13.anInt65;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.anInt109 * -1517576597;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -824341491 * Class13.anInt108;
		Class13.anInt65 = 1151462886;
		Class13.anInt109 = 1091625405;
		Class13.anInt108 = -1622123205;
	}

	static final void method1636(Cs2Executor class441, int i) {
		if (Class108.aClass549_1426.method6514(86, (byte) 1))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method1637(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt786 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -1414758685;
		Class555.method6575(class73, (short) 16647);
	}

	static void method1638(Class106 class106, Class167 class167, InterfaceDefinitions class73, int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		Class78 class78 = ((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_149_, -1488896683));
		if (null != class78 && class78.anIntArray984 != null && class78.method1158(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1883066921))
			class78 = class78.method1163(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 934719798);
		if (class78 != null && class78.aBool994 && class78.method1158(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 2084414369)) {
			if (null != class78.anIntArray1002) {
				int[] is = new int[class78.anIntArray1002.length];
				for (int i_151_ = 0; i_151_ < is.length / 2; i_151_++) {
					int i_152_;
					if (1 == 625220759 * Class18.anInt143)
						i_152_ = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) + -777638353 * client.anInt8766) & 0x3fff;
					else if (Class18.anInt143 * 625220759 == 6)
						i_152_ = (int) client.aFloat8678 & 0x3fff;
					else
						i_152_ = (client.anInt8766 * -777638353 + (int) client.aFloat8678) & 0x3fff;
					int i_153_ = Class325.anIntArray4103[i_152_];
					int i_154_ = Class325.anIntArray4105[i_152_];
					if (625220759 * Class18.anInt143 != 6) {
						i_153_ = (256 * i_153_ / (256 + -1034566343 * client.anInt8670));
						i_154_ = 256 * i_154_ / (-1034566343 * client.anInt8670 + 256);
					}
					is[i_151_ * 2] = (((class78.anIntArray1002[2 * i_151_ + 1] * 4 + i_148_) * i_153_ + i_154_ * (4 * class78.anIntArray1002[i_151_ * 2] + i_147_)) >> 14) + (class73.anInt764 * 669238293 / 2 + i);
					is[2 * i_151_ + 1] = (class73.anInt765 * 1360982075 / 2 + i_146_ - ((i_154_ * (i_148_ + (class78.anIntArray1002[1 + 2 * i_151_]) * 4) - ((i_147_ + class78.anIntArray1002[i_151_ * 2] * 4) * i_153_)) >> 14));
				}
				Class71 class71 = class73.method1099(class106, -1843921015);
				if (class71 != null)
					Class98.method1571(class106, is, 1661024195 * class78.anInt990, class71.anIntArray712, class71.anIntArray713);
				if (-726241895 * class78.anInt991 > 0) {
					for (int i_155_ = 0; i_155_ < is.length / 2 - 1; i_155_++) {
						int i_156_ = is[2 * i_155_];
						int i_157_ = is[2 * i_155_ + 1];
						int i_158_ = is[(i_155_ + 1) * 2];
						int i_159_ = is[2 * (1 + i_155_) + 1];
						if (i_158_ < i_156_) {
							int i_160_ = i_156_;
							int i_161_ = i_157_;
							i_156_ = i_158_;
							i_157_ = i_159_;
							i_158_ = i_160_;
							i_159_ = i_161_;
						} else if (i_156_ == i_158_ && i_159_ < i_157_) {
							int i_162_ = i_157_;
							i_157_ = i_159_;
							i_159_ = i_162_;
						}
						if (class167 != null)
							class106.method1943(i_156_, i_157_, i_158_, i_159_, (class78.anIntArray998[(class78.aByteArray999[i_155_]) & 0xff]), 1, class167, i, i_146_, -726241895 * class78.anInt991, -1511734647 * class78.anInt992, 1161461629 * class78.anInt993);
						else
							class106.method1732(i_156_, i_157_, i_158_, i_159_, (class78.anIntArray998[(class78.aByteArray999[i_155_]) & 0xff]), 1, class78.anInt991 * -726241895, -1511734647 * class78.anInt992, 1161461629 * class78.anInt993);
					}
					int i_163_ = is[is.length - 2];
					int i_164_ = is[is.length - 1];
					int i_165_ = is[0];
					int i_166_ = is[1];
					if (i_165_ < i_163_) {
						int i_167_ = i_163_;
						int i_168_ = i_164_;
						i_163_ = i_165_;
						i_164_ = i_166_;
						i_165_ = i_167_;
						i_166_ = i_168_;
					} else if (i_163_ == i_165_ && i_166_ < i_164_) {
						int i_169_ = i_164_;
						i_164_ = i_166_;
						i_166_ = i_169_;
					}
					if (class167 != null)
						class106.method1943(i_163_, i_164_, i_165_, i_166_, (class78.anIntArray998[(class78.aByteArray999[(class78.aByteArray999.length - 1)]) & 0xff]), 1, class167, i, i_146_, -726241895 * class78.anInt991, -1511734647 * class78.anInt992, class78.anInt993 * 1161461629);
					else
						class106.method1732(i_163_, i_164_, i_165_, i_166_, (class78.anIntArray998[(class78.aByteArray999[(class78.aByteArray999.length - 1)]) & 0xff]), 1, class78.anInt991 * -726241895, -1511734647 * class78.anInt992, 1161461629 * class78.anInt993);
				} else if (null != class167) {
					for (int i_170_ = 0; i_170_ < is.length / 2 - 1; i_170_++)
						class106.method1731(is[i_170_ * 2], is[2 * i_170_ + 1], is[2 * (1 + i_170_)], is[1 + (i_170_ + 1) * 2], (class78.anIntArray998[(class78.aByteArray999[i_170_] & 0xff)]), 1, class167, i, i_146_);
					class106.method1731(is[is.length - 2], is[is.length - 1], is[0], is[1], (class78.anIntArray998[((class78.aByteArray999[class78.aByteArray999.length - 1]) & 0xff)]), 1, class167, i, i_146_);
				} else {
					for (int i_171_ = 0; i_171_ < is.length / 2 - 1; i_171_++)
						class106.method1730(is[i_171_ * 2], is[2 * i_171_ + 1], is[(1 + i_171_) * 2], is[1 + (i_171_ + 1) * 2], (class78.anIntArray998[(class78.aByteArray999[i_171_] & 0xff)]), 1);
					class106.method1730(is[is.length - 2], is[is.length - 1], is[0], is[1], (class78.anIntArray998[((class78.aByteArray999[class78.aByteArray999.length - 1]) & 0xff)]), 1);
				}
			}
			Class161 class161 = null;
			if (-1756791847 * class78.anInt960 != -1) {
				class161 = class78.method1159(class106, false, 1848633963);
				if (null != class161) {
					int i_172_ = (-1815209217 * class78.anInt1000 > 0 ? -1815209217 * class78.anInt1000 : 1688147281 * JS5ConfigGroup.aClass484_2593.anInt5398);
					Class12.method558(class73, class167, i, i_146_, i_147_, i_148_, class161, (double) i_172_, class78.aClass39_996, class78.aClass75_997, (byte) -2);
				}
			}
			if (null != class78.aString964) {
				int i_173_ = 0;
				if (null != class161)
					i_173_ = class161.method2588();
				Class102 class102 = Class298.aClass102_3481;
				Class284 class284 = Class23.aClass284_155;
				if (class78.anInt965 * 1751892143 == 1) {
					class102 = Class512.aClass102_5703;
					class284 = Class26.aClass284_215;
				}
				if (2 == class78.anInt965 * 1751892143) {
					class102 = Class1.aClass102_16;
					class284 = Class318.aClass284_3875;
				}
				Class272_Sub3.method8880(class73, class167, i, i_146_, i_147_, i_148_, i_173_, class78.aString964, class102, class284, -1706590863 * class78.anInt958, (byte) 3);
			}
		}
	}

	static final void method1639(Cs2Executor class441, int i) {
		int i_174_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == 1472719885 * client.anInt8861 && i_174_ >= 0 && i_174_ < 681720871 * client.anInt8860)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_174_].anInt210 * -495878851;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	public static Model method1640(Class106 class106, int i, int i_175_, int i_176_, int i_177_, Model model, short i_178_, byte i_179_, Class663 class663, byte i_180_) {
		if (model == null)
			return null;
		int i_181_ = 2055;
		if (class663 != null) {
			i_181_ |= class663.method7794(-1720746493);
			i_181_ &= ~0x200;
		}
		long l = (long) ((i_178_ & 0xffff) << 8 | i_179_);
		Model class89_182_;
		synchronized (Class19.aClass127_145) {
			class89_182_ = (Model) Class19.aClass127_145.method2246(l);
		}
		if (class89_182_ == null || class106.method1756(class89_182_.method1353(), i_181_) != 0) {
			if (class89_182_ != null)
				i_181_ = class106.method1798(i_181_, class89_182_.method1353());
			Class159 class159 = new Class159(4, 2, 2);
			int i_183_ = 128;
			int[] is = new int[4];
			is[0] = class159.method2560(-i_183_, 0, -i_183_);
			is[1] = class159.method2560(i_183_, 0, -i_183_);
			is[2] = class159.method2560(i_183_, 0, i_183_);
			is[3] = class159.method2560(-i_183_, 0, i_183_);
			class159.method2557(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_179_, i_178_);
			class159.method2557(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_179_, i_178_);
			class159.method2568((short) 1, (short) 2, (short) 0);
			class159.method2568((short) 2, (short) 3, (short) 0);
			class89_182_ = class106.method1755(class159, i_181_, Class19.anInt144 * 375315683, 64, 768);
			synchronized (Class19.aClass127_145) {
				Class19.aClass127_145.method2229(class89_182_, l);
			}
		}
		int i_184_ = model.method1380();
		int i_185_ = model.method1381();
		int i_186_ = model.method1384();
		int i_187_ = model.method1508();
		if (null != class663) {
			class89_182_ = class89_182_.method1351((byte) 3, i_181_, true);
			class89_182_.method1464(i_185_ - i_184_ >> 1, 128, i_187_ - i_186_ >> 1);
			class89_182_.method1358(i_185_ + i_184_ >> 1, 0, i_187_ + i_186_ >> 1);
			class663.method7828(class89_182_, (byte) -11);
		} else {
			class89_182_ = class89_182_.method1351((byte) 3, i_181_, true);
			class89_182_.method1464(i_185_ - i_184_ >> 1, 128, i_187_ - i_186_ >> 1);
			class89_182_.method1358(i_184_ + i_185_ >> 1, 0, i_187_ + i_186_ >> 1);
		}
		if (0 != i_175_)
			class89_182_.method1368(i_175_);
		if (0 != i_176_)
			class89_182_.method1500(i_176_);
		if (i_177_ != 0)
			class89_182_.method1358(0, i_177_, 0);
		return class89_182_;
	}

	public static boolean method1641(char c, int i) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || c == '\u0153' || c == '\u0178')
			return true;
		return false;
	}
}
