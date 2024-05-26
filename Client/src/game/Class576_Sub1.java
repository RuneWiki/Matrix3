package game;

/* Class576_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class576_Sub1 extends Class576 {
	int[] anIntArray8928 = new int[512];
	static float[][] aFloatArrayArray8929 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F },
		{ 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	public Class576_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_0_ = 0; i_0_ < 256; i_0_++)
			((Class576_Sub1) this).anIntArray8928[i_0_] = ((Class576_Sub1) this).anIntArray8928[i_0_ + 256] = i_0_;
		for (int i_1_ = 0; i_1_ < 256; i_1_++) {
			int i_2_ = random.nextInt() & 0xff;
			int i_3_ = ((Class576_Sub1) this).anIntArray8928[i_2_];
			((Class576_Sub1) this).anIntArray8928[i_2_] = ((Class576_Sub1) this).anIntArray8928[i_2_ + 256] = ((Class576_Sub1) this).anIntArray8928[i_1_];
			((Class576_Sub1) this).anIntArray8928[i_1_] = ((Class576_Sub1) this).anIntArray8928[i_1_ + 256] = i_3_;
		}
	}

	static final float method8183(float f, float f_4_, float f_5_) {
		return f + (f_4_ - f) * f_5_;
	}

	static final float method8184(int i, float f, float f_6_, float f_7_) {
		float[] fs = aFloatArrayArray8929[i];
		return fs[0] * f + fs[1] * f_6_ + fs[2] * f_7_;
	}

	void method6829(int i, int i_8_, int i_9_, int i_10_, float f, float f_11_, float f_12_, float f_13_, float[] fs, int i_14_) {
		int i_15_ = (int) ((float) i_8_ * f - 1.0F);
		i_15_ &= 0xff;
		int i_16_ = (int) ((float) i_9_ * f_11_ - 1.0F);
		i_16_ &= 0xff;
		int i_17_ = (int) ((float) i_10_ * f_12_ - 1.0F);
		i_17_ &= 0xff;
		float f_18_ = (float) i * f_12_;
		int i_19_ = (int) f_18_;
		int i_20_ = i_19_ + 1;
		float f_21_ = f_18_ - (float) i_19_;
		float f_22_ = 1.0F - f_21_;
		float f_23_ = method8188(f_21_);
		i_19_ &= i_17_;
		i_20_ &= i_17_;
		int i_24_ = ((Class576_Sub1) this).anIntArray8928[i_19_];
		int i_25_ = ((Class576_Sub1) this).anIntArray8928[i_20_];
		for (int i_26_ = 0; i_26_ < i_9_; i_26_++) {
			float f_27_ = (float) i_26_ * f_11_;
			int i_28_ = (int) f_27_;
			int i_29_ = i_28_ + 1;
			float f_30_ = f_27_ - (float) i_28_;
			float f_31_ = 1.0F - f_30_;
			float f_32_ = method8188(f_30_);
			i_28_ &= i_16_;
			i_29_ &= i_16_;
			int i_33_ = ((Class576_Sub1) this).anIntArray8928[i_28_ + i_24_];
			int i_34_ = ((Class576_Sub1) this).anIntArray8928[i_29_ + i_24_];
			int i_35_ = ((Class576_Sub1) this).anIntArray8928[i_28_ + i_25_];
			int i_36_ = ((Class576_Sub1) this).anIntArray8928[i_29_ + i_25_];
			for (int i_37_ = 0; i_37_ < i_8_; i_37_++) {
				float f_38_ = (float) i_37_ * f;
				int i_39_ = (int) f_38_;
				int i_40_ = i_39_ + 1;
				float f_41_ = f_38_ - (float) i_39_;
				float f_42_ = 1.0F - f_41_;
				float f_43_ = method8188(f_41_);
				i_39_ &= i_15_;
				i_40_ &= i_15_;
				fs[i_14_++] = (f_13_ * (method8183((method8183(method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_39_ + i_33_]) & 0x7, f_42_, f_31_, f_22_), method8184((((Class576_Sub1) this).anIntArray8928[i_40_ + i_33_]) & 0x7, f_41_, f_31_, f_22_), f_43_), method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_39_ + i_34_]) & 0x7, f_42_, f_30_, f_22_), method8184((((Class576_Sub1) this).anIntArray8928[i_40_ + i_34_]) & 0x7, f_41_, f_30_, f_22_), f_43_), f_32_)), (method8183(method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_39_ + i_35_]) & 0x7, f_42_, f_31_, f_21_), method8184((((Class576_Sub1) this).anIntArray8928[i_40_ + i_35_]) & 0x7, f_41_, f_31_, f_21_), f_43_), method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_39_ + i_36_]) & 0x7, f_42_, f_30_, f_21_), method8184((((Class576_Sub1) this).anIntArray8928[i_40_ + i_36_]) & 0x7, f_41_, f_30_, f_21_), f_43_), f_32_)), f_23_)));
			}
		}
	}

	static final float method8185(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method8186(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method8187(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method8188(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	void method6830(int i, int i_44_, int i_45_, int i_46_, float f, float f_47_, float f_48_, float f_49_, float[] fs, int i_50_) {
		int i_51_ = (int) ((float) i_44_ * f - 1.0F);
		i_51_ &= 0xff;
		int i_52_ = (int) ((float) i_45_ * f_47_ - 1.0F);
		i_52_ &= 0xff;
		int i_53_ = (int) ((float) i_46_ * f_48_ - 1.0F);
		i_53_ &= 0xff;
		float f_54_ = (float) i * f_48_;
		int i_55_ = (int) f_54_;
		int i_56_ = i_55_ + 1;
		float f_57_ = f_54_ - (float) i_55_;
		float f_58_ = 1.0F - f_57_;
		float f_59_ = method8188(f_57_);
		i_55_ &= i_53_;
		i_56_ &= i_53_;
		int i_60_ = ((Class576_Sub1) this).anIntArray8928[i_55_];
		int i_61_ = ((Class576_Sub1) this).anIntArray8928[i_56_];
		for (int i_62_ = 0; i_62_ < i_45_; i_62_++) {
			float f_63_ = (float) i_62_ * f_47_;
			int i_64_ = (int) f_63_;
			int i_65_ = i_64_ + 1;
			float f_66_ = f_63_ - (float) i_64_;
			float f_67_ = 1.0F - f_66_;
			float f_68_ = method8188(f_66_);
			i_64_ &= i_52_;
			i_65_ &= i_52_;
			int i_69_ = ((Class576_Sub1) this).anIntArray8928[i_64_ + i_60_];
			int i_70_ = ((Class576_Sub1) this).anIntArray8928[i_65_ + i_60_];
			int i_71_ = ((Class576_Sub1) this).anIntArray8928[i_64_ + i_61_];
			int i_72_ = ((Class576_Sub1) this).anIntArray8928[i_65_ + i_61_];
			for (int i_73_ = 0; i_73_ < i_44_; i_73_++) {
				float f_74_ = (float) i_73_ * f;
				int i_75_ = (int) f_74_;
				int i_76_ = i_75_ + 1;
				float f_77_ = f_74_ - (float) i_75_;
				float f_78_ = 1.0F - f_77_;
				float f_79_ = method8188(f_77_);
				i_75_ &= i_51_;
				i_76_ &= i_51_;
				fs[i_50_++] = (f_49_ * (method8183((method8183(method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_75_ + i_69_]) & 0x7, f_78_, f_67_, f_58_), method8184((((Class576_Sub1) this).anIntArray8928[i_76_ + i_69_]) & 0x7, f_77_, f_67_, f_58_), f_79_), method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_75_ + i_70_]) & 0x7, f_78_, f_66_, f_58_), method8184((((Class576_Sub1) this).anIntArray8928[i_76_ + i_70_]) & 0x7, f_77_, f_66_, f_58_), f_79_), f_68_)), (method8183(method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_75_ + i_71_]) & 0x7, f_78_, f_67_, f_57_), method8184((((Class576_Sub1) this).anIntArray8928[i_76_ + i_71_]) & 0x7, f_77_, f_67_, f_57_), f_79_), method8183(method8184((((Class576_Sub1) this).anIntArray8928[i_75_ + i_72_]) & 0x7, f_78_, f_66_, f_57_), method8184((((Class576_Sub1) this).anIntArray8928[i_76_ + i_72_]) & 0x7, f_77_, f_66_, f_57_), f_79_), f_68_)), f_59_)));
			}
		}
	}
}
