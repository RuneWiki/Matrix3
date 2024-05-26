package game;

/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class180 {
	byte[] aByteArray2116;
	Class174_Sub3 aClass174_Sub3_2117;
	int anInt2118;
	int anInt2119;
	Class157[][] aClass157ArrayArray2120;
	Class106_Sub1 aClass106_Sub1_2121;
	int anInt2122;
	int anInt2123;
	int anInt2124;

	void method2782(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool) {
		((Class180) this).aClass106_Sub1_2121.method9429(false);
		((Class180) this).aClass106_Sub1_2121.method9432(false);
		((Class180) this).aClass106_Sub1_2121.method9389(-2);
		((Class180) this).aClass106_Sub1_2121.method9454(1);
		((Class180) this).aClass106_Sub1_2121.method9456(1);
		float f = 1.0F / (float) ((((Class106_Sub1) ((Class180) this).aClass106_Sub1_2121).anInt10060) * 128);
		if (bool) {
			for (int i_2_ = 0; i_2_ < ((Class180) this).anInt2122; i_2_++) {
				int i_3_ = i_2_ << ((Class180) this).anInt2123;
				int i_4_ = i_2_ + 1 << ((Class180) this).anInt2123;
				for (int i_5_ = 0; i_5_ < ((Class180) this).anInt2124; i_5_++) {
					int i_6_ = i_5_ << ((Class180) this).anInt2123;
					int i_7_ = i_5_ + 1 << ((Class180) this).anInt2123;
					while_64_: for (int i_8_ = i_6_; i_8_ < i_7_; i_8_++) {
						if (i_8_ - i >= -i_1_ && i_8_ - i <= i_1_) {
							for (int i_9_ = i_3_; i_9_ < i_4_; i_9_++) {
								if (i_9_ - i_0_ >= -i_1_ && i_9_ - i_0_ <= i_1_ && (bools[i_8_ - i + i_1_][i_9_ - i_0_ + i_1_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_5_ / f, (float) -i_2_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class180) this).aClass157ArrayArray2120[i_5_][i_2_].method2545();
									break while_64_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_10_ = 0; i_10_ < ((Class180) this).anInt2122; i_10_++) {
				int i_11_ = i_10_ << ((Class180) this).anInt2123;
				int i_12_ = i_10_ + 1 << ((Class180) this).anInt2123;
				for (int i_13_ = 0; i_13_ < ((Class180) this).anInt2124; i_13_++) {
					int i_14_ = 0;
					int i_15_ = i_13_ << ((Class180) this).anInt2123;
					int i_16_ = i_13_ + 1 << ((Class180) this).anInt2123;
					Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((Class180) this).aClass106_Sub1_2121).aClass572_Sub15_Sub1_10158);
					class572_sub15_sub1.o = 0;
					for (int i_17_ = i_11_; i_17_ < i_12_; i_17_++) {
						if (i_17_ - i_0_ >= -i_1_ && i_17_ - i_0_ <= i_1_) {
							int i_18_ = (i_17_ * ((((Class180) this).aClass174_Sub3_2117.anInt2086) * -1715487093) + i_15_);
							for (int i_19_ = i_15_; i_19_ < i_16_; i_19_++) {
								if (i_19_ - i >= -i_1_ && i_19_ - i <= i_1_ && (bools[i_19_ - i + i_1_][i_17_ - i_0_ + i_1_])) {
									short[] is = (((Class174_Sub3) (((Class180) this).aClass174_Sub3_2117)).aShortArrayArray10882[i_18_]);
									if (is != null) {
										if (((Class106_Sub1) (((Class180) this).aClass106_Sub1_2121)).aBool10153) {
											for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
												class572_sub15_sub1.writeShort(is[i_20_] & 0xffff, -1960709226);
												i_14_++;
											}
										} else {
											for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
												class572_sub15_sub1.method8453(is[i_21_] & 0xffff, 1619032911);
												i_14_++;
											}
										}
									}
								}
								i_18_++;
							}
						}
					}
					if (i_14_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_13_ / f, (float) -i_10_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class180) this).aClass157ArrayArray2120[i_13_][i_10_].method2547(class572_sub15_sub1.b, i_14_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2783(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_22_) {
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		i += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11733) + 1;
		i_22_ += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11735) + 1;
		int i_23_ = i + i_22_ * ((Class180) this).anInt2118;
		int i_24_ = 0;
		int i_25_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11730);
		int i_26_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11731);
		int i_27_ = ((Class180) this).anInt2118 - i_26_;
		int i_28_ = 0;
		if (i_22_ <= 0) {
			int i_29_ = 1 - i_22_;
			i_25_ -= i_29_;
			i_24_ += i_29_ * i_26_;
			i_23_ += i_29_ * ((Class180) this).anInt2118;
			i_22_ = 1;
		}
		if (i_22_ + i_25_ >= ((Class180) this).anInt2119) {
			int i_30_ = i_22_ + i_25_ + 1 - ((Class180) this).anInt2119;
			i_25_ -= i_30_;
		}
		if (i <= 0) {
			int i_31_ = 1 - i;
			i_26_ -= i_31_;
			i_24_ += i_31_;
			i_23_ += i_31_;
			i_28_ += i_31_;
			i_27_ += i_31_;
			i = 1;
		}
		if (i + i_26_ >= ((Class180) this).anInt2118) {
			int i_32_ = i + i_26_ + 1 - ((Class180) this).anInt2118;
			i_26_ -= i_32_;
			i_28_ += i_32_;
			i_27_ += i_32_;
		}
		if (i_26_ > 0 && i_25_ > 0) {
			method2788(((Class180) this).aByteArray2116, (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).aByteArray11734), i_24_, i_23_, i_26_, i_25_, i_27_, i_28_);
			method2786(i, i_22_, i_26_, i_25_);
		}
	}

	void method2784(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_33_) {
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		i += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11733) + 1;
		i_33_ += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11735) + 1;
		int i_34_ = i + i_33_ * ((Class180) this).anInt2118;
		int i_35_ = 0;
		int i_36_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11730);
		int i_37_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11731);
		int i_38_ = ((Class180) this).anInt2118 - i_37_;
		int i_39_ = 0;
		if (i_33_ <= 0) {
			int i_40_ = 1 - i_33_;
			i_36_ -= i_40_;
			i_35_ += i_40_ * i_37_;
			i_34_ += i_40_ * ((Class180) this).anInt2118;
			i_33_ = 1;
		}
		if (i_33_ + i_36_ >= ((Class180) this).anInt2119) {
			int i_41_ = i_33_ + i_36_ + 1 - ((Class180) this).anInt2119;
			i_36_ -= i_41_;
		}
		if (i <= 0) {
			int i_42_ = 1 - i;
			i_37_ -= i_42_;
			i_35_ += i_42_;
			i_34_ += i_42_;
			i_39_ += i_42_;
			i_38_ += i_42_;
			i = 1;
		}
		if (i + i_37_ >= ((Class180) this).anInt2118) {
			int i_43_ = i + i_37_ + 1 - ((Class180) this).anInt2118;
			i_37_ -= i_43_;
			i_39_ += i_43_;
			i_38_ += i_43_;
		}
		if (i_37_ > 0 && i_36_ > 0) {
			method2788(((Class180) this).aByteArray2116, (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).aByteArray11734), i_35_, i_34_, i_37_, i_36_, i_38_, i_39_);
			method2786(i, i_33_, i_37_, i_36_);
		}
	}

	boolean method2785(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_44_) {
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		i += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11733) + 1;
		i_44_ += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11735) + 1;
		int i_45_ = i + i_44_ * ((Class180) this).anInt2118;
		int i_46_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11730);
		int i_47_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11731);
		int i_48_ = ((Class180) this).anInt2118 - i_47_;
		if (i_44_ <= 0) {
			int i_49_ = 1 - i_44_;
			i_46_ -= i_49_;
			i_45_ += i_49_ * ((Class180) this).anInt2118;
			i_44_ = 1;
		}
		if (i_44_ + i_46_ >= ((Class180) this).anInt2119) {
			int i_50_ = i_44_ + i_46_ + 1 - ((Class180) this).anInt2119;
			i_46_ -= i_50_;
		}
		if (i <= 0) {
			int i_51_ = 1 - i;
			i_47_ -= i_51_;
			i_45_ += i_51_;
			i_48_ += i_51_;
			i = 1;
		}
		if (i + i_47_ >= ((Class180) this).anInt2118) {
			int i_52_ = i + i_47_ + 1 - ((Class180) this).anInt2118;
			i_47_ -= i_52_;
			i_48_ += i_52_;
		}
		if (i_47_ <= 0 || i_46_ <= 0)
			return false;
		int i_53_ = 8;
		i_48_ += (i_53_ - 1) * ((Class180) this).anInt2118;
		return method2791(((Class180) this).aByteArray2116, i_45_, i_47_, i_46_, i_48_, i_53_);
	}

	void method2786(int i, int i_54_, int i_55_, int i_56_) {
		if (((Class180) this).aClass157ArrayArray2120 != null) {
			int i_57_ = i - 1 >> 7;
			int i_58_ = i - 1 + i_55_ - 1 >> 7;
			int i_59_ = i_54_ - 1 >> 7;
			int i_60_ = i_54_ - 1 + i_56_ - 1 >> 7;
			for (int i_61_ = i_57_; i_61_ <= i_58_; i_61_++) {
				Class157[] class157s = ((Class180) this).aClass157ArrayArray2120[i_61_];
				for (int i_62_ = i_59_; i_62_ <= i_60_; i_62_++)
					((Class157) class157s[i_62_]).aBool1758 = true;
			}
		}
	}

	static final void method2787(byte[] is, byte[] is_63_, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_) {
		int i_69_ = -(i_65_ >> 2);
		i_65_ = -(i_65_ & 0x3);
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
				is[i_64_++] += is_63_[i++];
				is[i_64_++] += is_63_[i++];
				is[i_64_++] += is_63_[i++];
				is[i_64_++] += is_63_[i++];
			}
			for (int i_72_ = i_65_; i_72_ < 0; i_72_++)
				is[i_64_++] += is_63_[i++];
			i_64_ += i_67_;
			i += i_68_;
		}
	}

	static final void method2788(byte[] is, byte[] is_73_, int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		int i_79_ = -(i_75_ >> 2);
		i_75_ = -(i_75_ & 0x3);
		for (int i_80_ = -i_76_; i_80_ < 0; i_80_++) {
			for (int i_81_ = i_79_; i_81_ < 0; i_81_++) {
				is[i_74_++] -= is_73_[i++];
				is[i_74_++] -= is_73_[i++];
				is[i_74_++] -= is_73_[i++];
				is[i_74_++] -= is_73_[i++];
			}
			for (int i_82_ = i_75_; i_82_ < 0; i_82_++)
				is[i_74_++] -= is_73_[i++];
			i_74_ += i_77_;
			i += i_78_;
		}
	}

	void method2789(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_83_) {
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		i += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11733) + 1;
		i_83_ += (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11735) + 1;
		int i_84_ = i + i_83_ * ((Class180) this).anInt2118;
		int i_85_ = 0;
		int i_86_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11730);
		int i_87_ = (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11731);
		int i_88_ = ((Class180) this).anInt2118 - i_87_;
		int i_89_ = 0;
		if (i_83_ <= 0) {
			int i_90_ = 1 - i_83_;
			i_86_ -= i_90_;
			i_85_ += i_90_ * i_87_;
			i_84_ += i_90_ * ((Class180) this).anInt2118;
			i_83_ = 1;
		}
		if (i_83_ + i_86_ >= ((Class180) this).anInt2119) {
			int i_91_ = i_83_ + i_86_ + 1 - ((Class180) this).anInt2119;
			i_86_ -= i_91_;
		}
		if (i <= 0) {
			int i_92_ = 1 - i;
			i_87_ -= i_92_;
			i_85_ += i_92_;
			i_84_ += i_92_;
			i_89_ += i_92_;
			i_88_ += i_92_;
			i = 1;
		}
		if (i + i_87_ >= ((Class180) this).anInt2118) {
			int i_93_ = i + i_87_ + 1 - ((Class180) this).anInt2118;
			i_87_ -= i_93_;
			i_89_ += i_93_;
			i_88_ += i_93_;
		}
		if (i_87_ > 0 && i_86_ > 0) {
			method2787(((Class180) this).aByteArray2116, (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).aByteArray11734), i_85_, i_84_, i_87_, i_86_, i_88_, i_89_);
			method2786(i, i_83_, i_87_, i_86_);
		}
	}

	void method2790() {
		((Class180) this).aClass157ArrayArray2120 = (new Class157[((Class180) this).anInt2124][((Class180) this).anInt2122]);
		for (int i = 0; i < ((Class180) this).anInt2122; i++) {
			for (int i_94_ = 0; i_94_ < ((Class180) this).anInt2124; i_94_++)
				((Class180) this).aClass157ArrayArray2120[i_94_][i] = new Class157(((Class180) this).aClass106_Sub1_2121, this, ((Class180) this).aClass174_Sub3_2117, i_94_, i, ((Class180) this).anInt2123, i_94_ * 128 + 1, i * 128 + 1);
		}
	}

	static final boolean method2791(byte[] is, int i, int i_95_, int i_96_, int i_97_, int i_98_) {
		int i_99_ = i_95_ % i_98_;
		int i_100_;
		if (i_99_ != 0)
			i_100_ = i_98_ - i_99_;
		else
			i_100_ = 0;
		int i_101_ = -((i_96_ + i_98_ - 1) / i_98_);
		int i_102_ = -((i_95_ + i_98_ - 1) / i_98_);
		for (int i_103_ = i_101_; i_103_ < 0; i_103_++) {
			for (int i_104_ = i_102_; i_104_ < 0; i_104_++) {
				if (is[i] == 0)
					return true;
				i += i_98_;
			}
			i -= i_100_;
			if (is[i - 1] == 0)
				return true;
			i += i_97_;
		}
		return false;
	}

	Class180(Class106_Sub1 class106_sub1, Class174_Sub3 class174_sub3) {
		((Class180) this).aClass106_Sub1_2121 = class106_sub1;
		((Class180) this).aClass174_Sub3_2117 = class174_sub3;
		((Class180) this).anInt2118 = 2 + ((((Class180) this).aClass174_Sub3_2117.anInt2086 * -1715487093 * (((Class180) this).aClass174_Sub3_2117.anInt2087 * 2129890771)) >> (((Class106_Sub1) ((Class180) this).aClass106_Sub1_2121).anInt10049));
		((Class180) this).anInt2119 = 2 + ((((Class180) this).aClass174_Sub3_2117.anInt2089 * 792439321 * (((Class180) this).aClass174_Sub3_2117.anInt2087 * 2129890771)) >> (((Class106_Sub1) ((Class180) this).aClass106_Sub1_2121).anInt10049));
		((Class180) this).aByteArray2116 = (new byte[((Class180) this).anInt2118 * ((Class180) this).anInt2119]);
		((Class180) this).anInt2123 = (7 + (((Class106_Sub1) ((Class180) this).aClass106_Sub1_2121).anInt10049) - ((Class180) this).aClass174_Sub3_2117.anInt2088 * 212267571);
		((Class180) this).anInt2124 = (((Class180) this).aClass174_Sub3_2117.anInt2086 * -1715487093 >> ((Class180) this).anInt2123);
		((Class180) this).anInt2122 = (((Class180) this).aClass174_Sub3_2117.anInt2089 * 792439321 >> ((Class180) this).anInt2123);
	}

	void method2792() {
		((Class180) this).aClass157ArrayArray2120 = (new Class157[((Class180) this).anInt2124][((Class180) this).anInt2122]);
		for (int i = 0; i < ((Class180) this).anInt2122; i++) {
			for (int i_105_ = 0; i_105_ < ((Class180) this).anInt2124; i_105_++)
				((Class180) this).aClass157ArrayArray2120[i_105_][i] = new Class157(((Class180) this).aClass106_Sub1_2121, this, ((Class180) this).aClass174_Sub3_2117, i_105_, i, ((Class180) this).anInt2123, i_105_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2793(int i, int i_106_, int i_107_, int i_108_) {
		if (((Class180) this).aClass157ArrayArray2120 != null) {
			int i_109_ = i - 1 >> 7;
			int i_110_ = i - 1 + i_107_ - 1 >> 7;
			int i_111_ = i_106_ - 1 >> 7;
			int i_112_ = i_106_ - 1 + i_108_ - 1 >> 7;
			for (int i_113_ = i_109_; i_113_ <= i_110_; i_113_++) {
				Class157[] class157s = ((Class180) this).aClass157ArrayArray2120[i_113_];
				for (int i_114_ = i_111_; i_114_ <= i_112_; i_114_++)
					((Class157) class157s[i_114_]).aBool1758 = true;
			}
		}
	}

	void method2794(int i, int i_115_, int i_116_, int i_117_) {
		if (((Class180) this).aClass157ArrayArray2120 != null) {
			int i_118_ = i - 1 >> 7;
			int i_119_ = i - 1 + i_116_ - 1 >> 7;
			int i_120_ = i_115_ - 1 >> 7;
			int i_121_ = i_115_ - 1 + i_117_ - 1 >> 7;
			for (int i_122_ = i_118_; i_122_ <= i_119_; i_122_++) {
				Class157[] class157s = ((Class180) this).aClass157ArrayArray2120[i_122_];
				for (int i_123_ = i_120_; i_123_ <= i_121_; i_123_++)
					((Class157) class157s[i_123_]).aBool1758 = true;
			}
		}
	}

	void method2795(int i, int i_124_, int i_125_, int i_126_) {
		if (((Class180) this).aClass157ArrayArray2120 != null) {
			int i_127_ = i - 1 >> 7;
			int i_128_ = i - 1 + i_125_ - 1 >> 7;
			int i_129_ = i_124_ - 1 >> 7;
			int i_130_ = i_124_ - 1 + i_126_ - 1 >> 7;
			for (int i_131_ = i_127_; i_131_ <= i_128_; i_131_++) {
				Class157[] class157s = ((Class180) this).aClass157ArrayArray2120[i_131_];
				for (int i_132_ = i_129_; i_132_ <= i_130_; i_132_++)
					((Class157) class157s[i_132_]).aBool1758 = true;
			}
		}
	}

	static final void method2796(byte[] is, byte[] is_133_, int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_) {
		int i_139_ = -(i_135_ >> 2);
		i_135_ = -(i_135_ & 0x3);
		for (int i_140_ = -i_136_; i_140_ < 0; i_140_++) {
			for (int i_141_ = i_139_; i_141_ < 0; i_141_++) {
				is[i_134_++] += is_133_[i++];
				is[i_134_++] += is_133_[i++];
				is[i_134_++] += is_133_[i++];
				is[i_134_++] += is_133_[i++];
			}
			for (int i_142_ = i_135_; i_142_ < 0; i_142_++)
				is[i_134_++] += is_133_[i++];
			i_134_ += i_137_;
			i += i_138_;
		}
	}
}
