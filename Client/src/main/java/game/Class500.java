package game;

/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class500 implements Interface52 {
	static Class500 aClass500_5513;
	static Class500 aClass500_5514;
	static Class500 aClass500_5515 = new Class500(0);
	int anInt5516;

	public int method43() {
		return ((Class500) this).anInt5516 * 729579999;
	}

	public int getId(int i) {
		return ((Class500) this).anInt5516 * 729579999;
	}

	public int method143() {
		return ((Class500) this).anInt5516 * 729579999;
	}

	static {
		aClass500_5514 = new Class500(1);
		aClass500_5513 = new Class500(2);
	}

	public int method45() {
		return ((Class500) this).anInt5516 * 729579999;
	}

	Class500(int i) {
		((Class500) this).anInt5516 = 720927263 * i;
	}

	public int method61() {
		return ((Class500) this).anInt5516 * 729579999;
	}

	static void method5948(byte i) {
		synchronized (Class458.aQueue5202) {
			Point point;
			if (Class584.aCanvas7745.isShowing())
				point = Class584.aCanvas7745.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) Class458.aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				if (null == point || !Class584.aCanvas7745.isShowing() || !Class408.aBool4780)
					class572_sub13_sub1.method8421(421222932);
				else {
					class572_sub13_sub1.method10305(point, 2067425090);
					if (!class572_sub13_sub1.method10302(1626632047) && (class572_sub13_sub1.method8417(1636759235) < 1960824389 * Class269.anInt2861) && (class572_sub13_sub1.method8425(-1749784373) < Class584.anInt7739 * -530390519) && class572_sub13_sub1.method8417(1636759235) >= 0 && class572_sub13_sub1.method8425(-1749784373) >= 0) {
						int i_0_ = class572_sub13_sub1.method8416((byte) 10);
						if (class572_sub13_sub1.method8416((byte) 10) == -1)
							Class458.aClass479_Sub2_5207.method5648(class572_sub13_sub1, (byte) 6);
						else if (Class566.method6715(i_0_, (byte) 0))
							Class458.aClass479_Sub2_5207.method8275(class572_sub13_sub1, (byte) 53);
					}
				}
			}
		}
	}

	static final void method5949(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt892 = -1772508733;
		class73.anInt803 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 771890247;
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class309.method4043(-1718435171 * class73.selfId, 349003876);
	}

	public static String method5950(String string, char c, String string_1_, byte i) {
		int i_2_ = string.length();
		int i_3_ = string_1_.length();
		int i_4_ = i_2_;
		int i_5_ = i_3_ - 1;
		if (0 != i_5_) {
			int i_6_ = 0;
			for (;;) {
				i_6_ = string.indexOf(c, i_6_);
				if (i_6_ < 0)
					break;
				i_6_++;
				i_4_ += i_5_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_4_);
		int i_7_ = 0;
		for (;;) {
			int i_8_ = string.indexOf(c, i_7_);
			if (i_8_ < 0)
				break;
			stringbuilder.append(string.substring(i_7_, i_8_));
			stringbuilder.append(string_1_);
			i_7_ = 1 + i_8_;
		}
		stringbuilder.append(string.substring(i_7_));
		return stringbuilder.toString();
	}

	static final void method5951(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_9_, (short) -31322);
		Class83 class83 = Class534.aClass83Array5975[i_9_ >> 16];
		HashTable.method5541(class73, class83, class441, -426805526);
	}

	public static void method5952(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		Class572_Sub34 class572_sub34 = null;
		for (Class572_Sub34 class572_sub34_17_ = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); null != class572_sub34_17_; class572_sub34_17_ = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(842316651))) {
			if (i == (((Class572_Sub34) class572_sub34_17_).anInt9335 * -2045257115) && i_10_ == 163944051 * class572_sub34_17_.anInt9334 && class572_sub34_17_.anInt9332 * 254036161 == i_11_ && (((Class572_Sub34) class572_sub34_17_).anInt9333 * -451769195) == i_12_) {
				class572_sub34 = class572_sub34_17_;
				break;
			}
		}
		if (class572_sub34 == null) {
			class572_sub34 = new Class572_Sub34();
			((Class572_Sub34) class572_sub34).anInt9335 = i * 164513645;
			((Class572_Sub34) class572_sub34).anInt9333 = i_12_ * -1080959299;
			class572_sub34.anInt9334 = i_10_ * 717749947;
			class572_sub34.anInt9332 = 1117538113 * i_11_;
			if (i_10_ >= 0 && i_11_ >= 0 && i_10_ < client.aClass613_8605.method7347(-331294160) && i_11_ < client.aClass613_8605.method7278(277214477))
				Class665_Sub4.method8143(class572_sub34, (short) 1808);
			Class572_Sub34.aClass675_9346.method7940(class572_sub34, -1527958979);
		}
		class572_sub34.anInt9339 = i_13_ * -1212949019;
		((Class572_Sub34) class572_sub34).anInt9341 = -1781233699 * i_14_;
		class572_sub34.anInt9343 = i_15_ * 1259557647;
		((Class572_Sub34) class572_sub34).aBool9340 = true;
		((Class572_Sub34) class572_sub34).aBool9344 = false;
	}
}
