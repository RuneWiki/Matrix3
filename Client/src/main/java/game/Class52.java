package game;

/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

class Class52 implements Interface31 {
	Class54 this$0;
	public static Image anImage492;

	public float method153() {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728) / 255.0F);
	}

	public float method152(byte i) {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728) / 255.0F);
	}

	Class52(Class54 class54) {
		((Class52) this).this$0 = class54;
	}

	static final void method909(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub4_9200.method8139(16711935) ? 1 : 0;
	}

	static final void method910(Entity class456_sub1_sub2_sub3, byte i) {
		Class663_Sub2 class663_sub2 = class456_sub1_sub2_sub3.aClass663_Sub2_11631;
		if (class663_sub2.method7786(-553192533) && class663_sub2.method7802(1, -689036020) && class663_sub2.method7800(-24083291)) {
			if (class663_sub2.aBool9556) {
				class663_sub2.method7791(class456_sub1_sub2_sub3.method10554((byte) -79).method6394(906957470), false, true, (byte) 77);
				class663_sub2.aBool9556 = class663_sub2.method7786(188352026);
			}
			class663_sub2.method7799(1157540062);
		}
		for (int i_0_ = 0; i_0_ < class456_sub1_sub2_sub3.currentGraphics.length; i_0_++) {
			if (-1 != (class456_sub1_sub2_sub3.currentGraphics[i_0_].id * -1701003211)) {
				Class663 class663 = (class456_sub1_sub2_sub3.currentGraphics[i_0_].aClass663_7776);
				if (class663.method7793(-1949487864)) {
					GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition((class456_sub1_sub2_sub3.currentGraphics[i_0_].id) * -1701003211, -1268955787)));
					AnimationDefinition class132 = class663.method7787(153948485);
					if (class659.aBool8427) {
						if (3 == class132.anInt1556 * 802199755) {
							if ((class456_sub1_sub2_sub3.anInt11663 * 78705827 > 0) && (class456_sub1_sub2_sub3.anInt11638 * 88781565) <= client.cycles && ((-1601124661 * class456_sub1_sub2_sub3.anInt11639) < client.cycles)) {
								class663.method7801(-1, 751680147);
								class456_sub1_sub2_sub3.currentGraphics[i_0_].id = 803171811;
								continue;
							}
						} else if (1 == class132.anInt1556 * 802199755 && (class456_sub1_sub2_sub3.anInt11663 * 78705827) > 0 && ((88781565 * class456_sub1_sub2_sub3.anInt11638) <= client.cycles) && ((-1601124661 * class456_sub1_sub2_sub3.anInt11639) < client.cycles))
							continue;
					}
				}
				if (class663.method7802(1, -750498755) && class663.method7800(-24083291)) {
					class663.method7801(-1, 751680147);
					class456_sub1_sub2_sub3.currentGraphics[i_0_].id = 803171811;
				}
			}
		}
		Class663 class663 = class456_sub1_sub2_sub3.aClass663_11670;
		do {
			if (class663.method7786(-776113597)) {
				AnimationDefinition class132 = class663.method7787(153948485);
				if (3 == 802199755 * class132.anInt1556) {
					if (78705827 * class456_sub1_sub2_sub3.anInt11663 > 0 && (class456_sub1_sub2_sub3.anInt11638 * 88781565 <= client.cycles) && (class456_sub1_sub2_sub3.anInt11639 * -1601124661 < client.cycles)) {
						class456_sub1_sub2_sub3.anIntArray11640 = null;
						class663.method7801(-1, 751680147);
						break;
					}
				} else if (class132.anInt1556 * 802199755 == 1) {
					if (78705827 * class456_sub1_sub2_sub3.anInt11663 > 0 && (class456_sub1_sub2_sub3.anInt11638 * 88781565 <= client.cycles) && (-1601124661 * class456_sub1_sub2_sub3.anInt11639 < client.cycles)) {
						class663.method7827(1, -1887056625);
						break;
					}
					class663.method7827(0, -1777993984);
				}
				if (class663.method7802(1, -2085292269) && class663.method7800(-24083291)) {
					class456_sub1_sub2_sub3.anIntArray11640 = null;
					class663.method7801(-1, 751680147);
				}
			}
		} while (false);
		for (int i_1_ = 0; (i_1_ < class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650.length); i_1_++) {
			Class663_Sub3_Sub1 class663_sub3_sub1 = class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_1_];
			if (class663_sub3_sub1 != null) {
				if (2005911033 * class663_sub3_sub1.anInt11267 > 0)
					class663_sub3_sub1.anInt11267 -= -1120408503;
				else if (class663_sub3_sub1.method7802(1, -875317430) && class663_sub3_sub1.method7800(-24083291))
					class456_sub1_sub2_sub3.aClass663_Sub3_Sub1Array11650[i_1_] = null;
			}
		}
	}
}
