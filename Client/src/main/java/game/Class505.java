package game;

/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class505 {
	public static final int anInt5585 = 9;
	public static final int anInt5586 = 7;
	public static final int anInt5587 = 2;
	public static final int anInt5588 = 511;
	public static final int anInt5589 = 1024;
	public static final int anInt5590 = 8;
	public static final int anInt5591 = 256;
	public static final int anInt5592 = 128;
	public static final int anInt5593 = 512;

	static {
		Math.sqrt(131072.0);
	}

	Class505() throws Throwable {
		throw new Error();
	}

	static final void method6028(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method9108(-1538685693) ? 1 : 0;
	}

	public static Class481_Sub1 method6029(int i, byte i_0_) {
		if (!Class488.aBool5450 || i < Class488.anInt5454 * -302396515 || i > Class297.anInt3474 * 2041051721)
			return null;
		return (Class488.aClass481_Sub1Array5455[i - -302396515 * Class488.anInt5454]);
	}

	public static Class161 method6030(Class248 class248, int i, int i_1_) {
		Class161 class161 = (Class161) Class396.aClass127_4684.method2246((long) i);
		if (null == class161) {
			if (Class542.aBool6098)
				class161 = Class272_Sub2.aClass106_9517.method1711(Class160.method2572(class248, i), true);
			else
				class161 = Class12.method559(class248.method3373(i, (byte) -29), -1114849477);
			Class396.aClass127_4684.method2229(class161, (long) i);
		}
		return class161;
	}
}
