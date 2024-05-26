package game;

/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class230 {
	public float aFloat2621;
	static int anInt2622;
	public float aFloat2623;
	public float aFloat2624;
	static int anInt2625;
	public float aFloat2626;
	static Class230[] aClass230Array2627 = new Class230[0];

	void method3162(float f, float f_0_, float f_1_, float f_2_) {
		aFloat2624 = f;
		aFloat2623 = f_0_;
		aFloat2626 = f_1_;
		aFloat2621 = f_2_;
	}

	public String method3163() {
		return new StringBuilder().append(aFloat2624).append(",").append(aFloat2623).append(",").append(aFloat2626).append(",").append(aFloat2621).toString();
	}

	public static Class230 method3164(Class230 class230) {
		synchronized (aClass230Array2627) {
			if (anInt2625 == 0) {
				Class230 class230_3_ = new Class230(class230);
				return class230_3_;
			}
			aClass230Array2627[--anInt2625].method3170(class230);
			Class230 class230_4_ = aClass230Array2627[anInt2625];
			return class230_4_;
		}
	}

	public void method3165() {
		synchronized (aClass230Array2627) {
			if (anInt2625 < anInt2622 - 1)
				aClass230Array2627[anInt2625++] = this;
		}
	}

	public final void method3166() {
		float f = 1.0F / method3180(this);
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}

	public Class230(float f, float f_5_, float f_6_, float f_7_) {
		method3162(f, f_5_, f_6_, f_7_);
	}

	final void method3167(float f) {
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}

	public Class230(float f, float f_8_, float f_9_) {
		method3173(f, f_8_, f_9_);
	}

	public void method3168(RSByteBuffer class572_sub15) {
		aFloat2624 = class572_sub15.method8448((byte) 2);
		aFloat2623 = class572_sub15.method8448((byte) 2);
		aFloat2626 = class572_sub15.method8448((byte) 2);
		aFloat2621 = class572_sub15.method8448((byte) 2);
	}

	public final void method3169() {
		float f = 1.0F / method3180(this);
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}

	public void method3170(Class230 class230_10_) {
		aFloat2624 = class230_10_.aFloat2624;
		aFloat2623 = class230_10_.aFloat2623;
		aFloat2626 = class230_10_.aFloat2626;
		aFloat2621 = class230_10_.aFloat2621;
	}

	final void method3171() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	public void method3172(float f, float f_11_, float f_12_, float f_13_) {
		float f_14_ = (float) Math.sin((double) (f_13_ * 0.5F));
		float f_15_ = (float) Math.cos((double) (f_13_ * 0.5F));
		aFloat2624 = f * f_14_;
		aFloat2623 = f_11_ * f_14_;
		aFloat2626 = f_12_ * f_14_;
		aFloat2621 = f_15_;
	}

	public void method3173(float f, float f_16_, float f_17_) {
		method3172(0.0F, 1.0F, 0.0F, f);
		Class230 class230_18_ = method3210();
		class230_18_.method3172(1.0F, 0.0F, 0.0F, f_16_);
		method3189(class230_18_);
		class230_18_.method3172(0.0F, 0.0F, 1.0F, f_17_);
		method3189(class230_18_);
		class230_18_.method3165();
	}

	final void method3174() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	public final void method3175() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
	}

	public static final Class230 method3176(Class230 class230) {
		Class230 class230_19_ = method3164(class230);
		class230_19_.method3175();
		return class230_19_;
	}

	final void method3177() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
		aFloat2621 = -aFloat2621;
	}

	final float method3178(Class230 class230_20_) {
		return (aFloat2624 * class230_20_.aFloat2624 + aFloat2623 * class230_20_.aFloat2623 + aFloat2626 * class230_20_.aFloat2626 + aFloat2621 * class230_20_.aFloat2621);
	}

	static Class230 method3179(float f, float f_21_, float f_22_, float f_23_) {
		synchronized (aClass230Array2627) {
			if (anInt2625 == 0) {
				Class230 class230 = new Class230(f, f_21_, f_22_, f_23_);
				return class230;
			}
			aClass230Array2627[--anInt2625].method3162(f, f_21_, f_22_, f_23_);
			Class230 class230 = aClass230Array2627[anInt2625];
			return class230;
		}
	}

	static final float method3180(Class230 class230) {
		return (float) Math.sqrt((double) method3195(class230, class230));
	}

	static final Class230 method3181(Class230 class230, Class230 class230_24_) {
		Class230 class230_25_ = method3164(class230);
		class230_25_.method3189(class230_24_);
		return class230_25_;
	}

	final void method3182(float f) {
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}

	static final Class230 method3183(Class230 class230, float f) {
		Class230 class230_26_ = method3164(class230);
		class230_26_.method3182(f);
		return class230_26_;
	}

	public void method3184() {
		synchronized (aClass230Array2627) {
			if (anInt2625 < anInt2622 - 1)
				aClass230Array2627[anInt2625++] = this;
		}
	}

	public String toString() {
		return new StringBuilder().append(aFloat2624).append(",").append(aFloat2623).append(",").append(aFloat2626).append(",").append(aFloat2621).toString();
	}

	public final void method3185() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
	}

	public String method3186() {
		return new StringBuilder().append(aFloat2624).append(",").append(aFloat2623).append(",").append(aFloat2626).append(",").append(aFloat2621).toString();
	}

	public static void method3187(int i) {
		anInt2622 = i;
		aClass230Array2627 = new Class230[i];
		anInt2625 = 0;
	}

	public static void method3188(int i) {
		anInt2622 = i;
		aClass230Array2627 = new Class230[i];
		anInt2625 = 0;
	}

	public final void method3189(Class230 class230_27_) {
		method3162((class230_27_.aFloat2621 * aFloat2624 + class230_27_.aFloat2624 * aFloat2621 + class230_27_.aFloat2623 * aFloat2626 - class230_27_.aFloat2626 * aFloat2623), (class230_27_.aFloat2621 * aFloat2623 - class230_27_.aFloat2624 * aFloat2626 + class230_27_.aFloat2623 * aFloat2621 + class230_27_.aFloat2626 * aFloat2624), (class230_27_.aFloat2621 * aFloat2626 + class230_27_.aFloat2624 * aFloat2623 - class230_27_.aFloat2623 * aFloat2624 + class230_27_.aFloat2626 * aFloat2621), (class230_27_.aFloat2621 * aFloat2621 - class230_27_.aFloat2624 * aFloat2624 - class230_27_.aFloat2623 * aFloat2623 - class230_27_.aFloat2626 * aFloat2626));
	}

	public static void method3190(int i) {
		anInt2622 = i;
		aClass230Array2627 = new Class230[i];
		anInt2625 = 0;
	}

	final void method3191(Class230 class230_28_) {
		aFloat2624 += class230_28_.aFloat2624;
		aFloat2623 += class230_28_.aFloat2623;
		aFloat2626 += class230_28_.aFloat2626;
		aFloat2621 += class230_28_.aFloat2621;
	}

	public void method3192() {
		synchronized (aClass230Array2627) {
			if (anInt2625 < anInt2622 - 1)
				aClass230Array2627[anInt2625++] = this;
		}
	}

	public void method3193() {
		synchronized (aClass230Array2627) {
			if (anInt2625 < anInt2622 - 1)
				aClass230Array2627[anInt2625++] = this;
		}
	}

	public void method3194() {
		synchronized (aClass230Array2627) {
			if (anInt2625 < anInt2622 - 1)
				aClass230Array2627[anInt2625++] = this;
		}
	}

	static {
		new Class230();
	}

	static final float method3195(Class230 class230, Class230 class230_29_) {
		return class230.method3178(class230_29_);
	}

	final void method3196() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
		aFloat2621 = -aFloat2621;
	}

	public void method3197(float f, float f_30_, float f_31_, float f_32_) {
		float f_33_ = (float) Math.sin((double) (f_32_ * 0.5F));
		float f_34_ = (float) Math.cos((double) (f_32_ * 0.5F));
		aFloat2624 = f * f_33_;
		aFloat2623 = f_30_ * f_33_;
		aFloat2626 = f_31_ * f_33_;
		aFloat2621 = f_34_;
	}

	public final void method3198(Class230 class230_35_, float f) {
		if (method3178(class230_35_) < 0.0F)
			method3177();
		method3182(1.0F - f);
		Class230 class230_36_ = method3183(class230_35_, f);
		method3191(class230_36_);
		class230_36_.method3165();
		method3166();
	}

	public Class230() {
		method3174();
	}

	final void method3199() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	public Class230(Class230 class230_37_) {
		method3170(class230_37_);
	}

	final void method3200() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	final void method3201() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	final void method3202() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	final void method3203() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
		aFloat2621 = -aFloat2621;
	}

	final void method3204() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
		aFloat2621 = -aFloat2621;
	}

	public final void method3205() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
	}

	public final void method3206() {
		aFloat2624 = -aFloat2624;
		aFloat2623 = -aFloat2623;
		aFloat2626 = -aFloat2626;
	}

	final void method3207() {
		aFloat2626 = 0.0F;
		aFloat2623 = 0.0F;
		aFloat2624 = 0.0F;
		aFloat2621 = 1.0F;
	}

	public final void method3208() {
		float f = 1.0F / method3180(this);
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}

	public void method3209(Class240 class240, float f) {
		method3172(class240.aFloat2653, class240.aFloat2656, class240.aFloat2657, f);
	}

	public static Class230 method3210() {
		synchronized (aClass230Array2627) {
			if (anInt2625 == 0) {
				Class230 class230 = new Class230();
				return class230;
			}
			aClass230Array2627[--anInt2625].method3174();
			Class230 class230 = aClass230Array2627[anInt2625];
			return class230;
		}
	}

	public void method3211(float f, float f_38_, float f_39_, float f_40_) {
		float f_41_ = (float) Math.sin((double) (f_40_ * 0.5F));
		float f_42_ = (float) Math.cos((double) (f_40_ * 0.5F));
		aFloat2624 = f * f_41_;
		aFloat2623 = f_38_ * f_41_;
		aFloat2626 = f_39_ * f_41_;
		aFloat2621 = f_42_;
	}

	public final void method3212() {
		float f = 1.0F / method3180(this);
		aFloat2624 *= f;
		aFloat2623 *= f;
		aFloat2626 *= f;
		aFloat2621 *= f;
	}
}
