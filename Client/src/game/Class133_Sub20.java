package game;

/* Class133_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub20 extends Class133 {
	int anInt10256;
	int anInt10257;
	int anInt10258;
	int anInt10259;
	int anInt10260;
	public static Class324 aClass324_10261;

	public void method2303(int i) {
		Class348.method4342(((Class133_Sub20) this).anInt10260 * 1477439627, -1890737873 * ((Class133_Sub20) this).anInt10258, ((Class133_Sub20) this).anInt10257 * -1901768359, 100, 100, false, (byte) -70);
		ScriptVarType.method3829(((Class133_Sub20) this).anInt10259 * -2024842183, ((Class133_Sub20) this).anInt10256 * 1872543633, 0, -1515474367);
		client.aBool8647 = true;
	}

	Class133_Sub20(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub20) this).anInt10260 = class572_sub15.readUnsignedShort(647518597) * -1179322589;
		((Class133_Sub20) this).anInt10257 = class572_sub15.readUnsignedShort(647518597) * -22288663;
		((Class133_Sub20) this).anInt10258 = class572_sub15.readUnsignedShort(647518597) * 210191823;
		((Class133_Sub20) this).anInt10259 = class572_sub15.readUnsignedShort(647518597) * -1761095159;
		((Class133_Sub20) this).anInt10256 = class572_sub15.readUnsignedShort(647518597) * -1981685391;
	}

	public void method2309() {
		Class348.method4342(((Class133_Sub20) this).anInt10260 * 1477439627, -1890737873 * ((Class133_Sub20) this).anInt10258, ((Class133_Sub20) this).anInt10257 * -1901768359, 100, 100, false, (byte) -14);
		ScriptVarType.method3829(((Class133_Sub20) this).anInt10259 * -2024842183, ((Class133_Sub20) this).anInt10256 * 1872543633, 0, -1637541775);
		client.aBool8647 = true;
	}

	static final void method9535(Cs2Executor class441, int i) {
		if (Class251.aClass572_Sub10_2731 != null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
			((Cs2Executor) class441).aClass572_Sub10_5104 = Class251.aClass572_Sub10_2731;
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	public static Class499 method9536(RSByteBuffer class572_sub15, int i) {
		int i_0_ = class572_sub15.readUnsignedByte(1366276438);
		int[] is = new int[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
			is[i_1_] = class572_sub15.readUnsignedByte(1735767063);
		return new Class499(is);
	}

	public static Class320[] method9537(int i) {
		return (new Class320[] { Class320.aClass320_3892, Class320.aClass320_3891, Class320.aClass320_3890 });
	}

	public static Class572_Sub12_Sub17 method9538(int i, Class395 class395, RSByteBuffer class572_sub15, int i_2_) {
		if (class395 == Class395.aClass395_4680)
			return new Class572_Sub12_Sub17_Sub2(i, class572_sub15);
		if (class395 == Class395.aClass395_4681)
			return new Class572_Sub12_Sub17_Sub1(i, class572_sub15);
		return null;
	}
}
