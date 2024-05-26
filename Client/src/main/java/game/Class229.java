package game;

/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class229 {
	static float[] aFloatArray2619;
	static float[] aFloatArray2620 = new float[16384];

	Class229() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray2619 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray2620[i] = (float) Math.sin((double) i * d);
			aFloatArray2619[i] = (float) Math.cos((double) i * d);
		}
	}
}
