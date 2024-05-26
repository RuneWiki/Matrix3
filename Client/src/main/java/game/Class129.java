package game;

/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class129 implements Interface70 {
	Class54 this$0;

	public void method433(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1839869699);
		float f_0_ = class603.method7112(1492569318);
		Class240 class240_1_ = ((Class129) this).this$0.method939((byte) -25);
		Class240 class240_2_ = Class240.method3277(class240, class240_1_);
		float f_3_ = 0.0F;
		float f_4_ = class240_2_.method3301();
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_5_ = ((Float) objects[0]).floatValue();
			float f_6_ = ((Float) objects[1]).floatValue();
			if (class240_1_.aFloat2653 > class240.aFloat2653 - f_5_ / 2.0F && class240_1_.aFloat2653 < f_5_ / 2.0F + class240.aFloat2653 && class240_1_.aFloat2657 > class240.aFloat2657 - f_6_ / 2.0F && (class240_1_.aFloat2657 < class240.aFloat2657 + f_6_ / 2.0F)) {
				float f_7_ = Math.abs(class240_1_.aFloat2653 - (f_5_ / 2.0F + class240.aFloat2653));
				float f_8_ = Math.abs(class240_1_.aFloat2653 - (class240.aFloat2653 - f_5_ / 2.0F));
				float f_9_ = Math.abs(class240_1_.aFloat2657 - (class240.aFloat2653 + f_6_ / 2.0F));
				float f_10_ = Math.abs(class240_1_.aFloat2657 - (class240.aFloat2653 - f_6_ / 2.0F));
				float f_11_ = f_0_ - f;
				float f_12_ = Math.min(f_7_, f_8_);
				float f_13_ = Math.min(f_9_, f_10_);
				float f_14_ = 1.0F / f_11_ * f_12_;
				float f_15_ = 1.0F / f_11_ * f_13_;
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_3_ = Math.min(f_14_, f_15_);
			}
		}
		fs[0] = f_3_;
		fs[1] = f_3_;
	}

	public void method430(Object object, float[] fs, Object[] objects, int i) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(2074933194);
		float f_16_ = class603.method7112(1851376344);
		Class240 class240_17_ = ((Class129) this).this$0.method939((byte) 36);
		Class240 class240_18_ = Class240.method3277(class240, class240_17_);
		float f_19_ = 0.0F;
		float f_20_ = class240_18_.method3301();
		if (f_20_ >= f_16_)
			f_19_ = 0.0F;
		else {
			float f_21_ = ((Float) objects[0]).floatValue();
			float f_22_ = ((Float) objects[1]).floatValue();
			if (class240_17_.aFloat2653 > class240.aFloat2653 - f_21_ / 2.0F && class240_17_.aFloat2653 < f_21_ / 2.0F + class240.aFloat2653 && class240_17_.aFloat2657 > class240.aFloat2657 - f_22_ / 2.0F && (class240_17_.aFloat2657 < class240.aFloat2657 + f_22_ / 2.0F)) {
				float f_23_ = Math.abs(class240_17_.aFloat2653 - (f_21_ / 2.0F + class240.aFloat2653));
				float f_24_ = Math.abs(class240_17_.aFloat2653 - (class240.aFloat2653 - f_21_ / 2.0F));
				float f_25_ = Math.abs(class240_17_.aFloat2657 - (class240.aFloat2653 + f_22_ / 2.0F));
				float f_26_ = Math.abs(class240_17_.aFloat2657 - (class240.aFloat2653 - f_22_ / 2.0F));
				float f_27_ = f_16_ - f;
				float f_28_ = Math.min(f_23_, f_24_);
				float f_29_ = Math.min(f_25_, f_26_);
				float f_30_ = 1.0F / f_27_ * f_28_;
				float f_31_ = 1.0F / f_27_ * f_29_;
				f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
				f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
				f_19_ = Math.min(f_30_, f_31_);
			}
		}
		fs[0] = f_19_;
		fs[1] = f_19_;
	}

	public void method431(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1572634541);
		float f_32_ = class603.method7112(2017362440);
		Class240 class240_33_ = ((Class129) this).this$0.method939((byte) -81);
		Class240 class240_34_ = Class240.method3277(class240, class240_33_);
		float f_35_ = 0.0F;
		float f_36_ = class240_34_.method3301();
		if (f_36_ >= f_32_)
			f_35_ = 0.0F;
		else {
			float f_37_ = ((Float) objects[0]).floatValue();
			float f_38_ = ((Float) objects[1]).floatValue();
			if (class240_33_.aFloat2653 > class240.aFloat2653 - f_37_ / 2.0F && class240_33_.aFloat2653 < f_37_ / 2.0F + class240.aFloat2653 && class240_33_.aFloat2657 > class240.aFloat2657 - f_38_ / 2.0F && (class240_33_.aFloat2657 < class240.aFloat2657 + f_38_ / 2.0F)) {
				float f_39_ = Math.abs(class240_33_.aFloat2653 - (f_37_ / 2.0F + class240.aFloat2653));
				float f_40_ = Math.abs(class240_33_.aFloat2653 - (class240.aFloat2653 - f_37_ / 2.0F));
				float f_41_ = Math.abs(class240_33_.aFloat2657 - (class240.aFloat2653 + f_38_ / 2.0F));
				float f_42_ = Math.abs(class240_33_.aFloat2657 - (class240.aFloat2653 - f_38_ / 2.0F));
				float f_43_ = f_32_ - f;
				float f_44_ = Math.min(f_39_, f_40_);
				float f_45_ = Math.min(f_41_, f_42_);
				float f_46_ = 1.0F / f_43_ * f_44_;
				float f_47_ = 1.0F / f_43_ * f_45_;
				f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
				f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
				f_35_ = Math.min(f_46_, f_47_);
			}
		}
		fs[0] = f_35_;
		fs[1] = f_35_;
	}

	public void method432(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(2091739366);
		float f_48_ = class603.method7112(1815802696);
		Class240 class240_49_ = ((Class129) this).this$0.method939((byte) 58);
		Class240 class240_50_ = Class240.method3277(class240, class240_49_);
		float f_51_ = 0.0F;
		float f_52_ = class240_50_.method3301();
		if (f_52_ >= f_48_)
			f_51_ = 0.0F;
		else {
			float f_53_ = ((Float) objects[0]).floatValue();
			float f_54_ = ((Float) objects[1]).floatValue();
			if (class240_49_.aFloat2653 > class240.aFloat2653 - f_53_ / 2.0F && class240_49_.aFloat2653 < f_53_ / 2.0F + class240.aFloat2653 && class240_49_.aFloat2657 > class240.aFloat2657 - f_54_ / 2.0F && (class240_49_.aFloat2657 < class240.aFloat2657 + f_54_ / 2.0F)) {
				float f_55_ = Math.abs(class240_49_.aFloat2653 - (f_53_ / 2.0F + class240.aFloat2653));
				float f_56_ = Math.abs(class240_49_.aFloat2653 - (class240.aFloat2653 - f_53_ / 2.0F));
				float f_57_ = Math.abs(class240_49_.aFloat2657 - (class240.aFloat2653 + f_54_ / 2.0F));
				float f_58_ = Math.abs(class240_49_.aFloat2657 - (class240.aFloat2653 - f_54_ / 2.0F));
				float f_59_ = f_48_ - f;
				float f_60_ = Math.min(f_55_, f_56_);
				float f_61_ = Math.min(f_57_, f_58_);
				float f_62_ = 1.0F / f_59_ * f_60_;
				float f_63_ = 1.0F / f_59_ * f_61_;
				f_62_ = Math.min(Math.max(f_62_, 0.0F), 1.0F);
				f_63_ = Math.min(Math.max(f_63_, 0.0F), 1.0F);
				f_51_ = Math.min(f_62_, f_63_);
			}
		}
		fs[0] = f_51_;
		fs[1] = f_51_;
	}

	public void method434(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1382958468);
		float f_64_ = class603.method7112(1839585141);
		Class240 class240_65_ = ((Class129) this).this$0.method939((byte) -70);
		Class240 class240_66_ = Class240.method3277(class240, class240_65_);
		float f_67_ = 0.0F;
		float f_68_ = class240_66_.method3301();
		if (f_68_ >= f_64_)
			f_67_ = 0.0F;
		else {
			float f_69_ = ((Float) objects[0]).floatValue();
			float f_70_ = ((Float) objects[1]).floatValue();
			if (class240_65_.aFloat2653 > class240.aFloat2653 - f_69_ / 2.0F && class240_65_.aFloat2653 < f_69_ / 2.0F + class240.aFloat2653 && class240_65_.aFloat2657 > class240.aFloat2657 - f_70_ / 2.0F && (class240_65_.aFloat2657 < class240.aFloat2657 + f_70_ / 2.0F)) {
				float f_71_ = Math.abs(class240_65_.aFloat2653 - (f_69_ / 2.0F + class240.aFloat2653));
				float f_72_ = Math.abs(class240_65_.aFloat2653 - (class240.aFloat2653 - f_69_ / 2.0F));
				float f_73_ = Math.abs(class240_65_.aFloat2657 - (class240.aFloat2653 + f_70_ / 2.0F));
				float f_74_ = Math.abs(class240_65_.aFloat2657 - (class240.aFloat2653 - f_70_ / 2.0F));
				float f_75_ = f_64_ - f;
				float f_76_ = Math.min(f_71_, f_72_);
				float f_77_ = Math.min(f_73_, f_74_);
				float f_78_ = 1.0F / f_75_ * f_76_;
				float f_79_ = 1.0F / f_75_ * f_77_;
				f_78_ = Math.min(Math.max(f_78_, 0.0F), 1.0F);
				f_79_ = Math.min(Math.max(f_79_, 0.0F), 1.0F);
				f_67_ = Math.min(f_78_, f_79_);
			}
		}
		fs[0] = f_67_;
		fs[1] = f_67_;
	}

	Class129(Class54 class54) {
		((Class129) this).this$0 = class54;
	}

	public void method435(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1933215331);
		float f_80_ = class603.method7112(1842101047);
		Class240 class240_81_ = ((Class129) this).this$0.method939((byte) -61);
		Class240 class240_82_ = Class240.method3277(class240, class240_81_);
		float f_83_ = 0.0F;
		float f_84_ = class240_82_.method3301();
		if (f_84_ >= f_80_)
			f_83_ = 0.0F;
		else {
			float f_85_ = ((Float) objects[0]).floatValue();
			float f_86_ = ((Float) objects[1]).floatValue();
			if (class240_81_.aFloat2653 > class240.aFloat2653 - f_85_ / 2.0F && class240_81_.aFloat2653 < f_85_ / 2.0F + class240.aFloat2653 && class240_81_.aFloat2657 > class240.aFloat2657 - f_86_ / 2.0F && (class240_81_.aFloat2657 < class240.aFloat2657 + f_86_ / 2.0F)) {
				float f_87_ = Math.abs(class240_81_.aFloat2653 - (f_85_ / 2.0F + class240.aFloat2653));
				float f_88_ = Math.abs(class240_81_.aFloat2653 - (class240.aFloat2653 - f_85_ / 2.0F));
				float f_89_ = Math.abs(class240_81_.aFloat2657 - (class240.aFloat2653 + f_86_ / 2.0F));
				float f_90_ = Math.abs(class240_81_.aFloat2657 - (class240.aFloat2653 - f_86_ / 2.0F));
				float f_91_ = f_80_ - f;
				float f_92_ = Math.min(f_87_, f_88_);
				float f_93_ = Math.min(f_89_, f_90_);
				float f_94_ = 1.0F / f_91_ * f_92_;
				float f_95_ = 1.0F / f_91_ * f_93_;
				f_94_ = Math.min(Math.max(f_94_, 0.0F), 1.0F);
				f_95_ = Math.min(Math.max(f_95_, 0.0F), 1.0F);
				f_83_ = Math.min(f_94_, f_95_);
			}
		}
		fs[0] = f_83_;
		fs[1] = f_83_;
	}

	public static void method2261(int i) {
		Class520.anInt5805 = 1921292913;
	}

	static final void method2262(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		if (!Class569.method6760(i, null, -1208118680)) {
			if (-1 != i_102_)
				client.aBoolArray8784[i_102_] = true;
			else {
				for (int i_104_ = 0; i_104_ < 107; i_104_++)
					client.aBoolArray8784[i_104_] = true;
			}
		} else
			Class348.method4343(Class534.aClass83Array5975[i].method1257(-2122069402), -1, i_96_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, i_102_ < 0, (byte) -78);
	}

	public static byte[] method2263(String string, byte i) {
		int i_105_ = string.length();
		if (0 == i_105_)
			return new byte[0];
		int i_106_ = i_105_ + 3 & ~0x3;
		int i_107_ = 3 * (i_106_ / 4);
		if (i_106_ - 2 >= i_105_ || (Class528.method6323(string.charAt(i_106_ - 2), -1286948056) == -1))
			i_107_ -= 2;
		else if (i_106_ - 1 >= i_105_ || Class528.method6323(string.charAt(i_106_ - 1), -1072432505) == -1)
			i_107_--;
		byte[] is = new byte[i_107_];
		Class491.method5861(string, is, 0, -284774911);
		return is;
	}
}
