package game;

/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class590 {
	static String aString7808;
	static Applet anApplet7809 = null;
	static final int anInt7810 = 2;
	public static final int anInt7811 = 1;
	static final int anInt7812 = 0;
	static final int anInt7813 = 3;

	public static void method6995(Applet applet, String string) {
		anApplet7809 = applet;
		aString7808 = string;
	}

	Class590() throws Throwable {
		throw new Error();
	}

	static {
		aString7808 = null;
	}

	static final void method6996(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method6997(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10530(-1657989349).method5938(1664503531);
	}

	public static int method6998(CharSequence charsequence, int i, int i_0_, byte[] is, int i_1_, byte i_2_) {
		int i_3_ = i_0_ - i;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			char c = charsequence.charAt(i_4_ + i);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_4_ + i_1_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_4_ + i_1_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_4_ + i_1_] = (byte) -126;
			else if (c == '\u0192')
				is[i_1_ + i_4_] = (byte) -125;
			else if (c == '\u201e')
				is[i_1_ + i_4_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_1_ + i_4_] = (byte) -123;
			else if (c == '\u2020')
				is[i_1_ + i_4_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_4_ + i_1_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_4_ + i_1_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_1_ + i_4_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_1_ + i_4_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_1_ + i_4_] = (byte) -117;
			else if (c == '\u0152')
				is[i_1_ + i_4_] = (byte) -116;
			else if ('\u017d' == c)
				is[i_4_ + i_1_] = (byte) -114;
			else if (c == '\u2018')
				is[i_4_ + i_1_] = (byte) -111;
			else if (c == '\u2019')
				is[i_4_ + i_1_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_1_ + i_4_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_1_ + i_4_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_1_ + i_4_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_1_ + i_4_] = (byte) -106;
			else if (c == '\u2014')
				is[i_1_ + i_4_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_4_ + i_1_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_4_ + i_1_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_1_ + i_4_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_4_ + i_1_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_4_ + i_1_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_1_ + i_4_] = (byte) -98;
			else if (c == '\u0178')
				is[i_4_ + i_1_] = (byte) -97;
			else
				is[i_4_ + i_1_] = (byte) 63;
		}
		return i_3_;
	}

	static final void method6999(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_5_, 661563696)).aBool8143) ? 1 : 0;
	}

	static void method7000(Class106 class106, int i, int i_6_, InterfaceDefinitions class73, int i_7_, byte i_8_) {
		for (int i_9_ = 7; i_9_ >= 0; i_9_--) {
			for (int i_10_ = 127; i_10_ >= 0; i_10_--) {
				int i_11_ = (i_7_ & 0x3f) << 10 | (i_9_ & 0x7) << 7 | i_10_ & 0x7f;
				Class245.method3353(false, true, (byte) 31);
				int i_12_ = Class460.anIntArray4096[i_11_];
				Class472.method5585(false, true, (byte) -122);
				class106.method1725((669238293 * class73.anInt764 * i_10_ >> 7) + i, i_6_ + ((7 - i_9_) * (class73.anInt765 * 1360982075) >> 3), (669238293 * class73.anInt764 >> 7) + 1, (1360982075 * class73.anInt765 >> 3) + 1, ~0xffffff | i_12_, 0);
			}
		}
	}

	static final void method7001(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class7.method508(class73, class83, class441, 1771755046);
	}
}
