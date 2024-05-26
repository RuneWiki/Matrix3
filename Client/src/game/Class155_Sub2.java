package game;

/* Class155_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class155_Sub2 extends Class155 {
	int anInt9639;

	Class155_Sub2(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, byte[] is, Class171 class171_0_) {
		super(class106_sub1, 3552, class171, class88, i, false);
		((Class155_Sub2) this).anInt9639 = i;
		((Class155_Sub2) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(((Class155_Sub2) this).anInt1744, 0, Class106_Sub1.method9445((((Class155_Sub2) this).aClass171_1746), (((Class155_Sub2) this).aClass88_1747)), ((Class155_Sub2) this).anInt9639, 0, Class106_Sub1.method9444(class171_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2517(true);
	}

	void method9191(boolean bool) {
		((Class155_Sub2) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glTexParameteri(((Class155_Sub2) this).anInt1744, 10242, bool ? 10497 : 33071);
	}

	void method9192(boolean bool) {
		((Class155_Sub2) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glTexParameteri(((Class155_Sub2) this).anInt1744, 10242, bool ? 10497 : 33071);
	}

	void method9193(boolean bool) {
		((Class155_Sub2) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glTexParameteri(((Class155_Sub2) this).anInt1744, 10242, bool ? 10497 : 33071);
	}
}
