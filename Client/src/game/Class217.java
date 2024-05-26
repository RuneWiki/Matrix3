package game;

/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class217 {
	public static final int anInt2504 = 15;
	public static final int anInt2505 = 15;
	public static final int anInt2506 = 32768;

	Class217() throws Throwable {
		throw new Error();
	}

	static Cs2Script method3081(int i, byte i_0_) {
		Cs2Script class572_sub12_sub8 = ((Cs2Script) Class477.aClass131_5333.method2283((long) i));
		if (class572_sub12_sub8 != null)
			return class572_sub12_sub8;
		byte[] is = Class438.aClass248_5080.getFile(i, 0, 1895594600);
		if (is == null || is.length <= 1)
			return null;
		try {
			class572_sub12_sub8 = MusicVolume.method2202(is, (byte) -22);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		Class477.aClass131_5333.method2284(class572_sub12_sub8, (long) i);
		return class572_sub12_sub8;
	}

	static final void method3082(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		class73.anInt907 = -2060929823 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		class73.anInt910 = (1456939721 * (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]));
		class73.anInt911 = ((((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 1512326225);
		class73.anInt912 = 484506259 * (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class555.method6575(class73, (short) 32466);
	}

	static final void method3083(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class562.method6634(class73, class83, class441, -208336140);
	}

	static final void method3084(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -18919);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class121.method2182(class73, class83, class441, (short) -12190);
	}

	static final void method3085(Cs2Executor class441, byte i) {
		if (Class440.aClass334_5097 != null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
			((Cs2Executor) class441).current_clan = Class440.aClass334_5097;
			((Cs2Executor) class441).main_configs_map.put(VarDomainType.CLAN_SETTING_CONFIGS, Class67.method1055(((Cs2Executor) class441).current_clan, 624154491));
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}
