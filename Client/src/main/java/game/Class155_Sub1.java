package game;

/* Class155_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class155_Sub1 extends Class155 {
	int anInt9632;
	int anInt9633;
	int anInt9634;

	Class155_Sub1(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_0_, int i_1_, byte[] is, Class171 class171_2_) {
		super(class106_sub1, 32879, class171, class88, i * i_0_ * i_1_, false);
		((Class155_Sub1) this).anInt9633 = i;
		((Class155_Sub1) this).anInt9632 = i_0_;
		((Class155_Sub1) this).anInt9634 = i_1_;
		((Class155_Sub1) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class155_Sub1) this).anInt1744, 0, Class106_Sub1.method9445((((Class155_Sub1) this).aClass171_1746), (((Class155_Sub1) this).aClass88_1747)), ((Class155_Sub1) this).anInt9633, ((Class155_Sub1) this).anInt9632, ((Class155_Sub1) this).anInt9634, 0, Class106_Sub1.method9444(class171_2_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2517(true);
	}

	void method9190(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		((Class155_Sub1) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glCopyTexSubImage3D(((Class155_Sub1) this).anInt1744, 0, i, i_3_, i_4_, i_7_, i_8_, i_5_, i_6_);
		OpenGL.glFlush();
	}

	Class155_Sub1(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, int i_9_, int i_10_) {
		super(class106_sub1, 32879, class171, class88, i * i_9_ * i_10_, false);
		((Class155_Sub1) this).anInt9633 = i;
		((Class155_Sub1) this).anInt9632 = i_9_;
		((Class155_Sub1) this).anInt9634 = i_10_;
		((Class155_Sub1) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glTexImage3Dub(((Class155_Sub1) this).anInt1744, 0, Class106_Sub1.method9445(((Class155_Sub1) this).aClass171_1746, ((Class155_Sub1) this).aClass88_1747), ((Class155_Sub1) this).anInt9633, ((Class155_Sub1) this).anInt9632, ((Class155_Sub1) this).anInt9634, 0, Class106_Sub1.method9444(((Class155_Sub1) this).aClass171_1746), 5121, null, 0);
		method2517(true);
	}
}
