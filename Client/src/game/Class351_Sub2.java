package game;

/* Class351_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class351_Sub2 extends Class351 {
	Class405 aClass405_9728;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9729;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9730;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9731;
	public static float aFloat9732 = 1.0F;
	Class406 aClass406_9733;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9734;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9735;
	public static float aFloat9736 = 0.0F;
	public static float aFloat9737 = 1.0F;
	public static float aFloat9738 = 0.0F;
	public static float aFloat9739 = 1.0F;
	boolean aBool9740;

	int method4372() {
		return 1;
	}

	boolean method4373() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637());
	}

	boolean method4380() {
		return (aFloat9732 == 1.0F && aFloat9736 == 0.0F && aFloat9737 == 1.0F && aFloat9738 == 0.0F && aFloat9739 == 1.0F);
	}

	int method4375() {
		return 1;
	}

	void method4378(int i, int i_0_) {
		/* empty */
	}

	void method4403(int i) {
		((Class351_Sub2) this).aClass406_9733.method4859();
	}

	boolean method4387() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637());
	}

	void method4379(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_1_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_2_ = (float) class104_sub1.method1648();
		float f_3_ = (float) class104_sub1.method1646();
		float f_4_ = f * 2.0F / f_2_;
		float f_5_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_, -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_, 2.0F, 0.0F };
		int i_6_ = (int) f_2_;
		int i_7_ = (int) f_3_;
		int i_8_ = (bool ? aClass106_Sub3_4395.method1684(-509961204).method1648() : i_6_);
		int i_9_ = (bool ? aClass106_Sub3_4395.method1684(2016822873).method1646() : i_7_);
		((Class351_Sub2) this).aClass406_9733.method4868(((Class351_Sub2) this).aClass405_9728);
		((Class351_Sub2) this).aClass406_9733.method4858();
		float f_10_ = (float) i_6_ / f_2_;
		float f_11_ = (float) i_7_ / f_3_;
		float f_12_ = (float) i_8_ / f_2_;
		float f_13_ = (float) i_9_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
		fs[10] *= f_12_;
		fs[7] *= f_13_;
		((Class351_Sub2) this).aClass406_9733.method4877(((Class351_Sub2) this).aClass572_Sub8_Sub1_9734, fs, 1264857165);
		((Class351_Sub2) this).aClass406_9733.method4860(((Class351_Sub2) this).aClass572_Sub8_Sub1_9730, 0, interface43, (byte) -124);
		((Class351_Sub2) this).aClass406_9733.method4870(((Class351_Sub2) this).aClass572_Sub8_Sub1_9735, aFloat9732, (byte) 102);
		((Class351_Sub2) this).aClass406_9733.method4873(((Class351_Sub2) this).aClass572_Sub8_Sub1_9729, aFloat9736, aFloat9737, aFloat9738, aFloat9739, -2045109834);
		((Class351_Sub2) this).aClass406_9733.method4873(((Class351_Sub2) this).aClass572_Sub8_Sub1_9731, 0.0F, 0.0F, 0.0F, 0.0F, -1895989281);
		aClass106_Sub3_4395.method2004(0, 0, i_6_, i_7_);
	}

	void method4381(int i) {
		((Class351_Sub2) this).aClass406_9733.method4859();
	}

	int method4383() {
		return 0;
	}

	int method4382() {
		return 1;
	}

	boolean method4388() {
		return ((Class351_Sub2) this).aBool9740;
	}

	void method4389(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_14_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_15_ = (float) class104_sub1.method1648();
		float f_16_ = (float) class104_sub1.method1646();
		float f_17_ = f * 2.0F / f_15_;
		float f_18_ = -f * 2.0F / f_16_;
		float[] fs = { -1.0F + f_17_, 1.0F + f_18_, 0.0F, 0.0F, -1.0F + f_17_, -3.0F + f_18_, 0.0F, 2.0F, 3.0F + f_17_, 1.0F + f_18_, 2.0F, 0.0F };
		int i_19_ = (int) f_15_;
		int i_20_ = (int) f_16_;
		int i_21_ = (bool ? aClass106_Sub3_4395.method1684(-576525925).method1648() : i_19_);
		int i_22_ = (bool ? aClass106_Sub3_4395.method1684(273445839).method1646() : i_20_);
		((Class351_Sub2) this).aClass406_9733.method4868(((Class351_Sub2) this).aClass405_9728);
		((Class351_Sub2) this).aClass406_9733.method4858();
		float f_23_ = (float) i_19_ / f_15_;
		float f_24_ = (float) i_20_ / f_16_;
		float f_25_ = (float) i_21_ / f_15_;
		float f_26_ = (float) i_22_ / f_16_;
		fs[8] = (fs[8] + 1.0F) * f_23_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_24_ + 1.0F;
		fs[10] *= f_25_;
		fs[7] *= f_26_;
		((Class351_Sub2) this).aClass406_9733.method4877(((Class351_Sub2) this).aClass572_Sub8_Sub1_9734, fs, 654890254);
		((Class351_Sub2) this).aClass406_9733.method4860(((Class351_Sub2) this).aClass572_Sub8_Sub1_9730, 0, interface43, (byte) -110);
		((Class351_Sub2) this).aClass406_9733.method4870(((Class351_Sub2) this).aClass572_Sub8_Sub1_9735, aFloat9732, (byte) -34);
		((Class351_Sub2) this).aClass406_9733.method4873(((Class351_Sub2) this).aClass572_Sub8_Sub1_9729, aFloat9736, aFloat9737, aFloat9738, aFloat9739, -2107017627);
		((Class351_Sub2) this).aClass406_9733.method4873(((Class351_Sub2) this).aClass572_Sub8_Sub1_9731, 0.0F, 0.0F, 0.0F, 0.0F, -1828502970);
		aClass106_Sub3_4395.method2004(0, 0, i_19_, i_20_);
	}

	boolean method4374() {
		return ((Class351_Sub2) this).aBool9740;
	}

	boolean method4407() {
		if (method4373()) {
			((Class351_Sub2) this).aClass406_9733 = aClass106_Sub3_4395.method9619("FilterLevels");
			if (((Class351_Sub2) this).aClass406_9733 == null)
				return false;
			try {
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9730 = ((Class351_Sub2) this).aClass406_9733.method4885("sceneTex", -1459431105);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9735 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsGamma", -1990650483);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9729 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsRanges", -1636781067);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9731 = ((Class351_Sub2) this).aClass406_9733.method4885("pixelOffset", -805862390);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9734 = ((Class351_Sub2) this).aClass406_9733.method4885("PosAndTexCoords", -1897382338);
				((Class351_Sub2) this).aClass405_9728 = ((Class351_Sub2) this).aClass406_9733.method4863("techAdjust", -627380732);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub2) this).aClass405_9728.method4803())
				return false;
			((Class351_Sub2) this).aBool9740 = true;
			return true;
		}
		return false;
	}

	boolean method4390() {
		if (method4373()) {
			((Class351_Sub2) this).aClass406_9733 = aClass106_Sub3_4395.method9619("FilterLevels");
			if (((Class351_Sub2) this).aClass406_9733 == null)
				return false;
			try {
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9730 = ((Class351_Sub2) this).aClass406_9733.method4885("sceneTex", -2010688524);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9735 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsGamma", -1773178119);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9729 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsRanges", -1619612951);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9731 = ((Class351_Sub2) this).aClass406_9733.method4885("pixelOffset", -755333824);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9734 = ((Class351_Sub2) this).aClass406_9733.method4885("PosAndTexCoords", -1643254125);
				((Class351_Sub2) this).aClass405_9728 = ((Class351_Sub2) this).aClass406_9733.method4863("techAdjust", -1027385863);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub2) this).aClass405_9728.method4803())
				return false;
			((Class351_Sub2) this).aBool9740 = true;
			return true;
		}
		return false;
	}

	boolean method4409() {
		if (method4373()) {
			((Class351_Sub2) this).aClass406_9733 = aClass106_Sub3_4395.method9619("FilterLevels");
			if (((Class351_Sub2) this).aClass406_9733 == null)
				return false;
			try {
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9730 = ((Class351_Sub2) this).aClass406_9733.method4885("sceneTex", -754763961);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9735 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsGamma", -899703850);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9729 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsRanges", -1638487317);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9731 = ((Class351_Sub2) this).aClass406_9733.method4885("pixelOffset", -871843288);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9734 = ((Class351_Sub2) this).aClass406_9733.method4885("PosAndTexCoords", -807013286);
				((Class351_Sub2) this).aClass405_9728 = ((Class351_Sub2) this).aClass406_9733.method4863("techAdjust", -829970913);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub2) this).aClass405_9728.method4803())
				return false;
			((Class351_Sub2) this).aBool9740 = true;
			return true;
		}
		return false;
	}

	void method4395() {
		/* empty */
	}

	void method4396() {
		/* empty */
	}

	int method4408() {
		return 1;
	}

	void method4398(int i, int i_27_) {
		/* empty */
	}

	void method4399(int i, int i_28_) {
		/* empty */
	}

	void method4400(int i, int i_29_) {
		/* empty */
	}

	void method4402(int i) {
		((Class351_Sub2) this).aClass406_9733.method4859();
	}

	void method4397() {
		/* empty */
	}

	boolean method4405() {
		if (method4373()) {
			((Class351_Sub2) this).aClass406_9733 = aClass106_Sub3_4395.method9619("FilterLevels");
			if (((Class351_Sub2) this).aClass406_9733 == null)
				return false;
			try {
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9730 = ((Class351_Sub2) this).aClass406_9733.method4885("sceneTex", -1180732891);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9735 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsGamma", -851628099);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9729 = ((Class351_Sub2) this).aClass406_9733.method4885("paramsRanges", -2141597706);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9731 = ((Class351_Sub2) this).aClass406_9733.method4885("pixelOffset", -2064399586);
				((Class351_Sub2) this).aClass572_Sub8_Sub1_9734 = ((Class351_Sub2) this).aClass406_9733.method4885("PosAndTexCoords", -825986166);
				((Class351_Sub2) this).aClass405_9728 = ((Class351_Sub2) this).aClass406_9733.method4863("techAdjust", 235469961);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub2) this).aClass405_9728.method4803())
				return false;
			((Class351_Sub2) this).aBool9740 = true;
			return true;
		}
		return false;
	}

	int method4391() {
		return 1;
	}

	int method4401() {
		return 1;
	}

	int method4406() {
		return 1;
	}

	void method4394() {
		/* empty */
	}

	int method4404() {
		return 0;
	}

	public Class351_Sub2(Class106_Sub3 class106_sub3) {
		super(class106_sub3);
	}

	boolean method4377() {
		return (aFloat9732 == 1.0F && aFloat9736 == 0.0F && aFloat9737 == 1.0F && aFloat9738 == 0.0F && aFloat9739 == 1.0F);
	}

	boolean method4414() {
		return (aFloat9732 == 1.0F && aFloat9736 == 0.0F && aFloat9737 == 1.0F && aFloat9738 == 0.0F && aFloat9739 == 1.0F);
	}
}
