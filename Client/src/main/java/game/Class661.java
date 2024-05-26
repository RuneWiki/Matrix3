package game;

/* Class661 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class661 implements Interface52 {
	public static Class661 aClass661_8443;
	public static Class661 aClass661_8444;
	public static Class661 aClass661_8445;
	int anInt8446;
	public static Class661 aClass661_8447;
	public static Class661 aClass661_8448 = new Class661(2, 0);
	public static Class661 aClass661_8449;
	public static Class661 aClass661_8450;
	public int anInt8451;
	public static Class661 aClass661_8452;

	public int getId(int i) {
		return ((Class661) this).anInt8446 * -1423167603;
	}

	public int method143() {
		return ((Class661) this).anInt8446 * -1423167603;
	}

	public int method45() {
		return ((Class661) this).anInt8446 * -1423167603;
	}

	static {
		aClass661_8444 = new Class661(0, 1);
		aClass661_8445 = new Class661(4, 2);
		aClass661_8443 = new Class661(5, 3);
		aClass661_8447 = new Class661(3, 4);
		aClass661_8452 = new Class661(7, 5);
		aClass661_8449 = new Class661(6, 6);
		aClass661_8450 = new Class661(1, 7);
	}

	Class661(int i, int i_0_) {
		anInt8451 = i * -1534481177;
		((Class661) this).anInt8446 = i_0_ * 799320901;
	}

	public int method43() {
		return ((Class661) this).anInt8446 * -1423167603;
	}

	public int method61() {
		return ((Class661) this).anInt8446 * -1423167603;
	}

	public Class661 method7778(byte i) {
		switch (anInt8451 * -378624297) {
			case 3:
				return aClass661_8448;
			case 2:
				return aClass661_8447;
			case 7:
				return aClass661_8444;
			case 1:
				return aClass661_8443;
			case 6:
				return aClass661_8445;
			case 5:
				return aClass661_8450;
			case 4:
				return aClass661_8449;
			case 0:
				return aClass661_8452;
			default:
				throw new IllegalStateException();
		}
	}

	public static void method7779(int i) {
		Class256.aClass675_2765 = new Class675();
	}

	static final void method7780(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class133_Sub16.method9375(string, i_1_, -1325404463);
	}

	public static String method7781(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		if (Class25.aBool165 || class572_sub12_sub10 == null)
			return "";
		if ((((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391 == null || ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391.length() == 0) && (((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403 != null) && ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403.length() > 0)
			return ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403;
		return ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391;
	}

	static boolean method7782(Class106 class106, int i, int i_2_) {
		class106.method1747();
		Class69.method1067(-1740070134);
		if (!class106.method1723(2145811854))
			return false;
		int i_3_ = client.aClass613_8605.method7347(1152059887);
		int i_4_ = client.aClass613_8605.method7278(277214477);
		Class274 class274 = client.aClass613_8605.method7287((byte) 112);
		Class523 class523 = client.aClass613_8605.method7285(1855827527);
		int i_5_ = i;
		if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976) {
			int i_6_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) >> 3);
			int i_7_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) >> 3);
			if (i_6_ >= 0 && i_6_ < Class406.aBoolArrayArray4764.length && i_7_ >= 0 && i_7_ < Class406.aBoolArrayArray4764[i_6_].length && Class406.aBoolArrayArray4764[i_6_][i_7_])
				i_5_ = 0;
		}
		int i_8_ = i_3_ / 2;
		int i_9_ = 0;
		int i_10_ = 0;
		boolean bool = true;
		for (int i_11_ = i_9_; i_11_ < i_9_ + i_3_; i_11_++) {
			for (int i_12_ = i_10_; i_12_ < i_4_ + i_10_; i_12_++) {
				for (int i_13_ = i_5_; i_13_ <= 3; i_13_++) {
					if (i_13_ < i || class274.method3683(i, i_13_, i_11_, i_12_, (byte) 83)) {
						int i_14_ = i_13_;
						if (class274.method3689(i_11_, i_12_, -2014098895))
							i_14_--;
						if (i_14_ >= 0)
							bool &= Class14.method638(i_14_, i_11_, i_12_, -1160383641);
					}
				}
			}
		}
		if (!bool)
			return false;
		int i_15_ = 48 + (4 * i_3_ + 48);
		int[] is = new int[i_15_ * i_15_];
		for (int i_16_ = 0; i_16_ < is.length; i_16_++)
			is[i_16_] = 0;
		Class104_Sub1 class104_sub1 = null;
		int i_17_ = 0;
		int i_18_ = 0;
		if (Class192.aBool2297) {
			Class614.aClass161_8039 = class106.method1864(i_15_, i_15_, false, true);
			class104_sub1 = class106.method1693();
			class104_sub1.method9908(0, Class614.aClass161_8039.method2590());
			Interface11 interface11 = class106.method1694(i_15_, i_15_);
			class104_sub1.method9906(interface11);
			class106.method1661(class104_sub1, -1197613179);
			i_8_ = i_3_;
			i_17_ = 48;
			i_18_ = 48;
			class106.method1719(1, 0);
		} else
			Class614.aClass161_8039 = class106.method1744(is, 0, i_15_, i_15_, i_15_, -568321946);
		client.aClass613_8605.method7306(-1042067865).method5976(2114060328);
		int i_19_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
		int i_20_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_21_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
		boolean[][] bools = new boolean[2 + (1 + i_8_)][2 + (i_8_ + 1)];
		class106.method1712(Class192.anIntArray2305);
		class106.method1975();
		for (int i_22_ = i_9_; i_22_ < i_3_ + i_9_; i_22_ += i_8_) {
			for (int i_23_ = i_10_; i_23_ < i_10_ + i_4_; i_23_ += i_8_) {
				int i_24_ = i_17_;
				int i_25_ = i_18_;
				int i_26_ = i_22_;
				if (i_26_ > 0) {
					i_26_--;
					i_24_ += 4;
				}
				int i_27_ = i_23_;
				if (i_27_ > 0)
					i_27_--;
				int i_28_ = i_22_ + i_8_;
				if (i_28_ < i_3_)
					i_28_++;
				int i_29_ = i_23_ + i_8_;
				if (i_29_ < i_4_) {
					i_29_++;
					i_25_ += 4;
				}
				if (Class192.aBool2296)
					class106.method1714();
				else
					class106.method1715(0, 0, 4 * i_8_ + i_24_, i_25_ + 4 * i_8_);
				class106.method1719(3, -16777216);
				int i_30_ = i_8_;
				if (i_30_ > i_3_ - 1)
					i_30_ = i_3_ - 1;
				for (int i_31_ = i_5_; i_31_ <= 3; i_31_++) {
					for (int i_32_ = 0; i_32_ <= i_30_; i_32_++) {
						for (int i_33_ = 0; i_33_ <= i_30_; i_33_++)
							bools[i_32_][i_33_] = (i_31_ < i || class274.method3683(i, i_31_, i_26_ + i_32_, i_33_ + i_27_, (byte) 33));
					}
					class523.aClass174Array5838[i_31_].method2716(i_17_, i_18_, 1024, i_26_, i_27_, i_28_, i_29_, bools);
					for (int i_34_ = -4; i_34_ < i_8_; i_34_++) {
						for (int i_35_ = -4; i_35_ < i_8_; i_35_++) {
							int i_36_ = i_34_ + i_22_;
							int i_37_ = i_35_ + i_23_;
							if (i_36_ >= i_9_ && i_37_ >= i_10_ && (i_31_ < i || class274.method3683(i, i_31_, i_36_, i_37_, (byte) 60))) {
								int i_38_ = i_31_;
								if (class274.method3689(i_36_, i_37_, -2112504320))
									i_38_--;
								if (i_38_ >= 0)
									Class545.method6454(class106, i_38_, i_36_, i_37_, i_34_ * 4 + i_24_, (i_25_ + 4 * (i_8_ - i_35_) - 4), i_19_, i_20_, 1019967701);
							}
						}
					}
				}
				class106.method1725(i_24_, i_25_, i_8_ * 4, i_8_ * 4, i_21_, 2);
				class106.method1747();
				if (!Class192.aBool2297) {
					Class614.aClass161_8039.method2607(48 + (i_22_ - i_9_) * 4, (48 + i_4_ * 4 - 4 * (i_23_ - i_10_) - i_8_ * 4), 4 * i_8_, i_8_ * 4, i_24_, i_25_);
					if (Class192.aBool2296) {
						Class614.aClass161_8039.method2595(256, 0);
						try {
							class106.method1966(-531357225);
							Class198.method2977(2000L);
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		if (Class192.aBool2297) {
			class106.method1884(class104_sub1, 1980162854);
			if (Class192.aBool2296) {
				Class614.aClass161_8039.method2595(256, 0);
				try {
					class106.method1966(278200471);
					Class198.method2977(2000L);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class106.method1714();
		class106.method2004(Class192.anIntArray2305[0], Class192.anIntArray2305[1], Class192.anIntArray2305[2], Class192.anIntArray2305[3]);
		class106.method1719(1, 1);
		Class54.method987((byte) 91);
		Class192.anInt2298 = 0;
		Class192.aClass675_2306.method7918(773667364);
		if (!Class192.aBool2308) {
			Class639_Sub21.method9013(i, 1231185265);
			Class548 class548 = client.aClass613_8605.method7281(804058052);
			if (class548 != null) {
				Class323.aClass639_Sub12_4081.method8945(1024, 64, 44598867);
				Class497 class497 = client.aClass613_8605.method7280((byte) -120);
				for (int i_39_ = 0; i_39_ < 613080349 * class548.anInt6194; i_39_++) {
					int i_40_ = class548.anIntArray6192[i_39_];
					if (i_40_ >> 28 == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009)) {
						int i_41_ = ((i_40_ >> 14 & 0x3fff) - -2109597897 * class497.localX);
						int i_42_ = ((i_40_ & 0x3fff) - class497.localY * 417324155);
						if (i_41_ >= 0 && i_41_ < i_3_ && i_42_ >= 0 && i_42_ < i_4_)
							Class192.aClass675_2306.method7940(new LinkableInt(i_39_), -1706199235);
						else {
							Class78 class78 = ((Class78) (Class323.aClass639_Sub12_4081.getDefinition(class548.anIntArray6193[i_39_], 2018359147)));
							if (null != class78.anIntArray1002 && i_41_ + class78.anInt1003 * -232986123 >= 0 && i_41_ + class78.anInt986 * -855683561 < i_3_ && i_42_ + -266857517 * class78.anInt962 >= 0 && (class78.anInt987 * 1944042083 + i_42_ < i_4_))
								Class192.aClass675_2306.method7940(new LinkableInt(i_39_), -1596373804);
						}
					}
				}
				Class323.aClass639_Sub12_4081.method8945(128, 64, 925897039);
			}
		}
		return true;
	}
}
