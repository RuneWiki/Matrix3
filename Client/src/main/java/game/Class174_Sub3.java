package game;

/* Class174_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class174_Sub3 extends Class174 {
	int[][][] anIntArrayArrayArray10873;
	static final int anInt10874 = 74;
	int anInt10875;
	int anInt10876;
	byte[][] aByteArrayArray10877;
	Class142 aClass142_10878;
	int anInt10879;
	int anInt10880;
	int anInt10881;
	short[][] aShortArrayArray10882;
	Class572_Sub39[][][] aClass572_Sub39ArrayArrayArray10883;
	int anInt10884;
	int[][][] anIntArrayArrayArray10885;
	int anInt10886;
	int anInt10887;
	int[][][] anIntArrayArrayArray10888;
	int[][][] anIntArrayArrayArray10889;
	static float[] aFloatArray10890 = new float[16];
	Class180 aClass180_10891;
	Class675 aClass675_10892 = new Class675();
	Class572[] aClass572Array10893;
	Interface9 anInterface9_10894;
	Class142 aClass142_10895;
	int[][][] anIntArrayArrayArray10896;
	float[][] aFloatArrayArray10897;
	Class142 aClass142_10898;
	Class676 aClass676_10899;
	static final int anInt10900 = 1;
	byte[][] aByteArrayArray10901;
	float[][] aFloatArrayArray10902;
	Class142 aClass142_10903;
	float[][] aFloatArrayArray10904;
	int[][][] anIntArrayArrayArray10905;
	Class106_Sub1 aClass106_Sub1_10906;

	public void method2731(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_) {
		method10041(i, i_0_, i_1_, bools, bool, i_2_);
	}

	public void method2711(int i, int i_3_, int i_4_) {
		i = Math.min(((Class174_Sub3) this).aByteArrayArray10901.length - 1, Math.max(0, i));
		i_3_ = Math.min((((Class174_Sub3) this).aByteArrayArray10901[i].length - 1), Math.max(0, i_3_));
		if ((((Class174_Sub3) this).aByteArrayArray10901[i][i_3_] & 0xff) < i_4_)
			((Class174_Sub3) this).aByteArrayArray10901[i][i_3_] = (byte) i_4_;
	}

	public void method2728(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, Class86 class86, boolean bool) {
		MapSize mapSize = ((Class174_Sub3) this).aClass106_Sub1_10906.aClass94_1396;
		if (is_8_ != null && ((Class174_Sub3) this).anIntArrayArrayArray10889 == null)
			((Class174_Sub3) this).anIntArrayArrayArray10889 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		if (is_6_ != null && ((Class174_Sub3) this).anIntArrayArrayArray10888 == null)
			((Class174_Sub3) this).anIntArrayArrayArray10888 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		((Class174_Sub3) this).anIntArrayArrayArray10905[i][i_5_] = is;
		((Class174_Sub3) this).anIntArrayArrayArray10896[i][i_5_] = is_7_;
		((Class174_Sub3) this).anIntArrayArrayArray10873[i][i_5_] = is_9_;
		((Class174_Sub3) this).anIntArrayArrayArray10885[i][i_5_] = is_10_;
		if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null)
			((Class174_Sub3) this).anIntArrayArrayArray10889[i][i_5_] = is_8_;
		if (((Class174_Sub3) this).anIntArrayArrayArray10888 != null)
			((Class174_Sub3) this).anIntArrayArrayArray10888[i][i_5_] = is_6_;
		Class572_Sub39[] class572_sub39s = (((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883[i][i_5_] = new Class572_Sub39[is_9_.length]);
		for (int i_13_ = 0; i_13_ < is_9_.length; i_13_++) {
			int i_14_ = is_11_[i_13_];
			int i_15_ = is_12_[i_13_];
			if ((((Class174_Sub3) this).anInt10879 & 0x20) != 0 && i_14_ != -1 && mapSize.getTexture(i_14_, 1213135320).aBool1350) {
				i_15_ = 128;
				i_14_ = -1;
			}
			long l = ((long) (class86.anInt1191 * 1873501081) << 48 | (long) (class86.anInt1190 * -1018540369) << 42 | (long) (class86.anInt1193 * 526464983) << 28 | (long) (i_15_ << 14) | (long) i_14_);
			Class572 class572;
			for (class572 = ((Class174_Sub3) this).aClass676_10899.get(l); class572 != null; class572 = ((Class174_Sub3) this).aClass676_10899.method7971((byte) 116)) {
				Class572_Sub39 class572_sub39 = (Class572_Sub39) class572;
				if (((Class572_Sub39) class572_sub39).anInt9392 == i_14_ && (((Class572_Sub39) class572_sub39).aFloat9393 == (float) i_15_) && ((Class572_Sub39) class572_sub39).aClass86_9394.method1274(class86, -625955042))
					break;
			}
			if (class572 == null) {
				class572_sub39s[i_13_] = new Class572_Sub39(this, i_14_, i_15_, class86);
				((Class174_Sub3) this).aClass676_10899.put(class572_sub39s[i_13_], l);
			} else
				class572_sub39s[i_13_] = (Class572_Sub39) class572;
		}
		if (bool)
			((Class174_Sub3) this).aByteArrayArray10877[i][i_5_] |= 0x1;
		if (is_9_.length > ((Class174_Sub3) this).anInt10884)
			((Class174_Sub3) this).anInt10884 = is_9_.length;
		((Class174_Sub3) this).anInt10875 += is_9_.length;
	}

	public Class572_Sub12_Sub18 method2743(int i, int i_16_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub3) this).aByteArrayArray10877[i][i_16_] & 0x1) == 0)
			return null;
		int i_17_ = (anInt2087 * 2129890771 >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_18_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_17_, i_17_)) {
			class572_sub12_sub18_sub1_18_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_18_.method10628();
		} else
			class572_sub12_sub18_sub1_18_ = new Class572_Sub12_Sub18_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), i_17_, i_17_);
		class572_sub12_sub18_sub1_18_.method10634(0, 0, i_17_, i_17_);
		method10042(class572_sub12_sub18_sub1_18_, i, i_16_);
		return class572_sub12_sub18_sub1_18_;
	}

	public void method2719() {
		if (((Class174_Sub3) this).anInt10875 > 0) {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_19_ = 1; i_19_ < anInt2089 * 792439321; i_19_++)
					is[i][i_19_] = (byte) (((((Class174_Sub3) this).aByteArrayArray10901[i - 1][i_19_]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i + 1][i_19_]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_19_ - 1]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_19_ + 1]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_19_]) >> 1));
			}
			((Class174_Sub3) this).aClass572Array10893 = new Class572[((Class174_Sub3) this).aClass676_10899.method7962((byte) 0)];
			((Class174_Sub3) this).aClass676_10899.method7965(((Class174_Sub3) this).aClass572Array10893, (byte) -29);
			for (int i = 0; i < ((Class174_Sub3) this).aClass572Array10893.length; i++)
				((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i]).method8766(((Class174_Sub3) this).anInt10875);
			int i = 24;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null)
				i += 4;
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aNativeHeap10051.method772(((Class174_Sub3) this).anInt10875 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class572_Sub39[] class572_sub39s = new Class572_Sub39[((Class174_Sub3) this).anInt10875];
			int i_20_ = Cs2CallPointer.method5627(((Class174_Sub3) this).anInt10875 / 4, 326245663);
			if (i_20_ < 1)
				i_20_ = 1;
			Class676 class676 = new Class676(i_20_);
			Class572_Sub39[] class572_sub39s_21_ = new Class572_Sub39[((Class174_Sub3) this).anInt10884];
			for (int i_22_ = 0; i_22_ < anInt2086 * -1715487093; i_22_++) {
				for (int i_23_ = 0; i_23_ < anInt2089 * 792439321; i_23_++) {
					if ((((Class174_Sub3) this).anIntArrayArrayArray10873[i_22_][i_23_]) != null) {
						Class572_Sub39[] class572_sub39s_24_ = (((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883[i_22_][i_23_]);
						int[] is_25_ = (((Class174_Sub3) this).anIntArrayArrayArray10905[i_22_][i_23_]);
						int[] is_26_ = (((Class174_Sub3) this).anIntArrayArrayArray10896[i_22_][i_23_]);
						int[] is_27_ = (((Class174_Sub3) this).anIntArrayArrayArray10885[i_22_][i_23_]);
						int[] is_28_ = (((Class174_Sub3) this).anIntArrayArrayArray10873[i_22_][i_23_]);
						int[] is_29_ = ((((Class174_Sub3) this).anIntArrayArrayArray10888) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10888[i_22_][i_23_]) : null);
						int[] is_30_ = ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10889[i_22_][i_23_]) : null);
						if (is_27_ == null)
							is_27_ = is_28_;
						float f = (((Class174_Sub3) this).aFloatArrayArray10902[i_22_][i_23_]);
						float f_31_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_22_][i_23_]);
						float f_32_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_22_][i_23_]);
						float f_33_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_22_][i_23_ + 1]);
						float f_34_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_22_][i_23_ + 1]);
						float f_35_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_22_][i_23_ + 1]);
						float f_36_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_22_ + 1][i_23_ + 1]);
						float f_37_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_22_ + 1][i_23_ + 1]);
						float f_38_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_22_ + 1][i_23_ + 1]);
						float f_39_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_22_ + 1][i_23_]);
						float f_40_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_22_ + 1][i_23_]);
						float f_41_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_22_ + 1][i_23_]);
						int i_42_ = is[i_22_][i_23_] & 0xff;
						int i_43_ = is[i_22_][i_23_ + 1] & 0xff;
						int i_44_ = is[i_22_ + 1][i_23_ + 1] & 0xff;
						int i_45_ = is[i_22_ + 1][i_23_] & 0xff;
						int i_46_ = 0;
						while_70_: for (int i_47_ = 0; i_47_ < is_28_.length; i_47_++) {
							Class572_Sub39 class572_sub39 = class572_sub39s_24_[i_47_];
							for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
								if (class572_sub39s_21_[i_48_] == class572_sub39)
									continue while_70_;
							}
							class572_sub39s_21_[i_46_++] = class572_sub39;
						}
						short[] is_49_ = (((Class174_Sub3) this).aShortArrayArray10882[i_23_ * (anInt2086 * -1715487093) + i_22_] = new short[is_28_.length]);
						for (int i_50_ = 0; i_50_ < is_28_.length; i_50_++) {
							int i_51_ = ((i_22_ << anInt2088 * 212267571) + is_25_[i_50_]);
							int i_52_ = ((i_23_ << anInt2088 * 212267571) + is_26_[i_50_]);
							int i_53_ = i_51_ >> ((Class174_Sub3) this).anInt10876;
							int i_54_ = i_52_ >> ((Class174_Sub3) this).anInt10876;
							int i_55_ = is_28_[i_50_];
							int i_56_ = is_27_[i_50_];
							int i_57_ = is_29_ != null ? is_29_[i_50_] : 0;
							long l = ((long) i_56_ << 48 | (long) i_55_ << 32 | (long) (i_53_ << 16) | (long) i_54_);
							int i_58_ = is_25_[i_50_];
							int i_59_ = is_26_[i_50_];
							int i_60_ = 74;
							int i_61_ = 0;
							float f_62_ = 1.0F;
							float f_63_;
							float f_64_;
							float f_65_;
							if (i_58_ == 0 && i_59_ == 0) {
								f_63_ = f;
								f_64_ = f_31_;
								f_65_ = f_32_;
								i_60_ -= i_42_;
							} else if (i_58_ == 0 && i_59_ == anInt2087 * 2129890771) {
								f_63_ = f_33_;
								f_64_ = f_34_;
								f_65_ = f_35_;
								i_60_ -= i_43_;
							} else if (i_58_ == anInt2087 * 2129890771 && i_59_ == anInt2087 * 2129890771) {
								f_63_ = f_36_;
								f_64_ = f_37_;
								f_65_ = f_38_;
								i_60_ -= i_44_;
							} else if (i_58_ == anInt2087 * 2129890771 && i_59_ == 0) {
								f_63_ = f_39_;
								f_64_ = f_40_;
								f_65_ = f_41_;
								i_60_ -= i_45_;
							} else {
								float f_66_ = ((float) i_58_ / (float) (anInt2087 * 2129890771));
								float f_67_ = ((float) i_59_ / (float) (anInt2087 * 2129890771));
								float f_68_ = f + (f_39_ - f) * f_66_;
								float f_69_ = f_31_ + (f_40_ - f_31_) * f_66_;
								float f_70_ = f_32_ + (f_41_ - f_32_) * f_66_;
								float f_71_ = f_33_ + (f_36_ - f_33_) * f_66_;
								float f_72_ = f_34_ + (f_37_ - f_34_) * f_66_;
								float f_73_ = f_35_ + (f_38_ - f_35_) * f_66_;
								f_63_ = f_68_ + (f_71_ - f_68_) * f_67_;
								f_64_ = f_69_ + (f_72_ - f_69_) * f_67_;
								f_65_ = f_70_ + (f_73_ - f_70_) * f_67_;
								int i_74_ = i_42_ + ((i_45_ - i_42_) * i_58_ >> anInt2088 * 212267571);
								int i_75_ = i_43_ + ((i_44_ - i_43_) * i_58_ >> anInt2088 * 212267571);
								i_60_ -= i_74_ + ((i_75_ - i_74_) * i_59_ >> anInt2088 * 212267571);
							}
							if (i_55_ != -1) {
								int i_76_ = (i_55_ & 0x7f) * i_60_ >> 7;
								if (i_76_ < 2)
									i_76_ = 2;
								else if (i_76_ > 126)
									i_76_ = 126;
								i_61_ = (Class460.anIntArray5213[i_55_ & 0xff80 | i_76_]);
								if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
									f_62_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_63_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_64_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_65_);
									f_62_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_62_ * (f_62_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
								}
							}
							Class572 class572 = null;
							if ((i_51_ & ((Class174_Sub3) this).anInt10886 - 1) == 0 && ((i_52_ & ((Class174_Sub3) this).anInt10886 - 1) == 0))
								class572 = class676.get(l);
							int i_77_;
							if (class572 == null) {
								int i_78_;
								if (i_56_ != i_55_) {
									int i_79_ = (i_56_ & 0x7f) * i_60_ >> 7;
									if (i_79_ < 2)
										i_79_ = 2;
									else if (i_79_ > 126)
										i_79_ = 126;
									i_78_ = (Class460.anIntArray5213[i_56_ & 0xff80 | i_79_]);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
										float f_80_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_63_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_64_ + ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_65_));
										f_80_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_62_ * (f_62_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
										int i_81_ = i_78_ >> 16 & 0xff;
										int i_82_ = i_78_ >> 8 & 0xff;
										int i_83_ = i_78_ & 0xff;
										i_81_ *= f_80_;
										if (i_81_ < 0)
											i_81_ = 0;
										else if (i_81_ > 255)
											i_81_ = 255;
										i_82_ *= f_80_;
										if (i_82_ < 0)
											i_82_ = 0;
										else if (i_82_ > 255)
											i_82_ = 255;
										i_83_ *= f_80_;
										if (i_83_ < 0)
											i_83_ = 0;
										else if (i_83_ > 255)
											i_83_ = 255;
										i_78_ = i_81_ << 16 | i_82_ << 8 | i_83_;
									}
								} else
									i_78_ = i_61_;
								if (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aBool10153) {
									stream.method2801((float) i_51_);
									stream.method2801((float) (method2726(i_51_, i_52_, 358769667) + i_57_));
									stream.method2801((float) i_52_);
									stream.method2800((byte) (i_78_ >> 16));
									stream.method2800((byte) (i_78_ >> 8));
									stream.method2800((byte) i_78_);
									stream.method2800(-1);
									stream.method2801((float) i_51_);
									stream.method2801((float) i_52_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2801(is_30_ != null ? (float) ((is_30_[i_50_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2801(f_63_);
										stream.method2801(f_64_);
										stream.method2801(f_65_);
									}
								} else {
									stream.method2802((float) i_51_);
									stream.method2802((float) (method2726(i_51_, i_52_, 358769667) + i_57_));
									stream.method2802((float) i_52_);
									stream.method2800((byte) (i_78_ >> 16));
									stream.method2800((byte) (i_78_ >> 8));
									stream.method2800((byte) i_78_);
									stream.method2800(-1);
									stream.method2802((float) i_51_);
									stream.method2802((float) i_52_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2802(is_30_ != null ? (float) ((is_30_[i_50_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2802(f_63_);
										stream.method2802(f_64_);
										stream.method2802(f_65_);
									}
								}
								i_77_ = ((Class174_Sub3) this).anInt10880++;
								is_49_[i_50_] = (short) i_77_;
								if (i_55_ != -1)
									class572_sub39s[i_77_] = class572_sub39s_24_[i_50_];
								class676.put(new Class572_Sub11(is_49_[i_50_]), l);
							} else {
								is_49_[i_50_] = ((Class572_Sub11) class572).aShort9091;
								i_77_ = is_49_[i_50_] & 0xffff;
								if (i_55_ != -1 && ((class572_sub39s_24_[i_50_].hash * 381237825124074065L) < (class572_sub39s[i_77_].hash * 381237825124074065L)))
									class572_sub39s[i_77_] = class572_sub39s_24_[i_50_];
							}
							for (int i_84_ = 0; i_84_ < i_46_; i_84_++)
								class572_sub39s_21_[i_84_].method8774(i_77_, i_61_, i_60_, f_62_);
							((Class174_Sub3) this).anInt10881++;
						}
					}
				}
			}
			for (int i_85_ = 0; i_85_ < ((Class174_Sub3) this).anInt10880; i_85_++) {
				Class572_Sub39 class572_sub39 = class572_sub39s[i_85_];
				if (class572_sub39 != null)
					class572_sub39.method8767(i_85_);
			}
			for (int i_86_ = 0; i_86_ < anInt2086 * -1715487093; i_86_++) {
				for (int i_87_ = 0; i_87_ < anInt2089 * 792439321; i_87_++) {
					short[] is_88_ = (((Class174_Sub3) this).aShortArrayArray10882[i_87_ * (anInt2086 * -1715487093) + i_86_]);
					if (is_88_ != null) {
						int i_89_ = 0;
						int i_90_ = 0;
						while (i_90_ < is_88_.length) {
							int i_91_ = is_88_[i_90_++] & 0xffff;
							int i_92_ = is_88_[i_90_++] & 0xffff;
							int i_93_ = is_88_[i_90_++] & 0xffff;
							Class572_Sub39 class572_sub39 = class572_sub39s[i_91_];
							Class572_Sub39 class572_sub39_94_ = class572_sub39s[i_92_];
							Class572_Sub39 class572_sub39_95_ = class572_sub39s[i_93_];
							Class572_Sub39 class572_sub39_96_ = null;
							if (class572_sub39 != null) {
								class572_sub39.method8776(i_86_, i_87_, i_89_);
								class572_sub39_96_ = class572_sub39;
							}
							if (class572_sub39_94_ != null) {
								class572_sub39_94_.method8776(i_86_, i_87_, i_89_);
								if (class572_sub39_96_ == null || ((class572_sub39_94_.hash * 381237825124074065L) < (class572_sub39_96_.hash * 381237825124074065L)))
									class572_sub39_96_ = class572_sub39_94_;
							}
							if (class572_sub39_95_ != null) {
								class572_sub39_95_.method8776(i_86_, i_87_, i_89_);
								if (class572_sub39_96_ == null || ((class572_sub39_95_.hash * 381237825124074065L) < (class572_sub39_96_.hash * 381237825124074065L)))
									class572_sub39_96_ = class572_sub39_95_;
							}
							if (class572_sub39_96_ != null) {
								if (class572_sub39 != null)
									class572_sub39_96_.method8767(i_91_);
								if (class572_sub39_94_ != null)
									class572_sub39_96_.method8767(i_92_);
								if (class572_sub39_95_ != null)
									class572_sub39_96_.method8767(i_93_);
								class572_sub39_96_.method8776(i_86_, i_87_, i_89_);
							}
							i_89_++;
						}
					}
				}
			}
			stream.method2803();
			((Class174_Sub3) this).anInterface9_10894 = (((Class174_Sub3) this).aClass106_Sub1_10906.method9414(i, nativeheapbuffer, stream.method2798(), false));
			if (((Class174_Sub3) this).anInterface9_10894 instanceof Class154_Sub1)
				nativeheapbuffer.method1038();
			((Class174_Sub3) this).aClass142_10895 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 0);
			((Class174_Sub3) this).aClass142_10898 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5121, 4, 12);
			int i_97_;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null) {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 16);
				i_97_ = 28;
			} else {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 2, 16);
				i_97_ = 24;
			}
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				((Class174_Sub3) this).aClass142_10903 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, i_97_);
			long[] ls = new long[((Class174_Sub3) this).aClass572Array10893.length];
			for (int i_98_ = 0; i_98_ < ((Class174_Sub3) this).aClass572Array10893.length; i_98_++) {
				Class572_Sub39 class572_sub39 = ((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i_98_]);
				ls[i_98_] = class572_sub39.hash * 381237825124074065L;
				class572_sub39.method8770(((Class174_Sub3) this).anInt10880);
			}
			Class543.method6441(ls, ((Class174_Sub3) this).aClass572Array10893, 1167618290);
			if (((Class174_Sub3) this).aClass180_10891 != null)
				((Class174_Sub3) this).aClass180_10891.method2792();
		} else
			((Class174_Sub3) this).aClass180_10891 = null;
		if ((((Class174_Sub3) this).anInt10887 & 0x2) == 0) {
			((Class174_Sub3) this).anIntArrayArrayArray10896 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10905 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10873 = null;
		}
		((Class174_Sub3) this).anIntArrayArrayArray10889 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10885 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10888 = null;
		((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883 = null;
		((Class174_Sub3) this).aByteArrayArray10901 = null;
		((Class174_Sub3) this).aClass676_10899 = null;
		((Class174_Sub3) this).aFloatArrayArray10904 = null;
		((Class174_Sub3) this).aFloatArrayArray10897 = null;
		((Class174_Sub3) this).aFloatArrayArray10902 = null;
	}

	public void method2715(int i, int i_99_, int i_100_, boolean[][] bools, boolean bool, int i_101_) {
		method10041(i, i_99_, i_100_, bools, bool, i_101_);
	}

	void method10041(int i, int i_102_, int i_103_, boolean[][] bools, boolean bool, int i_104_) {
		if (((Class174_Sub3) this).aClass572Array10893 != null) {
			int i_105_ = i_103_ + i_103_ + 1;
			i_105_ *= i_105_;
			if ((((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10072).length < i_105_)
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10072 = new int[i_105_];
			if ((((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158.b).length < ((Class174_Sub3) this).anInt10881 * 2)
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1(((Class174_Sub3) this).anInt10881 * 2);
			int i_106_ = i - i_103_;
			int i_107_ = i_106_;
			if (i_106_ < 0)
				i_106_ = 0;
			int i_108_ = i_102_ - i_103_;
			int i_109_ = i_108_;
			if (i_108_ < 0)
				i_108_ = 0;
			int i_110_ = i + i_103_;
			if (i_110_ > anInt2086 * -1715487093 - 1)
				i_110_ = anInt2086 * -1715487093 - 1;
			int i_111_ = i_102_ + i_103_;
			if (i_111_ > anInt2089 * 792439321 - 1)
				i_111_ = anInt2089 * 792439321 - 1;
			int i_112_ = 0;
			int[] is = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10072);
			for (int i_113_ = i_106_; i_113_ <= i_110_; i_113_++) {
				boolean[] bools_114_ = bools[i_113_ - i_107_];
				for (int i_115_ = i_108_; i_115_ <= i_111_; i_115_++) {
					if (bools_114_[i_115_ - i_109_])
						is[i_112_++] = i_115_ * (anInt2086 * -1715487093) + i_113_;
				}
			}
			((Class174_Sub3) this).aClass106_Sub1_10906.method9396();
			((Class174_Sub3) this).aClass106_Sub1_10906.method9429((((Class174_Sub3) this).anInt10879 & 0x7) != 0);
			for (int i_116_ = 0; (i_116_ < ((Class174_Sub3) this).aClass572Array10893.length - 0); i_116_++)
				((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i_116_]).method8769(is, i_112_);
			if (!((Class174_Sub3) this).aClass675_10892.method7928((byte) -62)) {
				int i_117_ = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10058);
				int i_118_ = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10129);
				((Class174_Sub3) this).aClass106_Sub1_10906.method1991(0, i_118_, ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10189);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9429(false);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9432(false);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9456(128);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9389(-2);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9422(((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass155_Sub4_10195);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9434(8448, 7681);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9423(0, 34166, 770);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9424(0, 34167, 770);
				for (Class572 class572 = ((Class174_Sub3) this).aClass675_10892.method7932((byte) 50); class572 != null; class572 = ((Class174_Sub3) this).aClass675_10892.method7926(1546095569)) {
					Class572_Sub37 class572_sub37 = (Class572_Sub37) class572;
					class572_sub37.method8762(i, i_102_, i_103_, bools);
				}
				((Class174_Sub3) this).aClass106_Sub1_10906.method9423(0, 5890, 768);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9424(0, 5890, 770);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9422(null);
				((Class174_Sub3) this).aClass106_Sub1_10906.method1991(i_117_, i_118_, ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10189);
			}
			if (((Class174_Sub3) this).aClass180_10891 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9416(((Class174_Sub3) this).aClass142_10895, null, null, ((Class174_Sub3) this).aClass142_10878);
				((Class174_Sub3) this).aClass180_10891.method2782(i, i_102_, i_103_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2733(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub3) this).aClass675_10892.method7940(new Class572_Sub37(((Class174_Sub3) this).aClass106_Sub1_10906, this, class572_sub36, is), -2005559291);
	}

	public void method2740(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_119_, int i_120_, int i_121_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_122_ = (i - (i_119_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_123_ = (i_120_ - (i_119_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2784(class572_sub12_sub18, i_122_, i_123_);
		}
	}

	void method10042(Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1, int i, int i_124_) {
		int[] is = ((Class174_Sub3) this).anIntArrayArrayArray10905[i][i_124_];
		int[] is_125_ = ((Class174_Sub3) this).anIntArrayArrayArray10896[i][i_124_];
		int i_126_ = is.length;
		if ((((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10157).length < i_126_) {
			((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10157 = new int[i_126_];
			((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10191 = new int[i_126_];
		}
		int[] is_127_ = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10157);
		int[] is_128_ = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anIntArray10191);
		for (int i_129_ = 0; i_129_ < i_126_; i_129_++) {
			is_127_[i_129_] = is[i_129_] >> (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10049);
			is_128_[i_129_] = is_125_[i_129_] >> (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		}
		int i_130_ = 0;
		while (i_130_ < i_126_) {
			int i_131_ = is_127_[i_130_];
			int i_132_ = is_128_[i_130_++];
			int i_133_ = is_127_[i_130_];
			int i_134_ = is_128_[i_130_++];
			int i_135_ = is_127_[i_130_];
			int i_136_ = is_128_[i_130_++];
			if (((i_131_ - i_133_) * (i_134_ - i_136_) - (i_134_ - i_132_) * (i_135_ - i_133_)) > 0)
				class572_sub12_sub18_sub1.method10624(i_132_, i_134_, i_136_, i_131_, i_133_, i_135_);
		}
	}

	public boolean method2723(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_137_, int i_138_, int i_139_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 == null || class572_sub12_sub18 == null)
			return false;
		int i_140_ = (i - (i_137_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		int i_141_ = (i_138_ - (i_137_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053) >> 8) >> ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10049);
		return ((Class174_Sub3) this).aClass180_10891.method2785(class572_sub12_sub18, i_140_, i_141_);
	}

	public void method2721(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_142_, int i_143_, int i_144_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_145_ = (i - (i_142_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_146_ = (i_143_ - (i_142_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2789(class572_sub12_sub18, i_145_, i_146_);
		}
	}

	public void method2722(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_147_, int i_148_, int i_149_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_150_ = (i - (i_147_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_151_ = (i_148_ - (i_147_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2784(class572_sub12_sub18, i_150_, i_151_);
		}
	}

	public void method2724(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub3) this).aClass675_10892.method7940(new Class572_Sub37(((Class174_Sub3) this).aClass106_Sub1_10906, this, class572_sub36, is), -1635831982);
	}

	public void method2714(int i, int i_152_, int i_153_) {
		i = Math.min(((Class174_Sub3) this).aByteArrayArray10901.length - 1, Math.max(0, i));
		i_152_ = Math.min((((Class174_Sub3) this).aByteArrayArray10901[i].length - 1), Math.max(0, i_152_));
		if ((((Class174_Sub3) this).aByteArrayArray10901[i][i_152_] & 0xff) < i_153_)
			((Class174_Sub3) this).aByteArrayArray10901[i][i_152_] = (byte) i_153_;
	}

	public void method2727(int i, int i_154_, int i_155_) {
		i = Math.min(((Class174_Sub3) this).aByteArrayArray10901.length - 1, Math.max(0, i));
		i_154_ = Math.min((((Class174_Sub3) this).aByteArrayArray10901[i].length - 1), Math.max(0, i_154_));
		if ((((Class174_Sub3) this).aByteArrayArray10901[i][i_154_] & 0xff) < i_155_)
			((Class174_Sub3) this).aByteArrayArray10901[i][i_154_] = (byte) i_155_;
	}

	public void method2717(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub3) this).aClass675_10892.method7940(new Class572_Sub37(((Class174_Sub3) this).aClass106_Sub1_10906, this, class572_sub36, is), -1713579789);
	}

	Class174_Sub3(Class106_Sub1 class106_sub1, int i, int i_156_, int i_157_, int i_158_, int[][] is, int[][] is_159_, int i_160_) {
		super(i_157_, i_158_, i_160_, is);
		((Class174_Sub3) this).aClass106_Sub1_10906 = class106_sub1;
		((Class174_Sub3) this).anInt10876 = anInt2088 * 212267571 - 2;
		((Class174_Sub3) this).anInt10886 = 1 << ((Class174_Sub3) this).anInt10876;
		((Class174_Sub3) this).anInt10887 = i;
		((Class174_Sub3) this).anInt10879 = i_156_;
		((Class174_Sub3) this).anIntArrayArrayArray10888 = new int[i_157_][i_158_][];
		((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883 = new Class572_Sub39[i_157_][i_158_][];
		((Class174_Sub3) this).anIntArrayArrayArray10905 = new int[i_157_][i_158_][];
		((Class174_Sub3) this).anIntArrayArrayArray10896 = new int[i_157_][i_158_][];
		((Class174_Sub3) this).anIntArrayArrayArray10873 = new int[i_157_][i_158_][];
		((Class174_Sub3) this).anIntArrayArrayArray10885 = new int[i_157_][i_158_][];
		((Class174_Sub3) this).aShortArrayArray10882 = new short[i_157_ * i_158_][];
		((Class174_Sub3) this).aByteArrayArray10877 = new byte[i_157_][i_158_];
		((Class174_Sub3) this).aByteArrayArray10901 = new byte[i_157_ + 1][i_158_ + 1];
		((Class174_Sub3) this).aFloatArrayArray10902 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		((Class174_Sub3) this).aFloatArrayArray10897 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		((Class174_Sub3) this).aFloatArrayArray10904 = (new float[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
		for (int i_161_ = 1; i_161_ < anInt2089 * 792439321; i_161_++) {
			for (int i_162_ = 1; i_162_ < anInt2086 * -1715487093; i_162_++) {
				int i_163_ = (is_159_[i_162_ + 1][i_161_] - is_159_[i_162_ - 1][i_161_]);
				int i_164_ = (is_159_[i_162_][i_161_ + 1] - is_159_[i_162_][i_161_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_163_ * i_163_ + 4 * i_160_ * i_160_ + i_164_ * i_164_)));
				((Class174_Sub3) this).aFloatArrayArray10902[i_162_][i_161_] = (float) i_163_ * f;
				((Class174_Sub3) this).aFloatArrayArray10897[i_162_][i_161_] = (float) (-i_160_ * 2) * f;
				((Class174_Sub3) this).aFloatArrayArray10904[i_162_][i_161_] = (float) i_164_ * f;
			}
		}
		((Class174_Sub3) this).aClass676_10899 = new Class676(128);
		if ((((Class174_Sub3) this).anInt10879 & 0x10) != 0)
			((Class174_Sub3) this).aClass180_10891 = new Class180(((Class174_Sub3) this).aClass106_Sub1_10906, this);
	}

	public Class572_Sub12_Sub18 method2735(int i, int i_165_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub3) this).aByteArrayArray10877[i][i_165_] & 0x1) == 0)
			return null;
		int i_166_ = (anInt2087 * 2129890771 >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_167_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_166_, i_166_)) {
			class572_sub12_sub18_sub1_167_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_167_.method10628();
		} else
			class572_sub12_sub18_sub1_167_ = new Class572_Sub12_Sub18_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), i_166_, i_166_);
		class572_sub12_sub18_sub1_167_.method10634(0, 0, i_166_, i_166_);
		method10042(class572_sub12_sub18_sub1_167_, i, i_165_);
		return class572_sub12_sub18_sub1_167_;
	}

	public void method2730() {
		if (((Class174_Sub3) this).anInt10875 > 0) {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_168_ = 1; i_168_ < anInt2089 * 792439321; i_168_++)
					is[i][i_168_] = (byte) (((((Class174_Sub3) this).aByteArrayArray10901[i - 1][i_168_]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i + 1][i_168_]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_168_ - 1]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_168_ + 1]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_168_]) >> 1));
			}
			((Class174_Sub3) this).aClass572Array10893 = new Class572[((Class174_Sub3) this).aClass676_10899.method7962((byte) 0)];
			((Class174_Sub3) this).aClass676_10899.method7965(((Class174_Sub3) this).aClass572Array10893, (byte) -56);
			for (int i = 0; i < ((Class174_Sub3) this).aClass572Array10893.length; i++)
				((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i]).method8766(((Class174_Sub3) this).anInt10875);
			int i = 24;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null)
				i += 4;
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aNativeHeap10051.method772(((Class174_Sub3) this).anInt10875 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class572_Sub39[] class572_sub39s = new Class572_Sub39[((Class174_Sub3) this).anInt10875];
			int i_169_ = Cs2CallPointer.method5627(((Class174_Sub3) this).anInt10875 / 4, 326245663);
			if (i_169_ < 1)
				i_169_ = 1;
			Class676 class676 = new Class676(i_169_);
			Class572_Sub39[] class572_sub39s_170_ = new Class572_Sub39[((Class174_Sub3) this).anInt10884];
			for (int i_171_ = 0; i_171_ < anInt2086 * -1715487093; i_171_++) {
				for (int i_172_ = 0; i_172_ < anInt2089 * 792439321; i_172_++) {
					if ((((Class174_Sub3) this).anIntArrayArrayArray10873[i_171_][i_172_]) != null) {
						Class572_Sub39[] class572_sub39s_173_ = (((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883[i_171_][i_172_]);
						int[] is_174_ = (((Class174_Sub3) this).anIntArrayArrayArray10905[i_171_][i_172_]);
						int[] is_175_ = (((Class174_Sub3) this).anIntArrayArrayArray10896[i_171_][i_172_]);
						int[] is_176_ = (((Class174_Sub3) this).anIntArrayArrayArray10885[i_171_][i_172_]);
						int[] is_177_ = (((Class174_Sub3) this).anIntArrayArrayArray10873[i_171_][i_172_]);
						int[] is_178_ = ((((Class174_Sub3) this).anIntArrayArrayArray10888) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10888[i_171_][i_172_]) : null);
						int[] is_179_ = ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10889[i_171_][i_172_]) : null);
						if (is_176_ == null)
							is_176_ = is_177_;
						float f = (((Class174_Sub3) this).aFloatArrayArray10902[i_171_][i_172_]);
						float f_180_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_171_][i_172_]);
						float f_181_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_171_][i_172_]);
						float f_182_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_171_][i_172_ + 1]);
						float f_183_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_171_][i_172_ + 1]);
						float f_184_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_171_][i_172_ + 1]);
						float f_185_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_171_ + 1][i_172_ + 1]);
						float f_186_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_171_ + 1][i_172_ + 1]);
						float f_187_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_171_ + 1][i_172_ + 1]);
						float f_188_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_171_ + 1][i_172_]);
						float f_189_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_171_ + 1][i_172_]);
						float f_190_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_171_ + 1][i_172_]);
						int i_191_ = is[i_171_][i_172_] & 0xff;
						int i_192_ = is[i_171_][i_172_ + 1] & 0xff;
						int i_193_ = is[i_171_ + 1][i_172_ + 1] & 0xff;
						int i_194_ = is[i_171_ + 1][i_172_] & 0xff;
						int i_195_ = 0;
						while_72_: for (int i_196_ = 0; i_196_ < is_177_.length; i_196_++) {
							Class572_Sub39 class572_sub39 = class572_sub39s_173_[i_196_];
							for (int i_197_ = 0; i_197_ < i_195_; i_197_++) {
								if (class572_sub39s_170_[i_197_] == class572_sub39)
									continue while_72_;
							}
							class572_sub39s_170_[i_195_++] = class572_sub39;
						}
						short[] is_198_ = (((Class174_Sub3) this).aShortArrayArray10882[(i_172_ * (anInt2086 * -1715487093) + i_171_)] = new short[is_177_.length]);
						for (int i_199_ = 0; i_199_ < is_177_.length; i_199_++) {
							int i_200_ = ((i_171_ << anInt2088 * 212267571) + is_174_[i_199_]);
							int i_201_ = ((i_172_ << anInt2088 * 212267571) + is_175_[i_199_]);
							int i_202_ = i_200_ >> ((Class174_Sub3) this).anInt10876;
							int i_203_ = i_201_ >> ((Class174_Sub3) this).anInt10876;
							int i_204_ = is_177_[i_199_];
							int i_205_ = is_176_[i_199_];
							int i_206_ = is_178_ != null ? is_178_[i_199_] : 0;
							long l = ((long) i_205_ << 48 | (long) i_204_ << 32 | (long) (i_202_ << 16) | (long) i_203_);
							int i_207_ = is_174_[i_199_];
							int i_208_ = is_175_[i_199_];
							int i_209_ = 74;
							int i_210_ = 0;
							float f_211_ = 1.0F;
							float f_212_;
							float f_213_;
							float f_214_;
							if (i_207_ == 0 && i_208_ == 0) {
								f_212_ = f;
								f_213_ = f_180_;
								f_214_ = f_181_;
								i_209_ -= i_191_;
							} else if (i_207_ == 0 && i_208_ == anInt2087 * 2129890771) {
								f_212_ = f_182_;
								f_213_ = f_183_;
								f_214_ = f_184_;
								i_209_ -= i_192_;
							} else if (i_207_ == anInt2087 * 2129890771 && i_208_ == anInt2087 * 2129890771) {
								f_212_ = f_185_;
								f_213_ = f_186_;
								f_214_ = f_187_;
								i_209_ -= i_193_;
							} else if (i_207_ == anInt2087 * 2129890771 && i_208_ == 0) {
								f_212_ = f_188_;
								f_213_ = f_189_;
								f_214_ = f_190_;
								i_209_ -= i_194_;
							} else {
								float f_215_ = ((float) i_207_ / (float) (anInt2087 * 2129890771));
								float f_216_ = ((float) i_208_ / (float) (anInt2087 * 2129890771));
								float f_217_ = f + (f_188_ - f) * f_215_;
								float f_218_ = f_180_ + (f_189_ - f_180_) * f_215_;
								float f_219_ = f_181_ + (f_190_ - f_181_) * f_215_;
								float f_220_ = f_182_ + (f_185_ - f_182_) * f_215_;
								float f_221_ = f_183_ + (f_186_ - f_183_) * f_215_;
								float f_222_ = f_184_ + (f_187_ - f_184_) * f_215_;
								f_212_ = f_217_ + (f_220_ - f_217_) * f_216_;
								f_213_ = f_218_ + (f_221_ - f_218_) * f_216_;
								f_214_ = f_219_ + (f_222_ - f_219_) * f_216_;
								int i_223_ = i_191_ + ((i_194_ - i_191_) * i_207_ >> anInt2088 * 212267571);
								int i_224_ = i_192_ + ((i_193_ - i_192_) * i_207_ >> anInt2088 * 212267571);
								i_209_ -= i_223_ + ((i_224_ - i_223_) * i_208_ >> anInt2088 * 212267571);
							}
							if (i_204_ != -1) {
								int i_225_ = (i_204_ & 0x7f) * i_209_ >> 7;
								if (i_225_ < 2)
									i_225_ = 2;
								else if (i_225_ > 126)
									i_225_ = 126;
								i_210_ = (Class460.anIntArray5213[i_204_ & 0xff80 | i_225_]);
								if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
									f_211_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_212_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_213_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_214_);
									f_211_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_211_ * (f_211_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
								}
							}
							Class572 class572 = null;
							if ((i_200_ & ((Class174_Sub3) this).anInt10886 - 1) == 0 && ((i_201_ & ((Class174_Sub3) this).anInt10886 - 1) == 0))
								class572 = class676.get(l);
							int i_226_;
							if (class572 == null) {
								int i_227_;
								if (i_205_ != i_204_) {
									int i_228_ = (i_205_ & 0x7f) * i_209_ >> 7;
									if (i_228_ < 2)
										i_228_ = 2;
									else if (i_228_ > 126)
										i_228_ = 126;
									i_227_ = (Class460.anIntArray5213[i_205_ & 0xff80 | i_228_]);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
										float f_229_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_212_ + ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_213_) + ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_214_));
										f_229_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_211_ * (f_211_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
										int i_230_ = i_227_ >> 16 & 0xff;
										int i_231_ = i_227_ >> 8 & 0xff;
										int i_232_ = i_227_ & 0xff;
										i_230_ *= f_229_;
										if (i_230_ < 0)
											i_230_ = 0;
										else if (i_230_ > 255)
											i_230_ = 255;
										i_231_ *= f_229_;
										if (i_231_ < 0)
											i_231_ = 0;
										else if (i_231_ > 255)
											i_231_ = 255;
										i_232_ *= f_229_;
										if (i_232_ < 0)
											i_232_ = 0;
										else if (i_232_ > 255)
											i_232_ = 255;
										i_227_ = (i_230_ << 16 | i_231_ << 8 | i_232_);
									}
								} else
									i_227_ = i_210_;
								if (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aBool10153) {
									stream.method2801((float) i_200_);
									stream.method2801((float) (method2726(i_200_, i_201_, 358769667) + i_206_));
									stream.method2801((float) i_201_);
									stream.method2800((byte) (i_227_ >> 16));
									stream.method2800((byte) (i_227_ >> 8));
									stream.method2800((byte) i_227_);
									stream.method2800(-1);
									stream.method2801((float) i_200_);
									stream.method2801((float) i_201_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2801(is_179_ != null ? (float) ((is_179_[i_199_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2801(f_212_);
										stream.method2801(f_213_);
										stream.method2801(f_214_);
									}
								} else {
									stream.method2802((float) i_200_);
									stream.method2802((float) (method2726(i_200_, i_201_, 358769667) + i_206_));
									stream.method2802((float) i_201_);
									stream.method2800((byte) (i_227_ >> 16));
									stream.method2800((byte) (i_227_ >> 8));
									stream.method2800((byte) i_227_);
									stream.method2800(-1);
									stream.method2802((float) i_200_);
									stream.method2802((float) i_201_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2802(is_179_ != null ? (float) ((is_179_[i_199_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2802(f_212_);
										stream.method2802(f_213_);
										stream.method2802(f_214_);
									}
								}
								i_226_ = ((Class174_Sub3) this).anInt10880++;
								is_198_[i_199_] = (short) i_226_;
								if (i_204_ != -1)
									class572_sub39s[i_226_] = class572_sub39s_173_[i_199_];
								class676.put(new Class572_Sub11(is_198_[i_199_]), l);
							} else {
								is_198_[i_199_] = ((Class572_Sub11) class572).aShort9091;
								i_226_ = is_198_[i_199_] & 0xffff;
								if (i_204_ != -1 && ((class572_sub39s_173_[i_199_].hash * 381237825124074065L) < (class572_sub39s[i_226_].hash * 381237825124074065L)))
									class572_sub39s[i_226_] = class572_sub39s_173_[i_199_];
							}
							for (int i_233_ = 0; i_233_ < i_195_; i_233_++)
								class572_sub39s_170_[i_233_].method8774(i_226_, i_210_, i_209_, f_211_);
							((Class174_Sub3) this).anInt10881++;
						}
					}
				}
			}
			for (int i_234_ = 0; i_234_ < ((Class174_Sub3) this).anInt10880; i_234_++) {
				Class572_Sub39 class572_sub39 = class572_sub39s[i_234_];
				if (class572_sub39 != null)
					class572_sub39.method8767(i_234_);
			}
			for (int i_235_ = 0; i_235_ < anInt2086 * -1715487093; i_235_++) {
				for (int i_236_ = 0; i_236_ < anInt2089 * 792439321; i_236_++) {
					short[] is_237_ = (((Class174_Sub3) this).aShortArrayArray10882[i_236_ * (anInt2086 * -1715487093) + i_235_]);
					if (is_237_ != null) {
						int i_238_ = 0;
						int i_239_ = 0;
						while (i_239_ < is_237_.length) {
							int i_240_ = is_237_[i_239_++] & 0xffff;
							int i_241_ = is_237_[i_239_++] & 0xffff;
							int i_242_ = is_237_[i_239_++] & 0xffff;
							Class572_Sub39 class572_sub39 = class572_sub39s[i_240_];
							Class572_Sub39 class572_sub39_243_ = class572_sub39s[i_241_];
							Class572_Sub39 class572_sub39_244_ = class572_sub39s[i_242_];
							Class572_Sub39 class572_sub39_245_ = null;
							if (class572_sub39 != null) {
								class572_sub39.method8776(i_235_, i_236_, i_238_);
								class572_sub39_245_ = class572_sub39;
							}
							if (class572_sub39_243_ != null) {
								class572_sub39_243_.method8776(i_235_, i_236_, i_238_);
								if (class572_sub39_245_ == null || ((class572_sub39_243_.hash * 381237825124074065L) < (class572_sub39_245_.hash * 381237825124074065L)))
									class572_sub39_245_ = class572_sub39_243_;
							}
							if (class572_sub39_244_ != null) {
								class572_sub39_244_.method8776(i_235_, i_236_, i_238_);
								if (class572_sub39_245_ == null || ((class572_sub39_244_.hash * 381237825124074065L) < (class572_sub39_245_.hash * 381237825124074065L)))
									class572_sub39_245_ = class572_sub39_244_;
							}
							if (class572_sub39_245_ != null) {
								if (class572_sub39 != null)
									class572_sub39_245_.method8767(i_240_);
								if (class572_sub39_243_ != null)
									class572_sub39_245_.method8767(i_241_);
								if (class572_sub39_244_ != null)
									class572_sub39_245_.method8767(i_242_);
								class572_sub39_245_.method8776(i_235_, i_236_, i_238_);
							}
							i_238_++;
						}
					}
				}
			}
			stream.method2803();
			((Class174_Sub3) this).anInterface9_10894 = (((Class174_Sub3) this).aClass106_Sub1_10906.method9414(i, nativeheapbuffer, stream.method2798(), false));
			if (((Class174_Sub3) this).anInterface9_10894 instanceof Class154_Sub1)
				nativeheapbuffer.method1038();
			((Class174_Sub3) this).aClass142_10895 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 0);
			((Class174_Sub3) this).aClass142_10898 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5121, 4, 12);
			int i_246_;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null) {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 16);
				i_246_ = 28;
			} else {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 2, 16);
				i_246_ = 24;
			}
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				((Class174_Sub3) this).aClass142_10903 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, i_246_);
			long[] ls = new long[((Class174_Sub3) this).aClass572Array10893.length];
			for (int i_247_ = 0; i_247_ < ((Class174_Sub3) this).aClass572Array10893.length; i_247_++) {
				Class572_Sub39 class572_sub39 = ((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i_247_]);
				ls[i_247_] = class572_sub39.hash * 381237825124074065L;
				class572_sub39.method8770(((Class174_Sub3) this).anInt10880);
			}
			Class543.method6441(ls, ((Class174_Sub3) this).aClass572Array10893, -698816880);
			if (((Class174_Sub3) this).aClass180_10891 != null)
				((Class174_Sub3) this).aClass180_10891.method2792();
		} else
			((Class174_Sub3) this).aClass180_10891 = null;
		if ((((Class174_Sub3) this).anInt10887 & 0x2) == 0) {
			((Class174_Sub3) this).anIntArrayArrayArray10896 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10905 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10873 = null;
		}
		((Class174_Sub3) this).anIntArrayArrayArray10889 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10885 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10888 = null;
		((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883 = null;
		((Class174_Sub3) this).aByteArrayArray10901 = null;
		((Class174_Sub3) this).aClass676_10899 = null;
		((Class174_Sub3) this).aFloatArrayArray10904 = null;
		((Class174_Sub3) this).aFloatArrayArray10897 = null;
		((Class174_Sub3) this).aFloatArrayArray10902 = null;
	}

	public void method2734(int i, int i_248_, int i_249_, boolean[][] bools, boolean bool, int i_250_) {
		method10041(i, i_248_, i_249_, bools, bool, i_250_);
	}

	public void method2745(int i, int i_251_, int[] is, int[] is_252_, int[] is_253_, int[] is_254_, int[] is_255_, int[] is_256_, int[] is_257_, int[] is_258_, int[] is_259_, int[] is_260_, int[] is_261_, Class86 class86, boolean bool) {
		int i_262_ = is_258_.length;
		int[] is_263_ = new int[i_262_ * 3];
		int[] is_264_ = new int[i_262_ * 3];
		int[] is_265_ = new int[i_262_ * 3];
		int[] is_266_ = is_259_ != null ? new int[i_262_ * 3] : null;
		int[] is_267_ = new int[i_262_ * 3];
		int[] is_268_ = new int[i_262_ * 3];
		int[] is_269_ = is_252_ != null ? new int[i_262_ * 3] : null;
		int[] is_270_ = is_254_ != null ? new int[i_262_ * 3] : null;
		int i_271_ = 0;
		for (int i_272_ = 0; i_272_ < i_262_; i_272_++) {
			int i_273_ = is_255_[i_272_];
			int i_274_ = is_256_[i_272_];
			int i_275_ = is_257_[i_272_];
			is_263_[i_271_] = is[i_273_];
			is_264_[i_271_] = is_253_[i_273_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			if (is_259_ != null)
				is_266_[i_271_] = is_259_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_273_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_273_];
			i_271_++;
			is_263_[i_271_] = is[i_274_];
			is_264_[i_271_] = is_253_[i_274_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			if (is_259_ != null)
				is_266_[i_271_] = is_259_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_274_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_274_];
			i_271_++;
			is_263_[i_271_] = is[i_275_];
			is_264_[i_271_] = is_253_[i_275_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			if (is_259_ != null)
				is_266_[i_271_] = is_259_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_275_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_275_];
			i_271_++;
		}
		method2728(i, i_251_, is_263_, is_269_, is_264_, is_270_, is_265_, is_266_, is_267_, is_268_, class86, bool);
	}

	public boolean method2738(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_276_, int i_277_, int i_278_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 == null || class572_sub12_sub18 == null)
			return false;
		int i_279_ = (i - (i_276_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		int i_280_ = (i_277_ - (i_276_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053) >> 8) >> ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10049);
		return ((Class174_Sub3) this).aClass180_10891.method2785(class572_sub12_sub18, i_279_, i_280_);
	}

	public Class572_Sub12_Sub18 method2736(int i, int i_281_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub3) this).aByteArrayArray10877[i][i_281_] & 0x1) == 0)
			return null;
		int i_282_ = (anInt2087 * 2129890771 >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_283_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_282_, i_282_)) {
			class572_sub12_sub18_sub1_283_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_283_.method10628();
		} else
			class572_sub12_sub18_sub1_283_ = new Class572_Sub12_Sub18_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), i_282_, i_282_);
		class572_sub12_sub18_sub1_283_.method10634(0, 0, i_282_, i_282_);
		method10042(class572_sub12_sub18_sub1_283_, i, i_281_);
		return class572_sub12_sub18_sub1_283_;
	}

	public void method2725(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_284_, int i_285_, int i_286_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_287_ = (i - (i_284_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_288_ = (i_285_ - (i_284_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2784(class572_sub12_sub18, i_287_, i_288_);
		}
	}

	public void method2746(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_289_, int i_290_, int i_291_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_292_ = (i - (i_289_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_293_ = (i_290_ - (i_289_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2789(class572_sub12_sub18, i_292_, i_293_);
		}
	}

	public boolean method2737(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_294_, int i_295_, int i_296_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 == null || class572_sub12_sub18 == null)
			return false;
		int i_297_ = (i - (i_294_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		int i_298_ = (i_295_ - (i_294_ * (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053) >> 8) >> ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10049);
		return ((Class174_Sub3) this).aClass180_10891.method2785(class572_sub12_sub18, i_297_, i_298_);
	}

	public void method2732(int i, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, int i_304_, boolean[][] bools) {
		Class104 class104 = ((Class174_Sub3) this).aClass106_Sub1_10906.method1683(1345648303);
		if (((Class174_Sub3) this).anInt10875 > 0 && class104 != null) {
			((Class174_Sub3) this).aClass106_Sub1_10906.method9399();
			((Class174_Sub3) this).aClass106_Sub1_10906.method9428(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9429(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9431(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9432(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9456(0);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9389(-2);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9422(null);
			aFloatArray10890[0] = (float) i_300_ / (128.0F * (float) (anInt2087 * 2129890771) * (float) class104.method1648());
			aFloatArray10890[1] = 0.0F;
			aFloatArray10890[2] = 0.0F;
			aFloatArray10890[3] = 0.0F;
			aFloatArray10890[4] = 0.0F;
			aFloatArray10890[5] = (float) i_300_ / (128.0F * (float) (anInt2087 * 2129890771) * (float) class104.method1646());
			aFloatArray10890[6] = 0.0F;
			aFloatArray10890[7] = 0.0F;
			aFloatArray10890[8] = 0.0F;
			aFloatArray10890[9] = 0.0F;
			aFloatArray10890[10] = 0.0F;
			aFloatArray10890[11] = 0.0F;
			aFloatArray10890[12] = -1.0F - ((float) (i_301_ * i_300_) / 128.0F - (float) (i * 2)) / (float) class104.method1648();
			aFloatArray10890[13] = 1.0F - (((float) (2 * i_299_) + (float) (i_304_ * i_300_) / 128.0F) / (float) class104.method1646());
			aFloatArray10890[14] = 0.0F;
			aFloatArray10890[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray10890, 0);
			aFloatArray10890[0] = 1.0F;
			aFloatArray10890[1] = 0.0F;
			aFloatArray10890[2] = 0.0F;
			aFloatArray10890[3] = 0.0F;
			aFloatArray10890[4] = 0.0F;
			aFloatArray10890[5] = 0.0F;
			aFloatArray10890[6] = 1.0F;
			aFloatArray10890[7] = 0.0F;
			aFloatArray10890[8] = 0.0F;
			aFloatArray10890[9] = 1.0F;
			aFloatArray10890[10] = 0.0F;
			aFloatArray10890[11] = 0.0F;
			aFloatArray10890[12] = 0.0F;
			aFloatArray10890[13] = 0.0F;
			aFloatArray10890[14] = 0.0F;
			aFloatArray10890[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray10890, 0);
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
				((Class174_Sub3) this).aClass106_Sub1_10906.method9429(true);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9384();
			} else
				((Class174_Sub3) this).aClass106_Sub1_10906.method9429(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9416(((Class174_Sub3) this).aClass142_10895, ((Class174_Sub3) this).aClass142_10903, ((Class174_Sub3) this).aClass142_10898, ((Class174_Sub3) this).aClass142_10878);
			if ((((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158.b).length < ((Class174_Sub3) this).anInt10881 * 2)
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1(((Class174_Sub3) this).anInt10881 * 2);
			else
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158.o = 0;
			int i_305_ = 0;
			Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158);
			if (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aBool10153) {
				for (int i_306_ = i_302_; i_306_ < i_304_; i_306_++) {
					int i_307_ = i_306_ * (anInt2086 * -1715487093) + i_301_;
					for (int i_308_ = i_301_; i_308_ < i_303_; i_308_++) {
						if (bools[i_308_ - i_301_][i_306_ - i_302_]) {
							short[] is = (((Class174_Sub3) this).aShortArrayArray10882[i_307_]);
							if (is != null) {
								for (int i_309_ = 0; i_309_ < is.length; i_309_++) {
									class572_sub15_sub1.writeShort((is[i_309_] & 0xffff), -858611607);
									i_305_++;
								}
							}
						}
						i_307_++;
					}
				}
			} else {
				for (int i_310_ = i_302_; i_310_ < i_304_; i_310_++) {
					int i_311_ = i_310_ * (anInt2086 * -1715487093) + i_301_;
					for (int i_312_ = i_301_; i_312_ < i_303_; i_312_++) {
						if (bools[i_312_ - i_301_][i_310_ - i_302_]) {
							short[] is = (((Class174_Sub3) this).aShortArrayArray10882[i_311_]);
							if (is != null) {
								for (int i_313_ = 0; i_313_ < is.length; i_313_++) {
									class572_sub15_sub1.method8453((is[i_313_] & 0xffff), 1902149048);
									i_305_++;
								}
							}
						}
						i_311_++;
					}
				}
			}
			if (i_305_ > 0) {
				Class158_Sub1 class158_sub1 = new Class158_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), 5123, class572_sub15_sub1.b, (class572_sub15_sub1.o * -1585139053));
				((Class174_Sub3) this).aClass106_Sub1_10906.method9411(class158_sub1, 4, 0, i_305_);
			}
		}
	}

	public void method2739(Class572_Sub12_Sub18 class572_sub12_sub18, int i, int i_314_, int i_315_, int i_316_, boolean bool) {
		if (((Class174_Sub3) this).aClass180_10891 != null && class572_sub12_sub18 != null) {
			int i_317_ = (i - (i_314_ * (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).anInt10125) >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			int i_318_ = (i_315_ - (i_314_ * ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10053 >> 8) >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
			((Class174_Sub3) this).aClass180_10891.method2784(class572_sub12_sub18, i_317_, i_318_);
		}
	}

	public Class572_Sub12_Sub18 method2710(int i, int i_319_, Class572_Sub12_Sub18 class572_sub12_sub18) {
		if ((((Class174_Sub3) this).aByteArrayArray10877[i][i_319_] & 0x1) == 0)
			return null;
		int i_320_ = (anInt2087 * 2129890771 >> ((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).anInt10049);
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_321_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_320_, i_320_)) {
			class572_sub12_sub18_sub1_321_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_321_.method10628();
		} else
			class572_sub12_sub18_sub1_321_ = new Class572_Sub12_Sub18_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), i_320_, i_320_);
		class572_sub12_sub18_sub1_321_.method10634(0, 0, i_320_, i_320_);
		method10042(class572_sub12_sub18_sub1_321_, i, i_319_);
		return class572_sub12_sub18_sub1_321_;
	}

	public void method2741(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub3) this).aClass675_10892.method7940(new Class572_Sub37(((Class174_Sub3) this).aClass106_Sub1_10906, this, class572_sub36, is), -1915228781);
	}

	public void method2716(int i, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, boolean[][] bools) {
		Class104 class104 = ((Class174_Sub3) this).aClass106_Sub1_10906.method1683(-639227557);
		if (((Class174_Sub3) this).anInt10875 > 0 && class104 != null) {
			((Class174_Sub3) this).aClass106_Sub1_10906.method9399();
			((Class174_Sub3) this).aClass106_Sub1_10906.method9428(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9429(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9431(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9432(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9456(0);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9389(-2);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9422(null);
			aFloatArray10890[0] = (float) i_323_ / (128.0F * (float) (anInt2087 * 2129890771) * (float) class104.method1648());
			aFloatArray10890[1] = 0.0F;
			aFloatArray10890[2] = 0.0F;
			aFloatArray10890[3] = 0.0F;
			aFloatArray10890[4] = 0.0F;
			aFloatArray10890[5] = (float) i_323_ / (128.0F * (float) (anInt2087 * 2129890771) * (float) class104.method1646());
			aFloatArray10890[6] = 0.0F;
			aFloatArray10890[7] = 0.0F;
			aFloatArray10890[8] = 0.0F;
			aFloatArray10890[9] = 0.0F;
			aFloatArray10890[10] = 0.0F;
			aFloatArray10890[11] = 0.0F;
			aFloatArray10890[12] = -1.0F - ((float) (i_324_ * i_323_) / 128.0F - (float) (i * 2)) / (float) class104.method1648();
			aFloatArray10890[13] = 1.0F - (((float) (2 * i_322_) + (float) (i_327_ * i_323_) / 128.0F) / (float) class104.method1646());
			aFloatArray10890[14] = 0.0F;
			aFloatArray10890[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray10890, 0);
			aFloatArray10890[0] = 1.0F;
			aFloatArray10890[1] = 0.0F;
			aFloatArray10890[2] = 0.0F;
			aFloatArray10890[3] = 0.0F;
			aFloatArray10890[4] = 0.0F;
			aFloatArray10890[5] = 0.0F;
			aFloatArray10890[6] = 1.0F;
			aFloatArray10890[7] = 0.0F;
			aFloatArray10890[8] = 0.0F;
			aFloatArray10890[9] = 1.0F;
			aFloatArray10890[10] = 0.0F;
			aFloatArray10890[11] = 0.0F;
			aFloatArray10890[12] = 0.0F;
			aFloatArray10890[13] = 0.0F;
			aFloatArray10890[14] = 0.0F;
			aFloatArray10890[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray10890, 0);
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
				((Class174_Sub3) this).aClass106_Sub1_10906.method9429(true);
				((Class174_Sub3) this).aClass106_Sub1_10906.method9384();
			} else
				((Class174_Sub3) this).aClass106_Sub1_10906.method9429(false);
			((Class174_Sub3) this).aClass106_Sub1_10906.method9416(((Class174_Sub3) this).aClass142_10895, ((Class174_Sub3) this).aClass142_10903, ((Class174_Sub3) this).aClass142_10898, ((Class174_Sub3) this).aClass142_10878);
			if ((((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158.b).length < ((Class174_Sub3) this).anInt10881 * 2)
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1(((Class174_Sub3) this).anInt10881 * 2);
			else
				((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158.o = 0;
			int i_328_ = 0;
			Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aClass572_Sub15_Sub1_10158);
			if (((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aBool10153) {
				for (int i_329_ = i_325_; i_329_ < i_327_; i_329_++) {
					int i_330_ = i_329_ * (anInt2086 * -1715487093) + i_324_;
					for (int i_331_ = i_324_; i_331_ < i_326_; i_331_++) {
						if (bools[i_331_ - i_324_][i_329_ - i_325_]) {
							short[] is = (((Class174_Sub3) this).aShortArrayArray10882[i_330_]);
							if (is != null) {
								for (int i_332_ = 0; i_332_ < is.length; i_332_++) {
									class572_sub15_sub1.writeShort(is[i_332_] & 0xffff, -1933346633);
									i_328_++;
								}
							}
						}
						i_330_++;
					}
				}
			} else {
				for (int i_333_ = i_325_; i_333_ < i_327_; i_333_++) {
					int i_334_ = i_333_ * (anInt2086 * -1715487093) + i_324_;
					for (int i_335_ = i_324_; i_335_ < i_326_; i_335_++) {
						if (bools[i_335_ - i_324_][i_333_ - i_325_]) {
							short[] is = (((Class174_Sub3) this).aShortArrayArray10882[i_334_]);
							if (is != null) {
								for (int i_336_ = 0; i_336_ < is.length; i_336_++) {
									class572_sub15_sub1.method8453((is[i_336_] & 0xffff), 1614955964);
									i_328_++;
								}
							}
						}
						i_334_++;
					}
				}
			}
			if (i_328_ > 0) {
				Class158_Sub1 class158_sub1 = new Class158_Sub1((((Class174_Sub3) this).aClass106_Sub1_10906), 5123, class572_sub15_sub1.b, (class572_sub15_sub1.o * -1585139053));
				((Class174_Sub3) this).aClass106_Sub1_10906.method9411(class158_sub1, 4, 0, i_328_);
			}
		}
	}

	public void method2744(int i, int i_337_, int[] is, int[] is_338_, int[] is_339_, int[] is_340_, int[] is_341_, int[] is_342_, int[] is_343_, int[] is_344_, Class86 class86, boolean bool) {
		MapSize mapSize = ((Class174_Sub3) this).aClass106_Sub1_10906.aClass94_1396;
		if (is_340_ != null && ((Class174_Sub3) this).anIntArrayArrayArray10889 == null)
			((Class174_Sub3) this).anIntArrayArrayArray10889 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		if (is_338_ != null && ((Class174_Sub3) this).anIntArrayArrayArray10888 == null)
			((Class174_Sub3) this).anIntArrayArrayArray10888 = new int[anInt2086 * -1715487093][anInt2089 * 792439321][];
		((Class174_Sub3) this).anIntArrayArrayArray10905[i][i_337_] = is;
		((Class174_Sub3) this).anIntArrayArrayArray10896[i][i_337_] = is_339_;
		((Class174_Sub3) this).anIntArrayArrayArray10873[i][i_337_] = is_341_;
		((Class174_Sub3) this).anIntArrayArrayArray10885[i][i_337_] = is_342_;
		if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null)
			((Class174_Sub3) this).anIntArrayArrayArray10889[i][i_337_] = is_340_;
		if (((Class174_Sub3) this).anIntArrayArrayArray10888 != null)
			((Class174_Sub3) this).anIntArrayArrayArray10888[i][i_337_] = is_338_;
		Class572_Sub39[] class572_sub39s = (((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883[i][i_337_] = new Class572_Sub39[is_341_.length]);
		for (int i_345_ = 0; i_345_ < is_341_.length; i_345_++) {
			int i_346_ = is_343_[i_345_];
			int i_347_ = is_344_[i_345_];
			if ((((Class174_Sub3) this).anInt10879 & 0x20) != 0 && i_346_ != -1 && mapSize.getTexture(i_346_, 487744727).aBool1350) {
				i_347_ = 128;
				i_346_ = -1;
			}
			long l = ((long) (class86.anInt1191 * 1873501081) << 48 | (long) (class86.anInt1190 * -1018540369) << 42 | (long) (class86.anInt1193 * 526464983) << 28 | (long) (i_347_ << 14) | (long) i_346_);
			Class572 class572;
			for (class572 = ((Class174_Sub3) this).aClass676_10899.get(l); class572 != null; class572 = ((Class174_Sub3) this).aClass676_10899.method7971((byte) 116)) {
				Class572_Sub39 class572_sub39 = (Class572_Sub39) class572;
				if (((Class572_Sub39) class572_sub39).anInt9392 == i_346_ && (((Class572_Sub39) class572_sub39).aFloat9393 == (float) i_347_) && ((Class572_Sub39) class572_sub39).aClass86_9394.method1274(class86, 11185232))
					break;
			}
			if (class572 == null) {
				class572_sub39s[i_345_] = new Class572_Sub39(this, i_346_, i_347_, class86);
				((Class174_Sub3) this).aClass676_10899.put(class572_sub39s[i_345_], l);
			} else
				class572_sub39s[i_345_] = (Class572_Sub39) class572;
		}
		if (bool)
			((Class174_Sub3) this).aByteArrayArray10877[i][i_337_] |= 0x1;
		if (is_341_.length > ((Class174_Sub3) this).anInt10884)
			((Class174_Sub3) this).anInt10884 = is_341_.length;
		((Class174_Sub3) this).anInt10875 += is_341_.length;
	}

	public void method2712(int i, int i_348_, int[] is, int[] is_349_, int[] is_350_, int[] is_351_, int[] is_352_, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, Class86 class86, boolean bool) {
		int i_359_ = is_355_.length;
		int[] is_360_ = new int[i_359_ * 3];
		int[] is_361_ = new int[i_359_ * 3];
		int[] is_362_ = new int[i_359_ * 3];
		int[] is_363_ = is_356_ != null ? new int[i_359_ * 3] : null;
		int[] is_364_ = new int[i_359_ * 3];
		int[] is_365_ = new int[i_359_ * 3];
		int[] is_366_ = is_349_ != null ? new int[i_359_ * 3] : null;
		int[] is_367_ = is_351_ != null ? new int[i_359_ * 3] : null;
		int i_368_ = 0;
		for (int i_369_ = 0; i_369_ < i_359_; i_369_++) {
			int i_370_ = is_352_[i_369_];
			int i_371_ = is_353_[i_369_];
			int i_372_ = is_354_[i_369_];
			is_360_[i_368_] = is[i_370_];
			is_361_[i_368_] = is_350_[i_370_];
			is_362_[i_368_] = is_355_[i_369_];
			is_364_[i_368_] = is_357_[i_369_];
			is_365_[i_368_] = is_358_[i_369_];
			if (is_356_ != null)
				is_363_[i_368_] = is_356_[i_369_];
			if (is_349_ != null)
				is_366_[i_368_] = is_349_[i_370_];
			if (is_351_ != null)
				is_367_[i_368_] = is_351_[i_370_];
			i_368_++;
			is_360_[i_368_] = is[i_371_];
			is_361_[i_368_] = is_350_[i_371_];
			is_362_[i_368_] = is_355_[i_369_];
			is_364_[i_368_] = is_357_[i_369_];
			is_365_[i_368_] = is_358_[i_369_];
			if (is_356_ != null)
				is_363_[i_368_] = is_356_[i_369_];
			if (is_349_ != null)
				is_366_[i_368_] = is_349_[i_371_];
			if (is_351_ != null)
				is_367_[i_368_] = is_351_[i_371_];
			i_368_++;
			is_360_[i_368_] = is[i_372_];
			is_361_[i_368_] = is_350_[i_372_];
			is_362_[i_368_] = is_355_[i_369_];
			is_364_[i_368_] = is_357_[i_369_];
			is_365_[i_368_] = is_358_[i_369_];
			if (is_356_ != null)
				is_363_[i_368_] = is_356_[i_369_];
			if (is_349_ != null)
				is_366_[i_368_] = is_349_[i_372_];
			if (is_351_ != null)
				is_367_[i_368_] = is_351_[i_372_];
			i_368_++;
		}
		method2728(i, i_348_, is_360_, is_366_, is_361_, is_367_, is_362_, is_363_, is_364_, is_365_, class86, bool);
	}

	public void method2729() {
		if (((Class174_Sub3) this).anInt10875 > 0) {
			byte[][] is = (new byte[anInt2086 * -1715487093 + 1][anInt2089 * 792439321 + 1]);
			for (int i = 1; i < anInt2086 * -1715487093; i++) {
				for (int i_373_ = 1; i_373_ < anInt2089 * 792439321; i_373_++)
					is[i][i_373_] = (byte) (((((Class174_Sub3) this).aByteArrayArray10901[i - 1][i_373_]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i + 1][i_373_]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_373_ - 1]) >> 2) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_373_ + 1]) >> 3) + ((((Class174_Sub3) this).aByteArrayArray10901[i][i_373_]) >> 1));
			}
			((Class174_Sub3) this).aClass572Array10893 = new Class572[((Class174_Sub3) this).aClass676_10899.method7962((byte) 0)];
			((Class174_Sub3) this).aClass676_10899.method7965(((Class174_Sub3) this).aClass572Array10893, (byte) -38);
			for (int i = 0; i < ((Class174_Sub3) this).aClass572Array10893.length; i++)
				((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i]).method8766(((Class174_Sub3) this).anInt10875);
			int i = 24;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null)
				i += 4;
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class106_Sub1) ((Class174_Sub3) this).aClass106_Sub1_10906).aNativeHeap10051.method772(((Class174_Sub3) this).anInt10875 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class572_Sub39[] class572_sub39s = new Class572_Sub39[((Class174_Sub3) this).anInt10875];
			int i_374_ = Cs2CallPointer.method5627(((Class174_Sub3) this).anInt10875 / 4, 326245663);
			if (i_374_ < 1)
				i_374_ = 1;
			Class676 class676 = new Class676(i_374_);
			Class572_Sub39[] class572_sub39s_375_ = new Class572_Sub39[((Class174_Sub3) this).anInt10884];
			for (int i_376_ = 0; i_376_ < anInt2086 * -1715487093; i_376_++) {
				for (int i_377_ = 0; i_377_ < anInt2089 * 792439321; i_377_++) {
					if ((((Class174_Sub3) this).anIntArrayArrayArray10873[i_376_][i_377_]) != null) {
						Class572_Sub39[] class572_sub39s_378_ = (((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883[i_376_][i_377_]);
						int[] is_379_ = (((Class174_Sub3) this).anIntArrayArrayArray10905[i_376_][i_377_]);
						int[] is_380_ = (((Class174_Sub3) this).anIntArrayArrayArray10896[i_376_][i_377_]);
						int[] is_381_ = (((Class174_Sub3) this).anIntArrayArrayArray10885[i_376_][i_377_]);
						int[] is_382_ = (((Class174_Sub3) this).anIntArrayArrayArray10873[i_376_][i_377_]);
						int[] is_383_ = ((((Class174_Sub3) this).anIntArrayArrayArray10888) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10888[i_376_][i_377_]) : null);
						int[] is_384_ = ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null ? (((Class174_Sub3) this).anIntArrayArrayArray10889[i_376_][i_377_]) : null);
						if (is_381_ == null)
							is_381_ = is_382_;
						float f = (((Class174_Sub3) this).aFloatArrayArray10902[i_376_][i_377_]);
						float f_385_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_376_][i_377_]);
						float f_386_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_376_][i_377_]);
						float f_387_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_376_][i_377_ + 1]);
						float f_388_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_376_][i_377_ + 1]);
						float f_389_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_376_][i_377_ + 1]);
						float f_390_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_376_ + 1][i_377_ + 1]);
						float f_391_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_376_ + 1][i_377_ + 1]);
						float f_392_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_376_ + 1][i_377_ + 1]);
						float f_393_ = (((Class174_Sub3) this).aFloatArrayArray10902[i_376_ + 1][i_377_]);
						float f_394_ = (((Class174_Sub3) this).aFloatArrayArray10897[i_376_ + 1][i_377_]);
						float f_395_ = (((Class174_Sub3) this).aFloatArrayArray10904[i_376_ + 1][i_377_]);
						int i_396_ = is[i_376_][i_377_] & 0xff;
						int i_397_ = is[i_376_][i_377_ + 1] & 0xff;
						int i_398_ = is[i_376_ + 1][i_377_ + 1] & 0xff;
						int i_399_ = is[i_376_ + 1][i_377_] & 0xff;
						int i_400_ = 0;
						while_74_: for (int i_401_ = 0; i_401_ < is_382_.length; i_401_++) {
							Class572_Sub39 class572_sub39 = class572_sub39s_378_[i_401_];
							for (int i_402_ = 0; i_402_ < i_400_; i_402_++) {
								if (class572_sub39s_375_[i_402_] == class572_sub39)
									continue while_74_;
							}
							class572_sub39s_375_[i_400_++] = class572_sub39;
						}
						short[] is_403_ = (((Class174_Sub3) this).aShortArrayArray10882[(i_377_ * (anInt2086 * -1715487093) + i_376_)] = new short[is_382_.length]);
						for (int i_404_ = 0; i_404_ < is_382_.length; i_404_++) {
							int i_405_ = ((i_376_ << anInt2088 * 212267571) + is_379_[i_404_]);
							int i_406_ = ((i_377_ << anInt2088 * 212267571) + is_380_[i_404_]);
							int i_407_ = i_405_ >> ((Class174_Sub3) this).anInt10876;
							int i_408_ = i_406_ >> ((Class174_Sub3) this).anInt10876;
							int i_409_ = is_382_[i_404_];
							int i_410_ = is_381_[i_404_];
							int i_411_ = is_383_ != null ? is_383_[i_404_] : 0;
							long l = ((long) i_410_ << 48 | (long) i_409_ << 32 | (long) (i_407_ << 16) | (long) i_408_);
							int i_412_ = is_379_[i_404_];
							int i_413_ = is_380_[i_404_];
							int i_414_ = 74;
							int i_415_ = 0;
							float f_416_ = 1.0F;
							float f_417_;
							float f_418_;
							float f_419_;
							if (i_412_ == 0 && i_413_ == 0) {
								f_417_ = f;
								f_418_ = f_385_;
								f_419_ = f_386_;
								i_414_ -= i_396_;
							} else if (i_412_ == 0 && i_413_ == anInt2087 * 2129890771) {
								f_417_ = f_387_;
								f_418_ = f_388_;
								f_419_ = f_389_;
								i_414_ -= i_397_;
							} else if (i_412_ == anInt2087 * 2129890771 && i_413_ == anInt2087 * 2129890771) {
								f_417_ = f_390_;
								f_418_ = f_391_;
								f_419_ = f_392_;
								i_414_ -= i_398_;
							} else if (i_412_ == anInt2087 * 2129890771 && i_413_ == 0) {
								f_417_ = f_393_;
								f_418_ = f_394_;
								f_419_ = f_395_;
								i_414_ -= i_399_;
							} else {
								float f_420_ = ((float) i_412_ / (float) (anInt2087 * 2129890771));
								float f_421_ = ((float) i_413_ / (float) (anInt2087 * 2129890771));
								float f_422_ = f + (f_393_ - f) * f_420_;
								float f_423_ = f_385_ + (f_394_ - f_385_) * f_420_;
								float f_424_ = f_386_ + (f_395_ - f_386_) * f_420_;
								float f_425_ = f_387_ + (f_390_ - f_387_) * f_420_;
								float f_426_ = f_388_ + (f_391_ - f_388_) * f_420_;
								float f_427_ = f_389_ + (f_392_ - f_389_) * f_420_;
								f_417_ = f_422_ + (f_425_ - f_422_) * f_421_;
								f_418_ = f_423_ + (f_426_ - f_423_) * f_421_;
								f_419_ = f_424_ + (f_427_ - f_424_) * f_421_;
								int i_428_ = i_396_ + ((i_399_ - i_396_) * i_412_ >> anInt2088 * 212267571);
								int i_429_ = i_397_ + ((i_398_ - i_397_) * i_412_ >> anInt2088 * 212267571);
								i_414_ -= i_428_ + ((i_429_ - i_428_) * i_413_ >> anInt2088 * 212267571);
							}
							if (i_409_ != -1) {
								int i_430_ = (i_409_ & 0x7f) * i_414_ >> 7;
								if (i_430_ < 2)
									i_430_ = 2;
								else if (i_430_ > 126)
									i_430_ = 126;
								i_415_ = (Class460.anIntArray5213[i_409_ & 0xff80 | i_430_]);
								if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
									f_416_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_417_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_418_ + (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_419_);
									f_416_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_416_ * (f_416_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
								}
							}
							Class572 class572 = null;
							if ((i_405_ & ((Class174_Sub3) this).anInt10886 - 1) == 0 && ((i_406_ & ((Class174_Sub3) this).anInt10886 - 1) == 0))
								class572 = class676.get(l);
							int i_431_;
							if (class572 == null) {
								int i_432_;
								if (i_410_ != i_409_) {
									int i_433_ = (i_410_ & 0x7f) * i_414_ >> 7;
									if (i_433_ < 2)
										i_433_ = 2;
									else if (i_433_ > 126)
										i_433_ = 126;
									i_432_ = (Class460.anIntArray5213[i_410_ & 0xff80 | i_433_]);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) == 0) {
										float f_434_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[0]) * f_417_ + ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[1]) * f_418_) + ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloatArray10113[2]) * f_419_));
										f_434_ = ((((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10119) + (f_416_ * (f_416_ > 0.0F ? (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10120) : (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aFloat10126))));
										int i_435_ = i_432_ >> 16 & 0xff;
										int i_436_ = i_432_ >> 8 & 0xff;
										int i_437_ = i_432_ & 0xff;
										i_435_ *= f_434_;
										if (i_435_ < 0)
											i_435_ = 0;
										else if (i_435_ > 255)
											i_435_ = 255;
										i_436_ *= f_434_;
										if (i_436_ < 0)
											i_436_ = 0;
										else if (i_436_ > 255)
											i_436_ = 255;
										i_437_ *= f_434_;
										if (i_437_ < 0)
											i_437_ = 0;
										else if (i_437_ > 255)
											i_437_ = 255;
										i_432_ = (i_435_ << 16 | i_436_ << 8 | i_437_);
									}
								} else
									i_432_ = i_415_;
								if (((Class106_Sub1) (((Class174_Sub3) this).aClass106_Sub1_10906)).aBool10153) {
									stream.method2801((float) i_405_);
									stream.method2801((float) (method2726(i_405_, i_406_, 358769667) + i_411_));
									stream.method2801((float) i_406_);
									stream.method2800((byte) (i_432_ >> 16));
									stream.method2800((byte) (i_432_ >> 8));
									stream.method2800((byte) i_432_);
									stream.method2800(-1);
									stream.method2801((float) i_405_);
									stream.method2801((float) i_406_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2801(is_384_ != null ? (float) ((is_384_[i_404_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2801(f_417_);
										stream.method2801(f_418_);
										stream.method2801(f_419_);
									}
								} else {
									stream.method2802((float) i_405_);
									stream.method2802((float) (method2726(i_405_, i_406_, 358769667) + i_411_));
									stream.method2802((float) i_406_);
									stream.method2800((byte) (i_432_ >> 16));
									stream.method2800((byte) (i_432_ >> 8));
									stream.method2800((byte) i_432_);
									stream.method2800(-1);
									stream.method2802((float) i_405_);
									stream.method2802((float) i_406_);
									if ((((Class174_Sub3) this).anIntArrayArrayArray10889) != null)
										stream.method2802(is_384_ != null ? (float) ((is_384_[i_404_]) - 1) : 0.0F);
									if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0) {
										stream.method2802(f_417_);
										stream.method2802(f_418_);
										stream.method2802(f_419_);
									}
								}
								i_431_ = ((Class174_Sub3) this).anInt10880++;
								is_403_[i_404_] = (short) i_431_;
								if (i_409_ != -1)
									class572_sub39s[i_431_] = class572_sub39s_378_[i_404_];
								class676.put(new Class572_Sub11(is_403_[i_404_]), l);
							} else {
								is_403_[i_404_] = ((Class572_Sub11) class572).aShort9091;
								i_431_ = is_403_[i_404_] & 0xffff;
								if (i_409_ != -1 && ((class572_sub39s_378_[i_404_].hash * 381237825124074065L) < (class572_sub39s[i_431_].hash * 381237825124074065L)))
									class572_sub39s[i_431_] = class572_sub39s_378_[i_404_];
							}
							for (int i_438_ = 0; i_438_ < i_400_; i_438_++)
								class572_sub39s_375_[i_438_].method8774(i_431_, i_415_, i_414_, f_416_);
							((Class174_Sub3) this).anInt10881++;
						}
					}
				}
			}
			for (int i_439_ = 0; i_439_ < ((Class174_Sub3) this).anInt10880; i_439_++) {
				Class572_Sub39 class572_sub39 = class572_sub39s[i_439_];
				if (class572_sub39 != null)
					class572_sub39.method8767(i_439_);
			}
			for (int i_440_ = 0; i_440_ < anInt2086 * -1715487093; i_440_++) {
				for (int i_441_ = 0; i_441_ < anInt2089 * 792439321; i_441_++) {
					short[] is_442_ = (((Class174_Sub3) this).aShortArrayArray10882[i_441_ * (anInt2086 * -1715487093) + i_440_]);
					if (is_442_ != null) {
						int i_443_ = 0;
						int i_444_ = 0;
						while (i_444_ < is_442_.length) {
							int i_445_ = is_442_[i_444_++] & 0xffff;
							int i_446_ = is_442_[i_444_++] & 0xffff;
							int i_447_ = is_442_[i_444_++] & 0xffff;
							Class572_Sub39 class572_sub39 = class572_sub39s[i_445_];
							Class572_Sub39 class572_sub39_448_ = class572_sub39s[i_446_];
							Class572_Sub39 class572_sub39_449_ = class572_sub39s[i_447_];
							Class572_Sub39 class572_sub39_450_ = null;
							if (class572_sub39 != null) {
								class572_sub39.method8776(i_440_, i_441_, i_443_);
								class572_sub39_450_ = class572_sub39;
							}
							if (class572_sub39_448_ != null) {
								class572_sub39_448_.method8776(i_440_, i_441_, i_443_);
								if (class572_sub39_450_ == null || ((class572_sub39_448_.hash * 381237825124074065L) < (class572_sub39_450_.hash * 381237825124074065L)))
									class572_sub39_450_ = class572_sub39_448_;
							}
							if (class572_sub39_449_ != null) {
								class572_sub39_449_.method8776(i_440_, i_441_, i_443_);
								if (class572_sub39_450_ == null || ((class572_sub39_449_.hash * 381237825124074065L) < (class572_sub39_450_.hash * 381237825124074065L)))
									class572_sub39_450_ = class572_sub39_449_;
							}
							if (class572_sub39_450_ != null) {
								if (class572_sub39 != null)
									class572_sub39_450_.method8767(i_445_);
								if (class572_sub39_448_ != null)
									class572_sub39_450_.method8767(i_446_);
								if (class572_sub39_449_ != null)
									class572_sub39_450_.method8767(i_447_);
								class572_sub39_450_.method8776(i_440_, i_441_, i_443_);
							}
							i_443_++;
						}
					}
				}
			}
			stream.method2803();
			((Class174_Sub3) this).anInterface9_10894 = (((Class174_Sub3) this).aClass106_Sub1_10906.method9414(i, nativeheapbuffer, stream.method2798(), false));
			if (((Class174_Sub3) this).anInterface9_10894 instanceof Class154_Sub1)
				nativeheapbuffer.method1038();
			((Class174_Sub3) this).aClass142_10895 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 0);
			((Class174_Sub3) this).aClass142_10898 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5121, 4, 12);
			int i_451_;
			if (((Class174_Sub3) this).anIntArrayArrayArray10889 != null) {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, 16);
				i_451_ = 28;
			} else {
				((Class174_Sub3) this).aClass142_10878 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 2, 16);
				i_451_ = 24;
			}
			if ((((Class174_Sub3) this).anInt10879 & 0x7) != 0)
				((Class174_Sub3) this).aClass142_10903 = new Class142(((Class174_Sub3) this).anInterface9_10894, 5126, 3, i_451_);
			long[] ls = new long[((Class174_Sub3) this).aClass572Array10893.length];
			for (int i_452_ = 0; i_452_ < ((Class174_Sub3) this).aClass572Array10893.length; i_452_++) {
				Class572_Sub39 class572_sub39 = ((Class572_Sub39) ((Class174_Sub3) this).aClass572Array10893[i_452_]);
				ls[i_452_] = class572_sub39.hash * 381237825124074065L;
				class572_sub39.method8770(((Class174_Sub3) this).anInt10880);
			}
			Class543.method6441(ls, ((Class174_Sub3) this).aClass572Array10893, -1451707918);
			if (((Class174_Sub3) this).aClass180_10891 != null)
				((Class174_Sub3) this).aClass180_10891.method2792();
		} else
			((Class174_Sub3) this).aClass180_10891 = null;
		if ((((Class174_Sub3) this).anInt10887 & 0x2) == 0) {
			((Class174_Sub3) this).anIntArrayArrayArray10896 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10905 = null;
			((Class174_Sub3) this).anIntArrayArrayArray10873 = null;
		}
		((Class174_Sub3) this).anIntArrayArrayArray10889 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10885 = null;
		((Class174_Sub3) this).anIntArrayArrayArray10888 = null;
		((Class174_Sub3) this).aClass572_Sub39ArrayArrayArray10883 = null;
		((Class174_Sub3) this).aByteArrayArray10901 = null;
		((Class174_Sub3) this).aClass676_10899 = null;
		((Class174_Sub3) this).aFloatArrayArray10904 = null;
		((Class174_Sub3) this).aFloatArrayArray10897 = null;
		((Class174_Sub3) this).aFloatArrayArray10902 = null;
	}

	public void method2742(Class572_Sub36 class572_sub36, int[] is) {
		((Class174_Sub3) this).aClass675_10892.method7940(new Class572_Sub37(((Class174_Sub3) this).aClass106_Sub1_10906, this, class572_sub36, is), -1807822180);
	}
}
