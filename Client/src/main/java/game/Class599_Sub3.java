package game;

/* Class599_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class599_Sub3 extends Class599 implements Interface40 {
	int anInt9661;
	int anInt9662;
	int anInt9663;

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	public void method202() {
		super.method202();
	}

	public void method39() {
		super.method39();
	}

	public void method204() {
		super.method202();
	}

	public void method38() {
		super.method39();
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public void method205() {
		super.method202();
	}

	public void method206() {
		super.method202();
	}

	Class599_Sub3(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class106_sub3_sub2, 32879, class171, Class88.aClass88_1218, i * i_0_ * i_1_, bool);
		((Class599_Sub3) this).anInt9663 = i;
		((Class599_Sub3) this).anInt9662 = i_0_;
		((Class599_Sub3) this).anInt9661 = i_1_;
		((Class599_Sub3) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class599_Sub3) this).anInt7858, 0, (Class106_Sub3_Sub2.method10118(((Class599_Sub3) this).aClass171_7859, ((Class599_Sub3) this).aClass88_7853)), ((Class599_Sub3) this).anInt9663, ((Class599_Sub3) this).anInt9662, ((Class599_Sub3) this).anInt9661, 0, Class106_Sub3_Sub2.method10117(((Class599_Sub3) this).aClass171_7859), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method237();
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}
}
