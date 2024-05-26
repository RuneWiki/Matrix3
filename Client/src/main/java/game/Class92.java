package game;

/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class92 implements Interface72 {
	Interface18 anInterface18_1237;
	Class127 aClass127_1238 = new Class127(100);
	static long aLong1239;
	public static Class202_Sub1_Sub2 aClass202_Sub1_Sub2_1240;
	static Class639_Sub18 aClass639_Sub18_1241;

	void method1521(int i, int i_0_) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2235(i, 1500996582);
		}
	}

	Class572_Sub12_Sub7 method1522(int i, int i_1_) {
		Class572_Sub12_Sub7 class572_sub12_sub7;
		synchronized (((Class92) this).aClass127_1238) {
			class572_sub12_sub7 = ((Class572_Sub12_Sub7) ((Class92) this).aClass127_1238.method2246((long) i));
			if (class572_sub12_sub7 == null) {
				class572_sub12_sub7 = new Class572_Sub12_Sub7(i);
				((Class92) this).aClass127_1238.method2229(class572_sub12_sub7, (long) i);
			}
			if (!class572_sub12_sub7.method10323(-1982826304)) {
				Class572_Sub12_Sub7 class572_sub12_sub7_2_ = null;
				return class572_sub12_sub7_2_;
			}
		}
		return class572_sub12_sub7;
	}

	void method1523(byte i) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2231((byte) -20);
		}
	}

	void method1524() {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2234((byte) 41);
		}
	}

	void method1525(int i) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2234((byte) -68);
		}
	}

	void method1526() {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2231((byte) -109);
		}
	}

	void method1527(int i) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2235(i, 1799248720);
		}
	}

	void method1528(int i) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2235(i, 1791072036);
		}
	}

	void method1529(int i) {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2235(i, 1864779832);
		}
	}

	void method1530() {
		synchronized (((Class92) this).aClass127_1238) {
			((Class92) this).aClass127_1238.method2234((byte) -88);
		}
	}

	Class92(Interface18 interface18, Class248 class248, Class248 class248_3_) {
		((Class92) this).anInterface18_1237 = interface18;
		Class549_Sub1.method8098(class248, class248_3_, 2, (byte) 95);
	}

	static final void method1531(Cs2Executor class441, Entity class456_sub1_sub2_sub3, short i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_6_ = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -11) != Class416.aClass416_4935)
			throw new RuntimeException();
		Class658_Sub3 class658_sub3 = ((Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040));
		if (null != class456_sub1_sub2_sub3)
			class658_sub3.method8979(class456_sub1_sub2_sub3, new Class240((float) i_4_, (float) i_5_, (float) i_6_), bool, -1507904576);
		client.aBool8685 = true;
	}

	public static void method1532(boolean bool, int i) {
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9235), 1, 797440974);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9201), 1, 1188949225);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub28_9218), 0, 1035168254);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub11_9219), 0, 628595437);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub23_9208), 0, 2128840550);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub26_9240), 0, 1254909752);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub14_9215), 0, 1374486012);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub5_9248), 0, 1208404056);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub24_9221), 0, 893397207);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub12_9230), 0, 1336904001);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub13_9220), 0, 1734596673);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub35_9233), 0, 1250588876);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9247), 0, 1044044611);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9203), 0, 732997185);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub4_9200), 0, 1744857838);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub29_9212), (Class65.aClass65_681.anInt684 * -148076679), 1752111987);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub21_9210), 0, 1704810983);
		if (null != Class272_Sub2.aClass106_9517 && Class272_Sub2.aClass106_9517.method1675() && Class272_Sub2.aClass106_9517.method1786())
			Class272_Sub2.aClass106_9517.method1785();
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub31_9228), 0, 1395062862);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub32_9202), 0, 1311541000);
		Class289.method3921((short) -11747);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub7_9227), 2, 1558368740);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub19_9237), 1, 1160994427);
		Exception_Sub2.method10186(1496103338);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		client.aBool8599 = true;
	}

	static final void method1533(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class665_Sub5.method8155(class73, class83, class441, ((((Cs2Executor) class441).aClass572_Sub10_5104 == Class251.aClass572_Sub10_2731) ? Class68.aClass68_701 : Class68.aClass68_698), 1760185510);
	}
}
