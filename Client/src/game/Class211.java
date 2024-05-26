package game;

/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class211 implements Interface39 {
	long aLong2441;
	Class88 aClass88_2442;
	int anInt2443;
	int anInt2444;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_2445;

	Class211(Class106_Sub3_Sub1 class106_sub3_sub1, Class88 class88, int i, int i_0_, int i_1_) {
		((Class211) this).aClass106_Sub3_Sub1_2445 = class106_sub3_sub1;
		((Class211) this).anInt2443 = i;
		((Class211) this).anInt2444 = i_0_;
		((Class211) this).aClass88_2442 = class88;
		((Class211) this).aLong2441 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) ((Class211) this).aClass106_Sub3_Sub1_2445).aLong11066, i, i_0_, Class106_Sub3_Sub1.method10087(((Class211) this).aClass88_2442), 0 + i_1_, 0, false));
		((Class211) this).aClass106_Sub3_Sub1_2445.method9803(this);
	}

	public int method42() {
		return ((Class211) this).anInt2443;
	}

	public void method120() {
		if (((Class211) this).aLong2441 != 0L) {
			((Class211) this).aClass106_Sub3_Sub1_2445.method10097(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
	}

	public long method123() {
		return ((Class211) this).aLong2441;
	}

	public long method66() {
		return ((Class211) this).aLong2441;
	}

	public void method39() {
		if (((Class211) this).aLong2441 != 0L) {
			IUnknown.Release(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
		((Class211) this).aClass106_Sub3_Sub1_2445.method9573(this);
	}

	public int method41() {
		return ((Class211) this).anInt2444;
	}

	public int method45() {
		return ((Class211) this).anInt2443;
	}

	public void finalize() {
		method106();
	}

	public void method38() {
		if (((Class211) this).aLong2441 != 0L) {
			IUnknown.Release(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
		((Class211) this).aClass106_Sub3_Sub1_2445.method9573(this);
	}

	public int method40() {
		return ((Class211) this).anInt2444;
	}

	public int method44() {
		return ((Class211) this).anInt2444;
	}

	public void method106() {
		if (((Class211) this).aLong2441 != 0L) {
			((Class211) this).aClass106_Sub3_Sub1_2445.method10097(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
	}

	void method3054() {
		method106();
	}

	public long method54() {
		return ((Class211) this).aLong2441;
	}

	public int method43() {
		return ((Class211) this).anInt2443;
	}

	public void method122() {
		if (((Class211) this).aLong2441 != 0L) {
			((Class211) this).aClass106_Sub3_Sub1_2445.method10097(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
	}

	public void method121() {
		if (((Class211) this).aLong2441 != 0L) {
			((Class211) this).aClass106_Sub3_Sub1_2445.method10097(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
	}

	public void method124() {
		if (((Class211) this).aLong2441 != 0L) {
			((Class211) this).aClass106_Sub3_Sub1_2445.method10097(((Class211) this).aLong2441);
			((Class211) this).aLong2441 = 0L;
		}
	}
}
