package game;

/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class136 {
	int anInt1590;
	static final int anInt1591 = 35632;
	static final int anInt1592 = 35633;
	Class106_Sub1 aClass106_Sub1_1593;
	static int[] anIntArray1594 = new int[2];

	Class136(Class106_Sub1 class106_sub1, int i, int i_0_) {
		((Class136) this).aClass106_Sub1_1593 = class106_sub1;
		((Class136) this).anInt1590 = i;
	}

	public void finalize() throws Throwable {
		((Class136) this).aClass106_Sub1_1593.method9442((long) ((Class136) this).anInt1590);
		super.finalize();
	}

	void method2342() throws Throwable {
		((Class136) this).aClass106_Sub1_1593.method9442((long) ((Class136) this).anInt1590);
		super.finalize();
	}

	static Class136 method2343(Class106_Sub1 class106_sub1, int i, String string) {
		int i_1_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_1_, string);
		OpenGL.glCompileShader(i_1_);
		OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			boolean bool = false;
			if (anIntArray1594[0] == 0) {
				bool = true;
				// System.out.println("");
			}
			OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetShaderInfoLog(i_1_, anIntArray1594[1], anIntArray1594, 0, is, 0);
				// System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_1_);
				return null;
			}
		}
		return new Class136(class106_sub1, i_1_, i);
	}
}
