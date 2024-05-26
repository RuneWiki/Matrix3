package game;

/* Class658_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub4_Sub2 extends Class658_Sub4 {
	float method8998(float f, float f_0_, float f_1_, int i) {
		float f_2_ = f - ((Class658_Sub4_Sub2) this).aFloat9571;
		if ((((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 33).aFloat2653) == Float.POSITIVE_INFINITY)
			f_0_ = ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(-207651400).method3301();
		else {
			float f_3_ = f_0_ / ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 55).method3301();
			float f_4_ = f_0_ / 2.0F * f_3_;
			if (f_4_ > f_2_) {
				f_0_ -= ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 16).method3301() * f_1_;
				if (f_0_ < 0.0F)
					f_0_ = 0.0F;
			} else if (f_0_ < ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(439523845).method3301()) {
				f_0_ += ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 43).method3301() * f_1_;
				if (f_0_ > ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(1716307134).method3301())
					f_0_ = ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(-131852448).method3301();
			}
		}
		return f_0_;
	}

	void method8996() {
		/* empty */
	}

	public Class658_Sub4_Sub2(Class411 class411) {
		super(class411);
	}

	void method8994(RSByteBuffer class572_sub15, int i, byte i_5_) {
		/* empty */
	}

	float method9000(float f, float f_6_, float f_7_) {
		float f_8_ = f - ((Class658_Sub4_Sub2) this).aFloat9571;
		if ((((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 31).aFloat2653) == Float.POSITIVE_INFINITY)
			f_6_ = ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(1068063698).method3301();
		else {
			float f_9_ = f_6_ / ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) -51).method3301();
			float f_10_ = f_6_ / 2.0F * f_9_;
			if (f_10_ > f_8_) {
				f_6_ -= ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) -56).method3301() * f_7_;
				if (f_6_ < 0.0F)
					f_6_ = 0.0F;
			} else if (f_6_ < ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(477943172).method3301()) {
				f_6_ += ((Class658_Sub4_Sub2) this).aClass411_8421.method5003((byte) 64).method3301() * f_7_;
				if (f_6_ > ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(668180683).method3301())
					f_6_ = ((Class658_Sub4_Sub2) this).aClass411_8421.method5006(987734797).method3301();
			}
		}
		return f_6_;
	}

	void method8995() {
		/* empty */
	}

	void method8992(byte i) {
		/* empty */
	}

	void method8997(RSByteBuffer class572_sub15, int i) {
		/* empty */
	}
}
