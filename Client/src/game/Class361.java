package game;

/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class361 {
	int anInt4431;
	Class106_Sub3 aClass106_Sub3_4432;
	int anInt4433;
	int anInt4434;
	Class174_Sub1 aClass174_Sub1_4435;
	byte[] aByteArray4436;
	int anInt4437;
	int anInt4438;
	Class369[][] aClass369ArrayArray4439;

	static final boolean method4451(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i_0_ % i_3_;
		int i_5_;
		if (i_4_ != 0)
			i_5_ = i_3_ - i_4_;
		else
			i_5_ = 0;
		int i_6_ = -((i_1_ + i_3_ - 1) / i_3_);
		int i_7_ = -((i_0_ + i_3_ - 1) / i_3_);
		for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i] == 0)
					return true;
				i += i_3_;
			}
			i -= i_5_;
			if (is[i - 1] == 0)
				return true;
			i += i_2_;
		}
		return false;
	}

	void method4452() {
		((Class361) this).aClass369ArrayArray4439 = (new Class369[((Class361) this).anInt4431][((Class361) this).anInt4437]);
		for (int i = 0; i < ((Class361) this).anInt4437; i++) {
			for (int i_10_ = 0; i_10_ < ((Class361) this).anInt4431; i_10_++) {
				((Class361) this).aClass369ArrayArray4439[i_10_][i] = new Class369(((Class361) this).aClass106_Sub3_4432, this, ((Class361) this).aClass174_Sub1_4435, i_10_, i, ((Class361) this).anInt4438, i_10_ * 128 + 1, i * 128 + 1);
				if (((Class369) (((Class361) this).aClass369ArrayArray4439[i_10_][i])).anInt4518 == 0)
					((Class361) this).aClass369ArrayArray4439[i_10_][i] = null;
			}
		}
	}

	void method4453(Class340 class340, int i, int i_11_, int i_12_, boolean[][] bools, boolean bool) {
		((Class361) this).aClass106_Sub3_4432.method1763(false);
		float f = 1.0F / (float) ((((Class106_Sub3) ((Class361) this).aClass106_Sub3_4432).anInt10460) * 128);
		if (bool) {
			for (int i_13_ = 0; i_13_ < ((Class361) this).anInt4437; i_13_++) {
				int i_14_ = i_13_ << ((Class361) this).anInt4438;
				int i_15_ = i_13_ + 1 << ((Class361) this).anInt4438;
				for (int i_16_ = 0; i_16_ < ((Class361) this).anInt4431; i_16_++) {
					if (((Class361) this).aClass369ArrayArray4439[i_16_][i_13_] != null) {
						int i_17_ = i_16_ << ((Class361) this).anInt4438;
						int i_18_ = i_16_ + 1 << ((Class361) this).anInt4438;
						while_75_: for (int i_19_ = i_17_; i_19_ < i_18_; i_19_++) {
							if (i_19_ - i >= -i_12_ && i_19_ - i <= i_12_) {
								for (int i_20_ = i_14_; i_20_ < i_15_; i_20_++) {
									if (i_20_ - i_11_ >= -i_12_ && i_20_ - i_11_ <= i_12_ && (bools[i_19_ - i + i_12_][i_20_ - i_11_ + i_12_])) {
										class340.aClass250_4332.method3448(f, f, 1.0F, 1.0F);
										class340.aClass250_4332.aFloatArray2728[12] = (float) -i_16_;
										class340.aClass250_4332.aFloatArray2728[13] = (float) -i_13_;
										((Class361) this).aClass369ArrayArray4439[i_16_][i_13_].method4599(class340);
										break while_75_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[(((Class361) this).anInt4437 * ((Class361) this).anInt4431)];
			ByteBuffer bytebuffer = ((Class361) this).aClass106_Sub3_4432.aByteBuffer10378;
			bytebuffer.clear();
			int i_21_ = 0;
			for (int i_22_ = 0; i_22_ < ((Class361) this).anInt4437; i_22_++) {
				int i_23_ = i_22_ << ((Class361) this).anInt4438;
				int i_24_ = i_22_ + 1 << ((Class361) this).anInt4438;
				for (int i_25_ = 0; i_25_ < ((Class361) this).anInt4431; i_25_++) {
					Class369 class369 = (((Class361) this).aClass369ArrayArray4439[i_25_][i_22_]);
					int i_26_ = 0;
					if (class369 != null) {
						int i_27_ = i_25_ << ((Class361) this).anInt4438;
						int i_28_ = i_25_ + 1 << ((Class361) this).anInt4438;
						for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
							if (i_29_ - i_11_ >= -i_12_ && i_29_ - i_11_ <= i_12_) {
								int i_30_ = i_29_ * ((((Class361) this).aClass174_Sub1_4435.anInt2086) * -1715487093) + i_27_;
								for (int i_31_ = i_27_; i_31_ < i_28_; i_31_++) {
									if (i_31_ - i >= -i_12_ && i_31_ - i <= i_12_ && (bools[i_31_ - i + i_12_][i_29_ - i_11_ + i_12_])) {
										short[] is_32_ = (((Class174_Sub1) (((Class361) this).aClass174_Sub1_4435)).aShortArrayArray10695[i_30_]);
										if (is_32_ != null) {
											for (int i_33_ = 0; i_33_ < is_32_.length; i_33_++) {
												bytebuffer.putShort(is_32_[i_33_]);
												i_26_++;
											}
										}
									}
									i_30_++;
								}
							}
						}
					}
					is[i_21_] = i_26_;
					i_21_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_34_ = bytebuffer.position();
				Interface46 interface46 = ((Class361) this).aClass106_Sub3_4432.method9597(i_34_ / 2);
				interface46.method223(0, i_34_, (((Class361) this).aClass106_Sub3_4432.aLong10444));
				int i_35_ = 0;
				i_21_ = 0;
				for (int i_36_ = 0; i_36_ < ((Class361) this).anInt4437; i_36_++) {
					for (int i_37_ = 0; i_37_ < ((Class361) this).anInt4431; i_37_++) {
						if (is[i_21_] != 0) {
							class340.aClass250_4332.method3448(f, f, 1.0F, 1.0F);
							class340.aClass250_4332.aFloatArray2728[12] = (float) -i_37_;
							class340.aClass250_4332.aFloatArray2728[13] = (float) -i_36_;
							((Class361) this).aClass369ArrayArray4439[i_37_][i_36_].method4600(class340, interface46, i_35_, is[i_21_] / 3);
							i_35_ += is[i_21_];
						}
						i_21_++;
					}
				}
			}
		}
		((Class361) this).aClass106_Sub3_4432.method1763(true);
	}

	void method4454(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_38_) {
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		i += (((NativeShadow) class572_sub12_sub18_sub2).x) + 1;
		i_38_ += (((NativeShadow) class572_sub12_sub18_sub2).y) + 1;
		int i_39_ = i + i_38_ * ((Class361) this).anInt4433;
		int i_40_ = 0;
		int i_41_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11766);
		int i_42_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11762);
		int i_43_ = ((Class361) this).anInt4433 - i_42_;
		int i_44_ = 0;
		if (i_38_ <= 0) {
			int i_45_ = 1 - i_38_;
			i_41_ -= i_45_;
			i_40_ += i_45_ * i_42_;
			i_39_ += i_45_ * ((Class361) this).anInt4433;
			i_38_ = 1;
		}
		if (i_38_ + i_41_ >= ((Class361) this).anInt4434) {
			int i_46_ = i_38_ + i_41_ + 1 - ((Class361) this).anInt4434;
			i_41_ -= i_46_;
		}
		if (i <= 0) {
			int i_47_ = 1 - i;
			i_42_ -= i_47_;
			i_40_ += i_47_;
			i_39_ += i_47_;
			i_44_ += i_47_;
			i_43_ += i_47_;
			i = 1;
		}
		if (i + i_42_ >= ((Class361) this).anInt4433) {
			int i_48_ = i + i_42_ + 1 - ((Class361) this).anInt4433;
			i_42_ -= i_48_;
			i_44_ += i_48_;
			i_43_ += i_48_;
		}
		if (i_42_ > 0 && i_41_ > 0) {
			method4456(((Class361) this).aByteArray4436, (((NativeShadow) class572_sub12_sub18_sub2).aByteArray11761), i_40_, i_39_, i_42_, i_41_, i_43_, i_44_);
			method4455(i, i_38_, i_42_, i_41_);
		}
	}

	void method4455(int i, int i_49_, int i_50_, int i_51_) {
		if (((Class361) this).aClass369ArrayArray4439 != null) {
			int i_52_ = i - 1 >> 7;
			int i_53_ = i - 1 + i_50_ - 1 >> 7;
			int i_54_ = i_49_ - 1 >> 7;
			int i_55_ = i_49_ - 1 + i_51_ - 1 >> 7;
			for (int i_56_ = i_52_; i_56_ <= i_53_; i_56_++) {
				Class369[] class369s = ((Class361) this).aClass369ArrayArray4439[i_56_];
				for (int i_57_ = i_54_; i_57_ <= i_55_; i_57_++) {
					if (class369s[i_57_] != null)
						((Class369) class369s[i_57_]).aBool4516 = true;
				}
			}
		}
	}

	static final void method4456(byte[] is, byte[] is_58_, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		int i_64_ = -(i_60_ >> 2);
		i_60_ = -(i_60_ & 0x3);
		for (int i_65_ = -i_61_; i_65_ < 0; i_65_++) {
			for (int i_66_ = i_64_; i_66_ < 0; i_66_++) {
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
			}
			for (int i_67_ = i_60_; i_67_ < 0; i_67_++)
				is[i_59_++] -= is_58_[i++];
			i_59_ += i_62_;
			i += i_63_;
		}
	}

	static final void method4457(byte[] is, byte[] is_68_, int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_) {
		int i_74_ = -(i_70_ >> 2);
		i_70_ = -(i_70_ & 0x3);
		for (int i_75_ = -i_71_; i_75_ < 0; i_75_++) {
			for (int i_76_ = i_74_; i_76_ < 0; i_76_++) {
				is[i_69_++] += is_68_[i++];
				is[i_69_++] += is_68_[i++];
				is[i_69_++] += is_68_[i++];
				is[i_69_++] += is_68_[i++];
			}
			for (int i_77_ = i_70_; i_77_ < 0; i_77_++)
				is[i_69_++] += is_68_[i++];
			i_69_ += i_72_;
			i += i_73_;
		}
	}

	void method4458() {
		((Class361) this).aClass369ArrayArray4439 = (new Class369[((Class361) this).anInt4431][((Class361) this).anInt4437]);
		for (int i = 0; i < ((Class361) this).anInt4437; i++) {
			for (int i_78_ = 0; i_78_ < ((Class361) this).anInt4431; i_78_++) {
				((Class361) this).aClass369ArrayArray4439[i_78_][i] = new Class369(((Class361) this).aClass106_Sub3_4432, this, ((Class361) this).aClass174_Sub1_4435, i_78_, i, ((Class361) this).anInt4438, i_78_ * 128 + 1, i * 128 + 1);
				if (((Class369) (((Class361) this).aClass369ArrayArray4439[i_78_][i])).anInt4518 == 0)
					((Class361) this).aClass369ArrayArray4439[i_78_][i] = null;
			}
		}
	}

	Class361(Class106_Sub3 class106_sub3, Class174_Sub1 class174_sub1) {
		((Class361) this).aClass106_Sub3_4432 = class106_sub3;
		((Class361) this).aClass174_Sub1_4435 = class174_sub1;
		((Class361) this).anInt4433 = 2 + ((((Class361) this).aClass174_Sub1_4435.anInt2086 * -1715487093 * (((Class361) this).aClass174_Sub1_4435.anInt2087 * 2129890771)) >> (((Class106_Sub3) ((Class361) this).aClass106_Sub3_4432).shadowScale));
		((Class361) this).anInt4434 = 2 + ((((Class361) this).aClass174_Sub1_4435.anInt2089 * 792439321 * (((Class361) this).aClass174_Sub1_4435.anInt2087 * 2129890771)) >> (((Class106_Sub3) ((Class361) this).aClass106_Sub3_4432).shadowScale));
		((Class361) this).aByteArray4436 = (new byte[((Class361) this).anInt4433 * ((Class361) this).anInt4434]);
		((Class361) this).anInt4438 = (7 + (((Class106_Sub3) ((Class361) this).aClass106_Sub3_4432).shadowScale) - ((Class361) this).aClass174_Sub1_4435.anInt2088 * 212267571);
		((Class361) this).anInt4431 = (((Class361) this).aClass174_Sub1_4435.anInt2086 * -1715487093 >> ((Class361) this).anInt4438);
		((Class361) this).anInt4437 = (((Class361) this).aClass174_Sub1_4435.anInt2089 * 792439321 >> ((Class361) this).anInt4438);
	}

	void method4459(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_79_) {
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		i += (((NativeShadow) class572_sub12_sub18_sub2).x) + 1;
		i_79_ += (((NativeShadow) class572_sub12_sub18_sub2).y) + 1;
		int i_80_ = i + i_79_ * ((Class361) this).anInt4433;
		int i_81_ = 0;
		int i_82_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11766);
		int i_83_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11762);
		int i_84_ = ((Class361) this).anInt4433 - i_83_;
		int i_85_ = 0;
		if (i_79_ <= 0) {
			int i_86_ = 1 - i_79_;
			i_82_ -= i_86_;
			i_81_ += i_86_ * i_83_;
			i_80_ += i_86_ * ((Class361) this).anInt4433;
			i_79_ = 1;
		}
		if (i_79_ + i_82_ >= ((Class361) this).anInt4434) {
			int i_87_ = i_79_ + i_82_ + 1 - ((Class361) this).anInt4434;
			i_82_ -= i_87_;
		}
		if (i <= 0) {
			int i_88_ = 1 - i;
			i_83_ -= i_88_;
			i_81_ += i_88_;
			i_80_ += i_88_;
			i_85_ += i_88_;
			i_84_ += i_88_;
			i = 1;
		}
		if (i + i_83_ >= ((Class361) this).anInt4433) {
			int i_89_ = i + i_83_ + 1 - ((Class361) this).anInt4433;
			i_83_ -= i_89_;
			i_85_ += i_89_;
			i_84_ += i_89_;
		}
		if (i_83_ > 0 && i_82_ > 0) {
			method4457(((Class361) this).aByteArray4436, (((NativeShadow) class572_sub12_sub18_sub2).aByteArray11761), i_81_, i_80_, i_83_, i_82_, i_84_, i_85_);
			method4455(i, i_79_, i_83_, i_82_);
		}
	}

	void method4460(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_90_) {
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		i += (((NativeShadow) class572_sub12_sub18_sub2).x) + 1;
		i_90_ += (((NativeShadow) class572_sub12_sub18_sub2).y) + 1;
		int i_91_ = i + i_90_ * ((Class361) this).anInt4433;
		int i_92_ = 0;
		int i_93_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11766);
		int i_94_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11762);
		int i_95_ = ((Class361) this).anInt4433 - i_94_;
		int i_96_ = 0;
		if (i_90_ <= 0) {
			int i_97_ = 1 - i_90_;
			i_93_ -= i_97_;
			i_92_ += i_97_ * i_94_;
			i_91_ += i_97_ * ((Class361) this).anInt4433;
			i_90_ = 1;
		}
		if (i_90_ + i_93_ >= ((Class361) this).anInt4434) {
			int i_98_ = i_90_ + i_93_ + 1 - ((Class361) this).anInt4434;
			i_93_ -= i_98_;
		}
		if (i <= 0) {
			int i_99_ = 1 - i;
			i_94_ -= i_99_;
			i_92_ += i_99_;
			i_91_ += i_99_;
			i_96_ += i_99_;
			i_95_ += i_99_;
			i = 1;
		}
		if (i + i_94_ >= ((Class361) this).anInt4433) {
			int i_100_ = i + i_94_ + 1 - ((Class361) this).anInt4433;
			i_94_ -= i_100_;
			i_96_ += i_100_;
			i_95_ += i_100_;
		}
		if (i_94_ > 0 && i_93_ > 0) {
			method4457(((Class361) this).aByteArray4436, (((NativeShadow) class572_sub12_sub18_sub2).aByteArray11761), i_92_, i_91_, i_94_, i_93_, i_95_, i_96_);
			method4455(i, i_90_, i_94_, i_93_);
		}
	}

	void method4461() {
		((Class361) this).aClass369ArrayArray4439 = (new Class369[((Class361) this).anInt4431][((Class361) this).anInt4437]);
		for (int i = 0; i < ((Class361) this).anInt4437; i++) {
			for (int i_101_ = 0; i_101_ < ((Class361) this).anInt4431; i_101_++) {
				((Class361) this).aClass369ArrayArray4439[i_101_][i] = new Class369(((Class361) this).aClass106_Sub3_4432, this, ((Class361) this).aClass174_Sub1_4435, i_101_, i, ((Class361) this).anInt4438, i_101_ * 128 + 1, i * 128 + 1);
				if (((Class369) (((Class361) this).aClass369ArrayArray4439[i_101_][i])).anInt4518 == 0)
					((Class361) this).aClass369ArrayArray4439[i_101_][i] = null;
			}
		}
	}

	void method4462(int i, int i_102_, int i_103_, int i_104_) {
		if (((Class361) this).aClass369ArrayArray4439 != null) {
			int i_105_ = i - 1 >> 7;
			int i_106_ = i - 1 + i_103_ - 1 >> 7;
			int i_107_ = i_102_ - 1 >> 7;
			int i_108_ = i_102_ - 1 + i_104_ - 1 >> 7;
			for (int i_109_ = i_105_; i_109_ <= i_106_; i_109_++) {
				Class369[] class369s = ((Class361) this).aClass369ArrayArray4439[i_109_];
				for (int i_110_ = i_107_; i_110_ <= i_108_; i_110_++) {
					if (class369s[i_110_] != null)
						((Class369) class369s[i_110_]).aBool4516 = true;
				}
			}
		}
	}

	static final void method4463(byte[] is, byte[] is_111_, int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		int i_117_ = -(i_113_ >> 2);
		i_113_ = -(i_113_ & 0x3);
		for (int i_118_ = -i_114_; i_118_ < 0; i_118_++) {
			for (int i_119_ = i_117_; i_119_ < 0; i_119_++) {
				is[i_112_++] += is_111_[i++];
				is[i_112_++] += is_111_[i++];
				is[i_112_++] += is_111_[i++];
				is[i_112_++] += is_111_[i++];
			}
			for (int i_120_ = i_113_; i_120_ < 0; i_120_++)
				is[i_112_++] += is_111_[i++];
			i_112_ += i_115_;
			i += i_116_;
		}
	}

	boolean method4464(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_121_) {
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		i += (((NativeShadow) class572_sub12_sub18_sub2).x) + 1;
		i_121_ += (((NativeShadow) class572_sub12_sub18_sub2).y) + 1;
		int i_122_ = i + i_121_ * ((Class361) this).anInt4433;
		int i_123_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11766);
		int i_124_ = (((NativeShadow) class572_sub12_sub18_sub2).anInt11762);
		int i_125_ = ((Class361) this).anInt4433 - i_124_;
		if (i_121_ <= 0) {
			int i_126_ = 1 - i_121_;
			i_123_ -= i_126_;
			i_122_ += i_126_ * ((Class361) this).anInt4433;
			i_121_ = 1;
		}
		if (i_121_ + i_123_ >= ((Class361) this).anInt4434) {
			int i_127_ = i_121_ + i_123_ + 1 - ((Class361) this).anInt4434;
			i_123_ -= i_127_;
		}
		if (i <= 0) {
			int i_128_ = 1 - i;
			i_124_ -= i_128_;
			i_122_ += i_128_;
			i_125_ += i_128_;
			i = 1;
		}
		if (i + i_124_ >= ((Class361) this).anInt4433) {
			int i_129_ = i + i_124_ + 1 - ((Class361) this).anInt4433;
			i_124_ -= i_129_;
			i_125_ += i_129_;
		}
		if (i_124_ <= 0 || i_123_ <= 0)
			return false;
		int i_130_ = 8;
		i_125_ += (i_130_ - 1) * ((Class361) this).anInt4433;
		return method4451(((Class361) this).aByteArray4436, i_122_, i_124_, i_123_, i_125_, i_130_);
	}
}
