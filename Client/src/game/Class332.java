package game;

/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class332 implements Interface20, Interface39 {
	int anInt4253;
	Class219_Sub2_Sub1 aClass219_Sub2_Sub1_4254;
	long aLong4255;

	public void method121() {
		if (((Class332) this).aLong4255 != 0L) {
			((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method10097(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
	}

	Class332(Class219_Sub2_Sub1 class219_sub2_sub1, int i) {
		((Class332) this).anInt4253 = i;
		((Class332) this).aClass219_Sub2_Sub1_4254 = class219_sub2_sub1;
		((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method9803(this);
	}

	public int method41() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method41();
	}

	public long method123() {
		if (((Class332) this).aLong4255 == 0L)
			((Class332) this).aLong4255 = (IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aLong2516, ((Class332) this).anInt4253));
		return ((Class332) this).aLong4255;
	}

	public int method44() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method41();
	}

	public void method106() {
		if (((Class332) this).aLong4255 != 0L) {
			((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method10097(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
	}

	public void finalize() {
		method106();
	}

	public int method45() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method42();
	}

	public long method54() {
		if (((Class332) this).aLong4255 == 0L)
			((Class332) this).aLong4255 = (IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aLong2516, ((Class332) this).anInt4253));
		return ((Class332) this).aLong4255;
	}

	public int method43() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method42();
	}

	public int method40() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method41();
	}

	public int method42() {
		return ((Class332) this).aClass219_Sub2_Sub1_4254.method42();
	}

	void method4179() {
		method106();
	}

	public long method66() {
		if (((Class332) this).aLong4255 == 0L)
			((Class332) this).aLong4255 = (IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aLong2516, ((Class332) this).anInt4253));
		return ((Class332) this).aLong4255;
	}

	public void method38() {
		if (((Class332) this).aLong4255 != 0L) {
			IUnknown.Release(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
		((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method9573(this);
	}

	public void method120() {
		if (((Class332) this).aLong4255 != 0L) {
			((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method10097(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
	}

	public void method122() {
		if (((Class332) this).aLong4255 != 0L) {
			((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method10097(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
	}

	public void method39() {
		if (((Class332) this).aLong4255 != 0L) {
			IUnknown.Release(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
		((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method9573(this);
	}

	public void method124() {
		if (((Class332) this).aLong4255 != 0L) {
			((Class219_Sub2_Sub1) ((Class332) this).aClass219_Sub2_Sub1_4254).aClass106_Sub3_Sub1_2514.method10097(((Class332) this).aLong4255);
			((Class332) this).aLong4255 = 0L;
		}
	}
}
