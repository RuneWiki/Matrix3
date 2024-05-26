package game;

/* Class658_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub1 extends Class658 {
	Class236 aClass236_9535 = null;
	Class423_Sub1 aClass423_Sub1_9536 = null;

	public void method7750(RSByteBuffer class572_sub15) {
		((Class658_Sub1) this).aClass236_9535 = new Class236(class572_sub15);
	}

	public void method7734(float f, int i) {
		/* empty */
	}

	public Class240 method7752() {
		return method7736(-1883309767);
	}

	public Class240 method7736(int i) {
		Class240 class240 = Class240.method3306();
		double[] ds = (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public boolean method7742() {
		return (((Class658_Sub1) this).aClass236_9535 != null && null != ((Class658_Sub1) this).aClass423_Sub1_9536 && ((Class658_Sub1) this).aClass423_Sub1_9536.method5145(-2059209860));
	}

	public void method7739(Class403 class403, Class261 class261, int i, int i_0_, float f, byte i_1_) {
		double[] ds = ((Class658_Sub1) this).aClass411_8421.method4996(1529559040);
		ds[0] -= (double) i;
		ds[2] -= (double) i_0_;
		double[] ds_2_ = method8919(369782679);
		ds_2_[0] -= (double) i;
		ds_2_[2] -= (double) i_0_;
		ds[1] *= -1.0;
		ds_2_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_2_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_2_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_2_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_3_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_4_ = Class240.method3281(class240, class240_3_);
		class240_3_ = Class240.method3281(class240_4_, class240);
		class240_3_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_2_[0], ds_2_[1], ds_2_[2], class240_3_.aFloat2653, class240_3_.aFloat2656, class240_3_.aFloat2657);
		class240_3_.method3261();
	}

	public Class658_Sub1(Class411 class411) {
		super(class411);
	}

	public void method7733(float f) {
		/* empty */
	}

	public void method7741(float f) {
		/* empty */
	}

	public void method7738(float f) {
		/* empty */
	}

	public boolean method7743() {
		return (((Class658_Sub1) this).aClass236_9535 != null && null != ((Class658_Sub1) this).aClass423_Sub1_9536 && ((Class658_Sub1) this).aClass423_Sub1_9536.method5145(-2059209860));
	}

	public boolean method7744() {
		return (((Class658_Sub1) this).aClass236_9535 != null && null != ((Class658_Sub1) this).aClass423_Sub1_9536 && ((Class658_Sub1) this).aClass423_Sub1_9536.method5145(-2059209860));
	}

	public void method7747(Class403 class403, Class261 class261, int i, int i_5_, float f) {
		double[] ds = ((Class658_Sub1) this).aClass411_8421.method4996(-974627423);
		ds[0] -= (double) i;
		ds[2] -= (double) i_5_;
		double[] ds_6_ = method8919(369782679);
		ds_6_[0] -= (double) i;
		ds_6_[2] -= (double) i_5_;
		ds[1] *= -1.0;
		ds_6_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_6_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_6_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_6_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_7_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_8_ = Class240.method3281(class240, class240_7_);
		class240_7_ = Class240.method3281(class240_8_, class240);
		class240_7_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_6_[0], ds_6_[1], ds_6_[2], class240_7_.aFloat2653, class240_7_.aFloat2656, class240_7_.aFloat2657);
		class240_7_.method3261();
	}

	public void method7746(Class403 class403, Class261 class261, int i, int i_9_, float f) {
		double[] ds = ((Class658_Sub1) this).aClass411_8421.method4996(264561435);
		ds[0] -= (double) i;
		ds[2] -= (double) i_9_;
		double[] ds_10_ = method8919(369782679);
		ds_10_[0] -= (double) i;
		ds_10_[2] -= (double) i_9_;
		ds[1] *= -1.0;
		ds_10_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_10_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_10_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_10_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_11_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_12_ = Class240.method3281(class240, class240_11_);
		class240_11_ = Class240.method3281(class240_12_, class240);
		class240_11_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_10_[0], ds_10_[1], ds_10_[2], class240_11_.aFloat2653, class240_11_.aFloat2656, class240_11_.aFloat2657);
		class240_11_.method3261();
	}

	public void method7748(Class403 class403, Class261 class261, int i, int i_13_, float f) {
		double[] ds = ((Class658_Sub1) this).aClass411_8421.method4996(-1657505607);
		ds[0] -= (double) i;
		ds[2] -= (double) i_13_;
		double[] ds_14_ = method8919(369782679);
		ds_14_[0] -= (double) i;
		ds_14_[2] -= (double) i_13_;
		ds[1] *= -1.0;
		ds_14_[1] *= -1.0;
		Class240 class240 = Class240.method3306();
		class240.aFloat2653 = (float) (ds_14_[0] - ds[0]);
		class240.aFloat2656 = (float) (ds_14_[1] - ds[1]);
		class240.aFloat2657 = (float) (ds_14_[2] - ds[2]);
		class240.method3273();
		Class230 class230 = new Class230();
		class230.method3209(class240, f);
		Class240 class240_15_ = Class240.method3316(0.0F, 1.0F, 0.0F);
		Class240 class240_16_ = Class240.method3281(class240, class240_15_);
		class240_15_ = Class240.method3281(class240_16_, class240);
		class240_15_.method3288(class230);
		class261.method3570(ds[0], ds[1], ds[2], ds_14_[0], ds_14_[1], ds_14_[2], class240_15_.aFloat2653, class240_15_.aFloat2656, class240_15_.aFloat2657);
		class240_15_.method3261();
	}

	public boolean method7735(byte i) {
		return (((Class658_Sub1) this).aClass236_9535 != null && null != ((Class658_Sub1) this).aClass423_Sub1_9536 && ((Class658_Sub1) this).aClass423_Sub1_9536.method5145(-2059209860));
	}

	public void method7737(RSByteBuffer class572_sub15, int i) {
		((Class658_Sub1) this).aClass236_9535 = new Class236(class572_sub15);
	}

	public Class240 method7749() {
		return method7736(-1732317026);
	}

	public Class240 method7753() {
		Class240 class240 = Class240.method3306();
		double[] ds = (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	public void method7751(RSByteBuffer class572_sub15) {
		((Class658_Sub1) this).aClass236_9535 = new Class236(class572_sub15);
	}

	public Class240 method7745(int i) {
		return method7736(-1395576129);
	}

	public Class240 method7754() {
		Class240 class240 = Class240.method3306();
		double[] ds = (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}

	double[] method8919(int i) {
		return (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
	}

	double[] method8920() {
		return (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
	}

	public Class240 method7740() {
		Class240 class240 = Class240.method3306();
		double[] ds = (((Class658_Sub1) this).aClass236_9535.method3231(((Class658_Sub1) this).aClass423_Sub1_9536.method9222((byte) 3)));
		class240.aFloat2653 = (float) ds[0];
		class240.aFloat2656 = (float) ds[1];
		class240.aFloat2657 = (float) ds[2];
		return class240;
	}
}
