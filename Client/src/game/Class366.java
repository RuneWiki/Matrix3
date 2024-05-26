package game;

/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class366 {
	Interface44 anInterface44_4492;
	int[] anIntArray4493;
	int anInt4494;
	int anInt4495 = 64;
	Interface44 anInterface44_4496;
	int anInt4497 = 768;
	int anInt4498 = 1600;
	int anInt4499 = Class522.method6220(1600, 1911454036);
	int anInt4500 = 64;
	Class362 aClass362_4501;
	int[] anIntArray4502;
	int[] anIntArray4503;
	Class591_Sub2_Sub1[][] aClass591_Sub2_Sub1ArrayArray4504;
	Class591_Sub2_Sub1[][] aClass591_Sub2_Sub1ArrayArray4505;
	static float aFloat4506;
	Interface46 anInterface46_4507;

	void method4488() {
		((Class366) this).anInterface44_4496.method39();
	}

	void method4489(Class106_Sub3 class106_sub3) {
		((Class366) this).anInterface44_4496.method259(786336, 24);
	}

	void method4490(Class106_Sub3 class106_sub3, Class105 class105) {
		class106_sub3.method1763(false);
		aFloat4506 = class106_sub3.aFloat10458;
		float f = class106_sub3.aClass250_10392.aFloatArray2728[2];
		float f_0_ = class106_sub3.aClass250_10392.aFloatArray2728[6];
		float f_1_ = class106_sub3.aClass250_10392.aFloatArray2728[10];
		float f_2_ = class106_sub3.aClass250_10392.aFloatArray2728[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class591_Sub2 class591_sub2 = class105.aClass657_1385.aClass591_Sub2_8420;
		for (Class591_Sub2 class591_sub2_5_ = class591_sub2.aClass591_Sub2_9183; class591_sub2_5_ != class591_sub2; class591_sub2_5_ = class591_sub2_5_.aClass591_Sub2_9183) {
			Class591_Sub2_Sub1 class591_sub2_sub1 = (Class591_Sub2_Sub1) class591_sub2_5_;
			int i_6_ = (int) (f * (float) (class591_sub2_sub1.anInt10970 >> 12) + f_0_ * (float) (class591_sub2_sub1.anInt10973 >> 12) + f_1_ * (float) (class591_sub2_sub1.anInt10975 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			((Class366) this).anIntArray4493[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = (1 + Class522.method6220(i_7_, 1447616416) - ((Class366) this).anInt4499);
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		class106_sub3.method9693(((Class366) this).anInterface46_4507);
		Class342 class342 = ((Class106_Sub3) class106_sub3).aClass342_10509;
		class342.method4289(Class250.aClass250_2727);
		class342.aClass250_4354.method3444();
		class342.anInt4355 = -1;
		boolean bool = class106_sub3.anInt10448 > 0;
		if (bool) {
			class342.aClass209_4353.method3040(0.0F, 0.0F, 1.0F, -class106_sub3.aFloat10503);
			class342.aClass240_4357.method3268((float) (class106_sub3.anInt10500 >> 16 & 0xff) / 255.0F, (float) (class106_sub3.anInt10500 >> 8 & 0xff) / 255.0F, (float) (class106_sub3.anInt10500 >> 0 & 0xff) / 255.0F);
			class342.aClass209_4353.method3045(((Class106_Sub3) class106_sub3).aClass250_10394);
			class342.aClass209_4353.method3043(1.0F / (class106_sub3.aFloat10504 - (class106_sub3.aFloat10503)));
		} else {
			class342.aClass209_4353.method3040(0.0F, 0.0F, 0.0F, 0.0F);
			class342.aClass240_4357.method3268(0.0F, 0.0F, 0.0F);
		}
		method4494(class106_sub3, class591_sub2, i_7_, i_3_, i_8_, class342, bool);
		if (class106_sub3.aFloat10458 != aFloat4506)
			class106_sub3.method1709(aFloat4506);
		class106_sub3.method1763(true);
	}

	void method4491() {
		((Class366) this).anInterface44_4496.method39();
	}

	void method4492(int i, Class591_Sub2_Sub1 class591_sub2_sub1) {
		if (i < 1600) {
			if (((Class366) this).anIntArray4502[i] < 64)
				((Class366) this).aClass591_Sub2_Sub1ArrayArray4504[i][((Class366) this).anIntArray4502[i]++] = class591_sub2_sub1;
			else {
				if (((Class366) this).anIntArray4502[i] == 64) {
					if (((Class366) this).anInt4494 == 64)
						return;
					((Class366) this).anIntArray4502[i] += 1 + ((Class366) this).anInt4494++;
				}
				((Class366) this).aClass591_Sub2_Sub1ArrayArray4505[((Class366) this).anIntArray4502[i] - 64 - 1][((Class366) this).anIntArray4503[((Class366) this).anIntArray4502[i] - 64 - 1]++] = class591_sub2_sub1;
			}
		}
	}

	void method4493() {
		((Class366) this).anInterface44_4496.method39();
	}

	Class366(Class106_Sub3 class106_sub3) {
		((Class366) this).anIntArray4493 = new int[8191];
		((Class366) this).anIntArray4502 = new int[1600];
		((Class366) this).anIntArray4503 = new int[64];
		((Class366) this).aClass591_Sub2_Sub1ArrayArray4504 = new Class591_Sub2_Sub1[1600][64];
		((Class366) this).aClass591_Sub2_Sub1ArrayArray4505 = new Class591_Sub2_Sub1[64][768];
		((Class366) this).anInt4494 = 0;
		((Class366) this).aClass362_4501 = (class106_sub3.method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468, Class364.aClass364_4482 }),
			new Class354(Class364.aClass364_4464) }));
		((Class366) this).anInterface44_4496 = class106_sub3.method9723(true);
		((Class366) this).anInterface44_4492 = class106_sub3.method9723(false);
		((Class366) this).anInterface44_4492.method259(393168, 12);
		((Class366) this).anInterface46_4507 = class106_sub3.method9671(false);
		((Class366) this).anInterface46_4507.method265(49146);
		ByteBuffer bytebuffer = class106_sub3.aByteBuffer10378;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_9_ = i * 4;
			bytebuffer.putShort((short) i_9_);
			bytebuffer.putShort((short) (i_9_ + 1));
			bytebuffer.putShort((short) (i_9_ + 2));
			bytebuffer.putShort((short) (i_9_ + 2));
			bytebuffer.putShort((short) (i_9_ + 3));
			bytebuffer.putShort((short) i_9_);
		}
		((Class366) this).anInterface46_4507.method223(0, bytebuffer.position(), class106_sub3.aLong10444);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		((Class366) this).anInterface44_4492.method223(0, bytebuffer.position(), class106_sub3.aLong10444);
	}

	void method4494(Class106_Sub3 class106_sub3, Class591_Sub2 class591_sub2, int i, int i_10_, int i_11_, Class342 class342, boolean bool) {
		Class591_Sub2 class591_sub2_12_ = class591_sub2.aClass591_Sub2_9183;
		int i_13_ = 0;
		int i_14_ = -2;
		boolean bool_15_ = true;
		boolean bool_16_ = true;
		while (class591_sub2_12_ != class591_sub2) {
			((Class366) this).anInt4494 = 0;
			for (int i_17_ = 0; i_17_ < i; i_17_++)
				((Class366) this).anIntArray4502[i_17_] = 0;
			for (int i_18_ = 0; i_18_ < 64; i_18_++)
				((Class366) this).anIntArray4503[i_18_] = 0;
			for (/**/; class591_sub2_12_ != class591_sub2; class591_sub2_12_ = class591_sub2_12_.aClass591_Sub2_9183) {
				Class591_Sub2_Sub1 class591_sub2_sub1 = (Class591_Sub2_Sub1) class591_sub2_12_;
				if (bool_16_) {
					i_14_ = class591_sub2_sub1.anInt10972;
					bool_15_ = class591_sub2_sub1.aBool10979;
					bool_16_ = false;
				}
				if (i_13_ > 0 && (i_14_ != class591_sub2_sub1.anInt10972 || bool_15_ != class591_sub2_sub1.aBool10979)) {
					bool_16_ = true;
					break;
				}
				method4492((((Class366) this).anIntArray4493[i_13_++] - i_10_ >> i_11_), class591_sub2_sub1);
			}
			class342.anInterface43_4352 = null;
			if (i_14_ >= 0) {
				MaterialInformation class101 = class106_sub3.aClass94_1396.getTexture(i_14_, 1959009850);
				if (class101.textureId * 811137757 != -1)
					class342.anInterface43_4352 = ((Class106_Sub3) class106_sub3).aClass360_10487.method4444(class101);
				byte i_19_ = 0;
				if (class101.aClass511_1342 == Class511.aClass511_5696)
					i_19_ = class101.aByte1343;
				class106_sub3.method9662(i_19_);
			}
			if (bool_15_ && class106_sub3.aFloat10458 != aFloat4506)
				class106_sub3.method1709(aFloat4506);
			else if (class106_sub3.aFloat10458 != 1.0F)
				class106_sub3.method1709(1.0F);
			method4495(class106_sub3, i, bool);
		}
	}

	void method4495(Class106_Sub3 class106_sub3, int i, boolean bool) {
		int i_20_ = 0;
		Class250 class250 = class106_sub3.aClass250_10392;
		float f = class250.aFloatArray2728[0];
		float f_21_ = class250.aFloatArray2728[4];
		float f_22_ = class250.aFloatArray2728[8];
		float f_23_ = class250.aFloatArray2728[1];
		float f_24_ = class250.aFloatArray2728[5];
		float f_25_ = class250.aFloatArray2728[9];
		float f_26_ = f + f_23_;
		float f_27_ = f_21_ + f_24_;
		float f_28_ = f_22_ + f_25_;
		float f_29_ = f - f_23_;
		float f_30_ = f_21_ - f_24_;
		float f_31_ = f_22_ - f_25_;
		float f_32_ = f_23_ - f;
		float f_33_ = f_24_ - f_21_;
		float f_34_ = f_25_ - f_22_;
		float[] fs = new float[3];
		float[] fs_35_ = new float[3];
		class106_sub3.aClass250_10399.method3486(((Class106_Sub3) class106_sub3).aClass250_10393);
		ByteBuffer bytebuffer = class106_sub3.aByteBuffer10378;
		bytebuffer.clear();
		for (int i_36_ = i - 1; i_36_ >= 0; i_36_--) {
			int i_37_ = (((Class366) this).anIntArray4502[i_36_] > 64 ? 64 : ((Class366) this).anIntArray4502[i_36_]);
			if (i_37_ > 0) {
				for (int i_38_ = i_37_ - 1; i_38_ >= 0; i_38_--) {
					Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class366) this).aClass591_Sub2_Sub1ArrayArray4504[i_36_][i_38_]);
					int i_39_ = class591_sub2_sub1.anInt10974;
					byte i_40_ = (byte) (i_39_ >> 16);
					byte i_41_ = (byte) (i_39_ >> 8);
					byte i_42_ = (byte) i_39_;
					byte i_43_ = (byte) (i_39_ >>> 24);
					if (((Class106_Sub3) class106_sub3).anInt10477 == 0) {
						byte i_44_ = i_40_;
						i_40_ = i_42_;
						i_42_ = i_44_;
					}
					float f_45_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
					float f_46_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
					float f_47_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
					int i_48_ = class591_sub2_sub1.anInt10976 >> 12;
					if (class591_sub2_sub1.aShort10978 != 0) {
						((Class106_Sub3) class106_sub3).aClass250_10400.method3472(class591_sub2_sub1.aShort10978, i_48_, i_48_, 0.0F, 0.0F, 0.0F);
						((Class106_Sub3) class106_sub3).aClass250_10400.method3445(class106_sub3.aClass250_10399);
						((Class106_Sub3) class106_sub3).aClass250_10400.method3449(1.0F, 0.0F, 0.0F, fs);
						((Class106_Sub3) class106_sub3).aClass250_10400.method3449(0.0F, 1.0F, 0.0F, fs_35_);
						bytebuffer.putFloat(f_45_ - fs[0] - fs_35_[0]);
						bytebuffer.putFloat(f_46_ - fs[1] - fs_35_[1]);
						bytebuffer.putFloat(f_47_ - fs[2] - fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_45_ - fs[0] + fs_35_[0]);
						bytebuffer.putFloat(f_46_ - fs[1] + fs_35_[1]);
						bytebuffer.putFloat(f_47_ - fs[2] + fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + fs[0] + fs_35_[0]);
						bytebuffer.putFloat(f_46_ + fs[1] + fs_35_[1]);
						bytebuffer.putFloat(f_47_ + fs[2] + fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + fs[0] - fs_35_[0]);
						bytebuffer.putFloat(f_46_ + fs[1] - fs_35_[1]);
						bytebuffer.putFloat(f_47_ + fs[2] - fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_45_ + f_26_ * (float) -i_48_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) -i_48_);
						bytebuffer.putFloat(f_47_ + f_28_ * (float) -i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_45_ + f_32_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_33_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_34_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + f_26_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_28_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + f_29_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_30_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_31_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_20_++;
				}
				if (((Class366) this).anIntArray4502[i_36_] > 64) {
					int i_49_ = ((Class366) this).anIntArray4502[i_36_] - 64 - 1;
					for (int i_50_ = ((Class366) this).anIntArray4503[i_49_] - 1; i_50_ >= 0; i_50_--) {
						Class591_Sub2_Sub1 class591_sub2_sub1 = (((Class366) this).aClass591_Sub2_Sub1ArrayArray4505[i_49_][i_50_]);
						int i_51_ = class591_sub2_sub1.anInt10974;
						byte i_52_ = (byte) (i_51_ >> 16);
						byte i_53_ = (byte) (i_51_ >> 8);
						byte i_54_ = (byte) i_51_;
						byte i_55_ = (byte) (i_51_ >>> 24);
						float f_56_ = (float) (class591_sub2_sub1.anInt10970 >> 12);
						float f_57_ = (float) (class591_sub2_sub1.anInt10973 >> 12);
						float f_58_ = (float) (class591_sub2_sub1.anInt10975 >> 12);
						int i_59_ = class591_sub2_sub1.anInt10976 >> 12;
						if (((Class106_Sub3) class106_sub3).anInt10477 == 0) {
							byte i_60_ = i_52_;
							i_52_ = i_54_;
							i_54_ = i_60_;
						}
						if (class591_sub2_sub1.aShort10978 != 0) {
							((Class106_Sub3) class106_sub3).aClass250_10400.method3472(class591_sub2_sub1.aShort10978, i_59_, i_59_, 0.0F, 0.0F, 0.0F);
							((Class106_Sub3) class106_sub3).aClass250_10400.method3445(class106_sub3.aClass250_10399);
							((Class106_Sub3) class106_sub3).aClass250_10400.method3449(1.0F, 0.0F, 0.0F, fs);
							((Class106_Sub3) class106_sub3).aClass250_10400.method3449(0.0F, 1.0F, 0.0F, fs_35_);
							bytebuffer.putFloat(f_56_ - fs[0] - fs_35_[0]);
							bytebuffer.putFloat(f_57_ - fs[1] - fs_35_[1]);
							bytebuffer.putFloat(f_58_ - fs[2] - fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_56_ - fs[0] + fs_35_[0]);
							bytebuffer.putFloat(f_57_ - fs[1] + fs_35_[1]);
							bytebuffer.putFloat(f_58_ - fs[2] + fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + fs[0] + fs_35_[0]);
							bytebuffer.putFloat(f_57_ + fs[1] + fs_35_[1]);
							bytebuffer.putFloat(f_58_ + fs[2] + fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + fs[0] - fs_35_[0]);
							bytebuffer.putFloat(f_57_ + fs[1] - fs_35_[1]);
							bytebuffer.putFloat(f_58_ + fs[2] - fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_56_ + f_26_ * (float) -i_59_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) -i_59_);
							bytebuffer.putFloat(f_58_ + f_28_ * (float) -i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_56_ + f_32_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_33_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_34_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + f_26_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_28_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + f_29_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_30_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_31_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_20_++;
					}
				}
			}
		}
		((Class366) this).anInterface44_4496.method223(0, bytebuffer.position(), class106_sub3.aLong10444);
		class106_sub3.method9674(0, ((Class366) this).anInterface44_4496);
		class106_sub3.method9674(1, ((Class366) this).anInterface44_4492);
		class106_sub3.method9673(((Class366) this).aClass362_4501);
		Class342 class342 = ((Class106_Sub3) class106_sub3).aClass342_10509;
		class342.method4290(i_20_, bool);
	}
}
