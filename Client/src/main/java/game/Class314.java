package game;

/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class314 {
	public int anInt3806 = 867885489;
	public int anInt3807;
	public int anInt3808 = -261347136;
	public int anInt3809 = -730448320;
	public int anInt3810 = 1807617770;
	static final int anInt3811 = 0;
	public boolean aBool3812;
	public boolean aBool3813;
	public static Class639_Sub6 aClass639_Sub6_3814;

	void method4064(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(7846892);
			if (0 == i_0_)
				break;
			method4065(class572_sub15, i_0_, i, (byte) 0);
		}
	}

	Class314() {
		anInt3807 = -647032449;
		aBool3812 = false;
		aBool3813 = false;
	}

	void method4065(RSByteBuffer class572_sub15, int i, int i_1_, byte i_2_) {
		if (1 == i) {
			anInt3806 = class572_sub15.readUnsignedShort(647518597) * -867885489;
			if (65535 == 1060190383 * anInt3806)
				anInt3806 = 867885489;
		} else if (i == 2) {
			anInt3808 = (class572_sub15.readUnsignedShort(647518597) + 1) * 63025315;
			anInt3809 = (class572_sub15.readUnsignedShort(647518597) + 1) * 1532090617;
		} else if (i == 3)
			class572_sub15.readByte(1527732219);
		else if (i == 4)
			anInt3810 = class572_sub15.readUnsignedByte(1711769903) * -1243674763;
		else if (i == 5)
			anInt3807 = class572_sub15.readUnsignedByte(1805174658) * -647032449;
		else if (i == 6)
			aBool3812 = true;
		else if (i == 7)
			aBool3813 = true;
	}

	void method4066(RSByteBuffer class572_sub15, int i, int i_3_) {
		for (;;) {
			int i_4_ = class572_sub15.readUnsignedByte(1476221195);
			if (0 == i_4_)
				break;
			method4065(class572_sub15, i_4_, i, (byte) 0);
		}
	}

	void method4067(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_5_ = class572_sub15.readUnsignedByte(1239478303);
			if (0 == i_5_)
				break;
			method4065(class572_sub15, i_5_, i, (byte) 0);
		}
	}

	public static void method4068(boolean bool, int i) {
		/* empty */
	}

	static final void method4069(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_6_, (short) -6839);
		Class83 class83 = Class534.aClass83Array5975[i_6_ >> 16];
		Class289_Sub2.method8865(class73, class83, class441, -1460697454);
	}

	static final void method4070(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aShort8801;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aShort8823;
	}

	static final void method4071(Cs2Executor class441, int i) {
		client.aBool8768 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		if (client.aBool8768)
			Class572_Sub8.method8394(533390455);
	}

	public static final int method4072(int i, int i_7_, int i_8_, int i_9_) {
		if (client.aClass613_8605.method7285(1553778201) == null)
			return 0;
		int i_10_ = i >> 9;
		int i_11_ = i_7_ >> 9;
		if (i_10_ < 0 || i_11_ < 0 || i_10_ > client.aClass613_8605.method7347(-578938998) - 1 || i_11_ > client.aClass613_8605.method7278(277214477) - 1)
			return 0;
		int i_12_ = i_8_;
		if (i_12_ < 3 && ((client.aClass613_8605.method7287((byte) 37).aByteArrayArrayArray2909[1][i_10_][i_11_]) & 0x2) != 0)
			i_12_++;
		return client.aClass613_8605.method7285(1087078341).aClass174Array5875[i_12_].method2726(i, i_7_, 358769667);
	}
}
