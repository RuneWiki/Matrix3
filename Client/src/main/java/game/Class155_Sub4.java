package game;

/* Class155_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class155_Sub4 extends Class155 {
	int anInt9647;
	int anInt9648;

	Class155_Sub4(Class106_Sub1 class106_sub1, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		super(class106_sub1, i, Class171.aClass171_2068, Class88.aClass88_1218, i_2_ * i_3_, false);
		((Class155_Sub4) this).anInt9648 = i_2_;
		((Class155_Sub4) this).anInt9647 = i_3_;
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		Class104 class104 = ((Class155_Sub4) this).aClass106_Sub1_1743.method1683(152246412);
		if (class104 != null) {
			int i_4_ = class104.method1646() - (i_1_ + i_3_);
			int i_5_ = Class106_Sub1.method9445((((Class155_Sub4) this).aClass171_1746), (((Class155_Sub4) this).aClass88_1747));
			OpenGL.glCopyTexImage2D(((Class155_Sub4) this).anInt1744, 0, i_5_, i_0_, i_4_, i_2_, i_3_, 0);
		}
		method2517(true);
	}

	Class155_Sub4(Class106_Sub1 class106_sub1, int i, int i_6_, int i_7_, boolean bool, int[] is, int i_8_, int i_9_, boolean bool_10_) {
		super(class106_sub1, i, Class171.aClass171_2071, Class88.aClass88_1218, i_6_ * i_7_, bool);
		((Class155_Sub4) this).anInt9648 = i_6_;
		((Class155_Sub4) this).anInt9647 = i_7_;
		if (bool_10_) {
			int[] is_11_ = new int[is.length];
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
				int i_13_ = i_12_ * i_6_;
				int i_14_ = (i_7_ - i_12_ - 1) * i_6_;
				for (int i_15_ = 0; i_15_ < i_6_; i_15_++)
					is_11_[i_13_++] = is[i_14_++];
			}
			is = is_11_;
		}
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		if (((Class155_Sub4) this).anInt1744 == 34037 || !bool || i_8_ != 0 || i_9_ != 0) {
			OpenGL.glPixelStorei(3314, i_8_);
			OpenGL.glTexImage2Di(((Class155_Sub4) this).anInt1744, 0, (Class106_Sub1.method9445(((Class155_Sub4) this).aClass171_1746, ((Class155_Sub4) this).aClass88_1747)), ((Class155_Sub4) this).anInt9648, ((Class155_Sub4) this).anInt9647, 0, 32993, (((Class106_Sub1) ((Class155_Sub4) this).aClass106_Sub1_1743).anInt10178), is, i_9_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method2520(false);
		} else {
			method2524(((Class155_Sub4) this).anInt1744, Class106_Sub1.method9445((((Class155_Sub4) this).aClass171_1746), (((Class155_Sub4) this).aClass88_1747)), ((Class155_Sub4) this).anInt9648, ((Class155_Sub4) this).anInt9647, 32993, ((Class106_Sub1) ((Class155_Sub4) this).aClass106_Sub1_1743).anInt10178, is);
			method2520(true);
		}
		method2517(true);
	}

	Class155_Sub4(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_16_, int i_17_, boolean bool, float[] fs, Class171 class171_18_) {
		super(class106_sub1, i, class171, class88, i_16_ * i_17_, bool);
		((Class155_Sub4) this).anInt9648 = i_16_;
		((Class155_Sub4) this).anInt9647 = i_17_;
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		if (bool && ((Class155_Sub4) this).anInt1744 != 34037) {
			method2526(i, Class106_Sub1.method9445((((Class155_Sub4) this).aClass171_1746), (((Class155_Sub4) this).aClass88_1747)), i_16_, i_17_, class171_18_, fs);
			method2520(true);
		} else {
			OpenGL.glTexImage2Df(((Class155_Sub4) this).anInt1744, 0, (Class106_Sub1.method9445(((Class155_Sub4) this).aClass171_1746, ((Class155_Sub4) this).aClass88_1747)), ((Class155_Sub4) this).anInt9648, ((Class155_Sub4) this).anInt9647, 0, Class106_Sub1.method9444(class171_18_), 5126, fs, 0);
			method2520(false);
		}
		method2517(true);
	}

	void method9195(boolean bool, boolean bool_19_) {
		if (((Class155_Sub4) this).anInt1744 == 3553) {
			((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glTexParameteri(((Class155_Sub4) this).anInt1744, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class155_Sub4) this).anInt1744, 10243, bool_19_ ? 10497 : 33071);
		}
	}

	void method9196(int i, int i_20_, int i_21_, int i_22_, byte[] is, Class171 class171, int i_23_, int i_24_, boolean bool) {
		if (i_24_ == 0)
			i_24_ = i_21_;
		if (bool) {
			int i_25_ = class171.anInt2074 * 1572594303;
			int i_26_ = i_25_ * i_21_;
			int i_27_ = i_25_ * i_24_;
			byte[] is_28_ = new byte[i_26_ * i_22_];
			for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
				int i_30_ = i_29_ * i_26_;
				int i_31_ = (i_22_ - i_29_ - 1) * i_27_ + i_23_;
				for (int i_32_ = 0; i_32_ < i_26_; i_32_++)
					is_28_[i_30_++] = is[i_31_++];
			}
			is = is_28_;
		}
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_24_ != i_21_)
			OpenGL.glPixelStorei(3314, i_24_);
		OpenGL.glTexSubImage2Dub(((Class155_Sub4) this).anInt1744, 0, i, (((Class155_Sub4) this).anInt9647 - i_20_ - i_22_), i_21_, i_22_, Class106_Sub1.method9444(class171), 5121, is, i_23_);
		if (i_24_ != i_21_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method9197(int i, int i_33_, int i_34_, int i_35_, int[] is, int i_36_, int i_37_, boolean bool) {
		if (i_37_ == 0)
			i_37_ = i_34_;
		if (bool) {
			int[] is_38_ = new int[i_34_ * i_35_];
			for (int i_39_ = 0; i_39_ < i_35_; i_39_++) {
				int i_40_ = i_39_ * i_34_;
				int i_41_ = (i_35_ - i_39_ - 1) * i_37_ + i_36_;
				for (int i_42_ = 0; i_42_ < i_34_; i_42_++)
					is_38_[i_40_++] = is[i_41_++];
			}
			is = is_38_;
		}
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		if (i_34_ != i_37_)
			OpenGL.glPixelStorei(3314, i_37_);
		OpenGL.glTexSubImage2Di(((Class155_Sub4) this).anInt1744, 0, i, (((Class155_Sub4) this).anInt9647 - i_33_ - i_35_), i_34_, i_35_, 32993, (((Class106_Sub1) ((Class155_Sub4) this).aClass106_Sub1_1743).anInt10178), is, i_36_);
		if (i_34_ != i_37_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method9198(int i, int i_43_, int i_44_, int i_45_, int[] is, int[] is_46_, int i_47_) {
		int[] is_48_ = (is_46_ == null ? new int[(((Class155_Sub4) this).anInt9648 * ((Class155_Sub4) this).anInt9647)] : is_46_);
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glGetTexImagei(((Class155_Sub4) this).anInt1744, 0, 32993, 5121, is_48_, 0);
		for (int i_49_ = 0; i_49_ < i_45_; i_49_++)
			System.arraycopy(is_48_, ((i_43_ + (i_45_ - 1) - i_49_) * ((Class155_Sub4) this).anInt9648), is, i_47_ + i_49_ * i_44_, i_44_);
	}

	void method9199(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		Class104 class104 = ((Class155_Sub4) this).aClass106_Sub1_1743.method1683(355918719);
		if (class104 != null) {
			int i_55_ = class104.method1646() - (i_54_ + i_52_);
			((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glCopyTexSubImage2D(((Class155_Sub4) this).anInt1744, 0, i, (((Class155_Sub4) this).anInt9647 - (i_50_ + i_52_)), i_53_, i_55_, i_51_, i_52_);
			OpenGL.glFlush();
		}
	}

	Interface11 method9200(int i) {
		return new Class170(this, i);
	}

	Interface6 method9201(int i) {
		return new Class170(this, i);
	}

	Class155_Sub4(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_56_, int i_57_, boolean bool, byte[] is, Class171 class171_58_, boolean bool_59_) {
		super(class106_sub1, i, class171, class88, i_56_ * i_57_, bool);
		((Class155_Sub4) this).anInt9648 = i_56_;
		((Class155_Sub4) this).anInt9647 = i_57_;
		if (bool_59_) {
			byte[] is_60_ = new byte[is.length];
			for (int i_61_ = 0; i_61_ < i_57_; i_61_++) {
				int i_62_ = i_61_ * i_56_;
				int i_63_ = (i_57_ - i_61_ - 1) * i_56_;
				for (int i_64_ = 0; i_64_ < i_56_; i_64_++)
					is_60_[i_62_++] = is[i_63_++];
			}
			is = is_60_;
		}
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && ((Class155_Sub4) this).anInt1744 != 34037) {
			method2528(i, Class106_Sub1.method9445((((Class155_Sub4) this).aClass171_1746), (((Class155_Sub4) this).aClass88_1747)), i_56_, i_57_, class171_58_, is);
			method2520(true);
		} else {
			OpenGL.glTexImage2Dub(((Class155_Sub4) this).anInt1744, 0, (Class106_Sub1.method9445(((Class155_Sub4) this).aClass171_1746, ((Class155_Sub4) this).aClass88_1747)), ((Class155_Sub4) this).anInt9648, ((Class155_Sub4) this).anInt9647, 0, Class106_Sub1.method9444(class171_58_), 5121, is, 0);
			method2520(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method2517(true);
	}

	Class155_Sub4(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_65_, int i_66_) {
		super(class106_sub1, i, class171, class88, i_65_ * i_66_, false);
		((Class155_Sub4) this).anInt9648 = i_65_;
		((Class155_Sub4) this).anInt9647 = i_66_;
		((Class155_Sub4) this).aClass106_Sub1_1743.method9422(this);
		OpenGL.glTexImage2Dub(((Class155_Sub4) this).anInt1744, 0, Class106_Sub1.method9445(((Class155_Sub4) this).aClass171_1746, ((Class155_Sub4) this).aClass88_1747), i_65_, i_66_, 0, Class106_Sub1.method9444(((Class155_Sub4) this).aClass171_1746), 5121, null, 0);
		method2517(true);
	}
}
