package game;

/* Class572_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class572_Sub21 extends Class572 {
	float[][] aFloatArrayArray9156;
	Class174_Sub1 aClass174_Sub1_9157;
	float[][] aFloatArrayArray9158;
	int anInt9159;
	Interface46 anInterface46_9160;
	int anInt9161;
	int anInt9162;
	int anInt9163;
	ByteBuffer aByteBuffer9164;
	int anInt9165;
	int anInt9166 = 0;
	Interface44 anInterface44_9167;
	float[][] aFloatArrayArray9168;
	int anInt9169 = 0;
	Class572_Sub36 aClass572_Sub36_9170;
	Class676 aClass676_9171;
	Class106_Sub3 aClass106_Sub3_9172;

	void method8596(Class340 class340, Interface46 interface46, int i) {
		class340.anInt4330 = 0;
		class340.anInt4346 = ((Class572_Sub21) this).anInt9166;
		class340.anInt4347 = 0;
		class340.anInt4348 = ((Class572_Sub21) this).anInt9165 / 3;
		class340.anInterface43_4342 = ((Class572_Sub21) this).aClass106_Sub3_9172.anInterface43_10474;
		float f = ((Class572_Sub21) this).aClass572_Sub36_9170.method8724((byte) 105);
		class340.aClass240_4326.method3268(f, f, f);
		((Class572_Sub21) this).aClass106_Sub3_9172.method9674(0, ((Class572_Sub21) this).anInterface44_9167);
		((Class572_Sub21) this).aClass106_Sub3_9172.method9673(((Class106_Sub3) ((Class572_Sub21) this).aClass106_Sub3_9172).aClass362_10535);
		((Class572_Sub21) this).aClass106_Sub3_9172.method9693(((Class572_Sub21) this).anInterface46_9160);
		class340.method4264(0);
	}

	void method8597() {
		((Class572_Sub21) this).anInterface46_9160 = ((Class572_Sub21) this).aClass106_Sub3_9172.method9671(false);
		((Class572_Sub21) this).anInterface46_9160.method265(((Class572_Sub21) this).anInt9165);
		((Class572_Sub21) this).anInterface44_9167 = ((Class572_Sub21) this).aClass106_Sub3_9172.method9723(false);
		((Class572_Sub21) this).anInterface44_9167.method259(((Class572_Sub21) this).anInt9166 * 16, 16);
		((Class572_Sub21) this).anInterface44_9167.method223(0, ((Class572_Sub21) this).anInt9166 * 16, ((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444);
		((Class572_Sub21) this).anInterface46_9160.method223(0, ((Class572_Sub21) this).anInt9165 * 2, (((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class106_Sub3) (((Class572_Sub21) this).aClass106_Sub3_9172)).anInt10381 >> 1)));
	}

	void method8598(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2088) * 212267571);
		int i_6_ = i_4_ + (i_2_ << (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2088) * 212267571);
		int i_7_ = ((Class572_Sub21) this).aClass174_Sub1_9157.method2726(i_5_, i_6_, 358769667);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class572 class572 = ((Class572_Sub21) this).aClass676_9171.get(l);
			if (class572 != null) {
				Unsafe unsafe = (((Class572_Sub21) this).aClass106_Sub3_9172.anUnsafe10377);
				unsafe.putShort(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class106_Sub3) (((Class572_Sub21) this).aClass106_Sub3_9172)).anInt10381 >> 1) + (long) (((Class572_Sub21) this).anInt9165 * 2)), ((Class572_Sub11) class572).aShort9091);
				((Class572_Sub21) this).anInt9165++;
				return;
			}
		}
		short i_8_ = (short) ((Class572_Sub21) this).anInt9166;
		if (l != -1L)
			((Class572_Sub21) this).aClass676_9171.put(new Class572_Sub11(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = ((Class572_Sub21) this).aFloatArrayArray9168[i][i_0_];
			f_9_ = ((Class572_Sub21) this).aFloatArrayArray9158[i][i_0_];
			f_10_ = ((Class572_Sub21) this).aFloatArrayArray9156[i][i_0_];
		} else if (i_3_ == (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771 && i_4_ == 0) {
			f = ((Class572_Sub21) this).aFloatArrayArray9168[i + 1][i_0_];
			f_9_ = ((Class572_Sub21) this).aFloatArrayArray9158[i + 1][i_0_];
			f_10_ = ((Class572_Sub21) this).aFloatArrayArray9156[i + 1][i_0_];
		} else if (i_3_ == (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771 && i_4_ == (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771) {
			f = ((Class572_Sub21) this).aFloatArrayArray9168[i + 1][i_0_ + 1];
			f_9_ = (((Class572_Sub21) this).aFloatArrayArray9158[i + 1][i_0_ + 1]);
			f_10_ = (((Class572_Sub21) this).aFloatArrayArray9156[i + 1][i_0_ + 1]);
		} else if (i_3_ == 0 && i_4_ == (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771) {
			f = ((Class572_Sub21) this).aFloatArrayArray9168[i][i_0_ + 1];
			f_9_ = ((Class572_Sub21) this).aFloatArrayArray9158[i][i_0_ + 1];
			f_10_ = ((Class572_Sub21) this).aFloatArrayArray9156[i][i_0_ + 1];
		} else {
			float f_11_ = (float) i_3_ / (float) ((((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771);
			float f_12_ = (float) i_4_ / (float) ((((Class572_Sub21) this).aClass174_Sub1_9157.anInt2087) * 2129890771);
			float f_13_ = ((Class572_Sub21) this).aFloatArrayArray9168[i][i_0_];
			float f_14_ = ((Class572_Sub21) this).aFloatArrayArray9158[i][i_0_];
			float f_15_ = ((Class572_Sub21) this).aFloatArrayArray9156[i][i_0_];
			float f_16_ = ((Class572_Sub21) this).aFloatArrayArray9168[i + 1][i_0_];
			float f_17_ = ((Class572_Sub21) this).aFloatArrayArray9158[i + 1][i_0_];
			float f_18_ = ((Class572_Sub21) this).aFloatArrayArray9156[i + 1][i_0_];
			f_13_ += (((Class572_Sub21) this).aFloatArrayArray9168[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (((Class572_Sub21) this).aFloatArrayArray9158[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (((Class572_Sub21) this).aFloatArrayArray9156[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += ((((Class572_Sub21) this).aFloatArrayArray9168[i + 1][i_0_ + 1]) - f_16_) * f_11_;
			f_17_ += ((((Class572_Sub21) this).aFloatArrayArray9158[i + 1][i_0_ + 1]) - f_17_) * f_11_;
			f_18_ += ((((Class572_Sub21) this).aFloatArrayArray9156[i + 1][i_0_ + 1]) - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (((Class572_Sub21) this).aClass572_Sub36_9170.method8720(-517711282) - i_5_);
		float f_20_ = (float) (((Class572_Sub21) this).aClass572_Sub36_9170.method8721((byte) 94) - i_7_);
		float f_21_ = (float) (((Class572_Sub21) this).aClass572_Sub36_9170.method8722(988224587) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) ((Class572_Sub21) this).aClass572_Sub36_9170.method8752((byte) 58);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = ((Class572_Sub21) this).aClass572_Sub36_9170.method8723(-1288611141);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		Unsafe unsafe = ((Class572_Sub21) this).aClass106_Sub3_9172.anUnsafe10377;
		unsafe.putFloat((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class572_Sub21) this).anInt9166 * 16)), (float) i_5_);
		unsafe.putFloat((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class572_Sub21) this).anInt9166 * 16) + 4L), (float) i_7_);
		unsafe.putFloat((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class572_Sub21) this).anInt9166 * 16) + 8L), (float) i_6_);
		if ((((Class106_Sub3) ((Class572_Sub21) this).aClass106_Sub3_9172).anInt10477) == 0) {
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 12L), (byte) i_31_);
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 13L), (byte) i_30_);
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 14L), (byte) i_29_);
		} else {
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 12L), (byte) i_29_);
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 13L), (byte) i_30_);
			unsafe.putByte(((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444) + (long) (((Class572_Sub21) this).anInt9166 * 16) + 14L), (byte) i_31_);
		}
		unsafe.putByte((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class572_Sub21) this).anInt9166 * 16) + 15L), (byte) -1);
		((Class572_Sub21) this).anInt9166++;
		unsafe.putShort((((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) ((((Class106_Sub3) (((Class572_Sub21) this).aClass106_Sub3_9172)).anInt10381) >> 1) + (long) (((Class572_Sub21) this).anInt9165 * 2)), i_8_);
		((Class572_Sub21) this).anInt9165++;
	}

	void method8599(Class340 class340, int i, int i_32_, int i_33_, boolean[][] bools, boolean bool) {
		if (((Class572_Sub21) this).anInterface46_9160 != null && ((Class572_Sub21) this).anInt9159 <= i + i_33_ && ((Class572_Sub21) this).anInt9163 >= i - i_33_ && ((Class572_Sub21) this).anInt9161 <= i_32_ + i_33_ && ((Class572_Sub21) this).anInt9162 >= i_32_ - i_33_) {
			if (bool) {
				for (int i_34_ = ((Class572_Sub21) this).anInt9159; i_34_ <= ((Class572_Sub21) this).anInt9163; i_34_++) {
					if (i_34_ - i >= -i_33_ && i_34_ - i <= i_33_) {
						for (int i_35_ = ((Class572_Sub21) this).anInt9161; i_35_ <= ((Class572_Sub21) this).anInt9162; i_35_++) {
							if (i_35_ - i_32_ >= -i_33_ && i_35_ - i_32_ <= i_33_ && (bools[i_34_ - i + i_33_][i_35_ - i_32_ + i_33_])) {
								method8596(class340, (((Class572_Sub21) this).anInterface46_9160), (((Class572_Sub21) this).anInt9165 / 3));
								return;
							}
						}
					}
				}
			} else {
				int i_36_ = 0;
				ByteBuffer bytebuffer = (((Class572_Sub21) this).aClass106_Sub3_9172.aByteBuffer10378);
				bytebuffer.clear();
				for (int i_37_ = ((Class572_Sub21) this).anInt9161; i_37_ <= ((Class572_Sub21) this).anInt9162; i_37_++) {
					if (i_37_ - i_32_ >= -i_33_ && i_37_ - i_32_ <= i_33_) {
						int i_38_ = (i_37_ * ((((Class572_Sub21) this).aClass174_Sub1_9157.anInt2086) * -1715487093) + ((Class572_Sub21) this).anInt9159);
						for (int i_39_ = ((Class572_Sub21) this).anInt9159; i_39_ <= ((Class572_Sub21) this).anInt9163; i_39_++) {
							if (i_39_ - i >= -i_33_ && i_39_ - i <= i_33_ && (bools[i_39_ - i + i_33_][i_37_ - i_32_ + i_33_])) {
								short[] is = (((Class174_Sub1) (((Class572_Sub21) this).aClass174_Sub1_9157)).aShortArrayArray10695[i_38_]);
								if (is != null) {
									for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
										bytebuffer.putShort(is[i_40_]);
										i_36_++;
									}
								}
							}
							i_38_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_36_ != 0) {
					int i_41_ = bytebuffer.position();
					Interface46 interface46 = ((Class572_Sub21) this).aClass106_Sub3_9172.method9597(i_41_ / 2);
					interface46.method223(0, i_41_, (((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444));
					method8596(class340, interface46, i_36_ / 3);
				}
			}
		}
	}

	void method8600() {
		((Class572_Sub21) this).anInterface46_9160 = ((Class572_Sub21) this).aClass106_Sub3_9172.method9671(false);
		((Class572_Sub21) this).anInterface46_9160.method265(((Class572_Sub21) this).anInt9165);
		((Class572_Sub21) this).anInterface44_9167 = ((Class572_Sub21) this).aClass106_Sub3_9172.method9723(false);
		((Class572_Sub21) this).anInterface44_9167.method259(((Class572_Sub21) this).anInt9166 * 16, 16);
		((Class572_Sub21) this).anInterface44_9167.method223(0, ((Class572_Sub21) this).anInt9166 * 16, ((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444);
		((Class572_Sub21) this).anInterface46_9160.method223(0, ((Class572_Sub21) this).anInt9165 * 2, (((Class572_Sub21) this).aClass106_Sub3_9172.aLong10444 + (long) (((Class106_Sub3) (((Class572_Sub21) this).aClass106_Sub3_9172)).anInt10381 >> 1)));
	}

	Class572_Sub21(Class106_Sub3 class106_sub3, Class174_Sub1 class174_sub1, Class572_Sub36 class572_sub36, int[] is) {
		((Class572_Sub21) this).anInt9165 = 0;
		((Class572_Sub21) this).aClass106_Sub3_9172 = class106_sub3;
		((Class572_Sub21) this).aClass572_Sub36_9170 = class572_sub36;
		((Class572_Sub21) this).aClass174_Sub1_9157 = class174_sub1;
		int i = (((Class572_Sub21) this).aClass572_Sub36_9170.method8752((byte) 111) - (class174_sub1.anInt2087 * 2129890771 >> 1));
		((Class572_Sub21) this).anInt9159 = (((Class572_Sub21) this).aClass572_Sub36_9170.method8720(-344861318) - i >> class174_sub1.anInt2088 * 212267571);
		((Class572_Sub21) this).anInt9163 = (((Class572_Sub21) this).aClass572_Sub36_9170.method8720(-333212648) + i >> class174_sub1.anInt2088 * 212267571);
		((Class572_Sub21) this).anInt9161 = (((Class572_Sub21) this).aClass572_Sub36_9170.method8722(-992724043) - i >> class174_sub1.anInt2088 * 212267571);
		((Class572_Sub21) this).anInt9162 = (((Class572_Sub21) this).aClass572_Sub36_9170.method8722(820201667) + i >> class174_sub1.anInt2088 * 212267571);
		int i_42_ = (((Class572_Sub21) this).anInt9163 - ((Class572_Sub21) this).anInt9159 + 1);
		int i_43_ = (((Class572_Sub21) this).anInt9162 - ((Class572_Sub21) this).anInt9161 + 1);
		((Class572_Sub21) this).aFloatArrayArray9168 = new float[i_42_ + 1][i_43_ + 1];
		((Class572_Sub21) this).aFloatArrayArray9158 = new float[i_42_ + 1][i_43_ + 1];
		((Class572_Sub21) this).aFloatArrayArray9156 = new float[i_42_ + 1][i_43_ + 1];
		for (int i_44_ = 0; i_44_ <= i_43_; i_44_++) {
			int i_45_ = i_44_ + ((Class572_Sub21) this).anInt9161;
			if (i_45_ > 0 && i_45_ < (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2089) * 792439321 - 1) {
				for (int i_46_ = 0; i_46_ <= i_42_; i_46_++) {
					int i_47_ = i_46_ + ((Class572_Sub21) this).anInt9159;
					if (i_47_ > 0 && i_47_ < (((Class572_Sub21) this).aClass174_Sub1_9157.anInt2086) * -1715487093 - 1) {
						int i_48_ = (class174_sub1.method2713(i_47_ + 1, i_45_, 1891252823) - class174_sub1.method2713(i_47_ - 1, i_45_, -812679932));
						int i_49_ = (class174_sub1.method2713(i_47_, i_45_ + 1, 948433988) - class174_sub1.method2713(i_47_, i_45_ - 1, 1281779967));
						float f = (float) (1.0 / Math.sqrt((double) (i_48_ * i_48_ + 65536 + (i_49_ * i_49_))));
						((Class572_Sub21) this).aFloatArrayArray9168[i_46_][i_44_] = (float) i_48_ * f;
						((Class572_Sub21) this).aFloatArrayArray9158[i_46_][i_44_] = -256.0F * f;
						((Class572_Sub21) this).aFloatArrayArray9156[i_46_][i_44_] = (float) i_49_ * f;
					}
				}
			}
		}
		int i_50_ = 0;
		for (int i_51_ = ((Class572_Sub21) this).anInt9161; i_51_ <= ((Class572_Sub21) this).anInt9162; i_51_++) {
			if (i_51_ >= 0 && i_51_ < class174_sub1.anInt2089 * 792439321) {
				for (int i_52_ = ((Class572_Sub21) this).anInt9159; i_52_ <= ((Class572_Sub21) this).anInt9163; i_52_++) {
					if (i_52_ >= 0 && i_52_ < class174_sub1.anInt2086 * -1715487093) {
						int i_53_ = is[i_50_];
						int[] is_54_ = (((Class174_Sub1) class174_sub1).anIntArrayArrayArray10699[i_52_][i_51_]);
						if (is_54_ != null && i_53_ != 0) {
							if (i_53_ == 1) {
								for (int i_55_ = 0; i_55_ < is_54_.length; i_55_ += 3) {
									if (is_54_[i_55_] != -1 && is_54_[i_55_ + 1] != -1 && is_54_[i_55_ + 2] != -1)
										((Class572_Sub21) this).anInt9169 += 3;
								}
							} else
								((Class572_Sub21) this).anInt9169 += 3;
						}
					}
					i_50_++;
				}
			} else
				i_50_ += (((Class572_Sub21) this).anInt9163 - ((Class572_Sub21) this).anInt9159);
		}
		if (((Class572_Sub21) this).anInt9169 > 0) {
			((Class572_Sub21) this).aClass676_9171 = new Class676(HashTable.nextPowerOfTwo((((Class572_Sub21) this).anInt9169), 1370039907));
			((Class572_Sub21) this).aByteBuffer9164 = ((Class572_Sub21) this).aClass106_Sub3_9172.aByteBuffer10378;
			((Class572_Sub21) this).aByteBuffer9164.clear();
			((Class572_Sub21) this).aByteBuffer9164.position((((Class106_Sub3) ((Class572_Sub21) this).aClass106_Sub3_9172).anInt10381) >> 1);
			((Class572_Sub21) this).aByteBuffer9164.slice();
			((Class572_Sub21) this).aByteBuffer9164.position(0);
			((Class572_Sub21) this).aByteBuffer9164.limit((((Class106_Sub3) ((Class572_Sub21) this).aClass106_Sub3_9172).anInt10381) >> 1);
			int i_56_ = 0;
			i_50_ = 0;
			for (int i_57_ = ((Class572_Sub21) this).anInt9161; i_57_ <= ((Class572_Sub21) this).anInt9162; i_57_++) {
				if (i_57_ >= 0 && i_57_ < class174_sub1.anInt2089 * 792439321) {
					int i_58_ = 0;
					for (int i_59_ = ((Class572_Sub21) this).anInt9159; i_59_ <= ((Class572_Sub21) this).anInt9163; i_59_++) {
						if (i_59_ >= 0 && i_59_ < class174_sub1.anInt2086 * -1715487093) {
							int i_60_ = is[i_50_];
							int[] is_61_ = (((Class174_Sub1) class174_sub1).anIntArrayArrayArray10699[i_59_][i_57_]);
							if (is_61_ != null && i_60_ != 0) {
								if (i_60_ == 1) {
									int[] is_62_ = (((Class174_Sub1) class174_sub1).anIntArrayArrayArray10698[i_59_][i_57_]);
									int[] is_63_ = (((Class174_Sub1) class174_sub1).anIntArrayArrayArray10702[i_59_][i_57_]);
									int i_64_ = 0;
									while (i_64_ < is_61_.length) {
										if (is_61_[i_64_] != -1 && is_61_[i_64_ + 1] != -1 && is_61_[i_64_ + 2] != -1) {
											method8598(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
											method8598(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
											method8598(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
										} else
											i_64_ += 3;
									}
								} else if (i_60_ == 3) {
									method8598(i_58_, i_56_, i_59_, i_57_, 0, 0);
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), 0);
									method8598(i_58_, i_56_, i_59_, i_57_, 0, (class174_sub1.anInt2087 * 2129890771));
								} else if (i_60_ == 2) {
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), 0);
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), (class174_sub1.anInt2087 * 2129890771));
									method8598(i_58_, i_56_, i_59_, i_57_, 0, 0);
								} else if (i_60_ == 5) {
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), (class174_sub1.anInt2087 * 2129890771));
									method8598(i_58_, i_56_, i_59_, i_57_, 0, (class174_sub1.anInt2087 * 2129890771));
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), 0);
								} else if (i_60_ == 4) {
									method8598(i_58_, i_56_, i_59_, i_57_, 0, (class174_sub1.anInt2087 * 2129890771));
									method8598(i_58_, i_56_, i_59_, i_57_, 0, 0);
									method8598(i_58_, i_56_, i_59_, i_57_, (class174_sub1.anInt2087 * 2129890771), (class174_sub1.anInt2087 * 2129890771));
								}
							}
						}
						i_50_++;
						i_58_++;
					}
				} else
					i_50_ += (((Class572_Sub21) this).anInt9163 - ((Class572_Sub21) this).anInt9159);
				i_56_++;
			}
			method8597();
		} else {
			((Class572_Sub21) this).anInterface44_9167 = null;
			((Class572_Sub21) this).anInterface46_9160 = null;
		}
		((Class572_Sub21) this).aClass676_9171 = null;
		((Class572_Sub21) this).aFloatArrayArray9156 = null;
		((Class572_Sub21) this).aFloatArrayArray9158 = null;
		((Class572_Sub21) this).aFloatArrayArray9168 = null;
	}
}
