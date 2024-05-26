package game;

/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class431 {
	int anInt5035;
	Class497 aClass497_5036;
	public static int anInt5037;

	public Class431(Class497 class497, int i) {
		((Class431) this).aClass497_5036 = class497;
		((Class431) this).anInt5035 = 1563819135 * i;
	}

	public Class456_Sub1_Sub5_Sub1 method5241(byte i) {
		Class572_Sub42 class572_sub42 = ((Class572_Sub42) (client.aClass676_8749.get((long) ((-1080556115 * ((Class431) this).aClass497_5036.anInt5504) << 28 | (((Class431) this).aClass497_5036.localY * 417324155) << 14 | (((Class431) this).aClass497_5036.localX * -2109597897)))));
		if (null == class572_sub42)
			return null;
		Class497 class497 = client.aClass613_8605.method7280((byte) -50);
		int i_0_ = (((Class431) this).aClass497_5036.localX * -2109597897 - class497.localX * -2109597897);
		int i_1_ = (417324155 * ((Class431) this).aClass497_5036.localY - 417324155 * class497.localY);
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass613_8605.method7347(629501330) && i_1_ < client.aClass613_8605.method7278(277214477) && client.aClass613_8605.method7285(1227435658) != null) {
			for (Class572_Sub40 class572_sub40 = ((Class572_Sub40) class572_sub42.aClass675_9435.method7932((byte) 50)); null != class572_sub40; class572_sub40 = (Class572_Sub40) class572_sub42.aClass675_9435.method7926(1933881982)) {
				if (class572_sub40.anInt9401 * 1544118073 == ((Class431) this).anInt5035 * -1214397569)
					return ((Class456_Sub1_Sub5_Sub1) (client.aClass613_8605.method7285(1421216328).method6286((-1080556115 * ((Class431) this).aClass497_5036.anInt5504), i_0_, i_1_, (byte) 0)));
			}
		}
		return null;
	}

	static void method5242(Class536[][][] class536s, int i) {
		for (int i_2_ = 0; i_2_ < class536s.length; i_2_++) {
			Class536[][] class536s_3_ = class536s[i_2_];
			for (int i_4_ = 0; i_4_ < class536s_3_.length; i_4_++) {
				for (int i_5_ = 0; i_5_ < class536s_3_[i_4_].length; i_5_++) {
					Class536 class536 = class536s_3_[i_4_][i_5_];
					if (null != class536) {
						if (class536.aClass456_Sub1_Sub1_5992 instanceof Interface65)
							((Interface65) class536.aClass456_Sub1_Sub1_5992).method387(-661425044);
						if (class536.aClass456_Sub1_Sub3_5998 instanceof Interface65)
							((Interface65) class536.aClass456_Sub1_Sub3_5998).method387(-428664012);
						if (class536.aClass456_Sub1_Sub3_5990 instanceof Interface65)
							((Interface65) class536.aClass456_Sub1_Sub3_5990).method387(-88016368);
						if (class536.aClass456_Sub1_Sub4_5988 instanceof Interface65)
							((Interface65) class536.aClass456_Sub1_Sub4_5988).method387(-743136121);
						if (class536.aClass456_Sub1_Sub4_5989 instanceof Interface65)
							((Interface65) class536.aClass456_Sub1_Sub4_5989).method387(-590193503);
						for (Class543 class543 = class536.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
							Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
							if (class456_sub1_sub2 instanceof Interface65)
								((Interface65) class456_sub1_sub2).method387(-116186354);
						}
					}
				}
			}
		}
	}

	static final void method5243(int i) {
		Class439.anInt5082 -= -246557743;
	}
}
