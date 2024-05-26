package game;

/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class265 {
	public static final int anInt2835 = 1;
	public static final int anInt2836 = 2;
	public static final int anInt2837 = 3;
	public static final int anInt2838 = 4;
	public static final int anInt2839 = 0;

	Class265() throws Throwable {
		throw new Error();
	}

	public static void method3623(int i) {
		Class491.aClass676_5468 = new Class676(8);
		Class491.anInt5480 = 0;
		Iterator iterator = Class491.aList5467.iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			class485.method5785();
		}
	}

	static final void method3624(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (Class637.aBool8266) {
			Class654[] class654s = Class18.method680(-1737032572);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class654s[i_0_].anInt8402 * 2075359157;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class654s[i_0_].anInt8401 * 1799291061;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		}
	}

	public static Class668[] method3625(int i) {
		return (new Class668[] { Class668.aClass668_8511, Class668.aClass668_8514, Class668.aClass668_8512, Class668.aClass668_8515, Class668.aClass668_8513 });
	}

	static final void method3626(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub34_9223.method9172(-1436059364) ? 1 : 0;
	}
}
