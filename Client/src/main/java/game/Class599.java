package game;

/* Class599 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class599 implements Interface34 {
	int anInt7852;
	Class88 aClass88_7853;
	static final int anInt7854 = 34067;
	boolean aBool7855;
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_7856;
	int anInt7857;
	int anInt7858;
	Class171 aClass171_7859;
	static final int anInt7860 = 32879;
	static final int anInt7861 = 3553;
	Class367 aClass367_7862 = Class367.aClass367_4508;
	static final int anInt7863 = 0;
	static int[] anIntArray7864 = new int[1];

	boolean method234() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = method7055();
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glEnable(((Class599) this).anInt7858);
		OpenGL.glGenerateMipmapEXT(((Class599) this).anInt7858);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glDisable(((Class599) this).anInt7858);
		((Class599) this).aBool7855 = true;
		method7049();
		method7051(i);
		return true;
	}

	public void method202() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = ((Class599) this).aClass106_Sub3_Sub2_7856.method9640();
		int i_0_ = (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i]);
		if (i_0_ != ((Class599) this).anInt7858) {
			if (i_0_ != 0) {
				OpenGL.glBindTexture(i_0_, 0);
				OpenGL.glDisable(i_0_);
			}
			OpenGL.glEnable(((Class599) this).anInt7858);
			((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i] = ((Class599) this).anInt7858;
		}
		OpenGL.glBindTexture(((Class599) this).anInt7858, ((Class599) this).anInt7857);
	}

	void method7048() throws Throwable {
		method7052();
		super.finalize();
	}

	void method7049() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class599) this).aClass367_7862 == Class367.aClass367_4508) {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9728);
		}
	}

	boolean method237() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = method7055();
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glEnable(((Class599) this).anInt7858);
		OpenGL.glGenerateMipmapEXT(((Class599) this).anInt7858);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glDisable(((Class599) this).anInt7858);
		((Class599) this).aBool7855 = true;
		method7049();
		method7051(i);
		return true;
	}

	public void method207(Class367 class367) {
		if (((Class599) this).aClass367_7862 != class367) {
			((Class599) this).aClass367_7862 = class367;
			method7049();
		}
	}

	void method7050(int i, int i_1_, int i_2_, float[] fs) {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		if (i_1_ > 0 && !Class521.method6219(i_1_, (byte) 58))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class521.method6219(i_2_, (byte) 104))
			throw new IllegalArgumentException("");
		int i_3_ = ((Class599) this).aClass171_7859.anInt2074 * 1572594303;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		float[] fs_8_ = fs;
		float[] fs_9_ = new float[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_4_, Class106_Sub3_Sub2.method10118((((Class599) this).aClass171_7859), (((Class599) this).aClass88_7853)), i_1_, i_2_, 0, Class106_Sub3_Sub2.method10117(((Class599) this).aClass171_7859), 5126, fs_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						float f = fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						fs_9_[i_12_] = f * 0.25F;
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			float[] fs_17_ = fs_9_;
			fs_9_ = fs_8_;
			fs_8_ = fs_17_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	void method7051(int i) {
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 -= i;
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 += method7055();
	}

	void method7052() {
		if (((Class599) this).anInt7857 != 0) {
			((Class599) this).aClass106_Sub3_Sub2_7856.method10127(((Class599) this).anInt7857, method7055());
			((Class599) this).anInt7857 = 0;
		}
	}

	void method7053(int i, int i_18_, int i_19_, int[] is) {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		if (i_18_ > 0 && !Class521.method6219(i_18_, (byte) 7))
			throw new IllegalArgumentException("");
		if (i_19_ > 0 && !Class521.method6219(i_19_, (byte) 97))
			throw new IllegalArgumentException("");
		if (((Class599) this).aClass171_7859 != Class171.aClass171_2071)
			throw new IllegalArgumentException("");
		int i_20_ = 0;
		int i_21_ = i_18_ < i_19_ ? i_18_ : i_19_;
		int i_22_ = i_18_ >> 1;
		int i_23_ = i_19_ >> 1;
		int[] is_24_ = is;
		int[] is_25_ = new int[i_22_ * i_23_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_20_, (Class106_Sub3_Sub2.method10118(((Class599) this).aClass171_7859, ((Class599) this).aClass88_7853)), i_18_, i_19_, 0, 32993, (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anInt11105), is_24_, 0);
			if (i_21_ <= 1)
				break;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = i_27_ + i_18_;
			for (int i_29_ = 0; i_29_ < i_23_; i_29_++) {
				for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
					int i_31_ = is_24_[i_27_++];
					int i_32_ = is_24_[i_27_++];
					int i_33_ = is_24_[i_28_++];
					int i_34_ = is_24_[i_28_++];
					int i_35_ = i_31_ >> 24 & 0xff;
					int i_36_ = i_31_ >> 16 & 0xff;
					int i_37_ = i_31_ >> 8 & 0xff;
					int i_38_ = i_31_ & 0xff;
					i_35_ += i_32_ >> 24 & 0xff;
					i_36_ += i_32_ >> 16 & 0xff;
					i_37_ += i_32_ >> 8 & 0xff;
					i_38_ += i_32_ & 0xff;
					i_35_ += i_33_ >> 24 & 0xff;
					i_36_ += i_33_ >> 16 & 0xff;
					i_37_ += i_33_ >> 8 & 0xff;
					i_38_ += i_33_ & 0xff;
					i_35_ += i_34_ >> 24 & 0xff;
					i_36_ += i_34_ >> 16 & 0xff;
					i_37_ += i_34_ >> 8 & 0xff;
					i_38_ += i_34_ & 0xff;
					is_25_[i_26_++] = ((i_35_ & 0x3fc) << 22 | (i_36_ & 0x3fc) << 14 | (i_37_ & 0x3fc) << 6 | (i_38_ & 0x3fc) >> 2);
				}
				i_27_ += i_18_;
				i_28_ += i_18_;
			}
			int[] is_39_ = is_25_;
			is_25_ = is_24_;
			is_24_ = is_39_;
			i_18_ = i_22_;
			i_19_ = i_23_;
			i_22_ >>= 1;
			i_23_ >>= 1;
			i_21_ >>= 1;
			i_20_++;
		}
	}

	Class599(Class106_Sub3_Sub2 class106_sub3_sub2, int i, Class171 class171, Class88 class88, int i_40_, boolean bool) {
		((Class599) this).aClass106_Sub3_Sub2_7856 = class106_sub3_sub2;
		((Class599) this).anInt7858 = i;
		((Class599) this).aClass171_7859 = class171;
		((Class599) this).aClass88_7853 = class88;
		((Class599) this).aBool7855 = bool;
		((Class599) this).anInt7852 = i_40_;
		OpenGL.glGenTextures(1, anIntArray7864, 0);
		((Class599) this).anInt7857 = anIntArray7864[0];
		method7049();
		method7051(0);
	}

	public void method203(Class367 class367) {
		if (((Class599) this).aClass367_7862 != class367) {
			((Class599) this).aClass367_7862 = class367;
			method7049();
		}
	}

	public void finalize() throws Throwable {
		method7052();
		super.finalize();
	}

	public void method39() {
		if (((Class599) this).anInt7857 != 0) {
			((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 -= method7055();
			int[] is = new int[1];
			is[0] = ((Class599) this).anInt7857;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class599) this).anInt7857 = 0;
		}
	}

	void method7054(int i) {
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 -= i;
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 += method7055();
	}

	boolean method238() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = method7055();
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glEnable(((Class599) this).anInt7858);
		OpenGL.glGenerateMipmapEXT(((Class599) this).anInt7858);
		if (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).aBool11094)
			OpenGL.glDisable(((Class599) this).anInt7858);
		((Class599) this).aBool7855 = true;
		method7049();
		method7051(i);
		return true;
	}

	int method7055() {
		int i = (((Class599) this).aClass171_7859.anInt2074 * 1572594303 * (((Class599) this).aClass88_7853.anInt1223 * -1071269501) * ((Class599) this).anInt7852);
		return ((Class599) this).aBool7855 ? i * 4 / 3 : i;
	}

	public void method205() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = ((Class599) this).aClass106_Sub3_Sub2_7856.method9640();
		int i_41_ = (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i]);
		if (i_41_ != ((Class599) this).anInt7858) {
			if (i_41_ != 0) {
				OpenGL.glBindTexture(i_41_, 0);
				OpenGL.glDisable(i_41_);
			}
			OpenGL.glEnable(((Class599) this).anInt7858);
			((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i] = ((Class599) this).anInt7858;
		}
		OpenGL.glBindTexture(((Class599) this).anInt7858, ((Class599) this).anInt7857);
	}

	public void method206() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = ((Class599) this).aClass106_Sub3_Sub2_7856.method9640();
		int i_42_ = (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i]);
		if (i_42_ != ((Class599) this).anInt7858) {
			if (i_42_ != 0) {
				OpenGL.glBindTexture(i_42_, 0);
				OpenGL.glDisable(i_42_);
			}
			OpenGL.glEnable(((Class599) this).anInt7858);
			((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i] = ((Class599) this).anInt7858;
		}
		OpenGL.glBindTexture(((Class599) this).anInt7858, ((Class599) this).anInt7857);
	}

	public void method201(Class367 class367) {
		if (((Class599) this).aClass367_7862 != class367) {
			((Class599) this).aClass367_7862 = class367;
			method7049();
		}
	}

	void method7056(int i, int i_43_, int i_44_, byte[] is) {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		if (i_43_ > 0 && !Class521.method6219(i_43_, (byte) 28))
			throw new IllegalArgumentException("");
		if (i_44_ > 0 && !Class521.method6219(i_44_, (byte) 9))
			throw new IllegalArgumentException("");
		int i_45_ = ((Class599) this).aClass171_7859.anInt2074 * 1572594303;
		int i_46_ = 0;
		int i_47_ = i_43_ < i_44_ ? i_43_ : i_44_;
		int i_48_ = i_43_ >> 1;
		int i_49_ = i_44_ >> 1;
		byte[] is_50_ = is;
		byte[] is_51_ = new byte[i_48_ * i_49_ * i_45_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_46_, Class106_Sub3_Sub2.method10118((((Class599) this).aClass171_7859), (((Class599) this).aClass88_7853)), i_43_, i_44_, 0, Class106_Sub3_Sub2.method10117(((Class599) this).aClass171_7859), 5121, is_50_, 0);
			if (i_47_ <= 1)
				break;
			int i_52_ = i_43_ * i_45_;
			for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
				int i_54_ = i_53_;
				int i_55_ = i_53_;
				int i_56_ = i_55_ + i_52_;
				for (int i_57_ = 0; i_57_ < i_49_; i_57_++) {
					for (int i_58_ = 0; i_58_ < i_48_; i_58_++) {
						int i_59_ = is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						is_51_[i_54_] = (byte) (i_59_ >> 2);
						i_54_ += i_45_;
					}
					i_55_ += i_52_;
					i_56_ += i_52_;
				}
			}
			byte[] is_60_ = is_51_;
			is_51_ = is_50_;
			is_50_ = is_60_;
			i_43_ = i_48_;
			i_44_ = i_49_;
			i_48_ >>= 1;
			i_49_ >>= 1;
			i_47_ >>= 1;
			i_46_++;
		}
	}

	void method7057() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class599) this).aClass367_7862 == Class367.aClass367_4508) {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9728);
		}
	}

	void method7058() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		((Class599) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (((Class599) this).aClass367_7862 == Class367.aClass367_4508) {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10241, ((Class599) this).aBool7855 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class599) this).anInt7858, 10240, 9728);
		}
	}

	public void method38() {
		if (((Class599) this).anInt7857 != 0) {
			((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 -= method7055();
			int[] is = new int[1];
			is[0] = ((Class599) this).anInt7857;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class599) this).anInt7857 = 0;
		}
	}

	public void method204() {
		if (((Class599) this).anInt7857 == 0)
			throw new IllegalStateException("");
		int i = ((Class599) this).aClass106_Sub3_Sub2_7856.method9640();
		int i_61_ = (((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i]);
		if (i_61_ != ((Class599) this).anInt7858) {
			if (i_61_ != 0) {
				OpenGL.glBindTexture(i_61_, 0);
				OpenGL.glDisable(i_61_);
			}
			OpenGL.glEnable(((Class599) this).anInt7858);
			((Class106_Sub3_Sub2) ((Class599) this).aClass106_Sub3_Sub2_7856).anIntArray11092[i] = ((Class599) this).anInt7858;
		}
		OpenGL.glBindTexture(((Class599) this).anInt7858, ((Class599) this).anInt7857);
	}

	void method7059(int i) {
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 -= i;
		((Class599) this).aClass106_Sub3_Sub2_7856.anInt10385 += method7055();
	}
}
