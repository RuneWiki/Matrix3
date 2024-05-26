package game;

/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class170 implements Interface10 {
	int anInt2061;
	Class155_Sub4 aClass155_Sub4_2062;

	public int method45() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9648);
	}

	public int method42() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9648);
	}

	public void method62(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt1744, ((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt1745, ((Class170) this).anInt2061);
	}

	public void method38() {
		/* empty */
	}

	public void method39() {
		/* empty */
	}

	Class170(Class155_Sub4 class155_sub4, int i) {
		((Class170) this).anInt2061 = i;
		((Class170) this).aClass155_Sub4_2062 = class155_sub4;
	}

	public int method43() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9648);
	}

	public void method63(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt1744, ((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt1745, ((Class170) this).anInt2061);
	}

	public int method40() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9647);
	}

	public int method44() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9647);
	}

	public int method41() {
		return (((Class155_Sub4) ((Class170) this).aClass155_Sub4_2062).anInt9647);
	}
}
