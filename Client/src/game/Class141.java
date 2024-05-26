package game;

/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141 {
	int anInt1612;

	void method2447() {
		OpenGL.glEndList();
	}

	void method2448(int i) {
		OpenGL.glNewList(((Class141) this).anInt1612 + i, 4864);
	}

	Class141(Class106_Sub1 class106_sub1, int i) {
		((Class141) this).anInt1612 = OpenGL.glGenLists(i);
	}

	void method2449(char c) {
		OpenGL.glCallList(((Class141) this).anInt1612 + c);
	}

	void method2450(int i) {
		OpenGL.glNewList(((Class141) this).anInt1612 + i, 4864);
	}

	void method2451() {
		OpenGL.glEndList();
	}
}
