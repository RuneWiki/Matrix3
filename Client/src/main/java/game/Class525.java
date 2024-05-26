package game;

/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class525 implements Interface61 {
	Class257 aClass257_5887;

	public void method299(short i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3738, client.aClass195_8589.aClass650_2340, -1939270706);
		class572_sub25.aRsByteBuffer.write128Byte(((Class525) this).aClass257_5887.getId(-2105696098), (byte) -117);
		client.aClass195_8589.method2929(class572_sub25, (byte) -119);
	}

	Class525(Class257 class257) {
		((Class525) this).aClass257_5887 = class257;
	}

	public void method151() {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3738, client.aClass195_8589.aClass650_2340, 363266745);
		class572_sub25.aRsByteBuffer.write128Byte(((Class525) this).aClass257_5887.getId(-408266016), (byte) -109);
		client.aClass195_8589.method2929(class572_sub25, (byte) -94);
	}

	static final void method6301(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class539.method6402(class73, class83, false, 2, class441, (byte) -28);
	}

	static final void method6302(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method852(1019967701) == i_0_ ? 1 : 0;
	}

	static final void method6303(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_1_ > i_2_ ? i_1_ : i_2_;
	}

	static final void method6304(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_5_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		Class240 class240 = Class240.method3316((float) i_3_, (float) i_4_, (float) i_5_);
		if (-1.0F == class240.aFloat2653)
			class240.aFloat2653 = Float.POSITIVE_INFINITY;
		if (-1.0F == class240.aFloat2656)
			class240.aFloat2656 = Float.POSITIVE_INFINITY;
		if (-1.0F == class240.aFloat2657)
			class240.aFloat2657 = Float.POSITIVE_INFINITY;
		Class133_Sub1.aClass411_Sub1_9827.method4976(class240, (short) -26859);
		Class133_Sub1.aClass411_Sub1_9827.method4988((float) i_6_ / 1000.0F, (byte) -99);
		class240.method3261();
	}

	public static byte method6305(char c, int i) {
		byte i_7_;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i_7_ = (byte) c;
		else if (c == '\u20ac')
			i_7_ = (byte) -128;
		else if ('\u201a' == c)
			i_7_ = (byte) -126;
		else if ('\u0192' == c)
			i_7_ = (byte) -125;
		else if (c == '\u201e')
			i_7_ = (byte) -124;
		else if (c == '\u2026')
			i_7_ = (byte) -123;
		else if (c == '\u2020')
			i_7_ = (byte) -122;
		else if (c == '\u2021')
			i_7_ = (byte) -121;
		else if (c == '\u02c6')
			i_7_ = (byte) -120;
		else if (c == '\u2030')
			i_7_ = (byte) -119;
		else if (c == '\u0160')
			i_7_ = (byte) -118;
		else if (c == '\u2039')
			i_7_ = (byte) -117;
		else if (c == '\u0152')
			i_7_ = (byte) -116;
		else if ('\u017d' == c)
			i_7_ = (byte) -114;
		else if (c == '\u2018')
			i_7_ = (byte) -111;
		else if (c == '\u2019')
			i_7_ = (byte) -110;
		else if ('\u201c' == c)
			i_7_ = (byte) -109;
		else if (c == '\u201d')
			i_7_ = (byte) -108;
		else if ('\u2022' == c)
			i_7_ = (byte) -107;
		else if (c == '\u2013')
			i_7_ = (byte) -106;
		else if ('\u2014' == c)
			i_7_ = (byte) -105;
		else if (c == '\u02dc')
			i_7_ = (byte) -104;
		else if (c == '\u2122')
			i_7_ = (byte) -103;
		else if (c == '\u0161')
			i_7_ = (byte) -102;
		else if ('\u203a' == c)
			i_7_ = (byte) -101;
		else if (c == '\u0153')
			i_7_ = (byte) -100;
		else if (c == '\u017e')
			i_7_ = (byte) -98;
		else if (c == '\u0178')
			i_7_ = (byte) -97;
		else
			i_7_ = (byte) 63;
		return i_7_;
	}

	static final void method6306(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.anInt4278 * -1450736271;
	}

	static final int method6307(int i, int i_8_, int i_9_, int i_10_, byte i_11_) {
		int i_12_ = 65536 - Class325.anIntArray4105[8192 * i_9_ / i_10_] >> 1;
		return (i_8_ * i_12_ >> 16) + ((65536 - i_12_) * i >> 16);
	}
}
