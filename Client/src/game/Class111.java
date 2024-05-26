package game;

/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class111 implements Interface70 {
	Class54 this$0;
	static Interface49[] anInterface49Array1427;
	public static Class244 aClass244_1428;

	public void method432(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1479787382);
		float f_0_ = class603.method7112(1404008282);
		Class240 class240_1_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) 18));
		float f_2_ = 0.0F;
		float f_3_ = class240_1_.method3301();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		int i = 8192;
		float f_5_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_6_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_1_.aFloat2653 != 0.0F || 0.0F != class240_1_.aFloat2657) {
				int i_7_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_6_)) - (int) (Math.atan2((double) class240_1_.aFloat2653, (double) class240_1_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_7_ > 8192)
					i_7_ = 16384 - i_7_;
				int i_8_;
				if (f_3_ <= 0.0F)
					i_8_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_8_ = 16384;
				else
					i_8_ = (int) (8192.0F * f_3_ / 4096.0F + 8192.0F);
				i = i_8_ * i_7_ / 8192 + (16384 - i_8_ >> 1);
			}
			f_5_ = (float) i * 6.1035156E-5F;
		} else {
			if (0.0F != class240_1_.aFloat2653 || class240_1_.aFloat2657 != 0.0F) {
				int i_9_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_1_.aFloat2653, (double) class240_1_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_9_ > 8192)
					i_9_ = 16384 - i_9_;
				int i_10_;
				if (f_3_ <= 0.0F)
					i_10_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_10_ = 16384;
				else
					i_10_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
				i = i_9_ * i_10_ / 8192 + (16384 - i_10_ >> 1);
			}
			f_5_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_2_ : ((double) f_2_ * Math.sqrt((double) (2.0F * (1.0F - f_5_)))));
		fs[1] = (float) (i < 0 ? (double) -f_2_ : (double) f_2_ * Math.sqrt((double) (f_5_ * 2.0F)));
	}

	public void method433(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1776616814);
		float f_11_ = class603.method7112(1779852808);
		Class240 class240_12_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) 97));
		float f_13_ = 0.0F;
		float f_14_ = class240_12_.method3301();
		if (f_14_ >= f_11_)
			f_13_ = 0.0F;
		if (f_14_ <= f)
			f_13_ = 1.0F;
		else {
			float f_15_ = 1.0F - (f_14_ - f) * (1.0F / (f_11_ - f));
			if ((double) f_15_ < 0.0 || (double) f_15_ > 1.0)
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
			f_13_ = f_15_;
		}
		int i = 8192;
		float f_16_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_17_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_12_.aFloat2653 != 0.0F || 0.0F != class240_12_.aFloat2657) {
				int i_18_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_17_)) - (int) (Math.atan2((double) class240_12_.aFloat2653, (double) class240_12_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_18_ > 8192)
					i_18_ = 16384 - i_18_;
				int i_19_;
				if (f_14_ <= 0.0F)
					i_19_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_19_ = 16384;
				else
					i_19_ = (int) (8192.0F * f_14_ / 4096.0F + 8192.0F);
				i = i_19_ * i_18_ / 8192 + (16384 - i_19_ >> 1);
			}
			f_16_ = (float) i * 6.1035156E-5F;
		} else {
			if (0.0F != class240_12_.aFloat2653 || class240_12_.aFloat2657 != 0.0F) {
				int i_20_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_12_.aFloat2653, (double) class240_12_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_20_ > 8192)
					i_20_ = 16384 - i_20_;
				int i_21_;
				if (f_14_ <= 0.0F)
					i_21_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_21_ = 16384;
				else
					i_21_ = (int) (8192.0F + 8192.0F * f_14_ / 4096.0F);
				i = i_20_ * i_21_ / 8192 + (16384 - i_21_ >> 1);
			}
			f_16_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_13_ : ((double) f_13_ * Math.sqrt((double) (2.0F * (1.0F - f_16_)))));
		fs[1] = (float) (i < 0 ? (double) -f_13_ : (double) f_13_ * Math.sqrt((double) (f_16_ * 2.0F)));
	}

	public void method431(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1639516502);
		float f_22_ = class603.method7112(1907273127);
		Class240 class240_23_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) -1));
		float f_24_ = 0.0F;
		float f_25_ = class240_23_.method3301();
		if (f_25_ >= f_22_)
			f_24_ = 0.0F;
		if (f_25_ <= f)
			f_24_ = 1.0F;
		else {
			float f_26_ = 1.0F - (f_25_ - f) * (1.0F / (f_22_ - f));
			if ((double) f_26_ < 0.0 || (double) f_26_ > 1.0)
				f_26_ = Math.min(Math.max(f_26_, 0.0F), 1.0F);
			f_24_ = f_26_;
		}
		int i = 8192;
		float f_27_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_28_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_23_.aFloat2653 != 0.0F || 0.0F != class240_23_.aFloat2657) {
				int i_29_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_28_)) - (int) (Math.atan2((double) class240_23_.aFloat2653, (double) class240_23_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_29_ > 8192)
					i_29_ = 16384 - i_29_;
				int i_30_;
				if (f_25_ <= 0.0F)
					i_30_ = 8192;
				else if (f_25_ >= 4096.0F)
					i_30_ = 16384;
				else
					i_30_ = (int) (8192.0F * f_25_ / 4096.0F + 8192.0F);
				i = i_30_ * i_29_ / 8192 + (16384 - i_30_ >> 1);
			}
			f_27_ = (float) i * 6.1035156E-5F;
		} else {
			if (0.0F != class240_23_.aFloat2653 || class240_23_.aFloat2657 != 0.0F) {
				int i_31_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_23_.aFloat2653, (double) class240_23_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_31_ > 8192)
					i_31_ = 16384 - i_31_;
				int i_32_;
				if (f_25_ <= 0.0F)
					i_32_ = 8192;
				else if (f_25_ >= 4096.0F)
					i_32_ = 16384;
				else
					i_32_ = (int) (8192.0F + 8192.0F * f_25_ / 4096.0F);
				i = i_31_ * i_32_ / 8192 + (16384 - i_32_ >> 1);
			}
			f_27_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_24_ : ((double) f_24_ * Math.sqrt((double) (2.0F * (1.0F - f_27_)))));
		fs[1] = (float) (i < 0 ? (double) -f_24_ : (double) f_24_ * Math.sqrt((double) (f_27_ * 2.0F)));
	}

	public void method430(Object object, float[] fs, Object[] objects, int i) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1555109671);
		float f_33_ = class603.method7112(1646936066);
		Class240 class240_34_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) 15));
		float f_35_ = 0.0F;
		float f_36_ = class240_34_.method3301();
		if (f_36_ >= f_33_)
			f_35_ = 0.0F;
		if (f_36_ <= f)
			f_35_ = 1.0F;
		else {
			float f_37_ = 1.0F - (f_36_ - f) * (1.0F / (f_33_ - f));
			if ((double) f_37_ < 0.0 || (double) f_37_ > 1.0)
				f_37_ = Math.min(Math.max(f_37_, 0.0F), 1.0F);
			f_35_ = f_37_;
		}
		int i_38_ = 8192;
		float f_39_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_40_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_34_.aFloat2653 != 0.0F || 0.0F != class240_34_.aFloat2657) {
				int i_41_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_40_)) - (int) (Math.atan2((double) class240_34_.aFloat2653, (double) class240_34_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_41_ > 8192)
					i_41_ = 16384 - i_41_;
				int i_42_;
				if (f_36_ <= 0.0F)
					i_42_ = 8192;
				else if (f_36_ >= 4096.0F)
					i_42_ = 16384;
				else
					i_42_ = (int) (8192.0F * f_36_ / 4096.0F + 8192.0F);
				i_38_ = i_42_ * i_41_ / 8192 + (16384 - i_42_ >> 1);
			}
			f_39_ = (float) i_38_ * 6.1035156E-5F;
		} else {
			if (0.0F != class240_34_.aFloat2653 || class240_34_.aFloat2657 != 0.0F) {
				int i_43_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_34_.aFloat2653, (double) class240_34_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_43_ > 8192)
					i_43_ = 16384 - i_43_;
				int i_44_;
				if (f_36_ <= 0.0F)
					i_44_ = 8192;
				else if (f_36_ >= 4096.0F)
					i_44_ = 16384;
				else
					i_44_ = (int) (8192.0F + 8192.0F * f_36_ / 4096.0F);
				i_38_ = i_43_ * i_44_ / 8192 + (16384 - i_44_ >> 1);
			}
			f_39_ = (float) i_38_ * 6.1035156E-5F;
		}
		fs[0] = (float) (i_38_ < 0 ? (double) f_35_ : ((double) f_35_ * Math.sqrt((double) (2.0F * (1.0F - f_39_)))));
		fs[1] = (float) (i_38_ < 0 ? (double) -f_35_ : (double) f_35_ * Math.sqrt((double) (f_39_ * 2.0F)));
	}

	Class111(Class54 class54) {
		((Class111) this).this$0 = class54;
	}

	public void method434(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1992055313);
		float f_45_ = class603.method7112(1605552911);
		Class240 class240_46_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) 115));
		float f_47_ = 0.0F;
		float f_48_ = class240_46_.method3301();
		if (f_48_ >= f_45_)
			f_47_ = 0.0F;
		if (f_48_ <= f)
			f_47_ = 1.0F;
		else {
			float f_49_ = 1.0F - (f_48_ - f) * (1.0F / (f_45_ - f));
			if ((double) f_49_ < 0.0 || (double) f_49_ > 1.0)
				f_49_ = Math.min(Math.max(f_49_, 0.0F), 1.0F);
			f_47_ = f_49_;
		}
		int i = 8192;
		float f_50_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_51_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_46_.aFloat2653 != 0.0F || 0.0F != class240_46_.aFloat2657) {
				int i_52_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_51_)) - (int) (Math.atan2((double) class240_46_.aFloat2653, (double) class240_46_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_52_ > 8192)
					i_52_ = 16384 - i_52_;
				int i_53_;
				if (f_48_ <= 0.0F)
					i_53_ = 8192;
				else if (f_48_ >= 4096.0F)
					i_53_ = 16384;
				else
					i_53_ = (int) (8192.0F * f_48_ / 4096.0F + 8192.0F);
				i = i_53_ * i_52_ / 8192 + (16384 - i_53_ >> 1);
			}
			f_50_ = (float) i * 6.1035156E-5F;
		} else {
			if (0.0F != class240_46_.aFloat2653 || class240_46_.aFloat2657 != 0.0F) {
				int i_54_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_46_.aFloat2653, (double) class240_46_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_54_ > 8192)
					i_54_ = 16384 - i_54_;
				int i_55_;
				if (f_48_ <= 0.0F)
					i_55_ = 8192;
				else if (f_48_ >= 4096.0F)
					i_55_ = 16384;
				else
					i_55_ = (int) (8192.0F + 8192.0F * f_48_ / 4096.0F);
				i = i_54_ * i_55_ / 8192 + (16384 - i_55_ >> 1);
			}
			f_50_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_47_ : ((double) f_47_ * Math.sqrt((double) (2.0F * (1.0F - f_50_)))));
		fs[1] = (float) (i < 0 ? (double) -f_47_ : (double) f_47_ * Math.sqrt((double) (f_50_ * 2.0F)));
	}

	public void method435(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1605739602);
		float f_56_ = class603.method7112(1439848209);
		Class240 class240_57_ = Class240.method3277(class240, ((Class111) this).this$0.method939((byte) 57));
		float f_58_ = 0.0F;
		float f_59_ = class240_57_.method3301();
		if (f_59_ >= f_56_)
			f_58_ = 0.0F;
		if (f_59_ <= f)
			f_58_ = 1.0F;
		else {
			float f_60_ = 1.0F - (f_59_ - f) * (1.0F / (f_56_ - f));
			if ((double) f_60_ < 0.0 || (double) f_60_ > 1.0)
				f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
			f_58_ = f_60_;
		}
		int i = 8192;
		float f_61_ = 0.0F;
		if (1 == Class18.anInt143 * 625220759) {
			float f_62_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
			if (class240_57_.aFloat2653 != 0.0F || 0.0F != class240_57_.aFloat2657) {
				int i_63_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_62_)) - (int) (Math.atan2((double) class240_57_.aFloat2653, (double) class240_57_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_63_ > 8192)
					i_63_ = 16384 - i_63_;
				int i_64_;
				if (f_59_ <= 0.0F)
					i_64_ = 8192;
				else if (f_59_ >= 4096.0F)
					i_64_ = 16384;
				else
					i_64_ = (int) (8192.0F * f_59_ / 4096.0F + 8192.0F);
				i = i_64_ * i_63_ / 8192 + (16384 - i_64_ >> 1);
			}
			f_61_ = (float) i * 6.1035156E-5F;
		} else {
			if (0.0F != class240_57_.aFloat2653 || class240_57_.aFloat2657 != 0.0F) {
				int i_65_ = ((-(426389501 * Class406.anInt4765) - (int) (Math.atan2((double) class240_57_.aFloat2653, (double) class240_57_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_65_ > 8192)
					i_65_ = 16384 - i_65_;
				int i_66_;
				if (f_59_ <= 0.0F)
					i_66_ = 8192;
				else if (f_59_ >= 4096.0F)
					i_66_ = 16384;
				else
					i_66_ = (int) (8192.0F + 8192.0F * f_59_ / 4096.0F);
				i = i_65_ * i_66_ / 8192 + (16384 - i_66_ >> 1);
			}
			f_61_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_58_ : ((double) f_58_ * Math.sqrt((double) (2.0F * (1.0F - f_61_)))));
		fs[1] = (float) (i < 0 ? (double) -f_58_ : (double) f_58_ * Math.sqrt((double) (f_61_ * 2.0F)));
	}

	public static boolean method2075(int i) {
		return Class428.aBool5019;
	}

	static final void method2076(Cs2Executor class441, int i) {
		int i_67_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_67_, (short) 2190);
		Class83 class83 = Class534.aClass83Array5975[i_67_ >> 16];
		Class539.method6402(class73, class83, false, 1, class441, (byte) -91);
	}

	static final void method2077(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1391890985) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray882 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method2078(Cs2Executor class441, int i) {
		int i_68_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method854(i_68_, 1493492562).method2131(-675887403) ? 1 : 0;
	}

	static final void method2079(Cs2Executor class441, byte i) {
		if (!Class133_Sub1.aClass411_Sub1_9827.method4994(-251491392).method5077(1579061251))
			throw new RuntimeException();
		Class423_Sub1 class423_sub1 = ((Class423_Sub1) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -66));
		class423_sub1.method9218(Class587.aClass236_7783, -1, 0.0F, (byte) -84);
		client.aBool8685 = true;
	}

	static final void method2080(Cs2Executor class441, int i) {
		int i_69_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (5 != 835742603 * client.anInt8580 || Class574.method6808(2085973644))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class242.method3340(i_69_, string, (byte) 42) ? 1 : 0;
	}

	public static int method2081(byte i) {
		return JS5ConfigGroup.aClass484_2593.aBool5415 ? 1 : 4;
	}

	static final void method2082(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class315.method4073(class73, class83, class441, (byte) -69);
	}
}
