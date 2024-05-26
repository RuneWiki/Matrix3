package game;

/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class537 {
	byte aByte5999;
	public static final int anInt6000 = 2;
	public static final int anInt6001 = 4;
	short aShort6002;
	public static final int anInt6003 = 16;
	public static final int anInt6004 = 8;
	byte aByte6005;
	short aShort6006;
	int[] anIntArray6007;
	short aShort6008;
	short aShort6009;
	int[] anIntArray6010;
	int[] anIntArray6011;
	short[] aShortArray6012;
	public static final int anInt6013 = 1;
	short[] aShortArray6014;
	short[] aShortArray6015;

	Class537(Class523 class523, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class537) this).aByte5999 = (byte) i;
		((Class537) this).aByte6005 = (byte) i_0_;
		((Class537) this).anIntArray6010 = new int[4];
		((Class537) this).anIntArray6011 = new int[4];
		((Class537) this).anIntArray6007 = new int[4];
		((Class537) this).anIntArray6010[0] = i_1_;
		((Class537) this).anIntArray6010[1] = i_2_;
		((Class537) this).anIntArray6010[2] = i_3_;
		((Class537) this).anIntArray6010[3] = i_4_;
		((Class537) this).anIntArray6011[0] = i_5_;
		((Class537) this).anIntArray6011[1] = i_6_;
		((Class537) this).anIntArray6011[2] = i_7_;
		((Class537) this).anIntArray6011[3] = i_8_;
		((Class537) this).anIntArray6007[0] = i_9_;
		((Class537) this).anIntArray6007[1] = i_10_;
		((Class537) this).anIntArray6007[2] = i_11_;
		((Class537) this).anIntArray6007[3] = i_12_;
		((Class537) this).aShort6009 = (short) (i_1_ >> 406704825 * class523.anInt5858);
		((Class537) this).aShort6002 = (short) (i_3_ >> class523.anInt5858 * 406704825);
		((Class537) this).aShort6008 = (short) (i_9_ >> 406704825 * class523.anInt5858);
		((Class537) this).aShort6006 = (short) (i_11_ >> class523.anInt5858 * 406704825);
		((Class537) this).aShortArray6012 = new short[4];
		((Class537) this).aShortArray6014 = new short[4];
		((Class537) this).aShortArray6015 = new short[4];
	}

	static boolean method6383(int i, int i_13_) {
		return (i >= Class516.aClass516_5723.anInt5742 * 1870735441 && i <= 1870735441 * Class516.aClass516_5731.anInt5742);
	}

	public static String method6384(CharSequence charsequence, int i) {
		int i_14_ = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i_14_);
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			char c = charsequence.charAt(i_15_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || c == '-' || '*' == c || '_' == c)
				stringbuilder.append(c);
			else if (' ' == c)
				stringbuilder.append('+');
			else {
				int i_16_ = Class525.method6305(c, 669638914);
				stringbuilder.append('%');
				int i_17_ = i_16_ >> 4 & 0xf;
				if (i_17_ >= 10)
					stringbuilder.append((char) (55 + i_17_));
				else
					stringbuilder.append((char) (i_17_ + 48));
				i_17_ = i_16_ & 0xf;
				if (i_17_ >= 10)
					stringbuilder.append((char) (55 + i_17_));
				else
					stringbuilder.append((char) (i_17_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	static final void method6385(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		int i_18_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_18_, -1857808542));
		if (!class264.aString2833.equals(string))
			class73.method1103(i_18_, string, 2000062338);
		else
			class73.method1127(i_18_, -1911102519);
	}

	static void method6386(int i) {
		Class502.aClass675_5557 = null;
		Class547_Sub1.anInt8987 = 0;
		Class547_Sub1.anInt6174 = 0;
		Class383.aClass73_4610 = null;
		Class547_Sub1.method6459();
		Class547_Sub1.aClass675_6149.method7918(-1180417754);
		Class547_Sub1.aClass548_6141 = null;
		Class547_Sub1.aClass127_6135.method2231((byte) -10);
		Class547_Sub1.aClass127_6168.method2231((byte) -104);
		NPCDefintion.aClass161_4861 = null;
		Class547_Sub1.anInt8982 = 1904285671;
		Class547_Sub1.anInt8983 = 1743033659;
		if (Class547_Sub1.aClass639_Sub12_6173 != null) {
			Class547_Sub1.aClass639_Sub12_6173.method7571(1957224179);
			Class547_Sub1.aClass639_Sub12_6173.method8945(128, 64, 1987630212);
		}
		if (null != Class547_Sub1.aClass639_Sub1_6155)
			Class547_Sub1.aClass639_Sub1_6155.method8891(64, 64, (short) 30727);
		if (null != Class547_Sub1.aClass639_Sub16_6123)
			Class547_Sub1.aClass639_Sub16_6123.method7569(256, -1776787074);
		Class40_Sub1.aClass639_Sub19_9950.method7569(64, -1992801233);
	}
}
