package game;

/* Class543 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class543 {
	public Class456_Sub1_Sub2 aClass456_Sub1_Sub2_6099;
	public Class543 aClass543_6100;
	static int anInt6101 = 0;
	static Class543 aClass543_6102;

	void method6440(int i) {
		if (anInt6101 * 398317195 < 500) {
			aClass456_Sub1_Sub2_6099 = null;
			aClass543_6100 = aClass543_6102;
			aClass543_6102 = this;
			anInt6101 += -245145309;
		}
	}

	Class543() {
		/* empty */
	}

	public static void method6441(long[] ls, Object[] objects, int i) {
		Class591.method7004(ls, objects, 0, ls.length - 1, (byte) 100);
	}

	static final void method6442(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class218.method3091(class73, class83, class441, 1177447240);
	}

	static final void method6443(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -5719);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class26.method756(class73, class83, class441, -1166172898);
	}

	static final void method6444(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string.substring(i_1_, i_2_);
	}

	static final void method6445(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_5_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		float f = (float) (2.0 * Math.atan((double) ((float) i_3_ / 2.0F / (float) i_5_)));
		float f_6_ = (float) (2.0 * Math.atan((double) ((float) i_4_ / 2.0F / (float) i_5_)));
		Class133_Sub1.aClass411_Sub1_9827.method4984(f, f_6_, (byte) 36);
	}

	static int method6446(byte[] is, int i, int i_7_, byte i_8_) {
		int i_9_ = -1;
		for (int i_10_ = i; i_10_ < i_7_; i_10_++)
			i_9_ = i_9_ >>> 8 ^ (RSByteBuffer.anIntArray9119[(i_9_ ^ is[i_10_]) & 0xff]);
		i_9_ ^= 0xffffffff;
		return i_9_;
	}

	static final void method6447(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub28_9218, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 1 : 0, 1029715136);
		client.aClass613_8605.method7302(-995727198);
		Class623.method7443(-1396969654);
		client.aBool8854 = false;
	}
}
