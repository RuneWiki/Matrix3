package game;

/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class534 implements Interface52, Interface63 {
	public static Class534 aClass534_5969;
	public static Class534 aClass534_5970;
	public static Class534 aClass534_5971 = new Class534(0, "", new ScriptVarType[] { ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3261 });
	static Class534 aClass534_5972;
	int anInt5973;
	ScriptVarType[] aClass283Array5974;
	public static Class83[] aClass83Array5975;

	Class534(int i, String string, ScriptVarType[] class283s) {
		((Class534) this).anInt5973 = -1238700865 * i;
		((Class534) this).aClass283Array5974 = class283s;
		ScriptVarType[] class283s_0_ = ((Class534) this).aClass283Array5974;
		for (int i_1_ = 0; i_1_ < class283s_0_.length; i_1_++) {
			ScriptVarType class283 = class283s_0_[i_1_];
			switch (1433734045 * class283.aClass609_3406.anInt7961) {
				case 3:
					break;
				case 2:
					break;
				case 1:
					break;
			}
		}
	}

	public int getId(int i) {
		return ((Class534) this).anInt5973 * -1137278145;
	}

	public int method143() {
		return ((Class534) this).anInt5973 * -1137278145;
	}

	static {
		aClass534_5969 = new Class534(1, "", new ScriptVarType[] { ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3282 });
		aClass534_5970 = new Class534(2, "", new ScriptVarType[] { ScriptVarType.aClass283_3261, ScriptVarType.aClass283_3261 });
		aClass534_5972 = new Class534(3, "", new ScriptVarType[] { ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3261 });
	}

	public int method45() {
		return ((Class534) this).anInt5973 * -1137278145;
	}

	public int method43() {
		return ((Class534) this).anInt5973 * -1137278145;
	}

	public int method61() {
		return ((Class534) this).anInt5973 * -1137278145;
	}

	static final void method6369(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass15_11655.method645(-1083174564);
	}

	static final void method6370(Cs2Executor class441, byte i) {
		Class572_Sub19 class572_sub19 = Class411.method5046(-858992181);
		if (class572_sub19 == null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 295399623 * class572_sub19.anInt9142;
			int i_2_ = (class572_sub19.anInt9139 * -824779163 << 28 | (-1389911785 * class572_sub19.anInt9140 + Class547.anInt6143) << 14 | (599105849 * class572_sub19.anInt9141 + Class547.anInt6165));
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_2_;
		}
	}

	static final void method6371(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class556.method6586(class73, class83, class441, -1713556277);
	}

	static final void method6372(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt834 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -774268665;
		Class555.method6575(class73, (short) 20484);
	}

	static void method6373(Entity class456_sub1_sub2_sub3, int i, int i_3_, int i_4_, byte i_5_) {
		Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) 0);
		Class663_Sub2 class663_sub2 = class456_sub1_sub2_sub3.aClass663_Sub2_11631;
		int i_6_ = ((478165057 * class456_sub1_sub2_sub3.anInt11654 - 452190977 * class456_sub1_sub2_sub3.aClass15_11655.anInt125) & 0x3fff);
		if (Class453.aClass453_5176.aByte5183 == i) {
			if (i_6_ != 0 || -525318279 * class456_sub1_sub2_sub3.anInt11652 > 25) {
				if (i_4_ < 0 && -1 != -1303582335 * class538.anInt6020) {
					class663_sub2.method7791(-1303582335 * class538.anInt6020, false, true, (byte) 66);
					class663_sub2.aBool9556 = false;
				} else if (i_4_ > 0 && -1822530747 * class538.anInt6037 != -1) {
					class663_sub2.method7791(-1822530747 * class538.anInt6037, false, true, (byte) 59);
					class663_sub2.aBool9556 = false;
				} else if (!class663_sub2.aBool9556 || !(class538.method6388(class663_sub2.method7795(-1478180242), (byte) -86))) {
					class663_sub2.method7791(class538.method6394(531552520), false, true, (byte) 104);
					class663_sub2.aBool9556 = class456_sub1_sub2_sub3.aClass663_Sub2_11631.method7786(-485805504);
				}
			} else if (!class663_sub2.aBool9556 || !class538.method6388(class663_sub2.method7795(-1478180242), (byte) 46)) {
				class663_sub2.method7791(class538.method6394(948520462), false, true, (byte) 79);
				class663_sub2.aBool9556 = class663_sub2.method7786(732714469);
			}
		} else if (class456_sub1_sub2_sub3.anInt11619 * -1639699965 != -1 && (i_6_ >= 10240 || i_6_ <= 2048)) {
			int i_7_ = ((client.anIntArray8735[i_3_] - (class456_sub1_sub2_sub3.aClass15_11655.anInt125 * 452190977)) & 0x3fff);
			if (i == Class453.aClass453_5179.aByte5183 && class538.anInt6026 * -182549727 != -1) {
				if (i_7_ > 2048 && i_7_ <= 6144 && -1 != -1871450263 * class538.anInt6019)
					class663_sub2.method7791(-1871450263 * class538.anInt6019, false, true, (byte) 2);
				else if (i_7_ >= 10240 && i_7_ < 14336 && -1 != class538.anInt6028 * -1351448577)
					class663_sub2.method7791(-1351448577 * class538.anInt6028, false, true, (byte) 113);
				else if (i_7_ > 6144 && i_7_ < 10240 && class538.anInt6027 * -1172829509 != -1)
					class663_sub2.method7791(class538.anInt6027 * -1172829509, false, true, (byte) 35);
				else
					class663_sub2.method7791(-182549727 * class538.anInt6026, false, true, (byte) 121);
			} else if (Class453.aClass453_5182.aByte5183 == i && class538.anInt6030 * -1506072601 != -1) {
				if (i_7_ > 2048 && i_7_ <= 6144 && -1 != class538.anInt6033 * 1541680687)
					class663_sub2.method7791(1541680687 * class538.anInt6033, false, true, (byte) 7);
				else if (i_7_ >= 10240 && i_7_ < 14336 && class538.anInt6032 * -500215193 != -1)
					class663_sub2.method7791(class538.anInt6032 * -500215193, false, true, (byte) 102);
				else if (i_7_ > 6144 && i_7_ < 10240 && -1 != 1966431491 * class538.anInt6031)
					class663_sub2.method7791(class538.anInt6031 * 1966431491, false, true, (byte) 20);
				else
					class663_sub2.method7791(-1506072601 * class538.anInt6030, false, true, (byte) 57);
			} else if (i_7_ > 2048 && i_7_ <= 6144 && -1 != class538.anInt6021 * -295174137)
				class663_sub2.method7791(class538.anInt6021 * -295174137, false, true, (byte) 11);
			else if (i_7_ >= 10240 && i_7_ < 14336 && 677627435 * class538.anInt6024 != -1)
				class663_sub2.method7791(677627435 * class538.anInt6024, false, true, (byte) 18);
			else if (i_7_ > 6144 && i_7_ < 10240 && class538.anInt6023 * -312349503 != -1)
				class663_sub2.method7791(class538.anInt6023 * -312349503, false, true, (byte) 33);
			else
				class663_sub2.method7791(-915509001 * class538.anInt6058, false, true, (byte) 85);
			class663_sub2.aBool9556 = false;
		} else if (i_6_ != 0 || -525318279 * class456_sub1_sub2_sub3.anInt11652 > 25) {
			if (i == Class453.aClass453_5179.aByte5183 && -1 != -182549727 * class538.anInt6026) {
				if (i_4_ < 0 && -1 != class538.anInt6036 * -1461742301)
					class663_sub2.method7791(-1461742301 * class538.anInt6036, false, true, (byte) 94);
				else if (i_4_ > 0 && 589890697 * class538.anInt6056 != -1)
					class663_sub2.method7791(589890697 * class538.anInt6056, false, true, (byte) 84);
				else
					class663_sub2.method7791(class538.anInt6026 * -182549727, false, true, (byte) 46);
			} else if (Class453.aClass453_5182.aByte5183 == i && -1 != class538.anInt6030 * -1506072601) {
				if (i_4_ < 0 && -1 != 1450482437 * class538.anInt6034)
					class663_sub2.method7791(class538.anInt6034 * 1450482437, false, true, (byte) 85);
				else if (i_4_ > 0 && -1 != class538.anInt6057 * 1861949949)
					class663_sub2.method7791(class538.anInt6057 * 1861949949, false, true, (byte) 76);
				else
					class663_sub2.method7791(-1506072601 * class538.anInt6030, false, true, (byte) 37);
			} else if (i_4_ < 0 && class538.anInt6038 * 167879693 != -1)
				class663_sub2.method7791(167879693 * class538.anInt6038, false, true, (byte) 20);
			else if (i_4_ > 0 && -1569809555 * class538.anInt6039 != -1)
				class663_sub2.method7791(-1569809555 * class538.anInt6039, false, true, (byte) 47);
			else
				class663_sub2.method7791(class538.anInt6058 * -915509001, false, true, (byte) 24);
			class663_sub2.aBool9556 = false;
		} else {
			if (i == Class453.aClass453_5179.aByte5183 && class538.anInt6026 * -182549727 != -1)
				class663_sub2.method7791(-182549727 * class538.anInt6026, false, true, (byte) 122);
			else if (Class453.aClass453_5182.aByte5183 == i && -1506072601 * class538.anInt6030 != -1)
				class663_sub2.method7791(-1506072601 * class538.anInt6030, false, true, (byte) 21);
			else
				class663_sub2.method7791(class538.anInt6058 * -915509001, false, true, (byte) 72);
			class663_sub2.aBool9556 = false;
		}
	}

	public static final int method6374(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_8_ = 0; i_8_ < client.anInt8865 * 351572371; i_8_++) {
			if (string.equalsIgnoreCase(client.aClass23Array8650[i_8_].aString153))
				return i_8_;
		}
		return -1;
	}

	static final void method6375(Class572_Sub34 class572_sub34, boolean bool, byte i) {
		if (((Class572_Sub34) class572_sub34).aBool9344) {
			if (((Class572_Sub34) class572_sub34).anInt9347 * -1776451513 < 0 || (Class301.method3999(client.aClass613_8605.method7288(691912900), -1776451513 * ((Class572_Sub34) class572_sub34).anInt9347, -605142647 * ((Class572_Sub34) class572_sub34).anInt9338, -1287496742))) {
				if (!bool)
					Class151.method2505((((Class572_Sub34) class572_sub34).anInt9335 * -2045257115), (-451769195 * ((Class572_Sub34) class572_sub34).anInt9333), class572_sub34.anInt9334 * 163944051, class572_sub34.anInt9332 * 254036161, (((Class572_Sub34) class572_sub34).anInt9347 * -1776451513), (-379295487 * ((Class572_Sub34) class572_sub34).anInt9337), (((Class572_Sub34) class572_sub34).anInt9338 * -605142647), -1, 0, (byte) 29);
				else
					Class23.method710(-2045257115 * ((Class572_Sub34) class572_sub34).anInt9335, -451769195 * ((Class572_Sub34) class572_sub34).anInt9333, 163944051 * class572_sub34.anInt9334, 254036161 * class572_sub34.anInt9332, null, (byte) -27);
				class572_sub34.method6794((byte) 54);
			}
		} else if (((Class572_Sub34) class572_sub34).aBool9340 && 163944051 * class572_sub34.anInt9334 >= 1 && 254036161 * class572_sub34.anInt9332 >= 1 && (163944051 * class572_sub34.anInt9334 <= client.aClass613_8605.method7347(-1440800188) - 2) && (class572_sub34.anInt9332 * 254036161 <= client.aClass613_8605.method7278(277214477) - 2) && (class572_sub34.anInt9339 * 1989941229 < 0 || (Class301.method3999(client.aClass613_8605.method7288(-931932077), 1989941229 * class572_sub34.anInt9339, (((Class572_Sub34) class572_sub34).anInt9341 * 363530357), -1287496742)))) {
			if (!bool)
				Class151.method2505(((Class572_Sub34) class572_sub34).anInt9335 * -2045257115, -451769195 * ((Class572_Sub34) class572_sub34).anInt9333, class572_sub34.anInt9334 * 163944051, 254036161 * class572_sub34.anInt9332, 1989941229 * class572_sub34.anInt9339, 975125487 * class572_sub34.anInt9343, 363530357 * ((Class572_Sub34) class572_sub34).anInt9341, -1, 0, (byte) 124);
			else
				Class23.method710(-2045257115 * ((Class572_Sub34) class572_sub34).anInt9335, -451769195 * ((Class572_Sub34) class572_sub34).anInt9333, class572_sub34.anInt9334 * 163944051, 254036161 * class572_sub34.anInt9332, ((Class572_Sub34) class572_sub34).aClass508_9342, (byte) -40);
			((Class572_Sub34) class572_sub34).aBool9340 = false;
			if (!bool && (class572_sub34.anInt9339 * 1989941229 == (((Class572_Sub34) class572_sub34).anInt9347 * -1776451513)) && -1 == (-1776451513 * ((Class572_Sub34) class572_sub34).anInt9347))
				class572_sub34.method6794((byte) 0);
			else if (!bool && (class572_sub34.anInt9339 * 1989941229 == (((Class572_Sub34) class572_sub34).anInt9347 * -1776451513)) && (((Class572_Sub34) class572_sub34).anInt9337 * -379295487) == class572_sub34.anInt9343 * 975125487 && ((363530357 * ((Class572_Sub34) class572_sub34).anInt9341) == (-605142647 * ((Class572_Sub34) class572_sub34).anInt9338)))
				class572_sub34.method6794((byte) -18);
		}
	}
}
