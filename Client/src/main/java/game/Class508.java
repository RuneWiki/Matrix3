package game;

/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class508 {
	long aLong5601;
	int[] anIntArray5602;
	short[] aShortArray5603;
	short[] aShortArray5604;

	public Class508(long l, int[] is, short[] is_0_, short[] is_1_) {
		((Class508) this).aLong5601 = 6429696504831648207L * l;
		((Class508) this).anIntArray5602 = is;
		((Class508) this).aShortArray5603 = is_0_;
		((Class508) this).aShortArray5604 = is_1_;
	}

	public static void method6038(Class106 class106, long l) {
		Class491.anInt5471 = -294858589 * Class491.anInt5466;
		Class491.anInt5466 = 0;
		Class69.method1067(-2048744099);
		Iterator iterator = Class491.aList5467.iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			boolean bool = class485.method5769(class106, l);
			if (!bool) {
				iterator.remove();
				Class491.aClass485Array5470[Class491.anInt5472 * -1106950525] = class485;
				Class491.anInt5472 = 1218820139 * (1 + -1106950525 * Class491.anInt5472 & (Class100.anIntArray1291[Class491.anInt5481 * -1664530185]));
			}
		}
	}

	static final void method6039(Cs2Executor class441, int i) {
		((Cs2Executor) class441).entity.method10544((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), -2052713351);
	}

	static final void method6040(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (!string.equals(class73.aString829)) {
			class73.aString829 = string;
			Class555.method6575(class73, (short) 10115);
		}
		if (-1 == class73.activeComponent * -1665128073 && !class83.aBool1079)
			Class635.method7559(-1718435171 * class73.selfId, (byte) -14);
	}
}
