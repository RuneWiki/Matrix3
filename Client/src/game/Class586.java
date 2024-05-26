package game;

/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class586 {
	public int id = 803171811;
	public int height;
	public Class663 aClass663_7776;
	public int anInt7777;
	public int anInt7778;
	public static Class502 aClass502_7779;

	Class586(Entity class456_sub1_sub2_sub3) {
		aClass663_7776 = new Class663_Sub3(class456_sub1_sub2_sub3, false);
	}

	public static Class580 method6956(int i, int i_0_, int i_1_, int i_2_, Interface18 interface18, Interface18 interface18_3_, int i_4_) {
		Class571[] class571s = null;
		Class551 class551 = (Class551) interface18.getDefinition(i, 107084326);
		if (null != ((Class551) class551).anIntArray6302) {
			class571s = new Class571[((Class551) class551).anIntArray6302.length];
			for (int i_5_ = 0; i_5_ < class571s.length; i_5_++) {
				Class408 class408 = ((Class408) interface18_3_.getDefinition((((Class551) class551).anIntArray6302[i_5_]), 259510185));
				class571s[i_5_] = new Class571(class408.anInt4769 * 2087155233, -400207495 * class408.anInt4776, class408.anInt4771 * -332663037, 33963699 * class408.anInt4772, class408.anInt4778 * -1860765811, 1790034289 * class408.anInt4770, -592751923 * class408.anInt4775, class408.aBool4774, -971724699 * class408.anInt4777, 273962879 * class408.anInt4773, class408.anInt4779 * -540640579);
			}
		}
		return new Class580(-2010195621 * ((Class551) class551).anInt6303, class571s, -499331353 * ((Class551) class551).anInt6304, i_0_, i_1_, i_2_, ((Class551) class551).aClass554_6305, 42805115 * ((Class551) class551).anInt6306);
	}

	static final void method6957(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1921142451 * client.anInt8728;
	}

	static final void method6958(Cs2Executor class441, short i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == 1472719885 * client.anInt8861 && i_6_ < 681720871 * client.anInt8860)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_6_].aBool213 ? 1 : 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}
