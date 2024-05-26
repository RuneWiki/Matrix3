package game;

/* Class375_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375_Sub3 extends Class375 {
	public int anInt9518;
	public int anInt9519;
	public static Class248 aClass248_9520;
	static String aString9521;

	public static Class375 method8876(RSByteBuffer class572_sub15) {
		Class375 class375 = Class616.method7376(class572_sub15, 1369304407);
		int i = class572_sub15.readInt(1691366612);
		int i_0_ = class572_sub15.readInt(1059601308);
		return new Class375_Sub3(class375.aClass320_4560, class375.aClass300_4556, -1706069299 * class375.anInt4557, -1354888403 * class375.anInt4558, class375.anInt4559 * -139432737, -670814997 * class375.anInt4562, class375.anInt4561 * -1271031675, class375.anInt4563 * -857233559, class375.anInt4555 * -983568713, i, i_0_);
	}

	public Class310 method215(byte i) {
		return Class310.aClass310_3652;
	}

	public Class310 method214() {
		return Class310.aClass310_3652;
	}

	public Class310 method216() {
		return Class310.aClass310_3652;
	}

	public Class310 method218() {
		return Class310.aClass310_3652;
	}

	Class375_Sub3(Class320 class320, Class300 class300, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class320, class300, i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		anInt9518 = i_7_ * 1811226011;
		anInt9519 = i_8_ * 1211622979;
	}

	public Class310 method217() {
		return Class310.aClass310_3652;
	}

	static boolean method8877(int i) {
		boolean bool;
		try {
			Class206 class206 = new Class206();
			byte[] is = class206.method3025(Class396.aByteArray4689, -121006723);
			Class12.method559(is, -1611308668);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public static void method8878(int i, int i_9_, String string, String string_10_, String string_11_, String string_12_, int i_13_) {
		Class241.method3327(i, i_9_, string, string_10_, string_11_, string_12_, null, -1, (byte) 99);
	}
}
