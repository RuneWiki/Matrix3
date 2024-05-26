package game;

/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class465 {
	public static Class289 aClass289_5235 = null;
	static int anInt5236;

	public static void method5485() {
		if (aClass289_5235 != null) {
			aClass289_5235.method3895((byte) -61);
			aClass289_5235 = null;
		}
	}

	Class465() throws Throwable {
		throw new Error();
	}

	public static void method5486() {
		if (aClass289_5235 != null) {
			aClass289_5235.method3895((byte) -127);
			aClass289_5235 = null;
		}
	}

	public static void method5487() {
		if (aClass289_5235 != null) {
			aClass289_5235.method3895((byte) -47);
			aClass289_5235 = null;
		}
	}

	public static boolean method5488(int i, int i_0_) {
		if (null == aClass289_5235 || aClass289_5235.method3894(914459922) == null)
			return false;
		if (i == i_0_)
			return true;
		Class374 class374 = aClass289_5235.method3894(1263031400).method3955(i, 903601831);
		Class374 class374_1_ = aClass289_5235.method3894(1581744733).method3955(i_0_, -615267336);
		Class374 class374_2_ = class374;
		while_38_: do {
			do {
				if (class374_2_ == null)
					break while_38_;
				class374_2_ = class374_2_.method4611(1338581486);
				if (class374_2_ == class374_1_)
					return true;
			} while (class374 != class374_2_);
			return false;
		} while (false);
		class374_2_ = class374_1_;
		while_39_: do {
			do {
				if (class374_2_ == null)
					break while_39_;
				class374_2_ = class374_2_.method4611(1995079088);
				if (class374_2_ == class374)
					return true;
			} while (class374_2_ != class374_1_);
			return false;
		} while (false);
		return false;
	}

	public static boolean method5489(int i, int i_3_) {
		if (null == aClass289_5235 || aClass289_5235.method3894(1576366449) == null)
			return false;
		if (i == i_3_)
			return true;
		Class374 class374 = aClass289_5235.method3894(1838024703).method3955(i, -1835093480);
		Class374 class374_4_ = aClass289_5235.method3894(1869562032).method3955(i_3_, 1050640938);
		Class374 class374_5_ = class374;
		while_40_: do {
			do {
				if (class374_5_ == null)
					break while_40_;
				class374_5_ = class374_5_.method4611(985637362);
				if (class374_5_ == class374_4_)
					return true;
			} while (class374 != class374_5_);
			return false;
		} while (false);
		class374_5_ = class374_4_;
		while_41_: do {
			do {
				if (class374_5_ == null)
					break while_41_;
				class374_5_ = class374_5_.method4611(1955209674);
				if (class374_5_ == class374)
					return true;
			} while (class374_5_ != class374_4_);
			return false;
		} while (false);
		return false;
	}

	static final void method5490(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class460.method5465(class73, class441, (byte) -98);
	}

	static final void method5491(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (null == Class534.aClass83Array5975[i_6_])
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else {
			String string = (Class534.aClass83Array5975[i_6_].aClass73Array1081[0].aString748);
			if (null == string)
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = "";
			else
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = string.substring(0, string.indexOf(':'));
		}
	}

	static final void method5492(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		ScriptVarType.method3826(class73, class83, class441, -1322899622);
	}

	static final void method5493(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, short i) {
		class73.aBool725 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 8124);
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class38.method794(class73.selfId * -1718435171, -503341632);
	}
}
