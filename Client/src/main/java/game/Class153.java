package game;

/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class153 {
	Class142 aClass142_1710;
	Class572_Sub15_Sub1 aClass572_Sub15_Sub1_1711;
	Interface9 anInterface9_1712;
	int[] anIntArray1713;
	Class142 aClass142_1714;
	Class142 aClass142_1715;
	int anInt1716 = 1600;
	int anInt1717 = 768;
	static float aFloat1718;
	int anInt1719;
	int anInt1720 = 64;
	int[] anIntArray1721;
	int[] anIntArray1722;
	int anInt1723 = 64;
	Class591_Sub2_Sub1[][] aClass591_Sub2_Sub1ArrayArray1724;
	float[] aFloatArray1725 = new float[16];
	int anInt1726;
	Class591_Sub2_Sub1[][] aClass591_Sub2_Sub1ArrayArray1727;

	void method2506(Class106_Sub1 class106_sub1, Class105 class105) {
		if (((Class106_Sub1) class106_sub1).aClass250_10197 != null) {
			method2508(class106_sub1);
			float f = (((Class106_Sub1) class106_sub1).aClass250_10197.aFloatArray2728[2]);
			float f_0_ = (((Class106_Sub1) class106_sub1).aClass250_10197.aFloatArray2728[6]);
			float f_1_ = (((Class106_Sub1) class106_sub1).aClass250_10197.aFloatArray2728[10]);
			float f_2_ = (((Class106_Sub1) class106_sub1).aClass250_10197.aFloatArray2728[14]);
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class591_Sub2 class591_sub2 = class105.aClass657_1385.aClass591_Sub2_8420;
				for (Class591_Sub2 class591_sub2_5_ = class591_sub2.aClass591_Sub2_9183; class591_sub2_5_ != class591_sub2; class591_sub2_5_ = class591_sub2_5_.aClass591_Sub2_9183) {
					Class591_Sub2_Sub1 class591_sub2_sub1 = (Class591_Sub2_Sub1) class591_sub2_5_;
					int i_6_ = (int) (f * (float) (class591_sub2_sub1.anInt10970 >> 12) + (f_0_ * (float) (class591_sub2_sub1.anInt10973 >> 12)) + (f_1_ * (float) (class591_sub2_sub1.anInt10975 >> 12)) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					((Class153) this).anIntArray1721[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = (1 + Class522.method6220(i_7_, -435280361) - ((Class153) this).anInt1719);
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class591_Sub2 class591_sub2_9_ = class591_sub2.aClass591_Sub2_9183;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class591_sub2_9_ != class591_sub2) {
					((Class153) this).anInt1726 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						((Class153) this).anIntArray1722[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						((Class153) this).anIntArray1713[i_13_] = 0;
					for (/**/; class591_sub2_9_ != class591_sub2; class591_sub2_9_ = class591_sub2_9_.aClass591_Sub2_9183) {
						Class591_Sub2_Sub1 class591_sub2_sub1 = (Class591_Sub2_Sub1) class591_sub2_9_;
						if (bool_11_) {
							i_10_ = class591_sub2_sub1.anInt10972;
							bool = class591_sub2_sub1.aBool10979;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != class591_sub2_sub1.anInt10972 || bool != class591_sub2_sub1.aBool10979)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = (((Class153) this).anIntArray1721[i++] - i_3_ >> i_8_);
						if (i_14_ < 1600) {
							if (((Class153) this).anIntArray1722[i_14_] < 64)
								((Class153) this).aClass591_Sub2_Sub1ArrayArray1724[i_14_][((Class153) this).anIntArray1722[i_14_]++] = class591_sub2_sub1;
							else {
								if (((Class153) this).anIntArray1722[i_14_] == 64) {
									if (((Class153) this).anInt1726 == 64)
										continue;
									((Class153) this).anIntArray1722[i_14_] += 1 + ((Class153) this).anInt1726++;
								}
								((Class153) this).aClass591_Sub2_Sub1ArrayArray1727[(((Class153) this).anIntArray1722[i_14_] - 64 - 1)][((Class153) this).anIntArray1713[(((Class153) this).anIntArray1722[i_14_]) - 64 - 1]++] = class591_sub2_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class106_sub1.method9389(i_10_);
					else
						class106_sub1.method9389(-1);
					if (bool && (((Class106_Sub1) class106_sub1).aFloat10119 != aFloat1718))
						class106_sub1.method1709(aFloat1718);
					else if (((Class106_Sub1) class106_sub1).aFloat10119 != 1.0F)
						class106_sub1.method1709(1.0F);
					method2507(class106_sub1, i_7_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2509(class106_sub1);
		}
	}

	void method2507(Class106_Sub1 class106_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class153) this).aFloatArray1725, 0);
		float f = ((Class153) this).aFloatArray1725[0];
		float f_15_ = ((Class153) this).aFloatArray1725[4];
		float f_16_ = ((Class153) this).aFloatArray1725[8];
		float f_17_ = ((Class153) this).aFloatArray1725[1];
		float f_18_ = ((Class153) this).aFloatArray1725[5];
		float f_19_ = ((Class153) this).aFloatArray1725[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		float[] fs = new float[3];
		float[] fs_29_ = new float[3];
		((Class106_Sub1) class106_sub1).aClass250_10093.method3486(((Class106_Sub1) class106_sub1).aClass250_10078);
		((Class153) this).aClass572_Sub15_Sub1_1711.o = 0;
		if (((Class106_Sub1) class106_sub1).aBool10153) {
			for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
				int i_31_ = (((Class153) this).anIntArray1722[i_30_] > 64 ? 64 : ((Class153) this).anIntArray1722[i_30_]);
				if (i_31_ > 0) {
					for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
						Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class153) this).aClass591_Sub2_Sub1ArrayArray1724[i_30_][i_32_]);
						int i_33_ = class591_sub2_sub1.anInt10974;
						byte i_34_ = (byte) (i_33_ >> 16);
						byte i_35_ = (byte) (i_33_ >> 8);
						byte i_36_ = (byte) i_33_;
						byte i_37_ = (byte) (i_33_ >>> 24);
						float f_38_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
						float f_39_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
						float f_40_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
						int i_41_ = class591_sub2_sub1.anInt10976 >> 12;
						if (class591_sub2_sub1.aShort10978 != 0) {
							((Class106_Sub1) class106_sub1).aClass250_10094.method3472(class591_sub2_sub1.aShort10978, i_41_, i_41_, 0.0F, 0.0F, 0.0F);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3445(((Class106_Sub1) class106_sub1).aClass250_10093);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3449(1.0F, 0.0F, 0.0F, fs);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3449(0.0F, 1.0F, 0.0F, fs_29_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ - fs[0] - fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ - fs[1] - fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ - fs[2] - fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ - fs[0] + fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ - fs[1] + fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ - fs[2] + fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + fs[0] + fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + fs[1] + fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + fs[2] + fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + fs[0] - fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + fs[1] - fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + fs[2] - fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
						} else {
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + f_20_ * (float) -i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + f_21_ * (float) -i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + f_22_ * (float) -i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + f_26_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + f_27_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + f_28_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + f_20_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + f_21_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + f_22_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_38_ + f_23_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_39_ + f_24_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_40_ + f_25_ * (float) i_41_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_34_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_35_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_36_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_37_, -1384395473);
						}
					}
					if (((Class153) this).anIntArray1722[i_30_] > 64) {
						int i_42_ = ((Class153) this).anIntArray1722[i_30_] - 64 - 1;
						for (int i_43_ = ((Class153) this).anIntArray1713[i_42_] - 1; i_43_ >= 0; i_43_--) {
							Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class153) this).aClass591_Sub2_Sub1ArrayArray1727[i_42_][i_43_]);
							int i_44_ = class591_sub2_sub1.anInt10974;
							byte i_45_ = (byte) (i_44_ >> 16);
							byte i_46_ = (byte) (i_44_ >> 8);
							byte i_47_ = (byte) i_44_;
							byte i_48_ = (byte) (i_44_ >>> 24);
							float f_49_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
							float f_50_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
							float f_51_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
							int i_52_ = class591_sub2_sub1.anInt10976 >> 12;
							if (class591_sub2_sub1.aShort10978 != 0) {
								((Class106_Sub1) class106_sub1).aClass250_10094.method3472(class591_sub2_sub1.aShort10978, i_52_, i_52_, 0.0F, 0.0F, 0.0F);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3445(((Class106_Sub1) class106_sub1).aClass250_10093);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3449(1.0F, 0.0F, 0.0F, fs);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3449(0.0F, 1.0F, 0.0F, fs_29_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ - fs[0] - fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ - fs[1] - fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ - fs[2] - fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ - fs[0] + fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ - fs[1] + fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ - fs[2] + fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + fs[0] + fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + fs[1] + fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + fs[2] + fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + fs[0] - fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + fs[1] - fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + fs[2] - fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
							} else {
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + f_20_ * (float) -i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + f_21_ * (float) -i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + f_22_ * (float) -i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + f_26_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + f_27_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + f_28_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + f_20_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + f_21_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + f_22_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_49_ + f_23_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_50_ + f_24_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10299(f_51_ + f_25_ * (float) i_52_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_45_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_46_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_47_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_48_, -1384395473);
							}
						}
					}
				}
			}
		} else {
			for (int i_53_ = i - 1; i_53_ >= 0; i_53_--) {
				int i_54_ = (((Class153) this).anIntArray1722[i_53_] > 64 ? 64 : ((Class153) this).anIntArray1722[i_53_]);
				if (i_54_ > 0) {
					for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
						Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class153) this).aClass591_Sub2_Sub1ArrayArray1724[i_53_][i_55_]);
						int i_56_ = class591_sub2_sub1.anInt10974;
						byte i_57_ = (byte) (i_56_ >> 16);
						byte i_58_ = (byte) (i_56_ >> 8);
						byte i_59_ = (byte) i_56_;
						byte i_60_ = (byte) (i_56_ >>> 24);
						float f_61_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
						float f_62_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
						float f_63_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
						int i_64_ = class591_sub2_sub1.anInt10976 >> 12;
						if (class591_sub2_sub1.aShort10978 != 0) {
							((Class106_Sub1) class106_sub1).aClass250_10094.method3472(class591_sub2_sub1.aShort10978, i_64_, i_64_, 0.0F, 0.0F, 0.0F);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3445(((Class106_Sub1) class106_sub1).aClass250_10093);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3449(1.0F, 0.0F, 0.0F, fs);
							((Class106_Sub1) class106_sub1).aClass250_10094.method3449(0.0F, 1.0F, 0.0F, fs_29_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ - fs[0] - fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ - fs[1] - fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ - fs[2] - fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ - fs[0] + fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ - fs[1] + fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ - fs[2] + fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + fs[0] + fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + fs[1] + fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + fs[2] + fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + fs[0] - fs_29_[0]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + fs[1] - fs_29_[1]);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + fs[2] - fs_29_[2]);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
						} else {
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + f_20_ * (float) -i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + f_21_ * (float) -i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + f_22_ * (float) -i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + f_26_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + f_27_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + f_28_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + f_20_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + f_21_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + f_22_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_61_ + f_23_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_62_ + f_24_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_63_ + f_25_ * (float) i_64_);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_57_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_58_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_59_, -1384395473);
							((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_60_, -1384395473);
						}
					}
					if (((Class153) this).anIntArray1722[i_53_] > 64) {
						int i_65_ = ((Class153) this).anIntArray1722[i_53_] - 64 - 1;
						for (int i_66_ = ((Class153) this).anIntArray1713[i_65_] - 1; i_66_ >= 0; i_66_--) {
							Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class153) this).aClass591_Sub2_Sub1ArrayArray1727[i_65_][i_66_]);
							int i_67_ = class591_sub2_sub1.anInt10974;
							byte i_68_ = (byte) (i_67_ >> 16);
							byte i_69_ = (byte) (i_67_ >> 8);
							byte i_70_ = (byte) i_67_;
							byte i_71_ = (byte) (i_67_ >>> 24);
							float f_72_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
							float f_73_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
							float f_74_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
							int i_75_ = class591_sub2_sub1.anInt10976 >> 12;
							if (class591_sub2_sub1.aShort10978 != 0) {
								((Class106_Sub1) class106_sub1).aClass250_10094.method3472(class591_sub2_sub1.aShort10978, i_75_, i_75_, 0.0F, 0.0F, 0.0F);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3445(((Class106_Sub1) class106_sub1).aClass250_10093);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3449(1.0F, 0.0F, 0.0F, fs);
								((Class106_Sub1) class106_sub1).aClass250_10094.method3449(0.0F, 1.0F, 0.0F, fs_29_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ - fs[0] - fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ - fs[1] - fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ - fs[2] - fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ - fs[0] + fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ - fs[1] + fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ - fs[2] + fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + fs[0] + fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + fs[1] + fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + fs[2] + fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + fs[0] - fs_29_[0]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + fs[1] - fs_29_[1]);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + fs[2] - fs_29_[2]);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
							} else {
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + f_20_ * (float) -i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + f_21_ * (float) -i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + f_22_ * (float) -i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + f_26_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + f_27_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + f_28_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + f_20_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + f_21_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + f_22_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(1.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(0.0F);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_72_ + f_23_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_73_ + f_24_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.method10298(f_74_ + f_25_ * (float) i_75_);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_68_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_69_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_70_, -1384395473);
								((Class153) this).aClass572_Sub15_Sub1_1711.writeByte(i_71_, -1384395473);
							}
						}
					}
				}
			}
		}
		if (((Class153) this).aClass572_Sub15_Sub1_1711.o * -1585139053 != 0) {
			((Class153) this).anInterface9_1712.method57(24, ((Class153) this).aClass572_Sub15_Sub1_1711.b, (((Class153) this).aClass572_Sub15_Sub1_1711.o * -1585139053));
			class106_sub1.method9416(((Class153) this).aClass142_1710, null, ((Class153) this).aClass142_1714, ((Class153) this).aClass142_1715);
			class106_sub1.method9417(7, 0, (((Class153) this).aClass572_Sub15_Sub1_1711.o) * -1585139053 / 24);
		}
	}

	void method2508(Class106_Sub1 class106_sub1) {
		aFloat1718 = ((Class106_Sub1) class106_sub1).aFloat10119;
		class106_sub1.method9396();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class106_sub1.method9432(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2509(Class106_Sub1 class106_sub1) {
		class106_sub1.method9432(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (((Class106_Sub1) class106_sub1).aFloat10119 != aFloat1718)
			class106_sub1.method1709(aFloat1718);
	}

	void method2510(Class106_Sub1 class106_sub1) {
		((Class153) this).anInterface9_1712 = class106_sub1.method9413(24, null, 196584, true);
		((Class153) this).aClass142_1715 = new Class142(((Class153) this).anInterface9_1712, 5126, 2, 0);
		((Class153) this).aClass142_1710 = new Class142(((Class153) this).anInterface9_1712, 5126, 3, 8);
		((Class153) this).aClass142_1714 = new Class142(((Class153) this).anInterface9_1712, 5121, 4, 20);
	}

	Class153() {
		((Class153) this).aClass572_Sub15_Sub1_1711 = new Class572_Sub15_Sub1(786336);
		((Class153) this).anInt1723 = 64;
		((Class153) this).anInt1717 = 768;
		((Class153) this).anInt1716 = 1600;
		((Class153) this).anInt1719 = Class522.method6220(1600, -1593955143);
		((Class153) this).anInt1720 = 64;
		((Class153) this).anIntArray1721 = new int[8191];
		((Class153) this).anIntArray1722 = new int[1600];
		((Class153) this).anIntArray1713 = new int[64];
		((Class153) this).aClass591_Sub2_Sub1ArrayArray1724 = new Class591_Sub2_Sub1[1600][64];
		((Class153) this).aClass591_Sub2_Sub1ArrayArray1727 = new Class591_Sub2_Sub1[64][768];
		((Class153) this).anInt1726 = 0;
	}
}
