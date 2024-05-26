package game;

/* Class658_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub2 extends Class658 {
	Class230 aClass230_9539 = new Class230();
	Class230 aClass230_9540 = new Class230(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
	static float aFloat9541;
	static int anInt9542;
	static int anInt9543;
	static int anInt9544;
	static float aFloat9545;
	static float aFloat9546;
	static float aFloat9547;
	static float aFloat9548;
	static float aFloat9549;
	static int anInt9550 = 0;

	public void method8921(int i) {
		anInt9550 = i * 1170211;
	}

	void method8922(Class240 class240, int i) {
		if (aFloat9545 != -1.0F && class240.aFloat2653 < aFloat9545)
			class240.aFloat2653 = aFloat9545;
		if (aFloat9546 != -1.0F && class240.aFloat2653 > aFloat9546)
			class240.aFloat2653 = aFloat9546;
		if (aFloat9547 != -1.0F && class240.aFloat2656 < aFloat9547)
			class240.aFloat2656 = aFloat9547;
		if (aFloat9548 != -1.0F && class240.aFloat2656 > aFloat9548)
			class240.aFloat2656 = aFloat9548;
		if (-1.0F != aFloat9549 && class240.aFloat2657 < aFloat9549)
			class240.aFloat2657 = aFloat9549;
		if (-1.0F != aFloat9541 && class240.aFloat2657 > aFloat9541)
			class240.aFloat2657 = aFloat9541;
	}

	public void method8923(int i, byte i_0_) {
		anInt9550 = i * 1170211;
	}

	public void method8924(int i) {
		anInt9550 = i * 1170211;
	}

	public void method8925(int i) {
		anInt9542 = 1678858137 * i;
	}

	public void method8926(int i, int i_1_) {
		anInt9544 = -923330829 * i;
	}

	public Class240 method7736(int i) {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-452703663));
		return class240;
	}

	public Class240 method7745(int i) {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9540));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-1522821241));
		return class240;
	}

	public void method8927(int i, int i_2_, int i_3_, int i_4_) {
		Class261 class261 = new Class261();
		class261.method3570(0.0, 0.0, 0.0, (double) i, (double) -i_2_, (double) i_3_, 0.0F, 1.0F, 0.0F);
		Class226 class226 = new Class226();
		class261.method3587(class226.aFloatArray2615);
		Class230 class230 = class226.method3156();
		class230.method3175();
		((Class658_Sub2) this).aClass230_9539.method3170(class230);
	}

	public void method7734(float f, int i) {
		Class230 class230 = method8929((short) 19698);
		if (0 != 1426861195 * anInt9550 || -1019081559 * anInt9542 != 0) {
			Class230 class230_5_ = Class230.method3210();
			class230_5_.method3172(1.0F, 0.0F, 0.0F, ((float) ((double) (anInt9550 * 1426861195) * 3.141592653589793 * 2.0) / 16384.0F));
			class230.method3189(class230_5_);
			Class240 class240 = Class240.method3316(0.0F, 1.0F, 0.0F);
			class240.method3288(class230);
			Class230 class230_6_ = Class230.method3210();
			class240.method3273();
			class230_6_.method3209(class240, ((float) ((double) (anInt9542 * -1019081559) * 3.141592653589793 * 2.0) / 16384.0F));
			class230.method3189(class230_6_);
			method8940(class230, (byte) 4);
			anInt9550 = 0;
			anInt9542 = 0;
		}
		if ((((Class658_Sub2) this).aClass411_8421.method4994(781241402) == Class413.aClass413_4910) && (anInt9543 * 1674973537 != 0 || 0 != 1177875003 * anInt9544)) {
			class230.method3175();
			Class423_Sub2 class423_sub2 = (Class423_Sub2) ((Class658_Sub2) this).aClass411_8421.method4990((byte) -33);
			Class572_Sub17 class572_sub17 = class423_sub2.method5146(-1345584928);
			Class240 class240 = class572_sub17.method8572(794536266);
			Class240 class240_7_ = Class240.method3316(0.0F, 0.0F, (float) (1177875003 * anInt9544));
			class240_7_.method3288(class230);
			class240_7_.aFloat2656 *= -1.0F;
			class240.method3305(class240_7_);
			Class240 class240_8_ = Class240.method3316((float) (1674973537 * anInt9543), 0.0F, 0.0F);
			class240_8_.method3288(class230);
			class240_8_.aFloat2656 *= -1.0F;
			class240.method3305(class240_8_);
			method8922(class240, -1945960760);
			class423_sub2.method9278(new Class572_Sub17(class572_sub17.anInt9123 * -746112025, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657), (byte) 3);
			anInt9543 = 0;
			anInt9544 = 0;
		}
	}

	public Class240 method7753() {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(300058249));
		return class240;
	}

	public void method8928(Class240 class240, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		aFloat9545 = i == -1 ? -1.0F : class240.aFloat2653 - (float) (i * 512);
		aFloat9546 = i_9_ == -1 ? -1.0F : class240.aFloat2653 + (float) (i_9_ * 512);
		aFloat9547 = i_12_ == -1 ? -1.0F : -class240.aFloat2656 - (float) (512 * i_12_);
		aFloat9548 = (-1 == i_13_ ? -1.0F : (float) (512 * i_13_) + -class240.aFloat2656);
		aFloat9549 = -1 == i_10_ ? -1.0F : class240.aFloat2657 - (float) (512 * i_10_);
		aFloat9541 = -1 == i_11_ ? -1.0F : class240.aFloat2657 + (float) (512 * i_11_);
	}

	public boolean method7742() {
		return (!Float.isNaN(((Class658_Sub2) this).aClass230_9539.aFloat2624) && ((Class658_Sub2) this).aClass411_8421.method4968(-833309220) != null);
	}

	public Class230 method8929(short i) {
		return new Class230(((Class658_Sub2) this).aClass230_9539);
	}

	public Class658_Sub2(Class411 class411) {
		super(class411);
	}

	public boolean method7743() {
		return (!Float.isNaN(((Class658_Sub2) this).aClass230_9539.aFloat2624) && ((Class658_Sub2) this).aClass411_8421.method4968(-406370510) != null);
	}

	public void method8930(int i, int i_15_) {
		anInt9543 = -1584508255 * i;
	}

	public void method7733(float f) {
		Class230 class230 = method8929((short) 3305);
		if (0 != 1426861195 * anInt9550 || -1019081559 * anInt9542 != 0) {
			Class230 class230_16_ = Class230.method3210();
			class230_16_.method3172(1.0F, 0.0F, 0.0F, ((float) ((double) (anInt9550 * 1426861195) * 3.141592653589793 * 2.0) / 16384.0F));
			class230.method3189(class230_16_);
			Class240 class240 = Class240.method3316(0.0F, 1.0F, 0.0F);
			class240.method3288(class230);
			Class230 class230_17_ = Class230.method3210();
			class240.method3273();
			class230_17_.method3209(class240, (float) ((double) (anInt9542 * -1019081559) * 3.141592653589793 * 2.0) / 16384.0F);
			class230.method3189(class230_17_);
			method8940(class230, (byte) 4);
			anInt9550 = 0;
			anInt9542 = 0;
		}
		if ((((Class658_Sub2) this).aClass411_8421.method4994(-387482432) == Class413.aClass413_4910) && (anInt9543 * 1674973537 != 0 || 0 != 1177875003 * anInt9544)) {
			class230.method3175();
			Class423_Sub2 class423_sub2 = (Class423_Sub2) ((Class658_Sub2) this).aClass411_8421.method4990((byte) -42);
			Class572_Sub17 class572_sub17 = class423_sub2.method5146(-1387533051);
			Class240 class240 = class572_sub17.method8572(1655542142);
			Class240 class240_18_ = Class240.method3316(0.0F, 0.0F, (float) (1177875003 * anInt9544));
			class240_18_.method3288(class230);
			class240_18_.aFloat2656 *= -1.0F;
			class240.method3305(class240_18_);
			Class240 class240_19_ = Class240.method3316((float) (1674973537 * anInt9543), 0.0F, 0.0F);
			class240_19_.method3288(class230);
			class240_19_.aFloat2656 *= -1.0F;
			class240.method3305(class240_19_);
			method8922(class240, 779073717);
			class423_sub2.method9278(new Class572_Sub17(class572_sub17.anInt9123 * -746112025, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657), (byte) 3);
			anInt9543 = 0;
			anInt9544 = 0;
		}
	}

	public void method8931(Class230 class230) {
		((Class658_Sub2) this).aClass230_9540.aFloat2624 = class230.aFloat2624;
		((Class658_Sub2) this).aClass230_9540.aFloat2623 = class230.aFloat2623;
		((Class658_Sub2) this).aClass230_9540.aFloat2626 = class230.aFloat2626;
		((Class658_Sub2) this).aClass230_9540.aFloat2621 = class230.aFloat2621;
		((Class658_Sub2) this).aClass230_9539.method3170(((Class658_Sub2) this).aClass230_9540);
	}

	public void method8932(int i, int i_20_) {
		anInt9542 = 1678858137 * i;
	}

	public void method7738(float f) {
		Class230 class230 = method8929((short) 11027);
		if (0 != 1426861195 * anInt9550 || -1019081559 * anInt9542 != 0) {
			Class230 class230_21_ = Class230.method3210();
			class230_21_.method3172(1.0F, 0.0F, 0.0F, ((float) ((double) (anInt9550 * 1426861195) * 3.141592653589793 * 2.0) / 16384.0F));
			class230.method3189(class230_21_);
			Class240 class240 = Class240.method3316(0.0F, 1.0F, 0.0F);
			class240.method3288(class230);
			Class230 class230_22_ = Class230.method3210();
			class240.method3273();
			class230_22_.method3209(class240, (float) ((double) (anInt9542 * -1019081559) * 3.141592653589793 * 2.0) / 16384.0F);
			class230.method3189(class230_22_);
			method8940(class230, (byte) 4);
			anInt9550 = 0;
			anInt9542 = 0;
		}
		if ((((Class658_Sub2) this).aClass411_8421.method4994(-1178292878) == Class413.aClass413_4910) && (anInt9543 * 1674973537 != 0 || 0 != 1177875003 * anInt9544)) {
			class230.method3175();
			Class423_Sub2 class423_sub2 = (Class423_Sub2) ((Class658_Sub2) this).aClass411_8421.method4990((byte) -76);
			Class572_Sub17 class572_sub17 = class423_sub2.method5146(-673081073);
			Class240 class240 = class572_sub17.method8572(453637139);
			Class240 class240_23_ = Class240.method3316(0.0F, 0.0F, (float) (1177875003 * anInt9544));
			class240_23_.method3288(class230);
			class240_23_.aFloat2656 *= -1.0F;
			class240.method3305(class240_23_);
			Class240 class240_24_ = Class240.method3316((float) (1674973537 * anInt9543), 0.0F, 0.0F);
			class240_24_.method3288(class230);
			class240_24_.aFloat2656 *= -1.0F;
			class240.method3305(class240_24_);
			method8922(class240, 557922110);
			class423_sub2.method9278(new Class572_Sub17(class572_sub17.anInt9123 * -746112025, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657), (byte) 3);
			anInt9543 = 0;
			anInt9544 = 0;
		}
	}

	public boolean method7744() {
		return (!Float.isNaN(((Class658_Sub2) this).aClass230_9539.aFloat2624) && ((Class658_Sub2) this).aClass411_8421.method4968(-892599403) != null);
	}

	public void method7737(RSByteBuffer class572_sub15, int i) {
		((Class658_Sub2) this).aClass230_9539.method3168(class572_sub15);
	}

	public void method7746(Class403 class403, Class261 class261, int i, int i_25_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub2) this).aClass411_8421.method4968(-1280076177));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_25_;
		class240.aFloat2656 *= -1.0F;
		class261.method3574(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class261.method3579(class240);
		class261.method3600();
		class240.method3261();
	}

	public void method7748(Class403 class403, Class261 class261, int i, int i_26_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub2) this).aClass411_8421.method4968(-1201574216));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_26_;
		class240.aFloat2656 *= -1.0F;
		class261.method3574(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class261.method3579(class240);
		class261.method3600();
		class240.method3261();
	}

	public void method7741(float f) {
		Class230 class230 = method8929((short) 19366);
		if (0 != 1426861195 * anInt9550 || -1019081559 * anInt9542 != 0) {
			Class230 class230_27_ = Class230.method3210();
			class230_27_.method3172(1.0F, 0.0F, 0.0F, ((float) ((double) (anInt9550 * 1426861195) * 3.141592653589793 * 2.0) / 16384.0F));
			class230.method3189(class230_27_);
			Class240 class240 = Class240.method3316(0.0F, 1.0F, 0.0F);
			class240.method3288(class230);
			Class230 class230_28_ = Class230.method3210();
			class240.method3273();
			class230_28_.method3209(class240, (float) ((double) (anInt9542 * -1019081559) * 3.141592653589793 * 2.0) / 16384.0F);
			class230.method3189(class230_28_);
			method8940(class230, (byte) 4);
			anInt9550 = 0;
			anInt9542 = 0;
		}
		if ((((Class658_Sub2) this).aClass411_8421.method4994(454194060) == Class413.aClass413_4910) && (anInt9543 * 1674973537 != 0 || 0 != 1177875003 * anInt9544)) {
			class230.method3175();
			Class423_Sub2 class423_sub2 = (Class423_Sub2) ((Class658_Sub2) this).aClass411_8421.method4990((byte) -80);
			Class572_Sub17 class572_sub17 = class423_sub2.method5146(-2082254409);
			Class240 class240 = class572_sub17.method8572(-1861272491);
			Class240 class240_29_ = Class240.method3316(0.0F, 0.0F, (float) (1177875003 * anInt9544));
			class240_29_.method3288(class230);
			class240_29_.aFloat2656 *= -1.0F;
			class240.method3305(class240_29_);
			Class240 class240_30_ = Class240.method3316((float) (1674973537 * anInt9543), 0.0F, 0.0F);
			class240_30_.method3288(class230);
			class240_30_.aFloat2656 *= -1.0F;
			class240.method3305(class240_30_);
			method8922(class240, -1596494652);
			class423_sub2.method9278(new Class572_Sub17(class572_sub17.anInt9123 * -746112025, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657), (byte) 3);
			anInt9543 = 0;
			anInt9544 = 0;
		}
	}

	public void method7747(Class403 class403, Class261 class261, int i, int i_31_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub2) this).aClass411_8421.method4968(-1785146096));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_31_;
		class240.aFloat2656 *= -1.0F;
		class261.method3574(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class261.method3579(class240);
		class261.method3600();
		class240.method3261();
	}

	public void method8933(int i) {
		anInt9550 = i * 1170211;
	}

	public void method7750(RSByteBuffer class572_sub15) {
		((Class658_Sub2) this).aClass230_9539.method3168(class572_sub15);
	}

	public void method7751(RSByteBuffer class572_sub15) {
		((Class658_Sub2) this).aClass230_9539.method3168(class572_sub15);
	}

	public Class240 method7749() {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9540));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-600045942));
		return class240;
	}

	public void method7739(Class403 class403, Class261 class261, int i, int i_32_, float f, byte i_33_) {
		Class240 class240 = Class240.method3276(((Class658_Sub2) this).aClass411_8421.method4968(-538590601));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_32_;
		class240.aFloat2656 *= -1.0F;
		class261.method3574(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class261.method3579(class240);
		class261.method3600();
		class240.method3261();
	}

	public Class240 method7752() {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9540));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-272056499));
		return class240;
	}

	public void method8934(int i) {
		anInt9550 = i * 1170211;
	}

	static {
		anInt9542 = 0;
		anInt9543 = 0;
		anInt9544 = 0;
		aFloat9545 = -1.0F;
		aFloat9546 = -1.0F;
		aFloat9547 = -1.0F;
		aFloat9548 = -1.0F;
		aFloat9549 = -1.0F;
		aFloat9541 = -1.0F;
	}

	public void method8935(int i) {
		anInt9542 = 1678858137 * i;
	}

	public void method8936(int i) {
		anInt9542 = 1678858137 * i;
	}

	public boolean method7735(byte i) {
		return (!Float.isNaN(((Class658_Sub2) this).aClass230_9539.aFloat2624) && ((Class658_Sub2) this).aClass411_8421.method4968(1862930124) != null);
	}

	public void method8937(int i) {
		anInt9542 = 1678858137 * i;
	}

	public void method8938(int i) {
		anInt9542 = 1678858137 * i;
	}

	public void method8939(int i) {
		anInt9543 = -1584508255 * i;
	}

	public Class240 method7740() {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-580614180));
		return class240;
	}

	public void method8940(Class230 class230, byte i) {
		((Class658_Sub2) this).aClass230_9540.aFloat2624 = class230.aFloat2624;
		((Class658_Sub2) this).aClass230_9540.aFloat2623 = class230.aFloat2623;
		((Class658_Sub2) this).aClass230_9540.aFloat2626 = class230.aFloat2626;
		((Class658_Sub2) this).aClass230_9540.aFloat2621 = class230.aFloat2621;
		((Class658_Sub2) this).aClass230_9539.method3170(((Class658_Sub2) this).aClass230_9540);
	}

	public Class240 method7754() {
		Class240 class240 = new Class240(0.0F, 0.0F, 1000.0F);
		class240.method3288(Class230.method3176(((Class658_Sub2) this).aClass230_9539));
		class240.aFloat2656 *= -1.0F;
		class240.method3305(((Class658_Sub2) this).aClass411_8421.method4968(-288221853));
		return class240;
	}

	public void method8941(int i, int i_34_, int i_35_) {
		Class261 class261 = new Class261();
		class261.method3570(0.0, 0.0, 0.0, (double) i, (double) -i_34_, (double) i_35_, 0.0F, 1.0F, 0.0F);
		Class226 class226 = new Class226();
		class261.method3587(class226.aFloatArray2615);
		Class230 class230 = class226.method3156();
		class230.method3175();
		((Class658_Sub2) this).aClass230_9539.method3170(class230);
	}

	public void method8942(int i, int i_36_, int i_37_) {
		Class261 class261 = new Class261();
		class261.method3570(0.0, 0.0, 0.0, (double) i, (double) -i_36_, (double) i_37_, 0.0F, 1.0F, 0.0F);
		Class226 class226 = new Class226();
		class261.method3587(class226.aFloatArray2615);
		Class230 class230 = class226.method3156();
		class230.method3175();
		((Class658_Sub2) this).aClass230_9539.method3170(class230);
	}

	void method8943(Class240 class240) {
		if (aFloat9545 != -1.0F && class240.aFloat2653 < aFloat9545)
			class240.aFloat2653 = aFloat9545;
		if (aFloat9546 != -1.0F && class240.aFloat2653 > aFloat9546)
			class240.aFloat2653 = aFloat9546;
		if (aFloat9547 != -1.0F && class240.aFloat2656 < aFloat9547)
			class240.aFloat2656 = aFloat9547;
		if (aFloat9548 != -1.0F && class240.aFloat2656 > aFloat9548)
			class240.aFloat2656 = aFloat9548;
		if (-1.0F != aFloat9549 && class240.aFloat2657 < aFloat9549)
			class240.aFloat2657 = aFloat9549;
		if (-1.0F != aFloat9541 && class240.aFloat2657 > aFloat9541)
			class240.aFloat2657 = aFloat9541;
	}
}
