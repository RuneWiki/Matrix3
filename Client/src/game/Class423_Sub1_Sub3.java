package game;

/* Class423_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class423_Sub1_Sub3 extends Class423_Sub1 {
	void method9224() {
		/* empty */
	}

	void method9223(RSByteBuffer class572_sub15, int i, int i_0_) {
		/* empty */
	}

	public Class423_Sub1_Sub3(Class411 class411) {
		super(class411);
	}

	float method9227(float f, float f_1_, float f_2_, byte i) {
		float f_3_ = f - ((Class423_Sub1_Sub3) this).aFloat9685;
		if ((((Class423_Sub1_Sub3) this).aClass411_4989.method5035(1549206310).aFloat2653) == Float.POSITIVE_INFINITY)
			f_1_ = ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1925074514).method3301();
		else {
			float f_4_ = f_1_ / ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(1770184846).method3301();
			float f_5_ = f_4_ * (f_1_ / 2.0F);
			if (f_5_ > f_3_) {
				f_1_ -= ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(442535691).method3301() * f_2_;
				if (f_1_ < 0.0F)
					f_1_ = 0.0F;
			} else if (f_1_ < ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1884109588).method3301()) {
				f_1_ += ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(1730634637).method3301() * f_2_;
				if (f_1_ > ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1904155609).method3301())
					f_1_ = ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1976386830).method3301();
			}
		}
		return f_1_;
	}

	float method9234(float f, float f_6_, float f_7_) {
		float f_8_ = f - ((Class423_Sub1_Sub3) this).aFloat9685;
		if ((((Class423_Sub1_Sub3) this).aClass411_4989.method5035(470891333).aFloat2653) == Float.POSITIVE_INFINITY)
			f_6_ = ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1873191903).method3301();
		else {
			float f_9_ = f_6_ / ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(742542738).method3301();
			float f_10_ = f_9_ * (f_6_ / 2.0F);
			if (f_10_ > f_8_) {
				f_6_ -= ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(1264741472).method3301() * f_7_;
				if (f_6_ < 0.0F)
					f_6_ = 0.0F;
			} else if (f_6_ < ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-2134241657).method3301()) {
				f_6_ += ((Class423_Sub1_Sub3) this).aClass411_4989.method5035(1910037939).method3301() * f_7_;
				if (f_6_ > ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1890067163).method3301())
					f_6_ = ((Class423_Sub1_Sub3) this).aClass411_4989.method5009(-1870033998).method3301();
			}
		}
		return f_6_;
	}

	void method9221(byte i) {
		/* empty */
	}

	void method9228(RSByteBuffer class572_sub15, int i) {
		/* empty */
	}

	void method9226(RSByteBuffer class572_sub15, int i) {
		/* empty */
	}
}
