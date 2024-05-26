package game;

/* Class102_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class102_Sub6 extends Class102 {
	Class141 aClass141_10867;
	Class155_Sub4_Sub1 aClass155_Sub4_Sub1_10868;
	Class106_Sub1 aClass106_Sub1_10869;
	boolean aBool10870;

	void method1609(char c, int i, int i_0_, int i_1_, boolean bool) {
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}

	void method1623(char c, int i, int i_2_, int i_3_, boolean bool, Class167 class167, int i_4_, int i_5_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(class155_sub4_sub1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_6_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_4_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_6_, 0.0F, (float) -i_5_ * f_6_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, (byte) (i_3_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_2_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(8448, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(null);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(0);
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}

	void method1621(char c, int i, int i_7_, int i_8_, boolean bool, Class167 class167, int i_9_, int i_10_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(class155_sub4_sub1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_11_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_9_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_11_, 0.0F, (float) -i_10_ * f_11_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_, (byte) (i_8_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_7_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(8448, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(null);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(0);
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}

	void method1622(char c, int i, int i_12_, int i_13_, boolean bool) {
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8), (byte) i_13_, (byte) (i_13_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_12_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}

	Class102_Sub6(Class106_Sub1 class106_sub1, Class284 class284, Class87[] class87s, boolean bool) {
		super(class106_sub1, class284);
		((Class102_Sub6) this).aClass106_Sub1_10869 = class106_sub1;
		int i = 0;
		for (int i_14_ = 0; i_14_ < 256; i_14_++) {
			Class87 class87 = class87s[i_14_];
			if (class87.method1330() > i)
				i = class87.method1330();
			if (class87.method1329() > i)
				i = class87.method1329();
		}
		int i_15_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_15_ * i_15_];
			for (int i_16_ = 0; i_16_ < 256; i_16_++) {
				Class87 class87 = class87s[i_16_];
				int i_17_ = class87.method1330();
				int i_18_ = class87.method1329();
				int i_19_ = i_16_ % 16 * i;
				int i_20_ = i_16_ / 16 * i;
				int i_21_ = i_20_ * i_15_ + i_19_;
				int i_22_ = 0;
				if (class87.method1282()) {
					Class87_Sub1 class87_sub1 = (Class87_Sub1) class87s[i_16_];
					if (!class87_sub1.method1322()) {
						byte[] is_23_ = class87_sub1.aByteArray9969;
						for (int i_24_ = 0; i_24_ < i_17_; i_24_++) {
							for (int i_25_ = 0; i_25_ < i_18_; i_25_++)
								is[i_21_++] = (byte) (is_23_[i_22_++] == 0 ? 0 : -1);
							i_21_ += i_15_ - i_18_;
						}
					} else {
						byte[] is_26_ = class87_sub1.aByteArray9972;
						for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
							for (int i_28_ = 0; i_28_ < i_18_; i_28_++)
								is[i_21_++] = is_26_[i_22_++];
							i_21_ += i_15_ - i_18_;
						}
					}
				} else {
					Class87_Sub2 class87_sub2 = (Class87_Sub2) class87s[i_16_];
					int[] is_29_ = class87_sub2.method1285(false);
					if (!class87_sub2.method1322()) {
						for (int i_30_ = 0; i_30_ < i_17_; i_30_++) {
							for (int i_31_ = 0; i_31_ < i_18_; i_31_++) {
								int i_32_ = is_29_[i_22_++];
								byte i_33_ = (byte) (((i_32_ >> 16 & 0xff) * 3 + (i_32_ >> 8 & 0xff) * 4 + (i_32_ & 0xff)) >> 3);
								is[i_21_++] = i_33_;
							}
							i_21_ += i_15_ - i_18_;
						}
					} else {
						for (int i_34_ = 0; i_34_ < i_17_; i_34_++) {
							for (int i_35_ = 0; i_35_ < i_18_; i_35_++)
								is[i_21_++] = (byte) (is_29_[i_22_++] >> 24 & 0xff);
							i_21_ += i_15_ - i_18_;
						}
					}
				}
			}
			((Class102_Sub6) this).aClass155_Sub4_Sub1_10868 = Class155_Sub4_Sub1.method10178(class106_sub1, Class171.aClass171_2073, Class88.aClass88_1218, i_15_, i_15_, false, is, Class171.aClass171_2073);
			((Class102_Sub6) this).aBool10870 = true;
		} else {
			int[] is = new int[i_15_ * i_15_];
			for (int i_36_ = 0; i_36_ < 256; i_36_++) {
				Class87 class87 = class87s[i_36_];
				int i_37_ = class87.method1330();
				int i_38_ = class87.method1329();
				int i_39_ = i_36_ % 16 * i;
				int i_40_ = i_36_ / 16 * i;
				int i_41_ = i_40_ * i_15_ + i_39_;
				int i_42_ = 0;
				if (class87.method1282()) {
					Class87_Sub1 class87_sub1 = (Class87_Sub1) class87s[i_36_];
					int[] is_43_ = class87_sub1.anIntArray9967;
					byte[] is_44_ = class87_sub1.aByteArray9972;
					byte[] is_45_ = class87_sub1.aByteArray9969;
					if (is_44_ != null) {
						for (int i_46_ = 0; i_46_ < i_37_; i_46_++) {
							for (int i_47_ = 0; i_47_ < i_38_; i_47_++) {
								is[i_41_++] = (is_44_[i_42_] << 24 | is_43_[is_45_[i_42_] & 0xff]);
								i_42_++;
							}
							i_41_ += i_15_ - i_38_;
						}
					} else {
						for (int i_48_ = 0; i_48_ < i_37_; i_48_++) {
							for (int i_49_ = 0; i_49_ < i_38_; i_49_++) {
								int i_50_;
								if ((i_50_ = is_45_[i_42_++]) != 0)
									is[i_41_++] = ~0xffffff | is_43_[i_50_ & 0xff];
								else
									i_41_++;
							}
							i_41_ += i_15_ - i_38_;
						}
					}
				} else {
					Class87_Sub2 class87_sub2 = (Class87_Sub2) class87s[i_36_];
					int[] is_51_ = class87_sub2.method1285(false);
					if (!class87_sub2.method1322()) {
						for (int i_52_ = 0; i_52_ < i_37_; i_52_++) {
							for (int i_53_ = 0; i_53_ < i_38_; i_53_++) {
								int i_54_ = is_51_[i_42_] & 0xffffff;
								is[i_41_++] = (i_54_ == 0 ? 0 : 255) << 24 | i_54_;
								i_42_++;
							}
							i_41_ += i_15_ - i_38_;
						}
					} else {
						for (int i_55_ = 0; i_55_ < i_37_; i_55_++) {
							for (int i_56_ = 0; i_56_ < i_38_; i_56_++)
								is[i_41_++] = is_51_[i_42_++];
							i_41_ += i_15_ - i_38_;
						}
					}
				}
			}
			((Class102_Sub6) this).aClass155_Sub4_Sub1_10868 = Class155_Sub4_Sub1.method10177(class106_sub1, i_15_, i_15_, false, is, 0, 0);
			((Class102_Sub6) this).aBool10870 = false;
		}
		((Class102_Sub6) this).aClass155_Sub4_Sub1_10868.method2517(false);
		((Class102_Sub6) this).aClass141_10867 = new Class141(class106_sub1, 256);
		float f = (((Class155_Sub4_Sub1) ((Class102_Sub6) this).aClass155_Sub4_Sub1_10868).aFloat11234 / (float) (((Class155_Sub4_Sub1) ((Class102_Sub6) this).aClass155_Sub4_Sub1_10868).anInt11236));
		float f_57_ = (((Class155_Sub4_Sub1) ((Class102_Sub6) this).aClass155_Sub4_Sub1_10868).aFloat11231 / (float) (((Class155_Sub4_Sub1) ((Class102_Sub6) this).aClass155_Sub4_Sub1_10868).anInt11232));
		for (int i_58_ = 0; i_58_ < 256; i_58_++) {
			Class87 class87 = class87s[i_58_];
			int i_59_ = class87.method1330();
			int i_60_ = class87.method1329();
			int i_61_ = class87.method1288();
			int i_62_ = class87.method1286();
			float f_63_ = (float) (i_58_ % 16 * i);
			float f_64_ = (float) (i_58_ / 16 * i);
			float f_65_ = f_63_ * f;
			float f_66_ = f_64_ * f_57_;
			float f_67_ = (f_63_ + (float) i_60_) * f;
			float f_68_ = (f_64_ + (float) i_59_) * f_57_;
			((Class102_Sub6) this).aClass141_10867.method2448(i_58_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_65_, (((Class155_Sub4_Sub1) (((Class102_Sub6) this).aClass155_Sub4_Sub1_10868)).aFloat11231) - f_66_);
			OpenGL.glVertex2i(i_62_, i_61_);
			OpenGL.glTexCoord2f(f_65_, (((Class155_Sub4_Sub1) (((Class102_Sub6) this).aClass155_Sub4_Sub1_10868)).aFloat11231) - f_68_);
			OpenGL.glVertex2i(i_62_, i_61_ + i_59_);
			OpenGL.glTexCoord2f(f_67_, (((Class155_Sub4_Sub1) (((Class102_Sub6) this).aClass155_Sub4_Sub1_10868)).aFloat11231) - f_68_);
			OpenGL.glVertex2i(i_62_ + i_60_, i_61_ + i_59_);
			OpenGL.glTexCoord2f(f_67_, (((Class155_Sub4_Sub1) (((Class102_Sub6) this).aClass155_Sub4_Sub1_10868)).aFloat11231) - f_66_);
			OpenGL.glVertex2i(i_62_ + i_60_, i_61_);
			OpenGL.glEnd();
			((Class102_Sub6) this).aClass141_10867.method2447();
		}
	}

	void method1624(char c, int i, int i_69_, int i_70_, boolean bool, Class167 class167, int i_71_, int i_72_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(class155_sub4_sub1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_73_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_71_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_73_, 0.0F, (float) -i_72_ * f_73_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_70_ >> 16), (byte) (i_70_ >> 8), (byte) i_70_, (byte) (i_70_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_69_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(8448, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(null);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(0);
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}

	void method1625(char c, int i, int i_74_, int i_75_, boolean bool, Class167 class167, int i_76_, int i_77_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class102_Sub6) this).aClass106_Sub1_10869.method9390();
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(((Class102_Sub6) this).aClass155_Sub4_Sub1_10868);
		if (((Class102_Sub6) this).aBool10870 || bool) {
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		} else
			((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 7681);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(class155_sub4_sub1);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(7681, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_78_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_76_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_78_, 0.0F, (float) -i_77_ * f_78_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_75_ >> 16), (byte) (i_75_ >> 8), (byte) i_75_, (byte) (i_75_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_74_, 0.0F);
		((Class102_Sub6) this).aClass141_10867.method2449(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9434(8448, 8448);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9422(null);
		((Class102_Sub6) this).aClass106_Sub1_10869.method9421(0);
		if (((Class102_Sub6) this).aBool10870 || bool)
			((Class102_Sub6) this).aClass106_Sub1_10869.method9423(0, 5890, 768);
	}
}
