package game;

/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class460 {
	public static int[] anIntArray5210;
	static int anInt5211;
	public static int[] anIntArray4096;
	public static int[] anIntArray5213;
	static int anInt5214 = 0;

	static void method5452() {
		if (null == anIntArray4096)
			anIntArray4096 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_0_ = 0; i_0_ < 512; i_0_++) {
			float f = ((float) (i_0_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_1_ = 0.0625F + (float) (i_0_ & 0x7) / 8.0F;
			for (int i_2_ = 0; i_2_ < 128; i_2_++) {
				float f_3_ = (float) i_2_ / 128.0F;
				float f_4_ = 0.0F;
				float f_5_ = 0.0F;
				float f_6_ = 0.0F;
				float f_7_ = f / 60.0F;
				int i_8_ = (int) f_7_;
				int i_9_ = i_8_ % 6;
				float f_10_ = f_7_ - (float) i_8_;
				float f_11_ = f_3_ * (1.0F - f_1_);
				float f_12_ = f_3_ * (1.0F - f_10_ * f_1_);
				float f_13_ = f_3_ * (1.0F - (1.0F - f_10_) * f_1_);
				if (i_9_ == 0) {
					f_4_ = f_3_;
					f_5_ = f_13_;
					f_6_ = f_11_;
				} else if (1 == i_9_) {
					f_4_ = f_12_;
					f_5_ = f_3_;
					f_6_ = f_11_;
				} else if (i_9_ == 2) {
					f_4_ = f_11_;
					f_5_ = f_3_;
					f_6_ = f_13_;
				} else if (3 == i_9_) {
					f_4_ = f_11_;
					f_5_ = f_12_;
					f_6_ = f_3_;
				} else if (i_9_ == 4) {
					f_4_ = f_13_;
					f_5_ = f_11_;
					f_6_ = f_3_;
				} else if (i_9_ == 5) {
					f_4_ = f_3_;
					f_5_ = f_11_;
					f_6_ = f_12_;
				}
				f_4_ = (float) Math.pow((double) f_4_, d);
				f_5_ = (float) Math.pow((double) f_5_, d);
				f_6_ = (float) Math.pow((double) f_6_, d);
				int i_14_ = (int) (256.0F * f_4_);
				int i_15_ = (int) (256.0F * f_5_);
				int i_16_ = (int) (256.0F * f_6_);
				int i_17_ = i_16_ + (-16777216 + (i_14_ << 16) + (i_15_ << 8));
				anIntArray4096[i++] = i_17_;
			}
		}
	}

	static {
		anInt5211 = 0;
	}

	Class460() throws Throwable {
		throw new Error();
	}

	static void method5453() {
		if (null == anIntArray4096)
			anIntArray4096 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_18_ = 0; i_18_ < 512; i_18_++) {
			float f = ((float) (i_18_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_19_ = 0.0625F + (float) (i_18_ & 0x7) / 8.0F;
			for (int i_20_ = 0; i_20_ < 128; i_20_++) {
				float f_21_ = (float) i_20_ / 128.0F;
				float f_22_ = 0.0F;
				float f_23_ = 0.0F;
				float f_24_ = 0.0F;
				float f_25_ = f / 60.0F;
				int i_26_ = (int) f_25_;
				int i_27_ = i_26_ % 6;
				float f_28_ = f_25_ - (float) i_26_;
				float f_29_ = f_21_ * (1.0F - f_19_);
				float f_30_ = f_21_ * (1.0F - f_28_ * f_19_);
				float f_31_ = f_21_ * (1.0F - (1.0F - f_28_) * f_19_);
				if (i_27_ == 0) {
					f_22_ = f_21_;
					f_23_ = f_31_;
					f_24_ = f_29_;
				} else if (1 == i_27_) {
					f_22_ = f_30_;
					f_23_ = f_21_;
					f_24_ = f_29_;
				} else if (i_27_ == 2) {
					f_22_ = f_29_;
					f_23_ = f_21_;
					f_24_ = f_31_;
				} else if (3 == i_27_) {
					f_22_ = f_29_;
					f_23_ = f_30_;
					f_24_ = f_21_;
				} else if (i_27_ == 4) {
					f_22_ = f_31_;
					f_23_ = f_29_;
					f_24_ = f_21_;
				} else if (i_27_ == 5) {
					f_22_ = f_21_;
					f_23_ = f_29_;
					f_24_ = f_30_;
				}
				f_22_ = (float) Math.pow((double) f_22_, d);
				f_23_ = (float) Math.pow((double) f_23_, d);
				f_24_ = (float) Math.pow((double) f_24_, d);
				int i_32_ = (int) (256.0F * f_22_);
				int i_33_ = (int) (256.0F * f_23_);
				int i_34_ = (int) (256.0F * f_24_);
				int i_35_ = i_34_ + (-16777216 + (i_32_ << 16) + (i_33_ << 8));
				anIntArray4096[i++] = i_35_;
			}
		}
	}

	static void method5454() {
		if (null == anIntArray4096)
			anIntArray4096 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_36_ = 0; i_36_ < 512; i_36_++) {
			float f = ((float) (i_36_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_37_ = 0.0625F + (float) (i_36_ & 0x7) / 8.0F;
			for (int i_38_ = 0; i_38_ < 128; i_38_++) {
				float f_39_ = (float) i_38_ / 128.0F;
				float f_40_ = 0.0F;
				float f_41_ = 0.0F;
				float f_42_ = 0.0F;
				float f_43_ = f / 60.0F;
				int i_44_ = (int) f_43_;
				int i_45_ = i_44_ % 6;
				float f_46_ = f_43_ - (float) i_44_;
				float f_47_ = f_39_ * (1.0F - f_37_);
				float f_48_ = f_39_ * (1.0F - f_46_ * f_37_);
				float f_49_ = f_39_ * (1.0F - (1.0F - f_46_) * f_37_);
				if (i_45_ == 0) {
					f_40_ = f_39_;
					f_41_ = f_49_;
					f_42_ = f_47_;
				} else if (1 == i_45_) {
					f_40_ = f_48_;
					f_41_ = f_39_;
					f_42_ = f_47_;
				} else if (i_45_ == 2) {
					f_40_ = f_47_;
					f_41_ = f_39_;
					f_42_ = f_49_;
				} else if (3 == i_45_) {
					f_40_ = f_47_;
					f_41_ = f_48_;
					f_42_ = f_39_;
				} else if (i_45_ == 4) {
					f_40_ = f_49_;
					f_41_ = f_47_;
					f_42_ = f_39_;
				} else if (i_45_ == 5) {
					f_40_ = f_39_;
					f_41_ = f_47_;
					f_42_ = f_48_;
				}
				f_40_ = (float) Math.pow((double) f_40_, d);
				f_41_ = (float) Math.pow((double) f_41_, d);
				f_42_ = (float) Math.pow((double) f_42_, d);
				int i_50_ = (int) (256.0F * f_40_);
				int i_51_ = (int) (256.0F * f_41_);
				int i_52_ = (int) (256.0F * f_42_);
				int i_53_ = i_52_ + (-16777216 + (i_50_ << 16) + (i_51_ << 8));
				anIntArray4096[i++] = i_53_;
			}
		}
	}

	public static void method5455(boolean bool, boolean bool_54_) {
		if (bool) {
			anInt5214 -= -1525232765;
			if (anInt5214 * 1416043307 == 0)
				anIntArray4096 = null;
		}
		if (bool_54_) {
			anInt5211 -= 1007582257;
			if (anInt5211 * -1736745775 == 0)
				anIntArray5213 = null;
		}
	}

	static void method5456() {
		if (null == anIntArray4096)
			anIntArray4096 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_55_ = 0; i_55_ < 512; i_55_++) {
			float f = ((float) (i_55_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_56_ = 0.0625F + (float) (i_55_ & 0x7) / 8.0F;
			for (int i_57_ = 0; i_57_ < 128; i_57_++) {
				float f_58_ = (float) i_57_ / 128.0F;
				float f_59_ = 0.0F;
				float f_60_ = 0.0F;
				float f_61_ = 0.0F;
				float f_62_ = f / 60.0F;
				int i_63_ = (int) f_62_;
				int i_64_ = i_63_ % 6;
				float f_65_ = f_62_ - (float) i_63_;
				float f_66_ = f_58_ * (1.0F - f_56_);
				float f_67_ = f_58_ * (1.0F - f_65_ * f_56_);
				float f_68_ = f_58_ * (1.0F - (1.0F - f_65_) * f_56_);
				if (i_64_ == 0) {
					f_59_ = f_58_;
					f_60_ = f_68_;
					f_61_ = f_66_;
				} else if (1 == i_64_) {
					f_59_ = f_67_;
					f_60_ = f_58_;
					f_61_ = f_66_;
				} else if (i_64_ == 2) {
					f_59_ = f_66_;
					f_60_ = f_58_;
					f_61_ = f_68_;
				} else if (3 == i_64_) {
					f_59_ = f_66_;
					f_60_ = f_67_;
					f_61_ = f_58_;
				} else if (i_64_ == 4) {
					f_59_ = f_68_;
					f_60_ = f_66_;
					f_61_ = f_58_;
				} else if (i_64_ == 5) {
					f_59_ = f_58_;
					f_60_ = f_66_;
					f_61_ = f_67_;
				}
				f_59_ = (float) Math.pow((double) f_59_, d);
				f_60_ = (float) Math.pow((double) f_60_, d);
				f_61_ = (float) Math.pow((double) f_61_, d);
				int i_69_ = (int) (256.0F * f_59_);
				int i_70_ = (int) (256.0F * f_60_);
				int i_71_ = (int) (256.0F * f_61_);
				int i_72_ = i_71_ + (-16777216 + (i_69_ << 16) + (i_70_ << 8));
				anIntArray4096[i++] = i_72_;
			}
		}
	}

	static void method5457() {
		if (anIntArray5213 == null) {
			anIntArray5213 = new int[65536];
			anIntArray5210 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_73_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_74_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
				double d_75_ = (double) (i & 0x7f) / 128.0;
				double d_76_ = d_75_;
				double d_77_ = d_75_;
				double d_78_ = d_75_;
				if (d_74_ != 0.0) {
					double d_79_;
					if (d_75_ < 0.5)
						d_79_ = (1.0 + d_74_) * d_75_;
					else
						d_79_ = d_75_ + d_74_ - d_75_ * d_74_;
					double d_80_ = 2.0 * d_75_ - d_79_;
					double d_81_ = 0.3333333333333333 + d_73_;
					if (d_81_ > 1.0)
						d_81_--;
					double d_82_ = d_73_;
					double d_83_ = d_73_ - 0.3333333333333333;
					if (d_83_ < 0.0)
						d_83_++;
					if (d_81_ * 6.0 < 1.0)
						d_76_ = d_80_ + d_81_ * (6.0 * (d_79_ - d_80_));
					else if (2.0 * d_81_ < 1.0)
						d_76_ = d_79_;
					else if (3.0 * d_81_ < 2.0)
						d_76_ = 6.0 * ((d_79_ - d_80_) * (0.6666666666666666 - d_81_)) + d_80_;
					else
						d_76_ = d_80_;
					if (6.0 * d_82_ < 1.0)
						d_77_ = d_82_ * ((d_79_ - d_80_) * 6.0) + d_80_;
					else if (d_82_ * 2.0 < 1.0)
						d_77_ = d_79_;
					else if (d_82_ * 3.0 < 2.0)
						d_77_ = d_80_ + ((0.6666666666666666 - d_82_) * (d_79_ - d_80_) * 6.0);
					else
						d_77_ = d_80_;
					if (6.0 * d_83_ < 1.0)
						d_78_ = 6.0 * (d_79_ - d_80_) * d_83_ + d_80_;
					else if (2.0 * d_83_ < 1.0)
						d_78_ = d_79_;
					else if (d_83_ * 3.0 < 2.0)
						d_78_ = 6.0 * ((d_79_ - d_80_) * (0.6666666666666666 - d_83_)) + d_80_;
					else
						d_78_ = d_80_;
				}
				d_76_ = Math.pow(d_76_, d);
				d_77_ = Math.pow(d_77_, d);
				d_78_ = Math.pow(d_78_, d);
				int i_84_ = (int) (d_76_ * 256.0);
				int i_85_ = (int) (256.0 * d_77_);
				int i_86_ = (int) (d_78_ * 256.0);
				int i_87_ = (i_85_ << 8) + (i_84_ << 16) + i_86_;
				anIntArray5213[i] = i_87_ & 0xffffff;
				int i_88_ = i_84_ + ((i_85_ << 8) + (i_86_ << 16));
				anIntArray5210[i] = i_88_;
			}
		}
	}

	static void method5458() {
		if (anIntArray5213 == null) {
			anIntArray5213 = new int[65536];
			anIntArray5210 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_89_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_90_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
				double d_91_ = (double) (i & 0x7f) / 128.0;
				double d_92_ = d_91_;
				double d_93_ = d_91_;
				double d_94_ = d_91_;
				if (d_90_ != 0.0) {
					double d_95_;
					if (d_91_ < 0.5)
						d_95_ = (1.0 + d_90_) * d_91_;
					else
						d_95_ = d_91_ + d_90_ - d_91_ * d_90_;
					double d_96_ = 2.0 * d_91_ - d_95_;
					double d_97_ = 0.3333333333333333 + d_89_;
					if (d_97_ > 1.0)
						d_97_--;
					double d_98_ = d_89_;
					double d_99_ = d_89_ - 0.3333333333333333;
					if (d_99_ < 0.0)
						d_99_++;
					if (d_97_ * 6.0 < 1.0)
						d_92_ = d_96_ + d_97_ * (6.0 * (d_95_ - d_96_));
					else if (2.0 * d_97_ < 1.0)
						d_92_ = d_95_;
					else if (3.0 * d_97_ < 2.0)
						d_92_ = 6.0 * ((d_95_ - d_96_) * (0.6666666666666666 - d_97_)) + d_96_;
					else
						d_92_ = d_96_;
					if (6.0 * d_98_ < 1.0)
						d_93_ = d_98_ * ((d_95_ - d_96_) * 6.0) + d_96_;
					else if (d_98_ * 2.0 < 1.0)
						d_93_ = d_95_;
					else if (d_98_ * 3.0 < 2.0)
						d_93_ = d_96_ + ((0.6666666666666666 - d_98_) * (d_95_ - d_96_) * 6.0);
					else
						d_93_ = d_96_;
					if (6.0 * d_99_ < 1.0)
						d_94_ = 6.0 * (d_95_ - d_96_) * d_99_ + d_96_;
					else if (2.0 * d_99_ < 1.0)
						d_94_ = d_95_;
					else if (d_99_ * 3.0 < 2.0)
						d_94_ = 6.0 * ((d_95_ - d_96_) * (0.6666666666666666 - d_99_)) + d_96_;
					else
						d_94_ = d_96_;
				}
				d_92_ = Math.pow(d_92_, d);
				d_93_ = Math.pow(d_93_, d);
				d_94_ = Math.pow(d_94_, d);
				int i_100_ = (int) (d_92_ * 256.0);
				int i_101_ = (int) (256.0 * d_93_);
				int i_102_ = (int) (d_94_ * 256.0);
				int i_103_ = (i_101_ << 8) + (i_100_ << 16) + i_102_;
				anIntArray5213[i] = i_103_ & 0xffffff;
				int i_104_ = i_100_ + ((i_101_ << 8) + (i_102_ << 16));
				anIntArray5210[i] = i_104_;
			}
		}
	}

	public static int method5459(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_105_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_106_ = (double) (i & 0xff) / 256.0;
		double d_107_ = d;
		if (d_105_ < d_107_)
			d_107_ = d_105_;
		if (d_106_ < d_107_)
			d_107_ = d_106_;
		double d_108_ = d;
		if (d_105_ > d_108_)
			d_108_ = d_105_;
		if (d_106_ > d_108_)
			d_108_ = d_106_;
		double d_109_ = 0.0;
		double d_110_ = 0.0;
		double d_111_ = (d_108_ + d_107_) / 2.0;
		if (d_108_ != d_107_) {
			if (d_111_ < 0.5)
				d_110_ = (d_108_ - d_107_) / (d_108_ + d_107_);
			if (d_111_ >= 0.5)
				d_110_ = (d_108_ - d_107_) / (2.0 - d_108_ - d_107_);
			if (d == d_108_)
				d_109_ = (d_105_ - d_106_) / (d_108_ - d_107_);
			else if (d_108_ == d_105_)
				d_109_ = 2.0 + (d_106_ - d) / (d_108_ - d_107_);
			else if (d_106_ == d_108_)
				d_109_ = 4.0 + (d - d_105_) / (d_108_ - d_107_);
		}
		d_109_ /= 6.0;
		int i_112_ = (int) (256.0 * d_109_);
		int i_113_ = (int) (d_110_ * 256.0);
		int i_114_ = (int) (d_111_ * 256.0);
		if (i_113_ < 0)
			i_113_ = 0;
		else if (i_113_ > 255)
			i_113_ = 255;
		if (i_114_ < 0)
			i_114_ = 0;
		else if (i_114_ > 255)
			i_114_ = 255;
		if (i_114_ > 243)
			i_113_ >>= 4;
		else if (i_114_ > 217)
			i_113_ >>= 3;
		else if (i_114_ > 192)
			i_113_ >>= 2;
		else if (i_114_ > 179)
			i_113_ >>= 1;
		return ((i_114_ >> 1) + ((i_113_ >> 5 << 7) + ((i_112_ & 0xff) >> 2 << 10)));
	}

	public static int method5460(int i, int i_115_) {
		i_115_ = (i & 0x7f) * i_115_ >> 7;
		if (i_115_ < 2)
			i_115_ = 2;
		else if (i_115_ > 126)
			i_115_ = 126;
		return (i & 0xff80) + i_115_;
	}

	public static int method5461(int i, int i_116_) {
		i_116_ = (i & 0x7f) * i_116_ >> 7;
		if (i_116_ < 2)
			i_116_ = 2;
		else if (i_116_ > 126)
			i_116_ = 126;
		return (i & 0xff80) + i_116_;
	}

	public static int method5462(int i, int i_117_) {
		int i_118_ = i_117_ >>> 24;
		int i_119_ = 255 - i_118_;
		i_117_ = ((i_117_ & 0xff00ff) * i_118_ & ~0xff00ff | i_118_ * (i_117_ & 0xff00) & 0xff0000) >>> 8;
		return i_117_ + (((i & 0xff00ff) * i_119_ & ~0xff00ff | i_119_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static int method5463(int i, int i_120_) {
		int i_121_ = i_120_ >>> 24;
		int i_122_ = 255 - i_121_;
		i_120_ = ((i_120_ & 0xff00ff) * i_121_ & ~0xff00ff | i_121_ * (i_120_ & 0xff00) & 0xff0000) >>> 8;
		return i_120_ + (((i & 0xff00ff) * i_122_ & ~0xff00ff | i_122_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static int method5464(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_123_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_124_ = (double) (i & 0xff) / 256.0;
		double d_125_ = d;
		if (d_123_ < d_125_)
			d_125_ = d_123_;
		if (d_124_ < d_125_)
			d_125_ = d_124_;
		double d_126_ = d;
		if (d_123_ > d_126_)
			d_126_ = d_123_;
		if (d_124_ > d_126_)
			d_126_ = d_124_;
		double d_127_ = 0.0;
		double d_128_ = 0.0;
		double d_129_ = (d_126_ + d_125_) / 2.0;
		if (d_126_ != d_125_) {
			if (d_129_ < 0.5)
				d_128_ = (d_126_ - d_125_) / (d_126_ + d_125_);
			if (d_129_ >= 0.5)
				d_128_ = (d_126_ - d_125_) / (2.0 - d_126_ - d_125_);
			if (d == d_126_)
				d_127_ = (d_123_ - d_124_) / (d_126_ - d_125_);
			else if (d_126_ == d_123_)
				d_127_ = 2.0 + (d_124_ - d) / (d_126_ - d_125_);
			else if (d_124_ == d_126_)
				d_127_ = 4.0 + (d - d_123_) / (d_126_ - d_125_);
		}
		d_127_ /= 6.0;
		int i_130_ = (int) (256.0 * d_127_);
		int i_131_ = (int) (d_128_ * 256.0);
		int i_132_ = (int) (d_129_ * 256.0);
		if (i_131_ < 0)
			i_131_ = 0;
		else if (i_131_ > 255)
			i_131_ = 255;
		if (i_132_ < 0)
			i_132_ = 0;
		else if (i_132_ > 255)
			i_132_ = 255;
		if (i_132_ > 243)
			i_131_ >>= 4;
		else if (i_132_ > 217)
			i_131_ >>= 3;
		else if (i_132_ > 192)
			i_131_ >>= 2;
		else if (i_132_ > 179)
			i_131_ >>= 1;
		return ((i_132_ >> 1) + ((i_131_ >> 5 << 7) + ((i_130_ & 0xff) >> 2 << 10)));
	}

	static final void method5465(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		int i_133_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_134_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		if (class73.anInt892 * -22820201 != 6)
			throw new RuntimeException("");
		NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(class73.anInt803 * -1063203465, -1568094638));
		if (class73.aClass399_908 == null)
			class73.aClass399_908 = new Class399(class410, true);
		class73.aClass399_908.aLong4723 = Class542.method6439(-1836251590) * -6756611017005174427L;
		if (i_134_ < 0 || i_134_ >= class410.anIntArray4793.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_134_).toString());
		class73.aClass399_908.anIntArray4720[i_134_] = i_133_;
		Class555.method6575(class73, (short) 11008);
	}
}
