package game;

/* Class167_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class167_Sub2 extends Class167 {
	Class155_Sub4_Sub1 aClass155_Sub4_Sub1_10916;

	static Class167_Sub2 method10049(Class106_Sub1 class106_sub1, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class167_Sub2(class106_sub1, i, i_0_, is_2_);
	}

	Class167_Sub2(Class106_Sub1 class106_sub1, int i, int i_6_, byte[] is) {
		((Class167_Sub2) this).aClass155_Sub4_Sub1_10916 = Class155_Sub4_Sub1.method10178(class106_sub1, Class171.aClass171_2073, Class88.aClass88_1218, i, i_6_, false, is, Class171.aClass171_2073);
		((Class167_Sub2) this).aClass155_Sub4_Sub1_10916.method9195(false, false);
	}
}
