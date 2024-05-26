package game;

/* Class349_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class349_Sub1 extends Class349 {
	int anInt9769;
	static final int anInt9770 = 1;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9771;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9772;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9773;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9774;
	float[] aFloatArray9775 = new float[3];
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9776;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9777;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9778;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9779;
	static final int anInt9780 = 8;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9781;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9782;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9783;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9784;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9785;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9786;
	static final int anInt9787 = 2;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9788;
	Class250[] aClass250Array9789;
	static final int anInt9790 = 16;
	static Class250 aClass250_9791 = new Class250();
	static final int anInt9792 = 64;
	static final int anInt9793 = 128;
	static final int anInt9794 = 4;
	int[] anIntArray9795;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9796;
	static final int anInt9797 = 32;
	protected Class406 aClass406_9798;

	void method9285() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method9286(int i, Class261 class261) {
		if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9796 != null) {
			Class250 class250 = aClass106_Sub3_4394.method9719();
			float[] fs = { class250.aFloatArray2728[12], class250.aFloatArray2728[13], class250.aFloatArray2728[14] };
			float[] fs_0_ = { 0.0F, 0.0F, 0.0F };
			class250.method3466(fs_0_);
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			aClass106_Sub3_4394.method1762().method3582(0.0F, 0.0F, 0.0F, fs_1_);
			class261.method3592(fs);
			aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9796), fs[0], fs[1], fs[2], (byte) -100);
		}
	}

	void method4368() {
		aClass406_9798.method4858();
		((Class349_Sub1) this).anIntArray9795[aClass406_9798.method4880(413067307)] = -1;
		method9293(0);
		method9287();
	}

	void method4348() {
		aClass406_9798.method4858();
		((Class349_Sub1) this).anIntArray9795[aClass406_9798.method4880(82576921)] = -1;
		method9293(0);
		method9287();
	}

	void method9287() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method4352() {
		if (aClass406_9798 != null)
			aClass406_9798.method4859();
	}

	Class349_Sub1(Class106_Sub3 class106_sub3) {
		super(class106_sub3);
		new Class261();
		((Class349_Sub1) this).aClass250Array9789 = new Class250[aClass106_Sub3_4394.anInt10454];
		for (int i = 0; i < aClass106_Sub3_4394.anInt10454; i++)
			((Class349_Sub1) this).aClass250Array9789[i] = new Class250();
	}

	void method4349() {
		method9292(Class261.aClass261_2800);
	}

	boolean method9288(String string) throws Exception_Sub3 {
		aClass406_9798 = aClass106_Sub3_4394.method9619(string);
		if (aClass406_9798 == null)
			throw new Exception_Sub3("");
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 = aClass406_9798.method4888("textureMatrix", (byte) 81);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9771 = aClass406_9798.method4888("modelMatrix", (byte) 17);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9772 = aClass406_9798.method4888("viewMatrix", (byte) 86);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9773 = aClass406_9798.method4888("projectionMatrix", (byte) 119);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9786 = aClass406_9798.method4888("modelViewMatrix", (byte) 22);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9776 = aClass406_9798.method4888("modelViewProjectionMatrix", (byte) 72);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9777 = aClass406_9798.method4888("viewProjectionMatrix", (byte) 83);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9781 = aClass406_9798.method4888("ambientColour", (byte) 24);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9778 = aClass406_9798.method4888("sunDirection", (byte) 10);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9782 = aClass406_9798.method4888("sunColour", (byte) 116);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9783 = aClass406_9798.method4888("antiSunColour", (byte) 20);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9785 = aClass406_9798.method4888("sunExponent", (byte) 54);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9788 = aClass406_9798.method4888("eyePosition", (byte) 18);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9796 = aClass406_9798.method4888("eyePositionOS", (byte) 5);
		((Class349_Sub1) this).aClass572_Sub8_Sub1_9779 = aClass406_9798.method4888("sunDirectionOS", (byte) 32);
		if (!method9297()) {
			aClass406_9798 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9771 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9772 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9773 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9786 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9776 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9777 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9781 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9778 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9782 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9783 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9785 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9788 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9796 = null;
			((Class349_Sub1) this).aClass572_Sub8_Sub1_9779 = null;
			return false;
		}
		if (aClass406_9798.method4869(253532407) == null) {
			Class405 class405 = aClass406_9798.method4902(979083226);
			if (class405 == null)
				throw new Exception_Sub3(new StringBuilder().append(aClass406_9798.method4861(1610747788)).append("").toString());
			aClass406_9798.method4868(class405);
		}
		((Class349_Sub1) this).anInt9769 = aClass406_9798.method4909(1347471432);
		((Class349_Sub1) this).anIntArray9795 = new int[((Class349_Sub1) this).anInt9769];
		return true;
	}

	void method9289() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method9290(int i) {
		for (int i_2_ = 0; i_2_ < ((Class349_Sub1) this).anInt9769; i_2_++)
			((Class349_Sub1) this).anIntArray9795[i_2_] |= 128 << i;
	}

	void method4355() {
		/* empty */
	}

	void method9291(int i) {
		for (int i_3_ = 0; i_3_ < ((Class349_Sub1) this).anInt9769; i_3_++)
			((Class349_Sub1) this).anIntArray9795[i_3_] |= 128 << i;
	}

	void method9292(Class261 class261) {
		Class250 class250 = aClass106_Sub3_4394.aClass250_10399;
		class250.method3446(class261);
		int i = aClass406_9798.method4880(1859356630);
		if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9771 != null) {
			aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9771), class250, -263833962);
			((Class349_Sub1) this).anIntArray9795[i] &= ~0x1;
		}
		if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9786 != null) {
			aClass250_9791.method3473(class250, aClass106_Sub3_4394.method9734());
			aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9786), aClass250_9791, -850043176);
			((Class349_Sub1) this).anIntArray9795[i] &= ~0x10;
		}
		if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9776 != null) {
			aClass250_9791.method3473(class250, aClass106_Sub3_4394.method9577());
			aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9776), aClass250_9791, -1264461530);
			((Class349_Sub1) this).anIntArray9795[i] &= ~0x20;
		}
		method9286(i, class261);
		method9294(i, class261);
	}

	void method4354() {
		method9292(Class261.aClass261_2800);
	}

	void method9293(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}

	void method9294(int i, Class261 class261) {
		if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9779 != null) {
			float[] fs = { aClass106_Sub3_4394.aFloatArray10446[0], aClass106_Sub3_4394.aFloatArray10446[1], aClass106_Sub3_4394.aFloatArray10446[2] };
			class261.method3599(fs);
			aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9779), fs[0], fs[1], fs[2], (byte) -90);
		}
	}

	void method4361() {
		if (aClass406_9798 != null)
			aClass406_9798.method4859();
	}

	void method4347() {
		if (aClass406_9798 != null)
			aClass406_9798.method4859();
	}

	void method4356() {
		if (aClass406_9798 != null)
			aClass406_9798.method4859();
	}

	void method9295(boolean bool) {
		if (aClass406_9798 != null && aClass406_9798.method4891()) {
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9781 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9781), (aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10458), (aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10458), (aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10458), (byte) -111);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9778 != null)
				aClass406_9798.method4874(((Class349_Sub1) this).aClass572_Sub8_Sub1_9778, aClass106_Sub3_4394.aFloatArray10446[0], aClass106_Sub3_4394.aFloatArray10446[1], aClass106_Sub3_4394.aFloatArray10446[2], (byte) -99);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9782 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9782), (aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10455), (aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10455), (aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10455), (byte) -59);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9783 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9783), (-aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10456), (-aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10456), (-aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10456), (byte) -90);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9785 != null)
				aClass406_9798.method4870((((Class349_Sub1) this).aClass572_Sub8_Sub1_9785), 64.0F + Math.abs(aClass106_Sub3_4394.aFloatArray10446[1]) * 928.0F, (byte) 5);
		}
	}

	void method9296() {
		if (aClass406_9798 != null && aClass406_9798.method4891()) {
			int i = aClass406_9798.method4880(-1080063748);
			int i_4_ = ((Class349_Sub1) this).anIntArray9795[i];
			if ((i_4_ & 0x1) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9771 != null)
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9771), aClass106_Sub3_4394.method9607(), -330688717);
			if ((i_4_ & 0x2) != 0) {
				if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9772 != null)
					aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9772), aClass106_Sub3_4394.method9734(), -1673631309);
				if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9788 != null) {
					((Class349_Sub1) this).aFloatArray9775[0] = 0.0F;
					((Class349_Sub1) this).aFloatArray9775[1] = 0.0F;
					((Class349_Sub1) this).aFloatArray9775[2] = 0.0F;
					aClass106_Sub3_4394.method1762().method3591(((Class349_Sub1) this).aFloatArray9775[0], ((Class349_Sub1) this).aFloatArray9775[1], ((Class349_Sub1) this).aFloatArray9775[2], ((Class349_Sub1) this).aFloatArray9775);
					aClass406_9798.method4874(((Class349_Sub1) this).aClass572_Sub8_Sub1_9788, ((Class349_Sub1) this).aFloatArray9775[0], ((Class349_Sub1) this).aFloatArray9775[1], ((Class349_Sub1) this).aFloatArray9775[2], (byte) -121);
				}
			}
			if ((i_4_ & 0x10) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9786 != null)
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9786), aClass106_Sub3_4394.method9609(), 1444003256);
			if ((i_4_ & 0x8) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9774 != null)
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9774), aClass106_Sub3_4394.method9719(), -1070234726);
			if ((i_4_ & 0x4) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9773 != null)
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9773), aClass106_Sub3_4394.method9663(), 124380456);
			if ((i_4_ & 0x20) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9776 != null) {
				aClass250_9791.method3473(aClass106_Sub3_4394.method9609(), aClass106_Sub3_4394.method9663());
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9776), aClass250_9791, 1515063385);
			}
			if ((i_4_ & 0x40) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9777 != null) {
				aClass250_9791.method3473(aClass106_Sub3_4394.method9734(), aClass106_Sub3_4394.method9663());
				aClass406_9798.method4879((((Class349_Sub1) this).aClass572_Sub8_Sub1_9777), aClass250_9791, 2031467749);
			}
			if (aClass106_Sub3_4394.method9640() == 0 && (((Class349_Sub1) this).anIntArray9795[i] & 0x80) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 != null) {
				aClass406_9798.method4903((((Class349_Sub1) this).aClass572_Sub8_Sub1_9784), aClass106_Sub3_4394.method9650(), (byte) -28);
				((Class349_Sub1) this).anIntArray9795[i] &= ~0x80;
			}
			((Class349_Sub1) this).anIntArray9795[i] = 0;
		}
	}

	abstract boolean method9297() throws Exception_Sub3;

	void method4362() {
		method9292(Class261.aClass261_2800);
	}

	void method4365() {
		method9292(Class261.aClass261_2800);
	}

	void method4366() {
		method9292(Class261.aClass261_2800);
	}

	abstract boolean method9298() throws Exception_Sub3;

	void method4367() {
		aClass406_9798.method4858();
		((Class349_Sub1) this).anIntArray9795[aClass406_9798.method4880(866065596)] = -1;
		method9293(0);
		method9287();
	}

	void method9299(boolean bool) {
		if (aClass406_9798 != null && aClass406_9798.method4891()) {
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9781 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9781), (aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10458), (aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10458), (aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10458), (byte) -98);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9778 != null)
				aClass406_9798.method4874(((Class349_Sub1) this).aClass572_Sub8_Sub1_9778, aClass106_Sub3_4394.aFloatArray10446[0], aClass106_Sub3_4394.aFloatArray10446[1], aClass106_Sub3_4394.aFloatArray10446[2], (byte) -20);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9782 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9782), (aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10455), (aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10455), (aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10455), (byte) -15);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9783 != null)
				aClass406_9798.method4874((((Class349_Sub1) this).aClass572_Sub8_Sub1_9783), (-aClass106_Sub3_4394.aFloat10451 * aClass106_Sub3_4394.aFloat10456), (-aClass106_Sub3_4394.aFloat10439 * aClass106_Sub3_4394.aFloat10456), (-aClass106_Sub3_4394.aFloat10453 * aClass106_Sub3_4394.aFloat10456), (byte) -103);
			if (((Class349_Sub1) this).aClass572_Sub8_Sub1_9785 != null)
				aClass406_9798.method4870((((Class349_Sub1) this).aClass572_Sub8_Sub1_9785), 64.0F + Math.abs(aClass106_Sub3_4394.aFloatArray10446[1]) * 928.0F, (byte) 18);
		}
	}

	void method9300() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method9301(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}

	void method9302() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method9303() {
		method9295(aClass106_Sub3_4394.aBool10369);
		method9306(aClass106_Sub3_4394.method9650());
		method9296();
		method4355();
	}

	void method9304(Class250 class250) {
		if (aClass406_9798 != null && aClass406_9798.method4891() && aClass106_Sub3_4394.method9640() == 0) {
			int i = aClass406_9798.method4880(445012799);
			if ((((Class349_Sub1) this).anIntArray9795[i] & 0x80) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 != null) {
				aClass406_9798.method4903((((Class349_Sub1) this).aClass572_Sub8_Sub1_9784), class250, (byte) -2);
				((Class349_Sub1) this).anIntArray9795[i] &= ~0x80;
			}
		}
	}

	void method9305(Class250 class250) {
		if (aClass406_9798 != null && aClass406_9798.method4891() && aClass106_Sub3_4394.method9640() == 0) {
			int i = aClass406_9798.method4880(-224827871);
			if ((((Class349_Sub1) this).anIntArray9795[i] & 0x80) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 != null) {
				aClass406_9798.method4903((((Class349_Sub1) this).aClass572_Sub8_Sub1_9784), class250, (byte) 59);
				((Class349_Sub1) this).anIntArray9795[i] &= ~0x80;
			}
		}
	}

	void method9306(Class250 class250) {
		if (aClass406_9798 != null && aClass406_9798.method4891() && aClass106_Sub3_4394.method9640() == 0) {
			int i = aClass406_9798.method4880(294047333);
			if ((((Class349_Sub1) this).anIntArray9795[i] & 0x80) != 0 && ((Class349_Sub1) this).aClass572_Sub8_Sub1_9784 != null) {
				aClass406_9798.method4903((((Class349_Sub1) this).aClass572_Sub8_Sub1_9784), class250, (byte) 59);
				((Class349_Sub1) this).anIntArray9795[i] &= ~0x80;
			}
		}
	}

	void method9307(int i) {
		for (int i_5_ = 0; i_5_ < ((Class349_Sub1) this).anInt9769; i_5_++)
			((Class349_Sub1) this).anIntArray9795[i_5_] |= 128 << i;
	}

	void method4364() {
		method9292(Class261.aClass261_2800);
	}

	void method9308(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}

	void method9309(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}

	void method4351() {
		/* empty */
	}

	void method9310(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}

	void method9311(int i) {
		((Class349_Sub1) this).aClass250Array9789[0].method3444();
		method9291(i);
	}
}
