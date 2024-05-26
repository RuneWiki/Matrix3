package game;

/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class208 {
	public static final int anInt2431 = 831;
	public static final int anInt2432 = 1;

	Class208() throws Throwable {
		throw new Error();
	}

	static final void method3033(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class409.method4942(class73, class441, (byte) -30);
	}

	static final void method3034(Cs2Executor class441, short i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		float f = (float) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		float f_0_ = (float) (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		float f_1_ = (float) (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		float f_2_ = ((float) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]) / 1000.0F);
		Class133_Sub1.aClass411_Sub1_9827.method4981(Class240.method3316(f, f_0_, f_1_), f_2_, 1709721300);
	}

	static final void method3035(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		boolean bool = true;
		if (i_3_ < 0)
			bool = (i_3_ + 1) % 4 == 0;
		else if (i_3_ < 1582)
			bool = i_3_ % 4 == 0;
		else if (i_3_ % 4 != 0)
			bool = false;
		else if (0 != i_3_ % 100)
			bool = true;
		else if (0 != i_3_ % 400)
			bool = false;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = bool ? 1 : 0;
	}

	static void method3036(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class488.method5809(-1184653954) ? 1 : 0;
	}

	static final void method3037(Cs2Executor class441, byte i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class111.aClass244_1428.method3345(i_4_, 1403039365).method10420((byte) 60);
	}

	static void method3038(String[] strings, byte i) {
		if (strings.length > 1) {
			for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
				if (strings[i_5_].startsWith("pause")) {
					int i_6_ = 5;
					try {
						i_6_ = Integer.parseInt(strings[i_5_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class118.method2154(new StringBuilder().append("Pausing for ").append(i_6_).append(" seconds...").toString(), 1044122297);
					Class190.aStringArray2242 = strings;
					Class190.anInt2240 = -1907057491 * (i_5_ + 1);
					Class570.aLong6399 = (Class69.method1067(-2074503561) + (long) (1000 * i_6_)) * 6028278634427035061L;
					break;
				}
				Class190.aString2235 = strings[i_5_];
				Class424.method5171(false, 1094719381);
			}
		} else {
			Class190.aString2235 = new StringBuilder().append(Class190.aString2235).append(strings[0]).toString();
			Class190.anInt2237 += strings[0].length() * -911481991;
		}
	}
}
