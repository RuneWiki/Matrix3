package game;

/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class284 {
	byte[] aByteArray3409;
	byte[][] aByteArrayArray3410;
	public int anInt3411;
	public int anInt3412;
	public int anInt3413;
	static String[] aStringArray3414 = new String[100];

	public int method3830(String string, int i, int i_0_, Interface27[] interface27s, byte i_1_) {
		if (0 == i_0_)
			i_0_ = anInt3411 * -1605051853;
		int i_2_ = method3834(string, new int[] { i }, aStringArray3414, interface27s, -121283600);
		int i_3_ = (i_2_ - 1) * i_0_;
		return -2086019023 * anInt3413 + (-801958417 * anInt3412 + i_3_);
	}

	public String method3831(String string, int i, Interface27[] interface27s, byte i_4_) {
		if (method3833(string, interface27s, 400933316) <= i)
			return string;
		i -= method3833("...", null, -953255896);
		int i_5_ = -1;
		int i_6_ = -1;
		int i_7_ = 0;
		int i_8_ = string.length();
		String string_9_ = "";
		for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
			char c = string.charAt(i_10_);
			if (c == 60)
				i_5_ = i_10_;
			else {
				if (c == 62 && -1 != i_5_) {
					String string_11_ = string.substring(1 + i_5_, i_10_);
					i_5_ = -1;
					if (string_11_.equals("lt"))
						c = '<';
					else if (string_11_.equals("gt"))
						c = '>';
					else if (string_11_.equals("nbsp"))
						c = '\u00a0';
					else if (string_11_.equals("shy"))
						c = '\u00ad';
					else if (string_11_.equals("times"))
						c = '\u00d7';
					else if (string_11_.equals("euro"))
						c = '\u20ac';
					else if (string_11_.equals("copy"))
						c = '\u00a9';
					else if (string_11_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_11_.startsWith("img=") && interface27s != null) {
							try {
								int i_12_ = Class97.method1565(string_11_.substring(4), (byte) -95);
								i_7_ += interface27s[i_12_].method45();
								i_6_ = -1;
								if (i_7_ > i)
									return new StringBuilder().append(string_9_).append("...").toString();
								string_9_ = string.substring(0, 1 + i_10_);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_5_ == -1) {
					i_7_ += ((((Class284) this).aByteArray3409[Class525.method6305(c, -540138467) & 0xff]) & 0xff);
					if (((Class284) this).aByteArrayArray3410 != null && i_6_ != -1)
						i_7_ += ((Class284) this).aByteArrayArray3410[i_6_][c];
					i_6_ = c;
					int i_13_ = i_7_;
					if (null != ((Class284) this).aByteArrayArray3410)
						i_13_ += ((Class284) this).aByteArrayArray3410[c][46];
					if (i_13_ > i)
						return new StringBuilder().append(string_9_).append("...").toString();
					string_9_ = string.substring(0, i_10_ + 1);
				}
			}
		}
		return string;
	}

	public int method3832(String string, byte i) {
		return method3833(string, null, -1381381028);
	}

	public int method3833(String string, Interface27[] interface27s, int i) {
		if (null == string)
			return 0;
		int i_14_ = -1;
		int i_15_ = -1;
		int i_16_ = 0;
		int i_17_ = string.length();
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			char c = string.charAt(i_18_);
			if (60 == c)
				i_14_ = i_18_;
			else {
				if (62 == c && i_14_ != -1) {
					String string_19_ = string.substring(i_14_ + 1, i_18_);
					i_14_ = -1;
					if (string_19_.equals("lt"))
						c = '<';
					else if (string_19_.equals("gt"))
						c = '>';
					else if (string_19_.equals("nbsp"))
						c = '\u00a0';
					else if (string_19_.equals("shy"))
						c = '\u00ad';
					else if (string_19_.equals("times"))
						c = '\u00d7';
					else if (string_19_.equals("euro"))
						c = '\u20ac';
					else if (string_19_.equals("copy"))
						c = '\u00a9';
					else if (string_19_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_19_.startsWith("img=") && null != interface27s) {
							try {
								int i_20_ = Class97.method1565(string_19_.substring(4), (byte) -29);
								i_16_ += interface27s[i_20_].method45();
								i_15_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_14_ == -1) {
					i_16_ += ((((Class284) this).aByteArray3409[Class525.method6305(c, -1363497838) & 0xff]) & 0xff);
					if (((Class284) this).aByteArrayArray3410 != null && -1 != i_15_)
						i_16_ += ((Class284) this).aByteArrayArray3410[i_15_][c];
					i_15_ = c;
				}
			}
		}
		return i_16_;
	}

	public int method3834(String string, int[] is, String[] strings, Interface27[] interface27s, int i) {
		return method3837(string, is, strings, interface27s, true, 12519007);
	}

	public int method3835(String string, int i, Interface27[] interface27s, int i_21_) {
		int i_22_ = method3834(string, new int[] { i }, aStringArray3414, interface27s, 727934582);
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
			int i_25_ = method3833(aStringArray3414[i_24_], interface27s, 884330556);
			if (i_25_ > i_23_)
				i_23_ = i_25_;
		}
		return i_23_;
	}

	public int method3836(int i) {
		return ((Class284) this).aByteArray3409[i] & 0xff;
	}

	int method3837(String string, int[] is, String[] strings, Interface27[] interface27s, boolean bool, int i) {
		if (null == string)
			return 0;
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = -1;
		int i_29_ = 0;
		int i_30_ = 0;
		int i_31_ = -1;
		int i_32_ = -1;
		int i_33_ = 0;
		int i_34_ = string.length();
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			int i_36_ = (Class525.method6305(string.charAt(i_35_), -1561233319) & 0xff);
			int i_37_ = 0;
			if (60 == i_36_)
				i_31_ = i_35_;
			else {
				int i_38_;
				if (-1 != i_31_) {
					if (62 != i_36_)
						continue;
					i_38_ = i_31_;
					String string_39_ = string.substring(1 + i_31_, i_35_);
					i_31_ = -1;
					if (string_39_.equals("br")) {
						strings[i_33_] = string.substring(i_27_, i_35_ + 1);
						if (++i_33_ >= strings.length)
							return 0;
						i_27_ = 1 + i_35_;
						i_26_ = 0;
						i_28_ = -1;
						i_32_ = -1;
						continue;
					}
					if (string_39_.equals("lt")) {
						i_37_ += method3839(60, (byte) 19);
						if (null != ((Class284) this).aByteArrayArray3410 && i_32_ != -1)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][60]);
						i_32_ = 60;
					} else if (string_39_.equals("gt")) {
						i_37_ += method3839(62, (byte) -38);
						if (((Class284) this).aByteArrayArray3410 != null && -1 != i_32_)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][62]);
						i_32_ = 62;
					} else if (string_39_.equals("nbsp")) {
						i_37_ += method3839(160, (byte) -53);
						if (null != ((Class284) this).aByteArrayArray3410 && i_32_ != -1)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][160]);
						i_32_ = 160;
					} else if (string_39_.equals("shy")) {
						i_37_ += method3839(173, (byte) -10);
						if (null != ((Class284) this).aByteArrayArray3410 && -1 != i_32_)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][173]);
						i_32_ = 173;
					} else if (string_39_.equals("times")) {
						i_37_ += method3839(215, (byte) -25);
						if (null != ((Class284) this).aByteArrayArray3410 && i_32_ != -1)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][215]);
						i_32_ = 215;
					} else if (string_39_.equals("euro")) {
						i_37_ += method3839(8364, (byte) 10);
						if (null != ((Class284) this).aByteArrayArray3410 && i_32_ != -1)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][8364]);
						i_32_ = 8364;
					} else if (string_39_.equals("copy")) {
						i_37_ += method3839(169, (byte) 19);
						if (((Class284) this).aByteArrayArray3410 != null && -1 != i_32_)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][169]);
						i_32_ = 169;
					} else if (string_39_.equals("reg")) {
						i_37_ += method3839(174, (byte) 68);
						if (((Class284) this).aByteArrayArray3410 != null && -1 != i_32_)
							i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][174]);
						i_32_ = 174;
					} else if (string_39_.startsWith("img=") && null != interface27s) {
						try {
							int i_40_ = Class97.method1565(string_39_.substring(4), (byte) -108);
							i_37_ += interface27s[i_40_].method45();
							i_32_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_36_ = -1;
				} else {
					i_38_ = i_35_;
					i_37_ += method3839(i_36_, (byte) 47);
					if (null != ((Class284) this).aByteArrayArray3410 && i_32_ != -1)
						i_37_ += (((Class284) this).aByteArrayArray3410[i_32_][i_36_]);
					i_32_ = i_36_;
				}
				if (i_37_ > 0) {
					i_26_ += i_37_;
					if (is != null) {
						if (i_36_ == 32) {
							i_28_ = i_35_;
							i_29_ = i_26_;
							i_30_ = bool ? 1 : 0;
						}
						if (i_26_ > is[i_33_ < is.length ? i_33_ : is.length - 1]) {
							if (i_28_ >= 0) {
								strings[i_33_] = string.substring(i_27_, i_28_ + 1 - i_30_);
								if (++i_33_ >= strings.length)
									return 0;
								i_27_ = 1 + i_28_;
								i_28_ = -1;
								i_26_ -= i_29_;
								i_32_ = -1;
							} else {
								strings[i_33_] = string.substring(i_27_, i_38_);
								if (++i_33_ >= strings.length)
									return 0;
								i_27_ = i_38_;
								i_28_ = -1;
								i_26_ = i_37_;
								i_32_ = -1;
							}
						}
						if (i_36_ == 45) {
							i_28_ = i_35_;
							i_29_ = i_26_;
							i_30_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_27_) {
			strings[i_33_] = string.substring(i_27_, string.length());
			i_33_++;
		}
		return i_33_;
	}

	public Point method3838(String string, int i, int i_41_, int i_42_, Interface27[] interface27s, int i_43_) {
		if (i_42_ <= 0)
			return new Point(0, anInt3412 * -801958417 + i_41_);
		if (i_42_ > string.length())
			i_42_ = string.length();
		if (i_41_ == 0)
			i_41_ = anInt3411 * -1605051853;
		int i_44_ = method3837(string, new int[] { i }, aStringArray3414, interface27s, false, 1098074457);
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
			int i_47_ = aStringArray3414[i_46_].length();
			if (i_45_ + i_47_ > i_42_ || i_44_ - 1 == i_46_ && i_42_ == string.length()) {
				String string_48_ = string.substring(i_45_, i_42_);
				if (string_48_.endsWith("<br>")) {
					string_48_ = "";
					i_45_ += i_47_;
					i_46_++;
				}
				int i_49_ = method3833(string_48_, interface27s, 1271232604);
				int i_50_ = i_41_ * i_46_ + anInt3412 * -801958417;
				return new Point(i_49_, i_50_);
			}
			i_45_ += i_47_;
		}
		return null;
	}

	public int method3839(int i, byte i_51_) {
		return ((Class284) this).aByteArray3409[i] & 0xff;
	}

	public String method3840(String string, int i, Interface27[] interface27s, int i_52_, int i_53_) {
		int i_54_ = method3834(string, new int[] { i }, aStringArray3414, interface27s, 1234023561);
		if (i_52_ >= 0 && i_52_ < i_54_)
			return aStringArray3414[i_52_];
		return null;
	}

	public int method3841(String string, int i, Interface27[] interface27s, int i_55_) {
		return method3834(string, new int[] { i }, aStringArray3414, interface27s, 1029235002);
	}

	public int method3842(int i, char c, int i_56_) {
		if (((Class284) this).aByteArrayArray3410 != null)
			return ((Class284) this).aByteArrayArray3410[i][c];
		return 0;
	}

	public int method3843(int i) {
		return ((Class284) this).aByteArray3409[i] & 0xff;
	}

	public int method3844(int i) {
		return ((Class284) this).aByteArray3409[i] & 0xff;
	}

	public int method3845(String string, int i, int i_57_, int i_58_, int i_59_, Interface27[] interface27s, int i_60_) {
		if (i_57_ == 0)
			i_57_ = -1605051853 * anInt3411;
		int i_61_ = method3837(string, new int[] { i }, aStringArray3414, interface27s, false, -750193180);
		if (0 == i_61_)
			return 0;
		if (i_59_ < 0)
			i_59_ = 0;
		i_59_ /= i_57_;
		if (i_59_ >= i_61_)
			i_59_ = i_61_ - 1;
		String string_62_ = aStringArray3414[i_59_];
		int i_63_ = 0;
		int i_64_ = 0;
		int i_65_;
		for (i_65_ = 0; i_65_ < i_58_ && i_63_ < string_62_.length(); i_65_ = method3833(string_62_.substring(0, ++i_63_), interface27s, 710916104))
			i_64_ = i_65_;
		if (i_63_ == string_62_.length() && string_62_.endsWith("<br>"))
			i_63_ -= 4;
		if (i_58_ - i_64_ < i_65_ - i_58_)
			i_63_--;
		for (int i_66_ = 0; i_66_ < i_59_; i_66_++)
			i_63_ += aStringArray3414[i_66_].length();
		return i_63_;
	}

	Class284(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		int i = class572_sub15.readUnsignedByte(1842527231);
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class572_sub15.readUnsignedByte(1801557844) == 1;
		((Class284) this).aByteArray3409 = new byte[256];
		class572_sub15.readBytes(((Class284) this).aByteArray3409, 0, 256, 1464780272);
		if (bool) {
			int[] is_67_ = new int[256];
			int[] is_68_ = new int[256];
			for (int i_69_ = 0; i_69_ < 256; i_69_++)
				is_67_[i_69_] = class572_sub15.readUnsignedByte(1402185986);
			for (int i_70_ = 0; i_70_ < 256; i_70_++)
				is_68_[i_70_] = class572_sub15.readUnsignedByte(1372169648);
			byte[][] is_71_ = new byte[256][];
			for (int i_72_ = 0; i_72_ < 256; i_72_++) {
				is_71_[i_72_] = new byte[is_67_[i_72_]];
				byte i_73_ = 0;
				for (int i_74_ = 0; i_74_ < is_71_[i_72_].length; i_74_++) {
					i_73_ += class572_sub15.readByte(433112281);
					is_71_[i_72_][i_74_] = i_73_;
				}
			}
			byte[][] is_75_ = new byte[256][];
			for (int i_76_ = 0; i_76_ < 256; i_76_++) {
				is_75_[i_76_] = new byte[is_67_[i_76_]];
				byte i_77_ = 0;
				for (int i_78_ = 0; i_78_ < is_75_[i_76_].length; i_78_++) {
					i_77_ += class572_sub15.readByte(1508779254);
					is_75_[i_76_][i_78_] = i_77_;
				}
			}
			((Class284) this).aByteArrayArray3410 = new byte[256][256];
			for (int i_79_ = 0; i_79_ < 256; i_79_++) {
				if (32 != i_79_ && i_79_ != 160) {
					for (int i_80_ = 0; i_80_ < 256; i_80_++) {
						if (32 != i_80_ && i_80_ != 160)
							((Class284) this).aByteArrayArray3410[i_79_][i_80_] = (byte) Class393.method4735(is_71_, is_75_, is_68_, (((Class284) this).aByteArray3409), is_67_, i_79_, i_80_, 1660158078);
					}
				}
			}
			anInt3411 = (is_67_[32] + is_68_[32]) * 151630075;
		} else
			anInt3411 = class572_sub15.readUnsignedByte(1007340923) * 151630075;
		class572_sub15.readUnsignedByte(245055504);
		class572_sub15.readUnsignedByte(1352342396);
		anInt3412 = class572_sub15.readUnsignedByte(152849486) * 676903183;
		anInt3413 = class572_sub15.readUnsignedByte(1018399961) * -1752598319;
	}

	static final byte[] method3846(byte[] is, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		Class619 class619 = new Class619(class572_sub15);
		Class281 class281 = class619.method7412(-1321453811);
		int i_81_ = class619.method7416(-1818405634);
		if (i_81_ < 0 || (-1328792881 * Class248.anInt2698 != 0 && i_81_ > Class248.anInt2698 * -1328792881))
			throw new RuntimeException();
		if (class281 == Class281.aClass281_3219) {
			byte[] is_82_ = new byte[i_81_];
			class572_sub15.readBytes(is_82_, 0, i_81_, 1561232506);
			return is_82_;
		}
		int i_83_ = class619.method7414((byte) 121);
		if (i_83_ < 0 || (0 != -1328792881 * Class248.anInt2698 && i_83_ > -1328792881 * Class248.anInt2698))
			throw new RuntimeException();
		byte[] is_84_ = new byte[i_83_];
		if (Class281.aClass281_3216 == class281)
			Class674.method7917(is_84_, i_83_, is, i_81_, 9);
		else {
			synchronized (Class248.aClass206_2687) {
				Class248.aClass206_2687.method3028(class572_sub15, is_84_, (byte) -82);
			}
		}
		return is_84_;
	}

	static void method3847(Cs2Executor class441, int i) {
		int i_85_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		TwitchWebcamDevice twitchwebcamdevice = Class380.method4642(i_85_, (byte) 43);
		if (twitchwebcamdevice == null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1183431001 * twitchwebcamdevice.anInt2058;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = twitchwebcamdevice.aString2056;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = twitchwebcamdevice.aString2057;
		}
	}

	static final void method3848(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_86_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_87_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_88_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_89_ = (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_88_, -1559938897));
		if (class645.aClass283_8313.getId(1878286978) != i_86_ || class645.aClass283_8314.getId(1547271669) != i_87_)
			throw new RuntimeException(new StringBuilder().append(i_88_).append(" ").append(i_89_).toString());
		if (i_87_ == ScriptVarType.aClass283_3261.getId(1235667218))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class645.method7632(i_89_, -756724828);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class645.method7631(i_89_, (byte) -118);
	}
}
