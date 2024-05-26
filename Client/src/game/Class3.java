package game;

/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3 {
	static String aString22;
	public static String aString23;
	static String aString24;
	public static String aString25;
	static String aString26;
	static String aString27;
	static String aString28;
	static String aString29 = "true";

	static {
		aString23 = ",";
		aString24 = " (";
		aString28 = ")";
		aString26 = "->";
		aString27 = "127.0.0.1";
		aString25 = "<br>";
		aString22 = "</col>";
	}

	Class3() throws Throwable {
		throw new Error();
	}

	public static String method478(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public static String method479(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method480(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class572_Sub12_Sub13 class572_sub12_sub13 = Class409.method4941(i_0_, i_1_, -1183439126);
		if (class572_sub12_sub13 != null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub13.anInt11459 * 1509288629;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -406403405 * class572_sub12_sub13.anInt11454;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub13.anInt11453 * -531072985;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (null != class572_sub12_sub13.aString11457 ? class572_sub12_sub13.aString11457 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11458 != null ? class572_sub12_sub13.aString11458 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11460 != null ? class572_sub12_sub13.aString11460 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (null != class572_sub12_sub13.aString11461 ? class572_sub12_sub13.aString11461 : "");
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1338864731 * class572_sub12_sub13.anInt11456;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (null != class572_sub12_sub13.aString11462 ? class572_sub12_sub13.aString11462 : "");
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}

	static final void method481(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class512.method6083(i_2_, (short) 4288);
		Class411_Sub1.method9572(Class534.aClass83Array5975[i_2_ >>> 16], i_2_ & 0xffff, i_3_, i_4_, ((Cs2Executor) class441).aBool5128, class441, (byte) 10);
	}

	static final void method482(Cs2Executor class441, int i) {
		if (client.anInt8580 * 835742603 == 15) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3740, client.aClass195_8632.aClass650_2340, 1017795035);
			client.aClass195_8632.method2929(class572_sub25, (byte) -7);
		}
	}

	static GameTask method483(byte i) {
		GameTask class572_sub12_sub11 = ((GameTask) GameTask.aClass664_11429.method7848(-1042067865));
		if (null != class572_sub12_sub11) {
			class572_sub12_sub11.method6794((byte) -78);
			class572_sub12_sub11.method8412(724585842);
			return class572_sub12_sub11;
		}
		for (;;) {
			class572_sub12_sub11 = (GameTask) GameTask.aClass664_11430.method7848(-1042067865);
			if (class572_sub12_sub11 == null)
				return null;
			if (class572_sub12_sub11.method10337(413629173) > Class69.method1067(-1813522162))
				return null;
			class572_sub12_sub11.method6794((byte) 55);
			class572_sub12_sub11.method8412(724585842);
			if ((-1521258394346526139L * class572_sub12_sub11.aLong9093 & ~0x7fffffffffffffffL) != 0L)
				return class572_sub12_sub11;
		}
	}

	static final void method484(Cs2Executor class441, int i) {
		VarDefinition.method2777(class441, (byte) 28);
	}
}
