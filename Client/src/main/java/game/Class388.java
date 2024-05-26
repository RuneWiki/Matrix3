package game;

/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class388 {
	public static final int anInt4648 = 2;
	public static final int anInt4649 = 4;
	public static final int anInt4650 = 1;
	public static final int anInt4651 = 3;

	Class388() throws Throwable {
		throw new Error();
	}

	static final void method4690(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -2077505705 * client.exchangeSlots[i_0_].anInt7820;
	}

	static void method4691(int i) {
		Class184.anInt2163 = 0;
		for (int i_1_ = 0; i_1_ < 2048; i_1_++) {
			Class184.aClass572_Sub15Array2157[i_1_] = null;
			Class184.aClass572_Sub15Array2158[i_1_] = null;
			Class184.aByteArray2159[i_1_] = Class453.aClass453_5177.aByte5183;
			Class184.aClass6Array2166[i_1_] = null;
		}
	}

	static final void method4692(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1657391224) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray730 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static void method4693(int i) {
		if (Class334.method4218((byte) 122)) {
			if (null == LinkableInt.aStringArray9257)
				Class501.method5994(1928373673);
			Class190.aBool2238 = true;
			Class190.anInt2243 = 0;
			Class672.anIntArray8532 = new int[100];
			Class8.anIntArray42 = new int[100];
			Class190.anIntArray2234 = new int[100];
			Class507.anIntArray5599 = new int[100];
			for (int i_2_ = 0; i_2_ < 100; i_2_++) {
				Class672.anIntArray8532[i_2_] = ((int) (Math.random() * (double) (1960824389 * Class269.anInt2861)) << 4) + (int) (Math.random() * 15.0);
				Class8.anIntArray42[i_2_] = (int) (Math.random() * 350.0) << 4;
				Class190.anIntArray2234[i_2_] = (int) (Math.random() * 102.0) + 51;
				Class507.anIntArray5599[i_2_] = 8 + (int) (Math.random() * 48.0);
			}
			Class572_Sub12_Sub6.anIntArray11366 = new int[Class269.anInt2861 * 1960824389 >> 1];
		}
	}

	static void method4694(long l) {
		Class273.aCalendar2899.setTime(new Date(l));
	}
}
