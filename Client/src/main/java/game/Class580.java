package game;

/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class580 {
	static final int anInt7677 = 512;
	int anInt7678;
	int anInt7679;
	Class571 aClass571_7680;
	byte[] aByteArray7681;
	Class161 aClass161_7682;
	int anInt7683;
	Class571[] aClass571Array7684;
	int anInt7685;
	int anInt7686;
	int anInt7687;
	int anInt7688;
	Class554 aClass554_7689;
	int anInt7690;
	int anInt7691;
	boolean aBool7692;
	static Interface5 anInterface5_7693;
	int anInt7694 = 570853807;
	int anInt7695;
	Class571[] aClass571Array7696;
	boolean aBool7697;
	Class580 aClass580_7698;
	Model aClass89_7699;
	int anInt7700;
	int anInt7701;
	static Class572_Sub12_Sub10 aClass572_Sub12_Sub10_7702;

	void method6852(Class106 class106) {
		try {
			boolean bool = Class124.aClass248_1508.method3370((-1224337577 * (((Class580) this).anInt7695)), -1655693427);
			if (bool) {
				class106.method1767(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class159 class159 = Class159.method2569(Class124.aClass248_1508, (((Class580) this).anInt7695 * -1224337577), 0);
				((Class580) this).aClass89_7699 = class106.method1755(class159, 1099776, 0, 255, 1);
				byte[] is = ((Class580) this).aClass89_7699.method1392();
				if (null == is)
					((Class580) this).aByteArray7681 = null;
				else {
					((Class580) this).aByteArray7681 = new byte[is.length];
					System.arraycopy(is, 0, ((Class580) this).aByteArray7681, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method6853(int i, int i_0_, int i_1_) {
		if (((Class580) this).aBool7697) {
			/* empty */
		}
		((Class580) this).anInt7691 = ((i_0_ - ((Class580) this).anInt7688 * -2053974009) * i / 255 + ((Class580) this).anInt7688 * -2053974009) * 1022458599;
	}

	public void method6854(Class106 class106, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_, int i_11_) {
		int i_12_ = 0;
		if (((Class580) this).aBool7697)
			i_12_ = ((Class580) this).anInt7691 * -628164393;
		if (((Class580) this).aClass580_7698 != null) {
			Class580 class580_13_ = this;
			Class580 class580_14_ = ((Class580) this).aClass580_7698;
			if (class580_13_.hashCode() > class580_14_.hashCode()) {
				class580_13_ = ((Class580) this).aClass580_7698;
				class580_14_ = this;
				i_12_ = 255 - i_12_;
			}
			class580_13_.method6859(class106, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bool, bool_10_, i_12_, 351509067);
			class580_14_.method6859(class106, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, false, bool_10_, 255 - i_12_, 351509067);
		} else {
			if (1107323541 * ((Class580) this).anInt7678 == -1)
				class106.method1725(i_2_, i_3_, i_4_, i_5_, ~0xffffff | i_9_, 0);
			method6859(class106, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bool, bool_10_, i_12_, 351509067);
		}
	}

	public boolean method6855(Class106 class106, int i, int i_15_, int i_16_) {
		if (i != 1050383025 * ((Class580) this).anInt7694) {
			((Class580) this).anInt7694 = -570853807 * i;
			int i_17_ = Cs2CallPointer.method5627(i, 326245663);
			if (i_17_ > 512)
				i_17_ = 512;
			if (i_17_ <= 0)
				i_17_ = 1;
			if (-1882955329 * ((Class580) this).anInt7679 != i_17_) {
				((Class580) this).anInt7679 = i_17_ * -997421505;
				((Class580) this).aClass161_7682 = null;
			}
			if (null != ((Class580) this).aClass571Array7696) {
				((Class580) this).anInt7683 = 0;
				int[] is = new int[((Class580) this).aClass571Array7696.length];
				for (int i_18_ = 0; i_18_ < ((Class580) this).aClass571Array7696.length; i_18_++) {
					Class571 class571 = ((Class580) this).aClass571Array7696[i_18_];
					if (class571.method6784(-509872859 * ((Class580) this).anInt7701, ((Class580) this).anInt7686 * 369315263, -983583065 * ((Class580) this).anInt7687, ((Class580) this).anInt7694 * 1050383025)) {
						is[((Class580) this).anInt7683 * -219511441] = ((Class571) class571).anInt6414;
						((Class580) this).aClass571Array7684[((((Class580) this).anInt7683 += 1576171919) * -219511441) - 1] = class571;
					}
				}
				Class540.method6413(is, ((Class580) this).aClass571Array7684, 0, (-219511441 * ((Class580) this).anInt7683 - 1), (byte) 17);
			}
			((Class580) this).aBool7692 = true;
		}
		boolean bool = false;
		if (((Class580) this).aBool7692) {
			((Class580) this).aBool7692 = false;
			for (int i_19_ = -219511441 * ((Class580) this).anInt7683 - 1; i_19_ >= 0; i_19_--) {
				boolean bool_20_ = (((Class580) this).aClass571Array7684[i_19_].method6789(class106, ((Class580) this).aClass571_7680));
				Class580 class580_21_ = this;
				((Class580) class580_21_).aBool7692 = ((Class580) class580_21_).aBool7692 | !bool_20_;
				bool |= bool_20_;
			}
		}
		if (i_15_ == 0 || !class106.method1676())
			((Class580) this).aClass89_7699 = null;
		else if (((Class580) this).aClass89_7699 == null && -1224337577 * ((Class580) this).anInt7695 >= 0)
			method6869(class106, 351802191);
		if (((Class580) this).aClass580_7698 != null && ((Class580) this).aClass580_7698 != this) {
			((Class580) this).aClass580_7698.method6861((byte) -82);
			bool |= ((Class580) this).aClass580_7698.method6855(class106, i, i_15_, -1419073002);
		}
		return bool;
	}

	public boolean method6856(int i) {
		return ((Class580) this).aBool7697;
	}

	public Class580 method6857(int i) {
		return ((Class580) this).aClass580_7698;
	}

	public void method6858(Class106 class106, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		method6854(class106, i, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, 0, i_29_, true, false, -1726244689);
	}

	void method6859(Class106 class106, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, boolean bool, boolean bool_39_, int i_40_, int i_41_) {
		int i_42_ = 255 - i_40_;
		class106.method2049();
		if (null == ((Class580) this).aClass89_7699) {
			class106.method1719(2, 0);
			i_36_ = i_36_ + i & 0x3fff;
			if (-1 != ((Class580) this).anInt7678 * 1107323541 && 0 != ((Class580) this).anInt7679 * -1882955329) {
				MaterialInformation class101 = Class307.aClass94_3548.getTexture(((((Class580) this).anInt7678) * 1107323541), 83377305);
				if (((Class580) this).aClass161_7682 == null && (anInterface5_7693.method25(class101.textureId * 811137757, (class101.aClass511_1342 == Class511.aClass511_5697 ? Class514.aClass514_5713 : Class514.aClass514_5714), 0.7F, ((Class580) this).anInt7679 * -1882955329, ((Class580) this).anInt7679 * -1882955329, false, 1931109690))) {
					int[] is = (Class511.aClass511_5697 == class101.aClass511_1342 ? (anInterface5_7693.method24(class101.textureId * 811137757, 0.7F, ((Class580) this).anInt7679 * -1882955329, ((Class580) this).anInt7679 * -1882955329, false, 1371302107)) : (anInterface5_7693.method23(class101.textureId * 811137757, 0.7F, -1882955329 * ((Class580) this).anInt7679, -1882955329 * ((Class580) this).anInt7679, false, -726833371)));
					((Class580) this).anInt7690 = -1656221593 * is[0];
					((Class580) this).anInt7685 = is[is.length - 1] * -684174639;
					((Class580) this).aClass161_7682 = class106.method1744(is, 0, class101.anInt1338 * 1913535271, class101.anInt1338 * 1913535271, 1913535271 * class101.anInt1338, -918676248);
				}
				int i_43_ = (255 == i_42_ ? (class101.aClass511_1342 == Class511.aClass511_5697 ? 1 : 0) : 1);
				if (1 == i_43_ && bool)
					class106.method1725(i_31_, i_32_, i_33_, i_34_, i_38_, 0);
				if (null != ((Class580) this).aClass161_7682) {
					int i_44_ = i_34_ * i_35_ / -4096;
					int i_45_;
					for (i_45_ = (i_33_ - i_34_) / 2 + i_34_ * i_36_ / 4096; i_45_ > i_34_; i_45_ -= i_34_) {
						/* empty */
					}
					for (/**/; i_45_ < 0; i_45_ += i_34_) {
						/* empty */
					}
					if (Class554.aClass554_6318 == ((Class580) this).aClass554_7689) {
						for (int i_46_ = i_45_ - i_34_; i_46_ < i_33_; i_46_ += i_34_)
							((Class580) this).aClass161_7682.method2598(i_46_ + i_31_, i_32_ + i_44_, i_34_, i_34_, 0, i_42_ << 24 | 0xffffff, i_43_);
						if (0 != (((Class580) this).anInt7690 * 889326423 & ~0xffffff))
							class106.method1720(0, 0, i_33_, 1 + (i_32_ + i_44_), 889326423 * (((Class580) this).anInt7690), (byte) -4);
						if ((86197809 * ((Class580) this).anInt7685 & ~0xffffff) != 0)
							class106.method1720(0, i_34_ + (i_32_ + i_44_), i_33_, i_34_ - (i_34_ + (i_32_ + i_44_)), (((Class580) this).anInt7685 * 86197809), (byte) -40);
					} else {
						for (/**/; i_44_ > i_34_; i_44_ -= i_34_) {
							/* empty */
						}
						for (/**/; i_44_ < 0; i_44_ += i_34_) {
							/* empty */
						}
						for (int i_47_ = i_45_ - i_34_; i_47_ < i_33_; i_47_ += i_34_) {
							for (int i_48_ = i_44_ - i_34_; i_48_ < i_34_; i_48_ += i_34_)
								((Class580) this).aClass161_7682.method2598(i_31_ + i_47_, i_32_ + i_48_, i_34_, i_34_, 0, i_42_ << 24 | 0xffffff, i_43_);
						}
					}
				}
			} else
				class106.method1725(i_31_, i_32_, i_33_, i_34_, i_42_ << 24 | i_38_, bool ? 0 : 1);
		} else if (bool_39_) {
			Class250 class250 = class106.method1765();
			Class250 class250_49_ = class106.method1765();
			class250.aFloatArray2728[2] = class250.aFloatArray2728[3];
			class250.aFloatArray2728[6] = class250.aFloatArray2728[7];
			class250.aFloatArray2728[10] = class250.aFloatArray2728[11];
			class250.aFloatArray2728[14] = class250.aFloatArray2728[15];
			class106.method1764(class250);
			method6860(class106, i_35_, i_36_, i_37_, i_40_, (short) 32190);
			class106.method1764(class250_49_);
		} else {
			if (bool)
				class106.method1719(3, i_38_);
			method6860(class106, i_35_, i_36_, i_37_, i_40_, (short) 22135);
		}
		for (int i_50_ = ((Class580) this).anInt7683 * -219511441 - 1; i_50_ >= 0; i_50_--)
			((Class580) this).aClass571Array7684[i_50_].method6781(class106, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, -509872859 * ((Class580) this).anInt7701, 369315263 * ((Class580) this).anInt7686, -983583065 * ((Class580) this).anInt7687, i_42_);
		class106.method1719(2, 0);
		class106.method1748();
	}

	void method6860(Class106 class106, int i, int i_51_, int i_52_, int i_53_, short i_54_) {
		Class261 class261 = class106.method1762();
		Class261 class261_55_ = new Class261();
		class261_55_.method3588(0.0F, 0.0F, 0.0F);
		class261_55_.method3576(0.0F, -1.0F, 0.0F, Class325.method4146(-i_51_ & 0x3fff));
		class261_55_.method3576(-1.0F, 0.0F, 0.0F, Class325.method4146(-i & 0x3fff));
		class261_55_.method3576(0.0F, 0.0F, -1.0F, Class325.method4146(-i_52_ & 0x3fff));
		class106.method1761(class261_55_);
		Class261 class261_56_ = new Class261();
		if (((Class580) this).anInt7700 * -781031787 != i_53_) {
			((Class580) this).aClass89_7699.method1467((byte) i_53_, ((Class580) this).aByteArray7681);
			((Class580) this).anInt7700 = 1910781117 * i_53_;
		}
		((Class580) this).aClass89_7699.method1375(class261_56_, null, 0);
		class106.method1761(class261);
	}

	public void method6861(byte i) {
		((Class580) this).aBool7697 = false;
		((Class580) this).aClass580_7698 = null;
		((Class580) this).anInt7691 = 0;
	}

	public static void method6862() {
		Class571.method6791();
	}

	public void method6863(int i, int i_57_) {
		if (((Class580) this).aBool7697) {
			/* empty */
		}
		((Class580) this).anInt7691 = ((i_57_ - ((Class580) this).anInt7688 * -2053974009) * i / 255 + ((Class580) this).anInt7688 * -2053974009) * 1022458599;
	}

	public void method6864(int i, int i_58_) {
		if (((Class580) this).aBool7697) {
			/* empty */
		}
		((Class580) this).anInt7691 = ((i_58_ - ((Class580) this).anInt7688 * -2053974009) * i / 255 + ((Class580) this).anInt7688 * -2053974009) * 1022458599;
	}

	public void method6865(Class580 class580_59_, byte i) {
		if (((Class580) this).aBool7697)
			((Class580) this).anInt7688 = ((Class580) this).anInt7691 * -516127567;
		else if (class580_59_ != null && ((Class580) class580_59_).aBool7697)
			((Class580) this).anInt7688 = -40066743 - -516127567 * ((Class580) class580_59_).anInt7691;
		else
			((Class580) this).anInt7688 = 0;
		((Class580) this).aBool7697 = true;
		((Class580) this).aClass580_7698 = class580_59_;
		((Class580) this).anInt7691 = 0;
	}

	public void method6866() {
		((Class580) this).aBool7697 = false;
		((Class580) this).aClass580_7698 = null;
		((Class580) this).anInt7691 = 0;
	}

	public void method6867() {
		((Class580) this).aBool7697 = false;
		((Class580) this).aClass580_7698 = null;
		((Class580) this).anInt7691 = 0;
	}

	public boolean method6868() {
		return ((Class580) this).aBool7697;
	}

	void method6869(Class106 class106, int i) {
		try {
			boolean bool = Class124.aClass248_1508.method3370((-1224337577 * (((Class580) this).anInt7695)), -1805621500);
			if (bool) {
				class106.method1767(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class159 class159 = Class159.method2569(Class124.aClass248_1508, (((Class580) this).anInt7695 * -1224337577), 0);
				((Class580) this).aClass89_7699 = class106.method1755(class159, 1099776, 0, 255, 1);
				byte[] is = ((Class580) this).aClass89_7699.method1392();
				if (null == is)
					((Class580) this).aByteArray7681 = null;
				else {
					((Class580) this).aByteArray7681 = new byte[is.length];
					System.arraycopy(is, 0, ((Class580) this).aByteArray7681, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public boolean method6870() {
		return ((Class580) this).aBool7697;
	}

	public Class580(int i, Class571[] class571s, int i_60_, int i_61_, int i_62_, int i_63_, Class554 class554, int i_64_) {
		((Class580) this).aBool7692 = true;
		((Class580) this).anInt7701 = -1878188371 * i_61_;
		((Class580) this).anInt7686 = 457417279 * i_62_;
		((Class580) this).anInt7687 = 1388220695 * i_63_;
		((Class580) this).anInt7678 = 149426365 * i;
		((Class580) this).aClass571Array7696 = class571s;
		((Class580) this).aClass554_7689 = class554;
		if (class571s != null) {
			((Class580) this).aClass571Array7684 = new Class571[class571s.length];
			((Class580) this).aClass571_7680 = i_60_ >= 0 ? class571s[i_60_] : null;
		} else {
			((Class580) this).aClass571Array7684 = null;
			((Class580) this).aClass571_7680 = null;
		}
		((Class580) this).anInt7695 = 469943399 * i_64_;
	}

	static final void method6871(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 100;
	}
}
