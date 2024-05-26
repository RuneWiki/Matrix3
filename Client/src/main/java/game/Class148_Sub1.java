package game;

/* Class148_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub1 extends Class148 {
	Class141 aClass141_9635;
	static final char aChar9636 = '\0';
	static final char aChar9637 = '\001';
	boolean aBool9638 = false;

	void method2495(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	boolean method2479() {
		return true;
	}

	boolean method2490() {
		return true;
	}

	void method2484(boolean bool) {
		((Class148_Sub1) this).aClass106_Sub1_1689.method9434(8448, 7681);
	}

	void method2493(int i, int i_0_) {
		/* empty */
	}

	void method2485(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	void method2486(Class155 class155, int i) {
		((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub1) this).aClass106_Sub1_1689.method9454(i);
	}

	void method2480(int i, int i_1_) {
		/* empty */
	}

	Class148_Sub1(Class106_Sub1 class106_sub1) {
		super(class106_sub1);
		if (((Class106_Sub1) class106_sub1).aBool10074) {
			((Class148_Sub1) this).aClass141_9635 = new Class141(class106_sub1, 2);
			((Class148_Sub1) this).aClass141_9635.method2448(0);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9434(34165, 7681);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9423(2, 34168, 770);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aClass141_9635.method2447();
			((Class148_Sub1) this).aClass141_9635.method2448(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9434(8448, 8448);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9423(2, 34166, 770);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aClass141_9635.method2447();
		}
	}

	void method2487(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	void method2481(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	void method2494(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	void method2488(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub1) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub1) this).aClass141_9635 != null && class155_sub3 != null && bool) {
			((Class148_Sub1) this).aClass141_9635.method2449('\0');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aClass250_10078.method3461(((Class106_Sub1) ((Class148_Sub1) this).aClass106_Sub1_1689).aFloatArray10095)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub1) this).aBool9638 = true;
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
	}

	void method2483() {
		if (((Class148_Sub1) this).aBool9638) {
			((Class148_Sub1) this).aClass141_9635.method2449('\001');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub1) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub1) this).aBool9638 = false;
	}

	void method2492() {
		if (((Class148_Sub1) this).aBool9638) {
			((Class148_Sub1) this).aClass141_9635.method2449('\001');
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub1) this).aClass106_Sub1_1689.method9421(0);
		} else
			((Class148_Sub1) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub1) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub1) this).aBool9638 = false;
	}

	void method2489(int i, int i_2_) {
		/* empty */
	}

	void method2491(boolean bool) {
		((Class148_Sub1) this).aClass106_Sub1_1689.method9434(8448, 7681);
	}

	void method2482(Class155 class155, int i) {
		((Class148_Sub1) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub1) this).aClass106_Sub1_1689.method9454(i);
	}
}
