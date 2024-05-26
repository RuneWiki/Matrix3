package game;

/* Class155_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class155_Sub3 extends Class155 {
	static final int anInt9640 = 34072;
	static final int anInt9641 = 34070;
	static final int anInt9642 = 34071;
	static final int anInt9643 = 34073;
	int anInt9644;
	static final int anInt9645 = 34074;
	static final int anInt9646 = 34069;

	Class155_Sub3(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, boolean bool, int[][] is) {
		super(class106_sub1, 34067, class171, class88, i * i * 6, bool);
		((Class155_Sub3) this).anInt9644 = i;
		((Class155_Sub3) this).aClass106_Sub1_1743.method9422(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method2524(34069 + i_0_, Class106_Sub1.method9445((((Class155_Sub3) this).aClass171_1746), (((Class155_Sub3) this).aClass88_1747)), i, i, 32993, ((Class106_Sub1) (((Class155_Sub3) this).aClass106_Sub1_1743)).anInt10178, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, (Class106_Sub1.method9445(((Class155_Sub3) this).aClass171_1746, ((Class155_Sub3) this).aClass88_1747)), i, i, 0, 32993, (((Class106_Sub1) (((Class155_Sub3) this).aClass106_Sub1_1743)).anInt10178), is[i_1_], 0);
		}
		method2517(true);
	}

	Class155_Sub3(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i) {
		super(class106_sub1, 34067, class171, class88, i * i * 6, false);
		((Class155_Sub3) this).anInt9644 = i;
		((Class155_Sub3) this).aClass106_Sub1_1743.method9422(this);
		for (int i_2_ = 0; i_2_ < 6; i_2_++)
			OpenGL.glTexImage2Dub(34069 + i_2_, 0, (Class106_Sub1.method9445(((Class155_Sub3) this).aClass171_1746, ((Class155_Sub3) this).aClass88_1747)), i, i, 0, Class106_Sub1.method9444(((Class155_Sub3) this).aClass171_1746), 5121, null, 0);
		method2517(true);
	}

	Interface6 method9194(int i, int i_3_) {
		return new Class138(this, i, i_3_);
	}

	Class155_Sub3(Class106_Sub1 class106_sub1, Class171 class171, Class88 class88, int i, boolean bool, byte[][] is, Class171 class171_4_) {
		super(class106_sub1, 34067, class171, class88, i * i * 6, bool);
		((Class155_Sub3) this).anInt9644 = i;
		((Class155_Sub3) this).aClass106_Sub1_1743.method9422(this);
		for (int i_5_ = 0; i_5_ < 6; i_5_++)
			OpenGL.glTexImage2Dub(34069 + i_5_, 0, (Class106_Sub1.method9445(((Class155_Sub3) this).aClass171_1746, ((Class155_Sub3) this).aClass88_1747)), i, i, 0, Class106_Sub1.method9444(class171_4_), 5121, is[i_5_], 0);
		method2517(true);
	}
}
