package game;

/* Class344_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class344_Sub2 extends Class344 {
	void method4311(boolean bool, int i, int i_0_) {
		Class272_Sub2.aClass106_9517.method1724(i - 2, i_0_, 4 + -139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559, 2 + ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997, -692906389 * ((Class375_Sub3) ((Class344_Sub2) this).aClass375_4364).anInt9519, 0);
		Class272_Sub2.aClass106_9517.method1724(i - 1, i_0_ + 1, 2 + -139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559, ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997, 0, 0);
	}

	Class344_Sub2(Class248 class248, Class248 class248_1_, Class375_Sub3 class375_sub3) {
		super(class248, class248_1_, (Class375) class375_sub3);
	}

	void method4308(boolean bool, int i, int i_2_, int i_3_) {
		Class272_Sub2.aClass106_9517.method1724(i - 2, i_2_, 4 + -139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559, 2 + ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997, -692906389 * ((Class375_Sub3) ((Class344_Sub2) this).aClass375_4364).anInt9519, 0);
		Class272_Sub2.aClass106_9517.method1724(i - 1, i_2_ + 1, 2 + -139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559, ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997, 0, 0);
	}

	void method4309(boolean bool, int i, int i_4_) {
		int i_5_ = (method4306((byte) -64) * (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559) / 10000);
		Class272_Sub2.aClass106_9517.method1725(i, 2 + i_4_, i_5_, ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997 - 2, 1254097043 * ((Class375_Sub3) ((Class344_Sub2) this).aClass375_4364).anInt9518, 0);
		Class272_Sub2.aClass106_9517.method1725(i + i_5_, 2 + i_4_, (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559 - i_5_), -670814997 * ((Class344_Sub2) this).aClass375_4364.anInt4562 - 2, 0, 0);
	}

	void method4310(boolean bool, int i, int i_6_) {
		int i_7_ = (method4306((byte) 1) * (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559) / 10000);
		Class272_Sub2.aClass106_9517.method1725(i, 2 + i_6_, i_7_, ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997 - 2, 1254097043 * ((Class375_Sub3) ((Class344_Sub2) this).aClass375_4364).anInt9518, 0);
		Class272_Sub2.aClass106_9517.method1725(i + i_7_, 2 + i_6_, (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559 - i_7_), -670814997 * ((Class344_Sub2) this).aClass375_4364.anInt4562 - 2, 0, 0);
	}

	void method4307(boolean bool, int i, int i_8_, int i_9_) {
		int i_10_ = (method4306((byte) 48) * (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559) / 10000);
		Class272_Sub2.aClass106_9517.method1725(i, 2 + i_8_, i_10_, ((Class344_Sub2) this).aClass375_4364.anInt4562 * -670814997 - 2, 1254097043 * ((Class375_Sub3) ((Class344_Sub2) this).aClass375_4364).anInt9518, 0);
		Class272_Sub2.aClass106_9517.method1725(i + i_10_, 2 + i_8_, (-139432737 * ((Class344_Sub2) this).aClass375_4364.anInt4559 - i_10_), -670814997 * ((Class344_Sub2) this).aClass375_4364.anInt4562 - 2, 0, 0);
	}

	public static int method9253(int i) {
		if (Class637.aBool8266 && Class554.aFrame6320 != null)
			return 3;
		return client.aBool8721 ? 2 : 1;
	}

	static final void method9254(Cs2Executor class441, byte i) {
		int i_11_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class195 class195 = Class166.method2676((byte) 74);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3734, class195.aClass650_2340, -16113039);
		class572_sub25.aRsByteBuffer.writeByte(i_11_, -1384395473);
		class195.method2929(class572_sub25, (byte) -123);
	}

	static final void method9255(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_13_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class315.getContainerCount(i_12_, i_13_, true, false, 1025715233);
	}
}
