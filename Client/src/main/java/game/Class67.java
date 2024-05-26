package game;

/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67 {
	public String aString690;
	public String aString691;
	static int anInt692;
	static int anInt693;

	void method1051(Class380 class380, int i) {
		aString690 = class380.method4635((byte) 8);
		aString691 = class380.method4635((byte) 47);
	}

	void method1052(Class380 class380) {
		aString690 = class380.method4635((byte) -77);
		aString691 = class380.method4635((byte) 45);
	}

	Class67() {
		/* empty */
	}

	void method1053(Class380 class380) {
		aString690 = class380.method4635((byte) -128);
		aString691 = class380.method4635((byte) -96);
	}

	public static void method1054(byte i) {
		Class241.anInt2658 = 0;
		Class241.anInt2660 = 0;
	}

	static IVarDomain method1055(Class334 class334, int i) {
		return new Class459(class334);
	}

	static final void method1056(int i) {
		Class497 class497 = client.aClass613_8605.method7280((byte) -126);
		Class240 class240 = Class133_Sub1.aClass411_Sub1_9827.method4968(-1417293502);
		Class36.anInt387 = 70707251 * ((int) class240.aFloat2653 - (-2109597897 * class497.localX << 9));
		Class572_Sub13_Sub2.anInt11451 = -371247041 * -(int) class240.aFloat2656;
		Class49.anInt490 = -114706035 * ((int) class240.aFloat2657 - (417324155 * class497.localY << 9));
		Class455.anInt5187 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method4999(781873774) * 2607.5945876176133) & 0x3fff) * 58615007;
		Class406.anInt4765 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) & 0x3fff) * 1259382101;
		Class88.anInt1225 = 0;
	}

	public static int method1057(CharSequence charsequence, byte i) {
		int i_0_ = charsequence.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
			i_1_ = ((i_1_ << 5) - i_1_ + Class525.method6305(charsequence.charAt(i_2_), -361934355));
		return i_1_;
	}
}
