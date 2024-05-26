package game;

/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public class Class227 {
	boolean aBool2616;
	Class210[] aClass210Array2617;

	Class227(boolean bool, Class210[] class210s) {
		((Class227) this).aBool2616 = bool;
		((Class227) this).aClass210Array2617 = class210s;
	}

	static final void method3158(Cs2Executor class441, short i) {
		if (client.aBool8559)
			Class212.aClass212_2453.method3057((byte) 60);
	}

	static final void method3159(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1859562071) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray929 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static void method3160(Class106 class106, int i, int i_0_, int i_1_) {
		if (i >= 0 && i_0_ >= 0 && Class25.aClass250_202 != null) {
			Class497 class497 = client.aClass613_8605.method7280((byte) -58);
			Class250 class250 = class106.method1752();
			IncomingPacket.method4115(class106, -1408856590);
			class250.method3446(Class25.aClass261_190);
			class250.method3445(Class25.aClass250_202);
			class250.method3462();
			int i_2_ = i - 1235445579 * Class25.anInt184;
			int i_3_ = i_0_ - 1203787953 * Class25.anInt185;
			if (client.aClass613_8605.method7285(1261022718) != null) {
				if (!client.aBool8754 || 0 != (Class8.anInt43 * -1613657659 & 0x40)) {
					int i_4_ = -1;
					int i_5_ = -1;
					float f = ((float) i_2_ * 2.0F / (float) (Class25.anInt186 * 1667618087) - 1.0F);
					float f_6_ = ((float) i_3_ * 2.0F / (float) (Class25.anInt188 * 33371895) - 1.0F);
					class250.method3449(f, f_6_, -1.0F, Class25.aFloatArray195);
					float f_7_ = (Class25.aFloatArray195[0] / Class25.aFloatArray195[3]);
					float f_8_ = (Class25.aFloatArray195[1] / Class25.aFloatArray195[3]);
					float f_9_ = (Class25.aFloatArray195[2] / Class25.aFloatArray195[3]);
					class250.method3449(f, f_6_, 1.0F, Class25.aFloatArray195);
					float f_10_ = (Class25.aFloatArray195[0] / Class25.aFloatArray195[3]);
					float f_11_ = (Class25.aFloatArray195[1] / Class25.aFloatArray195[3]);
					float f_12_ = (Class25.aFloatArray195[2] / Class25.aFloatArray195[3]);
					float f_13_ = Class260.method3566(f_7_, f_8_, f_9_, f_10_, f_11_, f_12_, 4, 1103374225);
					if (f_13_ > 0.0F) {
						float f_14_ = f_10_ - f_7_;
						float f_15_ = f_12_ - f_9_;
						int i_16_ = (int) (f_7_ + f_13_ * f_14_);
						int i_17_ = (int) (f_15_ * f_13_ + f_9_);
						i_4_ = i_16_ + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -11503) - 1 << 8) >> 9;
						i_5_ = i_17_ + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) 122) - 1 << 8) >> 9;
						int i_18_ = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009);
						if (i_18_ < 3 && ((client.aClass613_8605.method7287((byte) 71).aByteArrayArrayArray2909[1][i_16_ >> 9][i_17_ >> 9]) & 0x2) != 0)
							i_18_++;
					}
					if (-1 != i_4_ && -1 != i_5_) {
						if (client.aBool8754 && 0 != (-1613657659 * Class8.anInt43 & 0x40)) {
							InterfaceDefinitions class73 = Class530.method6338((Class167.interfaceHash * -806385553), (654388253 * client.anInt8755), 728987131);
							if (class73 != null)
								Class592.method7012(client.aString8757, new StringBuilder().append(" ").append(Class3.aString26).append(" ").toString(), (1904277101 * Class510.anInt5693), 59, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 32 | i_5_), true, 1447140101);
							else
								Class131.method2286(-1705608345);
						} else {
							if (Class212.aBool2460)
								Class592.method7012((Class279.aClass279_3084.method3758(Class594.aClass435_7823, 16711935)), "", -1, 60, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 32 | i_5_), true, 1447140101);
							Class592.method7012(Class375_Sub3.aString9521, "", 348859511 * client.anInt8744, 23, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 32 | i_5_), true, 1447140101);
						}
					}
				}
				Class545 class545 = (client.aClass613_8605.method7285(1144485749).aClass545_5849);
				int i_19_ = i;
				int i_20_ = i_0_;
				List list = class545.aList6110;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class531 class531 = (Class531) iterator.next();
					if ((client.aBool8847 || (class531.aClass456_Sub1_5929.aByte9009 == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009))) && class531.method6339(class106, i_19_, i_20_, -1248023814)) {
						boolean bool = false;
						boolean bool_21_ = false;
						int i_22_;
						int i_23_;
						if (class531.aClass456_Sub1_5929 instanceof Class456_Sub1_Sub2) {
							i_22_ = ((Class456_Sub1_Sub2) class531.aClass456_Sub1_5929).aShort11503;
							i_23_ = ((Class456_Sub1_Sub2) class531.aClass456_Sub1_5929).aShort11500;
						} else {
							Class240 class240 = (class531.aClass456_Sub1_5929.method5394().aClass240_2647);
							i_22_ = (int) class240.aFloat2653 >> 9;
							i_23_ = (int) class240.aFloat2657 >> 9;
						}
						if (class531.aClass456_Sub1_5929 instanceof Player) {
							Player class456_sub1_sub2_sub3_sub2 = ((Player) class531.aClass456_Sub1_5929);
							int i_24_ = class456_sub1_sub2_sub3_sub2.method10556((short) -29459);
							Class240 class240 = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
							if ((0 == (i_24_ & 0x1) && 0 == ((int) class240.aFloat2653 & 0x1ff) && 0 == ((int) class240.aFloat2657 & 0x1ff)) || (1 == (i_24_ & 0x1) && 256 == ((int) class240.aFloat2653 & 0x1ff) && 256 == ((int) class240.aFloat2657 & 0x1ff))) {
								int i_25_ = ((int) class240.aFloat2653 - (class456_sub1_sub2_sub3_sub2.method10556((short) -31428) - 1 << 8));
								int i_26_ = ((int) class240.aFloat2657 - (class456_sub1_sub2_sub3_sub2.method10556((short) -20687) - 1 << 8));
								for (int i_27_ = 0; i_27_ < client.anInt8625 * 765313669; i_27_++) {
									LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) client.anIntArray8626[i_27_])));
									if (null != class572_sub9) {
										NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
										if ((client.cycles != (-1531164899 * (class456_sub1_sub2_sub3_sub1.anInt11614))) && (class456_sub1_sub2_sub3_sub1.aBool11612)) {
											Class240 class240_28_ = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
											int i_29_ = ((int) (class240_28_.aFloat2653) - (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667 - 1) << 8));
											int i_30_ = ((int) (class240_28_.aFloat2657) - (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667 - 1) << 8));
											if (i_29_ >= i_25_ && ((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667 <= ((class456_sub1_sub2_sub3_sub2.method10556((short) -2705)) - (i_29_ - i_25_ >> 9))) && i_30_ >= i_26_ && ((358769667 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792)) <= ((class456_sub1_sub2_sub3_sub2.method10556((short) -9242)) - (i_30_ - i_26_ >> 9)))) {
												Class72.method1087(class456_sub1_sub2_sub3_sub1, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != (class531.aClass456_Sub1_5929.aByte9009)), (byte) -65);
												class456_sub1_sub2_sub3_sub1.anInt11614 = (1052554037 * client.cycles);
											}
										}
									}
								}
								int i_31_ = 1657484935 * Class184.anInt2163;
								int[] is = Class184.anIntArray2154;
								for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
									Player class456_sub1_sub2_sub3_sub2_33_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_32_]]);
									if ((null != class456_sub1_sub2_sub3_sub2_33_) && (client.cycles != (class456_sub1_sub2_sub3_sub2_33_.anInt11614) * -1531164899) && (class456_sub1_sub2_sub3_sub2_33_ != class456_sub1_sub2_sub3_sub2) && (class456_sub1_sub2_sub3_sub2_33_.aBool11612)) {
										Class240 class240_34_ = (class456_sub1_sub2_sub3_sub2_33_.method5394().aClass240_2647);
										int i_35_ = ((int) class240_34_.aFloat2653 - ((class456_sub1_sub2_sub3_sub2_33_.method10556((short) 51) - 1) << 8));
										int i_36_ = ((int) class240_34_.aFloat2657 - ((class456_sub1_sub2_sub3_sub2_33_.method10556((short) -28782)) - 1 << 8));
										if (i_35_ >= i_25_ && (class456_sub1_sub2_sub3_sub2_33_.method10556((short) -11752) <= ((class456_sub1_sub2_sub3_sub2.method10556((short) -5817)) - (i_35_ - i_25_ >> 9))) && i_36_ >= i_26_ && (class456_sub1_sub2_sub3_sub2_33_.method10556((short) -25609) <= ((class456_sub1_sub2_sub3_sub2.method10556((short) -31960)) - (i_36_ - i_26_ >> 9)))) {
											Class569.method6762(class456_sub1_sub2_sub3_sub2_33_, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != (class531.aClass456_Sub1_5929.aByte9009)), (byte) -51);
											class456_sub1_sub2_sub3_sub2_33_.anInt11614 = (client.cycles * 1052554037);
										}
									}
								}
							}
							if (client.cycles == (-1531164899 * class456_sub1_sub2_sub3_sub2.anInt11614))
								continue;
							Class569.method6762(class456_sub1_sub2_sub3_sub2, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != class531.aClass456_Sub1_5929.aByte9009), (byte) -96);
							class456_sub1_sub2_sub3_sub2.anInt11614 = client.cycles * 1052554037;
						}
						if (class531.aClass456_Sub1_5929 instanceof NPC) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class531.aClass456_Sub1_5929);
							if (null != (class456_sub1_sub2_sub3_sub1.aClass410_11803)) {
								Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
								if ((0 == (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667) & 0x1) && 0 == ((int) class240.aFloat2653 & 0x1ff) && 0 == ((int) class240.aFloat2657 & 0x1ff)) || (((358769667 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792)) & 0x1) == 1 && 256 == ((int) class240.aFloat2653 & 0x1ff) && 256 == ((int) class240.aFloat2657 & 0x1ff))) {
									int i_37_ = ((int) class240.aFloat2653 - (((358769667 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792)) - 1) << 8));
									int i_38_ = ((int) class240.aFloat2657 - (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667) - 1 << 8));
									for (int i_39_ = 0; i_39_ < 765313669 * client.anInt8625; i_39_++) {
										LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) client.anIntArray8626[i_39_])));
										if (null != class572_sub9) {
											NPC class456_sub1_sub2_sub3_sub1_40_ = ((NPC) class572_sub9.anObject9081);
											if (((class456_sub1_sub2_sub3_sub1_40_.anInt11614) * -1531164899 != client.cycles) && (class456_sub1_sub2_sub3_sub1 != class456_sub1_sub2_sub3_sub1_40_) && (class456_sub1_sub2_sub3_sub1_40_.aBool11612)) {
												Class240 class240_41_ = (class456_sub1_sub2_sub3_sub1_40_.method5394().aClass240_2647);
												int i_42_ = ((int) (class240_41_.aFloat2653) - ((358769667 * (class456_sub1_sub2_sub3_sub1_40_.aClass410_11803.anInt4792)) - 1 << 8));
												int i_43_ = ((int) (class240_41_.aFloat2657) - ((358769667 * (class456_sub1_sub2_sub3_sub1_40_.aClass410_11803.anInt4792)) - 1 << 8));
												if (i_42_ >= i_37_ && ((358769667 * (class456_sub1_sub2_sub3_sub1_40_.aClass410_11803.anInt4792)) <= (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667) - (i_42_ - i_37_ >> 9))) && i_43_ >= i_38_ && ((class456_sub1_sub2_sub3_sub1_40_.aClass410_11803.anInt4792) * 358769667 <= (((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667) - (i_43_ - i_38_ >> 9)))) {
													Class72.method1087(class456_sub1_sub2_sub3_sub1_40_, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != (class531.aClass456_Sub1_5929.aByte9009)), (byte) -21);
													class456_sub1_sub2_sub3_sub1_40_.anInt11614 = (client.cycles * 1052554037);
												}
											}
										}
									}
									int i_44_ = 1657484935 * Class184.anInt2163;
									int[] is = Class184.anIntArray2154;
									for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
										Player class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_45_]]);
										if ((class456_sub1_sub2_sub3_sub2 != null) && ((-1531164899 * (class456_sub1_sub2_sub3_sub2.anInt11614)) != client.cycles) && (class456_sub1_sub2_sub3_sub2.aBool11612)) {
											Class240 class240_46_ = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
											int i_47_ = ((int) (class240_46_.aFloat2653) - ((class456_sub1_sub2_sub3_sub2.method10556((short) -2031)) - 1 << 8));
											int i_48_ = ((int) (class240_46_.aFloat2657) - ((class456_sub1_sub2_sub3_sub2.method10556((short) -12763)) - 1 << 8));
											if (i_47_ >= i_37_ && ((class456_sub1_sub2_sub3_sub2.method10556((short) -6290)) <= ((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667 - (i_47_ - i_37_ >> 9))) && i_48_ >= i_38_ && ((class456_sub1_sub2_sub3_sub2.method10556((short) -11063)) <= ((358769667 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792)) - (i_48_ - i_38_ >> 9)))) {
												Class569.method6762(class456_sub1_sub2_sub3_sub2, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != (class531.aClass456_Sub1_5929.aByte9009)), (byte) -55);
												class456_sub1_sub2_sub3_sub2.anInt11614 = (client.cycles * 1052554037);
											}
										}
									}
								}
								if ((-1531164899 * class456_sub1_sub2_sub3_sub1.anInt11614) == client.cycles)
									continue;
								Class72.method1087(class456_sub1_sub2_sub3_sub1, (class531.aClass456_Sub1_5929.aByte9009 != (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009)), (byte) -56);
								class456_sub1_sub2_sub3_sub1.anInt11614 = client.cycles * 1052554037;
							}
						}
						if (class531.aClass456_Sub1_5929 instanceof Class456_Sub1_Sub5_Sub1) {
							int i_49_ = -2109597897 * class497.localX + i_22_;
							int i_50_ = i_23_ + 417324155 * class497.localY;
							Class572_Sub42 class572_sub42 = ((Class572_Sub42) (client.aClass676_8749.get((long) ((class531.aClass456_Sub1_5929.aByte9009) << 28 | i_50_ << 14 | i_49_))));
							if (class572_sub42 != null) {
								int i_51_ = 0;
								Class572_Sub40 class572_sub40 = ((Class572_Sub40) class572_sub42.aClass675_9435.method7925(-2089073733));
								while (null != class572_sub40) {
									ItemDefinitions class631 = ((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((1544118073 * class572_sub40.anInt9401), -688237754)));
									int i_52_;
									if (class631.aBool8190)
										i_52_ = 1466480703 * class631.anInt8191;
									else if (class631.aBool8143)
										i_52_ = (Class586.aClass502_7779.anInt5553) * 813673117;
									else
										i_52_ = -460148387 * (Class586.aClass502_7779.anInt5549);
									if (client.aBool8754 && ((class531.aClass456_Sub1_5929.aByte9009) == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009))) {
										Class264 class264 = ((Class264) (-1 != ((Class572_Sub12_Sub1.anInt11252) * -881690847) ? (Class273.aClass639_Sub3_2901.getDefinition((Class572_Sub12_Sub1.anInt11252) * -881690847, -613314871)) : null));
										if (0 != (Class8.anInt43 * -1613657659 & 0x1) && (null == class264 || ((class631.method7520((-881690847 * (Class572_Sub12_Sub1.anInt11252)), (class264.anInt2832 * -1132777561), 447248701)) != (class264.anInt2832 * -1132777561))))
											Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(GraphicsDefinition.method7770(i_52_, (byte) -17)).append(class631.aString8180).toString(), (1904277101 * Class510.anInt5693), 17, -1, (long) (1544118073 * (class572_sub40.anInt9401)), i_22_, i_23_, true, false, (long) i_51_, false, 1447140101);
									}
									if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) == (class531.aClass456_Sub1_5929.aByte9009)) {
										String[] strings = class631.aStringArray8144;
										for (int i_53_ = strings.length - 1; i_53_ >= 0; i_53_--) {
											if (null != strings[i_53_]) {
												int i_54_ = 0;
												int i_55_ = (1677589191 * client.anInt8752);
												if (0 == i_53_)
													i_54_ = 18;
												if (1 == i_53_)
													i_54_ = 19;
												if (2 == i_53_)
													i_54_ = 20;
												if (i_53_ == 3)
													i_54_ = 21;
												if (i_53_ == 4)
													i_54_ = 22;
												if (5 == i_53_)
													i_54_ = 1004;
												int i_56_ = (class631.method7536(i_53_, 1687749381));
												if (i_56_ != -1)
													i_55_ = i_56_;
												Class592.method7012(strings[i_53_], new StringBuilder().append(GraphicsDefinition.method7770(i_52_, (byte) 50)).append(class631.aString8180).toString(), i_55_, i_54_, -1, (long) (1544118073 * (class572_sub40.anInt9401)), i_22_, i_23_, true, false, (long) i_51_, false, 1447140101);
											}
										}
									}
									class572_sub40 = ((Class572_Sub40) class572_sub42.aClass675_9435.method7933(-671634635));
									i_51_++;
								}
							}
						}
						if (class531.aClass456_Sub1_5929 instanceof Interface65) {
							Interface65 interface65 = (Interface65) class531.aClass456_Sub1_5929;
							ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(-338609185).getDefinition(interface65.method136(-1598307850), 2025598999)));
							if (null != class509.anIntArray5605)
								class509 = class509.method6047((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), 623307957);
							if (null != class509) {
								if (client.aBool8754 && (class531.aClass456_Sub1_5929.aByte9009 == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009))) {
									Class264 class264 = ((Class264) (-1 != (-881690847 * (Class572_Sub12_Sub1.anInt11252)) ? (Class273.aClass639_Sub3_2901.getDefinition((-881690847 * (Class572_Sub12_Sub1.anInt11252)), 1311036752)) : null));
									if (((Class8.anInt43 * -1613657659 & 0x4) != 0) && (class264 == null || ((class509.method6048((-881690847 * (Class572_Sub12_Sub1.anInt11252)), (class264.anInt2832 * -1132777561), (byte) 101)) != (class264.anInt2832 * -1132777561))))
										Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(GraphicsDefinition.method7770(65535, (byte) -69)).append(class509.name).toString(), Class510.anInt5693 * 1904277101, 2, -1, Class310.method4050(interface65, i_22_, i_23_, 2143244409), i_22_, i_23_, true, false, (long) interface65.hashCode(), false, 1447140101);
								}
								if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) == (class531.aClass456_Sub1_5929.aByte9009)) {
									String[] strings = class509.aStringArray5640;
									if (null != strings) {
										for (int i_57_ = strings.length - 1; i_57_ >= 0; i_57_--) {
											if (null != strings[i_57_]) {
												int i_58_ = 0;
												int i_59_ = (client.anInt8752 * 1677589191);
												if (0 == i_57_)
													i_58_ = 3;
												if (i_57_ == 1)
													i_58_ = 4;
												if (2 == i_57_)
													i_58_ = 5;
												if (3 == i_57_)
													i_58_ = 6;
												if (i_57_ == 4)
													i_58_ = 1001;
												if (i_57_ == 5)
													i_58_ = 1002;
												int i_60_ = (class509.method6055(i_57_, -2044955010));
												if (i_60_ != -1)
													i_59_ = i_60_;
												Class592.method7012(strings[i_57_], new StringBuilder().append(GraphicsDefinition.method7770(65535, (byte) 5)).append(class509.name).toString(), i_59_, i_58_, -1, (Class310.method4050(interface65, i_22_, i_23_, 1069717441)), i_22_, i_23_, true, false, (long) interface65.hashCode(), false, 1447140101);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method3161(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aByte4277;
	}
}
