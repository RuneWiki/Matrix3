package game;

/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 implements Interface62 {
	public static int anInt44;

	public boolean method373(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 instanceof Interface65 && ((Interface65) class456_sub1_sub2).method400(1954112606));
	}

	public boolean method374(Class456_Sub1_Sub2 class456_sub1_sub2, int i) {
		return (class456_sub1_sub2 instanceof Interface65 && ((Interface65) class456_sub1_sub2).method400(1216608677));
	}

	public boolean method375(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 instanceof Interface65 && ((Interface65) class456_sub1_sub2).method400(-370546083));
	}

	public boolean method372(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 instanceof Interface65 && ((Interface65) class456_sub1_sub2).method400(1817731950));
	}

	static Class133 method528(RSByteBuffer class572_sub15, int i) {
		int i_0_ = class572_sub15.readUnsignedByte(1485924857);
		Class214 class214 = Class186.method2850(i_0_, (byte) -103);
		Class133 class133 = null;
		switch (-1445479283 * class214.anInt2495) {
			case 6:
				class133 = new Class133_Sub23(class572_sub15);
				break;
			case 21:
				class133 = new Class133_Sub3(class572_sub15);
				break;
			case 30:
				class133 = new Class133_Sub12(class572_sub15);
				break;
			case 3:
				class133 = new Class133_Sub4_Sub1(class572_sub15);
				break;
			case 23:
				class133 = new Class133_Sub21(class572_sub15);
				break;
			case 14:
				class133 = new Class133_Sub10(class572_sub15);
				break;
			case 26:
				class133 = new Class133_Sub22(class572_sub15);
				break;
			case 5:
				class133 = new Class133_Sub7(class572_sub15);
				break;
			case 2:
				class133 = new Class133_Sub15(class572_sub15, 1, 0);
				break;
			case 10:
				class133 = new Class133_Sub13(class572_sub15);
				break;
			case 8:
				class133 = new Class133_Sub18(class572_sub15);
				break;
			case 24:
				class133 = new Class133_Sub1(class572_sub15);
				break;
			case 28:
				class133 = new Class133_Sub17(class572_sub15);
				break;
			case 12:
				class133 = new Class133_Sub15(class572_sub15, 0, 0);
				break;
			case 19:
				class133 = new Class133_Sub6(class572_sub15);
				break;
			case 22:
				class133 = new Class133_Sub15(class572_sub15, 1, 1);
				break;
			default:
				break;
			case 29:
				class133 = new Class133_Sub8(class572_sub15);
				break;
			case 17:
				class133 = new Class133_Sub11(class572_sub15, false);
				break;
			case 1:
				class133 = new Class133_Sub16(class572_sub15);
				break;
			case 0:
				class133 = new Class133_Sub20(class572_sub15);
				break;
			case 4:
				class133 = new Class133_Sub14(class572_sub15);
				break;
			case 25:
				class133 = new Class133_Sub15(class572_sub15, 0, 1);
				break;
			case 11:
				class133 = new Class133_Sub9(class572_sub15);
				break;
			case 9:
				class133 = new Class133_Sub2(class572_sub15);
				break;
			case 20:
				class133 = new Class133_Sub19(class572_sub15);
				break;
			case 27:
				class133 = new Class133_Sub5(class572_sub15);
				break;
			case 18:
				class133 = new Class133_Sub11(class572_sub15, true);
				break;
			case 16:
				class133 = new Class133_Sub4_Sub2(class572_sub15);
		}
		return class133;
	}

	static final void method529(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class78 class78 = ((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_1_, -2076020736));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class78.anInt960 * -1756791847;
	}

	static final void method530(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method852(1019967701);
	}

	static final void method531(Cs2Executor class441, int i) {
		Class269.method3659(1610975047);
	}

	public static int method532(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static final void method533(Entity class456_sub1_sub2_sub3, boolean bool, int i) {
		Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) 40);
		if (-2037536229 * class456_sub1_sub2_sub3.stepsCount == 0) {
			class456_sub1_sub2_sub3.anInt11662 = 0;
			IncomingPacket.anInt4077 = 1042110633 * Class453.aClass453_5176.aByte5183;
			Class270.anInt2863 = 0;
		} else {
			if (class456_sub1_sub2_sub3.aClass663_11670.method7786(-288497311) && !class456_sub1_sub2_sub3.aClass663_11670.method7793(-2017714375)) {
				AnimationDefinition class132 = class456_sub1_sub2_sub3.aClass663_11670.method7787(153948485);
				if (78705827 * class456_sub1_sub2_sub3.anInt11663 > 0 && 0 == class132.anInt1556 * 802199755) {
					class456_sub1_sub2_sub3.anInt11662 += 218458549;
					IncomingPacket.anInt4077 = 1042110633 * Class453.aClass453_5176.aByte5183;
					Class270.anInt2863 = 0;
					return;
				}
				if (78705827 * class456_sub1_sub2_sub3.anInt11663 <= 0 && 0 == class132.anInt1561 * 657197671) {
					class456_sub1_sub2_sub3.anInt11662 += 218458549;
					IncomingPacket.anInt4077 = 1042110633 * Class453.aClass453_5176.aByte5183;
					Class270.anInt2863 = 0;
					return;
				}
			}
			for (int i_2_ = 0; i_2_ < class456_sub1_sub2_sub3.currentGraphics.length; i_2_++) {
				if (-1701003211 * (class456_sub1_sub2_sub3.currentGraphics[i_2_].id) != -1 && class456_sub1_sub2_sub3.currentGraphics[i_2_].aClass663_7776.method7793(-2107642134)) {
					GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition((class456_sub1_sub2_sub3.currentGraphics[i_2_].id) * -1701003211, -1334642540)));
					if (class659.aBool8427 && -1 != 1281094747 * class659.anInt8433) {
						AnimationDefinition class132 = (AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, 1789557217));
						if (class456_sub1_sub2_sub3.anInt11663 * 78705827 > 0 && 802199755 * class132.anInt1556 == 0) {
							class456_sub1_sub2_sub3.anInt11662 += 218458549;
							IncomingPacket.anInt4077 = (1042110633 * Class453.aClass453_5176.aByte5183);
							Class270.anInt2863 = 0;
							return;
						}
						if (78705827 * class456_sub1_sub2_sub3.anInt11663 <= 0 && 0 == class132.anInt1561 * 657197671) {
							class456_sub1_sub2_sub3.anInt11662 += 218458549;
							IncomingPacket.anInt4077 = (Class453.aClass453_5176.aByte5183 * 1042110633);
							Class270.anInt2863 = 0;
							return;
						}
					}
				}
			}
			Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3.method5394().aClass240_2647);
			int i_3_ = (int) class240.aFloat2653;
			int i_4_ = (int) class240.aFloat2657;
			int i_5_ = (((class456_sub1_sub2_sub3.screenX[class456_sub1_sub2_sub3.stepsCount * -2037536229 - 1]) * 512) + class456_sub1_sub2_sub3.method10556((short) -9923) * 256);
			int i_6_ = ((512 * (class456_sub1_sub2_sub3.screenY[class456_sub1_sub2_sub3.stepsCount * -2037536229 - 1])) + class456_sub1_sub2_sub3.method10556((short) -9927) * 256);
			if (i_3_ < i_5_) {
				if (i_4_ < i_6_)
					class456_sub1_sub2_sub3.method10546(10240, -2061344469);
				else if (i_4_ > i_6_)
					class456_sub1_sub2_sub3.method10546(14336, -2088700832);
				else
					class456_sub1_sub2_sub3.method10546(12288, -2008137550);
			} else if (i_3_ > i_5_) {
				if (i_4_ < i_6_)
					class456_sub1_sub2_sub3.method10546(6144, -2038190253);
				else if (i_4_ > i_6_)
					class456_sub1_sub2_sub3.method10546(2048, -1884934216);
				else
					class456_sub1_sub2_sub3.method10546(4096, -1991762405);
			} else if (i_4_ < i_6_)
				class456_sub1_sub2_sub3.method10546(8192, -1916616323);
			else if (i_4_ > i_6_)
				class456_sub1_sub2_sub3.method10546(0, -1765003306);
			int i_7_ = (class456_sub1_sub2_sub3.aByteArray11661[-2037536229 * class456_sub1_sub2_sub3.stepsCount - 1]);
			if (!bool && (i_5_ - i_3_ > 1024 || i_5_ - i_3_ < -1024 || i_6_ - i_4_ > 1024 || i_6_ - i_4_ < -1024)) {
				class456_sub1_sub2_sub3.method5395((float) i_5_, class240.aFloat2656, (float) i_6_);
				class456_sub1_sub2_sub3.method10516((478165057 * (class456_sub1_sub2_sub3.anInt11654)), false, 648650492);
				class456_sub1_sub2_sub3.stepsCount -= -298115053;
				if (class456_sub1_sub2_sub3.anInt11663 * 78705827 > 0)
					class456_sub1_sub2_sub3.anInt11663 -= -1262526709;
				IncomingPacket.anInt4077 = 1042110633 * Class453.aClass453_5176.aByte5183;
				Class270.anInt2863 = 0;
				class240.method3261();
			} else {
				int i_8_ = 16;
				boolean bool_9_ = true;
				if (class456_sub1_sub2_sub3 instanceof NPC)
					bool_9_ = ((NPC) class456_sub1_sub2_sub3).aClass410_11803.aBool4828;
				if (bool_9_) {
					int i_10_ = (478165057 * class456_sub1_sub2_sub3.anInt11654 - 452190977 * (class456_sub1_sub2_sub3.aClass15_11655.anInt125));
					if (i_10_ != 0 && -1 == (class456_sub1_sub2_sub3.anInt11619 * -1639699965) && (1589221153 * class456_sub1_sub2_sub3.anInt11653 != 0))
						i_8_ = 8;
					if (!bool && (-2037536229 * class456_sub1_sub2_sub3.stepsCount > 2))
						i_8_ = 24;
					if (!bool && (-2037536229 * class456_sub1_sub2_sub3.stepsCount > 3))
						i_8_ = 32;
				} else {
					if (!bool && (class456_sub1_sub2_sub3.stepsCount * -2037536229 > 1))
						i_8_ = 24;
					if (!bool && (-2037536229 * class456_sub1_sub2_sub3.stepsCount > 2))
						i_8_ = 32;
				}
				if (891354269 * class456_sub1_sub2_sub3.anInt11662 > 0 && -2037536229 * class456_sub1_sub2_sub3.stepsCount > 1) {
					i_8_ = 32;
					class456_sub1_sub2_sub3.anInt11662 -= 218458549;
				}
				if (i_7_ == Class453.aClass453_5179.aByte5183)
					i_8_ <<= 1;
				else if (i_7_ == Class453.aClass453_5182.aByte5183)
					i_8_ >>= 1;
				if (-1 != -163422899 * class538.anInt6016) {
					i_8_ <<= 9;
					if (-2037536229 * class456_sub1_sub2_sub3.stepsCount == 1) {
						int i_11_ = (-195781591 * class456_sub1_sub2_sub3.anInt11664 * (class456_sub1_sub2_sub3.anInt11664 * -195781591));
						int i_12_ = (((int) class240.aFloat2653 > i_5_ ? (int) class240.aFloat2653 - i_5_ : i_5_ - (int) class240.aFloat2653) << 9);
						int i_13_ = (((int) class240.aFloat2657 > i_6_ ? (int) class240.aFloat2657 - i_6_ : i_6_ - (int) class240.aFloat2657) << 9);
						int i_14_ = i_12_ > i_13_ ? i_12_ : i_13_;
						int i_15_ = i_14_ * (-326845798 * class538.anInt6016);
						if (i_11_ > i_15_) {
							Entity class456_sub1_sub2_sub3_16_;
							(class456_sub1_sub2_sub3_16_ = class456_sub1_sub2_sub3).anInt11664 = (-1922121703 * (class456_sub1_sub2_sub3_16_.anInt11664 * -195781591 / 2));
						} else if (i_11_ / 2 > i_14_) {
							class456_sub1_sub2_sub3.anInt11664 -= 1384832133 * class538.anInt6016;
							if (-195781591 * class456_sub1_sub2_sub3.anInt11664 < 0)
								class456_sub1_sub2_sub3.anInt11664 = 0;
						} else if ((class456_sub1_sub2_sub3.anInt11664 * -195781591) < i_8_) {
							class456_sub1_sub2_sub3.anInt11664 += 1384832133 * class538.anInt6016;
							if (class456_sub1_sub2_sub3.anInt11664 * -195781591 > i_8_)
								class456_sub1_sub2_sub3.anInt11664 = i_8_ * -1922121703;
						}
					} else if (class456_sub1_sub2_sub3.anInt11664 * -195781591 < i_8_) {
						class456_sub1_sub2_sub3.anInt11664 += class538.anInt6016 * 1384832133;
						if (class456_sub1_sub2_sub3.anInt11664 * -195781591 > i_8_)
							class456_sub1_sub2_sub3.anInt11664 = -1922121703 * i_8_;
					} else if (-195781591 * class456_sub1_sub2_sub3.anInt11664 > 0) {
						class456_sub1_sub2_sub3.anInt11664 -= class538.anInt6016 * 1384832133;
						if (class456_sub1_sub2_sub3.anInt11664 * -195781591 < 0)
							class456_sub1_sub2_sub3.anInt11664 = 0;
					}
					i_8_ = -195781591 * class456_sub1_sub2_sub3.anInt11664 >> 9;
					if (i_8_ < 1)
						i_8_ = 1;
				}
				Class270.anInt2863 = 0;
				if (i_5_ != i_3_ || i_4_ != i_6_) {
					if (i_3_ < i_5_) {
						class240.aFloat2653 += (float) i_8_;
						Class270.anInt2863 = (Class270.anInt2863 * 1062500197 | 0x4) * -201661843;
						if (class240.aFloat2653 > (float) i_5_)
							class240.aFloat2653 = (float) i_5_;
					} else if (i_3_ > i_5_) {
						class240.aFloat2653 -= (float) i_8_;
						Class270.anInt2863 = (Class270.anInt2863 * 1062500197 | 0x8) * -201661843;
						if (class240.aFloat2653 < (float) i_5_)
							class240.aFloat2653 = (float) i_5_;
					}
					if (i_4_ < i_6_) {
						class240.aFloat2657 += (float) i_8_;
						Class270.anInt2863 = (1062500197 * Class270.anInt2863 | 0x1) * -201661843;
						if (class240.aFloat2657 > (float) i_6_)
							class240.aFloat2657 = (float) i_6_;
					} else if (i_4_ > i_6_) {
						class240.aFloat2657 -= (float) i_8_;
						Class270.anInt2863 = -201661843 * (Class270.anInt2863 * 1062500197 | 0x2);
						if (class240.aFloat2657 < (float) i_6_)
							class240.aFloat2657 = (float) i_6_;
					}
					class456_sub1_sub2_sub3.method5401(class240);
					if (i_8_ >= 32)
						IncomingPacket.anInt4077 = Class453.aClass453_5179.aByte5183 * 1042110633;
					else
						IncomingPacket.anInt4077 = 1042110633 * i_7_;
				} else
					IncomingPacket.anInt4077 = 1042110633 * Class453.aClass453_5176.aByte5183;
				if ((int) class240.aFloat2653 == i_5_ && i_6_ == (int) class240.aFloat2657) {
					class456_sub1_sub2_sub3.stepsCount -= -298115053;
					if (class456_sub1_sub2_sub3.anInt11663 * 78705827 > 0)
						class456_sub1_sub2_sub3.anInt11663 -= -1262526709;
				}
				class240.method3261();
			}
		}
	}
}
