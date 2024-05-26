package game;

/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class203 {
	static boolean aBool2403 = false;

	public static void method2999() {
		if (!aBool2403) {
			Class431.method5242((client.aClass613_8605.method7285(2083945339).aClass536ArrayArrayArray5837), -819309153);
			if ((client.aClass613_8605.method7285(2087832307).aClass536ArrayArrayArray5839) != null)
				Class431.method5242((client.aClass613_8605.method7285(1374962643).aClass536ArrayArrayArray5839), -1986744883);
			aBool2403 = true;
		}
	}

	public static void method3000() {
		if (!aBool2403) {
			Class431.method5242((client.aClass613_8605.method7285(1253581853).aClass536ArrayArrayArray5837), -1238173073);
			if ((client.aClass613_8605.method7285(1593212890).aClass536ArrayArrayArray5839) != null)
				Class431.method5242((client.aClass613_8605.method7285(1520155889).aClass536ArrayArrayArray5839), -1022357488);
			aBool2403 = true;
		}
	}

	public static void method3001() {
		if (!aBool2403) {
			Class431.method5242((client.aClass613_8605.method7285(1881712459).aClass536ArrayArrayArray5837), -1395702303);
			if ((client.aClass613_8605.method7285(1261227228).aClass536ArrayArrayArray5839) != null)
				Class431.method5242((client.aClass613_8605.method7285(1908381296).aClass536ArrayArrayArray5839), 1982464820);
			aBool2403 = true;
		}
	}

	Class203() throws Throwable {
		throw new Error();
	}

	public static void method3002() {
		if (!aBool2403) {
			Class431.method5242((client.aClass613_8605.method7285(2112532211).aClass536ArrayArrayArray5837), -30400288);
			if ((client.aClass613_8605.method7285(1745482520).aClass536ArrayArrayArray5839) != null)
				Class431.method5242((client.aClass613_8605.method7285(1566686874).aClass536ArrayArrayArray5839), 1221168140);
			aBool2403 = true;
		}
	}

	public static void method3003() {
		if (!aBool2403) {
			Class431.method5242((client.aClass613_8605.method7285(1243732103).aClass536ArrayArrayArray5837), -1431985009);
			if ((client.aClass613_8605.method7285(1504190872).aClass536ArrayArrayArray5839) != null)
				Class431.method5242((client.aClass613_8605.method7285(1580409687).aClass536ArrayArrayArray5839), -1773071249);
			aBool2403 = true;
		}
	}

	public static int method3004(byte i) {
		Class271_Sub1 class271_sub1 = Class11.method549(95204664);
		Class72.method1088(class271_sub1, (byte) 77);
		return class271_sub1.method3664((byte) 10);
	}

	static final void method3005(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class474.method5622(class73, class83, class441, (byte) -15);
	}

	static final void method3006(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3746, client.aClass195_8589.aClass650_2340, -425060442);
		class572_sub25.aRsByteBuffer.writeByte(string.length() + 1, -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -115);
		client.aClass195_8589.method2929(class572_sub25, (byte) -75);
	}

	static final void method3007(Cs2Executor class441, byte i) {
		CharSequence charsequence = ((CharSequence) (((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581 + 1)]));
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class537.method6384(charsequence, 1049530522);
	}

	static final void method3008(Cs2Executor class441, int i) {
		if (Class55.aClass572_Sub10_526 != null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
			((Cs2Executor) class441).aClass572_Sub10_5104 = Class55.aClass572_Sub10_526;
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method3009(Cs2Executor class441, byte i) {
		InterfaceDefinitions class73 = Class512.method6083((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), (short) -1250);
		class73.aClass73Array916 = null;
		class73.aClass73Array917 = null;
		Class555.method6575(class73, (short) 18689);
	}

	public static final void method3010(int i) {
		Class13.anInt97 = 1307292629;
		Class13.anInt106 = 133076638;
		Class13.anInt105 = -660684018;
	}

	static final void method3011(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1;
	}
}
