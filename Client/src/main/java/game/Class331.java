package game;

/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class331 {
	static final int anInt4242 = 4096;
	short[] aShortArray4243 = new short[512];
	static final int anInt4244 = 4095;
	int anInt4245 = 0;
	static final int anInt4246 = 12;
	int anInt4247;
	int anInt4248 = 4;
	int anInt4249 = 4;
	int anInt4250 = 4;
	short[] aShortArray4251;
	public static int[] anIntArray4252 = new int[4096];

	abstract void method4159();

	void method4160(int i, int i_0_, int i_1_) {
		int[] is = new int[i];
		int[] is_2_ = new int[i_0_];
		int[] is_3_ = new int[i_1_];
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			is[i_4_] = (i_4_ << 12) / i;
		for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
			is_2_[i_5_] = (i_5_ << 12) / i_0_;
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
			is_3_[i_6_] = (i_6_ << 12) / i_1_;
		method4159();
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
			for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
				for (int i_9_ = 0; i_9_ < i; i_9_++) {
					for (int i_10_ = 0; i_10_ < ((Class331) this).anInt4247; i_10_++) {
						int i_11_ = ((Class331) this).aShortArray4251[i_10_] << 12;
						int i_12_ = ((Class331) this).anInt4248 * i_11_ >> 12;
						int i_13_ = ((Class331) this).anInt4249 * i_11_ >> 12;
						int i_14_ = ((Class331) this).anInt4250 * i_11_ >> 12;
						int i_15_ = is[i_9_] * i_11_ >> 12;
						int i_16_ = is_2_[i_8_] * i_11_ >> 12;
						int i_17_ = is_3_[i_7_] * i_11_ >> 12;
						i_15_ *= ((Class331) this).anInt4248;
						i_16_ *= ((Class331) this).anInt4249;
						i_17_ *= ((Class331) this).anInt4250;
						int i_18_ = i_15_ >> 12;
						int i_19_ = i_18_ + 1;
						i_18_ &= 0xff;
						int i_20_ = i_16_ >> 12;
						int i_21_ = i_20_ + 1;
						i_20_ &= 0xff;
						int i_22_ = i_17_ >> 12;
						int i_23_ = i_22_ + 1;
						i_22_ &= 0xff;
						if (i_19_ >= i_12_)
							i_19_ = 0;
						else
							i_19_ &= 0xff;
						if (i_21_ >= i_13_)
							i_21_ = 0;
						else
							i_21_ &= 0xff;
						if (i_23_ >= i_14_)
							i_23_ = 0;
						else
							i_23_ &= 0xff;
						i_15_ &= 0xfff;
						i_16_ &= 0xfff;
						i_17_ &= 0xfff;
						int i_24_ = anIntArray4252[i_15_];
						int i_25_ = anIntArray4252[i_16_];
						int i_26_ = anIntArray4252[i_17_];
						int i_27_ = i_15_ - 4096;
						int i_28_ = i_16_ - 4096;
						int i_29_ = i_17_ - 4096;
						int i_30_ = ((Class331) this).aShortArray4243[i_22_];
						int i_31_ = ((Class331) this).aShortArray4243[i_23_];
						int i_32_ = ((Class331) this).aShortArray4243[i_20_ + i_30_];
						int i_33_ = ((Class331) this).aShortArray4243[i_21_ + i_30_];
						int i_34_ = ((Class331) this).aShortArray4243[i_20_ + i_31_];
						int i_35_ = ((Class331) this).aShortArray4243[i_21_ + i_31_];
						int i_36_ = method4164((((Class331) this).aShortArray4243[i_18_ + i_32_]), i_15_, i_16_, i_17_);
						int i_37_ = method4164((((Class331) this).aShortArray4243[i_19_ + i_32_]), i_27_, i_16_, i_17_);
						int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method4164((((Class331) this).aShortArray4243[i_18_ + i_33_]), i_15_, i_28_, i_17_);
						i_37_ = method4164((((Class331) this).aShortArray4243[i_19_ + i_33_]), i_27_, i_28_, i_17_);
						int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						i_36_ = method4164((((Class331) this).aShortArray4243[i_18_ + i_34_]), i_15_, i_16_, i_29_);
						i_37_ = method4164((((Class331) this).aShortArray4243[i_19_ + i_34_]), i_27_, i_16_, i_29_);
						i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method4164((((Class331) this).aShortArray4243[i_18_ + i_35_]), i_15_, i_28_, i_29_);
						i_37_ = method4164((((Class331) this).aShortArray4243[i_19_ + i_35_]), i_27_, i_28_, i_29_);
						i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						method4163(i_10_, i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
					}
					method4172();
				}
			}
		}
	}

	abstract void method4161(int i, int i_42_);

	static final int method4162(int i) {
		int i_43_ = i * (i * i >> 12) >> 12;
		int i_44_ = i * 6 - 61440;
		int i_45_ = 40960 + (i_44_ * i >> 12);
		return i_45_ * i_43_ >> 12;
	}

	abstract void method4163(int i, int i_46_);

	Class331(int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		((Class331) this).anInt4247 = 4;
		((Class331) this).anInt4245 = i;
		((Class331) this).anInt4248 = i_48_;
		((Class331) this).anInt4249 = i_49_;
		((Class331) this).anInt4250 = i_50_;
		((Class331) this).anInt4247 = i_47_;
		method4165();
		method4166();
	}

	static int method4164(int i, int i_51_, int i_52_, int i_53_) {
		int i_54_ = i & 0xf;
		int i_55_ = i_54_ < 8 ? i_51_ : i_52_;
		int i_56_ = i_54_ < 4 ? i_52_ : i_54_ == 12 || i_54_ == 14 ? i_51_ : i_53_;
		return (((i_54_ & 0x1) == 0 ? i_55_ : -i_55_) + ((i_54_ & 0x2) == 0 ? i_56_ : -i_56_));
	}

	void method4165() {
		((Class331) this).aShortArray4251 = new short[((Class331) this).anInt4247];
		for (int i = 0; i < ((Class331) this).anInt4247; i++)
			((Class331) this).aShortArray4251[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method4166() {
		Random random = new Random((long) ((Class331) this).anInt4245);
		for (int i = 0; i < 255; i++)
			((Class331) this).aShortArray4243[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_57_ = 255 - i;
			int i_58_ = Class628.method7503(random, i_57_, -1867444782);
			short i_59_ = ((Class331) this).aShortArray4243[i_58_];
			((Class331) this).aShortArray4243[i_58_] = ((Class331) this).aShortArray4243[i_57_];
			((Class331) this).aShortArray4243[i_57_] = ((Class331) this).aShortArray4243[i_57_ + 256] = i_59_;
		}
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray4252[i] = method4162(i);
	}

	abstract void method4167();

	abstract void method4168();

	abstract void method4169(int i, int i_60_);

	void method4170() {
		((Class331) this).aShortArray4251 = new short[((Class331) this).anInt4247];
		for (int i = 0; i < ((Class331) this).anInt4247; i++)
			((Class331) this).aShortArray4251[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method4171(int i, int i_61_);

	abstract void method4172();

	void method4173() {
		Random random = new Random((long) ((Class331) this).anInt4245);
		for (int i = 0; i < 255; i++)
			((Class331) this).aShortArray4243[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_62_ = 255 - i;
			int i_63_ = Class628.method7503(random, i_62_, 1668015351);
			short i_64_ = ((Class331) this).aShortArray4243[i_63_];
			((Class331) this).aShortArray4243[i_63_] = ((Class331) this).aShortArray4243[i_62_];
			((Class331) this).aShortArray4243[i_62_] = ((Class331) this).aShortArray4243[i_62_ + 256] = i_64_;
		}
	}

	void method4174() {
		((Class331) this).aShortArray4251 = new short[((Class331) this).anInt4247];
		for (int i = 0; i < ((Class331) this).anInt4247; i++)
			((Class331) this).aShortArray4251[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method4175() {
		Random random = new Random((long) ((Class331) this).anInt4245);
		for (int i = 0; i < 255; i++)
			((Class331) this).aShortArray4243[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_65_ = 255 - i;
			int i_66_ = Class628.method7503(random, i_65_, 755511064);
			short i_67_ = ((Class331) this).aShortArray4243[i_66_];
			((Class331) this).aShortArray4243[i_66_] = ((Class331) this).aShortArray4243[i_65_];
			((Class331) this).aShortArray4243[i_65_] = ((Class331) this).aShortArray4243[i_65_ + 256] = i_67_;
		}
	}

	abstract void method4176();

	static final int method4177(int i) {
		int i_68_ = i * (i * i >> 12) >> 12;
		int i_69_ = i * 6 - 61440;
		int i_70_ = 40960 + (i_69_ * i >> 12);
		return i_70_ * i_68_ >> 12;
	}

	abstract void method4178();
}
