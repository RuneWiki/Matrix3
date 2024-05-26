package game;

/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 implements Interface2 {
	int anInt524;
	Class46 this$0;
	public static String aString525;
	public static Class572_Sub10 aClass572_Sub10_526;

	public void method15(Class49 class49, int i) {
		Class115 class115 = class49.method854(((Class55) this).anInt524 * 746130941, 1493492562);
		class115.method2107(-307111887);
		class115.method2098((short) 14500);
		class49.method856(((Class55) this).anInt524 * 746130941, (byte) 2);
	}

	Class55(Class46 class46, RSByteBuffer class572_sub15) {
		((Class55) this).this$0 = class46;
		((Class55) this).anInt524 = class572_sub15.readUnsignedShort(647518597) * 1007761237;
	}

	public void method16(Class49 class49) {
		Class115 class115 = class49.method854(((Class55) this).anInt524 * 746130941, 1493492562);
		class115.method2107(1365875933);
		class115.method2098((short) 4677);
		class49.method856(((Class55) this).anInt524 * 746130941, (byte) 2);
	}

	public void method17(Class49 class49) {
		Class115 class115 = class49.method854(((Class55) this).anInt524 * 746130941, 1493492562);
		class115.method2107(966419289);
		class115.method2098((short) 13450);
		class49.method856(((Class55) this).anInt524 * 746130941, (byte) 2);
	}

	static void method991(RSByteBuffer class572_sub15, int i, int i_0_) {
		if (Class584.aClass643_7759 != null) {
			try {
				Class584.aClass643_7759.method7614(0L);
				Class584.aClass643_7759.method7619((class572_sub15.b), i, 24, -1501894840);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method992(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		long l = Class572_Sub13.method8432(1360982075);
		if (0L == l)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 5;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class80.method1240(l, string, (byte) -47);
	}

	static final void method993(Cs2Executor class441, byte i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, -993232812)).anInt8150) * -769360333;
	}

	static void method994(int i, int i_2_, byte i_3_) {
		VarBitDefinition class429 = ((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i, -1149609411));
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(1, (long) (473591285 * (class429.baseVar.id)));
		try {
			if (GameTask.aBool11435)
				((GameTask) class572_sub12_sub11).p1 = (Class306.clientConfigsDomain.method73(class429.baseVar, -1813643580) * 720886855);
			((GameTask) class572_sub12_sub11).p1 = class429.method5224(471797111 * (((GameTask) class572_sub12_sub11).p1), i_2_, (byte) -116) * 720886855;
			class572_sub12_sub11.method10338(1203235734);
		} catch (Exception_Sub2 exception_sub2) {
			Class640.method7592(new StringBuilder().append("").append(i).toString(), exception_sub2, 1843585337);
		}
	}
}
