package game;

/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class639 implements Interface18 {
	Class127 aClass127_8282;
	JS5ConfigGroup aClass220_8283;
	public int anInt8284;
	Class248 aClass248_8285;
	protected Interface72 anInterface72_8286;

	public Interface17 getDefinition(int i, int i_0_) {
		Interface17 interface17;
		synchronized (((Class639) this).aClass127_8282) {
			interface17 = (Interface17) ((Class639) this).aClass127_8282.method2246((long) i);
		}
		if (interface17 != null)
			return interface17;
		interface17 = method7568(i, -722956270);
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2229(interface17, (long) i);
		}
		return interface17;
	}

	Interface17 method7568(int i, int i_1_) {
		byte[] is;
		synchronized (((Class639) this).aClass248_8285) {
			is = MapSize.method1543(((Class639) this).aClass248_8285, ((Class639) this).aClass220_8283, i, 599434869);
		}
		Interface17 interface17 = anInterface72_8286.method458(i, this, 135196642);
		if (null != is)
			interface17.method109(new RSByteBuffer(is), -1458298931);
		interface17.method104((byte) 47);
		return interface17;
	}

	public void method7569(int i, int i_2_) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -119);
			((Class639) this).aClass127_8282 = new Class127(i);
		}
	}

	public void method7570() {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -9);
		}
	}

	public void method7571(int i) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -52);
		}
	}

	public void method7572(int i, short i_3_) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2235(i, 1972767364);
		}
	}

	public void method7573(int i) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2234((byte) -60);
		}
	}

	public void method7574(int i) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -101);
			((Class639) this).aClass127_8282 = new Class127(i);
		}
	}

	public Interface17 method114(int i) {
		Interface17 interface17;
		synchronized (((Class639) this).aClass127_8282) {
			interface17 = (Interface17) ((Class639) this).aClass127_8282.method2246((long) i);
		}
		if (interface17 != null)
			return interface17;
		interface17 = method7568(i, -722956270);
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2229(interface17, (long) i);
		}
		return interface17;
	}

	Class639(Class437 class437, Class435 class435, Class248 class248, JS5ConfigGroup jS5ConfigGroup, int i, Interface72 interface72) {
		((Class639) this).aClass248_8285 = class248;
		((Class639) this).aClass220_8283 = jS5ConfigGroup;
		anInterface72_8286 = interface72;
		anInt8284 = Class241.method3324(((Class639) this).aClass248_8285, ((Class639) this).aClass220_8283, 2141346985) * -183956823;
		((Class639) this).aClass127_8282 = new Class127(i);
	}

	public void method7575() {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -18);
		}
	}

	public void method7576() {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2234((byte) 93);
		}
	}

	public void method7577() {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -105);
		}
	}

	public void method7578() {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2234((byte) 31);
		}
	}

	public int method45() {
		return 1292974489 * anInt8284;
	}

	public Iterator method7579() {
		return new Class253(this);
	}

	public int method113(byte i) {
		return 1292974489 * anInt8284;
	}

	public Iterator iterator() {
		return new Class253(this);
	}

	public void method7580(int i) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2235(i, 2050449065);
		}
	}

	public void method7581(int i) {
		synchronized (((Class639) this).aClass127_8282) {
			((Class639) this).aClass127_8282.method2231((byte) -90);
			((Class639) this).aClass127_8282 = new Class127(i);
		}
	}

	static void method7582(Class106 class106, short i) {
		if (Class672.method7894((byte) -101) && Class600.method7060((byte) -100))
			Class371.method4605(0, 0, 1960824389 * Class269.anInt2861, 350, 1387212887);
		class106.method1715(0, 0, Class269.anInt2861 * 1960824389, 350);
		class106.method1725(0, 0, Class269.anInt2861 * 1960824389, 350, 1535643091 * Class190.anInt2243 << 24 | 0x332277, 1);
		if (Class190.aBool2239) {
			for (int i_4_ = 0; i_4_ < 100; i_4_++) {
				int i_5_ = Class672.anIntArray8532[i_4_] >> 4;
				int i_6_ = Class8.anIntArray42[i_4_] >> 4;
				i_5_ += (Class325.anIntArray4103[(i_6_ + (i_5_ & 0x40)) * 64 & 0x3fff]) >> 10;
				if (i_5_ >= 0 && i_5_ >> 1 < Class572_Sub12_Sub6.anIntArray11366.length && (Class572_Sub12_Sub6.anIntArray11366[i_5_ >> 1] >> 2 < 350 - i_6_))
					class106.method1725(i_5_, i_6_, 2, 2, (Class190.anIntArray2234[i_4_] << 24 | 0xffffff), 1);
			}
			for (int i_7_ = 0; i_7_ < Class572_Sub12_Sub6.anIntArray11366.length; i_7_++) {
				int i_8_ = Class572_Sub12_Sub6.anIntArray11366[i_7_] >> 2;
				class106.method1725(i_7_ << 1, 350 - i_8_, 2, i_8_, -2130706433, 1);
			}
		}
		int i_9_ = 350 / (Class452_Sub1.anInt8933 * -1236443197);
		if (Class190.anInt2232 * -1750491771 > 0) {
			int i_10_ = 346 - -1236443197 * Class452_Sub1.anInt8933 - 4;
			int i_11_ = i_9_ * i_10_ / (-1750491771 * Class190.anInt2232 + i_9_ - 1);
			int i_12_ = 4;
			if (Class190.anInt2232 * -1750491771 > 1)
				i_12_ += ((i_10_ - i_11_) * (-1750491771 * Class190.anInt2232 - 1 - 2143380251 * Class190.anInt2233) / (Class190.anInt2232 * -1750491771 - 1));
			class106.method1725(Class269.anInt2861 * 1960824389 - 16, i_12_, 12, i_11_, (Class190.anInt2243 * 1535643091 << 24 | 0x332277), 2);
			for (int i_13_ = 2143380251 * Class190.anInt2233; (i_13_ < 2143380251 * Class190.anInt2233 + i_9_ && i_13_ < Class190.anInt2232 * -1750491771); i_13_++) {
				String[] strings = Class104_Sub2.method9935((LinkableInt.aStringArray9257[i_13_]), '\010', 207597699);
				int i_14_ = ((Class269.anInt2861 * 1960824389 - 8 - 16) / strings.length);
				for (int i_15_ = 0; i_15_ < strings.length; i_15_++) {
					int i_16_ = 8 + i_15_ * i_14_;
					class106.method1715(i_16_, 0, i_14_ + i_16_ - 8, 350);
					Class512.aClass102_5703.method1620(Class185.method2835(strings[i_15_], (byte) 7), i_16_, (350 - Class253.anInt2734 * 977079579 - 2 - Class26.aClass284_215.anInt3413 * -2086019023 - ((i_13_ - 2143380251 * Class190.anInt2233) * (Class452_Sub1.anInt8933 * -1236443197))), -1, -16777216, 1420650781);
				}
			}
		}
		Class298.aClass102_3481.method1611("831 1", (1960824389 * Class269.anInt2861 - 25), 330, -1, -16777216, 672942825);
		class106.method1715(0, 0, 1960824389 * Class269.anInt2861, 350);
		class106.method1722(0, 350 - Class253.anInt2734 * 977079579, Class269.anInt2861 * 1960824389, -1, (byte) 83);
		Class1.aClass102_16.method1620(new StringBuilder().append("--> ").append(Class185.method2835(Class190.aString2235, (byte) 7)).toString(), 10, 350 - -2086019023 * Class318.aClass284_3875.anInt3413 - 1, -1, -16777216, 637974063);
		if (Class408.aBool4780) {
			int i_17_ = -1;
			if (client.cycles % 30 > 15)
				i_17_ = 16777215;
			class106.method1868((10 + (Class318.aClass284_3875.method3832(new StringBuilder().append("--> ").append(Class185.method2835(Class190.aString2235, (byte) 7).substring(0, -1460791607 * Class190.anInt2237)).toString(), (byte) 100))), 350 - Class318.aClass284_3875.anInt3413 * -2086019023 - 11, 12, i_17_, -1599870737);
		}
		class106.method1714();
		Class257.method3542((byte) -31);
	}

	static final void method7583(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_18_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		if (!Class375_Sub1_Sub1.method10162(i_18_, bool, (short) 308))
			throw new RuntimeException();
	}

	static final void method7584(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_19_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_20_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_21_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		long l = Class13.method619(0, 0, 12, i_19_, i_20_, i_21_, 88725793);
		int i_22_ = Class9.method532(l);
		if (i_21_ < 1970)
			i_22_--;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_22_;
	}

	public static final void method7585(int i) {
		if (!client.aBool8681) {
			client.aFloat8660 += (12.0F - client.aFloat8660) / 2.0F;
			client.aBool8685 = true;
			client.aBool8681 = true;
		}
	}

	static void method7586(InterfaceDefinitions[] class73s, InterfaceDefinitions class73, boolean bool, int i) {
		int i_23_ = (class73.anInt802 * 722211665 != 0 ? 722211665 * class73.anInt802 : 669238293 * class73.anInt764);
		int i_24_ = (class73.anInt902 * 382019713 != 0 ? 382019713 * class73.anInt902 : 1360982075 * class73.anInt765);
		Class133_Sub3.method9337(class73s, -1718435171 * class73.selfId, i_23_, i_24_, bool, 1961199955);
		if (null != class73.aClass73Array917)
			Class133_Sub3.method9337(class73.aClass73Array917, -1718435171 * class73.selfId, i_23_, i_24_, bool, 2124834753);
		Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.get((long) (-1718435171 * class73.selfId)));
		if (null != class572_sub29)
			Class287.method3879(493419501 * class572_sub29.anInt9301, i_23_, i_24_, bool, 911483815);
		if (class73 == client.aClass73_8880) {
			int i_25_ = Class184.anInt2163 * 1657484935;
			int[] is = Class184.anIntArray2154;
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_26_]];
				if (null != class456_sub1_sub2_sub3_sub2)
					class456_sub1_sub2_sub3_sub2.method10540(i_23_, i_24_, bool, (byte) 6);
			}
			for (int i_27_ = 0; i_27_ < client.anInt8625 * 765313669; i_27_++) {
				int i_28_ = client.anIntArray8626[i_27_];
				LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_28_));
				if (class572_sub9 != null)
					((Entity) class572_sub9.anObject9081).method10540(i_23_, i_24_, bool, (byte) -17);
			}
		}
	}

	public static void method7587(int i, boolean bool, int i_29_, boolean bool_30_, int i_31_) {
		Class12.method567(0, Class633.aClass481_Sub1Array8207.length - 1, i, bool, i_29_, bool_30_, (byte) -98);
		Class633.anInt8206 = 0;
		Class633.aClass461_8201 = null;
	}

	static final void method7588(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		if (-1 == -1665128073 * ((UnderlayDefinition) underlayDefinition).aClass73_5135.activeComponent) {
			if (((Cs2Executor) class441).aBool5128)
				throw new RuntimeException("");
			throw new RuntimeException("");
		}
		InterfaceDefinitions class73 = underlayDefinition.method5283(-2112904432);
		class73.aClass73Array916[(((UnderlayDefinition) underlayDefinition).aClass73_5135.activeComponent * -1665128073)] = null;
		Class555.method6575(class73, (short) 20523);
	}
}
