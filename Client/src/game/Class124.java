package game;

/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124 {
	static Class124 aClass124_1495;
	static Class124 aClass124_1496;
	static Class124 aClass124_1497 = new Class124();
	static Class124 aClass124_1498;
	static Class124 aClass124_1499;
	static Class124 aClass124_1500;
	static Class124 aClass124_1501;
	static Class124 aClass124_1502;
	public static Class124 aClass124_1503;
	public static Class124 aClass124_1504;
	static Class124 aClass124_1505;
	static Class124 aClass124_1506;
	static Class124 aClass124_1507;
	static Class248 aClass248_1508;

	static {
		aClass124_1496 = new Class124();
		aClass124_1506 = new Class124();
		aClass124_1498 = new Class124();
		aClass124_1499 = new Class124();
		aClass124_1502 = new Class124();
		aClass124_1501 = new Class124();
		aClass124_1505 = new Class124();
		aClass124_1503 = new Class124();
		aClass124_1504 = new Class124();
		aClass124_1495 = new Class124();
		aClass124_1500 = new Class124();
		aClass124_1507 = new Class124();
	}

	Class124() {
		/* empty */
	}

	static void method2203(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class423.method5168(-576029982);
	}

	public static String method2204(long l, int i, boolean bool, Class435 class435, int i_0_) {
		char c = ',';
		char c_1_ = '.';
		if (class435 == Class435.aClass435_5054) {
			c = '.';
			c_1_ = ',';
		}
		if (Class435.aClass435_5053 == class435)
			c_1_ = '\u00a0';
		boolean bool_2_ = false;
		if (l < 0L) {
			bool_2_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				int i_4_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (i_4_ + 48 - 10 * (int) l));
			}
			stringbuilder.append(c);
		}
		int i_5_ = 0;
		for (;;) {
			int i_6_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (48 + i_6_ - 10 * (int) l));
			if (0L == l)
				break;
			if (bool) {
				i_5_++;
				if (0 == i_5_ % 3)
					stringbuilder.append(c_1_);
			}
		}
		if (bool_2_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static final void method2205(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_8_ >= 1 && i_8_ <= 10)
			class73.method1123(i_8_ - 1, i_7_, 1469935233);
	}
}
