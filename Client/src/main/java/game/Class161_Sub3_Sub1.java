package game;

/* Class161_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub3_Sub1 extends Class161_Sub3 {
	int[] anIntArray11151;
	byte[] aByteArray11152;

	public void method2591(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		throw new IllegalStateException();
	}

	public void method2619(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_9_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_5_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_10_ = i_5_ * i_9_ + i;
			int i_11_ = 0;
			int i_12_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_13_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_14_ = i_9_ - i_13_;
			int i_15_ = 0;
			if (i_5_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_16_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_5_);
				i_12_ -= i_16_;
				i_5_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_11_ += i_16_ * i_13_;
				i_10_ += i_16_ * i_9_;
			}
			if (i_5_ + i_12_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235)
				i_12_ -= (i_5_ + i_12_ - (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_17_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_13_ -= i_17_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_11_ += i_17_;
				i_10_ += i_17_;
				i_15_ += i_17_;
				i_14_ += i_17_;
			}
			if (i + i_13_ > (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10221) * 892939761) {
				int i_18_ = (i + i_13_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_13_ -= i_18_;
				i_15_ += i_18_;
				i_14_ += i_18_;
			}
			if (i_13_ > 0 && i_12_ > 0) {
				if (i_8_ == 0) {
					if (i_6_ == 1) {
						for (int i_19_ = -i_12_; i_19_ < 0; i_19_++) {
							int i_20_ = i_10_ + i_13_ - 3;
							while (i_10_ < i_20_) {
								is[i_10_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								is[i_10_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								is[i_10_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								is[i_10_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
							}
							i_20_ += 3;
							while (i_10_ < i_20_)
								is[i_10_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 0) {
						int i_21_ = (i_7_ & 0xff0000) >> 16;
						int i_22_ = (i_7_ & 0xff00) >> 8;
						int i_23_ = i_7_ & 0xff;
						for (int i_24_ = -i_12_; i_24_ < 0; i_24_++) {
							for (int i_25_ = -i_13_; i_25_ < 0; i_25_++) {
								int i_26_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								int i_27_ = (i_26_ & 0xff0000) * i_21_ & ~0xffffff;
								int i_28_ = (i_26_ & 0xff00) * i_22_ & 0xff0000;
								int i_29_ = (i_26_ & 0xff) * i_23_ & 0xff00;
								is[i_10_++] = (i_27_ | i_28_ | i_29_) >>> 8;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 3) {
						for (int i_30_ = -i_12_; i_30_ < 0; i_30_++) {
							for (int i_31_ = -i_13_; i_31_ < 0; i_31_++) {
								int i_32_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								int i_33_ = i_32_ + i_7_;
								int i_34_ = (i_32_ & 0xff00ff) + (i_7_ & 0xff00ff);
								int i_35_ = ((i_34_ & 0x1000100) + (i_33_ - i_34_ & 0x10000));
								is[i_10_++] = i_33_ - i_35_ | i_35_ - (i_35_ >>> 8);
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 2) {
						int i_36_ = i_7_ >>> 24;
						int i_37_ = 256 - i_36_;
						int i_38_ = (i_7_ & 0xff00ff) * i_37_ & ~0xff00ff;
						int i_39_ = (i_7_ & 0xff00) * i_37_ & 0xff0000;
						i_7_ = (i_38_ | i_39_) >>> 8;
						for (int i_40_ = -i_12_; i_40_ < 0; i_40_++) {
							for (int i_41_ = -i_13_; i_41_ < 0; i_41_++) {
								int i_42_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]) & 0xff]);
								i_38_ = (i_42_ & 0xff00ff) * i_36_ & ~0xff00ff;
								i_39_ = (i_42_ & 0xff00) * i_36_ & 0xff0000;
								is[i_10_++] = ((i_38_ | i_39_) >>> 8) + i_7_;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_8_ == 1) {
					if (i_6_ == 1) {
						for (int i_43_ = -i_12_; i_43_ < 0; i_43_++) {
							for (int i_44_ = -i_13_; i_44_ < 0; i_44_++) {
								int i_45_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								if (i_45_ != 0) {
									int i_46_ = ((((Class161_Sub3_Sub1) this).anIntArray11151[i_45_ & 0xff]) | ~0xffffff);
									int i_47_ = 255;
									int i_48_ = 0;
									int i_49_ = is[i_10_];
									is[i_10_++] = (((((i_46_ & 0xff00ff) * i_47_ + (i_49_ & 0xff00ff) * i_48_) & ~0xff00ff) >> 8) + (((((i_46_ & ~0xff00ff) >>> 8) * i_47_) + (((i_49_ & ~0xff00ff) >>> 8) * i_48_)) & ~0xff00ff));
								} else
									i_10_++;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 0) {
						if ((i_7_ & 0xffffff) == 16777215) {
							int i_50_ = i_7_ >>> 24;
							int i_51_ = 256 - i_50_;
							for (int i_52_ = -i_12_; i_52_ < 0; i_52_++) {
								for (int i_53_ = -i_13_; i_53_ < 0; i_53_++) {
									int i_54_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
									if (i_54_ != 0) {
										int i_55_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_54_ & 0xff]);
										int i_56_ = is[i_10_];
										is[i_10_++] = ((((i_55_ & 0xff00ff) * i_50_ + (i_56_ & 0xff00ff) * i_51_) & ~0xff00ff) + (((i_55_ & 0xff00) * i_50_ + (i_56_ & 0xff00) * i_51_) & 0xff0000)) >> 8;
									} else
										i_10_++;
								}
								i_10_ += i_14_;
								i_11_ += i_15_;
							}
						} else {
							int i_57_ = (i_7_ & 0xff0000) >> 16;
							int i_58_ = (i_7_ & 0xff00) >> 8;
							int i_59_ = i_7_ & 0xff;
							int i_60_ = i_7_ >>> 24;
							int i_61_ = 256 - i_60_;
							for (int i_62_ = -i_12_; i_62_ < 0; i_62_++) {
								for (int i_63_ = -i_13_; i_63_ < 0; i_63_++) {
									int i_64_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
									if (i_64_ != 0) {
										int i_65_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_64_ & 0xff]);
										if (i_60_ != 255) {
											int i_66_ = ((i_65_ & 0xff0000) * i_57_ & ~0xffffff);
											int i_67_ = ((i_65_ & 0xff00) * i_58_ & 0xff0000);
											int i_68_ = ((i_65_ & 0xff) * i_59_ & 0xff00);
											i_65_ = ((i_66_ | i_67_ | i_68_) >>> 8);
											int i_69_ = is[i_10_];
											is[i_10_++] = ((((i_65_ & 0xff00ff) * i_60_ + ((i_69_ & 0xff00ff) * i_61_)) & ~0xff00ff) + (((i_65_ & 0xff00) * i_60_ + ((i_69_ & 0xff00) * i_61_)) & 0xff0000)) >> 8;
										} else {
											int i_70_ = ((i_65_ & 0xff0000) * i_57_ & ~0xffffff);
											int i_71_ = ((i_65_ & 0xff00) * i_58_ & 0xff0000);
											int i_72_ = ((i_65_ & 0xff) * i_59_ & 0xff00);
											is[i_10_++] = (i_70_ | i_71_ | i_72_) >>> 8;
										}
									} else
										i_10_++;
								}
								i_10_ += i_14_;
								i_11_ += i_15_;
							}
						}
					} else if (i_6_ == 3) {
						int i_73_ = i_7_ >>> 24;
						int i_74_ = 256 - i_73_;
						for (int i_75_ = -i_12_; i_75_ < 0; i_75_++) {
							for (int i_76_ = -i_13_; i_76_ < 0; i_76_++) {
								byte i_77_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								int i_78_ = (i_77_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_77_]) : 0);
								int i_79_ = i_78_ + i_7_;
								int i_80_ = (i_78_ & 0xff00ff) + (i_7_ & 0xff00ff);
								int i_81_ = ((i_80_ & 0x1000100) + (i_79_ - i_80_ & 0x10000));
								i_81_ = i_79_ - i_81_ | i_81_ - (i_81_ >>> 8);
								if (i_78_ == 0 && i_73_ != 255) {
									i_78_ = i_81_;
									i_81_ = is[i_10_];
									i_81_ = ((((i_78_ & 0xff00ff) * i_73_ + (i_81_ & 0xff00ff) * i_74_) & ~0xff00ff) + (((i_78_ & 0xff00) * i_73_ + (i_81_ & 0xff00) * i_74_) & 0xff0000)) >> 8;
								}
								is[i_10_++] = i_81_;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 2) {
						int i_82_ = i_7_ >>> 24;
						int i_83_ = 256 - i_82_;
						int i_84_ = (i_7_ & 0xff00ff) * i_83_ & ~0xff00ff;
						int i_85_ = (i_7_ & 0xff00) * i_83_ & 0xff0000;
						i_7_ = (i_84_ | i_85_) >>> 8;
						for (int i_86_ = -i_12_; i_86_ < 0; i_86_++) {
							for (int i_87_ = -i_13_; i_87_ < 0; i_87_++) {
								int i_88_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								if (i_88_ != 0) {
									int i_89_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_88_ & 0xff]);
									i_84_ = ((i_89_ & 0xff00ff) * i_82_ & ~0xff00ff);
									i_85_ = (i_89_ & 0xff00) * i_82_ & 0xff0000;
									is[i_10_++] = ((i_84_ | i_85_) >>> 8) + i_7_;
								} else
									i_10_++;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_8_ == 2) {
					if (i_6_ == 1) {
						for (int i_90_ = -i_12_; i_90_ < 0; i_90_++) {
							for (int i_91_ = -i_13_; i_91_ < 0; i_91_++) {
								int i_92_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								if (i_92_ != 0) {
									int i_93_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_92_ & 0xff]);
									int i_94_ = is[i_10_];
									int i_95_ = i_93_ + i_94_;
									int i_96_ = ((i_93_ & 0xff00ff) + (i_94_ & 0xff00ff));
									i_94_ = (i_96_ & 0x1000100) + (i_95_ - i_96_ & 0x10000);
									is[i_10_++] = i_95_ - i_94_ | i_94_ - (i_94_ >>> 8);
								} else
									i_10_++;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 0) {
						int i_97_ = (i_7_ & 0xff0000) >> 16;
						int i_98_ = (i_7_ & 0xff00) >> 8;
						int i_99_ = i_7_ & 0xff;
						for (int i_100_ = -i_12_; i_100_ < 0; i_100_++) {
							for (int i_101_ = -i_13_; i_101_ < 0; i_101_++) {
								int i_102_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								if (i_102_ != 0) {
									int i_103_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_102_ & 0xff]);
									int i_104_ = ((i_103_ & 0xff0000) * i_97_ & ~0xffffff);
									int i_105_ = (i_103_ & 0xff00) * i_98_ & 0xff0000;
									int i_106_ = (i_103_ & 0xff) * i_99_ & 0xff00;
									i_103_ = (i_104_ | i_105_ | i_106_) >>> 8;
									int i_107_ = is[i_10_];
									int i_108_ = i_103_ + i_107_;
									int i_109_ = ((i_103_ & 0xff00ff) + (i_107_ & 0xff00ff));
									i_107_ = ((i_109_ & 0x1000100) + (i_108_ - i_109_ & 0x10000));
									is[i_10_++] = i_108_ - i_107_ | i_107_ - (i_107_ >>> 8);
								} else
									i_10_++;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 3) {
						for (int i_110_ = -i_12_; i_110_ < 0; i_110_++) {
							for (int i_111_ = -i_13_; i_111_ < 0; i_111_++) {
								byte i_112_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								int i_113_ = (i_112_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_112_]) : 0);
								int i_114_ = i_113_ + i_7_;
								int i_115_ = (i_113_ & 0xff00ff) + (i_7_ & 0xff00ff);
								int i_116_ = ((i_115_ & 0x1000100) + (i_114_ - i_115_ & 0x10000));
								i_113_ = i_114_ - i_116_ | i_116_ - (i_116_ >>> 8);
								i_116_ = is[i_10_];
								i_114_ = i_113_ + i_116_;
								i_115_ = (i_113_ & 0xff00ff) + (i_116_ & 0xff00ff);
								i_116_ = (i_115_ & 0x1000100) + (i_114_ - i_115_ & 0x10000);
								is[i_10_++] = i_114_ - i_116_ | i_116_ - (i_116_ >>> 8);
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else if (i_6_ == 2) {
						int i_117_ = i_7_ >>> 24;
						int i_118_ = 256 - i_117_;
						int i_119_ = (i_7_ & 0xff00ff) * i_118_ & ~0xff00ff;
						int i_120_ = (i_7_ & 0xff00) * i_118_ & 0xff0000;
						i_7_ = (i_119_ | i_120_) >>> 8;
						for (int i_121_ = -i_12_; i_121_ < 0; i_121_++) {
							for (int i_122_ = -i_13_; i_122_ < 0; i_122_++) {
								int i_123_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_11_++]);
								if (i_123_ != 0) {
									int i_124_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_123_ & 0xff]);
									i_119_ = ((i_124_ & 0xff00ff) * i_117_ & ~0xff00ff);
									i_120_ = ((i_124_ & 0xff00) * i_117_ & 0xff0000);
									i_124_ = ((i_119_ | i_120_) >>> 8) + i_7_;
									int i_125_ = is[i_10_];
									int i_126_ = i_124_ + i_125_;
									int i_127_ = ((i_124_ & 0xff00ff) + (i_125_ & 0xff00ff));
									i_125_ = ((i_127_ & 0x1000100) + (i_126_ - i_127_ & 0x10000));
									is[i_10_++] = i_126_ - i_125_ | i_125_ - (i_125_ >>> 8);
								} else
									i_10_++;
							}
							i_10_ += i_14_;
							i_11_ += i_15_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2592(int i, int i_128_, int i_129_, int i_130_, int[] is, int[] is_131_, int i_132_, int i_133_) {
		throw new IllegalStateException();
	}

	public void method2626(int i, int i_134_, Class167 class167, int i_135_, int i_136_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_134_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_137_ = 0;
			int i_138_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_139_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_140_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_141_ = i_138_ - i_139_;
			int i_142_ = 0;
			int i_143_ = i + i_134_ * i_138_;
			if (i_134_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_144_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_134_);
				i_140_ -= i_144_;
				i_134_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_137_ += i_144_ * i_139_;
				i_143_ += i_144_ * i_138_;
			}
			if (i_134_ + i_140_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_140_ -= (i_134_ + i_140_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_145_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_139_ -= i_145_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_137_ += i_145_;
				i_143_ += i_145_;
				i_142_ += i_145_;
				i_141_ += i_145_;
			}
			if (i + i_139_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_146_ = (i + i_139_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_139_ -= i_146_;
				i_142_ += i_146_;
				i_141_ += i_146_;
			}
			if (i_139_ > 0 && i_140_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_147_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_148_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_149_ = i_134_;
				if (i_136_ > i_149_) {
					i_149_ = i_136_;
					i_143_ += (i_136_ - i_134_) * i_138_;
					i_137_ += ((i_136_ - i_134_) * ((Class161_Sub3_Sub1) this).anInt10945);
				}
				int i_150_ = (i_136_ + is_147_.length < i_134_ + i_140_ ? i_136_ + is_147_.length : i_134_ + i_140_);
				for (int i_151_ = i_149_; i_151_ < i_150_; i_151_++) {
					int i_152_ = is_147_[i_151_ - i_136_] + i_135_;
					int i_153_ = is_148_[i_151_ - i_136_];
					int i_154_ = i_139_;
					if (i > i_152_) {
						int i_155_ = i - i_152_;
						if (i_155_ >= i_153_) {
							i_137_ += i_139_ + i_142_;
							i_143_ += i_139_ + i_141_;
							continue;
						}
						i_153_ -= i_155_;
					} else {
						int i_156_ = i_152_ - i;
						if (i_156_ >= i_139_) {
							i_137_ += i_139_ + i_142_;
							i_143_ += i_139_ + i_141_;
							continue;
						}
						i_137_ += i_156_;
						i_154_ -= i_156_;
						i_143_ += i_156_;
					}
					int i_157_ = 0;
					if (i_154_ < i_153_)
						i_153_ = i_154_;
					else
						i_157_ = i_154_ - i_153_;
					for (int i_158_ = -i_153_; i_158_ < 0; i_158_++) {
						int i_159_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_137_++]);
						if (i_159_ != 0)
							is[i_143_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_159_ & 0xff]);
						else
							i_143_++;
					}
					i_137_ += i_157_ + i_142_;
					i_143_ += i_157_ + i_141_;
				}
			}
		}
	}

	public void method2594(int i, int i_160_, int i_161_) {
		throw new IllegalStateException();
	}

	public void method2612(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_) {
		throw new IllegalStateException();
	}

	public void method2607(int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		throw new IllegalStateException();
	}

	public void method2596(int i, int i_172_, Class167 class167, int i_173_, int i_174_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_172_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_175_ = 0;
			int i_176_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_177_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_178_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_179_ = i_176_ - i_177_;
			int i_180_ = 0;
			int i_181_ = i + i_172_ * i_176_;
			if (i_172_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_182_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_172_);
				i_178_ -= i_182_;
				i_172_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_175_ += i_182_ * i_177_;
				i_181_ += i_182_ * i_176_;
			}
			if (i_172_ + i_178_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_178_ -= (i_172_ + i_178_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_183_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_177_ -= i_183_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_175_ += i_183_;
				i_181_ += i_183_;
				i_180_ += i_183_;
				i_179_ += i_183_;
			}
			if (i + i_177_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_184_ = (i + i_177_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_177_ -= i_184_;
				i_180_ += i_184_;
				i_179_ += i_184_;
			}
			if (i_177_ > 0 && i_178_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_185_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_186_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_187_ = i_172_;
				if (i_174_ > i_187_) {
					i_187_ = i_174_;
					i_181_ += (i_174_ - i_172_) * i_176_;
					i_175_ += ((i_174_ - i_172_) * ((Class161_Sub3_Sub1) this).anInt10945);
				}
				int i_188_ = (i_174_ + is_185_.length < i_172_ + i_178_ ? i_174_ + is_185_.length : i_172_ + i_178_);
				for (int i_189_ = i_187_; i_189_ < i_188_; i_189_++) {
					int i_190_ = is_185_[i_189_ - i_174_] + i_173_;
					int i_191_ = is_186_[i_189_ - i_174_];
					int i_192_ = i_177_;
					if (i > i_190_) {
						int i_193_ = i - i_190_;
						if (i_193_ >= i_191_) {
							i_175_ += i_177_ + i_180_;
							i_181_ += i_177_ + i_179_;
							continue;
						}
						i_191_ -= i_193_;
					} else {
						int i_194_ = i_190_ - i;
						if (i_194_ >= i_177_) {
							i_175_ += i_177_ + i_180_;
							i_181_ += i_177_ + i_179_;
							continue;
						}
						i_175_ += i_194_;
						i_192_ -= i_194_;
						i_181_ += i_194_;
					}
					int i_195_ = 0;
					if (i_192_ < i_191_)
						i_191_ = i_192_;
					else
						i_195_ = i_192_ - i_191_;
					for (int i_196_ = -i_191_; i_196_ < 0; i_196_++) {
						int i_197_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_175_++]);
						if (i_197_ != 0)
							is[i_181_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_197_ & 0xff]);
						else
							i_181_++;
					}
					i_175_ += i_195_ + i_180_;
					i_181_ += i_195_ + i_179_;
				}
			}
		}
	}

	void method10050(boolean bool, boolean bool_198_, boolean bool_199_, int i, int i_200_, float f, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, boolean bool_207_) {
		if (i_201_ > 0 && i_202_ > 0 && (bool || bool_198_)) {
			int i_208_ = 0;
			int i_209_ = 0;
			int i_210_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
			int i_211_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
			int i_212_ = (i_210_ << 16) / i_201_;
			int i_213_ = (i_211_ << 16) / i_202_;
			if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
				int i_214_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_212_ - 1) / i_212_);
				i += i_214_;
				i_208_ += (i_214_ * i_212_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
				int i_215_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_213_ - 1) / i_213_);
				i_200_ += i_215_;
				i_209_ += (i_215_ * i_213_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10945 < i_210_)
				i_201_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_208_ + i_212_ - 1) / i_212_;
			if (((Class161_Sub3_Sub1) this).anInt10930 < i_211_)
				i_202_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_209_ + i_213_ - 1) / i_213_;
			int i_216_ = i + i_200_ * ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_217_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113) - i_201_);
			if (i_200_ + i_202_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_202_ -= (i_200_ + i_202_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_200_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_218_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_200_);
				i_202_ -= i_218_;
				i_216_ += i_218_ * ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
				i_209_ += i_213_ * i_218_;
			}
			if (i + i_201_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_219_ = (i + i_201_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_201_ -= i_219_;
				i_217_ += i_219_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_220_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_201_ -= i_220_;
				i_216_ += i_220_;
				i_208_ += i_212_ * i_220_;
				i_217_ += i_220_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_205_ == 0) {
				if (i_203_ == 1) {
					int i_221_ = i_208_;
					for (int i_222_ = -i_202_; i_222_ < 0; i_222_++) {
						int i_223_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_224_ = -i_201_; i_224_ < 0; i_224_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool)
									is[i_216_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_223_]) & 0xff)]);
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_221_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 0) {
					int i_225_ = (i_204_ & 0xff0000) >> 16;
					int i_226_ = (i_204_ & 0xff00) >> 8;
					int i_227_ = i_204_ & 0xff;
					int i_228_ = i_208_;
					for (int i_229_ = -i_202_; i_229_ < 0; i_229_++) {
						int i_230_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_231_ = -i_201_; i_231_ < 0; i_231_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool) {
									int i_232_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_230_]) & 0xff)]);
									int i_233_ = ((i_232_ & 0xff0000) * i_225_ & ~0xffffff);
									int i_234_ = ((i_232_ & 0xff00) * i_226_ & 0xff0000);
									int i_235_ = (i_232_ & 0xff) * i_227_ & 0xff00;
									is[i_216_] = (i_233_ | i_234_ | i_235_) >>> 8;
								}
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_228_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 3) {
					int i_236_ = i_208_;
					for (int i_237_ = -i_202_; i_237_ < 0; i_237_++) {
						int i_238_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_239_ = -i_201_; i_239_ < 0; i_239_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool) {
									byte i_240_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_238_]);
									int i_241_ = (i_240_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_240_]) : 0);
									int i_242_ = i_241_ + i_204_;
									int i_243_ = ((i_241_ & 0xff00ff) + (i_204_ & 0xff00ff));
									int i_244_ = ((i_243_ & 0x1000100) + (i_242_ - i_243_ & 0x10000));
									is[i_216_] = i_242_ - i_244_ | i_244_ - (i_244_ >>> 8);
								}
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_236_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 2) {
					int i_245_ = i_204_ >>> 24;
					int i_246_ = 256 - i_245_;
					int i_247_ = (i_204_ & 0xff00ff) * i_246_ & ~0xff00ff;
					int i_248_ = (i_204_ & 0xff00) * i_246_ & 0xff0000;
					i_204_ = (i_247_ | i_248_) >>> 8;
					int i_249_ = i_208_;
					for (int i_250_ = -i_202_; i_250_ < 0; i_250_++) {
						int i_251_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_252_ = -i_201_; i_252_ < 0; i_252_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool) {
									int i_253_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_251_]) & 0xff)]);
									i_247_ = ((i_253_ & 0xff00ff) * i_245_ & ~0xff00ff);
									i_248_ = ((i_253_ & 0xff00) * i_245_ & 0xff0000);
									is[i_216_] = ((i_247_ | i_248_) >>> 8) + i_204_;
								}
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_249_;
						i_216_ += i_217_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_205_ == 1) {
				if (i_203_ == 1) {
					int i_254_ = i_208_;
					for (int i_255_ = -i_202_; i_255_ < 0; i_255_++) {
						int i_256_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_257_ = -i_201_; i_257_ < 0; i_257_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								int i_258_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_256_]);
								if (i_258_ != 0) {
									if (bool)
										is[i_216_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_258_ & 0xff]);
									if (bool_198_ && bool_207_)
										fs[i_216_] = f;
								}
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_254_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 0) {
					int i_259_ = i_208_;
					if ((i_204_ & 0xffffff) == 16777215) {
						int i_260_ = i_204_ >>> 24;
						int i_261_ = 256 - i_260_;
						for (int i_262_ = -i_202_; i_262_ < 0; i_262_++) {
							int i_263_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_264_ = -i_201_; i_264_ < 0; i_264_++) {
								if (!bool_198_ || f < fs[i_216_]) {
									int i_265_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_263_]);
									if (i_265_ != 0) {
										if (bool) {
											int i_266_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_265_ & 0xff]);
											int i_267_ = is[i_216_];
											is[i_216_] = (((((i_266_ & 0xff00ff) * i_260_) + ((i_267_ & 0xff00ff) * i_261_)) & ~0xff00ff) + ((((i_266_ & 0xff00) * i_260_) + ((i_267_ & 0xff00) * i_261_)) & 0xff0000)) >> 8;
										}
										if (bool_198_ && bool_207_)
											fs[i_216_] = f;
									}
								}
								i_208_ += i_212_;
								i_216_++;
							}
							i_209_ += i_213_;
							i_208_ = i_259_;
							i_216_ += i_217_;
						}
					} else {
						int i_268_ = (i_204_ & 0xff0000) >> 16;
						int i_269_ = (i_204_ & 0xff00) >> 8;
						int i_270_ = i_204_ & 0xff;
						int i_271_ = i_204_ >>> 24;
						int i_272_ = 256 - i_271_;
						for (int i_273_ = -i_202_; i_273_ < 0; i_273_++) {
							int i_274_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_275_ = -i_201_; i_275_ < 0; i_275_++) {
								if (!bool_198_ || f < fs[i_216_]) {
									int i_276_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_274_]);
									if (i_276_ != 0) {
										int i_277_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_276_ & 0xff]);
										if (i_271_ != 255) {
											if (bool) {
												int i_278_ = (((i_277_ & 0xff0000) * i_268_) & ~0xffffff);
												int i_279_ = (((i_277_ & 0xff00) * i_269_) & 0xff0000);
												int i_280_ = ((i_277_ & 0xff) * i_270_ & 0xff00);
												i_277_ = (i_278_ | i_279_ | i_280_) >>> 8;
												int i_281_ = is[i_216_];
												is[i_216_] = (((((i_277_ & 0xff00ff) * i_271_) + ((i_281_ & 0xff00ff) * i_272_)) & ~0xff00ff) + ((((i_277_ & 0xff00) * i_271_) + ((i_281_ & 0xff00) * i_272_)) & 0xff0000)) >> 8;
											}
											if (bool_198_ && bool_207_)
												fs[i_216_] = f;
										} else {
											if (bool) {
												int i_282_ = (((i_277_ & 0xff0000) * i_268_) & ~0xffffff);
												int i_283_ = (((i_277_ & 0xff00) * i_269_) & 0xff0000);
												int i_284_ = ((i_277_ & 0xff) * i_270_ & 0xff00);
												is[i_216_] = (i_282_ | i_283_ | i_284_) >>> 8;
											}
											if (bool_198_ && bool_207_)
												fs[i_216_] = f;
										}
									}
								}
								i_208_ += i_212_;
								i_216_++;
							}
							i_209_ += i_213_;
							i_208_ = i_259_;
							i_216_ += i_217_;
						}
					}
				} else if (i_203_ == 3) {
					int i_285_ = i_208_;
					int i_286_ = i_204_ >>> 24;
					int i_287_ = 256 - i_286_;
					for (int i_288_ = -i_202_; i_288_ < 0; i_288_++) {
						int i_289_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_290_ = -i_201_; i_290_ < 0; i_290_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool) {
									byte i_291_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_289_]);
									int i_292_ = (i_291_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_291_]) : 0);
									int i_293_ = i_292_ + i_204_;
									int i_294_ = ((i_292_ & 0xff00ff) + (i_204_ & 0xff00ff));
									int i_295_ = ((i_294_ & 0x1000100) + (i_293_ - i_294_ & 0x10000));
									i_295_ = i_293_ - i_295_ | i_295_ - (i_295_ >>> 8);
									if (i_292_ == 0 && i_286_ != 255) {
										i_292_ = i_295_;
										i_295_ = is[i_216_];
										i_295_ = ((((i_292_ & 0xff00ff) * i_286_ + ((i_295_ & 0xff00ff) * i_287_)) & ~0xff00ff) + (((i_292_ & 0xff00) * i_286_ + ((i_295_ & 0xff00) * i_287_)) & 0xff0000)) >> 8;
									}
									is[i_216_] = i_295_;
								}
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_285_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 2) {
					int i_296_ = i_204_ >>> 24;
					int i_297_ = 256 - i_296_;
					int i_298_ = (i_204_ & 0xff00ff) * i_297_ & ~0xff00ff;
					int i_299_ = (i_204_ & 0xff00) * i_297_ & 0xff0000;
					i_204_ = (i_298_ | i_299_) >>> 8;
					int i_300_ = i_208_;
					for (int i_301_ = -i_202_; i_301_ < 0; i_301_++) {
						int i_302_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_303_ = -i_201_; i_303_ < 0; i_303_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								int i_304_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_302_]);
								if (i_304_ != 0) {
									if (bool) {
										int i_305_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_304_ & 0xff]);
										i_298_ = ((i_305_ & 0xff00ff) * i_296_ & ~0xff00ff);
										i_299_ = ((i_305_ & 0xff00) * i_296_ & 0xff0000);
										is[i_216_] = (((i_298_ | i_299_) >>> 8) + i_204_);
									}
									if (bool_198_ && bool_207_)
										fs[i_216_] = f;
								}
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_300_;
						i_216_ += i_217_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_205_ == 2) {
				if (i_203_ == 1) {
					int i_306_ = i_208_;
					for (int i_307_ = -i_202_; i_307_ < 0; i_307_++) {
						int i_308_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_309_ = -i_201_; i_309_ < 0; i_309_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								int i_310_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_308_]);
								if (i_310_ != 0) {
									if (bool) {
										int i_311_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_310_ & 0xff]);
										int i_312_ = is[i_216_];
										int i_313_ = i_311_ + i_312_;
										int i_314_ = ((i_311_ & 0xff00ff) + (i_312_ & 0xff00ff));
										i_312_ = ((i_314_ & 0x1000100) + (i_313_ - i_314_ & 0x10000));
										is[i_216_] = (i_313_ - i_312_ | i_312_ - (i_312_ >>> 8));
									}
									if (bool_198_ && bool_207_)
										fs[i_216_] = f;
								}
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_306_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 0) {
					int i_315_ = i_208_;
					int i_316_ = (i_204_ & 0xff0000) >> 16;
					int i_317_ = (i_204_ & 0xff00) >> 8;
					int i_318_ = i_204_ & 0xff;
					for (int i_319_ = -i_202_; i_319_ < 0; i_319_++) {
						int i_320_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_321_ = -i_201_; i_321_ < 0; i_321_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								int i_322_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_320_]);
								if (i_322_ != 0) {
									if (bool) {
										int i_323_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_322_ & 0xff]);
										int i_324_ = ((i_323_ & 0xff0000) * i_316_ & ~0xffffff);
										int i_325_ = ((i_323_ & 0xff00) * i_317_ & 0xff0000);
										int i_326_ = ((i_323_ & 0xff) * i_318_ & 0xff00);
										i_323_ = (i_324_ | i_325_ | i_326_) >>> 8;
										int i_327_ = is[i_216_];
										int i_328_ = i_323_ + i_327_;
										int i_329_ = ((i_323_ & 0xff00ff) + (i_327_ & 0xff00ff));
										i_327_ = ((i_329_ & 0x1000100) + (i_328_ - i_329_ & 0x10000));
										is[i_216_] = (i_328_ - i_327_ | i_327_ - (i_327_ >>> 8));
									}
									if (bool_198_ && bool_207_)
										fs[i_216_] = f;
								}
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_315_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 3) {
					int i_330_ = i_208_;
					for (int i_331_ = -i_202_; i_331_ < 0; i_331_++) {
						int i_332_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_333_ = -i_201_; i_333_ < 0; i_333_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								if (bool) {
									byte i_334_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_332_]);
									int i_335_ = (i_334_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_334_]) : 0);
									int i_336_ = i_335_ + i_204_;
									int i_337_ = ((i_335_ & 0xff00ff) + (i_204_ & 0xff00ff));
									int i_338_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
									i_335_ = i_336_ - i_338_ | i_338_ - (i_338_ >>> 8);
									i_338_ = is[i_216_];
									i_336_ = i_335_ + i_338_;
									i_337_ = (i_335_ & 0xff00ff) + (i_338_ & 0xff00ff);
									i_338_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
									is[i_216_] = i_336_ - i_338_ | i_338_ - (i_338_ >>> 8);
								}
								if (bool_198_ && bool_207_)
									fs[i_216_] = f;
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_330_;
						i_216_ += i_217_;
					}
				} else if (i_203_ == 2) {
					int i_339_ = i_204_ >>> 24;
					int i_340_ = 256 - i_339_;
					int i_341_ = (i_204_ & 0xff00ff) * i_340_ & ~0xff00ff;
					int i_342_ = (i_204_ & 0xff00) * i_340_ & 0xff0000;
					i_204_ = (i_341_ | i_342_) >>> 8;
					int i_343_ = i_208_;
					for (int i_344_ = -i_202_; i_344_ < 0; i_344_++) {
						int i_345_ = ((i_209_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_346_ = -i_201_; i_346_ < 0; i_346_++) {
							if (!bool_198_ || f < fs[i_216_]) {
								int i_347_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_208_ >> 16) + i_345_]);
								if (i_347_ != 0) {
									if (bool) {
										int i_348_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_347_ & 0xff]);
										i_341_ = ((i_348_ & 0xff00ff) * i_339_ & ~0xff00ff);
										i_342_ = ((i_348_ & 0xff00) * i_339_ & 0xff0000);
										i_348_ = (((i_341_ | i_342_) >>> 8) + i_204_);
										int i_349_ = is[i_216_];
										int i_350_ = i_348_ + i_349_;
										int i_351_ = ((i_348_ & 0xff00ff) + (i_349_ & 0xff00ff));
										i_349_ = ((i_351_ & 0x1000100) + (i_350_ - i_351_ & 0x10000));
										is[i_216_] = (i_350_ - i_349_ | i_349_ - (i_349_ >>> 8));
									}
									if (bool_198_ && bool_207_)
										fs[i_216_] = f;
								}
							}
							i_208_ += i_212_;
							i_216_++;
						}
						i_209_ += i_213_;
						i_208_ = i_343_;
						i_216_ += i_217_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2599(int i, int i_352_, int i_353_, int i_354_, int i_355_, int i_356_, int i_357_, int i_358_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_353_ > 0 && i_354_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_359_ = 0;
				int i_360_ = 0;
				int i_361_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_362_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_363_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_364_ = (i_362_ << 16) / i_353_;
				int i_365_ = (i_363_ << 16) / i_354_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_366_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_364_ - 1) / i_364_);
					i += i_366_;
					i_359_ += (i_366_ * i_364_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_367_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_365_ - 1) / i_365_);
					i_352_ += i_367_;
					i_360_ += (i_367_ * i_365_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_362_)
					i_353_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_359_ + i_364_ - 1) / i_364_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_363_)
					i_354_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_360_ + i_365_ - 1) / i_365_;
				int i_368_ = i + i_352_ * i_361_;
				int i_369_ = i_361_ - i_353_;
				if (i_352_ + i_354_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_354_ -= (i_352_ + i_354_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_352_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_370_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_352_;
					i_354_ -= i_370_;
					i_368_ += i_370_ * i_361_;
					i_360_ += i_365_ * i_370_;
				}
				if (i + i_353_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
					int i_371_ = (i + i_353_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_353_ -= i_371_;
					i_369_ += i_371_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_372_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i;
					i_353_ -= i_372_;
					i_368_ += i_372_;
					i_359_ += i_364_ * i_372_;
					i_369_ += i_372_;
				}
				if (i_357_ == 0) {
					if (i_355_ == 1) {
						int i_373_ = i_359_;
						for (int i_374_ = -i_354_; i_374_ < 0; i_374_++) {
							int i_375_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_376_ = -i_353_; i_376_ < 0; i_376_++) {
								is[i_368_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_375_]) & 0xff]);
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_373_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 0) {
						int i_377_ = (i_356_ & 0xff0000) >> 16;
						int i_378_ = (i_356_ & 0xff00) >> 8;
						int i_379_ = i_356_ & 0xff;
						int i_380_ = i_359_;
						for (int i_381_ = -i_354_; i_381_ < 0; i_381_++) {
							int i_382_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_383_ = -i_353_; i_383_ < 0; i_383_++) {
								int i_384_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_382_]) & 0xff]);
								int i_385_ = (i_384_ & 0xff0000) * i_377_ & ~0xffffff;
								int i_386_ = (i_384_ & 0xff00) * i_378_ & 0xff0000;
								int i_387_ = (i_384_ & 0xff) * i_379_ & 0xff00;
								is[i_368_++] = (i_385_ | i_386_ | i_387_) >>> 8;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_380_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 3) {
						int i_388_ = i_359_;
						for (int i_389_ = -i_354_; i_389_ < 0; i_389_++) {
							int i_390_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_391_ = -i_353_; i_391_ < 0; i_391_++) {
								byte i_392_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_390_]);
								int i_393_ = (i_392_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_392_]) : 0);
								int i_394_ = i_393_ + i_356_;
								int i_395_ = ((i_393_ & 0xff00ff) + (i_356_ & 0xff00ff));
								int i_396_ = ((i_395_ & 0x1000100) + (i_394_ - i_395_ & 0x10000));
								is[i_368_++] = i_394_ - i_396_ | i_396_ - (i_396_ >>> 8);
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_388_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 2) {
						int i_397_ = i_356_ >>> 24;
						int i_398_ = 256 - i_397_;
						int i_399_ = (i_356_ & 0xff00ff) * i_398_ & ~0xff00ff;
						int i_400_ = (i_356_ & 0xff00) * i_398_ & 0xff0000;
						i_356_ = (i_399_ | i_400_) >>> 8;
						int i_401_ = i_359_;
						for (int i_402_ = -i_354_; i_402_ < 0; i_402_++) {
							int i_403_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_404_ = -i_353_; i_404_ < 0; i_404_++) {
								int i_405_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_403_]) & 0xff]);
								i_399_ = (i_405_ & 0xff00ff) * i_397_ & ~0xff00ff;
								i_400_ = (i_405_ & 0xff00) * i_397_ & 0xff0000;
								is[i_368_++] = ((i_399_ | i_400_) >>> 8) + i_356_;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_401_;
							i_368_ += i_369_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_357_ == 1) {
					if (i_355_ == 1) {
						int i_406_ = i_359_;
						for (int i_407_ = -i_354_; i_407_ < 0; i_407_++) {
							int i_408_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_409_ = -i_353_; i_409_ < 0; i_409_++) {
								int i_410_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_408_]);
								if (i_410_ != 0)
									is[i_368_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_410_ & 0xff]);
								else
									i_368_++;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_406_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 0) {
						int i_411_ = i_359_;
						if ((i_356_ & 0xffffff) == 16777215) {
							int i_412_ = i_356_ >>> 24;
							int i_413_ = 256 - i_412_;
							for (int i_414_ = -i_354_; i_414_ < 0; i_414_++) {
								int i_415_ = ((i_360_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_416_ = -i_353_; i_416_ < 0; i_416_++) {
									int i_417_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_415_]);
									if (i_417_ != 0) {
										int i_418_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_417_ & 0xff]);
										int i_419_ = is[i_368_];
										is[i_368_++] = ((((i_418_ & 0xff00ff) * i_412_ + ((i_419_ & 0xff00ff) * i_413_)) & ~0xff00ff) + (((i_418_ & 0xff00) * i_412_ + ((i_419_ & 0xff00) * i_413_)) & 0xff0000)) >> 8;
									} else
										i_368_++;
									i_359_ += i_364_;
								}
								i_360_ += i_365_;
								i_359_ = i_411_;
								i_368_ += i_369_;
							}
						} else {
							int i_420_ = (i_356_ & 0xff0000) >> 16;
							int i_421_ = (i_356_ & 0xff00) >> 8;
							int i_422_ = i_356_ & 0xff;
							int i_423_ = i_356_ >>> 24;
							int i_424_ = 256 - i_423_;
							for (int i_425_ = -i_354_; i_425_ < 0; i_425_++) {
								int i_426_ = ((i_360_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_427_ = -i_353_; i_427_ < 0; i_427_++) {
									int i_428_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_426_]);
									if (i_428_ != 0) {
										int i_429_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_428_ & 0xff]);
										if (i_423_ != 255) {
											int i_430_ = ((i_429_ & 0xff0000) * i_420_ & ~0xffffff);
											int i_431_ = ((i_429_ & 0xff00) * i_421_ & 0xff0000);
											int i_432_ = ((i_429_ & 0xff) * i_422_ & 0xff00);
											i_429_ = (i_430_ | i_431_ | i_432_) >>> 8;
											int i_433_ = is[i_368_];
											is[i_368_++] = (((((i_429_ & 0xff00ff) * i_423_) + ((i_433_ & 0xff00ff) * i_424_)) & ~0xff00ff) + ((((i_429_ & 0xff00) * i_423_) + ((i_433_ & 0xff00) * i_424_)) & 0xff0000)) >> 8;
										} else {
											int i_434_ = ((i_429_ & 0xff0000) * i_420_ & ~0xffffff);
											int i_435_ = ((i_429_ & 0xff00) * i_421_ & 0xff0000);
											int i_436_ = ((i_429_ & 0xff) * i_422_ & 0xff00);
											is[i_368_++] = (i_434_ | i_435_ | i_436_) >>> 8;
										}
									} else
										i_368_++;
									i_359_ += i_364_;
								}
								i_360_ += i_365_;
								i_359_ = i_411_;
								i_368_ += i_369_;
							}
						}
					} else if (i_355_ == 3) {
						int i_437_ = i_359_;
						int i_438_ = i_356_ >>> 24;
						int i_439_ = 256 - i_438_;
						for (int i_440_ = -i_354_; i_440_ < 0; i_440_++) {
							int i_441_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_442_ = -i_353_; i_442_ < 0; i_442_++) {
								byte i_443_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_441_]);
								int i_444_ = (i_443_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_443_]) : 0);
								int i_445_ = i_444_ + i_356_;
								int i_446_ = ((i_444_ & 0xff00ff) + (i_356_ & 0xff00ff));
								int i_447_ = ((i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000));
								i_447_ = i_445_ - i_447_ | i_447_ - (i_447_ >>> 8);
								if (i_444_ == 0 && i_438_ != 255) {
									i_444_ = i_447_;
									i_447_ = is[i_368_];
									i_447_ = ((((i_444_ & 0xff00ff) * i_438_ + (i_447_ & 0xff00ff) * i_439_) & ~0xff00ff) + (((i_444_ & 0xff00) * i_438_ + (i_447_ & 0xff00) * i_439_) & 0xff0000)) >> 8;
								}
								is[i_368_++] = i_447_;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_437_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 2) {
						int i_448_ = i_356_ >>> 24;
						int i_449_ = 256 - i_448_;
						int i_450_ = (i_356_ & 0xff00ff) * i_449_ & ~0xff00ff;
						int i_451_ = (i_356_ & 0xff00) * i_449_ & 0xff0000;
						i_356_ = (i_450_ | i_451_) >>> 8;
						int i_452_ = i_359_;
						for (int i_453_ = -i_354_; i_453_ < 0; i_453_++) {
							int i_454_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_455_ = -i_353_; i_455_ < 0; i_455_++) {
								int i_456_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_454_]);
								if (i_456_ != 0) {
									int i_457_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_456_ & 0xff]);
									i_450_ = ((i_457_ & 0xff00ff) * i_448_ & ~0xff00ff);
									i_451_ = ((i_457_ & 0xff00) * i_448_ & 0xff0000);
									is[i_368_++] = ((i_450_ | i_451_) >>> 8) + i_356_;
								} else
									i_368_++;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_452_;
							i_368_ += i_369_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_357_ == 2) {
					if (i_355_ == 1) {
						int i_458_ = i_359_;
						for (int i_459_ = -i_354_; i_459_ < 0; i_459_++) {
							int i_460_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_461_ = -i_353_; i_461_ < 0; i_461_++) {
								int i_462_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_460_]);
								if (i_462_ != 0) {
									int i_463_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_462_ & 0xff]);
									int i_464_ = is[i_368_];
									int i_465_ = i_463_ + i_464_;
									int i_466_ = ((i_463_ & 0xff00ff) + (i_464_ & 0xff00ff));
									i_464_ = ((i_466_ & 0x1000100) + (i_465_ - i_466_ & 0x10000));
									is[i_368_++] = i_465_ - i_464_ | i_464_ - (i_464_ >>> 8);
								} else
									i_368_++;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_458_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 0) {
						int i_467_ = i_359_;
						int i_468_ = (i_356_ & 0xff0000) >> 16;
						int i_469_ = (i_356_ & 0xff00) >> 8;
						int i_470_ = i_356_ & 0xff;
						for (int i_471_ = -i_354_; i_471_ < 0; i_471_++) {
							int i_472_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_473_ = -i_353_; i_473_ < 0; i_473_++) {
								int i_474_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_472_]);
								if (i_474_ != 0) {
									int i_475_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_474_ & 0xff]);
									int i_476_ = ((i_475_ & 0xff0000) * i_468_ & ~0xffffff);
									int i_477_ = ((i_475_ & 0xff00) * i_469_ & 0xff0000);
									int i_478_ = (i_475_ & 0xff) * i_470_ & 0xff00;
									i_475_ = (i_476_ | i_477_ | i_478_) >>> 8;
									int i_479_ = is[i_368_];
									int i_480_ = i_475_ + i_479_;
									int i_481_ = ((i_475_ & 0xff00ff) + (i_479_ & 0xff00ff));
									i_479_ = ((i_481_ & 0x1000100) + (i_480_ - i_481_ & 0x10000));
									is[i_368_++] = i_480_ - i_479_ | i_479_ - (i_479_ >>> 8);
								} else
									i_368_++;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_467_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 3) {
						int i_482_ = i_359_;
						for (int i_483_ = -i_354_; i_483_ < 0; i_483_++) {
							int i_484_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_485_ = -i_353_; i_485_ < 0; i_485_++) {
								byte i_486_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_484_]);
								int i_487_ = (i_486_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_486_]) : 0);
								int i_488_ = i_487_ + i_356_;
								int i_489_ = ((i_487_ & 0xff00ff) + (i_356_ & 0xff00ff));
								int i_490_ = ((i_489_ & 0x1000100) + (i_488_ - i_489_ & 0x10000));
								i_487_ = i_488_ - i_490_ | i_490_ - (i_490_ >>> 8);
								i_490_ = is[i_368_];
								i_488_ = i_487_ + i_490_;
								i_489_ = (i_487_ & 0xff00ff) + (i_490_ & 0xff00ff);
								i_490_ = (i_489_ & 0x1000100) + (i_488_ - i_489_ & 0x10000);
								is[i_368_++] = i_488_ - i_490_ | i_490_ - (i_490_ >>> 8);
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_482_;
							i_368_ += i_369_;
						}
					} else if (i_355_ == 2) {
						int i_491_ = i_356_ >>> 24;
						int i_492_ = 256 - i_491_;
						int i_493_ = (i_356_ & 0xff00ff) * i_492_ & ~0xff00ff;
						int i_494_ = (i_356_ & 0xff00) * i_492_ & 0xff0000;
						i_356_ = (i_493_ | i_494_) >>> 8;
						int i_495_ = i_359_;
						for (int i_496_ = -i_354_; i_496_ < 0; i_496_++) {
							int i_497_ = ((i_360_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_498_ = -i_353_; i_498_ < 0; i_498_++) {
								int i_499_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_359_ >> 16) + i_497_]);
								if (i_499_ != 0) {
									int i_500_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_499_ & 0xff]);
									i_493_ = ((i_500_ & 0xff00ff) * i_491_ & ~0xff00ff);
									i_494_ = ((i_500_ & 0xff00) * i_491_ & 0xff0000);
									i_500_ = ((i_493_ | i_494_) >>> 8) + i_356_;
									int i_501_ = is[i_368_];
									int i_502_ = i_500_ + i_501_;
									int i_503_ = ((i_500_ & 0xff00ff) + (i_501_ & 0xff00ff));
									i_501_ = ((i_503_ & 0x1000100) + (i_502_ - i_503_ & 0x10000));
									is[i_368_++] = i_502_ - i_501_ | i_501_ - (i_501_ >>> 8);
								} else
									i_368_++;
								i_359_ += i_364_;
							}
							i_360_ += i_365_;
							i_359_ = i_495_;
							i_368_ += i_369_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10058(int i, int i_504_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_505_ = anInt10940;
					while (i_505_ < 0) {
						int i_506_ = anInt10944;
						int i_507_ = anInt10951;
						int i_508_ = anInt10952;
						int i_509_ = anInt10958;
						if (i_507_ >= 0 && i_508_ >= 0 && i_507_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) < 0 && i_508_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
							for (/**/; i_509_ < 0; i_509_++) {
								int i_510_ = ((i_508_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_507_ >> 12));
								int i_511_ = i_506_++;
								if (i_504_ == 0) {
									if (i == 1)
										is[i_511_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]) & 0xff)]);
									else if (i == 0) {
										int i_512_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]) & 0xff)]);
										int i_513_ = ((i_512_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_514_ = ((i_512_ & 0xff00) * anInt10959 & 0xff0000);
										int i_515_ = ((i_512_ & 0xff) * anInt10960 & 0xff00);
										is[i_511_] = (i_513_ | i_514_ | i_515_) >>> 8;
									} else if (i == 3) {
										int i_516_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]) & 0xff)]);
										int i_517_ = anInt10928;
										int i_518_ = i_516_ + i_517_;
										int i_519_ = ((i_516_ & 0xff00ff) + (i_517_ & 0xff00ff));
										int i_520_ = ((i_519_ & 0x1000100) + (i_518_ - i_519_ & 0x10000));
										is[i_511_] = (i_518_ - i_520_ | i_520_ - (i_520_ >>> 8));
									} else if (i == 2) {
										int i_521_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]) & 0xff)]);
										int i_522_ = ((i_521_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_523_ = ((i_521_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_511_] = (((i_522_ | i_523_) >>> 8) + anInt10963);
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 1) {
									if (i == 1) {
										int i_524_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_524_ != 0)
											is[i_511_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_524_ & 0xff]);
									} else if (i == 0) {
										int i_525_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_525_ != 0) {
											int i_526_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_525_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_527_ = anInt10928 >>> 24;
												int i_528_ = 256 - i_527_;
												int i_529_ = is[i_511_];
												is[i_511_] = (((((i_526_ & 0xff00ff) * i_527_) + ((i_529_ & 0xff00ff) * i_528_)) & ~0xff00ff) + ((((i_526_ & 0xff00) * i_527_) + ((i_529_ & 0xff00) * i_528_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_530_ = (((i_526_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_531_ = (((i_526_ & 0xff00) * anInt10959) & 0xff0000);
												int i_532_ = (((i_526_ & 0xff) * anInt10960) & 0xff00);
												i_526_ = (i_530_ | i_531_ | i_532_) >>> 8;
												int i_533_ = is[i_511_];
												is[i_511_] = (((((i_526_ & 0xff00ff) * anInt10934) + ((i_533_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_526_ & 0xff00) * anInt10934) + ((i_533_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_534_ = (((i_526_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_535_ = (((i_526_ & 0xff00) * anInt10959) & 0xff0000);
												int i_536_ = (((i_526_ & 0xff) * anInt10960) & 0xff00);
												is[i_511_] = (i_534_ | i_535_ | i_536_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_537_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										int i_538_ = (i_537_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_537_]) : 0);
										int i_539_ = anInt10928;
										int i_540_ = i_538_ + i_539_;
										int i_541_ = ((i_538_ & 0xff00ff) + (i_539_ & 0xff00ff));
										int i_542_ = ((i_541_ & 0x1000100) + (i_540_ - i_541_ & 0x10000));
										i_542_ = (i_540_ - i_542_ | i_542_ - (i_542_ >>> 8));
										if (i_538_ == 0 && anInt10934 != 255) {
											i_538_ = i_542_;
											i_542_ = is[i_511_];
											i_542_ = (((((i_538_ & 0xff00ff) * anInt10934) + ((i_542_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_538_ & 0xff00) * anInt10934) + ((i_542_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_511_] = i_542_;
									} else if (i == 2) {
										int i_543_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_543_ != 0) {
											int i_544_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_543_ & 0xff]);
											int i_545_ = (((i_544_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_546_ = (((i_544_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_511_++] = (((i_545_ | i_546_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 2) {
									if (i == 1) {
										int i_547_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_547_ != 0) {
											int i_548_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_547_ & 0xff]);
											int i_549_ = is[i_511_];
											int i_550_ = i_548_ + i_549_;
											int i_551_ = ((i_548_ & 0xff00ff) + (i_549_ & 0xff00ff));
											i_549_ = ((i_551_ & 0x1000100) + (i_550_ - i_551_ & 0x10000));
											is[i_511_] = (i_550_ - i_549_ | i_549_ - (i_549_ >>> 8));
										}
									} else if (i == 0) {
										int i_552_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_552_ != 0) {
											int i_553_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_552_ & 0xff]);
											int i_554_ = (((i_553_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_555_ = (((i_553_ & 0xff00) * anInt10959) & 0xff0000);
											int i_556_ = ((i_553_ & 0xff) * anInt10960 & 0xff00);
											i_553_ = (i_554_ | i_555_ | i_556_) >>> 8;
											int i_557_ = is[i_511_];
											int i_558_ = i_553_ + i_557_;
											int i_559_ = ((i_553_ & 0xff00ff) + (i_557_ & 0xff00ff));
											i_557_ = ((i_559_ & 0x1000100) + (i_558_ - i_559_ & 0x10000));
											is[i_511_] = (i_558_ - i_557_ | i_557_ - (i_557_ >>> 8));
										}
									} else if (i == 3) {
										byte i_560_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										int i_561_ = (i_560_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_560_]) : 0);
										int i_562_ = anInt10928;
										int i_563_ = i_561_ + i_562_;
										int i_564_ = ((i_561_ & 0xff00ff) + (i_562_ & 0xff00ff));
										int i_565_ = ((i_564_ & 0x1000100) + (i_563_ - i_564_ & 0x10000));
										i_565_ = (i_563_ - i_565_ | i_565_ - (i_565_ >>> 8));
										if (i_561_ == 0 && anInt10934 != 255) {
											i_561_ = i_565_;
											i_565_ = is[i_511_];
											i_565_ = (((((i_561_ & 0xff00ff) * anInt10934) + ((i_565_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_561_ & 0xff00) * anInt10934) + ((i_565_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_511_] = i_565_;
									} else if (i == 2) {
										int i_566_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_510_]);
										if (i_566_ != 0) {
											int i_567_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_566_ & 0xff]);
											int i_568_ = (((i_567_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_569_ = (((i_567_ & 0xff00) * anInt10934) & 0xff0000);
											i_567_ = (((i_568_ | i_569_) >>> 8) + anInt10963);
											int i_570_ = is[i_511_];
											int i_571_ = i_567_ + i_570_;
											int i_572_ = ((i_567_ & 0xff00ff) + (i_570_ & 0xff00ff));
											i_570_ = ((i_572_ & 0x1000100) + (i_571_ - i_572_ & 0x10000));
											is[i_511_] = (i_571_ - i_570_ | i_570_ - (i_570_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_505_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_573_ = anInt10940;
					while (i_573_ < 0) {
						int i_574_ = anInt10944;
						int i_575_ = anInt10951;
						int i_576_ = anInt10952 + anInt10954;
						int i_577_ = anInt10958;
						if (i_575_ >= 0 && i_575_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) < 0) {
							int i_578_;
							if ((i_578_ = (i_576_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_578_ = (anInt10946 - i_578_) / anInt10946;
								i_577_ += i_578_;
								i_576_ += anInt10946 * i_578_;
								i_574_ += i_578_;
							}
							if ((i_578_ = (i_576_ - anInt10946) / anInt10946) > i_577_)
								i_577_ = i_578_;
							for (/**/; i_577_ < 0; i_577_++) {
								int i_579_ = ((i_576_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_575_ >> 12));
								int i_580_ = i_574_++;
								if (i_504_ == 0) {
									if (i == 1)
										is[i_580_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]) & 0xff)]);
									else if (i == 0) {
										int i_581_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]) & 0xff)]);
										int i_582_ = ((i_581_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_583_ = ((i_581_ & 0xff00) * anInt10959 & 0xff0000);
										int i_584_ = ((i_581_ & 0xff) * anInt10960 & 0xff00);
										is[i_580_] = (i_582_ | i_583_ | i_584_) >>> 8;
									} else if (i == 3) {
										int i_585_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]) & 0xff)]);
										int i_586_ = anInt10928;
										int i_587_ = i_585_ + i_586_;
										int i_588_ = ((i_585_ & 0xff00ff) + (i_586_ & 0xff00ff));
										int i_589_ = ((i_588_ & 0x1000100) + (i_587_ - i_588_ & 0x10000));
										is[i_580_] = (i_587_ - i_589_ | i_589_ - (i_589_ >>> 8));
									} else if (i == 2) {
										int i_590_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]) & 0xff)]);
										int i_591_ = ((i_590_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_592_ = ((i_590_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_580_] = (((i_591_ | i_592_) >>> 8) + anInt10963);
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 1) {
									if (i == 1) {
										int i_593_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_593_ != 0)
											is[i_580_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_593_ & 0xff]);
									} else if (i == 0) {
										int i_594_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_594_ != 0) {
											int i_595_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_594_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_596_ = anInt10928 >>> 24;
												int i_597_ = 256 - i_596_;
												int i_598_ = is[i_580_];
												is[i_580_] = (((((i_595_ & 0xff00ff) * i_596_) + ((i_598_ & 0xff00ff) * i_597_)) & ~0xff00ff) + ((((i_595_ & 0xff00) * i_596_) + ((i_598_ & 0xff00) * i_597_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_599_ = (((i_595_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_600_ = (((i_595_ & 0xff00) * anInt10959) & 0xff0000);
												int i_601_ = (((i_595_ & 0xff) * anInt10960) & 0xff00);
												i_595_ = (i_599_ | i_600_ | i_601_) >>> 8;
												int i_602_ = is[i_580_];
												is[i_580_] = (((((i_595_ & 0xff00ff) * anInt10934) + ((i_602_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_595_ & 0xff00) * anInt10934) + ((i_602_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_603_ = (((i_595_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_604_ = (((i_595_ & 0xff00) * anInt10959) & 0xff0000);
												int i_605_ = (((i_595_ & 0xff) * anInt10960) & 0xff00);
												is[i_580_] = (i_603_ | i_604_ | i_605_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_606_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										int i_607_ = (i_606_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_606_]) : 0);
										int i_608_ = anInt10928;
										int i_609_ = i_607_ + i_608_;
										int i_610_ = ((i_607_ & 0xff00ff) + (i_608_ & 0xff00ff));
										int i_611_ = ((i_610_ & 0x1000100) + (i_609_ - i_610_ & 0x10000));
										i_611_ = (i_609_ - i_611_ | i_611_ - (i_611_ >>> 8));
										if (i_607_ == 0 && anInt10934 != 255) {
											i_607_ = i_611_;
											i_611_ = is[i_580_];
											i_611_ = (((((i_607_ & 0xff00ff) * anInt10934) + ((i_611_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_607_ & 0xff00) * anInt10934) + ((i_611_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_580_] = i_611_;
									} else if (i == 2) {
										int i_612_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_612_ != 0) {
											int i_613_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_612_ & 0xff]);
											int i_614_ = (((i_613_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_615_ = (((i_613_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_580_++] = (((i_614_ | i_615_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 2) {
									if (i == 1) {
										int i_616_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_616_ != 0) {
											int i_617_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_616_ & 0xff]);
											int i_618_ = is[i_580_];
											int i_619_ = i_617_ + i_618_;
											int i_620_ = ((i_617_ & 0xff00ff) + (i_618_ & 0xff00ff));
											i_618_ = ((i_620_ & 0x1000100) + (i_619_ - i_620_ & 0x10000));
											is[i_580_] = (i_619_ - i_618_ | i_618_ - (i_618_ >>> 8));
										}
									} else if (i == 0) {
										int i_621_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_621_ != 0) {
											int i_622_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_621_ & 0xff]);
											int i_623_ = (((i_622_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_624_ = (((i_622_ & 0xff00) * anInt10959) & 0xff0000);
											int i_625_ = ((i_622_ & 0xff) * anInt10960 & 0xff00);
											i_622_ = (i_623_ | i_624_ | i_625_) >>> 8;
											int i_626_ = is[i_580_];
											int i_627_ = i_622_ + i_626_;
											int i_628_ = ((i_622_ & 0xff00ff) + (i_626_ & 0xff00ff));
											i_626_ = ((i_628_ & 0x1000100) + (i_627_ - i_628_ & 0x10000));
											is[i_580_] = (i_627_ - i_626_ | i_626_ - (i_626_ >>> 8));
										}
									} else if (i == 3) {
										byte i_629_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										int i_630_ = (i_629_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_629_]) : 0);
										int i_631_ = anInt10928;
										int i_632_ = i_630_ + i_631_;
										int i_633_ = ((i_630_ & 0xff00ff) + (i_631_ & 0xff00ff));
										int i_634_ = ((i_633_ & 0x1000100) + (i_632_ - i_633_ & 0x10000));
										i_634_ = (i_632_ - i_634_ | i_634_ - (i_634_ >>> 8));
										if (i_630_ == 0 && anInt10934 != 255) {
											i_630_ = i_634_;
											i_634_ = is[i_580_];
											i_634_ = (((((i_630_ & 0xff00ff) * anInt10934) + ((i_634_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_630_ & 0xff00) * anInt10934) + ((i_634_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_580_] = i_634_;
									} else if (i == 2) {
										int i_635_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_579_]);
										if (i_635_ != 0) {
											int i_636_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_635_ & 0xff]);
											int i_637_ = (((i_636_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_638_ = (((i_636_ & 0xff00) * anInt10934) & 0xff0000);
											i_636_ = (((i_637_ | i_638_) >>> 8) + anInt10963);
											int i_639_ = is[i_580_];
											int i_640_ = i_636_ + i_639_;
											int i_641_ = ((i_636_ & 0xff00ff) + (i_639_ & 0xff00ff));
											i_639_ = ((i_641_ & 0x1000100) + (i_640_ - i_641_ & 0x10000));
											is[i_580_] = (i_640_ - i_639_ | i_639_ - (i_639_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_576_ += anInt10946;
							}
						}
						i_573_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_642_ = anInt10940;
					while (i_642_ < 0) {
						int i_643_ = anInt10944;
						int i_644_ = anInt10951;
						int i_645_ = anInt10952 + anInt10954;
						int i_646_ = anInt10958;
						if (i_644_ >= 0 && i_644_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) < 0) {
							if (i_645_ < 0) {
								int i_647_ = (anInt10946 - 1 - i_645_) / anInt10946;
								i_646_ += i_647_;
								i_645_ += anInt10946 * i_647_;
								i_643_ += i_647_;
							}
							int i_648_;
							if ((i_648_ = (1 + i_645_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_646_)
								i_646_ = i_648_;
							for (/**/; i_646_ < 0; i_646_++) {
								int i_649_ = ((i_645_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_644_ >> 12));
								int i_650_ = i_643_++;
								if (i_504_ == 0) {
									if (i == 1)
										is[i_650_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]) & 0xff)]);
									else if (i == 0) {
										int i_651_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]) & 0xff)]);
										int i_652_ = ((i_651_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_653_ = ((i_651_ & 0xff00) * anInt10959 & 0xff0000);
										int i_654_ = ((i_651_ & 0xff) * anInt10960 & 0xff00);
										is[i_650_] = (i_652_ | i_653_ | i_654_) >>> 8;
									} else if (i == 3) {
										int i_655_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]) & 0xff)]);
										int i_656_ = anInt10928;
										int i_657_ = i_655_ + i_656_;
										int i_658_ = ((i_655_ & 0xff00ff) + (i_656_ & 0xff00ff));
										int i_659_ = ((i_658_ & 0x1000100) + (i_657_ - i_658_ & 0x10000));
										is[i_650_] = (i_657_ - i_659_ | i_659_ - (i_659_ >>> 8));
									} else if (i == 2) {
										int i_660_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]) & 0xff)]);
										int i_661_ = ((i_660_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_662_ = ((i_660_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_650_] = (((i_661_ | i_662_) >>> 8) + anInt10963);
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 1) {
									if (i == 1) {
										int i_663_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_663_ != 0)
											is[i_650_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_663_ & 0xff]);
									} else if (i == 0) {
										int i_664_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_664_ != 0) {
											int i_665_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_664_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_666_ = anInt10928 >>> 24;
												int i_667_ = 256 - i_666_;
												int i_668_ = is[i_650_];
												is[i_650_] = (((((i_665_ & 0xff00ff) * i_666_) + ((i_668_ & 0xff00ff) * i_667_)) & ~0xff00ff) + ((((i_665_ & 0xff00) * i_666_) + ((i_668_ & 0xff00) * i_667_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_669_ = (((i_665_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_670_ = (((i_665_ & 0xff00) * anInt10959) & 0xff0000);
												int i_671_ = (((i_665_ & 0xff) * anInt10960) & 0xff00);
												i_665_ = (i_669_ | i_670_ | i_671_) >>> 8;
												int i_672_ = is[i_650_];
												is[i_650_] = (((((i_665_ & 0xff00ff) * anInt10934) + ((i_672_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_665_ & 0xff00) * anInt10934) + ((i_672_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_673_ = (((i_665_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_674_ = (((i_665_ & 0xff00) * anInt10959) & 0xff0000);
												int i_675_ = (((i_665_ & 0xff) * anInt10960) & 0xff00);
												is[i_650_] = (i_673_ | i_674_ | i_675_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_676_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										int i_677_ = (i_676_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_676_]) : 0);
										int i_678_ = anInt10928;
										int i_679_ = i_677_ + i_678_;
										int i_680_ = ((i_677_ & 0xff00ff) + (i_678_ & 0xff00ff));
										int i_681_ = ((i_680_ & 0x1000100) + (i_679_ - i_680_ & 0x10000));
										i_681_ = (i_679_ - i_681_ | i_681_ - (i_681_ >>> 8));
										if (i_677_ == 0 && anInt10934 != 255) {
											i_677_ = i_681_;
											i_681_ = is[i_650_];
											i_681_ = (((((i_677_ & 0xff00ff) * anInt10934) + ((i_681_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_677_ & 0xff00) * anInt10934) + ((i_681_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_650_] = i_681_;
									} else if (i == 2) {
										int i_682_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_682_ != 0) {
											int i_683_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_682_ & 0xff]);
											int i_684_ = (((i_683_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_685_ = (((i_683_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_650_++] = (((i_684_ | i_685_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 2) {
									if (i == 1) {
										int i_686_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_686_ != 0) {
											int i_687_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_686_ & 0xff]);
											int i_688_ = is[i_650_];
											int i_689_ = i_687_ + i_688_;
											int i_690_ = ((i_687_ & 0xff00ff) + (i_688_ & 0xff00ff));
											i_688_ = ((i_690_ & 0x1000100) + (i_689_ - i_690_ & 0x10000));
											is[i_650_] = (i_689_ - i_688_ | i_688_ - (i_688_ >>> 8));
										}
									} else if (i == 0) {
										int i_691_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_691_ != 0) {
											int i_692_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_691_ & 0xff]);
											int i_693_ = (((i_692_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_694_ = (((i_692_ & 0xff00) * anInt10959) & 0xff0000);
											int i_695_ = ((i_692_ & 0xff) * anInt10960 & 0xff00);
											i_692_ = (i_693_ | i_694_ | i_695_) >>> 8;
											int i_696_ = is[i_650_];
											int i_697_ = i_692_ + i_696_;
											int i_698_ = ((i_692_ & 0xff00ff) + (i_696_ & 0xff00ff));
											i_696_ = ((i_698_ & 0x1000100) + (i_697_ - i_698_ & 0x10000));
											is[i_650_] = (i_697_ - i_696_ | i_696_ - (i_696_ >>> 8));
										}
									} else if (i == 3) {
										byte i_699_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										int i_700_ = (i_699_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_699_]) : 0);
										int i_701_ = anInt10928;
										int i_702_ = i_700_ + i_701_;
										int i_703_ = ((i_700_ & 0xff00ff) + (i_701_ & 0xff00ff));
										int i_704_ = ((i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000));
										i_704_ = (i_702_ - i_704_ | i_704_ - (i_704_ >>> 8));
										if (i_700_ == 0 && anInt10934 != 255) {
											i_700_ = i_704_;
											i_704_ = is[i_650_];
											i_704_ = (((((i_700_ & 0xff00ff) * anInt10934) + ((i_704_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_700_ & 0xff00) * anInt10934) + ((i_704_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_650_] = i_704_;
									} else if (i == 2) {
										int i_705_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_649_]);
										if (i_705_ != 0) {
											int i_706_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_705_ & 0xff]);
											int i_707_ = (((i_706_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_708_ = (((i_706_ & 0xff00) * anInt10934) & 0xff0000);
											i_706_ = (((i_707_ | i_708_) >>> 8) + anInt10963);
											int i_709_ = is[i_650_];
											int i_710_ = i_706_ + i_709_;
											int i_711_ = ((i_706_ & 0xff00ff) + (i_709_ & 0xff00ff));
											i_709_ = ((i_711_ & 0x1000100) + (i_710_ - i_711_ & 0x10000));
											is[i_650_] = (i_710_ - i_709_ | i_709_ - (i_709_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_645_ += anInt10946;
							}
						}
						i_642_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_712_ = anInt10940;
					while (i_712_ < 0) {
						int i_713_ = anInt10944;
						int i_714_ = anInt10951 + anInt10953;
						int i_715_ = anInt10952;
						int i_716_ = anInt10958;
						if (i_715_ >= 0 && i_715_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
							int i_717_;
							if ((i_717_ = (i_714_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_717_ = (anInt10956 - i_717_) / anInt10956;
								i_716_ += i_717_;
								i_714_ += anInt10956 * i_717_;
								i_713_ += i_717_;
							}
							if ((i_717_ = (i_714_ - anInt10956) / anInt10956) > i_716_)
								i_716_ = i_717_;
							for (/**/; i_716_ < 0; i_716_++) {
								int i_718_ = ((i_715_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_714_ >> 12));
								int i_719_ = i_713_++;
								if (i_504_ == 0) {
									if (i == 1)
										is[i_719_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]) & 0xff)]);
									else if (i == 0) {
										int i_720_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]) & 0xff)]);
										int i_721_ = ((i_720_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_722_ = ((i_720_ & 0xff00) * anInt10959 & 0xff0000);
										int i_723_ = ((i_720_ & 0xff) * anInt10960 & 0xff00);
										is[i_719_] = (i_721_ | i_722_ | i_723_) >>> 8;
									} else if (i == 3) {
										int i_724_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]) & 0xff)]);
										int i_725_ = anInt10928;
										int i_726_ = i_724_ + i_725_;
										int i_727_ = ((i_724_ & 0xff00ff) + (i_725_ & 0xff00ff));
										int i_728_ = ((i_727_ & 0x1000100) + (i_726_ - i_727_ & 0x10000));
										is[i_719_] = (i_726_ - i_728_ | i_728_ - (i_728_ >>> 8));
									} else if (i == 2) {
										int i_729_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]) & 0xff)]);
										int i_730_ = ((i_729_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_731_ = ((i_729_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_719_] = (((i_730_ | i_731_) >>> 8) + anInt10963);
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 1) {
									if (i == 1) {
										int i_732_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_732_ != 0)
											is[i_719_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_732_ & 0xff]);
									} else if (i == 0) {
										int i_733_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_733_ != 0) {
											int i_734_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_733_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_735_ = anInt10928 >>> 24;
												int i_736_ = 256 - i_735_;
												int i_737_ = is[i_719_];
												is[i_719_] = (((((i_734_ & 0xff00ff) * i_735_) + ((i_737_ & 0xff00ff) * i_736_)) & ~0xff00ff) + ((((i_734_ & 0xff00) * i_735_) + ((i_737_ & 0xff00) * i_736_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_738_ = (((i_734_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_739_ = (((i_734_ & 0xff00) * anInt10959) & 0xff0000);
												int i_740_ = (((i_734_ & 0xff) * anInt10960) & 0xff00);
												i_734_ = (i_738_ | i_739_ | i_740_) >>> 8;
												int i_741_ = is[i_719_];
												is[i_719_] = (((((i_734_ & 0xff00ff) * anInt10934) + ((i_741_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_734_ & 0xff00) * anInt10934) + ((i_741_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_742_ = (((i_734_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_743_ = (((i_734_ & 0xff00) * anInt10959) & 0xff0000);
												int i_744_ = (((i_734_ & 0xff) * anInt10960) & 0xff00);
												is[i_719_] = (i_742_ | i_743_ | i_744_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_745_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										int i_746_ = (i_745_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_745_]) : 0);
										int i_747_ = anInt10928;
										int i_748_ = i_746_ + i_747_;
										int i_749_ = ((i_746_ & 0xff00ff) + (i_747_ & 0xff00ff));
										int i_750_ = ((i_749_ & 0x1000100) + (i_748_ - i_749_ & 0x10000));
										i_750_ = (i_748_ - i_750_ | i_750_ - (i_750_ >>> 8));
										if (i_746_ == 0 && anInt10934 != 255) {
											i_746_ = i_750_;
											i_750_ = is[i_719_];
											i_750_ = (((((i_746_ & 0xff00ff) * anInt10934) + ((i_750_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_746_ & 0xff00) * anInt10934) + ((i_750_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_719_] = i_750_;
									} else if (i == 2) {
										int i_751_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_751_ != 0) {
											int i_752_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_751_ & 0xff]);
											int i_753_ = (((i_752_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_754_ = (((i_752_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_719_++] = (((i_753_ | i_754_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_504_ == 2) {
									if (i == 1) {
										int i_755_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_755_ != 0) {
											int i_756_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_755_ & 0xff]);
											int i_757_ = is[i_719_];
											int i_758_ = i_756_ + i_757_;
											int i_759_ = ((i_756_ & 0xff00ff) + (i_757_ & 0xff00ff));
											i_757_ = ((i_759_ & 0x1000100) + (i_758_ - i_759_ & 0x10000));
											is[i_719_] = (i_758_ - i_757_ | i_757_ - (i_757_ >>> 8));
										}
									} else if (i == 0) {
										int i_760_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_760_ != 0) {
											int i_761_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_760_ & 0xff]);
											int i_762_ = (((i_761_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_763_ = (((i_761_ & 0xff00) * anInt10959) & 0xff0000);
											int i_764_ = ((i_761_ & 0xff) * anInt10960 & 0xff00);
											i_761_ = (i_762_ | i_763_ | i_764_) >>> 8;
											int i_765_ = is[i_719_];
											int i_766_ = i_761_ + i_765_;
											int i_767_ = ((i_761_ & 0xff00ff) + (i_765_ & 0xff00ff));
											i_765_ = ((i_767_ & 0x1000100) + (i_766_ - i_767_ & 0x10000));
											is[i_719_] = (i_766_ - i_765_ | i_765_ - (i_765_ >>> 8));
										}
									} else if (i == 3) {
										byte i_768_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										int i_769_ = (i_768_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_768_]) : 0);
										int i_770_ = anInt10928;
										int i_771_ = i_769_ + i_770_;
										int i_772_ = ((i_769_ & 0xff00ff) + (i_770_ & 0xff00ff));
										int i_773_ = ((i_772_ & 0x1000100) + (i_771_ - i_772_ & 0x10000));
										i_773_ = (i_771_ - i_773_ | i_773_ - (i_773_ >>> 8));
										if (i_769_ == 0 && anInt10934 != 255) {
											i_769_ = i_773_;
											i_773_ = is[i_719_];
											i_773_ = (((((i_769_ & 0xff00ff) * anInt10934) + ((i_773_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_769_ & 0xff00) * anInt10934) + ((i_773_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_719_] = i_773_;
									} else if (i == 2) {
										int i_774_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_718_]);
										if (i_774_ != 0) {
											int i_775_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_774_ & 0xff]);
											int i_776_ = (((i_775_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_777_ = (((i_775_ & 0xff00) * anInt10934) & 0xff0000);
											i_775_ = (((i_776_ | i_777_) >>> 8) + anInt10963);
											int i_778_ = is[i_719_];
											int i_779_ = i_775_ + i_778_;
											int i_780_ = ((i_775_ & 0xff00ff) + (i_778_ & 0xff00ff));
											i_778_ = ((i_780_ & 0x1000100) + (i_779_ - i_780_ & 0x10000));
											is[i_719_] = (i_779_ - i_778_ | i_778_ - (i_778_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_714_ += anInt10956;
							}
						}
						i_712_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_781_ = anInt10940;
					while (i_781_ < 0) {
						int i_782_ = anInt10944;
						int i_783_ = anInt10951 + anInt10953;
						int i_784_ = anInt10952 + anInt10954;
						int i_785_ = anInt10958;
						int i_786_;
						if ((i_786_ = i_783_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) >= 0) {
							i_786_ = (anInt10956 - i_786_) / anInt10956;
							i_785_ += i_786_;
							i_783_ += anInt10956 * i_786_;
							i_784_ += anInt10946 * i_786_;
							i_782_ += i_786_;
						}
						if ((i_786_ = (i_783_ - anInt10956) / anInt10956) > i_785_)
							i_785_ = i_786_;
						if ((i_786_ = i_784_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
							i_786_ = (anInt10946 - i_786_) / anInt10946;
							i_785_ += i_786_;
							i_783_ += anInt10956 * i_786_;
							i_784_ += anInt10946 * i_786_;
							i_782_ += i_786_;
						}
						if ((i_786_ = (i_784_ - anInt10946) / anInt10946) > i_785_)
							i_785_ = i_786_;
						for (/**/; i_785_ < 0; i_785_++) {
							int i_787_ = (((i_784_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_783_ >> 12));
							int i_788_ = i_782_++;
							if (i_504_ == 0) {
								if (i == 1)
									is[i_788_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]) & 0xff]);
								else if (i == 0) {
									int i_789_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]) & 0xff]);
									int i_790_ = ((i_789_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_791_ = ((i_789_ & 0xff00) * anInt10959 & 0xff0000);
									int i_792_ = ((i_789_ & 0xff) * anInt10960 & 0xff00);
									is[i_788_] = (i_790_ | i_791_ | i_792_) >>> 8;
								} else if (i == 3) {
									int i_793_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]) & 0xff]);
									int i_794_ = anInt10928;
									int i_795_ = i_793_ + i_794_;
									int i_796_ = ((i_793_ & 0xff00ff) + (i_794_ & 0xff00ff));
									int i_797_ = ((i_796_ & 0x1000100) + (i_795_ - i_796_ & 0x10000));
									is[i_788_] = i_795_ - i_797_ | i_797_ - (i_797_ >>> 8);
								} else if (i == 2) {
									int i_798_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]) & 0xff]);
									int i_799_ = ((i_798_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_800_ = ((i_798_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_788_] = (((i_799_ | i_800_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 1) {
								if (i == 1) {
									int i_801_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_801_ != 0)
										is[i_788_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_801_ & 0xff]);
								} else if (i == 0) {
									int i_802_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_802_ != 0) {
										int i_803_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_802_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_804_ = anInt10928 >>> 24;
											int i_805_ = 256 - i_804_;
											int i_806_ = is[i_788_];
											is[i_788_] = (((((i_803_ & 0xff00ff) * i_804_) + ((i_806_ & 0xff00ff) * i_805_)) & ~0xff00ff) + ((((i_803_ & 0xff00) * i_804_) + ((i_806_ & 0xff00) * i_805_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_807_ = (((i_803_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_808_ = (((i_803_ & 0xff00) * anInt10959) & 0xff0000);
											int i_809_ = ((i_803_ & 0xff) * anInt10960 & 0xff00);
											i_803_ = (i_807_ | i_808_ | i_809_) >>> 8;
											int i_810_ = is[i_788_];
											is[i_788_] = (((((i_803_ & 0xff00ff) * anInt10934) + ((i_810_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_803_ & 0xff00) * anInt10934) + ((i_810_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_811_ = (((i_803_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_812_ = (((i_803_ & 0xff00) * anInt10959) & 0xff0000);
											int i_813_ = ((i_803_ & 0xff) * anInt10960 & 0xff00);
											is[i_788_] = (i_811_ | i_812_ | i_813_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_814_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									int i_815_ = (i_814_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_814_]) : 0);
									int i_816_ = anInt10928;
									int i_817_ = i_815_ + i_816_;
									int i_818_ = ((i_815_ & 0xff00ff) + (i_816_ & 0xff00ff));
									int i_819_ = ((i_818_ & 0x1000100) + (i_817_ - i_818_ & 0x10000));
									i_819_ = i_817_ - i_819_ | i_819_ - (i_819_ >>> 8);
									if (i_815_ == 0 && anInt10934 != 255) {
										i_815_ = i_819_;
										i_819_ = is[i_788_];
										i_819_ = (((((i_815_ & 0xff00ff) * anInt10934) + ((i_819_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_815_ & 0xff00) * anInt10934) + ((i_819_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_788_] = i_819_;
								} else if (i == 2) {
									int i_820_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_820_ != 0) {
										int i_821_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_820_ & 0xff]);
										int i_822_ = ((i_821_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_823_ = ((i_821_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_788_++] = ((i_822_ | i_823_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 2) {
								if (i == 1) {
									int i_824_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_824_ != 0) {
										int i_825_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_824_ & 0xff]);
										int i_826_ = is[i_788_];
										int i_827_ = i_825_ + i_826_;
										int i_828_ = ((i_825_ & 0xff00ff) + (i_826_ & 0xff00ff));
										i_826_ = ((i_828_ & 0x1000100) + (i_827_ - i_828_ & 0x10000));
										is[i_788_] = (i_827_ - i_826_ | i_826_ - (i_826_ >>> 8));
									}
								} else if (i == 0) {
									int i_829_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_829_ != 0) {
										int i_830_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_829_ & 0xff]);
										int i_831_ = ((i_830_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_832_ = ((i_830_ & 0xff00) * anInt10959 & 0xff0000);
										int i_833_ = ((i_830_ & 0xff) * anInt10960 & 0xff00);
										i_830_ = (i_831_ | i_832_ | i_833_) >>> 8;
										int i_834_ = is[i_788_];
										int i_835_ = i_830_ + i_834_;
										int i_836_ = ((i_830_ & 0xff00ff) + (i_834_ & 0xff00ff));
										i_834_ = ((i_836_ & 0x1000100) + (i_835_ - i_836_ & 0x10000));
										is[i_788_] = (i_835_ - i_834_ | i_834_ - (i_834_ >>> 8));
									}
								} else if (i == 3) {
									byte i_837_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									int i_838_ = (i_837_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_837_]) : 0);
									int i_839_ = anInt10928;
									int i_840_ = i_838_ + i_839_;
									int i_841_ = ((i_838_ & 0xff00ff) + (i_839_ & 0xff00ff));
									int i_842_ = ((i_841_ & 0x1000100) + (i_840_ - i_841_ & 0x10000));
									i_842_ = i_840_ - i_842_ | i_842_ - (i_842_ >>> 8);
									if (i_838_ == 0 && anInt10934 != 255) {
										i_838_ = i_842_;
										i_842_ = is[i_788_];
										i_842_ = (((((i_838_ & 0xff00ff) * anInt10934) + ((i_842_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_838_ & 0xff00) * anInt10934) + ((i_842_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_788_] = i_842_;
								} else if (i == 2) {
									int i_843_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_787_]);
									if (i_843_ != 0) {
										int i_844_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_843_ & 0xff]);
										int i_845_ = ((i_844_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_846_ = ((i_844_ & 0xff00) * anInt10934 & 0xff0000);
										i_844_ = (((i_845_ | i_846_) >>> 8) + anInt10963);
										int i_847_ = is[i_788_];
										int i_848_ = i_844_ + i_847_;
										int i_849_ = ((i_844_ & 0xff00ff) + (i_847_ & 0xff00ff));
										i_847_ = ((i_849_ & 0x1000100) + (i_848_ - i_849_ & 0x10000));
										is[i_788_] = (i_848_ - i_847_ | i_847_ - (i_847_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_783_ += anInt10956;
							i_784_ += anInt10946;
						}
						i_781_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_850_ = anInt10940;
					while (i_850_ < 0) {
						int i_851_ = anInt10944;
						int i_852_ = anInt10951 + anInt10953;
						int i_853_ = anInt10952 + anInt10954;
						int i_854_ = anInt10958;
						int i_855_;
						if ((i_855_ = i_852_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) >= 0) {
							i_855_ = (anInt10956 - i_855_) / anInt10956;
							i_854_ += i_855_;
							i_852_ += anInt10956 * i_855_;
							i_853_ += anInt10946 * i_855_;
							i_851_ += i_855_;
						}
						if ((i_855_ = (i_852_ - anInt10956) / anInt10956) > i_854_)
							i_854_ = i_855_;
						if (i_853_ < 0) {
							i_855_ = (anInt10946 - 1 - i_853_) / anInt10946;
							i_854_ += i_855_;
							i_852_ += anInt10956 * i_855_;
							i_853_ += anInt10946 * i_855_;
							i_851_ += i_855_;
						}
						if ((i_855_ = (1 + i_853_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_854_)
							i_854_ = i_855_;
						for (/**/; i_854_ < 0; i_854_++) {
							int i_856_ = (((i_853_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_852_ >> 12));
							int i_857_ = i_851_++;
							if (i_504_ == 0) {
								if (i == 1)
									is[i_857_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]) & 0xff]);
								else if (i == 0) {
									int i_858_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]) & 0xff]);
									int i_859_ = ((i_858_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_860_ = ((i_858_ & 0xff00) * anInt10959 & 0xff0000);
									int i_861_ = ((i_858_ & 0xff) * anInt10960 & 0xff00);
									is[i_857_] = (i_859_ | i_860_ | i_861_) >>> 8;
								} else if (i == 3) {
									int i_862_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]) & 0xff]);
									int i_863_ = anInt10928;
									int i_864_ = i_862_ + i_863_;
									int i_865_ = ((i_862_ & 0xff00ff) + (i_863_ & 0xff00ff));
									int i_866_ = ((i_865_ & 0x1000100) + (i_864_ - i_865_ & 0x10000));
									is[i_857_] = i_864_ - i_866_ | i_866_ - (i_866_ >>> 8);
								} else if (i == 2) {
									int i_867_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]) & 0xff]);
									int i_868_ = ((i_867_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_869_ = ((i_867_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_857_] = (((i_868_ | i_869_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 1) {
								if (i == 1) {
									int i_870_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_870_ != 0)
										is[i_857_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_870_ & 0xff]);
								} else if (i == 0) {
									int i_871_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_871_ != 0) {
										int i_872_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_871_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_873_ = anInt10928 >>> 24;
											int i_874_ = 256 - i_873_;
											int i_875_ = is[i_857_];
											is[i_857_] = (((((i_872_ & 0xff00ff) * i_873_) + ((i_875_ & 0xff00ff) * i_874_)) & ~0xff00ff) + ((((i_872_ & 0xff00) * i_873_) + ((i_875_ & 0xff00) * i_874_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_876_ = (((i_872_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_877_ = (((i_872_ & 0xff00) * anInt10959) & 0xff0000);
											int i_878_ = ((i_872_ & 0xff) * anInt10960 & 0xff00);
											i_872_ = (i_876_ | i_877_ | i_878_) >>> 8;
											int i_879_ = is[i_857_];
											is[i_857_] = (((((i_872_ & 0xff00ff) * anInt10934) + ((i_879_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_872_ & 0xff00) * anInt10934) + ((i_879_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_880_ = (((i_872_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_881_ = (((i_872_ & 0xff00) * anInt10959) & 0xff0000);
											int i_882_ = ((i_872_ & 0xff) * anInt10960 & 0xff00);
											is[i_857_] = (i_880_ | i_881_ | i_882_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_883_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									int i_884_ = (i_883_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_883_]) : 0);
									int i_885_ = anInt10928;
									int i_886_ = i_884_ + i_885_;
									int i_887_ = ((i_884_ & 0xff00ff) + (i_885_ & 0xff00ff));
									int i_888_ = ((i_887_ & 0x1000100) + (i_886_ - i_887_ & 0x10000));
									i_888_ = i_886_ - i_888_ | i_888_ - (i_888_ >>> 8);
									if (i_884_ == 0 && anInt10934 != 255) {
										i_884_ = i_888_;
										i_888_ = is[i_857_];
										i_888_ = (((((i_884_ & 0xff00ff) * anInt10934) + ((i_888_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_884_ & 0xff00) * anInt10934) + ((i_888_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_857_] = i_888_;
								} else if (i == 2) {
									int i_889_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_889_ != 0) {
										int i_890_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_889_ & 0xff]);
										int i_891_ = ((i_890_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_892_ = ((i_890_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_857_++] = ((i_891_ | i_892_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 2) {
								if (i == 1) {
									int i_893_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_893_ != 0) {
										int i_894_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_893_ & 0xff]);
										int i_895_ = is[i_857_];
										int i_896_ = i_894_ + i_895_;
										int i_897_ = ((i_894_ & 0xff00ff) + (i_895_ & 0xff00ff));
										i_895_ = ((i_897_ & 0x1000100) + (i_896_ - i_897_ & 0x10000));
										is[i_857_] = (i_896_ - i_895_ | i_895_ - (i_895_ >>> 8));
									}
								} else if (i == 0) {
									int i_898_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_898_ != 0) {
										int i_899_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_898_ & 0xff]);
										int i_900_ = ((i_899_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_901_ = ((i_899_ & 0xff00) * anInt10959 & 0xff0000);
										int i_902_ = ((i_899_ & 0xff) * anInt10960 & 0xff00);
										i_899_ = (i_900_ | i_901_ | i_902_) >>> 8;
										int i_903_ = is[i_857_];
										int i_904_ = i_899_ + i_903_;
										int i_905_ = ((i_899_ & 0xff00ff) + (i_903_ & 0xff00ff));
										i_903_ = ((i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000));
										is[i_857_] = (i_904_ - i_903_ | i_903_ - (i_903_ >>> 8));
									}
								} else if (i == 3) {
									byte i_906_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									int i_907_ = (i_906_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_906_]) : 0);
									int i_908_ = anInt10928;
									int i_909_ = i_907_ + i_908_;
									int i_910_ = ((i_907_ & 0xff00ff) + (i_908_ & 0xff00ff));
									int i_911_ = ((i_910_ & 0x1000100) + (i_909_ - i_910_ & 0x10000));
									i_911_ = i_909_ - i_911_ | i_911_ - (i_911_ >>> 8);
									if (i_907_ == 0 && anInt10934 != 255) {
										i_907_ = i_911_;
										i_911_ = is[i_857_];
										i_911_ = (((((i_907_ & 0xff00ff) * anInt10934) + ((i_911_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_907_ & 0xff00) * anInt10934) + ((i_911_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_857_] = i_911_;
								} else if (i == 2) {
									int i_912_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_856_]);
									if (i_912_ != 0) {
										int i_913_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_912_ & 0xff]);
										int i_914_ = ((i_913_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_915_ = ((i_913_ & 0xff00) * anInt10934 & 0xff0000);
										i_913_ = (((i_914_ | i_915_) >>> 8) + anInt10963);
										int i_916_ = is[i_857_];
										int i_917_ = i_913_ + i_916_;
										int i_918_ = ((i_913_ & 0xff00ff) + (i_916_ & 0xff00ff));
										i_916_ = ((i_918_ & 0x1000100) + (i_917_ - i_918_ & 0x10000));
										is[i_857_] = (i_917_ - i_916_ | i_916_ - (i_916_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_852_ += anInt10956;
							i_853_ += anInt10946;
						}
						i_850_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_919_ = anInt10940;
				while (i_919_ < 0) {
					int i_920_ = anInt10944;
					int i_921_ = anInt10951 + anInt10953;
					int i_922_ = anInt10952;
					int i_923_ = anInt10958;
					if (i_922_ >= 0 && i_922_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
						if (i_921_ < 0) {
							int i_924_ = (anInt10956 - 1 - i_921_) / anInt10956;
							i_923_ += i_924_;
							i_921_ += anInt10956 * i_924_;
							i_920_ += i_924_;
						}
						int i_925_;
						if ((i_925_ = (1 + i_921_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_923_)
							i_923_ = i_925_;
						for (/**/; i_923_ < 0; i_923_++) {
							int i_926_ = (((i_922_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_921_ >> 12));
							int i_927_ = i_920_++;
							if (i_504_ == 0) {
								if (i == 1)
									is[i_927_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]) & 0xff]);
								else if (i == 0) {
									int i_928_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]) & 0xff]);
									int i_929_ = ((i_928_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_930_ = ((i_928_ & 0xff00) * anInt10959 & 0xff0000);
									int i_931_ = ((i_928_ & 0xff) * anInt10960 & 0xff00);
									is[i_927_] = (i_929_ | i_930_ | i_931_) >>> 8;
								} else if (i == 3) {
									int i_932_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]) & 0xff]);
									int i_933_ = anInt10928;
									int i_934_ = i_932_ + i_933_;
									int i_935_ = ((i_932_ & 0xff00ff) + (i_933_ & 0xff00ff));
									int i_936_ = ((i_935_ & 0x1000100) + (i_934_ - i_935_ & 0x10000));
									is[i_927_] = i_934_ - i_936_ | i_936_ - (i_936_ >>> 8);
								} else if (i == 2) {
									int i_937_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]) & 0xff]);
									int i_938_ = ((i_937_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_939_ = ((i_937_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_927_] = (((i_938_ | i_939_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 1) {
								if (i == 1) {
									int i_940_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_940_ != 0)
										is[i_927_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_940_ & 0xff]);
								} else if (i == 0) {
									int i_941_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_941_ != 0) {
										int i_942_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_941_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_943_ = anInt10928 >>> 24;
											int i_944_ = 256 - i_943_;
											int i_945_ = is[i_927_];
											is[i_927_] = (((((i_942_ & 0xff00ff) * i_943_) + ((i_945_ & 0xff00ff) * i_944_)) & ~0xff00ff) + ((((i_942_ & 0xff00) * i_943_) + ((i_945_ & 0xff00) * i_944_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_946_ = (((i_942_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_947_ = (((i_942_ & 0xff00) * anInt10959) & 0xff0000);
											int i_948_ = ((i_942_ & 0xff) * anInt10960 & 0xff00);
											i_942_ = (i_946_ | i_947_ | i_948_) >>> 8;
											int i_949_ = is[i_927_];
											is[i_927_] = (((((i_942_ & 0xff00ff) * anInt10934) + ((i_949_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_942_ & 0xff00) * anInt10934) + ((i_949_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_950_ = (((i_942_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_951_ = (((i_942_ & 0xff00) * anInt10959) & 0xff0000);
											int i_952_ = ((i_942_ & 0xff) * anInt10960 & 0xff00);
											is[i_927_] = (i_950_ | i_951_ | i_952_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_953_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									int i_954_ = (i_953_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_953_]) : 0);
									int i_955_ = anInt10928;
									int i_956_ = i_954_ + i_955_;
									int i_957_ = ((i_954_ & 0xff00ff) + (i_955_ & 0xff00ff));
									int i_958_ = ((i_957_ & 0x1000100) + (i_956_ - i_957_ & 0x10000));
									i_958_ = i_956_ - i_958_ | i_958_ - (i_958_ >>> 8);
									if (i_954_ == 0 && anInt10934 != 255) {
										i_954_ = i_958_;
										i_958_ = is[i_927_];
										i_958_ = (((((i_954_ & 0xff00ff) * anInt10934) + ((i_958_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_954_ & 0xff00) * anInt10934) + ((i_958_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_927_] = i_958_;
								} else if (i == 2) {
									int i_959_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_959_ != 0) {
										int i_960_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_959_ & 0xff]);
										int i_961_ = ((i_960_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_962_ = ((i_960_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_927_++] = ((i_961_ | i_962_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_504_ == 2) {
								if (i == 1) {
									int i_963_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_963_ != 0) {
										int i_964_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_963_ & 0xff]);
										int i_965_ = is[i_927_];
										int i_966_ = i_964_ + i_965_;
										int i_967_ = ((i_964_ & 0xff00ff) + (i_965_ & 0xff00ff));
										i_965_ = ((i_967_ & 0x1000100) + (i_966_ - i_967_ & 0x10000));
										is[i_927_] = (i_966_ - i_965_ | i_965_ - (i_965_ >>> 8));
									}
								} else if (i == 0) {
									int i_968_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_968_ != 0) {
										int i_969_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_968_ & 0xff]);
										int i_970_ = ((i_969_ & 0xff0000) * anInt10955 & ~0xffffff);
										int i_971_ = ((i_969_ & 0xff00) * anInt10959 & 0xff0000);
										int i_972_ = ((i_969_ & 0xff) * anInt10960 & 0xff00);
										i_969_ = (i_970_ | i_971_ | i_972_) >>> 8;
										int i_973_ = is[i_927_];
										int i_974_ = i_969_ + i_973_;
										int i_975_ = ((i_969_ & 0xff00ff) + (i_973_ & 0xff00ff));
										i_973_ = ((i_975_ & 0x1000100) + (i_974_ - i_975_ & 0x10000));
										is[i_927_] = (i_974_ - i_973_ | i_973_ - (i_973_ >>> 8));
									}
								} else if (i == 3) {
									byte i_976_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									int i_977_ = (i_976_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_976_]) : 0);
									int i_978_ = anInt10928;
									int i_979_ = i_977_ + i_978_;
									int i_980_ = ((i_977_ & 0xff00ff) + (i_978_ & 0xff00ff));
									int i_981_ = ((i_980_ & 0x1000100) + (i_979_ - i_980_ & 0x10000));
									i_981_ = i_979_ - i_981_ | i_981_ - (i_981_ >>> 8);
									if (i_977_ == 0 && anInt10934 != 255) {
										i_977_ = i_981_;
										i_981_ = is[i_927_];
										i_981_ = (((((i_977_ & 0xff00ff) * anInt10934) + ((i_981_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_977_ & 0xff00) * anInt10934) + ((i_981_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_927_] = i_981_;
								} else if (i == 2) {
									int i_982_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_926_]);
									if (i_982_ != 0) {
										int i_983_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_982_ & 0xff]);
										int i_984_ = ((i_983_ & 0xff00ff) * anInt10934 & ~0xff00ff);
										int i_985_ = ((i_983_ & 0xff00) * anInt10934 & 0xff0000);
										i_983_ = (((i_984_ | i_985_) >>> 8) + anInt10963);
										int i_986_ = is[i_927_];
										int i_987_ = i_983_ + i_986_;
										int i_988_ = ((i_983_ & 0xff00ff) + (i_986_ & 0xff00ff));
										i_986_ = ((i_988_ & 0x1000100) + (i_987_ - i_988_ & 0x10000));
										is[i_927_] = (i_987_ - i_986_ | i_986_ - (i_986_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_921_ += anInt10956;
						}
					}
					i_919_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_989_ = anInt10940; i_989_ < 0; i_989_++) {
					int i_990_ = anInt10944;
					int i_991_ = anInt10951 + anInt10953;
					int i_992_ = anInt10952 + anInt10954;
					int i_993_ = anInt10958;
					if (i_991_ < 0) {
						int i_994_ = (anInt10956 - 1 - i_991_) / anInt10956;
						i_993_ += i_994_;
						i_991_ += anInt10956 * i_994_;
						i_992_ += anInt10946 * i_994_;
						i_990_ += i_994_;
					}
					int i_995_;
					if ((i_995_ = (1 + i_991_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_993_)
						i_993_ = i_995_;
					if ((i_995_ = i_992_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
						i_995_ = (anInt10946 - i_995_) / anInt10946;
						i_993_ += i_995_;
						i_991_ += anInt10956 * i_995_;
						i_992_ += anInt10946 * i_995_;
						i_990_ += i_995_;
					}
					if ((i_995_ = (i_992_ - anInt10946) / anInt10946) > i_993_)
						i_993_ = i_995_;
					for (/**/; i_993_ < 0; i_993_++) {
						int i_996_ = (((i_992_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_991_ >> 12));
						int i_997_ = i_990_++;
						if (i_504_ == 0) {
							if (i == 1)
								is[i_997_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]) & 0xff]);
							else if (i == 0) {
								int i_998_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]) & 0xff]);
								int i_999_ = ((i_998_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_1000_ = ((i_998_ & 0xff00) * anInt10959 & 0xff0000);
								int i_1001_ = (i_998_ & 0xff) * anInt10960 & 0xff00;
								is[i_997_] = (i_999_ | i_1000_ | i_1001_) >>> 8;
							} else if (i == 3) {
								int i_1002_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]) & 0xff]);
								int i_1003_ = anInt10928;
								int i_1004_ = i_1002_ + i_1003_;
								int i_1005_ = ((i_1002_ & 0xff00ff) + (i_1003_ & 0xff00ff));
								int i_1006_ = ((i_1005_ & 0x1000100) + (i_1004_ - i_1005_ & 0x10000));
								is[i_997_] = i_1004_ - i_1006_ | i_1006_ - (i_1006_ >>> 8);
							} else if (i == 2) {
								int i_1007_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]) & 0xff]);
								int i_1008_ = ((i_1007_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_1009_ = ((i_1007_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_997_] = ((i_1008_ | i_1009_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_504_ == 1) {
							if (i == 1) {
								int i_1010_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1010_ != 0)
									is[i_997_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1010_ & 0xff]);
							} else if (i == 0) {
								int i_1011_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1011_ != 0) {
									int i_1012_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1011_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_1013_ = anInt10928 >>> 24;
										int i_1014_ = 256 - i_1013_;
										int i_1015_ = is[i_997_];
										is[i_997_] = ((((i_1012_ & 0xff00ff) * i_1013_ + ((i_1015_ & 0xff00ff) * i_1014_)) & ~0xff00ff) + (((i_1012_ & 0xff00) * i_1013_ + ((i_1015_ & 0xff00) * i_1014_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_1016_ = (((i_1012_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1017_ = ((i_1012_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1018_ = ((i_1012_ & 0xff) * anInt10960 & 0xff00);
										i_1012_ = (i_1016_ | i_1017_ | i_1018_) >>> 8;
										int i_1019_ = is[i_997_];
										is[i_997_] = (((((i_1012_ & 0xff00ff) * anInt10934) + ((i_1019_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1012_ & 0xff00) * anInt10934) + ((i_1019_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_1020_ = (((i_1012_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1021_ = ((i_1012_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1022_ = ((i_1012_ & 0xff) * anInt10960 & 0xff00);
										is[i_997_] = (i_1020_ | i_1021_ | i_1022_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1023_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								int i_1024_ = (i_1023_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1023_]) : 0);
								int i_1025_ = anInt10928;
								int i_1026_ = i_1024_ + i_1025_;
								int i_1027_ = ((i_1024_ & 0xff00ff) + (i_1025_ & 0xff00ff));
								int i_1028_ = ((i_1027_ & 0x1000100) + (i_1026_ - i_1027_ & 0x10000));
								i_1028_ = i_1026_ - i_1028_ | i_1028_ - (i_1028_ >>> 8);
								if (i_1024_ == 0 && anInt10934 != 255) {
									i_1024_ = i_1028_;
									i_1028_ = is[i_997_];
									i_1028_ = ((((i_1024_ & 0xff00ff) * anInt10934 + ((i_1028_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1024_ & 0xff00) * anInt10934 + ((i_1028_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_997_] = i_1028_;
							} else if (i == 2) {
								int i_1029_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1029_ != 0) {
									int i_1030_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1029_ & 0xff]);
									int i_1031_ = ((i_1030_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1032_ = ((i_1030_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_997_++] = (((i_1031_ | i_1032_) >>> 8) + anInt10963);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_504_ == 2) {
							if (i == 1) {
								int i_1033_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1033_ != 0) {
									int i_1034_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1033_ & 0xff]);
									int i_1035_ = is[i_997_];
									int i_1036_ = i_1034_ + i_1035_;
									int i_1037_ = ((i_1034_ & 0xff00ff) + (i_1035_ & 0xff00ff));
									i_1035_ = ((i_1037_ & 0x1000100) + (i_1036_ - i_1037_ & 0x10000));
									is[i_997_] = (i_1036_ - i_1035_ | i_1035_ - (i_1035_ >>> 8));
								}
							} else if (i == 0) {
								int i_1038_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1038_ != 0) {
									int i_1039_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1038_ & 0xff]);
									int i_1040_ = ((i_1039_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1041_ = ((i_1039_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1042_ = ((i_1039_ & 0xff) * anInt10960 & 0xff00);
									i_1039_ = (i_1040_ | i_1041_ | i_1042_) >>> 8;
									int i_1043_ = is[i_997_];
									int i_1044_ = i_1039_ + i_1043_;
									int i_1045_ = ((i_1039_ & 0xff00ff) + (i_1043_ & 0xff00ff));
									i_1043_ = ((i_1045_ & 0x1000100) + (i_1044_ - i_1045_ & 0x10000));
									is[i_997_] = (i_1044_ - i_1043_ | i_1043_ - (i_1043_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1046_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								int i_1047_ = (i_1046_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1046_]) : 0);
								int i_1048_ = anInt10928;
								int i_1049_ = i_1047_ + i_1048_;
								int i_1050_ = ((i_1047_ & 0xff00ff) + (i_1048_ & 0xff00ff));
								int i_1051_ = ((i_1050_ & 0x1000100) + (i_1049_ - i_1050_ & 0x10000));
								i_1051_ = i_1049_ - i_1051_ | i_1051_ - (i_1051_ >>> 8);
								if (i_1047_ == 0 && anInt10934 != 255) {
									i_1047_ = i_1051_;
									i_1051_ = is[i_997_];
									i_1051_ = ((((i_1047_ & 0xff00ff) * anInt10934 + ((i_1051_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1047_ & 0xff00) * anInt10934 + ((i_1051_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_997_] = i_1051_;
							} else if (i == 2) {
								int i_1052_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_996_]);
								if (i_1052_ != 0) {
									int i_1053_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1052_ & 0xff]);
									int i_1054_ = ((i_1053_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1055_ = ((i_1053_ & 0xff00) * anInt10934 & 0xff0000);
									i_1053_ = (((i_1054_ | i_1055_) >>> 8) + anInt10963);
									int i_1056_ = is[i_997_];
									int i_1057_ = i_1053_ + i_1056_;
									int i_1058_ = ((i_1053_ & 0xff00ff) + (i_1056_ & 0xff00ff));
									i_1056_ = ((i_1058_ & 0x1000100) + (i_1057_ - i_1058_ & 0x10000));
									is[i_997_] = (i_1057_ - i_1056_ | i_1056_ - (i_1056_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_991_ += anInt10956;
						i_992_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_1059_ = anInt10940; i_1059_ < 0; i_1059_++) {
					int i_1060_ = anInt10944;
					int i_1061_ = anInt10951 + anInt10953;
					int i_1062_ = anInt10952 + anInt10954;
					int i_1063_ = anInt10958;
					if (i_1061_ < 0) {
						int i_1064_ = (anInt10956 - 1 - i_1061_) / anInt10956;
						i_1063_ += i_1064_;
						i_1061_ += anInt10956 * i_1064_;
						i_1062_ += anInt10946 * i_1064_;
						i_1060_ += i_1064_;
					}
					int i_1065_;
					if ((i_1065_ = (1 + i_1061_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1063_)
						i_1063_ = i_1065_;
					if (i_1062_ < 0) {
						i_1065_ = (anInt10946 - 1 - i_1062_) / anInt10946;
						i_1063_ += i_1065_;
						i_1061_ += anInt10956 * i_1065_;
						i_1062_ += anInt10946 * i_1065_;
						i_1060_ += i_1065_;
					}
					if ((i_1065_ = (1 + i_1062_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1063_)
						i_1063_ = i_1065_;
					for (/**/; i_1063_ < 0; i_1063_++) {
						int i_1066_ = (((i_1062_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1061_ >> 12));
						int i_1067_ = i_1060_++;
						if (i_504_ == 0) {
							if (i == 1)
								is[i_1067_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]) & 0xff]);
							else if (i == 0) {
								int i_1068_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]) & 0xff]);
								int i_1069_ = ((i_1068_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_1070_ = ((i_1068_ & 0xff00) * anInt10959 & 0xff0000);
								int i_1071_ = (i_1068_ & 0xff) * anInt10960 & 0xff00;
								is[i_1067_] = (i_1069_ | i_1070_ | i_1071_) >>> 8;
							} else if (i == 3) {
								int i_1072_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]) & 0xff]);
								int i_1073_ = anInt10928;
								int i_1074_ = i_1072_ + i_1073_;
								int i_1075_ = ((i_1072_ & 0xff00ff) + (i_1073_ & 0xff00ff));
								int i_1076_ = ((i_1075_ & 0x1000100) + (i_1074_ - i_1075_ & 0x10000));
								is[i_1067_] = i_1074_ - i_1076_ | i_1076_ - (i_1076_ >>> 8);
							} else if (i == 2) {
								int i_1077_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]) & 0xff]);
								int i_1078_ = ((i_1077_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_1079_ = ((i_1077_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_1067_] = ((i_1078_ | i_1079_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_504_ == 1) {
							if (i == 1) {
								int i_1080_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1080_ != 0)
									is[i_1067_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1080_ & 0xff]);
							} else if (i == 0) {
								int i_1081_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1081_ != 0) {
									int i_1082_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1081_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_1083_ = anInt10928 >>> 24;
										int i_1084_ = 256 - i_1083_;
										int i_1085_ = is[i_1067_];
										is[i_1067_] = ((((i_1082_ & 0xff00ff) * i_1083_ + ((i_1085_ & 0xff00ff) * i_1084_)) & ~0xff00ff) + (((i_1082_ & 0xff00) * i_1083_ + ((i_1085_ & 0xff00) * i_1084_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_1086_ = (((i_1082_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1087_ = ((i_1082_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1088_ = ((i_1082_ & 0xff) * anInt10960 & 0xff00);
										i_1082_ = (i_1086_ | i_1087_ | i_1088_) >>> 8;
										int i_1089_ = is[i_1067_];
										is[i_1067_] = (((((i_1082_ & 0xff00ff) * anInt10934) + ((i_1089_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1082_ & 0xff00) * anInt10934) + ((i_1089_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_1090_ = (((i_1082_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1091_ = ((i_1082_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1092_ = ((i_1082_ & 0xff) * anInt10960 & 0xff00);
										is[i_1067_] = (i_1090_ | i_1091_ | i_1092_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1093_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								int i_1094_ = (i_1093_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1093_]) : 0);
								int i_1095_ = anInt10928;
								int i_1096_ = i_1094_ + i_1095_;
								int i_1097_ = ((i_1094_ & 0xff00ff) + (i_1095_ & 0xff00ff));
								int i_1098_ = ((i_1097_ & 0x1000100) + (i_1096_ - i_1097_ & 0x10000));
								i_1098_ = i_1096_ - i_1098_ | i_1098_ - (i_1098_ >>> 8);
								if (i_1094_ == 0 && anInt10934 != 255) {
									i_1094_ = i_1098_;
									i_1098_ = is[i_1067_];
									i_1098_ = ((((i_1094_ & 0xff00ff) * anInt10934 + ((i_1098_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1094_ & 0xff00) * anInt10934 + ((i_1098_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1067_] = i_1098_;
							} else if (i == 2) {
								int i_1099_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1099_ != 0) {
									int i_1100_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1099_ & 0xff]);
									int i_1101_ = ((i_1100_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1102_ = ((i_1100_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1067_++] = ((i_1101_ | i_1102_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_504_ == 2) {
							if (i == 1) {
								int i_1103_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1103_ != 0) {
									int i_1104_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1103_ & 0xff]);
									int i_1105_ = is[i_1067_];
									int i_1106_ = i_1104_ + i_1105_;
									int i_1107_ = ((i_1104_ & 0xff00ff) + (i_1105_ & 0xff00ff));
									i_1105_ = ((i_1107_ & 0x1000100) + (i_1106_ - i_1107_ & 0x10000));
									is[i_1067_] = (i_1106_ - i_1105_ | i_1105_ - (i_1105_ >>> 8));
								}
							} else if (i == 0) {
								int i_1108_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1108_ != 0) {
									int i_1109_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1108_ & 0xff]);
									int i_1110_ = ((i_1109_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1111_ = ((i_1109_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1112_ = ((i_1109_ & 0xff) * anInt10960 & 0xff00);
									i_1109_ = (i_1110_ | i_1111_ | i_1112_) >>> 8;
									int i_1113_ = is[i_1067_];
									int i_1114_ = i_1109_ + i_1113_;
									int i_1115_ = ((i_1109_ & 0xff00ff) + (i_1113_ & 0xff00ff));
									i_1113_ = ((i_1115_ & 0x1000100) + (i_1114_ - i_1115_ & 0x10000));
									is[i_1067_] = (i_1114_ - i_1113_ | i_1113_ - (i_1113_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1116_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								int i_1117_ = (i_1116_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1116_]) : 0);
								int i_1118_ = anInt10928;
								int i_1119_ = i_1117_ + i_1118_;
								int i_1120_ = ((i_1117_ & 0xff00ff) + (i_1118_ & 0xff00ff));
								int i_1121_ = ((i_1120_ & 0x1000100) + (i_1119_ - i_1120_ & 0x10000));
								i_1121_ = i_1119_ - i_1121_ | i_1121_ - (i_1121_ >>> 8);
								if (i_1117_ == 0 && anInt10934 != 255) {
									i_1117_ = i_1121_;
									i_1121_ = is[i_1067_];
									i_1121_ = ((((i_1117_ & 0xff00ff) * anInt10934 + ((i_1121_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1117_ & 0xff00) * anInt10934 + ((i_1121_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1067_] = i_1121_;
							} else if (i == 2) {
								int i_1122_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1066_]);
								if (i_1122_ != 0) {
									int i_1123_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1122_ & 0xff]);
									int i_1124_ = ((i_1123_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1125_ = ((i_1123_ & 0xff00) * anInt10934 & 0xff0000);
									i_1123_ = (((i_1124_ | i_1125_) >>> 8) + anInt10963);
									int i_1126_ = is[i_1067_];
									int i_1127_ = i_1123_ + i_1126_;
									int i_1128_ = ((i_1123_ & 0xff00ff) + (i_1126_ & 0xff00ff));
									i_1126_ = ((i_1128_ & 0x1000100) + (i_1127_ - i_1128_ & 0x10000));
									is[i_1067_] = (i_1127_ - i_1126_ | i_1126_ - (i_1126_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1061_ += anInt10956;
						i_1062_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10053(int[] is, int[] is_1129_, int i, int i_1130_) {
		int[] is_1131_ = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_1131_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_1132_ = anInt10940;
					while (i_1132_ < 0) {
						int i_1133_ = i_1132_ + i_1130_;
						if (i_1133_ >= 0) {
							if (i_1133_ >= is.length)
								break;
							int i_1134_ = anInt10944;
							int i_1135_ = anInt10951;
							int i_1136_ = anInt10952;
							int i_1137_ = anInt10958;
							if (i_1135_ >= 0 && i_1136_ >= 0 && (i_1135_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_1136_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
								int i_1138_ = is[i_1133_] - i;
								int i_1139_ = -is_1129_[i_1133_];
								int i_1140_ = i_1138_ - (i_1134_ - anInt10944);
								if (i_1140_ > 0) {
									i_1134_ += i_1140_;
									i_1137_ += i_1140_;
									i_1135_ += anInt10956 * i_1140_;
									i_1136_ += anInt10946 * i_1140_;
								} else
									i_1139_ -= i_1140_;
								if (i_1137_ < i_1139_)
									i_1137_ = i_1139_;
								for (/**/; i_1137_ < 0; i_1137_++) {
									int i_1141_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1136_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1135_ >> 12))]);
									if (i_1141_ != 0)
										is_1131_[i_1134_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1141_ & 0xff]);
									else
										i_1134_++;
								}
							}
						}
						i_1132_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1142_ = anInt10940;
					while (i_1142_ < 0) {
						int i_1143_ = i_1142_ + i_1130_;
						if (i_1143_ >= 0) {
							if (i_1143_ >= is.length)
								break;
							int i_1144_ = anInt10944;
							int i_1145_ = anInt10951;
							int i_1146_ = anInt10952 + anInt10954;
							int i_1147_ = anInt10958;
							if (i_1145_ >= 0 && (i_1145_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
								int i_1148_;
								if ((i_1148_ = i_1146_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
									i_1148_ = (anInt10946 - i_1148_) / anInt10946;
									i_1147_ += i_1148_;
									i_1146_ += anInt10946 * i_1148_;
									i_1144_ += i_1148_;
								}
								if ((i_1148_ = (i_1146_ - anInt10946) / anInt10946) > i_1147_)
									i_1147_ = i_1148_;
								int i_1149_ = is[i_1143_] - i;
								int i_1150_ = -is_1129_[i_1143_];
								int i_1151_ = i_1149_ - (i_1144_ - anInt10944);
								if (i_1151_ > 0) {
									i_1144_ += i_1151_;
									i_1147_ += i_1151_;
									i_1145_ += anInt10956 * i_1151_;
									i_1146_ += anInt10946 * i_1151_;
								} else
									i_1150_ -= i_1151_;
								if (i_1147_ < i_1150_)
									i_1147_ = i_1150_;
								for (/**/; i_1147_ < 0; i_1147_++) {
									int i_1152_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1146_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1145_ >> 12))]);
									if (i_1152_ != 0)
										is_1131_[i_1144_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1152_ & 0xff]);
									else
										i_1144_++;
									i_1146_ += anInt10946;
								}
							}
						}
						i_1142_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1153_ = anInt10940;
					while (i_1153_ < 0) {
						int i_1154_ = i_1153_ + i_1130_;
						if (i_1154_ >= 0) {
							if (i_1154_ >= is.length)
								break;
							int i_1155_ = anInt10944;
							int i_1156_ = anInt10951;
							int i_1157_ = anInt10952 + anInt10954;
							int i_1158_ = anInt10958;
							if (i_1156_ >= 0 && (i_1156_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
								if (i_1157_ < 0) {
									int i_1159_ = ((anInt10946 - 1 - i_1157_) / anInt10946);
									i_1158_ += i_1159_;
									i_1157_ += anInt10946 * i_1159_;
									i_1155_ += i_1159_;
								}
								int i_1160_;
								if ((i_1160_ = (1 + i_1157_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_1158_)
									i_1158_ = i_1160_;
								int i_1161_ = is[i_1154_] - i;
								int i_1162_ = -is_1129_[i_1154_];
								int i_1163_ = i_1161_ - (i_1155_ - anInt10944);
								if (i_1163_ > 0) {
									i_1155_ += i_1163_;
									i_1158_ += i_1163_;
									i_1156_ += anInt10956 * i_1163_;
									i_1157_ += anInt10946 * i_1163_;
								} else
									i_1162_ -= i_1163_;
								if (i_1158_ < i_1162_)
									i_1158_ = i_1162_;
								for (/**/; i_1158_ < 0; i_1158_++) {
									int i_1164_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1157_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1156_ >> 12))]);
									if (i_1164_ != 0)
										is_1131_[i_1155_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1164_ & 0xff]);
									else
										i_1155_++;
									i_1157_ += anInt10946;
								}
							}
						}
						i_1153_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_1165_ = anInt10940;
					while (i_1165_ < 0) {
						int i_1166_ = i_1165_ + i_1130_;
						if (i_1166_ >= 0) {
							if (i_1166_ >= is.length)
								break;
							int i_1167_ = anInt10944;
							int i_1168_ = anInt10951 + anInt10953;
							int i_1169_ = anInt10952;
							int i_1170_ = anInt10958;
							if (i_1169_ >= 0 && (i_1169_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
								int i_1171_;
								if ((i_1171_ = i_1168_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
									i_1171_ = (anInt10956 - i_1171_) / anInt10956;
									i_1170_ += i_1171_;
									i_1168_ += anInt10956 * i_1171_;
									i_1167_ += i_1171_;
								}
								if ((i_1171_ = (i_1168_ - anInt10956) / anInt10956) > i_1170_)
									i_1170_ = i_1171_;
								int i_1172_ = is[i_1166_] - i;
								int i_1173_ = -is_1129_[i_1166_];
								int i_1174_ = i_1172_ - (i_1167_ - anInt10944);
								if (i_1174_ > 0) {
									i_1167_ += i_1174_;
									i_1170_ += i_1174_;
									i_1168_ += anInt10956 * i_1174_;
									i_1169_ += anInt10946 * i_1174_;
								} else
									i_1173_ -= i_1174_;
								if (i_1170_ < i_1173_)
									i_1170_ = i_1173_;
								for (/**/; i_1170_ < 0; i_1170_++) {
									int i_1175_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1169_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1168_ >> 12))]);
									if (i_1175_ != 0)
										is_1131_[i_1167_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1175_ & 0xff]);
									else
										i_1167_++;
									i_1168_ += anInt10956;
								}
							}
						}
						i_1165_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1176_ = anInt10940;
					while (i_1176_ < 0) {
						int i_1177_ = i_1176_ + i_1130_;
						if (i_1177_ >= 0) {
							if (i_1177_ >= is.length)
								break;
							int i_1178_ = anInt10944;
							int i_1179_ = anInt10951 + anInt10953;
							int i_1180_ = anInt10952 + anInt10954;
							int i_1181_ = anInt10958;
							int i_1182_;
							if ((i_1182_ = (i_1179_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_1182_ = (anInt10956 - i_1182_) / anInt10956;
								i_1181_ += i_1182_;
								i_1179_ += anInt10956 * i_1182_;
								i_1180_ += anInt10946 * i_1182_;
								i_1178_ += i_1182_;
							}
							if ((i_1182_ = (i_1179_ - anInt10956) / anInt10956) > i_1181_)
								i_1181_ = i_1182_;
							if ((i_1182_ = (i_1180_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_1182_ = (anInt10946 - i_1182_) / anInt10946;
								i_1181_ += i_1182_;
								i_1179_ += anInt10956 * i_1182_;
								i_1180_ += anInt10946 * i_1182_;
								i_1178_ += i_1182_;
							}
							if ((i_1182_ = (i_1180_ - anInt10946) / anInt10946) > i_1181_)
								i_1181_ = i_1182_;
							int i_1183_ = is[i_1177_] - i;
							int i_1184_ = -is_1129_[i_1177_];
							int i_1185_ = i_1183_ - (i_1178_ - anInt10944);
							if (i_1185_ > 0) {
								i_1178_ += i_1185_;
								i_1181_ += i_1185_;
								i_1179_ += anInt10956 * i_1185_;
								i_1180_ += anInt10946 * i_1185_;
							} else
								i_1184_ -= i_1185_;
							if (i_1181_ < i_1184_)
								i_1181_ = i_1184_;
							for (/**/; i_1181_ < 0; i_1181_++) {
								int i_1186_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_1180_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1179_ >> 12)]);
								if (i_1186_ != 0)
									is_1131_[i_1178_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1186_ & 0xff]);
								else
									i_1178_++;
								i_1179_ += anInt10956;
								i_1180_ += anInt10946;
							}
						}
						i_1176_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1187_ = anInt10940;
					while (i_1187_ < 0) {
						int i_1188_ = i_1187_ + i_1130_;
						if (i_1188_ >= 0) {
							if (i_1188_ >= is.length)
								break;
							int i_1189_ = anInt10944;
							int i_1190_ = anInt10951 + anInt10953;
							int i_1191_ = anInt10952 + anInt10954;
							int i_1192_ = anInt10958;
							int i_1193_;
							if ((i_1193_ = (i_1190_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_1193_ = (anInt10956 - i_1193_) / anInt10956;
								i_1192_ += i_1193_;
								i_1190_ += anInt10956 * i_1193_;
								i_1191_ += anInt10946 * i_1193_;
								i_1189_ += i_1193_;
							}
							if ((i_1193_ = (i_1190_ - anInt10956) / anInt10956) > i_1192_)
								i_1192_ = i_1193_;
							if (i_1191_ < 0) {
								i_1193_ = (anInt10946 - 1 - i_1191_) / anInt10946;
								i_1192_ += i_1193_;
								i_1190_ += anInt10956 * i_1193_;
								i_1191_ += anInt10946 * i_1193_;
								i_1189_ += i_1193_;
							}
							if ((i_1193_ = (1 + i_1191_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1192_)
								i_1192_ = i_1193_;
							int i_1194_ = is[i_1188_] - i;
							int i_1195_ = -is_1129_[i_1188_];
							int i_1196_ = i_1194_ - (i_1189_ - anInt10944);
							if (i_1196_ > 0) {
								i_1189_ += i_1196_;
								i_1192_ += i_1196_;
								i_1190_ += anInt10956 * i_1196_;
								i_1191_ += anInt10946 * i_1196_;
							} else
								i_1195_ -= i_1196_;
							if (i_1192_ < i_1195_)
								i_1192_ = i_1195_;
							for (/**/; i_1192_ < 0; i_1192_++) {
								int i_1197_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_1191_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1190_ >> 12)]);
								if (i_1197_ != 0)
									is_1131_[i_1189_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1197_ & 0xff]);
								else
									i_1189_++;
								i_1190_ += anInt10956;
								i_1191_ += anInt10946;
							}
						}
						i_1187_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_1198_ = anInt10940;
				while (i_1198_ < 0) {
					int i_1199_ = i_1198_ + i_1130_;
					if (i_1199_ >= 0) {
						if (i_1199_ >= is.length)
							break;
						int i_1200_ = anInt10944;
						int i_1201_ = anInt10951 + anInt10953;
						int i_1202_ = anInt10952;
						int i_1203_ = anInt10958;
						if (i_1202_ >= 0 && (i_1202_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							if (i_1201_ < 0) {
								int i_1204_ = (anInt10956 - 1 - i_1201_) / anInt10956;
								i_1203_ += i_1204_;
								i_1201_ += anInt10956 * i_1204_;
								i_1200_ += i_1204_;
							}
							int i_1205_;
							if ((i_1205_ = (1 + i_1201_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1203_)
								i_1203_ = i_1205_;
							int i_1206_ = is[i_1199_] - i;
							int i_1207_ = -is_1129_[i_1199_];
							int i_1208_ = i_1206_ - (i_1200_ - anInt10944);
							if (i_1208_ > 0) {
								i_1200_ += i_1208_;
								i_1203_ += i_1208_;
								i_1201_ += anInt10956 * i_1208_;
								i_1202_ += anInt10946 * i_1208_;
							} else
								i_1207_ -= i_1208_;
							if (i_1203_ < i_1207_)
								i_1203_ = i_1207_;
							for (/**/; i_1203_ < 0; i_1203_++) {
								int i_1209_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_1202_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_1201_ >> 12)]);
								if (i_1209_ != 0)
									is_1131_[i_1200_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1209_ & 0xff]);
								else
									i_1200_++;
								i_1201_ += anInt10956;
							}
						}
					}
					i_1198_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_1210_ = anInt10940;
				while (i_1210_ < 0) {
					int i_1211_ = i_1210_ + i_1130_;
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
						if ((i_1217_ = (1 + i_1213_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1215_)
							i_1215_ = i_1217_;
						if ((i_1217_ = i_1214_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_1217_ = (anInt10946 - i_1217_) / anInt10946;
							i_1215_ += i_1217_;
							i_1213_ += anInt10956 * i_1217_;
							i_1214_ += anInt10946 * i_1217_;
							i_1212_ += i_1217_;
						}
						if ((i_1217_ = (i_1214_ - anInt10946) / anInt10946) > i_1215_)
							i_1215_ = i_1217_;
						int i_1218_ = is[i_1211_] - i;
						int i_1219_ = -is_1129_[i_1211_];
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
							int i_1221_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1214_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1213_ >> 12))]);
							if (i_1221_ != 0)
								is_1131_[i_1212_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1221_ & 0xff]);
							else
								i_1212_++;
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
				int i_1222_ = anInt10940;
				while (i_1222_ < 0) {
					int i_1223_ = i_1222_ + i_1130_;
					if (i_1223_ >= 0) {
						if (i_1223_ >= is.length)
							break;
						int i_1224_ = anInt10944;
						int i_1225_ = anInt10951 + anInt10953;
						int i_1226_ = anInt10952 + anInt10954;
						int i_1227_ = anInt10958;
						if (i_1225_ < 0) {
							int i_1228_ = (anInt10956 - 1 - i_1225_) / anInt10956;
							i_1227_ += i_1228_;
							i_1225_ += anInt10956 * i_1228_;
							i_1226_ += anInt10946 * i_1228_;
							i_1224_ += i_1228_;
						}
						int i_1229_;
						if ((i_1229_ = (1 + i_1225_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1227_)
							i_1227_ = i_1229_;
						if (i_1226_ < 0) {
							i_1229_ = (anInt10946 - 1 - i_1226_) / anInt10946;
							i_1227_ += i_1229_;
							i_1225_ += anInt10956 * i_1229_;
							i_1226_ += anInt10946 * i_1229_;
							i_1224_ += i_1229_;
						}
						if ((i_1229_ = (1 + i_1226_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1227_)
							i_1227_ = i_1229_;
						int i_1230_ = is[i_1223_] - i;
						int i_1231_ = -is_1129_[i_1223_];
						int i_1232_ = i_1230_ - (i_1224_ - anInt10944);
						if (i_1232_ > 0) {
							i_1224_ += i_1232_;
							i_1227_ += i_1232_;
							i_1225_ += anInt10956 * i_1232_;
							i_1226_ += anInt10946 * i_1232_;
						} else
							i_1231_ -= i_1232_;
						if (i_1227_ < i_1231_)
							i_1227_ = i_1231_;
						for (/**/; i_1227_ < 0; i_1227_++) {
							int i_1233_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_1226_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1225_ >> 12))]);
							if (i_1233_ != 0)
								is_1131_[i_1224_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1233_ & 0xff]);
							else
								i_1224_++;
							i_1225_ += anInt10956;
							i_1226_ += anInt10946;
						}
					}
					i_1222_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public void method2627(int i, int i_1234_, int i_1235_, int i_1236_, int[] is, int i_1237_, int i_1238_) {
		throw new IllegalStateException();
	}

	void method10057(int i, int i_1239_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_1240_ = anInt10940;
					while (i_1240_ < 0) {
						int i_1241_ = anInt10944;
						int i_1242_ = anInt10951;
						int i_1243_ = anInt10952;
						int i_1244_ = anInt10958;
						if (i_1242_ >= 0 && i_1243_ >= 0 && (i_1242_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_1243_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							for (/**/; i_1244_ < 0; i_1244_++) {
								int i_1245_ = ((i_1243_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_1242_ >> 12));
								int i_1246_ = i_1241_++;
								if (i_1239_ == 0) {
									if (i == 1)
										is[i_1246_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]) & 0xff)]);
									else if (i == 0) {
										int i_1247_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]) & 0xff)]);
										int i_1248_ = (((i_1247_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1249_ = ((i_1247_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1250_ = ((i_1247_ & 0xff) * anInt10960 & 0xff00);
										is[i_1246_] = (i_1248_ | i_1249_ | i_1250_) >>> 8;
									} else if (i == 3) {
										int i_1251_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]) & 0xff)]);
										int i_1252_ = anInt10928;
										int i_1253_ = i_1251_ + i_1252_;
										int i_1254_ = ((i_1251_ & 0xff00ff) + (i_1252_ & 0xff00ff));
										int i_1255_ = ((i_1254_ & 0x1000100) + (i_1253_ - i_1254_ & 0x10000));
										is[i_1246_] = (i_1253_ - i_1255_ | i_1255_ - (i_1255_ >>> 8));
									} else if (i == 2) {
										int i_1256_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]) & 0xff)]);
										int i_1257_ = (((i_1256_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1258_ = ((i_1256_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1246_] = ((i_1257_ | i_1258_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 1) {
									if (i == 1) {
										int i_1259_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1259_ != 0)
											is[i_1246_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1259_ & 0xff]);
									} else if (i == 0) {
										int i_1260_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1260_ != 0) {
											int i_1261_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1260_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_1262_ = anInt10928 >>> 24;
												int i_1263_ = 256 - i_1262_;
												int i_1264_ = is[i_1246_];
												is[i_1246_] = (((((i_1261_ & 0xff00ff) * i_1262_) + ((i_1264_ & 0xff00ff) * i_1263_)) & ~0xff00ff) + ((((i_1261_ & 0xff00) * i_1262_) + ((i_1264_ & 0xff00) * i_1263_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_1265_ = (((i_1261_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1266_ = (((i_1261_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1267_ = (((i_1261_ & 0xff) * anInt10960) & 0xff00);
												i_1261_ = (i_1265_ | i_1266_ | i_1267_) >>> 8;
												int i_1268_ = is[i_1246_];
												is[i_1246_] = (((((i_1261_ & 0xff00ff) * anInt10934) + ((i_1268_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1261_ & 0xff00) * anInt10934) + ((i_1268_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_1269_ = (((i_1261_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1270_ = (((i_1261_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1271_ = (((i_1261_ & 0xff) * anInt10960) & 0xff00);
												is[i_1246_] = (i_1269_ | i_1270_ | i_1271_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1272_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										int i_1273_ = (i_1272_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1272_]) : 0);
										int i_1274_ = anInt10928;
										int i_1275_ = i_1273_ + i_1274_;
										int i_1276_ = ((i_1273_ & 0xff00ff) + (i_1274_ & 0xff00ff));
										int i_1277_ = ((i_1276_ & 0x1000100) + (i_1275_ - i_1276_ & 0x10000));
										i_1277_ = (i_1275_ - i_1277_ | i_1277_ - (i_1277_ >>> 8));
										if (i_1273_ == 0 && anInt10934 != 255) {
											i_1273_ = i_1277_;
											i_1277_ = is[i_1246_];
											i_1277_ = (((((i_1273_ & 0xff00ff) * anInt10934) + ((i_1277_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1273_ & 0xff00) * anInt10934) + ((i_1277_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1246_] = i_1277_;
									} else if (i == 2) {
										int i_1278_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1278_ != 0) {
											int i_1279_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1278_ & 0xff]);
											int i_1280_ = (((i_1279_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1281_ = (((i_1279_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_1246_++] = (((i_1280_ | i_1281_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 2) {
									if (i == 1) {
										int i_1282_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1282_ != 0) {
											int i_1283_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1282_ & 0xff]);
											int i_1284_ = is[i_1246_];
											int i_1285_ = i_1283_ + i_1284_;
											int i_1286_ = ((i_1283_ & 0xff00ff) + (i_1284_ & 0xff00ff));
											i_1284_ = ((i_1286_ & 0x1000100) + (i_1285_ - i_1286_ & 0x10000));
											is[i_1246_] = (i_1285_ - i_1284_ | i_1284_ - (i_1284_ >>> 8));
										}
									} else if (i == 0) {
										int i_1287_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1287_ != 0) {
											int i_1288_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1287_ & 0xff]);
											int i_1289_ = (((i_1288_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1290_ = (((i_1288_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1291_ = (((i_1288_ & 0xff) * anInt10960) & 0xff00);
											i_1288_ = (i_1289_ | i_1290_ | i_1291_) >>> 8;
											int i_1292_ = is[i_1246_];
											int i_1293_ = i_1288_ + i_1292_;
											int i_1294_ = ((i_1288_ & 0xff00ff) + (i_1292_ & 0xff00ff));
											i_1292_ = ((i_1294_ & 0x1000100) + (i_1293_ - i_1294_ & 0x10000));
											is[i_1246_] = (i_1293_ - i_1292_ | i_1292_ - (i_1292_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1295_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										int i_1296_ = (i_1295_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1295_]) : 0);
										int i_1297_ = anInt10928;
										int i_1298_ = i_1296_ + i_1297_;
										int i_1299_ = ((i_1296_ & 0xff00ff) + (i_1297_ & 0xff00ff));
										int i_1300_ = ((i_1299_ & 0x1000100) + (i_1298_ - i_1299_ & 0x10000));
										i_1300_ = (i_1298_ - i_1300_ | i_1300_ - (i_1300_ >>> 8));
										if (i_1296_ == 0 && anInt10934 != 255) {
											i_1296_ = i_1300_;
											i_1300_ = is[i_1246_];
											i_1300_ = (((((i_1296_ & 0xff00ff) * anInt10934) + ((i_1300_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1296_ & 0xff00) * anInt10934) + ((i_1300_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1246_] = i_1300_;
									} else if (i == 2) {
										int i_1301_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1245_]);
										if (i_1301_ != 0) {
											int i_1302_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1301_ & 0xff]);
											int i_1303_ = (((i_1302_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1304_ = (((i_1302_ & 0xff00) * anInt10934) & 0xff0000);
											i_1302_ = ((i_1303_ | i_1304_) >>> 8) + anInt10963;
											int i_1305_ = is[i_1246_];
											int i_1306_ = i_1302_ + i_1305_;
											int i_1307_ = ((i_1302_ & 0xff00ff) + (i_1305_ & 0xff00ff));
											i_1305_ = ((i_1307_ & 0x1000100) + (i_1306_ - i_1307_ & 0x10000));
											is[i_1246_] = (i_1306_ - i_1305_ | i_1305_ - (i_1305_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1240_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1308_ = anInt10940;
					while (i_1308_ < 0) {
						int i_1309_ = anInt10944;
						int i_1310_ = anInt10951;
						int i_1311_ = anInt10952 + anInt10954;
						int i_1312_ = anInt10958;
						if (i_1310_ >= 0 && (i_1310_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							int i_1313_;
							if ((i_1313_ = (i_1311_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_1313_ = (anInt10946 - i_1313_) / anInt10946;
								i_1312_ += i_1313_;
								i_1311_ += anInt10946 * i_1313_;
								i_1309_ += i_1313_;
							}
							if ((i_1313_ = (i_1311_ - anInt10946) / anInt10946) > i_1312_)
								i_1312_ = i_1313_;
							for (/**/; i_1312_ < 0; i_1312_++) {
								int i_1314_ = ((i_1311_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_1310_ >> 12));
								int i_1315_ = i_1309_++;
								if (i_1239_ == 0) {
									if (i == 1)
										is[i_1315_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]) & 0xff)]);
									else if (i == 0) {
										int i_1316_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]) & 0xff)]);
										int i_1317_ = (((i_1316_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1318_ = ((i_1316_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1319_ = ((i_1316_ & 0xff) * anInt10960 & 0xff00);
										is[i_1315_] = (i_1317_ | i_1318_ | i_1319_) >>> 8;
									} else if (i == 3) {
										int i_1320_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]) & 0xff)]);
										int i_1321_ = anInt10928;
										int i_1322_ = i_1320_ + i_1321_;
										int i_1323_ = ((i_1320_ & 0xff00ff) + (i_1321_ & 0xff00ff));
										int i_1324_ = ((i_1323_ & 0x1000100) + (i_1322_ - i_1323_ & 0x10000));
										is[i_1315_] = (i_1322_ - i_1324_ | i_1324_ - (i_1324_ >>> 8));
									} else if (i == 2) {
										int i_1325_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]) & 0xff)]);
										int i_1326_ = (((i_1325_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1327_ = ((i_1325_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1315_] = ((i_1326_ | i_1327_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 1) {
									if (i == 1) {
										int i_1328_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1328_ != 0)
											is[i_1315_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1328_ & 0xff]);
									} else if (i == 0) {
										int i_1329_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1329_ != 0) {
											int i_1330_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1329_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_1331_ = anInt10928 >>> 24;
												int i_1332_ = 256 - i_1331_;
												int i_1333_ = is[i_1315_];
												is[i_1315_] = (((((i_1330_ & 0xff00ff) * i_1331_) + ((i_1333_ & 0xff00ff) * i_1332_)) & ~0xff00ff) + ((((i_1330_ & 0xff00) * i_1331_) + ((i_1333_ & 0xff00) * i_1332_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_1334_ = (((i_1330_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1335_ = (((i_1330_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1336_ = (((i_1330_ & 0xff) * anInt10960) & 0xff00);
												i_1330_ = (i_1334_ | i_1335_ | i_1336_) >>> 8;
												int i_1337_ = is[i_1315_];
												is[i_1315_] = (((((i_1330_ & 0xff00ff) * anInt10934) + ((i_1337_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1330_ & 0xff00) * anInt10934) + ((i_1337_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_1338_ = (((i_1330_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1339_ = (((i_1330_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1340_ = (((i_1330_ & 0xff) * anInt10960) & 0xff00);
												is[i_1315_] = (i_1338_ | i_1339_ | i_1340_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1341_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										int i_1342_ = (i_1341_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1341_]) : 0);
										int i_1343_ = anInt10928;
										int i_1344_ = i_1342_ + i_1343_;
										int i_1345_ = ((i_1342_ & 0xff00ff) + (i_1343_ & 0xff00ff));
										int i_1346_ = ((i_1345_ & 0x1000100) + (i_1344_ - i_1345_ & 0x10000));
										i_1346_ = (i_1344_ - i_1346_ | i_1346_ - (i_1346_ >>> 8));
										if (i_1342_ == 0 && anInt10934 != 255) {
											i_1342_ = i_1346_;
											i_1346_ = is[i_1315_];
											i_1346_ = (((((i_1342_ & 0xff00ff) * anInt10934) + ((i_1346_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1342_ & 0xff00) * anInt10934) + ((i_1346_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1315_] = i_1346_;
									} else if (i == 2) {
										int i_1347_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1347_ != 0) {
											int i_1348_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1347_ & 0xff]);
											int i_1349_ = (((i_1348_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1350_ = (((i_1348_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_1315_++] = (((i_1349_ | i_1350_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 2) {
									if (i == 1) {
										int i_1351_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1351_ != 0) {
											int i_1352_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1351_ & 0xff]);
											int i_1353_ = is[i_1315_];
											int i_1354_ = i_1352_ + i_1353_;
											int i_1355_ = ((i_1352_ & 0xff00ff) + (i_1353_ & 0xff00ff));
											i_1353_ = ((i_1355_ & 0x1000100) + (i_1354_ - i_1355_ & 0x10000));
											is[i_1315_] = (i_1354_ - i_1353_ | i_1353_ - (i_1353_ >>> 8));
										}
									} else if (i == 0) {
										int i_1356_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1356_ != 0) {
											int i_1357_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1356_ & 0xff]);
											int i_1358_ = (((i_1357_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1359_ = (((i_1357_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1360_ = (((i_1357_ & 0xff) * anInt10960) & 0xff00);
											i_1357_ = (i_1358_ | i_1359_ | i_1360_) >>> 8;
											int i_1361_ = is[i_1315_];
											int i_1362_ = i_1357_ + i_1361_;
											int i_1363_ = ((i_1357_ & 0xff00ff) + (i_1361_ & 0xff00ff));
											i_1361_ = ((i_1363_ & 0x1000100) + (i_1362_ - i_1363_ & 0x10000));
											is[i_1315_] = (i_1362_ - i_1361_ | i_1361_ - (i_1361_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1364_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										int i_1365_ = (i_1364_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1364_]) : 0);
										int i_1366_ = anInt10928;
										int i_1367_ = i_1365_ + i_1366_;
										int i_1368_ = ((i_1365_ & 0xff00ff) + (i_1366_ & 0xff00ff));
										int i_1369_ = ((i_1368_ & 0x1000100) + (i_1367_ - i_1368_ & 0x10000));
										i_1369_ = (i_1367_ - i_1369_ | i_1369_ - (i_1369_ >>> 8));
										if (i_1365_ == 0 && anInt10934 != 255) {
											i_1365_ = i_1369_;
											i_1369_ = is[i_1315_];
											i_1369_ = (((((i_1365_ & 0xff00ff) * anInt10934) + ((i_1369_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1365_ & 0xff00) * anInt10934) + ((i_1369_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1315_] = i_1369_;
									} else if (i == 2) {
										int i_1370_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1314_]);
										if (i_1370_ != 0) {
											int i_1371_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1370_ & 0xff]);
											int i_1372_ = (((i_1371_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1373_ = (((i_1371_ & 0xff00) * anInt10934) & 0xff0000);
											i_1371_ = ((i_1372_ | i_1373_) >>> 8) + anInt10963;
											int i_1374_ = is[i_1315_];
											int i_1375_ = i_1371_ + i_1374_;
											int i_1376_ = ((i_1371_ & 0xff00ff) + (i_1374_ & 0xff00ff));
											i_1374_ = ((i_1376_ & 0x1000100) + (i_1375_ - i_1376_ & 0x10000));
											is[i_1315_] = (i_1375_ - i_1374_ | i_1374_ - (i_1374_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1311_ += anInt10946;
							}
						}
						i_1308_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1377_ = anInt10940;
					while (i_1377_ < 0) {
						int i_1378_ = anInt10944;
						int i_1379_ = anInt10951;
						int i_1380_ = anInt10952 + anInt10954;
						int i_1381_ = anInt10958;
						if (i_1379_ >= 0 && (i_1379_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							if (i_1380_ < 0) {
								int i_1382_ = (anInt10946 - 1 - i_1380_) / anInt10946;
								i_1381_ += i_1382_;
								i_1380_ += anInt10946 * i_1382_;
								i_1378_ += i_1382_;
							}
							int i_1383_;
							if ((i_1383_ = (1 + i_1380_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1381_)
								i_1381_ = i_1383_;
							for (/**/; i_1381_ < 0; i_1381_++) {
								int i_1384_ = ((i_1380_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_1379_ >> 12));
								int i_1385_ = i_1378_++;
								if (i_1239_ == 0) {
									if (i == 1)
										is[i_1385_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]) & 0xff)]);
									else if (i == 0) {
										int i_1386_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]) & 0xff)]);
										int i_1387_ = (((i_1386_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1388_ = ((i_1386_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1389_ = ((i_1386_ & 0xff) * anInt10960 & 0xff00);
										is[i_1385_] = (i_1387_ | i_1388_ | i_1389_) >>> 8;
									} else if (i == 3) {
										int i_1390_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]) & 0xff)]);
										int i_1391_ = anInt10928;
										int i_1392_ = i_1390_ + i_1391_;
										int i_1393_ = ((i_1390_ & 0xff00ff) + (i_1391_ & 0xff00ff));
										int i_1394_ = ((i_1393_ & 0x1000100) + (i_1392_ - i_1393_ & 0x10000));
										is[i_1385_] = (i_1392_ - i_1394_ | i_1394_ - (i_1394_ >>> 8));
									} else if (i == 2) {
										int i_1395_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]) & 0xff)]);
										int i_1396_ = (((i_1395_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1397_ = ((i_1395_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1385_] = ((i_1396_ | i_1397_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 1) {
									if (i == 1) {
										int i_1398_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1398_ != 0)
											is[i_1385_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1398_ & 0xff]);
									} else if (i == 0) {
										int i_1399_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1399_ != 0) {
											int i_1400_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1399_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_1401_ = anInt10928 >>> 24;
												int i_1402_ = 256 - i_1401_;
												int i_1403_ = is[i_1385_];
												is[i_1385_] = (((((i_1400_ & 0xff00ff) * i_1401_) + ((i_1403_ & 0xff00ff) * i_1402_)) & ~0xff00ff) + ((((i_1400_ & 0xff00) * i_1401_) + ((i_1403_ & 0xff00) * i_1402_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_1404_ = (((i_1400_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1405_ = (((i_1400_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1406_ = (((i_1400_ & 0xff) * anInt10960) & 0xff00);
												i_1400_ = (i_1404_ | i_1405_ | i_1406_) >>> 8;
												int i_1407_ = is[i_1385_];
												is[i_1385_] = (((((i_1400_ & 0xff00ff) * anInt10934) + ((i_1407_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1400_ & 0xff00) * anInt10934) + ((i_1407_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_1408_ = (((i_1400_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1409_ = (((i_1400_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1410_ = (((i_1400_ & 0xff) * anInt10960) & 0xff00);
												is[i_1385_] = (i_1408_ | i_1409_ | i_1410_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1411_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										int i_1412_ = (i_1411_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1411_]) : 0);
										int i_1413_ = anInt10928;
										int i_1414_ = i_1412_ + i_1413_;
										int i_1415_ = ((i_1412_ & 0xff00ff) + (i_1413_ & 0xff00ff));
										int i_1416_ = ((i_1415_ & 0x1000100) + (i_1414_ - i_1415_ & 0x10000));
										i_1416_ = (i_1414_ - i_1416_ | i_1416_ - (i_1416_ >>> 8));
										if (i_1412_ == 0 && anInt10934 != 255) {
											i_1412_ = i_1416_;
											i_1416_ = is[i_1385_];
											i_1416_ = (((((i_1412_ & 0xff00ff) * anInt10934) + ((i_1416_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1412_ & 0xff00) * anInt10934) + ((i_1416_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1385_] = i_1416_;
									} else if (i == 2) {
										int i_1417_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1417_ != 0) {
											int i_1418_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1417_ & 0xff]);
											int i_1419_ = (((i_1418_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1420_ = (((i_1418_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_1385_++] = (((i_1419_ | i_1420_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 2) {
									if (i == 1) {
										int i_1421_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1421_ != 0) {
											int i_1422_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1421_ & 0xff]);
											int i_1423_ = is[i_1385_];
											int i_1424_ = i_1422_ + i_1423_;
											int i_1425_ = ((i_1422_ & 0xff00ff) + (i_1423_ & 0xff00ff));
											i_1423_ = ((i_1425_ & 0x1000100) + (i_1424_ - i_1425_ & 0x10000));
											is[i_1385_] = (i_1424_ - i_1423_ | i_1423_ - (i_1423_ >>> 8));
										}
									} else if (i == 0) {
										int i_1426_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1426_ != 0) {
											int i_1427_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1426_ & 0xff]);
											int i_1428_ = (((i_1427_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1429_ = (((i_1427_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1430_ = (((i_1427_ & 0xff) * anInt10960) & 0xff00);
											i_1427_ = (i_1428_ | i_1429_ | i_1430_) >>> 8;
											int i_1431_ = is[i_1385_];
											int i_1432_ = i_1427_ + i_1431_;
											int i_1433_ = ((i_1427_ & 0xff00ff) + (i_1431_ & 0xff00ff));
											i_1431_ = ((i_1433_ & 0x1000100) + (i_1432_ - i_1433_ & 0x10000));
											is[i_1385_] = (i_1432_ - i_1431_ | i_1431_ - (i_1431_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1434_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										int i_1435_ = (i_1434_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1434_]) : 0);
										int i_1436_ = anInt10928;
										int i_1437_ = i_1435_ + i_1436_;
										int i_1438_ = ((i_1435_ & 0xff00ff) + (i_1436_ & 0xff00ff));
										int i_1439_ = ((i_1438_ & 0x1000100) + (i_1437_ - i_1438_ & 0x10000));
										i_1439_ = (i_1437_ - i_1439_ | i_1439_ - (i_1439_ >>> 8));
										if (i_1435_ == 0 && anInt10934 != 255) {
											i_1435_ = i_1439_;
											i_1439_ = is[i_1385_];
											i_1439_ = (((((i_1435_ & 0xff00ff) * anInt10934) + ((i_1439_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1435_ & 0xff00) * anInt10934) + ((i_1439_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1385_] = i_1439_;
									} else if (i == 2) {
										int i_1440_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1384_]);
										if (i_1440_ != 0) {
											int i_1441_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1440_ & 0xff]);
											int i_1442_ = (((i_1441_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1443_ = (((i_1441_ & 0xff00) * anInt10934) & 0xff0000);
											i_1441_ = ((i_1442_ | i_1443_) >>> 8) + anInt10963;
											int i_1444_ = is[i_1385_];
											int i_1445_ = i_1441_ + i_1444_;
											int i_1446_ = ((i_1441_ & 0xff00ff) + (i_1444_ & 0xff00ff));
											i_1444_ = ((i_1446_ & 0x1000100) + (i_1445_ - i_1446_ & 0x10000));
											is[i_1385_] = (i_1445_ - i_1444_ | i_1444_ - (i_1444_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1380_ += anInt10946;
							}
						}
						i_1377_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_1447_ = anInt10940;
					while (i_1447_ < 0) {
						int i_1448_ = anInt10944;
						int i_1449_ = anInt10951 + anInt10953;
						int i_1450_ = anInt10952;
						int i_1451_ = anInt10958;
						if (i_1450_ >= 0 && (i_1450_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							int i_1452_;
							if ((i_1452_ = (i_1449_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_1452_ = (anInt10956 - i_1452_) / anInt10956;
								i_1451_ += i_1452_;
								i_1449_ += anInt10956 * i_1452_;
								i_1448_ += i_1452_;
							}
							if ((i_1452_ = (i_1449_ - anInt10956) / anInt10956) > i_1451_)
								i_1451_ = i_1452_;
							for (/**/; i_1451_ < 0; i_1451_++) {
								int i_1453_ = ((i_1450_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_1449_ >> 12));
								int i_1454_ = i_1448_++;
								if (i_1239_ == 0) {
									if (i == 1)
										is[i_1454_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]) & 0xff)]);
									else if (i == 0) {
										int i_1455_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]) & 0xff)]);
										int i_1456_ = (((i_1455_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1457_ = ((i_1455_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1458_ = ((i_1455_ & 0xff) * anInt10960 & 0xff00);
										is[i_1454_] = (i_1456_ | i_1457_ | i_1458_) >>> 8;
									} else if (i == 3) {
										int i_1459_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]) & 0xff)]);
										int i_1460_ = anInt10928;
										int i_1461_ = i_1459_ + i_1460_;
										int i_1462_ = ((i_1459_ & 0xff00ff) + (i_1460_ & 0xff00ff));
										int i_1463_ = ((i_1462_ & 0x1000100) + (i_1461_ - i_1462_ & 0x10000));
										is[i_1454_] = (i_1461_ - i_1463_ | i_1463_ - (i_1463_ >>> 8));
									} else if (i == 2) {
										int i_1464_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]) & 0xff)]);
										int i_1465_ = (((i_1464_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1466_ = ((i_1464_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1454_] = ((i_1465_ | i_1466_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 1) {
									if (i == 1) {
										int i_1467_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1467_ != 0)
											is[i_1454_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1467_ & 0xff]);
									} else if (i == 0) {
										int i_1468_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1468_ != 0) {
											int i_1469_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1468_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_1470_ = anInt10928 >>> 24;
												int i_1471_ = 256 - i_1470_;
												int i_1472_ = is[i_1454_];
												is[i_1454_] = (((((i_1469_ & 0xff00ff) * i_1470_) + ((i_1472_ & 0xff00ff) * i_1471_)) & ~0xff00ff) + ((((i_1469_ & 0xff00) * i_1470_) + ((i_1472_ & 0xff00) * i_1471_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_1473_ = (((i_1469_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1474_ = (((i_1469_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1475_ = (((i_1469_ & 0xff) * anInt10960) & 0xff00);
												i_1469_ = (i_1473_ | i_1474_ | i_1475_) >>> 8;
												int i_1476_ = is[i_1454_];
												is[i_1454_] = (((((i_1469_ & 0xff00ff) * anInt10934) + ((i_1476_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1469_ & 0xff00) * anInt10934) + ((i_1476_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_1477_ = (((i_1469_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_1478_ = (((i_1469_ & 0xff00) * anInt10959) & 0xff0000);
												int i_1479_ = (((i_1469_ & 0xff) * anInt10960) & 0xff00);
												is[i_1454_] = (i_1477_ | i_1478_ | i_1479_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1480_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										int i_1481_ = (i_1480_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1480_]) : 0);
										int i_1482_ = anInt10928;
										int i_1483_ = i_1481_ + i_1482_;
										int i_1484_ = ((i_1481_ & 0xff00ff) + (i_1482_ & 0xff00ff));
										int i_1485_ = ((i_1484_ & 0x1000100) + (i_1483_ - i_1484_ & 0x10000));
										i_1485_ = (i_1483_ - i_1485_ | i_1485_ - (i_1485_ >>> 8));
										if (i_1481_ == 0 && anInt10934 != 255) {
											i_1481_ = i_1485_;
											i_1485_ = is[i_1454_];
											i_1485_ = (((((i_1481_ & 0xff00ff) * anInt10934) + ((i_1485_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1481_ & 0xff00) * anInt10934) + ((i_1485_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1454_] = i_1485_;
									} else if (i == 2) {
										int i_1486_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1486_ != 0) {
											int i_1487_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1486_ & 0xff]);
											int i_1488_ = (((i_1487_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1489_ = (((i_1487_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_1454_++] = (((i_1488_ | i_1489_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1239_ == 2) {
									if (i == 1) {
										int i_1490_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1490_ != 0) {
											int i_1491_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1490_ & 0xff]);
											int i_1492_ = is[i_1454_];
											int i_1493_ = i_1491_ + i_1492_;
											int i_1494_ = ((i_1491_ & 0xff00ff) + (i_1492_ & 0xff00ff));
											i_1492_ = ((i_1494_ & 0x1000100) + (i_1493_ - i_1494_ & 0x10000));
											is[i_1454_] = (i_1493_ - i_1492_ | i_1492_ - (i_1492_ >>> 8));
										}
									} else if (i == 0) {
										int i_1495_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1495_ != 0) {
											int i_1496_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1495_ & 0xff]);
											int i_1497_ = (((i_1496_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1498_ = (((i_1496_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1499_ = (((i_1496_ & 0xff) * anInt10960) & 0xff00);
											i_1496_ = (i_1497_ | i_1498_ | i_1499_) >>> 8;
											int i_1500_ = is[i_1454_];
											int i_1501_ = i_1496_ + i_1500_;
											int i_1502_ = ((i_1496_ & 0xff00ff) + (i_1500_ & 0xff00ff));
											i_1500_ = ((i_1502_ & 0x1000100) + (i_1501_ - i_1502_ & 0x10000));
											is[i_1454_] = (i_1501_ - i_1500_ | i_1500_ - (i_1500_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1503_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										int i_1504_ = (i_1503_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1503_]) : 0);
										int i_1505_ = anInt10928;
										int i_1506_ = i_1504_ + i_1505_;
										int i_1507_ = ((i_1504_ & 0xff00ff) + (i_1505_ & 0xff00ff));
										int i_1508_ = ((i_1507_ & 0x1000100) + (i_1506_ - i_1507_ & 0x10000));
										i_1508_ = (i_1506_ - i_1508_ | i_1508_ - (i_1508_ >>> 8));
										if (i_1504_ == 0 && anInt10934 != 255) {
											i_1504_ = i_1508_;
											i_1508_ = is[i_1454_];
											i_1508_ = (((((i_1504_ & 0xff00ff) * anInt10934) + ((i_1508_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1504_ & 0xff00) * anInt10934) + ((i_1508_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_1454_] = i_1508_;
									} else if (i == 2) {
										int i_1509_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1453_]);
										if (i_1509_ != 0) {
											int i_1510_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1509_ & 0xff]);
											int i_1511_ = (((i_1510_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_1512_ = (((i_1510_ & 0xff00) * anInt10934) & 0xff0000);
											i_1510_ = ((i_1511_ | i_1512_) >>> 8) + anInt10963;
											int i_1513_ = is[i_1454_];
											int i_1514_ = i_1510_ + i_1513_;
											int i_1515_ = ((i_1510_ & 0xff00ff) + (i_1513_ & 0xff00ff));
											i_1513_ = ((i_1515_ & 0x1000100) + (i_1514_ - i_1515_ & 0x10000));
											is[i_1454_] = (i_1514_ - i_1513_ | i_1513_ - (i_1513_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1449_ += anInt10956;
							}
						}
						i_1447_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_1516_ = anInt10940;
					while (i_1516_ < 0) {
						int i_1517_ = anInt10944;
						int i_1518_ = anInt10951 + anInt10953;
						int i_1519_ = anInt10952 + anInt10954;
						int i_1520_ = anInt10958;
						int i_1521_;
						if ((i_1521_ = i_1518_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_1521_ = (anInt10956 - i_1521_) / anInt10956;
							i_1520_ += i_1521_;
							i_1518_ += anInt10956 * i_1521_;
							i_1519_ += anInt10946 * i_1521_;
							i_1517_ += i_1521_;
						}
						if ((i_1521_ = (i_1518_ - anInt10956) / anInt10956) > i_1520_)
							i_1520_ = i_1521_;
						if ((i_1521_ = i_1519_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_1521_ = (anInt10946 - i_1521_) / anInt10946;
							i_1520_ += i_1521_;
							i_1518_ += anInt10956 * i_1521_;
							i_1519_ += anInt10946 * i_1521_;
							i_1517_ += i_1521_;
						}
						if ((i_1521_ = (i_1519_ - anInt10946) / anInt10946) > i_1520_)
							i_1520_ = i_1521_;
						for (/**/; i_1520_ < 0; i_1520_++) {
							int i_1522_ = (((i_1519_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1518_ >> 12));
							int i_1523_ = i_1517_++;
							if (i_1239_ == 0) {
								if (i == 1)
									is[i_1523_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]) & 0xff)]);
								else if (i == 0) {
									int i_1524_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]) & 0xff)]);
									int i_1525_ = ((i_1524_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1526_ = ((i_1524_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1527_ = ((i_1524_ & 0xff) * anInt10960 & 0xff00);
									is[i_1523_] = (i_1525_ | i_1526_ | i_1527_) >>> 8;
								} else if (i == 3) {
									int i_1528_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]) & 0xff)]);
									int i_1529_ = anInt10928;
									int i_1530_ = i_1528_ + i_1529_;
									int i_1531_ = ((i_1528_ & 0xff00ff) + (i_1529_ & 0xff00ff));
									int i_1532_ = ((i_1531_ & 0x1000100) + (i_1530_ - i_1531_ & 0x10000));
									is[i_1523_] = (i_1530_ - i_1532_ | i_1532_ - (i_1532_ >>> 8));
								} else if (i == 2) {
									int i_1533_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]) & 0xff)]);
									int i_1534_ = ((i_1533_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1535_ = ((i_1533_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1523_] = (((i_1534_ | i_1535_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 1) {
								if (i == 1) {
									int i_1536_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1536_ != 0)
										is[i_1523_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1536_ & 0xff]);
								} else if (i == 0) {
									int i_1537_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1537_ != 0) {
										int i_1538_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1537_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_1539_ = anInt10928 >>> 24;
											int i_1540_ = 256 - i_1539_;
											int i_1541_ = is[i_1523_];
											is[i_1523_] = (((((i_1538_ & 0xff00ff) * i_1539_) + ((i_1541_ & 0xff00ff) * i_1540_)) & ~0xff00ff) + ((((i_1538_ & 0xff00) * i_1539_) + ((i_1541_ & 0xff00) * i_1540_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_1542_ = (((i_1538_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1543_ = (((i_1538_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1544_ = (((i_1538_ & 0xff) * anInt10960) & 0xff00);
											i_1538_ = (i_1542_ | i_1543_ | i_1544_) >>> 8;
											int i_1545_ = is[i_1523_];
											is[i_1523_] = (((((i_1538_ & 0xff00ff) * anInt10934) + ((i_1545_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1538_ & 0xff00) * anInt10934) + ((i_1545_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_1546_ = (((i_1538_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1547_ = (((i_1538_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1548_ = (((i_1538_ & 0xff) * anInt10960) & 0xff00);
											is[i_1523_] = (i_1546_ | i_1547_ | i_1548_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1549_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									int i_1550_ = (i_1549_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1549_]) : 0);
									int i_1551_ = anInt10928;
									int i_1552_ = i_1550_ + i_1551_;
									int i_1553_ = ((i_1550_ & 0xff00ff) + (i_1551_ & 0xff00ff));
									int i_1554_ = ((i_1553_ & 0x1000100) + (i_1552_ - i_1553_ & 0x10000));
									i_1554_ = (i_1552_ - i_1554_ | i_1554_ - (i_1554_ >>> 8));
									if (i_1550_ == 0 && anInt10934 != 255) {
										i_1550_ = i_1554_;
										i_1554_ = is[i_1523_];
										i_1554_ = (((((i_1550_ & 0xff00ff) * anInt10934) + ((i_1554_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1550_ & 0xff00) * anInt10934) + ((i_1554_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1523_] = i_1554_;
								} else if (i == 2) {
									int i_1555_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1555_ != 0) {
										int i_1556_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1555_ & 0xff]);
										int i_1557_ = (((i_1556_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1558_ = ((i_1556_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1523_++] = ((i_1557_ | i_1558_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 2) {
								if (i == 1) {
									int i_1559_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1559_ != 0) {
										int i_1560_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1559_ & 0xff]);
										int i_1561_ = is[i_1523_];
										int i_1562_ = i_1560_ + i_1561_;
										int i_1563_ = ((i_1560_ & 0xff00ff) + (i_1561_ & 0xff00ff));
										i_1561_ = ((i_1563_ & 0x1000100) + (i_1562_ - i_1563_ & 0x10000));
										is[i_1523_] = (i_1562_ - i_1561_ | i_1561_ - (i_1561_ >>> 8));
									}
								} else if (i == 0) {
									int i_1564_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1564_ != 0) {
										int i_1565_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1564_ & 0xff]);
										int i_1566_ = (((i_1565_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1567_ = ((i_1565_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1568_ = ((i_1565_ & 0xff) * anInt10960 & 0xff00);
										i_1565_ = (i_1566_ | i_1567_ | i_1568_) >>> 8;
										int i_1569_ = is[i_1523_];
										int i_1570_ = i_1565_ + i_1569_;
										int i_1571_ = ((i_1565_ & 0xff00ff) + (i_1569_ & 0xff00ff));
										i_1569_ = ((i_1571_ & 0x1000100) + (i_1570_ - i_1571_ & 0x10000));
										is[i_1523_] = (i_1570_ - i_1569_ | i_1569_ - (i_1569_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1572_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									int i_1573_ = (i_1572_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1572_]) : 0);
									int i_1574_ = anInt10928;
									int i_1575_ = i_1573_ + i_1574_;
									int i_1576_ = ((i_1573_ & 0xff00ff) + (i_1574_ & 0xff00ff));
									int i_1577_ = ((i_1576_ & 0x1000100) + (i_1575_ - i_1576_ & 0x10000));
									i_1577_ = (i_1575_ - i_1577_ | i_1577_ - (i_1577_ >>> 8));
									if (i_1573_ == 0 && anInt10934 != 255) {
										i_1573_ = i_1577_;
										i_1577_ = is[i_1523_];
										i_1577_ = (((((i_1573_ & 0xff00ff) * anInt10934) + ((i_1577_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1573_ & 0xff00) * anInt10934) + ((i_1577_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1523_] = i_1577_;
								} else if (i == 2) {
									int i_1578_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1522_]);
									if (i_1578_ != 0) {
										int i_1579_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1578_ & 0xff]);
										int i_1580_ = (((i_1579_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1581_ = ((i_1579_ & 0xff00) * anInt10934 & 0xff0000);
										i_1579_ = (((i_1580_ | i_1581_) >>> 8) + anInt10963);
										int i_1582_ = is[i_1523_];
										int i_1583_ = i_1579_ + i_1582_;
										int i_1584_ = ((i_1579_ & 0xff00ff) + (i_1582_ & 0xff00ff));
										i_1582_ = ((i_1584_ & 0x1000100) + (i_1583_ - i_1584_ & 0x10000));
										is[i_1523_] = (i_1583_ - i_1582_ | i_1582_ - (i_1582_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1518_ += anInt10956;
							i_1519_ += anInt10946;
						}
						i_1516_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_1585_ = anInt10940;
					while (i_1585_ < 0) {
						int i_1586_ = anInt10944;
						int i_1587_ = anInt10951 + anInt10953;
						int i_1588_ = anInt10952 + anInt10954;
						int i_1589_ = anInt10958;
						int i_1590_;
						if ((i_1590_ = i_1587_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_1590_ = (anInt10956 - i_1590_) / anInt10956;
							i_1589_ += i_1590_;
							i_1587_ += anInt10956 * i_1590_;
							i_1588_ += anInt10946 * i_1590_;
							i_1586_ += i_1590_;
						}
						if ((i_1590_ = (i_1587_ - anInt10956) / anInt10956) > i_1589_)
							i_1589_ = i_1590_;
						if (i_1588_ < 0) {
							i_1590_ = (anInt10946 - 1 - i_1588_) / anInt10946;
							i_1589_ += i_1590_;
							i_1587_ += anInt10956 * i_1590_;
							i_1588_ += anInt10946 * i_1590_;
							i_1586_ += i_1590_;
						}
						if ((i_1590_ = (1 + i_1588_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1589_)
							i_1589_ = i_1590_;
						for (/**/; i_1589_ < 0; i_1589_++) {
							int i_1591_ = (((i_1588_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1587_ >> 12));
							int i_1592_ = i_1586_++;
							if (i_1239_ == 0) {
								if (i == 1)
									is[i_1592_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]) & 0xff)]);
								else if (i == 0) {
									int i_1593_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]) & 0xff)]);
									int i_1594_ = ((i_1593_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1595_ = ((i_1593_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1596_ = ((i_1593_ & 0xff) * anInt10960 & 0xff00);
									is[i_1592_] = (i_1594_ | i_1595_ | i_1596_) >>> 8;
								} else if (i == 3) {
									int i_1597_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]) & 0xff)]);
									int i_1598_ = anInt10928;
									int i_1599_ = i_1597_ + i_1598_;
									int i_1600_ = ((i_1597_ & 0xff00ff) + (i_1598_ & 0xff00ff));
									int i_1601_ = ((i_1600_ & 0x1000100) + (i_1599_ - i_1600_ & 0x10000));
									is[i_1592_] = (i_1599_ - i_1601_ | i_1601_ - (i_1601_ >>> 8));
								} else if (i == 2) {
									int i_1602_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]) & 0xff)]);
									int i_1603_ = ((i_1602_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1604_ = ((i_1602_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1592_] = (((i_1603_ | i_1604_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 1) {
								if (i == 1) {
									int i_1605_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1605_ != 0)
										is[i_1592_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1605_ & 0xff]);
								} else if (i == 0) {
									int i_1606_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1606_ != 0) {
										int i_1607_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1606_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_1608_ = anInt10928 >>> 24;
											int i_1609_ = 256 - i_1608_;
											int i_1610_ = is[i_1592_];
											is[i_1592_] = (((((i_1607_ & 0xff00ff) * i_1608_) + ((i_1610_ & 0xff00ff) * i_1609_)) & ~0xff00ff) + ((((i_1607_ & 0xff00) * i_1608_) + ((i_1610_ & 0xff00) * i_1609_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_1611_ = (((i_1607_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1612_ = (((i_1607_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1613_ = (((i_1607_ & 0xff) * anInt10960) & 0xff00);
											i_1607_ = (i_1611_ | i_1612_ | i_1613_) >>> 8;
											int i_1614_ = is[i_1592_];
											is[i_1592_] = (((((i_1607_ & 0xff00ff) * anInt10934) + ((i_1614_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1607_ & 0xff00) * anInt10934) + ((i_1614_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_1615_ = (((i_1607_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1616_ = (((i_1607_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1617_ = (((i_1607_ & 0xff) * anInt10960) & 0xff00);
											is[i_1592_] = (i_1615_ | i_1616_ | i_1617_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1618_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									int i_1619_ = (i_1618_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1618_]) : 0);
									int i_1620_ = anInt10928;
									int i_1621_ = i_1619_ + i_1620_;
									int i_1622_ = ((i_1619_ & 0xff00ff) + (i_1620_ & 0xff00ff));
									int i_1623_ = ((i_1622_ & 0x1000100) + (i_1621_ - i_1622_ & 0x10000));
									i_1623_ = (i_1621_ - i_1623_ | i_1623_ - (i_1623_ >>> 8));
									if (i_1619_ == 0 && anInt10934 != 255) {
										i_1619_ = i_1623_;
										i_1623_ = is[i_1592_];
										i_1623_ = (((((i_1619_ & 0xff00ff) * anInt10934) + ((i_1623_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1619_ & 0xff00) * anInt10934) + ((i_1623_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1592_] = i_1623_;
								} else if (i == 2) {
									int i_1624_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1624_ != 0) {
										int i_1625_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1624_ & 0xff]);
										int i_1626_ = (((i_1625_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1627_ = ((i_1625_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1592_++] = ((i_1626_ | i_1627_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 2) {
								if (i == 1) {
									int i_1628_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1628_ != 0) {
										int i_1629_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1628_ & 0xff]);
										int i_1630_ = is[i_1592_];
										int i_1631_ = i_1629_ + i_1630_;
										int i_1632_ = ((i_1629_ & 0xff00ff) + (i_1630_ & 0xff00ff));
										i_1630_ = ((i_1632_ & 0x1000100) + (i_1631_ - i_1632_ & 0x10000));
										is[i_1592_] = (i_1631_ - i_1630_ | i_1630_ - (i_1630_ >>> 8));
									}
								} else if (i == 0) {
									int i_1633_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1633_ != 0) {
										int i_1634_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1633_ & 0xff]);
										int i_1635_ = (((i_1634_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1636_ = ((i_1634_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1637_ = ((i_1634_ & 0xff) * anInt10960 & 0xff00);
										i_1634_ = (i_1635_ | i_1636_ | i_1637_) >>> 8;
										int i_1638_ = is[i_1592_];
										int i_1639_ = i_1634_ + i_1638_;
										int i_1640_ = ((i_1634_ & 0xff00ff) + (i_1638_ & 0xff00ff));
										i_1638_ = ((i_1640_ & 0x1000100) + (i_1639_ - i_1640_ & 0x10000));
										is[i_1592_] = (i_1639_ - i_1638_ | i_1638_ - (i_1638_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1641_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									int i_1642_ = (i_1641_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1641_]) : 0);
									int i_1643_ = anInt10928;
									int i_1644_ = i_1642_ + i_1643_;
									int i_1645_ = ((i_1642_ & 0xff00ff) + (i_1643_ & 0xff00ff));
									int i_1646_ = ((i_1645_ & 0x1000100) + (i_1644_ - i_1645_ & 0x10000));
									i_1646_ = (i_1644_ - i_1646_ | i_1646_ - (i_1646_ >>> 8));
									if (i_1642_ == 0 && anInt10934 != 255) {
										i_1642_ = i_1646_;
										i_1646_ = is[i_1592_];
										i_1646_ = (((((i_1642_ & 0xff00ff) * anInt10934) + ((i_1646_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1642_ & 0xff00) * anInt10934) + ((i_1646_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1592_] = i_1646_;
								} else if (i == 2) {
									int i_1647_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1591_]);
									if (i_1647_ != 0) {
										int i_1648_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1647_ & 0xff]);
										int i_1649_ = (((i_1648_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1650_ = ((i_1648_ & 0xff00) * anInt10934 & 0xff0000);
										i_1648_ = (((i_1649_ | i_1650_) >>> 8) + anInt10963);
										int i_1651_ = is[i_1592_];
										int i_1652_ = i_1648_ + i_1651_;
										int i_1653_ = ((i_1648_ & 0xff00ff) + (i_1651_ & 0xff00ff));
										i_1651_ = ((i_1653_ & 0x1000100) + (i_1652_ - i_1653_ & 0x10000));
										is[i_1592_] = (i_1652_ - i_1651_ | i_1651_ - (i_1651_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1587_ += anInt10956;
							i_1588_ += anInt10946;
						}
						i_1585_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_1654_ = anInt10940;
				while (i_1654_ < 0) {
					int i_1655_ = anInt10944;
					int i_1656_ = anInt10951 + anInt10953;
					int i_1657_ = anInt10952;
					int i_1658_ = anInt10958;
					if (i_1657_ >= 0 && i_1657_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
						if (i_1656_ < 0) {
							int i_1659_ = (anInt10956 - 1 - i_1656_) / anInt10956;
							i_1658_ += i_1659_;
							i_1656_ += anInt10956 * i_1659_;
							i_1655_ += i_1659_;
						}
						int i_1660_;
						if ((i_1660_ = (1 + i_1656_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1658_)
							i_1658_ = i_1660_;
						for (/**/; i_1658_ < 0; i_1658_++) {
							int i_1661_ = (((i_1657_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1656_ >> 12));
							int i_1662_ = i_1655_++;
							if (i_1239_ == 0) {
								if (i == 1)
									is[i_1662_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]) & 0xff)]);
								else if (i == 0) {
									int i_1663_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]) & 0xff)]);
									int i_1664_ = ((i_1663_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1665_ = ((i_1663_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1666_ = ((i_1663_ & 0xff) * anInt10960 & 0xff00);
									is[i_1662_] = (i_1664_ | i_1665_ | i_1666_) >>> 8;
								} else if (i == 3) {
									int i_1667_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]) & 0xff)]);
									int i_1668_ = anInt10928;
									int i_1669_ = i_1667_ + i_1668_;
									int i_1670_ = ((i_1667_ & 0xff00ff) + (i_1668_ & 0xff00ff));
									int i_1671_ = ((i_1670_ & 0x1000100) + (i_1669_ - i_1670_ & 0x10000));
									is[i_1662_] = (i_1669_ - i_1671_ | i_1671_ - (i_1671_ >>> 8));
								} else if (i == 2) {
									int i_1672_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]) & 0xff)]);
									int i_1673_ = ((i_1672_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1674_ = ((i_1672_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1662_] = (((i_1673_ | i_1674_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 1) {
								if (i == 1) {
									int i_1675_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1675_ != 0)
										is[i_1662_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1675_ & 0xff]);
								} else if (i == 0) {
									int i_1676_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1676_ != 0) {
										int i_1677_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1676_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_1678_ = anInt10928 >>> 24;
											int i_1679_ = 256 - i_1678_;
											int i_1680_ = is[i_1662_];
											is[i_1662_] = (((((i_1677_ & 0xff00ff) * i_1678_) + ((i_1680_ & 0xff00ff) * i_1679_)) & ~0xff00ff) + ((((i_1677_ & 0xff00) * i_1678_) + ((i_1680_ & 0xff00) * i_1679_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_1681_ = (((i_1677_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1682_ = (((i_1677_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1683_ = (((i_1677_ & 0xff) * anInt10960) & 0xff00);
											i_1677_ = (i_1681_ | i_1682_ | i_1683_) >>> 8;
											int i_1684_ = is[i_1662_];
											is[i_1662_] = (((((i_1677_ & 0xff00ff) * anInt10934) + ((i_1684_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1677_ & 0xff00) * anInt10934) + ((i_1684_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_1685_ = (((i_1677_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_1686_ = (((i_1677_ & 0xff00) * anInt10959) & 0xff0000);
											int i_1687_ = (((i_1677_ & 0xff) * anInt10960) & 0xff00);
											is[i_1662_] = (i_1685_ | i_1686_ | i_1687_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1688_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									int i_1689_ = (i_1688_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1688_]) : 0);
									int i_1690_ = anInt10928;
									int i_1691_ = i_1689_ + i_1690_;
									int i_1692_ = ((i_1689_ & 0xff00ff) + (i_1690_ & 0xff00ff));
									int i_1693_ = ((i_1692_ & 0x1000100) + (i_1691_ - i_1692_ & 0x10000));
									i_1693_ = (i_1691_ - i_1693_ | i_1693_ - (i_1693_ >>> 8));
									if (i_1689_ == 0 && anInt10934 != 255) {
										i_1689_ = i_1693_;
										i_1693_ = is[i_1662_];
										i_1693_ = (((((i_1689_ & 0xff00ff) * anInt10934) + ((i_1693_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1689_ & 0xff00) * anInt10934) + ((i_1693_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1662_] = i_1693_;
								} else if (i == 2) {
									int i_1694_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1694_ != 0) {
										int i_1695_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1694_ & 0xff]);
										int i_1696_ = (((i_1695_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1697_ = ((i_1695_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_1662_++] = ((i_1696_ | i_1697_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1239_ == 2) {
								if (i == 1) {
									int i_1698_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1698_ != 0) {
										int i_1699_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1698_ & 0xff]);
										int i_1700_ = is[i_1662_];
										int i_1701_ = i_1699_ + i_1700_;
										int i_1702_ = ((i_1699_ & 0xff00ff) + (i_1700_ & 0xff00ff));
										i_1700_ = ((i_1702_ & 0x1000100) + (i_1701_ - i_1702_ & 0x10000));
										is[i_1662_] = (i_1701_ - i_1700_ | i_1700_ - (i_1700_ >>> 8));
									}
								} else if (i == 0) {
									int i_1703_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1703_ != 0) {
										int i_1704_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1703_ & 0xff]);
										int i_1705_ = (((i_1704_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1706_ = ((i_1704_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1707_ = ((i_1704_ & 0xff) * anInt10960 & 0xff00);
										i_1704_ = (i_1705_ | i_1706_ | i_1707_) >>> 8;
										int i_1708_ = is[i_1662_];
										int i_1709_ = i_1704_ + i_1708_;
										int i_1710_ = ((i_1704_ & 0xff00ff) + (i_1708_ & 0xff00ff));
										i_1708_ = ((i_1710_ & 0x1000100) + (i_1709_ - i_1710_ & 0x10000));
										is[i_1662_] = (i_1709_ - i_1708_ | i_1708_ - (i_1708_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1711_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									int i_1712_ = (i_1711_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1711_]) : 0);
									int i_1713_ = anInt10928;
									int i_1714_ = i_1712_ + i_1713_;
									int i_1715_ = ((i_1712_ & 0xff00ff) + (i_1713_ & 0xff00ff));
									int i_1716_ = ((i_1715_ & 0x1000100) + (i_1714_ - i_1715_ & 0x10000));
									i_1716_ = (i_1714_ - i_1716_ | i_1716_ - (i_1716_ >>> 8));
									if (i_1712_ == 0 && anInt10934 != 255) {
										i_1712_ = i_1716_;
										i_1716_ = is[i_1662_];
										i_1716_ = (((((i_1712_ & 0xff00ff) * anInt10934) + ((i_1716_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1712_ & 0xff00) * anInt10934) + ((i_1716_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_1662_] = i_1716_;
								} else if (i == 2) {
									int i_1717_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1661_]);
									if (i_1717_ != 0) {
										int i_1718_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1717_ & 0xff]);
										int i_1719_ = (((i_1718_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_1720_ = ((i_1718_ & 0xff00) * anInt10934 & 0xff0000);
										i_1718_ = (((i_1719_ | i_1720_) >>> 8) + anInt10963);
										int i_1721_ = is[i_1662_];
										int i_1722_ = i_1718_ + i_1721_;
										int i_1723_ = ((i_1718_ & 0xff00ff) + (i_1721_ & 0xff00ff));
										i_1721_ = ((i_1723_ & 0x1000100) + (i_1722_ - i_1723_ & 0x10000));
										is[i_1662_] = (i_1722_ - i_1721_ | i_1721_ - (i_1721_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1656_ += anInt10956;
						}
					}
					i_1654_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_1724_ = anInt10940; i_1724_ < 0; i_1724_++) {
					int i_1725_ = anInt10944;
					int i_1726_ = anInt10951 + anInt10953;
					int i_1727_ = anInt10952 + anInt10954;
					int i_1728_ = anInt10958;
					if (i_1726_ < 0) {
						int i_1729_ = (anInt10956 - 1 - i_1726_) / anInt10956;
						i_1728_ += i_1729_;
						i_1726_ += anInt10956 * i_1729_;
						i_1727_ += anInt10946 * i_1729_;
						i_1725_ += i_1729_;
					}
					int i_1730_;
					if ((i_1730_ = (1 + i_1726_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1728_)
						i_1728_ = i_1730_;
					if ((i_1730_ = i_1727_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
						i_1730_ = (anInt10946 - i_1730_) / anInt10946;
						i_1728_ += i_1730_;
						i_1726_ += anInt10956 * i_1730_;
						i_1727_ += anInt10946 * i_1730_;
						i_1725_ += i_1730_;
					}
					if ((i_1730_ = (i_1727_ - anInt10946) / anInt10946) > i_1728_)
						i_1728_ = i_1730_;
					for (/**/; i_1728_ < 0; i_1728_++) {
						int i_1731_ = (((i_1727_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1726_ >> 12));
						int i_1732_ = i_1725_++;
						if (i_1239_ == 0) {
							if (i == 1)
								is[i_1732_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]) & 0xff]);
							else if (i == 0) {
								int i_1733_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]) & 0xff]);
								int i_1734_ = ((i_1733_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_1735_ = ((i_1733_ & 0xff00) * anInt10959 & 0xff0000);
								int i_1736_ = (i_1733_ & 0xff) * anInt10960 & 0xff00;
								is[i_1732_] = (i_1734_ | i_1735_ | i_1736_) >>> 8;
							} else if (i == 3) {
								int i_1737_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]) & 0xff]);
								int i_1738_ = anInt10928;
								int i_1739_ = i_1737_ + i_1738_;
								int i_1740_ = ((i_1737_ & 0xff00ff) + (i_1738_ & 0xff00ff));
								int i_1741_ = ((i_1740_ & 0x1000100) + (i_1739_ - i_1740_ & 0x10000));
								is[i_1732_] = i_1739_ - i_1741_ | i_1741_ - (i_1741_ >>> 8);
							} else if (i == 2) {
								int i_1742_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]) & 0xff]);
								int i_1743_ = ((i_1742_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_1744_ = ((i_1742_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_1732_] = ((i_1743_ | i_1744_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_1239_ == 1) {
							if (i == 1) {
								int i_1745_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1745_ != 0)
									is[i_1732_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1745_ & 0xff]);
							} else if (i == 0) {
								int i_1746_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1746_ != 0) {
									int i_1747_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1746_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_1748_ = anInt10928 >>> 24;
										int i_1749_ = 256 - i_1748_;
										int i_1750_ = is[i_1732_];
										is[i_1732_] = ((((i_1747_ & 0xff00ff) * i_1748_ + ((i_1750_ & 0xff00ff) * i_1749_)) & ~0xff00ff) + (((i_1747_ & 0xff00) * i_1748_ + ((i_1750_ & 0xff00) * i_1749_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_1751_ = (((i_1747_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1752_ = ((i_1747_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1753_ = ((i_1747_ & 0xff) * anInt10960 & 0xff00);
										i_1747_ = (i_1751_ | i_1752_ | i_1753_) >>> 8;
										int i_1754_ = is[i_1732_];
										is[i_1732_] = (((((i_1747_ & 0xff00ff) * anInt10934) + ((i_1754_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1747_ & 0xff00) * anInt10934) + ((i_1754_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_1755_ = (((i_1747_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1756_ = ((i_1747_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1757_ = ((i_1747_ & 0xff) * anInt10960 & 0xff00);
										is[i_1732_] = (i_1755_ | i_1756_ | i_1757_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1758_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								int i_1759_ = (i_1758_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1758_]) : 0);
								int i_1760_ = anInt10928;
								int i_1761_ = i_1759_ + i_1760_;
								int i_1762_ = ((i_1759_ & 0xff00ff) + (i_1760_ & 0xff00ff));
								int i_1763_ = ((i_1762_ & 0x1000100) + (i_1761_ - i_1762_ & 0x10000));
								i_1763_ = i_1761_ - i_1763_ | i_1763_ - (i_1763_ >>> 8);
								if (i_1759_ == 0 && anInt10934 != 255) {
									i_1759_ = i_1763_;
									i_1763_ = is[i_1732_];
									i_1763_ = ((((i_1759_ & 0xff00ff) * anInt10934 + ((i_1763_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1759_ & 0xff00) * anInt10934 + ((i_1763_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1732_] = i_1763_;
							} else if (i == 2) {
								int i_1764_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1764_ != 0) {
									int i_1765_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1764_ & 0xff]);
									int i_1766_ = ((i_1765_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1767_ = ((i_1765_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1732_++] = ((i_1766_ | i_1767_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1239_ == 2) {
							if (i == 1) {
								int i_1768_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1768_ != 0) {
									int i_1769_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1768_ & 0xff]);
									int i_1770_ = is[i_1732_];
									int i_1771_ = i_1769_ + i_1770_;
									int i_1772_ = ((i_1769_ & 0xff00ff) + (i_1770_ & 0xff00ff));
									i_1770_ = ((i_1772_ & 0x1000100) + (i_1771_ - i_1772_ & 0x10000));
									is[i_1732_] = (i_1771_ - i_1770_ | i_1770_ - (i_1770_ >>> 8));
								}
							} else if (i == 0) {
								int i_1773_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1773_ != 0) {
									int i_1774_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1773_ & 0xff]);
									int i_1775_ = ((i_1774_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1776_ = ((i_1774_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1777_ = ((i_1774_ & 0xff) * anInt10960 & 0xff00);
									i_1774_ = (i_1775_ | i_1776_ | i_1777_) >>> 8;
									int i_1778_ = is[i_1732_];
									int i_1779_ = i_1774_ + i_1778_;
									int i_1780_ = ((i_1774_ & 0xff00ff) + (i_1778_ & 0xff00ff));
									i_1778_ = ((i_1780_ & 0x1000100) + (i_1779_ - i_1780_ & 0x10000));
									is[i_1732_] = (i_1779_ - i_1778_ | i_1778_ - (i_1778_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1781_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								int i_1782_ = (i_1781_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1781_]) : 0);
								int i_1783_ = anInt10928;
								int i_1784_ = i_1782_ + i_1783_;
								int i_1785_ = ((i_1782_ & 0xff00ff) + (i_1783_ & 0xff00ff));
								int i_1786_ = ((i_1785_ & 0x1000100) + (i_1784_ - i_1785_ & 0x10000));
								i_1786_ = i_1784_ - i_1786_ | i_1786_ - (i_1786_ >>> 8);
								if (i_1782_ == 0 && anInt10934 != 255) {
									i_1782_ = i_1786_;
									i_1786_ = is[i_1732_];
									i_1786_ = ((((i_1782_ & 0xff00ff) * anInt10934 + ((i_1786_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1782_ & 0xff00) * anInt10934 + ((i_1786_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1732_] = i_1786_;
							} else if (i == 2) {
								int i_1787_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1731_]);
								if (i_1787_ != 0) {
									int i_1788_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1787_ & 0xff]);
									int i_1789_ = ((i_1788_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1790_ = ((i_1788_ & 0xff00) * anInt10934 & 0xff0000);
									i_1788_ = (((i_1789_ | i_1790_) >>> 8) + anInt10963);
									int i_1791_ = is[i_1732_];
									int i_1792_ = i_1788_ + i_1791_;
									int i_1793_ = ((i_1788_ & 0xff00ff) + (i_1791_ & 0xff00ff));
									i_1791_ = ((i_1793_ & 0x1000100) + (i_1792_ - i_1793_ & 0x10000));
									is[i_1732_] = (i_1792_ - i_1791_ | i_1791_ - (i_1791_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1726_ += anInt10956;
						i_1727_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_1794_ = anInt10940; i_1794_ < 0; i_1794_++) {
					int i_1795_ = anInt10944;
					int i_1796_ = anInt10951 + anInt10953;
					int i_1797_ = anInt10952 + anInt10954;
					int i_1798_ = anInt10958;
					if (i_1796_ < 0) {
						int i_1799_ = (anInt10956 - 1 - i_1796_) / anInt10956;
						i_1798_ += i_1799_;
						i_1796_ += anInt10956 * i_1799_;
						i_1797_ += anInt10946 * i_1799_;
						i_1795_ += i_1799_;
					}
					int i_1800_;
					if ((i_1800_ = (1 + i_1796_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_1798_)
						i_1798_ = i_1800_;
					if (i_1797_ < 0) {
						i_1800_ = (anInt10946 - 1 - i_1797_) / anInt10946;
						i_1798_ += i_1800_;
						i_1796_ += anInt10956 * i_1800_;
						i_1797_ += anInt10946 * i_1800_;
						i_1795_ += i_1800_;
					}
					if ((i_1800_ = (1 + i_1797_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_1798_)
						i_1798_ = i_1800_;
					for (/**/; i_1798_ < 0; i_1798_++) {
						int i_1801_ = (((i_1797_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_1796_ >> 12));
						int i_1802_ = i_1795_++;
						if (i_1239_ == 0) {
							if (i == 1)
								is[i_1802_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]) & 0xff]);
							else if (i == 0) {
								int i_1803_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]) & 0xff]);
								int i_1804_ = ((i_1803_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_1805_ = ((i_1803_ & 0xff00) * anInt10959 & 0xff0000);
								int i_1806_ = (i_1803_ & 0xff) * anInt10960 & 0xff00;
								is[i_1802_] = (i_1804_ | i_1805_ | i_1806_) >>> 8;
							} else if (i == 3) {
								int i_1807_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]) & 0xff]);
								int i_1808_ = anInt10928;
								int i_1809_ = i_1807_ + i_1808_;
								int i_1810_ = ((i_1807_ & 0xff00ff) + (i_1808_ & 0xff00ff));
								int i_1811_ = ((i_1810_ & 0x1000100) + (i_1809_ - i_1810_ & 0x10000));
								is[i_1802_] = i_1809_ - i_1811_ | i_1811_ - (i_1811_ >>> 8);
							} else if (i == 2) {
								int i_1812_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]) & 0xff]);
								int i_1813_ = ((i_1812_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_1814_ = ((i_1812_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_1802_] = ((i_1813_ | i_1814_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_1239_ == 1) {
							if (i == 1) {
								int i_1815_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1815_ != 0)
									is[i_1802_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1815_ & 0xff]);
							} else if (i == 0) {
								int i_1816_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1816_ != 0) {
									int i_1817_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1816_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_1818_ = anInt10928 >>> 24;
										int i_1819_ = 256 - i_1818_;
										int i_1820_ = is[i_1802_];
										is[i_1802_] = ((((i_1817_ & 0xff00ff) * i_1818_ + ((i_1820_ & 0xff00ff) * i_1819_)) & ~0xff00ff) + (((i_1817_ & 0xff00) * i_1818_ + ((i_1820_ & 0xff00) * i_1819_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_1821_ = (((i_1817_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1822_ = ((i_1817_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1823_ = ((i_1817_ & 0xff) * anInt10960 & 0xff00);
										i_1817_ = (i_1821_ | i_1822_ | i_1823_) >>> 8;
										int i_1824_ = is[i_1802_];
										is[i_1802_] = (((((i_1817_ & 0xff00ff) * anInt10934) + ((i_1824_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_1817_ & 0xff00) * anInt10934) + ((i_1824_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_1825_ = (((i_1817_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_1826_ = ((i_1817_ & 0xff00) * anInt10959 & 0xff0000);
										int i_1827_ = ((i_1817_ & 0xff) * anInt10960 & 0xff00);
										is[i_1802_] = (i_1825_ | i_1826_ | i_1827_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1828_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								int i_1829_ = (i_1828_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1828_]) : 0);
								int i_1830_ = anInt10928;
								int i_1831_ = i_1829_ + i_1830_;
								int i_1832_ = ((i_1829_ & 0xff00ff) + (i_1830_ & 0xff00ff));
								int i_1833_ = ((i_1832_ & 0x1000100) + (i_1831_ - i_1832_ & 0x10000));
								i_1833_ = i_1831_ - i_1833_ | i_1833_ - (i_1833_ >>> 8);
								if (i_1829_ == 0 && anInt10934 != 255) {
									i_1829_ = i_1833_;
									i_1833_ = is[i_1802_];
									i_1833_ = ((((i_1829_ & 0xff00ff) * anInt10934 + ((i_1833_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1829_ & 0xff00) * anInt10934 + ((i_1833_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1802_] = i_1833_;
							} else if (i == 2) {
								int i_1834_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1834_ != 0) {
									int i_1835_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1834_ & 0xff]);
									int i_1836_ = ((i_1835_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1837_ = ((i_1835_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_1802_++] = ((i_1836_ | i_1837_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1239_ == 2) {
							if (i == 1) {
								int i_1838_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1838_ != 0) {
									int i_1839_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1838_ & 0xff]);
									int i_1840_ = is[i_1802_];
									int i_1841_ = i_1839_ + i_1840_;
									int i_1842_ = ((i_1839_ & 0xff00ff) + (i_1840_ & 0xff00ff));
									i_1840_ = ((i_1842_ & 0x1000100) + (i_1841_ - i_1842_ & 0x10000));
									is[i_1802_] = (i_1841_ - i_1840_ | i_1840_ - (i_1840_ >>> 8));
								}
							} else if (i == 0) {
								int i_1843_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1843_ != 0) {
									int i_1844_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1843_ & 0xff]);
									int i_1845_ = ((i_1844_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_1846_ = ((i_1844_ & 0xff00) * anInt10959 & 0xff0000);
									int i_1847_ = ((i_1844_ & 0xff) * anInt10960 & 0xff00);
									i_1844_ = (i_1845_ | i_1846_ | i_1847_) >>> 8;
									int i_1848_ = is[i_1802_];
									int i_1849_ = i_1844_ + i_1848_;
									int i_1850_ = ((i_1844_ & 0xff00ff) + (i_1848_ & 0xff00ff));
									i_1848_ = ((i_1850_ & 0x1000100) + (i_1849_ - i_1850_ & 0x10000));
									is[i_1802_] = (i_1849_ - i_1848_ | i_1848_ - (i_1848_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1851_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								int i_1852_ = (i_1851_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1851_]) : 0);
								int i_1853_ = anInt10928;
								int i_1854_ = i_1852_ + i_1853_;
								int i_1855_ = ((i_1852_ & 0xff00ff) + (i_1853_ & 0xff00ff));
								int i_1856_ = ((i_1855_ & 0x1000100) + (i_1854_ - i_1855_ & 0x10000));
								i_1856_ = i_1854_ - i_1856_ | i_1856_ - (i_1856_ >>> 8);
								if (i_1852_ == 0 && anInt10934 != 255) {
									i_1852_ = i_1856_;
									i_1856_ = is[i_1802_];
									i_1856_ = ((((i_1852_ & 0xff00ff) * anInt10934 + ((i_1856_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_1852_ & 0xff00) * anInt10934 + ((i_1856_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_1802_] = i_1856_;
							} else if (i == 2) {
								int i_1857_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1801_]);
								if (i_1857_ != 0) {
									int i_1858_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1857_ & 0xff]);
									int i_1859_ = ((i_1858_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_1860_ = ((i_1858_ & 0xff00) * anInt10934 & 0xff0000);
									i_1858_ = (((i_1859_ | i_1860_) >>> 8) + anInt10963);
									int i_1861_ = is[i_1802_];
									int i_1862_ = i_1858_ + i_1861_;
									int i_1863_ = ((i_1858_ & 0xff00ff) + (i_1861_ & 0xff00ff));
									i_1861_ = ((i_1863_ & 0x1000100) + (i_1862_ - i_1863_ & 0x10000));
									is[i_1802_] = (i_1862_ - i_1861_ | i_1861_ - (i_1861_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1796_ += anInt10956;
						i_1797_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public void method2613(int i, int i_1864_, int i_1865_, int i_1866_, int i_1867_, int i_1868_) {
		throw new IllegalStateException();
	}

	public Interface6 method2590() {
		throw new IllegalStateException();
	}

	public void method2611(int i, int i_1869_, int i_1870_, int i_1871_, int[] is, int[] is_1872_, int i_1873_, int i_1874_) {
		throw new IllegalStateException();
	}

	public Interface6 method2616() {
		throw new IllegalStateException();
	}

	public Interface6 method2642() {
		throw new IllegalStateException();
	}

	public void method2617(int i, int i_1875_, int i_1876_, int i_1877_, int i_1878_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_1879_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_1875_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_1880_ = i_1875_ * i_1879_ + i;
			int i_1881_ = 0;
			int i_1882_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_1883_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_1884_ = i_1879_ - i_1883_;
			int i_1885_ = 0;
			if (i_1875_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_1886_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1875_);
				i_1882_ -= i_1886_;
				i_1875_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_1881_ += i_1886_ * i_1883_;
				i_1880_ += i_1886_ * i_1879_;
			}
			if (i_1875_ + i_1882_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_1882_ -= (i_1875_ + i_1882_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_1887_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_1883_ -= i_1887_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_1881_ += i_1887_;
				i_1880_ += i_1887_;
				i_1885_ += i_1887_;
				i_1884_ += i_1887_;
			}
			if (i + i_1883_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_1888_ = (i + i_1883_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_1883_ -= i_1888_;
				i_1885_ += i_1888_;
				i_1884_ += i_1888_;
			}
			if (i_1883_ > 0 && i_1882_ > 0) {
				if (i_1878_ == 0) {
					if (i_1876_ == 1) {
						for (int i_1889_ = -i_1882_; i_1889_ < 0; i_1889_++) {
							int i_1890_ = i_1880_ + i_1883_ - 3;
							while (i_1880_ < i_1890_) {
								is[i_1880_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								is[i_1880_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								is[i_1880_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								is[i_1880_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
							}
							i_1890_ += 3;
							while (i_1880_ < i_1890_)
								is[i_1880_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 0) {
						int i_1891_ = (i_1877_ & 0xff0000) >> 16;
						int i_1892_ = (i_1877_ & 0xff00) >> 8;
						int i_1893_ = i_1877_ & 0xff;
						for (int i_1894_ = -i_1882_; i_1894_ < 0; i_1894_++) {
							for (int i_1895_ = -i_1883_; i_1895_ < 0; i_1895_++) {
								int i_1896_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								int i_1897_ = ((i_1896_ & 0xff0000) * i_1891_ & ~0xffffff);
								int i_1898_ = (i_1896_ & 0xff00) * i_1892_ & 0xff0000;
								int i_1899_ = (i_1896_ & 0xff) * i_1893_ & 0xff00;
								is[i_1880_++] = (i_1897_ | i_1898_ | i_1899_) >>> 8;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 3) {
						for (int i_1900_ = -i_1882_; i_1900_ < 0; i_1900_++) {
							for (int i_1901_ = -i_1883_; i_1901_ < 0; i_1901_++) {
								int i_1902_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								int i_1903_ = i_1902_ + i_1877_;
								int i_1904_ = ((i_1902_ & 0xff00ff) + (i_1877_ & 0xff00ff));
								int i_1905_ = ((i_1904_ & 0x1000100) + (i_1903_ - i_1904_ & 0x10000));
								is[i_1880_++] = i_1903_ - i_1905_ | i_1905_ - (i_1905_ >>> 8);
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 2) {
						int i_1906_ = i_1877_ >>> 24;
						int i_1907_ = 256 - i_1906_;
						int i_1908_ = (i_1877_ & 0xff00ff) * i_1907_ & ~0xff00ff;
						int i_1909_ = (i_1877_ & 0xff00) * i_1907_ & 0xff0000;
						i_1877_ = (i_1908_ | i_1909_) >>> 8;
						for (int i_1910_ = -i_1882_; i_1910_ < 0; i_1910_++) {
							for (int i_1911_ = -i_1883_; i_1911_ < 0; i_1911_++) {
								int i_1912_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]) & 0xff]);
								i_1908_ = ((i_1912_ & 0xff00ff) * i_1906_ & ~0xff00ff);
								i_1909_ = (i_1912_ & 0xff00) * i_1906_ & 0xff0000;
								is[i_1880_++] = ((i_1908_ | i_1909_) >>> 8) + i_1877_;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1878_ == 1) {
					if (i_1876_ == 1) {
						for (int i_1913_ = -i_1882_; i_1913_ < 0; i_1913_++) {
							for (int i_1914_ = -i_1883_; i_1914_ < 0; i_1914_++) {
								int i_1915_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								if (i_1915_ != 0) {
									int i_1916_ = ((((Class161_Sub3_Sub1) this).anIntArray11151[i_1915_ & 0xff]) | ~0xffffff);
									int i_1917_ = 255;
									int i_1918_ = 0;
									int i_1919_ = is[i_1880_];
									is[i_1880_++] = (((((i_1916_ & 0xff00ff) * i_1917_ + (i_1919_ & 0xff00ff) * i_1918_) & ~0xff00ff) >> 8) + (((((i_1916_ & ~0xff00ff) >>> 8) * i_1917_) + (((i_1919_ & ~0xff00ff) >>> 8) * i_1918_)) & ~0xff00ff));
								} else
									i_1880_++;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 0) {
						if ((i_1877_ & 0xffffff) == 16777215) {
							int i_1920_ = i_1877_ >>> 24;
							int i_1921_ = 256 - i_1920_;
							for (int i_1922_ = -i_1882_; i_1922_ < 0; i_1922_++) {
								for (int i_1923_ = -i_1883_; i_1923_ < 0; i_1923_++) {
									int i_1924_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
									if (i_1924_ != 0) {
										int i_1925_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1924_ & 0xff]);
										int i_1926_ = is[i_1880_];
										is[i_1880_++] = ((((i_1925_ & 0xff00ff) * i_1920_ + ((i_1926_ & 0xff00ff) * i_1921_)) & ~0xff00ff) + (((i_1925_ & 0xff00) * i_1920_ + ((i_1926_ & 0xff00) * i_1921_)) & 0xff0000)) >> 8;
									} else
										i_1880_++;
								}
								i_1880_ += i_1884_;
								i_1881_ += i_1885_;
							}
						} else {
							int i_1927_ = (i_1877_ & 0xff0000) >> 16;
							int i_1928_ = (i_1877_ & 0xff00) >> 8;
							int i_1929_ = i_1877_ & 0xff;
							int i_1930_ = i_1877_ >>> 24;
							int i_1931_ = 256 - i_1930_;
							for (int i_1932_ = -i_1882_; i_1932_ < 0; i_1932_++) {
								for (int i_1933_ = -i_1883_; i_1933_ < 0; i_1933_++) {
									int i_1934_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
									if (i_1934_ != 0) {
										int i_1935_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1934_ & 0xff]);
										if (i_1930_ != 255) {
											int i_1936_ = (((i_1935_ & 0xff0000) * i_1927_) & ~0xffffff);
											int i_1937_ = ((i_1935_ & 0xff00) * i_1928_ & 0xff0000);
											int i_1938_ = ((i_1935_ & 0xff) * i_1929_ & 0xff00);
											i_1935_ = (i_1936_ | i_1937_ | i_1938_) >>> 8;
											int i_1939_ = is[i_1880_];
											is[i_1880_++] = (((((i_1935_ & 0xff00ff) * i_1930_) + ((i_1939_ & 0xff00ff) * i_1931_)) & ~0xff00ff) + ((((i_1935_ & 0xff00) * i_1930_) + ((i_1939_ & 0xff00) * i_1931_)) & 0xff0000)) >> 8;
										} else {
											int i_1940_ = (((i_1935_ & 0xff0000) * i_1927_) & ~0xffffff);
											int i_1941_ = ((i_1935_ & 0xff00) * i_1928_ & 0xff0000);
											int i_1942_ = ((i_1935_ & 0xff) * i_1929_ & 0xff00);
											is[i_1880_++] = (i_1940_ | i_1941_ | i_1942_) >>> 8;
										}
									} else
										i_1880_++;
								}
								i_1880_ += i_1884_;
								i_1881_ += i_1885_;
							}
						}
					} else if (i_1876_ == 3) {
						int i_1943_ = i_1877_ >>> 24;
						int i_1944_ = 256 - i_1943_;
						for (int i_1945_ = -i_1882_; i_1945_ < 0; i_1945_++) {
							for (int i_1946_ = -i_1883_; i_1946_ < 0; i_1946_++) {
								byte i_1947_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								int i_1948_ = (i_1947_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1947_]) : 0);
								int i_1949_ = i_1948_ + i_1877_;
								int i_1950_ = ((i_1948_ & 0xff00ff) + (i_1877_ & 0xff00ff));
								int i_1951_ = ((i_1950_ & 0x1000100) + (i_1949_ - i_1950_ & 0x10000));
								i_1951_ = i_1949_ - i_1951_ | i_1951_ - (i_1951_ >>> 8);
								if (i_1948_ == 0 && i_1943_ != 255) {
									i_1948_ = i_1951_;
									i_1951_ = is[i_1880_];
									i_1951_ = ((((i_1948_ & 0xff00ff) * i_1943_ + (i_1951_ & 0xff00ff) * i_1944_) & ~0xff00ff) + (((i_1948_ & 0xff00) * i_1943_ + (i_1951_ & 0xff00) * i_1944_) & 0xff0000)) >> 8;
								}
								is[i_1880_++] = i_1951_;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 2) {
						int i_1952_ = i_1877_ >>> 24;
						int i_1953_ = 256 - i_1952_;
						int i_1954_ = (i_1877_ & 0xff00ff) * i_1953_ & ~0xff00ff;
						int i_1955_ = (i_1877_ & 0xff00) * i_1953_ & 0xff0000;
						i_1877_ = (i_1954_ | i_1955_) >>> 8;
						for (int i_1956_ = -i_1882_; i_1956_ < 0; i_1956_++) {
							for (int i_1957_ = -i_1883_; i_1957_ < 0; i_1957_++) {
								int i_1958_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								if (i_1958_ != 0) {
									int i_1959_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1958_ & 0xff]);
									i_1954_ = ((i_1959_ & 0xff00ff) * i_1952_ & ~0xff00ff);
									i_1955_ = ((i_1959_ & 0xff00) * i_1952_ & 0xff0000);
									is[i_1880_++] = ((i_1954_ | i_1955_) >>> 8) + i_1877_;
								} else
									i_1880_++;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1878_ == 2) {
					if (i_1876_ == 1) {
						for (int i_1960_ = -i_1882_; i_1960_ < 0; i_1960_++) {
							for (int i_1961_ = -i_1883_; i_1961_ < 0; i_1961_++) {
								int i_1962_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								if (i_1962_ != 0) {
									int i_1963_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1962_ & 0xff]);
									int i_1964_ = is[i_1880_];
									int i_1965_ = i_1963_ + i_1964_;
									int i_1966_ = ((i_1963_ & 0xff00ff) + (i_1964_ & 0xff00ff));
									i_1964_ = ((i_1966_ & 0x1000100) + (i_1965_ - i_1966_ & 0x10000));
									is[i_1880_++] = (i_1965_ - i_1964_ | i_1964_ - (i_1964_ >>> 8));
								} else
									i_1880_++;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 0) {
						int i_1967_ = (i_1877_ & 0xff0000) >> 16;
						int i_1968_ = (i_1877_ & 0xff00) >> 8;
						int i_1969_ = i_1877_ & 0xff;
						for (int i_1970_ = -i_1882_; i_1970_ < 0; i_1970_++) {
							for (int i_1971_ = -i_1883_; i_1971_ < 0; i_1971_++) {
								int i_1972_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								if (i_1972_ != 0) {
									int i_1973_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1972_ & 0xff]);
									int i_1974_ = ((i_1973_ & 0xff0000) * i_1967_ & ~0xffffff);
									int i_1975_ = ((i_1973_ & 0xff00) * i_1968_ & 0xff0000);
									int i_1976_ = (i_1973_ & 0xff) * i_1969_ & 0xff00;
									i_1973_ = (i_1974_ | i_1975_ | i_1976_) >>> 8;
									int i_1977_ = is[i_1880_];
									int i_1978_ = i_1973_ + i_1977_;
									int i_1979_ = ((i_1973_ & 0xff00ff) + (i_1977_ & 0xff00ff));
									i_1977_ = ((i_1979_ & 0x1000100) + (i_1978_ - i_1979_ & 0x10000));
									is[i_1880_++] = (i_1978_ - i_1977_ | i_1977_ - (i_1977_ >>> 8));
								} else
									i_1880_++;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 3) {
						for (int i_1980_ = -i_1882_; i_1980_ < 0; i_1980_++) {
							for (int i_1981_ = -i_1883_; i_1981_ < 0; i_1981_++) {
								byte i_1982_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								int i_1983_ = (i_1982_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_1982_]) : 0);
								int i_1984_ = i_1983_ + i_1877_;
								int i_1985_ = ((i_1983_ & 0xff00ff) + (i_1877_ & 0xff00ff));
								int i_1986_ = ((i_1985_ & 0x1000100) + (i_1984_ - i_1985_ & 0x10000));
								i_1983_ = i_1984_ - i_1986_ | i_1986_ - (i_1986_ >>> 8);
								i_1986_ = is[i_1880_];
								i_1984_ = i_1983_ + i_1986_;
								i_1985_ = (i_1983_ & 0xff00ff) + (i_1986_ & 0xff00ff);
								i_1986_ = ((i_1985_ & 0x1000100) + (i_1984_ - i_1985_ & 0x10000));
								is[i_1880_++] = i_1984_ - i_1986_ | i_1986_ - (i_1986_ >>> 8);
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else if (i_1876_ == 2) {
						int i_1987_ = i_1877_ >>> 24;
						int i_1988_ = 256 - i_1987_;
						int i_1989_ = (i_1877_ & 0xff00ff) * i_1988_ & ~0xff00ff;
						int i_1990_ = (i_1877_ & 0xff00) * i_1988_ & 0xff0000;
						i_1877_ = (i_1989_ | i_1990_) >>> 8;
						for (int i_1991_ = -i_1882_; i_1991_ < 0; i_1991_++) {
							for (int i_1992_ = -i_1883_; i_1992_ < 0; i_1992_++) {
								int i_1993_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_1881_++]);
								if (i_1993_ != 0) {
									int i_1994_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_1993_ & 0xff]);
									i_1989_ = ((i_1994_ & 0xff00ff) * i_1987_ & ~0xff00ff);
									i_1990_ = ((i_1994_ & 0xff00) * i_1987_ & 0xff0000);
									i_1994_ = (((i_1989_ | i_1990_) >>> 8) + i_1877_);
									int i_1995_ = is[i_1880_];
									int i_1996_ = i_1994_ + i_1995_;
									int i_1997_ = ((i_1994_ & 0xff00ff) + (i_1995_ & 0xff00ff));
									i_1995_ = ((i_1997_ & 0x1000100) + (i_1996_ - i_1997_ & 0x10000));
									is[i_1880_++] = (i_1996_ - i_1995_ | i_1995_ - (i_1995_ >>> 8));
								} else
									i_1880_++;
							}
							i_1880_ += i_1884_;
							i_1881_ += i_1885_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2618(int i, int i_1998_, int i_1999_, int i_2000_, int i_2001_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_2002_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_1998_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_2003_ = i_1998_ * i_2002_ + i;
			int i_2004_ = 0;
			int i_2005_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_2006_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_2007_ = i_2002_ - i_2006_;
			int i_2008_ = 0;
			if (i_1998_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2009_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_1998_);
				i_2005_ -= i_2009_;
				i_1998_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_2004_ += i_2009_ * i_2006_;
				i_2003_ += i_2009_ * i_2002_;
			}
			if (i_1998_ + i_2005_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2005_ -= (i_1998_ + i_2005_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2010_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2006_ -= i_2010_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_2004_ += i_2010_;
				i_2003_ += i_2010_;
				i_2008_ += i_2010_;
				i_2007_ += i_2010_;
			}
			if (i + i_2006_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2011_ = (i + i_2006_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2006_ -= i_2011_;
				i_2008_ += i_2011_;
				i_2007_ += i_2011_;
			}
			if (i_2006_ > 0 && i_2005_ > 0) {
				if (i_2001_ == 0) {
					if (i_1999_ == 1) {
						for (int i_2012_ = -i_2005_; i_2012_ < 0; i_2012_++) {
							int i_2013_ = i_2003_ + i_2006_ - 3;
							while (i_2003_ < i_2013_) {
								is[i_2003_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								is[i_2003_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								is[i_2003_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								is[i_2003_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
							}
							i_2013_ += 3;
							while (i_2003_ < i_2013_)
								is[i_2003_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 0) {
						int i_2014_ = (i_2000_ & 0xff0000) >> 16;
						int i_2015_ = (i_2000_ & 0xff00) >> 8;
						int i_2016_ = i_2000_ & 0xff;
						for (int i_2017_ = -i_2005_; i_2017_ < 0; i_2017_++) {
							for (int i_2018_ = -i_2006_; i_2018_ < 0; i_2018_++) {
								int i_2019_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								int i_2020_ = ((i_2019_ & 0xff0000) * i_2014_ & ~0xffffff);
								int i_2021_ = (i_2019_ & 0xff00) * i_2015_ & 0xff0000;
								int i_2022_ = (i_2019_ & 0xff) * i_2016_ & 0xff00;
								is[i_2003_++] = (i_2020_ | i_2021_ | i_2022_) >>> 8;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 3) {
						for (int i_2023_ = -i_2005_; i_2023_ < 0; i_2023_++) {
							for (int i_2024_ = -i_2006_; i_2024_ < 0; i_2024_++) {
								int i_2025_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								int i_2026_ = i_2025_ + i_2000_;
								int i_2027_ = ((i_2025_ & 0xff00ff) + (i_2000_ & 0xff00ff));
								int i_2028_ = ((i_2027_ & 0x1000100) + (i_2026_ - i_2027_ & 0x10000));
								is[i_2003_++] = i_2026_ - i_2028_ | i_2028_ - (i_2028_ >>> 8);
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 2) {
						int i_2029_ = i_2000_ >>> 24;
						int i_2030_ = 256 - i_2029_;
						int i_2031_ = (i_2000_ & 0xff00ff) * i_2030_ & ~0xff00ff;
						int i_2032_ = (i_2000_ & 0xff00) * i_2030_ & 0xff0000;
						i_2000_ = (i_2031_ | i_2032_) >>> 8;
						for (int i_2033_ = -i_2005_; i_2033_ < 0; i_2033_++) {
							for (int i_2034_ = -i_2006_; i_2034_ < 0; i_2034_++) {
								int i_2035_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]) & 0xff]);
								i_2031_ = ((i_2035_ & 0xff00ff) * i_2029_ & ~0xff00ff);
								i_2032_ = (i_2035_ & 0xff00) * i_2029_ & 0xff0000;
								is[i_2003_++] = ((i_2031_ | i_2032_) >>> 8) + i_2000_;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2001_ == 1) {
					if (i_1999_ == 1) {
						for (int i_2036_ = -i_2005_; i_2036_ < 0; i_2036_++) {
							for (int i_2037_ = -i_2006_; i_2037_ < 0; i_2037_++) {
								int i_2038_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								if (i_2038_ != 0) {
									int i_2039_ = ((((Class161_Sub3_Sub1) this).anIntArray11151[i_2038_ & 0xff]) | ~0xffffff);
									int i_2040_ = 255;
									int i_2041_ = 0;
									int i_2042_ = is[i_2003_];
									is[i_2003_++] = (((((i_2039_ & 0xff00ff) * i_2040_ + (i_2042_ & 0xff00ff) * i_2041_) & ~0xff00ff) >> 8) + (((((i_2039_ & ~0xff00ff) >>> 8) * i_2040_) + (((i_2042_ & ~0xff00ff) >>> 8) * i_2041_)) & ~0xff00ff));
								} else
									i_2003_++;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 0) {
						if ((i_2000_ & 0xffffff) == 16777215) {
							int i_2043_ = i_2000_ >>> 24;
							int i_2044_ = 256 - i_2043_;
							for (int i_2045_ = -i_2005_; i_2045_ < 0; i_2045_++) {
								for (int i_2046_ = -i_2006_; i_2046_ < 0; i_2046_++) {
									int i_2047_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
									if (i_2047_ != 0) {
										int i_2048_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2047_ & 0xff]);
										int i_2049_ = is[i_2003_];
										is[i_2003_++] = ((((i_2048_ & 0xff00ff) * i_2043_ + ((i_2049_ & 0xff00ff) * i_2044_)) & ~0xff00ff) + (((i_2048_ & 0xff00) * i_2043_ + ((i_2049_ & 0xff00) * i_2044_)) & 0xff0000)) >> 8;
									} else
										i_2003_++;
								}
								i_2003_ += i_2007_;
								i_2004_ += i_2008_;
							}
						} else {
							int i_2050_ = (i_2000_ & 0xff0000) >> 16;
							int i_2051_ = (i_2000_ & 0xff00) >> 8;
							int i_2052_ = i_2000_ & 0xff;
							int i_2053_ = i_2000_ >>> 24;
							int i_2054_ = 256 - i_2053_;
							for (int i_2055_ = -i_2005_; i_2055_ < 0; i_2055_++) {
								for (int i_2056_ = -i_2006_; i_2056_ < 0; i_2056_++) {
									int i_2057_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
									if (i_2057_ != 0) {
										int i_2058_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2057_ & 0xff]);
										if (i_2053_ != 255) {
											int i_2059_ = (((i_2058_ & 0xff0000) * i_2050_) & ~0xffffff);
											int i_2060_ = ((i_2058_ & 0xff00) * i_2051_ & 0xff0000);
											int i_2061_ = ((i_2058_ & 0xff) * i_2052_ & 0xff00);
											i_2058_ = (i_2059_ | i_2060_ | i_2061_) >>> 8;
											int i_2062_ = is[i_2003_];
											is[i_2003_++] = (((((i_2058_ & 0xff00ff) * i_2053_) + ((i_2062_ & 0xff00ff) * i_2054_)) & ~0xff00ff) + ((((i_2058_ & 0xff00) * i_2053_) + ((i_2062_ & 0xff00) * i_2054_)) & 0xff0000)) >> 8;
										} else {
											int i_2063_ = (((i_2058_ & 0xff0000) * i_2050_) & ~0xffffff);
											int i_2064_ = ((i_2058_ & 0xff00) * i_2051_ & 0xff0000);
											int i_2065_ = ((i_2058_ & 0xff) * i_2052_ & 0xff00);
											is[i_2003_++] = (i_2063_ | i_2064_ | i_2065_) >>> 8;
										}
									} else
										i_2003_++;
								}
								i_2003_ += i_2007_;
								i_2004_ += i_2008_;
							}
						}
					} else if (i_1999_ == 3) {
						int i_2066_ = i_2000_ >>> 24;
						int i_2067_ = 256 - i_2066_;
						for (int i_2068_ = -i_2005_; i_2068_ < 0; i_2068_++) {
							for (int i_2069_ = -i_2006_; i_2069_ < 0; i_2069_++) {
								byte i_2070_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								int i_2071_ = (i_2070_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2070_]) : 0);
								int i_2072_ = i_2071_ + i_2000_;
								int i_2073_ = ((i_2071_ & 0xff00ff) + (i_2000_ & 0xff00ff));
								int i_2074_ = ((i_2073_ & 0x1000100) + (i_2072_ - i_2073_ & 0x10000));
								i_2074_ = i_2072_ - i_2074_ | i_2074_ - (i_2074_ >>> 8);
								if (i_2071_ == 0 && i_2066_ != 255) {
									i_2071_ = i_2074_;
									i_2074_ = is[i_2003_];
									i_2074_ = ((((i_2071_ & 0xff00ff) * i_2066_ + (i_2074_ & 0xff00ff) * i_2067_) & ~0xff00ff) + (((i_2071_ & 0xff00) * i_2066_ + (i_2074_ & 0xff00) * i_2067_) & 0xff0000)) >> 8;
								}
								is[i_2003_++] = i_2074_;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 2) {
						int i_2075_ = i_2000_ >>> 24;
						int i_2076_ = 256 - i_2075_;
						int i_2077_ = (i_2000_ & 0xff00ff) * i_2076_ & ~0xff00ff;
						int i_2078_ = (i_2000_ & 0xff00) * i_2076_ & 0xff0000;
						i_2000_ = (i_2077_ | i_2078_) >>> 8;
						for (int i_2079_ = -i_2005_; i_2079_ < 0; i_2079_++) {
							for (int i_2080_ = -i_2006_; i_2080_ < 0; i_2080_++) {
								int i_2081_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								if (i_2081_ != 0) {
									int i_2082_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2081_ & 0xff]);
									i_2077_ = ((i_2082_ & 0xff00ff) * i_2075_ & ~0xff00ff);
									i_2078_ = ((i_2082_ & 0xff00) * i_2075_ & 0xff0000);
									is[i_2003_++] = ((i_2077_ | i_2078_) >>> 8) + i_2000_;
								} else
									i_2003_++;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2001_ == 2) {
					if (i_1999_ == 1) {
						for (int i_2083_ = -i_2005_; i_2083_ < 0; i_2083_++) {
							for (int i_2084_ = -i_2006_; i_2084_ < 0; i_2084_++) {
								int i_2085_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								if (i_2085_ != 0) {
									int i_2086_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2085_ & 0xff]);
									int i_2087_ = is[i_2003_];
									int i_2088_ = i_2086_ + i_2087_;
									int i_2089_ = ((i_2086_ & 0xff00ff) + (i_2087_ & 0xff00ff));
									i_2087_ = ((i_2089_ & 0x1000100) + (i_2088_ - i_2089_ & 0x10000));
									is[i_2003_++] = (i_2088_ - i_2087_ | i_2087_ - (i_2087_ >>> 8));
								} else
									i_2003_++;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 0) {
						int i_2090_ = (i_2000_ & 0xff0000) >> 16;
						int i_2091_ = (i_2000_ & 0xff00) >> 8;
						int i_2092_ = i_2000_ & 0xff;
						for (int i_2093_ = -i_2005_; i_2093_ < 0; i_2093_++) {
							for (int i_2094_ = -i_2006_; i_2094_ < 0; i_2094_++) {
								int i_2095_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								if (i_2095_ != 0) {
									int i_2096_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2095_ & 0xff]);
									int i_2097_ = ((i_2096_ & 0xff0000) * i_2090_ & ~0xffffff);
									int i_2098_ = ((i_2096_ & 0xff00) * i_2091_ & 0xff0000);
									int i_2099_ = (i_2096_ & 0xff) * i_2092_ & 0xff00;
									i_2096_ = (i_2097_ | i_2098_ | i_2099_) >>> 8;
									int i_2100_ = is[i_2003_];
									int i_2101_ = i_2096_ + i_2100_;
									int i_2102_ = ((i_2096_ & 0xff00ff) + (i_2100_ & 0xff00ff));
									i_2100_ = ((i_2102_ & 0x1000100) + (i_2101_ - i_2102_ & 0x10000));
									is[i_2003_++] = (i_2101_ - i_2100_ | i_2100_ - (i_2100_ >>> 8));
								} else
									i_2003_++;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 3) {
						for (int i_2103_ = -i_2005_; i_2103_ < 0; i_2103_++) {
							for (int i_2104_ = -i_2006_; i_2104_ < 0; i_2104_++) {
								byte i_2105_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								int i_2106_ = (i_2105_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2105_]) : 0);
								int i_2107_ = i_2106_ + i_2000_;
								int i_2108_ = ((i_2106_ & 0xff00ff) + (i_2000_ & 0xff00ff));
								int i_2109_ = ((i_2108_ & 0x1000100) + (i_2107_ - i_2108_ & 0x10000));
								i_2106_ = i_2107_ - i_2109_ | i_2109_ - (i_2109_ >>> 8);
								i_2109_ = is[i_2003_];
								i_2107_ = i_2106_ + i_2109_;
								i_2108_ = (i_2106_ & 0xff00ff) + (i_2109_ & 0xff00ff);
								i_2109_ = ((i_2108_ & 0x1000100) + (i_2107_ - i_2108_ & 0x10000));
								is[i_2003_++] = i_2107_ - i_2109_ | i_2109_ - (i_2109_ >>> 8);
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else if (i_1999_ == 2) {
						int i_2110_ = i_2000_ >>> 24;
						int i_2111_ = 256 - i_2110_;
						int i_2112_ = (i_2000_ & 0xff00ff) * i_2111_ & ~0xff00ff;
						int i_2113_ = (i_2000_ & 0xff00) * i_2111_ & 0xff0000;
						i_2000_ = (i_2112_ | i_2113_) >>> 8;
						for (int i_2114_ = -i_2005_; i_2114_ < 0; i_2114_++) {
							for (int i_2115_ = -i_2006_; i_2115_ < 0; i_2115_++) {
								int i_2116_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2004_++]);
								if (i_2116_ != 0) {
									int i_2117_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2116_ & 0xff]);
									i_2112_ = ((i_2117_ & 0xff00ff) * i_2110_ & ~0xff00ff);
									i_2113_ = ((i_2117_ & 0xff00) * i_2110_ & 0xff0000);
									i_2117_ = (((i_2112_ | i_2113_) >>> 8) + i_2000_);
									int i_2118_ = is[i_2003_];
									int i_2119_ = i_2117_ + i_2118_;
									int i_2120_ = ((i_2117_ & 0xff00ff) + (i_2118_ & 0xff00ff));
									i_2118_ = ((i_2120_ & 0x1000100) + (i_2119_ - i_2120_ & 0x10000));
									is[i_2003_++] = (i_2119_ - i_2118_ | i_2118_ - (i_2118_ >>> 8));
								} else
									i_2003_++;
							}
							i_2003_ += i_2007_;
							i_2004_ += i_2008_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2646(int i, int i_2121_, int i_2122_, int i_2123_, int i_2124_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_2125_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_2121_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_2126_ = i_2121_ * i_2125_ + i;
			int i_2127_ = 0;
			int i_2128_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_2129_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_2130_ = i_2125_ - i_2129_;
			int i_2131_ = 0;
			if (i_2121_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2132_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_2121_);
				i_2128_ -= i_2132_;
				i_2121_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_2127_ += i_2132_ * i_2129_;
				i_2126_ += i_2132_ * i_2125_;
			}
			if (i_2121_ + i_2128_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2128_ -= (i_2121_ + i_2128_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2133_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2129_ -= i_2133_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_2127_ += i_2133_;
				i_2126_ += i_2133_;
				i_2131_ += i_2133_;
				i_2130_ += i_2133_;
			}
			if (i + i_2129_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2134_ = (i + i_2129_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2129_ -= i_2134_;
				i_2131_ += i_2134_;
				i_2130_ += i_2134_;
			}
			if (i_2129_ > 0 && i_2128_ > 0) {
				if (i_2124_ == 0) {
					if (i_2122_ == 1) {
						for (int i_2135_ = -i_2128_; i_2135_ < 0; i_2135_++) {
							int i_2136_ = i_2126_ + i_2129_ - 3;
							while (i_2126_ < i_2136_) {
								is[i_2126_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								is[i_2126_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								is[i_2126_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								is[i_2126_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
							}
							i_2136_ += 3;
							while (i_2126_ < i_2136_)
								is[i_2126_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 0) {
						int i_2137_ = (i_2123_ & 0xff0000) >> 16;
						int i_2138_ = (i_2123_ & 0xff00) >> 8;
						int i_2139_ = i_2123_ & 0xff;
						for (int i_2140_ = -i_2128_; i_2140_ < 0; i_2140_++) {
							for (int i_2141_ = -i_2129_; i_2141_ < 0; i_2141_++) {
								int i_2142_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								int i_2143_ = ((i_2142_ & 0xff0000) * i_2137_ & ~0xffffff);
								int i_2144_ = (i_2142_ & 0xff00) * i_2138_ & 0xff0000;
								int i_2145_ = (i_2142_ & 0xff) * i_2139_ & 0xff00;
								is[i_2126_++] = (i_2143_ | i_2144_ | i_2145_) >>> 8;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 3) {
						for (int i_2146_ = -i_2128_; i_2146_ < 0; i_2146_++) {
							for (int i_2147_ = -i_2129_; i_2147_ < 0; i_2147_++) {
								int i_2148_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								int i_2149_ = i_2148_ + i_2123_;
								int i_2150_ = ((i_2148_ & 0xff00ff) + (i_2123_ & 0xff00ff));
								int i_2151_ = ((i_2150_ & 0x1000100) + (i_2149_ - i_2150_ & 0x10000));
								is[i_2126_++] = i_2149_ - i_2151_ | i_2151_ - (i_2151_ >>> 8);
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 2) {
						int i_2152_ = i_2123_ >>> 24;
						int i_2153_ = 256 - i_2152_;
						int i_2154_ = (i_2123_ & 0xff00ff) * i_2153_ & ~0xff00ff;
						int i_2155_ = (i_2123_ & 0xff00) * i_2153_ & 0xff0000;
						i_2123_ = (i_2154_ | i_2155_) >>> 8;
						for (int i_2156_ = -i_2128_; i_2156_ < 0; i_2156_++) {
							for (int i_2157_ = -i_2129_; i_2157_ < 0; i_2157_++) {
								int i_2158_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]) & 0xff]);
								i_2154_ = ((i_2158_ & 0xff00ff) * i_2152_ & ~0xff00ff);
								i_2155_ = (i_2158_ & 0xff00) * i_2152_ & 0xff0000;
								is[i_2126_++] = ((i_2154_ | i_2155_) >>> 8) + i_2123_;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2124_ == 1) {
					if (i_2122_ == 1) {
						for (int i_2159_ = -i_2128_; i_2159_ < 0; i_2159_++) {
							for (int i_2160_ = -i_2129_; i_2160_ < 0; i_2160_++) {
								int i_2161_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								if (i_2161_ != 0) {
									int i_2162_ = ((((Class161_Sub3_Sub1) this).anIntArray11151[i_2161_ & 0xff]) | ~0xffffff);
									int i_2163_ = 255;
									int i_2164_ = 0;
									int i_2165_ = is[i_2126_];
									is[i_2126_++] = (((((i_2162_ & 0xff00ff) * i_2163_ + (i_2165_ & 0xff00ff) * i_2164_) & ~0xff00ff) >> 8) + (((((i_2162_ & ~0xff00ff) >>> 8) * i_2163_) + (((i_2165_ & ~0xff00ff) >>> 8) * i_2164_)) & ~0xff00ff));
								} else
									i_2126_++;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 0) {
						if ((i_2123_ & 0xffffff) == 16777215) {
							int i_2166_ = i_2123_ >>> 24;
							int i_2167_ = 256 - i_2166_;
							for (int i_2168_ = -i_2128_; i_2168_ < 0; i_2168_++) {
								for (int i_2169_ = -i_2129_; i_2169_ < 0; i_2169_++) {
									int i_2170_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
									if (i_2170_ != 0) {
										int i_2171_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2170_ & 0xff]);
										int i_2172_ = is[i_2126_];
										is[i_2126_++] = ((((i_2171_ & 0xff00ff) * i_2166_ + ((i_2172_ & 0xff00ff) * i_2167_)) & ~0xff00ff) + (((i_2171_ & 0xff00) * i_2166_ + ((i_2172_ & 0xff00) * i_2167_)) & 0xff0000)) >> 8;
									} else
										i_2126_++;
								}
								i_2126_ += i_2130_;
								i_2127_ += i_2131_;
							}
						} else {
							int i_2173_ = (i_2123_ & 0xff0000) >> 16;
							int i_2174_ = (i_2123_ & 0xff00) >> 8;
							int i_2175_ = i_2123_ & 0xff;
							int i_2176_ = i_2123_ >>> 24;
							int i_2177_ = 256 - i_2176_;
							for (int i_2178_ = -i_2128_; i_2178_ < 0; i_2178_++) {
								for (int i_2179_ = -i_2129_; i_2179_ < 0; i_2179_++) {
									int i_2180_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
									if (i_2180_ != 0) {
										int i_2181_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2180_ & 0xff]);
										if (i_2176_ != 255) {
											int i_2182_ = (((i_2181_ & 0xff0000) * i_2173_) & ~0xffffff);
											int i_2183_ = ((i_2181_ & 0xff00) * i_2174_ & 0xff0000);
											int i_2184_ = ((i_2181_ & 0xff) * i_2175_ & 0xff00);
											i_2181_ = (i_2182_ | i_2183_ | i_2184_) >>> 8;
											int i_2185_ = is[i_2126_];
											is[i_2126_++] = (((((i_2181_ & 0xff00ff) * i_2176_) + ((i_2185_ & 0xff00ff) * i_2177_)) & ~0xff00ff) + ((((i_2181_ & 0xff00) * i_2176_) + ((i_2185_ & 0xff00) * i_2177_)) & 0xff0000)) >> 8;
										} else {
											int i_2186_ = (((i_2181_ & 0xff0000) * i_2173_) & ~0xffffff);
											int i_2187_ = ((i_2181_ & 0xff00) * i_2174_ & 0xff0000);
											int i_2188_ = ((i_2181_ & 0xff) * i_2175_ & 0xff00);
											is[i_2126_++] = (i_2186_ | i_2187_ | i_2188_) >>> 8;
										}
									} else
										i_2126_++;
								}
								i_2126_ += i_2130_;
								i_2127_ += i_2131_;
							}
						}
					} else if (i_2122_ == 3) {
						int i_2189_ = i_2123_ >>> 24;
						int i_2190_ = 256 - i_2189_;
						for (int i_2191_ = -i_2128_; i_2191_ < 0; i_2191_++) {
							for (int i_2192_ = -i_2129_; i_2192_ < 0; i_2192_++) {
								byte i_2193_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								int i_2194_ = (i_2193_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2193_]) : 0);
								int i_2195_ = i_2194_ + i_2123_;
								int i_2196_ = ((i_2194_ & 0xff00ff) + (i_2123_ & 0xff00ff));
								int i_2197_ = ((i_2196_ & 0x1000100) + (i_2195_ - i_2196_ & 0x10000));
								i_2197_ = i_2195_ - i_2197_ | i_2197_ - (i_2197_ >>> 8);
								if (i_2194_ == 0 && i_2189_ != 255) {
									i_2194_ = i_2197_;
									i_2197_ = is[i_2126_];
									i_2197_ = ((((i_2194_ & 0xff00ff) * i_2189_ + (i_2197_ & 0xff00ff) * i_2190_) & ~0xff00ff) + (((i_2194_ & 0xff00) * i_2189_ + (i_2197_ & 0xff00) * i_2190_) & 0xff0000)) >> 8;
								}
								is[i_2126_++] = i_2197_;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 2) {
						int i_2198_ = i_2123_ >>> 24;
						int i_2199_ = 256 - i_2198_;
						int i_2200_ = (i_2123_ & 0xff00ff) * i_2199_ & ~0xff00ff;
						int i_2201_ = (i_2123_ & 0xff00) * i_2199_ & 0xff0000;
						i_2123_ = (i_2200_ | i_2201_) >>> 8;
						for (int i_2202_ = -i_2128_; i_2202_ < 0; i_2202_++) {
							for (int i_2203_ = -i_2129_; i_2203_ < 0; i_2203_++) {
								int i_2204_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								if (i_2204_ != 0) {
									int i_2205_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2204_ & 0xff]);
									i_2200_ = ((i_2205_ & 0xff00ff) * i_2198_ & ~0xff00ff);
									i_2201_ = ((i_2205_ & 0xff00) * i_2198_ & 0xff0000);
									is[i_2126_++] = ((i_2200_ | i_2201_) >>> 8) + i_2123_;
								} else
									i_2126_++;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2124_ == 2) {
					if (i_2122_ == 1) {
						for (int i_2206_ = -i_2128_; i_2206_ < 0; i_2206_++) {
							for (int i_2207_ = -i_2129_; i_2207_ < 0; i_2207_++) {
								int i_2208_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								if (i_2208_ != 0) {
									int i_2209_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2208_ & 0xff]);
									int i_2210_ = is[i_2126_];
									int i_2211_ = i_2209_ + i_2210_;
									int i_2212_ = ((i_2209_ & 0xff00ff) + (i_2210_ & 0xff00ff));
									i_2210_ = ((i_2212_ & 0x1000100) + (i_2211_ - i_2212_ & 0x10000));
									is[i_2126_++] = (i_2211_ - i_2210_ | i_2210_ - (i_2210_ >>> 8));
								} else
									i_2126_++;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 0) {
						int i_2213_ = (i_2123_ & 0xff0000) >> 16;
						int i_2214_ = (i_2123_ & 0xff00) >> 8;
						int i_2215_ = i_2123_ & 0xff;
						for (int i_2216_ = -i_2128_; i_2216_ < 0; i_2216_++) {
							for (int i_2217_ = -i_2129_; i_2217_ < 0; i_2217_++) {
								int i_2218_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								if (i_2218_ != 0) {
									int i_2219_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2218_ & 0xff]);
									int i_2220_ = ((i_2219_ & 0xff0000) * i_2213_ & ~0xffffff);
									int i_2221_ = ((i_2219_ & 0xff00) * i_2214_ & 0xff0000);
									int i_2222_ = (i_2219_ & 0xff) * i_2215_ & 0xff00;
									i_2219_ = (i_2220_ | i_2221_ | i_2222_) >>> 8;
									int i_2223_ = is[i_2126_];
									int i_2224_ = i_2219_ + i_2223_;
									int i_2225_ = ((i_2219_ & 0xff00ff) + (i_2223_ & 0xff00ff));
									i_2223_ = ((i_2225_ & 0x1000100) + (i_2224_ - i_2225_ & 0x10000));
									is[i_2126_++] = (i_2224_ - i_2223_ | i_2223_ - (i_2223_ >>> 8));
								} else
									i_2126_++;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 3) {
						for (int i_2226_ = -i_2128_; i_2226_ < 0; i_2226_++) {
							for (int i_2227_ = -i_2129_; i_2227_ < 0; i_2227_++) {
								byte i_2228_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								int i_2229_ = (i_2228_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2228_]) : 0);
								int i_2230_ = i_2229_ + i_2123_;
								int i_2231_ = ((i_2229_ & 0xff00ff) + (i_2123_ & 0xff00ff));
								int i_2232_ = ((i_2231_ & 0x1000100) + (i_2230_ - i_2231_ & 0x10000));
								i_2229_ = i_2230_ - i_2232_ | i_2232_ - (i_2232_ >>> 8);
								i_2232_ = is[i_2126_];
								i_2230_ = i_2229_ + i_2232_;
								i_2231_ = (i_2229_ & 0xff00ff) + (i_2232_ & 0xff00ff);
								i_2232_ = ((i_2231_ & 0x1000100) + (i_2230_ - i_2231_ & 0x10000));
								is[i_2126_++] = i_2230_ - i_2232_ | i_2232_ - (i_2232_ >>> 8);
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else if (i_2122_ == 2) {
						int i_2233_ = i_2123_ >>> 24;
						int i_2234_ = 256 - i_2233_;
						int i_2235_ = (i_2123_ & 0xff00ff) * i_2234_ & ~0xff00ff;
						int i_2236_ = (i_2123_ & 0xff00) * i_2234_ & 0xff0000;
						i_2123_ = (i_2235_ | i_2236_) >>> 8;
						for (int i_2237_ = -i_2128_; i_2237_ < 0; i_2237_++) {
							for (int i_2238_ = -i_2129_; i_2238_ < 0; i_2238_++) {
								int i_2239_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2127_++]);
								if (i_2239_ != 0) {
									int i_2240_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2239_ & 0xff]);
									i_2235_ = ((i_2240_ & 0xff00ff) * i_2233_ & ~0xff00ff);
									i_2236_ = ((i_2240_ & 0xff00) * i_2233_ & 0xff0000);
									i_2240_ = (((i_2235_ | i_2236_) >>> 8) + i_2123_);
									int i_2241_ = is[i_2126_];
									int i_2242_ = i_2240_ + i_2241_;
									int i_2243_ = ((i_2240_ & 0xff00ff) + (i_2241_ & 0xff00ff));
									i_2241_ = ((i_2243_ & 0x1000100) + (i_2242_ - i_2243_ & 0x10000));
									is[i_2126_++] = (i_2242_ - i_2241_ | i_2241_ - (i_2241_ >>> 8));
								} else
									i_2126_++;
							}
							i_2126_ += i_2130_;
							i_2127_ += i_2131_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2644(int i, int i_2244_, int i_2245_, int i_2246_, int i_2247_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			int i_2248_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_2244_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_2249_ = i_2244_ * i_2248_ + i;
			int i_2250_ = 0;
			int i_2251_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_2252_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_2253_ = i_2248_ - i_2252_;
			int i_2254_ = 0;
			if (i_2244_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2255_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_2244_);
				i_2251_ -= i_2255_;
				i_2244_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_2250_ += i_2255_ * i_2252_;
				i_2249_ += i_2255_ * i_2248_;
			}
			if (i_2244_ + i_2251_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2251_ -= (i_2244_ + i_2251_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2256_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2252_ -= i_2256_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_2250_ += i_2256_;
				i_2249_ += i_2256_;
				i_2254_ += i_2256_;
				i_2253_ += i_2256_;
			}
			if (i + i_2252_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2257_ = (i + i_2252_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2252_ -= i_2257_;
				i_2254_ += i_2257_;
				i_2253_ += i_2257_;
			}
			if (i_2252_ > 0 && i_2251_ > 0) {
				if (i_2247_ == 0) {
					if (i_2245_ == 1) {
						for (int i_2258_ = -i_2251_; i_2258_ < 0; i_2258_++) {
							int i_2259_ = i_2249_ + i_2252_ - 3;
							while (i_2249_ < i_2259_) {
								is[i_2249_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								is[i_2249_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								is[i_2249_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								is[i_2249_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
							}
							i_2259_ += 3;
							while (i_2249_ < i_2259_)
								is[i_2249_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 0) {
						int i_2260_ = (i_2246_ & 0xff0000) >> 16;
						int i_2261_ = (i_2246_ & 0xff00) >> 8;
						int i_2262_ = i_2246_ & 0xff;
						for (int i_2263_ = -i_2251_; i_2263_ < 0; i_2263_++) {
							for (int i_2264_ = -i_2252_; i_2264_ < 0; i_2264_++) {
								int i_2265_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								int i_2266_ = ((i_2265_ & 0xff0000) * i_2260_ & ~0xffffff);
								int i_2267_ = (i_2265_ & 0xff00) * i_2261_ & 0xff0000;
								int i_2268_ = (i_2265_ & 0xff) * i_2262_ & 0xff00;
								is[i_2249_++] = (i_2266_ | i_2267_ | i_2268_) >>> 8;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 3) {
						for (int i_2269_ = -i_2251_; i_2269_ < 0; i_2269_++) {
							for (int i_2270_ = -i_2252_; i_2270_ < 0; i_2270_++) {
								int i_2271_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								int i_2272_ = i_2271_ + i_2246_;
								int i_2273_ = ((i_2271_ & 0xff00ff) + (i_2246_ & 0xff00ff));
								int i_2274_ = ((i_2273_ & 0x1000100) + (i_2272_ - i_2273_ & 0x10000));
								is[i_2249_++] = i_2272_ - i_2274_ | i_2274_ - (i_2274_ >>> 8);
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 2) {
						int i_2275_ = i_2246_ >>> 24;
						int i_2276_ = 256 - i_2275_;
						int i_2277_ = (i_2246_ & 0xff00ff) * i_2276_ & ~0xff00ff;
						int i_2278_ = (i_2246_ & 0xff00) * i_2276_ & 0xff0000;
						i_2246_ = (i_2277_ | i_2278_) >>> 8;
						for (int i_2279_ = -i_2251_; i_2279_ < 0; i_2279_++) {
							for (int i_2280_ = -i_2252_; i_2280_ < 0; i_2280_++) {
								int i_2281_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]) & 0xff]);
								i_2277_ = ((i_2281_ & 0xff00ff) * i_2275_ & ~0xff00ff);
								i_2278_ = (i_2281_ & 0xff00) * i_2275_ & 0xff0000;
								is[i_2249_++] = ((i_2277_ | i_2278_) >>> 8) + i_2246_;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2247_ == 1) {
					if (i_2245_ == 1) {
						for (int i_2282_ = -i_2251_; i_2282_ < 0; i_2282_++) {
							for (int i_2283_ = -i_2252_; i_2283_ < 0; i_2283_++) {
								int i_2284_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								if (i_2284_ != 0) {
									int i_2285_ = ((((Class161_Sub3_Sub1) this).anIntArray11151[i_2284_ & 0xff]) | ~0xffffff);
									int i_2286_ = 255;
									int i_2287_ = 0;
									int i_2288_ = is[i_2249_];
									is[i_2249_++] = (((((i_2285_ & 0xff00ff) * i_2286_ + (i_2288_ & 0xff00ff) * i_2287_) & ~0xff00ff) >> 8) + (((((i_2285_ & ~0xff00ff) >>> 8) * i_2286_) + (((i_2288_ & ~0xff00ff) >>> 8) * i_2287_)) & ~0xff00ff));
								} else
									i_2249_++;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 0) {
						if ((i_2246_ & 0xffffff) == 16777215) {
							int i_2289_ = i_2246_ >>> 24;
							int i_2290_ = 256 - i_2289_;
							for (int i_2291_ = -i_2251_; i_2291_ < 0; i_2291_++) {
								for (int i_2292_ = -i_2252_; i_2292_ < 0; i_2292_++) {
									int i_2293_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
									if (i_2293_ != 0) {
										int i_2294_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2293_ & 0xff]);
										int i_2295_ = is[i_2249_];
										is[i_2249_++] = ((((i_2294_ & 0xff00ff) * i_2289_ + ((i_2295_ & 0xff00ff) * i_2290_)) & ~0xff00ff) + (((i_2294_ & 0xff00) * i_2289_ + ((i_2295_ & 0xff00) * i_2290_)) & 0xff0000)) >> 8;
									} else
										i_2249_++;
								}
								i_2249_ += i_2253_;
								i_2250_ += i_2254_;
							}
						} else {
							int i_2296_ = (i_2246_ & 0xff0000) >> 16;
							int i_2297_ = (i_2246_ & 0xff00) >> 8;
							int i_2298_ = i_2246_ & 0xff;
							int i_2299_ = i_2246_ >>> 24;
							int i_2300_ = 256 - i_2299_;
							for (int i_2301_ = -i_2251_; i_2301_ < 0; i_2301_++) {
								for (int i_2302_ = -i_2252_; i_2302_ < 0; i_2302_++) {
									int i_2303_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
									if (i_2303_ != 0) {
										int i_2304_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2303_ & 0xff]);
										if (i_2299_ != 255) {
											int i_2305_ = (((i_2304_ & 0xff0000) * i_2296_) & ~0xffffff);
											int i_2306_ = ((i_2304_ & 0xff00) * i_2297_ & 0xff0000);
											int i_2307_ = ((i_2304_ & 0xff) * i_2298_ & 0xff00);
											i_2304_ = (i_2305_ | i_2306_ | i_2307_) >>> 8;
											int i_2308_ = is[i_2249_];
											is[i_2249_++] = (((((i_2304_ & 0xff00ff) * i_2299_) + ((i_2308_ & 0xff00ff) * i_2300_)) & ~0xff00ff) + ((((i_2304_ & 0xff00) * i_2299_) + ((i_2308_ & 0xff00) * i_2300_)) & 0xff0000)) >> 8;
										} else {
											int i_2309_ = (((i_2304_ & 0xff0000) * i_2296_) & ~0xffffff);
											int i_2310_ = ((i_2304_ & 0xff00) * i_2297_ & 0xff0000);
											int i_2311_ = ((i_2304_ & 0xff) * i_2298_ & 0xff00);
											is[i_2249_++] = (i_2309_ | i_2310_ | i_2311_) >>> 8;
										}
									} else
										i_2249_++;
								}
								i_2249_ += i_2253_;
								i_2250_ += i_2254_;
							}
						}
					} else if (i_2245_ == 3) {
						int i_2312_ = i_2246_ >>> 24;
						int i_2313_ = 256 - i_2312_;
						for (int i_2314_ = -i_2251_; i_2314_ < 0; i_2314_++) {
							for (int i_2315_ = -i_2252_; i_2315_ < 0; i_2315_++) {
								byte i_2316_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								int i_2317_ = (i_2316_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2316_]) : 0);
								int i_2318_ = i_2317_ + i_2246_;
								int i_2319_ = ((i_2317_ & 0xff00ff) + (i_2246_ & 0xff00ff));
								int i_2320_ = ((i_2319_ & 0x1000100) + (i_2318_ - i_2319_ & 0x10000));
								i_2320_ = i_2318_ - i_2320_ | i_2320_ - (i_2320_ >>> 8);
								if (i_2317_ == 0 && i_2312_ != 255) {
									i_2317_ = i_2320_;
									i_2320_ = is[i_2249_];
									i_2320_ = ((((i_2317_ & 0xff00ff) * i_2312_ + (i_2320_ & 0xff00ff) * i_2313_) & ~0xff00ff) + (((i_2317_ & 0xff00) * i_2312_ + (i_2320_ & 0xff00) * i_2313_) & 0xff0000)) >> 8;
								}
								is[i_2249_++] = i_2320_;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 2) {
						int i_2321_ = i_2246_ >>> 24;
						int i_2322_ = 256 - i_2321_;
						int i_2323_ = (i_2246_ & 0xff00ff) * i_2322_ & ~0xff00ff;
						int i_2324_ = (i_2246_ & 0xff00) * i_2322_ & 0xff0000;
						i_2246_ = (i_2323_ | i_2324_) >>> 8;
						for (int i_2325_ = -i_2251_; i_2325_ < 0; i_2325_++) {
							for (int i_2326_ = -i_2252_; i_2326_ < 0; i_2326_++) {
								int i_2327_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								if (i_2327_ != 0) {
									int i_2328_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2327_ & 0xff]);
									i_2323_ = ((i_2328_ & 0xff00ff) * i_2321_ & ~0xff00ff);
									i_2324_ = ((i_2328_ & 0xff00) * i_2321_ & 0xff0000);
									is[i_2249_++] = ((i_2323_ | i_2324_) >>> 8) + i_2246_;
								} else
									i_2249_++;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2247_ == 2) {
					if (i_2245_ == 1) {
						for (int i_2329_ = -i_2251_; i_2329_ < 0; i_2329_++) {
							for (int i_2330_ = -i_2252_; i_2330_ < 0; i_2330_++) {
								int i_2331_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								if (i_2331_ != 0) {
									int i_2332_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2331_ & 0xff]);
									int i_2333_ = is[i_2249_];
									int i_2334_ = i_2332_ + i_2333_;
									int i_2335_ = ((i_2332_ & 0xff00ff) + (i_2333_ & 0xff00ff));
									i_2333_ = ((i_2335_ & 0x1000100) + (i_2334_ - i_2335_ & 0x10000));
									is[i_2249_++] = (i_2334_ - i_2333_ | i_2333_ - (i_2333_ >>> 8));
								} else
									i_2249_++;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 0) {
						int i_2336_ = (i_2246_ & 0xff0000) >> 16;
						int i_2337_ = (i_2246_ & 0xff00) >> 8;
						int i_2338_ = i_2246_ & 0xff;
						for (int i_2339_ = -i_2251_; i_2339_ < 0; i_2339_++) {
							for (int i_2340_ = -i_2252_; i_2340_ < 0; i_2340_++) {
								int i_2341_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								if (i_2341_ != 0) {
									int i_2342_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2341_ & 0xff]);
									int i_2343_ = ((i_2342_ & 0xff0000) * i_2336_ & ~0xffffff);
									int i_2344_ = ((i_2342_ & 0xff00) * i_2337_ & 0xff0000);
									int i_2345_ = (i_2342_ & 0xff) * i_2338_ & 0xff00;
									i_2342_ = (i_2343_ | i_2344_ | i_2345_) >>> 8;
									int i_2346_ = is[i_2249_];
									int i_2347_ = i_2342_ + i_2346_;
									int i_2348_ = ((i_2342_ & 0xff00ff) + (i_2346_ & 0xff00ff));
									i_2346_ = ((i_2348_ & 0x1000100) + (i_2347_ - i_2348_ & 0x10000));
									is[i_2249_++] = (i_2347_ - i_2346_ | i_2346_ - (i_2346_ >>> 8));
								} else
									i_2249_++;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 3) {
						for (int i_2349_ = -i_2251_; i_2349_ < 0; i_2349_++) {
							for (int i_2350_ = -i_2252_; i_2350_ < 0; i_2350_++) {
								byte i_2351_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								int i_2352_ = (i_2351_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2351_]) : 0);
								int i_2353_ = i_2352_ + i_2246_;
								int i_2354_ = ((i_2352_ & 0xff00ff) + (i_2246_ & 0xff00ff));
								int i_2355_ = ((i_2354_ & 0x1000100) + (i_2353_ - i_2354_ & 0x10000));
								i_2352_ = i_2353_ - i_2355_ | i_2355_ - (i_2355_ >>> 8);
								i_2355_ = is[i_2249_];
								i_2353_ = i_2352_ + i_2355_;
								i_2354_ = (i_2352_ & 0xff00ff) + (i_2355_ & 0xff00ff);
								i_2355_ = ((i_2354_ & 0x1000100) + (i_2353_ - i_2354_ & 0x10000));
								is[i_2249_++] = i_2353_ - i_2355_ | i_2355_ - (i_2355_ >>> 8);
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else if (i_2245_ == 2) {
						int i_2356_ = i_2246_ >>> 24;
						int i_2357_ = 256 - i_2356_;
						int i_2358_ = (i_2246_ & 0xff00ff) * i_2357_ & ~0xff00ff;
						int i_2359_ = (i_2246_ & 0xff00) * i_2357_ & 0xff0000;
						i_2246_ = (i_2358_ | i_2359_) >>> 8;
						for (int i_2360_ = -i_2251_; i_2360_ < 0; i_2360_++) {
							for (int i_2361_ = -i_2252_; i_2361_ < 0; i_2361_++) {
								int i_2362_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2250_++]);
								if (i_2362_ != 0) {
									int i_2363_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2362_ & 0xff]);
									i_2358_ = ((i_2363_ & 0xff00ff) * i_2356_ & ~0xff00ff);
									i_2359_ = ((i_2363_ & 0xff00) * i_2356_ & 0xff0000);
									i_2363_ = (((i_2358_ | i_2359_) >>> 8) + i_2246_);
									int i_2364_ = is[i_2249_];
									int i_2365_ = i_2363_ + i_2364_;
									int i_2366_ = ((i_2363_ & 0xff00ff) + (i_2364_ & 0xff00ff));
									i_2364_ = ((i_2366_ & 0x1000100) + (i_2365_ - i_2366_ & 0x10000));
									is[i_2249_++] = (i_2365_ - i_2364_ | i_2364_ - (i_2364_ >>> 8));
								} else
									i_2249_++;
							}
							i_2249_ += i_2253_;
							i_2250_ += i_2254_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2620(int i, int i_2367_, Class167 class167, int i_2368_, int i_2369_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			i += ((Class161_Sub3_Sub1) this).anInt10942;
			i_2367_ += ((Class161_Sub3_Sub1) this).anInt10929;
			int i_2370_ = 0;
			int i_2371_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
			int i_2372_ = ((Class161_Sub3_Sub1) this).anInt10945;
			int i_2373_ = ((Class161_Sub3_Sub1) this).anInt10930;
			int i_2374_ = i_2371_ - i_2372_;
			int i_2375_ = 0;
			int i_2376_ = i + i_2367_ * i_2371_;
			if (i_2367_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_2377_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_2367_);
				i_2373_ -= i_2377_;
				i_2367_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259);
				i_2370_ += i_2377_ * i_2372_;
				i_2376_ += i_2377_ * i_2371_;
			}
			if (i_2367_ + i_2373_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_2373_ -= (i_2367_ + i_2373_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_2378_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_2372_ -= i_2378_;
				i = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163);
				i_2370_ += i_2378_;
				i_2376_ += i_2378_;
				i_2375_ += i_2378_;
				i_2374_ += i_2378_;
			}
			if (i + i_2372_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_2379_ = (i + i_2372_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_2372_ -= i_2379_;
				i_2375_ += i_2379_;
				i_2374_ += i_2379_;
			}
			if (i_2372_ > 0 && i_2373_ > 0) {
				Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
				int[] is_2380_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
				int[] is_2381_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
				int i_2382_ = i_2367_;
				if (i_2369_ > i_2382_) {
					i_2382_ = i_2369_;
					i_2376_ += (i_2369_ - i_2367_) * i_2371_;
					i_2370_ += ((i_2369_ - i_2367_) * ((Class161_Sub3_Sub1) this).anInt10945);
				}
				int i_2383_ = (i_2369_ + is_2380_.length < i_2367_ + i_2373_ ? i_2369_ + is_2380_.length : i_2367_ + i_2373_);
				for (int i_2384_ = i_2382_; i_2384_ < i_2383_; i_2384_++) {
					int i_2385_ = is_2380_[i_2384_ - i_2369_] + i_2368_;
					int i_2386_ = is_2381_[i_2384_ - i_2369_];
					int i_2387_ = i_2372_;
					if (i > i_2385_) {
						int i_2388_ = i - i_2385_;
						if (i_2388_ >= i_2386_) {
							i_2370_ += i_2372_ + i_2375_;
							i_2376_ += i_2372_ + i_2374_;
							continue;
						}
						i_2386_ -= i_2388_;
					} else {
						int i_2389_ = i_2385_ - i;
						if (i_2389_ >= i_2372_) {
							i_2370_ += i_2372_ + i_2375_;
							i_2376_ += i_2372_ + i_2374_;
							continue;
						}
						i_2370_ += i_2389_;
						i_2387_ -= i_2389_;
						i_2376_ += i_2389_;
					}
					int i_2390_ = 0;
					if (i_2387_ < i_2386_)
						i_2386_ = i_2387_;
					else
						i_2390_ = i_2387_ - i_2386_;
					for (int i_2391_ = -i_2386_; i_2391_ < 0; i_2391_++) {
						int i_2392_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_2370_++]);
						if (i_2392_ != 0)
							is[i_2376_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2392_ & 0xff]);
						else
							i_2376_++;
					}
					i_2370_ += i_2390_ + i_2375_;
					i_2376_ += i_2390_ + i_2374_;
				}
			}
		}
	}

	public void method2601(int i, int i_2393_, int i_2394_) {
		throw new IllegalStateException();
	}

	void method2622(int i, int i_2395_, int i_2396_, int i_2397_, int i_2398_, int i_2399_, int i_2400_, int i_2401_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2396_ > 0 && i_2397_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2402_ = 0;
				int i_2403_ = 0;
				int i_2404_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2405_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_2406_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_2407_ = (i_2405_ << 16) / i_2396_;
				int i_2408_ = (i_2406_ << 16) / i_2397_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_2409_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_2407_ - 1) / i_2407_);
					i += i_2409_;
					i_2402_ += (i_2409_ * i_2407_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_2410_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_2408_ - 1) / i_2408_);
					i_2395_ += i_2410_;
					i_2403_ += (i_2410_ * i_2408_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_2405_)
					i_2396_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_2402_ + i_2407_ - 1) / i_2407_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_2406_)
					i_2397_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_2403_ + i_2408_ - 1) / i_2408_;
				int i_2411_ = i + i_2395_ * i_2404_;
				int i_2412_ = i_2404_ - i_2396_;
				if (i_2395_ + i_2397_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2397_ -= (i_2395_ + i_2397_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2395_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2413_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2395_);
					i_2397_ -= i_2413_;
					i_2411_ += i_2413_ * i_2404_;
					i_2403_ += i_2408_ * i_2413_;
				}
				if (i + i_2396_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2414_ = (i + i_2396_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2396_ -= i_2414_;
					i_2412_ += i_2414_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2415_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2396_ -= i_2415_;
					i_2411_ += i_2415_;
					i_2402_ += i_2407_ * i_2415_;
					i_2412_ += i_2415_;
				}
				if (i_2400_ == 0) {
					if (i_2398_ == 1) {
						int i_2416_ = i_2402_;
						for (int i_2417_ = -i_2397_; i_2417_ < 0; i_2417_++) {
							int i_2418_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2419_ = -i_2396_; i_2419_ < 0; i_2419_++) {
								is[i_2411_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2418_]) & 0xff]);
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2416_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 0) {
						int i_2420_ = (i_2399_ & 0xff0000) >> 16;
						int i_2421_ = (i_2399_ & 0xff00) >> 8;
						int i_2422_ = i_2399_ & 0xff;
						int i_2423_ = i_2402_;
						for (int i_2424_ = -i_2397_; i_2424_ < 0; i_2424_++) {
							int i_2425_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2426_ = -i_2396_; i_2426_ < 0; i_2426_++) {
								int i_2427_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2425_]) & 0xff]);
								int i_2428_ = ((i_2427_ & 0xff0000) * i_2420_ & ~0xffffff);
								int i_2429_ = (i_2427_ & 0xff00) * i_2421_ & 0xff0000;
								int i_2430_ = (i_2427_ & 0xff) * i_2422_ & 0xff00;
								is[i_2411_++] = (i_2428_ | i_2429_ | i_2430_) >>> 8;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2423_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 3) {
						int i_2431_ = i_2402_;
						for (int i_2432_ = -i_2397_; i_2432_ < 0; i_2432_++) {
							int i_2433_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2434_ = -i_2396_; i_2434_ < 0; i_2434_++) {
								byte i_2435_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2433_]);
								int i_2436_ = (i_2435_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2435_]) : 0);
								int i_2437_ = i_2436_ + i_2399_;
								int i_2438_ = ((i_2436_ & 0xff00ff) + (i_2399_ & 0xff00ff));
								int i_2439_ = ((i_2438_ & 0x1000100) + (i_2437_ - i_2438_ & 0x10000));
								is[i_2411_++] = i_2437_ - i_2439_ | i_2439_ - (i_2439_ >>> 8);
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2431_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 2) {
						int i_2440_ = i_2399_ >>> 24;
						int i_2441_ = 256 - i_2440_;
						int i_2442_ = (i_2399_ & 0xff00ff) * i_2441_ & ~0xff00ff;
						int i_2443_ = (i_2399_ & 0xff00) * i_2441_ & 0xff0000;
						i_2399_ = (i_2442_ | i_2443_) >>> 8;
						int i_2444_ = i_2402_;
						for (int i_2445_ = -i_2397_; i_2445_ < 0; i_2445_++) {
							int i_2446_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2447_ = -i_2396_; i_2447_ < 0; i_2447_++) {
								int i_2448_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2446_]) & 0xff]);
								i_2442_ = ((i_2448_ & 0xff00ff) * i_2440_ & ~0xff00ff);
								i_2443_ = (i_2448_ & 0xff00) * i_2440_ & 0xff0000;
								is[i_2411_++] = ((i_2442_ | i_2443_) >>> 8) + i_2399_;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2444_;
							i_2411_ += i_2412_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2400_ == 1) {
					if (i_2398_ == 1) {
						int i_2449_ = i_2402_;
						for (int i_2450_ = -i_2397_; i_2450_ < 0; i_2450_++) {
							int i_2451_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2452_ = -i_2396_; i_2452_ < 0; i_2452_++) {
								int i_2453_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2451_]);
								if (i_2453_ != 0)
									is[i_2411_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2453_ & 0xff]);
								else
									i_2411_++;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2449_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 0) {
						int i_2454_ = i_2402_;
						if ((i_2399_ & 0xffffff) == 16777215) {
							int i_2455_ = i_2399_ >>> 24;
							int i_2456_ = 256 - i_2455_;
							for (int i_2457_ = -i_2397_; i_2457_ < 0; i_2457_++) {
								int i_2458_ = ((i_2403_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2459_ = -i_2396_; i_2459_ < 0; i_2459_++) {
									int i_2460_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2458_]);
									if (i_2460_ != 0) {
										int i_2461_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2460_ & 0xff]);
										int i_2462_ = is[i_2411_];
										is[i_2411_++] = ((((i_2461_ & 0xff00ff) * i_2455_ + ((i_2462_ & 0xff00ff) * i_2456_)) & ~0xff00ff) + (((i_2461_ & 0xff00) * i_2455_ + ((i_2462_ & 0xff00) * i_2456_)) & 0xff0000)) >> 8;
									} else
										i_2411_++;
									i_2402_ += i_2407_;
								}
								i_2403_ += i_2408_;
								i_2402_ = i_2454_;
								i_2411_ += i_2412_;
							}
						} else {
							int i_2463_ = (i_2399_ & 0xff0000) >> 16;
							int i_2464_ = (i_2399_ & 0xff00) >> 8;
							int i_2465_ = i_2399_ & 0xff;
							int i_2466_ = i_2399_ >>> 24;
							int i_2467_ = 256 - i_2466_;
							for (int i_2468_ = -i_2397_; i_2468_ < 0; i_2468_++) {
								int i_2469_ = ((i_2403_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2470_ = -i_2396_; i_2470_ < 0; i_2470_++) {
									int i_2471_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2469_]);
									if (i_2471_ != 0) {
										int i_2472_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2471_ & 0xff]);
										if (i_2466_ != 255) {
											int i_2473_ = (((i_2472_ & 0xff0000) * i_2463_) & ~0xffffff);
											int i_2474_ = ((i_2472_ & 0xff00) * i_2464_ & 0xff0000);
											int i_2475_ = ((i_2472_ & 0xff) * i_2465_ & 0xff00);
											i_2472_ = (i_2473_ | i_2474_ | i_2475_) >>> 8;
											int i_2476_ = is[i_2411_];
											is[i_2411_++] = (((((i_2472_ & 0xff00ff) * i_2466_) + ((i_2476_ & 0xff00ff) * i_2467_)) & ~0xff00ff) + ((((i_2472_ & 0xff00) * i_2466_) + ((i_2476_ & 0xff00) * i_2467_)) & 0xff0000)) >> 8;
										} else {
											int i_2477_ = (((i_2472_ & 0xff0000) * i_2463_) & ~0xffffff);
											int i_2478_ = ((i_2472_ & 0xff00) * i_2464_ & 0xff0000);
											int i_2479_ = ((i_2472_ & 0xff) * i_2465_ & 0xff00);
											is[i_2411_++] = (i_2477_ | i_2478_ | i_2479_) >>> 8;
										}
									} else
										i_2411_++;
									i_2402_ += i_2407_;
								}
								i_2403_ += i_2408_;
								i_2402_ = i_2454_;
								i_2411_ += i_2412_;
							}
						}
					} else if (i_2398_ == 3) {
						int i_2480_ = i_2402_;
						int i_2481_ = i_2399_ >>> 24;
						int i_2482_ = 256 - i_2481_;
						for (int i_2483_ = -i_2397_; i_2483_ < 0; i_2483_++) {
							int i_2484_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2485_ = -i_2396_; i_2485_ < 0; i_2485_++) {
								byte i_2486_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2484_]);
								int i_2487_ = (i_2486_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2486_]) : 0);
								int i_2488_ = i_2487_ + i_2399_;
								int i_2489_ = ((i_2487_ & 0xff00ff) + (i_2399_ & 0xff00ff));
								int i_2490_ = ((i_2489_ & 0x1000100) + (i_2488_ - i_2489_ & 0x10000));
								i_2490_ = i_2488_ - i_2490_ | i_2490_ - (i_2490_ >>> 8);
								if (i_2487_ == 0 && i_2481_ != 255) {
									i_2487_ = i_2490_;
									i_2490_ = is[i_2411_];
									i_2490_ = ((((i_2487_ & 0xff00ff) * i_2481_ + (i_2490_ & 0xff00ff) * i_2482_) & ~0xff00ff) + (((i_2487_ & 0xff00) * i_2481_ + (i_2490_ & 0xff00) * i_2482_) & 0xff0000)) >> 8;
								}
								is[i_2411_++] = i_2490_;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2480_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 2) {
						int i_2491_ = i_2399_ >>> 24;
						int i_2492_ = 256 - i_2491_;
						int i_2493_ = (i_2399_ & 0xff00ff) * i_2492_ & ~0xff00ff;
						int i_2494_ = (i_2399_ & 0xff00) * i_2492_ & 0xff0000;
						i_2399_ = (i_2493_ | i_2494_) >>> 8;
						int i_2495_ = i_2402_;
						for (int i_2496_ = -i_2397_; i_2496_ < 0; i_2496_++) {
							int i_2497_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2498_ = -i_2396_; i_2498_ < 0; i_2498_++) {
								int i_2499_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2497_]);
								if (i_2499_ != 0) {
									int i_2500_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2499_ & 0xff]);
									i_2493_ = ((i_2500_ & 0xff00ff) * i_2491_ & ~0xff00ff);
									i_2494_ = ((i_2500_ & 0xff00) * i_2491_ & 0xff0000);
									is[i_2411_++] = ((i_2493_ | i_2494_) >>> 8) + i_2399_;
								} else
									i_2411_++;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2495_;
							i_2411_ += i_2412_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2400_ == 2) {
					if (i_2398_ == 1) {
						int i_2501_ = i_2402_;
						for (int i_2502_ = -i_2397_; i_2502_ < 0; i_2502_++) {
							int i_2503_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2504_ = -i_2396_; i_2504_ < 0; i_2504_++) {
								int i_2505_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2503_]);
								if (i_2505_ != 0) {
									int i_2506_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2505_ & 0xff]);
									int i_2507_ = is[i_2411_];
									int i_2508_ = i_2506_ + i_2507_;
									int i_2509_ = ((i_2506_ & 0xff00ff) + (i_2507_ & 0xff00ff));
									i_2507_ = ((i_2509_ & 0x1000100) + (i_2508_ - i_2509_ & 0x10000));
									is[i_2411_++] = (i_2508_ - i_2507_ | i_2507_ - (i_2507_ >>> 8));
								} else
									i_2411_++;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2501_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 0) {
						int i_2510_ = i_2402_;
						int i_2511_ = (i_2399_ & 0xff0000) >> 16;
						int i_2512_ = (i_2399_ & 0xff00) >> 8;
						int i_2513_ = i_2399_ & 0xff;
						for (int i_2514_ = -i_2397_; i_2514_ < 0; i_2514_++) {
							int i_2515_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2516_ = -i_2396_; i_2516_ < 0; i_2516_++) {
								int i_2517_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2515_]);
								if (i_2517_ != 0) {
									int i_2518_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2517_ & 0xff]);
									int i_2519_ = ((i_2518_ & 0xff0000) * i_2511_ & ~0xffffff);
									int i_2520_ = ((i_2518_ & 0xff00) * i_2512_ & 0xff0000);
									int i_2521_ = (i_2518_ & 0xff) * i_2513_ & 0xff00;
									i_2518_ = (i_2519_ | i_2520_ | i_2521_) >>> 8;
									int i_2522_ = is[i_2411_];
									int i_2523_ = i_2518_ + i_2522_;
									int i_2524_ = ((i_2518_ & 0xff00ff) + (i_2522_ & 0xff00ff));
									i_2522_ = ((i_2524_ & 0x1000100) + (i_2523_ - i_2524_ & 0x10000));
									is[i_2411_++] = (i_2523_ - i_2522_ | i_2522_ - (i_2522_ >>> 8));
								} else
									i_2411_++;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2510_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 3) {
						int i_2525_ = i_2402_;
						for (int i_2526_ = -i_2397_; i_2526_ < 0; i_2526_++) {
							int i_2527_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2528_ = -i_2396_; i_2528_ < 0; i_2528_++) {
								byte i_2529_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2527_]);
								int i_2530_ = (i_2529_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2529_]) : 0);
								int i_2531_ = i_2530_ + i_2399_;
								int i_2532_ = ((i_2530_ & 0xff00ff) + (i_2399_ & 0xff00ff));
								int i_2533_ = ((i_2532_ & 0x1000100) + (i_2531_ - i_2532_ & 0x10000));
								i_2530_ = i_2531_ - i_2533_ | i_2533_ - (i_2533_ >>> 8);
								i_2533_ = is[i_2411_];
								i_2531_ = i_2530_ + i_2533_;
								i_2532_ = (i_2530_ & 0xff00ff) + (i_2533_ & 0xff00ff);
								i_2533_ = ((i_2532_ & 0x1000100) + (i_2531_ - i_2532_ & 0x10000));
								is[i_2411_++] = i_2531_ - i_2533_ | i_2533_ - (i_2533_ >>> 8);
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2525_;
							i_2411_ += i_2412_;
						}
					} else if (i_2398_ == 2) {
						int i_2534_ = i_2399_ >>> 24;
						int i_2535_ = 256 - i_2534_;
						int i_2536_ = (i_2399_ & 0xff00ff) * i_2535_ & ~0xff00ff;
						int i_2537_ = (i_2399_ & 0xff00) * i_2535_ & 0xff0000;
						i_2399_ = (i_2536_ | i_2537_) >>> 8;
						int i_2538_ = i_2402_;
						for (int i_2539_ = -i_2397_; i_2539_ < 0; i_2539_++) {
							int i_2540_ = ((i_2403_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2541_ = -i_2396_; i_2541_ < 0; i_2541_++) {
								int i_2542_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2402_ >> 16) + i_2540_]);
								if (i_2542_ != 0) {
									int i_2543_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2542_ & 0xff]);
									i_2536_ = ((i_2543_ & 0xff00ff) * i_2534_ & ~0xff00ff);
									i_2537_ = ((i_2543_ & 0xff00) * i_2534_ & 0xff0000);
									i_2543_ = (((i_2536_ | i_2537_) >>> 8) + i_2399_);
									int i_2544_ = is[i_2411_];
									int i_2545_ = i_2543_ + i_2544_;
									int i_2546_ = ((i_2543_ & 0xff00ff) + (i_2544_ & 0xff00ff));
									i_2544_ = ((i_2546_ & 0x1000100) + (i_2545_ - i_2546_ & 0x10000));
									is[i_2411_++] = (i_2545_ - i_2544_ | i_2544_ - (i_2544_ >>> 8));
								} else
									i_2411_++;
								i_2402_ += i_2407_;
							}
							i_2403_ += i_2408_;
							i_2402_ = i_2538_;
							i_2411_ += i_2412_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2593(int i, int i_2547_, int i_2548_, int i_2549_, int i_2550_, int i_2551_, int i_2552_, int i_2553_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2548_ > 0 && i_2549_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2554_ = 0;
				int i_2555_ = 0;
				int i_2556_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2557_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_2558_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_2559_ = (i_2557_ << 16) / i_2548_;
				int i_2560_ = (i_2558_ << 16) / i_2549_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_2561_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_2559_ - 1) / i_2559_);
					i += i_2561_;
					i_2554_ += (i_2561_ * i_2559_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_2562_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_2560_ - 1) / i_2560_);
					i_2547_ += i_2562_;
					i_2555_ += (i_2562_ * i_2560_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_2557_)
					i_2548_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_2554_ + i_2559_ - 1) / i_2559_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_2558_)
					i_2549_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_2555_ + i_2560_ - 1) / i_2560_;
				int i_2563_ = i + i_2547_ * i_2556_;
				int i_2564_ = i_2556_ - i_2548_;
				if (i_2547_ + i_2549_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2549_ -= (i_2547_ + i_2549_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2547_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2565_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2547_);
					i_2549_ -= i_2565_;
					i_2563_ += i_2565_ * i_2556_;
					i_2555_ += i_2560_ * i_2565_;
				}
				if (i + i_2548_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2566_ = (i + i_2548_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2548_ -= i_2566_;
					i_2564_ += i_2566_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2567_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2548_ -= i_2567_;
					i_2563_ += i_2567_;
					i_2554_ += i_2559_ * i_2567_;
					i_2564_ += i_2567_;
				}
				if (i_2552_ == 0) {
					if (i_2550_ == 1) {
						int i_2568_ = i_2554_;
						for (int i_2569_ = -i_2549_; i_2569_ < 0; i_2569_++) {
							int i_2570_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2571_ = -i_2548_; i_2571_ < 0; i_2571_++) {
								is[i_2563_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2570_]) & 0xff]);
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2568_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 0) {
						int i_2572_ = (i_2551_ & 0xff0000) >> 16;
						int i_2573_ = (i_2551_ & 0xff00) >> 8;
						int i_2574_ = i_2551_ & 0xff;
						int i_2575_ = i_2554_;
						for (int i_2576_ = -i_2549_; i_2576_ < 0; i_2576_++) {
							int i_2577_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2578_ = -i_2548_; i_2578_ < 0; i_2578_++) {
								int i_2579_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2577_]) & 0xff]);
								int i_2580_ = ((i_2579_ & 0xff0000) * i_2572_ & ~0xffffff);
								int i_2581_ = (i_2579_ & 0xff00) * i_2573_ & 0xff0000;
								int i_2582_ = (i_2579_ & 0xff) * i_2574_ & 0xff00;
								is[i_2563_++] = (i_2580_ | i_2581_ | i_2582_) >>> 8;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2575_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 3) {
						int i_2583_ = i_2554_;
						for (int i_2584_ = -i_2549_; i_2584_ < 0; i_2584_++) {
							int i_2585_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2586_ = -i_2548_; i_2586_ < 0; i_2586_++) {
								byte i_2587_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2585_]);
								int i_2588_ = (i_2587_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2587_]) : 0);
								int i_2589_ = i_2588_ + i_2551_;
								int i_2590_ = ((i_2588_ & 0xff00ff) + (i_2551_ & 0xff00ff));
								int i_2591_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
								is[i_2563_++] = i_2589_ - i_2591_ | i_2591_ - (i_2591_ >>> 8);
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2583_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 2) {
						int i_2592_ = i_2551_ >>> 24;
						int i_2593_ = 256 - i_2592_;
						int i_2594_ = (i_2551_ & 0xff00ff) * i_2593_ & ~0xff00ff;
						int i_2595_ = (i_2551_ & 0xff00) * i_2593_ & 0xff0000;
						i_2551_ = (i_2594_ | i_2595_) >>> 8;
						int i_2596_ = i_2554_;
						for (int i_2597_ = -i_2549_; i_2597_ < 0; i_2597_++) {
							int i_2598_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2599_ = -i_2548_; i_2599_ < 0; i_2599_++) {
								int i_2600_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2598_]) & 0xff]);
								i_2594_ = ((i_2600_ & 0xff00ff) * i_2592_ & ~0xff00ff);
								i_2595_ = (i_2600_ & 0xff00) * i_2592_ & 0xff0000;
								is[i_2563_++] = ((i_2594_ | i_2595_) >>> 8) + i_2551_;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2596_;
							i_2563_ += i_2564_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2552_ == 1) {
					if (i_2550_ == 1) {
						int i_2601_ = i_2554_;
						for (int i_2602_ = -i_2549_; i_2602_ < 0; i_2602_++) {
							int i_2603_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2604_ = -i_2548_; i_2604_ < 0; i_2604_++) {
								int i_2605_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2603_]);
								if (i_2605_ != 0)
									is[i_2563_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2605_ & 0xff]);
								else
									i_2563_++;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2601_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 0) {
						int i_2606_ = i_2554_;
						if ((i_2551_ & 0xffffff) == 16777215) {
							int i_2607_ = i_2551_ >>> 24;
							int i_2608_ = 256 - i_2607_;
							for (int i_2609_ = -i_2549_; i_2609_ < 0; i_2609_++) {
								int i_2610_ = ((i_2555_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2611_ = -i_2548_; i_2611_ < 0; i_2611_++) {
									int i_2612_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2610_]);
									if (i_2612_ != 0) {
										int i_2613_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2612_ & 0xff]);
										int i_2614_ = is[i_2563_];
										is[i_2563_++] = ((((i_2613_ & 0xff00ff) * i_2607_ + ((i_2614_ & 0xff00ff) * i_2608_)) & ~0xff00ff) + (((i_2613_ & 0xff00) * i_2607_ + ((i_2614_ & 0xff00) * i_2608_)) & 0xff0000)) >> 8;
									} else
										i_2563_++;
									i_2554_ += i_2559_;
								}
								i_2555_ += i_2560_;
								i_2554_ = i_2606_;
								i_2563_ += i_2564_;
							}
						} else {
							int i_2615_ = (i_2551_ & 0xff0000) >> 16;
							int i_2616_ = (i_2551_ & 0xff00) >> 8;
							int i_2617_ = i_2551_ & 0xff;
							int i_2618_ = i_2551_ >>> 24;
							int i_2619_ = 256 - i_2618_;
							for (int i_2620_ = -i_2549_; i_2620_ < 0; i_2620_++) {
								int i_2621_ = ((i_2555_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2622_ = -i_2548_; i_2622_ < 0; i_2622_++) {
									int i_2623_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2621_]);
									if (i_2623_ != 0) {
										int i_2624_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2623_ & 0xff]);
										if (i_2618_ != 255) {
											int i_2625_ = (((i_2624_ & 0xff0000) * i_2615_) & ~0xffffff);
											int i_2626_ = ((i_2624_ & 0xff00) * i_2616_ & 0xff0000);
											int i_2627_ = ((i_2624_ & 0xff) * i_2617_ & 0xff00);
											i_2624_ = (i_2625_ | i_2626_ | i_2627_) >>> 8;
											int i_2628_ = is[i_2563_];
											is[i_2563_++] = (((((i_2624_ & 0xff00ff) * i_2618_) + ((i_2628_ & 0xff00ff) * i_2619_)) & ~0xff00ff) + ((((i_2624_ & 0xff00) * i_2618_) + ((i_2628_ & 0xff00) * i_2619_)) & 0xff0000)) >> 8;
										} else {
											int i_2629_ = (((i_2624_ & 0xff0000) * i_2615_) & ~0xffffff);
											int i_2630_ = ((i_2624_ & 0xff00) * i_2616_ & 0xff0000);
											int i_2631_ = ((i_2624_ & 0xff) * i_2617_ & 0xff00);
											is[i_2563_++] = (i_2629_ | i_2630_ | i_2631_) >>> 8;
										}
									} else
										i_2563_++;
									i_2554_ += i_2559_;
								}
								i_2555_ += i_2560_;
								i_2554_ = i_2606_;
								i_2563_ += i_2564_;
							}
						}
					} else if (i_2550_ == 3) {
						int i_2632_ = i_2554_;
						int i_2633_ = i_2551_ >>> 24;
						int i_2634_ = 256 - i_2633_;
						for (int i_2635_ = -i_2549_; i_2635_ < 0; i_2635_++) {
							int i_2636_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2637_ = -i_2548_; i_2637_ < 0; i_2637_++) {
								byte i_2638_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2636_]);
								int i_2639_ = (i_2638_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2638_]) : 0);
								int i_2640_ = i_2639_ + i_2551_;
								int i_2641_ = ((i_2639_ & 0xff00ff) + (i_2551_ & 0xff00ff));
								int i_2642_ = ((i_2641_ & 0x1000100) + (i_2640_ - i_2641_ & 0x10000));
								i_2642_ = i_2640_ - i_2642_ | i_2642_ - (i_2642_ >>> 8);
								if (i_2639_ == 0 && i_2633_ != 255) {
									i_2639_ = i_2642_;
									i_2642_ = is[i_2563_];
									i_2642_ = ((((i_2639_ & 0xff00ff) * i_2633_ + (i_2642_ & 0xff00ff) * i_2634_) & ~0xff00ff) + (((i_2639_ & 0xff00) * i_2633_ + (i_2642_ & 0xff00) * i_2634_) & 0xff0000)) >> 8;
								}
								is[i_2563_++] = i_2642_;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2632_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 2) {
						int i_2643_ = i_2551_ >>> 24;
						int i_2644_ = 256 - i_2643_;
						int i_2645_ = (i_2551_ & 0xff00ff) * i_2644_ & ~0xff00ff;
						int i_2646_ = (i_2551_ & 0xff00) * i_2644_ & 0xff0000;
						i_2551_ = (i_2645_ | i_2646_) >>> 8;
						int i_2647_ = i_2554_;
						for (int i_2648_ = -i_2549_; i_2648_ < 0; i_2648_++) {
							int i_2649_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2650_ = -i_2548_; i_2650_ < 0; i_2650_++) {
								int i_2651_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2649_]);
								if (i_2651_ != 0) {
									int i_2652_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2651_ & 0xff]);
									i_2645_ = ((i_2652_ & 0xff00ff) * i_2643_ & ~0xff00ff);
									i_2646_ = ((i_2652_ & 0xff00) * i_2643_ & 0xff0000);
									is[i_2563_++] = ((i_2645_ | i_2646_) >>> 8) + i_2551_;
								} else
									i_2563_++;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2647_;
							i_2563_ += i_2564_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2552_ == 2) {
					if (i_2550_ == 1) {
						int i_2653_ = i_2554_;
						for (int i_2654_ = -i_2549_; i_2654_ < 0; i_2654_++) {
							int i_2655_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2656_ = -i_2548_; i_2656_ < 0; i_2656_++) {
								int i_2657_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2655_]);
								if (i_2657_ != 0) {
									int i_2658_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2657_ & 0xff]);
									int i_2659_ = is[i_2563_];
									int i_2660_ = i_2658_ + i_2659_;
									int i_2661_ = ((i_2658_ & 0xff00ff) + (i_2659_ & 0xff00ff));
									i_2659_ = ((i_2661_ & 0x1000100) + (i_2660_ - i_2661_ & 0x10000));
									is[i_2563_++] = (i_2660_ - i_2659_ | i_2659_ - (i_2659_ >>> 8));
								} else
									i_2563_++;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2653_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 0) {
						int i_2662_ = i_2554_;
						int i_2663_ = (i_2551_ & 0xff0000) >> 16;
						int i_2664_ = (i_2551_ & 0xff00) >> 8;
						int i_2665_ = i_2551_ & 0xff;
						for (int i_2666_ = -i_2549_; i_2666_ < 0; i_2666_++) {
							int i_2667_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2668_ = -i_2548_; i_2668_ < 0; i_2668_++) {
								int i_2669_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2667_]);
								if (i_2669_ != 0) {
									int i_2670_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2669_ & 0xff]);
									int i_2671_ = ((i_2670_ & 0xff0000) * i_2663_ & ~0xffffff);
									int i_2672_ = ((i_2670_ & 0xff00) * i_2664_ & 0xff0000);
									int i_2673_ = (i_2670_ & 0xff) * i_2665_ & 0xff00;
									i_2670_ = (i_2671_ | i_2672_ | i_2673_) >>> 8;
									int i_2674_ = is[i_2563_];
									int i_2675_ = i_2670_ + i_2674_;
									int i_2676_ = ((i_2670_ & 0xff00ff) + (i_2674_ & 0xff00ff));
									i_2674_ = ((i_2676_ & 0x1000100) + (i_2675_ - i_2676_ & 0x10000));
									is[i_2563_++] = (i_2675_ - i_2674_ | i_2674_ - (i_2674_ >>> 8));
								} else
									i_2563_++;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2662_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 3) {
						int i_2677_ = i_2554_;
						for (int i_2678_ = -i_2549_; i_2678_ < 0; i_2678_++) {
							int i_2679_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2680_ = -i_2548_; i_2680_ < 0; i_2680_++) {
								byte i_2681_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2679_]);
								int i_2682_ = (i_2681_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2681_]) : 0);
								int i_2683_ = i_2682_ + i_2551_;
								int i_2684_ = ((i_2682_ & 0xff00ff) + (i_2551_ & 0xff00ff));
								int i_2685_ = ((i_2684_ & 0x1000100) + (i_2683_ - i_2684_ & 0x10000));
								i_2682_ = i_2683_ - i_2685_ | i_2685_ - (i_2685_ >>> 8);
								i_2685_ = is[i_2563_];
								i_2683_ = i_2682_ + i_2685_;
								i_2684_ = (i_2682_ & 0xff00ff) + (i_2685_ & 0xff00ff);
								i_2685_ = ((i_2684_ & 0x1000100) + (i_2683_ - i_2684_ & 0x10000));
								is[i_2563_++] = i_2683_ - i_2685_ | i_2685_ - (i_2685_ >>> 8);
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2677_;
							i_2563_ += i_2564_;
						}
					} else if (i_2550_ == 2) {
						int i_2686_ = i_2551_ >>> 24;
						int i_2687_ = 256 - i_2686_;
						int i_2688_ = (i_2551_ & 0xff00ff) * i_2687_ & ~0xff00ff;
						int i_2689_ = (i_2551_ & 0xff00) * i_2687_ & 0xff0000;
						i_2551_ = (i_2688_ | i_2689_) >>> 8;
						int i_2690_ = i_2554_;
						for (int i_2691_ = -i_2549_; i_2691_ < 0; i_2691_++) {
							int i_2692_ = ((i_2555_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2693_ = -i_2548_; i_2693_ < 0; i_2693_++) {
								int i_2694_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2554_ >> 16) + i_2692_]);
								if (i_2694_ != 0) {
									int i_2695_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2694_ & 0xff]);
									i_2688_ = ((i_2695_ & 0xff00ff) * i_2686_ & ~0xff00ff);
									i_2689_ = ((i_2695_ & 0xff00) * i_2686_ & 0xff0000);
									i_2695_ = (((i_2688_ | i_2689_) >>> 8) + i_2551_);
									int i_2696_ = is[i_2563_];
									int i_2697_ = i_2695_ + i_2696_;
									int i_2698_ = ((i_2695_ & 0xff00ff) + (i_2696_ & 0xff00ff));
									i_2696_ = ((i_2698_ & 0x1000100) + (i_2697_ - i_2698_ & 0x10000));
									is[i_2563_++] = (i_2697_ - i_2696_ | i_2696_ - (i_2696_ >>> 8));
								} else
									i_2563_++;
								i_2554_ += i_2559_;
							}
							i_2555_ += i_2560_;
							i_2554_ = i_2690_;
							i_2563_ += i_2564_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2624(int i, int i_2699_, int i_2700_, int i_2701_, int i_2702_, int i_2703_, int i_2704_, int i_2705_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2700_ > 0 && i_2701_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2706_ = 0;
				int i_2707_ = 0;
				int i_2708_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2709_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_2710_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_2711_ = (i_2709_ << 16) / i_2700_;
				int i_2712_ = (i_2710_ << 16) / i_2701_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_2713_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_2711_ - 1) / i_2711_);
					i += i_2713_;
					i_2706_ += (i_2713_ * i_2711_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_2714_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_2712_ - 1) / i_2712_);
					i_2699_ += i_2714_;
					i_2707_ += (i_2714_ * i_2712_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_2709_)
					i_2700_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_2706_ + i_2711_ - 1) / i_2711_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_2710_)
					i_2701_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_2707_ + i_2712_ - 1) / i_2712_;
				int i_2715_ = i + i_2699_ * i_2708_;
				int i_2716_ = i_2708_ - i_2700_;
				if (i_2699_ + i_2701_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2701_ -= (i_2699_ + i_2701_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2699_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2717_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2699_);
					i_2701_ -= i_2717_;
					i_2715_ += i_2717_ * i_2708_;
					i_2707_ += i_2712_ * i_2717_;
				}
				if (i + i_2700_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2718_ = (i + i_2700_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2700_ -= i_2718_;
					i_2716_ += i_2718_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2719_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2700_ -= i_2719_;
					i_2715_ += i_2719_;
					i_2706_ += i_2711_ * i_2719_;
					i_2716_ += i_2719_;
				}
				if (i_2704_ == 0) {
					if (i_2702_ == 1) {
						int i_2720_ = i_2706_;
						for (int i_2721_ = -i_2701_; i_2721_ < 0; i_2721_++) {
							int i_2722_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2723_ = -i_2700_; i_2723_ < 0; i_2723_++) {
								is[i_2715_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2722_]) & 0xff]);
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2720_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 0) {
						int i_2724_ = (i_2703_ & 0xff0000) >> 16;
						int i_2725_ = (i_2703_ & 0xff00) >> 8;
						int i_2726_ = i_2703_ & 0xff;
						int i_2727_ = i_2706_;
						for (int i_2728_ = -i_2701_; i_2728_ < 0; i_2728_++) {
							int i_2729_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2730_ = -i_2700_; i_2730_ < 0; i_2730_++) {
								int i_2731_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2729_]) & 0xff]);
								int i_2732_ = ((i_2731_ & 0xff0000) * i_2724_ & ~0xffffff);
								int i_2733_ = (i_2731_ & 0xff00) * i_2725_ & 0xff0000;
								int i_2734_ = (i_2731_ & 0xff) * i_2726_ & 0xff00;
								is[i_2715_++] = (i_2732_ | i_2733_ | i_2734_) >>> 8;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2727_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 3) {
						int i_2735_ = i_2706_;
						for (int i_2736_ = -i_2701_; i_2736_ < 0; i_2736_++) {
							int i_2737_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2738_ = -i_2700_; i_2738_ < 0; i_2738_++) {
								byte i_2739_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2737_]);
								int i_2740_ = (i_2739_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2739_]) : 0);
								int i_2741_ = i_2740_ + i_2703_;
								int i_2742_ = ((i_2740_ & 0xff00ff) + (i_2703_ & 0xff00ff));
								int i_2743_ = ((i_2742_ & 0x1000100) + (i_2741_ - i_2742_ & 0x10000));
								is[i_2715_++] = i_2741_ - i_2743_ | i_2743_ - (i_2743_ >>> 8);
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2735_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 2) {
						int i_2744_ = i_2703_ >>> 24;
						int i_2745_ = 256 - i_2744_;
						int i_2746_ = (i_2703_ & 0xff00ff) * i_2745_ & ~0xff00ff;
						int i_2747_ = (i_2703_ & 0xff00) * i_2745_ & 0xff0000;
						i_2703_ = (i_2746_ | i_2747_) >>> 8;
						int i_2748_ = i_2706_;
						for (int i_2749_ = -i_2701_; i_2749_ < 0; i_2749_++) {
							int i_2750_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2751_ = -i_2700_; i_2751_ < 0; i_2751_++) {
								int i_2752_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2750_]) & 0xff]);
								i_2746_ = ((i_2752_ & 0xff00ff) * i_2744_ & ~0xff00ff);
								i_2747_ = (i_2752_ & 0xff00) * i_2744_ & 0xff0000;
								is[i_2715_++] = ((i_2746_ | i_2747_) >>> 8) + i_2703_;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2748_;
							i_2715_ += i_2716_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2704_ == 1) {
					if (i_2702_ == 1) {
						int i_2753_ = i_2706_;
						for (int i_2754_ = -i_2701_; i_2754_ < 0; i_2754_++) {
							int i_2755_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2756_ = -i_2700_; i_2756_ < 0; i_2756_++) {
								int i_2757_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2755_]);
								if (i_2757_ != 0)
									is[i_2715_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2757_ & 0xff]);
								else
									i_2715_++;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2753_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 0) {
						int i_2758_ = i_2706_;
						if ((i_2703_ & 0xffffff) == 16777215) {
							int i_2759_ = i_2703_ >>> 24;
							int i_2760_ = 256 - i_2759_;
							for (int i_2761_ = -i_2701_; i_2761_ < 0; i_2761_++) {
								int i_2762_ = ((i_2707_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2763_ = -i_2700_; i_2763_ < 0; i_2763_++) {
									int i_2764_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2762_]);
									if (i_2764_ != 0) {
										int i_2765_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2764_ & 0xff]);
										int i_2766_ = is[i_2715_];
										is[i_2715_++] = ((((i_2765_ & 0xff00ff) * i_2759_ + ((i_2766_ & 0xff00ff) * i_2760_)) & ~0xff00ff) + (((i_2765_ & 0xff00) * i_2759_ + ((i_2766_ & 0xff00) * i_2760_)) & 0xff0000)) >> 8;
									} else
										i_2715_++;
									i_2706_ += i_2711_;
								}
								i_2707_ += i_2712_;
								i_2706_ = i_2758_;
								i_2715_ += i_2716_;
							}
						} else {
							int i_2767_ = (i_2703_ & 0xff0000) >> 16;
							int i_2768_ = (i_2703_ & 0xff00) >> 8;
							int i_2769_ = i_2703_ & 0xff;
							int i_2770_ = i_2703_ >>> 24;
							int i_2771_ = 256 - i_2770_;
							for (int i_2772_ = -i_2701_; i_2772_ < 0; i_2772_++) {
								int i_2773_ = ((i_2707_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2774_ = -i_2700_; i_2774_ < 0; i_2774_++) {
									int i_2775_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2773_]);
									if (i_2775_ != 0) {
										int i_2776_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2775_ & 0xff]);
										if (i_2770_ != 255) {
											int i_2777_ = (((i_2776_ & 0xff0000) * i_2767_) & ~0xffffff);
											int i_2778_ = ((i_2776_ & 0xff00) * i_2768_ & 0xff0000);
											int i_2779_ = ((i_2776_ & 0xff) * i_2769_ & 0xff00);
											i_2776_ = (i_2777_ | i_2778_ | i_2779_) >>> 8;
											int i_2780_ = is[i_2715_];
											is[i_2715_++] = (((((i_2776_ & 0xff00ff) * i_2770_) + ((i_2780_ & 0xff00ff) * i_2771_)) & ~0xff00ff) + ((((i_2776_ & 0xff00) * i_2770_) + ((i_2780_ & 0xff00) * i_2771_)) & 0xff0000)) >> 8;
										} else {
											int i_2781_ = (((i_2776_ & 0xff0000) * i_2767_) & ~0xffffff);
											int i_2782_ = ((i_2776_ & 0xff00) * i_2768_ & 0xff0000);
											int i_2783_ = ((i_2776_ & 0xff) * i_2769_ & 0xff00);
											is[i_2715_++] = (i_2781_ | i_2782_ | i_2783_) >>> 8;
										}
									} else
										i_2715_++;
									i_2706_ += i_2711_;
								}
								i_2707_ += i_2712_;
								i_2706_ = i_2758_;
								i_2715_ += i_2716_;
							}
						}
					} else if (i_2702_ == 3) {
						int i_2784_ = i_2706_;
						int i_2785_ = i_2703_ >>> 24;
						int i_2786_ = 256 - i_2785_;
						for (int i_2787_ = -i_2701_; i_2787_ < 0; i_2787_++) {
							int i_2788_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2789_ = -i_2700_; i_2789_ < 0; i_2789_++) {
								byte i_2790_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2788_]);
								int i_2791_ = (i_2790_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2790_]) : 0);
								int i_2792_ = i_2791_ + i_2703_;
								int i_2793_ = ((i_2791_ & 0xff00ff) + (i_2703_ & 0xff00ff));
								int i_2794_ = ((i_2793_ & 0x1000100) + (i_2792_ - i_2793_ & 0x10000));
								i_2794_ = i_2792_ - i_2794_ | i_2794_ - (i_2794_ >>> 8);
								if (i_2791_ == 0 && i_2785_ != 255) {
									i_2791_ = i_2794_;
									i_2794_ = is[i_2715_];
									i_2794_ = ((((i_2791_ & 0xff00ff) * i_2785_ + (i_2794_ & 0xff00ff) * i_2786_) & ~0xff00ff) + (((i_2791_ & 0xff00) * i_2785_ + (i_2794_ & 0xff00) * i_2786_) & 0xff0000)) >> 8;
								}
								is[i_2715_++] = i_2794_;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2784_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 2) {
						int i_2795_ = i_2703_ >>> 24;
						int i_2796_ = 256 - i_2795_;
						int i_2797_ = (i_2703_ & 0xff00ff) * i_2796_ & ~0xff00ff;
						int i_2798_ = (i_2703_ & 0xff00) * i_2796_ & 0xff0000;
						i_2703_ = (i_2797_ | i_2798_) >>> 8;
						int i_2799_ = i_2706_;
						for (int i_2800_ = -i_2701_; i_2800_ < 0; i_2800_++) {
							int i_2801_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2802_ = -i_2700_; i_2802_ < 0; i_2802_++) {
								int i_2803_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2801_]);
								if (i_2803_ != 0) {
									int i_2804_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2803_ & 0xff]);
									i_2797_ = ((i_2804_ & 0xff00ff) * i_2795_ & ~0xff00ff);
									i_2798_ = ((i_2804_ & 0xff00) * i_2795_ & 0xff0000);
									is[i_2715_++] = ((i_2797_ | i_2798_) >>> 8) + i_2703_;
								} else
									i_2715_++;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2799_;
							i_2715_ += i_2716_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2704_ == 2) {
					if (i_2702_ == 1) {
						int i_2805_ = i_2706_;
						for (int i_2806_ = -i_2701_; i_2806_ < 0; i_2806_++) {
							int i_2807_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2808_ = -i_2700_; i_2808_ < 0; i_2808_++) {
								int i_2809_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2807_]);
								if (i_2809_ != 0) {
									int i_2810_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2809_ & 0xff]);
									int i_2811_ = is[i_2715_];
									int i_2812_ = i_2810_ + i_2811_;
									int i_2813_ = ((i_2810_ & 0xff00ff) + (i_2811_ & 0xff00ff));
									i_2811_ = ((i_2813_ & 0x1000100) + (i_2812_ - i_2813_ & 0x10000));
									is[i_2715_++] = (i_2812_ - i_2811_ | i_2811_ - (i_2811_ >>> 8));
								} else
									i_2715_++;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2805_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 0) {
						int i_2814_ = i_2706_;
						int i_2815_ = (i_2703_ & 0xff0000) >> 16;
						int i_2816_ = (i_2703_ & 0xff00) >> 8;
						int i_2817_ = i_2703_ & 0xff;
						for (int i_2818_ = -i_2701_; i_2818_ < 0; i_2818_++) {
							int i_2819_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2820_ = -i_2700_; i_2820_ < 0; i_2820_++) {
								int i_2821_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2819_]);
								if (i_2821_ != 0) {
									int i_2822_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2821_ & 0xff]);
									int i_2823_ = ((i_2822_ & 0xff0000) * i_2815_ & ~0xffffff);
									int i_2824_ = ((i_2822_ & 0xff00) * i_2816_ & 0xff0000);
									int i_2825_ = (i_2822_ & 0xff) * i_2817_ & 0xff00;
									i_2822_ = (i_2823_ | i_2824_ | i_2825_) >>> 8;
									int i_2826_ = is[i_2715_];
									int i_2827_ = i_2822_ + i_2826_;
									int i_2828_ = ((i_2822_ & 0xff00ff) + (i_2826_ & 0xff00ff));
									i_2826_ = ((i_2828_ & 0x1000100) + (i_2827_ - i_2828_ & 0x10000));
									is[i_2715_++] = (i_2827_ - i_2826_ | i_2826_ - (i_2826_ >>> 8));
								} else
									i_2715_++;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2814_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 3) {
						int i_2829_ = i_2706_;
						for (int i_2830_ = -i_2701_; i_2830_ < 0; i_2830_++) {
							int i_2831_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2832_ = -i_2700_; i_2832_ < 0; i_2832_++) {
								byte i_2833_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2831_]);
								int i_2834_ = (i_2833_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2833_]) : 0);
								int i_2835_ = i_2834_ + i_2703_;
								int i_2836_ = ((i_2834_ & 0xff00ff) + (i_2703_ & 0xff00ff));
								int i_2837_ = ((i_2836_ & 0x1000100) + (i_2835_ - i_2836_ & 0x10000));
								i_2834_ = i_2835_ - i_2837_ | i_2837_ - (i_2837_ >>> 8);
								i_2837_ = is[i_2715_];
								i_2835_ = i_2834_ + i_2837_;
								i_2836_ = (i_2834_ & 0xff00ff) + (i_2837_ & 0xff00ff);
								i_2837_ = ((i_2836_ & 0x1000100) + (i_2835_ - i_2836_ & 0x10000));
								is[i_2715_++] = i_2835_ - i_2837_ | i_2837_ - (i_2837_ >>> 8);
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2829_;
							i_2715_ += i_2716_;
						}
					} else if (i_2702_ == 2) {
						int i_2838_ = i_2703_ >>> 24;
						int i_2839_ = 256 - i_2838_;
						int i_2840_ = (i_2703_ & 0xff00ff) * i_2839_ & ~0xff00ff;
						int i_2841_ = (i_2703_ & 0xff00) * i_2839_ & 0xff0000;
						i_2703_ = (i_2840_ | i_2841_) >>> 8;
						int i_2842_ = i_2706_;
						for (int i_2843_ = -i_2701_; i_2843_ < 0; i_2843_++) {
							int i_2844_ = ((i_2707_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2845_ = -i_2700_; i_2845_ < 0; i_2845_++) {
								int i_2846_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2706_ >> 16) + i_2844_]);
								if (i_2846_ != 0) {
									int i_2847_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2846_ & 0xff]);
									i_2840_ = ((i_2847_ & 0xff00ff) * i_2838_ & ~0xff00ff);
									i_2841_ = ((i_2847_ & 0xff00) * i_2838_ & 0xff0000);
									i_2847_ = (((i_2840_ | i_2841_) >>> 8) + i_2703_);
									int i_2848_ = is[i_2715_];
									int i_2849_ = i_2847_ + i_2848_;
									int i_2850_ = ((i_2847_ & 0xff00ff) + (i_2848_ & 0xff00ff));
									i_2848_ = ((i_2850_ & 0x1000100) + (i_2849_ - i_2850_ & 0x10000));
									is[i_2715_++] = (i_2849_ - i_2848_ | i_2848_ - (i_2848_ >>> 8));
								} else
									i_2715_++;
								i_2706_ += i_2711_;
							}
							i_2707_ += i_2712_;
							i_2706_ = i_2842_;
							i_2715_ += i_2716_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2625(int i, int i_2851_, int i_2852_, int i_2853_, int i_2854_, int i_2855_, int i_2856_, int i_2857_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_2852_ > 0 && i_2853_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_2858_ = 0;
				int i_2859_ = 0;
				int i_2860_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_2861_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_2862_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_2863_ = (i_2861_ << 16) / i_2852_;
				int i_2864_ = (i_2862_ << 16) / i_2853_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_2865_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_2863_ - 1) / i_2863_);
					i += i_2865_;
					i_2858_ += (i_2865_ * i_2863_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_2866_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_2864_ - 1) / i_2864_);
					i_2851_ += i_2866_;
					i_2859_ += (i_2866_ * i_2864_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_2861_)
					i_2852_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_2858_ + i_2863_ - 1) / i_2863_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_2862_)
					i_2853_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_2859_ + i_2864_ - 1) / i_2864_;
				int i_2867_ = i + i_2851_ * i_2860_;
				int i_2868_ = i_2860_ - i_2852_;
				if (i_2851_ + i_2853_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_2853_ -= (i_2851_ + i_2853_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_2851_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_2869_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_2851_);
					i_2853_ -= i_2869_;
					i_2867_ += i_2869_ * i_2860_;
					i_2859_ += i_2864_ * i_2869_;
				}
				if (i + i_2852_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_2870_ = (i + i_2852_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_2852_ -= i_2870_;
					i_2868_ += i_2870_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_2871_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_2852_ -= i_2871_;
					i_2867_ += i_2871_;
					i_2858_ += i_2863_ * i_2871_;
					i_2868_ += i_2871_;
				}
				if (i_2856_ == 0) {
					if (i_2854_ == 1) {
						int i_2872_ = i_2858_;
						for (int i_2873_ = -i_2853_; i_2873_ < 0; i_2873_++) {
							int i_2874_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2875_ = -i_2852_; i_2875_ < 0; i_2875_++) {
								is[i_2867_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2874_]) & 0xff]);
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2872_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 0) {
						int i_2876_ = (i_2855_ & 0xff0000) >> 16;
						int i_2877_ = (i_2855_ & 0xff00) >> 8;
						int i_2878_ = i_2855_ & 0xff;
						int i_2879_ = i_2858_;
						for (int i_2880_ = -i_2853_; i_2880_ < 0; i_2880_++) {
							int i_2881_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2882_ = -i_2852_; i_2882_ < 0; i_2882_++) {
								int i_2883_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2881_]) & 0xff]);
								int i_2884_ = ((i_2883_ & 0xff0000) * i_2876_ & ~0xffffff);
								int i_2885_ = (i_2883_ & 0xff00) * i_2877_ & 0xff0000;
								int i_2886_ = (i_2883_ & 0xff) * i_2878_ & 0xff00;
								is[i_2867_++] = (i_2884_ | i_2885_ | i_2886_) >>> 8;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2879_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 3) {
						int i_2887_ = i_2858_;
						for (int i_2888_ = -i_2853_; i_2888_ < 0; i_2888_++) {
							int i_2889_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2890_ = -i_2852_; i_2890_ < 0; i_2890_++) {
								byte i_2891_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2889_]);
								int i_2892_ = (i_2891_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2891_]) : 0);
								int i_2893_ = i_2892_ + i_2855_;
								int i_2894_ = ((i_2892_ & 0xff00ff) + (i_2855_ & 0xff00ff));
								int i_2895_ = ((i_2894_ & 0x1000100) + (i_2893_ - i_2894_ & 0x10000));
								is[i_2867_++] = i_2893_ - i_2895_ | i_2895_ - (i_2895_ >>> 8);
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2887_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 2) {
						int i_2896_ = i_2855_ >>> 24;
						int i_2897_ = 256 - i_2896_;
						int i_2898_ = (i_2855_ & 0xff00ff) * i_2897_ & ~0xff00ff;
						int i_2899_ = (i_2855_ & 0xff00) * i_2897_ & 0xff0000;
						i_2855_ = (i_2898_ | i_2899_) >>> 8;
						int i_2900_ = i_2858_;
						for (int i_2901_ = -i_2853_; i_2901_ < 0; i_2901_++) {
							int i_2902_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2903_ = -i_2852_; i_2903_ < 0; i_2903_++) {
								int i_2904_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2902_]) & 0xff]);
								i_2898_ = ((i_2904_ & 0xff00ff) * i_2896_ & ~0xff00ff);
								i_2899_ = (i_2904_ & 0xff00) * i_2896_ & 0xff0000;
								is[i_2867_++] = ((i_2898_ | i_2899_) >>> 8) + i_2855_;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2900_;
							i_2867_ += i_2868_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2856_ == 1) {
					if (i_2854_ == 1) {
						int i_2905_ = i_2858_;
						for (int i_2906_ = -i_2853_; i_2906_ < 0; i_2906_++) {
							int i_2907_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2908_ = -i_2852_; i_2908_ < 0; i_2908_++) {
								int i_2909_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2907_]);
								if (i_2909_ != 0)
									is[i_2867_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2909_ & 0xff]);
								else
									i_2867_++;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2905_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 0) {
						int i_2910_ = i_2858_;
						if ((i_2855_ & 0xffffff) == 16777215) {
							int i_2911_ = i_2855_ >>> 24;
							int i_2912_ = 256 - i_2911_;
							for (int i_2913_ = -i_2853_; i_2913_ < 0; i_2913_++) {
								int i_2914_ = ((i_2859_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2915_ = -i_2852_; i_2915_ < 0; i_2915_++) {
									int i_2916_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2914_]);
									if (i_2916_ != 0) {
										int i_2917_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2916_ & 0xff]);
										int i_2918_ = is[i_2867_];
										is[i_2867_++] = ((((i_2917_ & 0xff00ff) * i_2911_ + ((i_2918_ & 0xff00ff) * i_2912_)) & ~0xff00ff) + (((i_2917_ & 0xff00) * i_2911_ + ((i_2918_ & 0xff00) * i_2912_)) & 0xff0000)) >> 8;
									} else
										i_2867_++;
									i_2858_ += i_2863_;
								}
								i_2859_ += i_2864_;
								i_2858_ = i_2910_;
								i_2867_ += i_2868_;
							}
						} else {
							int i_2919_ = (i_2855_ & 0xff0000) >> 16;
							int i_2920_ = (i_2855_ & 0xff00) >> 8;
							int i_2921_ = i_2855_ & 0xff;
							int i_2922_ = i_2855_ >>> 24;
							int i_2923_ = 256 - i_2922_;
							for (int i_2924_ = -i_2853_; i_2924_ < 0; i_2924_++) {
								int i_2925_ = ((i_2859_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_2926_ = -i_2852_; i_2926_ < 0; i_2926_++) {
									int i_2927_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2925_]);
									if (i_2927_ != 0) {
										int i_2928_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2927_ & 0xff]);
										if (i_2922_ != 255) {
											int i_2929_ = (((i_2928_ & 0xff0000) * i_2919_) & ~0xffffff);
											int i_2930_ = ((i_2928_ & 0xff00) * i_2920_ & 0xff0000);
											int i_2931_ = ((i_2928_ & 0xff) * i_2921_ & 0xff00);
											i_2928_ = (i_2929_ | i_2930_ | i_2931_) >>> 8;
											int i_2932_ = is[i_2867_];
											is[i_2867_++] = (((((i_2928_ & 0xff00ff) * i_2922_) + ((i_2932_ & 0xff00ff) * i_2923_)) & ~0xff00ff) + ((((i_2928_ & 0xff00) * i_2922_) + ((i_2932_ & 0xff00) * i_2923_)) & 0xff0000)) >> 8;
										} else {
											int i_2933_ = (((i_2928_ & 0xff0000) * i_2919_) & ~0xffffff);
											int i_2934_ = ((i_2928_ & 0xff00) * i_2920_ & 0xff0000);
											int i_2935_ = ((i_2928_ & 0xff) * i_2921_ & 0xff00);
											is[i_2867_++] = (i_2933_ | i_2934_ | i_2935_) >>> 8;
										}
									} else
										i_2867_++;
									i_2858_ += i_2863_;
								}
								i_2859_ += i_2864_;
								i_2858_ = i_2910_;
								i_2867_ += i_2868_;
							}
						}
					} else if (i_2854_ == 3) {
						int i_2936_ = i_2858_;
						int i_2937_ = i_2855_ >>> 24;
						int i_2938_ = 256 - i_2937_;
						for (int i_2939_ = -i_2853_; i_2939_ < 0; i_2939_++) {
							int i_2940_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2941_ = -i_2852_; i_2941_ < 0; i_2941_++) {
								byte i_2942_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2940_]);
								int i_2943_ = (i_2942_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2942_]) : 0);
								int i_2944_ = i_2943_ + i_2855_;
								int i_2945_ = ((i_2943_ & 0xff00ff) + (i_2855_ & 0xff00ff));
								int i_2946_ = ((i_2945_ & 0x1000100) + (i_2944_ - i_2945_ & 0x10000));
								i_2946_ = i_2944_ - i_2946_ | i_2946_ - (i_2946_ >>> 8);
								if (i_2943_ == 0 && i_2937_ != 255) {
									i_2943_ = i_2946_;
									i_2946_ = is[i_2867_];
									i_2946_ = ((((i_2943_ & 0xff00ff) * i_2937_ + (i_2946_ & 0xff00ff) * i_2938_) & ~0xff00ff) + (((i_2943_ & 0xff00) * i_2937_ + (i_2946_ & 0xff00) * i_2938_) & 0xff0000)) >> 8;
								}
								is[i_2867_++] = i_2946_;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2936_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 2) {
						int i_2947_ = i_2855_ >>> 24;
						int i_2948_ = 256 - i_2947_;
						int i_2949_ = (i_2855_ & 0xff00ff) * i_2948_ & ~0xff00ff;
						int i_2950_ = (i_2855_ & 0xff00) * i_2948_ & 0xff0000;
						i_2855_ = (i_2949_ | i_2950_) >>> 8;
						int i_2951_ = i_2858_;
						for (int i_2952_ = -i_2853_; i_2952_ < 0; i_2952_++) {
							int i_2953_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2954_ = -i_2852_; i_2954_ < 0; i_2954_++) {
								int i_2955_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2953_]);
								if (i_2955_ != 0) {
									int i_2956_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2955_ & 0xff]);
									i_2949_ = ((i_2956_ & 0xff00ff) * i_2947_ & ~0xff00ff);
									i_2950_ = ((i_2956_ & 0xff00) * i_2947_ & 0xff0000);
									is[i_2867_++] = ((i_2949_ | i_2950_) >>> 8) + i_2855_;
								} else
									i_2867_++;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2951_;
							i_2867_ += i_2868_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2856_ == 2) {
					if (i_2854_ == 1) {
						int i_2957_ = i_2858_;
						for (int i_2958_ = -i_2853_; i_2958_ < 0; i_2958_++) {
							int i_2959_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2960_ = -i_2852_; i_2960_ < 0; i_2960_++) {
								int i_2961_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2959_]);
								if (i_2961_ != 0) {
									int i_2962_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2961_ & 0xff]);
									int i_2963_ = is[i_2867_];
									int i_2964_ = i_2962_ + i_2963_;
									int i_2965_ = ((i_2962_ & 0xff00ff) + (i_2963_ & 0xff00ff));
									i_2963_ = ((i_2965_ & 0x1000100) + (i_2964_ - i_2965_ & 0x10000));
									is[i_2867_++] = (i_2964_ - i_2963_ | i_2963_ - (i_2963_ >>> 8));
								} else
									i_2867_++;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2957_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 0) {
						int i_2966_ = i_2858_;
						int i_2967_ = (i_2855_ & 0xff0000) >> 16;
						int i_2968_ = (i_2855_ & 0xff00) >> 8;
						int i_2969_ = i_2855_ & 0xff;
						for (int i_2970_ = -i_2853_; i_2970_ < 0; i_2970_++) {
							int i_2971_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2972_ = -i_2852_; i_2972_ < 0; i_2972_++) {
								int i_2973_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2971_]);
								if (i_2973_ != 0) {
									int i_2974_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2973_ & 0xff]);
									int i_2975_ = ((i_2974_ & 0xff0000) * i_2967_ & ~0xffffff);
									int i_2976_ = ((i_2974_ & 0xff00) * i_2968_ & 0xff0000);
									int i_2977_ = (i_2974_ & 0xff) * i_2969_ & 0xff00;
									i_2974_ = (i_2975_ | i_2976_ | i_2977_) >>> 8;
									int i_2978_ = is[i_2867_];
									int i_2979_ = i_2974_ + i_2978_;
									int i_2980_ = ((i_2974_ & 0xff00ff) + (i_2978_ & 0xff00ff));
									i_2978_ = ((i_2980_ & 0x1000100) + (i_2979_ - i_2980_ & 0x10000));
									is[i_2867_++] = (i_2979_ - i_2978_ | i_2978_ - (i_2978_ >>> 8));
								} else
									i_2867_++;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2966_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 3) {
						int i_2981_ = i_2858_;
						for (int i_2982_ = -i_2853_; i_2982_ < 0; i_2982_++) {
							int i_2983_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2984_ = -i_2852_; i_2984_ < 0; i_2984_++) {
								byte i_2985_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2983_]);
								int i_2986_ = (i_2985_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_2985_]) : 0);
								int i_2987_ = i_2986_ + i_2855_;
								int i_2988_ = ((i_2986_ & 0xff00ff) + (i_2855_ & 0xff00ff));
								int i_2989_ = ((i_2988_ & 0x1000100) + (i_2987_ - i_2988_ & 0x10000));
								i_2986_ = i_2987_ - i_2989_ | i_2989_ - (i_2989_ >>> 8);
								i_2989_ = is[i_2867_];
								i_2987_ = i_2986_ + i_2989_;
								i_2988_ = (i_2986_ & 0xff00ff) + (i_2989_ & 0xff00ff);
								i_2989_ = ((i_2988_ & 0x1000100) + (i_2987_ - i_2988_ & 0x10000));
								is[i_2867_++] = i_2987_ - i_2989_ | i_2989_ - (i_2989_ >>> 8);
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2981_;
							i_2867_ += i_2868_;
						}
					} else if (i_2854_ == 2) {
						int i_2990_ = i_2855_ >>> 24;
						int i_2991_ = 256 - i_2990_;
						int i_2992_ = (i_2855_ & 0xff00ff) * i_2991_ & ~0xff00ff;
						int i_2993_ = (i_2855_ & 0xff00) * i_2991_ & 0xff0000;
						i_2855_ = (i_2992_ | i_2993_) >>> 8;
						int i_2994_ = i_2858_;
						for (int i_2995_ = -i_2853_; i_2995_ < 0; i_2995_++) {
							int i_2996_ = ((i_2859_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_2997_ = -i_2852_; i_2997_ < 0; i_2997_++) {
								int i_2998_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_2858_ >> 16) + i_2996_]);
								if (i_2998_ != 0) {
									int i_2999_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_2998_ & 0xff]);
									i_2992_ = ((i_2999_ & 0xff00ff) * i_2990_ & ~0xff00ff);
									i_2993_ = ((i_2999_ & 0xff00) * i_2990_ & 0xff0000);
									i_2999_ = (((i_2992_ | i_2993_) >>> 8) + i_2855_);
									int i_3000_ = is[i_2867_];
									int i_3001_ = i_2999_ + i_3000_;
									int i_3002_ = ((i_2999_ & 0xff00ff) + (i_3000_ & 0xff00ff));
									i_3000_ = ((i_3002_ & 0x1000100) + (i_3001_ - i_3002_ & 0x10000));
									is[i_2867_++] = (i_3001_ - i_3000_ | i_3000_ - (i_3000_ >>> 8));
								} else
									i_2867_++;
								i_2858_ += i_2863_;
							}
							i_2859_ += i_2864_;
							i_2858_ = i_2994_;
							i_2867_ += i_2868_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class161_Sub3_Sub1(Class106_Sub2 class106_sub2, byte[] is, int[] is_3003_, int i, int i_3004_) {
		super(class106_sub2, i, i_3004_);
		((Class161_Sub3_Sub1) this).aByteArray11152 = is;
		((Class161_Sub3_Sub1) this).anIntArray11151 = is_3003_;
	}

	void method10054(boolean bool, boolean bool_3005_, boolean bool_3006_, int i, int i_3007_, float f, int i_3008_, int i_3009_, int i_3010_, int i_3011_, int i_3012_, int i_3013_, boolean bool_3014_) {
		if (i_3008_ > 0 && i_3009_ > 0 && (bool || bool_3005_)) {
			int i_3015_ = 0;
			int i_3016_ = 0;
			int i_3017_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
			int i_3018_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
			int i_3019_ = (i_3017_ << 16) / i_3008_;
			int i_3020_ = (i_3018_ << 16) / i_3009_;
			if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
				int i_3021_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_3019_ - 1) / i_3019_);
				i += i_3021_;
				i_3015_ += (i_3021_ * i_3019_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
				int i_3022_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_3020_ - 1) / i_3020_);
				i_3007_ += i_3022_;
				i_3016_ += (i_3022_ * i_3020_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10945 < i_3017_)
				i_3008_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_3015_ + i_3019_ - 1) / i_3019_;
			if (((Class161_Sub3_Sub1) this).anInt10930 < i_3018_)
				i_3009_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_3016_ + i_3020_ - 1) / i_3020_;
			int i_3023_ = i + i_3007_ * ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_3024_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_3008_);
			if (i_3007_ + i_3009_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_3009_ -= (i_3007_ + i_3009_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_3007_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_3025_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_3007_);
				i_3009_ -= i_3025_;
				i_3023_ += i_3025_ * (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_3016_ += i_3020_ * i_3025_;
			}
			if (i + i_3008_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_3026_ = (i + i_3008_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_3008_ -= i_3026_;
				i_3024_ += i_3026_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_3027_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_3008_ -= i_3027_;
				i_3023_ += i_3027_;
				i_3015_ += i_3019_ * i_3027_;
				i_3024_ += i_3027_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_3012_ == 0) {
				if (i_3010_ == 1) {
					int i_3028_ = i_3015_;
					for (int i_3029_ = -i_3009_; i_3029_ < 0; i_3029_++) {
						int i_3030_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3031_ = -i_3008_; i_3031_ < 0; i_3031_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool)
									is[i_3023_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3030_]) & 0xff)]);
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3028_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 0) {
					int i_3032_ = (i_3011_ & 0xff0000) >> 16;
					int i_3033_ = (i_3011_ & 0xff00) >> 8;
					int i_3034_ = i_3011_ & 0xff;
					int i_3035_ = i_3015_;
					for (int i_3036_ = -i_3009_; i_3036_ < 0; i_3036_++) {
						int i_3037_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3038_ = -i_3008_; i_3038_ < 0; i_3038_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool) {
									int i_3039_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3037_]) & 0xff)]);
									int i_3040_ = ((i_3039_ & 0xff0000) * i_3032_ & ~0xffffff);
									int i_3041_ = ((i_3039_ & 0xff00) * i_3033_ & 0xff0000);
									int i_3042_ = (i_3039_ & 0xff) * i_3034_ & 0xff00;
									is[i_3023_] = (i_3040_ | i_3041_ | i_3042_) >>> 8;
								}
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3035_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 3) {
					int i_3043_ = i_3015_;
					for (int i_3044_ = -i_3009_; i_3044_ < 0; i_3044_++) {
						int i_3045_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3046_ = -i_3008_; i_3046_ < 0; i_3046_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool) {
									byte i_3047_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3045_]);
									int i_3048_ = (i_3047_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3047_]) : 0);
									int i_3049_ = i_3048_ + i_3011_;
									int i_3050_ = ((i_3048_ & 0xff00ff) + (i_3011_ & 0xff00ff));
									int i_3051_ = ((i_3050_ & 0x1000100) + (i_3049_ - i_3050_ & 0x10000));
									is[i_3023_] = (i_3049_ - i_3051_ | i_3051_ - (i_3051_ >>> 8));
								}
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3043_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 2) {
					int i_3052_ = i_3011_ >>> 24;
					int i_3053_ = 256 - i_3052_;
					int i_3054_ = (i_3011_ & 0xff00ff) * i_3053_ & ~0xff00ff;
					int i_3055_ = (i_3011_ & 0xff00) * i_3053_ & 0xff0000;
					i_3011_ = (i_3054_ | i_3055_) >>> 8;
					int i_3056_ = i_3015_;
					for (int i_3057_ = -i_3009_; i_3057_ < 0; i_3057_++) {
						int i_3058_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3059_ = -i_3008_; i_3059_ < 0; i_3059_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool) {
									int i_3060_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3058_]) & 0xff)]);
									i_3054_ = ((i_3060_ & 0xff00ff) * i_3052_ & ~0xff00ff);
									i_3055_ = ((i_3060_ & 0xff00) * i_3052_ & 0xff0000);
									is[i_3023_] = (((i_3054_ | i_3055_) >>> 8) + i_3011_);
								}
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3056_;
						i_3023_ += i_3024_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3012_ == 1) {
				if (i_3010_ == 1) {
					int i_3061_ = i_3015_;
					for (int i_3062_ = -i_3009_; i_3062_ < 0; i_3062_++) {
						int i_3063_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3064_ = -i_3008_; i_3064_ < 0; i_3064_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								int i_3065_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3063_]);
								if (i_3065_ != 0) {
									if (bool)
										is[i_3023_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3065_ & 0xff]);
									if (bool_3005_ && bool_3014_)
										fs[i_3023_] = f;
								}
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3061_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 0) {
					int i_3066_ = i_3015_;
					if ((i_3011_ & 0xffffff) == 16777215) {
						int i_3067_ = i_3011_ >>> 24;
						int i_3068_ = 256 - i_3067_;
						for (int i_3069_ = -i_3009_; i_3069_ < 0; i_3069_++) {
							int i_3070_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_3071_ = -i_3008_; i_3071_ < 0; i_3071_++) {
								if (!bool_3005_ || f < fs[i_3023_]) {
									int i_3072_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3070_]);
									if (i_3072_ != 0) {
										if (bool) {
											int i_3073_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3072_ & 0xff]);
											int i_3074_ = is[i_3023_];
											is[i_3023_] = (((((i_3073_ & 0xff00ff) * i_3067_) + ((i_3074_ & 0xff00ff) * i_3068_)) & ~0xff00ff) + ((((i_3073_ & 0xff00) * i_3067_) + ((i_3074_ & 0xff00) * i_3068_)) & 0xff0000)) >> 8;
										}
										if (bool_3005_ && bool_3014_)
											fs[i_3023_] = f;
									}
								}
								i_3015_ += i_3019_;
								i_3023_++;
							}
							i_3016_ += i_3020_;
							i_3015_ = i_3066_;
							i_3023_ += i_3024_;
						}
					} else {
						int i_3075_ = (i_3011_ & 0xff0000) >> 16;
						int i_3076_ = (i_3011_ & 0xff00) >> 8;
						int i_3077_ = i_3011_ & 0xff;
						int i_3078_ = i_3011_ >>> 24;
						int i_3079_ = 256 - i_3078_;
						for (int i_3080_ = -i_3009_; i_3080_ < 0; i_3080_++) {
							int i_3081_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_3082_ = -i_3008_; i_3082_ < 0; i_3082_++) {
								if (!bool_3005_ || f < fs[i_3023_]) {
									int i_3083_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3081_]);
									if (i_3083_ != 0) {
										int i_3084_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3083_ & 0xff]);
										if (i_3078_ != 255) {
											if (bool) {
												int i_3085_ = (((i_3084_ & 0xff0000) * i_3075_) & ~0xffffff);
												int i_3086_ = (((i_3084_ & 0xff00) * i_3076_) & 0xff0000);
												int i_3087_ = (((i_3084_ & 0xff) * i_3077_) & 0xff00);
												i_3084_ = (i_3085_ | i_3086_ | i_3087_) >>> 8;
												int i_3088_ = is[i_3023_];
												is[i_3023_] = (((((i_3084_ & 0xff00ff) * i_3078_) + ((i_3088_ & 0xff00ff) * i_3079_)) & ~0xff00ff) + ((((i_3084_ & 0xff00) * i_3078_) + ((i_3088_ & 0xff00) * i_3079_)) & 0xff0000)) >> 8;
											}
											if (bool_3005_ && bool_3014_)
												fs[i_3023_] = f;
										} else {
											if (bool) {
												int i_3089_ = (((i_3084_ & 0xff0000) * i_3075_) & ~0xffffff);
												int i_3090_ = (((i_3084_ & 0xff00) * i_3076_) & 0xff0000);
												int i_3091_ = (((i_3084_ & 0xff) * i_3077_) & 0xff00);
												is[i_3023_] = (i_3089_ | i_3090_ | i_3091_) >>> 8;
											}
											if (bool_3005_ && bool_3014_)
												fs[i_3023_] = f;
										}
									}
								}
								i_3015_ += i_3019_;
								i_3023_++;
							}
							i_3016_ += i_3020_;
							i_3015_ = i_3066_;
							i_3023_ += i_3024_;
						}
					}
				} else if (i_3010_ == 3) {
					int i_3092_ = i_3015_;
					int i_3093_ = i_3011_ >>> 24;
					int i_3094_ = 256 - i_3093_;
					for (int i_3095_ = -i_3009_; i_3095_ < 0; i_3095_++) {
						int i_3096_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3097_ = -i_3008_; i_3097_ < 0; i_3097_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool) {
									byte i_3098_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3096_]);
									int i_3099_ = (i_3098_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3098_]) : 0);
									int i_3100_ = i_3099_ + i_3011_;
									int i_3101_ = ((i_3099_ & 0xff00ff) + (i_3011_ & 0xff00ff));
									int i_3102_ = ((i_3101_ & 0x1000100) + (i_3100_ - i_3101_ & 0x10000));
									i_3102_ = (i_3100_ - i_3102_ | i_3102_ - (i_3102_ >>> 8));
									if (i_3099_ == 0 && i_3093_ != 255) {
										i_3099_ = i_3102_;
										i_3102_ = is[i_3023_];
										i_3102_ = ((((i_3099_ & 0xff00ff) * i_3093_ + ((i_3102_ & 0xff00ff) * i_3094_)) & ~0xff00ff) + (((i_3099_ & 0xff00) * i_3093_ + ((i_3102_ & 0xff00) * i_3094_)) & 0xff0000)) >> 8;
									}
									is[i_3023_] = i_3102_;
								}
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3092_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 2) {
					int i_3103_ = i_3011_ >>> 24;
					int i_3104_ = 256 - i_3103_;
					int i_3105_ = (i_3011_ & 0xff00ff) * i_3104_ & ~0xff00ff;
					int i_3106_ = (i_3011_ & 0xff00) * i_3104_ & 0xff0000;
					i_3011_ = (i_3105_ | i_3106_) >>> 8;
					int i_3107_ = i_3015_;
					for (int i_3108_ = -i_3009_; i_3108_ < 0; i_3108_++) {
						int i_3109_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3110_ = -i_3008_; i_3110_ < 0; i_3110_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								int i_3111_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3109_]);
								if (i_3111_ != 0) {
									if (bool) {
										int i_3112_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3111_ & 0xff]);
										i_3105_ = ((i_3112_ & 0xff00ff) * i_3103_ & ~0xff00ff);
										i_3106_ = ((i_3112_ & 0xff00) * i_3103_ & 0xff0000);
										is[i_3023_] = ((i_3105_ | i_3106_) >>> 8) + i_3011_;
									}
									if (bool_3005_ && bool_3014_)
										fs[i_3023_] = f;
								}
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3107_;
						i_3023_ += i_3024_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3012_ == 2) {
				if (i_3010_ == 1) {
					int i_3113_ = i_3015_;
					for (int i_3114_ = -i_3009_; i_3114_ < 0; i_3114_++) {
						int i_3115_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3116_ = -i_3008_; i_3116_ < 0; i_3116_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								int i_3117_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3115_]);
								if (i_3117_ != 0) {
									if (bool) {
										int i_3118_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3117_ & 0xff]);
										int i_3119_ = is[i_3023_];
										int i_3120_ = i_3118_ + i_3119_;
										int i_3121_ = ((i_3118_ & 0xff00ff) + (i_3119_ & 0xff00ff));
										i_3119_ = ((i_3121_ & 0x1000100) + (i_3120_ - i_3121_ & 0x10000));
										is[i_3023_] = (i_3120_ - i_3119_ | i_3119_ - (i_3119_ >>> 8));
									}
									if (bool_3005_ && bool_3014_)
										fs[i_3023_] = f;
								}
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3113_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 0) {
					int i_3122_ = i_3015_;
					int i_3123_ = (i_3011_ & 0xff0000) >> 16;
					int i_3124_ = (i_3011_ & 0xff00) >> 8;
					int i_3125_ = i_3011_ & 0xff;
					for (int i_3126_ = -i_3009_; i_3126_ < 0; i_3126_++) {
						int i_3127_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3128_ = -i_3008_; i_3128_ < 0; i_3128_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								int i_3129_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3127_]);
								if (i_3129_ != 0) {
									if (bool) {
										int i_3130_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3129_ & 0xff]);
										int i_3131_ = ((i_3130_ & 0xff0000) * i_3123_ & ~0xffffff);
										int i_3132_ = ((i_3130_ & 0xff00) * i_3124_ & 0xff0000);
										int i_3133_ = ((i_3130_ & 0xff) * i_3125_ & 0xff00);
										i_3130_ = (i_3131_ | i_3132_ | i_3133_) >>> 8;
										int i_3134_ = is[i_3023_];
										int i_3135_ = i_3130_ + i_3134_;
										int i_3136_ = ((i_3130_ & 0xff00ff) + (i_3134_ & 0xff00ff));
										i_3134_ = ((i_3136_ & 0x1000100) + (i_3135_ - i_3136_ & 0x10000));
										is[i_3023_] = (i_3135_ - i_3134_ | i_3134_ - (i_3134_ >>> 8));
									}
									if (bool_3005_ && bool_3014_)
										fs[i_3023_] = f;
								}
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3122_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 3) {
					int i_3137_ = i_3015_;
					for (int i_3138_ = -i_3009_; i_3138_ < 0; i_3138_++) {
						int i_3139_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3140_ = -i_3008_; i_3140_ < 0; i_3140_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								if (bool) {
									byte i_3141_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3139_]);
									int i_3142_ = (i_3141_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3141_]) : 0);
									int i_3143_ = i_3142_ + i_3011_;
									int i_3144_ = ((i_3142_ & 0xff00ff) + (i_3011_ & 0xff00ff));
									int i_3145_ = ((i_3144_ & 0x1000100) + (i_3143_ - i_3144_ & 0x10000));
									i_3142_ = (i_3143_ - i_3145_ | i_3145_ - (i_3145_ >>> 8));
									i_3145_ = is[i_3023_];
									i_3143_ = i_3142_ + i_3145_;
									i_3144_ = (i_3142_ & 0xff00ff) + (i_3145_ & 0xff00ff);
									i_3145_ = ((i_3144_ & 0x1000100) + (i_3143_ - i_3144_ & 0x10000));
									is[i_3023_] = (i_3143_ - i_3145_ | i_3145_ - (i_3145_ >>> 8));
								}
								if (bool_3005_ && bool_3014_)
									fs[i_3023_] = f;
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3137_;
						i_3023_ += i_3024_;
					}
				} else if (i_3010_ == 2) {
					int i_3146_ = i_3011_ >>> 24;
					int i_3147_ = 256 - i_3146_;
					int i_3148_ = (i_3011_ & 0xff00ff) * i_3147_ & ~0xff00ff;
					int i_3149_ = (i_3011_ & 0xff00) * i_3147_ & 0xff0000;
					i_3011_ = (i_3148_ | i_3149_) >>> 8;
					int i_3150_ = i_3015_;
					for (int i_3151_ = -i_3009_; i_3151_ < 0; i_3151_++) {
						int i_3152_ = ((i_3016_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3153_ = -i_3008_; i_3153_ < 0; i_3153_++) {
							if (!bool_3005_ || f < fs[i_3023_]) {
								int i_3154_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3015_ >> 16) + i_3152_]);
								if (i_3154_ != 0) {
									if (bool) {
										int i_3155_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3154_ & 0xff]);
										i_3148_ = ((i_3155_ & 0xff00ff) * i_3146_ & ~0xff00ff);
										i_3149_ = ((i_3155_ & 0xff00) * i_3146_ & 0xff0000);
										i_3155_ = (((i_3148_ | i_3149_) >>> 8) + i_3011_);
										int i_3156_ = is[i_3023_];
										int i_3157_ = i_3155_ + i_3156_;
										int i_3158_ = ((i_3155_ & 0xff00ff) + (i_3156_ & 0xff00ff));
										i_3156_ = ((i_3158_ & 0x1000100) + (i_3157_ - i_3158_ & 0x10000));
										is[i_3023_] = (i_3157_ - i_3156_ | i_3156_ - (i_3156_ >>> 8));
									}
									if (bool_3005_ && bool_3014_)
										fs[i_3023_] = f;
								}
							}
							i_3015_ += i_3019_;
							i_3023_++;
						}
						i_3016_ += i_3020_;
						i_3015_ = i_3150_;
						i_3023_ += i_3024_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10055(boolean bool, boolean bool_3159_, boolean bool_3160_, int i, int i_3161_, float f, int i_3162_, int i_3163_, int i_3164_, int i_3165_, int i_3166_, int i_3167_, boolean bool_3168_) {
		if (i_3162_ > 0 && i_3163_ > 0 && (bool || bool_3159_)) {
			int i_3169_ = 0;
			int i_3170_ = 0;
			int i_3171_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
			int i_3172_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
			int i_3173_ = (i_3171_ << 16) / i_3162_;
			int i_3174_ = (i_3172_ << 16) / i_3163_;
			if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
				int i_3175_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_3173_ - 1) / i_3173_);
				i += i_3175_;
				i_3169_ += (i_3175_ * i_3173_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
				int i_3176_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_3174_ - 1) / i_3174_);
				i_3161_ += i_3176_;
				i_3170_ += (i_3176_ * i_3174_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
			}
			if (((Class161_Sub3_Sub1) this).anInt10945 < i_3171_)
				i_3162_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_3169_ + i_3173_ - 1) / i_3173_;
			if (((Class161_Sub3_Sub1) this).anInt10930 < i_3172_)
				i_3163_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_3170_ + i_3174_ - 1) / i_3174_;
			int i_3177_ = i + i_3161_ * ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217) * -994907113);
			int i_3178_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10217) * -994907113 - i_3162_);
			if (i_3161_ + i_3163_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
				i_3163_ -= (i_3161_ + i_3163_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
			if (i_3161_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222 * 2029354259)) {
				int i_3179_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259 - i_3161_);
				i_3163_ -= i_3179_;
				i_3177_ += i_3179_ * (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				i_3170_ += i_3174_ * i_3179_;
			}
			if (i + i_3162_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761) {
				int i_3180_ = (i + i_3162_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
				i_3162_ -= i_3180_;
				i_3178_ += i_3180_;
			}
			if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
				int i_3181_ = ((((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220) * 1179466163 - i);
				i_3162_ -= i_3181_;
				i_3177_ += i_3181_;
				i_3169_ += i_3173_ * i_3181_;
				i_3178_ += i_3181_;
			}
			float[] fs = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).aFloatArray10219);
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (i_3166_ == 0) {
				if (i_3164_ == 1) {
					int i_3182_ = i_3169_;
					for (int i_3183_ = -i_3163_; i_3183_ < 0; i_3183_++) {
						int i_3184_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3185_ = -i_3162_; i_3185_ < 0; i_3185_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool)
									is[i_3177_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3184_]) & 0xff)]);
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3182_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 0) {
					int i_3186_ = (i_3165_ & 0xff0000) >> 16;
					int i_3187_ = (i_3165_ & 0xff00) >> 8;
					int i_3188_ = i_3165_ & 0xff;
					int i_3189_ = i_3169_;
					for (int i_3190_ = -i_3163_; i_3190_ < 0; i_3190_++) {
						int i_3191_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3192_ = -i_3162_; i_3192_ < 0; i_3192_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool) {
									int i_3193_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3191_]) & 0xff)]);
									int i_3194_ = ((i_3193_ & 0xff0000) * i_3186_ & ~0xffffff);
									int i_3195_ = ((i_3193_ & 0xff00) * i_3187_ & 0xff0000);
									int i_3196_ = (i_3193_ & 0xff) * i_3188_ & 0xff00;
									is[i_3177_] = (i_3194_ | i_3195_ | i_3196_) >>> 8;
								}
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3189_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 3) {
					int i_3197_ = i_3169_;
					for (int i_3198_ = -i_3163_; i_3198_ < 0; i_3198_++) {
						int i_3199_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3200_ = -i_3162_; i_3200_ < 0; i_3200_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool) {
									byte i_3201_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3199_]);
									int i_3202_ = (i_3201_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3201_]) : 0);
									int i_3203_ = i_3202_ + i_3165_;
									int i_3204_ = ((i_3202_ & 0xff00ff) + (i_3165_ & 0xff00ff));
									int i_3205_ = ((i_3204_ & 0x1000100) + (i_3203_ - i_3204_ & 0x10000));
									is[i_3177_] = (i_3203_ - i_3205_ | i_3205_ - (i_3205_ >>> 8));
								}
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3197_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 2) {
					int i_3206_ = i_3165_ >>> 24;
					int i_3207_ = 256 - i_3206_;
					int i_3208_ = (i_3165_ & 0xff00ff) * i_3207_ & ~0xff00ff;
					int i_3209_ = (i_3165_ & 0xff00) * i_3207_ & 0xff0000;
					i_3165_ = (i_3208_ | i_3209_) >>> 8;
					int i_3210_ = i_3169_;
					for (int i_3211_ = -i_3163_; i_3211_ < 0; i_3211_++) {
						int i_3212_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3213_ = -i_3162_; i_3213_ < 0; i_3213_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool) {
									int i_3214_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3212_]) & 0xff)]);
									i_3208_ = ((i_3214_ & 0xff00ff) * i_3206_ & ~0xff00ff);
									i_3209_ = ((i_3214_ & 0xff00) * i_3206_ & 0xff0000);
									is[i_3177_] = (((i_3208_ | i_3209_) >>> 8) + i_3165_);
								}
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3210_;
						i_3177_ += i_3178_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3166_ == 1) {
				if (i_3164_ == 1) {
					int i_3215_ = i_3169_;
					for (int i_3216_ = -i_3163_; i_3216_ < 0; i_3216_++) {
						int i_3217_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3218_ = -i_3162_; i_3218_ < 0; i_3218_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								int i_3219_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3217_]);
								if (i_3219_ != 0) {
									if (bool)
										is[i_3177_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3219_ & 0xff]);
									if (bool_3159_ && bool_3168_)
										fs[i_3177_] = f;
								}
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3215_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 0) {
					int i_3220_ = i_3169_;
					if ((i_3165_ & 0xffffff) == 16777215) {
						int i_3221_ = i_3165_ >>> 24;
						int i_3222_ = 256 - i_3221_;
						for (int i_3223_ = -i_3163_; i_3223_ < 0; i_3223_++) {
							int i_3224_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_3225_ = -i_3162_; i_3225_ < 0; i_3225_++) {
								if (!bool_3159_ || f < fs[i_3177_]) {
									int i_3226_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3224_]);
									if (i_3226_ != 0) {
										if (bool) {
											int i_3227_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3226_ & 0xff]);
											int i_3228_ = is[i_3177_];
											is[i_3177_] = (((((i_3227_ & 0xff00ff) * i_3221_) + ((i_3228_ & 0xff00ff) * i_3222_)) & ~0xff00ff) + ((((i_3227_ & 0xff00) * i_3221_) + ((i_3228_ & 0xff00) * i_3222_)) & 0xff0000)) >> 8;
										}
										if (bool_3159_ && bool_3168_)
											fs[i_3177_] = f;
									}
								}
								i_3169_ += i_3173_;
								i_3177_++;
							}
							i_3170_ += i_3174_;
							i_3169_ = i_3220_;
							i_3177_ += i_3178_;
						}
					} else {
						int i_3229_ = (i_3165_ & 0xff0000) >> 16;
						int i_3230_ = (i_3165_ & 0xff00) >> 8;
						int i_3231_ = i_3165_ & 0xff;
						int i_3232_ = i_3165_ >>> 24;
						int i_3233_ = 256 - i_3232_;
						for (int i_3234_ = -i_3163_; i_3234_ < 0; i_3234_++) {
							int i_3235_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_3236_ = -i_3162_; i_3236_ < 0; i_3236_++) {
								if (!bool_3159_ || f < fs[i_3177_]) {
									int i_3237_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3235_]);
									if (i_3237_ != 0) {
										int i_3238_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3237_ & 0xff]);
										if (i_3232_ != 255) {
											if (bool) {
												int i_3239_ = (((i_3238_ & 0xff0000) * i_3229_) & ~0xffffff);
												int i_3240_ = (((i_3238_ & 0xff00) * i_3230_) & 0xff0000);
												int i_3241_ = (((i_3238_ & 0xff) * i_3231_) & 0xff00);
												i_3238_ = (i_3239_ | i_3240_ | i_3241_) >>> 8;
												int i_3242_ = is[i_3177_];
												is[i_3177_] = (((((i_3238_ & 0xff00ff) * i_3232_) + ((i_3242_ & 0xff00ff) * i_3233_)) & ~0xff00ff) + ((((i_3238_ & 0xff00) * i_3232_) + ((i_3242_ & 0xff00) * i_3233_)) & 0xff0000)) >> 8;
											}
											if (bool_3159_ && bool_3168_)
												fs[i_3177_] = f;
										} else {
											if (bool) {
												int i_3243_ = (((i_3238_ & 0xff0000) * i_3229_) & ~0xffffff);
												int i_3244_ = (((i_3238_ & 0xff00) * i_3230_) & 0xff0000);
												int i_3245_ = (((i_3238_ & 0xff) * i_3231_) & 0xff00);
												is[i_3177_] = (i_3243_ | i_3244_ | i_3245_) >>> 8;
											}
											if (bool_3159_ && bool_3168_)
												fs[i_3177_] = f;
										}
									}
								}
								i_3169_ += i_3173_;
								i_3177_++;
							}
							i_3170_ += i_3174_;
							i_3169_ = i_3220_;
							i_3177_ += i_3178_;
						}
					}
				} else if (i_3164_ == 3) {
					int i_3246_ = i_3169_;
					int i_3247_ = i_3165_ >>> 24;
					int i_3248_ = 256 - i_3247_;
					for (int i_3249_ = -i_3163_; i_3249_ < 0; i_3249_++) {
						int i_3250_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3251_ = -i_3162_; i_3251_ < 0; i_3251_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool) {
									byte i_3252_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3250_]);
									int i_3253_ = (i_3252_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3252_]) : 0);
									int i_3254_ = i_3253_ + i_3165_;
									int i_3255_ = ((i_3253_ & 0xff00ff) + (i_3165_ & 0xff00ff));
									int i_3256_ = ((i_3255_ & 0x1000100) + (i_3254_ - i_3255_ & 0x10000));
									i_3256_ = (i_3254_ - i_3256_ | i_3256_ - (i_3256_ >>> 8));
									if (i_3253_ == 0 && i_3247_ != 255) {
										i_3253_ = i_3256_;
										i_3256_ = is[i_3177_];
										i_3256_ = ((((i_3253_ & 0xff00ff) * i_3247_ + ((i_3256_ & 0xff00ff) * i_3248_)) & ~0xff00ff) + (((i_3253_ & 0xff00) * i_3247_ + ((i_3256_ & 0xff00) * i_3248_)) & 0xff0000)) >> 8;
									}
									is[i_3177_] = i_3256_;
								}
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3246_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 2) {
					int i_3257_ = i_3165_ >>> 24;
					int i_3258_ = 256 - i_3257_;
					int i_3259_ = (i_3165_ & 0xff00ff) * i_3258_ & ~0xff00ff;
					int i_3260_ = (i_3165_ & 0xff00) * i_3258_ & 0xff0000;
					i_3165_ = (i_3259_ | i_3260_) >>> 8;
					int i_3261_ = i_3169_;
					for (int i_3262_ = -i_3163_; i_3262_ < 0; i_3262_++) {
						int i_3263_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3264_ = -i_3162_; i_3264_ < 0; i_3264_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								int i_3265_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3263_]);
								if (i_3265_ != 0) {
									if (bool) {
										int i_3266_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3265_ & 0xff]);
										i_3259_ = ((i_3266_ & 0xff00ff) * i_3257_ & ~0xff00ff);
										i_3260_ = ((i_3266_ & 0xff00) * i_3257_ & 0xff0000);
										is[i_3177_] = ((i_3259_ | i_3260_) >>> 8) + i_3165_;
									}
									if (bool_3159_ && bool_3168_)
										fs[i_3177_] = f;
								}
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3261_;
						i_3177_ += i_3178_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3166_ == 2) {
				if (i_3164_ == 1) {
					int i_3267_ = i_3169_;
					for (int i_3268_ = -i_3163_; i_3268_ < 0; i_3268_++) {
						int i_3269_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3270_ = -i_3162_; i_3270_ < 0; i_3270_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								int i_3271_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3269_]);
								if (i_3271_ != 0) {
									if (bool) {
										int i_3272_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3271_ & 0xff]);
										int i_3273_ = is[i_3177_];
										int i_3274_ = i_3272_ + i_3273_;
										int i_3275_ = ((i_3272_ & 0xff00ff) + (i_3273_ & 0xff00ff));
										i_3273_ = ((i_3275_ & 0x1000100) + (i_3274_ - i_3275_ & 0x10000));
										is[i_3177_] = (i_3274_ - i_3273_ | i_3273_ - (i_3273_ >>> 8));
									}
									if (bool_3159_ && bool_3168_)
										fs[i_3177_] = f;
								}
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3267_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 0) {
					int i_3276_ = i_3169_;
					int i_3277_ = (i_3165_ & 0xff0000) >> 16;
					int i_3278_ = (i_3165_ & 0xff00) >> 8;
					int i_3279_ = i_3165_ & 0xff;
					for (int i_3280_ = -i_3163_; i_3280_ < 0; i_3280_++) {
						int i_3281_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3282_ = -i_3162_; i_3282_ < 0; i_3282_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								int i_3283_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3281_]);
								if (i_3283_ != 0) {
									if (bool) {
										int i_3284_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3283_ & 0xff]);
										int i_3285_ = ((i_3284_ & 0xff0000) * i_3277_ & ~0xffffff);
										int i_3286_ = ((i_3284_ & 0xff00) * i_3278_ & 0xff0000);
										int i_3287_ = ((i_3284_ & 0xff) * i_3279_ & 0xff00);
										i_3284_ = (i_3285_ | i_3286_ | i_3287_) >>> 8;
										int i_3288_ = is[i_3177_];
										int i_3289_ = i_3284_ + i_3288_;
										int i_3290_ = ((i_3284_ & 0xff00ff) + (i_3288_ & 0xff00ff));
										i_3288_ = ((i_3290_ & 0x1000100) + (i_3289_ - i_3290_ & 0x10000));
										is[i_3177_] = (i_3289_ - i_3288_ | i_3288_ - (i_3288_ >>> 8));
									}
									if (bool_3159_ && bool_3168_)
										fs[i_3177_] = f;
								}
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3276_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 3) {
					int i_3291_ = i_3169_;
					for (int i_3292_ = -i_3163_; i_3292_ < 0; i_3292_++) {
						int i_3293_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3294_ = -i_3162_; i_3294_ < 0; i_3294_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								if (bool) {
									byte i_3295_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3293_]);
									int i_3296_ = (i_3295_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3295_]) : 0);
									int i_3297_ = i_3296_ + i_3165_;
									int i_3298_ = ((i_3296_ & 0xff00ff) + (i_3165_ & 0xff00ff));
									int i_3299_ = ((i_3298_ & 0x1000100) + (i_3297_ - i_3298_ & 0x10000));
									i_3296_ = (i_3297_ - i_3299_ | i_3299_ - (i_3299_ >>> 8));
									i_3299_ = is[i_3177_];
									i_3297_ = i_3296_ + i_3299_;
									i_3298_ = (i_3296_ & 0xff00ff) + (i_3299_ & 0xff00ff);
									i_3299_ = ((i_3298_ & 0x1000100) + (i_3297_ - i_3298_ & 0x10000));
									is[i_3177_] = (i_3297_ - i_3299_ | i_3299_ - (i_3299_ >>> 8));
								}
								if (bool_3159_ && bool_3168_)
									fs[i_3177_] = f;
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3291_;
						i_3177_ += i_3178_;
					}
				} else if (i_3164_ == 2) {
					int i_3300_ = i_3165_ >>> 24;
					int i_3301_ = 256 - i_3300_;
					int i_3302_ = (i_3165_ & 0xff00ff) * i_3301_ & ~0xff00ff;
					int i_3303_ = (i_3165_ & 0xff00) * i_3301_ & 0xff0000;
					i_3165_ = (i_3302_ | i_3303_) >>> 8;
					int i_3304_ = i_3169_;
					for (int i_3305_ = -i_3163_; i_3305_ < 0; i_3305_++) {
						int i_3306_ = ((i_3170_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
						for (int i_3307_ = -i_3162_; i_3307_ < 0; i_3307_++) {
							if (!bool_3159_ || f < fs[i_3177_]) {
								int i_3308_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_3169_ >> 16) + i_3306_]);
								if (i_3308_ != 0) {
									if (bool) {
										int i_3309_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3308_ & 0xff]);
										i_3302_ = ((i_3309_ & 0xff00ff) * i_3300_ & ~0xff00ff);
										i_3303_ = ((i_3309_ & 0xff00) * i_3300_ & 0xff0000);
										i_3309_ = (((i_3302_ | i_3303_) >>> 8) + i_3165_);
										int i_3310_ = is[i_3177_];
										int i_3311_ = i_3309_ + i_3310_;
										int i_3312_ = ((i_3309_ & 0xff00ff) + (i_3310_ & 0xff00ff));
										i_3310_ = ((i_3312_ & 0x1000100) + (i_3311_ - i_3312_ & 0x10000));
										is[i_3177_] = (i_3311_ - i_3310_ | i_3310_ - (i_3310_ >>> 8));
									}
									if (bool_3159_ && bool_3168_)
										fs[i_3177_] = f;
								}
							}
							i_3169_ += i_3173_;
							i_3177_++;
						}
						i_3170_ += i_3174_;
						i_3169_ = i_3304_;
						i_3177_ += i_3178_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10056(int i, int i_3313_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_3314_ = anInt10940;
					while (i_3314_ < 0) {
						int i_3315_ = anInt10944;
						int i_3316_ = anInt10951;
						int i_3317_ = anInt10952;
						int i_3318_ = anInt10958;
						if (i_3316_ >= 0 && i_3317_ >= 0 && (i_3316_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_3317_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							for (/**/; i_3318_ < 0; i_3318_++) {
								int i_3319_ = ((i_3317_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_3316_ >> 12));
								int i_3320_ = i_3315_++;
								if (i_3313_ == 0) {
									if (i == 1)
										is[i_3320_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]) & 0xff)]);
									else if (i == 0) {
										int i_3321_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]) & 0xff)]);
										int i_3322_ = (((i_3321_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3323_ = ((i_3321_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3324_ = ((i_3321_ & 0xff) * anInt10960 & 0xff00);
										is[i_3320_] = (i_3322_ | i_3323_ | i_3324_) >>> 8;
									} else if (i == 3) {
										int i_3325_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]) & 0xff)]);
										int i_3326_ = anInt10928;
										int i_3327_ = i_3325_ + i_3326_;
										int i_3328_ = ((i_3325_ & 0xff00ff) + (i_3326_ & 0xff00ff));
										int i_3329_ = ((i_3328_ & 0x1000100) + (i_3327_ - i_3328_ & 0x10000));
										is[i_3320_] = (i_3327_ - i_3329_ | i_3329_ - (i_3329_ >>> 8));
									} else if (i == 2) {
										int i_3330_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]) & 0xff)]);
										int i_3331_ = (((i_3330_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3332_ = ((i_3330_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3320_] = ((i_3331_ | i_3332_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 1) {
									if (i == 1) {
										int i_3333_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3333_ != 0)
											is[i_3320_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3333_ & 0xff]);
									} else if (i == 0) {
										int i_3334_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3334_ != 0) {
											int i_3335_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3334_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_3336_ = anInt10928 >>> 24;
												int i_3337_ = 256 - i_3336_;
												int i_3338_ = is[i_3320_];
												is[i_3320_] = (((((i_3335_ & 0xff00ff) * i_3336_) + ((i_3338_ & 0xff00ff) * i_3337_)) & ~0xff00ff) + ((((i_3335_ & 0xff00) * i_3336_) + ((i_3338_ & 0xff00) * i_3337_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_3339_ = (((i_3335_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3340_ = (((i_3335_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3341_ = (((i_3335_ & 0xff) * anInt10960) & 0xff00);
												i_3335_ = (i_3339_ | i_3340_ | i_3341_) >>> 8;
												int i_3342_ = is[i_3320_];
												is[i_3320_] = (((((i_3335_ & 0xff00ff) * anInt10934) + ((i_3342_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3335_ & 0xff00) * anInt10934) + ((i_3342_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_3343_ = (((i_3335_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3344_ = (((i_3335_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3345_ = (((i_3335_ & 0xff) * anInt10960) & 0xff00);
												is[i_3320_] = (i_3343_ | i_3344_ | i_3345_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3346_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										int i_3347_ = (i_3346_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3346_]) : 0);
										int i_3348_ = anInt10928;
										int i_3349_ = i_3347_ + i_3348_;
										int i_3350_ = ((i_3347_ & 0xff00ff) + (i_3348_ & 0xff00ff));
										int i_3351_ = ((i_3350_ & 0x1000100) + (i_3349_ - i_3350_ & 0x10000));
										i_3351_ = (i_3349_ - i_3351_ | i_3351_ - (i_3351_ >>> 8));
										if (i_3347_ == 0 && anInt10934 != 255) {
											i_3347_ = i_3351_;
											i_3351_ = is[i_3320_];
											i_3351_ = (((((i_3347_ & 0xff00ff) * anInt10934) + ((i_3351_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3347_ & 0xff00) * anInt10934) + ((i_3351_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3320_] = i_3351_;
									} else if (i == 2) {
										int i_3352_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3352_ != 0) {
											int i_3353_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3352_ & 0xff]);
											int i_3354_ = (((i_3353_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3355_ = (((i_3353_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_3320_++] = (((i_3354_ | i_3355_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 2) {
									if (i == 1) {
										int i_3356_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3356_ != 0) {
											int i_3357_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3356_ & 0xff]);
											int i_3358_ = is[i_3320_];
											int i_3359_ = i_3357_ + i_3358_;
											int i_3360_ = ((i_3357_ & 0xff00ff) + (i_3358_ & 0xff00ff));
											i_3358_ = ((i_3360_ & 0x1000100) + (i_3359_ - i_3360_ & 0x10000));
											is[i_3320_] = (i_3359_ - i_3358_ | i_3358_ - (i_3358_ >>> 8));
										}
									} else if (i == 0) {
										int i_3361_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3361_ != 0) {
											int i_3362_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3361_ & 0xff]);
											int i_3363_ = (((i_3362_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3364_ = (((i_3362_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3365_ = (((i_3362_ & 0xff) * anInt10960) & 0xff00);
											i_3362_ = (i_3363_ | i_3364_ | i_3365_) >>> 8;
											int i_3366_ = is[i_3320_];
											int i_3367_ = i_3362_ + i_3366_;
											int i_3368_ = ((i_3362_ & 0xff00ff) + (i_3366_ & 0xff00ff));
											i_3366_ = ((i_3368_ & 0x1000100) + (i_3367_ - i_3368_ & 0x10000));
											is[i_3320_] = (i_3367_ - i_3366_ | i_3366_ - (i_3366_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3369_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										int i_3370_ = (i_3369_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3369_]) : 0);
										int i_3371_ = anInt10928;
										int i_3372_ = i_3370_ + i_3371_;
										int i_3373_ = ((i_3370_ & 0xff00ff) + (i_3371_ & 0xff00ff));
										int i_3374_ = ((i_3373_ & 0x1000100) + (i_3372_ - i_3373_ & 0x10000));
										i_3374_ = (i_3372_ - i_3374_ | i_3374_ - (i_3374_ >>> 8));
										if (i_3370_ == 0 && anInt10934 != 255) {
											i_3370_ = i_3374_;
											i_3374_ = is[i_3320_];
											i_3374_ = (((((i_3370_ & 0xff00ff) * anInt10934) + ((i_3374_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3370_ & 0xff00) * anInt10934) + ((i_3374_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3320_] = i_3374_;
									} else if (i == 2) {
										int i_3375_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3319_]);
										if (i_3375_ != 0) {
											int i_3376_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3375_ & 0xff]);
											int i_3377_ = (((i_3376_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3378_ = (((i_3376_ & 0xff00) * anInt10934) & 0xff0000);
											i_3376_ = ((i_3377_ | i_3378_) >>> 8) + anInt10963;
											int i_3379_ = is[i_3320_];
											int i_3380_ = i_3376_ + i_3379_;
											int i_3381_ = ((i_3376_ & 0xff00ff) + (i_3379_ & 0xff00ff));
											i_3379_ = ((i_3381_ & 0x1000100) + (i_3380_ - i_3381_ & 0x10000));
											is[i_3320_] = (i_3380_ - i_3379_ | i_3379_ - (i_3379_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_3314_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_3382_ = anInt10940;
					while (i_3382_ < 0) {
						int i_3383_ = anInt10944;
						int i_3384_ = anInt10951;
						int i_3385_ = anInt10952 + anInt10954;
						int i_3386_ = anInt10958;
						if (i_3384_ >= 0 && (i_3384_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							int i_3387_;
							if ((i_3387_ = (i_3385_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_3387_ = (anInt10946 - i_3387_) / anInt10946;
								i_3386_ += i_3387_;
								i_3385_ += anInt10946 * i_3387_;
								i_3383_ += i_3387_;
							}
							if ((i_3387_ = (i_3385_ - anInt10946) / anInt10946) > i_3386_)
								i_3386_ = i_3387_;
							for (/**/; i_3386_ < 0; i_3386_++) {
								int i_3388_ = ((i_3385_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_3384_ >> 12));
								int i_3389_ = i_3383_++;
								if (i_3313_ == 0) {
									if (i == 1)
										is[i_3389_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]) & 0xff)]);
									else if (i == 0) {
										int i_3390_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]) & 0xff)]);
										int i_3391_ = (((i_3390_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3392_ = ((i_3390_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3393_ = ((i_3390_ & 0xff) * anInt10960 & 0xff00);
										is[i_3389_] = (i_3391_ | i_3392_ | i_3393_) >>> 8;
									} else if (i == 3) {
										int i_3394_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]) & 0xff)]);
										int i_3395_ = anInt10928;
										int i_3396_ = i_3394_ + i_3395_;
										int i_3397_ = ((i_3394_ & 0xff00ff) + (i_3395_ & 0xff00ff));
										int i_3398_ = ((i_3397_ & 0x1000100) + (i_3396_ - i_3397_ & 0x10000));
										is[i_3389_] = (i_3396_ - i_3398_ | i_3398_ - (i_3398_ >>> 8));
									} else if (i == 2) {
										int i_3399_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]) & 0xff)]);
										int i_3400_ = (((i_3399_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3401_ = ((i_3399_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3389_] = ((i_3400_ | i_3401_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 1) {
									if (i == 1) {
										int i_3402_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3402_ != 0)
											is[i_3389_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3402_ & 0xff]);
									} else if (i == 0) {
										int i_3403_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3403_ != 0) {
											int i_3404_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3403_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_3405_ = anInt10928 >>> 24;
												int i_3406_ = 256 - i_3405_;
												int i_3407_ = is[i_3389_];
												is[i_3389_] = (((((i_3404_ & 0xff00ff) * i_3405_) + ((i_3407_ & 0xff00ff) * i_3406_)) & ~0xff00ff) + ((((i_3404_ & 0xff00) * i_3405_) + ((i_3407_ & 0xff00) * i_3406_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_3408_ = (((i_3404_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3409_ = (((i_3404_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3410_ = (((i_3404_ & 0xff) * anInt10960) & 0xff00);
												i_3404_ = (i_3408_ | i_3409_ | i_3410_) >>> 8;
												int i_3411_ = is[i_3389_];
												is[i_3389_] = (((((i_3404_ & 0xff00ff) * anInt10934) + ((i_3411_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3404_ & 0xff00) * anInt10934) + ((i_3411_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_3412_ = (((i_3404_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3413_ = (((i_3404_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3414_ = (((i_3404_ & 0xff) * anInt10960) & 0xff00);
												is[i_3389_] = (i_3412_ | i_3413_ | i_3414_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3415_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										int i_3416_ = (i_3415_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3415_]) : 0);
										int i_3417_ = anInt10928;
										int i_3418_ = i_3416_ + i_3417_;
										int i_3419_ = ((i_3416_ & 0xff00ff) + (i_3417_ & 0xff00ff));
										int i_3420_ = ((i_3419_ & 0x1000100) + (i_3418_ - i_3419_ & 0x10000));
										i_3420_ = (i_3418_ - i_3420_ | i_3420_ - (i_3420_ >>> 8));
										if (i_3416_ == 0 && anInt10934 != 255) {
											i_3416_ = i_3420_;
											i_3420_ = is[i_3389_];
											i_3420_ = (((((i_3416_ & 0xff00ff) * anInt10934) + ((i_3420_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3416_ & 0xff00) * anInt10934) + ((i_3420_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3389_] = i_3420_;
									} else if (i == 2) {
										int i_3421_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3421_ != 0) {
											int i_3422_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3421_ & 0xff]);
											int i_3423_ = (((i_3422_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3424_ = (((i_3422_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_3389_++] = (((i_3423_ | i_3424_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 2) {
									if (i == 1) {
										int i_3425_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3425_ != 0) {
											int i_3426_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3425_ & 0xff]);
											int i_3427_ = is[i_3389_];
											int i_3428_ = i_3426_ + i_3427_;
											int i_3429_ = ((i_3426_ & 0xff00ff) + (i_3427_ & 0xff00ff));
											i_3427_ = ((i_3429_ & 0x1000100) + (i_3428_ - i_3429_ & 0x10000));
											is[i_3389_] = (i_3428_ - i_3427_ | i_3427_ - (i_3427_ >>> 8));
										}
									} else if (i == 0) {
										int i_3430_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3430_ != 0) {
											int i_3431_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3430_ & 0xff]);
											int i_3432_ = (((i_3431_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3433_ = (((i_3431_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3434_ = (((i_3431_ & 0xff) * anInt10960) & 0xff00);
											i_3431_ = (i_3432_ | i_3433_ | i_3434_) >>> 8;
											int i_3435_ = is[i_3389_];
											int i_3436_ = i_3431_ + i_3435_;
											int i_3437_ = ((i_3431_ & 0xff00ff) + (i_3435_ & 0xff00ff));
											i_3435_ = ((i_3437_ & 0x1000100) + (i_3436_ - i_3437_ & 0x10000));
											is[i_3389_] = (i_3436_ - i_3435_ | i_3435_ - (i_3435_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3438_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										int i_3439_ = (i_3438_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3438_]) : 0);
										int i_3440_ = anInt10928;
										int i_3441_ = i_3439_ + i_3440_;
										int i_3442_ = ((i_3439_ & 0xff00ff) + (i_3440_ & 0xff00ff));
										int i_3443_ = ((i_3442_ & 0x1000100) + (i_3441_ - i_3442_ & 0x10000));
										i_3443_ = (i_3441_ - i_3443_ | i_3443_ - (i_3443_ >>> 8));
										if (i_3439_ == 0 && anInt10934 != 255) {
											i_3439_ = i_3443_;
											i_3443_ = is[i_3389_];
											i_3443_ = (((((i_3439_ & 0xff00ff) * anInt10934) + ((i_3443_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3439_ & 0xff00) * anInt10934) + ((i_3443_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3389_] = i_3443_;
									} else if (i == 2) {
										int i_3444_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3388_]);
										if (i_3444_ != 0) {
											int i_3445_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3444_ & 0xff]);
											int i_3446_ = (((i_3445_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3447_ = (((i_3445_ & 0xff00) * anInt10934) & 0xff0000);
											i_3445_ = ((i_3446_ | i_3447_) >>> 8) + anInt10963;
											int i_3448_ = is[i_3389_];
											int i_3449_ = i_3445_ + i_3448_;
											int i_3450_ = ((i_3445_ & 0xff00ff) + (i_3448_ & 0xff00ff));
											i_3448_ = ((i_3450_ & 0x1000100) + (i_3449_ - i_3450_ & 0x10000));
											is[i_3389_] = (i_3449_ - i_3448_ | i_3448_ - (i_3448_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3385_ += anInt10946;
							}
						}
						i_3382_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_3451_ = anInt10940;
					while (i_3451_ < 0) {
						int i_3452_ = anInt10944;
						int i_3453_ = anInt10951;
						int i_3454_ = anInt10952 + anInt10954;
						int i_3455_ = anInt10958;
						if (i_3453_ >= 0 && (i_3453_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							if (i_3454_ < 0) {
								int i_3456_ = (anInt10946 - 1 - i_3454_) / anInt10946;
								i_3455_ += i_3456_;
								i_3454_ += anInt10946 * i_3456_;
								i_3452_ += i_3456_;
							}
							int i_3457_;
							if ((i_3457_ = (1 + i_3454_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_3455_)
								i_3455_ = i_3457_;
							for (/**/; i_3455_ < 0; i_3455_++) {
								int i_3458_ = ((i_3454_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_3453_ >> 12));
								int i_3459_ = i_3452_++;
								if (i_3313_ == 0) {
									if (i == 1)
										is[i_3459_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]) & 0xff)]);
									else if (i == 0) {
										int i_3460_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]) & 0xff)]);
										int i_3461_ = (((i_3460_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3462_ = ((i_3460_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3463_ = ((i_3460_ & 0xff) * anInt10960 & 0xff00);
										is[i_3459_] = (i_3461_ | i_3462_ | i_3463_) >>> 8;
									} else if (i == 3) {
										int i_3464_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]) & 0xff)]);
										int i_3465_ = anInt10928;
										int i_3466_ = i_3464_ + i_3465_;
										int i_3467_ = ((i_3464_ & 0xff00ff) + (i_3465_ & 0xff00ff));
										int i_3468_ = ((i_3467_ & 0x1000100) + (i_3466_ - i_3467_ & 0x10000));
										is[i_3459_] = (i_3466_ - i_3468_ | i_3468_ - (i_3468_ >>> 8));
									} else if (i == 2) {
										int i_3469_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]) & 0xff)]);
										int i_3470_ = (((i_3469_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3471_ = ((i_3469_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3459_] = ((i_3470_ | i_3471_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 1) {
									if (i == 1) {
										int i_3472_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3472_ != 0)
											is[i_3459_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3472_ & 0xff]);
									} else if (i == 0) {
										int i_3473_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3473_ != 0) {
											int i_3474_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3473_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_3475_ = anInt10928 >>> 24;
												int i_3476_ = 256 - i_3475_;
												int i_3477_ = is[i_3459_];
												is[i_3459_] = (((((i_3474_ & 0xff00ff) * i_3475_) + ((i_3477_ & 0xff00ff) * i_3476_)) & ~0xff00ff) + ((((i_3474_ & 0xff00) * i_3475_) + ((i_3477_ & 0xff00) * i_3476_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_3478_ = (((i_3474_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3479_ = (((i_3474_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3480_ = (((i_3474_ & 0xff) * anInt10960) & 0xff00);
												i_3474_ = (i_3478_ | i_3479_ | i_3480_) >>> 8;
												int i_3481_ = is[i_3459_];
												is[i_3459_] = (((((i_3474_ & 0xff00ff) * anInt10934) + ((i_3481_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3474_ & 0xff00) * anInt10934) + ((i_3481_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_3482_ = (((i_3474_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3483_ = (((i_3474_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3484_ = (((i_3474_ & 0xff) * anInt10960) & 0xff00);
												is[i_3459_] = (i_3482_ | i_3483_ | i_3484_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3485_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										int i_3486_ = (i_3485_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3485_]) : 0);
										int i_3487_ = anInt10928;
										int i_3488_ = i_3486_ + i_3487_;
										int i_3489_ = ((i_3486_ & 0xff00ff) + (i_3487_ & 0xff00ff));
										int i_3490_ = ((i_3489_ & 0x1000100) + (i_3488_ - i_3489_ & 0x10000));
										i_3490_ = (i_3488_ - i_3490_ | i_3490_ - (i_3490_ >>> 8));
										if (i_3486_ == 0 && anInt10934 != 255) {
											i_3486_ = i_3490_;
											i_3490_ = is[i_3459_];
											i_3490_ = (((((i_3486_ & 0xff00ff) * anInt10934) + ((i_3490_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3486_ & 0xff00) * anInt10934) + ((i_3490_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3459_] = i_3490_;
									} else if (i == 2) {
										int i_3491_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3491_ != 0) {
											int i_3492_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3491_ & 0xff]);
											int i_3493_ = (((i_3492_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3494_ = (((i_3492_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_3459_++] = (((i_3493_ | i_3494_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 2) {
									if (i == 1) {
										int i_3495_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3495_ != 0) {
											int i_3496_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3495_ & 0xff]);
											int i_3497_ = is[i_3459_];
											int i_3498_ = i_3496_ + i_3497_;
											int i_3499_ = ((i_3496_ & 0xff00ff) + (i_3497_ & 0xff00ff));
											i_3497_ = ((i_3499_ & 0x1000100) + (i_3498_ - i_3499_ & 0x10000));
											is[i_3459_] = (i_3498_ - i_3497_ | i_3497_ - (i_3497_ >>> 8));
										}
									} else if (i == 0) {
										int i_3500_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3500_ != 0) {
											int i_3501_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3500_ & 0xff]);
											int i_3502_ = (((i_3501_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3503_ = (((i_3501_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3504_ = (((i_3501_ & 0xff) * anInt10960) & 0xff00);
											i_3501_ = (i_3502_ | i_3503_ | i_3504_) >>> 8;
											int i_3505_ = is[i_3459_];
											int i_3506_ = i_3501_ + i_3505_;
											int i_3507_ = ((i_3501_ & 0xff00ff) + (i_3505_ & 0xff00ff));
											i_3505_ = ((i_3507_ & 0x1000100) + (i_3506_ - i_3507_ & 0x10000));
											is[i_3459_] = (i_3506_ - i_3505_ | i_3505_ - (i_3505_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3508_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										int i_3509_ = (i_3508_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3508_]) : 0);
										int i_3510_ = anInt10928;
										int i_3511_ = i_3509_ + i_3510_;
										int i_3512_ = ((i_3509_ & 0xff00ff) + (i_3510_ & 0xff00ff));
										int i_3513_ = ((i_3512_ & 0x1000100) + (i_3511_ - i_3512_ & 0x10000));
										i_3513_ = (i_3511_ - i_3513_ | i_3513_ - (i_3513_ >>> 8));
										if (i_3509_ == 0 && anInt10934 != 255) {
											i_3509_ = i_3513_;
											i_3513_ = is[i_3459_];
											i_3513_ = (((((i_3509_ & 0xff00ff) * anInt10934) + ((i_3513_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3509_ & 0xff00) * anInt10934) + ((i_3513_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3459_] = i_3513_;
									} else if (i == 2) {
										int i_3514_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3458_]);
										if (i_3514_ != 0) {
											int i_3515_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3514_ & 0xff]);
											int i_3516_ = (((i_3515_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3517_ = (((i_3515_ & 0xff00) * anInt10934) & 0xff0000);
											i_3515_ = ((i_3516_ | i_3517_) >>> 8) + anInt10963;
											int i_3518_ = is[i_3459_];
											int i_3519_ = i_3515_ + i_3518_;
											int i_3520_ = ((i_3515_ & 0xff00ff) + (i_3518_ & 0xff00ff));
											i_3518_ = ((i_3520_ & 0x1000100) + (i_3519_ - i_3520_ & 0x10000));
											is[i_3459_] = (i_3519_ - i_3518_ | i_3518_ - (i_3518_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3454_ += anInt10946;
							}
						}
						i_3451_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_3521_ = anInt10940;
					while (i_3521_ < 0) {
						int i_3522_ = anInt10944;
						int i_3523_ = anInt10951 + anInt10953;
						int i_3524_ = anInt10952;
						int i_3525_ = anInt10958;
						if (i_3524_ >= 0 && (i_3524_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							int i_3526_;
							if ((i_3526_ = (i_3523_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_3526_ = (anInt10956 - i_3526_) / anInt10956;
								i_3525_ += i_3526_;
								i_3523_ += anInt10956 * i_3526_;
								i_3522_ += i_3526_;
							}
							if ((i_3526_ = (i_3523_ - anInt10956) / anInt10956) > i_3525_)
								i_3525_ = i_3526_;
							for (/**/; i_3525_ < 0; i_3525_++) {
								int i_3527_ = ((i_3524_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_3523_ >> 12));
								int i_3528_ = i_3522_++;
								if (i_3313_ == 0) {
									if (i == 1)
										is[i_3528_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]) & 0xff)]);
									else if (i == 0) {
										int i_3529_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]) & 0xff)]);
										int i_3530_ = (((i_3529_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3531_ = ((i_3529_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3532_ = ((i_3529_ & 0xff) * anInt10960 & 0xff00);
										is[i_3528_] = (i_3530_ | i_3531_ | i_3532_) >>> 8;
									} else if (i == 3) {
										int i_3533_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]) & 0xff)]);
										int i_3534_ = anInt10928;
										int i_3535_ = i_3533_ + i_3534_;
										int i_3536_ = ((i_3533_ & 0xff00ff) + (i_3534_ & 0xff00ff));
										int i_3537_ = ((i_3536_ & 0x1000100) + (i_3535_ - i_3536_ & 0x10000));
										is[i_3528_] = (i_3535_ - i_3537_ | i_3537_ - (i_3537_ >>> 8));
									} else if (i == 2) {
										int i_3538_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]) & 0xff)]);
										int i_3539_ = (((i_3538_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3540_ = ((i_3538_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3528_] = ((i_3539_ | i_3540_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 1) {
									if (i == 1) {
										int i_3541_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3541_ != 0)
											is[i_3528_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3541_ & 0xff]);
									} else if (i == 0) {
										int i_3542_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3542_ != 0) {
											int i_3543_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3542_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_3544_ = anInt10928 >>> 24;
												int i_3545_ = 256 - i_3544_;
												int i_3546_ = is[i_3528_];
												is[i_3528_] = (((((i_3543_ & 0xff00ff) * i_3544_) + ((i_3546_ & 0xff00ff) * i_3545_)) & ~0xff00ff) + ((((i_3543_ & 0xff00) * i_3544_) + ((i_3546_ & 0xff00) * i_3545_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_3547_ = (((i_3543_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3548_ = (((i_3543_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3549_ = (((i_3543_ & 0xff) * anInt10960) & 0xff00);
												i_3543_ = (i_3547_ | i_3548_ | i_3549_) >>> 8;
												int i_3550_ = is[i_3528_];
												is[i_3528_] = (((((i_3543_ & 0xff00ff) * anInt10934) + ((i_3550_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3543_ & 0xff00) * anInt10934) + ((i_3550_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_3551_ = (((i_3543_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3552_ = (((i_3543_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3553_ = (((i_3543_ & 0xff) * anInt10960) & 0xff00);
												is[i_3528_] = (i_3551_ | i_3552_ | i_3553_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3554_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										int i_3555_ = (i_3554_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3554_]) : 0);
										int i_3556_ = anInt10928;
										int i_3557_ = i_3555_ + i_3556_;
										int i_3558_ = ((i_3555_ & 0xff00ff) + (i_3556_ & 0xff00ff));
										int i_3559_ = ((i_3558_ & 0x1000100) + (i_3557_ - i_3558_ & 0x10000));
										i_3559_ = (i_3557_ - i_3559_ | i_3559_ - (i_3559_ >>> 8));
										if (i_3555_ == 0 && anInt10934 != 255) {
											i_3555_ = i_3559_;
											i_3559_ = is[i_3528_];
											i_3559_ = (((((i_3555_ & 0xff00ff) * anInt10934) + ((i_3559_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3555_ & 0xff00) * anInt10934) + ((i_3559_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3528_] = i_3559_;
									} else if (i == 2) {
										int i_3560_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3560_ != 0) {
											int i_3561_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3560_ & 0xff]);
											int i_3562_ = (((i_3561_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3563_ = (((i_3561_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_3528_++] = (((i_3562_ | i_3563_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3313_ == 2) {
									if (i == 1) {
										int i_3564_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3564_ != 0) {
											int i_3565_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3564_ & 0xff]);
											int i_3566_ = is[i_3528_];
											int i_3567_ = i_3565_ + i_3566_;
											int i_3568_ = ((i_3565_ & 0xff00ff) + (i_3566_ & 0xff00ff));
											i_3566_ = ((i_3568_ & 0x1000100) + (i_3567_ - i_3568_ & 0x10000));
											is[i_3528_] = (i_3567_ - i_3566_ | i_3566_ - (i_3566_ >>> 8));
										}
									} else if (i == 0) {
										int i_3569_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3569_ != 0) {
											int i_3570_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3569_ & 0xff]);
											int i_3571_ = (((i_3570_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3572_ = (((i_3570_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3573_ = (((i_3570_ & 0xff) * anInt10960) & 0xff00);
											i_3570_ = (i_3571_ | i_3572_ | i_3573_) >>> 8;
											int i_3574_ = is[i_3528_];
											int i_3575_ = i_3570_ + i_3574_;
											int i_3576_ = ((i_3570_ & 0xff00ff) + (i_3574_ & 0xff00ff));
											i_3574_ = ((i_3576_ & 0x1000100) + (i_3575_ - i_3576_ & 0x10000));
											is[i_3528_] = (i_3575_ - i_3574_ | i_3574_ - (i_3574_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3577_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										int i_3578_ = (i_3577_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3577_]) : 0);
										int i_3579_ = anInt10928;
										int i_3580_ = i_3578_ + i_3579_;
										int i_3581_ = ((i_3578_ & 0xff00ff) + (i_3579_ & 0xff00ff));
										int i_3582_ = ((i_3581_ & 0x1000100) + (i_3580_ - i_3581_ & 0x10000));
										i_3582_ = (i_3580_ - i_3582_ | i_3582_ - (i_3582_ >>> 8));
										if (i_3578_ == 0 && anInt10934 != 255) {
											i_3578_ = i_3582_;
											i_3582_ = is[i_3528_];
											i_3582_ = (((((i_3578_ & 0xff00ff) * anInt10934) + ((i_3582_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3578_ & 0xff00) * anInt10934) + ((i_3582_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3528_] = i_3582_;
									} else if (i == 2) {
										int i_3583_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3527_]);
										if (i_3583_ != 0) {
											int i_3584_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3583_ & 0xff]);
											int i_3585_ = (((i_3584_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3586_ = (((i_3584_ & 0xff00) * anInt10934) & 0xff0000);
											i_3584_ = ((i_3585_ | i_3586_) >>> 8) + anInt10963;
											int i_3587_ = is[i_3528_];
											int i_3588_ = i_3584_ + i_3587_;
											int i_3589_ = ((i_3584_ & 0xff00ff) + (i_3587_ & 0xff00ff));
											i_3587_ = ((i_3589_ & 0x1000100) + (i_3588_ - i_3589_ & 0x10000));
											is[i_3528_] = (i_3588_ - i_3587_ | i_3587_ - (i_3587_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3523_ += anInt10956;
							}
						}
						i_3521_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_3590_ = anInt10940;
					while (i_3590_ < 0) {
						int i_3591_ = anInt10944;
						int i_3592_ = anInt10951 + anInt10953;
						int i_3593_ = anInt10952 + anInt10954;
						int i_3594_ = anInt10958;
						int i_3595_;
						if ((i_3595_ = i_3592_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_3595_ = (anInt10956 - i_3595_) / anInt10956;
							i_3594_ += i_3595_;
							i_3592_ += anInt10956 * i_3595_;
							i_3593_ += anInt10946 * i_3595_;
							i_3591_ += i_3595_;
						}
						if ((i_3595_ = (i_3592_ - anInt10956) / anInt10956) > i_3594_)
							i_3594_ = i_3595_;
						if ((i_3595_ = i_3593_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_3595_ = (anInt10946 - i_3595_) / anInt10946;
							i_3594_ += i_3595_;
							i_3592_ += anInt10956 * i_3595_;
							i_3593_ += anInt10946 * i_3595_;
							i_3591_ += i_3595_;
						}
						if ((i_3595_ = (i_3593_ - anInt10946) / anInt10946) > i_3594_)
							i_3594_ = i_3595_;
						for (/**/; i_3594_ < 0; i_3594_++) {
							int i_3596_ = (((i_3593_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_3592_ >> 12));
							int i_3597_ = i_3591_++;
							if (i_3313_ == 0) {
								if (i == 1)
									is[i_3597_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]) & 0xff)]);
								else if (i == 0) {
									int i_3598_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]) & 0xff)]);
									int i_3599_ = ((i_3598_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_3600_ = ((i_3598_ & 0xff00) * anInt10959 & 0xff0000);
									int i_3601_ = ((i_3598_ & 0xff) * anInt10960 & 0xff00);
									is[i_3597_] = (i_3599_ | i_3600_ | i_3601_) >>> 8;
								} else if (i == 3) {
									int i_3602_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]) & 0xff)]);
									int i_3603_ = anInt10928;
									int i_3604_ = i_3602_ + i_3603_;
									int i_3605_ = ((i_3602_ & 0xff00ff) + (i_3603_ & 0xff00ff));
									int i_3606_ = ((i_3605_ & 0x1000100) + (i_3604_ - i_3605_ & 0x10000));
									is[i_3597_] = (i_3604_ - i_3606_ | i_3606_ - (i_3606_ >>> 8));
								} else if (i == 2) {
									int i_3607_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]) & 0xff)]);
									int i_3608_ = ((i_3607_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3609_ = ((i_3607_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_3597_] = (((i_3608_ | i_3609_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 1) {
								if (i == 1) {
									int i_3610_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3610_ != 0)
										is[i_3597_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3610_ & 0xff]);
								} else if (i == 0) {
									int i_3611_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3611_ != 0) {
										int i_3612_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3611_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_3613_ = anInt10928 >>> 24;
											int i_3614_ = 256 - i_3613_;
											int i_3615_ = is[i_3597_];
											is[i_3597_] = (((((i_3612_ & 0xff00ff) * i_3613_) + ((i_3615_ & 0xff00ff) * i_3614_)) & ~0xff00ff) + ((((i_3612_ & 0xff00) * i_3613_) + ((i_3615_ & 0xff00) * i_3614_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_3616_ = (((i_3612_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3617_ = (((i_3612_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3618_ = (((i_3612_ & 0xff) * anInt10960) & 0xff00);
											i_3612_ = (i_3616_ | i_3617_ | i_3618_) >>> 8;
											int i_3619_ = is[i_3597_];
											is[i_3597_] = (((((i_3612_ & 0xff00ff) * anInt10934) + ((i_3619_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3612_ & 0xff00) * anInt10934) + ((i_3619_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_3620_ = (((i_3612_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3621_ = (((i_3612_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3622_ = (((i_3612_ & 0xff) * anInt10960) & 0xff00);
											is[i_3597_] = (i_3620_ | i_3621_ | i_3622_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3623_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									int i_3624_ = (i_3623_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3623_]) : 0);
									int i_3625_ = anInt10928;
									int i_3626_ = i_3624_ + i_3625_;
									int i_3627_ = ((i_3624_ & 0xff00ff) + (i_3625_ & 0xff00ff));
									int i_3628_ = ((i_3627_ & 0x1000100) + (i_3626_ - i_3627_ & 0x10000));
									i_3628_ = (i_3626_ - i_3628_ | i_3628_ - (i_3628_ >>> 8));
									if (i_3624_ == 0 && anInt10934 != 255) {
										i_3624_ = i_3628_;
										i_3628_ = is[i_3597_];
										i_3628_ = (((((i_3624_ & 0xff00ff) * anInt10934) + ((i_3628_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3624_ & 0xff00) * anInt10934) + ((i_3628_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3597_] = i_3628_;
								} else if (i == 2) {
									int i_3629_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3629_ != 0) {
										int i_3630_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3629_ & 0xff]);
										int i_3631_ = (((i_3630_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3632_ = ((i_3630_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3597_++] = ((i_3631_ | i_3632_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 2) {
								if (i == 1) {
									int i_3633_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3633_ != 0) {
										int i_3634_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3633_ & 0xff]);
										int i_3635_ = is[i_3597_];
										int i_3636_ = i_3634_ + i_3635_;
										int i_3637_ = ((i_3634_ & 0xff00ff) + (i_3635_ & 0xff00ff));
										i_3635_ = ((i_3637_ & 0x1000100) + (i_3636_ - i_3637_ & 0x10000));
										is[i_3597_] = (i_3636_ - i_3635_ | i_3635_ - (i_3635_ >>> 8));
									}
								} else if (i == 0) {
									int i_3638_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3638_ != 0) {
										int i_3639_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3638_ & 0xff]);
										int i_3640_ = (((i_3639_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3641_ = ((i_3639_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3642_ = ((i_3639_ & 0xff) * anInt10960 & 0xff00);
										i_3639_ = (i_3640_ | i_3641_ | i_3642_) >>> 8;
										int i_3643_ = is[i_3597_];
										int i_3644_ = i_3639_ + i_3643_;
										int i_3645_ = ((i_3639_ & 0xff00ff) + (i_3643_ & 0xff00ff));
										i_3643_ = ((i_3645_ & 0x1000100) + (i_3644_ - i_3645_ & 0x10000));
										is[i_3597_] = (i_3644_ - i_3643_ | i_3643_ - (i_3643_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3646_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									int i_3647_ = (i_3646_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3646_]) : 0);
									int i_3648_ = anInt10928;
									int i_3649_ = i_3647_ + i_3648_;
									int i_3650_ = ((i_3647_ & 0xff00ff) + (i_3648_ & 0xff00ff));
									int i_3651_ = ((i_3650_ & 0x1000100) + (i_3649_ - i_3650_ & 0x10000));
									i_3651_ = (i_3649_ - i_3651_ | i_3651_ - (i_3651_ >>> 8));
									if (i_3647_ == 0 && anInt10934 != 255) {
										i_3647_ = i_3651_;
										i_3651_ = is[i_3597_];
										i_3651_ = (((((i_3647_ & 0xff00ff) * anInt10934) + ((i_3651_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3647_ & 0xff00) * anInt10934) + ((i_3651_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3597_] = i_3651_;
								} else if (i == 2) {
									int i_3652_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3596_]);
									if (i_3652_ != 0) {
										int i_3653_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3652_ & 0xff]);
										int i_3654_ = (((i_3653_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3655_ = ((i_3653_ & 0xff00) * anInt10934 & 0xff0000);
										i_3653_ = (((i_3654_ | i_3655_) >>> 8) + anInt10963);
										int i_3656_ = is[i_3597_];
										int i_3657_ = i_3653_ + i_3656_;
										int i_3658_ = ((i_3653_ & 0xff00ff) + (i_3656_ & 0xff00ff));
										i_3656_ = ((i_3658_ & 0x1000100) + (i_3657_ - i_3658_ & 0x10000));
										is[i_3597_] = (i_3657_ - i_3656_ | i_3656_ - (i_3656_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3592_ += anInt10956;
							i_3593_ += anInt10946;
						}
						i_3590_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_3659_ = anInt10940;
					while (i_3659_ < 0) {
						int i_3660_ = anInt10944;
						int i_3661_ = anInt10951 + anInt10953;
						int i_3662_ = anInt10952 + anInt10954;
						int i_3663_ = anInt10958;
						int i_3664_;
						if ((i_3664_ = i_3661_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_3664_ = (anInt10956 - i_3664_) / anInt10956;
							i_3663_ += i_3664_;
							i_3661_ += anInt10956 * i_3664_;
							i_3662_ += anInt10946 * i_3664_;
							i_3660_ += i_3664_;
						}
						if ((i_3664_ = (i_3661_ - anInt10956) / anInt10956) > i_3663_)
							i_3663_ = i_3664_;
						if (i_3662_ < 0) {
							i_3664_ = (anInt10946 - 1 - i_3662_) / anInt10946;
							i_3663_ += i_3664_;
							i_3661_ += anInt10956 * i_3664_;
							i_3662_ += anInt10946 * i_3664_;
							i_3660_ += i_3664_;
						}
						if ((i_3664_ = (1 + i_3662_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_3663_)
							i_3663_ = i_3664_;
						for (/**/; i_3663_ < 0; i_3663_++) {
							int i_3665_ = (((i_3662_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_3661_ >> 12));
							int i_3666_ = i_3660_++;
							if (i_3313_ == 0) {
								if (i == 1)
									is[i_3666_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]) & 0xff)]);
								else if (i == 0) {
									int i_3667_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]) & 0xff)]);
									int i_3668_ = ((i_3667_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_3669_ = ((i_3667_ & 0xff00) * anInt10959 & 0xff0000);
									int i_3670_ = ((i_3667_ & 0xff) * anInt10960 & 0xff00);
									is[i_3666_] = (i_3668_ | i_3669_ | i_3670_) >>> 8;
								} else if (i == 3) {
									int i_3671_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]) & 0xff)]);
									int i_3672_ = anInt10928;
									int i_3673_ = i_3671_ + i_3672_;
									int i_3674_ = ((i_3671_ & 0xff00ff) + (i_3672_ & 0xff00ff));
									int i_3675_ = ((i_3674_ & 0x1000100) + (i_3673_ - i_3674_ & 0x10000));
									is[i_3666_] = (i_3673_ - i_3675_ | i_3675_ - (i_3675_ >>> 8));
								} else if (i == 2) {
									int i_3676_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]) & 0xff)]);
									int i_3677_ = ((i_3676_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3678_ = ((i_3676_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_3666_] = (((i_3677_ | i_3678_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 1) {
								if (i == 1) {
									int i_3679_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3679_ != 0)
										is[i_3666_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3679_ & 0xff]);
								} else if (i == 0) {
									int i_3680_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3680_ != 0) {
										int i_3681_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3680_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_3682_ = anInt10928 >>> 24;
											int i_3683_ = 256 - i_3682_;
											int i_3684_ = is[i_3666_];
											is[i_3666_] = (((((i_3681_ & 0xff00ff) * i_3682_) + ((i_3684_ & 0xff00ff) * i_3683_)) & ~0xff00ff) + ((((i_3681_ & 0xff00) * i_3682_) + ((i_3684_ & 0xff00) * i_3683_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_3685_ = (((i_3681_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3686_ = (((i_3681_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3687_ = (((i_3681_ & 0xff) * anInt10960) & 0xff00);
											i_3681_ = (i_3685_ | i_3686_ | i_3687_) >>> 8;
											int i_3688_ = is[i_3666_];
											is[i_3666_] = (((((i_3681_ & 0xff00ff) * anInt10934) + ((i_3688_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3681_ & 0xff00) * anInt10934) + ((i_3688_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_3689_ = (((i_3681_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3690_ = (((i_3681_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3691_ = (((i_3681_ & 0xff) * anInt10960) & 0xff00);
											is[i_3666_] = (i_3689_ | i_3690_ | i_3691_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3692_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									int i_3693_ = (i_3692_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3692_]) : 0);
									int i_3694_ = anInt10928;
									int i_3695_ = i_3693_ + i_3694_;
									int i_3696_ = ((i_3693_ & 0xff00ff) + (i_3694_ & 0xff00ff));
									int i_3697_ = ((i_3696_ & 0x1000100) + (i_3695_ - i_3696_ & 0x10000));
									i_3697_ = (i_3695_ - i_3697_ | i_3697_ - (i_3697_ >>> 8));
									if (i_3693_ == 0 && anInt10934 != 255) {
										i_3693_ = i_3697_;
										i_3697_ = is[i_3666_];
										i_3697_ = (((((i_3693_ & 0xff00ff) * anInt10934) + ((i_3697_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3693_ & 0xff00) * anInt10934) + ((i_3697_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3666_] = i_3697_;
								} else if (i == 2) {
									int i_3698_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3698_ != 0) {
										int i_3699_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3698_ & 0xff]);
										int i_3700_ = (((i_3699_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3701_ = ((i_3699_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3666_++] = ((i_3700_ | i_3701_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 2) {
								if (i == 1) {
									int i_3702_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3702_ != 0) {
										int i_3703_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3702_ & 0xff]);
										int i_3704_ = is[i_3666_];
										int i_3705_ = i_3703_ + i_3704_;
										int i_3706_ = ((i_3703_ & 0xff00ff) + (i_3704_ & 0xff00ff));
										i_3704_ = ((i_3706_ & 0x1000100) + (i_3705_ - i_3706_ & 0x10000));
										is[i_3666_] = (i_3705_ - i_3704_ | i_3704_ - (i_3704_ >>> 8));
									}
								} else if (i == 0) {
									int i_3707_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3707_ != 0) {
										int i_3708_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3707_ & 0xff]);
										int i_3709_ = (((i_3708_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3710_ = ((i_3708_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3711_ = ((i_3708_ & 0xff) * anInt10960 & 0xff00);
										i_3708_ = (i_3709_ | i_3710_ | i_3711_) >>> 8;
										int i_3712_ = is[i_3666_];
										int i_3713_ = i_3708_ + i_3712_;
										int i_3714_ = ((i_3708_ & 0xff00ff) + (i_3712_ & 0xff00ff));
										i_3712_ = ((i_3714_ & 0x1000100) + (i_3713_ - i_3714_ & 0x10000));
										is[i_3666_] = (i_3713_ - i_3712_ | i_3712_ - (i_3712_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3715_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									int i_3716_ = (i_3715_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3715_]) : 0);
									int i_3717_ = anInt10928;
									int i_3718_ = i_3716_ + i_3717_;
									int i_3719_ = ((i_3716_ & 0xff00ff) + (i_3717_ & 0xff00ff));
									int i_3720_ = ((i_3719_ & 0x1000100) + (i_3718_ - i_3719_ & 0x10000));
									i_3720_ = (i_3718_ - i_3720_ | i_3720_ - (i_3720_ >>> 8));
									if (i_3716_ == 0 && anInt10934 != 255) {
										i_3716_ = i_3720_;
										i_3720_ = is[i_3666_];
										i_3720_ = (((((i_3716_ & 0xff00ff) * anInt10934) + ((i_3720_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3716_ & 0xff00) * anInt10934) + ((i_3720_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3666_] = i_3720_;
								} else if (i == 2) {
									int i_3721_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3665_]);
									if (i_3721_ != 0) {
										int i_3722_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3721_ & 0xff]);
										int i_3723_ = (((i_3722_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3724_ = ((i_3722_ & 0xff00) * anInt10934 & 0xff0000);
										i_3722_ = (((i_3723_ | i_3724_) >>> 8) + anInt10963);
										int i_3725_ = is[i_3666_];
										int i_3726_ = i_3722_ + i_3725_;
										int i_3727_ = ((i_3722_ & 0xff00ff) + (i_3725_ & 0xff00ff));
										i_3725_ = ((i_3727_ & 0x1000100) + (i_3726_ - i_3727_ & 0x10000));
										is[i_3666_] = (i_3726_ - i_3725_ | i_3725_ - (i_3725_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3661_ += anInt10956;
							i_3662_ += anInt10946;
						}
						i_3659_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_3728_ = anInt10940;
				while (i_3728_ < 0) {
					int i_3729_ = anInt10944;
					int i_3730_ = anInt10951 + anInt10953;
					int i_3731_ = anInt10952;
					int i_3732_ = anInt10958;
					if (i_3731_ >= 0 && i_3731_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
						if (i_3730_ < 0) {
							int i_3733_ = (anInt10956 - 1 - i_3730_) / anInt10956;
							i_3732_ += i_3733_;
							i_3730_ += anInt10956 * i_3733_;
							i_3729_ += i_3733_;
						}
						int i_3734_;
						if ((i_3734_ = (1 + i_3730_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_3732_)
							i_3732_ = i_3734_;
						for (/**/; i_3732_ < 0; i_3732_++) {
							int i_3735_ = (((i_3731_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_3730_ >> 12));
							int i_3736_ = i_3729_++;
							if (i_3313_ == 0) {
								if (i == 1)
									is[i_3736_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]) & 0xff)]);
								else if (i == 0) {
									int i_3737_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]) & 0xff)]);
									int i_3738_ = ((i_3737_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_3739_ = ((i_3737_ & 0xff00) * anInt10959 & 0xff0000);
									int i_3740_ = ((i_3737_ & 0xff) * anInt10960 & 0xff00);
									is[i_3736_] = (i_3738_ | i_3739_ | i_3740_) >>> 8;
								} else if (i == 3) {
									int i_3741_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]) & 0xff)]);
									int i_3742_ = anInt10928;
									int i_3743_ = i_3741_ + i_3742_;
									int i_3744_ = ((i_3741_ & 0xff00ff) + (i_3742_ & 0xff00ff));
									int i_3745_ = ((i_3744_ & 0x1000100) + (i_3743_ - i_3744_ & 0x10000));
									is[i_3736_] = (i_3743_ - i_3745_ | i_3745_ - (i_3745_ >>> 8));
								} else if (i == 2) {
									int i_3746_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]) & 0xff)]);
									int i_3747_ = ((i_3746_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3748_ = ((i_3746_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_3736_] = (((i_3747_ | i_3748_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 1) {
								if (i == 1) {
									int i_3749_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3749_ != 0)
										is[i_3736_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3749_ & 0xff]);
								} else if (i == 0) {
									int i_3750_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3750_ != 0) {
										int i_3751_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3750_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_3752_ = anInt10928 >>> 24;
											int i_3753_ = 256 - i_3752_;
											int i_3754_ = is[i_3736_];
											is[i_3736_] = (((((i_3751_ & 0xff00ff) * i_3752_) + ((i_3754_ & 0xff00ff) * i_3753_)) & ~0xff00ff) + ((((i_3751_ & 0xff00) * i_3752_) + ((i_3754_ & 0xff00) * i_3753_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_3755_ = (((i_3751_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3756_ = (((i_3751_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3757_ = (((i_3751_ & 0xff) * anInt10960) & 0xff00);
											i_3751_ = (i_3755_ | i_3756_ | i_3757_) >>> 8;
											int i_3758_ = is[i_3736_];
											is[i_3736_] = (((((i_3751_ & 0xff00ff) * anInt10934) + ((i_3758_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3751_ & 0xff00) * anInt10934) + ((i_3758_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_3759_ = (((i_3751_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3760_ = (((i_3751_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3761_ = (((i_3751_ & 0xff) * anInt10960) & 0xff00);
											is[i_3736_] = (i_3759_ | i_3760_ | i_3761_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3762_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									int i_3763_ = (i_3762_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3762_]) : 0);
									int i_3764_ = anInt10928;
									int i_3765_ = i_3763_ + i_3764_;
									int i_3766_ = ((i_3763_ & 0xff00ff) + (i_3764_ & 0xff00ff));
									int i_3767_ = ((i_3766_ & 0x1000100) + (i_3765_ - i_3766_ & 0x10000));
									i_3767_ = (i_3765_ - i_3767_ | i_3767_ - (i_3767_ >>> 8));
									if (i_3763_ == 0 && anInt10934 != 255) {
										i_3763_ = i_3767_;
										i_3767_ = is[i_3736_];
										i_3767_ = (((((i_3763_ & 0xff00ff) * anInt10934) + ((i_3767_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3763_ & 0xff00) * anInt10934) + ((i_3767_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3736_] = i_3767_;
								} else if (i == 2) {
									int i_3768_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3768_ != 0) {
										int i_3769_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3768_ & 0xff]);
										int i_3770_ = (((i_3769_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3771_ = ((i_3769_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3736_++] = ((i_3770_ | i_3771_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3313_ == 2) {
								if (i == 1) {
									int i_3772_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3772_ != 0) {
										int i_3773_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3772_ & 0xff]);
										int i_3774_ = is[i_3736_];
										int i_3775_ = i_3773_ + i_3774_;
										int i_3776_ = ((i_3773_ & 0xff00ff) + (i_3774_ & 0xff00ff));
										i_3774_ = ((i_3776_ & 0x1000100) + (i_3775_ - i_3776_ & 0x10000));
										is[i_3736_] = (i_3775_ - i_3774_ | i_3774_ - (i_3774_ >>> 8));
									}
								} else if (i == 0) {
									int i_3777_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3777_ != 0) {
										int i_3778_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3777_ & 0xff]);
										int i_3779_ = (((i_3778_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3780_ = ((i_3778_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3781_ = ((i_3778_ & 0xff) * anInt10960 & 0xff00);
										i_3778_ = (i_3779_ | i_3780_ | i_3781_) >>> 8;
										int i_3782_ = is[i_3736_];
										int i_3783_ = i_3778_ + i_3782_;
										int i_3784_ = ((i_3778_ & 0xff00ff) + (i_3782_ & 0xff00ff));
										i_3782_ = ((i_3784_ & 0x1000100) + (i_3783_ - i_3784_ & 0x10000));
										is[i_3736_] = (i_3783_ - i_3782_ | i_3782_ - (i_3782_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3785_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									int i_3786_ = (i_3785_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3785_]) : 0);
									int i_3787_ = anInt10928;
									int i_3788_ = i_3786_ + i_3787_;
									int i_3789_ = ((i_3786_ & 0xff00ff) + (i_3787_ & 0xff00ff));
									int i_3790_ = ((i_3789_ & 0x1000100) + (i_3788_ - i_3789_ & 0x10000));
									i_3790_ = (i_3788_ - i_3790_ | i_3790_ - (i_3790_ >>> 8));
									if (i_3786_ == 0 && anInt10934 != 255) {
										i_3786_ = i_3790_;
										i_3790_ = is[i_3736_];
										i_3790_ = (((((i_3786_ & 0xff00ff) * anInt10934) + ((i_3790_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3786_ & 0xff00) * anInt10934) + ((i_3790_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_3736_] = i_3790_;
								} else if (i == 2) {
									int i_3791_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3735_]);
									if (i_3791_ != 0) {
										int i_3792_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3791_ & 0xff]);
										int i_3793_ = (((i_3792_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3794_ = ((i_3792_ & 0xff00) * anInt10934 & 0xff0000);
										i_3792_ = (((i_3793_ | i_3794_) >>> 8) + anInt10963);
										int i_3795_ = is[i_3736_];
										int i_3796_ = i_3792_ + i_3795_;
										int i_3797_ = ((i_3792_ & 0xff00ff) + (i_3795_ & 0xff00ff));
										i_3795_ = ((i_3797_ & 0x1000100) + (i_3796_ - i_3797_ & 0x10000));
										is[i_3736_] = (i_3796_ - i_3795_ | i_3795_ - (i_3795_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3730_ += anInt10956;
						}
					}
					i_3728_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_3798_ = anInt10940; i_3798_ < 0; i_3798_++) {
					int i_3799_ = anInt10944;
					int i_3800_ = anInt10951 + anInt10953;
					int i_3801_ = anInt10952 + anInt10954;
					int i_3802_ = anInt10958;
					if (i_3800_ < 0) {
						int i_3803_ = (anInt10956 - 1 - i_3800_) / anInt10956;
						i_3802_ += i_3803_;
						i_3800_ += anInt10956 * i_3803_;
						i_3801_ += anInt10946 * i_3803_;
						i_3799_ += i_3803_;
					}
					int i_3804_;
					if ((i_3804_ = (1 + i_3800_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_3802_)
						i_3802_ = i_3804_;
					if ((i_3804_ = i_3801_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
						i_3804_ = (anInt10946 - i_3804_) / anInt10946;
						i_3802_ += i_3804_;
						i_3800_ += anInt10956 * i_3804_;
						i_3801_ += anInt10946 * i_3804_;
						i_3799_ += i_3804_;
					}
					if ((i_3804_ = (i_3801_ - anInt10946) / anInt10946) > i_3802_)
						i_3802_ = i_3804_;
					for (/**/; i_3802_ < 0; i_3802_++) {
						int i_3805_ = (((i_3801_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_3800_ >> 12));
						int i_3806_ = i_3799_++;
						if (i_3313_ == 0) {
							if (i == 1)
								is[i_3806_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]) & 0xff]);
							else if (i == 0) {
								int i_3807_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]) & 0xff]);
								int i_3808_ = ((i_3807_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_3809_ = ((i_3807_ & 0xff00) * anInt10959 & 0xff0000);
								int i_3810_ = (i_3807_ & 0xff) * anInt10960 & 0xff00;
								is[i_3806_] = (i_3808_ | i_3809_ | i_3810_) >>> 8;
							} else if (i == 3) {
								int i_3811_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]) & 0xff]);
								int i_3812_ = anInt10928;
								int i_3813_ = i_3811_ + i_3812_;
								int i_3814_ = ((i_3811_ & 0xff00ff) + (i_3812_ & 0xff00ff));
								int i_3815_ = ((i_3814_ & 0x1000100) + (i_3813_ - i_3814_ & 0x10000));
								is[i_3806_] = i_3813_ - i_3815_ | i_3815_ - (i_3815_ >>> 8);
							} else if (i == 2) {
								int i_3816_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]) & 0xff]);
								int i_3817_ = ((i_3816_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_3818_ = ((i_3816_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_3806_] = ((i_3817_ | i_3818_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_3313_ == 1) {
							if (i == 1) {
								int i_3819_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3819_ != 0)
									is[i_3806_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3819_ & 0xff]);
							} else if (i == 0) {
								int i_3820_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3820_ != 0) {
									int i_3821_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3820_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_3822_ = anInt10928 >>> 24;
										int i_3823_ = 256 - i_3822_;
										int i_3824_ = is[i_3806_];
										is[i_3806_] = ((((i_3821_ & 0xff00ff) * i_3822_ + ((i_3824_ & 0xff00ff) * i_3823_)) & ~0xff00ff) + (((i_3821_ & 0xff00) * i_3822_ + ((i_3824_ & 0xff00) * i_3823_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_3825_ = (((i_3821_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3826_ = ((i_3821_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3827_ = ((i_3821_ & 0xff) * anInt10960 & 0xff00);
										i_3821_ = (i_3825_ | i_3826_ | i_3827_) >>> 8;
										int i_3828_ = is[i_3806_];
										is[i_3806_] = (((((i_3821_ & 0xff00ff) * anInt10934) + ((i_3828_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3821_ & 0xff00) * anInt10934) + ((i_3828_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_3829_ = (((i_3821_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3830_ = ((i_3821_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3831_ = ((i_3821_ & 0xff) * anInt10960 & 0xff00);
										is[i_3806_] = (i_3829_ | i_3830_ | i_3831_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3832_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								int i_3833_ = (i_3832_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3832_]) : 0);
								int i_3834_ = anInt10928;
								int i_3835_ = i_3833_ + i_3834_;
								int i_3836_ = ((i_3833_ & 0xff00ff) + (i_3834_ & 0xff00ff));
								int i_3837_ = ((i_3836_ & 0x1000100) + (i_3835_ - i_3836_ & 0x10000));
								i_3837_ = i_3835_ - i_3837_ | i_3837_ - (i_3837_ >>> 8);
								if (i_3833_ == 0 && anInt10934 != 255) {
									i_3833_ = i_3837_;
									i_3837_ = is[i_3806_];
									i_3837_ = ((((i_3833_ & 0xff00ff) * anInt10934 + ((i_3837_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_3833_ & 0xff00) * anInt10934 + ((i_3837_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_3806_] = i_3837_;
							} else if (i == 2) {
								int i_3838_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3838_ != 0) {
									int i_3839_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3838_ & 0xff]);
									int i_3840_ = ((i_3839_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3841_ = ((i_3839_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_3806_++] = ((i_3840_ | i_3841_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3313_ == 2) {
							if (i == 1) {
								int i_3842_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3842_ != 0) {
									int i_3843_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3842_ & 0xff]);
									int i_3844_ = is[i_3806_];
									int i_3845_ = i_3843_ + i_3844_;
									int i_3846_ = ((i_3843_ & 0xff00ff) + (i_3844_ & 0xff00ff));
									i_3844_ = ((i_3846_ & 0x1000100) + (i_3845_ - i_3846_ & 0x10000));
									is[i_3806_] = (i_3845_ - i_3844_ | i_3844_ - (i_3844_ >>> 8));
								}
							} else if (i == 0) {
								int i_3847_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3847_ != 0) {
									int i_3848_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3847_ & 0xff]);
									int i_3849_ = ((i_3848_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_3850_ = ((i_3848_ & 0xff00) * anInt10959 & 0xff0000);
									int i_3851_ = ((i_3848_ & 0xff) * anInt10960 & 0xff00);
									i_3848_ = (i_3849_ | i_3850_ | i_3851_) >>> 8;
									int i_3852_ = is[i_3806_];
									int i_3853_ = i_3848_ + i_3852_;
									int i_3854_ = ((i_3848_ & 0xff00ff) + (i_3852_ & 0xff00ff));
									i_3852_ = ((i_3854_ & 0x1000100) + (i_3853_ - i_3854_ & 0x10000));
									is[i_3806_] = (i_3853_ - i_3852_ | i_3852_ - (i_3852_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3855_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								int i_3856_ = (i_3855_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3855_]) : 0);
								int i_3857_ = anInt10928;
								int i_3858_ = i_3856_ + i_3857_;
								int i_3859_ = ((i_3856_ & 0xff00ff) + (i_3857_ & 0xff00ff));
								int i_3860_ = ((i_3859_ & 0x1000100) + (i_3858_ - i_3859_ & 0x10000));
								i_3860_ = i_3858_ - i_3860_ | i_3860_ - (i_3860_ >>> 8);
								if (i_3856_ == 0 && anInt10934 != 255) {
									i_3856_ = i_3860_;
									i_3860_ = is[i_3806_];
									i_3860_ = ((((i_3856_ & 0xff00ff) * anInt10934 + ((i_3860_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_3856_ & 0xff00) * anInt10934 + ((i_3860_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_3806_] = i_3860_;
							} else if (i == 2) {
								int i_3861_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3805_]);
								if (i_3861_ != 0) {
									int i_3862_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3861_ & 0xff]);
									int i_3863_ = ((i_3862_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3864_ = ((i_3862_ & 0xff00) * anInt10934 & 0xff0000);
									i_3862_ = (((i_3863_ | i_3864_) >>> 8) + anInt10963);
									int i_3865_ = is[i_3806_];
									int i_3866_ = i_3862_ + i_3865_;
									int i_3867_ = ((i_3862_ & 0xff00ff) + (i_3865_ & 0xff00ff));
									i_3865_ = ((i_3867_ & 0x1000100) + (i_3866_ - i_3867_ & 0x10000));
									is[i_3806_] = (i_3866_ - i_3865_ | i_3865_ - (i_3865_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3800_ += anInt10956;
						i_3801_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_3868_ = anInt10940; i_3868_ < 0; i_3868_++) {
					int i_3869_ = anInt10944;
					int i_3870_ = anInt10951 + anInt10953;
					int i_3871_ = anInt10952 + anInt10954;
					int i_3872_ = anInt10958;
					if (i_3870_ < 0) {
						int i_3873_ = (anInt10956 - 1 - i_3870_) / anInt10956;
						i_3872_ += i_3873_;
						i_3870_ += anInt10956 * i_3873_;
						i_3871_ += anInt10946 * i_3873_;
						i_3869_ += i_3873_;
					}
					int i_3874_;
					if ((i_3874_ = (1 + i_3870_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_3872_)
						i_3872_ = i_3874_;
					if (i_3871_ < 0) {
						i_3874_ = (anInt10946 - 1 - i_3871_) / anInt10946;
						i_3872_ += i_3874_;
						i_3870_ += anInt10956 * i_3874_;
						i_3871_ += anInt10946 * i_3874_;
						i_3869_ += i_3874_;
					}
					if ((i_3874_ = (1 + i_3871_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_3872_)
						i_3872_ = i_3874_;
					for (/**/; i_3872_ < 0; i_3872_++) {
						int i_3875_ = (((i_3871_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_3870_ >> 12));
						int i_3876_ = i_3869_++;
						if (i_3313_ == 0) {
							if (i == 1)
								is[i_3876_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]) & 0xff]);
							else if (i == 0) {
								int i_3877_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]) & 0xff]);
								int i_3878_ = ((i_3877_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_3879_ = ((i_3877_ & 0xff00) * anInt10959 & 0xff0000);
								int i_3880_ = (i_3877_ & 0xff) * anInt10960 & 0xff00;
								is[i_3876_] = (i_3878_ | i_3879_ | i_3880_) >>> 8;
							} else if (i == 3) {
								int i_3881_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]) & 0xff]);
								int i_3882_ = anInt10928;
								int i_3883_ = i_3881_ + i_3882_;
								int i_3884_ = ((i_3881_ & 0xff00ff) + (i_3882_ & 0xff00ff));
								int i_3885_ = ((i_3884_ & 0x1000100) + (i_3883_ - i_3884_ & 0x10000));
								is[i_3876_] = i_3883_ - i_3885_ | i_3885_ - (i_3885_ >>> 8);
							} else if (i == 2) {
								int i_3886_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]) & 0xff]);
								int i_3887_ = ((i_3886_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_3888_ = ((i_3886_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_3876_] = ((i_3887_ | i_3888_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_3313_ == 1) {
							if (i == 1) {
								int i_3889_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3889_ != 0)
									is[i_3876_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3889_ & 0xff]);
							} else if (i == 0) {
								int i_3890_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3890_ != 0) {
									int i_3891_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3890_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_3892_ = anInt10928 >>> 24;
										int i_3893_ = 256 - i_3892_;
										int i_3894_ = is[i_3876_];
										is[i_3876_] = ((((i_3891_ & 0xff00ff) * i_3892_ + ((i_3894_ & 0xff00ff) * i_3893_)) & ~0xff00ff) + (((i_3891_ & 0xff00) * i_3892_ + ((i_3894_ & 0xff00) * i_3893_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_3895_ = (((i_3891_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3896_ = ((i_3891_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3897_ = ((i_3891_ & 0xff) * anInt10960 & 0xff00);
										i_3891_ = (i_3895_ | i_3896_ | i_3897_) >>> 8;
										int i_3898_ = is[i_3876_];
										is[i_3876_] = (((((i_3891_ & 0xff00ff) * anInt10934) + ((i_3898_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3891_ & 0xff00) * anInt10934) + ((i_3898_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_3899_ = (((i_3891_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3900_ = ((i_3891_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3901_ = ((i_3891_ & 0xff) * anInt10960 & 0xff00);
										is[i_3876_] = (i_3899_ | i_3900_ | i_3901_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3902_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								int i_3903_ = (i_3902_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3902_]) : 0);
								int i_3904_ = anInt10928;
								int i_3905_ = i_3903_ + i_3904_;
								int i_3906_ = ((i_3903_ & 0xff00ff) + (i_3904_ & 0xff00ff));
								int i_3907_ = ((i_3906_ & 0x1000100) + (i_3905_ - i_3906_ & 0x10000));
								i_3907_ = i_3905_ - i_3907_ | i_3907_ - (i_3907_ >>> 8);
								if (i_3903_ == 0 && anInt10934 != 255) {
									i_3903_ = i_3907_;
									i_3907_ = is[i_3876_];
									i_3907_ = ((((i_3903_ & 0xff00ff) * anInt10934 + ((i_3907_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_3903_ & 0xff00) * anInt10934 + ((i_3907_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_3876_] = i_3907_;
							} else if (i == 2) {
								int i_3908_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3908_ != 0) {
									int i_3909_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3908_ & 0xff]);
									int i_3910_ = ((i_3909_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3911_ = ((i_3909_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_3876_++] = ((i_3910_ | i_3911_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3313_ == 2) {
							if (i == 1) {
								int i_3912_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3912_ != 0) {
									int i_3913_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3912_ & 0xff]);
									int i_3914_ = is[i_3876_];
									int i_3915_ = i_3913_ + i_3914_;
									int i_3916_ = ((i_3913_ & 0xff00ff) + (i_3914_ & 0xff00ff));
									i_3914_ = ((i_3916_ & 0x1000100) + (i_3915_ - i_3916_ & 0x10000));
									is[i_3876_] = (i_3915_ - i_3914_ | i_3914_ - (i_3914_ >>> 8));
								}
							} else if (i == 0) {
								int i_3917_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3917_ != 0) {
									int i_3918_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3917_ & 0xff]);
									int i_3919_ = ((i_3918_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_3920_ = ((i_3918_ & 0xff00) * anInt10959 & 0xff0000);
									int i_3921_ = ((i_3918_ & 0xff) * anInt10960 & 0xff00);
									i_3918_ = (i_3919_ | i_3920_ | i_3921_) >>> 8;
									int i_3922_ = is[i_3876_];
									int i_3923_ = i_3918_ + i_3922_;
									int i_3924_ = ((i_3918_ & 0xff00ff) + (i_3922_ & 0xff00ff));
									i_3922_ = ((i_3924_ & 0x1000100) + (i_3923_ - i_3924_ & 0x10000));
									is[i_3876_] = (i_3923_ - i_3922_ | i_3922_ - (i_3922_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3925_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								int i_3926_ = (i_3925_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3925_]) : 0);
								int i_3927_ = anInt10928;
								int i_3928_ = i_3926_ + i_3927_;
								int i_3929_ = ((i_3926_ & 0xff00ff) + (i_3927_ & 0xff00ff));
								int i_3930_ = ((i_3929_ & 0x1000100) + (i_3928_ - i_3929_ & 0x10000));
								i_3930_ = i_3928_ - i_3930_ | i_3930_ - (i_3930_ >>> 8);
								if (i_3926_ == 0 && anInt10934 != 255) {
									i_3926_ = i_3930_;
									i_3930_ = is[i_3876_];
									i_3930_ = ((((i_3926_ & 0xff00ff) * anInt10934 + ((i_3930_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_3926_ & 0xff00) * anInt10934 + ((i_3930_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_3876_] = i_3930_;
							} else if (i == 2) {
								int i_3931_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3875_]);
								if (i_3931_ != 0) {
									int i_3932_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3931_ & 0xff]);
									int i_3933_ = ((i_3932_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_3934_ = ((i_3932_ & 0xff00) * anInt10934 & 0xff0000);
									i_3932_ = (((i_3933_ | i_3934_) >>> 8) + anInt10963);
									int i_3935_ = is[i_3876_];
									int i_3936_ = i_3932_ + i_3935_;
									int i_3937_ = ((i_3932_ & 0xff00ff) + (i_3935_ & 0xff00ff));
									i_3935_ = ((i_3937_ & 0x1000100) + (i_3936_ - i_3937_ & 0x10000));
									is[i_3876_] = (i_3936_ - i_3935_ | i_3935_ - (i_3935_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3870_ += anInt10956;
						i_3871_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10052(int i, int i_3938_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_3939_ = anInt10940;
					while (i_3939_ < 0) {
						int i_3940_ = anInt10944;
						int i_3941_ = anInt10951;
						int i_3942_ = anInt10952;
						int i_3943_ = anInt10958;
						if (i_3941_ >= 0 && i_3942_ >= 0 && (i_3941_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_3942_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							for (/**/; i_3943_ < 0; i_3943_++) {
								int i_3944_ = ((i_3942_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_3941_ >> 12));
								int i_3945_ = i_3940_++;
								if (i_3938_ == 0) {
									if (i == 1)
										is[i_3945_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]) & 0xff)]);
									else if (i == 0) {
										int i_3946_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]) & 0xff)]);
										int i_3947_ = (((i_3946_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_3948_ = ((i_3946_ & 0xff00) * anInt10959 & 0xff0000);
										int i_3949_ = ((i_3946_ & 0xff) * anInt10960 & 0xff00);
										is[i_3945_] = (i_3947_ | i_3948_ | i_3949_) >>> 8;
									} else if (i == 3) {
										int i_3950_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]) & 0xff)]);
										int i_3951_ = anInt10928;
										int i_3952_ = i_3950_ + i_3951_;
										int i_3953_ = ((i_3950_ & 0xff00ff) + (i_3951_ & 0xff00ff));
										int i_3954_ = ((i_3953_ & 0x1000100) + (i_3952_ - i_3953_ & 0x10000));
										is[i_3945_] = (i_3952_ - i_3954_ | i_3954_ - (i_3954_ >>> 8));
									} else if (i == 2) {
										int i_3955_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]) & 0xff)]);
										int i_3956_ = (((i_3955_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_3957_ = ((i_3955_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_3945_] = ((i_3956_ | i_3957_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 1) {
									if (i == 1) {
										int i_3958_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_3958_ != 0)
											is[i_3945_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3958_ & 0xff]);
									} else if (i == 0) {
										int i_3959_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_3959_ != 0) {
											int i_3960_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3959_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_3961_ = anInt10928 >>> 24;
												int i_3962_ = 256 - i_3961_;
												int i_3963_ = is[i_3945_];
												is[i_3945_] = (((((i_3960_ & 0xff00ff) * i_3961_) + ((i_3963_ & 0xff00ff) * i_3962_)) & ~0xff00ff) + ((((i_3960_ & 0xff00) * i_3961_) + ((i_3963_ & 0xff00) * i_3962_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_3964_ = (((i_3960_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3965_ = (((i_3960_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3966_ = (((i_3960_ & 0xff) * anInt10960) & 0xff00);
												i_3960_ = (i_3964_ | i_3965_ | i_3966_) >>> 8;
												int i_3967_ = is[i_3945_];
												is[i_3945_] = (((((i_3960_ & 0xff00ff) * anInt10934) + ((i_3967_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3960_ & 0xff00) * anInt10934) + ((i_3967_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_3968_ = (((i_3960_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_3969_ = (((i_3960_ & 0xff00) * anInt10959) & 0xff0000);
												int i_3970_ = (((i_3960_ & 0xff) * anInt10960) & 0xff00);
												is[i_3945_] = (i_3968_ | i_3969_ | i_3970_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3971_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										int i_3972_ = (i_3971_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3971_]) : 0);
										int i_3973_ = anInt10928;
										int i_3974_ = i_3972_ + i_3973_;
										int i_3975_ = ((i_3972_ & 0xff00ff) + (i_3973_ & 0xff00ff));
										int i_3976_ = ((i_3975_ & 0x1000100) + (i_3974_ - i_3975_ & 0x10000));
										i_3976_ = (i_3974_ - i_3976_ | i_3976_ - (i_3976_ >>> 8));
										if (i_3972_ == 0 && anInt10934 != 255) {
											i_3972_ = i_3976_;
											i_3976_ = is[i_3945_];
											i_3976_ = (((((i_3972_ & 0xff00ff) * anInt10934) + ((i_3976_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3972_ & 0xff00) * anInt10934) + ((i_3976_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3945_] = i_3976_;
									} else if (i == 2) {
										int i_3977_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_3977_ != 0) {
											int i_3978_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3977_ & 0xff]);
											int i_3979_ = (((i_3978_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_3980_ = (((i_3978_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_3945_++] = (((i_3979_ | i_3980_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 2) {
									if (i == 1) {
										int i_3981_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_3981_ != 0) {
											int i_3982_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3981_ & 0xff]);
											int i_3983_ = is[i_3945_];
											int i_3984_ = i_3982_ + i_3983_;
											int i_3985_ = ((i_3982_ & 0xff00ff) + (i_3983_ & 0xff00ff));
											i_3983_ = ((i_3985_ & 0x1000100) + (i_3984_ - i_3985_ & 0x10000));
											is[i_3945_] = (i_3984_ - i_3983_ | i_3983_ - (i_3983_ >>> 8));
										}
									} else if (i == 0) {
										int i_3986_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_3986_ != 0) {
											int i_3987_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_3986_ & 0xff]);
											int i_3988_ = (((i_3987_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_3989_ = (((i_3987_ & 0xff00) * anInt10959) & 0xff0000);
											int i_3990_ = (((i_3987_ & 0xff) * anInt10960) & 0xff00);
											i_3987_ = (i_3988_ | i_3989_ | i_3990_) >>> 8;
											int i_3991_ = is[i_3945_];
											int i_3992_ = i_3987_ + i_3991_;
											int i_3993_ = ((i_3987_ & 0xff00ff) + (i_3991_ & 0xff00ff));
											i_3991_ = ((i_3993_ & 0x1000100) + (i_3992_ - i_3993_ & 0x10000));
											is[i_3945_] = (i_3992_ - i_3991_ | i_3991_ - (i_3991_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3994_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										int i_3995_ = (i_3994_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_3994_]) : 0);
										int i_3996_ = anInt10928;
										int i_3997_ = i_3995_ + i_3996_;
										int i_3998_ = ((i_3995_ & 0xff00ff) + (i_3996_ & 0xff00ff));
										int i_3999_ = ((i_3998_ & 0x1000100) + (i_3997_ - i_3998_ & 0x10000));
										i_3999_ = (i_3997_ - i_3999_ | i_3999_ - (i_3999_ >>> 8));
										if (i_3995_ == 0 && anInt10934 != 255) {
											i_3995_ = i_3999_;
											i_3999_ = is[i_3945_];
											i_3999_ = (((((i_3995_ & 0xff00ff) * anInt10934) + ((i_3999_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_3995_ & 0xff00) * anInt10934) + ((i_3999_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_3945_] = i_3999_;
									} else if (i == 2) {
										int i_4000_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_3944_]);
										if (i_4000_ != 0) {
											int i_4001_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4000_ & 0xff]);
											int i_4002_ = (((i_4001_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4003_ = (((i_4001_ & 0xff00) * anInt10934) & 0xff0000);
											i_4001_ = ((i_4002_ | i_4003_) >>> 8) + anInt10963;
											int i_4004_ = is[i_3945_];
											int i_4005_ = i_4001_ + i_4004_;
											int i_4006_ = ((i_4001_ & 0xff00ff) + (i_4004_ & 0xff00ff));
											i_4004_ = ((i_4006_ & 0x1000100) + (i_4005_ - i_4006_ & 0x10000));
											is[i_3945_] = (i_4005_ - i_4004_ | i_4004_ - (i_4004_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_3939_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_4007_ = anInt10940;
					while (i_4007_ < 0) {
						int i_4008_ = anInt10944;
						int i_4009_ = anInt10951;
						int i_4010_ = anInt10952 + anInt10954;
						int i_4011_ = anInt10958;
						if (i_4009_ >= 0 && (i_4009_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							int i_4012_;
							if ((i_4012_ = (i_4010_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_4012_ = (anInt10946 - i_4012_) / anInt10946;
								i_4011_ += i_4012_;
								i_4010_ += anInt10946 * i_4012_;
								i_4008_ += i_4012_;
							}
							if ((i_4012_ = (i_4010_ - anInt10946) / anInt10946) > i_4011_)
								i_4011_ = i_4012_;
							for (/**/; i_4011_ < 0; i_4011_++) {
								int i_4013_ = ((i_4010_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4009_ >> 12));
								int i_4014_ = i_4008_++;
								if (i_3938_ == 0) {
									if (i == 1)
										is[i_4014_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]) & 0xff)]);
									else if (i == 0) {
										int i_4015_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]) & 0xff)]);
										int i_4016_ = (((i_4015_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4017_ = ((i_4015_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4018_ = ((i_4015_ & 0xff) * anInt10960 & 0xff00);
										is[i_4014_] = (i_4016_ | i_4017_ | i_4018_) >>> 8;
									} else if (i == 3) {
										int i_4019_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]) & 0xff)]);
										int i_4020_ = anInt10928;
										int i_4021_ = i_4019_ + i_4020_;
										int i_4022_ = ((i_4019_ & 0xff00ff) + (i_4020_ & 0xff00ff));
										int i_4023_ = ((i_4022_ & 0x1000100) + (i_4021_ - i_4022_ & 0x10000));
										is[i_4014_] = (i_4021_ - i_4023_ | i_4023_ - (i_4023_ >>> 8));
									} else if (i == 2) {
										int i_4024_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]) & 0xff)]);
										int i_4025_ = (((i_4024_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4026_ = ((i_4024_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4014_] = ((i_4025_ | i_4026_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 1) {
									if (i == 1) {
										int i_4027_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4027_ != 0)
											is[i_4014_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4027_ & 0xff]);
									} else if (i == 0) {
										int i_4028_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4028_ != 0) {
											int i_4029_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4028_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4030_ = anInt10928 >>> 24;
												int i_4031_ = 256 - i_4030_;
												int i_4032_ = is[i_4014_];
												is[i_4014_] = (((((i_4029_ & 0xff00ff) * i_4030_) + ((i_4032_ & 0xff00ff) * i_4031_)) & ~0xff00ff) + ((((i_4029_ & 0xff00) * i_4030_) + ((i_4032_ & 0xff00) * i_4031_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4033_ = (((i_4029_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4034_ = (((i_4029_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4035_ = (((i_4029_ & 0xff) * anInt10960) & 0xff00);
												i_4029_ = (i_4033_ | i_4034_ | i_4035_) >>> 8;
												int i_4036_ = is[i_4014_];
												is[i_4014_] = (((((i_4029_ & 0xff00ff) * anInt10934) + ((i_4036_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4029_ & 0xff00) * anInt10934) + ((i_4036_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4037_ = (((i_4029_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4038_ = (((i_4029_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4039_ = (((i_4029_ & 0xff) * anInt10960) & 0xff00);
												is[i_4014_] = (i_4037_ | i_4038_ | i_4039_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4040_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										int i_4041_ = (i_4040_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4040_]) : 0);
										int i_4042_ = anInt10928;
										int i_4043_ = i_4041_ + i_4042_;
										int i_4044_ = ((i_4041_ & 0xff00ff) + (i_4042_ & 0xff00ff));
										int i_4045_ = ((i_4044_ & 0x1000100) + (i_4043_ - i_4044_ & 0x10000));
										i_4045_ = (i_4043_ - i_4045_ | i_4045_ - (i_4045_ >>> 8));
										if (i_4041_ == 0 && anInt10934 != 255) {
											i_4041_ = i_4045_;
											i_4045_ = is[i_4014_];
											i_4045_ = (((((i_4041_ & 0xff00ff) * anInt10934) + ((i_4045_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4041_ & 0xff00) * anInt10934) + ((i_4045_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4014_] = i_4045_;
									} else if (i == 2) {
										int i_4046_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4046_ != 0) {
											int i_4047_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4046_ & 0xff]);
											int i_4048_ = (((i_4047_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4049_ = (((i_4047_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4014_++] = (((i_4048_ | i_4049_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 2) {
									if (i == 1) {
										int i_4050_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4050_ != 0) {
											int i_4051_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4050_ & 0xff]);
											int i_4052_ = is[i_4014_];
											int i_4053_ = i_4051_ + i_4052_;
											int i_4054_ = ((i_4051_ & 0xff00ff) + (i_4052_ & 0xff00ff));
											i_4052_ = ((i_4054_ & 0x1000100) + (i_4053_ - i_4054_ & 0x10000));
											is[i_4014_] = (i_4053_ - i_4052_ | i_4052_ - (i_4052_ >>> 8));
										}
									} else if (i == 0) {
										int i_4055_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4055_ != 0) {
											int i_4056_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4055_ & 0xff]);
											int i_4057_ = (((i_4056_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4058_ = (((i_4056_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4059_ = (((i_4056_ & 0xff) * anInt10960) & 0xff00);
											i_4056_ = (i_4057_ | i_4058_ | i_4059_) >>> 8;
											int i_4060_ = is[i_4014_];
											int i_4061_ = i_4056_ + i_4060_;
											int i_4062_ = ((i_4056_ & 0xff00ff) + (i_4060_ & 0xff00ff));
											i_4060_ = ((i_4062_ & 0x1000100) + (i_4061_ - i_4062_ & 0x10000));
											is[i_4014_] = (i_4061_ - i_4060_ | i_4060_ - (i_4060_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4063_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										int i_4064_ = (i_4063_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4063_]) : 0);
										int i_4065_ = anInt10928;
										int i_4066_ = i_4064_ + i_4065_;
										int i_4067_ = ((i_4064_ & 0xff00ff) + (i_4065_ & 0xff00ff));
										int i_4068_ = ((i_4067_ & 0x1000100) + (i_4066_ - i_4067_ & 0x10000));
										i_4068_ = (i_4066_ - i_4068_ | i_4068_ - (i_4068_ >>> 8));
										if (i_4064_ == 0 && anInt10934 != 255) {
											i_4064_ = i_4068_;
											i_4068_ = is[i_4014_];
											i_4068_ = (((((i_4064_ & 0xff00ff) * anInt10934) + ((i_4068_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4064_ & 0xff00) * anInt10934) + ((i_4068_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4014_] = i_4068_;
									} else if (i == 2) {
										int i_4069_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4013_]);
										if (i_4069_ != 0) {
											int i_4070_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4069_ & 0xff]);
											int i_4071_ = (((i_4070_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4072_ = (((i_4070_ & 0xff00) * anInt10934) & 0xff0000);
											i_4070_ = ((i_4071_ | i_4072_) >>> 8) + anInt10963;
											int i_4073_ = is[i_4014_];
											int i_4074_ = i_4070_ + i_4073_;
											int i_4075_ = ((i_4070_ & 0xff00ff) + (i_4073_ & 0xff00ff));
											i_4073_ = ((i_4075_ & 0x1000100) + (i_4074_ - i_4075_ & 0x10000));
											is[i_4014_] = (i_4074_ - i_4073_ | i_4073_ - (i_4073_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4010_ += anInt10946;
							}
						}
						i_4007_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_4076_ = anInt10940;
					while (i_4076_ < 0) {
						int i_4077_ = anInt10944;
						int i_4078_ = anInt10951;
						int i_4079_ = anInt10952 + anInt10954;
						int i_4080_ = anInt10958;
						if (i_4078_ >= 0 && (i_4078_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							if (i_4079_ < 0) {
								int i_4081_ = (anInt10946 - 1 - i_4079_) / anInt10946;
								i_4080_ += i_4081_;
								i_4079_ += anInt10946 * i_4081_;
								i_4077_ += i_4081_;
							}
							int i_4082_;
							if ((i_4082_ = (1 + i_4079_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_4080_)
								i_4080_ = i_4082_;
							for (/**/; i_4080_ < 0; i_4080_++) {
								int i_4083_ = ((i_4079_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4078_ >> 12));
								int i_4084_ = i_4077_++;
								if (i_3938_ == 0) {
									if (i == 1)
										is[i_4084_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]) & 0xff)]);
									else if (i == 0) {
										int i_4085_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]) & 0xff)]);
										int i_4086_ = (((i_4085_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4087_ = ((i_4085_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4088_ = ((i_4085_ & 0xff) * anInt10960 & 0xff00);
										is[i_4084_] = (i_4086_ | i_4087_ | i_4088_) >>> 8;
									} else if (i == 3) {
										int i_4089_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]) & 0xff)]);
										int i_4090_ = anInt10928;
										int i_4091_ = i_4089_ + i_4090_;
										int i_4092_ = ((i_4089_ & 0xff00ff) + (i_4090_ & 0xff00ff));
										int i_4093_ = ((i_4092_ & 0x1000100) + (i_4091_ - i_4092_ & 0x10000));
										is[i_4084_] = (i_4091_ - i_4093_ | i_4093_ - (i_4093_ >>> 8));
									} else if (i == 2) {
										int i_4094_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]) & 0xff)]);
										int i_4095_ = (((i_4094_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4096_ = ((i_4094_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4084_] = ((i_4095_ | i_4096_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 1) {
									if (i == 1) {
										int i_4097_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4097_ != 0)
											is[i_4084_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4097_ & 0xff]);
									} else if (i == 0) {
										int i_4098_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4098_ != 0) {
											int i_4099_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4098_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4100_ = anInt10928 >>> 24;
												int i_4101_ = 256 - i_4100_;
												int i_4102_ = is[i_4084_];
												is[i_4084_] = (((((i_4099_ & 0xff00ff) * i_4100_) + ((i_4102_ & 0xff00ff) * i_4101_)) & ~0xff00ff) + ((((i_4099_ & 0xff00) * i_4100_) + ((i_4102_ & 0xff00) * i_4101_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4103_ = (((i_4099_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4104_ = (((i_4099_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4105_ = (((i_4099_ & 0xff) * anInt10960) & 0xff00);
												i_4099_ = (i_4103_ | i_4104_ | i_4105_) >>> 8;
												int i_4106_ = is[i_4084_];
												is[i_4084_] = (((((i_4099_ & 0xff00ff) * anInt10934) + ((i_4106_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4099_ & 0xff00) * anInt10934) + ((i_4106_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4107_ = (((i_4099_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4108_ = (((i_4099_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4109_ = (((i_4099_ & 0xff) * anInt10960) & 0xff00);
												is[i_4084_] = (i_4107_ | i_4108_ | i_4109_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4110_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										int i_4111_ = (i_4110_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4110_]) : 0);
										int i_4112_ = anInt10928;
										int i_4113_ = i_4111_ + i_4112_;
										int i_4114_ = ((i_4111_ & 0xff00ff) + (i_4112_ & 0xff00ff));
										int i_4115_ = ((i_4114_ & 0x1000100) + (i_4113_ - i_4114_ & 0x10000));
										i_4115_ = (i_4113_ - i_4115_ | i_4115_ - (i_4115_ >>> 8));
										if (i_4111_ == 0 && anInt10934 != 255) {
											i_4111_ = i_4115_;
											i_4115_ = is[i_4084_];
											i_4115_ = (((((i_4111_ & 0xff00ff) * anInt10934) + ((i_4115_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4111_ & 0xff00) * anInt10934) + ((i_4115_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4084_] = i_4115_;
									} else if (i == 2) {
										int i_4116_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4116_ != 0) {
											int i_4117_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4116_ & 0xff]);
											int i_4118_ = (((i_4117_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4119_ = (((i_4117_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4084_++] = (((i_4118_ | i_4119_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 2) {
									if (i == 1) {
										int i_4120_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4120_ != 0) {
											int i_4121_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4120_ & 0xff]);
											int i_4122_ = is[i_4084_];
											int i_4123_ = i_4121_ + i_4122_;
											int i_4124_ = ((i_4121_ & 0xff00ff) + (i_4122_ & 0xff00ff));
											i_4122_ = ((i_4124_ & 0x1000100) + (i_4123_ - i_4124_ & 0x10000));
											is[i_4084_] = (i_4123_ - i_4122_ | i_4122_ - (i_4122_ >>> 8));
										}
									} else if (i == 0) {
										int i_4125_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4125_ != 0) {
											int i_4126_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4125_ & 0xff]);
											int i_4127_ = (((i_4126_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4128_ = (((i_4126_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4129_ = (((i_4126_ & 0xff) * anInt10960) & 0xff00);
											i_4126_ = (i_4127_ | i_4128_ | i_4129_) >>> 8;
											int i_4130_ = is[i_4084_];
											int i_4131_ = i_4126_ + i_4130_;
											int i_4132_ = ((i_4126_ & 0xff00ff) + (i_4130_ & 0xff00ff));
											i_4130_ = ((i_4132_ & 0x1000100) + (i_4131_ - i_4132_ & 0x10000));
											is[i_4084_] = (i_4131_ - i_4130_ | i_4130_ - (i_4130_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4133_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										int i_4134_ = (i_4133_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4133_]) : 0);
										int i_4135_ = anInt10928;
										int i_4136_ = i_4134_ + i_4135_;
										int i_4137_ = ((i_4134_ & 0xff00ff) + (i_4135_ & 0xff00ff));
										int i_4138_ = ((i_4137_ & 0x1000100) + (i_4136_ - i_4137_ & 0x10000));
										i_4138_ = (i_4136_ - i_4138_ | i_4138_ - (i_4138_ >>> 8));
										if (i_4134_ == 0 && anInt10934 != 255) {
											i_4134_ = i_4138_;
											i_4138_ = is[i_4084_];
											i_4138_ = (((((i_4134_ & 0xff00ff) * anInt10934) + ((i_4138_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4134_ & 0xff00) * anInt10934) + ((i_4138_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4084_] = i_4138_;
									} else if (i == 2) {
										int i_4139_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4083_]);
										if (i_4139_ != 0) {
											int i_4140_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4139_ & 0xff]);
											int i_4141_ = (((i_4140_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4142_ = (((i_4140_ & 0xff00) * anInt10934) & 0xff0000);
											i_4140_ = ((i_4141_ | i_4142_) >>> 8) + anInt10963;
											int i_4143_ = is[i_4084_];
											int i_4144_ = i_4140_ + i_4143_;
											int i_4145_ = ((i_4140_ & 0xff00ff) + (i_4143_ & 0xff00ff));
											i_4143_ = ((i_4145_ & 0x1000100) + (i_4144_ - i_4145_ & 0x10000));
											is[i_4084_] = (i_4144_ - i_4143_ | i_4143_ - (i_4143_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4079_ += anInt10946;
							}
						}
						i_4076_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_4146_ = anInt10940;
					while (i_4146_ < 0) {
						int i_4147_ = anInt10944;
						int i_4148_ = anInt10951 + anInt10953;
						int i_4149_ = anInt10952;
						int i_4150_ = anInt10958;
						if (i_4149_ >= 0 && (i_4149_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							int i_4151_;
							if ((i_4151_ = (i_4148_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_4151_ = (anInt10956 - i_4151_) / anInt10956;
								i_4150_ += i_4151_;
								i_4148_ += anInt10956 * i_4151_;
								i_4147_ += i_4151_;
							}
							if ((i_4151_ = (i_4148_ - anInt10956) / anInt10956) > i_4150_)
								i_4150_ = i_4151_;
							for (/**/; i_4150_ < 0; i_4150_++) {
								int i_4152_ = ((i_4149_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4148_ >> 12));
								int i_4153_ = i_4147_++;
								if (i_3938_ == 0) {
									if (i == 1)
										is[i_4153_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]) & 0xff)]);
									else if (i == 0) {
										int i_4154_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]) & 0xff)]);
										int i_4155_ = (((i_4154_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4156_ = ((i_4154_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4157_ = ((i_4154_ & 0xff) * anInt10960 & 0xff00);
										is[i_4153_] = (i_4155_ | i_4156_ | i_4157_) >>> 8;
									} else if (i == 3) {
										int i_4158_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]) & 0xff)]);
										int i_4159_ = anInt10928;
										int i_4160_ = i_4158_ + i_4159_;
										int i_4161_ = ((i_4158_ & 0xff00ff) + (i_4159_ & 0xff00ff));
										int i_4162_ = ((i_4161_ & 0x1000100) + (i_4160_ - i_4161_ & 0x10000));
										is[i_4153_] = (i_4160_ - i_4162_ | i_4162_ - (i_4162_ >>> 8));
									} else if (i == 2) {
										int i_4163_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]) & 0xff)]);
										int i_4164_ = (((i_4163_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4165_ = ((i_4163_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4153_] = ((i_4164_ | i_4165_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 1) {
									if (i == 1) {
										int i_4166_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4166_ != 0)
											is[i_4153_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4166_ & 0xff]);
									} else if (i == 0) {
										int i_4167_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4167_ != 0) {
											int i_4168_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4167_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4169_ = anInt10928 >>> 24;
												int i_4170_ = 256 - i_4169_;
												int i_4171_ = is[i_4153_];
												is[i_4153_] = (((((i_4168_ & 0xff00ff) * i_4169_) + ((i_4171_ & 0xff00ff) * i_4170_)) & ~0xff00ff) + ((((i_4168_ & 0xff00) * i_4169_) + ((i_4171_ & 0xff00) * i_4170_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4172_ = (((i_4168_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4173_ = (((i_4168_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4174_ = (((i_4168_ & 0xff) * anInt10960) & 0xff00);
												i_4168_ = (i_4172_ | i_4173_ | i_4174_) >>> 8;
												int i_4175_ = is[i_4153_];
												is[i_4153_] = (((((i_4168_ & 0xff00ff) * anInt10934) + ((i_4175_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4168_ & 0xff00) * anInt10934) + ((i_4175_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4176_ = (((i_4168_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4177_ = (((i_4168_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4178_ = (((i_4168_ & 0xff) * anInt10960) & 0xff00);
												is[i_4153_] = (i_4176_ | i_4177_ | i_4178_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4179_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										int i_4180_ = (i_4179_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4179_]) : 0);
										int i_4181_ = anInt10928;
										int i_4182_ = i_4180_ + i_4181_;
										int i_4183_ = ((i_4180_ & 0xff00ff) + (i_4181_ & 0xff00ff));
										int i_4184_ = ((i_4183_ & 0x1000100) + (i_4182_ - i_4183_ & 0x10000));
										i_4184_ = (i_4182_ - i_4184_ | i_4184_ - (i_4184_ >>> 8));
										if (i_4180_ == 0 && anInt10934 != 255) {
											i_4180_ = i_4184_;
											i_4184_ = is[i_4153_];
											i_4184_ = (((((i_4180_ & 0xff00ff) * anInt10934) + ((i_4184_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4180_ & 0xff00) * anInt10934) + ((i_4184_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4153_] = i_4184_;
									} else if (i == 2) {
										int i_4185_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4185_ != 0) {
											int i_4186_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4185_ & 0xff]);
											int i_4187_ = (((i_4186_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4188_ = (((i_4186_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4153_++] = (((i_4187_ | i_4188_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3938_ == 2) {
									if (i == 1) {
										int i_4189_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4189_ != 0) {
											int i_4190_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4189_ & 0xff]);
											int i_4191_ = is[i_4153_];
											int i_4192_ = i_4190_ + i_4191_;
											int i_4193_ = ((i_4190_ & 0xff00ff) + (i_4191_ & 0xff00ff));
											i_4191_ = ((i_4193_ & 0x1000100) + (i_4192_ - i_4193_ & 0x10000));
											is[i_4153_] = (i_4192_ - i_4191_ | i_4191_ - (i_4191_ >>> 8));
										}
									} else if (i == 0) {
										int i_4194_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4194_ != 0) {
											int i_4195_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4194_ & 0xff]);
											int i_4196_ = (((i_4195_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4197_ = (((i_4195_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4198_ = (((i_4195_ & 0xff) * anInt10960) & 0xff00);
											i_4195_ = (i_4196_ | i_4197_ | i_4198_) >>> 8;
											int i_4199_ = is[i_4153_];
											int i_4200_ = i_4195_ + i_4199_;
											int i_4201_ = ((i_4195_ & 0xff00ff) + (i_4199_ & 0xff00ff));
											i_4199_ = ((i_4201_ & 0x1000100) + (i_4200_ - i_4201_ & 0x10000));
											is[i_4153_] = (i_4200_ - i_4199_ | i_4199_ - (i_4199_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4202_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										int i_4203_ = (i_4202_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4202_]) : 0);
										int i_4204_ = anInt10928;
										int i_4205_ = i_4203_ + i_4204_;
										int i_4206_ = ((i_4203_ & 0xff00ff) + (i_4204_ & 0xff00ff));
										int i_4207_ = ((i_4206_ & 0x1000100) + (i_4205_ - i_4206_ & 0x10000));
										i_4207_ = (i_4205_ - i_4207_ | i_4207_ - (i_4207_ >>> 8));
										if (i_4203_ == 0 && anInt10934 != 255) {
											i_4203_ = i_4207_;
											i_4207_ = is[i_4153_];
											i_4207_ = (((((i_4203_ & 0xff00ff) * anInt10934) + ((i_4207_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4203_ & 0xff00) * anInt10934) + ((i_4207_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4153_] = i_4207_;
									} else if (i == 2) {
										int i_4208_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4152_]);
										if (i_4208_ != 0) {
											int i_4209_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4208_ & 0xff]);
											int i_4210_ = (((i_4209_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4211_ = (((i_4209_ & 0xff00) * anInt10934) & 0xff0000);
											i_4209_ = ((i_4210_ | i_4211_) >>> 8) + anInt10963;
											int i_4212_ = is[i_4153_];
											int i_4213_ = i_4209_ + i_4212_;
											int i_4214_ = ((i_4209_ & 0xff00ff) + (i_4212_ & 0xff00ff));
											i_4212_ = ((i_4214_ & 0x1000100) + (i_4213_ - i_4214_ & 0x10000));
											is[i_4153_] = (i_4213_ - i_4212_ | i_4212_ - (i_4212_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4148_ += anInt10956;
							}
						}
						i_4146_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_4215_ = anInt10940;
					while (i_4215_ < 0) {
						int i_4216_ = anInt10944;
						int i_4217_ = anInt10951 + anInt10953;
						int i_4218_ = anInt10952 + anInt10954;
						int i_4219_ = anInt10958;
						int i_4220_;
						if ((i_4220_ = i_4217_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_4220_ = (anInt10956 - i_4220_) / anInt10956;
							i_4219_ += i_4220_;
							i_4217_ += anInt10956 * i_4220_;
							i_4218_ += anInt10946 * i_4220_;
							i_4216_ += i_4220_;
						}
						if ((i_4220_ = (i_4217_ - anInt10956) / anInt10956) > i_4219_)
							i_4219_ = i_4220_;
						if ((i_4220_ = i_4218_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_4220_ = (anInt10946 - i_4220_) / anInt10946;
							i_4219_ += i_4220_;
							i_4217_ += anInt10956 * i_4220_;
							i_4218_ += anInt10946 * i_4220_;
							i_4216_ += i_4220_;
						}
						if ((i_4220_ = (i_4218_ - anInt10946) / anInt10946) > i_4219_)
							i_4219_ = i_4220_;
						for (/**/; i_4219_ < 0; i_4219_++) {
							int i_4221_ = (((i_4218_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4217_ >> 12));
							int i_4222_ = i_4216_++;
							if (i_3938_ == 0) {
								if (i == 1)
									is[i_4222_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]) & 0xff)]);
								else if (i == 0) {
									int i_4223_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]) & 0xff)]);
									int i_4224_ = ((i_4223_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_4225_ = ((i_4223_ & 0xff00) * anInt10959 & 0xff0000);
									int i_4226_ = ((i_4223_ & 0xff) * anInt10960 & 0xff00);
									is[i_4222_] = (i_4224_ | i_4225_ | i_4226_) >>> 8;
								} else if (i == 3) {
									int i_4227_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]) & 0xff)]);
									int i_4228_ = anInt10928;
									int i_4229_ = i_4227_ + i_4228_;
									int i_4230_ = ((i_4227_ & 0xff00ff) + (i_4228_ & 0xff00ff));
									int i_4231_ = ((i_4230_ & 0x1000100) + (i_4229_ - i_4230_ & 0x10000));
									is[i_4222_] = (i_4229_ - i_4231_ | i_4231_ - (i_4231_ >>> 8));
								} else if (i == 2) {
									int i_4232_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]) & 0xff)]);
									int i_4233_ = ((i_4232_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4234_ = ((i_4232_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4222_] = (((i_4233_ | i_4234_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 1) {
								if (i == 1) {
									int i_4235_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4235_ != 0)
										is[i_4222_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4235_ & 0xff]);
								} else if (i == 0) {
									int i_4236_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4236_ != 0) {
										int i_4237_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4236_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_4238_ = anInt10928 >>> 24;
											int i_4239_ = 256 - i_4238_;
											int i_4240_ = is[i_4222_];
											is[i_4222_] = (((((i_4237_ & 0xff00ff) * i_4238_) + ((i_4240_ & 0xff00ff) * i_4239_)) & ~0xff00ff) + ((((i_4237_ & 0xff00) * i_4238_) + ((i_4240_ & 0xff00) * i_4239_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_4241_ = (((i_4237_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4242_ = (((i_4237_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4243_ = (((i_4237_ & 0xff) * anInt10960) & 0xff00);
											i_4237_ = (i_4241_ | i_4242_ | i_4243_) >>> 8;
											int i_4244_ = is[i_4222_];
											is[i_4222_] = (((((i_4237_ & 0xff00ff) * anInt10934) + ((i_4244_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4237_ & 0xff00) * anInt10934) + ((i_4244_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_4245_ = (((i_4237_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4246_ = (((i_4237_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4247_ = (((i_4237_ & 0xff) * anInt10960) & 0xff00);
											is[i_4222_] = (i_4245_ | i_4246_ | i_4247_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4248_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									int i_4249_ = (i_4248_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4248_]) : 0);
									int i_4250_ = anInt10928;
									int i_4251_ = i_4249_ + i_4250_;
									int i_4252_ = ((i_4249_ & 0xff00ff) + (i_4250_ & 0xff00ff));
									int i_4253_ = ((i_4252_ & 0x1000100) + (i_4251_ - i_4252_ & 0x10000));
									i_4253_ = (i_4251_ - i_4253_ | i_4253_ - (i_4253_ >>> 8));
									if (i_4249_ == 0 && anInt10934 != 255) {
										i_4249_ = i_4253_;
										i_4253_ = is[i_4222_];
										i_4253_ = (((((i_4249_ & 0xff00ff) * anInt10934) + ((i_4253_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4249_ & 0xff00) * anInt10934) + ((i_4253_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4222_] = i_4253_;
								} else if (i == 2) {
									int i_4254_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4254_ != 0) {
										int i_4255_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4254_ & 0xff]);
										int i_4256_ = (((i_4255_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4257_ = ((i_4255_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4222_++] = ((i_4256_ | i_4257_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 2) {
								if (i == 1) {
									int i_4258_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4258_ != 0) {
										int i_4259_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4258_ & 0xff]);
										int i_4260_ = is[i_4222_];
										int i_4261_ = i_4259_ + i_4260_;
										int i_4262_ = ((i_4259_ & 0xff00ff) + (i_4260_ & 0xff00ff));
										i_4260_ = ((i_4262_ & 0x1000100) + (i_4261_ - i_4262_ & 0x10000));
										is[i_4222_] = (i_4261_ - i_4260_ | i_4260_ - (i_4260_ >>> 8));
									}
								} else if (i == 0) {
									int i_4263_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4263_ != 0) {
										int i_4264_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4263_ & 0xff]);
										int i_4265_ = (((i_4264_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4266_ = ((i_4264_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4267_ = ((i_4264_ & 0xff) * anInt10960 & 0xff00);
										i_4264_ = (i_4265_ | i_4266_ | i_4267_) >>> 8;
										int i_4268_ = is[i_4222_];
										int i_4269_ = i_4264_ + i_4268_;
										int i_4270_ = ((i_4264_ & 0xff00ff) + (i_4268_ & 0xff00ff));
										i_4268_ = ((i_4270_ & 0x1000100) + (i_4269_ - i_4270_ & 0x10000));
										is[i_4222_] = (i_4269_ - i_4268_ | i_4268_ - (i_4268_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4271_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									int i_4272_ = (i_4271_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4271_]) : 0);
									int i_4273_ = anInt10928;
									int i_4274_ = i_4272_ + i_4273_;
									int i_4275_ = ((i_4272_ & 0xff00ff) + (i_4273_ & 0xff00ff));
									int i_4276_ = ((i_4275_ & 0x1000100) + (i_4274_ - i_4275_ & 0x10000));
									i_4276_ = (i_4274_ - i_4276_ | i_4276_ - (i_4276_ >>> 8));
									if (i_4272_ == 0 && anInt10934 != 255) {
										i_4272_ = i_4276_;
										i_4276_ = is[i_4222_];
										i_4276_ = (((((i_4272_ & 0xff00ff) * anInt10934) + ((i_4276_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4272_ & 0xff00) * anInt10934) + ((i_4276_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4222_] = i_4276_;
								} else if (i == 2) {
									int i_4277_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4221_]);
									if (i_4277_ != 0) {
										int i_4278_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4277_ & 0xff]);
										int i_4279_ = (((i_4278_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4280_ = ((i_4278_ & 0xff00) * anInt10934 & 0xff0000);
										i_4278_ = (((i_4279_ | i_4280_) >>> 8) + anInt10963);
										int i_4281_ = is[i_4222_];
										int i_4282_ = i_4278_ + i_4281_;
										int i_4283_ = ((i_4278_ & 0xff00ff) + (i_4281_ & 0xff00ff));
										i_4281_ = ((i_4283_ & 0x1000100) + (i_4282_ - i_4283_ & 0x10000));
										is[i_4222_] = (i_4282_ - i_4281_ | i_4281_ - (i_4281_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4217_ += anInt10956;
							i_4218_ += anInt10946;
						}
						i_4215_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_4284_ = anInt10940;
					while (i_4284_ < 0) {
						int i_4285_ = anInt10944;
						int i_4286_ = anInt10951 + anInt10953;
						int i_4287_ = anInt10952 + anInt10954;
						int i_4288_ = anInt10958;
						int i_4289_;
						if ((i_4289_ = i_4286_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_4289_ = (anInt10956 - i_4289_) / anInt10956;
							i_4288_ += i_4289_;
							i_4286_ += anInt10956 * i_4289_;
							i_4287_ += anInt10946 * i_4289_;
							i_4285_ += i_4289_;
						}
						if ((i_4289_ = (i_4286_ - anInt10956) / anInt10956) > i_4288_)
							i_4288_ = i_4289_;
						if (i_4287_ < 0) {
							i_4289_ = (anInt10946 - 1 - i_4287_) / anInt10946;
							i_4288_ += i_4289_;
							i_4286_ += anInt10956 * i_4289_;
							i_4287_ += anInt10946 * i_4289_;
							i_4285_ += i_4289_;
						}
						if ((i_4289_ = (1 + i_4287_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_4288_)
							i_4288_ = i_4289_;
						for (/**/; i_4288_ < 0; i_4288_++) {
							int i_4290_ = (((i_4287_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4286_ >> 12));
							int i_4291_ = i_4285_++;
							if (i_3938_ == 0) {
								if (i == 1)
									is[i_4291_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]) & 0xff)]);
								else if (i == 0) {
									int i_4292_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]) & 0xff)]);
									int i_4293_ = ((i_4292_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_4294_ = ((i_4292_ & 0xff00) * anInt10959 & 0xff0000);
									int i_4295_ = ((i_4292_ & 0xff) * anInt10960 & 0xff00);
									is[i_4291_] = (i_4293_ | i_4294_ | i_4295_) >>> 8;
								} else if (i == 3) {
									int i_4296_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]) & 0xff)]);
									int i_4297_ = anInt10928;
									int i_4298_ = i_4296_ + i_4297_;
									int i_4299_ = ((i_4296_ & 0xff00ff) + (i_4297_ & 0xff00ff));
									int i_4300_ = ((i_4299_ & 0x1000100) + (i_4298_ - i_4299_ & 0x10000));
									is[i_4291_] = (i_4298_ - i_4300_ | i_4300_ - (i_4300_ >>> 8));
								} else if (i == 2) {
									int i_4301_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]) & 0xff)]);
									int i_4302_ = ((i_4301_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4303_ = ((i_4301_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4291_] = (((i_4302_ | i_4303_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 1) {
								if (i == 1) {
									int i_4304_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4304_ != 0)
										is[i_4291_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4304_ & 0xff]);
								} else if (i == 0) {
									int i_4305_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4305_ != 0) {
										int i_4306_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4305_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_4307_ = anInt10928 >>> 24;
											int i_4308_ = 256 - i_4307_;
											int i_4309_ = is[i_4291_];
											is[i_4291_] = (((((i_4306_ & 0xff00ff) * i_4307_) + ((i_4309_ & 0xff00ff) * i_4308_)) & ~0xff00ff) + ((((i_4306_ & 0xff00) * i_4307_) + ((i_4309_ & 0xff00) * i_4308_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_4310_ = (((i_4306_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4311_ = (((i_4306_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4312_ = (((i_4306_ & 0xff) * anInt10960) & 0xff00);
											i_4306_ = (i_4310_ | i_4311_ | i_4312_) >>> 8;
											int i_4313_ = is[i_4291_];
											is[i_4291_] = (((((i_4306_ & 0xff00ff) * anInt10934) + ((i_4313_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4306_ & 0xff00) * anInt10934) + ((i_4313_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_4314_ = (((i_4306_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4315_ = (((i_4306_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4316_ = (((i_4306_ & 0xff) * anInt10960) & 0xff00);
											is[i_4291_] = (i_4314_ | i_4315_ | i_4316_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4317_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									int i_4318_ = (i_4317_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4317_]) : 0);
									int i_4319_ = anInt10928;
									int i_4320_ = i_4318_ + i_4319_;
									int i_4321_ = ((i_4318_ & 0xff00ff) + (i_4319_ & 0xff00ff));
									int i_4322_ = ((i_4321_ & 0x1000100) + (i_4320_ - i_4321_ & 0x10000));
									i_4322_ = (i_4320_ - i_4322_ | i_4322_ - (i_4322_ >>> 8));
									if (i_4318_ == 0 && anInt10934 != 255) {
										i_4318_ = i_4322_;
										i_4322_ = is[i_4291_];
										i_4322_ = (((((i_4318_ & 0xff00ff) * anInt10934) + ((i_4322_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4318_ & 0xff00) * anInt10934) + ((i_4322_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4291_] = i_4322_;
								} else if (i == 2) {
									int i_4323_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4323_ != 0) {
										int i_4324_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4323_ & 0xff]);
										int i_4325_ = (((i_4324_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4326_ = ((i_4324_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4291_++] = ((i_4325_ | i_4326_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 2) {
								if (i == 1) {
									int i_4327_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4327_ != 0) {
										int i_4328_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4327_ & 0xff]);
										int i_4329_ = is[i_4291_];
										int i_4330_ = i_4328_ + i_4329_;
										int i_4331_ = ((i_4328_ & 0xff00ff) + (i_4329_ & 0xff00ff));
										i_4329_ = ((i_4331_ & 0x1000100) + (i_4330_ - i_4331_ & 0x10000));
										is[i_4291_] = (i_4330_ - i_4329_ | i_4329_ - (i_4329_ >>> 8));
									}
								} else if (i == 0) {
									int i_4332_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4332_ != 0) {
										int i_4333_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4332_ & 0xff]);
										int i_4334_ = (((i_4333_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4335_ = ((i_4333_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4336_ = ((i_4333_ & 0xff) * anInt10960 & 0xff00);
										i_4333_ = (i_4334_ | i_4335_ | i_4336_) >>> 8;
										int i_4337_ = is[i_4291_];
										int i_4338_ = i_4333_ + i_4337_;
										int i_4339_ = ((i_4333_ & 0xff00ff) + (i_4337_ & 0xff00ff));
										i_4337_ = ((i_4339_ & 0x1000100) + (i_4338_ - i_4339_ & 0x10000));
										is[i_4291_] = (i_4338_ - i_4337_ | i_4337_ - (i_4337_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4340_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									int i_4341_ = (i_4340_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4340_]) : 0);
									int i_4342_ = anInt10928;
									int i_4343_ = i_4341_ + i_4342_;
									int i_4344_ = ((i_4341_ & 0xff00ff) + (i_4342_ & 0xff00ff));
									int i_4345_ = ((i_4344_ & 0x1000100) + (i_4343_ - i_4344_ & 0x10000));
									i_4345_ = (i_4343_ - i_4345_ | i_4345_ - (i_4345_ >>> 8));
									if (i_4341_ == 0 && anInt10934 != 255) {
										i_4341_ = i_4345_;
										i_4345_ = is[i_4291_];
										i_4345_ = (((((i_4341_ & 0xff00ff) * anInt10934) + ((i_4345_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4341_ & 0xff00) * anInt10934) + ((i_4345_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4291_] = i_4345_;
								} else if (i == 2) {
									int i_4346_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4290_]);
									if (i_4346_ != 0) {
										int i_4347_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4346_ & 0xff]);
										int i_4348_ = (((i_4347_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4349_ = ((i_4347_ & 0xff00) * anInt10934 & 0xff0000);
										i_4347_ = (((i_4348_ | i_4349_) >>> 8) + anInt10963);
										int i_4350_ = is[i_4291_];
										int i_4351_ = i_4347_ + i_4350_;
										int i_4352_ = ((i_4347_ & 0xff00ff) + (i_4350_ & 0xff00ff));
										i_4350_ = ((i_4352_ & 0x1000100) + (i_4351_ - i_4352_ & 0x10000));
										is[i_4291_] = (i_4351_ - i_4350_ | i_4350_ - (i_4350_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4286_ += anInt10956;
							i_4287_ += anInt10946;
						}
						i_4284_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_4353_ = anInt10940;
				while (i_4353_ < 0) {
					int i_4354_ = anInt10944;
					int i_4355_ = anInt10951 + anInt10953;
					int i_4356_ = anInt10952;
					int i_4357_ = anInt10958;
					if (i_4356_ >= 0 && i_4356_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
						if (i_4355_ < 0) {
							int i_4358_ = (anInt10956 - 1 - i_4355_) / anInt10956;
							i_4357_ += i_4358_;
							i_4355_ += anInt10956 * i_4358_;
							i_4354_ += i_4358_;
						}
						int i_4359_;
						if ((i_4359_ = (1 + i_4355_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_4357_)
							i_4357_ = i_4359_;
						for (/**/; i_4357_ < 0; i_4357_++) {
							int i_4360_ = (((i_4356_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4355_ >> 12));
							int i_4361_ = i_4354_++;
							if (i_3938_ == 0) {
								if (i == 1)
									is[i_4361_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]) & 0xff)]);
								else if (i == 0) {
									int i_4362_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]) & 0xff)]);
									int i_4363_ = ((i_4362_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_4364_ = ((i_4362_ & 0xff00) * anInt10959 & 0xff0000);
									int i_4365_ = ((i_4362_ & 0xff) * anInt10960 & 0xff00);
									is[i_4361_] = (i_4363_ | i_4364_ | i_4365_) >>> 8;
								} else if (i == 3) {
									int i_4366_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]) & 0xff)]);
									int i_4367_ = anInt10928;
									int i_4368_ = i_4366_ + i_4367_;
									int i_4369_ = ((i_4366_ & 0xff00ff) + (i_4367_ & 0xff00ff));
									int i_4370_ = ((i_4369_ & 0x1000100) + (i_4368_ - i_4369_ & 0x10000));
									is[i_4361_] = (i_4368_ - i_4370_ | i_4370_ - (i_4370_ >>> 8));
								} else if (i == 2) {
									int i_4371_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]) & 0xff)]);
									int i_4372_ = ((i_4371_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4373_ = ((i_4371_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4361_] = (((i_4372_ | i_4373_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 1) {
								if (i == 1) {
									int i_4374_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4374_ != 0)
										is[i_4361_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4374_ & 0xff]);
								} else if (i == 0) {
									int i_4375_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4375_ != 0) {
										int i_4376_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4375_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_4377_ = anInt10928 >>> 24;
											int i_4378_ = 256 - i_4377_;
											int i_4379_ = is[i_4361_];
											is[i_4361_] = (((((i_4376_ & 0xff00ff) * i_4377_) + ((i_4379_ & 0xff00ff) * i_4378_)) & ~0xff00ff) + ((((i_4376_ & 0xff00) * i_4377_) + ((i_4379_ & 0xff00) * i_4378_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_4380_ = (((i_4376_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4381_ = (((i_4376_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4382_ = (((i_4376_ & 0xff) * anInt10960) & 0xff00);
											i_4376_ = (i_4380_ | i_4381_ | i_4382_) >>> 8;
											int i_4383_ = is[i_4361_];
											is[i_4361_] = (((((i_4376_ & 0xff00ff) * anInt10934) + ((i_4383_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4376_ & 0xff00) * anInt10934) + ((i_4383_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_4384_ = (((i_4376_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4385_ = (((i_4376_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4386_ = (((i_4376_ & 0xff) * anInt10960) & 0xff00);
											is[i_4361_] = (i_4384_ | i_4385_ | i_4386_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4387_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									int i_4388_ = (i_4387_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4387_]) : 0);
									int i_4389_ = anInt10928;
									int i_4390_ = i_4388_ + i_4389_;
									int i_4391_ = ((i_4388_ & 0xff00ff) + (i_4389_ & 0xff00ff));
									int i_4392_ = ((i_4391_ & 0x1000100) + (i_4390_ - i_4391_ & 0x10000));
									i_4392_ = (i_4390_ - i_4392_ | i_4392_ - (i_4392_ >>> 8));
									if (i_4388_ == 0 && anInt10934 != 255) {
										i_4388_ = i_4392_;
										i_4392_ = is[i_4361_];
										i_4392_ = (((((i_4388_ & 0xff00ff) * anInt10934) + ((i_4392_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4388_ & 0xff00) * anInt10934) + ((i_4392_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4361_] = i_4392_;
								} else if (i == 2) {
									int i_4393_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4393_ != 0) {
										int i_4394_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4393_ & 0xff]);
										int i_4395_ = (((i_4394_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4396_ = ((i_4394_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4361_++] = ((i_4395_ | i_4396_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3938_ == 2) {
								if (i == 1) {
									int i_4397_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4397_ != 0) {
										int i_4398_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4397_ & 0xff]);
										int i_4399_ = is[i_4361_];
										int i_4400_ = i_4398_ + i_4399_;
										int i_4401_ = ((i_4398_ & 0xff00ff) + (i_4399_ & 0xff00ff));
										i_4399_ = ((i_4401_ & 0x1000100) + (i_4400_ - i_4401_ & 0x10000));
										is[i_4361_] = (i_4400_ - i_4399_ | i_4399_ - (i_4399_ >>> 8));
									}
								} else if (i == 0) {
									int i_4402_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4402_ != 0) {
										int i_4403_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4402_ & 0xff]);
										int i_4404_ = (((i_4403_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4405_ = ((i_4403_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4406_ = ((i_4403_ & 0xff) * anInt10960 & 0xff00);
										i_4403_ = (i_4404_ | i_4405_ | i_4406_) >>> 8;
										int i_4407_ = is[i_4361_];
										int i_4408_ = i_4403_ + i_4407_;
										int i_4409_ = ((i_4403_ & 0xff00ff) + (i_4407_ & 0xff00ff));
										i_4407_ = ((i_4409_ & 0x1000100) + (i_4408_ - i_4409_ & 0x10000));
										is[i_4361_] = (i_4408_ - i_4407_ | i_4407_ - (i_4407_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4410_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									int i_4411_ = (i_4410_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4410_]) : 0);
									int i_4412_ = anInt10928;
									int i_4413_ = i_4411_ + i_4412_;
									int i_4414_ = ((i_4411_ & 0xff00ff) + (i_4412_ & 0xff00ff));
									int i_4415_ = ((i_4414_ & 0x1000100) + (i_4413_ - i_4414_ & 0x10000));
									i_4415_ = (i_4413_ - i_4415_ | i_4415_ - (i_4415_ >>> 8));
									if (i_4411_ == 0 && anInt10934 != 255) {
										i_4411_ = i_4415_;
										i_4415_ = is[i_4361_];
										i_4415_ = (((((i_4411_ & 0xff00ff) * anInt10934) + ((i_4415_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4411_ & 0xff00) * anInt10934) + ((i_4415_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4361_] = i_4415_;
								} else if (i == 2) {
									int i_4416_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4360_]);
									if (i_4416_ != 0) {
										int i_4417_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4416_ & 0xff]);
										int i_4418_ = (((i_4417_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4419_ = ((i_4417_ & 0xff00) * anInt10934 & 0xff0000);
										i_4417_ = (((i_4418_ | i_4419_) >>> 8) + anInt10963);
										int i_4420_ = is[i_4361_];
										int i_4421_ = i_4417_ + i_4420_;
										int i_4422_ = ((i_4417_ & 0xff00ff) + (i_4420_ & 0xff00ff));
										i_4420_ = ((i_4422_ & 0x1000100) + (i_4421_ - i_4422_ & 0x10000));
										is[i_4361_] = (i_4421_ - i_4420_ | i_4420_ - (i_4420_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4355_ += anInt10956;
						}
					}
					i_4353_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_4423_ = anInt10940; i_4423_ < 0; i_4423_++) {
					int i_4424_ = anInt10944;
					int i_4425_ = anInt10951 + anInt10953;
					int i_4426_ = anInt10952 + anInt10954;
					int i_4427_ = anInt10958;
					if (i_4425_ < 0) {
						int i_4428_ = (anInt10956 - 1 - i_4425_) / anInt10956;
						i_4427_ += i_4428_;
						i_4425_ += anInt10956 * i_4428_;
						i_4426_ += anInt10946 * i_4428_;
						i_4424_ += i_4428_;
					}
					int i_4429_;
					if ((i_4429_ = (1 + i_4425_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_4427_)
						i_4427_ = i_4429_;
					if ((i_4429_ = i_4426_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
						i_4429_ = (anInt10946 - i_4429_) / anInt10946;
						i_4427_ += i_4429_;
						i_4425_ += anInt10956 * i_4429_;
						i_4426_ += anInt10946 * i_4429_;
						i_4424_ += i_4429_;
					}
					if ((i_4429_ = (i_4426_ - anInt10946) / anInt10946) > i_4427_)
						i_4427_ = i_4429_;
					for (/**/; i_4427_ < 0; i_4427_++) {
						int i_4430_ = (((i_4426_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4425_ >> 12));
						int i_4431_ = i_4424_++;
						if (i_3938_ == 0) {
							if (i == 1)
								is[i_4431_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]) & 0xff]);
							else if (i == 0) {
								int i_4432_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]) & 0xff]);
								int i_4433_ = ((i_4432_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_4434_ = ((i_4432_ & 0xff00) * anInt10959 & 0xff0000);
								int i_4435_ = (i_4432_ & 0xff) * anInt10960 & 0xff00;
								is[i_4431_] = (i_4433_ | i_4434_ | i_4435_) >>> 8;
							} else if (i == 3) {
								int i_4436_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]) & 0xff]);
								int i_4437_ = anInt10928;
								int i_4438_ = i_4436_ + i_4437_;
								int i_4439_ = ((i_4436_ & 0xff00ff) + (i_4437_ & 0xff00ff));
								int i_4440_ = ((i_4439_ & 0x1000100) + (i_4438_ - i_4439_ & 0x10000));
								is[i_4431_] = i_4438_ - i_4440_ | i_4440_ - (i_4440_ >>> 8);
							} else if (i == 2) {
								int i_4441_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]) & 0xff]);
								int i_4442_ = ((i_4441_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_4443_ = ((i_4441_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_4431_] = ((i_4442_ | i_4443_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_3938_ == 1) {
							if (i == 1) {
								int i_4444_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4444_ != 0)
									is[i_4431_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4444_ & 0xff]);
							} else if (i == 0) {
								int i_4445_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4445_ != 0) {
									int i_4446_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4445_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_4447_ = anInt10928 >>> 24;
										int i_4448_ = 256 - i_4447_;
										int i_4449_ = is[i_4431_];
										is[i_4431_] = ((((i_4446_ & 0xff00ff) * i_4447_ + ((i_4449_ & 0xff00ff) * i_4448_)) & ~0xff00ff) + (((i_4446_ & 0xff00) * i_4447_ + ((i_4449_ & 0xff00) * i_4448_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_4450_ = (((i_4446_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4451_ = ((i_4446_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4452_ = ((i_4446_ & 0xff) * anInt10960 & 0xff00);
										i_4446_ = (i_4450_ | i_4451_ | i_4452_) >>> 8;
										int i_4453_ = is[i_4431_];
										is[i_4431_] = (((((i_4446_ & 0xff00ff) * anInt10934) + ((i_4453_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4446_ & 0xff00) * anInt10934) + ((i_4453_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_4454_ = (((i_4446_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4455_ = ((i_4446_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4456_ = ((i_4446_ & 0xff) * anInt10960 & 0xff00);
										is[i_4431_] = (i_4454_ | i_4455_ | i_4456_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_4457_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								int i_4458_ = (i_4457_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4457_]) : 0);
								int i_4459_ = anInt10928;
								int i_4460_ = i_4458_ + i_4459_;
								int i_4461_ = ((i_4458_ & 0xff00ff) + (i_4459_ & 0xff00ff));
								int i_4462_ = ((i_4461_ & 0x1000100) + (i_4460_ - i_4461_ & 0x10000));
								i_4462_ = i_4460_ - i_4462_ | i_4462_ - (i_4462_ >>> 8);
								if (i_4458_ == 0 && anInt10934 != 255) {
									i_4458_ = i_4462_;
									i_4462_ = is[i_4431_];
									i_4462_ = ((((i_4458_ & 0xff00ff) * anInt10934 + ((i_4462_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_4458_ & 0xff00) * anInt10934 + ((i_4462_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_4431_] = i_4462_;
							} else if (i == 2) {
								int i_4463_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4463_ != 0) {
									int i_4464_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4463_ & 0xff]);
									int i_4465_ = ((i_4464_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4466_ = ((i_4464_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4431_++] = ((i_4465_ | i_4466_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3938_ == 2) {
							if (i == 1) {
								int i_4467_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4467_ != 0) {
									int i_4468_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4467_ & 0xff]);
									int i_4469_ = is[i_4431_];
									int i_4470_ = i_4468_ + i_4469_;
									int i_4471_ = ((i_4468_ & 0xff00ff) + (i_4469_ & 0xff00ff));
									i_4469_ = ((i_4471_ & 0x1000100) + (i_4470_ - i_4471_ & 0x10000));
									is[i_4431_] = (i_4470_ - i_4469_ | i_4469_ - (i_4469_ >>> 8));
								}
							} else if (i == 0) {
								int i_4472_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4472_ != 0) {
									int i_4473_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4472_ & 0xff]);
									int i_4474_ = ((i_4473_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_4475_ = ((i_4473_ & 0xff00) * anInt10959 & 0xff0000);
									int i_4476_ = ((i_4473_ & 0xff) * anInt10960 & 0xff00);
									i_4473_ = (i_4474_ | i_4475_ | i_4476_) >>> 8;
									int i_4477_ = is[i_4431_];
									int i_4478_ = i_4473_ + i_4477_;
									int i_4479_ = ((i_4473_ & 0xff00ff) + (i_4477_ & 0xff00ff));
									i_4477_ = ((i_4479_ & 0x1000100) + (i_4478_ - i_4479_ & 0x10000));
									is[i_4431_] = (i_4478_ - i_4477_ | i_4477_ - (i_4477_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4480_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								int i_4481_ = (i_4480_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4480_]) : 0);
								int i_4482_ = anInt10928;
								int i_4483_ = i_4481_ + i_4482_;
								int i_4484_ = ((i_4481_ & 0xff00ff) + (i_4482_ & 0xff00ff));
								int i_4485_ = ((i_4484_ & 0x1000100) + (i_4483_ - i_4484_ & 0x10000));
								i_4485_ = i_4483_ - i_4485_ | i_4485_ - (i_4485_ >>> 8);
								if (i_4481_ == 0 && anInt10934 != 255) {
									i_4481_ = i_4485_;
									i_4485_ = is[i_4431_];
									i_4485_ = ((((i_4481_ & 0xff00ff) * anInt10934 + ((i_4485_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_4481_ & 0xff00) * anInt10934 + ((i_4485_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_4431_] = i_4485_;
							} else if (i == 2) {
								int i_4486_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4430_]);
								if (i_4486_ != 0) {
									int i_4487_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4486_ & 0xff]);
									int i_4488_ = ((i_4487_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4489_ = ((i_4487_ & 0xff00) * anInt10934 & 0xff0000);
									i_4487_ = (((i_4488_ | i_4489_) >>> 8) + anInt10963);
									int i_4490_ = is[i_4431_];
									int i_4491_ = i_4487_ + i_4490_;
									int i_4492_ = ((i_4487_ & 0xff00ff) + (i_4490_ & 0xff00ff));
									i_4490_ = ((i_4492_ & 0x1000100) + (i_4491_ - i_4492_ & 0x10000));
									is[i_4431_] = (i_4491_ - i_4490_ | i_4490_ - (i_4490_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_4425_ += anInt10956;
						i_4426_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_4493_ = anInt10940; i_4493_ < 0; i_4493_++) {
					int i_4494_ = anInt10944;
					int i_4495_ = anInt10951 + anInt10953;
					int i_4496_ = anInt10952 + anInt10954;
					int i_4497_ = anInt10958;
					if (i_4495_ < 0) {
						int i_4498_ = (anInt10956 - 1 - i_4495_) / anInt10956;
						i_4497_ += i_4498_;
						i_4495_ += anInt10956 * i_4498_;
						i_4496_ += anInt10946 * i_4498_;
						i_4494_ += i_4498_;
					}
					int i_4499_;
					if ((i_4499_ = (1 + i_4495_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_4497_)
						i_4497_ = i_4499_;
					if (i_4496_ < 0) {
						i_4499_ = (anInt10946 - 1 - i_4496_) / anInt10946;
						i_4497_ += i_4499_;
						i_4495_ += anInt10956 * i_4499_;
						i_4496_ += anInt10946 * i_4499_;
						i_4494_ += i_4499_;
					}
					if ((i_4499_ = (1 + i_4496_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_4497_)
						i_4497_ = i_4499_;
					for (/**/; i_4497_ < 0; i_4497_++) {
						int i_4500_ = (((i_4496_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4495_ >> 12));
						int i_4501_ = i_4494_++;
						if (i_3938_ == 0) {
							if (i == 1)
								is[i_4501_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]) & 0xff]);
							else if (i == 0) {
								int i_4502_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]) & 0xff]);
								int i_4503_ = ((i_4502_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_4504_ = ((i_4502_ & 0xff00) * anInt10959 & 0xff0000);
								int i_4505_ = (i_4502_ & 0xff) * anInt10960 & 0xff00;
								is[i_4501_] = (i_4503_ | i_4504_ | i_4505_) >>> 8;
							} else if (i == 3) {
								int i_4506_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]) & 0xff]);
								int i_4507_ = anInt10928;
								int i_4508_ = i_4506_ + i_4507_;
								int i_4509_ = ((i_4506_ & 0xff00ff) + (i_4507_ & 0xff00ff));
								int i_4510_ = ((i_4509_ & 0x1000100) + (i_4508_ - i_4509_ & 0x10000));
								is[i_4501_] = i_4508_ - i_4510_ | i_4510_ - (i_4510_ >>> 8);
							} else if (i == 2) {
								int i_4511_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]) & 0xff]);
								int i_4512_ = ((i_4511_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_4513_ = ((i_4511_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_4501_] = ((i_4512_ | i_4513_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_3938_ == 1) {
							if (i == 1) {
								int i_4514_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4514_ != 0)
									is[i_4501_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4514_ & 0xff]);
							} else if (i == 0) {
								int i_4515_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4515_ != 0) {
									int i_4516_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4515_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_4517_ = anInt10928 >>> 24;
										int i_4518_ = 256 - i_4517_;
										int i_4519_ = is[i_4501_];
										is[i_4501_] = ((((i_4516_ & 0xff00ff) * i_4517_ + ((i_4519_ & 0xff00ff) * i_4518_)) & ~0xff00ff) + (((i_4516_ & 0xff00) * i_4517_ + ((i_4519_ & 0xff00) * i_4518_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_4520_ = (((i_4516_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4521_ = ((i_4516_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4522_ = ((i_4516_ & 0xff) * anInt10960 & 0xff00);
										i_4516_ = (i_4520_ | i_4521_ | i_4522_) >>> 8;
										int i_4523_ = is[i_4501_];
										is[i_4501_] = (((((i_4516_ & 0xff00ff) * anInt10934) + ((i_4523_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4516_ & 0xff00) * anInt10934) + ((i_4523_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_4524_ = (((i_4516_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4525_ = ((i_4516_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4526_ = ((i_4516_ & 0xff) * anInt10960 & 0xff00);
										is[i_4501_] = (i_4524_ | i_4525_ | i_4526_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_4527_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								int i_4528_ = (i_4527_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4527_]) : 0);
								int i_4529_ = anInt10928;
								int i_4530_ = i_4528_ + i_4529_;
								int i_4531_ = ((i_4528_ & 0xff00ff) + (i_4529_ & 0xff00ff));
								int i_4532_ = ((i_4531_ & 0x1000100) + (i_4530_ - i_4531_ & 0x10000));
								i_4532_ = i_4530_ - i_4532_ | i_4532_ - (i_4532_ >>> 8);
								if (i_4528_ == 0 && anInt10934 != 255) {
									i_4528_ = i_4532_;
									i_4532_ = is[i_4501_];
									i_4532_ = ((((i_4528_ & 0xff00ff) * anInt10934 + ((i_4532_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_4528_ & 0xff00) * anInt10934 + ((i_4532_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_4501_] = i_4532_;
							} else if (i == 2) {
								int i_4533_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4533_ != 0) {
									int i_4534_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4533_ & 0xff]);
									int i_4535_ = ((i_4534_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4536_ = ((i_4534_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4501_++] = ((i_4535_ | i_4536_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3938_ == 2) {
							if (i == 1) {
								int i_4537_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4537_ != 0) {
									int i_4538_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4537_ & 0xff]);
									int i_4539_ = is[i_4501_];
									int i_4540_ = i_4538_ + i_4539_;
									int i_4541_ = ((i_4538_ & 0xff00ff) + (i_4539_ & 0xff00ff));
									i_4539_ = ((i_4541_ & 0x1000100) + (i_4540_ - i_4541_ & 0x10000));
									is[i_4501_] = (i_4540_ - i_4539_ | i_4539_ - (i_4539_ >>> 8));
								}
							} else if (i == 0) {
								int i_4542_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4542_ != 0) {
									int i_4543_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4542_ & 0xff]);
									int i_4544_ = ((i_4543_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_4545_ = ((i_4543_ & 0xff00) * anInt10959 & 0xff0000);
									int i_4546_ = ((i_4543_ & 0xff) * anInt10960 & 0xff00);
									i_4543_ = (i_4544_ | i_4545_ | i_4546_) >>> 8;
									int i_4547_ = is[i_4501_];
									int i_4548_ = i_4543_ + i_4547_;
									int i_4549_ = ((i_4543_ & 0xff00ff) + (i_4547_ & 0xff00ff));
									i_4547_ = ((i_4549_ & 0x1000100) + (i_4548_ - i_4549_ & 0x10000));
									is[i_4501_] = (i_4548_ - i_4547_ | i_4547_ - (i_4547_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4550_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								int i_4551_ = (i_4550_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4550_]) : 0);
								int i_4552_ = anInt10928;
								int i_4553_ = i_4551_ + i_4552_;
								int i_4554_ = ((i_4551_ & 0xff00ff) + (i_4552_ & 0xff00ff));
								int i_4555_ = ((i_4554_ & 0x1000100) + (i_4553_ - i_4554_ & 0x10000));
								i_4555_ = i_4553_ - i_4555_ | i_4555_ - (i_4555_ >>> 8);
								if (i_4551_ == 0 && anInt10934 != 255) {
									i_4551_ = i_4555_;
									i_4555_ = is[i_4501_];
									i_4555_ = ((((i_4551_ & 0xff00ff) * anInt10934 + ((i_4555_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_4551_ & 0xff00) * anInt10934 + ((i_4555_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_4501_] = i_4555_;
							} else if (i == 2) {
								int i_4556_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4500_]);
								if (i_4556_ != 0) {
									int i_4557_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4556_ & 0xff]);
									int i_4558_ = ((i_4557_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_4559_ = ((i_4557_ & 0xff00) * anInt10934 & 0xff0000);
									i_4557_ = (((i_4558_ | i_4559_) >>> 8) + anInt10963);
									int i_4560_ = is[i_4501_];
									int i_4561_ = i_4557_ + i_4560_;
									int i_4562_ = ((i_4557_ & 0xff00ff) + (i_4560_ & 0xff00ff));
									i_4560_ = ((i_4562_ & 0x1000100) + (i_4561_ - i_4562_ & 0x10000));
									is[i_4501_] = (i_4561_ - i_4560_ | i_4560_ - (i_4560_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_4495_ += anInt10956;
						i_4496_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method2623(int i, int i_4563_, int i_4564_, int i_4565_, int i_4566_, int i_4567_, int i_4568_, int i_4569_) {
		if (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932.method9517())
			throw new IllegalStateException();
		if (i_4564_ > 0 && i_4565_ > 0) {
			int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
			if (is != null) {
				int i_4570_ = 0;
				int i_4571_ = 0;
				int i_4572_ = (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10217 * -994907113);
				int i_4573_ = (((Class161_Sub3_Sub1) this).anInt10942 + ((Class161_Sub3_Sub1) this).anInt10945 + ((Class161_Sub3_Sub1) this).anInt10933);
				int i_4574_ = (((Class161_Sub3_Sub1) this).anInt10929 + ((Class161_Sub3_Sub1) this).anInt10930 + ((Class161_Sub3_Sub1) this).anInt10948);
				int i_4575_ = (i_4573_ << 16) / i_4564_;
				int i_4576_ = (i_4574_ << 16) / i_4565_;
				if (((Class161_Sub3_Sub1) this).anInt10942 > 0) {
					int i_4577_ = (((((Class161_Sub3_Sub1) this).anInt10942 << 16) + i_4575_ - 1) / i_4575_);
					i += i_4577_;
					i_4570_ += (i_4577_ * i_4575_ - (((Class161_Sub3_Sub1) this).anInt10942 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10929 > 0) {
					int i_4578_ = (((((Class161_Sub3_Sub1) this).anInt10929 << 16) + i_4576_ - 1) / i_4576_);
					i_4563_ += i_4578_;
					i_4571_ += (i_4578_ * i_4576_ - (((Class161_Sub3_Sub1) this).anInt10929 << 16));
				}
				if (((Class161_Sub3_Sub1) this).anInt10945 < i_4573_)
					i_4564_ = ((((Class161_Sub3_Sub1) this).anInt10945 << 16) - i_4570_ + i_4575_ - 1) / i_4575_;
				if (((Class161_Sub3_Sub1) this).anInt10930 < i_4574_)
					i_4565_ = ((((Class161_Sub3_Sub1) this).anInt10930 << 16) - i_4571_ + i_4576_ - 1) / i_4576_;
				int i_4579_ = i + i_4563_ * i_4572_;
				int i_4580_ = i_4572_ - i_4564_;
				if (i_4563_ + i_4565_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223 * 1704244235))
					i_4565_ -= (i_4563_ + i_4565_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10223) * 1704244235);
				if (i_4563_ < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10222) * 2029354259) {
					int i_4581_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10222) * 2029354259 - i_4563_);
					i_4565_ -= i_4581_;
					i_4579_ += i_4581_ * i_4572_;
					i_4571_ += i_4576_ * i_4581_;
				}
				if (i + i_4564_ > (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221 * 892939761)) {
					int i_4582_ = (i + i_4564_ - (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10221) * 892939761);
					i_4564_ -= i_4582_;
					i_4580_ += i_4582_;
				}
				if (i < (((Class106_Sub2) (((Class161_Sub3_Sub1) this).aClass106_Sub2_10932)).anInt10220 * 1179466163)) {
					int i_4583_ = ((((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anInt10220) * 1179466163 - i);
					i_4564_ -= i_4583_;
					i_4579_ += i_4583_;
					i_4570_ += i_4575_ * i_4583_;
					i_4580_ += i_4583_;
				}
				if (i_4568_ == 0) {
					if (i_4566_ == 1) {
						int i_4584_ = i_4570_;
						for (int i_4585_ = -i_4565_; i_4585_ < 0; i_4585_++) {
							int i_4586_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4587_ = -i_4564_; i_4587_ < 0; i_4587_++) {
								is[i_4579_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4586_]) & 0xff]);
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4584_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 0) {
						int i_4588_ = (i_4567_ & 0xff0000) >> 16;
						int i_4589_ = (i_4567_ & 0xff00) >> 8;
						int i_4590_ = i_4567_ & 0xff;
						int i_4591_ = i_4570_;
						for (int i_4592_ = -i_4565_; i_4592_ < 0; i_4592_++) {
							int i_4593_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4594_ = -i_4564_; i_4594_ < 0; i_4594_++) {
								int i_4595_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4593_]) & 0xff]);
								int i_4596_ = ((i_4595_ & 0xff0000) * i_4588_ & ~0xffffff);
								int i_4597_ = (i_4595_ & 0xff00) * i_4589_ & 0xff0000;
								int i_4598_ = (i_4595_ & 0xff) * i_4590_ & 0xff00;
								is[i_4579_++] = (i_4596_ | i_4597_ | i_4598_) >>> 8;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4591_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 3) {
						int i_4599_ = i_4570_;
						for (int i_4600_ = -i_4565_; i_4600_ < 0; i_4600_++) {
							int i_4601_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4602_ = -i_4564_; i_4602_ < 0; i_4602_++) {
								byte i_4603_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4601_]);
								int i_4604_ = (i_4603_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4603_]) : 0);
								int i_4605_ = i_4604_ + i_4567_;
								int i_4606_ = ((i_4604_ & 0xff00ff) + (i_4567_ & 0xff00ff));
								int i_4607_ = ((i_4606_ & 0x1000100) + (i_4605_ - i_4606_ & 0x10000));
								is[i_4579_++] = i_4605_ - i_4607_ | i_4607_ - (i_4607_ >>> 8);
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4599_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 2) {
						int i_4608_ = i_4567_ >>> 24;
						int i_4609_ = 256 - i_4608_;
						int i_4610_ = (i_4567_ & 0xff00ff) * i_4609_ & ~0xff00ff;
						int i_4611_ = (i_4567_ & 0xff00) * i_4609_ & 0xff0000;
						i_4567_ = (i_4610_ | i_4611_) >>> 8;
						int i_4612_ = i_4570_;
						for (int i_4613_ = -i_4565_; i_4613_ < 0; i_4613_++) {
							int i_4614_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4615_ = -i_4564_; i_4615_ < 0; i_4615_++) {
								int i_4616_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4614_]) & 0xff]);
								i_4610_ = ((i_4616_ & 0xff00ff) * i_4608_ & ~0xff00ff);
								i_4611_ = (i_4616_ & 0xff00) * i_4608_ & 0xff0000;
								is[i_4579_++] = ((i_4610_ | i_4611_) >>> 8) + i_4567_;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4612_;
							i_4579_ += i_4580_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_4568_ == 1) {
					if (i_4566_ == 1) {
						int i_4617_ = i_4570_;
						for (int i_4618_ = -i_4565_; i_4618_ < 0; i_4618_++) {
							int i_4619_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4620_ = -i_4564_; i_4620_ < 0; i_4620_++) {
								int i_4621_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4619_]);
								if (i_4621_ != 0)
									is[i_4579_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4621_ & 0xff]);
								else
									i_4579_++;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4617_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 0) {
						int i_4622_ = i_4570_;
						if ((i_4567_ & 0xffffff) == 16777215) {
							int i_4623_ = i_4567_ >>> 24;
							int i_4624_ = 256 - i_4623_;
							for (int i_4625_ = -i_4565_; i_4625_ < 0; i_4625_++) {
								int i_4626_ = ((i_4571_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_4627_ = -i_4564_; i_4627_ < 0; i_4627_++) {
									int i_4628_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4626_]);
									if (i_4628_ != 0) {
										int i_4629_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4628_ & 0xff]);
										int i_4630_ = is[i_4579_];
										is[i_4579_++] = ((((i_4629_ & 0xff00ff) * i_4623_ + ((i_4630_ & 0xff00ff) * i_4624_)) & ~0xff00ff) + (((i_4629_ & 0xff00) * i_4623_ + ((i_4630_ & 0xff00) * i_4624_)) & 0xff0000)) >> 8;
									} else
										i_4579_++;
									i_4570_ += i_4575_;
								}
								i_4571_ += i_4576_;
								i_4570_ = i_4622_;
								i_4579_ += i_4580_;
							}
						} else {
							int i_4631_ = (i_4567_ & 0xff0000) >> 16;
							int i_4632_ = (i_4567_ & 0xff00) >> 8;
							int i_4633_ = i_4567_ & 0xff;
							int i_4634_ = i_4567_ >>> 24;
							int i_4635_ = 256 - i_4634_;
							for (int i_4636_ = -i_4565_; i_4636_ < 0; i_4636_++) {
								int i_4637_ = ((i_4571_ >> 16) * (((Class161_Sub3_Sub1) this).anInt10945));
								for (int i_4638_ = -i_4564_; i_4638_ < 0; i_4638_++) {
									int i_4639_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4637_]);
									if (i_4639_ != 0) {
										int i_4640_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4639_ & 0xff]);
										if (i_4634_ != 255) {
											int i_4641_ = (((i_4640_ & 0xff0000) * i_4631_) & ~0xffffff);
											int i_4642_ = ((i_4640_ & 0xff00) * i_4632_ & 0xff0000);
											int i_4643_ = ((i_4640_ & 0xff) * i_4633_ & 0xff00);
											i_4640_ = (i_4641_ | i_4642_ | i_4643_) >>> 8;
											int i_4644_ = is[i_4579_];
											is[i_4579_++] = (((((i_4640_ & 0xff00ff) * i_4634_) + ((i_4644_ & 0xff00ff) * i_4635_)) & ~0xff00ff) + ((((i_4640_ & 0xff00) * i_4634_) + ((i_4644_ & 0xff00) * i_4635_)) & 0xff0000)) >> 8;
										} else {
											int i_4645_ = (((i_4640_ & 0xff0000) * i_4631_) & ~0xffffff);
											int i_4646_ = ((i_4640_ & 0xff00) * i_4632_ & 0xff0000);
											int i_4647_ = ((i_4640_ & 0xff) * i_4633_ & 0xff00);
											is[i_4579_++] = (i_4645_ | i_4646_ | i_4647_) >>> 8;
										}
									} else
										i_4579_++;
									i_4570_ += i_4575_;
								}
								i_4571_ += i_4576_;
								i_4570_ = i_4622_;
								i_4579_ += i_4580_;
							}
						}
					} else if (i_4566_ == 3) {
						int i_4648_ = i_4570_;
						int i_4649_ = i_4567_ >>> 24;
						int i_4650_ = 256 - i_4649_;
						for (int i_4651_ = -i_4565_; i_4651_ < 0; i_4651_++) {
							int i_4652_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4653_ = -i_4564_; i_4653_ < 0; i_4653_++) {
								byte i_4654_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4652_]);
								int i_4655_ = (i_4654_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4654_]) : 0);
								int i_4656_ = i_4655_ + i_4567_;
								int i_4657_ = ((i_4655_ & 0xff00ff) + (i_4567_ & 0xff00ff));
								int i_4658_ = ((i_4657_ & 0x1000100) + (i_4656_ - i_4657_ & 0x10000));
								i_4658_ = i_4656_ - i_4658_ | i_4658_ - (i_4658_ >>> 8);
								if (i_4655_ == 0 && i_4649_ != 255) {
									i_4655_ = i_4658_;
									i_4658_ = is[i_4579_];
									i_4658_ = ((((i_4655_ & 0xff00ff) * i_4649_ + (i_4658_ & 0xff00ff) * i_4650_) & ~0xff00ff) + (((i_4655_ & 0xff00) * i_4649_ + (i_4658_ & 0xff00) * i_4650_) & 0xff0000)) >> 8;
								}
								is[i_4579_++] = i_4658_;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4648_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 2) {
						int i_4659_ = i_4567_ >>> 24;
						int i_4660_ = 256 - i_4659_;
						int i_4661_ = (i_4567_ & 0xff00ff) * i_4660_ & ~0xff00ff;
						int i_4662_ = (i_4567_ & 0xff00) * i_4660_ & 0xff0000;
						i_4567_ = (i_4661_ | i_4662_) >>> 8;
						int i_4663_ = i_4570_;
						for (int i_4664_ = -i_4565_; i_4664_ < 0; i_4664_++) {
							int i_4665_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4666_ = -i_4564_; i_4666_ < 0; i_4666_++) {
								int i_4667_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4665_]);
								if (i_4667_ != 0) {
									int i_4668_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4667_ & 0xff]);
									i_4661_ = ((i_4668_ & 0xff00ff) * i_4659_ & ~0xff00ff);
									i_4662_ = ((i_4668_ & 0xff00) * i_4659_ & 0xff0000);
									is[i_4579_++] = ((i_4661_ | i_4662_) >>> 8) + i_4567_;
								} else
									i_4579_++;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4663_;
							i_4579_ += i_4580_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_4568_ == 2) {
					if (i_4566_ == 1) {
						int i_4669_ = i_4570_;
						for (int i_4670_ = -i_4565_; i_4670_ < 0; i_4670_++) {
							int i_4671_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4672_ = -i_4564_; i_4672_ < 0; i_4672_++) {
								int i_4673_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4671_]);
								if (i_4673_ != 0) {
									int i_4674_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4673_ & 0xff]);
									int i_4675_ = is[i_4579_];
									int i_4676_ = i_4674_ + i_4675_;
									int i_4677_ = ((i_4674_ & 0xff00ff) + (i_4675_ & 0xff00ff));
									i_4675_ = ((i_4677_ & 0x1000100) + (i_4676_ - i_4677_ & 0x10000));
									is[i_4579_++] = (i_4676_ - i_4675_ | i_4675_ - (i_4675_ >>> 8));
								} else
									i_4579_++;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4669_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 0) {
						int i_4678_ = i_4570_;
						int i_4679_ = (i_4567_ & 0xff0000) >> 16;
						int i_4680_ = (i_4567_ & 0xff00) >> 8;
						int i_4681_ = i_4567_ & 0xff;
						for (int i_4682_ = -i_4565_; i_4682_ < 0; i_4682_++) {
							int i_4683_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4684_ = -i_4564_; i_4684_ < 0; i_4684_++) {
								int i_4685_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4683_]);
								if (i_4685_ != 0) {
									int i_4686_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4685_ & 0xff]);
									int i_4687_ = ((i_4686_ & 0xff0000) * i_4679_ & ~0xffffff);
									int i_4688_ = ((i_4686_ & 0xff00) * i_4680_ & 0xff0000);
									int i_4689_ = (i_4686_ & 0xff) * i_4681_ & 0xff00;
									i_4686_ = (i_4687_ | i_4688_ | i_4689_) >>> 8;
									int i_4690_ = is[i_4579_];
									int i_4691_ = i_4686_ + i_4690_;
									int i_4692_ = ((i_4686_ & 0xff00ff) + (i_4690_ & 0xff00ff));
									i_4690_ = ((i_4692_ & 0x1000100) + (i_4691_ - i_4692_ & 0x10000));
									is[i_4579_++] = (i_4691_ - i_4690_ | i_4690_ - (i_4690_ >>> 8));
								} else
									i_4579_++;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4678_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 3) {
						int i_4693_ = i_4570_;
						for (int i_4694_ = -i_4565_; i_4694_ < 0; i_4694_++) {
							int i_4695_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4696_ = -i_4564_; i_4696_ < 0; i_4696_++) {
								byte i_4697_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4695_]);
								int i_4698_ = (i_4697_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4697_]) : 0);
								int i_4699_ = i_4698_ + i_4567_;
								int i_4700_ = ((i_4698_ & 0xff00ff) + (i_4567_ & 0xff00ff));
								int i_4701_ = ((i_4700_ & 0x1000100) + (i_4699_ - i_4700_ & 0x10000));
								i_4698_ = i_4699_ - i_4701_ | i_4701_ - (i_4701_ >>> 8);
								i_4701_ = is[i_4579_];
								i_4699_ = i_4698_ + i_4701_;
								i_4700_ = (i_4698_ & 0xff00ff) + (i_4701_ & 0xff00ff);
								i_4701_ = ((i_4700_ & 0x1000100) + (i_4699_ - i_4700_ & 0x10000));
								is[i_4579_++] = i_4699_ - i_4701_ | i_4701_ - (i_4701_ >>> 8);
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4693_;
							i_4579_ += i_4580_;
						}
					} else if (i_4566_ == 2) {
						int i_4702_ = i_4567_ >>> 24;
						int i_4703_ = 256 - i_4702_;
						int i_4704_ = (i_4567_ & 0xff00ff) * i_4703_ & ~0xff00ff;
						int i_4705_ = (i_4567_ & 0xff00) * i_4703_ & 0xff0000;
						i_4567_ = (i_4704_ | i_4705_) >>> 8;
						int i_4706_ = i_4570_;
						for (int i_4707_ = -i_4565_; i_4707_ < 0; i_4707_++) {
							int i_4708_ = ((i_4571_ >> 16) * ((Class161_Sub3_Sub1) this).anInt10945);
							for (int i_4709_ = -i_4564_; i_4709_ < 0; i_4709_++) {
								int i_4710_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(i_4570_ >> 16) + i_4708_]);
								if (i_4710_ != 0) {
									int i_4711_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4710_ & 0xff]);
									i_4704_ = ((i_4711_ & 0xff00ff) * i_4702_ & ~0xff00ff);
									i_4705_ = ((i_4711_ & 0xff00) * i_4702_ & 0xff0000);
									i_4711_ = (((i_4704_ | i_4705_) >>> 8) + i_4567_);
									int i_4712_ = is[i_4579_];
									int i_4713_ = i_4711_ + i_4712_;
									int i_4714_ = ((i_4711_ & 0xff00ff) + (i_4712_ & 0xff00ff));
									i_4712_ = ((i_4714_ & 0x1000100) + (i_4713_ - i_4714_ & 0x10000));
									is[i_4579_++] = (i_4713_ - i_4712_ | i_4712_ - (i_4712_ >>> 8));
								} else
									i_4579_++;
								i_4570_ += i_4575_;
							}
							i_4571_ += i_4576_;
							i_4570_ = i_4706_;
							i_4579_ += i_4580_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method10060(int i, int i_4715_) {
		int[] is = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_4716_ = anInt10940;
					while (i_4716_ < 0) {
						int i_4717_ = anInt10944;
						int i_4718_ = anInt10951;
						int i_4719_ = anInt10952;
						int i_4720_ = anInt10958;
						if (i_4718_ >= 0 && i_4719_ >= 0 && (i_4718_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_4719_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							for (/**/; i_4720_ < 0; i_4720_++) {
								int i_4721_ = ((i_4719_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4718_ >> 12));
								int i_4722_ = i_4717_++;
								if (i_4715_ == 0) {
									if (i == 1)
										is[i_4722_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]) & 0xff)]);
									else if (i == 0) {
										int i_4723_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]) & 0xff)]);
										int i_4724_ = (((i_4723_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4725_ = ((i_4723_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4726_ = ((i_4723_ & 0xff) * anInt10960 & 0xff00);
										is[i_4722_] = (i_4724_ | i_4725_ | i_4726_) >>> 8;
									} else if (i == 3) {
										int i_4727_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]) & 0xff)]);
										int i_4728_ = anInt10928;
										int i_4729_ = i_4727_ + i_4728_;
										int i_4730_ = ((i_4727_ & 0xff00ff) + (i_4728_ & 0xff00ff));
										int i_4731_ = ((i_4730_ & 0x1000100) + (i_4729_ - i_4730_ & 0x10000));
										is[i_4722_] = (i_4729_ - i_4731_ | i_4731_ - (i_4731_ >>> 8));
									} else if (i == 2) {
										int i_4732_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]) & 0xff)]);
										int i_4733_ = (((i_4732_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4734_ = ((i_4732_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4722_] = ((i_4733_ | i_4734_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 1) {
									if (i == 1) {
										int i_4735_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4735_ != 0)
											is[i_4722_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4735_ & 0xff]);
									} else if (i == 0) {
										int i_4736_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4736_ != 0) {
											int i_4737_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4736_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4738_ = anInt10928 >>> 24;
												int i_4739_ = 256 - i_4738_;
												int i_4740_ = is[i_4722_];
												is[i_4722_] = (((((i_4737_ & 0xff00ff) * i_4738_) + ((i_4740_ & 0xff00ff) * i_4739_)) & ~0xff00ff) + ((((i_4737_ & 0xff00) * i_4738_) + ((i_4740_ & 0xff00) * i_4739_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4741_ = (((i_4737_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4742_ = (((i_4737_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4743_ = (((i_4737_ & 0xff) * anInt10960) & 0xff00);
												i_4737_ = (i_4741_ | i_4742_ | i_4743_) >>> 8;
												int i_4744_ = is[i_4722_];
												is[i_4722_] = (((((i_4737_ & 0xff00ff) * anInt10934) + ((i_4744_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4737_ & 0xff00) * anInt10934) + ((i_4744_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4745_ = (((i_4737_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4746_ = (((i_4737_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4747_ = (((i_4737_ & 0xff) * anInt10960) & 0xff00);
												is[i_4722_] = (i_4745_ | i_4746_ | i_4747_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4748_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										int i_4749_ = (i_4748_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4748_]) : 0);
										int i_4750_ = anInt10928;
										int i_4751_ = i_4749_ + i_4750_;
										int i_4752_ = ((i_4749_ & 0xff00ff) + (i_4750_ & 0xff00ff));
										int i_4753_ = ((i_4752_ & 0x1000100) + (i_4751_ - i_4752_ & 0x10000));
										i_4753_ = (i_4751_ - i_4753_ | i_4753_ - (i_4753_ >>> 8));
										if (i_4749_ == 0 && anInt10934 != 255) {
											i_4749_ = i_4753_;
											i_4753_ = is[i_4722_];
											i_4753_ = (((((i_4749_ & 0xff00ff) * anInt10934) + ((i_4753_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4749_ & 0xff00) * anInt10934) + ((i_4753_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4722_] = i_4753_;
									} else if (i == 2) {
										int i_4754_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4754_ != 0) {
											int i_4755_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4754_ & 0xff]);
											int i_4756_ = (((i_4755_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4757_ = (((i_4755_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4722_++] = (((i_4756_ | i_4757_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 2) {
									if (i == 1) {
										int i_4758_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4758_ != 0) {
											int i_4759_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4758_ & 0xff]);
											int i_4760_ = is[i_4722_];
											int i_4761_ = i_4759_ + i_4760_;
											int i_4762_ = ((i_4759_ & 0xff00ff) + (i_4760_ & 0xff00ff));
											i_4760_ = ((i_4762_ & 0x1000100) + (i_4761_ - i_4762_ & 0x10000));
											is[i_4722_] = (i_4761_ - i_4760_ | i_4760_ - (i_4760_ >>> 8));
										}
									} else if (i == 0) {
										int i_4763_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4763_ != 0) {
											int i_4764_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4763_ & 0xff]);
											int i_4765_ = (((i_4764_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4766_ = (((i_4764_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4767_ = (((i_4764_ & 0xff) * anInt10960) & 0xff00);
											i_4764_ = (i_4765_ | i_4766_ | i_4767_) >>> 8;
											int i_4768_ = is[i_4722_];
											int i_4769_ = i_4764_ + i_4768_;
											int i_4770_ = ((i_4764_ & 0xff00ff) + (i_4768_ & 0xff00ff));
											i_4768_ = ((i_4770_ & 0x1000100) + (i_4769_ - i_4770_ & 0x10000));
											is[i_4722_] = (i_4769_ - i_4768_ | i_4768_ - (i_4768_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4771_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										int i_4772_ = (i_4771_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4771_]) : 0);
										int i_4773_ = anInt10928;
										int i_4774_ = i_4772_ + i_4773_;
										int i_4775_ = ((i_4772_ & 0xff00ff) + (i_4773_ & 0xff00ff));
										int i_4776_ = ((i_4775_ & 0x1000100) + (i_4774_ - i_4775_ & 0x10000));
										i_4776_ = (i_4774_ - i_4776_ | i_4776_ - (i_4776_ >>> 8));
										if (i_4772_ == 0 && anInt10934 != 255) {
											i_4772_ = i_4776_;
											i_4776_ = is[i_4722_];
											i_4776_ = (((((i_4772_ & 0xff00ff) * anInt10934) + ((i_4776_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4772_ & 0xff00) * anInt10934) + ((i_4776_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4722_] = i_4776_;
									} else if (i == 2) {
										int i_4777_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4721_]);
										if (i_4777_ != 0) {
											int i_4778_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4777_ & 0xff]);
											int i_4779_ = (((i_4778_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4780_ = (((i_4778_ & 0xff00) * anInt10934) & 0xff0000);
											i_4778_ = ((i_4779_ | i_4780_) >>> 8) + anInt10963;
											int i_4781_ = is[i_4722_];
											int i_4782_ = i_4778_ + i_4781_;
											int i_4783_ = ((i_4778_ & 0xff00ff) + (i_4781_ & 0xff00ff));
											i_4781_ = ((i_4783_ & 0x1000100) + (i_4782_ - i_4783_ & 0x10000));
											is[i_4722_] = (i_4782_ - i_4781_ | i_4781_ - (i_4781_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_4716_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_4784_ = anInt10940;
					while (i_4784_ < 0) {
						int i_4785_ = anInt10944;
						int i_4786_ = anInt10951;
						int i_4787_ = anInt10952 + anInt10954;
						int i_4788_ = anInt10958;
						if (i_4786_ >= 0 && (i_4786_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							int i_4789_;
							if ((i_4789_ = (i_4787_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_4789_ = (anInt10946 - i_4789_) / anInt10946;
								i_4788_ += i_4789_;
								i_4787_ += anInt10946 * i_4789_;
								i_4785_ += i_4789_;
							}
							if ((i_4789_ = (i_4787_ - anInt10946) / anInt10946) > i_4788_)
								i_4788_ = i_4789_;
							for (/**/; i_4788_ < 0; i_4788_++) {
								int i_4790_ = ((i_4787_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4786_ >> 12));
								int i_4791_ = i_4785_++;
								if (i_4715_ == 0) {
									if (i == 1)
										is[i_4791_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]) & 0xff)]);
									else if (i == 0) {
										int i_4792_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]) & 0xff)]);
										int i_4793_ = (((i_4792_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4794_ = ((i_4792_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4795_ = ((i_4792_ & 0xff) * anInt10960 & 0xff00);
										is[i_4791_] = (i_4793_ | i_4794_ | i_4795_) >>> 8;
									} else if (i == 3) {
										int i_4796_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]) & 0xff)]);
										int i_4797_ = anInt10928;
										int i_4798_ = i_4796_ + i_4797_;
										int i_4799_ = ((i_4796_ & 0xff00ff) + (i_4797_ & 0xff00ff));
										int i_4800_ = ((i_4799_ & 0x1000100) + (i_4798_ - i_4799_ & 0x10000));
										is[i_4791_] = (i_4798_ - i_4800_ | i_4800_ - (i_4800_ >>> 8));
									} else if (i == 2) {
										int i_4801_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]) & 0xff)]);
										int i_4802_ = (((i_4801_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4803_ = ((i_4801_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4791_] = ((i_4802_ | i_4803_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 1) {
									if (i == 1) {
										int i_4804_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4804_ != 0)
											is[i_4791_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4804_ & 0xff]);
									} else if (i == 0) {
										int i_4805_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4805_ != 0) {
											int i_4806_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4805_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4807_ = anInt10928 >>> 24;
												int i_4808_ = 256 - i_4807_;
												int i_4809_ = is[i_4791_];
												is[i_4791_] = (((((i_4806_ & 0xff00ff) * i_4807_) + ((i_4809_ & 0xff00ff) * i_4808_)) & ~0xff00ff) + ((((i_4806_ & 0xff00) * i_4807_) + ((i_4809_ & 0xff00) * i_4808_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4810_ = (((i_4806_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4811_ = (((i_4806_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4812_ = (((i_4806_ & 0xff) * anInt10960) & 0xff00);
												i_4806_ = (i_4810_ | i_4811_ | i_4812_) >>> 8;
												int i_4813_ = is[i_4791_];
												is[i_4791_] = (((((i_4806_ & 0xff00ff) * anInt10934) + ((i_4813_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4806_ & 0xff00) * anInt10934) + ((i_4813_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4814_ = (((i_4806_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4815_ = (((i_4806_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4816_ = (((i_4806_ & 0xff) * anInt10960) & 0xff00);
												is[i_4791_] = (i_4814_ | i_4815_ | i_4816_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4817_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										int i_4818_ = (i_4817_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4817_]) : 0);
										int i_4819_ = anInt10928;
										int i_4820_ = i_4818_ + i_4819_;
										int i_4821_ = ((i_4818_ & 0xff00ff) + (i_4819_ & 0xff00ff));
										int i_4822_ = ((i_4821_ & 0x1000100) + (i_4820_ - i_4821_ & 0x10000));
										i_4822_ = (i_4820_ - i_4822_ | i_4822_ - (i_4822_ >>> 8));
										if (i_4818_ == 0 && anInt10934 != 255) {
											i_4818_ = i_4822_;
											i_4822_ = is[i_4791_];
											i_4822_ = (((((i_4818_ & 0xff00ff) * anInt10934) + ((i_4822_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4818_ & 0xff00) * anInt10934) + ((i_4822_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4791_] = i_4822_;
									} else if (i == 2) {
										int i_4823_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4823_ != 0) {
											int i_4824_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4823_ & 0xff]);
											int i_4825_ = (((i_4824_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4826_ = (((i_4824_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4791_++] = (((i_4825_ | i_4826_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 2) {
									if (i == 1) {
										int i_4827_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4827_ != 0) {
											int i_4828_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4827_ & 0xff]);
											int i_4829_ = is[i_4791_];
											int i_4830_ = i_4828_ + i_4829_;
											int i_4831_ = ((i_4828_ & 0xff00ff) + (i_4829_ & 0xff00ff));
											i_4829_ = ((i_4831_ & 0x1000100) + (i_4830_ - i_4831_ & 0x10000));
											is[i_4791_] = (i_4830_ - i_4829_ | i_4829_ - (i_4829_ >>> 8));
										}
									} else if (i == 0) {
										int i_4832_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4832_ != 0) {
											int i_4833_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4832_ & 0xff]);
											int i_4834_ = (((i_4833_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4835_ = (((i_4833_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4836_ = (((i_4833_ & 0xff) * anInt10960) & 0xff00);
											i_4833_ = (i_4834_ | i_4835_ | i_4836_) >>> 8;
											int i_4837_ = is[i_4791_];
											int i_4838_ = i_4833_ + i_4837_;
											int i_4839_ = ((i_4833_ & 0xff00ff) + (i_4837_ & 0xff00ff));
											i_4837_ = ((i_4839_ & 0x1000100) + (i_4838_ - i_4839_ & 0x10000));
											is[i_4791_] = (i_4838_ - i_4837_ | i_4837_ - (i_4837_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4840_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										int i_4841_ = (i_4840_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4840_]) : 0);
										int i_4842_ = anInt10928;
										int i_4843_ = i_4841_ + i_4842_;
										int i_4844_ = ((i_4841_ & 0xff00ff) + (i_4842_ & 0xff00ff));
										int i_4845_ = ((i_4844_ & 0x1000100) + (i_4843_ - i_4844_ & 0x10000));
										i_4845_ = (i_4843_ - i_4845_ | i_4845_ - (i_4845_ >>> 8));
										if (i_4841_ == 0 && anInt10934 != 255) {
											i_4841_ = i_4845_;
											i_4845_ = is[i_4791_];
											i_4845_ = (((((i_4841_ & 0xff00ff) * anInt10934) + ((i_4845_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4841_ & 0xff00) * anInt10934) + ((i_4845_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4791_] = i_4845_;
									} else if (i == 2) {
										int i_4846_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4790_]);
										if (i_4846_ != 0) {
											int i_4847_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4846_ & 0xff]);
											int i_4848_ = (((i_4847_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4849_ = (((i_4847_ & 0xff00) * anInt10934) & 0xff0000);
											i_4847_ = ((i_4848_ | i_4849_) >>> 8) + anInt10963;
											int i_4850_ = is[i_4791_];
											int i_4851_ = i_4847_ + i_4850_;
											int i_4852_ = ((i_4847_ & 0xff00ff) + (i_4850_ & 0xff00ff));
											i_4850_ = ((i_4852_ & 0x1000100) + (i_4851_ - i_4852_ & 0x10000));
											is[i_4791_] = (i_4851_ - i_4850_ | i_4850_ - (i_4850_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4787_ += anInt10946;
							}
						}
						i_4784_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_4853_ = anInt10940;
					while (i_4853_ < 0) {
						int i_4854_ = anInt10944;
						int i_4855_ = anInt10951;
						int i_4856_ = anInt10952 + anInt10954;
						int i_4857_ = anInt10958;
						if (i_4855_ >= 0 && (i_4855_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
							if (i_4856_ < 0) {
								int i_4858_ = (anInt10946 - 1 - i_4856_) / anInt10946;
								i_4857_ += i_4858_;
								i_4856_ += anInt10946 * i_4858_;
								i_4854_ += i_4858_;
							}
							int i_4859_;
							if ((i_4859_ = (1 + i_4856_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_4857_)
								i_4857_ = i_4859_;
							for (/**/; i_4857_ < 0; i_4857_++) {
								int i_4860_ = ((i_4856_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4855_ >> 12));
								int i_4861_ = i_4854_++;
								if (i_4715_ == 0) {
									if (i == 1)
										is[i_4861_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]) & 0xff)]);
									else if (i == 0) {
										int i_4862_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]) & 0xff)]);
										int i_4863_ = (((i_4862_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4864_ = ((i_4862_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4865_ = ((i_4862_ & 0xff) * anInt10960 & 0xff00);
										is[i_4861_] = (i_4863_ | i_4864_ | i_4865_) >>> 8;
									} else if (i == 3) {
										int i_4866_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]) & 0xff)]);
										int i_4867_ = anInt10928;
										int i_4868_ = i_4866_ + i_4867_;
										int i_4869_ = ((i_4866_ & 0xff00ff) + (i_4867_ & 0xff00ff));
										int i_4870_ = ((i_4869_ & 0x1000100) + (i_4868_ - i_4869_ & 0x10000));
										is[i_4861_] = (i_4868_ - i_4870_ | i_4870_ - (i_4870_ >>> 8));
									} else if (i == 2) {
										int i_4871_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]) & 0xff)]);
										int i_4872_ = (((i_4871_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4873_ = ((i_4871_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4861_] = ((i_4872_ | i_4873_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 1) {
									if (i == 1) {
										int i_4874_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4874_ != 0)
											is[i_4861_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4874_ & 0xff]);
									} else if (i == 0) {
										int i_4875_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4875_ != 0) {
											int i_4876_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4875_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4877_ = anInt10928 >>> 24;
												int i_4878_ = 256 - i_4877_;
												int i_4879_ = is[i_4861_];
												is[i_4861_] = (((((i_4876_ & 0xff00ff) * i_4877_) + ((i_4879_ & 0xff00ff) * i_4878_)) & ~0xff00ff) + ((((i_4876_ & 0xff00) * i_4877_) + ((i_4879_ & 0xff00) * i_4878_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4880_ = (((i_4876_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4881_ = (((i_4876_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4882_ = (((i_4876_ & 0xff) * anInt10960) & 0xff00);
												i_4876_ = (i_4880_ | i_4881_ | i_4882_) >>> 8;
												int i_4883_ = is[i_4861_];
												is[i_4861_] = (((((i_4876_ & 0xff00ff) * anInt10934) + ((i_4883_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4876_ & 0xff00) * anInt10934) + ((i_4883_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4884_ = (((i_4876_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4885_ = (((i_4876_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4886_ = (((i_4876_ & 0xff) * anInt10960) & 0xff00);
												is[i_4861_] = (i_4884_ | i_4885_ | i_4886_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4887_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										int i_4888_ = (i_4887_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4887_]) : 0);
										int i_4889_ = anInt10928;
										int i_4890_ = i_4888_ + i_4889_;
										int i_4891_ = ((i_4888_ & 0xff00ff) + (i_4889_ & 0xff00ff));
										int i_4892_ = ((i_4891_ & 0x1000100) + (i_4890_ - i_4891_ & 0x10000));
										i_4892_ = (i_4890_ - i_4892_ | i_4892_ - (i_4892_ >>> 8));
										if (i_4888_ == 0 && anInt10934 != 255) {
											i_4888_ = i_4892_;
											i_4892_ = is[i_4861_];
											i_4892_ = (((((i_4888_ & 0xff00ff) * anInt10934) + ((i_4892_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4888_ & 0xff00) * anInt10934) + ((i_4892_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4861_] = i_4892_;
									} else if (i == 2) {
										int i_4893_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4893_ != 0) {
											int i_4894_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4893_ & 0xff]);
											int i_4895_ = (((i_4894_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4896_ = (((i_4894_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4861_++] = (((i_4895_ | i_4896_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 2) {
									if (i == 1) {
										int i_4897_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4897_ != 0) {
											int i_4898_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4897_ & 0xff]);
											int i_4899_ = is[i_4861_];
											int i_4900_ = i_4898_ + i_4899_;
											int i_4901_ = ((i_4898_ & 0xff00ff) + (i_4899_ & 0xff00ff));
											i_4899_ = ((i_4901_ & 0x1000100) + (i_4900_ - i_4901_ & 0x10000));
											is[i_4861_] = (i_4900_ - i_4899_ | i_4899_ - (i_4899_ >>> 8));
										}
									} else if (i == 0) {
										int i_4902_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4902_ != 0) {
											int i_4903_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4902_ & 0xff]);
											int i_4904_ = (((i_4903_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4905_ = (((i_4903_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4906_ = (((i_4903_ & 0xff) * anInt10960) & 0xff00);
											i_4903_ = (i_4904_ | i_4905_ | i_4906_) >>> 8;
											int i_4907_ = is[i_4861_];
											int i_4908_ = i_4903_ + i_4907_;
											int i_4909_ = ((i_4903_ & 0xff00ff) + (i_4907_ & 0xff00ff));
											i_4907_ = ((i_4909_ & 0x1000100) + (i_4908_ - i_4909_ & 0x10000));
											is[i_4861_] = (i_4908_ - i_4907_ | i_4907_ - (i_4907_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4910_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										int i_4911_ = (i_4910_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4910_]) : 0);
										int i_4912_ = anInt10928;
										int i_4913_ = i_4911_ + i_4912_;
										int i_4914_ = ((i_4911_ & 0xff00ff) + (i_4912_ & 0xff00ff));
										int i_4915_ = ((i_4914_ & 0x1000100) + (i_4913_ - i_4914_ & 0x10000));
										i_4915_ = (i_4913_ - i_4915_ | i_4915_ - (i_4915_ >>> 8));
										if (i_4911_ == 0 && anInt10934 != 255) {
											i_4911_ = i_4915_;
											i_4915_ = is[i_4861_];
											i_4915_ = (((((i_4911_ & 0xff00ff) * anInt10934) + ((i_4915_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4911_ & 0xff00) * anInt10934) + ((i_4915_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4861_] = i_4915_;
									} else if (i == 2) {
										int i_4916_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4860_]);
										if (i_4916_ != 0) {
											int i_4917_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4916_ & 0xff]);
											int i_4918_ = (((i_4917_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4919_ = (((i_4917_ & 0xff00) * anInt10934) & 0xff0000);
											i_4917_ = ((i_4918_ | i_4919_) >>> 8) + anInt10963;
											int i_4920_ = is[i_4861_];
											int i_4921_ = i_4917_ + i_4920_;
											int i_4922_ = ((i_4917_ & 0xff00ff) + (i_4920_ & 0xff00ff));
											i_4920_ = ((i_4922_ & 0x1000100) + (i_4921_ - i_4922_ & 0x10000));
											is[i_4861_] = (i_4921_ - i_4920_ | i_4920_ - (i_4920_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4856_ += anInt10946;
							}
						}
						i_4853_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_4923_ = anInt10940;
					while (i_4923_ < 0) {
						int i_4924_ = anInt10944;
						int i_4925_ = anInt10951 + anInt10953;
						int i_4926_ = anInt10952;
						int i_4927_ = anInt10958;
						if (i_4926_ >= 0 && (i_4926_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							int i_4928_;
							if ((i_4928_ = (i_4925_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_4928_ = (anInt10956 - i_4928_) / anInt10956;
								i_4927_ += i_4928_;
								i_4925_ += anInt10956 * i_4928_;
								i_4924_ += i_4928_;
							}
							if ((i_4928_ = (i_4925_ - anInt10956) / anInt10956) > i_4927_)
								i_4927_ = i_4928_;
							for (/**/; i_4927_ < 0; i_4927_++) {
								int i_4929_ = ((i_4926_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945 + (i_4925_ >> 12));
								int i_4930_ = i_4924_++;
								if (i_4715_ == 0) {
									if (i == 1)
										is[i_4930_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]) & 0xff)]);
									else if (i == 0) {
										int i_4931_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]) & 0xff)]);
										int i_4932_ = (((i_4931_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_4933_ = ((i_4931_ & 0xff00) * anInt10959 & 0xff0000);
										int i_4934_ = ((i_4931_ & 0xff) * anInt10960 & 0xff00);
										is[i_4930_] = (i_4932_ | i_4933_ | i_4934_) >>> 8;
									} else if (i == 3) {
										int i_4935_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]) & 0xff)]);
										int i_4936_ = anInt10928;
										int i_4937_ = i_4935_ + i_4936_;
										int i_4938_ = ((i_4935_ & 0xff00ff) + (i_4936_ & 0xff00ff));
										int i_4939_ = ((i_4938_ & 0x1000100) + (i_4937_ - i_4938_ & 0x10000));
										is[i_4930_] = (i_4937_ - i_4939_ | i_4939_ - (i_4939_ >>> 8));
									} else if (i == 2) {
										int i_4940_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]) & 0xff)]);
										int i_4941_ = (((i_4940_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_4942_ = ((i_4940_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4930_] = ((i_4941_ | i_4942_) >>> 8) + anInt10963;
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 1) {
									if (i == 1) {
										int i_4943_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4943_ != 0)
											is[i_4930_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4943_ & 0xff]);
									} else if (i == 0) {
										int i_4944_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4944_ != 0) {
											int i_4945_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4944_ & 0xff]);
											if ((anInt10928 & 0xffffff) == 16777215) {
												int i_4946_ = anInt10928 >>> 24;
												int i_4947_ = 256 - i_4946_;
												int i_4948_ = is[i_4930_];
												is[i_4930_] = (((((i_4945_ & 0xff00ff) * i_4946_) + ((i_4948_ & 0xff00ff) * i_4947_)) & ~0xff00ff) + ((((i_4945_ & 0xff00) * i_4946_) + ((i_4948_ & 0xff00) * i_4947_)) & 0xff0000)) >> 8;
											} else if (anInt10934 != 255) {
												int i_4949_ = (((i_4945_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4950_ = (((i_4945_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4951_ = (((i_4945_ & 0xff) * anInt10960) & 0xff00);
												i_4945_ = (i_4949_ | i_4950_ | i_4951_) >>> 8;
												int i_4952_ = is[i_4930_];
												is[i_4930_] = (((((i_4945_ & 0xff00ff) * anInt10934) + ((i_4952_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4945_ & 0xff00) * anInt10934) + ((i_4952_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
											} else {
												int i_4953_ = (((i_4945_ & 0xff0000) * anInt10955) & ~0xffffff);
												int i_4954_ = (((i_4945_ & 0xff00) * anInt10959) & 0xff0000);
												int i_4955_ = (((i_4945_ & 0xff) * anInt10960) & 0xff00);
												is[i_4930_] = (i_4953_ | i_4954_ | i_4955_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4956_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										int i_4957_ = (i_4956_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4956_]) : 0);
										int i_4958_ = anInt10928;
										int i_4959_ = i_4957_ + i_4958_;
										int i_4960_ = ((i_4957_ & 0xff00ff) + (i_4958_ & 0xff00ff));
										int i_4961_ = ((i_4960_ & 0x1000100) + (i_4959_ - i_4960_ & 0x10000));
										i_4961_ = (i_4959_ - i_4961_ | i_4961_ - (i_4961_ >>> 8));
										if (i_4957_ == 0 && anInt10934 != 255) {
											i_4957_ = i_4961_;
											i_4961_ = is[i_4930_];
											i_4961_ = (((((i_4957_ & 0xff00ff) * anInt10934) + ((i_4961_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4957_ & 0xff00) * anInt10934) + ((i_4961_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4930_] = i_4961_;
									} else if (i == 2) {
										int i_4962_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4962_ != 0) {
											int i_4963_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4962_ & 0xff]);
											int i_4964_ = (((i_4963_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4965_ = (((i_4963_ & 0xff00) * anInt10934) & 0xff0000);
											is[i_4930_++] = (((i_4964_ | i_4965_) >>> 8) + anInt10963);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4715_ == 2) {
									if (i == 1) {
										int i_4966_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4966_ != 0) {
											int i_4967_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4966_ & 0xff]);
											int i_4968_ = is[i_4930_];
											int i_4969_ = i_4967_ + i_4968_;
											int i_4970_ = ((i_4967_ & 0xff00ff) + (i_4968_ & 0xff00ff));
											i_4968_ = ((i_4970_ & 0x1000100) + (i_4969_ - i_4970_ & 0x10000));
											is[i_4930_] = (i_4969_ - i_4968_ | i_4968_ - (i_4968_ >>> 8));
										}
									} else if (i == 0) {
										int i_4971_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4971_ != 0) {
											int i_4972_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4971_ & 0xff]);
											int i_4973_ = (((i_4972_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_4974_ = (((i_4972_ & 0xff00) * anInt10959) & 0xff0000);
											int i_4975_ = (((i_4972_ & 0xff) * anInt10960) & 0xff00);
											i_4972_ = (i_4973_ | i_4974_ | i_4975_) >>> 8;
											int i_4976_ = is[i_4930_];
											int i_4977_ = i_4972_ + i_4976_;
											int i_4978_ = ((i_4972_ & 0xff00ff) + (i_4976_ & 0xff00ff));
											i_4976_ = ((i_4978_ & 0x1000100) + (i_4977_ - i_4978_ & 0x10000));
											is[i_4930_] = (i_4977_ - i_4976_ | i_4976_ - (i_4976_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4979_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										int i_4980_ = (i_4979_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_4979_]) : 0);
										int i_4981_ = anInt10928;
										int i_4982_ = i_4980_ + i_4981_;
										int i_4983_ = ((i_4980_ & 0xff00ff) + (i_4981_ & 0xff00ff));
										int i_4984_ = ((i_4983_ & 0x1000100) + (i_4982_ - i_4983_ & 0x10000));
										i_4984_ = (i_4982_ - i_4984_ | i_4984_ - (i_4984_ >>> 8));
										if (i_4980_ == 0 && anInt10934 != 255) {
											i_4980_ = i_4984_;
											i_4984_ = is[i_4930_];
											i_4984_ = (((((i_4980_ & 0xff00ff) * anInt10934) + ((i_4984_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_4980_ & 0xff00) * anInt10934) + ((i_4984_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										}
										is[i_4930_] = i_4984_;
									} else if (i == 2) {
										int i_4985_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4929_]);
										if (i_4985_ != 0) {
											int i_4986_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_4985_ & 0xff]);
											int i_4987_ = (((i_4986_ & 0xff00ff) * anInt10934) & ~0xff00ff);
											int i_4988_ = (((i_4986_ & 0xff00) * anInt10934) & 0xff0000);
											i_4986_ = ((i_4987_ | i_4988_) >>> 8) + anInt10963;
											int i_4989_ = is[i_4930_];
											int i_4990_ = i_4986_ + i_4989_;
											int i_4991_ = ((i_4986_ & 0xff00ff) + (i_4989_ & 0xff00ff));
											i_4989_ = ((i_4991_ & 0x1000100) + (i_4990_ - i_4991_ & 0x10000));
											is[i_4930_] = (i_4990_ - i_4989_ | i_4989_ - (i_4989_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4925_ += anInt10956;
							}
						}
						i_4923_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_4992_ = anInt10940;
					while (i_4992_ < 0) {
						int i_4993_ = anInt10944;
						int i_4994_ = anInt10951 + anInt10953;
						int i_4995_ = anInt10952 + anInt10954;
						int i_4996_ = anInt10958;
						int i_4997_;
						if ((i_4997_ = i_4994_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_4997_ = (anInt10956 - i_4997_) / anInt10956;
							i_4996_ += i_4997_;
							i_4994_ += anInt10956 * i_4997_;
							i_4995_ += anInt10946 * i_4997_;
							i_4993_ += i_4997_;
						}
						if ((i_4997_ = (i_4994_ - anInt10956) / anInt10956) > i_4996_)
							i_4996_ = i_4997_;
						if ((i_4997_ = i_4995_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_4997_ = (anInt10946 - i_4997_) / anInt10946;
							i_4996_ += i_4997_;
							i_4994_ += anInt10956 * i_4997_;
							i_4995_ += anInt10946 * i_4997_;
							i_4993_ += i_4997_;
						}
						if ((i_4997_ = (i_4995_ - anInt10946) / anInt10946) > i_4996_)
							i_4996_ = i_4997_;
						for (/**/; i_4996_ < 0; i_4996_++) {
							int i_4998_ = (((i_4995_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_4994_ >> 12));
							int i_4999_ = i_4993_++;
							if (i_4715_ == 0) {
								if (i == 1)
									is[i_4999_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]) & 0xff)]);
								else if (i == 0) {
									int i_5000_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]) & 0xff)]);
									int i_5001_ = ((i_5000_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_5002_ = ((i_5000_ & 0xff00) * anInt10959 & 0xff0000);
									int i_5003_ = ((i_5000_ & 0xff) * anInt10960 & 0xff00);
									is[i_4999_] = (i_5001_ | i_5002_ | i_5003_) >>> 8;
								} else if (i == 3) {
									int i_5004_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]) & 0xff)]);
									int i_5005_ = anInt10928;
									int i_5006_ = i_5004_ + i_5005_;
									int i_5007_ = ((i_5004_ & 0xff00ff) + (i_5005_ & 0xff00ff));
									int i_5008_ = ((i_5007_ & 0x1000100) + (i_5006_ - i_5007_ & 0x10000));
									is[i_4999_] = (i_5006_ - i_5008_ | i_5008_ - (i_5008_ >>> 8));
								} else if (i == 2) {
									int i_5009_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]) & 0xff)]);
									int i_5010_ = ((i_5009_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5011_ = ((i_5009_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_4999_] = (((i_5010_ | i_5011_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 1) {
								if (i == 1) {
									int i_5012_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5012_ != 0)
										is[i_4999_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5012_ & 0xff]);
								} else if (i == 0) {
									int i_5013_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5013_ != 0) {
										int i_5014_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5013_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_5015_ = anInt10928 >>> 24;
											int i_5016_ = 256 - i_5015_;
											int i_5017_ = is[i_4999_];
											is[i_4999_] = (((((i_5014_ & 0xff00ff) * i_5015_) + ((i_5017_ & 0xff00ff) * i_5016_)) & ~0xff00ff) + ((((i_5014_ & 0xff00) * i_5015_) + ((i_5017_ & 0xff00) * i_5016_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_5018_ = (((i_5014_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5019_ = (((i_5014_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5020_ = (((i_5014_ & 0xff) * anInt10960) & 0xff00);
											i_5014_ = (i_5018_ | i_5019_ | i_5020_) >>> 8;
											int i_5021_ = is[i_4999_];
											is[i_4999_] = (((((i_5014_ & 0xff00ff) * anInt10934) + ((i_5021_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5014_ & 0xff00) * anInt10934) + ((i_5021_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_5022_ = (((i_5014_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5023_ = (((i_5014_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5024_ = (((i_5014_ & 0xff) * anInt10960) & 0xff00);
											is[i_4999_] = (i_5022_ | i_5023_ | i_5024_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_5025_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									int i_5026_ = (i_5025_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5025_]) : 0);
									int i_5027_ = anInt10928;
									int i_5028_ = i_5026_ + i_5027_;
									int i_5029_ = ((i_5026_ & 0xff00ff) + (i_5027_ & 0xff00ff));
									int i_5030_ = ((i_5029_ & 0x1000100) + (i_5028_ - i_5029_ & 0x10000));
									i_5030_ = (i_5028_ - i_5030_ | i_5030_ - (i_5030_ >>> 8));
									if (i_5026_ == 0 && anInt10934 != 255) {
										i_5026_ = i_5030_;
										i_5030_ = is[i_4999_];
										i_5030_ = (((((i_5026_ & 0xff00ff) * anInt10934) + ((i_5030_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5026_ & 0xff00) * anInt10934) + ((i_5030_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4999_] = i_5030_;
								} else if (i == 2) {
									int i_5031_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5031_ != 0) {
										int i_5032_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5031_ & 0xff]);
										int i_5033_ = (((i_5032_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5034_ = ((i_5032_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_4999_++] = ((i_5033_ | i_5034_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 2) {
								if (i == 1) {
									int i_5035_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5035_ != 0) {
										int i_5036_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5035_ & 0xff]);
										int i_5037_ = is[i_4999_];
										int i_5038_ = i_5036_ + i_5037_;
										int i_5039_ = ((i_5036_ & 0xff00ff) + (i_5037_ & 0xff00ff));
										i_5037_ = ((i_5039_ & 0x1000100) + (i_5038_ - i_5039_ & 0x10000));
										is[i_4999_] = (i_5038_ - i_5037_ | i_5037_ - (i_5037_ >>> 8));
									}
								} else if (i == 0) {
									int i_5040_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5040_ != 0) {
										int i_5041_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5040_ & 0xff]);
										int i_5042_ = (((i_5041_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5043_ = ((i_5041_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5044_ = ((i_5041_ & 0xff) * anInt10960 & 0xff00);
										i_5041_ = (i_5042_ | i_5043_ | i_5044_) >>> 8;
										int i_5045_ = is[i_4999_];
										int i_5046_ = i_5041_ + i_5045_;
										int i_5047_ = ((i_5041_ & 0xff00ff) + (i_5045_ & 0xff00ff));
										i_5045_ = ((i_5047_ & 0x1000100) + (i_5046_ - i_5047_ & 0x10000));
										is[i_4999_] = (i_5046_ - i_5045_ | i_5045_ - (i_5045_ >>> 8));
									}
								} else if (i == 3) {
									byte i_5048_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									int i_5049_ = (i_5048_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5048_]) : 0);
									int i_5050_ = anInt10928;
									int i_5051_ = i_5049_ + i_5050_;
									int i_5052_ = ((i_5049_ & 0xff00ff) + (i_5050_ & 0xff00ff));
									int i_5053_ = ((i_5052_ & 0x1000100) + (i_5051_ - i_5052_ & 0x10000));
									i_5053_ = (i_5051_ - i_5053_ | i_5053_ - (i_5053_ >>> 8));
									if (i_5049_ == 0 && anInt10934 != 255) {
										i_5049_ = i_5053_;
										i_5053_ = is[i_4999_];
										i_5053_ = (((((i_5049_ & 0xff00ff) * anInt10934) + ((i_5053_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5049_ & 0xff00) * anInt10934) + ((i_5053_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_4999_] = i_5053_;
								} else if (i == 2) {
									int i_5054_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_4998_]);
									if (i_5054_ != 0) {
										int i_5055_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5054_ & 0xff]);
										int i_5056_ = (((i_5055_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5057_ = ((i_5055_ & 0xff00) * anInt10934 & 0xff0000);
										i_5055_ = (((i_5056_ | i_5057_) >>> 8) + anInt10963);
										int i_5058_ = is[i_4999_];
										int i_5059_ = i_5055_ + i_5058_;
										int i_5060_ = ((i_5055_ & 0xff00ff) + (i_5058_ & 0xff00ff));
										i_5058_ = ((i_5060_ & 0x1000100) + (i_5059_ - i_5060_ & 0x10000));
										is[i_4999_] = (i_5059_ - i_5058_ | i_5058_ - (i_5058_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4994_ += anInt10956;
							i_4995_ += anInt10946;
						}
						i_4992_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_5061_ = anInt10940;
					while (i_5061_ < 0) {
						int i_5062_ = anInt10944;
						int i_5063_ = anInt10951 + anInt10953;
						int i_5064_ = anInt10952 + anInt10954;
						int i_5065_ = anInt10958;
						int i_5066_;
						if ((i_5066_ = i_5063_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
							i_5066_ = (anInt10956 - i_5066_) / anInt10956;
							i_5065_ += i_5066_;
							i_5063_ += anInt10956 * i_5066_;
							i_5064_ += anInt10946 * i_5066_;
							i_5062_ += i_5066_;
						}
						if ((i_5066_ = (i_5063_ - anInt10956) / anInt10956) > i_5065_)
							i_5065_ = i_5066_;
						if (i_5064_ < 0) {
							i_5066_ = (anInt10946 - 1 - i_5064_) / anInt10946;
							i_5065_ += i_5066_;
							i_5063_ += anInt10956 * i_5066_;
							i_5064_ += anInt10946 * i_5066_;
							i_5062_ += i_5066_;
						}
						if ((i_5066_ = (1 + i_5064_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_5065_)
							i_5065_ = i_5066_;
						for (/**/; i_5065_ < 0; i_5065_++) {
							int i_5067_ = (((i_5064_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5063_ >> 12));
							int i_5068_ = i_5062_++;
							if (i_4715_ == 0) {
								if (i == 1)
									is[i_5068_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]) & 0xff)]);
								else if (i == 0) {
									int i_5069_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]) & 0xff)]);
									int i_5070_ = ((i_5069_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_5071_ = ((i_5069_ & 0xff00) * anInt10959 & 0xff0000);
									int i_5072_ = ((i_5069_ & 0xff) * anInt10960 & 0xff00);
									is[i_5068_] = (i_5070_ | i_5071_ | i_5072_) >>> 8;
								} else if (i == 3) {
									int i_5073_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]) & 0xff)]);
									int i_5074_ = anInt10928;
									int i_5075_ = i_5073_ + i_5074_;
									int i_5076_ = ((i_5073_ & 0xff00ff) + (i_5074_ & 0xff00ff));
									int i_5077_ = ((i_5076_ & 0x1000100) + (i_5075_ - i_5076_ & 0x10000));
									is[i_5068_] = (i_5075_ - i_5077_ | i_5077_ - (i_5077_ >>> 8));
								} else if (i == 2) {
									int i_5078_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]) & 0xff)]);
									int i_5079_ = ((i_5078_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5080_ = ((i_5078_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_5068_] = (((i_5079_ | i_5080_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 1) {
								if (i == 1) {
									int i_5081_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5081_ != 0)
										is[i_5068_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5081_ & 0xff]);
								} else if (i == 0) {
									int i_5082_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5082_ != 0) {
										int i_5083_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5082_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_5084_ = anInt10928 >>> 24;
											int i_5085_ = 256 - i_5084_;
											int i_5086_ = is[i_5068_];
											is[i_5068_] = (((((i_5083_ & 0xff00ff) * i_5084_) + ((i_5086_ & 0xff00ff) * i_5085_)) & ~0xff00ff) + ((((i_5083_ & 0xff00) * i_5084_) + ((i_5086_ & 0xff00) * i_5085_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_5087_ = (((i_5083_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5088_ = (((i_5083_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5089_ = (((i_5083_ & 0xff) * anInt10960) & 0xff00);
											i_5083_ = (i_5087_ | i_5088_ | i_5089_) >>> 8;
											int i_5090_ = is[i_5068_];
											is[i_5068_] = (((((i_5083_ & 0xff00ff) * anInt10934) + ((i_5090_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5083_ & 0xff00) * anInt10934) + ((i_5090_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_5091_ = (((i_5083_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5092_ = (((i_5083_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5093_ = (((i_5083_ & 0xff) * anInt10960) & 0xff00);
											is[i_5068_] = (i_5091_ | i_5092_ | i_5093_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_5094_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									int i_5095_ = (i_5094_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5094_]) : 0);
									int i_5096_ = anInt10928;
									int i_5097_ = i_5095_ + i_5096_;
									int i_5098_ = ((i_5095_ & 0xff00ff) + (i_5096_ & 0xff00ff));
									int i_5099_ = ((i_5098_ & 0x1000100) + (i_5097_ - i_5098_ & 0x10000));
									i_5099_ = (i_5097_ - i_5099_ | i_5099_ - (i_5099_ >>> 8));
									if (i_5095_ == 0 && anInt10934 != 255) {
										i_5095_ = i_5099_;
										i_5099_ = is[i_5068_];
										i_5099_ = (((((i_5095_ & 0xff00ff) * anInt10934) + ((i_5099_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5095_ & 0xff00) * anInt10934) + ((i_5099_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_5068_] = i_5099_;
								} else if (i == 2) {
									int i_5100_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5100_ != 0) {
										int i_5101_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5100_ & 0xff]);
										int i_5102_ = (((i_5101_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5103_ = ((i_5101_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_5068_++] = ((i_5102_ | i_5103_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 2) {
								if (i == 1) {
									int i_5104_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5104_ != 0) {
										int i_5105_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5104_ & 0xff]);
										int i_5106_ = is[i_5068_];
										int i_5107_ = i_5105_ + i_5106_;
										int i_5108_ = ((i_5105_ & 0xff00ff) + (i_5106_ & 0xff00ff));
										i_5106_ = ((i_5108_ & 0x1000100) + (i_5107_ - i_5108_ & 0x10000));
										is[i_5068_] = (i_5107_ - i_5106_ | i_5106_ - (i_5106_ >>> 8));
									}
								} else if (i == 0) {
									int i_5109_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5109_ != 0) {
										int i_5110_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5109_ & 0xff]);
										int i_5111_ = (((i_5110_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5112_ = ((i_5110_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5113_ = ((i_5110_ & 0xff) * anInt10960 & 0xff00);
										i_5110_ = (i_5111_ | i_5112_ | i_5113_) >>> 8;
										int i_5114_ = is[i_5068_];
										int i_5115_ = i_5110_ + i_5114_;
										int i_5116_ = ((i_5110_ & 0xff00ff) + (i_5114_ & 0xff00ff));
										i_5114_ = ((i_5116_ & 0x1000100) + (i_5115_ - i_5116_ & 0x10000));
										is[i_5068_] = (i_5115_ - i_5114_ | i_5114_ - (i_5114_ >>> 8));
									}
								} else if (i == 3) {
									byte i_5117_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									int i_5118_ = (i_5117_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5117_]) : 0);
									int i_5119_ = anInt10928;
									int i_5120_ = i_5118_ + i_5119_;
									int i_5121_ = ((i_5118_ & 0xff00ff) + (i_5119_ & 0xff00ff));
									int i_5122_ = ((i_5121_ & 0x1000100) + (i_5120_ - i_5121_ & 0x10000));
									i_5122_ = (i_5120_ - i_5122_ | i_5122_ - (i_5122_ >>> 8));
									if (i_5118_ == 0 && anInt10934 != 255) {
										i_5118_ = i_5122_;
										i_5122_ = is[i_5068_];
										i_5122_ = (((((i_5118_ & 0xff00ff) * anInt10934) + ((i_5122_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5118_ & 0xff00) * anInt10934) + ((i_5122_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_5068_] = i_5122_;
								} else if (i == 2) {
									int i_5123_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5067_]);
									if (i_5123_ != 0) {
										int i_5124_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5123_ & 0xff]);
										int i_5125_ = (((i_5124_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5126_ = ((i_5124_ & 0xff00) * anInt10934 & 0xff0000);
										i_5124_ = (((i_5125_ | i_5126_) >>> 8) + anInt10963);
										int i_5127_ = is[i_5068_];
										int i_5128_ = i_5124_ + i_5127_;
										int i_5129_ = ((i_5124_ & 0xff00ff) + (i_5127_ & 0xff00ff));
										i_5127_ = ((i_5129_ & 0x1000100) + (i_5128_ - i_5129_ & 0x10000));
										is[i_5068_] = (i_5128_ - i_5127_ | i_5127_ - (i_5127_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_5063_ += anInt10956;
							i_5064_ += anInt10946;
						}
						i_5061_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_5130_ = anInt10940;
				while (i_5130_ < 0) {
					int i_5131_ = anInt10944;
					int i_5132_ = anInt10951 + anInt10953;
					int i_5133_ = anInt10952;
					int i_5134_ = anInt10958;
					if (i_5133_ >= 0 && i_5133_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) < 0) {
						if (i_5132_ < 0) {
							int i_5135_ = (anInt10956 - 1 - i_5132_) / anInt10956;
							i_5134_ += i_5135_;
							i_5132_ += anInt10956 * i_5135_;
							i_5131_ += i_5135_;
						}
						int i_5136_;
						if ((i_5136_ = (1 + i_5132_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5134_)
							i_5134_ = i_5136_;
						for (/**/; i_5134_ < 0; i_5134_++) {
							int i_5137_ = (((i_5133_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5132_ >> 12));
							int i_5138_ = i_5131_++;
							if (i_4715_ == 0) {
								if (i == 1)
									is[i_5138_] = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]) & 0xff)]);
								else if (i == 0) {
									int i_5139_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]) & 0xff)]);
									int i_5140_ = ((i_5139_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_5141_ = ((i_5139_ & 0xff00) * anInt10959 & 0xff0000);
									int i_5142_ = ((i_5139_ & 0xff) * anInt10960 & 0xff00);
									is[i_5138_] = (i_5140_ | i_5141_ | i_5142_) >>> 8;
								} else if (i == 3) {
									int i_5143_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]) & 0xff)]);
									int i_5144_ = anInt10928;
									int i_5145_ = i_5143_ + i_5144_;
									int i_5146_ = ((i_5143_ & 0xff00ff) + (i_5144_ & 0xff00ff));
									int i_5147_ = ((i_5146_ & 0x1000100) + (i_5145_ - i_5146_ & 0x10000));
									is[i_5138_] = (i_5145_ - i_5147_ | i_5147_ - (i_5147_ >>> 8));
								} else if (i == 2) {
									int i_5148_ = (((Class161_Sub3_Sub1) this).anIntArray11151[((((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]) & 0xff)]);
									int i_5149_ = ((i_5148_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5150_ = ((i_5148_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_5138_] = (((i_5149_ | i_5150_) >>> 8) + anInt10963);
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 1) {
								if (i == 1) {
									int i_5151_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5151_ != 0)
										is[i_5138_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5151_ & 0xff]);
								} else if (i == 0) {
									int i_5152_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5152_ != 0) {
										int i_5153_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5152_ & 0xff]);
										if ((anInt10928 & 0xffffff) == 16777215) {
											int i_5154_ = anInt10928 >>> 24;
											int i_5155_ = 256 - i_5154_;
											int i_5156_ = is[i_5138_];
											is[i_5138_] = (((((i_5153_ & 0xff00ff) * i_5154_) + ((i_5156_ & 0xff00ff) * i_5155_)) & ~0xff00ff) + ((((i_5153_ & 0xff00) * i_5154_) + ((i_5156_ & 0xff00) * i_5155_)) & 0xff0000)) >> 8;
										} else if (anInt10934 != 255) {
											int i_5157_ = (((i_5153_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5158_ = (((i_5153_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5159_ = (((i_5153_ & 0xff) * anInt10960) & 0xff00);
											i_5153_ = (i_5157_ | i_5158_ | i_5159_) >>> 8;
											int i_5160_ = is[i_5138_];
											is[i_5138_] = (((((i_5153_ & 0xff00ff) * anInt10934) + ((i_5160_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5153_ & 0xff00) * anInt10934) + ((i_5160_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
										} else {
											int i_5161_ = (((i_5153_ & 0xff0000) * anInt10955) & ~0xffffff);
											int i_5162_ = (((i_5153_ & 0xff00) * anInt10959) & 0xff0000);
											int i_5163_ = (((i_5153_ & 0xff) * anInt10960) & 0xff00);
											is[i_5138_] = (i_5161_ | i_5162_ | i_5163_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_5164_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									int i_5165_ = (i_5164_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5164_]) : 0);
									int i_5166_ = anInt10928;
									int i_5167_ = i_5165_ + i_5166_;
									int i_5168_ = ((i_5165_ & 0xff00ff) + (i_5166_ & 0xff00ff));
									int i_5169_ = ((i_5168_ & 0x1000100) + (i_5167_ - i_5168_ & 0x10000));
									i_5169_ = (i_5167_ - i_5169_ | i_5169_ - (i_5169_ >>> 8));
									if (i_5165_ == 0 && anInt10934 != 255) {
										i_5165_ = i_5169_;
										i_5169_ = is[i_5138_];
										i_5169_ = (((((i_5165_ & 0xff00ff) * anInt10934) + ((i_5169_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5165_ & 0xff00) * anInt10934) + ((i_5169_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_5138_] = i_5169_;
								} else if (i == 2) {
									int i_5170_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5170_ != 0) {
										int i_5171_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5170_ & 0xff]);
										int i_5172_ = (((i_5171_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5173_ = ((i_5171_ & 0xff00) * anInt10934 & 0xff0000);
										is[i_5138_++] = ((i_5172_ | i_5173_) >>> 8) + anInt10963;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4715_ == 2) {
								if (i == 1) {
									int i_5174_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5174_ != 0) {
										int i_5175_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5174_ & 0xff]);
										int i_5176_ = is[i_5138_];
										int i_5177_ = i_5175_ + i_5176_;
										int i_5178_ = ((i_5175_ & 0xff00ff) + (i_5176_ & 0xff00ff));
										i_5176_ = ((i_5178_ & 0x1000100) + (i_5177_ - i_5178_ & 0x10000));
										is[i_5138_] = (i_5177_ - i_5176_ | i_5176_ - (i_5176_ >>> 8));
									}
								} else if (i == 0) {
									int i_5179_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5179_ != 0) {
										int i_5180_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5179_ & 0xff]);
										int i_5181_ = (((i_5180_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5182_ = ((i_5180_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5183_ = ((i_5180_ & 0xff) * anInt10960 & 0xff00);
										i_5180_ = (i_5181_ | i_5182_ | i_5183_) >>> 8;
										int i_5184_ = is[i_5138_];
										int i_5185_ = i_5180_ + i_5184_;
										int i_5186_ = ((i_5180_ & 0xff00ff) + (i_5184_ & 0xff00ff));
										i_5184_ = ((i_5186_ & 0x1000100) + (i_5185_ - i_5186_ & 0x10000));
										is[i_5138_] = (i_5185_ - i_5184_ | i_5184_ - (i_5184_ >>> 8));
									}
								} else if (i == 3) {
									byte i_5187_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									int i_5188_ = (i_5187_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5187_]) : 0);
									int i_5189_ = anInt10928;
									int i_5190_ = i_5188_ + i_5189_;
									int i_5191_ = ((i_5188_ & 0xff00ff) + (i_5189_ & 0xff00ff));
									int i_5192_ = ((i_5191_ & 0x1000100) + (i_5190_ - i_5191_ & 0x10000));
									i_5192_ = (i_5190_ - i_5192_ | i_5192_ - (i_5192_ >>> 8));
									if (i_5188_ == 0 && anInt10934 != 255) {
										i_5188_ = i_5192_;
										i_5192_ = is[i_5138_];
										i_5192_ = (((((i_5188_ & 0xff00ff) * anInt10934) + ((i_5192_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5188_ & 0xff00) * anInt10934) + ((i_5192_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									}
									is[i_5138_] = i_5192_;
								} else if (i == 2) {
									int i_5193_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5137_]);
									if (i_5193_ != 0) {
										int i_5194_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5193_ & 0xff]);
										int i_5195_ = (((i_5194_ & 0xff00ff) * anInt10934) & ~0xff00ff);
										int i_5196_ = ((i_5194_ & 0xff00) * anInt10934 & 0xff0000);
										i_5194_ = (((i_5195_ | i_5196_) >>> 8) + anInt10963);
										int i_5197_ = is[i_5138_];
										int i_5198_ = i_5194_ + i_5197_;
										int i_5199_ = ((i_5194_ & 0xff00ff) + (i_5197_ & 0xff00ff));
										i_5197_ = ((i_5199_ & 0x1000100) + (i_5198_ - i_5199_ & 0x10000));
										is[i_5138_] = (i_5198_ - i_5197_ | i_5197_ - (i_5197_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_5132_ += anInt10956;
						}
					}
					i_5130_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				for (int i_5200_ = anInt10940; i_5200_ < 0; i_5200_++) {
					int i_5201_ = anInt10944;
					int i_5202_ = anInt10951 + anInt10953;
					int i_5203_ = anInt10952 + anInt10954;
					int i_5204_ = anInt10958;
					if (i_5202_ < 0) {
						int i_5205_ = (anInt10956 - 1 - i_5202_) / anInt10956;
						i_5204_ += i_5205_;
						i_5202_ += anInt10956 * i_5205_;
						i_5203_ += anInt10946 * i_5205_;
						i_5201_ += i_5205_;
					}
					int i_5206_;
					if ((i_5206_ = (1 + i_5202_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5204_)
						i_5204_ = i_5206_;
					if ((i_5206_ = i_5203_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) >= 0) {
						i_5206_ = (anInt10946 - i_5206_) / anInt10946;
						i_5204_ += i_5206_;
						i_5202_ += anInt10956 * i_5206_;
						i_5203_ += anInt10946 * i_5206_;
						i_5201_ += i_5206_;
					}
					if ((i_5206_ = (i_5203_ - anInt10946) / anInt10946) > i_5204_)
						i_5204_ = i_5206_;
					for (/**/; i_5204_ < 0; i_5204_++) {
						int i_5207_ = (((i_5203_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5202_ >> 12));
						int i_5208_ = i_5201_++;
						if (i_4715_ == 0) {
							if (i == 1)
								is[i_5208_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]) & 0xff]);
							else if (i == 0) {
								int i_5209_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]) & 0xff]);
								int i_5210_ = ((i_5209_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_5211_ = ((i_5209_ & 0xff00) * anInt10959 & 0xff0000);
								int i_5212_ = (i_5209_ & 0xff) * anInt10960 & 0xff00;
								is[i_5208_] = (i_5210_ | i_5211_ | i_5212_) >>> 8;
							} else if (i == 3) {
								int i_5213_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]) & 0xff]);
								int i_5214_ = anInt10928;
								int i_5215_ = i_5213_ + i_5214_;
								int i_5216_ = ((i_5213_ & 0xff00ff) + (i_5214_ & 0xff00ff));
								int i_5217_ = ((i_5216_ & 0x1000100) + (i_5215_ - i_5216_ & 0x10000));
								is[i_5208_] = i_5215_ - i_5217_ | i_5217_ - (i_5217_ >>> 8);
							} else if (i == 2) {
								int i_5218_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]) & 0xff]);
								int i_5219_ = ((i_5218_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_5220_ = ((i_5218_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_5208_] = ((i_5219_ | i_5220_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_4715_ == 1) {
							if (i == 1) {
								int i_5221_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5221_ != 0)
									is[i_5208_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5221_ & 0xff]);
							} else if (i == 0) {
								int i_5222_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5222_ != 0) {
									int i_5223_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5222_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_5224_ = anInt10928 >>> 24;
										int i_5225_ = 256 - i_5224_;
										int i_5226_ = is[i_5208_];
										is[i_5208_] = ((((i_5223_ & 0xff00ff) * i_5224_ + ((i_5226_ & 0xff00ff) * i_5225_)) & ~0xff00ff) + (((i_5223_ & 0xff00) * i_5224_ + ((i_5226_ & 0xff00) * i_5225_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_5227_ = (((i_5223_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5228_ = ((i_5223_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5229_ = ((i_5223_ & 0xff) * anInt10960 & 0xff00);
										i_5223_ = (i_5227_ | i_5228_ | i_5229_) >>> 8;
										int i_5230_ = is[i_5208_];
										is[i_5208_] = (((((i_5223_ & 0xff00ff) * anInt10934) + ((i_5230_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5223_ & 0xff00) * anInt10934) + ((i_5230_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_5231_ = (((i_5223_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5232_ = ((i_5223_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5233_ = ((i_5223_ & 0xff) * anInt10960 & 0xff00);
										is[i_5208_] = (i_5231_ | i_5232_ | i_5233_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_5234_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								int i_5235_ = (i_5234_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5234_]) : 0);
								int i_5236_ = anInt10928;
								int i_5237_ = i_5235_ + i_5236_;
								int i_5238_ = ((i_5235_ & 0xff00ff) + (i_5236_ & 0xff00ff));
								int i_5239_ = ((i_5238_ & 0x1000100) + (i_5237_ - i_5238_ & 0x10000));
								i_5239_ = i_5237_ - i_5239_ | i_5239_ - (i_5239_ >>> 8);
								if (i_5235_ == 0 && anInt10934 != 255) {
									i_5235_ = i_5239_;
									i_5239_ = is[i_5208_];
									i_5239_ = ((((i_5235_ & 0xff00ff) * anInt10934 + ((i_5239_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_5235_ & 0xff00) * anInt10934 + ((i_5239_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_5208_] = i_5239_;
							} else if (i == 2) {
								int i_5240_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5240_ != 0) {
									int i_5241_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5240_ & 0xff]);
									int i_5242_ = ((i_5241_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5243_ = ((i_5241_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_5208_++] = ((i_5242_ | i_5243_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_4715_ == 2) {
							if (i == 1) {
								int i_5244_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5244_ != 0) {
									int i_5245_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5244_ & 0xff]);
									int i_5246_ = is[i_5208_];
									int i_5247_ = i_5245_ + i_5246_;
									int i_5248_ = ((i_5245_ & 0xff00ff) + (i_5246_ & 0xff00ff));
									i_5246_ = ((i_5248_ & 0x1000100) + (i_5247_ - i_5248_ & 0x10000));
									is[i_5208_] = (i_5247_ - i_5246_ | i_5246_ - (i_5246_ >>> 8));
								}
							} else if (i == 0) {
								int i_5249_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5249_ != 0) {
									int i_5250_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5249_ & 0xff]);
									int i_5251_ = ((i_5250_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_5252_ = ((i_5250_ & 0xff00) * anInt10959 & 0xff0000);
									int i_5253_ = ((i_5250_ & 0xff) * anInt10960 & 0xff00);
									i_5250_ = (i_5251_ | i_5252_ | i_5253_) >>> 8;
									int i_5254_ = is[i_5208_];
									int i_5255_ = i_5250_ + i_5254_;
									int i_5256_ = ((i_5250_ & 0xff00ff) + (i_5254_ & 0xff00ff));
									i_5254_ = ((i_5256_ & 0x1000100) + (i_5255_ - i_5256_ & 0x10000));
									is[i_5208_] = (i_5255_ - i_5254_ | i_5254_ - (i_5254_ >>> 8));
								}
							} else if (i == 3) {
								byte i_5257_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								int i_5258_ = (i_5257_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5257_]) : 0);
								int i_5259_ = anInt10928;
								int i_5260_ = i_5258_ + i_5259_;
								int i_5261_ = ((i_5258_ & 0xff00ff) + (i_5259_ & 0xff00ff));
								int i_5262_ = ((i_5261_ & 0x1000100) + (i_5260_ - i_5261_ & 0x10000));
								i_5262_ = i_5260_ - i_5262_ | i_5262_ - (i_5262_ >>> 8);
								if (i_5258_ == 0 && anInt10934 != 255) {
									i_5258_ = i_5262_;
									i_5262_ = is[i_5208_];
									i_5262_ = ((((i_5258_ & 0xff00ff) * anInt10934 + ((i_5262_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_5258_ & 0xff00) * anInt10934 + ((i_5262_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_5208_] = i_5262_;
							} else if (i == 2) {
								int i_5263_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5207_]);
								if (i_5263_ != 0) {
									int i_5264_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5263_ & 0xff]);
									int i_5265_ = ((i_5264_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5266_ = ((i_5264_ & 0xff00) * anInt10934 & 0xff0000);
									i_5264_ = (((i_5265_ | i_5266_) >>> 8) + anInt10963);
									int i_5267_ = is[i_5208_];
									int i_5268_ = i_5264_ + i_5267_;
									int i_5269_ = ((i_5264_ & 0xff00ff) + (i_5267_ & 0xff00ff));
									i_5267_ = ((i_5269_ & 0x1000100) + (i_5268_ - i_5269_ & 0x10000));
									is[i_5208_] = (i_5268_ - i_5267_ | i_5267_ - (i_5267_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_5202_ += anInt10956;
						i_5203_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				for (int i_5270_ = anInt10940; i_5270_ < 0; i_5270_++) {
					int i_5271_ = anInt10944;
					int i_5272_ = anInt10951 + anInt10953;
					int i_5273_ = anInt10952 + anInt10954;
					int i_5274_ = anInt10958;
					if (i_5272_ < 0) {
						int i_5275_ = (anInt10956 - 1 - i_5272_) / anInt10956;
						i_5274_ += i_5275_;
						i_5272_ += anInt10956 * i_5275_;
						i_5273_ += anInt10946 * i_5275_;
						i_5271_ += i_5275_;
					}
					int i_5276_;
					if ((i_5276_ = (1 + i_5272_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5274_)
						i_5274_ = i_5276_;
					if (i_5273_ < 0) {
						i_5276_ = (anInt10946 - 1 - i_5273_) / anInt10946;
						i_5274_ += i_5276_;
						i_5272_ += anInt10956 * i_5276_;
						i_5273_ += anInt10946 * i_5276_;
						i_5271_ += i_5276_;
					}
					if ((i_5276_ = (1 + i_5273_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_5274_)
						i_5274_ = i_5276_;
					for (/**/; i_5274_ < 0; i_5274_++) {
						int i_5277_ = (((i_5273_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5272_ >> 12));
						int i_5278_ = i_5271_++;
						if (i_4715_ == 0) {
							if (i == 1)
								is[i_5278_] = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]) & 0xff]);
							else if (i == 0) {
								int i_5279_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]) & 0xff]);
								int i_5280_ = ((i_5279_ & 0xff0000) * anInt10955 & ~0xffffff);
								int i_5281_ = ((i_5279_ & 0xff00) * anInt10959 & 0xff0000);
								int i_5282_ = (i_5279_ & 0xff) * anInt10960 & 0xff00;
								is[i_5278_] = (i_5280_ | i_5281_ | i_5282_) >>> 8;
							} else if (i == 3) {
								int i_5283_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]) & 0xff]);
								int i_5284_ = anInt10928;
								int i_5285_ = i_5283_ + i_5284_;
								int i_5286_ = ((i_5283_ & 0xff00ff) + (i_5284_ & 0xff00ff));
								int i_5287_ = ((i_5286_ & 0x1000100) + (i_5285_ - i_5286_ & 0x10000));
								is[i_5278_] = i_5285_ - i_5287_ | i_5287_ - (i_5287_ >>> 8);
							} else if (i == 2) {
								int i_5288_ = (((Class161_Sub3_Sub1) this).anIntArray11151[(((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]) & 0xff]);
								int i_5289_ = ((i_5288_ & 0xff00ff) * anInt10934 & ~0xff00ff);
								int i_5290_ = ((i_5288_ & 0xff00) * anInt10934 & 0xff0000);
								is[i_5278_] = ((i_5289_ | i_5290_) >>> 8) + anInt10963;
							} else
								throw new IllegalArgumentException();
						} else if (i_4715_ == 1) {
							if (i == 1) {
								int i_5291_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5291_ != 0)
									is[i_5278_] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5291_ & 0xff]);
							} else if (i == 0) {
								int i_5292_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5292_ != 0) {
									int i_5293_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5292_ & 0xff]);
									if ((anInt10928 & 0xffffff) == 16777215) {
										int i_5294_ = anInt10928 >>> 24;
										int i_5295_ = 256 - i_5294_;
										int i_5296_ = is[i_5278_];
										is[i_5278_] = ((((i_5293_ & 0xff00ff) * i_5294_ + ((i_5296_ & 0xff00ff) * i_5295_)) & ~0xff00ff) + (((i_5293_ & 0xff00) * i_5294_ + ((i_5296_ & 0xff00) * i_5295_)) & 0xff0000)) >> 8;
									} else if (anInt10934 != 255) {
										int i_5297_ = (((i_5293_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5298_ = ((i_5293_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5299_ = ((i_5293_ & 0xff) * anInt10960 & 0xff00);
										i_5293_ = (i_5297_ | i_5298_ | i_5299_) >>> 8;
										int i_5300_ = is[i_5278_];
										is[i_5278_] = (((((i_5293_ & 0xff00ff) * anInt10934) + ((i_5300_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + ((((i_5293_ & 0xff00) * anInt10934) + ((i_5300_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
									} else {
										int i_5301_ = (((i_5293_ & 0xff0000) * anInt10955) & ~0xffffff);
										int i_5302_ = ((i_5293_ & 0xff00) * anInt10959 & 0xff0000);
										int i_5303_ = ((i_5293_ & 0xff) * anInt10960 & 0xff00);
										is[i_5278_] = (i_5301_ | i_5302_ | i_5303_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_5304_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								int i_5305_ = (i_5304_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5304_]) : 0);
								int i_5306_ = anInt10928;
								int i_5307_ = i_5305_ + i_5306_;
								int i_5308_ = ((i_5305_ & 0xff00ff) + (i_5306_ & 0xff00ff));
								int i_5309_ = ((i_5308_ & 0x1000100) + (i_5307_ - i_5308_ & 0x10000));
								i_5309_ = i_5307_ - i_5309_ | i_5309_ - (i_5309_ >>> 8);
								if (i_5305_ == 0 && anInt10934 != 255) {
									i_5305_ = i_5309_;
									i_5309_ = is[i_5278_];
									i_5309_ = ((((i_5305_ & 0xff00ff) * anInt10934 + ((i_5309_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_5305_ & 0xff00) * anInt10934 + ((i_5309_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_5278_] = i_5309_;
							} else if (i == 2) {
								int i_5310_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5310_ != 0) {
									int i_5311_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5310_ & 0xff]);
									int i_5312_ = ((i_5311_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5313_ = ((i_5311_ & 0xff00) * anInt10934 & 0xff0000);
									is[i_5278_++] = ((i_5312_ | i_5313_) >>> 8) + anInt10963;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_4715_ == 2) {
							if (i == 1) {
								int i_5314_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5314_ != 0) {
									int i_5315_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5314_ & 0xff]);
									int i_5316_ = is[i_5278_];
									int i_5317_ = i_5315_ + i_5316_;
									int i_5318_ = ((i_5315_ & 0xff00ff) + (i_5316_ & 0xff00ff));
									i_5316_ = ((i_5318_ & 0x1000100) + (i_5317_ - i_5318_ & 0x10000));
									is[i_5278_] = (i_5317_ - i_5316_ | i_5316_ - (i_5316_ >>> 8));
								}
							} else if (i == 0) {
								int i_5319_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5319_ != 0) {
									int i_5320_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5319_ & 0xff]);
									int i_5321_ = ((i_5320_ & 0xff0000) * anInt10955 & ~0xffffff);
									int i_5322_ = ((i_5320_ & 0xff00) * anInt10959 & 0xff0000);
									int i_5323_ = ((i_5320_ & 0xff) * anInt10960 & 0xff00);
									i_5320_ = (i_5321_ | i_5322_ | i_5323_) >>> 8;
									int i_5324_ = is[i_5278_];
									int i_5325_ = i_5320_ + i_5324_;
									int i_5326_ = ((i_5320_ & 0xff00ff) + (i_5324_ & 0xff00ff));
									i_5324_ = ((i_5326_ & 0x1000100) + (i_5325_ - i_5326_ & 0x10000));
									is[i_5278_] = (i_5325_ - i_5324_ | i_5324_ - (i_5324_ >>> 8));
								}
							} else if (i == 3) {
								byte i_5327_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								int i_5328_ = (i_5327_ > 0 ? (((Class161_Sub3_Sub1) this).anIntArray11151[i_5327_]) : 0);
								int i_5329_ = anInt10928;
								int i_5330_ = i_5328_ + i_5329_;
								int i_5331_ = ((i_5328_ & 0xff00ff) + (i_5329_ & 0xff00ff));
								int i_5332_ = ((i_5331_ & 0x1000100) + (i_5330_ - i_5331_ & 0x10000));
								i_5332_ = i_5330_ - i_5332_ | i_5332_ - (i_5332_ >>> 8);
								if (i_5328_ == 0 && anInt10934 != 255) {
									i_5328_ = i_5332_;
									i_5332_ = is[i_5278_];
									i_5332_ = ((((i_5328_ & 0xff00ff) * anInt10934 + ((i_5332_ & 0xff00ff) * anInt10957)) & ~0xff00ff) + (((i_5328_ & 0xff00) * anInt10934 + ((i_5332_ & 0xff00) * anInt10957)) & 0xff0000)) >> 8;
								}
								is[i_5278_] = i_5332_;
							} else if (i == 2) {
								int i_5333_ = (((Class161_Sub3_Sub1) this).aByteArray11152[i_5277_]);
								if (i_5333_ != 0) {
									int i_5334_ = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5333_ & 0xff]);
									int i_5335_ = ((i_5334_ & 0xff00ff) * anInt10934 & ~0xff00ff);
									int i_5336_ = ((i_5334_ & 0xff00) * anInt10934 & 0xff0000);
									i_5334_ = (((i_5335_ | i_5336_) >>> 8) + anInt10963);
									int i_5337_ = is[i_5278_];
									int i_5338_ = i_5334_ + i_5337_;
									int i_5339_ = ((i_5334_ & 0xff00ff) + (i_5337_ & 0xff00ff));
									i_5337_ = ((i_5339_ & 0x1000100) + (i_5338_ - i_5339_ & 0x10000));
									is[i_5278_] = (i_5338_ - i_5337_ | i_5337_ - (i_5337_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_5272_ += anInt10956;
						i_5273_ += anInt10946;
					}
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	void method10059(int[] is, int[] is_5340_, int i, int i_5341_) {
		int[] is_5342_ = (((Class106_Sub2) ((Class161_Sub3_Sub1) this).aClass106_Sub2_10932).anIntArray10218);
		if (is_5342_ != null) {
			if (anInt10956 == 0) {
				if (anInt10946 == 0) {
					int i_5343_ = anInt10940;
					while (i_5343_ < 0) {
						int i_5344_ = i_5343_ + i_5341_;
						if (i_5344_ >= 0) {
							if (i_5344_ >= is.length)
								break;
							int i_5345_ = anInt10944;
							int i_5346_ = anInt10951;
							int i_5347_ = anInt10952;
							int i_5348_ = anInt10958;
							if (i_5346_ >= 0 && i_5347_ >= 0 && (i_5346_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0 && (i_5347_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
								int i_5349_ = is[i_5344_] - i;
								int i_5350_ = -is_5340_[i_5344_];
								int i_5351_ = i_5349_ - (i_5345_ - anInt10944);
								if (i_5351_ > 0) {
									i_5345_ += i_5351_;
									i_5348_ += i_5351_;
									i_5346_ += anInt10956 * i_5351_;
									i_5347_ += anInt10946 * i_5351_;
								} else
									i_5350_ -= i_5351_;
								if (i_5348_ < i_5350_)
									i_5348_ = i_5350_;
								for (/**/; i_5348_ < 0; i_5348_++) {
									int i_5352_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5347_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5346_ >> 12))]);
									if (i_5352_ != 0)
										is_5342_[i_5345_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5352_ & 0xff]);
									else
										i_5345_++;
								}
							}
						}
						i_5343_++;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_5353_ = anInt10940;
					while (i_5353_ < 0) {
						int i_5354_ = i_5353_ + i_5341_;
						if (i_5354_ >= 0) {
							if (i_5354_ >= is.length)
								break;
							int i_5355_ = anInt10944;
							int i_5356_ = anInt10951;
							int i_5357_ = anInt10952 + anInt10954;
							int i_5358_ = anInt10958;
							if (i_5356_ >= 0 && (i_5356_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
								int i_5359_;
								if ((i_5359_ = i_5357_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
									i_5359_ = (anInt10946 - i_5359_) / anInt10946;
									i_5358_ += i_5359_;
									i_5357_ += anInt10946 * i_5359_;
									i_5355_ += i_5359_;
								}
								if ((i_5359_ = (i_5357_ - anInt10946) / anInt10946) > i_5358_)
									i_5358_ = i_5359_;
								int i_5360_ = is[i_5354_] - i;
								int i_5361_ = -is_5340_[i_5354_];
								int i_5362_ = i_5360_ - (i_5355_ - anInt10944);
								if (i_5362_ > 0) {
									i_5355_ += i_5362_;
									i_5358_ += i_5362_;
									i_5356_ += anInt10956 * i_5362_;
									i_5357_ += anInt10946 * i_5362_;
								} else
									i_5361_ -= i_5362_;
								if (i_5358_ < i_5361_)
									i_5358_ = i_5361_;
								for (/**/; i_5358_ < 0; i_5358_++) {
									int i_5363_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5357_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5356_ >> 12))]);
									if (i_5363_ != 0)
										is_5342_[i_5355_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5363_ & 0xff]);
									else
										i_5355_++;
									i_5357_ += anInt10946;
								}
							}
						}
						i_5353_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				} else {
					int i_5364_ = anInt10940;
					while (i_5364_ < 0) {
						int i_5365_ = i_5364_ + i_5341_;
						if (i_5365_ >= 0) {
							if (i_5365_ >= is.length)
								break;
							int i_5366_ = anInt10944;
							int i_5367_ = anInt10951;
							int i_5368_ = anInt10952 + anInt10954;
							int i_5369_ = anInt10958;
							if (i_5367_ >= 0 && (i_5367_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12)) < 0) {
								if (i_5368_ < 0) {
									int i_5370_ = ((anInt10946 - 1 - i_5368_) / anInt10946);
									i_5369_ += i_5370_;
									i_5368_ += anInt10946 * i_5370_;
									i_5366_ += i_5370_;
								}
								int i_5371_;
								if ((i_5371_ = (1 + i_5368_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12) - anInt10946) / anInt10946) > i_5369_)
									i_5369_ = i_5371_;
								int i_5372_ = is[i_5365_] - i;
								int i_5373_ = -is_5340_[i_5365_];
								int i_5374_ = i_5372_ - (i_5366_ - anInt10944);
								if (i_5374_ > 0) {
									i_5366_ += i_5374_;
									i_5369_ += i_5374_;
									i_5367_ += anInt10956 * i_5374_;
									i_5368_ += anInt10946 * i_5374_;
								} else
									i_5373_ -= i_5374_;
								if (i_5369_ < i_5373_)
									i_5369_ = i_5373_;
								for (/**/; i_5369_ < 0; i_5369_++) {
									int i_5375_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5368_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5367_ >> 12))]);
									if (i_5375_ != 0)
										is_5342_[i_5366_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5375_ & 0xff]);
									else
										i_5366_++;
									i_5368_ += anInt10946;
								}
							}
						}
						i_5364_++;
						anInt10951 += anInt10947;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10956 < 0) {
				if (anInt10946 == 0) {
					int i_5376_ = anInt10940;
					while (i_5376_ < 0) {
						int i_5377_ = i_5376_ + i_5341_;
						if (i_5377_ >= 0) {
							if (i_5377_ >= is.length)
								break;
							int i_5378_ = anInt10944;
							int i_5379_ = anInt10951 + anInt10953;
							int i_5380_ = anInt10952;
							int i_5381_ = anInt10958;
							if (i_5380_ >= 0 && (i_5380_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
								int i_5382_;
								if ((i_5382_ = i_5379_ - ((((Class161_Sub3_Sub1) this).anInt10945) << 12)) >= 0) {
									i_5382_ = (anInt10956 - i_5382_) / anInt10956;
									i_5381_ += i_5382_;
									i_5379_ += anInt10956 * i_5382_;
									i_5378_ += i_5382_;
								}
								if ((i_5382_ = (i_5379_ - anInt10956) / anInt10956) > i_5381_)
									i_5381_ = i_5382_;
								int i_5383_ = is[i_5377_] - i;
								int i_5384_ = -is_5340_[i_5377_];
								int i_5385_ = i_5383_ - (i_5378_ - anInt10944);
								if (i_5385_ > 0) {
									i_5378_ += i_5385_;
									i_5381_ += i_5385_;
									i_5379_ += anInt10956 * i_5385_;
									i_5380_ += anInt10946 * i_5385_;
								} else
									i_5384_ -= i_5385_;
								if (i_5381_ < i_5384_)
									i_5381_ = i_5384_;
								for (/**/; i_5381_ < 0; i_5381_++) {
									int i_5386_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5380_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5379_ >> 12))]);
									if (i_5386_ != 0)
										is_5342_[i_5378_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5386_ & 0xff]);
									else
										i_5378_++;
									i_5379_ += anInt10956;
								}
							}
						}
						i_5376_++;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else if (anInt10946 < 0) {
					int i_5387_ = anInt10940;
					while (i_5387_ < 0) {
						int i_5388_ = i_5387_ + i_5341_;
						if (i_5388_ >= 0) {
							if (i_5388_ >= is.length)
								break;
							int i_5389_ = anInt10944;
							int i_5390_ = anInt10951 + anInt10953;
							int i_5391_ = anInt10952 + anInt10954;
							int i_5392_ = anInt10958;
							int i_5393_;
							if ((i_5393_ = (i_5390_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_5393_ = (anInt10956 - i_5393_) / anInt10956;
								i_5392_ += i_5393_;
								i_5390_ += anInt10956 * i_5393_;
								i_5391_ += anInt10946 * i_5393_;
								i_5389_ += i_5393_;
							}
							if ((i_5393_ = (i_5390_ - anInt10956) / anInt10956) > i_5392_)
								i_5392_ = i_5393_;
							if ((i_5393_ = (i_5391_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12))) >= 0) {
								i_5393_ = (anInt10946 - i_5393_) / anInt10946;
								i_5392_ += i_5393_;
								i_5390_ += anInt10956 * i_5393_;
								i_5391_ += anInt10946 * i_5393_;
								i_5389_ += i_5393_;
							}
							if ((i_5393_ = (i_5391_ - anInt10946) / anInt10946) > i_5392_)
								i_5392_ = i_5393_;
							int i_5394_ = is[i_5388_] - i;
							int i_5395_ = -is_5340_[i_5388_];
							int i_5396_ = i_5394_ - (i_5389_ - anInt10944);
							if (i_5396_ > 0) {
								i_5389_ += i_5396_;
								i_5392_ += i_5396_;
								i_5390_ += anInt10956 * i_5396_;
								i_5391_ += anInt10946 * i_5396_;
							} else
								i_5395_ -= i_5396_;
							if (i_5392_ < i_5395_)
								i_5392_ = i_5395_;
							for (/**/; i_5392_ < 0; i_5392_++) {
								int i_5397_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_5391_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5390_ >> 12)]);
								if (i_5397_ != 0)
									is_5342_[i_5389_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5397_ & 0xff]);
								else
									i_5389_++;
								i_5390_ += anInt10956;
								i_5391_ += anInt10946;
							}
						}
						i_5387_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				} else {
					int i_5398_ = anInt10940;
					while (i_5398_ < 0) {
						int i_5399_ = i_5398_ + i_5341_;
						if (i_5399_ >= 0) {
							if (i_5399_ >= is.length)
								break;
							int i_5400_ = anInt10944;
							int i_5401_ = anInt10951 + anInt10953;
							int i_5402_ = anInt10952 + anInt10954;
							int i_5403_ = anInt10958;
							int i_5404_;
							if ((i_5404_ = (i_5401_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12))) >= 0) {
								i_5404_ = (anInt10956 - i_5404_) / anInt10956;
								i_5403_ += i_5404_;
								i_5401_ += anInt10956 * i_5404_;
								i_5402_ += anInt10946 * i_5404_;
								i_5400_ += i_5404_;
							}
							if ((i_5404_ = (i_5401_ - anInt10956) / anInt10956) > i_5403_)
								i_5403_ = i_5404_;
							if (i_5402_ < 0) {
								i_5404_ = (anInt10946 - 1 - i_5402_) / anInt10946;
								i_5403_ += i_5404_;
								i_5401_ += anInt10956 * i_5404_;
								i_5402_ += anInt10946 * i_5404_;
								i_5400_ += i_5404_;
							}
							if ((i_5404_ = (1 + i_5402_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_5403_)
								i_5403_ = i_5404_;
							int i_5405_ = is[i_5399_] - i;
							int i_5406_ = -is_5340_[i_5399_];
							int i_5407_ = i_5405_ - (i_5400_ - anInt10944);
							if (i_5407_ > 0) {
								i_5400_ += i_5407_;
								i_5403_ += i_5407_;
								i_5401_ += anInt10956 * i_5407_;
								i_5402_ += anInt10946 * i_5407_;
							} else
								i_5406_ -= i_5407_;
							if (i_5403_ < i_5406_)
								i_5403_ = i_5406_;
							for (/**/; i_5403_ < 0; i_5403_++) {
								int i_5408_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_5402_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5401_ >> 12)]);
								if (i_5408_ != 0)
									is_5342_[i_5400_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5408_ & 0xff]);
								else
									i_5400_++;
								i_5401_ += anInt10956;
								i_5402_ += anInt10946;
							}
						}
						i_5398_++;
						anInt10951 += anInt10947;
						anInt10952 += anInt10950;
						anInt10944 += anInt10943;
					}
				}
			} else if (anInt10946 == 0) {
				int i_5409_ = anInt10940;
				while (i_5409_ < 0) {
					int i_5410_ = i_5409_ + i_5341_;
					if (i_5410_ >= 0) {
						if (i_5410_ >= is.length)
							break;
						int i_5411_ = anInt10944;
						int i_5412_ = anInt10951 + anInt10953;
						int i_5413_ = anInt10952;
						int i_5414_ = anInt10958;
						if (i_5413_ >= 0 && (i_5413_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12)) < 0) {
							if (i_5412_ < 0) {
								int i_5415_ = (anInt10956 - 1 - i_5412_) / anInt10956;
								i_5414_ += i_5415_;
								i_5412_ += anInt10956 * i_5415_;
								i_5411_ += i_5415_;
							}
							int i_5416_;
							if ((i_5416_ = (1 + i_5412_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5414_)
								i_5414_ = i_5416_;
							int i_5417_ = is[i_5410_] - i;
							int i_5418_ = -is_5340_[i_5410_];
							int i_5419_ = i_5417_ - (i_5411_ - anInt10944);
							if (i_5419_ > 0) {
								i_5411_ += i_5419_;
								i_5414_ += i_5419_;
								i_5412_ += anInt10956 * i_5419_;
								i_5413_ += anInt10946 * i_5419_;
							} else
								i_5418_ -= i_5419_;
							if (i_5414_ < i_5418_)
								i_5414_ = i_5418_;
							for (/**/; i_5414_ < 0; i_5414_++) {
								int i_5420_ = (((Class161_Sub3_Sub1) this).aByteArray11152[((i_5413_ >> 12) * (((Class161_Sub3_Sub1) this).anInt10945)) + (i_5412_ >> 12)]);
								if (i_5420_ != 0)
									is_5342_[i_5411_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5420_ & 0xff]);
								else
									i_5411_++;
								i_5412_ += anInt10956;
							}
						}
					}
					i_5409_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else if (anInt10946 < 0) {
				int i_5421_ = anInt10940;
				while (i_5421_ < 0) {
					int i_5422_ = i_5421_ + i_5341_;
					if (i_5422_ >= 0) {
						if (i_5422_ >= is.length)
							break;
						int i_5423_ = anInt10944;
						int i_5424_ = anInt10951 + anInt10953;
						int i_5425_ = anInt10952 + anInt10954;
						int i_5426_ = anInt10958;
						if (i_5424_ < 0) {
							int i_5427_ = (anInt10956 - 1 - i_5424_) / anInt10956;
							i_5426_ += i_5427_;
							i_5424_ += anInt10956 * i_5427_;
							i_5425_ += anInt10946 * i_5427_;
							i_5423_ += i_5427_;
						}
						int i_5428_;
						if ((i_5428_ = (1 + i_5424_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5426_)
							i_5426_ = i_5428_;
						if ((i_5428_ = i_5425_ - ((((Class161_Sub3_Sub1) this).anInt10930) << 12)) >= 0) {
							i_5428_ = (anInt10946 - i_5428_) / anInt10946;
							i_5426_ += i_5428_;
							i_5424_ += anInt10956 * i_5428_;
							i_5425_ += anInt10946 * i_5428_;
							i_5423_ += i_5428_;
						}
						if ((i_5428_ = (i_5425_ - anInt10946) / anInt10946) > i_5426_)
							i_5426_ = i_5428_;
						int i_5429_ = is[i_5422_] - i;
						int i_5430_ = -is_5340_[i_5422_];
						int i_5431_ = i_5429_ - (i_5423_ - anInt10944);
						if (i_5431_ > 0) {
							i_5423_ += i_5431_;
							i_5426_ += i_5431_;
							i_5424_ += anInt10956 * i_5431_;
							i_5425_ += anInt10946 * i_5431_;
						} else
							i_5430_ -= i_5431_;
						if (i_5426_ < i_5430_)
							i_5426_ = i_5430_;
						for (/**/; i_5426_ < 0; i_5426_++) {
							int i_5432_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5425_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5424_ >> 12))]);
							if (i_5432_ != 0)
								is_5342_[i_5423_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5432_ & 0xff]);
							else
								i_5423_++;
							i_5424_ += anInt10956;
							i_5425_ += anInt10946;
						}
					}
					i_5421_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			} else {
				int i_5433_ = anInt10940;
				while (i_5433_ < 0) {
					int i_5434_ = i_5433_ + i_5341_;
					if (i_5434_ >= 0) {
						if (i_5434_ >= is.length)
							break;
						int i_5435_ = anInt10944;
						int i_5436_ = anInt10951 + anInt10953;
						int i_5437_ = anInt10952 + anInt10954;
						int i_5438_ = anInt10958;
						if (i_5436_ < 0) {
							int i_5439_ = (anInt10956 - 1 - i_5436_) / anInt10956;
							i_5438_ += i_5439_;
							i_5436_ += anInt10956 * i_5439_;
							i_5437_ += anInt10946 * i_5439_;
							i_5435_ += i_5439_;
						}
						int i_5440_;
						if ((i_5440_ = (1 + i_5436_ - (((Class161_Sub3_Sub1) this).anInt10945 << 12) - anInt10956) / anInt10956) > i_5438_)
							i_5438_ = i_5440_;
						if (i_5437_ < 0) {
							i_5440_ = (anInt10946 - 1 - i_5437_) / anInt10946;
							i_5438_ += i_5440_;
							i_5436_ += anInt10956 * i_5440_;
							i_5437_ += anInt10946 * i_5440_;
							i_5435_ += i_5440_;
						}
						if ((i_5440_ = (1 + i_5437_ - (((Class161_Sub3_Sub1) this).anInt10930 << 12) - anInt10946) / anInt10946) > i_5438_)
							i_5438_ = i_5440_;
						int i_5441_ = is[i_5434_] - i;
						int i_5442_ = -is_5340_[i_5434_];
						int i_5443_ = i_5441_ - (i_5435_ - anInt10944);
						if (i_5443_ > 0) {
							i_5435_ += i_5443_;
							i_5438_ += i_5443_;
							i_5436_ += anInt10956 * i_5443_;
							i_5437_ += anInt10946 * i_5443_;
						} else
							i_5442_ -= i_5443_;
						if (i_5438_ < i_5442_)
							i_5438_ = i_5442_;
						for (/**/; i_5438_ < 0; i_5438_++) {
							int i_5444_ = (((Class161_Sub3_Sub1) this).aByteArray11152[(((i_5437_ >> 12) * ((Class161_Sub3_Sub1) this).anInt10945) + (i_5436_ >> 12))]);
							if (i_5444_ != 0)
								is_5342_[i_5435_++] = (((Class161_Sub3_Sub1) this).anIntArray11151[i_5444_ & 0xff]);
							else
								i_5435_++;
							i_5436_ += anInt10956;
							i_5437_ += anInt10946;
						}
					}
					i_5433_++;
					anInt10951 += anInt10947;
					anInt10952 += anInt10950;
					anInt10944 += anInt10943;
				}
			}
		}
	}

	public void method2615(int i, int i_5445_, int i_5446_) {
		throw new IllegalStateException();
	}
}
