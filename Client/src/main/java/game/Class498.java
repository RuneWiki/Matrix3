package game;

/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class498 implements Interface52 {
	static Class498 aClass498_5506;
	static Class498 aClass498_5507;
	static Class498 aClass498_5508 = new Class498(0);
	int anInt5509;
	static int anInt5510;
	public static Class248 aClass248_5511;

	public int method43() {
		return -1676655779 * ((Class498) this).anInt5509;
	}

	public int getId(int i) {
		return -1676655779 * ((Class498) this).anInt5509;
	}

	static {
		aClass498_5507 = new Class498(1);
		aClass498_5506 = new Class498(2);
	}

	public int method45() {
		return -1676655779 * ((Class498) this).anInt5509;
	}

	Class498(int i) {
		((Class498) this).anInt5509 = i * 872229109;
	}

	public int method143() {
		return -1676655779 * ((Class498) this).anInt5509;
	}

	public int method61() {
		return -1676655779 * ((Class498) this).anInt5509;
	}

	static void method5942(String[] strings, short[] is, int i, int i_0_, byte i_1_) {
		if (i < i_0_) {
			int i_2_ = (i + i_0_) / 2;
			int i_3_ = i;
			String string = strings[i_2_];
			strings[i_2_] = strings[i_0_];
			strings[i_0_] = string;
			short i_4_ = is[i_2_];
			is[i_2_] = is[i_0_];
			is[i_0_] = i_4_;
			for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
				if (null == string || (strings[i_5_] != null && strings[i_5_].compareTo(string) < (i_5_ & 0x1))) {
					String string_6_ = strings[i_5_];
					strings[i_5_] = strings[i_3_];
					strings[i_3_] = string_6_;
					short i_7_ = is[i_5_];
					is[i_5_] = is[i_3_];
					is[i_3_++] = i_7_;
				}
			}
			strings[i_0_] = strings[i_3_];
			strings[i_3_] = string;
			is[i_0_] = is[i_3_];
			is[i_3_] = i_4_;
			method5942(strings, is, i, i_3_ - 1, (byte) -4);
			method5942(strings, is, 1 + i_3_, i_0_, (byte) 11);
		}
	}

	public static void method5943(int i, String string, boolean bool, int i_8_) {
		if (i == 0) {
			Class272_Sub2.aClass106_9517 = Class435.method5263(0, client.aCanvas7745, Class456_Sub1_Sub3_Sub2.aClass94_11589, Class274.anInterface5_2910, Class583.aClass318_7731, Class224_Sub1.aClass307_9491, Class428.aClass304_5021, Class423_Sub2.aClass248_9761, Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(1382831902) * 2, 2055243899);
			if (string != null) {
				Class272_Sub2.aClass106_9517.method1719(1, 0);
				Class284 class284 = Class549_Sub1.method8097(Class88.aClass248_1226, Class1.anInt9 * -901270193, 0, 707569257);
				Class102 class102 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2573(Class582.aClass248_7725, -901270193 * Class1.anInt9, 0), true));
				Class107.method2060(-1234938461);
				Class677.method7987(string, true, Class272_Sub2.aClass106_9517, class102, class284, 949328711);
			}
		} else {
			Class106 class106 = null;
			if (null != string) {
				class106 = Class435.method5263(0, client.aCanvas7745, (Class456_Sub1_Sub3_Sub2.aClass94_11589), Class274.anInterface5_2910, Class583.aClass318_7731, Class224_Sub1.aClass307_9491, Class428.aClass304_5021, Class423_Sub2.aClass248_9761, 0, 2140362469);
				class106.method1719(1, 0);
				Class284 class284 = Class549_Sub1.method8097(Class88.aClass248_1226, -901270193 * Class1.anInt9, 0, 707569257);
				Class102 class102 = (class106.method1751(class284, Class160.method2573(Class582.aClass248_7725, -901270193 * Class1.anInt9, 0), true));
				Class107.method2060(-773896055);
				Class677.method7987(string, true, class106, class102, class284, -188427357);
				try {
					class106.method1666(-1487384833);
					class106 = null;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			try {
				try {
					Class64.method1028(409881644);
					System.gc();
					Class272_Sub2.aClass106_9517 = Class435.method5263(i, client.aCanvas7745, (Class456_Sub1_Sub3_Sub2.aClass94_11589), Class274.anInterface5_2910, Class583.aClass318_7731, Class224_Sub1.aClass307_9491, Class428.aClass304_5021, Class423_Sub2.aClass248_9761, Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(1227142959) * 2, 2010556866);
					if (Class272_Sub2.aClass106_9517.method1671()) {
						boolean bool_9_ = true;
						try {
							bool_9_ = (Class272_Sub1.aClass572_Sub5_9450.anInt9048 * -1590322869) > 256;
						} catch (Throwable throwable) {
							/* empty */
						}
						Class572_Sub35 class572_sub35;
						if (bool_9_)
							class572_sub35 = Class272_Sub2.aClass106_9517.method1739(146800640);
						else
							class572_sub35 = Class272_Sub2.aClass106_9517.method1739(104857600);
						Class272_Sub2.aClass106_9517.method1740(class572_sub35);
					}
				} catch (Throwable throwable) {
					switch (i) {
						case 3:
							Class300.method3993(Class257.aClass257_2770, 1346941470);
							break;
						case 1:
							Class300.method3993(Class257.aClass257_2769, 2002874196);
							break;
					}
					if (throwable instanceof RuntimeException_Sub3) {
						Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.setVolume(0, (byte) 22);
						Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.setVolume(0, (byte) 16);
					}
					int i_10_ = Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1694079504);
					Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205, 0, 535002073);
					if (class106 != null) {
						try {
							class106.method1666(-1883164877);
							class106 = null;
						} catch (Throwable throwable_11_) {
							/* empty */
						}
					}
					Class64.method1028(-336444228);
					System.gc();
					method5943(i_10_, string, bool, -1486752473);
					if (null != class106) {
						try {
							class106.method1666(-1374082351);
						} catch (Throwable throwable_12_) {
							/* empty */
						}
					}
					return;
				}
				if (null != class106) {
					try {
						class106.method1666(-1798064037);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception object) {
				if (null != class106) {
					try {
						class106.method1666(-1236876465);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (bool)
			Class213.aClass572_Sub24_2463.method8612((Class213.aClass572_Sub24_2463.aClass665_Sub30_9205), !bool, (byte) -53);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9205), i, 1715406546);
		if (!bool)
			Class213.aClass572_Sub24_2463.method8612((Class213.aClass572_Sub24_2463.aClass665_Sub30_9205), !bool, (byte) 38);
		Class59.method1006(150664787);
		Class272_Sub2.aClass106_9517.method1754(20000);
		Class272_Sub2.aClass106_9517.method1783(32);
		client.aClass613_8605.method7300(180940374);
		if (Class272_Sub2.aClass106_9517.method1675())
			Class513.method6088(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921) == 1, -1285333722);
		client.aClass613_8605.method7298(true, 1559942503);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		Class22.method707(-2053109962);
		client.aBool8854 = false;
		client.aBool8599 = true;
		Class467.aClass654Array5257 = null;
		Class272_Sub2.aClass106_9517.method1713(0.0F, 1.0F);
	}

	public static void method5944(Player class456_sub1_sub2_sub3_sub2, int i, int i_13_, byte i_14_) {
		int[] is = new int[4];
		Arrays.fill(is, 0, is.length, i);
		Class565.method6699(class456_sub1_sub2_sub3_sub2, is, i_13_, false, (short) 15511);
	}

	static final void method5945(int i, int i_15_, int i_16_) {
		if (Class569.method6760(i, null, -739539851))
			Class545.method6456((Class534.aClass83Array5975[i].aClass73Array1081), i_15_, 929926198);
	}

	static final void method5946(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class121.method2185(string, -1327832495);
	}
}
