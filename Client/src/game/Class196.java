package game;

/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Map;

public class Class196 {
	public byte aByte2348;
	public String aString2349;
	public String aString2350;
	public int anInt2351;
	public String aString2352;
	String aString2353;
	public static Map aMap2354;

	Class196() {
		/* empty */
	}

	static final void method2953(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -10974);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class616.method7379(class73, class83, class441, (byte) 27);
	}

	static final void method2954(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method854(i_1_, 1493492562).method2115(-1112247201);
	}

	static final void method2955(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class385.method4663(1, i_2_ << 16 | i_3_, i_4_, "", (byte) -53);
	}

	static final void method2956(Cs2Executor class441, int i) {
		Class285.method3859((((Cs2Executor) class441).aClass456_Sub1_Sub5_Sub1_5118), (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), true, (byte) 8);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[0];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[1];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[2];
	}

	static void method2957(int i, boolean bool, int i_5_) {
		ItemsContainer class572_sub31 = Class447.getContainer(i, bool, -1329272420);
		if (null != class572_sub31)
			class572_sub31.method6794((byte) -55);
	}

	static final void method2958(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1386342030);
		if (class572_sub12_sub5 != null) {
			boolean bool = class572_sub12_sub5.method10297(i_6_ >> 14 & 0x3fff, i_6_ & 0x3fff, Class439.anIntArray5086, (short) 7323);
			if (bool) {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[1];
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[2];
			} else {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
			}
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		}
	}
}
