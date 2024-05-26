package game;

/* Class104_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class104_Sub1_Sub3_Sub1 extends Class104_Sub1_Sub3 {
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_11685;
	Interface68[] anInterface68Array11686 = new Interface68[4];
	int anInt11687;
	int anInt11688;
	int anInt11689;
	int anInt11690;
	int anInt11691;
	Interface68 anInterface68_11692;
	static final int anInt11693 = 16;

	void method10585() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692.method62(36096);
	}

	public int method1648() {
		return ((Class104_Sub1_Sub3_Sub1) this).anInt11688;
	}

	public int method1646() {
		return ((Class104_Sub1_Sub3_Sub1) this).anInt11689;
	}

	public int method1650() {
		return ((Class104_Sub1_Sub3_Sub1) this).anInt11688;
	}

	public void method9906(Interface11 interface11) {
		Interface68 interface68 = (Interface68) interface11;
		if (interface11 != null) {
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 != 0) {
				if ((((Class104_Sub1_Sub3_Sub1) this).anInt11688 != interface68.method42()) || (((Class104_Sub1_Sub3_Sub1) this).anInt11689 != interface68.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = interface68.method41();
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = interface68.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 |= 0x10;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 = interface68;
		} else {
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 &= ~0x10;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 = null;
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 == 0) {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = 0;
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(1502538427))
			method10588();
		else
			((Class104_Sub1_Sub3_Sub1) this).anInt11691 |= 0x10;
	}

	public boolean method9909() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method9910(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool | bool_5_) {
			int i_6_ = ((Class104_Sub1_Sub3_Sub1) this).anInt11689;
			int i_7_ = ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(-959484365).method1646();
			int i_8_ = 0;
			if (bool_5_)
				i_8_ |= 0x100;
			if (bool)
				i_8_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub3_Sub1) this).anInt11687));
			OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_, i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_, i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method10586(int i) {
		Interface68 interface68 = ((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i];
		if (interface68 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface68.method62(36064 + i);
	}

	boolean method126() {
		OpenGL.glBindFramebufferEXT(36160, (((Class104_Sub1_Sub3_Sub1) this).anInt11687));
		for (int i = 0; i < 4; i++) {
			if ((((Class104_Sub1_Sub3_Sub1) this).anInt11691 & 1 << i) != 0)
				method10587(i);
		}
		if ((((Class104_Sub1_Sub3_Sub1) this).anInt11691 & 0x10) != 0)
			method10588();
		((Class104_Sub1_Sub3_Sub1) this).anInt11691 = 0;
		return super.method126();
	}

	void method10587(int i) {
		Interface68 interface68 = ((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i];
		if (interface68 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface68.method62(36064 + i);
	}

	public void method120() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInt11687 != 0) {
			((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method10112(((Class104_Sub1_Sub3_Sub1) this).anInt11687);
			((Class104_Sub1_Sub3_Sub1) this).anInt11687 = 0;
		}
	}

	public void method9916(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
		if (bool | bool_14_) {
			int i_15_ = ((Class104_Sub1_Sub3_Sub1) this).anInt11689;
			int i_16_ = ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(1020519010).method1646();
			int i_17_ = 0;
			if (bool_14_)
				i_17_ |= 0x100;
			if (bool)
				i_17_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub3_Sub1) this).anInt11687));
			OpenGL.glBlitFramebufferEXT(i, i_15_ - i_9_ - i_11_, i + i_10_, i_15_ - i_9_, i_12_, i_16_ - i_13_ - i_11_, i_12_ + i_10_, i_16_ - i_13_, i_17_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method39();
	}

	public void method39() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInt11687 != 0) {
			((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method10112(((Class104_Sub1_Sub3_Sub1) this).anInt11687);
			((Class104_Sub1_Sub3_Sub1) this).anInt11687 = 0;
		}
	}

	public int method1651() {
		return ((Class104_Sub1_Sub3_Sub1) this).anInt11688;
	}

	public int method1652() {
		return ((Class104_Sub1_Sub3_Sub1) this).anInt11689;
	}

	public void method9911(int i, Interface6 interface6) {
		int i_18_ = 1 << i;
		Interface68 interface68 = (Interface68) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 != 0) {
				if ((((Class104_Sub1_Sub3_Sub1) this).anInt11688 != interface68.method42()) || (((Class104_Sub1_Sub3_Sub1) this).anInt11689 != interface68.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = interface68.method41();
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = interface68.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 |= i_18_;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = interface68;
		} else {
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 &= i_18_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = null;
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 == 0) {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = 0;
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(-571019184))
			method10587(i);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInt11691 |= i_18_;
	}

	public void method9912(int i, Interface6 interface6) {
		int i_19_ = 1 << i;
		Interface68 interface68 = (Interface68) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 != 0) {
				if ((((Class104_Sub1_Sub3_Sub1) this).anInt11688 != interface68.method42()) || (((Class104_Sub1_Sub3_Sub1) this).anInt11689 != interface68.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = interface68.method41();
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = interface68.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 |= i_19_;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = interface68;
		} else {
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 &= i_19_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = null;
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 == 0) {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = 0;
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(2004760163))
			method10587(i);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInt11691 |= i_19_;
	}

	public void method9913(Interface11 interface11) {
		Interface68 interface68 = (Interface68) interface11;
		if (interface11 != null) {
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 != 0) {
				if ((((Class104_Sub1_Sub3_Sub1) this).anInt11688 != interface68.method42()) || (((Class104_Sub1_Sub3_Sub1) this).anInt11689 != interface68.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = interface68.method41();
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = interface68.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 |= 0x10;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 = interface68;
		} else {
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 &= ~0x10;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 = null;
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 == 0) {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = 0;
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(54285053))
			method10588();
		else
			((Class104_Sub1_Sub3_Sub1) this).anInt11691 |= 0x10;
	}

	public boolean method9907() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method9914() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method131() {
		OpenGL.glBindFramebufferEXT(36160, (((Class104_Sub1_Sub3_Sub1) this).anInt11687));
		for (int i = 0; i < 4; i++) {
			if ((((Class104_Sub1_Sub3_Sub1) this).anInt11691 & 1 << i) != 0)
				method10587(i);
		}
		if ((((Class104_Sub1_Sub3_Sub1) this).anInt11691 & 0x10) != 0)
			method10588();
		((Class104_Sub1_Sub3_Sub1) this).anInt11691 = 0;
		return super.method126();
	}

	boolean method1647() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9915(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, boolean bool_25_) {
		if (bool | bool_25_) {
			int i_26_ = ((Class104_Sub1_Sub3_Sub1) this).anInt11689;
			int i_27_ = ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(-922581149).method1646();
			int i_28_ = 0;
			if (bool_25_)
				i_28_ |= 0x100;
			if (bool)
				i_28_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub3_Sub1) this).anInt11687));
			OpenGL.glBlitFramebufferEXT(i, i_26_ - i_20_ - i_22_, i + i_21_, i_26_ - i_20_, i_23_, i_27_ - i_24_ - i_22_, i_23_ + i_21_, i_27_ - i_24_, i_28_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method10588() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692.method62(36096);
	}

	public void method127() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInt11687 != 0) {
			((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method10112(((Class104_Sub1_Sub3_Sub1) this).anInt11687);
			((Class104_Sub1_Sub3_Sub1) this).anInt11687 = 0;
		}
	}

	public void method128() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInt11687 != 0) {
			((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method10112(((Class104_Sub1_Sub3_Sub1) this).anInt11687);
			((Class104_Sub1_Sub3_Sub1) this).anInt11687 = 0;
		}
	}

	void method10589() throws Throwable {
		super.finalize();
		method39();
	}

	boolean method1649() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9908(int i, Interface6 interface6) {
		int i_29_ = 1 << i;
		Interface68 interface68 = (Interface68) interface6;
		if (interface6 != null) {
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 != 0) {
				if ((((Class104_Sub1_Sub3_Sub1) this).anInt11688 != interface68.method42()) || (((Class104_Sub1_Sub3_Sub1) this).anInt11689 != interface68.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = interface68.method41();
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = interface68.method42();
				method10152();
			}
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 |= i_29_;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = interface68;
		} else {
			((Class104_Sub1_Sub3_Sub1) this).anInt11690 &= i_29_ ^ 0xffffffff;
			((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i] = null;
			if (((Class104_Sub1_Sub3_Sub1) this).anInt11690 == 0) {
				((Class104_Sub1_Sub3_Sub1) this).anInt11689 = 0;
				((Class104_Sub1_Sub3_Sub1) this).anInt11688 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.method1683(918098887))
			method10587(i);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInt11691 |= i_29_;
	}

	void method10590(int i) {
		Interface68 interface68 = ((Class104_Sub1_Sub3_Sub1) this).anInterface68Array11686[i];
		if (interface68 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface68.method62(36064 + i);
	}

	void method10591() {
		if (((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub3_Sub1) this).anInterface68_11692.method62(36096);
	}

	Class104_Sub1_Sub3_Sub1(Class106_Sub3_Sub2 class106_sub3_sub2) {
		super((Class106_Sub3) class106_sub3_sub2);
		((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685 = class106_sub3_sub2;
		int[] is = new int[1];
		if (!((Class104_Sub1_Sub3_Sub1) this).aClass106_Sub3_Sub2_11685.aBool10519)
			throw new RuntimeException("");
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class104_Sub1_Sub3_Sub1) this).anInt11687 = is[0];
	}
}
