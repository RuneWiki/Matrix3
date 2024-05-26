package game;

/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117 implements Interface2 {
	int anInt1455;
	Class46 this$0;

	Class117(Class46 class46, RSByteBuffer class572_sub15) {
		((Class117) this).this$0 = class46;
		((Class117) this).anInt1455 = class572_sub15.readUnsignedShort(647518597) * -334565861;
	}

	public void method15(Class49 class49, int i) {
		class49.method877(-895337453 * ((Class117) this).anInt1455, -1833404380);
		class49.method854(((Class117) this).anInt1455 * -895337453, 1493492562);
	}

	public void method16(Class49 class49) {
		class49.method877(-895337453 * ((Class117) this).anInt1455, -1833404380);
		class49.method854(((Class117) this).anInt1455 * -895337453, 1493492562);
	}

	public void method17(Class49 class49) {
		class49.method877(-895337453 * ((Class117) this).anInt1455, -1833404380);
		class49.method854(((Class117) this).anInt1455 * -895337453, 1493492562);
	}

	static final void method2150(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]);
		Cs2Script class572_sub12_sub8 = Class217.method3081(i_0_, (byte) 8);
		if (null == class572_sub12_sub8)
			throw new RuntimeException();
		int[] is = new int[class572_sub12_sub8.nIntLocals * -210642863];
		Object[] objects = new Object[class572_sub12_sub8.nObjectLocals * 1139034625];
		long[] ls = new long[-2100895907 * class572_sub12_sub8.nLongLocals];
		for (int i_1_ = 0; i_1_ < 854977557 * class572_sub12_sub8.anInt11385; i_1_++)
			is[i_1_] = (((Cs2Executor) class441).intStack[(1369304407 * ((Cs2Executor) class441).intStackPtr - 854977557 * class572_sub12_sub8.anInt11385 + i_1_)]);
		for (int i_2_ = 0; i_2_ < class572_sub12_sub8.anInt11386 * 1834702179; i_2_++)
			objects[i_2_] = (((Cs2Executor) class441).objectStack[(1628307581 * ((Cs2Executor) class441).objectStackPtr - class572_sub12_sub8.anInt11386 * 1834702179 + i_2_)]);
		for (int i_3_ = 0; i_3_ < -830459043 * class572_sub12_sub8.anInt11387; i_3_++)
			ls[i_3_] = (((Cs2Executor) class441).longStack[(1097105451 * ((Cs2Executor) class441).longStackPtr - class572_sub12_sub8.anInt11387 * -830459043 + i_3_)]);
		((Cs2Executor) class441).intStackPtr -= -1702927757 * class572_sub12_sub8.anInt11385;
		((Cs2Executor) class441).objectStackPtr -= -1232768161 * class572_sub12_sub8.anInt11386;
		((Cs2Executor) class441).longStackPtr -= -163393897 * class572_sub12_sub8.anInt11387;
		Cs2CallPointer class475 = new Cs2CallPointer();
		((Cs2CallPointer) class475).script = ((Cs2Executor) class441).current;
		((Cs2CallPointer) class475).instrPtr = -2077159683 * ((Cs2Executor) class441).instrPtr;
		((Cs2CallPointer) class475).intLocals = ((Cs2Executor) class441).intLocals;
		((Cs2CallPointer) class475).objectLocals = ((Cs2Executor) class441).objectLocals;
		((Cs2CallPointer) class475).longLocals = ((Cs2Executor) class441).longLocals;
		if (-1384972465 * ((Cs2Executor) class441).callStackPtr >= ((Cs2Executor) class441).callStack.length)
			throw new RuntimeException();
		((Cs2Executor) class441).callStack[(((Cs2Executor) class441).callStackPtr += 528398255) * -1384972465 - 1] = class475;
		((Cs2Executor) class441).current = class572_sub12_sub8;
		((Cs2Executor) class441).aClass574Array5107 = (((Cs2Executor) class441).current.aClass574Array11379);
		((Cs2Executor) class441).anIntArray5124 = ((Cs2Executor) class441).current.anIntArray11380;
		((Cs2Executor) class441).instrPtr = 1866055967;
		((Cs2Executor) class441).intLocals = is;
		((Cs2Executor) class441).objectLocals = objects;
		((Cs2Executor) class441).longLocals = ls;
	}

	public static void method2151(int i, byte i_4_) {
		Class575.anInt7659 = -798066103 * i;
	}

	public static Class395 method2152(int i, int i_5_) {
		if (((Class395) Class395.aClass395_4680).anInt4679 * 1974988459 == i)
			return Class395.aClass395_4680;
		if (i == ((Class395) Class395.aClass395_4681).anInt4679 * 1974988459)
			return Class395.aClass395_4681;
		return null;
	}
}
