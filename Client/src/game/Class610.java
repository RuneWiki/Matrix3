package game;

/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class610 implements Interface6, Interface11, Interface68 {
	Class88 aClass88_7966;
	int anInt7967;
	int anInt7968;
	Class171 aClass171_7969;
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_7970;
	int anInt7971;

	public void method63(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class610) this).anInt7971);
	}

	Class610(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, Class88 class88, int i, int i_0_, int i_1_) {
		((Class610) this).aClass171_7969 = class171;
		((Class610) this).aClass88_7966 = class88;
		((Class610) this).anInt7967 = i;
		((Class610) this).anInt7968 = i_0_;
		((Class610) this).aClass106_Sub3_Sub2_7970 = class106_sub3_sub2;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class610) this).anInt7971 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class610) this).anInt7971);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class106_Sub3_Sub2.method10118(((Class610) this).aClass171_7969, ((Class610) this).aClass88_7966), i, i_0_);
	}

	public int method42() {
		return ((Class610) this).anInt7967;
	}

	Class610(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, Class88 class88, int i, int i_2_) {
		((Class610) this).aClass171_7969 = class171;
		((Class610) this).aClass88_7966 = class88;
		((Class610) this).anInt7967 = i;
		((Class610) this).anInt7968 = i_2_;
		((Class610) this).aClass106_Sub3_Sub2_7970 = class106_sub3_sub2;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class610) this).anInt7971 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class610) this).anInt7971);
		OpenGL.glRenderbufferStorageEXT(36161, Class106_Sub3_Sub2.method10118(((Class610) this).aClass171_7969, ((Class610) this).aClass88_7966), i, i_2_);
	}

	void method7263() {
		if (((Class610) this).anInt7971 != 0) {
			((Class610) this).aClass106_Sub3_Sub2_7970.method10115(((Class610) this).anInt7971, (((Class610) this).anInt7967 * ((Class610) this).anInt7968 * (((Class610) this).aClass88_7966.anInt1223 * -1071269501) * (((Class610) this).aClass171_7969.anInt2074 * 1572594303)));
			((Class610) this).anInt7971 = 0;
		}
	}

	public void method39() {
		if (((Class610) this).anInt7971 != 0) {
			int[] is = new int[1];
			is[0] = ((Class610) this).anInt7971;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class610) this).anInt7971 = 0;
		}
	}

	void method7264() {
		if (((Class610) this).anInt7971 != 0) {
			((Class610) this).aClass106_Sub3_Sub2_7970.method10115(((Class610) this).anInt7971, (((Class610) this).anInt7967 * ((Class610) this).anInt7968 * (((Class610) this).aClass88_7966.anInt1223 * -1071269501) * (((Class610) this).aClass171_7969.anInt2074 * 1572594303)));
			((Class610) this).anInt7971 = 0;
		}
	}

	void method7265() {
		if (((Class610) this).anInt7971 != 0) {
			((Class610) this).aClass106_Sub3_Sub2_7970.method10115(((Class610) this).anInt7971, (((Class610) this).anInt7967 * ((Class610) this).anInt7968 * (((Class610) this).aClass88_7966.anInt1223 * -1071269501) * (((Class610) this).aClass171_7969.anInt2074 * 1572594303)));
			((Class610) this).anInt7971 = 0;
		}
	}

	public int method45() {
		return ((Class610) this).anInt7967;
	}

	public int method41() {
		return ((Class610) this).anInt7968;
	}

	public void method38() {
		if (((Class610) this).anInt7971 != 0) {
			int[] is = new int[1];
			is[0] = ((Class610) this).anInt7971;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class610) this).anInt7971 = 0;
		}
	}

	public int method40() {
		return ((Class610) this).anInt7968;
	}

	public void method62(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class610) this).anInt7971);
	}

	void method7266() throws Throwable {
		method7263();
		super.finalize();
	}

	public void finalize() throws Throwable {
		method7263();
		super.finalize();
	}

	public void method427(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class610) this).anInt7971);
	}

	public void method426(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class610) this).anInt7971);
	}

	void method7267() {
		if (((Class610) this).anInt7971 != 0) {
			((Class610) this).aClass106_Sub3_Sub2_7970.method10115(((Class610) this).anInt7971, (((Class610) this).anInt7967 * ((Class610) this).anInt7968 * (((Class610) this).aClass88_7966.anInt1223 * -1071269501) * (((Class610) this).aClass171_7969.anInt2074 * 1572594303)));
			((Class610) this).anInt7971 = 0;
		}
	}

	public int method43() {
		return ((Class610) this).anInt7967;
	}

	public int method44() {
		return ((Class610) this).anInt7968;
	}
}
