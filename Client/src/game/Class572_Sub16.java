package game;

/* Class572_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class572_Sub16 extends Class572 {
	Class572_Sub16() {
		/* empty */
	}

	abstract void method8559(Class334 class334);

	abstract void method8560(Class334 class334, byte i);

	abstract void method8561(RSByteBuffer class572_sub15);

	abstract void method8562(RSByteBuffer class572_sub15);

	abstract void method8563(RSByteBuffer class572_sub15);

	abstract void method8564(Class334 class334);

	abstract void method8565(RSByteBuffer class572_sub15, int i);

	abstract void method8566(Class334 class334);

	static final void method8567(Class106 class106, MapSize mapSize, int i) {
		if (100 != Class547_Sub1.anInt8987 * 448209883 && Class547_Sub1.aClass572_Sub12_Sub5_6129 != null) {
			Class69.method1067(-2087023535);
			Class69.method1067(-2088131621);
			if (448209883 * Class547_Sub1.anInt8987 < 10) {
				for (int i_0_ = 0; i_0_ < Class547_Sub1.aClass102ArrayArray8988.length; i_0_++) {
					for (int i_1_ = 0; i_1_ < (Class547_Sub1.aClass102ArrayArray8988[i_0_]).length; i_1_++) {
						Class582.aClass248_7725.method3383((Class547_Sub1.aClass482_6181.anIntArrayArray5363[i_0_][i_1_]), -1196110530);
						Class88.aClass248_1226.method3383((Class547_Sub1.aClass482_6181.anIntArrayArray5363[i_0_][i_1_]), 110563989);
					}
				}
				if (!Class547_Sub1.idx41.method3387(Class547_Sub1.aClass572_Sub12_Sub5_6129.mapName, (byte) 1)) {
					Class547_Sub1.anInt8987 = (Class623.idx41.method3386((Class547_Sub1.aClass572_Sub12_Sub5_6129.mapName), (byte) -36)) / 10 * -2119425965;
					return;
				}
				Class547_Sub1.anInt8987 = 280576830;
			}
			if (10 == 448209883 * Class547_Sub1.anInt8987) {
				Class547_Sub1.anInt6143 = (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11326 * 1186523151) >> 6 << 6;
				Class547_Sub1.anInt6165 = -1560625877 * (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11328) >> 6 << 6;
				Class547_Sub1.anInt6145 = 64 + (((Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11327) * 949322831 >> 6 << 6) - Class547_Sub1.anInt6143);
				Class547_Sub1.anInt6151 = 64 + (((Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11329) * -1909732425 >> 6 << 6) - Class547_Sub1.anInt6165);
				int[] is = new int[3];
				int i_2_ = -1;
				int i_3_ = -1;
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class497 class497 = client.aClass613_8605.method7280((byte) -1);
				if (Class547_Sub1.aClass572_Sub12_Sub5_6129.method10290(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009, (((int) class240.aFloat2653 >> 9) + -2109597897 * class497.localX), (((int) class240.aFloat2657 >> 9) + 417324155 * class497.localY), is, (byte) 1)) {
					i_2_ = is[1] - Class547_Sub1.anInt6143;
					i_3_ = is[2] - Class547_Sub1.anInt6165;
				}
				if (!Class547_Sub1.aBool8975 && i_2_ >= 0 && i_2_ < Class547_Sub1.anInt6145 && i_3_ >= 0 && i_3_ < Class547_Sub1.anInt6151) {
					i_2_ += (int) (Math.random() * 10.0) - 5;
					i_3_ += (int) (Math.random() * 10.0) - 5;
					Class185.anInt2172 = 106919739 * i_2_;
					Class386.anInt4642 = i_3_ * 1527379917;
				} else if (2085738305 * Class547_Sub1.anInt8985 != -1 && -1 != Class547_Sub1.anInt8986 * 1296167037) {
					Class547_Sub1.aClass572_Sub12_Sub5_6129.method10289(2085738305 * Class547_Sub1.anInt8985, Class547_Sub1.anInt8986 * 1296167037, is, (byte) -7);
					if (is != null) {
						Class185.anInt2172 = (is[1] - Class547_Sub1.anInt6143) * 106919739;
						Class386.anInt4642 = (is[2] - Class547_Sub1.anInt6165) * 1527379917;
					}
					Class547_Sub1.anInt8986 = -1145768149;
					Class547_Sub1.anInt8985 = 199837503;
					Class547_Sub1.aBool8975 = false;
				} else {
					Class547_Sub1.aClass572_Sub12_Sub5_6129.method10289(323852201 * (Class547_Sub1.aClass572_Sub12_Sub5_6129.location) >> 14 & 0x3fff, 323852201 * (Class547_Sub1.aClass572_Sub12_Sub5_6129.location) & 0x3fff, is, (byte) -63);
					Class185.anInt2172 = 106919739 * (is[1] - Class547_Sub1.anInt6143);
					Class386.anInt4642 = (is[2] - Class547_Sub1.anInt6165) * 1527379917;
				}
				if ((2132255543 * Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) == 25) {
					Class547_Sub1.aFloat6139 = 2.0F;
					Class547_Sub1.aFloat6128 = 2.0F;
				} else if (37 == (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) * 2132255543) {
					Class547_Sub1.aFloat6139 = 3.0F;
					Class547_Sub1.aFloat6128 = 3.0F;
				} else if (50 == (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) * 2132255543) {
					Class547_Sub1.aFloat6139 = 4.0F;
					Class547_Sub1.aFloat6128 = 4.0F;
				} else if (2132255543 * (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) == 75) {
					Class547_Sub1.aFloat6139 = 6.0F;
					Class547_Sub1.aFloat6128 = 6.0F;
				} else if (100 == (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) * 2132255543) {
					Class547_Sub1.aFloat6139 = 8.0F;
					Class547_Sub1.aFloat6128 = 8.0F;
				} else if (2132255543 * (Class547_Sub1.aClass572_Sub12_Sub5_6129.anInt11321) == 200) {
					Class547_Sub1.aFloat6139 = 16.0F;
					Class547_Sub1.aFloat6128 = 16.0F;
				} else {
					Class547_Sub1.aFloat6139 = 8.0F;
					Class547_Sub1.aFloat6128 = 8.0F;
				}
				Class547_Sub1.anInt6136 = (int) Class547_Sub1.aFloat6128 >> 1;
				Class547_Sub1.aByteArrayArrayArray6166 = Class91.method1518(Class547_Sub1.anInt6136, 1971275999);
				Class280.method3794(-1858743085);
				Class547_Sub1.method6458();
				Class502.aClass675_5557 = new Class675();
				Class547_Sub1.anInt6134 += (int) (Math.random() * 5.0) - 2;
				if (Class547_Sub1.anInt6134 < -8)
					Class547_Sub1.anInt6134 = -8;
				if (Class547_Sub1.anInt6134 > 8)
					Class547_Sub1.anInt6134 = 8;
				Class547_Sub1.anInt6126 += (int) (Math.random() * 5.0) - 2;
				if (Class547_Sub1.anInt6126 < -16)
					Class547_Sub1.anInt6126 = -16;
				if (Class547_Sub1.anInt6126 > 16)
					Class547_Sub1.anInt6126 = 16;
				Class547_Sub1.method6462(mapSize, Class547_Sub1.anInt6134 >> 2 << 10, Class547_Sub1.anInt6126 >> 1);
				Class547_Sub1.aClass639_Sub12_6173.method8945(1024, 256, 864631);
				Class547_Sub1.aClass639_Sub1_6155.method8891(256, 256, (short) 12935);
				Class547_Sub1.aClass639_Sub16_6123.method7569(4096, -1177217427);
				Class40_Sub1.aClass639_Sub19_9950.method7569(256, -1789015173);
				Class547_Sub1.anInt8987 = 561153660;
			} else if (Class547_Sub1.anInt8987 * 448209883 == 20) {
				if (Class547_Sub1.aBool6178) {
					if (Class547_Sub1.method6494(class106, Class547_Sub1.anInt6134, Class547_Sub1.anInt6126, Class547_Sub1.aBool6178))
						Class547_Sub1.anInt8987 = 1683460980;
				} else {
					Class378.method4626(true, -1001018997);
					Class547_Sub1.method6494(class106, Class547_Sub1.anInt6134, Class547_Sub1.anInt6126, Class547_Sub1.aBool6178);
					Class547_Sub1.anInt8987 = 1683460980;
					Class378.method4626(true, -1001018997);
					Class565.method6697(-1597232010);
				}
			} else if (448209883 * Class547_Sub1.anInt8987 == 60) {
				if (Class547_Sub1.idx41.method3381(Class547_Sub1.aClass572_Sub12_Sub5_6129.mapName, 1862411681)) {
					if (!Class547_Sub1.idx41.method3387(Class547_Sub1.aClass572_Sub12_Sub5_6129.mapName, (byte) -92))
						return;
					Class547_Sub1.aClass548_6141 = Class13.method616(Class547_Sub1.idx41, (Class547_Sub1.aClass572_Sub12_Sub5_6129.mapName), client.aBool8731, (byte) -109);
				} else
					Class547_Sub1.aClass548_6141 = new Class548(0);
				Class547_Sub1.method6467();
				Class547_Sub1.anInt8987 = 1964037810;
				Class378.method4626(true, -1001018997);
				Class565.method6697(-1555371067);
			} else if (448209883 * Class547_Sub1.anInt8987 >= 70) {
				for (int i_4_ = 0; i_4_ < 3; i_4_++) {
					for (int i_5_ = 0; i_5_ < 5; i_5_++) {
						if ((Class547_Sub1.aClass102ArrayArray8988[i_4_][i_5_] == null) || (Class547_Sub1.aClass284ArrayArray8992[i_4_][i_5_]) == null) {
							Class547_Sub1.aClass102ArrayArray8988[i_4_][i_5_] = ((Class102) (Class133_Sub20.aClass324_10261.method4129(client.anInterface19_8776, (Class547_Sub1.aClass482_6181.anIntArrayArray5363[i_4_][i_5_]), true, true, 878143997)));
							Class547_Sub1.aClass284ArrayArray8992[i_4_][i_5_] = Class542.method6435(Class88.aClass248_1226, (Class547_Sub1.aClass482_6181.anIntArrayArray5363[i_4_][i_5_]), (byte) 7);
							if ((Class547_Sub1.aClass102ArrayArray8988[i_4_][i_5_]) != null && (Class547_Sub1.aClass284ArrayArray8992[i_4_][i_5_]) != null)
								Class547_Sub1.anInt8987 += -2063310599;
							else
								return;
						}
					}
				}
				Class547_Sub1.anInt8987 = -1489198996;
				System.gc();
			}
		}
	}

	public static int method8568(int i) {
		Class520.aTwitchEventLiveStreams5810 = null;
		int i_6_ = Class572_Sub2.aTwitchTV8969.RequestLiveStreams(client.aClass437_8705.aString5075);
		return i_6_;
	}
}
