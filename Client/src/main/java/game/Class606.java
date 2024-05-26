package game;

/* Class606 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class606 implements Interface68 {
	Class599_Sub2 aClass599_Sub2_7954;
	int anInt7955;

	public int method44() {
		return ((Class606) this).aClass599_Sub2_7954.method41();
	}

	public int method45() {
		return ((Class606) this).aClass599_Sub2_7954.method42();
	}

	public int method41() {
		return ((Class606) this).aClass599_Sub2_7954.method41();
	}

	public void method62(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7858, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7857, ((Class606) this).anInt7955);
	}

	public int method40() {
		return ((Class606) this).aClass599_Sub2_7954.method41();
	}

	public void method39() {
		/* empty */
	}

	public int method43() {
		return ((Class606) this).aClass599_Sub2_7954.method42();
	}

	public void method38() {
		/* empty */
	}

	public int method42() {
		return ((Class606) this).aClass599_Sub2_7954.method42();
	}

	public void method63(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7858, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7857, ((Class606) this).anInt7955);
	}

	Class606(Class599_Sub2 class599_sub2, int i) {
		((Class606) this).anInt7955 = i;
		((Class606) this).aClass599_Sub2_7954 = class599_sub2;
	}

	public void method427(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7858, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7857, ((Class606) this).anInt7955);
	}

	public void method426(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7858, ((Class599_Sub2) ((Class606) this).aClass599_Sub2_7954).anInt7857, ((Class606) this).anInt7955);
	}
}
