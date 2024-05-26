package game;

/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class125 implements Interface8 {
	Class54 this$0;

	void method2206(Interface58 interface58, int i) {
		Iterator iterator = ((Class125) this).this$0.method930((byte) 45).iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			if (class603.method7103(219562056) == interface58) {
				class603.method7131(2113151607);
				iterator.remove();
			}
		}
	}

	public void method46(Object object, int i) {
		method2206((Interface58) object, -482873626);
	}

	public void method49(Object object) {
		method2206((Interface58) object, -1209505152);
	}

	public void method48(Object object) {
		method2206((Interface58) object, -1915810806);
	}

	public void method47(Object object) {
		method2206((Interface58) object, -1898425553);
	}

	public void method50(Object object) {
		method2206((Interface58) object, -1616278881);
	}

	Class125(Class54 class54) {
		((Class125) this).this$0 = class54;
	}

	public static Class292 method2207(RSByteBuffer class572_sub15, int i) {
		int i_0_ = class572_sub15.readInt(940442212);
		return new Class292(i_0_);
	}

	static final void method2208(Cs2Executor class441, int i) {
		Class266.method3632((String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]), false, false, -1911312361);
	}

	static char method2209(char c, int i) {
		switch (c) {
			default:
				return Character.toLowerCase(c);
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '#':
			case '[':
			case ']':
				return c;
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			case '\u00ff':
			case '\u0178':
				return 'y';
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00df':
				return 'b';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
		}
	}

	static final void method2210(int i, byte i_1_) {
		client.anIntArray8701 = new int[i];
		client.anIntArray8716 = new int[i];
		client.anIntArray8717 = new int[i];
		client.anIntArray8718 = new int[i];
		client.anIntArray8719 = new int[i];
	}

	public static int method2211(Class230 class230, int i) {
		Class240 class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
		class240.method3288(class230);
		double d = 1.5707963267948966 - Math.acos((double) class240.aFloat2656);
		class240.method3261();
		if (d < 0.0)
			d = 3.141592653589793 + (3.141592653589793 + d);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	static final void method2212(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_2_ - i_3_;
	}

	static void method2213(InterfaceDefinitions class73, Class71 class71, int i, int i_4_, int i_5_, int i_6_, int i_7_, long l) {
		int i_8_ = i_5_ * i_5_ + i_6_ * i_6_;
		if ((long) i_8_ <= l) {
			int i_9_;
			if (1 == Class18.anInt143 * 625220759)
				i_9_ = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) + client.anInt8766 * -777638353) & 0x3fff;
			else if (6 == 625220759 * Class18.anInt143)
				i_9_ = (int) client.aFloat8678 & 0x3fff;
			else
				i_9_ = ((int) client.aFloat8678 + client.anInt8766 * -777638353 & 0x3fff);
			int i_10_ = Class325.anIntArray4103[i_9_];
			int i_11_ = Class325.anIntArray4105[i_9_];
			if (625220759 * Class18.anInt143 != 6) {
				i_10_ = 256 * i_10_ / (client.anInt8670 * -1034566343 + 256);
				i_11_ = i_11_ * 256 / (-1034566343 * client.anInt8670 + 256);
			}
			int i_12_ = i_5_ * i_11_ + i_6_ * i_10_ >> 14;
			int i_13_ = i_6_ * i_11_ - i_10_ * i_5_ >> 14;
			Class161 class161 = Class572_Sub40.aClass161Array9402[i_7_];
			int i_14_ = class161.method2587();
			int i_15_ = class161.method2588();
			int i_16_ = i_12_ + class73.anInt764 * 669238293 / 2 - i_14_ / 2;
			int i_17_ = i_14_ + i_16_;
			int i_18_ = -i_13_ + class73.anInt765 * 1360982075 / 2 - i_15_;
			int i_19_ = i_15_ + i_18_;
			boolean bool;
			if (null != class71)
				bool = (!class71.method1081(i_16_, i_18_, 1227103138) || !class71.method1081(i_17_, i_18_, -45902037) || !class71.method1081(i_16_, i_19_, -755975349) || !class71.method1081(i_17_, i_19_, -12965212));
			else {
				int i_20_ = i_15_;
				int i_21_ = i_14_ / 2;
				bool = (i_18_ <= -i_20_ || i_19_ >= 1360982075 * class73.anInt765 || i_16_ <= -i_21_ || i_17_ >= i_21_ + class73.anInt764 * 669238293);
			}
			if (bool) {
				double d = Math.atan2((double) i_12_, (double) i_13_);
				double d_22_ = Math.atan2((double) Math.abs(i_12_), (double) Math.abs(i_13_));
				double d_23_ = Math.atan2((double) (class73.anInt764 * 669238293 / 2), (double) (1360982075 * class73.anInt765 / 2));
				boolean bool_24_ = false;
				double d_25_ = 0.0;
				int i_26_;
				if (d_22_ < d_23_) {
					d_25_ = 1.5707963267948966 - d;
					i_26_ = 1360982075 * class73.anInt765 / 2;
				} else {
					d_25_ = d;
					i_26_ = class73.anInt764 * 669238293 / 2;
				}
				int i_27_ = Math.abs((int) -((double) i_26_ * Math.sin(1.5707963267948966) / Math.sin(d_25_)));
				Class80.aClass161Array1075[i_7_].method2621(((float) i + (float) (669238293 * class73.anInt764) / 2.0F + 0.0F), ((float) i_4_ + (float) (1360982075 * class73.anInt765) / 2.0F - 0.0F), ((float) Class80.aClass161Array1075[i_7_].method45() / 2.0F), (float) i_27_, 4096, (int) (65535.0 * (-d / 6.283185307179586)));
			} else if (null != class71)
				class161.method2596(i_16_ + i, i_18_ + i_4_, class71.aClass167_709, i, i_4_);
			else
				class161.method2595(i_16_ + i, i_4_ + i_18_);
		}
	}
}
