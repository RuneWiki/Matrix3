package game;

/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class622 implements Interface21 {
	static File aFile8068;

	static final void method7440(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_0_, -1219087776));
		if (i_1_ != -1132777561 * class264.anInt2832)
			class73.method1102(i_0_, i_1_, -1394658895);
		else
			class73.method1127(i_0_, -1649931248);
	}

	static final void method7441(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aString849 = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
	}

	public static final int method7442(int i, int i_2_, short i_3_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_2_ < 2)
				i_2_ = 2;
			else if (i_2_ > 126)
				i_2_ = 126;
			return i_2_;
		}
		i_2_ = i_2_ * (i & 0x7f) >> 7;
		if (i_2_ < 2)
			i_2_ = 2;
		else if (i_2_ > 126)
			i_2_ = 126;
		return (i & 0xff80) + i_2_;
	}
}
