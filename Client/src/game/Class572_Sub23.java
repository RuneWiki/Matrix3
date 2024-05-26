package game;

/* Class572_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub23 extends Class572 {
	public static final int anInt9184 = 0;
	public static final int anInt9185 = 1;
	public static final int anInt9186 = 2;
	public static final int anInt9187 = 3;
	public static final int anInt9188 = 5;
	static final int anInt9189 = 6;
	public static final int anInt9190 = 7;
	public static final int anInt9191 = 8;
	public static final int anInt9192 = 9;
	public static final int anInt9193 = 10;
	int anInt9194;
	int anInt9195;
	int[] anIntArray9196;
	int[][] anIntArrayArray9197;
	boolean[] aBoolArray9198;
	int[] anIntArray9199;

	Class572_Sub23(int i, byte[] is) {
		((Class572_Sub23) this).anInt9194 = -912972575 * i;
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		((Class572_Sub23) this).anInt9195 = class572_sub15.readUnsignedShort(647518597) * -11428115;
		((Class572_Sub23) this).anIntArray9196 = new int[((Class572_Sub23) this).anInt9195 * 387935973];
		((Class572_Sub23) this).anIntArrayArray9197 = new int[((Class572_Sub23) this).anInt9195 * 387935973][];
		((Class572_Sub23) this).aBoolArray9198 = new boolean[387935973 * ((Class572_Sub23) this).anInt9195];
		((Class572_Sub23) this).anIntArray9199 = new int[387935973 * ((Class572_Sub23) this).anInt9195];
		for (int i_0_ = 0; i_0_ < ((Class572_Sub23) this).anInt9195 * 387935973; i_0_++) {
			((Class572_Sub23) this).anIntArray9196[i_0_] = class572_sub15.readUnsignedByte(496976801);
			if (((Class572_Sub23) this).anIntArray9196[i_0_] == 6)
				((Class572_Sub23) this).anIntArray9196[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < ((Class572_Sub23) this).anInt9195 * 387935973; i_1_++)
			((Class572_Sub23) this).aBoolArray9198[i_1_] = class572_sub15.readUnsignedByte(837321077) == 1;
		for (int i_2_ = 0; i_2_ < ((Class572_Sub23) this).anInt9195 * 387935973; i_2_++)
			((Class572_Sub23) this).anIntArray9199[i_2_] = class572_sub15.readUnsignedShort(647518597);
		for (int i_3_ = 0; i_3_ < 387935973 * ((Class572_Sub23) this).anInt9195; i_3_++)
			((Class572_Sub23) this).anIntArrayArray9197[i_3_] = new int[class572_sub15.readUnsignedSmart(840134823)];
		for (int i_4_ = 0; i_4_ < ((Class572_Sub23) this).anInt9195 * 387935973; i_4_++) {
			for (int i_5_ = 0; (i_5_ < ((Class572_Sub23) this).anIntArrayArray9197[i_4_].length); i_5_++)
				((Class572_Sub23) this).anIntArrayArray9197[i_4_][i_5_] = class572_sub15.readUnsignedSmart(-88076717);
		}
	}

	static final void method8608(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_6_, (short) -3873);
		Class336.method4236(class73, class441, (byte) 0);
	}
}
