package game;

/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class237 implements Interface26 {
	Class248 aClass248_2645;
	int anInt2646;

	public Class258 method142(int i) {
		return Class258.aClass258_2781;
	}

	public Class258 method144() {
		return Class258.aClass258_2781;
	}

	public Class258 method141() {
		return Class258.aClass258_2781;
	}

	public int method143() {
		if (((Class237) this).aClass248_2645.method3370(((((Class237) this).anInt2646) * -1498715105), 1664143695))
			return 100;
		return (((Class237) this).aClass248_2645.method3414(-1498715105 * ((Class237) this).anInt2646, (byte) 83));
	}

	Class237(Class248 class248, int i) {
		((Class237) this).aClass248_2645 = class248;
		((Class237) this).anInt2646 = i * -3600417;
	}

	public int method136(int i) {
		if (((Class237) this).aClass248_2645.method3370(((((Class237) this).anInt2646) * -1498715105), 1594194923))
			return 100;
		return (((Class237) this).aClass248_2645.method3414(-1498715105 * ((Class237) this).anInt2646, (byte) -44));
	}

	public Class258 method145() {
		return Class258.aClass258_2781;
	}

	static final void method3241(Cs2Executor class441, int i) {
		((Cs2Executor) class441).longStackPtr -= -1758429946;
		if ((((Cs2Executor) class441).longStack[1097105451 * ((Cs2Executor) class441).longStackPtr]) == (((Cs2Executor) class441).longStack[1 + 1097105451 * ((Cs2Executor) class441).longStackPtr]))
			((Cs2Executor) class441).instrPtr += ((((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]) * -1866055967);
	}

	static final void method3242(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		UnderlayDefinition underlayDefinition;
		if (((Cs2Executor) class441).aBool5128)
			underlayDefinition = ((Cs2Executor) class441).aClass443_5112;
		else
			underlayDefinition = ((Cs2Executor) class441).aClass443_5126;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = underlayDefinition.method5282(i_0_, -1, 1397696434) ? 1 : 0;
	}

	static final void method3243(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.exchangeSlots[i_1_].anInt7822 * -1994619175;
	}
}
