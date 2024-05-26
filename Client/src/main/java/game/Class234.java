package game;

/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234 {
	public static void method3225(Class240 class240, Class240 class240_0_, Class240 class240_1_, float f, Class240[] class240s) {
		Class240 class240_2_ = Class240.method3277(class240, class240_1_);
		float f_3_ = Class240.method3275(class240_2_, class240_2_) - f * f;
		float f_4_ = Class240.method3275(class240_0_, class240_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class240[] class240s_6_ = class240s;
			class240s[1] = null;
			class240s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt((double) f_5_);
			class240s[0] = Class240.method3306();
			class240s[0].method3269(class240);
			class240s[0].method3305(Class240.method3287(Class240.method3276(class240_0_), -f_4_ - f_7_));
			class240s[1] = Class240.method3306();
			class240s[1].method3269(class240);
			class240s[1].method3305(Class240.method3287(Class240.method3276(class240_0_), -f_4_ + f_7_));
		} else {
			class240s[0] = Class240.method3306();
			class240s[0].method3269(class240);
			class240s[0].method3305(Class240.method3287(Class240.method3276(class240_0_), -f_4_));
			class240s[1] = null;
		}
	}

	Class234() throws Throwable {
		throw new Error();
	}
}
