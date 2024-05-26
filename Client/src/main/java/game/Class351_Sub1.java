package game;

/* Class351_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class351_Sub1 extends Class351 {
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9665;
	Class405 aClass405_9666;
	Class406 aClass406_9667;
	public static float aFloat9668;
	public static float aFloat9669;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9670;
	Class405 aClass405_9671;
	Class405 aClass405_9672;
	public static float aFloat9673 = 0.25F;
	Class405 aClass405_9674;
	public static float aFloat9675 = 1.0F;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9676;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9677;
	Class405 aClass405_9678;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9679;
	static final int anInt9680 = 256;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9681;
	boolean aBool9682;

	int method4382() {
		return 0;
	}

	boolean method4373() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637() && aClass106_Sub3_4395.method9576(true));
	}

	boolean method4388() {
		return ((Class351_Sub1) this).aBool9682;
	}

	int method4404() {
		return 1;
	}

	void method4378(int i, int i_0_) {
		/* empty */
	}

	static {
		aFloat9668 = 1.0F;
		aFloat9669 = 1.0F;
	}

	int method4372() {
		return 4;
	}

	void method4379(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_1_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_2_ = (float) class104_sub1.method1648();
		float f_3_ = (float) class104_sub1.method1646();
		Interface43 interface43_4_ = interface43;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = (bool ? aClass106_Sub3_4395.method1684(1534240075).method1648() : i_7_);
		int i_10_ = (bool ? aClass106_Sub3_4395.method1684(1897049342).method1646() : i_8_);
		if (i == 0) {
			i_7_ = 256;
			i_8_ = 256;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9672);
			((Class351_Sub1) this).aClass406_9667.method4858();
		} else if (i == 1) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9678);
			((Class351_Sub1) this).aClass406_9667.method4858();
			((Class351_Sub1) this).aClass406_9667.method4908(((Class351_Sub1) this).aClass572_Sub8_Sub1_9679, aFloat9669 / f_2_, 0.0F, 1135400266);
		} else if (i == 2) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9678);
			((Class351_Sub1) this).aClass406_9667.method4858();
			((Class351_Sub1) this).aClass406_9667.method4908(((Class351_Sub1) this).aClass572_Sub8_Sub1_9679, 0.0F, aFloat9669 / f_3_, 137792760);
		} else if (i == 3) {
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9674);
			interface43_4_ = interface43_1_;
			((Class351_Sub1) this).aClass406_9667.method4860(((Class351_Sub1) this).aClass572_Sub8_Sub1_9677, 1, interface43, (byte) -122);
			((Class351_Sub1) this).aClass406_9667.method4858();
		}
		float f_11_ = (float) i_7_ / f_2_;
		float f_12_ = (float) i_8_ / f_3_;
		float f_13_ = (float) i_9_ / f_2_;
		float f_14_ = (float) i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
		fs[10] *= f_13_;
		fs[7] *= f_14_;
		((Class351_Sub1) this).aClass406_9667.method4877(((Class351_Sub1) this).aClass572_Sub8_Sub1_9681, fs, 995412464);
		((Class351_Sub1) this).aClass406_9667.method4860(((Class351_Sub1) this).aClass572_Sub8_Sub1_9670, 0, interface43_4_, (byte) -116);
		((Class351_Sub1) this).aClass406_9667.method4873(((Class351_Sub1) this).aClass572_Sub8_Sub1_9676, aFloat9668, aFloat9673, aFloat9675, 0.0F, -1938515535);
		((Class351_Sub1) this).aClass406_9667.method4873(((Class351_Sub1) this).aClass572_Sub8_Sub1_9665, 0.0F, 0.0F, 256.0F / f_2_, 256.0F / f_3_, -1896326839);
		aClass106_Sub3_4395.method2004(0, 0, i_7_, i_8_);
	}

	void method4381(int i) {
		((Class351_Sub1) this).aClass406_9667.method4859();
	}

	int method4383() {
		return 1;
	}

	void method4394() {
		/* empty */
	}

	boolean method4380() {
		return false;
	}

	void method4395() {
		/* empty */
	}

	boolean method4387() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637() && aClass106_Sub3_4395.method9576(true));
	}

	boolean method4374() {
		return ((Class351_Sub1) this).aBool9682;
	}

	boolean method4407() {
		if (method4373()) {
			((Class351_Sub1) this).aClass406_9667 = aClass106_Sub3_4395.method9619("FilterBloom");
			if (((Class351_Sub1) this).aClass406_9667 == null)
				return false;
			try {
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9670 = ((Class351_Sub1) this).aClass406_9667.method4885("sceneTex", -1624095970);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9677 = ((Class351_Sub1) this).aClass406_9667.method4885("bloomTex1", -2024197094);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9676 = ((Class351_Sub1) this).aClass406_9667.method4885("params", -1057871191);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9679 = ((Class351_Sub1) this).aClass406_9667.method4885("sampleSize", -865164027);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9665 = ((Class351_Sub1) this).aClass406_9667.method4885("pixelOffsetAndBloomScale", -1389176142);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9681 = ((Class351_Sub1) this).aClass406_9667.method4885("PosAndTexCoords", -899821051);
				((Class351_Sub1) this).aClass406_9667.method4863("test", 617193);
				((Class351_Sub1) this).aClass405_9666 = ((Class351_Sub1) this).aClass406_9667.method4863("techFullscreenTri", -67692502);
				((Class351_Sub1) this).aClass405_9672 = ((Class351_Sub1) this).aClass406_9667.method4863("brightpass", -749977892);
				((Class351_Sub1) this).aClass405_9678 = ((Class351_Sub1) this).aClass406_9667.method4863("blur", 858966275);
				((Class351_Sub1) this).aClass405_9674 = ((Class351_Sub1) this).aClass406_9667.method4863("composite", -622910205);
				((Class351_Sub1) this).aClass405_9671 = ((Class351_Sub1) this).aClass406_9667.method4863("techDefault", 67474281);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub1) this).aClass405_9666.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9672.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9678.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9674.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9671.method4803())
				return false;
			((Class351_Sub1) this).aBool9682 = true;
			return true;
		}
		return false;
	}

	int method4375() {
		return 0;
	}

	boolean method4409() {
		if (method4373()) {
			((Class351_Sub1) this).aClass406_9667 = aClass106_Sub3_4395.method9619("FilterBloom");
			if (((Class351_Sub1) this).aClass406_9667 == null)
				return false;
			try {
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9670 = ((Class351_Sub1) this).aClass406_9667.method4885("sceneTex", -952418627);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9677 = ((Class351_Sub1) this).aClass406_9667.method4885("bloomTex1", -1351516597);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9676 = ((Class351_Sub1) this).aClass406_9667.method4885("params", -1401275926);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9679 = ((Class351_Sub1) this).aClass406_9667.method4885("sampleSize", -1925365838);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9665 = ((Class351_Sub1) this).aClass406_9667.method4885("pixelOffsetAndBloomScale", -1857623453);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9681 = ((Class351_Sub1) this).aClass406_9667.method4885("PosAndTexCoords", -1435865506);
				((Class351_Sub1) this).aClass406_9667.method4863("test", -2028688205);
				((Class351_Sub1) this).aClass405_9666 = ((Class351_Sub1) this).aClass406_9667.method4863("techFullscreenTri", -574498437);
				((Class351_Sub1) this).aClass405_9672 = ((Class351_Sub1) this).aClass406_9667.method4863("brightpass", -792946850);
				((Class351_Sub1) this).aClass405_9678 = ((Class351_Sub1) this).aClass406_9667.method4863("blur", -1914736162);
				((Class351_Sub1) this).aClass405_9674 = ((Class351_Sub1) this).aClass406_9667.method4863("composite", -1619987561);
				((Class351_Sub1) this).aClass405_9671 = ((Class351_Sub1) this).aClass406_9667.method4863("techDefault", 222115986);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub1) this).aClass405_9666.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9672.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9678.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9674.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9671.method4803())
				return false;
			((Class351_Sub1) this).aBool9682 = true;
			return true;
		}
		return false;
	}

	public Class351_Sub1(Class106_Sub3 class106_sub3) {
		super(class106_sub3);
	}

	boolean method4390() {
		if (method4373()) {
			((Class351_Sub1) this).aClass406_9667 = aClass106_Sub3_4395.method9619("FilterBloom");
			if (((Class351_Sub1) this).aClass406_9667 == null)
				return false;
			try {
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9670 = ((Class351_Sub1) this).aClass406_9667.method4885("sceneTex", -1600330783);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9677 = ((Class351_Sub1) this).aClass406_9667.method4885("bloomTex1", -1511799503);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9676 = ((Class351_Sub1) this).aClass406_9667.method4885("params", -999052170);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9679 = ((Class351_Sub1) this).aClass406_9667.method4885("sampleSize", -800381246);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9665 = ((Class351_Sub1) this).aClass406_9667.method4885("pixelOffsetAndBloomScale", -1721022152);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9681 = ((Class351_Sub1) this).aClass406_9667.method4885("PosAndTexCoords", -1887961353);
				((Class351_Sub1) this).aClass406_9667.method4863("test", -528689143);
				((Class351_Sub1) this).aClass405_9666 = ((Class351_Sub1) this).aClass406_9667.method4863("techFullscreenTri", -1094182307);
				((Class351_Sub1) this).aClass405_9672 = ((Class351_Sub1) this).aClass406_9667.method4863("brightpass", -1406827970);
				((Class351_Sub1) this).aClass405_9678 = ((Class351_Sub1) this).aClass406_9667.method4863("blur", -1693234972);
				((Class351_Sub1) this).aClass405_9674 = ((Class351_Sub1) this).aClass406_9667.method4863("composite", -183265907);
				((Class351_Sub1) this).aClass405_9671 = ((Class351_Sub1) this).aClass406_9667.method4863("techDefault", -2097118675);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub1) this).aClass405_9666.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9672.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9678.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9674.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9671.method4803())
				return false;
			((Class351_Sub1) this).aBool9682 = true;
			return true;
		}
		return false;
	}

	boolean method4377() {
		return false;
	}

	void method4396() {
		/* empty */
	}

	void method4399(int i, int i_15_) {
		/* empty */
	}

	void method4400(int i, int i_16_) {
		/* empty */
	}

	void method4389(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_17_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_18_ = (float) class104_sub1.method1648();
		float f_19_ = (float) class104_sub1.method1646();
		Interface43 interface43_20_ = interface43;
		float f_21_ = f * 2.0F / f_18_;
		float f_22_ = -f * 2.0F / f_19_;
		float[] fs = { -1.0F + f_21_, 1.0F + f_22_, 0.0F, 0.0F, -1.0F + f_21_, -3.0F + f_22_, 0.0F, 2.0F, 3.0F + f_21_, 1.0F + f_22_, 2.0F, 0.0F };
		int i_23_ = (int) f_18_;
		int i_24_ = (int) f_19_;
		int i_25_ = (bool ? aClass106_Sub3_4395.method1684(-1861863227).method1648() : i_23_);
		int i_26_ = (bool ? aClass106_Sub3_4395.method1684(-610144363).method1646() : i_24_);
		if (i == 0) {
			i_23_ = 256;
			i_24_ = 256;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9672);
			((Class351_Sub1) this).aClass406_9667.method4858();
		} else if (i == 1) {
			i_23_ = 256;
			i_24_ = 256;
			i_25_ = i_23_;
			i_26_ = i_24_;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9678);
			((Class351_Sub1) this).aClass406_9667.method4858();
			((Class351_Sub1) this).aClass406_9667.method4908(((Class351_Sub1) this).aClass572_Sub8_Sub1_9679, aFloat9669 / f_18_, 0.0F, -66890801);
		} else if (i == 2) {
			i_23_ = 256;
			i_24_ = 256;
			i_25_ = i_23_;
			i_26_ = i_24_;
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9678);
			((Class351_Sub1) this).aClass406_9667.method4858();
			((Class351_Sub1) this).aClass406_9667.method4908(((Class351_Sub1) this).aClass572_Sub8_Sub1_9679, 0.0F, aFloat9669 / f_19_, -1694760224);
		} else if (i == 3) {
			((Class351_Sub1) this).aClass406_9667.method4868(((Class351_Sub1) this).aClass405_9674);
			interface43_20_ = interface43_17_;
			((Class351_Sub1) this).aClass406_9667.method4860(((Class351_Sub1) this).aClass572_Sub8_Sub1_9677, 1, interface43, (byte) -124);
			((Class351_Sub1) this).aClass406_9667.method4858();
		}
		float f_27_ = (float) i_23_ / f_18_;
		float f_28_ = (float) i_24_ / f_19_;
		float f_29_ = (float) i_25_ / f_18_;
		float f_30_ = (float) i_26_ / f_19_;
		fs[8] = (fs[8] + 1.0F) * f_27_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_28_ + 1.0F;
		fs[10] *= f_29_;
		fs[7] *= f_30_;
		((Class351_Sub1) this).aClass406_9667.method4877(((Class351_Sub1) this).aClass572_Sub8_Sub1_9681, fs, 434449993);
		((Class351_Sub1) this).aClass406_9667.method4860(((Class351_Sub1) this).aClass572_Sub8_Sub1_9670, 0, interface43_20_, (byte) -127);
		((Class351_Sub1) this).aClass406_9667.method4873(((Class351_Sub1) this).aClass572_Sub8_Sub1_9676, aFloat9668, aFloat9673, aFloat9675, 0.0F, -1815180822);
		((Class351_Sub1) this).aClass406_9667.method4873(((Class351_Sub1) this).aClass572_Sub8_Sub1_9665, 0.0F, 0.0F, 256.0F / f_18_, 256.0F / f_19_, -2024059185);
		aClass106_Sub3_4395.method2004(0, 0, i_23_, i_24_);
	}

	boolean method4414() {
		return false;
	}

	void method4403(int i) {
		((Class351_Sub1) this).aClass406_9667.method4859();
	}

	int method4391() {
		return 4;
	}

	void method4398(int i, int i_31_) {
		/* empty */
	}

	int method4406() {
		return 0;
	}

	void method4397() {
		/* empty */
	}

	int method4408() {
		return 0;
	}

	int method4401() {
		return 4;
	}

	void method4402(int i) {
		((Class351_Sub1) this).aClass406_9667.method4859();
	}

	boolean method4405() {
		if (method4373()) {
			((Class351_Sub1) this).aClass406_9667 = aClass106_Sub3_4395.method9619("FilterBloom");
			if (((Class351_Sub1) this).aClass406_9667 == null)
				return false;
			try {
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9670 = ((Class351_Sub1) this).aClass406_9667.method4885("sceneTex", -881770915);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9677 = ((Class351_Sub1) this).aClass406_9667.method4885("bloomTex1", -1324227696);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9676 = ((Class351_Sub1) this).aClass406_9667.method4885("params", -870636335);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9679 = ((Class351_Sub1) this).aClass406_9667.method4885("sampleSize", -1828722090);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9665 = ((Class351_Sub1) this).aClass406_9667.method4885("pixelOffsetAndBloomScale", -912121939);
				((Class351_Sub1) this).aClass572_Sub8_Sub1_9681 = ((Class351_Sub1) this).aClass406_9667.method4885("PosAndTexCoords", -1288606753);
				((Class351_Sub1) this).aClass406_9667.method4863("test", 677378849);
				((Class351_Sub1) this).aClass405_9666 = ((Class351_Sub1) this).aClass406_9667.method4863("techFullscreenTri", -1512279550);
				((Class351_Sub1) this).aClass405_9672 = ((Class351_Sub1) this).aClass406_9667.method4863("brightpass", -1721928836);
				((Class351_Sub1) this).aClass405_9678 = ((Class351_Sub1) this).aClass406_9667.method4863("blur", -161071522);
				((Class351_Sub1) this).aClass405_9674 = ((Class351_Sub1) this).aClass406_9667.method4863("composite", -790310361);
				((Class351_Sub1) this).aClass405_9671 = ((Class351_Sub1) this).aClass406_9667.method4863("techDefault", 627171174);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub1) this).aClass405_9666.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9672.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9678.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9674.method4803())
				return false;
			if (!((Class351_Sub1) this).aClass405_9671.method4803())
				return false;
			((Class351_Sub1) this).aBool9682 = true;
			return true;
		}
		return false;
	}
}
