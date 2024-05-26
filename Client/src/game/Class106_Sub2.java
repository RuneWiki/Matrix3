package game;

/* Class106_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class106_Sub2 extends Class106 {
	Class186[] aClass186Array10213;
	int anInt10214;
	boolean aBool10215 = false;
	int anInt10216;
	int anInt10217;
	int[] anIntArray10218;
	float[] aFloatArray10219;
	int anInt10220;
	int anInt10221;
	int anInt10222;
	int anInt10223;
	int anInt10224;
	int anInt10225;
	int anInt10226;
	boolean aBool10227 = false;
	int anInt10228;
	int anInt10229;
	Class261 aClass261_10230;
	Class250 aClass250_10231;
	Class250 aClass250_10232;
	Class250 aClass250_10233;
	int anInt10234;
	int anInt10235;
	int anInt10236;
	int anInt10237;
	int anInt10238;
	float aFloat10239;
	int anInt10240;
	float aFloat10241;
	float aFloat10242;
	float aFloat10243;
	float aFloat10244;
	float[][] aFloatArrayArray10245;
	float aFloat10246;
	Class127 aClass127_10247;
	Class127 aClass127_10248;
	Class161 aClass161_10249;
	Class104_Sub1 aClass104_Sub1_10250;
	Class161 aClass161_10251;
	int anInt10252;

	Class106_Sub2(MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37) {
		super(mapSize, interface5, interface35, interface36, interface37);
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10221 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10223 = 0;
		((Class106_Sub2) this).anInt10234 = -913886401;
		((Class106_Sub2) this).anInt10228 = 1997943070;
		((Class106_Sub2) this).anInt10235 = 1959665586;
		((Class106_Sub2) this).aFloatArrayArray10245 = new float[6][4];
		((Class106_Sub2) this).aFloat10243 = 1.0F;
		((Class106_Sub2) this).aFloat10244 = 0.0F;
		((Class106_Sub2) this).aClass127_10248 = new Class127(16);
		((Class106_Sub2) this).anInt10240 = -1634385179;
		try {
			((Class106_Sub2) this).aClass127_10247 = new Class127(10485760, 256);
			((Class106_Sub2) this).aClass261_10230 = new Class261();
			((Class106_Sub2) this).aClass250_10231 = new Class250();
			((Class106_Sub2) this).aClass250_10232 = new Class250();
			((Class106_Sub2) this).aClass250_10233 = new Class250();
			method9511(1);
			method9510(0);
			Class245.method3353(true, true, (byte) 113);
			((Class106_Sub2) this).aBool10227 = true;
			((Class106_Sub2) this).anInt10214 = (int) Class69.method1067(-2004797323) * 1884086829;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-1295745057);
			throw new RuntimeException("");
		}
	}

	public Class165 method1662() {
		return new Class165(0, "Pure Java", 1, "CPU", 0L, false);
	}

	void method1664(int i, int i_0_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9923(i, i_0_);
		if (null != anInterface5_1408)
			anInterface5_1408.method22((byte) -19);
	}

	public void method2017() {
		/* empty */
	}

	void method1667() {
		if (((Class106_Sub2) this).aBool10227) {
			Class472.method5585(true, false, (byte) -23);
			((Class106_Sub2) this).aBool10227 = false;
		}
		((Class106_Sub2) this).aBool10215 = true;
	}

	public void method1668(int i) {
		int i_1_ = i - ((Class106_Sub2) this).anInt10214 * 1320402341;
		for (Class572_Sub38 class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2249(769962827); null != class572_sub38; class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2238(-797489311)) {
			if (((Class572_Sub38) class572_sub38).aBool9386) {
				((Class572_Sub38) class572_sub38).anInt9384 += i_1_;
				int i_2_ = ((Class572_Sub38) class572_sub38).anInt9384 / 50;
				if (i_2_ > 0) {
					MaterialInformation class101 = aClass94_1396.getTexture(((Class572_Sub38) class572_sub38).anInt9387, 1045072393);
					float f = (float) (1913535271 * class101.anInt1338);
					class572_sub38.method8764((int) (f * ((float) class101.textureSpeedU * ((float) i_1_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_1_ / 1000.0F * (float) class101.textureSpeedV / 64.0F)));
					((Class572_Sub38) class572_sub38).anInt9384 -= i_2_ * 50;
				}
				((Class572_Sub38) class572_sub38).aBool9386 = false;
			}
		}
		((Class106_Sub2) this).anInt10214 = i * 1884086829;
		((Class106_Sub2) this).aClass127_10248.method2235(5, 2096390434);
		((Class106_Sub2) this).aClass127_10247.method2235(5, 2036831682);
	}

	public int method1669() {
		return 0;
	}

	public boolean method1811() {
		return false;
	}

	public void method1712(int[] is) {
		is[0] = 1844987403 * ((Class106_Sub2) this).anInt10226;
		is[1] = ((Class106_Sub2) this).anInt10252 * 645490481;
		is[2] = -1421066563 * ((Class106_Sub2) this).anInt10237;
		is[3] = ((Class106_Sub2) this).anInt10238 * 472284863;
	}

	boolean method9502(int i, int i_3_) {
		return anInterface5_1408.method25(i, Class514.aClass514_5713, 0.7F, i_3_, i_3_, true, 650960116);
	}

	boolean method9503(int i) {
		MaterialInformation class101 = aClass94_1396.getTexture(i, 2000352676);
		return method9502(class101.textureId * 811137757, 1913535271 * class101.anInt1338);
	}

	public void method1943(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, Class167 class167, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_14_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_15_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_10_ ? ((Class106_Sub2) this).anInt10222 * 2029354259 : i_10_);
			int i_16_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < i_10_ + is.length) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : is.length + i_10_);
			i_13_ <<= 8;
			i_11_ <<= 8;
			i_12_ <<= 8;
			int i_17_ = i_12_ + i_11_;
			i_13_ %= i_17_;
			i_5_ -= i;
			i_6_ -= i_4_;
			if (i_6_ + i_5_ < 0) {
				int i_18_ = (int) (Math.sqrt((double) (i_5_ * i_5_ + i_6_ * i_6_)) * 256.0);
				int i_19_ = i_18_ % i_17_;
				i_13_ = i_11_ + i_17_ - i_13_ - i_19_;
				i_13_ %= i_17_;
				if (i_13_ < 0)
					i_13_ += i_17_;
				i += i_5_;
				i_5_ = -i_5_;
				i_4_ += i_6_;
				i_6_ = -i_6_;
			}
			if (i_5_ > i_6_) {
				i_4_ <<= 16;
				i_4_ += 32768;
				i_6_ <<= 16;
				int i_20_ = (int) Math.floor((double) i_6_ / (double) i_5_ + 0.5);
				i_5_ += i;
				int i_21_ = i_7_ >>> 24;
				int i_22_ = (int) Math.sqrt((double) ((i_20_ >> 8) * (i_20_ >> 8) + 65536));
				if (0 == i_8_ || 1 == i_8_ && i_21_ == 255) {
					while (i <= i_5_) {
						int i_23_ = i_4_ >> 16;
						int i_24_ = i_23_ - i_10_;
						if (i >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_23_ >= i_15_ && i_23_ < i_16_ && i_13_ < i_11_) {
							int i_25_ = is[i_24_] + i_9_;
							if (i >= i_25_ && i < is_14_[i_24_] + i_25_)
								((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_23_) + i] = i_7_;
						}
						i_4_ += i_20_;
						i++;
						i_13_ += i_22_;
						i_13_ %= i_17_;
					}
				} else if (i_8_ == 1) {
					i_7_ = ((i_21_ * (i_7_ & 0xff00) >> 8 & 0xff00) + ((i_7_ & 0xff00ff) * i_21_ >> 8 & 0xff00ff) + (i_21_ << 24));
					int i_26_ = 256 - i_21_;
					while (i <= i_5_) {
						int i_27_ = i_4_ >> 16;
						int i_28_ = i_27_ - i_10_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_27_ >= i_15_ && i_27_ < i_16_ && i_13_ < i_11_) {
							int i_29_ = i_9_ + is[i_28_];
							if (i >= i_29_ && i < is_14_[i_28_] + i_29_) {
								int i_30_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_27_) + i);
								int i_31_ = (((Class106_Sub2) this).anIntArray10218[i_30_]);
								i_31_ = (((i_31_ & 0xff00ff) * i_26_ >> 8 & 0xff00ff) + (i_26_ * (i_31_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_30_] = i_7_ + i_31_;
							}
						}
						i_4_ += i_20_;
						i++;
						i_13_ += i_22_;
						i_13_ %= i_17_;
					}
				} else if (2 == i_8_) {
					while (i <= i_5_) {
						int i_32_ = i_4_ >> 16;
						int i_33_ = i_32_ - i_10_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_32_ >= i_15_ && i_32_ < i_16_ && i_13_ < i_11_) {
							int i_34_ = i_9_ + is[i_33_];
							if (i >= i_34_ && i < i_34_ + is_14_[i_33_]) {
								int i_35_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_32_) + i);
								int i_36_ = (((Class106_Sub2) this).anIntArray10218[i_35_]);
								int i_37_ = i_36_ + i_7_;
								int i_38_ = (i_36_ & 0xff00ff) + (i_7_ & 0xff00ff);
								i_36_ = (i_38_ & 0x1000100) + (i_37_ - i_38_ & 0x10000);
								((Class106_Sub2) this).anIntArray10218[i_35_] = i_37_ - i_36_ | i_36_ - (i_36_ >>> 8);
							}
						}
						i_4_ += i_20_;
						i++;
						i_13_ += i_22_;
						i_13_ %= i_17_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_5_ <<= 16;
				int i_39_ = (int) Math.floor((double) i_5_ / (double) i_6_ + 0.5);
				int i_40_ = (int) Math.sqrt((double) (65536 + (i_39_ >> 8) * (i_39_ >> 8)));
				i_6_ += i_4_;
				int i_41_ = i_7_ >>> 24;
				if (0 == i_8_ || 1 == i_8_ && 255 == i_41_) {
					while (i_4_ <= i_6_) {
						int i_42_ = i >> 16;
						int i_43_ = i_4_ - i_10_;
						if (i_4_ >= i_15_ && i_4_ < i_16_ && i_42_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_42_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_13_ < i_11_ && i_42_ >= i_9_ + is[i_43_] && i_42_ < is[i_43_] + i_9_ + is_14_[i_43_])
							((Class106_Sub2) this).anIntArray10218[(i_42_ + i_4_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_7_;
						i += i_39_;
						i_4_++;
						i_13_ += i_40_;
						i_13_ %= i_17_;
					}
				} else if (i_8_ == 1) {
					i_7_ = ((i_41_ << 24) + ((i_41_ * (i_7_ & 0xff00ff) >> 8 & 0xff00ff) + (i_41_ * (i_7_ & 0xff00) >> 8 & 0xff00)));
					int i_44_ = 256 - i_41_;
					while (i_4_ <= i_6_) {
						int i_45_ = i >> 16;
						int i_46_ = i_4_ - i_10_;
						if (i_4_ >= i_15_ && i_4_ < i_16_ && i_45_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_45_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_13_ < i_11_ && i_45_ >= i_9_ + is[i_46_] && i_45_ < i_9_ + is[i_46_] + is_14_[i_46_]) {
							int i_47_ = i_45_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_4_);
							int i_48_ = (((Class106_Sub2) this).anIntArray10218[i_47_]);
							i_48_ = (((i_48_ & 0xff00) * i_44_ >> 8 & 0xff00) + (i_44_ * (i_48_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_4_) + i_45_] = i_7_ + i_48_;
						}
						i += i_39_;
						i_4_++;
						i_13_ += i_40_;
						i_13_ %= i_17_;
					}
				} else if (2 == i_8_) {
					while (i_4_ <= i_6_) {
						int i_49_ = i >> 16;
						int i_50_ = i_4_ - i_10_;
						if (i_4_ >= i_15_ && i_4_ < i_16_ && i_49_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_49_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_13_ < i_11_ && i_49_ >= i_9_ + is[i_50_] && i_49_ < is_14_[i_50_] + (i_9_ + is[i_50_])) {
							int i_51_ = (i_4_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_49_);
							int i_52_ = (((Class106_Sub2) this).anIntArray10218[i_51_]);
							int i_53_ = i_52_ + i_7_;
							int i_54_ = (i_52_ & 0xff00ff) + (i_7_ & 0xff00ff);
							i_52_ = (i_54_ & 0x1000100) + (i_53_ - i_54_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_51_] = i_53_ - i_52_ | i_52_ - (i_52_ >>> 8);
						}
						i += i_39_;
						i_4_++;
						i_13_ += i_40_;
						i_13_ %= i_17_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public long method1853(int i, int i_55_) {
		return 0L;
	}

	public Class161 method1864(int i, int i_56_, boolean bool, boolean bool_57_) {
		if (bool)
			return new Class161_Sub3_Sub3(this, i, i_56_);
		return new Class161_Sub3_Sub2(this, i, i_56_);
	}

	boolean method5212(int i) {
		MaterialInformation class101 = aClass94_1396.getTexture(i, 1878252228);
		return 0 != class101.aByte1344 || class101.aByte1345 != 0;
	}

	public boolean method1671() {
		return false;
	}

	public void method1890(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			i_59_ -= i;
			i_60_ -= i_58_;
			if (i_60_ == 0) {
				if (i_59_ >= 0)
					method9508(i, i_58_, i_59_ + 1, i_61_, i_62_, i_63_, i_64_, i_65_);
				else {
					int i_66_ = i_64_ + i_63_;
					i_65_ %= i_66_;
					i_65_ = i_63_ + i_66_ - i_65_ - (1 + -i_59_) % i_66_;
					i_65_ %= i_66_;
					if (i_65_ < 0)
						i_65_ += i_66_;
					method9508(i_59_ + i, i_58_, 1 + -i_59_, i_61_, i_62_, i_63_, i_64_, i_65_);
				}
			} else if (i_59_ == 0) {
				if (i_60_ >= 0)
					method9509(i, i_58_, 1 + i_60_, i_61_, i_62_, i_63_, i_64_, i_65_);
				else {
					int i_67_ = i_63_ + i_64_;
					i_65_ %= i_67_;
					i_65_ = i_67_ + i_63_ - i_65_ - (-i_60_ + 1) % i_67_;
					i_65_ %= i_67_;
					if (i_65_ < 0)
						i_65_ += i_67_;
					method9509(i, i_58_ + i_60_, -i_60_ + 1, i_61_, i_62_, i_63_, i_64_, i_65_);
				}
			} else {
				i_65_ <<= 8;
				i_63_ <<= 8;
				i_64_ <<= 8;
				int i_68_ = i_64_ + i_63_;
				i_65_ %= i_68_;
				if (i_59_ + i_60_ < 0) {
					int i_69_ = (int) (Math.sqrt((double) (i_60_ * i_60_ + i_59_ * i_59_)) * 256.0);
					int i_70_ = i_69_ % i_68_;
					i_65_ = i_63_ + i_68_ - i_65_ - i_70_;
					i_65_ %= i_68_;
					if (i_65_ < 0)
						i_65_ += i_68_;
					i += i_59_;
					i_59_ = -i_59_;
					i_58_ += i_60_;
					i_60_ = -i_60_;
				}
				if (i_59_ > i_60_) {
					i_58_ <<= 16;
					i_58_ += 32768;
					i_60_ <<= 16;
					int i_71_ = (int) Math.floor(0.5 + ((double) i_60_ / (double) i_59_));
					i_59_ += i;
					int i_72_ = i_61_ >>> 24;
					int i_73_ = (int) Math.sqrt((double) (65536 + (i_71_ >> 8) * (i_71_ >> 8)));
					if (i_62_ == 0 || 1 == i_62_ && 255 == i_72_) {
						while (i <= i_59_) {
							int i_74_ = i_58_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_74_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_74_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_65_ < i_63_)
								((Class106_Sub2) this).anIntArray10218[i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_74_)] = i_61_;
							i_58_ += i_71_;
							i++;
							i_65_ += i_73_;
							i_65_ %= i_68_;
						}
					} else if (1 == i_62_) {
						i_61_ = ((i_72_ << 24) + ((i_72_ * (i_61_ & 0xff00) >> 8 & 0xff00) + ((i_61_ & 0xff00ff) * i_72_ >> 8 & 0xff00ff)));
						int i_75_ = 256 - i_72_;
						while (i <= i_59_) {
							int i_76_ = i_58_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_76_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_76_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_65_ < i_63_) {
								int i_77_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_76_) + i);
								int i_78_ = (((Class106_Sub2) this).anIntArray10218[i_77_]);
								i_78_ = (((i_78_ & 0xff00) * i_75_ >> 8 & 0xff00) + ((i_78_ & 0xff00ff) * i_75_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_77_] = i_78_ + i_61_;
							}
							i_58_ += i_71_;
							i++;
							i_65_ += i_73_;
							i_65_ %= i_68_;
						}
					} else if (2 == i_62_) {
						while (i <= i_59_) {
							int i_79_ = i_58_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_79_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_79_ < 1704244235 * (((Class106_Sub2) this).anInt10223) && i_65_ < i_63_) {
								int i_80_ = i + (i_79_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_81_ = (((Class106_Sub2) this).anIntArray10218[i_80_]);
								int i_82_ = i_61_ + i_81_;
								int i_83_ = (i_81_ & 0xff00ff) + (i_61_ & 0xff00ff);
								i_81_ = ((i_82_ - i_83_ & 0x10000) + (i_83_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_80_] = i_82_ - i_81_ | i_81_ - (i_81_ >>> 8);
							}
							i_58_ += i_71_;
							i++;
							i_65_ += i_73_;
							i_65_ %= i_68_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_59_ <<= 16;
					int i_84_ = (int) Math.floor((double) i_59_ / (double) i_60_ + 0.5);
					i_60_ += i_58_;
					int i_85_ = i_61_ >>> 24;
					int i_86_ = (int) Math.sqrt((double) (65536 + (i_84_ >> 8) * (i_84_ >> 8)));
					if (i_62_ == 0 || i_62_ == 1 && 255 == i_85_) {
						while (i_58_ <= i_60_) {
							int i_87_ = i >> 16;
							if (i_58_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_58_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_87_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_87_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_65_ < i_63_)
								((Class106_Sub2) this).anIntArray10218[i_87_ + i_58_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_61_;
							i += i_84_;
							i_58_++;
							i_65_ += i_86_;
							i_65_ %= i_68_;
						}
					} else if (i_62_ == 1) {
						i_61_ = (((i_61_ & 0xff00ff) * i_85_ >> 8 & 0xff00ff) + ((i_61_ & 0xff00) * i_85_ >> 8 & 0xff00) + (i_85_ << 24));
						int i_88_ = 256 - i_85_;
						while (i_58_ <= i_60_) {
							int i_89_ = i >> 16;
							if (i_58_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_58_ < 1704244235 * (((Class106_Sub2) this).anInt10223) && i_89_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_89_ < 892939761 * (((Class106_Sub2) this).anInt10221) && i_65_ < i_63_) {
								int i_90_ = (i_89_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_58_));
								int i_91_ = (((Class106_Sub2) this).anIntArray10218[i_90_]);
								i_91_ = ((i_88_ * (i_91_ & 0xff00) >> 8 & 0xff00) + ((i_91_ & 0xff00ff) * i_88_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_58_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_89_] = i_91_ + i_61_;
							}
							i += i_84_;
							i_58_++;
							i_65_ += i_86_;
							i_65_ %= i_68_;
						}
					} else if (2 == i_62_) {
						while (i_58_ <= i_60_) {
							int i_92_ = i >> 16;
							if (i_58_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_58_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_92_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_92_ < 892939761 * (((Class106_Sub2) this).anInt10221) && i_65_ < i_63_) {
								int i_93_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_58_) + i_92_);
								int i_94_ = (((Class106_Sub2) this).anIntArray10218[i_93_]);
								int i_95_ = i_94_ + i_61_;
								int i_96_ = (i_94_ & 0xff00ff) + (i_61_ & 0xff00ff);
								i_94_ = ((i_95_ - i_96_ & 0x10000) + (i_96_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_93_] = i_95_ - i_94_ | i_94_ - (i_94_ >>> 8);
							}
							i += i_84_;
							i_58_++;
							i_65_ += i_86_;
							i_65_ %= i_68_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public boolean method1676() {
		return false;
	}

	boolean method1907(int i, int i_97_, int i_98_, int i_99_, Class261 class261, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		return class326.method4147(i, i_97_, i_98_, i_99_, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public void method1919(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			int i_106_ = i_101_ - i;
			int i_107_ = i_102_ - i_100_;
			int i_108_ = i_106_ >= 0 ? i_106_ : -i_106_;
			int i_109_ = i_107_ >= 0 ? i_107_ : -i_107_;
			int i_110_ = i_108_;
			if (i_110_ < i_109_)
				i_110_ = i_109_;
			if (0 != i_110_) {
				int i_111_ = (i_106_ << 16) / i_110_;
				int i_112_ = (i_107_ << 16) / i_110_;
				i_106_ += i_111_ >> 16;
				i_107_ += i_112_ >> 16;
				if (i_112_ <= i_111_)
					i_111_ = -i_111_;
				else
					i_112_ = -i_112_;
				int i_113_ = i_104_ * i_112_ >> 17;
				int i_114_ = 1 + i_104_ * i_112_ >> 17;
				int i_115_ = i_111_ * i_104_ >> 17;
				int i_116_ = 1 + i_111_ * i_104_ >> 17;
				i -= class143.method287();
				i_100_ -= class143.method288();
				int i_117_ = i + i_113_;
				int i_118_ = i - i_114_;
				int i_119_ = i + i_106_ - i_114_;
				int i_120_ = i_113_ + (i + i_106_);
				int i_121_ = i_115_ + i_100_;
				int i_122_ = i_100_ - i_116_;
				int i_123_ = i_107_ + i_100_ - i_116_;
				int i_124_ = i_107_ + i_100_ + i_115_;
				if (0 == i_105_)
					((Class143) class143).anInt19 = 0;
				else if (i_105_ == 1)
					((Class143) class143).anInt19 = 255 - (i_103_ >>> 24);
				else
					throw new IllegalArgumentException();
				method1763(false);
				((Class143) class143).aBoolean20 = (i_117_ < 0 || i_117_ > ((Class143) class143).anInt22 || i_118_ < 0 || i_118_ > ((Class143) class143).anInt22 || i_119_ < 0 || i_119_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_121_, (float) i_122_, (float) i_123_, (float) i_117_, (float) i_118_, (float) i_119_, 100.0F, 100.0F, 100.0F, i_103_);
				((Class143) class143).aBoolean20 = (i_117_ < 0 || i_117_ > ((Class143) class143).anInt22 || i_119_ < 0 || i_119_ > ((Class143) class143).anInt22 || i_120_ < 0 || i_120_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_121_, (float) i_123_, (float) i_124_, (float) i_117_, (float) i_119_, (float) i_120_, 100.0F, 100.0F, 100.0F, i_103_);
				method1763(true);
			}
		}
	}

	public boolean method1674() {
		return false;
	}

	public boolean method1677() {
		return false;
	}

	public boolean method1990() {
		return false;
	}

	public boolean method1679() {
		return false;
	}

	public boolean method1680() {
		return true;
	}

	public String method1681() {
		return "";
	}

	public void method2037(boolean bool) {
		/* empty */
	}

	public Class161 method1916(int i, int i_125_, int i_126_, int i_127_, boolean bool) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_126_ * i_127_];
		int i_128_ = i + i_125_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
		int i_129_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_126_;
		for (int i_130_ = 0; i_130_ < i_127_; i_130_++) {
			int i_131_ = i_126_ * i_130_;
			for (int i_132_ = 0; i_132_ < i_126_; i_132_++)
				is[i_131_ + i_132_] = ((Class106_Sub2) this).anIntArray10218[i_128_++];
			i_128_ += i_129_;
		}
		if (bool)
			return new Class161_Sub3_Sub3(this, is, i_126_, i_127_);
		return new Class161_Sub3_Sub2(this, is, i_126_, i_127_);
	}

	void method9505(int i, int i_133_, int[] is, float[] fs) {
		((Class106_Sub2) this).anInt10217 = i * -254473305;
		((Class106_Sub2) this).anInt10236 = i_133_ * 1344312977;
		((Class106_Sub2) this).anIntArray10218 = is;
		((Class106_Sub2) this).aFloatArray10219 = fs;
		for (int i_134_ = 0; i_134_ < ((Class106_Sub2) this).anInt10225 * -1641029431; i_134_++)
			((Class106_Sub2) this).aClass186Array10213[i_134_].method2845(679597909);
		method1714();
		method1975();
	}

	public void method1690(Class96 class96, float f, Class96 class96_135_, float f_136_, Class96 class96_137_, float f_138_) {
		/* empty */
	}

	public void method2044() {
		/* empty */
	}

	public Class161 method1914(Class87 class87, boolean bool) {
		int i = class87.method1329();
		int i_139_ = class87.method1330();
		Class161_Sub3 class161_sub3;
		if (bool && !class87.method1322() && class87.method1282()) {
			Class87_Sub1 class87_sub1 = (Class87_Sub1) class87;
			int[] is = new int[class87_sub1.anIntArray9967.length];
			byte[] is_140_ = new byte[i_139_ * i];
			for (int i_141_ = 0; i_141_ < i_139_; i_141_++) {
				int i_142_ = i_141_ * i;
				for (int i_143_ = 0; i_143_ < i; i_143_++)
					is_140_[i_143_ + i_142_] = class87_sub1.aByteArray9969[i_142_ + i_143_];
			}
			for (int i_144_ = 0; i_144_ < class87_sub1.anIntArray9967.length; i_144_++)
				is[i_144_] = class87_sub1.anIntArray9967[i_144_];
			class161_sub3 = new Class161_Sub3_Sub1(this, is_140_, is, i, i_139_);
		} else {
			int[] is = class87.method1285(false);
			if (class87.method1322())
				class161_sub3 = new Class161_Sub3_Sub3(this, is, i, i_139_);
			else
				class161_sub3 = new Class161_Sub3_Sub2(this, is, i, i_139_);
		}
		class161_sub3.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161_sub3;
	}

	public boolean method1698() {
		return false;
	}

	Class511 method5214(int i) {
		return aClass94_1396.getTexture(i, 2055660606).aClass511_1342;
	}

	public void method1714() {
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10221 = -1650666873 * ((Class106_Sub2) this).anInt10217;
		((Class106_Sub2) this).anInt10223 = ((Class106_Sub2) this).anInt10236 * 2144570611;
		method9507();
	}

	public boolean method1701() {
		return false;
	}

	public int method1938() {
		return -1;
	}

	public void method1704(int i, int i_145_, int i_146_) {
		/* empty */
	}

	public void method1663(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
				i_148_ -= 1179466163 * ((Class106_Sub2) this).anInt10220 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i_147_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
				i_149_ -= ((Class106_Sub2) this).anInt10222 * 2029354259 - i_147_;
				i_147_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_148_ + i > 892939761 * ((Class106_Sub2) this).anInt10221)
				i_148_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			if (i_147_ + i_149_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_149_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_147_;
			if (i_148_ > 0 && i_149_ > 0 && i <= 892939761 * ((Class106_Sub2) this).anInt10221 && i_147_ <= 1704244235 * ((Class106_Sub2) this).anInt10223) {
				int i_152_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_148_;
				int i_153_ = i + i_147_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				int i_154_ = i_150_ >>> 24;
				if (0 == i_151_ || 1 == i_151_ && 255 == i_154_) {
					int i_155_ = i_148_ >> 3;
					int i_156_ = i_148_ & 0x7;
					i_148_ = i_153_ - 1;
					for (int i_157_ = -i_149_; i_157_ < 0; i_157_++) {
						if (i_155_ > 0) {
							i = i_155_;
							do {
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
							} while (--i > 0);
						}
						if (i_156_ > 0) {
							i = i_156_;
							do
								((Class106_Sub2) this).anIntArray10218[++i_148_] = i_150_;
							while (--i > 0);
						}
						i_148_ += i_152_;
					}
				} else if (1 == i_151_) {
					i_150_ = (((i_150_ & 0xff00ff) * i_154_ >> 8 & 0xff00ff) + (i_154_ * ((i_150_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_158_ = 256 - i_154_;
					for (int i_159_ = 0; i_159_ < i_149_; i_159_++) {
						for (int i_160_ = -i_148_; i_160_ < 0; i_160_++) {
							int i_161_ = (((Class106_Sub2) this).anIntArray10218[i_153_]);
							i_161_ = (((i_161_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + (((i_161_ & ~0xff00ff) >>> 8) * i_158_ & ~0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_153_++] = i_150_ + i_161_;
						}
						i_153_ += i_152_;
					}
				} else if (i_151_ == 2) {
					for (int i_162_ = 0; i_162_ < i_149_; i_162_++) {
						for (int i_163_ = -i_148_; i_163_ < 0; i_163_++) {
							int i_164_ = (((Class106_Sub2) this).anIntArray10218[i_153_]);
							int i_165_ = i_150_ + i_164_;
							int i_166_ = (i_150_ & 0xff00ff) + (i_164_ & 0xff00ff);
							i_164_ = (i_165_ - i_166_ & 0x10000) + (i_166_ & 0x1000100);
							((Class106_Sub2) this).anIntArray10218[i_153_++] = i_165_ - i_164_ | i_164_ - (i_164_ >>> 8);
						}
						i_153_ += i_152_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public long method1705(int i, int i_167_) {
		return 0L;
	}

	public void method1706(long l) {
		/* empty */
	}

	public void method2018() {
		((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		((Class106_Sub2) this).aClass161_10251 = null;
	}

	public Class161 method1915(Class87 class87, boolean bool) {
		int i = class87.method1329();
		int i_168_ = class87.method1330();
		Class161_Sub3 class161_sub3;
		if (bool && !class87.method1322() && class87.method1282()) {
			Class87_Sub1 class87_sub1 = (Class87_Sub1) class87;
			int[] is = new int[class87_sub1.anIntArray9967.length];
			byte[] is_169_ = new byte[i_168_ * i];
			for (int i_170_ = 0; i_170_ < i_168_; i_170_++) {
				int i_171_ = i_170_ * i;
				for (int i_172_ = 0; i_172_ < i; i_172_++)
					is_169_[i_172_ + i_171_] = class87_sub1.aByteArray9969[i_171_ + i_172_];
			}
			for (int i_173_ = 0; i_173_ < class87_sub1.anIntArray9967.length; i_173_++)
				is[i_173_] = class87_sub1.anIntArray9967[i_173_];
			class161_sub3 = new Class161_Sub3_Sub1(this, is_169_, is, i, i_168_);
		} else {
			int[] is = class87.method1285(false);
			if (class87.method1322())
				class161_sub3 = new Class161_Sub3_Sub3(this, is, i, i_168_);
			else
				class161_sub3 = new Class161_Sub3_Sub2(this, is, i, i_168_);
		}
		class161_sub3.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161_sub3;
	}

	public void method1759(Class96 class96, float f, Class96 class96_174_, float f_175_, Class96 class96_176_, float f_177_) {
		/* empty */
	}

	public void method1975() {
		((Class106_Sub2) this).anInt10226 = 0;
		((Class106_Sub2) this).anInt10252 = 0;
		((Class106_Sub2) this).anInt10237 = ((Class106_Sub2) this).anInt10217 * -1646502557;
		((Class106_Sub2) this).anInt10238 = 1817973455 * ((Class106_Sub2) this).anInt10236;
		method9507();
	}

	public void method2004(int i, int i_178_, int i_179_, int i_180_) {
		((Class106_Sub2) this).anInt10226 = 2044040611 * i;
		((Class106_Sub2) this).anInt10252 = 242258385 * i_178_;
		((Class106_Sub2) this).anInt10237 = -165466987 * i_179_;
		((Class106_Sub2) this).anInt10238 = i_180_ * 1561063743;
		method9507();
	}

	public void method1998(float f, float f_181_, float f_182_, float[] fs) {
		float f_183_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * f + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * f_181_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * f_182_));
		float f_184_ = ((f_181_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_182_));
		if (f_183_ < -f_184_ || f_183_ > f_184_) {
			float[] fs_185_ = fs;
			float[] fs_186_ = fs;
			fs[2] = Float.NaN;
			fs_186_[1] = Float.NaN;
			fs_185_[0] = Float.NaN;
		} else {
			float f_187_ = (f_181_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * f_182_));
			if (f_187_ < -f_184_ || f_187_ > f_184_) {
				float[] fs_188_ = fs;
				float[] fs_189_ = fs;
				fs[2] = Float.NaN;
				fs_189_[1] = Float.NaN;
				fs_188_[0] = Float.NaN;
			} else {
				float f_190_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * f_182_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) * f_181_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
				if (f_190_ < -f_184_ || f_190_ > f_184_) {
					float[] fs_191_ = fs;
					float[] fs_192_ = fs;
					fs[2] = Float.NaN;
					fs_192_[1] = Float.NaN;
					fs_191_[0] = Float.NaN;
				} else {
					float f_193_ = ((((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14]) + f * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2]) + f_181_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6]) + f_182_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
					fs[0] = (((Class106_Sub2) this).aFloat10239 * f_187_ / f_184_ + ((Class106_Sub2) this).aFloat10246);
					fs[1] = (((Class106_Sub2) this).aFloat10242 + (f_190_ * ((Class106_Sub2) this).aFloat10241 / f_184_));
					fs[2] = f_193_;
				}
			}
		}
	}

	public void method1713(float f, float f_194_) {
		((Class106_Sub2) this).aFloat10243 = f_194_ - f;
		((Class106_Sub2) this).aFloat10244 = f + f_194_ - 1.0F;
		for (int i = 0; i < -1641029431 * ((Class106_Sub2) this).anInt10225; i++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i];
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aFloat46 = ((Class106_Sub2) this).aFloat10243;
			((Class143) class143).aFloat27 = ((Class106_Sub2) this).aFloat10244;
		}
	}

	void method9507() {
		int i = (892939761 * ((Class106_Sub2) this).anInt10221 - 1179466163 * ((Class106_Sub2) this).anInt10220);
		int i_195_ = (((Class106_Sub2) this).anInt10223 * 1704244235 - ((Class106_Sub2) this).anInt10222 * 2029354259);
		float f = (((Class106_Sub2) this).aFloat10239 = ((float) (-1421066563 * ((Class106_Sub2) this).anInt10237) / 2.0F));
		float f_196_ = (((Class106_Sub2) this).aFloat10241 = ((float) (472284863 * ((Class106_Sub2) this).anInt10238) / 2.0F));
		((Class106_Sub2) this).aFloat10246 = f + (float) (1844987403 * ((Class106_Sub2) this).anInt10226);
		((Class106_Sub2) this).aFloat10242 = (float) (((Class106_Sub2) this).anInt10252 * 645490481) + f_196_;
		for (int i_197_ = 0; i_197_ < -1641029431 * ((Class106_Sub2) this).anInt10225; i_197_++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i_197_];
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aFloat17 = f;
			((Class143) class143).aFloat26 = f_196_;
			((Class143) class143).aFloat23 = (((Class106_Sub2) this).aFloat10246 - (float) (1179466163 * ((Class106_Sub2) this).anInt10220));
			((Class143) class143).aFloat25 = (((Class106_Sub2) this).aFloat10242 - (float) (2029354259 * ((Class106_Sub2) this).anInt10222));
			((Class143) class143).anInt22 = i;
			((Class143) class143).anInt38 = i_195_;
		}
		int i_198_ = (((Class106_Sub2) this).anInt10220 * 1179466163 + (((Class106_Sub2) this).anInt10217 * -994907113 * (((Class106_Sub2) this).anInt10222 * 2029354259)));
		for (int i_199_ = 2029354259 * ((Class106_Sub2) this).anInt10222; i_199_ < 1704244235 * ((Class106_Sub2) this).anInt10223; i_199_++) {
			for (int i_200_ = 0; i_200_ < ((Class106_Sub2) this).anInt10225 * -1641029431; i_200_++)
				((Class143) (((Class186) (((Class106_Sub2) this).aClass186Array10213[i_200_])).aClass143_2187)).anIntArray47[i_199_ - 2029354259 * ((Class106_Sub2) this).anInt10222] = i_198_;
			i_198_ += -994907113 * ((Class106_Sub2) this).anInt10217;
		}
	}

	public void method1710(boolean bool) {
		/* empty */
	}

	public void method1715(int i, int i_201_, int i_202_, int i_203_) {
		if (i < 0)
			i = 0;
		if (i_201_ < 0)
			i_201_ = 0;
		if (i_202_ > -994907113 * ((Class106_Sub2) this).anInt10217)
			i_202_ = ((Class106_Sub2) this).anInt10217 * -994907113;
		if (i_203_ > ((Class106_Sub2) this).anInt10236 * -1733432719)
			i_203_ = -1733432719 * ((Class106_Sub2) this).anInt10236;
		((Class106_Sub2) this).anInt10220 = i * -1154212485;
		((Class106_Sub2) this).anInt10221 = i_202_ * 1219240721;
		((Class106_Sub2) this).anInt10222 = i_201_ * -685124325;
		((Class106_Sub2) this).anInt10223 = i_203_ * -372688989;
		method9507();
	}

	public void method1716(int i, int i_204_, int i_205_, int i_206_) {
		if (((Class106_Sub2) this).anInt10220 * 1179466163 < i)
			((Class106_Sub2) this).anInt10220 = i * -1154212485;
		if (2029354259 * ((Class106_Sub2) this).anInt10222 < i_204_)
			((Class106_Sub2) this).anInt10222 = -685124325 * i_204_;
		if (((Class106_Sub2) this).anInt10221 * 892939761 > i_205_)
			((Class106_Sub2) this).anInt10221 = i_205_ * 1219240721;
		if (1704244235 * ((Class106_Sub2) this).anInt10223 > i_206_)
			((Class106_Sub2) this).anInt10223 = -372688989 * i_206_;
		method9507();
	}

	public Class572_Sub36 method1939(int i, int i_207_, int i_208_, int i_209_, int i_210_, float f) {
		return null;
	}

	public void method1719(int i, int i_211_) {
		if (0 != (i & 0x1))
			method1725(0, 0, -994907113 * ((Class106_Sub2) this).anInt10217, -1733432719 * ((Class106_Sub2) this).anInt10236, i_211_, 0);
		if ((i & 0x2) != 0)
			method9518();
	}

	public void method1724(int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_) {
		method1728(i, i_212_, i_213_, i_215_, i_216_);
		method1728(i, i_212_ + i_214_ - 1, i_213_, i_215_, i_216_);
		method1678(i, i_212_ + 1, i_214_ - 2, i_215_, i_216_);
		method1678(i + i_213_ - 1, 1 + i_212_, i_214_ - 2, i_215_, i_216_);
	}

	public void method2046(float f, float f_217_, float f_218_, float[] fs) {
		float f_219_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * f + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * f_217_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * f_218_));
		float f_220_ = ((f_217_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_218_));
		if (f_219_ < -f_220_ || f_219_ > f_220_) {
			float[] fs_221_ = fs;
			float[] fs_222_ = fs;
			fs[2] = Float.NaN;
			fs_222_[1] = Float.NaN;
			fs_221_[0] = Float.NaN;
		} else {
			float f_223_ = (f_217_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * f_218_));
			if (f_223_ < -f_220_ || f_223_ > f_220_) {
				float[] fs_224_ = fs;
				float[] fs_225_ = fs;
				fs[2] = Float.NaN;
				fs_225_[1] = Float.NaN;
				fs_224_[0] = Float.NaN;
			} else {
				float f_226_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * f_218_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) * f_217_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
				if (f_226_ < -f_220_ || f_226_ > f_220_) {
					float[] fs_227_ = fs;
					float[] fs_228_ = fs;
					fs[2] = Float.NaN;
					fs_228_[1] = Float.NaN;
					fs_227_[0] = Float.NaN;
				} else {
					float f_229_ = ((((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14]) + f * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2]) + f_217_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6]) + f_218_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
					fs[0] = (((Class106_Sub2) this).aFloat10239 * f_223_ / f_220_ + ((Class106_Sub2) this).aFloat10246);
					fs[1] = (((Class106_Sub2) this).aFloat10242 + (f_226_ * ((Class106_Sub2) this).aFloat10241 / f_220_));
					fs[2] = f_229_;
				}
			}
		}
	}

	public void method1806(int i) {
		int i_230_ = i - ((Class106_Sub2) this).anInt10214 * 1320402341;
		for (Class572_Sub38 class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2249(769962827); null != class572_sub38; class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2238(-1696456396)) {
			if (((Class572_Sub38) class572_sub38).aBool9386) {
				((Class572_Sub38) class572_sub38).anInt9384 += i_230_;
				int i_231_ = ((Class572_Sub38) class572_sub38).anInt9384 / 50;
				if (i_231_ > 0) {
					MaterialInformation class101 = aClass94_1396.getTexture(((Class572_Sub38) class572_sub38).anInt9387, 746246008);
					float f = (float) (1913535271 * class101.anInt1338);
					class572_sub38.method8764((int) (f * ((float) class101.textureSpeedU * ((float) i_230_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_230_ / 1000.0F * (float) class101.textureSpeedV / 64.0F)));
					((Class572_Sub38) class572_sub38).anInt9384 -= i_231_ * 50;
				}
				((Class572_Sub38) class572_sub38).aBool9386 = false;
			}
		}
		((Class106_Sub2) this).anInt10214 = i * 1884086829;
		((Class106_Sub2) this).aClass127_10248.method2235(5, 1914642863);
		((Class106_Sub2) this).aClass127_10247.method2235(5, 1448863870);
	}

	Class106_Sub2(Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, int i, int i_232_) {
		this(mapSize, interface5, interface35, interface36, interface37);
		try {
			method1685(canvas, i, i_232_, -1400653395);
			method1688(canvas, (byte) 13);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-1567573373);
			throw new RuntimeException("");
		}
	}

	void method9508(int i, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i_233_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_233_ < ((Class106_Sub2) this).anInt10223 * 1704244235)) {
			int i_240_ = -994907113 * ((Class106_Sub2) this).anInt10217 * i_233_ + i;
			int i_241_ = i_235_ >>> 24;
			int i_242_ = i_238_ + i_237_;
			int i_243_ = i_239_ % i_242_;
			if (i_236_ == 0 || 1 == i_236_ && i_241_ == 255) {
				int i_244_ = 0;
				while (i_244_ < i_234_) {
					if ((i_244_ + i >= ((Class106_Sub2) this).anInt10220 * 1179466163) && (i_244_ + i < 892939761 * ((Class106_Sub2) this).anInt10221) && i_243_ < i_237_)
						((Class106_Sub2) this).anIntArray10218[i_244_ + i_240_] = i_235_;
					i_244_++;
					i_243_ = ++i_243_ % i_242_;
				}
			} else if (1 == i_236_) {
				i_235_ = (((i_235_ & 0xff00) * i_241_ >> 8 & 0xff00) + (i_241_ * (i_235_ & 0xff00ff) >> 8 & 0xff00ff) + (i_241_ << 24));
				int i_245_ = 256 - i_241_;
				int i_246_ = 0;
				while (i_246_ < i_234_) {
					if ((i + i_246_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && (i_246_ + i < 892939761 * ((Class106_Sub2) this).anInt10221) && i_243_ < i_237_) {
						int i_247_ = (((Class106_Sub2) this).anIntArray10218[i_240_ + i_246_]);
						i_247_ = ((i_245_ * (i_247_ & 0xff00ff) >> 8 & 0xff00ff) + (i_245_ * (i_247_ & 0xff00) >> 8 & 0xff00));
						((Class106_Sub2) this).anIntArray10218[i_240_ + i_246_] = i_247_ + i_235_;
					}
					i_246_++;
					i_243_ = ++i_243_ % i_242_;
				}
			} else if (2 == i_236_) {
				int i_248_ = 0;
				while (i_248_ < i_234_) {
					if ((i_248_ + i >= ((Class106_Sub2) this).anInt10220 * 1179466163) && (i + i_248_ < 892939761 * ((Class106_Sub2) this).anInt10221) && i_243_ < i_237_) {
						int i_249_ = (((Class106_Sub2) this).anIntArray10218[i_240_ + i_248_]);
						int i_250_ = i_249_ + i_235_;
						int i_251_ = (i_249_ & 0xff00ff) + (i_235_ & 0xff00ff);
						i_249_ = (i_251_ & 0x1000100) + (i_250_ - i_251_ & 0x10000);
						((Class106_Sub2) this).anIntArray10218[i_248_ + i_240_] = i_250_ - i_249_ | i_249_ - (i_249_ >>> 8);
					}
					i_248_++;
					i_243_ = ++i_243_ % i_242_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class103 method1963(int i) {
		return null;
	}

	void method9509(int i, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_, int i_258_) {
		if (null != ((Class106_Sub2) this).anIntArray10218 && (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < 892939761 * ((Class106_Sub2) this).anInt10221)) {
			int i_259_ = i + i_252_ * (((Class106_Sub2) this).anInt10217 * -994907113);
			int i_260_ = i_254_ >>> 24;
			int i_261_ = i_257_ + i_256_;
			int i_262_ = i_258_ % i_261_;
			if (0 == i_255_ || 1 == i_255_ && 255 == i_260_) {
				int i_263_ = 0;
				while (i_263_ < i_253_) {
					if ((i_263_ + i_252_ >= ((Class106_Sub2) this).anInt10222 * 2029354259) && (i_252_ + i_263_ < ((Class106_Sub2) this).anInt10223 * 1704244235) && i_262_ < i_256_)
						((Class106_Sub2) this).anIntArray10218[(-994907113 * ((Class106_Sub2) this).anInt10217 * i_263_) + i_259_] = i_254_;
					i_263_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else if (i_255_ == 1) {
				i_254_ = (i_260_ << 24) + ((i_260_ * (i_254_ & 0xff00) >> 8 & 0xff00) + ((i_254_ & 0xff00ff) * i_260_ >> 8 & 0xff00ff));
				int i_264_ = 256 - i_260_;
				int i_265_ = 0;
				while (i_265_ < i_253_) {
					if ((i_252_ + i_265_ >= ((Class106_Sub2) this).anInt10222 * 2029354259) && (i_265_ + i_252_ < 1704244235 * ((Class106_Sub2) this).anInt10223) && i_262_ < i_256_) {
						int i_266_ = (i_265_ * (-994907113 * ((Class106_Sub2) this).anInt10217) + i_259_);
						int i_267_ = ((Class106_Sub2) this).anIntArray10218[i_266_];
						i_267_ = (((i_267_ & 0xff00) * i_264_ >> 8 & 0xff00) + ((i_267_ & 0xff00ff) * i_264_ >> 8 & 0xff00ff));
						((Class106_Sub2) this).anIntArray10218[i_266_] = i_267_ + i_254_;
					}
					i_265_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else if (2 == i_255_) {
				int i_268_ = 0;
				while (i_268_ < i_253_) {
					if ((i_268_ + i_252_ >= 2029354259 * ((Class106_Sub2) this).anInt10222) && (i_252_ + i_268_ < 1704244235 * ((Class106_Sub2) this).anInt10223) && i_262_ < i_256_) {
						int i_269_ = i_259_ + (((Class106_Sub2) this).anInt10217 * -994907113 * i_268_);
						int i_270_ = ((Class106_Sub2) this).anIntArray10218[i_269_];
						int i_271_ = i_270_ + i_254_;
						int i_272_ = (i_254_ & 0xff00ff) + (i_270_ & 0xff00ff);
						i_270_ = (i_271_ - i_272_ & 0x10000) + (i_272_ & 0x1000100);
						((Class106_Sub2) this).anIntArray10218[i_269_] = i_271_ - i_270_ | i_270_ - (i_270_ >>> 8);
					}
					i_268_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1792(float f, float f_273_, float f_274_, float[] fs) {
		float f_275_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * f + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * f_273_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * f_274_));
		float f_276_ = ((f_273_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_274_));
		if (f_275_ < -f_276_ || f_275_ > f_276_) {
			float[] fs_277_ = fs;
			float[] fs_278_ = fs;
			fs[2] = Float.NaN;
			fs_278_[1] = Float.NaN;
			fs_277_[0] = Float.NaN;
		} else {
			float f_279_ = (f_273_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * f_274_));
			if (f_279_ < -f_276_ || f_279_ > f_276_) {
				float[] fs_280_ = fs;
				float[] fs_281_ = fs;
				fs[2] = Float.NaN;
				fs_281_[1] = Float.NaN;
				fs_280_[0] = Float.NaN;
			} else {
				float f_282_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * f_274_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) * f_273_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
				if (f_282_ < -f_276_ || f_282_ > f_276_) {
					float[] fs_283_ = fs;
					float[] fs_284_ = fs;
					fs[2] = Float.NaN;
					fs_284_[1] = Float.NaN;
					fs_283_[0] = Float.NaN;
				} else {
					float f_285_ = ((((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14]) + f * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2]) + f_273_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6]) + f_274_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
					fs[0] = (((Class106_Sub2) this).aFloat10239 * f_279_ / f_276_ + ((Class106_Sub2) this).aFloat10246);
					fs[1] = (((Class106_Sub2) this).aFloat10242 + (f_282_ * ((Class106_Sub2) this).aFloat10241 / f_276_));
					fs[2] = f_285_;
				}
			}
		}
	}

	public void method1730(int i, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			i_287_ -= i;
			i_288_ -= i_286_;
			if (0 == i_288_) {
				if (i_287_ >= 0)
					method1728(i, i_286_, i_287_ + 1, i_289_, i_290_);
				else
					method1728(i + i_287_, i_286_, 1 + -i_287_, i_289_, i_290_);
			} else if (i_287_ == 0) {
				if (i_288_ >= 0)
					method1678(i, i_286_, 1 + i_288_, i_289_, i_290_);
				else
					method1678(i, i_286_ + i_288_, -i_288_ + 1, i_289_, i_290_);
			} else {
				if (i_287_ + i_288_ < 0) {
					i += i_287_;
					i_287_ = -i_287_;
					i_286_ += i_288_;
					i_288_ = -i_288_;
				}
				if (i_287_ > i_288_) {
					i_286_ <<= 16;
					i_286_ += 32768;
					i_288_ <<= 16;
					int i_291_ = (int) Math.floor((double) i_288_ / (double) i_287_ + 0.5);
					i_287_ += i;
					if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
						i_286_ += (1179466163 * ((Class106_Sub2) this).anInt10220 - i) * i_291_;
						i = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (i_287_ >= 892939761 * ((Class106_Sub2) this).anInt10221)
						i_287_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_292_ = i_289_ >>> 24;
					if (i_290_ == 0 || 1 == i_290_ && 255 == i_292_) {
						for (/**/; i <= i_287_; i++) {
							int i_293_ = i_286_ >> 16;
							if (i_293_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_293_ < (((Class106_Sub2) this).anInt10223 * 1704244235))
								((Class106_Sub2) this).anIntArray10218[i + (i_293_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_289_;
							i_286_ += i_291_;
						}
					} else if (i_290_ == 1) {
						i_289_ = (((i_289_ & 0xff00) * i_292_ >> 8 & 0xff00) + (i_292_ * (i_289_ & 0xff00ff) >> 8 & 0xff00ff) + (i_292_ << 24));
						int i_294_ = 256 - i_292_;
						for (/**/; i <= i_287_; i++) {
							int i_295_ = i_286_ >> 16;
							if (i_295_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_295_ < 1704244235 * ((Class106_Sub2) this).anInt10223) {
								int i_296_ = i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_295_);
								int i_297_ = (((Class106_Sub2) this).anIntArray10218[i_296_]);
								i_297_ = (((i_297_ & 0xff00) * i_294_ >> 8 & 0xff00) + ((i_297_ & 0xff00ff) * i_294_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_296_] = i_297_ + i_289_;
							}
							i_286_ += i_291_;
						}
					} else if (2 == i_290_) {
						for (/**/; i <= i_287_; i++) {
							int i_298_ = i_286_ >> 16;
							if (i_298_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_298_ < (((Class106_Sub2) this).anInt10223 * 1704244235)) {
								int i_299_ = (((Class106_Sub2) this).anInt10217 * -994907113 * i_298_) + i;
								int i_300_ = (((Class106_Sub2) this).anIntArray10218[i_299_]);
								int i_301_ = i_300_ + i_289_;
								int i_302_ = ((i_300_ & 0xff00ff) + (i_289_ & 0xff00ff));
								i_300_ = (i_302_ & 0x1000100) + (i_301_ - i_302_ & 0x10000);
								((Class106_Sub2) this).anIntArray10218[i_299_] = i_301_ - i_300_ | i_300_ - (i_300_ >>> 8);
							}
							i_286_ += i_291_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_287_ <<= 16;
					int i_303_ = (int) Math.floor((double) i_287_ / (double) i_288_ + 0.5);
					i_288_ += i_286_;
					if (i_286_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
						i += (i_303_ * (((Class106_Sub2) this).anInt10222 * 2029354259 - i_286_));
						i_286_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
					}
					if (i_288_ >= ((Class106_Sub2) this).anInt10223 * 1704244235)
						i_288_ = (1704244235 * ((Class106_Sub2) this).anInt10223 - 1);
					int i_304_ = i_289_ >>> 24;
					if (0 == i_290_ || 1 == i_290_ && i_304_ == 255) {
						for (/**/; i_286_ <= i_288_; i_286_++) {
							int i_305_ = i >> 16;
							if (i_305_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_305_ < (((Class106_Sub2) this).anInt10221 * 892939761))
								((Class106_Sub2) this).anIntArray10218[(-994907113 * ((Class106_Sub2) this).anInt10217 * i_286_) + i_305_] = i_289_;
							i += i_303_;
						}
					} else if (1 == i_290_) {
						i_289_ = ((i_304_ << 24) + (((i_289_ & 0xff00) * i_304_ >> 8 & 0xff00) + (i_304_ * (i_289_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_306_ = 256 - i_304_;
						for (/**/; i_286_ <= i_288_; i_286_++) {
							int i_307_ = i >> 16;
							if (i_307_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_307_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_308_ = (i_307_ + (i_286_ * (((Class106_Sub2) this).anInt10217 * -994907113)));
								int i_309_ = (((Class106_Sub2) this).anIntArray10218[i_308_]);
								i_309_ = ((i_306_ * (i_309_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_309_ & 0xff00) * i_306_ >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[(i_286_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_307_] = i_289_ + i_309_;
							}
							i += i_303_;
						}
					} else if (2 == i_290_) {
						for (/**/; i_286_ <= i_288_; i_286_++) {
							int i_310_ = i >> 16;
							if (i_310_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_310_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_311_ = (i_310_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_286_));
								int i_312_ = (((Class106_Sub2) this).anIntArray10218[i_311_]);
								int i_313_ = i_289_ + i_312_;
								int i_314_ = ((i_289_ & 0xff00ff) + (i_312_ & 0xff00ff));
								i_312_ = ((i_313_ - i_314_ & 0x10000) + (i_314_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_311_] = i_313_ - i_312_ | i_312_ - (i_312_ >>> 8);
							}
							i += i_303_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1745(float f) {
		((Class106_Sub2) this).anInt10235 = (int) (65535.0F * f) * -24827737;
	}

	public Class261 method1936() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass261_2186;
	}

	public void method1950(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			int i_321_ = i_316_ - i;
			int i_322_ = i_317_ - i_315_;
			int i_323_ = i_321_ >= 0 ? i_321_ : -i_321_;
			int i_324_ = i_322_ >= 0 ? i_322_ : -i_322_;
			int i_325_ = i_323_;
			if (i_325_ < i_324_)
				i_325_ = i_324_;
			if (0 != i_325_) {
				int i_326_ = (i_321_ << 16) / i_325_;
				int i_327_ = (i_322_ << 16) / i_325_;
				i_321_ += i_326_ >> 16;
				i_322_ += i_327_ >> 16;
				if (i_327_ <= i_326_)
					i_326_ = -i_326_;
				else
					i_327_ = -i_327_;
				int i_328_ = i_319_ * i_327_ >> 17;
				int i_329_ = 1 + i_319_ * i_327_ >> 17;
				int i_330_ = i_326_ * i_319_ >> 17;
				int i_331_ = 1 + i_326_ * i_319_ >> 17;
				i -= class143.method287();
				i_315_ -= class143.method288();
				int i_332_ = i + i_328_;
				int i_333_ = i - i_329_;
				int i_334_ = i + i_321_ - i_329_;
				int i_335_ = i_328_ + (i + i_321_);
				int i_336_ = i_330_ + i_315_;
				int i_337_ = i_315_ - i_331_;
				int i_338_ = i_322_ + i_315_ - i_331_;
				int i_339_ = i_322_ + i_315_ + i_330_;
				if (0 == i_320_)
					((Class143) class143).anInt19 = 0;
				else if (i_320_ == 1)
					((Class143) class143).anInt19 = 255 - (i_318_ >>> 24);
				else
					throw new IllegalArgumentException();
				method1763(false);
				((Class143) class143).aBoolean20 = (i_332_ < 0 || i_332_ > ((Class143) class143).anInt22 || i_333_ < 0 || i_333_ > ((Class143) class143).anInt22 || i_334_ < 0 || i_334_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_336_, (float) i_337_, (float) i_338_, (float) i_332_, (float) i_333_, (float) i_334_, 100.0F, 100.0F, 100.0F, i_318_);
				((Class143) class143).aBoolean20 = (i_332_ < 0 || i_332_ > ((Class143) class143).anInt22 || i_334_ < 0 || i_334_ > ((Class143) class143).anInt22 || i_335_ < 0 || i_335_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_336_, (float) i_338_, (float) i_339_, (float) i_332_, (float) i_334_, (float) i_335_, 100.0F, 100.0F, 100.0F, i_318_);
				method1763(true);
			}
		}
	}

	public int method1797(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_) {
		int i_345_ = 0;
		float f = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_340_) + (float) i_341_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10]));
		float f_346_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * (float) i_342_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_343_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * (float) i_344_));
		float f_347_ = (((float) i_341_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_340_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]))));
		float f_348_ = (((float) i_344_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_343_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3] * (float) i_342_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15]))));
		if (f < -f_347_ && f_346_ < -f_348_)
			i_345_ |= 0x10;
		else if (f > f_347_ && f_346_ > f_348_)
			i_345_ |= 0x20;
		float f_349_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * (float) i_340_) + (((float) i * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * (float) i_341_));
		float f_350_ = (((float) i_344_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (((float) i_343_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) * (float) i_342_)));
		if (f_349_ < -f_347_ && f_350_ < -f_348_)
			i_345_ |= 0x1;
		if (f_349_ > f_347_ && f_350_ > f_348_)
			i_345_ |= 0x2;
		float f_351_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_340_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_341_));
		float f_352_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i_342_) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_343_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_344_));
		if (f_351_ < -f_347_ && f_352_ < -f_348_)
			i_345_ |= 0x4;
		if (f_351_ > f_347_ && f_352_ > f_348_)
			i_345_ |= 0x8;
		return i_345_;
	}

	public Class161 method1821(int i, int i_353_, int i_354_, int i_355_, boolean bool) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_354_ * i_355_];
		int i_356_ = i + i_353_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
		int i_357_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_354_;
		for (int i_358_ = 0; i_358_ < i_355_; i_358_++) {
			int i_359_ = i_354_ * i_358_;
			for (int i_360_ = 0; i_360_ < i_354_; i_360_++)
				is[i_359_ + i_360_] = ((Class106_Sub2) this).anIntArray10218[i_356_++];
			i_356_ += i_357_;
		}
		if (bool)
			return new Class161_Sub3_Sub3(this, is, i_354_, i_355_);
		return new Class161_Sub3_Sub2(this, is, i_354_, i_355_);
	}

	public void method1738(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		class90.method1511(class326, ((Class106_Sub2) this).aClass250_10232, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public Class572_Sub35 method1739(int i) {
		return null;
	}

	public void method1740(Class572_Sub35 class572_sub35) {
		/* empty */
	}

	public Interface11 method1694(int i, int i_361_) {
		return new Class151(i, i_361_);
	}

	public Class161 method1957(int[] is, int i, int i_362_, int i_363_, int i_364_, boolean bool) {
		boolean bool_365_ = false;
		int i_366_ = i;
		while_43_: for (int i_367_ = 0; i_367_ < i_364_; i_367_++) {
			for (int i_368_ = 0; i_368_ < i_363_; i_368_++) {
				int i_369_ = is[i_366_++] >>> 24;
				if (i_369_ != 0 && i_369_ != 255) {
					bool_365_ = true;
					break while_43_;
				}
			}
		}
		if (bool_365_)
			return new Class161_Sub3_Sub3(this, is, i, i_362_, i_363_, i_364_, bool);
		return new Class161_Sub3_Sub2(this, is, i, i_362_, i_363_, i_364_, bool);
	}

	public Class161 method1711(Class87 class87, boolean bool) {
		int i = class87.method1329();
		int i_370_ = class87.method1330();
		Class161_Sub3 class161_sub3;
		if (bool && !class87.method1322() && class87.method1282()) {
			Class87_Sub1 class87_sub1 = (Class87_Sub1) class87;
			int[] is = new int[class87_sub1.anIntArray9967.length];
			byte[] is_371_ = new byte[i_370_ * i];
			for (int i_372_ = 0; i_372_ < i_370_; i_372_++) {
				int i_373_ = i_372_ * i;
				for (int i_374_ = 0; i_374_ < i; i_374_++)
					is_371_[i_374_ + i_373_] = class87_sub1.aByteArray9969[i_373_ + i_374_];
			}
			for (int i_375_ = 0; i_375_ < class87_sub1.anIntArray9967.length; i_375_++)
				is[i_375_] = class87_sub1.anIntArray9967[i_375_];
			class161_sub3 = new Class161_Sub3_Sub1(this, is_371_, is, i, i_370_);
		} else {
			int[] is = class87.method1285(false);
			if (class87.method1322())
				class161_sub3 = new Class161_Sub3_Sub3(this, is, i, i_370_);
			else
				class161_sub3 = new Class161_Sub3_Sub2(this, is, i, i_370_);
		}
		class161_sub3.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161_sub3;
	}

	public boolean method2042() {
		return false;
	}

	public Model method1925(Class159 class159, int i, int i_376_, int i_377_, int i_378_) {
		return new Class89_Sub2(this, class159, i, i_377_, i_378_, i_376_);
	}

	void method1728(int i, int i_379_, int i_380_, int i_381_, int i_382_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i_379_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_379_ < 1704244235 * ((Class106_Sub2) this).anInt10223)) {
			if (i < ((Class106_Sub2) this).anInt10220 * 1179466163) {
				i_380_ -= ((Class106_Sub2) this).anInt10220 * 1179466163 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i + i_380_ > ((Class106_Sub2) this).anInt10221 * 892939761)
				i_380_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			int i_383_ = i + ((Class106_Sub2) this).anInt10217 * -994907113 * i_379_;
			int i_384_ = i_381_ >>> 24;
			if (0 == i_382_ || i_382_ == 1 && 255 == i_384_) {
				for (int i_385_ = 0; i_385_ < i_380_; i_385_++)
					((Class106_Sub2) this).anIntArray10218[i_383_ + i_385_] = i_381_;
			} else if (i_382_ == 1) {
				i_381_ = ((i_384_ << 24) + ((i_384_ * (i_381_ & 0xff00ff) >> 8 & 0xff00ff) + (i_384_ * (i_381_ & 0xff00) >> 8 & 0xff00)));
				int i_386_ = 256 - i_384_;
				for (int i_387_ = 0; i_387_ < i_380_; i_387_++) {
					int i_388_ = (((Class106_Sub2) this).anIntArray10218[i_387_ + i_383_]);
					i_388_ = (((i_388_ & 0xff00ff) * i_386_ >> 8 & 0xff00ff) + (i_386_ * (i_388_ & 0xff00) >> 8 & 0xff00));
					((Class106_Sub2) this).anIntArray10218[i_387_ + i_383_] = i_381_ + i_388_;
				}
			} else if (i_382_ == 2) {
				for (int i_389_ = 0; i_389_ < i_380_; i_389_++) {
					int i_390_ = (((Class106_Sub2) this).anIntArray10218[i_383_ + i_389_]);
					int i_391_ = i_390_ + i_381_;
					int i_392_ = (i_381_ & 0xff00ff) + (i_390_ & 0xff00ff);
					i_390_ = (i_391_ - i_392_ & 0x10000) + (i_392_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_383_ + i_389_] = i_391_ - i_390_ | i_390_ - (i_390_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class102 method1751(Class284 class284, Class87[] class87s, boolean bool) {
		int[] is = new int[class87s.length];
		int[] is_393_ = new int[class87s.length];
		boolean bool_394_ = false;
		boolean bool_395_ = false;
		for (int i = 0; i < class87s.length; i++) {
			is[i] = class87s[i].method1329();
			is_393_[i] = class87s[i].method1330();
			if (class87s[i].method1322())
				bool_394_ = true;
			if (class87s[i].method1282())
				bool_395_ = true;
		}
		if (bool) {
			if (bool_395_) {
				if (bool_394_)
					return new Class102_Sub2(this, class284, (Class87_Sub1[]) class87s, is, is_393_);
				return new Class102_Sub5(this, class284, (Class87_Sub1[]) class87s, is, is_393_);
			}
			if (bool_394_)
				return new Class102_Sub2(this, class284, (Class87_Sub2[]) class87s, is, is_393_);
			return new Class102_Sub5(this, class284, (Class87_Sub2[]) class87s, is, is_393_);
		}
		if (bool_395_) {
			if (bool_394_)
				throw new IllegalArgumentException("");
			return new Class102_Sub4(this, class284, (Class87_Sub1[]) class87s, is, is_393_);
		}
		return new Class102_Sub3(this, class284, (Class87_Sub2[]) class87s, is, is_393_);
	}

	public void method1754(int i) {
		Class89_Sub2.anInt10555 = Class89_Sub2.anInt10629 = i;
		if (((Class106_Sub2) this).anInt10225 * -1641029431 > 1)
			throw new IllegalStateException();
		method9511(((Class106_Sub2) this).anInt10225 * -1641029431);
		method9510(0);
	}

	public Model method1755(Class159 class159, int i, int i_396_, int i_397_, int i_398_) {
		return new Class89_Sub2(this, class159, i, i_397_, i_398_, i_396_);
	}

	public int method1756(int i, int i_399_) {
		i |= 0x20800;
		return i & i_399_ ^ i_399_;
	}

	public boolean method1843() {
		return false;
	}

	void method1743(int i, int i_400_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9923(i, i_400_);
		if (null != anInterface5_1408)
			anInterface5_1408.method22((byte) -27);
	}

	public Class250 method1752() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	public Class261 method1753() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass261_2186;
	}

	public int method1849() {
		return 0;
	}

	public Class572_Sub36 method2051(int i, int i_401_, int i_402_, int i_403_, int i_404_, float f) {
		return null;
	}

	public void method1763(boolean bool) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).aBoolean207 = bool;
	}

	void method9510(int i) {
		((Class106_Sub2) this).aClass186Array10213[i].method2848(Thread.currentThread(), (byte) -116);
	}

	void method9511(int i) {
		((Class106_Sub2) this).anInt10225 = 1791113593 * i;
		((Class106_Sub2) this).aClass186Array10213 = new Class186[-1641029431 * ((Class106_Sub2) this).anInt10225];
		for (int i_405_ = 0; i_405_ < ((Class106_Sub2) this).anInt10225 * -1641029431; i_405_++)
			((Class106_Sub2) this).aClass186Array10213[i_405_] = new Class186(this);
	}

	Class186 method9512(Runnable runnable) {
		for (int i = 0; i < ((Class106_Sub2) this).anInt10225 * -1641029431; i++) {
			if ((((Class186) ((Class106_Sub2) this).aClass186Array10213[i]).aRunnable2199) == runnable)
				return ((Class106_Sub2) this).aClass186Array10213[i];
		}
		return null;
	}

	public void method1760(Class105 class105) {
		method9513(null != ((Class106_Sub2) this).anIntArray10218, ((Class106_Sub2) this).aFloatArray10219 != null, false, class105);
	}

	void method9513(boolean bool, boolean bool_406_, boolean bool_407_, Class105 class105) {
		Class186 class186 = method9512(Thread.currentThread());
		for (Class591_Sub2_Sub1 class591_sub2_sub1 = ((Class591_Sub2_Sub1) class105.aClass657_1385.method7729((byte) -6)); null != class591_sub2_sub1; class591_sub2_sub1 = ((Class591_Sub2_Sub1) class105.aClass657_1385.method7731((byte) 0))) {
			int i = class591_sub2_sub1.anInt10970 >> 12;
			int i_408_ = class591_sub2_sub1.anInt10973 >> 12;
			int i_409_ = class591_sub2_sub1.anInt10975 >> 12;
			float f = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * (float) i_409_) + ((float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6]) * (float) i_408_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14]));
			float f_410_ = ((float) i_409_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + ((float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) * (float) i_408_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15]));
			if (!(f < -f_410_)) {
				float f_411_ = (((Class106_Sub2) this).aFloat10244 + ((Class106_Sub2) this).aFloat10243 * f / f_410_);
				if (!(f > ((Class186) class186).aFloat2177)) {
					float f_412_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) * (float) i + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) * (float) i_408_ + (float) i_409_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]));
					float f_413_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]) * (float) i + (float) i_408_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * (float) i_409_));
					if (!(f_412_ < -f_410_) && !(f_412_ > f_410_) && !(f_413_ < -f_410_) && !(f_413_ > f_410_)) {
						float f_414_ = (float) class591_sub2_sub1.anInt10976 / 4096.0F;
						float f_415_ = f_412_ + (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[0]) * f_414_;
						float f_416_ = (f_414_ * (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[3]) + f_410_);
						float f_417_ = ((f_412_ * ((Class106_Sub2) this).aFloat10239 / f_410_) + ((Class106_Sub2) this).aFloat10246);
						float f_418_ = (((Class106_Sub2) this).aFloat10242 + (f_413_ * ((Class106_Sub2) this).aFloat10241 / f_410_));
						float f_419_ = ((f_415_ * ((Class106_Sub2) this).aFloat10239 / f_416_) + ((Class106_Sub2) this).aFloat10246);
						method9514(bool, bool_406_, bool_407_, class591_sub2_sub1, (int) f_417_, (int) f_418_, f_411_, (int) (f_419_ < f_417_ ? f_417_ - f_419_ : f_419_ - f_417_));
					}
				}
			}
		}
	}

	void method9514(boolean bool, boolean bool_420_, boolean bool_421_, Class591_Sub2_Sub1 class591_sub2_sub1, int i, int i_422_, float f, int i_423_) {
		int i_424_ = class591_sub2_sub1.anInt10972;
		int i_425_ = i_423_;
		i_423_ <<= 1;
		if (-1 == i_424_)
			method9516(bool_420_, i, i_422_, f, i_425_, class591_sub2_sub1.anInt10974, 1);
		else {
			if (i_424_ != -746695405 * ((Class106_Sub2) this).anInt10240) {
				Class161 class161 = (Class161) ((Class106_Sub2) this).aClass127_10248.method2246((long) i_424_);
				if (null == class161) {
					MaterialInformation class101 = aClass94_1396.getTexture(i_424_, 1792319260);
					int[] is = method5197(i_424_, 811137757 * class101.textureId);
					if (null != is) {
						int i_426_ = 1913535271 * class101.anInt1338;
						class161 = method1744(is, 0, i_426_, i_426_, i_426_, -966114879);
						((Class106_Sub2) this).aClass127_10248.method2229(class161, (long) i_424_);
					} else
						return;
				}
				((Class106_Sub2) this).anInt10240 = i_424_ * 1634385179;
				((Class106_Sub2) this).aClass161_10249 = class161;
			}
			i_423_++;
			((Class161_Sub3) ((Class106_Sub2) this).aClass161_10249).method10050(bool, bool_420_, bool_421_, i - i_425_, i_422_ - i_425_, f, i_423_, i_423_, 0, class591_sub2_sub1.anInt10974, 1, 1, false);
		}
	}

	void method9515(boolean bool, boolean bool_427_, boolean bool_428_, int i, int i_429_, float f, int i_430_, int i_431_, short i_432_, int i_433_, int i_434_, int i_435_) {
		if (i_430_ != 0 && 0 != i_431_) {
			if (-1 != i_432_) {
				MaterialInformation class101 = aClass94_1396.getTexture(i_432_, 1004766597);
				if (!class101.aBool1350) {
					if (((Class106_Sub2) this).anInt10240 * -746695405 != i_432_) {
						Class161 class161 = (Class161) ((Class106_Sub2) this).aClass127_10248.method2246((long) i_432_);
						if (null == class161) {
							int[] is = method5197(i_432_, class101.textureId * 811137757);
							if (is == null)
								return;
							int i_436_ = class101.anInt1338 * 1913535271;
							class161 = method1744(is, 0, i_436_, i_436_, i_436_, -544122582);
							((Class106_Sub2) this).aClass127_10248.method2229(class161, (long) i_432_);
						}
						((Class106_Sub2) this).anInt10240 = i_432_ * 1634385179;
						((Class106_Sub2) this).aClass161_10249 = class161;
					}
					((Class161_Sub3) ((Class106_Sub2) this).aClass161_10249).method10050(bool, bool_427_, bool_428_, i - i_430_, i_429_ - i_431_, f, i_430_ << 1, i_431_ << 1, i_434_, i_433_, i_435_, 1, Class511.aClass511_5697 != class101.aClass511_1342);
					return;
				}
			}
			method9516(bool_427_, i, i_429_, f, i_430_, i_433_, i_435_);
		}
	}

	void method9516(boolean bool, int i, int i_437_, float f, int i_438_, int i_439_, int i_440_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			if (i_438_ < 0)
				i_438_ = -i_438_;
			int i_441_ = i_437_ - i_438_;
			if (i_441_ < 2029354259 * ((Class106_Sub2) this).anInt10222)
				i_441_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			int i_442_ = 1 + (i_438_ + i_437_);
			if (i_442_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_442_ = 1704244235 * ((Class106_Sub2) this).anInt10223;
			int i_443_ = i_441_;
			int i_444_ = i_438_ * i_438_;
			int i_445_ = 0;
			int i_446_ = i_437_ - i_443_;
			int i_447_ = i_446_ * i_446_;
			int i_448_ = i_447_ - i_446_;
			if (i_437_ > i_442_)
				i_437_ = i_442_;
			int i_449_ = i_439_ >>> 24;
			if (i_440_ == 0 || i_440_ == 1 && 255 == i_449_) {
				while (i_443_ < i_437_) {
					for (/**/; i_448_ <= i_444_ || i_447_ <= i_444_; i_448_ += i_445_++ + i_445_)
						i_447_ += i_445_ + i_445_;
					int i_450_ = i - i_445_ + 1;
					if (i_450_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_450_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_451_ = i_445_ + i;
					if (i_451_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_451_ = ((Class106_Sub2) this).anInt10221 * 892939761;
					int i_452_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_443_) + i_450_);
					for (int i_453_ = i_450_; i_453_ < i_451_; i_453_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_452_]))
							((Class106_Sub2) this).anIntArray10218[i_452_] = i_439_;
						i_452_++;
					}
					i_443_++;
					i_447_ -= i_446_-- + i_446_;
					i_448_ -= i_446_ + i_446_;
				}
				i_445_ = i_438_;
				i_446_ = i_443_ - i_437_;
				i_448_ = i_444_ + i_446_ * i_446_;
				i_447_ = i_448_ - i_445_;
				i_448_ -= i_446_;
				while (i_443_ < i_442_) {
					for (/**/; i_448_ > i_444_ && i_447_ > i_444_; i_447_ -= i_445_ + i_445_)
						i_448_ -= i_445_-- + i_445_;
					int i_454_ = i - i_445_;
					if (i_454_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_454_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_455_ = i_445_ + i;
					if (i_455_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_455_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_456_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_443_) + i_454_);
					for (int i_457_ = i_454_; i_457_ <= i_455_; i_457_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_456_]))
							((Class106_Sub2) this).anIntArray10218[i_456_] = i_439_;
						i_456_++;
					}
					i_443_++;
					i_448_ += i_446_ + i_446_;
					i_447_ += i_446_++ + i_446_;
				}
			} else if (i_440_ == 1) {
				i_439_ = (i_449_ << 24) + (((i_439_ & 0xff00) * i_449_ >> 8 & 0xff00) + ((i_439_ & 0xff00ff) * i_449_ >> 8 & 0xff00ff));
				int i_458_ = 256 - i_449_;
				while (i_443_ < i_437_) {
					for (/**/; i_448_ <= i_444_ || i_447_ <= i_444_; i_448_ += i_445_++ + i_445_)
						i_447_ += i_445_ + i_445_;
					int i_459_ = 1 + (i - i_445_);
					if (i_459_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_459_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_460_ = i + i_445_;
					if (i_460_ > ((Class106_Sub2) this).anInt10221 * 892939761)
						i_460_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_461_ = (i_459_ + i_443_ * (-994907113 * ((Class106_Sub2) this).anInt10217));
					for (int i_462_ = i_459_; i_462_ < i_460_; i_462_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_461_])) {
							int i_463_ = (((Class106_Sub2) this).anIntArray10218[i_461_]);
							i_463_ = ((i_458_ * (i_463_ & 0xff00) >> 8 & 0xff00) + ((i_463_ & 0xff00ff) * i_458_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_461_] = i_439_ + i_463_;
						}
						i_461_++;
					}
					i_443_++;
					i_447_ -= i_446_-- + i_446_;
					i_448_ -= i_446_ + i_446_;
				}
				i_445_ = i_438_;
				i_446_ = -i_446_;
				i_448_ = i_444_ + i_446_ * i_446_;
				i_447_ = i_448_ - i_445_;
				i_448_ -= i_446_;
				while (i_443_ < i_442_) {
					for (/**/; i_448_ > i_444_ && i_447_ > i_444_; i_447_ -= i_445_ + i_445_)
						i_448_ -= i_445_-- + i_445_;
					int i_464_ = i - i_445_;
					if (i_464_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_464_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_465_ = i + i_445_;
					if (i_465_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_465_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_466_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_443_) + i_464_);
					for (int i_467_ = i_464_; i_467_ <= i_465_; i_467_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_466_])) {
							int i_468_ = (((Class106_Sub2) this).anIntArray10218[i_466_]);
							i_468_ = ((i_458_ * (i_468_ & 0xff00) >> 8 & 0xff00) + ((i_468_ & 0xff00ff) * i_458_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_466_] = i_468_ + i_439_;
						}
						i_466_++;
					}
					i_443_++;
					i_448_ += i_446_ + i_446_;
					i_447_ += i_446_++ + i_446_;
				}
			} else if (2 == i_440_) {
				while (i_443_ < i_437_) {
					for (/**/; i_448_ <= i_444_ || i_447_ <= i_444_; i_448_ += i_445_++ + i_445_)
						i_447_ += i_445_ + i_445_;
					int i_469_ = 1 + (i - i_445_);
					if (i_469_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_469_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_470_ = i_445_ + i;
					if (i_470_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_470_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_471_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_443_) + i_469_);
					for (int i_472_ = i_469_; i_472_ < i_470_; i_472_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_471_])) {
							int i_473_ = (((Class106_Sub2) this).anIntArray10218[i_471_]);
							int i_474_ = i_473_ + i_439_;
							int i_475_ = (i_473_ & 0xff00ff) + (i_439_ & 0xff00ff);
							i_473_ = (i_475_ & 0x1000100) + (i_474_ - i_475_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_471_] = i_474_ - i_473_ | i_473_ - (i_473_ >>> 8);
						}
						i_471_++;
					}
					i_443_++;
					i_447_ -= i_446_-- + i_446_;
					i_448_ -= i_446_ + i_446_;
				}
				i_445_ = i_438_;
				i_446_ = -i_446_;
				i_448_ = i_444_ + i_446_ * i_446_;
				i_447_ = i_448_ - i_445_;
				i_448_ -= i_446_;
				while (i_443_ < i_442_) {
					for (/**/; i_448_ > i_444_ && i_447_ > i_444_; i_447_ -= i_445_ + i_445_)
						i_448_ -= i_445_-- + i_445_;
					int i_476_ = i - i_445_;
					if (i_476_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_476_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_477_ = i_445_ + i;
					if (i_477_ > ((Class106_Sub2) this).anInt10221 * 892939761 - 1)
						i_477_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_478_ = (i_443_ * (-994907113 * ((Class106_Sub2) this).anInt10217) + i_476_);
					for (int i_479_ = i_476_; i_479_ <= i_477_; i_479_++) {
						if (!bool || f < (((Class106_Sub2) this).aFloatArray10219[i_478_])) {
							int i_480_ = (((Class106_Sub2) this).anIntArray10218[i_478_]);
							int i_481_ = i_480_ + i_439_;
							int i_482_ = (i_439_ & 0xff00ff) + (i_480_ & 0xff00ff);
							i_480_ = (i_482_ & 0x1000100) + (i_481_ - i_482_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_478_] = i_481_ - i_480_ | i_480_ - (i_480_ >>> 8);
						}
						i_478_++;
					}
					i_443_++;
					i_448_ += i_446_ + i_446_;
					i_447_ += i_446_++ + i_446_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1761(Class261 class261) {
		((Class106_Sub2) this).aClass261_10230 = class261;
		method9521();
	}

	public Class261 method1762() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	public void method1983(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		class90.method1511(class326, ((Class106_Sub2) this).aClass250_10232, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public void method1995(int i, int i_483_, float f, int i_484_, int i_485_, float f_486_, int i_487_, int i_488_, float f_489_, int i_490_, int i_491_, int i_492_, int i_493_) {
		boolean bool = ((Class106_Sub2) this).anIntArray10218 != null;
		boolean bool_494_ = ((Class106_Sub2) this).aFloatArray10219 != null;
		if (bool || bool_494_) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aBoolean16 = false;
			i -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_484_ -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_487_ -= ((Class106_Sub2) this).anInt10220 * 1179466163;
			i_483_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_485_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_488_ -= ((Class106_Sub2) this).anInt10222 * 2029354259;
			((Class143) class143).aBoolean20 = (i < 0 || i > ((Class143) class143).anInt22 || i_484_ < 0 || i_484_ > ((Class143) class143).anInt22 || i_487_ < 0 || i_487_ > ((Class143) class143).anInt22);
			int i_495_ = i_490_ >>> 24;
			if (0 == i_493_ || 1 == i_493_ && 255 == i_495_) {
				((Class143) class143).anInt19 = 0;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_494_, false, (float) i_483_, (float) i_485_, (float) i_488_, (float) i, (float) i_484_, (float) i_487_, f, f_486_, f_489_, i_490_, i_491_, i_492_);
			} else if (1 == i_493_) {
				((Class143) class143).anInt19 = 255 - i_495_;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_494_, false, (float) i_483_, (float) i_485_, (float) i_488_, (float) i, (float) i_484_, (float) i_487_, f, f_486_, f_489_, i_490_, i_491_, i_492_);
			} else if (2 == i_493_) {
				((Class143) class143).anInt19 = 128;
				((Class143) class143).aBoolean48 = true;
				class143.method292(bool, bool_494_, false, (float) i_483_, (float) i_485_, (float) i_488_, (float) i, (float) i_484_, (float) i_487_, f, f_486_, f_489_, i_490_, i_491_, i_492_);
			} else
				throw new IllegalArgumentException();
			((Class143) class143).aBoolean16 = true;
		}
	}

	public void method1709(float f) {
		((Class106_Sub2) this).anInt10235 = (int) (65535.0F * f) * -24827737;
	}

	public void method1767(int i, float f, float f_496_, float f_497_, float f_498_, float f_499_) {
		((Class106_Sub2) this).anInt10234 = -1601388607 * (int) (f * 65535.0F);
		((Class106_Sub2) this).anInt10228 = 511650919 * (int) (65535.0F * f_496_);
		float f_500_ = (float) Math.sqrt((double) (f_498_ * f_498_ + f_497_ * f_497_ + f_499_ * f_499_));
		((Class106_Sub2) this).anInt10224 = (int) (f_497_ * 65535.0F / f_500_) * 1424248739;
		((Class106_Sub2) this).anInt10229 = -2084145425 * (int) (f_498_ * 65535.0F / f_500_);
		((Class106_Sub2) this).anInt10216 = -1059291367 * (int) (65535.0F * f_499_ / f_500_);
	}

	public void method1783(int i) {
		/* empty */
	}

	public void method2035(float f, float f_501_, float f_502_, float[] fs) {
		float f_503_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_502_) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7] * f_501_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]) * f)));
		float f_504_ = ((f_502_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (f * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0] + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * f_501_)));
		float f_505_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * f_502_) + ((f_501_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
		float f_506_ = (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14] + ((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2] * f + (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6] * f_501_) + f_502_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
		fs[0] = (f_504_ * ((Class106_Sub2) this).aFloat10239 / f_503_ + ((Class106_Sub2) this).aFloat10246);
		fs[1] = (f_505_ * ((Class106_Sub2) this).aFloat10241 / f_503_ + ((Class106_Sub2) this).aFloat10242);
		fs[2] = f_506_;
	}

	public Class103 method1773(int i) {
		return null;
	}

	public Class103 method1729(Class103 class103, Class103 class103_507_, float f, Class103 class103_508_) {
		return null;
	}

	public void method1775(Class103 class103) {
		/* empty */
	}

	public void method2024(int i, int i_509_, int i_510_, int i_511_) {
		/* empty */
	}

	public void method1777(int i, int i_512_) {
		/* empty */
	}

	public boolean method1778() {
		return false;
	}

	public boolean method1779() {
		return false;
	}

	public void method1702(float f, float f_513_, float f_514_, float f_515_, float f_516_) {
		/* empty */
	}

	public void method1850() {
		/* empty */
	}

	public boolean method1782() {
		return false;
	}

	public int[] method1836(int i, int i_517_, int i_518_, int i_519_) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_518_ * i_519_];
		int i_520_ = 0;
		for (int i_521_ = 0; i_521_ < i_519_; i_521_++) {
			int i_522_ = (-994907113 * ((Class106_Sub2) this).anInt10217 * (i_521_ + i_517_) + i);
			for (int i_523_ = 0; i_523_ < i_518_; i_523_++)
				is[i_520_++] = ((Class106_Sub2) this).anIntArray10218[i_522_ + i_523_];
		}
		return is;
	}

	void method1802() {
		if (((Class106_Sub2) this).aBool10227) {
			Class472.method5585(true, false, (byte) -39);
			((Class106_Sub2) this).aBool10227 = false;
		}
		((Class106_Sub2) this).aBool10215 = true;
	}

	public void method1785() {
		/* empty */
	}

	public boolean method1786() {
		return false;
	}

	void method1835(float f, float f_524_, float f_525_, float f_526_, float f_527_, float f_528_) {
		/* empty */
	}

	public void method1789(int i, Class86 class86) {
		for (int i_529_ = 0; i_529_ < ((Class106_Sub2) this).aClass186Array10213.length; i_529_++) {
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_529_]).anInt2183 = 522561057 * (((Class186) (((Class106_Sub2) this).aClass186Array10213[i_529_])).anInt2191);
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_529_]).anInt2182 = i * -2040499037;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_529_]).anInt2191 = class86.anInt1193 * -212184699;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_529_]).anInt2173 = 160837573 * class86.anInt1190;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_529_]).aBool2201 = true;
		}
	}

	public void method1969(int i, int i_530_, int i_531_, int i_532_) {
		/* empty */
	}

	public void method1791() {
		for (int i = 0; i < ((Class106_Sub2) this).aClass186Array10213.length; i++) {
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i]).anInt2191 = 581918177 * ((Class186) (((Class106_Sub2) this).aClass186Array10213[i])).anInt2183;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i]).aBool2201 = false;
		}
	}

	public void method1670(int i, int i_533_, float f, int i_534_, int i_535_, float f_536_, int i_537_, int i_538_, float f_539_, int i_540_, int i_541_, int i_542_, int i_543_) {
		boolean bool = ((Class106_Sub2) this).anIntArray10218 != null;
		boolean bool_544_ = ((Class106_Sub2) this).aFloatArray10219 != null;
		if (bool || bool_544_) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aBoolean16 = false;
			i -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_534_ -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_537_ -= ((Class106_Sub2) this).anInt10220 * 1179466163;
			i_533_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_535_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_538_ -= ((Class106_Sub2) this).anInt10222 * 2029354259;
			((Class143) class143).aBoolean20 = (i < 0 || i > ((Class143) class143).anInt22 || i_534_ < 0 || i_534_ > ((Class143) class143).anInt22 || i_537_ < 0 || i_537_ > ((Class143) class143).anInt22);
			int i_545_ = i_540_ >>> 24;
			if (0 == i_543_ || 1 == i_543_ && 255 == i_545_) {
				((Class143) class143).anInt19 = 0;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_544_, false, (float) i_533_, (float) i_535_, (float) i_538_, (float) i, (float) i_534_, (float) i_537_, f, f_536_, f_539_, i_540_, i_541_, i_542_);
			} else if (1 == i_543_) {
				((Class143) class143).anInt19 = 255 - i_545_;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_544_, false, (float) i_533_, (float) i_535_, (float) i_538_, (float) i, (float) i_534_, (float) i_537_, f, f_536_, f_539_, i_540_, i_541_, i_542_);
			} else if (2 == i_543_) {
				((Class143) class143).anInt19 = 128;
				((Class143) class143).aBoolean48 = true;
				class143.method292(bool, bool_544_, false, (float) i_533_, (float) i_535_, (float) i_538_, (float) i, (float) i_534_, (float) i_537_, f, f_536_, f_539_, i_540_, i_541_, i_542_);
			} else
				throw new IllegalArgumentException();
			((Class143) class143).aBoolean16 = true;
		}
	}

	public void method1827(int i, int i_546_, int i_547_) {
		/* empty */
	}

	public Class261 method1842() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	public Class104_Sub1 method1693() {
		return new Class104_Sub1_Sub2(this);
	}

	public Interface6 method2039(int i, int i_548_, Class171 class171, Class88 class88, int i_549_) {
		return method9527(i, i_548_);
	}

	public void method1984() {
		/* empty */
	}

	public Interface11 method1781(int i, int i_550_, int i_551_) {
		return new Class151(i, i_550_);
	}

	public void method2009(Class261 class261) {
		((Class106_Sub2) this).aClass261_10230 = class261;
		method9521();
	}

	public void method1707(int i, int i_552_, int[] is, int[] is_553_) {
		method1708(i, i_552_, 2107167674);
		if (((Class106_Sub2) this).aClass161_10251 == null || ((Class106_Sub2) this).aClass161_10251.method2587() != i || ((Class106_Sub2) this).aClass161_10251.method2588() != i_552_) {
			((Class106_Sub2) this).aClass161_10251 = method1864(i, i_552_, true, true);
			((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		}
		if (null == ((Class106_Sub2) this).aClass104_Sub1_10250) {
			((Class106_Sub2) this).aClass104_Sub1_10250 = method1693();
			((Class106_Sub2) this).aClass104_Sub1_10250.method9908(0, ((Class106_Sub2) this).aClass161_10251.method2590());
		}
		Class161_Sub3_Sub3 class161_sub3_sub3 = new Class161_Sub3_Sub3(this, ((Class106_Sub2) this).anIntArray10218, (((Class106_Sub2) this).anInt10217 * -994907113), (-1733432719 * ((Class106_Sub2) this).anInt10236));
		method1661(((Class106_Sub2) this).aClass104_Sub1_10250, -887316029);
		method1719(1, -16777216);
		class161_sub3_sub3.method2599(886687387 * anInt1402, anInt1417 * -1832602033, 826888055 * anInt1411, anInt1387 * 46469553, 1, 0, 0, 0);
		((Class106_Sub2) this).aClass161_10251.method2592(0, 0, i, i_552_, is, is_553_, 0, i);
		method1884(((Class106_Sub2) this).aClass104_Sub1_10250, 654010090);
	}

	public void method2020() {
		/* empty */
	}

	public void method1718(int[] is) {
		is[0] = ((Class106_Sub2) this).anInt10220 * 1179466163;
		is[1] = 2029354259 * ((Class106_Sub2) this).anInt10222;
		is[2] = 892939761 * ((Class106_Sub2) this).anInt10221;
		is[3] = ((Class106_Sub2) this).anInt10223 * 1704244235;
	}

	boolean method9517() {
		return ((Class106_Sub2) this).aBool10215;
	}

	public void method1885(int i) {
		int i_554_ = i - ((Class106_Sub2) this).anInt10214 * 1320402341;
		for (Class572_Sub38 class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2249(769962827); null != class572_sub38; class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2238(-1587217308)) {
			if (((Class572_Sub38) class572_sub38).aBool9386) {
				((Class572_Sub38) class572_sub38).anInt9384 += i_554_;
				int i_555_ = ((Class572_Sub38) class572_sub38).anInt9384 / 50;
				if (i_555_ > 0) {
					MaterialInformation class101 = aClass94_1396.getTexture(((Class572_Sub38) class572_sub38).anInt9387, 1153027557);
					float f = (float) (1913535271 * class101.anInt1338);
					class572_sub38.method8764((int) (f * ((float) class101.textureSpeedU * ((float) i_554_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_554_ / 1000.0F * (float) class101.textureSpeedV / 64.0F)));
					((Class572_Sub38) class572_sub38).anInt9384 -= i_555_ * 50;
				}
				((Class572_Sub38) class572_sub38).aBool9386 = false;
			}
		}
		((Class106_Sub2) this).anInt10214 = i * 1884086829;
		((Class106_Sub2) this).aClass127_10248.method2235(5, 1760200649);
		((Class106_Sub2) this).aClass127_10247.method2235(5, 2066296369);
	}

	public void method1805(int i) {
		int i_556_ = i - ((Class106_Sub2) this).anInt10214 * 1320402341;
		for (Class572_Sub38 class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2249(769962827); null != class572_sub38; class572_sub38 = (Class572_Sub38) ((Class106_Sub2) this).aClass127_10247.method2238(-526690507)) {
			if (((Class572_Sub38) class572_sub38).aBool9386) {
				((Class572_Sub38) class572_sub38).anInt9384 += i_556_;
				int i_557_ = ((Class572_Sub38) class572_sub38).anInt9384 / 50;
				if (i_557_ > 0) {
					MaterialInformation class101 = aClass94_1396.getTexture(((Class572_Sub38) class572_sub38).anInt9387, -237359456);
					float f = (float) (1913535271 * class101.anInt1338);
					class572_sub38.method8764((int) (f * ((float) class101.textureSpeedU * ((float) i_556_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_556_ / 1000.0F * (float) class101.textureSpeedV / 64.0F)));
					((Class572_Sub38) class572_sub38).anInt9384 -= i_557_ * 50;
				}
				((Class572_Sub38) class572_sub38).aBool9386 = false;
			}
		}
		((Class106_Sub2) this).anInt10214 = i * 1884086829;
		((Class106_Sub2) this).aClass127_10248.method2235(5, 1704527209);
		((Class106_Sub2) this).aClass127_10247.method2235(5, 1509659639);
	}

	void method9518() {
		if (null != ((Class106_Sub2) this).aFloatArray10219) {
			if (0 == ((Class106_Sub2) this).anInt10220 * 1179466163 && (((Class106_Sub2) this).anInt10217 * -994907113 == ((Class106_Sub2) this).anInt10221 * 892939761) && ((Class106_Sub2) this).anInt10222 * 2029354259 == 0 && (((Class106_Sub2) this).anInt10223 * 1704244235 == ((Class106_Sub2) this).anInt10236 * -1733432719)) {
				int i = ((Class106_Sub2) this).aFloatArray10219.length;
				int i_558_ = i - (i & 0x7);
				int i_559_ = 0;
				while (i_559_ < i_558_) {
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
				}
				while (i_559_ < i)
					((Class106_Sub2) this).aFloatArray10219[i_559_++] = 2.14748365E9F;
			} else {
				int i = (((Class106_Sub2) this).anInt10221 * 892939761 - 1179466163 * ((Class106_Sub2) this).anInt10220);
				int i_560_ = (((Class106_Sub2) this).anInt10223 * 1704244235 - 2029354259 * ((Class106_Sub2) this).anInt10222);
				int i_561_ = -994907113 * ((Class106_Sub2) this).anInt10217 - i;
				int i_562_ = (1179466163 * ((Class106_Sub2) this).anInt10220 + (-994907113 * ((Class106_Sub2) this).anInt10217 * (((Class106_Sub2) this).anInt10222 * 2029354259)));
				int i_563_ = i >> 3;
				int i_564_ = i & 0x7;
				i = i_562_ - 1;
				for (int i_565_ = -i_560_; i_565_ < 0; i_565_++) {
					if (i_563_ > 0) {
						int i_566_ = i_563_;
						do {
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
						} while (--i_566_ > 0);
					}
					if (i_564_ > 0) {
						int i_567_ = i_564_;
						do
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
						while (--i_567_ > 0);
					}
					i += i_561_;
				}
			}
		}
	}

	public int method1808() {
		return 0;
	}

	public boolean method1840() {
		return true;
	}

	public void method1880() {
		/* empty */
	}

	public Class103 method1900(Class103 class103, Class103 class103_568_, float f, Class103 class103_569_) {
		return null;
	}

	public boolean method1746() {
		return false;
	}

	public void method1953(Class250 class250) {
		((Class106_Sub2) this).aClass250_10232.method3442(class250);
		method9521();
	}

	public boolean method1977() {
		return false;
	}

	public Class261 method1862() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	public boolean method1812() {
		return false;
	}

	public boolean method1769() {
		return false;
	}

	public boolean method1814() {
		return true;
	}

	public boolean method1815() {
		return true;
	}

	public boolean method1816() {
		return false;
	}

	public boolean method1817() {
		return false;
	}

	public boolean method1734() {
		return false;
	}

	public boolean method1818() {
		return false;
	}

	public boolean method1819() {
		return false;
	}

	public boolean method1820() {
		return false;
	}

	public boolean method1691() {
		return false;
	}

	public boolean method1822() {
		return false;
	}

	public boolean method1941() {
		return false;
	}

	public boolean method1903() {
		return false;
	}

	public boolean method1825() {
		return false;
	}

	public boolean method1826() {
		return false;
	}

	public boolean method1921() {
		return true;
	}

	public boolean method1996() {
		return true;
	}

	public String method1964() {
		return "";
	}

	public String method1829() {
		return "";
	}

	public String method1830() {
		return "";
	}

	public void method1920(int i, Class167 class167, int i_570_, int i_571_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_572_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_573_;
			if (1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_571_)
				i_573_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_571_;
			else
				i_573_ = is.length;
			int i_574_;
			if (2029354259 * ((Class106_Sub2) this).anInt10222 > i_571_) {
				i_574_ = 2029354259 * ((Class106_Sub2) this).anInt10222 - i_571_;
				i_571_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			} else
				i_574_ = 0;
			if (i_573_ - i_574_ > 0) {
				int i_575_ = i_571_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				for (int i_576_ = i_574_; i_576_ < i_573_; i_576_++) {
					int i_577_ = i_570_ + is[i_576_];
					int i_578_ = is_572_[i_576_];
					if (1179466163 * ((Class106_Sub2) this).anInt10220 > i_577_) {
						i_578_ -= (1179466163 * ((Class106_Sub2) this).anInt10220 - i_577_);
						i_577_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (((Class106_Sub2) this).anInt10221 * 892939761 < i_578_ + i_577_)
						i_578_ = (892939761 * ((Class106_Sub2) this).anInt10221 - i_577_);
					i_577_ += i_575_;
					for (int i_579_ = -i_578_; i_579_ < 0; i_579_++)
						((Class106_Sub2) this).anIntArray10218[i_577_++] = i;
					i_575_ += -994907113 * ((Class106_Sub2) this).anInt10217;
				}
			}
		}
	}

	public void method1832(boolean bool) {
		/* empty */
	}

	Class104_Sub2 method1833(Canvas canvas, int i, int i_580_) {
		return Class310.method4051(this, canvas, i, i_580_, 920525425);
	}

	public boolean method1673() {
		return true;
	}

	public int[] method1834(int i, int i_581_, int i_582_, int i_583_) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_582_ * i_583_];
		int i_584_ = 0;
		for (int i_585_ = 0; i_585_ < i_583_; i_585_++) {
			int i_586_ = (-994907113 * ((Class106_Sub2) this).anInt10217 * (i_585_ + i_581_) + i);
			for (int i_587_ = 0; i_587_ < i_582_; i_587_++)
				is[i_584_++] = ((Class106_Sub2) this).anIntArray10218[i_586_ + i_587_];
		}
		return is;
	}

	public void method1997(float f, float f_588_, float f_589_, float[] fs) {
		float f_590_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * f + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * f_588_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * f_589_));
		float f_591_ = ((f_588_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_589_));
		if (f_590_ < -f_591_ || f_590_ > f_591_) {
			float[] fs_592_ = fs;
			float[] fs_593_ = fs;
			fs[2] = Float.NaN;
			fs_593_[1] = Float.NaN;
			fs_592_[0] = Float.NaN;
		} else {
			float f_594_ = (f_588_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * f_589_));
			if (f_594_ < -f_591_ || f_594_ > f_591_) {
				float[] fs_595_ = fs;
				float[] fs_596_ = fs;
				fs[2] = Float.NaN;
				fs_596_[1] = Float.NaN;
				fs_595_[0] = Float.NaN;
			} else {
				float f_597_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * f_589_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) * f_588_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
				if (f_597_ < -f_591_ || f_597_ > f_591_) {
					float[] fs_598_ = fs;
					float[] fs_599_ = fs;
					fs[2] = Float.NaN;
					fs_599_[1] = Float.NaN;
					fs_598_[0] = Float.NaN;
				} else {
					float f_600_ = ((((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14]) + f * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2]) + f_588_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6]) + f_589_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
					fs[0] = (((Class106_Sub2) this).aFloat10239 * f_594_ / f_591_ + ((Class106_Sub2) this).aFloat10246);
					fs[1] = (((Class106_Sub2) this).aFloat10242 + (f_597_ * ((Class106_Sub2) this).aFloat10241 / f_591_));
					fs[2] = f_600_;
				}
			}
		}
	}

	public void method1703() {
		/* empty */
	}

	public void method1838(int[] is) {
		is[0] = -994907113 * ((Class106_Sub2) this).anInt10217;
		is[1] = -1733432719 * ((Class106_Sub2) this).anInt10236;
	}

	public void method1965(int[] is) {
		is[0] = -994907113 * ((Class106_Sub2) this).anInt10217;
		is[1] = -1733432719 * ((Class106_Sub2) this).anInt10236;
	}

	public boolean method1839() {
		return false;
	}

	public void method1837() {
		/* empty */
	}

	public boolean method2047() {
		return true;
	}

	public boolean method1823() {
		return true;
	}

	public boolean method1844() {
		return false;
	}

	public boolean method2022() {
		return false;
	}

	public boolean method1846() {
		return false;
	}

	public void method1772(int i, Class572_Sub36[] class572_sub36s) {
		/* empty */
	}

	public int method1848() {
		return -1;
	}

	public void method1857(int i, int i_601_, int[] is, int[] is_602_) {
		method1708(i, i_601_, 1778343830);
		if (((Class106_Sub2) this).aClass161_10251 == null || ((Class106_Sub2) this).aClass161_10251.method2587() != i || ((Class106_Sub2) this).aClass161_10251.method2588() != i_601_) {
			((Class106_Sub2) this).aClass161_10251 = method1864(i, i_601_, true, true);
			((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		}
		if (null == ((Class106_Sub2) this).aClass104_Sub1_10250) {
			((Class106_Sub2) this).aClass104_Sub1_10250 = method1693();
			((Class106_Sub2) this).aClass104_Sub1_10250.method9908(0, ((Class106_Sub2) this).aClass161_10251.method2590());
		}
		Class161_Sub3_Sub3 class161_sub3_sub3 = new Class161_Sub3_Sub3(this, ((Class106_Sub2) this).anIntArray10218, (((Class106_Sub2) this).anInt10217 * -994907113), (-1733432719 * ((Class106_Sub2) this).anInt10236));
		method1661(((Class106_Sub2) this).aClass104_Sub1_10250, -938321367);
		method1719(1, -16777216);
		class161_sub3_sub3.method2599(886687387 * anInt1402, anInt1417 * -1832602033, 826888055 * anInt1411, anInt1387 * 46469553, 1, 0, 0, 0);
		((Class106_Sub2) this).aClass161_10251.method2592(0, 0, i, i_601_, is, is_602_, 0, i);
		method1884(((Class106_Sub2) this).aClass104_Sub1_10250, 473553637);
	}

	public void method1865() {
		((Class106_Sub2) this).anInt10226 = 0;
		((Class106_Sub2) this).anInt10252 = 0;
		((Class106_Sub2) this).anInt10237 = ((Class106_Sub2) this).anInt10217 * -1646502557;
		((Class106_Sub2) this).anInt10238 = 1817973455 * ((Class106_Sub2) this).anInt10236;
		method9507();
	}

	public Class250 method1935() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	public int method2045() {
		return 0;
	}

	public void method1855(long l) {
		/* empty */
	}

	void method1678(int i, int i_603_, int i_604_, int i_605_, int i_606_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < 892939761 * ((Class106_Sub2) this).anInt10221)) {
			if (i_603_ < ((Class106_Sub2) this).anInt10222 * 2029354259) {
				i_604_ -= ((Class106_Sub2) this).anInt10222 * 2029354259 - i_603_;
				i_603_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_603_ + i_604_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_604_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_603_;
			int i_607_ = i + i_603_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
			int i_608_ = i_605_ >>> 24;
			if (i_606_ == 0 || i_606_ == 1 && i_608_ == 255) {
				for (int i_609_ = 0; i_609_ < i_604_; i_609_++)
					((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_609_) + i_607_] = i_605_;
			} else if (i_606_ == 1) {
				i_605_ = (i_608_ << 24) + ((i_608_ * (i_605_ & 0xff00) >> 8 & 0xff00) + ((i_605_ & 0xff00ff) * i_608_ >> 8 & 0xff00ff));
				int i_610_ = 256 - i_608_;
				for (int i_611_ = 0; i_611_ < i_604_; i_611_++) {
					int i_612_ = i_607_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_611_);
					int i_613_ = ((Class106_Sub2) this).anIntArray10218[i_612_];
					i_613_ = (((i_613_ & 0xff00) * i_610_ >> 8 & 0xff00) + ((i_613_ & 0xff00ff) * i_610_ >> 8 & 0xff00ff));
					((Class106_Sub2) this).anIntArray10218[i_612_] = i_605_ + i_613_;
				}
			} else if (i_606_ == 2) {
				for (int i_614_ = 0; i_614_ < i_604_; i_614_++) {
					int i_615_ = (i_607_ + i_614_ * (-994907113 * ((Class106_Sub2) this).anInt10217));
					int i_616_ = ((Class106_Sub2) this).anIntArray10218[i_615_];
					int i_617_ = i_616_ + i_605_;
					int i_618_ = (i_605_ & 0xff00ff) + (i_616_ & 0xff00ff);
					i_616_ = (i_617_ - i_618_ & 0x10000) + (i_618_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_615_] = i_617_ - i_616_ | i_616_ - (i_616_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1682(int[] is) {
		is[0] = -994907113 * ((Class106_Sub2) this).anInt10217;
		is[1] = -1733432719 * ((Class106_Sub2) this).anInt10236;
	}

	public void method1858() {
		((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		((Class106_Sub2) this).aClass161_10251 = null;
	}

	public void method1860() {
		((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		((Class106_Sub2) this).aClass161_10251 = null;
	}

	void method9519() {
		if (null != ((Class106_Sub2) this).aFloatArray10219) {
			if (0 == ((Class106_Sub2) this).anInt10220 * 1179466163 && (((Class106_Sub2) this).anInt10217 * -994907113 == ((Class106_Sub2) this).anInt10221 * 892939761) && ((Class106_Sub2) this).anInt10222 * 2029354259 == 0 && (((Class106_Sub2) this).anInt10223 * 1704244235 == ((Class106_Sub2) this).anInt10236 * -1733432719)) {
				int i = ((Class106_Sub2) this).aFloatArray10219.length;
				int i_619_ = i - (i & 0x7);
				int i_620_ = 0;
				while (i_620_ < i_619_) {
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
				}
				while (i_620_ < i)
					((Class106_Sub2) this).aFloatArray10219[i_620_++] = 2.14748365E9F;
			} else {
				int i = (((Class106_Sub2) this).anInt10221 * 892939761 - 1179466163 * ((Class106_Sub2) this).anInt10220);
				int i_621_ = (((Class106_Sub2) this).anInt10223 * 1704244235 - 2029354259 * ((Class106_Sub2) this).anInt10222);
				int i_622_ = -994907113 * ((Class106_Sub2) this).anInt10217 - i;
				int i_623_ = (1179466163 * ((Class106_Sub2) this).anInt10220 + (-994907113 * ((Class106_Sub2) this).anInt10217 * (((Class106_Sub2) this).anInt10222 * 2029354259)));
				int i_624_ = i >> 3;
				int i_625_ = i & 0x7;
				i = i_623_ - 1;
				for (int i_626_ = -i_621_; i_626_ < 0; i_626_++) {
					if (i_624_ > 0) {
						int i_627_ = i_624_;
						do {
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
						} while (--i_627_ > 0);
					}
					if (i_625_ > 0) {
						int i_628_ = i_625_;
						do
							((Class106_Sub2) this).aFloatArray10219[++i] = 2.14748365E9F;
						while (--i_628_ > 0);
					}
					i += i_622_;
				}
			}
		}
	}

	public void method1985(boolean bool) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).aBoolean207 = bool;
	}

	public void method1924(boolean bool) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).aBoolean207 = bool;
	}

	public void method1764(Class250 class250) {
		((Class106_Sub2) this).aClass250_10232.method3442(class250);
		method9521();
	}

	public void method1872(boolean bool) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).aBoolean207 = bool;
	}

	public int[] method1780(int i, int i_629_, int i_630_, int i_631_) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_630_ * i_631_];
		int i_632_ = 0;
		for (int i_633_ = 0; i_633_ < i_631_; i_633_++) {
			int i_634_ = (-994907113 * ((Class106_Sub2) this).anInt10217 * (i_633_ + i_629_) + i);
			for (int i_635_ = 0; i_635_ < i_630_; i_635_++)
				is[i_632_++] = ((Class106_Sub2) this).anIntArray10218[i_634_ + i_635_];
		}
		return is;
	}

	public void method1867() {
		((Class106_Sub2) this).anInt10226 = 0;
		((Class106_Sub2) this).anInt10252 = 0;
		((Class106_Sub2) this).anInt10237 = ((Class106_Sub2) this).anInt10217 * -1646502557;
		((Class106_Sub2) this).anInt10238 = 1817973455 * ((Class106_Sub2) this).anInt10236;
		method9507();
	}

	void method1727(int i, int i_636_, int i_637_, int i_638_, int i_639_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			if (i_637_ < 0)
				i_637_ = -i_637_;
			int i_640_ = i_636_ - i_637_;
			if (i_640_ < ((Class106_Sub2) this).anInt10222 * 2029354259)
				i_640_ = ((Class106_Sub2) this).anInt10222 * 2029354259;
			int i_641_ = i_636_ + i_637_ + 1;
			if (i_641_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_641_ = ((Class106_Sub2) this).anInt10223 * 1704244235;
			int i_642_ = i_640_;
			int i_643_ = i_637_ * i_637_;
			int i_644_ = 0;
			int i_645_ = i_636_ - i_642_;
			int i_646_ = i_645_ * i_645_;
			int i_647_ = i_646_ - i_645_;
			if (i_636_ > i_641_)
				i_636_ = i_641_;
			int i_648_ = i_638_ >>> 24;
			if (0 == i_639_ || i_639_ == 1 && i_648_ == 255) {
				while (i_642_ < i_636_) {
					for (/**/; i_647_ <= i_643_ || i_646_ <= i_643_; i_647_ += i_644_++ + i_644_)
						i_646_ += i_644_ + i_644_;
					int i_649_ = i - i_644_ + 1;
					if (i_649_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_649_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_650_ = i + i_644_;
					if (i_650_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_650_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_651_ = i_649_ + (((Class106_Sub2) this).anInt10217 * -994907113 * i_642_);
					for (int i_652_ = i_649_; i_652_ < i_650_; i_652_++)
						((Class106_Sub2) this).anIntArray10218[i_651_++] = i_638_;
					i_642_++;
					i_646_ -= i_645_-- + i_645_;
					i_647_ -= i_645_ + i_645_;
				}
				i_644_ = i_637_;
				i_645_ = i_642_ - i_636_;
				i_647_ = i_643_ + i_645_ * i_645_;
				i_646_ = i_647_ - i_644_;
				i_647_ -= i_645_;
				while (i_642_ < i_641_) {
					for (/**/; i_647_ > i_643_ && i_646_ > i_643_; i_646_ -= i_644_ + i_644_)
						i_647_ -= i_644_-- + i_644_;
					int i_653_ = i - i_644_;
					if (i_653_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_653_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_654_ = i + i_644_;
					if (i_654_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_654_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_655_ = i_653_ + (((Class106_Sub2) this).anInt10217 * -994907113 * i_642_);
					for (int i_656_ = i_653_; i_656_ <= i_654_; i_656_++)
						((Class106_Sub2) this).anIntArray10218[i_655_++] = i_638_;
					i_642_++;
					i_647_ += i_645_ + i_645_;
					i_646_ += i_645_++ + i_645_;
				}
			} else if (i_639_ == 1) {
				i_638_ = ((i_648_ * (i_638_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_638_ & 0xff00) * i_648_ >> 8 & 0xff00) + (i_648_ << 24));
				int i_657_ = 256 - i_648_;
				while (i_642_ < i_636_) {
					for (/**/; i_647_ <= i_643_ || i_646_ <= i_643_; i_647_ += i_644_++ + i_644_)
						i_646_ += i_644_ + i_644_;
					int i_658_ = i - i_644_ + 1;
					if (i_658_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_658_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_659_ = i_644_ + i;
					if (i_659_ > ((Class106_Sub2) this).anInt10221 * 892939761)
						i_659_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_660_ = (i_642_ * (-994907113 * ((Class106_Sub2) this).anInt10217) + i_658_);
					for (int i_661_ = i_658_; i_661_ < i_659_; i_661_++) {
						int i_662_ = ((Class106_Sub2) this).anIntArray10218[i_660_];
						i_662_ = (((i_662_ & 0xff00) * i_657_ >> 8 & 0xff00) + (i_657_ * (i_662_ & 0xff00ff) >> 8 & 0xff00ff));
						((Class106_Sub2) this).anIntArray10218[i_660_++] = i_638_ + i_662_;
					}
					i_642_++;
					i_646_ -= i_645_-- + i_645_;
					i_647_ -= i_645_ + i_645_;
				}
				i_644_ = i_637_;
				i_645_ = -i_645_;
				i_647_ = i_643_ + i_645_ * i_645_;
				i_646_ = i_647_ - i_644_;
				i_647_ -= i_645_;
				while (i_642_ < i_641_) {
					for (/**/; i_647_ > i_643_ && i_646_ > i_643_; i_646_ -= i_644_ + i_644_)
						i_647_ -= i_644_-- + i_644_;
					int i_663_ = i - i_644_;
					if (i_663_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_663_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_664_ = i + i_644_;
					if (i_664_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_664_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_665_ = (i_642_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_663_);
					for (int i_666_ = i_663_; i_666_ <= i_664_; i_666_++) {
						int i_667_ = ((Class106_Sub2) this).anIntArray10218[i_665_];
						i_667_ = ((i_657_ * (i_667_ & 0xff00) >> 8 & 0xff00) + ((i_667_ & 0xff00ff) * i_657_ >> 8 & 0xff00ff));
						((Class106_Sub2) this).anIntArray10218[i_665_++] = i_667_ + i_638_;
					}
					i_642_++;
					i_647_ += i_645_ + i_645_;
					i_646_ += i_645_++ + i_645_;
				}
			} else if (2 == i_639_) {
				while (i_642_ < i_636_) {
					for (/**/; i_647_ <= i_643_ || i_646_ <= i_643_; i_647_ += i_644_++ + i_644_)
						i_646_ += i_644_ + i_644_;
					int i_668_ = 1 + (i - i_644_);
					if (i_668_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_668_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_669_ = i_644_ + i;
					if (i_669_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_669_ = ((Class106_Sub2) this).anInt10221 * 892939761;
					int i_670_ = (i_642_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_668_);
					for (int i_671_ = i_668_; i_671_ < i_669_; i_671_++) {
						int i_672_ = ((Class106_Sub2) this).anIntArray10218[i_670_];
						int i_673_ = i_638_ + i_672_;
						int i_674_ = (i_638_ & 0xff00ff) + (i_672_ & 0xff00ff);
						i_672_ = (i_674_ & 0x1000100) + (i_673_ - i_674_ & 0x10000);
						((Class106_Sub2) this).anIntArray10218[i_670_++] = i_673_ - i_672_ | i_672_ - (i_672_ >>> 8);
					}
					i_642_++;
					i_646_ -= i_645_-- + i_645_;
					i_647_ -= i_645_ + i_645_;
				}
				i_644_ = i_637_;
				i_645_ = -i_645_;
				i_647_ = i_645_ * i_645_ + i_643_;
				i_646_ = i_647_ - i_644_;
				i_647_ -= i_645_;
				while (i_642_ < i_641_) {
					for (/**/; i_647_ > i_643_ && i_646_ > i_643_; i_646_ -= i_644_ + i_644_)
						i_647_ -= i_644_-- + i_644_;
					int i_675_ = i - i_644_;
					if (i_675_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_675_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_676_ = i_644_ + i;
					if (i_676_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_676_ = (892939761 * ((Class106_Sub2) this).anInt10221 - 1);
					int i_677_ = (i_642_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_675_);
					for (int i_678_ = i_675_; i_678_ <= i_676_; i_678_++) {
						int i_679_ = ((Class106_Sub2) this).anIntArray10218[i_677_];
						int i_680_ = i_638_ + i_679_;
						int i_681_ = (i_679_ & 0xff00ff) + (i_638_ & 0xff00ff);
						i_679_ = (i_681_ & 0x1000100) + (i_680_ - i_681_ & 0x10000);
						((Class106_Sub2) this).anIntArray10218[i_677_++] = i_680_ - i_679_ | i_679_ - (i_679_ >>> 8);
					}
					i_642_++;
					i_647_ += i_645_ + i_645_;
					i_646_ += i_645_++ + i_645_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1869(int[] is) {
		is[0] = 1844987403 * ((Class106_Sub2) this).anInt10226;
		is[1] = ((Class106_Sub2) this).anInt10252 * 645490481;
		is[2] = -1421066563 * ((Class106_Sub2) this).anInt10237;
		is[3] = ((Class106_Sub2) this).anInt10238 * 472284863;
	}

	public void method1741(float f, float f_682_) {
		((Class106_Sub2) this).aFloat10243 = f_682_ - f;
		((Class106_Sub2) this).aFloat10244 = f + f_682_ - 1.0F;
		for (int i = 0; i < -1641029431 * ((Class106_Sub2) this).anInt10225; i++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i];
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aFloat46 = ((Class106_Sub2) this).aFloat10243;
			((Class143) class143).aFloat27 = ((Class106_Sub2) this).aFloat10244;
		}
	}

	public void method1871(float f, float f_683_) {
		((Class106_Sub2) this).aFloat10243 = f_683_ - f;
		((Class106_Sub2) this).aFloat10244 = f + f_683_ - 1.0F;
		for (int i = 0; i < -1641029431 * ((Class106_Sub2) this).anInt10225; i++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i];
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aFloat46 = ((Class106_Sub2) this).aFloat10243;
			((Class143) class143).aFloat27 = ((Class106_Sub2) this).aFloat10244;
		}
	}

	void method9520() {
		int i = (892939761 * ((Class106_Sub2) this).anInt10221 - 1179466163 * ((Class106_Sub2) this).anInt10220);
		int i_684_ = (((Class106_Sub2) this).anInt10223 * 1704244235 - ((Class106_Sub2) this).anInt10222 * 2029354259);
		float f = (((Class106_Sub2) this).aFloat10239 = ((float) (-1421066563 * ((Class106_Sub2) this).anInt10237) / 2.0F));
		float f_685_ = (((Class106_Sub2) this).aFloat10241 = ((float) (472284863 * ((Class106_Sub2) this).anInt10238) / 2.0F));
		((Class106_Sub2) this).aFloat10246 = f + (float) (1844987403 * ((Class106_Sub2) this).anInt10226);
		((Class106_Sub2) this).aFloat10242 = (float) (((Class106_Sub2) this).anInt10252 * 645490481) + f_685_;
		for (int i_686_ = 0; i_686_ < -1641029431 * ((Class106_Sub2) this).anInt10225; i_686_++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i_686_];
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aFloat17 = f;
			((Class143) class143).aFloat26 = f_685_;
			((Class143) class143).aFloat23 = (((Class106_Sub2) this).aFloat10246 - (float) (1179466163 * ((Class106_Sub2) this).anInt10220));
			((Class143) class143).aFloat25 = (((Class106_Sub2) this).aFloat10242 - (float) (2029354259 * ((Class106_Sub2) this).anInt10222));
			((Class143) class143).anInt22 = i;
			((Class143) class143).anInt38 = i_684_;
		}
		int i_687_ = (((Class106_Sub2) this).anInt10220 * 1179466163 + (((Class106_Sub2) this).anInt10217 * -994907113 * (((Class106_Sub2) this).anInt10222 * 2029354259)));
		for (int i_688_ = 2029354259 * ((Class106_Sub2) this).anInt10222; i_688_ < 1704244235 * ((Class106_Sub2) this).anInt10223; i_688_++) {
			for (int i_689_ = 0; i_689_ < ((Class106_Sub2) this).anInt10225 * -1641029431; i_689_++)
				((Class143) (((Class186) (((Class106_Sub2) this).aClass186Array10213[i_689_])).aClass143_2187)).anIntArray47[i_688_ - 2029354259 * ((Class106_Sub2) this).anInt10222] = i_687_;
			i_687_ += -994907113 * ((Class106_Sub2) this).anInt10217;
		}
	}

	public Class96 method1951(int[] is) {
		return null;
	}

	public long method1854(int i, int i_690_) {
		return 0L;
	}

	public void method1874(int i, int i_691_) {
		if (0 != (i & 0x1))
			method1725(0, 0, -994907113 * ((Class106_Sub2) this).anInt10217, -1733432719 * ((Class106_Sub2) this).anInt10236, i_691_, 0);
		if ((i & 0x2) != 0)
			method9518();
	}

	public void method1766(Class261 class261) {
		((Class106_Sub2) this).aClass261_10230 = class261;
		method9521();
	}

	public void method1735(int i, int i_692_, int i_693_, int i_694_) {
		if (i < 0)
			i = 0;
		if (i_692_ < 0)
			i_692_ = 0;
		if (i_693_ > -994907113 * ((Class106_Sub2) this).anInt10217)
			i_693_ = ((Class106_Sub2) this).anInt10217 * -994907113;
		if (i_694_ > ((Class106_Sub2) this).anInt10236 * -1733432719)
			i_694_ = -1733432719 * ((Class106_Sub2) this).anInt10236;
		((Class106_Sub2) this).anInt10220 = i * -1154212485;
		((Class106_Sub2) this).anInt10221 = i_693_ * 1219240721;
		((Class106_Sub2) this).anInt10222 = i_692_ * -685124325;
		((Class106_Sub2) this).anInt10223 = i_694_ * -372688989;
		method9507();
	}

	public void method1878(int i, int i_695_, int i_696_, int i_697_, int i_698_, int i_699_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
				i_696_ -= 1179466163 * ((Class106_Sub2) this).anInt10220 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i_695_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
				i_697_ -= ((Class106_Sub2) this).anInt10222 * 2029354259 - i_695_;
				i_695_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_696_ + i > 892939761 * ((Class106_Sub2) this).anInt10221)
				i_696_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			if (i_695_ + i_697_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_697_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_695_;
			if (i_696_ > 0 && i_697_ > 0 && i <= 892939761 * ((Class106_Sub2) this).anInt10221 && i_695_ <= 1704244235 * ((Class106_Sub2) this).anInt10223) {
				int i_700_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_696_;
				int i_701_ = i + i_695_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				int i_702_ = i_698_ >>> 24;
				if (0 == i_699_ || 1 == i_699_ && 255 == i_702_) {
					int i_703_ = i_696_ >> 3;
					int i_704_ = i_696_ & 0x7;
					i_696_ = i_701_ - 1;
					for (int i_705_ = -i_697_; i_705_ < 0; i_705_++) {
						if (i_703_ > 0) {
							i = i_703_;
							do {
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
							} while (--i > 0);
						}
						if (i_704_ > 0) {
							i = i_704_;
							do
								((Class106_Sub2) this).anIntArray10218[++i_696_] = i_698_;
							while (--i > 0);
						}
						i_696_ += i_700_;
					}
				} else if (1 == i_699_) {
					i_698_ = (((i_698_ & 0xff00ff) * i_702_ >> 8 & 0xff00ff) + (i_702_ * ((i_698_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_706_ = 256 - i_702_;
					for (int i_707_ = 0; i_707_ < i_697_; i_707_++) {
						for (int i_708_ = -i_696_; i_708_ < 0; i_708_++) {
							int i_709_ = (((Class106_Sub2) this).anIntArray10218[i_701_]);
							i_709_ = (((i_709_ & 0xff00ff) * i_706_ >> 8 & 0xff00ff) + (((i_709_ & ~0xff00ff) >>> 8) * i_706_ & ~0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_701_++] = i_698_ + i_709_;
						}
						i_701_ += i_700_;
					}
				} else if (i_699_ == 2) {
					for (int i_710_ = 0; i_710_ < i_697_; i_710_++) {
						for (int i_711_ = -i_696_; i_711_ < 0; i_711_++) {
							int i_712_ = (((Class106_Sub2) this).anIntArray10218[i_701_]);
							int i_713_ = i_698_ + i_712_;
							int i_714_ = (i_698_ & 0xff00ff) + (i_712_ & 0xff00ff);
							i_712_ = (i_713_ - i_714_ & 0x10000) + (i_714_ & 0x1000100);
							((Class106_Sub2) this).anIntArray10218[i_701_++] = i_713_ - i_712_ | i_712_ - (i_712_ >>> 8);
						}
						i_701_ += i_700_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1793() {
		/* empty */
	}

	void method1733(int i, int i_715_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9923(i, i_715_);
		if (null != anInterface5_1408)
			anInterface5_1408.method22((byte) 11);
	}

	public int method1847() {
		return -1;
	}

	void method2013(int i, int i_716_, int i_717_, int i_718_, int i_719_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i_716_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_716_ < 1704244235 * ((Class106_Sub2) this).anInt10223)) {
			if (i < ((Class106_Sub2) this).anInt10220 * 1179466163) {
				i_717_ -= ((Class106_Sub2) this).anInt10220 * 1179466163 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i + i_717_ > ((Class106_Sub2) this).anInt10221 * 892939761)
				i_717_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			int i_720_ = i + ((Class106_Sub2) this).anInt10217 * -994907113 * i_716_;
			int i_721_ = i_718_ >>> 24;
			if (0 == i_719_ || i_719_ == 1 && 255 == i_721_) {
				for (int i_722_ = 0; i_722_ < i_717_; i_722_++)
					((Class106_Sub2) this).anIntArray10218[i_720_ + i_722_] = i_718_;
			} else if (i_719_ == 1) {
				i_718_ = ((i_721_ << 24) + ((i_721_ * (i_718_ & 0xff00ff) >> 8 & 0xff00ff) + (i_721_ * (i_718_ & 0xff00) >> 8 & 0xff00)));
				int i_723_ = 256 - i_721_;
				for (int i_724_ = 0; i_724_ < i_717_; i_724_++) {
					int i_725_ = (((Class106_Sub2) this).anIntArray10218[i_724_ + i_720_]);
					i_725_ = (((i_725_ & 0xff00ff) * i_723_ >> 8 & 0xff00ff) + (i_723_ * (i_725_ & 0xff00) >> 8 & 0xff00));
					((Class106_Sub2) this).anIntArray10218[i_724_ + i_720_] = i_718_ + i_725_;
				}
			} else if (i_719_ == 2) {
				for (int i_726_ = 0; i_726_ < i_717_; i_726_++) {
					int i_727_ = (((Class106_Sub2) this).anIntArray10218[i_720_ + i_726_]);
					int i_728_ = i_727_ + i_718_;
					int i_729_ = (i_718_ & 0xff00ff) + (i_727_ & 0xff00ff);
					i_727_ = (i_728_ - i_729_ & 0x10000) + (i_729_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_720_ + i_726_] = i_728_ - i_727_ | i_727_ - (i_727_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method9521() {
		((Class106_Sub2) this).aClass250_10231.method3446(((Class106_Sub2) this).aClass261_10230);
		((Class106_Sub2) this).aClass250_10233.method3442(((Class106_Sub2) this).aClass250_10231);
		((Class106_Sub2) this).aClass250_10233.method3445(((Class106_Sub2) this).aClass250_10232);
		((Class106_Sub2) this).aClass250_10233.method3459(((Class106_Sub2) this).aFloatArrayArray10245[0]);
		((Class106_Sub2) this).aClass250_10233.method3460(((Class106_Sub2) this).aFloatArrayArray10245[1]);
		((Class106_Sub2) this).aClass250_10233.method3455(((Class106_Sub2) this).aFloatArrayArray10245[2]);
		((Class106_Sub2) this).aClass250_10233.method3475(((Class106_Sub2) this).aFloatArrayArray10245[3]);
		((Class106_Sub2) this).aClass250_10233.method3457(((Class106_Sub2) this).aFloatArrayArray10245[4]);
		((Class106_Sub2) this).aClass250_10233.method3456(((Class106_Sub2) this).aFloatArrayArray10245[5]);
		float f = ((Class106_Sub2) this).aClass250_10232.method3487();
		float f_730_ = (((f - 255.0F) * ((Class106_Sub2) this).aClass250_10232.aFloatArray2728[10]) + ((Class106_Sub2) this).aClass250_10232.aFloatArray2728[14]);
		float f_731_ = (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[14] + f * (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[10]));
		float f_732_ = f_731_ - f_730_;
		for (int i = 0; i < ((Class106_Sub2) this).anInt10225 * -1641029431; i++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i];
			((Class186) class186).aFloat2177 = f_730_;
			((Class186) class186).aFloat2181 = f_732_;
		}
	}

	public Class174 method1909(int i, int i_733_, int[][] is, int[][] is_734_, int i_735_, int i_736_, int i_737_) {
		return new Class174_Sub2(this, i_736_, i_737_, i, i_733_, is, is_734_, i_735_);
	}

	public boolean method1809() {
		return false;
	}

	void method1800(int i, int i_738_, int i_739_, int i_740_, int i_741_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < 892939761 * ((Class106_Sub2) this).anInt10221)) {
			if (i_738_ < ((Class106_Sub2) this).anInt10222 * 2029354259) {
				i_739_ -= ((Class106_Sub2) this).anInt10222 * 2029354259 - i_738_;
				i_738_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_738_ + i_739_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_739_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_738_;
			int i_742_ = i + i_738_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
			int i_743_ = i_740_ >>> 24;
			if (i_741_ == 0 || i_741_ == 1 && i_743_ == 255) {
				for (int i_744_ = 0; i_744_ < i_739_; i_744_++)
					((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_744_) + i_742_] = i_740_;
			} else if (i_741_ == 1) {
				i_740_ = (i_743_ << 24) + ((i_743_ * (i_740_ & 0xff00) >> 8 & 0xff00) + ((i_740_ & 0xff00ff) * i_743_ >> 8 & 0xff00ff));
				int i_745_ = 256 - i_743_;
				for (int i_746_ = 0; i_746_ < i_739_; i_746_++) {
					int i_747_ = i_742_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_746_);
					int i_748_ = ((Class106_Sub2) this).anIntArray10218[i_747_];
					i_748_ = (((i_748_ & 0xff00) * i_745_ >> 8 & 0xff00) + ((i_748_ & 0xff00ff) * i_745_ >> 8 & 0xff00ff));
					((Class106_Sub2) this).anIntArray10218[i_747_] = i_740_ + i_748_;
				}
			} else if (i_741_ == 2) {
				for (int i_749_ = 0; i_749_ < i_739_; i_749_++) {
					int i_750_ = (i_742_ + i_749_ * (-994907113 * ((Class106_Sub2) this).anInt10217));
					int i_751_ = ((Class106_Sub2) this).anIntArray10218[i_750_];
					int i_752_ = i_751_ + i_740_;
					int i_753_ = (i_740_ & 0xff00ff) + (i_751_ & 0xff00ff);
					i_751_ = (i_752_ - i_753_ & 0x10000) + (i_753_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_750_] = i_752_ - i_751_ | i_751_ - (i_751_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1813(int i, int i_754_, int i_755_, int i_756_, int i_757_, int i_758_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			i_755_ -= i;
			i_756_ -= i_754_;
			if (0 == i_756_) {
				if (i_755_ >= 0)
					method1728(i, i_754_, i_755_ + 1, i_757_, i_758_);
				else
					method1728(i + i_755_, i_754_, 1 + -i_755_, i_757_, i_758_);
			} else if (i_755_ == 0) {
				if (i_756_ >= 0)
					method1678(i, i_754_, 1 + i_756_, i_757_, i_758_);
				else
					method1678(i, i_754_ + i_756_, -i_756_ + 1, i_757_, i_758_);
			} else {
				if (i_755_ + i_756_ < 0) {
					i += i_755_;
					i_755_ = -i_755_;
					i_754_ += i_756_;
					i_756_ = -i_756_;
				}
				if (i_755_ > i_756_) {
					i_754_ <<= 16;
					i_754_ += 32768;
					i_756_ <<= 16;
					int i_759_ = (int) Math.floor((double) i_756_ / (double) i_755_ + 0.5);
					i_755_ += i;
					if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
						i_754_ += (1179466163 * ((Class106_Sub2) this).anInt10220 - i) * i_759_;
						i = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (i_755_ >= 892939761 * ((Class106_Sub2) this).anInt10221)
						i_755_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_760_ = i_757_ >>> 24;
					if (i_758_ == 0 || 1 == i_758_ && 255 == i_760_) {
						for (/**/; i <= i_755_; i++) {
							int i_761_ = i_754_ >> 16;
							if (i_761_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_761_ < (((Class106_Sub2) this).anInt10223 * 1704244235))
								((Class106_Sub2) this).anIntArray10218[i + (i_761_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_757_;
							i_754_ += i_759_;
						}
					} else if (i_758_ == 1) {
						i_757_ = (((i_757_ & 0xff00) * i_760_ >> 8 & 0xff00) + (i_760_ * (i_757_ & 0xff00ff) >> 8 & 0xff00ff) + (i_760_ << 24));
						int i_762_ = 256 - i_760_;
						for (/**/; i <= i_755_; i++) {
							int i_763_ = i_754_ >> 16;
							if (i_763_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_763_ < 1704244235 * ((Class106_Sub2) this).anInt10223) {
								int i_764_ = i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_763_);
								int i_765_ = (((Class106_Sub2) this).anIntArray10218[i_764_]);
								i_765_ = (((i_765_ & 0xff00) * i_762_ >> 8 & 0xff00) + ((i_765_ & 0xff00ff) * i_762_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_764_] = i_765_ + i_757_;
							}
							i_754_ += i_759_;
						}
					} else if (2 == i_758_) {
						for (/**/; i <= i_755_; i++) {
							int i_766_ = i_754_ >> 16;
							if (i_766_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_766_ < (((Class106_Sub2) this).anInt10223 * 1704244235)) {
								int i_767_ = (((Class106_Sub2) this).anInt10217 * -994907113 * i_766_) + i;
								int i_768_ = (((Class106_Sub2) this).anIntArray10218[i_767_]);
								int i_769_ = i_768_ + i_757_;
								int i_770_ = ((i_768_ & 0xff00ff) + (i_757_ & 0xff00ff));
								i_768_ = (i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000);
								((Class106_Sub2) this).anIntArray10218[i_767_] = i_769_ - i_768_ | i_768_ - (i_768_ >>> 8);
							}
							i_754_ += i_759_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_755_ <<= 16;
					int i_771_ = (int) Math.floor((double) i_755_ / (double) i_756_ + 0.5);
					i_756_ += i_754_;
					if (i_754_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
						i += (i_771_ * (((Class106_Sub2) this).anInt10222 * 2029354259 - i_754_));
						i_754_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
					}
					if (i_756_ >= ((Class106_Sub2) this).anInt10223 * 1704244235)
						i_756_ = (1704244235 * ((Class106_Sub2) this).anInt10223 - 1);
					int i_772_ = i_757_ >>> 24;
					if (0 == i_758_ || 1 == i_758_ && i_772_ == 255) {
						for (/**/; i_754_ <= i_756_; i_754_++) {
							int i_773_ = i >> 16;
							if (i_773_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_773_ < (((Class106_Sub2) this).anInt10221 * 892939761))
								((Class106_Sub2) this).anIntArray10218[(-994907113 * ((Class106_Sub2) this).anInt10217 * i_754_) + i_773_] = i_757_;
							i += i_771_;
						}
					} else if (1 == i_758_) {
						i_757_ = ((i_772_ << 24) + (((i_757_ & 0xff00) * i_772_ >> 8 & 0xff00) + (i_772_ * (i_757_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_774_ = 256 - i_772_;
						for (/**/; i_754_ <= i_756_; i_754_++) {
							int i_775_ = i >> 16;
							if (i_775_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_775_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_776_ = (i_775_ + (i_754_ * (((Class106_Sub2) this).anInt10217 * -994907113)));
								int i_777_ = (((Class106_Sub2) this).anIntArray10218[i_776_]);
								i_777_ = ((i_774_ * (i_777_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_777_ & 0xff00) * i_774_ >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[(i_754_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_775_] = i_757_ + i_777_;
							}
							i += i_771_;
						}
					} else if (2 == i_758_) {
						for (/**/; i_754_ <= i_756_; i_754_++) {
							int i_778_ = i >> 16;
							if (i_778_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_778_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_779_ = (i_778_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_754_));
								int i_780_ = (((Class106_Sub2) this).anIntArray10218[i_779_]);
								int i_781_ = i_757_ + i_780_;
								int i_782_ = ((i_757_ & 0xff00ff) + (i_780_ & 0xff00ff));
								i_780_ = ((i_781_ - i_782_ & 0x10000) + (i_782_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_779_] = i_781_ - i_780_ | i_780_ - (i_780_ >>> 8);
							}
							i += i_771_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1887(int i, int i_783_, int i_784_, int i_785_, int i_786_, int i_787_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			i_784_ -= i;
			i_785_ -= i_783_;
			if (0 == i_785_) {
				if (i_784_ >= 0)
					method1728(i, i_783_, i_784_ + 1, i_786_, i_787_);
				else
					method1728(i + i_784_, i_783_, 1 + -i_784_, i_786_, i_787_);
			} else if (i_784_ == 0) {
				if (i_785_ >= 0)
					method1678(i, i_783_, 1 + i_785_, i_786_, i_787_);
				else
					method1678(i, i_783_ + i_785_, -i_785_ + 1, i_786_, i_787_);
			} else {
				if (i_784_ + i_785_ < 0) {
					i += i_784_;
					i_784_ = -i_784_;
					i_783_ += i_785_;
					i_785_ = -i_785_;
				}
				if (i_784_ > i_785_) {
					i_783_ <<= 16;
					i_783_ += 32768;
					i_785_ <<= 16;
					int i_788_ = (int) Math.floor((double) i_785_ / (double) i_784_ + 0.5);
					i_784_ += i;
					if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
						i_783_ += (1179466163 * ((Class106_Sub2) this).anInt10220 - i) * i_788_;
						i = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (i_784_ >= 892939761 * ((Class106_Sub2) this).anInt10221)
						i_784_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_789_ = i_786_ >>> 24;
					if (i_787_ == 0 || 1 == i_787_ && 255 == i_789_) {
						for (/**/; i <= i_784_; i++) {
							int i_790_ = i_783_ >> 16;
							if (i_790_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_790_ < (((Class106_Sub2) this).anInt10223 * 1704244235))
								((Class106_Sub2) this).anIntArray10218[i + (i_790_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_786_;
							i_783_ += i_788_;
						}
					} else if (i_787_ == 1) {
						i_786_ = (((i_786_ & 0xff00) * i_789_ >> 8 & 0xff00) + (i_789_ * (i_786_ & 0xff00ff) >> 8 & 0xff00ff) + (i_789_ << 24));
						int i_791_ = 256 - i_789_;
						for (/**/; i <= i_784_; i++) {
							int i_792_ = i_783_ >> 16;
							if (i_792_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_792_ < 1704244235 * ((Class106_Sub2) this).anInt10223) {
								int i_793_ = i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_792_);
								int i_794_ = (((Class106_Sub2) this).anIntArray10218[i_793_]);
								i_794_ = (((i_794_ & 0xff00) * i_791_ >> 8 & 0xff00) + ((i_794_ & 0xff00ff) * i_791_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_793_] = i_794_ + i_786_;
							}
							i_783_ += i_788_;
						}
					} else if (2 == i_787_) {
						for (/**/; i <= i_784_; i++) {
							int i_795_ = i_783_ >> 16;
							if (i_795_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_795_ < (((Class106_Sub2) this).anInt10223 * 1704244235)) {
								int i_796_ = (((Class106_Sub2) this).anInt10217 * -994907113 * i_795_) + i;
								int i_797_ = (((Class106_Sub2) this).anIntArray10218[i_796_]);
								int i_798_ = i_797_ + i_786_;
								int i_799_ = ((i_797_ & 0xff00ff) + (i_786_ & 0xff00ff));
								i_797_ = (i_799_ & 0x1000100) + (i_798_ - i_799_ & 0x10000);
								((Class106_Sub2) this).anIntArray10218[i_796_] = i_798_ - i_797_ | i_797_ - (i_797_ >>> 8);
							}
							i_783_ += i_788_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_784_ <<= 16;
					int i_800_ = (int) Math.floor((double) i_784_ / (double) i_785_ + 0.5);
					i_785_ += i_783_;
					if (i_783_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
						i += (i_800_ * (((Class106_Sub2) this).anInt10222 * 2029354259 - i_783_));
						i_783_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
					}
					if (i_785_ >= ((Class106_Sub2) this).anInt10223 * 1704244235)
						i_785_ = (1704244235 * ((Class106_Sub2) this).anInt10223 - 1);
					int i_801_ = i_786_ >>> 24;
					if (0 == i_787_ || 1 == i_787_ && i_801_ == 255) {
						for (/**/; i_783_ <= i_785_; i_783_++) {
							int i_802_ = i >> 16;
							if (i_802_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_802_ < (((Class106_Sub2) this).anInt10221 * 892939761))
								((Class106_Sub2) this).anIntArray10218[(-994907113 * ((Class106_Sub2) this).anInt10217 * i_783_) + i_802_] = i_786_;
							i += i_800_;
						}
					} else if (1 == i_787_) {
						i_786_ = ((i_801_ << 24) + (((i_786_ & 0xff00) * i_801_ >> 8 & 0xff00) + (i_801_ * (i_786_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_803_ = 256 - i_801_;
						for (/**/; i_783_ <= i_785_; i_783_++) {
							int i_804_ = i >> 16;
							if (i_804_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_804_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_805_ = (i_804_ + (i_783_ * (((Class106_Sub2) this).anInt10217 * -994907113)));
								int i_806_ = (((Class106_Sub2) this).anIntArray10218[i_805_]);
								i_806_ = ((i_803_ * (i_806_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_806_ & 0xff00) * i_803_ >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[(i_783_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_804_] = i_786_ + i_806_;
							}
							i += i_800_;
						}
					} else if (2 == i_787_) {
						for (/**/; i_783_ <= i_785_; i_783_++) {
							int i_807_ = i >> 16;
							if (i_807_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_807_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_808_ = (i_807_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_783_));
								int i_809_ = (((Class106_Sub2) this).anIntArray10218[i_808_]);
								int i_810_ = i_786_ + i_809_;
								int i_811_ = ((i_786_ & 0xff00ff) + (i_809_ & 0xff00ff));
								i_809_ = ((i_810_ - i_811_ & 0x10000) + (i_811_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_808_] = i_810_ - i_809_ | i_809_ - (i_809_ >>> 8);
							}
							i += i_800_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1979(int i, int i_812_, int i_813_, int i_814_, int i_815_, int i_816_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			i_813_ -= i;
			i_814_ -= i_812_;
			if (0 == i_814_) {
				if (i_813_ >= 0)
					method1728(i, i_812_, i_813_ + 1, i_815_, i_816_);
				else
					method1728(i + i_813_, i_812_, 1 + -i_813_, i_815_, i_816_);
			} else if (i_813_ == 0) {
				if (i_814_ >= 0)
					method1678(i, i_812_, 1 + i_814_, i_815_, i_816_);
				else
					method1678(i, i_812_ + i_814_, -i_814_ + 1, i_815_, i_816_);
			} else {
				if (i_813_ + i_814_ < 0) {
					i += i_813_;
					i_813_ = -i_813_;
					i_812_ += i_814_;
					i_814_ = -i_814_;
				}
				if (i_813_ > i_814_) {
					i_812_ <<= 16;
					i_812_ += 32768;
					i_814_ <<= 16;
					int i_817_ = (int) Math.floor((double) i_814_ / (double) i_813_ + 0.5);
					i_813_ += i;
					if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
						i_812_ += (1179466163 * ((Class106_Sub2) this).anInt10220 - i) * i_817_;
						i = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (i_813_ >= 892939761 * ((Class106_Sub2) this).anInt10221)
						i_813_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_818_ = i_815_ >>> 24;
					if (i_816_ == 0 || 1 == i_816_ && 255 == i_818_) {
						for (/**/; i <= i_813_; i++) {
							int i_819_ = i_812_ >> 16;
							if (i_819_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_819_ < (((Class106_Sub2) this).anInt10223 * 1704244235))
								((Class106_Sub2) this).anIntArray10218[i + (i_819_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_815_;
							i_812_ += i_817_;
						}
					} else if (i_816_ == 1) {
						i_815_ = (((i_815_ & 0xff00) * i_818_ >> 8 & 0xff00) + (i_818_ * (i_815_ & 0xff00ff) >> 8 & 0xff00ff) + (i_818_ << 24));
						int i_820_ = 256 - i_818_;
						for (/**/; i <= i_813_; i++) {
							int i_821_ = i_812_ >> 16;
							if (i_821_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_821_ < 1704244235 * ((Class106_Sub2) this).anInt10223) {
								int i_822_ = i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_821_);
								int i_823_ = (((Class106_Sub2) this).anIntArray10218[i_822_]);
								i_823_ = (((i_823_ & 0xff00) * i_820_ >> 8 & 0xff00) + ((i_823_ & 0xff00ff) * i_820_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_822_] = i_823_ + i_815_;
							}
							i_812_ += i_817_;
						}
					} else if (2 == i_816_) {
						for (/**/; i <= i_813_; i++) {
							int i_824_ = i_812_ >> 16;
							if (i_824_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_824_ < (((Class106_Sub2) this).anInt10223 * 1704244235)) {
								int i_825_ = (((Class106_Sub2) this).anInt10217 * -994907113 * i_824_) + i;
								int i_826_ = (((Class106_Sub2) this).anIntArray10218[i_825_]);
								int i_827_ = i_826_ + i_815_;
								int i_828_ = ((i_826_ & 0xff00ff) + (i_815_ & 0xff00ff));
								i_826_ = (i_828_ & 0x1000100) + (i_827_ - i_828_ & 0x10000);
								((Class106_Sub2) this).anIntArray10218[i_825_] = i_827_ - i_826_ | i_826_ - (i_826_ >>> 8);
							}
							i_812_ += i_817_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_813_ <<= 16;
					int i_829_ = (int) Math.floor((double) i_813_ / (double) i_814_ + 0.5);
					i_814_ += i_812_;
					if (i_812_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
						i += (i_829_ * (((Class106_Sub2) this).anInt10222 * 2029354259 - i_812_));
						i_812_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
					}
					if (i_814_ >= ((Class106_Sub2) this).anInt10223 * 1704244235)
						i_814_ = (1704244235 * ((Class106_Sub2) this).anInt10223 - 1);
					int i_830_ = i_815_ >>> 24;
					if (0 == i_816_ || 1 == i_816_ && i_830_ == 255) {
						for (/**/; i_812_ <= i_814_; i_812_++) {
							int i_831_ = i >> 16;
							if (i_831_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_831_ < (((Class106_Sub2) this).anInt10221 * 892939761))
								((Class106_Sub2) this).anIntArray10218[(-994907113 * ((Class106_Sub2) this).anInt10217 * i_812_) + i_831_] = i_815_;
							i += i_829_;
						}
					} else if (1 == i_816_) {
						i_815_ = ((i_830_ << 24) + (((i_815_ & 0xff00) * i_830_ >> 8 & 0xff00) + (i_830_ * (i_815_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_832_ = 256 - i_830_;
						for (/**/; i_812_ <= i_814_; i_812_++) {
							int i_833_ = i >> 16;
							if (i_833_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_833_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_834_ = (i_833_ + (i_812_ * (((Class106_Sub2) this).anInt10217 * -994907113)));
								int i_835_ = (((Class106_Sub2) this).anIntArray10218[i_834_]);
								i_835_ = ((i_832_ * (i_835_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_835_ & 0xff00) * i_832_ >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[(i_812_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_833_] = i_815_ + i_835_;
							}
							i += i_829_;
						}
					} else if (2 == i_816_) {
						for (/**/; i_812_ <= i_814_; i_812_++) {
							int i_836_ = i >> 16;
							if (i_836_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_836_ < 892939761 * (((Class106_Sub2) this).anInt10221)) {
								int i_837_ = (i_836_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_812_));
								int i_838_ = (((Class106_Sub2) this).anIntArray10218[i_837_]);
								int i_839_ = i_815_ + i_838_;
								int i_840_ = ((i_815_ & 0xff00ff) + (i_838_ & 0xff00ff));
								i_838_ = ((i_839_ - i_840_ & 0x10000) + (i_840_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_837_] = i_839_ - i_838_ | i_838_ - (i_838_ >>> 8);
							}
							i += i_829_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1894(int i, int i_841_, int i_842_, int i_843_, int i_844_, int i_845_, Class167 class167, int i_846_, int i_847_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_848_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_849_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_847_ ? 2029354259 * ((Class106_Sub2) this).anInt10222 : i_847_);
			int i_850_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_847_) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : i_847_ + is.length);
			i_842_ -= i;
			i_843_ -= i_841_;
			if (i_842_ + i_843_ < 0) {
				i += i_842_;
				i_842_ = -i_842_;
				i_841_ += i_843_;
				i_843_ = -i_843_;
			}
			if (i_842_ > i_843_) {
				i_841_ <<= 16;
				i_841_ += 32768;
				i_843_ <<= 16;
				int i_851_ = (int) Math.floor((double) i_843_ / (double) i_842_ + 0.5);
				i_842_ += i;
				if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
					i_841_ += i_851_ * ((1179466163 * ((Class106_Sub2) this).anInt10220) - i);
					i = ((Class106_Sub2) this).anInt10220 * 1179466163;
				}
				if (i_842_ >= ((Class106_Sub2) this).anInt10221 * 892939761)
					i_842_ = 892939761 * ((Class106_Sub2) this).anInt10221 - 1;
				int i_852_ = i_844_ >>> 24;
				if (0 == i_845_ || 1 == i_845_ && i_852_ == 255) {
					for (/**/; i <= i_842_; i++) {
						int i_853_ = i_841_ >> 16;
						int i_854_ = i_853_ - i_847_;
						if (i_853_ >= i_849_ && i_853_ < i_850_) {
							int i_855_ = i_846_ + is[i_854_];
							if (i >= i_855_ && i < is_848_[i_854_] + i_855_)
								((Class106_Sub2) this).anIntArray10218[i + (i_853_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_844_;
						}
						i_841_ += i_851_;
					}
				} else if (i_845_ == 1) {
					i_844_ = ((i_852_ << 24) + ((i_852_ * (i_844_ & 0xff00) >> 8 & 0xff00) + ((i_844_ & 0xff00ff) * i_852_ >> 8 & 0xff00ff)));
					int i_856_ = 256 - i_852_;
					for (/**/; i <= i_842_; i++) {
						int i_857_ = i_841_ >> 16;
						int i_858_ = i_857_ - i_847_;
						if (i_857_ >= i_849_ && i_857_ < i_850_) {
							int i_859_ = is[i_858_] + i_846_;
							if (i >= i_859_ && i < is_848_[i_858_] + i_859_) {
								int i_860_ = i + (i_857_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_861_ = (((Class106_Sub2) this).anIntArray10218[i_860_]);
								i_861_ = ((i_856_ * (i_861_ & 0xff00ff) >> 8 & 0xff00ff) + (i_856_ * (i_861_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_860_] = i_844_ + i_861_;
							}
						}
						i_841_ += i_851_;
					}
				} else if (2 == i_845_) {
					for (/**/; i <= i_842_; i++) {
						int i_862_ = i_841_ >> 16;
						int i_863_ = i_862_ - i_847_;
						if (i_862_ >= i_849_ && i_862_ < i_850_) {
							int i_864_ = i_846_ + is[i_863_];
							if (i >= i_864_ && i < i_864_ + is_848_[i_863_]) {
								int i_865_ = (i_862_ * (-994907113 * (((Class106_Sub2) this).anInt10217)) + i);
								int i_866_ = (((Class106_Sub2) this).anIntArray10218[i_865_]);
								int i_867_ = i_866_ + i_844_;
								int i_868_ = ((i_844_ & 0xff00ff) + (i_866_ & 0xff00ff));
								i_866_ = ((i_867_ - i_868_ & 0x10000) + (i_868_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_865_] = i_867_ - i_866_ | i_866_ - (i_866_ >>> 8);
							}
						}
						i_841_ += i_851_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_842_ <<= 16;
				int i_869_ = (int) Math.floor((double) i_842_ / (double) i_843_ + 0.5);
				i_843_ += i_841_;
				if (i_841_ < i_849_) {
					i += (i_849_ - i_841_) * i_869_;
					i_841_ = i_849_;
				}
				if (i_843_ >= i_850_)
					i_843_ = i_850_ - 1;
				int i_870_ = i_844_ >>> 24;
				if (i_845_ == 0 || i_845_ == 1 && i_870_ == 255) {
					for (/**/; i_841_ <= i_843_; i_841_++) {
						int i_871_ = i >> 16;
						int i_872_ = i_841_ - i_847_;
						int i_873_ = i_846_ + is[i_872_];
						if ((i_871_ >= ((Class106_Sub2) this).anInt10220 * 1179466163) && i_871_ < (892939761 * ((Class106_Sub2) this).anInt10221) && i_871_ >= i_873_ && i_871_ < i_873_ + is_848_[i_872_])
							((Class106_Sub2) this).anIntArray10218[i_871_ + i_841_ * (-994907113 * (((Class106_Sub2) this).anInt10217))] = i_844_;
						i += i_869_;
					}
				} else if (i_845_ == 1) {
					i_844_ = (((i_844_ & 0xff00ff) * i_870_ >> 8 & 0xff00ff) + ((i_844_ & 0xff00) * i_870_ >> 8 & 0xff00) + (i_870_ << 24));
					int i_874_ = 256 - i_870_;
					for (/**/; i_841_ <= i_843_; i_841_++) {
						int i_875_ = i >> 16;
						int i_876_ = i_841_ - i_847_;
						int i_877_ = i_846_ + is[i_876_];
						if ((i_875_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_875_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_875_ >= i_877_ && i_875_ < is_848_[i_876_] + i_877_) {
							int i_878_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_841_) + i_875_);
							int i_879_ = (((Class106_Sub2) this).anIntArray10218[i_878_]);
							i_879_ = (((i_879_ & 0xff00) * i_874_ >> 8 & 0xff00) + ((i_879_ & 0xff00ff) * i_874_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_841_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_875_] = i_844_ + i_879_;
						}
						i += i_869_;
					}
				} else if (2 == i_845_) {
					for (/**/; i_841_ <= i_843_; i_841_++) {
						int i_880_ = i >> 16;
						int i_881_ = i_841_ - i_847_;
						int i_882_ = is[i_881_] + i_846_;
						if ((i_880_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_880_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_880_ >= i_882_ && i_880_ < i_882_ + is_848_[i_881_]) {
							int i_883_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_841_) + i_880_);
							int i_884_ = (((Class106_Sub2) this).anIntArray10218[i_883_]);
							int i_885_ = i_844_ + i_884_;
							int i_886_ = (i_844_ & 0xff00ff) + (i_884_ & 0xff00ff);
							i_884_ = (i_886_ & 0x1000100) + (i_885_ - i_886_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_883_] = i_885_ - i_884_ | i_884_ - (i_884_ >>> 8);
						}
						i += i_869_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Class174 method1930(int i, int i_887_, int[][] is, int[][] is_888_, int i_889_, int i_890_, int i_891_) {
		return new Class174_Sub2(this, i_890_, i_891_, i, i_887_, is, is_888_, i_889_);
	}

	public void method1891(int i, int i_892_, int i_893_, int i_894_, int i_895_, int i_896_, int i_897_, int i_898_, int i_899_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			i_893_ -= i;
			i_894_ -= i_892_;
			if (i_894_ == 0) {
				if (i_893_ >= 0)
					method9508(i, i_892_, i_893_ + 1, i_895_, i_896_, i_897_, i_898_, i_899_);
				else {
					int i_900_ = i_898_ + i_897_;
					i_899_ %= i_900_;
					i_899_ = i_897_ + i_900_ - i_899_ - (1 + -i_893_) % i_900_;
					i_899_ %= i_900_;
					if (i_899_ < 0)
						i_899_ += i_900_;
					method9508(i_893_ + i, i_892_, 1 + -i_893_, i_895_, i_896_, i_897_, i_898_, i_899_);
				}
			} else if (i_893_ == 0) {
				if (i_894_ >= 0)
					method9509(i, i_892_, 1 + i_894_, i_895_, i_896_, i_897_, i_898_, i_899_);
				else {
					int i_901_ = i_897_ + i_898_;
					i_899_ %= i_901_;
					i_899_ = i_901_ + i_897_ - i_899_ - (-i_894_ + 1) % i_901_;
					i_899_ %= i_901_;
					if (i_899_ < 0)
						i_899_ += i_901_;
					method9509(i, i_892_ + i_894_, -i_894_ + 1, i_895_, i_896_, i_897_, i_898_, i_899_);
				}
			} else {
				i_899_ <<= 8;
				i_897_ <<= 8;
				i_898_ <<= 8;
				int i_902_ = i_898_ + i_897_;
				i_899_ %= i_902_;
				if (i_893_ + i_894_ < 0) {
					int i_903_ = (int) (Math.sqrt((double) (i_894_ * i_894_ + i_893_ * i_893_)) * 256.0);
					int i_904_ = i_903_ % i_902_;
					i_899_ = i_897_ + i_902_ - i_899_ - i_904_;
					i_899_ %= i_902_;
					if (i_899_ < 0)
						i_899_ += i_902_;
					i += i_893_;
					i_893_ = -i_893_;
					i_892_ += i_894_;
					i_894_ = -i_894_;
				}
				if (i_893_ > i_894_) {
					i_892_ <<= 16;
					i_892_ += 32768;
					i_894_ <<= 16;
					int i_905_ = (int) Math.floor(0.5 + ((double) i_894_ / (double) i_893_));
					i_893_ += i;
					int i_906_ = i_895_ >>> 24;
					int i_907_ = (int) Math.sqrt((double) (65536 + (i_905_ >> 8) * (i_905_ >> 8)));
					if (i_896_ == 0 || 1 == i_896_ && 255 == i_906_) {
						while (i <= i_893_) {
							int i_908_ = i_892_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_908_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_908_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_899_ < i_897_)
								((Class106_Sub2) this).anIntArray10218[i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_908_)] = i_895_;
							i_892_ += i_905_;
							i++;
							i_899_ += i_907_;
							i_899_ %= i_902_;
						}
					} else if (1 == i_896_) {
						i_895_ = ((i_906_ << 24) + ((i_906_ * (i_895_ & 0xff00) >> 8 & 0xff00) + ((i_895_ & 0xff00ff) * i_906_ >> 8 & 0xff00ff)));
						int i_909_ = 256 - i_906_;
						while (i <= i_893_) {
							int i_910_ = i_892_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_910_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_910_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_899_ < i_897_) {
								int i_911_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_910_) + i);
								int i_912_ = (((Class106_Sub2) this).anIntArray10218[i_911_]);
								i_912_ = (((i_912_ & 0xff00) * i_909_ >> 8 & 0xff00) + ((i_912_ & 0xff00ff) * i_909_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_911_] = i_912_ + i_895_;
							}
							i_892_ += i_905_;
							i++;
							i_899_ += i_907_;
							i_899_ %= i_902_;
						}
					} else if (2 == i_896_) {
						while (i <= i_893_) {
							int i_913_ = i_892_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_913_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_913_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_899_ < i_897_) {
								int i_914_ = i + (i_913_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_915_ = (((Class106_Sub2) this).anIntArray10218[i_914_]);
								int i_916_ = i_895_ + i_915_;
								int i_917_ = ((i_915_ & 0xff00ff) + (i_895_ & 0xff00ff));
								i_915_ = ((i_916_ - i_917_ & 0x10000) + (i_917_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_914_] = i_916_ - i_915_ | i_915_ - (i_915_ >>> 8);
							}
							i_892_ += i_905_;
							i++;
							i_899_ += i_907_;
							i_899_ %= i_902_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_893_ <<= 16;
					int i_918_ = (int) Math.floor((double) i_893_ / (double) i_894_ + 0.5);
					i_894_ += i_892_;
					int i_919_ = i_895_ >>> 24;
					int i_920_ = (int) Math.sqrt((double) (65536 + (i_918_ >> 8) * (i_918_ >> 8)));
					if (i_896_ == 0 || i_896_ == 1 && 255 == i_919_) {
						while (i_892_ <= i_894_) {
							int i_921_ = i >> 16;
							if (i_892_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_892_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_921_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_921_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_899_ < i_897_)
								((Class106_Sub2) this).anIntArray10218[i_921_ + i_892_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_895_;
							i += i_918_;
							i_892_++;
							i_899_ += i_920_;
							i_899_ %= i_902_;
						}
					} else if (i_896_ == 1) {
						i_895_ = (((i_895_ & 0xff00ff) * i_919_ >> 8 & 0xff00ff) + ((i_895_ & 0xff00) * i_919_ >> 8 & 0xff00) + (i_919_ << 24));
						int i_922_ = 256 - i_919_;
						while (i_892_ <= i_894_) {
							int i_923_ = i >> 16;
							if (i_892_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_892_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_923_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_923_ < 892939761 * (((Class106_Sub2) this).anInt10221) && i_899_ < i_897_) {
								int i_924_ = (i_923_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_892_));
								int i_925_ = (((Class106_Sub2) this).anIntArray10218[i_924_]);
								i_925_ = ((i_922_ * (i_925_ & 0xff00) >> 8 & 0xff00) + ((i_925_ & 0xff00ff) * i_922_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[(i_892_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_923_] = i_925_ + i_895_;
							}
							i += i_918_;
							i_892_++;
							i_899_ += i_920_;
							i_899_ %= i_902_;
						}
					} else if (2 == i_896_) {
						while (i_892_ <= i_894_) {
							int i_926_ = i >> 16;
							if (i_892_ >= (2029354259 * ((Class106_Sub2) this).anInt10222) && i_892_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_926_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_926_ < 892939761 * (((Class106_Sub2) this).anInt10221) && i_899_ < i_897_) {
								int i_927_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_892_) + i_926_);
								int i_928_ = (((Class106_Sub2) this).anIntArray10218[i_927_]);
								int i_929_ = i_928_ + i_895_;
								int i_930_ = ((i_928_ & 0xff00ff) + (i_895_ & 0xff00ff));
								i_928_ = ((i_929_ - i_930_ & 0x10000) + (i_930_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_927_] = i_929_ - i_928_ | i_928_ - (i_928_ >>> 8);
							}
							i += i_918_;
							i_892_++;
							i_899_ += i_920_;
							i_899_ %= i_902_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1851(int i, int i_931_, int i_932_, int i_933_, int i_934_, int i_935_, Class167 class167, int i_936_, int i_937_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_938_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_939_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_937_ ? 2029354259 * ((Class106_Sub2) this).anInt10222 : i_937_);
			int i_940_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_937_) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : i_937_ + is.length);
			i_932_ -= i;
			i_933_ -= i_931_;
			if (i_932_ + i_933_ < 0) {
				i += i_932_;
				i_932_ = -i_932_;
				i_931_ += i_933_;
				i_933_ = -i_933_;
			}
			if (i_932_ > i_933_) {
				i_931_ <<= 16;
				i_931_ += 32768;
				i_933_ <<= 16;
				int i_941_ = (int) Math.floor((double) i_933_ / (double) i_932_ + 0.5);
				i_932_ += i;
				if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
					i_931_ += i_941_ * ((1179466163 * ((Class106_Sub2) this).anInt10220) - i);
					i = ((Class106_Sub2) this).anInt10220 * 1179466163;
				}
				if (i_932_ >= ((Class106_Sub2) this).anInt10221 * 892939761)
					i_932_ = 892939761 * ((Class106_Sub2) this).anInt10221 - 1;
				int i_942_ = i_934_ >>> 24;
				if (0 == i_935_ || 1 == i_935_ && i_942_ == 255) {
					for (/**/; i <= i_932_; i++) {
						int i_943_ = i_931_ >> 16;
						int i_944_ = i_943_ - i_937_;
						if (i_943_ >= i_939_ && i_943_ < i_940_) {
							int i_945_ = i_936_ + is[i_944_];
							if (i >= i_945_ && i < is_938_[i_944_] + i_945_)
								((Class106_Sub2) this).anIntArray10218[i + (i_943_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_934_;
						}
						i_931_ += i_941_;
					}
				} else if (i_935_ == 1) {
					i_934_ = ((i_942_ << 24) + ((i_942_ * (i_934_ & 0xff00) >> 8 & 0xff00) + ((i_934_ & 0xff00ff) * i_942_ >> 8 & 0xff00ff)));
					int i_946_ = 256 - i_942_;
					for (/**/; i <= i_932_; i++) {
						int i_947_ = i_931_ >> 16;
						int i_948_ = i_947_ - i_937_;
						if (i_947_ >= i_939_ && i_947_ < i_940_) {
							int i_949_ = is[i_948_] + i_936_;
							if (i >= i_949_ && i < is_938_[i_948_] + i_949_) {
								int i_950_ = i + (i_947_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_951_ = (((Class106_Sub2) this).anIntArray10218[i_950_]);
								i_951_ = ((i_946_ * (i_951_ & 0xff00ff) >> 8 & 0xff00ff) + (i_946_ * (i_951_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_950_] = i_934_ + i_951_;
							}
						}
						i_931_ += i_941_;
					}
				} else if (2 == i_935_) {
					for (/**/; i <= i_932_; i++) {
						int i_952_ = i_931_ >> 16;
						int i_953_ = i_952_ - i_937_;
						if (i_952_ >= i_939_ && i_952_ < i_940_) {
							int i_954_ = i_936_ + is[i_953_];
							if (i >= i_954_ && i < i_954_ + is_938_[i_953_]) {
								int i_955_ = (i_952_ * (-994907113 * (((Class106_Sub2) this).anInt10217)) + i);
								int i_956_ = (((Class106_Sub2) this).anIntArray10218[i_955_]);
								int i_957_ = i_956_ + i_934_;
								int i_958_ = ((i_934_ & 0xff00ff) + (i_956_ & 0xff00ff));
								i_956_ = ((i_957_ - i_958_ & 0x10000) + (i_958_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_955_] = i_957_ - i_956_ | i_956_ - (i_956_ >>> 8);
							}
						}
						i_931_ += i_941_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_932_ <<= 16;
				int i_959_ = (int) Math.floor((double) i_932_ / (double) i_933_ + 0.5);
				i_933_ += i_931_;
				if (i_931_ < i_939_) {
					i += (i_939_ - i_931_) * i_959_;
					i_931_ = i_939_;
				}
				if (i_933_ >= i_940_)
					i_933_ = i_940_ - 1;
				int i_960_ = i_934_ >>> 24;
				if (i_935_ == 0 || i_935_ == 1 && i_960_ == 255) {
					for (/**/; i_931_ <= i_933_; i_931_++) {
						int i_961_ = i >> 16;
						int i_962_ = i_931_ - i_937_;
						int i_963_ = i_936_ + is[i_962_];
						if ((i_961_ >= ((Class106_Sub2) this).anInt10220 * 1179466163) && i_961_ < (892939761 * ((Class106_Sub2) this).anInt10221) && i_961_ >= i_963_ && i_961_ < i_963_ + is_938_[i_962_])
							((Class106_Sub2) this).anIntArray10218[i_961_ + i_931_ * (-994907113 * (((Class106_Sub2) this).anInt10217))] = i_934_;
						i += i_959_;
					}
				} else if (i_935_ == 1) {
					i_934_ = (((i_934_ & 0xff00ff) * i_960_ >> 8 & 0xff00ff) + ((i_934_ & 0xff00) * i_960_ >> 8 & 0xff00) + (i_960_ << 24));
					int i_964_ = 256 - i_960_;
					for (/**/; i_931_ <= i_933_; i_931_++) {
						int i_965_ = i >> 16;
						int i_966_ = i_931_ - i_937_;
						int i_967_ = i_936_ + is[i_966_];
						if ((i_965_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_965_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_965_ >= i_967_ && i_965_ < is_938_[i_966_] + i_967_) {
							int i_968_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_931_) + i_965_);
							int i_969_ = (((Class106_Sub2) this).anIntArray10218[i_968_]);
							i_969_ = (((i_969_ & 0xff00) * i_964_ >> 8 & 0xff00) + ((i_969_ & 0xff00ff) * i_964_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_931_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_965_] = i_934_ + i_969_;
						}
						i += i_959_;
					}
				} else if (2 == i_935_) {
					for (/**/; i_931_ <= i_933_; i_931_++) {
						int i_970_ = i >> 16;
						int i_971_ = i_931_ - i_937_;
						int i_972_ = is[i_971_] + i_936_;
						if ((i_970_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_970_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_970_ >= i_972_ && i_970_ < i_972_ + is_938_[i_971_]) {
							int i_973_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_931_) + i_970_);
							int i_974_ = (((Class106_Sub2) this).anIntArray10218[i_973_]);
							int i_975_ = i_934_ + i_974_;
							int i_976_ = (i_934_ & 0xff00ff) + (i_974_ & 0xff00ff);
							i_974_ = (i_976_ & 0x1000100) + (i_975_ - i_976_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_973_] = i_975_ - i_974_ | i_974_ - (i_974_ >>> 8);
						}
						i += i_959_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1875(int i, int i_977_, int i_978_, int i_979_, int i_980_, int i_981_) {
		method1728(i, i_977_, i_978_, i_980_, i_981_);
		method1728(i, i_977_ + i_979_ - 1, i_978_, i_980_, i_981_);
		method1678(i, i_977_ + 1, i_979_ - 2, i_980_, i_981_);
		method1678(i + i_978_ - 1, 1 + i_977_, i_979_ - 2, i_980_, i_981_);
	}

	public void method1895(int i, int i_982_, int i_983_, int i_984_, int i_985_, int i_986_, Class167 class167, int i_987_, int i_988_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_989_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_990_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_988_ ? 2029354259 * ((Class106_Sub2) this).anInt10222 : i_988_);
			int i_991_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_988_) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : i_988_ + is.length);
			i_983_ -= i;
			i_984_ -= i_982_;
			if (i_983_ + i_984_ < 0) {
				i += i_983_;
				i_983_ = -i_983_;
				i_982_ += i_984_;
				i_984_ = -i_984_;
			}
			if (i_983_ > i_984_) {
				i_982_ <<= 16;
				i_982_ += 32768;
				i_984_ <<= 16;
				int i_992_ = (int) Math.floor((double) i_984_ / (double) i_983_ + 0.5);
				i_983_ += i;
				if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
					i_982_ += i_992_ * ((1179466163 * ((Class106_Sub2) this).anInt10220) - i);
					i = ((Class106_Sub2) this).anInt10220 * 1179466163;
				}
				if (i_983_ >= ((Class106_Sub2) this).anInt10221 * 892939761)
					i_983_ = 892939761 * ((Class106_Sub2) this).anInt10221 - 1;
				int i_993_ = i_985_ >>> 24;
				if (0 == i_986_ || 1 == i_986_ && i_993_ == 255) {
					for (/**/; i <= i_983_; i++) {
						int i_994_ = i_982_ >> 16;
						int i_995_ = i_994_ - i_988_;
						if (i_994_ >= i_990_ && i_994_ < i_991_) {
							int i_996_ = i_987_ + is[i_995_];
							if (i >= i_996_ && i < is_989_[i_995_] + i_996_)
								((Class106_Sub2) this).anIntArray10218[i + (i_994_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_985_;
						}
						i_982_ += i_992_;
					}
				} else if (i_986_ == 1) {
					i_985_ = ((i_993_ << 24) + ((i_993_ * (i_985_ & 0xff00) >> 8 & 0xff00) + ((i_985_ & 0xff00ff) * i_993_ >> 8 & 0xff00ff)));
					int i_997_ = 256 - i_993_;
					for (/**/; i <= i_983_; i++) {
						int i_998_ = i_982_ >> 16;
						int i_999_ = i_998_ - i_988_;
						if (i_998_ >= i_990_ && i_998_ < i_991_) {
							int i_1000_ = is[i_999_] + i_987_;
							if (i >= i_1000_ && i < is_989_[i_999_] + i_1000_) {
								int i_1001_ = i + (i_998_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_1002_ = (((Class106_Sub2) this).anIntArray10218[i_1001_]);
								i_1002_ = ((i_997_ * (i_1002_ & 0xff00ff) >> 8 & 0xff00ff) + (i_997_ * (i_1002_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1001_] = i_985_ + i_1002_;
							}
						}
						i_982_ += i_992_;
					}
				} else if (2 == i_986_) {
					for (/**/; i <= i_983_; i++) {
						int i_1003_ = i_982_ >> 16;
						int i_1004_ = i_1003_ - i_988_;
						if (i_1003_ >= i_990_ && i_1003_ < i_991_) {
							int i_1005_ = i_987_ + is[i_1004_];
							if (i >= i_1005_ && i < i_1005_ + is_989_[i_1004_]) {
								int i_1006_ = (i_1003_ * (-994907113 * (((Class106_Sub2) this).anInt10217)) + i);
								int i_1007_ = (((Class106_Sub2) this).anIntArray10218[i_1006_]);
								int i_1008_ = i_1007_ + i_985_;
								int i_1009_ = ((i_985_ & 0xff00ff) + (i_1007_ & 0xff00ff));
								i_1007_ = ((i_1008_ - i_1009_ & 0x10000) + (i_1009_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1006_] = i_1008_ - i_1007_ | i_1007_ - (i_1007_ >>> 8);
							}
						}
						i_982_ += i_992_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_983_ <<= 16;
				int i_1010_ = (int) Math.floor((double) i_983_ / (double) i_984_ + 0.5);
				i_984_ += i_982_;
				if (i_982_ < i_990_) {
					i += (i_990_ - i_982_) * i_1010_;
					i_982_ = i_990_;
				}
				if (i_984_ >= i_991_)
					i_984_ = i_991_ - 1;
				int i_1011_ = i_985_ >>> 24;
				if (i_986_ == 0 || i_986_ == 1 && i_1011_ == 255) {
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1012_ = i >> 16;
						int i_1013_ = i_982_ - i_988_;
						int i_1014_ = i_987_ + is[i_1013_];
						if ((i_1012_ >= ((Class106_Sub2) this).anInt10220 * 1179466163) && i_1012_ < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1012_ >= i_1014_ && i_1012_ < i_1014_ + is_989_[i_1013_])
							((Class106_Sub2) this).anIntArray10218[i_1012_ + i_982_ * (-994907113 * (((Class106_Sub2) this).anInt10217))] = i_985_;
						i += i_1010_;
					}
				} else if (i_986_ == 1) {
					i_985_ = (((i_985_ & 0xff00ff) * i_1011_ >> 8 & 0xff00ff) + ((i_985_ & 0xff00) * i_1011_ >> 8 & 0xff00) + (i_1011_ << 24));
					int i_1015_ = 256 - i_1011_;
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1016_ = i >> 16;
						int i_1017_ = i_982_ - i_988_;
						int i_1018_ = i_987_ + is[i_1017_];
						if ((i_1016_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_1016_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1016_ >= i_1018_ && i_1016_ < is_989_[i_1017_] + i_1018_) {
							int i_1019_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_982_) + i_1016_);
							int i_1020_ = (((Class106_Sub2) this).anIntArray10218[i_1019_]);
							i_1020_ = (((i_1020_ & 0xff00) * i_1015_ >> 8 & 0xff00) + ((i_1020_ & 0xff00ff) * i_1015_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_982_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1016_] = i_985_ + i_1020_;
						}
						i += i_1010_;
					}
				} else if (2 == i_986_) {
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1021_ = i >> 16;
						int i_1022_ = i_982_ - i_988_;
						int i_1023_ = is[i_1022_] + i_987_;
						if ((i_1021_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_1021_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1021_ >= i_1023_ && i_1021_ < i_1023_ + is_989_[i_1022_]) {
							int i_1024_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_982_) + i_1021_);
							int i_1025_ = (((Class106_Sub2) this).anIntArray10218[i_1024_]);
							int i_1026_ = i_985_ + i_1025_;
							int i_1027_ = (i_985_ & 0xff00ff) + (i_1025_ & 0xff00ff);
							i_1025_ = (i_1027_ & 0x1000100) + (i_1026_ - i_1027_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1024_] = i_1026_ - i_1025_ | i_1025_ - (i_1025_ >>> 8);
						}
						i += i_1010_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1896(int i, int i_1028_, int i_1029_, int i_1030_, int i_1031_, int i_1032_, Class167 class167, int i_1033_, int i_1034_, int i_1035_, int i_1036_, int i_1037_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1038_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1039_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_1034_ ? ((Class106_Sub2) this).anInt10222 * 2029354259 : i_1034_);
			int i_1040_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < i_1034_ + is.length) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : is.length + i_1034_);
			i_1037_ <<= 8;
			i_1035_ <<= 8;
			i_1036_ <<= 8;
			int i_1041_ = i_1036_ + i_1035_;
			i_1037_ %= i_1041_;
			i_1029_ -= i;
			i_1030_ -= i_1028_;
			if (i_1030_ + i_1029_ < 0) {
				int i_1042_ = (int) (Math.sqrt((double) (i_1029_ * i_1029_ + i_1030_ * i_1030_)) * 256.0);
				int i_1043_ = i_1042_ % i_1041_;
				i_1037_ = i_1035_ + i_1041_ - i_1037_ - i_1043_;
				i_1037_ %= i_1041_;
				if (i_1037_ < 0)
					i_1037_ += i_1041_;
				i += i_1029_;
				i_1029_ = -i_1029_;
				i_1028_ += i_1030_;
				i_1030_ = -i_1030_;
			}
			if (i_1029_ > i_1030_) {
				i_1028_ <<= 16;
				i_1028_ += 32768;
				i_1030_ <<= 16;
				int i_1044_ = (int) Math.floor((double) i_1030_ / (double) i_1029_ + 0.5);
				i_1029_ += i;
				int i_1045_ = i_1031_ >>> 24;
				int i_1046_ = (int) Math.sqrt((double) ((i_1044_ >> 8) * (i_1044_ >> 8) + 65536));
				if (0 == i_1032_ || 1 == i_1032_ && i_1045_ == 255) {
					while (i <= i_1029_) {
						int i_1047_ = i_1028_ >> 16;
						int i_1048_ = i_1047_ - i_1034_;
						if (i >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1047_ >= i_1039_ && i_1047_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1049_ = is[i_1048_] + i_1033_;
							if (i >= i_1049_ && i < is_1038_[i_1048_] + i_1049_)
								((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1047_) + i] = i_1031_;
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else if (i_1032_ == 1) {
					i_1031_ = ((i_1045_ * (i_1031_ & 0xff00) >> 8 & 0xff00) + ((i_1031_ & 0xff00ff) * i_1045_ >> 8 & 0xff00ff) + (i_1045_ << 24));
					int i_1050_ = 256 - i_1045_;
					while (i <= i_1029_) {
						int i_1051_ = i_1028_ >> 16;
						int i_1052_ = i_1051_ - i_1034_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1051_ >= i_1039_ && i_1051_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1053_ = i_1033_ + is[i_1052_];
							if (i >= i_1053_ && i < is_1038_[i_1052_] + i_1053_) {
								int i_1054_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1051_) + i);
								int i_1055_ = (((Class106_Sub2) this).anIntArray10218[i_1054_]);
								i_1055_ = (((i_1055_ & 0xff00ff) * i_1050_ >> 8 & 0xff00ff) + (i_1050_ * (i_1055_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1054_] = i_1031_ + i_1055_;
							}
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else if (2 == i_1032_) {
					while (i <= i_1029_) {
						int i_1056_ = i_1028_ >> 16;
						int i_1057_ = i_1056_ - i_1034_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1056_ >= i_1039_ && i_1056_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1058_ = i_1033_ + is[i_1057_];
							if (i >= i_1058_ && i < i_1058_ + is_1038_[i_1057_]) {
								int i_1059_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1056_) + i);
								int i_1060_ = (((Class106_Sub2) this).anIntArray10218[i_1059_]);
								int i_1061_ = i_1060_ + i_1031_;
								int i_1062_ = ((i_1060_ & 0xff00ff) + (i_1031_ & 0xff00ff));
								i_1060_ = ((i_1062_ & 0x1000100) + (i_1061_ - i_1062_ & 0x10000));
								((Class106_Sub2) this).anIntArray10218[i_1059_] = i_1061_ - i_1060_ | i_1060_ - (i_1060_ >>> 8);
							}
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1029_ <<= 16;
				int i_1063_ = (int) Math.floor((double) i_1029_ / (double) i_1030_ + 0.5);
				int i_1064_ = (int) Math.sqrt((double) (65536 + (i_1063_ >> 8) * (i_1063_ >> 8)));
				i_1030_ += i_1028_;
				int i_1065_ = i_1031_ >>> 24;
				if (0 == i_1032_ || 1 == i_1032_ && 255 == i_1065_) {
					while (i_1028_ <= i_1030_) {
						int i_1066_ = i >> 16;
						int i_1067_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1066_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_1066_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1037_ < i_1035_ && i_1066_ >= i_1033_ + is[i_1067_] && (i_1066_ < is[i_1067_] + i_1033_ + is_1038_[i_1067_]))
							((Class106_Sub2) this).anIntArray10218[i_1066_ + i_1028_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_1031_;
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else if (i_1032_ == 1) {
					i_1031_ = ((i_1065_ << 24) + ((i_1065_ * (i_1031_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1065_ * (i_1031_ & 0xff00) >> 8 & 0xff00)));
					int i_1068_ = 256 - i_1065_;
					while (i_1028_ <= i_1030_) {
						int i_1069_ = i >> 16;
						int i_1070_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1069_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1069_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1037_ < i_1035_ && i_1069_ >= i_1033_ + is[i_1070_] && (i_1069_ < i_1033_ + is[i_1070_] + is_1038_[i_1070_])) {
							int i_1071_ = (i_1069_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1028_));
							int i_1072_ = (((Class106_Sub2) this).anIntArray10218[i_1071_]);
							i_1072_ = (((i_1072_ & 0xff00) * i_1068_ >> 8 & 0xff00) + (i_1068_ * (i_1072_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1028_) + i_1069_] = i_1031_ + i_1072_;
						}
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else if (2 == i_1032_) {
					while (i_1028_ <= i_1030_) {
						int i_1073_ = i >> 16;
						int i_1074_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1073_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1073_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1037_ < i_1035_ && i_1073_ >= i_1033_ + is[i_1074_] && i_1073_ < is_1038_[i_1074_] + (i_1033_ + is[i_1074_])) {
							int i_1075_ = (i_1028_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1073_);
							int i_1076_ = (((Class106_Sub2) this).anIntArray10218[i_1075_]);
							int i_1077_ = i_1076_ + i_1031_;
							int i_1078_ = (i_1076_ & 0xff00ff) + (i_1031_ & 0xff00ff);
							i_1076_ = (i_1078_ & 0x1000100) + (i_1077_ - i_1078_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1075_] = i_1077_ - i_1076_ | i_1076_ - (i_1076_ >>> 8);
						}
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1897(int i, int i_1079_, int i_1080_, int i_1081_, int i_1082_, int i_1083_, Class167 class167, int i_1084_, int i_1085_, int i_1086_, int i_1087_, int i_1088_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1089_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1090_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_1085_ ? ((Class106_Sub2) this).anInt10222 * 2029354259 : i_1085_);
			int i_1091_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < i_1085_ + is.length) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : is.length + i_1085_);
			i_1088_ <<= 8;
			i_1086_ <<= 8;
			i_1087_ <<= 8;
			int i_1092_ = i_1087_ + i_1086_;
			i_1088_ %= i_1092_;
			i_1080_ -= i;
			i_1081_ -= i_1079_;
			if (i_1081_ + i_1080_ < 0) {
				int i_1093_ = (int) (Math.sqrt((double) (i_1080_ * i_1080_ + i_1081_ * i_1081_)) * 256.0);
				int i_1094_ = i_1093_ % i_1092_;
				i_1088_ = i_1086_ + i_1092_ - i_1088_ - i_1094_;
				i_1088_ %= i_1092_;
				if (i_1088_ < 0)
					i_1088_ += i_1092_;
				i += i_1080_;
				i_1080_ = -i_1080_;
				i_1079_ += i_1081_;
				i_1081_ = -i_1081_;
			}
			if (i_1080_ > i_1081_) {
				i_1079_ <<= 16;
				i_1079_ += 32768;
				i_1081_ <<= 16;
				int i_1095_ = (int) Math.floor((double) i_1081_ / (double) i_1080_ + 0.5);
				i_1080_ += i;
				int i_1096_ = i_1082_ >>> 24;
				int i_1097_ = (int) Math.sqrt((double) ((i_1095_ >> 8) * (i_1095_ >> 8) + 65536));
				if (0 == i_1083_ || 1 == i_1083_ && i_1096_ == 255) {
					while (i <= i_1080_) {
						int i_1098_ = i_1079_ >> 16;
						int i_1099_ = i_1098_ - i_1085_;
						if (i >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1098_ >= i_1090_ && i_1098_ < i_1091_ && i_1088_ < i_1086_) {
							int i_1100_ = is[i_1099_] + i_1084_;
							if (i >= i_1100_ && i < is_1089_[i_1099_] + i_1100_)
								((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1098_) + i] = i_1082_;
						}
						i_1079_ += i_1095_;
						i++;
						i_1088_ += i_1097_;
						i_1088_ %= i_1092_;
					}
				} else if (i_1083_ == 1) {
					i_1082_ = ((i_1096_ * (i_1082_ & 0xff00) >> 8 & 0xff00) + ((i_1082_ & 0xff00ff) * i_1096_ >> 8 & 0xff00ff) + (i_1096_ << 24));
					int i_1101_ = 256 - i_1096_;
					while (i <= i_1080_) {
						int i_1102_ = i_1079_ >> 16;
						int i_1103_ = i_1102_ - i_1085_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1102_ >= i_1090_ && i_1102_ < i_1091_ && i_1088_ < i_1086_) {
							int i_1104_ = i_1084_ + is[i_1103_];
							if (i >= i_1104_ && i < is_1089_[i_1103_] + i_1104_) {
								int i_1105_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1102_) + i);
								int i_1106_ = (((Class106_Sub2) this).anIntArray10218[i_1105_]);
								i_1106_ = (((i_1106_ & 0xff00ff) * i_1101_ >> 8 & 0xff00ff) + (i_1101_ * (i_1106_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1105_] = i_1082_ + i_1106_;
							}
						}
						i_1079_ += i_1095_;
						i++;
						i_1088_ += i_1097_;
						i_1088_ %= i_1092_;
					}
				} else if (2 == i_1083_) {
					while (i <= i_1080_) {
						int i_1107_ = i_1079_ >> 16;
						int i_1108_ = i_1107_ - i_1085_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1107_ >= i_1090_ && i_1107_ < i_1091_ && i_1088_ < i_1086_) {
							int i_1109_ = i_1084_ + is[i_1108_];
							if (i >= i_1109_ && i < i_1109_ + is_1089_[i_1108_]) {
								int i_1110_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1107_) + i);
								int i_1111_ = (((Class106_Sub2) this).anIntArray10218[i_1110_]);
								int i_1112_ = i_1111_ + i_1082_;
								int i_1113_ = ((i_1111_ & 0xff00ff) + (i_1082_ & 0xff00ff));
								i_1111_ = ((i_1113_ & 0x1000100) + (i_1112_ - i_1113_ & 0x10000));
								((Class106_Sub2) this).anIntArray10218[i_1110_] = i_1112_ - i_1111_ | i_1111_ - (i_1111_ >>> 8);
							}
						}
						i_1079_ += i_1095_;
						i++;
						i_1088_ += i_1097_;
						i_1088_ %= i_1092_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1080_ <<= 16;
				int i_1114_ = (int) Math.floor((double) i_1080_ / (double) i_1081_ + 0.5);
				int i_1115_ = (int) Math.sqrt((double) (65536 + (i_1114_ >> 8) * (i_1114_ >> 8)));
				i_1081_ += i_1079_;
				int i_1116_ = i_1082_ >>> 24;
				if (0 == i_1083_ || 1 == i_1083_ && 255 == i_1116_) {
					while (i_1079_ <= i_1081_) {
						int i_1117_ = i >> 16;
						int i_1118_ = i_1079_ - i_1085_;
						if (i_1079_ >= i_1090_ && i_1079_ < i_1091_ && i_1117_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_1117_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1088_ < i_1086_ && i_1117_ >= i_1084_ + is[i_1118_] && (i_1117_ < is[i_1118_] + i_1084_ + is_1089_[i_1118_]))
							((Class106_Sub2) this).anIntArray10218[i_1117_ + i_1079_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_1082_;
						i += i_1114_;
						i_1079_++;
						i_1088_ += i_1115_;
						i_1088_ %= i_1092_;
					}
				} else if (i_1083_ == 1) {
					i_1082_ = ((i_1116_ << 24) + ((i_1116_ * (i_1082_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1116_ * (i_1082_ & 0xff00) >> 8 & 0xff00)));
					int i_1119_ = 256 - i_1116_;
					while (i_1079_ <= i_1081_) {
						int i_1120_ = i >> 16;
						int i_1121_ = i_1079_ - i_1085_;
						if (i_1079_ >= i_1090_ && i_1079_ < i_1091_ && i_1120_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1120_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1088_ < i_1086_ && i_1120_ >= i_1084_ + is[i_1121_] && (i_1120_ < i_1084_ + is[i_1121_] + is_1089_[i_1121_])) {
							int i_1122_ = (i_1120_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1079_));
							int i_1123_ = (((Class106_Sub2) this).anIntArray10218[i_1122_]);
							i_1123_ = (((i_1123_ & 0xff00) * i_1119_ >> 8 & 0xff00) + (i_1119_ * (i_1123_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1079_) + i_1120_] = i_1082_ + i_1123_;
						}
						i += i_1114_;
						i_1079_++;
						i_1088_ += i_1115_;
						i_1088_ %= i_1092_;
					}
				} else if (2 == i_1083_) {
					while (i_1079_ <= i_1081_) {
						int i_1124_ = i >> 16;
						int i_1125_ = i_1079_ - i_1085_;
						if (i_1079_ >= i_1090_ && i_1079_ < i_1091_ && i_1124_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1124_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1088_ < i_1086_ && i_1124_ >= i_1084_ + is[i_1125_] && i_1124_ < is_1089_[i_1125_] + (i_1084_ + is[i_1125_])) {
							int i_1126_ = (i_1079_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1124_);
							int i_1127_ = (((Class106_Sub2) this).anIntArray10218[i_1126_]);
							int i_1128_ = i_1127_ + i_1082_;
							int i_1129_ = (i_1127_ & 0xff00ff) + (i_1082_ & 0xff00ff);
							i_1127_ = (i_1129_ & 0x1000100) + (i_1128_ - i_1129_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1126_] = i_1128_ - i_1127_ | i_1127_ - (i_1127_ >>> 8);
						}
						i += i_1114_;
						i_1079_++;
						i_1088_ += i_1115_;
						i_1088_ %= i_1092_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1898(int i, int i_1130_, int i_1131_, int i_1132_, int i_1133_, int i_1134_, Class167 class167, int i_1135_, int i_1136_, int i_1137_, int i_1138_, int i_1139_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1140_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1141_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_1136_ ? ((Class106_Sub2) this).anInt10222 * 2029354259 : i_1136_);
			int i_1142_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < i_1136_ + is.length) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : is.length + i_1136_);
			i_1139_ <<= 8;
			i_1137_ <<= 8;
			i_1138_ <<= 8;
			int i_1143_ = i_1138_ + i_1137_;
			i_1139_ %= i_1143_;
			i_1131_ -= i;
			i_1132_ -= i_1130_;
			if (i_1132_ + i_1131_ < 0) {
				int i_1144_ = (int) (Math.sqrt((double) (i_1131_ * i_1131_ + i_1132_ * i_1132_)) * 256.0);
				int i_1145_ = i_1144_ % i_1143_;
				i_1139_ = i_1137_ + i_1143_ - i_1139_ - i_1145_;
				i_1139_ %= i_1143_;
				if (i_1139_ < 0)
					i_1139_ += i_1143_;
				i += i_1131_;
				i_1131_ = -i_1131_;
				i_1130_ += i_1132_;
				i_1132_ = -i_1132_;
			}
			if (i_1131_ > i_1132_) {
				i_1130_ <<= 16;
				i_1130_ += 32768;
				i_1132_ <<= 16;
				int i_1146_ = (int) Math.floor((double) i_1132_ / (double) i_1131_ + 0.5);
				i_1131_ += i;
				int i_1147_ = i_1133_ >>> 24;
				int i_1148_ = (int) Math.sqrt((double) ((i_1146_ >> 8) * (i_1146_ >> 8) + 65536));
				if (0 == i_1134_ || 1 == i_1134_ && i_1147_ == 255) {
					while (i <= i_1131_) {
						int i_1149_ = i_1130_ >> 16;
						int i_1150_ = i_1149_ - i_1136_;
						if (i >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1149_ >= i_1141_ && i_1149_ < i_1142_ && i_1139_ < i_1137_) {
							int i_1151_ = is[i_1150_] + i_1135_;
							if (i >= i_1151_ && i < is_1140_[i_1150_] + i_1151_)
								((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1149_) + i] = i_1133_;
						}
						i_1130_ += i_1146_;
						i++;
						i_1139_ += i_1148_;
						i_1139_ %= i_1143_;
					}
				} else if (i_1134_ == 1) {
					i_1133_ = ((i_1147_ * (i_1133_ & 0xff00) >> 8 & 0xff00) + ((i_1133_ & 0xff00ff) * i_1147_ >> 8 & 0xff00ff) + (i_1147_ << 24));
					int i_1152_ = 256 - i_1147_;
					while (i <= i_1131_) {
						int i_1153_ = i_1130_ >> 16;
						int i_1154_ = i_1153_ - i_1136_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1153_ >= i_1141_ && i_1153_ < i_1142_ && i_1139_ < i_1137_) {
							int i_1155_ = i_1135_ + is[i_1154_];
							if (i >= i_1155_ && i < is_1140_[i_1154_] + i_1155_) {
								int i_1156_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1153_) + i);
								int i_1157_ = (((Class106_Sub2) this).anIntArray10218[i_1156_]);
								i_1157_ = (((i_1157_ & 0xff00ff) * i_1152_ >> 8 & 0xff00ff) + (i_1152_ * (i_1157_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1156_] = i_1133_ + i_1157_;
							}
						}
						i_1130_ += i_1146_;
						i++;
						i_1139_ += i_1148_;
						i_1139_ %= i_1143_;
					}
				} else if (2 == i_1134_) {
					while (i <= i_1131_) {
						int i_1158_ = i_1130_ >> 16;
						int i_1159_ = i_1158_ - i_1136_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1158_ >= i_1141_ && i_1158_ < i_1142_ && i_1139_ < i_1137_) {
							int i_1160_ = i_1135_ + is[i_1159_];
							if (i >= i_1160_ && i < i_1160_ + is_1140_[i_1159_]) {
								int i_1161_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1158_) + i);
								int i_1162_ = (((Class106_Sub2) this).anIntArray10218[i_1161_]);
								int i_1163_ = i_1162_ + i_1133_;
								int i_1164_ = ((i_1162_ & 0xff00ff) + (i_1133_ & 0xff00ff));
								i_1162_ = ((i_1164_ & 0x1000100) + (i_1163_ - i_1164_ & 0x10000));
								((Class106_Sub2) this).anIntArray10218[i_1161_] = i_1163_ - i_1162_ | i_1162_ - (i_1162_ >>> 8);
							}
						}
						i_1130_ += i_1146_;
						i++;
						i_1139_ += i_1148_;
						i_1139_ %= i_1143_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1131_ <<= 16;
				int i_1165_ = (int) Math.floor((double) i_1131_ / (double) i_1132_ + 0.5);
				int i_1166_ = (int) Math.sqrt((double) (65536 + (i_1165_ >> 8) * (i_1165_ >> 8)));
				i_1132_ += i_1130_;
				int i_1167_ = i_1133_ >>> 24;
				if (0 == i_1134_ || 1 == i_1134_ && 255 == i_1167_) {
					while (i_1130_ <= i_1132_) {
						int i_1168_ = i >> 16;
						int i_1169_ = i_1130_ - i_1136_;
						if (i_1130_ >= i_1141_ && i_1130_ < i_1142_ && i_1168_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_1168_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1139_ < i_1137_ && i_1168_ >= i_1135_ + is[i_1169_] && (i_1168_ < is[i_1169_] + i_1135_ + is_1140_[i_1169_]))
							((Class106_Sub2) this).anIntArray10218[i_1168_ + i_1130_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_1133_;
						i += i_1165_;
						i_1130_++;
						i_1139_ += i_1166_;
						i_1139_ %= i_1143_;
					}
				} else if (i_1134_ == 1) {
					i_1133_ = ((i_1167_ << 24) + ((i_1167_ * (i_1133_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1167_ * (i_1133_ & 0xff00) >> 8 & 0xff00)));
					int i_1170_ = 256 - i_1167_;
					while (i_1130_ <= i_1132_) {
						int i_1171_ = i >> 16;
						int i_1172_ = i_1130_ - i_1136_;
						if (i_1130_ >= i_1141_ && i_1130_ < i_1142_ && i_1171_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1171_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1139_ < i_1137_ && i_1171_ >= i_1135_ + is[i_1172_] && (i_1171_ < i_1135_ + is[i_1172_] + is_1140_[i_1172_])) {
							int i_1173_ = (i_1171_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1130_));
							int i_1174_ = (((Class106_Sub2) this).anIntArray10218[i_1173_]);
							i_1174_ = (((i_1174_ & 0xff00) * i_1170_ >> 8 & 0xff00) + (i_1170_ * (i_1174_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1130_) + i_1171_] = i_1133_ + i_1174_;
						}
						i += i_1165_;
						i_1130_++;
						i_1139_ += i_1166_;
						i_1139_ %= i_1143_;
					}
				} else if (2 == i_1134_) {
					while (i_1130_ <= i_1132_) {
						int i_1175_ = i >> 16;
						int i_1176_ = i_1130_ - i_1136_;
						if (i_1130_ >= i_1141_ && i_1130_ < i_1142_ && i_1175_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1175_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1139_ < i_1137_ && i_1175_ >= i_1135_ + is[i_1176_] && i_1175_ < is_1140_[i_1176_] + (i_1135_ + is[i_1176_])) {
							int i_1177_ = (i_1130_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1175_);
							int i_1178_ = (((Class106_Sub2) this).anIntArray10218[i_1177_]);
							int i_1179_ = i_1178_ + i_1133_;
							int i_1180_ = (i_1178_ & 0xff00ff) + (i_1133_ & 0xff00ff);
							i_1178_ = (i_1180_ & 0x1000100) + (i_1179_ - i_1180_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1177_] = i_1179_ - i_1178_ | i_1178_ - (i_1178_ >>> 8);
						}
						i += i_1165_;
						i_1130_++;
						i_1139_ += i_1166_;
						i_1139_ %= i_1143_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1774(Class96 class96, float f, Class96 class96_1181_, float f_1182_, Class96 class96_1183_, float f_1184_) {
		/* empty */
	}

	public void method1726(int i, int i_1185_, int i_1186_, int i_1187_, int i_1188_, int i_1189_, int i_1190_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			int i_1191_ = i_1186_ - i;
			int i_1192_ = i_1187_ - i_1185_;
			int i_1193_ = i_1191_ >= 0 ? i_1191_ : -i_1191_;
			int i_1194_ = i_1192_ >= 0 ? i_1192_ : -i_1192_;
			int i_1195_ = i_1193_;
			if (i_1195_ < i_1194_)
				i_1195_ = i_1194_;
			if (0 != i_1195_) {
				int i_1196_ = (i_1191_ << 16) / i_1195_;
				int i_1197_ = (i_1192_ << 16) / i_1195_;
				i_1191_ += i_1196_ >> 16;
				i_1192_ += i_1197_ >> 16;
				if (i_1197_ <= i_1196_)
					i_1196_ = -i_1196_;
				else
					i_1197_ = -i_1197_;
				int i_1198_ = i_1189_ * i_1197_ >> 17;
				int i_1199_ = 1 + i_1189_ * i_1197_ >> 17;
				int i_1200_ = i_1196_ * i_1189_ >> 17;
				int i_1201_ = 1 + i_1196_ * i_1189_ >> 17;
				i -= class143.method287();
				i_1185_ -= class143.method288();
				int i_1202_ = i + i_1198_;
				int i_1203_ = i - i_1199_;
				int i_1204_ = i + i_1191_ - i_1199_;
				int i_1205_ = i_1198_ + (i + i_1191_);
				int i_1206_ = i_1200_ + i_1185_;
				int i_1207_ = i_1185_ - i_1201_;
				int i_1208_ = i_1192_ + i_1185_ - i_1201_;
				int i_1209_ = i_1192_ + i_1185_ + i_1200_;
				if (0 == i_1190_)
					((Class143) class143).anInt19 = 0;
				else if (i_1190_ == 1)
					((Class143) class143).anInt19 = 255 - (i_1188_ >>> 24);
				else
					throw new IllegalArgumentException();
				method1763(false);
				((Class143) class143).aBoolean20 = (i_1202_ < 0 || i_1202_ > ((Class143) class143).anInt22 || i_1203_ < 0 || i_1203_ > ((Class143) class143).anInt22 || i_1204_ < 0 || i_1204_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_1206_, (float) i_1207_, (float) i_1208_, (float) i_1202_, (float) i_1203_, (float) i_1204_, 100.0F, 100.0F, 100.0F, i_1188_);
				((Class143) class143).aBoolean20 = (i_1202_ < 0 || i_1202_ > ((Class143) class143).anInt22 || i_1204_ < 0 || i_1204_ > ((Class143) class143).anInt22 || i_1205_ < 0 || i_1205_ > ((Class143) class143).anInt22);
				class143.method293(true, false, false, (float) i_1206_, (float) i_1208_, (float) i_1209_, (float) i_1202_, (float) i_1204_, (float) i_1205_, 100.0F, 100.0F, 100.0F, i_1188_);
				method1763(true);
			}
		}
	}

	public void method1866() {
		((Class106_Sub2) this).anInt10226 = 0;
		((Class106_Sub2) this).anInt10252 = 0;
		((Class106_Sub2) this).anInt10237 = ((Class106_Sub2) this).anInt10217 * -1646502557;
		((Class106_Sub2) this).anInt10238 = 1817973455 * ((Class106_Sub2) this).anInt10236;
		method9507();
	}

	public int method1902(int i, int i_1210_, int i_1211_, int i_1212_, int i_1213_, int i_1214_) {
		int i_1215_ = 0;
		float f = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1210_) + (float) i_1211_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10]));
		float f_1216_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * (float) i_1212_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1213_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * (float) i_1214_));
		float f_1217_ = (((float) i_1211_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1210_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]))));
		float f_1218_ = (((float) i_1214_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1213_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3] * (float) i_1212_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15]))));
		if (f < -f_1217_ && f_1216_ < -f_1218_)
			i_1215_ |= 0x10;
		else if (f > f_1217_ && f_1216_ > f_1218_)
			i_1215_ |= 0x20;
		float f_1219_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * (float) i_1210_) + (((float) i * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * (float) i_1211_));
		float f_1220_ = (((float) i_1214_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (((float) i_1213_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) * (float) i_1212_)));
		if (f_1219_ < -f_1217_ && f_1220_ < -f_1218_)
			i_1215_ |= 0x1;
		if (f_1219_ > f_1217_ && f_1220_ > f_1218_)
			i_1215_ |= 0x2;
		float f_1221_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1210_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1211_));
		float f_1222_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i_1212_) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1213_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1214_));
		if (f_1221_ < -f_1217_ && f_1222_ < -f_1218_)
			i_1215_ |= 0x4;
		if (f_1221_ > f_1217_ && f_1222_ > f_1218_)
			i_1215_ |= 0x8;
		return i_1215_;
	}

	public int method2048(int i, int i_1223_, int i_1224_, int i_1225_, int i_1226_, int i_1227_) {
		int i_1228_ = 0;
		float f = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1223_) + (float) i_1224_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10]));
		float f_1229_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * (float) i_1225_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1226_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * (float) i_1227_));
		float f_1230_ = (((float) i_1224_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1223_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]))));
		float f_1231_ = (((float) i_1227_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1226_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3] * (float) i_1225_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15]))));
		if (f < -f_1230_ && f_1229_ < -f_1231_)
			i_1228_ |= 0x10;
		else if (f > f_1230_ && f_1229_ > f_1231_)
			i_1228_ |= 0x20;
		float f_1232_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * (float) i_1223_) + (((float) i * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * (float) i_1224_));
		float f_1233_ = (((float) i_1227_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (((float) i_1226_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) * (float) i_1225_)));
		if (f_1232_ < -f_1230_ && f_1233_ < -f_1231_)
			i_1228_ |= 0x1;
		if (f_1232_ > f_1230_ && f_1233_ > f_1231_)
			i_1228_ |= 0x2;
		float f_1234_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1223_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1224_));
		float f_1235_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i_1225_) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1226_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1227_));
		if (f_1234_ < -f_1230_ && f_1235_ < -f_1231_)
			i_1228_ |= 0x4;
		if (f_1234_ > f_1230_ && f_1235_ > f_1231_)
			i_1228_ |= 0x8;
		return i_1228_;
	}

	public int method1904(int i, int i_1236_, int i_1237_, int i_1238_, int i_1239_, int i_1240_) {
		int i_1241_ = 0;
		float f = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1236_) + (float) i_1237_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10]));
		float f_1242_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * (float) i_1238_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * (float) i_1239_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * (float) i_1240_));
		float f_1243_ = (((float) i_1237_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1236_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (float) i * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]))));
		float f_1244_ = (((float) i_1240_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11]) + (((float) i_1239_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3] * (float) i_1238_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15]))));
		if (f < -f_1243_ && f_1242_ < -f_1244_)
			i_1241_ |= 0x10;
		else if (f > f_1243_ && f_1242_ > f_1244_)
			i_1241_ |= 0x20;
		float f_1245_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * (float) i_1236_) + (((float) i * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * (float) i_1237_));
		float f_1246_ = (((float) i_1240_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (((float) i_1239_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0]) * (float) i_1238_)));
		if (f_1245_ < -f_1243_ && f_1246_ < -f_1244_)
			i_1241_ |= 0x1;
		if (f_1245_ > f_1243_ && f_1246_ > f_1244_)
			i_1241_ |= 0x2;
		float f_1247_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1236_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1237_));
		float f_1248_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1] * (float) i_1238_) + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5] * (float) i_1239_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * (float) i_1240_));
		if (f_1247_ < -f_1243_ && f_1248_ < -f_1244_)
			i_1241_ |= 0x4;
		if (f_1247_ > f_1243_ && f_1248_ > f_1244_)
			i_1241_ |= 0x8;
		return i_1241_;
	}

	public boolean method1972() {
		return false;
	}

	boolean method1906(int i, int i_1249_, int i_1250_, int i_1251_, Class261 class261, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		return class326.method4147(i, i_1249_, i_1250_, i_1251_, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	void method9522() {
		((Class106_Sub2) this).aClass250_10231.method3446(((Class106_Sub2) this).aClass261_10230);
		((Class106_Sub2) this).aClass250_10233.method3442(((Class106_Sub2) this).aClass250_10231);
		((Class106_Sub2) this).aClass250_10233.method3445(((Class106_Sub2) this).aClass250_10232);
		((Class106_Sub2) this).aClass250_10233.method3459(((Class106_Sub2) this).aFloatArrayArray10245[0]);
		((Class106_Sub2) this).aClass250_10233.method3460(((Class106_Sub2) this).aFloatArrayArray10245[1]);
		((Class106_Sub2) this).aClass250_10233.method3455(((Class106_Sub2) this).aFloatArrayArray10245[2]);
		((Class106_Sub2) this).aClass250_10233.method3475(((Class106_Sub2) this).aFloatArrayArray10245[3]);
		((Class106_Sub2) this).aClass250_10233.method3457(((Class106_Sub2) this).aFloatArrayArray10245[4]);
		((Class106_Sub2) this).aClass250_10233.method3456(((Class106_Sub2) this).aFloatArrayArray10245[5]);
		float f = ((Class106_Sub2) this).aClass250_10232.method3487();
		float f_1252_ = (((f - 255.0F) * ((Class106_Sub2) this).aClass250_10232.aFloatArray2728[10]) + ((Class106_Sub2) this).aClass250_10232.aFloatArray2728[14]);
		float f_1253_ = (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[14] + f * (((Class106_Sub2) this).aClass250_10232.aFloatArray2728[10]));
		float f_1254_ = f_1253_ - f_1252_;
		for (int i = 0; i < ((Class106_Sub2) this).anInt10225 * -1641029431; i++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i];
			((Class186) class186).aFloat2177 = f_1252_;
			((Class186) class186).aFloat2181 = f_1254_;
		}
	}

	public void method2052(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		class90.method1511(class326, ((Class106_Sub2) this).aClass250_10232, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public void method2002(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		class90.method1511(class326, ((Class106_Sub2) this).aClass250_10232, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public void method1873(int i, int i_1255_, int i_1256_, int i_1257_) {
		if (i < 0)
			i = 0;
		if (i_1255_ < 0)
			i_1255_ = 0;
		if (i_1256_ > -994907113 * ((Class106_Sub2) this).anInt10217)
			i_1256_ = ((Class106_Sub2) this).anInt10217 * -994907113;
		if (i_1257_ > ((Class106_Sub2) this).anInt10236 * -1733432719)
			i_1257_ = -1733432719 * ((Class106_Sub2) this).anInt10236;
		((Class106_Sub2) this).anInt10220 = i * -1154212485;
		((Class106_Sub2) this).anInt10221 = i_1256_ * 1219240721;
		((Class106_Sub2) this).anInt10222 = i_1255_ * -685124325;
		((Class106_Sub2) this).anInt10223 = i_1257_ * -372688989;
		method9507();
	}

	public Class250 method1765() {
		return new Class250(((Class106_Sub2) this).aClass250_10232);
	}

	public Class572_Sub35 method1949(int i) {
		return null;
	}

	public void method1911(Class572_Sub35 class572_sub35) {
		/* empty */
	}

	public Class161 method1912(int i, int i_1258_, boolean bool, boolean bool_1259_) {
		if (bool)
			return new Class161_Sub3_Sub3(this, i, i_1258_);
		return new Class161_Sub3_Sub2(this, i, i_1258_);
	}

	public Class261 method1937() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass261_2186;
	}

	public void method1892(int i, int i_1260_, int i_1261_, int i_1262_, int i_1263_, int i_1264_, int i_1265_, int i_1266_, int i_1267_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			i_1261_ -= i;
			i_1262_ -= i_1260_;
			if (i_1262_ == 0) {
				if (i_1261_ >= 0)
					method9508(i, i_1260_, i_1261_ + 1, i_1263_, i_1264_, i_1265_, i_1266_, i_1267_);
				else {
					int i_1268_ = i_1266_ + i_1265_;
					i_1267_ %= i_1268_;
					i_1267_ = (i_1265_ + i_1268_ - i_1267_ - (1 + -i_1261_) % i_1268_);
					i_1267_ %= i_1268_;
					if (i_1267_ < 0)
						i_1267_ += i_1268_;
					method9508(i_1261_ + i, i_1260_, 1 + -i_1261_, i_1263_, i_1264_, i_1265_, i_1266_, i_1267_);
				}
			} else if (i_1261_ == 0) {
				if (i_1262_ >= 0)
					method9509(i, i_1260_, 1 + i_1262_, i_1263_, i_1264_, i_1265_, i_1266_, i_1267_);
				else {
					int i_1269_ = i_1265_ + i_1266_;
					i_1267_ %= i_1269_;
					i_1267_ = (i_1269_ + i_1265_ - i_1267_ - (-i_1262_ + 1) % i_1269_);
					i_1267_ %= i_1269_;
					if (i_1267_ < 0)
						i_1267_ += i_1269_;
					method9509(i, i_1260_ + i_1262_, -i_1262_ + 1, i_1263_, i_1264_, i_1265_, i_1266_, i_1267_);
				}
			} else {
				i_1267_ <<= 8;
				i_1265_ <<= 8;
				i_1266_ <<= 8;
				int i_1270_ = i_1266_ + i_1265_;
				i_1267_ %= i_1270_;
				if (i_1261_ + i_1262_ < 0) {
					int i_1271_ = (int) (Math.sqrt((double) (i_1262_ * i_1262_ + i_1261_ * i_1261_)) * 256.0);
					int i_1272_ = i_1271_ % i_1270_;
					i_1267_ = i_1265_ + i_1270_ - i_1267_ - i_1272_;
					i_1267_ %= i_1270_;
					if (i_1267_ < 0)
						i_1267_ += i_1270_;
					i += i_1261_;
					i_1261_ = -i_1261_;
					i_1260_ += i_1262_;
					i_1262_ = -i_1262_;
				}
				if (i_1261_ > i_1262_) {
					i_1260_ <<= 16;
					i_1260_ += 32768;
					i_1262_ <<= 16;
					int i_1273_ = (int) Math.floor(0.5 + ((double) i_1262_ / (double) i_1261_));
					i_1261_ += i;
					int i_1274_ = i_1263_ >>> 24;
					int i_1275_ = (int) Math.sqrt((double) (65536 + ((i_1273_ >> 8) * (i_1273_ >> 8))));
					if (i_1264_ == 0 || 1 == i_1264_ && 255 == i_1274_) {
						while (i <= i_1261_) {
							int i_1276_ = i_1260_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1276_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1276_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1267_ < i_1265_)
								((Class106_Sub2) this).anIntArray10218[i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_1276_)] = i_1263_;
							i_1260_ += i_1273_;
							i++;
							i_1267_ += i_1275_;
							i_1267_ %= i_1270_;
						}
					} else if (1 == i_1264_) {
						i_1263_ = ((i_1274_ << 24) + ((i_1274_ * (i_1263_ & 0xff00) >> 8 & 0xff00) + ((i_1263_ & 0xff00ff) * i_1274_ >> 8 & 0xff00ff)));
						int i_1277_ = 256 - i_1274_;
						while (i <= i_1261_) {
							int i_1278_ = i_1260_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1278_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1278_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1267_ < i_1265_) {
								int i_1279_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1278_) + i);
								int i_1280_ = (((Class106_Sub2) this).anIntArray10218[i_1279_]);
								i_1280_ = (((i_1280_ & 0xff00) * i_1277_ >> 8 & 0xff00) + ((i_1280_ & 0xff00ff) * i_1277_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_1279_] = i_1280_ + i_1263_;
							}
							i_1260_ += i_1273_;
							i++;
							i_1267_ += i_1275_;
							i_1267_ %= i_1270_;
						}
					} else if (2 == i_1264_) {
						while (i <= i_1261_) {
							int i_1281_ = i_1260_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1281_ >= (((Class106_Sub2) this).anInt10222) * 2029354259 && i_1281_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1267_ < i_1265_) {
								int i_1282_ = i + (i_1281_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_1283_ = (((Class106_Sub2) this).anIntArray10218[i_1282_]);
								int i_1284_ = i_1263_ + i_1283_;
								int i_1285_ = ((i_1283_ & 0xff00ff) + (i_1263_ & 0xff00ff));
								i_1283_ = ((i_1284_ - i_1285_ & 0x10000) + (i_1285_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1282_] = i_1284_ - i_1283_ | i_1283_ - (i_1283_ >>> 8);
							}
							i_1260_ += i_1273_;
							i++;
							i_1267_ += i_1275_;
							i_1267_ %= i_1270_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1261_ <<= 16;
					int i_1286_ = (int) Math.floor((double) i_1261_ / (double) i_1262_ + 0.5);
					i_1262_ += i_1260_;
					int i_1287_ = i_1263_ >>> 24;
					int i_1288_ = (int) Math.sqrt((double) (65536 + ((i_1286_ >> 8) * (i_1286_ >> 8))));
					if (i_1264_ == 0 || i_1264_ == 1 && 255 == i_1287_) {
						while (i_1260_ <= i_1262_) {
							int i_1289_ = i >> 16;
							if (i_1260_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_1260_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1289_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1289_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1267_ < i_1265_)
								((Class106_Sub2) this).anIntArray10218[i_1289_ + i_1260_ * (((Class106_Sub2) this).anInt10217 * -994907113)] = i_1263_;
							i += i_1286_;
							i_1260_++;
							i_1267_ += i_1288_;
							i_1267_ %= i_1270_;
						}
					} else if (i_1264_ == 1) {
						i_1263_ = (((i_1263_ & 0xff00ff) * i_1287_ >> 8 & 0xff00ff) + ((i_1263_ & 0xff00) * i_1287_ >> 8 & 0xff00) + (i_1287_ << 24));
						int i_1290_ = 256 - i_1287_;
						while (i_1260_ <= i_1262_) {
							int i_1291_ = i >> 16;
							if (i_1260_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1260_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1291_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1291_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1267_ < i_1265_) {
								int i_1292_ = (i_1291_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1260_));
								int i_1293_ = (((Class106_Sub2) this).anIntArray10218[i_1292_]);
								i_1293_ = ((i_1290_ * (i_1293_ & 0xff00) >> 8 & 0xff00) + ((i_1293_ & 0xff00ff) * i_1290_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[(i_1260_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_1291_] = i_1293_ + i_1263_;
							}
							i += i_1286_;
							i_1260_++;
							i_1267_ += i_1288_;
							i_1267_ %= i_1270_;
						}
					} else if (2 == i_1264_) {
						while (i_1260_ <= i_1262_) {
							int i_1294_ = i >> 16;
							if (i_1260_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1260_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1294_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1294_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1267_ < i_1265_) {
								int i_1295_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1260_) + i_1294_);
								int i_1296_ = (((Class106_Sub2) this).anIntArray10218[i_1295_]);
								int i_1297_ = i_1296_ + i_1263_;
								int i_1298_ = ((i_1296_ & 0xff00ff) + (i_1263_ & 0xff00ff));
								i_1296_ = ((i_1297_ - i_1298_ & 0x10000) + (i_1298_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1295_] = i_1297_ - i_1296_ | i_1296_ - (i_1296_ >>> 8);
							}
							i += i_1286_;
							i_1260_++;
							i_1267_ += i_1288_;
							i_1267_ %= i_1270_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class250 method1934() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	boolean method1737(int i, int i_1299_, int i_1300_, int i_1301_, Class261 class261, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		return class326.method4147(i, i_1299_, i_1300_, i_1301_, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public Class161 method1917(int i, int i_1302_, int i_1303_, int i_1304_, boolean bool) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_1303_ * i_1304_];
		int i_1305_ = i + i_1302_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
		int i_1306_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_1303_;
		for (int i_1307_ = 0; i_1307_ < i_1304_; i_1307_++) {
			int i_1308_ = i_1303_ * i_1307_;
			for (int i_1309_ = 0; i_1309_ < i_1303_; i_1309_++)
				is[i_1308_ + i_1309_] = ((Class106_Sub2) this).anIntArray10218[i_1305_++];
			i_1305_ += i_1306_;
		}
		if (bool)
			return new Class161_Sub3_Sub3(this, is, i_1303_, i_1304_);
		return new Class161_Sub3_Sub2(this, is, i_1303_, i_1304_);
	}

	public Class167 method1918(int i, int i_1310_, int[] is, int[] is_1311_) {
		return new Class167_Sub1(i, i_1310_, is, is_1311_);
	}

	public void method1804(int i, Class167 class167, int i_1312_, int i_1313_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1314_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1315_;
			if (1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_1313_)
				i_1315_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1313_;
			else
				i_1315_ = is.length;
			int i_1316_;
			if (2029354259 * ((Class106_Sub2) this).anInt10222 > i_1313_) {
				i_1316_ = 2029354259 * ((Class106_Sub2) this).anInt10222 - i_1313_;
				i_1313_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			} else
				i_1316_ = 0;
			if (i_1315_ - i_1316_ > 0) {
				int i_1317_ = i_1313_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				for (int i_1318_ = i_1316_; i_1318_ < i_1315_; i_1318_++) {
					int i_1319_ = i_1312_ + is[i_1318_];
					int i_1320_ = is_1314_[i_1318_];
					if (1179466163 * ((Class106_Sub2) this).anInt10220 > i_1319_) {
						i_1320_ -= (1179466163 * ((Class106_Sub2) this).anInt10220 - i_1319_);
						i_1319_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (((Class106_Sub2) this).anInt10221 * 892939761 < i_1320_ + i_1319_)
						i_1320_ = (892939761 * ((Class106_Sub2) this).anInt10221 - i_1319_);
					i_1319_ += i_1317_;
					for (int i_1321_ = -i_1320_; i_1321_ < 0; i_1321_++)
						((Class106_Sub2) this).anIntArray10218[i_1319_++] = i;
					i_1317_ += -994907113 * ((Class106_Sub2) this).anInt10217;
				}
			}
		}
	}

	public void method1732(int i, int i_1322_, int i_1323_, int i_1324_, int i_1325_, int i_1326_, int i_1327_, int i_1328_, int i_1329_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			i_1323_ -= i;
			i_1324_ -= i_1322_;
			if (i_1324_ == 0) {
				if (i_1323_ >= 0)
					method9508(i, i_1322_, i_1323_ + 1, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				else {
					int i_1330_ = i_1328_ + i_1327_;
					i_1329_ %= i_1330_;
					i_1329_ = (i_1327_ + i_1330_ - i_1329_ - (1 + -i_1323_) % i_1330_);
					i_1329_ %= i_1330_;
					if (i_1329_ < 0)
						i_1329_ += i_1330_;
					method9508(i_1323_ + i, i_1322_, 1 + -i_1323_, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				}
			} else if (i_1323_ == 0) {
				if (i_1324_ >= 0)
					method9509(i, i_1322_, 1 + i_1324_, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				else {
					int i_1331_ = i_1327_ + i_1328_;
					i_1329_ %= i_1331_;
					i_1329_ = (i_1331_ + i_1327_ - i_1329_ - (-i_1324_ + 1) % i_1331_);
					i_1329_ %= i_1331_;
					if (i_1329_ < 0)
						i_1329_ += i_1331_;
					method9509(i, i_1322_ + i_1324_, -i_1324_ + 1, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				}
			} else {
				i_1329_ <<= 8;
				i_1327_ <<= 8;
				i_1328_ <<= 8;
				int i_1332_ = i_1328_ + i_1327_;
				i_1329_ %= i_1332_;
				if (i_1323_ + i_1324_ < 0) {
					int i_1333_ = (int) (Math.sqrt((double) (i_1324_ * i_1324_ + i_1323_ * i_1323_)) * 256.0);
					int i_1334_ = i_1333_ % i_1332_;
					i_1329_ = i_1327_ + i_1332_ - i_1329_ - i_1334_;
					i_1329_ %= i_1332_;
					if (i_1329_ < 0)
						i_1329_ += i_1332_;
					i += i_1323_;
					i_1323_ = -i_1323_;
					i_1322_ += i_1324_;
					i_1324_ = -i_1324_;
				}
				if (i_1323_ > i_1324_) {
					i_1322_ <<= 16;
					i_1322_ += 32768;
					i_1324_ <<= 16;
					int i_1335_ = (int) Math.floor(0.5 + ((double) i_1324_ / (double) i_1323_));
					i_1323_ += i;
					int i_1336_ = i_1325_ >>> 24;
					int i_1337_ = (int) Math.sqrt((double) (65536 + ((i_1335_ >> 8) * (i_1335_ >> 8))));
					if (i_1326_ == 0 || 1 == i_1326_ && 255 == i_1336_) {
						while (i <= i_1323_) {
							int i_1338_ = i_1322_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1338_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1338_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1329_ < i_1327_)
								((Class106_Sub2) this).anIntArray10218[i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_1338_)] = i_1325_;
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else if (1 == i_1326_) {
						i_1325_ = ((i_1336_ << 24) + ((i_1336_ * (i_1325_ & 0xff00) >> 8 & 0xff00) + ((i_1325_ & 0xff00ff) * i_1336_ >> 8 & 0xff00ff)));
						int i_1339_ = 256 - i_1336_;
						while (i <= i_1323_) {
							int i_1340_ = i_1322_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1340_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1340_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1329_ < i_1327_) {
								int i_1341_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1340_) + i);
								int i_1342_ = (((Class106_Sub2) this).anIntArray10218[i_1341_]);
								i_1342_ = (((i_1342_ & 0xff00) * i_1339_ >> 8 & 0xff00) + ((i_1342_ & 0xff00ff) * i_1339_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_1341_] = i_1342_ + i_1325_;
							}
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else if (2 == i_1326_) {
						while (i <= i_1323_) {
							int i_1343_ = i_1322_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1343_ >= (((Class106_Sub2) this).anInt10222) * 2029354259 && i_1343_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1329_ < i_1327_) {
								int i_1344_ = i + (i_1343_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_1345_ = (((Class106_Sub2) this).anIntArray10218[i_1344_]);
								int i_1346_ = i_1325_ + i_1345_;
								int i_1347_ = ((i_1345_ & 0xff00ff) + (i_1325_ & 0xff00ff));
								i_1345_ = ((i_1346_ - i_1347_ & 0x10000) + (i_1347_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1344_] = i_1346_ - i_1345_ | i_1345_ - (i_1345_ >>> 8);
							}
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1323_ <<= 16;
					int i_1348_ = (int) Math.floor((double) i_1323_ / (double) i_1324_ + 0.5);
					i_1324_ += i_1322_;
					int i_1349_ = i_1325_ >>> 24;
					int i_1350_ = (int) Math.sqrt((double) (65536 + ((i_1348_ >> 8) * (i_1348_ >> 8))));
					if (i_1326_ == 0 || i_1326_ == 1 && 255 == i_1349_) {
						while (i_1322_ <= i_1324_) {
							int i_1351_ = i >> 16;
							if (i_1322_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_1322_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1351_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1351_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1329_ < i_1327_)
								((Class106_Sub2) this).anIntArray10218[i_1351_ + i_1322_ * (((Class106_Sub2) this).anInt10217 * -994907113)] = i_1325_;
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else if (i_1326_ == 1) {
						i_1325_ = (((i_1325_ & 0xff00ff) * i_1349_ >> 8 & 0xff00ff) + ((i_1325_ & 0xff00) * i_1349_ >> 8 & 0xff00) + (i_1349_ << 24));
						int i_1352_ = 256 - i_1349_;
						while (i_1322_ <= i_1324_) {
							int i_1353_ = i >> 16;
							if (i_1322_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1322_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1353_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1353_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1329_ < i_1327_) {
								int i_1354_ = (i_1353_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1322_));
								int i_1355_ = (((Class106_Sub2) this).anIntArray10218[i_1354_]);
								i_1355_ = ((i_1352_ * (i_1355_ & 0xff00) >> 8 & 0xff00) + ((i_1355_ & 0xff00ff) * i_1352_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[(i_1322_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_1353_] = i_1355_ + i_1325_;
							}
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else if (2 == i_1326_) {
						while (i_1322_ <= i_1324_) {
							int i_1356_ = i >> 16;
							if (i_1322_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1322_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1356_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1356_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1329_ < i_1327_) {
								int i_1357_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1322_) + i_1356_);
								int i_1358_ = (((Class106_Sub2) this).anIntArray10218[i_1357_]);
								int i_1359_ = i_1358_ + i_1325_;
								int i_1360_ = ((i_1358_ & 0xff00ff) + (i_1325_ & 0xff00ff));
								i_1358_ = ((i_1359_ - i_1360_ & 0x10000) + (i_1360_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1357_] = i_1359_ - i_1358_ | i_1358_ - (i_1358_ >>> 8);
							}
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1893(int i, Class167 class167, int i_1361_, int i_1362_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1363_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1364_;
			if (1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_1362_)
				i_1364_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1362_;
			else
				i_1364_ = is.length;
			int i_1365_;
			if (2029354259 * ((Class106_Sub2) this).anInt10222 > i_1362_) {
				i_1365_ = 2029354259 * ((Class106_Sub2) this).anInt10222 - i_1362_;
				i_1362_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			} else
				i_1365_ = 0;
			if (i_1364_ - i_1365_ > 0) {
				int i_1366_ = i_1362_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				for (int i_1367_ = i_1365_; i_1367_ < i_1364_; i_1367_++) {
					int i_1368_ = i_1361_ + is[i_1367_];
					int i_1369_ = is_1363_[i_1367_];
					if (1179466163 * ((Class106_Sub2) this).anInt10220 > i_1368_) {
						i_1369_ -= (1179466163 * ((Class106_Sub2) this).anInt10220 - i_1368_);
						i_1368_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (((Class106_Sub2) this).anInt10221 * 892939761 < i_1369_ + i_1368_)
						i_1369_ = (892939761 * ((Class106_Sub2) this).anInt10221 - i_1368_);
					i_1368_ += i_1366_;
					for (int i_1370_ = -i_1369_; i_1370_ < 0; i_1370_++)
						((Class106_Sub2) this).anIntArray10218[i_1368_++] = i;
					i_1366_ += -994907113 * ((Class106_Sub2) this).anInt10217;
				}
			}
		}
	}

	public Class102 method1922(Class284 class284, Class87[] class87s, boolean bool) {
		int[] is = new int[class87s.length];
		int[] is_1371_ = new int[class87s.length];
		boolean bool_1372_ = false;
		boolean bool_1373_ = false;
		for (int i = 0; i < class87s.length; i++) {
			is[i] = class87s[i].method1329();
			is_1371_[i] = class87s[i].method1330();
			if (class87s[i].method1322())
				bool_1372_ = true;
			if (class87s[i].method1282())
				bool_1373_ = true;
		}
		if (bool) {
			if (bool_1373_) {
				if (bool_1372_)
					return new Class102_Sub2(this, class284, (Class87_Sub1[]) class87s, is, is_1371_);
				return new Class102_Sub5(this, class284, (Class87_Sub1[]) class87s, is, is_1371_);
			}
			if (bool_1372_)
				return new Class102_Sub2(this, class284, (Class87_Sub2[]) class87s, is, is_1371_);
			return new Class102_Sub5(this, class284, (Class87_Sub2[]) class87s, is, is_1371_);
		}
		if (bool_1373_) {
			if (bool_1372_)
				throw new IllegalArgumentException("");
			return new Class102_Sub4(this, class284, (Class87_Sub1[]) class87s, is, is_1371_);
		}
		return new Class102_Sub3(this, class284, (Class87_Sub2[]) class87s, is, is_1371_);
	}

	public Class102 method1923(Class284 class284, Class87[] class87s, boolean bool) {
		int[] is = new int[class87s.length];
		int[] is_1374_ = new int[class87s.length];
		boolean bool_1375_ = false;
		boolean bool_1376_ = false;
		for (int i = 0; i < class87s.length; i++) {
			is[i] = class87s[i].method1329();
			is_1374_[i] = class87s[i].method1330();
			if (class87s[i].method1322())
				bool_1375_ = true;
			if (class87s[i].method1282())
				bool_1376_ = true;
		}
		if (bool) {
			if (bool_1376_) {
				if (bool_1375_)
					return new Class102_Sub2(this, class284, (Class87_Sub1[]) class87s, is, is_1374_);
				return new Class102_Sub5(this, class284, (Class87_Sub1[]) class87s, is, is_1374_);
			}
			if (bool_1375_)
				return new Class102_Sub2(this, class284, (Class87_Sub2[]) class87s, is, is_1374_);
			return new Class102_Sub5(this, class284, (Class87_Sub2[]) class87s, is, is_1374_);
		}
		if (bool_1376_) {
			if (bool_1375_)
				throw new IllegalArgumentException("");
			return new Class102_Sub4(this, class284, (Class87_Sub1[]) class87s, is, is_1374_);
		}
		return new Class102_Sub3(this, class284, (Class87_Sub2[]) class87s, is, is_1374_);
	}

	public void method1908(int i) {
		Class89_Sub2.anInt10555 = Class89_Sub2.anInt10629 = i;
		if (((Class106_Sub2) this).anInt10225 * -1641029431 > 1)
			throw new IllegalStateException();
		method9511(((Class106_Sub2) this).anInt10225 * -1641029431);
		method9510(0);
	}

	public boolean method1672() {
		return false;
	}

	public Model method1926(Class159 class159, int i, int i_1377_, int i_1378_, int i_1379_) {
		return new Class89_Sub2(this, class159, i, i_1378_, i_1379_, i_1377_);
	}

	public Model method1695(Class159 class159, int i, int i_1380_, int i_1381_, int i_1382_) {
		return new Class89_Sub2(this, class159, i, i_1381_, i_1382_, i_1380_);
	}

	public int method1928(int i, int i_1383_) {
		i |= 0x20800;
		return i & i_1383_ ^ i_1383_;
	}

	public void method1991(int i, int i_1384_, int i_1385_) {
		for (int i_1386_ = 0; i_1386_ < ((Class106_Sub2) this).aClass186Array10213.length; i_1386_++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i_1386_];
			((Class186) class186).anInt2191 = (i & 0xffffff) * -1008638461;
			int i_1387_ = ((Class186) class186).anInt2191 * 219346091 >>> 16 & 0xff;
			if (i_1387_ < 2)
				i_1387_ = 2;
			int i_1388_ = 219346091 * ((Class186) class186).anInt2191 >> 8 & 0xff;
			if (i_1388_ < 2)
				i_1388_ = 2;
			int i_1389_ = ((Class186) class186).anInt2191 * 219346091 & 0xff;
			if (i_1389_ < 2)
				i_1389_ = 2;
			((Class186) class186).anInt2191 = -1008638461 * (i_1387_ << 16 | i_1388_ << 8 | i_1389_);
			if (i_1384_ < 0)
				((Class186) class186).aBool2218 = false;
			else
				((Class186) class186).aBool2218 = true;
		}
	}

	void method1803() {
		if (((Class106_Sub2) this).aBool10227) {
			Class472.method5585(true, false, (byte) -4);
			((Class106_Sub2) this).aBool10227 = false;
		}
		((Class106_Sub2) this).aBool10215 = true;
	}

	public Class174 method1931(int i, int i_1390_, int[][] is, int[][] is_1391_, int i_1392_, int i_1393_, int i_1394_) {
		return new Class174_Sub2(this, i_1393_, i_1394_, i, i_1390_, is, is_1391_, i_1392_);
	}

	public Class250 method1932() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	public Class167 method1749(int i, int i_1395_, int[] is, int[] is_1396_) {
		return new Class167_Sub1(i, i_1395_, is, is_1396_);
	}

	public Class250 method1799() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	boolean method1905(int i, int i_1397_, int i_1398_, int i_1399_, Class261 class261, Class326 class326) {
		Class250 class250 = method1752();
		class250.method3446(class261);
		class250.method3445(((Class106_Sub2) this).aClass250_10233);
		return class326.method4147(i, i_1397_, i_1398_, i_1399_, class250, ((Class106_Sub2) this).aFloat10246, ((Class106_Sub2) this).aFloat10242, ((Class106_Sub2) this).aFloat10239, ((Class106_Sub2) this).aFloat10241);
	}

	public void method2012(int i, int i_1400_, int i_1401_, int i_1402_) {
		if (((Class106_Sub2) this).anInt10220 * 1179466163 < i)
			((Class106_Sub2) this).anInt10220 = i * -1154212485;
		if (2029354259 * ((Class106_Sub2) this).anInt10222 < i_1400_)
			((Class106_Sub2) this).anInt10222 = -685124325 * i_1400_;
		if (((Class106_Sub2) this).anInt10221 * 892939761 > i_1401_)
			((Class106_Sub2) this).anInt10221 = i_1401_ * 1219240721;
		if (1704244235 * ((Class106_Sub2) this).anInt10223 > i_1402_)
			((Class106_Sub2) this).anInt10223 = -372688989 * i_1402_;
		method9507();
	}

	public int method1929(int i, int i_1403_) {
		return i | i_1403_;
	}

	public int method2043() {
		return 0;
	}

	public Class261 method2038() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass261_2186;
	}

	public void method1970(int i, int i_1404_) {
		/* empty */
	}

	public Class572_Sub36 method1940(int i, int i_1405_, int i_1406_, int i_1407_, int i_1408_, float f) {
		return null;
	}

	public Class572_Sub36 method2034(int i, int i_1409_, int i_1410_, int i_1411_, int i_1412_, float f) {
		return null;
	}

	public void method1942(int i, Class572_Sub36[] class572_sub36s) {
		/* empty */
	}

	public void method1771(int i, Class572_Sub36[] class572_sub36s) {
		/* empty */
	}

	public void method1856(long l) {
		/* empty */
	}

	void method9523(int i) {
		((Class106_Sub2) this).anInt10225 = 1791113593 * i;
		((Class106_Sub2) this).aClass186Array10213 = new Class186[-1641029431 * ((Class106_Sub2) this).anInt10225];
		for (int i_1413_ = 0; i_1413_ < ((Class106_Sub2) this).anInt10225 * -1641029431; i_1413_++)
			((Class106_Sub2) this).aClass186Array10213[i_1413_] = new Class186(this);
	}

	int method5206(int i) {
		return aClass94_1396.getTexture(i, -41139926).aShort1317 & 0xffff;
	}

	public Class161 method1913(int i, int i_1414_, boolean bool, boolean bool_1415_) {
		if (bool)
			return new Class161_Sub3_Sub3(this, i, i_1414_);
		return new Class161_Sub3_Sub2(this, i, i_1414_);
	}

	public Interface11 method2001(int i, int i_1416_) {
		return new Class151(i, i_1416_);
	}

	public void method1944(Class105 class105) {
		method9513(null != ((Class106_Sub2) this).anIntArray10218, ((Class106_Sub2) this).aFloatArray10219 != null, false, class105);
	}

	public void method1945(Class105 class105) {
		method9513(null != ((Class106_Sub2) this).anIntArray10218, ((Class106_Sub2) this).aFloatArray10219 != null, false, class105);
	}

	void method1882(int i, int i_1417_, int i_1418_, int i_1419_, int i_1420_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i_1417_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1417_ < 1704244235 * ((Class106_Sub2) this).anInt10223)) {
			if (i < ((Class106_Sub2) this).anInt10220 * 1179466163) {
				i_1418_ -= ((Class106_Sub2) this).anInt10220 * 1179466163 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i + i_1418_ > ((Class106_Sub2) this).anInt10221 * 892939761)
				i_1418_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			int i_1421_ = i + ((Class106_Sub2) this).anInt10217 * -994907113 * i_1417_;
			int i_1422_ = i_1419_ >>> 24;
			if (0 == i_1420_ || i_1420_ == 1 && 255 == i_1422_) {
				for (int i_1423_ = 0; i_1423_ < i_1418_; i_1423_++)
					((Class106_Sub2) this).anIntArray10218[i_1421_ + i_1423_] = i_1419_;
			} else if (i_1420_ == 1) {
				i_1419_ = ((i_1422_ << 24) + ((i_1422_ * (i_1419_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1422_ * (i_1419_ & 0xff00) >> 8 & 0xff00)));
				int i_1424_ = 256 - i_1422_;
				for (int i_1425_ = 0; i_1425_ < i_1418_; i_1425_++) {
					int i_1426_ = (((Class106_Sub2) this).anIntArray10218[i_1425_ + i_1421_]);
					i_1426_ = (((i_1426_ & 0xff00ff) * i_1424_ >> 8 & 0xff00ff) + (i_1424_ * (i_1426_ & 0xff00) >> 8 & 0xff00));
					((Class106_Sub2) this).anIntArray10218[i_1425_ + i_1421_] = i_1419_ + i_1426_;
				}
			} else if (i_1420_ == 2) {
				for (int i_1427_ = 0; i_1427_ < i_1418_; i_1427_++) {
					int i_1428_ = (((Class106_Sub2) this).anIntArray10218[i_1421_ + i_1427_]);
					int i_1429_ = i_1428_ + i_1419_;
					int i_1430_ = (i_1419_ & 0xff00ff) + (i_1428_ & 0xff00ff);
					i_1428_ = (i_1429_ - i_1430_ & 0x10000) + (i_1430_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_1421_ + i_1427_] = i_1429_ - i_1428_ | i_1428_ - (i_1428_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method1699() {
		return true;
	}

	public void method2010() {
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10221 = -1650666873 * ((Class106_Sub2) this).anInt10217;
		((Class106_Sub2) this).anInt10223 = ((Class106_Sub2) this).anInt10236 * 2144570611;
		method9507();
	}

	public int method1798(int i, int i_1431_) {
		return i | i_1431_;
	}

	public void method1886(int i, float f, float f_1432_, float f_1433_, float f_1434_, float f_1435_) {
		((Class106_Sub2) this).anInt10234 = -1601388607 * (int) (f * 65535.0F);
		((Class106_Sub2) this).anInt10228 = 511650919 * (int) (65535.0F * f_1432_);
		float f_1436_ = (float) Math.sqrt((double) (f_1434_ * f_1434_ + f_1433_ * f_1433_ + f_1435_ * f_1435_));
		((Class106_Sub2) this).anInt10224 = (int) (f_1433_ * 65535.0F / f_1436_) * 1424248739;
		((Class106_Sub2) this).anInt10229 = -2084145425 * (int) (f_1434_ * 65535.0F / f_1436_);
		((Class106_Sub2) this).anInt10216 = -1059291367 * (int) (65535.0F * f_1435_ / f_1436_);
	}

	public void method1687(boolean bool) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).aBoolean207 = bool;
	}

	public Class161 method1960(int[] is, int i, int i_1437_, int i_1438_, int i_1439_, boolean bool) {
		boolean bool_1440_ = false;
		int i_1441_ = i;
		while_44_: for (int i_1442_ = 0; i_1442_ < i_1439_; i_1442_++) {
			for (int i_1443_ = 0; i_1443_ < i_1438_; i_1443_++) {
				int i_1444_ = is[i_1441_++] >>> 24;
				if (i_1444_ != 0 && i_1444_ != 255) {
					bool_1440_ = true;
					break while_44_;
				}
			}
		}
		if (bool_1440_)
			return new Class161_Sub3_Sub3(this, is, i, i_1437_, i_1438_, i_1439_, bool);
		return new Class161_Sub3_Sub2(this, is, i, i_1437_, i_1438_, i_1439_, bool);
	}

	void method1768(int i, int i_1445_, int i_1446_, int i_1447_, int i_1448_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < 892939761 * ((Class106_Sub2) this).anInt10221)) {
			if (i_1445_ < ((Class106_Sub2) this).anInt10222 * 2029354259) {
				i_1446_ -= (((Class106_Sub2) this).anInt10222 * 2029354259 - i_1445_);
				i_1445_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_1445_ + i_1446_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1446_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1445_;
			int i_1449_ = i + i_1445_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
			int i_1450_ = i_1447_ >>> 24;
			if (i_1448_ == 0 || i_1448_ == 1 && i_1450_ == 255) {
				for (int i_1451_ = 0; i_1451_ < i_1446_; i_1451_++)
					((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1451_) + i_1449_] = i_1447_;
			} else if (i_1448_ == 1) {
				i_1447_ = ((i_1450_ << 24) + ((i_1450_ * (i_1447_ & 0xff00) >> 8 & 0xff00) + ((i_1447_ & 0xff00ff) * i_1450_ >> 8 & 0xff00ff)));
				int i_1452_ = 256 - i_1450_;
				for (int i_1453_ = 0; i_1453_ < i_1446_; i_1453_++) {
					int i_1454_ = (i_1449_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1453_));
					int i_1455_ = ((Class106_Sub2) this).anIntArray10218[i_1454_];
					i_1455_ = (((i_1455_ & 0xff00) * i_1452_ >> 8 & 0xff00) + ((i_1455_ & 0xff00ff) * i_1452_ >> 8 & 0xff00ff));
					((Class106_Sub2) this).anIntArray10218[i_1454_] = i_1447_ + i_1455_;
				}
			} else if (i_1448_ == 2) {
				for (int i_1456_ = 0; i_1456_ < i_1446_; i_1456_++) {
					int i_1457_ = (i_1449_ + i_1456_ * (-994907113 * ((Class106_Sub2) this).anInt10217));
					int i_1458_ = ((Class106_Sub2) this).anIntArray10218[i_1457_];
					int i_1459_ = i_1458_ + i_1447_;
					int i_1460_ = (i_1447_ & 0xff00ff) + (i_1458_ & 0xff00ff);
					i_1458_ = (i_1459_ - i_1460_ & 0x10000) + (i_1460_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_1457_] = i_1459_ - i_1458_ | i_1458_ - (i_1458_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class261 method1948() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	public void method2036() {
		/* empty */
	}

	public Class261 method1831() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	public void method1947(int i) {
		/* empty */
	}

	public Class261 method1770() {
		return new Class261(((Class106_Sub2) this).aClass261_10230);
	}

	Class104_Sub2 method1692(Canvas canvas, int i, int i_1461_) {
		return Class310.method4051(this, canvas, i, i_1461_, -39565283);
	}

	public void method1954(Class250 class250) {
		((Class106_Sub2) this).aClass250_10232.method3442(class250);
		method9521();
	}

	public void method1955(Class250 class250) {
		((Class106_Sub2) this).aClass250_10232.method3442(class250);
		method9521();
	}

	public Class250 method2007() {
		return new Class250(((Class106_Sub2) this).aClass250_10232);
	}

	public void method1758(float f) {
		((Class106_Sub2) this).anInt10235 = (int) (65535.0F * f) * -24827737;
	}

	public Class572_Sub35 method1952(int i) {
		return null;
	}

	public void method1686(int i, float f, float f_1462_, float f_1463_, float f_1464_, float f_1465_) {
		((Class106_Sub2) this).anInt10234 = -1601388607 * (int) (f * 65535.0F);
		((Class106_Sub2) this).anInt10228 = 511650919 * (int) (65535.0F * f_1462_);
		float f_1466_ = (float) Math.sqrt((double) (f_1464_ * f_1464_ + f_1463_ * f_1463_ + f_1465_ * f_1465_));
		((Class106_Sub2) this).anInt10224 = (int) (f_1463_ * 65535.0F / f_1466_) * 1424248739;
		((Class106_Sub2) this).anInt10229 = -2084145425 * (int) (f_1464_ * 65535.0F / f_1466_);
		((Class106_Sub2) this).anInt10216 = -1059291367 * (int) (65535.0F * f_1465_ / f_1466_);
	}

	public int[] method1696(int i, int i_1467_, int i_1468_, int i_1469_) {
		if (null == ((Class106_Sub2) this).anIntArray10218)
			throw new IllegalStateException("");
		int[] is = new int[i_1468_ * i_1469_];
		int i_1470_ = 0;
		for (int i_1471_ = 0; i_1471_ < i_1469_; i_1471_++) {
			int i_1472_ = (-994907113 * ((Class106_Sub2) this).anInt10217 * (i_1471_ + i_1467_) + i);
			for (int i_1473_ = 0; i_1473_ < i_1468_; i_1473_++)
				is[i_1470_++] = (((Class106_Sub2) this).anIntArray10218[i_1472_ + i_1473_]);
		}
		return is;
	}

	public void method1959(int i, float f, float f_1474_, float f_1475_, float f_1476_, float f_1477_) {
		((Class106_Sub2) this).anInt10234 = -1601388607 * (int) (f * 65535.0F);
		((Class106_Sub2) this).anInt10228 = 511650919 * (int) (65535.0F * f_1474_);
		float f_1478_ = (float) Math.sqrt((double) (f_1476_ * f_1476_ + f_1475_ * f_1475_ + f_1477_ * f_1477_));
		((Class106_Sub2) this).anInt10224 = (int) (f_1475_ * 65535.0F / f_1478_) * 1424248739;
		((Class106_Sub2) this).anInt10229 = -2084145425 * (int) (f_1476_ * 65535.0F / f_1478_);
		((Class106_Sub2) this).anInt10216 = -1059291367 * (int) (65535.0F * f_1477_ / f_1478_);
	}

	public void method1889(int i, int i_1479_, int i_1480_, int i_1481_, int i_1482_, int i_1483_, int i_1484_, int i_1485_, int i_1486_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			i_1480_ -= i;
			i_1481_ -= i_1479_;
			if (i_1481_ == 0) {
				if (i_1480_ >= 0)
					method9508(i, i_1479_, i_1480_ + 1, i_1482_, i_1483_, i_1484_, i_1485_, i_1486_);
				else {
					int i_1487_ = i_1485_ + i_1484_;
					i_1486_ %= i_1487_;
					i_1486_ = (i_1484_ + i_1487_ - i_1486_ - (1 + -i_1480_) % i_1487_);
					i_1486_ %= i_1487_;
					if (i_1486_ < 0)
						i_1486_ += i_1487_;
					method9508(i_1480_ + i, i_1479_, 1 + -i_1480_, i_1482_, i_1483_, i_1484_, i_1485_, i_1486_);
				}
			} else if (i_1480_ == 0) {
				if (i_1481_ >= 0)
					method9509(i, i_1479_, 1 + i_1481_, i_1482_, i_1483_, i_1484_, i_1485_, i_1486_);
				else {
					int i_1488_ = i_1484_ + i_1485_;
					i_1486_ %= i_1488_;
					i_1486_ = (i_1488_ + i_1484_ - i_1486_ - (-i_1481_ + 1) % i_1488_);
					i_1486_ %= i_1488_;
					if (i_1486_ < 0)
						i_1486_ += i_1488_;
					method9509(i, i_1479_ + i_1481_, -i_1481_ + 1, i_1482_, i_1483_, i_1484_, i_1485_, i_1486_);
				}
			} else {
				i_1486_ <<= 8;
				i_1484_ <<= 8;
				i_1485_ <<= 8;
				int i_1489_ = i_1485_ + i_1484_;
				i_1486_ %= i_1489_;
				if (i_1480_ + i_1481_ < 0) {
					int i_1490_ = (int) (Math.sqrt((double) (i_1481_ * i_1481_ + i_1480_ * i_1480_)) * 256.0);
					int i_1491_ = i_1490_ % i_1489_;
					i_1486_ = i_1484_ + i_1489_ - i_1486_ - i_1491_;
					i_1486_ %= i_1489_;
					if (i_1486_ < 0)
						i_1486_ += i_1489_;
					i += i_1480_;
					i_1480_ = -i_1480_;
					i_1479_ += i_1481_;
					i_1481_ = -i_1481_;
				}
				if (i_1480_ > i_1481_) {
					i_1479_ <<= 16;
					i_1479_ += 32768;
					i_1481_ <<= 16;
					int i_1492_ = (int) Math.floor(0.5 + ((double) i_1481_ / (double) i_1480_));
					i_1480_ += i;
					int i_1493_ = i_1482_ >>> 24;
					int i_1494_ = (int) Math.sqrt((double) (65536 + ((i_1492_ >> 8) * (i_1492_ >> 8))));
					if (i_1483_ == 0 || 1 == i_1483_ && 255 == i_1493_) {
						while (i <= i_1480_) {
							int i_1495_ = i_1479_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1495_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1495_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1486_ < i_1484_)
								((Class106_Sub2) this).anIntArray10218[i + (((Class106_Sub2) this).anInt10217 * -994907113 * i_1495_)] = i_1482_;
							i_1479_ += i_1492_;
							i++;
							i_1486_ += i_1494_;
							i_1486_ %= i_1489_;
						}
					} else if (1 == i_1483_) {
						i_1482_ = ((i_1493_ << 24) + ((i_1493_ * (i_1482_ & 0xff00) >> 8 & 0xff00) + ((i_1482_ & 0xff00ff) * i_1493_ >> 8 & 0xff00ff)));
						int i_1496_ = 256 - i_1493_;
						while (i <= i_1480_) {
							int i_1497_ = i_1479_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1497_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1497_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1486_ < i_1484_) {
								int i_1498_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1497_) + i);
								int i_1499_ = (((Class106_Sub2) this).anIntArray10218[i_1498_]);
								i_1499_ = (((i_1499_ & 0xff00) * i_1496_ >> 8 & 0xff00) + ((i_1499_ & 0xff00ff) * i_1496_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[i_1498_] = i_1499_ + i_1482_;
							}
							i_1479_ += i_1492_;
							i++;
							i_1486_ += i_1494_;
							i_1486_ %= i_1489_;
						}
					} else if (2 == i_1483_) {
						while (i <= i_1480_) {
							int i_1500_ = i_1479_ >> 16;
							if (i >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1500_ >= (((Class106_Sub2) this).anInt10222) * 2029354259 && i_1500_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1486_ < i_1484_) {
								int i_1501_ = i + (i_1500_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_1502_ = (((Class106_Sub2) this).anIntArray10218[i_1501_]);
								int i_1503_ = i_1482_ + i_1502_;
								int i_1504_ = ((i_1502_ & 0xff00ff) + (i_1482_ & 0xff00ff));
								i_1502_ = ((i_1503_ - i_1504_ & 0x10000) + (i_1504_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1501_] = i_1503_ - i_1502_ | i_1502_ - (i_1502_ >>> 8);
							}
							i_1479_ += i_1492_;
							i++;
							i_1486_ += i_1494_;
							i_1486_ %= i_1489_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1480_ <<= 16;
					int i_1505_ = (int) Math.floor((double) i_1480_ / (double) i_1481_ + 0.5);
					i_1481_ += i_1479_;
					int i_1506_ = i_1482_ >>> 24;
					int i_1507_ = (int) Math.sqrt((double) (65536 + ((i_1505_ >> 8) * (i_1505_ >> 8))));
					if (i_1483_ == 0 || i_1483_ == 1 && 255 == i_1506_) {
						while (i_1479_ <= i_1481_) {
							int i_1508_ = i >> 16;
							if (i_1479_ >= (((Class106_Sub2) this).anInt10222 * 2029354259) && i_1479_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1508_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1508_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1486_ < i_1484_)
								((Class106_Sub2) this).anIntArray10218[i_1508_ + i_1479_ * (((Class106_Sub2) this).anInt10217 * -994907113)] = i_1482_;
							i += i_1505_;
							i_1479_++;
							i_1486_ += i_1507_;
							i_1486_ %= i_1489_;
						}
					} else if (i_1483_ == 1) {
						i_1482_ = (((i_1482_ & 0xff00ff) * i_1506_ >> 8 & 0xff00ff) + ((i_1482_ & 0xff00) * i_1506_ >> 8 & 0xff00) + (i_1506_ << 24));
						int i_1509_ = 256 - i_1506_;
						while (i_1479_ <= i_1481_) {
							int i_1510_ = i >> 16;
							if (i_1479_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1479_ < 1704244235 * ((Class106_Sub2) this).anInt10223 && i_1510_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1510_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1486_ < i_1484_) {
								int i_1511_ = (i_1510_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1479_));
								int i_1512_ = (((Class106_Sub2) this).anIntArray10218[i_1511_]);
								i_1512_ = ((i_1509_ * (i_1512_ & 0xff00) >> 8 & 0xff00) + ((i_1512_ & 0xff00ff) * i_1509_ >> 8 & 0xff00ff));
								((Class106_Sub2) this).anIntArray10218[(i_1479_ * (((Class106_Sub2) this).anInt10217 * -994907113)) + i_1510_] = i_1512_ + i_1482_;
							}
							i += i_1505_;
							i_1479_++;
							i_1486_ += i_1507_;
							i_1486_ %= i_1489_;
						}
					} else if (2 == i_1483_) {
						while (i_1479_ <= i_1481_) {
							int i_1513_ = i >> 16;
							if (i_1479_ >= 2029354259 * (((Class106_Sub2) this).anInt10222) && i_1479_ < (((Class106_Sub2) this).anInt10223 * 1704244235) && i_1513_ >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i_1513_ < 892939761 * ((Class106_Sub2) this).anInt10221 && i_1486_ < i_1484_) {
								int i_1514_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1479_) + i_1513_);
								int i_1515_ = (((Class106_Sub2) this).anIntArray10218[i_1514_]);
								int i_1516_ = i_1515_ + i_1482_;
								int i_1517_ = ((i_1515_ & 0xff00ff) + (i_1482_ & 0xff00ff));
								i_1515_ = ((i_1516_ - i_1517_ & 0x10000) + (i_1517_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1514_] = i_1516_ - i_1515_ | i_1515_ - (i_1515_ >>> 8);
							}
							i += i_1505_;
							i_1479_++;
							i_1486_ += i_1507_;
							i_1486_ %= i_1489_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method1961(int i, int i_1518_, int i_1519_) {
		for (int i_1520_ = 0; i_1520_ < ((Class106_Sub2) this).aClass186Array10213.length; i_1520_++) {
			Class186 class186 = ((Class106_Sub2) this).aClass186Array10213[i_1520_];
			((Class186) class186).anInt2191 = (i & 0xffffff) * -1008638461;
			int i_1521_ = ((Class186) class186).anInt2191 * 219346091 >>> 16 & 0xff;
			if (i_1521_ < 2)
				i_1521_ = 2;
			int i_1522_ = 219346091 * ((Class186) class186).anInt2191 >> 8 & 0xff;
			if (i_1522_ < 2)
				i_1522_ = 2;
			int i_1523_ = ((Class186) class186).anInt2191 * 219346091 & 0xff;
			if (i_1523_ < 2)
				i_1523_ = 2;
			((Class186) class186).anInt2191 = -1008638461 * (i_1521_ << 16 | i_1522_ << 8 | i_1523_);
			if (i_1518_ < 0)
				((Class186) class186).aBool2218 = false;
			else
				((Class186) class186).aBool2218 = true;
		}
	}

	void method1721(int i, int i_1524_, int i_1525_, int i_1526_, int i_1527_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			if (i_1525_ < 0)
				i_1525_ = -i_1525_;
			int i_1528_ = i_1524_ - i_1525_;
			if (i_1528_ < ((Class106_Sub2) this).anInt10222 * 2029354259)
				i_1528_ = ((Class106_Sub2) this).anInt10222 * 2029354259;
			int i_1529_ = i_1524_ + i_1525_ + 1;
			if (i_1529_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1529_ = ((Class106_Sub2) this).anInt10223 * 1704244235;
			int i_1530_ = i_1528_;
			int i_1531_ = i_1525_ * i_1525_;
			int i_1532_ = 0;
			int i_1533_ = i_1524_ - i_1530_;
			int i_1534_ = i_1533_ * i_1533_;
			int i_1535_ = i_1534_ - i_1533_;
			if (i_1524_ > i_1529_)
				i_1524_ = i_1529_;
			int i_1536_ = i_1526_ >>> 24;
			if (0 == i_1527_ || i_1527_ == 1 && i_1536_ == 255) {
				while (i_1530_ < i_1524_) {
					for (/**/; i_1535_ <= i_1531_ || i_1534_ <= i_1531_; i_1535_ += i_1532_++ + i_1532_)
						i_1534_ += i_1532_ + i_1532_;
					int i_1537_ = i - i_1532_ + 1;
					if (i_1537_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_1537_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_1538_ = i + i_1532_;
					if (i_1538_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_1538_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_1539_ = i_1537_ + (((Class106_Sub2) this).anInt10217 * -994907113 * i_1530_);
					for (int i_1540_ = i_1537_; i_1540_ < i_1538_; i_1540_++)
						((Class106_Sub2) this).anIntArray10218[i_1539_++] = i_1526_;
					i_1530_++;
					i_1534_ -= i_1533_-- + i_1533_;
					i_1535_ -= i_1533_ + i_1533_;
				}
				i_1532_ = i_1525_;
				i_1533_ = i_1530_ - i_1524_;
				i_1535_ = i_1531_ + i_1533_ * i_1533_;
				i_1534_ = i_1535_ - i_1532_;
				i_1535_ -= i_1533_;
				while (i_1530_ < i_1529_) {
					for (/**/; i_1535_ > i_1531_ && i_1534_ > i_1531_; i_1534_ -= i_1532_ + i_1532_)
						i_1535_ -= i_1532_-- + i_1532_;
					int i_1541_ = i - i_1532_;
					if (i_1541_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_1541_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_1542_ = i + i_1532_;
					if (i_1542_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_1542_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_1543_ = i_1541_ + (((Class106_Sub2) this).anInt10217 * -994907113 * i_1530_);
					for (int i_1544_ = i_1541_; i_1544_ <= i_1542_; i_1544_++)
						((Class106_Sub2) this).anIntArray10218[i_1543_++] = i_1526_;
					i_1530_++;
					i_1535_ += i_1533_ + i_1533_;
					i_1534_ += i_1533_++ + i_1533_;
				}
			} else if (i_1527_ == 1) {
				i_1526_ = ((i_1536_ * (i_1526_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1526_ & 0xff00) * i_1536_ >> 8 & 0xff00) + (i_1536_ << 24));
				int i_1545_ = 256 - i_1536_;
				while (i_1530_ < i_1524_) {
					for (/**/; i_1535_ <= i_1531_ || i_1534_ <= i_1531_; i_1535_ += i_1532_++ + i_1532_)
						i_1534_ += i_1532_ + i_1532_;
					int i_1546_ = i - i_1532_ + 1;
					if (i_1546_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_1546_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_1547_ = i_1532_ + i;
					if (i_1547_ > ((Class106_Sub2) this).anInt10221 * 892939761)
						i_1547_ = 892939761 * ((Class106_Sub2) this).anInt10221;
					int i_1548_ = (i_1530_ * (-994907113 * ((Class106_Sub2) this).anInt10217) + i_1546_);
					for (int i_1549_ = i_1546_; i_1549_ < i_1547_; i_1549_++) {
						int i_1550_ = ((Class106_Sub2) this).anIntArray10218[i_1548_];
						i_1550_ = (((i_1550_ & 0xff00) * i_1545_ >> 8 & 0xff00) + (i_1545_ * (i_1550_ & 0xff00ff) >> 8 & 0xff00ff));
						((Class106_Sub2) this).anIntArray10218[i_1548_++] = i_1526_ + i_1550_;
					}
					i_1530_++;
					i_1534_ -= i_1533_-- + i_1533_;
					i_1535_ -= i_1533_ + i_1533_;
				}
				i_1532_ = i_1525_;
				i_1533_ = -i_1533_;
				i_1535_ = i_1531_ + i_1533_ * i_1533_;
				i_1534_ = i_1535_ - i_1532_;
				i_1535_ -= i_1533_;
				while (i_1530_ < i_1529_) {
					for (/**/; i_1535_ > i_1531_ && i_1534_ > i_1531_; i_1534_ -= i_1532_ + i_1532_)
						i_1535_ -= i_1532_-- + i_1532_;
					int i_1551_ = i - i_1532_;
					if (i_1551_ < 1179466163 * ((Class106_Sub2) this).anInt10220)
						i_1551_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_1552_ = i + i_1532_;
					if (i_1552_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_1552_ = (((Class106_Sub2) this).anInt10221 * 892939761 - 1);
					int i_1553_ = (i_1530_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1551_);
					for (int i_1554_ = i_1551_; i_1554_ <= i_1552_; i_1554_++) {
						int i_1555_ = ((Class106_Sub2) this).anIntArray10218[i_1553_];
						i_1555_ = ((i_1545_ * (i_1555_ & 0xff00) >> 8 & 0xff00) + ((i_1555_ & 0xff00ff) * i_1545_ >> 8 & 0xff00ff));
						((Class106_Sub2) this).anIntArray10218[i_1553_++] = i_1555_ + i_1526_;
					}
					i_1530_++;
					i_1535_ += i_1533_ + i_1533_;
					i_1534_ += i_1533_++ + i_1533_;
				}
			} else if (2 == i_1527_) {
				while (i_1530_ < i_1524_) {
					for (/**/; i_1535_ <= i_1531_ || i_1534_ <= i_1531_; i_1535_ += i_1532_++ + i_1532_)
						i_1534_ += i_1532_ + i_1532_;
					int i_1556_ = 1 + (i - i_1532_);
					if (i_1556_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_1556_ = 1179466163 * ((Class106_Sub2) this).anInt10220;
					int i_1557_ = i_1532_ + i;
					if (i_1557_ > 892939761 * ((Class106_Sub2) this).anInt10221)
						i_1557_ = ((Class106_Sub2) this).anInt10221 * 892939761;
					int i_1558_ = (i_1530_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1556_);
					for (int i_1559_ = i_1556_; i_1559_ < i_1557_; i_1559_++) {
						int i_1560_ = ((Class106_Sub2) this).anIntArray10218[i_1558_];
						int i_1561_ = i_1526_ + i_1560_;
						int i_1562_ = (i_1526_ & 0xff00ff) + (i_1560_ & 0xff00ff);
						i_1560_ = (i_1562_ & 0x1000100) + (i_1561_ - i_1562_ & 0x10000);
						((Class106_Sub2) this).anIntArray10218[i_1558_++] = i_1561_ - i_1560_ | i_1560_ - (i_1560_ >>> 8);
					}
					i_1530_++;
					i_1534_ -= i_1533_-- + i_1533_;
					i_1535_ -= i_1533_ + i_1533_;
				}
				i_1532_ = i_1525_;
				i_1533_ = -i_1533_;
				i_1535_ = i_1533_ * i_1533_ + i_1531_;
				i_1534_ = i_1535_ - i_1532_;
				i_1535_ -= i_1533_;
				while (i_1530_ < i_1529_) {
					for (/**/; i_1535_ > i_1531_ && i_1534_ > i_1531_; i_1534_ -= i_1532_ + i_1532_)
						i_1535_ -= i_1532_-- + i_1532_;
					int i_1563_ = i - i_1532_;
					if (i_1563_ < ((Class106_Sub2) this).anInt10220 * 1179466163)
						i_1563_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					int i_1564_ = i_1532_ + i;
					if (i_1564_ > 892939761 * ((Class106_Sub2) this).anInt10221 - 1)
						i_1564_ = (892939761 * ((Class106_Sub2) this).anInt10221 - 1);
					int i_1565_ = (i_1530_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1563_);
					for (int i_1566_ = i_1563_; i_1566_ <= i_1564_; i_1566_++) {
						int i_1567_ = ((Class106_Sub2) this).anIntArray10218[i_1565_];
						int i_1568_ = i_1526_ + i_1567_;
						int i_1569_ = (i_1567_ & 0xff00ff) + (i_1526_ & 0xff00ff);
						i_1567_ = (i_1569_ & 0x1000100) + (i_1568_ - i_1569_ & 0x10000);
						((Class106_Sub2) this).anIntArray10218[i_1565_++] = i_1568_ - i_1567_ | i_1567_ - (i_1567_ >>> 8);
					}
					i_1530_++;
					i_1535_ += i_1533_ + i_1533_;
					i_1534_ += i_1533_++ + i_1533_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class103 method1962(int i) {
		return null;
	}

	byte method9525(int i) {
		return aClass94_1396.getTexture(i, -554436073).aByte1343;
	}

	public Class103 method2025(int i) {
		return null;
	}

	public Class103 method1956(Class103 class103, Class103 class103_1570_, float f, Class103 class103_1571_) {
		return null;
	}

	public void method1725(int i, int i_1572_, int i_1573_, int i_1574_, int i_1575_, int i_1576_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
				i_1573_ -= 1179466163 * ((Class106_Sub2) this).anInt10220 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i_1572_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
				i_1574_ -= (((Class106_Sub2) this).anInt10222 * 2029354259 - i_1572_);
				i_1572_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_1573_ + i > 892939761 * ((Class106_Sub2) this).anInt10221)
				i_1573_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			if (i_1572_ + i_1574_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1574_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1572_;
			if (i_1573_ > 0 && i_1574_ > 0 && i <= 892939761 * ((Class106_Sub2) this).anInt10221 && i_1572_ <= 1704244235 * ((Class106_Sub2) this).anInt10223) {
				int i_1577_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_1573_;
				int i_1578_ = i + i_1572_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				int i_1579_ = i_1575_ >>> 24;
				if (0 == i_1576_ || 1 == i_1576_ && 255 == i_1579_) {
					int i_1580_ = i_1573_ >> 3;
					int i_1581_ = i_1573_ & 0x7;
					i_1573_ = i_1578_ - 1;
					for (int i_1582_ = -i_1574_; i_1582_ < 0; i_1582_++) {
						if (i_1580_ > 0) {
							i = i_1580_;
							do {
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
							} while (--i > 0);
						}
						if (i_1581_ > 0) {
							i = i_1581_;
							do
								((Class106_Sub2) this).anIntArray10218[++i_1573_] = i_1575_;
							while (--i > 0);
						}
						i_1573_ += i_1577_;
					}
				} else if (1 == i_1576_) {
					i_1575_ = (((i_1575_ & 0xff00ff) * i_1579_ >> 8 & 0xff00ff) + (i_1579_ * ((i_1575_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_1583_ = 256 - i_1579_;
					for (int i_1584_ = 0; i_1584_ < i_1574_; i_1584_++) {
						for (int i_1585_ = -i_1573_; i_1585_ < 0; i_1585_++) {
							int i_1586_ = (((Class106_Sub2) this).anIntArray10218[i_1578_]);
							i_1586_ = (((i_1586_ & 0xff00ff) * i_1583_ >> 8 & 0xff00ff) + (((i_1586_ & ~0xff00ff) >>> 8) * i_1583_ & ~0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_1578_++] = i_1575_ + i_1586_;
						}
						i_1578_ += i_1577_;
					}
				} else if (i_1576_ == 2) {
					for (int i_1587_ = 0; i_1587_ < i_1574_; i_1587_++) {
						for (int i_1588_ = -i_1573_; i_1588_ < 0; i_1588_++) {
							int i_1589_ = (((Class106_Sub2) this).anIntArray10218[i_1578_]);
							int i_1590_ = i_1575_ + i_1589_;
							int i_1591_ = (i_1575_ & 0xff00ff) + (i_1589_ & 0xff00ff);
							i_1589_ = ((i_1590_ - i_1591_ & 0x10000) + (i_1591_ & 0x1000100));
							((Class106_Sub2) this).anIntArray10218[i_1578_++] = i_1590_ - i_1589_ | i_1589_ - (i_1589_ >>> 8);
						}
						i_1578_ += i_1577_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1901(Class103 class103) {
		/* empty */
	}

	public void method1968(Class103 class103) {
		/* empty */
	}

	public void method2014(int i, int i_1592_, int i_1593_, int i_1594_) {
		if (((Class106_Sub2) this).anInt10220 * 1179466163 < i)
			((Class106_Sub2) this).anInt10220 = i * -1154212485;
		if (2029354259 * ((Class106_Sub2) this).anInt10222 < i_1592_)
			((Class106_Sub2) this).anInt10222 = -685124325 * i_1592_;
		if (((Class106_Sub2) this).anInt10221 * 892939761 > i_1593_)
			((Class106_Sub2) this).anInt10221 = i_1593_ * 1219240721;
		if (1704244235 * ((Class106_Sub2) this).anInt10223 > i_1594_)
			((Class106_Sub2) this).anInt10223 = -372688989 * i_1594_;
		method9507();
	}

	public void method2008() {
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10221 = -1650666873 * ((Class106_Sub2) this).anInt10217;
		((Class106_Sub2) this).anInt10223 = ((Class106_Sub2) this).anInt10236 * 2144570611;
		method9507();
	}

	public void method1971(int i, int i_1595_) {
		/* empty */
	}

	public void method1700(int i, int i_1596_) {
		/* empty */
	}

	public boolean method1973() {
		return false;
	}

	public boolean method1974() {
		return false;
	}

	int[] method5197(int i, int i_1597_) {
		Class572_Sub38 class572_sub38;
		synchronized (((Class106_Sub2) this).aClass127_10247) {
			class572_sub38 = (Class572_Sub38) (((Class106_Sub2) this).aClass127_10247.method2246((long) (i_1597_ & 0xffff | (i & 0xffff) << 16) | ~0x7fffffffffffffffL));
			if (class572_sub38 == null) {
				MaterialInformation class101 = aClass94_1396.getTexture(i, 1944350476);
				int i_1598_ = class101.anInt1338 * 1913535271;
				if (!anInterface5_1408.method25(i_1597_, Class514.aClass514_5713, 0.7F, i_1598_, i_1598_, true, 623425594)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class511.aClass511_5695 != class101.aClass511_1342)
					is = anInterface5_1408.method24(i_1597_, 0.7F, i_1598_, i_1598_, true, 1371302107);
				else
					is = anInterface5_1408.method23(i_1597_, 0.7F, i_1598_, i_1598_, true, -386803837);
				class572_sub38 = new Class572_Sub38(i, i_1597_, i_1598_, is, (Class511.aClass511_5696 != class101.aClass511_1342));
				((Class106_Sub2) this).aClass127_10247.method2230(class572_sub38, ((long) (i_1597_ & 0xffff | (i & 0xffff) << 16) | ~0x7fffffffffffffffL), i_1598_ * i_1598_, 1550284403);
			}
		}
		((Class572_Sub38) class572_sub38).aBool9386 = true;
		return class572_sub38.method8765();
	}

	public void method1976(float f, float f_1599_, float f_1600_, float f_1601_, float f_1602_) {
		/* empty */
	}

	public void method1981(float f, float f_1603_, float f_1604_, float f_1605_, float f_1606_) {
		/* empty */
	}

	public void method1978(float f, float f_1607_, float f_1608_, float f_1609_, float f_1610_) {
		/* empty */
	}

	public Class96 method1927(int[] is) {
		return null;
	}

	public boolean method1980() {
		return false;
	}

	public boolean method1807() {
		return false;
	}

	public void method1879(int i, int i_1611_, int i_1612_, int i_1613_, int i_1614_, int i_1615_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
				i_1612_ -= 1179466163 * ((Class106_Sub2) this).anInt10220 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i_1611_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
				i_1613_ -= (((Class106_Sub2) this).anInt10222 * 2029354259 - i_1611_);
				i_1611_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_1612_ + i > 892939761 * ((Class106_Sub2) this).anInt10221)
				i_1612_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			if (i_1611_ + i_1613_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1613_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1611_;
			if (i_1612_ > 0 && i_1613_ > 0 && i <= 892939761 * ((Class106_Sub2) this).anInt10221 && i_1611_ <= 1704244235 * ((Class106_Sub2) this).anInt10223) {
				int i_1616_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_1612_;
				int i_1617_ = i + i_1611_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				int i_1618_ = i_1614_ >>> 24;
				if (0 == i_1615_ || 1 == i_1615_ && 255 == i_1618_) {
					int i_1619_ = i_1612_ >> 3;
					int i_1620_ = i_1612_ & 0x7;
					i_1612_ = i_1617_ - 1;
					for (int i_1621_ = -i_1613_; i_1621_ < 0; i_1621_++) {
						if (i_1619_ > 0) {
							i = i_1619_;
							do {
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
							} while (--i > 0);
						}
						if (i_1620_ > 0) {
							i = i_1620_;
							do
								((Class106_Sub2) this).anIntArray10218[++i_1612_] = i_1614_;
							while (--i > 0);
						}
						i_1612_ += i_1616_;
					}
				} else if (1 == i_1615_) {
					i_1614_ = (((i_1614_ & 0xff00ff) * i_1618_ >> 8 & 0xff00ff) + (i_1618_ * ((i_1614_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_1622_ = 256 - i_1618_;
					for (int i_1623_ = 0; i_1623_ < i_1613_; i_1623_++) {
						for (int i_1624_ = -i_1612_; i_1624_ < 0; i_1624_++) {
							int i_1625_ = (((Class106_Sub2) this).anIntArray10218[i_1617_]);
							i_1625_ = (((i_1625_ & 0xff00ff) * i_1622_ >> 8 & 0xff00ff) + (((i_1625_ & ~0xff00ff) >>> 8) * i_1622_ & ~0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_1617_++] = i_1614_ + i_1625_;
						}
						i_1617_ += i_1616_;
					}
				} else if (i_1615_ == 2) {
					for (int i_1626_ = 0; i_1626_ < i_1613_; i_1626_++) {
						for (int i_1627_ = -i_1612_; i_1627_ < 0; i_1627_++) {
							int i_1628_ = (((Class106_Sub2) this).anIntArray10218[i_1617_]);
							int i_1629_ = i_1614_ + i_1628_;
							int i_1630_ = (i_1614_ & 0xff00ff) + (i_1628_ & 0xff00ff);
							i_1628_ = ((i_1629_ - i_1630_ & 0x10000) + (i_1630_ & 0x1000100));
							((Class106_Sub2) this).anIntArray10218[i_1617_++] = i_1629_ - i_1628_ | i_1628_ - (i_1628_ >>> 8);
						}
						i_1617_ += i_1616_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1852() {
		/* empty */
	}

	public void method1910(Class105 class105) {
		method9513(null != ((Class106_Sub2) this).anIntArray10218, ((Class106_Sub2) this).aFloatArray10219 != null, false, class105);
	}

	public Class250 method1933() {
		Class186 class186 = method9512(Thread.currentThread());
		return ((Class186) class186).aClass250_2185;
	}

	public boolean method2006() {
		return false;
	}

	public boolean method1986() {
		return false;
	}

	public boolean method1987() {
		return false;
	}

	void method1988(float f, float f_1631_, float f_1632_, float f_1633_, float f_1634_, float f_1635_) {
		/* empty */
	}

	public void method1989(int i, Class86 class86) {
		for (int i_1636_ = 0; i_1636_ < ((Class106_Sub2) this).aClass186Array10213.length; i_1636_++) {
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1636_]).anInt2183 = 522561057 * (((Class186) (((Class106_Sub2) this).aClass186Array10213[i_1636_])).anInt2191);
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1636_]).anInt2182 = i * -2040499037;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1636_]).anInt2191 = class86.anInt1193 * -212184699;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1636_]).anInt2173 = 160837573 * class86.anInt1190;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1636_]).aBool2201 = true;
		}
	}

	public void method1757(int i, Class86 class86) {
		for (int i_1637_ = 0; i_1637_ < ((Class106_Sub2) this).aClass186Array10213.length; i_1637_++) {
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1637_]).anInt2183 = 522561057 * (((Class186) (((Class106_Sub2) this).aClass186Array10213[i_1637_])).anInt2191);
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1637_]).anInt2182 = i * -2040499037;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1637_]).anInt2191 = class86.anInt1193 * -212184699;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1637_]).anInt2173 = 160837573 * class86.anInt1190;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i_1637_]).aBool2201 = true;
		}
	}

	public void method1665(int i, Class86 class86) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).anInt2182 = -2040499037 * i;
		((Class186) class186).anInt2191 = -212184699 * class86.anInt1193;
		((Class186) class186).anInt2173 = class86.anInt1190 * 160837573;
	}

	public void method1992(int i, Class86 class86) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).anInt2182 = -2040499037 * i;
		((Class186) class186).anInt2191 = -212184699 * class86.anInt1193;
		((Class186) class186).anInt2173 = class86.anInt1190 * 160837573;
	}

	public void method1845() {
		for (int i = 0; i < ((Class106_Sub2) this).aClass186Array10213.length; i++) {
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i]).anInt2191 = 581918177 * ((Class186) (((Class106_Sub2) this).aClass186Array10213[i])).anInt2183;
			((Class186) ((Class106_Sub2) this).aClass186Array10213[i]).aBool2201 = false;
		}
	}

	public void method1994(int i, int i_1638_, float f, int i_1639_, int i_1640_, float f_1641_, int i_1642_, int i_1643_, float f_1644_, int i_1645_, int i_1646_, int i_1647_, int i_1648_) {
		boolean bool = ((Class106_Sub2) this).anIntArray10218 != null;
		boolean bool_1649_ = ((Class106_Sub2) this).aFloatArray10219 != null;
		if (bool || bool_1649_) {
			Class186 class186 = method9512(Thread.currentThread());
			Class143 class143 = ((Class186) class186).aClass143_2187;
			((Class143) class143).aBoolean16 = false;
			i -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_1639_ -= 1179466163 * ((Class106_Sub2) this).anInt10220;
			i_1642_ -= ((Class106_Sub2) this).anInt10220 * 1179466163;
			i_1638_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_1640_ -= 2029354259 * ((Class106_Sub2) this).anInt10222;
			i_1643_ -= ((Class106_Sub2) this).anInt10222 * 2029354259;
			((Class143) class143).aBoolean20 = (i < 0 || i > ((Class143) class143).anInt22 || i_1639_ < 0 || i_1639_ > ((Class143) class143).anInt22 || i_1642_ < 0 || i_1642_ > ((Class143) class143).anInt22);
			int i_1650_ = i_1645_ >>> 24;
			if (0 == i_1648_ || 1 == i_1648_ && 255 == i_1650_) {
				((Class143) class143).anInt19 = 0;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_1649_, false, (float) i_1638_, (float) i_1640_, (float) i_1643_, (float) i, (float) i_1639_, (float) i_1642_, f, f_1641_, f_1644_, i_1645_, i_1646_, i_1647_);
			} else if (1 == i_1648_) {
				((Class143) class143).anInt19 = 255 - i_1650_;
				((Class143) class143).aBoolean48 = false;
				class143.method292(bool, bool_1649_, false, (float) i_1638_, (float) i_1640_, (float) i_1643_, (float) i, (float) i_1639_, (float) i_1642_, f, f_1641_, f_1644_, i_1645_, i_1646_, i_1647_);
			} else if (2 == i_1648_) {
				((Class143) class143).anInt19 = 128;
				((Class143) class143).aBoolean48 = true;
				class143.method292(bool, bool_1649_, false, (float) i_1638_, (float) i_1640_, (float) i_1643_, (float) i, (float) i_1639_, (float) i_1642_, f, f_1641_, f_1644_, i_1645_, i_1646_, i_1647_);
			} else
				throw new IllegalArgumentException();
			((Class143) class143).aBoolean16 = true;
		}
	}

	Interface6 method9527(int i, int i_1651_) {
		return new Class198(i, i_1651_);
	}

	public void method1877(float f, float f_1652_, float f_1653_, float[] fs) {
		float f_1654_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_1653_) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7] * f_1652_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3]) * f)));
		float f_1655_ = ((f_1653_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8]) + (f * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0] + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4] * f_1652_)));
		float f_1656_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9] * f_1653_) + ((f_1652_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
		float f_1657_ = (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14] + ((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2] * f + (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6] * f_1652_) + f_1653_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
		fs[0] = (f_1655_ * ((Class106_Sub2) this).aFloat10239 / f_1654_ + ((Class106_Sub2) this).aFloat10246);
		fs[1] = (f_1656_ * ((Class106_Sub2) this).aFloat10241 / f_1654_ + ((Class106_Sub2) this).aFloat10242);
		fs[2] = f_1657_;
	}

	public void method1784(int i, int i_1658_, int i_1659_, int i_1660_) {
		((Class106_Sub2) this).anInt10226 = 2044040611 * i;
		((Class106_Sub2) this).anInt10252 = 242258385 * i_1658_;
		((Class106_Sub2) this).anInt10237 = -165466987 * i_1659_;
		((Class106_Sub2) this).anInt10238 = i_1660_ * 1561063743;
		method9507();
	}

	public void method1859() {
		((Class106_Sub2) this).aClass104_Sub1_10250 = null;
		((Class106_Sub2) this).aClass161_10251 = null;
	}

	public void method1999(float f, float f_1661_, float f_1662_, float[] fs) {
		float f_1663_ = (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[2] * f + ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[14] + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[6] * f_1661_) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[10] * f_1662_));
		float f_1664_ = ((f_1661_ * ((Class106_Sub2) this).aClass250_10233.aFloatArray2728[7]) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[15] + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[3])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[11] * f_1662_));
		if (f_1663_ < -f_1664_ || f_1663_ > f_1664_) {
			float[] fs_1665_ = fs;
			float[] fs_1666_ = fs;
			fs[2] = Float.NaN;
			fs_1666_[1] = Float.NaN;
			fs_1665_[0] = Float.NaN;
		} else {
			float f_1667_ = (f_1661_ * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[4]) + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[12]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[0])) + (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[8] * f_1662_));
			if (f_1667_ < -f_1664_ || f_1667_ > f_1664_) {
				float[] fs_1668_ = fs;
				float[] fs_1669_ = fs;
				fs[2] = Float.NaN;
				fs_1669_[1] = Float.NaN;
				fs_1668_[0] = Float.NaN;
			} else {
				float f_1670_ = ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[9]) * f_1662_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[5]) * f_1661_ + ((((Class106_Sub2) this).aClass250_10233.aFloatArray2728[13]) + f * (((Class106_Sub2) this).aClass250_10233.aFloatArray2728[1]))));
				if (f_1670_ < -f_1664_ || f_1670_ > f_1664_) {
					float[] fs_1671_ = fs;
					float[] fs_1672_ = fs;
					fs[2] = Float.NaN;
					fs_1672_[1] = Float.NaN;
					fs_1671_[0] = Float.NaN;
				} else {
					float f_1673_ = ((((Class106_Sub2) this).aClass250_10231.aFloatArray2728[14]) + f * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[2]) + f_1661_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[6]) + f_1662_ * (((Class106_Sub2) this).aClass250_10231.aFloatArray2728[10]));
					fs[0] = (((Class106_Sub2) this).aFloat10239 * f_1667_ / f_1664_) + ((Class106_Sub2) this).aFloat10246;
					fs[1] = (((Class106_Sub2) this).aFloat10242 + (f_1670_ * ((Class106_Sub2) this).aFloat10241 / f_1664_));
					fs[2] = f_1673_;
				}
			}
		}
	}

	public boolean method1863() {
		return false;
	}

	void method1881(int i, int i_1674_, int i_1675_, int i_1676_, int i_1677_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i_1674_ >= 2029354259 * ((Class106_Sub2) this).anInt10222 && i_1674_ < 1704244235 * ((Class106_Sub2) this).anInt10223)) {
			if (i < ((Class106_Sub2) this).anInt10220 * 1179466163) {
				i_1675_ -= ((Class106_Sub2) this).anInt10220 * 1179466163 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i + i_1675_ > ((Class106_Sub2) this).anInt10221 * 892939761)
				i_1675_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			int i_1678_ = i + ((Class106_Sub2) this).anInt10217 * -994907113 * i_1674_;
			int i_1679_ = i_1676_ >>> 24;
			if (0 == i_1677_ || i_1677_ == 1 && 255 == i_1679_) {
				for (int i_1680_ = 0; i_1680_ < i_1675_; i_1680_++)
					((Class106_Sub2) this).anIntArray10218[i_1678_ + i_1680_] = i_1676_;
			} else if (i_1677_ == 1) {
				i_1676_ = ((i_1679_ << 24) + ((i_1679_ * (i_1676_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1679_ * (i_1676_ & 0xff00) >> 8 & 0xff00)));
				int i_1681_ = 256 - i_1679_;
				for (int i_1682_ = 0; i_1682_ < i_1675_; i_1682_++) {
					int i_1683_ = (((Class106_Sub2) this).anIntArray10218[i_1682_ + i_1678_]);
					i_1683_ = (((i_1683_ & 0xff00ff) * i_1681_ >> 8 & 0xff00ff) + (i_1681_ * (i_1683_ & 0xff00) >> 8 & 0xff00));
					((Class106_Sub2) this).anIntArray10218[i_1682_ + i_1678_] = i_1676_ + i_1683_;
				}
			} else if (i_1677_ == 2) {
				for (int i_1684_ = 0; i_1684_ < i_1675_; i_1684_++) {
					int i_1685_ = (((Class106_Sub2) this).anIntArray10218[i_1678_ + i_1684_]);
					int i_1686_ = i_1685_ + i_1676_;
					int i_1687_ = (i_1676_ & 0xff00ff) + (i_1685_ & 0xff00ff);
					i_1685_ = (i_1686_ - i_1687_ & 0x10000) + (i_1687_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_1678_ + i_1684_] = i_1686_ - i_1685_ | i_1685_ - (i_1685_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface11 method1810(int i, int i_1688_) {
		return new Class151(i, i_1688_);
	}

	public Interface11 method1750(int i, int i_1689_, int i_1690_) {
		return new Class151(i, i_1689_);
	}

	public Class165 method2011() {
		return new Class165(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class161 method2005(int[] is, int i, int i_1691_, int i_1692_, int i_1693_, boolean bool) {
		boolean bool_1694_ = false;
		int i_1695_ = i;
		while_45_: for (int i_1696_ = 0; i_1696_ < i_1693_; i_1696_++) {
			for (int i_1697_ = 0; i_1697_ < i_1692_; i_1697_++) {
				int i_1698_ = is[i_1695_++] >>> 24;
				if (i_1698_ != 0 && i_1698_ != 255) {
					bool_1694_ = true;
					break while_45_;
				}
			}
		}
		if (bool_1694_)
			return new Class161_Sub3_Sub3(this, is, i, i_1691_, i_1692_, i_1693_, bool);
		return new Class161_Sub3_Sub2(this, is, i, i_1691_, i_1692_, i_1693_, bool);
	}

	public Class161 method1697(int[] is, int i, int i_1699_, int i_1700_, int i_1701_, boolean bool) {
		boolean bool_1702_ = false;
		int i_1703_ = i;
		while_46_: for (int i_1704_ = 0; i_1704_ < i_1701_; i_1704_++) {
			for (int i_1705_ = 0; i_1705_ < i_1700_; i_1705_++) {
				int i_1706_ = is[i_1703_++] >>> 24;
				if (i_1706_ != 0 && i_1706_ != 255) {
					bool_1702_ = true;
					break while_46_;
				}
			}
		}
		if (bool_1702_)
			return new Class161_Sub3_Sub3(this, is, i, i_1699_, i_1700_, i_1701_, bool);
		return new Class161_Sub3_Sub2(this, is, i, i_1699_, i_1700_, i_1701_, bool);
	}

	public void method1790(int i, Class86 class86) {
		Class186 class186 = method9512(Thread.currentThread());
		((Class186) class186).anInt2182 = -2040499037 * i;
		((Class186) class186).anInt2191 = -212184699 * class86.anInt1193;
		((Class186) class186).anInt2173 = class86.anInt1190 * 160837573;
	}

	public void method1946(int[] is) {
		is[0] = ((Class106_Sub2) this).anInt10220 * 1179466163;
		is[1] = 2029354259 * ((Class106_Sub2) this).anInt10222;
		is[2] = 892939761 * ((Class106_Sub2) this).anInt10221;
		is[3] = ((Class106_Sub2) this).anInt10223 * 1704244235;
	}

	public void method2029(int i, Class167 class167, int i_1707_, int i_1708_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1709_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1710_;
			if (1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_1708_)
				i_1710_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1708_;
			else
				i_1710_ = is.length;
			int i_1711_;
			if (2029354259 * ((Class106_Sub2) this).anInt10222 > i_1708_) {
				i_1711_ = 2029354259 * ((Class106_Sub2) this).anInt10222 - i_1708_;
				i_1708_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			} else
				i_1711_ = 0;
			if (i_1710_ - i_1711_ > 0) {
				int i_1712_ = i_1708_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				for (int i_1713_ = i_1711_; i_1713_ < i_1710_; i_1713_++) {
					int i_1714_ = i_1707_ + is[i_1713_];
					int i_1715_ = is_1709_[i_1713_];
					if (1179466163 * ((Class106_Sub2) this).anInt10220 > i_1714_) {
						i_1715_ -= (1179466163 * ((Class106_Sub2) this).anInt10220 - i_1714_);
						i_1714_ = ((Class106_Sub2) this).anInt10220 * 1179466163;
					}
					if (((Class106_Sub2) this).anInt10221 * 892939761 < i_1715_ + i_1714_)
						i_1715_ = (892939761 * ((Class106_Sub2) this).anInt10221 - i_1714_);
					i_1714_ += i_1712_;
					for (int i_1716_ = -i_1715_; i_1716_ < 0; i_1716_++)
						((Class106_Sub2) this).anIntArray10218[i_1714_++] = i;
					i_1712_ += -994907113 * ((Class106_Sub2) this).anInt10217;
				}
			}
		}
	}

	public void method1788() {
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10221 = -1650666873 * ((Class106_Sub2) this).anInt10217;
		((Class106_Sub2) this).anInt10223 = ((Class106_Sub2) this).anInt10236 * 2144570611;
		method9507();
	}

	void method1883(int i, int i_1717_, int i_1718_, int i_1719_, int i_1720_) {
		if (((Class106_Sub2) this).anIntArray10218 != null && (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < 892939761 * ((Class106_Sub2) this).anInt10221)) {
			if (i_1717_ < ((Class106_Sub2) this).anInt10222 * 2029354259) {
				i_1718_ -= (((Class106_Sub2) this).anInt10222 * 2029354259 - i_1717_);
				i_1717_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_1717_ + i_1718_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1718_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1717_;
			int i_1721_ = i + i_1717_ * (-994907113 * ((Class106_Sub2) this).anInt10217);
			int i_1722_ = i_1719_ >>> 24;
			if (i_1720_ == 0 || i_1720_ == 1 && i_1722_ == 255) {
				for (int i_1723_ = 0; i_1723_ < i_1718_; i_1723_++)
					((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1723_) + i_1721_] = i_1719_;
			} else if (i_1720_ == 1) {
				i_1719_ = ((i_1722_ << 24) + ((i_1722_ * (i_1719_ & 0xff00) >> 8 & 0xff00) + ((i_1719_ & 0xff00ff) * i_1722_ >> 8 & 0xff00ff)));
				int i_1724_ = 256 - i_1722_;
				for (int i_1725_ = 0; i_1725_ < i_1718_; i_1725_++) {
					int i_1726_ = (i_1721_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1725_));
					int i_1727_ = ((Class106_Sub2) this).anIntArray10218[i_1726_];
					i_1727_ = (((i_1727_ & 0xff00) * i_1724_ >> 8 & 0xff00) + ((i_1727_ & 0xff00ff) * i_1724_ >> 8 & 0xff00ff));
					((Class106_Sub2) this).anIntArray10218[i_1726_] = i_1719_ + i_1727_;
				}
			} else if (i_1720_ == 2) {
				for (int i_1728_ = 0; i_1728_ < i_1718_; i_1728_++) {
					int i_1729_ = (i_1721_ + i_1728_ * (-994907113 * ((Class106_Sub2) this).anInt10217));
					int i_1730_ = ((Class106_Sub2) this).anIntArray10218[i_1729_];
					int i_1731_ = i_1730_ + i_1719_;
					int i_1732_ = (i_1719_ & 0xff00ff) + (i_1730_ & 0xff00ff);
					i_1730_ = (i_1731_ - i_1732_ & 0x10000) + (i_1732_ & 0x1000100);
					((Class106_Sub2) this).anIntArray10218[i_1729_] = i_1731_ - i_1730_ | i_1730_ - (i_1730_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2003() {
		((Class106_Sub2) this).anInt10220 = 0;
		((Class106_Sub2) this).anInt10222 = 0;
		((Class106_Sub2) this).anInt10221 = -1650666873 * ((Class106_Sub2) this).anInt10217;
		((Class106_Sub2) this).anInt10223 = ((Class106_Sub2) this).anInt10236 * 2144570611;
		method9507();
	}

	int method5199(int i) {
		return aClass94_1396.getTexture(i, 917739497).anInt1338 * 1913535271;
	}

	public void method1870(int i, int i_1733_, int i_1734_, int i_1735_) {
		if (((Class106_Sub2) this).anInt10220 * 1179466163 < i)
			((Class106_Sub2) this).anInt10220 = i * -1154212485;
		if (2029354259 * ((Class106_Sub2) this).anInt10222 < i_1733_)
			((Class106_Sub2) this).anInt10222 = -685124325 * i_1733_;
		if (((Class106_Sub2) this).anInt10221 * 892939761 > i_1734_)
			((Class106_Sub2) this).anInt10221 = i_1734_ * 1219240721;
		if (1704244235 * ((Class106_Sub2) this).anInt10223 > i_1735_)
			((Class106_Sub2) this).anInt10223 = -372688989 * i_1735_;
		method9507();
	}

	public boolean method2016() {
		return false;
	}

	public int method2015() {
		return 0;
	}

	public void method1731(int i, int i_1736_, int i_1737_, int i_1738_, int i_1739_, int i_1740_, Class167 class167, int i_1741_, int i_1742_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1743_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1744_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_1742_ ? 2029354259 * ((Class106_Sub2) this).anInt10222 : i_1742_);
			int i_1745_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < is.length + i_1742_) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : i_1742_ + is.length);
			i_1737_ -= i;
			i_1738_ -= i_1736_;
			if (i_1737_ + i_1738_ < 0) {
				i += i_1737_;
				i_1737_ = -i_1737_;
				i_1736_ += i_1738_;
				i_1738_ = -i_1738_;
			}
			if (i_1737_ > i_1738_) {
				i_1736_ <<= 16;
				i_1736_ += 32768;
				i_1738_ <<= 16;
				int i_1746_ = (int) Math.floor((double) i_1738_ / (double) i_1737_ + 0.5);
				i_1737_ += i;
				if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
					i_1736_ += i_1746_ * ((1179466163 * ((Class106_Sub2) this).anInt10220) - i);
					i = ((Class106_Sub2) this).anInt10220 * 1179466163;
				}
				if (i_1737_ >= ((Class106_Sub2) this).anInt10221 * 892939761)
					i_1737_ = 892939761 * ((Class106_Sub2) this).anInt10221 - 1;
				int i_1747_ = i_1739_ >>> 24;
				if (0 == i_1740_ || 1 == i_1740_ && i_1747_ == 255) {
					for (/**/; i <= i_1737_; i++) {
						int i_1748_ = i_1736_ >> 16;
						int i_1749_ = i_1748_ - i_1742_;
						if (i_1748_ >= i_1744_ && i_1748_ < i_1745_) {
							int i_1750_ = i_1741_ + is[i_1749_];
							if (i >= i_1750_ && i < is_1743_[i_1749_] + i_1750_)
								((Class106_Sub2) this).anIntArray10218[i + (i_1748_ * (((Class106_Sub2) this).anInt10217 * -994907113))] = i_1739_;
						}
						i_1736_ += i_1746_;
					}
				} else if (i_1740_ == 1) {
					i_1739_ = ((i_1747_ << 24) + ((i_1747_ * (i_1739_ & 0xff00) >> 8 & 0xff00) + ((i_1739_ & 0xff00ff) * i_1747_ >> 8 & 0xff00ff)));
					int i_1751_ = 256 - i_1747_;
					for (/**/; i <= i_1737_; i++) {
						int i_1752_ = i_1736_ >> 16;
						int i_1753_ = i_1752_ - i_1742_;
						if (i_1752_ >= i_1744_ && i_1752_ < i_1745_) {
							int i_1754_ = is[i_1753_] + i_1741_;
							if (i >= i_1754_ && i < is_1743_[i_1753_] + i_1754_) {
								int i_1755_ = i + (i_1752_ * (((Class106_Sub2) this).anInt10217 * -994907113));
								int i_1756_ = (((Class106_Sub2) this).anIntArray10218[i_1755_]);
								i_1756_ = ((i_1751_ * (i_1756_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1751_ * (i_1756_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1755_] = i_1739_ + i_1756_;
							}
						}
						i_1736_ += i_1746_;
					}
				} else if (2 == i_1740_) {
					for (/**/; i <= i_1737_; i++) {
						int i_1757_ = i_1736_ >> 16;
						int i_1758_ = i_1757_ - i_1742_;
						if (i_1757_ >= i_1744_ && i_1757_ < i_1745_) {
							int i_1759_ = i_1741_ + is[i_1758_];
							if (i >= i_1759_ && i < i_1759_ + is_1743_[i_1758_]) {
								int i_1760_ = (i_1757_ * (-994907113 * (((Class106_Sub2) this).anInt10217)) + i);
								int i_1761_ = (((Class106_Sub2) this).anIntArray10218[i_1760_]);
								int i_1762_ = i_1761_ + i_1739_;
								int i_1763_ = ((i_1739_ & 0xff00ff) + (i_1761_ & 0xff00ff));
								i_1761_ = ((i_1762_ - i_1763_ & 0x10000) + (i_1763_ & 0x1000100));
								((Class106_Sub2) this).anIntArray10218[i_1760_] = i_1762_ - i_1761_ | i_1761_ - (i_1761_ >>> 8);
							}
						}
						i_1736_ += i_1746_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1737_ <<= 16;
				int i_1764_ = (int) Math.floor((double) i_1737_ / (double) i_1738_ + 0.5);
				i_1738_ += i_1736_;
				if (i_1736_ < i_1744_) {
					i += (i_1744_ - i_1736_) * i_1764_;
					i_1736_ = i_1744_;
				}
				if (i_1738_ >= i_1745_)
					i_1738_ = i_1745_ - 1;
				int i_1765_ = i_1739_ >>> 24;
				if (i_1740_ == 0 || i_1740_ == 1 && i_1765_ == 255) {
					for (/**/; i_1736_ <= i_1738_; i_1736_++) {
						int i_1766_ = i >> 16;
						int i_1767_ = i_1736_ - i_1742_;
						int i_1768_ = i_1741_ + is[i_1767_];
						if ((i_1766_ >= ((Class106_Sub2) this).anInt10220 * 1179466163) && i_1766_ < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1766_ >= i_1768_ && i_1766_ < i_1768_ + is_1743_[i_1767_])
							((Class106_Sub2) this).anIntArray10218[i_1766_ + i_1736_ * (-994907113 * (((Class106_Sub2) this).anInt10217))] = i_1739_;
						i += i_1764_;
					}
				} else if (i_1740_ == 1) {
					i_1739_ = (((i_1739_ & 0xff00ff) * i_1765_ >> 8 & 0xff00ff) + ((i_1739_ & 0xff00) * i_1765_ >> 8 & 0xff00) + (i_1765_ << 24));
					int i_1769_ = 256 - i_1765_;
					for (/**/; i_1736_ <= i_1738_; i_1736_++) {
						int i_1770_ = i >> 16;
						int i_1771_ = i_1736_ - i_1742_;
						int i_1772_ = i_1741_ + is[i_1771_];
						if ((i_1770_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_1770_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1770_ >= i_1772_ && i_1770_ < is_1743_[i_1771_] + i_1772_) {
							int i_1773_ = ((-994907113 * ((Class106_Sub2) this).anInt10217 * i_1736_) + i_1770_);
							int i_1774_ = (((Class106_Sub2) this).anIntArray10218[i_1773_]);
							i_1774_ = (((i_1774_ & 0xff00) * i_1769_ >> 8 & 0xff00) + ((i_1774_ & 0xff00ff) * i_1769_ >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_1736_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1770_] = i_1739_ + i_1774_;
						}
						i += i_1764_;
					}
				} else if (2 == i_1740_) {
					for (/**/; i_1736_ <= i_1738_; i_1736_++) {
						int i_1775_ = i >> 16;
						int i_1776_ = i_1736_ - i_1742_;
						int i_1777_ = is[i_1776_] + i_1741_;
						if ((i_1775_ >= 1179466163 * ((Class106_Sub2) this).anInt10220) && i_1775_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1775_ >= i_1777_ && i_1775_ < i_1777_ + is_1743_[i_1776_]) {
							int i_1778_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1736_) + i_1775_);
							int i_1779_ = (((Class106_Sub2) this).anIntArray10218[i_1778_]);
							int i_1780_ = i_1739_ + i_1779_;
							int i_1781_ = (i_1739_ & 0xff00ff) + (i_1779_ & 0xff00ff);
							i_1779_ = (i_1781_ & 0x1000100) + (i_1780_ - i_1781_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1778_] = i_1780_ - i_1779_ | i_1779_ - (i_1779_ >>> 8);
						}
						i += i_1764_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method1742() {
		return false;
	}

	public boolean method1675() {
		return false;
	}

	public boolean method1993() {
		return false;
	}

	public void method2019(Class96 class96, float f, Class96 class96_1782_, float f_1783_, Class96 class96_1784_, float f_1785_) {
		/* empty */
	}

	public void method1876(int i, int i_1786_, int i_1787_, int i_1788_, int i_1789_, int i_1790_) {
		if (null != ((Class106_Sub2) this).anIntArray10218) {
			if (i < 1179466163 * ((Class106_Sub2) this).anInt10220) {
				i_1787_ -= 1179466163 * ((Class106_Sub2) this).anInt10220 - i;
				i = ((Class106_Sub2) this).anInt10220 * 1179466163;
			}
			if (i_1786_ < 2029354259 * ((Class106_Sub2) this).anInt10222) {
				i_1788_ -= (((Class106_Sub2) this).anInt10222 * 2029354259 - i_1786_);
				i_1786_ = 2029354259 * ((Class106_Sub2) this).anInt10222;
			}
			if (i_1787_ + i > 892939761 * ((Class106_Sub2) this).anInt10221)
				i_1787_ = 892939761 * ((Class106_Sub2) this).anInt10221 - i;
			if (i_1786_ + i_1788_ > 1704244235 * ((Class106_Sub2) this).anInt10223)
				i_1788_ = ((Class106_Sub2) this).anInt10223 * 1704244235 - i_1786_;
			if (i_1787_ > 0 && i_1788_ > 0 && i <= 892939761 * ((Class106_Sub2) this).anInt10221 && i_1786_ <= 1704244235 * ((Class106_Sub2) this).anInt10223) {
				int i_1791_ = ((Class106_Sub2) this).anInt10217 * -994907113 - i_1787_;
				int i_1792_ = i + i_1786_ * (((Class106_Sub2) this).anInt10217 * -994907113);
				int i_1793_ = i_1789_ >>> 24;
				if (0 == i_1790_ || 1 == i_1790_ && 255 == i_1793_) {
					int i_1794_ = i_1787_ >> 3;
					int i_1795_ = i_1787_ & 0x7;
					i_1787_ = i_1792_ - 1;
					for (int i_1796_ = -i_1788_; i_1796_ < 0; i_1796_++) {
						if (i_1794_ > 0) {
							i = i_1794_;
							do {
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
							} while (--i > 0);
						}
						if (i_1795_ > 0) {
							i = i_1795_;
							do
								((Class106_Sub2) this).anIntArray10218[++i_1787_] = i_1789_;
							while (--i > 0);
						}
						i_1787_ += i_1791_;
					}
				} else if (1 == i_1790_) {
					i_1789_ = (((i_1789_ & 0xff00ff) * i_1793_ >> 8 & 0xff00ff) + (i_1793_ * ((i_1789_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_1797_ = 256 - i_1793_;
					for (int i_1798_ = 0; i_1798_ < i_1788_; i_1798_++) {
						for (int i_1799_ = -i_1787_; i_1799_ < 0; i_1799_++) {
							int i_1800_ = (((Class106_Sub2) this).anIntArray10218[i_1792_]);
							i_1800_ = (((i_1800_ & 0xff00ff) * i_1797_ >> 8 & 0xff00ff) + (((i_1800_ & ~0xff00ff) >>> 8) * i_1797_ & ~0xff00ff));
							((Class106_Sub2) this).anIntArray10218[i_1792_++] = i_1789_ + i_1800_;
						}
						i_1792_ += i_1791_;
					}
				} else if (i_1790_ == 2) {
					for (int i_1801_ = 0; i_1801_ < i_1788_; i_1801_++) {
						for (int i_1802_ = -i_1787_; i_1802_ < 0; i_1802_++) {
							int i_1803_ = (((Class106_Sub2) this).anIntArray10218[i_1792_]);
							int i_1804_ = i_1789_ + i_1803_;
							int i_1805_ = (i_1789_ & 0xff00ff) + (i_1803_ & 0xff00ff);
							i_1803_ = ((i_1804_ - i_1805_ & 0x10000) + (i_1805_ & 0x1000100));
							((Class106_Sub2) this).anIntArray10218[i_1792_++] = i_1804_ - i_1803_ | i_1803_ - (i_1803_ >>> 8);
						}
						i_1792_ += i_1791_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1899(int i, int i_1806_, int i_1807_, int i_1808_, int i_1809_, int i_1810_, Class167 class167, int i_1811_, int i_1812_, int i_1813_, int i_1814_, int i_1815_) {
		if (((Class106_Sub2) this).anIntArray10218 != null) {
			Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
			int[] is = ((Class167_Sub1) class167_sub1).anIntArray10871;
			int[] is_1816_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
			int i_1817_ = (((Class106_Sub2) this).anInt10222 * 2029354259 > i_1812_ ? ((Class106_Sub2) this).anInt10222 * 2029354259 : i_1812_);
			int i_1818_ = ((1704244235 * ((Class106_Sub2) this).anInt10223 < i_1812_ + is.length) ? ((Class106_Sub2) this).anInt10223 * 1704244235 : is.length + i_1812_);
			i_1815_ <<= 8;
			i_1813_ <<= 8;
			i_1814_ <<= 8;
			int i_1819_ = i_1814_ + i_1813_;
			i_1815_ %= i_1819_;
			i_1807_ -= i;
			i_1808_ -= i_1806_;
			if (i_1808_ + i_1807_ < 0) {
				int i_1820_ = (int) (Math.sqrt((double) (i_1807_ * i_1807_ + i_1808_ * i_1808_)) * 256.0);
				int i_1821_ = i_1820_ % i_1819_;
				i_1815_ = i_1813_ + i_1819_ - i_1815_ - i_1821_;
				i_1815_ %= i_1819_;
				if (i_1815_ < 0)
					i_1815_ += i_1819_;
				i += i_1807_;
				i_1807_ = -i_1807_;
				i_1806_ += i_1808_;
				i_1808_ = -i_1808_;
			}
			if (i_1807_ > i_1808_) {
				i_1806_ <<= 16;
				i_1806_ += 32768;
				i_1808_ <<= 16;
				int i_1822_ = (int) Math.floor((double) i_1808_ / (double) i_1807_ + 0.5);
				i_1807_ += i;
				int i_1823_ = i_1809_ >>> 24;
				int i_1824_ = (int) Math.sqrt((double) ((i_1822_ >> 8) * (i_1822_ >> 8) + 65536));
				if (0 == i_1810_ || 1 == i_1810_ && i_1823_ == 255) {
					while (i <= i_1807_) {
						int i_1825_ = i_1806_ >> 16;
						int i_1826_ = i_1825_ - i_1812_;
						if (i >= 1179466163 * ((Class106_Sub2) this).anInt10220 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1825_ >= i_1817_ && i_1825_ < i_1818_ && i_1815_ < i_1813_) {
							int i_1827_ = is[i_1826_] + i_1811_;
							if (i >= i_1827_ && i < is_1816_[i_1826_] + i_1827_)
								((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1825_) + i] = i_1809_;
						}
						i_1806_ += i_1822_;
						i++;
						i_1815_ += i_1824_;
						i_1815_ %= i_1819_;
					}
				} else if (i_1810_ == 1) {
					i_1809_ = ((i_1823_ * (i_1809_ & 0xff00) >> 8 & 0xff00) + ((i_1809_ & 0xff00ff) * i_1823_ >> 8 & 0xff00ff) + (i_1823_ << 24));
					int i_1828_ = 256 - i_1823_;
					while (i <= i_1807_) {
						int i_1829_ = i_1806_ >> 16;
						int i_1830_ = i_1829_ - i_1812_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1829_ >= i_1817_ && i_1829_ < i_1818_ && i_1815_ < i_1813_) {
							int i_1831_ = i_1811_ + is[i_1830_];
							if (i >= i_1831_ && i < is_1816_[i_1830_] + i_1831_) {
								int i_1832_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1829_) + i);
								int i_1833_ = (((Class106_Sub2) this).anIntArray10218[i_1832_]);
								i_1833_ = (((i_1833_ & 0xff00ff) * i_1828_ >> 8 & 0xff00ff) + (i_1828_ * (i_1833_ & 0xff00) >> 8 & 0xff00));
								((Class106_Sub2) this).anIntArray10218[i_1832_] = i_1809_ + i_1833_;
							}
						}
						i_1806_ += i_1822_;
						i++;
						i_1815_ += i_1824_;
						i_1815_ %= i_1819_;
					}
				} else if (2 == i_1810_) {
					while (i <= i_1807_) {
						int i_1834_ = i_1806_ >> 16;
						int i_1835_ = i_1834_ - i_1812_;
						if (i >= ((Class106_Sub2) this).anInt10220 * 1179466163 && i < (892939761 * ((Class106_Sub2) this).anInt10221) && i_1834_ >= i_1817_ && i_1834_ < i_1818_ && i_1815_ < i_1813_) {
							int i_1836_ = i_1811_ + is[i_1835_];
							if (i >= i_1836_ && i < i_1836_ + is_1816_[i_1835_]) {
								int i_1837_ = ((((Class106_Sub2) this).anInt10217 * -994907113 * i_1834_) + i);
								int i_1838_ = (((Class106_Sub2) this).anIntArray10218[i_1837_]);
								int i_1839_ = i_1838_ + i_1809_;
								int i_1840_ = ((i_1838_ & 0xff00ff) + (i_1809_ & 0xff00ff));
								i_1838_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
								((Class106_Sub2) this).anIntArray10218[i_1837_] = i_1839_ - i_1838_ | i_1838_ - (i_1838_ >>> 8);
							}
						}
						i_1806_ += i_1822_;
						i++;
						i_1815_ += i_1824_;
						i_1815_ %= i_1819_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1807_ <<= 16;
				int i_1841_ = (int) Math.floor((double) i_1807_ / (double) i_1808_ + 0.5);
				int i_1842_ = (int) Math.sqrt((double) (65536 + (i_1841_ >> 8) * (i_1841_ >> 8)));
				i_1808_ += i_1806_;
				int i_1843_ = i_1809_ >>> 24;
				if (0 == i_1810_ || 1 == i_1810_ && 255 == i_1843_) {
					while (i_1806_ <= i_1808_) {
						int i_1844_ = i >> 16;
						int i_1845_ = i_1806_ - i_1812_;
						if (i_1806_ >= i_1817_ && i_1806_ < i_1818_ && i_1844_ >= (1179466163 * ((Class106_Sub2) this).anInt10220) && i_1844_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1815_ < i_1813_ && i_1844_ >= i_1811_ + is[i_1845_] && (i_1844_ < is[i_1845_] + i_1811_ + is_1816_[i_1845_]))
							((Class106_Sub2) this).anIntArray10218[i_1844_ + i_1806_ * ((((Class106_Sub2) this).anInt10217) * -994907113)] = i_1809_;
						i += i_1841_;
						i_1806_++;
						i_1815_ += i_1842_;
						i_1815_ %= i_1819_;
					}
				} else if (i_1810_ == 1) {
					i_1809_ = ((i_1843_ << 24) + ((i_1843_ * (i_1809_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1843_ * (i_1809_ & 0xff00) >> 8 & 0xff00)));
					int i_1846_ = 256 - i_1843_;
					while (i_1806_ <= i_1808_) {
						int i_1847_ = i >> 16;
						int i_1848_ = i_1806_ - i_1812_;
						if (i_1806_ >= i_1817_ && i_1806_ < i_1818_ && i_1847_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1847_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1815_ < i_1813_ && i_1847_ >= i_1811_ + is[i_1848_] && (i_1847_ < i_1811_ + is[i_1848_] + is_1816_[i_1848_])) {
							int i_1849_ = (i_1847_ + (-994907113 * ((Class106_Sub2) this).anInt10217 * i_1806_));
							int i_1850_ = (((Class106_Sub2) this).anIntArray10218[i_1849_]);
							i_1850_ = (((i_1850_ & 0xff00) * i_1846_ >> 8 & 0xff00) + (i_1846_ * (i_1850_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class106_Sub2) this).anIntArray10218[(((Class106_Sub2) this).anInt10217 * -994907113 * i_1806_) + i_1847_] = i_1809_ + i_1850_;
						}
						i += i_1841_;
						i_1806_++;
						i_1815_ += i_1842_;
						i_1815_ %= i_1819_;
					}
				} else if (2 == i_1810_) {
					while (i_1806_ <= i_1808_) {
						int i_1851_ = i >> 16;
						int i_1852_ = i_1806_ - i_1812_;
						if (i_1806_ >= i_1817_ && i_1806_ < i_1818_ && i_1851_ >= (((Class106_Sub2) this).anInt10220 * 1179466163) && i_1851_ < (((Class106_Sub2) this).anInt10221 * 892939761) && i_1815_ < i_1813_ && i_1851_ >= i_1811_ + is[i_1852_] && i_1851_ < is_1816_[i_1852_] + (i_1811_ + is[i_1852_])) {
							int i_1853_ = (i_1806_ * (((Class106_Sub2) this).anInt10217 * -994907113) + i_1851_);
							int i_1854_ = (((Class106_Sub2) this).anIntArray10218[i_1853_]);
							int i_1855_ = i_1854_ + i_1809_;
							int i_1856_ = (i_1854_ & 0xff00ff) + (i_1809_ & 0xff00ff);
							i_1854_ = (i_1856_ & 0x1000100) + (i_1855_ - i_1856_ & 0x10000);
							((Class106_Sub2) this).anIntArray10218[i_1853_] = i_1855_ - i_1854_ | i_1854_ - (i_1854_ >>> 8);
						}
						i += i_1841_;
						i_1806_++;
						i_1815_ += i_1842_;
						i_1815_ %= i_1819_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface6 method2021(int i, int i_1857_, Class171 class171, Class88 class88, int i_1858_) {
		return method9527(i, i_1857_);
	}

	public Interface6 method2000(int i, int i_1859_, Class171 class171, Class88 class88, int i_1860_) {
		return method9527(i, i_1859_);
	}

	public Class104_Sub1 method2040() {
		return new Class104_Sub1_Sub2(this);
	}

	static final void method9529(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class471.method5563(class73, class441, -1416700220);
	}

	static final void method9530(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1861_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1862_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class84.method1271(i_1861_, i_1862_ >> 14 & 0x3fff, i_1862_ & 0x3fff, true, -2088953791);
	}

	static final void method9531(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class128.method2257(class73, class83, class441, -1776256163);
	}
}
