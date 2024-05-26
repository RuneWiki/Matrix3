package game;

/* Class148_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub9 extends Class148 {
	Class141 aClass141_10923;
	static final char aChar10924 = '\001';
	static final char aChar10925 = '\0';
	Class137 aClass137_10926;
	static float[] aFloatArray10927 = new float[4];

	boolean method2490() {
		return true;
	}

	boolean method2479() {
		return true;
	}

	void method2495(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2484(boolean bool) {
		/* empty */
	}

	void method2483() {
		((Class148_Sub9) this).aClass141_10923.method2449('\001');
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9422(null);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
	}

	void method2489(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		if (bool) {
			aFloatArray10927[0] = f_2_;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = 0.0F;
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = f_2_;
			aFloatArray10927[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray10927, 0);
		aFloatArray10927[0] = 0.0F;
		aFloatArray10927[1] = f_2_;
		aFloatArray10927[2] = 0.0F;
		aFloatArray10927[3] = (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray10927, 0);
		if (!((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			int i_3_ = (int) (f_1_ * (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * 16.0F);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub4Array1602[i_3_ % 16]);
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = ((float) ((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047 * f_1_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10927, 0);
		}
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
	}

	void method2486(Class155 class155, int i) {
		((Class148_Sub9) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9454(i);
	}

	void method2481(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	Class148_Sub9(Class106_Sub1 class106_sub1, Class137 class137) {
		super(class106_sub1);
		((Class148_Sub9) this).aClass137_10926 = class137;
		((Class148_Sub9) this).aClass141_10923 = new Class141(class106_sub1, 2);
		((Class148_Sub9) this).aClass141_10923.method2448(0);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		((Class148_Sub9) this).aClass141_10923.method2447();
		((Class148_Sub9) this).aClass141_10923.method2448(1);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		((Class148_Sub9) this).aClass141_10923.method2447();
	}

	void method2485(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2487(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2480(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		if (bool) {
			aFloatArray10927[0] = f_6_;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = 0.0F;
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = f_6_;
			aFloatArray10927[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray10927, 0);
		aFloatArray10927[0] = 0.0F;
		aFloatArray10927[1] = f_6_;
		aFloatArray10927[2] = 0.0F;
		aFloatArray10927[3] = (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray10927, 0);
		if (!((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			int i_7_ = (int) (f_5_ * (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * 16.0F);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub4Array1602[i_7_ % 16]);
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = ((float) ((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047 * f_5_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10927, 0);
		}
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
	}

	void method2494(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2488(boolean bool) {
		((Class148_Sub9) this).aClass141_10923.method2449('\0');
		if (((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub1_1606);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2491(boolean bool) {
		/* empty */
	}

	void method2492() {
		((Class148_Sub9) this).aClass141_10923.method2449('\001');
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9422(null);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
	}

	void method2493(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(1);
		if (bool) {
			aFloatArray10927[0] = f_10_;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = 0.0F;
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = f_10_;
			aFloatArray10927[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray10927, 0);
		aFloatArray10927[0] = 0.0F;
		aFloatArray10927[1] = f_10_;
		aFloatArray10927[2] = 0.0F;
		aFloatArray10927[3] = (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray10927, 0);
		if (!((Class137) ((Class148_Sub9) this).aClass137_10926).aBool1605) {
			int i_11_ = (int) (f_9_ * (float) (((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047) * 16.0F);
			((Class148_Sub9) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub9) this).aClass137_10926).aClass155_Sub4Array1602[i_11_ % 16]);
		} else {
			aFloatArray10927[0] = 0.0F;
			aFloatArray10927[1] = 0.0F;
			aFloatArray10927[2] = 0.0F;
			aFloatArray10927[3] = ((float) ((Class106_Sub1) (((Class148_Sub9) this).aClass106_Sub1_1689)).anInt10047 * f_9_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10927, 0);
		}
		((Class148_Sub9) this).aClass106_Sub1_1689.method9421(0);
	}

	void method2482(Class155 class155, int i) {
		((Class148_Sub9) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub9) this).aClass106_Sub1_1689.method9454(i);
	}
}
