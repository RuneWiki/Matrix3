package game;

/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Cs2CallPointer {
	int instrPtr = 127045027;
	Cs2Script script;
	int[] intLocals;
	Object[] objectLocals;
	long[] longLocals;
	static int anInt5332;

	Cs2CallPointer() {
		/* empty */
	}

	static final Object[] method5626(String string, Cs2Executor class441, int i) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
			if (string.charAt(i_0_ - 1) == 's')
				objects[i_0_] = (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
			else if (string.charAt(i_0_ - 1) == 'l')
				objects[i_0_] = new Long(((Cs2Executor) class441).longStack[(((Cs2Executor) class441).longStackPtr -= -879214973) * 1097105451]);
			else
				objects[i_0_] = new Integer(((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
		}
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_1_ != -1)
			objects[0] = new Integer(i_1_);
		else
			objects = null;
		return objects;
	}

	public static int method5627(int i, int i_2_) {
		int i_3_ = i >>> 1;
		i_3_ |= i_3_ >>> 1;
		i_3_ |= i_3_ >>> 2;
		i_3_ |= i_3_ >>> 4;
		i_3_ |= i_3_ >>> 8;
		i_3_ |= i_3_ >>> 16;
		return i & (i_3_ ^ 0xffffffff);
	}

	static String method5628(long l, int i, int i_4_) {
		Class388.method4694(l);
		int i_5_ = Class273.aCalendar2899.get(5);
		int i_6_ = Class273.aCalendar2899.get(2) + 1;
		int i_7_ = Class273.aCalendar2899.get(1);
		return new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append("/").append(i_6_ / 10).append(i_6_ % 10).append("/").append(i_7_ % 100 / 10).append(i_7_ % 10).toString();
	}

	static final void method5629(Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int[] is = Class482.method5745(i_8_, (byte) 10);
		Class432.method5244(is, 0, ((Cs2Executor) class441).intStack, 1369304407 * ((Cs2Executor) class441).intStackPtr, 3);
		((Cs2Executor) class441).intStackPtr += 1168763701;
	}

	static final void method5630(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_9_, (short) -22763);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.method7992(class73).method8647((byte) 0);
	}

	static String method5631(int i, Class435 class435, Class484 class484, byte i_10_) {
		if (i < 100000)
			return new StringBuilder().append(Class17.method677(class484.anInt5416 * -1114624631, 651099360)).append(i).append(ItemDefinitions.aString8193).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class17.method677(-1982102559 * class484.anInt5417, 1552075011)).append(i / 1000).append(Class279.aClass279_3079.method3758(class435, 16711935)).append(ItemDefinitions.aString8193).toString();
		return new StringBuilder().append(Class17.method677(1559633749 * class484.anInt5418, 1105874525)).append(i / 1000000).append(Class279.aClass279_3092.method3758(class435, 16711935)).append(ItemDefinitions.aString8193).toString();
	}
}
