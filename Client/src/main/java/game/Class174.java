package game;

/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class174 {
	public int[][] anIntArrayArray2085;
	public int anInt2086;
	public int anInt2087;
	public int anInt2088;
	public int anInt2089;

	public abstract Class572_Sub12_Sub18 method2710(int i, int i_0_, Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract void method2711(int i, int i_1_, int i_2_);

	public abstract void method2712(int i, int i_3_, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, Class86 class86, boolean bool);

	public final int method2713(int i, int i_14_, int i_15_) {
		return anIntArrayArray2085[i][i_14_];
	}

	public abstract void method2714(int i, int i_16_, int i_17_);

	public abstract void method2715(int i, int i_18_, int i_19_, boolean[][] bools, boolean bool, int i_20_);

	public abstract void method2716(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean[][] bools);

	public abstract void method2717(Class572_Sub36 class572_sub36, int[] is);

	public final int method2718(int i, int i_27_, int i_28_) {
		int i_29_ = i >> 212267571 * anInt2088;
		int i_30_ = i_27_ >> anInt2088 * 212267571;
		i_29_ = Math.min(-1715487093 * anInt2086 - 1, Math.max(0, i_29_));
		i_30_ = Math.min(anInt2089 * 792439321 - 1, Math.max(0, i_30_));
		int i_31_ = Math.min(-1715487093 * anInt2086 - 1, 1 + i_29_);
		int i_32_ = Math.min(anInt2089 * 792439321 - 1, i_30_ + 1);
		int i_33_ = i & 2129890771 * anInt2087 - 1;
		int i_34_ = i_27_ & 2129890771 * anInt2087 - 1;
		int i_35_ = ((anIntArrayArray2085[i_31_][i_30_] * i_33_ + ((anInt2087 * 2129890771 - i_33_) * anIntArrayArray2085[i_29_][i_30_])) >> 212267571 * anInt2088);
		int i_36_ = ((i_33_ * anIntArrayArray2085[i_31_][i_32_] + ((2129890771 * anInt2087 - i_33_) * anIntArrayArray2085[i_29_][i_32_])) >> 212267571 * anInt2088);
		return (i_36_ * i_34_ + (anInt2087 * 2129890771 - i_34_) * i_35_ >> 212267571 * anInt2088);
	}

	public abstract void method2719();

	public final int method2720(int i, int i_37_, int i_38_) {
		return (anIntArrayArray2085[Math.min(-1715487093 * anInt2086 - 1, Math.max(0, i))][Math.min(792439321 * anInt2089 - 1, Math.max(0, i_37_))]);
	}

	public abstract void method2721(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_39_, int i_40_, int i_41_, boolean bool);

	public abstract void method2722(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_42_, int i_43_, int i_44_, boolean bool);

	public abstract boolean method2723(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_45_, int i_46_, int i_47_, boolean bool);

	public abstract void method2724(Class572_Sub36 class572_sub36, int[] is);

	public abstract void method2725(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_48_, int i_49_, int i_50_, boolean bool);

	public final int method2726(int i, int i_51_, int i_52_) {
		int i_53_ = i >> 212267571 * anInt2088;
		int i_54_ = i_51_ >> anInt2088 * 212267571;
		if (i_53_ < 0 || i_54_ < 0 || i_53_ > -1715487093 * anInt2086 - 1 || i_54_ > anInt2089 * 792439321 - 1)
			return 0;
		int i_55_ = i & anInt2087 * 2129890771 - 1;
		int i_56_ = i_51_ & 2129890771 * anInt2087 - 1;
		int i_57_ = ((((anInt2087 * 2129890771 - i_55_) * anIntArrayArray2085[i_53_][i_54_]) + anIntArrayArray2085[1 + i_53_][i_54_] * i_55_) >> 212267571 * anInt2088);
		int i_58_ = ((anIntArrayArray2085[i_53_][i_54_ + 1] * (anInt2087 * 2129890771 - i_55_) + i_55_ * anIntArrayArray2085[1 + i_53_][1 + i_54_]) >> anInt2088 * 212267571);
		return ((2129890771 * anInt2087 - i_56_) * i_57_ + i_56_ * i_58_ >> anInt2088 * 212267571);
	}

	public abstract void method2727(int i, int i_59_, int i_60_);

	public abstract void method2728(int i, int i_61_, int[] is, int[] is_62_, int[] is_63_, int[] is_64_, int[] is_65_, int[] is_66_, int[] is_67_, int[] is_68_, Class86 class86, boolean bool);

	public abstract void method2729();

	public abstract void method2730();

	public abstract void method2731(int i, int i_69_, int i_70_, boolean[][] bools, boolean bool, int i_71_);

	public abstract void method2732(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, boolean[][] bools);

	public abstract void method2733(Class572_Sub36 class572_sub36, int[] is);

	public abstract void method2734(int i, int i_78_, int i_79_, boolean[][] bools, boolean bool, int i_80_);

	public abstract Class572_Sub12_Sub18 method2735(int i, int i_81_, Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract Class572_Sub12_Sub18 method2736(int i, int i_82_, Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract boolean method2737(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_83_, int i_84_, int i_85_, boolean bool);

	public abstract boolean method2738(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_86_, int i_87_, int i_88_, boolean bool);

	Class174(int i, int i_89_, int i_90_, int[][] is) {
		anInt2086 = i * -2087438045;
		anInt2089 = -1864625623 * i_89_;
		int i_91_ = 0;
		for (/**/; i_90_ > 1; i_90_ >>= 1)
			i_91_++;
		anInt2087 = (1 << i_91_) * -509259173;
		anInt2088 = 766859515 * i_91_;
		anIntArrayArray2085 = is;
	}

	public abstract void method2739(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_92_, int i_93_, int i_94_, boolean bool);

	public abstract void method2740(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_95_, int i_96_, int i_97_, boolean bool);

	public abstract void method2741(Class572_Sub36 class572_sub36, int[] is);

	public abstract void method2742(Class572_Sub36 class572_sub36, int[] is);

	public abstract Class572_Sub12_Sub18 method2743(int i, int i_98_, Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract void method2744(int i, int i_99_, int[] is, int[] is_100_, int[] is_101_, int[] is_102_, int[] is_103_, int[] is_104_, int[] is_105_, int[] is_106_, Class86 class86, boolean bool);

	public abstract void method2745(int i, int i_107_, int[] is, int[] is_108_, int[] is_109_, int[] is_110_, int[] is_111_, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, Class86 class86, boolean bool);

	public abstract void method2746(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_118_, int i_119_, int i_120_, boolean bool);

	static final void method2747(Cs2Executor class441, int i) {
		String string = null;
		if (Class420.aClass20_4967 != null)
			string = Class420.aClass20_4967.method693(-2042743404);
		if (string == null)
			string = "";
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	static final void method2748(Cs2Executor class441, int i) {
		if ((Class133_Sub1.aClass411_Sub1_9827.method4994(-788312270) != Class413.aClass413_4915) || (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 30) != Class416.aClass416_4935))
			throw new RuntimeException();
		Class240 class240 = ((Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -125)).method9316(-745521994);
		Class240 class240_121_ = ((Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8978(-678448720);
		Class240 class240_122_ = Class240.method3276(class240);
		class240_122_.method3266(class240_121_);
		float f = Class307.method4019(class240_122_.aFloat2653, class240_122_.aFloat2657, -98138626);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (2607.5945876176133 * (double) f) & 0x3fff;
	}

	public static void method2749(byte i) {
		Class520.aClass161_5817 = null;
	}
}
