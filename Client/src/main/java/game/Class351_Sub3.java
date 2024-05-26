package game;

/* Class351_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class351_Sub3 extends Class351 {
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9905;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9906;
	public static float aFloat9907;
	public static Class96_Sub2[] aClass96_Sub2Array9908;
	Class406 aClass406_9909;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9910;
	public static float[] aFloatArray9911 = { 0.0F, 0.0F, 0.0F };
	Class572_Sub8_Sub1[] aClass572_Sub8_Sub1Array9912;
	Class405[] aClass405Array9913 = null;
	public static int anInt9914;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_9915;
	boolean aBool9916;

	void method4403(int i) {
		((Class351_Sub3) this).aClass406_9909.method4859();
	}

	boolean method4373() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637());
	}

	void method4389(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_0_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_1_ = (float) class104_sub1.method1648();
		float f_2_ = (float) class104_sub1.method1646();
		Interface43 interface43_3_ = interface43;
		float f_4_ = f * 2.0F / f_1_;
		float f_5_ = -f * 2.0F / f_2_;
		float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_, -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_, 2.0F, 0.0F };
		int i_6_ = (int) f_1_;
		int i_7_ = (int) f_2_;
		int i_8_ = (bool ? aClass106_Sub3_4395.method1684(-1044440202).method1648() : i_6_);
		int i_9_ = (bool ? aClass106_Sub3_4395.method1684(585403263).method1646() : i_7_);
		Class405 class405 = ((Class351_Sub3) this).aClass405Array9913[anInt9914 - 1];
		((Class351_Sub3) this).aClass406_9909.method4868(class405);
		((Class351_Sub3) this).aClass406_9909.method4858();
		((Class351_Sub3) this).aClass406_9909.method4873(((Class351_Sub3) this).aClass572_Sub8_Sub1_9910, aFloat9907, aFloatArray9911[0], aFloatArray9911[1], aFloatArray9911[2], -2126289761);
		Object object = null;
		Object object_10_ = null;
		for (int i_11_ = 0; i_11_ < anInt9914; i_11_++) {
			if (aClass96_Sub2Array9908[i_11_] != null) {
				Class572_Sub8_Sub1 class572_sub8_sub1 = (((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[i_11_]);
				Interface34 interface34 = aClass96_Sub2Array9908[i_11_].method9998();
				((Class351_Sub3) this).aClass406_9909.method4860(class572_sub8_sub1, i_11_ + 1, interface34, (byte) -117);
			}
		}
		float f_12_ = (float) i_6_ / f_1_;
		float f_13_ = (float) i_7_ / f_2_;
		float f_14_ = (float) i_8_ / f_1_;
		float f_15_ = (float) i_9_ / f_2_;
		fs[8] = (fs[8] + 1.0F) * f_12_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_13_ + 1.0F;
		fs[10] *= f_14_;
		fs[7] *= f_15_;
		((Class351_Sub3) this).aClass406_9909.method4877(((Class351_Sub3) this).aClass572_Sub8_Sub1_9905, fs, 2140239846);
		((Class351_Sub3) this).aClass406_9909.method4860(((Class351_Sub3) this).aClass572_Sub8_Sub1_9906, 0, interface43_3_, (byte) -116);
		((Class351_Sub3) this).aClass406_9909.method4873(((Class351_Sub3) this).aClass572_Sub8_Sub1_9915, 0.0F, 0.0F, 0.0F, 0.0F, -1831646757);
		aClass106_Sub3_4395.method2004(0, 0, i_6_, i_7_);
	}

	boolean method4405() {
		if (method4373()) {
			((Class351_Sub3) this).aClass406_9909 = aClass106_Sub3_4395.method9619("FilterColourRemapping");
			if (((Class351_Sub3) this).aClass406_9909 == null)
				return false;
			try {
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9906 = ((Class351_Sub3) this).aClass406_9909.method4885("sceneTex", -1162812874);
				((Class351_Sub3) this).aClass405Array9913 = new Class405[3];
				((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912 = new Class572_Sub8_Sub1[3];
				if (aClass106_Sub3_4395.aBool10524) {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_1", 220392310);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_2", 932414813);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_3", -709482810);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_1", -1227563327);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_2", -1910831837);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_3", -1515869193);
				} else {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_1", -1497787588);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_2", 595367861);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_3", -1355210143);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_1", -1382819778);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_2", -1190962051);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_3", -1036140665);
				}
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9910 = ((Class351_Sub3) this).aClass406_9909.method4885("paramsWeightings", -775472977);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9915 = ((Class351_Sub3) this).aClass406_9909.method4885("pixelOffset", -1497915882);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9905 = ((Class351_Sub3) this).aClass406_9909.method4885("PosAndTexCoords", -1529296652);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub3) this).aClass405Array9913[0].method4803() || !((Class351_Sub3) this).aClass405Array9913[1].method4803() || !((Class351_Sub3) this).aClass405Array9913[2].method4803())
				return false;
			((Class351_Sub3) this).aBool9916 = true;
			return true;
		}
		return false;
	}

	void method4378(int i, int i_16_) {
		/* empty */
	}

	void method4394() {
		/* empty */
	}

	int method4372() {
		return 1;
	}

	void method4379(int i, Class104_Sub1 class104_sub1, Interface43 interface43, Interface11 interface11, Interface43 interface43_17_, boolean bool) {
		float f = aClass106_Sub3_4395.method9590();
		float f_18_ = (float) class104_sub1.method1648();
		float f_19_ = (float) class104_sub1.method1646();
		Interface43 interface43_20_ = interface43;
		float f_21_ = f * 2.0F / f_18_;
		float f_22_ = -f * 2.0F / f_19_;
		float[] fs = { -1.0F + f_21_, 1.0F + f_22_, 0.0F, 0.0F, -1.0F + f_21_, -3.0F + f_22_, 0.0F, 2.0F, 3.0F + f_21_, 1.0F + f_22_, 2.0F, 0.0F };
		int i_23_ = (int) f_18_;
		int i_24_ = (int) f_19_;
		int i_25_ = (bool ? aClass106_Sub3_4395.method1684(290595959).method1648() : i_23_);
		int i_26_ = (bool ? aClass106_Sub3_4395.method1684(-468923635).method1646() : i_24_);
		Class405 class405 = ((Class351_Sub3) this).aClass405Array9913[anInt9914 - 1];
		((Class351_Sub3) this).aClass406_9909.method4868(class405);
		((Class351_Sub3) this).aClass406_9909.method4858();
		((Class351_Sub3) this).aClass406_9909.method4873(((Class351_Sub3) this).aClass572_Sub8_Sub1_9910, aFloat9907, aFloatArray9911[0], aFloatArray9911[1], aFloatArray9911[2], -2137040254);
		Object object = null;
		Object object_27_ = null;
		for (int i_28_ = 0; i_28_ < anInt9914; i_28_++) {
			if (aClass96_Sub2Array9908[i_28_] != null) {
				Class572_Sub8_Sub1 class572_sub8_sub1 = (((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[i_28_]);
				Interface34 interface34 = aClass96_Sub2Array9908[i_28_].method9998();
				((Class351_Sub3) this).aClass406_9909.method4860(class572_sub8_sub1, i_28_ + 1, interface34, (byte) -126);
			}
		}
		float f_29_ = (float) i_23_ / f_18_;
		float f_30_ = (float) i_24_ / f_19_;
		float f_31_ = (float) i_25_ / f_18_;
		float f_32_ = (float) i_26_ / f_19_;
		fs[8] = (fs[8] + 1.0F) * f_29_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_30_ + 1.0F;
		fs[10] *= f_31_;
		fs[7] *= f_32_;
		((Class351_Sub3) this).aClass406_9909.method4877(((Class351_Sub3) this).aClass572_Sub8_Sub1_9905, fs, 499110761);
		((Class351_Sub3) this).aClass406_9909.method4860(((Class351_Sub3) this).aClass572_Sub8_Sub1_9906, 0, interface43_20_, (byte) -128);
		((Class351_Sub3) this).aClass406_9909.method4873(((Class351_Sub3) this).aClass572_Sub8_Sub1_9915, 0.0F, 0.0F, 0.0F, 0.0F, -1869232452);
		aClass106_Sub3_4395.method2004(0, 0, i_23_, i_24_);
	}

	void method4400(int i, int i_33_) {
		/* empty */
	}

	int method4383() {
		return 0;
	}

	int method4382() {
		return 2;
	}

	int method4391() {
		return 1;
	}

	static {
		aFloat9907 = 1.0F;
		anInt9914 = 1;
		aClass96_Sub2Array9908 = new Class96_Sub2[] { null, null, null };
	}

	boolean method4387() {
		return (aClass106_Sub3_4395.aBool10519 && aClass106_Sub3_4395.method9637());
	}

	void method4381(int i) {
		((Class351_Sub3) this).aClass406_9909.method4859();
	}

	boolean method4407() {
		if (method4373()) {
			((Class351_Sub3) this).aClass406_9909 = aClass106_Sub3_4395.method9619("FilterColourRemapping");
			if (((Class351_Sub3) this).aClass406_9909 == null)
				return false;
			try {
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9906 = ((Class351_Sub3) this).aClass406_9909.method4885("sceneTex", -1097912476);
				((Class351_Sub3) this).aClass405Array9913 = new Class405[3];
				((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912 = new Class572_Sub8_Sub1[3];
				if (aClass106_Sub3_4395.aBool10524) {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_1", -1176738787);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_2", -636178866);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_3", -1692083465);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_1", -1704108812);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_2", -1408301836);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_3", -1923623306);
				} else {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_1", 495882302);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_2", -209389077);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_3", 185633657);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_1", -1550476602);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_2", -958838641);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_3", -1506890132);
				}
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9910 = ((Class351_Sub3) this).aClass406_9909.method4885("paramsWeightings", -1390279627);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9915 = ((Class351_Sub3) this).aClass406_9909.method4885("pixelOffset", -1965586014);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9905 = ((Class351_Sub3) this).aClass406_9909.method4885("PosAndTexCoords", -1215224760);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub3) this).aClass405Array9913[0].method4803() || !((Class351_Sub3) this).aClass405Array9913[1].method4803() || !((Class351_Sub3) this).aClass405Array9913[2].method4803())
				return false;
			((Class351_Sub3) this).aBool9916 = true;
			return true;
		}
		return false;
	}

	boolean method4390() {
		if (method4373()) {
			((Class351_Sub3) this).aClass406_9909 = aClass106_Sub3_4395.method9619("FilterColourRemapping");
			if (((Class351_Sub3) this).aClass406_9909 == null)
				return false;
			try {
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9906 = ((Class351_Sub3) this).aClass406_9909.method4885("sceneTex", -1567053313);
				((Class351_Sub3) this).aClass405Array9913 = new Class405[3];
				((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912 = new Class572_Sub8_Sub1[3];
				if (aClass106_Sub3_4395.aBool10524) {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_1", -1175984638);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_2", 466714256);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_3", -1462735205);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_1", -1781092180);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_2", -1679777329);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_3", -1106706183);
				} else {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_1", -1995596568);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_2", -903300818);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_3", 272725062);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_1", -1143292684);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_2", -1258453041);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_3", -1483892349);
				}
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9910 = ((Class351_Sub3) this).aClass406_9909.method4885("paramsWeightings", -1525550578);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9915 = ((Class351_Sub3) this).aClass406_9909.method4885("pixelOffset", -2101625310);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9905 = ((Class351_Sub3) this).aClass406_9909.method4885("PosAndTexCoords", -1618904135);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub3) this).aClass405Array9913[0].method4803() || !((Class351_Sub3) this).aClass405Array9913[1].method4803() || !((Class351_Sub3) this).aClass405Array9913[2].method4803())
				return false;
			((Class351_Sub3) this).aBool9916 = true;
			return true;
		}
		return false;
	}

	boolean method4409() {
		if (method4373()) {
			((Class351_Sub3) this).aClass406_9909 = aClass106_Sub3_4395.method9619("FilterColourRemapping");
			if (((Class351_Sub3) this).aClass406_9909 == null)
				return false;
			try {
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9906 = ((Class351_Sub3) this).aClass406_9909.method4885("sceneTex", -1521801807);
				((Class351_Sub3) this).aClass405Array9913 = new Class405[3];
				((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912 = new Class572_Sub8_Sub1[3];
				if (aClass106_Sub3_4395.aBool10524) {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_1", -747798063);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_2", -916854423);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap3D_3", 430922130);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_1", -1636048457);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_2", -1074208259);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex3D_3", -1358787181);
				} else {
					((Class351_Sub3) this).aClass405Array9913[0] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_1", -368740113);
					((Class351_Sub3) this).aClass405Array9913[1] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_2", 338730881);
					((Class351_Sub3) this).aClass405Array9913[2] = ((Class351_Sub3) this).aClass406_9909.method4863("techRemap2D_3", -2047083405);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[0] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_1", -2142156010);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[1] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_2", -1101157680);
					((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912[2] = ((Class351_Sub3) this).aClass406_9909.method4885("remapTex2D_3", -1492346655);
				}
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9910 = ((Class351_Sub3) this).aClass406_9909.method4885("paramsWeightings", -978807115);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9915 = ((Class351_Sub3) this).aClass406_9909.method4885("pixelOffset", -1911578071);
				((Class351_Sub3) this).aClass572_Sub8_Sub1_9905 = ((Class351_Sub3) this).aClass406_9909.method4885("PosAndTexCoords", -1752829284);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!((Class351_Sub3) this).aClass405Array9913[0].method4803() || !((Class351_Sub3) this).aClass405Array9913[1].method4803() || !((Class351_Sub3) this).aClass405Array9913[2].method4803())
				return false;
			((Class351_Sub3) this).aBool9916 = true;
			return true;
		}
		return false;
	}

	boolean method4374() {
		return ((Class351_Sub3) this).aBool9916;
	}

	void method4396() {
		/* empty */
	}

	boolean method4388() {
		return ((Class351_Sub3) this).aBool9916;
	}

	void method4398(int i, int i_34_) {
		/* empty */
	}

	boolean method4377() {
		return (anInt9914 == 0 || aFloat9907 == 1.0F || (aFloatArray9911[0] + aFloatArray9911[1] + aFloatArray9911[2]) == 0.0F || (aClass96_Sub2Array9908[0] == null && aClass96_Sub2Array9908[1] == null && aClass96_Sub2Array9908[2] == null));
	}

	public Class351_Sub3(Class106_Sub3 class106_sub3) {
		super(class106_sub3);
		((Class351_Sub3) this).aClass572_Sub8_Sub1Array9912 = null;
	}

	void method4397() {
		/* empty */
	}

	void method4402(int i) {
		((Class351_Sub3) this).aClass406_9909.method4859();
	}

	void method4395() {
		/* empty */
	}

	void method4399(int i, int i_35_) {
		/* empty */
	}

	int method4401() {
		return 1;
	}

	int method4406() {
		return 2;
	}

	int method4375() {
		return 2;
	}

	int method4408() {
		return 2;
	}

	int method4404() {
		return 0;
	}

	boolean method4380() {
		return (anInt9914 == 0 || aFloat9907 == 1.0F || (aFloatArray9911[0] + aFloatArray9911[1] + aFloatArray9911[2]) == 0.0F || (aClass96_Sub2Array9908[0] == null && aClass96_Sub2Array9908[1] == null && aClass96_Sub2Array9908[2] == null));
	}

	boolean method4414() {
		return (anInt9914 == 0 || aFloat9907 == 1.0F || (aFloatArray9911[0] + aFloatArray9911[1] + aFloatArray9911[2]) == 0.0F || (aClass96_Sub2Array9908[0] == null && aClass96_Sub2Array9908[1] == null && aClass96_Sub2Array9908[2] == null));
	}
}
