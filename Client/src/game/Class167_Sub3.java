package game;

/* Class167_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class167_Sub3 extends Class167 {
	Interface43 anInterface43_10964;

	static Class167_Sub3 method10061(Class106_Sub3 class106_sub3, int i, int i_0_, int[] is, int[] is_1_) {
		if (class106_sub3.method9630(Class171.aClass171_2073, Class88.aClass88_1218)) {
			byte[] is_2_ = new byte[i * i_0_];
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
				int i_4_ = i_3_ * i + is[i_3_];
				for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
					is_2_[i_4_++] = (byte) -1;
			}
			return new Class167_Sub3(class106_sub3, i, i_0_, is_2_);
		}
		int[] is_6_ = new int[i * i_0_];
		for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
			int i_8_ = i_7_ * i + is[i_7_];
			for (int i_9_ = 0; i_9_ < is_1_[i_7_]; i_9_++)
				is_6_[i_8_++] = -16777216;
		}
		return new Class167_Sub3(class106_sub3, i, i_0_, is_6_);
	}

	Class167_Sub3(Class106_Sub3 class106_sub3, int i, int i_10_, byte[] is) {
		((Class167_Sub3) this).anInterface43_10964 = class106_sub3.method9716(Class171.aClass171_2073, i, i_10_, false, is);
		((Class167_Sub3) this).anInterface43_10964.method253(false, false);
	}

	Class167_Sub3(Class106_Sub3 class106_sub3, int i, int i_11_, int[] is) {
		((Class167_Sub3) this).anInterface43_10964 = class106_sub3.method9711(i, i_11_, false, is);
		((Class167_Sub3) this).anInterface43_10964.method253(false, false);
	}
}
