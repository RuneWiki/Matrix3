package game;

/* Class161_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class161_Sub3 extends Class161 {
	static int anInt10928;
	int anInt10929;
	int anInt10930;
	static int anInt10931;
	Class106_Sub2 aClass106_Sub2_10932;
	int anInt10933;
	static int anInt10934 = 0;
	int[] anIntArray10935;
	static final int anInt10936 = 4;
	static final int anInt10937 = 8;
	static final int anInt10938 = 12;
	static int anInt10939;
	static int anInt10940;
	static int anInt10941;
	int anInt10942;
	static int anInt10943;
	static int anInt10944;
	int anInt10945;
	static int anInt10946;
	static int anInt10947;
	int anInt10948;
	static int anInt10949;
	static int anInt10950;
	static int anInt10951;
	static int anInt10952;
	static int anInt10953;
	static int anInt10954;
	static int anInt10955;
	static int anInt10956;
	static int anInt10957 = 0;
	static int anInt10958;
	static int anInt10959;
	static int anInt10960;
	static int anInt10961;
	static int anInt10962;
	static int anInt10963;

	void method2640(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, Class167 class167, int i_5_, int i_6_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (method10051(f, f_0_, f_1_, f_2_, f_3_, f_4_)) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			method10053(((Class167_Sub1) class167_sub1).anIntArray10871, ((Class167_Sub1) class167_sub1).anIntArray10872, anInt10931 - i_5_, -i_6_ - (anInt10940 - anInt10941));
		}
	}

	public void method2586(int i, int i_7_, int i_8_, int i_9_) {
		((Class161_Sub3) this).anInt10942 = i;
		((Class161_Sub3) this).anInt10929 = i_7_;
		((Class161_Sub3) this).anInt10933 = i_8_;
		((Class161_Sub3) this).anInt10948 = i_9_;
	}

	public void method2649(int[] is) {
		is[0] = ((Class161_Sub3) this).anInt10942;
		is[1] = ((Class161_Sub3) this).anInt10929;
		is[2] = ((Class161_Sub3) this).anInt10933;
		is[3] = ((Class161_Sub3) this).anInt10948;
	}

	public int method2587() {
		return ((Class161_Sub3) this).anInt10945;
	}

	public int method2588() {
		return ((Class161_Sub3) this).anInt10930;
	}

	abstract void method2599(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	public int method2589() {
		return (((Class161_Sub3) this).anInt10929 + ((Class161_Sub3) this).anInt10930 + ((Class161_Sub3) this).anInt10948);
	}

	public abstract void method2591(int i, int i_17_, int i_18_, int i_19_, int[] is, int i_20_, int i_21_);

	public abstract void method2619(int i, int i_22_, int i_23_, int i_24_, int i_25_);

	void method2608(float f, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, int i, int i_31_, int i_32_, int i_33_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (method10051(f, f_26_, f_27_, f_28_, f_29_, f_30_)) {
			anInt10928 = i_31_;
			if (i != 1) {
				anInt10934 = i_31_ >>> 24;
				anInt10957 = 256 - anInt10934;
				if (i == 0) {
					anInt10955 = (i_31_ & 0xff0000) >> 16;
					anInt10959 = (i_31_ & 0xff00) >> 8;
					anInt10960 = i_31_ & 0xff;
				} else if (i == 2) {
					anInt10961 = i_31_ >>> 24;
					anInt10962 = 256 - anInt10961;
					int i_34_ = (i_31_ & 0xff00ff) * anInt10962 & ~0xff00ff;
					int i_35_ = (i_31_ & 0xff00) * anInt10962 & 0xff0000;
					anInt10963 = (i_34_ | i_35_) >>> 8;
				}
			}
			method10058(i, i_32_);
		}
	}

	public int method2645() {
		return (((Class161_Sub3) this).anInt10929 + ((Class161_Sub3) this).anInt10930 + ((Class161_Sub3) this).anInt10948);
	}

	abstract void method10050(boolean bool, boolean bool_36_, boolean bool_37_, int i, int i_38_, float f, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, boolean bool_45_);

	public abstract void method2618(int i, int i_46_, int i_47_, int i_48_, int i_49_);

	boolean method10051(float f, float f_50_, float f_51_, float f_52_, float f_53_, float f_54_) {
		int i = (((Class161_Sub3) this).anInt10942 + ((Class161_Sub3) this).anInt10945 + ((Class161_Sub3) this).anInt10933);
		int i_55_ = (((Class161_Sub3) this).anInt10929 + ((Class161_Sub3) this).anInt10930 + ((Class161_Sub3) this).anInt10948);
		if (i != ((Class161_Sub3) this).anInt10945 || i_55_ != ((Class161_Sub3) this).anInt10930) {
			float f_56_ = (f_51_ - f) / (float) i;
			float f_57_ = (f_52_ - f_50_) / (float) i;
			float f_58_ = (f_53_ - f) / (float) i_55_;
			float f_59_ = (f_54_ - f_50_) / (float) i_55_;
			float f_60_ = f_58_ * (float) ((Class161_Sub3) this).anInt10929;
			float f_61_ = f_59_ * (float) ((Class161_Sub3) this).anInt10929;
			float f_62_ = f_56_ * (float) ((Class161_Sub3) this).anInt10942;
			float f_63_ = f_57_ * (float) ((Class161_Sub3) this).anInt10942;
			float f_64_ = -f_56_ * (float) ((Class161_Sub3) this).anInt10933;
			float f_65_ = -f_57_ * (float) ((Class161_Sub3) this).anInt10933;
			float f_66_ = -f_58_ * (float) ((Class161_Sub3) this).anInt10948;
			float f_67_ = -f_59_ * (float) ((Class161_Sub3) this).anInt10948;
			f += f_62_ + f_60_;
			f_50_ += f_63_ + f_61_;
			f_51_ += f_64_ + f_60_;
			f_52_ += f_65_ + f_61_;
			f_53_ += f_62_ + f_66_;
			f_54_ += f_63_ + f_67_;
		}
		float f_68_ = f_53_ + (f_51_ - f);
		float f_69_ = f_52_ + (f_54_ - f_50_);
		float f_70_;
		float f_71_;
		if (f < f_51_) {
			f_70_ = f;
			f_71_ = f_51_;
		} else {
			f_70_ = f_51_;
			f_71_ = f;
		}
		if (f_53_ < f_70_)
			f_70_ = f_53_;
		if (f_68_ < f_70_)
			f_70_ = f_68_;
		if (f_53_ > f_71_)
			f_71_ = f_53_;
		if (f_68_ > f_71_)
			f_71_ = f_68_;
		float f_72_;
		float f_73_;
		if (f_50_ < f_52_) {
			f_72_ = f_50_;
			f_73_ = f_52_;
		} else {
			f_72_ = f_52_;
			f_73_ = f_50_;
		}
		if (f_54_ < f_72_)
			f_72_ = f_54_;
		if (f_69_ < f_72_)
			f_72_ = f_69_;
		if (f_54_ > f_73_)
			f_73_ = f_54_;
		if (f_69_ > f_73_)
			f_73_ = f_69_;
		if (f_70_ < (float) (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10220 * 1179466163))
			f_70_ = (float) (((Class106_Sub2) (((Class161_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
		if (f_71_ > (float) (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10221 * 892939761))
			f_71_ = (float) (((Class106_Sub2) (((Class161_Sub3) this).aClass106_Sub2_10932)).anInt10221 * 892939761);
		if (f_72_ < (float) (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10222 * 2029354259))
			f_72_ = (float) (((Class106_Sub2) (((Class161_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
		if (f_73_ > (float) (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10223 * 1704244235))
			f_73_ = (float) (((Class106_Sub2) (((Class161_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235);
		f_71_ = f_70_ - f_71_;
		if (f_71_ >= 0.0F)
			return false;
		f_73_ = f_72_ - f_73_;
		if (f_73_ >= 0.0F)
			return false;
		anInt10943 = (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10217) * -994907113;
		anInt10944 = (int) ((float) ((int) f_72_ * anInt10943) + f_70_);
		float f_74_ = (f_51_ - f) * (f_54_ - f_50_) - (f_52_ - f_50_) * (f_53_ - f);
		float f_75_ = (f_53_ - f) * (f_52_ - f_50_) - (f_54_ - f_50_) * (f_51_ - f);
		anInt10956 = (int) ((f_54_ - f_50_) * 4096.0F * (float) ((Class161_Sub3) this).anInt10945 / f_74_);
		anInt10946 = (int) ((f_52_ - f_50_) * 4096.0F * (float) ((Class161_Sub3) this).anInt10930 / f_75_);
		anInt10947 = (int) ((f_53_ - f) * 4096.0F * (float) ((Class161_Sub3) this).anInt10945 / f_75_);
		anInt10950 = (int) ((f_51_ - f) * 4096.0F * (float) ((Class161_Sub3) this).anInt10930 / f_74_);
		anInt10949 = (int) (f_70_ * 16.0F + 8.0F - (f + f_51_ + f_53_ + f_68_) / 4.0F * 16.0F);
		anInt10939 = (int) (f_72_ * 16.0F + 8.0F - (f_50_ + f_52_ + f_54_ + f_69_) / 4.0F * 16.0F);
		anInt10951 = ((((Class161_Sub3) this).anInt10945 >> 1 << 12) + (anInt10939 * anInt10947 >> 4));
		anInt10952 = ((((Class161_Sub3) this).anInt10930 >> 1 << 12) + (anInt10939 * anInt10950 >> 4));
		anInt10953 = anInt10949 * anInt10956 >> 4;
		anInt10954 = anInt10949 * anInt10946 >> 4;
		anInt10931 = (int) f_70_;
		anInt10958 = (int) f_71_;
		anInt10941 = (int) f_72_;
		anInt10940 = (int) f_73_;
		return true;
	}

	public void method2630(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (((Class161_Sub3) this).anIntArray10935 == null)
			((Class161_Sub3) this).anIntArray10935 = new int[4];
		((Class161_Sub3) this).aClass106_Sub2_10932.method1718(((Class161_Sub3) this).anIntArray10935);
		((Class161_Sub3) this).aClass106_Sub2_10932.method1716((((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10220) * 1179466163, (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259, i + i_77_, i_76_ + i_78_);
		int i_82_ = method45();
		int i_83_ = method2589();
		int i_84_ = (i_77_ + i_82_ - 1) / i_82_;
		int i_85_ = (i_78_ + i_83_ - 1) / i_83_;
		for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
			int i_87_ = i_86_ * i_83_;
			for (int i_88_ = 0; i_88_ < i_84_; i_88_++)
				method2619(i + i_88_ * i_82_, i_76_ + i_87_, i_79_, i_80_, i_81_);
		}
		((Class161_Sub3) this).aClass106_Sub2_10932.method1715(((Class161_Sub3) this).anIntArray10935[0], ((Class161_Sub3) this).anIntArray10935[1], ((Class161_Sub3) this).anIntArray10935[2], ((Class161_Sub3) this).anIntArray10935[3]);
	}

	abstract void method10052(int i, int i_89_);

	abstract void method2593(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_);

	abstract void method10053(int[] is, int[] is_97_, int i, int i_98_);

	static {
		anInt10955 = 0;
		anInt10959 = 0;
		anInt10960 = 0;
		anInt10961 = 0;
		anInt10962 = 0;
		anInt10963 = 0;
	}

	public abstract void method2617(int i, int i_99_, int i_100_, int i_101_, int i_102_);

	public int method45() {
		return (((Class161_Sub3) this).anInt10942 + ((Class161_Sub3) this).anInt10945 + ((Class161_Sub3) this).anInt10933);
	}

	abstract void method2624(int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_);

	public int method146() {
		return (((Class161_Sub3) this).anInt10942 + ((Class161_Sub3) this).anInt10945 + ((Class161_Sub3) this).anInt10933);
	}

	public abstract void method2620(int i, int i_110_, Class167 class167, int i_111_, int i_112_);

	public abstract void method2626(int i, int i_113_, Class167 class167, int i_114_, int i_115_);

	abstract void method2622(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_);

	public abstract void method2646(int i, int i_123_, int i_124_, int i_125_, int i_126_);

	Class161_Sub3(Class106_Sub2 class106_sub2, int i, int i_127_) {
		((Class161_Sub3) this).aClass106_Sub2_10932 = class106_sub2;
		((Class161_Sub3) this).anInt10945 = i;
		((Class161_Sub3) this).anInt10930 = i_127_;
	}

	abstract void method2623(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_);

	public int method2633() {
		return ((Class161_Sub3) this).anInt10945;
	}

	abstract void method10054(boolean bool, boolean bool_135_, boolean bool_136_, int i, int i_137_, float f, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, boolean bool_144_);

	abstract void method10055(boolean bool, boolean bool_145_, boolean bool_146_, int i, int i_147_, float f, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, boolean bool_154_);

	abstract void method10056(int i, int i_155_);

	public int method2602() {
		return ((Class161_Sub3) this).anInt10945;
	}

	abstract void method10057(int i, int i_156_);

	abstract void method10058(int i, int i_157_);

	abstract void method10059(int[] is, int[] is_158_, int i, int i_159_);

	abstract void method2625(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_);

	public void method2628(int i, int i_167_, int i_168_, int i_169_) {
		((Class161_Sub3) this).anInt10942 = i;
		((Class161_Sub3) this).anInt10929 = i_167_;
		((Class161_Sub3) this).anInt10933 = i_168_;
		((Class161_Sub3) this).anInt10948 = i_169_;
	}

	public void method2585(int[] is) {
		is[0] = ((Class161_Sub3) this).anInt10942;
		is[1] = ((Class161_Sub3) this).anInt10929;
		is[2] = ((Class161_Sub3) this).anInt10933;
		is[3] = ((Class161_Sub3) this).anInt10948;
	}

	public void method2629(int[] is) {
		is[0] = ((Class161_Sub3) this).anInt10942;
		is[1] = ((Class161_Sub3) this).anInt10929;
		is[2] = ((Class161_Sub3) this).anInt10933;
		is[3] = ((Class161_Sub3) this).anInt10948;
	}

	public void method2648(int[] is) {
		is[0] = ((Class161_Sub3) this).anInt10942;
		is[1] = ((Class161_Sub3) this).anInt10929;
		is[2] = ((Class161_Sub3) this).anInt10933;
		is[3] = ((Class161_Sub3) this).anInt10948;
	}

	public abstract void method2627(int i, int i_170_, int i_171_, int i_172_, int[] is, int i_173_, int i_174_);

	public int method2632() {
		return ((Class161_Sub3) this).anInt10945;
	}

	public abstract void method2596(int i, int i_175_, Class167 class167, int i_176_, int i_177_);

	void method2610(float f, float f_178_, float f_179_, float f_180_, float f_181_, float f_182_, int i, Class167 class167, int i_183_, int i_184_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (method10051(f, f_178_, f_179_, f_180_, f_181_, f_182_)) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			method10053(((Class167_Sub1) class167_sub1).anIntArray10871, ((Class167_Sub1) class167_sub1).anIntArray10872, anInt10931 - i_183_, -i_184_ - (anInt10940 - anInt10941));
		}
	}

	public int method2634() {
		return ((Class161_Sub3) this).anInt10930;
	}

	public int method2635() {
		return ((Class161_Sub3) this).anInt10930;
	}

	public int method2636() {
		return ((Class161_Sub3) this).anInt10930;
	}

	public int method2647() {
		return ((Class161_Sub3) this).anInt10930;
	}

	public int method2637() {
		return (((Class161_Sub3) this).anInt10929 + ((Class161_Sub3) this).anInt10930 + ((Class161_Sub3) this).anInt10948);
	}

	abstract void method10060(int i, int i_185_);

	void method2606(float f, float f_186_, float f_187_, float f_188_, float f_189_, float f_190_, int i, int i_191_, int i_192_, int i_193_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (method10051(f, f_186_, f_187_, f_188_, f_189_, f_190_)) {
			anInt10928 = i_191_;
			if (i != 1) {
				anInt10934 = i_191_ >>> 24;
				anInt10957 = 256 - anInt10934;
				if (i == 0) {
					anInt10955 = (i_191_ & 0xff0000) >> 16;
					anInt10959 = (i_191_ & 0xff00) >> 8;
					anInt10960 = i_191_ & 0xff;
				} else if (i == 2) {
					anInt10961 = i_191_ >>> 24;
					anInt10962 = 256 - anInt10961;
					int i_194_ = (i_191_ & 0xff00ff) * anInt10962 & ~0xff00ff;
					int i_195_ = (i_191_ & 0xff00) * anInt10962 & 0xff0000;
					anInt10963 = (i_194_ | i_195_) >>> 8;
				}
			}
			method10058(i, i_192_);
		}
	}

	public void method2638(int i, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_) {
		if (((Class161_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (((Class161_Sub3) this).anIntArray10935 == null)
			((Class161_Sub3) this).anIntArray10935 = new int[4];
		((Class161_Sub3) this).aClass106_Sub2_10932.method1718(((Class161_Sub3) this).anIntArray10935);
		((Class161_Sub3) this).aClass106_Sub2_10932.method1716((((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10220) * 1179466163, (((Class106_Sub2) ((Class161_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259, i + i_197_, i_196_ + i_198_);
		int i_202_ = method45();
		int i_203_ = method2589();
		int i_204_ = (i_197_ + i_202_ - 1) / i_202_;
		int i_205_ = (i_198_ + i_203_ - 1) / i_203_;
		for (int i_206_ = 0; i_206_ < i_205_; i_206_++) {
			int i_207_ = i_206_ * i_203_;
			for (int i_208_ = 0; i_208_ < i_204_; i_208_++)
				method2619(i + i_208_ * i_202_, i_196_ + i_207_, i_199_, i_200_, i_201_);
		}
		((Class161_Sub3) this).aClass106_Sub2_10932.method1715(((Class161_Sub3) this).anIntArray10935[0], ((Class161_Sub3) this).anIntArray10935[1], ((Class161_Sub3) this).anIntArray10935[2], ((Class161_Sub3) this).anIntArray10935[3]);
	}

	public abstract void method2644(int i, int i_209_, int i_210_, int i_211_, int i_212_);

	public int method147() {
		return (((Class161_Sub3) this).anInt10942 + ((Class161_Sub3) this).anInt10945 + ((Class161_Sub3) this).anInt10933);
	}

	public int method148() {
		return (((Class161_Sub3) this).anInt10942 + ((Class161_Sub3) this).anInt10945 + ((Class161_Sub3) this).anInt10933);
	}
}
