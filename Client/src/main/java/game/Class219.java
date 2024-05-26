package game;

/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IUnknown;

public abstract class Class219 implements Interface42 {
	Class88 aClass88_2512;
	Class171 aClass171_2513;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_2514;
	boolean aBool2515;
	long aLong2516 = 0L;

	void method3093() {
		if (((Class219) this).aLong2516 != 0L) {
			((Class219) this).aClass106_Sub3_Sub1_2514.method10097(((Class219) this).aLong2516);
			((Class219) this).aLong2516 = 0L;
		}
	}

	long method3094() {
		return ((Class219) this).aLong2516;
	}

	public void method203(Class367 class367) {
		/* empty */
	}

	public void method39() {
		if (((Class219) this).aLong2516 != 0L) {
			IUnknown.Release(((Class219) this).aLong2516);
			((Class219) this).aLong2516 = 0L;
		}
		((Class219) this).aClass106_Sub3_Sub1_2514.method9573(this);
	}

	public void method38() {
		if (((Class219) this).aLong2516 != 0L) {
			IUnknown.Release(((Class219) this).aLong2516);
			((Class219) this).aLong2516 = 0L;
		}
		((Class219) this).aClass106_Sub3_Sub1_2514.method9573(this);
	}

	public void finalize() {
		method3099();
	}

	long method3095() {
		return ((Class219) this).aLong2516;
	}

	void method3096() {
		method3099();
	}

	long method3097() {
		return ((Class219) this).aLong2516;
	}

	public void method207(Class367 class367) {
		/* empty */
	}

	public void method201(Class367 class367) {
		/* empty */
	}

	Class219(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, Class88 class88, boolean bool, int i) {
		((Class219) this).aClass106_Sub3_Sub1_2514 = class106_sub3_sub1;
		((Class219) this).aClass171_2513 = class171;
		((Class219) this).aClass88_2512 = class88;
		((Class219) this).aBool2515 = bool;
		((Class219) this).aClass106_Sub3_Sub1_2514.method9803(this);
	}

	long method3098() {
		return ((Class219) this).aLong2516;
	}

	void method3099() {
		if (((Class219) this).aLong2516 != 0L) {
			((Class219) this).aClass106_Sub3_Sub1_2514.method10097(((Class219) this).aLong2516);
			((Class219) this).aLong2516 = 0L;
		}
	}
}
