package game;

/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class Class676 implements Iterable {
	int anInt8548 = 0;
	Class572[] aClass572Array8549;
	long aLong8550;
	Class572 aClass572_8551;
	Class572 aClass572_8552;
	int anInt8553;

	public int method7962(byte i) {
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < ((Class676) this).anInt8553 * 1786127235; i_1_++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i_1_];
			for (Class572 class572_2_ = class572.aClass572_6433; class572_2_ != class572; class572_2_ = class572_2_.aClass572_6433)
				i_0_++;
		}
		return i_0_;
	}

	public Class572 get(long l) {
		((Class676) this).aLong8550 = l * 1302313183407930441L;
		Class572 class572 = (((Class676) this).aClass572Array8549[(int) (l & (long) (1786127235 * ((Class676) this).anInt8553 - 1))]);
		for (((Class676) this).aClass572_8551 = class572.aClass572_6433; class572 != ((Class676) this).aClass572_8551; ((Class676) this).aClass572_8551 = ((Class676) this).aClass572_8551.aClass572_6433) {
			if (l == (((Class676) this).aClass572_8551.hash * 381237825124074065L)) {
				Class572 class572_3_ = ((Class676) this).aClass572_8551;
				((Class676) this).aClass572_8551 = ((Class676) this).aClass572_8551.aClass572_6433;
				return class572_3_;
			}
		}
		((Class676) this).aClass572_8551 = null;
		return null;
	}

	public void method7964(byte i) {
		for (int i_4_ = 0; i_4_ < ((Class676) this).anInt8553 * 1786127235; i_4_++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i_4_];
			for (;;) {
				Class572 class572_5_ = class572.aClass572_6433;
				if (class572 == class572_5_)
					break;
				class572_5_.method6794((byte) 83);
			}
		}
		((Class676) this).aClass572_8551 = null;
		((Class676) this).aClass572_8552 = null;
	}

	public int method7965(Class572[] class572s, byte i) {
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < ((Class676) this).anInt8553 * 1786127235; i_7_++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i_7_];
			for (Class572 class572_8_ = class572.aClass572_6433; class572_8_ != class572; class572_8_ = class572_8_.aClass572_6433)
				class572s[i_6_++] = class572_8_;
		}
		return i_6_;
	}

	public void put(Class572 class572, long l) {
		if (class572.aClass572_6431 != null)
			class572.method6794((byte) 19);
		Class572 class572_9_ = (((Class676) this).aClass572Array8549[(int) (l & (long) (1786127235 * ((Class676) this).anInt8553 - 1))]);
		class572.aClass572_6431 = class572_9_.aClass572_6431;
		class572.aClass572_6433 = class572_9_;
		class572.aClass572_6431.aClass572_6433 = class572;
		class572.aClass572_6433.aClass572_6431 = class572;
		class572.hash = l * 8535728873556543153L;
	}

	public Class676(int i) {
		((Class676) this).anInt8553 = -2125167829 * i;
		((Class676) this).aClass572Array8549 = new Class572[i];
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i_10_] = new Class572();
			class572.aClass572_6433 = class572;
			class572.aClass572_6431 = class572;
		}
	}

	public void method7967() {
		for (int i = 0; i < ((Class676) this).anInt8553 * 1786127235; i++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i];
			for (;;) {
				Class572 class572_11_ = class572.aClass572_6433;
				if (class572 == class572_11_)
					break;
				class572_11_.method6794((byte) -25);
			}
		}
		((Class676) this).aClass572_8551 = null;
		((Class676) this).aClass572_8552 = null;
	}

	public Class572 method7968(byte i) {
		((Class676) this).anInt8548 = 0;
		return method7969(1924150924);
	}

	public Class572 method7969(int i) {
		if (-75398457 * ((Class676) this).anInt8548 > 0 && (((Class676) this).aClass572_8552 != (((Class676) this).aClass572Array8549[-75398457 * ((Class676) this).anInt8548 - 1]))) {
			Class572 class572 = ((Class676) this).aClass572_8552;
			((Class676) this).aClass572_8552 = class572.aClass572_6433;
			return class572;
		}
		while (((Class676) this).anInt8548 * -75398457 < ((Class676) this).anInt8553 * 1786127235) {
			Class572 class572 = (((Class676) this).aClass572Array8549[((((Class676) this).anInt8548 += -1978884361) * -75398457 - 1)].aClass572_6433);
			if (class572 != (((Class676) this).aClass572Array8549[((Class676) this).anInt8548 * -75398457 - 1])) {
				((Class676) this).aClass572_8552 = class572.aClass572_6433;
				return class572;
			}
		}
		return null;
	}

	public Iterator method7970() {
		return new Class629(this);
	}

	public Class572 method7971(byte i) {
		if (null == ((Class676) this).aClass572_8551)
			return null;
		for (Class572 class572 = (((Class676) this).aClass572Array8549[(int) (((Class676) this).aLong8550 * -4131959698444896775L & (long) (1786127235 * ((Class676) this).anInt8553 - 1))]); ((Class676) this).aClass572_8551 != class572; ((Class676) this).aClass572_8551 = ((Class676) this).aClass572_8551.aClass572_6433) {
			if (((Class676) this).aLong8550 * -4131959698444896775L == (381237825124074065L * ((Class676) this).aClass572_8551.hash)) {
				Class572 class572_12_ = ((Class676) this).aClass572_8551;
				((Class676) this).aClass572_8551 = ((Class676) this).aClass572_8551.aClass572_6433;
				return class572_12_;
			}
		}
		((Class676) this).aClass572_8551 = null;
		return null;
	}

	public int method7972() {
		int i = 0;
		for (int i_13_ = 0; i_13_ < ((Class676) this).anInt8553 * 1786127235; i_13_++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i_13_];
			for (Class572 class572_14_ = class572.aClass572_6433; class572_14_ != class572; class572_14_ = class572_14_.aClass572_6433)
				i++;
		}
		return i;
	}

	public void method7973() {
		for (int i = 0; i < ((Class676) this).anInt8553 * 1786127235; i++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i];
			for (;;) {
				Class572 class572_15_ = class572.aClass572_6433;
				if (class572 == class572_15_)
					break;
				class572_15_.method6794((byte) 3);
			}
		}
		((Class676) this).aClass572_8551 = null;
		((Class676) this).aClass572_8552 = null;
	}

	public Iterator iterator() {
		return new Class629(this);
	}

	public void method7974() {
		for (int i = 0; i < ((Class676) this).anInt8553 * 1786127235; i++) {
			Class572 class572 = ((Class676) this).aClass572Array8549[i];
			for (;;) {
				Class572 class572_16_ = class572.aClass572_6433;
				if (class572 == class572_16_)
					break;
				class572_16_.method6794((byte) -9);
			}
		}
		((Class676) this).aClass572_8551 = null;
		((Class676) this).aClass572_8552 = null;
	}

	static final void method7975(Cs2Executor class441, int i) {
		int i_17_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub7_9227.method7863(i_17_, -1291682459);
	}

	static final void method7976(int i) {
		int[] is = Class184.anIntArray2154;
		for (int i_18_ = 0; i_18_ < 1657484935 * Class184.anInt2163; i_18_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_18_]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				class456_sub1_sub2_sub3_sub2.method10532(-1241392093);
		}
		for (int i_19_ = 0; i_19_ < 765313669 * client.anInt8625; i_19_++) {
			long l = (long) client.anIntArray8626[i_19_];
			LinkableObject class572_sub9 = (LinkableObject) client.aClass676_8622.get(l);
			if (null != class572_sub9)
				((Entity) class572_sub9.anObject9081).method10532(208208371);
		}
		if (4 == 1797623853 * client.anInt8646) {
			for (int i_20_ = 0; i_20_ < Class122.aClass130Array1483.length; i_20_++) {
				Class130 class130 = Class122.aClass130Array1483[i_20_];
				if (class130.aBool1529)
					class130.method2268(1991198579).method10532(1077335102);
			}
		}
	}
}
