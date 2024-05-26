package game;

/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class11 {
	Class11() throws Throwable {
		throw new Error();
	}

	static void method547() {
		/* empty */
	}

	public static int method548() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class106 class106 = Class435.method5263(0, canvas, null, null, null, null, null, null, 0, 1961632308);
		long l = Class69.method1067(-1986344174);
		for (int i = 0; i < 10000; i++)
			class106.method1670(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (Class69.method1067(-1640310093) - l);
		class106.method1720(0, 0, 100, 100, -16777216, (byte) -40);
		class106.method1666(-1453707529);
		return i;
	}

	static Class271_Sub1 method549(int i) {
		Class271_Sub1 class271_sub1 = new Class271_Sub1();
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		if (Class572_Sub12_Sub2.aString11255.startsWith("win")) {
			bool_0_ = true;
			bool = true;
			bool_1_ = true;
		} else {
			bool = true;
			bool_1_ = true;
		}
		if (Class200.aBool2389) {
			class271_sub1.method8356(16, (byte) 24);
			bool = false;
		}
		if (Class200.aBool2388) {
			class271_sub1.method8356(32, (byte) 24);
			bool_0_ = false;
		}
		if (Class200.aBool2381) {
			class271_sub1.method8356(16384, (byte) 24);
			bool_1_ = false;
		}
		if (!bool && !bool_0_) {
			Class510.method6075(class271_sub1, -1365085410);
			return class271_sub1;
		}
		int i_2_ = -1;
		int i_3_ = -1;
		int i_4_ = -1;
		if (bool_0_) {
			try {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 3, 1760589420);
				Class623.method7443(-1481895009);
				i_3_ = Class491.method5862(3, 1000, (byte) 93);
				if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1530826620) == 3) {
					class271_sub1.method8356(4, (byte) 24);
					Class165 class165 = Class272_Sub2.aClass106_9517.method1662();
					long l = (class165.aLong2046 * -2707634995017507005L & 0xffffffffffffL);
					switch (-1937478109 * class165.anInt2042) {
						case 4098: {
							boolean bool_5_ = l >= 60129613779L;
							bool &= bool_5_;
							if (!bool_5_)
								class271_sub1.method8356(512, (byte) 24);
							break;
						}
						case 4318: {
							boolean bool_6_ = l >= 64425238954L;
							bool &= bool_6_;
							if (!bool_6_)
								class271_sub1.method8356(256, (byte) 24);
							break;
						}
					}
				}
			} catch (Exception exception) {
				class271_sub1.method8356(4096, (byte) 24);
			}
		}
		if (bool_1_) {
			try {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 5, 699827188);
				Class623.method7443(-1762800020);
				i_4_ = Class491.method5862(5, 1000, (byte) 108);
				if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1973647073) == 5)
					class271_sub1.method8356(8192, (byte) 24);
			} catch (Exception exception) {
				class271_sub1.method8356(32768, (byte) 24);
			}
		}
		if (bool) {
			try {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 4, 1333184767);
				Class623.method7443(-1080486529);
				i_2_ = Class491.method5862(1, 1000, (byte) 10);
				if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1649416329) == 1)
					class271_sub1.method8356(2, (byte) 24);
			} catch (Exception exception) {
				class271_sub1.method8356(2048, (byte) 24);
			}
		}
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 743886113);
		if (i_2_ == -1 && -1 == i_3_) {
			Class510.method6075(class271_sub1, 173861058);
			return class271_sub1;
		}
		class271_sub1.method8358(3, i_3_, 1517188485);
		class271_sub1.method8358(1, i_2_, -201769227);
		class271_sub1.method8358(5, i_4_, -529845921);
		i_3_ *= 1.3F;
		if (i_3_ > 100000 && i_2_ > 100000 || i_3_ > i_2_)
			Class45.method827(class271_sub1, 3, -1 == i_2_ ? i_3_ : i_2_, 446517731);
		else
			Class45.method827(class271_sub1, 1, i_3_ == -1 ? i_2_ : i_3_, 1434968791);
		return class271_sub1;
	}

	static final void method550(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		boolean bool = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) == 1);
		int i_7_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -3675);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class665_Sub5.method8155(class73, class83, class441, (bool ? Class68.aClass68_700 : Class68.aClass68_696), -595473884);
	}

	static final void method551(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class594.aClass435_7823.getId(1663100083);
	}

	static final void method552(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class602.method7092(class73, class83, class441, -767431539);
	}

	static final void method553(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intLocals[(((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039])] = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
	}

	static final void method554(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		class73.aBool820 = i_8_ == 1;
		Class555.method6575(class73, (short) 28162);
	}
}
