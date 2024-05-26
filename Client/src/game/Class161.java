package game;

/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class161 implements Interface27 {
	public abstract void method2585(int[] is);

	public abstract void method2586(int i, int i_0_, int i_1_, int i_2_);

	Class161() {
		/* empty */
	}

	public abstract int method2587();

	public abstract int method45();

	public abstract int method2588();

	public abstract int method2589();

	public abstract Interface6 method2590();

	public abstract void method2591(int i, int i_3_, int i_4_, int i_5_, int[] is, int i_6_, int i_7_);

	public abstract void method2592(int i, int i_8_, int i_9_, int i_10_, int[] is, int[] is_11_, int i_12_, int i_13_);

	abstract void method2593(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_);

	public abstract void method2594(int i, int i_21_, int i_22_);

	public final void method2595(int i, int i_23_) {
		method2619(i, i_23_, 1, -1, 1);
	}

	public abstract void method2596(int i, int i_24_, Class167 class167, int i_25_, int i_26_);

	public final void method2597(int i, int i_27_, int i_28_, int i_29_) {
		method2599(i, i_27_, i_28_, i_29_, 1, -1, 1, 1);
	}

	public final void method2598(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		method2599(i, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, 1);
	}

	abstract void method2599(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_);

	public final void method2600(int i, int i_43_, int i_44_, int i_45_) {
		method2630(i, i_43_, i_44_, i_45_, 1, -1, 1);
	}

	public abstract void method2601(int i, int i_46_, int i_47_);

	public abstract int method2602();

	public final void method2603(float f, float f_48_, int i, int i_49_, int i_50_, int i_51_, int i_52_) {
		method2604(f, f_48_, (float) method45() / 2.0F, (float) method2589() / 2.0F, i, i_49_, i_50_, i_51_, i_52_);
	}

	public final void method2604(float f, float f_53_, float f_54_, float f_55_, int i, int i_56_, int i_57_, int i_58_, int i_59_) {
		if (i != 0) {
			double d = (double) (i_56_ & 0xffff) * 9.587379924285257E-5;
			float f_60_ = (float) Math.sin(d) * (float) i;
			float f_61_ = (float) Math.cos(d) * (float) i;
			float f_62_ = (-f_54_ * f_61_ + -f_55_ * f_60_) / 4096.0F + f;
			float f_63_ = (--f_54_ * f_60_ + -f_55_ * f_61_) / 4096.0F + f_53_;
			float f_64_ = ((((float) method45() - f_54_) * f_61_ + -f_55_ * f_60_) / 4096.0F + f);
			float f_65_ = ((-((float) method45() - f_54_) * f_60_ + -f_55_ * f_61_) / 4096.0F + f_53_);
			float f_66_ = ((-f_54_ * f_61_ + ((float) method2589() - f_55_) * f_60_) / 4096.0F + f);
			float f_67_ = ((--f_54_ * f_60_ + ((float) method2589() - f_55_) * f_61_) / 4096.0F + f_53_);
			method2650(f_62_, f_63_, f_64_, f_65_, f_66_, f_67_, i_57_, i_58_, i_59_);
		}
	}

	public final void method2605(float f, float f_68_, int i, int i_69_, Class167 class167, int i_70_, int i_71_) {
		method2631(f, f_68_, (float) method45() / 2.0F, (float) method2589() / 2.0F, i, i_69_, class167, i_70_, i_71_);
	}

	abstract void method2606(float f, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, int i, int i_77_, int i_78_, int i_79_);

	public abstract void method2607(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_);

	abstract void method2608(float f, float f_85_, float f_86_, float f_87_, float f_88_, float f_89_, int i, int i_90_, int i_91_, int i_92_);

	final void method2609(float f, float f_93_, float f_94_, float f_95_, float f_96_, float f_97_, Class167 class167, int i, int i_98_) {
		method2610(f, f_93_, f_94_, f_95_, f_96_, f_97_, 1, class167, i, i_98_);
	}

	abstract void method2610(float f, float f_99_, float f_100_, float f_101_, float f_102_, float f_103_, int i, Class167 class167, int i_104_, int i_105_);

	public abstract void method2611(int i, int i_106_, int i_107_, int i_108_, int[] is, int[] is_109_, int i_110_, int i_111_);

	public abstract void method2612(int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_);

	public abstract void method2613(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_);

	public final void method2614(int i, int i_122_) {
		method2619(i, i_122_, 1, -1, 1);
	}

	public abstract void method2615(int i, int i_123_, int i_124_);

	public abstract Interface6 method2616();

	public abstract void method2617(int i, int i_125_, int i_126_, int i_127_, int i_128_);

	public abstract void method2618(int i, int i_129_, int i_130_, int i_131_, int i_132_);

	public abstract void method2619(int i, int i_133_, int i_134_, int i_135_, int i_136_);

	public abstract void method2620(int i, int i_137_, Class167 class167, int i_138_, int i_139_);

	public final void method2621(float f, float f_140_, float f_141_, float f_142_, int i, int i_143_) {
		method2604(f, f_140_, f_141_, f_142_, i, i_143_, 1, -1, 1);
	}

	public abstract int method146();

	abstract void method2622(int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_);

	abstract void method2623(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_);

	abstract void method2624(int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_);

	abstract void method2625(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_);

	public abstract void method2626(int i, int i_172_, Class167 class167, int i_173_, int i_174_);

	public abstract void method2627(int i, int i_175_, int i_176_, int i_177_, int[] is, int i_178_, int i_179_);

	public abstract void method2628(int i, int i_180_, int i_181_, int i_182_);

	public abstract void method2629(int[] is);

	public abstract void method2630(int i, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_);

	public final void method2631(float f, float f_189_, float f_190_, float f_191_, int i, int i_192_, Class167 class167, int i_193_, int i_194_) {
		if (i != 0) {
			double d = (double) (i_192_ & 0xffff) * 9.587379924285257E-5;
			float f_195_ = (float) Math.sin(d) * (float) i;
			float f_196_ = (float) Math.cos(d) * (float) i;
			float f_197_ = (-f_190_ * f_196_ + -f_191_ * f_195_) / 4096.0F + f;
			float f_198_ = (--f_190_ * f_195_ + -f_191_ * f_196_) / 4096.0F + f_189_;
			float f_199_ = ((((float) method45() - f_190_) * f_196_ + -f_191_ * f_195_) / 4096.0F + f);
			float f_200_ = ((-((float) method45() - f_190_) * f_195_ + -f_191_ * f_196_) / 4096.0F + f_189_);
			float f_201_ = ((-f_190_ * f_196_ + ((float) method2589() - f_191_) * f_195_) / 4096.0F + f);
			float f_202_ = ((--f_190_ * f_195_ + ((float) method2589() - f_191_) * f_196_) / 4096.0F + f_189_);
			method2609(f_197_, f_198_, f_199_, f_200_, f_201_, f_202_, class167, i_193_, i_194_);
		}
	}

	public abstract int method2632();

	public abstract int method2633();

	public abstract int method2634();

	public abstract int method2635();

	public abstract int method2636();

	public abstract int method2637();

	public abstract void method2638(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_);

	public final void method2639(float f, float f_209_, float f_210_, float f_211_, int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_) {
		if (i != 0 && i_212_ != 0) {
			double d = (double) (i_213_ & 0xffff) * 9.587379924285257E-5;
			float f_217_ = (float) Math.sin(d) * (float) i_212_;
			float f_218_ = (float) Math.cos(d) * (float) i_212_;
			float f_219_ = (float) Math.sin(d) * (float) i;
			float f_220_ = (float) Math.cos(d) * (float) i;
			float f_221_ = (-f_210_ * f_220_ + -f_211_ * f_217_) / 4096.0F + f;
			float f_222_ = (--f_210_ * f_219_ + -f_211_ * f_218_) / 4096.0F + f_209_;
			float f_223_ = ((((float) method45() - f_210_) * f_220_ + -f_211_ * f_217_) / 4096.0F + f);
			float f_224_ = ((-((float) method45() - f_210_) * f_219_ + -f_211_ * f_218_) / 4096.0F + f_209_);
			float f_225_ = ((-f_210_ * f_220_ + ((float) method2589() - f_211_) * f_217_) / 4096.0F + f);
			float f_226_ = ((--f_210_ * f_219_ + ((float) method2589() - f_211_) * f_218_) / 4096.0F + f_209_);
			method2650(f_221_, f_222_, f_223_, f_224_, f_225_, f_226_, i_214_, i_215_, i_216_);
		}
	}

	abstract void method2640(float f, float f_227_, float f_228_, float f_229_, float f_230_, float f_231_, int i, Class167 class167, int i_232_, int i_233_);

	public final void method2641(int i, int i_234_) {
		method2619(i, i_234_, 1, -1, 1);
	}

	public abstract int method147();

	public abstract int method148();

	public abstract Interface6 method2642();

	public final void method2643(float f, float f_235_, int i, int i_236_) {
		method2604(f, f_235_, (float) method45() / 2.0F, (float) method2589() / 2.0F, i, i_236_, 1, -1, 1);
	}

	public abstract void method2644(int i, int i_237_, int i_238_, int i_239_, int i_240_);

	public abstract int method2645();

	public abstract void method2646(int i, int i_241_, int i_242_, int i_243_, int i_244_);

	public abstract int method2647();

	public abstract void method2648(int[] is);

	public abstract void method2649(int[] is);

	public final void method2650(float f, float f_245_, float f_246_, float f_247_, float f_248_, float f_249_, int i, int i_250_, int i_251_) {
		method2608(f, f_245_, f_246_, f_247_, f_248_, f_249_, i, i_250_, i_251_, 1);
	}
}
