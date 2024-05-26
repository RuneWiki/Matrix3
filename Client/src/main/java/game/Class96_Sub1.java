package game;

/* Class96_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub1 extends Class96 {
	Class106_Sub1 aClass106_Sub1_10729;
	Class155 aClass155_10730;

	Class96_Sub1(Class106_Sub1 class106_sub1, int[] is) {
		((Class96_Sub1) this).aClass106_Sub1_10729 = class106_sub1;
		if (((Class106_Sub1) ((Class96_Sub1) this).aClass106_Sub1_10729).aBool10166) {
			byte[] is_0_ = method9995(is);
			((Class96_Sub1) this).aClass155_10730 = new Class155_Sub1(((Class96_Sub1) this).aClass106_Sub1_10729, Class171.aClass171_2071, Class88.aClass88_1218, 16, 16, 16, is_0_, Class171.aClass171_2071);
		} else
			((Class96_Sub1) this).aClass155_10730 = new Class155_Sub4(((Class96_Sub1) this).aClass106_Sub1_10729, 3553, 256, 16, false, is, 256, 0, false);
	}

	byte[] method9995(int[] is) {
		byte[] is_1_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_2_ = 0; i_2_ < 16; i_2_++) {
				for (int i_3_ = 0; i_3_ < 16; i_3_++) {
					int i_4_ = is[256 * i_2_ + 16 * i_3_ + i];
					int i_5_ = (i_3_ * 256 + i_2_ * 16 + i) * 4;
					is_1_[i_5_ + 0] = (byte) (i_4_ >> 16 & 0xff);
					is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
					is_1_[i_5_ + 2] = (byte) (i_4_ & 0xff);
					is_1_[i_5_ + 3] = (byte) -1;
				}
			}
		}
		return is_1_;
	}

	Class155 method9996() {
		return ((Class96_Sub1) this).aClass155_10730;
	}
}
