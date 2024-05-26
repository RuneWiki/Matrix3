package game;

/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarDomainType implements Interface52 {
	public static VarDomainType aClass272_2884;
	public static VarDomainType NPC_CONFIGS;
	public static VarDomainType CLIENT_CONFIGS;
	static VarDomainType aClass272_2887;
	static VarDomainType aClass272_2888;
	public static VarDomainType PLAYER_CONFIGS = new Class272_Sub1(JS5ConfigGroup.aClass220_2570, 0, true, true);
	public static VarDomainType CLAN_CONFIGS;
	public static VarDomainType CLAN_SETTING_CONFIGS;
	static VarDomainType aClass272_2892;
	static VarDomainType aClass272_2893;
	static VarDomainType aClass272_2894;
	JS5ConfigGroup aClass220_2895;
	int anInt2896;
	static long aLong2897;

	Object method3667(VarDefinition class179) {
		return class179.dataType.getDefaultValue(1697142415);
	}

	VarDomainType(JS5ConfigGroup jS5ConfigGroup, int i, boolean bool, boolean bool_0_) {
		((VarDomainType) this).aClass220_2895 = jS5ConfigGroup;
		((VarDomainType) this).anInt2896 = i * 1697787583;
	}

	public final JS5ConfigGroup method3668(byte i) {
		return ((VarDomainType) this).aClass220_2895;
	}

	public int getId(int i) {
		return ((VarDomainType) this).anInt2896 * 523780415;
	}

	public int method43() {
		return ((VarDomainType) this).anInt2896 * 523780415;
	}

	static {
		NPC_CONFIGS = new Class272_Sub5(JS5ConfigGroup.aClass220_2571, 1, false, true);
		CLIENT_CONFIGS = new Class272_Sub3(JS5ConfigGroup.aClass220_2572, 2, true, true);
		aClass272_2887 = new Class272_Sub2(JS5ConfigGroup.aClass220_2573, 3, false, false);
		aClass272_2888 = new VarDomainType(JS5ConfigGroup.aClass220_2531, 4, false, false);
		aClass272_2893 = new VarDomainType(JS5ConfigGroup.aClass220_2575, 5, true, false);
		CLAN_CONFIGS = new VarDomainType(JS5ConfigGroup.aClass220_2525, 6, true, true);
		CLAN_SETTING_CONFIGS = new VarDomainType(JS5ConfigGroup.aClass220_2577, 7, true, false);
		aClass272_2892 = new Class272_Sub4(JS5ConfigGroup.aClass220_2578, 8, false, false);
		aClass272_2884 = new VarDomainType(JS5ConfigGroup.aClass220_2587, 9, false, true);
		aClass272_2894 = new VarDomainType(JS5ConfigGroup.aClass220_2584, 10, false, false);
	}

	public int method143() {
		return ((VarDomainType) this).anInt2896 * 523780415;
	}

	public Object method3669(VarDefinition class179, byte i) {
		if (class179.isTemp)
			return method3672(class179, 65280);
		return class179.dataType.getDefaultValue(1697142415);
	}

	public int method45() {
		return ((VarDomainType) this).anInt2896 * 523780415;
	}

	public int method61() {
		return ((VarDomainType) this).anInt2896 * 523780415;
	}

	Object method3670(VarDefinition class179) {
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3671(VarDefinition class179) {
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3672(VarDefinition class179, int i) {
		return class179.dataType.getDefaultValue(1697142415);
	}

	public static VarDomainType[] method3673(byte i) {
		return new VarDomainType[] { CLIENT_CONFIGS, CLAN_SETTING_CONFIGS, aClass272_2884, aClass272_2893, aClass272_2894, aClass272_2888, CLAN_CONFIGS, aClass272_2892, PLAYER_CONFIGS, aClass272_2887,
			NPC_CONFIGS };
	}

	static final void method3674(Cs2Executor class441, int i) {
		int i_2_ = ((((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]) >> 16);
		int i_3_ = ((((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]) & 0xffff);
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_4_ < 0 || i_4_ > 5000)
			throw new RuntimeException();
		((Cs2Executor) class441).globalArrayLengths[i_2_] = i_4_;
		int i_5_ = -1;
		if (i_3_ == ScriptVarType.aClass283_3282.getId(1491827967))
			i_5_ = 0;
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
			((Cs2Executor) class441).globalArrays[i_2_][i_6_] = i_5_;
	}

	static final void method3675(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.aString747 = null;
		class73.aClass68_905 = null;
	}

	static final void method3676(Cs2Executor class441, int i) {
		((Cs2Executor) class441).aClass305_5105 = new Class305();
		((Cs2Executor) class441).aClass305_5105.anInt3541 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -745166955;
		((Cs2Executor) class441).aClass305_5105.aClass572_Sub12_Sub15_3540 = Class111.aClass244_1428.method3345((-1986499651 * (((Cs2Executor) class441).aClass305_5105.anInt3541)), 619951188);
		((Cs2Executor) class441).aClass305_5105.anIntArray3539 = new int[((Cs2Executor) class441).aClass305_5105.aClass572_Sub12_Sub15_3540.method10419((byte) -42)];
	}

	static final void method3677(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method3678(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -5961);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class111.method2077(class73, class83, class441, 2135098484);
	}
}
