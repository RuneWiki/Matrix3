package game;

/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24 {
	static int anInt156;
	static boolean aBool157 = false;
	static Class411_Sub1 aClass411_Sub1_158;
	static int anInt159;

	static void method711() {
		Class423_Sub2 class423_sub2 = (Class423_Sub2) aClass411_Sub1_158.method4990((byte) -37);
		Class658_Sub2 class658_sub2 = (Class658_Sub2) aClass411_Sub1_158.method4991(-589573040);
		Class240 class240 = class423_sub2.method5159((byte) -54);
		Class230 class230 = class658_sub2.method8929((short) 11906);
		if (client.aClass73_8880 != null) {
			int i = client.aClass73_8880.anInt764 * 669238293;
			int i_0_ = 1360982075 * client.aClass73_8880.anInt765;
			float f = 1000.0F;
			float f_1_ = (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
			float f_2_ = (float) (2.0 * Math.atan((double) ((float) i_0_ / 2.0F / f)));
			try {
				aClass411_Sub1_158.method4984(f_1_, f_2_, (byte) 86);
			} catch (Exception_Sub4 exception_sub4) {
				/* empty */
			}
		}
		if (Class26.aClass564_216.method6654((byte) -102)) {
			Class230 class230_3_ = Class230.method3210();
			class230_3_.method3172(1.0F, 0.0F, 0.0F, (float) (Class26.aClass564_216.method6658((byte) -37) - 1719156023 * anInt159) / 200.0F);
			class230.method3189(class230_3_);
			Class240 class240_4_ = Class240.method3316(0.0F, 1.0F, 0.0F);
			class240_4_.method3288(class230);
			Class230 class230_5_ = Class230.method3210();
			class230_5_.method3209(class240_4_, ((float) (anInt156 * -1963005777 - Class26.aClass564_216.method6657((short) -5694)) / 200.0F));
			class230.method3189(class230_5_);
			class658_sub2.method8940(class230, (byte) 4);
		}
		anInt156 = Class26.aClass564_216.method6657((short) -4477) * -1827312049;
		anInt159 = Class26.aClass564_216.method6658((byte) -95) * 935463047;
		class230.method3175();
		if (Class108.aClass549_1426.method6514(98, (byte) 1)) {
			Class240 class240_6_ = Class240.method3316(0.0F, 0.0F, 25.0F);
			class240_6_.method3288(class230);
			class240_6_.aFloat2656 *= -1.0F;
			class240.method3305(class240_6_);
		}
		if (Class108.aClass549_1426.method6514(99, (byte) 1)) {
			Class240 class240_7_ = Class240.method3316(0.0F, 0.0F, -25.0F);
			class240_7_.method3288(class230);
			class240_7_.aFloat2656 *= -1.0F;
			class240.method3305(class240_7_);
		}
		if (Class108.aClass549_1426.method6514(96, (byte) 1)) {
			Class240 class240_8_ = Class240.method3316(-25.0F, 0.0F, 0.0F);
			class240_8_.method3288(class230);
			class240_8_.aFloat2656 *= -1.0F;
			class240.method3305(class240_8_);
		}
		if (Class108.aClass549_1426.method6514(97, (byte) 1)) {
			Class240 class240_9_ = Class240.method3316(25.0F, 0.0F, 0.0F);
			class240_9_.method3288(class230);
			class240_9_.aFloat2656 *= -1.0F;
			class240.method3305(class240_9_);
		}
		Class572_Sub17 class572_sub17 = new Class572_Sub17(0, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
		class423_sub2.method9278(class572_sub17, (byte) 3);
		Class497 class497 = client.aClass613_8605.method7280((byte) -115);
		int i = -2109597897 * class497.localX << 9;
		int i_10_ = class497.localY * 417324155 << 9;
		aClass411_Sub1_158.method5012(0.02F, (client.aClass613_8605.method7293(1134705460).anIntArrayArrayArray3141), client.aClass613_8605.method7287((byte) -67), i, i_10_, (byte) -99);
	}

	static void method712(Class572_Sub17 class572_sub17) {
		aClass411_Sub1_158 = new Class411_Sub1(client.aClass5_8876);
		aClass411_Sub1_158.method5037(Class409.aClass409_4783, 1055955021);
		try {
			Class423_Sub2 class423_sub2 = ((Class423_Sub2) aClass411_Sub1_158.method4972(Class413.aClass413_4910, false, (byte) 9));
			Class658_Sub2 class658_sub2 = ((Class658_Sub2) aClass411_Sub1_158.method4971(Class416.aClass416_4933, false, 288613123));
			class423_sub2.method9278(class572_sub17, (byte) 3);
			class658_sub2.method8940(new Class230(0.0F, 0.0F, 0.0F), (byte) 4);
			aClass411_Sub1_158.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), 649245694);
			aClass411_Sub1_158.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) 15429);
			aClass411_Sub1_158.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 43);
			aClass411_Sub1_158.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1241592231);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		anInt156 = Class26.aClass564_216.method6657((short) -21165) * -1827312049;
		anInt159 = Class26.aClass564_216.method6658((byte) -30) * 935463047;
		aBool157 = true;
	}

	static void method713() {
		aClass411_Sub1_158 = null;
		aBool157 = false;
	}

	static void method714(Class572_Sub17 class572_sub17) {
		aClass411_Sub1_158 = new Class411_Sub1(client.aClass5_8876);
		aClass411_Sub1_158.method5037(Class409.aClass409_4783, 536306085);
		try {
			Class423_Sub2 class423_sub2 = ((Class423_Sub2) aClass411_Sub1_158.method4972(Class413.aClass413_4910, false, (byte) 9));
			Class658_Sub2 class658_sub2 = ((Class658_Sub2) aClass411_Sub1_158.method4971(Class416.aClass416_4933, false, -1322110798));
			class423_sub2.method9278(class572_sub17, (byte) 3);
			class658_sub2.method8940(new Class230(0.0F, 0.0F, 0.0F), (byte) 4);
			aClass411_Sub1_158.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), -905845070);
			aClass411_Sub1_158.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) 21480);
			aClass411_Sub1_158.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 57);
			aClass411_Sub1_158.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -262188315);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		anInt156 = Class26.aClass564_216.method6657((short) -2944) * -1827312049;
		anInt159 = Class26.aClass564_216.method6658((byte) -78) * 935463047;
		aBool157 = true;
	}

	static boolean method715() {
		return aBool157;
	}

	static boolean method716() {
		return aBool157;
	}

	static boolean method717() {
		return aBool157;
	}

	Class24() throws Throwable {
		throw new Error();
	}

	static boolean method718() {
		return aBool157;
	}

	static final void method719(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class288.method3880(class73, class83, class441, -681948704);
	}

	static final void method720(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 413351069 * client.anInt8567;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.anInt8566 * 2093536371;
	}

	static void method721(Class106 class106, int i) {
		int i_11_ = -10660793;
		Class488.method5811(class106, Class442.anInt5133 * -699022169, Class202_Sub1.anInt9650 * 1113238055, Class25.anInt180 * -1568261905, -776124211 * Class665_Sub31.anInt9619, i_11_, -16777216, -276423743);
		Class1.aClass102_16.method1620(Class279.aClass279_3081.method3758(Class594.aClass435_7823, 16711935), 3 + Class442.anInt5133 * -699022169, 14 + 1113238055 * Class202_Sub1.anInt9650, i_11_, -1, 846868036);
		int i_12_ = Class26.aClass564_216.method6657((short) 5586);
		int i_13_ = Class26.aClass564_216.method6658((byte) -108);
		if (!Class25.aBool166) {
			int i_14_ = 0;
			for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); null != class572_sub12_sub10; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(1299300090))) {
				int i_15_ = (1113238055 * Class202_Sub1.anInt9650 + 31 + ((357782167 * Class25.anInt172 - 1 - i_14_) * (-211596715 * Class25.anInt162)));
				Class672.method7893(i_12_, i_13_, Class442.anInt5133 * -699022169, Class202_Sub1.anInt9650 * 1113238055, Class25.anInt180 * -1568261905, -776124211 * Class665_Sub31.anInt9619, i_15_, class572_sub12_sub10, Class1.aClass102_16, Class318.aClass284_3875, -1, -256, 1951031781);
				i_14_++;
			}
		} else {
			int i_16_ = 0;
			for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7848(-1042067865)); null != class572_sub12_sub19; class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7845(-2072390135))) {
				int i_17_ = (i_16_ * (-211596715 * Class25.anInt162) + (1113238055 * Class202_Sub1.anInt9650 + 31));
				if (944917463 * (((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482) == 1)
					Class672.method7893(i_12_, i_13_, Class442.anInt5133 * -699022169, 1113238055 * Class202_Sub1.anInt9650, Class25.anInt180 * -1568261905, -776124211 * Class665_Sub31.anInt9619, i_17_, ((Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)), Class1.aClass102_16, Class318.aClass284_3875, -1, -256, 1908318097);
				else
					Class402_Sub2.method9354(i_12_, i_13_, -699022169 * Class442.anInt5133, 1113238055 * Class202_Sub1.anInt9650, -1568261905 * Class25.anInt180, Class665_Sub31.anInt9619 * -776124211, i_17_, class572_sub12_sub19, Class1.aClass102_16, Class318.aClass284_3875, -1, -256, -1770826897);
				i_16_++;
			}
			if (Class25.aClass572_Sub12_Sub19_178 != null) {
				Class488.method5811(class106, -1647258031 * Class310.anInt3663, Class463.anInt5234 * -1069919945, 673354219 * Class2.anInt20, 491353989 * Class612.anInt7989, i_11_, -16777216, -276423743);
				Class1.aClass102_16.method1620(((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).aString11481, -1647258031 * Class310.anInt3663 + 3, Class463.anInt5234 * -1069919945 + 14, i_11_, -1, 330651092);
				i_16_ = 0;
				for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).aClass664_11480.method7848(-1042067865)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) Class25.aClass572_Sub12_Sub19_178).aClass664_11480.method7845(-1389339339))) {
					int i_18_ = (-1069919945 * Class463.anInt5234 + 31 + i_16_ * (-211596715 * Class25.anInt162));
					Class672.method7893(i_12_, i_13_, -1647258031 * Class310.anInt3663, Class463.anInt5234 * -1069919945, 673354219 * Class2.anInt20, 491353989 * Class612.anInt7989, i_18_, class572_sub12_sub10, Class1.aClass102_16, Class318.aClass284_3875, -1, -256, 106697265);
					i_16_++;
				}
			}
		}
	}

	public static int method722(int i, byte i_19_) {
		Class572_Sub12_Sub13 class572_sub12_sub13 = ((Class572_Sub12_Sub13) Class390.aClass676_4654.get((long) i));
		if (class572_sub12_sub13 == null)
			return -1;
		if (class572_sub12_sub13.aClass572_Sub12_9094 == Class390.aClass664_4656.aClass572_Sub12_8489)
			return -1;
		return (1509288629 * ((Class572_Sub12_Sub13) class572_sub12_sub13.aClass572_Sub12_9094).anInt11459);
	}
}
