package game;

/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class542 {
	static boolean aBool6098;

	Class542() throws Throwable {
		throw new Error();
	}

	public static Class284 method6435(Class248 class248, int i, byte i_0_) {
		byte[] is = class248.method3373(i, (byte) -7);
		if (is == null)
			return null;
		return new Class284(is);
	}

	public static int method6436(int i, int i_1_, boolean bool, short i_2_) {
		ItemsContainer class572_sub31 = Class447.getContainer(i, bool, -13282137);
		if (class572_sub31 == null)
			return 0;
		if (-1 == i_1_)
			return 0;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < ((ItemsContainer) class572_sub31).itemAmounts.length; i_4_++) {
			if (i_1_ == ((ItemsContainer) class572_sub31).itemIds[i_4_])
				i_3_ += ((ItemsContainer) class572_sub31).itemAmounts[i_4_];
		}
		return i_3_;
	}

	static final void method6437(Cs2Executor class441, int i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4994(-1043011738) != Class413.aClass413_4910)
			throw new RuntimeException();
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class133_Sub1.aClass411_Sub1_9827.method5040(347147114);
	}

	public static void method6438(int i, String string, boolean bool, int i_5_) {
		if (Class320.method4100(-544366613)) {
			if (i != -2082178003 * Class13.anInt68)
				Class13.aLong79 = -4922727120155625359L;
			Class13.anInt68 = -916769883 * i;
			Class13.aString99 = string;
			Class13.aBool75 = bool;
			Class463.method5478(2, 426960661);
		}
	}

	static final long method6439(int i) {
		return (((long) ((Class439.anInt5092 += 500760403) * 1732091099 - 1) << 32) | 0xffffffffL);
	}
}
