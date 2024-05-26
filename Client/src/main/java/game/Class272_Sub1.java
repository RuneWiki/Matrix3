package game;

/* Class272_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class272_Sub1 extends VarDomainType {
	static int anInt9449;
	public static Class572_Sub5 aClass572_Sub5_9450;

	Object method3672(VarDefinition class179, int i) {
		if (ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Class272_Sub1(JS5ConfigGroup jS5ConfigGroup, int i, boolean bool, boolean bool_0_) {
		super(jS5ConfigGroup, i, bool, bool_0_);
	}

	Object method3670(VarDefinition class179) {
		if (ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3667(VarDefinition class179) {
		if (ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	Object method3671(VarDefinition class179) {
		if (ScriptVarType.aClass283_3226 == class179.dataType)
			return Integer.valueOf(-1);
		return class179.dataType.getDefaultValue(1697142415);
	}

	static boolean method8820(InterfaceDefinitions class73, byte i) {
		Class572_Sub30 class572_sub30 = client.method7992(class73);
		if (class572_sub30.method8660(-245334245) > 0)
			return true;
		if (class572_sub30.method8651((byte) 52))
			return true;
		if (class73.aClass73_852 != null)
			return true;
		return false;
	}

	static void method8821(File file, int i) {
		Class91.aFile1236 = file;
		if (!Class91.aFile1236.exists())
			throw new RuntimeException("");
		Class587.aBool7780 = true;
	}
}
