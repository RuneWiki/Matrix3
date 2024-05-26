package game;

/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58 implements Interface2 {
	Class46 this$0;
	int anInt530;
	int anInt531;

	public void method16(Class49 class49) {
		class49.method862(((Class58) this).anInt530 * -1823334983, -1689806973 * ((Class58) this).anInt531, 1685528830);
		class49.method854(((Class58) this).anInt530 * -1823334983, 1493492562).method2107(699846234);
	}

	public void method15(Class49 class49, int i) {
		class49.method862(((Class58) this).anInt530 * -1823334983, -1689806973 * ((Class58) this).anInt531, 1921467986);
		class49.method854(((Class58) this).anInt530 * -1823334983, 1493492562).method2107(1480441677);
	}

	Class58(Class46 class46, RSByteBuffer class572_sub15) {
		((Class58) this).this$0 = class46;
		((Class58) this).anInt530 = class572_sub15.readUnsignedShort(647518597) * -859121527;
		((Class58) this).anInt531 = class572_sub15.readUnsignedByte(2021771715) * 2018357035;
	}

	public void method17(Class49 class49) {
		class49.method862(((Class58) this).anInt530 * -1823334983, -1689806973 * ((Class58) this).anInt531, 1940164947);
		class49.method854(((Class58) this).anInt530 * -1823334983, 1493492562).method2107(436751737);
	}

	static final void method1003(Cs2Executor class441, int i) {
		Class572_Sub17 class572_sub17 = (Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class572_sub17.anInt9126 * -862367545;
	}

	static char method1004(char c, Class435 class435, int i) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && class435 != Class435.aClass435_5056)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if ('\u00dd' == c)
				return 'Y';
			if (c == '\u00df')
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if ('\u00f1' == c && Class435.aClass435_5056 != class435)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if (c == '\u00fd' || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if (c == '\u0153')
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}
}
