package game;

/* Class96_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub2 extends Class96 {
	Class106_Sub3 aClass106_Sub3_10731;
	Interface34 anInterface34_10732;

	byte[] method9997(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					if (((Class106_Sub3) ((Class96_Sub2) this).aClass106_Sub3_10731).anInt10477 == 0) {
						is_0_[i_4_ + 0] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					} else {
						is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_0_;
	}

	Class96_Sub2(Class106_Sub3 class106_sub3, int[] is) {
		((Class96_Sub2) this).aClass106_Sub3_10731 = class106_sub3;
		if (((Class96_Sub2) this).aClass106_Sub3_10731.aBool10524) {
			byte[] is_5_ = method9997(is);
			((Class96_Sub2) this).anInterface34_10732 = (((Class96_Sub2) this).aClass106_Sub3_10731.method9638(Class171.aClass171_2071, 16, 16, 16, false, is_5_));
		} else
			((Class96_Sub2) this).anInterface34_10732 = ((Class96_Sub2) this).aClass106_Sub3_10731.method9711(256, 16, false, is);
	}

	public Interface34 method9998() {
		return ((Class96_Sub2) this).anInterface34_10732;
	}
}
