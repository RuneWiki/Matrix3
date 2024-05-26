package game;

/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchWebcamDevice;

final class Class476 implements Runnable {
	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_8973.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_8973 = null;
	}

	public void method5632() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_8973.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_8973 = null;
	}

	static final void method5633(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class523.method6298(class73, class83, class441, 1058411017);
	}

	static final void method5634(Cs2Executor class441, byte i) {
		if (Class637.aBool8266 && Class554.aFrame6320 != null)
			Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(-2022571447), -1, -1, false, 623786968);
	}

	static void method5635(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		TwitchWebcamDevice twitchwebcamdevice = Class380.method4642(i_0_, (byte) 34);
		if (twitchwebcamdevice == null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = twitchwebcamdevice.method2696();
	}

	static final void method5636(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= -1235064193;
		Class527.method6313((String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]), (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581 + 1]), (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr + 2]), ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1), true, 1019967701);
	}

	static final void method5637(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = BaseVarType.anInt7965 * -1205417433;
	}

	static final void method5638(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (Class547_Sub1.aClass676_8991 != null) {
			Class572 class572 = Class547_Sub1.aClass676_8991.get((long) i_1_);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = null != class572 ? 1 : 0;
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method5639(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) -1340);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class102.method1637(class73, class83, class441, (byte) 10);
	}
}
