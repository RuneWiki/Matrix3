package game;

/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class240 {
	static int anInt2652;
	public float aFloat2653;
	static Class240[] aClass240Array2654;
	static int anInt2655;
	public float aFloat2656;
	public float aFloat2657;

	public void method3261() {
		synchronized (aClass240Array2654) {
			if (anInt2652 < anInt2655 - 1)
				aClass240Array2654[anInt2652++] = this;
		}
	}

	public String method3262() {
		return new StringBuilder().append(aFloat2653).append(", ").append(aFloat2656).append(", ").append(aFloat2657).toString();
	}

	public static final Class240 method3263(Class240 class240, Class240 class240_0_) {
		Class240 class240_1_ = method3276(class240);
		class240_1_.method3285(class240_0_);
		return class240_1_;
	}

	public static Class240 method3264(RSByteBuffer class572_sub15) {
		synchronized (aClass240Array2654) {
			if (anInt2652 == 0) {
				Class240 class240 = new Class240(class572_sub15);
				return class240;
			}
			aClass240Array2654[--anInt2652].method3308(class572_sub15);
			Class240 class240 = aClass240Array2654[anInt2652];
			return class240;
		}
	}

	final void method3265(Class240 class240_2_) {
		aFloat2653 *= class240_2_.aFloat2653;
		aFloat2656 *= class240_2_.aFloat2656;
		aFloat2657 *= class240_2_.aFloat2657;
	}

	public final void method3266(Class240 class240_3_) {
		aFloat2653 -= class240_3_.aFloat2653;
		aFloat2656 -= class240_3_.aFloat2656;
		aFloat2657 -= class240_3_.aFloat2657;
	}

	public Class240(Class240 class240_4_) {
		aFloat2653 = class240_4_.aFloat2653;
		aFloat2656 = class240_4_.aFloat2656;
		aFloat2657 = class240_4_.aFloat2657;
	}

	public final void method3267() {
		float f = 1.0F / method3301();
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	public void method3268(float f, float f_5_, float f_6_) {
		aFloat2653 = f;
		aFloat2656 = f_5_;
		aFloat2657 = f_6_;
	}

	public void method3269(Class240 class240_7_) {
		method3268(class240_7_.aFloat2653, class240_7_.aFloat2656, class240_7_.aFloat2657);
	}

	public final void method3270() {
		aFloat2657 = 0.0F;
		aFloat2656 = 0.0F;
		aFloat2653 = 0.0F;
	}

	public boolean method3271(Class240 class240_8_) {
		if (aFloat2653 != class240_8_.aFloat2653 || aFloat2656 != class240_8_.aFloat2656 || aFloat2657 != class240_8_.aFloat2657)
			return false;
		return true;
	}

	public final void method3272() {
		aFloat2653 = -aFloat2653;
		aFloat2656 = -aFloat2656;
		aFloat2657 = -aFloat2657;
	}

	public final void method3273() {
		float f = 1.0F / method3301();
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	public Class240(float f, float f_9_, float f_10_) {
		aFloat2653 = f;
		aFloat2656 = f_9_;
		aFloat2657 = f_10_;
	}

	public final void method3274(Class240 class240_11_, float f) {
		aFloat2653 += class240_11_.aFloat2653 * f;
		aFloat2656 += class240_11_.aFloat2656 * f;
		aFloat2657 += class240_11_.aFloat2657 * f;
	}

	public static final float method3275(Class240 class240, Class240 class240_12_) {
		return class240.method3302(class240_12_);
	}

	public static Class240 method3276(Class240 class240) {
		synchronized (aClass240Array2654) {
			if (anInt2652 == 0) {
				Class240 class240_13_ = new Class240(class240);
				return class240_13_;
			}
			aClass240Array2654[--anInt2652].method3269(class240);
			Class240 class240_14_ = aClass240Array2654[anInt2652];
			return class240_14_;
		}
	}

	public static final Class240 method3277(Class240 class240, Class240 class240_15_) {
		Class240 class240_16_ = method3276(class240);
		class240_16_.method3266(class240_15_);
		return class240_16_;
	}

	public final void method3278() {
		aFloat2657 = 0.0F;
		aFloat2656 = 0.0F;
		aFloat2653 = 0.0F;
	}

	public void method3279(Class240 class240_17_) {
		method3268(class240_17_.aFloat2653, class240_17_.aFloat2656, class240_17_.aFloat2657);
	}

	final void method3280(Class240 class240_18_) {
		method3268((aFloat2656 * class240_18_.aFloat2657 - aFloat2657 * class240_18_.aFloat2656), (aFloat2657 * class240_18_.aFloat2653 - aFloat2653 * class240_18_.aFloat2657), (aFloat2653 * class240_18_.aFloat2656 - aFloat2656 * class240_18_.aFloat2653));
	}

	public static final Class240 method3281(Class240 class240, Class240 class240_19_) {
		Class240 class240_20_ = method3276(class240);
		class240_20_.method3280(class240_19_);
		return class240_20_;
	}

	public String toString() {
		return new StringBuilder().append(aFloat2653).append(", ").append(aFloat2656).append(", ").append(aFloat2657).toString();
	}

	public final void method3282() {
		if (aFloat2653 < 0.0F)
			aFloat2653 *= -1.0F;
		if (aFloat2656 < 0.0F)
			aFloat2656 *= -1.0F;
		if (aFloat2657 < 0.0F)
			aFloat2657 *= -1.0F;
	}

	public static final Class240 method3283(Class240 class240, Class240 class240_21_) {
		Class240 class240_22_ = method3276(class240);
		class240_22_.method3265(class240_21_);
		return class240_22_;
	}

	public final void method3284(float f) {
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	final void method3285(Class240 class240_23_) {
		aFloat2653 /= class240_23_.aFloat2653;
		aFloat2656 /= class240_23_.aFloat2656;
		aFloat2657 /= class240_23_.aFloat2657;
	}

	public final void method3286(float f) {
		aFloat2653 /= f;
		aFloat2656 /= f;
		aFloat2657 /= f;
	}

	public static final Class240 method3287(Class240 class240, float f) {
		Class240 class240_24_ = method3276(class240);
		class240_24_.method3284(f);
		return class240_24_;
	}

	public final void method3288(Class230 class230) {
		Class230 class230_25_ = Class230.method3179(aFloat2653, aFloat2656, aFloat2657, 0.0F);
		Class230 class230_26_ = Class230.method3176(class230);
		Class230 class230_27_ = Class230.method3181(class230_26_, class230_25_);
		class230_27_.method3189(class230);
		method3268(class230_27_.aFloat2624, class230_27_.aFloat2623, class230_27_.aFloat2626);
		class230_25_.method3165();
		class230_26_.method3165();
		class230_27_.method3165();
	}

	public final void method3289(Class261 class261) {
		float f = aFloat2653;
		float f_28_ = aFloat2656;
		aFloat2653 = (((Class261) class261).aFloat2802 * f + ((Class261) class261).aFloat2801 * f_28_ + ((Class261) class261).aFloat2804 * aFloat2657 + ((Class261) class261).aFloat2807);
		aFloat2656 = (((Class261) class261).aFloat2799 * f + ((Class261) class261).aFloat2805 * f_28_ + ((Class261) class261).aFloat2797 * aFloat2657 + ((Class261) class261).aFloat2808);
		aFloat2657 = (((Class261) class261).aFloat2809 * f + ((Class261) class261).aFloat2803 * f_28_ + ((Class261) class261).aFloat2806 * aFloat2657 + ((Class261) class261).aFloat2798);
	}

	public final void method3290(Class261 class261) {
		float f = aFloat2653;
		float f_29_ = aFloat2656;
		aFloat2653 = (((Class261) class261).aFloat2802 * f + ((Class261) class261).aFloat2801 * f_29_ + ((Class261) class261).aFloat2804 * aFloat2657);
		aFloat2656 = (((Class261) class261).aFloat2799 * f + ((Class261) class261).aFloat2805 * f_29_ + ((Class261) class261).aFloat2797 * aFloat2657);
		aFloat2657 = (((Class261) class261).aFloat2809 * f + ((Class261) class261).aFloat2803 * f_29_ + ((Class261) class261).aFloat2806 * aFloat2657);
	}

	static {
		new Class240(0.0F, 0.0F, 0.0F);
		aClass240Array2654 = new Class240[0];
	}

	Class240(RSByteBuffer class572_sub15) {
		aFloat2653 = class572_sub15.method8448((byte) 2);
		aFloat2656 = class572_sub15.method8448((byte) 2);
		aFloat2657 = class572_sub15.method8448((byte) 2);
	}

	public final void method3291() {
		if (aFloat2653 < 0.0F)
			aFloat2653 *= -1.0F;
		if (aFloat2656 < 0.0F)
			aFloat2656 *= -1.0F;
		if (aFloat2657 < 0.0F)
			aFloat2657 *= -1.0F;
	}

	public static void method3292(int i) {
		anInt2655 = i;
		aClass240Array2654 = new Class240[i];
		anInt2652 = 0;
	}

	public final void method3293() {
		aFloat2657 = 0.0F;
		aFloat2656 = 0.0F;
		aFloat2653 = 0.0F;
	}

	public final void method3294() {
		aFloat2657 = 0.0F;
		aFloat2656 = 0.0F;
		aFloat2653 = 0.0F;
	}

	public final void method3295() {
		aFloat2657 = 0.0F;
		aFloat2656 = 0.0F;
		aFloat2653 = 0.0F;
	}

	public Class240() {
		/* empty */
	}

	public String method3296() {
		return new StringBuilder().append(aFloat2653).append(", ").append(aFloat2656).append(", ").append(aFloat2657).toString();
	}

	public final void method3297() {
		aFloat2653 = -aFloat2653;
		aFloat2656 = -aFloat2656;
		aFloat2657 = -aFloat2657;
	}

	public final void method3298() {
		aFloat2653 = -aFloat2653;
		aFloat2656 = -aFloat2656;
		aFloat2657 = -aFloat2657;
	}

	public final void method3299() {
		float f = 1.0F / method3301();
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	public final void method3300() {
		float f = 1.0F / method3301();
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	public final float method3301() {
		return (float) Math.sqrt((double) (aFloat2653 * aFloat2653 + aFloat2656 * aFloat2656 + aFloat2657 * aFloat2657));
	}

	public final float method3302(Class240 class240_30_) {
		return (aFloat2653 * class240_30_.aFloat2653 + aFloat2656 * class240_30_.aFloat2656 + aFloat2657 * class240_30_.aFloat2657);
	}

	public static final Class240 method3303(Class240 class240, Class240 class240_31_) {
		Class240 class240_32_ = method3276(class240);
		class240_32_.method3305(class240_31_);
		return class240_32_;
	}

	public static void method3304(int i) {
		anInt2655 = i;
		aClass240Array2654 = new Class240[i];
		anInt2652 = 0;
	}

	public final void method3305(Class240 class240_33_) {
		aFloat2653 += class240_33_.aFloat2653;
		aFloat2656 += class240_33_.aFloat2656;
		aFloat2657 += class240_33_.aFloat2657;
	}

	public static Class240 method3306() {
		synchronized (aClass240Array2654) {
			if (anInt2652 == 0) {
				Class240 class240 = new Class240();
				return class240;
			}
			aClass240Array2654[--anInt2652].method3270();
			Class240 class240 = aClass240Array2654[anInt2652];
			return class240;
		}
	}

	public final void method3307() {
		float f = 1.0F / method3301();
		aFloat2653 *= f;
		aFloat2656 *= f;
		aFloat2657 *= f;
	}

	public void method3308(RSByteBuffer class572_sub15) {
		aFloat2653 = class572_sub15.method8448((byte) 2);
		aFloat2656 = class572_sub15.method8448((byte) 2);
		aFloat2657 = class572_sub15.method8448((byte) 2);
	}

	public final void method3309() {
		if (aFloat2653 < 0.0F)
			aFloat2653 *= -1.0F;
		if (aFloat2656 < 0.0F)
			aFloat2656 *= -1.0F;
		if (aFloat2657 < 0.0F)
			aFloat2657 *= -1.0F;
	}

	public final void method3310() {
		if (aFloat2653 < 0.0F)
			aFloat2653 *= -1.0F;
		if (aFloat2656 < 0.0F)
			aFloat2656 *= -1.0F;
		if (aFloat2657 < 0.0F)
			aFloat2657 *= -1.0F;
	}

	public final void method3311() {
		if (aFloat2653 < 0.0F)
			aFloat2653 *= -1.0F;
		if (aFloat2656 < 0.0F)
			aFloat2656 *= -1.0F;
		if (aFloat2657 < 0.0F)
			aFloat2657 *= -1.0F;
	}

	final void method3312(Class240 class240_34_) {
		aFloat2653 *= class240_34_.aFloat2653;
		aFloat2656 *= class240_34_.aFloat2656;
		aFloat2657 *= class240_34_.aFloat2657;
	}

	final void method3313(Class240 class240_35_) {
		aFloat2653 *= class240_35_.aFloat2653;
		aFloat2656 *= class240_35_.aFloat2656;
		aFloat2657 *= class240_35_.aFloat2657;
	}

	final void method3314(Class240 class240_36_) {
		aFloat2653 *= class240_36_.aFloat2653;
		aFloat2656 *= class240_36_.aFloat2656;
		aFloat2657 *= class240_36_.aFloat2657;
	}

	public final void method3315(Class240 class240_37_, float f) {
		method3284(1.0F - f);
		method3305(method3287(class240_37_, f));
	}

	public static Class240 method3316(float f, float f_38_, float f_39_) {
		synchronized (aClass240Array2654) {
			if (anInt2652 == 0) {
				Class240 class240 = new Class240(f, f_38_, f_39_);
				return class240;
			}
			aClass240Array2654[--anInt2652].method3268(f, f_38_, f_39_);
			Class240 class240 = aClass240Array2654[anInt2652];
			return class240;
		}
	}

	public final void method3317() {
		aFloat2653 = -aFloat2653;
		aFloat2656 = -aFloat2656;
		aFloat2657 = -aFloat2657;
	}
}
