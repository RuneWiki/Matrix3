package game;

/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72 implements Interface52 {
	int anInt715;
	static Class72 aClass72_716;
	static Class72 aClass72_717;
	static Class72 aClass72_718;
	int anInt719;
	static Class72 aClass72_720 = new Class72(1, 0);
	public static Class617 aClass617_721;
	static Class102 aClass102_722;

	public int method43() {
		return ((Class72) this).anInt715 * -822514141;
	}

	Class72(int i, int i_0_) {
		((Class72) this).anInt719 = i * 753099457;
		((Class72) this).anInt715 = 2014949771 * i_0_;
	}

	static {
		aClass72_716 = new Class72(3, 1);
		aClass72_717 = new Class72(0, 2);
		aClass72_718 = new Class72(2, 3);
	}

	static Class72[] method1086(int i) {
		return (new Class72[] { aClass72_717, aClass72_720, aClass72_718, aClass72_716 });
	}

	public int getId(int i) {
		return ((Class72) this).anInt715 * -822514141;
	}

	public int method45() {
		return ((Class72) this).anInt715 * -822514141;
	}

	public int method61() {
		return ((Class72) this).anInt715 * -822514141;
	}

	static void method1087(NPC class456_sub1_sub2_sub3_sub1, boolean bool, byte i) {
		if (357782167 * Class25.anInt172 < 406) {
			NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
			String string = class456_sub1_sub2_sub3_sub1.aString11807;
			if (null != class410.anIntArray4795) {
				class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 110077436);
				if (class410 == null)
					return;
				string = class410.aString4791;
			}
			if (class410.aBool4827) {
				if (1667386203 * class456_sub1_sub2_sub3_sub1.anInt11806 != 0) {
					String string_1_ = (client.aClass437_8705 == Class437.aClass437_5068 ? Class279.aClass279_3087.method3758(Class594.aClass435_7823, 16711935) : (Class279.aClass279_3107.method3758(Class594.aClass435_7823, 16711935)));
					string = new StringBuilder().append(string).append(Class128.method2260((class456_sub1_sub2_sub3_sub1.anInt11806 * 1667386203), (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823) * -1611815663, 2115015025)).append(Class3.aString24).append(string_1_).append(1667386203 * class456_sub1_sub2_sub3_sub1.anInt11806).append(Class3.aString28).toString();
				}
				if (client.aBool8754 && !bool) {
					Class264 class264 = ((Class264) (Class572_Sub12_Sub1.anInt11252 * -881690847 != -1 ? (Class273.aClass639_Sub3_2901.getDefinition(-881690847 * Class572_Sub12_Sub1.anInt11252, -1924161822)) : null));
					if ((Class8.anInt43 * -1613657659 & 0x2) != 0 && (class264 == null || ((class410.method4952(-881690847 * Class572_Sub12_Sub1.anInt11252, class264.anInt2832 * -1132777561, 435619320)) != -1132777561 * class264.anInt2832)))
						Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(GraphicsDefinition.method7770(16776960, (byte) 8)).append(string).toString(), 1904277101 * Class510.anInt5693, 8, -1, (long) (-821391465 * (class456_sub1_sub2_sub3_sub1.anInt11633)), 0, 0, true, false, (long) (class456_sub1_sub2_sub3_sub1.anInt11633 * -821391465), false, 1447140101);
				}
				if (!bool) {
					String[] strings = class410.aStringArray4808;
					if (client.aBool8636)
						strings = JS5ConfigGroup.method3109(strings, 861582966);
					if (null != strings) {
						for (int i_2_ = strings.length - 1; i_2_ >= 0; i_2_--) {
							if (null != strings[i_2_] && ((1625023759 * class456_sub1_sub2_sub3_sub1.anInt11808) & 1 << i_2_) == 0 && (0 == class410.aByte4851 || (!(strings[i_2_].equalsIgnoreCase(Class279.aClass279_3080.method3758(Class594.aClass435_7823, 16711935))) && !(strings[i_2_].equalsIgnoreCase(Class279.aClass279_3058.method3758(Class594.aClass435_7823, 16711935)))))) {
								int i_3_ = 0;
								int i_4_ = client.anInt8752 * 1677589191;
								if (0 == i_2_)
									i_3_ = 9;
								if (1 == i_2_)
									i_3_ = 10;
								if (i_2_ == 2)
									i_3_ = 11;
								if (i_2_ == 3)
									i_3_ = 12;
								if (4 == i_2_)
									i_3_ = 13;
								if (i_2_ == 5)
									i_3_ = 1003;
								int i_5_ = class410.method4954(i_2_, 1021357515);
								if (-1 != i_5_)
									i_4_ = i_5_;
								Class592.method7012(strings[i_2_], new StringBuilder().append(GraphicsDefinition.method7770(16776960, (byte) 36)).append(string).toString(), ((strings[i_2_].equalsIgnoreCase(Class279.aClass279_3080.method3758(Class594.aClass435_7823, 16711935))) ? class410.anInt4810 * -1971240317 : i_4_), i_3_, -1, (long) (-821391465 * (class456_sub1_sub2_sub3_sub1.anInt11633)), 0, 0, true, false, (long) ((class456_sub1_sub2_sub3_sub1.anInt11633) * -821391465), false, 1447140101);
							}
						}
						if (1 == class410.aByte4851) {
							for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
								if (null != strings[i_6_] && ((1625023759 * (class456_sub1_sub2_sub3_sub1.anInt11808)) & 1 << i_6_) == 0 && ((strings[i_6_].equalsIgnoreCase(Class279.aClass279_3080.method3758(Class594.aClass435_7823, 16711935))) || (strings[i_6_].equalsIgnoreCase(Class279.aClass279_3058.method3758(Class594.aClass435_7823, 16711935))))) {
									short i_7_ = 0;
									if ((class456_sub1_sub2_sub3_sub1.anInt11806) * 1667386203 > (-1611815663 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823)))
										i_7_ = (short) 2000;
									short i_8_ = 0;
									int i_9_ = 1677589191 * client.anInt8752;
									if (0 == i_6_)
										i_8_ = (short) 9;
									if (i_6_ == 1)
										i_8_ = (short) 10;
									if (2 == i_6_)
										i_8_ = (short) 11;
									if (3 == i_6_)
										i_8_ = (short) 12;
									if (4 == i_6_)
										i_8_ = (short) 13;
									if (i_6_ == 5)
										i_8_ = (short) 1003;
									if (0 != i_8_)
										i_8_ += i_7_;
									int i_10_ = class410.method4954(i_6_, 1021357515);
									if (i_10_ != -1)
										i_9_ = i_10_;
									Class592.method7012(strings[i_6_], new StringBuilder().append(GraphicsDefinition.method7770(16776960, (byte) -89)).append(string).toString(), ((strings[i_6_].equalsIgnoreCase(Class279.aClass279_3080.method3758(Class594.aClass435_7823, 16711935))) ? class410.anInt4810 * -1971240317 : i_9_), i_8_, -1, (long) (-821391465 * (class456_sub1_sub2_sub3_sub1.anInt11633)), 0, 0, true, false, (long) (-821391465 * (class456_sub1_sub2_sub3_sub1.anInt11633)), false, 1447140101);
								}
							}
						}
					}
				}
			}
		}
	}

	public int method143() {
		return ((Class72) this).anInt715 * -822514141;
	}

	public static void method1088(Class271_Sub1 class271_sub1, byte i) {
		Class587.method6962(class271_sub1, (byte) 0);
	}
}
