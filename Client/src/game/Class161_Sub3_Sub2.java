package game;

/* Class161_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub3_Sub2 extends Class161_Sub3 {
	int[] anIntArray11237;

	void method2599(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1_ > 0 && i_2_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_7_ = 0;
				int i_8_ = 0;
				int i_9_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_10_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_11_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_12_ = (i_10_ << 16) / i_1_;
				int i_13_ = (i_11_ << 16) / i_2_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_14_ = ((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_12_ - 1) / i_12_;
					i += i_14_;
					i_7_ += (i_14_ * i_12_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_15_ = ((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_13_ - 1) / i_13_;
					i_0_ += i_15_;
					i_8_ += (i_15_ * i_13_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_10_)
					i_1_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_7_ + i_12_ - 1) / i_12_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_11_)
					i_2_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_8_ + i_13_ - 1) / i_13_;
				int i_16_ = i + i_0_ * i_9_;
				int i_17_ = i_9_ - i_1_;
				if (i_0_ + i_2_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2_ -= (i_0_ + i_2_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_0_ < (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259) {
					int i_18_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_0_);
					i_2_ -= i_18_;
					i_16_ += i_18_ * i_9_;
					i_8_ += i_13_ * i_18_;
				}
				if (i + i_1_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
					int i_19_ = (i + i_1_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1_ -= i_19_;
					i_17_ += i_19_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_20_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
					i_1_ -= i_20_;
					i_16_ += i_20_;
					i_7_ += i_12_ * i_20_;
					i_17_ += i_20_;
				}
				if (i_5_ == 0) {
					if (i_3_ == 1) {
						int i_21_ = i_7_;
						for (int i_22_ = -i_2_; i_22_ < 0; i_22_++) {
							int i_23_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_24_ = -i_1_; i_24_ < 0; i_24_++) {
								is[i_16_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_23_]);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_21_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_25_ = (i_4_ & 0xff0000) >> 16;
						int i_26_ = (i_4_ & 0xff00) >> 8;
						int i_27_ = i_4_ & 0xff;
						int i_28_ = i_7_;
						for (int i_29_ = -i_2_; i_29_ < 0; i_29_++) {
							int i_30_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_31_ = -i_1_; i_31_ < 0; i_31_++) {
								int i_32_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_30_]);
								int i_33_ = (i_32_ & 0xff0000) * i_25_ & ~0xffffff;
								int i_34_ = (i_32_ & 0xff00) * i_26_ & 0xff0000;
								int i_35_ = (i_32_ & 0xff) * i_27_ & 0xff00;
								is[i_16_++] = (i_33_ | i_34_ | i_35_) >>> 8;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_28_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_36_ = i_7_;
						for (int i_37_ = -i_2_; i_37_ < 0; i_37_++) {
							int i_38_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_39_ = -i_1_; i_39_ < 0; i_39_++) {
								int i_40_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_38_]);
								int i_41_ = i_40_ + i_4_;
								int i_42_ = (i_40_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_43_ = ((i_42_ & 0x1000100) + (i_41_ - i_42_ & 0x10000));
								is[i_16_++] = i_41_ - i_43_ | i_43_ - (i_43_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_36_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_44_ = i_4_ >>> 24;
						int i_45_ = 256 - i_44_;
						int i_46_ = (i_4_ & 0xff00ff) * i_45_ & ~0xff00ff;
						int i_47_ = (i_4_ & 0xff00) * i_45_ & 0xff0000;
						i_4_ = (i_46_ | i_47_) >>> 8;
						int i_48_ = i_7_;
						for (int i_49_ = -i_2_; i_49_ < 0; i_49_++) {
							int i_50_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_51_ = -i_1_; i_51_ < 0; i_51_++) {
								int i_52_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_50_]);
								i_46_ = (i_52_ & 0xff00ff) * i_44_ & ~0xff00ff;
								i_47_ = (i_52_ & 0xff00) * i_44_ & 0xff0000;
								is[i_16_++] = ((i_46_ | i_47_) >>> 8) + i_4_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_48_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 1) {
					if (i_3_ == 1) {
						int i_53_ = i_7_;
						for (int i_54_ = -i_2_; i_54_ < 0; i_54_++) {
							int i_55_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_56_ = -i_1_; i_56_ < 0; i_56_++) {
								int i_57_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_55_]);
								if (i_57_ != 0)
									is[i_16_++] = i_57_;
								else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_53_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_58_ = i_7_;
						if ((i_4_ & 0xffffff) == 16777215) {
							int i_59_ = i_4_ >>> 24;
							int i_60_ = 256 - i_59_;
							for (int i_61_ = -i_2_; i_61_ < 0; i_61_++) {
								int i_62_ = ((i_8_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_63_ = -i_1_; i_63_ < 0; i_63_++) {
									int i_64_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_62_]);
									if (i_64_ != 0) {
										int i_65_ = is[i_16_];
										is[i_16_++] = ((((i_64_ & 0xff00ff) * i_59_ + (i_65_ & 0xff00ff) * i_60_) & ~0xff00ff) + (((i_64_ & 0xff00) * i_59_ + (i_65_ & 0xff00) * i_60_) & 0xff0000)) >> 8;
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_58_;
								i_16_ += i_17_;
							}
						} else {
							int i_66_ = (i_4_ & 0xff0000) >> 16;
							int i_67_ = (i_4_ & 0xff00) >> 8;
							int i_68_ = i_4_ & 0xff;
							int i_69_ = i_4_ >>> 24;
							int i_70_ = 256 - i_69_;
							for (int i_71_ = -i_2_; i_71_ < 0; i_71_++) {
								int i_72_ = ((i_8_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_73_ = -i_1_; i_73_ < 0; i_73_++) {
									int i_74_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_72_]);
									if (i_74_ != 0) {
										if (i_69_ != 255) {
											int i_75_ = ((i_74_ & 0xff0000) * i_66_ & ~0xffffff);
											int i_76_ = ((i_74_ & 0xff00) * i_67_ & 0xff0000);
											int i_77_ = ((i_74_ & 0xff) * i_68_ & 0xff00);
											i_74_ = ((i_75_ | i_76_ | i_77_) >>> 8);
											int i_78_ = is[i_16_];
											is[i_16_++] = ((((i_74_ & 0xff00ff) * i_69_ + ((i_78_ & 0xff00ff) * i_70_)) & ~0xff00ff) + (((i_74_ & 0xff00) * i_69_ + ((i_78_ & 0xff00) * i_70_)) & 0xff0000)) >> 8;
										} else {
											int i_79_ = ((i_74_ & 0xff0000) * i_66_ & ~0xffffff);
											int i_80_ = ((i_74_ & 0xff00) * i_67_ & 0xff0000);
											int i_81_ = ((i_74_ & 0xff) * i_68_ & 0xff00);
											is[i_16_++] = (i_79_ | i_80_ | i_81_) >>> 8;
										}
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_58_;
								i_16_ += i_17_;
							}
						}
					} else if (i_3_ == 3) {
						int i_82_ = i_7_;
						int i_83_ = i_4_ >>> 24;
						int i_84_ = 256 - i_83_;
						for (int i_85_ = -i_2_; i_85_ < 0; i_85_++) {
							int i_86_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_87_ = -i_1_; i_87_ < 0; i_87_++) {
								int i_88_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_86_]);
								int i_89_ = i_88_ + i_4_;
								int i_90_ = (i_88_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_91_ = ((i_90_ & 0x1000100) + (i_89_ - i_90_ & 0x10000));
								i_91_ = i_89_ - i_91_ | i_91_ - (i_91_ >>> 8);
								if (i_88_ == 0 && i_83_ != 255) {
									i_88_ = i_91_;
									i_91_ = is[i_16_];
									i_91_ = ((((i_88_ & 0xff00ff) * i_83_ + (i_91_ & 0xff00ff) * i_84_) & ~0xff00ff) + (((i_88_ & 0xff00) * i_83_ + (i_91_ & 0xff00) * i_84_) & 0xff0000)) >> 8;
								}
								is[i_16_++] = i_91_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_82_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_92_ = i_4_ >>> 24;
						int i_93_ = 256 - i_92_;
						int i_94_ = (i_4_ & 0xff00ff) * i_93_ & ~0xff00ff;
						int i_95_ = (i_4_ & 0xff00) * i_93_ & 0xff0000;
						i_4_ = (i_94_ | i_95_) >>> 8;
						int i_96_ = i_7_;
						for (int i_97_ = -i_2_; i_97_ < 0; i_97_++) {
							int i_98_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_99_ = -i_1_; i_99_ < 0; i_99_++) {
								int i_100_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_98_]);
								if (i_100_ != 0) {
									i_94_ = ((i_100_ & 0xff00ff) * i_92_ & ~0xff00ff);
									i_95_ = (i_100_ & 0xff00) * i_92_ & 0xff0000;
									is[i_16_++] = ((i_94_ | i_95_) >>> 8) + i_4_;
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_96_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 2) {
					if (i_3_ == 1) {
						int i_101_ = i_7_;
						for (int i_102_ = -i_2_; i_102_ < 0; i_102_++) {
							int i_103_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_104_ = -i_1_; i_104_ < 0; i_104_++) {
								int i_105_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_103_]);
								if (i_105_ != 0) {
									int i_106_ = is[i_16_];
									int i_107_ = i_105_ + i_106_;
									int i_108_ = ((i_105_ & 0xff00ff) + (i_106_ & 0xff00ff));
									i_106_ = ((i_108_ & 0x1000100) + (i_107_ - i_108_ & 0x10000));
									is[i_16_++] = i_107_ - i_106_ | i_106_ - (i_106_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_101_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_109_ = i_7_;
						int i_110_ = (i_4_ & 0xff0000) >> 16;
						int i_111_ = (i_4_ & 0xff00) >> 8;
						int i_112_ = i_4_ & 0xff;
						for (int i_113_ = -i_2_; i_113_ < 0; i_113_++) {
							int i_114_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_115_ = -i_1_; i_115_ < 0; i_115_++) {
								int i_116_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_114_]);
								if (i_116_ != 0) {
									int i_117_ = ((i_116_ & 0xff0000) * i_110_ & ~0xffffff);
									int i_118_ = ((i_116_ & 0xff00) * i_111_ & 0xff0000);
									int i_119_ = (i_116_ & 0xff) * i_112_ & 0xff00;
									i_116_ = (i_117_ | i_118_ | i_119_) >>> 8;
									int i_120_ = is[i_16_];
									int i_121_ = i_116_ + i_120_;
									int i_122_ = ((i_116_ & 0xff00ff) + (i_120_ & 0xff00ff));
									i_120_ = ((i_122_ & 0x1000100) + (i_121_ - i_122_ & 0x10000));
									is[i_16_++] = i_121_ - i_120_ | i_120_ - (i_120_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_109_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_123_ = i_7_;
						for (int i_124_ = -i_2_; i_124_ < 0; i_124_++) {
							int i_125_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_126_ = -i_1_; i_126_ < 0; i_126_++) {
								int i_127_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_125_]);
								int i_128_ = i_127_ + i_4_;
								int i_129_ = (i_127_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_130_ = ((i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000));
								i_127_ = i_128_ - i_130_ | i_130_ - (i_130_ >>> 8);
								i_130_ = is[i_16_];
								i_128_ = i_127_ + i_130_;
								i_129_ = (i_127_ & 0xff00ff) + (i_130_ & 0xff00ff);
								i_130_ = (i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000);
								is[i_16_++] = i_128_ - i_130_ | i_130_ - (i_130_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_123_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_131_ = i_4_ >>> 24;
						int i_132_ = 256 - i_131_;
						int i_133_ = (i_4_ & 0xff00ff) * i_132_ & ~0xff00ff;
						int i_134_ = (i_4_ & 0xff00) * i_132_ & 0xff0000;
						i_4_ = (i_133_ | i_134_) >>> 8;
						int i_135_ = i_7_;
						for (int i_136_ = -i_2_; i_136_ < 0; i_136_++) {
							int i_137_ = ((i_8_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_138_ = -i_1_; i_138_ < 0; i_138_++) {
								int i_139_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_7_ >> 16) + i_137_]);
								if (i_139_ != 0) {
									i_133_ = ((i_139_ & 0xff00ff) * i_131_ & ~0xff00ff);
									i_134_ = ((i_139_ & 0xff00) * i_131_ & 0xff0000);
									i_139_ = ((i_133_ | i_134_) >>> 8) + i_4_;
									int i_140_ = is[i_16_];
									int i_141_ = i_139_ + i_140_;
									int i_142_ = ((i_139_ & 0xff00ff) + (i_140_ & 0xff00ff));
									i_140_ = ((i_142_ & 0x1000100) + (i_141_ - i_142_ & 0x10000));
									is[i_16_++] = i_141_ - i_140_ | i_140_ - (i_140_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_135_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class161_Sub3_Sub2(Class106_Sub2 class106_sub2, int[] is, int i, int i_143_, int i_144_, int i_145_, boolean bool) {
		super(class106_sub2, i_144_, i_145_);
		if (bool)
			((Class161_Sub3_Sub2) this).anIntArray11237 = new int[i_144_ * i_145_];
		else
			((Class161_Sub3_Sub2) this).anIntArray11237 = is;
		i_143_ -= ((Class161_Sub3_Sub2) this).anInt10945;
		int i_146_ = 0;
		for (int i_147_ = 0; i_147_ < i_145_; i_147_++) {
			for (int i_148_ = 0; i_148_ < i_144_; i_148_++) {
				int i_149_ = is[i++];
				if (i_149_ >>> 24 == 255)
					((Class161_Sub3_Sub2) this).anIntArray11237[i_146_++] = (i_149_ & 0xffffff) == 0 ? -16777215 : i_149_;
				else
					((Class161_Sub3_Sub2) this).anIntArray11237[i_146_++] = 0;
			}
			i += i_143_;
		}
	}

	Class161_Sub3_Sub2(Class106_Sub2 class106_sub2, int[] is, int i, int i_150_) {
		super(class106_sub2, i, i_150_);
		((Class161_Sub3_Sub2) this).anIntArray11237 = is;
	}

	public void method2591(int i, int i_151_, int i_152_, int i_153_, int[] is, int i_154_, int i_155_) {
		i_155_ -= i_152_;
		for (int i_156_ = 0; i_156_ < i_153_; i_156_++) {
			int i_157_ = (i_151_ + i_156_) * i_152_ + i;
			for (int i_158_ = 0; i_158_ < i_152_; i_158_++)
				((Class161_Sub3_Sub2) this).anIntArray11237[i_157_ + i_158_] = is[i_154_++];
			i_154_ += i_155_;
		}
	}

	Class161_Sub3_Sub2(Class106_Sub2 class106_sub2, int i, int i_159_) {
		super(class106_sub2, i, i_159_);
		((Class161_Sub3_Sub2) this).anIntArray11237 = new int[i * i_159_];
	}

	public void method2592(int i, int i_160_, int i_161_, int i_162_, int[] is, int[] is_163_, int i_164_, int i_165_) {
		method10184(i, i_160_, i_161_, i_162_, is, i_164_, i_165_);
	}

	public void method2646(int i, int i_166_, int i_167_, int i_168_, int i_169_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_170_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_166_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_171_ = i_166_ * i_170_ + i;
			int i_172_ = 0;
			int i_173_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_174_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_175_ = i_170_ - i_174_;
			int i_176_ = 0;
			if (i_166_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_177_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_166_);
				i_173_ -= i_177_;
				i_166_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_172_ += i_177_ * i_174_;
				i_171_ += i_177_ * i_170_;
			}
			if (i_166_ + i_173_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_173_ -= (i_166_ + i_173_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_178_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_174_ -= i_178_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_172_ += i_178_;
				i_171_ += i_178_;
				i_176_ += i_178_;
				i_175_ += i_178_;
			}
			if (i + i_174_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_179_ = (i + i_174_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_174_ -= i_179_;
				i_176_ += i_179_;
				i_175_ += i_179_;
			}
			if (i_174_ > 0 && i_173_ > 0) {
				if (i_169_ == 0) {
					if (i_167_ == 1) {
						for (int i_180_ = -i_173_; i_180_ < 0; i_180_++) {
							int i_181_ = i_171_ + i_174_ - 3;
							while (i_171_ < i_181_) {
								is[i_171_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								is[i_171_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								is[i_171_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								is[i_171_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
							}
							i_181_ += 3;
							while (i_171_ < i_181_)
								is[i_171_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						int i_182_ = (i_168_ & 0xff0000) >> 16;
						int i_183_ = (i_168_ & 0xff00) >> 8;
						int i_184_ = i_168_ & 0xff;
						for (int i_185_ = -i_173_; i_185_ < 0; i_185_++) {
							for (int i_186_ = -i_174_; i_186_ < 0; i_186_++) {
								int i_187_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								int i_188_ = (i_187_ & 0xff0000) * i_182_ & ~0xffffff;
								int i_189_ = (i_187_ & 0xff00) * i_183_ & 0xff0000;
								int i_190_ = (i_187_ & 0xff) * i_184_ & 0xff00;
								is[i_171_++] = (i_188_ | i_189_ | i_190_) >>> 8;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 3) {
						for (int i_191_ = -i_173_; i_191_ < 0; i_191_++) {
							for (int i_192_ = -i_174_; i_192_ < 0; i_192_++) {
								int i_193_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								int i_194_ = i_193_ + i_168_;
								int i_195_ = ((i_193_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_196_ = ((i_195_ & 0x1000100) + (i_194_ - i_195_ & 0x10000));
								is[i_171_++] = i_194_ - i_196_ | i_196_ - (i_196_ >>> 8);
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_197_ = i_168_ >>> 24;
						int i_198_ = 256 - i_197_;
						int i_199_ = (i_168_ & 0xff00ff) * i_198_ & ~0xff00ff;
						int i_200_ = (i_168_ & 0xff00) * i_198_ & 0xff0000;
						i_168_ = (i_199_ | i_200_) >>> 8;
						for (int i_201_ = -i_173_; i_201_ < 0; i_201_++) {
							for (int i_202_ = -i_174_; i_202_ < 0; i_202_++) {
								int i_203_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								i_199_ = (i_203_ & 0xff00ff) * i_197_ & ~0xff00ff;
								i_200_ = (i_203_ & 0xff00) * i_197_ & 0xff0000;
								is[i_171_++] = ((i_199_ | i_200_) >>> 8) + i_168_;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_169_ == 1) {
					if (i_167_ == 1) {
						for (int i_204_ = -i_173_; i_204_ < 0; i_204_++) {
							int i_205_ = i_171_ + i_174_ - 3;
							while (i_171_ < i_205_) {
								int i_206_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_206_ != 0)
									is[i_171_++] = i_206_;
								else
									i_171_++;
								i_206_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_206_ != 0)
									is[i_171_++] = i_206_;
								else
									i_171_++;
								i_206_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_206_ != 0)
									is[i_171_++] = i_206_;
								else
									i_171_++;
								i_206_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_206_ != 0)
									is[i_171_++] = i_206_;
								else
									i_171_++;
							}
							i_205_ += 3;
							while (i_171_ < i_205_) {
								int i_207_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_207_ != 0)
									is[i_171_++] = i_207_;
								else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						if ((i_168_ & 0xffffff) == 16777215) {
							int i_208_ = i_168_ >>> 24;
							int i_209_ = 256 - i_208_;
							for (int i_210_ = -i_173_; i_210_ < 0; i_210_++) {
								for (int i_211_ = -i_174_; i_211_ < 0; i_211_++) {
									int i_212_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
									if (i_212_ != 0) {
										int i_213_ = is[i_171_];
										is[i_171_++] = ((((i_212_ & 0xff00ff) * i_208_ + ((i_213_ & 0xff00ff) * i_209_)) & ~0xff00ff) + (((i_212_ & 0xff00) * i_208_ + ((i_213_ & 0xff00) * i_209_)) & 0xff0000)) >> 8;
									} else
										i_171_++;
								}
								i_171_ += i_175_;
								i_172_ += i_176_;
							}
						} else {
							int i_214_ = (i_168_ & 0xff0000) >> 16;
							int i_215_ = (i_168_ & 0xff00) >> 8;
							int i_216_ = i_168_ & 0xff;
							int i_217_ = i_168_ >>> 24;
							int i_218_ = 256 - i_217_;
							for (int i_219_ = -i_173_; i_219_ < 0; i_219_++) {
								for (int i_220_ = -i_174_; i_220_ < 0; i_220_++) {
									int i_221_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
									if (i_221_ != 0) {
										if (i_217_ != 255) {
											int i_222_ = ((i_221_ & 0xff0000) * i_214_ & ~0xffffff);
											int i_223_ = ((i_221_ & 0xff00) * i_215_ & 0xff0000);
											int i_224_ = ((i_221_ & 0xff) * i_216_ & 0xff00);
											i_221_ = (i_222_ | i_223_ | i_224_) >>> 8;
											int i_225_ = is[i_171_];
											is[i_171_++] = (((((i_221_ & 0xff00ff) * i_217_) + ((i_225_ & 0xff00ff) * i_218_)) & ~0xff00ff) + ((((i_221_ & 0xff00) * i_217_) + ((i_225_ & 0xff00) * i_218_)) & 0xff0000)) >> 8;
										} else {
											int i_226_ = ((i_221_ & 0xff0000) * i_214_ & ~0xffffff);
											int i_227_ = ((i_221_ & 0xff00) * i_215_ & 0xff0000);
											int i_228_ = ((i_221_ & 0xff) * i_216_ & 0xff00);
											is[i_171_++] = (i_226_ | i_227_ | i_228_) >>> 8;
										}
									} else
										i_171_++;
								}
								i_171_ += i_175_;
								i_172_ += i_176_;
							}
						}
					} else if (i_167_ == 3) {
						int i_229_ = i_168_ >>> 24;
						int i_230_ = 256 - i_229_;
						for (int i_231_ = -i_173_; i_231_ < 0; i_231_++) {
							for (int i_232_ = -i_174_; i_232_ < 0; i_232_++) {
								int i_233_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								int i_234_ = i_233_ + i_168_;
								int i_235_ = ((i_233_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_236_ = ((i_235_ & 0x1000100) + (i_234_ - i_235_ & 0x10000));
								i_236_ = i_234_ - i_236_ | i_236_ - (i_236_ >>> 8);
								if (i_233_ == 0 && i_229_ != 255) {
									i_233_ = i_236_;
									i_236_ = is[i_171_];
									i_236_ = ((((i_233_ & 0xff00ff) * i_229_ + (i_236_ & 0xff00ff) * i_230_) & ~0xff00ff) + (((i_233_ & 0xff00) * i_229_ + (i_236_ & 0xff00) * i_230_) & 0xff0000)) >> 8;
								}
								is[i_171_++] = i_236_;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_237_ = i_168_ >>> 24;
						int i_238_ = 256 - i_237_;
						int i_239_ = (i_168_ & 0xff00ff) * i_238_ & ~0xff00ff;
						int i_240_ = (i_168_ & 0xff00) * i_238_ & 0xff0000;
						i_168_ = (i_239_ | i_240_) >>> 8;
						for (int i_241_ = -i_173_; i_241_ < 0; i_241_++) {
							for (int i_242_ = -i_174_; i_242_ < 0; i_242_++) {
								int i_243_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_243_ != 0) {
									i_239_ = ((i_243_ & 0xff00ff) * i_237_ & ~0xff00ff);
									i_240_ = ((i_243_ & 0xff00) * i_237_ & 0xff0000);
									is[i_171_++] = ((i_239_ | i_240_) >>> 8) + i_168_;
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_169_ == 2) {
					if (i_167_ == 1) {
						for (int i_244_ = -i_173_; i_244_ < 0; i_244_++) {
							for (int i_245_ = -i_174_; i_245_ < 0; i_245_++) {
								int i_246_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_246_ != 0) {
									int i_247_ = is[i_171_];
									int i_248_ = i_246_ + i_247_;
									int i_249_ = ((i_246_ & 0xff00ff) + (i_247_ & 0xff00ff));
									i_247_ = ((i_249_ & 0x1000100) + (i_248_ - i_249_ & 0x10000));
									is[i_171_++] = i_248_ - i_247_ | i_247_ - (i_247_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						int i_250_ = (i_168_ & 0xff0000) >> 16;
						int i_251_ = (i_168_ & 0xff00) >> 8;
						int i_252_ = i_168_ & 0xff;
						for (int i_253_ = -i_173_; i_253_ < 0; i_253_++) {
							for (int i_254_ = -i_174_; i_254_ < 0; i_254_++) {
								int i_255_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_255_ != 0) {
									int i_256_ = ((i_255_ & 0xff0000) * i_250_ & ~0xffffff);
									int i_257_ = ((i_255_ & 0xff00) * i_251_ & 0xff0000);
									int i_258_ = (i_255_ & 0xff) * i_252_ & 0xff00;
									i_255_ = (i_256_ | i_257_ | i_258_) >>> 8;
									int i_259_ = is[i_171_];
									int i_260_ = i_255_ + i_259_;
									int i_261_ = ((i_255_ & 0xff00ff) + (i_259_ & 0xff00ff));
									i_259_ = ((i_261_ & 0x1000100) + (i_260_ - i_261_ & 0x10000));
									is[i_171_++] = i_260_ - i_259_ | i_259_ - (i_259_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 3) {
						for (int i_262_ = -i_173_; i_262_ < 0; i_262_++) {
							for (int i_263_ = -i_174_; i_263_ < 0; i_263_++) {
								int i_264_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								int i_265_ = i_264_ + i_168_;
								int i_266_ = ((i_264_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_267_ = ((i_266_ & 0x1000100) + (i_265_ - i_266_ & 0x10000));
								i_264_ = i_265_ - i_267_ | i_267_ - (i_267_ >>> 8);
								i_267_ = is[i_171_];
								i_265_ = i_264_ + i_267_;
								i_266_ = (i_264_ & 0xff00ff) + (i_267_ & 0xff00ff);
								i_267_ = (i_266_ & 0x1000100) + (i_265_ - i_266_ & 0x10000);
								is[i_171_++] = i_265_ - i_267_ | i_267_ - (i_267_ >>> 8);
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_268_ = i_168_ >>> 24;
						int i_269_ = 256 - i_268_;
						int i_270_ = (i_168_ & 0xff00ff) * i_269_ & ~0xff00ff;
						int i_271_ = (i_168_ & 0xff00) * i_269_ & 0xff0000;
						i_168_ = (i_270_ | i_271_) >>> 8;
						for (int i_272_ = -i_173_; i_272_ < 0; i_272_++) {
							for (int i_273_ = -i_174_; i_273_ < 0; i_273_++) {
								int i_274_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_172_++]);
								if (i_274_ != 0) {
									i_270_ = ((i_274_ & 0xff00ff) * i_268_ & ~0xff00ff);
									i_271_ = ((i_274_ & 0xff00) * i_268_ & 0xff0000);
									i_274_ = ((i_270_ | i_271_) >>> 8) + i_168_;
									int i_275_ = is[i_171_];
									int i_276_ = i_274_ + i_275_;
									int i_277_ = ((i_274_ & 0xff00ff) + (i_275_ & 0xff00ff));
									i_275_ = ((i_277_ & 0x1000100) + (i_276_ - i_277_ & 0x10000));
									is[i_171_++] = i_276_ - i_275_ | i_275_ - (i_275_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2594(int i, int i_278_, int i_279_) {
		throw new IllegalStateException("");
	}

	public void method2620(int i, int i_280_, Class167 class167, int i_281_, int i_282_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_280_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_283_ = 0;
			int i_284_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_285_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_286_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_287_ = i_284_ - i_285_;
			int i_288_ = 0;
			int i_289_ = i + i_280_ * i_284_;
			if (i_280_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_290_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_280_);
				i_286_ -= i_290_;
				i_280_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_283_ += i_290_ * i_285_;
				i_289_ += i_290_ * i_284_;
			}
			if (i_280_ + i_286_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_286_ -= (i_280_ + i_286_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_291_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_285_ -= i_291_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_283_ += i_291_;
				i_289_ += i_291_;
				i_288_ += i_291_;
				i_287_ += i_291_;
			}
			if (i + i_285_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_292_ = (i + i_285_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_285_ -= i_292_;
				i_288_ += i_292_;
				i_287_ += i_292_;
			}
			if (i_285_ > 0 && i_286_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_293_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_294_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_295_ = i_280_;
				if (i_282_ > i_295_) {
					i_295_ = i_282_;
					i_289_ += (i_282_ - i_280_) * i_284_;
					i_283_ += ((i_282_ - i_280_) * ((Class161_Sub3_Sub2) this).anInt10945);
				}
				int i_296_ = (i_282_ + is_293_.length < i_280_ + i_286_ ? i_282_ + is_293_.length : i_280_ + i_286_);
				for (int i_297_ = i_295_; i_297_ < i_296_; i_297_++) {
					int i_298_ = is_293_[i_297_ - i_282_] + i_281_;
					int i_299_ = is_294_[i_297_ - i_282_];
					int i_300_ = i_285_;
					if (i > i_298_) {
						int i_301_ = i - i_298_;
						if (i_301_ >= i_299_) {
							i_283_ += i_285_ + i_288_;
							i_289_ += i_285_ + i_287_;
							continue;
						}
						i_299_ -= i_301_;
					} else {
						int i_302_ = i_298_ - i;
						if (i_302_ >= i_285_) {
							i_283_ += i_285_ + i_288_;
							i_289_ += i_285_ + i_287_;
							continue;
						}
						i_283_ += i_302_;
						i_300_ -= i_302_;
						i_289_ += i_302_;
					}
					int i_303_ = 0;
					if (i_300_ < i_299_)
						i_299_ = i_300_;
					else
						i_303_ = i_300_ - i_299_;
					for (int i_304_ = -i_299_; i_304_ < 0; i_304_++) {
						int i_305_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_283_++]);
						if (i_305_ != 0)
							is[i_289_++] = i_305_;
						else
							i_289_++;
					}
					i_283_ += i_303_ + i_288_;
					i_289_ += i_303_ + i_287_;
				}
			}
		}
	}

	public void method2619(int i, int i_306_, int i_307_, int i_308_, int i_309_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_310_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_306_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_311_ = i_306_ * i_310_ + i;
			int i_312_ = 0;
			int i_313_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_314_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_315_ = i_310_ - i_314_;
			int i_316_ = 0;
			if (i_306_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_317_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_306_);
				i_313_ -= i_317_;
				i_306_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_312_ += i_317_ * i_314_;
				i_311_ += i_317_ * i_310_;
			}
			if (i_306_ + i_313_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_313_ -= (i_306_ + i_313_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_318_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_314_ -= i_318_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_312_ += i_318_;
				i_311_ += i_318_;
				i_316_ += i_318_;
				i_315_ += i_318_;
			}
			if (i + i_314_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_319_ = (i + i_314_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_314_ -= i_319_;
				i_316_ += i_319_;
				i_315_ += i_319_;
			}
			if (i_314_ > 0 && i_313_ > 0) {
				if (i_309_ == 0) {
					if (i_307_ == 1) {
						for (int i_320_ = -i_313_; i_320_ < 0; i_320_++) {
							int i_321_ = i_311_ + i_314_ - 3;
							while (i_311_ < i_321_) {
								is[i_311_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								is[i_311_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								is[i_311_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								is[i_311_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
							}
							i_321_ += 3;
							while (i_311_ < i_321_)
								is[i_311_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 0) {
						int i_322_ = (i_308_ & 0xff0000) >> 16;
						int i_323_ = (i_308_ & 0xff00) >> 8;
						int i_324_ = i_308_ & 0xff;
						for (int i_325_ = -i_313_; i_325_ < 0; i_325_++) {
							for (int i_326_ = -i_314_; i_326_ < 0; i_326_++) {
								int i_327_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								int i_328_ = (i_327_ & 0xff0000) * i_322_ & ~0xffffff;
								int i_329_ = (i_327_ & 0xff00) * i_323_ & 0xff0000;
								int i_330_ = (i_327_ & 0xff) * i_324_ & 0xff00;
								is[i_311_++] = (i_328_ | i_329_ | i_330_) >>> 8;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 3) {
						for (int i_331_ = -i_313_; i_331_ < 0; i_331_++) {
							for (int i_332_ = -i_314_; i_332_ < 0; i_332_++) {
								int i_333_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								int i_334_ = i_333_ + i_308_;
								int i_335_ = ((i_333_ & 0xff00ff) + (i_308_ & 0xff00ff));
								int i_336_ = ((i_335_ & 0x1000100) + (i_334_ - i_335_ & 0x10000));
								is[i_311_++] = i_334_ - i_336_ | i_336_ - (i_336_ >>> 8);
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 2) {
						int i_337_ = i_308_ >>> 24;
						int i_338_ = 256 - i_337_;
						int i_339_ = (i_308_ & 0xff00ff) * i_338_ & ~0xff00ff;
						int i_340_ = (i_308_ & 0xff00) * i_338_ & 0xff0000;
						i_308_ = (i_339_ | i_340_) >>> 8;
						for (int i_341_ = -i_313_; i_341_ < 0; i_341_++) {
							for (int i_342_ = -i_314_; i_342_ < 0; i_342_++) {
								int i_343_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								i_339_ = (i_343_ & 0xff00ff) * i_337_ & ~0xff00ff;
								i_340_ = (i_343_ & 0xff00) * i_337_ & 0xff0000;
								is[i_311_++] = ((i_339_ | i_340_) >>> 8) + i_308_;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_309_ == 1) {
					if (i_307_ == 1) {
						for (int i_344_ = -i_313_; i_344_ < 0; i_344_++) {
							int i_345_ = i_311_ + i_314_ - 3;
							while (i_311_ < i_345_) {
								int i_346_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_346_ != 0)
									is[i_311_++] = i_346_;
								else
									i_311_++;
								i_346_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_346_ != 0)
									is[i_311_++] = i_346_;
								else
									i_311_++;
								i_346_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_346_ != 0)
									is[i_311_++] = i_346_;
								else
									i_311_++;
								i_346_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_346_ != 0)
									is[i_311_++] = i_346_;
								else
									i_311_++;
							}
							i_345_ += 3;
							while (i_311_ < i_345_) {
								int i_347_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_347_ != 0)
									is[i_311_++] = i_347_;
								else
									i_311_++;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 0) {
						if ((i_308_ & 0xffffff) == 16777215) {
							int i_348_ = i_308_ >>> 24;
							int i_349_ = 256 - i_348_;
							for (int i_350_ = -i_313_; i_350_ < 0; i_350_++) {
								for (int i_351_ = -i_314_; i_351_ < 0; i_351_++) {
									int i_352_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
									if (i_352_ != 0) {
										int i_353_ = is[i_311_];
										is[i_311_++] = ((((i_352_ & 0xff00ff) * i_348_ + ((i_353_ & 0xff00ff) * i_349_)) & ~0xff00ff) + (((i_352_ & 0xff00) * i_348_ + ((i_353_ & 0xff00) * i_349_)) & 0xff0000)) >> 8;
									} else
										i_311_++;
								}
								i_311_ += i_315_;
								i_312_ += i_316_;
							}
						} else {
							int i_354_ = (i_308_ & 0xff0000) >> 16;
							int i_355_ = (i_308_ & 0xff00) >> 8;
							int i_356_ = i_308_ & 0xff;
							int i_357_ = i_308_ >>> 24;
							int i_358_ = 256 - i_357_;
							for (int i_359_ = -i_313_; i_359_ < 0; i_359_++) {
								for (int i_360_ = -i_314_; i_360_ < 0; i_360_++) {
									int i_361_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
									if (i_361_ != 0) {
										if (i_357_ != 255) {
											int i_362_ = ((i_361_ & 0xff0000) * i_354_ & ~0xffffff);
											int i_363_ = ((i_361_ & 0xff00) * i_355_ & 0xff0000);
											int i_364_ = ((i_361_ & 0xff) * i_356_ & 0xff00);
											i_361_ = (i_362_ | i_363_ | i_364_) >>> 8;
											int i_365_ = is[i_311_];
											is[i_311_++] = (((((i_361_ & 0xff00ff) * i_357_) + ((i_365_ & 0xff00ff) * i_358_)) & ~0xff00ff) + ((((i_361_ & 0xff00) * i_357_) + ((i_365_ & 0xff00) * i_358_)) & 0xff0000)) >> 8;
										} else {
											int i_366_ = ((i_361_ & 0xff0000) * i_354_ & ~0xffffff);
											int i_367_ = ((i_361_ & 0xff00) * i_355_ & 0xff0000);
											int i_368_ = ((i_361_ & 0xff) * i_356_ & 0xff00);
											is[i_311_++] = (i_366_ | i_367_ | i_368_) >>> 8;
										}
									} else
										i_311_++;
								}
								i_311_ += i_315_;
								i_312_ += i_316_;
							}
						}
					} else if (i_307_ == 3) {
						int i_369_ = i_308_ >>> 24;
						int i_370_ = 256 - i_369_;
						for (int i_371_ = -i_313_; i_371_ < 0; i_371_++) {
							for (int i_372_ = -i_314_; i_372_ < 0; i_372_++) {
								int i_373_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								int i_374_ = i_373_ + i_308_;
								int i_375_ = ((i_373_ & 0xff00ff) + (i_308_ & 0xff00ff));
								int i_376_ = ((i_375_ & 0x1000100) + (i_374_ - i_375_ & 0x10000));
								i_376_ = i_374_ - i_376_ | i_376_ - (i_376_ >>> 8);
								if (i_373_ == 0 && i_369_ != 255) {
									i_373_ = i_376_;
									i_376_ = is[i_311_];
									i_376_ = ((((i_373_ & 0xff00ff) * i_369_ + (i_376_ & 0xff00ff) * i_370_) & ~0xff00ff) + (((i_373_ & 0xff00) * i_369_ + (i_376_ & 0xff00) * i_370_) & 0xff0000)) >> 8;
								}
								is[i_311_++] = i_376_;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 2) {
						int i_377_ = i_308_ >>> 24;
						int i_378_ = 256 - i_377_;
						int i_379_ = (i_308_ & 0xff00ff) * i_378_ & ~0xff00ff;
						int i_380_ = (i_308_ & 0xff00) * i_378_ & 0xff0000;
						i_308_ = (i_379_ | i_380_) >>> 8;
						for (int i_381_ = -i_313_; i_381_ < 0; i_381_++) {
							for (int i_382_ = -i_314_; i_382_ < 0; i_382_++) {
								int i_383_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_383_ != 0) {
									i_379_ = ((i_383_ & 0xff00ff) * i_377_ & ~0xff00ff);
									i_380_ = ((i_383_ & 0xff00) * i_377_ & 0xff0000);
									is[i_311_++] = ((i_379_ | i_380_) >>> 8) + i_308_;
								} else
									i_311_++;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_309_ == 2) {
					if (i_307_ == 1) {
						for (int i_384_ = -i_313_; i_384_ < 0; i_384_++) {
							for (int i_385_ = -i_314_; i_385_ < 0; i_385_++) {
								int i_386_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_386_ != 0) {
									int i_387_ = is[i_311_];
									int i_388_ = i_386_ + i_387_;
									int i_389_ = ((i_386_ & 0xff00ff) + (i_387_ & 0xff00ff));
									i_387_ = ((i_389_ & 0x1000100) + (i_388_ - i_389_ & 0x10000));
									is[i_311_++] = i_388_ - i_387_ | i_387_ - (i_387_ >>> 8);
								} else
									i_311_++;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 0) {
						int i_390_ = (i_308_ & 0xff0000) >> 16;
						int i_391_ = (i_308_ & 0xff00) >> 8;
						int i_392_ = i_308_ & 0xff;
						for (int i_393_ = -i_313_; i_393_ < 0; i_393_++) {
							for (int i_394_ = -i_314_; i_394_ < 0; i_394_++) {
								int i_395_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_395_ != 0) {
									int i_396_ = ((i_395_ & 0xff0000) * i_390_ & ~0xffffff);
									int i_397_ = ((i_395_ & 0xff00) * i_391_ & 0xff0000);
									int i_398_ = (i_395_ & 0xff) * i_392_ & 0xff00;
									i_395_ = (i_396_ | i_397_ | i_398_) >>> 8;
									int i_399_ = is[i_311_];
									int i_400_ = i_395_ + i_399_;
									int i_401_ = ((i_395_ & 0xff00ff) + (i_399_ & 0xff00ff));
									i_399_ = ((i_401_ & 0x1000100) + (i_400_ - i_401_ & 0x10000));
									is[i_311_++] = i_400_ - i_399_ | i_399_ - (i_399_ >>> 8);
								} else
									i_311_++;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 3) {
						for (int i_402_ = -i_313_; i_402_ < 0; i_402_++) {
							for (int i_403_ = -i_314_; i_403_ < 0; i_403_++) {
								int i_404_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								int i_405_ = i_404_ + i_308_;
								int i_406_ = ((i_404_ & 0xff00ff) + (i_308_ & 0xff00ff));
								int i_407_ = ((i_406_ & 0x1000100) + (i_405_ - i_406_ & 0x10000));
								i_404_ = i_405_ - i_407_ | i_407_ - (i_407_ >>> 8);
								i_407_ = is[i_311_];
								i_405_ = i_404_ + i_407_;
								i_406_ = (i_404_ & 0xff00ff) + (i_407_ & 0xff00ff);
								i_407_ = (i_406_ & 0x1000100) + (i_405_ - i_406_ & 0x10000);
								is[i_311_++] = i_405_ - i_407_ | i_407_ - (i_407_ >>> 8);
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else if (i_307_ == 2) {
						int i_408_ = i_308_ >>> 24;
						int i_409_ = 256 - i_408_;
						int i_410_ = (i_308_ & 0xff00ff) * i_409_ & ~0xff00ff;
						int i_411_ = (i_308_ & 0xff00) * i_409_ & 0xff0000;
						i_308_ = (i_410_ | i_411_) >>> 8;
						for (int i_412_ = -i_313_; i_412_ < 0; i_412_++) {
							for (int i_413_ = -i_314_; i_413_ < 0; i_413_++) {
								int i_414_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_312_++]);
								if (i_414_ != 0) {
									i_410_ = ((i_414_ & 0xff00ff) * i_408_ & ~0xff00ff);
									i_411_ = ((i_414_ & 0xff00) * i_408_ & 0xff0000);
									i_414_ = ((i_410_ | i_411_) >>> 8) + i_308_;
									int i_415_ = is[i_311_];
									int i_416_ = i_414_ + i_415_;
									int i_417_ = ((i_414_ & 0xff00ff) + (i_415_ & 0xff00ff));
									i_415_ = ((i_417_ & 0x1000100) + (i_416_ - i_417_ & 0x10000));
									is[i_311_++] = i_416_ - i_415_ | i_415_ - (i_415_ >>> 8);
								} else
									i_311_++;
							}
							i_311_ += i_315_;
							i_312_ += i_316_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2596(int i, int i_418_, Class167 class167, int i_419_, int i_420_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_418_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_421_ = 0;
			int i_422_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_423_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_424_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_425_ = i_422_ - i_423_;
			int i_426_ = 0;
			int i_427_ = i + i_418_ * i_422_;
			if (i_418_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_428_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_418_);
				i_424_ -= i_428_;
				i_418_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_421_ += i_428_ * i_423_;
				i_427_ += i_428_ * i_422_;
			}
			if (i_418_ + i_424_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_424_ -= (i_418_ + i_424_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_429_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_423_ -= i_429_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_421_ += i_429_;
				i_427_ += i_429_;
				i_426_ += i_429_;
				i_425_ += i_429_;
			}
			if (i + i_423_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_430_ = (i + i_423_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_423_ -= i_430_;
				i_426_ += i_430_;
				i_425_ += i_430_;
			}
			if (i_423_ > 0 && i_424_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_431_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_432_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_433_ = i_418_;
				if (i_420_ > i_433_) {
					i_433_ = i_420_;
					i_427_ += (i_420_ - i_418_) * i_422_;
					i_421_ += ((i_420_ - i_418_) * ((Class161_Sub3_Sub2) this).anInt10945);
				}
				int i_434_ = (i_420_ + is_431_.length < i_418_ + i_424_ ? i_420_ + is_431_.length : i_418_ + i_424_);
				for (int i_435_ = i_433_; i_435_ < i_434_; i_435_++) {
					int i_436_ = is_431_[i_435_ - i_420_] + i_419_;
					int i_437_ = is_432_[i_435_ - i_420_];
					int i_438_ = i_423_;
					if (i > i_436_) {
						int i_439_ = i - i_436_;
						if (i_439_ >= i_437_) {
							i_421_ += i_423_ + i_426_;
							i_427_ += i_423_ + i_425_;
							continue;
						}
						i_437_ -= i_439_;
					} else {
						int i_440_ = i_436_ - i;
						if (i_440_ >= i_423_) {
							i_421_ += i_423_ + i_426_;
							i_427_ += i_423_ + i_425_;
							continue;
						}
						i_421_ += i_440_;
						i_438_ -= i_440_;
						i_427_ += i_440_;
					}
					int i_441_ = 0;
					if (i_438_ < i_437_)
						i_437_ = i_438_;
					else
						i_441_ = i_438_ - i_437_;
					for (int i_442_ = -i_437_; i_442_ < 0; i_442_++) {
						int i_443_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_421_++]);
						if (i_443_ != 0)
							is[i_427_++] = i_443_;
						else
							i_427_++;
					}
					i_421_ += i_441_ + i_426_;
					i_427_ += i_441_ + i_425_;
				}
			}
		}
	}

	void method10055(boolean bool, boolean bool_444_, boolean bool_445_, int i, int i_446_, float f, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_, boolean bool_453_) {
		if (i_447_ > 0 && i_448_ > 0 && (bool || bool_444_)) {
			int i_454_ = 0;
			int i_455_ = 0;
			int i_456_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
			int i_457_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
			int i_458_ = (i_456_ << 16) / i_447_;
			int i_459_ = (i_457_ << 16) / i_448_;
			if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
				int i_460_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_458_ - 1) / i_458_);
				i += i_460_;
				i_454_ += (i_460_ * i_458_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
				int i_461_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_459_ - 1) / i_459_);
				i_446_ += i_461_;
				i_455_ += (i_461_ * i_459_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10945 < i_456_)
				i_447_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_454_ + i_458_ - 1) / i_458_;
			if (((Class161_Sub3_Sub2) this).anInt10930 < i_457_)
				i_448_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_455_ + i_459_ - 1) / i_459_;
			int i_462_ = i + i_446_ * ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_463_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113) - i_447_);
			if (i_446_ + i_448_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_448_ -= (i_446_ + i_448_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_446_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_464_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_446_);
				i_448_ -= i_464_;
				i_462_ += i_464_ * ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
				i_455_ += i_459_ * i_464_;
			}
			if (i + i_447_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_465_ = (i + i_447_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_447_ -= i_465_;
				i_463_ += i_465_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_466_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_447_ -= i_466_;
				i_462_ += i_466_;
				i_454_ += i_458_ * i_466_;
				i_463_ += i_466_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_451_ == 0) {
				if (i_449_ == 1) {
					int i_467_ = i_454_;
					for (int i_468_ = -i_448_; i_468_ < 0; i_468_++) {
						int i_469_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_470_ = -i_447_; i_470_ < 0; i_470_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool)
									is[i_462_] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_469_]);
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_467_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 0) {
					int i_471_ = (i_450_ & 0xff0000) >> 16;
					int i_472_ = (i_450_ & 0xff00) >> 8;
					int i_473_ = i_450_ & 0xff;
					int i_474_ = i_454_;
					for (int i_475_ = -i_448_; i_475_ < 0; i_475_++) {
						int i_476_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_477_ = -i_447_; i_477_ < 0; i_477_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool) {
									int i_478_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_476_]);
									int i_479_ = ((i_478_ & 0xff0000) * i_471_ & ~0xffffff);
									int i_480_ = ((i_478_ & 0xff00) * i_472_ & 0xff0000);
									int i_481_ = (i_478_ & 0xff) * i_473_ & 0xff00;
									is[i_462_] = (i_479_ | i_480_ | i_481_) >>> 8;
								}
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_474_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 3) {
					int i_482_ = i_454_;
					for (int i_483_ = -i_448_; i_483_ < 0; i_483_++) {
						int i_484_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_485_ = -i_447_; i_485_ < 0; i_485_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool) {
									int i_486_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_484_]);
									int i_487_ = i_486_ + i_450_;
									int i_488_ = ((i_486_ & 0xff00ff) + (i_450_ & 0xff00ff));
									int i_489_ = ((i_488_ & 0x1000100) + (i_487_ - i_488_ & 0x10000));
									is[i_462_] = i_487_ - i_489_ | i_489_ - (i_489_ >>> 8);
								}
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_482_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 2) {
					int i_490_ = i_450_ >>> 24;
					int i_491_ = 256 - i_490_;
					int i_492_ = (i_450_ & 0xff00ff) * i_491_ & ~0xff00ff;
					int i_493_ = (i_450_ & 0xff00) * i_491_ & 0xff0000;
					i_450_ = (i_492_ | i_493_) >>> 8;
					int i_494_ = i_454_;
					for (int i_495_ = -i_448_; i_495_ < 0; i_495_++) {
						int i_496_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_497_ = -i_447_; i_497_ < 0; i_497_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool) {
									int i_498_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_496_]);
									i_492_ = ((i_498_ & 0xff00ff) * i_490_ & ~0xff00ff);
									i_493_ = ((i_498_ & 0xff00) * i_490_ & 0xff0000);
									is[i_462_] = ((i_492_ | i_493_) >>> 8) + i_450_;
								}
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_494_;
						i_462_ += i_463_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_451_ == 1) {
				if (i_449_ == 1) {
					int i_499_ = i_454_;
					for (int i_500_ = -i_448_; i_500_ < 0; i_500_++) {
						int i_501_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_502_ = -i_447_; i_502_ < 0; i_502_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								int i_503_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_501_]);
								if (i_503_ != 0) {
									if (bool)
										is[i_462_] = i_503_;
									if (bool_444_ && bool_453_)
										fs[i_462_] = f;
								}
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_499_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 0) {
					int i_504_ = i_454_;
					if ((i_450_ & 0xffffff) == 16777215) {
						int i_505_ = i_450_ >>> 24;
						int i_506_ = 256 - i_505_;
						for (int i_507_ = -i_448_; i_507_ < 0; i_507_++) {
							int i_508_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_509_ = -i_447_; i_509_ < 0; i_509_++) {
								if (!bool_444_ || f < fs[i_462_]) {
									int i_510_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_508_]);
									if (i_510_ != 0) {
										if (bool) {
											int i_511_ = is[i_462_];
											is[i_462_] = (((((i_510_ & 0xff00ff) * i_505_) + ((i_511_ & 0xff00ff) * i_506_)) & ~0xff00ff) + ((((i_510_ & 0xff00) * i_505_) + ((i_511_ & 0xff00) * i_506_)) & 0xff0000)) >> 8;
										}
										if (bool_444_ && bool_453_)
											fs[i_462_] = f;
									}
								}
								i_454_ += i_458_;
								i_462_++;
							}
							i_455_ += i_459_;
							i_454_ = i_504_;
							i_462_ += i_463_;
						}
					} else {
						int i_512_ = (i_450_ & 0xff0000) >> 16;
						int i_513_ = (i_450_ & 0xff00) >> 8;
						int i_514_ = i_450_ & 0xff;
						int i_515_ = i_450_ >>> 24;
						int i_516_ = 256 - i_515_;
						for (int i_517_ = -i_448_; i_517_ < 0; i_517_++) {
							int i_518_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_519_ = -i_447_; i_519_ < 0; i_519_++) {
								if (!bool_444_ || f < fs[i_462_]) {
									int i_520_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_518_]);
									if (i_520_ != 0) {
										if (i_515_ != 255) {
											if (bool) {
												int i_521_ = (((i_520_ & 0xff0000) * i_512_) & ~0xffffff);
												int i_522_ = (((i_520_ & 0xff00) * i_513_) & 0xff0000);
												int i_523_ = ((i_520_ & 0xff) * i_514_ & 0xff00);
												i_520_ = (i_521_ | i_522_ | i_523_) >>> 8;
												int i_524_ = is[i_462_];
												is[i_462_] = (((((i_520_ & 0xff00ff) * i_515_) + ((i_524_ & 0xff00ff) * i_516_)) & ~0xff00ff) + ((((i_520_ & 0xff00) * i_515_) + ((i_524_ & 0xff00) * i_516_)) & 0xff0000)) >> 8;
											}
											if (bool_444_ && bool_453_)
												fs[i_462_] = f;
										} else {
											if (bool) {
												int i_525_ = (((i_520_ & 0xff0000) * i_512_) & ~0xffffff);
												int i_526_ = (((i_520_ & 0xff00) * i_513_) & 0xff0000);
												int i_527_ = ((i_520_ & 0xff) * i_514_ & 0xff00);
												is[i_462_] = (i_525_ | i_526_ | i_527_) >>> 8;
											}
											if (bool_444_ && bool_453_)
												fs[i_462_] = f;
										}
									}
								}
								i_454_ += i_458_;
								i_462_++;
							}
							i_455_ += i_459_;
							i_454_ = i_504_;
							i_462_ += i_463_;
						}
					}
				} else if (i_449_ == 3) {
					int i_528_ = i_454_;
					int i_529_ = i_450_ >>> 24;
					int i_530_ = 256 - i_529_;
					for (int i_531_ = -i_448_; i_531_ < 0; i_531_++) {
						int i_532_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_533_ = -i_447_; i_533_ < 0; i_533_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool) {
									int i_534_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_532_]);
									int i_535_ = i_534_ + i_450_;
									int i_536_ = ((i_534_ & 0xff00ff) + (i_450_ & 0xff00ff));
									int i_537_ = ((i_536_ & 0x1000100) + (i_535_ - i_536_ & 0x10000));
									i_537_ = i_535_ - i_537_ | i_537_ - (i_537_ >>> 8);
									if (i_534_ == 0 && i_529_ != 255) {
										i_534_ = i_537_;
										i_537_ = is[i_462_];
										i_537_ = ((((i_534_ & 0xff00ff) * i_529_ + ((i_537_ & 0xff00ff) * i_530_)) & ~0xff00ff) + (((i_534_ & 0xff00) * i_529_ + ((i_537_ & 0xff00) * i_530_)) & 0xff0000)) >> 8;
									}
									is[i_462_] = i_537_;
								}
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_528_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 2) {
					int i_538_ = i_450_ >>> 24;
					int i_539_ = 256 - i_538_;
					int i_540_ = (i_450_ & 0xff00ff) * i_539_ & ~0xff00ff;
					int i_541_ = (i_450_ & 0xff00) * i_539_ & 0xff0000;
					i_450_ = (i_540_ | i_541_) >>> 8;
					int i_542_ = i_454_;
					for (int i_543_ = -i_448_; i_543_ < 0; i_543_++) {
						int i_544_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_545_ = -i_447_; i_545_ < 0; i_545_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								int i_546_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_544_]);
								if (i_546_ != 0) {
									if (bool) {
										i_540_ = ((i_546_ & 0xff00ff) * i_538_ & ~0xff00ff);
										i_541_ = ((i_546_ & 0xff00) * i_538_ & 0xff0000);
										is[i_462_] = (((i_540_ | i_541_) >>> 8) + i_450_);
									}
									if (bool_444_ && bool_453_)
										fs[i_462_] = f;
								}
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_542_;
						i_462_ += i_463_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_451_ == 2) {
				if (i_449_ == 1) {
					int i_547_ = i_454_;
					for (int i_548_ = -i_448_; i_548_ < 0; i_548_++) {
						int i_549_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_550_ = -i_447_; i_550_ < 0; i_550_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								int i_551_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_549_]);
								if (i_551_ != 0) {
									if (bool) {
										int i_552_ = is[i_462_];
										int i_553_ = i_551_ + i_552_;
										int i_554_ = ((i_551_ & 0xff00ff) + (i_552_ & 0xff00ff));
										i_552_ = ((i_554_ & 0x1000100) + (i_553_ - i_554_ & 0x10000));
										is[i_462_] = (i_553_ - i_552_ | i_552_ - (i_552_ >>> 8));
									}
									if (bool_444_ && bool_453_)
										fs[i_462_] = f;
								}
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_547_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 0) {
					int i_555_ = i_454_;
					int i_556_ = (i_450_ & 0xff0000) >> 16;
					int i_557_ = (i_450_ & 0xff00) >> 8;
					int i_558_ = i_450_ & 0xff;
					for (int i_559_ = -i_448_; i_559_ < 0; i_559_++) {
						int i_560_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_561_ = -i_447_; i_561_ < 0; i_561_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								int i_562_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_560_]);
								if (i_562_ != 0) {
									if (bool) {
										int i_563_ = ((i_562_ & 0xff0000) * i_556_ & ~0xffffff);
										int i_564_ = ((i_562_ & 0xff00) * i_557_ & 0xff0000);
										int i_565_ = ((i_562_ & 0xff) * i_558_ & 0xff00);
										i_562_ = (i_563_ | i_564_ | i_565_) >>> 8;
										int i_566_ = is[i_462_];
										int i_567_ = i_562_ + i_566_;
										int i_568_ = ((i_562_ & 0xff00ff) + (i_566_ & 0xff00ff));
										i_566_ = ((i_568_ & 0x1000100) + (i_567_ - i_568_ & 0x10000));
										is[i_462_] = (i_567_ - i_566_ | i_566_ - (i_566_ >>> 8));
									}
									if (bool_444_ && bool_453_)
										fs[i_462_] = f;
								}
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_555_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 3) {
					int i_569_ = i_454_;
					for (int i_570_ = -i_448_; i_570_ < 0; i_570_++) {
						int i_571_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_572_ = -i_447_; i_572_ < 0; i_572_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								if (bool) {
									int i_573_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_571_]);
									int i_574_ = i_573_ + i_450_;
									int i_575_ = ((i_573_ & 0xff00ff) + (i_450_ & 0xff00ff));
									int i_576_ = ((i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000));
									i_573_ = i_574_ - i_576_ | i_576_ - (i_576_ >>> 8);
									i_576_ = is[i_462_];
									i_574_ = i_573_ + i_576_;
									i_575_ = (i_573_ & 0xff00ff) + (i_576_ & 0xff00ff);
									i_576_ = ((i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000));
									is[i_462_] = i_574_ - i_576_ | i_576_ - (i_576_ >>> 8);
								}
								if (bool_444_ && bool_453_)
									fs[i_462_] = f;
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_569_;
						i_462_ += i_463_;
					}
				} else if (i_449_ == 2) {
					int i_577_ = i_450_ >>> 24;
					int i_578_ = 256 - i_577_;
					int i_579_ = (i_450_ & 0xff00ff) * i_578_ & ~0xff00ff;
					int i_580_ = (i_450_ & 0xff00) * i_578_ & 0xff0000;
					i_450_ = (i_579_ | i_580_) >>> 8;
					int i_581_ = i_454_;
					for (int i_582_ = -i_448_; i_582_ < 0; i_582_++) {
						int i_583_ = ((i_455_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_584_ = -i_447_; i_584_ < 0; i_584_++) {
							if (!bool_444_ || f < fs[i_462_]) {
								int i_585_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_454_ >> 16) + i_583_]);
								if (i_585_ != 0) {
									if (bool) {
										i_579_ = ((i_585_ & 0xff00ff) * i_577_ & ~0xff00ff);
										i_580_ = ((i_585_ & 0xff00) * i_577_ & 0xff0000);
										i_585_ = (((i_579_ | i_580_) >>> 8) + i_450_);
										int i_586_ = is[i_462_];
										int i_587_ = i_585_ + i_586_;
										int i_588_ = ((i_585_ & 0xff00ff) + (i_586_ & 0xff00ff));
										i_586_ = ((i_588_ & 0x1000100) + (i_587_ - i_588_ & 0x10000));
										is[i_462_] = (i_587_ - i_586_ | i_586_ - (i_586_ >>> 8));
									}
									if (bool_444_ && bool_453_)
										fs[i_462_] = f;
								}
							}
							i_454_ += i_458_;
							i_462_++;
						}
						i_455_ += i_459_;
						i_454_ = i_581_;
						i_462_ += i_463_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10053(int[] is, int[] is_589_, int i, int i_590_) {
		int[] is_591_ = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_591_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_592_ = anInt10940;
					while (i_592_ < 0) {
						int i_593_ = i_592_ + i_590_;
						if (i_593_ >= 0) {
							if (i_593_ >= is.length)
								break;
							int i_594_ = anInt10944;
							int i_595_ = anInt10951;
							int i_596_ = anInt10952;
							int i_597_ = anInt10958;
							if (i_595_ >= 0 && i_596_ >= 0 && (i_595_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0 && (i_596_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
								int i_598_ = is[i_593_] - i;
								int i_599_ = -is_589_[i_593_];
								int i_600_ = i_598_ - (i_594_ - anInt10944);
								if (i_600_ > 0) {
									i_594_ += i_600_;
									i_597_ += i_600_;
									i_595_ += anInt10956 * i_600_;
									i_596_ += anInt10946 * i_600_;
								} else
									i_599_ -= i_600_;
								if (i_597_ < i_599_)
									i_597_ = i_599_;
								for (/**/; i_597_ < 0; i_597_++) {
									int i_601_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_596_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_595_ >> 12))]);
									if (i_601_ != 0)
										is_591_[i_594_++] = i_601_;
									else
										i_594_++;
								}
							}
						}
						i_592_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_602_ = anInt10940;
					while (i_602_ < 0) {
						int i_603_ = i_602_ + i_590_;
						if (i_603_ >= 0) {
							if (i_603_ >= is.length)
								break;
							int i_604_ = anInt10944;
							int i_605_ = anInt10951;
							int i_606_ = anInt10952 + anInt10954;
							int i_607_ = anInt10958;
							if (i_605_ >= 0 && (i_605_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
								int i_608_;
								if ((i_608_ = i_606_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
									i_608_ = (anInt10946 - i_608_) / anInt10946;
									i_607_ += i_608_;
									i_606_ += anInt10946 * i_608_;
									i_604_ += i_608_;
								}
								if ((i_608_ = (i_606_ - anInt10946) / anInt10946) > i_607_)
									i_607_ = i_608_;
								int i_609_ = is[i_603_] - i;
								int i_610_ = -is_589_[i_603_];
								int i_611_ = i_609_ - (i_604_ - anInt10944);
								if (i_611_ > 0) {
									i_604_ += i_611_;
									i_607_ += i_611_;
									i_605_ += anInt10956 * i_611_;
									i_606_ += anInt10946 * i_611_;
								} else
									i_610_ -= i_611_;
								if (i_607_ < i_610_)
									i_607_ = i_610_;
								for (/**/; i_607_ < 0; i_607_++) {
									int i_612_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_606_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_605_ >> 12))]);
									if (i_612_ != 0)
										is_591_[i_604_++] = i_612_;
									else
										i_604_++;
									i_606_ += anInt10946;
								}
							}
						}
						i_602_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_613_ = anInt10940;
					while (i_613_ < 0) {
						int i_614_ = i_613_ + i_590_;
						if (i_614_ >= 0) {
							if (i_614_ >= is.length)
								break;
							int i_615_ = anInt10944;
							int i_616_ = anInt10951;
							int i_617_ = anInt10952 + anInt10954;
							int i_618_ = anInt10958;
							if (i_616_ >= 0 && (i_616_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
								if (i_617_ < 0) {
									int i_619_ = ((anInt10946 - 1 - i_617_) / anInt10946);
									i_618_ += i_619_;
									i_617_ += anInt10946 * i_619_;
									i_615_ += i_619_;
								}
								int i_620_;
								if ((i_620_ = (1 + i_617_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_618_)
									i_618_ = i_620_;
								int i_621_ = is[i_614_] - i;
								int i_622_ = -is_589_[i_614_];
								int i_623_ = i_621_ - (i_615_ - anInt10944);
								if (i_623_ > 0) {
									i_615_ += i_623_;
									i_618_ += i_623_;
									i_616_ += anInt10956 * i_623_;
									i_617_ += anInt10946 * i_623_;
								} else
									i_622_ -= i_623_;
								if (i_618_ < i_622_)
									i_618_ = i_622_;
								for (/**/; i_618_ < 0; i_618_++) {
									int i_624_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_617_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_616_ >> 12))]);
									if (i_624_ != 0)
										is_591_[i_615_++] = i_624_;
									else
										i_615_++;
									i_617_ += anInt10946;
								}
							}
						}
						i_613_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_625_ = anInt10940;
					while (i_625_ < 0) {
						int i_626_ = i_625_ + i_590_;
						if (i_626_ >= 0) {
							if (i_626_ >= is.length)
								break;
							int i_627_ = anInt10944;
							int i_628_ = anInt10951 + anInt10953;
							int i_629_ = anInt10952;
							int i_630_ = anInt10958;
							if (i_629_ >= 0 && (i_629_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
								int i_631_;
								if ((i_631_ = i_628_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
									i_631_ = (anInt10956 - i_631_) / anInt10956;
									i_630_ += i_631_;
									i_628_ += anInt10956 * i_631_;
									i_627_ += i_631_;
								}
								if ((i_631_ = (i_628_ - anInt10956) / anInt10956) > i_630_)
									i_630_ = i_631_;
								int i_632_ = is[i_626_] - i;
								int i_633_ = -is_589_[i_626_];
								int i_634_ = i_632_ - (i_627_ - anInt10944);
								if (i_634_ > 0) {
									i_627_ += i_634_;
									i_630_ += i_634_;
									i_628_ += anInt10956 * i_634_;
									i_629_ += anInt10946 * i_634_;
								} else
									i_633_ -= i_634_;
								if (i_630_ < i_633_)
									i_630_ = i_633_;
								for (/**/; i_630_ < 0; i_630_++) {
									int i_635_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_629_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_628_ >> 12))]);
									if (i_635_ != 0)
										is_591_[i_627_++] = i_635_;
									else
										i_627_++;
									i_628_ += anInt10956;
								}
							}
						}
						i_625_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_636_ = anInt10940;
					while (i_636_ < 0) {
						int i_637_ = i_636_ + i_590_;
						if (i_637_ >= 0) {
							if (i_637_ >= is.length)
								break;
							int i_638_ = anInt10944;
							int i_639_ = anInt10951 + anInt10953;
							int i_640_ = anInt10952 + anInt10954;
							int i_641_ = anInt10958;
							int i_642_;
							if ((i_642_ = (i_639_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_642_ = (anInt10956 - i_642_) / anInt10956;
								i_641_ += i_642_;
								i_639_ += anInt10956 * i_642_;
								i_640_ += anInt10946 * i_642_;
								i_638_ += i_642_;
							}
							if ((i_642_ = (i_639_ - anInt10956) / anInt10956) > i_641_)
								i_641_ = i_642_;
							if ((i_642_ = (i_640_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_642_ = (anInt10946 - i_642_) / anInt10946;
								i_641_ += i_642_;
								i_639_ += anInt10956 * i_642_;
								i_640_ += anInt10946 * i_642_;
								i_638_ += i_642_;
							}
							if ((i_642_ = (i_640_ - anInt10946) / anInt10946) > i_641_)
								i_641_ = i_642_;
							int i_643_ = is[i_637_] - i;
							int i_644_ = -is_589_[i_637_];
							int i_645_ = i_643_ - (i_638_ - anInt10944);
							if (i_645_ > 0) {
								i_638_ += i_645_;
								i_641_ += i_645_;
								i_639_ += anInt10956 * i_645_;
								i_640_ += anInt10946 * i_645_;
							} else
								i_644_ -= i_645_;
							if (i_641_ < i_644_)
								i_641_ = i_644_;
							for (/**/; i_641_ < 0; i_641_++) {
								int i_646_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_640_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_639_ >> 12))]);
								if (i_646_ != 0)
									is_591_[i_638_++] = i_646_;
								else
									i_638_++;
								i_639_ += anInt10956;
								i_640_ += anInt10946;
							}
						}
						i_636_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_647_ = anInt10940;
					while (i_647_ < 0) {
						int i_648_ = i_647_ + i_590_;
						if (i_648_ >= 0) {
							if (i_648_ >= is.length)
								break;
							int i_649_ = anInt10944;
							int i_650_ = anInt10951 + anInt10953;
							int i_651_ = anInt10952 + anInt10954;
							int i_652_ = anInt10958;
							int i_653_;
							if ((i_653_ = (i_650_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_653_ = (anInt10956 - i_653_) / anInt10956;
								i_652_ += i_653_;
								i_650_ += anInt10956 * i_653_;
								i_651_ += anInt10946 * i_653_;
								i_649_ += i_653_;
							}
							if ((i_653_ = (i_650_ - anInt10956) / anInt10956) > i_652_)
								i_652_ = i_653_;
							if (i_651_ < 0) {
								i_653_ = (anInt10946 - 1 - i_651_) / anInt10946;
								i_652_ += i_653_;
								i_650_ += anInt10956 * i_653_;
								i_651_ += anInt10946 * i_653_;
								i_649_ += i_653_;
							}
							if ((i_653_ = (1 + i_651_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_652_)
								i_652_ = i_653_;
							int i_654_ = is[i_648_] - i;
							int i_655_ = -is_589_[i_648_];
							int i_656_ = i_654_ - (i_649_ - anInt10944);
							if (i_656_ > 0) {
								i_649_ += i_656_;
								i_652_ += i_656_;
								i_650_ += anInt10956 * i_656_;
								i_651_ += anInt10946 * i_656_;
							} else
								i_655_ -= i_656_;
							if (i_652_ < i_655_)
								i_652_ = i_655_;
							for (/**/; i_652_ < 0; i_652_++) {
								int i_657_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_651_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_650_ >> 12))]);
								if (i_657_ != 0)
									is_591_[i_649_++] = i_657_;
								else
									i_649_++;
								i_650_ += anInt10956;
								i_651_ += anInt10946;
							}
						}
						i_647_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_658_ = anInt10940;
				while (i_658_ < 0) {
					int i_659_ = i_658_ + i_590_;
					if (i_659_ >= 0) {
						if (i_659_ >= is.length)
							break;
						int i_660_ = anInt10944;
						int i_661_ = anInt10951 + anInt10953;
						int i_662_ = anInt10952;
						int i_663_ = anInt10958;
						if (i_662_ >= 0 && i_662_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
							if (i_661_ < 0) {
								int i_664_ = (anInt10956 - 1 - i_661_) / anInt10956;
								i_663_ += i_664_;
								i_661_ += anInt10956 * i_664_;
								i_660_ += i_664_;
							}
							int i_665_;
							if ((i_665_ = (1 + i_661_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_663_)
								i_663_ = i_665_;
							int i_666_ = is[i_659_] - i;
							int i_667_ = -is_589_[i_659_];
							int i_668_ = i_666_ - (i_660_ - anInt10944);
							if (i_668_ > 0) {
								i_660_ += i_668_;
								i_663_ += i_668_;
								i_661_ += anInt10956 * i_668_;
								i_662_ += anInt10946 * i_668_;
							} else
								i_667_ -= i_668_;
							if (i_663_ < i_667_)
								i_663_ = i_667_;
							for (/**/; i_663_ < 0; i_663_++) {
								int i_669_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_662_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_661_ >> 12))]);
								if (i_669_ != 0)
									is_591_[i_660_++] = i_669_;
								else
									i_660_++;
								i_661_ += anInt10956;
							}
						}
					}
					i_658_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_670_ = anInt10940;
				while (i_670_ < 0) {
					int i_671_ = i_670_ + i_590_;
					if (i_671_ >= 0) {
						if (i_671_ >= is.length)
							break;
						int i_672_ = anInt10944;
						int i_673_ = anInt10951 + anInt10953;
						int i_674_ = anInt10952 + anInt10954;
						int i_675_ = anInt10958;
						if (i_673_ < 0) {
							int i_676_ = (anInt10956 - 1 - i_673_) / anInt10956;
							i_675_ += i_676_;
							i_673_ += anInt10956 * i_676_;
							i_674_ += anInt10946 * i_676_;
							i_672_ += i_676_;
						}
						int i_677_;
						if ((i_677_ = (1 + i_673_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_675_)
							i_675_ = i_677_;
						if ((i_677_ = i_674_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
							i_677_ = (anInt10946 - i_677_) / anInt10946;
							i_675_ += i_677_;
							i_673_ += anInt10956 * i_677_;
							i_674_ += anInt10946 * i_677_;
							i_672_ += i_677_;
						}
						if ((i_677_ = (i_674_ - anInt10946) / anInt10946) > i_675_)
							i_675_ = i_677_;
						int i_678_ = is[i_671_] - i;
						int i_679_ = -is_589_[i_671_];
						int i_680_ = i_678_ - (i_672_ - anInt10944);
						if (i_680_ > 0) {
							i_672_ += i_680_;
							i_675_ += i_680_;
							i_673_ += anInt10956 * i_680_;
							i_674_ += anInt10946 * i_680_;
						} else
							i_679_ -= i_680_;
						if (i_675_ < i_679_)
							i_675_ = i_679_;
						for (/**/; i_675_ < 0; i_675_++) {
							int i_681_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_674_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_673_ >> 12))]);
							if (i_681_ != 0)
								is_591_[i_672_++] = i_681_;
							else
								i_672_++;
							i_673_ += anInt10956;
							i_674_ += anInt10946;
						}
					}
					i_670_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				int i_682_ = anInt10940;
				while (i_682_ < 0) {
					int i_683_ = i_682_ + i_590_;
					if (i_683_ >= 0) {
						if (i_683_ >= is.length)
							break;
						int i_684_ = anInt10944;
						int i_685_ = anInt10951 + anInt10953;
						int i_686_ = anInt10952 + anInt10954;
						int i_687_ = anInt10958;
						if (i_685_ < 0) {
							int i_688_ = (anInt10956 - 1 - i_685_) / anInt10956;
							i_687_ += i_688_;
							i_685_ += anInt10956 * i_688_;
							i_686_ += anInt10946 * i_688_;
							i_684_ += i_688_;
						}
						int i_689_;
						if ((i_689_ = (1 + i_685_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_687_)
							i_687_ = i_689_;
						if (i_686_ < 0) {
							i_689_ = (anInt10946 - 1 - i_686_) / anInt10946;
							i_687_ += i_689_;
							i_685_ += anInt10956 * i_689_;
							i_686_ += anInt10946 * i_689_;
							i_684_ += i_689_;
						}
						if ((i_689_ = (1 + i_686_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_687_)
							i_687_ = i_689_;
						int i_690_ = is[i_683_] - i;
						int i_691_ = -is_589_[i_683_];
						int i_692_ = i_690_ - (i_684_ - anInt10944);
						if (i_692_ > 0) {
							i_684_ += i_692_;
							i_687_ += i_692_;
							i_685_ += anInt10956 * i_692_;
							i_686_ += anInt10946 * i_692_;
						} else
							i_691_ -= i_692_;
						if (i_687_ < i_691_)
							i_687_ = i_691_;
						for (/**/; i_687_ < 0; i_687_++) {
							int i_693_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_686_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_685_ >> 12))]);
							if (i_693_ != 0)
								is_591_[i_684_++] = i_693_;
							else
								i_684_++;
							i_685_ += anInt10956;
							i_686_ += anInt10946;
						}
					}
					i_682_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10058(int i, int i_694_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_695_ = anInt10940;
					while (i_695_ < 0) {
						int i_696_ = anInt10944;
						int i_697_ = anInt10951;
						int i_698_ = anInt10952;
						int i_699_ = anInt10958;
						if (i_697_ >= 0 && i_698_ >= 0 && i_697_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0 && i_698_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
							for (/**/; i_699_ < 0; i_699_++)
								method10181(((i_698_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_697_ >> 12), i_696_++, is, i, i_694_);
						}
						i_695_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_700_ = anInt10940;
					while (i_700_ < 0) {
						int i_701_ = anInt10944;
						int i_702_ = anInt10951;
						int i_703_ = anInt10952 + anInt10954;
						int i_704_ = anInt10958;
						if (i_702_ >= 0 && i_702_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0) {
							int i_705_;
							if ((i_705_ = (i_703_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_705_ = (anInt10946 - i_705_) / anInt10946;
								i_704_ += i_705_;
								i_703_ += anInt10946 * i_705_;
								i_701_ += i_705_;
							}
							if ((i_705_ = (i_703_ - anInt10946) / anInt10946) > i_704_)
								i_704_ = i_705_;
							for (/**/; i_704_ < 0; i_704_++) {
								method10181(((i_703_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_702_ >> 12), i_701_++, is, i, i_694_);
								i_703_ += anInt10946;
							}
						}
						i_700_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_706_ = anInt10940;
					while (i_706_ < 0) {
						int i_707_ = anInt10944;
						int i_708_ = anInt10951;
						int i_709_ = anInt10952 + anInt10954;
						int i_710_ = anInt10958;
						if (i_708_ >= 0 && i_708_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0) {
							if (i_709_ < 0) {
								int i_711_ = (anInt10946 - 1 - i_709_) / anInt10946;
								i_710_ += i_711_;
								i_709_ += anInt10946 * i_711_;
								i_707_ += i_711_;
							}
							int i_712_;
							if ((i_712_ = (1 + i_709_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_710_)
								i_710_ = i_712_;
							for (/**/; i_710_ < 0; i_710_++) {
								method10181(((i_709_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_708_ >> 12), i_707_++, is, i, i_694_);
								i_709_ += anInt10946;
							}
						}
						i_706_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_713_ = anInt10940;
					while (i_713_ < 0) {
						int i_714_ = anInt10944;
						int i_715_ = anInt10951 + anInt10953;
						int i_716_ = anInt10952;
						int i_717_ = anInt10958;
						if (i_716_ >= 0 && i_716_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
							int i_718_;
							if ((i_718_ = (i_715_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_718_ = (anInt10956 - i_718_) / anInt10956;
								i_717_ += i_718_;
								i_715_ += anInt10956 * i_718_;
								i_714_ += i_718_;
							}
							if ((i_718_ = (i_715_ - anInt10956) / anInt10956) > i_717_)
								i_717_ = i_718_;
							for (/**/; i_717_ < 0; i_717_++) {
								method10181(((i_716_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_715_ >> 12), i_714_++, is, i, i_694_);
								i_715_ += anInt10956;
							}
						}
						i_713_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_719_ = anInt10940;
					while (i_719_ < 0) {
						int i_720_ = anInt10944;
						int i_721_ = anInt10951 + anInt10953;
						int i_722_ = anInt10952 + anInt10954;
						int i_723_ = anInt10958;
						int i_724_;
						if ((i_724_ = i_721_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) >= 0) {
							i_724_ = (anInt10956 - i_724_) / anInt10956;
							i_723_ += i_724_;
							i_721_ += anInt10956 * i_724_;
							i_722_ += anInt10946 * i_724_;
							i_720_ += i_724_;
						}
						if ((i_724_ = (i_721_ - anInt10956) / anInt10956) > i_723_)
							i_723_ = i_724_;
						if ((i_724_ = i_722_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
							i_724_ = (anInt10946 - i_724_) / anInt10946;
							i_723_ += i_724_;
							i_721_ += anInt10956 * i_724_;
							i_722_ += anInt10946 * i_724_;
							i_720_ += i_724_;
						}
						if ((i_724_ = (i_722_ - anInt10946) / anInt10946) > i_723_)
							i_723_ = i_724_;
						for (/**/; i_723_ < 0; i_723_++) {
							method10181(((i_722_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_721_ >> 12)), i_720_++, is, i, i_694_);
							i_721_ += anInt10956;
							i_722_ += anInt10946;
						}
						i_719_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_725_ = anInt10940;
					while (i_725_ < 0) {
						int i_726_ = anInt10944;
						int i_727_ = anInt10951 + anInt10953;
						int i_728_ = anInt10952 + anInt10954;
						int i_729_ = anInt10958;
						int i_730_;
						if ((i_730_ = i_727_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) >= 0) {
							i_730_ = (anInt10956 - i_730_) / anInt10956;
							i_729_ += i_730_;
							i_727_ += anInt10956 * i_730_;
							i_728_ += anInt10946 * i_730_;
							i_726_ += i_730_;
						}
						if ((i_730_ = (i_727_ - anInt10956) / anInt10956) > i_729_)
							i_729_ = i_730_;
						if (i_728_ < 0) {
							i_730_ = (anInt10946 - 1 - i_728_) / anInt10946;
							i_729_ += i_730_;
							i_727_ += anInt10956 * i_730_;
							i_728_ += anInt10946 * i_730_;
							i_726_ += i_730_;
						}
						if ((i_730_ = (1 + i_728_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_729_)
							i_729_ = i_730_;
						for (/**/; i_729_ < 0; i_729_++) {
							method10181(((i_728_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_727_ >> 12)), i_726_++, is, i, i_694_);
							i_727_ += anInt10956;
							i_728_ += anInt10946;
						}
						i_725_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_731_ = anInt10940;
				while (i_731_ < 0) {
					int i_732_ = anInt10944;
					int i_733_ = anInt10951 + anInt10953;
					int i_734_ = anInt10952;
					int i_735_ = anInt10958;
					if (i_734_ >= 0 && i_734_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
						if (i_733_ < 0) {
							int i_736_ = (anInt10956 - 1 - i_733_) / anInt10956;
							i_735_ += i_736_;
							i_733_ += anInt10956 * i_736_;
							i_732_ += i_736_;
						}
						int i_737_;
						if ((i_737_ = (1 + i_733_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_735_)
							i_735_ = i_737_;
						for (/**/; i_735_ < 0; i_735_++) {
							method10181(((i_734_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_733_ >> 12)), i_732_++, is, i, i_694_);
							i_733_ += anInt10956;
						}
					}
					i_731_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_738_ = anInt10940; i_738_ < 0; i_738_++) {
					int i_739_ = anInt10944;
					int i_740_ = anInt10951 + anInt10953;
					int i_741_ = anInt10952 + anInt10954;
					int i_742_ = anInt10958;
					if (i_740_ < 0) {
						int i_743_ = (anInt10956 - 1 - i_740_) / anInt10956;
						i_742_ += i_743_;
						i_740_ += anInt10956 * i_743_;
						i_741_ += anInt10946 * i_743_;
						i_739_ += i_743_;
					}
					int i_744_;
					if ((i_744_ = (1 + i_740_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_742_)
						i_742_ = i_744_;
					if ((i_744_ = i_741_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
						i_744_ = (anInt10946 - i_744_) / anInt10946;
						i_742_ += i_744_;
						i_740_ += anInt10956 * i_744_;
						i_741_ += anInt10946 * i_744_;
						i_739_ += i_744_;
					}
					if ((i_744_ = (i_741_ - anInt10946) / anInt10946) > i_742_)
						i_742_ = i_744_;
					for (/**/; i_742_ < 0; i_742_++) {
						method10181((((i_741_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_740_ >> 12)), i_739_++, is, i, i_694_);
						i_740_ += anInt10956;
						i_741_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_745_ = anInt10940; i_745_ < 0; i_745_++) {
					int i_746_ = anInt10944;
					int i_747_ = anInt10951 + anInt10953;
					int i_748_ = anInt10952 + anInt10954;
					int i_749_ = anInt10958;
					if (i_747_ < 0) {
						int i_750_ = (anInt10956 - 1 - i_747_) / anInt10956;
						i_749_ += i_750_;
						i_747_ += anInt10956 * i_750_;
						i_748_ += anInt10946 * i_750_;
						i_746_ += i_750_;
					}
					int i_751_;
					if ((i_751_ = (1 + i_747_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_749_)
						i_749_ = i_751_;
					if (i_748_ < 0) {
						i_751_ = (anInt10946 - 1 - i_748_) / anInt10946;
						i_749_ += i_751_;
						i_747_ += anInt10956 * i_751_;
						i_748_ += anInt10946 * i_751_;
						i_746_ += i_751_;
					}
					if ((i_751_ = (1 + i_748_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_749_)
						i_749_ = i_751_;
					for (/**/; i_749_ < 0; i_749_++) {
						method10181((((i_748_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_747_ >> 12)), i_746_++, is, i, i_694_);
						i_747_ += anInt10956;
						i_748_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10057(int i, int i_752_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_753_ = anInt10940;
					while (i_753_ < 0) {
						int i_754_ = anInt10944;
						int i_755_ = anInt10951;
						int i_756_ = anInt10952;
						int i_757_ = anInt10958;
						if (i_755_ >= 0 && i_756_ >= 0 && i_755_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0 && i_756_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
							for (/**/; i_757_ < 0; i_757_++)
								method10181(((i_756_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_755_ >> 12), i_754_++, is, i, i_752_);
						}
						i_753_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_758_ = anInt10940;
					while (i_758_ < 0) {
						int i_759_ = anInt10944;
						int i_760_ = anInt10951;
						int i_761_ = anInt10952 + anInt10954;
						int i_762_ = anInt10958;
						if (i_760_ >= 0 && i_760_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0) {
							int i_763_;
							if ((i_763_ = (i_761_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_763_ = (anInt10946 - i_763_) / anInt10946;
								i_762_ += i_763_;
								i_761_ += anInt10946 * i_763_;
								i_759_ += i_763_;
							}
							if ((i_763_ = (i_761_ - anInt10946) / anInt10946) > i_762_)
								i_762_ = i_763_;
							for (/**/; i_762_ < 0; i_762_++) {
								method10181(((i_761_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_760_ >> 12), i_759_++, is, i, i_752_);
								i_761_ += anInt10946;
							}
						}
						i_758_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_764_ = anInt10940;
					while (i_764_ < 0) {
						int i_765_ = anInt10944;
						int i_766_ = anInt10951;
						int i_767_ = anInt10952 + anInt10954;
						int i_768_ = anInt10958;
						if (i_766_ >= 0 && i_766_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) < 0) {
							if (i_767_ < 0) {
								int i_769_ = (anInt10946 - 1 - i_767_) / anInt10946;
								i_768_ += i_769_;
								i_767_ += anInt10946 * i_769_;
								i_765_ += i_769_;
							}
							int i_770_;
							if ((i_770_ = (1 + i_767_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_768_)
								i_768_ = i_770_;
							for (/**/; i_768_ < 0; i_768_++) {
								method10181(((i_767_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_766_ >> 12), i_765_++, is, i, i_752_);
								i_767_ += anInt10946;
							}
						}
						i_764_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_771_ = anInt10940;
					while (i_771_ < 0) {
						int i_772_ = anInt10944;
						int i_773_ = anInt10951 + anInt10953;
						int i_774_ = anInt10952;
						int i_775_ = anInt10958;
						if (i_774_ >= 0 && i_774_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
							int i_776_;
							if ((i_776_ = (i_773_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_776_ = (anInt10956 - i_776_) / anInt10956;
								i_775_ += i_776_;
								i_773_ += anInt10956 * i_776_;
								i_772_ += i_776_;
							}
							if ((i_776_ = (i_773_ - anInt10956) / anInt10956) > i_775_)
								i_775_ = i_776_;
							for (/**/; i_775_ < 0; i_775_++) {
								method10181(((i_774_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_773_ >> 12), i_772_++, is, i, i_752_);
								i_773_ += anInt10956;
							}
						}
						i_771_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_777_ = anInt10940;
					while (i_777_ < 0) {
						int i_778_ = anInt10944;
						int i_779_ = anInt10951 + anInt10953;
						int i_780_ = anInt10952 + anInt10954;
						int i_781_ = anInt10958;
						int i_782_;
						if ((i_782_ = i_779_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) >= 0) {
							i_782_ = (anInt10956 - i_782_) / anInt10956;
							i_781_ += i_782_;
							i_779_ += anInt10956 * i_782_;
							i_780_ += anInt10946 * i_782_;
							i_778_ += i_782_;
						}
						if ((i_782_ = (i_779_ - anInt10956) / anInt10956) > i_781_)
							i_781_ = i_782_;
						if ((i_782_ = i_780_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
							i_782_ = (anInt10946 - i_782_) / anInt10946;
							i_781_ += i_782_;
							i_779_ += anInt10956 * i_782_;
							i_780_ += anInt10946 * i_782_;
							i_778_ += i_782_;
						}
						if ((i_782_ = (i_780_ - anInt10946) / anInt10946) > i_781_)
							i_781_ = i_782_;
						for (/**/; i_781_ < 0; i_781_++) {
							method10181(((i_780_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_779_ >> 12)), i_778_++, is, i, i_752_);
							i_779_ += anInt10956;
							i_780_ += anInt10946;
						}
						i_777_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_783_ = anInt10940;
					while (i_783_ < 0) {
						int i_784_ = anInt10944;
						int i_785_ = anInt10951 + anInt10953;
						int i_786_ = anInt10952 + anInt10954;
						int i_787_ = anInt10958;
						int i_788_;
						if ((i_788_ = i_785_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) >= 0) {
							i_788_ = (anInt10956 - i_788_) / anInt10956;
							i_787_ += i_788_;
							i_785_ += anInt10956 * i_788_;
							i_786_ += anInt10946 * i_788_;
							i_784_ += i_788_;
						}
						if ((i_788_ = (i_785_ - anInt10956) / anInt10956) > i_787_)
							i_787_ = i_788_;
						if (i_786_ < 0) {
							i_788_ = (anInt10946 - 1 - i_786_) / anInt10946;
							i_787_ += i_788_;
							i_785_ += anInt10956 * i_788_;
							i_786_ += anInt10946 * i_788_;
							i_784_ += i_788_;
						}
						if ((i_788_ = (1 + i_786_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_787_)
							i_787_ = i_788_;
						for (/**/; i_787_ < 0; i_787_++) {
							method10181(((i_786_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_785_ >> 12)), i_784_++, is, i, i_752_);
							i_785_ += anInt10956;
							i_786_ += anInt10946;
						}
						i_783_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_789_ = anInt10940;
				while (i_789_ < 0) {
					int i_790_ = anInt10944;
					int i_791_ = anInt10951 + anInt10953;
					int i_792_ = anInt10952;
					int i_793_ = anInt10958;
					if (i_792_ >= 0 && i_792_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
						if (i_791_ < 0) {
							int i_794_ = (anInt10956 - 1 - i_791_) / anInt10956;
							i_793_ += i_794_;
							i_791_ += anInt10956 * i_794_;
							i_790_ += i_794_;
						}
						int i_795_;
						if ((i_795_ = (1 + i_791_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_793_)
							i_793_ = i_795_;
						for (/**/; i_793_ < 0; i_793_++) {
							method10181(((i_792_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945 + (i_791_ >> 12)), i_790_++, is, i, i_752_);
							i_791_ += anInt10956;
						}
					}
					i_789_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_796_ = anInt10940; i_796_ < 0; i_796_++) {
					int i_797_ = anInt10944;
					int i_798_ = anInt10951 + anInt10953;
					int i_799_ = anInt10952 + anInt10954;
					int i_800_ = anInt10958;
					if (i_798_ < 0) {
						int i_801_ = (anInt10956 - 1 - i_798_) / anInt10956;
						i_800_ += i_801_;
						i_798_ += anInt10956 * i_801_;
						i_799_ += anInt10946 * i_801_;
						i_797_ += i_801_;
					}
					int i_802_;
					if ((i_802_ = (1 + i_798_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_800_)
						i_800_ = i_802_;
					if ((i_802_ = i_799_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
						i_802_ = (anInt10946 - i_802_) / anInt10946;
						i_800_ += i_802_;
						i_798_ += anInt10956 * i_802_;
						i_799_ += anInt10946 * i_802_;
						i_797_ += i_802_;
					}
					if ((i_802_ = (i_799_ - anInt10946) / anInt10946) > i_800_)
						i_800_ = i_802_;
					for (/**/; i_800_ < 0; i_800_++) {
						method10181((((i_799_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_798_ >> 12)), i_797_++, is, i, i_752_);
						i_798_ += anInt10956;
						i_799_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_803_ = anInt10940; i_803_ < 0; i_803_++) {
					int i_804_ = anInt10944;
					int i_805_ = anInt10951 + anInt10953;
					int i_806_ = anInt10952 + anInt10954;
					int i_807_ = anInt10958;
					if (i_805_ < 0) {
						int i_808_ = (anInt10956 - 1 - i_805_) / anInt10956;
						i_807_ += i_808_;
						i_805_ += anInt10956 * i_808_;
						i_806_ += anInt10946 * i_808_;
						i_804_ += i_808_;
					}
					int i_809_;
					if ((i_809_ = (1 + i_805_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_807_)
						i_807_ = i_809_;
					if (i_806_ < 0) {
						i_809_ = (anInt10946 - 1 - i_806_) / anInt10946;
						i_807_ += i_809_;
						i_805_ += anInt10956 * i_809_;
						i_806_ += anInt10946 * i_809_;
						i_804_ += i_809_;
					}
					if ((i_809_ = (1 + i_806_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_807_)
						i_807_ = i_809_;
					for (/**/; i_807_ < 0; i_807_++) {
						method10181((((i_806_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_805_ >> 12)), i_804_++, is, i, i_752_);
						i_805_ += anInt10956;
						i_806_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10181(int i, int i_810_, int[] is, int i_811_, int i_812_) {
		if (i_812_ == 0) {
			if (i_811_ == 1)
				is[i_810_] = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
			else if (i_811_ == 0) {
				int i_813_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i++];
				int i_814_ = (i_813_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_815_ = (i_813_ & 0xff00) * anInt10959 & 0xff0000;
				int i_816_ = (i_813_ & 0xff) * anInt10960 & 0xff00;
				is[i_810_] = (i_814_ | i_815_ | i_816_) >>> 8;
			} else if (i_811_ == 3) {
				int i_817_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i++];
				int i_818_ = anInt10928;
				int i_819_ = i_817_ + i_818_;
				int i_820_ = (i_817_ & 0xff00ff) + (i_818_ & 0xff00ff);
				int i_821_ = (i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000);
				is[i_810_] = i_819_ - i_821_ | i_821_ - (i_821_ >>> 8);
			} else if (i_811_ == 2) {
				int i_822_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_823_ = (i_822_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_824_ = (i_822_ & 0xff00) * anInt10934 & 0xff0000;
				is[i_810_] = ((i_823_ | i_824_) >>> 8) + anInt10963;
			} else
				throw new IllegalArgumentException();
		} else if (i_812_ == 1) {
			if (i_811_ == 1) {
				int i_825_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_825_ != 0)
					is[i_810_] = i_825_;
			} else if (i_811_ == 0) {
				int i_826_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_826_ != 0) {
					if ((anInt10928 & 0xffffff) == 16777215) {
						int i_827_ = anInt10928 >>> 24;
						int i_828_ = 256 - i_827_;
						int i_829_ = is[i_810_];
						is[i_810_] = ((((i_826_ & 0xff00ff) * i_827_ + (i_829_ & 0xff00ff) * i_828_) & ~0xff00ff) + (((i_826_ & 0xff00) * i_827_ + (i_829_ & 0xff00) * i_828_) & 0xff0000)) >> 8;
					} else if (anInt10934 != 255) {
						int i_830_ = (i_826_ & 0xff0000) * anInt10955 & ~0xffffff;
						int i_831_ = (i_826_ & 0xff00) * anInt10959 & 0xff0000;
						int i_832_ = (i_826_ & 0xff) * anInt10960 & 0xff00;
						i_826_ = (i_830_ | i_831_ | i_832_) >>> 8;
						int i_833_ = is[i_810_];
						is[i_810_] = ((((i_826_ & 0xff00ff) * anInt10934 + (i_833_ & 0xff00ff) * anInt10957) & ~0xff00ff) + (((i_826_ & 0xff00) * anInt10934 + (i_833_ & 0xff00) * anInt10957) & 0xff0000)) >> 8;
					} else {
						int i_834_ = (i_826_ & 0xff0000) * anInt10955 & ~0xffffff;
						int i_835_ = (i_826_ & 0xff00) * anInt10959 & 0xff0000;
						int i_836_ = (i_826_ & 0xff) * anInt10960 & 0xff00;
						is[i_810_] = (i_834_ | i_835_ | i_836_) >>> 8;
					}
				}
			} else if (i_811_ == 3) {
				int i_837_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_838_ = anInt10928;
				int i_839_ = i_837_ + i_838_;
				int i_840_ = (i_837_ & 0xff00ff) + (i_838_ & 0xff00ff);
				int i_841_ = (i_840_ & 0x1000100) + (i_839_ - i_840_ & 0x10000);
				i_841_ = i_839_ - i_841_ | i_841_ - (i_841_ >>> 8);
				if (i_837_ == 0 && anInt10934 != 255) {
					i_837_ = i_841_;
					i_841_ = is[i_810_];
					i_841_ = ((((i_837_ & 0xff00ff) * anInt10934 + (i_841_ & 0xff00ff) * anInt10957) & ~0xff00ff) + (((i_837_ & 0xff00) * anInt10934 + (i_841_ & 0xff00) * anInt10957) & 0xff0000)) >> 8;
				}
				is[i_810_] = i_841_;
			} else if (i_811_ == 2) {
				int i_842_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_842_ != 0) {
					int i_843_ = (i_842_ & 0xff00ff) * anInt10934 & ~0xff00ff;
					int i_844_ = (i_842_ & 0xff00) * anInt10934 & 0xff0000;
					is[i_810_++] = ((i_843_ | i_844_) >>> 8) + anInt10963;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_812_ == 2) {
			if (i_811_ == 1) {
				int i_845_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_845_ != 0) {
					int i_846_ = is[i_810_];
					int i_847_ = i_845_ + i_846_;
					int i_848_ = (i_845_ & 0xff00ff) + (i_846_ & 0xff00ff);
					i_846_ = (i_848_ & 0x1000100) + (i_847_ - i_848_ & 0x10000);
					is[i_810_] = i_847_ - i_846_ | i_846_ - (i_846_ >>> 8);
				}
			} else if (i_811_ == 0) {
				int i_849_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_849_ != 0) {
					int i_850_ = (i_849_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_851_ = (i_849_ & 0xff00) * anInt10959 & 0xff0000;
					int i_852_ = (i_849_ & 0xff) * anInt10960 & 0xff00;
					i_849_ = (i_850_ | i_851_ | i_852_) >>> 8;
					int i_853_ = is[i_810_];
					int i_854_ = i_849_ + i_853_;
					int i_855_ = (i_849_ & 0xff00ff) + (i_853_ & 0xff00ff);
					i_853_ = (i_855_ & 0x1000100) + (i_854_ - i_855_ & 0x10000);
					is[i_810_] = i_854_ - i_853_ | i_853_ - (i_853_ >>> 8);
				}
			} else if (i_811_ == 3) {
				int i_856_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_857_ = anInt10928;
				int i_858_ = i_856_ + i_857_;
				int i_859_ = (i_856_ & 0xff00ff) + (i_857_ & 0xff00ff);
				int i_860_ = (i_859_ & 0x1000100) + (i_858_ - i_859_ & 0x10000);
				i_856_ = i_858_ - i_860_ | i_860_ - (i_860_ >>> 8);
				i_860_ = is[i_810_];
				i_858_ = i_856_ + i_860_;
				i_859_ = (i_856_ & 0xff00ff) + (i_860_ & 0xff00ff);
				i_860_ = (i_859_ & 0x1000100) + (i_858_ - i_859_ & 0x10000);
				is[i_810_] = i_858_ - i_860_ | i_860_ - (i_860_ >>> 8);
			} else if (i_811_ == 2) {
				int i_861_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_861_ != 0) {
					int i_862_ = (i_861_ & 0xff00ff) * anInt10934 & ~0xff00ff;
					int i_863_ = (i_861_ & 0xff00) * anInt10934 & 0xff0000;
					i_861_ = ((i_862_ | i_863_) >>> 8) + anInt10963;
					int i_864_ = is[i_810_];
					int i_865_ = i_861_ + i_864_;
					int i_866_ = (i_861_ & 0xff00ff) + (i_864_ & 0xff00ff);
					i_864_ = (i_866_ & 0x1000100) + (i_865_ - i_866_ & 0x10000);
					is[i_810_] = i_865_ - i_864_ | i_864_ - (i_864_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	void method10182(int i, int i_867_, int i_868_, int i_869_, int[] is, int i_870_, int i_871_) {
		i_871_ -= i_868_;
		for (int i_872_ = 0; i_872_ < i_869_; i_872_++) {
			int i_873_ = (i_867_ + i_872_) * i_868_ + i;
			for (int i_874_ = 0; i_874_ < i_868_; i_874_++)
				is[i_870_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_873_ + i_874_]);
			i_870_ += i_871_;
		}
	}

	void method10183(int i, int i_875_, int i_876_, int i_877_, int[] is, int i_878_, int i_879_) {
		i_879_ -= i_876_;
		for (int i_880_ = 0; i_880_ < i_877_; i_880_++) {
			int i_881_ = (i_875_ + i_880_) * i_876_ + i;
			for (int i_882_ = 0; i_882_ < i_876_; i_882_++)
				is[i_878_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_881_ + i_882_]);
			i_878_ += i_879_;
		}
	}

	public void method2611(int i, int i_883_, int i_884_, int i_885_, int[] is, int[] is_886_, int i_887_, int i_888_) {
		method10184(i, i_883_, i_884_, i_885_, is, i_887_, i_888_);
	}

	public void method2612(int i, int i_889_, int i_890_, int i_891_, int i_892_, int i_893_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_894_ = 0; i_894_ < i_891_; i_894_++) {
			int i_895_ = ((i_889_ + i_894_) * ((Class161_Sub3_Sub2) this).anInt10945 + i);
			int i_896_ = (((i_893_ + i_894_) * (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i_892_);
			for (int i_897_ = 0; i_897_ < i_890_; i_897_++)
				((Class161_Sub3_Sub2) this).anIntArray11237[i_895_ + i_897_] = is[i_896_ + i_897_];
		}
	}

	public void method2613(int i, int i_898_, int i_899_, int i_900_, int i_901_, int i_902_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_903_ = 0; i_903_ < i_900_; i_903_++) {
			int i_904_ = ((i_898_ + i_903_) * ((Class161_Sub3_Sub2) this).anInt10945 + i);
			int i_905_ = (((i_902_ + i_903_) * (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i_901_);
			for (int i_906_ = 0; i_906_ < i_899_; i_906_++)
				((Class161_Sub3_Sub2) this).anIntArray11237[i_904_ + i_906_] = is[i_905_ + i_906_];
		}
	}

	public void method2601(int i, int i_907_, int i_908_) {
		throw new IllegalStateException("");
	}

	public Interface6 method2590() {
		return new Class198(((Class161_Sub3_Sub2) this).anInt10945, ((Class161_Sub3_Sub2) this).anInt10930, ((Class161_Sub3_Sub2) this).anIntArray11237);
	}

	public Interface6 method2616() {
		return new Class198(((Class161_Sub3_Sub2) this).anInt10945, ((Class161_Sub3_Sub2) this).anInt10930, ((Class161_Sub3_Sub2) this).anIntArray11237);
	}

	public Interface6 method2642() {
		return new Class198(((Class161_Sub3_Sub2) this).anInt10945, ((Class161_Sub3_Sub2) this).anInt10930, ((Class161_Sub3_Sub2) this).anIntArray11237);
	}

	public void method2607(int i, int i_909_, int i_910_, int i_911_, int i_912_, int i_913_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_914_ = 0; i_914_ < i_911_; i_914_++) {
			int i_915_ = ((i_909_ + i_914_) * ((Class161_Sub3_Sub2) this).anInt10945 + i);
			int i_916_ = (((i_913_ + i_914_) * (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i_912_);
			for (int i_917_ = 0; i_917_ < i_910_; i_917_++)
				((Class161_Sub3_Sub2) this).anIntArray11237[i_915_ + i_917_] = is[i_916_ + i_917_];
		}
	}

	public void method2618(int i, int i_918_, int i_919_, int i_920_, int i_921_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_922_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_918_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_923_ = i_918_ * i_922_ + i;
			int i_924_ = 0;
			int i_925_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_926_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_927_ = i_922_ - i_926_;
			int i_928_ = 0;
			if (i_918_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_929_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_918_);
				i_925_ -= i_929_;
				i_918_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_924_ += i_929_ * i_926_;
				i_923_ += i_929_ * i_922_;
			}
			if (i_918_ + i_925_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_925_ -= (i_918_ + i_925_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_930_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_926_ -= i_930_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_924_ += i_930_;
				i_923_ += i_930_;
				i_928_ += i_930_;
				i_927_ += i_930_;
			}
			if (i + i_926_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_931_ = (i + i_926_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_926_ -= i_931_;
				i_928_ += i_931_;
				i_927_ += i_931_;
			}
			if (i_926_ > 0 && i_925_ > 0) {
				if (i_921_ == 0) {
					if (i_919_ == 1) {
						for (int i_932_ = -i_925_; i_932_ < 0; i_932_++) {
							int i_933_ = i_923_ + i_926_ - 3;
							while (i_923_ < i_933_) {
								is[i_923_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								is[i_923_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								is[i_923_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								is[i_923_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
							}
							i_933_ += 3;
							while (i_923_ < i_933_)
								is[i_923_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 0) {
						int i_934_ = (i_920_ & 0xff0000) >> 16;
						int i_935_ = (i_920_ & 0xff00) >> 8;
						int i_936_ = i_920_ & 0xff;
						for (int i_937_ = -i_925_; i_937_ < 0; i_937_++) {
							for (int i_938_ = -i_926_; i_938_ < 0; i_938_++) {
								int i_939_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								int i_940_ = (i_939_ & 0xff0000) * i_934_ & ~0xffffff;
								int i_941_ = (i_939_ & 0xff00) * i_935_ & 0xff0000;
								int i_942_ = (i_939_ & 0xff) * i_936_ & 0xff00;
								is[i_923_++] = (i_940_ | i_941_ | i_942_) >>> 8;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 3) {
						for (int i_943_ = -i_925_; i_943_ < 0; i_943_++) {
							for (int i_944_ = -i_926_; i_944_ < 0; i_944_++) {
								int i_945_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								int i_946_ = i_945_ + i_920_;
								int i_947_ = ((i_945_ & 0xff00ff) + (i_920_ & 0xff00ff));
								int i_948_ = ((i_947_ & 0x1000100) + (i_946_ - i_947_ & 0x10000));
								is[i_923_++] = i_946_ - i_948_ | i_948_ - (i_948_ >>> 8);
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 2) {
						int i_949_ = i_920_ >>> 24;
						int i_950_ = 256 - i_949_;
						int i_951_ = (i_920_ & 0xff00ff) * i_950_ & ~0xff00ff;
						int i_952_ = (i_920_ & 0xff00) * i_950_ & 0xff0000;
						i_920_ = (i_951_ | i_952_) >>> 8;
						for (int i_953_ = -i_925_; i_953_ < 0; i_953_++) {
							for (int i_954_ = -i_926_; i_954_ < 0; i_954_++) {
								int i_955_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								i_951_ = (i_955_ & 0xff00ff) * i_949_ & ~0xff00ff;
								i_952_ = (i_955_ & 0xff00) * i_949_ & 0xff0000;
								is[i_923_++] = ((i_951_ | i_952_) >>> 8) + i_920_;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_921_ == 1) {
					if (i_919_ == 1) {
						for (int i_956_ = -i_925_; i_956_ < 0; i_956_++) {
							int i_957_ = i_923_ + i_926_ - 3;
							while (i_923_ < i_957_) {
								int i_958_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_958_ != 0)
									is[i_923_++] = i_958_;
								else
									i_923_++;
								i_958_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_958_ != 0)
									is[i_923_++] = i_958_;
								else
									i_923_++;
								i_958_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_958_ != 0)
									is[i_923_++] = i_958_;
								else
									i_923_++;
								i_958_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_958_ != 0)
									is[i_923_++] = i_958_;
								else
									i_923_++;
							}
							i_957_ += 3;
							while (i_923_ < i_957_) {
								int i_959_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_959_ != 0)
									is[i_923_++] = i_959_;
								else
									i_923_++;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 0) {
						if ((i_920_ & 0xffffff) == 16777215) {
							int i_960_ = i_920_ >>> 24;
							int i_961_ = 256 - i_960_;
							for (int i_962_ = -i_925_; i_962_ < 0; i_962_++) {
								for (int i_963_ = -i_926_; i_963_ < 0; i_963_++) {
									int i_964_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
									if (i_964_ != 0) {
										int i_965_ = is[i_923_];
										is[i_923_++] = ((((i_964_ & 0xff00ff) * i_960_ + ((i_965_ & 0xff00ff) * i_961_)) & ~0xff00ff) + (((i_964_ & 0xff00) * i_960_ + ((i_965_ & 0xff00) * i_961_)) & 0xff0000)) >> 8;
									} else
										i_923_++;
								}
								i_923_ += i_927_;
								i_924_ += i_928_;
							}
						} else {
							int i_966_ = (i_920_ & 0xff0000) >> 16;
							int i_967_ = (i_920_ & 0xff00) >> 8;
							int i_968_ = i_920_ & 0xff;
							int i_969_ = i_920_ >>> 24;
							int i_970_ = 256 - i_969_;
							for (int i_971_ = -i_925_; i_971_ < 0; i_971_++) {
								for (int i_972_ = -i_926_; i_972_ < 0; i_972_++) {
									int i_973_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
									if (i_973_ != 0) {
										if (i_969_ != 255) {
											int i_974_ = ((i_973_ & 0xff0000) * i_966_ & ~0xffffff);
											int i_975_ = ((i_973_ & 0xff00) * i_967_ & 0xff0000);
											int i_976_ = ((i_973_ & 0xff) * i_968_ & 0xff00);
											i_973_ = (i_974_ | i_975_ | i_976_) >>> 8;
											int i_977_ = is[i_923_];
											is[i_923_++] = (((((i_973_ & 0xff00ff) * i_969_) + ((i_977_ & 0xff00ff) * i_970_)) & ~0xff00ff) + ((((i_973_ & 0xff00) * i_969_) + ((i_977_ & 0xff00) * i_970_)) & 0xff0000)) >> 8;
										} else {
											int i_978_ = ((i_973_ & 0xff0000) * i_966_ & ~0xffffff);
											int i_979_ = ((i_973_ & 0xff00) * i_967_ & 0xff0000);
											int i_980_ = ((i_973_ & 0xff) * i_968_ & 0xff00);
											is[i_923_++] = (i_978_ | i_979_ | i_980_) >>> 8;
										}
									} else
										i_923_++;
								}
								i_923_ += i_927_;
								i_924_ += i_928_;
							}
						}
					} else if (i_919_ == 3) {
						int i_981_ = i_920_ >>> 24;
						int i_982_ = 256 - i_981_;
						for (int i_983_ = -i_925_; i_983_ < 0; i_983_++) {
							for (int i_984_ = -i_926_; i_984_ < 0; i_984_++) {
								int i_985_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								int i_986_ = i_985_ + i_920_;
								int i_987_ = ((i_985_ & 0xff00ff) + (i_920_ & 0xff00ff));
								int i_988_ = ((i_987_ & 0x1000100) + (i_986_ - i_987_ & 0x10000));
								i_988_ = i_986_ - i_988_ | i_988_ - (i_988_ >>> 8);
								if (i_985_ == 0 && i_981_ != 255) {
									i_985_ = i_988_;
									i_988_ = is[i_923_];
									i_988_ = ((((i_985_ & 0xff00ff) * i_981_ + (i_988_ & 0xff00ff) * i_982_) & ~0xff00ff) + (((i_985_ & 0xff00) * i_981_ + (i_988_ & 0xff00) * i_982_) & 0xff0000)) >> 8;
								}
								is[i_923_++] = i_988_;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 2) {
						int i_989_ = i_920_ >>> 24;
						int i_990_ = 256 - i_989_;
						int i_991_ = (i_920_ & 0xff00ff) * i_990_ & ~0xff00ff;
						int i_992_ = (i_920_ & 0xff00) * i_990_ & 0xff0000;
						i_920_ = (i_991_ | i_992_) >>> 8;
						for (int i_993_ = -i_925_; i_993_ < 0; i_993_++) {
							for (int i_994_ = -i_926_; i_994_ < 0; i_994_++) {
								int i_995_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_995_ != 0) {
									i_991_ = ((i_995_ & 0xff00ff) * i_989_ & ~0xff00ff);
									i_992_ = ((i_995_ & 0xff00) * i_989_ & 0xff0000);
									is[i_923_++] = ((i_991_ | i_992_) >>> 8) + i_920_;
								} else
									i_923_++;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_921_ == 2) {
					if (i_919_ == 1) {
						for (int i_996_ = -i_925_; i_996_ < 0; i_996_++) {
							for (int i_997_ = -i_926_; i_997_ < 0; i_997_++) {
								int i_998_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_998_ != 0) {
									int i_999_ = is[i_923_];
									int i_1000_ = i_998_ + i_999_;
									int i_1001_ = ((i_998_ & 0xff00ff) + (i_999_ & 0xff00ff));
									i_999_ = ((i_1001_ & 0x1000100) + (i_1000_ - i_1001_ & 0x10000));
									is[i_923_++] = i_1000_ - i_999_ | i_999_ - (i_999_ >>> 8);
								} else
									i_923_++;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 0) {
						int i_1002_ = (i_920_ & 0xff0000) >> 16;
						int i_1003_ = (i_920_ & 0xff00) >> 8;
						int i_1004_ = i_920_ & 0xff;
						for (int i_1005_ = -i_925_; i_1005_ < 0; i_1005_++) {
							for (int i_1006_ = -i_926_; i_1006_ < 0; i_1006_++) {
								int i_1007_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_1007_ != 0) {
									int i_1008_ = ((i_1007_ & 0xff0000) * i_1002_ & ~0xffffff);
									int i_1009_ = ((i_1007_ & 0xff00) * i_1003_ & 0xff0000);
									int i_1010_ = (i_1007_ & 0xff) * i_1004_ & 0xff00;
									i_1007_ = (i_1008_ | i_1009_ | i_1010_) >>> 8;
									int i_1011_ = is[i_923_];
									int i_1012_ = i_1007_ + i_1011_;
									int i_1013_ = ((i_1007_ & 0xff00ff) + (i_1011_ & 0xff00ff));
									i_1011_ = ((i_1013_ & 0x1000100) + (i_1012_ - i_1013_ & 0x10000));
									is[i_923_++] = (i_1012_ - i_1011_ | i_1011_ - (i_1011_ >>> 8));
								} else
									i_923_++;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 3) {
						for (int i_1014_ = -i_925_; i_1014_ < 0; i_1014_++) {
							for (int i_1015_ = -i_926_; i_1015_ < 0; i_1015_++) {
								int i_1016_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								int i_1017_ = i_1016_ + i_920_;
								int i_1018_ = ((i_1016_ & 0xff00ff) + (i_920_ & 0xff00ff));
								int i_1019_ = ((i_1018_ & 0x1000100) + (i_1017_ - i_1018_ & 0x10000));
								i_1016_ = i_1017_ - i_1019_ | i_1019_ - (i_1019_ >>> 8);
								i_1019_ = is[i_923_];
								i_1017_ = i_1016_ + i_1019_;
								i_1018_ = (i_1016_ & 0xff00ff) + (i_1019_ & 0xff00ff);
								i_1019_ = ((i_1018_ & 0x1000100) + (i_1017_ - i_1018_ & 0x10000));
								is[i_923_++] = i_1017_ - i_1019_ | i_1019_ - (i_1019_ >>> 8);
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else if (i_919_ == 2) {
						int i_1020_ = i_920_ >>> 24;
						int i_1021_ = 256 - i_1020_;
						int i_1022_ = (i_920_ & 0xff00ff) * i_1021_ & ~0xff00ff;
						int i_1023_ = (i_920_ & 0xff00) * i_1021_ & 0xff0000;
						i_920_ = (i_1022_ | i_1023_) >>> 8;
						for (int i_1024_ = -i_925_; i_1024_ < 0; i_1024_++) {
							for (int i_1025_ = -i_926_; i_1025_ < 0; i_1025_++) {
								int i_1026_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_924_++]);
								if (i_1026_ != 0) {
									i_1022_ = ((i_1026_ & 0xff00ff) * i_1020_ & ~0xff00ff);
									i_1023_ = ((i_1026_ & 0xff00) * i_1020_ & 0xff0000);
									i_1026_ = ((i_1022_ | i_1023_) >>> 8) + i_920_;
									int i_1027_ = is[i_923_];
									int i_1028_ = i_1026_ + i_1027_;
									int i_1029_ = ((i_1026_ & 0xff00ff) + (i_1027_ & 0xff00ff));
									i_1027_ = ((i_1029_ & 0x1000100) + (i_1028_ - i_1029_ & 0x10000));
									is[i_923_++] = (i_1028_ - i_1027_ | i_1027_ - (i_1027_ >>> 8));
								} else
									i_923_++;
							}
							i_923_ += i_927_;
							i_924_ += i_928_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10050(boolean bool, boolean bool_1030_, boolean bool_1031_, int i, int i_1032_, float f, int i_1033_, int i_1034_, int i_1035_, int i_1036_, int i_1037_, int i_1038_, boolean bool_1039_) {
		if (i_1033_ > 0 && i_1034_ > 0 && (bool || bool_1030_)) {
			int i_1040_ = 0;
			int i_1041_ = 0;
			int i_1042_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
			int i_1043_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
			int i_1044_ = (i_1042_ << 16) / i_1033_;
			int i_1045_ = (i_1043_ << 16) / i_1034_;
			if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
				int i_1046_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_1044_ - 1) / i_1044_);
				i += i_1046_;
				i_1040_ += (i_1046_ * i_1044_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
				int i_1047_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_1045_ - 1) / i_1045_);
				i_1032_ += i_1047_;
				i_1041_ += (i_1047_ * i_1045_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10945 < i_1042_)
				i_1033_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_1040_ + i_1044_ - 1) / i_1044_;
			if (((Class161_Sub3_Sub2) this).anInt10930 < i_1043_)
				i_1034_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_1041_ + i_1045_ - 1) / i_1045_;
			int i_1048_ = i + i_1032_ * ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_1049_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_1033_);
			if (i_1032_ + i_1034_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1034_ -= (i_1032_ + i_1034_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_1032_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1050_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1032_);
				i_1034_ -= i_1050_;
				i_1048_ += i_1050_ * (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_1041_ += i_1045_ * i_1050_;
			}
			if (i + i_1033_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1051_ = (i + i_1033_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1033_ -= i_1051_;
				i_1049_ += i_1051_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1052_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1033_ -= i_1052_;
				i_1048_ += i_1052_;
				i_1040_ += i_1044_ * i_1052_;
				i_1049_ += i_1052_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_1037_ == 0) {
				if (i_1035_ == 1) {
					int i_1053_ = i_1040_;
					for (int i_1054_ = -i_1034_; i_1054_ < 0; i_1054_++) {
						int i_1055_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1056_ = -i_1033_; i_1056_ < 0; i_1056_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool)
									is[i_1048_] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1055_]);
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1053_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 0) {
					int i_1057_ = (i_1036_ & 0xff0000) >> 16;
					int i_1058_ = (i_1036_ & 0xff00) >> 8;
					int i_1059_ = i_1036_ & 0xff;
					int i_1060_ = i_1040_;
					for (int i_1061_ = -i_1034_; i_1061_ < 0; i_1061_++) {
						int i_1062_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1063_ = -i_1033_; i_1063_ < 0; i_1063_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool) {
									int i_1064_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1062_]);
									int i_1065_ = ((i_1064_ & 0xff0000) * i_1057_ & ~0xffffff);
									int i_1066_ = ((i_1064_ & 0xff00) * i_1058_ & 0xff0000);
									int i_1067_ = (i_1064_ & 0xff) * i_1059_ & 0xff00;
									is[i_1048_] = (i_1065_ | i_1066_ | i_1067_) >>> 8;
								}
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1060_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 3) {
					int i_1068_ = i_1040_;
					for (int i_1069_ = -i_1034_; i_1069_ < 0; i_1069_++) {
						int i_1070_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1071_ = -i_1033_; i_1071_ < 0; i_1071_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool) {
									int i_1072_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1070_]);
									int i_1073_ = i_1072_ + i_1036_;
									int i_1074_ = ((i_1072_ & 0xff00ff) + (i_1036_ & 0xff00ff));
									int i_1075_ = ((i_1074_ & 0x1000100) + (i_1073_ - i_1074_ & 0x10000));
									is[i_1048_] = (i_1073_ - i_1075_ | i_1075_ - (i_1075_ >>> 8));
								}
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1068_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 2) {
					int i_1076_ = i_1036_ >>> 24;
					int i_1077_ = 256 - i_1076_;
					int i_1078_ = (i_1036_ & 0xff00ff) * i_1077_ & ~0xff00ff;
					int i_1079_ = (i_1036_ & 0xff00) * i_1077_ & 0xff0000;
					i_1036_ = (i_1078_ | i_1079_) >>> 8;
					int i_1080_ = i_1040_;
					for (int i_1081_ = -i_1034_; i_1081_ < 0; i_1081_++) {
						int i_1082_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1083_ = -i_1033_; i_1083_ < 0; i_1083_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool) {
									int i_1084_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1082_]);
									i_1078_ = ((i_1084_ & 0xff00ff) * i_1076_ & ~0xff00ff);
									i_1079_ = ((i_1084_ & 0xff00) * i_1076_ & 0xff0000);
									is[i_1048_] = (((i_1078_ | i_1079_) >>> 8) + i_1036_);
								}
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1080_;
						i_1048_ += i_1049_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1037_ == 1) {
				if (i_1035_ == 1) {
					int i_1085_ = i_1040_;
					for (int i_1086_ = -i_1034_; i_1086_ < 0; i_1086_++) {
						int i_1087_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1088_ = -i_1033_; i_1088_ < 0; i_1088_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								int i_1089_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1087_]);
								if (i_1089_ != 0) {
									if (bool)
										is[i_1048_] = i_1089_;
									if (bool_1030_ && bool_1039_)
										fs[i_1048_] = f;
								}
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1085_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 0) {
					int i_1090_ = i_1040_;
					if ((i_1036_ & 0xffffff) == 16777215) {
						int i_1091_ = i_1036_ >>> 24;
						int i_1092_ = 256 - i_1091_;
						for (int i_1093_ = -i_1034_; i_1093_ < 0; i_1093_++) {
							int i_1094_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1095_ = -i_1033_; i_1095_ < 0; i_1095_++) {
								if (!bool_1030_ || f < fs[i_1048_]) {
									int i_1096_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1094_]);
									if (i_1096_ != 0) {
										if (bool) {
											int i_1097_ = is[i_1048_];
											is[i_1048_] = (((((i_1096_ & 0xff00ff) * i_1091_) + ((i_1097_ & 0xff00ff) * i_1092_)) & ~0xff00ff) + ((((i_1096_ & 0xff00) * i_1091_) + ((i_1097_ & 0xff00) * i_1092_)) & 0xff0000)) >> 8;
										}
										if (bool_1030_ && bool_1039_)
											fs[i_1048_] = f;
									}
								}
								i_1040_ += i_1044_;
								i_1048_++;
							}
							i_1041_ += i_1045_;
							i_1040_ = i_1090_;
							i_1048_ += i_1049_;
						}
					} else {
						int i_1098_ = (i_1036_ & 0xff0000) >> 16;
						int i_1099_ = (i_1036_ & 0xff00) >> 8;
						int i_1100_ = i_1036_ & 0xff;
						int i_1101_ = i_1036_ >>> 24;
						int i_1102_ = 256 - i_1101_;
						for (int i_1103_ = -i_1034_; i_1103_ < 0; i_1103_++) {
							int i_1104_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1105_ = -i_1033_; i_1105_ < 0; i_1105_++) {
								if (!bool_1030_ || f < fs[i_1048_]) {
									int i_1106_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1104_]);
									if (i_1106_ != 0) {
										if (i_1101_ != 255) {
											if (bool) {
												int i_1107_ = (((i_1106_ & 0xff0000) * i_1098_) & ~0xffffff);
												int i_1108_ = (((i_1106_ & 0xff00) * i_1099_) & 0xff0000);
												int i_1109_ = (((i_1106_ & 0xff) * i_1100_) & 0xff00);
												i_1106_ = (i_1107_ | i_1108_ | i_1109_) >>> 8;
												int i_1110_ = is[i_1048_];
												is[i_1048_] = (((((i_1106_ & 0xff00ff) * i_1101_) + ((i_1110_ & 0xff00ff) * i_1102_)) & ~0xff00ff) + ((((i_1106_ & 0xff00) * i_1101_) + ((i_1110_ & 0xff00) * i_1102_)) & 0xff0000)) >> 8;
											}
											if (bool_1030_ && bool_1039_)
												fs[i_1048_] = f;
										} else {
											if (bool) {
												int i_1111_ = (((i_1106_ & 0xff0000) * i_1098_) & ~0xffffff);
												int i_1112_ = (((i_1106_ & 0xff00) * i_1099_) & 0xff0000);
												int i_1113_ = (((i_1106_ & 0xff) * i_1100_) & 0xff00);
												is[i_1048_] = (i_1111_ | i_1112_ | i_1113_) >>> 8;
											}
											if (bool_1030_ && bool_1039_)
												fs[i_1048_] = f;
										}
									}
								}
								i_1040_ += i_1044_;
								i_1048_++;
							}
							i_1041_ += i_1045_;
							i_1040_ = i_1090_;
							i_1048_ += i_1049_;
						}
					}
				} else if (i_1035_ == 3) {
					int i_1114_ = i_1040_;
					int i_1115_ = i_1036_ >>> 24;
					int i_1116_ = 256 - i_1115_;
					for (int i_1117_ = -i_1034_; i_1117_ < 0; i_1117_++) {
						int i_1118_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1119_ = -i_1033_; i_1119_ < 0; i_1119_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool) {
									int i_1120_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1118_]);
									int i_1121_ = i_1120_ + i_1036_;
									int i_1122_ = ((i_1120_ & 0xff00ff) + (i_1036_ & 0xff00ff));
									int i_1123_ = ((i_1122_ & 0x1000100) + (i_1121_ - i_1122_ & 0x10000));
									i_1123_ = (i_1121_ - i_1123_ | i_1123_ - (i_1123_ >>> 8));
									if (i_1120_ == 0 && i_1115_ != 255) {
										i_1120_ = i_1123_;
										i_1123_ = is[i_1048_];
										i_1123_ = ((((i_1120_ & 0xff00ff) * i_1115_ + ((i_1123_ & 0xff00ff) * i_1116_)) & ~0xff00ff) + (((i_1120_ & 0xff00) * i_1115_ + ((i_1123_ & 0xff00) * i_1116_)) & 0xff0000)) >> 8;
									}
									is[i_1048_] = i_1123_;
								}
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1114_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 2) {
					int i_1124_ = i_1036_ >>> 24;
					int i_1125_ = 256 - i_1124_;
					int i_1126_ = (i_1036_ & 0xff00ff) * i_1125_ & ~0xff00ff;
					int i_1127_ = (i_1036_ & 0xff00) * i_1125_ & 0xff0000;
					i_1036_ = (i_1126_ | i_1127_) >>> 8;
					int i_1128_ = i_1040_;
					for (int i_1129_ = -i_1034_; i_1129_ < 0; i_1129_++) {
						int i_1130_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1131_ = -i_1033_; i_1131_ < 0; i_1131_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								int i_1132_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1130_]);
								if (i_1132_ != 0) {
									if (bool) {
										i_1126_ = ((i_1132_ & 0xff00ff) * i_1124_ & ~0xff00ff);
										i_1127_ = ((i_1132_ & 0xff00) * i_1124_ & 0xff0000);
										is[i_1048_] = ((i_1126_ | i_1127_) >>> 8) + i_1036_;
									}
									if (bool_1030_ && bool_1039_)
										fs[i_1048_] = f;
								}
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1128_;
						i_1048_ += i_1049_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1037_ == 2) {
				if (i_1035_ == 1) {
					int i_1133_ = i_1040_;
					for (int i_1134_ = -i_1034_; i_1134_ < 0; i_1134_++) {
						int i_1135_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1136_ = -i_1033_; i_1136_ < 0; i_1136_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								int i_1137_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1135_]);
								if (i_1137_ != 0) {
									if (bool) {
										int i_1138_ = is[i_1048_];
										int i_1139_ = i_1137_ + i_1138_;
										int i_1140_ = ((i_1137_ & 0xff00ff) + (i_1138_ & 0xff00ff));
										i_1138_ = ((i_1140_ & 0x1000100) + (i_1139_ - i_1140_ & 0x10000));
										is[i_1048_] = (i_1139_ - i_1138_ | i_1138_ - (i_1138_ >>> 8));
									}
									if (bool_1030_ && bool_1039_)
										fs[i_1048_] = f;
								}
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1133_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 0) {
					int i_1141_ = i_1040_;
					int i_1142_ = (i_1036_ & 0xff0000) >> 16;
					int i_1143_ = (i_1036_ & 0xff00) >> 8;
					int i_1144_ = i_1036_ & 0xff;
					for (int i_1145_ = -i_1034_; i_1145_ < 0; i_1145_++) {
						int i_1146_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1147_ = -i_1033_; i_1147_ < 0; i_1147_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								int i_1148_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1146_]);
								if (i_1148_ != 0) {
									if (bool) {
										int i_1149_ = ((i_1148_ & 0xff0000) * i_1142_ & ~0xffffff);
										int i_1150_ = ((i_1148_ & 0xff00) * i_1143_ & 0xff0000);
										int i_1151_ = ((i_1148_ & 0xff) * i_1144_ & 0xff00);
										i_1148_ = (i_1149_ | i_1150_ | i_1151_) >>> 8;
										int i_1152_ = is[i_1048_];
										int i_1153_ = i_1148_ + i_1152_;
										int i_1154_ = ((i_1148_ & 0xff00ff) + (i_1152_ & 0xff00ff));
										i_1152_ = ((i_1154_ & 0x1000100) + (i_1153_ - i_1154_ & 0x10000));
										is[i_1048_] = (i_1153_ - i_1152_ | i_1152_ - (i_1152_ >>> 8));
									}
									if (bool_1030_ && bool_1039_)
										fs[i_1048_] = f;
								}
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1141_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 3) {
					int i_1155_ = i_1040_;
					for (int i_1156_ = -i_1034_; i_1156_ < 0; i_1156_++) {
						int i_1157_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1158_ = -i_1033_; i_1158_ < 0; i_1158_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								if (bool) {
									int i_1159_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1157_]);
									int i_1160_ = i_1159_ + i_1036_;
									int i_1161_ = ((i_1159_ & 0xff00ff) + (i_1036_ & 0xff00ff));
									int i_1162_ = ((i_1161_ & 0x1000100) + (i_1160_ - i_1161_ & 0x10000));
									i_1159_ = (i_1160_ - i_1162_ | i_1162_ - (i_1162_ >>> 8));
									i_1162_ = is[i_1048_];
									i_1160_ = i_1159_ + i_1162_;
									i_1161_ = (i_1159_ & 0xff00ff) + (i_1162_ & 0xff00ff);
									i_1162_ = ((i_1161_ & 0x1000100) + (i_1160_ - i_1161_ & 0x10000));
									is[i_1048_] = (i_1160_ - i_1162_ | i_1162_ - (i_1162_ >>> 8));
								}
								if (bool_1030_ && bool_1039_)
									fs[i_1048_] = f;
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1155_;
						i_1048_ += i_1049_;
					}
				} else if (i_1035_ == 2) {
					int i_1163_ = i_1036_ >>> 24;
					int i_1164_ = 256 - i_1163_;
					int i_1165_ = (i_1036_ & 0xff00ff) * i_1164_ & ~0xff00ff;
					int i_1166_ = (i_1036_ & 0xff00) * i_1164_ & 0xff0000;
					i_1036_ = (i_1165_ | i_1166_) >>> 8;
					int i_1167_ = i_1040_;
					for (int i_1168_ = -i_1034_; i_1168_ < 0; i_1168_++) {
						int i_1169_ = ((i_1041_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_1170_ = -i_1033_; i_1170_ < 0; i_1170_++) {
							if (!bool_1030_ || f < fs[i_1048_]) {
								int i_1171_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1040_ >> 16) + i_1169_]);
								if (i_1171_ != 0) {
									if (bool) {
										i_1165_ = ((i_1171_ & 0xff00ff) * i_1163_ & ~0xff00ff);
										i_1166_ = ((i_1171_ & 0xff00) * i_1163_ & 0xff0000);
										i_1171_ = (((i_1165_ | i_1166_) >>> 8) + i_1036_);
										int i_1172_ = is[i_1048_];
										int i_1173_ = i_1171_ + i_1172_;
										int i_1174_ = ((i_1171_ & 0xff00ff) + (i_1172_ & 0xff00ff));
										i_1172_ = ((i_1174_ & 0x1000100) + (i_1173_ - i_1174_ & 0x10000));
										is[i_1048_] = (i_1173_ - i_1172_ | i_1172_ - (i_1172_ >>> 8));
									}
									if (bool_1030_ && bool_1039_)
										fs[i_1048_] = f;
								}
							}
							i_1040_ += i_1044_;
							i_1048_++;
						}
						i_1041_ += i_1045_;
						i_1040_ = i_1167_;
						i_1048_ += i_1049_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2644(int i, int i_1175_, int i_1176_, int i_1177_, int i_1178_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1179_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_1175_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_1180_ = i_1175_ * i_1179_ + i;
			int i_1181_ = 0;
			int i_1182_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_1183_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_1184_ = i_1179_ - i_1183_;
			int i_1185_ = 0;
			if (i_1175_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1186_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1175_);
				i_1182_ -= i_1186_;
				i_1175_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1181_ += i_1186_ * i_1183_;
				i_1180_ += i_1186_ * i_1179_;
			}
			if (i_1175_ + i_1182_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1182_ -= (i_1175_ + i_1182_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1187_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1183_ -= i_1187_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1181_ += i_1187_;
				i_1180_ += i_1187_;
				i_1185_ += i_1187_;
				i_1184_ += i_1187_;
			}
			if (i + i_1183_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1188_ = (i + i_1183_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1183_ -= i_1188_;
				i_1185_ += i_1188_;
				i_1184_ += i_1188_;
			}
			if (i_1183_ > 0 && i_1182_ > 0) {
				if (i_1178_ == 0) {
					if (i_1176_ == 1) {
						for (int i_1189_ = -i_1182_; i_1189_ < 0; i_1189_++) {
							int i_1190_ = i_1180_ + i_1183_ - 3;
							while (i_1180_ < i_1190_) {
								is[i_1180_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								is[i_1180_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								is[i_1180_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								is[i_1180_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
							}
							i_1190_ += 3;
							while (i_1180_ < i_1190_)
								is[i_1180_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 0) {
						int i_1191_ = (i_1177_ & 0xff0000) >> 16;
						int i_1192_ = (i_1177_ & 0xff00) >> 8;
						int i_1193_ = i_1177_ & 0xff;
						for (int i_1194_ = -i_1182_; i_1194_ < 0; i_1194_++) {
							for (int i_1195_ = -i_1183_; i_1195_ < 0; i_1195_++) {
								int i_1196_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								int i_1197_ = ((i_1196_ & 0xff0000) * i_1191_ & ~0xffffff);
								int i_1198_ = (i_1196_ & 0xff00) * i_1192_ & 0xff0000;
								int i_1199_ = (i_1196_ & 0xff) * i_1193_ & 0xff00;
								is[i_1180_++] = (i_1197_ | i_1198_ | i_1199_) >>> 8;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 3) {
						for (int i_1200_ = -i_1182_; i_1200_ < 0; i_1200_++) {
							for (int i_1201_ = -i_1183_; i_1201_ < 0; i_1201_++) {
								int i_1202_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								int i_1203_ = i_1202_ + i_1177_;
								int i_1204_ = ((i_1202_ & 0xff00ff) + (i_1177_ & 0xff00ff));
								int i_1205_ = ((i_1204_ & 0x1000100) + (i_1203_ - i_1204_ & 0x10000));
								is[i_1180_++] = i_1203_ - i_1205_ | i_1205_ - (i_1205_ >>> 8);
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 2) {
						int i_1206_ = i_1177_ >>> 24;
						int i_1207_ = 256 - i_1206_;
						int i_1208_ = (i_1177_ & 0xff00ff) * i_1207_ & ~0xff00ff;
						int i_1209_ = (i_1177_ & 0xff00) * i_1207_ & 0xff0000;
						i_1177_ = (i_1208_ | i_1209_) >>> 8;
						for (int i_1210_ = -i_1182_; i_1210_ < 0; i_1210_++) {
							for (int i_1211_ = -i_1183_; i_1211_ < 0; i_1211_++) {
								int i_1212_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								i_1208_ = ((i_1212_ & 0xff00ff) * i_1206_ & ~0xff00ff);
								i_1209_ = (i_1212_ & 0xff00) * i_1206_ & 0xff0000;
								is[i_1180_++] = ((i_1208_ | i_1209_) >>> 8) + i_1177_;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1178_ == 1) {
					if (i_1176_ == 1) {
						for (int i_1213_ = -i_1182_; i_1213_ < 0; i_1213_++) {
							int i_1214_ = i_1180_ + i_1183_ - 3;
							while (i_1180_ < i_1214_) {
								int i_1215_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1215_ != 0)
									is[i_1180_++] = i_1215_;
								else
									i_1180_++;
								i_1215_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1215_ != 0)
									is[i_1180_++] = i_1215_;
								else
									i_1180_++;
								i_1215_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1215_ != 0)
									is[i_1180_++] = i_1215_;
								else
									i_1180_++;
								i_1215_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1215_ != 0)
									is[i_1180_++] = i_1215_;
								else
									i_1180_++;
							}
							i_1214_ += 3;
							while (i_1180_ < i_1214_) {
								int i_1216_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1216_ != 0)
									is[i_1180_++] = i_1216_;
								else
									i_1180_++;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 0) {
						if ((i_1177_ & 0xffffff) == 16777215) {
							int i_1217_ = i_1177_ >>> 24;
							int i_1218_ = 256 - i_1217_;
							for (int i_1219_ = -i_1182_; i_1219_ < 0; i_1219_++) {
								for (int i_1220_ = -i_1183_; i_1220_ < 0; i_1220_++) {
									int i_1221_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
									if (i_1221_ != 0) {
										int i_1222_ = is[i_1180_];
										is[i_1180_++] = ((((i_1221_ & 0xff00ff) * i_1217_ + ((i_1222_ & 0xff00ff) * i_1218_)) & ~0xff00ff) + (((i_1221_ & 0xff00) * i_1217_ + ((i_1222_ & 0xff00) * i_1218_)) & 0xff0000)) >> 8;
									} else
										i_1180_++;
								}
								i_1180_ += i_1184_;
								i_1181_ += i_1185_;
							}
						} else {
							int i_1223_ = (i_1177_ & 0xff0000) >> 16;
							int i_1224_ = (i_1177_ & 0xff00) >> 8;
							int i_1225_ = i_1177_ & 0xff;
							int i_1226_ = i_1177_ >>> 24;
							int i_1227_ = 256 - i_1226_;
							for (int i_1228_ = -i_1182_; i_1228_ < 0; i_1228_++) {
								for (int i_1229_ = -i_1183_; i_1229_ < 0; i_1229_++) {
									int i_1230_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
									if (i_1230_ != 0) {
										if (i_1226_ != 255) {
											int i_1231_ = (((i_1230_ & 0xff0000) * i_1223_) & ~0xffffff);
											int i_1232_ = ((i_1230_ & 0xff00) * i_1224_ & 0xff0000);
											int i_1233_ = ((i_1230_ & 0xff) * i_1225_ & 0xff00);
											i_1230_ = (i_1231_ | i_1232_ | i_1233_) >>> 8;
											int i_1234_ = is[i_1180_];
											is[i_1180_++] = (((((i_1230_ & 0xff00ff) * i_1226_) + ((i_1234_ & 0xff00ff) * i_1227_)) & ~0xff00ff) + ((((i_1230_ & 0xff00) * i_1226_) + ((i_1234_ & 0xff00) * i_1227_)) & 0xff0000)) >> 8;
										} else {
											int i_1235_ = (((i_1230_ & 0xff0000) * i_1223_) & ~0xffffff);
											int i_1236_ = ((i_1230_ & 0xff00) * i_1224_ & 0xff0000);
											int i_1237_ = ((i_1230_ & 0xff) * i_1225_ & 0xff00);
											is[i_1180_++] = (i_1235_ | i_1236_ | i_1237_) >>> 8;
										}
									} else
										i_1180_++;
								}
								i_1180_ += i_1184_;
								i_1181_ += i_1185_;
							}
						}
					} else if (i_1176_ == 3) {
						int i_1238_ = i_1177_ >>> 24;
						int i_1239_ = 256 - i_1238_;
						for (int i_1240_ = -i_1182_; i_1240_ < 0; i_1240_++) {
							for (int i_1241_ = -i_1183_; i_1241_ < 0; i_1241_++) {
								int i_1242_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								int i_1243_ = i_1242_ + i_1177_;
								int i_1244_ = ((i_1242_ & 0xff00ff) + (i_1177_ & 0xff00ff));
								int i_1245_ = ((i_1244_ & 0x1000100) + (i_1243_ - i_1244_ & 0x10000));
								i_1245_ = i_1243_ - i_1245_ | i_1245_ - (i_1245_ >>> 8);
								if (i_1242_ == 0 && i_1238_ != 255) {
									i_1242_ = i_1245_;
									i_1245_ = is[i_1180_];
									i_1245_ = ((((i_1242_ & 0xff00ff) * i_1238_ + (i_1245_ & 0xff00ff) * i_1239_) & ~0xff00ff) + (((i_1242_ & 0xff00) * i_1238_ + (i_1245_ & 0xff00) * i_1239_) & 0xff0000)) >> 8;
								}
								is[i_1180_++] = i_1245_;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 2) {
						int i_1246_ = i_1177_ >>> 24;
						int i_1247_ = 256 - i_1246_;
						int i_1248_ = (i_1177_ & 0xff00ff) * i_1247_ & ~0xff00ff;
						int i_1249_ = (i_1177_ & 0xff00) * i_1247_ & 0xff0000;
						i_1177_ = (i_1248_ | i_1249_) >>> 8;
						for (int i_1250_ = -i_1182_; i_1250_ < 0; i_1250_++) {
							for (int i_1251_ = -i_1183_; i_1251_ < 0; i_1251_++) {
								int i_1252_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1252_ != 0) {
									i_1248_ = ((i_1252_ & 0xff00ff) * i_1246_ & ~0xff00ff);
									i_1249_ = ((i_1252_ & 0xff00) * i_1246_ & 0xff0000);
									is[i_1180_++] = ((i_1248_ | i_1249_) >>> 8) + i_1177_;
								} else
									i_1180_++;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1178_ == 2) {
					if (i_1176_ == 1) {
						for (int i_1253_ = -i_1182_; i_1253_ < 0; i_1253_++) {
							for (int i_1254_ = -i_1183_; i_1254_ < 0; i_1254_++) {
								int i_1255_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1255_ != 0) {
									int i_1256_ = is[i_1180_];
									int i_1257_ = i_1255_ + i_1256_;
									int i_1258_ = ((i_1255_ & 0xff00ff) + (i_1256_ & 0xff00ff));
									i_1256_ = ((i_1258_ & 0x1000100) + (i_1257_ - i_1258_ & 0x10000));
									is[i_1180_++] = (i_1257_ - i_1256_ | i_1256_ - (i_1256_ >>> 8));
								} else
									i_1180_++;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 0) {
						int i_1259_ = (i_1177_ & 0xff0000) >> 16;
						int i_1260_ = (i_1177_ & 0xff00) >> 8;
						int i_1261_ = i_1177_ & 0xff;
						for (int i_1262_ = -i_1182_; i_1262_ < 0; i_1262_++) {
							for (int i_1263_ = -i_1183_; i_1263_ < 0; i_1263_++) {
								int i_1264_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1264_ != 0) {
									int i_1265_ = ((i_1264_ & 0xff0000) * i_1259_ & ~0xffffff);
									int i_1266_ = ((i_1264_ & 0xff00) * i_1260_ & 0xff0000);
									int i_1267_ = (i_1264_ & 0xff) * i_1261_ & 0xff00;
									i_1264_ = (i_1265_ | i_1266_ | i_1267_) >>> 8;
									int i_1268_ = is[i_1180_];
									int i_1269_ = i_1264_ + i_1268_;
									int i_1270_ = ((i_1264_ & 0xff00ff) + (i_1268_ & 0xff00ff));
									i_1268_ = ((i_1270_ & 0x1000100) + (i_1269_ - i_1270_ & 0x10000));
									is[i_1180_++] = (i_1269_ - i_1268_ | i_1268_ - (i_1268_ >>> 8));
								} else
									i_1180_++;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 3) {
						for (int i_1271_ = -i_1182_; i_1271_ < 0; i_1271_++) {
							for (int i_1272_ = -i_1183_; i_1272_ < 0; i_1272_++) {
								int i_1273_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								int i_1274_ = i_1273_ + i_1177_;
								int i_1275_ = ((i_1273_ & 0xff00ff) + (i_1177_ & 0xff00ff));
								int i_1276_ = ((i_1275_ & 0x1000100) + (i_1274_ - i_1275_ & 0x10000));
								i_1273_ = i_1274_ - i_1276_ | i_1276_ - (i_1276_ >>> 8);
								i_1276_ = is[i_1180_];
								i_1274_ = i_1273_ + i_1276_;
								i_1275_ = (i_1273_ & 0xff00ff) + (i_1276_ & 0xff00ff);
								i_1276_ = ((i_1275_ & 0x1000100) + (i_1274_ - i_1275_ & 0x10000));
								is[i_1180_++] = i_1274_ - i_1276_ | i_1276_ - (i_1276_ >>> 8);
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else if (i_1176_ == 2) {
						int i_1277_ = i_1177_ >>> 24;
						int i_1278_ = 256 - i_1277_;
						int i_1279_ = (i_1177_ & 0xff00ff) * i_1278_ & ~0xff00ff;
						int i_1280_ = (i_1177_ & 0xff00) * i_1278_ & 0xff0000;
						i_1177_ = (i_1279_ | i_1280_) >>> 8;
						for (int i_1281_ = -i_1182_; i_1281_ < 0; i_1281_++) {
							for (int i_1282_ = -i_1183_; i_1282_ < 0; i_1282_++) {
								int i_1283_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1181_++]);
								if (i_1283_ != 0) {
									i_1279_ = ((i_1283_ & 0xff00ff) * i_1277_ & ~0xff00ff);
									i_1280_ = ((i_1283_ & 0xff00) * i_1277_ & 0xff0000);
									i_1283_ = (((i_1279_ | i_1280_) >>> 8) + i_1177_);
									int i_1284_ = is[i_1180_];
									int i_1285_ = i_1283_ + i_1284_;
									int i_1286_ = ((i_1283_ & 0xff00ff) + (i_1284_ & 0xff00ff));
									i_1284_ = ((i_1286_ & 0x1000100) + (i_1285_ - i_1286_ & 0x10000));
									is[i_1180_++] = (i_1285_ - i_1284_ | i_1284_ - (i_1284_ >>> 8));
								} else
									i_1180_++;
							}
							i_1180_ += i_1184_;
							i_1181_ += i_1185_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2617(int i, int i_1287_, int i_1288_, int i_1289_, int i_1290_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1291_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_1287_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_1292_ = i_1287_ * i_1291_ + i;
			int i_1293_ = 0;
			int i_1294_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_1295_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_1296_ = i_1291_ - i_1295_;
			int i_1297_ = 0;
			if (i_1287_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1298_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1287_);
				i_1294_ -= i_1298_;
				i_1287_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1293_ += i_1298_ * i_1295_;
				i_1292_ += i_1298_ * i_1291_;
			}
			if (i_1287_ + i_1294_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1294_ -= (i_1287_ + i_1294_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1299_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1295_ -= i_1299_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1293_ += i_1299_;
				i_1292_ += i_1299_;
				i_1297_ += i_1299_;
				i_1296_ += i_1299_;
			}
			if (i + i_1295_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1300_ = (i + i_1295_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1295_ -= i_1300_;
				i_1297_ += i_1300_;
				i_1296_ += i_1300_;
			}
			if (i_1295_ > 0 && i_1294_ > 0) {
				if (i_1290_ == 0) {
					if (i_1288_ == 1) {
						for (int i_1301_ = -i_1294_; i_1301_ < 0; i_1301_++) {
							int i_1302_ = i_1292_ + i_1295_ - 3;
							while (i_1292_ < i_1302_) {
								is[i_1292_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								is[i_1292_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								is[i_1292_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								is[i_1292_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
							}
							i_1302_ += 3;
							while (i_1292_ < i_1302_)
								is[i_1292_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 0) {
						int i_1303_ = (i_1289_ & 0xff0000) >> 16;
						int i_1304_ = (i_1289_ & 0xff00) >> 8;
						int i_1305_ = i_1289_ & 0xff;
						for (int i_1306_ = -i_1294_; i_1306_ < 0; i_1306_++) {
							for (int i_1307_ = -i_1295_; i_1307_ < 0; i_1307_++) {
								int i_1308_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								int i_1309_ = ((i_1308_ & 0xff0000) * i_1303_ & ~0xffffff);
								int i_1310_ = (i_1308_ & 0xff00) * i_1304_ & 0xff0000;
								int i_1311_ = (i_1308_ & 0xff) * i_1305_ & 0xff00;
								is[i_1292_++] = (i_1309_ | i_1310_ | i_1311_) >>> 8;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 3) {
						for (int i_1312_ = -i_1294_; i_1312_ < 0; i_1312_++) {
							for (int i_1313_ = -i_1295_; i_1313_ < 0; i_1313_++) {
								int i_1314_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								int i_1315_ = i_1314_ + i_1289_;
								int i_1316_ = ((i_1314_ & 0xff00ff) + (i_1289_ & 0xff00ff));
								int i_1317_ = ((i_1316_ & 0x1000100) + (i_1315_ - i_1316_ & 0x10000));
								is[i_1292_++] = i_1315_ - i_1317_ | i_1317_ - (i_1317_ >>> 8);
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 2) {
						int i_1318_ = i_1289_ >>> 24;
						int i_1319_ = 256 - i_1318_;
						int i_1320_ = (i_1289_ & 0xff00ff) * i_1319_ & ~0xff00ff;
						int i_1321_ = (i_1289_ & 0xff00) * i_1319_ & 0xff0000;
						i_1289_ = (i_1320_ | i_1321_) >>> 8;
						for (int i_1322_ = -i_1294_; i_1322_ < 0; i_1322_++) {
							for (int i_1323_ = -i_1295_; i_1323_ < 0; i_1323_++) {
								int i_1324_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								i_1320_ = ((i_1324_ & 0xff00ff) * i_1318_ & ~0xff00ff);
								i_1321_ = (i_1324_ & 0xff00) * i_1318_ & 0xff0000;
								is[i_1292_++] = ((i_1320_ | i_1321_) >>> 8) + i_1289_;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1290_ == 1) {
					if (i_1288_ == 1) {
						for (int i_1325_ = -i_1294_; i_1325_ < 0; i_1325_++) {
							int i_1326_ = i_1292_ + i_1295_ - 3;
							while (i_1292_ < i_1326_) {
								int i_1327_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1327_ != 0)
									is[i_1292_++] = i_1327_;
								else
									i_1292_++;
								i_1327_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1327_ != 0)
									is[i_1292_++] = i_1327_;
								else
									i_1292_++;
								i_1327_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1327_ != 0)
									is[i_1292_++] = i_1327_;
								else
									i_1292_++;
								i_1327_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1327_ != 0)
									is[i_1292_++] = i_1327_;
								else
									i_1292_++;
							}
							i_1326_ += 3;
							while (i_1292_ < i_1326_) {
								int i_1328_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1328_ != 0)
									is[i_1292_++] = i_1328_;
								else
									i_1292_++;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 0) {
						if ((i_1289_ & 0xffffff) == 16777215) {
							int i_1329_ = i_1289_ >>> 24;
							int i_1330_ = 256 - i_1329_;
							for (int i_1331_ = -i_1294_; i_1331_ < 0; i_1331_++) {
								for (int i_1332_ = -i_1295_; i_1332_ < 0; i_1332_++) {
									int i_1333_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
									if (i_1333_ != 0) {
										int i_1334_ = is[i_1292_];
										is[i_1292_++] = ((((i_1333_ & 0xff00ff) * i_1329_ + ((i_1334_ & 0xff00ff) * i_1330_)) & ~0xff00ff) + (((i_1333_ & 0xff00) * i_1329_ + ((i_1334_ & 0xff00) * i_1330_)) & 0xff0000)) >> 8;
									} else
										i_1292_++;
								}
								i_1292_ += i_1296_;
								i_1293_ += i_1297_;
							}
						} else {
							int i_1335_ = (i_1289_ & 0xff0000) >> 16;
							int i_1336_ = (i_1289_ & 0xff00) >> 8;
							int i_1337_ = i_1289_ & 0xff;
							int i_1338_ = i_1289_ >>> 24;
							int i_1339_ = 256 - i_1338_;
							for (int i_1340_ = -i_1294_; i_1340_ < 0; i_1340_++) {
								for (int i_1341_ = -i_1295_; i_1341_ < 0; i_1341_++) {
									int i_1342_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
									if (i_1342_ != 0) {
										if (i_1338_ != 255) {
											int i_1343_ = (((i_1342_ & 0xff0000) * i_1335_) & ~0xffffff);
											int i_1344_ = ((i_1342_ & 0xff00) * i_1336_ & 0xff0000);
											int i_1345_ = ((i_1342_ & 0xff) * i_1337_ & 0xff00);
											i_1342_ = (i_1343_ | i_1344_ | i_1345_) >>> 8;
											int i_1346_ = is[i_1292_];
											is[i_1292_++] = (((((i_1342_ & 0xff00ff) * i_1338_) + ((i_1346_ & 0xff00ff) * i_1339_)) & ~0xff00ff) + ((((i_1342_ & 0xff00) * i_1338_) + ((i_1346_ & 0xff00) * i_1339_)) & 0xff0000)) >> 8;
										} else {
											int i_1347_ = (((i_1342_ & 0xff0000) * i_1335_) & ~0xffffff);
											int i_1348_ = ((i_1342_ & 0xff00) * i_1336_ & 0xff0000);
											int i_1349_ = ((i_1342_ & 0xff) * i_1337_ & 0xff00);
											is[i_1292_++] = (i_1347_ | i_1348_ | i_1349_) >>> 8;
										}
									} else
										i_1292_++;
								}
								i_1292_ += i_1296_;
								i_1293_ += i_1297_;
							}
						}
					} else if (i_1288_ == 3) {
						int i_1350_ = i_1289_ >>> 24;
						int i_1351_ = 256 - i_1350_;
						for (int i_1352_ = -i_1294_; i_1352_ < 0; i_1352_++) {
							for (int i_1353_ = -i_1295_; i_1353_ < 0; i_1353_++) {
								int i_1354_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								int i_1355_ = i_1354_ + i_1289_;
								int i_1356_ = ((i_1354_ & 0xff00ff) + (i_1289_ & 0xff00ff));
								int i_1357_ = ((i_1356_ & 0x1000100) + (i_1355_ - i_1356_ & 0x10000));
								i_1357_ = i_1355_ - i_1357_ | i_1357_ - (i_1357_ >>> 8);
								if (i_1354_ == 0 && i_1350_ != 255) {
									i_1354_ = i_1357_;
									i_1357_ = is[i_1292_];
									i_1357_ = ((((i_1354_ & 0xff00ff) * i_1350_ + (i_1357_ & 0xff00ff) * i_1351_) & ~0xff00ff) + (((i_1354_ & 0xff00) * i_1350_ + (i_1357_ & 0xff00) * i_1351_) & 0xff0000)) >> 8;
								}
								is[i_1292_++] = i_1357_;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 2) {
						int i_1358_ = i_1289_ >>> 24;
						int i_1359_ = 256 - i_1358_;
						int i_1360_ = (i_1289_ & 0xff00ff) * i_1359_ & ~0xff00ff;
						int i_1361_ = (i_1289_ & 0xff00) * i_1359_ & 0xff0000;
						i_1289_ = (i_1360_ | i_1361_) >>> 8;
						for (int i_1362_ = -i_1294_; i_1362_ < 0; i_1362_++) {
							for (int i_1363_ = -i_1295_; i_1363_ < 0; i_1363_++) {
								int i_1364_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1364_ != 0) {
									i_1360_ = ((i_1364_ & 0xff00ff) * i_1358_ & ~0xff00ff);
									i_1361_ = ((i_1364_ & 0xff00) * i_1358_ & 0xff0000);
									is[i_1292_++] = ((i_1360_ | i_1361_) >>> 8) + i_1289_;
								} else
									i_1292_++;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1290_ == 2) {
					if (i_1288_ == 1) {
						for (int i_1365_ = -i_1294_; i_1365_ < 0; i_1365_++) {
							for (int i_1366_ = -i_1295_; i_1366_ < 0; i_1366_++) {
								int i_1367_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1367_ != 0) {
									int i_1368_ = is[i_1292_];
									int i_1369_ = i_1367_ + i_1368_;
									int i_1370_ = ((i_1367_ & 0xff00ff) + (i_1368_ & 0xff00ff));
									i_1368_ = ((i_1370_ & 0x1000100) + (i_1369_ - i_1370_ & 0x10000));
									is[i_1292_++] = (i_1369_ - i_1368_ | i_1368_ - (i_1368_ >>> 8));
								} else
									i_1292_++;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 0) {
						int i_1371_ = (i_1289_ & 0xff0000) >> 16;
						int i_1372_ = (i_1289_ & 0xff00) >> 8;
						int i_1373_ = i_1289_ & 0xff;
						for (int i_1374_ = -i_1294_; i_1374_ < 0; i_1374_++) {
							for (int i_1375_ = -i_1295_; i_1375_ < 0; i_1375_++) {
								int i_1376_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1376_ != 0) {
									int i_1377_ = ((i_1376_ & 0xff0000) * i_1371_ & ~0xffffff);
									int i_1378_ = ((i_1376_ & 0xff00) * i_1372_ & 0xff0000);
									int i_1379_ = (i_1376_ & 0xff) * i_1373_ & 0xff00;
									i_1376_ = (i_1377_ | i_1378_ | i_1379_) >>> 8;
									int i_1380_ = is[i_1292_];
									int i_1381_ = i_1376_ + i_1380_;
									int i_1382_ = ((i_1376_ & 0xff00ff) + (i_1380_ & 0xff00ff));
									i_1380_ = ((i_1382_ & 0x1000100) + (i_1381_ - i_1382_ & 0x10000));
									is[i_1292_++] = (i_1381_ - i_1380_ | i_1380_ - (i_1380_ >>> 8));
								} else
									i_1292_++;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 3) {
						for (int i_1383_ = -i_1294_; i_1383_ < 0; i_1383_++) {
							for (int i_1384_ = -i_1295_; i_1384_ < 0; i_1384_++) {
								int i_1385_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								int i_1386_ = i_1385_ + i_1289_;
								int i_1387_ = ((i_1385_ & 0xff00ff) + (i_1289_ & 0xff00ff));
								int i_1388_ = ((i_1387_ & 0x1000100) + (i_1386_ - i_1387_ & 0x10000));
								i_1385_ = i_1386_ - i_1388_ | i_1388_ - (i_1388_ >>> 8);
								i_1388_ = is[i_1292_];
								i_1386_ = i_1385_ + i_1388_;
								i_1387_ = (i_1385_ & 0xff00ff) + (i_1388_ & 0xff00ff);
								i_1388_ = ((i_1387_ & 0x1000100) + (i_1386_ - i_1387_ & 0x10000));
								is[i_1292_++] = i_1386_ - i_1388_ | i_1388_ - (i_1388_ >>> 8);
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else if (i_1288_ == 2) {
						int i_1389_ = i_1289_ >>> 24;
						int i_1390_ = 256 - i_1389_;
						int i_1391_ = (i_1289_ & 0xff00ff) * i_1390_ & ~0xff00ff;
						int i_1392_ = (i_1289_ & 0xff00) * i_1390_ & 0xff0000;
						i_1289_ = (i_1391_ | i_1392_) >>> 8;
						for (int i_1393_ = -i_1294_; i_1393_ < 0; i_1393_++) {
							for (int i_1394_ = -i_1295_; i_1394_ < 0; i_1394_++) {
								int i_1395_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1293_++]);
								if (i_1395_ != 0) {
									i_1391_ = ((i_1395_ & 0xff00ff) * i_1389_ & ~0xff00ff);
									i_1392_ = ((i_1395_ & 0xff00) * i_1389_ & 0xff0000);
									i_1395_ = (((i_1391_ | i_1392_) >>> 8) + i_1289_);
									int i_1396_ = is[i_1292_];
									int i_1397_ = i_1395_ + i_1396_;
									int i_1398_ = ((i_1395_ & 0xff00ff) + (i_1396_ & 0xff00ff));
									i_1396_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
									is[i_1292_++] = (i_1397_ - i_1396_ | i_1396_ - (i_1396_ >>> 8));
								} else
									i_1292_++;
							}
							i_1292_ += i_1296_;
							i_1293_ += i_1297_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2626(int i, int i_1399_, Class167 class167, int i_1400_, int i_1401_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub2) this).anInt10942;
			i_1399_ += ((Class161_Sub3_Sub2) this).anInt10929;
			int i_1402_ = 0;
			int i_1403_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_1404_ = ((Class161_Sub3_Sub2) this).anInt10945;
			int i_1405_ = ((Class161_Sub3_Sub2) this).anInt10930;
			int i_1406_ = i_1403_ - i_1404_;
			int i_1407_ = 0;
			int i_1408_ = i + i_1399_ * i_1403_;
			if (i_1399_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1409_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1399_);
				i_1405_ -= i_1409_;
				i_1399_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1402_ += i_1409_ * i_1404_;
				i_1408_ += i_1409_ * i_1403_;
			}
			if (i_1399_ + i_1405_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1405_ -= (i_1399_ + i_1405_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1410_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1404_ -= i_1410_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1402_ += i_1410_;
				i_1408_ += i_1410_;
				i_1407_ += i_1410_;
				i_1406_ += i_1410_;
			}
			if (i + i_1404_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1411_ = (i + i_1404_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1404_ -= i_1411_;
				i_1407_ += i_1411_;
				i_1406_ += i_1411_;
			}
			if (i_1404_ > 0 && i_1405_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_1412_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_1413_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_1414_ = i_1399_;
				if (i_1401_ > i_1414_) {
					i_1414_ = i_1401_;
					i_1408_ += (i_1401_ - i_1399_) * i_1403_;
					i_1402_ += ((i_1401_ - i_1399_) * ((Class161_Sub3_Sub2) this).anInt10945);
				}
				int i_1415_ = (i_1401_ + is_1412_.length < i_1399_ + i_1405_ ? i_1401_ + is_1412_.length : i_1399_ + i_1405_);
				for (int i_1416_ = i_1414_; i_1416_ < i_1415_; i_1416_++) {
					int i_1417_ = is_1412_[i_1416_ - i_1401_] + i_1400_;
					int i_1418_ = is_1413_[i_1416_ - i_1401_];
					int i_1419_ = i_1404_;
					if (i > i_1417_) {
						int i_1420_ = i - i_1417_;
						if (i_1420_ >= i_1418_) {
							i_1402_ += i_1404_ + i_1407_;
							i_1408_ += i_1404_ + i_1406_;
							continue;
						}
						i_1418_ -= i_1420_;
					} else {
						int i_1421_ = i_1417_ - i;
						if (i_1421_ >= i_1404_) {
							i_1402_ += i_1404_ + i_1407_;
							i_1408_ += i_1404_ + i_1406_;
							continue;
						}
						i_1402_ += i_1421_;
						i_1419_ -= i_1421_;
						i_1408_ += i_1421_;
					}
					int i_1422_ = 0;
					if (i_1419_ < i_1418_)
						i_1418_ = i_1419_;
					else
						i_1422_ = i_1419_ - i_1418_;
					for (int i_1423_ = -i_1418_; i_1423_ < 0; i_1423_++) {
						int i_1424_ = (((Class161_Sub3_Sub2) this).anIntArray11237[i_1402_++]);
						if (i_1424_ != 0)
							is[i_1408_++] = i_1424_;
						else
							i_1408_++;
					}
					i_1402_ += i_1422_ + i_1407_;
					i_1408_ += i_1422_ + i_1406_;
				}
			}
		}
	}

	void method2622(int i, int i_1425_, int i_1426_, int i_1427_, int i_1428_, int i_1429_, int i_1430_, int i_1431_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1426_ > 0 && i_1427_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_1432_ = 0;
				int i_1433_ = 0;
				int i_1434_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_1435_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_1436_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_1437_ = (i_1435_ << 16) / i_1426_;
				int i_1438_ = (i_1436_ << 16) / i_1427_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_1439_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_1437_ - 1) / i_1437_);
					i += i_1439_;
					i_1432_ += (i_1439_ * i_1437_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_1440_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_1438_ - 1) / i_1438_);
					i_1425_ += i_1440_;
					i_1433_ += (i_1440_ * i_1438_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_1435_)
					i_1426_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_1432_ + i_1437_ - 1) / i_1437_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_1436_)
					i_1427_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_1433_ + i_1438_ - 1) / i_1438_;
				int i_1441_ = i + i_1425_ * i_1434_;
				int i_1442_ = i_1434_ - i_1426_;
				if (i_1425_ + i_1427_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_1427_ -= (i_1425_ + i_1427_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_1425_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_1443_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_1425_);
					i_1427_ -= i_1443_;
					i_1441_ += i_1443_ * i_1434_;
					i_1433_ += i_1438_ * i_1443_;
				}
				if (i + i_1426_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_1444_ = (i + i_1426_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1426_ -= i_1444_;
					i_1442_ += i_1444_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_1445_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_1426_ -= i_1445_;
					i_1441_ += i_1445_;
					i_1432_ += i_1437_ * i_1445_;
					i_1442_ += i_1445_;
				}
				if (i_1430_ == 0) {
					if (i_1428_ == 1) {
						int i_1446_ = i_1432_;
						for (int i_1447_ = -i_1427_; i_1447_ < 0; i_1447_++) {
							int i_1448_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1449_ = -i_1426_; i_1449_ < 0; i_1449_++) {
								is[i_1441_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1448_]);
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1446_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 0) {
						int i_1450_ = (i_1429_ & 0xff0000) >> 16;
						int i_1451_ = (i_1429_ & 0xff00) >> 8;
						int i_1452_ = i_1429_ & 0xff;
						int i_1453_ = i_1432_;
						for (int i_1454_ = -i_1427_; i_1454_ < 0; i_1454_++) {
							int i_1455_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1456_ = -i_1426_; i_1456_ < 0; i_1456_++) {
								int i_1457_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1455_]);
								int i_1458_ = ((i_1457_ & 0xff0000) * i_1450_ & ~0xffffff);
								int i_1459_ = (i_1457_ & 0xff00) * i_1451_ & 0xff0000;
								int i_1460_ = (i_1457_ & 0xff) * i_1452_ & 0xff00;
								is[i_1441_++] = (i_1458_ | i_1459_ | i_1460_) >>> 8;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1453_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 3) {
						int i_1461_ = i_1432_;
						for (int i_1462_ = -i_1427_; i_1462_ < 0; i_1462_++) {
							int i_1463_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1464_ = -i_1426_; i_1464_ < 0; i_1464_++) {
								int i_1465_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1463_]);
								int i_1466_ = i_1465_ + i_1429_;
								int i_1467_ = ((i_1465_ & 0xff00ff) + (i_1429_ & 0xff00ff));
								int i_1468_ = ((i_1467_ & 0x1000100) + (i_1466_ - i_1467_ & 0x10000));
								is[i_1441_++] = i_1466_ - i_1468_ | i_1468_ - (i_1468_ >>> 8);
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1461_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 2) {
						int i_1469_ = i_1429_ >>> 24;
						int i_1470_ = 256 - i_1469_;
						int i_1471_ = (i_1429_ & 0xff00ff) * i_1470_ & ~0xff00ff;
						int i_1472_ = (i_1429_ & 0xff00) * i_1470_ & 0xff0000;
						i_1429_ = (i_1471_ | i_1472_) >>> 8;
						int i_1473_ = i_1432_;
						for (int i_1474_ = -i_1427_; i_1474_ < 0; i_1474_++) {
							int i_1475_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1476_ = -i_1426_; i_1476_ < 0; i_1476_++) {
								int i_1477_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1475_]);
								i_1471_ = ((i_1477_ & 0xff00ff) * i_1469_ & ~0xff00ff);
								i_1472_ = (i_1477_ & 0xff00) * i_1469_ & 0xff0000;
								is[i_1441_++] = ((i_1471_ | i_1472_) >>> 8) + i_1429_;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1473_;
							i_1441_ += i_1442_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1430_ == 1) {
					if (i_1428_ == 1) {
						int i_1478_ = i_1432_;
						for (int i_1479_ = -i_1427_; i_1479_ < 0; i_1479_++) {
							int i_1480_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1481_ = -i_1426_; i_1481_ < 0; i_1481_++) {
								int i_1482_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1480_]);
								if (i_1482_ != 0)
									is[i_1441_++] = i_1482_;
								else
									i_1441_++;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1478_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 0) {
						int i_1483_ = i_1432_;
						if ((i_1429_ & 0xffffff) == 16777215) {
							int i_1484_ = i_1429_ >>> 24;
							int i_1485_ = 256 - i_1484_;
							for (int i_1486_ = -i_1427_; i_1486_ < 0; i_1486_++) {
								int i_1487_ = ((i_1433_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1488_ = -i_1426_; i_1488_ < 0; i_1488_++) {
									int i_1489_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1487_]);
									if (i_1489_ != 0) {
										int i_1490_ = is[i_1441_];
										is[i_1441_++] = ((((i_1489_ & 0xff00ff) * i_1484_ + ((i_1490_ & 0xff00ff) * i_1485_)) & ~0xff00ff) + (((i_1489_ & 0xff00) * i_1484_ + ((i_1490_ & 0xff00) * i_1485_)) & 0xff0000)) >> 8;
									} else
										i_1441_++;
									i_1432_ += i_1437_;
								}
								i_1433_ += i_1438_;
								i_1432_ = i_1483_;
								i_1441_ += i_1442_;
							}
						} else {
							int i_1491_ = (i_1429_ & 0xff0000) >> 16;
							int i_1492_ = (i_1429_ & 0xff00) >> 8;
							int i_1493_ = i_1429_ & 0xff;
							int i_1494_ = i_1429_ >>> 24;
							int i_1495_ = 256 - i_1494_;
							for (int i_1496_ = -i_1427_; i_1496_ < 0; i_1496_++) {
								int i_1497_ = ((i_1433_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1498_ = -i_1426_; i_1498_ < 0; i_1498_++) {
									int i_1499_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1497_]);
									if (i_1499_ != 0) {
										if (i_1494_ != 255) {
											int i_1500_ = (((i_1499_ & 0xff0000) * i_1491_) & ~0xffffff);
											int i_1501_ = ((i_1499_ & 0xff00) * i_1492_ & 0xff0000);
											int i_1502_ = ((i_1499_ & 0xff) * i_1493_ & 0xff00);
											i_1499_ = (i_1500_ | i_1501_ | i_1502_) >>> 8;
											int i_1503_ = is[i_1441_];
											is[i_1441_++] = (((((i_1499_ & 0xff00ff) * i_1494_) + ((i_1503_ & 0xff00ff) * i_1495_)) & ~0xff00ff) + ((((i_1499_ & 0xff00) * i_1494_) + ((i_1503_ & 0xff00) * i_1495_)) & 0xff0000)) >> 8;
										} else {
											int i_1504_ = (((i_1499_ & 0xff0000) * i_1491_) & ~0xffffff);
											int i_1505_ = ((i_1499_ & 0xff00) * i_1492_ & 0xff0000);
											int i_1506_ = ((i_1499_ & 0xff) * i_1493_ & 0xff00);
											is[i_1441_++] = (i_1504_ | i_1505_ | i_1506_) >>> 8;
										}
									} else
										i_1441_++;
									i_1432_ += i_1437_;
								}
								i_1433_ += i_1438_;
								i_1432_ = i_1483_;
								i_1441_ += i_1442_;
							}
						}
					} else if (i_1428_ == 3) {
						int i_1507_ = i_1432_;
						int i_1508_ = i_1429_ >>> 24;
						int i_1509_ = 256 - i_1508_;
						for (int i_1510_ = -i_1427_; i_1510_ < 0; i_1510_++) {
							int i_1511_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1512_ = -i_1426_; i_1512_ < 0; i_1512_++) {
								int i_1513_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1511_]);
								int i_1514_ = i_1513_ + i_1429_;
								int i_1515_ = ((i_1513_ & 0xff00ff) + (i_1429_ & 0xff00ff));
								int i_1516_ = ((i_1515_ & 0x1000100) + (i_1514_ - i_1515_ & 0x10000));
								i_1516_ = i_1514_ - i_1516_ | i_1516_ - (i_1516_ >>> 8);
								if (i_1513_ == 0 && i_1508_ != 255) {
									i_1513_ = i_1516_;
									i_1516_ = is[i_1441_];
									i_1516_ = ((((i_1513_ & 0xff00ff) * i_1508_ + (i_1516_ & 0xff00ff) * i_1509_) & ~0xff00ff) + (((i_1513_ & 0xff00) * i_1508_ + (i_1516_ & 0xff00) * i_1509_) & 0xff0000)) >> 8;
								}
								is[i_1441_++] = i_1516_;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1507_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 2) {
						int i_1517_ = i_1429_ >>> 24;
						int i_1518_ = 256 - i_1517_;
						int i_1519_ = (i_1429_ & 0xff00ff) * i_1518_ & ~0xff00ff;
						int i_1520_ = (i_1429_ & 0xff00) * i_1518_ & 0xff0000;
						i_1429_ = (i_1519_ | i_1520_) >>> 8;
						int i_1521_ = i_1432_;
						for (int i_1522_ = -i_1427_; i_1522_ < 0; i_1522_++) {
							int i_1523_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1524_ = -i_1426_; i_1524_ < 0; i_1524_++) {
								int i_1525_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1523_]);
								if (i_1525_ != 0) {
									i_1519_ = ((i_1525_ & 0xff00ff) * i_1517_ & ~0xff00ff);
									i_1520_ = ((i_1525_ & 0xff00) * i_1517_ & 0xff0000);
									is[i_1441_++] = ((i_1519_ | i_1520_) >>> 8) + i_1429_;
								} else
									i_1441_++;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1521_;
							i_1441_ += i_1442_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1430_ == 2) {
					if (i_1428_ == 1) {
						int i_1526_ = i_1432_;
						for (int i_1527_ = -i_1427_; i_1527_ < 0; i_1527_++) {
							int i_1528_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1529_ = -i_1426_; i_1529_ < 0; i_1529_++) {
								int i_1530_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1528_]);
								if (i_1530_ != 0) {
									int i_1531_ = is[i_1441_];
									int i_1532_ = i_1530_ + i_1531_;
									int i_1533_ = ((i_1530_ & 0xff00ff) + (i_1531_ & 0xff00ff));
									i_1531_ = ((i_1533_ & 0x1000100) + (i_1532_ - i_1533_ & 0x10000));
									is[i_1441_++] = (i_1532_ - i_1531_ | i_1531_ - (i_1531_ >>> 8));
								} else
									i_1441_++;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1526_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 0) {
						int i_1534_ = i_1432_;
						int i_1535_ = (i_1429_ & 0xff0000) >> 16;
						int i_1536_ = (i_1429_ & 0xff00) >> 8;
						int i_1537_ = i_1429_ & 0xff;
						for (int i_1538_ = -i_1427_; i_1538_ < 0; i_1538_++) {
							int i_1539_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1540_ = -i_1426_; i_1540_ < 0; i_1540_++) {
								int i_1541_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1539_]);
								if (i_1541_ != 0) {
									int i_1542_ = ((i_1541_ & 0xff0000) * i_1535_ & ~0xffffff);
									int i_1543_ = ((i_1541_ & 0xff00) * i_1536_ & 0xff0000);
									int i_1544_ = (i_1541_ & 0xff) * i_1537_ & 0xff00;
									i_1541_ = (i_1542_ | i_1543_ | i_1544_) >>> 8;
									int i_1545_ = is[i_1441_];
									int i_1546_ = i_1541_ + i_1545_;
									int i_1547_ = ((i_1541_ & 0xff00ff) + (i_1545_ & 0xff00ff));
									i_1545_ = ((i_1547_ & 0x1000100) + (i_1546_ - i_1547_ & 0x10000));
									is[i_1441_++] = (i_1546_ - i_1545_ | i_1545_ - (i_1545_ >>> 8));
								} else
									i_1441_++;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1534_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 3) {
						int i_1548_ = i_1432_;
						for (int i_1549_ = -i_1427_; i_1549_ < 0; i_1549_++) {
							int i_1550_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1551_ = -i_1426_; i_1551_ < 0; i_1551_++) {
								int i_1552_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1550_]);
								int i_1553_ = i_1552_ + i_1429_;
								int i_1554_ = ((i_1552_ & 0xff00ff) + (i_1429_ & 0xff00ff));
								int i_1555_ = ((i_1554_ & 0x1000100) + (i_1553_ - i_1554_ & 0x10000));
								i_1552_ = i_1553_ - i_1555_ | i_1555_ - (i_1555_ >>> 8);
								i_1555_ = is[i_1441_];
								i_1553_ = i_1552_ + i_1555_;
								i_1554_ = (i_1552_ & 0xff00ff) + (i_1555_ & 0xff00ff);
								i_1555_ = ((i_1554_ & 0x1000100) + (i_1553_ - i_1554_ & 0x10000));
								is[i_1441_++] = i_1553_ - i_1555_ | i_1555_ - (i_1555_ >>> 8);
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1548_;
							i_1441_ += i_1442_;
						}
					} else if (i_1428_ == 2) {
						int i_1556_ = i_1429_ >>> 24;
						int i_1557_ = 256 - i_1556_;
						int i_1558_ = (i_1429_ & 0xff00ff) * i_1557_ & ~0xff00ff;
						int i_1559_ = (i_1429_ & 0xff00) * i_1557_ & 0xff0000;
						i_1429_ = (i_1558_ | i_1559_) >>> 8;
						int i_1560_ = i_1432_;
						for (int i_1561_ = -i_1427_; i_1561_ < 0; i_1561_++) {
							int i_1562_ = ((i_1433_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1563_ = -i_1426_; i_1563_ < 0; i_1563_++) {
								int i_1564_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1432_ >> 16) + i_1562_]);
								if (i_1564_ != 0) {
									i_1558_ = ((i_1564_ & 0xff00ff) * i_1556_ & ~0xff00ff);
									i_1559_ = ((i_1564_ & 0xff00) * i_1556_ & 0xff0000);
									i_1564_ = (((i_1558_ | i_1559_) >>> 8) + i_1429_);
									int i_1565_ = is[i_1441_];
									int i_1566_ = i_1564_ + i_1565_;
									int i_1567_ = ((i_1564_ & 0xff00ff) + (i_1565_ & 0xff00ff));
									i_1565_ = ((i_1567_ & 0x1000100) + (i_1566_ - i_1567_ & 0x10000));
									is[i_1441_++] = (i_1566_ - i_1565_ | i_1565_ - (i_1565_ >>> 8));
								} else
									i_1441_++;
								i_1432_ += i_1437_;
							}
							i_1433_ += i_1438_;
							i_1432_ = i_1560_;
							i_1441_ += i_1442_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2623(int i, int i_1568_, int i_1569_, int i_1570_, int i_1571_, int i_1572_, int i_1573_, int i_1574_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1569_ > 0 && i_1570_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_1575_ = 0;
				int i_1576_ = 0;
				int i_1577_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_1578_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_1579_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_1580_ = (i_1578_ << 16) / i_1569_;
				int i_1581_ = (i_1579_ << 16) / i_1570_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_1582_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_1580_ - 1) / i_1580_);
					i += i_1582_;
					i_1575_ += (i_1582_ * i_1580_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_1583_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_1581_ - 1) / i_1581_);
					i_1568_ += i_1583_;
					i_1576_ += (i_1583_ * i_1581_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_1578_)
					i_1569_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_1575_ + i_1580_ - 1) / i_1580_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_1579_)
					i_1570_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_1576_ + i_1581_ - 1) / i_1581_;
				int i_1584_ = i + i_1568_ * i_1577_;
				int i_1585_ = i_1577_ - i_1569_;
				if (i_1568_ + i_1570_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_1570_ -= (i_1568_ + i_1570_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_1568_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_1586_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_1568_);
					i_1570_ -= i_1586_;
					i_1584_ += i_1586_ * i_1577_;
					i_1576_ += i_1581_ * i_1586_;
				}
				if (i + i_1569_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_1587_ = (i + i_1569_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1569_ -= i_1587_;
					i_1585_ += i_1587_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_1588_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_1569_ -= i_1588_;
					i_1584_ += i_1588_;
					i_1575_ += i_1580_ * i_1588_;
					i_1585_ += i_1588_;
				}
				if (i_1573_ == 0) {
					if (i_1571_ == 1) {
						int i_1589_ = i_1575_;
						for (int i_1590_ = -i_1570_; i_1590_ < 0; i_1590_++) {
							int i_1591_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1592_ = -i_1569_; i_1592_ < 0; i_1592_++) {
								is[i_1584_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1591_]);
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1589_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 0) {
						int i_1593_ = (i_1572_ & 0xff0000) >> 16;
						int i_1594_ = (i_1572_ & 0xff00) >> 8;
						int i_1595_ = i_1572_ & 0xff;
						int i_1596_ = i_1575_;
						for (int i_1597_ = -i_1570_; i_1597_ < 0; i_1597_++) {
							int i_1598_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1599_ = -i_1569_; i_1599_ < 0; i_1599_++) {
								int i_1600_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1598_]);
								int i_1601_ = ((i_1600_ & 0xff0000) * i_1593_ & ~0xffffff);
								int i_1602_ = (i_1600_ & 0xff00) * i_1594_ & 0xff0000;
								int i_1603_ = (i_1600_ & 0xff) * i_1595_ & 0xff00;
								is[i_1584_++] = (i_1601_ | i_1602_ | i_1603_) >>> 8;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1596_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 3) {
						int i_1604_ = i_1575_;
						for (int i_1605_ = -i_1570_; i_1605_ < 0; i_1605_++) {
							int i_1606_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1607_ = -i_1569_; i_1607_ < 0; i_1607_++) {
								int i_1608_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1606_]);
								int i_1609_ = i_1608_ + i_1572_;
								int i_1610_ = ((i_1608_ & 0xff00ff) + (i_1572_ & 0xff00ff));
								int i_1611_ = ((i_1610_ & 0x1000100) + (i_1609_ - i_1610_ & 0x10000));
								is[i_1584_++] = i_1609_ - i_1611_ | i_1611_ - (i_1611_ >>> 8);
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1604_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 2) {
						int i_1612_ = i_1572_ >>> 24;
						int i_1613_ = 256 - i_1612_;
						int i_1614_ = (i_1572_ & 0xff00ff) * i_1613_ & ~0xff00ff;
						int i_1615_ = (i_1572_ & 0xff00) * i_1613_ & 0xff0000;
						i_1572_ = (i_1614_ | i_1615_) >>> 8;
						int i_1616_ = i_1575_;
						for (int i_1617_ = -i_1570_; i_1617_ < 0; i_1617_++) {
							int i_1618_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1619_ = -i_1569_; i_1619_ < 0; i_1619_++) {
								int i_1620_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1618_]);
								i_1614_ = ((i_1620_ & 0xff00ff) * i_1612_ & ~0xff00ff);
								i_1615_ = (i_1620_ & 0xff00) * i_1612_ & 0xff0000;
								is[i_1584_++] = ((i_1614_ | i_1615_) >>> 8) + i_1572_;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1616_;
							i_1584_ += i_1585_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1573_ == 1) {
					if (i_1571_ == 1) {
						int i_1621_ = i_1575_;
						for (int i_1622_ = -i_1570_; i_1622_ < 0; i_1622_++) {
							int i_1623_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1624_ = -i_1569_; i_1624_ < 0; i_1624_++) {
								int i_1625_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1623_]);
								if (i_1625_ != 0)
									is[i_1584_++] = i_1625_;
								else
									i_1584_++;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1621_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 0) {
						int i_1626_ = i_1575_;
						if ((i_1572_ & 0xffffff) == 16777215) {
							int i_1627_ = i_1572_ >>> 24;
							int i_1628_ = 256 - i_1627_;
							for (int i_1629_ = -i_1570_; i_1629_ < 0; i_1629_++) {
								int i_1630_ = ((i_1576_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1631_ = -i_1569_; i_1631_ < 0; i_1631_++) {
									int i_1632_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1630_]);
									if (i_1632_ != 0) {
										int i_1633_ = is[i_1584_];
										is[i_1584_++] = ((((i_1632_ & 0xff00ff) * i_1627_ + ((i_1633_ & 0xff00ff) * i_1628_)) & ~0xff00ff) + (((i_1632_ & 0xff00) * i_1627_ + ((i_1633_ & 0xff00) * i_1628_)) & 0xff0000)) >> 8;
									} else
										i_1584_++;
									i_1575_ += i_1580_;
								}
								i_1576_ += i_1581_;
								i_1575_ = i_1626_;
								i_1584_ += i_1585_;
							}
						} else {
							int i_1634_ = (i_1572_ & 0xff0000) >> 16;
							int i_1635_ = (i_1572_ & 0xff00) >> 8;
							int i_1636_ = i_1572_ & 0xff;
							int i_1637_ = i_1572_ >>> 24;
							int i_1638_ = 256 - i_1637_;
							for (int i_1639_ = -i_1570_; i_1639_ < 0; i_1639_++) {
								int i_1640_ = ((i_1576_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1641_ = -i_1569_; i_1641_ < 0; i_1641_++) {
									int i_1642_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1640_]);
									if (i_1642_ != 0) {
										if (i_1637_ != 255) {
											int i_1643_ = (((i_1642_ & 0xff0000) * i_1634_) & ~0xffffff);
											int i_1644_ = ((i_1642_ & 0xff00) * i_1635_ & 0xff0000);
											int i_1645_ = ((i_1642_ & 0xff) * i_1636_ & 0xff00);
											i_1642_ = (i_1643_ | i_1644_ | i_1645_) >>> 8;
											int i_1646_ = is[i_1584_];
											is[i_1584_++] = (((((i_1642_ & 0xff00ff) * i_1637_) + ((i_1646_ & 0xff00ff) * i_1638_)) & ~0xff00ff) + ((((i_1642_ & 0xff00) * i_1637_) + ((i_1646_ & 0xff00) * i_1638_)) & 0xff0000)) >> 8;
										} else {
											int i_1647_ = (((i_1642_ & 0xff0000) * i_1634_) & ~0xffffff);
											int i_1648_ = ((i_1642_ & 0xff00) * i_1635_ & 0xff0000);
											int i_1649_ = ((i_1642_ & 0xff) * i_1636_ & 0xff00);
											is[i_1584_++] = (i_1647_ | i_1648_ | i_1649_) >>> 8;
										}
									} else
										i_1584_++;
									i_1575_ += i_1580_;
								}
								i_1576_ += i_1581_;
								i_1575_ = i_1626_;
								i_1584_ += i_1585_;
							}
						}
					} else if (i_1571_ == 3) {
						int i_1650_ = i_1575_;
						int i_1651_ = i_1572_ >>> 24;
						int i_1652_ = 256 - i_1651_;
						for (int i_1653_ = -i_1570_; i_1653_ < 0; i_1653_++) {
							int i_1654_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1655_ = -i_1569_; i_1655_ < 0; i_1655_++) {
								int i_1656_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1654_]);
								int i_1657_ = i_1656_ + i_1572_;
								int i_1658_ = ((i_1656_ & 0xff00ff) + (i_1572_ & 0xff00ff));
								int i_1659_ = ((i_1658_ & 0x1000100) + (i_1657_ - i_1658_ & 0x10000));
								i_1659_ = i_1657_ - i_1659_ | i_1659_ - (i_1659_ >>> 8);
								if (i_1656_ == 0 && i_1651_ != 255) {
									i_1656_ = i_1659_;
									i_1659_ = is[i_1584_];
									i_1659_ = ((((i_1656_ & 0xff00ff) * i_1651_ + (i_1659_ & 0xff00ff) * i_1652_) & ~0xff00ff) + (((i_1656_ & 0xff00) * i_1651_ + (i_1659_ & 0xff00) * i_1652_) & 0xff0000)) >> 8;
								}
								is[i_1584_++] = i_1659_;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1650_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 2) {
						int i_1660_ = i_1572_ >>> 24;
						int i_1661_ = 256 - i_1660_;
						int i_1662_ = (i_1572_ & 0xff00ff) * i_1661_ & ~0xff00ff;
						int i_1663_ = (i_1572_ & 0xff00) * i_1661_ & 0xff0000;
						i_1572_ = (i_1662_ | i_1663_) >>> 8;
						int i_1664_ = i_1575_;
						for (int i_1665_ = -i_1570_; i_1665_ < 0; i_1665_++) {
							int i_1666_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1667_ = -i_1569_; i_1667_ < 0; i_1667_++) {
								int i_1668_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1666_]);
								if (i_1668_ != 0) {
									i_1662_ = ((i_1668_ & 0xff00ff) * i_1660_ & ~0xff00ff);
									i_1663_ = ((i_1668_ & 0xff00) * i_1660_ & 0xff0000);
									is[i_1584_++] = ((i_1662_ | i_1663_) >>> 8) + i_1572_;
								} else
									i_1584_++;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1664_;
							i_1584_ += i_1585_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1573_ == 2) {
					if (i_1571_ == 1) {
						int i_1669_ = i_1575_;
						for (int i_1670_ = -i_1570_; i_1670_ < 0; i_1670_++) {
							int i_1671_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1672_ = -i_1569_; i_1672_ < 0; i_1672_++) {
								int i_1673_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1671_]);
								if (i_1673_ != 0) {
									int i_1674_ = is[i_1584_];
									int i_1675_ = i_1673_ + i_1674_;
									int i_1676_ = ((i_1673_ & 0xff00ff) + (i_1674_ & 0xff00ff));
									i_1674_ = ((i_1676_ & 0x1000100) + (i_1675_ - i_1676_ & 0x10000));
									is[i_1584_++] = (i_1675_ - i_1674_ | i_1674_ - (i_1674_ >>> 8));
								} else
									i_1584_++;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1669_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 0) {
						int i_1677_ = i_1575_;
						int i_1678_ = (i_1572_ & 0xff0000) >> 16;
						int i_1679_ = (i_1572_ & 0xff00) >> 8;
						int i_1680_ = i_1572_ & 0xff;
						for (int i_1681_ = -i_1570_; i_1681_ < 0; i_1681_++) {
							int i_1682_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1683_ = -i_1569_; i_1683_ < 0; i_1683_++) {
								int i_1684_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1682_]);
								if (i_1684_ != 0) {
									int i_1685_ = ((i_1684_ & 0xff0000) * i_1678_ & ~0xffffff);
									int i_1686_ = ((i_1684_ & 0xff00) * i_1679_ & 0xff0000);
									int i_1687_ = (i_1684_ & 0xff) * i_1680_ & 0xff00;
									i_1684_ = (i_1685_ | i_1686_ | i_1687_) >>> 8;
									int i_1688_ = is[i_1584_];
									int i_1689_ = i_1684_ + i_1688_;
									int i_1690_ = ((i_1684_ & 0xff00ff) + (i_1688_ & 0xff00ff));
									i_1688_ = ((i_1690_ & 0x1000100) + (i_1689_ - i_1690_ & 0x10000));
									is[i_1584_++] = (i_1689_ - i_1688_ | i_1688_ - (i_1688_ >>> 8));
								} else
									i_1584_++;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1677_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 3) {
						int i_1691_ = i_1575_;
						for (int i_1692_ = -i_1570_; i_1692_ < 0; i_1692_++) {
							int i_1693_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1694_ = -i_1569_; i_1694_ < 0; i_1694_++) {
								int i_1695_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1693_]);
								int i_1696_ = i_1695_ + i_1572_;
								int i_1697_ = ((i_1695_ & 0xff00ff) + (i_1572_ & 0xff00ff));
								int i_1698_ = ((i_1697_ & 0x1000100) + (i_1696_ - i_1697_ & 0x10000));
								i_1695_ = i_1696_ - i_1698_ | i_1698_ - (i_1698_ >>> 8);
								i_1698_ = is[i_1584_];
								i_1696_ = i_1695_ + i_1698_;
								i_1697_ = (i_1695_ & 0xff00ff) + (i_1698_ & 0xff00ff);
								i_1698_ = ((i_1697_ & 0x1000100) + (i_1696_ - i_1697_ & 0x10000));
								is[i_1584_++] = i_1696_ - i_1698_ | i_1698_ - (i_1698_ >>> 8);
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1691_;
							i_1584_ += i_1585_;
						}
					} else if (i_1571_ == 2) {
						int i_1699_ = i_1572_ >>> 24;
						int i_1700_ = 256 - i_1699_;
						int i_1701_ = (i_1572_ & 0xff00ff) * i_1700_ & ~0xff00ff;
						int i_1702_ = (i_1572_ & 0xff00) * i_1700_ & 0xff0000;
						i_1572_ = (i_1701_ | i_1702_) >>> 8;
						int i_1703_ = i_1575_;
						for (int i_1704_ = -i_1570_; i_1704_ < 0; i_1704_++) {
							int i_1705_ = ((i_1576_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1706_ = -i_1569_; i_1706_ < 0; i_1706_++) {
								int i_1707_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1575_ >> 16) + i_1705_]);
								if (i_1707_ != 0) {
									i_1701_ = ((i_1707_ & 0xff00ff) * i_1699_ & ~0xff00ff);
									i_1702_ = ((i_1707_ & 0xff00) * i_1699_ & 0xff0000);
									i_1707_ = (((i_1701_ | i_1702_) >>> 8) + i_1572_);
									int i_1708_ = is[i_1584_];
									int i_1709_ = i_1707_ + i_1708_;
									int i_1710_ = ((i_1707_ & 0xff00ff) + (i_1708_ & 0xff00ff));
									i_1708_ = ((i_1710_ & 0x1000100) + (i_1709_ - i_1710_ & 0x10000));
									is[i_1584_++] = (i_1709_ - i_1708_ | i_1708_ - (i_1708_ >>> 8));
								} else
									i_1584_++;
								i_1575_ += i_1580_;
							}
							i_1576_ += i_1581_;
							i_1575_ = i_1703_;
							i_1584_ += i_1585_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2624(int i, int i_1711_, int i_1712_, int i_1713_, int i_1714_, int i_1715_, int i_1716_, int i_1717_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1712_ > 0 && i_1713_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_1718_ = 0;
				int i_1719_ = 0;
				int i_1720_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_1721_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_1722_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_1723_ = (i_1721_ << 16) / i_1712_;
				int i_1724_ = (i_1722_ << 16) / i_1713_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_1725_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_1723_ - 1) / i_1723_);
					i += i_1725_;
					i_1718_ += (i_1725_ * i_1723_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_1726_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_1724_ - 1) / i_1724_);
					i_1711_ += i_1726_;
					i_1719_ += (i_1726_ * i_1724_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_1721_)
					i_1712_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_1718_ + i_1723_ - 1) / i_1723_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_1722_)
					i_1713_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_1719_ + i_1724_ - 1) / i_1724_;
				int i_1727_ = i + i_1711_ * i_1720_;
				int i_1728_ = i_1720_ - i_1712_;
				if (i_1711_ + i_1713_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_1713_ -= (i_1711_ + i_1713_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_1711_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_1729_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_1711_);
					i_1713_ -= i_1729_;
					i_1727_ += i_1729_ * i_1720_;
					i_1719_ += i_1724_ * i_1729_;
				}
				if (i + i_1712_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_1730_ = (i + i_1712_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1712_ -= i_1730_;
					i_1728_ += i_1730_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_1731_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_1712_ -= i_1731_;
					i_1727_ += i_1731_;
					i_1718_ += i_1723_ * i_1731_;
					i_1728_ += i_1731_;
				}
				if (i_1716_ == 0) {
					if (i_1714_ == 1) {
						int i_1732_ = i_1718_;
						for (int i_1733_ = -i_1713_; i_1733_ < 0; i_1733_++) {
							int i_1734_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1735_ = -i_1712_; i_1735_ < 0; i_1735_++) {
								is[i_1727_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1734_]);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1732_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1736_ = (i_1715_ & 0xff0000) >> 16;
						int i_1737_ = (i_1715_ & 0xff00) >> 8;
						int i_1738_ = i_1715_ & 0xff;
						int i_1739_ = i_1718_;
						for (int i_1740_ = -i_1713_; i_1740_ < 0; i_1740_++) {
							int i_1741_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1742_ = -i_1712_; i_1742_ < 0; i_1742_++) {
								int i_1743_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1741_]);
								int i_1744_ = ((i_1743_ & 0xff0000) * i_1736_ & ~0xffffff);
								int i_1745_ = (i_1743_ & 0xff00) * i_1737_ & 0xff0000;
								int i_1746_ = (i_1743_ & 0xff) * i_1738_ & 0xff00;
								is[i_1727_++] = (i_1744_ | i_1745_ | i_1746_) >>> 8;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1739_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 3) {
						int i_1747_ = i_1718_;
						for (int i_1748_ = -i_1713_; i_1748_ < 0; i_1748_++) {
							int i_1749_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1750_ = -i_1712_; i_1750_ < 0; i_1750_++) {
								int i_1751_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1749_]);
								int i_1752_ = i_1751_ + i_1715_;
								int i_1753_ = ((i_1751_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1754_ = ((i_1753_ & 0x1000100) + (i_1752_ - i_1753_ & 0x10000));
								is[i_1727_++] = i_1752_ - i_1754_ | i_1754_ - (i_1754_ >>> 8);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1747_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1755_ = i_1715_ >>> 24;
						int i_1756_ = 256 - i_1755_;
						int i_1757_ = (i_1715_ & 0xff00ff) * i_1756_ & ~0xff00ff;
						int i_1758_ = (i_1715_ & 0xff00) * i_1756_ & 0xff0000;
						i_1715_ = (i_1757_ | i_1758_) >>> 8;
						int i_1759_ = i_1718_;
						for (int i_1760_ = -i_1713_; i_1760_ < 0; i_1760_++) {
							int i_1761_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1762_ = -i_1712_; i_1762_ < 0; i_1762_++) {
								int i_1763_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1761_]);
								i_1757_ = ((i_1763_ & 0xff00ff) * i_1755_ & ~0xff00ff);
								i_1758_ = (i_1763_ & 0xff00) * i_1755_ & 0xff0000;
								is[i_1727_++] = ((i_1757_ | i_1758_) >>> 8) + i_1715_;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1759_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1716_ == 1) {
					if (i_1714_ == 1) {
						int i_1764_ = i_1718_;
						for (int i_1765_ = -i_1713_; i_1765_ < 0; i_1765_++) {
							int i_1766_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1767_ = -i_1712_; i_1767_ < 0; i_1767_++) {
								int i_1768_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1766_]);
								if (i_1768_ != 0)
									is[i_1727_++] = i_1768_;
								else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1764_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1769_ = i_1718_;
						if ((i_1715_ & 0xffffff) == 16777215) {
							int i_1770_ = i_1715_ >>> 24;
							int i_1771_ = 256 - i_1770_;
							for (int i_1772_ = -i_1713_; i_1772_ < 0; i_1772_++) {
								int i_1773_ = ((i_1719_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1774_ = -i_1712_; i_1774_ < 0; i_1774_++) {
									int i_1775_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1773_]);
									if (i_1775_ != 0) {
										int i_1776_ = is[i_1727_];
										is[i_1727_++] = ((((i_1775_ & 0xff00ff) * i_1770_ + ((i_1776_ & 0xff00ff) * i_1771_)) & ~0xff00ff) + (((i_1775_ & 0xff00) * i_1770_ + ((i_1776_ & 0xff00) * i_1771_)) & 0xff0000)) >> 8;
									} else
										i_1727_++;
									i_1718_ += i_1723_;
								}
								i_1719_ += i_1724_;
								i_1718_ = i_1769_;
								i_1727_ += i_1728_;
							}
						} else {
							int i_1777_ = (i_1715_ & 0xff0000) >> 16;
							int i_1778_ = (i_1715_ & 0xff00) >> 8;
							int i_1779_ = i_1715_ & 0xff;
							int i_1780_ = i_1715_ >>> 24;
							int i_1781_ = 256 - i_1780_;
							for (int i_1782_ = -i_1713_; i_1782_ < 0; i_1782_++) {
								int i_1783_ = ((i_1719_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1784_ = -i_1712_; i_1784_ < 0; i_1784_++) {
									int i_1785_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1783_]);
									if (i_1785_ != 0) {
										if (i_1780_ != 255) {
											int i_1786_ = (((i_1785_ & 0xff0000) * i_1777_) & ~0xffffff);
											int i_1787_ = ((i_1785_ & 0xff00) * i_1778_ & 0xff0000);
											int i_1788_ = ((i_1785_ & 0xff) * i_1779_ & 0xff00);
											i_1785_ = (i_1786_ | i_1787_ | i_1788_) >>> 8;
											int i_1789_ = is[i_1727_];
											is[i_1727_++] = (((((i_1785_ & 0xff00ff) * i_1780_) + ((i_1789_ & 0xff00ff) * i_1781_)) & ~0xff00ff) + ((((i_1785_ & 0xff00) * i_1780_) + ((i_1789_ & 0xff00) * i_1781_)) & 0xff0000)) >> 8;
										} else {
											int i_1790_ = (((i_1785_ & 0xff0000) * i_1777_) & ~0xffffff);
											int i_1791_ = ((i_1785_ & 0xff00) * i_1778_ & 0xff0000);
											int i_1792_ = ((i_1785_ & 0xff) * i_1779_ & 0xff00);
											is[i_1727_++] = (i_1790_ | i_1791_ | i_1792_) >>> 8;
										}
									} else
										i_1727_++;
									i_1718_ += i_1723_;
								}
								i_1719_ += i_1724_;
								i_1718_ = i_1769_;
								i_1727_ += i_1728_;
							}
						}
					} else if (i_1714_ == 3) {
						int i_1793_ = i_1718_;
						int i_1794_ = i_1715_ >>> 24;
						int i_1795_ = 256 - i_1794_;
						for (int i_1796_ = -i_1713_; i_1796_ < 0; i_1796_++) {
							int i_1797_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1798_ = -i_1712_; i_1798_ < 0; i_1798_++) {
								int i_1799_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1797_]);
								int i_1800_ = i_1799_ + i_1715_;
								int i_1801_ = ((i_1799_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1802_ = ((i_1801_ & 0x1000100) + (i_1800_ - i_1801_ & 0x10000));
								i_1802_ = i_1800_ - i_1802_ | i_1802_ - (i_1802_ >>> 8);
								if (i_1799_ == 0 && i_1794_ != 255) {
									i_1799_ = i_1802_;
									i_1802_ = is[i_1727_];
									i_1802_ = ((((i_1799_ & 0xff00ff) * i_1794_ + (i_1802_ & 0xff00ff) * i_1795_) & ~0xff00ff) + (((i_1799_ & 0xff00) * i_1794_ + (i_1802_ & 0xff00) * i_1795_) & 0xff0000)) >> 8;
								}
								is[i_1727_++] = i_1802_;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1793_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1803_ = i_1715_ >>> 24;
						int i_1804_ = 256 - i_1803_;
						int i_1805_ = (i_1715_ & 0xff00ff) * i_1804_ & ~0xff00ff;
						int i_1806_ = (i_1715_ & 0xff00) * i_1804_ & 0xff0000;
						i_1715_ = (i_1805_ | i_1806_) >>> 8;
						int i_1807_ = i_1718_;
						for (int i_1808_ = -i_1713_; i_1808_ < 0; i_1808_++) {
							int i_1809_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1810_ = -i_1712_; i_1810_ < 0; i_1810_++) {
								int i_1811_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1809_]);
								if (i_1811_ != 0) {
									i_1805_ = ((i_1811_ & 0xff00ff) * i_1803_ & ~0xff00ff);
									i_1806_ = ((i_1811_ & 0xff00) * i_1803_ & 0xff0000);
									is[i_1727_++] = ((i_1805_ | i_1806_) >>> 8) + i_1715_;
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1807_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1716_ == 2) {
					if (i_1714_ == 1) {
						int i_1812_ = i_1718_;
						for (int i_1813_ = -i_1713_; i_1813_ < 0; i_1813_++) {
							int i_1814_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1815_ = -i_1712_; i_1815_ < 0; i_1815_++) {
								int i_1816_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1814_]);
								if (i_1816_ != 0) {
									int i_1817_ = is[i_1727_];
									int i_1818_ = i_1816_ + i_1817_;
									int i_1819_ = ((i_1816_ & 0xff00ff) + (i_1817_ & 0xff00ff));
									i_1817_ = ((i_1819_ & 0x1000100) + (i_1818_ - i_1819_ & 0x10000));
									is[i_1727_++] = (i_1818_ - i_1817_ | i_1817_ - (i_1817_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1812_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1820_ = i_1718_;
						int i_1821_ = (i_1715_ & 0xff0000) >> 16;
						int i_1822_ = (i_1715_ & 0xff00) >> 8;
						int i_1823_ = i_1715_ & 0xff;
						for (int i_1824_ = -i_1713_; i_1824_ < 0; i_1824_++) {
							int i_1825_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1826_ = -i_1712_; i_1826_ < 0; i_1826_++) {
								int i_1827_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1825_]);
								if (i_1827_ != 0) {
									int i_1828_ = ((i_1827_ & 0xff0000) * i_1821_ & ~0xffffff);
									int i_1829_ = ((i_1827_ & 0xff00) * i_1822_ & 0xff0000);
									int i_1830_ = (i_1827_ & 0xff) * i_1823_ & 0xff00;
									i_1827_ = (i_1828_ | i_1829_ | i_1830_) >>> 8;
									int i_1831_ = is[i_1727_];
									int i_1832_ = i_1827_ + i_1831_;
									int i_1833_ = ((i_1827_ & 0xff00ff) + (i_1831_ & 0xff00ff));
									i_1831_ = ((i_1833_ & 0x1000100) + (i_1832_ - i_1833_ & 0x10000));
									is[i_1727_++] = (i_1832_ - i_1831_ | i_1831_ - (i_1831_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1820_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 3) {
						int i_1834_ = i_1718_;
						for (int i_1835_ = -i_1713_; i_1835_ < 0; i_1835_++) {
							int i_1836_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1837_ = -i_1712_; i_1837_ < 0; i_1837_++) {
								int i_1838_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1836_]);
								int i_1839_ = i_1838_ + i_1715_;
								int i_1840_ = ((i_1838_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1841_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
								i_1838_ = i_1839_ - i_1841_ | i_1841_ - (i_1841_ >>> 8);
								i_1841_ = is[i_1727_];
								i_1839_ = i_1838_ + i_1841_;
								i_1840_ = (i_1838_ & 0xff00ff) + (i_1841_ & 0xff00ff);
								i_1841_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
								is[i_1727_++] = i_1839_ - i_1841_ | i_1841_ - (i_1841_ >>> 8);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1834_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1842_ = i_1715_ >>> 24;
						int i_1843_ = 256 - i_1842_;
						int i_1844_ = (i_1715_ & 0xff00ff) * i_1843_ & ~0xff00ff;
						int i_1845_ = (i_1715_ & 0xff00) * i_1843_ & 0xff0000;
						i_1715_ = (i_1844_ | i_1845_) >>> 8;
						int i_1846_ = i_1718_;
						for (int i_1847_ = -i_1713_; i_1847_ < 0; i_1847_++) {
							int i_1848_ = ((i_1719_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1849_ = -i_1712_; i_1849_ < 0; i_1849_++) {
								int i_1850_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1718_ >> 16) + i_1848_]);
								if (i_1850_ != 0) {
									i_1844_ = ((i_1850_ & 0xff00ff) * i_1842_ & ~0xff00ff);
									i_1845_ = ((i_1850_ & 0xff00) * i_1842_ & 0xff0000);
									i_1850_ = (((i_1844_ | i_1845_) >>> 8) + i_1715_);
									int i_1851_ = is[i_1727_];
									int i_1852_ = i_1850_ + i_1851_;
									int i_1853_ = ((i_1850_ & 0xff00ff) + (i_1851_ & 0xff00ff));
									i_1851_ = ((i_1853_ & 0x1000100) + (i_1852_ - i_1853_ & 0x10000));
									is[i_1727_++] = (i_1852_ - i_1851_ | i_1851_ - (i_1851_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1846_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2625(int i, int i_1854_, int i_1855_, int i_1856_, int i_1857_, int i_1858_, int i_1859_, int i_1860_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1855_ > 0 && i_1856_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_1861_ = 0;
				int i_1862_ = 0;
				int i_1863_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_1864_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_1865_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_1866_ = (i_1864_ << 16) / i_1855_;
				int i_1867_ = (i_1865_ << 16) / i_1856_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_1868_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_1866_ - 1) / i_1866_);
					i += i_1868_;
					i_1861_ += (i_1868_ * i_1866_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_1869_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_1867_ - 1) / i_1867_);
					i_1854_ += i_1869_;
					i_1862_ += (i_1869_ * i_1867_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_1864_)
					i_1855_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_1861_ + i_1866_ - 1) / i_1866_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_1865_)
					i_1856_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_1862_ + i_1867_ - 1) / i_1867_;
				int i_1870_ = i + i_1854_ * i_1863_;
				int i_1871_ = i_1863_ - i_1855_;
				if (i_1854_ + i_1856_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_1856_ -= (i_1854_ + i_1856_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_1854_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_1872_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_1854_);
					i_1856_ -= i_1872_;
					i_1870_ += i_1872_ * i_1863_;
					i_1862_ += i_1867_ * i_1872_;
				}
				if (i + i_1855_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_1873_ = (i + i_1855_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1855_ -= i_1873_;
					i_1871_ += i_1873_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_1874_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_1855_ -= i_1874_;
					i_1870_ += i_1874_;
					i_1861_ += i_1866_ * i_1874_;
					i_1871_ += i_1874_;
				}
				if (i_1859_ == 0) {
					if (i_1857_ == 1) {
						int i_1875_ = i_1861_;
						for (int i_1876_ = -i_1856_; i_1876_ < 0; i_1876_++) {
							int i_1877_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1878_ = -i_1855_; i_1878_ < 0; i_1878_++) {
								is[i_1870_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1877_]);
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1875_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 0) {
						int i_1879_ = (i_1858_ & 0xff0000) >> 16;
						int i_1880_ = (i_1858_ & 0xff00) >> 8;
						int i_1881_ = i_1858_ & 0xff;
						int i_1882_ = i_1861_;
						for (int i_1883_ = -i_1856_; i_1883_ < 0; i_1883_++) {
							int i_1884_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1885_ = -i_1855_; i_1885_ < 0; i_1885_++) {
								int i_1886_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1884_]);
								int i_1887_ = ((i_1886_ & 0xff0000) * i_1879_ & ~0xffffff);
								int i_1888_ = (i_1886_ & 0xff00) * i_1880_ & 0xff0000;
								int i_1889_ = (i_1886_ & 0xff) * i_1881_ & 0xff00;
								is[i_1870_++] = (i_1887_ | i_1888_ | i_1889_) >>> 8;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1882_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 3) {
						int i_1890_ = i_1861_;
						for (int i_1891_ = -i_1856_; i_1891_ < 0; i_1891_++) {
							int i_1892_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1893_ = -i_1855_; i_1893_ < 0; i_1893_++) {
								int i_1894_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1892_]);
								int i_1895_ = i_1894_ + i_1858_;
								int i_1896_ = ((i_1894_ & 0xff00ff) + (i_1858_ & 0xff00ff));
								int i_1897_ = ((i_1896_ & 0x1000100) + (i_1895_ - i_1896_ & 0x10000));
								is[i_1870_++] = i_1895_ - i_1897_ | i_1897_ - (i_1897_ >>> 8);
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1890_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 2) {
						int i_1898_ = i_1858_ >>> 24;
						int i_1899_ = 256 - i_1898_;
						int i_1900_ = (i_1858_ & 0xff00ff) * i_1899_ & ~0xff00ff;
						int i_1901_ = (i_1858_ & 0xff00) * i_1899_ & 0xff0000;
						i_1858_ = (i_1900_ | i_1901_) >>> 8;
						int i_1902_ = i_1861_;
						for (int i_1903_ = -i_1856_; i_1903_ < 0; i_1903_++) {
							int i_1904_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1905_ = -i_1855_; i_1905_ < 0; i_1905_++) {
								int i_1906_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1904_]);
								i_1900_ = ((i_1906_ & 0xff00ff) * i_1898_ & ~0xff00ff);
								i_1901_ = (i_1906_ & 0xff00) * i_1898_ & 0xff0000;
								is[i_1870_++] = ((i_1900_ | i_1901_) >>> 8) + i_1858_;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1902_;
							i_1870_ += i_1871_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1859_ == 1) {
					if (i_1857_ == 1) {
						int i_1907_ = i_1861_;
						for (int i_1908_ = -i_1856_; i_1908_ < 0; i_1908_++) {
							int i_1909_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1910_ = -i_1855_; i_1910_ < 0; i_1910_++) {
								int i_1911_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1909_]);
								if (i_1911_ != 0)
									is[i_1870_++] = i_1911_;
								else
									i_1870_++;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1907_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 0) {
						int i_1912_ = i_1861_;
						if ((i_1858_ & 0xffffff) == 16777215) {
							int i_1913_ = i_1858_ >>> 24;
							int i_1914_ = 256 - i_1913_;
							for (int i_1915_ = -i_1856_; i_1915_ < 0; i_1915_++) {
								int i_1916_ = ((i_1862_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1917_ = -i_1855_; i_1917_ < 0; i_1917_++) {
									int i_1918_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1916_]);
									if (i_1918_ != 0) {
										int i_1919_ = is[i_1870_];
										is[i_1870_++] = ((((i_1918_ & 0xff00ff) * i_1913_ + ((i_1919_ & 0xff00ff) * i_1914_)) & ~0xff00ff) + (((i_1918_ & 0xff00) * i_1913_ + ((i_1919_ & 0xff00) * i_1914_)) & 0xff0000)) >> 8;
									} else
										i_1870_++;
									i_1861_ += i_1866_;
								}
								i_1862_ += i_1867_;
								i_1861_ = i_1912_;
								i_1870_ += i_1871_;
							}
						} else {
							int i_1920_ = (i_1858_ & 0xff0000) >> 16;
							int i_1921_ = (i_1858_ & 0xff00) >> 8;
							int i_1922_ = i_1858_ & 0xff;
							int i_1923_ = i_1858_ >>> 24;
							int i_1924_ = 256 - i_1923_;
							for (int i_1925_ = -i_1856_; i_1925_ < 0; i_1925_++) {
								int i_1926_ = ((i_1862_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_1927_ = -i_1855_; i_1927_ < 0; i_1927_++) {
									int i_1928_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1926_]);
									if (i_1928_ != 0) {
										if (i_1923_ != 255) {
											int i_1929_ = (((i_1928_ & 0xff0000) * i_1920_) & ~0xffffff);
											int i_1930_ = ((i_1928_ & 0xff00) * i_1921_ & 0xff0000);
											int i_1931_ = ((i_1928_ & 0xff) * i_1922_ & 0xff00);
											i_1928_ = (i_1929_ | i_1930_ | i_1931_) >>> 8;
											int i_1932_ = is[i_1870_];
											is[i_1870_++] = (((((i_1928_ & 0xff00ff) * i_1923_) + ((i_1932_ & 0xff00ff) * i_1924_)) & ~0xff00ff) + ((((i_1928_ & 0xff00) * i_1923_) + ((i_1932_ & 0xff00) * i_1924_)) & 0xff0000)) >> 8;
										} else {
											int i_1933_ = (((i_1928_ & 0xff0000) * i_1920_) & ~0xffffff);
											int i_1934_ = ((i_1928_ & 0xff00) * i_1921_ & 0xff0000);
											int i_1935_ = ((i_1928_ & 0xff) * i_1922_ & 0xff00);
											is[i_1870_++] = (i_1933_ | i_1934_ | i_1935_) >>> 8;
										}
									} else
										i_1870_++;
									i_1861_ += i_1866_;
								}
								i_1862_ += i_1867_;
								i_1861_ = i_1912_;
								i_1870_ += i_1871_;
							}
						}
					} else if (i_1857_ == 3) {
						int i_1936_ = i_1861_;
						int i_1937_ = i_1858_ >>> 24;
						int i_1938_ = 256 - i_1937_;
						for (int i_1939_ = -i_1856_; i_1939_ < 0; i_1939_++) {
							int i_1940_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1941_ = -i_1855_; i_1941_ < 0; i_1941_++) {
								int i_1942_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1940_]);
								int i_1943_ = i_1942_ + i_1858_;
								int i_1944_ = ((i_1942_ & 0xff00ff) + (i_1858_ & 0xff00ff));
								int i_1945_ = ((i_1944_ & 0x1000100) + (i_1943_ - i_1944_ & 0x10000));
								i_1945_ = i_1943_ - i_1945_ | i_1945_ - (i_1945_ >>> 8);
								if (i_1942_ == 0 && i_1937_ != 255) {
									i_1942_ = i_1945_;
									i_1945_ = is[i_1870_];
									i_1945_ = ((((i_1942_ & 0xff00ff) * i_1937_ + (i_1945_ & 0xff00ff) * i_1938_) & ~0xff00ff) + (((i_1942_ & 0xff00) * i_1937_ + (i_1945_ & 0xff00) * i_1938_) & 0xff0000)) >> 8;
								}
								is[i_1870_++] = i_1945_;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1936_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 2) {
						int i_1946_ = i_1858_ >>> 24;
						int i_1947_ = 256 - i_1946_;
						int i_1948_ = (i_1858_ & 0xff00ff) * i_1947_ & ~0xff00ff;
						int i_1949_ = (i_1858_ & 0xff00) * i_1947_ & 0xff0000;
						i_1858_ = (i_1948_ | i_1949_) >>> 8;
						int i_1950_ = i_1861_;
						for (int i_1951_ = -i_1856_; i_1951_ < 0; i_1951_++) {
							int i_1952_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1953_ = -i_1855_; i_1953_ < 0; i_1953_++) {
								int i_1954_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1952_]);
								if (i_1954_ != 0) {
									i_1948_ = ((i_1954_ & 0xff00ff) * i_1946_ & ~0xff00ff);
									i_1949_ = ((i_1954_ & 0xff00) * i_1946_ & 0xff0000);
									is[i_1870_++] = ((i_1948_ | i_1949_) >>> 8) + i_1858_;
								} else
									i_1870_++;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1950_;
							i_1870_ += i_1871_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1859_ == 2) {
					if (i_1857_ == 1) {
						int i_1955_ = i_1861_;
						for (int i_1956_ = -i_1856_; i_1956_ < 0; i_1956_++) {
							int i_1957_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1958_ = -i_1855_; i_1958_ < 0; i_1958_++) {
								int i_1959_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1957_]);
								if (i_1959_ != 0) {
									int i_1960_ = is[i_1870_];
									int i_1961_ = i_1959_ + i_1960_;
									int i_1962_ = ((i_1959_ & 0xff00ff) + (i_1960_ & 0xff00ff));
									i_1960_ = ((i_1962_ & 0x1000100) + (i_1961_ - i_1962_ & 0x10000));
									is[i_1870_++] = (i_1961_ - i_1960_ | i_1960_ - (i_1960_ >>> 8));
								} else
									i_1870_++;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1955_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 0) {
						int i_1963_ = i_1861_;
						int i_1964_ = (i_1858_ & 0xff0000) >> 16;
						int i_1965_ = (i_1858_ & 0xff00) >> 8;
						int i_1966_ = i_1858_ & 0xff;
						for (int i_1967_ = -i_1856_; i_1967_ < 0; i_1967_++) {
							int i_1968_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1969_ = -i_1855_; i_1969_ < 0; i_1969_++) {
								int i_1970_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1968_]);
								if (i_1970_ != 0) {
									int i_1971_ = ((i_1970_ & 0xff0000) * i_1964_ & ~0xffffff);
									int i_1972_ = ((i_1970_ & 0xff00) * i_1965_ & 0xff0000);
									int i_1973_ = (i_1970_ & 0xff) * i_1966_ & 0xff00;
									i_1970_ = (i_1971_ | i_1972_ | i_1973_) >>> 8;
									int i_1974_ = is[i_1870_];
									int i_1975_ = i_1970_ + i_1974_;
									int i_1976_ = ((i_1970_ & 0xff00ff) + (i_1974_ & 0xff00ff));
									i_1974_ = ((i_1976_ & 0x1000100) + (i_1975_ - i_1976_ & 0x10000));
									is[i_1870_++] = (i_1975_ - i_1974_ | i_1974_ - (i_1974_ >>> 8));
								} else
									i_1870_++;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1963_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 3) {
						int i_1977_ = i_1861_;
						for (int i_1978_ = -i_1856_; i_1978_ < 0; i_1978_++) {
							int i_1979_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1980_ = -i_1855_; i_1980_ < 0; i_1980_++) {
								int i_1981_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1979_]);
								int i_1982_ = i_1981_ + i_1858_;
								int i_1983_ = ((i_1981_ & 0xff00ff) + (i_1858_ & 0xff00ff));
								int i_1984_ = ((i_1983_ & 0x1000100) + (i_1982_ - i_1983_ & 0x10000));
								i_1981_ = i_1982_ - i_1984_ | i_1984_ - (i_1984_ >>> 8);
								i_1984_ = is[i_1870_];
								i_1982_ = i_1981_ + i_1984_;
								i_1983_ = (i_1981_ & 0xff00ff) + (i_1984_ & 0xff00ff);
								i_1984_ = ((i_1983_ & 0x1000100) + (i_1982_ - i_1983_ & 0x10000));
								is[i_1870_++] = i_1982_ - i_1984_ | i_1984_ - (i_1984_ >>> 8);
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1977_;
							i_1870_ += i_1871_;
						}
					} else if (i_1857_ == 2) {
						int i_1985_ = i_1858_ >>> 24;
						int i_1986_ = 256 - i_1985_;
						int i_1987_ = (i_1858_ & 0xff00ff) * i_1986_ & ~0xff00ff;
						int i_1988_ = (i_1858_ & 0xff00) * i_1986_ & 0xff0000;
						i_1858_ = (i_1987_ | i_1988_) >>> 8;
						int i_1989_ = i_1861_;
						for (int i_1990_ = -i_1856_; i_1990_ < 0; i_1990_++) {
							int i_1991_ = ((i_1862_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_1992_ = -i_1855_; i_1992_ < 0; i_1992_++) {
								int i_1993_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_1861_ >> 16) + i_1991_]);
								if (i_1993_ != 0) {
									i_1987_ = ((i_1993_ & 0xff00ff) * i_1985_ & ~0xff00ff);
									i_1988_ = ((i_1993_ & 0xff00) * i_1985_ & 0xff0000);
									i_1993_ = (((i_1987_ | i_1988_) >>> 8) + i_1858_);
									int i_1994_ = is[i_1870_];
									int i_1995_ = i_1993_ + i_1994_;
									int i_1996_ = ((i_1993_ & 0xff00ff) + (i_1994_ & 0xff00ff));
									i_1994_ = ((i_1996_ & 0x1000100) + (i_1995_ - i_1996_ & 0x10000));
									is[i_1870_++] = (i_1995_ - i_1994_ | i_1994_ - (i_1994_ >>> 8));
								} else
									i_1870_++;
								i_1861_ += i_1866_;
							}
							i_1862_ += i_1867_;
							i_1861_ = i_1989_;
							i_1870_ += i_1871_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2615(int i, int i_1997_, int i_1998_) {
		throw new IllegalStateException("");
	}

	void method10054(boolean bool, boolean bool_1999_, boolean bool_2000_, int i, int i_2001_, float f, int i_2002_, int i_2003_, int i_2004_, int i_2005_, int i_2006_, int i_2007_, boolean bool_2008_) {
		if (i_2002_ > 0 && i_2003_ > 0 && (bool || bool_1999_)) {
			int i_2009_ = 0;
			int i_2010_ = 0;
			int i_2011_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
			int i_2012_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
			int i_2013_ = (i_2011_ << 16) / i_2002_;
			int i_2014_ = (i_2012_ << 16) / i_2003_;
			if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
				int i_2015_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_2013_ - 1) / i_2013_);
				i += i_2015_;
				i_2009_ += (i_2015_ * i_2013_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
				int i_2016_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_2014_ - 1) / i_2014_);
				i_2001_ += i_2016_;
				i_2010_ += (i_2016_ * i_2014_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub2) this).anInt10945 < i_2011_)
				i_2002_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_2009_ + i_2013_ - 1) / i_2013_;
			if (((Class161_Sub3_Sub2) this).anInt10930 < i_2012_)
				i_2003_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_2010_ + i_2014_ - 1) / i_2014_;
			int i_2017_ = i + i_2001_ * ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_2018_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_2002_);
			if (i_2001_ + i_2003_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2003_ -= (i_2001_ + i_2003_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_2001_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2019_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_2001_);
				i_2003_ -= i_2019_;
				i_2017_ += i_2019_ * (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_2010_ += i_2014_ * i_2019_;
			}
			if (i + i_2002_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2020_ = (i + i_2002_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2002_ -= i_2020_;
				i_2018_ += i_2020_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2021_ = ((((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2002_ -= i_2021_;
				i_2017_ += i_2021_;
				i_2009_ += i_2013_ * i_2021_;
				i_2018_ += i_2021_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_2006_ == 0) {
				if (i_2004_ == 1) {
					int i_2022_ = i_2009_;
					for (int i_2023_ = -i_2003_; i_2023_ < 0; i_2023_++) {
						int i_2024_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2025_ = -i_2002_; i_2025_ < 0; i_2025_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool)
									is[i_2017_] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2024_]);
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2022_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 0) {
					int i_2026_ = (i_2005_ & 0xff0000) >> 16;
					int i_2027_ = (i_2005_ & 0xff00) >> 8;
					int i_2028_ = i_2005_ & 0xff;
					int i_2029_ = i_2009_;
					for (int i_2030_ = -i_2003_; i_2030_ < 0; i_2030_++) {
						int i_2031_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2032_ = -i_2002_; i_2032_ < 0; i_2032_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool) {
									int i_2033_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2031_]);
									int i_2034_ = ((i_2033_ & 0xff0000) * i_2026_ & ~0xffffff);
									int i_2035_ = ((i_2033_ & 0xff00) * i_2027_ & 0xff0000);
									int i_2036_ = (i_2033_ & 0xff) * i_2028_ & 0xff00;
									is[i_2017_] = (i_2034_ | i_2035_ | i_2036_) >>> 8;
								}
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2029_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 3) {
					int i_2037_ = i_2009_;
					for (int i_2038_ = -i_2003_; i_2038_ < 0; i_2038_++) {
						int i_2039_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2040_ = -i_2002_; i_2040_ < 0; i_2040_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool) {
									int i_2041_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2039_]);
									int i_2042_ = i_2041_ + i_2005_;
									int i_2043_ = ((i_2041_ & 0xff00ff) + (i_2005_ & 0xff00ff));
									int i_2044_ = ((i_2043_ & 0x1000100) + (i_2042_ - i_2043_ & 0x10000));
									is[i_2017_] = (i_2042_ - i_2044_ | i_2044_ - (i_2044_ >>> 8));
								}
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2037_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 2) {
					int i_2045_ = i_2005_ >>> 24;
					int i_2046_ = 256 - i_2045_;
					int i_2047_ = (i_2005_ & 0xff00ff) * i_2046_ & ~0xff00ff;
					int i_2048_ = (i_2005_ & 0xff00) * i_2046_ & 0xff0000;
					i_2005_ = (i_2047_ | i_2048_) >>> 8;
					int i_2049_ = i_2009_;
					for (int i_2050_ = -i_2003_; i_2050_ < 0; i_2050_++) {
						int i_2051_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2052_ = -i_2002_; i_2052_ < 0; i_2052_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool) {
									int i_2053_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2051_]);
									i_2047_ = ((i_2053_ & 0xff00ff) * i_2045_ & ~0xff00ff);
									i_2048_ = ((i_2053_ & 0xff00) * i_2045_ & 0xff0000);
									is[i_2017_] = (((i_2047_ | i_2048_) >>> 8) + i_2005_);
								}
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2049_;
						i_2017_ += i_2018_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2006_ == 1) {
				if (i_2004_ == 1) {
					int i_2054_ = i_2009_;
					for (int i_2055_ = -i_2003_; i_2055_ < 0; i_2055_++) {
						int i_2056_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2057_ = -i_2002_; i_2057_ < 0; i_2057_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								int i_2058_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2056_]);
								if (i_2058_ != 0) {
									if (bool)
										is[i_2017_] = i_2058_;
									if (bool_1999_ && bool_2008_)
										fs[i_2017_] = f;
								}
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2054_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 0) {
					int i_2059_ = i_2009_;
					if ((i_2005_ & 0xffffff) == 16777215) {
						int i_2060_ = i_2005_ >>> 24;
						int i_2061_ = 256 - i_2060_;
						for (int i_2062_ = -i_2003_; i_2062_ < 0; i_2062_++) {
							int i_2063_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2064_ = -i_2002_; i_2064_ < 0; i_2064_++) {
								if (!bool_1999_ || f < fs[i_2017_]) {
									int i_2065_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2063_]);
									if (i_2065_ != 0) {
										if (bool) {
											int i_2066_ = is[i_2017_];
											is[i_2017_] = (((((i_2065_ & 0xff00ff) * i_2060_) + ((i_2066_ & 0xff00ff) * i_2061_)) & ~0xff00ff) + ((((i_2065_ & 0xff00) * i_2060_) + ((i_2066_ & 0xff00) * i_2061_)) & 0xff0000)) >> 8;
										}
										if (bool_1999_ && bool_2008_)
											fs[i_2017_] = f;
									}
								}
								i_2009_ += i_2013_;
								i_2017_++;
							}
							i_2010_ += i_2014_;
							i_2009_ = i_2059_;
							i_2017_ += i_2018_;
						}
					} else {
						int i_2067_ = (i_2005_ & 0xff0000) >> 16;
						int i_2068_ = (i_2005_ & 0xff00) >> 8;
						int i_2069_ = i_2005_ & 0xff;
						int i_2070_ = i_2005_ >>> 24;
						int i_2071_ = 256 - i_2070_;
						for (int i_2072_ = -i_2003_; i_2072_ < 0; i_2072_++) {
							int i_2073_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2074_ = -i_2002_; i_2074_ < 0; i_2074_++) {
								if (!bool_1999_ || f < fs[i_2017_]) {
									int i_2075_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2073_]);
									if (i_2075_ != 0) {
										if (i_2070_ != 255) {
											if (bool) {
												int i_2076_ = (((i_2075_ & 0xff0000) * i_2067_) & ~0xffffff);
												int i_2077_ = (((i_2075_ & 0xff00) * i_2068_) & 0xff0000);
												int i_2078_ = (((i_2075_ & 0xff) * i_2069_) & 0xff00);
												i_2075_ = (i_2076_ | i_2077_ | i_2078_) >>> 8;
												int i_2079_ = is[i_2017_];
												is[i_2017_] = (((((i_2075_ & 0xff00ff) * i_2070_) + ((i_2079_ & 0xff00ff) * i_2071_)) & ~0xff00ff) + ((((i_2075_ & 0xff00) * i_2070_) + ((i_2079_ & 0xff00) * i_2071_)) & 0xff0000)) >> 8;
											}
											if (bool_1999_ && bool_2008_)
												fs[i_2017_] = f;
										} else {
											if (bool) {
												int i_2080_ = (((i_2075_ & 0xff0000) * i_2067_) & ~0xffffff);
												int i_2081_ = (((i_2075_ & 0xff00) * i_2068_) & 0xff0000);
												int i_2082_ = (((i_2075_ & 0xff) * i_2069_) & 0xff00);
												is[i_2017_] = (i_2080_ | i_2081_ | i_2082_) >>> 8;
											}
											if (bool_1999_ && bool_2008_)
												fs[i_2017_] = f;
										}
									}
								}
								i_2009_ += i_2013_;
								i_2017_++;
							}
							i_2010_ += i_2014_;
							i_2009_ = i_2059_;
							i_2017_ += i_2018_;
						}
					}
				} else if (i_2004_ == 3) {
					int i_2083_ = i_2009_;
					int i_2084_ = i_2005_ >>> 24;
					int i_2085_ = 256 - i_2084_;
					for (int i_2086_ = -i_2003_; i_2086_ < 0; i_2086_++) {
						int i_2087_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2088_ = -i_2002_; i_2088_ < 0; i_2088_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool) {
									int i_2089_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2087_]);
									int i_2090_ = i_2089_ + i_2005_;
									int i_2091_ = ((i_2089_ & 0xff00ff) + (i_2005_ & 0xff00ff));
									int i_2092_ = ((i_2091_ & 0x1000100) + (i_2090_ - i_2091_ & 0x10000));
									i_2092_ = (i_2090_ - i_2092_ | i_2092_ - (i_2092_ >>> 8));
									if (i_2089_ == 0 && i_2084_ != 255) {
										i_2089_ = i_2092_;
										i_2092_ = is[i_2017_];
										i_2092_ = ((((i_2089_ & 0xff00ff) * i_2084_ + ((i_2092_ & 0xff00ff) * i_2085_)) & ~0xff00ff) + (((i_2089_ & 0xff00) * i_2084_ + ((i_2092_ & 0xff00) * i_2085_)) & 0xff0000)) >> 8;
									}
									is[i_2017_] = i_2092_;
								}
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2083_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 2) {
					int i_2093_ = i_2005_ >>> 24;
					int i_2094_ = 256 - i_2093_;
					int i_2095_ = (i_2005_ & 0xff00ff) * i_2094_ & ~0xff00ff;
					int i_2096_ = (i_2005_ & 0xff00) * i_2094_ & 0xff0000;
					i_2005_ = (i_2095_ | i_2096_) >>> 8;
					int i_2097_ = i_2009_;
					for (int i_2098_ = -i_2003_; i_2098_ < 0; i_2098_++) {
						int i_2099_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2100_ = -i_2002_; i_2100_ < 0; i_2100_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								int i_2101_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2099_]);
								if (i_2101_ != 0) {
									if (bool) {
										i_2095_ = ((i_2101_ & 0xff00ff) * i_2093_ & ~0xff00ff);
										i_2096_ = ((i_2101_ & 0xff00) * i_2093_ & 0xff0000);
										is[i_2017_] = ((i_2095_ | i_2096_) >>> 8) + i_2005_;
									}
									if (bool_1999_ && bool_2008_)
										fs[i_2017_] = f;
								}
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2097_;
						i_2017_ += i_2018_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2006_ == 2) {
				if (i_2004_ == 1) {
					int i_2102_ = i_2009_;
					for (int i_2103_ = -i_2003_; i_2103_ < 0; i_2103_++) {
						int i_2104_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2105_ = -i_2002_; i_2105_ < 0; i_2105_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								int i_2106_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2104_]);
								if (i_2106_ != 0) {
									if (bool) {
										int i_2107_ = is[i_2017_];
										int i_2108_ = i_2106_ + i_2107_;
										int i_2109_ = ((i_2106_ & 0xff00ff) + (i_2107_ & 0xff00ff));
										i_2107_ = ((i_2109_ & 0x1000100) + (i_2108_ - i_2109_ & 0x10000));
										is[i_2017_] = (i_2108_ - i_2107_ | i_2107_ - (i_2107_ >>> 8));
									}
									if (bool_1999_ && bool_2008_)
										fs[i_2017_] = f;
								}
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2102_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 0) {
					int i_2110_ = i_2009_;
					int i_2111_ = (i_2005_ & 0xff0000) >> 16;
					int i_2112_ = (i_2005_ & 0xff00) >> 8;
					int i_2113_ = i_2005_ & 0xff;
					for (int i_2114_ = -i_2003_; i_2114_ < 0; i_2114_++) {
						int i_2115_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2116_ = -i_2002_; i_2116_ < 0; i_2116_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								int i_2117_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2115_]);
								if (i_2117_ != 0) {
									if (bool) {
										int i_2118_ = ((i_2117_ & 0xff0000) * i_2111_ & ~0xffffff);
										int i_2119_ = ((i_2117_ & 0xff00) * i_2112_ & 0xff0000);
										int i_2120_ = ((i_2117_ & 0xff) * i_2113_ & 0xff00);
										i_2117_ = (i_2118_ | i_2119_ | i_2120_) >>> 8;
										int i_2121_ = is[i_2017_];
										int i_2122_ = i_2117_ + i_2121_;
										int i_2123_ = ((i_2117_ & 0xff00ff) + (i_2121_ & 0xff00ff));
										i_2121_ = ((i_2123_ & 0x1000100) + (i_2122_ - i_2123_ & 0x10000));
										is[i_2017_] = (i_2122_ - i_2121_ | i_2121_ - (i_2121_ >>> 8));
									}
									if (bool_1999_ && bool_2008_)
										fs[i_2017_] = f;
								}
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2110_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 3) {
					int i_2124_ = i_2009_;
					for (int i_2125_ = -i_2003_; i_2125_ < 0; i_2125_++) {
						int i_2126_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2127_ = -i_2002_; i_2127_ < 0; i_2127_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								if (bool) {
									int i_2128_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2126_]);
									int i_2129_ = i_2128_ + i_2005_;
									int i_2130_ = ((i_2128_ & 0xff00ff) + (i_2005_ & 0xff00ff));
									int i_2131_ = ((i_2130_ & 0x1000100) + (i_2129_ - i_2130_ & 0x10000));
									i_2128_ = (i_2129_ - i_2131_ | i_2131_ - (i_2131_ >>> 8));
									i_2131_ = is[i_2017_];
									i_2129_ = i_2128_ + i_2131_;
									i_2130_ = (i_2128_ & 0xff00ff) + (i_2131_ & 0xff00ff);
									i_2131_ = ((i_2130_ & 0x1000100) + (i_2129_ - i_2130_ & 0x10000));
									is[i_2017_] = (i_2129_ - i_2131_ | i_2131_ - (i_2131_ >>> 8));
								}
								if (bool_1999_ && bool_2008_)
									fs[i_2017_] = f;
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2124_;
						i_2017_ += i_2018_;
					}
				} else if (i_2004_ == 2) {
					int i_2132_ = i_2005_ >>> 24;
					int i_2133_ = 256 - i_2132_;
					int i_2134_ = (i_2005_ & 0xff00ff) * i_2133_ & ~0xff00ff;
					int i_2135_ = (i_2005_ & 0xff00) * i_2133_ & 0xff0000;
					i_2005_ = (i_2134_ | i_2135_) >>> 8;
					int i_2136_ = i_2009_;
					for (int i_2137_ = -i_2003_; i_2137_ < 0; i_2137_++) {
						int i_2138_ = ((i_2010_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
						for (int i_2139_ = -i_2002_; i_2139_ < 0; i_2139_++) {
							if (!bool_1999_ || f < fs[i_2017_]) {
								int i_2140_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2009_ >> 16) + i_2138_]);
								if (i_2140_ != 0) {
									if (bool) {
										i_2134_ = ((i_2140_ & 0xff00ff) * i_2132_ & ~0xff00ff);
										i_2135_ = ((i_2140_ & 0xff00) * i_2132_ & 0xff0000);
										i_2140_ = (((i_2134_ | i_2135_) >>> 8) + i_2005_);
										int i_2141_ = is[i_2017_];
										int i_2142_ = i_2140_ + i_2141_;
										int i_2143_ = ((i_2140_ & 0xff00ff) + (i_2141_ & 0xff00ff));
										i_2141_ = ((i_2143_ & 0x1000100) + (i_2142_ - i_2143_ & 0x10000));
										is[i_2017_] = (i_2142_ - i_2141_ | i_2141_ - (i_2141_ >>> 8));
									}
									if (bool_1999_ && bool_2008_)
										fs[i_2017_] = f;
								}
							}
							i_2009_ += i_2013_;
							i_2017_++;
						}
						i_2010_ += i_2014_;
						i_2009_ = i_2136_;
						i_2017_ += i_2018_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10184(int i, int i_2144_, int i_2145_, int i_2146_, int[] is, int i_2147_, int i_2148_) {
		i_2148_ -= i_2145_;
		for (int i_2149_ = 0; i_2149_ < i_2146_; i_2149_++) {
			int i_2150_ = (i_2144_ + i_2149_) * i_2145_ + i;
			for (int i_2151_ = 0; i_2151_ < i_2145_; i_2151_++)
				is[i_2147_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[i_2150_ + i_2151_]);
			i_2147_ += i_2148_;
		}
	}

	void method10056(int i, int i_2152_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2153_ = anInt10940;
					while (i_2153_ < 0) {
						int i_2154_ = anInt10944;
						int i_2155_ = anInt10951;
						int i_2156_ = anInt10952;
						int i_2157_ = anInt10958;
						if (i_2155_ >= 0 && i_2156_ >= 0 && (i_2155_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0 && (i_2156_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2157_ < 0; i_2157_++)
								method10181((((i_2156_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2155_ >> 12)), i_2154_++, is, i, i_2152_);
						}
						i_2153_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2158_ = anInt10940;
					while (i_2158_ < 0) {
						int i_2159_ = anInt10944;
						int i_2160_ = anInt10951;
						int i_2161_ = anInt10952 + anInt10954;
						int i_2162_ = anInt10958;
						if (i_2160_ >= 0 && (i_2160_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							int i_2163_;
							if ((i_2163_ = (i_2161_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_2163_ = (anInt10946 - i_2163_) / anInt10946;
								i_2162_ += i_2163_;
								i_2161_ += anInt10946 * i_2163_;
								i_2159_ += i_2163_;
							}
							if ((i_2163_ = (i_2161_ - anInt10946) / anInt10946) > i_2162_)
								i_2162_ = i_2163_;
							for (/**/; i_2162_ < 0; i_2162_++) {
								method10181((((i_2161_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2160_ >> 12)), i_2159_++, is, i, i_2152_);
								i_2161_ += anInt10946;
							}
						}
						i_2158_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2164_ = anInt10940;
					while (i_2164_ < 0) {
						int i_2165_ = anInt10944;
						int i_2166_ = anInt10951;
						int i_2167_ = anInt10952 + anInt10954;
						int i_2168_ = anInt10958;
						if (i_2166_ >= 0 && (i_2166_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							if (i_2167_ < 0) {
								int i_2169_ = (anInt10946 - 1 - i_2167_) / anInt10946;
								i_2168_ += i_2169_;
								i_2167_ += anInt10946 * i_2169_;
								i_2165_ += i_2169_;
							}
							int i_2170_;
							if ((i_2170_ = (1 + i_2167_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2168_)
								i_2168_ = i_2170_;
							for (/**/; i_2168_ < 0; i_2168_++) {
								method10181((((i_2167_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2166_ >> 12)), i_2165_++, is, i, i_2152_);
								i_2167_ += anInt10946;
							}
						}
						i_2164_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2171_ = anInt10940;
					while (i_2171_ < 0) {
						int i_2172_ = anInt10944;
						int i_2173_ = anInt10951 + anInt10953;
						int i_2174_ = anInt10952;
						int i_2175_ = anInt10958;
						if (i_2174_ >= 0 && (i_2174_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							int i_2176_;
							if ((i_2176_ = (i_2173_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_2176_ = (anInt10956 - i_2176_) / anInt10956;
								i_2175_ += i_2176_;
								i_2173_ += anInt10956 * i_2176_;
								i_2172_ += i_2176_;
							}
							if ((i_2176_ = (i_2173_ - anInt10956) / anInt10956) > i_2175_)
								i_2175_ = i_2176_;
							for (/**/; i_2175_ < 0; i_2175_++) {
								method10181((((i_2174_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2173_ >> 12)), i_2172_++, is, i, i_2152_);
								i_2173_ += anInt10956;
							}
						}
						i_2171_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2177_ = anInt10940;
					while (i_2177_ < 0) {
						int i_2178_ = anInt10944;
						int i_2179_ = anInt10951 + anInt10953;
						int i_2180_ = anInt10952 + anInt10954;
						int i_2181_ = anInt10958;
						int i_2182_;
						if ((i_2182_ = i_2179_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2182_ = (anInt10956 - i_2182_) / anInt10956;
							i_2181_ += i_2182_;
							i_2179_ += anInt10956 * i_2182_;
							i_2180_ += anInt10946 * i_2182_;
							i_2178_ += i_2182_;
						}
						if ((i_2182_ = (i_2179_ - anInt10956) / anInt10956) > i_2181_)
							i_2181_ = i_2182_;
						if ((i_2182_ = i_2180_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
							i_2182_ = (anInt10946 - i_2182_) / anInt10946;
							i_2181_ += i_2182_;
							i_2179_ += anInt10956 * i_2182_;
							i_2180_ += anInt10946 * i_2182_;
							i_2178_ += i_2182_;
						}
						if ((i_2182_ = (i_2180_ - anInt10946) / anInt10946) > i_2181_)
							i_2181_ = i_2182_;
						for (/**/; i_2181_ < 0; i_2181_++) {
							method10181(((i_2180_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2179_ >> 12), i_2178_++, is, i, i_2152_);
							i_2179_ += anInt10956;
							i_2180_ += anInt10946;
						}
						i_2177_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2183_ = anInt10940;
					while (i_2183_ < 0) {
						int i_2184_ = anInt10944;
						int i_2185_ = anInt10951 + anInt10953;
						int i_2186_ = anInt10952 + anInt10954;
						int i_2187_ = anInt10958;
						int i_2188_;
						if ((i_2188_ = i_2185_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2188_ = (anInt10956 - i_2188_) / anInt10956;
							i_2187_ += i_2188_;
							i_2185_ += anInt10956 * i_2188_;
							i_2186_ += anInt10946 * i_2188_;
							i_2184_ += i_2188_;
						}
						if ((i_2188_ = (i_2185_ - anInt10956) / anInt10956) > i_2187_)
							i_2187_ = i_2188_;
						if (i_2186_ < 0) {
							i_2188_ = (anInt10946 - 1 - i_2186_) / anInt10946;
							i_2187_ += i_2188_;
							i_2185_ += anInt10956 * i_2188_;
							i_2186_ += anInt10946 * i_2188_;
							i_2184_ += i_2188_;
						}
						if ((i_2188_ = (1 + i_2186_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2187_)
							i_2187_ = i_2188_;
						for (/**/; i_2187_ < 0; i_2187_++) {
							method10181(((i_2186_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2185_ >> 12), i_2184_++, is, i, i_2152_);
							i_2185_ += anInt10956;
							i_2186_ += anInt10946;
						}
						i_2183_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2189_ = anInt10940;
				while (i_2189_ < 0) {
					int i_2190_ = anInt10944;
					int i_2191_ = anInt10951 + anInt10953;
					int i_2192_ = anInt10952;
					int i_2193_ = anInt10958;
					if (i_2192_ >= 0 && i_2192_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
						if (i_2191_ < 0) {
							int i_2194_ = (anInt10956 - 1 - i_2191_) / anInt10956;
							i_2193_ += i_2194_;
							i_2191_ += anInt10956 * i_2194_;
							i_2190_ += i_2194_;
						}
						int i_2195_;
						if ((i_2195_ = (1 + i_2191_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2193_)
							i_2193_ = i_2195_;
						for (/**/; i_2193_ < 0; i_2193_++) {
							method10181(((i_2192_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2191_ >> 12), i_2190_++, is, i, i_2152_);
							i_2191_ += anInt10956;
						}
					}
					i_2189_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2196_ = anInt10940; i_2196_ < 0; i_2196_++) {
					int i_2197_ = anInt10944;
					int i_2198_ = anInt10951 + anInt10953;
					int i_2199_ = anInt10952 + anInt10954;
					int i_2200_ = anInt10958;
					if (i_2198_ < 0) {
						int i_2201_ = (anInt10956 - 1 - i_2198_) / anInt10956;
						i_2200_ += i_2201_;
						i_2198_ += anInt10956 * i_2201_;
						i_2199_ += anInt10946 * i_2201_;
						i_2197_ += i_2201_;
					}
					int i_2202_;
					if ((i_2202_ = (1 + i_2198_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2200_)
						i_2200_ = i_2202_;
					if ((i_2202_ = i_2199_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
						i_2202_ = (anInt10946 - i_2202_) / anInt10946;
						i_2200_ += i_2202_;
						i_2198_ += anInt10956 * i_2202_;
						i_2199_ += anInt10946 * i_2202_;
						i_2197_ += i_2202_;
					}
					if ((i_2202_ = (i_2199_ - anInt10946) / anInt10946) > i_2200_)
						i_2200_ = i_2202_;
					for (/**/; i_2200_ < 0; i_2200_++) {
						method10181((((i_2199_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2198_ >> 12)), i_2197_++, is, i, i_2152_);
						i_2198_ += anInt10956;
						i_2199_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2203_ = anInt10940; i_2203_ < 0; i_2203_++) {
					int i_2204_ = anInt10944;
					int i_2205_ = anInt10951 + anInt10953;
					int i_2206_ = anInt10952 + anInt10954;
					int i_2207_ = anInt10958;
					if (i_2205_ < 0) {
						int i_2208_ = (anInt10956 - 1 - i_2205_) / anInt10956;
						i_2207_ += i_2208_;
						i_2205_ += anInt10956 * i_2208_;
						i_2206_ += anInt10946 * i_2208_;
						i_2204_ += i_2208_;
					}
					int i_2209_;
					if ((i_2209_ = (1 + i_2205_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2207_)
						i_2207_ = i_2209_;
					if (i_2206_ < 0) {
						i_2209_ = (anInt10946 - 1 - i_2206_) / anInt10946;
						i_2207_ += i_2209_;
						i_2205_ += anInt10956 * i_2209_;
						i_2206_ += anInt10946 * i_2209_;
						i_2204_ += i_2209_;
					}
					if ((i_2209_ = (1 + i_2206_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2207_)
						i_2207_ = i_2209_;
					for (/**/; i_2207_ < 0; i_2207_++) {
						method10181((((i_2206_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2205_ >> 12)), i_2204_++, is, i, i_2152_);
						i_2205_ += anInt10956;
						i_2206_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method2593(int i, int i_2210_, int i_2211_, int i_2212_, int i_2213_, int i_2214_, int i_2215_, int i_2216_) {
		if (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2211_ > 0 && i_2212_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2217_ = 0;
				int i_2218_ = 0;
				int i_2219_ = (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2220_ = (((Class161_Sub3_Sub2) this).anInt10942 + ((Class161_Sub3_Sub2) this).anInt10945 + ((Class161_Sub3_Sub2) this).anInt10933);
				int i_2221_ = (((Class161_Sub3_Sub2) this).anInt10929 + ((Class161_Sub3_Sub2) this).anInt10930 + ((Class161_Sub3_Sub2) this).anInt10948);
				int i_2222_ = (i_2220_ << 16) / i_2211_;
				int i_2223_ = (i_2221_ << 16) / i_2212_;
				if (((Class161_Sub3_Sub2) this).anInt10942 > 0) {
					int i_2224_ = (((((Class161_Sub3_Sub2) this).anInt10942 << 16) + i_2222_ - 1) / i_2222_);
					i += i_2224_;
					i_2217_ += (i_2224_ * i_2222_ - (((Class161_Sub3_Sub2) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10929 > 0) {
					int i_2225_ = (((((Class161_Sub3_Sub2) this).anInt10929 << 16) + i_2223_ - 1) / i_2223_);
					i_2210_ += i_2225_;
					i_2218_ += (i_2225_ * i_2223_ - (((Class161_Sub3_Sub2) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub2) this).anInt10945 < i_2220_)
					i_2211_ = ((((Class161_Sub3_Sub2) this).anInt10945 << 16) - i_2217_ + i_2222_ - 1) / i_2222_;
				if (((Class161_Sub3_Sub2) this).anInt10930 < i_2221_)
					i_2212_ = ((((Class161_Sub3_Sub2) this).anInt10930 << 16) - i_2218_ + i_2223_ - 1) / i_2223_;
				int i_2226_ = i + i_2210_ * i_2219_;
				int i_2227_ = i_2219_ - i_2211_;
				if (i_2210_ + i_2212_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2212_ -= (i_2210_ + i_2212_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2210_ < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2228_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2210_);
					i_2212_ -= i_2228_;
					i_2226_ += i_2228_ * i_2219_;
					i_2218_ += i_2223_ * i_2228_;
				}
				if (i + i_2211_ > (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2229_ = (i + i_2211_ - (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2211_ -= i_2229_;
					i_2227_ += i_2229_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub2) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2230_ = ((((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2211_ -= i_2230_;
					i_2226_ += i_2230_;
					i_2217_ += i_2222_ * i_2230_;
					i_2227_ += i_2230_;
				}
				if (i_2215_ == 0) {
					if (i_2213_ == 1) {
						int i_2231_ = i_2217_;
						for (int i_2232_ = -i_2212_; i_2232_ < 0; i_2232_++) {
							int i_2233_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2234_ = -i_2211_; i_2234_ < 0; i_2234_++) {
								is[i_2226_++] = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2233_]);
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2231_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 0) {
						int i_2235_ = (i_2214_ & 0xff0000) >> 16;
						int i_2236_ = (i_2214_ & 0xff00) >> 8;
						int i_2237_ = i_2214_ & 0xff;
						int i_2238_ = i_2217_;
						for (int i_2239_ = -i_2212_; i_2239_ < 0; i_2239_++) {
							int i_2240_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2241_ = -i_2211_; i_2241_ < 0; i_2241_++) {
								int i_2242_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2240_]);
								int i_2243_ = ((i_2242_ & 0xff0000) * i_2235_ & ~0xffffff);
								int i_2244_ = (i_2242_ & 0xff00) * i_2236_ & 0xff0000;
								int i_2245_ = (i_2242_ & 0xff) * i_2237_ & 0xff00;
								is[i_2226_++] = (i_2243_ | i_2244_ | i_2245_) >>> 8;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2238_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 3) {
						int i_2246_ = i_2217_;
						for (int i_2247_ = -i_2212_; i_2247_ < 0; i_2247_++) {
							int i_2248_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2249_ = -i_2211_; i_2249_ < 0; i_2249_++) {
								int i_2250_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2248_]);
								int i_2251_ = i_2250_ + i_2214_;
								int i_2252_ = ((i_2250_ & 0xff00ff) + (i_2214_ & 0xff00ff));
								int i_2253_ = ((i_2252_ & 0x1000100) + (i_2251_ - i_2252_ & 0x10000));
								is[i_2226_++] = i_2251_ - i_2253_ | i_2253_ - (i_2253_ >>> 8);
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2246_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 2) {
						int i_2254_ = i_2214_ >>> 24;
						int i_2255_ = 256 - i_2254_;
						int i_2256_ = (i_2214_ & 0xff00ff) * i_2255_ & ~0xff00ff;
						int i_2257_ = (i_2214_ & 0xff00) * i_2255_ & 0xff0000;
						i_2214_ = (i_2256_ | i_2257_) >>> 8;
						int i_2258_ = i_2217_;
						for (int i_2259_ = -i_2212_; i_2259_ < 0; i_2259_++) {
							int i_2260_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2261_ = -i_2211_; i_2261_ < 0; i_2261_++) {
								int i_2262_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2260_]);
								i_2256_ = ((i_2262_ & 0xff00ff) * i_2254_ & ~0xff00ff);
								i_2257_ = (i_2262_ & 0xff00) * i_2254_ & 0xff0000;
								is[i_2226_++] = ((i_2256_ | i_2257_) >>> 8) + i_2214_;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2258_;
							i_2226_ += i_2227_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2215_ == 1) {
					if (i_2213_ == 1) {
						int i_2263_ = i_2217_;
						for (int i_2264_ = -i_2212_; i_2264_ < 0; i_2264_++) {
							int i_2265_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2266_ = -i_2211_; i_2266_ < 0; i_2266_++) {
								int i_2267_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2265_]);
								if (i_2267_ != 0)
									is[i_2226_++] = i_2267_;
								else
									i_2226_++;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2263_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 0) {
						int i_2268_ = i_2217_;
						if ((i_2214_ & 0xffffff) == 16777215) {
							int i_2269_ = i_2214_ >>> 24;
							int i_2270_ = 256 - i_2269_;
							for (int i_2271_ = -i_2212_; i_2271_ < 0; i_2271_++) {
								int i_2272_ = ((i_2218_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_2273_ = -i_2211_; i_2273_ < 0; i_2273_++) {
									int i_2274_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2272_]);
									if (i_2274_ != 0) {
										int i_2275_ = is[i_2226_];
										is[i_2226_++] = ((((i_2274_ & 0xff00ff) * i_2269_ + ((i_2275_ & 0xff00ff) * i_2270_)) & ~0xff00ff) + (((i_2274_ & 0xff00) * i_2269_ + ((i_2275_ & 0xff00) * i_2270_)) & 0xff0000)) >> 8;
									} else
										i_2226_++;
									i_2217_ += i_2222_;
								}
								i_2218_ += i_2223_;
								i_2217_ = i_2268_;
								i_2226_ += i_2227_;
							}
						} else {
							int i_2276_ = (i_2214_ & 0xff0000) >> 16;
							int i_2277_ = (i_2214_ & 0xff00) >> 8;
							int i_2278_ = i_2214_ & 0xff;
							int i_2279_ = i_2214_ >>> 24;
							int i_2280_ = 256 - i_2279_;
							for (int i_2281_ = -i_2212_; i_2281_ < 0; i_2281_++) {
								int i_2282_ = ((i_2218_ >> 16) * (((Class161_Sub3_Sub2) this).anInt10945));
								for (int i_2283_ = -i_2211_; i_2283_ < 0; i_2283_++) {
									int i_2284_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2282_]);
									if (i_2284_ != 0) {
										if (i_2279_ != 255) {
											int i_2285_ = (((i_2284_ & 0xff0000) * i_2276_) & ~0xffffff);
											int i_2286_ = ((i_2284_ & 0xff00) * i_2277_ & 0xff0000);
											int i_2287_ = ((i_2284_ & 0xff) * i_2278_ & 0xff00);
											i_2284_ = (i_2285_ | i_2286_ | i_2287_) >>> 8;
											int i_2288_ = is[i_2226_];
											is[i_2226_++] = (((((i_2284_ & 0xff00ff) * i_2279_) + ((i_2288_ & 0xff00ff) * i_2280_)) & ~0xff00ff) + ((((i_2284_ & 0xff00) * i_2279_) + ((i_2288_ & 0xff00) * i_2280_)) & 0xff0000)) >> 8;
										} else {
											int i_2289_ = (((i_2284_ & 0xff0000) * i_2276_) & ~0xffffff);
											int i_2290_ = ((i_2284_ & 0xff00) * i_2277_ & 0xff0000);
											int i_2291_ = ((i_2284_ & 0xff) * i_2278_ & 0xff00);
											is[i_2226_++] = (i_2289_ | i_2290_ | i_2291_) >>> 8;
										}
									} else
										i_2226_++;
									i_2217_ += i_2222_;
								}
								i_2218_ += i_2223_;
								i_2217_ = i_2268_;
								i_2226_ += i_2227_;
							}
						}
					} else if (i_2213_ == 3) {
						int i_2292_ = i_2217_;
						int i_2293_ = i_2214_ >>> 24;
						int i_2294_ = 256 - i_2293_;
						for (int i_2295_ = -i_2212_; i_2295_ < 0; i_2295_++) {
							int i_2296_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2297_ = -i_2211_; i_2297_ < 0; i_2297_++) {
								int i_2298_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2296_]);
								int i_2299_ = i_2298_ + i_2214_;
								int i_2300_ = ((i_2298_ & 0xff00ff) + (i_2214_ & 0xff00ff));
								int i_2301_ = ((i_2300_ & 0x1000100) + (i_2299_ - i_2300_ & 0x10000));
								i_2301_ = i_2299_ - i_2301_ | i_2301_ - (i_2301_ >>> 8);
								if (i_2298_ == 0 && i_2293_ != 255) {
									i_2298_ = i_2301_;
									i_2301_ = is[i_2226_];
									i_2301_ = ((((i_2298_ & 0xff00ff) * i_2293_ + (i_2301_ & 0xff00ff) * i_2294_) & ~0xff00ff) + (((i_2298_ & 0xff00) * i_2293_ + (i_2301_ & 0xff00) * i_2294_) & 0xff0000)) >> 8;
								}
								is[i_2226_++] = i_2301_;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2292_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 2) {
						int i_2302_ = i_2214_ >>> 24;
						int i_2303_ = 256 - i_2302_;
						int i_2304_ = (i_2214_ & 0xff00ff) * i_2303_ & ~0xff00ff;
						int i_2305_ = (i_2214_ & 0xff00) * i_2303_ & 0xff0000;
						i_2214_ = (i_2304_ | i_2305_) >>> 8;
						int i_2306_ = i_2217_;
						for (int i_2307_ = -i_2212_; i_2307_ < 0; i_2307_++) {
							int i_2308_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2309_ = -i_2211_; i_2309_ < 0; i_2309_++) {
								int i_2310_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2308_]);
								if (i_2310_ != 0) {
									i_2304_ = ((i_2310_ & 0xff00ff) * i_2302_ & ~0xff00ff);
									i_2305_ = ((i_2310_ & 0xff00) * i_2302_ & 0xff0000);
									is[i_2226_++] = ((i_2304_ | i_2305_) >>> 8) + i_2214_;
								} else
									i_2226_++;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2306_;
							i_2226_ += i_2227_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2215_ == 2) {
					if (i_2213_ == 1) {
						int i_2311_ = i_2217_;
						for (int i_2312_ = -i_2212_; i_2312_ < 0; i_2312_++) {
							int i_2313_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2314_ = -i_2211_; i_2314_ < 0; i_2314_++) {
								int i_2315_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2313_]);
								if (i_2315_ != 0) {
									int i_2316_ = is[i_2226_];
									int i_2317_ = i_2315_ + i_2316_;
									int i_2318_ = ((i_2315_ & 0xff00ff) + (i_2316_ & 0xff00ff));
									i_2316_ = ((i_2318_ & 0x1000100) + (i_2317_ - i_2318_ & 0x10000));
									is[i_2226_++] = (i_2317_ - i_2316_ | i_2316_ - (i_2316_ >>> 8));
								} else
									i_2226_++;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2311_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 0) {
						int i_2319_ = i_2217_;
						int i_2320_ = (i_2214_ & 0xff0000) >> 16;
						int i_2321_ = (i_2214_ & 0xff00) >> 8;
						int i_2322_ = i_2214_ & 0xff;
						for (int i_2323_ = -i_2212_; i_2323_ < 0; i_2323_++) {
							int i_2324_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2325_ = -i_2211_; i_2325_ < 0; i_2325_++) {
								int i_2326_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2324_]);
								if (i_2326_ != 0) {
									int i_2327_ = ((i_2326_ & 0xff0000) * i_2320_ & ~0xffffff);
									int i_2328_ = ((i_2326_ & 0xff00) * i_2321_ & 0xff0000);
									int i_2329_ = (i_2326_ & 0xff) * i_2322_ & 0xff00;
									i_2326_ = (i_2327_ | i_2328_ | i_2329_) >>> 8;
									int i_2330_ = is[i_2226_];
									int i_2331_ = i_2326_ + i_2330_;
									int i_2332_ = ((i_2326_ & 0xff00ff) + (i_2330_ & 0xff00ff));
									i_2330_ = ((i_2332_ & 0x1000100) + (i_2331_ - i_2332_ & 0x10000));
									is[i_2226_++] = (i_2331_ - i_2330_ | i_2330_ - (i_2330_ >>> 8));
								} else
									i_2226_++;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2319_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 3) {
						int i_2333_ = i_2217_;
						for (int i_2334_ = -i_2212_; i_2334_ < 0; i_2334_++) {
							int i_2335_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2336_ = -i_2211_; i_2336_ < 0; i_2336_++) {
								int i_2337_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2335_]);
								int i_2338_ = i_2337_ + i_2214_;
								int i_2339_ = ((i_2337_ & 0xff00ff) + (i_2214_ & 0xff00ff));
								int i_2340_ = ((i_2339_ & 0x1000100) + (i_2338_ - i_2339_ & 0x10000));
								i_2337_ = i_2338_ - i_2340_ | i_2340_ - (i_2340_ >>> 8);
								i_2340_ = is[i_2226_];
								i_2338_ = i_2337_ + i_2340_;
								i_2339_ = (i_2337_ & 0xff00ff) + (i_2340_ & 0xff00ff);
								i_2340_ = ((i_2339_ & 0x1000100) + (i_2338_ - i_2339_ & 0x10000));
								is[i_2226_++] = i_2338_ - i_2340_ | i_2340_ - (i_2340_ >>> 8);
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2333_;
							i_2226_ += i_2227_;
						}
					} else if (i_2213_ == 2) {
						int i_2341_ = i_2214_ >>> 24;
						int i_2342_ = 256 - i_2341_;
						int i_2343_ = (i_2214_ & 0xff00ff) * i_2342_ & ~0xff00ff;
						int i_2344_ = (i_2214_ & 0xff00) * i_2342_ & 0xff0000;
						i_2214_ = (i_2343_ | i_2344_) >>> 8;
						int i_2345_ = i_2217_;
						for (int i_2346_ = -i_2212_; i_2346_ < 0; i_2346_++) {
							int i_2347_ = ((i_2218_ >> 16) * ((Class161_Sub3_Sub2) this).anInt10945);
							for (int i_2348_ = -i_2211_; i_2348_ < 0; i_2348_++) {
								int i_2349_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(i_2217_ >> 16) + i_2347_]);
								if (i_2349_ != 0) {
									i_2343_ = ((i_2349_ & 0xff00ff) * i_2341_ & ~0xff00ff);
									i_2344_ = ((i_2349_ & 0xff00) * i_2341_ & 0xff0000);
									i_2349_ = (((i_2343_ | i_2344_) >>> 8) + i_2214_);
									int i_2350_ = is[i_2226_];
									int i_2351_ = i_2349_ + i_2350_;
									int i_2352_ = ((i_2349_ & 0xff00ff) + (i_2350_ & 0xff00ff));
									i_2350_ = ((i_2352_ & 0x1000100) + (i_2351_ - i_2352_ & 0x10000));
									is[i_2226_++] = (i_2351_ - i_2350_ | i_2350_ - (i_2350_ >>> 8));
								} else
									i_2226_++;
								i_2217_ += i_2222_;
							}
							i_2218_ += i_2223_;
							i_2217_ = i_2345_;
							i_2226_ += i_2227_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10052(int i, int i_2353_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2354_ = anInt10940;
					while (i_2354_ < 0) {
						int i_2355_ = anInt10944;
						int i_2356_ = anInt10951;
						int i_2357_ = anInt10952;
						int i_2358_ = anInt10958;
						if (i_2356_ >= 0 && i_2357_ >= 0 && (i_2356_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0 && (i_2357_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2358_ < 0; i_2358_++)
								method10181((((i_2357_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2356_ >> 12)), i_2355_++, is, i, i_2353_);
						}
						i_2354_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2359_ = anInt10940;
					while (i_2359_ < 0) {
						int i_2360_ = anInt10944;
						int i_2361_ = anInt10951;
						int i_2362_ = anInt10952 + anInt10954;
						int i_2363_ = anInt10958;
						if (i_2361_ >= 0 && (i_2361_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							int i_2364_;
							if ((i_2364_ = (i_2362_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_2364_ = (anInt10946 - i_2364_) / anInt10946;
								i_2363_ += i_2364_;
								i_2362_ += anInt10946 * i_2364_;
								i_2360_ += i_2364_;
							}
							if ((i_2364_ = (i_2362_ - anInt10946) / anInt10946) > i_2363_)
								i_2363_ = i_2364_;
							for (/**/; i_2363_ < 0; i_2363_++) {
								method10181((((i_2362_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2361_ >> 12)), i_2360_++, is, i, i_2353_);
								i_2362_ += anInt10946;
							}
						}
						i_2359_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2365_ = anInt10940;
					while (i_2365_ < 0) {
						int i_2366_ = anInt10944;
						int i_2367_ = anInt10951;
						int i_2368_ = anInt10952 + anInt10954;
						int i_2369_ = anInt10958;
						if (i_2367_ >= 0 && (i_2367_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							if (i_2368_ < 0) {
								int i_2370_ = (anInt10946 - 1 - i_2368_) / anInt10946;
								i_2369_ += i_2370_;
								i_2368_ += anInt10946 * i_2370_;
								i_2366_ += i_2370_;
							}
							int i_2371_;
							if ((i_2371_ = (1 + i_2368_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2369_)
								i_2369_ = i_2371_;
							for (/**/; i_2369_ < 0; i_2369_++) {
								method10181((((i_2368_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2367_ >> 12)), i_2366_++, is, i, i_2353_);
								i_2368_ += anInt10946;
							}
						}
						i_2365_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2372_ = anInt10940;
					while (i_2372_ < 0) {
						int i_2373_ = anInt10944;
						int i_2374_ = anInt10951 + anInt10953;
						int i_2375_ = anInt10952;
						int i_2376_ = anInt10958;
						if (i_2375_ >= 0 && (i_2375_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							int i_2377_;
							if ((i_2377_ = (i_2374_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_2377_ = (anInt10956 - i_2377_) / anInt10956;
								i_2376_ += i_2377_;
								i_2374_ += anInt10956 * i_2377_;
								i_2373_ += i_2377_;
							}
							if ((i_2377_ = (i_2374_ - anInt10956) / anInt10956) > i_2376_)
								i_2376_ = i_2377_;
							for (/**/; i_2376_ < 0; i_2376_++) {
								method10181((((i_2375_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2374_ >> 12)), i_2373_++, is, i, i_2353_);
								i_2374_ += anInt10956;
							}
						}
						i_2372_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2378_ = anInt10940;
					while (i_2378_ < 0) {
						int i_2379_ = anInt10944;
						int i_2380_ = anInt10951 + anInt10953;
						int i_2381_ = anInt10952 + anInt10954;
						int i_2382_ = anInt10958;
						int i_2383_;
						if ((i_2383_ = i_2380_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2383_ = (anInt10956 - i_2383_) / anInt10956;
							i_2382_ += i_2383_;
							i_2380_ += anInt10956 * i_2383_;
							i_2381_ += anInt10946 * i_2383_;
							i_2379_ += i_2383_;
						}
						if ((i_2383_ = (i_2380_ - anInt10956) / anInt10956) > i_2382_)
							i_2382_ = i_2383_;
						if ((i_2383_ = i_2381_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
							i_2383_ = (anInt10946 - i_2383_) / anInt10946;
							i_2382_ += i_2383_;
							i_2380_ += anInt10956 * i_2383_;
							i_2381_ += anInt10946 * i_2383_;
							i_2379_ += i_2383_;
						}
						if ((i_2383_ = (i_2381_ - anInt10946) / anInt10946) > i_2382_)
							i_2382_ = i_2383_;
						for (/**/; i_2382_ < 0; i_2382_++) {
							method10181(((i_2381_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2380_ >> 12), i_2379_++, is, i, i_2353_);
							i_2380_ += anInt10956;
							i_2381_ += anInt10946;
						}
						i_2378_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2384_ = anInt10940;
					while (i_2384_ < 0) {
						int i_2385_ = anInt10944;
						int i_2386_ = anInt10951 + anInt10953;
						int i_2387_ = anInt10952 + anInt10954;
						int i_2388_ = anInt10958;
						int i_2389_;
						if ((i_2389_ = i_2386_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2389_ = (anInt10956 - i_2389_) / anInt10956;
							i_2388_ += i_2389_;
							i_2386_ += anInt10956 * i_2389_;
							i_2387_ += anInt10946 * i_2389_;
							i_2385_ += i_2389_;
						}
						if ((i_2389_ = (i_2386_ - anInt10956) / anInt10956) > i_2388_)
							i_2388_ = i_2389_;
						if (i_2387_ < 0) {
							i_2389_ = (anInt10946 - 1 - i_2387_) / anInt10946;
							i_2388_ += i_2389_;
							i_2386_ += anInt10956 * i_2389_;
							i_2387_ += anInt10946 * i_2389_;
							i_2385_ += i_2389_;
						}
						if ((i_2389_ = (1 + i_2387_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2388_)
							i_2388_ = i_2389_;
						for (/**/; i_2388_ < 0; i_2388_++) {
							method10181(((i_2387_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2386_ >> 12), i_2385_++, is, i, i_2353_);
							i_2386_ += anInt10956;
							i_2387_ += anInt10946;
						}
						i_2384_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2390_ = anInt10940;
				while (i_2390_ < 0) {
					int i_2391_ = anInt10944;
					int i_2392_ = anInt10951 + anInt10953;
					int i_2393_ = anInt10952;
					int i_2394_ = anInt10958;
					if (i_2393_ >= 0 && i_2393_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
						if (i_2392_ < 0) {
							int i_2395_ = (anInt10956 - 1 - i_2392_) / anInt10956;
							i_2394_ += i_2395_;
							i_2392_ += anInt10956 * i_2395_;
							i_2391_ += i_2395_;
						}
						int i_2396_;
						if ((i_2396_ = (1 + i_2392_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2394_)
							i_2394_ = i_2396_;
						for (/**/; i_2394_ < 0; i_2394_++) {
							method10181(((i_2393_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2392_ >> 12), i_2391_++, is, i, i_2353_);
							i_2392_ += anInt10956;
						}
					}
					i_2390_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2397_ = anInt10940; i_2397_ < 0; i_2397_++) {
					int i_2398_ = anInt10944;
					int i_2399_ = anInt10951 + anInt10953;
					int i_2400_ = anInt10952 + anInt10954;
					int i_2401_ = anInt10958;
					if (i_2399_ < 0) {
						int i_2402_ = (anInt10956 - 1 - i_2399_) / anInt10956;
						i_2401_ += i_2402_;
						i_2399_ += anInt10956 * i_2402_;
						i_2400_ += anInt10946 * i_2402_;
						i_2398_ += i_2402_;
					}
					int i_2403_;
					if ((i_2403_ = (1 + i_2399_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2401_)
						i_2401_ = i_2403_;
					if ((i_2403_ = i_2400_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
						i_2403_ = (anInt10946 - i_2403_) / anInt10946;
						i_2401_ += i_2403_;
						i_2399_ += anInt10956 * i_2403_;
						i_2400_ += anInt10946 * i_2403_;
						i_2398_ += i_2403_;
					}
					if ((i_2403_ = (i_2400_ - anInt10946) / anInt10946) > i_2401_)
						i_2401_ = i_2403_;
					for (/**/; i_2401_ < 0; i_2401_++) {
						method10181((((i_2400_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2399_ >> 12)), i_2398_++, is, i, i_2353_);
						i_2399_ += anInt10956;
						i_2400_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2404_ = anInt10940; i_2404_ < 0; i_2404_++) {
					int i_2405_ = anInt10944;
					int i_2406_ = anInt10951 + anInt10953;
					int i_2407_ = anInt10952 + anInt10954;
					int i_2408_ = anInt10958;
					if (i_2406_ < 0) {
						int i_2409_ = (anInt10956 - 1 - i_2406_) / anInt10956;
						i_2408_ += i_2409_;
						i_2406_ += anInt10956 * i_2409_;
						i_2407_ += anInt10946 * i_2409_;
						i_2405_ += i_2409_;
					}
					int i_2410_;
					if ((i_2410_ = (1 + i_2406_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2408_)
						i_2408_ = i_2410_;
					if (i_2407_ < 0) {
						i_2410_ = (anInt10946 - 1 - i_2407_) / anInt10946;
						i_2408_ += i_2410_;
						i_2406_ += anInt10956 * i_2410_;
						i_2407_ += anInt10946 * i_2410_;
						i_2405_ += i_2410_;
					}
					if ((i_2410_ = (1 + i_2407_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2408_)
						i_2408_ = i_2410_;
					for (/**/; i_2408_ < 0; i_2408_++) {
						method10181((((i_2407_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2406_ >> 12)), i_2405_++, is, i, i_2353_);
						i_2406_ += anInt10956;
						i_2407_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10060(int i, int i_2411_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2412_ = anInt10940;
					while (i_2412_ < 0) {
						int i_2413_ = anInt10944;
						int i_2414_ = anInt10951;
						int i_2415_ = anInt10952;
						int i_2416_ = anInt10958;
						if (i_2414_ >= 0 && i_2415_ >= 0 && (i_2414_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0 && (i_2415_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2416_ < 0; i_2416_++)
								method10181((((i_2415_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2414_ >> 12)), i_2413_++, is, i, i_2411_);
						}
						i_2412_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2417_ = anInt10940;
					while (i_2417_ < 0) {
						int i_2418_ = anInt10944;
						int i_2419_ = anInt10951;
						int i_2420_ = anInt10952 + anInt10954;
						int i_2421_ = anInt10958;
						if (i_2419_ >= 0 && (i_2419_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							int i_2422_;
							if ((i_2422_ = (i_2420_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_2422_ = (anInt10946 - i_2422_) / anInt10946;
								i_2421_ += i_2422_;
								i_2420_ += anInt10946 * i_2422_;
								i_2418_ += i_2422_;
							}
							if ((i_2422_ = (i_2420_ - anInt10946) / anInt10946) > i_2421_)
								i_2421_ = i_2422_;
							for (/**/; i_2421_ < 0; i_2421_++) {
								method10181((((i_2420_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2419_ >> 12)), i_2418_++, is, i, i_2411_);
								i_2420_ += anInt10946;
							}
						}
						i_2417_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2423_ = anInt10940;
					while (i_2423_ < 0) {
						int i_2424_ = anInt10944;
						int i_2425_ = anInt10951;
						int i_2426_ = anInt10952 + anInt10954;
						int i_2427_ = anInt10958;
						if (i_2425_ >= 0 && (i_2425_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
							if (i_2426_ < 0) {
								int i_2428_ = (anInt10946 - 1 - i_2426_) / anInt10946;
								i_2427_ += i_2428_;
								i_2426_ += anInt10946 * i_2428_;
								i_2424_ += i_2428_;
							}
							int i_2429_;
							if ((i_2429_ = (1 + i_2426_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2427_)
								i_2427_ = i_2429_;
							for (/**/; i_2427_ < 0; i_2427_++) {
								method10181((((i_2426_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2425_ >> 12)), i_2424_++, is, i, i_2411_);
								i_2426_ += anInt10946;
							}
						}
						i_2423_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2430_ = anInt10940;
					while (i_2430_ < 0) {
						int i_2431_ = anInt10944;
						int i_2432_ = anInt10951 + anInt10953;
						int i_2433_ = anInt10952;
						int i_2434_ = anInt10958;
						if (i_2433_ >= 0 && (i_2433_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							int i_2435_;
							if ((i_2435_ = (i_2432_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_2435_ = (anInt10956 - i_2435_) / anInt10956;
								i_2434_ += i_2435_;
								i_2432_ += anInt10956 * i_2435_;
								i_2431_ += i_2435_;
							}
							if ((i_2435_ = (i_2432_ - anInt10956) / anInt10956) > i_2434_)
								i_2434_ = i_2435_;
							for (/**/; i_2434_ < 0; i_2434_++) {
								method10181((((i_2433_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2432_ >> 12)), i_2431_++, is, i, i_2411_);
								i_2432_ += anInt10956;
							}
						}
						i_2430_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2436_ = anInt10940;
					while (i_2436_ < 0) {
						int i_2437_ = anInt10944;
						int i_2438_ = anInt10951 + anInt10953;
						int i_2439_ = anInt10952 + anInt10954;
						int i_2440_ = anInt10958;
						int i_2441_;
						if ((i_2441_ = i_2438_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2441_ = (anInt10956 - i_2441_) / anInt10956;
							i_2440_ += i_2441_;
							i_2438_ += anInt10956 * i_2441_;
							i_2439_ += anInt10946 * i_2441_;
							i_2437_ += i_2441_;
						}
						if ((i_2441_ = (i_2438_ - anInt10956) / anInt10956) > i_2440_)
							i_2440_ = i_2441_;
						if ((i_2441_ = i_2439_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
							i_2441_ = (anInt10946 - i_2441_) / anInt10946;
							i_2440_ += i_2441_;
							i_2438_ += anInt10956 * i_2441_;
							i_2439_ += anInt10946 * i_2441_;
							i_2437_ += i_2441_;
						}
						if ((i_2441_ = (i_2439_ - anInt10946) / anInt10946) > i_2440_)
							i_2440_ = i_2441_;
						for (/**/; i_2440_ < 0; i_2440_++) {
							method10181(((i_2439_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2438_ >> 12), i_2437_++, is, i, i_2411_);
							i_2438_ += anInt10956;
							i_2439_ += anInt10946;
						}
						i_2436_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2442_ = anInt10940;
					while (i_2442_ < 0) {
						int i_2443_ = anInt10944;
						int i_2444_ = anInt10951 + anInt10953;
						int i_2445_ = anInt10952 + anInt10954;
						int i_2446_ = anInt10958;
						int i_2447_;
						if ((i_2447_ = i_2444_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
							i_2447_ = (anInt10956 - i_2447_) / anInt10956;
							i_2446_ += i_2447_;
							i_2444_ += anInt10956 * i_2447_;
							i_2445_ += anInt10946 * i_2447_;
							i_2443_ += i_2447_;
						}
						if ((i_2447_ = (i_2444_ - anInt10956) / anInt10956) > i_2446_)
							i_2446_ = i_2447_;
						if (i_2445_ < 0) {
							i_2447_ = (anInt10946 - 1 - i_2445_) / anInt10946;
							i_2446_ += i_2447_;
							i_2444_ += anInt10956 * i_2447_;
							i_2445_ += anInt10946 * i_2447_;
							i_2443_ += i_2447_;
						}
						if ((i_2447_ = (1 + i_2445_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2446_)
							i_2446_ = i_2447_;
						for (/**/; i_2446_ < 0; i_2446_++) {
							method10181(((i_2445_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2444_ >> 12), i_2443_++, is, i, i_2411_);
							i_2444_ += anInt10956;
							i_2445_ += anInt10946;
						}
						i_2442_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2448_ = anInt10940;
				while (i_2448_ < 0) {
					int i_2449_ = anInt10944;
					int i_2450_ = anInt10951 + anInt10953;
					int i_2451_ = anInt10952;
					int i_2452_ = anInt10958;
					if (i_2451_ >= 0 && i_2451_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) < 0) {
						if (i_2450_ < 0) {
							int i_2453_ = (anInt10956 - 1 - i_2450_) / anInt10956;
							i_2452_ += i_2453_;
							i_2450_ += anInt10956 * i_2453_;
							i_2449_ += i_2453_;
						}
						int i_2454_;
						if ((i_2454_ = (1 + i_2450_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2452_)
							i_2452_ = i_2454_;
						for (/**/; i_2452_ < 0; i_2452_++) {
							method10181(((i_2451_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2450_ >> 12), i_2449_++, is, i, i_2411_);
							i_2450_ += anInt10956;
						}
					}
					i_2448_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2455_ = anInt10940; i_2455_ < 0; i_2455_++) {
					int i_2456_ = anInt10944;
					int i_2457_ = anInt10951 + anInt10953;
					int i_2458_ = anInt10952 + anInt10954;
					int i_2459_ = anInt10958;
					if (i_2457_ < 0) {
						int i_2460_ = (anInt10956 - 1 - i_2457_) / anInt10956;
						i_2459_ += i_2460_;
						i_2457_ += anInt10956 * i_2460_;
						i_2458_ += anInt10946 * i_2460_;
						i_2456_ += i_2460_;
					}
					int i_2461_;
					if ((i_2461_ = (1 + i_2457_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2459_)
						i_2459_ = i_2461_;
					if ((i_2461_ = i_2458_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) >= 0) {
						i_2461_ = (anInt10946 - i_2461_) / anInt10946;
						i_2459_ += i_2461_;
						i_2457_ += anInt10956 * i_2461_;
						i_2458_ += anInt10946 * i_2461_;
						i_2456_ += i_2461_;
					}
					if ((i_2461_ = (i_2458_ - anInt10946) / anInt10946) > i_2459_)
						i_2459_ = i_2461_;
					for (/**/; i_2459_ < 0; i_2459_++) {
						method10181((((i_2458_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2457_ >> 12)), i_2456_++, is, i, i_2411_);
						i_2457_ += anInt10956;
						i_2458_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2462_ = anInt10940; i_2462_ < 0; i_2462_++) {
					int i_2463_ = anInt10944;
					int i_2464_ = anInt10951 + anInt10953;
					int i_2465_ = anInt10952 + anInt10954;
					int i_2466_ = anInt10958;
					if (i_2464_ < 0) {
						int i_2467_ = (anInt10956 - 1 - i_2464_) / anInt10956;
						i_2466_ += i_2467_;
						i_2464_ += anInt10956 * i_2467_;
						i_2465_ += anInt10946 * i_2467_;
						i_2463_ += i_2467_;
					}
					int i_2468_;
					if ((i_2468_ = (1 + i_2464_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2466_)
						i_2466_ = i_2468_;
					if (i_2465_ < 0) {
						i_2468_ = (anInt10946 - 1 - i_2465_) / anInt10946;
						i_2466_ += i_2468_;
						i_2464_ += anInt10956 * i_2468_;
						i_2465_ += anInt10946 * i_2468_;
						i_2463_ += i_2468_;
					}
					if ((i_2468_ = (1 + i_2465_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2466_)
						i_2466_ = i_2468_;
					for (/**/; i_2466_ < 0; i_2466_++) {
						method10181((((i_2465_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2464_ >> 12)), i_2463_++, is, i, i_2411_);
						i_2464_ += anInt10956;
						i_2465_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10059(int[] is, int[] is_2469_, int i, int i_2470_) {
		int[] is_2471_ = (((Class106_Sub2) ((Class161_Sub3_Sub2) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_2471_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2472_ = anInt10940;
					while (i_2472_ < 0) {
						int i_2473_ = i_2472_ + i_2470_;
						if (i_2473_ >= 0) {
							if (i_2473_ >= is.length)
								break;
							int i_2474_ = anInt10944;
							int i_2475_ = anInt10951;
							int i_2476_ = anInt10952;
							int i_2477_ = anInt10958;
							if (i_2475_ >= 0 && i_2476_ >= 0 && (i_2475_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0 && (i_2476_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
								int i_2478_ = is[i_2473_] - i;
								int i_2479_ = -is_2469_[i_2473_];
								int i_2480_ = i_2478_ - (i_2474_ - anInt10944);
								if (i_2480_ > 0) {
									i_2474_ += i_2480_;
									i_2477_ += i_2480_;
									i_2475_ += anInt10956 * i_2480_;
									i_2476_ += anInt10946 * i_2480_;
								} else
									i_2479_ -= i_2480_;
								if (i_2477_ < i_2479_)
									i_2477_ = i_2479_;
								for (/**/; i_2477_ < 0; i_2477_++) {
									int i_2481_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2476_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2475_ >> 12))]);
									if (i_2481_ != 0)
										is_2471_[i_2474_++] = i_2481_;
									else
										i_2474_++;
								}
							}
						}
						i_2472_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2482_ = anInt10940;
					while (i_2482_ < 0) {
						int i_2483_ = i_2482_ + i_2470_;
						if (i_2483_ >= 0) {
							if (i_2483_ >= is.length)
								break;
							int i_2484_ = anInt10944;
							int i_2485_ = anInt10951;
							int i_2486_ = anInt10952 + anInt10954;
							int i_2487_ = anInt10958;
							if (i_2485_ >= 0 && (i_2485_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
								int i_2488_;
								if ((i_2488_ = i_2486_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
									i_2488_ = (anInt10946 - i_2488_) / anInt10946;
									i_2487_ += i_2488_;
									i_2486_ += anInt10946 * i_2488_;
									i_2484_ += i_2488_;
								}
								if ((i_2488_ = (i_2486_ - anInt10946) / anInt10946) > i_2487_)
									i_2487_ = i_2488_;
								int i_2489_ = is[i_2483_] - i;
								int i_2490_ = -is_2469_[i_2483_];
								int i_2491_ = i_2489_ - (i_2484_ - anInt10944);
								if (i_2491_ > 0) {
									i_2484_ += i_2491_;
									i_2487_ += i_2491_;
									i_2485_ += anInt10956 * i_2491_;
									i_2486_ += anInt10946 * i_2491_;
								} else
									i_2490_ -= i_2491_;
								if (i_2487_ < i_2490_)
									i_2487_ = i_2490_;
								for (/**/; i_2487_ < 0; i_2487_++) {
									int i_2492_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2486_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2485_ >> 12))]);
									if (i_2492_ != 0)
										is_2471_[i_2484_++] = i_2492_;
									else
										i_2484_++;
									i_2486_ += anInt10946;
								}
							}
						}
						i_2482_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2493_ = anInt10940;
					while (i_2493_ < 0) {
						int i_2494_ = i_2493_ + i_2470_;
						if (i_2494_ >= 0) {
							if (i_2494_ >= is.length)
								break;
							int i_2495_ = anInt10944;
							int i_2496_ = anInt10951;
							int i_2497_ = anInt10952 + anInt10954;
							int i_2498_ = anInt10958;
							if (i_2496_ >= 0 && (i_2496_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12)) < 0) {
								if (i_2497_ < 0) {
									int i_2499_ = ((anInt10946 - 1 - i_2497_) / anInt10946);
									i_2498_ += i_2499_;
									i_2497_ += anInt10946 * i_2499_;
									i_2495_ += i_2499_;
								}
								int i_2500_;
								if ((i_2500_ = (1 + i_2497_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_2498_)
									i_2498_ = i_2500_;
								int i_2501_ = is[i_2494_] - i;
								int i_2502_ = -is_2469_[i_2494_];
								int i_2503_ = i_2501_ - (i_2495_ - anInt10944);
								if (i_2503_ > 0) {
									i_2495_ += i_2503_;
									i_2498_ += i_2503_;
									i_2496_ += anInt10956 * i_2503_;
									i_2497_ += anInt10946 * i_2503_;
								} else
									i_2502_ -= i_2503_;
								if (i_2498_ < i_2502_)
									i_2498_ = i_2502_;
								for (/**/; i_2498_ < 0; i_2498_++) {
									int i_2504_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2497_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2496_ >> 12))]);
									if (i_2504_ != 0)
										is_2471_[i_2495_++] = i_2504_;
									else
										i_2495_++;
									i_2497_ += anInt10946;
								}
							}
						}
						i_2493_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2505_ = anInt10940;
					while (i_2505_ < 0) {
						int i_2506_ = i_2505_ + i_2470_;
						if (i_2506_ >= 0) {
							if (i_2506_ >= is.length)
								break;
							int i_2507_ = anInt10944;
							int i_2508_ = anInt10951 + anInt10953;
							int i_2509_ = anInt10952;
							int i_2510_ = anInt10958;
							if (i_2509_ >= 0 && (i_2509_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
								int i_2511_;
								if ((i_2511_ = i_2508_ - ((((Class161_Sub3_Sub2) this).anInt10945) << 12)) >= 0) {
									i_2511_ = (anInt10956 - i_2511_) / anInt10956;
									i_2510_ += i_2511_;
									i_2508_ += anInt10956 * i_2511_;
									i_2507_ += i_2511_;
								}
								if ((i_2511_ = (i_2508_ - anInt10956) / anInt10956) > i_2510_)
									i_2510_ = i_2511_;
								int i_2512_ = is[i_2506_] - i;
								int i_2513_ = -is_2469_[i_2506_];
								int i_2514_ = i_2512_ - (i_2507_ - anInt10944);
								if (i_2514_ > 0) {
									i_2507_ += i_2514_;
									i_2510_ += i_2514_;
									i_2508_ += anInt10956 * i_2514_;
									i_2509_ += anInt10946 * i_2514_;
								} else
									i_2513_ -= i_2514_;
								if (i_2510_ < i_2513_)
									i_2510_ = i_2513_;
								for (/**/; i_2510_ < 0; i_2510_++) {
									int i_2515_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2509_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2508_ >> 12))]);
									if (i_2515_ != 0)
										is_2471_[i_2507_++] = i_2515_;
									else
										i_2507_++;
									i_2508_ += anInt10956;
								}
							}
						}
						i_2505_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2516_ = anInt10940;
					while (i_2516_ < 0) {
						int i_2517_ = i_2516_ + i_2470_;
						if (i_2517_ >= 0) {
							if (i_2517_ >= is.length)
								break;
							int i_2518_ = anInt10944;
							int i_2519_ = anInt10951 + anInt10953;
							int i_2520_ = anInt10952 + anInt10954;
							int i_2521_ = anInt10958;
							int i_2522_;
							if ((i_2522_ = (i_2519_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_2522_ = (anInt10956 - i_2522_) / anInt10956;
								i_2521_ += i_2522_;
								i_2519_ += anInt10956 * i_2522_;
								i_2520_ += anInt10946 * i_2522_;
								i_2518_ += i_2522_;
							}
							if ((i_2522_ = (i_2519_ - anInt10956) / anInt10956) > i_2521_)
								i_2521_ = i_2522_;
							if ((i_2522_ = (i_2520_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12))) >= 0) {
								i_2522_ = (anInt10946 - i_2522_) / anInt10946;
								i_2521_ += i_2522_;
								i_2519_ += anInt10956 * i_2522_;
								i_2520_ += anInt10946 * i_2522_;
								i_2518_ += i_2522_;
							}
							if ((i_2522_ = (i_2520_ - anInt10946) / anInt10946) > i_2521_)
								i_2521_ = i_2522_;
							int i_2523_ = is[i_2517_] - i;
							int i_2524_ = -is_2469_[i_2517_];
							int i_2525_ = i_2523_ - (i_2518_ - anInt10944);
							if (i_2525_ > 0) {
								i_2518_ += i_2525_;
								i_2521_ += i_2525_;
								i_2519_ += anInt10956 * i_2525_;
								i_2520_ += anInt10946 * i_2525_;
							} else
								i_2524_ -= i_2525_;
							if (i_2521_ < i_2524_)
								i_2521_ = i_2524_;
							for (/**/; i_2521_ < 0; i_2521_++) {
								int i_2526_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_2520_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2519_ >> 12)]);
								if (i_2526_ != 0)
									is_2471_[i_2518_++] = i_2526_;
								else
									i_2518_++;
								i_2519_ += anInt10956;
								i_2520_ += anInt10946;
							}
						}
						i_2516_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2527_ = anInt10940;
					while (i_2527_ < 0) {
						int i_2528_ = i_2527_ + i_2470_;
						if (i_2528_ >= 0) {
							if (i_2528_ >= is.length)
								break;
							int i_2529_ = anInt10944;
							int i_2530_ = anInt10951 + anInt10953;
							int i_2531_ = anInt10952 + anInt10954;
							int i_2532_ = anInt10958;
							int i_2533_;
							if ((i_2533_ = (i_2530_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12))) >= 0) {
								i_2533_ = (anInt10956 - i_2533_) / anInt10956;
								i_2532_ += i_2533_;
								i_2530_ += anInt10956 * i_2533_;
								i_2531_ += anInt10946 * i_2533_;
								i_2529_ += i_2533_;
							}
							if ((i_2533_ = (i_2530_ - anInt10956) / anInt10956) > i_2532_)
								i_2532_ = i_2533_;
							if (i_2531_ < 0) {
								i_2533_ = (anInt10946 - 1 - i_2531_) / anInt10946;
								i_2532_ += i_2533_;
								i_2530_ += anInt10956 * i_2533_;
								i_2531_ += anInt10946 * i_2533_;
								i_2529_ += i_2533_;
							}
							if ((i_2533_ = (1 + i_2531_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2532_)
								i_2532_ = i_2533_;
							int i_2534_ = is[i_2528_] - i;
							int i_2535_ = -is_2469_[i_2528_];
							int i_2536_ = i_2534_ - (i_2529_ - anInt10944);
							if (i_2536_ > 0) {
								i_2529_ += i_2536_;
								i_2532_ += i_2536_;
								i_2530_ += anInt10956 * i_2536_;
								i_2531_ += anInt10946 * i_2536_;
							} else
								i_2535_ -= i_2536_;
							if (i_2532_ < i_2535_)
								i_2532_ = i_2535_;
							for (/**/; i_2532_ < 0; i_2532_++) {
								int i_2537_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_2531_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2530_ >> 12)]);
								if (i_2537_ != 0)
									is_2471_[i_2529_++] = i_2537_;
								else
									i_2529_++;
								i_2530_ += anInt10956;
								i_2531_ += anInt10946;
							}
						}
						i_2527_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2538_ = anInt10940;
				while (i_2538_ < 0) {
					int i_2539_ = i_2538_ + i_2470_;
					if (i_2539_ >= 0) {
						if (i_2539_ >= is.length)
							break;
						int i_2540_ = anInt10944;
						int i_2541_ = anInt10951 + anInt10953;
						int i_2542_ = anInt10952;
						int i_2543_ = anInt10958;
						if (i_2542_ >= 0 && (i_2542_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12)) < 0) {
							if (i_2541_ < 0) {
								int i_2544_ = (anInt10956 - 1 - i_2541_) / anInt10956;
								i_2543_ += i_2544_;
								i_2541_ += anInt10956 * i_2544_;
								i_2540_ += i_2544_;
							}
							int i_2545_;
							if ((i_2545_ = (1 + i_2541_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2543_)
								i_2543_ = i_2545_;
							int i_2546_ = is[i_2539_] - i;
							int i_2547_ = -is_2469_[i_2539_];
							int i_2548_ = i_2546_ - (i_2540_ - anInt10944);
							if (i_2548_ > 0) {
								i_2540_ += i_2548_;
								i_2543_ += i_2548_;
								i_2541_ += anInt10956 * i_2548_;
								i_2542_ += anInt10946 * i_2548_;
							} else
								i_2547_ -= i_2548_;
							if (i_2543_ < i_2547_)
								i_2543_ = i_2547_;
							for (/**/; i_2543_ < 0; i_2543_++) {
								int i_2549_ = (((Class161_Sub3_Sub2) this).anIntArray11237[((i_2542_ >> 12) * (((Class161_Sub3_Sub2) this).anInt10945)) + (i_2541_ >> 12)]);
								if (i_2549_ != 0)
									is_2471_[i_2540_++] = i_2549_;
								else
									i_2540_++;
								i_2541_ += anInt10956;
							}
						}
					}
					i_2538_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_2550_ = anInt10940;
				while (i_2550_ < 0) {
					int i_2551_ = i_2550_ + i_2470_;
					if (i_2551_ >= 0) {
						if (i_2551_ >= is.length)
							break;
						int i_2552_ = anInt10944;
						int i_2553_ = anInt10951 + anInt10953;
						int i_2554_ = anInt10952 + anInt10954;
						int i_2555_ = anInt10958;
						if (i_2553_ < 0) {
							int i_2556_ = (anInt10956 - 1 - i_2553_) / anInt10956;
							i_2555_ += i_2556_;
							i_2553_ += anInt10956 * i_2556_;
							i_2554_ += anInt10946 * i_2556_;
							i_2552_ += i_2556_;
						}
						int i_2557_;
						if ((i_2557_ = (1 + i_2553_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2555_)
							i_2555_ = i_2557_;
						if ((i_2557_ = i_2554_ - ((((Class161_Sub3_Sub2) this).anInt10930) << 12)) >= 0) {
							i_2557_ = (anInt10946 - i_2557_) / anInt10946;
							i_2555_ += i_2557_;
							i_2553_ += anInt10956 * i_2557_;
							i_2554_ += anInt10946 * i_2557_;
							i_2552_ += i_2557_;
						}
						if ((i_2557_ = (i_2554_ - anInt10946) / anInt10946) > i_2555_)
							i_2555_ = i_2557_;
						int i_2558_ = is[i_2551_] - i;
						int i_2559_ = -is_2469_[i_2551_];
						int i_2560_ = i_2558_ - (i_2552_ - anInt10944);
						if (i_2560_ > 0) {
							i_2552_ += i_2560_;
							i_2555_ += i_2560_;
							i_2553_ += anInt10956 * i_2560_;
							i_2554_ += anInt10946 * i_2560_;
						} else
							i_2559_ -= i_2560_;
						if (i_2555_ < i_2559_)
							i_2555_ = i_2559_;
						for (/**/; i_2555_ < 0; i_2555_++) {
							int i_2561_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2554_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2553_ >> 12))]);
							if (i_2561_ != 0)
								is_2471_[i_2552_++] = i_2561_;
							else
								i_2552_++;
							i_2553_ += anInt10956;
							i_2554_ += anInt10946;
						}
					}
					i_2550_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				int i_2562_ = anInt10940;
				while (i_2562_ < 0) {
					int i_2563_ = i_2562_ + i_2470_;
					if (i_2563_ >= 0) {
						if (i_2563_ >= is.length)
							break;
						int i_2564_ = anInt10944;
						int i_2565_ = anInt10951 + anInt10953;
						int i_2566_ = anInt10952 + anInt10954;
						int i_2567_ = anInt10958;
						if (i_2565_ < 0) {
							int i_2568_ = (anInt10956 - 1 - i_2565_) / anInt10956;
							i_2567_ += i_2568_;
							i_2565_ += anInt10956 * i_2568_;
							i_2566_ += anInt10946 * i_2568_;
							i_2564_ += i_2568_;
						}
						int i_2569_;
						if ((i_2569_ = (1 + i_2565_ - (((Class161_Sub3_Sub2) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2567_)
							i_2567_ = i_2569_;
						if (i_2566_ < 0) {
							i_2569_ = (anInt10946 - 1 - i_2566_) / anInt10946;
							i_2567_ += i_2569_;
							i_2565_ += anInt10956 * i_2569_;
							i_2566_ += anInt10946 * i_2569_;
							i_2564_ += i_2569_;
						}
						if ((i_2569_ = (1 + i_2566_ - (((Class161_Sub3_Sub2) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2567_)
							i_2567_ = i_2569_;
						int i_2570_ = is[i_2563_] - i;
						int i_2571_ = -is_2469_[i_2563_];
						int i_2572_ = i_2570_ - (i_2564_ - anInt10944);
						if (i_2572_ > 0) {
							i_2564_ += i_2572_;
							i_2567_ += i_2572_;
							i_2565_ += anInt10956 * i_2572_;
							i_2566_ += anInt10946 * i_2572_;
						} else
							i_2571_ -= i_2572_;
						if (i_2567_ < i_2571_)
							i_2567_ = i_2571_;
						for (/**/; i_2567_ < 0; i_2567_++) {
							int i_2573_ = (((Class161_Sub3_Sub2) this).anIntArray11237[(((i_2566_ >> 12) * ((Class161_Sub3_Sub2) this).anInt10945) + (i_2565_ >> 12))]);
							if (i_2573_ != 0)
								is_2471_[i_2564_++] = i_2573_;
							else
								i_2564_++;
							i_2565_ += anInt10956;
							i_2566_ += anInt10946;
						}
					}
					i_2562_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10185(int i, int i_2574_, int[] is, int i_2575_, int i_2576_) {
		if (i_2576_ == 0) {
			if (i_2575_ == 1)
				is[i_2574_] = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
			else if (i_2575_ == 0) {
				int i_2577_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i++];
				int i_2578_ = (i_2577_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_2579_ = (i_2577_ & 0xff00) * anInt10959 & 0xff0000;
				int i_2580_ = (i_2577_ & 0xff) * anInt10960 & 0xff00;
				is[i_2574_] = (i_2578_ | i_2579_ | i_2580_) >>> 8;
			} else if (i_2575_ == 3) {
				int i_2581_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i++];
				int i_2582_ = anInt10928;
				int i_2583_ = i_2581_ + i_2582_;
				int i_2584_ = (i_2581_ & 0xff00ff) + (i_2582_ & 0xff00ff);
				int i_2585_ = (i_2584_ & 0x1000100) + (i_2583_ - i_2584_ & 0x10000);
				is[i_2574_] = i_2583_ - i_2585_ | i_2585_ - (i_2585_ >>> 8);
			} else if (i_2575_ == 2) {
				int i_2586_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_2587_ = (i_2586_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_2588_ = (i_2586_ & 0xff00) * anInt10934 & 0xff0000;
				is[i_2574_] = ((i_2587_ | i_2588_) >>> 8) + anInt10963;
			} else
				throw new IllegalArgumentException();
		} else if (i_2576_ == 1) {
			if (i_2575_ == 1) {
				int i_2589_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2589_ != 0)
					is[i_2574_] = i_2589_;
			} else if (i_2575_ == 0) {
				int i_2590_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2590_ != 0) {
					if ((anInt10928 & 0xffffff) == 16777215) {
						int i_2591_ = anInt10928 >>> 24;
						int i_2592_ = 256 - i_2591_;
						int i_2593_ = is[i_2574_];
						is[i_2574_] = ((((i_2590_ & 0xff00ff) * i_2591_ + (i_2593_ & 0xff00ff) * i_2592_) & ~0xff00ff) + (((i_2590_ & 0xff00) * i_2591_ + (i_2593_ & 0xff00) * i_2592_) & 0xff0000)) >> 8;
					} else if (anInt10934 != 255) {
						int i_2594_ = (i_2590_ & 0xff0000) * anInt10955 & ~0xffffff;
						int i_2595_ = (i_2590_ & 0xff00) * anInt10959 & 0xff0000;
						int i_2596_ = (i_2590_ & 0xff) * anInt10960 & 0xff00;
						i_2590_ = (i_2594_ | i_2595_ | i_2596_) >>> 8;
						int i_2597_ = is[i_2574_];
						is[i_2574_] = ((((i_2590_ & 0xff00ff) * anInt10934 + (i_2597_ & 0xff00ff) * anInt10957) & ~0xff00ff) + (((i_2590_ & 0xff00) * anInt10934 + (i_2597_ & 0xff00) * anInt10957) & 0xff0000)) >> 8;
					} else {
						int i_2598_ = (i_2590_ & 0xff0000) * anInt10955 & ~0xffffff;
						int i_2599_ = (i_2590_ & 0xff00) * anInt10959 & 0xff0000;
						int i_2600_ = (i_2590_ & 0xff) * anInt10960 & 0xff00;
						is[i_2574_] = (i_2598_ | i_2599_ | i_2600_) >>> 8;
					}
				}
			} else if (i_2575_ == 3) {
				int i_2601_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_2602_ = anInt10928;
				int i_2603_ = i_2601_ + i_2602_;
				int i_2604_ = (i_2601_ & 0xff00ff) + (i_2602_ & 0xff00ff);
				int i_2605_ = (i_2604_ & 0x1000100) + (i_2603_ - i_2604_ & 0x10000);
				i_2605_ = i_2603_ - i_2605_ | i_2605_ - (i_2605_ >>> 8);
				if (i_2601_ == 0 && anInt10934 != 255) {
					i_2601_ = i_2605_;
					i_2605_ = is[i_2574_];
					i_2605_ = ((((i_2601_ & 0xff00ff) * anInt10934 + (i_2605_ & 0xff00ff) * anInt10957) & ~0xff00ff) + (((i_2601_ & 0xff00) * anInt10934 + (i_2605_ & 0xff00) * anInt10957) & 0xff0000)) >> 8;
				}
				is[i_2574_] = i_2605_;
			} else if (i_2575_ == 2) {
				int i_2606_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2606_ != 0) {
					int i_2607_ = (i_2606_ & 0xff00ff) * anInt10934 & ~0xff00ff;
					int i_2608_ = (i_2606_ & 0xff00) * anInt10934 & 0xff0000;
					is[i_2574_++] = ((i_2607_ | i_2608_) >>> 8) + anInt10963;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_2576_ == 2) {
			if (i_2575_ == 1) {
				int i_2609_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2609_ != 0) {
					int i_2610_ = is[i_2574_];
					int i_2611_ = i_2609_ + i_2610_;
					int i_2612_ = (i_2609_ & 0xff00ff) + (i_2610_ & 0xff00ff);
					i_2610_ = (i_2612_ & 0x1000100) + (i_2611_ - i_2612_ & 0x10000);
					is[i_2574_] = i_2611_ - i_2610_ | i_2610_ - (i_2610_ >>> 8);
				}
			} else if (i_2575_ == 0) {
				int i_2613_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2613_ != 0) {
					int i_2614_ = (i_2613_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_2615_ = (i_2613_ & 0xff00) * anInt10959 & 0xff0000;
					int i_2616_ = (i_2613_ & 0xff) * anInt10960 & 0xff00;
					i_2613_ = (i_2614_ | i_2615_ | i_2616_) >>> 8;
					int i_2617_ = is[i_2574_];
					int i_2618_ = i_2613_ + i_2617_;
					int i_2619_ = (i_2613_ & 0xff00ff) + (i_2617_ & 0xff00ff);
					i_2617_ = (i_2619_ & 0x1000100) + (i_2618_ - i_2619_ & 0x10000);
					is[i_2574_] = i_2618_ - i_2617_ | i_2617_ - (i_2617_ >>> 8);
				}
			} else if (i_2575_ == 3) {
				int i_2620_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				int i_2621_ = anInt10928;
				int i_2622_ = i_2620_ + i_2621_;
				int i_2623_ = (i_2620_ & 0xff00ff) + (i_2621_ & 0xff00ff);
				int i_2624_ = (i_2623_ & 0x1000100) + (i_2622_ - i_2623_ & 0x10000);
				i_2620_ = i_2622_ - i_2624_ | i_2624_ - (i_2624_ >>> 8);
				i_2624_ = is[i_2574_];
				i_2622_ = i_2620_ + i_2624_;
				i_2623_ = (i_2620_ & 0xff00ff) + (i_2624_ & 0xff00ff);
				i_2624_ = (i_2623_ & 0x1000100) + (i_2622_ - i_2623_ & 0x10000);
				is[i_2574_] = i_2622_ - i_2624_ | i_2624_ - (i_2624_ >>> 8);
			} else if (i_2575_ == 2) {
				int i_2625_ = ((Class161_Sub3_Sub2) this).anIntArray11237[i];
				if (i_2625_ != 0) {
					int i_2626_ = (i_2625_ & 0xff00ff) * anInt10934 & ~0xff00ff;
					int i_2627_ = (i_2625_ & 0xff00) * anInt10934 & 0xff0000;
					i_2625_ = ((i_2626_ | i_2627_) >>> 8) + anInt10963;
					int i_2628_ = is[i_2574_];
					int i_2629_ = i_2625_ + i_2628_;
					int i_2630_ = (i_2625_ & 0xff00ff) + (i_2628_ & 0xff00ff);
					i_2628_ = (i_2630_ & 0x1000100) + (i_2629_ - i_2630_ & 0x10000);
					is[i_2574_] = i_2629_ - i_2628_ | i_2628_ - (i_2628_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2627(int i, int i_2631_, int i_2632_, int i_2633_, int[] is, int i_2634_, int i_2635_) {
		i_2635_ -= i_2632_;
		for (int i_2636_ = 0; i_2636_ < i_2633_; i_2636_++) {
			int i_2637_ = (i_2631_ + i_2636_) * i_2632_ + i;
			for (int i_2638_ = 0; i_2638_ < i_2632_; i_2638_++)
				((Class161_Sub3_Sub2) this).anIntArray11237[i_2637_ + i_2638_] = is[i_2634_++];
			i_2634_ += i_2635_;
		}
	}
}
