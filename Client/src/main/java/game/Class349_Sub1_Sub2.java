package game;

/* Class349_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class349_Sub1_Sub2 extends Class349_Sub1 {
	float aFloat11212;
	public Class250 aClass250_11213;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11214;
	Class405 aClass405_11215;
	Class405 aClass405_11216;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11217;
	public Class250 aClass250_11218 = new Class250();
	Class337 aClass337_11219;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11220;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11221;
	float[] aFloatArray11222;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11223;
	float[] aFloatArray11224;
	Class572_Sub8_Sub1 aClass572_Sub8_Sub1_11225;
	public int anInt11226;
	public int anInt11227;
	public int anInt11228;
	public int anInt11229;

	public void method10169(int i) {
		if (((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310)
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11215);
		else
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11216);
		aClass406_9798.method4858();
		if (((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310)
			aClass406_9798.method4860((((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11214), 0, (((Class349_Sub1_Sub2) this).aClass337_11219.anInterface40_4308), (byte) -127);
		aClass406_9798.method4879((((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11223), aClass250_11213, -1052160250);
		aClass406_9798.method4879((((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11217), aClass250_11218, -2123024097);
		aClass406_9798.method4876(((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11221, new Class209(((Class349_Sub1_Sub2) this).aFloatArray11222[0], ((Class349_Sub1_Sub2) this).aFloatArray11222[1], ((Class349_Sub1_Sub2) this).aFloatArray11222[2], ((Class349_Sub1_Sub2) this).aFloatArray11222[3]), -1692496208);
		aClass406_9798.method4876(((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11225, new Class209(((Class349_Sub1_Sub2) this).aFloatArray11224[0], ((Class349_Sub1_Sub2) this).aFloatArray11224[1], ((Class349_Sub1_Sub2) this).aFloatArray11224[2], ((Class349_Sub1_Sub2) this).aFloatArray11224[3]), 1818390936);
		aClass406_9798.method4876((((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11220), new Class209((((Class349_Sub1_Sub2) this).aFloat11212), 0.0F, 0.0F, 0.0F), 1188313378);
		aClass106_Sub3_4394.method9652(Class379.aClass379_4588, 78224641 * anInt11226, anInt11227 * -667373441, anInt11228 * -1023848981, 76353651 * anInt11229);
	}

	boolean method9297() throws Exception_Sub3 {
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11223 = aClass406_9798.method4885("WorldMatrix", -1919379648);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11217 = aClass406_9798.method4885("WVPMatrix", -2017431978);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11221 = aClass406_9798.method4885("UGenerationPlane", -1604659856);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11225 = aClass406_9798.method4885("VGenerationPlane", -1217688991);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11220 = aClass406_9798.method4885("Time", -838700516);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11214 = aClass406_9798.method4885("billowSampler3D", -1923237785);
		if (((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310) {
			((Class349_Sub1_Sub2) this).aClass405_11215 = aClass406_9798.method4863("Waterfall3D", 90904666);
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11215);
		} else {
			((Class349_Sub1_Sub2) this).aClass405_11216 = aClass406_9798.method4863("Waterfall2D", 49992693);
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11216);
		}
		return true;
	}

	public void method10170(int i, int i_0_, int i_1_) {
		float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
		float f_2_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = f_3_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		} else {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = f_3_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		}
		((Class349_Sub1_Sub2) this).aFloatArray11224[0] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[1] = f_3_;
		((Class349_Sub1_Sub2) this).aFloatArray11224[2] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[3] = f * (float) aClass106_Sub3_4394.anInt10512 % 1.0F;
		if (!((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310) {
			int i_4_ = (int) (16.0F * ((float) aClass106_Sub3_4394.anInt10512 * f_2_));
			aClass106_Sub3_4394.method9659(((Class349_Sub1_Sub2) this).aClass337_11219.anInterface43Array4319[i_4_ % 16]);
		} else
			((Class349_Sub1_Sub2) this).aFloat11212 = (float) ((double) f_2_ * (double) aClass106_Sub3_4394.anInt10512 % 1.0);
	}

	public void method10171(int i, int i_5_) {
		float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
		float f_6_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_7_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = f_7_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		} else {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = f_7_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		}
		((Class349_Sub1_Sub2) this).aFloatArray11224[0] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[1] = f_7_;
		((Class349_Sub1_Sub2) this).aFloatArray11224[2] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[3] = f * (float) aClass106_Sub3_4394.anInt10512 % 1.0F;
		if (!((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310) {
			int i_8_ = (int) (16.0F * ((float) aClass106_Sub3_4394.anInt10512 * f_6_));
			aClass106_Sub3_4394.method9659(((Class349_Sub1_Sub2) this).aClass337_11219.anInterface43Array4319[i_8_ % 16]);
		} else
			((Class349_Sub1_Sub2) this).aFloat11212 = (float) ((double) f_6_ * (double) aClass106_Sub3_4394.anInt10512 % 1.0);
	}

	public Class349_Sub1_Sub2(Class106_Sub3 class106_sub3, Class337 class337) throws Exception_Sub3 {
		super(class106_sub3);
		aClass250_11213 = new Class250();
		((Class349_Sub1_Sub2) this).aFloatArray11222 = new float[4];
		((Class349_Sub1_Sub2) this).aFloatArray11224 = new float[4];
		((Class349_Sub1_Sub2) this).aClass337_11219 = class337;
		if (((Class349_Sub1_Sub2) this).aClass337_11219.method4241() && class106_sub3.method9575())
			method9288("Waterfall");
	}

	public void method10172(int i, int i_9_) {
		float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
		float f_10_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_11_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = f_11_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		} else {
			((Class349_Sub1_Sub2) this).aFloatArray11222[0] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[1] = 0.0F;
			((Class349_Sub1_Sub2) this).aFloatArray11222[2] = f_11_;
			((Class349_Sub1_Sub2) this).aFloatArray11222[3] = 0.0F;
		}
		((Class349_Sub1_Sub2) this).aFloatArray11224[0] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[1] = f_11_;
		((Class349_Sub1_Sub2) this).aFloatArray11224[2] = 0.0F;
		((Class349_Sub1_Sub2) this).aFloatArray11224[3] = f * (float) aClass106_Sub3_4394.anInt10512 % 1.0F;
		if (!((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310) {
			int i_12_ = (int) (16.0F * ((float) aClass106_Sub3_4394.anInt10512 * f_10_));
			aClass106_Sub3_4394.method9659(((Class349_Sub1_Sub2) this).aClass337_11219.anInterface43Array4319[i_12_ % 16]);
		} else
			((Class349_Sub1_Sub2) this).aFloat11212 = (float) ((double) f_10_ * (double) aClass106_Sub3_4394.anInt10512 % 1.0);
	}

	boolean method9298() throws Exception_Sub3 {
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11223 = aClass406_9798.method4885("WorldMatrix", -1182591876);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11217 = aClass406_9798.method4885("WVPMatrix", -1317327648);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11221 = aClass406_9798.method4885("UGenerationPlane", -1272523797);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11225 = aClass406_9798.method4885("VGenerationPlane", -1097079059);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11220 = aClass406_9798.method4885("Time", -1883071254);
		((Class349_Sub1_Sub2) this).aClass572_Sub8_Sub1_11214 = aClass406_9798.method4885("billowSampler3D", -1001090704);
		if (((Class349_Sub1_Sub2) this).aClass337_11219.aBool4310) {
			((Class349_Sub1_Sub2) this).aClass405_11215 = aClass406_9798.method4863("Waterfall3D", 63872874);
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11215);
		} else {
			((Class349_Sub1_Sub2) this).aClass405_11216 = aClass406_9798.method4863("Waterfall2D", -1273283106);
			aClass406_9798.method4868(((Class349_Sub1_Sub2) this).aClass405_11216);
		}
		return true;
	}
}
