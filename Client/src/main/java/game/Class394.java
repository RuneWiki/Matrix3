package game;

/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class394 {
	String aString4672;
	public int[] anIntArray4673;
	int anInt4674 = -1255709541;
	Class63 aClass63_4675;
	String aString4676;
	public int[] anIntArray4677;
	Class63 aClass63_4678;

	void method4736(Class380 class380) {
		int i = class380.method4634((byte) 54);
		((Class394) this).aClass63_4678 = Class102_Sub4.method9867((byte) -57)[i];
		if (((Class394) this).aClass63_4678 == Class63.aClass63_549) {
			int i_0_ = class380.method4634((byte) 67);
			((Class394) this).aClass63_4675 = Class102_Sub4.method9867((byte) -126)[i_0_];
			((Class394) this).anInt4674 = class380.method4634((byte) 68) * 1255709541;
		}
		((Class394) this).aString4672 = class380.method4635((byte) -77);
		((Class394) this).aString4676 = class380.method4635((byte) -105);
		int i_1_ = class380.method4634((byte) 116);
		anIntArray4677 = new int[i_1_];
		anIntArray4673 = new int[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			anIntArray4677[i_2_] = class380.method4634((byte) 34);
			anIntArray4673[i_2_] = class380.method4634((byte) 44);
		}
	}

	void method4737(Class380 class380, int i) {
		int i_3_ = class380.method4634((byte) 109);
		((Class394) this).aClass63_4678 = Class102_Sub4.method9867((byte) -118)[i_3_];
		if (((Class394) this).aClass63_4678 == Class63.aClass63_549) {
			int i_4_ = class380.method4634((byte) 104);
			((Class394) this).aClass63_4675 = Class102_Sub4.method9867((byte) -105)[i_4_];
			((Class394) this).anInt4674 = class380.method4634((byte) 19) * 1255709541;
		}
		((Class394) this).aString4672 = class380.method4635((byte) -108);
		((Class394) this).aString4676 = class380.method4635((byte) -2);
		int i_5_ = class380.method4634((byte) 32);
		anIntArray4677 = new int[i_5_];
		anIntArray4673 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			anIntArray4677[i_6_] = class380.method4634((byte) 34);
			anIntArray4673[i_6_] = class380.method4634((byte) 125);
		}
	}

	Class394() {
		/* empty */
	}

	static final void method4738(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 1019967701;
	}

	static final void method4739(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(2041272494);
	}

	static final void method4740(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt906 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -2057923387;
		Class555.method6575(class73, (short) 6295);
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class482.method5748(-1718435171 * class73.selfId, -985898206);
	}

	static final void method4741(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((Cs2Executor) class441).objectLocals[(((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr])]);
	}

	static void method4742(byte i) {
		Class396.aClass127_4684.method2231((byte) -84);
	}
}
