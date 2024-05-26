package game;

/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class257 implements Interface52 {
	static Class257 aClass257_2766;
	static Class257 aClass257_2767;
	public static Class257 aClass257_2768;
	public static Class257 aClass257_2769;
	public static Class257 aClass257_2770;
	static Class257 aClass257_2771;
	static Class257 aClass257_2772;
	public static Class257 aClass257_2773;
	static Class257 aClass257_2774;
	public static Class257 aClass257_2775;
	static Class257 aClass257_2776 = new Class257(0);
	static Class257 aClass257_2777;
	public static Class257 aClass257_2778;
	public static Class257 aClass257_2779;
	int anInt2780;

	public int getId(int i) {
		return ((Class257) this).anInt2780 * -1976009627;
	}

	public int method45() {
		return ((Class257) this).anInt2780 * -1976009627;
	}

	static {
		aClass257_2767 = new Class257(1);
		aClass257_2766 = new Class257(2);
		aClass257_2769 = new Class257(3);
		aClass257_2770 = new Class257(4);
		aClass257_2771 = new Class257(5);
		aClass257_2772 = new Class257(6);
		aClass257_2774 = new Class257(7);
		aClass257_2775 = new Class257(8);
		aClass257_2773 = new Class257(9);
		aClass257_2768 = new Class257(10);
		aClass257_2777 = new Class257(11);
		aClass257_2778 = new Class257(12);
		aClass257_2779 = new Class257(13);
	}

	public int method143() {
		return ((Class257) this).anInt2780 * -1976009627;
	}

	public int method61() {
		return ((Class257) this).anInt2780 * -1976009627;
	}

	public int method43() {
		return ((Class257) this).anInt2780 * -1976009627;
	}

	Class257(int i) {
		((Class257) this).anInt2780 = 234345837 * i;
	}

	public static void method3541(String string, String string_0_, String string_1_, boolean bool, int i) {
		if (string.length() <= 320 && Class320.method4100(-544366613)) {
			Class474.method5625(-550468198);
			Class13.aString70 = string;
			Class13.aString103 = string_0_;
			Class13.aString99 = string_1_;
			Class13.aBool75 = bool;
			Class463.method5478(2, 1407349694);
		}
	}

	static void method3542(byte i) {
		/* empty */
	}

	static void method3543(RSByteBuffer class572_sub15, byte i) {
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(241950413);
			switch (i_2_) {
				case 0:
					Class122.anInt1484 = class572_sub15.readUnsignedShort(647518597) * 69159431;
					Class122.anInt1488 = class572_sub15.readUnsignedShort(647518597) * 1234179619;
					break;
				case 255:
					return;
			}
		}
	}
}
