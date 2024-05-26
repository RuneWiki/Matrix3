package game;

/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class601 implements Interface41 {
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_7865;
	static final int anInt7866 = 34963;
	int anInt7867 = -1;
	int anInt7868;
	static final int anInt7869 = 34962;
	int anInt7870;
	int anInt7871;
	boolean aBool7872;
	NativeHeapBuffer aNativeHeapBuffer7873;
	static int[] anIntArray7874 = new int[1];

	public boolean method220(int i, int i_0_, long l) {
		method7067();
		if (((Class601) this).anInt7867 > 0) {
			OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
			OpenGL.glBufferSubDataARBa(((Class601) this).anInt7868, i, i_0_, l);
		} else
			((Class601) this).aNativeHeapBuffer7873.aNativeHeap687.copy(((Class601) this).aNativeHeapBuffer7873.method64() + (long) i, l, i_0_);
		return true;
	}

	void method7067() {
		if (((Class601) this).anInt7867 < 0) {
			if (((Class106_Sub3_Sub2) ((Class601) this).aClass106_Sub3_Sub2_7865).aBool11098) {
				OpenGL.glGenBuffersARB(1, anIntArray7874, 0);
				((Class601) this).anInt7867 = anIntArray7874[0];
				OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
			} else
				((Class601) this).anInt7867 = 0;
		}
	}

	public void method120() {
		OpenGL.glUnmapBufferARB(((Class601) this).anInt7868);
	}

	long method7068() {
		return (((Class601) this).anInt7867 == 0 ? ((Class601) this).aNativeHeapBuffer7873.method64() : 0L);
	}

	void method7069() {
		if (((Class106_Sub3_Sub2) ((Class601) this).aClass106_Sub3_Sub2_7865).aBool11098)
			OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
	}

	void method265(int i) {
		if (i > ((Class601) this).anInt7870) {
			method7067();
			if (((Class601) this).anInt7867 > 0) {
				OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
				OpenGL.glBufferDataARBub(((Class601) this).anInt7868, i, null, 0, (((Class601) this).aBool7872 ? 35040 : 35044));
				((Class601) this).aClass106_Sub3_Sub2_7865.anInt10386 += i - ((Class601) this).anInt7870;
			} else
				((Class601) this).aNativeHeapBuffer7873 = ((Class601) this).aClass106_Sub3_Sub2_7865.method9800(i, false);
			((Class601) this).anInt7870 = i;
		}
		((Class601) this).anInt7871 = i;
	}

	public long method219(int i, int i_1_) {
		OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
		return (OpenGL.glMapBufferARB(((Class601) this).anInt7868, 35001) + (long) i);
	}

	public void method110() {
		OpenGL.glUnmapBufferARB(((Class601) this).anInt7868);
	}

	public boolean method223(int i, int i_2_, long l) {
		method7067();
		if (((Class601) this).anInt7867 > 0) {
			OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
			OpenGL.glBufferSubDataARBa(((Class601) this).anInt7868, i, i_2_, l);
		} else
			((Class601) this).aNativeHeapBuffer7873.aNativeHeap687.copy(((Class601) this).aNativeHeapBuffer7873.method64() + (long) i, l, i_2_);
		return true;
	}

	void method262(int i) {
		if (i > ((Class601) this).anInt7870) {
			method7067();
			if (((Class601) this).anInt7867 > 0) {
				OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
				OpenGL.glBufferDataARBub(((Class601) this).anInt7868, i, null, 0, (((Class601) this).aBool7872 ? 35040 : 35044));
				((Class601) this).aClass106_Sub3_Sub2_7865.anInt10386 += i - ((Class601) this).anInt7870;
			} else
				((Class601) this).aNativeHeapBuffer7873 = ((Class601) this).aClass106_Sub3_Sub2_7865.method9800(i, false);
			((Class601) this).anInt7870 = i;
		}
		((Class601) this).anInt7871 = i;
	}

	public void finalize() throws Throwable {
		method39();
		super.finalize();
	}

	void method38() {
		if (((Class601) this).anInt7867 > 0) {
			((Class601) this).aClass106_Sub3_Sub2_7865.method10114(((Class601) this).anInt7867, ((Class601) this).anInt7871);
			((Class601) this).anInt7867 = -1;
		}
	}

	long method7070() {
		return (((Class601) this).anInt7867 == 0 ? ((Class601) this).aNativeHeapBuffer7873.method64() : 0L);
	}

	public int method55() {
		return ((Class601) this).anInt7871;
	}

	void method7071() throws Throwable {
		method39();
		super.finalize();
	}

	public long method221(int i, int i_3_) {
		OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
		return (OpenGL.glMapBufferARB(((Class601) this).anInt7868, 35001) + (long) i);
	}

	public long method222(int i, int i_4_) {
		OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
		return (OpenGL.glMapBufferARB(((Class601) this).anInt7868, 35001) + (long) i);
	}

	void method39() {
		if (((Class601) this).anInt7867 > 0) {
			((Class601) this).aClass106_Sub3_Sub2_7865.method10114(((Class601) this).anInt7867, ((Class601) this).anInt7871);
			((Class601) this).anInt7867 = -1;
		}
	}

	public int method45() {
		return ((Class601) this).anInt7871;
	}

	void method7072() {
		if (((Class601) this).anInt7867 < 0) {
			if (((Class106_Sub3_Sub2) ((Class601) this).aClass106_Sub3_Sub2_7865).aBool11098) {
				OpenGL.glGenBuffersARB(1, anIntArray7874, 0);
				((Class601) this).anInt7867 = anIntArray7874[0];
				OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
			} else
				((Class601) this).anInt7867 = 0;
		}
	}

	long method7073() {
		return (((Class601) this).anInt7867 == 0 ? ((Class601) this).aNativeHeapBuffer7873.method64() : 0L);
	}

	Class601(Class106_Sub3_Sub2 class106_sub3_sub2, int i, boolean bool) {
		((Class601) this).aClass106_Sub3_Sub2_7865 = class106_sub3_sub2;
		((Class601) this).anInt7868 = i;
		((Class601) this).aBool7872 = bool;
	}

	void method7074() {
		if (((Class106_Sub3_Sub2) ((Class601) this).aClass106_Sub3_Sub2_7865).aBool11098)
			OpenGL.glBindBufferARB(((Class601) this).anInt7868, ((Class601) this).anInt7867);
	}
}
