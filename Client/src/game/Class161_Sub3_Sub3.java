package game;

/* Class161_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub3_Sub3 extends Class161_Sub3 {
	int[] anIntArray11238;

	public void method2591(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		i_4_ -= i_1_;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * i_1_ + i;
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_6_ + i_7_] = is[i_3_++];
			i_3_ += i_4_;
		}
	}

	void method2623(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_9_ > 0 && i_10_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_15_ = 0;
				int i_16_ = 0;
				int i_17_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_18_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_19_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_20_ = (i_18_ << 16) / i_9_;
				int i_21_ = (i_19_ << 16) / i_10_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_22_ = ((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_20_ - 1) / i_20_;
					i += i_22_;
					i_15_ += (i_22_ * i_20_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_23_ = ((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_21_ - 1) / i_21_;
					i_8_ += i_23_;
					i_16_ += (i_23_ * i_21_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_18_)
					i_9_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_15_ + i_20_ - 1) / i_20_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_19_)
					i_10_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_16_ + i_21_ - 1) / i_21_;
				int i_24_ = i + i_8_ * i_17_;
				int i_25_ = i_17_ - i_9_;
				if (i_8_ + i_10_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_10_ -= (i_8_ + i_10_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_8_ < (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259) {
					int i_26_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_8_);
					i_10_ -= i_26_;
					i_24_ += i_26_ * i_17_;
					i_16_ += i_21_ * i_26_;
				}
				if (i + i_9_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
					int i_27_ = (i + i_9_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_9_ -= i_27_;
					i_25_ += i_27_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_28_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
					i_9_ -= i_28_;
					i_24_ += i_28_;
					i_15_ += i_20_ * i_28_;
					i_25_ += i_28_;
				}
				if (i_13_ == 0) {
					if (i_11_ == 1) {
						int i_29_ = i_15_;
						for (int i_30_ = -i_10_; i_30_ < 0; i_30_++) {
							int i_31_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_32_ = -i_9_; i_32_ < 0; i_32_++) {
								is[i_24_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_31_]);
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_29_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 0) {
						int i_33_ = (i_12_ & 0xff0000) >> 16;
						int i_34_ = (i_12_ & 0xff00) >> 8;
						int i_35_ = i_12_ & 0xff;
						int i_36_ = i_15_;
						for (int i_37_ = -i_10_; i_37_ < 0; i_37_++) {
							int i_38_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_39_ = -i_9_; i_39_ < 0; i_39_++) {
								int i_40_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_38_]);
								int i_41_ = (i_40_ & 0xff0000) * i_33_ & ~0xffffff;
								int i_42_ = (i_40_ & 0xff00) * i_34_ & 0xff0000;
								int i_43_ = (i_40_ & 0xff) * i_35_ & 0xff00;
								is[i_24_++] = (i_41_ | i_42_ | i_43_) >>> 8;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_36_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 3) {
						int i_44_ = i_15_;
						for (int i_45_ = -i_10_; i_45_ < 0; i_45_++) {
							int i_46_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_47_ = -i_9_; i_47_ < 0; i_47_++) {
								int i_48_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_46_]);
								int i_49_ = i_48_ + i_12_;
								int i_50_ = (i_48_ & 0xff00ff) + (i_12_ & 0xff00ff);
								int i_51_ = ((i_50_ & 0x1000100) + (i_49_ - i_50_ & 0x10000));
								is[i_24_++] = i_49_ - i_51_ | i_51_ - (i_51_ >>> 8);
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_44_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 2) {
						int i_52_ = i_12_ >>> 24;
						int i_53_ = 256 - i_52_;
						int i_54_ = (i_12_ & 0xff00ff) * i_53_ & ~0xff00ff;
						int i_55_ = (i_12_ & 0xff00) * i_53_ & 0xff0000;
						i_12_ = (i_54_ | i_55_) >>> 8;
						int i_56_ = i_15_;
						for (int i_57_ = -i_10_; i_57_ < 0; i_57_++) {
							int i_58_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_59_ = -i_9_; i_59_ < 0; i_59_++) {
								int i_60_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_58_]);
								i_54_ = (i_60_ & 0xff00ff) * i_52_ & ~0xff00ff;
								i_55_ = (i_60_ & 0xff00) * i_52_ & 0xff0000;
								is[i_24_++] = ((i_54_ | i_55_) >>> 8) + i_12_;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_56_;
							i_24_ += i_25_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_13_ == 1) {
					if (i_11_ == 1) {
						int i_61_ = i_15_;
						for (int i_62_ = -i_10_; i_62_ < 0; i_62_++) {
							int i_63_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_64_ = -i_9_; i_64_ < 0; i_64_++) {
								int i_65_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_63_]);
								int i_66_ = i_65_ >>> 24;
								int i_67_ = 256 - i_66_;
								int i_68_ = is[i_24_];
								is[i_24_++] = (((((i_65_ & 0xff00ff) * i_66_ + (i_68_ & 0xff00ff) * i_67_) & ~0xff00ff) >> 8) + ((((i_65_ & ~0xff00ff) >>> 8) * i_66_ + (((i_68_ & ~0xff00ff) >>> 8) * i_67_)) & ~0xff00ff));
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_61_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 0) {
						int i_69_ = i_15_;
						if ((i_12_ & 0xffffff) == 16777215) {
							for (int i_70_ = -i_10_; i_70_ < 0; i_70_++) {
								int i_71_ = ((i_16_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_72_ = -i_9_; i_72_ < 0; i_72_++) {
									int i_73_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_71_]);
									int i_74_ = (i_73_ >>> 24) * (i_12_ >>> 24) >> 8;
									int i_75_ = 256 - i_74_;
									int i_76_ = is[i_24_];
									is[i_24_++] = ((((i_73_ & 0xff00ff) * i_74_ + (i_76_ & 0xff00ff) * i_75_) & ~0xff00ff) + (((i_73_ & 0xff00) * i_74_ + (i_76_ & 0xff00) * i_75_) & 0xff0000)) >> 8;
									i_15_ += i_20_;
								}
								i_16_ += i_21_;
								i_15_ = i_69_;
								i_24_ += i_25_;
							}
						} else {
							int i_77_ = (i_12_ & 0xff0000) >> 16;
							int i_78_ = (i_12_ & 0xff00) >> 8;
							int i_79_ = i_12_ & 0xff;
							for (int i_80_ = -i_10_; i_80_ < 0; i_80_++) {
								int i_81_ = ((i_16_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_82_ = -i_9_; i_82_ < 0; i_82_++) {
									int i_83_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_81_]);
									int i_84_ = (i_83_ >>> 24) * (i_12_ >>> 24) >> 8;
									int i_85_ = 256 - i_84_;
									if (i_84_ != 255) {
										int i_86_ = ((i_83_ & 0xff0000) * i_77_ & ~0xffffff);
										int i_87_ = ((i_83_ & 0xff00) * i_78_ & 0xff0000);
										int i_88_ = (i_83_ & 0xff) * i_79_ & 0xff00;
										i_83_ = (i_86_ | i_87_ | i_88_) >>> 8;
										int i_89_ = is[i_24_];
										is[i_24_++] = ((((i_83_ & 0xff00ff) * i_84_ + (i_89_ & 0xff00ff) * i_85_) & ~0xff00ff) + (((i_83_ & 0xff00) * i_84_ + (i_89_ & 0xff00) * i_85_) & 0xff0000)) >> 8;
									} else {
										int i_90_ = ((i_83_ & 0xff0000) * i_77_ & ~0xffffff);
										int i_91_ = ((i_83_ & 0xff00) * i_78_ & 0xff0000);
										int i_92_ = (i_83_ & 0xff) * i_79_ & 0xff00;
										is[i_24_++] = (i_90_ | i_91_ | i_92_) >>> 8;
									}
									i_15_ += i_20_;
								}
								i_16_ += i_21_;
								i_15_ = i_69_;
								i_24_ += i_25_;
							}
						}
					} else if (i_11_ == 3) {
						int i_93_ = i_15_;
						for (int i_94_ = -i_10_; i_94_ < 0; i_94_++) {
							int i_95_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_96_ = -i_9_; i_96_ < 0; i_96_++) {
								int i_97_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_95_]);
								int i_98_ = i_97_ + i_12_;
								int i_99_ = (i_97_ & 0xff00ff) + (i_12_ & 0xff00ff);
								int i_100_ = ((i_99_ & 0x1000100) + (i_98_ - i_99_ & 0x10000));
								i_100_ = i_98_ - i_100_ | i_100_ - (i_100_ >>> 8);
								int i_101_ = (i_100_ >>> 24) * (i_12_ >>> 24) >> 8;
								int i_102_ = 256 - i_101_;
								if (i_101_ != 255) {
									i_97_ = i_100_;
									i_100_ = is[i_24_];
									i_100_ = ((((i_97_ & 0xff00ff) * i_101_ + (i_100_ & 0xff00ff) * i_102_) & ~0xff00ff) + (((i_97_ & 0xff00) * i_101_ + (i_100_ & 0xff00) * i_102_) & 0xff0000)) >> 8;
								}
								is[i_24_++] = i_100_;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_93_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 2) {
						int i_103_ = i_12_ >>> 24;
						int i_104_ = 256 - i_103_;
						int i_105_ = (i_12_ & 0xff00ff) * i_104_ & ~0xff00ff;
						int i_106_ = (i_12_ & 0xff00) * i_104_ & 0xff0000;
						i_12_ = (i_105_ | i_106_) >>> 8;
						int i_107_ = i_15_;
						for (int i_108_ = -i_10_; i_108_ < 0; i_108_++) {
							int i_109_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_110_ = -i_9_; i_110_ < 0; i_110_++) {
								int i_111_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_109_]);
								int i_112_ = i_111_ >>> 24;
								int i_113_ = 256 - i_112_;
								i_105_ = (i_111_ & 0xff00ff) * i_103_ & ~0xff00ff;
								i_106_ = (i_111_ & 0xff00) * i_103_ & 0xff0000;
								i_111_ = ((i_105_ | i_106_) >>> 8) + i_12_;
								int i_114_ = is[i_24_];
								is[i_24_++] = ((((i_111_ & 0xff00ff) * i_112_ + (i_114_ & 0xff00ff) * i_113_) & ~0xff00ff) + (((i_111_ & 0xff00) * i_112_ + (i_114_ & 0xff00) * i_113_) & 0xff0000)) >> 8;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_107_;
							i_24_ += i_25_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_13_ == 2) {
					if (i_11_ == 1) {
						int i_115_ = i_15_;
						for (int i_116_ = -i_10_; i_116_ < 0; i_116_++) {
							int i_117_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_118_ = -i_9_; i_118_ < 0; i_118_++) {
								int i_119_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_117_]);
								if (i_119_ != 0) {
									int i_120_ = is[i_24_];
									int i_121_ = i_119_ + i_120_;
									int i_122_ = ((i_119_ & 0xff00ff) + (i_120_ & 0xff00ff));
									i_120_ = ((i_122_ & 0x1000100) + (i_121_ - i_122_ & 0x10000));
									is[i_24_++] = i_121_ - i_120_ | i_120_ - (i_120_ >>> 8);
								} else
									i_24_++;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_115_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 0) {
						int i_123_ = i_15_;
						int i_124_ = (i_12_ & 0xff0000) >> 16;
						int i_125_ = (i_12_ & 0xff00) >> 8;
						int i_126_ = i_12_ & 0xff;
						for (int i_127_ = -i_10_; i_127_ < 0; i_127_++) {
							int i_128_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_129_ = -i_9_; i_129_ < 0; i_129_++) {
								int i_130_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_128_]);
								if (i_130_ != 0) {
									int i_131_ = ((i_130_ & 0xff0000) * i_124_ & ~0xffffff);
									int i_132_ = ((i_130_ & 0xff00) * i_125_ & 0xff0000);
									int i_133_ = (i_130_ & 0xff) * i_126_ & 0xff00;
									i_130_ = (i_131_ | i_132_ | i_133_) >>> 8;
									int i_134_ = is[i_24_];
									int i_135_ = i_130_ + i_134_;
									int i_136_ = ((i_130_ & 0xff00ff) + (i_134_ & 0xff00ff));
									i_134_ = ((i_136_ & 0x1000100) + (i_135_ - i_136_ & 0x10000));
									is[i_24_++] = i_135_ - i_134_ | i_134_ - (i_134_ >>> 8);
								} else
									i_24_++;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_123_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 3) {
						int i_137_ = i_15_;
						for (int i_138_ = -i_10_; i_138_ < 0; i_138_++) {
							int i_139_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_140_ = -i_9_; i_140_ < 0; i_140_++) {
								int i_141_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_139_]);
								int i_142_ = i_141_ + i_12_;
								int i_143_ = (i_141_ & 0xff00ff) + (i_12_ & 0xff00ff);
								int i_144_ = ((i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000));
								i_141_ = i_142_ - i_144_ | i_144_ - (i_144_ >>> 8);
								i_144_ = is[i_24_];
								i_142_ = i_141_ + i_144_;
								i_143_ = (i_141_ & 0xff00ff) + (i_144_ & 0xff00ff);
								i_144_ = (i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000);
								is[i_24_++] = i_142_ - i_144_ | i_144_ - (i_144_ >>> 8);
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_137_;
							i_24_ += i_25_;
						}
					} else if (i_11_ == 2) {
						int i_145_ = i_12_ >>> 24;
						int i_146_ = 256 - i_145_;
						int i_147_ = (i_12_ & 0xff00ff) * i_146_ & ~0xff00ff;
						int i_148_ = (i_12_ & 0xff00) * i_146_ & 0xff0000;
						i_12_ = (i_147_ | i_148_) >>> 8;
						int i_149_ = i_15_;
						for (int i_150_ = -i_10_; i_150_ < 0; i_150_++) {
							int i_151_ = ((i_16_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_152_ = -i_9_; i_152_ < 0; i_152_++) {
								int i_153_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_15_ >> 16) + i_151_]);
								if (i_153_ != 0) {
									i_147_ = ((i_153_ & 0xff00ff) * i_145_ & ~0xff00ff);
									i_148_ = ((i_153_ & 0xff00) * i_145_ & 0xff0000);
									i_153_ = ((i_147_ | i_148_) >>> 8) + i_12_;
									int i_154_ = is[i_24_];
									int i_155_ = i_153_ + i_154_;
									int i_156_ = ((i_153_ & 0xff00ff) + (i_154_ & 0xff00ff));
									i_154_ = ((i_156_ & 0x1000100) + (i_155_ - i_156_ & 0x10000));
									is[i_24_++] = i_155_ - i_154_ | i_154_ - (i_154_ >>> 8);
								} else
									i_24_++;
								i_15_ += i_20_;
							}
							i_16_ += i_21_;
							i_15_ = i_149_;
							i_24_ += i_25_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class161_Sub3_Sub3(Class106_Sub2 class106_sub2, int[] is, int i, int i_157_) {
		super(class106_sub2, i, i_157_);
		((Class161_Sub3_Sub3) this).anIntArray11238 = is;
	}

	void method10050(boolean bool, boolean bool_158_, boolean bool_159_, int i, int i_160_, float f, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, boolean bool_167_) {
		if (i_161_ > 0 && i_162_ > 0 && (bool || bool_158_)) {
			int i_168_ = 0;
			int i_169_ = 0;
			int i_170_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
			int i_171_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
			int i_172_ = (i_170_ << 16) / i_161_;
			int i_173_ = (i_171_ << 16) / i_162_;
			if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
				int i_174_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_172_ - 1) / i_172_);
				i += i_174_;
				i_168_ += (i_174_ * i_172_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
				int i_175_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_173_ - 1) / i_173_);
				i_160_ += i_175_;
				i_169_ += (i_175_ * i_173_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10945 < i_170_)
				i_161_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_168_ + i_172_ - 1) / i_172_;
			if (((Class161_Sub3_Sub3) this).anInt10930 < i_171_)
				i_162_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_169_ + i_173_ - 1) / i_173_;
			int i_176_ = i + i_160_ * ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_177_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113) - i_161_);
			if (i_160_ + i_162_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_162_ -= (i_160_ + i_162_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_160_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_178_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_160_);
				i_162_ -= i_178_;
				i_176_ += i_178_ * ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
				i_169_ += i_173_ * i_178_;
			}
			if (i + i_161_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_179_ = (i + i_161_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_161_ -= i_179_;
				i_177_ += i_179_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_180_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_161_ -= i_180_;
				i_176_ += i_180_;
				i_168_ += i_172_ * i_180_;
				i_177_ += i_180_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_165_ == 0) {
				if (i_163_ == 1) {
					int i_181_ = i_168_;
					for (int i_182_ = -i_162_; i_182_ < 0; i_182_++) {
						int i_183_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_184_ = -i_161_; i_184_ < 0; i_184_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool)
									is[i_176_] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_183_]);
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_181_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 0) {
					int i_185_ = (i_164_ & 0xff0000) >> 16;
					int i_186_ = (i_164_ & 0xff00) >> 8;
					int i_187_ = i_164_ & 0xff;
					int i_188_ = i_168_;
					for (int i_189_ = -i_162_; i_189_ < 0; i_189_++) {
						int i_190_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_191_ = -i_161_; i_191_ < 0; i_191_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_192_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_190_]);
									int i_193_ = ((i_192_ & 0xff0000) * i_185_ & ~0xffffff);
									int i_194_ = ((i_192_ & 0xff00) * i_186_ & 0xff0000);
									int i_195_ = (i_192_ & 0xff) * i_187_ & 0xff00;
									is[i_176_] = (i_193_ | i_194_ | i_195_) >>> 8;
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_188_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 3) {
					int i_196_ = i_168_;
					for (int i_197_ = -i_162_; i_197_ < 0; i_197_++) {
						int i_198_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_199_ = -i_161_; i_199_ < 0; i_199_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_200_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_198_]);
									int i_201_ = i_200_ + i_164_;
									int i_202_ = ((i_200_ & 0xff00ff) + (i_164_ & 0xff00ff));
									int i_203_ = ((i_202_ & 0x1000100) + (i_201_ - i_202_ & 0x10000));
									is[i_176_] = i_201_ - i_203_ | i_203_ - (i_203_ >>> 8);
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_196_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 2) {
					int i_204_ = i_164_ >>> 24;
					int i_205_ = 256 - i_204_;
					int i_206_ = (i_164_ & 0xff00ff) * i_205_ & ~0xff00ff;
					int i_207_ = (i_164_ & 0xff00) * i_205_ & 0xff0000;
					i_164_ = (i_206_ | i_207_) >>> 8;
					int i_208_ = i_168_;
					for (int i_209_ = -i_162_; i_209_ < 0; i_209_++) {
						int i_210_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_211_ = -i_161_; i_211_ < 0; i_211_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_212_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_210_]);
									i_206_ = ((i_212_ & 0xff00ff) * i_204_ & ~0xff00ff);
									i_207_ = ((i_212_ & 0xff00) * i_204_ & 0xff0000);
									is[i_176_] = ((i_206_ | i_207_) >>> 8) + i_164_;
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_208_;
						i_176_ += i_177_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_165_ == 1) {
				if (i_163_ == 1) {
					int i_213_ = i_168_;
					for (int i_214_ = -i_162_; i_214_ < 0; i_214_++) {
						int i_215_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_216_ = -i_161_; i_216_ < 0; i_216_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_217_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_215_]);
									int i_218_ = i_217_ >>> 24;
									int i_219_ = 256 - i_218_;
									int i_220_ = is[i_176_];
									is[i_176_] = (((((i_217_ & 0xff00ff) * i_218_ + (i_220_ & 0xff00ff) * i_219_) & ~0xff00ff) >> 8) + (((((i_217_ & ~0xff00ff) >>> 8) * i_218_) + (((i_220_ & ~0xff00ff) >>> 8) * i_219_)) & ~0xff00ff));
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_213_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 0) {
					int i_221_ = i_168_;
					if ((i_164_ & 0xffffff) == 16777215) {
						for (int i_222_ = -i_162_; i_222_ < 0; i_222_++) {
							int i_223_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_224_ = -i_161_; i_224_ < 0; i_224_++) {
								if (!bool_158_ || f < fs[i_176_]) {
									if (bool) {
										int i_225_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_223_]);
										int i_226_ = ((i_225_ >>> 24) * (i_164_ >>> 24) >> 8);
										int i_227_ = 256 - i_226_;
										int i_228_ = is[i_176_];
										is[i_176_] = ((((i_225_ & 0xff00ff) * i_226_ + ((i_228_ & 0xff00ff) * i_227_)) & ~0xff00ff) + (((i_225_ & 0xff00) * i_226_ + ((i_228_ & 0xff00) * i_227_)) & 0xff0000)) >> 8;
									}
									if (bool_158_ && bool_167_)
										fs[i_176_] = f;
								}
								i_168_ += i_172_;
								i_176_++;
							}
							i_169_ += i_173_;
							i_168_ = i_221_;
							i_176_ += i_177_;
						}
					} else {
						int i_229_ = (i_164_ & 0xff0000) >> 16;
						int i_230_ = (i_164_ & 0xff00) >> 8;
						int i_231_ = i_164_ & 0xff;
						for (int i_232_ = -i_162_; i_232_ < 0; i_232_++) {
							int i_233_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_234_ = -i_161_; i_234_ < 0; i_234_++) {
								if (!bool_158_ || f < fs[i_176_]) {
									int i_235_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_233_]);
									int i_236_ = ((i_235_ >>> 24) * (i_164_ >>> 24) >> 8);
									int i_237_ = 256 - i_236_;
									if (i_236_ != 255) {
										if (bool) {
											int i_238_ = ((i_235_ & 0xff0000) * i_229_ & ~0xffffff);
											int i_239_ = ((i_235_ & 0xff00) * i_230_ & 0xff0000);
											int i_240_ = ((i_235_ & 0xff) * i_231_ & 0xff00);
											i_235_ = (i_238_ | i_239_ | i_240_) >>> 8;
											int i_241_ = is[i_176_];
											is[i_176_] = (((((i_235_ & 0xff00ff) * i_236_) + ((i_241_ & 0xff00ff) * i_237_)) & ~0xff00ff) + ((((i_235_ & 0xff00) * i_236_) + ((i_241_ & 0xff00) * i_237_)) & 0xff0000)) >> 8;
											if (bool_159_) {
												int i_242_ = (i_241_ >>> 24) + i_236_;
												if (i_242_ > 255)
													i_242_ = 255;
												is[i_176_] |= i_242_ << 24;
											}
										}
										if (bool_158_ && bool_167_)
											fs[i_176_] = f;
									} else {
										if (bool) {
											int i_243_ = ((i_235_ & 0xff0000) * i_229_ & ~0xffffff);
											int i_244_ = ((i_235_ & 0xff00) * i_230_ & 0xff0000);
											int i_245_ = ((i_235_ & 0xff) * i_231_ & 0xff00);
											is[i_176_] = (i_243_ | i_244_ | i_245_) >>> 8;
										}
										if (bool_158_ && bool_167_)
											fs[i_176_] = f;
									}
								}
								i_168_ += i_172_;
								i_176_++;
							}
							i_169_ += i_173_;
							i_168_ = i_221_;
							i_176_ += i_177_;
						}
					}
				} else if (i_163_ == 3) {
					int i_246_ = i_168_;
					for (int i_247_ = -i_162_; i_247_ < 0; i_247_++) {
						int i_248_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_249_ = -i_161_; i_249_ < 0; i_249_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_250_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_248_]);
									int i_251_ = i_250_ + i_164_;
									int i_252_ = ((i_250_ & 0xff00ff) + (i_164_ & 0xff00ff));
									int i_253_ = ((i_252_ & 0x1000100) + (i_251_ - i_252_ & 0x10000));
									i_253_ = i_251_ - i_253_ | i_253_ - (i_253_ >>> 8);
									int i_254_ = ((i_253_ >>> 24) * (i_164_ >>> 24) >> 8);
									int i_255_ = 256 - i_254_;
									if (i_254_ != 255) {
										i_250_ = i_253_;
										i_253_ = is[i_176_];
										i_253_ = ((((i_250_ & 0xff00ff) * i_254_ + ((i_253_ & 0xff00ff) * i_255_)) & ~0xff00ff) + (((i_250_ & 0xff00) * i_254_ + ((i_253_ & 0xff00) * i_255_)) & 0xff0000)) >> 8;
									}
									is[i_176_] = i_253_;
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_246_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 2) {
					int i_256_ = i_164_ >>> 24;
					int i_257_ = 256 - i_256_;
					int i_258_ = (i_164_ & 0xff00ff) * i_257_ & ~0xff00ff;
					int i_259_ = (i_164_ & 0xff00) * i_257_ & 0xff0000;
					i_164_ = (i_258_ | i_259_) >>> 8;
					int i_260_ = i_168_;
					for (int i_261_ = -i_162_; i_261_ < 0; i_261_++) {
						int i_262_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_263_ = -i_161_; i_263_ < 0; i_263_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_264_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_262_]);
									int i_265_ = i_264_ >>> 24;
									int i_266_ = 256 - i_265_;
									i_258_ = ((i_264_ & 0xff00ff) * i_256_ & ~0xff00ff);
									i_259_ = ((i_264_ & 0xff00) * i_256_ & 0xff0000);
									i_264_ = ((i_258_ | i_259_) >>> 8) + i_164_;
									int i_267_ = is[i_176_];
									is[i_176_] = ((((i_264_ & 0xff00ff) * i_265_ + (i_267_ & 0xff00ff) * i_266_) & ~0xff00ff) + (((i_264_ & 0xff00) * i_265_ + (i_267_ & 0xff00) * i_266_) & 0xff0000)) >> 8;
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_260_;
						i_176_ += i_177_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_165_ == 2) {
				if (i_163_ == 1) {
					int i_268_ = i_168_;
					for (int i_269_ = -i_162_; i_269_ < 0; i_269_++) {
						int i_270_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_271_ = -i_161_; i_271_ < 0; i_271_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								int i_272_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_270_]);
								if (i_272_ != 0) {
									if (bool) {
										int i_273_ = is[i_176_];
										int i_274_ = i_272_ + i_273_;
										int i_275_ = ((i_272_ & 0xff00ff) + (i_273_ & 0xff00ff));
										i_273_ = ((i_275_ & 0x1000100) + (i_274_ - i_275_ & 0x10000));
										is[i_176_] = (i_274_ - i_273_ | i_273_ - (i_273_ >>> 8));
									}
									if (bool_158_ && bool_167_)
										fs[i_176_] = f;
								}
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_268_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 0) {
					int i_276_ = i_168_;
					int i_277_ = (i_164_ & 0xff0000) >> 16;
					int i_278_ = (i_164_ & 0xff00) >> 8;
					int i_279_ = i_164_ & 0xff;
					for (int i_280_ = -i_162_; i_280_ < 0; i_280_++) {
						int i_281_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_282_ = -i_161_; i_282_ < 0; i_282_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								int i_283_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_281_]);
								if (i_283_ != 0) {
									if (bool) {
										int i_284_ = ((i_283_ & 0xff0000) * i_277_ & ~0xffffff);
										int i_285_ = ((i_283_ & 0xff00) * i_278_ & 0xff0000);
										int i_286_ = ((i_283_ & 0xff) * i_279_ & 0xff00);
										i_283_ = (i_284_ | i_285_ | i_286_) >>> 8;
										int i_287_ = is[i_176_];
										int i_288_ = i_283_ + i_287_;
										int i_289_ = ((i_283_ & 0xff00ff) + (i_287_ & 0xff00ff));
										i_287_ = ((i_289_ & 0x1000100) + (i_288_ - i_289_ & 0x10000));
										is[i_176_] = (i_288_ - i_287_ | i_287_ - (i_287_ >>> 8));
									}
									if (bool_158_ && bool_167_)
										fs[i_176_] = f;
								}
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_276_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 3) {
					int i_290_ = i_168_;
					for (int i_291_ = -i_162_; i_291_ < 0; i_291_++) {
						int i_292_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_293_ = -i_161_; i_293_ < 0; i_293_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								if (bool) {
									int i_294_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_292_]);
									int i_295_ = i_294_ + i_164_;
									int i_296_ = ((i_294_ & 0xff00ff) + (i_164_ & 0xff00ff));
									int i_297_ = ((i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000));
									i_294_ = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
									i_297_ = is[i_176_];
									i_295_ = i_294_ + i_297_;
									i_296_ = (i_294_ & 0xff00ff) + (i_297_ & 0xff00ff);
									i_297_ = ((i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000));
									is[i_176_] = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
								}
								if (bool_158_ && bool_167_)
									fs[i_176_] = f;
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_290_;
						i_176_ += i_177_;
					}
				} else if (i_163_ == 2) {
					int i_298_ = i_164_ >>> 24;
					int i_299_ = 256 - i_298_;
					int i_300_ = (i_164_ & 0xff00ff) * i_299_ & ~0xff00ff;
					int i_301_ = (i_164_ & 0xff00) * i_299_ & 0xff0000;
					i_164_ = (i_300_ | i_301_) >>> 8;
					int i_302_ = i_168_;
					for (int i_303_ = -i_162_; i_303_ < 0; i_303_++) {
						int i_304_ = ((i_169_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_305_ = -i_161_; i_305_ < 0; i_305_++) {
							if (!bool_158_ || f < fs[i_176_]) {
								int i_306_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_168_ >> 16) + i_304_]);
								if (i_306_ != 0) {
									if (bool) {
										i_300_ = ((i_306_ & 0xff00ff) * i_298_ & ~0xff00ff);
										i_301_ = ((i_306_ & 0xff00) * i_298_ & 0xff0000);
										i_306_ = (((i_300_ | i_301_) >>> 8) + i_164_);
										int i_307_ = is[i_176_];
										int i_308_ = i_306_ + i_307_;
										int i_309_ = ((i_306_ & 0xff00ff) + (i_307_ & 0xff00ff));
										i_307_ = ((i_309_ & 0x1000100) + (i_308_ - i_309_ & 0x10000));
										is[i_176_] = (i_308_ - i_307_ | i_307_ - (i_307_ >>> 8));
									}
									if (bool_158_ && bool_167_)
										fs[i_176_] = f;
								}
							}
							i_168_ += i_172_;
							i_176_++;
						}
						i_169_ += i_173_;
						i_168_ = i_302_;
						i_176_ += i_177_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10191(int i, int i_310_, int i_311_, int i_312_, int[] is, int i_313_, int i_314_) {
		i_314_ -= i_311_;
		for (int i_315_ = 0; i_315_ < i_312_; i_315_++) {
			int i_316_ = (i_310_ + i_315_) * i_311_ + i;
			for (int i_317_ = 0; i_317_ < i_311_; i_317_++)
				is[i_313_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_316_ + i_317_]);
			i_313_ += i_314_;
		}
	}

	void method10053(int[] is, int[] is_318_, int i, int i_319_) {
		int[] is_320_ = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_320_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_321_ = anInt10940;
					while (i_321_ < 0) {
						int i_322_ = i_321_ + i_319_;
						if (i_322_ >= 0) {
							if (i_322_ >= is.length)
								break;
							int i_323_ = anInt10944;
							int i_324_ = anInt10951;
							int i_325_ = anInt10952;
							int i_326_ = anInt10958;
							if (i_324_ >= 0 && i_325_ >= 0 && (i_324_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_325_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
								int i_327_ = is[i_322_] - i;
								int i_328_ = -is_318_[i_322_];
								int i_329_ = i_327_ - (i_323_ - anInt10944);
								if (i_329_ > 0) {
									i_323_ += i_329_;
									i_326_ += i_329_;
									i_324_ += anInt10956 * i_329_;
									i_325_ += anInt10946 * i_329_;
								} else
									i_328_ -= i_329_;
								if (i_326_ < i_328_)
									i_326_ = i_328_;
								for (/**/; i_326_ < 0; i_326_++) {
									int i_330_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_325_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_324_ >> 12))]);
									int i_331_ = i_330_ >>> 24;
									int i_332_ = 256 - i_331_;
									int i_333_ = is_320_[i_323_];
									is_320_[i_323_++] = ((((i_330_ & 0xff00ff) * i_331_ + (i_333_ & 0xff00ff) * i_332_) & ~0xff00ff) + (((i_330_ & 0xff00) * i_331_ + (i_333_ & 0xff00) * i_332_) & 0xff0000)) >> 8;
								}
							}
						}
						i_321_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_334_ = anInt10940;
					while (i_334_ < 0) {
						int i_335_ = i_334_ + i_319_;
						if (i_335_ >= 0) {
							if (i_335_ >= is.length)
								break;
							int i_336_ = anInt10944;
							int i_337_ = anInt10951;
							int i_338_ = anInt10952 + anInt10954;
							int i_339_ = anInt10958;
							if (i_337_ >= 0 && (i_337_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
								int i_340_;
								if ((i_340_ = i_338_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
									i_340_ = (anInt10946 - i_340_) / anInt10946;
									i_339_ += i_340_;
									i_338_ += anInt10946 * i_340_;
									i_336_ += i_340_;
								}
								if ((i_340_ = (i_338_ - anInt10946) / anInt10946) > i_339_)
									i_339_ = i_340_;
								int i_341_ = is[i_335_] - i;
								int i_342_ = -is_318_[i_335_];
								int i_343_ = i_341_ - (i_336_ - anInt10944);
								if (i_343_ > 0) {
									i_336_ += i_343_;
									i_339_ += i_343_;
									i_337_ += anInt10956 * i_343_;
									i_338_ += anInt10946 * i_343_;
								} else
									i_342_ -= i_343_;
								if (i_339_ < i_342_)
									i_339_ = i_342_;
								for (/**/; i_339_ < 0; i_339_++) {
									int i_344_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_338_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_337_ >> 12))]);
									int i_345_ = i_344_ >>> 24;
									int i_346_ = 256 - i_345_;
									int i_347_ = is_320_[i_336_];
									is_320_[i_336_++] = ((((i_344_ & 0xff00ff) * i_345_ + (i_347_ & 0xff00ff) * i_346_) & ~0xff00ff) + (((i_344_ & 0xff00) * i_345_ + (i_347_ & 0xff00) * i_346_) & 0xff0000)) >> 8;
									i_338_ += anInt10946;
								}
							}
						}
						i_334_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_348_ = anInt10940;
					while (i_348_ < 0) {
						int i_349_ = i_348_ + i_319_;
						if (i_349_ >= 0) {
							if (i_349_ >= is.length)
								break;
							int i_350_ = anInt10944;
							int i_351_ = anInt10951;
							int i_352_ = anInt10952 + anInt10954;
							int i_353_ = anInt10958;
							if (i_351_ >= 0 && (i_351_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
								if (i_352_ < 0) {
									int i_354_ = ((anInt10946 - 1 - i_352_) / anInt10946);
									i_353_ += i_354_;
									i_352_ += anInt10946 * i_354_;
									i_350_ += i_354_;
								}
								int i_355_;
								if ((i_355_ = (1 + i_352_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_353_)
									i_353_ = i_355_;
								int i_356_ = is[i_349_] - i;
								int i_357_ = -is_318_[i_349_];
								int i_358_ = i_356_ - (i_350_ - anInt10944);
								if (i_358_ > 0) {
									i_350_ += i_358_;
									i_353_ += i_358_;
									i_351_ += anInt10956 * i_358_;
									i_352_ += anInt10946 * i_358_;
								} else
									i_357_ -= i_358_;
								if (i_353_ < i_357_)
									i_353_ = i_357_;
								for (/**/; i_353_ < 0; i_353_++) {
									int i_359_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_352_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_351_ >> 12))]);
									int i_360_ = i_359_ >>> 24;
									int i_361_ = 256 - i_360_;
									int i_362_ = is_320_[i_350_];
									is_320_[i_350_++] = ((((i_359_ & 0xff00ff) * i_360_ + (i_362_ & 0xff00ff) * i_361_) & ~0xff00ff) + (((i_359_ & 0xff00) * i_360_ + (i_362_ & 0xff00) * i_361_) & 0xff0000)) >> 8;
									i_352_ += anInt10946;
								}
							}
						}
						i_348_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_363_ = anInt10940;
					while (i_363_ < 0) {
						int i_364_ = i_363_ + i_319_;
						if (i_364_ >= 0) {
							if (i_364_ >= is.length)
								break;
							int i_365_ = anInt10944;
							int i_366_ = anInt10951 + anInt10953;
							int i_367_ = anInt10952;
							int i_368_ = anInt10958;
							if (i_367_ >= 0 && (i_367_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
								int i_369_;
								if ((i_369_ = i_366_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
									i_369_ = (anInt10956 - i_369_) / anInt10956;
									i_368_ += i_369_;
									i_366_ += anInt10956 * i_369_;
									i_365_ += i_369_;
								}
								if ((i_369_ = (i_366_ - anInt10956) / anInt10956) > i_368_)
									i_368_ = i_369_;
								int i_370_ = is[i_364_] - i;
								int i_371_ = -is_318_[i_364_];
								int i_372_ = i_370_ - (i_365_ - anInt10944);
								if (i_372_ > 0) {
									i_365_ += i_372_;
									i_368_ += i_372_;
									i_366_ += anInt10956 * i_372_;
									i_367_ += anInt10946 * i_372_;
								} else
									i_371_ -= i_372_;
								if (i_368_ < i_371_)
									i_368_ = i_371_;
								for (/**/; i_368_ < 0; i_368_++) {
									int i_373_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_367_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_366_ >> 12))]);
									int i_374_ = i_373_ >>> 24;
									int i_375_ = 256 - i_374_;
									int i_376_ = is_320_[i_365_];
									is_320_[i_365_++] = ((((i_373_ & 0xff00ff) * i_374_ + (i_376_ & 0xff00ff) * i_375_) & ~0xff00ff) + (((i_373_ & 0xff00) * i_374_ + (i_376_ & 0xff00) * i_375_) & 0xff0000)) >> 8;
									i_366_ += anInt10956;
								}
							}
						}
						i_363_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_377_ = anInt10940;
					while (i_377_ < 0) {
						int i_378_ = i_377_ + i_319_;
						if (i_378_ >= 0) {
							if (i_378_ >= is.length)
								break;
							int i_379_ = anInt10944;
							int i_380_ = anInt10951 + anInt10953;
							int i_381_ = anInt10952 + anInt10954;
							int i_382_ = anInt10958;
							int i_383_;
							if ((i_383_ = (i_380_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_383_ = (anInt10956 - i_383_) / anInt10956;
								i_382_ += i_383_;
								i_380_ += anInt10956 * i_383_;
								i_381_ += anInt10946 * i_383_;
								i_379_ += i_383_;
							}
							if ((i_383_ = (i_380_ - anInt10956) / anInt10956) > i_382_)
								i_382_ = i_383_;
							if ((i_383_ = (i_381_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_383_ = (anInt10946 - i_383_) / anInt10946;
								i_382_ += i_383_;
								i_380_ += anInt10956 * i_383_;
								i_381_ += anInt10946 * i_383_;
								i_379_ += i_383_;
							}
							if ((i_383_ = (i_381_ - anInt10946) / anInt10946) > i_382_)
								i_382_ = i_383_;
							int i_384_ = is[i_378_] - i;
							int i_385_ = -is_318_[i_378_];
							int i_386_ = i_384_ - (i_379_ - anInt10944);
							if (i_386_ > 0) {
								i_379_ += i_386_;
								i_382_ += i_386_;
								i_380_ += anInt10956 * i_386_;
								i_381_ += anInt10946 * i_386_;
							} else
								i_385_ -= i_386_;
							if (i_382_ < i_385_)
								i_382_ = i_385_;
							for (/**/; i_382_ < 0; i_382_++) {
								int i_387_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_381_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_380_ >> 12))]);
								int i_388_ = i_387_ >>> 24;
								int i_389_ = 256 - i_388_;
								int i_390_ = is_320_[i_379_];
								is_320_[i_379_++] = ((((i_387_ & 0xff00ff) * i_388_ + (i_390_ & 0xff00ff) * i_389_) & ~0xff00ff) + (((i_387_ & 0xff00) * i_388_ + (i_390_ & 0xff00) * i_389_) & 0xff0000)) >> 8;
								i_380_ += anInt10956;
								i_381_ += anInt10946;
							}
						}
						i_377_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_391_ = anInt10940;
					while (i_391_ < 0) {
						int i_392_ = i_391_ + i_319_;
						if (i_392_ >= 0) {
							if (i_392_ >= is.length)
								break;
							int i_393_ = anInt10944;
							int i_394_ = anInt10951 + anInt10953;
							int i_395_ = anInt10952 + anInt10954;
							int i_396_ = anInt10958;
							int i_397_;
							if ((i_397_ = (i_394_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_397_ = (anInt10956 - i_397_) / anInt10956;
								i_396_ += i_397_;
								i_394_ += anInt10956 * i_397_;
								i_395_ += anInt10946 * i_397_;
								i_393_ += i_397_;
							}
							if ((i_397_ = (i_394_ - anInt10956) / anInt10956) > i_396_)
								i_396_ = i_397_;
							if (i_395_ < 0) {
								i_397_ = (anInt10946 - 1 - i_395_) / anInt10946;
								i_396_ += i_397_;
								i_394_ += anInt10956 * i_397_;
								i_395_ += anInt10946 * i_397_;
								i_393_ += i_397_;
							}
							if ((i_397_ = (1 + i_395_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_396_)
								i_396_ = i_397_;
							int i_398_ = is[i_392_] - i;
							int i_399_ = -is_318_[i_392_];
							int i_400_ = i_398_ - (i_393_ - anInt10944);
							if (i_400_ > 0) {
								i_393_ += i_400_;
								i_396_ += i_400_;
								i_394_ += anInt10956 * i_400_;
								i_395_ += anInt10946 * i_400_;
							} else
								i_399_ -= i_400_;
							if (i_396_ < i_399_)
								i_396_ = i_399_;
							for (/**/; i_396_ < 0; i_396_++) {
								int i_401_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_395_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_394_ >> 12))]);
								int i_402_ = i_401_ >>> 24;
								int i_403_ = 256 - i_402_;
								int i_404_ = is_320_[i_393_];
								is_320_[i_393_++] = ((((i_401_ & 0xff00ff) * i_402_ + (i_404_ & 0xff00ff) * i_403_) & ~0xff00ff) + (((i_401_ & 0xff00) * i_402_ + (i_404_ & 0xff00) * i_403_) & 0xff0000)) >> 8;
								i_394_ += anInt10956;
								i_395_ += anInt10946;
							}
						}
						i_391_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_405_ = anInt10940;
				while (i_405_ < 0) {
					int i_406_ = i_405_ + i_319_;
					if (i_406_ >= 0) {
						if (i_406_ >= is.length)
							break;
						int i_407_ = anInt10944;
						int i_408_ = anInt10951 + anInt10953;
						int i_409_ = anInt10952;
						int i_410_ = anInt10958;
						if (i_409_ >= 0 && i_409_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
							if (i_408_ < 0) {
								int i_411_ = (anInt10956 - 1 - i_408_) / anInt10956;
								i_410_ += i_411_;
								i_408_ += anInt10956 * i_411_;
								i_407_ += i_411_;
							}
							int i_412_;
							if ((i_412_ = (1 + i_408_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_410_)
								i_410_ = i_412_;
							int i_413_ = is[i_406_] - i;
							int i_414_ = -is_318_[i_406_];
							int i_415_ = i_413_ - (i_407_ - anInt10944);
							if (i_415_ > 0) {
								i_407_ += i_415_;
								i_410_ += i_415_;
								i_408_ += anInt10956 * i_415_;
								i_409_ += anInt10946 * i_415_;
							} else
								i_414_ -= i_415_;
							if (i_410_ < i_414_)
								i_410_ = i_414_;
							for (/**/; i_410_ < 0; i_410_++) {
								int i_416_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_409_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_408_ >> 12))]);
								int i_417_ = i_416_ >>> 24;
								int i_418_ = 256 - i_417_;
								int i_419_ = is_320_[i_407_];
								is_320_[i_407_++] = ((((i_416_ & 0xff00ff) * i_417_ + (i_419_ & 0xff00ff) * i_418_) & ~0xff00ff) + (((i_416_ & 0xff00) * i_417_ + (i_419_ & 0xff00) * i_418_) & 0xff0000)) >> 8;
								i_408_ += anInt10956;
							}
						}
					}
					i_405_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_420_ = anInt10940;
				while (i_420_ < 0) {
					int i_421_ = i_420_ + i_319_;
					if (i_421_ >= 0) {
						if (i_421_ >= is.length)
							break;
						int i_422_ = anInt10944;
						int i_423_ = anInt10951 + anInt10953;
						int i_424_ = anInt10952 + anInt10954;
						int i_425_ = anInt10958;
						if (i_423_ < 0) {
							int i_426_ = (anInt10956 - 1 - i_423_) / anInt10956;
							i_425_ += i_426_;
							i_423_ += anInt10956 * i_426_;
							i_424_ += anInt10946 * i_426_;
							i_422_ += i_426_;
						}
						int i_427_;
						if ((i_427_ = (1 + i_423_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_425_)
							i_425_ = i_427_;
						if ((i_427_ = i_424_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
							i_427_ = (anInt10946 - i_427_) / anInt10946;
							i_425_ += i_427_;
							i_423_ += anInt10956 * i_427_;
							i_424_ += anInt10946 * i_427_;
							i_422_ += i_427_;
						}
						if ((i_427_ = (i_424_ - anInt10946) / anInt10946) > i_425_)
							i_425_ = i_427_;
						int i_428_ = is[i_421_] - i;
						int i_429_ = -is_318_[i_421_];
						int i_430_ = i_428_ - (i_422_ - anInt10944);
						if (i_430_ > 0) {
							i_422_ += i_430_;
							i_425_ += i_430_;
							i_423_ += anInt10956 * i_430_;
							i_424_ += anInt10946 * i_430_;
						} else
							i_429_ -= i_430_;
						if (i_425_ < i_429_)
							i_425_ = i_429_;
						for (/**/; i_425_ < 0; i_425_++) {
							int i_431_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_424_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_423_ >> 12))]);
							int i_432_ = i_431_ >>> 24;
							int i_433_ = 256 - i_432_;
							int i_434_ = is_320_[i_422_];
							is_320_[i_422_++] = ((((i_431_ & 0xff00ff) * i_432_ + (i_434_ & 0xff00ff) * i_433_) & ~0xff00ff) + (((i_431_ & 0xff00) * i_432_ + (i_434_ & 0xff00) * i_433_) & 0xff0000)) >> 8;
							i_423_ += anInt10956;
							i_424_ += anInt10946;
						}
					}
					i_420_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				int i_435_ = anInt10940;
				while (i_435_ < 0) {
					int i_436_ = i_435_ + i_319_;
					if (i_436_ >= 0) {
						if (i_436_ >= is.length)
							break;
						int i_437_ = anInt10944;
						int i_438_ = anInt10951 + anInt10953;
						int i_439_ = anInt10952 + anInt10954;
						int i_440_ = anInt10958;
						if (i_438_ < 0) {
							int i_441_ = (anInt10956 - 1 - i_438_) / anInt10956;
							i_440_ += i_441_;
							i_438_ += anInt10956 * i_441_;
							i_439_ += anInt10946 * i_441_;
							i_437_ += i_441_;
						}
						int i_442_;
						if ((i_442_ = (1 + i_438_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_440_)
							i_440_ = i_442_;
						if (i_439_ < 0) {
							i_442_ = (anInt10946 - 1 - i_439_) / anInt10946;
							i_440_ += i_442_;
							i_438_ += anInt10956 * i_442_;
							i_439_ += anInt10946 * i_442_;
							i_437_ += i_442_;
						}
						if ((i_442_ = (1 + i_439_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_440_)
							i_440_ = i_442_;
						int i_443_ = is[i_436_] - i;
						int i_444_ = -is_318_[i_436_];
						int i_445_ = i_443_ - (i_437_ - anInt10944);
						if (i_445_ > 0) {
							i_437_ += i_445_;
							i_440_ += i_445_;
							i_438_ += anInt10956 * i_445_;
							i_439_ += anInt10946 * i_445_;
						} else
							i_444_ -= i_445_;
						if (i_440_ < i_444_)
							i_440_ = i_444_;
						for (/**/; i_440_ < 0; i_440_++) {
							int i_446_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_439_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_438_ >> 12))]);
							int i_447_ = i_446_ >>> 24;
							int i_448_ = 256 - i_447_;
							int i_449_ = is_320_[i_437_];
							is_320_[i_437_++] = ((((i_446_ & 0xff00ff) * i_447_ + (i_449_ & 0xff00ff) * i_448_) & ~0xff00ff) + (((i_446_ & 0xff00) * i_447_ + (i_449_ & 0xff00) * i_448_) & 0xff0000)) >> 8;
							i_438_ += anInt10956;
							i_439_ += anInt10946;
						}
					}
					i_435_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10057(int i, int i_450_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_451_ = anInt10940;
					while (i_451_ < 0) {
						int i_452_ = anInt10944;
						int i_453_ = anInt10951;
						int i_454_ = anInt10952;
						int i_455_ = anInt10958;
						if (i_453_ >= 0 && i_454_ >= 0 && i_453_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) < 0 && i_454_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
							for (/**/; i_455_ < 0; i_455_++)
								method10192(((i_454_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_453_ >> 12), i_452_++, is, i, i_450_);
						}
						i_451_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_456_ = anInt10940;
					while (i_456_ < 0) {
						int i_457_ = anInt10944;
						int i_458_ = anInt10951;
						int i_459_ = anInt10952 + anInt10954;
						int i_460_ = anInt10958;
						if (i_458_ >= 0 && i_458_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) < 0) {
							int i_461_;
							if ((i_461_ = (i_459_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_461_ = (anInt10946 - i_461_) / anInt10946;
								i_460_ += i_461_;
								i_459_ += anInt10946 * i_461_;
								i_457_ += i_461_;
							}
							if ((i_461_ = (i_459_ - anInt10946) / anInt10946) > i_460_)
								i_460_ = i_461_;
							for (/**/; i_460_ < 0; i_460_++) {
								method10192(((i_459_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_458_ >> 12), i_457_++, is, i, i_450_);
								i_459_ += anInt10946;
							}
						}
						i_456_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_462_ = anInt10940;
					while (i_462_ < 0) {
						int i_463_ = anInt10944;
						int i_464_ = anInt10951;
						int i_465_ = anInt10952 + anInt10954;
						int i_466_ = anInt10958;
						if (i_464_ >= 0 && i_464_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) < 0) {
							if (i_465_ < 0) {
								int i_467_ = (anInt10946 - 1 - i_465_) / anInt10946;
								i_466_ += i_467_;
								i_465_ += anInt10946 * i_467_;
								i_463_ += i_467_;
							}
							int i_468_;
							if ((i_468_ = (1 + i_465_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_466_)
								i_466_ = i_468_;
							for (/**/; i_466_ < 0; i_466_++) {
								method10192(((i_465_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_464_ >> 12), i_463_++, is, i, i_450_);
								i_465_ += anInt10946;
							}
						}
						i_462_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_469_ = anInt10940;
					while (i_469_ < 0) {
						int i_470_ = anInt10944;
						int i_471_ = anInt10951 + anInt10953;
						int i_472_ = anInt10952;
						int i_473_ = anInt10958;
						if (i_472_ >= 0 && i_472_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
							int i_474_;
							if ((i_474_ = (i_471_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_474_ = (anInt10956 - i_474_) / anInt10956;
								i_473_ += i_474_;
								i_471_ += anInt10956 * i_474_;
								i_470_ += i_474_;
							}
							if ((i_474_ = (i_471_ - anInt10956) / anInt10956) > i_473_)
								i_473_ = i_474_;
							for (/**/; i_473_ < 0; i_473_++) {
								method10192(((i_472_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_471_ >> 12), i_470_++, is, i, i_450_);
								i_471_ += anInt10956;
							}
						}
						i_469_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_475_ = anInt10940;
					while (i_475_ < 0) {
						int i_476_ = anInt10944;
						int i_477_ = anInt10951 + anInt10953;
						int i_478_ = anInt10952 + anInt10954;
						int i_479_ = anInt10958;
						int i_480_;
						if ((i_480_ = i_477_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) >= 0) {
							i_480_ = (anInt10956 - i_480_) / anInt10956;
							i_479_ += i_480_;
							i_477_ += anInt10956 * i_480_;
							i_478_ += anInt10946 * i_480_;
							i_476_ += i_480_;
						}
						if ((i_480_ = (i_477_ - anInt10956) / anInt10956) > i_479_)
							i_479_ = i_480_;
						if ((i_480_ = i_478_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
							i_480_ = (anInt10946 - i_480_) / anInt10946;
							i_479_ += i_480_;
							i_477_ += anInt10956 * i_480_;
							i_478_ += anInt10946 * i_480_;
							i_476_ += i_480_;
						}
						if ((i_480_ = (i_478_ - anInt10946) / anInt10946) > i_479_)
							i_479_ = i_480_;
						for (/**/; i_479_ < 0; i_479_++) {
							method10192(((i_478_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_477_ >> 12)), i_476_++, is, i, i_450_);
							i_477_ += anInt10956;
							i_478_ += anInt10946;
						}
						i_475_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_481_ = anInt10940;
					while (i_481_ < 0) {
						int i_482_ = anInt10944;
						int i_483_ = anInt10951 + anInt10953;
						int i_484_ = anInt10952 + anInt10954;
						int i_485_ = anInt10958;
						int i_486_;
						if ((i_486_ = i_483_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) >= 0) {
							i_486_ = (anInt10956 - i_486_) / anInt10956;
							i_485_ += i_486_;
							i_483_ += anInt10956 * i_486_;
							i_484_ += anInt10946 * i_486_;
							i_482_ += i_486_;
						}
						if ((i_486_ = (i_483_ - anInt10956) / anInt10956) > i_485_)
							i_485_ = i_486_;
						if (i_484_ < 0) {
							i_486_ = (anInt10946 - 1 - i_484_) / anInt10946;
							i_485_ += i_486_;
							i_483_ += anInt10956 * i_486_;
							i_484_ += anInt10946 * i_486_;
							i_482_ += i_486_;
						}
						if ((i_486_ = (1 + i_484_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_485_)
							i_485_ = i_486_;
						for (/**/; i_485_ < 0; i_485_++) {
							method10192(((i_484_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_483_ >> 12)), i_482_++, is, i, i_450_);
							i_483_ += anInt10956;
							i_484_ += anInt10946;
						}
						i_481_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_487_ = anInt10940;
				while (i_487_ < 0) {
					int i_488_ = anInt10944;
					int i_489_ = anInt10951 + anInt10953;
					int i_490_ = anInt10952;
					int i_491_ = anInt10958;
					if (i_490_ >= 0 && i_490_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
						if (i_489_ < 0) {
							int i_492_ = (anInt10956 - 1 - i_489_) / anInt10956;
							i_491_ += i_492_;
							i_489_ += anInt10956 * i_492_;
							i_488_ += i_492_;
						}
						int i_493_;
						if ((i_493_ = (1 + i_489_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_491_)
							i_491_ = i_493_;
						for (/**/; i_491_ < 0; i_491_++) {
							method10192(((i_490_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945 + (i_489_ >> 12)), i_488_++, is, i, i_450_);
							i_489_ += anInt10956;
						}
					}
					i_487_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_494_ = anInt10940; i_494_ < 0; i_494_++) {
					int i_495_ = anInt10944;
					int i_496_ = anInt10951 + anInt10953;
					int i_497_ = anInt10952 + anInt10954;
					int i_498_ = anInt10958;
					if (i_496_ < 0) {
						int i_499_ = (anInt10956 - 1 - i_496_) / anInt10956;
						i_498_ += i_499_;
						i_496_ += anInt10956 * i_499_;
						i_497_ += anInt10946 * i_499_;
						i_495_ += i_499_;
					}
					int i_500_;
					if ((i_500_ = (1 + i_496_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_498_)
						i_498_ = i_500_;
					if ((i_500_ = i_497_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
						i_500_ = (anInt10946 - i_500_) / anInt10946;
						i_498_ += i_500_;
						i_496_ += anInt10956 * i_500_;
						i_497_ += anInt10946 * i_500_;
						i_495_ += i_500_;
					}
					if ((i_500_ = (i_497_ - anInt10946) / anInt10946) > i_498_)
						i_498_ = i_500_;
					for (/**/; i_498_ < 0; i_498_++) {
						method10192((((i_497_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_496_ >> 12)), i_495_++, is, i, i_450_);
						i_496_ += anInt10956;
						i_497_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_501_ = anInt10940; i_501_ < 0; i_501_++) {
					int i_502_ = anInt10944;
					int i_503_ = anInt10951 + anInt10953;
					int i_504_ = anInt10952 + anInt10954;
					int i_505_ = anInt10958;
					if (i_503_ < 0) {
						int i_506_ = (anInt10956 - 1 - i_503_) / anInt10956;
						i_505_ += i_506_;
						i_503_ += anInt10956 * i_506_;
						i_504_ += anInt10946 * i_506_;
						i_502_ += i_506_;
					}
					int i_507_;
					if ((i_507_ = (1 + i_503_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_505_)
						i_505_ = i_507_;
					if (i_504_ < 0) {
						i_507_ = (anInt10946 - 1 - i_504_) / anInt10946;
						i_505_ += i_507_;
						i_503_ += anInt10956 * i_507_;
						i_504_ += anInt10946 * i_507_;
						i_502_ += i_507_;
					}
					if ((i_507_ = (1 + i_504_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_505_)
						i_505_ = i_507_;
					for (/**/; i_505_ < 0; i_505_++) {
						method10192((((i_504_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_503_ >> 12)), i_502_++, is, i, i_450_);
						i_503_ += anInt10956;
						i_504_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	Class161_Sub3_Sub3(Class106_Sub2 class106_sub2, int i, int i_508_) {
		super(class106_sub2, i, i_508_);
		((Class161_Sub3_Sub3) this).anIntArray11238 = new int[i * i_508_];
	}

	public void method2594(int i, int i_509_, int i_510_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		if (i_510_ == 0) {
			for (int i_511_ = 0; i_511_ < ((Class161_Sub3_Sub3) this).anInt10930; i_511_++) {
				int i_512_ = i_511_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_513_ = (((i_509_ + i_511_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_514_ = 0; i_514_ < ((Class161_Sub3_Sub3) this).anInt10945; i_514_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_512_ + i_514_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_512_ + i_514_]) & 0xffffff | is[i_513_ + i_514_] << 8 & ~0xffffff);
			}
		} else if (i_510_ == 1) {
			for (int i_515_ = 0; i_515_ < ((Class161_Sub3_Sub3) this).anInt10930; i_515_++) {
				int i_516_ = i_515_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_517_ = (((i_509_ + i_515_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_518_ = 0; i_518_ < ((Class161_Sub3_Sub3) this).anInt10945; i_518_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_516_ + i_518_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_516_ + i_518_]) & 0xffffff | is[i_517_ + i_518_] << 16 & ~0xffffff);
			}
		} else if (i_510_ == 2) {
			for (int i_519_ = 0; i_519_ < ((Class161_Sub3_Sub3) this).anInt10930; i_519_++) {
				int i_520_ = i_519_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_521_ = (((i_509_ + i_519_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_522_ = 0; i_522_ < ((Class161_Sub3_Sub3) this).anInt10945; i_522_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_520_ + i_522_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_520_ + i_522_]) & 0xffffff | is[i_521_ + i_522_] << 24 & ~0xffffff);
			}
		} else if (i_510_ == 3) {
			for (int i_523_ = 0; i_523_ < ((Class161_Sub3_Sub3) this).anInt10930; i_523_++) {
				int i_524_ = i_523_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_525_ = (((i_509_ + i_523_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_526_ = 0; i_526_ < ((Class161_Sub3_Sub3) this).anInt10945; i_526_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_524_ + i_526_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_524_ + i_526_]) & 0xffffff | (is[i_525_ + i_526_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2619(int i, int i_527_, int i_528_, int i_529_, int i_530_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_531_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_527_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_532_ = i_527_ * i_531_ + i;
			int i_533_ = 0;
			int i_534_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_535_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_536_ = i_531_ - i_535_;
			int i_537_ = 0;
			if (i_527_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_538_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_527_);
				i_534_ -= i_538_;
				i_527_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_533_ += i_538_ * i_535_;
				i_532_ += i_538_ * i_531_;
			}
			if (i_527_ + i_534_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_534_ -= (i_527_ + i_534_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_539_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_535_ -= i_539_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_533_ += i_539_;
				i_532_ += i_539_;
				i_537_ += i_539_;
				i_536_ += i_539_;
			}
			if (i + i_535_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_540_ = (i + i_535_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_535_ -= i_540_;
				i_537_ += i_540_;
				i_536_ += i_540_;
			}
			if (i_535_ > 0 && i_534_ > 0) {
				if (i_530_ == 0) {
					if (i_528_ == 1) {
						for (int i_541_ = -i_534_; i_541_ < 0; i_541_++) {
							int i_542_ = i_532_ + i_535_ - 3;
							while (i_532_ < i_542_) {
								is[i_532_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								is[i_532_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								is[i_532_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								is[i_532_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
							}
							i_542_ += 3;
							while (i_532_ < i_542_)
								is[i_532_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 0) {
						int i_543_ = (i_529_ & 0xff0000) >> 16;
						int i_544_ = (i_529_ & 0xff00) >> 8;
						int i_545_ = i_529_ & 0xff;
						for (int i_546_ = -i_534_; i_546_ < 0; i_546_++) {
							for (int i_547_ = -i_535_; i_547_ < 0; i_547_++) {
								int i_548_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_549_ = (i_548_ & 0xff0000) * i_543_ & ~0xffffff;
								int i_550_ = (i_548_ & 0xff00) * i_544_ & 0xff0000;
								int i_551_ = (i_548_ & 0xff) * i_545_ & 0xff00;
								is[i_532_++] = (i_549_ | i_550_ | i_551_) >>> 8;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 3) {
						for (int i_552_ = -i_534_; i_552_ < 0; i_552_++) {
							for (int i_553_ = -i_535_; i_553_ < 0; i_553_++) {
								int i_554_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_555_ = i_554_ + i_529_;
								int i_556_ = ((i_554_ & 0xff00ff) + (i_529_ & 0xff00ff));
								int i_557_ = ((i_556_ & 0x1000100) + (i_555_ - i_556_ & 0x10000));
								is[i_532_++] = i_555_ - i_557_ | i_557_ - (i_557_ >>> 8);
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 2) {
						int i_558_ = i_529_ >>> 24;
						int i_559_ = 256 - i_558_;
						int i_560_ = (i_529_ & 0xff00ff) * i_559_ & ~0xff00ff;
						int i_561_ = (i_529_ & 0xff00) * i_559_ & 0xff0000;
						i_529_ = (i_560_ | i_561_) >>> 8;
						for (int i_562_ = -i_534_; i_562_ < 0; i_562_++) {
							for (int i_563_ = -i_535_; i_563_ < 0; i_563_++) {
								int i_564_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								i_560_ = (i_564_ & 0xff00ff) * i_558_ & ~0xff00ff;
								i_561_ = (i_564_ & 0xff00) * i_558_ & 0xff0000;
								is[i_532_++] = ((i_560_ | i_561_) >>> 8) + i_529_;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_530_ == 1) {
					if (i_528_ == 1) {
						for (int i_565_ = -i_534_; i_565_ < 0; i_565_++) {
							for (int i_566_ = -i_535_; i_566_ < 0; i_566_++) {
								int i_567_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_568_ = i_567_ >>> 24;
								int i_569_ = 256 - i_568_;
								int i_570_ = is[i_532_];
								is[i_532_++] = (((((i_567_ & 0xff00ff) * i_568_ + (i_570_ & 0xff00ff) * i_569_) & ~0xff00ff) >> 8) + (((((i_567_ & ~0xff00ff) >>> 8) * i_568_) + (((i_570_ & ~0xff00ff) >>> 8) * i_569_)) & ~0xff00ff));
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 0) {
						if ((i_529_ & 0xffffff) == 16777215) {
							for (int i_571_ = -i_534_; i_571_ < 0; i_571_++) {
								for (int i_572_ = -i_535_; i_572_ < 0; i_572_++) {
									int i_573_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
									int i_574_ = ((i_573_ >>> 24) * (i_529_ >>> 24) >> 8);
									int i_575_ = 256 - i_574_;
									int i_576_ = is[i_532_];
									is[i_532_++] = ((((i_573_ & 0xff00ff) * i_574_ + (i_576_ & 0xff00ff) * i_575_) & ~0xff00ff) + (((i_573_ & 0xff00) * i_574_ + (i_576_ & 0xff00) * i_575_) & 0xff0000)) >> 8;
								}
								i_532_ += i_536_;
								i_533_ += i_537_;
							}
						} else {
							int i_577_ = (i_529_ & 0xff0000) >> 16;
							int i_578_ = (i_529_ & 0xff00) >> 8;
							int i_579_ = i_529_ & 0xff;
							for (int i_580_ = -i_534_; i_580_ < 0; i_580_++) {
								for (int i_581_ = -i_535_; i_581_ < 0; i_581_++) {
									int i_582_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
									int i_583_ = ((i_582_ >>> 24) * (i_529_ >>> 24) >> 8);
									int i_584_ = 256 - i_583_;
									if (i_583_ != 255) {
										int i_585_ = ((i_582_ & 0xff0000) * i_577_ & ~0xffffff);
										int i_586_ = ((i_582_ & 0xff00) * i_578_ & 0xff0000);
										int i_587_ = ((i_582_ & 0xff) * i_579_ & 0xff00);
										i_582_ = (i_585_ | i_586_ | i_587_) >>> 8;
										int i_588_ = is[i_532_];
										is[i_532_++] = ((((i_582_ & 0xff00ff) * i_583_ + ((i_588_ & 0xff00ff) * i_584_)) & ~0xff00ff) + (((i_582_ & 0xff00) * i_583_ + ((i_588_ & 0xff00) * i_584_)) & 0xff0000)) >> 8;
									} else {
										int i_589_ = ((i_582_ & 0xff0000) * i_577_ & ~0xffffff);
										int i_590_ = ((i_582_ & 0xff00) * i_578_ & 0xff0000);
										int i_591_ = ((i_582_ & 0xff) * i_579_ & 0xff00);
										is[i_532_++] = (i_589_ | i_590_ | i_591_) >>> 8;
									}
								}
								i_532_ += i_536_;
								i_533_ += i_537_;
							}
						}
					} else if (i_528_ == 3) {
						for (int i_592_ = -i_534_; i_592_ < 0; i_592_++) {
							for (int i_593_ = -i_535_; i_593_ < 0; i_593_++) {
								int i_594_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_595_ = i_594_ + i_529_;
								int i_596_ = ((i_594_ & 0xff00ff) + (i_529_ & 0xff00ff));
								int i_597_ = ((i_596_ & 0x1000100) + (i_595_ - i_596_ & 0x10000));
								i_597_ = i_595_ - i_597_ | i_597_ - (i_597_ >>> 8);
								int i_598_ = (i_597_ >>> 24) * (i_529_ >>> 24) >> 8;
								int i_599_ = 256 - i_598_;
								if (i_598_ != 255) {
									i_594_ = i_597_;
									i_597_ = is[i_532_];
									i_597_ = ((((i_594_ & 0xff00ff) * i_598_ + (i_597_ & 0xff00ff) * i_599_) & ~0xff00ff) + (((i_594_ & 0xff00) * i_598_ + (i_597_ & 0xff00) * i_599_) & 0xff0000)) >> 8;
								}
								is[i_532_++] = i_597_;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 2) {
						int i_600_ = i_529_ >>> 24;
						int i_601_ = 256 - i_600_;
						int i_602_ = (i_529_ & 0xff00ff) * i_601_ & ~0xff00ff;
						int i_603_ = (i_529_ & 0xff00) * i_601_ & 0xff0000;
						i_529_ = (i_602_ | i_603_) >>> 8;
						for (int i_604_ = -i_534_; i_604_ < 0; i_604_++) {
							for (int i_605_ = -i_535_; i_605_ < 0; i_605_++) {
								int i_606_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_607_ = i_606_ >>> 24;
								int i_608_ = 256 - i_607_;
								i_602_ = (i_606_ & 0xff00ff) * i_600_ & ~0xff00ff;
								i_603_ = (i_606_ & 0xff00) * i_600_ & 0xff0000;
								i_606_ = ((i_602_ | i_603_) >>> 8) + i_529_;
								int i_609_ = is[i_532_];
								is[i_532_++] = ((((i_606_ & 0xff00ff) * i_607_ + (i_609_ & 0xff00ff) * i_608_) & ~0xff00ff) + (((i_606_ & 0xff00) * i_607_ + (i_609_ & 0xff00) * i_608_) & 0xff0000)) >> 8;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_530_ == 2) {
					if (i_528_ == 1) {
						for (int i_610_ = -i_534_; i_610_ < 0; i_610_++) {
							for (int i_611_ = -i_535_; i_611_ < 0; i_611_++) {
								int i_612_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								if (i_612_ != 0) {
									int i_613_ = is[i_532_];
									int i_614_ = i_612_ + i_613_;
									int i_615_ = ((i_612_ & 0xff00ff) + (i_613_ & 0xff00ff));
									i_613_ = ((i_615_ & 0x1000100) + (i_614_ - i_615_ & 0x10000));
									is[i_532_++] = i_614_ - i_613_ | i_613_ - (i_613_ >>> 8);
								} else
									i_532_++;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 0) {
						int i_616_ = (i_529_ & 0xff0000) >> 16;
						int i_617_ = (i_529_ & 0xff00) >> 8;
						int i_618_ = i_529_ & 0xff;
						for (int i_619_ = -i_534_; i_619_ < 0; i_619_++) {
							for (int i_620_ = -i_535_; i_620_ < 0; i_620_++) {
								int i_621_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								if (i_621_ != 0) {
									int i_622_ = ((i_621_ & 0xff0000) * i_616_ & ~0xffffff);
									int i_623_ = ((i_621_ & 0xff00) * i_617_ & 0xff0000);
									int i_624_ = (i_621_ & 0xff) * i_618_ & 0xff00;
									i_621_ = (i_622_ | i_623_ | i_624_) >>> 8;
									int i_625_ = is[i_532_];
									int i_626_ = i_621_ + i_625_;
									int i_627_ = ((i_621_ & 0xff00ff) + (i_625_ & 0xff00ff));
									i_625_ = ((i_627_ & 0x1000100) + (i_626_ - i_627_ & 0x10000));
									is[i_532_++] = i_626_ - i_625_ | i_625_ - (i_625_ >>> 8);
								} else
									i_532_++;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 3) {
						for (int i_628_ = -i_534_; i_628_ < 0; i_628_++) {
							for (int i_629_ = -i_535_; i_629_ < 0; i_629_++) {
								int i_630_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								int i_631_ = i_630_ + i_529_;
								int i_632_ = ((i_630_ & 0xff00ff) + (i_529_ & 0xff00ff));
								int i_633_ = ((i_632_ & 0x1000100) + (i_631_ - i_632_ & 0x10000));
								i_630_ = i_631_ - i_633_ | i_633_ - (i_633_ >>> 8);
								i_633_ = is[i_532_];
								i_631_ = i_630_ + i_633_;
								i_632_ = (i_630_ & 0xff00ff) + (i_633_ & 0xff00ff);
								i_633_ = (i_632_ & 0x1000100) + (i_631_ - i_632_ & 0x10000);
								is[i_532_++] = i_631_ - i_633_ | i_633_ - (i_633_ >>> 8);
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else if (i_528_ == 2) {
						int i_634_ = i_529_ >>> 24;
						int i_635_ = 256 - i_634_;
						int i_636_ = (i_529_ & 0xff00ff) * i_635_ & ~0xff00ff;
						int i_637_ = (i_529_ & 0xff00) * i_635_ & 0xff0000;
						i_529_ = (i_636_ | i_637_) >>> 8;
						for (int i_638_ = -i_534_; i_638_ < 0; i_638_++) {
							for (int i_639_ = -i_535_; i_639_ < 0; i_639_++) {
								int i_640_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_533_++]);
								if (i_640_ != 0) {
									i_636_ = ((i_640_ & 0xff00ff) * i_634_ & ~0xff00ff);
									i_637_ = ((i_640_ & 0xff00) * i_634_ & 0xff0000);
									i_640_ = ((i_636_ | i_637_) >>> 8) + i_529_;
									int i_641_ = is[i_532_];
									int i_642_ = i_640_ + i_641_;
									int i_643_ = ((i_640_ & 0xff00ff) + (i_641_ & 0xff00ff));
									i_641_ = ((i_643_ & 0x1000100) + (i_642_ - i_643_ & 0x10000));
									is[i_532_++] = i_642_ - i_641_ | i_641_ - (i_641_ >>> 8);
								} else
									i_532_++;
							}
							i_532_ += i_536_;
							i_533_ += i_537_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2596(int i, int i_644_, Class167 class167, int i_645_, int i_646_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_644_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_647_ = 0;
			int i_648_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_649_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_650_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_651_ = i_648_ - i_649_;
			int i_652_ = 0;
			int i_653_ = i + i_644_ * i_648_;
			if (i_644_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_654_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_644_);
				i_650_ -= i_654_;
				i_644_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_647_ += i_654_ * i_649_;
				i_653_ += i_654_ * i_648_;
			}
			if (i_644_ + i_650_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_650_ -= (i_644_ + i_650_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_655_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_649_ -= i_655_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_647_ += i_655_;
				i_653_ += i_655_;
				i_652_ += i_655_;
				i_651_ += i_655_;
			}
			if (i + i_649_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_656_ = (i + i_649_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_649_ -= i_656_;
				i_652_ += i_656_;
				i_651_ += i_656_;
			}
			if (i_649_ > 0 && i_650_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_657_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_658_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_659_ = i_644_;
				if (i_646_ > i_659_) {
					i_659_ = i_646_;
					i_653_ += (i_646_ - i_644_) * i_648_;
					i_647_ += ((i_646_ - i_644_) * ((Class161_Sub3_Sub3) this).anInt10945);
				}
				int i_660_ = (i_646_ + is_657_.length < i_644_ + i_650_ ? i_646_ + is_657_.length : i_644_ + i_650_);
				for (int i_661_ = i_659_; i_661_ < i_660_; i_661_++) {
					int i_662_ = is_657_[i_661_ - i_646_] + i_645_;
					int i_663_ = is_658_[i_661_ - i_646_];
					int i_664_ = i_649_;
					if (i > i_662_) {
						int i_665_ = i - i_662_;
						if (i_665_ >= i_663_) {
							i_647_ += i_649_ + i_652_;
							i_653_ += i_649_ + i_651_;
							continue;
						}
						i_663_ -= i_665_;
					} else {
						int i_666_ = i_662_ - i;
						if (i_666_ >= i_649_) {
							i_647_ += i_649_ + i_652_;
							i_653_ += i_649_ + i_651_;
							continue;
						}
						i_647_ += i_666_;
						i_664_ -= i_666_;
						i_653_ += i_666_;
					}
					int i_667_ = 0;
					if (i_664_ < i_663_)
						i_663_ = i_664_;
					else
						i_667_ = i_664_ - i_663_;
					for (int i_668_ = -i_663_; i_668_ < 0; i_668_++) {
						int i_669_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_647_++]);
						int i_670_ = i_669_ >>> 24;
						int i_671_ = 256 - i_670_;
						int i_672_ = is[i_653_];
						is[i_653_++] = ((((i_669_ & 0xff00ff) * i_670_ + (i_672_ & 0xff00ff) * i_671_) & ~0xff00ff) + (((i_669_ & 0xff00) * i_670_ + (i_672_ & 0xff00) * i_671_) & 0xff0000)) >> 8;
					}
					i_647_ += i_667_ + i_652_;
					i_653_ += i_667_ + i_651_;
				}
			}
		}
	}

	public Interface6 method2642() {
		return new Class198(((Class161_Sub3_Sub3) this).anInt10945, ((Class161_Sub3_Sub3) this).anInt10930, ((Class161_Sub3_Sub3) this).anIntArray11238);
	}

	void method10192(int i, int i_673_, int[] is, int i_674_, int i_675_) {
		if (i_675_ == 0) {
			if (i_674_ == 1)
				is[i_673_] = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
			else if (i_674_ == 0) {
				int i_676_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i++];
				int i_677_ = (i_676_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_678_ = (i_676_ & 0xff00) * anInt10959 & 0xff0000;
				int i_679_ = (i_676_ & 0xff) * anInt10960 & 0xff00;
				is[i_673_] = (i_677_ | i_678_ | i_679_) >>> 8;
			} else if (i_674_ == 3) {
				int i_680_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i++];
				int i_681_ = anInt10928;
				int i_682_ = i_680_ + i_681_;
				int i_683_ = (i_680_ & 0xff00ff) + (i_681_ & 0xff00ff);
				int i_684_ = (i_683_ & 0x1000100) + (i_682_ - i_683_ & 0x10000);
				is[i_673_] = i_682_ - i_684_ | i_684_ - (i_684_ >>> 8);
			} else if (i_674_ == 2) {
				int i_685_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_686_ = (i_685_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_687_ = (i_685_ & 0xff00) * anInt10934 & 0xff0000;
				is[i_673_] = ((i_686_ | i_687_) >>> 8) + anInt10963;
			} else
				throw new IllegalArgumentException();
		} else if (i_675_ == 1) {
			if (i_674_ == 1) {
				int i_688_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_689_ = i_688_ >>> 24;
				int i_690_ = 256 - i_689_;
				int i_691_ = is[i_673_];
				is[i_673_] = ((((i_688_ & 0xff00ff) * i_689_ + (i_691_ & 0xff00ff) * i_690_) & ~0xff00ff) + (((i_688_ & 0xff00) * i_689_ + (i_691_ & 0xff00) * i_690_) & 0xff0000)) >> 8;
			} else if (i_674_ == 0) {
				int i_692_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_693_ = (i_692_ >>> 24) * anInt10934 >> 8;
				int i_694_ = 256 - i_693_;
				if ((anInt10928 & 0xffffff) == 16777215) {
					int i_695_ = is[i_673_];
					is[i_673_] = ((((i_692_ & 0xff00ff) * i_693_ + (i_695_ & 0xff00ff) * i_694_) & ~0xff00ff) + (((i_692_ & 0xff00) * i_693_ + (i_695_ & 0xff00) * i_694_) & 0xff0000)) >> 8;
				} else if (i_693_ != 255) {
					int i_696_ = (i_692_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_697_ = (i_692_ & 0xff00) * anInt10959 & 0xff0000;
					int i_698_ = (i_692_ & 0xff) * anInt10960 & 0xff00;
					i_692_ = (i_696_ | i_697_ | i_698_) >>> 8;
					int i_699_ = is[i_673_];
					is[i_673_] = ((((i_692_ & 0xff00ff) * i_693_ + (i_699_ & 0xff00ff) * i_694_) & ~0xff00ff) + (((i_692_ & 0xff00) * i_693_ + (i_699_ & 0xff00) * i_694_) & 0xff0000)) >> 8;
				} else {
					int i_700_ = (i_692_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_701_ = (i_692_ & 0xff00) * anInt10959 & 0xff0000;
					int i_702_ = (i_692_ & 0xff) * anInt10960 & 0xff00;
					is[i_673_] = (i_700_ | i_701_ | i_702_) >>> 8;
				}
			} else if (i_674_ == 3) {
				int i_703_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_704_ = anInt10928;
				int i_705_ = i_703_ + i_704_;
				int i_706_ = (i_703_ & 0xff00ff) + (i_704_ & 0xff00ff);
				int i_707_ = (i_706_ & 0x1000100) + (i_705_ - i_706_ & 0x10000);
				i_707_ = i_705_ - i_707_ | i_707_ - (i_707_ >>> 8);
				int i_708_ = (i_703_ >>> 24) * anInt10934 >> 8;
				int i_709_ = 256 - i_708_;
				if (i_708_ != 255) {
					i_703_ = i_707_;
					i_707_ = is[i_673_];
					i_707_ = ((((i_703_ & 0xff00ff) * i_708_ + (i_707_ & 0xff00ff) * i_709_) & ~0xff00ff) + (((i_703_ & 0xff00) * i_708_ + (i_707_ & 0xff00) * i_709_) & 0xff0000)) >> 8;
				}
				is[i_673_] = i_707_;
			} else if (i_674_ == 2) {
				int i_710_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_711_ = i_710_ >>> 24;
				int i_712_ = 256 - i_711_;
				int i_713_ = (i_710_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_714_ = (i_710_ & 0xff00) * anInt10934 & 0xff0000;
				i_710_ = ((i_713_ | i_714_) >>> 8) + anInt10963;
				int i_715_ = is[i_673_];
				is[i_673_] = ((((i_710_ & 0xff00ff) * i_711_ + (i_715_ & 0xff00ff) * i_712_) & ~0xff00ff) + (((i_710_ & 0xff00) * i_711_ + (i_715_ & 0xff00) * i_712_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_675_ == 2) {
			if (i_674_ == 1) {
				int i_716_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_717_ = is[i_673_];
				int i_718_ = i_716_ + i_717_;
				int i_719_ = (i_716_ & 0xff00ff) + (i_717_ & 0xff00ff);
				i_717_ = (i_719_ & 0x1000100) + (i_718_ - i_719_ & 0x10000);
				is[i_673_] = i_718_ - i_717_ | i_717_ - (i_717_ >>> 8);
			} else if (i_674_ == 0) {
				int i_720_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_721_ = (i_720_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_722_ = (i_720_ & 0xff00) * anInt10959 & 0xff0000;
				int i_723_ = (i_720_ & 0xff) * anInt10960 & 0xff00;
				i_720_ = (i_721_ | i_722_ | i_723_) >>> 8;
				int i_724_ = is[i_673_];
				int i_725_ = i_720_ + i_724_;
				int i_726_ = (i_720_ & 0xff00ff) + (i_724_ & 0xff00ff);
				i_724_ = (i_726_ & 0x1000100) + (i_725_ - i_726_ & 0x10000);
				is[i_673_] = i_725_ - i_724_ | i_724_ - (i_724_ >>> 8);
			} else if (i_674_ == 3) {
				int i_727_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_728_ = anInt10928;
				int i_729_ = i_727_ + i_728_;
				int i_730_ = (i_727_ & 0xff00ff) + (i_728_ & 0xff00ff);
				int i_731_ = (i_730_ & 0x1000100) + (i_729_ - i_730_ & 0x10000);
				i_727_ = i_729_ - i_731_ | i_731_ - (i_731_ >>> 8);
				i_731_ = is[i_673_];
				i_729_ = i_727_ + i_731_;
				i_730_ = (i_727_ & 0xff00ff) + (i_731_ & 0xff00ff);
				i_731_ = (i_730_ & 0x1000100) + (i_729_ - i_730_ & 0x10000);
				is[i_673_] = i_729_ - i_731_ | i_731_ - (i_731_ >>> 8);
			} else if (i_674_ == 2) {
				int i_732_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_733_ = (i_732_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_734_ = (i_732_ & 0xff00) * anInt10934 & 0xff0000;
				i_732_ = ((i_733_ | i_734_) >>> 8) + anInt10963;
				int i_735_ = is[i_673_];
				int i_736_ = i_732_ + i_735_;
				int i_737_ = (i_732_ & 0xff00ff) + (i_735_ & 0xff00ff);
				i_735_ = (i_737_ & 0x1000100) + (i_736_ - i_737_ & 0x10000);
				is[i_673_] = i_736_ - i_735_ | i_735_ - (i_735_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	void method2599(int i, int i_738_, int i_739_, int i_740_, int i_741_, int i_742_, int i_743_, int i_744_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_739_ > 0 && i_740_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_745_ = 0;
				int i_746_ = 0;
				int i_747_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_748_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_749_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_750_ = (i_748_ << 16) / i_739_;
				int i_751_ = (i_749_ << 16) / i_740_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_752_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_750_ - 1) / i_750_);
					i += i_752_;
					i_745_ += (i_752_ * i_750_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_753_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_751_ - 1) / i_751_);
					i_738_ += i_753_;
					i_746_ += (i_753_ * i_751_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_748_)
					i_739_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_745_ + i_750_ - 1) / i_750_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_749_)
					i_740_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_746_ + i_751_ - 1) / i_751_;
				int i_754_ = i + i_738_ * i_747_;
				int i_755_ = i_747_ - i_739_;
				if (i_738_ + i_740_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_740_ -= (i_738_ + i_740_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_738_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_756_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_738_;
					i_740_ -= i_756_;
					i_754_ += i_756_ * i_747_;
					i_746_ += i_751_ * i_756_;
				}
				if (i + i_739_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
					int i_757_ = (i + i_739_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_739_ -= i_757_;
					i_755_ += i_757_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_758_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i;
					i_739_ -= i_758_;
					i_754_ += i_758_;
					i_745_ += i_750_ * i_758_;
					i_755_ += i_758_;
				}
				if (i_743_ == 0) {
					if (i_741_ == 1) {
						int i_759_ = i_745_;
						for (int i_760_ = -i_740_; i_760_ < 0; i_760_++) {
							int i_761_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_762_ = -i_739_; i_762_ < 0; i_762_++) {
								is[i_754_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_761_]);
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_759_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 0) {
						int i_763_ = (i_742_ & 0xff0000) >> 16;
						int i_764_ = (i_742_ & 0xff00) >> 8;
						int i_765_ = i_742_ & 0xff;
						int i_766_ = i_745_;
						for (int i_767_ = -i_740_; i_767_ < 0; i_767_++) {
							int i_768_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_769_ = -i_739_; i_769_ < 0; i_769_++) {
								int i_770_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_768_]);
								int i_771_ = (i_770_ & 0xff0000) * i_763_ & ~0xffffff;
								int i_772_ = (i_770_ & 0xff00) * i_764_ & 0xff0000;
								int i_773_ = (i_770_ & 0xff) * i_765_ & 0xff00;
								is[i_754_++] = (i_771_ | i_772_ | i_773_) >>> 8;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_766_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 3) {
						int i_774_ = i_745_;
						for (int i_775_ = -i_740_; i_775_ < 0; i_775_++) {
							int i_776_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_777_ = -i_739_; i_777_ < 0; i_777_++) {
								int i_778_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_776_]);
								int i_779_ = i_778_ + i_742_;
								int i_780_ = ((i_778_ & 0xff00ff) + (i_742_ & 0xff00ff));
								int i_781_ = ((i_780_ & 0x1000100) + (i_779_ - i_780_ & 0x10000));
								is[i_754_++] = i_779_ - i_781_ | i_781_ - (i_781_ >>> 8);
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_774_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 2) {
						int i_782_ = i_742_ >>> 24;
						int i_783_ = 256 - i_782_;
						int i_784_ = (i_742_ & 0xff00ff) * i_783_ & ~0xff00ff;
						int i_785_ = (i_742_ & 0xff00) * i_783_ & 0xff0000;
						i_742_ = (i_784_ | i_785_) >>> 8;
						int i_786_ = i_745_;
						for (int i_787_ = -i_740_; i_787_ < 0; i_787_++) {
							int i_788_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_789_ = -i_739_; i_789_ < 0; i_789_++) {
								int i_790_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_788_]);
								i_784_ = (i_790_ & 0xff00ff) * i_782_ & ~0xff00ff;
								i_785_ = (i_790_ & 0xff00) * i_782_ & 0xff0000;
								is[i_754_++] = ((i_784_ | i_785_) >>> 8) + i_742_;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_786_;
							i_754_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_743_ == 1) {
					if (i_741_ == 1) {
						int i_791_ = i_745_;
						for (int i_792_ = -i_740_; i_792_ < 0; i_792_++) {
							int i_793_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_794_ = -i_739_; i_794_ < 0; i_794_++) {
								int i_795_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_793_]);
								int i_796_ = i_795_ >>> 24;
								int i_797_ = 256 - i_796_;
								int i_798_ = is[i_754_];
								is[i_754_++] = (((((i_795_ & 0xff00ff) * i_796_ + (i_798_ & 0xff00ff) * i_797_) & ~0xff00ff) >> 8) + (((((i_795_ & ~0xff00ff) >>> 8) * i_796_) + (((i_798_ & ~0xff00ff) >>> 8) * i_797_)) & ~0xff00ff));
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_791_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 0) {
						int i_799_ = i_745_;
						if ((i_742_ & 0xffffff) == 16777215) {
							for (int i_800_ = -i_740_; i_800_ < 0; i_800_++) {
								int i_801_ = ((i_746_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_802_ = -i_739_; i_802_ < 0; i_802_++) {
									int i_803_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_801_]);
									int i_804_ = ((i_803_ >>> 24) * (i_742_ >>> 24) >> 8);
									int i_805_ = 256 - i_804_;
									int i_806_ = is[i_754_];
									is[i_754_++] = ((((i_803_ & 0xff00ff) * i_804_ + (i_806_ & 0xff00ff) * i_805_) & ~0xff00ff) + (((i_803_ & 0xff00) * i_804_ + (i_806_ & 0xff00) * i_805_) & 0xff0000)) >> 8;
									i_745_ += i_750_;
								}
								i_746_ += i_751_;
								i_745_ = i_799_;
								i_754_ += i_755_;
							}
						} else {
							int i_807_ = (i_742_ & 0xff0000) >> 16;
							int i_808_ = (i_742_ & 0xff00) >> 8;
							int i_809_ = i_742_ & 0xff;
							for (int i_810_ = -i_740_; i_810_ < 0; i_810_++) {
								int i_811_ = ((i_746_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_812_ = -i_739_; i_812_ < 0; i_812_++) {
									int i_813_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_811_]);
									int i_814_ = ((i_813_ >>> 24) * (i_742_ >>> 24) >> 8);
									int i_815_ = 256 - i_814_;
									if (i_814_ != 255) {
										int i_816_ = ((i_813_ & 0xff0000) * i_807_ & ~0xffffff);
										int i_817_ = ((i_813_ & 0xff00) * i_808_ & 0xff0000);
										int i_818_ = ((i_813_ & 0xff) * i_809_ & 0xff00);
										i_813_ = (i_816_ | i_817_ | i_818_) >>> 8;
										int i_819_ = is[i_754_];
										is[i_754_++] = ((((i_813_ & 0xff00ff) * i_814_ + ((i_819_ & 0xff00ff) * i_815_)) & ~0xff00ff) + (((i_813_ & 0xff00) * i_814_ + ((i_819_ & 0xff00) * i_815_)) & 0xff0000)) >> 8;
									} else {
										int i_820_ = ((i_813_ & 0xff0000) * i_807_ & ~0xffffff);
										int i_821_ = ((i_813_ & 0xff00) * i_808_ & 0xff0000);
										int i_822_ = ((i_813_ & 0xff) * i_809_ & 0xff00);
										is[i_754_++] = (i_820_ | i_821_ | i_822_) >>> 8;
									}
									i_745_ += i_750_;
								}
								i_746_ += i_751_;
								i_745_ = i_799_;
								i_754_ += i_755_;
							}
						}
					} else if (i_741_ == 3) {
						int i_823_ = i_745_;
						for (int i_824_ = -i_740_; i_824_ < 0; i_824_++) {
							int i_825_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_826_ = -i_739_; i_826_ < 0; i_826_++) {
								int i_827_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_825_]);
								int i_828_ = i_827_ + i_742_;
								int i_829_ = ((i_827_ & 0xff00ff) + (i_742_ & 0xff00ff));
								int i_830_ = ((i_829_ & 0x1000100) + (i_828_ - i_829_ & 0x10000));
								i_830_ = i_828_ - i_830_ | i_830_ - (i_830_ >>> 8);
								int i_831_ = (i_830_ >>> 24) * (i_742_ >>> 24) >> 8;
								int i_832_ = 256 - i_831_;
								if (i_831_ != 255) {
									i_827_ = i_830_;
									i_830_ = is[i_754_];
									i_830_ = ((((i_827_ & 0xff00ff) * i_831_ + (i_830_ & 0xff00ff) * i_832_) & ~0xff00ff) + (((i_827_ & 0xff00) * i_831_ + (i_830_ & 0xff00) * i_832_) & 0xff0000)) >> 8;
								}
								is[i_754_++] = i_830_;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_823_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 2) {
						int i_833_ = i_742_ >>> 24;
						int i_834_ = 256 - i_833_;
						int i_835_ = (i_742_ & 0xff00ff) * i_834_ & ~0xff00ff;
						int i_836_ = (i_742_ & 0xff00) * i_834_ & 0xff0000;
						i_742_ = (i_835_ | i_836_) >>> 8;
						int i_837_ = i_745_;
						for (int i_838_ = -i_740_; i_838_ < 0; i_838_++) {
							int i_839_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_840_ = -i_739_; i_840_ < 0; i_840_++) {
								int i_841_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_839_]);
								int i_842_ = i_841_ >>> 24;
								int i_843_ = 256 - i_842_;
								i_835_ = (i_841_ & 0xff00ff) * i_833_ & ~0xff00ff;
								i_836_ = (i_841_ & 0xff00) * i_833_ & 0xff0000;
								i_841_ = ((i_835_ | i_836_) >>> 8) + i_742_;
								int i_844_ = is[i_754_];
								is[i_754_++] = ((((i_841_ & 0xff00ff) * i_842_ + (i_844_ & 0xff00ff) * i_843_) & ~0xff00ff) + (((i_841_ & 0xff00) * i_842_ + (i_844_ & 0xff00) * i_843_) & 0xff0000)) >> 8;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_837_;
							i_754_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_743_ == 2) {
					if (i_741_ == 1) {
						int i_845_ = i_745_;
						for (int i_846_ = -i_740_; i_846_ < 0; i_846_++) {
							int i_847_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_848_ = -i_739_; i_848_ < 0; i_848_++) {
								int i_849_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_847_]);
								if (i_849_ != 0) {
									int i_850_ = is[i_754_];
									int i_851_ = i_849_ + i_850_;
									int i_852_ = ((i_849_ & 0xff00ff) + (i_850_ & 0xff00ff));
									i_850_ = ((i_852_ & 0x1000100) + (i_851_ - i_852_ & 0x10000));
									is[i_754_++] = i_851_ - i_850_ | i_850_ - (i_850_ >>> 8);
								} else
									i_754_++;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_845_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 0) {
						int i_853_ = i_745_;
						int i_854_ = (i_742_ & 0xff0000) >> 16;
						int i_855_ = (i_742_ & 0xff00) >> 8;
						int i_856_ = i_742_ & 0xff;
						for (int i_857_ = -i_740_; i_857_ < 0; i_857_++) {
							int i_858_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_859_ = -i_739_; i_859_ < 0; i_859_++) {
								int i_860_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_858_]);
								if (i_860_ != 0) {
									int i_861_ = ((i_860_ & 0xff0000) * i_854_ & ~0xffffff);
									int i_862_ = ((i_860_ & 0xff00) * i_855_ & 0xff0000);
									int i_863_ = (i_860_ & 0xff) * i_856_ & 0xff00;
									i_860_ = (i_861_ | i_862_ | i_863_) >>> 8;
									int i_864_ = is[i_754_];
									int i_865_ = i_860_ + i_864_;
									int i_866_ = ((i_860_ & 0xff00ff) + (i_864_ & 0xff00ff));
									i_864_ = ((i_866_ & 0x1000100) + (i_865_ - i_866_ & 0x10000));
									is[i_754_++] = i_865_ - i_864_ | i_864_ - (i_864_ >>> 8);
								} else
									i_754_++;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_853_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 3) {
						int i_867_ = i_745_;
						for (int i_868_ = -i_740_; i_868_ < 0; i_868_++) {
							int i_869_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_870_ = -i_739_; i_870_ < 0; i_870_++) {
								int i_871_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_869_]);
								int i_872_ = i_871_ + i_742_;
								int i_873_ = ((i_871_ & 0xff00ff) + (i_742_ & 0xff00ff));
								int i_874_ = ((i_873_ & 0x1000100) + (i_872_ - i_873_ & 0x10000));
								i_871_ = i_872_ - i_874_ | i_874_ - (i_874_ >>> 8);
								i_874_ = is[i_754_];
								i_872_ = i_871_ + i_874_;
								i_873_ = (i_871_ & 0xff00ff) + (i_874_ & 0xff00ff);
								i_874_ = (i_873_ & 0x1000100) + (i_872_ - i_873_ & 0x10000);
								is[i_754_++] = i_872_ - i_874_ | i_874_ - (i_874_ >>> 8);
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_867_;
							i_754_ += i_755_;
						}
					} else if (i_741_ == 2) {
						int i_875_ = i_742_ >>> 24;
						int i_876_ = 256 - i_875_;
						int i_877_ = (i_742_ & 0xff00ff) * i_876_ & ~0xff00ff;
						int i_878_ = (i_742_ & 0xff00) * i_876_ & 0xff0000;
						i_742_ = (i_877_ | i_878_) >>> 8;
						int i_879_ = i_745_;
						for (int i_880_ = -i_740_; i_880_ < 0; i_880_++) {
							int i_881_ = ((i_746_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_882_ = -i_739_; i_882_ < 0; i_882_++) {
								int i_883_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_745_ >> 16) + i_881_]);
								if (i_883_ != 0) {
									i_877_ = ((i_883_ & 0xff00ff) * i_875_ & ~0xff00ff);
									i_878_ = ((i_883_ & 0xff00) * i_875_ & 0xff0000);
									i_883_ = ((i_877_ | i_878_) >>> 8) + i_742_;
									int i_884_ = is[i_754_];
									int i_885_ = i_883_ + i_884_;
									int i_886_ = ((i_883_ & 0xff00ff) + (i_884_ & 0xff00ff));
									i_884_ = ((i_886_ & 0x1000100) + (i_885_ - i_886_ & 0x10000));
									is[i_754_++] = i_885_ - i_884_ | i_884_ - (i_884_ >>> 8);
								} else
									i_754_++;
								i_745_ += i_750_;
							}
							i_746_ += i_751_;
							i_745_ = i_879_;
							i_754_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2592(int i, int i_887_, int i_888_, int i_889_, int[] is, int[] is_890_, int i_891_, int i_892_) {
		method10191(i, i_887_, i_888_, i_889_, is, i_891_, i_892_);
	}

	Class161_Sub3_Sub3(Class106_Sub2 class106_sub2, int[] is, int i, int i_893_, int i_894_, int i_895_, boolean bool) {
		super(class106_sub2, i_894_, i_895_);
		if (bool)
			((Class161_Sub3_Sub3) this).anIntArray11238 = new int[i_894_ * i_895_];
		else
			((Class161_Sub3_Sub3) this).anIntArray11238 = is;
		i_893_ -= ((Class161_Sub3_Sub3) this).anInt10945;
		int i_896_ = 0;
		for (int i_897_ = 0; i_897_ < i_895_; i_897_++) {
			for (int i_898_ = 0; i_898_ < i_894_; i_898_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_896_++] = is[i++];
			i += i_893_;
		}
	}

	public void method2611(int i, int i_899_, int i_900_, int i_901_, int[] is, int[] is_902_, int i_903_, int i_904_) {
		method10191(i, i_899_, i_900_, i_901_, is, i_903_, i_904_);
	}

	public void method2612(int i, int i_905_, int i_906_, int i_907_, int i_908_, int i_909_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_910_ = 0; i_910_ < i_907_; i_910_++) {
			int i_911_ = (i_905_ + i_910_) * i_906_ + i;
			int i_912_ = (i_909_ + i_910_) * i_906_ + i_908_;
			for (int i_913_ = 0; i_913_ < i_906_; i_913_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_911_ + i_913_] = is[i_912_ + i_913_] & 0xffffff;
		}
	}

	public void method2613(int i, int i_914_, int i_915_, int i_916_, int i_917_, int i_918_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_919_ = 0; i_919_ < i_916_; i_919_++) {
			int i_920_ = (i_914_ + i_919_) * i_915_ + i;
			int i_921_ = (i_918_ + i_919_) * i_915_ + i_917_;
			for (int i_922_ = 0; i_922_ < i_915_; i_922_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_920_ + i_922_] = is[i_921_ + i_922_] & 0xffffff;
		}
	}

	public void method2601(int i, int i_923_, int i_924_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		if (i_924_ == 0) {
			for (int i_925_ = 0; i_925_ < ((Class161_Sub3_Sub3) this).anInt10930; i_925_++) {
				int i_926_ = i_925_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_927_ = (((i_923_ + i_925_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_928_ = 0; i_928_ < ((Class161_Sub3_Sub3) this).anInt10945; i_928_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_926_ + i_928_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_926_ + i_928_]) & 0xffffff | is[i_927_ + i_928_] << 8 & ~0xffffff);
			}
		} else if (i_924_ == 1) {
			for (int i_929_ = 0; i_929_ < ((Class161_Sub3_Sub3) this).anInt10930; i_929_++) {
				int i_930_ = i_929_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_931_ = (((i_923_ + i_929_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_932_ = 0; i_932_ < ((Class161_Sub3_Sub3) this).anInt10945; i_932_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_930_ + i_932_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_930_ + i_932_]) & 0xffffff | is[i_931_ + i_932_] << 16 & ~0xffffff);
			}
		} else if (i_924_ == 2) {
			for (int i_933_ = 0; i_933_ < ((Class161_Sub3_Sub3) this).anInt10930; i_933_++) {
				int i_934_ = i_933_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_935_ = (((i_923_ + i_933_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_936_ = 0; i_936_ < ((Class161_Sub3_Sub3) this).anInt10945; i_936_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_934_ + i_936_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_934_ + i_936_]) & 0xffffff | is[i_935_ + i_936_] << 24 & ~0xffffff);
			}
		} else if (i_924_ == 3) {
			for (int i_937_ = 0; i_937_ < ((Class161_Sub3_Sub3) this).anInt10930; i_937_++) {
				int i_938_ = i_937_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_939_ = (((i_923_ + i_937_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_940_ = 0; i_940_ < ((Class161_Sub3_Sub3) this).anInt10945; i_940_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_938_ + i_940_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_938_ + i_940_]) & 0xffffff | (is[i_939_ + i_940_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2615(int i, int i_941_, int i_942_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		if (i_942_ == 0) {
			for (int i_943_ = 0; i_943_ < ((Class161_Sub3_Sub3) this).anInt10930; i_943_++) {
				int i_944_ = i_943_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_945_ = (((i_941_ + i_943_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_946_ = 0; i_946_ < ((Class161_Sub3_Sub3) this).anInt10945; i_946_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_944_ + i_946_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_944_ + i_946_]) & 0xffffff | is[i_945_ + i_946_] << 8 & ~0xffffff);
			}
		} else if (i_942_ == 1) {
			for (int i_947_ = 0; i_947_ < ((Class161_Sub3_Sub3) this).anInt10930; i_947_++) {
				int i_948_ = i_947_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_949_ = (((i_941_ + i_947_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_950_ = 0; i_950_ < ((Class161_Sub3_Sub3) this).anInt10945; i_950_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_948_ + i_950_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_948_ + i_950_]) & 0xffffff | is[i_949_ + i_950_] << 16 & ~0xffffff);
			}
		} else if (i_942_ == 2) {
			for (int i_951_ = 0; i_951_ < ((Class161_Sub3_Sub3) this).anInt10930; i_951_++) {
				int i_952_ = i_951_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_953_ = (((i_941_ + i_951_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_954_ = 0; i_954_ < ((Class161_Sub3_Sub3) this).anInt10945; i_954_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_952_ + i_954_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_952_ + i_954_]) & 0xffffff | is[i_953_ + i_954_] << 24 & ~0xffffff);
			}
		} else if (i_942_ == 3) {
			for (int i_955_ = 0; i_955_ < ((Class161_Sub3_Sub3) this).anInt10930; i_955_++) {
				int i_956_ = i_955_ * ((Class161_Sub3_Sub3) this).anInt10945;
				int i_957_ = (((i_941_ + i_955_) * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113)) + i);
				for (int i_958_ = 0; i_958_ < ((Class161_Sub3_Sub3) this).anInt10945; i_958_++)
					((Class161_Sub3_Sub3) this).anIntArray11238[(i_956_ + i_958_)] = ((((Class161_Sub3_Sub3) this).anIntArray11238[i_956_ + i_958_]) & 0xffffff | (is[i_957_ + i_958_] != 0 ? -16777216 : 0));
			}
		}
	}

	void method2622(int i, int i_959_, int i_960_, int i_961_, int i_962_, int i_963_, int i_964_, int i_965_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_960_ > 0 && i_961_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_966_ = 0;
				int i_967_ = 0;
				int i_968_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_969_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_970_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_971_ = (i_969_ << 16) / i_960_;
				int i_972_ = (i_970_ << 16) / i_961_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_973_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_971_ - 1) / i_971_);
					i += i_973_;
					i_966_ += (i_973_ * i_971_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_974_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_972_ - 1) / i_972_);
					i_959_ += i_974_;
					i_967_ += (i_974_ * i_972_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_969_)
					i_960_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_966_ + i_971_ - 1) / i_971_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_970_)
					i_961_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_967_ + i_972_ - 1) / i_972_;
				int i_975_ = i + i_959_ * i_968_;
				int i_976_ = i_968_ - i_960_;
				if (i_959_ + i_961_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_961_ -= (i_959_ + i_961_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_959_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_977_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_959_;
					i_961_ -= i_977_;
					i_975_ += i_977_ * i_968_;
					i_967_ += i_972_ * i_977_;
				}
				if (i + i_960_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
					int i_978_ = (i + i_960_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_960_ -= i_978_;
					i_976_ += i_978_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_979_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i;
					i_960_ -= i_979_;
					i_975_ += i_979_;
					i_966_ += i_971_ * i_979_;
					i_976_ += i_979_;
				}
				if (i_964_ == 0) {
					if (i_962_ == 1) {
						int i_980_ = i_966_;
						for (int i_981_ = -i_961_; i_981_ < 0; i_981_++) {
							int i_982_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_983_ = -i_960_; i_983_ < 0; i_983_++) {
								is[i_975_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_982_]);
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_980_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 0) {
						int i_984_ = (i_963_ & 0xff0000) >> 16;
						int i_985_ = (i_963_ & 0xff00) >> 8;
						int i_986_ = i_963_ & 0xff;
						int i_987_ = i_966_;
						for (int i_988_ = -i_961_; i_988_ < 0; i_988_++) {
							int i_989_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_990_ = -i_960_; i_990_ < 0; i_990_++) {
								int i_991_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_989_]);
								int i_992_ = (i_991_ & 0xff0000) * i_984_ & ~0xffffff;
								int i_993_ = (i_991_ & 0xff00) * i_985_ & 0xff0000;
								int i_994_ = (i_991_ & 0xff) * i_986_ & 0xff00;
								is[i_975_++] = (i_992_ | i_993_ | i_994_) >>> 8;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_987_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 3) {
						int i_995_ = i_966_;
						for (int i_996_ = -i_961_; i_996_ < 0; i_996_++) {
							int i_997_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_998_ = -i_960_; i_998_ < 0; i_998_++) {
								int i_999_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_997_]);
								int i_1000_ = i_999_ + i_963_;
								int i_1001_ = ((i_999_ & 0xff00ff) + (i_963_ & 0xff00ff));
								int i_1002_ = ((i_1001_ & 0x1000100) + (i_1000_ - i_1001_ & 0x10000));
								is[i_975_++] = i_1000_ - i_1002_ | i_1002_ - (i_1002_ >>> 8);
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_995_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 2) {
						int i_1003_ = i_963_ >>> 24;
						int i_1004_ = 256 - i_1003_;
						int i_1005_ = (i_963_ & 0xff00ff) * i_1004_ & ~0xff00ff;
						int i_1006_ = (i_963_ & 0xff00) * i_1004_ & 0xff0000;
						i_963_ = (i_1005_ | i_1006_) >>> 8;
						int i_1007_ = i_966_;
						for (int i_1008_ = -i_961_; i_1008_ < 0; i_1008_++) {
							int i_1009_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1010_ = -i_960_; i_1010_ < 0; i_1010_++) {
								int i_1011_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1009_]);
								i_1005_ = ((i_1011_ & 0xff00ff) * i_1003_ & ~0xff00ff);
								i_1006_ = (i_1011_ & 0xff00) * i_1003_ & 0xff0000;
								is[i_975_++] = ((i_1005_ | i_1006_) >>> 8) + i_963_;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1007_;
							i_975_ += i_976_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_964_ == 1) {
					if (i_962_ == 1) {
						int i_1012_ = i_966_;
						for (int i_1013_ = -i_961_; i_1013_ < 0; i_1013_++) {
							int i_1014_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1015_ = -i_960_; i_1015_ < 0; i_1015_++) {
								int i_1016_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1014_]);
								int i_1017_ = i_1016_ >>> 24;
								int i_1018_ = 256 - i_1017_;
								int i_1019_ = is[i_975_];
								is[i_975_++] = (((((i_1016_ & 0xff00ff) * i_1017_ + (i_1019_ & 0xff00ff) * i_1018_) & ~0xff00ff) >> 8) + (((((i_1016_ & ~0xff00ff) >>> 8) * i_1017_) + (((i_1019_ & ~0xff00ff) >>> 8) * i_1018_)) & ~0xff00ff));
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1012_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 0) {
						int i_1020_ = i_966_;
						if ((i_963_ & 0xffffff) == 16777215) {
							for (int i_1021_ = -i_961_; i_1021_ < 0; i_1021_++) {
								int i_1022_ = ((i_967_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_1023_ = -i_960_; i_1023_ < 0; i_1023_++) {
									int i_1024_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1022_]);
									int i_1025_ = ((i_1024_ >>> 24) * (i_963_ >>> 24) >> 8);
									int i_1026_ = 256 - i_1025_;
									int i_1027_ = is[i_975_];
									is[i_975_++] = ((((i_1024_ & 0xff00ff) * i_1025_ + (i_1027_ & 0xff00ff) * i_1026_) & ~0xff00ff) + (((i_1024_ & 0xff00) * i_1025_ + (i_1027_ & 0xff00) * i_1026_) & 0xff0000)) >> 8;
									i_966_ += i_971_;
								}
								i_967_ += i_972_;
								i_966_ = i_1020_;
								i_975_ += i_976_;
							}
						} else {
							int i_1028_ = (i_963_ & 0xff0000) >> 16;
							int i_1029_ = (i_963_ & 0xff00) >> 8;
							int i_1030_ = i_963_ & 0xff;
							for (int i_1031_ = -i_961_; i_1031_ < 0; i_1031_++) {
								int i_1032_ = ((i_967_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_1033_ = -i_960_; i_1033_ < 0; i_1033_++) {
									int i_1034_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1032_]);
									int i_1035_ = ((i_1034_ >>> 24) * (i_963_ >>> 24) >> 8);
									int i_1036_ = 256 - i_1035_;
									if (i_1035_ != 255) {
										int i_1037_ = ((i_1034_ & 0xff0000) * i_1028_ & ~0xffffff);
										int i_1038_ = ((i_1034_ & 0xff00) * i_1029_ & 0xff0000);
										int i_1039_ = ((i_1034_ & 0xff) * i_1030_ & 0xff00);
										i_1034_ = (i_1037_ | i_1038_ | i_1039_) >>> 8;
										int i_1040_ = is[i_975_];
										is[i_975_++] = ((((i_1034_ & 0xff00ff) * i_1035_ + ((i_1040_ & 0xff00ff) * i_1036_)) & ~0xff00ff) + (((i_1034_ & 0xff00) * i_1035_ + ((i_1040_ & 0xff00) * i_1036_)) & 0xff0000)) >> 8;
									} else {
										int i_1041_ = ((i_1034_ & 0xff0000) * i_1028_ & ~0xffffff);
										int i_1042_ = ((i_1034_ & 0xff00) * i_1029_ & 0xff0000);
										int i_1043_ = ((i_1034_ & 0xff) * i_1030_ & 0xff00);
										is[i_975_++] = (i_1041_ | i_1042_ | i_1043_) >>> 8;
									}
									i_966_ += i_971_;
								}
								i_967_ += i_972_;
								i_966_ = i_1020_;
								i_975_ += i_976_;
							}
						}
					} else if (i_962_ == 3) {
						int i_1044_ = i_966_;
						for (int i_1045_ = -i_961_; i_1045_ < 0; i_1045_++) {
							int i_1046_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1047_ = -i_960_; i_1047_ < 0; i_1047_++) {
								int i_1048_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1046_]);
								int i_1049_ = i_1048_ + i_963_;
								int i_1050_ = ((i_1048_ & 0xff00ff) + (i_963_ & 0xff00ff));
								int i_1051_ = ((i_1050_ & 0x1000100) + (i_1049_ - i_1050_ & 0x10000));
								i_1051_ = i_1049_ - i_1051_ | i_1051_ - (i_1051_ >>> 8);
								int i_1052_ = (i_1051_ >>> 24) * (i_963_ >>> 24) >> 8;
								int i_1053_ = 256 - i_1052_;
								if (i_1052_ != 255) {
									i_1048_ = i_1051_;
									i_1051_ = is[i_975_];
									i_1051_ = ((((i_1048_ & 0xff00ff) * i_1052_ + (i_1051_ & 0xff00ff) * i_1053_) & ~0xff00ff) + (((i_1048_ & 0xff00) * i_1052_ + (i_1051_ & 0xff00) * i_1053_) & 0xff0000)) >> 8;
								}
								is[i_975_++] = i_1051_;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1044_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 2) {
						int i_1054_ = i_963_ >>> 24;
						int i_1055_ = 256 - i_1054_;
						int i_1056_ = (i_963_ & 0xff00ff) * i_1055_ & ~0xff00ff;
						int i_1057_ = (i_963_ & 0xff00) * i_1055_ & 0xff0000;
						i_963_ = (i_1056_ | i_1057_) >>> 8;
						int i_1058_ = i_966_;
						for (int i_1059_ = -i_961_; i_1059_ < 0; i_1059_++) {
							int i_1060_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1061_ = -i_960_; i_1061_ < 0; i_1061_++) {
								int i_1062_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1060_]);
								int i_1063_ = i_1062_ >>> 24;
								int i_1064_ = 256 - i_1063_;
								i_1056_ = ((i_1062_ & 0xff00ff) * i_1054_ & ~0xff00ff);
								i_1057_ = (i_1062_ & 0xff00) * i_1054_ & 0xff0000;
								i_1062_ = ((i_1056_ | i_1057_) >>> 8) + i_963_;
								int i_1065_ = is[i_975_];
								is[i_975_++] = ((((i_1062_ & 0xff00ff) * i_1063_ + (i_1065_ & 0xff00ff) * i_1064_) & ~0xff00ff) + (((i_1062_ & 0xff00) * i_1063_ + (i_1065_ & 0xff00) * i_1064_) & 0xff0000)) >> 8;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1058_;
							i_975_ += i_976_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_964_ == 2) {
					if (i_962_ == 1) {
						int i_1066_ = i_966_;
						for (int i_1067_ = -i_961_; i_1067_ < 0; i_1067_++) {
							int i_1068_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1069_ = -i_960_; i_1069_ < 0; i_1069_++) {
								int i_1070_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1068_]);
								if (i_1070_ != 0) {
									int i_1071_ = is[i_975_];
									int i_1072_ = i_1070_ + i_1071_;
									int i_1073_ = ((i_1070_ & 0xff00ff) + (i_1071_ & 0xff00ff));
									i_1071_ = ((i_1073_ & 0x1000100) + (i_1072_ - i_1073_ & 0x10000));
									is[i_975_++] = (i_1072_ - i_1071_ | i_1071_ - (i_1071_ >>> 8));
								} else
									i_975_++;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1066_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 0) {
						int i_1074_ = i_966_;
						int i_1075_ = (i_963_ & 0xff0000) >> 16;
						int i_1076_ = (i_963_ & 0xff00) >> 8;
						int i_1077_ = i_963_ & 0xff;
						for (int i_1078_ = -i_961_; i_1078_ < 0; i_1078_++) {
							int i_1079_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1080_ = -i_960_; i_1080_ < 0; i_1080_++) {
								int i_1081_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1079_]);
								if (i_1081_ != 0) {
									int i_1082_ = ((i_1081_ & 0xff0000) * i_1075_ & ~0xffffff);
									int i_1083_ = ((i_1081_ & 0xff00) * i_1076_ & 0xff0000);
									int i_1084_ = (i_1081_ & 0xff) * i_1077_ & 0xff00;
									i_1081_ = (i_1082_ | i_1083_ | i_1084_) >>> 8;
									int i_1085_ = is[i_975_];
									int i_1086_ = i_1081_ + i_1085_;
									int i_1087_ = ((i_1081_ & 0xff00ff) + (i_1085_ & 0xff00ff));
									i_1085_ = ((i_1087_ & 0x1000100) + (i_1086_ - i_1087_ & 0x10000));
									is[i_975_++] = (i_1086_ - i_1085_ | i_1085_ - (i_1085_ >>> 8));
								} else
									i_975_++;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1074_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 3) {
						int i_1088_ = i_966_;
						for (int i_1089_ = -i_961_; i_1089_ < 0; i_1089_++) {
							int i_1090_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1091_ = -i_960_; i_1091_ < 0; i_1091_++) {
								int i_1092_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1090_]);
								int i_1093_ = i_1092_ + i_963_;
								int i_1094_ = ((i_1092_ & 0xff00ff) + (i_963_ & 0xff00ff));
								int i_1095_ = ((i_1094_ & 0x1000100) + (i_1093_ - i_1094_ & 0x10000));
								i_1092_ = i_1093_ - i_1095_ | i_1095_ - (i_1095_ >>> 8);
								i_1095_ = is[i_975_];
								i_1093_ = i_1092_ + i_1095_;
								i_1094_ = (i_1092_ & 0xff00ff) + (i_1095_ & 0xff00ff);
								i_1095_ = ((i_1094_ & 0x1000100) + (i_1093_ - i_1094_ & 0x10000));
								is[i_975_++] = i_1093_ - i_1095_ | i_1095_ - (i_1095_ >>> 8);
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1088_;
							i_975_ += i_976_;
						}
					} else if (i_962_ == 2) {
						int i_1096_ = i_963_ >>> 24;
						int i_1097_ = 256 - i_1096_;
						int i_1098_ = (i_963_ & 0xff00ff) * i_1097_ & ~0xff00ff;
						int i_1099_ = (i_963_ & 0xff00) * i_1097_ & 0xff0000;
						i_963_ = (i_1098_ | i_1099_) >>> 8;
						int i_1100_ = i_966_;
						for (int i_1101_ = -i_961_; i_1101_ < 0; i_1101_++) {
							int i_1102_ = ((i_967_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1103_ = -i_960_; i_1103_ < 0; i_1103_++) {
								int i_1104_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_966_ >> 16) + i_1102_]);
								if (i_1104_ != 0) {
									i_1098_ = ((i_1104_ & 0xff00ff) * i_1096_ & ~0xff00ff);
									i_1099_ = ((i_1104_ & 0xff00) * i_1096_ & 0xff0000);
									i_1104_ = ((i_1098_ | i_1099_) >>> 8) + i_963_;
									int i_1105_ = is[i_975_];
									int i_1106_ = i_1104_ + i_1105_;
									int i_1107_ = ((i_1104_ & 0xff00ff) + (i_1105_ & 0xff00ff));
									i_1105_ = ((i_1107_ & 0x1000100) + (i_1106_ - i_1107_ & 0x10000));
									is[i_975_++] = (i_1106_ - i_1105_ | i_1105_ - (i_1105_ >>> 8));
								} else
									i_975_++;
								i_966_ += i_971_;
							}
							i_967_ += i_972_;
							i_966_ = i_1100_;
							i_975_ += i_976_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10059(int[] is, int[] is_1108_, int i, int i_1109_) {
		int[] is_1110_ = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_1110_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_1111_ = anInt10940;
					while (i_1111_ < 0) {
						int i_1112_ = i_1111_ + i_1109_;
						if (i_1112_ >= 0) {
							if (i_1112_ >= is.length)
								break;
							int i_1113_ = anInt10944;
							int i_1114_ = anInt10951;
							int i_1115_ = anInt10952;
							int i_1116_ = anInt10958;
							if (i_1114_ >= 0 && i_1115_ >= 0 && (i_1114_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_1115_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
								int i_1117_ = is[i_1112_] - i;
								int i_1118_ = -is_1108_[i_1112_];
								int i_1119_ = i_1117_ - (i_1113_ - anInt10944);
								if (i_1119_ > 0) {
									i_1113_ += i_1119_;
									i_1116_ += i_1119_;
									i_1114_ += anInt10956 * i_1119_;
									i_1115_ += anInt10946 * i_1119_;
								} else
									i_1118_ -= i_1119_;
								if (i_1116_ < i_1118_)
									i_1116_ = i_1118_;
								for (/**/; i_1116_ < 0; i_1116_++) {
									int i_1120_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1115_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1114_ >> 12))]);
									int i_1121_ = i_1120_ >>> 24;
									int i_1122_ = 256 - i_1121_;
									int i_1123_ = is_1110_[i_1113_];
									is_1110_[i_1113_++] = ((((i_1120_ & 0xff00ff) * i_1121_ + (i_1123_ & 0xff00ff) * i_1122_) & ~0xff00ff) + (((i_1120_ & 0xff00) * i_1121_ + (i_1123_ & 0xff00) * i_1122_) & 0xff0000)) >> 8;
								}
							}
						}
						i_1111_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1124_ = anInt10940;
					while (i_1124_ < 0) {
						int i_1125_ = i_1124_ + i_1109_;
						if (i_1125_ >= 0) {
							if (i_1125_ >= is.length)
								break;
							int i_1126_ = anInt10944;
							int i_1127_ = anInt10951;
							int i_1128_ = anInt10952 + anInt10954;
							int i_1129_ = anInt10958;
							if (i_1127_ >= 0 && (i_1127_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
								int i_1130_;
								if ((i_1130_ = i_1128_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
									i_1130_ = (anInt10946 - i_1130_) / anInt10946;
									i_1129_ += i_1130_;
									i_1128_ += anInt10946 * i_1130_;
									i_1126_ += i_1130_;
								}
								if ((i_1130_ = (i_1128_ - anInt10946) / anInt10946) > i_1129_)
									i_1129_ = i_1130_;
								int i_1131_ = is[i_1125_] - i;
								int i_1132_ = -is_1108_[i_1125_];
								int i_1133_ = i_1131_ - (i_1126_ - anInt10944);
								if (i_1133_ > 0) {
									i_1126_ += i_1133_;
									i_1129_ += i_1133_;
									i_1127_ += anInt10956 * i_1133_;
									i_1128_ += anInt10946 * i_1133_;
								} else
									i_1132_ -= i_1133_;
								if (i_1129_ < i_1132_)
									i_1129_ = i_1132_;
								for (/**/; i_1129_ < 0; i_1129_++) {
									int i_1134_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1128_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1127_ >> 12))]);
									int i_1135_ = i_1134_ >>> 24;
									int i_1136_ = 256 - i_1135_;
									int i_1137_ = is_1110_[i_1126_];
									is_1110_[i_1126_++] = ((((i_1134_ & 0xff00ff) * i_1135_ + (i_1137_ & 0xff00ff) * i_1136_) & ~0xff00ff) + (((i_1134_ & 0xff00) * i_1135_ + (i_1137_ & 0xff00) * i_1136_) & 0xff0000)) >> 8;
									i_1128_ += anInt10946;
								}
							}
						}
						i_1124_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1138_ = anInt10940;
					while (i_1138_ < 0) {
						int i_1139_ = i_1138_ + i_1109_;
						if (i_1139_ >= 0) {
							if (i_1139_ >= is.length)
								break;
							int i_1140_ = anInt10944;
							int i_1141_ = anInt10951;
							int i_1142_ = anInt10952 + anInt10954;
							int i_1143_ = anInt10958;
							if (i_1141_ >= 0 && (i_1141_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
								if (i_1142_ < 0) {
									int i_1144_ = ((anInt10946 - 1 - i_1142_) / anInt10946);
									i_1143_ += i_1144_;
									i_1142_ += anInt10946 * i_1144_;
									i_1140_ += i_1144_;
								}
								int i_1145_;
								if ((i_1145_ = (1 + i_1142_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_1143_)
									i_1143_ = i_1145_;
								int i_1146_ = is[i_1139_] - i;
								int i_1147_ = -is_1108_[i_1139_];
								int i_1148_ = i_1146_ - (i_1140_ - anInt10944);
								if (i_1148_ > 0) {
									i_1140_ += i_1148_;
									i_1143_ += i_1148_;
									i_1141_ += anInt10956 * i_1148_;
									i_1142_ += anInt10946 * i_1148_;
								} else
									i_1147_ -= i_1148_;
								if (i_1143_ < i_1147_)
									i_1143_ = i_1147_;
								for (/**/; i_1143_ < 0; i_1143_++) {
									int i_1149_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1142_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1141_ >> 12))]);
									int i_1150_ = i_1149_ >>> 24;
									int i_1151_ = 256 - i_1150_;
									int i_1152_ = is_1110_[i_1140_];
									is_1110_[i_1140_++] = ((((i_1149_ & 0xff00ff) * i_1150_ + (i_1152_ & 0xff00ff) * i_1151_) & ~0xff00ff) + (((i_1149_ & 0xff00) * i_1150_ + (i_1152_ & 0xff00) * i_1151_) & 0xff0000)) >> 8;
									i_1142_ += anInt10946;
								}
							}
						}
						i_1138_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_1153_ = anInt10940;
					while (i_1153_ < 0) {
						int i_1154_ = i_1153_ + i_1109_;
						if (i_1154_ >= 0) {
							if (i_1154_ >= is.length)
								break;
							int i_1155_ = anInt10944;
							int i_1156_ = anInt10951 + anInt10953;
							int i_1157_ = anInt10952;
							int i_1158_ = anInt10958;
							if (i_1157_ >= 0 && (i_1157_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
								int i_1159_;
								if ((i_1159_ = i_1156_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
									i_1159_ = (anInt10956 - i_1159_) / anInt10956;
									i_1158_ += i_1159_;
									i_1156_ += anInt10956 * i_1159_;
									i_1155_ += i_1159_;
								}
								if ((i_1159_ = (i_1156_ - anInt10956) / anInt10956) > i_1158_)
									i_1158_ = i_1159_;
								int i_1160_ = is[i_1154_] - i;
								int i_1161_ = -is_1108_[i_1154_];
								int i_1162_ = i_1160_ - (i_1155_ - anInt10944);
								if (i_1162_ > 0) {
									i_1155_ += i_1162_;
									i_1158_ += i_1162_;
									i_1156_ += anInt10956 * i_1162_;
									i_1157_ += anInt10946 * i_1162_;
								} else
									i_1161_ -= i_1162_;
								if (i_1158_ < i_1161_)
									i_1158_ = i_1161_;
								for (/**/; i_1158_ < 0; i_1158_++) {
									int i_1163_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1157_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1156_ >> 12))]);
									int i_1164_ = i_1163_ >>> 24;
									int i_1165_ = 256 - i_1164_;
									int i_1166_ = is_1110_[i_1155_];
									is_1110_[i_1155_++] = ((((i_1163_ & 0xff00ff) * i_1164_ + (i_1166_ & 0xff00ff) * i_1165_) & ~0xff00ff) + (((i_1163_ & 0xff00) * i_1164_ + (i_1166_ & 0xff00) * i_1165_) & 0xff0000)) >> 8;
									i_1156_ += anInt10956;
								}
							}
						}
						i_1153_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1167_ = anInt10940;
					while (i_1167_ < 0) {
						int i_1168_ = i_1167_ + i_1109_;
						if (i_1168_ >= 0) {
							if (i_1168_ >= is.length)
								break;
							int i_1169_ = anInt10944;
							int i_1170_ = anInt10951 + anInt10953;
							int i_1171_ = anInt10952 + anInt10954;
							int i_1172_ = anInt10958;
							int i_1173_;
							if ((i_1173_ = (i_1170_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_1173_ = (anInt10956 - i_1173_) / anInt10956;
								i_1172_ += i_1173_;
								i_1170_ += anInt10956 * i_1173_;
								i_1171_ += anInt10946 * i_1173_;
								i_1169_ += i_1173_;
							}
							if ((i_1173_ = (i_1170_ - anInt10956) / anInt10956) > i_1172_)
								i_1172_ = i_1173_;
							if ((i_1173_ = (i_1171_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_1173_ = (anInt10946 - i_1173_) / anInt10946;
								i_1172_ += i_1173_;
								i_1170_ += anInt10956 * i_1173_;
								i_1171_ += anInt10946 * i_1173_;
								i_1169_ += i_1173_;
							}
							if ((i_1173_ = (i_1171_ - anInt10946) / anInt10946) > i_1172_)
								i_1172_ = i_1173_;
							int i_1174_ = is[i_1168_] - i;
							int i_1175_ = -is_1108_[i_1168_];
							int i_1176_ = i_1174_ - (i_1169_ - anInt10944);
							if (i_1176_ > 0) {
								i_1169_ += i_1176_;
								i_1172_ += i_1176_;
								i_1170_ += anInt10956 * i_1176_;
								i_1171_ += anInt10946 * i_1176_;
							} else
								i_1175_ -= i_1176_;
							if (i_1172_ < i_1175_)
								i_1172_ = i_1175_;
							for (/**/; i_1172_ < 0; i_1172_++) {
								int i_1177_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_1171_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1170_ >> 12)]);
								int i_1178_ = i_1177_ >>> 24;
								int i_1179_ = 256 - i_1178_;
								int i_1180_ = is_1110_[i_1169_];
								is_1110_[i_1169_++] = ((((i_1177_ & 0xff00ff) * i_1178_ + (i_1180_ & 0xff00ff) * i_1179_) & ~0xff00ff) + (((i_1177_ & 0xff00) * i_1178_ + (i_1180_ & 0xff00) * i_1179_) & 0xff0000)) >> 8;
								i_1170_ += anInt10956;
								i_1171_ += anInt10946;
							}
						}
						i_1167_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1181_ = anInt10940;
					while (i_1181_ < 0) {
						int i_1182_ = i_1181_ + i_1109_;
						if (i_1182_ >= 0) {
							if (i_1182_ >= is.length)
								break;
							int i_1183_ = anInt10944;
							int i_1184_ = anInt10951 + anInt10953;
							int i_1185_ = anInt10952 + anInt10954;
							int i_1186_ = anInt10958;
							int i_1187_;
							if ((i_1187_ = (i_1184_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_1187_ = (anInt10956 - i_1187_) / anInt10956;
								i_1186_ += i_1187_;
								i_1184_ += anInt10956 * i_1187_;
								i_1185_ += anInt10946 * i_1187_;
								i_1183_ += i_1187_;
							}
							if ((i_1187_ = (i_1184_ - anInt10956) / anInt10956) > i_1186_)
								i_1186_ = i_1187_;
							if (i_1185_ < 0) {
								i_1187_ = (anInt10946 - 1 - i_1185_) / anInt10946;
								i_1186_ += i_1187_;
								i_1184_ += anInt10956 * i_1187_;
								i_1185_ += anInt10946 * i_1187_;
								i_1183_ += i_1187_;
							}
							if ((i_1187_ = (1 + i_1185_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1186_)
								i_1186_ = i_1187_;
							int i_1188_ = is[i_1182_] - i;
							int i_1189_ = -is_1108_[i_1182_];
							int i_1190_ = i_1188_ - (i_1183_ - anInt10944);
							if (i_1190_ > 0) {
								i_1183_ += i_1190_;
								i_1186_ += i_1190_;
								i_1184_ += anInt10956 * i_1190_;
								i_1185_ += anInt10946 * i_1190_;
							} else
								i_1189_ -= i_1190_;
							if (i_1186_ < i_1189_)
								i_1186_ = i_1189_;
							for (/**/; i_1186_ < 0; i_1186_++) {
								int i_1191_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_1185_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1184_ >> 12)]);
								int i_1192_ = i_1191_ >>> 24;
								int i_1193_ = 256 - i_1192_;
								int i_1194_ = is_1110_[i_1183_];
								is_1110_[i_1183_++] = ((((i_1191_ & 0xff00ff) * i_1192_ + (i_1194_ & 0xff00ff) * i_1193_) & ~0xff00ff) + (((i_1191_ & 0xff00) * i_1192_ + (i_1194_ & 0xff00) * i_1193_) & 0xff0000)) >> 8;
								i_1184_ += anInt10956;
								i_1185_ += anInt10946;
							}
						}
						i_1181_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_1195_ = anInt10940;
				while (i_1195_ < 0) {
					int i_1196_ = i_1195_ + i_1109_;
					if (i_1196_ >= 0) {
						if (i_1196_ >= is.length)
							break;
						int i_1197_ = anInt10944;
						int i_1198_ = anInt10951 + anInt10953;
						int i_1199_ = anInt10952;
						int i_1200_ = anInt10958;
						if (i_1199_ >= 0 && (i_1199_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							if (i_1198_ < 0) {
								int i_1201_ = (anInt10956 - 1 - i_1198_) / anInt10956;
								i_1200_ += i_1201_;
								i_1198_ += anInt10956 * i_1201_;
								i_1197_ += i_1201_;
							}
							int i_1202_;
							if ((i_1202_ = (1 + i_1198_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1200_)
								i_1200_ = i_1202_;
							int i_1203_ = is[i_1196_] - i;
							int i_1204_ = -is_1108_[i_1196_];
							int i_1205_ = i_1203_ - (i_1197_ - anInt10944);
							if (i_1205_ > 0) {
								i_1197_ += i_1205_;
								i_1200_ += i_1205_;
								i_1198_ += anInt10956 * i_1205_;
								i_1199_ += anInt10946 * i_1205_;
							} else
								i_1204_ -= i_1205_;
							if (i_1200_ < i_1204_)
								i_1200_ = i_1204_;
							for (/**/; i_1200_ < 0; i_1200_++) {
								int i_1206_ = (((Class161_Sub3_Sub3) this).anIntArray11238[((i_1199_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_1198_ >> 12)]);
								int i_1207_ = i_1206_ >>> 24;
								int i_1208_ = 256 - i_1207_;
								int i_1209_ = is_1110_[i_1197_];
								is_1110_[i_1197_++] = ((((i_1206_ & 0xff00ff) * i_1207_ + (i_1209_ & 0xff00ff) * i_1208_) & ~0xff00ff) + (((i_1206_ & 0xff00) * i_1207_ + (i_1209_ & 0xff00) * i_1208_) & 0xff0000)) >> 8;
								i_1198_ += anInt10956;
							}
						}
					}
					i_1195_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_1210_ = anInt10940;
				while (i_1210_ < 0) {
					int i_1211_ = i_1210_ + i_1109_;
					if (i_1211_ >= 0) {
						if (i_1211_ >= is.length)
							break;
						int i_1212_ = anInt10944;
						int i_1213_ = anInt10951 + anInt10953;
						int i_1214_ = anInt10952 + anInt10954;
						int i_1215_ = anInt10958;
						if (i_1213_ < 0) {
							int i_1216_ = (anInt10956 - 1 - i_1213_) / anInt10956;
							i_1215_ += i_1216_;
							i_1213_ += anInt10956 * i_1216_;
							i_1214_ += anInt10946 * i_1216_;
							i_1212_ += i_1216_;
						}
						int i_1217_;
						if ((i_1217_ = (1 + i_1213_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1215_)
							i_1215_ = i_1217_;
						if ((i_1217_ = i_1214_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
							i_1217_ = (anInt10946 - i_1217_) / anInt10946;
							i_1215_ += i_1217_;
							i_1213_ += anInt10956 * i_1217_;
							i_1214_ += anInt10946 * i_1217_;
							i_1212_ += i_1217_;
						}
						if ((i_1217_ = (i_1214_ - anInt10946) / anInt10946) > i_1215_)
							i_1215_ = i_1217_;
						int i_1218_ = is[i_1211_] - i;
						int i_1219_ = -is_1108_[i_1211_];
						int i_1220_ = i_1218_ - (i_1212_ - anInt10944);
						if (i_1220_ > 0) {
							i_1212_ += i_1220_;
							i_1215_ += i_1220_;
							i_1213_ += anInt10956 * i_1220_;
							i_1214_ += anInt10946 * i_1220_;
						} else
							i_1219_ -= i_1220_;
						if (i_1215_ < i_1219_)
							i_1215_ = i_1219_;
						for (/**/; i_1215_ < 0; i_1215_++) {
							int i_1221_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1214_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_1213_ >> 12))]);
							int i_1222_ = i_1221_ >>> 24;
							int i_1223_ = 256 - i_1222_;
							int i_1224_ = is_1110_[i_1212_];
							is_1110_[i_1212_++] = ((((i_1221_ & 0xff00ff) * i_1222_ + (i_1224_ & 0xff00ff) * i_1223_) & ~0xff00ff) + (((i_1221_ & 0xff00) * i_1222_ + (i_1224_ & 0xff00) * i_1223_) & 0xff0000)) >> 8;
							i_1213_ += anInt10956;
							i_1214_ += anInt10946;
						}
					}
					i_1210_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				int i_1225_ = anInt10940;
				while (i_1225_ < 0) {
					int i_1226_ = i_1225_ + i_1109_;
					if (i_1226_ >= 0) {
						if (i_1226_ >= is.length)
							break;
						int i_1227_ = anInt10944;
						int i_1228_ = anInt10951 + anInt10953;
						int i_1229_ = anInt10952 + anInt10954;
						int i_1230_ = anInt10958;
						if (i_1228_ < 0) {
							int i_1231_ = (anInt10956 - 1 - i_1228_) / anInt10956;
							i_1230_ += i_1231_;
							i_1228_ += anInt10956 * i_1231_;
							i_1229_ += anInt10946 * i_1231_;
							i_1227_ += i_1231_;
						}
						int i_1232_;
						if ((i_1232_ = (1 + i_1228_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1230_)
							i_1230_ = i_1232_;
						if (i_1229_ < 0) {
							i_1232_ = (anInt10946 - 1 - i_1229_) / anInt10946;
							i_1230_ += i_1232_;
							i_1228_ += anInt10956 * i_1232_;
							i_1229_ += anInt10946 * i_1232_;
							i_1227_ += i_1232_;
						}
						if ((i_1232_ = (1 + i_1229_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1230_)
							i_1230_ = i_1232_;
						int i_1233_ = is[i_1226_] - i;
						int i_1234_ = -is_1108_[i_1226_];
						int i_1235_ = i_1233_ - (i_1227_ - anInt10944);
						if (i_1235_ > 0) {
							i_1227_ += i_1235_;
							i_1230_ += i_1235_;
							i_1228_ += anInt10956 * i_1235_;
							i_1229_ += anInt10946 * i_1235_;
						} else
							i_1234_ -= i_1235_;
						if (i_1230_ < i_1234_)
							i_1230_ = i_1234_;
						for (/**/; i_1230_ < 0; i_1230_++) {
							int i_1236_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(((i_1229_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_1228_ >> 12))]);
							int i_1237_ = i_1236_ >>> 24;
							int i_1238_ = 256 - i_1237_;
							int i_1239_ = is_1110_[i_1227_];
							is_1110_[i_1227_++] = ((((i_1236_ & 0xff00ff) * i_1237_ + (i_1239_ & 0xff00ff) * i_1238_) & ~0xff00ff) + (((i_1236_ & 0xff00) * i_1237_ + (i_1239_ & 0xff00) * i_1238_) & 0xff0000)) >> 8;
							i_1228_ += anInt10956;
							i_1229_ += anInt10946;
						}
					}
					i_1225_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public void method2617(int i, int i_1240_, int i_1241_, int i_1242_, int i_1243_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1244_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1240_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1245_ = i_1240_ * i_1244_ + i;
			int i_1246_ = 0;
			int i_1247_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1248_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1249_ = i_1244_ - i_1248_;
			int i_1250_ = 0;
			if (i_1240_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1251_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1240_);
				i_1247_ -= i_1251_;
				i_1240_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1246_ += i_1251_ * i_1248_;
				i_1245_ += i_1251_ * i_1244_;
			}
			if (i_1240_ + i_1247_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1247_ -= (i_1240_ + i_1247_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1252_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1248_ -= i_1252_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1246_ += i_1252_;
				i_1245_ += i_1252_;
				i_1250_ += i_1252_;
				i_1249_ += i_1252_;
			}
			if (i + i_1248_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1253_ = (i + i_1248_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1248_ -= i_1253_;
				i_1250_ += i_1253_;
				i_1249_ += i_1253_;
			}
			if (i_1248_ > 0 && i_1247_ > 0) {
				if (i_1243_ == 0) {
					if (i_1241_ == 1) {
						for (int i_1254_ = -i_1247_; i_1254_ < 0; i_1254_++) {
							int i_1255_ = i_1245_ + i_1248_ - 3;
							while (i_1245_ < i_1255_) {
								is[i_1245_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								is[i_1245_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								is[i_1245_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								is[i_1245_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
							}
							i_1255_ += 3;
							while (i_1245_ < i_1255_)
								is[i_1245_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 0) {
						int i_1256_ = (i_1242_ & 0xff0000) >> 16;
						int i_1257_ = (i_1242_ & 0xff00) >> 8;
						int i_1258_ = i_1242_ & 0xff;
						for (int i_1259_ = -i_1247_; i_1259_ < 0; i_1259_++) {
							for (int i_1260_ = -i_1248_; i_1260_ < 0; i_1260_++) {
								int i_1261_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1262_ = ((i_1261_ & 0xff0000) * i_1256_ & ~0xffffff);
								int i_1263_ = (i_1261_ & 0xff00) * i_1257_ & 0xff0000;
								int i_1264_ = (i_1261_ & 0xff) * i_1258_ & 0xff00;
								is[i_1245_++] = (i_1262_ | i_1263_ | i_1264_) >>> 8;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 3) {
						for (int i_1265_ = -i_1247_; i_1265_ < 0; i_1265_++) {
							for (int i_1266_ = -i_1248_; i_1266_ < 0; i_1266_++) {
								int i_1267_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1268_ = i_1267_ + i_1242_;
								int i_1269_ = ((i_1267_ & 0xff00ff) + (i_1242_ & 0xff00ff));
								int i_1270_ = ((i_1269_ & 0x1000100) + (i_1268_ - i_1269_ & 0x10000));
								is[i_1245_++] = i_1268_ - i_1270_ | i_1270_ - (i_1270_ >>> 8);
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 2) {
						int i_1271_ = i_1242_ >>> 24;
						int i_1272_ = 256 - i_1271_;
						int i_1273_ = (i_1242_ & 0xff00ff) * i_1272_ & ~0xff00ff;
						int i_1274_ = (i_1242_ & 0xff00) * i_1272_ & 0xff0000;
						i_1242_ = (i_1273_ | i_1274_) >>> 8;
						for (int i_1275_ = -i_1247_; i_1275_ < 0; i_1275_++) {
							for (int i_1276_ = -i_1248_; i_1276_ < 0; i_1276_++) {
								int i_1277_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								i_1273_ = ((i_1277_ & 0xff00ff) * i_1271_ & ~0xff00ff);
								i_1274_ = (i_1277_ & 0xff00) * i_1271_ & 0xff0000;
								is[i_1245_++] = ((i_1273_ | i_1274_) >>> 8) + i_1242_;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1243_ == 1) {
					if (i_1241_ == 1) {
						for (int i_1278_ = -i_1247_; i_1278_ < 0; i_1278_++) {
							for (int i_1279_ = -i_1248_; i_1279_ < 0; i_1279_++) {
								int i_1280_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1281_ = i_1280_ >>> 24;
								int i_1282_ = 256 - i_1281_;
								int i_1283_ = is[i_1245_];
								is[i_1245_++] = (((((i_1280_ & 0xff00ff) * i_1281_ + (i_1283_ & 0xff00ff) * i_1282_) & ~0xff00ff) >> 8) + (((((i_1280_ & ~0xff00ff) >>> 8) * i_1281_) + (((i_1283_ & ~0xff00ff) >>> 8) * i_1282_)) & ~0xff00ff));
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 0) {
						if ((i_1242_ & 0xffffff) == 16777215) {
							for (int i_1284_ = -i_1247_; i_1284_ < 0; i_1284_++) {
								for (int i_1285_ = -i_1248_; i_1285_ < 0; i_1285_++) {
									int i_1286_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
									int i_1287_ = ((i_1286_ >>> 24) * (i_1242_ >>> 24) >> 8);
									int i_1288_ = 256 - i_1287_;
									int i_1289_ = is[i_1245_];
									is[i_1245_++] = ((((i_1286_ & 0xff00ff) * i_1287_ + (i_1289_ & 0xff00ff) * i_1288_) & ~0xff00ff) + (((i_1286_ & 0xff00) * i_1287_ + (i_1289_ & 0xff00) * i_1288_) & 0xff0000)) >> 8;
								}
								i_1245_ += i_1249_;
								i_1246_ += i_1250_;
							}
						} else {
							int i_1290_ = (i_1242_ & 0xff0000) >> 16;
							int i_1291_ = (i_1242_ & 0xff00) >> 8;
							int i_1292_ = i_1242_ & 0xff;
							for (int i_1293_ = -i_1247_; i_1293_ < 0; i_1293_++) {
								for (int i_1294_ = -i_1248_; i_1294_ < 0; i_1294_++) {
									int i_1295_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
									int i_1296_ = ((i_1295_ >>> 24) * (i_1242_ >>> 24) >> 8);
									int i_1297_ = 256 - i_1296_;
									if (i_1296_ != 255) {
										int i_1298_ = ((i_1295_ & 0xff0000) * i_1290_ & ~0xffffff);
										int i_1299_ = ((i_1295_ & 0xff00) * i_1291_ & 0xff0000);
										int i_1300_ = ((i_1295_ & 0xff) * i_1292_ & 0xff00);
										i_1295_ = (i_1298_ | i_1299_ | i_1300_) >>> 8;
										int i_1301_ = is[i_1245_];
										is[i_1245_++] = ((((i_1295_ & 0xff00ff) * i_1296_ + ((i_1301_ & 0xff00ff) * i_1297_)) & ~0xff00ff) + (((i_1295_ & 0xff00) * i_1296_ + ((i_1301_ & 0xff00) * i_1297_)) & 0xff0000)) >> 8;
									} else {
										int i_1302_ = ((i_1295_ & 0xff0000) * i_1290_ & ~0xffffff);
										int i_1303_ = ((i_1295_ & 0xff00) * i_1291_ & 0xff0000);
										int i_1304_ = ((i_1295_ & 0xff) * i_1292_ & 0xff00);
										is[i_1245_++] = (i_1302_ | i_1303_ | i_1304_) >>> 8;
									}
								}
								i_1245_ += i_1249_;
								i_1246_ += i_1250_;
							}
						}
					} else if (i_1241_ == 3) {
						for (int i_1305_ = -i_1247_; i_1305_ < 0; i_1305_++) {
							for (int i_1306_ = -i_1248_; i_1306_ < 0; i_1306_++) {
								int i_1307_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1308_ = i_1307_ + i_1242_;
								int i_1309_ = ((i_1307_ & 0xff00ff) + (i_1242_ & 0xff00ff));
								int i_1310_ = ((i_1309_ & 0x1000100) + (i_1308_ - i_1309_ & 0x10000));
								i_1310_ = i_1308_ - i_1310_ | i_1310_ - (i_1310_ >>> 8);
								int i_1311_ = (i_1310_ >>> 24) * (i_1242_ >>> 24) >> 8;
								int i_1312_ = 256 - i_1311_;
								if (i_1311_ != 255) {
									i_1307_ = i_1310_;
									i_1310_ = is[i_1245_];
									i_1310_ = ((((i_1307_ & 0xff00ff) * i_1311_ + (i_1310_ & 0xff00ff) * i_1312_) & ~0xff00ff) + (((i_1307_ & 0xff00) * i_1311_ + (i_1310_ & 0xff00) * i_1312_) & 0xff0000)) >> 8;
								}
								is[i_1245_++] = i_1310_;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 2) {
						int i_1313_ = i_1242_ >>> 24;
						int i_1314_ = 256 - i_1313_;
						int i_1315_ = (i_1242_ & 0xff00ff) * i_1314_ & ~0xff00ff;
						int i_1316_ = (i_1242_ & 0xff00) * i_1314_ & 0xff0000;
						i_1242_ = (i_1315_ | i_1316_) >>> 8;
						for (int i_1317_ = -i_1247_; i_1317_ < 0; i_1317_++) {
							for (int i_1318_ = -i_1248_; i_1318_ < 0; i_1318_++) {
								int i_1319_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1320_ = i_1319_ >>> 24;
								int i_1321_ = 256 - i_1320_;
								i_1315_ = ((i_1319_ & 0xff00ff) * i_1313_ & ~0xff00ff);
								i_1316_ = (i_1319_ & 0xff00) * i_1313_ & 0xff0000;
								i_1319_ = ((i_1315_ | i_1316_) >>> 8) + i_1242_;
								int i_1322_ = is[i_1245_];
								is[i_1245_++] = ((((i_1319_ & 0xff00ff) * i_1320_ + (i_1322_ & 0xff00ff) * i_1321_) & ~0xff00ff) + (((i_1319_ & 0xff00) * i_1320_ + (i_1322_ & 0xff00) * i_1321_) & 0xff0000)) >> 8;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1243_ == 2) {
					if (i_1241_ == 1) {
						for (int i_1323_ = -i_1247_; i_1323_ < 0; i_1323_++) {
							for (int i_1324_ = -i_1248_; i_1324_ < 0; i_1324_++) {
								int i_1325_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								if (i_1325_ != 0) {
									int i_1326_ = is[i_1245_];
									int i_1327_ = i_1325_ + i_1326_;
									int i_1328_ = ((i_1325_ & 0xff00ff) + (i_1326_ & 0xff00ff));
									i_1326_ = ((i_1328_ & 0x1000100) + (i_1327_ - i_1328_ & 0x10000));
									is[i_1245_++] = (i_1327_ - i_1326_ | i_1326_ - (i_1326_ >>> 8));
								} else
									i_1245_++;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 0) {
						int i_1329_ = (i_1242_ & 0xff0000) >> 16;
						int i_1330_ = (i_1242_ & 0xff00) >> 8;
						int i_1331_ = i_1242_ & 0xff;
						for (int i_1332_ = -i_1247_; i_1332_ < 0; i_1332_++) {
							for (int i_1333_ = -i_1248_; i_1333_ < 0; i_1333_++) {
								int i_1334_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								if (i_1334_ != 0) {
									int i_1335_ = ((i_1334_ & 0xff0000) * i_1329_ & ~0xffffff);
									int i_1336_ = ((i_1334_ & 0xff00) * i_1330_ & 0xff0000);
									int i_1337_ = (i_1334_ & 0xff) * i_1331_ & 0xff00;
									i_1334_ = (i_1335_ | i_1336_ | i_1337_) >>> 8;
									int i_1338_ = is[i_1245_];
									int i_1339_ = i_1334_ + i_1338_;
									int i_1340_ = ((i_1334_ & 0xff00ff) + (i_1338_ & 0xff00ff));
									i_1338_ = ((i_1340_ & 0x1000100) + (i_1339_ - i_1340_ & 0x10000));
									is[i_1245_++] = (i_1339_ - i_1338_ | i_1338_ - (i_1338_ >>> 8));
								} else
									i_1245_++;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 3) {
						for (int i_1341_ = -i_1247_; i_1341_ < 0; i_1341_++) {
							for (int i_1342_ = -i_1248_; i_1342_ < 0; i_1342_++) {
								int i_1343_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								int i_1344_ = i_1343_ + i_1242_;
								int i_1345_ = ((i_1343_ & 0xff00ff) + (i_1242_ & 0xff00ff));
								int i_1346_ = ((i_1345_ & 0x1000100) + (i_1344_ - i_1345_ & 0x10000));
								i_1343_ = i_1344_ - i_1346_ | i_1346_ - (i_1346_ >>> 8);
								i_1346_ = is[i_1245_];
								i_1344_ = i_1343_ + i_1346_;
								i_1345_ = (i_1343_ & 0xff00ff) + (i_1346_ & 0xff00ff);
								i_1346_ = ((i_1345_ & 0x1000100) + (i_1344_ - i_1345_ & 0x10000));
								is[i_1245_++] = i_1344_ - i_1346_ | i_1346_ - (i_1346_ >>> 8);
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else if (i_1241_ == 2) {
						int i_1347_ = i_1242_ >>> 24;
						int i_1348_ = 256 - i_1347_;
						int i_1349_ = (i_1242_ & 0xff00ff) * i_1348_ & ~0xff00ff;
						int i_1350_ = (i_1242_ & 0xff00) * i_1348_ & 0xff0000;
						i_1242_ = (i_1349_ | i_1350_) >>> 8;
						for (int i_1351_ = -i_1247_; i_1351_ < 0; i_1351_++) {
							for (int i_1352_ = -i_1248_; i_1352_ < 0; i_1352_++) {
								int i_1353_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1246_++]);
								if (i_1353_ != 0) {
									i_1349_ = ((i_1353_ & 0xff00ff) * i_1347_ & ~0xff00ff);
									i_1350_ = ((i_1353_ & 0xff00) * i_1347_ & 0xff0000);
									i_1353_ = (((i_1349_ | i_1350_) >>> 8) + i_1242_);
									int i_1354_ = is[i_1245_];
									int i_1355_ = i_1353_ + i_1354_;
									int i_1356_ = ((i_1353_ & 0xff00ff) + (i_1354_ & 0xff00ff));
									i_1354_ = ((i_1356_ & 0x1000100) + (i_1355_ - i_1356_ & 0x10000));
									is[i_1245_++] = (i_1355_ - i_1354_ | i_1354_ - (i_1354_ >>> 8));
								} else
									i_1245_++;
							}
							i_1245_ += i_1249_;
							i_1246_ += i_1250_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2618(int i, int i_1357_, int i_1358_, int i_1359_, int i_1360_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1361_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1357_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1362_ = i_1357_ * i_1361_ + i;
			int i_1363_ = 0;
			int i_1364_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1365_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1366_ = i_1361_ - i_1365_;
			int i_1367_ = 0;
			if (i_1357_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1368_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1357_);
				i_1364_ -= i_1368_;
				i_1357_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1363_ += i_1368_ * i_1365_;
				i_1362_ += i_1368_ * i_1361_;
			}
			if (i_1357_ + i_1364_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1364_ -= (i_1357_ + i_1364_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1369_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1365_ -= i_1369_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1363_ += i_1369_;
				i_1362_ += i_1369_;
				i_1367_ += i_1369_;
				i_1366_ += i_1369_;
			}
			if (i + i_1365_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1370_ = (i + i_1365_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1365_ -= i_1370_;
				i_1367_ += i_1370_;
				i_1366_ += i_1370_;
			}
			if (i_1365_ > 0 && i_1364_ > 0) {
				if (i_1360_ == 0) {
					if (i_1358_ == 1) {
						for (int i_1371_ = -i_1364_; i_1371_ < 0; i_1371_++) {
							int i_1372_ = i_1362_ + i_1365_ - 3;
							while (i_1362_ < i_1372_) {
								is[i_1362_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								is[i_1362_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								is[i_1362_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								is[i_1362_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
							}
							i_1372_ += 3;
							while (i_1362_ < i_1372_)
								is[i_1362_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 0) {
						int i_1373_ = (i_1359_ & 0xff0000) >> 16;
						int i_1374_ = (i_1359_ & 0xff00) >> 8;
						int i_1375_ = i_1359_ & 0xff;
						for (int i_1376_ = -i_1364_; i_1376_ < 0; i_1376_++) {
							for (int i_1377_ = -i_1365_; i_1377_ < 0; i_1377_++) {
								int i_1378_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1379_ = ((i_1378_ & 0xff0000) * i_1373_ & ~0xffffff);
								int i_1380_ = (i_1378_ & 0xff00) * i_1374_ & 0xff0000;
								int i_1381_ = (i_1378_ & 0xff) * i_1375_ & 0xff00;
								is[i_1362_++] = (i_1379_ | i_1380_ | i_1381_) >>> 8;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 3) {
						for (int i_1382_ = -i_1364_; i_1382_ < 0; i_1382_++) {
							for (int i_1383_ = -i_1365_; i_1383_ < 0; i_1383_++) {
								int i_1384_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1385_ = i_1384_ + i_1359_;
								int i_1386_ = ((i_1384_ & 0xff00ff) + (i_1359_ & 0xff00ff));
								int i_1387_ = ((i_1386_ & 0x1000100) + (i_1385_ - i_1386_ & 0x10000));
								is[i_1362_++] = i_1385_ - i_1387_ | i_1387_ - (i_1387_ >>> 8);
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 2) {
						int i_1388_ = i_1359_ >>> 24;
						int i_1389_ = 256 - i_1388_;
						int i_1390_ = (i_1359_ & 0xff00ff) * i_1389_ & ~0xff00ff;
						int i_1391_ = (i_1359_ & 0xff00) * i_1389_ & 0xff0000;
						i_1359_ = (i_1390_ | i_1391_) >>> 8;
						for (int i_1392_ = -i_1364_; i_1392_ < 0; i_1392_++) {
							for (int i_1393_ = -i_1365_; i_1393_ < 0; i_1393_++) {
								int i_1394_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								i_1390_ = ((i_1394_ & 0xff00ff) * i_1388_ & ~0xff00ff);
								i_1391_ = (i_1394_ & 0xff00) * i_1388_ & 0xff0000;
								is[i_1362_++] = ((i_1390_ | i_1391_) >>> 8) + i_1359_;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1360_ == 1) {
					if (i_1358_ == 1) {
						for (int i_1395_ = -i_1364_; i_1395_ < 0; i_1395_++) {
							for (int i_1396_ = -i_1365_; i_1396_ < 0; i_1396_++) {
								int i_1397_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1398_ = i_1397_ >>> 24;
								int i_1399_ = 256 - i_1398_;
								int i_1400_ = is[i_1362_];
								is[i_1362_++] = (((((i_1397_ & 0xff00ff) * i_1398_ + (i_1400_ & 0xff00ff) * i_1399_) & ~0xff00ff) >> 8) + (((((i_1397_ & ~0xff00ff) >>> 8) * i_1398_) + (((i_1400_ & ~0xff00ff) >>> 8) * i_1399_)) & ~0xff00ff));
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 0) {
						if ((i_1359_ & 0xffffff) == 16777215) {
							for (int i_1401_ = -i_1364_; i_1401_ < 0; i_1401_++) {
								for (int i_1402_ = -i_1365_; i_1402_ < 0; i_1402_++) {
									int i_1403_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
									int i_1404_ = ((i_1403_ >>> 24) * (i_1359_ >>> 24) >> 8);
									int i_1405_ = 256 - i_1404_;
									int i_1406_ = is[i_1362_];
									is[i_1362_++] = ((((i_1403_ & 0xff00ff) * i_1404_ + (i_1406_ & 0xff00ff) * i_1405_) & ~0xff00ff) + (((i_1403_ & 0xff00) * i_1404_ + (i_1406_ & 0xff00) * i_1405_) & 0xff0000)) >> 8;
								}
								i_1362_ += i_1366_;
								i_1363_ += i_1367_;
							}
						} else {
							int i_1407_ = (i_1359_ & 0xff0000) >> 16;
							int i_1408_ = (i_1359_ & 0xff00) >> 8;
							int i_1409_ = i_1359_ & 0xff;
							for (int i_1410_ = -i_1364_; i_1410_ < 0; i_1410_++) {
								for (int i_1411_ = -i_1365_; i_1411_ < 0; i_1411_++) {
									int i_1412_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
									int i_1413_ = ((i_1412_ >>> 24) * (i_1359_ >>> 24) >> 8);
									int i_1414_ = 256 - i_1413_;
									if (i_1413_ != 255) {
										int i_1415_ = ((i_1412_ & 0xff0000) * i_1407_ & ~0xffffff);
										int i_1416_ = ((i_1412_ & 0xff00) * i_1408_ & 0xff0000);
										int i_1417_ = ((i_1412_ & 0xff) * i_1409_ & 0xff00);
										i_1412_ = (i_1415_ | i_1416_ | i_1417_) >>> 8;
										int i_1418_ = is[i_1362_];
										is[i_1362_++] = ((((i_1412_ & 0xff00ff) * i_1413_ + ((i_1418_ & 0xff00ff) * i_1414_)) & ~0xff00ff) + (((i_1412_ & 0xff00) * i_1413_ + ((i_1418_ & 0xff00) * i_1414_)) & 0xff0000)) >> 8;
									} else {
										int i_1419_ = ((i_1412_ & 0xff0000) * i_1407_ & ~0xffffff);
										int i_1420_ = ((i_1412_ & 0xff00) * i_1408_ & 0xff0000);
										int i_1421_ = ((i_1412_ & 0xff) * i_1409_ & 0xff00);
										is[i_1362_++] = (i_1419_ | i_1420_ | i_1421_) >>> 8;
									}
								}
								i_1362_ += i_1366_;
								i_1363_ += i_1367_;
							}
						}
					} else if (i_1358_ == 3) {
						for (int i_1422_ = -i_1364_; i_1422_ < 0; i_1422_++) {
							for (int i_1423_ = -i_1365_; i_1423_ < 0; i_1423_++) {
								int i_1424_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1425_ = i_1424_ + i_1359_;
								int i_1426_ = ((i_1424_ & 0xff00ff) + (i_1359_ & 0xff00ff));
								int i_1427_ = ((i_1426_ & 0x1000100) + (i_1425_ - i_1426_ & 0x10000));
								i_1427_ = i_1425_ - i_1427_ | i_1427_ - (i_1427_ >>> 8);
								int i_1428_ = (i_1427_ >>> 24) * (i_1359_ >>> 24) >> 8;
								int i_1429_ = 256 - i_1428_;
								if (i_1428_ != 255) {
									i_1424_ = i_1427_;
									i_1427_ = is[i_1362_];
									i_1427_ = ((((i_1424_ & 0xff00ff) * i_1428_ + (i_1427_ & 0xff00ff) * i_1429_) & ~0xff00ff) + (((i_1424_ & 0xff00) * i_1428_ + (i_1427_ & 0xff00) * i_1429_) & 0xff0000)) >> 8;
								}
								is[i_1362_++] = i_1427_;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 2) {
						int i_1430_ = i_1359_ >>> 24;
						int i_1431_ = 256 - i_1430_;
						int i_1432_ = (i_1359_ & 0xff00ff) * i_1431_ & ~0xff00ff;
						int i_1433_ = (i_1359_ & 0xff00) * i_1431_ & 0xff0000;
						i_1359_ = (i_1432_ | i_1433_) >>> 8;
						for (int i_1434_ = -i_1364_; i_1434_ < 0; i_1434_++) {
							for (int i_1435_ = -i_1365_; i_1435_ < 0; i_1435_++) {
								int i_1436_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1437_ = i_1436_ >>> 24;
								int i_1438_ = 256 - i_1437_;
								i_1432_ = ((i_1436_ & 0xff00ff) * i_1430_ & ~0xff00ff);
								i_1433_ = (i_1436_ & 0xff00) * i_1430_ & 0xff0000;
								i_1436_ = ((i_1432_ | i_1433_) >>> 8) + i_1359_;
								int i_1439_ = is[i_1362_];
								is[i_1362_++] = ((((i_1436_ & 0xff00ff) * i_1437_ + (i_1439_ & 0xff00ff) * i_1438_) & ~0xff00ff) + (((i_1436_ & 0xff00) * i_1437_ + (i_1439_ & 0xff00) * i_1438_) & 0xff0000)) >> 8;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1360_ == 2) {
					if (i_1358_ == 1) {
						for (int i_1440_ = -i_1364_; i_1440_ < 0; i_1440_++) {
							for (int i_1441_ = -i_1365_; i_1441_ < 0; i_1441_++) {
								int i_1442_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								if (i_1442_ != 0) {
									int i_1443_ = is[i_1362_];
									int i_1444_ = i_1442_ + i_1443_;
									int i_1445_ = ((i_1442_ & 0xff00ff) + (i_1443_ & 0xff00ff));
									i_1443_ = ((i_1445_ & 0x1000100) + (i_1444_ - i_1445_ & 0x10000));
									is[i_1362_++] = (i_1444_ - i_1443_ | i_1443_ - (i_1443_ >>> 8));
								} else
									i_1362_++;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 0) {
						int i_1446_ = (i_1359_ & 0xff0000) >> 16;
						int i_1447_ = (i_1359_ & 0xff00) >> 8;
						int i_1448_ = i_1359_ & 0xff;
						for (int i_1449_ = -i_1364_; i_1449_ < 0; i_1449_++) {
							for (int i_1450_ = -i_1365_; i_1450_ < 0; i_1450_++) {
								int i_1451_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								if (i_1451_ != 0) {
									int i_1452_ = ((i_1451_ & 0xff0000) * i_1446_ & ~0xffffff);
									int i_1453_ = ((i_1451_ & 0xff00) * i_1447_ & 0xff0000);
									int i_1454_ = (i_1451_ & 0xff) * i_1448_ & 0xff00;
									i_1451_ = (i_1452_ | i_1453_ | i_1454_) >>> 8;
									int i_1455_ = is[i_1362_];
									int i_1456_ = i_1451_ + i_1455_;
									int i_1457_ = ((i_1451_ & 0xff00ff) + (i_1455_ & 0xff00ff));
									i_1455_ = ((i_1457_ & 0x1000100) + (i_1456_ - i_1457_ & 0x10000));
									is[i_1362_++] = (i_1456_ - i_1455_ | i_1455_ - (i_1455_ >>> 8));
								} else
									i_1362_++;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 3) {
						for (int i_1458_ = -i_1364_; i_1458_ < 0; i_1458_++) {
							for (int i_1459_ = -i_1365_; i_1459_ < 0; i_1459_++) {
								int i_1460_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								int i_1461_ = i_1460_ + i_1359_;
								int i_1462_ = ((i_1460_ & 0xff00ff) + (i_1359_ & 0xff00ff));
								int i_1463_ = ((i_1462_ & 0x1000100) + (i_1461_ - i_1462_ & 0x10000));
								i_1460_ = i_1461_ - i_1463_ | i_1463_ - (i_1463_ >>> 8);
								i_1463_ = is[i_1362_];
								i_1461_ = i_1460_ + i_1463_;
								i_1462_ = (i_1460_ & 0xff00ff) + (i_1463_ & 0xff00ff);
								i_1463_ = ((i_1462_ & 0x1000100) + (i_1461_ - i_1462_ & 0x10000));
								is[i_1362_++] = i_1461_ - i_1463_ | i_1463_ - (i_1463_ >>> 8);
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else if (i_1358_ == 2) {
						int i_1464_ = i_1359_ >>> 24;
						int i_1465_ = 256 - i_1464_;
						int i_1466_ = (i_1359_ & 0xff00ff) * i_1465_ & ~0xff00ff;
						int i_1467_ = (i_1359_ & 0xff00) * i_1465_ & 0xff0000;
						i_1359_ = (i_1466_ | i_1467_) >>> 8;
						for (int i_1468_ = -i_1364_; i_1468_ < 0; i_1468_++) {
							for (int i_1469_ = -i_1365_; i_1469_ < 0; i_1469_++) {
								int i_1470_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1363_++]);
								if (i_1470_ != 0) {
									i_1466_ = ((i_1470_ & 0xff00ff) * i_1464_ & ~0xff00ff);
									i_1467_ = ((i_1470_ & 0xff00) * i_1464_ & 0xff0000);
									i_1470_ = (((i_1466_ | i_1467_) >>> 8) + i_1359_);
									int i_1471_ = is[i_1362_];
									int i_1472_ = i_1470_ + i_1471_;
									int i_1473_ = ((i_1470_ & 0xff00ff) + (i_1471_ & 0xff00ff));
									i_1471_ = ((i_1473_ & 0x1000100) + (i_1472_ - i_1473_ & 0x10000));
									is[i_1362_++] = (i_1472_ - i_1471_ | i_1471_ - (i_1471_ >>> 8));
								} else
									i_1362_++;
							}
							i_1362_ += i_1366_;
							i_1363_ += i_1367_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2646(int i, int i_1474_, int i_1475_, int i_1476_, int i_1477_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1478_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1474_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1479_ = i_1474_ * i_1478_ + i;
			int i_1480_ = 0;
			int i_1481_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1482_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1483_ = i_1478_ - i_1482_;
			int i_1484_ = 0;
			if (i_1474_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1485_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1474_);
				i_1481_ -= i_1485_;
				i_1474_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1480_ += i_1485_ * i_1482_;
				i_1479_ += i_1485_ * i_1478_;
			}
			if (i_1474_ + i_1481_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1481_ -= (i_1474_ + i_1481_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1486_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1482_ -= i_1486_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1480_ += i_1486_;
				i_1479_ += i_1486_;
				i_1484_ += i_1486_;
				i_1483_ += i_1486_;
			}
			if (i + i_1482_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1487_ = (i + i_1482_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1482_ -= i_1487_;
				i_1484_ += i_1487_;
				i_1483_ += i_1487_;
			}
			if (i_1482_ > 0 && i_1481_ > 0) {
				if (i_1477_ == 0) {
					if (i_1475_ == 1) {
						for (int i_1488_ = -i_1481_; i_1488_ < 0; i_1488_++) {
							int i_1489_ = i_1479_ + i_1482_ - 3;
							while (i_1479_ < i_1489_) {
								is[i_1479_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								is[i_1479_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								is[i_1479_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								is[i_1479_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
							}
							i_1489_ += 3;
							while (i_1479_ < i_1489_)
								is[i_1479_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 0) {
						int i_1490_ = (i_1476_ & 0xff0000) >> 16;
						int i_1491_ = (i_1476_ & 0xff00) >> 8;
						int i_1492_ = i_1476_ & 0xff;
						for (int i_1493_ = -i_1481_; i_1493_ < 0; i_1493_++) {
							for (int i_1494_ = -i_1482_; i_1494_ < 0; i_1494_++) {
								int i_1495_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1496_ = ((i_1495_ & 0xff0000) * i_1490_ & ~0xffffff);
								int i_1497_ = (i_1495_ & 0xff00) * i_1491_ & 0xff0000;
								int i_1498_ = (i_1495_ & 0xff) * i_1492_ & 0xff00;
								is[i_1479_++] = (i_1496_ | i_1497_ | i_1498_) >>> 8;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 3) {
						for (int i_1499_ = -i_1481_; i_1499_ < 0; i_1499_++) {
							for (int i_1500_ = -i_1482_; i_1500_ < 0; i_1500_++) {
								int i_1501_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1502_ = i_1501_ + i_1476_;
								int i_1503_ = ((i_1501_ & 0xff00ff) + (i_1476_ & 0xff00ff));
								int i_1504_ = ((i_1503_ & 0x1000100) + (i_1502_ - i_1503_ & 0x10000));
								is[i_1479_++] = i_1502_ - i_1504_ | i_1504_ - (i_1504_ >>> 8);
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 2) {
						int i_1505_ = i_1476_ >>> 24;
						int i_1506_ = 256 - i_1505_;
						int i_1507_ = (i_1476_ & 0xff00ff) * i_1506_ & ~0xff00ff;
						int i_1508_ = (i_1476_ & 0xff00) * i_1506_ & 0xff0000;
						i_1476_ = (i_1507_ | i_1508_) >>> 8;
						for (int i_1509_ = -i_1481_; i_1509_ < 0; i_1509_++) {
							for (int i_1510_ = -i_1482_; i_1510_ < 0; i_1510_++) {
								int i_1511_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								i_1507_ = ((i_1511_ & 0xff00ff) * i_1505_ & ~0xff00ff);
								i_1508_ = (i_1511_ & 0xff00) * i_1505_ & 0xff0000;
								is[i_1479_++] = ((i_1507_ | i_1508_) >>> 8) + i_1476_;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1477_ == 1) {
					if (i_1475_ == 1) {
						for (int i_1512_ = -i_1481_; i_1512_ < 0; i_1512_++) {
							for (int i_1513_ = -i_1482_; i_1513_ < 0; i_1513_++) {
								int i_1514_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1515_ = i_1514_ >>> 24;
								int i_1516_ = 256 - i_1515_;
								int i_1517_ = is[i_1479_];
								is[i_1479_++] = (((((i_1514_ & 0xff00ff) * i_1515_ + (i_1517_ & 0xff00ff) * i_1516_) & ~0xff00ff) >> 8) + (((((i_1514_ & ~0xff00ff) >>> 8) * i_1515_) + (((i_1517_ & ~0xff00ff) >>> 8) * i_1516_)) & ~0xff00ff));
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 0) {
						if ((i_1476_ & 0xffffff) == 16777215) {
							for (int i_1518_ = -i_1481_; i_1518_ < 0; i_1518_++) {
								for (int i_1519_ = -i_1482_; i_1519_ < 0; i_1519_++) {
									int i_1520_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
									int i_1521_ = ((i_1520_ >>> 24) * (i_1476_ >>> 24) >> 8);
									int i_1522_ = 256 - i_1521_;
									int i_1523_ = is[i_1479_];
									is[i_1479_++] = ((((i_1520_ & 0xff00ff) * i_1521_ + (i_1523_ & 0xff00ff) * i_1522_) & ~0xff00ff) + (((i_1520_ & 0xff00) * i_1521_ + (i_1523_ & 0xff00) * i_1522_) & 0xff0000)) >> 8;
								}
								i_1479_ += i_1483_;
								i_1480_ += i_1484_;
							}
						} else {
							int i_1524_ = (i_1476_ & 0xff0000) >> 16;
							int i_1525_ = (i_1476_ & 0xff00) >> 8;
							int i_1526_ = i_1476_ & 0xff;
							for (int i_1527_ = -i_1481_; i_1527_ < 0; i_1527_++) {
								for (int i_1528_ = -i_1482_; i_1528_ < 0; i_1528_++) {
									int i_1529_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
									int i_1530_ = ((i_1529_ >>> 24) * (i_1476_ >>> 24) >> 8);
									int i_1531_ = 256 - i_1530_;
									if (i_1530_ != 255) {
										int i_1532_ = ((i_1529_ & 0xff0000) * i_1524_ & ~0xffffff);
										int i_1533_ = ((i_1529_ & 0xff00) * i_1525_ & 0xff0000);
										int i_1534_ = ((i_1529_ & 0xff) * i_1526_ & 0xff00);
										i_1529_ = (i_1532_ | i_1533_ | i_1534_) >>> 8;
										int i_1535_ = is[i_1479_];
										is[i_1479_++] = ((((i_1529_ & 0xff00ff) * i_1530_ + ((i_1535_ & 0xff00ff) * i_1531_)) & ~0xff00ff) + (((i_1529_ & 0xff00) * i_1530_ + ((i_1535_ & 0xff00) * i_1531_)) & 0xff0000)) >> 8;
									} else {
										int i_1536_ = ((i_1529_ & 0xff0000) * i_1524_ & ~0xffffff);
										int i_1537_ = ((i_1529_ & 0xff00) * i_1525_ & 0xff0000);
										int i_1538_ = ((i_1529_ & 0xff) * i_1526_ & 0xff00);
										is[i_1479_++] = (i_1536_ | i_1537_ | i_1538_) >>> 8;
									}
								}
								i_1479_ += i_1483_;
								i_1480_ += i_1484_;
							}
						}
					} else if (i_1475_ == 3) {
						for (int i_1539_ = -i_1481_; i_1539_ < 0; i_1539_++) {
							for (int i_1540_ = -i_1482_; i_1540_ < 0; i_1540_++) {
								int i_1541_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1542_ = i_1541_ + i_1476_;
								int i_1543_ = ((i_1541_ & 0xff00ff) + (i_1476_ & 0xff00ff));
								int i_1544_ = ((i_1543_ & 0x1000100) + (i_1542_ - i_1543_ & 0x10000));
								i_1544_ = i_1542_ - i_1544_ | i_1544_ - (i_1544_ >>> 8);
								int i_1545_ = (i_1544_ >>> 24) * (i_1476_ >>> 24) >> 8;
								int i_1546_ = 256 - i_1545_;
								if (i_1545_ != 255) {
									i_1541_ = i_1544_;
									i_1544_ = is[i_1479_];
									i_1544_ = ((((i_1541_ & 0xff00ff) * i_1545_ + (i_1544_ & 0xff00ff) * i_1546_) & ~0xff00ff) + (((i_1541_ & 0xff00) * i_1545_ + (i_1544_ & 0xff00) * i_1546_) & 0xff0000)) >> 8;
								}
								is[i_1479_++] = i_1544_;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 2) {
						int i_1547_ = i_1476_ >>> 24;
						int i_1548_ = 256 - i_1547_;
						int i_1549_ = (i_1476_ & 0xff00ff) * i_1548_ & ~0xff00ff;
						int i_1550_ = (i_1476_ & 0xff00) * i_1548_ & 0xff0000;
						i_1476_ = (i_1549_ | i_1550_) >>> 8;
						for (int i_1551_ = -i_1481_; i_1551_ < 0; i_1551_++) {
							for (int i_1552_ = -i_1482_; i_1552_ < 0; i_1552_++) {
								int i_1553_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1554_ = i_1553_ >>> 24;
								int i_1555_ = 256 - i_1554_;
								i_1549_ = ((i_1553_ & 0xff00ff) * i_1547_ & ~0xff00ff);
								i_1550_ = (i_1553_ & 0xff00) * i_1547_ & 0xff0000;
								i_1553_ = ((i_1549_ | i_1550_) >>> 8) + i_1476_;
								int i_1556_ = is[i_1479_];
								is[i_1479_++] = ((((i_1553_ & 0xff00ff) * i_1554_ + (i_1556_ & 0xff00ff) * i_1555_) & ~0xff00ff) + (((i_1553_ & 0xff00) * i_1554_ + (i_1556_ & 0xff00) * i_1555_) & 0xff0000)) >> 8;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1477_ == 2) {
					if (i_1475_ == 1) {
						for (int i_1557_ = -i_1481_; i_1557_ < 0; i_1557_++) {
							for (int i_1558_ = -i_1482_; i_1558_ < 0; i_1558_++) {
								int i_1559_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								if (i_1559_ != 0) {
									int i_1560_ = is[i_1479_];
									int i_1561_ = i_1559_ + i_1560_;
									int i_1562_ = ((i_1559_ & 0xff00ff) + (i_1560_ & 0xff00ff));
									i_1560_ = ((i_1562_ & 0x1000100) + (i_1561_ - i_1562_ & 0x10000));
									is[i_1479_++] = (i_1561_ - i_1560_ | i_1560_ - (i_1560_ >>> 8));
								} else
									i_1479_++;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 0) {
						int i_1563_ = (i_1476_ & 0xff0000) >> 16;
						int i_1564_ = (i_1476_ & 0xff00) >> 8;
						int i_1565_ = i_1476_ & 0xff;
						for (int i_1566_ = -i_1481_; i_1566_ < 0; i_1566_++) {
							for (int i_1567_ = -i_1482_; i_1567_ < 0; i_1567_++) {
								int i_1568_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								if (i_1568_ != 0) {
									int i_1569_ = ((i_1568_ & 0xff0000) * i_1563_ & ~0xffffff);
									int i_1570_ = ((i_1568_ & 0xff00) * i_1564_ & 0xff0000);
									int i_1571_ = (i_1568_ & 0xff) * i_1565_ & 0xff00;
									i_1568_ = (i_1569_ | i_1570_ | i_1571_) >>> 8;
									int i_1572_ = is[i_1479_];
									int i_1573_ = i_1568_ + i_1572_;
									int i_1574_ = ((i_1568_ & 0xff00ff) + (i_1572_ & 0xff00ff));
									i_1572_ = ((i_1574_ & 0x1000100) + (i_1573_ - i_1574_ & 0x10000));
									is[i_1479_++] = (i_1573_ - i_1572_ | i_1572_ - (i_1572_ >>> 8));
								} else
									i_1479_++;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 3) {
						for (int i_1575_ = -i_1481_; i_1575_ < 0; i_1575_++) {
							for (int i_1576_ = -i_1482_; i_1576_ < 0; i_1576_++) {
								int i_1577_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								int i_1578_ = i_1577_ + i_1476_;
								int i_1579_ = ((i_1577_ & 0xff00ff) + (i_1476_ & 0xff00ff));
								int i_1580_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
								i_1577_ = i_1578_ - i_1580_ | i_1580_ - (i_1580_ >>> 8);
								i_1580_ = is[i_1479_];
								i_1578_ = i_1577_ + i_1580_;
								i_1579_ = (i_1577_ & 0xff00ff) + (i_1580_ & 0xff00ff);
								i_1580_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
								is[i_1479_++] = i_1578_ - i_1580_ | i_1580_ - (i_1580_ >>> 8);
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else if (i_1475_ == 2) {
						int i_1581_ = i_1476_ >>> 24;
						int i_1582_ = 256 - i_1581_;
						int i_1583_ = (i_1476_ & 0xff00ff) * i_1582_ & ~0xff00ff;
						int i_1584_ = (i_1476_ & 0xff00) * i_1582_ & 0xff0000;
						i_1476_ = (i_1583_ | i_1584_) >>> 8;
						for (int i_1585_ = -i_1481_; i_1585_ < 0; i_1585_++) {
							for (int i_1586_ = -i_1482_; i_1586_ < 0; i_1586_++) {
								int i_1587_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1480_++]);
								if (i_1587_ != 0) {
									i_1583_ = ((i_1587_ & 0xff00ff) * i_1581_ & ~0xff00ff);
									i_1584_ = ((i_1587_ & 0xff00) * i_1581_ & 0xff0000);
									i_1587_ = (((i_1583_ | i_1584_) >>> 8) + i_1476_);
									int i_1588_ = is[i_1479_];
									int i_1589_ = i_1587_ + i_1588_;
									int i_1590_ = ((i_1587_ & 0xff00ff) + (i_1588_ & 0xff00ff));
									i_1588_ = ((i_1590_ & 0x1000100) + (i_1589_ - i_1590_ & 0x10000));
									is[i_1479_++] = (i_1589_ - i_1588_ | i_1588_ - (i_1588_ >>> 8));
								} else
									i_1479_++;
							}
							i_1479_ += i_1483_;
							i_1480_ += i_1484_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2644(int i, int i_1591_, int i_1592_, int i_1593_, int i_1594_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1595_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1591_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1596_ = i_1591_ * i_1595_ + i;
			int i_1597_ = 0;
			int i_1598_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1599_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1600_ = i_1595_ - i_1599_;
			int i_1601_ = 0;
			if (i_1591_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1602_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1591_);
				i_1598_ -= i_1602_;
				i_1591_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1597_ += i_1602_ * i_1599_;
				i_1596_ += i_1602_ * i_1595_;
			}
			if (i_1591_ + i_1598_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1598_ -= (i_1591_ + i_1598_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1603_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1599_ -= i_1603_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1597_ += i_1603_;
				i_1596_ += i_1603_;
				i_1601_ += i_1603_;
				i_1600_ += i_1603_;
			}
			if (i + i_1599_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1604_ = (i + i_1599_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1599_ -= i_1604_;
				i_1601_ += i_1604_;
				i_1600_ += i_1604_;
			}
			if (i_1599_ > 0 && i_1598_ > 0) {
				if (i_1594_ == 0) {
					if (i_1592_ == 1) {
						for (int i_1605_ = -i_1598_; i_1605_ < 0; i_1605_++) {
							int i_1606_ = i_1596_ + i_1599_ - 3;
							while (i_1596_ < i_1606_) {
								is[i_1596_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								is[i_1596_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								is[i_1596_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								is[i_1596_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
							}
							i_1606_ += 3;
							while (i_1596_ < i_1606_)
								is[i_1596_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 0) {
						int i_1607_ = (i_1593_ & 0xff0000) >> 16;
						int i_1608_ = (i_1593_ & 0xff00) >> 8;
						int i_1609_ = i_1593_ & 0xff;
						for (int i_1610_ = -i_1598_; i_1610_ < 0; i_1610_++) {
							for (int i_1611_ = -i_1599_; i_1611_ < 0; i_1611_++) {
								int i_1612_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1613_ = ((i_1612_ & 0xff0000) * i_1607_ & ~0xffffff);
								int i_1614_ = (i_1612_ & 0xff00) * i_1608_ & 0xff0000;
								int i_1615_ = (i_1612_ & 0xff) * i_1609_ & 0xff00;
								is[i_1596_++] = (i_1613_ | i_1614_ | i_1615_) >>> 8;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 3) {
						for (int i_1616_ = -i_1598_; i_1616_ < 0; i_1616_++) {
							for (int i_1617_ = -i_1599_; i_1617_ < 0; i_1617_++) {
								int i_1618_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1619_ = i_1618_ + i_1593_;
								int i_1620_ = ((i_1618_ & 0xff00ff) + (i_1593_ & 0xff00ff));
								int i_1621_ = ((i_1620_ & 0x1000100) + (i_1619_ - i_1620_ & 0x10000));
								is[i_1596_++] = i_1619_ - i_1621_ | i_1621_ - (i_1621_ >>> 8);
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 2) {
						int i_1622_ = i_1593_ >>> 24;
						int i_1623_ = 256 - i_1622_;
						int i_1624_ = (i_1593_ & 0xff00ff) * i_1623_ & ~0xff00ff;
						int i_1625_ = (i_1593_ & 0xff00) * i_1623_ & 0xff0000;
						i_1593_ = (i_1624_ | i_1625_) >>> 8;
						for (int i_1626_ = -i_1598_; i_1626_ < 0; i_1626_++) {
							for (int i_1627_ = -i_1599_; i_1627_ < 0; i_1627_++) {
								int i_1628_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								i_1624_ = ((i_1628_ & 0xff00ff) * i_1622_ & ~0xff00ff);
								i_1625_ = (i_1628_ & 0xff00) * i_1622_ & 0xff0000;
								is[i_1596_++] = ((i_1624_ | i_1625_) >>> 8) + i_1593_;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1594_ == 1) {
					if (i_1592_ == 1) {
						for (int i_1629_ = -i_1598_; i_1629_ < 0; i_1629_++) {
							for (int i_1630_ = -i_1599_; i_1630_ < 0; i_1630_++) {
								int i_1631_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1632_ = i_1631_ >>> 24;
								int i_1633_ = 256 - i_1632_;
								int i_1634_ = is[i_1596_];
								is[i_1596_++] = (((((i_1631_ & 0xff00ff) * i_1632_ + (i_1634_ & 0xff00ff) * i_1633_) & ~0xff00ff) >> 8) + (((((i_1631_ & ~0xff00ff) >>> 8) * i_1632_) + (((i_1634_ & ~0xff00ff) >>> 8) * i_1633_)) & ~0xff00ff));
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 0) {
						if ((i_1593_ & 0xffffff) == 16777215) {
							for (int i_1635_ = -i_1598_; i_1635_ < 0; i_1635_++) {
								for (int i_1636_ = -i_1599_; i_1636_ < 0; i_1636_++) {
									int i_1637_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
									int i_1638_ = ((i_1637_ >>> 24) * (i_1593_ >>> 24) >> 8);
									int i_1639_ = 256 - i_1638_;
									int i_1640_ = is[i_1596_];
									is[i_1596_++] = ((((i_1637_ & 0xff00ff) * i_1638_ + (i_1640_ & 0xff00ff) * i_1639_) & ~0xff00ff) + (((i_1637_ & 0xff00) * i_1638_ + (i_1640_ & 0xff00) * i_1639_) & 0xff0000)) >> 8;
								}
								i_1596_ += i_1600_;
								i_1597_ += i_1601_;
							}
						} else {
							int i_1641_ = (i_1593_ & 0xff0000) >> 16;
							int i_1642_ = (i_1593_ & 0xff00) >> 8;
							int i_1643_ = i_1593_ & 0xff;
							for (int i_1644_ = -i_1598_; i_1644_ < 0; i_1644_++) {
								for (int i_1645_ = -i_1599_; i_1645_ < 0; i_1645_++) {
									int i_1646_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
									int i_1647_ = ((i_1646_ >>> 24) * (i_1593_ >>> 24) >> 8);
									int i_1648_ = 256 - i_1647_;
									if (i_1647_ != 255) {
										int i_1649_ = ((i_1646_ & 0xff0000) * i_1641_ & ~0xffffff);
										int i_1650_ = ((i_1646_ & 0xff00) * i_1642_ & 0xff0000);
										int i_1651_ = ((i_1646_ & 0xff) * i_1643_ & 0xff00);
										i_1646_ = (i_1649_ | i_1650_ | i_1651_) >>> 8;
										int i_1652_ = is[i_1596_];
										is[i_1596_++] = ((((i_1646_ & 0xff00ff) * i_1647_ + ((i_1652_ & 0xff00ff) * i_1648_)) & ~0xff00ff) + (((i_1646_ & 0xff00) * i_1647_ + ((i_1652_ & 0xff00) * i_1648_)) & 0xff0000)) >> 8;
									} else {
										int i_1653_ = ((i_1646_ & 0xff0000) * i_1641_ & ~0xffffff);
										int i_1654_ = ((i_1646_ & 0xff00) * i_1642_ & 0xff0000);
										int i_1655_ = ((i_1646_ & 0xff) * i_1643_ & 0xff00);
										is[i_1596_++] = (i_1653_ | i_1654_ | i_1655_) >>> 8;
									}
								}
								i_1596_ += i_1600_;
								i_1597_ += i_1601_;
							}
						}
					} else if (i_1592_ == 3) {
						for (int i_1656_ = -i_1598_; i_1656_ < 0; i_1656_++) {
							for (int i_1657_ = -i_1599_; i_1657_ < 0; i_1657_++) {
								int i_1658_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1659_ = i_1658_ + i_1593_;
								int i_1660_ = ((i_1658_ & 0xff00ff) + (i_1593_ & 0xff00ff));
								int i_1661_ = ((i_1660_ & 0x1000100) + (i_1659_ - i_1660_ & 0x10000));
								i_1661_ = i_1659_ - i_1661_ | i_1661_ - (i_1661_ >>> 8);
								int i_1662_ = (i_1661_ >>> 24) * (i_1593_ >>> 24) >> 8;
								int i_1663_ = 256 - i_1662_;
								if (i_1662_ != 255) {
									i_1658_ = i_1661_;
									i_1661_ = is[i_1596_];
									i_1661_ = ((((i_1658_ & 0xff00ff) * i_1662_ + (i_1661_ & 0xff00ff) * i_1663_) & ~0xff00ff) + (((i_1658_ & 0xff00) * i_1662_ + (i_1661_ & 0xff00) * i_1663_) & 0xff0000)) >> 8;
								}
								is[i_1596_++] = i_1661_;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 2) {
						int i_1664_ = i_1593_ >>> 24;
						int i_1665_ = 256 - i_1664_;
						int i_1666_ = (i_1593_ & 0xff00ff) * i_1665_ & ~0xff00ff;
						int i_1667_ = (i_1593_ & 0xff00) * i_1665_ & 0xff0000;
						i_1593_ = (i_1666_ | i_1667_) >>> 8;
						for (int i_1668_ = -i_1598_; i_1668_ < 0; i_1668_++) {
							for (int i_1669_ = -i_1599_; i_1669_ < 0; i_1669_++) {
								int i_1670_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1671_ = i_1670_ >>> 24;
								int i_1672_ = 256 - i_1671_;
								i_1666_ = ((i_1670_ & 0xff00ff) * i_1664_ & ~0xff00ff);
								i_1667_ = (i_1670_ & 0xff00) * i_1664_ & 0xff0000;
								i_1670_ = ((i_1666_ | i_1667_) >>> 8) + i_1593_;
								int i_1673_ = is[i_1596_];
								is[i_1596_++] = ((((i_1670_ & 0xff00ff) * i_1671_ + (i_1673_ & 0xff00ff) * i_1672_) & ~0xff00ff) + (((i_1670_ & 0xff00) * i_1671_ + (i_1673_ & 0xff00) * i_1672_) & 0xff0000)) >> 8;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1594_ == 2) {
					if (i_1592_ == 1) {
						for (int i_1674_ = -i_1598_; i_1674_ < 0; i_1674_++) {
							for (int i_1675_ = -i_1599_; i_1675_ < 0; i_1675_++) {
								int i_1676_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								if (i_1676_ != 0) {
									int i_1677_ = is[i_1596_];
									int i_1678_ = i_1676_ + i_1677_;
									int i_1679_ = ((i_1676_ & 0xff00ff) + (i_1677_ & 0xff00ff));
									i_1677_ = ((i_1679_ & 0x1000100) + (i_1678_ - i_1679_ & 0x10000));
									is[i_1596_++] = (i_1678_ - i_1677_ | i_1677_ - (i_1677_ >>> 8));
								} else
									i_1596_++;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 0) {
						int i_1680_ = (i_1593_ & 0xff0000) >> 16;
						int i_1681_ = (i_1593_ & 0xff00) >> 8;
						int i_1682_ = i_1593_ & 0xff;
						for (int i_1683_ = -i_1598_; i_1683_ < 0; i_1683_++) {
							for (int i_1684_ = -i_1599_; i_1684_ < 0; i_1684_++) {
								int i_1685_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								if (i_1685_ != 0) {
									int i_1686_ = ((i_1685_ & 0xff0000) * i_1680_ & ~0xffffff);
									int i_1687_ = ((i_1685_ & 0xff00) * i_1681_ & 0xff0000);
									int i_1688_ = (i_1685_ & 0xff) * i_1682_ & 0xff00;
									i_1685_ = (i_1686_ | i_1687_ | i_1688_) >>> 8;
									int i_1689_ = is[i_1596_];
									int i_1690_ = i_1685_ + i_1689_;
									int i_1691_ = ((i_1685_ & 0xff00ff) + (i_1689_ & 0xff00ff));
									i_1689_ = ((i_1691_ & 0x1000100) + (i_1690_ - i_1691_ & 0x10000));
									is[i_1596_++] = (i_1690_ - i_1689_ | i_1689_ - (i_1689_ >>> 8));
								} else
									i_1596_++;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 3) {
						for (int i_1692_ = -i_1598_; i_1692_ < 0; i_1692_++) {
							for (int i_1693_ = -i_1599_; i_1693_ < 0; i_1693_++) {
								int i_1694_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								int i_1695_ = i_1694_ + i_1593_;
								int i_1696_ = ((i_1694_ & 0xff00ff) + (i_1593_ & 0xff00ff));
								int i_1697_ = ((i_1696_ & 0x1000100) + (i_1695_ - i_1696_ & 0x10000));
								i_1694_ = i_1695_ - i_1697_ | i_1697_ - (i_1697_ >>> 8);
								i_1697_ = is[i_1596_];
								i_1695_ = i_1694_ + i_1697_;
								i_1696_ = (i_1694_ & 0xff00ff) + (i_1697_ & 0xff00ff);
								i_1697_ = ((i_1696_ & 0x1000100) + (i_1695_ - i_1696_ & 0x10000));
								is[i_1596_++] = i_1695_ - i_1697_ | i_1697_ - (i_1697_ >>> 8);
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else if (i_1592_ == 2) {
						int i_1698_ = i_1593_ >>> 24;
						int i_1699_ = 256 - i_1698_;
						int i_1700_ = (i_1593_ & 0xff00ff) * i_1699_ & ~0xff00ff;
						int i_1701_ = (i_1593_ & 0xff00) * i_1699_ & 0xff0000;
						i_1593_ = (i_1700_ | i_1701_) >>> 8;
						for (int i_1702_ = -i_1598_; i_1702_ < 0; i_1702_++) {
							for (int i_1703_ = -i_1599_; i_1703_ < 0; i_1703_++) {
								int i_1704_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1597_++]);
								if (i_1704_ != 0) {
									i_1700_ = ((i_1704_ & 0xff00ff) * i_1698_ & ~0xff00ff);
									i_1701_ = ((i_1704_ & 0xff00) * i_1698_ & 0xff0000);
									i_1704_ = (((i_1700_ | i_1701_) >>> 8) + i_1593_);
									int i_1705_ = is[i_1596_];
									int i_1706_ = i_1704_ + i_1705_;
									int i_1707_ = ((i_1704_ & 0xff00ff) + (i_1705_ & 0xff00ff));
									i_1705_ = ((i_1707_ & 0x1000100) + (i_1706_ - i_1707_ & 0x10000));
									is[i_1596_++] = (i_1706_ - i_1705_ | i_1705_ - (i_1705_ >>> 8));
								} else
									i_1596_++;
							}
							i_1596_ += i_1600_;
							i_1597_ += i_1601_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2620(int i, int i_1708_, Class167 class167, int i_1709_, int i_1710_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1708_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1711_ = 0;
			int i_1712_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_1713_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1714_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1715_ = i_1712_ - i_1713_;
			int i_1716_ = 0;
			int i_1717_ = i + i_1708_ * i_1712_;
			if (i_1708_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1718_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1708_);
				i_1714_ -= i_1718_;
				i_1708_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1711_ += i_1718_ * i_1713_;
				i_1717_ += i_1718_ * i_1712_;
			}
			if (i_1708_ + i_1714_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1714_ -= (i_1708_ + i_1714_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1719_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1713_ -= i_1719_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1711_ += i_1719_;
				i_1717_ += i_1719_;
				i_1716_ += i_1719_;
				i_1715_ += i_1719_;
			}
			if (i + i_1713_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1720_ = (i + i_1713_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1713_ -= i_1720_;
				i_1716_ += i_1720_;
				i_1715_ += i_1720_;
			}
			if (i_1713_ > 0 && i_1714_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_1721_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_1722_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_1723_ = i_1708_;
				if (i_1710_ > i_1723_) {
					i_1723_ = i_1710_;
					i_1717_ += (i_1710_ - i_1708_) * i_1712_;
					i_1711_ += ((i_1710_ - i_1708_) * ((Class161_Sub3_Sub3) this).anInt10945);
				}
				int i_1724_ = (i_1710_ + is_1721_.length < i_1708_ + i_1714_ ? i_1710_ + is_1721_.length : i_1708_ + i_1714_);
				for (int i_1725_ = i_1723_; i_1725_ < i_1724_; i_1725_++) {
					int i_1726_ = is_1721_[i_1725_ - i_1710_] + i_1709_;
					int i_1727_ = is_1722_[i_1725_ - i_1710_];
					int i_1728_ = i_1713_;
					if (i > i_1726_) {
						int i_1729_ = i - i_1726_;
						if (i_1729_ >= i_1727_) {
							i_1711_ += i_1713_ + i_1716_;
							i_1717_ += i_1713_ + i_1715_;
							continue;
						}
						i_1727_ -= i_1729_;
					} else {
						int i_1730_ = i_1726_ - i;
						if (i_1730_ >= i_1713_) {
							i_1711_ += i_1713_ + i_1716_;
							i_1717_ += i_1713_ + i_1715_;
							continue;
						}
						i_1711_ += i_1730_;
						i_1728_ -= i_1730_;
						i_1717_ += i_1730_;
					}
					int i_1731_ = 0;
					if (i_1728_ < i_1727_)
						i_1727_ = i_1728_;
					else
						i_1731_ = i_1728_ - i_1727_;
					for (int i_1732_ = -i_1727_; i_1732_ < 0; i_1732_++) {
						int i_1733_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1711_++]);
						int i_1734_ = i_1733_ >>> 24;
						int i_1735_ = 256 - i_1734_;
						int i_1736_ = is[i_1717_];
						is[i_1717_++] = ((((i_1733_ & 0xff00ff) * i_1734_ + (i_1736_ & 0xff00ff) * i_1735_) & ~0xff00ff) + (((i_1733_ & 0xff00) * i_1734_ + (i_1736_ & 0xff00) * i_1735_) & 0xff0000)) >> 8;
					}
					i_1711_ += i_1731_ + i_1716_;
					i_1717_ += i_1731_ + i_1715_;
				}
			}
		}
	}

	public void method2626(int i, int i_1737_, Class167 class167, int i_1738_, int i_1739_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub3) this).anInt10942;
			i_1737_ += ((Class161_Sub3_Sub3) this).anInt10929;
			int i_1740_ = 0;
			int i_1741_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_1742_ = ((Class161_Sub3_Sub3) this).anInt10945;
			int i_1743_ = ((Class161_Sub3_Sub3) this).anInt10930;
			int i_1744_ = i_1741_ - i_1742_;
			int i_1745_ = 0;
			int i_1746_ = i + i_1737_ * i_1741_;
			if (i_1737_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1747_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1737_);
				i_1743_ -= i_1747_;
				i_1737_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1740_ += i_1747_ * i_1742_;
				i_1746_ += i_1747_ * i_1741_;
			}
			if (i_1737_ + i_1743_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1743_ -= (i_1737_ + i_1743_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1748_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1742_ -= i_1748_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1740_ += i_1748_;
				i_1746_ += i_1748_;
				i_1745_ += i_1748_;
				i_1744_ += i_1748_;
			}
			if (i + i_1742_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1749_ = (i + i_1742_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1742_ -= i_1749_;
				i_1745_ += i_1749_;
				i_1744_ += i_1749_;
			}
			if (i_1742_ > 0 && i_1743_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_1750_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_1751_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_1752_ = i_1737_;
				if (i_1739_ > i_1752_) {
					i_1752_ = i_1739_;
					i_1746_ += (i_1739_ - i_1737_) * i_1741_;
					i_1740_ += ((i_1739_ - i_1737_) * ((Class161_Sub3_Sub3) this).anInt10945);
				}
				int i_1753_ = (i_1739_ + is_1750_.length < i_1737_ + i_1743_ ? i_1739_ + is_1750_.length : i_1737_ + i_1743_);
				for (int i_1754_ = i_1752_; i_1754_ < i_1753_; i_1754_++) {
					int i_1755_ = is_1750_[i_1754_ - i_1739_] + i_1738_;
					int i_1756_ = is_1751_[i_1754_ - i_1739_];
					int i_1757_ = i_1742_;
					if (i > i_1755_) {
						int i_1758_ = i - i_1755_;
						if (i_1758_ >= i_1756_) {
							i_1740_ += i_1742_ + i_1745_;
							i_1746_ += i_1742_ + i_1744_;
							continue;
						}
						i_1756_ -= i_1758_;
					} else {
						int i_1759_ = i_1755_ - i;
						if (i_1759_ >= i_1742_) {
							i_1740_ += i_1742_ + i_1745_;
							i_1746_ += i_1742_ + i_1744_;
							continue;
						}
						i_1740_ += i_1759_;
						i_1757_ -= i_1759_;
						i_1746_ += i_1759_;
					}
					int i_1760_ = 0;
					if (i_1757_ < i_1756_)
						i_1756_ = i_1757_;
					else
						i_1760_ = i_1757_ - i_1756_;
					for (int i_1761_ = -i_1756_; i_1761_ < 0; i_1761_++) {
						int i_1762_ = (((Class161_Sub3_Sub3) this).anIntArray11238[i_1740_++]);
						int i_1763_ = i_1762_ >>> 24;
						int i_1764_ = 256 - i_1763_;
						int i_1765_ = is[i_1746_];
						is[i_1746_++] = ((((i_1762_ & 0xff00ff) * i_1763_ + (i_1765_ & 0xff00ff) * i_1764_) & ~0xff00ff) + (((i_1762_ & 0xff00) * i_1763_ + (i_1765_ & 0xff00) * i_1764_) & 0xff0000)) >> 8;
					}
					i_1740_ += i_1760_ + i_1745_;
					i_1746_ += i_1760_ + i_1744_;
				}
			}
		}
	}

	void method10054(boolean bool, boolean bool_1766_, boolean bool_1767_, int i, int i_1768_, float f, int i_1769_, int i_1770_, int i_1771_, int i_1772_, int i_1773_, int i_1774_, boolean bool_1775_) {
		if (i_1769_ > 0 && i_1770_ > 0 && (bool || bool_1766_)) {
			int i_1776_ = 0;
			int i_1777_ = 0;
			int i_1778_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
			int i_1779_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
			int i_1780_ = (i_1778_ << 16) / i_1769_;
			int i_1781_ = (i_1779_ << 16) / i_1770_;
			if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
				int i_1782_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_1780_ - 1) / i_1780_);
				i += i_1782_;
				i_1776_ += (i_1782_ * i_1780_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
				int i_1783_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_1781_ - 1) / i_1781_);
				i_1768_ += i_1783_;
				i_1777_ += (i_1783_ * i_1781_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10945 < i_1778_)
				i_1769_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_1776_ + i_1780_ - 1) / i_1780_;
			if (((Class161_Sub3_Sub3) this).anInt10930 < i_1779_)
				i_1770_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_1777_ + i_1781_ - 1) / i_1781_;
			int i_1784_ = i + i_1768_ * ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_1785_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_1769_);
			if (i_1768_ + i_1770_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1770_ -= (i_1768_ + i_1770_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_1768_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1786_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1768_);
				i_1770_ -= i_1786_;
				i_1784_ += i_1786_ * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_1777_ += i_1781_ * i_1786_;
			}
			if (i + i_1769_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1787_ = (i + i_1769_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1769_ -= i_1787_;
				i_1785_ += i_1787_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1788_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1769_ -= i_1788_;
				i_1784_ += i_1788_;
				i_1776_ += i_1780_ * i_1788_;
				i_1785_ += i_1788_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_1773_ == 0) {
				if (i_1771_ == 1) {
					int i_1789_ = i_1776_;
					for (int i_1790_ = -i_1770_; i_1790_ < 0; i_1790_++) {
						int i_1791_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1792_ = -i_1769_; i_1792_ < 0; i_1792_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool)
									is[i_1784_] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1791_]);
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1789_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 0) {
					int i_1793_ = (i_1772_ & 0xff0000) >> 16;
					int i_1794_ = (i_1772_ & 0xff00) >> 8;
					int i_1795_ = i_1772_ & 0xff;
					int i_1796_ = i_1776_;
					for (int i_1797_ = -i_1770_; i_1797_ < 0; i_1797_++) {
						int i_1798_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1799_ = -i_1769_; i_1799_ < 0; i_1799_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1800_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1798_]);
									int i_1801_ = ((i_1800_ & 0xff0000) * i_1793_ & ~0xffffff);
									int i_1802_ = ((i_1800_ & 0xff00) * i_1794_ & 0xff0000);
									int i_1803_ = (i_1800_ & 0xff) * i_1795_ & 0xff00;
									is[i_1784_] = (i_1801_ | i_1802_ | i_1803_) >>> 8;
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1796_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 3) {
					int i_1804_ = i_1776_;
					for (int i_1805_ = -i_1770_; i_1805_ < 0; i_1805_++) {
						int i_1806_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1807_ = -i_1769_; i_1807_ < 0; i_1807_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1808_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1806_]);
									int i_1809_ = i_1808_ + i_1772_;
									int i_1810_ = ((i_1808_ & 0xff00ff) + (i_1772_ & 0xff00ff));
									int i_1811_ = ((i_1810_ & 0x1000100) + (i_1809_ - i_1810_ & 0x10000));
									is[i_1784_] = (i_1809_ - i_1811_ | i_1811_ - (i_1811_ >>> 8));
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1804_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 2) {
					int i_1812_ = i_1772_ >>> 24;
					int i_1813_ = 256 - i_1812_;
					int i_1814_ = (i_1772_ & 0xff00ff) * i_1813_ & ~0xff00ff;
					int i_1815_ = (i_1772_ & 0xff00) * i_1813_ & 0xff0000;
					i_1772_ = (i_1814_ | i_1815_) >>> 8;
					int i_1816_ = i_1776_;
					for (int i_1817_ = -i_1770_; i_1817_ < 0; i_1817_++) {
						int i_1818_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1819_ = -i_1769_; i_1819_ < 0; i_1819_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1820_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1818_]);
									i_1814_ = ((i_1820_ & 0xff00ff) * i_1812_ & ~0xff00ff);
									i_1815_ = ((i_1820_ & 0xff00) * i_1812_ & 0xff0000);
									is[i_1784_] = (((i_1814_ | i_1815_) >>> 8) + i_1772_);
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1816_;
						i_1784_ += i_1785_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1773_ == 1) {
				if (i_1771_ == 1) {
					int i_1821_ = i_1776_;
					for (int i_1822_ = -i_1770_; i_1822_ < 0; i_1822_++) {
						int i_1823_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1824_ = -i_1769_; i_1824_ < 0; i_1824_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1825_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1823_]);
									int i_1826_ = i_1825_ >>> 24;
									int i_1827_ = 256 - i_1826_;
									int i_1828_ = is[i_1784_];
									is[i_1784_] = (((((i_1825_ & 0xff00ff) * i_1826_ + (i_1828_ & 0xff00ff) * i_1827_) & ~0xff00ff) >> 8) + (((((i_1825_ & ~0xff00ff) >>> 8) * i_1826_) + (((i_1828_ & ~0xff00ff) >>> 8) * i_1827_)) & ~0xff00ff));
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1821_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 0) {
					int i_1829_ = i_1776_;
					if ((i_1772_ & 0xffffff) == 16777215) {
						for (int i_1830_ = -i_1770_; i_1830_ < 0; i_1830_++) {
							int i_1831_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1832_ = -i_1769_; i_1832_ < 0; i_1832_++) {
								if (!bool_1766_ || f < fs[i_1784_]) {
									if (bool) {
										int i_1833_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1831_]);
										int i_1834_ = ((i_1833_ >>> 24) * (i_1772_ >>> 24) >> 8);
										int i_1835_ = 256 - i_1834_;
										int i_1836_ = is[i_1784_];
										is[i_1784_] = ((((i_1833_ & 0xff00ff) * i_1834_ + ((i_1836_ & 0xff00ff) * i_1835_)) & ~0xff00ff) + (((i_1833_ & 0xff00) * i_1834_ + ((i_1836_ & 0xff00) * i_1835_)) & 0xff0000)) >> 8;
									}
									if (bool_1766_ && bool_1775_)
										fs[i_1784_] = f;
								}
								i_1776_ += i_1780_;
								i_1784_++;
							}
							i_1777_ += i_1781_;
							i_1776_ = i_1829_;
							i_1784_ += i_1785_;
						}
					} else {
						int i_1837_ = (i_1772_ & 0xff0000) >> 16;
						int i_1838_ = (i_1772_ & 0xff00) >> 8;
						int i_1839_ = i_1772_ & 0xff;
						for (int i_1840_ = -i_1770_; i_1840_ < 0; i_1840_++) {
							int i_1841_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1842_ = -i_1769_; i_1842_ < 0; i_1842_++) {
								if (!bool_1766_ || f < fs[i_1784_]) {
									int i_1843_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1841_]);
									int i_1844_ = ((i_1843_ >>> 24) * (i_1772_ >>> 24) >> 8);
									int i_1845_ = 256 - i_1844_;
									if (i_1844_ != 255) {
										if (bool) {
											int i_1846_ = (((i_1843_ & 0xff0000) * i_1837_) & ~0xffffff);
											int i_1847_ = ((i_1843_ & 0xff00) * i_1838_ & 0xff0000);
											int i_1848_ = ((i_1843_ & 0xff) * i_1839_ & 0xff00);
											i_1843_ = (i_1846_ | i_1847_ | i_1848_) >>> 8;
											int i_1849_ = is[i_1784_];
											is[i_1784_] = (((((i_1843_ & 0xff00ff) * i_1844_) + ((i_1849_ & 0xff00ff) * i_1845_)) & ~0xff00ff) + ((((i_1843_ & 0xff00) * i_1844_) + ((i_1849_ & 0xff00) * i_1845_)) & 0xff0000)) >> 8;
											if (bool_1767_) {
												int i_1850_ = ((i_1849_ >>> 24) + i_1844_);
												if (i_1850_ > 255)
													i_1850_ = 255;
												is[i_1784_] |= i_1850_ << 24;
											}
										}
										if (bool_1766_ && bool_1775_)
											fs[i_1784_] = f;
									} else {
										if (bool) {
											int i_1851_ = (((i_1843_ & 0xff0000) * i_1837_) & ~0xffffff);
											int i_1852_ = ((i_1843_ & 0xff00) * i_1838_ & 0xff0000);
											int i_1853_ = ((i_1843_ & 0xff) * i_1839_ & 0xff00);
											is[i_1784_] = (i_1851_ | i_1852_ | i_1853_) >>> 8;
										}
										if (bool_1766_ && bool_1775_)
											fs[i_1784_] = f;
									}
								}
								i_1776_ += i_1780_;
								i_1784_++;
							}
							i_1777_ += i_1781_;
							i_1776_ = i_1829_;
							i_1784_ += i_1785_;
						}
					}
				} else if (i_1771_ == 3) {
					int i_1854_ = i_1776_;
					for (int i_1855_ = -i_1770_; i_1855_ < 0; i_1855_++) {
						int i_1856_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1857_ = -i_1769_; i_1857_ < 0; i_1857_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1858_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1856_]);
									int i_1859_ = i_1858_ + i_1772_;
									int i_1860_ = ((i_1858_ & 0xff00ff) + (i_1772_ & 0xff00ff));
									int i_1861_ = ((i_1860_ & 0x1000100) + (i_1859_ - i_1860_ & 0x10000));
									i_1861_ = (i_1859_ - i_1861_ | i_1861_ - (i_1861_ >>> 8));
									int i_1862_ = ((i_1861_ >>> 24) * (i_1772_ >>> 24) >> 8);
									int i_1863_ = 256 - i_1862_;
									if (i_1862_ != 255) {
										i_1858_ = i_1861_;
										i_1861_ = is[i_1784_];
										i_1861_ = ((((i_1858_ & 0xff00ff) * i_1862_ + ((i_1861_ & 0xff00ff) * i_1863_)) & ~0xff00ff) + (((i_1858_ & 0xff00) * i_1862_ + ((i_1861_ & 0xff00) * i_1863_)) & 0xff0000)) >> 8;
									}
									is[i_1784_] = i_1861_;
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1854_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 2) {
					int i_1864_ = i_1772_ >>> 24;
					int i_1865_ = 256 - i_1864_;
					int i_1866_ = (i_1772_ & 0xff00ff) * i_1865_ & ~0xff00ff;
					int i_1867_ = (i_1772_ & 0xff00) * i_1865_ & 0xff0000;
					i_1772_ = (i_1866_ | i_1867_) >>> 8;
					int i_1868_ = i_1776_;
					for (int i_1869_ = -i_1770_; i_1869_ < 0; i_1869_++) {
						int i_1870_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1871_ = -i_1769_; i_1871_ < 0; i_1871_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1872_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1870_]);
									int i_1873_ = i_1872_ >>> 24;
									int i_1874_ = 256 - i_1873_;
									i_1866_ = ((i_1872_ & 0xff00ff) * i_1864_ & ~0xff00ff);
									i_1867_ = ((i_1872_ & 0xff00) * i_1864_ & 0xff0000);
									i_1872_ = (((i_1866_ | i_1867_) >>> 8) + i_1772_);
									int i_1875_ = is[i_1784_];
									is[i_1784_] = ((((i_1872_ & 0xff00ff) * i_1873_ + (i_1875_ & 0xff00ff) * i_1874_) & ~0xff00ff) + (((i_1872_ & 0xff00) * i_1873_ + (i_1875_ & 0xff00) * i_1874_) & 0xff0000)) >> 8;
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1868_;
						i_1784_ += i_1785_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1773_ == 2) {
				if (i_1771_ == 1) {
					int i_1876_ = i_1776_;
					for (int i_1877_ = -i_1770_; i_1877_ < 0; i_1877_++) {
						int i_1878_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1879_ = -i_1769_; i_1879_ < 0; i_1879_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								int i_1880_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1878_]);
								if (i_1880_ != 0) {
									if (bool) {
										int i_1881_ = is[i_1784_];
										int i_1882_ = i_1880_ + i_1881_;
										int i_1883_ = ((i_1880_ & 0xff00ff) + (i_1881_ & 0xff00ff));
										i_1881_ = ((i_1883_ & 0x1000100) + (i_1882_ - i_1883_ & 0x10000));
										is[i_1784_] = (i_1882_ - i_1881_ | i_1881_ - (i_1881_ >>> 8));
									}
									if (bool_1766_ && bool_1775_)
										fs[i_1784_] = f;
								}
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1876_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 0) {
					int i_1884_ = i_1776_;
					int i_1885_ = (i_1772_ & 0xff0000) >> 16;
					int i_1886_ = (i_1772_ & 0xff00) >> 8;
					int i_1887_ = i_1772_ & 0xff;
					for (int i_1888_ = -i_1770_; i_1888_ < 0; i_1888_++) {
						int i_1889_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1890_ = -i_1769_; i_1890_ < 0; i_1890_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								int i_1891_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1889_]);
								if (i_1891_ != 0) {
									if (bool) {
										int i_1892_ = ((i_1891_ & 0xff0000) * i_1885_ & ~0xffffff);
										int i_1893_ = ((i_1891_ & 0xff00) * i_1886_ & 0xff0000);
										int i_1894_ = ((i_1891_ & 0xff) * i_1887_ & 0xff00);
										i_1891_ = (i_1892_ | i_1893_ | i_1894_) >>> 8;
										int i_1895_ = is[i_1784_];
										int i_1896_ = i_1891_ + i_1895_;
										int i_1897_ = ((i_1891_ & 0xff00ff) + (i_1895_ & 0xff00ff));
										i_1895_ = ((i_1897_ & 0x1000100) + (i_1896_ - i_1897_ & 0x10000));
										is[i_1784_] = (i_1896_ - i_1895_ | i_1895_ - (i_1895_ >>> 8));
									}
									if (bool_1766_ && bool_1775_)
										fs[i_1784_] = f;
								}
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1884_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 3) {
					int i_1898_ = i_1776_;
					for (int i_1899_ = -i_1770_; i_1899_ < 0; i_1899_++) {
						int i_1900_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1901_ = -i_1769_; i_1901_ < 0; i_1901_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								if (bool) {
									int i_1902_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1900_]);
									int i_1903_ = i_1902_ + i_1772_;
									int i_1904_ = ((i_1902_ & 0xff00ff) + (i_1772_ & 0xff00ff));
									int i_1905_ = ((i_1904_ & 0x1000100) + (i_1903_ - i_1904_ & 0x10000));
									i_1902_ = (i_1903_ - i_1905_ | i_1905_ - (i_1905_ >>> 8));
									i_1905_ = is[i_1784_];
									i_1903_ = i_1902_ + i_1905_;
									i_1904_ = (i_1902_ & 0xff00ff) + (i_1905_ & 0xff00ff);
									i_1905_ = ((i_1904_ & 0x1000100) + (i_1903_ - i_1904_ & 0x10000));
									is[i_1784_] = (i_1903_ - i_1905_ | i_1905_ - (i_1905_ >>> 8));
								}
								if (bool_1766_ && bool_1775_)
									fs[i_1784_] = f;
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1898_;
						i_1784_ += i_1785_;
					}
				} else if (i_1771_ == 2) {
					int i_1906_ = i_1772_ >>> 24;
					int i_1907_ = 256 - i_1906_;
					int i_1908_ = (i_1772_ & 0xff00ff) * i_1907_ & ~0xff00ff;
					int i_1909_ = (i_1772_ & 0xff00) * i_1907_ & 0xff0000;
					i_1772_ = (i_1908_ | i_1909_) >>> 8;
					int i_1910_ = i_1776_;
					for (int i_1911_ = -i_1770_; i_1911_ < 0; i_1911_++) {
						int i_1912_ = ((i_1777_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_1913_ = -i_1769_; i_1913_ < 0; i_1913_++) {
							if (!bool_1766_ || f < fs[i_1784_]) {
								int i_1914_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1776_ >> 16) + i_1912_]);
								if (i_1914_ != 0) {
									if (bool) {
										i_1908_ = ((i_1914_ & 0xff00ff) * i_1906_ & ~0xff00ff);
										i_1909_ = ((i_1914_ & 0xff00) * i_1906_ & 0xff0000);
										i_1914_ = (((i_1908_ | i_1909_) >>> 8) + i_1772_);
										int i_1915_ = is[i_1784_];
										int i_1916_ = i_1914_ + i_1915_;
										int i_1917_ = ((i_1914_ & 0xff00ff) + (i_1915_ & 0xff00ff));
										i_1915_ = ((i_1917_ & 0x1000100) + (i_1916_ - i_1917_ & 0x10000));
										is[i_1784_] = (i_1916_ - i_1915_ | i_1915_ - (i_1915_ >>> 8));
									}
									if (bool_1766_ && bool_1775_)
										fs[i_1784_] = f;
								}
							}
							i_1776_ += i_1780_;
							i_1784_++;
						}
						i_1777_ += i_1781_;
						i_1776_ = i_1910_;
						i_1784_ += i_1785_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface6 method2590() {
		return new Class198(((Class161_Sub3_Sub3) this).anInt10945, ((Class161_Sub3_Sub3) this).anInt10930, ((Class161_Sub3_Sub3) this).anIntArray11238);
	}

	void method2624(int i, int i_1918_, int i_1919_, int i_1920_, int i_1921_, int i_1922_, int i_1923_, int i_1924_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_1919_ > 0 && i_1920_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_1925_ = 0;
				int i_1926_ = 0;
				int i_1927_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_1928_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_1929_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_1930_ = (i_1928_ << 16) / i_1919_;
				int i_1931_ = (i_1929_ << 16) / i_1920_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_1932_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_1930_ - 1) / i_1930_);
					i += i_1932_;
					i_1925_ += (i_1932_ * i_1930_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_1933_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_1931_ - 1) / i_1931_);
					i_1918_ += i_1933_;
					i_1926_ += (i_1933_ * i_1931_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_1928_)
					i_1919_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_1925_ + i_1930_ - 1) / i_1930_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_1929_)
					i_1920_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_1926_ + i_1931_ - 1) / i_1931_;
				int i_1934_ = i + i_1918_ * i_1927_;
				int i_1935_ = i_1927_ - i_1919_;
				if (i_1918_ + i_1920_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_1920_ -= (i_1918_ + i_1920_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_1918_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_1936_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_1918_);
					i_1920_ -= i_1936_;
					i_1934_ += i_1936_ * i_1927_;
					i_1926_ += i_1931_ * i_1936_;
				}
				if (i + i_1919_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_1937_ = (i + i_1919_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_1919_ -= i_1937_;
					i_1935_ += i_1937_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_1938_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_1919_ -= i_1938_;
					i_1934_ += i_1938_;
					i_1925_ += i_1930_ * i_1938_;
					i_1935_ += i_1938_;
				}
				if (i_1923_ == 0) {
					if (i_1921_ == 1) {
						int i_1939_ = i_1925_;
						for (int i_1940_ = -i_1920_; i_1940_ < 0; i_1940_++) {
							int i_1941_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1942_ = -i_1919_; i_1942_ < 0; i_1942_++) {
								is[i_1934_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1941_]);
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_1939_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 0) {
						int i_1943_ = (i_1922_ & 0xff0000) >> 16;
						int i_1944_ = (i_1922_ & 0xff00) >> 8;
						int i_1945_ = i_1922_ & 0xff;
						int i_1946_ = i_1925_;
						for (int i_1947_ = -i_1920_; i_1947_ < 0; i_1947_++) {
							int i_1948_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1949_ = -i_1919_; i_1949_ < 0; i_1949_++) {
								int i_1950_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1948_]);
								int i_1951_ = ((i_1950_ & 0xff0000) * i_1943_ & ~0xffffff);
								int i_1952_ = (i_1950_ & 0xff00) * i_1944_ & 0xff0000;
								int i_1953_ = (i_1950_ & 0xff) * i_1945_ & 0xff00;
								is[i_1934_++] = (i_1951_ | i_1952_ | i_1953_) >>> 8;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_1946_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 3) {
						int i_1954_ = i_1925_;
						for (int i_1955_ = -i_1920_; i_1955_ < 0; i_1955_++) {
							int i_1956_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1957_ = -i_1919_; i_1957_ < 0; i_1957_++) {
								int i_1958_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1956_]);
								int i_1959_ = i_1958_ + i_1922_;
								int i_1960_ = ((i_1958_ & 0xff00ff) + (i_1922_ & 0xff00ff));
								int i_1961_ = ((i_1960_ & 0x1000100) + (i_1959_ - i_1960_ & 0x10000));
								is[i_1934_++] = i_1959_ - i_1961_ | i_1961_ - (i_1961_ >>> 8);
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_1954_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 2) {
						int i_1962_ = i_1922_ >>> 24;
						int i_1963_ = 256 - i_1962_;
						int i_1964_ = (i_1922_ & 0xff00ff) * i_1963_ & ~0xff00ff;
						int i_1965_ = (i_1922_ & 0xff00) * i_1963_ & 0xff0000;
						i_1922_ = (i_1964_ | i_1965_) >>> 8;
						int i_1966_ = i_1925_;
						for (int i_1967_ = -i_1920_; i_1967_ < 0; i_1967_++) {
							int i_1968_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1969_ = -i_1919_; i_1969_ < 0; i_1969_++) {
								int i_1970_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1968_]);
								i_1964_ = ((i_1970_ & 0xff00ff) * i_1962_ & ~0xff00ff);
								i_1965_ = (i_1970_ & 0xff00) * i_1962_ & 0xff0000;
								is[i_1934_++] = ((i_1964_ | i_1965_) >>> 8) + i_1922_;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_1966_;
							i_1934_ += i_1935_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1923_ == 1) {
					if (i_1921_ == 1) {
						int i_1971_ = i_1925_;
						for (int i_1972_ = -i_1920_; i_1972_ < 0; i_1972_++) {
							int i_1973_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_1974_ = -i_1919_; i_1974_ < 0; i_1974_++) {
								int i_1975_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1973_]);
								int i_1976_ = i_1975_ >>> 24;
								int i_1977_ = 256 - i_1976_;
								int i_1978_ = is[i_1934_];
								is[i_1934_++] = (((((i_1975_ & 0xff00ff) * i_1976_ + (i_1978_ & 0xff00ff) * i_1977_) & ~0xff00ff) >> 8) + (((((i_1975_ & ~0xff00ff) >>> 8) * i_1976_) + (((i_1978_ & ~0xff00ff) >>> 8) * i_1977_)) & ~0xff00ff));
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_1971_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 0) {
						int i_1979_ = i_1925_;
						if ((i_1922_ & 0xffffff) == 16777215) {
							for (int i_1980_ = -i_1920_; i_1980_ < 0; i_1980_++) {
								int i_1981_ = ((i_1926_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_1982_ = -i_1919_; i_1982_ < 0; i_1982_++) {
									int i_1983_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1981_]);
									int i_1984_ = ((i_1983_ >>> 24) * (i_1922_ >>> 24) >> 8);
									int i_1985_ = 256 - i_1984_;
									int i_1986_ = is[i_1934_];
									is[i_1934_++] = ((((i_1983_ & 0xff00ff) * i_1984_ + (i_1986_ & 0xff00ff) * i_1985_) & ~0xff00ff) + (((i_1983_ & 0xff00) * i_1984_ + (i_1986_ & 0xff00) * i_1985_) & 0xff0000)) >> 8;
									i_1925_ += i_1930_;
								}
								i_1926_ += i_1931_;
								i_1925_ = i_1979_;
								i_1934_ += i_1935_;
							}
						} else {
							int i_1987_ = (i_1922_ & 0xff0000) >> 16;
							int i_1988_ = (i_1922_ & 0xff00) >> 8;
							int i_1989_ = i_1922_ & 0xff;
							for (int i_1990_ = -i_1920_; i_1990_ < 0; i_1990_++) {
								int i_1991_ = ((i_1926_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_1992_ = -i_1919_; i_1992_ < 0; i_1992_++) {
									int i_1993_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_1991_]);
									int i_1994_ = ((i_1993_ >>> 24) * (i_1922_ >>> 24) >> 8);
									int i_1995_ = 256 - i_1994_;
									if (i_1994_ != 255) {
										int i_1996_ = ((i_1993_ & 0xff0000) * i_1987_ & ~0xffffff);
										int i_1997_ = ((i_1993_ & 0xff00) * i_1988_ & 0xff0000);
										int i_1998_ = ((i_1993_ & 0xff) * i_1989_ & 0xff00);
										i_1993_ = (i_1996_ | i_1997_ | i_1998_) >>> 8;
										int i_1999_ = is[i_1934_];
										is[i_1934_++] = ((((i_1993_ & 0xff00ff) * i_1994_ + ((i_1999_ & 0xff00ff) * i_1995_)) & ~0xff00ff) + (((i_1993_ & 0xff00) * i_1994_ + ((i_1999_ & 0xff00) * i_1995_)) & 0xff0000)) >> 8;
									} else {
										int i_2000_ = ((i_1993_ & 0xff0000) * i_1987_ & ~0xffffff);
										int i_2001_ = ((i_1993_ & 0xff00) * i_1988_ & 0xff0000);
										int i_2002_ = ((i_1993_ & 0xff) * i_1989_ & 0xff00);
										is[i_1934_++] = (i_2000_ | i_2001_ | i_2002_) >>> 8;
									}
									i_1925_ += i_1930_;
								}
								i_1926_ += i_1931_;
								i_1925_ = i_1979_;
								i_1934_ += i_1935_;
							}
						}
					} else if (i_1921_ == 3) {
						int i_2003_ = i_1925_;
						for (int i_2004_ = -i_1920_; i_2004_ < 0; i_2004_++) {
							int i_2005_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2006_ = -i_1919_; i_2006_ < 0; i_2006_++) {
								int i_2007_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2005_]);
								int i_2008_ = i_2007_ + i_1922_;
								int i_2009_ = ((i_2007_ & 0xff00ff) + (i_1922_ & 0xff00ff));
								int i_2010_ = ((i_2009_ & 0x1000100) + (i_2008_ - i_2009_ & 0x10000));
								i_2010_ = i_2008_ - i_2010_ | i_2010_ - (i_2010_ >>> 8);
								int i_2011_ = (i_2010_ >>> 24) * (i_1922_ >>> 24) >> 8;
								int i_2012_ = 256 - i_2011_;
								if (i_2011_ != 255) {
									i_2007_ = i_2010_;
									i_2010_ = is[i_1934_];
									i_2010_ = ((((i_2007_ & 0xff00ff) * i_2011_ + (i_2010_ & 0xff00ff) * i_2012_) & ~0xff00ff) + (((i_2007_ & 0xff00) * i_2011_ + (i_2010_ & 0xff00) * i_2012_) & 0xff0000)) >> 8;
								}
								is[i_1934_++] = i_2010_;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2003_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 2) {
						int i_2013_ = i_1922_ >>> 24;
						int i_2014_ = 256 - i_2013_;
						int i_2015_ = (i_1922_ & 0xff00ff) * i_2014_ & ~0xff00ff;
						int i_2016_ = (i_1922_ & 0xff00) * i_2014_ & 0xff0000;
						i_1922_ = (i_2015_ | i_2016_) >>> 8;
						int i_2017_ = i_1925_;
						for (int i_2018_ = -i_1920_; i_2018_ < 0; i_2018_++) {
							int i_2019_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2020_ = -i_1919_; i_2020_ < 0; i_2020_++) {
								int i_2021_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2019_]);
								int i_2022_ = i_2021_ >>> 24;
								int i_2023_ = 256 - i_2022_;
								i_2015_ = ((i_2021_ & 0xff00ff) * i_2013_ & ~0xff00ff);
								i_2016_ = (i_2021_ & 0xff00) * i_2013_ & 0xff0000;
								i_2021_ = ((i_2015_ | i_2016_) >>> 8) + i_1922_;
								int i_2024_ = is[i_1934_];
								is[i_1934_++] = ((((i_2021_ & 0xff00ff) * i_2022_ + (i_2024_ & 0xff00ff) * i_2023_) & ~0xff00ff) + (((i_2021_ & 0xff00) * i_2022_ + (i_2024_ & 0xff00) * i_2023_) & 0xff0000)) >> 8;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2017_;
							i_1934_ += i_1935_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1923_ == 2) {
					if (i_1921_ == 1) {
						int i_2025_ = i_1925_;
						for (int i_2026_ = -i_1920_; i_2026_ < 0; i_2026_++) {
							int i_2027_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2028_ = -i_1919_; i_2028_ < 0; i_2028_++) {
								int i_2029_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2027_]);
								if (i_2029_ != 0) {
									int i_2030_ = is[i_1934_];
									int i_2031_ = i_2029_ + i_2030_;
									int i_2032_ = ((i_2029_ & 0xff00ff) + (i_2030_ & 0xff00ff));
									i_2030_ = ((i_2032_ & 0x1000100) + (i_2031_ - i_2032_ & 0x10000));
									is[i_1934_++] = (i_2031_ - i_2030_ | i_2030_ - (i_2030_ >>> 8));
								} else
									i_1934_++;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2025_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 0) {
						int i_2033_ = i_1925_;
						int i_2034_ = (i_1922_ & 0xff0000) >> 16;
						int i_2035_ = (i_1922_ & 0xff00) >> 8;
						int i_2036_ = i_1922_ & 0xff;
						for (int i_2037_ = -i_1920_; i_2037_ < 0; i_2037_++) {
							int i_2038_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2039_ = -i_1919_; i_2039_ < 0; i_2039_++) {
								int i_2040_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2038_]);
								if (i_2040_ != 0) {
									int i_2041_ = ((i_2040_ & 0xff0000) * i_2034_ & ~0xffffff);
									int i_2042_ = ((i_2040_ & 0xff00) * i_2035_ & 0xff0000);
									int i_2043_ = (i_2040_ & 0xff) * i_2036_ & 0xff00;
									i_2040_ = (i_2041_ | i_2042_ | i_2043_) >>> 8;
									int i_2044_ = is[i_1934_];
									int i_2045_ = i_2040_ + i_2044_;
									int i_2046_ = ((i_2040_ & 0xff00ff) + (i_2044_ & 0xff00ff));
									i_2044_ = ((i_2046_ & 0x1000100) + (i_2045_ - i_2046_ & 0x10000));
									is[i_1934_++] = (i_2045_ - i_2044_ | i_2044_ - (i_2044_ >>> 8));
								} else
									i_1934_++;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2033_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 3) {
						int i_2047_ = i_1925_;
						for (int i_2048_ = -i_1920_; i_2048_ < 0; i_2048_++) {
							int i_2049_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2050_ = -i_1919_; i_2050_ < 0; i_2050_++) {
								int i_2051_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2049_]);
								int i_2052_ = i_2051_ + i_1922_;
								int i_2053_ = ((i_2051_ & 0xff00ff) + (i_1922_ & 0xff00ff));
								int i_2054_ = ((i_2053_ & 0x1000100) + (i_2052_ - i_2053_ & 0x10000));
								i_2051_ = i_2052_ - i_2054_ | i_2054_ - (i_2054_ >>> 8);
								i_2054_ = is[i_1934_];
								i_2052_ = i_2051_ + i_2054_;
								i_2053_ = (i_2051_ & 0xff00ff) + (i_2054_ & 0xff00ff);
								i_2054_ = ((i_2053_ & 0x1000100) + (i_2052_ - i_2053_ & 0x10000));
								is[i_1934_++] = i_2052_ - i_2054_ | i_2054_ - (i_2054_ >>> 8);
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2047_;
							i_1934_ += i_1935_;
						}
					} else if (i_1921_ == 2) {
						int i_2055_ = i_1922_ >>> 24;
						int i_2056_ = 256 - i_2055_;
						int i_2057_ = (i_1922_ & 0xff00ff) * i_2056_ & ~0xff00ff;
						int i_2058_ = (i_1922_ & 0xff00) * i_2056_ & 0xff0000;
						i_1922_ = (i_2057_ | i_2058_) >>> 8;
						int i_2059_ = i_1925_;
						for (int i_2060_ = -i_1920_; i_2060_ < 0; i_2060_++) {
							int i_2061_ = ((i_1926_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2062_ = -i_1919_; i_2062_ < 0; i_2062_++) {
								int i_2063_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_1925_ >> 16) + i_2061_]);
								if (i_2063_ != 0) {
									i_2057_ = ((i_2063_ & 0xff00ff) * i_2055_ & ~0xff00ff);
									i_2058_ = ((i_2063_ & 0xff00) * i_2055_ & 0xff0000);
									i_2063_ = (((i_2057_ | i_2058_) >>> 8) + i_1922_);
									int i_2064_ = is[i_1934_];
									int i_2065_ = i_2063_ + i_2064_;
									int i_2066_ = ((i_2063_ & 0xff00ff) + (i_2064_ & 0xff00ff));
									i_2064_ = ((i_2066_ & 0x1000100) + (i_2065_ - i_2066_ & 0x10000));
									is[i_1934_++] = (i_2065_ - i_2064_ | i_2064_ - (i_2064_ >>> 8));
								} else
									i_1934_++;
								i_1925_ += i_1930_;
							}
							i_1926_ += i_1931_;
							i_1925_ = i_2059_;
							i_1934_ += i_1935_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2625(int i, int i_2067_, int i_2068_, int i_2069_, int i_2070_, int i_2071_, int i_2072_, int i_2073_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2068_ > 0 && i_2069_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2074_ = 0;
				int i_2075_ = 0;
				int i_2076_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2077_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_2078_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_2079_ = (i_2077_ << 16) / i_2068_;
				int i_2080_ = (i_2078_ << 16) / i_2069_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_2081_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_2079_ - 1) / i_2079_);
					i += i_2081_;
					i_2074_ += (i_2081_ * i_2079_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_2082_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_2080_ - 1) / i_2080_);
					i_2067_ += i_2082_;
					i_2075_ += (i_2082_ * i_2080_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_2077_)
					i_2068_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_2074_ + i_2079_ - 1) / i_2079_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_2078_)
					i_2069_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_2075_ + i_2080_ - 1) / i_2080_;
				int i_2083_ = i + i_2067_ * i_2076_;
				int i_2084_ = i_2076_ - i_2068_;
				if (i_2067_ + i_2069_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2069_ -= (i_2067_ + i_2069_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2067_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2085_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2067_);
					i_2069_ -= i_2085_;
					i_2083_ += i_2085_ * i_2076_;
					i_2075_ += i_2080_ * i_2085_;
				}
				if (i + i_2068_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2086_ = (i + i_2068_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2068_ -= i_2086_;
					i_2084_ += i_2086_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2087_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2068_ -= i_2087_;
					i_2083_ += i_2087_;
					i_2074_ += i_2079_ * i_2087_;
					i_2084_ += i_2087_;
				}
				if (i_2072_ == 0) {
					if (i_2070_ == 1) {
						int i_2088_ = i_2074_;
						for (int i_2089_ = -i_2069_; i_2089_ < 0; i_2089_++) {
							int i_2090_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2091_ = -i_2068_; i_2091_ < 0; i_2091_++) {
								is[i_2083_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2090_]);
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2088_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 0) {
						int i_2092_ = (i_2071_ & 0xff0000) >> 16;
						int i_2093_ = (i_2071_ & 0xff00) >> 8;
						int i_2094_ = i_2071_ & 0xff;
						int i_2095_ = i_2074_;
						for (int i_2096_ = -i_2069_; i_2096_ < 0; i_2096_++) {
							int i_2097_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2098_ = -i_2068_; i_2098_ < 0; i_2098_++) {
								int i_2099_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2097_]);
								int i_2100_ = ((i_2099_ & 0xff0000) * i_2092_ & ~0xffffff);
								int i_2101_ = (i_2099_ & 0xff00) * i_2093_ & 0xff0000;
								int i_2102_ = (i_2099_ & 0xff) * i_2094_ & 0xff00;
								is[i_2083_++] = (i_2100_ | i_2101_ | i_2102_) >>> 8;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2095_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 3) {
						int i_2103_ = i_2074_;
						for (int i_2104_ = -i_2069_; i_2104_ < 0; i_2104_++) {
							int i_2105_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2106_ = -i_2068_; i_2106_ < 0; i_2106_++) {
								int i_2107_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2105_]);
								int i_2108_ = i_2107_ + i_2071_;
								int i_2109_ = ((i_2107_ & 0xff00ff) + (i_2071_ & 0xff00ff));
								int i_2110_ = ((i_2109_ & 0x1000100) + (i_2108_ - i_2109_ & 0x10000));
								is[i_2083_++] = i_2108_ - i_2110_ | i_2110_ - (i_2110_ >>> 8);
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2103_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 2) {
						int i_2111_ = i_2071_ >>> 24;
						int i_2112_ = 256 - i_2111_;
						int i_2113_ = (i_2071_ & 0xff00ff) * i_2112_ & ~0xff00ff;
						int i_2114_ = (i_2071_ & 0xff00) * i_2112_ & 0xff0000;
						i_2071_ = (i_2113_ | i_2114_) >>> 8;
						int i_2115_ = i_2074_;
						for (int i_2116_ = -i_2069_; i_2116_ < 0; i_2116_++) {
							int i_2117_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2118_ = -i_2068_; i_2118_ < 0; i_2118_++) {
								int i_2119_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2117_]);
								i_2113_ = ((i_2119_ & 0xff00ff) * i_2111_ & ~0xff00ff);
								i_2114_ = (i_2119_ & 0xff00) * i_2111_ & 0xff0000;
								is[i_2083_++] = ((i_2113_ | i_2114_) >>> 8) + i_2071_;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2115_;
							i_2083_ += i_2084_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2072_ == 1) {
					if (i_2070_ == 1) {
						int i_2120_ = i_2074_;
						for (int i_2121_ = -i_2069_; i_2121_ < 0; i_2121_++) {
							int i_2122_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2123_ = -i_2068_; i_2123_ < 0; i_2123_++) {
								int i_2124_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2122_]);
								int i_2125_ = i_2124_ >>> 24;
								int i_2126_ = 256 - i_2125_;
								int i_2127_ = is[i_2083_];
								is[i_2083_++] = (((((i_2124_ & 0xff00ff) * i_2125_ + (i_2127_ & 0xff00ff) * i_2126_) & ~0xff00ff) >> 8) + (((((i_2124_ & ~0xff00ff) >>> 8) * i_2125_) + (((i_2127_ & ~0xff00ff) >>> 8) * i_2126_)) & ~0xff00ff));
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2120_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 0) {
						int i_2128_ = i_2074_;
						if ((i_2071_ & 0xffffff) == 16777215) {
							for (int i_2129_ = -i_2069_; i_2129_ < 0; i_2129_++) {
								int i_2130_ = ((i_2075_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_2131_ = -i_2068_; i_2131_ < 0; i_2131_++) {
									int i_2132_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2130_]);
									int i_2133_ = ((i_2132_ >>> 24) * (i_2071_ >>> 24) >> 8);
									int i_2134_ = 256 - i_2133_;
									int i_2135_ = is[i_2083_];
									is[i_2083_++] = ((((i_2132_ & 0xff00ff) * i_2133_ + (i_2135_ & 0xff00ff) * i_2134_) & ~0xff00ff) + (((i_2132_ & 0xff00) * i_2133_ + (i_2135_ & 0xff00) * i_2134_) & 0xff0000)) >> 8;
									i_2074_ += i_2079_;
								}
								i_2075_ += i_2080_;
								i_2074_ = i_2128_;
								i_2083_ += i_2084_;
							}
						} else {
							int i_2136_ = (i_2071_ & 0xff0000) >> 16;
							int i_2137_ = (i_2071_ & 0xff00) >> 8;
							int i_2138_ = i_2071_ & 0xff;
							for (int i_2139_ = -i_2069_; i_2139_ < 0; i_2139_++) {
								int i_2140_ = ((i_2075_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_2141_ = -i_2068_; i_2141_ < 0; i_2141_++) {
									int i_2142_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2140_]);
									int i_2143_ = ((i_2142_ >>> 24) * (i_2071_ >>> 24) >> 8);
									int i_2144_ = 256 - i_2143_;
									if (i_2143_ != 255) {
										int i_2145_ = ((i_2142_ & 0xff0000) * i_2136_ & ~0xffffff);
										int i_2146_ = ((i_2142_ & 0xff00) * i_2137_ & 0xff0000);
										int i_2147_ = ((i_2142_ & 0xff) * i_2138_ & 0xff00);
										i_2142_ = (i_2145_ | i_2146_ | i_2147_) >>> 8;
										int i_2148_ = is[i_2083_];
										is[i_2083_++] = ((((i_2142_ & 0xff00ff) * i_2143_ + ((i_2148_ & 0xff00ff) * i_2144_)) & ~0xff00ff) + (((i_2142_ & 0xff00) * i_2143_ + ((i_2148_ & 0xff00) * i_2144_)) & 0xff0000)) >> 8;
									} else {
										int i_2149_ = ((i_2142_ & 0xff0000) * i_2136_ & ~0xffffff);
										int i_2150_ = ((i_2142_ & 0xff00) * i_2137_ & 0xff0000);
										int i_2151_ = ((i_2142_ & 0xff) * i_2138_ & 0xff00);
										is[i_2083_++] = (i_2149_ | i_2150_ | i_2151_) >>> 8;
									}
									i_2074_ += i_2079_;
								}
								i_2075_ += i_2080_;
								i_2074_ = i_2128_;
								i_2083_ += i_2084_;
							}
						}
					} else if (i_2070_ == 3) {
						int i_2152_ = i_2074_;
						for (int i_2153_ = -i_2069_; i_2153_ < 0; i_2153_++) {
							int i_2154_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2155_ = -i_2068_; i_2155_ < 0; i_2155_++) {
								int i_2156_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2154_]);
								int i_2157_ = i_2156_ + i_2071_;
								int i_2158_ = ((i_2156_ & 0xff00ff) + (i_2071_ & 0xff00ff));
								int i_2159_ = ((i_2158_ & 0x1000100) + (i_2157_ - i_2158_ & 0x10000));
								i_2159_ = i_2157_ - i_2159_ | i_2159_ - (i_2159_ >>> 8);
								int i_2160_ = (i_2159_ >>> 24) * (i_2071_ >>> 24) >> 8;
								int i_2161_ = 256 - i_2160_;
								if (i_2160_ != 255) {
									i_2156_ = i_2159_;
									i_2159_ = is[i_2083_];
									i_2159_ = ((((i_2156_ & 0xff00ff) * i_2160_ + (i_2159_ & 0xff00ff) * i_2161_) & ~0xff00ff) + (((i_2156_ & 0xff00) * i_2160_ + (i_2159_ & 0xff00) * i_2161_) & 0xff0000)) >> 8;
								}
								is[i_2083_++] = i_2159_;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2152_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 2) {
						int i_2162_ = i_2071_ >>> 24;
						int i_2163_ = 256 - i_2162_;
						int i_2164_ = (i_2071_ & 0xff00ff) * i_2163_ & ~0xff00ff;
						int i_2165_ = (i_2071_ & 0xff00) * i_2163_ & 0xff0000;
						i_2071_ = (i_2164_ | i_2165_) >>> 8;
						int i_2166_ = i_2074_;
						for (int i_2167_ = -i_2069_; i_2167_ < 0; i_2167_++) {
							int i_2168_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2169_ = -i_2068_; i_2169_ < 0; i_2169_++) {
								int i_2170_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2168_]);
								int i_2171_ = i_2170_ >>> 24;
								int i_2172_ = 256 - i_2171_;
								i_2164_ = ((i_2170_ & 0xff00ff) * i_2162_ & ~0xff00ff);
								i_2165_ = (i_2170_ & 0xff00) * i_2162_ & 0xff0000;
								i_2170_ = ((i_2164_ | i_2165_) >>> 8) + i_2071_;
								int i_2173_ = is[i_2083_];
								is[i_2083_++] = ((((i_2170_ & 0xff00ff) * i_2171_ + (i_2173_ & 0xff00ff) * i_2172_) & ~0xff00ff) + (((i_2170_ & 0xff00) * i_2171_ + (i_2173_ & 0xff00) * i_2172_) & 0xff0000)) >> 8;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2166_;
							i_2083_ += i_2084_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2072_ == 2) {
					if (i_2070_ == 1) {
						int i_2174_ = i_2074_;
						for (int i_2175_ = -i_2069_; i_2175_ < 0; i_2175_++) {
							int i_2176_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2177_ = -i_2068_; i_2177_ < 0; i_2177_++) {
								int i_2178_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2176_]);
								if (i_2178_ != 0) {
									int i_2179_ = is[i_2083_];
									int i_2180_ = i_2178_ + i_2179_;
									int i_2181_ = ((i_2178_ & 0xff00ff) + (i_2179_ & 0xff00ff));
									i_2179_ = ((i_2181_ & 0x1000100) + (i_2180_ - i_2181_ & 0x10000));
									is[i_2083_++] = (i_2180_ - i_2179_ | i_2179_ - (i_2179_ >>> 8));
								} else
									i_2083_++;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2174_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 0) {
						int i_2182_ = i_2074_;
						int i_2183_ = (i_2071_ & 0xff0000) >> 16;
						int i_2184_ = (i_2071_ & 0xff00) >> 8;
						int i_2185_ = i_2071_ & 0xff;
						for (int i_2186_ = -i_2069_; i_2186_ < 0; i_2186_++) {
							int i_2187_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2188_ = -i_2068_; i_2188_ < 0; i_2188_++) {
								int i_2189_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2187_]);
								if (i_2189_ != 0) {
									int i_2190_ = ((i_2189_ & 0xff0000) * i_2183_ & ~0xffffff);
									int i_2191_ = ((i_2189_ & 0xff00) * i_2184_ & 0xff0000);
									int i_2192_ = (i_2189_ & 0xff) * i_2185_ & 0xff00;
									i_2189_ = (i_2190_ | i_2191_ | i_2192_) >>> 8;
									int i_2193_ = is[i_2083_];
									int i_2194_ = i_2189_ + i_2193_;
									int i_2195_ = ((i_2189_ & 0xff00ff) + (i_2193_ & 0xff00ff));
									i_2193_ = ((i_2195_ & 0x1000100) + (i_2194_ - i_2195_ & 0x10000));
									is[i_2083_++] = (i_2194_ - i_2193_ | i_2193_ - (i_2193_ >>> 8));
								} else
									i_2083_++;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2182_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 3) {
						int i_2196_ = i_2074_;
						for (int i_2197_ = -i_2069_; i_2197_ < 0; i_2197_++) {
							int i_2198_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2199_ = -i_2068_; i_2199_ < 0; i_2199_++) {
								int i_2200_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2198_]);
								int i_2201_ = i_2200_ + i_2071_;
								int i_2202_ = ((i_2200_ & 0xff00ff) + (i_2071_ & 0xff00ff));
								int i_2203_ = ((i_2202_ & 0x1000100) + (i_2201_ - i_2202_ & 0x10000));
								i_2200_ = i_2201_ - i_2203_ | i_2203_ - (i_2203_ >>> 8);
								i_2203_ = is[i_2083_];
								i_2201_ = i_2200_ + i_2203_;
								i_2202_ = (i_2200_ & 0xff00ff) + (i_2203_ & 0xff00ff);
								i_2203_ = ((i_2202_ & 0x1000100) + (i_2201_ - i_2202_ & 0x10000));
								is[i_2083_++] = i_2201_ - i_2203_ | i_2203_ - (i_2203_ >>> 8);
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2196_;
							i_2083_ += i_2084_;
						}
					} else if (i_2070_ == 2) {
						int i_2204_ = i_2071_ >>> 24;
						int i_2205_ = 256 - i_2204_;
						int i_2206_ = (i_2071_ & 0xff00ff) * i_2205_ & ~0xff00ff;
						int i_2207_ = (i_2071_ & 0xff00) * i_2205_ & 0xff0000;
						i_2071_ = (i_2206_ | i_2207_) >>> 8;
						int i_2208_ = i_2074_;
						for (int i_2209_ = -i_2069_; i_2209_ < 0; i_2209_++) {
							int i_2210_ = ((i_2075_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2211_ = -i_2068_; i_2211_ < 0; i_2211_++) {
								int i_2212_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2074_ >> 16) + i_2210_]);
								if (i_2212_ != 0) {
									i_2206_ = ((i_2212_ & 0xff00ff) * i_2204_ & ~0xff00ff);
									i_2207_ = ((i_2212_ & 0xff00) * i_2204_ & 0xff0000);
									i_2212_ = (((i_2206_ | i_2207_) >>> 8) + i_2071_);
									int i_2213_ = is[i_2083_];
									int i_2214_ = i_2212_ + i_2213_;
									int i_2215_ = ((i_2212_ & 0xff00ff) + (i_2213_ & 0xff00ff));
									i_2213_ = ((i_2215_ & 0x1000100) + (i_2214_ - i_2215_ & 0x10000));
									is[i_2083_++] = (i_2214_ - i_2213_ | i_2213_ - (i_2213_ >>> 8));
								} else
									i_2083_++;
								i_2074_ += i_2079_;
							}
							i_2075_ += i_2080_;
							i_2074_ = i_2208_;
							i_2083_ += i_2084_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2593(int i, int i_2216_, int i_2217_, int i_2218_, int i_2219_, int i_2220_, int i_2221_, int i_2222_) {
		if (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2217_ > 0 && i_2218_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2223_ = 0;
				int i_2224_ = 0;
				int i_2225_ = (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2226_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
				int i_2227_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
				int i_2228_ = (i_2226_ << 16) / i_2217_;
				int i_2229_ = (i_2227_ << 16) / i_2218_;
				if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
					int i_2230_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_2228_ - 1) / i_2228_);
					i += i_2230_;
					i_2223_ += (i_2230_ * i_2228_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
					int i_2231_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_2229_ - 1) / i_2229_);
					i_2216_ += i_2231_;
					i_2224_ += (i_2231_ * i_2229_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub3) this).anInt10945 < i_2226_)
					i_2217_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_2223_ + i_2228_ - 1) / i_2228_;
				if (((Class161_Sub3_Sub3) this).anInt10930 < i_2227_)
					i_2218_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_2224_ + i_2229_ - 1) / i_2229_;
				int i_2232_ = i + i_2216_ * i_2225_;
				int i_2233_ = i_2225_ - i_2217_;
				if (i_2216_ + i_2218_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2218_ -= (i_2216_ + i_2218_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2216_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2234_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2216_);
					i_2218_ -= i_2234_;
					i_2232_ += i_2234_ * i_2225_;
					i_2224_ += i_2229_ * i_2234_;
				}
				if (i + i_2217_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2235_ = (i + i_2217_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2217_ -= i_2235_;
					i_2233_ += i_2235_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2236_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2217_ -= i_2236_;
					i_2232_ += i_2236_;
					i_2223_ += i_2228_ * i_2236_;
					i_2233_ += i_2236_;
				}
				if (i_2221_ == 0) {
					if (i_2219_ == 1) {
						int i_2237_ = i_2223_;
						for (int i_2238_ = -i_2218_; i_2238_ < 0; i_2238_++) {
							int i_2239_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2240_ = -i_2217_; i_2240_ < 0; i_2240_++) {
								is[i_2232_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2239_]);
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2237_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 0) {
						int i_2241_ = (i_2220_ & 0xff0000) >> 16;
						int i_2242_ = (i_2220_ & 0xff00) >> 8;
						int i_2243_ = i_2220_ & 0xff;
						int i_2244_ = i_2223_;
						for (int i_2245_ = -i_2218_; i_2245_ < 0; i_2245_++) {
							int i_2246_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2247_ = -i_2217_; i_2247_ < 0; i_2247_++) {
								int i_2248_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2246_]);
								int i_2249_ = ((i_2248_ & 0xff0000) * i_2241_ & ~0xffffff);
								int i_2250_ = (i_2248_ & 0xff00) * i_2242_ & 0xff0000;
								int i_2251_ = (i_2248_ & 0xff) * i_2243_ & 0xff00;
								is[i_2232_++] = (i_2249_ | i_2250_ | i_2251_) >>> 8;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2244_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 3) {
						int i_2252_ = i_2223_;
						for (int i_2253_ = -i_2218_; i_2253_ < 0; i_2253_++) {
							int i_2254_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2255_ = -i_2217_; i_2255_ < 0; i_2255_++) {
								int i_2256_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2254_]);
								int i_2257_ = i_2256_ + i_2220_;
								int i_2258_ = ((i_2256_ & 0xff00ff) + (i_2220_ & 0xff00ff));
								int i_2259_ = ((i_2258_ & 0x1000100) + (i_2257_ - i_2258_ & 0x10000));
								is[i_2232_++] = i_2257_ - i_2259_ | i_2259_ - (i_2259_ >>> 8);
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2252_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 2) {
						int i_2260_ = i_2220_ >>> 24;
						int i_2261_ = 256 - i_2260_;
						int i_2262_ = (i_2220_ & 0xff00ff) * i_2261_ & ~0xff00ff;
						int i_2263_ = (i_2220_ & 0xff00) * i_2261_ & 0xff0000;
						i_2220_ = (i_2262_ | i_2263_) >>> 8;
						int i_2264_ = i_2223_;
						for (int i_2265_ = -i_2218_; i_2265_ < 0; i_2265_++) {
							int i_2266_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2267_ = -i_2217_; i_2267_ < 0; i_2267_++) {
								int i_2268_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2266_]);
								i_2262_ = ((i_2268_ & 0xff00ff) * i_2260_ & ~0xff00ff);
								i_2263_ = (i_2268_ & 0xff00) * i_2260_ & 0xff0000;
								is[i_2232_++] = ((i_2262_ | i_2263_) >>> 8) + i_2220_;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2264_;
							i_2232_ += i_2233_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2221_ == 1) {
					if (i_2219_ == 1) {
						int i_2269_ = i_2223_;
						for (int i_2270_ = -i_2218_; i_2270_ < 0; i_2270_++) {
							int i_2271_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2272_ = -i_2217_; i_2272_ < 0; i_2272_++) {
								int i_2273_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2271_]);
								int i_2274_ = i_2273_ >>> 24;
								int i_2275_ = 256 - i_2274_;
								int i_2276_ = is[i_2232_];
								is[i_2232_++] = (((((i_2273_ & 0xff00ff) * i_2274_ + (i_2276_ & 0xff00ff) * i_2275_) & ~0xff00ff) >> 8) + (((((i_2273_ & ~0xff00ff) >>> 8) * i_2274_) + (((i_2276_ & ~0xff00ff) >>> 8) * i_2275_)) & ~0xff00ff));
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2269_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 0) {
						int i_2277_ = i_2223_;
						if ((i_2220_ & 0xffffff) == 16777215) {
							for (int i_2278_ = -i_2218_; i_2278_ < 0; i_2278_++) {
								int i_2279_ = ((i_2224_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_2280_ = -i_2217_; i_2280_ < 0; i_2280_++) {
									int i_2281_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2279_]);
									int i_2282_ = ((i_2281_ >>> 24) * (i_2220_ >>> 24) >> 8);
									int i_2283_ = 256 - i_2282_;
									int i_2284_ = is[i_2232_];
									is[i_2232_++] = ((((i_2281_ & 0xff00ff) * i_2282_ + (i_2284_ & 0xff00ff) * i_2283_) & ~0xff00ff) + (((i_2281_ & 0xff00) * i_2282_ + (i_2284_ & 0xff00) * i_2283_) & 0xff0000)) >> 8;
									i_2223_ += i_2228_;
								}
								i_2224_ += i_2229_;
								i_2223_ = i_2277_;
								i_2232_ += i_2233_;
							}
						} else {
							int i_2285_ = (i_2220_ & 0xff0000) >> 16;
							int i_2286_ = (i_2220_ & 0xff00) >> 8;
							int i_2287_ = i_2220_ & 0xff;
							for (int i_2288_ = -i_2218_; i_2288_ < 0; i_2288_++) {
								int i_2289_ = ((i_2224_ >> 16) * (((Class161_Sub3_Sub3) this).anInt10945));
								for (int i_2290_ = -i_2217_; i_2290_ < 0; i_2290_++) {
									int i_2291_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2289_]);
									int i_2292_ = ((i_2291_ >>> 24) * (i_2220_ >>> 24) >> 8);
									int i_2293_ = 256 - i_2292_;
									if (i_2292_ != 255) {
										int i_2294_ = ((i_2291_ & 0xff0000) * i_2285_ & ~0xffffff);
										int i_2295_ = ((i_2291_ & 0xff00) * i_2286_ & 0xff0000);
										int i_2296_ = ((i_2291_ & 0xff) * i_2287_ & 0xff00);
										i_2291_ = (i_2294_ | i_2295_ | i_2296_) >>> 8;
										int i_2297_ = is[i_2232_];
										is[i_2232_++] = ((((i_2291_ & 0xff00ff) * i_2292_ + ((i_2297_ & 0xff00ff) * i_2293_)) & ~0xff00ff) + (((i_2291_ & 0xff00) * i_2292_ + ((i_2297_ & 0xff00) * i_2293_)) & 0xff0000)) >> 8;
									} else {
										int i_2298_ = ((i_2291_ & 0xff0000) * i_2285_ & ~0xffffff);
										int i_2299_ = ((i_2291_ & 0xff00) * i_2286_ & 0xff0000);
										int i_2300_ = ((i_2291_ & 0xff) * i_2287_ & 0xff00);
										is[i_2232_++] = (i_2298_ | i_2299_ | i_2300_) >>> 8;
									}
									i_2223_ += i_2228_;
								}
								i_2224_ += i_2229_;
								i_2223_ = i_2277_;
								i_2232_ += i_2233_;
							}
						}
					} else if (i_2219_ == 3) {
						int i_2301_ = i_2223_;
						for (int i_2302_ = -i_2218_; i_2302_ < 0; i_2302_++) {
							int i_2303_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2304_ = -i_2217_; i_2304_ < 0; i_2304_++) {
								int i_2305_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2303_]);
								int i_2306_ = i_2305_ + i_2220_;
								int i_2307_ = ((i_2305_ & 0xff00ff) + (i_2220_ & 0xff00ff));
								int i_2308_ = ((i_2307_ & 0x1000100) + (i_2306_ - i_2307_ & 0x10000));
								i_2308_ = i_2306_ - i_2308_ | i_2308_ - (i_2308_ >>> 8);
								int i_2309_ = (i_2308_ >>> 24) * (i_2220_ >>> 24) >> 8;
								int i_2310_ = 256 - i_2309_;
								if (i_2309_ != 255) {
									i_2305_ = i_2308_;
									i_2308_ = is[i_2232_];
									i_2308_ = ((((i_2305_ & 0xff00ff) * i_2309_ + (i_2308_ & 0xff00ff) * i_2310_) & ~0xff00ff) + (((i_2305_ & 0xff00) * i_2309_ + (i_2308_ & 0xff00) * i_2310_) & 0xff0000)) >> 8;
								}
								is[i_2232_++] = i_2308_;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2301_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 2) {
						int i_2311_ = i_2220_ >>> 24;
						int i_2312_ = 256 - i_2311_;
						int i_2313_ = (i_2220_ & 0xff00ff) * i_2312_ & ~0xff00ff;
						int i_2314_ = (i_2220_ & 0xff00) * i_2312_ & 0xff0000;
						i_2220_ = (i_2313_ | i_2314_) >>> 8;
						int i_2315_ = i_2223_;
						for (int i_2316_ = -i_2218_; i_2316_ < 0; i_2316_++) {
							int i_2317_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2318_ = -i_2217_; i_2318_ < 0; i_2318_++) {
								int i_2319_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2317_]);
								int i_2320_ = i_2319_ >>> 24;
								int i_2321_ = 256 - i_2320_;
								i_2313_ = ((i_2319_ & 0xff00ff) * i_2311_ & ~0xff00ff);
								i_2314_ = (i_2319_ & 0xff00) * i_2311_ & 0xff0000;
								i_2319_ = ((i_2313_ | i_2314_) >>> 8) + i_2220_;
								int i_2322_ = is[i_2232_];
								is[i_2232_++] = ((((i_2319_ & 0xff00ff) * i_2320_ + (i_2322_ & 0xff00ff) * i_2321_) & ~0xff00ff) + (((i_2319_ & 0xff00) * i_2320_ + (i_2322_ & 0xff00) * i_2321_) & 0xff0000)) >> 8;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2315_;
							i_2232_ += i_2233_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2221_ == 2) {
					if (i_2219_ == 1) {
						int i_2323_ = i_2223_;
						for (int i_2324_ = -i_2218_; i_2324_ < 0; i_2324_++) {
							int i_2325_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2326_ = -i_2217_; i_2326_ < 0; i_2326_++) {
								int i_2327_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2325_]);
								if (i_2327_ != 0) {
									int i_2328_ = is[i_2232_];
									int i_2329_ = i_2327_ + i_2328_;
									int i_2330_ = ((i_2327_ & 0xff00ff) + (i_2328_ & 0xff00ff));
									i_2328_ = ((i_2330_ & 0x1000100) + (i_2329_ - i_2330_ & 0x10000));
									is[i_2232_++] = (i_2329_ - i_2328_ | i_2328_ - (i_2328_ >>> 8));
								} else
									i_2232_++;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2323_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 0) {
						int i_2331_ = i_2223_;
						int i_2332_ = (i_2220_ & 0xff0000) >> 16;
						int i_2333_ = (i_2220_ & 0xff00) >> 8;
						int i_2334_ = i_2220_ & 0xff;
						for (int i_2335_ = -i_2218_; i_2335_ < 0; i_2335_++) {
							int i_2336_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2337_ = -i_2217_; i_2337_ < 0; i_2337_++) {
								int i_2338_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2336_]);
								if (i_2338_ != 0) {
									int i_2339_ = ((i_2338_ & 0xff0000) * i_2332_ & ~0xffffff);
									int i_2340_ = ((i_2338_ & 0xff00) * i_2333_ & 0xff0000);
									int i_2341_ = (i_2338_ & 0xff) * i_2334_ & 0xff00;
									i_2338_ = (i_2339_ | i_2340_ | i_2341_) >>> 8;
									int i_2342_ = is[i_2232_];
									int i_2343_ = i_2338_ + i_2342_;
									int i_2344_ = ((i_2338_ & 0xff00ff) + (i_2342_ & 0xff00ff));
									i_2342_ = ((i_2344_ & 0x1000100) + (i_2343_ - i_2344_ & 0x10000));
									is[i_2232_++] = (i_2343_ - i_2342_ | i_2342_ - (i_2342_ >>> 8));
								} else
									i_2232_++;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2331_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 3) {
						int i_2345_ = i_2223_;
						for (int i_2346_ = -i_2218_; i_2346_ < 0; i_2346_++) {
							int i_2347_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2348_ = -i_2217_; i_2348_ < 0; i_2348_++) {
								int i_2349_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2347_]);
								int i_2350_ = i_2349_ + i_2220_;
								int i_2351_ = ((i_2349_ & 0xff00ff) + (i_2220_ & 0xff00ff));
								int i_2352_ = ((i_2351_ & 0x1000100) + (i_2350_ - i_2351_ & 0x10000));
								i_2349_ = i_2350_ - i_2352_ | i_2352_ - (i_2352_ >>> 8);
								i_2352_ = is[i_2232_];
								i_2350_ = i_2349_ + i_2352_;
								i_2351_ = (i_2349_ & 0xff00ff) + (i_2352_ & 0xff00ff);
								i_2352_ = ((i_2351_ & 0x1000100) + (i_2350_ - i_2351_ & 0x10000));
								is[i_2232_++] = i_2350_ - i_2352_ | i_2352_ - (i_2352_ >>> 8);
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2345_;
							i_2232_ += i_2233_;
						}
					} else if (i_2219_ == 2) {
						int i_2353_ = i_2220_ >>> 24;
						int i_2354_ = 256 - i_2353_;
						int i_2355_ = (i_2220_ & 0xff00ff) * i_2354_ & ~0xff00ff;
						int i_2356_ = (i_2220_ & 0xff00) * i_2354_ & 0xff0000;
						i_2220_ = (i_2355_ | i_2356_) >>> 8;
						int i_2357_ = i_2223_;
						for (int i_2358_ = -i_2218_; i_2358_ < 0; i_2358_++) {
							int i_2359_ = ((i_2224_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2360_ = -i_2217_; i_2360_ < 0; i_2360_++) {
								int i_2361_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2223_ >> 16) + i_2359_]);
								if (i_2361_ != 0) {
									i_2355_ = ((i_2361_ & 0xff00ff) * i_2353_ & ~0xff00ff);
									i_2356_ = ((i_2361_ & 0xff00) * i_2353_ & 0xff0000);
									i_2361_ = (((i_2355_ | i_2356_) >>> 8) + i_2220_);
									int i_2362_ = is[i_2232_];
									int i_2363_ = i_2361_ + i_2362_;
									int i_2364_ = ((i_2361_ & 0xff00ff) + (i_2362_ & 0xff00ff));
									i_2362_ = ((i_2364_ & 0x1000100) + (i_2363_ - i_2364_ & 0x10000));
									is[i_2232_++] = (i_2363_ - i_2362_ | i_2362_ - (i_2362_ >>> 8));
								} else
									i_2232_++;
								i_2223_ += i_2228_;
							}
							i_2224_ += i_2229_;
							i_2223_ = i_2357_;
							i_2232_ += i_2233_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10058(int i, int i_2365_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2366_ = anInt10940;
					while (i_2366_ < 0) {
						int i_2367_ = anInt10944;
						int i_2368_ = anInt10951;
						int i_2369_ = anInt10952;
						int i_2370_ = anInt10958;
						if (i_2368_ >= 0 && i_2369_ >= 0 && (i_2368_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_2369_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2370_ < 0; i_2370_++)
								method10192((((i_2369_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2368_ >> 12)), i_2367_++, is, i, i_2365_);
						}
						i_2366_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2371_ = anInt10940;
					while (i_2371_ < 0) {
						int i_2372_ = anInt10944;
						int i_2373_ = anInt10951;
						int i_2374_ = anInt10952 + anInt10954;
						int i_2375_ = anInt10958;
						if (i_2373_ >= 0 && (i_2373_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							int i_2376_;
							if ((i_2376_ = (i_2374_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_2376_ = (anInt10946 - i_2376_) / anInt10946;
								i_2375_ += i_2376_;
								i_2374_ += anInt10946 * i_2376_;
								i_2372_ += i_2376_;
							}
							if ((i_2376_ = (i_2374_ - anInt10946) / anInt10946) > i_2375_)
								i_2375_ = i_2376_;
							for (/**/; i_2375_ < 0; i_2375_++) {
								method10192((((i_2374_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2373_ >> 12)), i_2372_++, is, i, i_2365_);
								i_2374_ += anInt10946;
							}
						}
						i_2371_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2377_ = anInt10940;
					while (i_2377_ < 0) {
						int i_2378_ = anInt10944;
						int i_2379_ = anInt10951;
						int i_2380_ = anInt10952 + anInt10954;
						int i_2381_ = anInt10958;
						if (i_2379_ >= 0 && (i_2379_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							if (i_2380_ < 0) {
								int i_2382_ = (anInt10946 - 1 - i_2380_) / anInt10946;
								i_2381_ += i_2382_;
								i_2380_ += anInt10946 * i_2382_;
								i_2378_ += i_2382_;
							}
							int i_2383_;
							if ((i_2383_ = (1 + i_2380_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2381_)
								i_2381_ = i_2383_;
							for (/**/; i_2381_ < 0; i_2381_++) {
								method10192((((i_2380_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2379_ >> 12)), i_2378_++, is, i, i_2365_);
								i_2380_ += anInt10946;
							}
						}
						i_2377_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2384_ = anInt10940;
					while (i_2384_ < 0) {
						int i_2385_ = anInt10944;
						int i_2386_ = anInt10951 + anInt10953;
						int i_2387_ = anInt10952;
						int i_2388_ = anInt10958;
						if (i_2387_ >= 0 && (i_2387_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							int i_2389_;
							if ((i_2389_ = (i_2386_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_2389_ = (anInt10956 - i_2389_) / anInt10956;
								i_2388_ += i_2389_;
								i_2386_ += anInt10956 * i_2389_;
								i_2385_ += i_2389_;
							}
							if ((i_2389_ = (i_2386_ - anInt10956) / anInt10956) > i_2388_)
								i_2388_ = i_2389_;
							for (/**/; i_2388_ < 0; i_2388_++) {
								method10192((((i_2387_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2386_ >> 12)), i_2385_++, is, i, i_2365_);
								i_2386_ += anInt10956;
							}
						}
						i_2384_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2390_ = anInt10940;
					while (i_2390_ < 0) {
						int i_2391_ = anInt10944;
						int i_2392_ = anInt10951 + anInt10953;
						int i_2393_ = anInt10952 + anInt10954;
						int i_2394_ = anInt10958;
						int i_2395_;
						if ((i_2395_ = i_2392_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2395_ = (anInt10956 - i_2395_) / anInt10956;
							i_2394_ += i_2395_;
							i_2392_ += anInt10956 * i_2395_;
							i_2393_ += anInt10946 * i_2395_;
							i_2391_ += i_2395_;
						}
						if ((i_2395_ = (i_2392_ - anInt10956) / anInt10956) > i_2394_)
							i_2394_ = i_2395_;
						if ((i_2395_ = i_2393_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
							i_2395_ = (anInt10946 - i_2395_) / anInt10946;
							i_2394_ += i_2395_;
							i_2392_ += anInt10956 * i_2395_;
							i_2393_ += anInt10946 * i_2395_;
							i_2391_ += i_2395_;
						}
						if ((i_2395_ = (i_2393_ - anInt10946) / anInt10946) > i_2394_)
							i_2394_ = i_2395_;
						for (/**/; i_2394_ < 0; i_2394_++) {
							method10192(((i_2393_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2392_ >> 12), i_2391_++, is, i, i_2365_);
							i_2392_ += anInt10956;
							i_2393_ += anInt10946;
						}
						i_2390_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2396_ = anInt10940;
					while (i_2396_ < 0) {
						int i_2397_ = anInt10944;
						int i_2398_ = anInt10951 + anInt10953;
						int i_2399_ = anInt10952 + anInt10954;
						int i_2400_ = anInt10958;
						int i_2401_;
						if ((i_2401_ = i_2398_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2401_ = (anInt10956 - i_2401_) / anInt10956;
							i_2400_ += i_2401_;
							i_2398_ += anInt10956 * i_2401_;
							i_2399_ += anInt10946 * i_2401_;
							i_2397_ += i_2401_;
						}
						if ((i_2401_ = (i_2398_ - anInt10956) / anInt10956) > i_2400_)
							i_2400_ = i_2401_;
						if (i_2399_ < 0) {
							i_2401_ = (anInt10946 - 1 - i_2399_) / anInt10946;
							i_2400_ += i_2401_;
							i_2398_ += anInt10956 * i_2401_;
							i_2399_ += anInt10946 * i_2401_;
							i_2397_ += i_2401_;
						}
						if ((i_2401_ = (1 + i_2399_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2400_)
							i_2400_ = i_2401_;
						for (/**/; i_2400_ < 0; i_2400_++) {
							method10192(((i_2399_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2398_ >> 12), i_2397_++, is, i, i_2365_);
							i_2398_ += anInt10956;
							i_2399_ += anInt10946;
						}
						i_2396_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2402_ = anInt10940;
				while (i_2402_ < 0) {
					int i_2403_ = anInt10944;
					int i_2404_ = anInt10951 + anInt10953;
					int i_2405_ = anInt10952;
					int i_2406_ = anInt10958;
					if (i_2405_ >= 0 && i_2405_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
						if (i_2404_ < 0) {
							int i_2407_ = (anInt10956 - 1 - i_2404_) / anInt10956;
							i_2406_ += i_2407_;
							i_2404_ += anInt10956 * i_2407_;
							i_2403_ += i_2407_;
						}
						int i_2408_;
						if ((i_2408_ = (1 + i_2404_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2406_)
							i_2406_ = i_2408_;
						for (/**/; i_2406_ < 0; i_2406_++) {
							method10192(((i_2405_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2404_ >> 12), i_2403_++, is, i, i_2365_);
							i_2404_ += anInt10956;
						}
					}
					i_2402_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2409_ = anInt10940; i_2409_ < 0; i_2409_++) {
					int i_2410_ = anInt10944;
					int i_2411_ = anInt10951 + anInt10953;
					int i_2412_ = anInt10952 + anInt10954;
					int i_2413_ = anInt10958;
					if (i_2411_ < 0) {
						int i_2414_ = (anInt10956 - 1 - i_2411_) / anInt10956;
						i_2413_ += i_2414_;
						i_2411_ += anInt10956 * i_2414_;
						i_2412_ += anInt10946 * i_2414_;
						i_2410_ += i_2414_;
					}
					int i_2415_;
					if ((i_2415_ = (1 + i_2411_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2413_)
						i_2413_ = i_2415_;
					if ((i_2415_ = i_2412_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
						i_2415_ = (anInt10946 - i_2415_) / anInt10946;
						i_2413_ += i_2415_;
						i_2411_ += anInt10956 * i_2415_;
						i_2412_ += anInt10946 * i_2415_;
						i_2410_ += i_2415_;
					}
					if ((i_2415_ = (i_2412_ - anInt10946) / anInt10946) > i_2413_)
						i_2413_ = i_2415_;
					for (/**/; i_2413_ < 0; i_2413_++) {
						method10192((((i_2412_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2411_ >> 12)), i_2410_++, is, i, i_2365_);
						i_2411_ += anInt10956;
						i_2412_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2416_ = anInt10940; i_2416_ < 0; i_2416_++) {
					int i_2417_ = anInt10944;
					int i_2418_ = anInt10951 + anInt10953;
					int i_2419_ = anInt10952 + anInt10954;
					int i_2420_ = anInt10958;
					if (i_2418_ < 0) {
						int i_2421_ = (anInt10956 - 1 - i_2418_) / anInt10956;
						i_2420_ += i_2421_;
						i_2418_ += anInt10956 * i_2421_;
						i_2419_ += anInt10946 * i_2421_;
						i_2417_ += i_2421_;
					}
					int i_2422_;
					if ((i_2422_ = (1 + i_2418_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2420_)
						i_2420_ = i_2422_;
					if (i_2419_ < 0) {
						i_2422_ = (anInt10946 - 1 - i_2419_) / anInt10946;
						i_2420_ += i_2422_;
						i_2418_ += anInt10956 * i_2422_;
						i_2419_ += anInt10946 * i_2422_;
						i_2417_ += i_2422_;
					}
					if ((i_2422_ = (1 + i_2419_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2420_)
						i_2420_ = i_2422_;
					for (/**/; i_2420_ < 0; i_2420_++) {
						method10192((((i_2419_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2418_ >> 12)), i_2417_++, is, i, i_2365_);
						i_2418_ += anInt10956;
						i_2419_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public void method2607(int i, int i_2423_, int i_2424_, int i_2425_, int i_2426_, int i_2427_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_2428_ = 0; i_2428_ < i_2425_; i_2428_++) {
			int i_2429_ = (i_2423_ + i_2428_) * i_2424_ + i;
			int i_2430_ = (i_2427_ + i_2428_) * i_2424_ + i_2426_;
			for (int i_2431_ = 0; i_2431_ < i_2424_; i_2431_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_2429_ + i_2431_] = is[i_2430_ + i_2431_] & 0xffffff;
		}
	}

	void method10056(int i, int i_2432_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2433_ = anInt10940;
					while (i_2433_ < 0) {
						int i_2434_ = anInt10944;
						int i_2435_ = anInt10951;
						int i_2436_ = anInt10952;
						int i_2437_ = anInt10958;
						if (i_2435_ >= 0 && i_2436_ >= 0 && (i_2435_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_2436_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2437_ < 0; i_2437_++)
								method10192((((i_2436_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2435_ >> 12)), i_2434_++, is, i, i_2432_);
						}
						i_2433_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2438_ = anInt10940;
					while (i_2438_ < 0) {
						int i_2439_ = anInt10944;
						int i_2440_ = anInt10951;
						int i_2441_ = anInt10952 + anInt10954;
						int i_2442_ = anInt10958;
						if (i_2440_ >= 0 && (i_2440_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							int i_2443_;
							if ((i_2443_ = (i_2441_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_2443_ = (anInt10946 - i_2443_) / anInt10946;
								i_2442_ += i_2443_;
								i_2441_ += anInt10946 * i_2443_;
								i_2439_ += i_2443_;
							}
							if ((i_2443_ = (i_2441_ - anInt10946) / anInt10946) > i_2442_)
								i_2442_ = i_2443_;
							for (/**/; i_2442_ < 0; i_2442_++) {
								method10192((((i_2441_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2440_ >> 12)), i_2439_++, is, i, i_2432_);
								i_2441_ += anInt10946;
							}
						}
						i_2438_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2444_ = anInt10940;
					while (i_2444_ < 0) {
						int i_2445_ = anInt10944;
						int i_2446_ = anInt10951;
						int i_2447_ = anInt10952 + anInt10954;
						int i_2448_ = anInt10958;
						if (i_2446_ >= 0 && (i_2446_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							if (i_2447_ < 0) {
								int i_2449_ = (anInt10946 - 1 - i_2447_) / anInt10946;
								i_2448_ += i_2449_;
								i_2447_ += anInt10946 * i_2449_;
								i_2445_ += i_2449_;
							}
							int i_2450_;
							if ((i_2450_ = (1 + i_2447_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2448_)
								i_2448_ = i_2450_;
							for (/**/; i_2448_ < 0; i_2448_++) {
								method10192((((i_2447_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2446_ >> 12)), i_2445_++, is, i, i_2432_);
								i_2447_ += anInt10946;
							}
						}
						i_2444_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2451_ = anInt10940;
					while (i_2451_ < 0) {
						int i_2452_ = anInt10944;
						int i_2453_ = anInt10951 + anInt10953;
						int i_2454_ = anInt10952;
						int i_2455_ = anInt10958;
						if (i_2454_ >= 0 && (i_2454_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							int i_2456_;
							if ((i_2456_ = (i_2453_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_2456_ = (anInt10956 - i_2456_) / anInt10956;
								i_2455_ += i_2456_;
								i_2453_ += anInt10956 * i_2456_;
								i_2452_ += i_2456_;
							}
							if ((i_2456_ = (i_2453_ - anInt10956) / anInt10956) > i_2455_)
								i_2455_ = i_2456_;
							for (/**/; i_2455_ < 0; i_2455_++) {
								method10192((((i_2454_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2453_ >> 12)), i_2452_++, is, i, i_2432_);
								i_2453_ += anInt10956;
							}
						}
						i_2451_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2457_ = anInt10940;
					while (i_2457_ < 0) {
						int i_2458_ = anInt10944;
						int i_2459_ = anInt10951 + anInt10953;
						int i_2460_ = anInt10952 + anInt10954;
						int i_2461_ = anInt10958;
						int i_2462_;
						if ((i_2462_ = i_2459_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2462_ = (anInt10956 - i_2462_) / anInt10956;
							i_2461_ += i_2462_;
							i_2459_ += anInt10956 * i_2462_;
							i_2460_ += anInt10946 * i_2462_;
							i_2458_ += i_2462_;
						}
						if ((i_2462_ = (i_2459_ - anInt10956) / anInt10956) > i_2461_)
							i_2461_ = i_2462_;
						if ((i_2462_ = i_2460_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
							i_2462_ = (anInt10946 - i_2462_) / anInt10946;
							i_2461_ += i_2462_;
							i_2459_ += anInt10956 * i_2462_;
							i_2460_ += anInt10946 * i_2462_;
							i_2458_ += i_2462_;
						}
						if ((i_2462_ = (i_2460_ - anInt10946) / anInt10946) > i_2461_)
							i_2461_ = i_2462_;
						for (/**/; i_2461_ < 0; i_2461_++) {
							method10192(((i_2460_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2459_ >> 12), i_2458_++, is, i, i_2432_);
							i_2459_ += anInt10956;
							i_2460_ += anInt10946;
						}
						i_2457_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2463_ = anInt10940;
					while (i_2463_ < 0) {
						int i_2464_ = anInt10944;
						int i_2465_ = anInt10951 + anInt10953;
						int i_2466_ = anInt10952 + anInt10954;
						int i_2467_ = anInt10958;
						int i_2468_;
						if ((i_2468_ = i_2465_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2468_ = (anInt10956 - i_2468_) / anInt10956;
							i_2467_ += i_2468_;
							i_2465_ += anInt10956 * i_2468_;
							i_2466_ += anInt10946 * i_2468_;
							i_2464_ += i_2468_;
						}
						if ((i_2468_ = (i_2465_ - anInt10956) / anInt10956) > i_2467_)
							i_2467_ = i_2468_;
						if (i_2466_ < 0) {
							i_2468_ = (anInt10946 - 1 - i_2466_) / anInt10946;
							i_2467_ += i_2468_;
							i_2465_ += anInt10956 * i_2468_;
							i_2466_ += anInt10946 * i_2468_;
							i_2464_ += i_2468_;
						}
						if ((i_2468_ = (1 + i_2466_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2467_)
							i_2467_ = i_2468_;
						for (/**/; i_2467_ < 0; i_2467_++) {
							method10192(((i_2466_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2465_ >> 12), i_2464_++, is, i, i_2432_);
							i_2465_ += anInt10956;
							i_2466_ += anInt10946;
						}
						i_2463_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2469_ = anInt10940;
				while (i_2469_ < 0) {
					int i_2470_ = anInt10944;
					int i_2471_ = anInt10951 + anInt10953;
					int i_2472_ = anInt10952;
					int i_2473_ = anInt10958;
					if (i_2472_ >= 0 && i_2472_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
						if (i_2471_ < 0) {
							int i_2474_ = (anInt10956 - 1 - i_2471_) / anInt10956;
							i_2473_ += i_2474_;
							i_2471_ += anInt10956 * i_2474_;
							i_2470_ += i_2474_;
						}
						int i_2475_;
						if ((i_2475_ = (1 + i_2471_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2473_)
							i_2473_ = i_2475_;
						for (/**/; i_2473_ < 0; i_2473_++) {
							method10192(((i_2472_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2471_ >> 12), i_2470_++, is, i, i_2432_);
							i_2471_ += anInt10956;
						}
					}
					i_2469_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2476_ = anInt10940; i_2476_ < 0; i_2476_++) {
					int i_2477_ = anInt10944;
					int i_2478_ = anInt10951 + anInt10953;
					int i_2479_ = anInt10952 + anInt10954;
					int i_2480_ = anInt10958;
					if (i_2478_ < 0) {
						int i_2481_ = (anInt10956 - 1 - i_2478_) / anInt10956;
						i_2480_ += i_2481_;
						i_2478_ += anInt10956 * i_2481_;
						i_2479_ += anInt10946 * i_2481_;
						i_2477_ += i_2481_;
					}
					int i_2482_;
					if ((i_2482_ = (1 + i_2478_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2480_)
						i_2480_ = i_2482_;
					if ((i_2482_ = i_2479_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
						i_2482_ = (anInt10946 - i_2482_) / anInt10946;
						i_2480_ += i_2482_;
						i_2478_ += anInt10956 * i_2482_;
						i_2479_ += anInt10946 * i_2482_;
						i_2477_ += i_2482_;
					}
					if ((i_2482_ = (i_2479_ - anInt10946) / anInt10946) > i_2480_)
						i_2480_ = i_2482_;
					for (/**/; i_2480_ < 0; i_2480_++) {
						method10192((((i_2479_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2478_ >> 12)), i_2477_++, is, i, i_2432_);
						i_2478_ += anInt10956;
						i_2479_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2483_ = anInt10940; i_2483_ < 0; i_2483_++) {
					int i_2484_ = anInt10944;
					int i_2485_ = anInt10951 + anInt10953;
					int i_2486_ = anInt10952 + anInt10954;
					int i_2487_ = anInt10958;
					if (i_2485_ < 0) {
						int i_2488_ = (anInt10956 - 1 - i_2485_) / anInt10956;
						i_2487_ += i_2488_;
						i_2485_ += anInt10956 * i_2488_;
						i_2486_ += anInt10946 * i_2488_;
						i_2484_ += i_2488_;
					}
					int i_2489_;
					if ((i_2489_ = (1 + i_2485_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2487_)
						i_2487_ = i_2489_;
					if (i_2486_ < 0) {
						i_2489_ = (anInt10946 - 1 - i_2486_) / anInt10946;
						i_2487_ += i_2489_;
						i_2485_ += anInt10956 * i_2489_;
						i_2486_ += anInt10946 * i_2489_;
						i_2484_ += i_2489_;
					}
					if ((i_2489_ = (1 + i_2486_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2487_)
						i_2487_ = i_2489_;
					for (/**/; i_2487_ < 0; i_2487_++) {
						method10192((((i_2486_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2485_ >> 12)), i_2484_++, is, i, i_2432_);
						i_2485_ += anInt10956;
						i_2486_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10052(int i, int i_2490_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2491_ = anInt10940;
					while (i_2491_ < 0) {
						int i_2492_ = anInt10944;
						int i_2493_ = anInt10951;
						int i_2494_ = anInt10952;
						int i_2495_ = anInt10958;
						if (i_2493_ >= 0 && i_2494_ >= 0 && (i_2493_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_2494_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2495_ < 0; i_2495_++)
								method10192((((i_2494_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2493_ >> 12)), i_2492_++, is, i, i_2490_);
						}
						i_2491_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2496_ = anInt10940;
					while (i_2496_ < 0) {
						int i_2497_ = anInt10944;
						int i_2498_ = anInt10951;
						int i_2499_ = anInt10952 + anInt10954;
						int i_2500_ = anInt10958;
						if (i_2498_ >= 0 && (i_2498_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							int i_2501_;
							if ((i_2501_ = (i_2499_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_2501_ = (anInt10946 - i_2501_) / anInt10946;
								i_2500_ += i_2501_;
								i_2499_ += anInt10946 * i_2501_;
								i_2497_ += i_2501_;
							}
							if ((i_2501_ = (i_2499_ - anInt10946) / anInt10946) > i_2500_)
								i_2500_ = i_2501_;
							for (/**/; i_2500_ < 0; i_2500_++) {
								method10192((((i_2499_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2498_ >> 12)), i_2497_++, is, i, i_2490_);
								i_2499_ += anInt10946;
							}
						}
						i_2496_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2502_ = anInt10940;
					while (i_2502_ < 0) {
						int i_2503_ = anInt10944;
						int i_2504_ = anInt10951;
						int i_2505_ = anInt10952 + anInt10954;
						int i_2506_ = anInt10958;
						if (i_2504_ >= 0 && (i_2504_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							if (i_2505_ < 0) {
								int i_2507_ = (anInt10946 - 1 - i_2505_) / anInt10946;
								i_2506_ += i_2507_;
								i_2505_ += anInt10946 * i_2507_;
								i_2503_ += i_2507_;
							}
							int i_2508_;
							if ((i_2508_ = (1 + i_2505_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2506_)
								i_2506_ = i_2508_;
							for (/**/; i_2506_ < 0; i_2506_++) {
								method10192((((i_2505_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2504_ >> 12)), i_2503_++, is, i, i_2490_);
								i_2505_ += anInt10946;
							}
						}
						i_2502_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2509_ = anInt10940;
					while (i_2509_ < 0) {
						int i_2510_ = anInt10944;
						int i_2511_ = anInt10951 + anInt10953;
						int i_2512_ = anInt10952;
						int i_2513_ = anInt10958;
						if (i_2512_ >= 0 && (i_2512_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							int i_2514_;
							if ((i_2514_ = (i_2511_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_2514_ = (anInt10956 - i_2514_) / anInt10956;
								i_2513_ += i_2514_;
								i_2511_ += anInt10956 * i_2514_;
								i_2510_ += i_2514_;
							}
							if ((i_2514_ = (i_2511_ - anInt10956) / anInt10956) > i_2513_)
								i_2513_ = i_2514_;
							for (/**/; i_2513_ < 0; i_2513_++) {
								method10192((((i_2512_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2511_ >> 12)), i_2510_++, is, i, i_2490_);
								i_2511_ += anInt10956;
							}
						}
						i_2509_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2515_ = anInt10940;
					while (i_2515_ < 0) {
						int i_2516_ = anInt10944;
						int i_2517_ = anInt10951 + anInt10953;
						int i_2518_ = anInt10952 + anInt10954;
						int i_2519_ = anInt10958;
						int i_2520_;
						if ((i_2520_ = i_2517_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2520_ = (anInt10956 - i_2520_) / anInt10956;
							i_2519_ += i_2520_;
							i_2517_ += anInt10956 * i_2520_;
							i_2518_ += anInt10946 * i_2520_;
							i_2516_ += i_2520_;
						}
						if ((i_2520_ = (i_2517_ - anInt10956) / anInt10956) > i_2519_)
							i_2519_ = i_2520_;
						if ((i_2520_ = i_2518_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
							i_2520_ = (anInt10946 - i_2520_) / anInt10946;
							i_2519_ += i_2520_;
							i_2517_ += anInt10956 * i_2520_;
							i_2518_ += anInt10946 * i_2520_;
							i_2516_ += i_2520_;
						}
						if ((i_2520_ = (i_2518_ - anInt10946) / anInt10946) > i_2519_)
							i_2519_ = i_2520_;
						for (/**/; i_2519_ < 0; i_2519_++) {
							method10192(((i_2518_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2517_ >> 12), i_2516_++, is, i, i_2490_);
							i_2517_ += anInt10956;
							i_2518_ += anInt10946;
						}
						i_2515_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2521_ = anInt10940;
					while (i_2521_ < 0) {
						int i_2522_ = anInt10944;
						int i_2523_ = anInt10951 + anInt10953;
						int i_2524_ = anInt10952 + anInt10954;
						int i_2525_ = anInt10958;
						int i_2526_;
						if ((i_2526_ = i_2523_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2526_ = (anInt10956 - i_2526_) / anInt10956;
							i_2525_ += i_2526_;
							i_2523_ += anInt10956 * i_2526_;
							i_2524_ += anInt10946 * i_2526_;
							i_2522_ += i_2526_;
						}
						if ((i_2526_ = (i_2523_ - anInt10956) / anInt10956) > i_2525_)
							i_2525_ = i_2526_;
						if (i_2524_ < 0) {
							i_2526_ = (anInt10946 - 1 - i_2524_) / anInt10946;
							i_2525_ += i_2526_;
							i_2523_ += anInt10956 * i_2526_;
							i_2524_ += anInt10946 * i_2526_;
							i_2522_ += i_2526_;
						}
						if ((i_2526_ = (1 + i_2524_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2525_)
							i_2525_ = i_2526_;
						for (/**/; i_2525_ < 0; i_2525_++) {
							method10192(((i_2524_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2523_ >> 12), i_2522_++, is, i, i_2490_);
							i_2523_ += anInt10956;
							i_2524_ += anInt10946;
						}
						i_2521_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2527_ = anInt10940;
				while (i_2527_ < 0) {
					int i_2528_ = anInt10944;
					int i_2529_ = anInt10951 + anInt10953;
					int i_2530_ = anInt10952;
					int i_2531_ = anInt10958;
					if (i_2530_ >= 0 && i_2530_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
						if (i_2529_ < 0) {
							int i_2532_ = (anInt10956 - 1 - i_2529_) / anInt10956;
							i_2531_ += i_2532_;
							i_2529_ += anInt10956 * i_2532_;
							i_2528_ += i_2532_;
						}
						int i_2533_;
						if ((i_2533_ = (1 + i_2529_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2531_)
							i_2531_ = i_2533_;
						for (/**/; i_2531_ < 0; i_2531_++) {
							method10192(((i_2530_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2529_ >> 12), i_2528_++, is, i, i_2490_);
							i_2529_ += anInt10956;
						}
					}
					i_2527_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2534_ = anInt10940; i_2534_ < 0; i_2534_++) {
					int i_2535_ = anInt10944;
					int i_2536_ = anInt10951 + anInt10953;
					int i_2537_ = anInt10952 + anInt10954;
					int i_2538_ = anInt10958;
					if (i_2536_ < 0) {
						int i_2539_ = (anInt10956 - 1 - i_2536_) / anInt10956;
						i_2538_ += i_2539_;
						i_2536_ += anInt10956 * i_2539_;
						i_2537_ += anInt10946 * i_2539_;
						i_2535_ += i_2539_;
					}
					int i_2540_;
					if ((i_2540_ = (1 + i_2536_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2538_)
						i_2538_ = i_2540_;
					if ((i_2540_ = i_2537_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
						i_2540_ = (anInt10946 - i_2540_) / anInt10946;
						i_2538_ += i_2540_;
						i_2536_ += anInt10956 * i_2540_;
						i_2537_ += anInt10946 * i_2540_;
						i_2535_ += i_2540_;
					}
					if ((i_2540_ = (i_2537_ - anInt10946) / anInt10946) > i_2538_)
						i_2538_ = i_2540_;
					for (/**/; i_2538_ < 0; i_2538_++) {
						method10192((((i_2537_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2536_ >> 12)), i_2535_++, is, i, i_2490_);
						i_2536_ += anInt10956;
						i_2537_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2541_ = anInt10940; i_2541_ < 0; i_2541_++) {
					int i_2542_ = anInt10944;
					int i_2543_ = anInt10951 + anInt10953;
					int i_2544_ = anInt10952 + anInt10954;
					int i_2545_ = anInt10958;
					if (i_2543_ < 0) {
						int i_2546_ = (anInt10956 - 1 - i_2543_) / anInt10956;
						i_2545_ += i_2546_;
						i_2543_ += anInt10956 * i_2546_;
						i_2544_ += anInt10946 * i_2546_;
						i_2542_ += i_2546_;
					}
					int i_2547_;
					if ((i_2547_ = (1 + i_2543_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2545_)
						i_2545_ = i_2547_;
					if (i_2544_ < 0) {
						i_2547_ = (anInt10946 - 1 - i_2544_) / anInt10946;
						i_2545_ += i_2547_;
						i_2543_ += anInt10956 * i_2547_;
						i_2544_ += anInt10946 * i_2547_;
						i_2542_ += i_2547_;
					}
					if ((i_2547_ = (1 + i_2544_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2545_)
						i_2545_ = i_2547_;
					for (/**/; i_2545_ < 0; i_2545_++) {
						method10192((((i_2544_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2543_ >> 12)), i_2542_++, is, i, i_2490_);
						i_2543_ += anInt10956;
						i_2544_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public Interface6 method2616() {
		return new Class198(((Class161_Sub3_Sub3) this).anInt10945, ((Class161_Sub3_Sub3) this).anInt10930, ((Class161_Sub3_Sub3) this).anIntArray11238);
	}

	void method10060(int i, int i_2548_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_2549_ = anInt10940;
					while (i_2549_ < 0) {
						int i_2550_ = anInt10944;
						int i_2551_ = anInt10951;
						int i_2552_ = anInt10952;
						int i_2553_ = anInt10958;
						if (i_2551_ >= 0 && i_2552_ >= 0 && (i_2551_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0 && (i_2552_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							for (/**/; i_2553_ < 0; i_2553_++)
								method10192((((i_2552_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2551_ >> 12)), i_2550_++, is, i, i_2548_);
						}
						i_2549_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2554_ = anInt10940;
					while (i_2554_ < 0) {
						int i_2555_ = anInt10944;
						int i_2556_ = anInt10951;
						int i_2557_ = anInt10952 + anInt10954;
						int i_2558_ = anInt10958;
						if (i_2556_ >= 0 && (i_2556_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							int i_2559_;
							if ((i_2559_ = (i_2557_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12))) >= 0) {
								i_2559_ = (anInt10946 - i_2559_) / anInt10946;
								i_2558_ += i_2559_;
								i_2557_ += anInt10946 * i_2559_;
								i_2555_ += i_2559_;
							}
							if ((i_2559_ = (i_2557_ - anInt10946) / anInt10946) > i_2558_)
								i_2558_ = i_2559_;
							for (/**/; i_2558_ < 0; i_2558_++) {
								method10192((((i_2557_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2556_ >> 12)), i_2555_++, is, i, i_2548_);
								i_2557_ += anInt10946;
							}
						}
						i_2554_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2560_ = anInt10940;
					while (i_2560_ < 0) {
						int i_2561_ = anInt10944;
						int i_2562_ = anInt10951;
						int i_2563_ = anInt10952 + anInt10954;
						int i_2564_ = anInt10958;
						if (i_2562_ >= 0 && (i_2562_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12)) < 0) {
							if (i_2563_ < 0) {
								int i_2565_ = (anInt10946 - 1 - i_2563_) / anInt10946;
								i_2564_ += i_2565_;
								i_2563_ += anInt10946 * i_2565_;
								i_2561_ += i_2565_;
							}
							int i_2566_;
							if ((i_2566_ = (1 + i_2563_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2564_)
								i_2564_ = i_2566_;
							for (/**/; i_2564_ < 0; i_2564_++) {
								method10192((((i_2563_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2562_ >> 12)), i_2561_++, is, i, i_2548_);
								i_2563_ += anInt10946;
							}
						}
						i_2560_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_2567_ = anInt10940;
					while (i_2567_ < 0) {
						int i_2568_ = anInt10944;
						int i_2569_ = anInt10951 + anInt10953;
						int i_2570_ = anInt10952;
						int i_2571_ = anInt10958;
						if (i_2570_ >= 0 && (i_2570_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) < 0) {
							int i_2572_;
							if ((i_2572_ = (i_2569_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12))) >= 0) {
								i_2572_ = (anInt10956 - i_2572_) / anInt10956;
								i_2571_ += i_2572_;
								i_2569_ += anInt10956 * i_2572_;
								i_2568_ += i_2572_;
							}
							if ((i_2572_ = (i_2569_ - anInt10956) / anInt10956) > i_2571_)
								i_2571_ = i_2572_;
							for (/**/; i_2571_ < 0; i_2571_++) {
								method10192((((i_2570_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2569_ >> 12)), i_2568_++, is, i, i_2548_);
								i_2569_ += anInt10956;
							}
						}
						i_2567_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_2573_ = anInt10940;
					while (i_2573_ < 0) {
						int i_2574_ = anInt10944;
						int i_2575_ = anInt10951 + anInt10953;
						int i_2576_ = anInt10952 + anInt10954;
						int i_2577_ = anInt10958;
						int i_2578_;
						if ((i_2578_ = i_2575_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2578_ = (anInt10956 - i_2578_) / anInt10956;
							i_2577_ += i_2578_;
							i_2575_ += anInt10956 * i_2578_;
							i_2576_ += anInt10946 * i_2578_;
							i_2574_ += i_2578_;
						}
						if ((i_2578_ = (i_2575_ - anInt10956) / anInt10956) > i_2577_)
							i_2577_ = i_2578_;
						if ((i_2578_ = i_2576_ - ((((Class161_Sub3_Sub3) this).anInt10930) << 12)) >= 0) {
							i_2578_ = (anInt10946 - i_2578_) / anInt10946;
							i_2577_ += i_2578_;
							i_2575_ += anInt10956 * i_2578_;
							i_2576_ += anInt10946 * i_2578_;
							i_2574_ += i_2578_;
						}
						if ((i_2578_ = (i_2576_ - anInt10946) / anInt10946) > i_2577_)
							i_2577_ = i_2578_;
						for (/**/; i_2577_ < 0; i_2577_++) {
							method10192(((i_2576_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2575_ >> 12), i_2574_++, is, i, i_2548_);
							i_2575_ += anInt10956;
							i_2576_ += anInt10946;
						}
						i_2573_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_2579_ = anInt10940;
					while (i_2579_ < 0) {
						int i_2580_ = anInt10944;
						int i_2581_ = anInt10951 + anInt10953;
						int i_2582_ = anInt10952 + anInt10954;
						int i_2583_ = anInt10958;
						int i_2584_;
						if ((i_2584_ = i_2581_ - ((((Class161_Sub3_Sub3) this).anInt10945) << 12)) >= 0) {
							i_2584_ = (anInt10956 - i_2584_) / anInt10956;
							i_2583_ += i_2584_;
							i_2581_ += anInt10956 * i_2584_;
							i_2582_ += anInt10946 * i_2584_;
							i_2580_ += i_2584_;
						}
						if ((i_2584_ = (i_2581_ - anInt10956) / anInt10956) > i_2583_)
							i_2583_ = i_2584_;
						if (i_2582_ < 0) {
							i_2584_ = (anInt10946 - 1 - i_2582_) / anInt10946;
							i_2583_ += i_2584_;
							i_2581_ += anInt10956 * i_2584_;
							i_2582_ += anInt10946 * i_2584_;
							i_2580_ += i_2584_;
						}
						if ((i_2584_ = (1 + i_2582_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2583_)
							i_2583_ = i_2584_;
						for (/**/; i_2583_ < 0; i_2583_++) {
							method10192(((i_2582_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2581_ >> 12), i_2580_++, is, i, i_2548_);
							i_2581_ += anInt10956;
							i_2582_ += anInt10946;
						}
						i_2579_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_2585_ = anInt10940;
				while (i_2585_ < 0) {
					int i_2586_ = anInt10944;
					int i_2587_ = anInt10951 + anInt10953;
					int i_2588_ = anInt10952;
					int i_2589_ = anInt10958;
					if (i_2588_ >= 0 && i_2588_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) < 0) {
						if (i_2587_ < 0) {
							int i_2590_ = (anInt10956 - 1 - i_2587_) / anInt10956;
							i_2589_ += i_2590_;
							i_2587_ += anInt10956 * i_2590_;
							i_2586_ += i_2590_;
						}
						int i_2591_;
						if ((i_2591_ = (1 + i_2587_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2589_)
							i_2589_ = i_2591_;
						for (/**/; i_2589_ < 0; i_2589_++) {
							method10192(((i_2588_ >> 12) * (((Class161_Sub3_Sub3) this).anInt10945)) + (i_2587_ >> 12), i_2586_++, is, i, i_2548_);
							i_2587_ += anInt10956;
						}
					}
					i_2585_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_2592_ = anInt10940; i_2592_ < 0; i_2592_++) {
					int i_2593_ = anInt10944;
					int i_2594_ = anInt10951 + anInt10953;
					int i_2595_ = anInt10952 + anInt10954;
					int i_2596_ = anInt10958;
					if (i_2594_ < 0) {
						int i_2597_ = (anInt10956 - 1 - i_2594_) / anInt10956;
						i_2596_ += i_2597_;
						i_2594_ += anInt10956 * i_2597_;
						i_2595_ += anInt10946 * i_2597_;
						i_2593_ += i_2597_;
					}
					int i_2598_;
					if ((i_2598_ = (1 + i_2594_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2596_)
						i_2596_ = i_2598_;
					if ((i_2598_ = i_2595_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12)) >= 0) {
						i_2598_ = (anInt10946 - i_2598_) / anInt10946;
						i_2596_ += i_2598_;
						i_2594_ += anInt10956 * i_2598_;
						i_2595_ += anInt10946 * i_2598_;
						i_2593_ += i_2598_;
					}
					if ((i_2598_ = (i_2595_ - anInt10946) / anInt10946) > i_2596_)
						i_2596_ = i_2598_;
					for (/**/; i_2596_ < 0; i_2596_++) {
						method10192((((i_2595_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2594_ >> 12)), i_2593_++, is, i, i_2548_);
						i_2594_ += anInt10956;
						i_2595_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_2599_ = anInt10940; i_2599_ < 0; i_2599_++) {
					int i_2600_ = anInt10944;
					int i_2601_ = anInt10951 + anInt10953;
					int i_2602_ = anInt10952 + anInt10954;
					int i_2603_ = anInt10958;
					if (i_2601_ < 0) {
						int i_2604_ = (anInt10956 - 1 - i_2601_) / anInt10956;
						i_2603_ += i_2604_;
						i_2601_ += anInt10956 * i_2604_;
						i_2602_ += anInt10946 * i_2604_;
						i_2600_ += i_2604_;
					}
					int i_2605_;
					if ((i_2605_ = (1 + i_2601_ - (((Class161_Sub3_Sub3) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_2603_)
						i_2603_ = i_2605_;
					if (i_2602_ < 0) {
						i_2605_ = (anInt10946 - 1 - i_2602_) / anInt10946;
						i_2603_ += i_2605_;
						i_2601_ += anInt10956 * i_2605_;
						i_2602_ += anInt10946 * i_2605_;
						i_2600_ += i_2605_;
					}
					if ((i_2605_ = (1 + i_2602_ - (((Class161_Sub3_Sub3) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_2603_)
						i_2603_ = i_2605_;
					for (/**/; i_2603_ < 0; i_2603_++) {
						method10192((((i_2602_ >> 12) * ((Class161_Sub3_Sub3) this).anInt10945) + (i_2601_ >> 12)), i_2600_++, is, i, i_2548_);
						i_2601_ += anInt10956;
						i_2602_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10055(boolean bool, boolean bool_2606_, boolean bool_2607_, int i, int i_2608_, float f, int i_2609_, int i_2610_, int i_2611_, int i_2612_, int i_2613_, int i_2614_, boolean bool_2615_) {
		if (i_2609_ > 0 && i_2610_ > 0 && (bool || bool_2606_)) {
			int i_2616_ = 0;
			int i_2617_ = 0;
			int i_2618_ = (((Class161_Sub3_Sub3) this).anInt10942 + ((Class161_Sub3_Sub3) this).anInt10945 + ((Class161_Sub3_Sub3) this).anInt10933);
			int i_2619_ = (((Class161_Sub3_Sub3) this).anInt10929 + ((Class161_Sub3_Sub3) this).anInt10930 + ((Class161_Sub3_Sub3) this).anInt10948);
			int i_2620_ = (i_2618_ << 16) / i_2609_;
			int i_2621_ = (i_2619_ << 16) / i_2610_;
			if (((Class161_Sub3_Sub3) this).anInt10942 > 0) {
				int i_2622_ = (((((Class161_Sub3_Sub3) this).anInt10942 << 16) + i_2620_ - 1) / i_2620_);
				i += i_2622_;
				i_2616_ += (i_2622_ * i_2620_ - (((Class161_Sub3_Sub3) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10929 > 0) {
				int i_2623_ = (((((Class161_Sub3_Sub3) this).anInt10929 << 16) + i_2621_ - 1) / i_2621_);
				i_2608_ += i_2623_;
				i_2617_ += (i_2623_ * i_2621_ - (((Class161_Sub3_Sub3) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub3) this).anInt10945 < i_2618_)
				i_2609_ = ((((Class161_Sub3_Sub3) this).anInt10945 << 16) - i_2616_ + i_2620_ - 1) / i_2620_;
			if (((Class161_Sub3_Sub3) this).anInt10930 < i_2619_)
				i_2610_ = ((((Class161_Sub3_Sub3) this).anInt10930 << 16) - i_2617_ + i_2621_ - 1) / i_2621_;
			int i_2624_ = i + i_2608_ * ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_2625_ = ((((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_2609_);
			if (i_2608_ + i_2610_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2610_ -= (i_2608_ + i_2610_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_2608_ < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2626_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_2608_);
				i_2610_ -= i_2626_;
				i_2624_ += i_2626_ * (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_2617_ += i_2621_ * i_2626_;
			}
			if (i + i_2609_ > (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2627_ = (i + i_2609_ - (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2609_ -= i_2627_;
				i_2625_ += i_2627_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2628_ = ((((Class106_Sub2) (((Class161_Sub3_Sub3) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2609_ -= i_2628_;
				i_2624_ += i_2628_;
				i_2616_ += i_2620_ * i_2628_;
				i_2625_ += i_2628_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub3) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_2613_ == 0) {
				if (i_2611_ == 1) {
					int i_2629_ = i_2616_;
					for (int i_2630_ = -i_2610_; i_2630_ < 0; i_2630_++) {
						int i_2631_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2632_ = -i_2609_; i_2632_ < 0; i_2632_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool)
									is[i_2624_] = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2631_]);
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2629_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 0) {
					int i_2633_ = (i_2612_ & 0xff0000) >> 16;
					int i_2634_ = (i_2612_ & 0xff00) >> 8;
					int i_2635_ = i_2612_ & 0xff;
					int i_2636_ = i_2616_;
					for (int i_2637_ = -i_2610_; i_2637_ < 0; i_2637_++) {
						int i_2638_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2639_ = -i_2609_; i_2639_ < 0; i_2639_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2640_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2638_]);
									int i_2641_ = ((i_2640_ & 0xff0000) * i_2633_ & ~0xffffff);
									int i_2642_ = ((i_2640_ & 0xff00) * i_2634_ & 0xff0000);
									int i_2643_ = (i_2640_ & 0xff) * i_2635_ & 0xff00;
									is[i_2624_] = (i_2641_ | i_2642_ | i_2643_) >>> 8;
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2636_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 3) {
					int i_2644_ = i_2616_;
					for (int i_2645_ = -i_2610_; i_2645_ < 0; i_2645_++) {
						int i_2646_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2647_ = -i_2609_; i_2647_ < 0; i_2647_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2648_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2646_]);
									int i_2649_ = i_2648_ + i_2612_;
									int i_2650_ = ((i_2648_ & 0xff00ff) + (i_2612_ & 0xff00ff));
									int i_2651_ = ((i_2650_ & 0x1000100) + (i_2649_ - i_2650_ & 0x10000));
									is[i_2624_] = (i_2649_ - i_2651_ | i_2651_ - (i_2651_ >>> 8));
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2644_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 2) {
					int i_2652_ = i_2612_ >>> 24;
					int i_2653_ = 256 - i_2652_;
					int i_2654_ = (i_2612_ & 0xff00ff) * i_2653_ & ~0xff00ff;
					int i_2655_ = (i_2612_ & 0xff00) * i_2653_ & 0xff0000;
					i_2612_ = (i_2654_ | i_2655_) >>> 8;
					int i_2656_ = i_2616_;
					for (int i_2657_ = -i_2610_; i_2657_ < 0; i_2657_++) {
						int i_2658_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2659_ = -i_2609_; i_2659_ < 0; i_2659_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2660_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2658_]);
									i_2654_ = ((i_2660_ & 0xff00ff) * i_2652_ & ~0xff00ff);
									i_2655_ = ((i_2660_ & 0xff00) * i_2652_ & 0xff0000);
									is[i_2624_] = (((i_2654_ | i_2655_) >>> 8) + i_2612_);
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2656_;
						i_2624_ += i_2625_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2613_ == 1) {
				if (i_2611_ == 1) {
					int i_2661_ = i_2616_;
					for (int i_2662_ = -i_2610_; i_2662_ < 0; i_2662_++) {
						int i_2663_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2664_ = -i_2609_; i_2664_ < 0; i_2664_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2665_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2663_]);
									int i_2666_ = i_2665_ >>> 24;
									int i_2667_ = 256 - i_2666_;
									int i_2668_ = is[i_2624_];
									is[i_2624_] = (((((i_2665_ & 0xff00ff) * i_2666_ + (i_2668_ & 0xff00ff) * i_2667_) & ~0xff00ff) >> 8) + (((((i_2665_ & ~0xff00ff) >>> 8) * i_2666_) + (((i_2668_ & ~0xff00ff) >>> 8) * i_2667_)) & ~0xff00ff));
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2661_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 0) {
					int i_2669_ = i_2616_;
					if ((i_2612_ & 0xffffff) == 16777215) {
						for (int i_2670_ = -i_2610_; i_2670_ < 0; i_2670_++) {
							int i_2671_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2672_ = -i_2609_; i_2672_ < 0; i_2672_++) {
								if (!bool_2606_ || f < fs[i_2624_]) {
									if (bool) {
										int i_2673_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2671_]);
										int i_2674_ = ((i_2673_ >>> 24) * (i_2612_ >>> 24) >> 8);
										int i_2675_ = 256 - i_2674_;
										int i_2676_ = is[i_2624_];
										is[i_2624_] = ((((i_2673_ & 0xff00ff) * i_2674_ + ((i_2676_ & 0xff00ff) * i_2675_)) & ~0xff00ff) + (((i_2673_ & 0xff00) * i_2674_ + ((i_2676_ & 0xff00) * i_2675_)) & 0xff0000)) >> 8;
									}
									if (bool_2606_ && bool_2615_)
										fs[i_2624_] = f;
								}
								i_2616_ += i_2620_;
								i_2624_++;
							}
							i_2617_ += i_2621_;
							i_2616_ = i_2669_;
							i_2624_ += i_2625_;
						}
					} else {
						int i_2677_ = (i_2612_ & 0xff0000) >> 16;
						int i_2678_ = (i_2612_ & 0xff00) >> 8;
						int i_2679_ = i_2612_ & 0xff;
						for (int i_2680_ = -i_2610_; i_2680_ < 0; i_2680_++) {
							int i_2681_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
							for (int i_2682_ = -i_2609_; i_2682_ < 0; i_2682_++) {
								if (!bool_2606_ || f < fs[i_2624_]) {
									int i_2683_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2681_]);
									int i_2684_ = ((i_2683_ >>> 24) * (i_2612_ >>> 24) >> 8);
									int i_2685_ = 256 - i_2684_;
									if (i_2684_ != 255) {
										if (bool) {
											int i_2686_ = (((i_2683_ & 0xff0000) * i_2677_) & ~0xffffff);
											int i_2687_ = ((i_2683_ & 0xff00) * i_2678_ & 0xff0000);
											int i_2688_ = ((i_2683_ & 0xff) * i_2679_ & 0xff00);
											i_2683_ = (i_2686_ | i_2687_ | i_2688_) >>> 8;
											int i_2689_ = is[i_2624_];
											is[i_2624_] = (((((i_2683_ & 0xff00ff) * i_2684_) + ((i_2689_ & 0xff00ff) * i_2685_)) & ~0xff00ff) + ((((i_2683_ & 0xff00) * i_2684_) + ((i_2689_ & 0xff00) * i_2685_)) & 0xff0000)) >> 8;
											if (bool_2607_) {
												int i_2690_ = ((i_2689_ >>> 24) + i_2684_);
												if (i_2690_ > 255)
													i_2690_ = 255;
												is[i_2624_] |= i_2690_ << 24;
											}
										}
										if (bool_2606_ && bool_2615_)
											fs[i_2624_] = f;
									} else {
										if (bool) {
											int i_2691_ = (((i_2683_ & 0xff0000) * i_2677_) & ~0xffffff);
											int i_2692_ = ((i_2683_ & 0xff00) * i_2678_ & 0xff0000);
											int i_2693_ = ((i_2683_ & 0xff) * i_2679_ & 0xff00);
											is[i_2624_] = (i_2691_ | i_2692_ | i_2693_) >>> 8;
										}
										if (bool_2606_ && bool_2615_)
											fs[i_2624_] = f;
									}
								}
								i_2616_ += i_2620_;
								i_2624_++;
							}
							i_2617_ += i_2621_;
							i_2616_ = i_2669_;
							i_2624_ += i_2625_;
						}
					}
				} else if (i_2611_ == 3) {
					int i_2694_ = i_2616_;
					for (int i_2695_ = -i_2610_; i_2695_ < 0; i_2695_++) {
						int i_2696_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2697_ = -i_2609_; i_2697_ < 0; i_2697_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2698_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2696_]);
									int i_2699_ = i_2698_ + i_2612_;
									int i_2700_ = ((i_2698_ & 0xff00ff) + (i_2612_ & 0xff00ff));
									int i_2701_ = ((i_2700_ & 0x1000100) + (i_2699_ - i_2700_ & 0x10000));
									i_2701_ = (i_2699_ - i_2701_ | i_2701_ - (i_2701_ >>> 8));
									int i_2702_ = ((i_2701_ >>> 24) * (i_2612_ >>> 24) >> 8);
									int i_2703_ = 256 - i_2702_;
									if (i_2702_ != 255) {
										i_2698_ = i_2701_;
										i_2701_ = is[i_2624_];
										i_2701_ = ((((i_2698_ & 0xff00ff) * i_2702_ + ((i_2701_ & 0xff00ff) * i_2703_)) & ~0xff00ff) + (((i_2698_ & 0xff00) * i_2702_ + ((i_2701_ & 0xff00) * i_2703_)) & 0xff0000)) >> 8;
									}
									is[i_2624_] = i_2701_;
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2694_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 2) {
					int i_2704_ = i_2612_ >>> 24;
					int i_2705_ = 256 - i_2704_;
					int i_2706_ = (i_2612_ & 0xff00ff) * i_2705_ & ~0xff00ff;
					int i_2707_ = (i_2612_ & 0xff00) * i_2705_ & 0xff0000;
					i_2612_ = (i_2706_ | i_2707_) >>> 8;
					int i_2708_ = i_2616_;
					for (int i_2709_ = -i_2610_; i_2709_ < 0; i_2709_++) {
						int i_2710_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2711_ = -i_2609_; i_2711_ < 0; i_2711_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2712_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2710_]);
									int i_2713_ = i_2712_ >>> 24;
									int i_2714_ = 256 - i_2713_;
									i_2706_ = ((i_2712_ & 0xff00ff) * i_2704_ & ~0xff00ff);
									i_2707_ = ((i_2712_ & 0xff00) * i_2704_ & 0xff0000);
									i_2712_ = (((i_2706_ | i_2707_) >>> 8) + i_2612_);
									int i_2715_ = is[i_2624_];
									is[i_2624_] = ((((i_2712_ & 0xff00ff) * i_2713_ + (i_2715_ & 0xff00ff) * i_2714_) & ~0xff00ff) + (((i_2712_ & 0xff00) * i_2713_ + (i_2715_ & 0xff00) * i_2714_) & 0xff0000)) >> 8;
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2708_;
						i_2624_ += i_2625_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2613_ == 2) {
				if (i_2611_ == 1) {
					int i_2716_ = i_2616_;
					for (int i_2717_ = -i_2610_; i_2717_ < 0; i_2717_++) {
						int i_2718_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2719_ = -i_2609_; i_2719_ < 0; i_2719_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								int i_2720_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2718_]);
								if (i_2720_ != 0) {
									if (bool) {
										int i_2721_ = is[i_2624_];
										int i_2722_ = i_2720_ + i_2721_;
										int i_2723_ = ((i_2720_ & 0xff00ff) + (i_2721_ & 0xff00ff));
										i_2721_ = ((i_2723_ & 0x1000100) + (i_2722_ - i_2723_ & 0x10000));
										is[i_2624_] = (i_2722_ - i_2721_ | i_2721_ - (i_2721_ >>> 8));
									}
									if (bool_2606_ && bool_2615_)
										fs[i_2624_] = f;
								}
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2716_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 0) {
					int i_2724_ = i_2616_;
					int i_2725_ = (i_2612_ & 0xff0000) >> 16;
					int i_2726_ = (i_2612_ & 0xff00) >> 8;
					int i_2727_ = i_2612_ & 0xff;
					for (int i_2728_ = -i_2610_; i_2728_ < 0; i_2728_++) {
						int i_2729_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2730_ = -i_2609_; i_2730_ < 0; i_2730_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								int i_2731_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2729_]);
								if (i_2731_ != 0) {
									if (bool) {
										int i_2732_ = ((i_2731_ & 0xff0000) * i_2725_ & ~0xffffff);
										int i_2733_ = ((i_2731_ & 0xff00) * i_2726_ & 0xff0000);
										int i_2734_ = ((i_2731_ & 0xff) * i_2727_ & 0xff00);
										i_2731_ = (i_2732_ | i_2733_ | i_2734_) >>> 8;
										int i_2735_ = is[i_2624_];
										int i_2736_ = i_2731_ + i_2735_;
										int i_2737_ = ((i_2731_ & 0xff00ff) + (i_2735_ & 0xff00ff));
										i_2735_ = ((i_2737_ & 0x1000100) + (i_2736_ - i_2737_ & 0x10000));
										is[i_2624_] = (i_2736_ - i_2735_ | i_2735_ - (i_2735_ >>> 8));
									}
									if (bool_2606_ && bool_2615_)
										fs[i_2624_] = f;
								}
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2724_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 3) {
					int i_2738_ = i_2616_;
					for (int i_2739_ = -i_2610_; i_2739_ < 0; i_2739_++) {
						int i_2740_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2741_ = -i_2609_; i_2741_ < 0; i_2741_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								if (bool) {
									int i_2742_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2740_]);
									int i_2743_ = i_2742_ + i_2612_;
									int i_2744_ = ((i_2742_ & 0xff00ff) + (i_2612_ & 0xff00ff));
									int i_2745_ = ((i_2744_ & 0x1000100) + (i_2743_ - i_2744_ & 0x10000));
									i_2742_ = (i_2743_ - i_2745_ | i_2745_ - (i_2745_ >>> 8));
									i_2745_ = is[i_2624_];
									i_2743_ = i_2742_ + i_2745_;
									i_2744_ = (i_2742_ & 0xff00ff) + (i_2745_ & 0xff00ff);
									i_2745_ = ((i_2744_ & 0x1000100) + (i_2743_ - i_2744_ & 0x10000));
									is[i_2624_] = (i_2743_ - i_2745_ | i_2745_ - (i_2745_ >>> 8));
								}
								if (bool_2606_ && bool_2615_)
									fs[i_2624_] = f;
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2738_;
						i_2624_ += i_2625_;
					}
				} else if (i_2611_ == 2) {
					int i_2746_ = i_2612_ >>> 24;
					int i_2747_ = 256 - i_2746_;
					int i_2748_ = (i_2612_ & 0xff00ff) * i_2747_ & ~0xff00ff;
					int i_2749_ = (i_2612_ & 0xff00) * i_2747_ & 0xff0000;
					i_2612_ = (i_2748_ | i_2749_) >>> 8;
					int i_2750_ = i_2616_;
					for (int i_2751_ = -i_2610_; i_2751_ < 0; i_2751_++) {
						int i_2752_ = ((i_2617_ >> 16) * ((Class161_Sub3_Sub3) this).anInt10945);
						for (int i_2753_ = -i_2609_; i_2753_ < 0; i_2753_++) {
							if (!bool_2606_ || f < fs[i_2624_]) {
								int i_2754_ = (((Class161_Sub3_Sub3) this).anIntArray11238[(i_2616_ >> 16) + i_2752_]);
								if (i_2754_ != 0) {
									if (bool) {
										i_2748_ = ((i_2754_ & 0xff00ff) * i_2746_ & ~0xff00ff);
										i_2749_ = ((i_2754_ & 0xff00) * i_2746_ & 0xff0000);
										i_2754_ = (((i_2748_ | i_2749_) >>> 8) + i_2612_);
										int i_2755_ = is[i_2624_];
										int i_2756_ = i_2754_ + i_2755_;
										int i_2757_ = ((i_2754_ & 0xff00ff) + (i_2755_ & 0xff00ff));
										i_2755_ = ((i_2757_ & 0x1000100) + (i_2756_ - i_2757_ & 0x10000));
										is[i_2624_] = (i_2756_ - i_2755_ | i_2755_ - (i_2755_ >>> 8));
									}
									if (bool_2606_ && bool_2615_)
										fs[i_2624_] = f;
								}
							}
							i_2616_ += i_2620_;
							i_2624_++;
						}
						i_2617_ += i_2621_;
						i_2616_ = i_2750_;
						i_2624_ += i_2625_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2627(int i, int i_2758_, int i_2759_, int i_2760_, int[] is, int i_2761_, int i_2762_) {
		i_2762_ -= i_2759_;
		for (int i_2763_ = 0; i_2763_ < i_2760_; i_2763_++) {
			int i_2764_ = (i_2758_ + i_2763_) * i_2759_ + i;
			for (int i_2765_ = 0; i_2765_ < i_2759_; i_2765_++)
				((Class161_Sub3_Sub3) this).anIntArray11238[i_2764_ + i_2765_] = is[i_2761_++];
			i_2761_ += i_2762_;
		}
	}

	void method10193(int i, int i_2766_, int i_2767_, int i_2768_, int[] is, int i_2769_, int i_2770_) {
		i_2770_ -= i_2767_;
		for (int i_2771_ = 0; i_2771_ < i_2768_; i_2771_++) {
			int i_2772_ = (i_2766_ + i_2771_) * i_2767_ + i;
			for (int i_2773_ = 0; i_2773_ < i_2767_; i_2773_++)
				is[i_2769_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_2772_ + i_2773_]);
			i_2769_ += i_2770_;
		}
	}

	void method10194(int i, int i_2774_, int i_2775_, int i_2776_, int[] is, int i_2777_, int i_2778_) {
		i_2778_ -= i_2775_;
		for (int i_2779_ = 0; i_2779_ < i_2776_; i_2779_++) {
			int i_2780_ = (i_2774_ + i_2779_) * i_2775_ + i;
			for (int i_2781_ = 0; i_2781_ < i_2775_; i_2781_++)
				is[i_2777_++] = (((Class161_Sub3_Sub3) this).anIntArray11238[i_2780_ + i_2781_]);
			i_2777_ += i_2778_;
		}
	}

	void method10195(int i, int i_2782_, int[] is, int i_2783_, int i_2784_) {
		if (i_2784_ == 0) {
			if (i_2783_ == 1)
				is[i_2782_] = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
			else if (i_2783_ == 0) {
				int i_2785_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i++];
				int i_2786_ = (i_2785_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_2787_ = (i_2785_ & 0xff00) * anInt10959 & 0xff0000;
				int i_2788_ = (i_2785_ & 0xff) * anInt10960 & 0xff00;
				is[i_2782_] = (i_2786_ | i_2787_ | i_2788_) >>> 8;
			} else if (i_2783_ == 3) {
				int i_2789_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i++];
				int i_2790_ = anInt10928;
				int i_2791_ = i_2789_ + i_2790_;
				int i_2792_ = (i_2789_ & 0xff00ff) + (i_2790_ & 0xff00ff);
				int i_2793_ = (i_2792_ & 0x1000100) + (i_2791_ - i_2792_ & 0x10000);
				is[i_2782_] = i_2791_ - i_2793_ | i_2793_ - (i_2793_ >>> 8);
			} else if (i_2783_ == 2) {
				int i_2794_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2795_ = (i_2794_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_2796_ = (i_2794_ & 0xff00) * anInt10934 & 0xff0000;
				is[i_2782_] = ((i_2795_ | i_2796_) >>> 8) + anInt10963;
			} else
				throw new IllegalArgumentException();
		} else if (i_2784_ == 1) {
			if (i_2783_ == 1) {
				int i_2797_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2798_ = i_2797_ >>> 24;
				int i_2799_ = 256 - i_2798_;
				int i_2800_ = is[i_2782_];
				is[i_2782_] = ((((i_2797_ & 0xff00ff) * i_2798_ + (i_2800_ & 0xff00ff) * i_2799_) & ~0xff00ff) + (((i_2797_ & 0xff00) * i_2798_ + (i_2800_ & 0xff00) * i_2799_) & 0xff0000)) >> 8;
			} else if (i_2783_ == 0) {
				int i_2801_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2802_ = (i_2801_ >>> 24) * anInt10934 >> 8;
				int i_2803_ = 256 - i_2802_;
				if ((anInt10928 & 0xffffff) == 16777215) {
					int i_2804_ = is[i_2782_];
					is[i_2782_] = ((((i_2801_ & 0xff00ff) * i_2802_ + (i_2804_ & 0xff00ff) * i_2803_) & ~0xff00ff) + (((i_2801_ & 0xff00) * i_2802_ + (i_2804_ & 0xff00) * i_2803_) & 0xff0000)) >> 8;
				} else if (i_2802_ != 255) {
					int i_2805_ = (i_2801_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_2806_ = (i_2801_ & 0xff00) * anInt10959 & 0xff0000;
					int i_2807_ = (i_2801_ & 0xff) * anInt10960 & 0xff00;
					i_2801_ = (i_2805_ | i_2806_ | i_2807_) >>> 8;
					int i_2808_ = is[i_2782_];
					is[i_2782_] = ((((i_2801_ & 0xff00ff) * i_2802_ + (i_2808_ & 0xff00ff) * i_2803_) & ~0xff00ff) + (((i_2801_ & 0xff00) * i_2802_ + (i_2808_ & 0xff00) * i_2803_) & 0xff0000)) >> 8;
				} else {
					int i_2809_ = (i_2801_ & 0xff0000) * anInt10955 & ~0xffffff;
					int i_2810_ = (i_2801_ & 0xff00) * anInt10959 & 0xff0000;
					int i_2811_ = (i_2801_ & 0xff) * anInt10960 & 0xff00;
					is[i_2782_] = (i_2809_ | i_2810_ | i_2811_) >>> 8;
				}
			} else if (i_2783_ == 3) {
				int i_2812_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2813_ = anInt10928;
				int i_2814_ = i_2812_ + i_2813_;
				int i_2815_ = (i_2812_ & 0xff00ff) + (i_2813_ & 0xff00ff);
				int i_2816_ = (i_2815_ & 0x1000100) + (i_2814_ - i_2815_ & 0x10000);
				i_2816_ = i_2814_ - i_2816_ | i_2816_ - (i_2816_ >>> 8);
				int i_2817_ = (i_2812_ >>> 24) * anInt10934 >> 8;
				int i_2818_ = 256 - i_2817_;
				if (i_2817_ != 255) {
					i_2812_ = i_2816_;
					i_2816_ = is[i_2782_];
					i_2816_ = ((((i_2812_ & 0xff00ff) * i_2817_ + (i_2816_ & 0xff00ff) * i_2818_) & ~0xff00ff) + (((i_2812_ & 0xff00) * i_2817_ + (i_2816_ & 0xff00) * i_2818_) & 0xff0000)) >> 8;
				}
				is[i_2782_] = i_2816_;
			} else if (i_2783_ == 2) {
				int i_2819_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2820_ = i_2819_ >>> 24;
				int i_2821_ = 256 - i_2820_;
				int i_2822_ = (i_2819_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_2823_ = (i_2819_ & 0xff00) * anInt10934 & 0xff0000;
				i_2819_ = ((i_2822_ | i_2823_) >>> 8) + anInt10963;
				int i_2824_ = is[i_2782_];
				is[i_2782_] = ((((i_2819_ & 0xff00ff) * i_2820_ + (i_2824_ & 0xff00ff) * i_2821_) & ~0xff00ff) + (((i_2819_ & 0xff00) * i_2820_ + (i_2824_ & 0xff00) * i_2821_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_2784_ == 2) {
			if (i_2783_ == 1) {
				int i_2825_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2826_ = is[i_2782_];
				int i_2827_ = i_2825_ + i_2826_;
				int i_2828_ = (i_2825_ & 0xff00ff) + (i_2826_ & 0xff00ff);
				i_2826_ = (i_2828_ & 0x1000100) + (i_2827_ - i_2828_ & 0x10000);
				is[i_2782_] = i_2827_ - i_2826_ | i_2826_ - (i_2826_ >>> 8);
			} else if (i_2783_ == 0) {
				int i_2829_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2830_ = (i_2829_ & 0xff0000) * anInt10955 & ~0xffffff;
				int i_2831_ = (i_2829_ & 0xff00) * anInt10959 & 0xff0000;
				int i_2832_ = (i_2829_ & 0xff) * anInt10960 & 0xff00;
				i_2829_ = (i_2830_ | i_2831_ | i_2832_) >>> 8;
				int i_2833_ = is[i_2782_];
				int i_2834_ = i_2829_ + i_2833_;
				int i_2835_ = (i_2829_ & 0xff00ff) + (i_2833_ & 0xff00ff);
				i_2833_ = (i_2835_ & 0x1000100) + (i_2834_ - i_2835_ & 0x10000);
				is[i_2782_] = i_2834_ - i_2833_ | i_2833_ - (i_2833_ >>> 8);
			} else if (i_2783_ == 3) {
				int i_2836_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2837_ = anInt10928;
				int i_2838_ = i_2836_ + i_2837_;
				int i_2839_ = (i_2836_ & 0xff00ff) + (i_2837_ & 0xff00ff);
				int i_2840_ = (i_2839_ & 0x1000100) + (i_2838_ - i_2839_ & 0x10000);
				i_2836_ = i_2838_ - i_2840_ | i_2840_ - (i_2840_ >>> 8);
				i_2840_ = is[i_2782_];
				i_2838_ = i_2836_ + i_2840_;
				i_2839_ = (i_2836_ & 0xff00ff) + (i_2840_ & 0xff00ff);
				i_2840_ = (i_2839_ & 0x1000100) + (i_2838_ - i_2839_ & 0x10000);
				is[i_2782_] = i_2838_ - i_2840_ | i_2840_ - (i_2840_ >>> 8);
			} else if (i_2783_ == 2) {
				int i_2841_ = ((Class161_Sub3_Sub3) this).anIntArray11238[i];
				int i_2842_ = (i_2841_ & 0xff00ff) * anInt10934 & ~0xff00ff;
				int i_2843_ = (i_2841_ & 0xff00) * anInt10934 & 0xff0000;
				i_2841_ = ((i_2842_ | i_2843_) >>> 8) + anInt10963;
				int i_2844_ = is[i_2782_];
				int i_2845_ = i_2841_ + i_2844_;
				int i_2846_ = (i_2841_ & 0xff00ff) + (i_2844_ & 0xff00ff);
				i_2844_ = (i_2846_ & 0x1000100) + (i_2845_ - i_2846_ & 0x10000);
				is[i_2782_] = i_2845_ - i_2844_ | i_2844_ - (i_2844_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}
}
