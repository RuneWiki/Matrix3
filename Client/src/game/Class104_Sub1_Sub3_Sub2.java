package game;

/* Class104_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class104_Sub1_Sub3_Sub2 extends Class104_Sub1_Sub3 {
	int anInt11774;
	static final int anInt11775 = 16;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_11776;
	int anInt11777;
	int anInt11778;
	boolean aBool11779;
	Interface39 anInterface39_11780 = null;
	Interface20[] anInterface20Array11781 = new Interface20[4];

	public void method127() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method39();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method39();
		}
	}

	public int method1648() {
		return ((Class104_Sub1_Sub3_Sub2) this).anInt11777;
	}

	public int method1646() {
		return ((Class104_Sub1_Sub3_Sub2) this).anInt11774;
	}

	public void method9906(Interface11 interface11) {
		Interface39 interface39 = (Interface39) interface11;
		if (interface11 != null) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 != 0) {
				if ((((Class104_Sub1_Sub3_Sub2) this).anInt11777 != interface39.method42()) || (((Class104_Sub1_Sub3_Sub2) this).anInt11774 != interface39.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = interface39.method41();
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = interface39.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 |= 0x10;
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 = interface39;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10660(interface39.method123());
		} else {
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 &= ~0x10;
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 = null;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10660(0L);
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 == 0) {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = 0;
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = 0;
			}
		}
	}

	public void finalize() throws Throwable {
		method10662();
		super.finalize();
	}

	boolean method10659(int i, long l) {
		return Class32.method767(IDirect3DDevice.SetRenderTarget(((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066, i, l));
	}

	boolean method10660(long l) {
		return Class32.method767(IDirect3DDevice.SetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066, l));
	}

	public void method39() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method39();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method39();
		}
	}

	void method10661() throws Throwable {
		method10662();
		super.finalize();
	}

	boolean method1649() {
		for (int i = 1; i < 4; i++) {
			Interface20 interface20 = ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i];
			if (interface20 != null)
				method10659(i, 0L);
		}
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			method10660(0L);
		((Class104_Sub1_Sub3_Sub2) this).aBool11779 = false;
		return true;
	}

	boolean method126() {
		for (int i = 0; i < 4; i++) {
			Interface20 interface20 = ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i];
			if (interface20 != null) {
				long l = interface20.method123();
				method10659(i, l);
			}
		}
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			method10660(((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method123());
		((Class104_Sub1_Sub3_Sub2) this).aBool11779 = true;
		return super.method126();
	}

	public void method9911(int i, Interface6 interface6) {
		int i_0_ = 1 << i;
		Interface20 interface20 = (Interface20) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 != 0) {
				if ((((Class104_Sub1_Sub3_Sub2) this).anInt11777 != interface20.method42()) || (((Class104_Sub1_Sub3_Sub2) this).anInt11774 != interface20.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = interface20.method41();
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = interface20.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 |= i_0_;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = interface20;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, interface20.method123());
		} else {
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 &= i_0_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = null;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, 0L);
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 == 0) {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = 0;
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = 0;
			}
		}
	}

	public void method9910(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool) {
			long l = (IDirect3DDevice.GetRenderTarget((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), 0));
			IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0].method123(), i, i_1_, i_2_, i_3_, l, i_4_, i_5_, i_2_, i_3_, 0);
			IUnknown.Release(l);
		}
	}

	public void method9908(int i, Interface6 interface6) {
		int i_7_ = 1 << i;
		Interface20 interface20 = (Interface20) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 != 0) {
				if ((((Class104_Sub1_Sub3_Sub2) this).anInt11777 != interface20.method42()) || (((Class104_Sub1_Sub3_Sub2) this).anInt11774 != interface20.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = interface20.method41();
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = interface20.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 |= i_7_;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = interface20;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, interface20.method123());
		} else {
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 &= i_7_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = null;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, 0L);
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 == 0) {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = 0;
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = 0;
			}
		}
	}

	public int method1650() {
		return ((Class104_Sub1_Sub3_Sub2) this).anInt11777;
	}

	public int method1652() {
		return ((Class104_Sub1_Sub3_Sub2) this).anInt11774;
	}

	public int method1651() {
		return ((Class104_Sub1_Sub3_Sub2) this).anInt11777;
	}

	public void method9912(int i, Interface6 interface6) {
		int i_8_ = 1 << i;
		Interface20 interface20 = (Interface20) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 != 0) {
				if ((((Class104_Sub1_Sub3_Sub2) this).anInt11777 != interface20.method42()) || (((Class104_Sub1_Sub3_Sub2) this).anInt11774 != interface20.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = interface20.method41();
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = interface20.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 |= i_8_;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = interface20;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, interface20.method123());
		} else {
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 &= i_8_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] = null;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10659(i, 0L);
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 == 0) {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = 0;
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = 0;
			}
		}
	}

	public void method9913(Interface11 interface11) {
		Interface39 interface39 = (Interface39) interface11;
		if (interface11 != null) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 != 0) {
				if ((((Class104_Sub1_Sub3_Sub2) this).anInt11777 != interface39.method42()) || (((Class104_Sub1_Sub3_Sub2) this).anInt11774 != interface39.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = interface39.method41();
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = interface39.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 |= 0x10;
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 = interface39;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10660(interface39.method123());
		} else {
			((Class104_Sub1_Sub3_Sub2) this).anInt11778 &= ~0x10;
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 = null;
			if (((Class104_Sub1_Sub3_Sub2) this).aBool11779)
				method10660(0L);
			if (((Class104_Sub1_Sub3_Sub2) this).anInt11778 == 0) {
				((Class104_Sub1_Sub3_Sub2) this).anInt11774 = 0;
				((Class104_Sub1_Sub3_Sub2) this).anInt11777 = 0;
			}
		}
	}

	public boolean method9907() {
		return (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0] != null);
	}

	public boolean method9914() {
		return (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0] != null);
	}

	boolean method131() {
		for (int i = 0; i < 4; i++) {
			Interface20 interface20 = ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i];
			if (interface20 != null) {
				long l = interface20.method123();
				method10659(i, l);
			}
		}
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			method10660(((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method123());
		((Class104_Sub1_Sub3_Sub2) this).aBool11779 = true;
		return super.method126();
	}

	boolean method1647() {
		for (int i = 1; i < 4; i++) {
			Interface20 interface20 = ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i];
			if (interface20 != null)
				method10659(i, 0L);
		}
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			method10660(0L);
		((Class104_Sub1_Sub3_Sub2) this).aBool11779 = false;
		return true;
	}

	public void method9915(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
		if (bool) {
			long l = (IDirect3DDevice.GetRenderTarget((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), 0));
			IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0].method123(), i, i_9_, i_10_, i_11_, l, i_12_, i_13_, i_10_, i_11_, 0);
			IUnknown.Release(l);
		}
	}

	void method10662() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method106();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method106();
		}
	}

	public boolean method9909() {
		return (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0] != null);
	}

	Class104_Sub1_Sub3_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1) {
		super((Class106_Sub3) class106_sub3_sub1);
		((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776 = class106_sub3_sub1;
	}

	public void method120() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method39();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method39();
		}
	}

	public void method9916(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, boolean bool, boolean bool_20_) {
		if (bool) {
			long l = (IDirect3DDevice.GetRenderTarget((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), 0));
			IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class104_Sub1_Sub3_Sub2) this).aClass106_Sub3_Sub1_11776)).aLong11066), ((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[0].method123(), i, i_15_, i_16_, i_17_, l, i_18_, i_19_, i_16_, i_17_, 0);
			IUnknown.Release(l);
		}
	}

	public void method128() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method39();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method39();
		}
	}

	void method10663() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method106();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method106();
		}
	}

	void method10664() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method106();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method106();
		}
	}

	void method10665() {
		if (((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780 != null)
			((Class104_Sub1_Sub3_Sub2) this).anInterface39_11780.method106();
		for (int i = 0; i < (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781).length; i++) {
			if (((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i] != null)
				((Class104_Sub1_Sub3_Sub2) this).anInterface20Array11781[i].method106();
		}
	}
}
