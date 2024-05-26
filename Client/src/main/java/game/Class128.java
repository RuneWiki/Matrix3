package game;

/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

class Class128 implements Interface70 {
	Class54 this$0;
	static int anInt1525;

	public void method431(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1542483155);
		float f_0_ = class603.method7112(1486372568);
		Class240 class240_1_ = ((Class128) this).this$0.method939((byte) -7);
		Class240 class240_2_ = Class240.method3277(class240, class240_1_);
		float f_3_ = 0.0F;
		int i = 8192;
		float f_4_ = class240_2_.method3301();
		float f_5_ = 0.0F;
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_6_ = ((Float) objects[0]).floatValue();
			float f_7_ = ((Float) objects[1]).floatValue();
			if (class240_1_.aFloat2653 > class240.aFloat2653 - f_6_ / 2.0F && class240_1_.aFloat2653 < f_6_ / 2.0F + class240.aFloat2653 && class240_1_.aFloat2657 > class240.aFloat2657 - f_7_ / 2.0F && (class240_1_.aFloat2657 < class240.aFloat2657 + f_7_ / 2.0F)) {
				float f_8_ = Math.abs(class240_1_.aFloat2653 - (f_6_ / 2.0F + class240.aFloat2653));
				float f_9_ = Math.abs(class240_1_.aFloat2653 - (class240.aFloat2653 - f_6_ / 2.0F));
				float f_10_ = Math.abs(class240_1_.aFloat2657 - (f_7_ / 2.0F + class240.aFloat2653));
				float f_11_ = Math.abs(class240_1_.aFloat2657 - (class240.aFloat2653 - f_7_ / 2.0F));
				float f_12_ = f_0_ - f;
				float f_13_ = Math.min(f_8_, f_9_);
				float f_14_ = Math.min(f_10_, f_11_);
				float f_15_ = 1.0F / f_12_ * f_13_;
				float f_16_ = f_14_ * (1.0F / f_12_);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
				f_3_ = Math.min(f_15_, f_16_);
			}
			if (class240_2_.aFloat2653 != 0.0F || 0.0F != class240_2_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_17_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_2_.aFloat2653 != 0.0F || class240_2_.aFloat2657 != 0.0F) {
						int i_18_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_17_)) - (int) (Math.atan2((double) (class240_2_.aFloat2653), (double) (class240_2_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_18_ > 8192)
							i_18_ = 16384 - i_18_;
						int i_19_;
						if (f_4_ <= 0.0F)
							i_19_ = 8192;
						else if (f_4_ >= 4096.0F)
							i_19_ = 16384;
						else
							i_19_ = (int) (8192.0F + f_4_ * 8192.0F / 4096.0F);
						i = i_19_ * i_18_ / 8192 + (16384 - i_19_ >> 1);
					}
					f_5_ = (float) i * 6.1035156E-5F;
				} else {
					int i_20_ = (-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) class240_2_.aFloat2653, (double) class240_2_.aFloat2657) * 2607.5945876176133) - 4096) & 0x3fff;
					if (i_20_ > 8192)
						i_20_ = 16384 - i_20_;
					int i_21_;
					if (f_4_ <= 0.0F)
						i_21_ = 8192;
					else if (f_4_ >= 4096.0F)
						i_21_ = 16384;
					else
						i_21_ = (int) (8192.0F + 8192.0F * f_4_ / 4096.0F);
					i = (16384 - i_21_ >> 1) + i_20_ * i_21_ / 8192;
					f_5_ = (float) i * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_3_ : (double) f_3_ * Math.sqrt((double) (1.0F - f_5_)));
		fs[1] = (float) (i < 0 ? (double) -f_3_ : (double) f_3_ * Math.sqrt((double) f_5_));
	}

	Class128(Class54 class54) {
		((Class128) this).this$0 = class54;
	}

	public void method435(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1423321170);
		float f_22_ = class603.method7112(2041634896);
		Class240 class240_23_ = ((Class128) this).this$0.method939((byte) -23);
		Class240 class240_24_ = Class240.method3277(class240, class240_23_);
		float f_25_ = 0.0F;
		int i = 8192;
		float f_26_ = class240_24_.method3301();
		float f_27_ = 0.0F;
		if (f_26_ >= f_22_)
			f_25_ = 0.0F;
		else {
			float f_28_ = ((Float) objects[0]).floatValue();
			float f_29_ = ((Float) objects[1]).floatValue();
			if (class240_23_.aFloat2653 > class240.aFloat2653 - f_28_ / 2.0F && class240_23_.aFloat2653 < f_28_ / 2.0F + class240.aFloat2653 && class240_23_.aFloat2657 > class240.aFloat2657 - f_29_ / 2.0F && (class240_23_.aFloat2657 < class240.aFloat2657 + f_29_ / 2.0F)) {
				float f_30_ = Math.abs(class240_23_.aFloat2653 - (f_28_ / 2.0F + class240.aFloat2653));
				float f_31_ = Math.abs(class240_23_.aFloat2653 - (class240.aFloat2653 - f_28_ / 2.0F));
				float f_32_ = Math.abs(class240_23_.aFloat2657 - (f_29_ / 2.0F + class240.aFloat2653));
				float f_33_ = Math.abs(class240_23_.aFloat2657 - (class240.aFloat2653 - f_29_ / 2.0F));
				float f_34_ = f_22_ - f;
				float f_35_ = Math.min(f_30_, f_31_);
				float f_36_ = Math.min(f_32_, f_33_);
				float f_37_ = 1.0F / f_34_ * f_35_;
				float f_38_ = f_36_ * (1.0F / f_34_);
				f_37_ = Math.min(Math.max(f_37_, 0.0F), 1.0F);
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
				f_25_ = Math.min(f_37_, f_38_);
			}
			if (class240_24_.aFloat2653 != 0.0F || 0.0F != class240_24_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_39_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_24_.aFloat2653 != 0.0F || class240_24_.aFloat2657 != 0.0F) {
						int i_40_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_39_)) - (int) (Math.atan2((double) (class240_24_.aFloat2653), (double) (class240_24_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_40_ > 8192)
							i_40_ = 16384 - i_40_;
						int i_41_;
						if (f_26_ <= 0.0F)
							i_41_ = 8192;
						else if (f_26_ >= 4096.0F)
							i_41_ = 16384;
						else
							i_41_ = (int) (8192.0F + f_26_ * 8192.0F / 4096.0F);
						i = i_41_ * i_40_ / 8192 + (16384 - i_41_ >> 1);
					}
					f_27_ = (float) i * 6.1035156E-5F;
				} else {
					int i_42_ = ((-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) (class240_24_.aFloat2653), (double) (class240_24_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_42_ > 8192)
						i_42_ = 16384 - i_42_;
					int i_43_;
					if (f_26_ <= 0.0F)
						i_43_ = 8192;
					else if (f_26_ >= 4096.0F)
						i_43_ = 16384;
					else
						i_43_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
					i = (16384 - i_43_ >> 1) + i_42_ * i_43_ / 8192;
					f_27_ = (float) i * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) (1.0F - f_27_)));
		fs[1] = (float) (i < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) f_27_));
	}

	public void method430(Object object, float[] fs, Object[] objects, int i) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1915895027);
		float f_44_ = class603.method7112(1571224897);
		Class240 class240_45_ = ((Class128) this).this$0.method939((byte) 35);
		Class240 class240_46_ = Class240.method3277(class240, class240_45_);
		float f_47_ = 0.0F;
		int i_48_ = 8192;
		float f_49_ = class240_46_.method3301();
		float f_50_ = 0.0F;
		if (f_49_ >= f_44_)
			f_47_ = 0.0F;
		else {
			float f_51_ = ((Float) objects[0]).floatValue();
			float f_52_ = ((Float) objects[1]).floatValue();
			if (class240_45_.aFloat2653 > class240.aFloat2653 - f_51_ / 2.0F && class240_45_.aFloat2653 < f_51_ / 2.0F + class240.aFloat2653 && class240_45_.aFloat2657 > class240.aFloat2657 - f_52_ / 2.0F && (class240_45_.aFloat2657 < class240.aFloat2657 + f_52_ / 2.0F)) {
				float f_53_ = Math.abs(class240_45_.aFloat2653 - (f_51_ / 2.0F + class240.aFloat2653));
				float f_54_ = Math.abs(class240_45_.aFloat2653 - (class240.aFloat2653 - f_51_ / 2.0F));
				float f_55_ = Math.abs(class240_45_.aFloat2657 - (f_52_ / 2.0F + class240.aFloat2653));
				float f_56_ = Math.abs(class240_45_.aFloat2657 - (class240.aFloat2653 - f_52_ / 2.0F));
				float f_57_ = f_44_ - f;
				float f_58_ = Math.min(f_53_, f_54_);
				float f_59_ = Math.min(f_55_, f_56_);
				float f_60_ = 1.0F / f_57_ * f_58_;
				float f_61_ = f_59_ * (1.0F / f_57_);
				f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
				f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
				f_47_ = Math.min(f_60_, f_61_);
			}
			if (class240_46_.aFloat2653 != 0.0F || 0.0F != class240_46_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_62_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_46_.aFloat2653 != 0.0F || class240_46_.aFloat2657 != 0.0F) {
						int i_63_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_62_)) - (int) (Math.atan2((double) (class240_46_.aFloat2653), (double) (class240_46_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_63_ > 8192)
							i_63_ = 16384 - i_63_;
						int i_64_;
						if (f_49_ <= 0.0F)
							i_64_ = 8192;
						else if (f_49_ >= 4096.0F)
							i_64_ = 16384;
						else
							i_64_ = (int) (8192.0F + f_49_ * 8192.0F / 4096.0F);
						i_48_ = i_64_ * i_63_ / 8192 + (16384 - i_64_ >> 1);
					}
					f_50_ = (float) i_48_ * 6.1035156E-5F;
				} else {
					int i_65_ = ((-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) (class240_46_.aFloat2653), (double) (class240_46_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_65_ > 8192)
						i_65_ = 16384 - i_65_;
					int i_66_;
					if (f_49_ <= 0.0F)
						i_66_ = 8192;
					else if (f_49_ >= 4096.0F)
						i_66_ = 16384;
					else
						i_66_ = (int) (8192.0F + 8192.0F * f_49_ / 4096.0F);
					i_48_ = (16384 - i_66_ >> 1) + i_65_ * i_66_ / 8192;
					f_50_ = (float) i_48_ * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i_48_ < 0 ? (double) f_47_ : (double) f_47_ * Math.sqrt((double) (1.0F - f_50_)));
		fs[1] = (float) (i_48_ < 0 ? (double) -f_47_ : (double) f_47_ * Math.sqrt((double) f_50_));
	}

	public void method433(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(2146440069);
		float f_67_ = class603.method7112(1383102491);
		Class240 class240_68_ = ((Class128) this).this$0.method939((byte) 18);
		Class240 class240_69_ = Class240.method3277(class240, class240_68_);
		float f_70_ = 0.0F;
		int i = 8192;
		float f_71_ = class240_69_.method3301();
		float f_72_ = 0.0F;
		if (f_71_ >= f_67_)
			f_70_ = 0.0F;
		else {
			float f_73_ = ((Float) objects[0]).floatValue();
			float f_74_ = ((Float) objects[1]).floatValue();
			if (class240_68_.aFloat2653 > class240.aFloat2653 - f_73_ / 2.0F && class240_68_.aFloat2653 < f_73_ / 2.0F + class240.aFloat2653 && class240_68_.aFloat2657 > class240.aFloat2657 - f_74_ / 2.0F && (class240_68_.aFloat2657 < class240.aFloat2657 + f_74_ / 2.0F)) {
				float f_75_ = Math.abs(class240_68_.aFloat2653 - (f_73_ / 2.0F + class240.aFloat2653));
				float f_76_ = Math.abs(class240_68_.aFloat2653 - (class240.aFloat2653 - f_73_ / 2.0F));
				float f_77_ = Math.abs(class240_68_.aFloat2657 - (f_74_ / 2.0F + class240.aFloat2653));
				float f_78_ = Math.abs(class240_68_.aFloat2657 - (class240.aFloat2653 - f_74_ / 2.0F));
				float f_79_ = f_67_ - f;
				float f_80_ = Math.min(f_75_, f_76_);
				float f_81_ = Math.min(f_77_, f_78_);
				float f_82_ = 1.0F / f_79_ * f_80_;
				float f_83_ = f_81_ * (1.0F / f_79_);
				f_82_ = Math.min(Math.max(f_82_, 0.0F), 1.0F);
				f_83_ = Math.min(Math.max(f_83_, 0.0F), 1.0F);
				f_70_ = Math.min(f_82_, f_83_);
			}
			if (class240_69_.aFloat2653 != 0.0F || 0.0F != class240_69_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_84_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_69_.aFloat2653 != 0.0F || class240_69_.aFloat2657 != 0.0F) {
						int i_85_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_84_)) - (int) (Math.atan2((double) (class240_69_.aFloat2653), (double) (class240_69_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_85_ > 8192)
							i_85_ = 16384 - i_85_;
						int i_86_;
						if (f_71_ <= 0.0F)
							i_86_ = 8192;
						else if (f_71_ >= 4096.0F)
							i_86_ = 16384;
						else
							i_86_ = (int) (8192.0F + f_71_ * 8192.0F / 4096.0F);
						i = i_86_ * i_85_ / 8192 + (16384 - i_86_ >> 1);
					}
					f_72_ = (float) i * 6.1035156E-5F;
				} else {
					int i_87_ = ((-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) (class240_69_.aFloat2653), (double) (class240_69_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_87_ > 8192)
						i_87_ = 16384 - i_87_;
					int i_88_;
					if (f_71_ <= 0.0F)
						i_88_ = 8192;
					else if (f_71_ >= 4096.0F)
						i_88_ = 16384;
					else
						i_88_ = (int) (8192.0F + 8192.0F * f_71_ / 4096.0F);
					i = (16384 - i_88_ >> 1) + i_87_ * i_88_ / 8192;
					f_72_ = (float) i * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_70_ : (double) f_70_ * Math.sqrt((double) (1.0F - f_72_)));
		fs[1] = (float) (i < 0 ? (double) -f_70_ : (double) f_70_ * Math.sqrt((double) f_72_));
	}

	public void method434(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1478157184);
		float f_89_ = class603.method7112(1993818403);
		Class240 class240_90_ = ((Class128) this).this$0.method939((byte) 56);
		Class240 class240_91_ = Class240.method3277(class240, class240_90_);
		float f_92_ = 0.0F;
		int i = 8192;
		float f_93_ = class240_91_.method3301();
		float f_94_ = 0.0F;
		if (f_93_ >= f_89_)
			f_92_ = 0.0F;
		else {
			float f_95_ = ((Float) objects[0]).floatValue();
			float f_96_ = ((Float) objects[1]).floatValue();
			if (class240_90_.aFloat2653 > class240.aFloat2653 - f_95_ / 2.0F && class240_90_.aFloat2653 < f_95_ / 2.0F + class240.aFloat2653 && class240_90_.aFloat2657 > class240.aFloat2657 - f_96_ / 2.0F && (class240_90_.aFloat2657 < class240.aFloat2657 + f_96_ / 2.0F)) {
				float f_97_ = Math.abs(class240_90_.aFloat2653 - (f_95_ / 2.0F + class240.aFloat2653));
				float f_98_ = Math.abs(class240_90_.aFloat2653 - (class240.aFloat2653 - f_95_ / 2.0F));
				float f_99_ = Math.abs(class240_90_.aFloat2657 - (f_96_ / 2.0F + class240.aFloat2653));
				float f_100_ = Math.abs(class240_90_.aFloat2657 - (class240.aFloat2653 - f_96_ / 2.0F));
				float f_101_ = f_89_ - f;
				float f_102_ = Math.min(f_97_, f_98_);
				float f_103_ = Math.min(f_99_, f_100_);
				float f_104_ = 1.0F / f_101_ * f_102_;
				float f_105_ = f_103_ * (1.0F / f_101_);
				f_104_ = Math.min(Math.max(f_104_, 0.0F), 1.0F);
				f_105_ = Math.min(Math.max(f_105_, 0.0F), 1.0F);
				f_92_ = Math.min(f_104_, f_105_);
			}
			if (class240_91_.aFloat2653 != 0.0F || 0.0F != class240_91_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_106_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_91_.aFloat2653 != 0.0F || class240_91_.aFloat2657 != 0.0F) {
						int i_107_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_106_)) - (int) (Math.atan2((double) (class240_91_.aFloat2653), (double) (class240_91_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_107_ > 8192)
							i_107_ = 16384 - i_107_;
						int i_108_;
						if (f_93_ <= 0.0F)
							i_108_ = 8192;
						else if (f_93_ >= 4096.0F)
							i_108_ = 16384;
						else
							i_108_ = (int) (8192.0F + f_93_ * 8192.0F / 4096.0F);
						i = i_108_ * i_107_ / 8192 + (16384 - i_108_ >> 1);
					}
					f_94_ = (float) i * 6.1035156E-5F;
				} else {
					int i_109_ = ((-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) (class240_91_.aFloat2653), (double) (class240_91_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_109_ > 8192)
						i_109_ = 16384 - i_109_;
					int i_110_;
					if (f_93_ <= 0.0F)
						i_110_ = 8192;
					else if (f_93_ >= 4096.0F)
						i_110_ = 16384;
					else
						i_110_ = (int) (8192.0F + 8192.0F * f_93_ / 4096.0F);
					i = (16384 - i_110_ >> 1) + i_109_ * i_110_ / 8192;
					f_94_ = (float) i * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_92_ : (double) f_92_ * Math.sqrt((double) (1.0F - f_94_)));
		fs[1] = (float) (i < 0 ? (double) -f_92_ : (double) f_92_ * Math.sqrt((double) f_94_));
	}

	public void method432(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1400487449);
		float f_111_ = class603.method7112(1793320704);
		Class240 class240_112_ = ((Class128) this).this$0.method939((byte) -65);
		Class240 class240_113_ = Class240.method3277(class240, class240_112_);
		float f_114_ = 0.0F;
		int i = 8192;
		float f_115_ = class240_113_.method3301();
		float f_116_ = 0.0F;
		if (f_115_ >= f_111_)
			f_114_ = 0.0F;
		else {
			float f_117_ = ((Float) objects[0]).floatValue();
			float f_118_ = ((Float) objects[1]).floatValue();
			if (class240_112_.aFloat2653 > class240.aFloat2653 - f_117_ / 2.0F && (class240_112_.aFloat2653 < f_117_ / 2.0F + class240.aFloat2653) && (class240_112_.aFloat2657 > class240.aFloat2657 - f_118_ / 2.0F) && (class240_112_.aFloat2657 < class240.aFloat2657 + f_118_ / 2.0F)) {
				float f_119_ = Math.abs(class240_112_.aFloat2653 - (f_117_ / 2.0F + class240.aFloat2653));
				float f_120_ = Math.abs(class240_112_.aFloat2653 - (class240.aFloat2653 - f_117_ / 2.0F));
				float f_121_ = Math.abs(class240_112_.aFloat2657 - (f_118_ / 2.0F + class240.aFloat2653));
				float f_122_ = Math.abs(class240_112_.aFloat2657 - (class240.aFloat2653 - f_118_ / 2.0F));
				float f_123_ = f_111_ - f;
				float f_124_ = Math.min(f_119_, f_120_);
				float f_125_ = Math.min(f_121_, f_122_);
				float f_126_ = 1.0F / f_123_ * f_124_;
				float f_127_ = f_125_ * (1.0F / f_123_);
				f_126_ = Math.min(Math.max(f_126_, 0.0F), 1.0F);
				f_127_ = Math.min(Math.max(f_127_, 0.0F), 1.0F);
				f_114_ = Math.min(f_126_, f_127_);
			}
			if (class240_113_.aFloat2653 != 0.0F || 0.0F != class240_113_.aFloat2657) {
				if (625220759 * Class18.anInt143 == 1) {
					float f_128_ = Class133_Sub1.aClass411_Sub1_9827.method5000(69787938);
					if (class240_113_.aFloat2653 != 0.0F || class240_113_.aFloat2657 != 0.0F) {
						int i_129_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_128_)) - (int) (Math.atan2((double) (class240_113_.aFloat2653), (double) (class240_113_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_129_ > 8192)
							i_129_ = 16384 - i_129_;
						int i_130_;
						if (f_115_ <= 0.0F)
							i_130_ = 8192;
						else if (f_115_ >= 4096.0F)
							i_130_ = 16384;
						else
							i_130_ = (int) (8192.0F + f_115_ * 8192.0F / 4096.0F);
						i = i_130_ * i_129_ / 8192 + (16384 - i_130_ >> 1);
					}
					f_116_ = (float) i * 6.1035156E-5F;
				} else {
					int i_131_ = ((-(Class406.anInt4765 * 426389501) - (int) (Math.atan2((double) (class240_113_.aFloat2653), (double) (class240_113_.aFloat2657)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_131_ > 8192)
						i_131_ = 16384 - i_131_;
					int i_132_;
					if (f_115_ <= 0.0F)
						i_132_ = 8192;
					else if (f_115_ >= 4096.0F)
						i_132_ = 16384;
					else
						i_132_ = (int) (8192.0F + 8192.0F * f_115_ / 4096.0F);
					i = (16384 - i_132_ >> 1) + i_131_ * i_132_ / 8192;
					f_116_ = (float) i * 6.1035156E-5F;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_114_ : (double) f_114_ * Math.sqrt((double) (1.0F - f_116_)));
		fs[1] = (float) (i < 0 ? (double) -f_114_ : (double) f_114_ * Math.sqrt((double) f_116_));
	}

	static void method2255(Class106 class106, int i) {
		if (!Class25.aBool191)
			Class24.method721(class106, -1255660681);
		else
			Class665_Sub26.method9098(class106, (byte) 0);
	}

	static final void method2256(Cs2Executor class441, int i) {
		int i_133_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_133_, (short) 7794);
		Class83 class83 = Class534.aClass83Array5975[i_133_ >> 16];
		Class301.method3995(class73, class83, class441, (byte) 1);
	}

	static final void method2257(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1963436192) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray737 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method2258(Cs2Executor class441, byte i) {
		int i_134_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (client.aString8887 != null && i_134_ < 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = Class328.aClass196Array4209[i_134_].aString2350;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}

	public static byte[] method2259(File file, byte i) {
		return Class567.method6724(file, (int) file.length(), -1456191594);
	}

	static String method2260(int i, int i_135_, int i_136_) {
		int i_137_ = i_135_ - i;
		if (i_137_ < -9)
			return GraphicsDefinition.method7770(16711680, (byte) 37);
		if (i_137_ < -6)
			return GraphicsDefinition.method7770(16723968, (byte) 38);
		if (i_137_ < -3)
			return GraphicsDefinition.method7770(16740352, (byte) 42);
		if (i_137_ < 0)
			return GraphicsDefinition.method7770(16756736, (byte) -72);
		if (i_137_ > 9)
			return GraphicsDefinition.method7770(65280, (byte) 16);
		if (i_137_ > 6)
			return GraphicsDefinition.method7770(4259584, (byte) -31);
		if (i_137_ > 3)
			return GraphicsDefinition.method7770(8453888, (byte) -26);
		if (i_137_ > 0)
			return GraphicsDefinition.method7770(12648192, (byte) -68);
		return GraphicsDefinition.method7770(16776960, (byte) -58);
	}
}
