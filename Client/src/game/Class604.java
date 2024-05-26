package game;

/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class604 {
	public static final int anInt7898 = 1;
	public static final int anInt7899 = 6;
	public static final int anInt7900 = 0;
	public static final int anInt7901 = 2;
	public static final int anInt7902 = 5;

	Class604() throws Throwable {
		throw new Error();
	}

	static final void method7147(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1667424302);
	}

	public static int method7148(byte i) {
		if (2.0 == (double) Class547_Sub1.aFloat6128)
			return 25;
		if (3.0 == (double) Class547_Sub1.aFloat6128)
			return 37;
		if (4.0 == (double) Class547_Sub1.aFloat6128)
			return 50;
		if ((double) Class547_Sub1.aFloat6128 == 6.0)
			return 75;
		if ((double) Class547_Sub1.aFloat6128 == 8.0)
			return 100;
		return 200;
	}

	static final void method7149(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -5347);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class255.method3526(class73, class83, class441, -1880642729);
	}

	static void method7150(Class106 class106, InterfaceDefinitions class73, byte i) {
		boolean bool = ((Class672.aClass639_Sub5_8533.method8908(class106, class73.nvmtheindexisotherone * 411192987, -830487355 * class73.anInt903, class73.anInt786 * 26654411, ~0xffffff | class73.anInt787 * 1572041513, 977164189 * class73.anInt809, (class73.aBool864 ? Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831 : null), -1098874058)) == null);
		if (bool) {
			Class7.aClass675_37.method7940(new Class572_Sub33(411192987 * class73.nvmtheindexisotherone, class73.anInt903 * -830487355, class73.anInt786 * 26654411, ~0xffffff | 1572041513 * class73.anInt787, 977164189 * class73.anInt809, class73.aBool864), -1456407034);
			Class555.method6575(class73, (short) 2680);
		}
	}

	public static byte[] method7151(CharSequence charsequence, byte i) {
		int i_1_ = charsequence.length();
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			char c = charsequence.charAt(i_2_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_2_] = (byte) c;
			else if (c == '\u20ac')
				is[i_2_] = (byte) -128;
			else if (c == '\u201a')
				is[i_2_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_2_] = (byte) -125;
			else if (c == '\u201e')
				is[i_2_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_2_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_2_] = (byte) -122;
			else if (c == '\u2021')
				is[i_2_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_2_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_2_] = (byte) -119;
			else if (c == '\u0160')
				is[i_2_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_2_] = (byte) -117;
			else if (c == '\u0152')
				is[i_2_] = (byte) -116;
			else if ('\u017d' == c)
				is[i_2_] = (byte) -114;
			else if (c == '\u2018')
				is[i_2_] = (byte) -111;
			else if (c == '\u2019')
				is[i_2_] = (byte) -110;
			else if (c == '\u201c')
				is[i_2_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_2_] = (byte) -108;
			else if (c == '\u2022')
				is[i_2_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_2_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_2_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_2_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_2_] = (byte) -103;
			else if (c == '\u0161')
				is[i_2_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_2_] = (byte) -101;
			else if (c == '\u0153')
				is[i_2_] = (byte) -100;
			else if (c == '\u017e')
				is[i_2_] = (byte) -98;
			else if (c == '\u0178')
				is[i_2_] = (byte) -97;
			else
				is[i_2_] = (byte) 63;
		}
		return is;
	}
}
