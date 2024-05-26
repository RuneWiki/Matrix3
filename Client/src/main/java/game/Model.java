package game;

/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Model {
	protected boolean aBool1227 = false;
	static final float aFloat1228 = 3.1415927F;

	public abstract int method1344();

	public abstract void method1345(Class261 class261, int i, boolean bool);

	void method1346(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, float[] fs, float f, int i_5_, float f_6_, float[] fs_7_) {
		i -= i_2_;
		i_0_ -= i_3_;
		i_1_ -= i_4_;
		float f_8_ = (float) i * fs[0] + (float) i_0_ * fs[1] + (float) i_1_ * fs[2];
		float f_9_ = (float) i * fs[3] + (float) i_0_ * fs[4] + (float) i_1_ * fs[5];
		float f_10_ = (float) i * fs[6] + (float) i_0_ * fs[7] + (float) i_1_ * fs[8];
		float f_11_ = ((float) Math.atan2((double) f_8_, (double) f_10_) / 6.2831855F + 0.5F);
		if (f != 1.0F)
			f_11_ *= f;
		float f_12_ = f_9_ + 0.5F + f_6_;
		if (i_5_ == 1) {
			float f_13_ = f_11_;
			f_11_ = -f_12_;
			f_12_ = f_13_;
		} else if (i_5_ == 2) {
			f_11_ = -f_11_;
			f_12_ = -f_12_;
		} else if (i_5_ == 3) {
			float f_14_ = f_11_;
			f_11_ = f_12_;
			f_12_ = -f_14_;
		}
		fs_7_[0] = f_11_;
		fs_7_[1] = f_12_;
	}

	int method1347(float f, float f_15_, float f_16_) {
		float f_17_ = f < 0.0F ? -f : f;
		float f_18_ = f_15_ < 0.0F ? -f_15_ : f_15_;
		float f_19_ = f_16_ < 0.0F ? -f_16_ : f_16_;
		if (f_18_ > f_17_ && f_18_ > f_19_) {
			if (f_15_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_19_ > f_17_ && f_19_ > f_18_) {
			if (f_16_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public abstract void method1348();

	public abstract void method1349(Class261 class261, Class90 class90, int i);

	float[] method1350(int i, int i_20_, int i_21_, int i_22_, float f, float f_23_, float f_24_) {
		float[] fs = new float[9];
		float[] fs_25_ = new float[9];
		float f_26_ = (float) Math.cos((double) ((float) i_22_ * 0.024543693F));
		float f_27_ = (float) Math.sin((double) ((float) i_22_ * 0.024543693F));
		float f_28_ = 1.0F - f_26_;
		fs[0] = f_26_;
		fs[1] = 0.0F;
		fs[2] = f_27_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_27_;
		fs[7] = 0.0F;
		fs[8] = f_26_;
		float[] fs_29_ = new float[9];
		float f_30_ = 1.0F;
		float f_31_ = 0.0F;
		f_26_ = (float) i_20_ / 32767.0F;
		f_27_ = -(float) Math.sqrt((double) (1.0F - f_26_ * f_26_));
		f_28_ = 1.0F - f_26_;
		float f_32_ = (float) Math.sqrt((double) (i * i + i_21_ * i_21_));
		if (f_32_ == 0.0F && f_26_ == 0.0F)
			fs_25_ = fs;
		else {
			if (f_32_ != 0.0F) {
				f_30_ = (float) -i_21_ / f_32_;
				f_31_ = (float) i / f_32_;
			}
			fs_29_[0] = f_26_ + f_30_ * f_30_ * f_28_;
			fs_29_[1] = f_31_ * f_27_;
			fs_29_[2] = f_31_ * f_30_ * f_28_;
			fs_29_[3] = -f_31_ * f_27_;
			fs_29_[4] = f_26_;
			fs_29_[5] = f_30_ * f_27_;
			fs_29_[6] = f_30_ * f_31_ * f_28_;
			fs_29_[7] = -f_30_ * f_27_;
			fs_29_[8] = f_26_ + f_31_ * f_31_ * f_28_;
			fs_25_[0] = fs[0] * fs_29_[0] + fs[1] * fs_29_[3] + fs[2] * fs_29_[6];
			fs_25_[1] = fs[0] * fs_29_[1] + fs[1] * fs_29_[4] + fs[2] * fs_29_[7];
			fs_25_[2] = fs[0] * fs_29_[2] + fs[1] * fs_29_[5] + fs[2] * fs_29_[8];
			fs_25_[3] = fs[3] * fs_29_[0] + fs[4] * fs_29_[3] + fs[5] * fs_29_[6];
			fs_25_[4] = fs[3] * fs_29_[1] + fs[4] * fs_29_[4] + fs[5] * fs_29_[7];
			fs_25_[5] = fs[3] * fs_29_[2] + fs[4] * fs_29_[5] + fs[5] * fs_29_[8];
			fs_25_[6] = fs[6] * fs_29_[0] + fs[7] * fs_29_[3] + fs[8] * fs_29_[6];
			fs_25_[7] = fs[6] * fs_29_[1] + fs[7] * fs_29_[4] + fs[8] * fs_29_[7];
			fs_25_[8] = fs[6] * fs_29_[2] + fs[7] * fs_29_[5] + fs[8] * fs_29_[8];
		}
		fs_25_[0] *= f;
		fs_25_[1] *= f;
		fs_25_[2] *= f;
		fs_25_[3] *= f_23_;
		fs_25_[4] *= f_23_;
		fs_25_[5] *= f_23_;
		fs_25_[6] *= f_24_;
		fs_25_[7] *= f_24_;
		fs_25_[8] *= f_24_;
		return fs_25_;
	}

	public abstract Model method1351(byte i, int i_33_, boolean bool);

	abstract boolean method1352();

	public abstract int method1353();

	public abstract void method1354(int i, int i_34_, int i_35_, int i_36_);

	public abstract void method1355(int i);

	public abstract int method1356();

	public abstract void method1357(int i);

	public abstract void method1358(int i, int i_37_, int i_38_);

	public abstract void method1359();

	public abstract void method1360(Model class89_39_, int i, int i_40_, int i_41_, boolean bool);

	void method1361(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, float[] fs, int i_48_, float f, float f_49_, float f_50_, float[] fs_51_) {
		i -= i_44_;
		i_42_ -= i_45_;
		i_43_ -= i_46_;
		float f_52_ = ((float) i * fs[0] + (float) i_42_ * fs[1] + (float) i_43_ * fs[2]);
		float f_53_ = ((float) i * fs[3] + (float) i_42_ * fs[4] + (float) i_43_ * fs[5]);
		float f_54_ = ((float) i * fs[6] + (float) i_42_ * fs[7] + (float) i_43_ * fs[8]);
		float f_55_;
		float f_56_;
		if (i_47_ == 0) {
			f_55_ = f_52_ + f + 0.5F;
			f_56_ = -f_54_ + f_50_ + 0.5F;
		} else if (i_47_ == 1) {
			f_55_ = f_52_ + f + 0.5F;
			f_56_ = f_54_ + f_50_ + 0.5F;
		} else if (i_47_ == 2) {
			f_55_ = -f_52_ + f + 0.5F;
			f_56_ = -f_53_ + f_49_ + 0.5F;
		} else if (i_47_ == 3) {
			f_55_ = f_52_ + f + 0.5F;
			f_56_ = -f_53_ + f_49_ + 0.5F;
		} else if (i_47_ == 4) {
			f_55_ = f_54_ + f_50_ + 0.5F;
			f_56_ = -f_53_ + f_49_ + 0.5F;
		} else {
			f_55_ = -f_54_ + f_50_ + 0.5F;
			f_56_ = -f_53_ + f_49_ + 0.5F;
		}
		if (i_48_ == 1) {
			float f_57_ = f_55_;
			f_55_ = -f_56_;
			f_56_ = f_57_;
		} else if (i_48_ == 2) {
			f_55_ = -f_55_;
			f_56_ = -f_56_;
		} else if (i_48_ == 3) {
			float f_58_ = f_55_;
			f_55_ = f_56_;
			f_56_ = -f_58_;
		}
		fs_51_[0] = f_55_;
		fs_51_[1] = f_56_;
	}

	void method1362(Class174 class174, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		boolean bool = false;
		boolean bool_65_ = false;
		boolean bool_66_ = false;
		int i_67_ = -i_61_ / 2;
		int i_68_ = -i_62_ / 2;
		int i_69_ = class174.method2718(i + i_67_, i_60_ + i_68_, -974119136);
		int i_70_ = i_61_ / 2;
		int i_71_ = -i_62_ / 2;
		int i_72_ = class174.method2718(i + i_70_, i_60_ + i_71_, -1843769061);
		int i_73_ = -i_61_ / 2;
		int i_74_ = i_62_ / 2;
		int i_75_ = class174.method2718(i + i_73_, i_60_ + i_74_, -508143741);
		int i_76_ = i_61_ / 2;
		int i_77_ = i_62_ / 2;
		int i_78_ = class174.method2718(i + i_76_, i_60_ + i_77_, -485255817);
		int i_79_ = i_69_ < i_72_ ? i_69_ : i_72_;
		int i_80_ = i_75_ < i_78_ ? i_75_ : i_78_;
		int i_81_ = i_72_ < i_78_ ? i_72_ : i_78_;
		int i_82_ = i_69_ < i_75_ ? i_69_ : i_75_;
		if (i_62_ != 0) {
			int i_83_ = ((int) (Math.atan2((double) (i_79_ - i_80_), (double) i_62_) * 2607.5945876176133) & 0x3fff);
			if (i_83_ != 0) {
				if (i_63_ != 0) {
					if (i_83_ > 8192) {
						int i_84_ = 16384 - i_63_;
						if (i_83_ < i_84_)
							i_83_ = i_84_;
					} else if (i_83_ > i_63_)
						i_83_ = i_63_;
				}
				method1368(i_83_);
			}
		}
		if (i_61_ != 0) {
			int i_85_ = ((int) (Math.atan2((double) (i_82_ - i_81_), (double) i_61_) * 2607.5945876176133) & 0x3fff);
			if (i_85_ != 0) {
				if (i_64_ != 0) {
					if (i_85_ > 8192) {
						int i_86_ = 16384 - i_64_;
						if (i_85_ < i_86_)
							i_85_ = i_86_;
					} else if (i_85_ > i_64_)
						i_85_ = i_64_;
				}
				method1500(i_85_);
			}
		}
		int i_87_ = i_69_ + i_78_;
		if (i_72_ + i_75_ < i_87_)
			i_87_ = i_72_ + i_75_;
		i_87_ = (i_87_ >> 1) - i_59_;
		if (i_87_ != 0)
			method1358(0, i_87_, 0);
	}

	abstract void method1363();

	public final void method1364(Class572_Sub12_Sub7 class572_sub12_sub7, int i, Class572_Sub12_Sub7 class572_sub12_sub7_88_, int i_89_, int i_90_, int i_91_, int i_92_, boolean bool) {
		if (i != -1) {
			method1505();
			if (!method1369())
				method1363();
			else {
				Class99 class99 = (((Class572_Sub12_Sub7) class572_sub12_sub7).aClass99Array11373[i]);
				Class572_Sub23 class572_sub23 = ((Class99) class99).aClass572_Sub23_1269;
				Class99 class99_93_ = null;
				if (class572_sub12_sub7_88_ != null) {
					class99_93_ = (((Class572_Sub12_Sub7) class572_sub12_sub7_88_).aClass99Array11373[i_89_]);
					if (((Class99) class99_93_).aClass572_Sub23_1269 != class572_sub23)
						class99_93_ = null;
				}
				method1422(class572_sub23, class99, class99_93_, i_90_, i_91_, i_92_, null, false, bool, 65535, null);
				method1373();
				method1363();
			}
		}
	}

	public final void method1365(Class572_Sub12_Sub7 class572_sub12_sub7, int i, Class572_Sub12_Sub7 class572_sub12_sub7_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool, int[] is) {
		if (i != -1) {
			method1505();
			if (!method1369())
				method1363();
			else {
				Class99 class99 = (((Class572_Sub12_Sub7) class572_sub12_sub7).aClass99Array11373[i]);
				Class572_Sub23 class572_sub23 = ((Class99) class99).aClass572_Sub23_1269;
				Class99 class99_100_ = null;
				if (class572_sub12_sub7_94_ != null) {
					class99_100_ = (((Class572_Sub12_Sub7) class572_sub12_sub7_94_).aClass99Array11373[i_95_]);
					if (((Class99) class99_100_).aClass572_Sub23_1269 != class572_sub23)
						class99_100_ = null;
				}
				method1422(class572_sub23, class99, class99_100_, i_96_, i_97_, i_98_, null, false, bool, i_99_, is);
				method1373();
				method1363();
			}
		}
	}

	public final void method1366(Class572_Sub12_Sub7 class572_sub12_sub7, int i, Class572_Sub12_Sub7 class572_sub12_sub7_101_, int i_102_, int i_103_, int i_104_, Class572_Sub12_Sub7 class572_sub12_sub7_105_, int i_106_, Class572_Sub12_Sub7 class572_sub12_sub7_107_, int i_108_, int i_109_, int i_110_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_106_ == -1)
				method1364(class572_sub12_sub7, i, class572_sub12_sub7_101_, i_102_, i_103_, i_104_, 0, bool);
			else {
				method1505();
				if (!method1369())
					method1363();
				else {
					Class99 class99 = (((Class572_Sub12_Sub7) class572_sub12_sub7).aClass99Array11373[i]);
					Class572_Sub23 class572_sub23 = ((Class99) class99).aClass572_Sub23_1269;
					Class99 class99_111_ = null;
					if (class572_sub12_sub7_101_ != null) {
						class99_111_ = (((Class572_Sub12_Sub7) class572_sub12_sub7_101_).aClass99Array11373[i_102_]);
						if (((Class99) class99_111_).aClass572_Sub23_1269 != class572_sub23)
							class99_111_ = null;
					}
					method1422(class572_sub23, class99, class99_111_, i_103_, i_104_, 0, bools, false, bool, 65535, null);
					Class99 class99_112_ = (((Class572_Sub12_Sub7) class572_sub12_sub7_105_).aClass99Array11373[i_106_]);
					Class99 class99_113_ = null;
					if (class572_sub12_sub7_107_ != null) {
						class99_113_ = (((Class572_Sub12_Sub7) class572_sub12_sub7_107_).aClass99Array11373[i_108_]);
						if (((Class99) class99_113_).aClass572_Sub23_1269 != class572_sub23)
							class99_113_ = null;
					}
					method1370(0, new int[0], 0, 0, 0, 0, bool);
					method1422(((Class99) class99_112_).aClass572_Sub23_1269, class99_112_, class99_113_, i_109_, i_110_, 0, bools, true, bool, 65535, null);
					method1373();
					method1363();
				}
			}
		}
	}

	public final void method1367(Class572_Sub12_Sub7 class572_sub12_sub7, int i) {
		if (i != -1) {
			method1505();
			if (!method1369())
				method1363();
			else {
				Class99 class99 = (((Class572_Sub12_Sub7) class572_sub12_sub7).aClass99Array11373[i]);
				Class572_Sub23 class572_sub23 = ((Class99) class99).aClass572_Sub23_1269;
				for (int i_114_ = 0; i_114_ < ((Class99) class99).anInt1271; i_114_++) {
					short i_115_ = ((Class99) class99).aShortArray1272[i_114_];
					if (((Class572_Sub23) class572_sub23).aBoolArray9198[i_115_]) {
						if (((Class99) class99).aShortArray1274[i_114_] != -1)
							method1430(0, 0, 0, 0);
						method1430((((Class572_Sub23) class572_sub23).anIntArray9196[i_115_]), ((Class99) class99).aShortArray1273[i_114_], ((Class99) class99).aShortArray1281[i_114_], (((Class99) class99).aShortArray1277[i_114_]));
					}
				}
				method1373();
				method1363();
			}
		}
	}

	public abstract void method1368(int i);

	abstract boolean method1369();

	abstract void method1370(int i, int[] is, int i_116_, int i_117_, int i_118_, int i_119_, boolean bool);

	abstract void method1371(int i, int[] is, int i_120_, int i_121_, int i_122_, boolean bool, int i_123_, int[] is_124_);

	public abstract int method1372();

	abstract void method1373();

	public abstract Class84[] method1374();

	public abstract void method1375(Class261 class261, Class90 class90, int i);

	public abstract boolean method1376(int i, int i_125_, Class261 class261, boolean bool, int i_126_);

	abstract void method1377(int i, int[] is, int i_127_, int i_128_, int i_129_, boolean bool, int i_130_, int[] is_131_);

	public abstract int method1378();

	public abstract int method1379();

	public abstract int method1380();

	public abstract int method1381();

	public abstract int method1382();

	public abstract void method1383(int i, int i_132_, Class174 class174, Class174 class174_133_, int i_134_, int i_135_, int i_136_);

	public abstract int method1384();

	public abstract void method1385(int i);

	public abstract int method1386();

	public abstract void method1387(int i);

	public abstract void method1388(int i);

	public abstract Class175[] method1389();

	public abstract int method1390();

	public abstract int method1391();

	public abstract byte[] method1392();

	public abstract void method1393(short i, short i_137_);

	public abstract Class84[] method1394();

	abstract void method1395();

	public abstract void method1396(int i, int i_138_, int i_139_, int i_140_);

	public abstract boolean method1397();

	public abstract Class572_Sub12_Sub18 method1398(Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract boolean method1399();

	public abstract boolean method1400();

	public abstract int method1401();

	public abstract void method1402(Model class89_141_, int i, int i_142_, int i_143_, boolean bool);

	Class95 method1403(Class159 class159, int[] is, int i) {
		int[] is_144_ = null;
		int[] is_145_ = null;
		int[] is_146_ = null;
		float[][] fs = null;
		if (class159.faceTextureIndexes != null) {
			int i_147_ = ((Class159) class159).anInt1803;
			int[] is_148_ = new int[i_147_];
			int[] is_149_ = new int[i_147_];
			int[] is_150_ = new int[i_147_];
			int[] is_151_ = new int[i_147_];
			int[] is_152_ = new int[i_147_];
			int[] is_153_ = new int[i_147_];
			for (int i_154_ = 0; i_154_ < i_147_; i_154_++) {
				is_148_[i_154_] = 2147483647;
				is_149_[i_154_] = -2147483647;
				is_150_[i_154_] = 2147483647;
				is_151_[i_154_] = -2147483647;
				is_152_[i_154_] = 2147483647;
				is_153_[i_154_] = -2147483647;
			}
			for (int i_155_ = 0; i_155_ < i; i_155_++) {
				int i_156_ = is[i_155_];
				short i_157_ = class159.faceTextureIndexes[i_156_];
				if (i_157_ > -1 && i_157_ < 32766) {
					for (int i_158_ = 0; i_158_ < 3; i_158_++) {
						short i_159_;
						if (i_158_ == 0)
							i_159_ = class159.aShortArray1786[i_156_];
						else if (i_158_ == 1)
							i_159_ = class159.aShortArray1787[i_156_];
						else
							i_159_ = class159.aShortArray1789[i_156_];
						int i_160_ = class159.anIntArray1782[i_159_];
						int i_161_ = class159.anIntArray1777[i_159_];
						int i_162_ = class159.anIntArray1797[i_159_];
						if (i_160_ < is_148_[i_157_])
							is_148_[i_157_] = i_160_;
						if (i_160_ > is_149_[i_157_])
							is_149_[i_157_] = i_160_;
						if (i_161_ < is_150_[i_157_])
							is_150_[i_157_] = i_161_;
						if (i_161_ > is_151_[i_157_])
							is_151_[i_157_] = i_161_;
						if (i_162_ < is_152_[i_157_])
							is_152_[i_157_] = i_162_;
						if (i_162_ > is_153_[i_157_])
							is_153_[i_157_] = i_162_;
					}
				}
			}
			is_144_ = new int[i_147_];
			is_145_ = new int[i_147_];
			is_146_ = new int[i_147_];
			fs = new float[i_147_][];
			for (int i_163_ = 0; i_163_ < i_147_; i_163_++) {
				byte i_164_ = class159.aByteArray1804[i_163_];
				if (i_164_ > 0) {
					is_144_[i_163_] = (is_148_[i_163_] + is_149_[i_163_]) / 2;
					is_145_[i_163_] = (is_150_[i_163_] + is_151_[i_163_]) / 2;
					is_146_[i_163_] = (is_152_[i_163_] + is_153_[i_163_]) / 2;
					float f;
					float f_165_;
					float f_166_;
					if (i_164_ == 1) {
						int i_167_ = class159.anIntArray1788[i_163_];
						if (i_167_ == 0) {
							f = 1.0F;
							f_166_ = 1.0F;
						} else if (i_167_ > 0) {
							f = 1.0F;
							f_166_ = (float) i_167_ / 1024.0F;
						} else {
							f_166_ = 1.0F;
							f = (float) -i_167_ / 1024.0F;
						}
						f_165_ = 64.0F / (float) class159.anIntArray1770[i_163_];
					} else if (i_164_ == 2) {
						f = 64.0F / (float) class159.anIntArray1788[i_163_];
						f_165_ = 64.0F / (float) class159.anIntArray1770[i_163_];
						f_166_ = 64.0F / (float) class159.anIntArray1810[i_163_];
					} else {
						f = (float) class159.anIntArray1788[i_163_] / 1024.0F;
						f_165_ = ((float) class159.anIntArray1770[i_163_] / 1024.0F);
						f_166_ = ((float) class159.anIntArray1810[i_163_] / 1024.0F);
					}
					fs[i_163_] = method1350(class159.aShortArray1805[i_163_], class159.aShortArray1806[i_163_], class159.aShortArray1807[i_163_], (((Class159) class159).aByteArray1814[i_163_]) & 0xff, f, f_165_, f_166_);
				}
			}
		}
		return new Class95(this, is_144_, is_145_, is_146_, fs);
	}

	public abstract void method1404(Model class89_168_, int i, int i_169_, int i_170_, boolean bool);

	abstract void method1405(int i, int[] is, int i_171_, int i_172_, int i_173_, int i_174_, boolean bool);

	public abstract int method1406();

	public abstract int method1407();

	public abstract int method1408();

	public abstract void method1409(int i);

	public abstract void method1410(int i);

	public abstract void method1411();

	public abstract void method1412(int i);

	public abstract void method1413();

	public abstract void method1414(int i);

	public abstract void method1415(int i);

	public abstract int method1416();

	public abstract void method1417(int i);

	public abstract void method1418(int i, int i_175_, int i_176_);

	public abstract void method1419(int i, int i_177_, int i_178_);

	public abstract void method1420(int i, int i_179_, int i_180_);

	public abstract void method1421(int i, int i_181_, int i_182_);

	void method1422(Class572_Sub23 class572_sub23, Class99 class99, Class99 class99_183_, int i, int i_184_, int i_185_, boolean[] bools, boolean bool, boolean bool_186_, int i_187_, int[] is) {
		if (class99_183_ == null || i == 0) {
			for (int i_188_ = 0; i_188_ < ((Class99) class99).anInt1271; i_188_++) {
				short i_189_ = ((Class99) class99).aShortArray1272[i_188_];
				if (bools == null || bools[i_189_] == bool || (((Class572_Sub23) class572_sub23).anIntArray9196[i_189_]) == 0) {
					short i_190_ = ((Class99) class99).aShortArray1274[i_188_];
					if (i_190_ != -1)
						method1499(0, (((Class572_Sub23) class572_sub23).anIntArrayArray9197[i_190_]), 0, 0, 0, i_185_, bool_186_, i_187_ & (((Class572_Sub23) class572_sub23).anIntArray9199[i_190_]), is);
					method1499((((Class572_Sub23) class572_sub23).anIntArray9196[i_189_]), (((Class572_Sub23) class572_sub23).anIntArrayArray9197[i_189_]), ((Class99) class99).aShortArray1273[i_188_], ((Class99) class99).aShortArray1281[i_188_], ((Class99) class99).aShortArray1277[i_188_], i_185_, bool_186_, i_187_ & (((Class572_Sub23) class572_sub23).anIntArray9199[i_189_]), is);
				}
			}
		} else {
			int i_191_ = 0;
			int i_192_ = 0;
			for (int i_193_ = 0; (i_193_ < ((Class572_Sub23) class572_sub23).anInt9195 * 387935973); i_193_++) {
				boolean bool_194_ = false;
				if (i_191_ < ((Class99) class99).anInt1271 && ((Class99) class99).aShortArray1272[i_191_] == i_193_)
					bool_194_ = true;
				boolean bool_195_ = false;
				if (i_192_ < ((Class99) class99_183_).anInt1271 && (((Class99) class99_183_).aShortArray1272[i_192_] == i_193_))
					bool_195_ = true;
				if (bool_194_ || bool_195_) {
					if (bools != null && bools[i_193_] != bool && (((Class572_Sub23) class572_sub23).anIntArray9196[i_193_]) != 0) {
						if (bool_194_)
							i_191_++;
						if (bool_195_)
							i_192_++;
					} else {
						int i_196_ = 0;
						int i_197_ = (((Class572_Sub23) class572_sub23).anIntArray9196[i_193_]);
						if (i_197_ == 3 || i_197_ == 10)
							i_196_ = 128;
						int i_198_;
						int i_199_;
						int i_200_;
						short i_201_;
						byte i_202_;
						if (bool_194_) {
							i_198_ = ((Class99) class99).aShortArray1273[i_191_];
							i_199_ = ((Class99) class99).aShortArray1281[i_191_];
							i_200_ = ((Class99) class99).aShortArray1277[i_191_];
							i_201_ = ((Class99) class99).aShortArray1274[i_191_];
							i_202_ = ((Class99) class99).aByteArray1276[i_191_];
							i_191_++;
						} else {
							i_198_ = i_196_;
							i_199_ = i_196_;
							i_200_ = i_196_;
							i_201_ = (short) -1;
							i_202_ = (byte) 0;
						}
						int i_203_;
						int i_204_;
						int i_205_;
						short i_206_;
						byte i_207_;
						if (bool_195_) {
							i_203_ = (((Class99) class99_183_).aShortArray1273[i_192_]);
							i_204_ = (((Class99) class99_183_).aShortArray1281[i_192_]);
							i_205_ = (((Class99) class99_183_).aShortArray1277[i_192_]);
							i_206_ = (((Class99) class99_183_).aShortArray1274[i_192_]);
							i_207_ = (((Class99) class99_183_).aByteArray1276[i_192_]);
							i_192_++;
						} else {
							i_203_ = i_196_;
							i_204_ = i_196_;
							i_205_ = i_196_;
							i_206_ = (short) -1;
							i_207_ = (byte) 0;
						}
						int i_208_;
						int i_209_;
						int i_210_;
						if ((i_202_ & 0x2) != 0 || (i_207_ & 0x1) != 0) {
							i_208_ = i_198_;
							i_209_ = i_199_;
							i_210_ = i_200_;
						} else if (i_197_ == 2) {
							int i_211_ = i_203_ - i_198_ & 0x3fff;
							int i_212_ = i_204_ - i_199_ & 0x3fff;
							int i_213_ = i_205_ - i_200_ & 0x3fff;
							if (i_211_ >= 8192)
								i_211_ -= 16384;
							if (i_212_ >= 8192)
								i_212_ -= 16384;
							if (i_213_ >= 8192)
								i_213_ -= 16384;
							i_208_ = i_198_ + i_211_ * i / i_184_ & 0x3fff;
							i_209_ = i_199_ + i_212_ * i / i_184_ & 0x3fff;
							i_210_ = i_200_ + i_213_ * i / i_184_ & 0x3fff;
						} else if (i_197_ == 9) {
							int i_214_ = i_203_ - i_198_ & 0x3fff;
							if (i_214_ >= 8192)
								i_214_ -= 16384;
							i_208_ = i_198_ + i_214_ * i / i_184_ & 0x3fff;
							i_210_ = 0;
							i_209_ = 0;
						} else if (i_197_ == 7) {
							int i_215_ = i_203_ - i_198_ & 0x3f;
							if (i_215_ >= 32)
								i_215_ -= 64;
							i_208_ = i_198_ + i_215_ * i / i_184_ & 0x3f;
							i_209_ = i_199_ + (i_204_ - i_199_) * i / i_184_;
							i_210_ = i_200_ + (i_205_ - i_200_) * i / i_184_;
						} else {
							i_208_ = i_198_ + (i_203_ - i_198_) * i / i_184_;
							i_209_ = i_199_ + (i_204_ - i_199_) * i / i_184_;
							i_210_ = i_200_ + (i_205_ - i_200_) * i / i_184_;
						}
						if (i_201_ != -1)
							method1499(0, (((Class572_Sub23) class572_sub23).anIntArrayArray9197[i_201_]), 0, 0, 0, i_185_, bool_186_, (i_187_ & (((Class572_Sub23) class572_sub23).anIntArray9199[i_201_])), is);
						else if (i_206_ != -1)
							method1499(0, (((Class572_Sub23) class572_sub23).anIntArrayArray9197[i_206_]), 0, 0, 0, i_185_, bool_186_, (i_187_ & (((Class572_Sub23) class572_sub23).anIntArray9199[i_206_])), is);
						method1499(i_197_, (((Class572_Sub23) class572_sub23).anIntArrayArray9197[i_193_]), i_208_, i_209_, i_210_, i_185_, bool_186_, i_187_ & (((Class572_Sub23) class572_sub23).anIntArray9199[i_193_]), is);
					}
				}
			}
		}
	}

	abstract void method1423();

	public abstract void method1424();

	public abstract Class84[] method1425();

	public abstract void method1426(Class261 class261);

	abstract void method1427();

	abstract void method1428();

	abstract void method1429(int i, int[] is, int i_216_, int i_217_, int i_218_, int i_219_, boolean bool);

	abstract void method1430(int i, int i_220_, int i_221_, int i_222_);

	abstract void method1431(int i, int[] is, int i_223_, int i_224_, int i_225_, int i_226_, boolean bool);

	abstract void method1432(int i, int[] is, int i_227_, int i_228_, int i_229_, boolean bool, int i_230_, int[] is_231_);

	abstract void method1433(int i, int[] is, int i_232_, int i_233_, int i_234_, boolean bool, int i_235_, int[] is_236_);

	abstract void method1434(int i, int[] is, int i_237_, int i_238_, int i_239_, boolean bool, int i_240_, int[] is_241_);

	public abstract int method1435();

	abstract void method1436(int i, int[] is, int i_242_, int i_243_, int i_244_, boolean bool, int i_245_, int[] is_246_);

	abstract void method1437(int i, int[] is, int i_247_, int i_248_, int i_249_, boolean bool, int i_250_, int[] is_251_);

	public abstract void method1438(Class261 class261, int i, boolean bool);

	public abstract void method1439(Class261 class261, int i, boolean bool);

	public abstract void method1440(Class261 class261, Class90 class90, int i);

	abstract void method1441(int i, int i_252_, int i_253_, int i_254_);

	public abstract void method1442();

	public abstract void method1443(Class261 class261, Class90 class90, int i);

	public abstract boolean method1444(int i, int i_255_, Class261 class261, boolean bool, int i_256_);

	public abstract boolean method1445(int i, int i_257_, Class261 class261, boolean bool, int i_258_);

	public abstract void method1446(Class261 class261);

	public abstract Class572_Sub12_Sub18 method1447(Class572_Sub12_Sub18 class572_sub12_sub18);

	public abstract void method1448();

	abstract void method1449();

	public abstract void method1450(int i);

	public abstract int method1451();

	public abstract int method1452();

	public abstract int method1453();

	public abstract int method1454();

	public abstract int method1455();

	public abstract int method1456();

	public abstract int method1457();

	public abstract int method1458();

	public abstract int method1459();

	public abstract int method1460();

	public abstract int method1461();

	public abstract int method1462();

	public abstract void method1463(int i, int i_259_, Class174 class174, Class174 class174_260_, int i_261_, int i_262_, int i_263_);

	public abstract void method1464(int i, int i_264_, int i_265_);

	public abstract void method1465(int i);

	public abstract Class84[] method1466();

	public abstract void method1467(byte i, byte[] is);

	public abstract int method1468();

	public abstract int method1469();

	public abstract byte[] method1470();

	public abstract byte[] method1471();

	public abstract void method1472(short i, short i_266_);

	public abstract void method1473(byte i, byte[] is);

	public abstract void method1474(byte i, byte[] is);

	public abstract void method1475(short i, short i_267_);

	public abstract void method1476(short i, short i_268_);

	public abstract void method1477(int i, int i_269_, int i_270_, int i_271_);

	public abstract boolean method1478();

	void method1479(int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, float[] fs, int i_277_, float f, float[] fs_278_) {
		i -= i_274_;
		i_272_ -= i_275_;
		i_273_ -= i_276_;
		float f_279_ = ((float) i * fs[0] + (float) i_272_ * fs[1] + (float) i_273_ * fs[2]);
		float f_280_ = ((float) i * fs[3] + (float) i_272_ * fs[4] + (float) i_273_ * fs[5]);
		float f_281_ = ((float) i * fs[6] + (float) i_272_ * fs[7] + (float) i_273_ * fs[8]);
		float f_282_ = (float) Math.sqrt((double) (f_279_ * f_279_ + f_280_ * f_280_ + f_281_ * f_281_));
		float f_283_ = (((float) Math.atan2((double) f_279_, (double) f_281_) / 6.2831855F) + 0.5F);
		float f_284_ = ((float) Math.asin((double) (f_280_ / f_282_)) / 3.1415927F + 0.5F + f);
		if (i_277_ == 1) {
			float f_285_ = f_283_;
			f_283_ = -f_284_;
			f_284_ = f_285_;
		} else if (i_277_ == 2) {
			f_283_ = -f_283_;
			f_284_ = -f_284_;
		} else if (i_277_ == 3) {
			float f_286_ = f_283_;
			f_283_ = f_284_;
			f_284_ = -f_286_;
		}
		fs_278_[0] = f_283_;
		fs_278_[1] = f_284_;
	}

	public abstract int method1480();

	public abstract Class84[] method1481();

	public abstract Class175[] method1482();

	public abstract void method1483();

	public abstract boolean method1484();

	public abstract int method1485();

	public abstract boolean method1486();

	public abstract void method1487(int i);

	public abstract Model method1488(byte i, int i_287_, boolean bool);

	public abstract void method1489();

	public abstract int method1490();

	public abstract int method1491();

	public abstract void method1492(Class261 class261, Class90 class90, int i);

	public abstract int method1493();

	public abstract void method1494(short i, short i_288_);

	public abstract int method1495();

	public abstract boolean method1496();

	abstract void method1497(int i, int i_289_, int i_290_, int i_291_);

	abstract void method1498(int i, int i_292_, int i_293_, int i_294_);

	void method1499(int i, int[] is, int i_295_, int i_296_, int i_297_, int i_298_, boolean bool, int i_299_, int[] is_300_) {
		if (i_298_ == 1) {
			if (i == 0 || i == 1) {
				int i_301_ = -i_295_;
				i_295_ = i_297_;
				i_297_ = i_301_;
			} else if (i == 3) {
				int i_302_ = i_295_;
				i_295_ = i_297_;
				i_297_ = i_302_;
			} else if (i == 2) {
				int i_303_ = i_295_;
				i_295_ = -i_297_ & 0x3fff;
				i_297_ = i_303_ & 0x3fff;
			}
		} else if (i_298_ == 2) {
			if (i == 0 || i == 1) {
				i_295_ = -i_295_;
				i_297_ = -i_297_;
			} else if (i == 2) {
				i_295_ = -i_295_ & 0x3fff;
				i_297_ = -i_297_ & 0x3fff;
			}
		} else if (i_298_ == 3) {
			if (i == 0 || i == 1) {
				int i_304_ = i_295_;
				i_295_ = -i_297_;
				i_297_ = i_304_;
			} else if (i == 3) {
				int i_305_ = i_295_;
				i_295_ = i_297_;
				i_297_ = i_305_;
			} else if (i == 2) {
				int i_306_ = i_295_;
				i_295_ = i_297_ & 0x3fff;
				i_297_ = -i_306_ & 0x3fff;
			}
		}
		if (i_299_ != 65535)
			method1371(i, is, i_295_, i_296_, i_297_, bool, i_299_, is_300_);
		else
			method1370(i, is, i_295_, i_296_, i_297_, i_298_, bool);
	}

	public abstract void method1500(int i);

	public abstract void method1501(Class261 class261);

	public abstract void method1502(int i);

	public abstract void method1503();

	public abstract int method1504();

	Model() {
		/* empty */
	}

	abstract void method1505();

	public abstract void method1506();

	public abstract Class175[] method1507();

	public abstract int method1508();
}
