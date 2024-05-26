package game;

/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class165 {
	public String aString2037;
	public static final int anInt2038 = 4318;
	public static final int anInt2039 = 32902;
	public static final int anInt2040 = 4098;
	public static final int anInt2041 = -1;
	public int anInt2042;
	public String aString2043;
	public int anInt2044;
	public static final int anInt2045 = 0;
	public long aLong2046;
	static Class284 aClass284_2047;
	static int[] anIntArray2048;
	public static int anInt2049;
	public static int anInt2050;

	public Class165(int i, String string, int i_0_, String string_1_, long l, boolean bool) {
		anInt2042 = i * -697912949;
		aString2037 = string;
		anInt2044 = -291453189 * i_0_;
		aString2043 = string_1_;
		aLong2046 = l * 854343403015005547L;
	}

	static void method2668(byte[] is, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(1204263965);
			if (i_2_ == 0)
				break;
			if (1 == i_2_)
				Class501.anInt5545 = class572_sub15.readUnsignedShort(647518597) * -1392499547;
		}
	}

	public static Class288[] method2669(int i) {
		return (new Class288[] { Class288.aClass288_3424, Class288.aClass288_3425, Class288.aClass288_3423 });
	}

	public static final void method2670(int i) {
		Class52.anImage492 = null;
		Class584.aFont7743 = null;
	}

	static final void method2671(Cs2Executor class441, short i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		String string_3_ = (String) (((Cs2Executor) class441).objectStack[1 + ((Cs2Executor) class441).objectStackPtr * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class503.method6016(string, string_3_, -1306651725);
	}

	static final void method2672(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub7_9227.method8165(132292417);
	}
}
