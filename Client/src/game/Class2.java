package game;

/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2 {
	static final int anInt18 = 127;
	static final int anInt19 = 7;
	static int anInt20;
	public static Class134 aClass134_21;

	Class2() throws Throwable {
		throw new Error();
	}

	public static void method474(int i, int i_0_, float f, Interface31 interface31, int i_1_) {
		if (null != Class465.aClass289_5235)
			Class465.aClass289_5235.method3894(1437440563).method3954(i, i_0_, f, interface31, 2042263435);
	}

	static final void method475(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (-1 == i_2_) {
			int i_3_ = i_2_ >> 14 & 0x3fff;
			int i_4_ = i_2_ & 0x3fff;
			Class497 class497 = client.aClass613_8605.method7280((byte) -124);
			i_3_ -= class497.localX * -2109597897;
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ >= client.aClass613_8605.method7347(1658000243))
				i_3_ = client.aClass613_8605.method7347(-660386801);
			i_4_ -= 417324155 * class497.localY;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ >= client.aClass613_8605.method7278(277214477))
				i_4_ = client.aClass613_8605.method7278(277214477);
			Class566.anInt6375 = ((i_3_ << 9) + 256) * -2114279121;
			Class419.anInt4958 = -1724865785 * ((i_4_ << 9) + 256);
		} else {
			Class566.anInt6375 = 2114279121;
			Class419.anInt4958 = 1724865785;
		}
	}

	static void method476(byte i) {
		int i_5_ = Class269.anInt2861 * 1960824389;
		int i_6_ = client.anInt7739 * -530390519;
		if (Class656.anInt8418 * -1987897329 < i_5_)
			i_5_ = -1987897329 * Class656.anInt8418;
		if (Class287.anInt3421 * -257945127 < i_6_)
			i_6_ = Class287.anInt3421 * -257945127;
		try {
			if (null != Class213.aClass572_Sub24_2463)
				Class212.aClass212_2447.method3056((new Object[] { Integer.valueOf(i_5_), Integer.valueOf(i_6_), Integer.valueOf(Class344_Sub2.method9253(1913861609)),
					Integer.valueOf(Class213.aClass572_Sub24_2463.aClass665_Sub7_9227.method8165(883129919)) }), -1019552311);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public static void method477(int i) {
		Class547_Sub1.aHashMap8990.clear();
		Class547_Sub1.aHashMap8980.clear();
	}
}
