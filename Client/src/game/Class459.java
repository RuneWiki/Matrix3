package game;

/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class459 implements IVarDomain {
	Class334 aClass334_5209;

	public void method93(VarBitDefinition class429, int i) {
		throw new UnsupportedOperationException();
	}

	public int method73(VarDefinition class179, int i) {
		Integer integer = (((Class459) this).aClass334_5209.method4215((1002594281 * client.aClass437_8705.anInt5076 << 16 | class179.id * 473591285), (short) -19514));
		if (integer == null)
			return ((Integer) class179.method2770((byte) 4)).intValue();
		return integer.intValue();
	}

	public void method84(VarDefinition class179, int i) {
		throw new UnsupportedOperationException();
	}

	public Object method82(VarDefinition class179, byte i) {
		if (ScriptVarType.aClass283_3261 != class179.dataType)
			throw new IllegalArgumentException("");
		return (((Class459) this).aClass334_5209.method4213((1002594281 * client.aClass437_8705.anInt5076 << 16 | 473591285 * class179.id), -2131862319));
	}

	public int method72(VarBitDefinition class429, int i) {
		return class429.method5218(method73(class429.baseVar, -1432668122), (byte) 27);
	}

	public void method75(VarBitDefinition class429, int i) {
		throw new UnsupportedOperationException();
	}

	public void method78(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	Class459(Class334 class334) {
		((Class459) this).aClass334_5209 = class334;
	}

	public void method76(VarDefinition class179, int i, short i_0_) {
		throw new UnsupportedOperationException();
	}

	public long method77(VarDefinition class179, int i) {
		Long var_long = (((Class459) this).aClass334_5209.method4188((client.aClass437_8705.anInt5076 * 1002594281 << 16 | class179.id * 473591285), (short) -16288));
		if (var_long == null)
			return ((Long) class179.method2770((byte) 4)).longValue();
		return var_long.longValue();
	}

	public int method71(VarBitDefinition class429) {
		return class429.method5218(method73(class429.baseVar, -2040509161), (byte) 106);
	}

	public void method91(VarDefinition class179, int i) {
		throw new UnsupportedOperationException();
	}

	public void method83(VarDefinition class179, int i) {
		throw new UnsupportedOperationException();
	}

	public int method74(VarDefinition class179) {
		Integer integer = (((Class459) this).aClass334_5209.method4215((1002594281 * client.aClass437_8705.anInt5076 << 16 | class179.id * 473591285), (short) -14163));
		if (integer == null)
			return ((Integer) class179.method2770((byte) 4)).intValue();
		return integer.intValue();
	}

	public long method85(VarDefinition class179) {
		Long var_long = (((Class459) this).aClass334_5209.method4188((client.aClass437_8705.anInt5076 * 1002594281 << 16 | class179.id * 473591285), (short) -17104));
		if (var_long == null)
			return ((Long) class179.method2770((byte) 4)).longValue();
		return var_long.longValue();
	}

	public void method86(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	public void method92(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	public Object method87(VarDefinition class179) {
		if (ScriptVarType.aClass283_3261 != class179.dataType)
			throw new IllegalArgumentException("");
		return (((Class459) this).aClass334_5209.method4213((1002594281 * client.aClass437_8705.anInt5076 << 16 | 473591285 * class179.id), -1918042239));
	}

	public Object method88(VarDefinition class179) {
		if (ScriptVarType.aClass283_3261 != class179.dataType)
			throw new IllegalArgumentException("");
		return (((Class459) this).aClass334_5209.method4213((1002594281 * client.aClass437_8705.anInt5076 << 16 | 473591285 * class179.id), -1893850988));
	}

	public Object method90(VarDefinition class179) {
		if (ScriptVarType.aClass283_3261 != class179.dataType)
			throw new IllegalArgumentException("");
		return (((Class459) this).aClass334_5209.method4213((1002594281 * client.aClass437_8705.anInt5076 << 16 | 473591285 * class179.id), -2121093374));
	}

	public void method79(VarDefinition class179, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method89(VarBitDefinition class429, int i) {
		throw new UnsupportedOperationException();
	}

	public void method81(VarBitDefinition class429, int i, int i_1_) {
		throw new UnsupportedOperationException();
	}

	public void method80(VarDefinition class179, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	static final void method5446(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		UnderlayDefinition underlayDefinition;
		if (((Cs2Executor) class441).aBool5128)
			underlayDefinition = ((Cs2Executor) class441).aClass443_5112;
		else
			underlayDefinition = ((Cs2Executor) class441).aClass443_5126;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (i_3_ != -1 && underlayDefinition.method5282(i_2_, i_3_, 1469842917) ? 1 : 0);
	}

	static final void method5447(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class126.method2218(class73, class83, class441, -308954870);
	}

	static final void method5448(Cs2Executor class441, int i) {
		if (!Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 33).method5099((byte) 80))
			throw new RuntimeException();
		Class658_Sub4 class658_sub4 = ((Class658_Sub4) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040));
		class658_sub4.method8990(Class587.aClass236_7783, -1, 0.0F, -1882613113);
		client.aBool8685 = true;
	}

	static final void method5449(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_6_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]);
		Class385.method4663(4, i_4_ << 16 | i_5_, i_6_, "", (byte) -45);
	}

	static final void method5450(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8754 ? 1 : 0;
	}

	public static Class301[] method5451(byte i) {
		return (new Class301[] { Class301.aClass301_3497, Class301.aClass301_3493, Class301.aClass301_3492, Class301.aClass301_3495, Class301.aClass301_3494, Class301.SEND_OBJECT,
			Class301.aClass301_3496, Class301.aClass301_3490, Class301.REVMOVE_GROUND_ITEM, Class301.PROJECTILE, Class301.aClass301_3491, Class301.REMOVE_OBJECT, Class301.aClass301_3502,
			Class301.ADJUSTED_PROJECTILE, Class301.SEND_GROUND_ITEM });
	}
}
