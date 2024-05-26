package game;

/* Class102_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102_Sub2 extends Class102 {
	int[] anIntArray10262;
	byte[][] aByteArrayArray10263;
	int[] anIntArray10264;
	int[] anIntArray10265;
	int[] anIntArray10266;
	Class106_Sub2 aClass106_Sub2_10267;
	public static Class494 aClass494_10268;

	void method9539(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		for (int i_7_ = -i_4_; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
				int i_9_ = is[i_1_++] & 0xff;
				if (i_9_ != 0) {
					int i_10_ = (((i_9_ * (i & 0xff00ff) & ~0xff00ff) + ((i & 0xff00) * i_9_ & 0xff0000)) >> 8);
					i_9_ = 256 - i_9_;
					int i_11_ = is_0_[i_2_];
					is_0_[i_2_++] = ((((i_11_ & 0xff00ff) * i_9_ & ~0xff00ff) + (i_9_ * (i_11_ & 0xff00) & 0xff0000)) >> 8) + i_10_;
				} else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	Class102_Sub2(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub2[] class87_sub2s, int[] is, int[] is_12_) {
		super(class106_sub2, class284);
		((Class102_Sub2) this).aClass106_Sub2_10267 = class106_sub2;
		((Class102_Sub2) this).aClass106_Sub2_10267 = class106_sub2;
		((Class102_Sub2) this).anIntArray10264 = is;
		((Class102_Sub2) this).anIntArray10266 = is_12_;
		((Class102_Sub2) this).aByteArrayArray10263 = new byte[class87_sub2s.length][];
		((Class102_Sub2) this).anIntArray10262 = new int[class87_sub2s.length];
		((Class102_Sub2) this).anIntArray10265 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			int[] is_13_ = class87_sub2.method1285(false);
			byte[] is_14_ = (((Class102_Sub2) this).aByteArrayArray10263[i] = new byte[is_13_.length]);
			for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
				is_14_[i_15_] = (byte) (is_13_[i_15_] >> 24 & 0xff);
			((Class102_Sub2) this).anIntArray10262[i] = class87_sub2.method1288();
			((Class102_Sub2) this).anIntArray10265[i] = class87_sub2.method1286();
		}
	}

	void method1621(char c, int i, int i_16_, int i_17_, boolean bool, Class167 class167, int i_18_, int i_19_) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			if (null == class167)
				method1609(c, i, i_16_, i_17_, bool);
			else {
				i += ((Class102_Sub2) this).anIntArray10265[c];
				i_16_ += ((Class102_Sub2) this).anIntArray10262[c];
				int i_20_ = ((Class102_Sub2) this).anIntArray10264[c];
				int i_21_ = ((Class102_Sub2) this).anIntArray10266[c];
				int i_22_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10217 * -994907113);
				int i_23_ = i + i_16_ * i_22_;
				int i_24_ = i_22_ - i_20_;
				int i_25_ = 0;
				int i_26_ = 0;
				if (i_16_ < 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222)) {
					int i_27_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 - i_16_);
					i_21_ -= i_27_;
					i_16_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10222) * 2029354259;
					i_26_ += i_20_ * i_27_;
					i_23_ += i_27_ * i_22_;
				}
				if (i_21_ + i_16_ > (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10223) * 1704244235)
					i_21_ -= (i_21_ + i_16_ - (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223) * 1704244235);
				if (i < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220 * 1179466163)) {
					int i_28_ = ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220) * 1179466163 - i);
					i_20_ -= i_28_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220);
					i_26_ += i_28_;
					i_23_ += i_28_;
					i_25_ += i_28_;
					i_24_ += i_28_;
				}
				if (i_20_ + i > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
					int i_29_ = (i + i_20_ - 892939761 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221);
					i_20_ -= i_29_;
					i_25_ += i_29_;
					i_24_ += i_29_;
				}
				if (i_20_ > 0 && i_21_ > 0)
					method9540(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_17_, i_26_, i_23_, i_20_, i_21_, i_24_, i_25_, i, i_16_, ((Class102_Sub2) this).anIntArray10264[c], class167, i_18_, i_19_);
			}
		}
	}

	void method1609(char c, int i, int i_30_, int i_31_, boolean bool) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			i += ((Class102_Sub2) this).anIntArray10265[c];
			i_30_ += ((Class102_Sub2) this).anIntArray10262[c];
			int i_32_ = ((Class102_Sub2) this).anIntArray10264[c];
			int i_33_ = ((Class102_Sub2) this).anIntArray10266[c];
			int i_34_ = -994907113 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10217);
			int i_35_ = i + i_34_ * i_30_;
			int i_36_ = i_34_ - i_32_;
			int i_37_ = 0;
			int i_38_ = 0;
			if (i_30_ < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 * 2029354259)) {
				int i_39_ = (2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222) - i_30_);
				i_33_ -= i_39_;
				i_30_ = 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222);
				i_38_ += i_39_ * i_32_;
				i_35_ += i_39_ * i_34_;
			}
			if (i_30_ + i_33_ > 1704244235 * (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223))
				i_33_ -= i_30_ + i_33_ - 1704244235 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10223);
			if (i < (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220 * 1179466163)) {
				int i_40_ = (1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220) - i);
				i_32_ -= i_40_;
				i = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220 * 1179466163);
				i_38_ += i_40_;
				i_35_ += i_40_;
				i_37_ += i_40_;
				i_36_ += i_40_;
			}
			if (i + i_32_ > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
				int i_41_ = i + i_32_ - (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221) * 892939761;
				i_32_ -= i_41_;
				i_37_ += i_41_;
				i_36_ += i_41_;
			}
			if (i_32_ > 0 && i_33_ > 0)
				method9539(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_31_, i_38_, i_35_, i_32_, i_33_, i_36_, i_37_);
		}
	}

	Class102_Sub2(Class106_Sub2 class106_sub2, Class284 class284, Class87_Sub1[] class87_sub1s, int[] is, int[] is_42_) {
		super(class106_sub2, class284);
		((Class102_Sub2) this).aClass106_Sub2_10267 = class106_sub2;
		((Class102_Sub2) this).aClass106_Sub2_10267 = class106_sub2;
		((Class102_Sub2) this).anIntArray10264 = is;
		((Class102_Sub2) this).anIntArray10266 = is_42_;
		((Class102_Sub2) this).aByteArrayArray10263 = new byte[class87_sub1s.length][];
		((Class102_Sub2) this).anIntArray10262 = new int[class87_sub1s.length];
		((Class102_Sub2) this).anIntArray10265 = new int[class87_sub1s.length];
		for (int i = 0; i < class87_sub1s.length; i++) {
			Class87_Sub1 class87_sub1 = class87_sub1s[i];
			if (null != class87_sub1.aByteArray9972)
				((Class102_Sub2) this).aByteArrayArray10263[i] = class87_sub1.aByteArray9972;
			else {
				byte[] is_43_ = class87_sub1.aByteArray9969;
				byte[] is_44_ = (((Class102_Sub2) this).aByteArrayArray10263[i] = new byte[is_43_.length]);
				for (int i_45_ = 0; i_45_ < is_43_.length; i_45_++)
					is_44_[i_45_] = (byte) (0 == is_43_[i_45_] ? 0 : -1);
			}
			((Class102_Sub2) this).anIntArray10262[i] = class87_sub1.anInt9970;
			((Class102_Sub2) this).anIntArray10265[i] = class87_sub1.anInt9968;
		}
	}

	void method9540(byte[] is, int[] is_46_, int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, Class167 class167, int i_56_, int i_57_) {
		Class167_Sub1 class167_sub1 = (Class167_Sub1) class167;
		int[] is_58_ = ((Class167_Sub1) class167_sub1).anIntArray10871;
		int[] is_59_ = ((Class167_Sub1) class167_sub1).anIntArray10872;
		int i_60_ = (i_53_ - (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220) * 1179466163);
		int i_61_ = i_54_;
		if (i_57_ > i_61_) {
			i_61_ = i_57_;
			i_48_ += ((i_57_ - i_54_) * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10217 * -994907113));
			i_47_ += i_55_ * (i_57_ - i_54_);
		}
		int i_62_ = (i_57_ + is_58_.length < i_50_ + i_54_ ? is_58_.length + i_57_ : i_50_ + i_54_);
		for (int i_63_ = i_61_; i_63_ < i_62_; i_63_++) {
			int i_64_ = i_56_ + is_58_[i_63_ - i_57_];
			int i_65_ = is_59_[i_63_ - i_57_];
			int i_66_ = i_49_;
			if (i_60_ > i_64_) {
				int i_67_ = i_60_ - i_64_;
				if (i_67_ >= i_65_) {
					i_47_ += i_49_ + i_52_;
					i_48_ += i_49_ + i_51_;
					continue;
				}
				i_65_ -= i_67_;
			} else {
				int i_68_ = i_64_ - i_60_;
				if (i_68_ >= i_49_) {
					i_47_ += i_52_ + i_49_;
					i_48_ += i_51_ + i_49_;
					continue;
				}
				i_47_ += i_68_;
				i_66_ -= i_68_;
				i_48_ += i_68_;
			}
			int i_69_ = 0;
			if (i_66_ < i_65_)
				i_65_ = i_66_;
			else
				i_69_ = i_66_ - i_65_;
			for (int i_70_ = -i_65_; i_70_ < 0; i_70_++) {
				int i_71_ = is[i_47_++] & 0xff;
				if (i_71_ != 0) {
					int i_72_ = ((((i & 0xff00ff) * i_71_ & ~0xff00ff) + (i_71_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_71_ = 256 - i_71_;
					int i_73_ = is_46_[i_48_];
					is_46_[i_48_++] = ((((i_73_ & 0xff00ff) * i_71_ & ~0xff00ff) + ((i_73_ & 0xff00) * i_71_ & 0xff0000)) >> 8) + i_72_;
				} else
					i_48_++;
			}
			i_47_ += i_69_ + i_52_;
			i_48_ += i_51_ + i_69_;
		}
	}

	void method1622(char c, int i, int i_74_, int i_75_, boolean bool) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			i += ((Class102_Sub2) this).anIntArray10265[c];
			i_74_ += ((Class102_Sub2) this).anIntArray10262[c];
			int i_76_ = ((Class102_Sub2) this).anIntArray10264[c];
			int i_77_ = ((Class102_Sub2) this).anIntArray10266[c];
			int i_78_ = -994907113 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10217);
			int i_79_ = i + i_78_ * i_74_;
			int i_80_ = i_78_ - i_76_;
			int i_81_ = 0;
			int i_82_ = 0;
			if (i_74_ < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 * 2029354259)) {
				int i_83_ = (2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222) - i_74_);
				i_77_ -= i_83_;
				i_74_ = 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222);
				i_82_ += i_83_ * i_76_;
				i_79_ += i_83_ * i_78_;
			}
			if (i_74_ + i_77_ > 1704244235 * (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223))
				i_77_ -= i_74_ + i_77_ - 1704244235 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10223);
			if (i < (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220 * 1179466163)) {
				int i_84_ = (1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220) - i);
				i_76_ -= i_84_;
				i = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220 * 1179466163);
				i_82_ += i_84_;
				i_79_ += i_84_;
				i_81_ += i_84_;
				i_80_ += i_84_;
			}
			if (i + i_76_ > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
				int i_85_ = i + i_76_ - (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221) * 892939761;
				i_76_ -= i_85_;
				i_81_ += i_85_;
				i_80_ += i_85_;
			}
			if (i_76_ > 0 && i_77_ > 0)
				method9539(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_75_, i_82_, i_79_, i_76_, i_77_, i_80_, i_81_);
		}
	}

	void method1623(char c, int i, int i_86_, int i_87_, boolean bool, Class167 class167, int i_88_, int i_89_) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			if (null == class167)
				method1609(c, i, i_86_, i_87_, bool);
			else {
				i += ((Class102_Sub2) this).anIntArray10265[c];
				i_86_ += ((Class102_Sub2) this).anIntArray10262[c];
				int i_90_ = ((Class102_Sub2) this).anIntArray10264[c];
				int i_91_ = ((Class102_Sub2) this).anIntArray10266[c];
				int i_92_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10217 * -994907113);
				int i_93_ = i + i_86_ * i_92_;
				int i_94_ = i_92_ - i_90_;
				int i_95_ = 0;
				int i_96_ = 0;
				if (i_86_ < 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222)) {
					int i_97_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 - i_86_);
					i_91_ -= i_97_;
					i_86_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10222) * 2029354259;
					i_96_ += i_90_ * i_97_;
					i_93_ += i_97_ * i_92_;
				}
				if (i_91_ + i_86_ > (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10223) * 1704244235)
					i_91_ -= (i_91_ + i_86_ - (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223) * 1704244235);
				if (i < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220 * 1179466163)) {
					int i_98_ = ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10220) * 1179466163 - i);
					i_90_ -= i_98_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220);
					i_96_ += i_98_;
					i_93_ += i_98_;
					i_95_ += i_98_;
					i_94_ += i_98_;
				}
				if (i_90_ + i > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
					int i_99_ = (i + i_90_ - 892939761 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221);
					i_90_ -= i_99_;
					i_95_ += i_99_;
					i_94_ += i_99_;
				}
				if (i_90_ > 0 && i_91_ > 0)
					method9540(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_87_, i_96_, i_93_, i_90_, i_91_, i_94_, i_95_, i, i_86_, ((Class102_Sub2) this).anIntArray10264[c], class167, i_88_, i_89_);
			}
		}
	}

	void method1624(char c, int i, int i_100_, int i_101_, boolean bool, Class167 class167, int i_102_, int i_103_) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			if (null == class167)
				method1609(c, i, i_100_, i_101_, bool);
			else {
				i += ((Class102_Sub2) this).anIntArray10265[c];
				i_100_ += ((Class102_Sub2) this).anIntArray10262[c];
				int i_104_ = ((Class102_Sub2) this).anIntArray10264[c];
				int i_105_ = ((Class102_Sub2) this).anIntArray10266[c];
				int i_106_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10217 * -994907113);
				int i_107_ = i + i_100_ * i_106_;
				int i_108_ = i_106_ - i_104_;
				int i_109_ = 0;
				int i_110_ = 0;
				if (i_100_ < 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222)) {
					int i_111_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 - i_100_);
					i_105_ -= i_111_;
					i_100_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10222) * 2029354259;
					i_110_ += i_104_ * i_111_;
					i_107_ += i_111_ * i_106_;
				}
				if (i_105_ + i_100_ > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223 * 1704244235))
					i_105_ -= (i_105_ + i_100_ - (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223) * 1704244235);
				if (i < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220 * 1179466163)) {
					int i_112_ = ((((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220) * 1179466163 - i);
					i_104_ -= i_112_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220);
					i_110_ += i_112_;
					i_107_ += i_112_;
					i_109_ += i_112_;
					i_108_ += i_112_;
				}
				if (i_104_ + i > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
					int i_113_ = (i + i_104_ - 892939761 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221);
					i_104_ -= i_113_;
					i_109_ += i_113_;
					i_108_ += i_113_;
				}
				if (i_104_ > 0 && i_105_ > 0)
					method9540(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_101_, i_110_, i_107_, i_104_, i_105_, i_108_, i_109_, i, i_100_, ((Class102_Sub2) this).anIntArray10264[c], class167, i_102_, i_103_);
			}
		}
	}

	void method1625(char c, int i, int i_114_, int i_115_, boolean bool, Class167 class167, int i_116_, int i_117_) {
		if ((((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218) != null) {
			if (null == class167)
				method1609(c, i, i_114_, i_115_, bool);
			else {
				i += ((Class102_Sub2) this).anIntArray10265[c];
				i_114_ += ((Class102_Sub2) this).anIntArray10262[c];
				int i_118_ = ((Class102_Sub2) this).anIntArray10264[c];
				int i_119_ = ((Class102_Sub2) this).anIntArray10266[c];
				int i_120_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10217 * -994907113);
				int i_121_ = i + i_114_ * i_120_;
				int i_122_ = i_120_ - i_118_;
				int i_123_ = 0;
				int i_124_ = 0;
				if (i_114_ < 2029354259 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222)) {
					int i_125_ = (2029354259 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10222 - i_114_);
					i_119_ -= i_125_;
					i_114_ = (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10222) * 2029354259;
					i_124_ += i_118_ * i_125_;
					i_121_ += i_125_ * i_120_;
				}
				if (i_119_ + i_114_ > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223 * 1704244235))
					i_119_ -= (i_119_ + i_114_ - (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10223) * 1704244235);
				if (i < (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220 * 1179466163)) {
					int i_126_ = ((((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220) * 1179466163 - i);
					i_118_ -= i_126_;
					i = 1179466163 * (((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10220);
					i_124_ += i_126_;
					i_121_ += i_126_;
					i_123_ += i_126_;
					i_122_ += i_126_;
				}
				if (i_118_ + i > (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anInt10221) * 892939761) {
					int i_127_ = (i + i_118_ - 892939761 * ((Class106_Sub2) (((Class102_Sub2) this).aClass106_Sub2_10267)).anInt10221);
					i_118_ -= i_127_;
					i_123_ += i_127_;
					i_122_ += i_127_;
				}
				if (i_118_ > 0 && i_119_ > 0)
					method9540(((Class102_Sub2) this).aByteArrayArray10263[c], (((Class106_Sub2) ((Class102_Sub2) this).aClass106_Sub2_10267).anIntArray10218), i_115_, i_124_, i_121_, i_118_, i_119_, i_122_, i_123_, i, i_114_, ((Class102_Sub2) this).anIntArray10264[c], class167, i_116_, i_117_);
			}
		}
	}

	static final void method9541(long l) {
		Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
		int i = (int) class240.aFloat2653 + -1037352299 * client.anInt8877;
		int i_128_ = (int) class240.aFloat2657 + 713494119 * client.anInt8663;
		if (1007135537 * Entity.anInt11674 - i < -2000 || Entity.anInt11674 * 1007135537 - i > 2000 || -1126693191 * Class165.anInt2050 - i_128_ < -2000 || -1126693191 * Class165.anInt2050 - i_128_ > 2000) {
			Entity.anInt11674 = i * 1817693649;
			Class165.anInt2050 = -1170989175 * i_128_;
		}
		if (1007135537 * Entity.anInt11674 != i) {
			int i_129_ = i - 1007135537 * Entity.anInt11674;
			int i_130_ = (int) (l * (long) i_129_ / 320L);
			if (i_129_ > 0) {
				if (0 == i_130_)
					i_130_ = 1;
				else if (i_130_ > i_129_)
					i_130_ = i_129_;
			} else if (i_130_ == 0)
				i_130_ = -1;
			else if (i_130_ < i_129_)
				i_130_ = i_129_;
			Entity.anInt11674 += 1817693649 * i_130_;
		}
		if (Class165.anInt2050 * -1126693191 != i_128_) {
			int i_131_ = i_128_ - Class165.anInt2050 * -1126693191;
			int i_132_ = (int) ((long) i_131_ * l / 320L);
			if (i_131_ > 0) {
				if (i_132_ == 0)
					i_132_ = 1;
				else if (i_132_ > i_131_)
					i_132_ = i_131_;
			} else if (i_132_ == 0)
				i_132_ = -1;
			else if (i_132_ < i_131_)
				i_132_ = i_131_;
			Class165.anInt2050 += i_132_ * -1170989175;
		}
		client.aFloat8678 += (float) l * client.aFloat8679 / 6.0F;
		client.aFloat8822 += client.aFloat8660 * (float) l / 6.0F;
		Class245.method3350(2138852627);
	}

	static final void method9542(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aByte4276;
	}
}
