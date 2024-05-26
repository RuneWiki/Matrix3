package game;

/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class154 {
	int anInt1728;
	static final int anInt1729 = 34963;
	static final int anInt1730 = 34962;
	static int[] anIntArray1731 = new int[1];
	int anInt1732;
	int anInt1733;
	boolean aBool1734;
	boolean aBool1735 = false;
	Class106_Sub1 aClass106_Sub1_1736;

	Class154(Class106_Sub1 class106_sub1, int i, Buffer buffer, int i_0_, boolean bool) {
		((Class154) this).aClass106_Sub1_1736 = class106_sub1;
		((Class154) this).anInt1728 = i;
		((Class154) this).anInt1733 = i_0_;
		((Class154) this).aBool1734 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1731, 0);
		((Class154) this).anInt1732 = anIntArray1731[0];
		method2513();
		OpenGL.glBufferDataARBa(i, ((Class154) this).anInt1733, buffer.method64(), ((Class154) this).aBool1734 ? 35040 : 35044);
		((Class106_Sub1) ((Class154) this).aClass106_Sub1_1736).anInt10055 += ((Class154) this).anInt1733;
	}

	void method2511() throws Throwable {
		if (!((Class154) this).aBool1735) {
			((Class154) this).aClass106_Sub1_1736.method9451((((Class154) this).anInt1732), (((Class154) this).anInt1733));
			((Class154) this).aBool1735 = true;
		}
		super.finalize();
	}

	void method2512(byte[] is, int i) {
		method2513();
		if (i > ((Class154) this).anInt1733) {
			OpenGL.glBufferDataARBub(((Class154) this).anInt1728, i, is, 0, (((Class154) this).aBool1734 ? 35040 : 35044));
			((Class106_Sub1) ((Class154) this).aClass106_Sub1_1736).anInt10055 += i - ((Class154) this).anInt1733;
			((Class154) this).anInt1733 = i;
		} else
			OpenGL.glBufferSubDataARBub(((Class154) this).anInt1728, 0, i, is, 0);
	}

	abstract void method2513();

	Class154(Class106_Sub1 class106_sub1, int i, byte[] is, int i_1_, boolean bool) {
		((Class154) this).aClass106_Sub1_1736 = class106_sub1;
		((Class154) this).anInt1728 = i;
		((Class154) this).anInt1733 = i_1_;
		((Class154) this).aBool1734 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1731, 0);
		((Class154) this).anInt1732 = anIntArray1731[0];
		method2513();
		OpenGL.glBufferDataARBub(i, ((Class154) this).anInt1733, is, 0, ((Class154) this).aBool1734 ? 35040 : 35044);
		((Class106_Sub1) ((Class154) this).aClass106_Sub1_1736).anInt10055 += ((Class154) this).anInt1733;
	}

	public void finalize() throws Throwable {
		if (!((Class154) this).aBool1735) {
			((Class154) this).aClass106_Sub1_1736.method9451((((Class154) this).anInt1732), (((Class154) this).anInt1733));
			((Class154) this).aBool1735 = true;
		}
		super.finalize();
	}

	abstract void method2514();

	abstract void method2515();
}
