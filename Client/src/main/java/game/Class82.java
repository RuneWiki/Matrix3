package game;

/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82 {
	static final void method1248(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class82() throws Throwable {
		throw new Error();
	}

	static void method1249(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_1_, -522667221));
		if (class264.method3614(1783094145)) {
			String string = class264.aString2833;
			if (-1 == i_0_)
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = string;
			else
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = ((Class386) Class300.aClass635_Sub2_3488.getDefinition(i_0_, 707374073)).method4679(i_1_, string, -1521618742);
		} else {
			int i_2_ = -1132777561 * class264.anInt2832;
			if (-1 == i_0_)
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = i_2_;
			else
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = ((Class386) Class300.aClass635_Sub2_3488.getDefinition(i_0_, -380060827)).method4673(i_1_, i_2_, 771882558);
		}
	}

	static final void method1250(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_5_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_4_ == -1)
			throw new RuntimeException();
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_4_, 460576926));
		if (class645.aClass283_8314.getId(-846637439) != i_3_)
			throw new RuntimeException();
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class645.method7638(Integer.valueOf(i_5_), 295771630) ? 1 : 0;
	}

	static final void method1251(Cs2Executor class441, int i) {
		Class92.method1532(true, -613460782);
		Class301.method3994((byte) 34);
		client.aClass613_8605.method7302(-809658616);
		Class623.method7443(-1561384268);
		client.aBool8854 = false;
	}

	static final void method1252(Cs2Executor class441, int i) {
		Class216.method3080(Class114.method2096(90787897), class441, 898131798);
	}

	static final void method1253(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 961755777 * ((Cs2Executor) class441).current_clan.anInt4283;
	}

	static final void method1254(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_6_, -205146681));
		if (class631.anInt8171 * -1024768723 >= 0 && class631.anInt8173 * -1999842301 >= 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class631.anInt8173 * -1999842301;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_6_;
	}
}
