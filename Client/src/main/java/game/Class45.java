package game;

/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45 implements Interface52 {
	static Class45 aClass45_446;
	static Class45 aClass45_447;
	static Class45 aClass45_448 = new Class45(5, 1);
	static Class45 aClass45_449;
	static Class45 aClass45_450;
	static Class45 aClass45_451;
	static Class45 aClass45_452;
	static Class45 aClass45_453;
	static Class45 aClass45_454;
	static Class45 aClass45_455;
	static Class45 aClass45_456 = new Class45(6, 2);
	static Class45 aClass45_457;
	static Class45 aClass45_458;
	static Class45 aClass45_459;
	int anInt460;
	int anInt461;

	public int method61() {
		return ((Class45) this).anInt461 * 136433529;
	}

	Class45(int i, int i_0_) {
		((Class45) this).anInt460 = i * -1691356129;
		((Class45) this).anInt461 = i_0_ * -1427346743;
	}

	static {
		aClass45_447 = new Class45(9, 3);
		aClass45_449 = new Class45(4, 4);
		aClass45_450 = new Class45(11, 5);
		aClass45_451 = new Class45(13, 6);
		aClass45_452 = new Class45(0, 7);
		aClass45_453 = new Class45(8, 8);
		aClass45_454 = new Class45(12, 9);
		aClass45_455 = new Class45(2, 10);
		aClass45_458 = new Class45(7, 11);
		aClass45_457 = new Class45(10, 12);
		aClass45_446 = new Class45(1, 13);
		aClass45_459 = new Class45(3, 14);
	}

	static Class45[] method824(int i) {
		return (new Class45[] { aClass45_452, aClass45_446, aClass45_455, aClass45_459, aClass45_449, aClass45_448, aClass45_456, aClass45_458, aClass45_453, aClass45_447, aClass45_457, aClass45_450,
			aClass45_454, aClass45_451 });
	}

	public int method143() {
		return ((Class45) this).anInt461 * 136433529;
	}

	public int method45() {
		return ((Class45) this).anInt461 * 136433529;
	}

	public int method43() {
		return ((Class45) this).anInt461 * 136433529;
	}

	public int getId(int i) {
		return ((Class45) this).anInt461 * 136433529;
	}

	static final void method825(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_1_ < 0)
			i_1_ = 0;
		client.anInt8684 = (i_1_ + client.anInt8683 * -519332127) * 375988009;
	}

	public static Class642 method826(String string, int i, int i_2_) {
		Class642_Sub1 class642_sub1 = new Class642_Sub1();
		((Class642) class642_sub1).aString8296 = string;
		((Class642) class642_sub1).anInt8297 = -1961062997 * i;
		return class642_sub1;
	}

	static void method827(Class271_Sub1 class271_sub1, int i, int i_3_, int i_4_) {
		class271_sub1.method8357(i, -1374541273);
		int i_5_;
		if (i_3_ > 100000) {
			Class390.method4710((byte) 13);
			i_5_ = 4;
		} else if (i_3_ > 50000) {
			Class613.method7363((byte) 0);
			i_5_ = 3;
		} else if (i_3_ > 10000) {
			Class120.method2178((byte) 4);
			i_5_ = 2;
		} else {
			Class92.method1532(true, -1090110180);
			i_5_ = 1;
		}
		if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1609295755) != i) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), i, 1256903642);
			BaseVarType.method7260(i, false, 1487302362);
		} else
			Class213.aClass572_Sub24_2463.method8612((Class213.aClass572_Sub24_2463.aClass665_Sub30_9205), true, (byte) -58);
		Class623.method7443(-1013187147);
		class271_sub1.method8354(i_5_, 2050743846);
	}

	static void method828(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class183.method2818(string, 779241698);
	}
}
