package game;

/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class235 {
	public static final int anInt2637 = 6;
	public static final int anInt2638 = 4;
	public static final int anInt2639 = 3;
	public static final int anInt2640 = 5;
	public static final int anInt2641 = 2;
	public static final int anInt2642 = 1;

	Class235() throws Throwable {
		throw new Error();
	}

	static final void method3226(int i) {
		for (Class572_Sub12_Sub6 class572_sub12_sub6 = ((Class572_Sub12_Sub6) client.aClass675_8774.method7932((byte) 50)); class572_sub12_sub6 != null; class572_sub12_sub6 = ((Class572_Sub12_Sub6) client.aClass675_8774.method7926(1050424482))) {
			Class456_Sub1_Sub2_Sub5 class456_sub1_sub2_sub5 = (((Class572_Sub12_Sub6) class572_sub12_sub6).aClass456_Sub1_Sub2_Sub5_11367);
			if (client.cycles > class456_sub1_sub2_sub5.anInt11739 * 1095263993) {
				class572_sub12_sub6.method6794((byte) 28);
				class456_sub1_sub2_sub5.method10642((byte) -73);
			} else if (client.cycles >= class456_sub1_sub2_sub5.anInt11748 * 1176691683) {
				class456_sub1_sub2_sub5.method10637(1655260268);
				if (2125689013 * class456_sub1_sub2_sub5.anInt11759 > 0) {
					if (4 == 1797623853 * client.anInt8646) {
						Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1].method2268(-1778908314);
						if (class456_sub1_sub2_sub3 != null) {
							Class240 class240 = (class456_sub1_sub2_sub3.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < client.aClass613_8605.method7347(1170420191) * 512) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < client.aClass613_8605.method7278(277214477) * 512))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -1938311937)) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), client.cycles, (byte) -39);
						}
					} else {
						LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) ((2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < client.aClass613_8605.method7347(-103627972) * 512) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < client.aClass613_8605.method7278(277214477) * 512))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub5.aByte9009, -1882682895)) - 1284627787 * (class456_sub1_sub2_sub5.anInt11741)), client.cycles, (byte) -120);
						}
					}
				}
				if (class456_sub1_sub2_sub5.anInt11759 * 2125689013 < 0) {
					int i_0_ = (-(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1);
					Player class456_sub1_sub2_sub3_sub2;
					if (-1921142451 * client.anInt8728 == i_0_)
						class456_sub1_sub2_sub3_sub2 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_0_]);
					if (null != class456_sub1_sub2_sub3_sub2) {
						Class240 class240 = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
						if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < client.aClass613_8605.method7347(-1184944013) * 512) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < (client.aClass613_8605.method7278(277214477) * 512)))
							class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, (Class314.method4072((int) (class240.aFloat2653), (int) (class240.aFloat2657), (class456_sub1_sub2_sub5.aByte9009), -2108649027) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), client.cycles, (byte) -36);
					}
				}
				class456_sub1_sub2_sub5.method10640(855188961 * client.anInt8674, (byte) 38);
				client.aClass613_8605.method7285(1389834086).method6232(class456_sub1_sub2_sub5, true, -2054968496);
			}
		}
	}
}
