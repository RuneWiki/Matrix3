package game;

/* Class102_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102_Sub4 extends Class102 {
	byte[][] aByteArrayArray10542;
	int[] anIntArray10543;
	int[] anIntArray10544;
	int[] anIntArray10545;
	Class106_Sub2 aClass106_Sub2_10546;
	int[] anIntArray10547;
	int[] anIntArray10548;

	void method9855(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
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

	void method9856(byte[] is, int[] is_11_, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, Class167 class167, int i_21_, int i_22_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_23_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_24_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_25_ = i_18_ - 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
		int i_26_ = i_19_;
		if (i_22_ > i_26_) {
			i_26_ = i_22_;
			i_13_ += (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113 * (i_22_ - i_19_));
			i_12_ += i_20_ * (i_22_ - i_19_);
		}
		int i_27_ = (i_22_ + is_23_.length < i_15_ + i_19_ ? i_22_ + is_23_.length : i_19_ + i_15_);
		for (int i_28_ = i_26_; i_28_ < i_27_; i_28_++) {
			int i_29_ = i_21_ + is_23_[i_28_ - i_22_];
			int i_30_ = is_24_[i_28_ - i_22_];
			int i_31_ = i_14_;
			if (i_25_ > i_29_) {
				int i_32_ = i_25_ - i_29_;
				if (i_32_ >= i_30_) {
					i_12_ += i_14_ + i_17_;
					i_13_ += i_16_ + i_14_;
					continue;
				}
				i_30_ -= i_32_;
			} else {
				int i_33_ = i_29_ - i_25_;
				if (i_33_ >= i_14_) {
					i_12_ += i_14_ + i_17_;
					i_13_ += i_14_ + i_16_;
					continue;
				}
				i_12_ += i_33_;
				i_31_ -= i_33_;
				i_13_ += i_33_;
			}
			int i_34_ = 0;
			if (i_31_ < i_30_)
				i_30_ = i_31_;
			else
				i_34_ = i_31_ - i_30_;
			for (int i_35_ = -i_30_; i_35_ < 0; i_35_++) {
				if (is[i_12_++] != 0)
					is_11_[i_13_++] = i;
				else
					i_13_++;
			}
			i_12_ += i_34_ + i_12_;
			i_13_ += i_34_ + i_16_;
		}
	}

	void method9857(byte[] is, int[] is_36_, int[] is_37_, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		int i_43_ = -(i_39_ >> 2);
		i_39_ = -(i_39_ & 0x3);
		boolean bool = false;
		for (int i_44_ = -i_40_; i_44_ < 0; i_44_++) {
			for (int i_45_ = i_43_; i_45_ < 0; i_45_++) {
				int i_46_;
				if ((i_46_ = is[i++]) != 0)
					is_36_[i_38_++] = is_37_[i_46_ & 0xff];
				else
					i_38_++;
				if ((i_46_ = is[i++]) != 0)
					is_36_[i_38_++] = is_37_[i_46_ & 0xff];
				else
					i_38_++;
				if ((i_46_ = is[i++]) != 0)
					is_36_[i_38_++] = is_37_[i_46_ & 0xff];
				else
					i_38_++;
				if ((i_46_ = is[i++]) != 0)
					is_36_[i_38_++] = is_37_[i_46_ & 0xff];
				else
					i_38_++;
			}
			for (int i_47_ = i_39_; i_47_ < 0; i_47_++) {
				int i_48_;
				if ((i_48_ = is[i++]) != 0)
					is_36_[i_38_++] = is_37_[i_48_ & 0xff];
				else
					i_38_++;
			}
			i_38_ += i_41_;
			i += i_42_;
		}
	}

	void method9858(byte[] is, int[] is_49_, int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		int i_56_ = -(i_52_ >> 2);
		i_52_ = -(i_52_ & 0x3);
		for (int i_57_ = -i_53_; i_57_ < 0; i_57_++) {
			for (int i_58_ = i_56_; i_58_ < 0; i_58_++) {
				if (is[i_50_++] != 0)
					is_49_[i_51_++] = i;
				else
					i_51_++;
				if (is[i_50_++] != 0)
					is_49_[i_51_++] = i;
				else
					i_51_++;
				if (is[i_50_++] != 0)
					is_49_[i_51_++] = i;
				else
					i_51_++;
				if (is[i_50_++] != 0)
					is_49_[i_51_++] = i;
				else
					i_51_++;
			}
			for (int i_59_ = i_52_; i_59_ < 0; i_59_++) {
				if (is[i_50_++] != 0)
					is_49_[i_51_++] = i;
				else
					i_51_++;
			}
			i_51_ += i_54_;
			i_50_ += i_55_;
		}
	}

	void method1621(char c, int i, int i_60_, int i_61_, boolean bool, Class167 class167, int i_62_, int i_63_) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			if (null == class167)
				method1609(c, i, i_60_, i_61_, bool);
			else {
				i += ((Class102_Sub4) this).anIntArray10548[c];
				i_60_ += ((Class102_Sub4) this).anIntArray10545[c];
				int i_64_ = ((Class102_Sub4) this).anIntArray10543[c];
				int i_65_ = ((Class102_Sub4) this).anIntArray10547[c];
				int i_66_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113);
				int i_67_ = i + i_66_ * i_60_;
				int i_68_ = i_66_ - i_64_;
				int i_69_ = 0;
				int i_70_ = 0;
				if (i_60_ < (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259) {
					int i_71_ = ((((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259 - i_60_);
					i_65_ -= i_71_;
					i_60_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259;
					i_70_ += i_71_ * i_64_;
					i_67_ += i_66_ * i_71_;
				}
				if (i_65_ + i_60_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223))
					i_65_ -= (i_65_ + i_60_ - (1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223)));
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220)) {
					int i_72_ = (1179466163 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220 - i);
					i_64_ -= i_72_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
					i_70_ += i_72_;
					i_67_ += i_72_;
					i_69_ += i_72_;
					i_68_ += i_72_;
				}
				if (i_64_ + i > 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221)) {
					int i_73_ = (i_64_ + i - 892939761 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221);
					i_64_ -= i_73_;
					i_69_ += i_73_;
					i_68_ += i_73_;
				}
				if (i_64_ > 0 && i_65_ > 0) {
					if (bool)
						method9860((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_62_, i_63_);
					else
						method9859((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_62_, i_63_);
				}
			}
		}
	}

	void method9859(byte[] is, int[] is_74_, int[] is_75_, int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, Class167 class167, int i_85_, int i_86_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_87_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_88_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_89_ = (i_82_ - (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10220) * 1179466163);
		int i_90_ = i_83_;
		if (i_86_ > i_90_) {
			i_90_ = i_86_;
			i_77_ += (i_86_ - i_83_) * (-994907113 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10217));
			i_76_ += i_84_ * (i_86_ - i_83_);
		}
		int i_91_ = (i_86_ + is_87_.length < i_79_ + i_83_ ? is_87_.length + i_86_ : i_79_ + i_83_);
		boolean bool = false;
		for (int i_92_ = i_90_; i_92_ < i_91_; i_92_++) {
			int i_93_ = i_85_ + is_87_[i_92_ - i_86_];
			int i_94_ = is_88_[i_92_ - i_86_];
			int i_95_ = i_78_;
			if (i_89_ > i_93_) {
				int i_96_ = i_89_ - i_93_;
				if (i_96_ >= i_94_) {
					i_76_ += i_81_ + i_78_;
					i_77_ += i_80_ + i_78_;
					continue;
				}
				i_94_ -= i_96_;
			} else {
				int i_97_ = i_93_ - i_89_;
				if (i_97_ >= i_78_) {
					i_76_ += i_81_ + i_78_;
					i_77_ += i_80_ + i_78_;
					continue;
				}
				i_76_ += i_97_;
				i_95_ -= i_97_;
				i_77_ += i_97_;
			}
			int i_98_ = 0;
			if (i_95_ < i_94_)
				i_94_ = i_95_;
			else
				i_98_ = i_95_ - i_94_;
			for (int i_99_ = -i_94_; i_99_ < 0; i_99_++) {
				int i_100_;
				if ((i_100_ = is[i_76_++]) != 0)
					is_74_[i_77_++] = is_75_[i_100_ & 0xff];
				else
					i_77_++;
			}
			i_76_ += i_98_ + i_81_;
			i_77_ += i_98_ + i_80_;
		}
	}

	void method9860(byte[] is, int[] is_101_, int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, Class167 class167, int i_111_, int i_112_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_113_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_114_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_115_ = i_108_ - 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
		int i_116_ = i_109_;
		if (i_112_ > i_116_) {
			i_116_ = i_112_;
			i_103_ += (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113 * (i_112_ - i_109_));
			i_102_ += i_110_ * (i_112_ - i_109_);
		}
		int i_117_ = (i_112_ + is_113_.length < i_105_ + i_109_ ? i_112_ + is_113_.length : i_109_ + i_105_);
		for (int i_118_ = i_116_; i_118_ < i_117_; i_118_++) {
			int i_119_ = i_111_ + is_113_[i_118_ - i_112_];
			int i_120_ = is_114_[i_118_ - i_112_];
			int i_121_ = i_104_;
			if (i_115_ > i_119_) {
				int i_122_ = i_115_ - i_119_;
				if (i_122_ >= i_120_) {
					i_102_ += i_104_ + i_107_;
					i_103_ += i_106_ + i_104_;
					continue;
				}
				i_120_ -= i_122_;
			} else {
				int i_123_ = i_119_ - i_115_;
				if (i_123_ >= i_104_) {
					i_102_ += i_104_ + i_107_;
					i_103_ += i_104_ + i_106_;
					continue;
				}
				i_102_ += i_123_;
				i_121_ -= i_123_;
				i_103_ += i_123_;
			}
			int i_124_ = 0;
			if (i_121_ < i_120_)
				i_120_ = i_121_;
			else
				i_124_ = i_121_ - i_120_;
			for (int i_125_ = -i_120_; i_125_ < 0; i_125_++) {
				if (is[i_102_++] != 0)
					is_101_[i_103_++] = i;
				else
					i_103_++;
			}
			i_102_ += i_124_ + i_102_;
			i_103_ += i_124_ + i_106_;
		}
	}

	void method1622(char c, int i, int i_126_, int i_127_, boolean bool) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			i += ((Class102_Sub4) this).anIntArray10548[c];
			i_126_ += ((Class102_Sub4) this).anIntArray10545[c];
			int i_128_ = ((Class102_Sub4) this).anIntArray10543[c];
			int i_129_ = ((Class102_Sub4) this).anIntArray10547[c];
			int i_130_ = (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10217 * -994907113);
			int i_131_ = i_126_ * i_130_ + i;
			int i_132_ = i_130_ - i_128_;
			int i_133_ = 0;
			int i_134_ = 0;
			if (i_126_ < (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222 * 2029354259)) {
				int i_135_ = ((((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259 - i_126_);
				i_129_ -= i_135_;
				i_126_ = (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222 * 2029354259);
				i_134_ += i_135_ * i_128_;
				i_131_ += i_130_ * i_135_;
			}
			if (i_129_ + i_126_ > (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223) * 1704244235)
				i_129_ -= (i_126_ + i_129_ - 1704244235 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223);
			if (i < 1179466163 * (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10220)) {
				int i_136_ = (1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220) - i);
				i_128_ -= i_136_;
				i = 1179466163 * (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10220);
				i_134_ += i_136_;
				i_131_ += i_136_;
				i_133_ += i_136_;
				i_132_ += i_136_;
			}
			if (i + i_128_ > (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10221) * 892939761) {
				int i_137_ = (i_128_ + i - 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221));
				i_128_ -= i_137_;
				i_133_ += i_137_;
				i_132_ += i_137_;
			}
			if (i_128_ > 0 && i_129_ > 0) {
				if (bool)
					method9858(((Class102_Sub4) this).aByteArrayArray10542[c], (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218), i_127_, i_134_, i_131_, i_128_, i_129_, i_132_, i_133_);
				else
					method9857(((Class102_Sub4) this).aByteArrayArray10542[c], (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_134_, i_131_, i_128_, i_129_, i_132_, i_133_);
			}
		}
	}

	void method1623(char c, int i, int i_138_, int i_139_, boolean bool, Class167 class167, int i_140_, int i_141_) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			if (null == class167)
				method1609(c, i, i_138_, i_139_, bool);
			else {
				i += ((Class102_Sub4) this).anIntArray10548[c];
				i_138_ += ((Class102_Sub4) this).anIntArray10545[c];
				int i_142_ = ((Class102_Sub4) this).anIntArray10543[c];
				int i_143_ = ((Class102_Sub4) this).anIntArray10547[c];
				int i_144_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113);
				int i_145_ = i + i_144_ * i_138_;
				int i_146_ = i_144_ - i_142_;
				int i_147_ = 0;
				int i_148_ = 0;
				if (i_138_ < (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259) {
					int i_149_ = ((((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222) * 2029354259 - i_138_);
					i_143_ -= i_149_;
					i_138_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259;
					i_148_ += i_149_ * i_142_;
					i_145_ += i_144_ * i_149_;
				}
				if (i_143_ + i_138_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223))
					i_143_ -= (i_143_ + i_138_ - (1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223)));
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220)) {
					int i_150_ = (1179466163 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220 - i);
					i_142_ -= i_150_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
					i_148_ += i_150_;
					i_145_ += i_150_;
					i_147_ += i_150_;
					i_146_ += i_150_;
				}
				if (i_142_ + i > 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221)) {
					int i_151_ = (i_142_ + i - 892939761 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221);
					i_142_ -= i_151_;
					i_147_ += i_151_;
					i_146_ += i_151_;
				}
				if (i_142_ > 0 && i_143_ > 0) {
					if (bool)
						method9860((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), i_139_, i_148_, i_145_, i_142_, i_143_, i_146_, i_147_, i, i_138_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_140_, i_141_);
					else
						method9859((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_139_, i_148_, i_145_, i_142_, i_143_, i_146_, i_147_, i, i_138_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_140_, i_141_);
				}
			}
		}
	}

	void method1625(char c, int i, int i_152_, int i_153_, boolean bool, Class167 class167, int i_154_, int i_155_) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			if (null == class167)
				method1609(c, i, i_152_, i_153_, bool);
			else {
				i += ((Class102_Sub4) this).anIntArray10548[c];
				i_152_ += ((Class102_Sub4) this).anIntArray10545[c];
				int i_156_ = ((Class102_Sub4) this).anIntArray10543[c];
				int i_157_ = ((Class102_Sub4) this).anIntArray10547[c];
				int i_158_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113);
				int i_159_ = i + i_158_ * i_152_;
				int i_160_ = i_158_ - i_156_;
				int i_161_ = 0;
				int i_162_ = 0;
				if (i_152_ < (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259) {
					int i_163_ = ((((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222) * 2029354259 - i_152_);
					i_157_ -= i_163_;
					i_152_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259;
					i_162_ += i_163_ * i_156_;
					i_159_ += i_158_ * i_163_;
				}
				if (i_157_ + i_152_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223))
					i_157_ -= (i_157_ + i_152_ - (1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223)));
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220)) {
					int i_164_ = (1179466163 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220 - i);
					i_156_ -= i_164_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
					i_162_ += i_164_;
					i_159_ += i_164_;
					i_161_ += i_164_;
					i_160_ += i_164_;
				}
				if (i_156_ + i > 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221)) {
					int i_165_ = (i_156_ + i - 892939761 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221);
					i_156_ -= i_165_;
					i_161_ += i_165_;
					i_160_ += i_165_;
				}
				if (i_156_ > 0 && i_157_ > 0) {
					if (bool)
						method9860((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), i_153_, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_, i, i_152_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_154_, i_155_);
					else
						method9859((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_153_, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_, i, i_152_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_154_, i_155_);
				}
			}
		}
	}

	void method9861(byte[] is, int[] is_166_, int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, Class167 class167, int i_176_, int i_177_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_178_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_179_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_180_ = i_173_ - 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
		int i_181_ = i_174_;
		if (i_177_ > i_181_) {
			i_181_ = i_177_;
			i_168_ += (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113 * (i_177_ - i_174_));
			i_167_ += i_175_ * (i_177_ - i_174_);
		}
		int i_182_ = (i_177_ + is_178_.length < i_170_ + i_174_ ? i_177_ + is_178_.length : i_174_ + i_170_);
		for (int i_183_ = i_181_; i_183_ < i_182_; i_183_++) {
			int i_184_ = i_176_ + is_178_[i_183_ - i_177_];
			int i_185_ = is_179_[i_183_ - i_177_];
			int i_186_ = i_169_;
			if (i_180_ > i_184_) {
				int i_187_ = i_180_ - i_184_;
				if (i_187_ >= i_185_) {
					i_167_ += i_169_ + i_172_;
					i_168_ += i_171_ + i_169_;
					continue;
				}
				i_185_ -= i_187_;
			} else {
				int i_188_ = i_184_ - i_180_;
				if (i_188_ >= i_169_) {
					i_167_ += i_169_ + i_172_;
					i_168_ += i_169_ + i_171_;
					continue;
				}
				i_167_ += i_188_;
				i_186_ -= i_188_;
				i_168_ += i_188_;
			}
			int i_189_ = 0;
			if (i_186_ < i_185_)
				i_185_ = i_186_;
			else
				i_189_ = i_186_ - i_185_;
			for (int i_190_ = -i_185_; i_190_ < 0; i_190_++) {
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
			}
			i_167_ += i_189_ + i_167_;
			i_168_ += i_189_ + i_171_;
		}
	}

	void method9862(byte[] is, int[] is_191_, int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_) {
		int i_198_ = -(i_194_ >> 2);
		i_194_ = -(i_194_ & 0x3);
		for (int i_199_ = -i_195_; i_199_ < 0; i_199_++) {
			for (int i_200_ = i_198_; i_200_ < 0; i_200_++) {
				if (is[i_192_++] != 0)
					is_191_[i_193_++] = i;
				else
					i_193_++;
				if (is[i_192_++] != 0)
					is_191_[i_193_++] = i;
				else
					i_193_++;
				if (is[i_192_++] != 0)
					is_191_[i_193_++] = i;
				else
					i_193_++;
				if (is[i_192_++] != 0)
					is_191_[i_193_++] = i;
				else
					i_193_++;
			}
			for (int i_201_ = i_194_; i_201_ < 0; i_201_++) {
				if (is[i_192_++] != 0)
					is_191_[i_193_++] = i;
				else
					i_193_++;
			}
			i_193_ += i_196_;
			i_192_ += i_197_;
		}
	}

	void method1609(char c, int i, int i_202_, int i_203_, boolean bool) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			i += ((Class102_Sub4) this).anIntArray10548[c];
			i_202_ += ((Class102_Sub4) this).anIntArray10545[c];
			int i_204_ = ((Class102_Sub4) this).anIntArray10543[c];
			int i_205_ = ((Class102_Sub4) this).anIntArray10547[c];
			int i_206_ = (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10217 * -994907113);
			int i_207_ = i_202_ * i_206_ + i;
			int i_208_ = i_206_ - i_204_;
			int i_209_ = 0;
			int i_210_ = 0;
			if (i_202_ < (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222 * 2029354259)) {
				int i_211_ = ((((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259 - i_202_);
				i_205_ -= i_211_;
				i_202_ = (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222 * 2029354259);
				i_210_ += i_211_ * i_204_;
				i_207_ += i_206_ * i_211_;
			}
			if (i_205_ + i_202_ > (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223) * 1704244235)
				i_205_ -= (i_202_ + i_205_ - 1704244235 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223);
			if (i < 1179466163 * (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10220)) {
				int i_212_ = (1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220) - i);
				i_204_ -= i_212_;
				i = 1179466163 * (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10220);
				i_210_ += i_212_;
				i_207_ += i_212_;
				i_209_ += i_212_;
				i_208_ += i_212_;
			}
			if (i + i_204_ > (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10221) * 892939761) {
				int i_213_ = (i_204_ + i - 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221));
				i_204_ -= i_213_;
				i_209_ += i_213_;
				i_208_ += i_213_;
			}
			if (i_204_ > 0 && i_205_ > 0) {
				if (bool)
					method9858(((Class102_Sub4) this).aByteArrayArray10542[c], (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218), i_203_, i_210_, i_207_, i_204_, i_205_, i_208_, i_209_);
				else
					method9857(((Class102_Sub4) this).aByteArrayArray10542[c], (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_210_, i_207_, i_204_, i_205_, i_208_, i_209_);
			}
		}
	}

	void method1624(char c, int i, int i_214_, int i_215_, boolean bool, Class167 class167, int i_216_, int i_217_) {
		if (null != (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anIntArray10218)) {
			if (null == class167)
				method1609(c, i, i_214_, i_215_, bool);
			else {
				i += ((Class102_Sub4) this).anIntArray10548[c];
				i_214_ += ((Class102_Sub4) this).anIntArray10545[c];
				int i_218_ = ((Class102_Sub4) this).anIntArray10543[c];
				int i_219_ = ((Class102_Sub4) this).anIntArray10547[c];
				int i_220_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113);
				int i_221_ = i + i_220_ * i_214_;
				int i_222_ = i_220_ - i_218_;
				int i_223_ = 0;
				int i_224_ = 0;
				if (i_214_ < (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259) {
					int i_225_ = ((((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10222) * 2029354259 - i_214_);
					i_219_ -= i_225_;
					i_214_ = (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10222) * 2029354259;
					i_224_ += i_225_ * i_218_;
					i_221_ += i_220_ * i_225_;
				}
				if (i_219_ + i_214_ > 1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223))
					i_219_ -= (i_219_ + i_214_ - (1704244235 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10223)));
				if (i < 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220)) {
					int i_226_ = (1179466163 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220 - i);
					i_218_ -= i_226_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
					i_224_ += i_226_;
					i_221_ += i_226_;
					i_223_ += i_226_;
					i_222_ += i_226_;
				}
				if (i_218_ + i > 892939761 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221)) {
					int i_227_ = (i_218_ + i - 892939761 * ((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10221);
					i_218_ -= i_227_;
					i_223_ += i_227_;
					i_222_ += i_227_;
				}
				if (i_218_ > 0 && i_219_ > 0) {
					if (bool)
						method9860((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), i_215_, i_224_, i_221_, i_218_, i_219_, i_222_, i_223_, i, i_214_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_216_, i_217_);
					else
						method9859((((Class102_Sub4) this).aByteArrayArray10542[c]), (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anIntArray10218), ((Class102_Sub4) this).anIntArray10544, i_215_, i_224_, i_221_, i_218_, i_219_, i_222_, i_223_, i, i_214_, ((Class102_Sub4) this).anIntArray10543[c], class167, i_216_, i_217_);
				}
			}
		}
	}

	void method9863(byte[] is, int[] is_228_, int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, Class167 class167, int i_238_, int i_239_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_240_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_241_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_242_ = i_235_ - 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
		int i_243_ = i_236_;
		if (i_239_ > i_243_) {
			i_243_ = i_239_;
			i_230_ += (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113 * (i_239_ - i_236_));
			i_229_ += i_237_ * (i_239_ - i_236_);
		}
		int i_244_ = (i_239_ + is_240_.length < i_232_ + i_236_ ? i_239_ + is_240_.length : i_236_ + i_232_);
		for (int i_245_ = i_243_; i_245_ < i_244_; i_245_++) {
			int i_246_ = i_238_ + is_240_[i_245_ - i_239_];
			int i_247_ = is_241_[i_245_ - i_239_];
			int i_248_ = i_231_;
			if (i_242_ > i_246_) {
				int i_249_ = i_242_ - i_246_;
				if (i_249_ >= i_247_) {
					i_229_ += i_231_ + i_234_;
					i_230_ += i_233_ + i_231_;
					continue;
				}
				i_247_ -= i_249_;
			} else {
				int i_250_ = i_246_ - i_242_;
				if (i_250_ >= i_231_) {
					i_229_ += i_231_ + i_234_;
					i_230_ += i_231_ + i_233_;
					continue;
				}
				i_229_ += i_250_;
				i_248_ -= i_250_;
				i_230_ += i_250_;
			}
			int i_251_ = 0;
			if (i_248_ < i_247_)
				i_247_ = i_248_;
			else
				i_251_ = i_248_ - i_247_;
			for (int i_252_ = -i_247_; i_252_ < 0; i_252_++) {
				if (is[i_229_++] != 0)
					is_228_[i_230_++] = i;
				else
					i_230_++;
			}
			i_229_ += i_251_ + i_229_;
			i_230_ += i_251_ + i_233_;
		}
	}

	Class102_Sub4(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub1[] class87_sub1s, int[] is, int[] is_253_) {
		super(class106_sub2, class284);
		((Class102_Sub4) this).aClass106_Sub2_10546 = class106_sub2;
		((Class102_Sub4) this).aClass106_Sub2_10546 = class106_sub2;
		((Class102_Sub4) this).anIntArray10543 = is;
		((Class102_Sub4) this).anIntArray10547 = is_253_;
		((Class102_Sub4) this).aByteArrayArray10542 = new byte[class87_sub1s.length][];
		((Class102_Sub4) this).anIntArray10545 = new int[class87_sub1s.length];
		((Class102_Sub4) this).anIntArray10548 = new int[class87_sub1s.length];
		for (int i = 0; i < class87_sub1s.length; i++) {
			((Class102_Sub4) this).aByteArrayArray10542[i] = class87_sub1s[i].aByteArray9969;
			((Class102_Sub4) this).anIntArray10545[i] = class87_sub1s[i].anInt9970;
			((Class102_Sub4) this).anIntArray10548[i] = class87_sub1s[i].anInt9968;
		}
		((Class102_Sub4) this).anIntArray10544 = class87_sub1s[0].anIntArray9967;
	}

	void method9864(byte[] is, int[] is_254_, int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, Class167 class167, int i_264_, int i_265_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_266_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_267_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_268_ = i_261_ - 1179466163 * (((Class106_Sub2) (((Class102_Sub4) this).aClass106_Sub2_10546)).anInt10220);
		int i_269_ = i_262_;
		if (i_265_ > i_269_) {
			i_269_ = i_265_;
			i_256_ += (((Class106_Sub2) ((Class102_Sub4) this).aClass106_Sub2_10546).anInt10217 * -994907113 * (i_265_ - i_262_));
			i_255_ += i_263_ * (i_265_ - i_262_);
		}
		int i_270_ = (i_265_ + is_266_.length < i_258_ + i_262_ ? i_265_ + is_266_.length : i_262_ + i_258_);
		for (int i_271_ = i_269_; i_271_ < i_270_; i_271_++) {
			int i_272_ = i_264_ + is_266_[i_271_ - i_265_];
			int i_273_ = is_267_[i_271_ - i_265_];
			int i_274_ = i_257_;
			if (i_268_ > i_272_) {
				int i_275_ = i_268_ - i_272_;
				if (i_275_ >= i_273_) {
					i_255_ += i_257_ + i_260_;
					i_256_ += i_259_ + i_257_;
					continue;
				}
				i_273_ -= i_275_;
			} else {
				int i_276_ = i_272_ - i_268_;
				if (i_276_ >= i_257_) {
					i_255_ += i_257_ + i_260_;
					i_256_ += i_257_ + i_259_;
					continue;
				}
				i_255_ += i_276_;
				i_274_ -= i_276_;
				i_256_ += i_276_;
			}
			int i_277_ = 0;
			if (i_274_ < i_273_)
				i_273_ = i_274_;
			else
				i_277_ = i_274_ - i_273_;
			for (int i_278_ = -i_273_; i_278_ < 0; i_278_++) {
				if (is[i_255_++] != 0)
					is_254_[i_256_++] = i;
				else
					i_256_++;
			}
			i_255_ += i_277_ + i_255_;
			i_256_ += i_277_ + i_259_;
		}
	}

	static final void method9865(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub26_9240, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 2029456555);
		Class623.method7443(-1443826517);
	}

	public static String method9866(int i) {
		return Class565.method6700("www", false, -940590883);
	}

	static Class63[] method9867(byte i) {
		return new Class63[] { Class63.aClass63_606, Class63.aClass63_548, Class63.aClass63_549, Class63.aClass63_607, Class63.aClass63_643, Class63.aClass63_560, Class63.aClass63_553,
			Class63.aClass63_551, Class63.aClass63_555, Class63.aClass63_556, Class63.aClass63_564, Class63.aClass63_558, Class63.aClass63_559, Class63.aClass63_610, Class63.aClass63_565,
			Class63.aClass63_562, Class63.aClass63_563, Class63.aClass63_597, Class63.aClass63_547, Class63.aClass63_652, Class63.aClass63_567, Class63.aClass63_568, Class63.aClass63_584,
			Class63.aClass63_570, Class63.aClass63_571, Class63.aClass63_572, Class63.aClass63_573, Class63.aClass63_574, Class63.aClass63_575, Class63.aClass63_576, Class63.aClass63_577,
			Class63.aClass63_578, Class63.aClass63_554, Class63.aClass63_658, Class63.aClass63_581, Class63.aClass63_582, Class63.aClass63_668, Class63.aClass63_601, Class63.aClass63_585,
			Class63.aClass63_586, Class63.aClass63_587, Class63.aClass63_613, Class63.aClass63_603, Class63.aClass63_590, Class63.aClass63_591, Class63.aClass63_592, Class63.aClass63_593,
			Class63.aClass63_594, Class63.aClass63_595, Class63.aClass63_596, Class63.aClass63_660, Class63.aClass63_598, Class63.aClass63_552, Class63.aClass63_600, Class63.aClass63_605,
			Class63.aClass63_602, Class63.aClass63_631, Class63.aClass63_566, Class63.aClass63_654, Class63.aClass63_649, Class63.aClass63_664, Class63.aClass63_608, Class63.aClass63_609,
			Class63.aClass63_583, Class63.aClass63_611, Class63.aClass63_612, Class63.aClass63_569, Class63.aClass63_614, Class63.aClass63_615, Class63.aClass63_616, Class63.aClass63_617,
			Class63.aClass63_618, Class63.aClass63_579, Class63.aClass63_620, Class63.aClass63_621, Class63.aClass63_622, Class63.aClass63_623, Class63.aClass63_624, Class63.aClass63_625,
			Class63.aClass63_667, Class63.aClass63_619, Class63.aClass63_628, Class63.aClass63_629, Class63.aClass63_580, Class63.aClass63_645, Class63.aClass63_632, Class63.aClass63_633,
			Class63.aClass63_634, Class63.aClass63_635, Class63.aClass63_636, Class63.aClass63_637, Class63.aClass63_638, Class63.aClass63_639, Class63.aClass63_640, Class63.aClass63_604,
			Class63.aClass63_642, Class63.aClass63_630, Class63.aClass63_644, Class63.aClass63_661, Class63.aClass63_646, Class63.aClass63_647, Class63.aClass63_648, Class63.aClass63_557,
			Class63.aClass63_650, Class63.aClass63_651, Class63.aClass63_550, Class63.aClass63_653, Class63.aClass63_627, Class63.aClass63_655, Class63.aClass63_588, Class63.aClass63_657,
			Class63.aClass63_626, Class63.aClass63_659, Class63.aClass63_589, Class63.aClass63_641, Class63.aClass63_662, Class63.aClass63_663, Class63.aClass63_599, Class63.aClass63_665,
			Class63.aClass63_666, Class63.aClass63_561, Class63.aClass63_656, Class63.aClass63_669, Class63.aClass63_670, Class63.aClass63_671 };
	}
}
