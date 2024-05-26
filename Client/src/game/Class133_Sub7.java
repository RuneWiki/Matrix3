package game;

/* Class133_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub7 extends Class133 {
	int anInt9846;
	int anInt9847;
	int anInt9848;
	int anInt9849;
	int anInt9850;
	int anInt9851;

	public void method2303(int i) {
		Class122.aClass119Array1487[-460694227 * ((Class133_Sub7) this).anInt9846].method2159(0, (byte) 0);
		Class122.aClass119Array1487[((Class133_Sub7) this).anInt9847 * -75200997].method2159(1, (byte) 0);
		client.anInt8690 = 0;
		client.anInt8692 = ((Class133_Sub7) this).anInt9848 * -967704577;
		client.anInt8651 = 0;
		client.anInt8709 = 862635237 * ((Class133_Sub7) this).anInt9850;
		client.anInt8696 = 451925013 * ((Class133_Sub7) this).anInt9851;
		client.anInt8711 = 527050097;
		client.anInt8824 = 2070973185 * ((Class133_Sub7) this).anInt9849;
		Class18.anInt143 = 1285777781;
		Class540.method6417((byte) 36);
		client.aBool8647 = true;
	}

	Class133_Sub7(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub7) this).anInt9846 = class572_sub15.readUnsignedShort(647518597) * 1336212133;
		((Class133_Sub7) this).anInt9847 = class572_sub15.readUnsignedShort(647518597) * 1825498131;
		((Class133_Sub7) this).anInt9848 = class572_sub15.readUnsignedShort(647518597) * 1876870955;
		((Class133_Sub7) this).anInt9849 = class572_sub15.readUnsignedShort(647518597) * 549968357;
		((Class133_Sub7) this).anInt9850 = class572_sub15.readUnsignedShort(647518597) * -1241883737;
		((Class133_Sub7) this).anInt9851 = class572_sub15.readUnsignedShort(647518597) * 1339247015;
	}

	public void method2309() {
		Class122.aClass119Array1487[-460694227 * ((Class133_Sub7) this).anInt9846].method2159(0, (byte) 0);
		Class122.aClass119Array1487[((Class133_Sub7) this).anInt9847 * -75200997].method2159(1, (byte) 0);
		client.anInt8690 = 0;
		client.anInt8692 = ((Class133_Sub7) this).anInt9848 * -967704577;
		client.anInt8651 = 0;
		client.anInt8709 = 862635237 * ((Class133_Sub7) this).anInt9850;
		client.anInt8696 = 451925013 * ((Class133_Sub7) this).anInt9851;
		client.anInt8711 = 527050097;
		client.anInt8824 = 2070973185 * ((Class133_Sub7) this).anInt9849;
		Class18.anInt143 = 1285777781;
		Class540.method6417((byte) 46);
		client.aBool8647 = true;
	}

	static final void method9347(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		int i_6_ = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		client.anInt8639 = 0;
		int i_7_;
		if (4 == 1797623853 * client.anInt8646)
			i_7_ = Class122.aClass130Array1483.length;
		else
			i_7_ = 765313669 * client.anInt8625 + i_6_;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			NPCDefintion class410 = null;
			Entity class456_sub1_sub2_sub3;
			if (1797623853 * client.anInt8646 == 4) {
				Class130 class130 = Class122.aClass130Array1483[i_8_];
				if (!class130.aBool1529)
					continue;
				class456_sub1_sub2_sub3 = class130.method2268(819344199);
				if (client.anInt8699 * 2074321681 != class456_sub1_sub2_sub3.anInt11609 * -1134909425)
					continue;
				if (class130.anInt1528 * -1099388557 >= 0) {
					class410 = ((NPC) class456_sub1_sub2_sub3).aClass410_11803;
					if (class410.anIntArray4795 != null) {
						class410 = class410.method4947((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), 1750354665);
						if (null == class410)
							continue;
					}
				}
			} else {
				if (i_8_ < i_6_)
					class456_sub1_sub2_sub3 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_8_]]);
				else {
					class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) (client.aClass676_8622.get((long) client.anIntArray8626[i_8_ - i_6_]))).anObject9081));
					class410 = ((NPC) class456_sub1_sub2_sub3).aClass410_11803;
					if (null != class410.anIntArray4795) {
						class410 = class410.method4947((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), -1390213108);
						if (null == class410)
							continue;
					}
				}
				if (class456_sub1_sub2_sub3.anInt11646 * 1371302107 < 0 || ((2074321681 * client.anInt8699 != -1134909425 * class456_sub1_sub2_sub3.anInt11609) && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != class456_sub1_sub2_sub3.aByte9009))
					continue;
			}
			Class538.method6398(class456_sub1_sub2_sub3, class456_sub1_sub2_sub3.method8312(-244214622), false, (byte) 63);
			if (!(client.aFloatArray8677[0] < 0.0F)) {
				if (class456_sub1_sub2_sub3.method10533(-2119075294)) {
					Class583 class583 = class456_sub1_sub2_sub3.method10567(-422238730);
					if (null != class583 && (client.anInt8639 * -1729992311 < 754613511 * client.anInt8825)) {
						client.anIntArray8828[client.anInt8639 * -1729992311] = ((Class318.aClass284_3875.method3832(class583.method6881(-319375228), (byte) 100)) / 2);
						client.anIntArray8630[-1729992311 * client.anInt8639] = (int) client.aFloatArray8677[0];
						client.anIntArray8827[client.anInt8639 * -1729992311] = (int) client.aFloatArray8677[1];
						client.aClass583Array8829[(-1729992311 * client.anInt8639)] = class583;
						client.anInt8639 += -399450951;
					}
				}
				int i_9_ = (int) ((float) i_0_ + client.aFloatArray8677[1]);
				i_9_ -= Class318.aClass284_3875.anInt3412 * -801958417;
				boolean bool = false;
				if (!class456_sub1_sub2_sub3.aBool11612 && !class456_sub1_sub2_sub3.aClass652_11627.method7699(1526806494)) {
					for (Class591_Sub6 class591_sub6 = (Class591_Sub6) class456_sub1_sub2_sub3.aClass652_11627.method7697(-1078792887); null != class591_sub6; class591_sub6 = (Class591_Sub6) class456_sub1_sub2_sub3.aClass652_11627.method7698(-1002746402)) {
						Class591_Sub5 class591_sub5 = class591_sub6.method8804(client.cycles, (byte) 3);
						if (null != class591_sub5) {
							Class566 class566 = class591_sub6.aClass566_9434;
							Player class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_8_]]);
							Class161 class161;
							Class161 class161_10_;
							if (class456_sub1_sub2_sub3_sub2 != null && (Class47.aClass47_467 != (class456_sub1_sub2_sub3_sub2.aClass47_11837))) {
								if (Class47.aClass47_469 == (class456_sub1_sub2_sub3_sub2.aClass47_11837)) {
									class161 = (class566.method6704(Class272_Sub2.aClass106_9517, class566.anInt6370 * -2062523101, (byte) -52));
									class161_10_ = (class566.method6704(Class272_Sub2.aClass106_9517, 56277311 * class566.anInt6371, (byte) -38));
								} else {
									class161 = (class566.method6704(Class272_Sub2.aClass106_9517, -89482361 * class566.anInt6369, (byte) -23));
									class161_10_ = (class566.method6704(Class272_Sub2.aClass106_9517, -1764977697 * class566.anInt6373, (byte) 42));
								}
							} else {
								class161 = class566.method6704((Class272_Sub2.aClass106_9517), (254167681 * (class566.anInt6374)), (byte) -23);
								class161_10_ = class566.method6704((Class272_Sub2.aClass106_9517), (-145304031 * (class566.anInt6367)), (byte) 86);
							}
							if (class161 != null && null != class161_10_) {
								int i_11_ = 255;
								int i_12_ = -1;
								int i_13_ = (client.cycles - class591_sub5.anInt9404 * 1305829441);
								int i_14_ = (class161_10_.method2587() * (class591_sub5.anInt9403 * 1788305111) / 255);
								if (-1884348893 * class591_sub5.anInt9406 > i_13_) {
									int i_15_ = (0 == (class566.anInt6363 * -1238370497) ? 0 : (i_13_ / (-1238370497 * class566.anInt6363) * (-1238370497 * class566.anInt6363)));
									int i_16_ = (class161_10_.method2587() * (class591_sub5.anInt9405 * 590601647) / 255);
									i_12_ = i_16_ + (i_15_ * (i_14_ - i_16_) / (class591_sub5.anInt9406 * -1884348893));
								} else {
									i_12_ = i_14_;
									int i_17_ = ((-1884348893 * class591_sub5.anInt9406) + class566.anInt6368 * 2018543333 - i_13_);
									if (-1295396945 * class566.anInt6366 >= 0)
										i_11_ = ((i_17_ << 8) / ((2018543333 * class566.anInt6368) - (class566.anInt6366 * -1295396945)));
								}
								if (1788305111 * class591_sub5.anInt9403 > 0 && i_12_ < 2)
									i_12_ = 2;
								int i_18_ = class161.method2588();
								int i_19_ = (int) ((float) i + client.aFloatArray8677[0] - (float) (class161.method2587() >> 1));
								i_9_ -= i_18_;
								if (i_11_ >= 0 && i_11_ < 255) {
									int i_20_ = i_11_ << 24;
									int i_21_ = i_20_ | 0xffffff;
									class161.method2619(i_19_, i_9_, 0, i_21_, 1);
									Class272_Sub2.aClass106_9517.method1716(i_19_, i_9_, i_19_ + i_12_, i_9_ + i_18_);
									class161_10_.method2619(i_19_, i_9_, 0, i_21_, 1);
								} else {
									class161.method2595(i_19_, i_9_);
									Class272_Sub2.aClass106_9517.method1716(i_19_, i_9_, i_12_ + i_19_, i_9_ + i_18_);
									class161_10_.method2595(i_19_, i_9_);
								}
								Class272_Sub2.aClass106_9517.method1715(i, i_0_, i_1_ + i, i_2_ + i_0_);
								i_9_ -= 2;
								bool = true;
							}
						} else if (class591_sub6.method8801(-1059400554))
							class591_sub6.method7002((byte) 95);
					}
				}
				if (!bool)
					i_9_ -= 2 + JS5ConfigGroup.aClass484_2593.anInt5399 * -1179941159;
				if (!class456_sub1_sub2_sub3.aBool11612) {
					if (class410 == null) {
						Player class456_sub1_sub2_sub3_sub2 = ((Player) class456_sub1_sub2_sub3);
						for (int i_22_ = 0; i_22_ < (class456_sub1_sub2_sub3_sub2.anIntArray11838).length; i_22_++) {
							if ((class456_sub1_sub2_sub3_sub2.anIntArray11838[i_22_]) >= 0) {
								Object object = null;
								int i_23_ = (class456_sub1_sub2_sub3_sub2.anIntArray11838[i_22_]);
								int i_24_ = (class456_sub1_sub2_sub3_sub2.anIntArray11821[i_22_]);
								long l = (long) (i_24_ << 8 | i_23_);
								Class161 class161 = ((Class161) client.aClass127_8618.method2246(l));
								if (null == class161) {
									Class87[] class87s = (Class160.method2573(Class582.aClass248_7725, i_24_, 0));
									if (class87s == null)
										continue;
									class161 = (Class272_Sub2.aClass106_9517.method1711(class87s[i_23_], true));
									client.aClass127_8618.method2229(class161, l);
								}
								if (null != class161) {
									i_9_ -= class161.method2588();
									class161.method2595((int) (client.aFloatArray8677[0] + (float) i - 12.0F), i_9_);
									i_9_ -= 2;
								}
							}
						}
					} else {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class456_sub1_sub2_sub3);
						int[] is_25_ = ((class456_sub1_sub2_sub3_sub1.aClass418_11813 != null) ? (class456_sub1_sub2_sub3_sub1.aClass418_11813.anIntArray4944) : (class456_sub1_sub2_sub3_sub1.aClass410_11803.anIntArray4822));
						short[] is_26_ = (null != (class456_sub1_sub2_sub3_sub1.aClass418_11813) ? (class456_sub1_sub2_sub3_sub1.aClass418_11813.aShortArray4945) : (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4817));
						if (is_26_ != null && null != is_25_) {
							int i_27_ = 0;
							for (/**/; i_27_ < is_26_.length; i_27_++) {
								if (is_26_[i_27_] >= 0 && is_25_[i_27_] >= 0) {
									Object object = null;
									long l = (long) (is_25_[i_27_] << 8 | is_26_[i_27_]);
									Class161 class161 = (Class161) client.aClass127_8618.method2246(l);
									if (class161 == null) {
										Class87[] class87s = (Class160.method2573(Class582.aClass248_7725, is_25_[i_27_], 0));
										if (null == class87s)
											continue;
										class161 = (Class272_Sub2.aClass106_9517.method1711(class87s[is_26_[i_27_]], true));
										client.aClass127_8618.method2229(class161, l);
									}
									if (class161 != null) {
										i_9_ -= class161.method2588();
										class161.method2595((int) ((float) i + client.aFloatArray8677[0] - (float) ((class161.method2587()) >> 1)), i_9_);
										i_9_ -= 2;
									}
								}
							}
						}
					}
				}
				if (class456_sub1_sub2_sub3 instanceof Player) {
					if (i_8_ >= 0) {
						int i_28_ = 0;
						Class193[] class193s = client.aClass193Array8593;
						for (int i_29_ = 0; i_29_ < class193s.length; i_29_++) {
							Class193 class193 = class193s[i_29_];
							if (class193 != null && 10 == class193.anInt2319 * -910441311 && (is[i_8_] == 105420277 * class193.anInt2316)) {
								Class161 class161 = (Class1.aClass161Array11[(-1800233957 * ((Class193) class193).anInt2312)]);
								if (class161.method2588() > i_28_)
									i_28_ = class161.method2588();
								class161.method2595((int) (client.aFloatArray8677[0] + (float) i - 12.0F), i_9_ - class161.method2588());
							}
						}
						if (i_28_ > 0)
							i_9_ -= i_28_ + 2;
					}
				} else {
					int i_30_ = 0;
					Class193[] class193s = client.aClass193Array8593;
					for (int i_31_ = 0; i_31_ < class193s.length; i_31_++) {
						Class193 class193 = class193s[i_31_];
						if (null != class193 && 1 == class193.anInt2319 * -910441311 && (105420277 * class193.anInt2316 == client.anIntArray8626[i_8_ - i_6_])) {
							Class161 class161 = (Class1.aClass161Array11[(((Class193) class193).anInt2312 * -1800233957)]);
							if (class161.method2588() > i_30_)
								i_30_ = class161.method2588();
							boolean bool_32_;
							if (-1662038325 * ((Class193) class193).anInt2320 == 0)
								bool_32_ = true;
							else {
								int i_33_ = (Class425.method5176(474885301) * 1000 / (((Class193) class193).anInt2320 * -1662038325) / 2);
								bool_32_ = client.cycles % (i_33_ * 2) < i_33_;
							}
							if (bool_32_)
								class161.method2595((int) (client.aFloatArray8677[0] + (float) i - 12.0F), i_9_ - class161.method2588());
						}
					}
					if (i_30_ > 0)
						i_9_ -= 2 + i_30_;
				}
				int i_34_ = 0;
				for (/**/; i_34_ < 1403567909 * JS5ConfigGroup.aClass484_2593.anInt5390; i_34_++) {
					int i_35_ = class456_sub1_sub2_sub3.anIntArray11628[i_34_];
					int i_36_ = class456_sub1_sub2_sub3.anIntArray11611[i_34_];
					Class519 class519 = null;
					int i_37_ = 0;
					if (i_36_ >= 0) {
						if (i_35_ <= client.cycles)
							continue;
						class519 = (Class519) (Class319.aClass639_Sub17_3889.getDefinition((class456_sub1_sub2_sub3.anIntArray11611[i_34_]), -255192744));
						i_37_ = -1707195987 * class519.anInt5765;
						if (class519 != null && null != class519.anIntArray5778) {
							class519 = class519.method6165((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), (byte) -20);
							if (null == class519) {
								class456_sub1_sub2_sub3.anIntArray11628[i_34_] = -1;
								continue;
							}
						}
					} else if (i_35_ < 0)
						continue;
					int i_38_ = class456_sub1_sub2_sub3.anIntArray11625[i_34_];
					Class519 class519_39_ = null;
					if (i_38_ >= 0) {
						class519_39_ = (Class519) Class319.aClass639_Sub17_3889.getDefinition(i_38_, -1746897265);
						if (null != class519_39_ && class519_39_.anIntArray5778 != null)
							class519_39_ = class519_39_.method6165((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), (byte) -20);
					}
					if (i_35_ - i_37_ <= client.cycles) {
						if (null == class519)
							class456_sub1_sub2_sub3.anIntArray11628[i_34_] = -1;
						else {
							int i_40_ = (class456_sub1_sub2_sub3.method8312(788483185) / 2);
							Class538.method6398(class456_sub1_sub2_sub3, i_40_, false, (byte) 109);
							if (client.aFloatArray8677[0] > -1.0F) {
								client.aFloatArray8677[0] += (float) (JS5ConfigGroup.aClass484_2593.anIntArray5392[i_34_]);
								client.aFloatArray8677[1] += (float) (JS5ConfigGroup.aClass484_2593.anIntArray5393[i_34_]);
								Object object = null;
								Object object_41_ = null;
								Object object_42_ = null;
								Object object_43_ = null;
								int i_44_ = 0;
								int i_45_ = 0;
								int i_46_ = 0;
								int i_47_ = 0;
								int i_48_ = 0;
								int i_49_ = 0;
								int i_50_ = 0;
								int i_51_ = 0;
								Class161 class161 = null;
								Class161 class161_52_ = null;
								Class161 class161_53_ = null;
								Class161 class161_54_ = null;
								int i_55_ = 0;
								int i_56_ = 0;
								int i_57_ = 0;
								int i_58_ = 0;
								int i_59_ = 0;
								int i_60_ = 0;
								int i_61_ = 0;
								int i_62_ = 0;
								Class161 class161_63_ = class519.method6151((Class272_Sub2.aClass106_9517), 404943978);
								if (null != class161_63_) {
									i_44_ = class161_63_.method2587();
									class161_63_.method2649(client.anIntArray8894);
									i_48_ = client.anIntArray8894[0];
								}
								Class161 class161_64_ = class519.method6152((Class272_Sub2.aClass106_9517), 884874578);
								if (null != class161_64_) {
									i_45_ = class161_64_.method2587();
									class161_64_.method2649(client.anIntArray8894);
									i_49_ = client.anIntArray8894[0];
								}
								Class161 class161_65_ = class519.method6153((Class272_Sub2.aClass106_9517), 1668791969);
								if (null != class161_65_) {
									i_46_ = class161_65_.method2587();
									class161_65_.method2649(client.anIntArray8894);
									i_50_ = client.anIntArray8894[0];
								}
								Class161 class161_66_ = class519.method6159((Class272_Sub2.aClass106_9517), 648919136);
								if (null != class161_66_) {
									i_47_ = class161_66_.method2587();
									class161_66_.method2649(client.anIntArray8894);
									i_51_ = client.anIntArray8894[0];
								}
								if (class519_39_ != null) {
									class161 = (class519_39_.method6151(Class272_Sub2.aClass106_9517, 1978647609));
									if (null != class161) {
										i_55_ = class161.method2587();
										class161.method2649(client.anIntArray8894);
										i_59_ = client.anIntArray8894[0];
									}
									class161_52_ = (class519_39_.method6152(Class272_Sub2.aClass106_9517, 341183608));
									if (class161_52_ != null) {
										i_56_ = class161_52_.method2587();
										class161_52_.method2649(client.anIntArray8894);
										i_60_ = client.anIntArray8894[0];
									}
									class161_53_ = (class519_39_.method6153(Class272_Sub2.aClass106_9517, 221329387));
									if (null != class161_53_) {
										i_57_ = class161_53_.method2587();
										class161_53_.method2649(client.anIntArray8894);
										i_61_ = client.anIntArray8894[0];
									}
									class161_54_ = (class519_39_.method6159(Class272_Sub2.aClass106_9517, 2032831982));
									if (null != class161_54_) {
										i_58_ = class161_54_.method2587();
										class161_54_.method2649(client.anIntArray8894);
										i_62_ = client.anIntArray8894[0];
									}
								}
								Class102 class102 = Class298.aClass102_3481;
								Class102 class102_67_ = Class298.aClass102_3481;
								Class284 class284 = Class23.aClass284_155;
								Class284 class284_68_ = Class23.aClass284_155;
								int i_69_ = class519.anInt5763 * -603364589;
								if (i_69_ >= 0) {
									Class102 class102_70_ = ((Class102) (Class133_Sub20.aClass324_10261.method4129(client.anInterface19_8776, i_69_, true, class519.aBool5776, 878143997)));
									Class284 class284_71_ = (Class133_Sub20.aClass324_10261.method4130(client.anInterface19_8776, i_69_, (byte) 39));
									if (class102_70_ != null && class284_71_ != null) {
										class102 = class102_70_;
										class284 = class284_71_;
									}
								}
								if (class519_39_ != null) {
									i_69_ = -603364589 * class519_39_.anInt5763;
									if (i_69_ >= 0) {
										Class102 class102_72_ = ((Class102) (Class133_Sub20.aClass324_10261.method4129(client.anInterface19_8776, i_69_, true, class519_39_.aBool5776, 878143997)));
										Class284 class284_73_ = (Class133_Sub20.aClass324_10261.method4130(client.anInterface19_8776, i_69_, (byte) 83));
										if (null != class102_72_ && class284_73_ != null) {
											class102_67_ = class102_72_;
											class284_68_ = class284_73_;
										}
									}
								}
								Object object_74_ = null;
								String string = null;
								boolean bool_75_ = false;
								int i_76_ = 0;
								String string_77_ = (class519.method6150((class456_sub1_sub2_sub3.anIntArray11623[i_34_]), -299004719));
								int i_78_ = class284.method3832(string_77_, (byte) 100);
								if (null != class519_39_) {
									string = (class519_39_.method6150((class456_sub1_sub2_sub3.anIntArray11665[i_34_]), -299004719));
									i_76_ = class284_68_.method3832(string, (byte) 100);
								}
								int i_79_ = 0;
								int i_80_ = 0;
								if (i_45_ > 0)
									i_79_ = i_78_ / i_45_ + 1;
								if (class519_39_ != null && i_56_ > 0)
									i_80_ = 1 + i_76_ / i_56_;
								int i_81_ = 0;
								int i_82_ = i_81_;
								if (i_44_ > 0)
									i_81_ += i_44_;
								i_81_ += 2;
								int i_83_ = i_81_;
								if (i_46_ > 0)
									i_81_ += i_46_;
								int i_84_ = i_81_;
								int i_85_ = i_81_;
								if (i_45_ > 0) {
									int i_86_ = i_79_ * i_45_;
									i_81_ += i_86_;
									i_85_ += (i_86_ - i_78_) / 2;
								} else
									i_81_ += i_78_;
								int i_87_ = i_81_;
								if (i_47_ > 0)
									i_81_ += i_47_;
								int i_88_ = 0;
								int i_89_ = 0;
								int i_90_ = 0;
								int i_91_ = 0;
								int i_92_ = 0;
								if (null != class519_39_) {
									i_81_ += 2;
									i_88_ = i_81_;
									if (i_55_ > 0)
										i_81_ += i_55_;
									i_81_ += 2;
									i_89_ = i_81_;
									if (i_57_ > 0)
										i_81_ += i_57_;
									i_90_ = i_81_;
									i_92_ = i_81_;
									if (i_56_ > 0) {
										int i_93_ = i_56_ * i_80_;
										i_81_ += i_93_;
										i_92_ += (i_93_ - i_76_) / 2;
									} else
										i_81_ += i_76_;
									i_91_ = i_81_;
									if (i_58_ > 0)
										i_81_ += i_58_;
								}
								int i_94_ = ((class456_sub1_sub2_sub3.anIntArray11628[i_34_]) - client.cycles);
								int i_95_ = (class519.anInt5770 * -2121015693 - (i_94_ * (-2121015693 * class519.anInt5770) / (class519.anInt5765 * -1707195987)));
								int i_96_ = (-(-241805755 * class519.anInt5771) + (i_94_ * (class519.anInt5771 * -241805755) / (-1707195987 * class519.anInt5765)));
								int i_97_ = (int) (client.aFloatArray8677[0] + (float) i - (float) (i_81_ >> 1) + (float) i_95_);
								int i_98_ = (int) ((float) i_96_ + (client.aFloatArray8677[1] + (float) i_0_ - 12.0F));
								int i_99_ = (15 + i_98_ + class519.anInt5775 * 2092006147);
								int i_100_ = 0;
								if (null != class519_39_)
									i_100_ = 15 + i_98_ + (class519_39_.anInt5775 * 2092006147);
								int i_101_ = 255;
								if (class519.anInt5772 * 276537245 >= 0)
									i_101_ = ((i_94_ << 8) / (-1707195987 * class519.anInt5765 - (class519.anInt5772 * 276537245)));
								if (i_101_ >= 0 && i_101_ < 255) {
									int i_102_ = i_101_ << 24;
									int i_103_ = i_102_ | 0xffffff;
									if (class161_63_ != null)
										class161_63_.method2619((i_97_ + i_82_ - i_48_), i_98_, 0, i_103_, 1);
									if (class161_65_ != null)
										class161_65_.method2619((class519.anInt5761 * -55018029 + (i_97_ + i_83_ - i_50_)), i_98_ + (505892001 * class519.anInt5780), 0, i_103_, 1);
									if (null != class161_64_) {
										for (int i_104_ = 0; i_104_ < i_79_; i_104_++)
											class161_64_.method2619(((class519.anInt5761 * -55018029) + (i_45_ * i_104_ + (i_97_ + i_84_ - i_49_))), ((505892001 * class519.anInt5780) + i_98_), 0, i_103_, 1);
									}
									if (null != class161_66_)
										class161_66_.method2619((i_97_ + i_87_ - i_51_ + (class519.anInt5761 * -55018029)), (505892001 * class519.anInt5780 + i_98_), 0, i_103_, 1);
									class102.method1620(string_77_, i_97_ + i_85_, i_99_, ((-651106923 * class519.anInt5764) | i_102_), 0, -807016788);
									if (null != class519_39_) {
										if (null != class161)
											class161.method2619((i_97_ + i_88_ - i_59_), i_98_, 0, i_103_, 1);
										if (class161_53_ != null)
											class161_53_.method2619(((class519_39_.anInt5761 * -55018029) + (i_89_ + i_97_ - i_61_)), (i_98_ + (class519_39_.anInt5780 * 505892001)), 0, i_103_, 1);
										if (class161_52_ != null) {
											for (int i_105_ = 0; i_105_ < i_80_; i_105_++)
												class161_52_.method2619((i_56_ * i_105_ + (i_97_ + i_90_ - i_60_) + (class519_39_.anInt5761 * -55018029)), i_98_ + (505892001 * (class519_39_.anInt5780)), 0, i_103_, 1);
										}
										if (class161_54_ != null)
											class161_54_.method2619((i_91_ + i_97_ - i_62_ + -55018029 * (class519_39_.anInt5761)), (i_98_ + (class519_39_.anInt5780 * 505892001)), 0, i_103_, 1);
										class102_67_.method1620(string, i_92_ + i_97_, i_100_, (((class519_39_.anInt5764) * -651106923) | i_102_), 0, 2041938772);
									}
								} else {
									if (null != class161_63_)
										class161_63_.method2595((i_82_ + i_97_ - i_48_), i_98_);
									if (class161_65_ != null)
										class161_65_.method2595((class519.anInt5761 * -55018029 + (i_83_ + i_97_ - i_50_)), i_98_ + (class519.anInt5780 * 505892001));
									if (class161_64_ != null) {
										for (int i_106_ = 0; i_106_ < i_79_; i_106_++)
											class161_64_.method2595((i_45_ * i_106_ + (i_97_ + i_84_ - i_49_) + (class519.anInt5761 * -55018029)), (i_98_ + (505892001 * class519.anInt5780)));
									}
									if (class161_66_ != null)
										class161_66_.method2595((i_97_ + i_87_ - i_51_ + (class519.anInt5761 * -55018029)), i_98_ + (class519.anInt5780 * 505892001));
									class102.method1620(string_77_, i_97_ + i_85_, i_99_, ((-651106923 * class519.anInt5764) | ~0xffffff), 0, 2141324522);
									if (null != class519_39_) {
										if (null != class161)
											class161.method2595((i_97_ + i_88_ - i_59_), i_98_);
										if (null != class161_53_)
											class161_53_.method2595(((-55018029 * class519_39_.anInt5761) + (i_97_ + i_89_ - i_61_)), (i_98_ + (class519_39_.anInt5780 * 505892001)));
										if (null != class161_52_) {
											for (int i_107_ = 0; i_107_ < i_80_; i_107_++)
												class161_52_.method2595((i_107_ * i_56_ + (i_90_ + i_97_ - i_60_) + (class519_39_.anInt5761 * -55018029)), (i_98_ + (class519_39_.anInt5780 * 505892001)));
										}
										if (class161_54_ != null)
											class161_54_.method2595((i_91_ + i_97_ - i_62_ + (class519_39_.anInt5761 * -55018029)), (class519_39_.anInt5780 * 505892001) + i_98_);
										class102_67_.method1620(string, i_92_ + i_97_, i_100_, (((class519_39_.anInt5764) * -651106923) | ~0xffffff), 0, 105460715);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_108_ = 0; i_108_ < -643403915 * client.anInt8836; i_108_++) {
			int i_109_ = client.anIntArray8700[i_108_];
			Entity class456_sub1_sub2_sub3;
			if (i_109_ < 2048)
				class456_sub1_sub2_sub3 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_109_];
			else
				class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) client.aClass676_8622.get((long) (i_109_ - 2048))).anObject9081));
			int i_110_ = client.anIntArray8656[i_108_];
			Entity class456_sub1_sub2_sub3_111_;
			if (i_110_ < 2048)
				class456_sub1_sub2_sub3_111_ = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_110_];
			else
				class456_sub1_sub2_sub3_111_ = ((Entity) (((LinkableObject) client.aClass676_8622.get((long) (i_110_ - 2048))).anObject9081));
			IncomingPacket.method4111(class456_sub1_sub2_sub3, class456_sub1_sub2_sub3_111_, (class456_sub1_sub2_sub3.anInt11613 -= -1222973013) * 598264067, i, i_0_, i_1_, i_2_, i_3_, i_4_, (byte) -4);
		}
		int i_112_ = (Class318.aClass284_3875.anInt3413 * -2086019023 + -801958417 * Class318.aClass284_3875.anInt3412 + 2);
		for (int i_113_ = 0; i_113_ < client.anInt8639 * -1729992311; i_113_++) {
			int i_114_ = client.anIntArray8630[i_113_];
			int i_115_ = client.anIntArray8827[i_113_];
			int i_116_ = client.anIntArray8828[i_113_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_117_ = 0; i_117_ < i_113_; i_117_++) {
					if (i_115_ + 2 > client.anIntArray8827[i_117_] - i_112_ && i_115_ - i_112_ < 2 + client.anIntArray8827[i_117_] && i_114_ - i_116_ < (client.anIntArray8630[i_117_] + client.anIntArray8828[i_117_]) && i_114_ + i_116_ > (client.anIntArray8630[i_117_] - client.anIntArray8828[i_117_]) && client.anIntArray8827[i_117_] - i_112_ < i_115_) {
						i_115_ = client.anIntArray8827[i_117_] - i_112_;
						bool = true;
					}
				}
			}
			client.anIntArray8827[i_113_] = i_115_;
			String string = client.aClass583Array8829[i_113_].method6881(-1167213138);
			if (0 == 2064557233 * client.anInt8761) {
				int i_118_ = 16776960;
				int i_119_ = client.aClass583Array8829[i_113_].method6878((byte) 15);
				if (i_119_ < 6)
					i_118_ = client.anIntArray8634[i_119_];
				if (6 == i_119_)
					i_118_ = (2074321681 * client.anInt8699 % 20 < 10 ? 16711680 : 16776960);
				if (i_119_ == 7)
					i_118_ = (2074321681 * client.anInt8699 % 20 < 10 ? 255 : 65535);
				if (8 == i_119_)
					i_118_ = (client.anInt8699 * 2074321681 % 20 < 10 ? 45056 : 8454016);
				if (9 == i_119_) {
					int i_120_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) 76) * 150 / client.aClass583Array8829[i_113_].method6876(1808971392));
					if (i_120_ < 50)
						i_118_ = 16711680 + i_120_ * 1280;
					else if (i_120_ < 100)
						i_118_ = 16776960 - (i_120_ - 50) * 327680;
					else if (i_120_ < 150)
						i_118_ = 5 * (i_120_ - 100) + 65280;
				}
				if (i_119_ == 10) {
					int i_121_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) -17) * 150 / client.aClass583Array8829[i_113_].method6876(393673486));
					if (i_121_ < 50)
						i_118_ = i_121_ * 5 + 16711680;
					else if (i_121_ < 100)
						i_118_ = 16711935 - 327680 * (i_121_ - 50);
					else if (i_121_ < 150)
						i_118_ = (255 + 327680 * (i_121_ - 100) - (i_121_ - 100) * 5);
				}
				if (11 == i_119_) {
					int i_122_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) 47) * 150 / client.aClass583Array8829[i_113_].method6876(-310228786));
					if (i_122_ < 50)
						i_118_ = 16777215 - 327685 * i_122_;
					else if (i_122_ < 100)
						i_118_ = 65280 + 327685 * (i_122_ - 50);
					else if (i_122_ < 150)
						i_118_ = 16777215 - 327680 * (i_122_ - 100);
				}
				int i_123_ = i_118_ | ~0xffffff;
				int i_124_ = client.aClass583Array8829[i_113_].method6884(1627204661);
				if (0 == i_124_)
					Class1.aClass102_16.method1612(string, i_114_ + i, i_0_ + i_115_, i_123_, -16777216, (byte) 8);
				if (1 == i_124_)
					Class1.aClass102_16.method1630(string, i + i_114_, i_115_ + i_0_, i_123_, -16777216, (2074321681 * client.anInt8699), -2038984422);
				if (2 == i_124_)
					Class1.aClass102_16.method1614(string, i + i_114_, i_115_ + i_0_, i_123_, -16777216, (client.anInt8699 * 2074321681), (byte) -37);
				if (3 == i_124_) {
					int i_125_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) 3) * 150 / client.aClass583Array8829[i_113_].method6876(60624991));
					Class1.aClass102_16.method1615(string, i_114_ + i, i_115_ + i_0_, i_123_, -16777216, (client.anInt8699 * 2074321681), i_125_, -424445182);
				}
				if (4 == i_124_) {
					int i_126_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) -10) * 150 / client.aClass583Array8829[i_113_].method6876(1262716341));
					int i_127_ = i_126_ * (Class318.aClass284_3875.method3832(string, (byte) 100) + 100) / 150;
					Class272_Sub2.aClass106_9517.method1716(i_114_ + i - 50, i_0_, i + i_114_ + 50, i_2_ + i_0_);
					Class1.aClass102_16.method1620(string, i + i_114_ + 50 - i_127_, i_0_ + i_115_, i_123_, -16777216, 467784017);
					Class272_Sub2.aClass106_9517.method1715(i, i_0_, i + i_1_, i_0_ + i_2_);
				}
				if (5 == i_124_) {
					int i_128_ = 150 - (client.aClass583Array8829[i_113_].method6880((byte) 41) * 150 / client.aClass583Array8829[i_113_].method6876(1412296904));
					int i_129_ = 0;
					if (i_128_ < 25)
						i_129_ = i_128_ - 25;
					else if (i_128_ > 125)
						i_129_ = i_128_ - 125;
					int i_130_ = (Class318.aClass284_3875.anInt3413 * -2086019023 + Class318.aClass284_3875.anInt3412 * -801958417);
					Class272_Sub2.aClass106_9517.method1716(i, (i_115_ + i_0_ - i_130_ - 1), i + i_1_, i_0_ + i_115_ + 5);
					Class1.aClass102_16.method1612(string, i_114_ + i, i_129_ + (i_0_ + i_115_), i_123_, -16777216, (byte) 8);
					Class272_Sub2.aClass106_9517.method1715(i, i_0_, i_1_ + i, i_0_ + i_2_);
				}
			} else
				Class1.aClass102_16.method1612(string, i + i_114_, i_115_ + i_0_, -256, -16777216, (byte) 8);
		}
	}

	static final void method9348(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_131_ = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581 + 1]);
		if ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = string;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = string_131_;
	}
}
