package game;

/* Class174_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Iterator;

import sun.misc.Unsafe;

public class Class174_Sub1 extends Class174 {
	Interface44 anInterface44_10686;
	static final int anInt10687 = 74;
	Class106_Sub3 aClass106_Sub3_10688;
	int anInt10689;
	Interface44 anInterface44_10690;
	float[][] aFloatArrayArray10691;
	int anInt10692;
	int anInt10693;
	int anInt10694;
	short[][] aShortArrayArray10695;
	int[] anIntArray10696;
	float aFloat10697;
	int[][][] anIntArrayArrayArray10698;
	int[][][] anIntArrayArrayArray10699;
	int[][][] anIntArrayArrayArray10700;
	Class572[] aClass572Array10701;
	int[][][] anIntArrayArrayArray10702;
	int[][][] anIntArrayArrayArray10703;
	int[][][] anIntArrayArrayArray10704;
	int anInt10705;
	float[][] aFloatArrayArray10706;
	Class675 aClass675_10707;
	Class572[] aClass572Array10708;
	Class676 aClass676_10709;
	Class362 aClass362_10710;
	Class361 aClass361_10711;
	byte[][] aByteArrayArray10712;
	int anInt10713;
	byte[][] aByteArrayArray10714;
	static final int anInt10715 = 1;
	float[][] aFloatArrayArray10716;
	int anInt10717;
	int anInt10718;
	int[] anIntArray10719;
	int anInt10720;
	long aLong10721;
	float aFloat10722 = 3.4028235E38F;
	long aLong10723;
	int anInt10724;
	Class572_Sub14[][][] aClass572_Sub14ArrayArrayArray10725;
	long aLong10726;
	int anInt10727;
	int[] anIntArray10728;

	public void method2719() {
		if (((Class174_Sub1) this).anInt10705 <= 0) {
			((Class174_Sub1) this).aClass361_10711 = null;
			method9990();
		} else {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_0_ = 1; i_0_ < anInt2089 * 792439321; i_0_++)
					is[i][i_0_] = (byte) (((((Class174_Sub1) this).aByteArrayArray10714[i - 1][i_0_]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i + 1][i_0_]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_0_ - 1]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_0_ + 1]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_0_]) >> 1));
			}
			((Class174_Sub1) this).aClass572Array10701 = new Class572[((Class174_Sub1) this).aClass676_10709.method7962((byte) 0)];
			((Class174_Sub1) this).aClass676_10709.method7965(((Class174_Sub1) this).aClass572Array10701, (byte) -61);
			for (int i = 0; i < ((Class174_Sub1) this).aClass572Array10701.length; i++)
				((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i]).method8447(((Class174_Sub1) this).anInt10705);
			((Class174_Sub1) this).anInt10724 = 20;
			if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
				((Class174_Sub1) this).anInt10724 += 4;
			if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0)
				((Class174_Sub1) this).anInt10724 += 12;
			((Class174_Sub1) this).aLong10723 = (((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377.allocateMemory((long) (((Class174_Sub1) this).anInt10705 * 4 + (((Class174_Sub1) this).anInt10705 * ((Class174_Sub1) this).anInt10724))));
			((Class174_Sub1) this).aLong10721 = ((Class174_Sub1) this).aLong10723;
			((Class174_Sub1) this).aLong10726 = (((Class174_Sub1) this).aLong10723 + (long) (((Class174_Sub1) this).anInt10705 * 4));
			Class572_Sub14[] class572_sub14s = new Class572_Sub14[((Class174_Sub1) this).anInt10705];
			int i = Cs2CallPointer.method5627(((Class174_Sub1) this).anInt10705 / 4, 326245663);
			if (i < 1)
				i = 1;
			Class676 class676 = new Class676(i);
			Class572_Sub14[] class572_sub14s_1_ = new Class572_Sub14[((Class174_Sub1) this).anInt10713];
			for (int i_2_ = 0; i_2_ < anInt2086 * -1715487093; i_2_++) {
				for (int i_3_ = 0; i_3_ < anInt2089 * 792439321; i_3_++)
					method9986(i_2_, i_3_, is, class572_sub14s_1_, class676, class572_sub14s);
			}
			for (int i_4_ = 0; i_4_ < ((Class174_Sub1) this).anInt10693; i_4_++) {
				Class572_Sub14 class572_sub14 = class572_sub14s[i_4_];
				if (class572_sub14 != null)
					class572_sub14.method8435(i_4_);
			}
			for (int i_5_ = 0; i_5_ < anInt2086 * -1715487093; i_5_++) {
				for (int i_6_ = 0; i_6_ < anInt2089 * 792439321; i_6_++) {
					short[] is_7_ = (((Class174_Sub1) this).aShortArrayArray10695[i_6_ * (anInt2086 * -1715487093) + i_5_]);
					if (is_7_ != null) {
						int i_8_ = 0;
						int i_9_ = 0;
						while (i_9_ < is_7_.length) {
							int i_10_ = is_7_[i_9_++] & 0xffff;
							int i_11_ = is_7_[i_9_++] & 0xffff;
							int i_12_ = is_7_[i_9_++] & 0xffff;
							Class572_Sub14 class572_sub14 = class572_sub14s[i_10_];
							Class572_Sub14 class572_sub14_13_ = class572_sub14s[i_11_];
							Class572_Sub14 class572_sub14_14_ = class572_sub14s[i_12_];
							Class572_Sub14 class572_sub14_15_ = null;
							if (class572_sub14 != null) {
								class572_sub14.method8436(i_5_, i_6_, i_8_);
								class572_sub14_15_ = class572_sub14;
							}
							if (class572_sub14_13_ != null) {
								class572_sub14_13_.method8436(i_5_, i_6_, i_8_);
								if (class572_sub14_15_ == null || ((class572_sub14_13_.hash * 381237825124074065L) < (class572_sub14_15_.hash * 381237825124074065L)))
									class572_sub14_15_ = class572_sub14_13_;
							}
							if (class572_sub14_14_ != null) {
								class572_sub14_14_.method8436(i_5_, i_6_, i_8_);
								if (class572_sub14_15_ == null || ((class572_sub14_14_.hash * 381237825124074065L) < (class572_sub14_15_.hash * 381237825124074065L)))
									class572_sub14_15_ = class572_sub14_14_;
							}
							if (class572_sub14_15_ != null) {
								if (class572_sub14 != null)
									class572_sub14_15_.method8435(i_10_);
								if (class572_sub14_13_ != null)
									class572_sub14_15_.method8435(i_11_);
								if (class572_sub14_14_ != null)
									class572_sub14_15_.method8435(i_12_);
								class572_sub14_15_.method8436(i_5_, i_6_, i_8_);
							}
							i_8_++;
						}
					}
				}
			}
			((Class174_Sub1) this).anInt10720 = 0;
			for (int i_16_ = 0; i_16_ < ((Class174_Sub1) this).aClass572Array10701.length; i_16_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_16_]);
				if (((Class572_Sub14) class572_sub14).anInt9111 > 0)
					((Class174_Sub1) this).aClass572Array10701[((Class174_Sub1) this).anInt10720++] = class572_sub14;
			}
			((Class174_Sub1) this).aClass572Array10708 = new Class572[((Class174_Sub1) this).anInt10720];
			long[] ls = new long[((Class174_Sub1) this).anInt10720];
			for (int i_17_ = 0; i_17_ < ((Class174_Sub1) this).anInt10720; i_17_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_17_]);
				ls[i_17_] = class572_sub14.hash * 381237825124074065L;
				((Class174_Sub1) this).aClass572Array10708[i_17_] = class572_sub14;
			}
			Class543.method6441(ls, ((Class174_Sub1) this).aClass572Array10708, -1037289055);
			method9987();
		}
	}

	public Class572_Sub12_Sub18 method2735(int i, int i_18_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub1) this).aByteArrayArray10712[i][i_18_] & 0x1) == 0)
			return null;
		int i_19_ = (anInt2087 * 2129890771 >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_20_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_19_, i_19_)) {
			class572_sub12_sub18_sub2_20_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_20_.method10652();
		} else
			class572_sub12_sub18_sub2_20_ = new NativeShadow((((Class174_Sub1) this).aClass106_Sub3_10688), i_19_, i_19_);
		class572_sub12_sub18_sub2_20_.method10650(0, 0, i_19_, i_19_);
		method9988(class572_sub12_sub18_sub2_20_, i, i_18_);
		return class572_sub12_sub18_sub2_20_;
	}

	public void method2745(int i, int i_21_, int[] is, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, Class86 class86, boolean bool) {
		int i_32_ = is_28_.length;
		int[] is_33_ = new int[i_32_ * 3];
		int[] is_34_ = new int[i_32_ * 3];
		int[] is_35_ = new int[i_32_ * 3];
		int[] is_36_ = new int[i_32_ * 3];
		int[] is_37_ = new int[i_32_ * 3];
		int[] is_38_ = new int[i_32_ * 3];
		int[] is_39_ = is_22_ != null ? new int[i_32_ * 3] : null;
		int[] is_40_ = is_24_ != null ? new int[i_32_ * 3] : null;
		int i_41_ = 0;
		for (int i_42_ = 0; i_42_ < i_32_; i_42_++) {
			int i_43_ = is_25_[i_42_];
			int i_44_ = is_26_[i_42_];
			int i_45_ = is_27_[i_42_];
			is_33_[i_41_] = is[i_43_];
			is_34_[i_41_] = is_23_[i_43_];
			is_35_[i_41_] = is_28_[i_42_];
			is_37_[i_41_] = is_30_[i_42_];
			is_38_[i_41_] = is_31_[i_42_];
			is_36_[i_41_] = is_29_ != null ? is_29_[i_42_] : is_28_[i_42_];
			if (is_22_ != null)
				is_39_[i_41_] = is_22_[i_43_];
			if (is_24_ != null)
				is_40_[i_41_] = is_24_[i_43_];
			i_41_++;
			is_33_[i_41_] = is[i_44_];
			is_34_[i_41_] = is_23_[i_44_];
			is_35_[i_41_] = is_28_[i_42_];
			is_37_[i_41_] = is_30_[i_42_];
			is_38_[i_41_] = is_31_[i_42_];
			is_36_[i_41_] = is_29_ != null ? is_29_[i_42_] : is_28_[i_42_];
			if (is_22_ != null)
				is_39_[i_41_] = is_22_[i_44_];
			if (is_24_ != null)
				is_40_[i_41_] = is_24_[i_44_];
			i_41_++;
			is_33_[i_41_] = is[i_45_];
			is_34_[i_41_] = is_23_[i_45_];
			is_35_[i_41_] = is_28_[i_42_];
			is_37_[i_41_] = is_30_[i_42_];
			is_38_[i_41_] = is_31_[i_42_];
			is_36_[i_41_] = is_29_ != null ? is_29_[i_42_] : is_28_[i_42_];
			if (is_22_ != null)
				is_39_[i_41_] = is_22_[i_45_];
			if (is_24_ != null)
				is_40_[i_41_] = is_24_[i_45_];
			i_41_++;
		}
		method2728(i, i_21_, is_33_, is_39_, is_34_, is_40_, is_35_, is_36_, is_37_, is_38_, class86, bool);
	}

	public void method2712(int i, int i_46_, int[] is, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, int[] is_53_, int[] is_54_, int[] is_55_, int[] is_56_, Class86 class86, boolean bool) {
		int i_57_ = is_53_.length;
		int[] is_58_ = new int[i_57_ * 3];
		int[] is_59_ = new int[i_57_ * 3];
		int[] is_60_ = new int[i_57_ * 3];
		int[] is_61_ = new int[i_57_ * 3];
		int[] is_62_ = new int[i_57_ * 3];
		int[] is_63_ = new int[i_57_ * 3];
		int[] is_64_ = is_47_ != null ? new int[i_57_ * 3] : null;
		int[] is_65_ = is_49_ != null ? new int[i_57_ * 3] : null;
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_57_; i_67_++) {
			int i_68_ = is_50_[i_67_];
			int i_69_ = is_51_[i_67_];
			int i_70_ = is_52_[i_67_];
			is_58_[i_66_] = is[i_68_];
			is_59_[i_66_] = is_48_[i_68_];
			is_60_[i_66_] = is_53_[i_67_];
			is_62_[i_66_] = is_55_[i_67_];
			is_63_[i_66_] = is_56_[i_67_];
			is_61_[i_66_] = is_54_ != null ? is_54_[i_67_] : is_53_[i_67_];
			if (is_47_ != null)
				is_64_[i_66_] = is_47_[i_68_];
			if (is_49_ != null)
				is_65_[i_66_] = is_49_[i_68_];
			i_66_++;
			is_58_[i_66_] = is[i_69_];
			is_59_[i_66_] = is_48_[i_69_];
			is_60_[i_66_] = is_53_[i_67_];
			is_62_[i_66_] = is_55_[i_67_];
			is_63_[i_66_] = is_56_[i_67_];
			is_61_[i_66_] = is_54_ != null ? is_54_[i_67_] : is_53_[i_67_];
			if (is_47_ != null)
				is_64_[i_66_] = is_47_[i_69_];
			if (is_49_ != null)
				is_65_[i_66_] = is_49_[i_69_];
			i_66_++;
			is_58_[i_66_] = is[i_70_];
			is_59_[i_66_] = is_48_[i_70_];
			is_60_[i_66_] = is_53_[i_67_];
			is_62_[i_66_] = is_55_[i_67_];
			is_63_[i_66_] = is_56_[i_67_];
			is_61_[i_66_] = is_54_ != null ? is_54_[i_67_] : is_53_[i_67_];
			if (is_47_ != null)
				is_64_[i_66_] = is_47_[i_70_];
			if (is_49_ != null)
				is_65_[i_66_] = is_49_[i_70_];
			i_66_++;
		}
		method2728(i, i_46_, is_58_, is_64_, is_59_, is_65_, is_60_, is_61_, is_62_, is_63_, class86, bool);
	}

	public Class572_Sub12_Sub18 method2743(int i, int i_71_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub1) this).aByteArrayArray10712[i][i_71_] & 0x1) == 0)
			return null;
		int i_72_ = (anInt2087 * 2129890771 >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_73_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_72_, i_72_)) {
			class572_sub12_sub18_sub2_73_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_73_.method10652();
		} else
			class572_sub12_sub18_sub2_73_ = new NativeShadow((((Class174_Sub1) this).aClass106_Sub3_10688), i_72_, i_72_);
		class572_sub12_sub18_sub2_73_.method10650(0, 0, i_72_, i_72_);
		method9988(class572_sub12_sub18_sub2_73_, i, i_71_);
		return class572_sub12_sub18_sub2_73_;
	}

	public void method2730() {
		if (((Class174_Sub1) this).anInt10705 <= 0) {
			((Class174_Sub1) this).aClass361_10711 = null;
			method9990();
		} else {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_74_ = 1; i_74_ < anInt2089 * 792439321; i_74_++)
					is[i][i_74_] = (byte) (((((Class174_Sub1) this).aByteArrayArray10714[i - 1][i_74_]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i + 1][i_74_]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_74_ - 1]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_74_ + 1]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_74_]) >> 1));
			}
			((Class174_Sub1) this).aClass572Array10701 = new Class572[((Class174_Sub1) this).aClass676_10709.method7962((byte) 0)];
			((Class174_Sub1) this).aClass676_10709.method7965(((Class174_Sub1) this).aClass572Array10701, (byte) -54);
			for (int i = 0; i < ((Class174_Sub1) this).aClass572Array10701.length; i++)
				((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i]).method8447(((Class174_Sub1) this).anInt10705);
			((Class174_Sub1) this).anInt10724 = 20;
			if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
				((Class174_Sub1) this).anInt10724 += 4;
			if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0)
				((Class174_Sub1) this).anInt10724 += 12;
			((Class174_Sub1) this).aLong10723 = (((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377.allocateMemory((long) (((Class174_Sub1) this).anInt10705 * 4 + (((Class174_Sub1) this).anInt10705 * ((Class174_Sub1) this).anInt10724))));
			((Class174_Sub1) this).aLong10721 = ((Class174_Sub1) this).aLong10723;
			((Class174_Sub1) this).aLong10726 = (((Class174_Sub1) this).aLong10723 + (long) (((Class174_Sub1) this).anInt10705 * 4));
			Class572_Sub14[] class572_sub14s = new Class572_Sub14[((Class174_Sub1) this).anInt10705];
			int i = Cs2CallPointer.method5627(((Class174_Sub1) this).anInt10705 / 4, 326245663);
			if (i < 1)
				i = 1;
			Class676 class676 = new Class676(i);
			Class572_Sub14[] class572_sub14s_75_ = new Class572_Sub14[((Class174_Sub1) this).anInt10713];
			for (int i_76_ = 0; i_76_ < anInt2086 * -1715487093; i_76_++) {
				for (int i_77_ = 0; i_77_ < anInt2089 * 792439321; i_77_++)
					method9986(i_76_, i_77_, is, class572_sub14s_75_, class676, class572_sub14s);
			}
			for (int i_78_ = 0; i_78_ < ((Class174_Sub1) this).anInt10693; i_78_++) {
				Class572_Sub14 class572_sub14 = class572_sub14s[i_78_];
				if (class572_sub14 != null)
					class572_sub14.method8435(i_78_);
			}
			for (int i_79_ = 0; i_79_ < anInt2086 * -1715487093; i_79_++) {
				for (int i_80_ = 0; i_80_ < anInt2089 * 792439321; i_80_++) {
					short[] is_81_ = (((Class174_Sub1) this).aShortArrayArray10695[i_80_ * (anInt2086 * -1715487093) + i_79_]);
					if (is_81_ != null) {
						int i_82_ = 0;
						int i_83_ = 0;
						while (i_83_ < is_81_.length) {
							int i_84_ = is_81_[i_83_++] & 0xffff;
							int i_85_ = is_81_[i_83_++] & 0xffff;
							int i_86_ = is_81_[i_83_++] & 0xffff;
							Class572_Sub14 class572_sub14 = class572_sub14s[i_84_];
							Class572_Sub14 class572_sub14_87_ = class572_sub14s[i_85_];
							Class572_Sub14 class572_sub14_88_ = class572_sub14s[i_86_];
							Class572_Sub14 class572_sub14_89_ = null;
							if (class572_sub14 != null) {
								class572_sub14.method8436(i_79_, i_80_, i_82_);
								class572_sub14_89_ = class572_sub14;
							}
							if (class572_sub14_87_ != null) {
								class572_sub14_87_.method8436(i_79_, i_80_, i_82_);
								if (class572_sub14_89_ == null || ((class572_sub14_87_.hash * 381237825124074065L) < (class572_sub14_89_.hash * 381237825124074065L)))
									class572_sub14_89_ = class572_sub14_87_;
							}
							if (class572_sub14_88_ != null) {
								class572_sub14_88_.method8436(i_79_, i_80_, i_82_);
								if (class572_sub14_89_ == null || ((class572_sub14_88_.hash * 381237825124074065L) < (class572_sub14_89_.hash * 381237825124074065L)))
									class572_sub14_89_ = class572_sub14_88_;
							}
							if (class572_sub14_89_ != null) {
								if (class572_sub14 != null)
									class572_sub14_89_.method8435(i_84_);
								if (class572_sub14_87_ != null)
									class572_sub14_89_.method8435(i_85_);
								if (class572_sub14_88_ != null)
									class572_sub14_89_.method8435(i_86_);
								class572_sub14_89_.method8436(i_79_, i_80_, i_82_);
							}
							i_82_++;
						}
					}
				}
			}
			((Class174_Sub1) this).anInt10720 = 0;
			for (int i_90_ = 0; i_90_ < ((Class174_Sub1) this).aClass572Array10701.length; i_90_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_90_]);
				if (((Class572_Sub14) class572_sub14).anInt9111 > 0)
					((Class174_Sub1) this).aClass572Array10701[((Class174_Sub1) this).anInt10720++] = class572_sub14;
			}
			((Class174_Sub1) this).aClass572Array10708 = new Class572[((Class174_Sub1) this).anInt10720];
			long[] ls = new long[((Class174_Sub1) this).anInt10720];
			for (int i_91_ = 0; i_91_ < ((Class174_Sub1) this).anInt10720; i_91_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_91_]);
				ls[i_91_] = class572_sub14.hash * 381237825124074065L;
				((Class174_Sub1) this).aClass572Array10708[i_91_] = class572_sub14;
			}
			Class543.method6441(ls, ((Class174_Sub1) this).aClass572Array10708, -777241654);
			method9987();
		}
	}

	public void method2721(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_92_, int i_93_, int i_94_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_95_ = (i - (i_92_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_96_ = (i_93_ - (i_92_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4460(class572_sub12_sub18, i_95_, i_96_);
		}
	}

	void method9986(int i, int i_97_, byte[][] is, Class572_Sub14[] class572_sub14s, Class676 class676, Class572_Sub14[] class572_sub14s_98_) {
		if (((Class174_Sub1) this).anIntArrayArrayArray10699[i][i_97_] != null) {
			Class572_Sub14[] class572_sub14s_99_ = (((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725[i][i_97_]);
			int[] is_100_ = ((Class174_Sub1) this).anIntArrayArrayArray10698[i][i_97_];
			int[] is_101_ = ((Class174_Sub1) this).anIntArrayArrayArray10702[i][i_97_];
			int[] is_102_ = ((Class174_Sub1) this).anIntArrayArrayArray10700[i][i_97_];
			int[] is_103_ = ((Class174_Sub1) this).anIntArrayArrayArray10699[i][i_97_];
			int[] is_104_ = (((Class174_Sub1) this).anIntArrayArrayArray10703 != null ? ((Class174_Sub1) this).anIntArrayArrayArray10703[i][i_97_] : null);
			int[] is_105_ = (((Class174_Sub1) this).anIntArrayArrayArray10704 != null ? ((Class174_Sub1) this).anIntArrayArrayArray10704[i][i_97_] : null);
			if (is_102_ == null)
				is_102_ = is_103_;
			float f = ((Class174_Sub1) this).aFloatArrayArray10691[i][i_97_];
			float f_106_ = ((Class174_Sub1) this).aFloatArrayArray10716[i][i_97_];
			float f_107_ = ((Class174_Sub1) this).aFloatArrayArray10706[i][i_97_];
			float f_108_ = ((Class174_Sub1) this).aFloatArrayArray10691[i][i_97_ + 1];
			float f_109_ = ((Class174_Sub1) this).aFloatArrayArray10716[i][i_97_ + 1];
			float f_110_ = ((Class174_Sub1) this).aFloatArrayArray10706[i][i_97_ + 1];
			float f_111_ = (((Class174_Sub1) this).aFloatArrayArray10691[i + 1][i_97_ + 1]);
			float f_112_ = (((Class174_Sub1) this).aFloatArrayArray10716[i + 1][i_97_ + 1]);
			float f_113_ = (((Class174_Sub1) this).aFloatArrayArray10706[i + 1][i_97_ + 1]);
			float f_114_ = ((Class174_Sub1) this).aFloatArrayArray10691[i + 1][i_97_];
			float f_115_ = ((Class174_Sub1) this).aFloatArrayArray10716[i + 1][i_97_];
			float f_116_ = ((Class174_Sub1) this).aFloatArrayArray10706[i + 1][i_97_];
			int i_117_ = is[i][i_97_] & 0xff;
			int i_118_ = is[i][i_97_ + 1] & 0xff;
			int i_119_ = is[i + 1][i_97_ + 1] & 0xff;
			int i_120_ = is[i + 1][i_97_] & 0xff;
			int i_121_ = 0;
			while_68_: for (int i_122_ = 0; i_122_ < is_103_.length; i_122_++) {
				Class572_Sub14 class572_sub14 = class572_sub14s_99_[i_122_];
				for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
					if (class572_sub14s[i_123_] == class572_sub14)
						continue while_68_;
				}
				class572_sub14s[i_121_++] = class572_sub14;
			}
			short[] is_124_ = (((Class174_Sub1) this).aShortArrayArray10695[i_97_ * (anInt2086 * -1715487093) + i] = new short[is_103_.length]);
			for (int i_125_ = 0; i_125_ < is_103_.length; i_125_++) {
				int i_126_ = (i << anInt2088 * 212267571) + is_100_[i_125_];
				int i_127_ = (i_97_ << anInt2088 * 212267571) + is_101_[i_125_];
				int i_128_ = i_126_ >> ((Class174_Sub1) this).anInt10689;
				int i_129_ = i_127_ >> ((Class174_Sub1) this).anInt10689;
				int i_130_ = is_103_[i_125_];
				int i_131_ = is_102_[i_125_];
				int i_132_ = is_104_ != null ? is_104_[i_125_] : 0;
				long l = ((long) i_131_ << 48 | (long) i_130_ << 32 | (long) (i_128_ << 16) | (long) i_129_);
				int i_133_ = is_100_[i_125_];
				int i_134_ = is_101_[i_125_];
				int i_135_ = 74;
				int i_136_ = 0;
				float f_137_ = 1.0F;
				float f_138_;
				float f_139_;
				float f_140_;
				if (i_133_ == 0 && i_134_ == 0) {
					f_138_ = f;
					f_139_ = f_106_;
					f_140_ = f_107_;
					i_135_ -= i_117_;
				} else if (i_133_ == 0 && i_134_ == anInt2087 * 2129890771) {
					f_138_ = f_108_;
					f_139_ = f_109_;
					f_140_ = f_110_;
					i_135_ -= i_118_;
				} else if (i_133_ == anInt2087 * 2129890771 && i_134_ == anInt2087 * 2129890771) {
					f_138_ = f_111_;
					f_139_ = f_112_;
					f_140_ = f_113_;
					i_135_ -= i_119_;
				} else if (i_133_ == anInt2087 * 2129890771 && i_134_ == 0) {
					f_138_ = f_114_;
					f_139_ = f_115_;
					f_140_ = f_116_;
					i_135_ -= i_120_;
				} else {
					float f_141_ = (float) i_133_ / (float) (anInt2087 * 2129890771);
					float f_142_ = (float) i_134_ / (float) (anInt2087 * 2129890771);
					float f_143_ = f + (f_114_ - f) * f_141_;
					float f_144_ = f_106_ + (f_115_ - f_106_) * f_141_;
					float f_145_ = f_107_ + (f_116_ - f_107_) * f_141_;
					float f_146_ = f_108_ + (f_111_ - f_108_) * f_141_;
					float f_147_ = f_109_ + (f_112_ - f_109_) * f_141_;
					float f_148_ = f_110_ + (f_113_ - f_110_) * f_141_;
					f_138_ = f_143_ + (f_146_ - f_143_) * f_142_;
					f_139_ = f_144_ + (f_147_ - f_144_) * f_142_;
					f_140_ = f_145_ + (f_148_ - f_145_) * f_142_;
					int i_149_ = i_117_ + ((i_120_ - i_117_) * i_133_ >> anInt2088 * 212267571);
					int i_150_ = i_118_ + ((i_119_ - i_118_) * i_133_ >> anInt2088 * 212267571);
					i_135_ -= i_149_ + ((i_150_ - i_149_) * i_134_ >> anInt2088 * 212267571);
				}
				if (i_130_ != -1) {
					int i_151_ = (i_130_ & 0x7f) * i_135_ >> 7;
					if (i_151_ < 2)
						i_151_ = 2;
					else if (i_151_ > 126)
						i_151_ = 126;
					i_136_ = Class460.anIntArray5210[i_130_ & 0xff80 | i_151_];
					if ((((Class174_Sub1) this).anInt10692 & 0x7) == 0) {
						f_137_ = ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[0]) * f_138_ + (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[1]) * f_139_ + (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[2]) * f_140_);
						f_137_ = ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) + f_137_ * (f_137_ > 0.0F ? (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) : (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456)));
					}
				}
				Class572 class572 = null;
				if ((i_126_ & ((Class174_Sub1) this).anInt10718 - 1) == 0 && (i_127_ & ((Class174_Sub1) this).anInt10718 - 1) == 0)
					class572 = class676.get(l);
				int i_152_;
				if (class572 == null) {
					int i_153_;
					if (i_131_ != i_130_) {
						int i_154_ = (i_131_ & 0x7f) * i_135_ >> 7;
						if (i_154_ < 2)
							i_154_ = 2;
						else if (i_154_ > 126)
							i_154_ = 126;
						i_153_ = (Class460.anIntArray5210[i_131_ & 0xff80 | i_154_]);
						if ((((Class174_Sub1) this).anInt10692 & 0x7) == 0) {
							float f_155_ = ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[0]) * f_138_ + (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[1]) * f_139_ + (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[2]) * f_140_);
							f_155_ = ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) + f_137_ * (f_137_ > 0.0F ? (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) : (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456)));
							int i_156_ = i_153_ >> 16 & 0xff;
							int i_157_ = i_153_ >> 8 & 0xff;
							int i_158_ = i_153_ & 0xff;
							i_156_ *= f_155_;
							if (i_156_ < 0)
								i_156_ = 0;
							else if (i_156_ > 255)
								i_156_ = 255;
							i_157_ *= f_155_;
							if (i_157_ < 0)
								i_157_ = 0;
							else if (i_157_ > 255)
								i_157_ = 255;
							i_158_ *= f_155_;
							if (i_158_ < 0)
								i_158_ = 0;
							else if (i_158_ > 255)
								i_158_ = 255;
							i_153_ = i_156_ << 16 | i_157_ << 8 | i_158_;
						}
					} else
						i_153_ = i_136_;
					Unsafe unsafe = (((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377);
					unsafe.putFloat(((Class174_Sub1) this).aLong10726, (float) i_126_);
					((Class174_Sub1) this).aLong10726 += 4L;
					unsafe.putFloat(((Class174_Sub1) this).aLong10726, (float) (method2726(i_126_, i_127_, 358769667) + i_132_));
					((Class174_Sub1) this).aLong10726 += 4L;
					unsafe.putFloat(((Class174_Sub1) this).aLong10726, (float) i_127_);
					((Class174_Sub1) this).aLong10726 += 4L;
					unsafe.putFloat(((Class174_Sub1) this).aLong10726, (float) i_126_);
					((Class174_Sub1) this).aLong10726 += 4L;
					unsafe.putFloat(((Class174_Sub1) this).aLong10726, (float) i_127_);
					((Class174_Sub1) this).aLong10726 += 4L;
					if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null) {
						unsafe.putFloat(((Class174_Sub1) this).aLong10726, (is_105_ != null ? (float) (is_105_[i_125_] - 1) : 0.0F));
						((Class174_Sub1) this).aLong10726 += 4L;
					}
					if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0) {
						unsafe.putFloat(((Class174_Sub1) this).aLong10726, f_138_);
						((Class174_Sub1) this).aLong10726 += 4L;
						unsafe.putFloat(((Class174_Sub1) this).aLong10726, f_139_);
						((Class174_Sub1) this).aLong10726 += 4L;
						unsafe.putFloat(((Class174_Sub1) this).aLong10726, f_140_);
						((Class174_Sub1) this).aLong10726 += 4L;
					}
					if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).anInt10477 == 0) {
						int i_159_ = i_153_ & ~0xff00ff;
						i_159_ |= (i_153_ & 0xff0000) >> 16;
						i_159_ |= (i_153_ & 0xff) << 16;
						i_153_ = i_159_;
					}
					unsafe.putInt(((Class174_Sub1) this).aLong10721, ~0xffffff | i_153_);
					((Class174_Sub1) this).aLong10721 += 4L;
					i_152_ = ((Class174_Sub1) this).anInt10693++;
					is_124_[i_125_] = (short) i_152_;
					if (i_130_ != -1)
						class572_sub14s_98_[i_152_] = class572_sub14s_99_[i_125_];
					class676.put(new Class572_Sub11(is_124_[i_125_]), l);
				} else {
					is_124_[i_125_] = ((Class572_Sub11) class572).aShort9091;
					i_152_ = is_124_[i_125_] & 0xffff;
					if (i_130_ != -1 && ((class572_sub14s_99_[i_125_].hash * 381237825124074065L) < (class572_sub14s_98_[i_152_].hash * 381237825124074065L)))
						class572_sub14s_98_[i_152_] = class572_sub14s_99_[i_125_];
				}
				for (int i_160_ = 0; i_160_ < i_121_; i_160_++)
					class572_sub14s[i_160_].method8434(i_152_, i_136_, i_135_, f_137_);
				((Class174_Sub1) this).anInt10694++;
			}
		}
	}

	void method9987() {
		((Class174_Sub1) this).anInterface44_10690 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9723(false);
		((Class174_Sub1) this).anInterface44_10690.method259(((Class174_Sub1) this).anInt10693 * 4, 4);
		((Class174_Sub1) this).anInterface44_10690.method223(0, ((Class174_Sub1) this).anInt10693 * 4, ((Class174_Sub1) this).aLong10723);
		((Class174_Sub1) this).anInterface44_10686 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9723(false);
		((Class174_Sub1) this).anInterface44_10686.method259((((Class174_Sub1) this).anInt10693 * ((Class174_Sub1) this).anInt10724), ((Class174_Sub1) this).anInt10724);
		((Class174_Sub1) this).anInterface44_10686.method223(0, (((Class174_Sub1) this).anInt10693 * ((Class174_Sub1) this).anInt10724), (((Class174_Sub1) this).aLong10723 + (long) (((Class174_Sub1) this).anInt10705 * 4)));
		((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377.freeMemory(((Class174_Sub1) this).aLong10723);
		if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0) {
			if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
				((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
					new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4471, Class364.aClass364_4464 }), new Class354(Class364.aClass364_4468) }));
			else
				((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
					new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4464 }), new Class354(Class364.aClass364_4468) }));
		} else if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
			((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
				new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4471 }), new Class354(Class364.aClass364_4468) }));
		else
			((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
				new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }), new Class354(Class364.aClass364_4468) }));
		for (int i = 0; i < ((Class174_Sub1) this).anInt10720; i++) {
			Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i]);
			class572_sub14.method8438(((Class174_Sub1) this).anInt10693);
		}
		if (((Class174_Sub1) this).aClass361_10711 != null)
			((Class174_Sub1) this).aClass361_10711.method4452();
		method9990();
	}

	public void method2716(int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, boolean[][] bools) {
		if (((Class174_Sub1) this).anInt10705 > 0) {
			Interface46 interface46 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9597(((Class174_Sub1) this).anInt10694);
			int i_167_ = 0;
			int i_168_ = 32767;
			int i_169_ = -32768;
			ByteBuffer bytebuffer = ((Class174_Sub1) this).aClass106_Sub3_10688.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_170_ = i_164_; i_170_ < i_166_; i_170_++) {
				int i_171_ = i_170_ * (anInt2086 * -1715487093) + i_163_;
				for (int i_172_ = i_163_; i_172_ < i_165_; i_172_++) {
					if (bools[i_172_ - i_163_][i_170_ - i_164_]) {
						short[] is = (((Class174_Sub1) this).aShortArrayArray10695[i_171_]);
						if (is != null) {
							for (int i_173_ = 0; i_173_ < is.length; i_173_++) {
								int i_174_ = is[i_173_] & 0xffff;
								if (i_174_ > i_169_)
									i_169_ = i_174_;
								if (i_174_ < i_168_)
									i_168_ = i_174_;
								bytebuffer.putShort((short) i_174_);
								i_167_++;
							}
						}
					}
					i_171_++;
				}
			}
			interface46.method223(0, bytebuffer.position(), (((Class174_Sub1) this).aClass106_Sub3_10688.aLong10444));
			if (i_167_ > 0) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9685();
				Class340 class340 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass340_10480);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, ((Class174_Sub1) this).anInterface44_10690);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9693(interface46);
				((Class174_Sub1) this).aClass106_Sub3_10688.method1761(Class261.aClass261_2800);
				float f = (float) ((Class174_Sub1) this).aClass106_Sub3_10688.method1683(-305395232).method1648();
				float f_175_ = (float) ((Class174_Sub1) this).aClass106_Sub3_10688.method1683(-269727349).method1646();
				Class261 class261 = new Class261();
				Class261 class261_176_ = new Class261();
				class261.method3572(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class261_176_.method3577((float) i_162_ / (256.0F * (float) (anInt2087 * 2129890771)), (float) -i_162_ / (256.0F * (float) (anInt2087 * 2129890771)), 1.0F / (((Class174_Sub1) this).aFloat10697 - ((Class174_Sub1) this).aFloat10722));
				class261_176_.method3580((float) i - (float) (i_163_ * i_162_) / 256.0F, (float) i_161_ + (float) (i_166_ * i_162_) / 256.0F, (-((Class174_Sub1) this).aFloat10722 / (((Class174_Sub1) this).aFloat10697 - ((Class174_Sub1) this).aFloat10722)));
				class261_176_.method3578(2.0F / f, 2.0F / f_175_, 1.0F);
				class261_176_.method3580(-1.0F, -1.0F, 0.0F);
				((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass261_10443.method3581(class261, class261_176_);
				((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399.method3446(((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass261_10443);
				((Class174_Sub1) this).aClass106_Sub3_10688.method1764(((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399);
				class340.method4279(Class250.aClass250_2727);
				class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
				class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
				class340.aClass250_4332.method3444();
				class340.anInt4330 = i_168_;
				class340.anInt4346 = i_169_ - i_168_ + 1;
				class340.anInt4347 = 0;
				class340.anInt4348 = i_167_ / 3;
				if (((Class174_Sub1) this).aClass106_Sub3_10688.aBool10536) {
					((Class174_Sub1) this).aClass106_Sub3_10688.method1763(false);
					class340.method4263(false);
					((Class174_Sub1) this).aClass106_Sub3_10688.method1763(true);
				} else
					class340.method4263(false);
			}
		}
	}

	public Class572_Sub12_Sub18 method2710(int i, int i_177_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub1) this).aByteArrayArray10712[i][i_177_] & 0x1) == 0)
			return null;
		int i_178_ = (anInt2087 * 2129890771 >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_179_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_178_, i_178_)) {
			class572_sub12_sub18_sub2_179_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_179_.method10652();
		} else
			class572_sub12_sub18_sub2_179_ = new NativeShadow((((Class174_Sub1) this).aClass106_Sub3_10688), i_178_, i_178_);
		class572_sub12_sub18_sub2_179_.method10650(0, 0, i_178_, i_178_);
		method9988(class572_sub12_sub18_sub2_179_, i, i_177_);
		return class572_sub12_sub18_sub2_179_;
	}

	void method9988(NativeShadow class572_sub12_sub18_sub2, int i, int i_180_) {
		int[] is = ((Class174_Sub1) this).anIntArrayArrayArray10698[i][i_180_];
		int[] is_181_ = ((Class174_Sub1) this).anIntArrayArrayArray10702[i][i_180_];
		int i_182_ = is.length;
		if (((Class174_Sub1) this).anIntArray10696.length < i_182_) {
			((Class174_Sub1) this).anIntArray10696 = new int[i_182_];
			((Class174_Sub1) this).anIntArray10719 = new int[i_182_];
		}
		for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
			((Class174_Sub1) this).anIntArray10696[i_183_] = is[i_183_] >> (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).shadowScale);
			((Class174_Sub1) this).anIntArray10719[i_183_] = is_181_[i_183_] >> (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		}
		int i_184_ = 0;
		while (i_184_ < i_182_) {
			int i_185_ = ((Class174_Sub1) this).anIntArray10696[i_184_];
			int i_186_ = ((Class174_Sub1) this).anIntArray10719[i_184_++];
			int i_187_ = ((Class174_Sub1) this).anIntArray10696[i_184_];
			int i_188_ = ((Class174_Sub1) this).anIntArray10719[i_184_++];
			int i_189_ = ((Class174_Sub1) this).anIntArray10696[i_184_];
			int i_190_ = ((Class174_Sub1) this).anIntArray10719[i_184_++];
			if (((i_185_ - i_187_) * (i_188_ - i_190_) - (i_188_ - i_186_) * (i_189_ - i_187_)) > 0)
				class572_sub12_sub18_sub2.fill(i_186_, i_188_, i_190_, i_185_, i_187_, i_189_);
		}
	}

	public boolean method2723(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_191_, int i_192_, int i_193_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 == null || class572_sub12_sub18 == null)
			return false;
		int i_194_ = (i - (i_191_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		int i_195_ = (i_192_ - (i_191_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY) >> 8) >> ((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).shadowScale);
		return ((Class174_Sub1) this).aClass361_10711.method4464(class572_sub12_sub18, i_194_, i_195_);
	}

	public boolean method2738(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_196_, int i_197_, int i_198_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 == null || class572_sub12_sub18 == null)
			return false;
		int i_199_ = (i - (i_196_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		int i_200_ = (i_197_ - (i_196_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY) >> 8) >> ((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).shadowScale);
		return ((Class174_Sub1) this).aClass361_10711.method4464(class572_sub12_sub18, i_199_, i_200_);
	}

	public void method2728(int i, int i_201_, int[] is, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int[] is_208_, Class86 class86, boolean bool) {
		MapSize mapSize = ((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396;
		if (is_204_ != null && ((Class174_Sub1) this).anIntArrayArrayArray10704 == null)
			((Class174_Sub1) this).anIntArrayArrayArray10704 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		if (is_202_ != null && ((Class174_Sub1) this).anIntArrayArrayArray10703 == null)
			((Class174_Sub1) this).anIntArrayArrayArray10703 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		((Class174_Sub1) this).anIntArrayArrayArray10698[i][i_201_] = is;
		((Class174_Sub1) this).anIntArrayArrayArray10702[i][i_201_] = is_203_;
		((Class174_Sub1) this).anIntArrayArrayArray10699[i][i_201_] = is_205_;
		((Class174_Sub1) this).anIntArrayArrayArray10700[i][i_201_] = is_206_;
		if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
			((Class174_Sub1) this).anIntArrayArrayArray10704[i][i_201_] = is_204_;
		if (((Class174_Sub1) this).anIntArrayArrayArray10703 != null)
			((Class174_Sub1) this).anIntArrayArrayArray10703[i][i_201_] = is_202_;
		Class572_Sub14[] class572_sub14s = (((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725[i][i_201_] = new Class572_Sub14[is_205_.length]);
		for (int i_209_ = 0; i_209_ < is_205_.length; i_209_++) {
			int i_210_ = is_207_[i_209_];
			int i_211_ = is_208_[i_209_];
			if ((((Class174_Sub1) this).anInt10692 & 0x20) != 0 && i_210_ != -1 && mapSize.getTexture(i_210_, 1574500826).aBool1350) {
				i_211_ = 128;
				i_210_ = -1;
			}
			long l = ((long) (class86.anInt1191 * 1873501081) << 48 | (long) (class86.anInt1190 * -1018540369) << 42 | (long) (class86.anInt1193 * 526464983) << 28 | (long) (i_211_ << 14) | (long) i_210_);
			Class572 class572;
			for (class572 = ((Class174_Sub1) this).aClass676_10709.get(l); class572 != null; class572 = ((Class174_Sub1) this).aClass676_10709.method7971((byte) 61)) {
				Class572_Sub14 class572_sub14 = (Class572_Sub14) class572;
				if (((Class572_Sub14) class572_sub14).anInt9105 == i_210_ && (((Class572_Sub14) class572_sub14).aFloat9106 == (float) i_211_) && ((Class572_Sub14) class572_sub14).aClass86_9107.method1274(class86, -841821437))
					break;
			}
			if (class572 == null) {
				class572_sub14s[i_209_] = new Class572_Sub14(this, i_210_, i_211_, class86);
				((Class174_Sub1) this).aClass676_10709.put(class572_sub14s[i_209_], l);
			} else
				class572_sub14s[i_209_] = (Class572_Sub14) class572;
		}
		if (bool)
			((Class174_Sub1) this).aByteArrayArray10712[i][i_201_] |= 0x1;
		if (is_205_.length > ((Class174_Sub1) this).anInt10713)
			((Class174_Sub1) this).anInt10713 = is_205_.length;
		((Class174_Sub1) this).anInt10705 += is_205_.length;
	}

	public void method2724(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub1) this).aClass675_10707.method7940(new Class572_Sub21(((Class174_Sub1) this).aClass106_Sub3_10688, this, class572_sub36, is), -2028777366);
	}

	public void method2714(int i, int i_212_, int i_213_) {
		i = Math.min(((Class174_Sub1) this).aByteArrayArray10714.length - 1, Math.max(0, i));
		i_212_ = Math.min((((Class174_Sub1) this).aByteArrayArray10714[i].length - 1), Math.max(0, i_212_));
		if ((((Class174_Sub1) this).aByteArrayArray10714[i][i_212_] & 0xff) < i_213_)
			((Class174_Sub1) this).aByteArrayArray10714[i][i_212_] = (byte) i_213_;
	}

	public void method2715(int i, int i_214_, int i_215_, boolean[][] bools, boolean bool, int i_216_) {
		if (((Class174_Sub1) this).aClass572Array10708 != null) {
			int i_217_ = i_215_ + i_215_ + 1;
			i_217_ *= i_217_;
			if (((Class174_Sub1) this).anIntArray10728.length < i_217_)
				((Class174_Sub1) this).anIntArray10728 = new int[i_217_];
			int i_218_ = i - i_215_;
			int i_219_ = i_218_;
			if (i_218_ < 0)
				i_218_ = 0;
			int i_220_ = i_214_ - i_215_;
			int i_221_ = i_220_;
			if (i_220_ < 0)
				i_220_ = 0;
			int i_222_ = i + i_215_;
			if (i_222_ > anInt2086 * -1715487093 - 1)
				i_222_ = anInt2086 * -1715487093 - 1;
			int i_223_ = i_214_ + i_215_;
			if (i_223_ > anInt2089 * 792439321 - 1)
				i_223_ = anInt2089 * 792439321 - 1;
			((Class174_Sub1) this).anInt10727 = 0;
			for (int i_224_ = i_218_; i_224_ <= i_222_; i_224_++) {
				boolean[] bools_225_ = bools[i_224_ - i_219_];
				for (int i_226_ = i_220_; i_226_ <= i_223_; i_226_++) {
					if (bools_225_[i_226_ - i_221_])
						((Class174_Sub1) this).anIntArray10728[((Class174_Sub1) this).anInt10727++] = i_226_ * (anInt2086 * -1715487093) + i_224_;
				}
			}
			ByteBuffer bytebuffer = ((Class174_Sub1) this).aClass106_Sub3_10688.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_227_ = 0; i_227_ < ((Class174_Sub1) this).aClass572Array10708.length; i_227_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10708[i_227_]);
				class572_sub14.method8439((((Class174_Sub1) this).anIntArray10728), ((Class174_Sub1) this).anInt10727);
			}
			int i_228_ = bytebuffer.position();
			Class340 class340 = (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass340_10480);
			if (i_228_ != 0) {
				Interface46 interface46 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9597(i_228_ / 2);
				interface46.method223(0, i_228_, (((Class174_Sub1) this).aClass106_Sub3_10688.aLong10444));
				((Class174_Sub1) this).aClass106_Sub3_10688.method9685();
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9693(interface46);
				class340.method4279(Class250.aClass250_2727);
				if (((Class174_Sub1) this).aClass106_Sub3_10688.anInt10448 > 0) {
					class340.aClass240_4339.method3268((float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 16 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 8 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 0 & 0xff) / 255.0F);
					class340.aClass209_4338.method3040(0.0F, 0.0F, 1.0F, -(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503));
					class340.aClass209_4338.method3045(((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass250_10394);
					class340.aClass209_4338.method3043(1.0F / ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10504) - (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503)));
				} else {
					class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
					class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				}
				if ((((Class174_Sub1) this).anInt10692 & 0x7) == 0) {
					int i_229_ = 0;
					for (int i_230_ = 0; (i_230_ < ((Class174_Sub1) this).aClass572Array10708.length); i_230_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_230_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 != 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								class340.aClass209_4336.method3040(0.0F, 1.0F, 0.0F, ((float) (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).anInt10507) + ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1191) * 1873501081) / 255.0F * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369))));
								class340.aClass209_4336.method3043(1.0F / (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							boolean bool_231_ = false;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 940665327));
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								bool_231_ = !Class649.method7677(class101.effectId, 1841021003);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_229_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							class340.method4263(bool_231_);
							i_229_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				} else {
					class340.aClass240_4340.method3268((((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[0]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[1]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[2]));
					class340.aClass240_4341.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4334.method3268((-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4326.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					int i_232_ = 0;
					for (int i_233_ = 0; (i_233_ < ((Class174_Sub1) this).aClass572Array10708.length); i_233_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_233_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 > 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								float f = 0.15F;
								class340.aClass209_4336.method3040(0.0F, 1.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f), 0.0F, 256.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							byte i_234_ = 11;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 1802404832));
								i_234_ = class101.effectId;
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								class340.method4261(class101.effectParam1);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_232_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							switch (i_234_) {
								default:
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4262();
									else
										class340.method4264(0);
									break;
								case 7:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									class340.aClass250_4333.method3444();
									class340.anInterface33_4331 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9600();
									class340.method4272(0);
									break;
								case 1:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4266();
									else
										class340.method4265(0);
									break;
								case 2:
								case 4:
								case 8:
								case 9:
									if (!(((Class174_Sub1) this).aClass106_Sub3_10688.aBool10488) && (((Class174_Sub1) this).anInt10692 & 0x8) != 0 && ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485.method10155(-1886118265)) {
										Class349_Sub1_Sub1 class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485);
										if (i_234_ == 2)
											class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10484);
										class349_sub1_sub1.aClass250_11179.method3442(((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10414);
										class349_sub1_sub1.aClass250_11170.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F, 1.0F);
										class349_sub1_sub1.aClass240_11185.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
										MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), -146454182));
										class349_sub1_sub1.anInt11173 = class101.effectParam1 * -1911736543;
										class349_sub1_sub1.anInt11188 = (((Class572_Sub14) class572_sub14).anInt9112) * -674989163;
										class349_sub1_sub1.anInt11169 = ((((Class572_Sub14) class572_sub14).anInt9113) - (((Class572_Sub14) class572_sub14).anInt9112) + 1) * 886381173;
										class349_sub1_sub1.anInt11181 = i_232_ * 2025213095;
										class349_sub1_sub1.anInt11189 = (((Class572_Sub14) class572_sub14).anInt9103) / 3 * 137354721;
										class349_sub1_sub1.aClass209_11163.method3049(class340.aClass209_4336);
										class349_sub1_sub1.aClass240_11174.method3269(class340.aClass240_4337);
										class349_sub1_sub1.aClass209_11191.method3049(class340.aClass209_4338);
										class349_sub1_sub1.aClass240_11187.method3269(class340.aClass240_4339);
										class349_sub1_sub1.method10156((byte) 5);
									} else
										class340.method4264(0);
									break;
								case 6:
									class340.method4263(!Class649.method7677(i_234_, 2099998996));
							}
							i_232_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				}
			}
			if (!((Class174_Sub1) this).aClass675_10707.method7928((byte) -106)) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(128);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9618(false);
				Class240 class240 = new Class240(class340.aClass240_4339);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				Iterator iterator = ((Class174_Sub1) this).aClass675_10707.iterator();
				while (iterator.hasNext()) {
					Class572_Sub21 class572_sub21 = (Class572_Sub21) iterator.next();
					class572_sub21.method8599(class340, i, i_214_, i_215_, bools, bool);
				}
				class340.aClass240_4339.method3269(class240);
			}
			if (((Class174_Sub1) this).aClass361_10711 != null) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(1);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, ((Class174_Sub1) this).anInterface44_10690);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
				Class250 class250 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399);
				class250.method3444();
				class250.aFloatArray2728[13] = -1.0F;
				class340.method4279(class250);
				((Class174_Sub1) this).aClass361_10711.method4453(class340, i, i_214_, i_215_, bools, bool);
			}
		}
	}

	public void method2731(int i, int i_235_, int i_236_, boolean[][] bools, boolean bool, int i_237_) {
		if (((Class174_Sub1) this).aClass572Array10708 != null) {
			int i_238_ = i_236_ + i_236_ + 1;
			i_238_ *= i_238_;
			if (((Class174_Sub1) this).anIntArray10728.length < i_238_)
				((Class174_Sub1) this).anIntArray10728 = new int[i_238_];
			int i_239_ = i - i_236_;
			int i_240_ = i_239_;
			if (i_239_ < 0)
				i_239_ = 0;
			int i_241_ = i_235_ - i_236_;
			int i_242_ = i_241_;
			if (i_241_ < 0)
				i_241_ = 0;
			int i_243_ = i + i_236_;
			if (i_243_ > anInt2086 * -1715487093 - 1)
				i_243_ = anInt2086 * -1715487093 - 1;
			int i_244_ = i_235_ + i_236_;
			if (i_244_ > anInt2089 * 792439321 - 1)
				i_244_ = anInt2089 * 792439321 - 1;
			((Class174_Sub1) this).anInt10727 = 0;
			for (int i_245_ = i_239_; i_245_ <= i_243_; i_245_++) {
				boolean[] bools_246_ = bools[i_245_ - i_240_];
				for (int i_247_ = i_241_; i_247_ <= i_244_; i_247_++) {
					if (bools_246_[i_247_ - i_242_])
						((Class174_Sub1) this).anIntArray10728[((Class174_Sub1) this).anInt10727++] = i_247_ * (anInt2086 * -1715487093) + i_245_;
				}
			}
			ByteBuffer bytebuffer = ((Class174_Sub1) this).aClass106_Sub3_10688.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_248_ = 0; i_248_ < ((Class174_Sub1) this).aClass572Array10708.length; i_248_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10708[i_248_]);
				class572_sub14.method8439((((Class174_Sub1) this).anIntArray10728), ((Class174_Sub1) this).anInt10727);
			}
			int i_249_ = bytebuffer.position();
			Class340 class340 = (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass340_10480);
			if (i_249_ != 0) {
				Interface46 interface46 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9597(i_249_ / 2);
				interface46.method223(0, i_249_, (((Class174_Sub1) this).aClass106_Sub3_10688.aLong10444));
				((Class174_Sub1) this).aClass106_Sub3_10688.method9685();
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9693(interface46);
				class340.method4279(Class250.aClass250_2727);
				if (((Class174_Sub1) this).aClass106_Sub3_10688.anInt10448 > 0) {
					class340.aClass240_4339.method3268((float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 16 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 8 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 0 & 0xff) / 255.0F);
					class340.aClass209_4338.method3040(0.0F, 0.0F, 1.0F, -(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503));
					class340.aClass209_4338.method3045(((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass250_10394);
					class340.aClass209_4338.method3043(1.0F / ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10504) - (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503)));
				} else {
					class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
					class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				}
				if ((((Class174_Sub1) this).anInt10692 & 0x7) == 0) {
					int i_250_ = 0;
					for (int i_251_ = 0; (i_251_ < ((Class174_Sub1) this).aClass572Array10708.length); i_251_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_251_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 != 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								class340.aClass209_4336.method3040(0.0F, 1.0F, 0.0F, ((float) (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).anInt10507) + ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1191) * 1873501081) / 255.0F * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369))));
								class340.aClass209_4336.method3043(1.0F / (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							boolean bool_252_ = false;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 1175437456));
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								bool_252_ = !Class649.method7677(class101.effectId, 1829964458);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_250_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							class340.method4263(bool_252_);
							i_250_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				} else {
					class340.aClass240_4340.method3268((((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[0]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[1]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[2]));
					class340.aClass240_4341.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4334.method3268((-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4326.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					int i_253_ = 0;
					for (int i_254_ = 0; (i_254_ < ((Class174_Sub1) this).aClass572Array10708.length); i_254_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_254_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 > 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								float f = 0.15F;
								class340.aClass209_4336.method3040(0.0F, 1.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f), 0.0F, 256.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							byte i_255_ = 11;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), -303458566));
								i_255_ = class101.effectId;
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								class340.method4261(class101.effectParam1);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_253_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							switch (i_255_) {
								default:
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4262();
									else
										class340.method4264(0);
									break;
								case 7:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									class340.aClass250_4333.method3444();
									class340.anInterface33_4331 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9600();
									class340.method4272(0);
									break;
								case 1:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4266();
									else
										class340.method4265(0);
									break;
								case 2:
								case 4:
								case 8:
								case 9:
									if (!(((Class174_Sub1) this).aClass106_Sub3_10688.aBool10488) && (((Class174_Sub1) this).anInt10692 & 0x8) != 0 && ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485.method10155(-377632654)) {
										Class349_Sub1_Sub1 class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485);
										if (i_255_ == 2)
											class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10484);
										class349_sub1_sub1.aClass250_11179.method3442(((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10414);
										class349_sub1_sub1.aClass250_11170.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F, 1.0F);
										class349_sub1_sub1.aClass240_11185.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
										MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 477352268));
										class349_sub1_sub1.anInt11173 = class101.effectParam1 * -1911736543;
										class349_sub1_sub1.anInt11188 = (((Class572_Sub14) class572_sub14).anInt9112) * -674989163;
										class349_sub1_sub1.anInt11169 = ((((Class572_Sub14) class572_sub14).anInt9113) - (((Class572_Sub14) class572_sub14).anInt9112) + 1) * 886381173;
										class349_sub1_sub1.anInt11181 = i_253_ * 2025213095;
										class349_sub1_sub1.anInt11189 = (((Class572_Sub14) class572_sub14).anInt9103) / 3 * 137354721;
										class349_sub1_sub1.aClass209_11163.method3049(class340.aClass209_4336);
										class349_sub1_sub1.aClass240_11174.method3269(class340.aClass240_4337);
										class349_sub1_sub1.aClass209_11191.method3049(class340.aClass209_4338);
										class349_sub1_sub1.aClass240_11187.method3269(class340.aClass240_4339);
										class349_sub1_sub1.method10156((byte) 5);
									} else
										class340.method4264(0);
									break;
								case 6:
									class340.method4263(!Class649.method7677(i_255_, 1291919840));
							}
							i_253_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				}
			}
			if (!((Class174_Sub1) this).aClass675_10707.method7928((byte) -44)) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(128);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9618(false);
				Class240 class240 = new Class240(class340.aClass240_4339);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				Iterator iterator = ((Class174_Sub1) this).aClass675_10707.iterator();
				while (iterator.hasNext()) {
					Class572_Sub21 class572_sub21 = (Class572_Sub21) iterator.next();
					class572_sub21.method8599(class340, i, i_235_, i_236_, bools, bool);
				}
				class340.aClass240_4339.method3269(class240);
			}
			if (((Class174_Sub1) this).aClass361_10711 != null) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(1);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, ((Class174_Sub1) this).anInterface44_10690);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
				Class250 class250 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399);
				class250.method3444();
				class250.aFloatArray2728[13] = -1.0F;
				class340.method4279(class250);
				((Class174_Sub1) this).aClass361_10711.method4453(class340, i, i_235_, i_236_, bools, bool);
			}
		}
	}

	public void method2722(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_256_, int i_257_, int i_258_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_259_ = (i - (i_256_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_260_ = (i_257_ - (i_256_ * ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4454(class572_sub12_sub18, i_259_, i_260_);
		}
	}

	public void method2729() {
		if (((Class174_Sub1) this).anInt10705 <= 0) {
			((Class174_Sub1) this).aClass361_10711 = null;
			method9990();
		} else {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_261_ = 1; i_261_ < anInt2089 * 792439321; i_261_++)
					is[i][i_261_] = (byte) (((((Class174_Sub1) this).aByteArrayArray10714[i - 1][i_261_]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i + 1][i_261_]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_261_ - 1]) >> 2) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_261_ + 1]) >> 3) + ((((Class174_Sub1) this).aByteArrayArray10714[i][i_261_]) >> 1));
			}
			((Class174_Sub1) this).aClass572Array10701 = new Class572[((Class174_Sub1) this).aClass676_10709.method7962((byte) 0)];
			((Class174_Sub1) this).aClass676_10709.method7965(((Class174_Sub1) this).aClass572Array10701, (byte) -81);
			for (int i = 0; i < ((Class174_Sub1) this).aClass572Array10701.length; i++)
				((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i]).method8447(((Class174_Sub1) this).anInt10705);
			((Class174_Sub1) this).anInt10724 = 20;
			if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
				((Class174_Sub1) this).anInt10724 += 4;
			if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0)
				((Class174_Sub1) this).anInt10724 += 12;
			((Class174_Sub1) this).aLong10723 = (((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377.allocateMemory((long) (((Class174_Sub1) this).anInt10705 * 4 + (((Class174_Sub1) this).anInt10705 * ((Class174_Sub1) this).anInt10724))));
			((Class174_Sub1) this).aLong10721 = ((Class174_Sub1) this).aLong10723;
			((Class174_Sub1) this).aLong10726 = (((Class174_Sub1) this).aLong10723 + (long) (((Class174_Sub1) this).anInt10705 * 4));
			Class572_Sub14[] class572_sub14s = new Class572_Sub14[((Class174_Sub1) this).anInt10705];
			int i = Cs2CallPointer.method5627(((Class174_Sub1) this).anInt10705 / 4, 326245663);
			if (i < 1)
				i = 1;
			Class676 class676 = new Class676(i);
			Class572_Sub14[] class572_sub14s_262_ = new Class572_Sub14[((Class174_Sub1) this).anInt10713];
			for (int i_263_ = 0; i_263_ < anInt2086 * -1715487093; i_263_++) {
				for (int i_264_ = 0; i_264_ < anInt2089 * 792439321; i_264_++)
					method9986(i_263_, i_264_, is, class572_sub14s_262_, class676, class572_sub14s);
			}
			for (int i_265_ = 0; i_265_ < ((Class174_Sub1) this).anInt10693; i_265_++) {
				Class572_Sub14 class572_sub14 = class572_sub14s[i_265_];
				if (class572_sub14 != null)
					class572_sub14.method8435(i_265_);
			}
			for (int i_266_ = 0; i_266_ < anInt2086 * -1715487093; i_266_++) {
				for (int i_267_ = 0; i_267_ < anInt2089 * 792439321; i_267_++) {
					short[] is_268_ = (((Class174_Sub1) this).aShortArrayArray10695[i_267_ * (anInt2086 * -1715487093) + i_266_]);
					if (is_268_ != null) {
						int i_269_ = 0;
						int i_270_ = 0;
						while (i_270_ < is_268_.length) {
							int i_271_ = is_268_[i_270_++] & 0xffff;
							int i_272_ = is_268_[i_270_++] & 0xffff;
							int i_273_ = is_268_[i_270_++] & 0xffff;
							Class572_Sub14 class572_sub14 = class572_sub14s[i_271_];
							Class572_Sub14 class572_sub14_274_ = class572_sub14s[i_272_];
							Class572_Sub14 class572_sub14_275_ = class572_sub14s[i_273_];
							Class572_Sub14 class572_sub14_276_ = null;
							if (class572_sub14 != null) {
								class572_sub14.method8436(i_266_, i_267_, i_269_);
								class572_sub14_276_ = class572_sub14;
							}
							if (class572_sub14_274_ != null) {
								class572_sub14_274_.method8436(i_266_, i_267_, i_269_);
								if (class572_sub14_276_ == null || ((class572_sub14_274_.hash * 381237825124074065L) < (class572_sub14_276_.hash * 381237825124074065L)))
									class572_sub14_276_ = class572_sub14_274_;
							}
							if (class572_sub14_275_ != null) {
								class572_sub14_275_.method8436(i_266_, i_267_, i_269_);
								if (class572_sub14_276_ == null || ((class572_sub14_275_.hash * 381237825124074065L) < (class572_sub14_276_.hash * 381237825124074065L)))
									class572_sub14_276_ = class572_sub14_275_;
							}
							if (class572_sub14_276_ != null) {
								if (class572_sub14 != null)
									class572_sub14_276_.method8435(i_271_);
								if (class572_sub14_274_ != null)
									class572_sub14_276_.method8435(i_272_);
								if (class572_sub14_275_ != null)
									class572_sub14_276_.method8435(i_273_);
								class572_sub14_276_.method8436(i_266_, i_267_, i_269_);
							}
							i_269_++;
						}
					}
				}
			}
			((Class174_Sub1) this).anInt10720 = 0;
			for (int i_277_ = 0; i_277_ < ((Class174_Sub1) this).aClass572Array10701.length; i_277_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_277_]);
				if (((Class572_Sub14) class572_sub14).anInt9111 > 0)
					((Class174_Sub1) this).aClass572Array10701[((Class174_Sub1) this).anInt10720++] = class572_sub14;
			}
			((Class174_Sub1) this).aClass572Array10708 = new Class572[((Class174_Sub1) this).anInt10720];
			long[] ls = new long[((Class174_Sub1) this).anInt10720];
			for (int i_278_ = 0; i_278_ < ((Class174_Sub1) this).anInt10720; i_278_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i_278_]);
				ls[i_278_] = class572_sub14.hash * 381237825124074065L;
				((Class174_Sub1) this).aClass572Array10708[i_278_] = class572_sub14;
			}
			Class543.method6441(ls, ((Class174_Sub1) this).aClass572Array10708, -825919046);
			method9987();
		}
	}

	public boolean method2737(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_279_, int i_280_, int i_281_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 == null || class572_sub12_sub18 == null)
			return false;
		int i_282_ = (i - (i_279_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		int i_283_ = (i_280_ - (i_279_ * (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY) >> 8) >> ((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).shadowScale);
		return ((Class174_Sub1) this).aClass361_10711.method4464(class572_sub12_sub18, i_282_, i_283_);
	}

	Class174_Sub1(Class106_Sub3 class106_sub3, int i, int i_284_, int i_285_, int i_286_, int[][] is, int[][] is_287_, int i_288_) {
		super(i_285_, i_286_, i_288_, is);
		((Class174_Sub1) this).aFloat10697 = -3.4028235E38F;
		((Class174_Sub1) this).aClass675_10707 = new Class675();
		((Class174_Sub1) this).anIntArray10696 = new int[1];
		((Class174_Sub1) this).anIntArray10719 = new int[1];
		((Class174_Sub1) this).anIntArray10728 = new int[1];
		((Class174_Sub1) this).aClass106_Sub3_10688 = class106_sub3;
		((Class174_Sub1) this).anInt10689 = anInt2088 * 212267571 - 2;
		((Class174_Sub1) this).anInt10718 = 1 << ((Class174_Sub1) this).anInt10689;
		((Class174_Sub1) this).anInt10717 = i;
		((Class174_Sub1) this).anInt10692 = i_284_;
		((Class174_Sub1) this).anIntArrayArrayArray10703 = new int[i_285_][i_286_][];
		((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725 = new Class572_Sub14[i_285_][i_286_][];
		((Class174_Sub1) this).anIntArrayArrayArray10698 = new int[i_285_][i_286_][];
		((Class174_Sub1) this).anIntArrayArrayArray10702 = new int[i_285_][i_286_][];
		((Class174_Sub1) this).anIntArrayArrayArray10699 = new int[i_285_][i_286_][];
		((Class174_Sub1) this).anIntArrayArrayArray10700 = new int[i_285_][i_286_][];
		((Class174_Sub1) this).aShortArrayArray10695 = new short[i_285_ * i_286_][];
		((Class174_Sub1) this).aByteArrayArray10712 = new byte[i_285_][i_286_];
		((Class174_Sub1) this).aByteArrayArray10714 = new byte[i_285_ + 1][i_286_ + 1];
		((Class174_Sub1) this).aFloatArrayArray10691 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		((Class174_Sub1) this).aFloatArrayArray10716 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		((Class174_Sub1) this).aFloatArrayArray10706 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		for (int i_289_ = 0; i_289_ <= anInt2089 * 792439321; i_289_++) {
			for (int i_290_ = 0; i_290_ <= anInt2086 * -1715487093; i_290_++) {
				int i_291_ = anIntArrayArray2085[i_290_][i_289_];
				if ((float) i_291_ < ((Class174_Sub1) this).aFloat10722)
					((Class174_Sub1) this).aFloat10722 = (float) i_291_;
				if ((float) i_291_ > ((Class174_Sub1) this).aFloat10697)
					((Class174_Sub1) this).aFloat10697 = (float) i_291_;
				if (i_290_ > 0 && i_289_ > 0 && i_290_ < anInt2086 * -1715487093 && i_289_ < anInt2089 * 792439321) {
					int i_292_ = (is_287_[i_290_ + 1][i_289_] - is_287_[i_290_ - 1][i_289_]);
					int i_293_ = (is_287_[i_290_][i_289_ + 1] - is_287_[i_290_][i_289_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_292_ * i_292_ + 4 * i_288_ * i_288_ + i_293_ * i_293_)));
					((Class174_Sub1) this).aFloatArrayArray10691[i_290_][i_289_] = (float) i_292_ * f;
					((Class174_Sub1) this).aFloatArrayArray10716[i_290_][i_289_] = (float) (-i_288_ * 2) * f;
					((Class174_Sub1) this).aFloatArrayArray10706[i_290_][i_289_] = (float) i_293_ * f;
				}
			}
		}
		((Class174_Sub1) this).aFloat10722--;
		((Class174_Sub1) this).aFloat10697++;
		((Class174_Sub1) this).aClass676_10709 = new Class676(128);
		if ((((Class174_Sub1) this).anInt10692 & 0x10) != 0)
			((Class174_Sub1) this).aClass361_10711 = new Class361(((Class174_Sub1) this).aClass106_Sub3_10688, this);
	}

	public void method2734(int i, int i_294_, int i_295_, boolean[][] bools, boolean bool, int i_296_) {
		if (((Class174_Sub1) this).aClass572Array10708 != null) {
			int i_297_ = i_295_ + i_295_ + 1;
			i_297_ *= i_297_;
			if (((Class174_Sub1) this).anIntArray10728.length < i_297_)
				((Class174_Sub1) this).anIntArray10728 = new int[i_297_];
			int i_298_ = i - i_295_;
			int i_299_ = i_298_;
			if (i_298_ < 0)
				i_298_ = 0;
			int i_300_ = i_294_ - i_295_;
			int i_301_ = i_300_;
			if (i_300_ < 0)
				i_300_ = 0;
			int i_302_ = i + i_295_;
			if (i_302_ > anInt2086 * -1715487093 - 1)
				i_302_ = anInt2086 * -1715487093 - 1;
			int i_303_ = i_294_ + i_295_;
			if (i_303_ > anInt2089 * 792439321 - 1)
				i_303_ = anInt2089 * 792439321 - 1;
			((Class174_Sub1) this).anInt10727 = 0;
			for (int i_304_ = i_298_; i_304_ <= i_302_; i_304_++) {
				boolean[] bools_305_ = bools[i_304_ - i_299_];
				for (int i_306_ = i_300_; i_306_ <= i_303_; i_306_++) {
					if (bools_305_[i_306_ - i_301_])
						((Class174_Sub1) this).anIntArray10728[((Class174_Sub1) this).anInt10727++] = i_306_ * (anInt2086 * -1715487093) + i_304_;
				}
			}
			ByteBuffer bytebuffer = ((Class174_Sub1) this).aClass106_Sub3_10688.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_307_ = 0; i_307_ < ((Class174_Sub1) this).aClass572Array10708.length; i_307_++) {
				Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10708[i_307_]);
				class572_sub14.method8439((((Class174_Sub1) this).anIntArray10728), ((Class174_Sub1) this).anInt10727);
			}
			int i_308_ = bytebuffer.position();
			Class340 class340 = (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass340_10480);
			if (i_308_ != 0) {
				Interface46 interface46 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9597(i_308_ / 2);
				interface46.method223(0, i_308_, (((Class174_Sub1) this).aClass106_Sub3_10688.aLong10444));
				((Class174_Sub1) this).aClass106_Sub3_10688.method9685();
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9693(interface46);
				class340.method4279(Class250.aClass250_2727);
				if (((Class174_Sub1) this).aClass106_Sub3_10688.anInt10448 > 0) {
					class340.aClass240_4339.method3268((float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 16 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 8 & 0xff) / 255.0F, (float) ((((Class174_Sub1) this).aClass106_Sub3_10688.anInt10500) >> 0 & 0xff) / 255.0F);
					class340.aClass209_4338.method3040(0.0F, 0.0F, 1.0F, -(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503));
					class340.aClass209_4338.method3045(((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass250_10394);
					class340.aClass209_4338.method3043(1.0F / ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10504) - (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10503)));
				} else {
					class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
					class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				}
				if ((((Class174_Sub1) this).anInt10692 & 0x7) == 0) {
					int i_309_ = 0;
					for (int i_310_ = 0; (i_310_ < ((Class174_Sub1) this).aClass572Array10708.length); i_310_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_310_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 != 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								class340.aClass209_4336.method3040(0.0F, 1.0F, 0.0F, ((float) (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).anInt10507) + ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1191) * 1873501081) / 255.0F * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369))));
								class340.aClass209_4336.method3043(1.0F / (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							boolean bool_311_ = false;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 1935846953));
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								bool_311_ = !Class649.method7677(class101.effectId, 2080949571);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_309_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							class340.method4263(bool_311_);
							i_309_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				} else {
					class340.aClass240_4340.method3268((((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[0]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[1]), (((Class174_Sub1) this).aClass106_Sub3_10688.aFloatArray10446[2]));
					class340.aClass240_4341.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10455) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4334.method3268((-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), (-(((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10456) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					class340.aClass240_4326.method3268(((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10451)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10439)), ((((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10458) * (((Class174_Sub1) this).aClass106_Sub3_10688.aFloat10453)));
					int i_312_ = 0;
					for (int i_313_ = 0; (i_313_ < ((Class174_Sub1) this).aClass572Array10708.length); i_313_++) {
						Class572_Sub14 class572_sub14 = (Class572_Sub14) (((Class174_Sub1) this).aClass572Array10708[i_313_]);
						if (((Class572_Sub14) class572_sub14).anInt9103 > 0) {
							if (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aBool10494) {
								((Class174_Sub1) this).aClass106_Sub3_10688.method1790(0, (((Class572_Sub14) class572_sub14).aClass86_9107));
								float f = 0.15F;
								class340.aClass209_4336.method3040(0.0F, 1.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f), 0.0F, 256.0F / ((float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1190) * -1018540369) * f));
								class340.aClass240_4337.method3268((float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 16 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 8 & 0xff) / 255.0F, (float) (((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1193) * 526464983) >> 0 & 0xff) / 255.0F);
							} else {
								class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
								class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
							}
							byte i_314_ = 11;
							if (((Class572_Sub14) class572_sub14).anInt9105 != -1) {
								MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 634990974));
								i_314_ = class101.effectId;
								class340.anInterface43_4342 = ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass360_10487.method4444(class101);
								class340.method4261(class101.effectParam1);
							} else
								class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
							((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, (((Class572_Sub14) class572_sub14).anInterface44_9108));
							((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
							class340.aClass250_4332.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106), 1.0F, 1.0F);
							class340.anInt4330 = ((Class572_Sub14) class572_sub14).anInt9112;
							class340.anInt4346 = (((Class572_Sub14) class572_sub14).anInt9113 - (((Class572_Sub14) class572_sub14).anInt9112) + 1);
							class340.anInt4347 = i_312_;
							class340.anInt4348 = (((Class572_Sub14) class572_sub14).anInt9103 / 3);
							switch (i_314_) {
								default:
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4262();
									else
										class340.method4264(0);
									break;
								case 7:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									class340.aClass250_4333.method3444();
									class340.anInterface33_4331 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9600();
									class340.method4272(0);
									break;
								case 1:
									class340.aClass240_4344.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
									if (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aBool10494)
										class340.method4266();
									else
										class340.method4265(0);
									break;
								case 2:
								case 4:
								case 8:
								case 9:
									if (!(((Class174_Sub1) this).aClass106_Sub3_10688.aBool10488) && (((Class174_Sub1) this).anInt10692 & 0x8) != 0 && ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485.method10155(-513595537)) {
										Class349_Sub1_Sub1 class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10485);
										if (i_314_ == 2)
											class349_sub1_sub1 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass349_Sub1_Sub1_10484);
										class349_sub1_sub1.aClass250_11179.method3442(((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10414);
										class349_sub1_sub1.aClass250_11170.method3448(1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F / (((Class572_Sub14) class572_sub14).aFloat9106 * (float) ((((Class572_Sub14) class572_sub14).aClass86_9107.anInt1189) * 805515065)), 1.0F, 1.0F);
										class349_sub1_sub1.aClass240_11185.method3268((((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass250_10393.aFloatArray2728[14]));
										MaterialInformation class101 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396.getTexture((((Class572_Sub14) class572_sub14).anInt9105), 594016569));
										class349_sub1_sub1.anInt11173 = class101.effectParam1 * -1911736543;
										class349_sub1_sub1.anInt11188 = (((Class572_Sub14) class572_sub14).anInt9112) * -674989163;
										class349_sub1_sub1.anInt11169 = ((((Class572_Sub14) class572_sub14).anInt9113) - (((Class572_Sub14) class572_sub14).anInt9112) + 1) * 886381173;
										class349_sub1_sub1.anInt11181 = i_312_ * 2025213095;
										class349_sub1_sub1.anInt11189 = (((Class572_Sub14) class572_sub14).anInt9103) / 3 * 137354721;
										class349_sub1_sub1.aClass209_11163.method3049(class340.aClass209_4336);
										class349_sub1_sub1.aClass240_11174.method3269(class340.aClass240_4337);
										class349_sub1_sub1.aClass209_11191.method3049(class340.aClass209_4338);
										class349_sub1_sub1.aClass240_11187.method3269(class340.aClass240_4339);
										class349_sub1_sub1.method10156((byte) 5);
									} else
										class340.method4264(0);
									break;
								case 6:
									class340.method4263(!Class649.method7677(i_314_, 924312854));
							}
							i_312_ += ((Class572_Sub14) class572_sub14).anInt9103;
						}
					}
				}
			}
			if (!((Class174_Sub1) this).aClass675_10707.method7928((byte) -28)) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(128);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9618(false);
				Class240 class240 = new Class240(class340.aClass240_4339);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				Iterator iterator = ((Class174_Sub1) this).aClass675_10707.iterator();
				while (iterator.hasNext()) {
					Class572_Sub21 class572_sub21 = (Class572_Sub21) iterator.next();
					class572_sub21.method8599(class340, i, i_294_, i_295_, bools, bool);
				}
				class340.aClass240_4339.method3269(class240);
			}
			if (((Class174_Sub1) this).aClass361_10711 != null) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9591(1);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, ((Class174_Sub1) this).anInterface44_10690);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
				Class250 class250 = (((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399);
				class250.method3444();
				class250.aFloatArray2728[13] = -1.0F;
				class340.method4279(class250);
				((Class174_Sub1) this).aClass361_10711.method4453(class340, i, i_294_, i_295_, bools, bool);
			}
		}
	}

	public void method2732(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, boolean[][] bools) {
		if (((Class174_Sub1) this).anInt10705 > 0) {
			Interface46 interface46 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9597(((Class174_Sub1) this).anInt10694);
			int i_321_ = 0;
			int i_322_ = 32767;
			int i_323_ = -32768;
			ByteBuffer bytebuffer = ((Class174_Sub1) this).aClass106_Sub3_10688.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_324_ = i_318_; i_324_ < i_320_; i_324_++) {
				int i_325_ = i_324_ * (anInt2086 * -1715487093) + i_317_;
				for (int i_326_ = i_317_; i_326_ < i_319_; i_326_++) {
					if (bools[i_326_ - i_317_][i_324_ - i_318_]) {
						short[] is = (((Class174_Sub1) this).aShortArrayArray10695[i_325_]);
						if (is != null) {
							for (int i_327_ = 0; i_327_ < is.length; i_327_++) {
								int i_328_ = is[i_327_] & 0xffff;
								if (i_328_ > i_323_)
									i_323_ = i_328_;
								if (i_328_ < i_322_)
									i_322_ = i_328_;
								bytebuffer.putShort((short) i_328_);
								i_321_++;
							}
						}
					}
					i_325_++;
				}
			}
			interface46.method223(0, bytebuffer.position(), (((Class174_Sub1) this).aClass106_Sub3_10688.aLong10444));
			if (i_321_ > 0) {
				((Class174_Sub1) this).aClass106_Sub3_10688.method9685();
				Class340 class340 = (((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).aClass340_10480);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(0, ((Class174_Sub1) this).anInterface44_10686);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9674(1, ((Class174_Sub1) this).anInterface44_10690);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9673(((Class174_Sub1) this).aClass362_10710);
				((Class174_Sub1) this).aClass106_Sub3_10688.method9693(interface46);
				((Class174_Sub1) this).aClass106_Sub3_10688.method1761(Class261.aClass261_2800);
				float f = (float) ((Class174_Sub1) this).aClass106_Sub3_10688.method1683(1314953728).method1648();
				float f_329_ = (float) ((Class174_Sub1) this).aClass106_Sub3_10688.method1683(939055629).method1646();
				Class261 class261 = new Class261();
				Class261 class261_330_ = new Class261();
				class261.method3572(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class261_330_.method3577((float) i_316_ / (256.0F * (float) (anInt2087 * 2129890771)), (float) -i_316_ / (256.0F * (float) (anInt2087 * 2129890771)), 1.0F / (((Class174_Sub1) this).aFloat10697 - ((Class174_Sub1) this).aFloat10722));
				class261_330_.method3580((float) i - (float) (i_317_ * i_316_) / 256.0F, (float) i_315_ + (float) (i_320_ * i_316_) / 256.0F, (-((Class174_Sub1) this).aFloat10722 / (((Class174_Sub1) this).aFloat10697 - ((Class174_Sub1) this).aFloat10722)));
				class261_330_.method3578(2.0F / f, 2.0F / f_329_, 1.0F);
				class261_330_.method3580(-1.0F, -1.0F, 0.0F);
				((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass261_10443.method3581(class261, class261_330_);
				((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399.method3446(((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).aClass261_10443);
				((Class174_Sub1) this).aClass106_Sub3_10688.method1764(((Class174_Sub1) this).aClass106_Sub3_10688.aClass250_10399);
				class340.method4279(Class250.aClass250_2727);
				class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
				class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
				class340.anInterface43_4342 = (((Class174_Sub1) this).aClass106_Sub3_10688.anInterface43_10474);
				class340.aClass250_4332.method3444();
				class340.anInt4330 = i_322_;
				class340.anInt4346 = i_323_ - i_322_ + 1;
				class340.anInt4347 = 0;
				class340.anInt4348 = i_321_ / 3;
				if (((Class174_Sub1) this).aClass106_Sub3_10688.aBool10536) {
					((Class174_Sub1) this).aClass106_Sub3_10688.method1763(false);
					class340.method4263(false);
					((Class174_Sub1) this).aClass106_Sub3_10688.method1763(true);
				} else
					class340.method4263(false);
			}
		}
	}

	void method9989() {
		if ((((Class174_Sub1) this).anInt10717 & 0x2) == 0) {
			((Class174_Sub1) this).anIntArrayArrayArray10702 = null;
			((Class174_Sub1) this).anIntArrayArrayArray10698 = null;
			((Class174_Sub1) this).anIntArrayArrayArray10699 = null;
		}
		((Class174_Sub1) this).anIntArrayArrayArray10704 = null;
		((Class174_Sub1) this).anIntArrayArrayArray10700 = null;
		((Class174_Sub1) this).anIntArrayArrayArray10703 = null;
		((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725 = null;
		((Class174_Sub1) this).aByteArrayArray10714 = null;
		((Class174_Sub1) this).aClass676_10709 = null;
		((Class174_Sub1) this).aClass572Array10701 = null;
		((Class174_Sub1) this).aFloatArrayArray10706 = null;
		((Class174_Sub1) this).aFloatArrayArray10716 = null;
		((Class174_Sub1) this).aFloatArrayArray10691 = null;
	}

	public Class572_Sub12_Sub18 method2736(int i, int i_331_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub1) this).aByteArrayArray10712[i][i_331_] & 0x1) == 0)
			return null;
		int i_332_ = (anInt2087 * 2129890771 >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_333_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_332_, i_332_)) {
			class572_sub12_sub18_sub2_333_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_333_.method10652();
		} else
			class572_sub12_sub18_sub2_333_ = new NativeShadow((((Class174_Sub1) this).aClass106_Sub3_10688), i_332_, i_332_);
		class572_sub12_sub18_sub2_333_.method10650(0, 0, i_332_, i_332_);
		method9988(class572_sub12_sub18_sub2_333_, i, i_331_);
		return class572_sub12_sub18_sub2_333_;
	}

	void method9990() {
		if ((((Class174_Sub1) this).anInt10717 & 0x2) == 0) {
			((Class174_Sub1) this).anIntArrayArrayArray10702 = null;
			((Class174_Sub1) this).anIntArrayArrayArray10698 = null;
			((Class174_Sub1) this).anIntArrayArrayArray10699 = null;
		}
		((Class174_Sub1) this).anIntArrayArrayArray10704 = null;
		((Class174_Sub1) this).anIntArrayArrayArray10700 = null;
		((Class174_Sub1) this).anIntArrayArrayArray10703 = null;
		((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725 = null;
		((Class174_Sub1) this).aByteArrayArray10714 = null;
		((Class174_Sub1) this).aClass676_10709 = null;
		((Class174_Sub1) this).aClass572Array10701 = null;
		((Class174_Sub1) this).aFloatArrayArray10706 = null;
		((Class174_Sub1) this).aFloatArrayArray10716 = null;
		((Class174_Sub1) this).aFloatArrayArray10691 = null;
	}

	public void method2746(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_334_, int i_335_, int i_336_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_337_ = (i - (i_334_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_338_ = (i_335_ - (i_334_ * ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4460(class572_sub12_sub18, i_337_, i_338_);
		}
	}

	public void method2727(int i, int i_339_, int i_340_) {
		i = Math.min(((Class174_Sub1) this).aByteArrayArray10714.length - 1, Math.max(0, i));
		i_339_ = Math.min((((Class174_Sub1) this).aByteArrayArray10714[i].length - 1), Math.max(0, i_339_));
		if ((((Class174_Sub1) this).aByteArrayArray10714[i][i_339_] & 0xff) < i_340_)
			((Class174_Sub1) this).aByteArrayArray10714[i][i_339_] = (byte) i_340_;
	}

	public void method2744(int i, int i_341_, int[] is, int[] is_342_, int[] is_343_, int[] is_344_, int[] is_345_, int[] is_346_, int[] is_347_, int[] is_348_, Class86 class86, boolean bool) {
		MapSize mapSize = ((Class174_Sub1) this).aClass106_Sub3_10688.aClass94_1396;
		if (is_344_ != null && ((Class174_Sub1) this).anIntArrayArrayArray10704 == null)
			((Class174_Sub1) this).anIntArrayArrayArray10704 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		if (is_342_ != null && ((Class174_Sub1) this).anIntArrayArrayArray10703 == null)
			((Class174_Sub1) this).anIntArrayArrayArray10703 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		((Class174_Sub1) this).anIntArrayArrayArray10698[i][i_341_] = is;
		((Class174_Sub1) this).anIntArrayArrayArray10702[i][i_341_] = is_343_;
		((Class174_Sub1) this).anIntArrayArrayArray10699[i][i_341_] = is_345_;
		((Class174_Sub1) this).anIntArrayArrayArray10700[i][i_341_] = is_346_;
		if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
			((Class174_Sub1) this).anIntArrayArrayArray10704[i][i_341_] = is_344_;
		if (((Class174_Sub1) this).anIntArrayArrayArray10703 != null)
			((Class174_Sub1) this).anIntArrayArrayArray10703[i][i_341_] = is_342_;
		Class572_Sub14[] class572_sub14s = (((Class174_Sub1) this).aClass572_Sub14ArrayArrayArray10725[i][i_341_] = new Class572_Sub14[is_345_.length]);
		for (int i_349_ = 0; i_349_ < is_345_.length; i_349_++) {
			int i_350_ = is_347_[i_349_];
			int i_351_ = is_348_[i_349_];
			if ((((Class174_Sub1) this).anInt10692 & 0x20) != 0 && i_350_ != -1 && mapSize.getTexture(i_350_, 1624193220).aBool1350) {
				i_351_ = 128;
				i_350_ = -1;
			}
			long l = ((long) (class86.anInt1191 * 1873501081) << 48 | (long) (class86.anInt1190 * -1018540369) << 42 | (long) (class86.anInt1193 * 526464983) << 28 | (long) (i_351_ << 14) | (long) i_350_);
			Class572 class572;
			for (class572 = ((Class174_Sub1) this).aClass676_10709.get(l); class572 != null; class572 = ((Class174_Sub1) this).aClass676_10709.method7971((byte) 101)) {
				Class572_Sub14 class572_sub14 = (Class572_Sub14) class572;
				if (((Class572_Sub14) class572_sub14).anInt9105 == i_350_ && (((Class572_Sub14) class572_sub14).aFloat9106 == (float) i_351_) && ((Class572_Sub14) class572_sub14).aClass86_9107.method1274(class86, -1073061575))
					break;
			}
			if (class572 == null) {
				class572_sub14s[i_349_] = new Class572_Sub14(this, i_350_, i_351_, class86);
				((Class174_Sub1) this).aClass676_10709.put(class572_sub14s[i_349_], l);
			} else
				class572_sub14s[i_349_] = (Class572_Sub14) class572;
		}
		if (bool)
			((Class174_Sub1) this).aByteArrayArray10712[i][i_341_] |= 0x1;
		if (is_345_.length > ((Class174_Sub1) this).anInt10713)
			((Class174_Sub1) this).anInt10713 = is_345_.length;
		((Class174_Sub1) this).anInt10705 += is_345_.length;
	}

	public void method2725(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_352_, int i_353_, int i_354_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_355_ = (i - (i_352_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_356_ = (i_353_ - (i_352_ * ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4454(class572_sub12_sub18, i_355_, i_356_);
		}
	}

	public void method2739(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_357_, int i_358_, int i_359_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_360_ = (i - (i_357_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_361_ = (i_358_ - (i_357_ * ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4454(class572_sub12_sub18, i_360_, i_361_);
		}
	}

	public void method2740(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_362_, int i_363_, int i_364_, boolean bool) {
		if (((Class174_Sub1) this).aClass361_10711 != null && class572_sub12_sub18 != null) {
			int i_365_ = (i - (i_362_ * (((Class106_Sub3) ((Class174_Sub1) this).aClass106_Sub3_10688).sunProjectionX) >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			int i_366_ = (i_363_ - (i_362_ * ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).sunProjectionY >> 8) >> ((Class106_Sub3) (((Class174_Sub1) this).aClass106_Sub3_10688)).shadowScale);
			((Class174_Sub1) this).aClass361_10711.method4454(class572_sub12_sub18, i_365_, i_366_);
		}
	}

	public void method2741(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub1) this).aClass675_10707.method7940(new Class572_Sub21(((Class174_Sub1) this).aClass106_Sub3_10688, this, class572_sub36, is), -2049923766);
	}

	public void method2711(int i, int i_367_, int i_368_) {
		i = Math.min(((Class174_Sub1) this).aByteArrayArray10714.length - 1, Math.max(0, i));
		i_367_ = Math.min((((Class174_Sub1) this).aByteArrayArray10714[i].length - 1), Math.max(0, i_367_));
		if ((((Class174_Sub1) this).aByteArrayArray10714[i][i_367_] & 0xff) < i_368_)
			((Class174_Sub1) this).aByteArrayArray10714[i][i_367_] = (byte) i_368_;
	}

	public void method2717(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub1) this).aClass675_10707.method7940(new Class572_Sub21(((Class174_Sub1) this).aClass106_Sub3_10688, this, class572_sub36, is), -2004193979);
	}

	public void method2742(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub1) this).aClass675_10707.method7940(new Class572_Sub21(((Class174_Sub1) this).aClass106_Sub3_10688, this, class572_sub36, is), -1854808442);
	}

	void method9991() {
		((Class174_Sub1) this).anInterface44_10690 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9723(false);
		((Class174_Sub1) this).anInterface44_10690.method259(((Class174_Sub1) this).anInt10693 * 4, 4);
		((Class174_Sub1) this).anInterface44_10690.method223(0, ((Class174_Sub1) this).anInt10693 * 4, ((Class174_Sub1) this).aLong10723);
		((Class174_Sub1) this).anInterface44_10686 = ((Class174_Sub1) this).aClass106_Sub3_10688.method9723(false);
		((Class174_Sub1) this).anInterface44_10686.method259((((Class174_Sub1) this).anInt10693 * ((Class174_Sub1) this).anInt10724), ((Class174_Sub1) this).anInt10724);
		((Class174_Sub1) this).anInterface44_10686.method223(0, (((Class174_Sub1) this).anInt10693 * ((Class174_Sub1) this).anInt10724), (((Class174_Sub1) this).aLong10723 + (long) (((Class174_Sub1) this).anInt10705 * 4)));
		((Class174_Sub1) this).aClass106_Sub3_10688.anUnsafe10377.freeMemory(((Class174_Sub1) this).aLong10723);
		if ((((Class174_Sub1) this).anInt10692 & 0x7) != 0) {
			if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
				((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
					new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4471, Class364.aClass364_4464 }), new Class354(Class364.aClass364_4468) }));
			else
				((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
					new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4464 }), new Class354(Class364.aClass364_4468) }));
		} else if (((Class174_Sub1) this).anIntArrayArrayArray10704 != null)
			((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
				new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482, Class364.aClass364_4471 }), new Class354(Class364.aClass364_4468) }));
		else
			((Class174_Sub1) this).aClass362_10710 = (((Class174_Sub1) this).aClass106_Sub3_10688.method9672(new Class354[] {
				new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }), new Class354(Class364.aClass364_4468) }));
		for (int i = 0; i < ((Class174_Sub1) this).anInt10720; i++) {
			Class572_Sub14 class572_sub14 = ((Class572_Sub14) ((Class174_Sub1) this).aClass572Array10701[i]);
			class572_sub14.method8438(((Class174_Sub1) this).anInt10693);
		}
		if (((Class174_Sub1) this).aClass361_10711 != null)
			((Class174_Sub1) this).aClass361_10711.method4452();
		method9990();
	}

	public void method2733(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub1) this).aClass675_10707.method7940(new Class572_Sub21(((Class174_Sub1) this).aClass106_Sub3_10688, this, class572_sub36, is), -2133960690);
	}
}
