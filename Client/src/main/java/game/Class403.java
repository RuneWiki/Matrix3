package game;

/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class403 {
	public int anInt4747;
	public int anInt4748;
	public int anInt4749;

	static boolean method4783(Class499 class499, byte i) {
		return Class106.method2056(class499, null, (byte) -89);
	}

	static final void method4784(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt902 * 382019713;
	}

	static final void method4785(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1643769559 * Class439.anInt5084;
	}

	static boolean method4786(CharSequence charsequence, int i, boolean bool, short i_0_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		int i_3_ = 0;
		int i_4_ = charsequence.length();
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			int i_6_ = charsequence.charAt(i_5_);
			if (0 == i_5_) {
				if (45 == i_6_) {
					bool_1_ = true;
					continue;
				}
				if (i_6_ == 43 && bool)
					continue;
			}
			if (i_6_ >= 48 && i_6_ <= 57)
				i_6_ -= 48;
			else if (i_6_ >= 65 && i_6_ <= 90)
				i_6_ -= 55;
			else if (i_6_ >= 97 && i_6_ <= 122)
				i_6_ -= 87;
			else
				return false;
			if (i_6_ >= i)
				return false;
			if (bool_1_)
				i_6_ = -i_6_;
			int i_7_ = i * i_3_ + i_6_;
			if (i_7_ / i != i_3_)
				return false;
			i_3_ = i_7_;
			bool_2_ = true;
		}
		return bool_2_;
	}

	static final void method4787(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		for (Class591_Sub3 class591_sub3 = ((Class591_Sub3) client.aClass652_8748.method7697(-1517894050)); class591_sub3 != null; class591_sub3 = ((Class591_Sub3) client.aClass652_8748.method7698(-1159030822))) {
			if (client.cycles >= 1521121491 * ((Class591_Sub3) class591_sub3).anInt9323)
				class591_sub3.method7002((byte) 31);
			else {
				Class268.method3654(-2092452823 * ((Class591_Sub3) class591_sub3).anInt9325, (((Class591_Sub3) class591_sub3).anInt9322 * 1446812745 << 9) + 256, 256 + ((-1329100105 * ((Class591_Sub3) class591_sub3).anInt9321) << 9), 0, ((Class591_Sub3) class591_sub3).anInt9320 * -846413966, false, false, -1135068565);
				Class1.aClass102_16.method1612(((Class591_Sub3) class591_sub3).aString9319, (int) (client.aFloatArray8677[0] + (float) i), (int) (client.aFloatArray8677[1] + (float) i_8_), ~0xffffff | (1358526575 * ((Class591_Sub3) class591_sub3).anInt9324), 0, (byte) 8);
			}
		}
	}

	static final void method4788(Cs2Executor class441, int i) {
		int i_14_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_14_, (short) 10153);
		Class83 class83 = Class534.aClass83Array5975[i_14_ >> 16];
		Class336.method4237(class73, class83, class441, -1864024152);
	}

	static final void method4789(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub23_9208, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) != 0) ? 1 : 0, 751568015);
		Class623.method7443(-1164291585);
		client.aClass613_8605.method7302(558090732);
	}

	static final void method4790(Cs2Executor class441, int i) {
		int i_15_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_15_, (short) 3302);
		Class83 class83 = Class534.aClass83Array5975[i_15_ >> 16];
		Class665_Sub5.method8155(class73, class83, class441, Class68.aClass68_695, -1920888589);
	}
}
