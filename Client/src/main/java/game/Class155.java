package game;

/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class155 {
	boolean aBool1737 = false;
	static final int anInt1738 = 3553;
	static final int anInt1739 = 34037;
	static final int anInt1740 = 34067;
	static final int anInt1741 = 32879;
	static final int anInt1742 = 5121;
	Class106_Sub1 aClass106_Sub1_1743;
	int anInt1744;
	int anInt1745;
	Class171 aClass171_1746;
	Class88 aClass88_1747;
	boolean aBool1748;
	static final int anInt1749 = 3552;
	int anInt1750;
	static int[] anIntArray1751 = new int[1];

	boolean method2516() {
		if (((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).aBool10124) {
			int i = method2523();
			((Class155) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glGenerateMipmapEXT(((Class155) this).anInt1744);
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
			return true;
		}
		return false;
	}

	void method2517(boolean bool) {
		if (((Class155) this).aBool1737 != bool) {
			((Class155) this).aBool1737 = bool;
			method2518();
		}
	}

	void method2518() {
		((Class155) this).aClass106_Sub1_1743.method9422(this);
		if (((Class155) this).aBool1737) {
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10241, ((Class155) this).aBool1748 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10241, ((Class155) this).aBool1748 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10240, 9728);
		}
	}

	void method2519() {
		if (((Class155) this).anInt1745 != 0) {
			((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= method2523();
			int[] is = new int[1];
			is[0] = ((Class155) this).anInt1745;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class155) this).anInt1745 = 0;
		}
	}

	void method2520(boolean bool) {
		if (((Class155) this).aBool1748 != bool) {
			int i = method2523();
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
		}
	}

	void method2521() {
		if (((Class155) this).anInt1745 != 0) {
			((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= method2523();
			int[] is = new int[1];
			is[0] = ((Class155) this).anInt1745;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class155) this).anInt1745 = 0;
		}
	}

	void method2522() {
		if (((Class155) this).anInt1745 != 0) {
			((Class155) this).aClass106_Sub1_1743.method9439(((Class155) this).anInt1745, method2523());
			((Class155) this).anInt1745 = 0;
		}
	}

	public void finalize() throws Throwable {
		method2522();
		super.finalize();
	}

	int method2523() {
		int i = (((Class155) this).aClass171_1746.anInt2074 * 1572594303 * (((Class155) this).aClass88_1747.anInt1223 * -1071269501) * ((Class155) this).anInt1750);
		return ((Class155) this).aBool1748 ? i * 4 / 3 : i;
	}

	static void method2524(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is) {
		if (i_1_ > 0 && !Class521.method6219(i_1_, (byte) 96))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class521.method6219(i_2_, (byte) 113))
			throw new IllegalArgumentException("");
		if (i_3_ != 32993)
			throw new IllegalArgumentException("");
		int i_5_ = 0;
		int i_6_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_7_ = i_1_ >> 1;
		int i_8_ = i_2_ >> 1;
		int[] is_9_ = is;
		int[] is_10_ = new int[i_7_ * i_8_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_5_, i_0_, i_1_, i_2_, 0, i_3_, i_4_, is_9_, 0);
			if (i_6_ <= 1)
				break;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = i_12_ + i_1_;
			for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					int i_16_ = is_9_[i_12_++];
					int i_17_ = is_9_[i_12_++];
					int i_18_ = is_9_[i_13_++];
					int i_19_ = is_9_[i_13_++];
					int i_20_ = i_16_ >> 24 & 0xff;
					int i_21_ = i_16_ >> 16 & 0xff;
					int i_22_ = i_16_ >> 8 & 0xff;
					int i_23_ = i_16_ & 0xff;
					i_20_ += i_17_ >> 24 & 0xff;
					i_21_ += i_17_ >> 16 & 0xff;
					i_22_ += i_17_ >> 8 & 0xff;
					i_23_ += i_17_ & 0xff;
					i_20_ += i_18_ >> 24 & 0xff;
					i_21_ += i_18_ >> 16 & 0xff;
					i_22_ += i_18_ >> 8 & 0xff;
					i_23_ += i_18_ & 0xff;
					i_20_ += i_19_ >> 24 & 0xff;
					i_21_ += i_19_ >> 16 & 0xff;
					i_22_ += i_19_ >> 8 & 0xff;
					i_23_ += i_19_ & 0xff;
					is_10_[i_11_++] = ((i_20_ & 0x3fc) << 22 | (i_21_ & 0x3fc) << 14 | (i_22_ & 0x3fc) << 6 | (i_23_ & 0x3fc) >> 2);
				}
				i_12_ += i_1_;
				i_13_ += i_1_;
			}
			int[] is_24_ = is_10_;
			is_10_ = is_9_;
			is_9_ = is_24_;
			i_1_ = i_7_;
			i_2_ = i_8_;
			i_7_ >>= 1;
			i_8_ >>= 1;
			i_6_ >>= 1;
			i_5_++;
		}
	}

	void method2525() {
		if (((Class155) this).anInt1745 != 0) {
			((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= method2523();
			int[] is = new int[1];
			is[0] = ((Class155) this).anInt1745;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class155) this).anInt1745 = 0;
		}
	}

	static void method2526(int i, int i_25_, int i_26_, int i_27_, Class171 class171, float[] fs) {
		if (i_26_ > 0 && !Class521.method6219(i_26_, (byte) 49))
			throw new IllegalArgumentException("");
		if (i_27_ > 0 && !Class521.method6219(i_27_, (byte) 68))
			throw new IllegalArgumentException("");
		int i_28_ = class171.anInt2074 * 1572594303;
		int i_29_ = 0;
		int i_30_ = i_26_ < i_27_ ? i_26_ : i_27_;
		int i_31_ = i_26_ >> 1;
		int i_32_ = i_27_ >> 1;
		float[] fs_33_ = fs;
		float[] fs_34_ = new float[i_31_ * i_32_ * i_28_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_29_, i_25_, i_26_, i_27_, 0, Class106_Sub1.method9444(class171), 5126, fs_33_, 0);
			if (i_30_ <= 1)
				break;
			int i_35_ = i_26_ * i_28_;
			for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
				int i_37_ = i_36_;
				int i_38_ = i_36_;
				int i_39_ = i_38_ + i_35_;
				for (int i_40_ = 0; i_40_ < i_32_; i_40_++) {
					for (int i_41_ = 0; i_41_ < i_31_; i_41_++) {
						float f = fs_33_[i_38_];
						i_38_ += i_28_;
						f += fs_33_[i_38_];
						i_38_ += i_28_;
						f += fs_33_[i_39_];
						i_39_ += i_28_;
						f += fs_33_[i_39_];
						i_39_ += i_28_;
						fs_34_[i_37_] = f * 0.25F;
						i_37_ += i_28_;
					}
					i_38_ += i_35_;
					i_39_ += i_35_;
				}
			}
			float[] fs_42_ = fs_34_;
			fs_34_ = fs_33_;
			fs_33_ = fs_42_;
			i_26_ = i_31_;
			i_27_ = i_32_;
			i_31_ >>= 1;
			i_32_ >>= 1;
			i_30_ >>= 1;
			i_29_++;
		}
	}

	void method2527() {
		((Class155) this).aClass106_Sub1_1743.method9422(this);
		if (((Class155) this).aBool1737) {
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10241, ((Class155) this).aBool1748 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10241, ((Class155) this).aBool1748 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class155) this).anInt1744, 10240, 9728);
		}
	}

	static void method2528(int i, int i_43_, int i_44_, int i_45_, Class171 class171, byte[] is) {
		if (i_44_ > 0 && !Class521.method6219(i_44_, (byte) 17))
			throw new IllegalArgumentException("");
		if (i_45_ > 0 && !Class521.method6219(i_45_, (byte) 103))
			throw new IllegalArgumentException("");
		int i_46_ = class171.anInt2074 * 1572594303;
		int i_47_ = 0;
		int i_48_ = i_44_ < i_45_ ? i_44_ : i_45_;
		int i_49_ = i_44_ >> 1;
		int i_50_ = i_45_ >> 1;
		byte[] is_51_ = is;
		byte[] is_52_ = new byte[i_49_ * i_50_ * i_46_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_47_, i_43_, i_44_, i_45_, 0, Class106_Sub1.method9444(class171), 5121, is_51_, 0);
			if (i_48_ <= 1)
				break;
			int i_53_ = i_44_ * i_46_;
			for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
				int i_55_ = i_54_;
				int i_56_ = i_54_;
				int i_57_ = i_56_ + i_53_;
				for (int i_58_ = 0; i_58_ < i_50_; i_58_++) {
					for (int i_59_ = 0; i_59_ < i_49_; i_59_++) {
						int i_60_ = is_51_[i_56_];
						i_56_ += i_46_;
						i_60_ += is_51_[i_56_];
						i_56_ += i_46_;
						i_60_ += is_51_[i_57_];
						i_57_ += i_46_;
						i_60_ += is_51_[i_57_];
						i_57_ += i_46_;
						is_52_[i_55_] = (byte) (i_60_ >> 2);
						i_55_ += i_46_;
					}
					i_56_ += i_53_;
					i_57_ += i_53_;
				}
			}
			byte[] is_61_ = is_52_;
			is_52_ = is_51_;
			is_51_ = is_61_;
			i_44_ = i_49_;
			i_45_ = i_50_;
			i_49_ >>= 1;
			i_50_ >>= 1;
			i_48_ >>= 1;
			i_47_++;
		}
	}

	boolean method2529() {
		if (((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).aBool10124) {
			int i = method2523();
			((Class155) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glGenerateMipmapEXT(((Class155) this).anInt1744);
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
			return true;
		}
		return false;
	}

	boolean method2530() {
		if (((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).aBool10124) {
			int i = method2523();
			((Class155) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glGenerateMipmapEXT(((Class155) this).anInt1744);
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
			return true;
		}
		return false;
	}

	Class155(Class106_Sub1 class106_sub1, int i, Class171 class171, Class88 class88, int i_62_, boolean bool) {
		((Class155) this).aClass106_Sub1_1743 = class106_sub1;
		((Class155) this).anInt1744 = i;
		((Class155) this).aClass171_1746 = class171;
		((Class155) this).aClass88_1747 = class88;
		((Class155) this).aBool1748 = bool;
		((Class155) this).anInt1750 = i_62_;
		OpenGL.glGenTextures(1, anIntArray1751, 0);
		((Class155) this).anInt1745 = anIntArray1751[0];
		method2531(0);
	}

	void method2531(int i) {
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= i;
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 += method2523();
	}

	void method2532() {
		if (((Class155) this).anInt1745 != 0) {
			((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= method2523();
			int[] is = new int[1];
			is[0] = ((Class155) this).anInt1745;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class155) this).anInt1745 = 0;
		}
	}

	boolean method2533() {
		if (((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).aBool10124) {
			int i = method2523();
			((Class155) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glGenerateMipmapEXT(((Class155) this).anInt1744);
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
			return true;
		}
		return false;
	}

	boolean method2534() {
		if (((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).aBool10124) {
			int i = method2523();
			((Class155) this).aClass106_Sub1_1743.method9422(this);
			OpenGL.glGenerateMipmapEXT(((Class155) this).anInt1744);
			((Class155) this).aBool1748 = true;
			method2518();
			method2531(i);
			return true;
		}
		return false;
	}

	void method2535() {
		if (((Class155) this).anInt1745 != 0) {
			((Class155) this).aClass106_Sub1_1743.method9439(((Class155) this).anInt1745, method2523());
			((Class155) this).anInt1745 = 0;
		}
	}

	void method2536() throws Throwable {
		method2522();
		super.finalize();
	}

	void method2537(int i) {
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= i;
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 += method2523();
	}

	void method2538(int i) {
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= i;
		((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 += method2523();
	}

	int method2539() {
		int i = (((Class155) this).aClass171_1746.anInt2074 * 1572594303 * (((Class155) this).aClass88_1747.anInt1223 * -1071269501) * ((Class155) this).anInt1750);
		return ((Class155) this).aBool1748 ? i * 4 / 3 : i;
	}

	int method2540() {
		int i = (((Class155) this).aClass171_1746.anInt2074 * 1572594303 * (((Class155) this).aClass88_1747.anInt1223 * -1071269501) * ((Class155) this).anInt1750);
		return ((Class155) this).aBool1748 ? i * 4 / 3 : i;
	}

	int method2541() {
		int i = (((Class155) this).aClass171_1746.anInt2074 * 1572594303 * (((Class155) this).aClass88_1747.anInt1223 * -1071269501) * ((Class155) this).anInt1750);
		return ((Class155) this).aBool1748 ? i * 4 / 3 : i;
	}

	void method2542() {
		if (((Class155) this).anInt1745 != 0) {
			((Class106_Sub1) ((Class155) this).aClass106_Sub1_1743).anInt10054 -= method2523();
			int[] is = new int[1];
			is[0] = ((Class155) this).anInt1745;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class155) this).anInt1745 = 0;
		}
	}
}
