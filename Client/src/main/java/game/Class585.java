package game;

/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class585 {
	static Interface67 anInterface67_7773;

	Class585() throws Throwable {
		throw new Error();
	}

	public static boolean method6951() {
		return anInterface67_7773 != null;
	}

	public static boolean method6952() {
		return anInterface67_7773 != null;
	}

	public static boolean method6953() {
		return anInterface67_7773 != null;
	}

	static final void method6954(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = i_1_ >> 14 & 0x3fff;
		int i_3_ = i_1_ & 0x3fff;
		int i_4_ = Class446.method5340(i_0_, i_2_, i_3_, -1166171536);
		if (i_4_ < 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_4_;
	}

	static final void method6955(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) 4974);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class297.method3970(class73, class83, class441, (byte) -93);
	}
}
