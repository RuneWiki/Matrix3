package game;

/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class205 implements Interface44 {
	int anInt2412;
	byte aByte2413;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_2414;
	int anInt2415;
	boolean aBool2416;
	long aLong2417 = 0L;

	void method3016() {
		if (((Class205) this).aLong2417 != 0L) {
			((Class205) this).aClass106_Sub3_Sub1_2414.method10097(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
			((Class205) this).anInt2412 = 0;
			((Class205) this).anInt2415 = 0;
		}
	}

	public int method45() {
		return ((Class205) this).anInt2415;
	}

	int method3017() {
		return ((Class205) this).aByte2413;
	}

	public boolean method259(int i, int i_0_) {
		((Class205) this).anInt2415 = i;
		((Class205) this).aByte2413 = (byte) i_0_;
		if (((Class205) this).anInt2415 > ((Class205) this).anInt2412) {
			int i_1_ = 8;
			int i_2_;
			if (((Class205) this).aBool2416) {
				i_2_ = 0;
				i_1_ |= 0x200;
			} else
				i_2_ = 1;
			if (((Class205) this).aLong2417 != 0L)
				IUnknown.Release(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = (IDirect3DDevice.CreateVertexBuffer(((Class106_Sub3_Sub1) ((Class205) this).aClass106_Sub3_Sub1_2414).aLong11066, ((Class205) this).anInt2415, i_1_, 0, i_2_));
			((Class205) this).anInt2412 = ((Class205) this).anInt2415;
		}
		return ((Class205) this).aLong2417 != 0L;
	}

	void method3018() {
		method3022();
	}

	public void method110() {
		IDirect3DVertexBuffer.Unlock(((Class205) this).aLong2417);
	}

	public boolean method223(int i, int i_3_, long l) {
		return Class32.method767(IDirect3DVertexBuffer.Upload(((Class205) this).aLong2417, i, i_3_, ((Class205) this).aBool2416 ? 8192 : 0, l));
	}

	public void method39() {
		if (((Class205) this).aLong2417 != 0L) {
			IUnknown.Release(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
		}
		((Class205) this).anInt2412 = 0;
		((Class205) this).anInt2415 = 0;
		((Class205) this).aClass106_Sub3_Sub1_2414.method9573(this);
	}

	int method3019() {
		return ((Class205) this).aByte2413;
	}

	public void finalize() {
		method3022();
	}

	public void method38() {
		if (((Class205) this).aLong2417 != 0L) {
			IUnknown.Release(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
		}
		((Class205) this).anInt2412 = 0;
		((Class205) this).anInt2415 = 0;
		((Class205) this).aClass106_Sub3_Sub1_2414.method9573(this);
	}

	public boolean method258(int i, int i_4_) {
		((Class205) this).anInt2415 = i;
		((Class205) this).aByte2413 = (byte) i_4_;
		if (((Class205) this).anInt2415 > ((Class205) this).anInt2412) {
			int i_5_ = 8;
			int i_6_;
			if (((Class205) this).aBool2416) {
				i_6_ = 0;
				i_5_ |= 0x200;
			} else
				i_6_ = 1;
			if (((Class205) this).aLong2417 != 0L)
				IUnknown.Release(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = (IDirect3DDevice.CreateVertexBuffer(((Class106_Sub3_Sub1) ((Class205) this).aClass106_Sub3_Sub1_2414).aLong11066, ((Class205) this).anInt2415, i_5_, 0, i_6_));
			((Class205) this).anInt2412 = ((Class205) this).anInt2415;
		}
		return ((Class205) this).aLong2417 != 0L;
	}

	int method3020() {
		return ((Class205) this).aByte2413;
	}

	public int method55() {
		return ((Class205) this).anInt2415;
	}

	public boolean method220(int i, int i_7_, long l) {
		return Class32.method767(IDirect3DVertexBuffer.Upload(((Class205) this).aLong2417, i, i_7_, ((Class205) this).aBool2416 ? 8192 : 0, l));
	}

	public long method221(int i, int i_8_) {
		return IDirect3DVertexBuffer.Lock(((Class205) this).aLong2417, i, i_8_, (((Class205) this).aBool2416 ? 8192 : 0));
	}

	public long method222(int i, int i_9_) {
		return IDirect3DVertexBuffer.Lock(((Class205) this).aLong2417, i, i_9_, (((Class205) this).aBool2416 ? 8192 : 0));
	}

	public void method120() {
		IDirect3DVertexBuffer.Unlock(((Class205) this).aLong2417);
	}

	Class205(Class106_Sub3_Sub1 class106_sub3_sub1, boolean bool) {
		((Class205) this).aClass106_Sub3_Sub1_2414 = class106_sub3_sub1;
		((Class205) this).aBool2416 = bool;
		((Class205) this).aClass106_Sub3_Sub1_2414.method9803(this);
	}

	public long method219(int i, int i_10_) {
		return IDirect3DVertexBuffer.Lock(((Class205) this).aLong2417, i, i_10_, (((Class205) this).aBool2416 ? 8192 : 0));
	}

	void method3021() {
		if (((Class205) this).aLong2417 != 0L) {
			((Class205) this).aClass106_Sub3_Sub1_2414.method10097(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
			((Class205) this).anInt2412 = 0;
			((Class205) this).anInt2415 = 0;
		}
	}

	void method3022() {
		if (((Class205) this).aLong2417 != 0L) {
			((Class205) this).aClass106_Sub3_Sub1_2414.method10097(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
			((Class205) this).anInt2412 = 0;
			((Class205) this).anInt2415 = 0;
		}
	}

	void method3023() {
		if (((Class205) this).aLong2417 != 0L) {
			((Class205) this).aClass106_Sub3_Sub1_2414.method10097(((Class205) this).aLong2417);
			((Class205) this).aLong2417 = 0L;
			((Class205) this).anInt2412 = 0;
			((Class205) this).anInt2415 = 0;
		}
	}
}
