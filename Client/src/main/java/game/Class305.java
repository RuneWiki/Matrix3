package game;

/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class305 {
	public int[] anIntArray3539;
	public Class572_Sub12_Sub15 aClass572_Sub12_Sub15_3540;
	public int anInt3541;

	static void method4010(byte i) {
		Class223.aClass572_Sub12_Sub10_2612 = new Class572_Sub12_Sub10((Class279.aClass279_3006.method3758(Class594.aClass435_7823, 16711935)), "", client.anInt8751 * -646491435, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	public static void method4011(int i) {
		if (IcmpService_Sub1.anIcmpService_Sub1_8973 != null) {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_8973.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			IcmpService_Sub1.anIcmpService_Sub1_8973 = null;
		}
	}

	static final void method4012(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class572_Sub17.method8579(class73, class83, class441, (byte) 103);
	}

	static String method4013(String string, byte i) {
		if (Class589.aString7805.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class589.aString7805.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class589.aString7805.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	static final void method4014(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_2_ = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class497 class497 = client.aClass613_8605.method7280((byte) -113);
		Class348.method4342(((i_0_ >> 14 & 0x3fff) - class497.localX * -2109597897), (i_0_ & 0x3fff) - 417324155 * class497.localY, i_1_ << 2, i_2_, i_3_, false, (byte) -46);
	}
}
