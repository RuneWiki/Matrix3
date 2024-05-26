package game;

/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class611 {
	public int anInt7972;
	public int anInt7973;
	public int anInt7974;
	public int anInt7975;
	public static Player aClass456_Sub1_Sub2_Sub3_Sub2_7976;

	Class611(int i, int i_0_, int i_1_, int i_2_) {
		anInt7974 = i * -1032657853;
		anInt7973 = 1902907615 * i_0_;
		anInt7972 = 811178993 * i_1_;
		anInt7975 = -1642372219 * i_2_;
	}

	Class611() {
		anInt7974 = (32 + (int) (Math.random() * 4.0)) * -1032657853;
		anInt7973 = (3 + (int) (Math.random() * 2.0)) * 1902907615;
		anInt7972 = (16 + (int) (Math.random() * 3.0)) * 811178993;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1424933798) == 1)
			anInt7975 = (int) (Math.random() * 6.0) * -1642372219;
		else
			anInt7975 = (int) (Math.random() * 12.0) * -1642372219;
	}

	static void method7268(Class83 class83, InterfaceDefinitions class73, byte i) {
		if (null != class73) {
			if (class73.activeComponent * -1665128073 != -1) {
				InterfaceDefinitions class73_3_ = (class83.aClass73Array1081[class73.anInt768 * -1604592419 & 0xffff]);
				if (class73_3_ != null) {
					if (class73_3_.aClass73Array917 == class73_3_.aClass73Array916) {
						class73_3_.aClass73Array917 = new InterfaceDefinitions[class73_3_.aClass73Array916.length];
						class73_3_.aClass73Array917[0] = class73;
						Class432.method5246(class73_3_.aClass73Array916, 0, class73_3_.aClass73Array917, 1, class73.activeComponent * -1665128073);
						Class432.method5246(class73_3_.aClass73Array916, -1665128073 * class73.activeComponent + 1, class73_3_.aClass73Array917, class73.activeComponent * -1665128073 + 1, (class73_3_.aClass73Array916.length - -1665128073 * class73.activeComponent - 1));
					} else {
						int i_4_ = 0;
						InterfaceDefinitions[] class73s;
						for (class73s = class73_3_.aClass73Array917; (i_4_ < class73s.length && class73s[i_4_] != class73); i_4_++) {
							/* empty */
						}
						if (i_4_ < class73s.length) {
							Class432.method5246(class73s, 0, class73s, 1, i_4_);
							class73s[0] = class73;
						}
					}
				}
			} else {
				InterfaceDefinitions[] class73s = class83.method1255((byte) -38);
				int i_5_;
				for (i_5_ = 0; i_5_ < class73s.length && class73 != class73s[i_5_]; i_5_++) {
					/* empty */
				}
				if (i_5_ < class73s.length) {
					Class432.method5246(class73s, 0, class73s, 1, i_5_);
					class73s[0] = class73;
				}
			}
		}
	}

	static final void method7269(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aStringArray867 = null;
	}

	static void method7270(Cs2Executor class441, short i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		String string_6_ = (String) (((Cs2Executor) class441).objectStack[1 + 1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class582.method6874(string, string_6_, 1272757203);
	}

	public static void method7271(String string, boolean bool, boolean bool_7_, byte i) {
		Class447.method5347(string, bool, "openjs", bool_7_, 601468371);
	}

	static final void method7272(Entity class456_sub1_sub2_sub3, short i) {
		int i_8_ = 88781565 * class456_sub1_sub2_sub3.anInt11638 - client.cycles;
		int i_9_ = (2012755456 * class456_sub1_sub2_sub3.anInt11634 + class456_sub1_sub2_sub3.method10556((short) -10169) * 256);
		int i_10_ = (1522627072 * class456_sub1_sub2_sub3.anInt11636 + class456_sub1_sub2_sub3.method10556((short) -10517) * 256);
		Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
		class456_sub1_sub2_sub3.method5395((float) ((int) class240.aFloat2653 + (i_9_ - (int) class240.aFloat2653) / i_8_), (float) (int) class240.aFloat2656, (float) ((int) class240.aFloat2657 + (i_10_ - (int) class240.aFloat2657) / i_8_));
		class456_sub1_sub2_sub3.anInt11662 = 0;
		class456_sub1_sub2_sub3.method10546((-1423603271 * (class456_sub1_sub2_sub3.anInt11624)), -1731027248);
	}

	static final int method7273(int i, byte i_11_) {
		return i >> 11 & 0x7f;
	}

	static final void method7274(Cs2Executor class441, int i) {
		if (!Class574.method6808(1267119220))
			Class203.method3010(16711935);
	}
}
