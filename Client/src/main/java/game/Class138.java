package game;

/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138 implements Interface10 {
	int anInt1608;
	int anInt1609;
	Class155_Sub3 aClass155_Sub3_1610;

	public void method63(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class138) this).anInt1608, ((Class155_Sub3) (((Class138) this).aClass155_Sub3_1610)).anInt1745, ((Class138) this).anInt1609);
	}

	public int method42() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	public int method41() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	public void method62(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class138) this).anInt1608, ((Class155_Sub3) (((Class138) this).aClass155_Sub3_1610)).anInt1745, ((Class138) this).anInt1609);
	}

	public void method39() {
		/* empty */
	}

	public int method45() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	public int method43() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	public int method44() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	public int method40() {
		return (((Class155_Sub3) ((Class138) this).aClass155_Sub3_1610).anInt9644);
	}

	Class138(Class155_Sub3 class155_sub3, int i, int i_0_) {
		((Class138) this).anInt1609 = i_0_;
		((Class138) this).aClass155_Sub3_1610 = class155_sub3;
		((Class138) this).anInt1608 = i;
	}

	public void method38() {
		/* empty */
	}
}
