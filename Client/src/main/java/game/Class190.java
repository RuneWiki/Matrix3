package game;

/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Class190 {
	static final String aString2230 = "\\/.:, _-+[]~@";
	static final int anInt2231 = 100;
	static int anInt2232 = 0;
	static int anInt2233 = 0;
	static int[] anIntArray2234;
	static String aString2235 = "";
	static int anInt2236 = 0;
	static int anInt2237 = 0;
	static boolean aBool2238;
	static boolean aBool2239;
	static int anInt2240;
	static final String aString2241 = "Success";
	static String[] aStringArray2242;
	static int anInt2243 = 0;
	static final String aString2244 = "Failure";
	static final int anInt2245 = 350;
	public static int anInt2246;

	static boolean method2864() {
		return aBool2238;
	}

	static {
		aBool2238 = false;
		anInt2240 = 1907057491;
		aBool2239 = true;
	}

	static boolean method2865() {
		if (Class664.method7853(835742603 * client.anInt8580, (short) -10003))
			return false;
		return true;
	}

	static boolean method2866() {
		if (Class664.method7853(835742603 * client.anInt8580, (short) -30933))
			return false;
		return true;
	}

	static void method2867() {
		if (Class334.method4218((byte) 62)) {
			if (null == LinkableInt.aStringArray9257)
				Class501.method5994(-1544536445);
			aBool2238 = true;
			anInt2243 = 0;
			Class672.anIntArray8532 = new int[100];
			Class8.anIntArray42 = new int[100];
			anIntArray2234 = new int[100];
			Class507.anIntArray5599 = new int[100];
			for (int i = 0; i < 100; i++) {
				Class672.anIntArray8532[i] = ((int) (Math.random() * (double) (1960824389 * Class269.anInt2861)) << 4) + (int) (Math.random() * 15.0);
				Class8.anIntArray42[i] = (int) (Math.random() * 350.0) << 4;
				anIntArray2234[i] = (int) (Math.random() * 102.0) + 51;
				Class507.anIntArray5599[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class572_Sub12_Sub6.anIntArray11366 = new int[Class269.anInt2861 * 1960824389 >> 1];
		}
	}

	static void method2868() {
		if (null != Class5.aFileOutputStream31) {
			try {
				Class5.aFileOutputStream31.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class5.aFileOutputStream31 = null;
	}

	static void method2869() {
		if (null != Class5.aFileOutputStream31) {
			try {
				Class5.aFileOutputStream31.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class5.aFileOutputStream31 = null;
	}

	static void method2870() {
		if (Class334.method4218((byte) 41)) {
			if (null == LinkableInt.aStringArray9257)
				Class501.method5994(-2023688991);
			aBool2238 = true;
			anInt2243 = 0;
			Class672.anIntArray8532 = new int[100];
			Class8.anIntArray42 = new int[100];
			anIntArray2234 = new int[100];
			Class507.anIntArray5599 = new int[100];
			for (int i = 0; i < 100; i++) {
				Class672.anIntArray8532[i] = ((int) (Math.random() * (double) (1960824389 * Class269.anInt2861)) << 4) + (int) (Math.random() * 15.0);
				Class8.anIntArray42[i] = (int) (Math.random() * 350.0) << 4;
				anIntArray2234[i] = (int) (Math.random() * 102.0) + 51;
				Class507.anIntArray5599[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class572_Sub12_Sub6.anIntArray11366 = new int[Class269.anInt2861 * 1960824389 >> 1];
		}
	}

	static void method2871() {
		Class253.anInt2734 = (Class318.aClass284_3875.anInt3412 * 1593101245 + Class318.aClass284_3875.anInt3413 * 1236277411 + 286722598);
		Class452_Sub1.anInt8933 = -825093674 + (Class26.aClass284_215.anInt3412 * 1604033125 + Class26.aClass284_215.anInt3413 * 1460360443);
		LinkableInt.aStringArray9257 = new String[500];
		for (int i = 0; i < LinkableInt.aStringArray9257.length; i++)
			LinkableInt.aStringArray9257[i] = "";
		Class118.method2154(Class279.aClass279_3036.method3758(Class594.aClass435_7823, 16711935), -1911548992);
	}

	static void method2872() {
		Class253.anInt2734 = (Class318.aClass284_3875.anInt3412 * 1593101245 + Class318.aClass284_3875.anInt3413 * 1236277411 + 286722598);
		Class452_Sub1.anInt8933 = -825093674 + (Class26.aClass284_215.anInt3412 * 1604033125 + Class26.aClass284_215.anInt3413 * 1460360443);
		LinkableInt.aStringArray9257 = new String[500];
		for (int i = 0; i < LinkableInt.aStringArray9257.length; i++)
			LinkableInt.aStringArray9257[i] = "";
		Class118.method2154(Class279.aClass279_3036.method3758(Class594.aClass435_7823, 16711935), 1920783332);
	}

	static void method2873() {
		Class253.anInt2734 = (Class318.aClass284_3875.anInt3412 * 1593101245 + Class318.aClass284_3875.anInt3413 * 1236277411 + 286722598);
		Class452_Sub1.anInt8933 = -825093674 + (Class26.aClass284_215.anInt3412 * 1604033125 + Class26.aClass284_215.anInt3413 * 1460360443);
		LinkableInt.aStringArray9257 = new String[500];
		for (int i = 0; i < LinkableInt.aStringArray9257.length; i++)
			LinkableInt.aStringArray9257[i] = "";
		Class118.method2154(Class279.aClass279_3036.method3758(Class594.aClass435_7823, 16711935), 2063464061);
	}

	static void method2874() {
		Class253.anInt2734 = (Class318.aClass284_3875.anInt3412 * 1593101245 + Class318.aClass284_3875.anInt3413 * 1236277411 + 286722598);
		Class452_Sub1.anInt8933 = -825093674 + (Class26.aClass284_215.anInt3412 * 1604033125 + Class26.aClass284_215.anInt3413 * 1460360443);
		LinkableInt.aStringArray9257 = new String[500];
		for (int i = 0; i < LinkableInt.aStringArray9257.length; i++)
			LinkableInt.aStringArray9257[i] = "";
		Class118.method2154(Class279.aClass279_3036.method3758(Class594.aClass435_7823, 16711935), 842314631);
	}

	static void method2875() {
		if (Class334.method4218((byte) 48)) {
			if (null == LinkableInt.aStringArray9257)
				Class501.method5994(-149739053);
			aBool2238 = true;
			anInt2243 = 0;
			Class672.anIntArray8532 = new int[100];
			Class8.anIntArray42 = new int[100];
			anIntArray2234 = new int[100];
			Class507.anIntArray5599 = new int[100];
			for (int i = 0; i < 100; i++) {
				Class672.anIntArray8532[i] = ((int) (Math.random() * (double) (1960824389 * Class269.anInt2861)) << 4) + (int) (Math.random() * 15.0);
				Class8.anIntArray42[i] = (int) (Math.random() * 350.0) << 4;
				anIntArray2234[i] = (int) (Math.random() * 102.0) + 51;
				Class507.anIntArray5599[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class572_Sub12_Sub6.anIntArray11366 = new int[Class269.anInt2861 * 1960824389 >> 1];
		}
	}

	Class190() throws Throwable {
		throw new Error();
	}

	static void method2876() {
		aBool2238 = false;
		Class672.anIntArray8532 = null;
		Class8.anIntArray42 = null;
		anIntArray2234 = null;
		Class507.anIntArray5599 = null;
		Class54.method987((byte) 98);
	}

	static boolean method2877() {
		return aBool2238;
	}

	static void method2878() {
		/* empty */
	}

	static void method2879() {
		if (-28144385 * anInt2236 > 0) {
			int i = 0;
			for (int i_0_ = 0; i_0_ < LinkableInt.aStringArray9257.length; i_0_++) {
				if (LinkableInt.aStringArray9257[i_0_].indexOf("--> ") != -1 && ++i == anInt2236 * -28144385) {
					aString2235 = (LinkableInt.aStringArray9257[i_0_].substring(LinkableInt.aStringArray9257[i_0_].indexOf('>') + 2));
					break;
				}
			}
		} else
			aString2235 = "";
	}

	static boolean method2880() {
		if (Class664.method7853(835742603 * client.anInt8580, (short) -10765))
			return false;
		return true;
	}

	public static void method2881(String string) {
		if (LinkableInt.aStringArray9257 == null)
			Class501.method5994(-631997101);
		client.aCalendar8872.setTime(new Date(Class69.method1067(-1853312603)));
		int i = client.aCalendar8872.get(11);
		int i_1_ = client.aCalendar8872.get(12);
		int i_2_ = client.aCalendar8872.get(13);
		String string_3_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_1_ / 10).append(i_1_ % 10).append(":").append(i_2_ / 10).append(i_2_ % 10).toString();
		String[] strings = Class104_Sub2.method9935(string, '\n', 207597699);
		for (int i_4_ = 0; i_4_ < strings.length; i_4_++) {
			for (int i_5_ = -1750491771 * anInt2232; i_5_ > 0; i_5_--)
				LinkableInt.aStringArray9257[i_5_] = LinkableInt.aStringArray9257[i_5_ - 1];
			LinkableInt.aStringArray9257[0] = new StringBuilder().append(string_3_).append(": ").append(strings[i_4_]).toString();
			if (null != Class5.aFileOutputStream31) {
				try {
					Class5.aFileOutputStream31.write(Class604.method7151(new StringBuilder().append(LinkableInt.aStringArray9257[0]).append("\n").toString(), (byte) 4));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt2232 * -1750491771 < LinkableInt.aStringArray9257.length - 1) {
				anInt2232 += 29086541;
				if (2143380251 * anInt2233 > 0)
					anInt2233 += -639221997;
			}
		}
	}

	public static void method2882(String string) {
		if (LinkableInt.aStringArray9257 == null)
			Class501.method5994(1870198020);
		client.aCalendar8872.setTime(new Date(Class69.method1067(-2134061597)));
		int i = client.aCalendar8872.get(11);
		int i_6_ = client.aCalendar8872.get(12);
		int i_7_ = client.aCalendar8872.get(13);
		String string_8_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).toString();
		String[] strings = Class104_Sub2.method9935(string, '\n', 207597699);
		for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
			for (int i_10_ = -1750491771 * anInt2232; i_10_ > 0; i_10_--)
				LinkableInt.aStringArray9257[i_10_] = LinkableInt.aStringArray9257[i_10_ - 1];
			LinkableInt.aStringArray9257[0] = new StringBuilder().append(string_8_).append(": ").append(strings[i_9_]).toString();
			if (null != Class5.aFileOutputStream31) {
				try {
					Class5.aFileOutputStream31.write(Class604.method7151(new StringBuilder().append(LinkableInt.aStringArray9257[0]).append("\n").toString(), (byte) 4));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt2232 * -1750491771 < LinkableInt.aStringArray9257.length - 1) {
				anInt2232 += 29086541;
				if (2143380251 * anInt2233 > 0)
					anInt2233 += -639221997;
			}
		}
	}

	static void method2883(int i) {
		if (29 == i)
			throw new Error();
		if (i == 19)
			throw new OutOfMemoryError();
		try {
			if (i == 1)
				Class380.method4639(392351193);
			else if (i == 25)
				Class118.method2154(new StringBuilder().append("").append(Class584.anInt7734 * -267830063).toString(), -1481860048);
			else if (26 == i) {
				Class533 class533 = (client.aClass613_8605.method7285(1619552366).aClass533_5828);
				class533.aBool5965 = !class533.aBool5965;
			} else if (20 == i)
				client.aBool8874 = true;
			else if (27 == i)
				client.aBool8874 = false;
			else if (21 == i)
				client.aClass652_8748.method7704(-986482493);
			else if (i == 7) {
				VarBitDefinition.method5228(1632166045);
				for (int i_11_ = 0; i_11_ < 10; i_11_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_12_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_12_).toString(), -2021000731);
			} else if (i == 24) {
				VarBitDefinition.method5228(1542718385);
				for (int i_13_ = 0; i_13_ < 10; i_13_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_14_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_14_).toString(), 399397871);
				Class167_Sub1.method10039(-21327269);
				VarBitDefinition.method5228(1858874200);
				for (int i_15_ = 0; i_15_ < 10; i_15_++)
					System.gc();
				i_14_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_14_).toString(), 2109016666);
			} else if (i == 15)
				Class118.method2154((Class297.aClass567_3477.method419((byte) 13) ? "Success" : "Failure"), 706311649);
			else if (4 == i)
				Class633.aClass641_8197.method7596((byte) -71);
			else if (17 == i)
				Class51.aClass278_491.method3731(-911817189);
			else if (i == 13)
				Class51.aClass278_491.method3742((byte) 125);
			else if (i == 8)
				Class584.aCanvas7745.setLocation(50, 50);
			else if (2 == i)
				Class584.aCanvas7745.setLocation((954583035 * Class584.anInt7748), (2077319943 * Class584.anInt7760));
			else if (6 == i)
				Class447.method5346(-2141078081);
			else if (11 == i) {
				client.aClass613_8605.aLong8031 = Class69.method1067(-1713852527) * -4062201478757077277L;
				client.aClass613_8605.aBool7990 = true;
				Class447.method5346(-2144792460);
			} else if (i == 14) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append((int) class240.aFloat2653 >> 9).append(" ").append((int) class240.aFloat2657 >> 9).toString(), 1468728594);
			} else if (i == 10) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append("").append(client.aClass613_8605.method7285(1980056533).aClass174Array5875[(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009)].method2713((int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 949135611)).toString(), -1800756567);
			} else if (i == 23) {
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_743.method2233(2059563822)).append(" ").append(InterfaceDefinitions.aClass127_743.method2232(-360275654)).toString(), 163534770);
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_823.method2233(1831763371)).append(" ").append(InterfaceDefinitions.aClass127_823.method2232(-1674955663)).toString(), -653313513);
			} else if (i == 9)
				Class556.method6587(false, -2041111615);
			else if (16 == i) {
				client.aBool8591 = !client.aBool8591;
				Class272_Sub2.aClass106_9517.method2037(client.aBool8591);
				Class671.method7886(-1130585963);
			} else if (i == 5) {
				client.anInt8600 = 0;
				client.aClass613_8605.method7302(442748331);
			} else if (28 == i) {
				client.anInt8600 = 1744575599;
				client.aClass613_8605.method7302(-1297213098);
			} else if (22 == i) {
				client.anInt8600 = -805816098;
				client.aClass613_8605.method7302(-1797754060);
			}
		} catch (Exception exception) {
			Class118.method2154(Class279.aClass279_2951.method3758(Class594.aClass435_7823, 16711935), -842730686);
		}
	}

	static void method2884() {
		/* empty */
	}

	static void method2885(int i) {
		if (29 == i)
			throw new Error();
		if (i == 19)
			throw new OutOfMemoryError();
		try {
			if (i == 1)
				Class380.method4639(-573743148);
			else if (i == 25)
				Class118.method2154(new StringBuilder().append("").append(Class584.anInt7734 * -267830063).toString(), 1264944905);
			else if (26 == i) {
				Class533 class533 = (client.aClass613_8605.method7285(2052426642).aClass533_5828);
				class533.aBool5965 = !class533.aBool5965;
			} else if (20 == i)
				client.aBool8874 = true;
			else if (27 == i)
				client.aBool8874 = false;
			else if (21 == i)
				client.aClass652_8748.method7704(-1782491060);
			else if (i == 7) {
				VarBitDefinition.method5228(297342226);
				for (int i_16_ = 0; i_16_ < 10; i_16_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_17_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_17_).toString(), 1752729728);
			} else if (i == 24) {
				VarBitDefinition.method5228(267074152);
				for (int i_18_ = 0; i_18_ < 10; i_18_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_19_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_19_).toString(), -1063706552);
				Class167_Sub1.method10039(-21327269);
				VarBitDefinition.method5228(1056415252);
				for (int i_20_ = 0; i_20_ < 10; i_20_++)
					System.gc();
				i_19_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_19_).toString(), -479341142);
			} else if (i == 15)
				Class118.method2154((Class297.aClass567_3477.method419((byte) -96) ? "Success" : "Failure"), 1153566207);
			else if (4 == i)
				Class633.aClass641_8197.method7596((byte) -68);
			else if (17 == i)
				Class51.aClass278_491.method3731(1401936918);
			else if (i == 13)
				Class51.aClass278_491.method3742((byte) 82);
			else if (i == 8)
				Class584.aCanvas7745.setLocation(50, 50);
			else if (2 == i)
				Class584.aCanvas7745.setLocation((954583035 * Class584.anInt7748), (2077319943 * Class584.anInt7760));
			else if (6 == i)
				Class447.method5346(-2143373189);
			else if (11 == i) {
				client.aClass613_8605.aLong8031 = Class69.method1067(-2049563223) * -4062201478757077277L;
				client.aClass613_8605.aBool7990 = true;
				Class447.method5346(-2145820680);
			} else if (i == 14) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append((int) class240.aFloat2653 >> 9).append(" ").append((int) class240.aFloat2657 >> 9).toString(), -160071142);
			} else if (i == 10) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append("").append(client.aClass613_8605.method7285(1475158424).aClass174Array5875[(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009)].method2713((int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 1007435719)).toString(), -925618463);
			} else if (i == 23) {
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_743.method2233(921205840)).append(" ").append(InterfaceDefinitions.aClass127_743.method2232(-634172664)).toString(), -403445865);
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_823.method2233(1151282816)).append(" ").append(InterfaceDefinitions.aClass127_823.method2232(296263244)).toString(), 2121280958);
			} else if (i == 9)
				Class556.method6587(false, -1555793770);
			else if (16 == i) {
				client.aBool8591 = !client.aBool8591;
				Class272_Sub2.aClass106_9517.method2037(client.aBool8591);
				Class671.method7886(-1130585963);
			} else if (i == 5) {
				client.anInt8600 = 0;
				client.aClass613_8605.method7302(-1334195362);
			} else if (28 == i) {
				client.anInt8600 = 1744575599;
				client.aClass613_8605.method7302(-5765152);
			} else if (22 == i) {
				client.anInt8600 = -805816098;
				client.aClass613_8605.method7302(-1793791469);
			}
		} catch (Exception exception) {
			Class118.method2154(Class279.aClass279_2951.method3758(Class594.aClass435_7823, 16711935), 21190641);
		}
	}

	static void method2886() {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(2041604863) == 1)
			Class204.aClass602_2411.method7076(new Class598((Class569.aClass569_6389), null), -339071815);
		else {
			client.aClass613_8605.method7302(-114619782);
			Class556.method6584(1543503116);
		}
	}

	static void method2887() {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(1311314905) == 1)
			Class204.aClass602_2411.method7076(new Class598((Class569.aClass569_6389), null), -1246794941);
		else {
			client.aClass613_8605.method7302(-270699916);
			Class556.method6584(-1493889363);
		}
	}

	static final void method2888(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt892 = 149989966;
		class73.aClass399_908 = null;
		class73.anInt803 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 771890247;
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class309.method4043(-1718435171 * class73.selfId, 2113844478);
	}

	public static void method2889(Class572_Sub15_Sub2 class572_sub15_sub2, int i) {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) Class256.aClass675_2765.method7932((byte) 50);
		if (class572_sub6 != null) {
			int i_21_ = -1585139053 * class572_sub15_sub2.o;
			class572_sub15_sub2.writeInt((-2010197365 * (((Class572_Sub6) class572_sub6).anInt9069)), -1743753997);
			for (int i_22_ = 0; (i_22_ < ((Class572_Sub6) class572_sub6).anInt9064 * -524685311); i_22_++) {
				if (((Class572_Sub6) class572_sub6).anIntArray9066[i_22_] != 0)
					class572_sub15_sub2.writeByte((((Class572_Sub6) class572_sub6).anIntArray9066[i_22_]), -1384395473);
				else {
					try {
						int i_23_ = (((Class572_Sub6) class572_sub6).anIntArray9065[i_22_]);
						if (0 == i_23_) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_22_]);
							int i_24_ = field.getInt(null);
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_24_, -1743753997);
						} else if (i_23_ == 1) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_22_]);
							field.setInt(null, (((Class572_Sub6) class572_sub6).anIntArray9068[i_22_]));
							class572_sub15_sub2.writeByte(0, -1384395473);
						} else if (i_23_ == 2) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_22_]);
							int i_25_ = field.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_25_, -1743753997);
						}
						if (3 == i_23_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_22_]);
							byte[][] is = (((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_22_]);
							Object[] objects = new Object[is.length];
							for (int i_26_ = 0; i_26_ < is.length; i_26_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_26_])));
								objects[i_26_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class572_sub15_sub2.writeByte(0, -1384395473);
							else if (object instanceof Number) {
								class572_sub15_sub2.writeByte(1, -1384395473);
								class572_sub15_sub2.method8514(((Number) object).longValue());
							} else if (object instanceof String) {
								class572_sub15_sub2.writeByte(2, -1384395473);
								class572_sub15_sub2.writeString((String) object, (byte) -17);
							} else
								class572_sub15_sub2.writeByte(4, -1384395473);
						} else if (4 == i_23_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_22_]);
							int i_27_ = method.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_27_, -1743753997);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class572_sub15_sub2.writeByte(-10, -1384395473);
					} catch (InvalidClassException invalidclassexception) {
						class572_sub15_sub2.writeByte(-11, -1384395473);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class572_sub15_sub2.writeByte(-12, -1384395473);
					} catch (OptionalDataException optionaldataexception) {
						class572_sub15_sub2.writeByte(-13, -1384395473);
					} catch (IllegalAccessException illegalaccessexception) {
						class572_sub15_sub2.writeByte(-14, -1384395473);
					} catch (IllegalArgumentException illegalargumentexception) {
						class572_sub15_sub2.writeByte(-15, -1384395473);
					} catch (InvocationTargetException invocationtargetexception) {
						class572_sub15_sub2.writeByte(-16, -1384395473);
					} catch (SecurityException securityexception) {
						class572_sub15_sub2.writeByte(-17, -1384395473);
					} catch (IOException ioexception) {
						class572_sub15_sub2.writeByte(-18, -1384395473);
					} catch (NullPointerException nullpointerexception) {
						class572_sub15_sub2.writeByte(-19, -1384395473);
					} catch (Exception exception) {
						class572_sub15_sub2.writeByte(-20, -1384395473);
					} catch (Throwable throwable) {
						class572_sub15_sub2.writeByte(-21, -1384395473);
					}
				}
			}
			class572_sub15_sub2.method8521(i_21_, 1800211053);
			class572_sub6.method6794((byte) -29);
		}
	}

	static final void method2890(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class193.method2921(class73, class83, class441, (byte) -97);
	}
}
