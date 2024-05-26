package game;

/* Class272_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class272_Sub3 extends VarDomainType {
	Object method3667(VarDefinition class179) {
		if (class179.dataType == ScriptVarType.aClass283_3282 || ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3672(VarDefinition class179, int i) {
		if (class179.dataType == ScriptVarType.aClass283_3282 || ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3670(VarDefinition class179) {
		if (class179.dataType == ScriptVarType.aClass283_3282 || ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Class272_Sub3(JS5ConfigGroup jS5ConfigGroup, int i, boolean bool, boolean bool_0_) {
		super(jS5ConfigGroup, i, bool, bool_0_);
	}

	Object method3671(VarDefinition class179) {
		if (class179.dataType == ScriptVarType.aClass283_3282 || ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	public static void method8879(Class161[] class161s, int i) {
		Class133_Sub2.anInt9829 = class161s.length * -493642347;
		Class44.aClass161Array443 = new Class161[10 + Class133_Sub2.anInt9829 * -1283603011];
		Class103.anIntArray1384 = new int[Class133_Sub2.anInt9829 * -1283603011 + 10];
		System.arraycopy(class161s, 0, Class44.aClass161Array443, 0, Class133_Sub2.anInt9829 * -1283603011);
		for (int i_1_ = 0; i_1_ < Class133_Sub2.anInt9829 * -1283603011; i_1_++)
			Class103.anIntArray1384[i_1_] = Class44.aClass161Array443[i_1_].method2589();
		for (int i_2_ = -1283603011 * Class133_Sub2.anInt9829; i_2_ < Class44.aClass161Array443.length; i_2_++)
			Class103.anIntArray1384[i_2_] = 12;
	}

	static void method8880(InterfaceDefinitions class73, Class167 class167, int i, int i_3_, int i_4_, int i_5_, int i_6_, String string, Class102 class102, Class284 class284, int i_7_, byte i_8_) {
		int i_9_;
		if (1 == Class18.anInt143 * 625220759)
			i_9_ = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) + -777638353 * client.anInt8766) & 0x3fff;
		else if (6 == Class18.anInt143 * 625220759)
			i_9_ = (int) client.aFloat8678 & 0x3fff;
		else
			i_9_ = (client.anInt8766 * -777638353 + (int) client.aFloat8678 & 0x3fff);
		int i_10_ = (Math.max(class73.anInt764 * 669238293 / 2, class73.anInt765 * 1360982075 / 2) + 10);
		int i_11_ = i_5_ * i_5_ + i_4_ * i_4_;
		if (i_11_ <= i_10_ * i_10_) {
			int i_12_ = Class325.anIntArray4103[i_9_];
			int i_13_ = Class325.anIntArray4105[i_9_];
			if (6 != Class18.anInt143 * 625220759) {
				i_12_ = i_12_ * 256 / (256 + -1034566343 * client.anInt8670);
				i_13_ = i_13_ * 256 / (256 + -1034566343 * client.anInt8670);
			}
			int i_14_ = i_5_ * i_12_ + i_13_ * i_4_ >> 14;
			int i_15_ = i_13_ * i_5_ - i_4_ * i_12_ >> 14;
			int i_16_ = class284.method3835(string, 100, null, -1314463536);
			int i_17_ = class284.method3830(string, 100, 0, null, (byte) 4);
			i_14_ -= i_16_ / 2;
			if (i_14_ >= -(669238293 * class73.anInt764) && i_14_ <= 669238293 * class73.anInt764 && i_15_ >= -(class73.anInt765 * 1360982075) && i_15_ <= 1360982075 * class73.anInt765)
				class102.method1613(string, (i_14_ + i + class73.anInt764 * 669238293 / 2), (i_3_ + class73.anInt765 * 1360982075 / 2 - i_15_ - i_6_ - i_17_), i_16_, 50, i_7_, 0, 1, 0, 0, null, null, class167, i, i_3_, (byte) 97);
		}
	}

	static final void method8881(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloat8822 >> 3;
	}
}
