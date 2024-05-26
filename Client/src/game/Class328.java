package game;

import vartracker.Cs2Tracker;

/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class328 {
	static Class328 aClass328_4166;
	static Class328 aClass328_4167;
	static Class328 aClass328_4168;
	static Class328 aClass328_4169;
	static Class328 aClass328_4170;
	static Class328 aClass328_4171;
	static Class328 aClass328_4172;
	static Class328 aClass328_4173;
	static Class328 aClass328_4174;
	static Class328 aClass328_4175;
	static Class328 aClass328_4176;
	static Class328 aClass328_4177;
	static Class328 aClass328_4178;
	static Class328 aClass328_4179;
	static Class328 aClass328_4180;
	static Class328 aClass328_4181;
	static Class328 aClass328_4182;
	static Class328 aClass328_4183;
	static Class328 aClass328_4184;
	static Class328 aClass328_4185;
	public static Class328 aClass328_4186;
	static Class328 aClass328_4187;
	static Class328 aClass328_4188;
	static Class328 aClass328_4189;
	static Class328 aClass328_4190;
	public static Class328 aClass328_4191;
	static Class328 aClass328_4192;
	static Class328 aClass328_4193;
	static Class328 aClass328_4194;
	static Class328 aClass328_4195;
	static Class328 aClass328_4196;
	static Class328 aClass328_4197;
	static Class328 aClass328_4198;
	static Class328 aClass328_4199;
	public String aString4200;
	static Class328 aClass328_4201;
	static Class328 aClass328_4202;
	static Class328 aClass328_4203;
	static Class328 aClass328_4204;
	static Class328 aClass328_4205;
	static Class328 aClass328_4206;
	static Class328 aClass328_4207;
	static Class328 aClass328_4208 = new Class328("11", "11");
	public static Class196[] aClass196Array4209;

	Class328(String string, String string_0_) {
		aString4200 = string_0_;
	}

	static {
		aClass328_4167 = new Class328("38", "38");
		aClass328_4168 = new Class328("2", "2");
		aClass328_4169 = new Class328("30", "30");
		aClass328_4194 = new Class328("12", "12");
		aClass328_4171 = new Class328("39", "39");
		aClass328_4172 = new Class328("33", "33");
		aClass328_4173 = new Class328("34", "34");
		aClass328_4187 = new Class328("3", "3");
		aClass328_4175 = new Class328("27", "27");
		aClass328_4197 = new Class328("20", "20");
		aClass328_4203 = new Class328("25", "25");
		aClass328_4178 = new Class328("14", "14");
		aClass328_4179 = new Class328("41", "41");
		aClass328_4180 = new Class328("10", "10");
		aClass328_4181 = new Class328("26", "26");
		aClass328_4182 = new Class328("6", "6");
		aClass328_4190 = new Class328("16", "16");
		aClass328_4184 = new Class328("4", "4");
		aClass328_4191 = new Class328("7", "7");
		aClass328_4186 = new Class328("21", "21");
		aClass328_4176 = new Class328("29", "29");
		aClass328_4188 = new Class328("9", "9");
		aClass328_4189 = new Class328("5", "5");
		aClass328_4207 = new Class328("43", "43");
		aClass328_4174 = new Class328("35", "35");
		aClass328_4192 = new Class328("31", "31");
		aClass328_4193 = new Class328("24", "24");
		aClass328_4166 = new Class328("1", "1");
		aClass328_4177 = new Class328("32", "32");
		aClass328_4196 = new Class328("23", "23");
		aClass328_4185 = new Class328("18", "18");
		aClass328_4198 = new Class328("8", "8");
		aClass328_4199 = new Class328("13", "13");
		aClass328_4195 = new Class328("28", "28");
		aClass328_4201 = new Class328("42", "42");
		aClass328_4202 = new Class328("37", "37");
		aClass328_4206 = new Class328("36", "36");
		aClass328_4204 = new Class328("40", "40");
		aClass328_4205 = new Class328("22", "22");
		aClass328_4183 = new Class328("17", "17");
		aClass328_4170 = new Class328("15", "15");
	}

	static final void method4151(Cs2Executor class441, int i) {
		VarDefinition var = (VarDefinition) (((Cs2Executor) class441).current.anObjectArray11384[-1280867039 * ((Cs2Executor) class441).instrPtr]);
		IVarDomain domain = ((IVarDomain) ((((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]) == 0 ? ((Cs2Executor) class441).main_configs_map.get(var.domain) : ((Cs2Executor) class441).playerentity_configs_map.get(var.domain)));
		BaseVarType type = var.dataType.getBaseType(129419978);
		if (type == BaseVarType.INT_T) {
			if (VarDomainType.CLIENT_CONFIGS == var.domain)
				Class86.method1280(var, (byte) 8);
			int value = (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
			domain.method76(var, value, (short) 255);
			Cs2Tracker.trackWrite(class441, var, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
		} else if (BaseVarType.LONG_T == type) {
			long value = (((Cs2Executor) class441).longStack[(((Cs2Executor) class441).longStackPtr -= -879214973) * 1097105451]);
			domain.method78(var, value);
			Cs2Tracker.trackWrite(class441, var, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
		} else if (BaseVarType.STRING_T == type) {
			if (VarDomainType.CLIENT_CONFIGS == var.domain)
				Class133_Sub19.method9534(var, (byte) -19);
			Object value = (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
			domain.method80(var, value, -30259456);
			Cs2Tracker.trackWrite(class441, var, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
		} else
			throw new RuntimeException();
	}

	static final void method4152(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class25.anInt172 * 357782167;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 234065809 * Class25.anInt173;
	}

	static final void method4153(Cs2Executor class441, byte i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -69) != Class416.aClass416_4933)
			throw new RuntimeException();
		((Class658_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8926((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), -1132982510);
	}

	static final void method4154(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub33_9238, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1593517905);
		Class623.method7443(-1420381115);
	}

	static void method4155(int i, int i_1_, InterfaceDefinitions class73, Class167 class167, int i_2_, int i_3_, short i_4_) {
		int i_5_ = 1657484935 * Class184.anInt2163;
		int[] is = Class184.anIntArray2154;
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_6_]];
			if (null != class456_sub1_sub2_sub3_sub2 && class456_sub1_sub2_sub3_sub2.method10700((byte) -22) && !class456_sub1_sub2_sub3_sub2.visible && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != class456_sub1_sub2_sub3_sub2) && (class456_sub1_sub2_sub3_sub2.aByte9009 == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009))) {
				Class240 class240 = class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647;
				int i_7_ = (int) class240.aFloat2653 / 128 - i / 128;
				int i_8_ = (int) class240.aFloat2657 / 128 - i_1_ / 128;
				boolean bool = false;
				for (int i_9_ = 0; i_9_ < client.anInt8860 * 681720871; i_9_++) {
					Class26 class26 = client.aClass26Array8863[i_9_];
					if (class456_sub1_sub2_sub3_sub2.username.equals(class26.aString209) && class26.anInt207 * 1870287645 != 0) {
						bool = true;
						break;
					}
				}
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641; i_11_++) {
					if (class456_sub1_sub2_sub3_sub2.username.equals(aClass196Array4209[i_11_].aString2349)) {
						bool_10_ = true;
						break;
					}
				}
				boolean bool_12_ = false;
				if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11829 * 1023599805) != 0 && (class456_sub1_sub2_sub3_sub2.anInt11829 * 1023599805 != 0) && ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11829 * 1023599805) == (1023599805 * class456_sub1_sub2_sub3_sub2.anInt11829)))
					bool_12_ = true;
				if (class456_sub1_sub2_sub3_sub2.aClass474_11831 != null && -1 != (class456_sub1_sub2_sub3_sub2.aClass474_11831.anInt5319) * -1560513359 && ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition((class456_sub1_sub2_sub3_sub2.aClass474_11831.anInt5319) * -1560513359, 601869971))).aBool4859)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[1], -865093257);
				else if (class456_sub1_sub2_sub3_sub2.aClass47_11837 == Class47.aClass47_469)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[8], -865093257);
				else if (class456_sub1_sub2_sub3_sub2.aClass47_11837 == Class47.aClass47_468)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[6], -865093257);
				else if (bool_12_)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[4], -865093257);
				else if (class456_sub1_sub2_sub3_sub2.isClanMember)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[7], -865093257);
				else if (bool)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[3], -865093257);
				else if (bool_10_)
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[5], -865093257);
				else
					Class561.method6631(class73, class167, i_2_, i_3_, i_7_, i_8_, Class628_Sub1.aClass161Array9537[2], -865093257);
			}
		}
	}
}
