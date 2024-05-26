package game;

/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class477 {
	static Class131 aClass131_5333 = new Class131(128);
	public static byte aByte5334;

	public static void method5640() {
		aClass131_5333.method2285(36160);
	}

	public static void method5641() {
		aClass131_5333.method2285(36160);
	}

	Class477() throws Throwable {
		throw new Error();
	}

	static final void method5642(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 1900);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class333.method4183(class73, class83, class441, 525957006);
	}

	static final void method5643(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -10128);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt906 * 1036765709;
	}

	public static final void method5644(boolean bool, int i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3706, client.aClass195_8589.aClass650_2340, 1046084275);
		client.aClass195_8589.method2929(class572_sub25, (byte) -44);
		for (Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) -11)); null != class572_sub29; class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7969(1097768927))) {
			if (!class572_sub29.method6793((short) 150)) {
				class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) 96));
				if (class572_sub29 == null)
					break;
			}
			if (-1157473207 * class572_sub29.anInt9300 == 0)
				Class96.method1554(class572_sub29, true, bool, 1285467760);
		}
		if (client.aClass73_8762 != null) {
			Class555.method6575(client.aClass73_8762, (short) 15820);
			client.aClass73_8762 = null;
		}
	}

	static Class39[] method5645(int i) {
		return new Class39[] { Class39.aClass39_397, Class39.aClass39_399, Class39.aClass39_398 };
	}
}
