package game;

/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class427 {
	static Class427 aClass427_5004;
	static Class427 aClass427_5005;
	boolean aBool5006;
	static Class427 aClass427_5007 = new Class427(0, true);
	int anInt5008;

	Class427(int i, boolean bool) {
		((Class427) this).anInt5008 = i * 995815375;
		((Class427) this).aBool5006 = bool;
	}

	static {
		aClass427_5005 = new Class427(1, true);
		aClass427_5004 = new Class427(2, false);
	}

	static final void method5191(int i, Class676 class676, byte i_0_) {
		if (i != -1 && class676.get((long) i) == null)
			class676.put(new Class572(), (long) i);
	}

	static final void method5192(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		int i_1_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		if (i_1_ < 0 || i_1_ > 9)
			((Cs2Executor) class441).objectStackPtr -= 1019967701;
		else
			class73.method1108(i_1_, (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]), 1770516781);
	}

	static final boolean method5193(int[][] is, int[][] is_2_, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		for (int i_8_ = i_3_; i_8_ <= i_5_; i_8_++) {
			for (int i_9_ = i_4_; i_9_ <= i_6_; i_9_++) {
				if (i == is[i_8_][i_9_] && is_2_[i_8_][i_9_] <= 1)
					return true;
			}
		}
		return false;
	}
}
