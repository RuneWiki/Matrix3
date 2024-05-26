package game;

/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class156 {
	static final int anInt1752 = 34336;
	static int[] anIntArray1753 = new int[1];
	int anInt1754;
	Class106_Sub1 aClass106_Sub1_1755;

	public void finalize() throws Throwable {
		((Class156) this).aClass106_Sub1_1755.method9443(((Class156) this).anInt1754);
		super.finalize();
	}

	Class156(Class106_Sub1 class106_sub1, int i, int i_0_) {
		((Class156) this).aClass106_Sub1_1755 = class106_sub1;
		((Class156) this).anInt1754 = i_0_;
	}

	static Class156 method2543(Class106_Sub1 class106_sub1, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1753, 0);
		if (anIntArray1753[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class156(class106_sub1, i, i_1_);
	}

	void method2544() throws Throwable {
		((Class156) this).aClass106_Sub1_1755.method9443(((Class156) this).anInt1754);
		super.finalize();
	}
}
