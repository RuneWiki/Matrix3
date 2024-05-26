package game;

/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class395 {
	int anInt4679;
	static Class395 aClass395_4680 = new Class395(0);
	static Class395 aClass395_4681 = new Class395(1);

	Class395(int i) {
		((Class395) this).anInt4679 = i * -63398909;
	}

	static final void method4743(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Cs2Executor) class441).aClass572_Sub10_5104.aString9089;
	}

	static final void method4744(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]);
		((Cs2Executor) class441).objectStackPtr -= i_0_ * 1019967701;
		String string = Class572_Sub36.method8757((((Cs2Executor) class441).objectStack), (((Cs2Executor) class441).objectStackPtr * 1628307581), i_0_, -1377552235);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	public static Class651[] method4745(int i) {
		return (new Class651[] { Class651.aClass651_8387, Class651.aClass651_8379, Class651.aClass651_8381, Class651.aClass651_8382, Class651.aClass651_8378, Class651.aClass651_8384,
			Class651.aClass651_8385, Class651.aClass651_8388, Class651.aClass651_8383, Class651.aClass651_8380 });
	}

	static final void method4746(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, -1285726284));
		int i_2_;
		if (class631.aBool8190)
			i_2_ = class631.anInt8191 * 1466480703;
		else if (class631.aBool8143)
			i_2_ = Class586.aClass502_7779.anInt5553 * 813673117;
		else
			i_2_ = Class586.aClass502_7779.anInt5549 * -460148387;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_2_;
	}

	static Class315[] method4747(byte i) {
		return (new Class315[] { Class315.aClass315_3819, Class315.aClass315_3825, Class315.aClass315_3822, Class315.aClass315_3816, Class315.aClass315_3824, Class315.aClass315_3823,
			Class315.aClass315_3818, Class315.aClass315_3817, Class315.aClass315_3815, Class315.aClass315_3826, Class315.aClass315_3820, Class315.aClass315_3821 });
	}

	static final void method4748(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) 1158);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class492.method5865(class73, class83, class441, -1955987470);
	}
}
