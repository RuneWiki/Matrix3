package game;

/* Class104_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class104_Sub1_Sub1 extends Class104_Sub1 {
	Class106_Sub1 aClass106_Sub1_11129;
	Interface10 anInterface10_11130;
	Interface10[] anInterface10Array11131 = new Interface10[4];
	int anInt11132;
	int anInt11133;
	int anInt11134;
	int anInt11135;
	int anInt11136;
	static final int anInt11137 = 16;

	Class104_Sub1_Sub1(Class106_Sub1 class106_sub1) {
		if (!((Class106_Sub1) class106_sub1).aBool10124)
			throw new IllegalStateException("");
		((Class104_Sub1_Sub1) this).aClass106_Sub1_11129 = class106_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class104_Sub1_Sub1) this).anInt11133 = is[0];
	}

	public void method120() {
		if (((Class104_Sub1_Sub1) this).anInt11133 != 0) {
			((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9440(((Class104_Sub1_Sub1) this).anInt11133);
			((Class104_Sub1_Sub1) this).anInt11133 = 0;
		}
	}

	public int method1646() {
		return ((Class104_Sub1_Sub1) this).anInt11136;
	}

	public void method9908(int i, Interface6 interface6) {
		int i_0_ = 1 << i;
		Interface10 interface10 = (Interface10) interface6;
		if (interface6 != null) {
			if ((((Class104_Sub1_Sub1) this).anInt11134 | i_0_) != i_0_) {
				if ((((Class104_Sub1_Sub1) this).anInt11132 != interface10.method42()) || (((Class104_Sub1_Sub1) this).anInt11136 != interface10.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub1) this).anInt11136 = interface10.method41();
				((Class104_Sub1_Sub1) this).anInt11132 = interface10.method42();
				if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(-1005267808))
					((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9382();
			}
			((Class104_Sub1_Sub1) this).anInt11134 |= i_0_;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = interface10;
		} else {
			((Class104_Sub1_Sub1) this).anInt11134 &= i_0_ ^ 0xffffffff;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = null;
			if (((Class104_Sub1_Sub1) this).anInt11134 == 0) {
				((Class104_Sub1_Sub1) this).anInt11136 = 0;
				((Class104_Sub1_Sub1) this).anInt11132 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(975420133))
			method10133(i);
		else
			((Class104_Sub1_Sub1) this).anInt11135 |= i_0_;
	}

	public void method9906(Interface11 interface11) {
		Interface10 interface10 = (Interface10) interface11;
		if (interface11 != null) {
			if ((((Class104_Sub1_Sub1) this).anInt11134 | 0x10) != 16) {
				if ((((Class104_Sub1_Sub1) this).anInt11132 != interface10.method42()) || (((Class104_Sub1_Sub1) this).anInt11136 != interface10.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub1) this).anInt11136 = interface10.method41();
				((Class104_Sub1_Sub1) this).anInt11132 = interface10.method42();
				if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(527435878))
					((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9382();
			}
			((Class104_Sub1_Sub1) this).anInt11134 |= 0x10;
			((Class104_Sub1_Sub1) this).anInterface10_11130 = interface10;
		} else {
			((Class104_Sub1_Sub1) this).anInt11134 &= ~0x10;
			((Class104_Sub1_Sub1) this).anInterface10_11130 = null;
			if (((Class104_Sub1_Sub1) this).anInt11134 == 0) {
				((Class104_Sub1_Sub1) this).anInt11136 = 0;
				((Class104_Sub1_Sub1) this).anInt11132 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1480116705))
			method10134();
		else
			((Class104_Sub1_Sub1) this).anInt11135 |= 0x10;
	}

	void method10133(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	void method10134() {
		if (((Class104_Sub1_Sub1) this).anInterface10_11130 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub1) this).anInterface10_11130.method62(36096);
	}

	public boolean method9909() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	void method10135(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	public int method1648() {
		return ((Class104_Sub1_Sub1) this).anInt11132;
	}

	void method10136(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public void method9911(int i, Interface6 interface6) {
		int i_1_ = 1 << i;
		Interface10 interface10 = (Interface10) interface6;
		if (interface6 != null) {
			if ((((Class104_Sub1_Sub1) this).anInt11134 | i_1_) != i_1_) {
				if ((((Class104_Sub1_Sub1) this).anInt11132 != interface10.method42()) || (((Class104_Sub1_Sub1) this).anInt11136 != interface10.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub1) this).anInt11136 = interface10.method41();
				((Class104_Sub1_Sub1) this).anInt11132 = interface10.method42();
				if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1495319303))
					((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9382();
			}
			((Class104_Sub1_Sub1) this).anInt11134 |= i_1_;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = interface10;
		} else {
			((Class104_Sub1_Sub1) this).anInt11134 &= i_1_ ^ 0xffffffff;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = null;
			if (((Class104_Sub1_Sub1) this).anInt11134 == 0) {
				((Class104_Sub1_Sub1) this).anInt11136 = 0;
				((Class104_Sub1_Sub1) this).anInt11132 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(17392111))
			method10133(i);
		else
			((Class104_Sub1_Sub1) this).anInt11135 |= i_1_;
	}

	public int method1651() {
		return ((Class104_Sub1_Sub1) this).anInt11132;
	}

	public void finalize() throws Throwable {
		super.finalize();
		method39();
	}

	public void method9913(Interface11 interface11) {
		Interface10 interface10 = (Interface10) interface11;
		if (interface11 != null) {
			if ((((Class104_Sub1_Sub1) this).anInt11134 | 0x10) != 16) {
				if ((((Class104_Sub1_Sub1) this).anInt11132 != interface10.method42()) || (((Class104_Sub1_Sub1) this).anInt11136 != interface10.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub1) this).anInt11136 = interface10.method41();
				((Class104_Sub1_Sub1) this).anInt11132 = interface10.method42();
				if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(-865280949))
					((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9382();
			}
			((Class104_Sub1_Sub1) this).anInt11134 |= 0x10;
			((Class104_Sub1_Sub1) this).anInterface10_11130 = interface10;
		} else {
			((Class104_Sub1_Sub1) this).anInt11134 &= ~0x10;
			((Class104_Sub1_Sub1) this).anInterface10_11130 = null;
			if (((Class104_Sub1_Sub1) this).anInt11134 == 0) {
				((Class104_Sub1_Sub1) this).anInt11136 = 0;
				((Class104_Sub1_Sub1) this).anInt11132 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(637782437))
			method10134();
		else
			((Class104_Sub1_Sub1) this).anInt11135 |= 0x10;
	}

	public void method127() {
		if (((Class104_Sub1_Sub1) this).anInt11133 != 0) {
			((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9440(((Class104_Sub1_Sub1) this).anInt11133);
			((Class104_Sub1_Sub1) this).anInt11133 = 0;
		}
	}

	public int method1652() {
		return ((Class104_Sub1_Sub1) this).anInt11136;
	}

	public int method1650() {
		return ((Class104_Sub1_Sub1) this).anInt11132;
	}

	public void method9912(int i, Interface6 interface6) {
		int i_2_ = 1 << i;
		Interface10 interface10 = (Interface10) interface6;
		if (interface6 != null) {
			if ((((Class104_Sub1_Sub1) this).anInt11134 | i_2_) != i_2_) {
				if ((((Class104_Sub1_Sub1) this).anInt11132 != interface10.method42()) || (((Class104_Sub1_Sub1) this).anInt11136 != interface10.method41()))
					throw new RuntimeException();
			} else {
				((Class104_Sub1_Sub1) this).anInt11136 = interface10.method41();
				((Class104_Sub1_Sub1) this).anInt11132 = interface10.method42();
				if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1625880382))
					((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9382();
			}
			((Class104_Sub1_Sub1) this).anInt11134 |= i_2_;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = interface10;
		} else {
			((Class104_Sub1_Sub1) this).anInt11134 &= i_2_ ^ 0xffffffff;
			((Class104_Sub1_Sub1) this).anInterface10Array11131[i] = null;
			if (((Class104_Sub1_Sub1) this).anInt11134 == 0) {
				((Class104_Sub1_Sub1) this).anInt11136 = 0;
				((Class104_Sub1_Sub1) this).anInt11132 = 0;
			}
		}
		if (this == ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(-760227875))
			method10133(i);
		else
			((Class104_Sub1_Sub1) this).anInt11135 |= i_2_;
	}

	void method10137() {
		if (((Class104_Sub1_Sub1) this).anInterface10_11130 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub1) this).anInterface10_11130.method62(36096);
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
		OpenGL.glBindFramebufferEXT(36160, ((Class104_Sub1_Sub1) this).anInt11133);
		for (int i = 0; i < 4; i++) {
			if ((((Class104_Sub1_Sub1) this).anInt11135 & 1 << i) != 0)
				method10133(i);
		}
		if ((((Class104_Sub1_Sub1) this).anInt11135 & 0x10) != 0)
			method10134();
		((Class104_Sub1_Sub1) this).anInt11135 = 0;
		((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9381();
		return true;
	}

	boolean method1647() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9915(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
		if (bool | bool_8_) {
			int i_9_ = ((Class104_Sub1_Sub1) this).anInt11136;
			int i_10_ = ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1359388300).method1646();
			int i_11_ = 0;
			if (bool_8_)
				i_11_ |= 0x100;
			if (bool)
				i_11_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub1) this).anInt11133));
			OpenGL.glBlitFramebufferEXT(i, i_9_ - i_3_ - i_5_, i + i_4_, i_9_ - i_3_, i_6_, i_10_ - i_7_ - i_5_, i_6_ + i_4_, i_10_ - i_7_, i_11_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method9916(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_) {
		if (bool | bool_17_) {
			int i_18_ = ((Class104_Sub1_Sub1) this).anInt11136;
			int i_19_ = ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1862356804).method1646();
			int i_20_ = 0;
			if (bool_17_)
				i_20_ |= 0x100;
			if (bool)
				i_20_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub1) this).anInt11133));
			OpenGL.glBlitFramebufferEXT(i, i_18_ - i_12_ - i_14_, i + i_13_, i_18_ - i_12_, i_15_, i_19_ - i_16_ - i_14_, i_15_ + i_13_, i_19_ - i_16_, i_20_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method10138(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	public void method128() {
		if (((Class104_Sub1_Sub1) this).anInt11133 != 0) {
			((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9440(((Class104_Sub1_Sub1) this).anInt11133);
			((Class104_Sub1_Sub1) this).anInt11133 = 0;
		}
	}

	void method10139(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	void method10140() throws Throwable {
		super.finalize();
		method39();
	}

	void method10141(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	boolean method126() {
		OpenGL.glBindFramebufferEXT(36160, ((Class104_Sub1_Sub1) this).anInt11133);
		for (int i = 0; i < 4; i++) {
			if ((((Class104_Sub1_Sub1) this).anInt11135 & 1 << i) != 0)
				method10133(i);
		}
		if ((((Class104_Sub1_Sub1) this).anInt11135 & 0x10) != 0)
			method10134();
		((Class104_Sub1_Sub1) this).anInt11135 = 0;
		((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9381();
		return true;
	}

	public void method39() {
		if (((Class104_Sub1_Sub1) this).anInt11133 != 0) {
			((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method9440(((Class104_Sub1_Sub1) this).anInt11133);
			((Class104_Sub1_Sub1) this).anInt11133 = 0;
		}
	}

	void method10142(int i) {
		Interface10 interface10 = ((Class104_Sub1_Sub1) this).anInterface10Array11131[i];
		if (interface10 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface10.method62(36064 + i);
	}

	boolean method1649() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method10143() {
		if (((Class104_Sub1_Sub1) this).anInterface10_11130 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub1) this).anInterface10_11130.method62(36096);
	}

	public void method9910(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean bool, boolean bool_26_) {
		if (bool | bool_26_) {
			int i_27_ = ((Class104_Sub1_Sub1) this).anInt11136;
			int i_28_ = ((Class104_Sub1_Sub1) this).aClass106_Sub1_11129.method1683(1457319020).method1646();
			int i_29_ = 0;
			if (bool_26_)
				i_29_ |= 0x100;
			if (bool)
				i_29_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class104_Sub1_Sub1) this).anInt11133));
			OpenGL.glBlitFramebufferEXT(i, i_27_ - i_21_ - i_23_, i + i_22_, i_27_ - i_21_, i_24_, i_28_ - i_25_ - i_23_, i_24_ + i_22_, i_28_ - i_25_, i_29_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method10144() {
		if (((Class104_Sub1_Sub1) this).anInterface10_11130 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class104_Sub1_Sub1) this).anInterface10_11130.method62(36096);
	}
}
