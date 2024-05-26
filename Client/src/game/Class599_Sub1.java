package game;

/* Class599_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class599_Sub1 extends Class599 implements Interface33 {
	static final int anInt9416 = 34069;

	public void method204() {
		super.method202();
	}

	public void method202() {
		super.method202();
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public void method39() {
		super.method39();
	}

	public void method38() {
		super.method39();
	}

	Class599_Sub1(Class106_Sub3_Sub2 class106_sub3_sub2, int i, boolean bool, int[][] is) {
		super(class106_sub3_sub2, 34067, Class171.aClass171_2071, Class88.aClass88_1218, i * i * 6, bool);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
				int i_2_ = is[i_0_][i_1_];
				is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16 | i_2_ >> 16 & 0xff);
			}
		}
		((Class599_Sub1) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (bool) {
			for (int i_3_ = 0; i_3_ < 6; i_3_++)
				method7053(34069 + i_3_, i, i, is[i_3_]);
		} else {
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				OpenGL.glTexImage2Di(34069 + i_4_, 0, Class106_Sub3_Sub2.method10118((((Class599_Sub1) this).aClass171_7859), (((Class599_Sub1) this).aClass88_7853)), i, i, 0, Class106_Sub3_Sub2.method10117(((Class599_Sub1) this).aClass171_7859), (((Class106_Sub3_Sub2) ((Class599_Sub1) this).aClass106_Sub3_Sub2_7856).anInt11105), is[i_4_], 0);
		}
	}

	public void method205() {
		super.method202();
	}

	public void method206() {
		super.method202();
	}

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}
}
