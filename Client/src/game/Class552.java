package game;

import vartracker.Cs2Tracker;

/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class552 {
	static int method6541(int i, int i_0_) {
		if (9 == i_0_)
			i = i + 1 & 0x3;
		if (10 == i_0_)
			i = i + 3 & 0x3;
		if (i_0_ == 11)
			i = 3 + i & 0x3;
		return i;
	}

	Class552() throws Throwable {
		throw new Error();
	}

	static int method6542(int i, int i_1_) {
		if (9 == i_1_)
			i = i + 1 & 0x3;
		if (10 == i_1_)
			i = i + 3 & 0x3;
		if (i_1_ == 11)
			i = 3 + i & 0x3;
		return i;
	}

	static int method6543(int i, int i_2_) {
		if (9 == i_2_)
			i = i + 1 & 0x3;
		if (10 == i_2_)
			i = i + 3 & 0x3;
		if (i_2_ == 11)
			i = 3 + i & 0x3;
		return i;
	}

	static int method6544(int i) {
		if (9 == i || i == 10)
			return 1;
		if (i == 11)
			return 8;
		return i;
	}

	static int method6545(int i, int i_3_) {
		if (9 == i_3_)
			i = i + 1 & 0x3;
		if (10 == i_3_)
			i = i + 3 & 0x3;
		if (i_3_ == 11)
			i = 3 + i & 0x3;
		return i;
	}

	static final void method6546(Cs2Executor class441, byte i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) 10895);
		Class83 class83 = Class534.aClass83Array5975[i_4_ >> 16];
		Class315.method4073(class73, class83, class441, (byte) -82);
	}

	static final void method6547(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_5_ ^ 0xffffffff;
	}

	static final void method6548(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub31_9228.method9143(-1342723572) ? 1 : 0;
	}

	static final void method6549(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831) && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831.aBool5314)) ? 1 : 0;
	}

	static final void method6550(Cs2Executor class441, int i) {
		Class583 class583 = ((Cs2Executor) class441).entity.method10567(-2129758684);
		if (class583 == null)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class583.method6881(402542489);
	}

	public static void method6551(int i, int i_6_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(23, (long) i);
		class572_sub12_sub11.method10384(-1907842635);
	}

	static final void method6552(Cs2Executor class441, int i) {
		VarBitDefinition def = (VarBitDefinition) (((Cs2Executor) class441).current.anObjectArray11384[((Cs2Executor) class441).instrPtr * -1280867039]);
		IVarDomain domain = ((IVarDomain) ((((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]) == 0 ? ((Cs2Executor) class441).main_configs_map.get(def.baseVar.domain) : ((Cs2Executor) class441).playerentity_configs_map.get(def.baseVar.domain)));
		int value = domain.method72(def, 1569860337);
		Cs2Tracker.trackRead(class441, def, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = value;
	}
}
