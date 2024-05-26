package game;

/* Class174_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class174_Sub2 extends Class174 {
	static final boolean aBool10757 = true;
	static final int anInt10758 = 1;
	int anInt10759;
	static final int anInt10760 = 2;
	static final int anInt10761 = 4;
	static final boolean aBool10762 = false;
	static final int anInt10763 = 64;
	float aFloat10764;
	Class199[][] aClass199ArrayArray10765;
	Class145[][] aClass145ArrayArray10766;
	float aFloat10767;
	float aFloat10768;
	float aFloat10769;
	float aFloat10770;
	float aFloat10771;
	float aFloat10772;
	static final int anInt10773 = -1694498816;
	float aFloat10774;
	float aFloat10775;
	Class106_Sub2 aClass106_Sub2_10776;
	float aFloat10777;
	Class146[][] aClass146ArrayArray10778;
	float aFloat10779;
	Class201[][] aClass201ArrayArray10780;
	float aFloat10781;
	float aFloat10782;
	float aFloat10783;
	float aFloat10784;
	byte[][] aByteArrayArray10785;
	byte[][] aByteArrayArray10786;
	static final boolean aBool10787 = true;
	float aFloat10788;
	Class152[][] aClass152ArrayArray10789;

	public void method2732(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean[][] bools) {
		Class186 class186 = ((Class174_Sub2) this).aClass106_Sub2_10776.method9512(Thread.currentThread());
		Class143 class143 = ((Class186) class186).aClass143_2187;
		((Class143) class143).anInt19 = 0;
		((Class143) class143).aBoolean20 = true;
		((Class174_Sub2) this).aClass106_Sub2_10776.method9518();
		if (((Class174_Sub2) this).aClass201ArrayArray10780 != null || ((Class174_Sub2) this).aClass145ArrayArray10766 != null)
			method10005(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, bools, class186, class143, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214);
		else if (((Class174_Sub2) this).aClass152ArrayArray10789 != null)
			method10004(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, bools, class186, class143, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214);
	}

	public void method2712(int i, int i_6_, int[] is, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, Class86 class86, boolean bool) {
		if (((Class174_Sub2) this).aClass152ArrayArray10789 == null) {
			((Class174_Sub2) this).aClass152ArrayArray10789 = new Class152[anInt2086 * -1715487093][anInt2089 * 792439321];
			((Class174_Sub2) this).aClass199ArrayArray10765 = new Class199[anInt2086 * -1715487093][anInt2089 * 792439321];
		} else if (((Class174_Sub2) this).aClass201ArrayArray10780 != null || ((Class174_Sub2) this).aClass145ArrayArray10766 != null)
			throw new IllegalStateException();
		boolean bool_17_ = false;
		if (is_13_.length == 2 && is_10_.length == 2 && (is_13_[0] == is_13_[1] || is_15_[0] != -1 && is_15_[0] == is_15_[1])) {
			bool_17_ = true;
			for (int i_18_ = 1; i_18_ < 2; i_18_++) {
				int i_19_ = is[is_10_[i_18_]];
				int i_20_ = is_8_[is_10_[i_18_]];
				if (i_19_ != 0 && i_19_ != anInt2087 * 2129890771 || i_20_ != 0 && i_20_ != anInt2087 * 2129890771) {
					bool_17_ = false;
					break;
				}
			}
		}
		if (!bool_17_) {
			Class199 class199 = new Class199();
			short i_21_ = (short) is.length;
			int i_22_ = (short) is_13_.length;
			((Class199) class199).aShort2365 = i_21_;
			((Class199) class199).aShortArray2369 = new short[i_21_];
			((Class199) class199).aShortArray2367 = new short[i_21_];
			((Class199) class199).aShortArray2377 = new short[i_21_];
			((Class199) class199).aShortArray2364 = new short[i_21_];
			for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
				int i_24_ = is[i_23_];
				int i_25_ = is_8_[i_23_];
				if (i_24_ == 0 && i_25_ == 0)
					((Class199) class199).aShortArray2369[i_23_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_]));
				else if (i_24_ == 0 && i_25_ == anInt2087 * 2129890771)
					((Class199) class199).aShortArray2369[i_23_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_ + 1]));
				else if (i_24_ == anInt2087 * 2129890771 && i_25_ == anInt2087 * 2129890771)
					((Class199) class199).aShortArray2369[i_23_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_ + 1]));
				else if (i_24_ == anInt2087 * 2129890771 && i_25_ == 0)
					((Class199) class199).aShortArray2369[i_23_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_]));
				else {
					int i_26_ = (((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_])) * (anInt2087 * 2129890771 - i_24_) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_])) * i_24_);
					int i_27_ = (((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_ + 1])) * (anInt2087 * 2129890771 - i_24_) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_ + 1])) * i_24_);
					((Class199) class199).aShortArray2369[i_23_] = (short) ((i_26_ * (anInt2087 * 2129890771 - i_25_) + i_27_ * i_25_) >> anInt2088 * 424535142);
				}
				int i_28_ = (i << anInt2088 * 212267571) + i_24_;
				int i_29_ = (i_6_ << anInt2088 * 212267571) + i_25_;
				((Class199) class199).aShortArray2367[i_23_] = (short) i_24_;
				((Class199) class199).aShortArray2364[i_23_] = (short) i_25_;
				((Class199) class199).aShortArray2377[i_23_] = (short) (method2726(i_28_, i_29_, 358769667) + (is_7_ != null ? is_7_[i_23_] : 0));
				if (((Class199) class199).aShortArray2369[i_23_] < 2)
					((Class199) class199).aShortArray2369[i_23_] = (short) 2;
			}
			boolean bool_30_ = false;
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < i_22_; i_32_++) {
				if (is_13_[i_32_] >= 0 || is_14_ != null && is_14_[i_32_] >= 0)
					i_31_++;
				int i_33_ = is_15_[i_32_];
				if (i_33_ != -1) {
					MaterialInformation class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_33_, 72763437);
					if (!class101.aBool1350) {
						bool_30_ = true;
						if (method10003(class101.effectId) || class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
							((Class199) class199).aByte2366 |= 0x4;
					}
				}
			}
			((Class199) class199).anIntArray2376 = new int[i_31_];
			if (is_14_ != null)
				((Class199) class199).anIntArray2371 = new int[i_31_];
			((Class199) class199).aShortArray2368 = new short[i_31_];
			((Class199) class199).aShortArray2372 = new short[i_31_];
			((Class199) class199).aShortArray2373 = new short[i_31_];
			if (bool_30_) {
				((Class199) class199).aShortArray2374 = new short[i_31_];
				((Class199) class199).aShortArray2375 = new short[i_31_];
			}
			for (int i_34_ = 0; i_34_ < i_22_; i_34_++) {
				if (is_13_[i_34_] >= 0 || is_14_ != null && is_14_[i_34_] >= 0) {
					if (is_13_[i_34_] >= 0)
						((Class199) class199).anIntArray2376[((Class199) class199).aShort2370] = Class658.method1823(is_13_[i_34_], 885416935);
					else
						((Class199) class199).anIntArray2376[((Class199) class199).aShort2370] = -1;
					if (is_14_ != null) {
						if (is_14_[i_34_] != -1)
							((Class199) class199).anIntArray2371[((Class199) class199).aShort2370] = Class658.method1823(is_14_[i_34_], -632860009);
						else
							((Class199) class199).anIntArray2371[((Class199) class199).aShort2370] = -1;
					}
					((Class199) class199).aShortArray2368[((Class199) class199).aShort2370] = (short) is_10_[i_34_];
					((Class199) class199).aShortArray2372[((Class199) class199).aShort2370] = (short) is_11_[i_34_];
					((Class199) class199).aShortArray2373[((Class199) class199).aShort2370] = (short) is_12_[i_34_];
					if (bool_30_) {
						if (is_15_[i_34_] != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_15_[i_34_], 1734180871).aBool1350)) {
							((Class199) class199).aShortArray2374[((Class199) class199).aShort2370] = (short) is_15_[i_34_];
							((Class199) class199).aShortArray2375[((Class199) class199).aShort2370] = (short) is_16_[i_34_];
						} else
							((Class199) class199).aShortArray2374[((Class199) class199).aShort2370] = (short) -1;
					}
					((Class199) class199).aShort2370++;
				}
			}
			((Class174_Sub2) this).aClass199ArrayArray10765[i][i_6_] = class199;
		} else if (is_13_[0] >= 0 || is_14_ != null && is_14_[0] >= 0) {
			Class152 class152 = new Class152();
			int i_35_ = is_13_[0];
			int i_36_ = is_15_[0];
			if (is_14_ != null) {
				((Class152) class152).anInt1709 = Class416.method5100(Class658.method1823(is_14_[0], -653630516), ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_])), -1601124661);
				if (i_35_ == -1)
					((Class152) class152).aByte1705 |= 0x2;
			}
			if ((anIntArrayArray2085[i][i_6_] == anIntArrayArray2085[i + 1][i_6_]) && (anIntArrayArray2085[i][i_6_] == anIntArrayArray2085[i + 1][i_6_ + 1]) && (anIntArrayArray2085[i][i_6_] == anIntArrayArray2085[i][i_6_ + 1]))
				((Class152) class152).aByte1705 |= 0x1;
			MaterialInformation class101 = null;
			if (i_36_ != -1)
				class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_36_, 1487253229);
			if (class101 != null && (((Class152) class152).aByte1705 & 0x2) == 0 && !class101.aBool1350) {
				((Class152) class152).aShort1704 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_]));
				((Class152) class152).aShort1703 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_]));
				((Class152) class152).aShort1706 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_ + 1]));
				((Class152) class152).aShort1707 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_ + 1]));
				((Class152) class152).aShort1708 = (short) i_36_;
				if (method10003(class101.effectId) || class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
					((Class152) class152).aByte1705 |= 0x4;
			} else {
				short i_37_ = Class658.method1823(i_35_, -621249087);
				((Class152) class152).aShort1704 = (short) Class416.method5100(i_37_, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_])), -1601124661);
				((Class152) class152).aShort1703 = (short) Class416.method5100(i_37_, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_])), -1601124661);
				((Class152) class152).aShort1706 = (short) Class416.method5100(i_37_, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_6_ + 1])), -1601124661);
				((Class152) class152).aShort1707 = (short) Class416.method5100(i_37_, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_6_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_6_ + 1])), -1601124661);
				((Class152) class152).aShort1708 = (short) -1;
			}
			((Class174_Sub2) this).aClass152ArrayArray10789[i][i_6_] = class152;
		}
	}

	public void method2728(int i, int i_38_, int[] is, int[] is_39_, int[] is_40_, int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_, Class86 class86, boolean bool) {
		boolean bool_46_ = (((Class174_Sub2) this).anInt10759 & 0x20) == 0;
		if (((Class174_Sub2) this).aClass201ArrayArray10780 == null && !bool_46_) {
			((Class174_Sub2) this).aClass201ArrayArray10780 = new Class201[anInt2086 * -1715487093][anInt2089 * 792439321];
			((Class174_Sub2) this).aClass146ArrayArray10778 = new Class146[anInt2086 * -1715487093][anInt2089 * 792439321];
		} else if (((Class174_Sub2) this).aClass145ArrayArray10766 == null && bool_46_)
			((Class174_Sub2) this).aClass145ArrayArray10766 = new Class145[anInt2086 * -1715487093][anInt2089 * 792439321];
		else if (((Class174_Sub2) this).aClass152ArrayArray10789 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_47_ = 0; i_47_ < is_42_.length; i_47_++) {
				if (is_42_[i_47_] == -1)
					is_42_[i_47_] = 0;
				else
					is_42_[i_47_] = (Class460.anIntArray4096[(Class658.method1823(is_42_[i_47_], 1471858894) & 0xffff)]) << 8 | 0xff;
			}
			if (is_43_ != null) {
				for (int i_48_ = 0; i_48_ < is_43_.length; i_48_++) {
					if (is_43_[i_48_] == -1)
						is_43_[i_48_] = 0;
					else
						is_43_[i_48_] = (Class460.anIntArray4096[(Class658.method1823(is_43_[i_48_], -1760321634) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_46_) {
				Class145 class145 = new Class145();
				((Class145) class145).aShort1661 = (short) is.length;
				((Class145) class145).aShort1666 = (short) (is.length / 3);
				((Class145) class145).aShortArray1664 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1662 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1660 = new short[((Class145) class145).aShort1661];
				((Class145) class145).anIntArray1668 = new int[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1665 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1667 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aByteArray1669 = new byte[((Class145) class145).aShort1661];
				if (is_41_ != null)
					((Class145) class145).aShortArray1663 = new short[((Class145) class145).aShort1661];
				for (int i_49_ = 0; i_49_ < ((Class145) class145).aShort1661; i_49_++) {
					int i_50_ = is[i_49_];
					int i_51_ = is_40_[i_49_];
					boolean bool_52_ = false;
					int i_53_;
					if (i_50_ == 0 && i_51_ == 0)
						i_53_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_]));
					else if (i_50_ == 0 && i_51_ == anInt2087 * 2129890771)
						i_53_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1]));
					else if (i_50_ == anInt2087 * 2129890771 && i_51_ == anInt2087 * 2129890771)
						i_53_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1]));
					else if (i_50_ == anInt2087 * 2129890771 && i_51_ == 0)
						i_53_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_]));
					else {
						int i_54_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_])) * (anInt2087 * 2129890771 - i_50_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_])) * i_50_);
						int i_55_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1])) * (anInt2087 * 2129890771 - i_50_)) + (((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1])) * i_50_));
						i_53_ = (i_54_ * (anInt2087 * 2129890771 - i_51_) + i_55_ * i_51_) >> anInt2088 * 424535142;
					}
					int i_56_ = (i << anInt2088 * 212267571) + i_50_;
					int i_57_ = (i_38_ << anInt2088 * 212267571) + i_51_;
					((Class145) class145).aShortArray1664[i_49_] = (short) i_50_;
					((Class145) class145).aShortArray1660[i_49_] = (short) i_51_;
					((Class145) class145).aShortArray1662[i_49_] = (short) (method2726(i_56_, i_57_, 358769667) + (is_39_ != null ? is_39_[i_49_] : 0));
					if (i_53_ < 0)
						i_53_ = 0;
					if (is_42_[i_49_] == 0) {
						((Class145) class145).anIntArray1668[i_49_] = 0;
						if (is_43_ != null)
							((Class145) class145).aByteArray1669[i_49_] = (byte) i_53_;
					} else {
						int i_58_ = 0;
						if (is_41_ != null) {
							int i_59_ = (((Class145) class145).aShortArray1663[i_49_] = (short) is_41_[i_49_]);
							if (class86.anInt1190 * -1018540369 != 0) {
								i_58_ = 255 * i_59_ / (class86.anInt1190 * -1018540369);
								if (i_58_ < 0)
									i_58_ = 0;
								else if (i_58_ > 255)
									i_58_ = 255;
							}
						}
						int i_60_ = -16777216;
						if (is_44_[i_49_] != -1) {
							MaterialInformation class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_44_[i_49_], -349543801);
							if (class101.textureId * 811137757 != -1 && method10003(class101.effectId))
								i_60_ = -1694498816;
						}
						((Class145) class145).anIntArray1668[i_49_] = (i_60_ | Class629.method7515(method9999((is_42_[i_49_] >> 8), i_53_), (class86.anInt1193 * 526464983), i_58_, 1940235028));
						if (is_43_ != null)
							((Class145) class145).aByteArray1669[i_49_] = (byte) i_53_;
					}
					((Class145) class145).aShortArray1665[i_49_] = (short) is_44_[i_49_];
					((Class145) class145).aShortArray1667[i_49_] = (short) is_45_[i_49_];
				}
				if (is_43_ != null) {
					((Class145) class145).anIntArray1670 = new int[((Class145) class145).aShort1666];
					for (int i_61_ = 0; i_61_ < ((Class145) class145).aShort1666; i_61_++) {
						int i_62_ = i_61_ * 3;
						if (is_43_[i_62_] != 0)
							((Class145) class145).anIntArray1670[i_61_] = ~0xffffff | is_43_[i_62_] >> 8;
					}
				}
				((Class174_Sub2) this).aClass145ArrayArray10766[i][i_38_] = class145;
			} else {
				boolean bool_63_ = true;
				int i_64_ = -1;
				int i_65_ = -1;
				int i_66_ = -1;
				int i_67_ = -1;
				if (is.length == 6) {
					for (int i_68_ = 0; i_68_ < 6; i_68_++) {
						if (is[i_68_] == 0 && is_40_[i_68_] == 0) {
							if (i_64_ != -1 && is_42_[i_64_] != is_42_[i_68_]) {
								bool_63_ = false;
								break;
							}
							i_64_ = i_68_;
						} else if (is[i_68_] == anInt2087 * 2129890771 && is_40_[i_68_] == 0) {
							if (i_65_ != -1 && is_42_[i_65_] != is_42_[i_68_]) {
								bool_63_ = false;
								break;
							}
							i_65_ = i_68_;
						} else if (is[i_68_] == anInt2087 * 2129890771 && (is_40_[i_68_] == anInt2087 * 2129890771)) {
							if (i_66_ != -1 && is_42_[i_66_] != is_42_[i_68_]) {
								bool_63_ = false;
								break;
							}
							i_66_ = i_68_;
						} else if (is[i_68_] == 0 && (is_40_[i_68_] == anInt2087 * 2129890771)) {
							if (i_67_ != -1 && is_42_[i_67_] != is_42_[i_68_]) {
								bool_63_ = false;
								break;
							}
							i_67_ = i_68_;
						}
					}
					if (i_64_ == -1 || i_65_ == -1 || i_66_ == -1 || i_67_ == -1)
						bool_63_ = false;
					if (bool_63_) {
						if (is_39_ != null) {
							for (int i_69_ = 0; i_69_ < 4; i_69_++) {
								if (is_39_[i_69_] != 0) {
									bool_63_ = false;
									break;
								}
							}
						}
						if (bool_63_) {
							for (int i_70_ = 1; i_70_ < 4; i_70_++) {
								if (is[i_70_] != is[0] && (is[i_70_] != is[0] + anInt2087 * 2129890771) && (is[i_70_] != is[0] - anInt2087 * 2129890771)) {
									bool_63_ = false;
									break;
								}
								if (is_40_[i_70_] != is_40_[0] && (is_40_[i_70_] != is_40_[0] + anInt2087 * 2129890771) && (is_40_[i_70_] != (is_40_[0] - anInt2087 * 2129890771))) {
									bool_63_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_63_ = false;
				if (bool_63_) {
					Class201 class201 = new Class201();
					int i_71_ = is_42_[0];
					int i_72_ = is_44_[0];
					if (is_43_ != null) {
						((Class201) class201).anInt2396 = is_43_[0] >> 8;
						if (i_71_ == 0)
							((Class201) class201).aByte2400 |= 0x2;
					} else if (i_71_ == 0)
						return;
					if ((anIntArrayArray2085[i][i_38_] == anIntArrayArray2085[i + 1][i_38_]) && (anIntArrayArray2085[i][i_38_] == anIntArrayArray2085[i + 1][i_38_ + 1]) && (anIntArrayArray2085[i][i_38_] == anIntArrayArray2085[i][i_38_ + 1]))
						((Class201) class201).aByte2400 |= 0x1;
					if (i_72_ != -1 && (((Class201) class201).aByte2400 & 0x2) == 0 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_72_, 125163936).aBool1350)) {
						int i_73_;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_73_ = 255 * is_41_[i_64_] / (class86.anInt1190 * -1018540369);
							if (i_73_ < 0)
								i_73_ = 0;
							else if (i_73_ > 255)
								i_73_ = 255;
						} else
							i_73_ = 0;
						((Class201) class201).anInt2399 = (Class629.method7515(method9999(is_42_[i_64_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_]))), class86.anInt1193 * 526464983, i_73_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2399 |= (255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_])) << 25);
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_73_ = 255 * is_41_[i_65_] / (class86.anInt1190 * -1018540369);
							if (i_73_ < 0)
								i_73_ = 0;
							else if (i_73_ > 255)
								i_73_ = 255;
						} else
							i_73_ = 0;
						((Class201) class201).anInt2393 = (Class629.method7515(method9999(is_42_[i_65_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_]))), class86.anInt1193 * 526464983, i_73_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2393 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_])) << 25;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_73_ = 255 * is_41_[i_66_] / (class86.anInt1190 * -1018540369);
							if (i_73_ < 0)
								i_73_ = 0;
							else if (i_73_ > 255)
								i_73_ = 255;
						} else
							i_73_ = 0;
						((Class201) class201).anInt2394 = (Class629.method7515(method9999(is_42_[i_66_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1]))), class86.anInt1193 * 526464983, i_73_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2394 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1])) << 25;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_73_ = 255 * is_41_[i_67_] / (class86.anInt1190 * -1018540369);
							if (i_73_ < 0)
								i_73_ = 0;
							else if (i_73_ > 255)
								i_73_ = 255;
						} else
							i_73_ = 0;
						((Class201) class201).anInt2395 = (Class629.method7515(method9999(is_42_[i_67_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1]))), class86.anInt1193 * 526464983, i_73_, 1940235028));
						((Class201) class201).aShort2401 = (short) i_72_;
					} else {
						int i_74_;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_74_ = 255 * is_41_[i_64_] / (class86.anInt1190 * -1018540369);
							if (i_74_ < 0)
								i_74_ = 0;
							else if (i_74_ > 255)
								i_74_ = 255;
						} else
							i_74_ = 0;
						((Class201) class201).anInt2399 = (Class629.method7515(method9999(is_42_[i_64_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_]))), class86.anInt1193 * 526464983, i_74_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2399 |= (255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_])) << 25);
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_74_ = 255 * is_41_[i_65_] / (class86.anInt1190 * -1018540369);
							if (i_74_ < 0)
								i_74_ = 0;
							else if (i_74_ > 255)
								i_74_ = 255;
						} else
							i_74_ = 0;
						((Class201) class201).anInt2393 = (Class629.method7515(method9999(is_42_[i_65_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_]))), class86.anInt1193 * 526464983, i_74_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2393 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_])) << 25;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_74_ = 255 * is_41_[i_66_] / (class86.anInt1190 * -1018540369);
							if (i_74_ < 0)
								i_74_ = 0;
							else if (i_74_ > 255)
								i_74_ = 255;
						} else
							i_74_ = 0;
						((Class201) class201).anInt2394 = (Class629.method7515(method9999(is_42_[i_66_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1]))), class86.anInt1193 * 526464983, i_74_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2394 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1])) << 25;
						if (is_41_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_74_ = 255 * is_41_[i_67_] / (class86.anInt1190 * -1018540369);
							if (i_74_ < 0)
								i_74_ = 0;
							else if (i_74_ > 255)
								i_74_ = 255;
						} else
							i_74_ = 0;
						((Class201) class201).anInt2395 = (Class629.method7515(method9999(is_42_[i_67_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1]))), class86.anInt1193 * 526464983, i_74_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2395 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1])) << 25;
						((Class201) class201).aShort2401 = (short) -1;
					}
					if (is_41_ != null) {
						((Class201) class201).aShort2398 = (short) is_41_[i_66_];
						((Class201) class201).aShort2391 = (short) is_41_[i_67_];
						((Class201) class201).aShort2397 = (short) is_41_[i_65_];
						((Class201) class201).aShort2392 = (short) is_41_[i_64_];
					}
					((Class174_Sub2) this).aClass201ArrayArray10780[i][i_38_] = class201;
				} else {
					Class146 class146 = new Class146();
					((Class146) class146).aShort1672 = (short) is.length;
					((Class146) class146).aShort1671 = (short) (is.length / 3);
					((Class146) class146).aShortArray1673 = new short[((Class146) class146).aShort1672];
					((Class146) class146).aShortArray1675 = new short[((Class146) class146).aShort1672];
					((Class146) class146).aShortArray1676 = new short[((Class146) class146).aShort1672];
					((Class146) class146).anIntArray1680 = new int[((Class146) class146).aShort1672];
					if (is_41_ != null)
						((Class146) class146).aShortArray1677 = new short[((Class146) class146).aShort1672];
					for (int i_75_ = 0; i_75_ < ((Class146) class146).aShort1672; i_75_++) {
						int i_76_ = is[i_75_];
						int i_77_ = is_40_[i_75_];
						boolean bool_78_ = false;
						int i_79_;
						if (i_76_ == 0 && i_77_ == 0)
							i_79_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_]));
						else if (i_76_ == 0 && i_77_ == anInt2087 * 2129890771)
							i_79_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1]));
						else if (i_76_ == anInt2087 * 2129890771 && i_77_ == anInt2087 * 2129890771)
							i_79_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1]));
						else if (i_76_ == anInt2087 * 2129890771 && i_77_ == 0)
							i_79_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_]));
						else {
							int i_80_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_])) * (anInt2087 * 2129890771 - i_76_)) + (((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_])) * i_76_));
							int i_81_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_38_ + 1])) * (anInt2087 * 2129890771 - i_76_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_38_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_38_ + 1])) * i_76_);
							i_79_ = (i_80_ * (anInt2087 * 2129890771 - i_77_) + i_81_ * i_77_) >> anInt2088 * 424535142;
						}
						int i_82_ = (i << anInt2088 * 212267571) + i_76_;
						int i_83_ = (i_38_ << anInt2088 * 212267571) + i_77_;
						((Class146) class146).aShortArray1673[i_75_] = (short) i_76_;
						((Class146) class146).aShortArray1676[i_75_] = (short) i_77_;
						((Class146) class146).aShortArray1675[i_75_] = (short) (method2726(i_82_, i_83_, 358769667) + (is_39_ != null ? is_39_[i_75_] : 0));
						if (i_79_ < 0)
							i_79_ = 0;
						if (is_42_[i_75_] == 0) {
							if (is_43_ != null)
								((Class146) class146).anIntArray1680[i_75_] = i_79_ << 25;
							else
								((Class146) class146).anIntArray1680[i_75_] = 0;
						} else {
							int i_84_ = 0;
							if (is_41_ != null) {
								int i_85_ = (((Class146) class146).aShortArray1677[i_75_] = (short) is_41_[i_75_]);
								if (class86.anInt1190 * -1018540369 != 0) {
									i_84_ = 255 * i_85_ / (class86.anInt1190 * -1018540369);
									if (i_84_ < 0)
										i_84_ = 0;
									else if (i_84_ > 255)
										i_84_ = 255;
								}
							}
							((Class146) class146).anIntArray1680[i_75_] = Class629.method7515(method9999((is_42_[i_75_] >> 8), i_79_), (class86.anInt1193 * 526464983), i_84_, 1940235028);
							if (is_43_ != null)
								((Class146) class146).anIntArray1680[i_75_] |= i_79_ << 25;
						}
					}
					boolean bool_86_ = false;
					for (int i_87_ = 0; i_87_ < ((Class146) class146).aShort1671; i_87_++) {
						if (is_44_[i_87_ * 3] != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_44_[i_87_ * 3], 2102640462).aBool1350))
							bool_86_ = true;
					}
					if (is_43_ != null)
						((Class146) class146).anIntArray1681 = new int[((Class146) class146).aShort1671];
					if (bool_86_) {
						((Class146) class146).aShortArray1679 = new short[((Class146) class146).aShort1671];
						((Class146) class146).aShortArray1678 = new short[((Class146) class146).aShort1671];
					}
					for (int i_88_ = 0; i_88_ < ((Class146) class146).aShort1671; i_88_++) {
						int i_89_ = i_88_ * 3;
						if (is_43_ != null && is_43_[i_89_] != 0)
							((Class146) class146).anIntArray1681[i_88_] = is_43_[i_89_] >> 8;
						if (bool_86_) {
							int i_90_ = i_89_ + 1;
							int i_91_ = i_90_ + 1;
							boolean bool_92_ = false;
							boolean bool_93_ = true;
							int i_94_ = is_44_[i_89_];
							if (i_94_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, -70171029).aBool1350))
								bool_93_ = false;
							else
								bool_92_ = true;
							i_94_ = is_44_[i_90_];
							if (i_94_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 1631085302).aBool1350))
								bool_93_ = false;
							else
								bool_92_ = true;
							i_94_ = is_44_[i_91_];
							if (i_94_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 639232145).aBool1350))
								bool_93_ = false;
							else
								bool_92_ = true;
							if (bool_93_) {
								((Class146) class146).aShortArray1679[i_88_] = (short) i_94_;
								((Class146) class146).aShortArray1678[i_88_] = (short) is_45_[i_89_];
							} else {
								if (bool_92_) {
									i_94_ = is_44_[i_89_];
									if (i_94_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, -587809868).aBool1350))
										((Class146) class146).anIntArray1680[i_89_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 1464407945).aShort1317) & 0xffff, -1798061658)) & 0xffff]);
									i_94_ = is_44_[i_90_];
									if (i_94_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 1135956687).aBool1350))
										((Class146) class146).anIntArray1680[i_90_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 57247748).aShort1317) & 0xffff, -1243452765)) & 0xffff]);
									i_94_ = is_44_[i_91_];
									if (i_94_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, -327674994).aBool1350))
										((Class146) class146).anIntArray1680[i_91_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_94_, 2058469629).aShort1317) & 0xffff, -459431997)) & 0xffff]);
								}
								((Class146) class146).aShortArray1679[i_88_] = (short) -1;
							}
						}
					}
					((Class174_Sub2) this).aClass146ArrayArray10778[i][i_38_] = class146;
				}
			}
		}
	}

	static int method9999(int i, int i_95_) {
		int i_96_ = (i & 0xff0000) * i_95_ >> 23;
		if (i_96_ < 2)
			i_96_ = 2;
		else if (i_96_ > 253)
			i_96_ = 253;
		int i_97_ = (i & 0xff00) * i_95_ >> 15;
		if (i_97_ < 2)
			i_97_ = 2;
		else if (i_97_ > 253)
			i_97_ = 253;
		int i_98_ = (i & 0xff) * i_95_ >> 7;
		if (i_98_ < 2)
			i_98_ = 2;
		else if (i_98_ > 253)
			i_98_ = 253;
		return i_96_ << 16 | i_97_ << 8 | i_98_;
	}

	public void method2742(Class572_Sub36 class572_sub36, int[] is) {
		/* empty */
	}

	public void method2711(int i, int i_99_, int i_100_) {
		i = Math.min(((Class174_Sub2) this).aByteArrayArray10786.length - 1, Math.max(0, i));
		i_99_ = Math.min((((Class174_Sub2) this).aByteArrayArray10786[i].length - 1), Math.max(0, i_99_));
		if (((Class174_Sub2) this).aByteArrayArray10786[i][i_99_] < i_100_)
			((Class174_Sub2) this).aByteArrayArray10786[i][i_99_] = (byte) i_100_;
	}

	public void method2727(int i, int i_101_, int i_102_) {
		i = Math.min(((Class174_Sub2) this).aByteArrayArray10786.length - 1, Math.max(0, i));
		i_101_ = Math.min((((Class174_Sub2) this).aByteArrayArray10786[i].length - 1), Math.max(0, i_101_));
		if (((Class174_Sub2) this).aByteArrayArray10786[i][i_101_] < i_102_)
			((Class174_Sub2) this).aByteArrayArray10786[i][i_101_] = (byte) i_102_;
	}

	void method10000(int i, int i_103_, Class143 class143, float[] fs, float[] fs_104_, float[] fs_105_, float[] fs_106_, float[] fs_107_, int i_108_) {
		Class152 class152 = ((Class174_Sub2) this).aClass152ArrayArray10789[i][i_103_];
		if (class152 != null) {
			if ((((Class152) class152).aByte1705 & 0x2) == 0) {
				if (i_108_ != 0) {
					if ((((Class152) class152).aByte1705 & 0x4) != 0) {
						if ((i_108_ & 0x1) != 0)
							return;
					} else if ((i_108_ & 0x2) != 0)
						return;
				}
				int i_109_ = i * (anInt2087 * 2129890771);
				int i_110_ = i_109_ + anInt2087 * 2129890771;
				int i_111_ = i_103_ * (anInt2087 * 2129890771);
				int i_112_ = i_111_ + anInt2087 * 2129890771;
				float f;
				float f_113_;
				float f_114_;
				float f_115_;
				float f_116_;
				float f_117_;
				float f_118_;
				float f_119_;
				float f_120_;
				float f_121_;
				float f_122_;
				float f_123_;
				float f_124_;
				float f_125_;
				float f_126_;
				float f_127_;
				if ((((Class152) class152).aByte1705 & 0x1) != 0) {
					int i_128_ = anIntArrayArray2085[i][i_103_];
					float f_129_ = ((Class174_Sub2) this).aFloat10775 * (float) i_128_;
					float f_130_ = ((Class174_Sub2) this).aFloat10768 * (float) i_128_;
					float f_131_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_109_) + f_129_ + (((Class174_Sub2) this).aFloat10779 * (float) i_111_)));
					f = (((Class174_Sub2) this).aFloat10784 + (((Class174_Sub2) this).aFloat10772 * (float) i_109_ + f_130_ + (((Class174_Sub2) this).aFloat10764 * (float) i_111_)));
					if (f_131_ < -f)
						return;
					float f_132_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_110_) + f_129_ + (((Class174_Sub2) this).aFloat10779 * (float) i_111_)));
					f_113_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_110_) + f_130_ + (((Class174_Sub2) this).aFloat10764 * (float) i_111_)));
					if (f_132_ < -f_113_)
						return;
					float f_133_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_110_) + f_129_ + (((Class174_Sub2) this).aFloat10779 * (float) i_112_)));
					f_114_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_110_) + f_130_ + (((Class174_Sub2) this).aFloat10764 * (float) i_112_)));
					if (f_133_ < -f_114_)
						return;
					float f_134_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_109_) + f_129_ + (((Class174_Sub2) this).aFloat10779 * (float) i_112_)));
					f_115_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_109_) + f_130_ + (((Class174_Sub2) this).aFloat10764 * (float) i_112_)));
					if (f_134_ < -f_115_)
						return;
					float f_135_ = ((Class174_Sub2) this).aFloat10767 * (float) i_128_;
					float f_136_ = ((Class174_Sub2) this).aFloat10774 * (float) i_128_;
					float f_137_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_109_) + f_135_ + (((Class174_Sub2) this).aFloat10777 * (float) i_111_)));
					f_116_ = (((Class143) class143).aFloat23 + ((Class143) class143).aFloat17 * f_137_ / f);
					float f_138_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_109_) + f_136_ + (((Class174_Sub2) this).aFloat10788 * (float) i_111_)));
					f_117_ = (((Class143) class143).aFloat25 + ((Class143) class143).aFloat26 * f_138_ / f);
					f_118_ = (((Class143) class143).aFloat27 + ((Class143) class143).aFloat46 * f_131_ / f);
					float f_139_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_110_) + f_135_ + (((Class174_Sub2) this).aFloat10777 * (float) i_111_)));
					f_119_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_139_ / f_113_));
					float f_140_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_110_) + f_136_ + (((Class174_Sub2) this).aFloat10788 * (float) i_111_)));
					f_120_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_140_ / f_113_));
					f_121_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_132_ / f_113_));
					float f_141_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_110_) + f_135_ + (((Class174_Sub2) this).aFloat10777 * (float) i_112_)));
					f_122_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_141_ / f_114_));
					float f_142_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_110_) + f_136_ + (((Class174_Sub2) this).aFloat10788 * (float) i_112_)));
					f_123_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_142_ / f_114_));
					f_124_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_133_ / f_114_));
					float f_143_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_109_) + f_135_ + (((Class174_Sub2) this).aFloat10777 * (float) i_112_)));
					f_125_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_143_ / f_115_));
					float f_144_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_109_) + f_136_ + (((Class174_Sub2) this).aFloat10788 * (float) i_112_)));
					f_126_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_144_ / f_115_));
					f_127_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_134_ / f_115_));
				} else {
					int i_145_ = anIntArrayArray2085[i][i_103_];
					int i_146_ = anIntArrayArray2085[i + 1][i_103_];
					int i_147_ = anIntArrayArray2085[i + 1][i_103_ + 1];
					int i_148_ = anIntArrayArray2085[i][i_103_ + 1];
					float f_149_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_109_) + (((Class174_Sub2) this).aFloat10775 * (float) i_145_) + (((Class174_Sub2) this).aFloat10779 * (float) i_111_)));
					f = (((Class174_Sub2) this).aFloat10784 + (((Class174_Sub2) this).aFloat10772 * (float) i_109_ + (((Class174_Sub2) this).aFloat10768 * (float) i_145_) + (((Class174_Sub2) this).aFloat10764 * (float) i_111_)));
					if (f_149_ < -f)
						return;
					float f_150_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_110_) + (((Class174_Sub2) this).aFloat10775 * (float) i_146_) + (((Class174_Sub2) this).aFloat10779 * (float) i_111_)));
					f_113_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_110_) + (((Class174_Sub2) this).aFloat10768 * (float) i_146_) + (((Class174_Sub2) this).aFloat10764 * (float) i_111_)));
					if (f_150_ < -f_113_)
						return;
					float f_151_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_110_) + (((Class174_Sub2) this).aFloat10775 * (float) i_147_) + (((Class174_Sub2) this).aFloat10779 * (float) i_112_)));
					f_114_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_110_) + (((Class174_Sub2) this).aFloat10768 * (float) i_147_) + (((Class174_Sub2) this).aFloat10764 * (float) i_112_)));
					if (f_151_ < -f_114_)
						return;
					float f_152_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_109_) + (((Class174_Sub2) this).aFloat10775 * (float) i_148_) + (((Class174_Sub2) this).aFloat10779 * (float) i_112_)));
					f_115_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_109_) + (((Class174_Sub2) this).aFloat10768 * (float) i_148_) + (((Class174_Sub2) this).aFloat10764 * (float) i_112_)));
					if (f_152_ < -f_115_)
						return;
					float f_153_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_109_) + (((Class174_Sub2) this).aFloat10767 * (float) i_145_) + (((Class174_Sub2) this).aFloat10777 * (float) i_111_)));
					f_116_ = (((Class143) class143).aFloat23 + ((Class143) class143).aFloat17 * f_153_ / f);
					float f_154_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_109_) + (((Class174_Sub2) this).aFloat10774 * (float) i_145_) + (((Class174_Sub2) this).aFloat10788 * (float) i_111_)));
					f_117_ = (((Class143) class143).aFloat25 + ((Class143) class143).aFloat26 * f_154_ / f);
					f_118_ = (((Class143) class143).aFloat27 + ((Class143) class143).aFloat46 * f_149_ / f);
					float f_155_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_110_) + (((Class174_Sub2) this).aFloat10767 * (float) i_146_) + (((Class174_Sub2) this).aFloat10777 * (float) i_111_)));
					f_119_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_155_ / f_113_));
					float f_156_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_110_) + (((Class174_Sub2) this).aFloat10774 * (float) i_146_) + (((Class174_Sub2) this).aFloat10788 * (float) i_111_)));
					f_120_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_156_ / f_113_));
					f_121_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_150_ / f_113_));
					float f_157_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_110_) + (((Class174_Sub2) this).aFloat10767 * (float) i_147_) + (((Class174_Sub2) this).aFloat10777 * (float) i_112_)));
					f_122_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_157_ / f_114_));
					float f_158_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_110_) + (((Class174_Sub2) this).aFloat10774 * (float) i_147_) + (((Class174_Sub2) this).aFloat10788 * (float) i_112_)));
					f_123_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_158_ / f_114_));
					f_124_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_151_ / f_114_));
					float f_159_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_109_) + (((Class174_Sub2) this).aFloat10767 * (float) i_148_) + (((Class174_Sub2) this).aFloat10777 * (float) i_112_)));
					f_125_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_159_ / f_115_));
					float f_160_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_109_) + (((Class174_Sub2) this).aFloat10774 * (float) i_148_) + (((Class174_Sub2) this).aFloat10788 * (float) i_112_)));
					f_126_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_160_ / f_115_));
					f_127_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_152_ / f_115_));
				}
				int i_161_ = -1;
				if (((Class152) class152).aShort1708 != -1)
					i_161_ = (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((Class152) class152).aShort1708 & 0xffff, 1521701387).textureId) * 811137757;
				if (((f_122_ - f_125_) * (f_120_ - f_126_) - (f_123_ - f_126_) * (f_119_ - f_125_)) > 0.0F) {
					((Class143) class143).aBoolean20 = (f_122_ < 0.0F || f_125_ < 0.0F || f_119_ < 0.0F || f_122_ > (float) ((Class143) class143).anInt22 || f_125_ > (float) ((Class143) class143).anInt22 || (f_119_ > (float) ((Class143) class143).anInt22));
					if (i_161_ >= 0)
						class143.method290(true, true, false, f_123_, f_126_, f_120_, f_122_, f_125_, f_119_, f_124_, f_127_, f_121_, f_114_, f_115_, f_113_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1706 & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1707 & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1703 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class152) class152).aShort1708 & 0xffff, i_161_);
					else
						class143.method299(true, true, false, f_123_, f_126_, f_120_, f_122_, f_125_, f_119_, f_124_, f_127_, f_121_, (float) (((Class152) class152).aShort1706 & 0xffff), (float) (((Class152) class152).aShort1707 & 0xffff), (float) (((Class152) class152).aShort1703 & 0xffff));
				}
				if (((f_116_ - f_119_) * (f_126_ - f_120_) - (f_117_ - f_120_) * (f_125_ - f_119_)) > 0.0F) {
					((Class143) class143).aBoolean20 = (f_116_ < 0.0F || f_119_ < 0.0F || f_125_ < 0.0F || f_116_ > (float) ((Class143) class143).anInt22 || f_119_ > (float) ((Class143) class143).anInt22 || (f_125_ > (float) ((Class143) class143).anInt22));
					if (i_161_ >= 0)
						class143.method290(true, true, false, f_117_, f_120_, f_126_, f_116_, f_119_, f_125_, f_118_, f_121_, f_127_, f, f_113_, f_115_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1704 & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1703 & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[(((Class152) class152).aShort1707 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class152) class152).aShort1708 & 0xffff, i_161_);
					else
						class143.method299(true, true, false, f_117_, f_120_, f_126_, f_116_, f_119_, f_125_, f_118_, f_121_, f_127_, (float) (((Class152) class152).aShort1704 & 0xffff), (float) (((Class152) class152).aShort1703 & 0xffff), (float) (((Class152) class152).aShort1707 & 0xffff));
				}
			}
		} else {
			Class199 class199 = ((Class174_Sub2) this).aClass199ArrayArray10765[i][i_103_];
			if (class199 != null) {
				if (i_108_ != 0) {
					if ((((Class199) class199).aByte2366 & 0x4) != 0) {
						if ((i_108_ & 0x1) != 0)
							return;
					} else if ((i_108_ & 0x2) != 0)
						return;
				}
				for (int i_162_ = 0; i_162_ < ((Class199) class199).aShort2365; i_162_++) {
					int i_163_ = (((Class199) class199).aShortArray2367[i_162_] + (i << anInt2088 * 212267571));
					short i_164_ = ((Class199) class199).aShortArray2377[i_162_];
					int i_165_ = (((Class199) class199).aShortArray2364[i_162_] + (i_103_ << anInt2088 * 212267571));
					float f = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_163_) + (((Class174_Sub2) this).aFloat10775 * (float) i_164_) + (((Class174_Sub2) this).aFloat10779 * (float) i_165_)));
					float f_166_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_163_) + (((Class174_Sub2) this).aFloat10768 * (float) i_164_) + (((Class174_Sub2) this).aFloat10764 * (float) i_165_)));
					if (f < -f_166_)
						return;
					float f_167_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_163_) + (((Class174_Sub2) this).aFloat10767 * (float) i_164_) + (((Class174_Sub2) this).aFloat10777 * (float) i_165_)));
					float f_168_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_163_) + (((Class174_Sub2) this).aFloat10774 * (float) i_164_) + (((Class174_Sub2) this).aFloat10788 * (float) i_165_)));
					fs[i_162_] = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_167_ / f_166_));
					fs_104_[i_162_] = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_168_ / f_166_));
					fs_105_[i_162_] = (((Class143) class143).aFloat27 + ((Class143) class143).aFloat46 * f / f_166_);
					fs_106_[i_162_] = f_166_;
				}
				if (((Class199) class199).aShortArray2374 != null) {
					for (int i_169_ = 0; i_169_ < ((Class199) class199).aShort2370; i_169_++) {
						short i_170_ = ((Class199) class199).aShortArray2368[i_169_];
						short i_171_ = ((Class199) class199).aShortArray2372[i_169_];
						short i_172_ = ((Class199) class199).aShortArray2373[i_169_];
						float f = fs[i_170_];
						float f_173_ = fs[i_171_];
						float f_174_ = fs[i_172_];
						float f_175_ = fs_104_[i_170_];
						float f_176_ = fs_104_[i_171_];
						float f_177_ = fs_104_[i_172_];
						if (((f - f_173_) * (f_177_ - f_176_) - (f_175_ - f_176_) * (f_174_ - f_173_)) > 0.0F) {
							((Class143) class143).aBoolean20 = (f < 0.0F || f_173_ < 0.0F || f_174_ < 0.0F || f > (float) (((Class143) class143).anInt22) || f_173_ > (float) (((Class143) class143).anInt22) || f_174_ > (float) (((Class143) class143).anInt22));
							int i_178_ = -1;
							if (((Class199) class199).aShortArray2374[i_169_] != -1)
								i_178_ = (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture((((Class199) class199).aShortArray2374[i_169_]) & 0xffff, 1709707345).textureId) * 811137757;
							if (i_178_ != -1)
								class143.method290(true, true, false, f_175_, f_176_, f_177_, f, f_173_, f_174_, fs_105_[i_170_], fs_105_[i_171_], fs_105_[i_172_], fs_106_[i_170_], fs_106_[i_171_], fs_106_[i_172_], ((float) (((Class199) class199).aShortArray2367[i_170_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class199) class199).aShortArray2367[i_171_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class199) class199).aShortArray2367[i_172_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class199) class199).aShortArray2364[i_170_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class199) class199).aShortArray2364[i_171_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class199) class199).aShortArray2364[i_172_]) / (float) (anInt2087 * 2129890771)), ~0xffffff | (Class460.anIntArray4096[((((Class199) class199).aShortArray2369[i_170_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[((((Class199) class199).aShortArray2369[i_171_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class460.anIntArray4096[((((Class199) class199).aShortArray2369[i_172_]) & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (((Class199) class199).aShortArray2374[i_169_]) & 0xffff, i_178_);
							else {
								int i_179_ = (((Class199) class199).anIntArray2376[i_169_]);
								if (i_179_ != -1)
									class143.method299(true, true, false, f_175_, f_176_, f_177_, f, f_173_, f_174_, fs_105_[i_170_], fs_105_[i_171_], fs_105_[i_172_], (float) (Class416.method5100(i_179_, (((Class199) class199).aShortArray2369[i_170_]), -1601124661)), (float) (Class416.method5100(i_179_, (((Class199) class199).aShortArray2369[i_171_]), -1601124661)), (float) (Class416.method5100(i_179_, (((Class199) class199).aShortArray2369[i_172_]), -1601124661)));
							}
						}
					}
				} else {
					for (int i_180_ = 0; i_180_ < ((Class199) class199).aShort2370; i_180_++) {
						short i_181_ = ((Class199) class199).aShortArray2368[i_180_];
						short i_182_ = ((Class199) class199).aShortArray2372[i_180_];
						short i_183_ = ((Class199) class199).aShortArray2373[i_180_];
						float f = fs[i_181_];
						float f_184_ = fs[i_182_];
						float f_185_ = fs[i_183_];
						float f_186_ = fs_104_[i_181_];
						float f_187_ = fs_104_[i_182_];
						float f_188_ = fs_104_[i_183_];
						if (((f - f_184_) * (f_188_ - f_187_) - (f_186_ - f_187_) * (f_185_ - f_184_)) > 0.0F) {
							int i_189_ = ((Class199) class199).anIntArray2376[i_180_];
							if (i_189_ != -1) {
								((Class143) class143).aBoolean20 = (f < 0.0F || f_184_ < 0.0F || f_185_ < 0.0F || f > (float) (((Class143) class143).anInt22) || f_184_ > (float) ((Class143) class143).anInt22 || (f_185_ > (float) (((Class143) class143).anInt22)));
								class143.method299(true, true, false, f_186_, f_187_, f_188_, f, f_184_, f_185_, fs_105_[i_181_], fs_105_[i_182_], fs_105_[i_183_], (float) (Class416.method5100(i_189_, (((Class199) class199).aShortArray2369[i_181_]), -1601124661)), (float) (Class416.method5100(i_189_, (((Class199) class199).aShortArray2369[i_182_]), -1601124661)), (float) (Class416.method5100(i_189_, (((Class199) class199).aShortArray2369[i_183_]), -1601124661)));
							}
						}
					}
				}
			}
		}
	}

	void method10001(int i, int i_190_, boolean bool, Class186 class186, Class143 class143, float[] fs, float[] fs_191_, float[] fs_192_, float[] fs_193_, float[] fs_194_, int i_195_) {
		Class201 class201 = ((Class174_Sub2) this).aClass201ArrayArray10780[i][i_190_];
		if (class201 != null) {
			if ((((Class201) class201).aByte2400 & 0x2) == 0) {
				if (i_195_ != 0) {
					if ((((Class201) class201).aByte2400 & 0x4) != 0) {
						if ((i_195_ & 0x1) != 0)
							return;
					} else if ((i_195_ & 0x2) != 0)
						return;
				}
				int i_196_ = i * (anInt2087 * 2129890771);
				int i_197_ = i_196_ + anInt2087 * 2129890771;
				int i_198_ = i_190_ * (anInt2087 * 2129890771);
				int i_199_ = i_198_ + anInt2087 * 2129890771;
				float f = 0.0F;
				float f_200_ = 0.0F;
				float f_201_ = 0.0F;
				float f_202_ = 0.0F;
				float f_203_;
				float f_204_;
				float f_205_;
				float f_206_;
				float f_207_;
				float f_208_;
				float f_209_;
				float f_210_;
				float f_211_;
				float f_212_;
				float f_213_;
				float f_214_;
				float f_215_;
				float f_216_;
				float f_217_;
				float f_218_;
				if ((((Class201) class201).aByte2400 & 0x1) != 0 && !bool) {
					int i_219_ = anIntArrayArray2085[i][i_190_];
					float f_220_ = ((Class174_Sub2) this).aFloat10775 * (float) i_219_;
					float f_221_ = ((Class174_Sub2) this).aFloat10768 * (float) i_219_;
					float f_222_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_196_) + f_220_ + (((Class174_Sub2) this).aFloat10779 * (float) i_198_)));
					f_203_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_196_) + f_221_ + (((Class174_Sub2) this).aFloat10764 * (float) i_198_)));
					if (f_222_ < -f_203_)
						return;
					float f_223_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_197_) + f_220_ + (((Class174_Sub2) this).aFloat10779 * (float) i_198_)));
					f_204_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_197_) + f_221_ + (((Class174_Sub2) this).aFloat10764 * (float) i_198_)));
					if (f_223_ < -f_204_)
						return;
					float f_224_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_197_) + f_220_ + (((Class174_Sub2) this).aFloat10779 * (float) i_199_)));
					f_205_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_197_) + f_221_ + (((Class174_Sub2) this).aFloat10764 * (float) i_199_)));
					if (f_224_ < -f_205_)
						return;
					float f_225_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_196_) + f_220_ + (((Class174_Sub2) this).aFloat10779 * (float) i_199_)));
					f_206_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_196_) + f_221_ + (((Class174_Sub2) this).aFloat10764 * (float) i_199_)));
					if (f_225_ < -f_206_)
						return;
					f_207_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_222_ / f_203_));
					f_208_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_223_ / f_204_));
					f_209_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_224_ / f_205_));
					f_210_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_225_ / f_206_));
					if (((Class186) class186).aBool2218) {
						float f_226_ = f_222_ - ((Class186) class186).aFloat2177;
						if (f_226_ > 0.0F) {
							f = f_226_ / ((Class186) class186).aFloat2181;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_226_ = f_223_ - ((Class186) class186).aFloat2177;
						if (f_226_ > 0.0F) {
							f_200_ = f_226_ / ((Class186) class186).aFloat2181;
							if (f_200_ > 1.0F)
								f_200_ = 1.0F;
						}
						f_226_ = f_224_ - ((Class186) class186).aFloat2177;
						if (f_226_ > 0.0F) {
							f_201_ = f_226_ / ((Class186) class186).aFloat2181;
							if (f_201_ > 1.0F)
								f_201_ = 1.0F;
						}
						f_226_ = f_225_ - ((Class186) class186).aFloat2177;
						if (f_226_ > 0.0F) {
							f_202_ = f_226_ / ((Class186) class186).aFloat2181;
							if (f_202_ > 1.0F)
								f_202_ = 1.0F;
						}
					}
					float f_227_ = ((Class174_Sub2) this).aFloat10767 * (float) i_219_;
					float f_228_ = ((Class174_Sub2) this).aFloat10774 * (float) i_219_;
					float f_229_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_196_) + f_227_ + (((Class174_Sub2) this).aFloat10777 * (float) i_198_)));
					f_211_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_229_ / f_203_));
					float f_230_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_196_) + f_228_ + (((Class174_Sub2) this).aFloat10788 * (float) i_198_)));
					f_212_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_230_ / f_203_));
					float f_231_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_197_) + f_227_ + (((Class174_Sub2) this).aFloat10777 * (float) i_198_)));
					f_213_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_231_ / f_204_));
					float f_232_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_197_) + f_228_ + (((Class174_Sub2) this).aFloat10788 * (float) i_198_)));
					f_214_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_232_ / f_204_));
					float f_233_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_197_) + f_227_ + (((Class174_Sub2) this).aFloat10777 * (float) i_199_)));
					f_215_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_233_ / f_205_));
					float f_234_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_197_) + f_228_ + (((Class174_Sub2) this).aFloat10788 * (float) i_199_)));
					f_216_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_234_ / f_205_));
					float f_235_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_196_) + f_227_ + (((Class174_Sub2) this).aFloat10777 * (float) i_199_)));
					f_217_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_235_ / f_206_));
					float f_236_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_196_) + f_228_ + (((Class174_Sub2) this).aFloat10788 * (float) i_199_)));
					f_218_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_236_ / f_206_));
				} else {
					int i_237_ = anIntArrayArray2085[i][i_190_];
					int i_238_ = anIntArrayArray2085[i + 1][i_190_];
					int i_239_ = anIntArrayArray2085[i + 1][i_190_ + 1];
					int i_240_ = anIntArrayArray2085[i][i_190_ + 1];
					float f_241_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_196_) + (((Class174_Sub2) this).aFloat10775 * (float) i_237_) + (((Class174_Sub2) this).aFloat10779 * (float) i_198_)));
					f_203_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_196_) + (((Class174_Sub2) this).aFloat10768 * (float) i_237_) + (((Class174_Sub2) this).aFloat10764 * (float) i_198_)));
					if (f_241_ < -f_203_)
						return;
					float f_242_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_197_) + (((Class174_Sub2) this).aFloat10775 * (float) i_238_) + (((Class174_Sub2) this).aFloat10779 * (float) i_198_)));
					f_204_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_197_) + (((Class174_Sub2) this).aFloat10768 * (float) i_238_) + (((Class174_Sub2) this).aFloat10764 * (float) i_198_)));
					if (f_242_ < -f_204_)
						return;
					float f_243_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_197_) + (((Class174_Sub2) this).aFloat10775 * (float) i_239_) + (((Class174_Sub2) this).aFloat10779 * (float) i_199_)));
					f_205_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_197_) + (((Class174_Sub2) this).aFloat10768 * (float) i_239_) + (((Class174_Sub2) this).aFloat10764 * (float) i_199_)));
					if (f_243_ < -f_205_)
						return;
					float f_244_ = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_196_) + (((Class174_Sub2) this).aFloat10775 * (float) i_240_) + (((Class174_Sub2) this).aFloat10779 * (float) i_199_)));
					f_206_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_196_) + (((Class174_Sub2) this).aFloat10768 * (float) i_240_) + (((Class174_Sub2) this).aFloat10764 * (float) i_199_)));
					if (f_244_ < -f_206_)
						return;
					f_207_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_241_ / f_203_));
					f_208_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_242_ / f_204_));
					f_209_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_243_ / f_205_));
					f_210_ = (((Class143) class143).aFloat27 + (((Class143) class143).aFloat46 * f_244_ / f_206_));
					if (bool) {
						float f_245_ = f_241_ - ((Class186) class186).aFloat2177;
						if (f_245_ > 0.0F) {
							f_245_ /= ((Class186) class186).aFloat2181;
							if (f_245_ > 1.0F)
								f_245_ = 1.0F;
							f = f_245_;
							int i_246_ = (int) ((float) (((Class201) class201).aShort2392) * f_245_);
							if (i_246_ > 0)
								i_237_ -= i_246_;
						}
						f_245_ = f_242_ - ((Class186) class186).aFloat2177;
						if (f_245_ > 0.0F) {
							f_245_ /= ((Class186) class186).aFloat2181;
							if (f_245_ > 1.0F)
								f_245_ = 1.0F;
							f_200_ = f_245_;
							int i_247_ = (int) ((float) (((Class201) class201).aShort2397) * f_245_);
							if (i_247_ > 0)
								i_238_ -= i_247_;
						}
						f_245_ = f_243_ - ((Class186) class186).aFloat2177;
						if (f_245_ > 0.0F) {
							f_245_ /= ((Class186) class186).aFloat2181;
							if (f_245_ > 1.0F)
								f_245_ = 1.0F;
							f_201_ = f_245_;
							int i_248_ = (int) ((float) (((Class201) class201).aShort2398) * f_245_);
							if (i_248_ > 0)
								i_239_ -= i_248_;
						}
						f_245_ = f_244_ - ((Class186) class186).aFloat2177;
						if (f_245_ > 0.0F) {
							f_245_ /= ((Class186) class186).aFloat2181;
							if (f_245_ > 1.0F)
								f_245_ = 1.0F;
							f_202_ = f_245_;
							int i_249_ = (int) ((float) (((Class201) class201).aShort2391) * f_245_);
							if (i_249_ > 0)
								i_240_ -= i_249_;
						}
					} else if (((Class186) class186).aBool2218) {
						float f_250_ = f_241_ - ((Class186) class186).aFloat2177;
						if (f_250_ > 0.0F) {
							f = f_250_ / ((Class186) class186).aFloat2181;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_250_ = f_242_ - ((Class186) class186).aFloat2177;
						if (f_250_ > 0.0F) {
							f_200_ = f_250_ / ((Class186) class186).aFloat2181;
							if (f_200_ > 1.0F)
								f_200_ = 1.0F;
						}
						f_250_ = f_243_ - ((Class186) class186).aFloat2177;
						if (f_250_ > 0.0F) {
							f_201_ = f_250_ / ((Class186) class186).aFloat2181;
							if (f_201_ > 1.0F)
								f_201_ = 1.0F;
						}
						f_250_ = f_244_ - ((Class186) class186).aFloat2177;
						if (f_250_ > 0.0F) {
							f_202_ = f_250_ / ((Class186) class186).aFloat2181;
							if (f_202_ > 1.0F)
								f_202_ = 1.0F;
						}
					}
					float f_251_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_196_) + (((Class174_Sub2) this).aFloat10767 * (float) i_237_) + (((Class174_Sub2) this).aFloat10777 * (float) i_198_)));
					f_211_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_251_ / f_203_));
					float f_252_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_196_) + (((Class174_Sub2) this).aFloat10774 * (float) i_237_) + (((Class174_Sub2) this).aFloat10788 * (float) i_198_)));
					f_212_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_252_ / f_203_));
					float f_253_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_197_) + (((Class174_Sub2) this).aFloat10767 * (float) i_238_) + (((Class174_Sub2) this).aFloat10777 * (float) i_198_)));
					f_213_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_253_ / f_204_));
					float f_254_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_197_) + (((Class174_Sub2) this).aFloat10774 * (float) i_238_) + (((Class174_Sub2) this).aFloat10788 * (float) i_198_)));
					f_214_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_254_ / f_204_));
					float f_255_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_197_) + (((Class174_Sub2) this).aFloat10767 * (float) i_239_) + (((Class174_Sub2) this).aFloat10777 * (float) i_199_)));
					f_215_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_255_ / f_205_));
					float f_256_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_197_) + (((Class174_Sub2) this).aFloat10774 * (float) i_239_) + (((Class174_Sub2) this).aFloat10788 * (float) i_199_)));
					f_216_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_256_ / f_205_));
					float f_257_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_196_) + (((Class174_Sub2) this).aFloat10767 * (float) i_240_) + (((Class174_Sub2) this).aFloat10777 * (float) i_199_)));
					f_217_ = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_257_ / f_206_));
					float f_258_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_196_) + (((Class174_Sub2) this).aFloat10774 * (float) i_240_) + (((Class174_Sub2) this).aFloat10788 * (float) i_199_)));
					f_218_ = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_258_ / f_206_));
				}
				MaterialInformation class101 = null;
				int i_259_ = -1;
				if (((Class201) class201).aShort2401 != -1) {
					class101 = (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((Class201) class201).aShort2401 & 0xffff, 627291088));
					i_259_ = class101.textureId * 811137757;
				}
				boolean bool_260_ = class101 != null && method10003(class101.effectId);
				float f_261_ = f_200_ + f_201_ + f_202_;
				if (((f_215_ - f_217_) * (f_214_ - f_218_) - (f_216_ - f_218_) * (f_213_ - f_217_)) > 0.0F) {
					((Class143) class143).aBoolean20 = (f_215_ < 0.0F || f_217_ < 0.0F || f_213_ < 0.0F || f_215_ > (float) ((Class143) class143).anInt22 || f_217_ > (float) ((Class143) class143).anInt22 || (f_213_ > (float) ((Class143) class143).anInt22));
					if (f_261_ < 3.0F) {
						if (f_261_ > 0.0F) {
							if (i_259_ >= 0) {
								int i_262_ = -16777216;
								if (bool_260_)
									i_262_ = -1694498816;
								class143.method290(true, true, false, f_216_, f_218_, f_214_, f_215_, f_217_, f_213_, f_209_, f_210_, f_208_, f_205_, f_206_, f_204_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_262_ | (((Class201) class201).anInt2394 & 0xffffff), i_262_ | (((Class201) class201).anInt2395 & 0xffffff), i_262_ | (((Class201) class201).anInt2393 & 0xffffff), (((Class186) class186).anInt2191 * 219346091), f_201_ * 255.0F, f_202_ * 255.0F, f_200_ * 255.0F, ((Class201) class201).aShort2401 & 0xffff, i_259_);
							} else {
								if (bool_260_)
									((Class143) class143).anInt19 = 100;
								class143.method292(true, true, false, f_216_, f_218_, f_214_, f_215_, f_217_, f_213_, f_209_, f_210_, f_208_, (Class532.method6346(((Class201) class201).anInt2394, ((int) (f_201_ * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)), (Class532.method6346(((Class201) class201).anInt2395, ((int) (f_202_ * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)), (Class532.method6346(((Class201) class201).anInt2393, ((int) (f_200_ * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)));
								((Class143) class143).anInt19 = 0;
							}
						} else if (i_259_ >= 0) {
							int i_263_ = -16777216;
							if (bool_260_)
								i_263_ = -1694498816;
							class143.method290(true, true, false, f_216_, f_218_, f_214_, f_215_, f_217_, f_213_, f_209_, f_210_, f_208_, f_205_, f_206_, f_204_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_263_ | (((Class201) class201).anInt2394 & 0xffffff), i_263_ | (((Class201) class201).anInt2395 & 0xffffff), i_263_ | (((Class201) class201).anInt2393 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class201) class201).aShort2401 & 0xffff, i_259_);
						} else {
							if (bool_260_)
								((Class143) class143).anInt19 = 100;
							class143.method292(true, true, false, f_216_, f_218_, f_214_, f_215_, f_217_, f_213_, f_209_, f_210_, f_208_, ((Class201) class201).anInt2394, ((Class201) class201).anInt2395, ((Class201) class201).anInt2393);
							((Class143) class143).anInt19 = 0;
						}
					} else
						class143.method293(true, true, false, f_216_, f_218_, f_214_, f_215_, f_217_, f_213_, f_209_, f_210_, f_208_, (((Class186) class186).anInt2191 * 219346091));
				}
				f_261_ = f + f_200_ + f_202_;
				if (((f_211_ - f_213_) * (f_218_ - f_214_) - (f_212_ - f_214_) * (f_217_ - f_213_)) > 0.0F) {
					((Class143) class143).aBoolean20 = (f_211_ < 0.0F || f_213_ < 0.0F || f_217_ < 0.0F || f_211_ > (float) ((Class143) class143).anInt22 || f_213_ > (float) ((Class143) class143).anInt22 || (f_217_ > (float) ((Class143) class143).anInt22));
					if (f_261_ < 3.0F) {
						if (bool_260_)
							((Class143) class143).anInt19 = -1694498816;
						if (f_261_ > 0.0F) {
							if (i_259_ >= 0) {
								int i_264_ = -16777216;
								if (bool_260_)
									i_264_ = -1694498816;
								class143.method290(true, true, false, f_212_, f_214_, f_218_, f_211_, f_213_, f_217_, f_207_, f_208_, f_210_, f_203_, f_204_, f_206_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_264_ | (((Class201) class201).anInt2399 & 0xffffff), i_264_ | (((Class201) class201).anInt2393 & 0xffffff), i_264_ | (((Class201) class201).anInt2395 & 0xffffff), (((Class186) class186).anInt2191 * 219346091), f * 255.0F, f_200_ * 255.0F, f_202_ * 255.0F, ((Class201) class201).aShort2401 & 0xffff, i_259_);
							} else {
								if (bool_260_)
									((Class143) class143).anInt19 = 100;
								class143.method292(true, true, false, f_212_, f_214_, f_218_, f_211_, f_213_, f_217_, f_207_, f_208_, f_210_, (Class532.method6346(((Class201) class201).anInt2399, ((int) (f * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)), (Class532.method6346(((Class201) class201).anInt2393, ((int) (f_200_ * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)), (Class532.method6346(((Class201) class201).anInt2395, ((int) (f_202_ * 255.0F) << 24 | (((Class186) class186).anInt2191 * 219346091)), -95803483)));
								((Class143) class143).anInt19 = 0;
							}
						} else if (i_259_ >= 0) {
							int i_265_ = -16777216;
							if (bool_260_)
								i_265_ = -1694498816;
							class143.method290(true, true, false, f_212_, f_214_, f_218_, f_211_, f_213_, f_217_, f_207_, f_208_, f_210_, f_203_, f_204_, f_206_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_265_ | (((Class201) class201).anInt2399 & 0xffffff), i_265_ | (((Class201) class201).anInt2393 & 0xffffff), i_265_ | (((Class201) class201).anInt2395 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class201) class201).aShort2401 & 0xffff, i_259_);
						} else {
							if (bool_260_)
								((Class143) class143).anInt19 = 100;
							class143.method292(true, true, false, f_212_, f_214_, f_218_, f_211_, f_213_, f_217_, f_207_, f_208_, f_210_, ((Class201) class201).anInt2399, ((Class201) class201).anInt2393, ((Class201) class201).anInt2395);
							((Class143) class143).anInt19 = 0;
						}
					} else
						class143.method293(true, true, false, f_212_, f_214_, f_218_, f_211_, f_213_, f_217_, f_207_, f_208_, f_210_, (((Class186) class186).anInt2191 * 219346091));
				}
			}
		} else {
			Class146 class146 = ((Class174_Sub2) this).aClass146ArrayArray10778[i][i_190_];
			if (class146 != null) {
				if (i_195_ != 0) {
					if ((((Class146) class146).aByte1674 & 0x4) != 0) {
						if ((i_195_ & 0x1) != 0)
							return;
					} else if ((i_195_ & 0x2) != 0)
						return;
				}
				for (int i_266_ = 0; i_266_ < ((Class146) class146).aShort1672; i_266_++) {
					int i_267_ = (((Class146) class146).aShortArray1673[i_266_] + (i << anInt2088 * 212267571));
					int i_268_ = ((Class146) class146).aShortArray1675[i_266_];
					int i_269_ = (((Class146) class146).aShortArray1676[i_266_] + (i_190_ << anInt2088 * 212267571));
					float f = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_267_) + (((Class174_Sub2) this).aFloat10775 * (float) i_268_) + (((Class174_Sub2) this).aFloat10779 * (float) i_269_)));
					float f_270_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_267_) + (((Class174_Sub2) this).aFloat10768 * (float) i_268_) + (((Class174_Sub2) this).aFloat10764 * (float) i_269_)));
					if (f < -f_270_)
						return;
					float f_271_ = (((Class143) class143).aFloat27 + ((Class143) class143).aFloat46 * f / f_270_);
					fs_194_[i_266_] = 0.0F;
					if (bool) {
						float f_272_ = f - ((Class186) class186).aFloat2177;
						if (f_272_ > 0.0F) {
							f_272_ /= ((Class186) class186).aFloat2181;
							if (f_272_ > 1.0F)
								f_272_ = 1.0F;
							fs_194_[i_266_] = f_272_;
							int i_273_ = (int) ((float) (((Class146) class146).aShortArray1677[i_266_]) * f_272_);
							if (i_273_ > 0)
								i_268_ -= i_273_;
						}
					} else if (((Class186) class186).aBool2218) {
						float f_274_ = f - ((Class186) class186).aFloat2177;
						if (f_274_ > 0.0F) {
							fs_194_[i_266_] = f_274_ / ((Class186) class186).aFloat2181;
							if (fs_194_[i_266_] > 1.0F)
								fs_194_[i_266_] = 1.0F;
						}
					}
					float f_275_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_267_) + (((Class174_Sub2) this).aFloat10767 * (float) i_268_) + (((Class174_Sub2) this).aFloat10777 * (float) i_269_)));
					float f_276_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_267_) + (((Class174_Sub2) this).aFloat10774 * (float) i_268_) + (((Class174_Sub2) this).aFloat10788 * (float) i_269_)));
					fs[i_266_] = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_275_ / f_270_));
					fs_191_[i_266_] = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_276_ / f_270_));
					fs_192_[i_266_] = f_271_;
					fs_193_[i_266_] = f_270_;
				}
				if (((Class146) class146).aShortArray1679 != null) {
					for (int i_277_ = 0; i_277_ < ((Class146) class146).aShort1671; i_277_++) {
						int i_278_ = i_277_ * 3;
						int i_279_ = i_278_ + 1;
						int i_280_ = i_279_ + 1;
						float f = fs[i_278_];
						float f_281_ = fs[i_279_];
						float f_282_ = fs[i_280_];
						float f_283_ = fs_191_[i_278_];
						float f_284_ = fs_191_[i_279_];
						float f_285_ = fs_191_[i_280_];
						float f_286_ = (fs_194_[i_278_] + fs_194_[i_279_] + fs_194_[i_280_]);
						if (((f - f_281_) * (f_285_ - f_284_) - (f_283_ - f_284_) * (f_282_ - f_281_)) > 0.0F) {
							((Class143) class143).aBoolean20 = (f < 0.0F || f_281_ < 0.0F || f_282_ < 0.0F || f > (float) (((Class143) class143).anInt22) || f_281_ > (float) (((Class143) class143).anInt22) || f_282_ > (float) (((Class143) class143).anInt22));
							MaterialInformation class101 = null;
							int i_287_ = -1;
							if (((Class146) class146).aShortArray1679[i_277_] != -1) {
								class101 = (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture((((Class146) class146).aShortArray1679[i_277_]) & 0xffff, 1748171952));
								i_287_ = class101.textureId * 811137757;
							}
							if (f_286_ < 3.0F) {
								if (f_286_ > 0.0F) {
									if (i_287_ != -1) {
										int i_288_ = -16777216;
										if (i_287_ != -1 && method10003(class101.effectId))
											i_288_ = -1694498816;
										class143.method290(true, true, false, f_283_, f_284_, f_285_, f, f_281_, f_282_, fs_192_[i_278_], fs_192_[i_279_], fs_192_[i_280_], fs_193_[i_278_], fs_193_[i_279_], fs_193_[i_280_], ((float) (((Class146) class146).aShortArray1673[i_278_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1673[i_279_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1673[i_280_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_278_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_279_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_280_]) / (float) (anInt2087 * 2129890771)), i_288_ | (((Class146) class146).anIntArray1680[i_278_]) & 0xffffff, i_288_ | (((Class146) class146).anIntArray1680[i_279_]) & 0xffffff, i_288_ | (((Class146) class146).anIntArray1680[i_280_]) & 0xffffff, (((Class186) class186).anInt2191 * 219346091), fs_194_[i_278_] * 255.0F, fs_194_[i_279_] * 255.0F, fs_194_[i_280_] * 255.0F, ((((Class146) class146).aShortArray1679[i_277_]) & 0xffff), i_287_);
									} else if (((((Class146) class146).anIntArray1680[i_278_]) & 0xffffff) != 0) {
										if (i_287_ != -1 && method10003(class101.effectId))
											((Class143) class143).anInt19 = -1694498816;
										class143.method292(true, true, false, f_283_, f_284_, f_285_, f, f_281_, f_282_, fs_192_[i_278_], fs_192_[i_279_], fs_192_[i_280_], (Class532.method6346((((Class146) class146).anIntArray1680[i_278_]), ((int) (fs_194_[i_278_] * 255.0F) << 24 | (((Class186) class186).anInt2191) * 219346091), -95803483)), (Class532.method6346((((Class146) class146).anIntArray1680[i_279_]), ((int) (fs_194_[i_279_] * 255.0F) << 24 | (((Class186) class186).anInt2191) * 219346091), -95803483)), (Class532.method6346((((Class146) class146).anIntArray1680[i_280_]), ((int) (fs_194_[i_280_] * 255.0F) << 24 | (((Class186) class186).anInt2191) * 219346091), -95803483)));
										((Class143) class143).anInt19 = 0;
									}
								} else if (i_287_ != -1) {
									int i_289_ = -16777216;
									if (i_287_ != -1 && method10003(class101.effectId))
										i_289_ = -1694498816;
									class143.method290(true, true, false, f_283_, f_284_, f_285_, f, f_281_, f_282_, fs_192_[i_278_], fs_192_[i_279_], fs_192_[i_280_], fs_193_[i_278_], fs_193_[i_279_], fs_193_[i_280_], ((float) (((Class146) class146).aShortArray1673[i_278_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1673[i_279_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1673[i_280_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_278_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_279_]) / (float) (anInt2087 * 2129890771)), ((float) (((Class146) class146).aShortArray1676[i_280_]) / (float) (anInt2087 * 2129890771)), i_289_ | ((((Class146) class146).anIntArray1680[i_278_]) & 0xffffff), i_289_ | ((((Class146) class146).anIntArray1680[i_279_]) & 0xffffff), i_289_ | ((((Class146) class146).anIntArray1680[i_280_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (((Class146) class146).aShortArray1679[i_277_]) & 0xffff, i_287_);
								} else if (((((Class146) class146).anIntArray1680[i_278_]) & 0xffffff) != 0) {
									if (i_287_ != -1 && method10003(class101.effectId))
										((Class143) class143).anInt19 = -1694498816;
									class143.method292(true, true, false, f_283_, f_284_, f_285_, f, f_281_, f_282_, fs_192_[i_278_], fs_192_[i_279_], fs_192_[i_280_], (((Class146) class146).anIntArray1680[i_278_]), (((Class146) class146).anIntArray1680[i_279_]), (((Class146) class146).anIntArray1680[i_280_]));
									((Class143) class143).anInt19 = 0;
								}
							} else
								class143.method293(true, true, false, f_283_, f_284_, f_285_, f, f_281_, f_282_, fs_192_[i_278_], fs_192_[i_279_], fs_192_[i_280_], (((Class186) class186).anInt2191) * 219346091);
						}
					}
				} else {
					for (int i_290_ = 0; i_290_ < ((Class146) class146).aShort1671; i_290_++) {
						int i_291_ = i_290_ * 3;
						int i_292_ = i_291_ + 1;
						int i_293_ = i_292_ + 1;
						float f = fs[i_291_];
						float f_294_ = fs[i_292_];
						float f_295_ = fs[i_293_];
						float f_296_ = fs_191_[i_291_];
						float f_297_ = fs_191_[i_292_];
						float f_298_ = fs_191_[i_293_];
						float f_299_ = (fs_194_[i_291_] + fs_194_[i_292_] + fs_194_[i_293_]);
						if (((f - f_294_) * (f_298_ - f_297_) - (f_296_ - f_297_) * (f_295_ - f_294_)) > 0.0F) {
							((Class143) class143).aBoolean20 = (f < 0.0F || f_294_ < 0.0F || f_295_ < 0.0F || f > (float) (((Class143) class143).anInt22) || f_294_ > (float) (((Class143) class143).anInt22) || f_295_ > (float) (((Class143) class143).anInt22));
							if (f_299_ < 3.0F) {
								if (f_299_ > 0.0F) {
									if (((((Class146) class146).anIntArray1680[i_291_]) & 0xffffff) != 0)
										class143.method292(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_192_[i_291_], fs_192_[i_292_], fs_192_[i_293_], (Class57.method1001((((Class146) class146).anIntArray1680[i_291_]), (((Class186) class186).anInt2191 * 219346091), fs_194_[i_291_] * 255.0F, 295763539)), (Class57.method1001((((Class146) class146).anIntArray1680[i_292_]), (((Class186) class186).anInt2191 * 219346091), fs_194_[i_292_] * 255.0F, -1286449344)), (Class57.method1001((((Class146) class146).anIntArray1680[i_293_]), (((Class186) class186).anInt2191 * 219346091), fs_194_[i_293_] * 255.0F, -691289112)));
								} else if (((((Class146) class146).anIntArray1680[i_291_]) & 0xffffff) != 0)
									class143.method292(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_192_[i_291_], fs_192_[i_292_], fs_192_[i_293_], (((Class146) class146).anIntArray1680[i_291_]), (((Class146) class146).anIntArray1680[i_292_]), (((Class146) class146).anIntArray1680[i_293_]));
							} else
								class143.method293(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_192_[i_291_], fs_192_[i_292_], fs_192_[i_293_], (((Class186) class186).anInt2191) * 219346091);
						}
					}
				}
			}
		}
	}

	void method10002(int i, int i_300_, boolean bool, Class186 class186, Class143 class143, float[] fs, float[] fs_301_, float[] fs_302_, float[] fs_303_, float[] fs_304_, int i_305_) {
		Class145 class145 = ((Class174_Sub2) this).aClass145ArrayArray10766[i][i_300_];
		if (i_305_ == 0 || (i_305_ & 0x2) == 0) {
			if (class145 != null) {
				for (int i_306_ = 0; i_306_ < ((Class145) class145).aShort1661; i_306_++) {
					int i_307_ = (((Class145) class145).aShortArray1664[i_306_] + (i << anInt2088 * 212267571));
					int i_308_ = ((Class145) class145).aShortArray1662[i_306_];
					int i_309_ = (((Class145) class145).aShortArray1660[i_306_] + (i_300_ << anInt2088 * 212267571));
					float f = (((Class174_Sub2) this).aFloat10783 + ((((Class174_Sub2) this).aFloat10771 * (float) i_307_) + (((Class174_Sub2) this).aFloat10775 * (float) i_308_) + (((Class174_Sub2) this).aFloat10779 * (float) i_309_)));
					float f_310_ = (((Class174_Sub2) this).aFloat10784 + ((((Class174_Sub2) this).aFloat10772 * (float) i_307_) + (((Class174_Sub2) this).aFloat10768 * (float) i_308_) + (((Class174_Sub2) this).aFloat10764 * (float) i_309_)));
					if (f < -f_310_)
						return;
					fs_304_[i_306_] = 0.0F;
					if (bool) {
						float f_311_ = f - ((Class186) class186).aFloat2177;
						if (f_311_ > 0.0F) {
							f_311_ /= ((Class186) class186).aFloat2181;
							if (f_311_ > 1.0F)
								f_311_ = 1.0F;
							fs_304_[i_306_] = f_311_;
							int i_312_ = (int) ((float) (((Class145) class145).aShortArray1663[i_306_]) * f_311_);
							if (i_312_ > 0)
								i_308_ -= i_312_;
						}
					} else if (((Class186) class186).aBool2218) {
						float f_313_ = f - ((Class186) class186).aFloat2177;
						if (f_313_ > 0.0F) {
							fs_304_[i_306_] = f_313_ / ((Class186) class186).aFloat2181;
							if (fs_304_[i_306_] > 1.0F)
								fs_304_[i_306_] = 1.0F;
						}
					}
					float f_314_ = (((Class174_Sub2) this).aFloat10781 + ((((Class174_Sub2) this).aFloat10769 * (float) i_307_) + (((Class174_Sub2) this).aFloat10767 * (float) i_308_) + (((Class174_Sub2) this).aFloat10777 * (float) i_309_)));
					float f_315_ = (((Class174_Sub2) this).aFloat10782 + ((((Class174_Sub2) this).aFloat10770 * (float) i_307_) + (((Class174_Sub2) this).aFloat10774 * (float) i_308_) + (((Class174_Sub2) this).aFloat10788 * (float) i_309_)));
					fs[i_306_] = (((Class143) class143).aFloat23 + (((Class143) class143).aFloat17 * f_314_ / f_310_));
					fs_301_[i_306_] = (((Class143) class143).aFloat25 + (((Class143) class143).aFloat26 * f_315_ / f_310_));
					fs_302_[i_306_] = (((Class143) class143).aFloat27 + ((Class143) class143).aFloat46 * f / f_310_);
					fs_303_[i_306_] = f_310_;
				}
				float f = (float) (anInt2087 * 2129890771);
				for (int i_316_ = 0; i_316_ < ((Class145) class145).aShort1666; i_316_++) {
					int i_317_ = i_316_ * 3;
					int i_318_ = i_317_ + 1;
					int i_319_ = i_318_ + 1;
					float f_320_ = fs[i_317_];
					float f_321_ = fs[i_318_];
					float f_322_ = fs[i_319_];
					float f_323_ = fs_301_[i_317_];
					float f_324_ = fs_301_[i_318_];
					float f_325_ = fs_301_[i_319_];
					if (((f_320_ - f_321_) * (f_325_ - f_324_) - (f_323_ - f_324_) * (f_322_ - f_321_)) > 0.0F) {
						((Class143) class143).aBoolean20 = (f_320_ < 0.0F || f_321_ < 0.0F || f_322_ < 0.0F || (f_320_ > (float) ((Class143) class143).anInt22) || (f_321_ > (float) ((Class143) class143).anInt22) || (f_322_ > (float) ((Class143) class143).anInt22));
						if (fs_304_[i_317_] + fs_304_[i_318_] + fs_304_[i_319_] < 3.0F) {
							int i_326_ = i << anInt2088 * 212267571;
							int i_327_ = i_300_ << anInt2088 * 212267571;
							if ((((Class145) class145).anIntArray1668[i_317_] & 0xffffff) != 0) {
								if ((((Class145) class145).aShortArray1665[i_317_]) != -1 && (((Class145) class145).aShortArray1665[i_318_]) != -1 && (((Class145) class145).aShortArray1665[i_319_]) != -1) {
									if (((((Class145) class145).aShortArray1665[i_317_]) == (((Class145) class145).aShortArray1665[i_318_])) && ((((Class145) class145).aShortArray1665[i_317_]) == (((Class145) class145).aShortArray1665[i_319_])) && ((((Class145) class145).aShortArray1667[i_317_]) == (((Class145) class145).aShortArray1667[i_318_])) && ((((Class145) class145).aShortArray1667[i_317_]) == (((Class145) class145).aShortArray1667[i_319_])))
										class143.method290(true, true, false, f_323_, f_324_, f_325_, f_320_, f_321_, f_322_, fs_302_[i_317_], fs_302_[i_318_], fs_302_[i_319_], fs_303_[i_317_], fs_303_[i_318_], fs_303_[i_319_], ((float) (i_326_ + (((Class145) class145).aShortArray1664[i_317_])) / (float) (((Class145) class145).aShortArray1667[i_317_])), ((float) (i_326_ + (((Class145) class145).aShortArray1664[i_318_])) / (float) (((Class145) class145).aShortArray1667[i_318_])), ((float) (i_326_ + (((Class145) class145).aShortArray1664[i_319_])) / (float) (((Class145) class145).aShortArray1667[i_319_])), ((float) (i_327_ + (((Class145) class145).aShortArray1660[i_317_])) / (float) (((Class145) class145).aShortArray1667[i_317_])), ((float) (i_327_ + (((Class145) class145).aShortArray1660[i_318_])) / (float) (((Class145) class145).aShortArray1667[i_318_])), ((float) (i_327_ + (((Class145) class145).aShortArray1660[i_319_])) / (float) (((Class145) class145).aShortArray1667[i_319_])), (((Class145) class145).anIntArray1668[i_317_]), (((Class145) class145).anIntArray1668[i_318_]), (((Class145) class145).anIntArray1668[i_319_]), (((Class186) class186).anInt2191 * 219346091), fs_304_[i_317_] * 255.0F, fs_304_[i_318_] * 255.0F, fs_304_[i_319_] * 255.0F, ((((Class145) class145).aShortArray1665[i_317_]) & 0xffff), (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((((Class145) class145).aShortArray1665[i_317_]) & 0xffff), 1028244215).textureId) * 811137757);
									else
										class143.method2462(true, true, false, f_323_, f_324_, f_325_, f_320_, f_321_, f_322_, fs_302_[i_317_], fs_302_[i_318_], fs_302_[i_319_], fs_303_[i_317_], fs_303_[i_318_], fs_303_[i_319_], (float) (i_326_ + (((Class145) class145).aShortArray1664[i_317_])) / f, (float) (i_326_ + (((Class145) class145).aShortArray1664[i_318_])) / f, (float) (i_326_ + (((Class145) class145).aShortArray1664[i_319_])) / f, (float) (i_327_ + (((Class145) class145).aShortArray1660[i_317_])) / f, (float) (i_327_ + (((Class145) class145).aShortArray1660[i_318_])) / f, (float) (i_327_ + (((Class145) class145).aShortArray1660[i_319_])) / f, (((Class145) class145).anIntArray1668[i_317_]), (((Class145) class145).anIntArray1668[i_318_]), (((Class145) class145).anIntArray1668[i_319_]), (((Class186) class186).anInt2191 * 219346091), fs_304_[i_317_] * 255.0F, fs_304_[i_318_] * 255.0F, fs_304_[i_319_] * 255.0F, ((((Class145) class145).aShortArray1665[i_317_]) & 0xffff), (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((((Class145) class145).aShortArray1665[i_317_]) & 0xffff), -204783275).textureId) * 811137757, f / (float) (((Class145) class145).aShortArray1667[i_317_]), ((((Class145) class145).aShortArray1665[i_318_]) & 0xffff), (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((((Class145) class145).aShortArray1665[i_318_]) & 0xffff), 477761379).textureId) * 811137757, f / (float) (((Class145) class145).aShortArray1667[i_318_]), ((((Class145) class145).aShortArray1665[i_319_]) & 0xffff), (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(((((Class145) class145).aShortArray1665[i_319_]) & 0xffff), -675827923).textureId) * 811137757, f / (float) (((Class145) class145).aShortArray1667[i_319_]));
								} else if ((fs_304_[i_317_] + fs_304_[i_318_] + fs_304_[i_319_]) > 0.0F)
									class143.method292(true, true, false, f_323_, f_324_, f_325_, f_320_, f_321_, f_322_, fs_302_[i_317_], fs_302_[i_318_], fs_302_[i_319_], (Class57.method1001((((Class145) class145).anIntArray1668[i_317_]), (((Class186) class186).anInt2191 * 219346091), fs_304_[i_317_] * 255.0F, -66608165)), (Class57.method1001((((Class145) class145).anIntArray1668[i_318_]), (((Class186) class186).anInt2191 * 219346091), fs_304_[i_318_] * 255.0F, -1816878015)), (Class57.method1001((((Class145) class145).anIntArray1668[i_319_]), (((Class186) class186).anInt2191 * 219346091), fs_304_[i_319_] * 255.0F, -139264774)));
								else
									class143.method292(true, true, false, f_323_, f_324_, f_325_, f_320_, f_321_, f_322_, fs_302_[i_317_], fs_302_[i_318_], fs_302_[i_319_], (((Class145) class145).anIntArray1668[i_317_]), (((Class145) class145).anIntArray1668[i_318_]), (((Class145) class145).anIntArray1668[i_319_]));
							}
						} else
							class143.method293(true, true, false, f_323_, f_324_, f_325_, f_320_, f_321_, f_322_, fs_302_[i_317_], fs_302_[i_318_], fs_302_[i_319_], (((Class186) class186).anInt2191) * 219346091);
					}
				}
			}
		}
	}

	boolean method10003(int i) {
		if ((((Class174_Sub2) this).anInt10759 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public boolean method2737(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_328_, int i_329_, int i_330_, boolean bool) {
		return false;
	}

	void method10004(int i, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, boolean[][] bools, Class186 class186, Class143 class143, float[] fs, float[] fs_337_) {
		int i_338_ = (i_336_ - i_334_) * i_332_ / 256;
		int i_339_ = i_332_ >> 8;
		boolean bool = ((Class186) class186).aBoolean207;
		((Class174_Sub2) this).aClass106_Sub2_10776.method1763(false);
		((Class143) class143).aBoolean16 = false;
		((Class143) class143).aBoolean48 = false;
		int i_340_ = i;
		int i_341_ = i_331_ + i_338_;
		for (int i_342_ = i_333_; i_342_ < i_335_; i_342_++) {
			for (int i_343_ = i_334_; i_343_ < i_336_; i_343_++) {
				if (bools[i_342_ - i_333_][i_343_ - i_334_]) {
					if ((((Class174_Sub2) this).aClass152ArrayArray10789[i_342_][i_343_]) != null) {
						Class152 class152 = (((Class174_Sub2) this).aClass152ArrayArray10789[i_342_][i_343_]);
						if (((Class152) class152).aShort1708 != -1 && (((Class152) class152).aByte1705 & 0x2) == 0 && ((Class152) class152).anInt1709 == -1) {
							int i_344_ = (((Class174_Sub2) this).aClass106_Sub2_10776.method5206(((Class152) class152).aShort1708 & 0xffff));
							class143.method299(true, true, false, (float) (i_341_ - i_339_), (float) (i_341_ - i_339_), (float) i_341_, (float) (i_340_ + i_339_), (float) i_340_, (float) (i_340_ + i_339_), 100.0F, 100.0F, 100.0F, (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1706) & 0xffff), -1601124661), (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1707) & 0xffff), -1601124661), (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1703) & 0xffff), -1601124661));
							class143.method299(true, true, false, (float) i_341_, (float) i_341_, (float) (i_341_ - i_339_), (float) i_340_, (float) (i_340_ + i_339_), (float) i_340_, 100.0F, 100.0F, 100.0F, (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1704) & 0xffff), -1601124661), (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1703) & 0xffff), -1601124661), (float) Class416.method5100(i_344_, ((((Class152) class152).aShort1707) & 0xffff), -1601124661));
						} else if (((Class152) class152).anInt1709 == -1) {
							class143.method299(true, true, false, (float) (i_341_ - i_339_), (float) (i_341_ - i_339_), (float) i_341_, (float) (i_340_ + i_339_), (float) i_340_, (float) (i_340_ + i_339_), 100.0F, 100.0F, 100.0F, (float) (((Class152) class152).aShort1706 & 0xffff), (float) (((Class152) class152).aShort1707 & 0xffff), (float) (((Class152) class152).aShort1703 & 0xffff));
							class143.method299(true, true, false, (float) i_341_, (float) i_341_, (float) (i_341_ - i_339_), (float) i_340_, (float) (i_340_ + i_339_), (float) i_340_, 100.0F, 100.0F, 100.0F, (float) (((Class152) class152).aShort1704 & 0xffff), (float) (((Class152) class152).aShort1703 & 0xffff), (float) (((Class152) class152).aShort1707 & 0xffff));
						} else {
							int i_345_ = ((Class152) class152).anInt1709;
							class143.method299(true, true, false, (float) (i_341_ - i_339_), (float) (i_341_ - i_339_), (float) i_341_, (float) (i_340_ + i_339_), (float) i_340_, (float) (i_340_ + i_339_), 100.0F, 100.0F, 100.0F, (float) i_345_, (float) i_345_, (float) i_345_);
							class143.method299(true, true, false, (float) i_341_, (float) i_341_, (float) (i_341_ - i_339_), (float) i_340_, (float) (i_340_ + i_339_), (float) i_340_, 100.0F, 100.0F, 100.0F, (float) i_345_, (float) i_345_, (float) i_345_);
						}
					} else if ((((Class174_Sub2) this).aClass199ArrayArray10765[i_342_][i_343_]) != null) {
						Class199 class199 = (((Class174_Sub2) this).aClass199ArrayArray10765[i_342_][i_343_]);
						for (int i_346_ = 0; i_346_ < ((Class199) class199).aShort2365; i_346_++) {
							fs[i_346_] = (float) (i_340_ + ((((Class199) class199).aShortArray2367[i_346_]) * i_339_ / (anInt2087 * 2129890771)));
							fs_337_[i_346_] = (float) (i_341_ - ((((Class199) class199).aShortArray2364[i_346_]) * i_339_ / (anInt2087 * 2129890771)));
						}
						for (int i_347_ = 0; i_347_ < ((Class199) class199).aShort2370; i_347_++) {
							short i_348_ = (((Class199) class199).aShortArray2368[i_347_]);
							short i_349_ = (((Class199) class199).aShortArray2372[i_347_]);
							short i_350_ = (((Class199) class199).aShortArray2373[i_347_]);
							float f = fs[i_348_];
							float f_351_ = fs[i_349_];
							float f_352_ = fs[i_350_];
							float f_353_ = fs_337_[i_348_];
							float f_354_ = fs_337_[i_349_];
							float f_355_ = fs_337_[i_350_];
							if (((Class199) class199).anIntArray2371 != null && (((Class199) class199).anIntArray2371[i_347_]) != -1) {
								int i_356_ = (((Class199) class199).anIntArray2371[i_347_]);
								class143.method299(true, true, false, f_353_, f_354_, f_355_, f, f_351_, f_352_, 100.0F, 100.0F, 100.0F, (float) (Class416.method5100(i_356_, (((Class199) class199).aShortArray2369[i_348_]), -1601124661)), (float) (Class416.method5100(i_356_, (((Class199) class199).aShortArray2369[i_349_]), -1601124661)), (float) (Class416.method5100(i_356_, (((Class199) class199).aShortArray2369[i_350_]), -1601124661)));
							} else if ((((Class199) class199).aShortArray2374 != null) && (((Class199) class199).aShortArray2374[i_347_]) != -1) {
								int i_357_ = (((Class174_Sub2) this).aClass106_Sub2_10776.method5206((((Class199) class199).aShortArray2374[i_347_]) & 0xffff));
								class143.method299(true, true, false, f_353_, f_354_, f_355_, f, f_351_, f_352_, 100.0F, 100.0F, 100.0F, (float) (Class416.method5100(i_357_, (((Class199) class199).aShortArray2369[i_348_]), -1601124661)), (float) (Class416.method5100(i_357_, (((Class199) class199).aShortArray2369[i_349_]), -1601124661)), (float) (Class416.method5100(i_357_, (((Class199) class199).aShortArray2369[i_350_]), -1601124661)));
							} else {
								int i_358_ = (((Class199) class199).anIntArray2376[i_347_]);
								class143.method299(true, true, false, f_353_, f_354_, f_355_, f, f_351_, f_352_, 100.0F, 100.0F, 100.0F, (float) (Class416.method5100(i_358_, (((Class199) class199).aShortArray2369[i_348_]), -1601124661)), (float) (Class416.method5100(i_358_, (((Class199) class199).aShortArray2369[i_349_]), -1601124661)), (float) (Class416.method5100(i_358_, (((Class199) class199).aShortArray2369[i_350_]), -1601124661)));
							}
						}
					}
				}
				i_341_ -= i_339_;
			}
			i_341_ = i_331_ + i_338_;
			i_340_ += i_339_;
		}
		((Class143) class143).aBoolean16 = true;
		((Class174_Sub2) this).aClass106_Sub2_10776.method1763(bool);
	}

	void method10005(int i, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, boolean[][] bools, Class186 class186, Class143 class143, float[] fs, float[] fs_365_) {
		int i_366_ = (i_364_ - i_362_) * i_360_ / 256;
		int i_367_ = i_360_ >> 8;
		boolean bool = ((Class186) class186).aBoolean207;
		((Class174_Sub2) this).aClass106_Sub2_10776.method1763(false);
		((Class143) class143).aBoolean16 = false;
		((Class143) class143).aBoolean48 = false;
		int i_368_ = i;
		int i_369_ = i_359_ + i_366_;
		for (int i_370_ = i_361_; i_370_ < i_363_; i_370_++) {
			for (int i_371_ = i_362_; i_371_ < i_364_; i_371_++) {
				if (bools[i_370_ - i_361_][i_371_ - i_362_]) {
					if (((Class174_Sub2) this).aClass201ArrayArray10780 != null) {
						if ((((Class174_Sub2) this).aClass201ArrayArray10780[i_370_][i_371_]) != null) {
							Class201 class201 = (((Class174_Sub2) this).aClass201ArrayArray10780[i_370_][i_371_]);
							if (((Class201) class201).aShort2401 != -1 && (((Class201) class201).aByte2400 & 0x2) == 0 && ((Class201) class201).anInt2396 == 0) {
								int i_372_ = (((Class174_Sub2) this).aClass106_Sub2_10776.method5206(((Class201) class201).aShort2401 & 0xffff));
								class143.method299(true, true, false, (float) (i_369_ - i_367_), (float) (i_369_ - i_367_), (float) i_369_, (float) (i_368_ + i_367_), (float) i_368_, (float) (i_368_ + i_367_), 100.0F, 100.0F, 100.0F, (float) Class416.method5100(i_372_, (((Class201) class201).anInt2394), -1601124661), (float) Class416.method5100(i_372_, (((Class201) class201).anInt2395), -1601124661), (float) Class416.method5100(i_372_, (((Class201) class201).anInt2393), -1601124661));
								class143.method299(true, true, false, (float) i_369_, (float) i_369_, (float) (i_369_ - i_367_), (float) i_368_, (float) (i_368_ + i_367_), (float) i_368_, 100.0F, 100.0F, 100.0F, (float) Class416.method5100(i_372_, (((Class201) class201).anInt2399), -1601124661), (float) Class416.method5100(i_372_, (((Class201) class201).anInt2393), -1601124661), (float) Class416.method5100(i_372_, (((Class201) class201).anInt2395), -1601124661));
							} else if (((Class201) class201).anInt2396 == 0) {
								class143.method292(true, true, false, (float) (i_369_ - i_367_), (float) (i_369_ - i_367_), (float) i_369_, (float) (i_368_ + i_367_), (float) i_368_, (float) (i_368_ + i_367_), 100.0F, 100.0F, 100.0F, ((Class201) class201).anInt2394, ((Class201) class201).anInt2395, ((Class201) class201).anInt2393);
								class143.method292(true, true, false, (float) i_369_, (float) i_369_, (float) (i_369_ - i_367_), (float) i_368_, (float) (i_368_ + i_367_), (float) i_368_, 100.0F, 100.0F, 100.0F, ((Class201) class201).anInt2399, ((Class201) class201).anInt2393, ((Class201) class201).anInt2395);
							} else {
								int i_373_ = ((Class201) class201).anInt2396;
								class143.method292(true, true, false, (float) (i_369_ - i_367_), (float) (i_369_ - i_367_), (float) i_369_, (float) (i_368_ + i_367_), (float) i_368_, (float) (i_368_ + i_367_), 100.0F, 100.0F, 100.0F, Class532.method6346(i_373_, (((Class201) class201).anInt2394 & ~0xffffff), -95803483), Class532.method6346(i_373_, (((Class201) class201).anInt2395 & ~0xffffff), -95803483), Class532.method6346(i_373_, (((Class201) class201).anInt2393 & ~0xffffff), -95803483));
								class143.method292(true, true, false, (float) i_369_, (float) i_369_, (float) (i_369_ - i_367_), (float) i_368_, (float) (i_368_ + i_367_), (float) i_368_, 100.0F, 100.0F, 100.0F, Class532.method6346(i_373_, (((Class201) class201).anInt2399 & ~0xffffff), -95803483), Class532.method6346(i_373_, (((Class201) class201).anInt2393 & ~0xffffff), -95803483), Class532.method6346(i_373_, (((Class201) class201).anInt2395 & ~0xffffff), -95803483));
							}
						} else if ((((Class174_Sub2) this).aClass146ArrayArray10778[i_370_][i_371_]) != null) {
							Class146 class146 = (((Class174_Sub2) this).aClass146ArrayArray10778[i_370_][i_371_]);
							for (int i_374_ = 0; i_374_ < ((Class146) class146).aShort1672; i_374_++) {
								fs[i_374_] = (float) (i_368_ + ((((Class146) class146).aShortArray1673[i_374_]) * i_367_ / (anInt2087 * 2129890771)));
								fs_365_[i_374_] = (float) (i_369_ - ((((Class146) class146).aShortArray1676[i_374_]) * i_367_ / (anInt2087 * 2129890771)));
							}
							for (int i_375_ = 0; i_375_ < ((Class146) class146).aShort1671; i_375_++) {
								int i_376_ = i_375_ * 3;
								int i_377_ = i_376_ + 1;
								int i_378_ = i_377_ + 1;
								float f = fs[i_376_];
								float f_379_ = fs[i_377_];
								float f_380_ = fs[i_378_];
								float f_381_ = fs_365_[i_376_];
								float f_382_ = fs_365_[i_377_];
								float f_383_ = fs_365_[i_378_];
								if ((((Class146) class146).anIntArray1681 != null) && (((Class146) class146).anIntArray1681[i_375_]) != 0 && ((((Class146) class146).aShortArray1679 == null) || ((((Class146) class146).aShortArray1679) != null && ((((Class146) class146).aShortArray1679[i_375_]) == -1)))) {
									int i_384_ = (((Class146) class146).anIntArray1681[i_375_]);
									class143.method292(true, true, false, f_381_, f_382_, f_383_, f, f_379_, f_380_, 100.0F, 100.0F, 100.0F, (Class532.method6346(i_384_, -16777216 - ((((Class146) class146).anIntArray1680[i_376_]) & ~0xffffff), -95803483)), (Class532.method6346(i_384_, -16777216 - ((((Class146) class146).anIntArray1680[i_377_]) & ~0xffffff), -95803483)), (Class532.method6346(i_384_, -16777216 - ((((Class146) class146).anIntArray1680[i_378_]) & ~0xffffff), -95803483)));
								} else if ((((Class146) class146).aShortArray1679) != null && ((((Class146) class146).aShortArray1679[i_375_]) != -1)) {
									int i_385_ = (((Class174_Sub2) this).aClass106_Sub2_10776.method5206((((Class146) class146).aShortArray1679[i_375_]) & 0xffff));
									class143.method299(true, true, false, f_381_, f_382_, f_383_, f, f_379_, f_380_, 100.0F, 100.0F, 100.0F, (float) i_385_, (float) i_385_, (float) i_385_);
								} else
									class143.method292(true, true, false, f_381_, f_382_, f_383_, f, f_379_, f_380_, 100.0F, 100.0F, 100.0F, (((Class146) class146).anIntArray1680[i_376_]), (((Class146) class146).anIntArray1680[i_377_]), (((Class146) class146).anIntArray1680[i_378_]));
							}
						}
					} else if ((((Class174_Sub2) this).aClass145ArrayArray10766[i_370_][i_371_]) != null) {
						Class145 class145 = (((Class174_Sub2) this).aClass145ArrayArray10766[i_370_][i_371_]);
						for (int i_386_ = 0; i_386_ < ((Class145) class145).aShort1661; i_386_++) {
							fs[i_386_] = (float) (i_368_ + ((((Class145) class145).aShortArray1664[i_386_]) * i_367_ / (anInt2087 * 2129890771)));
							fs_365_[i_386_] = (float) (i_369_ - ((((Class145) class145).aShortArray1660[i_386_]) * i_367_ / (anInt2087 * 2129890771)));
						}
						for (int i_387_ = 0; i_387_ < ((Class145) class145).aShort1666; i_387_++) {
							int i_388_ = i_387_ * 3;
							int i_389_ = i_388_ + 1;
							int i_390_ = i_389_ + 1;
							float f = fs[i_388_];
							float f_391_ = fs[i_389_];
							float f_392_ = fs[i_390_];
							float f_393_ = fs_365_[i_388_];
							float f_394_ = fs_365_[i_389_];
							float f_395_ = fs_365_[i_390_];
							if (((Class145) class145).anIntArray1670 != null && (((Class145) class145).anIntArray1670[i_387_]) != 0) {
								int i_396_ = (((Class145) class145).anIntArray1670[i_387_]);
								class143.method292(true, true, false, f_393_, f_394_, f_395_, f, f_391_, f_392_, 100.0F, 100.0F, 100.0F, i_396_, i_396_, i_396_);
							} else
								class143.method292(true, true, false, f_393_, f_394_, f_395_, f, f_391_, f_392_, 100.0F, 100.0F, 100.0F, (((Class145) class145).anIntArray1668[i_388_]), (((Class145) class145).anIntArray1668[i_389_]), (((Class145) class145).anIntArray1668[i_390_]));
						}
					}
				}
				i_369_ -= i_367_;
			}
			i_369_ = i_359_ + i_366_;
			i_368_ += i_367_;
		}
		((Class143) class143).aBoolean16 = true;
		((Class174_Sub2) this).aClass106_Sub2_10776.method1763(bool);
	}

	public Class572_Sub12_Sub18 method2710(int i, int i_397_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		return null;
	}

	public void method2721(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_398_, int i_399_, int i_400_, boolean bool) {
		/* empty */
	}

	public boolean method2723(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_401_, int i_402_, int i_403_, boolean bool) {
		return false;
	}

	public boolean method2738(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_404_, int i_405_, int i_406_, boolean bool) {
		return false;
	}

	public void method2724(Class572_Sub36 class572_sub36, int[] is) {
		/* empty */
	}

	public void method2746(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_407_, int i_408_, int i_409_, boolean bool) {
		/* empty */
	}

	public void method2745(int i, int i_410_, int[] is, int[] is_411_, int[] is_412_, int[] is_413_, int[] is_414_, int[] is_415_, int[] is_416_, int[] is_417_, int[] is_418_, int[] is_419_, int[] is_420_, Class86 class86, boolean bool) {
		if (((Class174_Sub2) this).aClass152ArrayArray10789 == null) {
			((Class174_Sub2) this).aClass152ArrayArray10789 = new Class152[anInt2086 * -1715487093][anInt2089 * 792439321];
			((Class174_Sub2) this).aClass199ArrayArray10765 = new Class199[anInt2086 * -1715487093][anInt2089 * 792439321];
		} else if (((Class174_Sub2) this).aClass201ArrayArray10780 != null || ((Class174_Sub2) this).aClass145ArrayArray10766 != null)
			throw new IllegalStateException();
		boolean bool_421_ = false;
		if (is_417_.length == 2 && is_414_.length == 2 && (is_417_[0] == is_417_[1] || is_419_[0] != -1 && is_419_[0] == is_419_[1])) {
			bool_421_ = true;
			for (int i_422_ = 1; i_422_ < 2; i_422_++) {
				int i_423_ = is[is_414_[i_422_]];
				int i_424_ = is_412_[is_414_[i_422_]];
				if (i_423_ != 0 && i_423_ != anInt2087 * 2129890771 || i_424_ != 0 && i_424_ != anInt2087 * 2129890771) {
					bool_421_ = false;
					break;
				}
			}
		}
		if (!bool_421_) {
			Class199 class199 = new Class199();
			short i_425_ = (short) is.length;
			int i_426_ = (short) is_417_.length;
			((Class199) class199).aShort2365 = i_425_;
			((Class199) class199).aShortArray2369 = new short[i_425_];
			((Class199) class199).aShortArray2367 = new short[i_425_];
			((Class199) class199).aShortArray2377 = new short[i_425_];
			((Class199) class199).aShortArray2364 = new short[i_425_];
			for (int i_427_ = 0; i_427_ < i_425_; i_427_++) {
				int i_428_ = is[i_427_];
				int i_429_ = is_412_[i_427_];
				if (i_428_ == 0 && i_429_ == 0)
					((Class199) class199).aShortArray2369[i_427_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_]));
				else if (i_428_ == 0 && i_429_ == anInt2087 * 2129890771)
					((Class199) class199).aShortArray2369[i_427_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_ + 1]));
				else if (i_428_ == anInt2087 * 2129890771 && i_429_ == anInt2087 * 2129890771)
					((Class199) class199).aShortArray2369[i_427_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_ + 1]));
				else if (i_428_ == anInt2087 * 2129890771 && i_429_ == 0)
					((Class199) class199).aShortArray2369[i_427_] = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_]));
				else {
					int i_430_ = (((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_])) * (anInt2087 * 2129890771 - i_428_) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_])) * i_428_);
					int i_431_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_ + 1])) * (anInt2087 * 2129890771 - i_428_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_ + 1])) * i_428_);
					((Class199) class199).aShortArray2369[i_427_] = (short) ((i_430_ * (anInt2087 * 2129890771 - i_429_) + i_431_ * i_429_) >> anInt2088 * 424535142);
				}
				int i_432_ = (i << anInt2088 * 212267571) + i_428_;
				int i_433_ = (i_410_ << anInt2088 * 212267571) + i_429_;
				((Class199) class199).aShortArray2367[i_427_] = (short) i_428_;
				((Class199) class199).aShortArray2364[i_427_] = (short) i_429_;
				((Class199) class199).aShortArray2377[i_427_] = (short) (method2726(i_432_, i_433_, 358769667) + (is_411_ != null ? is_411_[i_427_] : 0));
				if (((Class199) class199).aShortArray2369[i_427_] < 2)
					((Class199) class199).aShortArray2369[i_427_] = (short) 2;
			}
			boolean bool_434_ = false;
			int i_435_ = 0;
			for (int i_436_ = 0; i_436_ < i_426_; i_436_++) {
				if (is_417_[i_436_] >= 0 || is_418_ != null && is_418_[i_436_] >= 0)
					i_435_++;
				int i_437_ = is_419_[i_436_];
				if (i_437_ != -1) {
					MaterialInformation class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_437_, 1283637314);
					if (!class101.aBool1350) {
						bool_434_ = true;
						if (method10003(class101.effectId) || class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
							((Class199) class199).aByte2366 |= 0x4;
					}
				}
			}
			((Class199) class199).anIntArray2376 = new int[i_435_];
			if (is_418_ != null)
				((Class199) class199).anIntArray2371 = new int[i_435_];
			((Class199) class199).aShortArray2368 = new short[i_435_];
			((Class199) class199).aShortArray2372 = new short[i_435_];
			((Class199) class199).aShortArray2373 = new short[i_435_];
			if (bool_434_) {
				((Class199) class199).aShortArray2374 = new short[i_435_];
				((Class199) class199).aShortArray2375 = new short[i_435_];
			}
			for (int i_438_ = 0; i_438_ < i_426_; i_438_++) {
				if (is_417_[i_438_] >= 0 || is_418_ != null && is_418_[i_438_] >= 0) {
					if (is_417_[i_438_] >= 0)
						((Class199) class199).anIntArray2376[((Class199) class199).aShort2370] = Class658.method1823(is_417_[i_438_], 1448849467);
					else
						((Class199) class199).anIntArray2376[((Class199) class199).aShort2370] = -1;
					if (is_418_ != null) {
						if (is_418_[i_438_] != -1)
							((Class199) class199).anIntArray2371[((Class199) class199).aShort2370] = Class658.method1823(is_418_[i_438_], 1743952208);
						else
							((Class199) class199).anIntArray2371[((Class199) class199).aShort2370] = -1;
					}
					((Class199) class199).aShortArray2368[((Class199) class199).aShort2370] = (short) is_414_[i_438_];
					((Class199) class199).aShortArray2372[((Class199) class199).aShort2370] = (short) is_415_[i_438_];
					((Class199) class199).aShortArray2373[((Class199) class199).aShort2370] = (short) is_416_[i_438_];
					if (bool_434_) {
						if (is_419_[i_438_] != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_419_[i_438_], 1436880762).aBool1350)) {
							((Class199) class199).aShortArray2374[((Class199) class199).aShort2370] = (short) is_419_[i_438_];
							((Class199) class199).aShortArray2375[((Class199) class199).aShort2370] = (short) is_420_[i_438_];
						} else
							((Class199) class199).aShortArray2374[((Class199) class199).aShort2370] = (short) -1;
					}
					((Class199) class199).aShort2370++;
				}
			}
			((Class174_Sub2) this).aClass199ArrayArray10765[i][i_410_] = class199;
		} else if (is_417_[0] >= 0 || is_418_ != null && is_418_[0] >= 0) {
			Class152 class152 = new Class152();
			int i_439_ = is_417_[0];
			int i_440_ = is_419_[0];
			if (is_418_ != null) {
				((Class152) class152).anInt1709 = Class416.method5100(Class658.method1823(is_418_[0], -989499837), ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_])), -1601124661);
				if (i_439_ == -1)
					((Class152) class152).aByte1705 |= 0x2;
			}
			if ((anIntArrayArray2085[i][i_410_] == anIntArrayArray2085[i + 1][i_410_]) && (anIntArrayArray2085[i][i_410_] == anIntArrayArray2085[i + 1][i_410_ + 1]) && (anIntArrayArray2085[i][i_410_] == anIntArrayArray2085[i][i_410_ + 1]))
				((Class152) class152).aByte1705 |= 0x1;
			MaterialInformation class101 = null;
			if (i_440_ != -1)
				class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_440_, -141202127);
			if (class101 != null && (((Class152) class152).aByte1705 & 0x2) == 0 && !class101.aBool1350) {
				((Class152) class152).aShort1704 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_]));
				((Class152) class152).aShort1703 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_]));
				((Class152) class152).aShort1706 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_ + 1]));
				((Class152) class152).aShort1707 = (short) ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_ + 1]));
				((Class152) class152).aShort1708 = (short) i_440_;
				if (method10003(class101.effectId) || class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
					((Class152) class152).aByte1705 |= 0x4;
			} else {
				short i_441_ = Class658.method1823(i_439_, 1002664859);
				((Class152) class152).aShort1704 = (short) Class416.method5100(i_441_, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_])), -1601124661);
				((Class152) class152).aShort1703 = (short) Class416.method5100(i_441_, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_])), -1601124661);
				((Class152) class152).aShort1706 = (short) Class416.method5100(i_441_, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_410_ + 1])), -1601124661);
				((Class152) class152).aShort1707 = (short) Class416.method5100(i_441_, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_410_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_410_ + 1])), -1601124661);
				((Class152) class152).aShort1708 = (short) -1;
			}
			((Class174_Sub2) this).aClass152ArrayArray10789[i][i_410_] = class152;
		}
	}

	public void method2744(int i, int i_442_, int[] is, int[] is_443_, int[] is_444_, int[] is_445_, int[] is_446_, int[] is_447_, int[] is_448_, int[] is_449_, Class86 class86, boolean bool) {
		boolean bool_450_ = (((Class174_Sub2) this).anInt10759 & 0x20) == 0;
		if (((Class174_Sub2) this).aClass201ArrayArray10780 == null && !bool_450_) {
			((Class174_Sub2) this).aClass201ArrayArray10780 = new Class201[anInt2086 * -1715487093][anInt2089 * 792439321];
			((Class174_Sub2) this).aClass146ArrayArray10778 = new Class146[anInt2086 * -1715487093][anInt2089 * 792439321];
		} else if (((Class174_Sub2) this).aClass145ArrayArray10766 == null && bool_450_)
			((Class174_Sub2) this).aClass145ArrayArray10766 = new Class145[anInt2086 * -1715487093][anInt2089 * 792439321];
		else if (((Class174_Sub2) this).aClass152ArrayArray10789 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_451_ = 0; i_451_ < is_446_.length; i_451_++) {
				if (is_446_[i_451_] == -1)
					is_446_[i_451_] = 0;
				else
					is_446_[i_451_] = (Class460.anIntArray4096[(Class658.method1823(is_446_[i_451_], -1631105785) & 0xffff)]) << 8 | 0xff;
			}
			if (is_447_ != null) {
				for (int i_452_ = 0; i_452_ < is_447_.length; i_452_++) {
					if (is_447_[i_452_] == -1)
						is_447_[i_452_] = 0;
					else
						is_447_[i_452_] = ((Class460.anIntArray4096[Class658.method1823(is_447_[i_452_], 755781270) & 0xffff]) << 8 | 0xff);
				}
			}
			if (bool_450_) {
				Class145 class145 = new Class145();
				((Class145) class145).aShort1661 = (short) is.length;
				((Class145) class145).aShort1666 = (short) (is.length / 3);
				((Class145) class145).aShortArray1664 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1662 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1660 = new short[((Class145) class145).aShort1661];
				((Class145) class145).anIntArray1668 = new int[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1665 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aShortArray1667 = new short[((Class145) class145).aShort1661];
				((Class145) class145).aByteArray1669 = new byte[((Class145) class145).aShort1661];
				if (is_445_ != null)
					((Class145) class145).aShortArray1663 = new short[((Class145) class145).aShort1661];
				for (int i_453_ = 0; i_453_ < ((Class145) class145).aShort1661; i_453_++) {
					int i_454_ = is[i_453_];
					int i_455_ = is_444_[i_453_];
					boolean bool_456_ = false;
					int i_457_;
					if (i_454_ == 0 && i_455_ == 0)
						i_457_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_]));
					else if (i_454_ == 0 && i_455_ == anInt2087 * 2129890771)
						i_457_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1]));
					else if (i_454_ == anInt2087 * 2129890771 && i_455_ == anInt2087 * 2129890771)
						i_457_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1]));
					else if (i_454_ == anInt2087 * 2129890771 && i_455_ == 0)
						i_457_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_]));
					else {
						int i_458_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_])) * (anInt2087 * 2129890771 - i_454_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_])) * i_454_);
						int i_459_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1])) * (anInt2087 * 2129890771 - i_454_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1])) * i_454_);
						i_457_ = (i_458_ * (anInt2087 * 2129890771 - i_455_) + i_459_ * i_455_) >> anInt2088 * 424535142;
					}
					int i_460_ = (i << anInt2088 * 212267571) + i_454_;
					int i_461_ = (i_442_ << anInt2088 * 212267571) + i_455_;
					((Class145) class145).aShortArray1664[i_453_] = (short) i_454_;
					((Class145) class145).aShortArray1660[i_453_] = (short) i_455_;
					((Class145) class145).aShortArray1662[i_453_] = (short) (method2726(i_460_, i_461_, 358769667) + (is_443_ != null ? is_443_[i_453_] : 0));
					if (i_457_ < 0)
						i_457_ = 0;
					if (is_446_[i_453_] == 0) {
						((Class145) class145).anIntArray1668[i_453_] = 0;
						if (is_447_ != null)
							((Class145) class145).aByteArray1669[i_453_] = (byte) i_457_;
					} else {
						int i_462_ = 0;
						if (is_445_ != null) {
							int i_463_ = (((Class145) class145).aShortArray1663[i_453_] = (short) is_445_[i_453_]);
							if (class86.anInt1190 * -1018540369 != 0) {
								i_462_ = 255 * i_463_ / (class86.anInt1190 * -1018540369);
								if (i_462_ < 0)
									i_462_ = 0;
								else if (i_462_ > 255)
									i_462_ = 255;
							}
						}
						int i_464_ = -16777216;
						if (is_448_[i_453_] != -1) {
							MaterialInformation class101 = ((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_448_[i_453_], -608003387);
							if (class101.textureId * 811137757 != -1 && method10003(class101.effectId))
								i_464_ = -1694498816;
						}
						((Class145) class145).anIntArray1668[i_453_] = i_464_ | (Class629.method7515(method9999(is_446_[i_453_] >> 8, i_457_), class86.anInt1193 * 526464983, i_462_, 1940235028));
						if (is_447_ != null)
							((Class145) class145).aByteArray1669[i_453_] = (byte) i_457_;
					}
					((Class145) class145).aShortArray1665[i_453_] = (short) is_448_[i_453_];
					((Class145) class145).aShortArray1667[i_453_] = (short) is_449_[i_453_];
				}
				if (is_447_ != null) {
					((Class145) class145).anIntArray1670 = new int[((Class145) class145).aShort1666];
					for (int i_465_ = 0; i_465_ < ((Class145) class145).aShort1666; i_465_++) {
						int i_466_ = i_465_ * 3;
						if (is_447_[i_466_] != 0)
							((Class145) class145).anIntArray1670[i_465_] = ~0xffffff | is_447_[i_466_] >> 8;
					}
				}
				((Class174_Sub2) this).aClass145ArrayArray10766[i][i_442_] = class145;
			} else {
				boolean bool_467_ = true;
				int i_468_ = -1;
				int i_469_ = -1;
				int i_470_ = -1;
				int i_471_ = -1;
				if (is.length == 6) {
					for (int i_472_ = 0; i_472_ < 6; i_472_++) {
						if (is[i_472_] == 0 && is_444_[i_472_] == 0) {
							if (i_468_ != -1 && is_446_[i_468_] != is_446_[i_472_]) {
								bool_467_ = false;
								break;
							}
							i_468_ = i_472_;
						} else if (is[i_472_] == anInt2087 * 2129890771 && is_444_[i_472_] == 0) {
							if (i_469_ != -1 && is_446_[i_469_] != is_446_[i_472_]) {
								bool_467_ = false;
								break;
							}
							i_469_ = i_472_;
						} else if (is[i_472_] == anInt2087 * 2129890771 && (is_444_[i_472_] == anInt2087 * 2129890771)) {
							if (i_470_ != -1 && is_446_[i_470_] != is_446_[i_472_]) {
								bool_467_ = false;
								break;
							}
							i_470_ = i_472_;
						} else if (is[i_472_] == 0 && (is_444_[i_472_] == anInt2087 * 2129890771)) {
							if (i_471_ != -1 && is_446_[i_471_] != is_446_[i_472_]) {
								bool_467_ = false;
								break;
							}
							i_471_ = i_472_;
						}
					}
					if (i_468_ == -1 || i_469_ == -1 || i_470_ == -1 || i_471_ == -1)
						bool_467_ = false;
					if (bool_467_) {
						if (is_443_ != null) {
							for (int i_473_ = 0; i_473_ < 4; i_473_++) {
								if (is_443_[i_473_] != 0) {
									bool_467_ = false;
									break;
								}
							}
						}
						if (bool_467_) {
							for (int i_474_ = 1; i_474_ < 4; i_474_++) {
								if (is[i_474_] != is[0] && (is[i_474_] != is[0] + anInt2087 * 2129890771) && (is[i_474_] != is[0] - anInt2087 * 2129890771)) {
									bool_467_ = false;
									break;
								}
								if (is_444_[i_474_] != is_444_[0] && (is_444_[i_474_] != is_444_[0] + anInt2087 * 2129890771) && (is_444_[i_474_] != (is_444_[0] - anInt2087 * 2129890771))) {
									bool_467_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_467_ = false;
				if (bool_467_) {
					Class201 class201 = new Class201();
					int i_475_ = is_446_[0];
					int i_476_ = is_448_[0];
					if (is_447_ != null) {
						((Class201) class201).anInt2396 = is_447_[0] >> 8;
						if (i_475_ == 0)
							((Class201) class201).aByte2400 |= 0x2;
					} else if (i_475_ == 0)
						return;
					if ((anIntArrayArray2085[i][i_442_] == anIntArrayArray2085[i + 1][i_442_]) && (anIntArrayArray2085[i][i_442_] == anIntArrayArray2085[i + 1][i_442_ + 1]) && (anIntArrayArray2085[i][i_442_] == anIntArrayArray2085[i][i_442_ + 1]))
						((Class201) class201).aByte2400 |= 0x1;
					if (i_476_ != -1 && (((Class201) class201).aByte2400 & 0x2) == 0 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_476_, 373456617).aBool1350)) {
						int i_477_;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_477_ = 255 * is_445_[i_468_] / (class86.anInt1190 * -1018540369);
							if (i_477_ < 0)
								i_477_ = 0;
							else if (i_477_ > 255)
								i_477_ = 255;
						} else
							i_477_ = 0;
						((Class201) class201).anInt2399 = (Class629.method7515(method9999(is_446_[i_468_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_]))), class86.anInt1193 * 526464983, i_477_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2399 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_477_ = 255 * is_445_[i_469_] / (class86.anInt1190 * -1018540369);
							if (i_477_ < 0)
								i_477_ = 0;
							else if (i_477_ > 255)
								i_477_ = 255;
						} else
							i_477_ = 0;
						((Class201) class201).anInt2393 = (Class629.method7515(method9999(is_446_[i_469_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_]))), class86.anInt1193 * 526464983, i_477_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2393 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_477_ = 255 * is_445_[i_470_] / (class86.anInt1190 * -1018540369);
							if (i_477_ < 0)
								i_477_ = 0;
							else if (i_477_ > 255)
								i_477_ = 255;
						} else
							i_477_ = 0;
						((Class201) class201).anInt2394 = (Class629.method7515(method9999(is_446_[i_470_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1]))), class86.anInt1193 * 526464983, i_477_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2394 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_477_ = 255 * is_445_[i_471_] / (class86.anInt1190 * -1018540369);
							if (i_477_ < 0)
								i_477_ = 0;
							else if (i_477_ > 255)
								i_477_ = 255;
						} else
							i_477_ = 0;
						((Class201) class201).anInt2395 = (Class629.method7515(method9999(is_446_[i_471_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1]))), class86.anInt1193 * 526464983, i_477_, 1940235028));
						((Class201) class201).aShort2401 = (short) i_476_;
					} else {
						int i_478_;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_478_ = 255 * is_445_[i_468_] / (class86.anInt1190 * -1018540369);
							if (i_478_ < 0)
								i_478_ = 0;
							else if (i_478_ > 255)
								i_478_ = 255;
						} else
							i_478_ = 0;
						((Class201) class201).anInt2399 = (Class629.method7515(method9999(is_446_[i_468_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_]))), class86.anInt1193 * 526464983, i_478_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2399 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_478_ = 255 * is_445_[i_469_] / (class86.anInt1190 * -1018540369);
							if (i_478_ < 0)
								i_478_ = 0;
							else if (i_478_ > 255)
								i_478_ = 255;
						} else
							i_478_ = 0;
						((Class201) class201).anInt2393 = (Class629.method7515(method9999(is_446_[i_469_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_]))), class86.anInt1193 * 526464983, i_478_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2393 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_478_ = 255 * is_445_[i_470_] / (class86.anInt1190 * -1018540369);
							if (i_478_ < 0)
								i_478_ = 0;
							else if (i_478_ > 255)
								i_478_ = 255;
						} else
							i_478_ = 0;
						((Class201) class201).anInt2394 = (Class629.method7515(method9999(is_446_[i_470_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1]))), class86.anInt1193 * 526464983, i_478_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2394 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1])) << 25;
						if (is_445_ != null && class86.anInt1190 * -1018540369 != 0) {
							i_478_ = 255 * is_445_[i_471_] / (class86.anInt1190 * -1018540369);
							if (i_478_ < 0)
								i_478_ = 0;
							else if (i_478_ > 255)
								i_478_ = 255;
						} else
							i_478_ = 0;
						((Class201) class201).anInt2395 = (Class629.method7515(method9999(is_446_[i_471_] >> 8, ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1]))), class86.anInt1193 * 526464983, i_478_, 1940235028));
						if (((Class201) class201).anInt2396 != 0)
							((Class201) class201).anInt2395 |= 255 - ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1])) << 25;
						((Class201) class201).aShort2401 = (short) -1;
					}
					if (is_445_ != null) {
						((Class201) class201).aShort2398 = (short) is_445_[i_470_];
						((Class201) class201).aShort2391 = (short) is_445_[i_471_];
						((Class201) class201).aShort2397 = (short) is_445_[i_469_];
						((Class201) class201).aShort2392 = (short) is_445_[i_468_];
					}
					((Class174_Sub2) this).aClass201ArrayArray10780[i][i_442_] = class201;
				} else {
					Class146 class146 = new Class146();
					((Class146) class146).aShort1672 = (short) is.length;
					((Class146) class146).aShort1671 = (short) (is.length / 3);
					((Class146) class146).aShortArray1673 = new short[((Class146) class146).aShort1672];
					((Class146) class146).aShortArray1675 = new short[((Class146) class146).aShort1672];
					((Class146) class146).aShortArray1676 = new short[((Class146) class146).aShort1672];
					((Class146) class146).anIntArray1680 = new int[((Class146) class146).aShort1672];
					if (is_445_ != null)
						((Class146) class146).aShortArray1677 = new short[((Class146) class146).aShort1672];
					for (int i_479_ = 0; i_479_ < ((Class146) class146).aShort1672; i_479_++) {
						int i_480_ = is[i_479_];
						int i_481_ = is_444_[i_479_];
						boolean bool_482_ = false;
						int i_483_;
						if (i_480_ == 0 && i_481_ == 0)
							i_483_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_]));
						else if (i_480_ == 0 && i_481_ == anInt2087 * 2129890771)
							i_483_ = ((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1]));
						else if (i_480_ == anInt2087 * 2129890771 && i_481_ == anInt2087 * 2129890771)
							i_483_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1]));
						else if (i_480_ == anInt2087 * 2129890771 && i_481_ == 0)
							i_483_ = ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_]));
						else {
							int i_484_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_])) * (anInt2087 * 2129890771 - i_480_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_])) * i_480_);
							int i_485_ = ((((((Class174_Sub2) this).aByteArrayArray10785[i][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i][i_442_ + 1])) * (anInt2087 * 2129890771 - i_480_)) + ((((Class174_Sub2) this).aByteArrayArray10785[i + 1][i_442_ + 1]) - (((Class174_Sub2) this).aByteArrayArray10786[i + 1][i_442_ + 1])) * i_480_);
							i_483_ = (i_484_ * (anInt2087 * 2129890771 - i_481_) + i_485_ * i_481_) >> anInt2088 * 424535142;
						}
						int i_486_ = (i << anInt2088 * 212267571) + i_480_;
						int i_487_ = (i_442_ << anInt2088 * 212267571) + i_481_;
						((Class146) class146).aShortArray1673[i_479_] = (short) i_480_;
						((Class146) class146).aShortArray1676[i_479_] = (short) i_481_;
						((Class146) class146).aShortArray1675[i_479_] = (short) (method2726(i_486_, i_487_, 358769667) + (is_443_ != null ? is_443_[i_479_] : 0));
						if (i_483_ < 0)
							i_483_ = 0;
						if (is_446_[i_479_] == 0) {
							if (is_447_ != null)
								((Class146) class146).anIntArray1680[i_479_] = i_483_ << 25;
							else
								((Class146) class146).anIntArray1680[i_479_] = 0;
						} else {
							int i_488_ = 0;
							if (is_445_ != null) {
								int i_489_ = (((Class146) class146).aShortArray1677[i_479_] = (short) is_445_[i_479_]);
								if (class86.anInt1190 * -1018540369 != 0) {
									i_488_ = 255 * i_489_ / (class86.anInt1190 * -1018540369);
									if (i_488_ < 0)
										i_488_ = 0;
									else if (i_488_ > 255)
										i_488_ = 255;
								}
							}
							((Class146) class146).anIntArray1680[i_479_] = (Class629.method7515(method9999(is_446_[i_479_] >> 8, i_483_), class86.anInt1193 * 526464983, i_488_, 1940235028));
							if (is_447_ != null)
								((Class146) class146).anIntArray1680[i_479_] |= i_483_ << 25;
						}
					}
					boolean bool_490_ = false;
					for (int i_491_ = 0; i_491_ < ((Class146) class146).aShort1671; i_491_++) {
						if (is_448_[i_491_ * 3] != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(is_448_[i_491_ * 3], -263948839).aBool1350))
							bool_490_ = true;
					}
					if (is_447_ != null)
						((Class146) class146).anIntArray1681 = new int[((Class146) class146).aShort1671];
					if (bool_490_) {
						((Class146) class146).aShortArray1679 = new short[((Class146) class146).aShort1671];
						((Class146) class146).aShortArray1678 = new short[((Class146) class146).aShort1671];
					}
					for (int i_492_ = 0; i_492_ < ((Class146) class146).aShort1671; i_492_++) {
						int i_493_ = i_492_ * 3;
						if (is_447_ != null && is_447_[i_493_] != 0)
							((Class146) class146).anIntArray1681[i_492_] = is_447_[i_493_] >> 8;
						if (bool_490_) {
							int i_494_ = i_493_ + 1;
							int i_495_ = i_494_ + 1;
							boolean bool_496_ = false;
							boolean bool_497_ = true;
							int i_498_ = is_448_[i_493_];
							if (i_498_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, -481401155).aBool1350))
								bool_497_ = false;
							else
								bool_496_ = true;
							i_498_ = is_448_[i_494_];
							if (i_498_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, -607175590).aBool1350))
								bool_497_ = false;
							else
								bool_496_ = true;
							i_498_ = is_448_[i_495_];
							if (i_498_ == -1 || (((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, -689266632).aBool1350))
								bool_497_ = false;
							else
								bool_496_ = true;
							if (bool_497_) {
								((Class146) class146).aShortArray1679[i_492_] = (short) i_498_;
								((Class146) class146).aShortArray1678[i_492_] = (short) is_449_[i_493_];
							} else {
								if (bool_496_) {
									i_498_ = is_448_[i_493_];
									if (i_498_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, 235979278).aBool1350))
										((Class146) class146).anIntArray1680[i_493_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, 551977741).aShort1317) & 0xffff, 896708296)) & 0xffff]);
									i_498_ = is_448_[i_494_];
									if (i_498_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, 2128127966).aBool1350))
										((Class146) class146).anIntArray1680[i_494_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, -37015148).aShort1317) & 0xffff, 44486664)) & 0xffff]);
									i_498_ = is_448_[i_495_];
									if (i_498_ != -1 && !(((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, 1846871980).aBool1350))
										((Class146) class146).anIntArray1680[i_495_] = (Class460.anIntArray4096[(Class658.method1823((((Class174_Sub2) this).aClass106_Sub2_10776.aClass94_1396.getTexture(i_498_, -284713832).aShort1317) & 0xffff, -1503716338)) & 0xffff]);
								}
								((Class146) class146).aShortArray1679[i_492_] = (short) -1;
							}
						}
					}
					((Class174_Sub2) this).aClass146ArrayArray10778[i][i_442_] = class146;
				}
			}
		}
	}

	static int method10006(int i, int i_499_) {
		int i_500_ = (i & 0xff0000) * i_499_ >> 23;
		if (i_500_ < 2)
			i_500_ = 2;
		else if (i_500_ > 253)
			i_500_ = 253;
		int i_501_ = (i & 0xff00) * i_499_ >> 15;
		if (i_501_ < 2)
			i_501_ = 2;
		else if (i_501_ > 253)
			i_501_ = 253;
		int i_502_ = (i & 0xff) * i_499_ >> 7;
		if (i_502_ < 2)
			i_502_ = 2;
		else if (i_502_ > 253)
			i_502_ = 253;
		return i_500_ << 16 | i_501_ << 8 | i_502_;
	}

	public void method2729() {
		((Class174_Sub2) this).aByteArrayArray10785 = null;
		((Class174_Sub2) this).aByteArrayArray10786 = null;
	}

	public void method2730() {
		((Class174_Sub2) this).aByteArrayArray10785 = null;
		((Class174_Sub2) this).aByteArrayArray10786 = null;
	}

	public void method2731(int i, int i_503_, int i_504_, boolean[][] bools, boolean bool, int i_505_) {
		if ((((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anIntArray10218) == null || (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aFloatArray10219) == null)
			throw new IllegalStateException("");
		Class250 class250 = (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aClass250_10233);
		((Class174_Sub2) this).aFloat10769 = class250.aFloatArray2728[0];
		((Class174_Sub2) this).aFloat10770 = class250.aFloatArray2728[1];
		((Class174_Sub2) this).aFloat10771 = class250.aFloatArray2728[2];
		((Class174_Sub2) this).aFloat10772 = class250.aFloatArray2728[3];
		((Class174_Sub2) this).aFloat10767 = class250.aFloatArray2728[4];
		((Class174_Sub2) this).aFloat10774 = class250.aFloatArray2728[5];
		((Class174_Sub2) this).aFloat10775 = class250.aFloatArray2728[6];
		((Class174_Sub2) this).aFloat10768 = class250.aFloatArray2728[7];
		((Class174_Sub2) this).aFloat10777 = class250.aFloatArray2728[8];
		((Class174_Sub2) this).aFloat10788 = class250.aFloatArray2728[9];
		((Class174_Sub2) this).aFloat10779 = class250.aFloatArray2728[10];
		((Class174_Sub2) this).aFloat10764 = class250.aFloatArray2728[11];
		((Class174_Sub2) this).aFloat10781 = class250.aFloatArray2728[12];
		((Class174_Sub2) this).aFloat10782 = class250.aFloatArray2728[13];
		((Class174_Sub2) this).aFloat10783 = class250.aFloatArray2728[14];
		((Class174_Sub2) this).aFloat10784 = class250.aFloatArray2728[15];
		for (int i_506_ = 0; i_506_ < i_504_ + i_504_; i_506_++) {
			for (int i_507_ = 0; i_507_ < i_504_ + i_504_; i_507_++) {
				if (bools[i_506_][i_507_]) {
					int i_508_ = i - i_504_ + i_506_;
					int i_509_ = i_503_ - i_504_ + i_507_;
					if (i_508_ >= 0 && i_508_ < anInt2086 * -1715487093 && i_509_ >= 0 && i_509_ < anInt2089 * 792439321)
						method10007(i_508_, i_509_, i_505_);
				}
			}
		}
	}

	public void method2734(int i, int i_510_, int i_511_, boolean[][] bools, boolean bool, int i_512_) {
		if ((((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anIntArray10218) == null || (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aFloatArray10219) == null)
			throw new IllegalStateException("");
		Class250 class250 = (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aClass250_10233);
		((Class174_Sub2) this).aFloat10769 = class250.aFloatArray2728[0];
		((Class174_Sub2) this).aFloat10770 = class250.aFloatArray2728[1];
		((Class174_Sub2) this).aFloat10771 = class250.aFloatArray2728[2];
		((Class174_Sub2) this).aFloat10772 = class250.aFloatArray2728[3];
		((Class174_Sub2) this).aFloat10767 = class250.aFloatArray2728[4];
		((Class174_Sub2) this).aFloat10774 = class250.aFloatArray2728[5];
		((Class174_Sub2) this).aFloat10775 = class250.aFloatArray2728[6];
		((Class174_Sub2) this).aFloat10768 = class250.aFloatArray2728[7];
		((Class174_Sub2) this).aFloat10777 = class250.aFloatArray2728[8];
		((Class174_Sub2) this).aFloat10788 = class250.aFloatArray2728[9];
		((Class174_Sub2) this).aFloat10779 = class250.aFloatArray2728[10];
		((Class174_Sub2) this).aFloat10764 = class250.aFloatArray2728[11];
		((Class174_Sub2) this).aFloat10781 = class250.aFloatArray2728[12];
		((Class174_Sub2) this).aFloat10782 = class250.aFloatArray2728[13];
		((Class174_Sub2) this).aFloat10783 = class250.aFloatArray2728[14];
		((Class174_Sub2) this).aFloat10784 = class250.aFloatArray2728[15];
		for (int i_513_ = 0; i_513_ < i_511_ + i_511_; i_513_++) {
			for (int i_514_ = 0; i_514_ < i_511_ + i_511_; i_514_++) {
				if (bools[i_513_][i_514_]) {
					int i_515_ = i - i_511_ + i_513_;
					int i_516_ = i_510_ - i_511_ + i_514_;
					if (i_515_ >= 0 && i_515_ < anInt2086 * -1715487093 && i_516_ >= 0 && i_516_ < anInt2089 * 792439321)
						method10007(i_515_, i_516_, i_512_);
				}
			}
		}
	}

	public void method2719() {
		((Class174_Sub2) this).aByteArrayArray10785 = null;
		((Class174_Sub2) this).aByteArrayArray10786 = null;
	}

	public void method2725(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_517_, int i_518_, int i_519_, boolean bool) {
		/* empty */
	}

	public void method2716(int i, int i_520_, int i_521_, int i_522_, int i_523_, int i_524_, int i_525_, boolean[][] bools) {
		Class186 class186 = ((Class174_Sub2) this).aClass106_Sub2_10776.method9512(Thread.currentThread());
		Class143 class143 = ((Class186) class186).aClass143_2187;
		((Class143) class143).anInt19 = 0;
		((Class143) class143).aBoolean20 = true;
		((Class174_Sub2) this).aClass106_Sub2_10776.method9518();
		if (((Class174_Sub2) this).aClass201ArrayArray10780 != null || ((Class174_Sub2) this).aClass145ArrayArray10766 != null)
			method10005(i, i_520_, i_521_, i_522_, i_523_, i_524_, i_525_, bools, class186, class143, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214);
		else if (((Class174_Sub2) this).aClass152ArrayArray10789 != null)
			method10004(i, i_520_, i_521_, i_522_, i_523_, i_524_, i_525_, bools, class186, class143, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214);
	}

	public void method2714(int i, int i_526_, int i_527_) {
		i = Math.min(((Class174_Sub2) this).aByteArrayArray10786.length - 1, Math.max(0, i));
		i_526_ = Math.min((((Class174_Sub2) this).aByteArrayArray10786[i].length - 1), Math.max(0, i_526_));
		if (((Class174_Sub2) this).aByteArrayArray10786[i][i_526_] < i_527_)
			((Class174_Sub2) this).aByteArrayArray10786[i][i_526_] = (byte) i_527_;
	}

	public Class572_Sub12_Sub18 method2743(int i, int i_528_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		return null;
	}

	Class174_Sub2(Class106_Sub2 class106_sub2, int i, int i_529_, int i_530_, int i_531_, int[][] is, int[][] is_532_, int i_533_) {
		super(i_530_, i_531_, i_533_, is);
		((Class174_Sub2) this).aClass106_Sub2_10776 = class106_sub2;
		((Class174_Sub2) this).anInt10759 = i_529_;
		((Class174_Sub2) this).aByteArrayArray10785 = new byte[i_530_ + 1][i_531_ + 1];
		int i_534_ = ((((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anInt10235) * -746717417 >> 9);
		for (int i_535_ = 1; i_535_ < i_531_; i_535_++) {
			for (int i_536_ = 1; i_536_ < i_530_; i_536_++) {
				int i_537_ = i_534_;
				int i_538_ = (is_532_[i_536_ + 1][i_535_] - is_532_[i_536_ - 1][i_535_]);
				int i_539_ = (is_532_[i_536_][i_535_ + 1] - is_532_[i_536_][i_535_ - 1]);
				int i_540_ = (int) Math.sqrt((double) (i_538_ * i_538_ + 512 * i_533_ + i_539_ * i_539_));
				int i_541_ = (i_538_ << 8) / i_540_;
				int i_542_ = -512 * i_533_ / i_540_;
				int i_543_ = (i_539_ << 8) / i_540_;
				i_537_ += ((((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anInt10224) * -851026933 * i_541_ + (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anInt10229) * 1112635407 * i_542_ + (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anInt10216) * -1956483799 * i_543_) >> 17;
				i_537_ >>= 1;
				if (i_537_ < 2)
					i_537_ = 2;
				else if (i_537_ > 126)
					i_537_ = 126;
				((Class174_Sub2) this).aByteArrayArray10785[i_536_][i_535_] = (byte) i_537_;
			}
		}
		((Class174_Sub2) this).aByteArrayArray10786 = new byte[i_530_ + 1][i_531_ + 1];
	}

	public Class572_Sub12_Sub18 method2736(int i, int i_544_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		return null;
	}

	public Class572_Sub12_Sub18 method2735(int i, int i_545_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		return null;
	}

	public void method2722(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_546_, int i_547_, int i_548_, boolean bool) {
		/* empty */
	}

	void method10007(int i, int i_549_, int i_550_) {
		Class186 class186 = ((Class174_Sub2) this).aClass106_Sub2_10776.method9512(Thread.currentThread());
		((Class143) ((Class186) class186).aClass143_2187).anInt19 = 0;
		if (((Class174_Sub2) this).aClass201ArrayArray10780 != null)
			method10001(i, i_549_, ((Class186) class186).aBool2201, class186, ((Class186) class186).aClass143_2187, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214, ((Class186) class186).aFloatArray2215, ((Class186) class186).aFloatArray2216, ((Class186) class186).aFloatArray2217, i_550_);
		else if (((Class174_Sub2) this).aClass152ArrayArray10789 != null)
			method10000(i, i_549_, ((Class186) class186).aClass143_2187, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214, ((Class186) class186).aFloatArray2215, ((Class186) class186).aFloatArray2216, ((Class186) class186).aFloatArray2217, i_550_);
		else if (((Class174_Sub2) this).aClass145ArrayArray10766 != null)
			method10002(i, i_549_, ((Class186) class186).aBool2201, class186, ((Class186) class186).aClass143_2187, ((Class186) class186).aFloatArray2213, ((Class186) class186).aFloatArray2214, ((Class186) class186).aFloatArray2215, ((Class186) class186).aFloatArray2216, ((Class186) class186).aFloatArray2217, i_550_);
	}

	public void method2715(int i, int i_551_, int i_552_, boolean[][] bools, boolean bool, int i_553_) {
		if ((((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).anIntArray10218) == null || (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aFloatArray10219) == null)
			throw new IllegalStateException("");
		Class250 class250 = (((Class106_Sub2) ((Class174_Sub2) this).aClass106_Sub2_10776).aClass250_10233);
		((Class174_Sub2) this).aFloat10769 = class250.aFloatArray2728[0];
		((Class174_Sub2) this).aFloat10770 = class250.aFloatArray2728[1];
		((Class174_Sub2) this).aFloat10771 = class250.aFloatArray2728[2];
		((Class174_Sub2) this).aFloat10772 = class250.aFloatArray2728[3];
		((Class174_Sub2) this).aFloat10767 = class250.aFloatArray2728[4];
		((Class174_Sub2) this).aFloat10774 = class250.aFloatArray2728[5];
		((Class174_Sub2) this).aFloat10775 = class250.aFloatArray2728[6];
		((Class174_Sub2) this).aFloat10768 = class250.aFloatArray2728[7];
		((Class174_Sub2) this).aFloat10777 = class250.aFloatArray2728[8];
		((Class174_Sub2) this).aFloat10788 = class250.aFloatArray2728[9];
		((Class174_Sub2) this).aFloat10779 = class250.aFloatArray2728[10];
		((Class174_Sub2) this).aFloat10764 = class250.aFloatArray2728[11];
		((Class174_Sub2) this).aFloat10781 = class250.aFloatArray2728[12];
		((Class174_Sub2) this).aFloat10782 = class250.aFloatArray2728[13];
		((Class174_Sub2) this).aFloat10783 = class250.aFloatArray2728[14];
		((Class174_Sub2) this).aFloat10784 = class250.aFloatArray2728[15];
		for (int i_554_ = 0; i_554_ < i_552_ + i_552_; i_554_++) {
			for (int i_555_ = 0; i_555_ < i_552_ + i_552_; i_555_++) {
				if (bools[i_554_][i_555_]) {
					int i_556_ = i - i_552_ + i_554_;
					int i_557_ = i_551_ - i_552_ + i_555_;
					if (i_556_ >= 0 && i_556_ < anInt2086 * -1715487093 && i_557_ >= 0 && i_557_ < anInt2089 * 792439321)
						method10007(i_556_, i_557_, i_553_);
				}
			}
		}
	}

	public void method2739(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_558_, int i_559_, int i_560_, boolean bool) {
		/* empty */
	}

	public void method2740(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_561_, int i_562_, int i_563_, boolean bool) {
		/* empty */
	}

	public void method2741(Class572_Sub36 class572_sub36, int[] is) {
		/* empty */
	}

	public void method2733(Class572_Sub36 class572_sub36, int[] is) {
		/* empty */
	}

	public void method2717(Class572_Sub36 class572_sub36, int[] is) {
		/* empty */
	}
}
