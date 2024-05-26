package game;

/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class481 {
	static final int anInt5354 = 8;
	static final int anInt5355 = 2;
	static final int anInt5356 = 4;
	static final int anInt5357 = 1;
	public int anInt5358;
	int anInt5359;
	public int anInt5360;
	public static RSByteBuffer aClass572_Sub15_5361;
	static Class161[] aClass161Array5362;

	public boolean method5719() {
		return (anInt5358 * 39075705 & 0x2) != 0;
	}

	public boolean method5720(byte i) {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public boolean method5721(int i) {
		return (anInt5358 * 39075705 & 0x2) != 0;
	}

	public boolean method5722(int i) {
		return 0 != (anInt5358 * 39075705 & 0x4);
	}

	public boolean method5723(int i) {
		return 0 != (anInt5358 * 39075705 & 0x8);
	}

	public boolean method5724() {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public boolean method5725() {
		return 0 != (anInt5358 * 39075705 & 0x8);
	}

	Class481() {
		/* empty */
	}

	public boolean method5726() {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public boolean method5727() {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public boolean method5728() {
		return (anInt5358 * 39075705 & 0x2) != 0;
	}

	public boolean method5729() {
		return (anInt5358 * 39075705 & 0x2) != 0;
	}

	public boolean method5730() {
		return (anInt5358 * 39075705 & 0x2) != 0;
	}

	public boolean method5731() {
		return 0 != (anInt5358 * 39075705 & 0x4);
	}

	public boolean method5732() {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public boolean method5733() {
		return 0 != (anInt5358 * 39075705 & 0x8);
	}

	public boolean method5734() {
		return (39075705 * anInt5358 & 0x1) != 0;
	}

	public static int method5735(int i, int i_0_, int i_1_, int i_2_) {
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i_0_;
		if (i_1_ == 1)
			return 7 - i;
		if (i_1_ == 2)
			return 7 - i_0_;
		return i;
	}

	static void method5736(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class572_Sub16.method8568(-488481990);
	}

	static boolean method5737(int i, int i_3_) {
		if (i == 9 || i == 10 || 11 == i || 12 == i || i == 13 || i == 1003)
			return true;
		if (i == 8)
			return true;
		return false;
	}

	static final void method5738(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub15_9243, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 2126300771);
		Class623.method7443(-1974200342);
		client.aBool8854 = false;
	}

	public static void method5739(byte i) {
		if (Class465.aClass289_5235 != null) {
			Class465.aClass289_5235.method3895((byte) -88);
			Class465.aClass289_5235 = null;
		}
	}
}
