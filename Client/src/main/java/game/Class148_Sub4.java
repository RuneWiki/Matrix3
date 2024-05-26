package game;

/* Class148_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub4 extends Class148 {
	static final char aChar10644 = '\001';
	static final char aChar10645 = '\0';
	Class137 aClass137_10646;
	Class141 aClass141_10647;
	Class155_Sub2 aClass155_Sub2_10648;
	static float[] aFloatArray10649 = { 0.0F, 0.0F, 0.0F, 0.0F };

	void method2495(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	boolean method2479() {
		return true;
	}

	void method2484(boolean bool) {
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(260, 8448);
	}

	Class148_Sub4(Class106_Sub1 class106_sub1, Class137 class137) {
		super(class106_sub1);
		((Class148_Sub4) this).aClass137_10646 = class137;
		method9953();
		((Class148_Sub4) this).aClass155_Sub2_10648 = new Class155_Sub2(((Class148_Sub4) this).aClass106_Sub1_1689, Class171.aClass171_2073, Class88.aClass88_1218, 2, new byte[] { 0, -1 }, Class171.aClass171_2073);
		((Class148_Sub4) this).aClass155_Sub2_10648.method9193(false);
	}

	void method2483() {
		((Class148_Sub4) this).aClass141_10647.method2449('\001');
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(1.0F, 0.0F);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2489(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
				aFloatArray10649[0] = 0.0F;
				aFloatArray10649[1] = 0.0F;
				aFloatArray10649[2] = 0.0F;
				aFloatArray10649[3] = (float) ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10047) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
			} else {
				int i_1_ = (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10047 % 4000 * 16 / 4000);
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[i_1_]);
			}
		} else if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = 0.0F;
			aFloatArray10649[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
		} else
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[0]);
	}

	void method2486(Class155 class155, int i) {
		/* empty */
	}

	void method9953() {
		((Class148_Sub4) this).aClass141_10647 = new Class141(((Class148_Sub4) this).aClass106_Sub1_1689, 2);
		((Class148_Sub4) this).aClass141_10647.method2448(0);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(7681, 260);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
		((Class148_Sub4) this).aClass141_10647.method2448(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
	}

	boolean method2490() {
		return true;
	}

	void method2485(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2487(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2488(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2494(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2482(Class155 class155, int i) {
		/* empty */
	}

	void method2491(boolean bool) {
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(260, 8448);
	}

	void method2492() {
		((Class148_Sub4) this).aClass141_10647.method2449('\001');
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(1.0F, 0.0F);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2481(boolean bool) {
		if ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10129) > 0) {
			float f = -0.5F / (float) (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = f;
			aFloatArray10649[3] = (((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).aFloat10131) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray10649, 0);
			OpenGL.glPopMatrix();
			((Class148_Sub4) this).aClass106_Sub1_1689.method9404(0.5F, (float) ((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10129);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class148_Sub4) this).aClass155_Sub2_10648);
			((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		}
		((Class148_Sub4) this).aClass141_10647.method2449('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2480(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
				aFloatArray10649[0] = 0.0F;
				aFloatArray10649[1] = 0.0F;
				aFloatArray10649[2] = 0.0F;
				aFloatArray10649[3] = (float) ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10047) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
			} else {
				int i_3_ = (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10047 % 4000 * 16 / 4000);
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[i_3_]);
			}
		} else if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = 0.0F;
			aFloatArray10649[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
		} else
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[0]);
	}

	void method2493(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
				aFloatArray10649[0] = 0.0F;
				aFloatArray10649[1] = 0.0F;
				aFloatArray10649[2] = 0.0F;
				aFloatArray10649[3] = (float) ((((Class106_Sub1) ((Class148_Sub4) this).aClass106_Sub1_1689).anInt10047) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
			} else {
				int i_5_ = (((Class106_Sub1) (((Class148_Sub4) this).aClass106_Sub1_1689)).anInt10047 % 4000 * 16 / 4000);
				((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[i_5_]);
			}
		} else if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub1_1599);
			aFloatArray10649[0] = 0.0F;
			aFloatArray10649[1] = 0.0F;
			aFloatArray10649[2] = 0.0F;
			aFloatArray10649[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray10649, 0);
		} else
			((Class148_Sub4) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub4) this).aClass137_10646).aClass155_Sub4Array1601[0]);
	}

	void method9954() {
		((Class148_Sub4) this).aClass141_10647 = new Class141(((Class148_Sub4) this).aClass106_Sub1_1689, 2);
		((Class148_Sub4) this).aClass141_10647.method2448(0);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(7681, 260);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
		((Class148_Sub4) this).aClass141_10647.method2448(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
	}

	void method9955() {
		((Class148_Sub4) this).aClass141_10647 = new Class141(((Class148_Sub4) this).aClass106_Sub1_1689, 2);
		((Class148_Sub4) this).aClass141_10647.method2448(0);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(7681, 260);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
		((Class148_Sub4) this).aClass141_10647.method2448(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
	}

	void method9956() {
		((Class148_Sub4) this).aClass141_10647 = new Class141(((Class148_Sub4) this).aClass106_Sub1_1689, 2);
		((Class148_Sub4) this).aClass141_10647.method2448(0);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(7681, 260);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
		((Class148_Sub4) this).aClass141_10647.method2448(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class148_Sub4) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class137) ((Class148_Sub4) this).aClass137_10646).aBool1605) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class148_Sub4) this).aClass141_10647.method2447();
	}
}
