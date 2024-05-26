package game;

/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194 {
	Class194() throws Throwable {
		throw new Error();
	}

	static final void method2922(Cs2Executor class441, short i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == 1472719885 * client.anInt8861 && i_0_ < client.anInt8860 * 681720871)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_0_].anInt214 * -1255973953;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method2923(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class65.method1034((String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]), (String) (((Cs2Executor) class441).objectStack[1 + ((Cs2Executor) class441).objectStackPtr * 1628307581]), Class594.aClass435_7823, 16711935));
	}

	static final void method2924(byte i) {
		for (int i_1_ = 0; i_1_ < client.anInt8625 * 765313669; i_1_++) {
			int i_2_ = client.anIntArray8626[i_1_];
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_2_));
			if (null != class572_sub9) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
				Class461.method5469(class456_sub1_sub2_sub3_sub1, false, 1700951586);
			}
		}
	}

	public static void method2925(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class335_Sub1.anInt9694 = 0;
		if (client.anInt8870 * 696710655 != client.anInt8868 * 795655825 || bool != client.aBool8871 || !string.equals(Class294.aString3456)) {
			Class294.aString3456 = string;
			client.anInt8870 = client.anInt8868 * -1679168657;
			client.aBool8871 = bool;
			short[] is = new short[16];
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < 1292974489 * Class672.aClass639_Sub5_8533.anInt8284; i_4_++) {
				ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_4_, 1162003672));
				if ((!bool || class631.aBool8183) && class631.anInt8169 * 1138984625 == -1 && 823999695 * class631.anInt8172 == -1 && -1 == 269209991 * class631.anInt8188 && 0 == class631.anInt8184 * -1116319601 && (class631.aString8180.toLowerCase().indexOf(string) != -1)) {
					if (i_3_ >= 250) {
						Class626.anInt8089 = 2020101997;
						Class298.aShortArray3480 = null;
						return;
					}
					if (i_3_ >= is.length) {
						short[] is_5_ = new short[is.length * 2];
						for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
							is_5_[i_6_] = is[i_6_];
						is = is_5_;
					}
					is[i_3_++] = (short) i_4_;
				}
			}
			Class298.aShortArray3480 = is;
			Class626.anInt8089 = -2020101997 * i_3_;
			String[] strings = new String[43052443 * Class626.anInt8089];
			for (int i_7_ = 0; i_7_ < 43052443 * Class626.anInt8089; i_7_++)
				strings[i_7_] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(is[i_7_], 2067376356)).aString8180);
			Class455.method5389(strings, Class298.aShortArray3480, (byte) -87);
		}
	}
}
