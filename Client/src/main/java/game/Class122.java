package game;

/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
	public static Class133[] aClass133Array1481;
	public static Class675 aClass675_1482 = new Class675();
	public static Class130[] aClass130Array1483;
	static int anInt1484;
	public static Class676 aClass676_1485 = new Class676(32);
	static int anInt1486 = 571007091;
	static Class119[] aClass119Array1487;
	static int anInt1488;
	static boolean aBool1489;
	static short aShort1490;
	static short aShort1491;
	static int anInt1492;
	static int anInt1493;
	public static Interface13 anInterface13_1494;

	static void method2187(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1203690619);
			switch (i) {
				case 0:
					anInt1484 = class572_sub15.readUnsignedShort(647518597) * 69159431;
					anInt1488 = class572_sub15.readUnsignedShort(647518597) * 1234179619;
					break;
				case 255:
					return;
			}
		}
	}

	Class122() throws Throwable {
		throw new Error();
	}

	static {
		anInt1484 = 0;
		anInt1488 = 0;
		aBool1489 = false;
		anInt1492 = 1725537827;
		anInt1493 = 1266126359;
		anInterface13_1494 = new Class108();
	}

	public static boolean method2188(int i) {
		if (-2026408359 * anInt1493 != i || null == Class120.aClass121_1474) {
			Class600.method7064(-468211061);
			Class120.aClass121_1474 = Class121.aClass121_1476;
			anInt1493 = i * -1266126359;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1476) {
			byte[] is = Class392.aClass248_4664.method3373(i, (byte) -51);
			if (null == is)
				return false;
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			Class257.method3543(class572_sub15, (byte) -112);
			int i_0_ = class572_sub15.readUnsignedByte(477847958);
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aClass675_1482.method7940(new Class572_Sub28(class572_sub15), -1808672774);
			int i_2_ = class572_sub15.readUnsignedSmart(413352028);
			aClass119Array1487 = new Class119[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				aClass119Array1487[i_3_] = new Class119(class572_sub15);
			int i_4_ = class572_sub15.readUnsignedSmart(-1034313042);
			aClass130Array1483 = new Class130[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				aClass130Array1483[i_5_] = new Class130(class572_sub15, i_5_);
			int i_6_ = class572_sub15.readUnsignedSmart(409352381);
			Class442.aClass120Array5129 = new Class120[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				Class442.aClass120Array5129[i_7_] = new Class120(class572_sub15);
			int i_8_ = class572_sub15.readUnsignedSmart(2124605939);
			Class557.aClass118Array6331 = new Class118[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				Class557.aClass118Array6331[i_9_] = new Class118(class572_sub15);
			int i_10_ = class572_sub15.readUnsignedSmart(-1315087385);
			aClass133Array1481 = new Class133[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass133Array1481[i_11_] = Class9.method528(class572_sub15, 8700023);
			Class120.aClass121_1474 = Class121.aClass121_1475;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1475) {
			boolean bool = true;
			Class130[] class130s = aClass130Array1483;
			for (int i_12_ = 0; i_12_ < class130s.length; i_12_++) {
				Class130 class130 = class130s[i_12_];
				if (!class130.method2264(1257408681))
					bool = false;
			}
			Class133[] class133s = aClass133Array1481;
			for (int i_13_ = 0; i_13_ < class133s.length; i_13_++) {
				Class133 class133 = class133s[i_13_];
				if (!class133.method2305(1189475306))
					bool = false;
			}
			Class120[] class120s = Class442.aClass120Array5129;
			for (int i_14_ = 0; i_14_ < class120s.length; i_14_++) {
				Class120 class120 = class120s[i_14_];
				if (!class120.method2174(63352231))
					bool = false;
			}
			if (!bool)
				return false;
			Class120.aClass121_1474 = Class121.aClass121_1477;
		}
		return true;
	}

	public static void method2189() {
		aClass676_1485.method7964((byte) 47);
		aClass675_1482.method7918(-350397820);
		aClass119Array1487 = null;
		aClass130Array1483 = null;
		Class442.aClass120Array5129 = null;
		Class557.aClass118Array6331 = null;
		aClass133Array1481 = null;
		anInt1486 = 571007091;
		anInt1484 = 0;
		anInt1488 = 0;
		Class120.aClass121_1474 = null;
		anInt1493 = 1266126359;
		anInt1492 = 1725537827;
		if (aBool1489) {
			client.aShort8853 = aShort1490;
			client.aShort8693 = Class70.aShort708;
			client.aShort8851 = aShort1491;
			client.aShort8852 = Class134.aShort1568;
			aBool1489 = false;
		}
	}

	static void method2190(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1902946047);
			switch (i) {
				case 0:
					anInt1484 = class572_sub15.readUnsignedShort(647518597) * 69159431;
					anInt1488 = class572_sub15.readUnsignedShort(647518597) * 1234179619;
					break;
				case 255:
					return;
			}
		}
	}

	public static boolean method2191(int i) {
		if (-2026408359 * anInt1493 != i || null == Class120.aClass121_1474) {
			Class600.method7064(922275071);
			Class120.aClass121_1474 = Class121.aClass121_1476;
			anInt1493 = i * -1266126359;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1476) {
			byte[] is = Class392.aClass248_4664.method3373(i, (byte) 28);
			if (null == is)
				return false;
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			Class257.method3543(class572_sub15, (byte) -107);
			int i_15_ = class572_sub15.readUnsignedByte(51501194);
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				aClass675_1482.method7940(new Class572_Sub28(class572_sub15), -1700622934);
			int i_17_ = class572_sub15.readUnsignedSmart(934547693);
			aClass119Array1487 = new Class119[i_17_];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
				aClass119Array1487[i_18_] = new Class119(class572_sub15);
			int i_19_ = class572_sub15.readUnsignedSmart(-1452082123);
			aClass130Array1483 = new Class130[i_19_];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
				aClass130Array1483[i_20_] = new Class130(class572_sub15, i_20_);
			int i_21_ = class572_sub15.readUnsignedSmart(-1683749618);
			Class442.aClass120Array5129 = new Class120[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
				Class442.aClass120Array5129[i_22_] = new Class120(class572_sub15);
			int i_23_ = class572_sub15.readUnsignedSmart(1028297873);
			Class557.aClass118Array6331 = new Class118[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
				Class557.aClass118Array6331[i_24_] = new Class118(class572_sub15);
			int i_25_ = class572_sub15.readUnsignedSmart(-562286652);
			aClass133Array1481 = new Class133[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				aClass133Array1481[i_26_] = Class9.method528(class572_sub15, -680642200);
			Class120.aClass121_1474 = Class121.aClass121_1475;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1475) {
			boolean bool = true;
			Class130[] class130s = aClass130Array1483;
			for (int i_27_ = 0; i_27_ < class130s.length; i_27_++) {
				Class130 class130 = class130s[i_27_];
				if (!class130.method2264(41544292))
					bool = false;
			}
			Class133[] class133s = aClass133Array1481;
			for (int i_28_ = 0; i_28_ < class133s.length; i_28_++) {
				Class133 class133 = class133s[i_28_];
				if (!class133.method2305(1097949781))
					bool = false;
			}
			Class120[] class120s = Class442.aClass120Array5129;
			for (int i_29_ = 0; i_29_ < class120s.length; i_29_++) {
				Class120 class120 = class120s[i_29_];
				if (!class120.method2174(60860739))
					bool = false;
			}
			if (!bool)
				return false;
			Class120.aClass121_1474 = Class121.aClass121_1477;
		}
		return true;
	}

	public static void method2192() {
		aShort1490 = client.aShort8853;
		Class70.aShort708 = client.aShort8693;
		aShort1491 = client.aShort8851;
		Class134.aShort1568 = client.aShort8852;
		aBool1489 = true;
		anInt1492 = Class344.audio.method938(-2136879542) * -1725537827;
		if (0 != -84129397 * anInt1488 && anInt1484 * -249822281 != 0) {
			client.aShort8851 = (short) 334;
			client.aShort8852 = (short) 334;
			client.aShort8693 = client.aShort8853 = (short) (anInt1488 * -124578304 / (anInt1484 * -249822281));
		}
	}

	public static void method2193() {
		aShort1490 = client.aShort8853;
		Class70.aShort708 = client.aShort8693;
		aShort1491 = client.aShort8851;
		Class134.aShort1568 = client.aShort8852;
		aBool1489 = true;
		anInt1492 = Class344.audio.method938(-1875171563) * -1725537827;
		if (0 != -84129397 * anInt1488 && anInt1484 * -249822281 != 0) {
			client.aShort8851 = (short) 334;
			client.aShort8852 = (short) 334;
			client.aShort8693 = client.aShort8853 = (short) (anInt1488 * -124578304 / (anInt1484 * -249822281));
		}
	}

	public static boolean method2194(int i) {
		if (-2026408359 * anInt1493 != i || null == Class120.aClass121_1474) {
			Class600.method7064(-1807309057);
			Class120.aClass121_1474 = Class121.aClass121_1476;
			anInt1493 = i * -1266126359;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1476) {
			byte[] is = Class392.aClass248_4664.method3373(i, (byte) 41);
			if (null == is)
				return false;
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			Class257.method3543(class572_sub15, (byte) -23);
			int i_30_ = class572_sub15.readUnsignedByte(1882774379);
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
				aClass675_1482.method7940(new Class572_Sub28(class572_sub15), -2117921854);
			int i_32_ = class572_sub15.readUnsignedSmart(1352756018);
			aClass119Array1487 = new Class119[i_32_];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				aClass119Array1487[i_33_] = new Class119(class572_sub15);
			int i_34_ = class572_sub15.readUnsignedSmart(1306082350);
			aClass130Array1483 = new Class130[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
				aClass130Array1483[i_35_] = new Class130(class572_sub15, i_35_);
			int i_36_ = class572_sub15.readUnsignedSmart(-12435551);
			Class442.aClass120Array5129 = new Class120[i_36_];
			for (int i_37_ = 0; i_37_ < i_36_; i_37_++)
				Class442.aClass120Array5129[i_37_] = new Class120(class572_sub15);
			int i_38_ = class572_sub15.readUnsignedSmart(176161159);
			Class557.aClass118Array6331 = new Class118[i_38_];
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
				Class557.aClass118Array6331[i_39_] = new Class118(class572_sub15);
			int i_40_ = class572_sub15.readUnsignedSmart(709792594);
			aClass133Array1481 = new Class133[i_40_];
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
				aClass133Array1481[i_41_] = Class9.method528(class572_sub15, -378647130);
			Class120.aClass121_1474 = Class121.aClass121_1475;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1475) {
			boolean bool = true;
			Class130[] class130s = aClass130Array1483;
			for (int i_42_ = 0; i_42_ < class130s.length; i_42_++) {
				Class130 class130 = class130s[i_42_];
				if (!class130.method2264(-369408444))
					bool = false;
			}
			Class133[] class133s = aClass133Array1481;
			for (int i_43_ = 0; i_43_ < class133s.length; i_43_++) {
				Class133 class133 = class133s[i_43_];
				if (!class133.method2305(1683537452))
					bool = false;
			}
			Class120[] class120s = Class442.aClass120Array5129;
			for (int i_44_ = 0; i_44_ < class120s.length; i_44_++) {
				Class120 class120 = class120s[i_44_];
				if (!class120.method2174(-298097874))
					bool = false;
			}
			if (!bool)
				return false;
			Class120.aClass121_1474 = Class121.aClass121_1477;
		}
		return true;
	}

	static final void method2195(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class668.method7877(class73, class83, class441, 16711935);
	}

	static final void method2196(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt762 * 278882041;
	}

	static final void method2197(int i) {
		Class555.method6575(client.aClass73_8770, (short) 17889);
		Class568.anInt6388 += -497304101;
		if (!client.aBool8780 || !client.aBool8775) {
			if (1657009747 * Class568.anInt6388 > 1) {
				client.aClass73_8770 = null;
				client.aClass73_8771 = null;
			}
		} else {
			int i_45_ = Class26.aClass564_216.method6657((short) 1637);
			int i_46_ = Class26.aClass564_216.method6658((byte) -86);
			i_45_ -= 12052287 * client.anInt8772;
			i_46_ -= -1634173751 * client.anInt8676;
			if (i_45_ < client.anInt8845 * 1280237521)
				i_45_ = client.anInt8845 * 1280237521;
			if (client.aClass73_8770.anInt764 * 669238293 + i_45_ > (client.anInt8778 * -2091143177 + 1280237521 * client.anInt8845))
				i_45_ = (-2091143177 * client.anInt8778 + client.anInt8845 * 1280237521 - client.aClass73_8770.anInt764 * 669238293);
			if (i_46_ < 1007747209 * client.anInt8777)
				i_46_ = client.anInt8777 * 1007747209;
			if (i_46_ + 1360982075 * client.aClass73_8770.anInt765 > client.anInt8779 * 250871123 + client.anInt8777 * 1007747209)
				i_46_ = (1007747209 * client.anInt8777 + 250871123 * client.anInt8779 - client.aClass73_8770.anInt765 * 1360982075);
			int i_47_;
			int i_48_;
			if (Class619.aClass73_8062 == client.aClass73_8771) {
				i_47_ = i_45_;
				i_48_ = i_46_;
			} else {
				i_47_ = (client.aClass73_8771.anInt774 * -1883230751 + (i_45_ - 1280237521 * client.anInt8845));
				i_48_ = (i_46_ - 1007747209 * client.anInt8777 + client.aClass73_8771.anInt775 * -2139739529);
			}
			if (!Class26.aClass564_216.method6656(-1415163126)) {
				if (client.aBool8783) {
					Class131.method2286(-1705608345);
					if (null != client.aClass73_8770.anObjectArray763) {
						Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
						class572_sub20.thizInterface = client.aClass73_8770;
						class572_sub20.anInt9148 = i_47_ * 638530953;
						class572_sub20.anInt9150 = 2034326205 * i_48_;
						InterfaceDefinitions class73 = client.method7993(client.aClass73_8770);
						InterfaceDefinitions class73_49_ = client.aClass73_8603;
						boolean bool = false;
						for (/**/; (null != class73_49_ && -1 != -1604592419 * class73_49_.anInt768 && class73 != null); class73_49_ = (Class534.aClass83Array5975[class73_49_.selfId * -1718435171 >> 16].aClass73Array1081[(class73_49_.anInt768 * -1604592419 & 0xffff)])) {
							if (class73_49_.selfId * -1718435171 == class73.selfId * -1718435171) {
								bool = true;
								break;
							}
						}
						if (null != class73_49_ && class73 != null && Class619.aClass73_8062 != class73 && !bool)
							class572_sub20.targetInterface = Class619.aClass73_8062;
						else
							class572_sub20.targetInterface = client.aClass73_8603;
						class572_sub20.params = client.aClass73_8770.anObjectArray763;
						Class34.executeCs2(class572_sub20, -2062838320);
					}
					if (null != client.aClass73_8603 && client.method7993(client.aClass73_8770) != null)
						Class381.method4648(client.aClass73_8770, client.aClass73_8603, (byte) -99);
				} else if ((-343113449 * client.anInt8637 == 1 || Class461.method5470(-2101797875)) && Class25.anInt172 * 357782167 > 2)
					Class675.method7961((-27579797 * client.anInt8733 + client.anInt8772 * 12052287), (client.anInt8676 * -1634173751 + client.anInt8782 * -2142372967), (byte) 0);
				else if (Class110.method2073(-699212625))
					Class675.method7961((12052287 * client.anInt8772 + -27579797 * client.anInt8733), (client.anInt8676 * -1634173751 + client.anInt8782 * -2142372967), (byte) 0);
				client.aClass73_8770 = null;
				client.aClass73_8771 = null;
			} else {
				if (Class568.anInt6388 * 1657009747 > client.aClass73_8770.anInt739 * 2095229683) {
					int i_50_ = i_45_ - -27579797 * client.anInt8733;
					int i_51_ = i_46_ - -2142372967 * client.anInt8782;
					if (i_50_ > -1961812835 * client.aClass73_8770.anInt796 || i_50_ < -(-1961812835 * client.aClass73_8770.anInt796) || i_51_ > -1961812835 * client.aClass73_8770.anInt796 || i_51_ < -(-1961812835 * client.aClass73_8770.anInt796))
						client.aBool8783 = true;
				}
				if (null != client.aClass73_8770.anObjectArray866 && client.aBool8783) {
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = client.aClass73_8770;
					class572_sub20.anInt9148 = 638530953 * i_47_;
					class572_sub20.anInt9150 = 2034326205 * i_48_;
					class572_sub20.params = client.aClass73_8770.anObjectArray866;
					Class34.executeCs2(class572_sub20, -2049959329);
				}
			}
		}
	}

	static void method2198(int i, int i_52_, int i_53_, int i_54_) {
		if (i == 1008)
			Class567.method6723(Class530.aClass530_5922, i_52_, i_53_, (short) -8455);
		else if (1009 == i)
			Class567.method6723(Class530.aClass530_5906, i_52_, i_53_, (short) 200);
		else if (1010 == i)
			Class567.method6723(Class530.aClass530_5908, i_52_, i_53_, (short) -14446);
		else if (i == 1011)
			Class567.method6723(Class530.aClass530_5917, i_52_, i_53_, (short) -3468);
		else if (i == 1012)
			Class567.method6723(Class530.aClass530_5909, i_52_, i_53_, (short) -24996);
	}

	public static int method2199(Class106 class106, short i) {
		Class204.method3015((byte) 31);
		return Class572_Sub2.aTwitchTV8969.StopStreaming();
	}
}
