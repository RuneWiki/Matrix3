package game;

/* Class102_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class102_Sub5 extends Class102 {
	byte[][] aByteArrayArray10637;
	int[] anIntArray10638;
	int[] anIntArray10639;
	int[] anIntArray10640;
	int[] anIntArray10641;
	Class106_Sub2 aClass106_Sub2_10642;

	void method9937(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	Class102_Sub5(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub2[] class87_sub2s, int[] is, int[] is_11_) {
		super(class106_sub2, class284);
		((Class102_Sub5) this).aClass106_Sub2_10642 = class106_sub2;
		((Class102_Sub5) this).anIntArray10638 = is;
		((Class102_Sub5) this).anIntArray10640 = is_11_;
		((Class102_Sub5) this).aByteArrayArray10637 = new byte[class87_sub2s.length][];
		((Class102_Sub5) this).anIntArray10641 = new int[class87_sub2s.length];
		((Class102_Sub5) this).anIntArray10639 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			int[] is_12_ = class87_sub2s[i].method1285(false);
			byte[] is_13_ = (((Class102_Sub5) this).aByteArrayArray10637[i] = new byte[is_12_.length]);
			for (int i_14_ = 0; i_14_ < is_12_.length; i_14_++) {
				int i_15_ = is_12_[i_14_];
				byte i_16_ = (byte) ((i_15_ & 0xff) + (3 * (i_15_ >> 16 & 0xff) + (i_15_ >> 8 & 0xff) * 4) >> 3);
				is_13_[i_14_] = i_16_;
			}
			((Class102_Sub5) this).anIntArray10641[i] = class87_sub2s[i].method1288();
			((Class102_Sub5) this).anIntArray10639[i] = class87_sub2s[i].method1286();
		}
	}

	void method9938(byte[] is, int[] is_17_, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		int i_24_ = -(i_20_ >> 2);
		i_20_ = -(i_20_ & 0x3);
		for (int i_25_ = -i_21_; i_25_ < 0; i_25_++) {
			for (int i_26_ = i_24_; i_26_ < 0; i_26_++) {
				if (is[i_18_++] != 0)
					is_17_[i_19_++] = i;
				else
					i_19_++;
				if (is[i_18_++] != 0)
					is_17_[i_19_++] = i;
				else
					i_19_++;
				if (is[i_18_++] != 0)
					is_17_[i_19_++] = i;
				else
					i_19_++;
				if (is[i_18_++] != 0)
					is_17_[i_19_++] = i;
				else
					i_19_++;
			}
			for (int i_27_ = i_20_; i_27_ < 0; i_27_++) {
				if (is[i_18_++] != 0)
					is_17_[i_19_++] = i;
				else
					i_19_++;
			}
			i_19_ += i_22_;
			i_18_ += i_23_;
		}
	}

	void method9939(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		int i_35_ = -(i_31_ >> 2);
		i_31_ = -(i_31_ & 0x3);
		for (int i_36_ = -i_32_; i_36_ < 0; i_36_++) {
			for (int i_37_ = i_35_; i_37_ < 0; i_37_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			for (int i_38_ = i_31_; i_38_ < 0; i_38_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	void method9940(byte[] is, int[] is_39_, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
		int i_46_ = i >>> 24;
		int i_47_ = 255 - i_46_;
		for (int i_48_ = -i_43_; i_48_ < 0; i_48_++) {
			for (int i_49_ = -i_42_; i_49_ < 0; i_49_++) {
				if (is[i_40_++] != 0) {
					int i_50_ = ((((i & 0xff00) * i_46_ & 0xff0000) + ((i & 0xff00ff) * i_46_ & ~0xff00ff)) >> 8);
					int i_51_ = is_39_[i_41_];
					is_39_[i_41_++] = ((((i_51_ & 0xff00ff) * i_47_ & ~0xff00ff) + (i_47_ * (i_51_ & 0xff00) & 0xff0000)) >> 8) + i_50_;
				} else
					i_41_++;
			}
			i_41_ += i_44_;
			i_40_ += i_45_;
		}
	}

	Class102_Sub5(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub1[] class87_sub1s, int[] is, int[] is_52_) {
		super(class106_sub2, class284);
		((Class102_Sub5) this).aClass106_Sub2_10642 = class106_sub2;
		((Class102_Sub5) this).anIntArray10638 = is;
		((Class102_Sub5) this).anIntArray10640 = is_52_;
		((Class102_Sub5) this).aByteArrayArray10637 = new byte[class87_sub1s.length][];
		((Class102_Sub5) this).anIntArray10641 = new int[class87_sub1s.length];
		((Class102_Sub5) this).anIntArray10639 = new int[class87_sub1s.length];
		for (int i = 0; i < class87_sub1s.length; i++) {
			((Class102_Sub5) this).aByteArrayArray10637[i] = class87_sub1s[i].aByteArray9969;
			((Class102_Sub5) this).anIntArray10641[i] = class87_sub1s[i].anInt9970;
			((Class102_Sub5) this).anIntArray10639[i] = class87_sub1s[i].anInt9968;
		}
	}

	void method9941(byte[] is, int[] is_53_, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, Class167 class167, int i_63_, int i_64_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_65_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_66_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_67_ = i_61_;
		if (i_64_ > i_67_) {
			i_67_ = i_64_;
			i_55_ += (i_64_ - i_61_) * (-994907113 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217));
			i_54_ += i_62_ * (i_64_ - i_61_);
		}
		int i_68_ = (is_65_.length + i_64_ < i_61_ + i_57_ ? i_64_ + is_65_.length : i_61_ + i_57_);
		for (int i_69_ = i_67_; i_69_ < i_68_; i_69_++) {
			int i_70_ = is_65_[i_69_ - i_64_] + i_63_;
			int i_71_ = is_66_[i_69_ - i_64_];
			int i_72_ = i_56_;
			if (i_60_ > i_70_) {
				int i_73_ = i_60_ - i_70_;
				if (i_73_ >= i_71_) {
					i_54_ += i_59_ + i_56_;
					i_55_ += i_58_ + i_56_;
					continue;
				}
				i_71_ -= i_73_;
			} else {
				int i_74_ = i_70_ - i_60_;
				if (i_74_ >= i_56_) {
					i_54_ += i_56_ + i_59_;
					i_55_ += i_56_ + i_58_;
					continue;
				}
				i_54_ += i_74_;
				i_72_ -= i_74_;
				i_55_ += i_74_;
			}
			int i_75_ = 0;
			if (i_72_ < i_71_)
				i_71_ = i_72_;
			else
				i_75_ = i_72_ - i_71_;
			for (int i_76_ = 0; i_76_ < i_71_; i_76_++) {
				if (is[i_54_++] != 0)
					is_53_[i_55_++] = i;
				else
					i_55_++;
			}
			i_54_ += i_59_ + i_75_;
			i_55_ += i_58_ + i_75_;
		}
	}

	void method9942(byte[] is, int[] is_77_, int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, Class167 class167, int i_87_, int i_88_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_89_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_90_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_91_ = (i_84_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163);
		int i_92_ = i_85_;
		if (i_88_ > i_92_) {
			i_92_ = i_88_;
			i_79_ += (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10217 * -994907113 * (i_88_ - i_85_));
			i_78_ += (i_88_ - i_85_) * i_86_;
		}
		int i_93_ = (is_89_.length + i_88_ < i_85_ + i_81_ ? i_88_ + is_89_.length : i_81_ + i_85_);
		int i_94_ = i >>> 24;
		int i_95_ = 255 - i_94_;
		for (int i_96_ = i_92_; i_96_ < i_93_; i_96_++) {
			int i_97_ = i_87_ + is_89_[i_96_ - i_88_];
			int i_98_ = is_90_[i_96_ - i_88_];
			int i_99_ = i_80_;
			if (i_91_ > i_97_) {
				int i_100_ = i_91_ - i_97_;
				if (i_100_ >= i_98_) {
					i_78_ += i_83_ + i_80_;
					i_79_ += i_82_ + i_80_;
					continue;
				}
				i_98_ -= i_100_;
			} else {
				int i_101_ = i_97_ - i_91_;
				if (i_101_ >= i_80_) {
					i_78_ += i_83_ + i_80_;
					i_79_ += i_80_ + i_82_;
					continue;
				}
				i_78_ += i_101_;
				i_99_ -= i_101_;
				i_79_ += i_101_;
			}
			int i_102_ = 0;
			if (i_99_ < i_98_)
				i_98_ = i_99_;
			else
				i_102_ = i_99_ - i_98_;
			for (int i_103_ = -i_98_; i_103_ < 0; i_103_++) {
				if (is[i_78_++] != 0) {
					int i_104_ = (((i_94_ * (i & 0xff00) & 0xff0000) + (i_94_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_105_ = is_77_[i_79_];
					is_77_[i_79_++] = i_104_ + ((((i_105_ & 0xff00) * i_95_ & 0xff0000) + (i_95_ * (i_105_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_79_++;
			}
			i_78_ += i_102_ + i_83_;
			i_79_ += i_82_ + i_102_;
		}
	}

	void method1622(char c, int i, int i_106_, int i_107_, boolean bool) {
		if (null != (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218)) {
			i += ((Class102_Sub5) this).anIntArray10639[c];
			i_106_ += ((Class102_Sub5) this).anIntArray10641[c];
			int i_108_ = ((Class102_Sub5) this).anIntArray10638[c];
			int i_109_ = ((Class102_Sub5) this).anIntArray10640[c];
			int i_110_ = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217 * -994907113);
			int i_111_ = i + i_106_ * i_110_;
			int i_112_ = i_110_ - i_108_;
			int i_113_ = 0;
			int i_114_ = 0;
			if (i_106_ < (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 * 2029354259)) {
				int i_115_ = ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259 - i_106_);
				i_109_ -= i_115_;
				i_106_ = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 * 2029354259);
				i_114_ += i_108_ * i_115_;
				i_111_ += i_115_ * i_110_;
			}
			if (i_106_ + i_109_ > (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223) * 1704244235)
				i_109_ -= (i_106_ + i_109_ - 1704244235 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223);
			if (i < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220 * 1179466163)) {
				int i_116_ = ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163 - i);
				i_108_ -= i_116_;
				i = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220 * 1179466163);
				i_114_ += i_116_;
				i_111_ += i_116_;
				i_113_ += i_116_;
				i_112_ += i_116_;
			}
			if (i_108_ + i > 892939761 * (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221)) {
				int i_117_ = (i + i_108_ - 892939761 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221));
				i_108_ -= i_117_;
				i_113_ += i_117_;
				i_112_ += i_117_;
			}
			if (i_108_ > 0 && i_109_ > 0) {
				if ((i_107_ & ~0xffffff) == -16777216)
					method9939(((Class102_Sub5) this).aByteArrayArray10637[c], (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218), i_107_, i_114_, i_111_, i_108_, i_109_, i_112_, i_113_);
				else if (0 != (i_107_ & ~0xffffff))
					method9940(((Class102_Sub5) this).aByteArrayArray10637[c], (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218), i_107_, i_114_, i_111_, i_108_, i_109_, i_112_, i_113_);
			}
		}
	}

	void method9943(byte[] is, int[] is_118_, int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, Class167 class167, int i_128_, int i_129_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_130_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_131_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_132_ = (i_125_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163);
		int i_133_ = i_126_;
		if (i_129_ > i_133_) {
			i_133_ = i_129_;
			i_120_ += (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10217 * -994907113 * (i_129_ - i_126_));
			i_119_ += (i_129_ - i_126_) * i_127_;
		}
		int i_134_ = (is_130_.length + i_129_ < i_126_ + i_122_ ? i_129_ + is_130_.length : i_122_ + i_126_);
		int i_135_ = i >>> 24;
		int i_136_ = 255 - i_135_;
		for (int i_137_ = i_133_; i_137_ < i_134_; i_137_++) {
			int i_138_ = i_128_ + is_130_[i_137_ - i_129_];
			int i_139_ = is_131_[i_137_ - i_129_];
			int i_140_ = i_121_;
			if (i_132_ > i_138_) {
				int i_141_ = i_132_ - i_138_;
				if (i_141_ >= i_139_) {
					i_119_ += i_124_ + i_121_;
					i_120_ += i_123_ + i_121_;
					continue;
				}
				i_139_ -= i_141_;
			} else {
				int i_142_ = i_138_ - i_132_;
				if (i_142_ >= i_121_) {
					i_119_ += i_124_ + i_121_;
					i_120_ += i_121_ + i_123_;
					continue;
				}
				i_119_ += i_142_;
				i_140_ -= i_142_;
				i_120_ += i_142_;
			}
			int i_143_ = 0;
			if (i_140_ < i_139_)
				i_139_ = i_140_;
			else
				i_143_ = i_140_ - i_139_;
			for (int i_144_ = -i_139_; i_144_ < 0; i_144_++) {
				if (is[i_119_++] != 0) {
					int i_145_ = (((i_135_ * (i & 0xff00) & 0xff0000) + (i_135_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_146_ = is_118_[i_120_];
					is_118_[i_120_++] = i_145_ + ((((i_146_ & 0xff00) * i_136_ & 0xff0000) + (i_136_ * (i_146_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_120_++;
			}
			i_119_ += i_143_ + i_124_;
			i_120_ += i_123_ + i_143_;
		}
	}

	void method1624(char c, int i, int i_147_, int i_148_, boolean bool, Class167 class167, int i_149_, int i_150_) {
		if ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218) != null) {
			if (class167 == null)
				method1609(c, i, i_147_, i_148_, bool);
			else {
				i += ((Class102_Sub5) this).anIntArray10639[c];
				i_147_ += ((Class102_Sub5) this).anIntArray10641[c];
				int i_151_ = ((Class102_Sub5) this).anIntArray10638[c];
				int i_152_ = ((Class102_Sub5) this).anIntArray10640[c];
				int i_153_ = (-994907113 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217);
				int i_154_ = i_147_ * i_153_ + i;
				int i_155_ = i_153_ - i_151_;
				int i_156_ = 0;
				int i_157_ = 0;
				if (i_147_ < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259) {
					int i_158_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 - i_147_);
					i_152_ -= i_158_;
					i_147_ = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259;
					i_157_ += i_158_ * i_151_;
					i_154_ += i_158_ * i_153_;
				}
				if (i_152_ + i_147_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223))
					i_152_ -= (i_152_ + i_147_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10223) * 1704244235);
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220)) {
					int i_159_ = ((((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220) * 1179466163 - i);
					i_151_ -= i_159_;
					i = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220 * 1179466163);
					i_157_ += i_159_;
					i_154_ += i_159_;
					i_156_ += i_159_;
					i_155_ += i_159_;
				}
				if (i_151_ + i > (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221) * 892939761) {
					int i_160_ = (i + i_151_ - (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221) * 892939761);
					i_151_ -= i_160_;
					i_156_ += i_160_;
					i_155_ += i_160_;
				}
				if (i_151_ > 0 && i_152_ > 0) {
					if (-16777216 == (i_148_ & ~0xffffff))
						method9941((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_148_, i_157_, i_154_, i_151_, i_152_, i_155_, i_156_, i, i_147_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_149_, i_150_);
					else
						method9942((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_148_, i_157_, i_154_, i_151_, i_152_, i_155_, i_156_, i, i_147_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_149_, i_150_);
				}
			}
		}
	}

	void method9944(byte[] is, int[] is_161_, int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, Class167 class167, int i_171_, int i_172_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_173_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_174_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_175_ = (i_168_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163);
		int i_176_ = i_169_;
		if (i_172_ > i_176_) {
			i_176_ = i_172_;
			i_163_ += (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10217 * -994907113 * (i_172_ - i_169_));
			i_162_ += (i_172_ - i_169_) * i_170_;
		}
		int i_177_ = (is_173_.length + i_172_ < i_169_ + i_165_ ? i_172_ + is_173_.length : i_165_ + i_169_);
		int i_178_ = i >>> 24;
		int i_179_ = 255 - i_178_;
		for (int i_180_ = i_176_; i_180_ < i_177_; i_180_++) {
			int i_181_ = i_171_ + is_173_[i_180_ - i_172_];
			int i_182_ = is_174_[i_180_ - i_172_];
			int i_183_ = i_164_;
			if (i_175_ > i_181_) {
				int i_184_ = i_175_ - i_181_;
				if (i_184_ >= i_182_) {
					i_162_ += i_167_ + i_164_;
					i_163_ += i_166_ + i_164_;
					continue;
				}
				i_182_ -= i_184_;
			} else {
				int i_185_ = i_181_ - i_175_;
				if (i_185_ >= i_164_) {
					i_162_ += i_167_ + i_164_;
					i_163_ += i_164_ + i_166_;
					continue;
				}
				i_162_ += i_185_;
				i_183_ -= i_185_;
				i_163_ += i_185_;
			}
			int i_186_ = 0;
			if (i_183_ < i_182_)
				i_182_ = i_183_;
			else
				i_186_ = i_183_ - i_182_;
			for (int i_187_ = -i_182_; i_187_ < 0; i_187_++) {
				if (is[i_162_++] != 0) {
					int i_188_ = (((i_178_ * (i & 0xff00) & 0xff0000) + (i_178_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_189_ = is_161_[i_163_];
					is_161_[i_163_++] = i_188_ + ((((i_189_ & 0xff00) * i_179_ & 0xff0000) + (i_179_ * (i_189_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_163_++;
			}
			i_162_ += i_186_ + i_167_;
			i_163_ += i_166_ + i_186_;
		}
	}

	void method1623(char c, int i, int i_190_, int i_191_, boolean bool, Class167 class167, int i_192_, int i_193_) {
		if ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218) != null) {
			if (class167 == null)
				method1609(c, i, i_190_, i_191_, bool);
			else {
				i += ((Class102_Sub5) this).anIntArray10639[c];
				i_190_ += ((Class102_Sub5) this).anIntArray10641[c];
				int i_194_ = ((Class102_Sub5) this).anIntArray10638[c];
				int i_195_ = ((Class102_Sub5) this).anIntArray10640[c];
				int i_196_ = (-994907113 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217);
				int i_197_ = i_190_ * i_196_ + i;
				int i_198_ = i_196_ - i_194_;
				int i_199_ = 0;
				int i_200_ = 0;
				if (i_190_ < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259) {
					int i_201_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 - i_190_);
					i_195_ -= i_201_;
					i_190_ = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259;
					i_200_ += i_201_ * i_194_;
					i_197_ += i_201_ * i_196_;
				}
				if (i_195_ + i_190_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223))
					i_195_ -= (i_195_ + i_190_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10223) * 1704244235);
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220)) {
					int i_202_ = ((((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220) * 1179466163 - i);
					i_194_ -= i_202_;
					i = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220 * 1179466163);
					i_200_ += i_202_;
					i_197_ += i_202_;
					i_199_ += i_202_;
					i_198_ += i_202_;
				}
				if (i_194_ + i > (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221) * 892939761) {
					int i_203_ = (i + i_194_ - (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221) * 892939761);
					i_194_ -= i_203_;
					i_199_ += i_203_;
					i_198_ += i_203_;
				}
				if (i_194_ > 0 && i_195_ > 0) {
					if (-16777216 == (i_191_ & ~0xffffff))
						method9941((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_191_, i_200_, i_197_, i_194_, i_195_, i_198_, i_199_, i, i_190_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_192_, i_193_);
					else
						method9942((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_191_, i_200_, i_197_, i_194_, i_195_, i_198_, i_199_, i, i_190_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_192_, i_193_);
				}
			}
		}
	}

	void method1621(char c, int i, int i_204_, int i_205_, boolean bool, Class167 class167, int i_206_, int i_207_) {
		if ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218) != null) {
			if (class167 == null)
				method1609(c, i, i_204_, i_205_, bool);
			else {
				i += ((Class102_Sub5) this).anIntArray10639[c];
				i_204_ += ((Class102_Sub5) this).anIntArray10641[c];
				int i_208_ = ((Class102_Sub5) this).anIntArray10638[c];
				int i_209_ = ((Class102_Sub5) this).anIntArray10640[c];
				int i_210_ = (-994907113 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217);
				int i_211_ = i_204_ * i_210_ + i;
				int i_212_ = i_210_ - i_208_;
				int i_213_ = 0;
				int i_214_ = 0;
				if (i_204_ < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259) {
					int i_215_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 - i_204_);
					i_209_ -= i_215_;
					i_204_ = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259;
					i_214_ += i_215_ * i_208_;
					i_211_ += i_215_ * i_210_;
				}
				if (i_209_ + i_204_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223))
					i_209_ -= (i_209_ + i_204_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10223) * 1704244235);
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220)) {
					int i_216_ = ((((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220) * 1179466163 - i);
					i_208_ -= i_216_;
					i = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220 * 1179466163);
					i_214_ += i_216_;
					i_211_ += i_216_;
					i_213_ += i_216_;
					i_212_ += i_216_;
				}
				if (i_208_ + i > (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221) * 892939761) {
					int i_217_ = (i + i_208_ - (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221) * 892939761);
					i_208_ -= i_217_;
					i_213_ += i_217_;
					i_212_ += i_217_;
				}
				if (i_208_ > 0 && i_209_ > 0) {
					if (-16777216 == (i_205_ & ~0xffffff))
						method9941((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_205_, i_214_, i_211_, i_208_, i_209_, i_212_, i_213_, i, i_204_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_206_, i_207_);
					else
						method9942((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_205_, i_214_, i_211_, i_208_, i_209_, i_212_, i_213_, i, i_204_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_206_, i_207_);
				}
			}
		}
	}

	void method1625(char c, int i, int i_218_, int i_219_, boolean bool, Class167 class167, int i_220_, int i_221_) {
		if ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218) != null) {
			if (class167 == null)
				method1609(c, i, i_218_, i_219_, bool);
			else {
				i += ((Class102_Sub5) this).anIntArray10639[c];
				i_218_ += ((Class102_Sub5) this).anIntArray10641[c];
				int i_222_ = ((Class102_Sub5) this).anIntArray10638[c];
				int i_223_ = ((Class102_Sub5) this).anIntArray10640[c];
				int i_224_ = (-994907113 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217);
				int i_225_ = i_218_ * i_224_ + i;
				int i_226_ = i_224_ - i_222_;
				int i_227_ = 0;
				int i_228_ = 0;
				if (i_218_ < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259) {
					int i_229_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 - i_218_);
					i_223_ -= i_229_;
					i_218_ = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259;
					i_228_ += i_229_ * i_222_;
					i_225_ += i_229_ * i_224_;
				}
				if (i_223_ + i_218_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223))
					i_223_ -= (i_223_ + i_218_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10223) * 1704244235);
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220)) {
					int i_230_ = ((((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220) * 1179466163 - i);
					i_222_ -= i_230_;
					i = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10220 * 1179466163);
					i_228_ += i_230_;
					i_225_ += i_230_;
					i_227_ += i_230_;
					i_226_ += i_230_;
				}
				if (i_222_ + i > (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221) * 892939761) {
					int i_231_ = (i + i_222_ - (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221) * 892939761);
					i_222_ -= i_231_;
					i_227_ += i_231_;
					i_226_ += i_231_;
				}
				if (i_222_ > 0 && i_223_ > 0) {
					if (-16777216 == (i_219_ & ~0xffffff))
						method9941((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_219_, i_228_, i_225_, i_222_, i_223_, i_226_, i_227_, i, i_218_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_220_, i_221_);
					else
						method9942((((Class102_Sub5) this).aByteArrayArray10637[c]), (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anIntArray10218), i_219_, i_228_, i_225_, i_222_, i_223_, i_226_, i_227_, i, i_218_, ((Class102_Sub5) this).anIntArray10638[c], class167, i_220_, i_221_);
				}
			}
		}
	}

	void method1609(char c, int i, int i_232_, int i_233_, boolean bool) {
		if (null != (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218)) {
			i += ((Class102_Sub5) this).anIntArray10639[c];
			i_232_ += ((Class102_Sub5) this).anIntArray10641[c];
			int i_234_ = ((Class102_Sub5) this).anIntArray10638[c];
			int i_235_ = ((Class102_Sub5) this).anIntArray10640[c];
			int i_236_ = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10217 * -994907113);
			int i_237_ = i + i_232_ * i_236_;
			int i_238_ = i_236_ - i_234_;
			int i_239_ = 0;
			int i_240_ = 0;
			if (i_232_ < (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 * 2029354259)) {
				int i_241_ = ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10222) * 2029354259 - i_232_);
				i_235_ -= i_241_;
				i_232_ = (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10222 * 2029354259);
				i_240_ += i_234_ * i_241_;
				i_237_ += i_241_ * i_236_;
			}
			if (i_232_ + i_235_ > (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223) * 1704244235)
				i_235_ -= (i_232_ + i_235_ - 1704244235 * ((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10223);
			if (i < (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220 * 1179466163)) {
				int i_242_ = ((((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163 - i);
				i_234_ -= i_242_;
				i = (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220 * 1179466163);
				i_240_ += i_242_;
				i_237_ += i_242_;
				i_239_ += i_242_;
				i_238_ += i_242_;
			}
			if (i_234_ + i > 892939761 * (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10221)) {
				int i_243_ = (i + i_234_ - 892939761 * (((Class106_Sub2) (((Class102_Sub5) this).aClass106_Sub2_10642)).anInt10221));
				i_234_ -= i_243_;
				i_239_ += i_243_;
				i_238_ += i_243_;
			}
			if (i_234_ > 0 && i_235_ > 0) {
				if ((i_233_ & ~0xffffff) == -16777216)
					method9939(((Class102_Sub5) this).aByteArrayArray10637[c], (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218), i_233_, i_240_, i_237_, i_234_, i_235_, i_238_, i_239_);
				else if (0 != (i_233_ & ~0xffffff))
					method9940(((Class102_Sub5) this).aByteArrayArray10637[c], (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anIntArray10218), i_233_, i_240_, i_237_, i_234_, i_235_, i_238_, i_239_);
			}
		}
	}

	void method9945(byte[] is, int[] is_244_, int i, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, Class167 class167, int i_254_, int i_255_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_256_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_257_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_258_ = (i_251_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163);
		int i_259_ = i_252_;
		if (i_255_ > i_259_) {
			i_259_ = i_255_;
			i_246_ += (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10217 * -994907113 * (i_255_ - i_252_));
			i_245_ += (i_255_ - i_252_) * i_253_;
		}
		int i_260_ = (is_256_.length + i_255_ < i_252_ + i_248_ ? i_255_ + is_256_.length : i_248_ + i_252_);
		int i_261_ = i >>> 24;
		int i_262_ = 255 - i_261_;
		for (int i_263_ = i_259_; i_263_ < i_260_; i_263_++) {
			int i_264_ = i_254_ + is_256_[i_263_ - i_255_];
			int i_265_ = is_257_[i_263_ - i_255_];
			int i_266_ = i_247_;
			if (i_258_ > i_264_) {
				int i_267_ = i_258_ - i_264_;
				if (i_267_ >= i_265_) {
					i_245_ += i_250_ + i_247_;
					i_246_ += i_249_ + i_247_;
					continue;
				}
				i_265_ -= i_267_;
			} else {
				int i_268_ = i_264_ - i_258_;
				if (i_268_ >= i_247_) {
					i_245_ += i_250_ + i_247_;
					i_246_ += i_247_ + i_249_;
					continue;
				}
				i_245_ += i_268_;
				i_266_ -= i_268_;
				i_246_ += i_268_;
			}
			int i_269_ = 0;
			if (i_266_ < i_265_)
				i_265_ = i_266_;
			else
				i_269_ = i_266_ - i_265_;
			for (int i_270_ = -i_265_; i_270_ < 0; i_270_++) {
				if (is[i_245_++] != 0) {
					int i_271_ = (((i_261_ * (i & 0xff00) & 0xff0000) + (i_261_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_272_ = is_244_[i_246_];
					is_244_[i_246_++] = i_271_ + ((((i_272_ & 0xff00) * i_262_ & 0xff0000) + (i_262_ * (i_272_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_246_++;
			}
			i_245_ += i_269_ + i_250_;
			i_246_ += i_249_ + i_269_;
		}
	}

	void method9946(byte[] is, int[] is_273_, int i, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, Class167 class167, int i_283_, int i_284_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_285_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_286_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_287_ = (i_280_ - (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10220) * 1179466163);
		int i_288_ = i_281_;
		if (i_284_ > i_288_) {
			i_288_ = i_284_;
			i_275_ += (((Class106_Sub2) ((Class102_Sub5) this).aClass106_Sub2_10642).anInt10217 * -994907113 * (i_284_ - i_281_));
			i_274_ += (i_284_ - i_281_) * i_282_;
		}
		int i_289_ = (is_285_.length + i_284_ < i_281_ + i_277_ ? i_284_ + is_285_.length : i_277_ + i_281_);
		int i_290_ = i >>> 24;
		int i_291_ = 255 - i_290_;
		for (int i_292_ = i_288_; i_292_ < i_289_; i_292_++) {
			int i_293_ = i_283_ + is_285_[i_292_ - i_284_];
			int i_294_ = is_286_[i_292_ - i_284_];
			int i_295_ = i_276_;
			if (i_287_ > i_293_) {
				int i_296_ = i_287_ - i_293_;
				if (i_296_ >= i_294_) {
					i_274_ += i_279_ + i_276_;
					i_275_ += i_278_ + i_276_;
					continue;
				}
				i_294_ -= i_296_;
			} else {
				int i_297_ = i_293_ - i_287_;
				if (i_297_ >= i_276_) {
					i_274_ += i_279_ + i_276_;
					i_275_ += i_276_ + i_278_;
					continue;
				}
				i_274_ += i_297_;
				i_295_ -= i_297_;
				i_275_ += i_297_;
			}
			int i_298_ = 0;
			if (i_295_ < i_294_)
				i_294_ = i_295_;
			else
				i_298_ = i_295_ - i_294_;
			for (int i_299_ = -i_294_; i_299_ < 0; i_299_++) {
				if (is[i_274_++] != 0) {
					int i_300_ = (((i_290_ * (i & 0xff00) & 0xff0000) + (i_290_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_301_ = is_273_[i_275_];
					is_273_[i_275_++] = i_300_ + ((((i_301_ & 0xff00) * i_291_ & 0xff0000) + (i_291_ * (i_301_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_275_++;
			}
			i_274_ += i_298_ + i_279_;
			i_275_ += i_278_ + i_298_;
		}
	}

	public static void method9947(int i) {
		synchronized (Class278_Sub1.aclient9503) {
			if (Class554.aFrame6320 != null) {
				/* empty */
			} else {
				Container container = Class591_Sub5.method8786((byte) -34);
				if (null == container) {
					/* empty */
				} else {
					Class656.anInt8418 = container.getSize().width * -276769041;
					Class287.anInt3421 = container.getSize().height * 1011048041;
					if (Class18.aFrame142 == container) {
						Insets insets = Class18.aFrame142.getInsets();
						Class656.anInt8418 -= -276769041 * (insets.left + insets.right);
						Class287.anInt3421 -= (insets.top + insets.bottom) * 1011048041;
					}
					if (Class656.anInt8418 * -1987897329 <= 0)
						Class656.anInt8418 = -276769041;
					if (-257945127 * Class287.anInt3421 <= 0)
						Class287.anInt3421 = 1011048041;
					if (Class344_Sub2.method9253(-1691703763) != 1)
						Class359.method4441(351592046);
					else {
						Class269.anInt2861 = client.anInt8724 * 1590466979;
						client.anInt7748 = -1186583757 * ((-1987897329 * Class656.anInt8418 - client.anInt8724 * -507276561) / 2);
						client.anInt7739 = client.anInt8725 * 1464439409;
						client.anInt7760 = 0;
					}
					if (Class434.aClass434_5044 != Class151.aClass434_1702 && Class269.anInt2861 * 1960824389 < 1024 && -530390519 * client.anInt7739 >= 768) {
						/* empty */
					}
					client.aCanvas7745.setSize(1960824389 * Class269.anInt2861, client.anInt7739 * -530390519);
					if (Class272_Sub2.aClass106_9517 != null) {
						Class272_Sub2.aClass106_9517.method1689(client.aCanvas7745, 1960824389 * Class269.anInt2861, -530390519 * client.anInt7739, -1943345768);
						Class286.method3861(Class272_Sub2.aClass106_9517, Class69.method1067(-1848036638));
					}
					if (Class18.aFrame142 == container) {
						Insets insets = Class18.aFrame142.getInsets();
						client.aCanvas7745.setLocation(insets.left + 954583035 * client.anInt7748, insets.top + client.anInt7760 * 2077319943);
					} else
						client.aCanvas7745.setLocation((954583035 * client.anInt7748), (2077319943 * client.anInt7760));
					Class2.method476((byte) -35);
					if (-1 != -507155049 * client.anInt8790)
						Class288.method3884(true, (byte) -9);
					Class107.method2060(-621020031);
				}
			}
		}
	}

	static void method9948(Class572_Sub17 class572_sub17, int i) {
		Class24.aClass411_Sub1_158 = new Class411_Sub1(client.aClass5_8876);
		Class24.aClass411_Sub1_158.method5037(Class409.aClass409_4783, 1838537425);
		try {
			Class423_Sub2 class423_sub2 = ((Class423_Sub2) Class24.aClass411_Sub1_158.method4972(Class413.aClass413_4910, false, (byte) 9));
			Class658_Sub2 class658_sub2 = ((Class658_Sub2) Class24.aClass411_Sub1_158.method4971((Class416.aClass416_4933), false, 1126205348));
			class423_sub2.method9278(class572_sub17, (byte) 3);
			class658_sub2.method8940(new Class230(0.0F, 0.0F, 0.0F), (byte) 4);
			Class24.aClass411_Sub1_158.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), 283521674);
			Class24.aClass411_Sub1_158.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) -3749);
			Class24.aClass411_Sub1_158.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 58);
			Class24.aClass411_Sub1_158.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1346389518);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class24.anInt156 = Class26.aClass564_216.method6657((short) -4503) * -1827312049;
		Class24.anInt159 = Class26.aClass564_216.method6658((byte) -77) * 935463047;
		Class24.aBool157 = true;
	}

	static int method9949(Player class456_sub1_sub2_sub3_sub2, int i) {
		int i_302_ = class456_sub1_sub2_sub3_sub2.anInt11817 * -1492335633;
		Class538 class538 = class456_sub1_sub2_sub3_sub2.method10554((byte) -44);
		int i_303_ = class456_sub1_sub2_sub3_sub2.aClass663_Sub2_11631.method7795(-1478180242);
		if (i_303_ == -1 || class456_sub1_sub2_sub3_sub2.aClass663_Sub2_11631.aBool9556)
			i_302_ = 1637716933 * class456_sub1_sub2_sub3_sub2.anInt11830;
		else if (-182549727 * class538.anInt6026 == i_303_ || -1172829509 * class538.anInt6027 == i_303_ || i_303_ == class538.anInt6019 * -1871450263 || -1351448577 * class538.anInt6028 == i_303_)
			i_302_ = -2027496613 * class456_sub1_sub2_sub3_sub2.anInt11815;
		else if (i_303_ == class538.anInt6030 * -1506072601 || 1966431491 * class538.anInt6031 == i_303_ || i_303_ == class538.anInt6033 * 1541680687 || class538.anInt6032 * -500215193 == i_303_)
			i_302_ = class456_sub1_sub2_sub3_sub2.anInt11824 * 1993650939;
		return i_302_;
	}

	static void method9950(int interfaceId, int type, int index, int hash, byte i_307_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(4, (long) interfaceId);
		class572_sub12_sub11.method10338(1243056721);
		((GameTask) class572_sub12_sub11).p1 = type * 720886855;
		((GameTask) class572_sub12_sub11).p2 = 1921029481 * index;
		((GameTask) class572_sub12_sub11).p3 = 449498681 * hash;
	}
}
