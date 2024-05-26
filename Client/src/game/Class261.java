package game;

/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class261 {
	float aFloat2797;
	float aFloat2798;
	float aFloat2799;
	public static Class261 aClass261_2800 = new Class261();
	float aFloat2801;
	float aFloat2802;
	float aFloat2803;
	float aFloat2804;
	float aFloat2805;
	float aFloat2806;
	float aFloat2807;
	float aFloat2808;
	float aFloat2809;

	public void method3567() {
		((Class261) this).aFloat2798 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
		((Class261) this).aFloat2797 = 0.0F;
		((Class261) this).aFloat2804 = 0.0F;
		((Class261) this).aFloat2803 = 0.0F;
		((Class261) this).aFloat2801 = 0.0F;
		((Class261) this).aFloat2809 = 0.0F;
		((Class261) this).aFloat2799 = 0.0F;
		((Class261) this).aFloat2806 = 1.0F;
		((Class261) this).aFloat2805 = 1.0F;
		((Class261) this).aFloat2802 = 1.0F;
	}

	public void method3568(Class261 class261_0_) {
		((Class261) this).aFloat2802 = ((Class261) class261_0_).aFloat2802;
		((Class261) this).aFloat2801 = ((Class261) class261_0_).aFloat2801;
		((Class261) this).aFloat2804 = ((Class261) class261_0_).aFloat2804;
		((Class261) this).aFloat2807 = ((Class261) class261_0_).aFloat2807;
		((Class261) this).aFloat2799 = ((Class261) class261_0_).aFloat2799;
		((Class261) this).aFloat2805 = ((Class261) class261_0_).aFloat2805;
		((Class261) this).aFloat2797 = ((Class261) class261_0_).aFloat2797;
		((Class261) this).aFloat2808 = ((Class261) class261_0_).aFloat2808;
		((Class261) this).aFloat2809 = ((Class261) class261_0_).aFloat2809;
		((Class261) this).aFloat2803 = ((Class261) class261_0_).aFloat2803;
		((Class261) this).aFloat2806 = ((Class261) class261_0_).aFloat2806;
		((Class261) this).aFloat2798 = ((Class261) class261_0_).aFloat2798;
	}

	public void method3569(Class238 class238) {
		float f = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2621);
		float f_1_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2624);
		float f_2_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2623);
		float f_3_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2626);
		float f_4_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2624);
		float f_5_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2623);
		float f_6_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2626);
		float f_7_ = (class238.aClass230_2648.aFloat2623 * class238.aClass230_2648.aFloat2623);
		float f_8_ = (class238.aClass230_2648.aFloat2623 * class238.aClass230_2648.aFloat2626);
		float f_9_ = (class238.aClass230_2648.aFloat2626 * class238.aClass230_2648.aFloat2626);
		((Class261) this).aFloat2802 = f_4_ + f - f_9_ - f_7_;
		((Class261) this).aFloat2799 = f_5_ + f_3_ + f_5_ + f_3_;
		((Class261) this).aFloat2809 = f_6_ - f_2_ - f_2_ + f_6_;
		((Class261) this).aFloat2801 = f_5_ - f_3_ - f_3_ + f_5_;
		((Class261) this).aFloat2805 = f_7_ + f - f_4_ - f_9_;
		((Class261) this).aFloat2803 = f_8_ + f_1_ + f_8_ + f_1_;
		((Class261) this).aFloat2804 = f_6_ + f_2_ + f_6_ + f_2_;
		((Class261) this).aFloat2797 = f_8_ - f_1_ - f_1_ + f_8_;
		((Class261) this).aFloat2806 = f_9_ + f - f_7_ - f_4_;
		((Class261) this).aFloat2807 = class238.aClass240_2647.aFloat2653;
		((Class261) this).aFloat2808 = class238.aClass240_2647.aFloat2656;
		((Class261) this).aFloat2798 = class238.aClass240_2647.aFloat2657;
	}

	public Class261() {
		method3594();
	}

	public void method3570(double d, double d_10_, double d_11_, double d_12_, double d_13_, double d_14_, float f, float f_15_, float f_16_) {
		float f_17_ = (float) (d_12_ - d);
		float f_18_ = (float) (d_13_ - d_10_);
		float f_19_ = (float) (d_14_ - d_11_);
		float f_20_ = f_15_ * f_19_ - f_16_ * f_18_;
		float f_21_ = f_16_ * f_17_ - f * f_19_;
		float f_22_ = f * f_18_ - f_15_ * f_17_;
		float f_23_ = (float) (1.0 / Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_)));
		float f_24_ = (float) (1.0 / Math.sqrt((double) (f_17_ * f_17_ + f_18_ * f_18_ + f_19_ * f_19_)));
		((Class261) this).aFloat2802 = f_20_ * f_23_;
		((Class261) this).aFloat2801 = f_21_ * f_23_;
		((Class261) this).aFloat2804 = f_22_ * f_23_;
		((Class261) this).aFloat2809 = f_17_ * f_24_;
		((Class261) this).aFloat2803 = f_18_ * f_24_;
		((Class261) this).aFloat2806 = f_19_ * f_24_;
		((Class261) this).aFloat2799 = (((Class261) this).aFloat2803 * ((Class261) this).aFloat2804 - ((Class261) this).aFloat2806 * ((Class261) this).aFloat2801);
		((Class261) this).aFloat2805 = (((Class261) this).aFloat2806 * ((Class261) this).aFloat2802 - ((Class261) this).aFloat2809 * ((Class261) this).aFloat2804);
		((Class261) this).aFloat2797 = (((Class261) this).aFloat2809 * ((Class261) this).aFloat2801 - ((Class261) this).aFloat2803 * ((Class261) this).aFloat2802);
		((Class261) this).aFloat2807 = -(float) (d * (double) ((Class261) this).aFloat2802 + d_10_ * (double) ((Class261) this).aFloat2801 + d_11_ * (double) ((Class261) this).aFloat2804);
		((Class261) this).aFloat2808 = -(float) (d * (double) ((Class261) this).aFloat2799 + d_10_ * (double) ((Class261) this).aFloat2805 + d_11_ * (double) ((Class261) this).aFloat2797);
		((Class261) this).aFloat2798 = -(float) (d * (double) ((Class261) this).aFloat2809 + d_10_ * (double) ((Class261) this).aFloat2803 + d_11_ * (double) ((Class261) this).aFloat2806);
	}

	public void method3571(float f, float f_25_, float f_26_, float f_27_) {
		float f_28_ = (float) Math.cos((double) f_27_);
		float f_29_ = (float) Math.sin((double) f_27_);
		((Class261) this).aFloat2802 = f_28_ + f * f * (1.0F - f_28_);
		((Class261) this).aFloat2799 = f_26_ * f_29_ + f_25_ * f * (1.0F - f_28_);
		((Class261) this).aFloat2809 = -f_25_ * f_29_ + f_26_ * f * (1.0F - f_28_);
		((Class261) this).aFloat2801 = -f_26_ * f_29_ + f * f_25_ * (1.0F - f_28_);
		((Class261) this).aFloat2805 = f_28_ + f_25_ * f_25_ * (1.0F - f_28_);
		((Class261) this).aFloat2803 = f * f_29_ + f_26_ * f_25_ * (1.0F - f_28_);
		((Class261) this).aFloat2804 = f_25_ * f_29_ + f * f_26_ * (1.0F - f_28_);
		((Class261) this).aFloat2797 = -f * f_29_ + f_25_ * f_26_ * (1.0F - f_28_);
		((Class261) this).aFloat2806 = f_28_ + f_26_ * f_26_ * (1.0F - f_28_);
		((Class261) this).aFloat2798 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
	}

	public void method3572(float f, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_) {
		((Class261) this).aFloat2802 = f;
		((Class261) this).aFloat2801 = f_32_;
		((Class261) this).aFloat2804 = f_35_;
		((Class261) this).aFloat2807 = 0.0F;
		((Class261) this).aFloat2799 = f_30_;
		((Class261) this).aFloat2805 = f_33_;
		((Class261) this).aFloat2797 = f_36_;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2809 = f_31_;
		((Class261) this).aFloat2803 = f_34_;
		((Class261) this).aFloat2806 = f_37_;
		((Class261) this).aFloat2798 = 0.0F;
	}

	public void method3573(Class261 class261_38_) {
		if (class261_38_ == this)
			method3600();
		else {
			((Class261) this).aFloat2802 = ((Class261) class261_38_).aFloat2802;
			((Class261) this).aFloat2801 = ((Class261) class261_38_).aFloat2799;
			((Class261) this).aFloat2804 = ((Class261) class261_38_).aFloat2809;
			((Class261) this).aFloat2799 = ((Class261) class261_38_).aFloat2801;
			((Class261) this).aFloat2805 = ((Class261) class261_38_).aFloat2805;
			((Class261) this).aFloat2797 = ((Class261) class261_38_).aFloat2803;
			((Class261) this).aFloat2809 = ((Class261) class261_38_).aFloat2804;
			((Class261) this).aFloat2803 = ((Class261) class261_38_).aFloat2797;
			((Class261) this).aFloat2806 = ((Class261) class261_38_).aFloat2806;
			((Class261) this).aFloat2807 = -((((Class261) class261_38_).aFloat2807 * ((Class261) this).aFloat2802) + (((Class261) class261_38_).aFloat2808 * ((Class261) this).aFloat2801) + (((Class261) class261_38_).aFloat2798 * ((Class261) this).aFloat2804));
			((Class261) this).aFloat2808 = -((((Class261) class261_38_).aFloat2807 * ((Class261) this).aFloat2799) + (((Class261) class261_38_).aFloat2808 * ((Class261) this).aFloat2805) + (((Class261) class261_38_).aFloat2798 * ((Class261) this).aFloat2797));
			((Class261) this).aFloat2798 = -((((Class261) class261_38_).aFloat2807 * ((Class261) this).aFloat2809) + (((Class261) class261_38_).aFloat2808 * ((Class261) this).aFloat2803) + (((Class261) class261_38_).aFloat2798 * ((Class261) this).aFloat2806));
		}
	}

	public void method3574(Class230 class230) {
		method3575(class230.aFloat2624, class230.aFloat2623, class230.aFloat2626, class230.aFloat2621);
	}

	void method3575(float f, float f_39_, float f_40_, float f_41_) {
		float f_42_ = f * f;
		float f_43_ = f * f_39_;
		float f_44_ = f * f_40_;
		float f_45_ = f * f_41_;
		float f_46_ = f_39_ * f_39_;
		float f_47_ = f_39_ * f_40_;
		float f_48_ = f_39_ * f_41_;
		float f_49_ = f_40_ * f_40_;
		float f_50_ = f_40_ * f_41_;
		((Class261) this).aFloat2802 = 1.0F - 2.0F * (f_46_ + f_49_);
		((Class261) this).aFloat2801 = 2.0F * (f_43_ - f_50_);
		((Class261) this).aFloat2804 = 2.0F * (f_44_ + f_48_);
		((Class261) this).aFloat2799 = 2.0F * (f_43_ + f_50_);
		((Class261) this).aFloat2805 = 1.0F - 2.0F * (f_42_ + f_49_);
		((Class261) this).aFloat2797 = 2.0F * (f_47_ - f_45_);
		((Class261) this).aFloat2809 = 2.0F * (f_44_ - f_48_);
		((Class261) this).aFloat2803 = 2.0F * (f_47_ + f_45_);
		((Class261) this).aFloat2806 = 1.0F - 2.0F * (f_42_ + f_46_);
		((Class261) this).aFloat2798 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
	}

	public void method3576(float f, float f_51_, float f_52_, float f_53_) {
		float f_54_ = (float) Math.cos((double) f_53_);
		float f_55_ = (float) Math.sin((double) f_53_);
		float f_56_ = f_54_ + f * f * (1.0F - f_54_);
		float f_57_ = f_52_ * f_55_ + f_51_ * f * (1.0F - f_54_);
		float f_58_ = -f_51_ * f_55_ + f_52_ * f * (1.0F - f_54_);
		float f_59_ = -f_52_ * f_55_ + f * f_51_ * (1.0F - f_54_);
		float f_60_ = f_54_ + f_51_ * f_51_ * (1.0F - f_54_);
		float f_61_ = f * f_55_ + f_52_ * f_51_ * (1.0F - f_54_);
		float f_62_ = f_51_ * f_55_ + f * f_52_ * (1.0F - f_54_);
		float f_63_ = -f * f_55_ + f_51_ * f_52_ * (1.0F - f_54_);
		float f_64_ = f_54_ + f_52_ * f_52_ * (1.0F - f_54_);
		float f_65_ = ((Class261) this).aFloat2802;
		float f_66_ = ((Class261) this).aFloat2799;
		float f_67_ = ((Class261) this).aFloat2801;
		float f_68_ = ((Class261) this).aFloat2805;
		float f_69_ = ((Class261) this).aFloat2804;
		float f_70_ = ((Class261) this).aFloat2797;
		float f_71_ = ((Class261) this).aFloat2807;
		float f_72_ = ((Class261) this).aFloat2808;
		((Class261) this).aFloat2802 = (f_65_ * f_56_ + f_66_ * f_59_ + ((Class261) this).aFloat2809 * f_62_);
		((Class261) this).aFloat2799 = (f_65_ * f_57_ + f_66_ * f_60_ + ((Class261) this).aFloat2809 * f_63_);
		((Class261) this).aFloat2809 = (f_65_ * f_58_ + f_66_ * f_61_ + ((Class261) this).aFloat2809 * f_64_);
		((Class261) this).aFloat2801 = (f_67_ * f_56_ + f_68_ * f_59_ + ((Class261) this).aFloat2803 * f_62_);
		((Class261) this).aFloat2805 = (f_67_ * f_57_ + f_68_ * f_60_ + ((Class261) this).aFloat2803 * f_63_);
		((Class261) this).aFloat2803 = (f_67_ * f_58_ + f_68_ * f_61_ + ((Class261) this).aFloat2803 * f_64_);
		((Class261) this).aFloat2804 = (f_69_ * f_56_ + f_70_ * f_59_ + ((Class261) this).aFloat2806 * f_62_);
		((Class261) this).aFloat2797 = (f_69_ * f_57_ + f_70_ * f_60_ + ((Class261) this).aFloat2806 * f_63_);
		((Class261) this).aFloat2806 = (f_69_ * f_58_ + f_70_ * f_61_ + ((Class261) this).aFloat2806 * f_64_);
		((Class261) this).aFloat2807 = (f_71_ * f_56_ + f_72_ * f_59_ + ((Class261) this).aFloat2798 * f_62_);
		((Class261) this).aFloat2808 = (f_71_ * f_57_ + f_72_ * f_60_ + ((Class261) this).aFloat2798 * f_63_);
		((Class261) this).aFloat2798 = (f_71_ * f_58_ + f_72_ * f_61_ + ((Class261) this).aFloat2798 * f_64_);
	}

	public void method3577(float f, float f_73_, float f_74_) {
		((Class261) this).aFloat2802 = f;
		((Class261) this).aFloat2801 = 0.0F;
		((Class261) this).aFloat2804 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
		((Class261) this).aFloat2799 = 0.0F;
		((Class261) this).aFloat2805 = f_73_;
		((Class261) this).aFloat2797 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2809 = 0.0F;
		((Class261) this).aFloat2803 = 0.0F;
		((Class261) this).aFloat2806 = f_74_;
		((Class261) this).aFloat2798 = 0.0F;
	}

	public void method3578(float f, float f_75_, float f_76_) {
		((Class261) this).aFloat2802 *= f;
		((Class261) this).aFloat2801 *= f;
		((Class261) this).aFloat2804 *= f;
		((Class261) this).aFloat2807 *= f;
		((Class261) this).aFloat2799 *= f_75_;
		((Class261) this).aFloat2805 *= f_75_;
		((Class261) this).aFloat2797 *= f_75_;
		((Class261) this).aFloat2808 *= f_75_;
		((Class261) this).aFloat2809 *= f_76_;
		((Class261) this).aFloat2803 *= f_76_;
		((Class261) this).aFloat2806 *= f_76_;
		((Class261) this).aFloat2798 *= f_76_;
	}

	public void method3579(Class240 class240) {
		method3580(class240.aFloat2653, class240.aFloat2656, class240.aFloat2657);
	}

	public void method3580(float f, float f_77_, float f_78_) {
		((Class261) this).aFloat2807 += f;
		((Class261) this).aFloat2808 += f_77_;
		((Class261) this).aFloat2798 += f_78_;
	}

	public void method3581(Class261 class261_79_, Class261 class261_80_) {
		((Class261) this).aFloat2802 = ((((Class261) class261_79_).aFloat2802 * ((Class261) class261_80_).aFloat2802) + (((Class261) class261_79_).aFloat2799 * ((Class261) class261_80_).aFloat2801) + (((Class261) class261_79_).aFloat2809 * ((Class261) class261_80_).aFloat2804));
		((Class261) this).aFloat2799 = ((((Class261) class261_79_).aFloat2802 * ((Class261) class261_80_).aFloat2799) + (((Class261) class261_79_).aFloat2799 * ((Class261) class261_80_).aFloat2805) + (((Class261) class261_79_).aFloat2809 * ((Class261) class261_80_).aFloat2797));
		((Class261) this).aFloat2809 = ((((Class261) class261_79_).aFloat2802 * ((Class261) class261_80_).aFloat2809) + (((Class261) class261_79_).aFloat2799 * ((Class261) class261_80_).aFloat2803) + (((Class261) class261_79_).aFloat2809 * ((Class261) class261_80_).aFloat2806));
		((Class261) this).aFloat2801 = ((((Class261) class261_79_).aFloat2801 * ((Class261) class261_80_).aFloat2802) + (((Class261) class261_79_).aFloat2805 * ((Class261) class261_80_).aFloat2801) + (((Class261) class261_79_).aFloat2803 * ((Class261) class261_80_).aFloat2804));
		((Class261) this).aFloat2805 = ((((Class261) class261_79_).aFloat2801 * ((Class261) class261_80_).aFloat2799) + (((Class261) class261_79_).aFloat2805 * ((Class261) class261_80_).aFloat2805) + (((Class261) class261_79_).aFloat2803 * ((Class261) class261_80_).aFloat2797));
		((Class261) this).aFloat2803 = ((((Class261) class261_79_).aFloat2801 * ((Class261) class261_80_).aFloat2809) + (((Class261) class261_79_).aFloat2805 * ((Class261) class261_80_).aFloat2803) + (((Class261) class261_79_).aFloat2803 * ((Class261) class261_80_).aFloat2806));
		((Class261) this).aFloat2804 = ((((Class261) class261_79_).aFloat2804 * ((Class261) class261_80_).aFloat2802) + (((Class261) class261_79_).aFloat2797 * ((Class261) class261_80_).aFloat2801) + (((Class261) class261_79_).aFloat2806 * ((Class261) class261_80_).aFloat2804));
		((Class261) this).aFloat2797 = ((((Class261) class261_79_).aFloat2804 * ((Class261) class261_80_).aFloat2799) + (((Class261) class261_79_).aFloat2797 * ((Class261) class261_80_).aFloat2805) + (((Class261) class261_79_).aFloat2806 * ((Class261) class261_80_).aFloat2797));
		((Class261) this).aFloat2806 = ((((Class261) class261_79_).aFloat2804 * ((Class261) class261_80_).aFloat2809) + (((Class261) class261_79_).aFloat2797 * ((Class261) class261_80_).aFloat2803) + (((Class261) class261_79_).aFloat2806 * ((Class261) class261_80_).aFloat2806));
		((Class261) this).aFloat2807 = ((((Class261) class261_79_).aFloat2807 * ((Class261) class261_80_).aFloat2802) + (((Class261) class261_79_).aFloat2808 * ((Class261) class261_80_).aFloat2801) + (((Class261) class261_79_).aFloat2798 * ((Class261) class261_80_).aFloat2804) + ((Class261) class261_80_).aFloat2807);
		((Class261) this).aFloat2808 = ((((Class261) class261_79_).aFloat2807 * ((Class261) class261_80_).aFloat2799) + (((Class261) class261_79_).aFloat2808 * ((Class261) class261_80_).aFloat2805) + (((Class261) class261_79_).aFloat2798 * ((Class261) class261_80_).aFloat2797) + ((Class261) class261_80_).aFloat2808);
		((Class261) this).aFloat2798 = ((((Class261) class261_79_).aFloat2807 * ((Class261) class261_80_).aFloat2809) + (((Class261) class261_79_).aFloat2808 * ((Class261) class261_80_).aFloat2803) + (((Class261) class261_79_).aFloat2798 * ((Class261) class261_80_).aFloat2806) + ((Class261) class261_80_).aFloat2798);
	}

	public void method3582(float f, float f_81_, float f_82_, float[] fs) {
		fs[0] = (((Class261) this).aFloat2802 * f + ((Class261) this).aFloat2801 * f_81_ + ((Class261) this).aFloat2804 * f_82_ + ((Class261) this).aFloat2807);
		fs[1] = (((Class261) this).aFloat2799 * f + ((Class261) this).aFloat2805 * f_81_ + ((Class261) this).aFloat2797 * f_82_ + ((Class261) this).aFloat2808);
		fs[2] = (((Class261) this).aFloat2809 * f + ((Class261) this).aFloat2803 * f_81_ + ((Class261) this).aFloat2806 * f_82_ + ((Class261) this).aFloat2798);
	}

	public void method3583(Class238 class238) {
		method3574(class238.aClass230_2648);
		method3579(class238.aClass240_2647);
	}

	public void method3584(Class261 class261_83_) {
		float f = ((Class261) this).aFloat2802;
		float f_84_ = ((Class261) this).aFloat2799;
		float f_85_ = ((Class261) this).aFloat2801;
		float f_86_ = ((Class261) this).aFloat2805;
		float f_87_ = ((Class261) this).aFloat2804;
		float f_88_ = ((Class261) this).aFloat2797;
		float f_89_ = ((Class261) this).aFloat2807;
		float f_90_ = ((Class261) this).aFloat2808;
		float f_91_ = ((Class261) this).aFloat2809;
		float f_92_ = ((Class261) this).aFloat2803;
		float f_93_ = ((Class261) this).aFloat2806;
		float f_94_ = ((Class261) this).aFloat2798;
		((Class261) this).aFloat2802 = (f * ((Class261) class261_83_).aFloat2802 + f_84_ * ((Class261) class261_83_).aFloat2801 + f_91_ * ((Class261) class261_83_).aFloat2804);
		((Class261) this).aFloat2799 = (f * ((Class261) class261_83_).aFloat2799 + f_84_ * ((Class261) class261_83_).aFloat2805 + f_91_ * ((Class261) class261_83_).aFloat2797);
		((Class261) this).aFloat2809 = (f * ((Class261) class261_83_).aFloat2809 + f_84_ * ((Class261) class261_83_).aFloat2803 + f_91_ * ((Class261) class261_83_).aFloat2806);
		((Class261) this).aFloat2801 = (f_85_ * ((Class261) class261_83_).aFloat2802 + f_86_ * ((Class261) class261_83_).aFloat2801 + f_92_ * ((Class261) class261_83_).aFloat2804);
		((Class261) this).aFloat2805 = (f_85_ * ((Class261) class261_83_).aFloat2799 + f_86_ * ((Class261) class261_83_).aFloat2805 + f_92_ * ((Class261) class261_83_).aFloat2797);
		((Class261) this).aFloat2803 = (f_85_ * ((Class261) class261_83_).aFloat2809 + f_86_ * ((Class261) class261_83_).aFloat2803 + f_92_ * ((Class261) class261_83_).aFloat2806);
		((Class261) this).aFloat2804 = (f_87_ * ((Class261) class261_83_).aFloat2802 + f_88_ * ((Class261) class261_83_).aFloat2801 + f_93_ * ((Class261) class261_83_).aFloat2804);
		((Class261) this).aFloat2797 = (f_87_ * ((Class261) class261_83_).aFloat2799 + f_88_ * ((Class261) class261_83_).aFloat2805 + f_93_ * ((Class261) class261_83_).aFloat2797);
		((Class261) this).aFloat2806 = (f_87_ * ((Class261) class261_83_).aFloat2809 + f_88_ * ((Class261) class261_83_).aFloat2803 + f_93_ * ((Class261) class261_83_).aFloat2806);
		((Class261) this).aFloat2807 = (f_89_ * ((Class261) class261_83_).aFloat2802 + f_90_ * ((Class261) class261_83_).aFloat2801 + f_94_ * ((Class261) class261_83_).aFloat2804 + ((Class261) class261_83_).aFloat2807);
		((Class261) this).aFloat2808 = (f_89_ * ((Class261) class261_83_).aFloat2799 + f_90_ * ((Class261) class261_83_).aFloat2805 + f_94_ * ((Class261) class261_83_).aFloat2797 + ((Class261) class261_83_).aFloat2808);
		((Class261) this).aFloat2798 = (f_89_ * ((Class261) class261_83_).aFloat2809 + f_90_ * ((Class261) class261_83_).aFloat2803 + f_94_ * ((Class261) class261_83_).aFloat2806 + ((Class261) class261_83_).aFloat2798);
	}

	void method3585(float f, float f_95_, float f_96_, float f_97_) {
		float f_98_ = f * f;
		float f_99_ = f * f_95_;
		float f_100_ = f * f_96_;
		float f_101_ = f * f_97_;
		float f_102_ = f_95_ * f_95_;
		float f_103_ = f_95_ * f_96_;
		float f_104_ = f_95_ * f_97_;
		float f_105_ = f_96_ * f_96_;
		float f_106_ = f_96_ * f_97_;
		((Class261) this).aFloat2802 = 1.0F - 2.0F * (f_102_ + f_105_);
		((Class261) this).aFloat2801 = 2.0F * (f_99_ - f_106_);
		((Class261) this).aFloat2804 = 2.0F * (f_100_ + f_104_);
		((Class261) this).aFloat2799 = 2.0F * (f_99_ + f_106_);
		((Class261) this).aFloat2805 = 1.0F - 2.0F * (f_98_ + f_105_);
		((Class261) this).aFloat2797 = 2.0F * (f_103_ - f_101_);
		((Class261) this).aFloat2809 = 2.0F * (f_100_ - f_104_);
		((Class261) this).aFloat2803 = 2.0F * (f_103_ + f_101_);
		((Class261) this).aFloat2806 = 1.0F - 2.0F * (f_98_ + f_102_);
		((Class261) this).aFloat2798 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
	}

	public float[] method3586(float[] fs) {
		fs[0] = ((Class261) this).aFloat2807;
		fs[1] = ((Class261) this).aFloat2808;
		fs[2] = ((Class261) this).aFloat2798;
		return fs;
	}

	public float[] method3587(float[] fs) {
		fs[0] = ((Class261) this).aFloat2802;
		fs[1] = ((Class261) this).aFloat2799;
		fs[2] = ((Class261) this).aFloat2809;
		fs[3] = ((Class261) this).aFloat2801;
		fs[4] = ((Class261) this).aFloat2805;
		fs[5] = ((Class261) this).aFloat2803;
		fs[6] = ((Class261) this).aFloat2804;
		fs[7] = ((Class261) this).aFloat2797;
		fs[8] = ((Class261) this).aFloat2806;
		return fs;
	}

	public void method3588(float f, float f_107_, float f_108_) {
		((Class261) this).aFloat2797 = 0.0F;
		((Class261) this).aFloat2804 = 0.0F;
		((Class261) this).aFloat2803 = 0.0F;
		((Class261) this).aFloat2801 = 0.0F;
		((Class261) this).aFloat2809 = 0.0F;
		((Class261) this).aFloat2799 = 0.0F;
		((Class261) this).aFloat2806 = 1.0F;
		((Class261) this).aFloat2805 = 1.0F;
		((Class261) this).aFloat2802 = 1.0F;
		((Class261) this).aFloat2807 = f;
		((Class261) this).aFloat2808 = f_107_;
		((Class261) this).aFloat2798 = f_108_;
	}

	public void method3589(int i, int i_109_, int i_110_, float f, float f_111_, float f_112_) {
		if (i != 0) {
			float f_113_ = Class229.aFloatArray2619[i & 0x3fff];
			float f_114_ = Class229.aFloatArray2620[i & 0x3fff];
			((Class261) this).aFloat2806 = 1.0F;
			((Class261) this).aFloat2797 = 0.0F;
			((Class261) this).aFloat2804 = 0.0F;
			((Class261) this).aFloat2803 = 0.0F;
			((Class261) this).aFloat2809 = 0.0F;
			((Class261) this).aFloat2802 = 2.0F * f_113_ * (float) i_109_;
			((Class261) this).aFloat2805 = 2.0F * f_113_ * (float) i_110_;
			((Class261) this).aFloat2799 = 2.0F * f_114_ * (float) i_109_;
			((Class261) this).aFloat2801 = -2.0F * f_114_ * (float) i_110_;
			((Class261) this).aFloat2807 = (float) (2 * i_109_) * (0.5F * f_114_ - 0.5F * f_113_) + f;
			((Class261) this).aFloat2808 = ((float) (2 * i_110_) * (-0.5F * f_114_ - 0.5F * f_113_) + f_111_);
			((Class261) this).aFloat2798 = f_112_;
		} else {
			((Class261) this).aFloat2797 = 0.0F;
			((Class261) this).aFloat2804 = 0.0F;
			((Class261) this).aFloat2803 = 0.0F;
			((Class261) this).aFloat2801 = 0.0F;
			((Class261) this).aFloat2809 = 0.0F;
			((Class261) this).aFloat2799 = 0.0F;
			((Class261) this).aFloat2802 = (float) (2 * i_109_);
			((Class261) this).aFloat2805 = (float) (2 * i_110_);
			((Class261) this).aFloat2806 = 1.0F;
			((Class261) this).aFloat2807 = f - (float) i_109_;
			((Class261) this).aFloat2808 = f_111_ - (float) i_110_;
			((Class261) this).aFloat2798 = f_112_;
		}
	}

	public void method3590(float f, float f_115_, float f_116_) {
		((Class261) this).aFloat2807 += f;
		((Class261) this).aFloat2808 += f_115_;
		((Class261) this).aFloat2798 += f_116_;
	}

	public void method3591(float f, float f_117_, float f_118_, float[] fs) {
		f -= ((Class261) this).aFloat2807;
		f_117_ -= ((Class261) this).aFloat2808;
		f_118_ -= ((Class261) this).aFloat2798;
		fs[0] = (float) (int) (((Class261) this).aFloat2802 * f + ((Class261) this).aFloat2799 * f_117_ + ((Class261) this).aFloat2809 * f_118_);
		fs[1] = (float) (int) (((Class261) this).aFloat2801 * f + ((Class261) this).aFloat2805 * f_117_ + ((Class261) this).aFloat2803 * f_118_);
		fs[2] = (float) (int) (((Class261) this).aFloat2804 * f + ((Class261) this).aFloat2797 * f_117_ + ((Class261) this).aFloat2806 * f_118_);
	}

	public void method3592(float[] fs) {
		float f = fs[0] - ((Class261) this).aFloat2807;
		float f_119_ = fs[1] - ((Class261) this).aFloat2808;
		float f_120_ = fs[2] - ((Class261) this).aFloat2798;
		fs[0] = (float) (int) (((Class261) this).aFloat2802 * f + ((Class261) this).aFloat2799 * f_119_ + ((Class261) this).aFloat2809 * f_120_);
		fs[1] = (float) (int) (((Class261) this).aFloat2801 * f + ((Class261) this).aFloat2805 * f_119_ + ((Class261) this).aFloat2803 * f_120_);
		fs[2] = (float) (int) (((Class261) this).aFloat2804 * f + ((Class261) this).aFloat2797 * f_119_ + ((Class261) this).aFloat2806 * f_120_);
	}

	public void method3593(Class238 class238) {
		float f = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2621);
		float f_121_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2624);
		float f_122_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2623);
		float f_123_ = (class238.aClass230_2648.aFloat2621 * class238.aClass230_2648.aFloat2626);
		float f_124_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2624);
		float f_125_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2623);
		float f_126_ = (class238.aClass230_2648.aFloat2624 * class238.aClass230_2648.aFloat2626);
		float f_127_ = (class238.aClass230_2648.aFloat2623 * class238.aClass230_2648.aFloat2623);
		float f_128_ = (class238.aClass230_2648.aFloat2623 * class238.aClass230_2648.aFloat2626);
		float f_129_ = (class238.aClass230_2648.aFloat2626 * class238.aClass230_2648.aFloat2626);
		((Class261) this).aFloat2802 = f_124_ + f - f_129_ - f_127_;
		((Class261) this).aFloat2799 = f_125_ + f_123_ + f_125_ + f_123_;
		((Class261) this).aFloat2809 = f_126_ - f_122_ - f_122_ + f_126_;
		((Class261) this).aFloat2801 = f_125_ - f_123_ - f_123_ + f_125_;
		((Class261) this).aFloat2805 = f_127_ + f - f_124_ - f_129_;
		((Class261) this).aFloat2803 = f_128_ + f_121_ + f_128_ + f_121_;
		((Class261) this).aFloat2804 = f_126_ + f_122_ + f_126_ + f_122_;
		((Class261) this).aFloat2797 = f_128_ - f_121_ - f_121_ + f_128_;
		((Class261) this).aFloat2806 = f_129_ + f - f_127_ - f_124_;
		((Class261) this).aFloat2807 = class238.aClass240_2647.aFloat2653;
		((Class261) this).aFloat2808 = class238.aClass240_2647.aFloat2656;
		((Class261) this).aFloat2798 = class238.aClass240_2647.aFloat2657;
	}

	public String toString() {
		return new StringBuilder().append(((Class261) this).aFloat2802).append(",").append(((Class261) this).aFloat2801).append(",").append(((Class261) this).aFloat2804).append(",").append(((Class261) this).aFloat2807).append(" - ").append(((Class261) this).aFloat2799).append(",").append(((Class261) this).aFloat2805).append(",").append(((Class261) this).aFloat2797).append(",").append(((Class261) this).aFloat2808).append(" - ").append(((Class261) this).aFloat2809).append(",").append(((Class261) this).aFloat2803).append(",").append(((Class261) this).aFloat2806).append(",").append(((Class261) this).aFloat2798).toString();
	}

	public void method3594() {
		((Class261) this).aFloat2798 = 0.0F;
		((Class261) this).aFloat2808 = 0.0F;
		((Class261) this).aFloat2807 = 0.0F;
		((Class261) this).aFloat2797 = 0.0F;
		((Class261) this).aFloat2804 = 0.0F;
		((Class261) this).aFloat2803 = 0.0F;
		((Class261) this).aFloat2801 = 0.0F;
		((Class261) this).aFloat2809 = 0.0F;
		((Class261) this).aFloat2799 = 0.0F;
		((Class261) this).aFloat2806 = 1.0F;
		((Class261) this).aFloat2805 = 1.0F;
		((Class261) this).aFloat2802 = 1.0F;
	}

	public void method3595() {
		float f = ((Class261) this).aFloat2807;
		float f_130_ = ((Class261) this).aFloat2808;
		float f_131_ = ((Class261) this).aFloat2801;
		((Class261) this).aFloat2801 = ((Class261) this).aFloat2799;
		((Class261) this).aFloat2799 = f_131_;
		float f_132_ = ((Class261) this).aFloat2804;
		((Class261) this).aFloat2804 = ((Class261) this).aFloat2809;
		((Class261) this).aFloat2809 = f_132_;
		float f_133_ = ((Class261) this).aFloat2797;
		((Class261) this).aFloat2797 = ((Class261) this).aFloat2803;
		((Class261) this).aFloat2803 = f_133_;
		((Class261) this).aFloat2807 = -(f * ((Class261) this).aFloat2802 + f_130_ * ((Class261) this).aFloat2801 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2804);
		((Class261) this).aFloat2808 = -(f * ((Class261) this).aFloat2799 + f_130_ * ((Class261) this).aFloat2805 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2797);
		((Class261) this).aFloat2798 = -(f * ((Class261) this).aFloat2809 + f_130_ * ((Class261) this).aFloat2803 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2806);
	}

	public void method3596() {
		float f = ((Class261) this).aFloat2807;
		float f_134_ = ((Class261) this).aFloat2808;
		float f_135_ = ((Class261) this).aFloat2801;
		((Class261) this).aFloat2801 = ((Class261) this).aFloat2799;
		((Class261) this).aFloat2799 = f_135_;
		float f_136_ = ((Class261) this).aFloat2804;
		((Class261) this).aFloat2804 = ((Class261) this).aFloat2809;
		((Class261) this).aFloat2809 = f_136_;
		float f_137_ = ((Class261) this).aFloat2797;
		((Class261) this).aFloat2797 = ((Class261) this).aFloat2803;
		((Class261) this).aFloat2803 = f_137_;
		((Class261) this).aFloat2807 = -(f * ((Class261) this).aFloat2802 + f_134_ * ((Class261) this).aFloat2801 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2804);
		((Class261) this).aFloat2808 = -(f * ((Class261) this).aFloat2799 + f_134_ * ((Class261) this).aFloat2805 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2797);
		((Class261) this).aFloat2798 = -(f * ((Class261) this).aFloat2809 + f_134_ * ((Class261) this).aFloat2803 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2806);
	}

	public void method3597() {
		float f = ((Class261) this).aFloat2807;
		float f_138_ = ((Class261) this).aFloat2808;
		float f_139_ = ((Class261) this).aFloat2801;
		((Class261) this).aFloat2801 = ((Class261) this).aFloat2799;
		((Class261) this).aFloat2799 = f_139_;
		float f_140_ = ((Class261) this).aFloat2804;
		((Class261) this).aFloat2804 = ((Class261) this).aFloat2809;
		((Class261) this).aFloat2809 = f_140_;
		float f_141_ = ((Class261) this).aFloat2797;
		((Class261) this).aFloat2797 = ((Class261) this).aFloat2803;
		((Class261) this).aFloat2803 = f_141_;
		((Class261) this).aFloat2807 = -(f * ((Class261) this).aFloat2802 + f_138_ * ((Class261) this).aFloat2801 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2804);
		((Class261) this).aFloat2808 = -(f * ((Class261) this).aFloat2799 + f_138_ * ((Class261) this).aFloat2805 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2797);
		((Class261) this).aFloat2798 = -(f * ((Class261) this).aFloat2809 + f_138_ * ((Class261) this).aFloat2803 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2806);
	}

	public String method3598() {
		return new StringBuilder().append(((Class261) this).aFloat2802).append(",").append(((Class261) this).aFloat2801).append(",").append(((Class261) this).aFloat2804).append(",").append(((Class261) this).aFloat2807).append(" - ").append(((Class261) this).aFloat2799).append(",").append(((Class261) this).aFloat2805).append(",").append(((Class261) this).aFloat2797).append(",").append(((Class261) this).aFloat2808).append(" - ").append(((Class261) this).aFloat2809).append(",").append(((Class261) this).aFloat2803).append(",").append(((Class261) this).aFloat2806).append(",").append(((Class261) this).aFloat2798).toString();
	}

	public void method3599(float[] fs) {
		float f = fs[0];
		float f_142_ = fs[1];
		float f_143_ = fs[2];
		fs[0] = (((Class261) this).aFloat2802 * f + ((Class261) this).aFloat2799 * f_142_ + ((Class261) this).aFloat2809 * f_143_);
		fs[1] = (((Class261) this).aFloat2801 * f + ((Class261) this).aFloat2805 * f_142_ + ((Class261) this).aFloat2803 * f_143_);
		fs[2] = (((Class261) this).aFloat2804 * f + ((Class261) this).aFloat2797 * f_142_ + ((Class261) this).aFloat2806 * f_143_);
	}

	public void method3600() {
		float f = ((Class261) this).aFloat2807;
		float f_144_ = ((Class261) this).aFloat2808;
		float f_145_ = ((Class261) this).aFloat2801;
		((Class261) this).aFloat2801 = ((Class261) this).aFloat2799;
		((Class261) this).aFloat2799 = f_145_;
		float f_146_ = ((Class261) this).aFloat2804;
		((Class261) this).aFloat2804 = ((Class261) this).aFloat2809;
		((Class261) this).aFloat2809 = f_146_;
		float f_147_ = ((Class261) this).aFloat2797;
		((Class261) this).aFloat2797 = ((Class261) this).aFloat2803;
		((Class261) this).aFloat2803 = f_147_;
		((Class261) this).aFloat2807 = -(f * ((Class261) this).aFloat2802 + f_144_ * ((Class261) this).aFloat2801 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2804);
		((Class261) this).aFloat2808 = -(f * ((Class261) this).aFloat2799 + f_144_ * ((Class261) this).aFloat2805 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2797);
		((Class261) this).aFloat2798 = -(f * ((Class261) this).aFloat2809 + f_144_ * ((Class261) this).aFloat2803 + ((Class261) this).aFloat2798 * ((Class261) this).aFloat2806);
	}

	public Class261(Class261 class261_148_) {
		method3568(class261_148_);
	}

	public String method3601() {
		return new StringBuilder().append(((Class261) this).aFloat2802).append(",").append(((Class261) this).aFloat2801).append(",").append(((Class261) this).aFloat2804).append(",").append(((Class261) this).aFloat2807).append(" - ").append(((Class261) this).aFloat2799).append(",").append(((Class261) this).aFloat2805).append(",").append(((Class261) this).aFloat2797).append(",").append(((Class261) this).aFloat2808).append(" - ").append(((Class261) this).aFloat2809).append(",").append(((Class261) this).aFloat2803).append(",").append(((Class261) this).aFloat2806).append(",").append(((Class261) this).aFloat2798).toString();
	}

	public float[] method3602(float[] fs) {
		fs[0] = ((Class261) this).aFloat2807;
		fs[1] = ((Class261) this).aFloat2808;
		fs[2] = ((Class261) this).aFloat2798;
		return fs;
	}
}
