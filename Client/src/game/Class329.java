package game;

/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class329 implements Interface20 {
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_4210;
	long aLong4211;
	Class171 aClass171_4212;
	Class88 aClass88_4213;
	int anInt4214;
	int anInt4215;

	void method4156() {
		method106();
	}

	public int method43() {
		return ((Class329) this).anInt4215;
	}

	public int method41() {
		return ((Class329) this).anInt4214;
	}

	public void method38() {
		if (((Class329) this).aLong4211 != 0L) {
			IUnknown.Release(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
		((Class329) this).aClass106_Sub3_Sub1_4210.method9573(this);
	}

	public void method39() {
		if (((Class329) this).aLong4211 != 0L) {
			IUnknown.Release(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
		((Class329) this).aClass106_Sub3_Sub1_4210.method9573(this);
	}

	public void method106() {
		if (((Class329) this).aLong4211 != 0L) {
			((Class329) this).aClass106_Sub3_Sub1_4210.method10097(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
	}

	public void finalize() {
		method106();
	}

	public int method45() {
		return ((Class329) this).anInt4215;
	}

	public long method54() {
		return ((Class329) this).aLong4211;
	}

	Class329(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, Class88 class88, int i, int i_0_, int i_1_) {
		((Class329) this).aClass106_Sub3_Sub1_4210 = class106_sub3_sub1;
		((Class329) this).anInt4215 = i;
		((Class329) this).anInt4214 = i_0_;
		((Class329) this).aClass171_4212 = class171;
		((Class329) this).aClass88_4213 = class88;
		((Class329) this).aLong4211 = (IDirect3DDevice.CreateRenderTarget(((Class106_Sub3_Sub1) ((Class329) this).aClass106_Sub3_Sub1_4210).aLong11066, i, i_0_, Class106_Sub3_Sub1.method10094((((Class329) this).aClass171_4212), (((Class329) this).aClass88_4213)), 0 + i_1_, 0, false));
		((Class329) this).aClass106_Sub3_Sub1_4210.method9803(this);
	}

	public int method40() {
		return ((Class329) this).anInt4214;
	}

	public int method44() {
		return ((Class329) this).anInt4214;
	}

	public long method123() {
		return ((Class329) this).aLong4211;
	}

	public long method66() {
		return ((Class329) this).aLong4211;
	}

	public int method42() {
		return ((Class329) this).anInt4215;
	}

	public void method120() {
		if (((Class329) this).aLong4211 != 0L) {
			((Class329) this).aClass106_Sub3_Sub1_4210.method10097(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
	}

	public void method122() {
		if (((Class329) this).aLong4211 != 0L) {
			((Class329) this).aClass106_Sub3_Sub1_4210.method10097(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
	}

	public void method121() {
		if (((Class329) this).aLong4211 != 0L) {
			((Class329) this).aClass106_Sub3_Sub1_4210.method10097(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
	}

	public void method124() {
		if (((Class329) this).aLong4211 != 0L) {
			((Class329) this).aClass106_Sub3_Sub1_4210.method10097(((Class329) this).aLong4211);
			((Class329) this).aLong4211 = 0L;
		}
	}
}
