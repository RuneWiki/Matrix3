package game;

/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412 implements Runnable {
	int anInt4899;
	Class398 aClass398_4900;
	volatile boolean aBool4901;
	Interface49 anInterface49_4902;
	long aLong4903;
	boolean aBool4904;
	long aLong4905;
	String aString4906;
	Interface49 anInterface49_4907 = new Class419();
	int anInt4908;
	String aString4909;

	int method5047(int i) {
		return ((Class412) this).anInt4899 * -700880783;
	}

	Class412() {
		((Class412) this).anInterface49_4902 = null;
	}

	synchronized boolean method5048() {
		return (((Class412) this).anInterface49_4907.method286(1010331057833880229L * ((Class412) this).aLong4903));
	}

	synchronized boolean method5049(int i) {
		return (((Class412) this).anInterface49_4907.method286(1010331057833880229L * ((Class412) this).aLong4903));
	}

	int method5050() {
		return ((Class412) this).anInt4899 * -700880783;
	}

	synchronized void method5051(long l, String string, String string_0_, int i, Class398 class398, int i_1_) {
		((Class412) this).aLong4905 = 7215995907474119571L * l;
		((Class412) this).aString4906 = string;
		((Class412) this).aString4909 = string_0_;
		((Class412) this).anInt4908 = i * 452668023;
		((Class412) this).aClass398_4900 = class398;
	}

	public int method5052(byte i) {
		if (null == ((Class412) this).aClass398_4900)
			return 0;
		int i_2_ = ((Class412) this).aClass398_4900.anInt4692 * 169628821;
		if (((Class398) ((Class412) this).aClass398_4900).aBool4704 && (172478279 * ((Class412) this).anInt4908 < (((Class398) ((Class412) this).aClass398_4900).anInt4700 * 1843902247)))
			return 1 + 172478279 * ((Class412) this).anInt4908;
		if (i_2_ < 0 || i_2_ >= Class428.aClass398Array5010.length - 1)
			return 100;
		if ((1380520845 * ((Class398) ((Class412) this).aClass398_4900).anInt4713) == 172478279 * ((Class412) this).anInt4908)
			return (((Class398) ((Class412) this).aClass398_4900).anInt4700 * 1843902247);
		return (((Class398) ((Class412) this).aClass398_4900).anInt4713 * 1380520845);
	}

	void method5053(int i) {
		((Class412) this).aBool4901 = true;
	}

	public String method5054(int i) {
		return ((Class412) this).aString4909;
	}

	public String method5055(int i) {
		return ((Class412) this).aString4906;
	}

	public long method5056(int i) {
		return 7564783229464705691L * ((Class412) this).aLong4905;
	}

	void method5057() {
		((Class412) this).aBool4901 = true;
	}

	public void run() {
		while (!((Class412) this).aBool4901) {
			long l = Class69.method1067(-1864213803);
			synchronized (this) {
				try {
					((Class412) this).anInt4899 += -916105071;
					if (((Class412) this).anInterface49_4907 instanceof Class419)
						((Class412) this).anInterface49_4907.method283(((Class412) this).aBool4904, 646513129);
					else {
						long l_3_ = Class69.method1067(-1938824328);
						if (null != Class272_Sub2.aClass106_9517 && ((Class412) this).anInterface49_4902 != null && ((Class412) this).anInterface49_4902.method287((byte) 1) != 0 && ((1010331057833880229L * ((Class412) this).aLong4903) >= l_3_ - (long) ((Class412) this).anInterface49_4902.method287((byte) -17))) {
							int i = (int) ((l_3_ - (((Class412) this).aLong4903 * 1010331057833880229L)) * 255L / (long) ((Class412) this).anInterface49_4902.method287((byte) 0));
							int i_4_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_4_ = i_4_ << 24 | 0xffffff;
							Class107.method2060(114931451);
							Class272_Sub2.aClass106_9517.method1719(1, 0);
							Class161 class161 = (Class272_Sub2.aClass106_9517.method1828(Class269.anInt2861 * 1960824389, -530390519 * Class584.anInt7739, true, -286726945));
							Class104_Sub1 class104_sub1 = Class272_Sub2.aClass106_9517.method1693();
							class104_sub1.method9908(0, class161.method2590());
							Class272_Sub2.aClass106_9517.method1661(class104_sub1, -311748610);
							((Class412) this).anInterface49_4902.method283(true, 1069363981);
							Class272_Sub2.aClass106_9517.method1884(class104_sub1, 726059106);
							class161.method2619(0, 0, 0, i_4_, 1);
							Class272_Sub2.aClass106_9517.method1661(class104_sub1, -456401367);
							Class272_Sub2.aClass106_9517.method1719(1, 0);
							((Class412) this).anInterface49_4907.method283(true, 1609956662);
							Class272_Sub2.aClass106_9517.method1884(class104_sub1, 1551051418);
							class161.method2619(0, 0, 0, i, 1);
						} else {
							if (((Class412) this).anInterface49_4902 != null) {
								((Class412) this).aBool4904 = true;
								((Class412) this).anInterface49_4902.method285((short) 9549);
								((Class412) this).anInterface49_4902 = null;
							}
							if (((Class412) this).aBool4904) {
								Class107.method2060(-862695592);
								if (Class272_Sub2.aClass106_9517 != null)
									Class272_Sub2.aClass106_9517.method1719(1, 0);
							}
							((Class412) this).anInterface49_4907.method283((((Class412) this).aBool4904 || (Class272_Sub2.aClass106_9517 != null && Class272_Sub2.aClass106_9517.method1672())), 402441092);
						}
						try {
							if (Class272_Sub2.aClass106_9517 != null && !(((Class412) this).anInterface49_4907 instanceof Class419))
								Class272_Sub2.aClass106_9517.method1966(-1128537706);
						} catch (Exception_Sub1 exception_sub1) {
							Class640.method7592(new StringBuilder().append(exception_sub1.getMessage()).append(Class278_Sub1.aclient9503.method6946((byte) 46)).toString(), exception_sub1, 203673748);
							BaseVarType.method7260(0, true, 2033778266);
						}
					}
					((Class412) this).aBool4904 = false;
					if (null != Class272_Sub2.aClass106_9517 && !(((Class412) this).anInterface49_4907 instanceof Class419) && ((((Class412) this).aClass398_4900.anInt4692 * 169628821) < Class398.aClass398_4707.anInt4692 * 169628821))
						Class102_Sub5.method9947(-386163417);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_5_ = Class69.method1067(-1913069546);
			int i = (int) (20L - (l_5_ - l));
			if (i > 0)
				Class198.method2977((long) i);
		}
	}

	public int method5058(int i) {
		return ((Class412) this).anInt4908 * 172478279;
	}

	int method5059() {
		return ((Class412) this).anInt4899 * -700880783;
	}

	synchronized void method5060(int i) {
		((Class412) this).aBool4904 = true;
	}

	int method5061() {
		return ((Class412) this).anInt4899 * -700880783;
	}

	synchronized boolean method5062() {
		return (((Class412) this).anInterface49_4907.method286(1010331057833880229L * ((Class412) this).aLong4903));
	}

	synchronized boolean method5063() {
		return (((Class412) this).anInterface49_4907.method286(1010331057833880229L * ((Class412) this).aLong4903));
	}

	public int method5064() {
		if (null == ((Class412) this).aClass398_4900)
			return 0;
		int i = ((Class412) this).aClass398_4900.anInt4692 * 169628821;
		if (((Class398) ((Class412) this).aClass398_4900).aBool4704 && (172478279 * ((Class412) this).anInt4908 < (((Class398) ((Class412) this).aClass398_4900).anInt4700 * 1843902247)))
			return 1 + 172478279 * ((Class412) this).anInt4908;
		if (i < 0 || i >= Class428.aClass398Array5010.length - 1)
			return 100;
		if ((1380520845 * ((Class398) ((Class412) this).aClass398_4900).anInt4713) == 172478279 * ((Class412) this).anInt4908)
			return (((Class398) ((Class412) this).aClass398_4900).anInt4700 * 1843902247);
		return (((Class398) ((Class412) this).aClass398_4900).anInt4713 * 1380520845);
	}

	public Class398 method5065(int i) {
		return ((Class412) this).aClass398_4900;
	}

	public void method5066() {
		while (!((Class412) this).aBool4901) {
			long l = Class69.method1067(-2074111972);
			synchronized (this) {
				try {
					((Class412) this).anInt4899 += -916105071;
					if (((Class412) this).anInterface49_4907 instanceof Class419)
						((Class412) this).anInterface49_4907.method283(((Class412) this).aBool4904, -1255391550);
					else {
						long l_6_ = Class69.method1067(-1836164976);
						if (null != Class272_Sub2.aClass106_9517 && ((Class412) this).anInterface49_4902 != null && ((Class412) this).anInterface49_4902.method287((byte) -57) != 0 && ((1010331057833880229L * ((Class412) this).aLong4903) >= l_6_ - (long) ((Class412) this).anInterface49_4902.method287((byte) 36))) {
							int i = (int) ((l_6_ - (((Class412) this).aLong4903 * 1010331057833880229L)) * 255L / (long) ((Class412) this).anInterface49_4902.method287((byte) -1));
							int i_7_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_7_ = i_7_ << 24 | 0xffffff;
							Class107.method2060(-2041908020);
							Class272_Sub2.aClass106_9517.method1719(1, 0);
							Class161 class161 = (Class272_Sub2.aClass106_9517.method1828(Class269.anInt2861 * 1960824389, -530390519 * Class584.anInt7739, true, -1160659049));
							Class104_Sub1 class104_sub1 = Class272_Sub2.aClass106_9517.method1693();
							class104_sub1.method9908(0, class161.method2590());
							Class272_Sub2.aClass106_9517.method1661(class104_sub1, -147325182);
							((Class412) this).anInterface49_4902.method283(true, -1760955309);
							Class272_Sub2.aClass106_9517.method1884(class104_sub1, 1746425603);
							class161.method2619(0, 0, 0, i_7_, 1);
							Class272_Sub2.aClass106_9517.method1661(class104_sub1, -502746849);
							Class272_Sub2.aClass106_9517.method1719(1, 0);
							((Class412) this).anInterface49_4907.method283(true, -1009965733);
							Class272_Sub2.aClass106_9517.method1884(class104_sub1, 324865003);
							class161.method2619(0, 0, 0, i, 1);
						} else {
							if (((Class412) this).anInterface49_4902 != null) {
								((Class412) this).aBool4904 = true;
								((Class412) this).anInterface49_4902.method285((short) -28253);
								((Class412) this).anInterface49_4902 = null;
							}
							if (((Class412) this).aBool4904) {
								Class107.method2060(-1405910087);
								if (Class272_Sub2.aClass106_9517 != null)
									Class272_Sub2.aClass106_9517.method1719(1, 0);
							}
							((Class412) this).anInterface49_4907.method283((((Class412) this).aBool4904 || (Class272_Sub2.aClass106_9517 != null && Class272_Sub2.aClass106_9517.method1672())), 2088679893);
						}
						try {
							if (Class272_Sub2.aClass106_9517 != null && !(((Class412) this).anInterface49_4907 instanceof Class419))
								Class272_Sub2.aClass106_9517.method1966(328065256);
						} catch (Exception_Sub1 exception_sub1) {
							Class640.method7592(new StringBuilder().append(exception_sub1.getMessage()).append(Class278_Sub1.aclient9503.method6946((byte) 36)).toString(), exception_sub1, 1491032344);
							BaseVarType.method7260(0, true, 1399459656);
						}
					}
					((Class412) this).aBool4904 = false;
					if (null != Class272_Sub2.aClass106_9517 && !(((Class412) this).anInterface49_4907 instanceof Class419) && ((((Class412) this).aClass398_4900.anInt4692 * 169628821) < Class398.aClass398_4707.anInt4692 * 169628821))
						Class102_Sub5.method9947(-1985936026);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_8_ = Class69.method1067(-2073058542);
			int i = (int) (20L - (l_8_ - l));
			if (i > 0)
				Class198.method2977((long) i);
		}
	}

	void method5067() {
		((Class412) this).aBool4901 = true;
	}

	synchronized void method5068(Interface49 interface49, int i) {
		((Class412) this).anInterface49_4902 = ((Class412) this).anInterface49_4907;
		((Class412) this).anInterface49_4907 = interface49;
		((Class412) this).aLong4903 = Class69.method1067(-1685713866) * -8406696925458059987L;
	}

	static void method5069(int i) {
		Class193.aClass127_2322.method2234((byte) -78);
	}

	static final void method5070(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class539.method6402(class73, class83, true, 2, class441, (byte) -122);
	}

	public static int method5071(int i) {
		return Class572_Sub2.aTwitchTV8969.GetStreamState();
	}

	static final void method5072(Cs2Executor class441, byte i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub30_9231.method7863(i_9_, -1635759724);
	}

	static final void method5073(Class572_Sub15_Sub2 class572_sub15_sub2, int i) {
		int i_10_ = 0;
		class572_sub15_sub2.method10397(-860683894);
		for (int i_11_ = 0; i_11_ < 1657484935 * Class184.anInt2163; i_11_++) {
			int i_12_ = Class184.anIntArray2154[i_11_];
			if ((Class184.aByteArray2161[i_12_] & 0x1) == 0) {
				if (i_10_ > 0) {
					i_10_--;
					Class184.aByteArray2161[i_12_] |= 0x2;
				} else {
					int i_13_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_13_ == 0) {
						i_10_ = Class175.method2757(class572_sub15_sub2, 16711935);
						Class184.aByteArray2161[i_12_] |= 0x2;
					} else
						Class104_Sub1.method9921(class572_sub15_sub2, i_12_, 396478280);
				}
			}
		}
		class572_sub15_sub2.method10395(-1358387278);
		if (0 != i_10_)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_14_ = 0; i_14_ < 1657484935 * Class184.anInt2163; i_14_++) {
			int i_15_ = Class184.anIntArray2154[i_14_];
			if (0 != (Class184.aByteArray2161[i_15_] & 0x1)) {
				if (i_10_ > 0) {
					i_10_--;
					Class184.aByteArray2161[i_15_] |= 0x2;
				} else {
					int i_16_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (0 == i_16_) {
						i_10_ = Class175.method2757(class572_sub15_sub2, 16711935);
						Class184.aByteArray2161[i_15_] |= 0x2;
					} else
						Class104_Sub1.method9921(class572_sub15_sub2, i_15_, 160451858);
				}
			}
		}
		class572_sub15_sub2.method10395(-483118610);
		if (0 != i_10_)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_17_ = 0; i_17_ < 33123591 * Class184.anInt2160; i_17_++) {
			int i_18_ = Class184.anIntArray2162[i_17_];
			if (0 != (Class184.aByteArray2161[i_18_] & 0x1)) {
				if (i_10_ > 0) {
					i_10_--;
					Class184.aByteArray2161[i_18_] |= 0x2;
				} else {
					int i_19_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (0 == i_19_) {
						i_10_ = Class175.method2757(class572_sub15_sub2, 16711935);
						Class184.aByteArray2161[i_18_] |= 0x2;
					} else if (Class402.method4781(class572_sub15_sub2, i_18_, (byte) 0))
						Class184.aByteArray2161[i_18_] |= 0x2;
				}
			}
		}
		class572_sub15_sub2.method10395(-1095399146);
		if (0 != i_10_)
			throw new RuntimeException();
		class572_sub15_sub2.method10397(-860683894);
		for (int i_20_ = 0; i_20_ < Class184.anInt2160 * 33123591; i_20_++) {
			int i_21_ = Class184.anIntArray2162[i_20_];
			if (0 == (Class184.aByteArray2161[i_21_] & 0x1)) {
				if (i_10_ > 0) {
					i_10_--;
					Class184.aByteArray2161[i_21_] |= 0x2;
				} else {
					int i_22_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_22_ == 0) {
						i_10_ = Class175.method2757(class572_sub15_sub2, 16711935);
						Class184.aByteArray2161[i_21_] |= 0x2;
					} else if (Class402.method4781(class572_sub15_sub2, i_21_, (byte) -83))
						Class184.aByteArray2161[i_21_] |= 0x2;
				}
			}
		}
		class572_sub15_sub2.method10395(-653763341);
		if (0 != i_10_)
			throw new RuntimeException();
		Class184.anInt2163 = 0;
		Class184.anInt2160 = 0;
		for (int i_23_ = 1; i_23_ < 2048; i_23_++) {
			Class184.aByteArray2161[i_23_] >>= 1;
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_23_];
			if (class456_sub1_sub2_sub3_sub2 != null)
				Class184.anIntArray2154[(Class184.anInt2163 += -425218249) * 1657484935 - 1] = i_23_;
			else
				Class184.anIntArray2162[(Class184.anInt2160 += 285241527) * 33123591 - 1] = i_23_;
		}
	}

	public static boolean method5074(int i, int i_24_, int i_25_) {
		if (!Class25.aBool165)
			return false;
		int i_26_ = i >> 16;
		int i_27_ = i & 0xffff;
		if (Class534.aClass83Array5975[i_26_] == null || (null == Class534.aClass83Array5975[i_26_].aClass73Array1081[i_27_]))
			return false;
		InterfaceDefinitions class73 = Class534.aClass83Array5975[i_26_].aClass73Array1081[i_27_];
		if (-1 != i_24_ || 0 != -1285279191 * class73.anInt752) {
			for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(1560817912))) {
				if (740323685 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11397) == i_24_ && (-1718435171 * class73.selfId == (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11392) * 200110927) && (58 == (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871 || (-44467871 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 == 1007) || (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871 == 25 || 57 == -44467871 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 || 30 == (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871))
					return true;
			}
		} else {
			for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(1785848446))) {
				if (-44467871 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) == 58 || 1007 == (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871 || 25 == -44467871 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 || (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871 == 57 || 30 == (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871) {
					for (InterfaceDefinitions class73_28_ = Class512.method6083((200110927 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11392)), (short) 15408); class73_28_ != null; class73_28_ = Class76.method1152((Class534.aClass83Array5975[(class73_28_.selfId * -1718435171) >> 16]), class73_28_, (short) 8997)) {
						if (-1718435171 * class73_28_.selfId == -1718435171 * class73.selfId)
							return true;
					}
				}
			}
		}
		return false;
	}

	static void method5075(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		if (null != class572_sub12_sub10) {
			Class25.aClass675_174.method7940(class572_sub12_sub10, -1835742480);
			Class25.anInt172 += -1390326489;
			Object object = null;
			Class572_Sub12_Sub19 class572_sub12_sub19;
			if (!((Class572_Sub12_Sub10) class572_sub12_sub10).aBool11401 && !"".equals(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391)) {
				long l = (((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11400 * 8440972884689828221L);
				for (class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass676_175.get(l)); (null != class572_sub12_sub19 && !(((Class572_Sub12_Sub19) class572_sub12_sub19).aString11481.equals(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391))); class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass676_175.method7971((byte) 60))) {
					/* empty */
				}
				if (null == class572_sub12_sub19) {
					class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass127_179.method2246(l));
					if (null != class572_sub12_sub19 && !(((Class572_Sub12_Sub19) class572_sub12_sub19).aString11481.equals(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391)))
						class572_sub12_sub19 = null;
					if (class572_sub12_sub19 == null)
						class572_sub12_sub19 = new Class572_Sub12_Sub19(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391);
					Class25.aClass676_175.put(class572_sub12_sub19, l);
					Class25.anInt173 += -1155198607;
				}
			} else {
				class572_sub12_sub19 = new Class572_Sub12_Sub19(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391);
				Class25.anInt173 += -1155198607;
			}
			if (class572_sub12_sub19.method10457(class572_sub12_sub10, 1820614798))
				Class266.method3631(class572_sub12_sub19, 1427995962);
		}
	}

	public static RuntimeException_Sub5 method5076(Throwable throwable, String string) {
		RuntimeException_Sub5 runtimeexception_sub5;
		if (throwable instanceof RuntimeException_Sub5) {
			runtimeexception_sub5 = (RuntimeException_Sub5) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub5 runtimeexception_sub5_29_ = runtimeexception_sub5;
			((RuntimeException_Sub5) runtimeexception_sub5_29_).aString11787 = stringbuilder.append(((RuntimeException_Sub5) runtimeexception_sub5_29_).aString11787).append(' ').append(string).toString();
		} else
			runtimeexception_sub5 = new RuntimeException_Sub5(throwable, string);
		return runtimeexception_sub5;
	}
}
