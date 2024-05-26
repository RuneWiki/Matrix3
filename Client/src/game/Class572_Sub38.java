package game;

/* Class572_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub38 extends Class572 {
	int anInt9384;
	int anInt9385;
	boolean aBool9386;
	int anInt9387;
	int[] anIntArray9388;
	static int[] anIntArray9389;

	Class572_Sub38(int i, int i_0_, int i_1_, int[] is, boolean bool) {
		((Class572_Sub38) this).anInt9387 = i;
		((Class572_Sub38) this).anInt9385 = i_1_;
		((Class572_Sub38) this).anIntArray9388 = is;
		if (bool) {
			int[] is_2_ = new int[((Class572_Sub38) this).anInt9385];
			int[] is_3_ = new int[((Class572_Sub38) this).anInt9385];
			int[] is_4_ = new int[((Class572_Sub38) this).anInt9385];
			int[] is_5_ = new int[((Class572_Sub38) this).anInt9385];
			if (anIntArray9389 == null || (anIntArray9389.length != ((Class572_Sub38) this).anIntArray9388.length))
				anIntArray9389 = new int[((Class572_Sub38) this).anIntArray9388.length];
			int i_6_ = ((Class572_Sub38) this).anInt9385;
			int i_7_ = ((Class572_Sub38) this).anInt9385;
			int i_8_ = i_6_ - 1;
			int i_9_ = i_7_ - 1;
			int i_10_ = i_6_ * i_7_;
			int i_12_;
			int i_11_ = i_12_ = 1 * i_6_;
			for (int i_13_ = 2; i_13_ >= 0; i_13_--) {
				for (int i_14_ = i_8_; i_14_ >= 0; i_14_--) {
					int i_15_ = ((Class572_Sub38) this).anIntArray9388[--i_12_];
					is_2_[i_14_] += i_15_ >> 24 & 0xff;
					is_3_[i_14_] += i_15_ >> 16 & 0xff;
					is_4_[i_14_] += i_15_ >> 8 & 0xff;
					is_5_[i_14_] += i_15_ & 0xff;
				}
				if (i_12_ == 0)
					i_12_ = i_10_;
			}
			int i_16_ = i_10_;
			for (int i_17_ = i_9_; i_17_ >= 0; i_17_--) {
				int i_18_ = 1;
				int i_19_ = 1;
				int i_20_ = 0;
				int i_21_ = 0;
				int i_22_ = 0;
				int i_23_ = 0;
				for (int i_24_ = 2; i_24_ >= 0; i_24_--) {
					i_19_--;
					i_23_ += is_2_[i_19_];
					i_22_ += is_3_[i_19_];
					i_20_ += is_4_[i_19_];
					i_21_ += is_5_[i_19_];
					if (i_19_ == 0)
						i_19_ = i_6_;
				}
				for (int i_25_ = i_8_; i_25_ >= 0; i_25_--) {
					i_19_--;
					i_18_--;
					int i_26_ = i_23_ / 9;
					int i_27_ = i_22_ / 9;
					int i_28_ = i_20_ / 9;
					int i_29_ = i_21_ / 9;
					anIntArray9389[--i_16_] = i_26_ << 24 | i_27_ << 16 | i_28_ << 8 | i_29_;
					i_23_ += is_2_[i_19_] - is_2_[i_18_];
					i_22_ += is_3_[i_19_] - is_3_[i_18_];
					i_21_ += is_5_[i_19_] - is_5_[i_18_];
					i_20_ += is_4_[i_19_] - is_4_[i_18_];
					if (i_19_ == 0)
						i_19_ = i_6_;
					if (i_18_ == 0)
						i_18_ = i_6_;
				}
				for (int i_30_ = i_8_; i_30_ >= 0; i_30_--) {
					int i_31_ = ((Class572_Sub38) this).anIntArray9388[--i_12_];
					int i_32_ = ((Class572_Sub38) this).anIntArray9388[--i_11_];
					is_2_[i_30_] += (i_31_ >> 24 & 0xff) - (i_32_ >> 24 & 0xff);
					is_3_[i_30_] += (i_31_ >> 16 & 0xff) - (i_32_ >> 16 & 0xff);
					is_4_[i_30_] += (i_31_ >> 8 & 0xff) - (i_32_ >> 8 & 0xff);
					is_5_[i_30_] += (i_31_ & 0xff) - (i_32_ & 0xff);
				}
				if (i_12_ == 0)
					i_12_ = i_10_;
				if (i_11_ == 0)
					i_11_ = i_10_;
			}
			int[] is_33_ = ((Class572_Sub38) this).anIntArray9388;
			((Class572_Sub38) this).anIntArray9388 = anIntArray9389;
			anIntArray9389 = is_33_;
		}
	}

	void method8764(int i, int i_34_) {
		if (i != 0 || i_34_ != 0) {
			if (anIntArray9389 == null || (anIntArray9389.length != ((Class572_Sub38) this).anIntArray9388.length))
				anIntArray9389 = new int[((Class572_Sub38) this).anIntArray9388.length];
			int i_35_ = ((Class572_Sub38) this).anIntArray9388.length;
			int i_36_ = i;
			int i_37_ = ((Class572_Sub38) this).anInt9385 - 1;
			int i_38_ = ((Class572_Sub38) this).anInt9385 * i_34_;
			int i_39_ = i_35_ - 1;
			for (int i_40_ = 0; i_40_ < i_35_; i_40_ += ((Class572_Sub38) this).anInt9385) {
				int i_41_ = i_40_ + i_38_ & i_39_;
				for (int i_42_ = 0; i_42_ < ((Class572_Sub38) this).anInt9385; i_42_++) {
					int i_43_ = i_40_ + i_42_;
					int i_44_ = i_41_ + (i_42_ + i_36_ & i_37_);
					anIntArray9389[i_43_] = ((Class572_Sub38) this).anIntArray9388[i_44_];
				}
			}
			int[] is = ((Class572_Sub38) this).anIntArray9388;
			((Class572_Sub38) this).anIntArray9388 = anIntArray9389;
			anIntArray9389 = is;
		}
	}

	int[] method8765() {
		return ((Class572_Sub38) this).anIntArray9388;
	}
}
