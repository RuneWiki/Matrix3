package game;

/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class436 {
	static char[] aCharArray5066 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0',
		'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	static Socket aSocket5067;

	public static boolean method5268(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray5066;
			for (int i = 0; i < cs.length; i++) {
				char c_0_ = cs[i];
				if (c == c_0_)
					return true;
			}
		}
		return false;
	}

	public static boolean method5269(byte i) {
		int i_1_ = i & 0xff;
		if (0 == i_1_)
			return false;
		if (i_1_ >= 128 && i_1_ < 160 && aCharArray5066[i_1_ - 128] == 0)
			return false;
		return true;
	}

	Class436() throws Throwable {
		throw new Error();
	}

	public static boolean method5270(byte i) {
		int i_2_ = i & 0xff;
		if (0 == i_2_)
			return false;
		if (i_2_ >= 128 && i_2_ < 160 && aCharArray5066[i_2_ - 128] == 0)
			return false;
		return true;
	}

	static final void method5271(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).aClass189_5123 = new Class189(string, true);
	}

	static final void method5272(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) -6445);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class51.method905(class73, class83, class441, -478691160);
	}
}
