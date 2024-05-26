package game;

/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class226 {
	public float[] aFloatArray2615 = new float[9];

	void method3155() {
		aFloatArray2615[0] = 1.0F;
		aFloatArray2615[1] = 0.0F;
		aFloatArray2615[2] = 0.0F;
		aFloatArray2615[3] = 0.0F;
		aFloatArray2615[4] = 1.0F;
		aFloatArray2615[5] = 0.0F;
		aFloatArray2615[6] = 0.0F;
		aFloatArray2615[7] = 0.0F;
		aFloatArray2615[8] = 1.0F;
	}

	public Class230 method3156() {
		Class230 class230 = new Class230();
		double d = (double) (1.0F + aFloatArray2615[0] + aFloatArray2615[4] + aFloatArray2615[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class230.aFloat2624 = (aFloatArray2615[7] - aFloatArray2615[5]) / f;
			class230.aFloat2623 = (aFloatArray2615[2] - aFloatArray2615[6]) / f;
			class230.aFloat2626 = (aFloatArray2615[3] - aFloatArray2615[1]) / f;
			class230.aFloat2621 = 0.25F * f;
		} else if (aFloatArray2615[0] > aFloatArray2615[4] && aFloatArray2615[0] > aFloatArray2615[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray2615[0] - aFloatArray2615[4] - aFloatArray2615[8])) * 2.0);
			class230.aFloat2624 = 0.25F * f;
			class230.aFloat2623 = (aFloatArray2615[3] + aFloatArray2615[1]) / f;
			class230.aFloat2626 = (aFloatArray2615[2] + aFloatArray2615[6]) / f;
			class230.aFloat2621 = (aFloatArray2615[7] - aFloatArray2615[5]) / f;
		} else if (aFloatArray2615[4] > aFloatArray2615[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray2615[4] - aFloatArray2615[0] - aFloatArray2615[8])) * 2.0);
			class230.aFloat2624 = (aFloatArray2615[3] + aFloatArray2615[1]) / f;
			class230.aFloat2623 = 0.25F * f;
			class230.aFloat2626 = (aFloatArray2615[7] + aFloatArray2615[5]) / f;
			class230.aFloat2621 = (aFloatArray2615[2] - aFloatArray2615[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray2615[8] - aFloatArray2615[0] - aFloatArray2615[4])) * 2.0);
			class230.aFloat2624 = (aFloatArray2615[2] + aFloatArray2615[6]) / f;
			class230.aFloat2623 = (aFloatArray2615[7] + aFloatArray2615[5]) / f;
			class230.aFloat2626 = 0.25F * f;
			class230.aFloat2621 = (aFloatArray2615[3] - aFloatArray2615[1]) / f;
		}
		return class230;
	}

	void method3157() {
		aFloatArray2615[0] = 1.0F;
		aFloatArray2615[1] = 0.0F;
		aFloatArray2615[2] = 0.0F;
		aFloatArray2615[3] = 0.0F;
		aFloatArray2615[4] = 1.0F;
		aFloatArray2615[5] = 0.0F;
		aFloatArray2615[6] = 0.0F;
		aFloatArray2615[7] = 0.0F;
		aFloatArray2615[8] = 1.0F;
	}

	public Class226() {
		method3155();
	}
}
