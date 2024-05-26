package game;

/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class337 {
	public Interface40 anInterface40_4308;
	static final int anInt4309 = 128;
	public boolean aBool4310;
	static Object anObject4311;
	Class106_Sub3 aClass106_Sub3_4312;
	Interface43[] anInterface43Array4313 = null;
	Interface40 anInterface40_4314 = null;
	static final int anInt4315 = 128;
	public static final int anInt4316 = 16;
	public Interface40 anInterface40_4317;
	static Object anObject4318;
	public Interface43[] anInterface43Array4319 = null;
	static Object anObject4320;

	public boolean method4241() {
		return (aBool4310 ? ((Class337) this).anInterface40_4314 != null : ((Class337) this).anInterface43Array4313 != null);
	}

	Class337(Class106_Sub3 class106_sub3) {
		anInterface40_4308 = null;
		anInterface40_4317 = null;
		((Class337) this).aClass106_Sub3_4312 = class106_sub3;
		aBool4310 = ((Class337) this).aClass106_Sub3_4312.aBool10524;
		if (aBool4310 && !((Class337) this).aClass106_Sub3_4312.aBool10525)
			aBool4310 = false;
		if (aBool4310 && !(((Class337) this).aClass106_Sub3_4312.method9631(Class171.aClass171_2067, Class88.aClass88_1218)))
			aBool4310 = false;
		if (aBool4310 || (((Class337) this).aClass106_Sub3_4312.method9630(Class171.aClass171_2067, Class88.aClass88_1218))) {
			method4246();
			if (!aBool4310) {
				((Class337) this).anInterface43Array4313 = new Interface43[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class413.method5082(anObject4318, i * 32768, 32768, -738012309);
					((Class337) this).anInterface43Array4313[i] = (((Class337) this).aClass106_Sub3_4312.method9716(Class171.aClass171_2067, 128, 128, true, is));
				}
				anInterface43Array4319 = new Interface43[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class413.method5082(anObject4311, i * 32768, 32768, -1748512857);
					anInterface43Array4319[i] = (((Class337) this).aClass106_Sub3_4312.method9716(Class171.aClass171_2067, 128, 128, true, is));
				}
			} else {
				byte[] is = MusicVolume.method2201(anObject4318, false, -1539626034);
				((Class337) this).anInterface40_4314 = (((Class337) this).aClass106_Sub3_4312.method9638(Class171.aClass171_2067, 128, 128, 16, true, is));
				is = MusicVolume.method2201(anObject4311, false, -1539626034);
				anInterface40_4308 = (((Class337) this).aClass106_Sub3_4312.method9638(Class171.aClass171_2067, 128, 128, 16, true, is));
			}
		}
	}

	public boolean method4242() {
		return (aBool4310 ? ((Class337) this).anInterface40_4314 != null : ((Class337) this).anInterface43Array4313 != null);
	}

	public boolean method4243() {
		if (!((Class337) this).aClass106_Sub3_4312.aBool10524)
			return false;
		if (anInterface40_4317 == null) {
			if (anObject4320 == null) {
				byte[] is = Class559.method6604(128, 128, 16, 8, new Class576_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject4320 = Class286.method3866(is, false, (short) -18367);
			}
			byte[] is = MusicVolume.method2201(anObject4320, false, -1539626034);
			byte[] is_0_ = new byte[is.length * 4];
			int i = 0;
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int i_2_ = i_1_ * 16384;
				int i_3_ = i_2_;
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (float) ((is[i_6_ + i_8_] & 0xff) - (is[i_7_ + i_8_] & 0xff));
						float f_9_ = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (is[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff));
						float f_10_ = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_ + 16384.0F + f * f)));
						is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
						is_0_[i++] = is[i_2_++];
					}
				}
			}
			anInterface40_4317 = (((Class337) this).aClass106_Sub3_4312.method9638(Class171.aClass171_2071, 128, 128, 16, true, is_0_));
		}
		return anInterface40_4317 != null;
	}

	static void method4244() {
		if (anObject4318 == null) {
			Class331_Sub1_Sub2 class331_sub1_sub2 = new Class331_Sub1_Sub2();
			byte[] is = class331_sub1_sub2.method10282(128, 128, 16);
			anObject4318 = Class286.method3866(is, false, (short) -6383);
		}
		if (anObject4311 == null) {
			Class331_Sub2_Sub2 class331_sub2_sub2 = new Class331_Sub2_Sub2();
			byte[] is = class331_sub2_sub2.method10150(128, 128, 16);
			anObject4311 = Class286.method3866(is, false, (short) -22551);
		}
	}

	public boolean method4245() {
		return (aBool4310 ? ((Class337) this).anInterface40_4314 != null : ((Class337) this).anInterface43Array4313 != null);
	}

	static void method4246() {
		if (anObject4318 == null) {
			Class331_Sub1_Sub2 class331_sub1_sub2 = new Class331_Sub1_Sub2();
			byte[] is = class331_sub1_sub2.method10282(128, 128, 16);
			anObject4318 = Class286.method3866(is, false, (short) -11451);
		}
		if (anObject4311 == null) {
			Class331_Sub2_Sub2 class331_sub2_sub2 = new Class331_Sub2_Sub2();
			byte[] is = class331_sub2_sub2.method10150(128, 128, 16);
			anObject4311 = Class286.method3866(is, false, (short) -15190);
		}
	}

	public boolean method4247() {
		return (aBool4310 ? ((Class337) this).anInterface40_4314 != null : ((Class337) this).anInterface43Array4313 != null);
	}

	public boolean method4248() {
		if (!((Class337) this).aClass106_Sub3_4312.aBool10524)
			return false;
		if (anInterface40_4317 == null) {
			if (anObject4320 == null) {
				byte[] is = Class559.method6604(128, 128, 16, 8, new Class576_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject4320 = Class286.method3866(is, false, (short) -24528);
			}
			byte[] is = MusicVolume.method2201(anObject4320, false, -1539626034);
			byte[] is_11_ = new byte[is.length * 4];
			int i = 0;
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				int i_13_ = i_12_ * 16384;
				int i_14_ = i_13_;
				for (int i_15_ = 0; i_15_ < 128; i_15_++) {
					int i_16_ = i_14_ + i_15_ * 128;
					int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
					int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
					for (int i_19_ = 0; i_19_ < 128; i_19_++) {
						float f = (float) ((is[i_17_ + i_19_] & 0xff) - (is[i_18_ + i_19_] & 0xff));
						float f_20_ = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff) - (is[i_16_ + (i_19_ + 1 & 0x7f)] & 0xff));
						float f_21_ = (float) (128.0 / Math.sqrt((double) (f_20_ * f_20_ + 16384.0F + f * f)));
						is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
						is_11_[i++] = is[i_13_++];
					}
				}
			}
			anInterface40_4317 = (((Class337) this).aClass106_Sub3_4312.method9638(Class171.aClass171_2071, 128, 128, 16, true, is_11_));
		}
		return anInterface40_4317 != null;
	}
}
