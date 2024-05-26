package game;

/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class523 {
	int[][] anIntArrayArray5822;
	int anInt5823;
	int anInt5824;
	int anInt5825;
	int anInt5826 = 16;
	boolean[] aBoolArray5827;
	public Class533 aClass533_5828;
	boolean aBool5829;
	float[] aFloatArray5830;
	public static boolean aBool5831 = true;
	public int anInt5832;
	public int anInt5833;
	public int anInt5834;
	long[][][] aLongArrayArrayArray5835;
	int anInt5836 = 5062;
	public Class536[][][] aClass536ArrayArrayArray5837;
	public Class174[] aClass174Array5838;
	public Class536[][][] aClass536ArrayArrayArray5839;
	public Class174[] aClass174Array5840;
	static final int anInt5841 = 4;
	short[][] aShortArrayArray5842;
	int anInt5843;
	boolean[][] aBoolArrayArray5844;
	byte[][] aByteArrayArray5845;
	byte[][] aByteArrayArray5846;
	int anInt5847;
	int anInt5848 = 10003;
	public Class545 aClass545_5849;
	int anInt5850 = 5052;
	Class456_Sub1[] aClass456_Sub1Array5851;
	Class260 aClass260_5852;
	Class456_Sub1[] aClass456_Sub1Array5853;
	int anInt5854;
	int anInt5855;
	Class456_Sub1[] aClass456_Sub1Array5856;
	Class456_Sub1[] aClass456_Sub1Array5857;
	public int anInt5858;
	int anInt5859;
	byte[][] aByteArrayArray5860;
	int anInt5861 = 0;
	int anInt5862;
	int anInt5863;
	int anInt5864;
	int anInt5865;
	int anInt5866;
	int anInt5867;
	Class106 aClass106_5868;
	Class456_Sub1_Sub2[] aClass456_Sub1_Sub2Array5869;
	int anInt5870;
	int anInt5871;
	Class456_Sub1[] aClass456_Sub1Array5872;
	Class572_Sub36[] aClass572_Sub36Array5873;
	int anInt5874 = 65009;
	public Class174[] aClass174Array5875;
	int anInt5876;
	byte[][] aByteArrayArray5877;
	Class541[] aClass541Array5878;
	int anInt5879;
	HashMap aHashMap5880;
	HashMap aHashMap5881;
	public Class536[][][] aClass536ArrayArrayArray5882;
	boolean[][] aBoolArrayArray5883;
	int[] anIntArray5884;
	boolean[][] aBoolArrayArray5885;
	boolean aBool5886;

	public void method6223(int i, int i_0_) {
		/* empty */
	}

	public void method6224(Class102 class102, short i) {
		/* empty */
	}

	public void method6225(int i) {
		for (int i_1_ = 0; i_1_ < anInt5833 * -1396185127; i_1_++) {
			for (int i_2_ = 0; i_2_ < -1519623925 * anInt5834; i_2_++) {
				if (null == aClass536ArrayArrayArray5882[0][i_1_][i_2_])
					aClass536ArrayArrayArray5882[0][i_1_][i_2_] = new Class536(0);
			}
		}
	}

	public void method6226(int i, int i_3_, byte i_4_) {
		Class536 class536 = aClass536ArrayArrayArray5882[0][i][i_3_];
		for (int i_5_ = 0; i_5_ < 3; i_5_++) {
			Class536 class536_6_ = (aClass536ArrayArrayArray5882[i_5_][i][i_3_] = aClass536ArrayArrayArray5882[i_5_ + 1][i][i_3_]);
			if (class536_6_ != null) {
				for (Class543 class543 = class536_6_.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
					Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
					if (class456_sub1_sub2.aShort11503 == i && class456_sub1_sub2.aShort11500 == i_3_)
						class456_sub1_sub2.aByte9009--;
				}
				if (null != class536_6_.aClass456_Sub1_Sub1_5992)
					class536_6_.aClass456_Sub1_Sub1_5992.aByte9009--;
				if (null != class536_6_.aClass456_Sub1_Sub4_5988)
					class536_6_.aClass456_Sub1_Sub4_5988.aByte9009--;
				if (class536_6_.aClass456_Sub1_Sub4_5989 != null)
					class536_6_.aClass456_Sub1_Sub4_5989.aByte9009--;
				if (class536_6_.aClass456_Sub1_Sub3_5998 != null)
					class536_6_.aClass456_Sub1_Sub3_5998.aByte9009--;
				if (null != class536_6_.aClass456_Sub1_Sub3_5990)
					class536_6_.aClass456_Sub1_Sub3_5990.aByte9009--;
			}
		}
		if (null == aClass536ArrayArrayArray5882[0][i][i_3_]) {
			aClass536ArrayArrayArray5882[0][i][i_3_] = new Class536(0);
			aClass536ArrayArrayArray5882[0][i][i_3_].aByte5991 = (byte) 1;
		}
		aClass536ArrayArrayArray5882[0][i][i_3_].aClass536_5987 = class536;
		aClass536ArrayArrayArray5882[3][i][i_3_] = null;
	}

	Class536 method6227(int i, int i_7_, int i_8_, int i_9_) {
		if (null == aClass536ArrayArrayArray5882[i][i_7_][i_8_]) {
			boolean bool = (null != aClass536ArrayArrayArray5882[0][i_7_][i_8_] && (aClass536ArrayArrayArray5882[0][i_7_][i_8_].aClass536_5987) != null);
			if (bool && i >= anInt5832 * 1103813715 - 1)
				return null;
			method6228(i, i_7_, i_8_, (byte) 3);
		}
		return aClass536ArrayArrayArray5882[i][i_7_][i_8_];
	}

	public void method6228(int i, int i_10_, int i_11_, byte i_12_) {
		boolean bool = (null != aClass536ArrayArrayArray5882[0][i_10_][i_11_] && null != (aClass536ArrayArrayArray5882[0][i_10_][i_11_].aClass536_5987));
		for (int i_13_ = i; i_13_ >= 0; i_13_--) {
			if (aClass536ArrayArrayArray5882[i_13_][i_10_][i_11_] == null) {
				Class536 class536 = (aClass536ArrayArrayArray5882[i_13_][i_10_][i_11_] = new Class536(i_13_));
				if (bool)
					class536.aByte5991++;
			}
		}
	}

	public void method6229(int i, Class174 class174, int i_14_) {
		aClass174Array5875[i] = class174;
	}

	public int method6230(int i, int i_15_, int i_16_) {
		return (((Class523) this).aShortArrayArray5842 != null ? ((Class523) this).aShortArrayArray5842[i][i_15_] & 0xffff : 0);
	}

	public int method6231(int i, int i_17_, int i_18_) {
		return (((Class523) this).anIntArrayArray5822 != null ? ((Class523) this).anIntArrayArray5822[i][i_17_] & 0xffffff : 0);
	}

	public boolean method6232(Class456_Sub1_Sub2 class456_sub1_sub2, boolean bool, int i) {
		boolean bool_19_ = aClass174Array5875 == aClass174Array5840;
		int i_20_ = 0;
		short i_21_ = 0;
		byte i_22_ = 0;
		class456_sub1_sub2.method10469((byte) 33);
		short i_23_ = 0;
		int i_24_ = Math.min(-1396185127 * anInt5833 - 1, Math.max(0, class456_sub1_sub2.aShort11503));
		int i_25_ = Math.min(-1396185127 * anInt5833 - 1, Math.max(0, class456_sub1_sub2.aShort11499));
		int i_26_ = Math.min(anInt5834 * -1519623925 - 1, Math.max(0, class456_sub1_sub2.aShort11500));
		int i_27_ = Math.min(anInt5834 * -1519623925 - 1, Math.max(0, class456_sub1_sub2.aShort11502));
		for (int i_28_ = i_24_; i_28_ <= i_25_; i_28_++) {
			for (int i_29_ = i_26_; i_29_ <= i_27_; i_29_++) {
				Class536 class536 = method6269(class456_sub1_sub2.aByte9009, i_28_, i_29_, -1687638471);
				if (class536 != null) {
					Class543 class543 = Class70.method1080(class456_sub1_sub2, (byte) -1);
					Class543 class543_30_ = class536.aClass543_5994;
					if (null == class543_30_)
						class536.aClass543_5994 = class543;
					else {
						for (/**/; class543_30_.aClass543_6100 != null; class543_30_ = class543_30_.aClass543_6100) {
							/* empty */
						}
						class543_30_.aClass543_6100 = class543;
					}
					if (bool_19_ && (((Class523) this).anIntArrayArray5822[i_28_][i_29_] & ~0xffffff) != 0) {
						i_20_ = (((Class523) this).anIntArrayArray5822[i_28_][i_29_]);
						i_21_ = (((Class523) this).aShortArrayArray5842[i_28_][i_29_]);
						i_22_ = (((Class523) this).aByteArrayArray5877[i_28_][i_29_]);
					}
					if (!bool && class536.aClass456_Sub1_Sub1_5992 != null && (class536.aClass456_Sub1_Sub1_5992.aShort11275 > i_23_))
						i_23_ = class536.aClass456_Sub1_Sub1_5992.aShort11275;
				}
			}
		}
		if (bool_19_ && 0 != (i_20_ & ~0xffffff)) {
			for (int i_31_ = i_24_; i_31_ <= i_25_; i_31_++) {
				for (int i_32_ = i_26_; i_32_ <= i_27_; i_32_++) {
					if ((((Class523) this).anIntArrayArray5822[i_31_][i_32_] & ~0xffffff) == 0) {
						((Class523) this).anIntArrayArray5822[i_31_][i_32_] = i_20_;
						((Class523) this).aShortArrayArray5842[i_31_][i_32_] = i_21_;
						((Class523) this).aByteArrayArray5877[i_31_][i_32_] = i_22_;
					}
				}
			}
		}
		if (bool) {
			((Class523) this).aClass456_Sub1_Sub2Array5869[(((Class523) this).anInt5861 += 1058102529) * 934781697 - 1] = class456_sub1_sub2;
			class456_sub1_sub2.aClass523_9010 = this;
		} else {
			int i_33_ = aClass174Array5840 == aClass174Array5875 ? 1 : 0;
			if (class456_sub1_sub2.method8300(1713018684)) {
				if (class456_sub1_sub2.method8301((byte) 3)) {
					((Class456_Sub1_Sub2) class456_sub1_sub2).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_33_];
					((Class523) this).aClass456_Sub1Array5872[i_33_] = class456_sub1_sub2;
				} else {
					((Class456_Sub1_Sub2) class456_sub1_sub2).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_33_];
					((Class523) this).aClass456_Sub1Array5851[i_33_] = class456_sub1_sub2;
				}
			} else {
				((Class456_Sub1_Sub2) class456_sub1_sub2).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_33_];
				((Class523) this).aClass456_Sub1Array5853[i_33_] = class456_sub1_sub2;
			}
		}
		if (bool) {
			Class240 class240 = Class240.method3276(class456_sub1_sub2.method5394().aClass240_2647);
			class240.aFloat2656 -= (float) i_23_;
			class456_sub1_sub2.method5401(class240);
			class240.method3261();
		}
		return true;
	}

	public int method6233(int i, int i_34_, int i_35_) {
		return (null != ((Class523) this).aByteArrayArray5860 ? ((Class523) this).aByteArrayArray5860[i][i_34_] & 0xff : 0);
	}

	public int method6234(int i, int i_36_, byte i_37_) {
		return (((Class523) this).aByteArrayArray5845 != null ? ((Class523) this).aByteArrayArray5845[i][i_36_] & 0xff : 0);
	}

	public int method6235(int i, int i_38_, byte i_39_) {
		return (null != ((Class523) this).aByteArrayArray5846 ? ((Class523) this).aByteArrayArray5846[i][i_38_] & 0xff : 0);
	}

	void method6236(Class456_Sub1[] class456_sub1s, int i, int i_40_) {
		if (i < i_40_) {
			int i_41_ = (i + i_40_) / 2;
			int i_42_ = i;
			Class456_Sub1 class456_sub1 = class456_sub1s[i_41_];
			class456_sub1s[i_41_] = class456_sub1s[i_40_];
			class456_sub1s[i_40_] = class456_sub1;
			int i_43_ = -855434981 * ((Class456_Sub1) class456_sub1).anInt9005;
			for (int i_44_ = i; i_44_ < i_40_; i_44_++) {
				if ((-855434981 * ((Class456_Sub1) class456_sub1s[i_44_]).anInt9005) > (i_44_ & 0x1) + i_43_) {
					Class456_Sub1 class456_sub1_45_ = class456_sub1s[i_44_];
					class456_sub1s[i_44_] = class456_sub1s[i_42_];
					class456_sub1s[i_42_++] = class456_sub1_45_;
				}
			}
			class456_sub1s[i_40_] = class456_sub1s[i_42_];
			class456_sub1s[i_42_] = class456_sub1;
			method6236(class456_sub1s, i, i_42_ - 1);
			method6236(class456_sub1s, i_42_ + 1, i_40_);
		}
	}

	public void method6237(int i, int i_46_, int i_47_, Class456_Sub1_Sub1 class456_sub1_sub1, int i_48_) {
		Class536 class536 = method6227(i, i_46_, i_47_, -814835905);
		if (class536 != null) {
			class536.aClass456_Sub1_Sub1_5992 = class456_sub1_sub1;
			int i_49_ = aClass174Array5840 == aClass174Array5875 ? 1 : 0;
			if (class456_sub1_sub1.method8300(1091567521)) {
				if (class456_sub1_sub1.method8301((byte) 3)) {
					((Class456_Sub1_Sub1) class456_sub1_sub1).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_49_];
					((Class523) this).aClass456_Sub1Array5872[i_49_] = class456_sub1_sub1;
				} else {
					((Class456_Sub1_Sub1) class456_sub1_sub1).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_49_];
					((Class523) this).aClass456_Sub1Array5851[i_49_] = class456_sub1_sub1;
				}
			} else {
				((Class456_Sub1_Sub1) class456_sub1_sub1).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_49_];
				((Class523) this).aClass456_Sub1Array5853[i_49_] = class456_sub1_sub1;
			}
		}
	}

	public void method6238(int i, int i_50_, int i_51_, int i_52_, Class456_Sub1_Sub5 class456_sub1_sub5, short i_53_) {
		Class536 class536 = method6227(i, i_50_, i_51_, -702572568);
		if (null != class536) {
			class456_sub1_sub5.method5401(new Class240((float) ((i_50_ << 406704825 * anInt5858) + (((Class523) this).anInt5867 * -174465013)), (float) i_52_, (float) (((Class523) this).anInt5867 * -174465013 + (i_51_ << 406704825 * anInt5858))));
			((Class536) class536).aClass456_Sub1_Sub5_5993 = class456_sub1_sub5;
			int i_54_ = aClass174Array5840 == aClass174Array5875 ? 1 : 0;
			if (class456_sub1_sub5.method8300(-1746473755)) {
				if (class456_sub1_sub5.method8301((byte) 3)) {
					((Class456_Sub1_Sub5) class456_sub1_sub5).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_54_];
					((Class523) this).aClass456_Sub1Array5872[i_54_] = class456_sub1_sub5;
				} else {
					((Class456_Sub1_Sub5) class456_sub1_sub5).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_54_];
					((Class523) this).aClass456_Sub1Array5851[i_54_] = class456_sub1_sub5;
				}
			} else {
				((Class456_Sub1_Sub5) class456_sub1_sub5).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_54_];
				((Class523) this).aClass456_Sub1Array5853[i_54_] = class456_sub1_sub5;
			}
		}
	}

	public void method6239(int i, int i_55_, int i_56_, Class456_Sub1_Sub4 class456_sub1_sub4, Class456_Sub1_Sub4 class456_sub1_sub4_57_, int i_58_) {
		Class536 class536 = method6227(i, i_55_, i_56_, -790293422);
		if (class536 != null) {
			class536.aClass456_Sub1_Sub4_5988 = class456_sub1_sub4;
			class536.aClass456_Sub1_Sub4_5989 = class456_sub1_sub4_57_;
			int i_59_ = aClass174Array5875 == aClass174Array5840 ? 1 : 0;
			if (class456_sub1_sub4.method8300(357099000)) {
				if (class456_sub1_sub4.method8301((byte) 3)) {
					((Class456_Sub1_Sub4) class456_sub1_sub4).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_59_];
					((Class523) this).aClass456_Sub1Array5872[i_59_] = class456_sub1_sub4;
				} else {
					((Class456_Sub1_Sub4) class456_sub1_sub4).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_59_];
					((Class523) this).aClass456_Sub1Array5851[i_59_] = class456_sub1_sub4;
				}
			} else {
				((Class456_Sub1_Sub4) class456_sub1_sub4).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_59_];
				((Class523) this).aClass456_Sub1Array5853[i_59_] = class456_sub1_sub4;
			}
			if (null != class456_sub1_sub4_57_) {
				if (class456_sub1_sub4_57_.method8300(1855816323)) {
					if (class456_sub1_sub4_57_.method8301((byte) 3)) {
						((Class456_Sub1_Sub4) class456_sub1_sub4_57_).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_59_];
						((Class523) this).aClass456_Sub1Array5872[i_59_] = class456_sub1_sub4_57_;
					} else {
						((Class456_Sub1_Sub4) class456_sub1_sub4_57_).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_59_];
						((Class523) this).aClass456_Sub1Array5851[i_59_] = class456_sub1_sub4_57_;
					}
				} else {
					((Class456_Sub1_Sub4) class456_sub1_sub4_57_).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_59_];
					((Class523) this).aClass456_Sub1Array5853[i_59_] = class456_sub1_sub4_57_;
				}
			}
		}
	}

	public void method6240(int i, int i_60_, int i_61_, int i_62_, byte[][][] is, int[] is_63_, int[] is_64_, int[] is_65_, int[] is_66_, int[] is_67_, int i_68_, byte i_69_, int i_70_, int i_71_, boolean bool, boolean bool_72_, int i_73_, boolean bool_74_) {
		((Class533) aClass533_5828).aBool5939 = true;
		((Class523) this).aBool5886 = bool_72_;
		((Class523) this).anInt5859 = (i_60_ >> 406704825 * anInt5858) * 1525283009;
		((Class523) this).anInt5825 = -183488705 * (i_62_ >> anInt5858 * 406704825);
		((Class523) this).anInt5879 = i_60_ * 955349767;
		((Class523) this).anInt5862 = -1030786191 * i_62_;
		((Class523) this).anInt5863 = i_61_ * -806192859;
		((Class523) this).anInt5823 = (((Class523) this).anInt5859 * -114240873 - ((Class523) this).anInt5865 * -1289770217);
		if (1013127143 * ((Class523) this).anInt5823 < 0) {
			((Class523) this).anInt5866 = -(((Class523) this).anInt5823 * -1524911467);
			((Class523) this).anInt5823 = 0;
		} else
			((Class523) this).anInt5866 = 0;
		((Class523) this).anInt5870 = (-506274745 * ((Class523) this).anInt5825 - 824507193 * ((Class523) this).anInt5865);
		if (((Class523) this).anInt5870 * -614937655 < 0) {
			((Class523) this).anInt5843 = -(((Class523) this).anInt5870 * 1806898475);
			((Class523) this).anInt5870 = 0;
		} else
			((Class523) this).anInt5843 = 0;
		((Class523) this).anInt5847 = (((Class523) this).anInt5865 * 1614562609 + -198549071 * ((Class523) this).anInt5859);
		if (((Class523) this).anInt5847 * -1093672303 > anInt5833 * -1396185127)
			((Class523) this).anInt5847 = anInt5833 * 1821951177;
		((Class523) this).anInt5871 = (-1886172525 * ((Class523) this).anInt5865 + ((Class523) this).anInt5825 * 1868687341);
		if (1871453659 * ((Class523) this).anInt5871 > -1519623925 * anInt5834)
			((Class523) this).anInt5871 = -900470639 * anInt5834;
		boolean[][] bools = ((Class523) this).aBoolArrayArray5885;
		boolean[][] bools_75_ = ((Class523) this).aBoolArrayArray5883;
		if (((Class523) this).aBool5886) {
			for (int i_76_ = 0; i_76_ < 2 + (131560129 * ((Class523) this).anInt5865 + ((Class523) this).anInt5865 * 131560129); i_76_++) {
				int i_77_ = 0;
				int i_78_ = 0;
				for (int i_79_ = 0; i_79_ < (((Class523) this).anInt5865 * 131560129 + ((Class523) this).anInt5865 * 131560129 + 2); i_79_++) {
					if (i_79_ > 1)
						((Class523) this).anIntArray5884[i_79_ - 2] = i_77_;
					i_77_ = i_78_;
					int i_80_ = i_76_ + (((Class523) this).anInt5859 * 308188993 - 131560129 * ((Class523) this).anInt5865);
					int i_81_ = i_79_ + (((Class523) this).anInt5825 * -123518785 - 131560129 * ((Class523) this).anInt5865);
					if (i_80_ >= 0 && i_81_ >= 0 && i_80_ < anInt5833 * -1396185127 && i_81_ < -1519623925 * anInt5834) {
						int i_82_ = i_80_ << anInt5858 * 406704825;
						int i_83_ = i_81_ << anInt5858 * 406704825;
						int i_84_ = (aClass174Array5838[aClass174Array5838.length - 1].method2713(i_80_, i_81_, 1341611206) - (1000 << anInt5858 * 406704825 - 7));
						int i_85_ = ((null != aClass174Array5840 ? (aClass174Array5840[0].method2713(i_80_, i_81_, 401336169) + -1090619529 * ((Class523) this).anInt5824) : (aClass174Array5838[0].method2713(i_80_, i_81_, -1565868260) + (-1090619529 * ((Class523) this).anInt5824))) + (1000 << anInt5858 * 406704825 - 7));
						i_78_ = (((Class523) this).aClass106_5868.method1797(i_82_, i_84_, i_83_, i_82_, i_85_, i_83_));
						((Class523) this).aBoolArrayArray5883[i_76_][i_79_] = 0 == i_78_;
					} else {
						i_78_ = -1;
						((Class523) this).aBoolArrayArray5883[i_76_][i_79_] = false;
					}
					if (i_76_ > 0 && i_79_ > 0) {
						int i_86_ = (((Class523) this).anIntArray5884[i_79_ - 1] & ((Class523) this).anIntArray5884[i_79_] & i_77_ & i_78_);
						((Class523) this).aBoolArrayArray5885[i_76_ - 1][(i_79_ - 1)] = 0 == i_86_;
					}
				}
				((Class523) this).anIntArray5884[(131560129 * ((Class523) this).anInt5865 + ((Class523) this).anInt5865 * 131560129)] = i_77_;
				((Class523) this).anIntArray5884[(((Class523) this).anInt5865 * 131560129 + ((Class523) this).anInt5865 * 131560129 + 1)] = i_78_;
			}
			if (!bool_74_)
				((Class533) aClass533_5828).aBool5939 = false;
			else {
				((Class533) aClass533_5828).anIntArray5948 = is_63_;
				((Class533) aClass533_5828).anIntArray5958 = is_64_;
				((Class533) aClass533_5828).anIntArray5938 = is_65_;
				((Class533) aClass533_5828).anIntArray5960 = is_66_;
				((Class533) aClass533_5828).anIntArray5961 = is_67_;
				aClass533_5828.method6353(((Class523) this).aClass106_5868, i_68_);
			}
		} else {
			if (((Class523) this).aBoolArrayArray5844 == null)
				((Class523) this).aBoolArrayArray5844 = (new boolean[2 + (((Class523) this).anInt5865 * 131560129 + 131560129 * ((Class523) this).anInt5865)][(((Class523) this).anInt5865 * 131560129 + ((Class523) this).anInt5865 * 131560129 + 2)]);
			for (int i_87_ = 0; i_87_ < ((Class523) this).aBoolArrayArray5844.length; i_87_++) {
				for (int i_88_ = 0; i_88_ < ((Class523) this).aBoolArrayArray5844[0].length; i_88_++)
					((Class523) this).aBoolArrayArray5844[i_87_][i_88_] = true;
			}
			((Class523) this).aBoolArrayArray5883 = ((Class523) this).aBoolArrayArray5844;
			((Class523) this).aBoolArrayArray5885 = ((Class523) this).aBoolArrayArray5844;
			((Class523) this).anInt5823 = 0;
			((Class523) this).anInt5870 = 0;
			((Class523) this).anInt5847 = anInt5833 * 1821951177;
			((Class523) this).anInt5871 = -900470639 * anInt5834;
			((Class533) aClass533_5828).aBool5939 = false;
		}
		Class110.method2071(this, ((Class523) this).aClass106_5868, (byte) -6);
		if (!((Class545) aClass545_5849).aBool6111) {
			Iterator iterator = aClass545_5849.aList6110.iterator();
			while (iterator.hasNext()) {
				Class531 class531 = (Class531) iterator.next();
				iterator.remove();
				Class578.method6834(class531, 1585550696);
			}
		}
		if (((Class523) this).aBool5829) {
			for (int i_89_ = 0; i_89_ < -2040710715 * ((Class523) this).anInt5876; i_89_++)
				((Class523) this).aClass541Array5878[i_89_].method6424(i, bool, (short) 2460);
		}
		if (null != aClass536ArrayArrayArray5839) {
			method6266(true, 1522275695);
			((Class523) this).aClass106_5868.method1789(-1, new Class86(1583160, 40, 127, 63, 0, 0, 0));
			method6257(true, is, i_68_, i_69_, i_73_);
			((Class523) this).aClass106_5868.method1791();
			method6266(false, 2036431257);
		}
		method6257(false, is, i_68_, i_69_, i_73_);
		if (!((Class523) this).aBool5886) {
			((Class523) this).aBoolArrayArray5885 = bools;
			((Class523) this).aBoolArrayArray5883 = bools_75_;
		}
	}

	public void method6241(int i) {
		for (int i_90_ = 0; i_90_ < -2040710715 * ((Class523) this).anInt5876; i_90_++) {
			if (!((Class523) this).aBoolArray5827[i_90_]) {
				Class541 class541 = ((Class523) this).aClass541Array5878[i_90_];
				Class572_Sub36 class572_sub36 = class541.aClass572_Sub36_6086;
				int i_91_ = 1399368809 * class541.anInt6079;
				int i_92_ = (class572_sub36.method8752((byte) 111) - ((Class523) this).anInt5867 * -174465013);
				int i_93_ = 1 + (i_92_ * 2 >> anInt5858 * 406704825);
				int i_94_ = 0;
				int[] is = new int[i_93_ * i_93_];
				int i_95_ = (class572_sub36.method8720(-58172609) - i_92_ >> anInt5858 * 406704825);
				int i_96_ = (class572_sub36.method8722(1993005356) - i_92_ >> 406704825 * anInt5858);
				int i_97_ = (class572_sub36.method8722(311800772) + i_92_ >> 406704825 * anInt5858);
				if (i_96_ < 0) {
					i_94_ -= i_96_;
					i_96_ = 0;
				}
				if (i_97_ >= anInt5834 * -1519623925)
					i_97_ = anInt5834 * -1519623925 - 1;
				for (int i_98_ = i_96_; i_98_ <= i_97_; i_98_++) {
					int i_99_ = ((Class541) class541).aShortArray6069[i_94_];
					int i_100_ = i_99_ >>> 8;
					int i_101_ = i_94_ * i_93_ + i_100_;
					int i_102_ = (i_99_ >>> 8) + i_95_;
					int i_103_ = i_102_ + (i_99_ & 0xff) - 1;
					if (i_102_ < 0) {
						i_101_ -= i_102_;
						i_102_ = 0;
					}
					if (i_103_ >= -1396185127 * anInt5833)
						i_103_ = anInt5833 * -1396185127 - 1;
					for (int i_104_ = i_102_; i_104_ <= i_103_; i_104_++) {
						int i_105_ = 1;
						Class456_Sub1_Sub2 class456_sub1_sub2 = method6246(i_91_, i_104_, i_98_, null, (byte) -19);
						if (null != class456_sub1_sub2 && 0 != (((Class456_Sub1_Sub2) class456_sub1_sub2).aByte11501)) {
							if (1 == (((Class456_Sub1_Sub2) class456_sub1_sub2).aByte11501)) {
								boolean bool = i_104_ - 1 >= i_102_;
								boolean bool_106_ = i_104_ + 1 <= i_103_;
								if (!bool && i_98_ + 1 <= i_97_) {
									int i_107_ = (((Class541) class541).aShortArray6069[i_94_ + 1]);
									int i_108_ = i_95_ + (i_107_ >>> 8);
									int i_109_ = i_108_ + (i_107_ & 0xff);
									bool = i_104_ > i_108_ && i_104_ < i_109_;
								}
								if (!bool_106_ && i_98_ - 1 >= i_96_) {
									int i_110_ = (((Class541) class541).aShortArray6069[i_94_ - 1]);
									int i_111_ = i_95_ + (i_110_ >>> 8);
									int i_112_ = i_111_ + (i_110_ & 0xff);
									bool_106_ = i_104_ > i_111_ && i_104_ < i_112_;
								}
								if (bool && !bool_106_)
									i_105_ = 4;
								else if (bool_106_ && !bool)
									i_105_ = 2;
							} else {
								boolean bool = i_104_ - 1 >= i_102_;
								boolean bool_113_ = 1 + i_104_ <= i_103_;
								if (!bool && i_98_ - 1 >= i_96_) {
									int i_114_ = (((Class541) class541).aShortArray6069[i_94_ - 1]);
									int i_115_ = i_95_ + (i_114_ >>> 8);
									int i_116_ = i_115_ + (i_114_ & 0xff);
									bool = i_104_ > i_115_ && i_104_ < i_116_;
								}
								if (!bool_113_ && i_98_ + 1 <= i_97_) {
									int i_117_ = (((Class541) class541).aShortArray6069[i_94_ + 1]);
									int i_118_ = i_95_ + (i_117_ >>> 8);
									int i_119_ = i_118_ + (i_117_ & 0xff);
									bool_113_ = i_104_ > i_118_ && i_104_ < i_119_;
								}
								if (bool && !bool_113_)
									i_105_ = 3;
								else if (bool_113_ && !bool)
									i_105_ = 5;
							}
						}
						is[i_101_++] = i_105_;
					}
					i_94_++;
				}
				((Class523) this).aBoolArray5827[i_90_] = true;
				if (aBool5831)
					aClass174Array5875[i_91_].method2724(class572_sub36, is);
			}
		}
	}

	public void method6242() {
		for (int i = 0; i < anInt5832 * 1103813715; i++) {
			for (int i_120_ = 0; i_120_ < anInt5833 * -1396185127; i_120_++) {
				for (int i_121_ = 0; i_121_ < anInt5834 * -1519623925; i_121_++) {
					Class536 class536 = aClass536ArrayArrayArray5882[i][i_120_][i_121_];
					if (class536 != null) {
						Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5988;
						Class456_Sub1_Sub4 class456_sub1_sub4_122_ = class536.aClass456_Sub1_Sub4_5989;
						if (class456_sub1_sub4 != null && class456_sub1_sub4.method8299(2001873350)) {
							method6256(class456_sub1_sub4, i, i_120_, i_121_, 1, 1);
							if (null != class456_sub1_sub4_122_ && class456_sub1_sub4_122_.method8299(2118672656)) {
								method6256(class456_sub1_sub4_122_, i, i_120_, i_121_, 1, 1);
								class456_sub1_sub4_122_.method8302(((Class523) this).aClass106_5868, class456_sub1_sub4, 0, 0, 0, false, -1372166767);
								class456_sub1_sub4_122_.method8303(259659157);
							}
							class456_sub1_sub4.method8303(259659157);
						}
						for (Class543 class543 = class536.aClass543_5994; class543 != null; class543 = class543.aClass543_6100) {
							Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
							if (null != class456_sub1_sub2 && class456_sub1_sub2.method8299(2137148492)) {
								method6256(class456_sub1_sub2, i, i_120_, i_121_, (class456_sub1_sub2.aShort11499 - class456_sub1_sub2.aShort11503 + 1), 1 + (class456_sub1_sub2.aShort11502 - (class456_sub1_sub2.aShort11500)));
								class456_sub1_sub2.method8303(259659157);
							}
						}
						Class456_Sub1_Sub1 class456_sub1_sub1 = class536.aClass456_Sub1_Sub1_5992;
						if (null != class456_sub1_sub1 && class456_sub1_sub1.method8299(2035595375)) {
							method6255(class456_sub1_sub1, i, i_120_, i_121_, 1177666890);
							class456_sub1_sub1.method8303(259659157);
						}
					}
				}
			}
		}
	}

	public Class456_Sub1_Sub4 method6243(int i, int i_123_, int i_124_, int i_125_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_123_][i_124_];
		if (class536 != null) {
			method6265(class536.aClass456_Sub1_Sub4_5988, (byte) -117);
			if (class536.aClass456_Sub1_Sub4_5988 != null) {
				Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5988;
				class536.aClass456_Sub1_Sub4_5988 = null;
				return class456_sub1_sub4;
			}
		}
		return null;
	}

	public Class456_Sub1_Sub4 method6244(int i, int i_126_, int i_127_, int i_128_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_126_][i_127_];
		if (null != class536) {
			method6265(class536.aClass456_Sub1_Sub4_5989, (byte) -17);
			if (class536.aClass456_Sub1_Sub4_5989 != null) {
				Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5989;
				class536.aClass456_Sub1_Sub4_5989 = null;
				return class456_sub1_sub4;
			}
		}
		return null;
	}

	public Class456_Sub1_Sub3 method6245(int i, int i_129_, int i_130_, int i_131_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_129_][i_130_];
		if (class536 != null) {
			method6265(class536.aClass456_Sub1_Sub3_5998, (byte) -7);
			if (class536.aClass456_Sub1_Sub3_5998 != null) {
				Class456_Sub1_Sub3 class456_sub1_sub3 = class536.aClass456_Sub1_Sub3_5998;
				class536.aClass456_Sub1_Sub3_5998 = null;
				return class456_sub1_sub3;
			}
		}
		return null;
	}

	public Class456_Sub1_Sub2 method6246(int i, int i_132_, int i_133_, Interface62 interface62, byte i_134_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_132_][i_133_];
		if (null == class536)
			return null;
		for (Class543 class543 = class536.aClass543_5994; class543 != null; class543 = class543.aClass543_6100) {
			Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
			if ((interface62 == null || interface62.method374(class456_sub1_sub2, 1886399620)) && class456_sub1_sub2.aShort11503 == i_132_ && i_133_ == class456_sub1_sub2.aShort11500)
				return class456_sub1_sub2;
		}
		return null;
	}

	public Class456_Sub1_Sub2 method6247(int i, int i_135_, int i_136_, Interface62 interface62, byte i_137_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_135_][i_136_];
		if (null == class536)
			return null;
		for (Class543 class543 = class536.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
			Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
			if ((null == interface62 || interface62.method374(class456_sub1_sub2, 448036780)) && i_135_ == class456_sub1_sub2.aShort11503 && i_136_ == class456_sub1_sub2.aShort11500) {
				method6248(class456_sub1_sub2, false, (byte) 0);
				return class456_sub1_sub2;
			}
		}
		return null;
	}

	void method6248(Class456_Sub1_Sub2 class456_sub1_sub2, boolean bool, byte i) {
		int i_138_ = Math.min(anInt5833 * -1396185127 - 1, Math.max(0, class456_sub1_sub2.aShort11503));
		int i_139_ = Math.min(-1396185127 * anInt5833 - 1, Math.max(0, class456_sub1_sub2.aShort11499));
		int i_140_ = Math.min(-1519623925 * anInt5834 - 1, Math.max(0, class456_sub1_sub2.aShort11500));
		int i_141_ = Math.min(anInt5834 * -1519623925 - 1, Math.max(0, class456_sub1_sub2.aShort11502));
		for (int i_142_ = i_138_; i_142_ <= i_139_; i_142_++) {
			for (int i_143_ = i_140_; i_143_ <= i_141_; i_143_++) {
				Class536 class536 = (aClass536ArrayArrayArray5882[class456_sub1_sub2.aByte9009][i_142_][i_143_]);
				if (class536 != null) {
					Class543 class543 = class536.aClass543_5994;
					Class543 class543_144_ = null;
					for (/**/; class543 != null; class543 = class543.aClass543_6100) {
						if (class543.aClass456_Sub1_Sub2_6099 == class456_sub1_sub2) {
							if (null != class543_144_)
								class543_144_.aClass543_6100 = class543.aClass543_6100;
							else
								class536.aClass543_5994 = class543.aClass543_6100;
							class543.method6440(1292219987);
							break;
						}
						class543_144_ = class543;
					}
				}
			}
		}
		if (!bool)
			method6265(class456_sub1_sub2, (byte) -50);
	}

	public void method6249(int i, int i_145_, int i_146_) {
		List list = (List) ((Class523) this).aHashMap5880.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				class541.aClass572_Sub36_6086.method8730(i_145_, i_146_, 2053829628);
			}
		}
	}

	public Class456_Sub1_Sub4 method6250(int i, int i_147_, int i_148_, int i_149_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_147_][i_148_];
		if (class536 == null)
			return null;
		return class536.aClass456_Sub1_Sub4_5989;
	}

	public Class456_Sub1_Sub3 method6251(int i, int i_150_, int i_151_, int i_152_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_150_][i_151_];
		if (null == class536)
			return null;
		return class536.aClass456_Sub1_Sub3_5998;
	}

	public void method6252(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_) {
		if (((Class523) this).anIntArrayArray5822 != null)
			((Class523) this).anIntArrayArray5822[i][i_153_] = ~0xffffff | i_154_;
		if (((Class523) this).aShortArrayArray5842 != null)
			((Class523) this).aShortArrayArray5842[i][i_153_] = (short) i_155_;
		if (null != ((Class523) this).aByteArrayArray5877)
			((Class523) this).aByteArrayArray5877[i][i_153_] = (byte) i_156_;
		if (null != ((Class523) this).aByteArrayArray5860)
			((Class523) this).aByteArrayArray5860[i][i_153_] = (byte) i_157_;
		if (null != ((Class523) this).aByteArrayArray5845)
			((Class523) this).aByteArrayArray5845[i][i_153_] = (byte) i_158_;
		if (((Class523) this).aByteArrayArray5846 != null)
			((Class523) this).aByteArrayArray5846[i][i_153_] = (byte) i_159_;
	}

	public void method6253(short i) {
		for (int i_161_ = 0; i_161_ < ((Class523) this).anInt5861 * 934781697; i_161_++) {
			Class456_Sub1_Sub2 class456_sub1_sub2 = ((Class523) this).aClass456_Sub1_Sub2Array5869[i_161_];
			method6248(class456_sub1_sub2, true, (byte) 0);
			((Class523) this).aClass456_Sub1_Sub2Array5869[i_161_] = null;
		}
		((Class523) this).anInt5861 = 0;
	}

	public Class456_Sub1_Sub1 method6254(int i, int i_162_, int i_163_, int i_164_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_162_][i_163_];
		if (null == class536 || class536.aClass456_Sub1_Sub1_5992 == null)
			return null;
		return class536.aClass456_Sub1_Sub1_5992;
	}

	void method6255(Class456_Sub1 class456_sub1, int i, int i_165_, int i_166_, int i_167_) {
		if (i_165_ < -1396185127 * anInt5833) {
			Class536 class536 = aClass536ArrayArrayArray5882[i][1 + i_165_][i_166_];
			if (null != class536 && null != class536.aClass456_Sub1_Sub1_5992 && class536.aClass456_Sub1_Sub1_5992.method8299(2138408049)) {
				int i_168_ = ((aClass174Array5875[i].method2713(1 + i_165_, i_166_, -50748659) + aClass174Array5875[i].method2713(1 + i_165_ + 1, i_166_, -1332892417) + aClass174Array5875[i].method2713(i_165_ + 1, i_166_ + 1, 2138114196) + aClass174Array5875[i].method2713(1 + (1 + i_165_), i_166_ + 1, 181158386)) / 4 - (aClass174Array5875[i].method2713(i_165_, i_166_, -587270136) + aClass174Array5875[i].method2713(1 + i_165_, i_166_, 304712275) + aClass174Array5875[i].method2713(i_165_, 1 + i_166_, -1977698261) + aClass174Array5875[i].method2713(1 + i_165_, i_166_ + 1, 753343939)) / 4);
				class456_sub1.method8302(((Class523) this).aClass106_5868, class536.aClass456_Sub1_Sub1_5992, (-1090619529 * ((Class523) this).anInt5824), i_168_, 0, true, 861938713);
			}
		}
		if (i_166_ < -1396185127 * anInt5833) {
			Class536 class536 = aClass536ArrayArrayArray5882[i][i_165_][i_166_ + 1];
			if (class536 != null && class536.aClass456_Sub1_Sub1_5992 != null && class536.aClass456_Sub1_Sub1_5992.method8299(2090992600)) {
				int i_169_ = ((aClass174Array5875[i].method2713(i_165_, i_166_, 859940874) + aClass174Array5875[i].method2713(1 + i_165_, i_166_ + 1, -1828090509) + aClass174Array5875[i].method2713(i_165_, 1 + i_166_ + 1, -2022615341) + aClass174Array5875[i].method2713(i_165_ + 1, 1 + i_166_ + 1, -306034564)) / 4 - (aClass174Array5875[i].method2713(i_165_, i_166_, -1683404641) + aClass174Array5875[i].method2713(i_165_ + 1, i_166_, -1494125268) + aClass174Array5875[i].method2713(i_165_, i_166_ + 1, 1469462594) + aClass174Array5875[i].method2713(i_165_ + 1, i_166_ + 1, -366342316)) / 4);
				class456_sub1.method8302(((Class523) this).aClass106_5868, class536.aClass456_Sub1_Sub1_5992, 0, i_169_, (-1090619529 * ((Class523) this).anInt5824), true, 1881865318);
			}
		}
		if (i_165_ < -1396185127 * anInt5833 && i_166_ < anInt5834 * -1519623925) {
			Class536 class536 = aClass536ArrayArrayArray5882[i][i_165_ + 1][i_166_ + 1];
			if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null && class536.aClass456_Sub1_Sub1_5992.method8299(2070697005)) {
				int i_170_ = ((aClass174Array5875[i].method2713(i_165_ + 1, i_166_ + 1, -1485461984) + aClass174Array5875[i].method2713(1 + (i_165_ + 1), 1 + i_166_, -1560831075) + aClass174Array5875[i].method2713(i_165_ + 1, 1 + (i_166_ + 1), -38960135) + aClass174Array5875[i].method2713(i_165_ + 1 + 1, i_166_ + 1 + 1, 1053409234)) / 4 - ((aClass174Array5875[i].method2713(i_165_, i_166_, 1851837882) + aClass174Array5875[i].method2713(1 + i_165_, i_166_, 1491013685) + aClass174Array5875[i].method2713(i_165_, 1 + i_166_, -1664950453) + aClass174Array5875[i].method2713(i_165_ + 1, i_166_ + 1, -1060281909)) / 4));
				class456_sub1.method8302(((Class523) this).aClass106_5868, class536.aClass456_Sub1_Sub1_5992, (((Class523) this).anInt5824 * -1090619529), i_170_, (((Class523) this).anInt5824 * -1090619529), true, -1055729954);
			}
		}
		if (i_165_ < anInt5833 * -1396185127 && i_166_ > 0) {
			Class536 class536 = aClass536ArrayArrayArray5882[i][1 + i_165_][i_166_ - 1];
			if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null && class536.aClass456_Sub1_Sub1_5992.method8299(2137999864)) {
				int i_171_ = ((aClass174Array5875[i].method2713(i_165_ + 1, i_166_ - 1, -633841819) + aClass174Array5875[i].method2713(1 + i_165_ + 1, i_166_ - 1, -707071567) + aClass174Array5875[i].method2713(i_165_ + 1, i_166_ + 1 - 1, 393303898) + aClass174Array5875[i].method2713(1 + (i_165_ + 1), 1 + i_166_ - 1, -1623150233)) / 4 - (aClass174Array5875[i].method2713(i_165_, i_166_, 1284894700) + aClass174Array5875[i].method2713(1 + i_165_, i_166_, 1352861730) + aClass174Array5875[i].method2713(i_165_, i_166_ + 1, 1146784536) + aClass174Array5875[i].method2713(1 + i_165_, 1 + i_166_, 1335056668)) / 4);
				class456_sub1.method8302(((Class523) this).aClass106_5868, class536.aClass456_Sub1_Sub1_5992, (((Class523) this).anInt5824 * -1090619529), i_171_, -(((Class523) this).anInt5824 * -1090619529), true, -869106418);
			}
		}
	}

	void method6256(Class456_Sub1 class456_sub1, int i, int i_172_, int i_173_, int i_174_, int i_175_) {
		boolean bool = true;
		int i_176_ = i_172_;
		int i_177_ = i_172_ + i_174_;
		int i_178_ = i_173_ - 1;
		int i_179_ = i_173_ + i_175_;
		for (int i_180_ = i; i_180_ <= i + 1; i_180_++) {
			if (1103813715 * anInt5832 != i_180_) {
				for (int i_181_ = i_176_; i_181_ <= i_177_; i_181_++) {
					if (i_181_ >= 0 && i_181_ < anInt5833 * -1396185127) {
						for (int i_182_ = i_178_; i_182_ <= i_179_; i_182_++) {
							if (i_182_ >= 0 && i_182_ < -1519623925 * anInt5834 && (!bool || i_181_ >= i_177_ || i_182_ >= i_179_ || i_182_ < i_173_ && i_172_ != i_181_)) {
								Class536 class536 = (aClass536ArrayArrayArray5882[i_180_][i_181_][i_182_]);
								if (class536 != null) {
									int i_183_ = (((aClass174Array5875[i_180_].method2713(i_181_, i_182_, -1956699413)) + (aClass174Array5875[i_180_].method2713(1 + i_181_, i_182_, -406741275)) + (aClass174Array5875[i_180_].method2713(i_181_, i_182_ + 1, -963046071)) + (aClass174Array5875[i_180_].method2713(i_181_ + 1, 1 + i_182_, -1934988368))) / 4 - ((aClass174Array5875[i].method2713(i_172_, i_173_, -843815734)) + (aClass174Array5875[i].method2713(i_172_ + 1, i_173_, 100834983)) + (aClass174Array5875[i].method2713(i_172_, 1 + i_173_, 1448490623)) + (aClass174Array5875[i].method2713(i_172_ + 1, i_173_ + 1, -1259921863))) / 4);
									Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5988;
									Class456_Sub1_Sub4 class456_sub1_sub4_184_ = class536.aClass456_Sub1_Sub4_5989;
									if (class456_sub1_sub4 != null && class456_sub1_sub4.method8299(2006202701))
										class456_sub1.method8302(((Class523) this).aClass106_5868, class456_sub1_sub4, ((-1090619529 * ((Class523) this).anInt5824 * (i_181_ - i_172_)) + (((Class523) this).anInt5867 * -174465013 * (1 - i_174_))), i_183_, ((((Class523) this).anInt5867 * -174465013 * (1 - i_175_)) + ((i_182_ - i_173_) * (-1090619529 * (((Class523) this).anInt5824)))), bool, -250814685);
									if (class456_sub1_sub4_184_ != null && class456_sub1_sub4_184_.method8299(2059049555))
										class456_sub1.method8302(((Class523) this).aClass106_5868, class456_sub1_sub4_184_, ((-1090619529 * ((Class523) this).anInt5824 * (i_181_ - i_172_)) + ((1 - i_174_) * (((Class523) this).anInt5867 * -174465013))), i_183_, (((i_182_ - i_173_) * (((Class523) this).anInt5824 * -1090619529)) + (((Class523) this).anInt5867 * -174465013 * (1 - i_175_))), bool, -1013126935);
									for (Class543 class543 = class536.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
										Class456_Sub1_Sub2 class456_sub1_sub2 = (class543.aClass456_Sub1_Sub2_6099);
										if (class456_sub1_sub2 != null && class456_sub1_sub2.method8299(2018408629) && (i_181_ == (class456_sub1_sub2.aShort11503) || i_176_ == i_181_) && ((class456_sub1_sub2.aShort11500 == i_182_) || i_182_ == i_178_)) {
											int i_185_ = 1 + ((class456_sub1_sub2.aShort11499) - (class456_sub1_sub2.aShort11503));
											int i_186_ = ((class456_sub1_sub2.aShort11502) - (class456_sub1_sub2.aShort11500) + 1);
											class456_sub1.method8302((((Class523) this).aClass106_5868), class456_sub1_sub2, (((i_185_ - i_174_) * ((((Class523) this).anInt5867) * -174465013)) + (((class456_sub1_sub2.aShort11503) - i_172_) * (-1090619529 * (((Class523) this).anInt5824)))), i_183_, ((((Class523) this).anInt5824 * -1090619529 * ((class456_sub1_sub2.aShort11500) - i_173_)) + ((i_186_ - i_175_) * (-174465013 * (((Class523) this).anInt5867)))), bool, 22427479);
										}
									}
								}
							}
						}
					}
				}
				i_176_--;
				bool = false;
			}
		}
	}

	void method6257(boolean bool, byte[][][] is, int i, byte i_187_, int i_188_) {
		int i_189_ = bool ? 1 : 0;
		((Class523) this).anInt5854 = 0;
		((Class523) this).anInt5855 = 0;
		((Class523) this).anInt5864 += 534914707;
		if ((i_188_ & 0x2) == 0) {
			for (Class456_Sub1 class456_sub1 = ((Class523) this).aClass456_Sub1Array5851[i_189_]; null != class456_sub1; class456_sub1 = ((Class456_Sub1) class456_sub1).aClass456_Sub1_9006) {
				method6258(class456_sub1, (byte) -49);
				if ((-1 != ((Class456_Sub1) class456_sub1).anInt9005 * -855434981) && !method6260(class456_sub1, bool, is, i, i_187_))
					((Class523) this).aClass456_Sub1Array5857[((((Class523) this).anInt5854 += -1095675637) * 462942883) - 1] = class456_sub1;
			}
		}
		if (0 == (i_188_ & 0x1)) {
			for (Class456_Sub1 class456_sub1 = ((Class523) this).aClass456_Sub1Array5872[i_189_]; class456_sub1 != null; class456_sub1 = ((Class456_Sub1) class456_sub1).aClass456_Sub1_9006) {
				method6258(class456_sub1, (byte) 1);
				if ((-1 != ((Class456_Sub1) class456_sub1).anInt9005 * -855434981) && !method6260(class456_sub1, bool, is, i, i_187_))
					((Class523) this).aClass456_Sub1Array5856[((((Class523) this).anInt5855 += -1363564025) * -1064066121) - 1] = class456_sub1;
			}
			for (Class456_Sub1 class456_sub1 = ((Class523) this).aClass456_Sub1Array5853[i_189_]; null != class456_sub1; class456_sub1 = ((Class456_Sub1) class456_sub1).aClass456_Sub1_9006) {
				method6258(class456_sub1, (byte) 55);
				if ((((Class456_Sub1) class456_sub1).anInt9005 * -855434981 != -1) && !method6260(class456_sub1, bool, is, i, i_187_)) {
					if (class456_sub1.method8301((byte) 3))
						((Class523) this).aClass456_Sub1Array5856[((((Class523) this).anInt5855 += -1363564025) * -1064066121) - 1] = class456_sub1;
					else
						((Class523) this).aClass456_Sub1Array5857[((((Class523) this).anInt5854 += -1095675637) * 462942883) - 1] = class456_sub1;
				}
			}
			if (!bool) {
				for (int i_190_ = 0; i_190_ < 934781697 * ((Class523) this).anInt5861; i_190_++) {
					method6258((((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_]), (byte) -11);
					if ((((Class456_Sub1_Sub2) (((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_])).anInt9005 * -855434981) != -1 && !method6260((((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_]), bool, is, i, i_187_)) {
						if (((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_].method8301((byte) 3))
							((Class523) this).aClass456_Sub1Array5856[((((Class523) this).anInt5855 += -1363564025) * -1064066121) - 1] = (((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_]);
						else
							((Class523) this).aClass456_Sub1Array5857[((((Class523) this).anInt5854 += -1095675637) * 462942883) - 1] = (((Class523) this).aClass456_Sub1_Sub2Array5869[i_190_]);
					}
				}
			}
		}
		if (((Class523) this).anInt5854 * 462942883 > 0) {
			method6281(((Class523) this).aClass456_Sub1Array5857, 0, 462942883 * ((Class523) this).anInt5854 - 1);
			for (int i_191_ = 0; i_191_ < ((Class523) this).anInt5854 * 462942883; i_191_++)
				method6280(((Class523) this).aClass456_Sub1Array5857[i_191_], ((Class523) this).aClass572_Sub36Array5873);
		}
		if (((Class523) this).aBool5829)
			((Class523) this).aClass106_5868.method1772(0, null);
		if (0 == (i_188_ & 0x2)) {
			for (int i_192_ = 0; i_192_ < anInt5832 * 1103813715; i_192_++) {
				if (i_192_ >= i && null != is) {
					int i_193_ = ((Class523) this).aBoolArrayArray5885.length;
					if ((((Class523) this).anInt5823 * 1013127143 + ((Class523) this).aBoolArrayArray5885.length) > -1396185127 * anInt5833)
						i_193_ -= (1013127143 * ((Class523) this).anInt5823 + ((Class523) this).aBoolArrayArray5885.length - anInt5833 * -1396185127);
					int i_194_ = ((Class523) this).aBoolArrayArray5885[0].length;
					if ((-614937655 * ((Class523) this).anInt5870 + ((Class523) this).aBoolArrayArray5885[0].length) > anInt5834 * -1519623925)
						i_194_ -= (((Class523) this).aBoolArrayArray5885[0].length + ((Class523) this).anInt5870 * -614937655 - anInt5834 * -1519623925);
					boolean[][] bools = ((Class523) this).aBoolArrayArray5883;
					if (((Class523) this).aBool5886) {
						for (int i_195_ = -1890230901 * ((Class523) this).anInt5866; i_195_ < i_193_; i_195_++) {
							int i_196_ = (((Class523) this).anInt5823 * 1013127143 + i_195_ - (((Class523) this).anInt5866 * -1890230901));
							for (int i_197_ = (1408831707 * ((Class523) this).anInt5843); i_197_ < i_194_; i_197_++) {
								bools[i_195_][i_197_] = false;
								if (((Class523) this).aBoolArrayArray5885[i_195_][i_197_]) {
									int i_198_ = (i_197_ + (((Class523) this).anInt5870 * -614937655) - (((Class523) this).anInt5843 * 1408831707));
									for (int i_199_ = i_192_; i_199_ >= 0; i_199_--) {
										if ((null != (aClass536ArrayArrayArray5882[i_199_][i_196_][i_198_])) && (aClass536ArrayArrayArray5882[i_199_][i_196_][i_198_].aByte5991) == i_192_) {
											if ((i_199_ >= i && (is[i_199_][i_196_][i_198_] == i_187_)) || (aClass533_5828.method6368(i_192_, i_196_, i_198_)))
												bools[i_195_][i_197_] = false;
											else
												bools[i_195_][i_197_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass174Array5875[i_192_].method2715(((Class523) this).anInt5859 * 308188993, ((Class523) this).anInt5825 * -123518785, ((Class523) this).anInt5865 * 131560129, ((Class523) this).aBoolArrayArray5883, false, i_188_);
				} else {
					int i_200_ = ((Class523) this).aBoolArrayArray5885.length;
					if ((((Class523) this).anInt5823 * 1013127143 + ((Class523) this).aBoolArrayArray5885.length) > anInt5833 * -1396185127)
						i_200_ -= (((Class523) this).aBoolArrayArray5885.length + 1013127143 * ((Class523) this).anInt5823 - -1396185127 * anInt5833);
					int i_201_ = ((Class523) this).aBoolArrayArray5885[0].length;
					if ((-614937655 * ((Class523) this).anInt5870 + ((Class523) this).aBoolArrayArray5885[0].length) > anInt5834 * -1519623925)
						i_201_ -= (-614937655 * ((Class523) this).anInt5870 + (((Class523) this).aBoolArrayArray5885[0]).length - -1519623925 * anInt5834);
					boolean[][] bools = ((Class523) this).aBoolArrayArray5883;
					if (((Class523) this).aBool5886) {
						for (int i_202_ = -1890230901 * ((Class523) this).anInt5866; i_202_ < i_200_; i_202_++) {
							int i_203_ = (((Class523) this).anInt5823 * 1013127143 + i_202_ - (((Class523) this).anInt5866 * -1890230901));
							for (int i_204_ = (1408831707 * ((Class523) this).anInt5843); i_204_ < i_201_; i_204_++) {
								if ((((Class523) this).aBoolArrayArray5885[i_202_][i_204_]) && !(aClass533_5828.method6368(i_192_, i_203_, ((-614937655 * ((Class523) this).anInt5870) + i_204_ - (((Class523) this).anInt5843 * 1408831707)))))
									bools[i_202_][i_204_] = true;
								else
									bools[i_202_][i_204_] = false;
							}
						}
					}
					aClass174Array5875[i_192_].method2715(308188993 * ((Class523) this).anInt5859, ((Class523) this).anInt5825 * -123518785, 131560129 * ((Class523) this).anInt5865, ((Class523) this).aBoolArrayArray5883, true, i_188_);
				}
			}
		}
		if (-1064066121 * ((Class523) this).anInt5855 > 0) {
			method6236(((Class523) this).aClass456_Sub1Array5856, 0, -1064066121 * ((Class523) this).anInt5855 - 1);
			for (int i_205_ = 0; i_205_ < -1064066121 * ((Class523) this).anInt5855; i_205_++)
				method6280(((Class523) this).aClass456_Sub1Array5856[i_205_], ((Class523) this).aClass572_Sub36Array5873);
		}
	}

	void method6258(Class456_Sub1 class456_sub1, byte i) {
		Class240 class240 = class456_sub1.method5394().aClass240_2647;
		((Class523) this).aClass106_5868.method2035((float) (int) class240.aFloat2653, (float) ((int) class240.aFloat2656 + (class456_sub1.method8310((byte) -74) >> 1)), (float) (int) class240.aFloat2657, ((Class523) this).aFloatArray5830);
		((Class456_Sub1) class456_sub1).anInt9005 = (int) ((Class523) this).aFloatArray5830[2] * -594765549;
	}

	public void method6259(int i) {
		/* empty */
	}

	boolean method6260(Class456_Sub1 class456_sub1, boolean bool, byte[][][] is, int i, byte i_206_) {
		if (!((Class523) this).aBool5886)
			return false;
		if (class456_sub1 instanceof Class456_Sub1_Sub2) {
			int i_207_ = ((Class456_Sub1_Sub2) class456_sub1).aShort11499;
			int i_208_ = ((Class456_Sub1_Sub2) class456_sub1).aShort11502;
			int i_209_ = ((Class456_Sub1_Sub2) class456_sub1).aShort11503;
			int i_210_ = ((Class456_Sub1_Sub2) class456_sub1).aShort11500;
			for (int i_211_ = i_209_; i_211_ <= i_207_; i_211_++) {
				for (int i_212_ = i_210_; i_212_ <= i_208_; i_212_++) {
					if (class456_sub1.aByte9008 < 1103813715 * anInt5832 && i_211_ >= 1013127143 * ((Class523) this).anInt5823 && i_211_ < ((Class523) this).anInt5847 * -1093672303 && i_212_ >= ((Class523) this).anInt5870 * -614937655 && i_212_ < 1871453659 * ((Class523) this).anInt5871) {
						if ((null != is && class456_sub1.aByte9009 >= i && (is[class456_sub1.aByte9009][i_211_][i_212_] == i_206_)) || !class456_sub1.method8308(-1002607904) || class456_sub1.method8307((((Class523) this).aClass106_5868), 384242546)) {
							if (!bool && i_211_ >= 308188993 * (((Class523) this).anInt5859) - 16 && i_211_ <= (((Class523) this).anInt5859 * 308188993) + 16 && i_212_ >= (((Class523) this).anInt5825 * -123518785) - 16 && i_212_ <= -123518785 * (((Class523) this).anInt5825) + 16)
								class456_sub1.method8336((((Class523) this).aClass106_5868), 66308965);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class240 class240 = class456_sub1.method5394().aClass240_2647;
		int i_213_ = (int) class240.aFloat2653 >> 406704825 * anInt5858;
		int i_214_ = (int) class240.aFloat2657 >> 406704825 * anInt5858;
		if (class456_sub1.aByte9008 < 1103813715 * anInt5832 && i_213_ >= ((Class523) this).anInt5823 * 1013127143 && i_213_ < -1093672303 * ((Class523) this).anInt5847 && i_214_ >= ((Class523) this).anInt5870 * -614937655 && i_214_ < 1871453659 * ((Class523) this).anInt5871) {
			if ((is != null && class456_sub1.aByte9009 >= i && is[class456_sub1.aByte9009][i_213_][i_214_] == i_206_) || !class456_sub1.method8308(-1754930712) || class456_sub1.method8307(((Class523) this).aClass106_5868, 1453185827)) {
				if (!bool && i_213_ >= ((Class523) this).anInt5859 * 308188993 - 16 && i_213_ <= 308188993 * ((Class523) this).anInt5859 + 16 && i_214_ >= ((Class523) this).anInt5825 * -123518785 - 16 && i_214_ <= -123518785 * ((Class523) this).anInt5825 + 16)
					class456_sub1.method8336(((Class523) this).aClass106_5868, -55420913);
				return true;
			}
			return false;
		}
		return true;
	}

	public boolean method6261(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_215_, int i_216_, boolean[] bools, int i_217_) {
		boolean bool = false;
		if (aClass174Array5875 != aClass174Array5840) {
			int i_218_ = aClass174Array5838[i].method2726(i_215_, i_216_, 358769667);
			int i_219_ = 0;
			for (/**/; i_219_ <= i; i_219_++) {
				Class174 class174 = aClass174Array5838[i_219_];
				if (class174 != null) {
					int i_220_ = i_218_ - class174.method2726(i_215_, i_216_, 358769667);
					if (null != bools) {
						bools[i_219_] = class174.method2723(class572_sub12_sub18, i_215_, i_220_, i_216_, 0, false);
						if (!bools[i_219_])
							continue;
					}
					class174.method2721(class572_sub12_sub18, i_215_, i_220_, i_216_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public void method6262(Class541 class541, byte i) {
		if (((Class523) this).anInt5876 * -2040710715 < 65009) {
			Class572_Sub36 class572_sub36 = class541.aClass572_Sub36_6086;
			((Class523) this).aClass541Array5878[-2040710715 * ((Class523) this).anInt5876] = class541;
			((Class523) this).aBoolArray5827[(-2040710715 * ((Class523) this).anInt5876)] = false;
			((Class523) this).anInt5876 += 1075961101;
			int i_221_ = 1399368809 * class541.anInt6079;
			if (((Class541) class541).aBool6088)
				i_221_ = 0;
			int i_222_ = 1399368809 * class541.anInt6079;
			if (((Class541) class541).aBool6087)
				i_222_ = 1103813715 * anInt5832 - 1;
			for (int i_223_ = i_221_; i_223_ <= i_222_; i_223_++) {
				int i_224_ = 0;
				int i_225_ = ((class572_sub36.method8722(324789870) - class572_sub36.method8752((byte) 50) + -174465013 * ((Class523) this).anInt5867) >> 406704825 * anInt5858);
				if (i_225_ < 0) {
					i_224_ -= i_225_;
					i_225_ = 0;
				}
				int i_226_ = ((class572_sub36.method8722(1320261167) + class572_sub36.method8752((byte) 24) - -174465013 * ((Class523) this).anInt5867) >> 406704825 * anInt5858);
				if (i_226_ >= anInt5834 * -1519623925)
					i_226_ = anInt5834 * -1519623925 - 1;
				for (int i_227_ = i_225_; i_227_ <= i_226_; i_227_++) {
					int i_228_ = ((Class541) class541).aShortArray6069[i_224_++];
					int i_229_ = (((class572_sub36.method8720(1450672223) - class572_sub36.method8752((byte) 93) + -174465013 * ((Class523) this).anInt5867) >> anInt5858 * 406704825) + (i_228_ >>> 8));
					int i_230_ = i_229_ + (i_228_ & 0xff) - 1;
					if (i_229_ < 0)
						i_229_ = 0;
					if (i_230_ >= -1396185127 * anInt5833)
						i_230_ = anInt5833 * -1396185127 - 1;
					for (int i_231_ = i_229_; i_231_ <= i_230_; i_231_++) {
						long l = (((Class523) this).aLongArrayArrayArray5835[i_223_][i_231_][i_227_]);
						if ((l & 0xffffL) == 0L)
							((Class523) this).aLongArrayArrayArray5835[i_223_][i_231_][i_227_] = l | (long) (-2040710715 * ((Class523) this).anInt5876);
						else if (0L == (l & 0xffff0000L))
							((Class523) this).aLongArrayArrayArray5835[i_223_][i_231_][i_227_] = l | (long) (((Class523) this).anInt5876 * -2040710715) << 16;
						else if ((l & 0xffff00000000L) == 0L)
							((Class523) this).aLongArrayArrayArray5835[i_223_][i_231_][i_227_] = l | (long) (((Class523) this).anInt5876 * -2040710715) << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							((Class523) this).aLongArrayArrayArray5835[i_223_][i_231_][i_227_] = l | ((long) (-2040710715 * ((Class523) this).anInt5876) << 48);
					}
				}
			}
			if (((Class541) class541).anInt6097 * 848731757 != -1) {
				List list = (List) (((Class523) this).aHashMap5880.get(Integer.valueOf(((Class541) class541).anInt6097 * 848731757)));
				if (list == null) {
					list = new ArrayList();
					((Class523) this).aHashMap5880.put(Integer.valueOf(((Class541) class541).anInt6097 * 848731757), list);
				}
				list.add(class541);
				Class572_Sub36 class572_sub36_232_ = ((Class572_Sub36) (((Class523) this).aHashMap5881.get(Integer.valueOf(((Class541) class541).anInt6097 * 848731757))));
				if (null != class572_sub36_232_) {
					class541.aClass572_Sub36_6086.method8729(class572_sub36_232_.method8723(-1288611141), (byte) 0);
					class541.aClass572_Sub36_6086.method8730(class572_sub36_232_.method8727(1082048017), class572_sub36_232_.method8728(464121936), 2051254260);
				}
			}
		}
	}

	void method6263(int i, int i_233_, int i_234_) {
		Class572_Sub12_Sub18 class572_sub12_sub18 = null;
		for (int i_235_ = i; i_235_ < i_233_; i_235_++) {
			Class174 class174 = aClass174Array5838[i_235_];
			if (class174 != null) {
				for (int i_236_ = 0; i_236_ < anInt5834 * -1519623925; i_236_++) {
					for (int i_237_ = 0; i_237_ < anInt5833 * -1396185127; i_237_++) {
						class572_sub12_sub18 = class174.method2710(i_237_, i_236_, class572_sub12_sub18);
						if (class572_sub12_sub18 != null) {
							int i_238_ = i_237_ << anInt5858 * 406704825;
							int i_239_ = i_236_ << anInt5858 * 406704825;
							for (int i_240_ = i_235_ - 1; i_240_ >= 0; i_240_--) {
								Class174 class174_241_ = aClass174Array5838[i_240_];
								if (null != class174_241_) {
									int i_242_ = (class174.method2713(i_237_, i_236_, -125124065) - (class174_241_.method2713(i_237_, i_236_, 43020009)));
									int i_243_ = (class174.method2713(i_237_ + 1, i_236_, -1306072455) - (class174_241_.method2713(1 + i_237_, i_236_, -218941101)));
									int i_244_ = (class174.method2713(1 + i_237_, i_236_ + 1, -1897922792) - (class174_241_.method2713(1 + i_237_, i_236_ + 1, -1273264628)));
									int i_245_ = (class174.method2713(i_237_, i_236_ + 1, 1573094517) - (class174_241_.method2713(i_237_, 1 + i_236_, 1254052645)));
									class174_241_.method2721(class572_sub12_sub18, i_238_, ((i_244_ + (i_243_ + i_242_) + i_245_) / 4), i_239_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class456_Sub1_Sub3 method6264(int i, int i_246_, int i_247_, int i_248_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_246_][i_247_];
		if (class536 != null) {
			method6265(class536.aClass456_Sub1_Sub3_5990, (byte) -62);
			if (class536.aClass456_Sub1_Sub3_5990 != null) {
				Class456_Sub1_Sub3 class456_sub1_sub3 = class536.aClass456_Sub1_Sub3_5990;
				class536.aClass456_Sub1_Sub3_5990 = null;
				return class456_sub1_sub3;
			}
		}
		return null;
	}

	void method6265(Class456_Sub1 class456_sub1, byte i) {
		if (null != class456_sub1) {
			class456_sub1.method5403();
			for (int i_249_ = 0; i_249_ < 2; i_249_++) {
				Class456_Sub1 class456_sub1_250_ = null;
				for (Class456_Sub1 class456_sub1_251_ = ((Class523) this).aClass456_Sub1Array5851[i_249_]; null != class456_sub1_251_; class456_sub1_251_ = (((Class456_Sub1) class456_sub1_251_).aClass456_Sub1_9006)) {
					if (class456_sub1_251_ == class456_sub1) {
						if (class456_sub1_250_ != null)
							((Class456_Sub1) class456_sub1_250_).aClass456_Sub1_9006 = (((Class456_Sub1) class456_sub1_251_).aClass456_Sub1_9006);
						else
							((Class523) this).aClass456_Sub1Array5851[i_249_] = (((Class456_Sub1) class456_sub1_251_).aClass456_Sub1_9006);
						return;
					}
					class456_sub1_250_ = class456_sub1_251_;
				}
				class456_sub1_250_ = null;
				for (Class456_Sub1 class456_sub1_252_ = ((Class523) this).aClass456_Sub1Array5872[i_249_]; null != class456_sub1_252_; class456_sub1_252_ = (((Class456_Sub1) class456_sub1_252_).aClass456_Sub1_9006)) {
					if (class456_sub1_252_ == class456_sub1) {
						if (class456_sub1_250_ != null)
							((Class456_Sub1) class456_sub1_250_).aClass456_Sub1_9006 = (((Class456_Sub1) class456_sub1_252_).aClass456_Sub1_9006);
						else
							((Class523) this).aClass456_Sub1Array5872[i_249_] = (((Class456_Sub1) class456_sub1_252_).aClass456_Sub1_9006);
						return;
					}
					class456_sub1_250_ = class456_sub1_252_;
				}
				class456_sub1_250_ = null;
				for (Class456_Sub1 class456_sub1_253_ = ((Class523) this).aClass456_Sub1Array5853[i_249_]; class456_sub1_253_ != null; class456_sub1_253_ = (((Class456_Sub1) class456_sub1_253_).aClass456_Sub1_9006)) {
					if (class456_sub1_253_ == class456_sub1) {
						if (null != class456_sub1_250_)
							((Class456_Sub1) class456_sub1_250_).aClass456_Sub1_9006 = (((Class456_Sub1) class456_sub1_253_).aClass456_Sub1_9006);
						else
							((Class523) this).aClass456_Sub1Array5853[i_249_] = (((Class456_Sub1) class456_sub1_253_).aClass456_Sub1_9006);
						return;
					}
					class456_sub1_250_ = class456_sub1_253_;
				}
			}
		}
	}

	public void method6266(boolean bool, int i) {
		if (bool) {
			aClass536ArrayArrayArray5882 = aClass536ArrayArrayArray5839;
			aClass174Array5875 = aClass174Array5840;
		} else {
			aClass536ArrayArrayArray5882 = aClass536ArrayArrayArray5837;
			aClass174Array5875 = aClass174Array5838;
		}
		anInt5832 = 1659619291 * aClass536ArrayArrayArray5882.length;
	}

	public HashMap method6267(int i) {
		((Class523) this).aHashMap5881.clear();
		Iterator iterator = ((Class523) this).aHashMap5880.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			((Class523) this).aHashMap5881.put(entry.getKey(), (((Class541) ((List) entry.getValue()).get(0)).aClass572_Sub36_6086));
		}
		return ((Class523) this).aHashMap5881;
	}

	public void method6268(int i) {
		/* empty */
	}

	Class536 method6269(int i, int i_254_, int i_255_, int i_256_) {
		return method6227(i, Math.min(-1396185127 * anInt5833 - 1, Math.max(0, i_254_)), Math.min(-1519623925 * anInt5834 - 1, Math.max(0, i_255_)), 45234007);
	}

	public void method6270(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_257_, int i_258_, boolean[] bools, int i_259_) {
		if (aClass174Array5840 != aClass174Array5875) {
			int i_260_ = aClass174Array5838[i].method2726(i_257_, i_258_, 358769667);
			for (int i_261_ = 0; i_261_ <= i; i_261_++) {
				if (bools == null || bools[i_261_]) {
					Class174 class174 = aClass174Array5838[i_261_];
					if (class174 != null)
						class174.method2722(class572_sub12_sub18, i_257_, (i_260_ - class174.method2726(i_257_, i_258_, 358769667)), i_258_, 0, false);
				}
			}
		}
	}

	public void method6271() {
		for (int i = 0; i < anInt5833 * -1396185127; i++) {
			for (int i_262_ = 0; i_262_ < -1519623925 * anInt5834; i_262_++) {
				if (null == aClass536ArrayArrayArray5882[0][i][i_262_])
					aClass536ArrayArrayArray5882[0][i][i_262_] = new Class536(0);
			}
		}
	}

	public void method6272() {
		for (int i = 0; i < anInt5833 * -1396185127; i++) {
			for (int i_263_ = 0; i_263_ < -1519623925 * anInt5834; i_263_++) {
				if (null == aClass536ArrayArrayArray5882[0][i][i_263_])
					aClass536ArrayArrayArray5882[0][i][i_263_] = new Class536(0);
			}
		}
	}

	public void method6273(int i, int i_264_) {
		Class536 class536 = aClass536ArrayArrayArray5882[0][i][i_264_];
		for (int i_265_ = 0; i_265_ < 3; i_265_++) {
			Class536 class536_266_ = (aClass536ArrayArrayArray5882[i_265_][i][i_264_] = aClass536ArrayArrayArray5882[i_265_ + 1][i][i_264_]);
			if (class536_266_ != null) {
				for (Class543 class543 = class536_266_.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
					Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
					if (class456_sub1_sub2.aShort11503 == i && class456_sub1_sub2.aShort11500 == i_264_)
						class456_sub1_sub2.aByte9009--;
				}
				if (null != class536_266_.aClass456_Sub1_Sub1_5992)
					class536_266_.aClass456_Sub1_Sub1_5992.aByte9009--;
				if (null != class536_266_.aClass456_Sub1_Sub4_5988)
					class536_266_.aClass456_Sub1_Sub4_5988.aByte9009--;
				if (class536_266_.aClass456_Sub1_Sub4_5989 != null)
					class536_266_.aClass456_Sub1_Sub4_5989.aByte9009--;
				if (class536_266_.aClass456_Sub1_Sub3_5998 != null)
					class536_266_.aClass456_Sub1_Sub3_5998.aByte9009--;
				if (null != class536_266_.aClass456_Sub1_Sub3_5990)
					class536_266_.aClass456_Sub1_Sub3_5990.aByte9009--;
			}
		}
		if (null == aClass536ArrayArrayArray5882[0][i][i_264_]) {
			aClass536ArrayArrayArray5882[0][i][i_264_] = new Class536(0);
			aClass536ArrayArrayArray5882[0][i][i_264_].aByte5991 = (byte) 1;
		}
		aClass536ArrayArrayArray5882[0][i][i_264_].aClass536_5987 = class536;
		aClass536ArrayArrayArray5882[3][i][i_264_] = null;
	}

	public void method6274(int i, int i_267_) {
		Class536 class536 = aClass536ArrayArrayArray5882[0][i][i_267_];
		for (int i_268_ = 0; i_268_ < 3; i_268_++) {
			Class536 class536_269_ = (aClass536ArrayArrayArray5882[i_268_][i][i_267_] = aClass536ArrayArrayArray5882[i_268_ + 1][i][i_267_]);
			if (class536_269_ != null) {
				for (Class543 class543 = class536_269_.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
					Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
					if (class456_sub1_sub2.aShort11503 == i && class456_sub1_sub2.aShort11500 == i_267_)
						class456_sub1_sub2.aByte9009--;
				}
				if (null != class536_269_.aClass456_Sub1_Sub1_5992)
					class536_269_.aClass456_Sub1_Sub1_5992.aByte9009--;
				if (null != class536_269_.aClass456_Sub1_Sub4_5988)
					class536_269_.aClass456_Sub1_Sub4_5988.aByte9009--;
				if (class536_269_.aClass456_Sub1_Sub4_5989 != null)
					class536_269_.aClass456_Sub1_Sub4_5989.aByte9009--;
				if (class536_269_.aClass456_Sub1_Sub3_5998 != null)
					class536_269_.aClass456_Sub1_Sub3_5998.aByte9009--;
				if (null != class536_269_.aClass456_Sub1_Sub3_5990)
					class536_269_.aClass456_Sub1_Sub3_5990.aByte9009--;
			}
		}
		if (null == aClass536ArrayArrayArray5882[0][i][i_267_]) {
			aClass536ArrayArrayArray5882[0][i][i_267_] = new Class536(0);
			aClass536ArrayArrayArray5882[0][i][i_267_].aByte5991 = (byte) 1;
		}
		aClass536ArrayArrayArray5882[0][i][i_267_].aClass536_5987 = class536;
		aClass536ArrayArrayArray5882[3][i][i_267_] = null;
	}

	public Class456_Sub1_Sub1 method6275(int i, int i_270_, int i_271_, short i_272_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_270_][i_271_];
		if (null == class536)
			return null;
		method6265(class536.aClass456_Sub1_Sub1_5992, (byte) -54);
		if (null != class536.aClass456_Sub1_Sub1_5992) {
			Class456_Sub1_Sub1 class456_sub1_sub1 = class536.aClass456_Sub1_Sub1_5992;
			class536.aClass456_Sub1_Sub1_5992 = null;
			return class456_sub1_sub1;
		}
		return null;
	}

	public int method6276(int i, int i_273_) {
		return (null != ((Class523) this).aByteArrayArray5877 ? ((Class523) this).aByteArrayArray5877[i][i_273_] & 0xff : 0);
	}

	public Class456_Sub1_Sub4 method6277(int i, int i_274_, int i_275_, int i_276_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_274_][i_275_];
		if (class536 == null)
			return null;
		return class536.aClass456_Sub1_Sub4_5988;
	}

	public void method6278(int i, int i_277_, int i_278_, int i_279_) {
		List list = (List) ((Class523) this).aHashMap5880.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				class541.aClass572_Sub36_6086.method8730(i_277_, i_278_, 1535175507);
			}
		}
	}

	public int method6279(int i, int i_280_) {
		return (null != ((Class523) this).aByteArrayArray5877 ? ((Class523) this).aByteArrayArray5877[i][i_280_] & 0xff : 0);
	}

	void method6280(Class456_Sub1 class456_sub1, Class572_Sub36[] class572_sub36s) {
		if (((Class523) this).aBool5829) {
			int i = class456_sub1.method8352(class572_sub36s, (byte) 124);
			((Class523) this).aClass106_5868.method1772(i, class572_sub36s);
		}
		if (aClass174Array5840 == aClass174Array5875) {
			boolean bool = false;
			boolean bool_281_ = false;
			Class240 class240 = class456_sub1.method5394().aClass240_2647;
			int i;
			int i_282_;
			if (class456_sub1 instanceof Class456_Sub1_Sub2) {
				i = ((Class456_Sub1_Sub2) class456_sub1).aShort11503;
				i_282_ = ((Class456_Sub1_Sub2) class456_sub1).aShort11500;
			} else {
				i = (int) class240.aFloat2653 >> 406704825 * anInt5858;
				i_282_ = (int) class240.aFloat2657 >> anInt5858 * 406704825;
			}
			i = Math.min(anInt5833 * -1396185127 - 1, Math.max(0, i));
			i_282_ = Math.min(anInt5834 * -1519623925 - 1, Math.max(0, i_282_));
			Class86 class86 = new Class86();
			class86.anInt1193 = method6231(i, i_282_, 1258315415) * 1368828903;
			class86.anInt1190 = method6230(i, i_282_, -981999643) * 1765263439;
			class86.anInt1191 = method6283(i, i_282_, 775342000) * 628738217;
			class86.anInt1189 = method6233(i, i_282_, -1042067865) * -233369847;
			class86.anInt1194 = method6234(i, i_282_, (byte) 16) * -223776263;
			class86.anInt1195 = method6235(i, i_282_, (byte) 95) * -963547665;
			((Class523) this).aClass106_5868.method1790(aClass174Array5838[0].method2726((int) class240.aFloat2653, (int) class240.aFloat2657, 358769667), class86);
		}
		Class531 class531 = class456_sub1.method8350(((Class523) this).aClass106_5868, 344651878);
		if (null != class531) {
			if (((Class531) class531).aBool5930) {
				class531.aClass456_Sub1_5929 = class456_sub1;
				aClass545_5849.method6449(class531, -1542711185);
			} else
				Class578.method6834(class531, 1694981735);
		}
	}

	void method6281(Class456_Sub1[] class456_sub1s, int i, int i_283_) {
		if (i < i_283_) {
			int i_284_ = (i_283_ + i) / 2;
			int i_285_ = i;
			Class456_Sub1 class456_sub1 = class456_sub1s[i_284_];
			class456_sub1s[i_284_] = class456_sub1s[i_283_];
			class456_sub1s[i_283_] = class456_sub1;
			int i_286_ = -855434981 * ((Class456_Sub1) class456_sub1).anInt9005;
			for (int i_287_ = i; i_287_ < i_283_; i_287_++) {
				if ((-855434981 * ((Class456_Sub1) class456_sub1s[i_287_]).anInt9005) < i_286_ + (i_287_ & 0x1)) {
					Class456_Sub1 class456_sub1_288_ = class456_sub1s[i_287_];
					class456_sub1s[i_287_] = class456_sub1s[i_285_];
					class456_sub1s[i_285_++] = class456_sub1_288_;
				}
			}
			class456_sub1s[i_283_] = class456_sub1s[i_285_];
			class456_sub1s[i_285_] = class456_sub1;
			method6281(class456_sub1s, i, i_285_ - 1);
			method6281(class456_sub1s, 1 + i_285_, i_283_);
		}
	}

	public Class456_Sub1_Sub5 method6282(int i, int i_289_, int i_290_, byte i_291_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_289_][i_290_];
		if (class536 == null)
			return null;
		Class456_Sub1_Sub5 class456_sub1_sub5 = ((Class536) class536).aClass456_Sub1_Sub5_5993;
		((Class536) class536).aClass456_Sub1_Sub5_5993 = null;
		method6265(class456_sub1_sub5, (byte) -44);
		return class456_sub1_sub5;
	}

	public int method6283(int i, int i_292_, int i_293_) {
		return (null != ((Class523) this).aByteArrayArray5877 ? ((Class523) this).aByteArrayArray5877[i][i_292_] & 0xff : 0);
	}

	public Class523(Class106 class106, int i, int i_294_, int i_295_, int i_296_, int i_297_, boolean bool, boolean bool_298_) {
		((Class523) this).anInt5848 = 10003;
		((Class523) this).anInt5836 = 5062;
		((Class523) this).anInt5850 = 5052;
		((Class523) this).aFloatArray5830 = new float[3];
		((Class523) this).aClass572_Sub36Array5873 = new Class572_Sub36[8];
		((Class523) this).anInt5874 = 65009;
		((Class523) this).aHashMap5880 = new HashMap();
		((Class523) this).aHashMap5881 = new HashMap();
		((Class523) this).aClass106_5868 = class106;
		((Class523) this).aBool5829 = ((Class523) this).aClass106_5868.method1849() > 0;
		anInt5858 = i * -1858432119;
		((Class523) this).anInt5824 = (1 << anInt5858 * 406704825) * -338849209;
		((Class523) this).anInt5867 = -209867869 * (((Class523) this).anInt5824 * -1090619529 >> 1);
		anInt5832 = 1659619291 * i_294_;
		anInt5833 = 2131241065 * i_295_;
		anInt5834 = i_296_ * -2088213853;
		((Class523) this).anInt5865 = i_297_ * -917758655;
		((Class523) this).aClass260_5852 = new Class260();
		aClass533_5828 = new Class533(this);
		aClass536ArrayArrayArray5837 = (new Class536[i_294_][anInt5833 * -1396185127][anInt5834 * -1519623925]);
		aClass174Array5838 = new Class174[i_294_];
		if (bool) {
			((Class523) this).anIntArrayArray5822 = new int[anInt5833 * -1396185127][-1519623925 * anInt5834];
			((Class523) this).aByteArrayArray5877 = new byte[anInt5833 * -1396185127][anInt5834 * -1519623925];
			((Class523) this).aShortArrayArray5842 = new short[anInt5833 * -1396185127][-1519623925 * anInt5834];
			((Class523) this).aByteArrayArray5860 = new byte[-1396185127 * anInt5833][anInt5834 * -1519623925];
			((Class523) this).aByteArrayArray5845 = new byte[-1396185127 * anInt5833][-1519623925 * anInt5834];
			((Class523) this).aByteArrayArray5846 = new byte[anInt5833 * -1396185127][-1519623925 * anInt5834];
			aClass536ArrayArrayArray5839 = (new Class536[1][-1396185127 * anInt5833][anInt5834 * -1519623925]);
			aClass174Array5840 = new Class174[1];
		}
		if (bool_298_) {
			((Class523) this).aLongArrayArrayArray5835 = new long[i_294_][i_295_][i_296_];
			((Class523) this).aClass541Array5878 = new Class541[65009];
			((Class523) this).aBoolArray5827 = new boolean[65009];
			((Class523) this).anInt5876 = 0;
		}
		method6266(false, 929223901);
		((Class523) this).aClass456_Sub1Array5851 = new Class456_Sub1[2];
		((Class523) this).aClass456_Sub1Array5872 = new Class456_Sub1[2];
		((Class523) this).aClass456_Sub1Array5853 = new Class456_Sub1[2];
		((Class523) this).aClass456_Sub1Array5857 = new Class456_Sub1[10003];
		((Class523) this).anInt5854 = 0;
		((Class523) this).aClass456_Sub1Array5856 = new Class456_Sub1[5062];
		((Class523) this).anInt5855 = 0;
		((Class523) this).aClass456_Sub1_Sub2Array5869 = new Class456_Sub1_Sub2[5052];
		((Class523) this).anInt5861 = 0;
		((Class523) this).aBoolArrayArray5885 = (new boolean[(131560129 * ((Class523) this).anInt5865 + ((Class523) this).anInt5865 * 131560129 + 1)][(((Class523) this).anInt5865 * 131560129 + ((Class523) this).anInt5865 * 131560129 + 1)]);
		((Class523) this).aBoolArrayArray5883 = (new boolean[(((Class523) this).anInt5865 * 131560129 + 131560129 * ((Class523) this).anInt5865 + 2)][2 + (131560129 * ((Class523) this).anInt5865 + 131560129 * ((Class523) this).anInt5865)]);
		((Class523) this).anIntArray5884 = new int[2 + (((Class523) this).anInt5865 * 131560129 + 131560129 * ((Class523) this).anInt5865)];
		aClass545_5849 = new Class545(false);
	}

	public Class543 method6284(int i, int i_299_, int i_300_, int i_301_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_299_][i_300_];
		if (null == class536)
			return null;
		return class536.aClass543_5994;
	}

	public void method6285() {
		for (int i = 0; i < anInt5832 * 1103813715; i++) {
			for (int i_302_ = 0; i_302_ < anInt5833 * -1396185127; i_302_++) {
				for (int i_303_ = 0; i_303_ < anInt5834 * -1519623925; i_303_++) {
					Class536 class536 = aClass536ArrayArrayArray5882[i][i_302_][i_303_];
					if (class536 != null) {
						Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5988;
						Class456_Sub1_Sub4 class456_sub1_sub4_304_ = class536.aClass456_Sub1_Sub4_5989;
						if (class456_sub1_sub4 != null && class456_sub1_sub4.method8299(2046848861)) {
							method6256(class456_sub1_sub4, i, i_302_, i_303_, 1, 1);
							if (null != class456_sub1_sub4_304_ && class456_sub1_sub4_304_.method8299(2026956492)) {
								method6256(class456_sub1_sub4_304_, i, i_302_, i_303_, 1, 1);
								class456_sub1_sub4_304_.method8302(((Class523) this).aClass106_5868, class456_sub1_sub4, 0, 0, 0, false, 264690771);
								class456_sub1_sub4_304_.method8303(259659157);
							}
							class456_sub1_sub4.method8303(259659157);
						}
						for (Class543 class543 = class536.aClass543_5994; class543 != null; class543 = class543.aClass543_6100) {
							Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
							if (null != class456_sub1_sub2 && class456_sub1_sub2.method8299(2072730743)) {
								method6256(class456_sub1_sub2, i, i_302_, i_303_, (class456_sub1_sub2.aShort11499 - class456_sub1_sub2.aShort11503 + 1), 1 + (class456_sub1_sub2.aShort11502 - (class456_sub1_sub2.aShort11500)));
								class456_sub1_sub2.method8303(259659157);
							}
						}
						Class456_Sub1_Sub1 class456_sub1_sub1 = class536.aClass456_Sub1_Sub1_5992;
						if (null != class456_sub1_sub1 && class456_sub1_sub1.method8299(2122682656)) {
							method6255(class456_sub1_sub1, i, i_302_, i_303_, 1316908546);
							class456_sub1_sub1.method8303(259659157);
						}
					}
				}
			}
		}
	}

	public Class456_Sub1_Sub5 method6286(int i, int i_305_, int i_306_, byte i_307_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_305_][i_306_];
		if (class536 == null)
			return null;
		return ((Class536) class536).aClass456_Sub1_Sub5_5993;
	}

	public void method6287(HashMap hashmap, int i) {
		((Class523) this).aHashMap5881 = hashmap;
	}

	public void method6288() {
		for (int i = 0; i < anInt5832 * 1103813715; i++) {
			for (int i_308_ = 0; i_308_ < anInt5833 * -1396185127; i_308_++) {
				for (int i_309_ = 0; i_309_ < anInt5834 * -1519623925; i_309_++) {
					Class536 class536 = aClass536ArrayArrayArray5882[i][i_308_][i_309_];
					if (class536 != null) {
						Class456_Sub1_Sub4 class456_sub1_sub4 = class536.aClass456_Sub1_Sub4_5988;
						Class456_Sub1_Sub4 class456_sub1_sub4_310_ = class536.aClass456_Sub1_Sub4_5989;
						if (class456_sub1_sub4 != null && class456_sub1_sub4.method8299(2055696973)) {
							method6256(class456_sub1_sub4, i, i_308_, i_309_, 1, 1);
							if (null != class456_sub1_sub4_310_ && class456_sub1_sub4_310_.method8299(2078383080)) {
								method6256(class456_sub1_sub4_310_, i, i_308_, i_309_, 1, 1);
								class456_sub1_sub4_310_.method8302(((Class523) this).aClass106_5868, class456_sub1_sub4, 0, 0, 0, false, 772820403);
								class456_sub1_sub4_310_.method8303(259659157);
							}
							class456_sub1_sub4.method8303(259659157);
						}
						for (Class543 class543 = class536.aClass543_5994; class543 != null; class543 = class543.aClass543_6100) {
							Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
							if (null != class456_sub1_sub2 && class456_sub1_sub2.method8299(2090073159)) {
								method6256(class456_sub1_sub2, i, i_308_, i_309_, (class456_sub1_sub2.aShort11499 - class456_sub1_sub2.aShort11503 + 1), 1 + (class456_sub1_sub2.aShort11502 - (class456_sub1_sub2.aShort11500)));
								class456_sub1_sub2.method8303(259659157);
							}
						}
						Class456_Sub1_Sub1 class456_sub1_sub1 = class536.aClass456_Sub1_Sub1_5992;
						if (null != class456_sub1_sub1 && class456_sub1_sub1.method8299(2105113945)) {
							method6255(class456_sub1_sub1, i, i_308_, i_309_, 1425293263);
							class456_sub1_sub1.method8303(259659157);
						}
					}
				}
			}
		}
	}

	public void method6289(int i) {
		method6263(1, 1103813715 * anInt5832, 1784737156);
	}

	public void method6290(int i, int i_311_, int i_312_, Class456_Sub1_Sub3 class456_sub1_sub3, Class456_Sub1_Sub3 class456_sub1_sub3_313_, int i_314_) {
		Class536 class536 = method6227(i, i_311_, i_312_, 287917008);
		if (class536 != null) {
			class536.aClass456_Sub1_Sub3_5998 = class456_sub1_sub3;
			class536.aClass456_Sub1_Sub3_5990 = class456_sub1_sub3_313_;
			int i_315_ = aClass174Array5875 == aClass174Array5840 ? 1 : 0;
			if (class456_sub1_sub3.method8300(1171542972)) {
				if (class456_sub1_sub3.method8301((byte) 3)) {
					((Class456_Sub1_Sub3) class456_sub1_sub3).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5872[i_315_];
					((Class523) this).aClass456_Sub1Array5872[i_315_] = class456_sub1_sub3;
				} else {
					((Class456_Sub1_Sub3) class456_sub1_sub3).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5851[i_315_];
					((Class523) this).aClass456_Sub1Array5851[i_315_] = class456_sub1_sub3;
				}
			} else {
				((Class456_Sub1_Sub3) class456_sub1_sub3).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_315_];
				((Class523) this).aClass456_Sub1Array5853[i_315_] = class456_sub1_sub3;
			}
			if (null != class456_sub1_sub3_313_) {
				if (class456_sub1_sub3_313_.method8300(92425562)) {
					if (class456_sub1_sub3_313_.method8301((byte) 3)) {
						((Class456_Sub1_Sub3) class456_sub1_sub3_313_).aClass456_Sub1_9006 = (((Class523) this).aClass456_Sub1Array5872[i_315_]);
						((Class523) this).aClass456_Sub1Array5872[i_315_] = class456_sub1_sub3_313_;
					} else {
						((Class456_Sub1_Sub3) class456_sub1_sub3_313_).aClass456_Sub1_9006 = (((Class523) this).aClass456_Sub1Array5851[i_315_]);
						((Class523) this).aClass456_Sub1Array5851[i_315_] = class456_sub1_sub3_313_;
					}
				} else {
					((Class456_Sub1_Sub3) class456_sub1_sub3_313_).aClass456_Sub1_9006 = ((Class523) this).aClass456_Sub1Array5853[i_315_];
					((Class523) this).aClass456_Sub1Array5853[i_315_] = class456_sub1_sub3_313_;
				}
			}
		}
	}

	public void method6291(int i) {
		/* empty */
	}

	public void method6292(int i, int i_316_, int i_317_, int i_318_, int i_319_) {
		Class536 class536 = aClass536ArrayArrayArray5882[i][i_316_][i_317_];
		if (class536 != null) {
			Class456_Sub1_Sub3 class456_sub1_sub3 = class536.aClass456_Sub1_Sub3_5998;
			Class456_Sub1_Sub3 class456_sub1_sub3_320_ = class536.aClass456_Sub1_Sub3_5990;
			if (null != class456_sub1_sub3) {
				class456_sub1_sub3.aShort11507 = (short) (i_318_ * class456_sub1_sub3.aShort11507 / (16 << 406704825 * anInt5858 - 7));
				class456_sub1_sub3.aShort11506 = (short) (i_318_ * class456_sub1_sub3.aShort11506 / (16 << 406704825 * anInt5858 - 7));
			}
			if (null != class456_sub1_sub3_320_) {
				class456_sub1_sub3_320_.aShort11507 = (short) (i_318_ * class456_sub1_sub3_320_.aShort11507 / (16 << 406704825 * anInt5858 - 7));
				class456_sub1_sub3_320_.aShort11506 = (short) (class456_sub1_sub3_320_.aShort11506 * i_318_ / (16 << anInt5858 * 406704825 - 7));
			}
		}
	}

	public static Class374 method6293(int i, int i_321_) {
		if (Class465.aClass289_5235 != null)
			return Class465.aClass289_5235.method3894(1363198222).method3955(i, 110438825);
		return null;
	}

	static void method6294(Cs2Executor class441, int i) {
		Class386 class386 = ((Class386) Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), -488417175));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (class386.anIntArrayArray4626 == null ? 0 : class386.anIntArrayArray4626.length);
	}

	static final void method6295(Cs2Executor class441, int i) {
		int i_322_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_322_, (short) -2863);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1393929271 * class73.anInt804;
	}

	static final void method6296(Cs2Executor class441, int i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4994(913488613) != Class413.aClass413_4910)
			throw new RuntimeException();
		((Class423_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -117)).method9274(((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1), -1200647887);
	}

	static final void method6297(Cs2Executor class441, int i) {
		int i_323_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (Class100.aClass616_1298.method7372(i_323_, 579491552).aString11464);
	}

	static final void method6298(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1881006428) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray869 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method6299(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = (((Cs2Executor) class441).current_clan.method4210(-1221297227)[(((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1])]);
	}
}
