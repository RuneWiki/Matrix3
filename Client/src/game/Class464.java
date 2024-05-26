package game;

/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class464 {
	Class464() throws Throwable {
		throw new Error();
	}

	public static String method5480(byte[] is, int i, int i_0_) {
		char[] cs = new char[i_0_];
		int i_1_ = 0;
		int i_2_ = i;
		int i_3_ = i_0_ + i;
		while (i_2_ < i_3_) {
			int i_4_ = is[i_2_++] & 0xff;
			int i_5_;
			if (i_4_ < 128) {
				if (i_4_ == 0)
					i_5_ = 65533;
				else
					i_5_ = i_4_;
			} else if (i_4_ < 192)
				i_5_ = 65533;
			else if (i_4_ < 224) {
				if (i_2_ < i_3_ && 128 == (is[i_2_] & 0xc0)) {
					i_5_ = (i_4_ & 0x1f) << 6 | is[i_2_++] & 0x3f;
					if (i_5_ < 128)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 240) {
				if (i_2_ + 1 < i_3_ && (is[i_2_] & 0xc0) == 128 && (is[1 + i_2_] & 0xc0) == 128) {
					i_5_ = ((i_4_ & 0xf) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 2048)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 248) {
				if (i_2_ + 2 < i_3_ && 128 == (is[i_2_] & 0xc0) && 128 == (is[i_2_ + 1] & 0xc0) && (is[i_2_ + 2] & 0xc0) == 128) {
					i_5_ = ((i_4_ & 0x7) << 18 | (is[i_2_++] & 0x3f) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 65536 || i_5_ > 1114111)
						i_5_ = 65533;
					else
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else
				i_5_ = 65533;
			cs[i_1_++] = (char) i_5_;
		}
		return new String(cs, 0, i_1_);
	}

	public static String method5481(byte[] is, int i, int i_6_) {
		char[] cs = new char[i_6_];
		int i_7_ = 0;
		int i_8_ = i;
		int i_9_ = i_6_ + i;
		while (i_8_ < i_9_) {
			int i_10_ = is[i_8_++] & 0xff;
			int i_11_;
			if (i_10_ < 128) {
				if (i_10_ == 0)
					i_11_ = 65533;
				else
					i_11_ = i_10_;
			} else if (i_10_ < 192)
				i_11_ = 65533;
			else if (i_10_ < 224) {
				if (i_8_ < i_9_ && 128 == (is[i_8_] & 0xc0)) {
					i_11_ = (i_10_ & 0x1f) << 6 | is[i_8_++] & 0x3f;
					if (i_11_ < 128)
						i_11_ = 65533;
				} else
					i_11_ = 65533;
			} else if (i_10_ < 240) {
				if (i_8_ + 1 < i_9_ && (is[i_8_] & 0xc0) == 128 && (is[1 + i_8_] & 0xc0) == 128) {
					i_11_ = ((i_10_ & 0xf) << 12 | (is[i_8_++] & 0x3f) << 6 | is[i_8_++] & 0x3f);
					if (i_11_ < 2048)
						i_11_ = 65533;
				} else
					i_11_ = 65533;
			} else if (i_10_ < 248) {
				if (i_8_ + 2 < i_9_ && 128 == (is[i_8_] & 0xc0) && 128 == (is[i_8_ + 1] & 0xc0) && (is[i_8_ + 2] & 0xc0) == 128) {
					i_11_ = ((i_10_ & 0x7) << 18 | (is[i_8_++] & 0x3f) << 12 | (is[i_8_++] & 0x3f) << 6 | is[i_8_++] & 0x3f);
					if (i_11_ < 65536 || i_11_ > 1114111)
						i_11_ = 65533;
					else
						i_11_ = 65533;
				} else
					i_11_ = 65533;
			} else
				i_11_ = 65533;
			cs[i_7_++] = (char) i_11_;
		}
		return new String(cs, 0, i_7_);
	}

	static final void method5482(Cs2Executor class441, int i) {
		int i_12_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (Math.random() * (double) i_12_);
	}

	static final void method5483(Cs2Executor class441, int i) {
		int i_13_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (!Class272_Sub2.aClass106_9517.method1675())
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 3;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method7863(i_13_, 381474842);
	}

	static void method5484(Class106 class106, InterfaceDefinitions class73, int i, int i_14_, int i_15_) {
		if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976) {
			class106.method1747();
			Class71 class71 = null;
			Class167 class167 = null;
			if (-1285279191 * class73.anInt752 == 5) {
				class71 = class73.method1099(class106, -1330741571);
				if (class71 == null)
					return;
				class167 = class71.aClass167_709;
				if ((669238293 * class73.anInt764 != -1355315821 * class71.anInt711) || (1360982075 * class73.anInt765 != -1763697347 * class71.anInt710))
					throw new IllegalStateException("");
			}
			class106.method1715(i, i_14_, 669238293 * class73.anInt764 + i, i_14_ + 1360982075 * class73.anInt765);
			if (2 != Class192.anInt2304 * -229939747 && -229939747 * Class192.anInt2304 != 5 && Class614.aClass161_8039 != null) {
				class106.method1712(Class192.anIntArray2305);
				class106.method1975();
				Class497 class497 = client.aClass613_8605.method7280((byte) -72);
				int i_16_;
				int i_17_;
				int i_18_;
				int i_19_;
				if (6 == Class18.anInt143 * 625220759) {
					i_16_ = client.anInt8675 * 325769767;
					i_17_ = client.anInt8792 * -1702297057;
					i_18_ = (int) -client.aFloat8678 & 0x3fff;
					i_19_ = 4096;
				} else {
					Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
					i_16_ = (int) class240.aFloat2653;
					i_17_ = (int) class240.aFloat2657;
					if (1 == 625220759 * Class18.anInt143)
						i_18_ = ((int) -((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) + -777638353 * client.anInt8766) & 0x3fff;
					else
						i_18_ = ((int) -client.aFloat8678 + -777638353 * client.anInt8766) & 0x3fff;
					i_19_ = 4096 - client.anInt8670 * 626807696;
				}
				int i_20_ = 48 + i_16_ / 128;
				int i_21_ = (48 + client.aClass613_8605.method7278(277214477) * 4 - i_17_ / 128);
				if (class167 != null)
					Class614.aClass161_8039.method2631(((float) i + (float) (class73.anInt764 * 669238293) / 2.0F), ((float) (1360982075 * class73.anInt765) / 2.0F + (float) i_14_), (float) i_20_, (float) i_21_, i_19_, i_18_ << 2, class167, i, i_14_);
				else
					Class614.aClass161_8039.method2604(((float) i + (float) (669238293 * class73.anInt764) / 2.0F), ((float) i_14_ + (float) (class73.anInt765 * 1360982075) / 2.0F), (float) i_20_, (float) i_21_, i_19_, i_18_ << 2, 1, -1, 1);
				Class548 class548 = client.aClass613_8605.method7281(1910222742);
				for (LinkableInt class572_sub26 = ((LinkableInt) Class192.aClass675_2306.method7932((byte) 50)); class572_sub26 != null; class572_sub26 = ((LinkableInt) Class192.aClass675_2306.method7926(1363771744))) {
					int i_22_ = -1945426987 * class572_sub26.anInt9258;
					int i_23_ = ((class548.anIntArray6192[i_22_] >> 14 & 0x3fff) - -2109597897 * class497.localX);
					int i_24_ = ((class548.anIntArray6192[i_22_] & 0x3fff) - 417324155 * class497.localY);
					int i_25_ = 4 * i_23_ + 2 - i_16_ / 128;
					int i_26_ = 2 + 4 * i_24_ - i_17_ / 128;
					Class102.method1638(class106, class167, class73, i, i_14_, i_25_, i_26_, class548.anIntArray6193[i_22_], 1671419599);
				}
				for (int i_27_ = 0; i_27_ < 1491943261 * Class192.anInt2298; i_27_++) {
					int i_28_ = 4 * Class192.anIntArray2301[i_27_] + 2 - i_16_ / 128;
					int i_29_ = 2 + 4 * Class192.anIntArray2302[i_27_] - i_17_ / 128;
					ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(-449585757).getDefinition(Class192.anIntArray2303[i_27_], 1399501491)));
					if (class509.anIntArray5605 != null) {
						class509 = class509.method6047((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), 623307957);
						if (class509 == null || -1 == class509.anInt5642 * -105296855)
							continue;
					}
					Class102.method1638(class106, class167, class73, i, i_14_, i_28_, i_29_, -105296855 * class509.anInt5642, -936903428);
				}
				for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) -55)); class572_sub42 != null; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(1837285376))) {
					int i_30_ = (int) ((381237825124074065L * class572_sub42.hash) >> 28 & 0x3L);
					if (Class192.anInt2299 * -486193957 == i_30_) {
						int i_31_ = ((int) ((381237825124074065L * class572_sub42.hash) & 0x3fffL) - -2109597897 * class497.localX);
						int i_32_ = ((int) ((class572_sub42.hash * 381237825124074065L) >> 14 & 0x3fffL) - class497.localY * 417324155);
						int i_33_ = 2 + i_31_ * 4 - i_16_ / 128;
						int i_34_ = 2 + i_32_ * 4 - i_17_ / 128;
						Class561.method6631(class73, class167, i, i_14_, i_33_, i_34_, (Class628_Sub1.aClass161Array9537[0]), -865093257);
					}
				}
				Class267.method3651(class106, i_16_, i_17_, class73, class167, i, i_14_, 462194643);
				Class328.method4155(i_16_, i_17_, class73, class167, i, i_14_, (short) 256);
				Class380.method4641(i_16_, i_17_, class73, class71, i, i_14_, (byte) -123);
				if (6 != Class18.anInt143 * 625220759) {
					if (-1539999119 * Class192.anInt2310 != -1) {
						int i_35_ = (2 + -1865029180 * Class192.anInt2310 - i_16_ / 128 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -4630) - 1) * 2);
						int i_36_ = (2136051524 * Class192.anInt2300 + 2 - i_17_ / 128 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -26915) - 1) * 2);
						Class561.method6631(class73, class167, i, i_14_, i_35_, i_36_, (Class409.aClass161Array4784[Class192.aBool2307 ? 1 : 0]), -865093257);
					}
					if (!Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.visible)
						class106.method1720((i + 669238293 * class73.anInt764 / 2 - 1), (class73.anInt765 * 1360982075 / 2 + i_14_ - 1), 3, 3, -1, (byte) -80);
				}
				class106.method2004(Class192.anIntArray2305[0], Class192.anIntArray2305[1], Class192.anIntArray2305[2], Class192.anIntArray2305[3]);
			} else if (class167 != null)
				class106.method2029(-16777216, class167, i, i_14_);
		}
	}
}
