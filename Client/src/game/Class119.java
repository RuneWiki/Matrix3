package game;

/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class119 {
	int[] anIntArray1460;
	int[] anIntArray1461;
	int[] anIntArray1462;
	int[] anIntArray1463;
	int[] anIntArray1464;
	int[] anIntArray1465;
	int[] anIntArray1466;
	static int anInt1467;

	void method2158(int i) {
		int[][] is = new int[((Class119) this).anIntArray1464.length << 1][4];
		for (int i_0_ = 0; i_0_ < ((Class119) this).anIntArray1464.length; i_0_++) {
			is[i_0_ * 2][0] = ((Class119) this).anIntArray1464[i_0_];
			is[i_0_ * 2][1] = ((Class119) this).anIntArray1461[i_0_];
			is[i_0_ * 2][2] = ((Class119) this).anIntArray1462[i_0_];
			is[i_0_ * 2][3] = ((Class119) this).anIntArray1463[i_0_];
			is[2 * i_0_ + 1][0] = ((Class119) this).anIntArray1460[i_0_];
			is[1 + i_0_ * 2][1] = ((Class119) this).anIntArray1465[i_0_];
			is[i_0_ * 2 + 1][2] = ((Class119) this).anIntArray1466[i_0_];
			is[2 * i_0_ + 1][3] = ((Class119) this).anIntArray1463[i_0_];
		}
		client.anIntArrayArrayArray8689[i] = is;
	}

	void method2159(int i, byte i_1_) {
		int[][] is = new int[((Class119) this).anIntArray1464.length << 1][4];
		for (int i_2_ = 0; i_2_ < ((Class119) this).anIntArray1464.length; i_2_++) {
			is[i_2_ * 2][0] = ((Class119) this).anIntArray1464[i_2_];
			is[i_2_ * 2][1] = ((Class119) this).anIntArray1461[i_2_];
			is[i_2_ * 2][2] = ((Class119) this).anIntArray1462[i_2_];
			is[i_2_ * 2][3] = ((Class119) this).anIntArray1463[i_2_];
			is[2 * i_2_ + 1][0] = ((Class119) this).anIntArray1460[i_2_];
			is[1 + i_2_ * 2][1] = ((Class119) this).anIntArray1465[i_2_];
			is[i_2_ * 2 + 1][2] = ((Class119) this).anIntArray1466[i_2_];
			is[2 * i_2_ + 1][3] = ((Class119) this).anIntArray1463[i_2_];
		}
		client.anIntArrayArrayArray8689[i] = is;
	}

	Class119(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readUnsignedSmart(188385598);
		((Class119) this).anIntArray1464 = new int[i];
		((Class119) this).anIntArray1461 = new int[i];
		((Class119) this).anIntArray1462 = new int[i];
		((Class119) this).anIntArray1463 = new int[i];
		((Class119) this).anIntArray1460 = new int[i];
		((Class119) this).anIntArray1465 = new int[i];
		((Class119) this).anIntArray1466 = new int[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			((Class119) this).anIntArray1464[i_3_] = class572_sub15.readUnsignedShort(647518597) - 5120;
			((Class119) this).anIntArray1462[i_3_] = class572_sub15.readUnsignedShort(647518597) - 5120;
			((Class119) this).anIntArray1461[i_3_] = class572_sub15.readShort(-710976385);
			((Class119) this).anIntArray1460[i_3_] = class572_sub15.readUnsignedShort(647518597) - 5120;
			((Class119) this).anIntArray1466[i_3_] = class572_sub15.readUnsignedShort(647518597) - 5120;
			((Class119) this).anIntArray1465[i_3_] = class572_sub15.readShort(-710976385);
			((Class119) this).anIntArray1463[i_3_] = class572_sub15.readShort(-710976385);
		}
	}

	void method2160(int i) {
		int[][] is = new int[((Class119) this).anIntArray1464.length << 1][4];
		for (int i_4_ = 0; i_4_ < ((Class119) this).anIntArray1464.length; i_4_++) {
			is[i_4_ * 2][0] = ((Class119) this).anIntArray1464[i_4_];
			is[i_4_ * 2][1] = ((Class119) this).anIntArray1461[i_4_];
			is[i_4_ * 2][2] = ((Class119) this).anIntArray1462[i_4_];
			is[i_4_ * 2][3] = ((Class119) this).anIntArray1463[i_4_];
			is[2 * i_4_ + 1][0] = ((Class119) this).anIntArray1460[i_4_];
			is[1 + i_4_ * 2][1] = ((Class119) this).anIntArray1465[i_4_];
			is[i_4_ * 2 + 1][2] = ((Class119) this).anIntArray1466[i_4_];
			is[2 * i_4_ + 1][3] = ((Class119) this).anIntArray1463[i_4_];
		}
		client.anIntArrayArrayArray8689[i] = is;
	}

	void method2161(int i) {
		int[][] is = new int[((Class119) this).anIntArray1464.length << 1][4];
		for (int i_5_ = 0; i_5_ < ((Class119) this).anIntArray1464.length; i_5_++) {
			is[i_5_ * 2][0] = ((Class119) this).anIntArray1464[i_5_];
			is[i_5_ * 2][1] = ((Class119) this).anIntArray1461[i_5_];
			is[i_5_ * 2][2] = ((Class119) this).anIntArray1462[i_5_];
			is[i_5_ * 2][3] = ((Class119) this).anIntArray1463[i_5_];
			is[2 * i_5_ + 1][0] = ((Class119) this).anIntArray1460[i_5_];
			is[1 + i_5_ * 2][1] = ((Class119) this).anIntArray1465[i_5_];
			is[i_5_ * 2 + 1][2] = ((Class119) this).anIntArray1466[i_5_];
			is[2 * i_5_ + 1][3] = ((Class119) this).anIntArray1463[i_5_];
		}
		client.anIntArrayArrayArray8689[i] = is;
	}

	static final void method2162(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_6_, -514537009));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class73.method1101(i_6_, class264.aString2833, 787757763);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class73.method1096(i_6_, -1132777561 * class264.anInt2832, (byte) 84);
	}

	static final void method2163(Cs2Executor class441, int i) {
		int newVolume = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int currentVolume = Class213.aClass572_Sub24_2463.musicVolume.method8970(660014728);
		if (newVolume != currentVolume) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.musicVolume), newVolume, 1481162905);

			//music volume is being turned off here

			Class623.method7443(-1482869308);

			//    System.out.println("changed volume from "+currentVolume+", to "+newVolume);
			client.aBool8854 = false;
			//  throw new RuntimeException();
		}
	}

	static int method2164(byte i) {
		int i_9_ = Class428.aClass398_5017.anInt4692 * 169628821;
		if (i_9_ < Class428.aClass398Array5010.length - 1)
			Class428.aClass398_5017 = Class428.aClass398Array5010[1 + i_9_];
		return 100;
	}

	static final void method2165(Cs2Executor class441, byte i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_10_, (short) 20347);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt797 * -1688915011;
	}

	static final void method2166(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9151((byte) -30) ? 1 : 0;
	}
}
