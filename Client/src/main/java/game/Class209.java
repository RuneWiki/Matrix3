package game;

/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class209 {
	public float aFloat2433;
	public float aFloat2434;
	public float aFloat2435;
	public float aFloat2436;

	public void method3039(int i) {
		method3040((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public Class209(float f, float f_0_, float f_1_, float f_2_) {
		method3040(f, f_0_, f_1_, f_2_);
	}

	public void method3040(float f, float f_3_, float f_4_, float f_5_) {
		aFloat2436 = f;
		aFloat2434 = f_3_;
		aFloat2433 = f_4_;
		aFloat2435 = f_5_;
	}

	public void method3041(int i) {
		method3040((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method3042() {
		aFloat2436 = -aFloat2436;
		aFloat2434 = -aFloat2434;
		aFloat2433 = -aFloat2433;
		aFloat2435 = -aFloat2435;
	}

	public final void method3043(float f) {
		aFloat2436 *= f;
		aFloat2434 *= f;
		aFloat2433 *= f;
		aFloat2435 *= f;
	}

	public void method3044(int i) {
		method3040((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method3045(Class250 class250) {
		float f = aFloat2436;
		float f_6_ = aFloat2434;
		float f_7_ = aFloat2433;
		float f_8_ = aFloat2435;
		aFloat2436 = (class250.aFloatArray2728[0] * f + class250.aFloatArray2728[4] * f_6_ + class250.aFloatArray2728[8] * f_7_ + class250.aFloatArray2728[12] * f_8_);
		aFloat2434 = (class250.aFloatArray2728[1] * f + class250.aFloatArray2728[5] * f_6_ + class250.aFloatArray2728[9] * f_7_ + class250.aFloatArray2728[13] * f_8_);
		aFloat2433 = (class250.aFloatArray2728[2] * f + class250.aFloatArray2728[6] * f_6_ + class250.aFloatArray2728[10] * f_7_ + class250.aFloatArray2728[14] * f_8_);
		aFloat2435 = (class250.aFloatArray2728[3] * f + class250.aFloatArray2728[7] * f_6_ + class250.aFloatArray2728[11] * f_7_ + class250.aFloatArray2728[15] * f_8_);
	}

	public final void method3046() {
		aFloat2436 = -aFloat2436;
		aFloat2434 = -aFloat2434;
		aFloat2433 = -aFloat2433;
		aFloat2435 = -aFloat2435;
	}

	public String method3047() {
		return new StringBuilder().append(aFloat2436).append(",").append(aFloat2434).append(",").append(aFloat2433).append(",").append(aFloat2435).toString();
	}

	public String method3048() {
		return new StringBuilder().append(aFloat2436).append(",").append(aFloat2434).append(",").append(aFloat2433).append(",").append(aFloat2435).toString();
	}

	public void method3049(Class209 class209_9_) {
		method3040(class209_9_.aFloat2436, class209_9_.aFloat2434, class209_9_.aFloat2433, class209_9_.aFloat2435);
	}

	final void method3050() {
		aFloat2435 = 0.0F;
		aFloat2433 = 0.0F;
		aFloat2434 = 0.0F;
		aFloat2436 = 0.0F;
	}

	public void method3051(int i) {
		method3040((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public String toString() {
		return new StringBuilder().append(aFloat2436).append(",").append(aFloat2434).append(",").append(aFloat2433).append(",").append(aFloat2435).toString();
	}

	public Class209() {
		method3050();
	}
}
