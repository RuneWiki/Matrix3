package game;

/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class428 {
	static int anInt5009;
	static Class398[] aClass398Array5010;
	static int anInt5011;
	static Class248 aClass248_5012;
	static int anInt5013;
	static int anInt5014;
	static Thread aThread5015;
	static String aString5016;
	static Class398 aClass398_5017;
	static int[] anIntArray5018 = { 6, 4, 1, 2, 0, 4, 0, 50, 2, 2, 2, 0, 2, 1, 5, 0, 2, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0 };
	static boolean aBool5019;
	static final String aString5020 = " - ";
	public static Class304 aClass304_5021;
	static int anInt5022;

	public static int method5194() {
		return 1404664833 * anInt5013;
	}

	static {
		if (Class64.aBool676) {
			anIntArray5018[0] += anIntArray5018[14];
			anIntArray5018[14] = 0;
			anIntArray5018[0] += anIntArray5018[40];
			anIntArray5018[40] = 0;
		}
		anInt5009 = -1794372189;
		aBool5019 = false;
		anInt5014 = -510896455;
	}

	public static void method5195() {
		aBool5019 = true;
		Class255_Sub1.aString8948 = Class13.aString70;
		Class320.aString3893 = Class13.aString103;
		Class439.method5276(false, (byte) 8);
		Class67.method1054((byte) -20);
		aClass398Array5010 = null;
		Class41.aClass259_425 = null;
		Class463.method5478(16, 1551749716);
	}

	public static boolean method5196() {
		return aBool5019;
	}

	static int method5197() {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(-1394497809) == 0) {
			for (int i = 0; i < client.anInt8730 * -1971020205; i++) {
				if ((client.anInterface64Array8607[i].method381((byte) 15) == 's') || (client.anInterface64Array8607[i].method381((byte) 35) == 'S')) {
					Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 1, 753142351);
					client.aBool8569 = true;
					Class300.method3993(Class257.aClass257_2775, 1740853432);
					break;
				}
			}
		}
		if (aClass398_5017 == Class398.aClass398_4714) {
			if (Class41.aClass259_425 == null)
				Class41.aClass259_425 = new Class259(Class51.aClass278_491, Class72.aClass617_721, Class540.aClass267_6063, Class18.GRAB_SERVER_PUBLIC_EXPONENT, Class18.GRAB_SERVER_MODULUS);
			if (!Class41.aClass259_425.method3546((short) 9396))
				return 0;
			Class498.method5943(0, null, true, 743564084);
			Class542.aBool6098 = !Class375_Sub3.method8877(-528877283);
			Class616.aClass248_8046 = Class134_Sub1.method9975((Class542.aBool6098 ? Class648.aClass648_8356 : Class648.aClass648_8361), false, 1, true, true, 796576743);
			aClass248_5012 = Class134_Sub1.method9975(Class648.aClass648_8355, false, 1, true, true, 796576743);
			Class88.aClass248_1226 = Class134_Sub1.method9975(Class648.aClass648_8336, false, 1, true, true, 796576743);
		}
		if (aClass398_5017 == Class398.aClass398_4693) {
			boolean bool = aClass248_5012.method3371(-1930449530);
			int i = Class303.aClass224_Sub1Array3536[Class648.aClass648_8355.method7662((byte) 106)].method8829((byte) 1);
			i = i + Class303.aClass224_Sub1Array3536[(Class542.aBool6098 ? Class648.aClass648_8356.method7662((byte) 67) : Class648.aClass648_8361.method7662((byte) 124))].method8829((byte) 1);
			i += Class303.aClass224_Sub1Array3536[Class648.aClass648_8336.method7662((byte) 56)].method8829((byte) 1);
			i = i + (bool ? 100 : aClass248_5012.method3372(2010621840));
			if (400 != i)
				return i / 4;
			anInt5013 = Class616.aClass248_8046.method3364(-819361519) * 1616282625;
			anInt5011 = aClass248_5012.method3364(229434991) * 492880209;
			Class423_Sub3.method9324(Class616.aClass248_8046, -1604578182);
			int i_0_ = Class213.aClass572_Sub24_2463.aClass665_Sub3_9239.method8122(813082874);
			Class451.aClass218_5170 = new Class218(client.aClass437_8705, Class594.aClass435_7823, aClass248_5012);
			Class210[] class210s = Class451.aClass218_5170.method3088(i_0_, (byte) -93);
			if (0 == class210s.length)
				class210s = Class451.aClass218_5170.method3088(0, (byte) -43);
			Class347 class347 = new Class347(Class616.aClass248_8046, Class88.aClass248_1226);
			if (class210s.length > 0) {
				Class111.anInterface49Array1427 = new Interface49[class210s.length];
				for (int i_1_ = 0; i_1_ < Class111.anInterface49Array1427.length; i_1_++)
					Class111.anInterface49Array1427[i_1_] = new Class396((Class451.aClass218_5170.method3090((class210s[i_1_].anInt2439 * -1839829901), (byte) -68)), class210s[i_1_].anInt2438 * -1424992625, 1363386823 * class210s[i_1_].anInt2437, class347);
			}
		}
		if (Class398.aClass398_4694 == aClass398_5017)
			Class133_Sub20.aClass324_10261 = new Class324(Class616.aClass248_8046, Class88.aClass248_1226, Class47.method839(186511728));
		if (aClass398_5017 == Class398.aClass398_4695) {
			int i = Class133_Sub20.aClass324_10261.method4137(212193406);
			int i_2_ = Class133_Sub20.aClass324_10261.method4128((byte) 4);
			if (i < i_2_)
				return i * 100 / i_2_;
		}
		if (Class398.aClass398_4696 == aClass398_5017) {
			if (null != Class111.anInterface49Array1427 && Class111.anInterface49Array1427.length > 0) {
				if (Class111.anInterface49Array1427[0].method293((byte) 1) < 100)
					return 0;
				if (Class111.anInterface49Array1427.length > 1 && Class451.aClass218_5170.method3089(726051780) && (Class111.anInterface49Array1427[1].method293((byte) 1) < 100))
					return 0;
			}
			Class133_Sub20.aClass324_10261.method4126(client.anInterface19_8776, (byte) -73);
			Class425.method5178(Class272_Sub2.aClass106_9517, (byte) -13);
			Class463.method5478(17, 630032732);
		}
		if (aClass398_5017 == Class398.aClass398_4697) {
			Class582.aClass248_7725 = Class134_Sub1.method9975(Class648.aClass648_8332, false, 1, false, true, 796576743);
			Class243.aClass248_2668 = Class134_Sub1.method9975(Class648.aClass648_8344, false, 1, false, true, 796576743);
			Class296.aClass248_3466 = Class134_Sub1.method9975(Class648.aClass648_8335, false, 1, false, true, 796576743);
			Class498.aClass248_5511 = Class134_Sub1.method9975(Class648.aClass648_8328, false, 1, true, true, 796576743);
			Class133_Sub14.aClass248_9948 = Class134_Sub1.method9975(Class648.aClass648_8329, false, 1, true, true, 796576743);
			Class630.aClass248_8114 = Class134_Sub1.method9975(Class648.aClass648_8331, true, 1, false, true, 796576743);
			Class489.aClass248_5463 = Class134_Sub1.method9975(Class648.aClass648_8330, false, 1, false, true, 796576743);
			Class479_Sub1.aClass248_8936 = Class134_Sub1.method9975(Class648.aClass648_8345, true, 1, false, true, 796576743);
			Class392.aClass248_4663 = Class134_Sub1.method9975(Class648.aClass648_8348, true, 1, false, true, 796576743);
			Class44.aClass248_444 = Class134_Sub1.method9975(Class648.aClass648_8346, false, 1, false, true, 796576743);
			Class438.aClass248_5080 = Class134_Sub1.method9975(Class648.aClass648_8347, false, 1, true, true, 796576743);
			if (!Class64.aBool676) {
				Class510.idx14 = Class134_Sub1.method9975(Class648.idx14Reference, true, 1, false, false, 796576743);
				Class435.idx40 = Class134_Sub1.method9975(Class648.idx40Reference, true, 1, false, false, 796576743);
			}
			Class131.aClass248_1539 = Class134_Sub1.method9975(Class648.aClass648_8338, false, 1, true, true, 796576743);
			Class63.idx17Reference = Class134_Sub1.method9975(Class648.idx17Reference, false, 1, true, true, 796576743);
			Class413.aClass248_4917 = Class134_Sub1.method9975(Class648.aClass648_8340, false, 1, true, true, 796576743);
			GraphicsDefinition.aClass248_8442 = Class134_Sub1.method9975(Class648.aClass648_8341, false, 1, true, true, 796576743);
			Class281.aClass248_3220 = Class134_Sub1.method9975(Class648.aClass648_8364, false, 1, true, true, 796576743);
			Class665_Sub26.aClass248_9612 = Class134_Sub1.method9975(Class648.aClass648_8343, false, 1, true, true, 796576743);
			Class449.aClass248_5169 = Class134_Sub1.method9975(Class648.aClass648_8349, false, 1, true, true, 796576743);
			Class549.idx23 = Class134_Sub1.method9975(Class648.idx23reference, true, 1, false, true, 796576743);
			Class623.idx41 = Class134_Sub1.method9975(Class648.idx41reference, true, 1, false, true, 796576743);
			Class282.aClass248_3224 = Class134_Sub1.method9975(Class648.aClass648_8334, false, 1, true, true, 796576743);
			Class317.aClass248_3872 = Class134_Sub1.method9975(Class648.aClass648_8333, false, 1, true, true, 796576743);
			Class375_Sub3.aClass248_9520 = Class134_Sub1.method9975(Class648.aClass648_8342, true, 1, true, true, 796576743);
			NPCDefintion.aClass248_4860 = Class134_Sub1.method9975(Class648.aClass648_8354, false, 1, true, true, 796576743);
			RSSocket.aClass248_8295 = Class134_Sub1.method9975(Class648.aClass648_8350, true, 1, true, true, 796576743);
			Class76.aClass248_946 = Class134_Sub1.method9975(Class648.aClass648_8351, false, 1, true, true, 796576743);
			Class392.aClass248_4664 = Class134_Sub1.method9975(Class648.aClass648_8357, true, 1, false, true, 796576743);
			HashTable.aClass248_5256 = Class134_Sub1.method9975(Class648.aClass648_8352, true, 1, false, true, 796576743);
			Class423_Sub2.aClass248_9761 = Class134_Sub1.method9975(Class648.aClass648_8353, true, 1, true, true, 796576743);
		}
		if (Class398.aClass398_4698 == aClass398_5017) {
			int i = 0;
			for (int i_3_ = 0; i_3_ < Class303.aClass224_Sub1Array3536.length; i_3_++) {
				if (null != Class303.aClass224_Sub1Array3536[i_3_])
					i += (Class303.aClass224_Sub1Array3536[i_3_].method8829((byte) 1) * anIntArray5018[i_3_] / 100);
			}
			if (i != 100) {
				if (anInt5014 * -1559678857 < 0)
					anInt5014 = i * 510896455;
				return ((i - -1559678857 * anInt5014) * 100 / (100 - anInt5014 * -1559678857));
			}
			Class133_Sub1.method9335(Class582.aClass248_7725, (byte) 0);
			Class133_Sub20.aClass324_10261 = new Class324(Class582.aClass248_7725, Class88.aClass248_1226, Class47.method839(257969673));
		}
		if (aClass398_5017 == Class398.aClass398_4699) {
			byte[] is = RSSocket.aClass248_8295.method3373((960259487 * (Class471.aClass471_5280.anInt5290)), (byte) -37);
			if (is == null)
				return 0;
			Class344.audio = new Class54();
			if (!Class64.aBool676)
				Class344.audio.method923(50, 7340032, -1876599689);
			Class267.method3650(is, 1142841559);
			Class463.method5478(8, 555178971);
		}
		if (Class398.aClass398_4709 == aClass398_5017 && Class297.aClass567_3477 == null) {
			Class297.aClass567_3477 = new Class567(HashTable.aClass248_5256);
			Class195.method2952(Class297.aClass567_3477, -1453150227);
		}
		if (aClass398_5017 == Class398.aClass398_4716) {
			int i = Class569.method6759(1753922520);
			if (i < 100)
				return i;
			Class165.method2668(RSSocket.aClass248_8295.method3373((Class471.aClass471_5283.anInt5290) * 960259487, (byte) 33), -211596715);
			JS5ConfigGroup.aClass484_2593 = new Class484(RSSocket.aClass248_8295);
			Class639_Sub19.aShortArrayArray9570 = JS5ConfigGroup.aClass484_2593.aShortArrayArray5407;
			Class47.aShortArrayArrayArray471 = JS5ConfigGroup.aClass484_2593.aShortArrayArrayArray5408;
			if (JS5ConfigGroup.aClass484_2593.anInt5413 * -909903671 != -1 && JS5ConfigGroup.aClass484_2593.anInt5414 * 503945147 != -1) {
				client.anInt8724 = JS5ConfigGroup.aClass484_2593.anInt5413 * -504672313;
				client.anInt8725 = JS5ConfigGroup.aClass484_2593.anInt5414 * -341249453;
			}
			Class93.aClass504_1247 = new Class504(RSSocket.aClass248_8295);
			Class193.aClass487_2323 = new Class487(RSSocket.aClass248_8295);
			Class586.aClass502_7779 = new Class502(RSSocket.aClass248_8295);
			Class102_Sub2.aClass494_10268 = new Class494(RSSocket.aClass248_8295);
			Class547.aClass482_6181 = new Class482(RSSocket.aClass248_8295);
		}
		if (Class398.aClass398_4702 == aClass398_5017) {
			if (-839505981 * JS5ConfigGroup.aClass484_2593.anInt5400 != -1 && !Class489.aClass248_5463.method3369((-839505981 * (JS5ConfigGroup.aClass484_2593.anInt5400)), 0, (byte) -61))
				return 99;
			Class456_Sub1_Sub3_Sub2.aClass94_11589 = new MapSize(Class375_Sub3.aClass248_9520);
			Class274.anInterface5_2910 = new Class97_Sub1(Class479_Sub1.aClass248_8936, Class392.aClass248_4663);
			Class273.aClass639_Sub3_2901 = new Class639_Sub3(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class197.aClass639_Sub11_2359 = new Class639_Sub11(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class653.aClass639_Sub9_8398 = new Class639_Sub9(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class582.aClass248_7725);
			Class81.aClass639_Sub8_1078 = new Class639_Sub8(client.aClass437_8705, Class594.aClass435_7823, Class63.idx17Reference);
			Class131.aClass639_Sub2_1540 = new Class639_Sub2(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class314.aClass639_Sub6_3814 = new Class639_Sub6(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class319.aClass639_Sub17_3889 = new Class639_Sub17(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class582.aClass248_7725);
			Class506.aClass639_Sub21_5598 = new Class639_Sub21(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class582.aClass248_7725);
			Class664.aClass639_Sub22_8490 = new Class639_Sub22(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class489.aClass248_5463);
			Class639_Sub10.aClass639_Sub4_9534 = new Class639_Sub4(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class565.aClass639_Sub7_6360 = new Class639_Sub7(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class289.aClass639_Sub16_3426 = new Class639_Sub16(client.aClass437_8705, Class594.aClass435_7823, true, Class131.aClass248_1539, Class489.aClass248_5463);
			client.aClass613_8605.method7294(Class289.aClass639_Sub16_3426, (byte) 70);
			Class204.aClass602_2411.method7075(new Class639_Sub16(client.aClass437_8705, Class594.aClass435_7823, true, Class131.aClass248_1539, Class489.aClass248_5463), (byte) -64);
			Class323.aClass639_Sub12_4081 = new Class639_Sub12(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class582.aClass248_7725);
			Class560.aClass639_Sub1_6348 = new Class639_Sub1(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class582.aClass248_7725);
			Class197.aClass639_Sub15_2360 = new Class639_Sub15(client.aClass437_8705, Class594.aClass435_7823, true, Class413.aClass248_4917, Class489.aClass248_5463);
			Class672.aClass639_Sub5_8533 = new Class639_Sub5(client.aClass437_8705, Class594.aClass435_7823, true, Class273.aClass639_Sub3_2901, GraphicsDefinition.aClass248_8442, Class489.aClass248_5463);
			Class300.aClass635_Sub2_3488 = new Class635_Sub2(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, true);
			Class195.aClass639_Sub14_2347 = new Class639_Sub14(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class26.aClass639_Sub18_217 = new Class639_Sub18(client.aClass437_8705, Class594.aClass435_7823, Class281.aClass248_3220, Class243.aClass248_2668, Class296.aClass248_3466, Class195.aClass639_Sub14_2347);
			Class629.aClass639_Sub20_8111 = new Class639_Sub20(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class300.aClass639_Sub13_3489 = new Class639_Sub13(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511);
			Class667.aClass639_Sub10_8509 = new Class639_Sub10(client.aClass437_8705, Class594.aClass435_7823, Class665_Sub26.aClass248_9612, Class489.aClass248_5463);
			Class531.aClass635_Sub1_5932 = new Class635_Sub1(client.aClass437_8705, Class594.aClass435_7823, Class449.aClass248_5169, true);
			Class389.aClass202_Sub1_Sub2_4652 = new Class202_Sub1_Sub2(client.aClass437_8705, VarDomainType.CLIENT_CONFIGS, Class594.aClass435_7823, Class498.aClass248_5511);
			Class472.aClass202_Sub1_Sub1_5310 = new Class202_Sub1_Sub1(client.aClass437_8705, VarDomainType.PLAYER_CONFIGS, Class594.aClass435_7823, Class498.aClass248_5511);
			Class624.aClass202_Sub1_Sub2_8080 = new Class202_Sub1_Sub2(client.aClass437_8705, VarDomainType.NPC_CONFIGS, Class594.aClass435_7823, Class498.aClass248_5511);
			Class92.aClass202_Sub1_Sub2_1240 = new Class202_Sub1_Sub2(client.aClass437_8705, VarDomainType.CLAN_CONFIGS, Class594.aClass435_7823, Class498.aClass248_5511);
			Class544.aClass202_Sub1_Sub2_6109 = new Class202_Sub1_Sub2(client.aClass437_8705, VarDomainType.CLAN_SETTING_CONFIGS, Class594.aClass435_7823, Class498.aClass248_5511);
			Class232.aClass202_Sub1_Sub2_2632 = new Class202_Sub1_Sub2(client.aClass437_8705, VarDomainType.aClass272_2884, Class594.aClass435_7823, Class498.aClass248_5511);
			Class196.aMap2354 = Class256.method3536((new Class202_Sub1[] { Class389.aClass202_Sub1_Sub2_4652, Class472.aClass202_Sub1_Sub1_5310, Class624.aClass202_Sub1_Sub2_8080,
				Class92.aClass202_Sub1_Sub2_1240, Class544.aClass202_Sub1_Sub2_6109, Class232.aClass202_Sub1_Sub2_2632 }), (byte) 0);
			Class40_Sub1.aClass639_Sub19_9950 = new Class639_Sub19(client.aClass437_8705, Class594.aClass435_7823, Class498.aClass248_5511, Class196.aMap2354);
			Class185.anInterface15_2171 = new Class397();
			Class317.method4084(Class133_Sub14.aClass248_9948, Class489.aClass248_5463, Class582.aClass248_7725, Class88.aClass248_1226, -1943867791);
			Class583.aClass318_7731 = new Class318(Class76.aClass248_946);
			aClass304_5021 = new Class304(NPCDefintion.aClass248_4860);
			Class224_Sub1.aClass307_9491 = new Class307(NPCDefintion.aClass248_4860);
			Class100.aClass616_1298 = new Class616(Class594.aClass435_7823, Class282.aClass248_3224, Class317.aClass248_3872);
			Class111.aClass244_1428 = new Class244(Class594.aClass435_7823, Class282.aClass248_3224, Class317.aClass248_3872, new Class317());
			Class133_Sub23.playerVarsProvider = new Class197(Class472.aClass202_Sub1_Sub1_5310, Class40_Sub1.aClass639_Sub19_9950, Class193.aClass487_2323.method5791((byte) 0));
			Exception_Sub2.method10186(-521379572);
			Class19.method691(Class26.aClass639_Sub18_217, 16711935);
			Class521.method6216(Class224_Sub1.aClass307_9491, aClass304_5021, (byte) 23);
			Class315.method4080(Class489.aClass248_5463, Class456_Sub1_Sub3_Sub2.aClass94_11589, Class274.anInterface5_2910, (byte) -46);
			Class387 class387 = new Class387(Class44.aClass248_444.method3384("huffman", "", 92974218));
			VarDefinition.method2781(class387, -1083535038);
			Class380.aClass570_4594 = Class134_Sub1.method9972((byte) -64);
			Class272_Sub1.aClass572_Sub5_9450 = new Class572_Sub5(true);
		}
		if (aClass398_5017 == Class398.aClass398_4703) {
			int i = (Class109.method2069(Class582.aClass248_7725, -1849662338) + Class133_Sub20.aClass324_10261.method4127(true, -2077051792));
			int i_4_ = (Class109.method2067(1369304407) + Class133_Sub20.aClass324_10261.method4128((byte) 62));
			if (i < i_4_)
				return i * 100 / i_4_;
		}
		if (Class398.aClass398_4701 == aClass398_5017)
			Class547.method6503(Class549.idx23, Class623.idx41, Class131.aClass639_Sub2_1540, Class314.aClass639_Sub6_3814, client.aClass613_8605.method7288(-996146168), Class323.aClass639_Sub12_4081, Class560.aClass639_Sub1_6348, Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider);
		if (Class398.aClass398_4705 == aClass398_5017) {
			Class306.clientConfigsDomain = new Class134_Sub1(Class389.aClass202_Sub1_Sub2_4652);
			Class102.method1632((short) 7801);
			try {
				Class494.aClass8_5490 = Class421.method5140(-588344427);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Class630.aClass248_8114.method3379(false, true, (byte) 0);
			Class582.aClass248_7725.method3379(true, true, (byte) 0);
			Class88.aClass248_1226.method3379(true, true, (byte) 0);
			Class44.aClass248_444.method3379(true, true, (byte) 0);
			client.aBool8867 = true;
		}
		if (aClass398_5017 == Class398.aClass398_4710 && JS5ConfigGroup.aClass484_2593.anInt5404 * -1114159579 != -1) {
			if (!Class569.method6760((JS5ConfigGroup.aClass484_2593.anInt5404 * -1114159579), null, -325293160))
				return 0;
			boolean bool = true;
			for (int i = 0; i < (Class534.aClass83Array5975[JS5ConfigGroup.aClass484_2593.anInt5404 * -1114159579].aClass73Array1081).length; i++) {
				InterfaceDefinitions class73 = (Class534.aClass83Array5975[-1114159579 * JS5ConfigGroup.aClass484_2593.anInt5404].aClass73Array1081[i]);
				if (5 == -1285279191 * class73.anInt752 && -1 != 1554484939 * class73.anInt783 && !Class582.aClass248_7725.method3369((1554484939 * (class73.anInt783)), 0, (byte) -36))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class398.aClass398_4707 == aClass398_5017)
			Class536.method6382(true, 2128983362);
		if (Class398.aClass398_4708 == aClass398_5017) {
			BaseVarType.aClass412_7963.method5053(1670410434);
			try {
				aThread5015.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			BaseVarType.aClass412_7963 = null;
			aThread5015 = null;
			Class616.aClass248_8046 = null;
			aClass248_5012 = null;
			Class451.aClass218_5170 = null;
			Class111.anInterface49Array1427 = null;
			Class394.method4742((byte) 79);
			client.aBool8568 = Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(-1659895434) == 1;
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 1, 576298227);
			if (client.aBool8568)
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub30_9231, 0, 743148917);
			else if ((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231.aBool9616) && (-1590322869 * Class272_Sub1.aClass572_Sub5_9450.anInt9048) < 512 && (-1590322869 * Class272_Sub1.aClass572_Sub5_9450.anInt9048) != 0)
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub30_9231, 0, 1990578153);
			Class623.method7443(-1266467238);
			if (client.aBool8568) {
				BaseVarType.method7260(0, false, 1517714197);
				if (!client.aBool8569)
					Class300.method3993(Class257.aClass257_2773, 1428900957);
			} else {
				BaseVarType.method7260(Class213.aClass572_Sub24_2463.aClass665_Sub30_9231.method9129(2101264261), false, 1432395574);
				if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9231.method9129(1987474130) == 0)
					Class300.method3993(Class257.aClass257_2768, 2140973852);
			}
			Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(103829037), -1, -1, false, 623786968);
			Class133_Sub20.aClass324_10261.method4126(client.anInterface19_8776, (byte) -45);
			Class425.method5178(Class272_Sub2.aClass106_9517, (byte) 63);
			Class640.method7589(Class272_Sub2.aClass106_9517, Class582.aClass248_7725, 1190435876);
			Class272_Sub3.method8879(Class14.aClass161Array123, 1699225930);
		}
		return Class119.method2164((byte) 63);
	}

	public static void method5198() {
		if (null == aClass398Array5010) {
			aClass398Array5010 = Class398.method4764(221608438);
			aClass398_5017 = aClass398Array5010[0];
			Class92.aLong1239 = Class69.method1067(-1989505935) * -1475677550559237569L;
		}
		if (null == BaseVarType.aClass412_7963)
			Class359.method4440(248059406);
		Class398 class398 = aClass398_5017;
		int i = Class192.method2911(-482882261);
		if (class398 == aClass398_5017) {
			aString5016 = ((Class398) aClass398_5017).aClass279_4711.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = aString5016;
			if (((Class398) aClass398_5017).aBool4704)
				Class339.anInt4325 = ((((1843902247 * ((Class398) aClass398_5017).anInt4700 - ((Class398) aClass398_5017).anInt4713 * 1380520845) * i / 100) + 1380520845 * ((Class398) aClass398_5017).anInt4713) * 605492609);
			if (((Class398) aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(" - ").append(Class339.anInt4325 * -1202247039).append("%").toString();
		} else if (Class398.aClass398_4715 == aClass398_5017) {
			BaseVarType.aClass412_7963 = null;
			Class463.method5478(12, -873032885);
			if (aBool5019) {
				aBool5019 = false;
				Class257.method3541(Class255_Sub1.aString8948, Class320.aString3893, "", false, 1426158620);
			}
		} else {
			aString5016 = ((Class398) class398).aClass279_4712.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = aString5016;
			if (((Class398) aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(1843902247 * ((Class398) class398).anInt4700).append("%").toString();
			Class339.anInt4325 = ((Class398) class398).anInt4700 * 1414167975;
			if (((Class398) aClass398_5017).aBool4704 || ((Class398) class398).aBool4704)
				Class92.aLong1239 = Class69.method1067(-1777103330) * -1475677550559237569L;
		}
		if (BaseVarType.aClass412_7963 != null) {
			BaseVarType.aClass412_7963.method5051(Class92.aLong1239 * -2635844501324888641L, aString5016, Class121.aString1479, -1202247039 * Class339.anInt4325, aClass398_5017, -1671318049);
			if (null != Class111.anInterface49Array1427) {
				for (int i_5_ = 1 + -1545178635 * anInt5009; i_5_ < Class111.anInterface49Array1427.length; i_5_++) {
					if (Class111.anInterface49Array1427[i_5_].method293((byte) 1) >= 100 && i_5_ - 1 == -1545178635 * anInt5009 && 16 != 835742603 * client.anInt8580 && BaseVarType.aClass412_7963.method5049(128005645)) {
						try {
							Class111.anInterface49Array1427[i_5_].method22((byte) 49);
						} catch (Exception exception) {
							Class111.anInterface49Array1427 = null;
							break;
						}
						BaseVarType.aClass412_7963.method5068(Class111.anInterface49Array1427[i_5_], 581160742);
						anInt5009 += 1794372189;
						if ((anInt5009 * -1545178635 >= Class111.anInterface49Array1427.length - 1) && Class111.anInterface49Array1427.length > 1)
							anInt5009 = (Class451.aClass218_5170.method3089(726051780) ? 0 : -1) * 1794372189;
					}
				}
			}
		}
	}

	public static void method5199() {
		if (null != Class111.anInterface49Array1427) {
			Interface49[] interface49s = Class111.anInterface49Array1427;
			for (int i = 0; i < interface49s.length; i++) {
				Interface49 interface49 = interface49s[i];
				interface49.method22((byte) 44);
			}
		}
	}

	public static void method5200(boolean bool) {
		if (BaseVarType.aClass412_7963 == null)
			Class359.method4440(-651677583);
		if (bool)
			BaseVarType.aClass412_7963.method5060(-1926526264);
	}

	public static void method5201() {
		if (null != Class111.anInterface49Array1427) {
			Interface49[] interface49s = Class111.anInterface49Array1427;
			for (int i = 0; i < interface49s.length; i++) {
				Interface49 interface49 = interface49s[i];
				interface49.method22((byte) 125);
			}
		}
	}

	public static void method5202() {
		if (null == aClass398Array5010) {
			aClass398Array5010 = Class398.method4764(221608438);
			aClass398_5017 = aClass398Array5010[0];
			Class92.aLong1239 = Class69.method1067(-2133253387) * -1475677550559237569L;
		}
		if (null == BaseVarType.aClass412_7963)
			Class359.method4440(1098997564);
		Class398 class398 = aClass398_5017;
		int i = Class192.method2911(740361322);
		if (class398 == aClass398_5017) {
			aString5016 = ((Class398) aClass398_5017).aClass279_4711.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = aString5016;
			if (((Class398) aClass398_5017).aBool4704)
				Class339.anInt4325 = ((((1843902247 * ((Class398) aClass398_5017).anInt4700 - ((Class398) aClass398_5017).anInt4713 * 1380520845) * i / 100) + 1380520845 * ((Class398) aClass398_5017).anInt4713) * 605492609);
			if (((Class398) aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(" - ").append(Class339.anInt4325 * -1202247039).append("%").toString();
		} else if (Class398.aClass398_4715 == aClass398_5017) {
			BaseVarType.aClass412_7963 = null;
			Class463.method5478(12, -475298633);
			if (aBool5019) {
				aBool5019 = false;
				Class257.method3541(Class255_Sub1.aString8948, Class320.aString3893, "", false, -808733310);
			}
		} else {
			aString5016 = ((Class398) class398).aClass279_4712.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = aString5016;
			if (((Class398) aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(1843902247 * ((Class398) class398).anInt4700).append("%").toString();
			Class339.anInt4325 = ((Class398) class398).anInt4700 * 1414167975;
			if (((Class398) aClass398_5017).aBool4704 || ((Class398) class398).aBool4704)
				Class92.aLong1239 = Class69.method1067(-1988308498) * -1475677550559237569L;
		}
		if (BaseVarType.aClass412_7963 != null) {
			BaseVarType.aClass412_7963.method5051(Class92.aLong1239 * -2635844501324888641L, aString5016, Class121.aString1479, -1202247039 * Class339.anInt4325, aClass398_5017, -1671318049);
			if (null != Class111.anInterface49Array1427) {
				for (int i_6_ = 1 + -1545178635 * anInt5009; i_6_ < Class111.anInterface49Array1427.length; i_6_++) {
					if (Class111.anInterface49Array1427[i_6_].method293((byte) 1) >= 100 && i_6_ - 1 == -1545178635 * anInt5009 && 16 != 835742603 * client.anInt8580 && BaseVarType.aClass412_7963.method5049(155826250)) {
						try {
							Class111.anInterface49Array1427[i_6_].method22((byte) 87);
						} catch (Exception exception) {
							Class111.anInterface49Array1427 = null;
							break;
						}
						BaseVarType.aClass412_7963.method5068(Class111.anInterface49Array1427[i_6_], -16014510);
						anInt5009 += 1794372189;
						if ((anInt5009 * -1545178635 >= Class111.anInterface49Array1427.length - 1) && Class111.anInterface49Array1427.length > 1)
							anInt5009 = (Class451.aClass218_5170.method3089(726051780) ? 0 : -1) * 1794372189;
					}
				}
			}
		}
	}

	public static void method5203() {
		if (null != Class111.anInterface49Array1427) {
			Interface49[] interface49s = Class111.anInterface49Array1427;
			for (int i = 0; i < interface49s.length; i++) {
				Interface49 interface49 = interface49s[i];
				interface49.method22((byte) 101);
			}
		}
	}

	public static int method5204() {
		return 913778609 * anInt5011;
	}

	static int method5205() {
		int i = aClass398_5017.anInt4692 * 169628821;
		if (i < aClass398Array5010.length - 1)
			aClass398_5017 = aClass398Array5010[1 + i];
		return 100;
	}

	static int method5206() {
		int i = aClass398_5017.anInt4692 * 169628821;
		if (i < aClass398Array5010.length - 1)
			aClass398_5017 = aClass398Array5010[1 + i];
		return 100;
	}

	public static int method5207() {
		return 913778609 * anInt5011;
	}

	Class428() throws Throwable {
		throw new Error();
	}

	static void method5208() {
		if (aClass398_5017 != null) {
			BaseVarType.aClass412_7963 = new Class412();
			BaseVarType.aClass412_7963.method5051(Class92.aLong1239 * -2635844501324888641L, ((Class398) aClass398_5017).aClass279_4711.method3758(Class594.aClass435_7823, 16711935), ((Class398) aClass398_5017).aClass279_4711.method3758(Class594.aClass435_7823, 16711935), ((Class398) aClass398_5017).anInt4713 * 1380520845, aClass398_5017, -1671318049);
			aThread5015 = new Thread(BaseVarType.aClass412_7963, "");
			aThread5015.start();
		}
	}

	public static void method5209(boolean bool) {
		if (BaseVarType.aClass412_7963 == null)
			Class359.method4440(-1843712477);
		if (bool)
			BaseVarType.aClass412_7963.method5060(157031288);
	}

	public static int method5210() {
		return 1404664833 * anInt5013;
	}

	public static void method5211() {
		if (null != BaseVarType.aClass412_7963)
			BaseVarType.aClass412_7963.method5053(274776914);
		if (null != aThread5015) {
			for (;;) {
				try {
					aThread5015.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static Class319[] method5212(byte i) {
		return (new Class319[] { Class319.aClass319_3888, Class319.aClass319_3876, Class319.aClass319_3880, Class319.aClass319_3881, Class319.aClass319_3886, Class319.aClass319_3882,
			Class319.aClass319_3883, Class319.aClass319_3879, Class319.aClass319_3884 });
	}

	static final void method5213(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class289_Sub2.method8865(class73, class83, class441, -504969512);
	}

	static final void method5214(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -22739);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class418.method5107(class73, class83, class441, (byte) -71);
	}

	static final void method5215(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9122(2004971929) ? 1 : 0;
	}
}
