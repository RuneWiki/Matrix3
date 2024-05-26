package game;

/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class592 {
	byte aByte7817;
	public int anInt7818;
	public int anInt7819;
	public int anInt7820;
	public int anInt7821;
	public int anInt7822;

	public Class592() {
		/* empty */
	}

	public int method7006(int i) {
		return (((Class592) this).aByte7817 & 0x8) == 8 ? 1 : 0;
	}

	public int method7007(int i) {
		return ((Class592) this).aByte7817 & 0x7;
	}

	public Class592(RSByteBuffer class572_sub15, Class202_Sub1 class202_sub1) {
		((Class592) this).aByte7817 = class572_sub15.readByte(1203913378);
		anInt7818 = class572_sub15.readUnsignedShort(647518597) * -1537380691;
		anInt7819 = class572_sub15.readInt(719472169) * 584566117;
		anInt7820 = class572_sub15.readInt(-208826473) * -1649404825;
		anInt7821 = class572_sub15.readInt(-512409888) * 1330407091;
		anInt7822 = class572_sub15.readInt(-189993871) * 490576233;
		if (class202_sub1 != null)
			Class614.method7368(class572_sub15, class202_sub1, (byte) 119);
	}

	public int method7008() {
		return ((Class592) this).aByte7817 & 0x7;
	}

	public int method7009() {
		return ((Class592) this).aByte7817 & 0x7;
	}

	public int method7010() {
		return (((Class592) this).aByte7817 & 0x8) == 8 ? 1 : 0;
	}

	public int method7011() {
		return (((Class592) this).aByte7817 & 0x8) == 8 ? 1 : 0;
	}

	static void method7012(String string, String string_0_, int i, int i_1_, int i_2_, long l, int i_3_, int i_4_, boolean bool, boolean bool_5_, long l_6_, boolean bool_7_, int i_8_) {
		if (!Class25.aBool165 && 357782167 * Class25.anInt172 < 504) {
			i = -1 != i ? i : -646491435 * client.anInt8751;
			Class572_Sub12_Sub10 class572_sub12_sub10 = new Class572_Sub12_Sub10(string, string_0_, i, i_1_, i_2_, l, i_3_, i_4_, bool, bool_5_, l_6_, bool_7_);
			Class412.method5075(class572_sub12_sub10, 722976984);
		}
	}

	static final void method7013(Cs2Executor class441, byte i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_9_, 396208388)).aString8180);
	}

	static final void method7014(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class100.method1595(-1408076253).getId(-146297155);
	}

	static final void method7015(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 969995095 * class73.anInt799;
	}

	static final void method7016(Entity class456_sub1_sub2_sub3, byte i) {
		if (null != class456_sub1_sub2_sub3.anIntArray11607 || null != class456_sub1_sub2_sub3.anIntArray11651) {
			boolean bool = true;
			Class497 class497 = client.aClass613_8605.method7280((byte) -100);
			for (int i_10_ = 0; i_10_ < class456_sub1_sub2_sub3.anIntArray11607.length; i_10_++) {
				int i_11_ = -1;
				if (class456_sub1_sub2_sub3.anIntArray11607 != null)
					i_11_ = class456_sub1_sub2_sub3.anIntArray11607[i_10_];
				if (-1 == i_11_) {
					if (!class456_sub1_sub2_sub3.method10519(i_10_, -1, -1286893401))
						bool = false;
				} else {
					bool = false;
					boolean bool_12_ = false;
					boolean bool_13_ = false;
					Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
					int i_14_;
					int i_15_;
					if ((i_11_ & ~0x3fffffff) == -1073741824) {
						int i_16_ = i_11_ & 0xfffffff;
						int i_17_ = i_16_ >> 14;
						int i_18_ = i_16_ & 0x3fff;
						i_14_ = ((int) class240.aFloat2653 - (256 + ((i_17_ - class497.localX * -2109597897) * 512)));
						i_15_ = ((int) class240.aFloat2657 - (512 * (i_18_ - class497.localY * 417324155) + 256));
					} else if (0 != (i_11_ & 0x8000)) {
						int i_19_ = i_11_ & 0x7fff;
						Player class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_19_]);
						if (null != class456_sub1_sub2_sub3_sub2) {
							Class240 class240_20_ = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
							i_14_ = ((int) class240.aFloat2653 - (int) class240_20_.aFloat2653);
							i_15_ = ((int) class240.aFloat2657 - (int) class240_20_.aFloat2657);
						} else {
							class456_sub1_sub2_sub3.method10519(i_10_, -1, -255412486);
							continue;
						}
					} else {
						LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_11_));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240_21_ = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
							i_14_ = ((int) class240.aFloat2653 - (int) class240_21_.aFloat2653);
							i_15_ = ((int) class240.aFloat2657 - (int) class240_21_.aFloat2657);
						} else {
							class456_sub1_sub2_sub3.method10519(i_10_, -1, 1675096148);
							continue;
						}
					}
					if (i_14_ != 0 || i_15_ != 0)
						class456_sub1_sub2_sub3.method10519(i_10_, (int) (Math.atan2((double) i_14_, (double) i_15_) * 2607.5945876176133) & 0x3fff, 1286809875);
				}
			}
			if (bool) {
				class456_sub1_sub2_sub3.anIntArray11607 = null;
				class456_sub1_sub2_sub3.anIntArray11651 = null;
			}
		}
	}

	static final void method7017(Cs2Executor class441, int i) {
		int i_22_ = Class213.aClass572_Sub24_2463.aClass665_Sub1_9235.method8101(-1351014658);
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub1_9201, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 0 : i_22_, 735454090);
		Class286.method3869((byte) -82);
	}

	static final void method7018(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class189.method2860(class73, class83, class441, 680938717);
	}
}
