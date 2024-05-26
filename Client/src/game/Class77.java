package game;

/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77 {
	int[] anIntArray947;
	int anInt948;
	int anInt949;
	int anInt950;
	int anInt951;
	int anInt952;
	int[] anIntArray953;
	int anInt954;
	Class79 aClass79_955;
	int[][] anIntArrayArray956;

	void method1154(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class61[] method1155(Class61[] class61s, int i, boolean[] bools) {
		int i_0_ = class61s.length;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			if (!bools[i_1_]) {
				for (int i_2_ = 0; i_2_ < i; i_2_++)
					((Class61) class61s[i_1_]).aFloatArray541[i_2_] = 0.0F;
			}
		}
		int i_3_ = (((Class60) (((Class79) ((Class77) this).aClass79_955).aClass60Array1013[((Class77) this).anInt952])).anInt536);
		int i_4_ = ((Class77) this).anInt951 - ((Class77) this).anInt950;
		int i_5_ = i_4_ / ((Class77) this).anInt954;
		if (((Class77) this).anIntArrayArray956 == null || ((Class77) this).anIntArrayArray956.length != i_0_ || ((Class77) this).anIntArrayArray956[0].length != i_5_)
			((Class77) this).anIntArrayArray956 = new int[i_0_][i_5_];
		else {
			for (int i_6_ = 0; i_6_ < i_0_; i_6_++)
				method1156(((Class77) this).anIntArrayArray956[i_6_]);
		}
		for (int i_7_ = 0; i_7_ < 8; i_7_++) {
			int i_8_ = 0;
			while (i_8_ < i_5_) {
				if (i_7_ == 0) {
					for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
						if (!bools[i_9_]) {
							int i_10_ = (((Class79) ((Class77) this).aClass79_955).aClass60Array1013[((Class77) this).anInt952].method1010(((Class77) this).aClass79_955));
							for (int i_11_ = i_3_ - 1; i_11_ >= 0; i_11_--) {
								if (i_8_ + i_11_ < i_5_)
									((Class77) this).anIntArrayArray956[i_9_][i_8_ + i_11_] = i_10_ % ((Class77) this).anInt949;
								i_10_ /= ((Class77) this).anInt949;
							}
						}
					}
				}
				for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
					for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
						if (!bools[i_13_]) {
							int i_14_ = (((Class77) this).anIntArrayArray956[i_13_][i_8_]);
							int i_15_ = (((Class77) this).anIntArray953[i_14_ * 8 + i_7_]);
							if (i_15_ >= 0) {
								int i_16_ = (((Class77) this).anInt950 + i_8_ * ((Class77) this).anInt954);
								Class60 class60 = (((Class79) (((Class77) this).aClass79_955)).aClass60Array1013[i_15_]);
								if (((Class77) this).anInt948 == 0) {
									int i_17_ = (((Class77) this).anInt954 / ((Class60) class60).anInt536);
									for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
										float[] fs = (class60.method1014(((Class77) this).aClass79_955));
										for (int i_19_ = 0; (i_19_ < ((Class60) class60).anInt536); i_19_++)
											((Class61) class61s[i_13_]).aFloatArray541[i_16_ + i_18_ + i_19_ * i_17_] += fs[i_19_];
									}
								} else if (((Class77) this).anInt948 == 1 || ((Class77) this).anInt948 == 2) {
									int i_20_ = 0;
									while (i_20_ < ((Class77) this).anInt954) {
										float[] fs = (class60.method1014(((Class77) this).aClass79_955));
										for (int i_21_ = 0; (i_21_ < ((Class60) class60).anInt536); i_21_++) {
											((Class61) class61s[i_13_]).aFloatArray541[i_16_ + i_20_] += fs[i_21_];
											i_20_++;
										}
									}
								}
							}
						}
					}
					if (++i_8_ >= i_5_)
						break;
				}
			}
		}
		return class61s;
	}

	void method1156(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method1157(Class79 class79) {
		((Class77) this).aClass79_955 = class79;
		((Class77) this).anInt948 = ((Class77) this).aClass79_955.method1197(16);
		((Class77) this).anInt950 = ((Class77) this).aClass79_955.method1197(24);
		((Class77) this).anInt951 = ((Class77) this).aClass79_955.method1197(24);
		((Class77) this).anInt954 = ((Class77) this).aClass79_955.method1197(24) + 1;
		((Class77) this).anInt949 = ((Class77) this).aClass79_955.method1197(6) + 1;
		((Class77) this).anInt952 = ((Class77) this).aClass79_955.method1197(8);
		if (((Class77) this).anIntArray947 == null || (((Class77) this).anIntArray947.length != ((Class77) this).anInt949))
			((Class77) this).anIntArray947 = new int[((Class77) this).anInt949];
		for (int i = 0; i < ((Class77) this).anInt949; i++) {
			int i_22_ = 0;
			int i_23_ = ((Class77) this).aClass79_955.method1197(3);
			boolean bool = ((Class77) this).aClass79_955.method1196() != 0;
			if (bool)
				i_22_ = ((Class77) this).aClass79_955.method1197(5);
			((Class77) this).anIntArray947[i] = i_22_ << 3 | i_23_;
		}
		if (((Class77) this).anIntArray953 == null || (((Class77) this).anIntArray953.length != ((Class77) this).anInt949 * 8))
			((Class77) this).anIntArray953 = new int[((Class77) this).anInt949 * 8];
		for (int i = 0; i < ((Class77) this).anInt949 * 8; i++)
			((Class77) this).anIntArray953[i] = ((((Class77) this).anIntArray947[i >> 3] & 1 << (i & 0x7)) != 0) ? ((Class77) this).aClass79_955.method1197(8) : -1;
	}

	Class77() {
		/* empty */
	}
}
