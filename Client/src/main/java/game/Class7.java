package game;

/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class7 {
	static Class675 aClass675_37 = new Class675();
	public static String aString38;

	Class7() throws Throwable {
		throw new Error();
	}

	static void method500() {
		if (Class166.aClass106_2051 != null) {
			Class166.aClass106_2051.method1666(-1187964102);
			Class166.aClass106_2051 = null;
			Class252.aClass102_2732 = null;
		}
	}

	static void method501(Class106 class106) {
		if (aClass675_37.method7927(1345522233) != 0) {
			if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1914671478) == 0) {
				for (Class572_Sub33 class572_sub33 = (Class572_Sub33) aClass675_37.method7932((byte) 50); null != class572_sub33; class572_sub33 = ((Class572_Sub33) aClass675_37.method7926(810874781))) {
					Class672.aClass639_Sub5_8533.method8898(class106, class106, (-1949720269 * ((Class572_Sub33) class572_sub33).anInt9326), (((Class572_Sub33) class572_sub33).anInt9327 * 152046793), (((Class572_Sub33) class572_sub33).anInt9328 * -2073853737), (752265759 * ((Class572_Sub33) class572_sub33).anInt9331), false, false, (1372212147 * ((Class572_Sub33) class572_sub33).anInt9330), Class298.aClass102_3481, (((Class572_Sub33) class572_sub33).aBool9329 ? (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831) : null), JS5ConfigGroup.aClass484_2593, (short) -17365);
					class572_sub33.method6794((byte) -78);
				}
				Class54.method987((byte) 109);
			} else {
				if (null == Class166.aClass106_2051) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class166.aClass106_2051 = Class435.method5263(0, canvas, (Class456_Sub1_Sub3_Sub2.aClass94_11589), Class274.anInterface5_2910, Class583.aClass318_7731, Class224_Sub1.aClass307_9491, Class428.aClass304_5021, Class423_Sub2.aClass248_9761, 0, 2038041134);
					Class252.aClass102_2732 = (Class166.aClass106_2051.method1751(Class549_Sub1.method8097(Class88.aClass248_1226, (-1060508549 * Class1.anInt14), 0, 707569257), Class160.method2573(Class582.aClass248_7725, -1060508549 * Class1.anInt14, 0), true));
				}
				for (Class572_Sub33 class572_sub33 = (Class572_Sub33) aClass675_37.method7932((byte) 50); null != class572_sub33; class572_sub33 = ((Class572_Sub33) aClass675_37.method7926(976490775))) {
					Class672.aClass639_Sub5_8533.method8898(Class166.aClass106_2051, class106, (-1949720269 * ((Class572_Sub33) class572_sub33).anInt9326), (152046793 * ((Class572_Sub33) class572_sub33).anInt9327), (((Class572_Sub33) class572_sub33).anInt9328 * -2073853737), (752265759 * ((Class572_Sub33) class572_sub33).anInt9331), false, false, (1372212147 * ((Class572_Sub33) class572_sub33).anInt9330), Class252.aClass102_2732, (((Class572_Sub33) class572_sub33).aBool9329 ? (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831) : null), JS5ConfigGroup.aClass484_2593, (short) -23923);
					class572_sub33.method6794((byte) 31);
				}
			}
		}
	}

	static void method502() {
		if (Class166.aClass106_2051 != null) {
			Class166.aClass106_2051.method1666(-2084312683);
			Class166.aClass106_2051 = null;
			Class252.aClass102_2732 = null;
		}
	}

	static void method503() {
		if (Class166.aClass106_2051 != null) {
			Class166.aClass106_2051.method1666(-1313868043);
			Class166.aClass106_2051 = null;
			Class252.aClass102_2732 = null;
		}
	}

	static void method504() {
		if (Class166.aClass106_2051 != null) {
			Class166.aClass106_2051.method1666(-1177378821);
			Class166.aClass106_2051 = null;
			Class252.aClass102_2732 = null;
		}
	}

	static void method505() {
		if (Class166.aClass106_2051 != null) {
			Class166.aClass106_2051.method1666(-1892442199);
			Class166.aClass106_2051 = null;
			Class252.aClass102_2732 = null;
		}
	}

	public static void method506(int i, int i_0_) {
		Class572_Sub12_Sub2.aBoolArray11253[i] = false;
		VarDefinition.method2774(i, (byte) -83);
	}

	static void method507(String[] strings, int[] is, int i, int i_1_, int i_2_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			String string = strings[i_3_];
			strings[i_3_] = strings[i_1_];
			strings[i_1_] = string;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
				if (null == string || (strings[i_6_] != null && strings[i_6_].compareTo(string) < (i_6_ & 0x1))) {
					String string_7_ = strings[i_6_];
					strings[i_6_] = strings[i_4_];
					strings[i_4_] = string_7_;
					int i_8_ = is[i_6_];
					is[i_6_] = is[i_4_];
					is[i_4_++] = i_8_;
				}
			}
			strings[i_1_] = strings[i_4_];
			strings[i_4_] = string;
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			method507(strings, is, i, i_4_ - 1, -1359086429);
			method507(strings, is, i_4_ + 1, i_1_, -1359086429);
		}
	}

	static final void method508(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -206200320) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray776 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method509(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class47.method842(string, true, -1042067865);
	}

	static final void method510(Cs2Executor class441, short i) {
		Class414.method5085(-2024590480);
	}

	public static void method511(int i, int i_9_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(11, (long) i);
		class572_sub12_sub11.method10384(-1849355185);
	}

	static final void method512(Cs2Executor class441, byte i) {
		throw new RuntimeException("");
	}
}
