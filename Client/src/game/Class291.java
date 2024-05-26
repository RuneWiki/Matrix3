package game;

/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class291 {
	public static Class291 aClass291_3440;
	public static Class291 aClass291_3441;
	public static Class291 aClass291_3442;
	public static Class291 aClass291_3443;
	public static Class291 aClass291_3444;
	public static Class291 aClass291_3445;
	public static Class291 aClass291_3446 = new Class291();

	static {
		aClass291_3441 = new Class291();
		aClass291_3442 = new Class291();
		aClass291_3443 = new Class291();
		aClass291_3444 = new Class291();
		aClass291_3440 = new Class291();
		aClass291_3445 = new Class291();
	}

	Class291() {
		/* empty */
	}

	public static int method3943(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if ((i_4_ & 0x1) == 1) {
			int i_6_ = i_2_;
			i_2_ = i_3_;
			i_3_ = i_6_;
		}
		i_1_ &= 0x3;
		if (0 == i_1_)
			return i_0_;
		if (i_1_ == 1)
			return 7 - i - (i_2_ - 1);
		if (2 == i_1_)
			return 7 - i_0_ - (i_3_ - 1);
		return i;
	}

	static void method3944(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class665_Sub1.method8106(-1098127133);
	}

	static final void method3945(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -102670108) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray899 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method3946(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_7_ >= 1 && i_7_ <= 2)
			Class572_Sub8_Sub1.method10279(i_7_, -1, -1, false, 623786968);
	}

	static final void method3947(Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (Math.random() * (double) (i_8_ + 1));
	}
}
