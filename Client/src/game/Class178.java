package game;

/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class178 {
	static float[] aFloatArray2109;
	static float[] aFloatArray2110 = new float[16384];

	Class178() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray2109 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray2110[i] = (float) Math.sin((double) i * d);
			aFloatArray2109[i] = (float) Math.cos((double) i * d);
		}
	}
}
