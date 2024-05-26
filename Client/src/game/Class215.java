package game;

/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class215 implements Interface46 {
	Class88 aClass88_2497;
	int anInt2498;
	int anInt2499;
	boolean aBool2500;
	long aLong2501 = 0L;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_2502;

	public boolean method223(int i, int i_0_, long l) {
		return Class32.method767(IDirect3DIndexBuffer.Upload(((Class215) this).aLong2501, i, i_0_, ((Class215) this).aBool2500 ? 8192 : 0, l));
	}

	Class215(Class106_Sub3_Sub1 class106_sub3_sub1, Class88 class88, boolean bool) {
		((Class215) this).aClass106_Sub3_Sub1_2502 = class106_sub3_sub1;
		((Class215) this).aClass88_2497 = class88;
		((Class215) this).aBool2500 = bool;
		((Class215) this).aClass106_Sub3_Sub1_2502.method9803(this);
	}

	public Class88 method263() {
		return ((Class215) this).aClass88_2497;
	}

	public void method120() {
		IDirect3DIndexBuffer.Unlock(((Class215) this).aLong2501);
	}

	public long method219(int i, int i_1_) {
		return IDirect3DIndexBuffer.Lock(((Class215) this).aLong2501, i, i_1_, (((Class215) this).aBool2500 ? 8192 : 0));
	}

	public void method110() {
		IDirect3DIndexBuffer.Unlock(((Class215) this).aLong2501);
	}

	public long method222(int i, int i_2_) {
		return IDirect3DIndexBuffer.Lock(((Class215) this).aLong2501, i, i_2_, (((Class215) this).aBool2500 ? 8192 : 0));
	}

	void method3075() {
		if (((Class215) this).aLong2501 != 0L) {
			((Class215) this).aClass106_Sub3_Sub1_2502.method10097(((Class215) this).aLong2501);
			((Class215) this).aLong2501 = 0L;
		}
		((Class215) this).anInt2499 = 0;
		((Class215) this).anInt2498 = 0;
	}

	public void method265(int i) {
		((Class215) this).anInt2498 = ((Class215) this).aClass88_2497.anInt1223 * -1071269501 * i;
		if (((Class215) this).anInt2498 > ((Class215) this).anInt2499) {
			if (((Class215) this).aLong2501 != 0L)
				IUnknown.Release(((Class215) this).aLong2501);
			int i_3_ = 8;
			int i_4_;
			if (((Class215) this).aBool2500) {
				i_4_ = 0;
				i_3_ |= 0x200;
			} else
				i_4_ = 1;
			((Class215) this).aLong2501 = (IDirect3DDevice.CreateIndexBuffer(((Class106_Sub3_Sub1) ((Class215) this).aClass106_Sub3_Sub1_2502).aLong11066, ((Class215) this).anInt2498, i_3_, (((Class215) this).aClass88_2497 == Class88.aClass88_1217 ? 101 : 102), i_4_));
			((Class215) this).anInt2499 = ((Class215) this).anInt2498;
		}
	}

	public void finalize() {
		method3075();
	}

	public void method38() {
		if (((Class215) this).aLong2501 != 0L) {
			IUnknown.Release(((Class215) this).aLong2501);
			((Class215) this).aLong2501 = 0L;
		}
		((Class215) this).anInt2499 = 0;
		((Class215) this).anInt2498 = 0;
		((Class215) this).aClass106_Sub3_Sub1_2502.method9573(this);
	}

	void method3076() {
		method3075();
	}

	public int method55() {
		return ((Class215) this).anInt2498;
	}

	public boolean method220(int i, int i_5_, long l) {
		return Class32.method767(IDirect3DIndexBuffer.Upload(((Class215) this).aLong2501, i, i_5_, ((Class215) this).aBool2500 ? 8192 : 0, l));
	}

	public long method221(int i, int i_6_) {
		return IDirect3DIndexBuffer.Lock(((Class215) this).aLong2501, i, i_6_, (((Class215) this).aBool2500 ? 8192 : 0));
	}

	public void method39() {
		if (((Class215) this).aLong2501 != 0L) {
			IUnknown.Release(((Class215) this).aLong2501);
			((Class215) this).aLong2501 = 0L;
		}
		((Class215) this).anInt2499 = 0;
		((Class215) this).anInt2498 = 0;
		((Class215) this).aClass106_Sub3_Sub1_2502.method9573(this);
	}

	public Class88 method264() {
		return ((Class215) this).aClass88_2497;
	}

	public void method262(int i) {
		((Class215) this).anInt2498 = ((Class215) this).aClass88_2497.anInt1223 * -1071269501 * i;
		if (((Class215) this).anInt2498 > ((Class215) this).anInt2499) {
			if (((Class215) this).aLong2501 != 0L)
				IUnknown.Release(((Class215) this).aLong2501);
			int i_7_ = 8;
			int i_8_;
			if (((Class215) this).aBool2500) {
				i_8_ = 0;
				i_7_ |= 0x200;
			} else
				i_8_ = 1;
			((Class215) this).aLong2501 = (IDirect3DDevice.CreateIndexBuffer(((Class106_Sub3_Sub1) ((Class215) this).aClass106_Sub3_Sub1_2502).aLong11066, ((Class215) this).anInt2498, i_7_, (((Class215) this).aClass88_2497 == Class88.aClass88_1217 ? 101 : 102), i_8_));
			((Class215) this).anInt2499 = ((Class215) this).anInt2498;
		}
	}

	public int method45() {
		return ((Class215) this).anInt2498;
	}

	void method3077() {
		if (((Class215) this).aLong2501 != 0L) {
			((Class215) this).aClass106_Sub3_Sub1_2502.method10097(((Class215) this).aLong2501);
			((Class215) this).aLong2501 = 0L;
		}
		((Class215) this).anInt2499 = 0;
		((Class215) this).anInt2498 = 0;
	}

	void method3078() {
		if (((Class215) this).aLong2501 != 0L) {
			((Class215) this).aClass106_Sub3_Sub1_2502.method10097(((Class215) this).aLong2501);
			((Class215) this).aLong2501 = 0L;
		}
		((Class215) this).anInt2499 = 0;
		((Class215) this).anInt2498 = 0;
	}
}
