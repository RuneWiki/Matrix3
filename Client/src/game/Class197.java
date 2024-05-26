package game;

/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class197 implements Interface13, Interface15, Interface54 {
	Class493[] aClass493Array2355;
	Class202_Sub1_Sub1 aClass202_Sub1_Sub1_2356;
	public Class510 domain;
	Class639_Sub19 aClass639_Sub19_2358;
	public static Class639_Sub11 aClass639_Sub11_2359;
	public static Class639_Sub15 aClass639_Sub15_2360;

	public int method2959(int i) {
		return ((Class197) this).aClass493Array2355[i].method5879((byte) 61);
	}

	public int method2960(int i, int i_0_) {
		return (((Class197) this).aClass493Array2355[i].method5877((client.aBool8731 ? Class438.aClass438_5079 : Class438.aClass438_5078), -606757131));
	}

	public int method311(int i, int i_1_) {
		return (((Class197) this).aClass493Array2355[i].method5893((client.aBool8731 ? Class438.aClass438_5079 : Class438.aClass438_5078), (byte) -19));
	}

	public int method73(VarDefinition class179, int i) {
		return domain.method73(class179, -1778929705);
	}

	public int method2961(int i, int i_2_) {
		return ((Class197) this).aClass493Array2355[i].method5874(1868828506);
	}

	public int method2962(int i, byte i_3_) {
		return ((Class197) this).aClass493Array2355[i].method5883(-1771766333);
	}

	public VarDefinition method94(VarDomainType class272, int i, byte i_4_) {
		if (VarDomainType.PLAYER_CONFIGS != class272)
			return null;
		return (VarDefinition) ((Class197) this).aClass202_Sub1_Sub1_2356.getDefinition(i, 1055021764);
	}

	public int method2963(int i) {
		return ((Class197) this).aClass493Array2355[i].method5883(-319693672);
	}

	public int method71(VarBitDefinition class429) {
		return domain.method72(class429, -177045503);
	}

	public VarBitDefinition method95(int i, int i_5_) {
		VarBitDefinition class429 = (VarBitDefinition) ((Class197) this).aClass639_Sub19_2358.getDefinition(i, -656148423);
		if (VarDomainType.PLAYER_CONFIGS != class429.baseVar.domain)
			return null;
		return class429;
	}

	public int method72(VarBitDefinition class429, int i) {
		return domain.method72(class429, -354575768);
	}

	public VarDefinition method97(VarDomainType class272, int i) {
		if (VarDomainType.PLAYER_CONFIGS != class272)
			return null;
		return (VarDefinition) ((Class197) this).aClass202_Sub1_Sub1_2356.getDefinition(i, -1517875438);
	}

	public int method2964(int i) {
		return ((Class197) this).aClass493Array2355[i].method5874(1691273966);
	}

	public int method2965(int i) {
		return ((Class197) this).aClass493Array2355[i].method5874(1793623105);
	}

	public int method2966(int i) {
		return ((Class197) this).aClass493Array2355[i].method5883(261429600);
	}

	public Class197(Class202_Sub1_Sub1 class202_sub1_sub1, Class639_Sub19 class639_sub19, int i) {
		((Class197) this).aClass493Array2355 = new Class493[i];
		domain = new Class510();
		((Class197) this).aClass202_Sub1_Sub1_2356 = class202_sub1_sub1;
		((Class197) this).aClass639_Sub19_2358 = class639_sub19;
	}

	public VarDefinition method96(VarDomainType class272, int i) {
		if (VarDomainType.PLAYER_CONFIGS != class272)
			return null;
		return (VarDefinition) ((Class197) this).aClass202_Sub1_Sub1_2356.getDefinition(i, 643723167);
	}

	public int method2967(int i) {
		return ((Class197) this).aClass493Array2355[i].method5879((byte) 85);
	}

	public int method2968(int i, int i_6_) {
		return ((Class197) this).aClass493Array2355[i].method5879((byte) 90);
	}

	public VarBitDefinition method99(int i) {
		VarBitDefinition class429 = ((VarBitDefinition) ((Class197) this).aClass639_Sub19_2358.getDefinition(i, 526973575));
		if (VarDomainType.PLAYER_CONFIGS != class429.baseVar.domain)
			return null;
		return class429;
	}

	public int method74(VarDefinition class179) {
		return domain.method73(class179, -1944193169);
	}

	public VarBitDefinition method98(int i) {
		VarBitDefinition class429 = (VarBitDefinition) ((Class197) this).aClass639_Sub19_2358.getDefinition(i, -888947285);
		if (VarDomainType.PLAYER_CONFIGS != class429.baseVar.domain)
			return null;
		return class429;
	}

	public static boolean method2969(byte i) {
		return Class585.anInterface67_7773 != null;
	}

	public static Class516[] method2970(int i) {
		return (new Class516[] { Class516.aClass516_5726, Class516.aClass516_5733, Class516.aClass516_5729, Class516.aClass516_5735, Class516.aClass516_5719, Class516.aClass516_5724,
			Class516.aClass516_5722, Class516.aClass516_5731, Class516.aClass516_5740, Class516.aClass516_5727, Class516.aClass516_5734, Class516.aClass516_5728, Class516.aClass516_5725,
			Class516.aClass516_5741, Class516.aClass516_5736, Class516.aClass516_5739, Class516.aClass516_5737, Class516.aClass516_5732, Class516.aClass516_5743, Class516.aClass516_5738,
			Class516.aClass516_5720, Class516.aClass516_5723, Class516.aClass516_5730 });
	}

	public static void method2971(Class530 class530, int i, int i_7_, Class431 class431, Class456_Sub1_Sub5_Sub1 class456_sub1_sub5_sub1, byte i_8_) {
		Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
		((Cs2Executor) class441).aClass456_Sub1_Sub5_Sub1_5118 = class456_sub1_sub5_sub1;
		Class309.method4041(class530, i, i_7_, class441, -627862136);
		((Cs2Executor) class441).aClass456_Sub1_Sub5_Sub1_5118 = null;
	}

	public static Class303 method2972(RSByteBuffer class572_sub15, byte i) {
		int i_9_ = class572_sub15.readBigSmart((byte) 88);
		Class320 class320 = (Class133_Sub20.method9537(272383510)[class572_sub15.readUnsignedByte(63813115)]);
		Class300 class300 = (Class480.method5718(1880510246)[class572_sub15.readUnsignedByte(1147782357)]);
		int i_10_ = class572_sub15.readShort(-710976385);
		int i_11_ = class572_sub15.readShort(-710976385);
		return new Class303(i_9_, class320, class300, i_10_, i_11_);
	}
}
