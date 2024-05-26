package game;

/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class438 implements Interface52 {
	int anInt5077;
	public static Class438 aClass438_5078 = new Class438(0, "");
	public static Class438 aClass438_5079 = new Class438(1, "");
	public static Class248 aClass248_5080;
	public static int anInt5081;

	Class438(int i, String string) {
		((Class438) this).anInt5077 = -185199169 * i;
	}

	public int getId(int i) {
		return ((Class438) this).anInt5077 * 169138751;
	}

	public int method61() {
		return ((Class438) this).anInt5077 * 169138751;
	}

	public int method45() {
		return ((Class438) this).anInt5077 * 169138751;
	}

	public int method43() {
		return ((Class438) this).anInt5077 * 169138751;
	}

	public int method143() {
		return ((Class438) this).anInt5077 * 169138751;
	}

	static void method5273(Class106 class106, Class572_Sub19 class572_sub19, Class78 class78, int i) {
		Class161 class161 = class78.method1160(class106, (byte) -10);
		if (null != class161) {
			int i_0_ = class161.method2587();
			if (class161.method2588() > i_0_)
				i_0_ = class161.method2588();
			int i_1_ = 10;
			int i_2_ = 663941421 * class572_sub19.anInt9138;
			int i_3_ = 31318135 * class572_sub19.anInt9143;
			int i_4_ = 0;
			int i_5_ = 0;
			if (null != class78.aString964) {
				i_5_ = (Class335_Sub1.aClass284_9695.method3830(class78.aString964, Class269.anInt2861 * 1960824389, 0, null, (byte) -65));
				i_4_ = (Class335_Sub1.aClass284_9695.method3835(class78.aString964, 1960824389 * Class269.anInt2861, null, 2112317125));
			}
			int i_6_ = i_0_ / 2 + 663941421 * class572_sub19.anInt9138;
			int i_7_ = class572_sub19.anInt9143 * 31318135;
			if (i_2_ < i_0_ + Class547_Sub1.anInt6185) {
				i_2_ = Class547_Sub1.anInt6185;
				i_6_ = Class547_Sub1.anInt6185 + i_0_ / 2 + i_1_ + i_4_ / 2 + 5;
			} else if (i_2_ > Class547_Sub1.anInt6187 - i_0_) {
				i_2_ = Class547_Sub1.anInt6187 - i_0_;
				i_6_ = Class547_Sub1.anInt6187 - i_0_ / 2 - i_1_ - i_4_ / 2 - 5;
			}
			if (i_3_ < Class547_Sub1.anInt6186 + i_0_) {
				i_3_ = Class547_Sub1.anInt6186;
				i_7_ = Class547_Sub1.anInt6186 + i_1_ + i_0_ / 2;
			} else if (i_3_ > Class547_Sub1.anInt6167 - i_0_) {
				i_3_ = Class547_Sub1.anInt6167 - i_0_;
				i_7_ = Class547_Sub1.anInt6167 - i_0_ / 2 - i_1_ - i_5_;
			}
			int i_8_ = ((int) (Math.atan2((double) (i_2_ - (663941421 * class572_sub19.anInt9138)), (double) (i_3_ - (class572_sub19.anInt9143 * 31318135))) / 3.141592653589793 * 32767.0) & 0xffff);
			class161.method2643((float) i_2_ + (float) i_0_ / 2.0F, (float) i_3_ + (float) i_0_ / 2.0F, 4096, i_8_);
			int i_9_ = -2;
			int i_10_ = -2;
			int i_11_ = -2;
			int i_12_ = -2;
			if (class78.aString964 != null) {
				i_9_ = i_6_ - i_4_ / 2 - 5;
				i_10_ = i_7_;
				i_11_ = i_9_ + i_4_ + 10;
				i_12_ = i_10_ + i_5_ + 3;
				if (0 != class78.anInt969 * 1965241951)
					class106.method1720(i_9_, i_10_, i_11_ - i_9_, i_12_ - i_10_, class78.anInt969 * 1965241951, (byte) -4);
				if (2086128583 * class78.anInt970 != 0)
					class106.method1982(i_9_, i_10_, i_11_ - i_9_, i_12_ - i_10_, class78.anInt970 * 2086128583, (byte) -25);
				Class579.aClass102_7676.method1613(class78.aString964, i_6_, i_7_, i_4_, i_5_, ~0xffffff | class78.anInt958 * -1706590863, 2080588741 * Class547_Sub1.aClass482_6181.anInt5381, 1, 0, 0, null, null, null, 0, 0, (byte) 32);
			}
			if (-1756791847 * class78.anInt960 != -1 || class78.aString964 != null) {
				Class572_Sub41 class572_sub41 = new Class572_Sub41(class572_sub19);
				((Class572_Sub41) class572_sub41).anInt9411 = -67325117 * (i_2_ - i_0_ / 2);
				((Class572_Sub41) class572_sub41).anInt9408 = (i_2_ + i_0_ / 2) * -1960336187;
				((Class572_Sub41) class572_sub41).anInt9407 = -240912597 * (i_3_ - i_0_);
				((Class572_Sub41) class572_sub41).anInt9409 = -840662523 * i_3_;
				((Class572_Sub41) class572_sub41).anInt9410 = i_9_ * 2037491937;
				((Class572_Sub41) class572_sub41).anInt9412 = -92291903 * i_11_;
				((Class572_Sub41) class572_sub41).anInt9413 = i_10_ * -278423541;
				((Class572_Sub41) class572_sub41).anInt9414 = i_12_ * 747740351;
				Class502.aClass675_5557.method7940(class572_sub41, -1485757808);
			}
		}
	}

	static final void method5274(Cs2Executor class441, byte i) {
		int i_13_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_13_, (short) 20408);
		Class83 class83 = Class534.aClass83Array5975[i_13_ >> 16];
		Class594.method7024(class73, class83, class441, (byte) 0);
	}

	static final void method5275(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -6795895) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray865 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}
}
