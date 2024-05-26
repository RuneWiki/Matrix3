package game;

/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class290 {
	Class362 aClass362_3427;
	Class352 aClass352_3428 = Class352.aClass352_4399;
	Class352 aClass352_3429;
	Class106_Sub3 aClass106_Sub3_3430;
	int anInt3431 = 128;
	float[] aFloatArray3432;
	Interface43[] anInterface43Array3433;
	int anInt3434 = 0;
	int anInt3435;
	int[] anIntArray3436;
	int[] anIntArray3437;
	Interface46 anInterface46_3438;
	Interface44 anInterface44_3439;

	void method3922(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_, Interface43 interface43, int i) {
		if ((i & ~0xffffff) != 0) {
			((Class290) this).aClass106_Sub3_3430.method1718(((Class290) this).anIntArray3437);
			int i_7_ = ((Class290) this).anIntArray3437[0];
			int i_8_ = ((Class290) this).anIntArray3437[1];
			int i_9_ = ((Class290) this).anIntArray3437[2];
			int i_10_ = ((Class290) this).anIntArray3437[3];
			if (!(f > (float) i_9_) && !(f_0_ > (float) i_10_) && !(f_1_ < (float) i_7_) && !(f_2_ < (float) i_8_)) {
				float f_11_ = f_1_ - f;
				float f_12_ = f_2_ - f_0_;
				float f_13_ = f_5_ - f_3_;
				float f_14_ = f_6_ - f_4_;
				if (f < (float) i_7_) {
					f_3_ += ((float) i_7_ - f) / f_11_ * f_13_;
					f = (float) i_7_;
				}
				if (f_0_ < (float) i_8_) {
					f_4_ += ((float) i_8_ - f_0_) / f_12_ * f_14_;
					f_0_ = (float) i_8_;
				}
				if (f_1_ > (float) i_9_) {
					f_5_ -= (f_1_ - (float) i_9_) / f_11_ * f_13_;
					f_1_ = (float) i_9_;
				}
				if (f_2_ > (float) i_10_) {
					f_6_ -= (f_2_ - (float) i_10_) / f_12_ * f_14_;
					f_2_ = (float) i_10_;
				}
				method3927();
				f = method3928(f);
				f_0_ = method3929(f_0_);
				f_1_ = method3928(f_1_);
				f_2_ = method3929(f_2_);
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 0] = f;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 1] = f_0_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 2] = f_3_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 3] = f_4_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 4] = f_1_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 5] = f_0_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 6] = f_5_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 7] = f_4_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 8] = f;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 9] = f_2_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 10] = f_3_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 11] = f_6_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 12] = f_1_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 13] = f_2_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 14] = f_5_;
				((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 15] = f_6_;
				((Class290) this).anInterface43Array3433[(((Class290) this).anInt3434)] = interface43;
				if ((((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).anInt10477) == 1)
					((Class290) this).anIntArray3436[(((Class290) this).anInt3434)] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					((Class290) this).anIntArray3436[(((Class290) this).anInt3434)] = i;
				((Class290) this).anInt3434++;
				if (((Class290) this).aClass352_3428 == Class352.aClass352_4398)
					method3925();
			}
		}
	}

	void method3923() {
		((Class290) this).anInterface44_3439.method39();
		((Class290) this).anInterface46_3438.method39();
		((Class290) this).anInterface44_3439 = null;
		((Class290) this).anInterface46_3438 = null;
		((Class290) this).aClass362_3427 = null;
		((Class290) this).anInt3434 = 0;
	}

	void method3924() {
		if (((Class290) this).anInt3434 == ((Class290) this).anInt3431) {
			((Class290) this).anInt3431 *= 2;
			float[] fs = new float[((Class290) this).anInt3431 * 16];
			for (int i = 0; i < ((Class290) this).anInt3434 * 16; i++)
				fs[i] = ((Class290) this).aFloatArray3432[i];
			((Class290) this).aFloatArray3432 = fs;
			Interface43[] interface43s = new Interface43[((Class290) this).anInt3431];
			int[] is = new int[((Class290) this).anInt3431];
			for (int i = 0; i < ((Class290) this).anInt3434; i++) {
				interface43s[i] = ((Class290) this).anInterface43Array3433[i];
				is[i] = ((Class290) this).anIntArray3436[i];
			}
			((Class290) this).anInterface43Array3433 = interface43s;
			((Class290) this).anIntArray3436 = is;
		}
	}

	void method3925() {
		if (((Class290) this).anInt3434 != 0) {
			((Class290) this).aClass106_Sub3_3430.method9684();
			((Class290) this).aClass106_Sub3_3430.method9591(1);
			((Class290) this).aClass106_Sub3_3430.method9693(((Class290) this).anInterface46_3438);
			((Class290) this).aClass106_Sub3_3430.method9674(0, ((Class290) this).anInterface44_3439);
			((Class290) this).aClass106_Sub3_3430.method9673(((Class290) this).aClass362_3427);
			Class335 class335 = (((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).aClass335_10482);
			Unsafe unsafe = ((Class290) this).aClass106_Sub3_3430.anUnsafe10377;
			ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
			bytebuffer.clear();
			((Class290) this).aClass106_Sub3_3430.method9651().method3442(Class250.aClass250_2727);
			((Class290) this).aClass106_Sub3_3430.method9628(Class295.aClass295_3460);
			int i = ((((Class290) this).anInt3434 + ((Class290) this).anInt3435 - 1) / ((Class290) this).anInt3435);
			int i_15_ = 0;
			int i_16_ = 0;
			for (int i_17_ = 0; i_17_ < i; i_17_++) {
				int i_18_ = Math.min(((Class290) this).anInt3435, ((Class290) this).anInt3434 - i_15_);
				long l = ((Class290) this).anInterface44_3439.method219(0, i_18_ * 96);
				int i_19_ = i_17_ * ((Class290) this).anInt3435 + i_18_;
				for (int i_20_ = i_15_; i_20_ < i_19_; i_20_++) {
					for (int i_21_ = 0; i_21_ < 4; i_21_++) {
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_16_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_16_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_16_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_16_++]));
						l += 4L;
						unsafe.putInt(l, ((Class290) this).anIntArray3436[i_20_]);
						l += 4L;
					}
				}
				((Class290) this).anInterface44_3439.method110();
				Interface43 interface43 = ((Class290) this).anInterface43Array3433[i_15_];
				int i_22_ = 1;
				int i_23_ = 0;
				for (int i_24_ = i_15_ + 1; i_24_ < i_19_; i_24_++) {
					if (interface43 == ((Class290) this).anInterface43Array3433[i_24_])
						i_22_++;
					else {
						class335.anInterface43_4289 = interface43;
						class335.method4226();
						((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_23_ * 4, i_22_ * 4, i_23_ * 6, i_22_ * 2);
						interface43 = ((Class290) this).anInterface43Array3433[i_24_];
						i_22_ = 1;
						i_23_ = i_24_ - i_15_;
					}
				}
				class335.anInterface43_4289 = interface43;
				class335.method4226();
				((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_23_ * 4, i_22_ * 4, i_23_ * 6, i_22_ * 2);
				i_15_ += ((Class290) this).anInt3435;
			}
			((Class290) this).anInt3434 = 0;
		}
	}

	void method3926(float f, float f_25_, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_, float f_39_, Interface43 interface43, int i) {
		if ((i & ~0xffffff) != 0) {
			((Class290) this).aClass106_Sub3_3430.method1718(((Class290) this).anIntArray3437);
			int i_40_ = ((Class290) this).anIntArray3437[0];
			int i_41_ = ((Class290) this).anIntArray3437[1];
			int i_42_ = ((Class290) this).anIntArray3437[2];
			int i_43_ = ((Class290) this).anIntArray3437[3];
			int i_44_ = 0;
			int i_45_ = ((f < (float) i_40_ ? 1 : 0) + (f_26_ < (float) i_40_ ? 1 : 0) + (f_28_ < (float) i_40_ ? 1 : 0) + (f_30_ < (float) i_40_ ? 1 : 0));
			if (i_45_ != 4) {
				i_44_ |= i_45_;
				i_45_ = ((f > (float) i_42_ ? 1 : 0) + (f_26_ > (float) i_42_ ? 1 : 0) + (f_28_ > (float) i_42_ ? 1 : 0) + (f_30_ > (float) i_42_ ? 1 : 0));
				if (i_45_ != 4) {
					i_44_ |= i_45_;
					i_45_ = ((f_25_ < (float) i_41_ ? 1 : 0) + (f_27_ < (float) i_41_ ? 1 : 0) + (f_29_ < (float) i_41_ ? 1 : 0) + (f_31_ < (float) i_41_ ? 1 : 0));
					if (i_45_ != 4) {
						i_44_ |= i_45_;
						i_45_ = ((f_25_ > (float) i_43_ ? 1 : 0) + (f_27_ > (float) i_43_ ? 1 : 0) + (f_29_ > (float) i_43_ ? 1 : 0) + (f_31_ > (float) i_43_ ? 1 : 0));
						if (i_45_ != 4) {
							i_44_ |= i_45_;
							if (i_44_ != 0) {
								method3925();
								((Class290) this).aClass106_Sub3_3430.method1717(true);
								((Class290) this).aClass106_Sub3_3430.method1715(i_40_, i_41_, i_42_, i_43_);
							}
							method3927();
							f = method3928(f);
							f_25_ = method3929(f_25_);
							f_26_ = method3928(f_26_);
							f_27_ = method3929(f_27_);
							f_28_ = method3928(f_28_);
							f_29_ = method3929(f_29_);
							f_30_ = method3928(f_30_);
							f_31_ = method3929(f_31_);
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 0] = f;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 1] = f_25_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 2] = f_32_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 3] = f_33_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 4] = f_26_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 5] = f_27_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 6] = f_34_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 7] = f_35_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 8] = f_28_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 9] = f_29_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 10] = f_36_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 11] = f_37_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 12] = f_30_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 13] = f_31_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 14] = f_38_;
							((Class290) this).aFloatArray3432[((Class290) this).anInt3434 * 16 + 15] = f_39_;
							((Class290) this).anInterface43Array3433[((Class290) this).anInt3434] = interface43;
							if ((((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).anInt10477) == 1)
								((Class290) this).anIntArray3436[((Class290) this).anInt3434] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								((Class290) this).anIntArray3436[((Class290) this).anInt3434] = i;
							((Class290) this).anInt3434++;
							if ((((Class290) this).aClass352_3428 == Class352.aClass352_4398) || i_44_ > 0)
								method3925();
							if (i_44_ != 0) {
								((Class290) this).aClass106_Sub3_3430.method1717(false);
								((Class290) this).aClass106_Sub3_3430.method1714();
								((Class290) this).aClass106_Sub3_3430.method1715(i_40_, i_41_, i_42_, i_43_);
							}
						}
					}
				}
			}
		}
	}

	void method3927() {
		if (((Class290) this).anInt3434 == ((Class290) this).anInt3431) {
			((Class290) this).anInt3431 *= 2;
			float[] fs = new float[((Class290) this).anInt3431 * 16];
			for (int i = 0; i < ((Class290) this).anInt3434 * 16; i++)
				fs[i] = ((Class290) this).aFloatArray3432[i];
			((Class290) this).aFloatArray3432 = fs;
			Interface43[] interface43s = new Interface43[((Class290) this).anInt3431];
			int[] is = new int[((Class290) this).anInt3431];
			for (int i = 0; i < ((Class290) this).anInt3434; i++) {
				interface43s[i] = ((Class290) this).anInterface43Array3433[i];
				is[i] = ((Class290) this).anIntArray3436[i];
			}
			((Class290) this).anInterface43Array3433 = interface43s;
			((Class290) this).anIntArray3436 = is;
		}
	}

	float method3928(float f) {
		int i = ((Class290) this).aClass106_Sub3_3430.method1683(-589780211).method1648();
		float f_46_ = ((f + ((Class290) this).aClass106_Sub3_3430.method9590()) / (float) i * 2.0F) - 1.0F;
		return f_46_;
	}

	float method3929(float f) {
		int i = ((Class290) this).aClass106_Sub3_3430.method1683(-154739083).method1646();
		float f_47_ = (1.0F - ((f + ((Class290) this).aClass106_Sub3_3430.method9590()) / (float) i)) * 2.0F - 1.0F;
		return f_47_;
	}

	void method3930() {
		((Class290) this).anInterface44_3439.method39();
		((Class290) this).anInterface46_3438.method39();
		((Class290) this).anInterface44_3439 = null;
		((Class290) this).anInterface46_3438 = null;
		((Class290) this).aClass362_3427 = null;
		((Class290) this).anInt3434 = 0;
	}

	void method3931() {
		if (((Class290) this).aClass352_3429 != null) {
			((Class290) this).aClass352_3428 = ((Class290) this).aClass352_3429;
			((Class290) this).aClass352_3429 = null;
		}
	}

	Class352 method3932() {
		return ((Class290) this).aClass352_3428;
	}

	Class290(Class106_Sub3 class106_sub3, int i) {
		((Class290) this).aFloatArray3432 = new float[((Class290) this).anInt3431 * 16];
		((Class290) this).anInterface43Array3433 = new Interface43[((Class290) this).anInt3431];
		((Class290) this).anIntArray3436 = new int[((Class290) this).anInt3431];
		((Class290) this).anIntArray3437 = new int[4];
		((Class290) this).aClass106_Sub3_3430 = class106_sub3;
		((Class290) this).anInterface44_3439 = ((Class290) this).aClass106_Sub3_3430.method9723(true);
		((Class290) this).anInterface44_3439.method259(i * 96, 24);
		((Class290) this).aClass362_3427 = (((Class290) this).aClass106_Sub3_3430.method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482,
			Class364.aClass364_4468 }) }));
		((Class290) this).anInterface46_3438 = ((Class290) this).aClass106_Sub3_3430.method9671(false);
		int i_48_ = i * 6;
		((Class290) this).anInterface46_3438.method265(i_48_);
		ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
		bytebuffer.clear();
		for (int i_49_ = 0; i_49_ < i; i_49_++) {
			bytebuffer.putShort((short) (i_49_ * 4));
			bytebuffer.putShort((short) (i_49_ * 4 + 2));
			bytebuffer.putShort((short) (i_49_ * 4 + 1));
			bytebuffer.putShort((short) (i_49_ * 4 + 2));
			bytebuffer.putShort((short) (i_49_ * 4 + 3));
			bytebuffer.putShort((short) (i_49_ * 4 + 1));
		}
		((Class290) this).anInterface46_3438.method223(0, (i_48_ * (((Class290) this).anInterface46_3438.method263().anInt1223 * -1071269501)), ((Class290) this).aClass106_Sub3_3430.aLong10444);
		((Class290) this).anInt3435 = i;
		((Class290) this).anInt3434 = 0;
	}

	void method3933() {
		if (((Class290) this).anInt3434 != 0) {
			((Class290) this).aClass106_Sub3_3430.method9684();
			((Class290) this).aClass106_Sub3_3430.method9591(1);
			((Class290) this).aClass106_Sub3_3430.method9693(((Class290) this).anInterface46_3438);
			((Class290) this).aClass106_Sub3_3430.method9674(0, ((Class290) this).anInterface44_3439);
			((Class290) this).aClass106_Sub3_3430.method9673(((Class290) this).aClass362_3427);
			Class335 class335 = (((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).aClass335_10482);
			Unsafe unsafe = ((Class290) this).aClass106_Sub3_3430.anUnsafe10377;
			ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
			bytebuffer.clear();
			((Class290) this).aClass106_Sub3_3430.method9651().method3442(Class250.aClass250_2727);
			((Class290) this).aClass106_Sub3_3430.method9628(Class295.aClass295_3460);
			int i = ((((Class290) this).anInt3434 + ((Class290) this).anInt3435 - 1) / ((Class290) this).anInt3435);
			int i_50_ = 0;
			int i_51_ = 0;
			for (int i_52_ = 0; i_52_ < i; i_52_++) {
				int i_53_ = Math.min(((Class290) this).anInt3435, ((Class290) this).anInt3434 - i_50_);
				long l = ((Class290) this).anInterface44_3439.method219(0, i_53_ * 96);
				int i_54_ = i_52_ * ((Class290) this).anInt3435 + i_53_;
				for (int i_55_ = i_50_; i_55_ < i_54_; i_55_++) {
					for (int i_56_ = 0; i_56_ < 4; i_56_++) {
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_51_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_51_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_51_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_51_++]));
						l += 4L;
						unsafe.putInt(l, ((Class290) this).anIntArray3436[i_55_]);
						l += 4L;
					}
				}
				((Class290) this).anInterface44_3439.method110();
				Interface43 interface43 = ((Class290) this).anInterface43Array3433[i_50_];
				int i_57_ = 1;
				int i_58_ = 0;
				for (int i_59_ = i_50_ + 1; i_59_ < i_54_; i_59_++) {
					if (interface43 == ((Class290) this).anInterface43Array3433[i_59_])
						i_57_++;
					else {
						class335.anInterface43_4289 = interface43;
						class335.method4226();
						((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_58_ * 4, i_57_ * 4, i_58_ * 6, i_57_ * 2);
						interface43 = ((Class290) this).anInterface43Array3433[i_59_];
						i_57_ = 1;
						i_58_ = i_59_ - i_50_;
					}
				}
				class335.anInterface43_4289 = interface43;
				class335.method4226();
				((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_58_ * 4, i_57_ * 4, i_58_ * 6, i_57_ * 2);
				i_50_ += ((Class290) this).anInt3435;
			}
			((Class290) this).anInt3434 = 0;
		}
	}

	void method3934() {
		((Class290) this).aClass352_3429 = ((Class290) this).aClass352_3428;
		((Class290) this).aClass352_3428 = Class352.aClass352_4397;
	}

	void method3935() {
		if (((Class290) this).anInt3434 != 0) {
			((Class290) this).aClass106_Sub3_3430.method9684();
			((Class290) this).aClass106_Sub3_3430.method9591(1);
			((Class290) this).aClass106_Sub3_3430.method9693(((Class290) this).anInterface46_3438);
			((Class290) this).aClass106_Sub3_3430.method9674(0, ((Class290) this).anInterface44_3439);
			((Class290) this).aClass106_Sub3_3430.method9673(((Class290) this).aClass362_3427);
			Class335 class335 = (((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).aClass335_10482);
			Unsafe unsafe = ((Class290) this).aClass106_Sub3_3430.anUnsafe10377;
			ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
			bytebuffer.clear();
			((Class290) this).aClass106_Sub3_3430.method9651().method3442(Class250.aClass250_2727);
			((Class290) this).aClass106_Sub3_3430.method9628(Class295.aClass295_3460);
			int i = ((((Class290) this).anInt3434 + ((Class290) this).anInt3435 - 1) / ((Class290) this).anInt3435);
			int i_60_ = 0;
			int i_61_ = 0;
			for (int i_62_ = 0; i_62_ < i; i_62_++) {
				int i_63_ = Math.min(((Class290) this).anInt3435, ((Class290) this).anInt3434 - i_60_);
				long l = ((Class290) this).anInterface44_3439.method219(0, i_63_ * 96);
				int i_64_ = i_62_ * ((Class290) this).anInt3435 + i_63_;
				for (int i_65_ = i_60_; i_65_ < i_64_; i_65_++) {
					for (int i_66_ = 0; i_66_ < 4; i_66_++) {
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_61_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_61_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_61_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_61_++]));
						l += 4L;
						unsafe.putInt(l, ((Class290) this).anIntArray3436[i_65_]);
						l += 4L;
					}
				}
				((Class290) this).anInterface44_3439.method110();
				Interface43 interface43 = ((Class290) this).anInterface43Array3433[i_60_];
				int i_67_ = 1;
				int i_68_ = 0;
				for (int i_69_ = i_60_ + 1; i_69_ < i_64_; i_69_++) {
					if (interface43 == ((Class290) this).anInterface43Array3433[i_69_])
						i_67_++;
					else {
						class335.anInterface43_4289 = interface43;
						class335.method4226();
						((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_68_ * 4, i_67_ * 4, i_68_ * 6, i_67_ * 2);
						interface43 = ((Class290) this).anInterface43Array3433[i_69_];
						i_67_ = 1;
						i_68_ = i_69_ - i_60_;
					}
				}
				class335.anInterface43_4289 = interface43;
				class335.method4226();
				((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_68_ * 4, i_67_ * 4, i_68_ * 6, i_67_ * 2);
				i_60_ += ((Class290) this).anInt3435;
			}
			((Class290) this).anInt3434 = 0;
		}
	}

	void method3936() {
		if (((Class290) this).anInt3434 != 0) {
			((Class290) this).aClass106_Sub3_3430.method9684();
			((Class290) this).aClass106_Sub3_3430.method9591(1);
			((Class290) this).aClass106_Sub3_3430.method9693(((Class290) this).anInterface46_3438);
			((Class290) this).aClass106_Sub3_3430.method9674(0, ((Class290) this).anInterface44_3439);
			((Class290) this).aClass106_Sub3_3430.method9673(((Class290) this).aClass362_3427);
			Class335 class335 = (((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).aClass335_10482);
			Unsafe unsafe = ((Class290) this).aClass106_Sub3_3430.anUnsafe10377;
			ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
			bytebuffer.clear();
			((Class290) this).aClass106_Sub3_3430.method9651().method3442(Class250.aClass250_2727);
			((Class290) this).aClass106_Sub3_3430.method9628(Class295.aClass295_3460);
			int i = ((((Class290) this).anInt3434 + ((Class290) this).anInt3435 - 1) / ((Class290) this).anInt3435);
			int i_70_ = 0;
			int i_71_ = 0;
			for (int i_72_ = 0; i_72_ < i; i_72_++) {
				int i_73_ = Math.min(((Class290) this).anInt3435, ((Class290) this).anInt3434 - i_70_);
				long l = ((Class290) this).anInterface44_3439.method219(0, i_73_ * 96);
				int i_74_ = i_72_ * ((Class290) this).anInt3435 + i_73_;
				for (int i_75_ = i_70_; i_75_ < i_74_; i_75_++) {
					for (int i_76_ = 0; i_76_ < 4; i_76_++) {
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_71_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_71_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_71_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_71_++]));
						l += 4L;
						unsafe.putInt(l, ((Class290) this).anIntArray3436[i_75_]);
						l += 4L;
					}
				}
				((Class290) this).anInterface44_3439.method110();
				Interface43 interface43 = ((Class290) this).anInterface43Array3433[i_70_];
				int i_77_ = 1;
				int i_78_ = 0;
				for (int i_79_ = i_70_ + 1; i_79_ < i_74_; i_79_++) {
					if (interface43 == ((Class290) this).anInterface43Array3433[i_79_])
						i_77_++;
					else {
						class335.anInterface43_4289 = interface43;
						class335.method4226();
						((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_78_ * 4, i_77_ * 4, i_78_ * 6, i_77_ * 2);
						interface43 = ((Class290) this).anInterface43Array3433[i_79_];
						i_77_ = 1;
						i_78_ = i_79_ - i_70_;
					}
				}
				class335.anInterface43_4289 = interface43;
				class335.method4226();
				((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_78_ * 4, i_77_ * 4, i_78_ * 6, i_77_ * 2);
				i_70_ += ((Class290) this).anInt3435;
			}
			((Class290) this).anInt3434 = 0;
		}
	}

	void method3937() {
		if (((Class290) this).anInt3434 == ((Class290) this).anInt3431) {
			((Class290) this).anInt3431 *= 2;
			float[] fs = new float[((Class290) this).anInt3431 * 16];
			for (int i = 0; i < ((Class290) this).anInt3434 * 16; i++)
				fs[i] = ((Class290) this).aFloatArray3432[i];
			((Class290) this).aFloatArray3432 = fs;
			Interface43[] interface43s = new Interface43[((Class290) this).anInt3431];
			int[] is = new int[((Class290) this).anInt3431];
			for (int i = 0; i < ((Class290) this).anInt3434; i++) {
				interface43s[i] = ((Class290) this).anInterface43Array3433[i];
				is[i] = ((Class290) this).anIntArray3436[i];
			}
			((Class290) this).anInterface43Array3433 = interface43s;
			((Class290) this).anIntArray3436 = is;
		}
	}

	void method3938() {
		if (((Class290) this).anInt3434 != 0) {
			((Class290) this).aClass106_Sub3_3430.method9684();
			((Class290) this).aClass106_Sub3_3430.method9591(1);
			((Class290) this).aClass106_Sub3_3430.method9693(((Class290) this).anInterface46_3438);
			((Class290) this).aClass106_Sub3_3430.method9674(0, ((Class290) this).anInterface44_3439);
			((Class290) this).aClass106_Sub3_3430.method9673(((Class290) this).aClass362_3427);
			Class335 class335 = (((Class106_Sub3) ((Class290) this).aClass106_Sub3_3430).aClass335_10482);
			Unsafe unsafe = ((Class290) this).aClass106_Sub3_3430.anUnsafe10377;
			ByteBuffer bytebuffer = ((Class290) this).aClass106_Sub3_3430.aByteBuffer10378;
			bytebuffer.clear();
			((Class290) this).aClass106_Sub3_3430.method9651().method3442(Class250.aClass250_2727);
			((Class290) this).aClass106_Sub3_3430.method9628(Class295.aClass295_3460);
			int i = ((((Class290) this).anInt3434 + ((Class290) this).anInt3435 - 1) / ((Class290) this).anInt3435);
			int i_80_ = 0;
			int i_81_ = 0;
			for (int i_82_ = 0; i_82_ < i; i_82_++) {
				int i_83_ = Math.min(((Class290) this).anInt3435, ((Class290) this).anInt3434 - i_80_);
				long l = ((Class290) this).anInterface44_3439.method219(0, i_83_ * 96);
				int i_84_ = i_82_ * ((Class290) this).anInt3435 + i_83_;
				for (int i_85_ = i_80_; i_85_ < i_84_; i_85_++) {
					for (int i_86_ = 0; i_86_ < 4; i_86_++) {
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_81_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_81_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_81_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class290) this).aFloatArray3432[i_81_++]));
						l += 4L;
						unsafe.putInt(l, ((Class290) this).anIntArray3436[i_85_]);
						l += 4L;
					}
				}
				((Class290) this).anInterface44_3439.method110();
				Interface43 interface43 = ((Class290) this).anInterface43Array3433[i_80_];
				int i_87_ = 1;
				int i_88_ = 0;
				for (int i_89_ = i_80_ + 1; i_89_ < i_84_; i_89_++) {
					if (interface43 == ((Class290) this).anInterface43Array3433[i_89_])
						i_87_++;
					else {
						class335.anInterface43_4289 = interface43;
						class335.method4226();
						((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_88_ * 4, i_87_ * 4, i_88_ * 6, i_87_ * 2);
						interface43 = ((Class290) this).anInterface43Array3433[i_89_];
						i_87_ = 1;
						i_88_ = i_89_ - i_80_;
					}
				}
				class335.anInterface43_4289 = interface43;
				class335.method4226();
				((Class290) this).aClass106_Sub3_3430.method9682(((Class290) this).anInterface46_3438, Class379.aClass379_4588, i_88_ * 4, i_87_ * 4, i_88_ * 6, i_87_ * 2);
				i_80_ += ((Class290) this).anInt3435;
			}
			((Class290) this).anInt3434 = 0;
		}
	}

	void method3939() {
		if (((Class290) this).anInt3434 == ((Class290) this).anInt3431) {
			((Class290) this).anInt3431 *= 2;
			float[] fs = new float[((Class290) this).anInt3431 * 16];
			for (int i = 0; i < ((Class290) this).anInt3434 * 16; i++)
				fs[i] = ((Class290) this).aFloatArray3432[i];
			((Class290) this).aFloatArray3432 = fs;
			Interface43[] interface43s = new Interface43[((Class290) this).anInt3431];
			int[] is = new int[((Class290) this).anInt3431];
			for (int i = 0; i < ((Class290) this).anInt3434; i++) {
				interface43s[i] = ((Class290) this).anInterface43Array3433[i];
				is[i] = ((Class290) this).anIntArray3436[i];
			}
			((Class290) this).anInterface43Array3433 = interface43s;
			((Class290) this).anIntArray3436 = is;
		}
	}

	float method3940(float f) {
		int i = ((Class290) this).aClass106_Sub3_3430.method1683(71544476).method1648();
		float f_90_ = ((f + ((Class290) this).aClass106_Sub3_3430.method9590()) / (float) i * 2.0F) - 1.0F;
		return f_90_;
	}

	void method3941() {
		if (((Class290) this).aClass352_3429 != null) {
			((Class290) this).aClass352_3428 = ((Class290) this).aClass352_3429;
			((Class290) this).aClass352_3429 = null;
		}
	}

	void method3942() {
		if (((Class290) this).aClass352_3429 != null) {
			((Class290) this).aClass352_3428 = ((Class290) this).aClass352_3429;
			((Class290) this).aClass352_3429 = null;
		}
	}
}
