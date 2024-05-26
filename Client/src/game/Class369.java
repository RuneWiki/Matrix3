package game;

/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class369 {
	int[] anIntArray4510;
	int anInt4511;
	Class106_Sub3 aClass106_Sub3_4512;
	Class361 aClass361_4513;
	static final int anInt4514 = 128;
	int anInt4515;
	boolean aBool4516 = true;
	int anInt4517 = -1;
	int anInt4518;
	Interface46 anInterface46_4519;
	Interface43 anInterface43_4520;
	int anInt4521;
	int anInt4522;
	static final int anInt4523 = 7;
	byte[] aByteArray4524;

	void method4598() {
		if (((Class369) this).aBool4516) {
			((Class369) this).aBool4516 = false;
			byte[] is = ((Class361) ((Class369) this).aClass361_4513).aByteArray4436;
			int i = 0;
			int i_0_ = ((Class361) ((Class369) this).aClass361_4513).anInt4433;
			int i_1_ = (((Class369) this).anInt4521 + (((Class369) this).anInt4515 * (((Class361) ((Class369) this).aClass361_4513).anInt4433)));
			for (int i_2_ = -128; i_2_ < 0; i_2_++) {
				i = (i << 8) - i;
				for (int i_3_ = -128; i_3_ < 0; i_3_++) {
					if (is[i_1_++] != 0)
						i++;
				}
				i_1_ += i_0_ - 128;
			}
			if (((Class369) this).anInterface43_4520 != null && ((Class369) this).anInt4517 == i)
				((Class369) this).aBool4516 = false;
			else {
				((Class369) this).anInt4517 = i;
				int i_4_ = 0;
				i_1_ = (((Class369) this).anInt4521 + ((Class369) this).anInt4515 * i_0_);
				if (((Class369) this).aClass106_Sub3_4512.method9630(Class171.aClass171_2073, Class88.aClass88_1218)) {
					if (((Class369) this).aByteArray4524 == null)
						((Class369) this).aByteArray4524 = new byte[16384];
					byte[] is_5_ = ((Class369) this).aByteArray4524;
					for (int i_6_ = -128; i_6_ < 0; i_6_++) {
						for (int i_7_ = -128; i_7_ < 0; i_7_++) {
							if (is[i_1_] != 0)
								is_5_[i_4_++] = (byte) 68;
							else {
								int i_8_ = 0;
								if (is[i_1_ - 1] != 0)
									i_8_++;
								if (is[i_1_ + 1] != 0)
									i_8_++;
								if (is[i_1_ - i_0_] != 0)
									i_8_++;
								if (is[i_1_ + i_0_] != 0)
									i_8_++;
								is_5_[i_4_++] = (byte) (17 * i_8_);
							}
							i_1_++;
						}
						i_1_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9716(Class171.aClass171_2073, 128, 128, false, ((Class369) this).aByteArray4524));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method227(0, 0, 128, 128, ((Class369) this).aByteArray4524, Class171.aClass171_2073, 0, 128);
				} else {
					if (((Class369) this).anIntArray4510 == null)
						((Class369) this).anIntArray4510 = new int[16384];
					int[] is_9_ = ((Class369) this).anIntArray4510;
					for (int i_10_ = -128; i_10_ < 0; i_10_++) {
						for (int i_11_ = -128; i_11_ < 0; i_11_++) {
							if (is[i_1_] != 0)
								is_9_[i_4_++] = 1140850688;
							else {
								int i_12_ = 0;
								if (is[i_1_ - 1] != 0)
									i_12_++;
								if (is[i_1_ + 1] != 0)
									i_12_++;
								if (is[i_1_ - i_0_] != 0)
									i_12_++;
								if (is[i_1_ + i_0_] != 0)
									i_12_++;
								is_9_[i_4_++] = 17 * i_12_ << 24;
							}
							i_1_++;
						}
						i_1_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9711(128, 128, false, ((Class369) this).anIntArray4510));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method230(0, 0, 128, 128, ((Class369) this).anIntArray4510, 0, 128);
				}
			}
		}
	}

	void method4599(Class340 class340) {
		method4600(class340, ((Class369) this).anInterface46_4519, 0, ((Class369) this).anInt4518);
	}

	void method4600(Class340 class340, Interface46 interface46, int i, int i_13_) {
		if (i_13_ > 0) {
			method4598();
			((Class369) this).aClass106_Sub3_4512.method9693(interface46);
			class340.anInterface43_4342 = ((Class369) this).anInterface43_4520;
			class340.anInt4330 = ((Class369) this).anInt4511;
			class340.anInt4346 = (((Class369) this).anInt4522 - ((Class369) this).anInt4511 + 1);
			class340.anInt4347 = i;
			class340.anInt4348 = i_13_;
			class340.method4263(false);
		}
	}

	Class369(Class106_Sub3 class106_sub3, Class361 class361, Class174_Sub1 class174_sub1, int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		((Class369) this).aClass106_Sub3_4512 = class106_sub3;
		((Class369) this).aClass361_4513 = class361;
		((Class369) this).anInt4521 = i_16_;
		((Class369) this).anInt4515 = i_17_;
		int i_18_ = 1 << i_15_;
		int i_19_ = 0;
		int i_20_ = i << i_15_;
		int i_21_ = i_14_ << i_15_;
		for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
			int i_23_ = ((i_21_ + i_22_) * (class174_sub1.anInt2086 * -1715487093) + i_20_);
			for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
				short[] is = (((Class174_Sub1) class174_sub1).aShortArrayArray10695[i_23_++]);
				if (is != null)
					i_19_ += is.length;
			}
		}
		if (i_19_ > 0) {
			((Class369) this).anInt4522 = -2147483648;
			((Class369) this).anInt4511 = 2147483647;
			((Class369) this).anInterface46_4519 = ((Class369) this).aClass106_Sub3_4512.method9671(false);
			((Class369) this).anInterface46_4519.method265(i_19_);
			ByteBuffer bytebuffer = ((Class369) this).aClass106_Sub3_4512.aByteBuffer10378;
			bytebuffer.clear();
			for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
				int i_26_ = ((i_21_ + i_25_) * (class174_sub1.anInt2086 * -1715487093) + i_20_);
				for (int i_27_ = 0; i_27_ < i_18_; i_27_++) {
					short[] is = (((Class174_Sub1) class174_sub1).aShortArrayArray10695[i_26_++]);
					if (is != null) {
						for (int i_28_ = 0; i_28_ < is.length; i_28_++) {
							int i_29_ = is[i_28_] & 0xffff;
							if (i_29_ < ((Class369) this).anInt4511)
								((Class369) this).anInt4511 = i_29_;
							if (i_29_ > ((Class369) this).anInt4522)
								((Class369) this).anInt4522 = i_29_;
							bytebuffer.putShort((short) i_29_);
						}
					}
				}
			}
			((Class369) this).anInterface46_4519.method223(0, bytebuffer.position(), ((Class369) this).aClass106_Sub3_4512.aLong10444);
			((Class369) this).anInt4518 = i_19_ / 3;
		} else {
			((Class369) this).anInt4518 = 0;
			((Class369) this).anInterface43_4520 = null;
		}
	}

	void method4601() {
		if (((Class369) this).aBool4516) {
			((Class369) this).aBool4516 = false;
			byte[] is = ((Class361) ((Class369) this).aClass361_4513).aByteArray4436;
			int i = 0;
			int i_30_ = ((Class361) ((Class369) this).aClass361_4513).anInt4433;
			int i_31_ = (((Class369) this).anInt4521 + (((Class369) this).anInt4515 * (((Class361) ((Class369) this).aClass361_4513).anInt4433)));
			for (int i_32_ = -128; i_32_ < 0; i_32_++) {
				i = (i << 8) - i;
				for (int i_33_ = -128; i_33_ < 0; i_33_++) {
					if (is[i_31_++] != 0)
						i++;
				}
				i_31_ += i_30_ - 128;
			}
			if (((Class369) this).anInterface43_4520 != null && ((Class369) this).anInt4517 == i)
				((Class369) this).aBool4516 = false;
			else {
				((Class369) this).anInt4517 = i;
				int i_34_ = 0;
				i_31_ = (((Class369) this).anInt4521 + ((Class369) this).anInt4515 * i_30_);
				if (((Class369) this).aClass106_Sub3_4512.method9630(Class171.aClass171_2073, Class88.aClass88_1218)) {
					if (((Class369) this).aByteArray4524 == null)
						((Class369) this).aByteArray4524 = new byte[16384];
					byte[] is_35_ = ((Class369) this).aByteArray4524;
					for (int i_36_ = -128; i_36_ < 0; i_36_++) {
						for (int i_37_ = -128; i_37_ < 0; i_37_++) {
							if (is[i_31_] != 0)
								is_35_[i_34_++] = (byte) 68;
							else {
								int i_38_ = 0;
								if (is[i_31_ - 1] != 0)
									i_38_++;
								if (is[i_31_ + 1] != 0)
									i_38_++;
								if (is[i_31_ - i_30_] != 0)
									i_38_++;
								if (is[i_31_ + i_30_] != 0)
									i_38_++;
								is_35_[i_34_++] = (byte) (17 * i_38_);
							}
							i_31_++;
						}
						i_31_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9716(Class171.aClass171_2073, 128, 128, false, ((Class369) this).aByteArray4524));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method227(0, 0, 128, 128, ((Class369) this).aByteArray4524, Class171.aClass171_2073, 0, 128);
				} else {
					if (((Class369) this).anIntArray4510 == null)
						((Class369) this).anIntArray4510 = new int[16384];
					int[] is_39_ = ((Class369) this).anIntArray4510;
					for (int i_40_ = -128; i_40_ < 0; i_40_++) {
						for (int i_41_ = -128; i_41_ < 0; i_41_++) {
							if (is[i_31_] != 0)
								is_39_[i_34_++] = 1140850688;
							else {
								int i_42_ = 0;
								if (is[i_31_ - 1] != 0)
									i_42_++;
								if (is[i_31_ + 1] != 0)
									i_42_++;
								if (is[i_31_ - i_30_] != 0)
									i_42_++;
								if (is[i_31_ + i_30_] != 0)
									i_42_++;
								is_39_[i_34_++] = 17 * i_42_ << 24;
							}
							i_31_++;
						}
						i_31_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9711(128, 128, false, ((Class369) this).anIntArray4510));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method230(0, 0, 128, 128, ((Class369) this).anIntArray4510, 0, 128);
				}
			}
		}
	}

	void method4602() {
		if (((Class369) this).aBool4516) {
			((Class369) this).aBool4516 = false;
			byte[] is = ((Class361) ((Class369) this).aClass361_4513).aByteArray4436;
			int i = 0;
			int i_43_ = ((Class361) ((Class369) this).aClass361_4513).anInt4433;
			int i_44_ = (((Class369) this).anInt4521 + (((Class369) this).anInt4515 * (((Class361) ((Class369) this).aClass361_4513).anInt4433)));
			for (int i_45_ = -128; i_45_ < 0; i_45_++) {
				i = (i << 8) - i;
				for (int i_46_ = -128; i_46_ < 0; i_46_++) {
					if (is[i_44_++] != 0)
						i++;
				}
				i_44_ += i_43_ - 128;
			}
			if (((Class369) this).anInterface43_4520 != null && ((Class369) this).anInt4517 == i)
				((Class369) this).aBool4516 = false;
			else {
				((Class369) this).anInt4517 = i;
				int i_47_ = 0;
				i_44_ = (((Class369) this).anInt4521 + ((Class369) this).anInt4515 * i_43_);
				if (((Class369) this).aClass106_Sub3_4512.method9630(Class171.aClass171_2073, Class88.aClass88_1218)) {
					if (((Class369) this).aByteArray4524 == null)
						((Class369) this).aByteArray4524 = new byte[16384];
					byte[] is_48_ = ((Class369) this).aByteArray4524;
					for (int i_49_ = -128; i_49_ < 0; i_49_++) {
						for (int i_50_ = -128; i_50_ < 0; i_50_++) {
							if (is[i_44_] != 0)
								is_48_[i_47_++] = (byte) 68;
							else {
								int i_51_ = 0;
								if (is[i_44_ - 1] != 0)
									i_51_++;
								if (is[i_44_ + 1] != 0)
									i_51_++;
								if (is[i_44_ - i_43_] != 0)
									i_51_++;
								if (is[i_44_ + i_43_] != 0)
									i_51_++;
								is_48_[i_47_++] = (byte) (17 * i_51_);
							}
							i_44_++;
						}
						i_44_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9716(Class171.aClass171_2073, 128, 128, false, ((Class369) this).aByteArray4524));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method227(0, 0, 128, 128, ((Class369) this).aByteArray4524, Class171.aClass171_2073, 0, 128);
				} else {
					if (((Class369) this).anIntArray4510 == null)
						((Class369) this).anIntArray4510 = new int[16384];
					int[] is_52_ = ((Class369) this).anIntArray4510;
					for (int i_53_ = -128; i_53_ < 0; i_53_++) {
						for (int i_54_ = -128; i_54_ < 0; i_54_++) {
							if (is[i_44_] != 0)
								is_52_[i_47_++] = 1140850688;
							else {
								int i_55_ = 0;
								if (is[i_44_ - 1] != 0)
									i_55_++;
								if (is[i_44_ + 1] != 0)
									i_55_++;
								if (is[i_44_ - i_43_] != 0)
									i_55_++;
								if (is[i_44_ + i_43_] != 0)
									i_55_++;
								is_52_[i_47_++] = 17 * i_55_ << 24;
							}
							i_44_++;
						}
						i_44_ += (((Class361) ((Class369) this).aClass361_4513).anInt4433) - 128;
					}
					if (((Class369) this).anInterface43_4520 == null) {
						((Class369) this).anInterface43_4520 = (((Class369) this).aClass106_Sub3_4512.method9711(128, 128, false, ((Class369) this).anIntArray4510));
						((Class369) this).anInterface43_4520.method253(false, false);
					} else
						((Class369) this).anInterface43_4520.method230(0, 0, 128, 128, ((Class369) this).anIntArray4510, 0, 128);
				}
			}
		}
	}
}
