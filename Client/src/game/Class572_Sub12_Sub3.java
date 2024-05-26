package game;

/* Class572_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class572_Sub12_Sub3 extends Class572_Sub12 implements Interface10 {
	Class171 aClass171_11256;
	int anInt11257;
	int anInt11258;
	int anInt11259;
	Class106_Sub1 aClass106_Sub1_11260;
	Class88 aClass88_11261;
	int anInt11262;
	static int[] anIntArray11263 = new int[1];

	Class572_Sub12_Sub3(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_0_) {
		((Class572_Sub12_Sub3) this).aClass106_Sub1_11260 = class106_sub1;
		((Class572_Sub12_Sub3) this).anInt11258 = i;
		((Class572_Sub12_Sub3) this).anInt11259 = i_0_;
		((Class572_Sub12_Sub3) this).aClass171_11256 = class171;
		((Class572_Sub12_Sub3) this).aClass88_11261 = class88;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11263, 0);
		((Class572_Sub12_Sub3) this).anInt11257 = anIntArray11263[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class572_Sub12_Sub3) this).anInt11257);
		OpenGL.glRenderbufferStorageEXT(36161, Class106_Sub1.method9445((((Class572_Sub12_Sub3) this).aClass171_11256), (((Class572_Sub12_Sub3) this).aClass88_11261)), ((Class572_Sub12_Sub3) this).anInt11258, ((Class572_Sub12_Sub3) this).anInt11259);
		((Class572_Sub12_Sub3) this).anInt11262 = (((Class572_Sub12_Sub3) this).anInt11258 * ((Class572_Sub12_Sub3) this).anInt11259 * (((Class572_Sub12_Sub3) this).aClass171_11256.anInt2074 * 1572594303) * (((Class572_Sub12_Sub3) this).aClass88_11261.anInt1223 * -1071269501));
	}

	public void method39() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			int[] is = new int[1];
			is[0] = ((Class572_Sub12_Sub3) this).anInt11257;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}

	public int method42() {
		return ((Class572_Sub12_Sub3) this).anInt11258;
	}

	void method10234() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			((Class572_Sub12_Sub3) this).aClass106_Sub1_11260.method9441(((Class572_Sub12_Sub3) this).anInt11257, ((Class572_Sub12_Sub3) this).anInt11262);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}

	public void method62(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class572_Sub12_Sub3) this).anInt11257));
	}

	Class572_Sub12_Sub3(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_1_, int i_2_) {
		((Class572_Sub12_Sub3) this).aClass106_Sub1_11260 = class106_sub1;
		((Class572_Sub12_Sub3) this).anInt11258 = i;
		((Class572_Sub12_Sub3) this).anInt11259 = i_1_;
		((Class572_Sub12_Sub3) this).aClass171_11256 = class171;
		((Class572_Sub12_Sub3) this).aClass88_11261 = class88;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11263, 0);
		((Class572_Sub12_Sub3) this).anInt11257 = anIntArray11263[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class572_Sub12_Sub3) this).anInt11257);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_2_, Class106_Sub1.method9445((((Class572_Sub12_Sub3) this).aClass171_11256), (((Class572_Sub12_Sub3) this).aClass88_11261)), ((Class572_Sub12_Sub3) this).anInt11258, ((Class572_Sub12_Sub3) this).anInt11259);
		((Class572_Sub12_Sub3) this).anInt11262 = (((Class572_Sub12_Sub3) this).anInt11258 * ((Class572_Sub12_Sub3) this).anInt11259 * (((Class572_Sub12_Sub3) this).aClass171_11256.anInt2074 * 1572594303) * (((Class572_Sub12_Sub3) this).aClass88_11261.anInt1223 * -1071269501));
	}

	void method10235() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			((Class572_Sub12_Sub3) this).aClass106_Sub1_11260.method9441(((Class572_Sub12_Sub3) this).anInt11257, ((Class572_Sub12_Sub3) this).anInt11262);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}

	public void finalize() throws Throwable {
		method10235();
		super.finalize();
	}

	public int method45() {
		return ((Class572_Sub12_Sub3) this).anInt11258;
	}

	public int method43() {
		return ((Class572_Sub12_Sub3) this).anInt11258;
	}

	public void method38() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			int[] is = new int[1];
			is[0] = ((Class572_Sub12_Sub3) this).anInt11257;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}

	public int method40() {
		return ((Class572_Sub12_Sub3) this).anInt11259;
	}

	public int method44() {
		return ((Class572_Sub12_Sub3) this).anInt11259;
	}

	void method10236() throws Throwable {
		method10235();
		super.finalize();
	}

	void method10237() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			((Class572_Sub12_Sub3) this).aClass106_Sub1_11260.method9441(((Class572_Sub12_Sub3) this).anInt11257, ((Class572_Sub12_Sub3) this).anInt11262);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}

	public int method41() {
		return ((Class572_Sub12_Sub3) this).anInt11259;
	}

	public void method63(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class572_Sub12_Sub3) this).anInt11257));
	}

	void method10238() {
		if (((Class572_Sub12_Sub3) this).anInt11257 != 0) {
			((Class572_Sub12_Sub3) this).aClass106_Sub1_11260.method9441(((Class572_Sub12_Sub3) this).anInt11257, ((Class572_Sub12_Sub3) this).anInt11262);
			((Class572_Sub12_Sub3) this).anInt11257 = 0;
		}
	}
}
