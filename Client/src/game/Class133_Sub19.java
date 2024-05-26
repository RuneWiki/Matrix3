package game;

/* Class133_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub19 extends Class133 {
	String aString10253;
	int anInt10254;
	static String aString10255;

	public void method2303(int i) {
		if (-1 != 1545763299 * client.anInt8645)
			Class507.method6037(client.anInt8645 * 1545763299, ((Class133_Sub19) this).aString10253, 814368199 * ((Class133_Sub19) this).anInt10254, (byte) 63);
	}

	Class133_Sub19(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub19) this).aString10253 = class572_sub15.readString(1295706626);
		((Class133_Sub19) this).anInt10254 = class572_sub15.readUnsignedShort(647518597) * 724560887;
	}

	public void method2309() {
		if (-1 != 1545763299 * client.anInt8645)
			Class507.method6037(client.anInt8645 * 1545763299, ((Class133_Sub19) this).aString10253, 814368199 * ((Class133_Sub19) this).anInt10254, (byte) 63);
	}

	static final void method9532(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).instrPtr += (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]) * -1866055967;
	}

	static final void method9533(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -10292);
		Class86.method1276(class73, class441, (byte) 0);
	}

	public static void method9534(VarDefinition class179, byte i) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(2, (long) (473591285 * class179.id));
		class572_sub12_sub11.method10384(-1766659857);
	}
}
