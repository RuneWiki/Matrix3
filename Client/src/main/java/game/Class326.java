package game;

/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326 {
	public float aFloat4106;
	static float[] aFloatArray4107;
	public float aFloat4108;
	public float aFloat4109;
	public float aFloat4110;
	public float aFloat4111;
	static float[] aFloatArray4112 = new float[8];
	public float aFloat4113;
	static float[] aFloatArray4114;

	public boolean method4147(int i, int i_0_, int i_1_, int i_2_, Class250 class250, float f, float f_3_, float f_4_, float f_5_) {
		boolean bool = false;
		float f_6_ = 3.4028235E38F;
		float f_7_ = -3.4028235E38F;
		float f_8_ = 3.4028235E38F;
		float f_9_ = -3.4028235E38F;
		aFloatArray4112[0] = aFloat4113;
		aFloatArray4107[0] = aFloat4106;
		aFloatArray4114[0] = aFloat4108;
		aFloatArray4112[1] = aFloat4109;
		aFloatArray4107[1] = aFloat4106;
		aFloatArray4114[1] = aFloat4108;
		aFloatArray4112[2] = aFloat4113;
		aFloatArray4107[2] = aFloat4110;
		aFloatArray4114[2] = aFloat4108;
		aFloatArray4112[3] = aFloat4109;
		aFloatArray4107[3] = aFloat4110;
		aFloatArray4114[3] = aFloat4108;
		aFloatArray4112[4] = aFloat4113;
		aFloatArray4107[4] = aFloat4106;
		aFloatArray4114[4] = aFloat4111;
		aFloatArray4112[5] = aFloat4109;
		aFloatArray4107[5] = aFloat4106;
		aFloatArray4114[5] = aFloat4111;
		aFloatArray4112[6] = aFloat4113;
		aFloatArray4107[6] = aFloat4110;
		aFloatArray4114[6] = aFloat4111;
		aFloatArray4112[7] = aFloat4109;
		aFloatArray4107[7] = aFloat4110;
		aFloatArray4114[7] = aFloat4111;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			float f_11_ = aFloatArray4112[i_10_];
			float f_12_ = aFloatArray4107[i_10_];
			float f_13_ = aFloatArray4114[i_10_];
			float f_14_ = (class250.aFloatArray2728[2] * f_11_ + class250.aFloatArray2728[6] * f_12_ + class250.aFloatArray2728[10] * f_13_ + class250.aFloatArray2728[14]);
			float f_15_ = (class250.aFloatArray2728[3] * f_11_ + class250.aFloatArray2728[7] * f_12_ + class250.aFloatArray2728[11] * f_13_ + class250.aFloatArray2728[15]);
			if (f_14_ >= -f_15_) {
				float f_16_ = (class250.aFloatArray2728[0] * f_11_ + class250.aFloatArray2728[4] * f_12_ + class250.aFloatArray2728[8] * f_13_ + class250.aFloatArray2728[12]);
				float f_17_ = (class250.aFloatArray2728[1] * f_11_ + class250.aFloatArray2728[5] * f_12_ + class250.aFloatArray2728[9] * f_13_ + class250.aFloatArray2728[13]);
				float f_18_ = f + f_4_ * f_16_ / f_15_;
				float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
				if (f_18_ < f_6_)
					f_6_ = f_18_;
				if (f_18_ > f_7_)
					f_7_ = f_18_;
				if (f_19_ < f_8_)
					f_8_ = f_19_;
				if (f_19_ > f_9_)
					f_9_ = f_19_;
				bool = true;
			}
		}
		int i_20_ = i + i_1_;
		int i_21_ = i_0_ + i_2_;
		if (bool && (float) i_20_ > f_6_ && (float) i < f_7_ && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
			return true;
		return false;
	}

	static {
		aFloatArray4107 = new float[8];
		aFloatArray4114 = new float[8];
	}
}
