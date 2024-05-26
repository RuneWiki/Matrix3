package game;

/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class499 implements Interface57 {
	int[] anIntArray5512;

	Class499(int[] is) {
		((Class499) this).anIntArray5512 = is;
	}

	public boolean method320(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549, int i_0_) {
		int[] is = ((Class499) this).anIntArray5512;
		for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
			int i_2_ = is[i_1_];
			if (!class549.method6514(i_2_, (byte) 1))
				return false;
		}
		return true;
	}

	public boolean method321(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		int[] is = ((Class499) this).anIntArray5512;
		for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
			int i_4_ = is[i_3_];
			if (!class549.method6514(i_4_, (byte) 1))
				return false;
		}
		return true;
	}

	public boolean method322(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		int[] is = ((Class499) this).anIntArray5512;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is[i_5_];
			if (!class549.method6514(i_6_, (byte) 1))
				return false;
		}
		return true;
	}

	static final void method5947(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class624.method7453(class73, class83, class441, -1702864824);
	}
}
