package game;

/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class149 {
	int anInt1690;
	static int[] anIntArray1691 = new int[2];
	Class106_Sub1 aClass106_Sub1_1692;

	public void finalize() throws Throwable {
		((Class149) this).aClass106_Sub1_1692.method9442((long) ((Class149) this).anInt1690);
		super.finalize();
	}

	static Class149 method2496(Class106_Sub1 class106_sub1, Class136[] class136s) {
		for (int i = 0; i < class136s.length; i++) {
			if (class136s[i] == null || ((Class136) class136s[i]).anInt1590 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class136s.length; i_0_++)
			OpenGL.glAttachShader(i, ((Class136) class136s[i_0_]).anInt1590);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1691, 0);
		if (anIntArray1691[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1691, 1);
			if (anIntArray1691[1] > 1) {
				byte[] is = new byte[anIntArray1691[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1691[1], anIntArray1691, 0, is, 0);
				// System.out.println(new String(is));
			}
			if (anIntArray1691[0] == 0) {
				for (int i_1_ = 0; i_1_ < class136s.length; i_1_++)
					OpenGL.glDetachShader(i, (((Class136) class136s[i_1_]).anInt1590));
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class149(class106_sub1, i, class136s);
	}

	Class149(Class106_Sub1 class106_sub1, int i, Class136[] class136s) {
		((Class149) this).aClass106_Sub1_1692 = class106_sub1;
		((Class149) this).anInt1690 = i;
	}

	void method2497() throws Throwable {
		((Class149) this).aClass106_Sub1_1692.method9442((long) ((Class149) this).anInt1690);
		super.finalize();
	}
}
