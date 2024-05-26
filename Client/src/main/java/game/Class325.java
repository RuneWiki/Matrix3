package game;

/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325 {
	public static final int anInt4088 = 16383;
	public static final int anInt4089 = 16383;
	public static final int anInt4090 = 14;
	public static final double aDouble4091 = 2607.5945876176133;
	public static final int anInt4092 = 16384;
	public static final int anInt4093 = 2048;
	public static final int anInt4094 = 14;
	public static final int anInt4095 = 1024;
	public static final int anInt4096 = 16384;
	public static final int anInt4097 = 4096;
	public static final int anInt4098 = 6144;
	public static final int anInt4099 = 8192;
	public static final int anInt4100 = 10240;
	public static final int anInt4101 = 12288;
	public static final int anInt4102 = 16384;
	public static int[] anIntArray4103 = new int[16384];
	public static final int anInt4104 = 14336;
	public static int[] anIntArray4105 = new int[16384];

	public static float method4146(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4103[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray4105[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}

	Class325() throws Throwable {
		throw new Error();
	}
}
