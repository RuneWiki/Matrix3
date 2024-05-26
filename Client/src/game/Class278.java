package game;

/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class278 {
	RSByteBuffer aClass572_Sub15_2928;
	static final int anInt2929 = 100;
	static final int anInt2930 = 3;
	static final int anInt2931 = 512;
	static final int anInt2932 = 5;
	static final int anInt2933 = 5;
	Class664 aClass664_2934 = new Class664();
	Class664 aClass664_2935 = new Class664();
	long aLong2936;
	Class572_Sub12_Sub16_Sub2 aClass572_Sub12_Sub16_Sub2_2937;
	int anInt2938;
	int anInt2939;
	RSByteBuffer aClass572_Sub15_2940;
	byte aByte2941;
	public volatile int anInt2942;
	public volatile int anInt2943;
	public volatile int anInt2944;
	public volatile int anInt2945;
	Class664 aClass664_2946;
	RSByteBuffer aClass572_Sub15_2947;
	Class664 aClass664_2948 = new Class664();
	static final int anInt2949 = 20;

	public boolean method3721() {
		return method3728(-20672493) >= 100;
	}

	Class572_Sub12_Sub16_Sub2 method3722(int i, int i_0_, byte i_1_, boolean bool, int i_2_) {
		long l = (long) i_0_ + ((long) i << 32);
		Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = new Class572_Sub12_Sub16_Sub2();
		class572_sub12_sub16_sub2.aLong9093 = -6500281269670471539L * l;
		((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aByte11736 = i_1_;
		((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aBool11475 = bool;
		if (bool) {
			if (method3728(178296378) >= 100)
				throw new RuntimeException();
			((Class278) this).aClass664_2934.method7842(class572_sub12_sub16_sub2, 2071666912);
		} else {
			if (method3730(502496441) >= 20)
				throw new RuntimeException();
			((Class278) this).aClass664_2948.method7842(class572_sub12_sub16_sub2, 1158234048);
		}
		return class572_sub12_sub16_sub2;
	}

	public boolean method3723(int i) {
		return method3730(502496441) >= 20;
	}

	public abstract void method3724();

	Class278() {
		((Class278) this).aClass664_2946 = new Class664();
		((Class278) this).aClass572_Sub15_2947 = new RSByteBuffer(6);
		((Class278) this).aByte2941 = (byte) 0;
		anInt2942 = 0;
		anInt2943 = 0;
		anInt2944 = -1324952959;
		anInt2945 = 1193851415;
		((Class278) this).aClass572_Sub15_2940 = new RSByteBuffer(5);
		((Class278) this).aClass572_Sub15_2928 = new RSByteBuffer(5);
		((Class278) this).anInt2939 = 0;
		((Class278) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
	}

	public abstract void method3725();

	abstract void method3726(int i, int i_3_, int i_4_);

	public abstract void method3727();

	public int method3728(int i) {
		return (((Class278) this).aClass664_2934.method7844((byte) -75) + ((Class278) this).aClass664_2935.method7844((byte) 5));
	}

	public abstract void method3729(boolean bool, int i);

	int method3730(int i) {
		return (((Class278) this).aClass664_2948.method7844((byte) -37) + ((Class278) this).aClass664_2946.method7844((byte) -109));
	}

	public abstract void method3731(int i);

	public abstract void method3732(int i);

	public boolean method3733() {
		return method3730(502496441) >= 20;
	}

	public boolean method3734() {
		return method3728(89197970) >= 100;
	}

	public boolean method3735() {
		return method3728(1832623415) >= 100;
	}

	public abstract void method3736();

	public int method3737() {
		return (((Class278) this).aClass664_2934.method7844((byte) -39) + ((Class278) this).aClass664_2935.method7844((byte) -125));
	}

	public abstract void method3738(Object object, boolean bool, int i);

	abstract void method3739(int i, int i_5_);

	public abstract void method3740(Object object, boolean bool);

	public abstract void method3741();

	public abstract void method3742(byte i);

	public abstract boolean method3743();

	public abstract void method3744();

	public boolean method3745(int i) {
		return method3728(-985459651) >= 100;
	}

	public abstract void method3746();

	public abstract boolean method3747(int i);

	public abstract boolean method3748();

	public abstract boolean method3749();

	public int method3750() {
		return (((Class278) this).aClass664_2934.method7844((byte) -4) + ((Class278) this).aClass664_2935.method7844((byte) -52));
	}

	public abstract void method3751(boolean bool);

	public abstract void method3752();

	public abstract void method3753();

	static void method3754(Class261 class261, Class250 class250, int i, int i_6_, byte i_7_) {
		if (Class25.aClass250_202 == null)
			Class25.aClass250_202 = new Class250(class250);
		else
			Class25.aClass250_202.method3442(class250);
		Class25.aClass261_190.method3568(class261);
		Class25.anInt186 = -581023081 * i;
		Class25.anInt188 = i_6_ * -573019449;
	}

	static final void method3755(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 100;
	}

	static final void method3756(Cs2Executor class441, byte i) {
		int i_8_ = Class584.anInt7740 * 1646956835;
		int i_9_ = -1374841549 * Class15.anInt126;
		int i_10_ = -1;
		if (Class637.aBool8266) {
			Class654[] class654s = Class18.method680(1937020211);
			for (int i_11_ = 0; i_11_ < class654s.length; i_11_++) {
				Class654 class654 = class654s[i_11_];
				if (i_8_ == 2075359157 * class654.anInt8402 && 1799291061 * class654.anInt8401 == i_9_) {
					i_10_ = i_11_;
					break;
				}
			}
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_10_;
	}
}
