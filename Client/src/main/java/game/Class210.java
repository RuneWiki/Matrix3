package game;

/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210 {
	public int anInt2437;
	public int anInt2438;
	public int anInt2439;
	public static Class334 aClass334_2440;

	Class210(int i, int i_0_, int i_1_) {
		anInt2439 = i * 1669077179;
		anInt2438 = -429258641 * i_0_;
		anInt2437 = 144297975 * i_1_;
	}

	static void method3052(int i, String string, String string_2_, byte i_3_) {
		if (client.aClass195_8589 != null) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3681, client.aClass195_8589.aClass650_2340, -1887455380);
			class572_sub25.aRsByteBuffer.writeShort((1 + Class269.method3657(string, -305067621) + Class269.method3657(string_2_, -776790440)), -1438891301);
			class572_sub25.aRsByteBuffer.method8460(string, (byte) 35);
			class572_sub25.aRsByteBuffer.writeByte128(i, 630595612);
			class572_sub25.aRsByteBuffer.method8460(string_2_, (byte) 60);
			client.aClass195_8589.method2929(class572_sub25, (byte) -27);
		}
	}

	static final void method3053(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class572.method6801((char) i_4_, (byte) 8) ? 1 : 0;
	}
}
