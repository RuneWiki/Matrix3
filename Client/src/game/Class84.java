package game;

/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84 {
	public int anInt1082;
	public int anInt1083;
	public int anInt1084;
	public int anInt1085;
	public int anInt1086;
	public int anInt1087;
	byte aByte1088;
	public int anInt1089;
	public int anInt1090;
	public int anInt1091;
	public Class84 aClass84_1092;
	public int anInt1093;
	public int anInt1094;
	public int anInt1095;
	public int anInt1096;
	public int anInt1097;

	Class84(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_) {
		anInt1091 = i * 702001099;
		anInt1084 = 1926081125 * i_0_;
		anInt1085 = i_1_ * -540925045;
		anInt1083 = 671948715 * i_2_;
		anInt1095 = 677302133 * i_3_;
		((Class84) this).aByte1088 = i_4_;
	}

	public Class308 method1266(Interface36 interface36, int i) {
		return interface36.method211(anInt1091 * -811893277, (byte) 30);
	}

	Class84 method1267(int i, int i_5_, int i_6_, int i_7_, byte i_8_) {
		return new Class84(-811893277 * anInt1091, i, i_5_, i_6_, i_7_, ((Class84) this).aByte1088);
	}

	static final void method1268(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_9_, (short) -1976);
		Class83 class83 = Class534.aClass83Array5975[i_9_ >> 16];
		Class420.method5132(class73, class83, class441, 955806845);
	}

	static final void method1269(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_10_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_11_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		method1271(i_10_, i_11_ >> 14 & 0x3fff, i_11_ & 0x3fff, false, -1405908684);
	}

	static final void method1270(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		float f = ((float) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) / 1000.0F);
		Class133_Sub1.aClass411_Sub1_9827.method5042(i_12_, f, -2065021689);
	}

	public static void method1271(int i, int i_13_, int i_14_, boolean bool, int i_15_) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547_Sub1.aClass572_Sub12_Sub5_6129;
		Class547_Sub1.method6508(i);
		Class547_Sub1.aBool6178 = false;
		if (Class547_Sub1.aClass572_Sub12_Sub5_6129 != class572_sub12_sub5)
			Class537.method6386(-2060825759);
		Class547_Sub1.anInt8985 = i_13_ * -199837503;
		Class547_Sub1.anInt8986 = i_14_ * 1145768149;
		Class547_Sub1.aBool8975 = bool;
	}
}
