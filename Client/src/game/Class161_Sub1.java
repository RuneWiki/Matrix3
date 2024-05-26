package game;

/* Class161_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub1 extends Class161 {
	boolean aBool10743;
	Interface43 anInterface43_10744;
	Interface6 anInterface6_10745;
	int anInt10746;
	int anInt10747;
	int anInt10748;
	int anInt10749;
	boolean aBool10750;
	Class106_Sub3 aClass106_Sub3_10751;
	int anInt10752;
	boolean aBool10753;
	boolean aBool10754 = false;
	boolean aBool10755;
	int anInt10756;

	void method2624(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_1_ = i_1_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_2_ = i_2_ * ((Class161_Sub1) this).anInt10747 / method2589();
				i += (((Class161_Sub1) this).anInt10752 * i_1_ / ((Class161_Sub1) this).anInt10746);
				i_0_ += (((Class161_Sub1) this).anInt10749 * i_2_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_0_, (float) (i + i_1_), (float) (i_0_ + i_2_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_4_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_5_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_3_, i_4_);
			if (((Class161_Sub1) this).aBool10754) {
				i_1_ = i_1_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_2_ = i_2_ * ((Class161_Sub1) this).anInt10747 / method2589();
				i += (((Class161_Sub1) this).anInt10752 * i_1_ / ((Class161_Sub1) this).anInt10746);
				i_0_ += (((Class161_Sub1) this).anInt10749 * i_2_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-666545461).method1648();
			float f_7_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-396991617).method1646();
			class426.aClass250_4998.method3448((float) i_1_ * 2.0F / f, (float) i_2_ * 2.0F / f_7_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_0_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_7_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public int method2587() {
		return ((Class161_Sub1) this).anInt10746;
	}

	Class161_Sub1(Class106_Sub3 class106_sub3, Interface43 interface43) {
		this(class106_sub3, interface43, interface43.method42(), interface43.method41());
	}

	Class161_Sub1(Class106_Sub3 class106_sub3, Interface43 interface43, int i, int i_8_) {
		((Class161_Sub1) this).anInt10749 = 0;
		((Class161_Sub1) this).anInt10752 = 0;
		((Class161_Sub1) this).anInt10756 = 0;
		((Class161_Sub1) this).anInt10748 = 0;
		((Class161_Sub1) this).aClass106_Sub3_10751 = class106_sub3;
		((Class161_Sub1) this).anInt10746 = i;
		((Class161_Sub1) this).anInt10747 = i_8_;
		((Class161_Sub1) this).anInterface43_10744 = interface43;
		((Class161_Sub1) this).anInterface6_10745 = null;
		((Class161_Sub1) this).aBool10750 = ((Class161_Sub1) this).anInterface43_10744.method42() != i;
		((Class161_Sub1) this).aBool10753 = ((Class161_Sub1) this).anInterface43_10744.method41() != i_8_;
		((Class161_Sub1) this).aBool10755 = (!((Class161_Sub1) this).aBool10750 && ((Class161_Sub1) this).anInterface43_10744.method228());
		((Class161_Sub1) this).aBool10743 = (!((Class161_Sub1) this).aBool10753 && ((Class161_Sub1) this).anInterface43_10744.method228());
	}

	public void method2607(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		((Class161_Sub1) this).anInterface43_10744.method246(i, i_9_, i_10_, i_11_, i_12_, i_13_);
	}

	public void method2594(int i, int i_14_, int i_15_) {
		int[] is = (((Class161_Sub1) this).aClass106_Sub3_10751.method1696(i, i_14_, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747));
		int[] is_16_ = new int[(((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInt10747)];
		((Class161_Sub1) this).anInterface43_10744.method232(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_16_, 0);
		if (i_15_ == 0) {
			for (int i_17_ = 0; i_17_ < ((Class161_Sub1) this).anInt10747; i_17_++) {
				int i_18_ = i_17_ * ((Class161_Sub1) this).anInt10746;
				for (int i_19_ = 0; i_19_ < ((Class161_Sub1) this).anInt10746; i_19_++)
					is_16_[i_18_ + i_19_] = (is_16_[i_18_ + i_19_] & 0xffffff | is[i_18_ + i_19_] << 8 & ~0xffffff);
			}
		} else if (i_15_ == 1) {
			for (int i_20_ = 0; i_20_ < ((Class161_Sub1) this).anInt10747; i_20_++) {
				int i_21_ = i_20_ * ((Class161_Sub1) this).anInt10746;
				for (int i_22_ = 0; i_22_ < ((Class161_Sub1) this).anInt10746; i_22_++)
					is_16_[i_21_ + i_22_] = (is_16_[i_21_ + i_22_] & 0xffffff | is[i_21_ + i_22_] << 16 & ~0xffffff);
			}
		} else if (i_15_ == 2) {
			for (int i_23_ = 0; i_23_ < ((Class161_Sub1) this).anInt10747; i_23_++) {
				int i_24_ = i_23_ * ((Class161_Sub1) this).anInt10746;
				for (int i_25_ = 0; i_25_ < ((Class161_Sub1) this).anInt10746; i_25_++)
					is_16_[i_24_ + i_25_] = (is_16_[i_24_ + i_25_] & 0xffffff | is[i_24_ + i_25_] << 24 & ~0xffffff);
			}
		} else if (i_15_ == 3) {
			for (int i_26_ = 0; i_26_ < ((Class161_Sub1) this).anInt10747; i_26_++) {
				int i_27_ = i_26_ * ((Class161_Sub1) this).anInt10746;
				for (int i_28_ = 0; i_28_ < ((Class161_Sub1) this).anInt10746; i_28_++)
					is_16_[i_27_ + i_28_] = (is_16_[i_27_ + i_28_] & 0xffffff | (is[i_27_ + i_28_] != 0 ? -16777216 : 0));
			}
		}
		method2591(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_16_, 0, ((Class161_Sub1) this).anInt10746);
	}

	public void method2611(int i, int i_29_, int i_30_, int i_31_, int[] is, int[] is_32_, int i_33_, int i_34_) {
		((Class161_Sub1) this).anInterface43_10744.method233(i, i_29_, i_30_, i_31_, is, is_32_, i_33_);
	}

	public void method2630(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			int i_41_ = i_35_ + i_37_;
			int i_42_ = i + i_36_;
			int i_43_ = method45();
			int i_44_ = method2589();
			int i_45_ = i_35_ + ((Class161_Sub1) this).anInt10749;
			for (int i_46_ = i_45_ + ((Class161_Sub1) this).anInt10747; i_46_ <= i_41_; i_46_ += i_44_) {
				int i_47_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_48_ = i_47_ + ((Class161_Sub1) this).anInt10746; i_48_ <= i_42_; i_48_ += i_43_) {
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_47_, (float) i_45_, (float) (i_47_ + ((Class161_Sub1) this).anInt10746), (float) (i_45_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_39_);
					i_47_ += i_43_;
				}
				if (i_47_ < i_42_) {
					int i_49_ = i_42_ - i_47_;
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_47_, (float) i_45_, (float) (i_47_ + i_49_), (float) (i_45_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((float) i_49_ / (float) ((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInterface43_10744.method235()), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_39_);
				}
				i_45_ += i_44_;
			}
			if (i_45_ < i_41_) {
				int i_50_ = i_41_ - i_45_;
				float f = ((float) i_50_ / (float) ((Class161_Sub1) this).anInt10747 * ((Class161_Sub1) this).anInterface43_10744.method257());
				int i_51_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_52_ = i_51_ + ((Class161_Sub1) this).anInt10746; i_52_ <= i_42_; i_52_ += i_43_) {
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_51_, (float) i_45_, (float) (i_51_ + ((Class161_Sub1) this).anInt10746), (float) (i_45_ + i_50_), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), f, ((Class161_Sub1) this).anInterface43_10744, i_39_);
					i_51_ += i_43_;
				}
				if (i_51_ < i_42_) {
					int i_53_ = i_42_ - i_51_;
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_51_, (float) i_45_, (float) (i_51_ + i_53_), (float) (i_45_ + i_50_), 0.0F, 0.0F, ((float) i_53_ / (float) ((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInterface43_10744.method235()), f, ((Class161_Sub1) this).anInterface43_10744, i_39_);
				}
			}
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_40_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_38_, i_39_);
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-351150302).method1648();
			float f_54_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(320244498).method1646();
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			boolean bool = (((Class161_Sub1) this).aBool10743 && ((Class161_Sub1) this).anInt10749 == 0 && ((Class161_Sub1) this).anInt10756 == 0);
			boolean bool_55_ = (((Class161_Sub1) this).aBool10755 && ((Class161_Sub1) this).anInt10752 == 0 && ((Class161_Sub1) this).anInt10748 == 0);
			if (bool_55_ & bool) {
				class426.aClass250_4998.method3448((float) i_36_ * 2.0F / f, ((float) i_37_ * 2.0F / f_54_), 1.0F, 1.0F);
				class426.aClass250_4998.aFloatArray2728[12] = ((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
				class426.aClass250_4998.aFloatArray2728[13] = (((float) i_35_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_) - 1.0F;
				class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_36_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_37_), 1.0F, 1.0F);
				class426.method5180();
			} else if (bool_55_) {
				int i_56_ = i_35_ + i_37_;
				int i_57_ = method2589();
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_36_), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
				int i_58_ = i_35_ + ((Class161_Sub1) this).anInt10749;
				for (int i_59_ = i_58_ + ((Class161_Sub1) this).anInt10747; i_59_ <= i_56_; i_59_ += i_57_) {
					class426.aClass250_4998.method3448((float) i_36_ * 2.0F / f, ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_54_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_58_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
					i_58_ += i_57_;
				}
				if (i_58_ < i_56_) {
					int i_60_ = i_56_ - i_58_;
					class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_36_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_60_), 1.0F, 1.0F);
					class426.aClass250_4998.method3448(((float) i_36_ * 2.0F / f), ((float) i_60_ * 2.0F / f_54_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_58_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
				}
			} else if (bool) {
				int i_61_ = i + i_36_;
				int i_62_ = method45();
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_37_), 1.0F, 1.0F);
				int i_63_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_64_ = i_63_ + ((Class161_Sub1) this).anInt10746; i_64_ <= i_61_; i_64_ += i_62_) {
					class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) i_37_ * 2.0F / f_54_, 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = ((float) i_63_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_35_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
					i_63_ += i_62_;
				}
				if (i_63_ < i_61_) {
					int i_65_ = i_61_ - i_63_;
					class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_65_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_37_), 1.0F, 1.0F);
					class426.aClass250_4998.method3448(((float) i_65_ * 2.0F / f), ((float) i_37_ * 2.0F / f_54_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = ((float) i_63_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_35_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
				}
			} else {
				int i_66_ = i_35_ + i_37_;
				int i_67_ = i + i_36_;
				int i_68_ = method45();
				int i_69_ = method2589();
				int i_70_ = i_35_ + ((Class161_Sub1) this).anInt10749;
				for (int i_71_ = i_70_ + ((Class161_Sub1) this).anInt10747; i_71_ <= i_66_; i_71_ += i_69_) {
					class426.aClass250_4997.method3448((((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746)), (((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747)), 1.0F, 1.0F);
					int i_72_ = i + ((Class161_Sub1) this).anInt10752;
					for (int i_73_ = i_72_ + ((Class161_Sub1) this).anInt10746; i_73_ <= i_67_; i_73_ += i_68_) {
						class426.aClass250_4998.method3448(((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f), ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_54_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_72_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_70_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
						i_72_ += i_68_;
					}
					if (i_72_ < i_67_) {
						int i_74_ = i_67_ - i_72_;
						class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_74_), (((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747)), 1.0F, 1.0F);
						class426.aClass250_4998.method3448((float) i_74_ * 2.0F / f, ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_54_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_72_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_70_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
					}
					i_70_ += i_69_;
				}
				if (i_70_ < i_66_) {
					int i_75_ = i_66_ - i_70_;
					class426.aClass250_4997.method3448((((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746)), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_75_), 1.0F, 1.0F);
					int i_76_ = i + ((Class161_Sub1) this).anInt10752;
					for (int i_77_ = i_76_ + ((Class161_Sub1) this).anInt10746; i_77_ <= i_67_; i_77_ += i_68_) {
						class426.aClass250_4998.method3448(((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f), (float) i_75_ * 2.0F / f_54_, 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_76_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_70_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
						i_76_ += i_68_;
					}
					if (i_76_ < i_67_) {
						int i_78_ = i_67_ - i_76_;
						class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_78_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_75_), 1.0F, 1.0F);
						class426.aClass250_4998.method3448(((float) i_78_ * 2.0F / f), ((float) i_75_ * 2.0F / f_54_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_76_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_70_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_54_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
					}
				}
			}
		}
	}

	public void method2638(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			int i_85_ = i_79_ + i_81_;
			int i_86_ = i + i_80_;
			int i_87_ = method45();
			int i_88_ = method2589();
			int i_89_ = i_79_ + ((Class161_Sub1) this).anInt10749;
			for (int i_90_ = i_89_ + ((Class161_Sub1) this).anInt10747; i_90_ <= i_85_; i_90_ += i_88_) {
				int i_91_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_92_ = i_91_ + ((Class161_Sub1) this).anInt10746; i_92_ <= i_86_; i_92_ += i_87_) {
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_91_, (float) i_89_, (float) (i_91_ + ((Class161_Sub1) this).anInt10746), (float) (i_89_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_83_);
					i_91_ += i_87_;
				}
				if (i_91_ < i_86_) {
					int i_93_ = i_86_ - i_91_;
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_91_, (float) i_89_, (float) (i_91_ + i_93_), (float) (i_89_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((float) i_93_ / (float) ((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInterface43_10744.method235()), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_83_);
				}
				i_89_ += i_88_;
			}
			if (i_89_ < i_85_) {
				int i_94_ = i_85_ - i_89_;
				float f = ((float) i_94_ / (float) ((Class161_Sub1) this).anInt10747 * ((Class161_Sub1) this).anInterface43_10744.method257());
				int i_95_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_96_ = i_95_ + ((Class161_Sub1) this).anInt10746; i_96_ <= i_86_; i_96_ += i_87_) {
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_95_, (float) i_89_, (float) (i_95_ + ((Class161_Sub1) this).anInt10746), (float) (i_89_ + i_94_), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), f, ((Class161_Sub1) this).anInterface43_10744, i_83_);
					i_95_ += i_87_;
				}
				if (i_95_ < i_86_) {
					int i_97_ = i_86_ - i_95_;
					((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i_95_, (float) i_89_, (float) (i_95_ + i_97_), (float) (i_89_ + i_94_), 0.0F, 0.0F, ((float) i_97_ / (float) ((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInterface43_10744.method235()), f, ((Class161_Sub1) this).anInterface43_10744, i_83_);
				}
			}
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_84_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_82_, i_83_);
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1126781035).method1648();
			float f_98_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(77793776).method1646();
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			boolean bool = (((Class161_Sub1) this).aBool10743 && ((Class161_Sub1) this).anInt10749 == 0 && ((Class161_Sub1) this).anInt10756 == 0);
			boolean bool_99_ = (((Class161_Sub1) this).aBool10755 && ((Class161_Sub1) this).anInt10752 == 0 && ((Class161_Sub1) this).anInt10748 == 0);
			if (bool_99_ & bool) {
				class426.aClass250_4998.method3448((float) i_80_ * 2.0F / f, ((float) i_81_ * 2.0F / f_98_), 1.0F, 1.0F);
				class426.aClass250_4998.aFloatArray2728[12] = ((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
				class426.aClass250_4998.aFloatArray2728[13] = (((float) i_79_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_) - 1.0F;
				class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_80_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_81_), 1.0F, 1.0F);
				class426.method5180();
			} else if (bool_99_) {
				int i_100_ = i_79_ + i_81_;
				int i_101_ = method2589();
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_80_), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
				int i_102_ = i_79_ + ((Class161_Sub1) this).anInt10749;
				for (int i_103_ = i_102_ + ((Class161_Sub1) this).anInt10747; i_103_ <= i_100_; i_103_ += i_101_) {
					class426.aClass250_4998.method3448((float) i_80_ * 2.0F / f, ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_98_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_102_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
					i_102_ += i_101_;
				}
				if (i_102_ < i_100_) {
					int i_104_ = i_100_ - i_102_;
					class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_80_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_104_), 1.0F, 1.0F);
					class426.aClass250_4998.method3448(((float) i_80_ * 2.0F / f), ((float) i_104_ * 2.0F / f_98_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_102_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
				}
			} else if (bool) {
				int i_105_ = i + i_80_;
				int i_106_ = method45();
				class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_81_), 1.0F, 1.0F);
				int i_107_ = i + ((Class161_Sub1) this).anInt10752;
				for (int i_108_ = i_107_ + ((Class161_Sub1) this).anInt10746; i_108_ <= i_105_; i_108_ += i_106_) {
					class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) i_81_ * 2.0F / f_98_, 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = ((float) i_107_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_79_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
					i_107_ += i_106_;
				}
				if (i_107_ < i_105_) {
					int i_109_ = i_105_ - i_107_;
					class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_109_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_81_), 1.0F, 1.0F);
					class426.aClass250_4998.method3448(((float) i_109_ * 2.0F / f), ((float) i_81_ * 2.0F / f_98_), 1.0F, 1.0F);
					class426.aClass250_4998.aFloatArray2728[12] = ((float) i_107_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
					class426.aClass250_4998.aFloatArray2728[13] = ((float) i_79_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
					class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
					class426.method5180();
				}
			} else {
				int i_110_ = i_79_ + i_81_;
				int i_111_ = i + i_80_;
				int i_112_ = method45();
				int i_113_ = method2589();
				int i_114_ = i_79_ + ((Class161_Sub1) this).anInt10749;
				for (int i_115_ = i_114_ + ((Class161_Sub1) this).anInt10747; i_115_ <= i_110_; i_115_ += i_113_) {
					class426.aClass250_4997.method3448((((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746)), (((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747)), 1.0F, 1.0F);
					int i_116_ = i + ((Class161_Sub1) this).anInt10752;
					for (int i_117_ = i_116_ + ((Class161_Sub1) this).anInt10746; i_117_ <= i_111_; i_117_ += i_112_) {
						class426.aClass250_4998.method3448(((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f), ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_98_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_116_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_114_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
						i_116_ += i_112_;
					}
					if (i_116_ < i_111_) {
						int i_118_ = i_111_ - i_116_;
						class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_118_), (((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747)), 1.0F, 1.0F);
						class426.aClass250_4998.method3448((float) i_118_ * 2.0F / f, ((float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_98_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_116_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_114_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
					}
					i_114_ += i_113_;
				}
				if (i_114_ < i_110_) {
					int i_119_ = i_110_ - i_114_;
					class426.aClass250_4997.method3448((((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746)), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_119_), 1.0F, 1.0F);
					int i_120_ = i + ((Class161_Sub1) this).anInt10752;
					for (int i_121_ = i_120_ + ((Class161_Sub1) this).anInt10746; i_121_ <= i_111_; i_121_ += i_112_) {
						class426.aClass250_4998.method3448(((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f), (float) i_119_ * 2.0F / f_98_, 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_120_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_114_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
						i_120_ += i_112_;
					}
					if (i_120_ < i_111_) {
						int i_122_ = i_111_ - i_120_;
						class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) i_122_), ((Class161_Sub1) this).anInterface43_10744.method224((float) i_119_), 1.0F, 1.0F);
						class426.aClass250_4998.method3448(((float) i_122_ * 2.0F / f), ((float) i_119_ * 2.0F / f_98_), 1.0F, 1.0F);
						class426.aClass250_4998.aFloatArray2728[12] = ((float) i_120_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f - 1.0F;
						class426.aClass250_4998.aFloatArray2728[13] = ((float) i_114_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_98_ - 1.0F;
						class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
						class426.method5180();
					}
				}
			}
		}
	}

	public int method45() {
		return (((Class161_Sub1) this).anInt10746 + ((Class161_Sub1) this).anInt10752 + ((Class161_Sub1) this).anInt10748);
	}

	public void method2649(int[] is) {
		is[0] = ((Class161_Sub1) this).anInt10752;
		is[1] = ((Class161_Sub1) this).anInt10749;
		is[2] = ((Class161_Sub1) this).anInt10748;
		is[3] = ((Class161_Sub1) this).anInt10756;
	}

	public int method2602() {
		return ((Class161_Sub1) this).anInt10746;
	}

	public Interface6 method2590() {
		return ((Class161_Sub1) this).anInterface6_10745;
	}

	public void method2591(int i, int i_123_, int i_124_, int i_125_, int[] is, int i_126_, int i_127_) {
		((Class161_Sub1) this).anInterface43_10744.method230(i, i_123_, i_124_, i_125_, is, i_126_, i_127_);
	}

	public void method2592(int i, int i_128_, int i_129_, int i_130_, int[] is, int[] is_131_, int i_132_, int i_133_) {
		((Class161_Sub1) this).anInterface43_10744.method233(i, i_128_, i_129_, i_130_, is, is_131_, i_132_);
	}

	public void method2619(int i, int i_134_, int i_135_, int i_136_, int i_137_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			i += ((Class161_Sub1) this).anInt10752;
			i_134_ += ((Class161_Sub1) this).anInt10749;
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_134_, (float) (i + ((Class161_Sub1) this).anInt10746), (float) (i_134_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_136_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_137_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_135_, i_136_);
			i += ((Class161_Sub1) this).anInt10752;
			i_134_ += ((Class161_Sub1) this).anInt10749;
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-252670480).method1648();
			float f_138_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(431969470).method1646();
			class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_138_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_134_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_138_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public int method2589() {
		return (((Class161_Sub1) this).anInt10747 + ((Class161_Sub1) this).anInt10749 + ((Class161_Sub1) this).anInt10756);
	}

	void method2599(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_140_ = i_140_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_141_ = (i_141_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_140_ / ((Class161_Sub1) this).anInt10746);
				i_139_ += (((Class161_Sub1) this).anInt10749 * i_141_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_139_, (float) (i + i_140_), (float) (i_139_ + i_141_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_143_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_144_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_142_, i_143_);
			if (((Class161_Sub1) this).aBool10754) {
				i_140_ = i_140_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_141_ = (i_141_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_140_ / ((Class161_Sub1) this).anInt10746);
				i_139_ += (((Class161_Sub1) this).anInt10749 * i_141_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1462082207).method1648();
			float f_146_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1742327256).method1646();
			class426.aClass250_4998.method3448((float) i_140_ * 2.0F / f, (float) i_141_ * 2.0F / f_146_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_139_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_146_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2596(int i, int i_147_, Class167 class167, int i_148_, int i_149_) {
		((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
		Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
		class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
		class426.method5179(1, -1);
		i += ((Class161_Sub1) this).anInt10752;
		i_147_ += ((Class161_Sub1) this).anInt10749;
		float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(186272474).method1648();
		float f_150_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1409855325).method1646();
		class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_150_, 1.0F, 1.0F);
		class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[13] = (((float) i_147_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_150_) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
		class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
		class426.anInt4995 = 0;
		class426.aClass362_5003 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass362_10497);
		Interface43 interface43 = ((Class167_Sub3) (Class167_Sub3) class167).anInterface43_10964;
		class426.anInterface43_5002 = interface43;
		class426.aClass250_5000.method3448(interface43.method226((float) ((Class161_Sub1) this).anInt10746), interface43.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.aClass250_5000.aFloatArray2728[12] = interface43.method226((float) (i - i_148_));
		class426.aClass250_5000.aFloatArray2728[13] = interface43.method224((float) (i_147_ - i_149_));
		class426.method5181();
	}

	public void method2601(int i, int i_151_, int i_152_) {
		int[] is = (((Class161_Sub1) this).aClass106_Sub3_10751.method1696(i, i_151_, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747));
		int[] is_153_ = new int[(((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInt10747)];
		((Class161_Sub1) this).anInterface43_10744.method232(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_153_, 0);
		if (i_152_ == 0) {
			for (int i_154_ = 0; i_154_ < ((Class161_Sub1) this).anInt10747; i_154_++) {
				int i_155_ = i_154_ * ((Class161_Sub1) this).anInt10746;
				for (int i_156_ = 0; i_156_ < ((Class161_Sub1) this).anInt10746; i_156_++)
					is_153_[i_155_ + i_156_] = (is_153_[i_155_ + i_156_] & 0xffffff | is[i_155_ + i_156_] << 8 & ~0xffffff);
			}
		} else if (i_152_ == 1) {
			for (int i_157_ = 0; i_157_ < ((Class161_Sub1) this).anInt10747; i_157_++) {
				int i_158_ = i_157_ * ((Class161_Sub1) this).anInt10746;
				for (int i_159_ = 0; i_159_ < ((Class161_Sub1) this).anInt10746; i_159_++)
					is_153_[i_158_ + i_159_] = (is_153_[i_158_ + i_159_] & 0xffffff | is[i_158_ + i_159_] << 16 & ~0xffffff);
			}
		} else if (i_152_ == 2) {
			for (int i_160_ = 0; i_160_ < ((Class161_Sub1) this).anInt10747; i_160_++) {
				int i_161_ = i_160_ * ((Class161_Sub1) this).anInt10746;
				for (int i_162_ = 0; i_162_ < ((Class161_Sub1) this).anInt10746; i_162_++)
					is_153_[i_161_ + i_162_] = (is_153_[i_161_ + i_162_] & 0xffffff | is[i_161_ + i_162_] << 24 & ~0xffffff);
			}
		} else if (i_152_ == 3) {
			for (int i_163_ = 0; i_163_ < ((Class161_Sub1) this).anInt10747; i_163_++) {
				int i_164_ = i_163_ * ((Class161_Sub1) this).anInt10746;
				for (int i_165_ = 0; i_165_ < ((Class161_Sub1) this).anInt10746; i_165_++)
					is_153_[i_164_ + i_165_] = (is_153_[i_164_ + i_165_] & 0xffffff | (is[i_164_ + i_165_] != 0 ? -16777216 : 0));
			}
		}
		method2591(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_153_, 0, ((Class161_Sub1) this).anInt10746);
	}

	void method2610(float f, float f_166_, float f_167_, float f_168_, float f_169_, float f_170_, int i, Class167 class167, int i_171_, int i_172_) {
		((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
		Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
		class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
		class426.method5179(1, -1);
		float f_173_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-29602178).method1648();
		float f_174_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(522983617).method1646();
		class426.aClass250_4998.method3444();
		if (((Class161_Sub1) this).aBool10754) {
			float f_175_ = ((float) ((Class161_Sub1) this).anInt10746 / (float) method45());
			float f_176_ = ((float) ((Class161_Sub1) this).anInt10747 / (float) method2589());
			class426.aClass250_4998.aFloatArray2728[0] = (f_167_ - f) * f_175_;
			class426.aClass250_4998.aFloatArray2728[1] = (f_168_ - f_166_) * f_175_;
			class426.aClass250_4998.aFloatArray2728[4] = (f_169_ - f) * f_176_;
			class426.aClass250_4998.aFloatArray2728[5] = (f_170_ - f_166_) * f_176_;
			class426.aClass250_4998.aFloatArray2728[12] = ((f + (float) ((Class161_Sub1) this).anInt10752) * f_175_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
			class426.aClass250_4998.aFloatArray2728[13] = (((f_166_ + (float) ((Class161_Sub1) this).anInt10749) * f_176_) + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
		} else {
			class426.aClass250_4998.aFloatArray2728[0] = f_167_ - f;
			class426.aClass250_4998.aFloatArray2728[1] = f_168_ - f_166_;
			class426.aClass250_4998.aFloatArray2728[4] = f_169_ - f;
			class426.aClass250_4998.aFloatArray2728[5] = f_170_ - f_166_;
			class426.aClass250_4998.aFloatArray2728[12] = f + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590();
			class426.aClass250_4998.aFloatArray2728[13] = (f_166_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
		}
		Class250 class250 = ((Class161_Sub1) this).aClass106_Sub3_10751.aClass250_10399;
		class250.method3444();
		class250.aFloatArray2728[0] = 2.0F / f_173_;
		class250.aFloatArray2728[5] = 2.0F / f_174_;
		class250.aFloatArray2728[12] = -1.0F;
		class250.aFloatArray2728[13] = -1.0F;
		class250.aFloatArray2728[14] = -1.0F;
		class426.aClass250_4998.method3445(class250);
		class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
		class426.anInt4995 = 0;
		class426.aClass362_5003 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass362_10497);
		Interface43 interface43 = ((Class167_Sub3) (Class167_Sub3) class167).anInterface43_10964;
		class426.anInterface43_5002 = interface43;
		class426.aClass250_5000.method3444();
		class426.aClass250_5000.aFloatArray2728[0] = (f_167_ - f) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[1] = (f_168_ - f_166_) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[4] = (f_169_ - f) * interface43.method224(1.0F);
		class426.aClass250_5000.aFloatArray2728[5] = (f_170_ - f_166_) * interface43.method224(1.0F);
		class426.aClass250_5000.aFloatArray2728[12] = (f - (float) i_171_) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[13] = (f_166_ - (float) i_172_) * interface43.method224(1.0F);
		class426.method5181();
	}

	public int method2647() {
		return ((Class161_Sub1) this).anInt10747;
	}

	public void method2617(int i, int i_177_, int i_178_, int i_179_, int i_180_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			i += ((Class161_Sub1) this).anInt10752;
			i_177_ += ((Class161_Sub1) this).anInt10749;
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_177_, (float) (i + ((Class161_Sub1) this).anInt10746), (float) (i_177_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_179_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_180_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_178_, i_179_);
			i += ((Class161_Sub1) this).anInt10752;
			i_177_ += ((Class161_Sub1) this).anInt10749;
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(764564923).method1648();
			float f_181_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1770133894).method1646();
			class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_181_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_177_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_181_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2613(int i, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_) {
		((Class161_Sub1) this).anInterface43_10744.method246(i, i_182_, i_183_, i_184_, i_185_, i_186_);
	}

	public int method2588() {
		return ((Class161_Sub1) this).anInt10747;
	}

	public void method2615(int i, int i_187_, int i_188_) {
		int[] is = (((Class161_Sub1) this).aClass106_Sub3_10751.method1696(i, i_187_, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747));
		int[] is_189_ = new int[(((Class161_Sub1) this).anInt10746 * ((Class161_Sub1) this).anInt10747)];
		((Class161_Sub1) this).anInterface43_10744.method232(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_189_, 0);
		if (i_188_ == 0) {
			for (int i_190_ = 0; i_190_ < ((Class161_Sub1) this).anInt10747; i_190_++) {
				int i_191_ = i_190_ * ((Class161_Sub1) this).anInt10746;
				for (int i_192_ = 0; i_192_ < ((Class161_Sub1) this).anInt10746; i_192_++)
					is_189_[i_191_ + i_192_] = (is_189_[i_191_ + i_192_] & 0xffffff | is[i_191_ + i_192_] << 8 & ~0xffffff);
			}
		} else if (i_188_ == 1) {
			for (int i_193_ = 0; i_193_ < ((Class161_Sub1) this).anInt10747; i_193_++) {
				int i_194_ = i_193_ * ((Class161_Sub1) this).anInt10746;
				for (int i_195_ = 0; i_195_ < ((Class161_Sub1) this).anInt10746; i_195_++)
					is_189_[i_194_ + i_195_] = (is_189_[i_194_ + i_195_] & 0xffffff | is[i_194_ + i_195_] << 16 & ~0xffffff);
			}
		} else if (i_188_ == 2) {
			for (int i_196_ = 0; i_196_ < ((Class161_Sub1) this).anInt10747; i_196_++) {
				int i_197_ = i_196_ * ((Class161_Sub1) this).anInt10746;
				for (int i_198_ = 0; i_198_ < ((Class161_Sub1) this).anInt10746; i_198_++)
					is_189_[i_197_ + i_198_] = (is_189_[i_197_ + i_198_] & 0xffffff | is[i_197_ + i_198_] << 24 & ~0xffffff);
			}
		} else if (i_188_ == 3) {
			for (int i_199_ = 0; i_199_ < ((Class161_Sub1) this).anInt10747; i_199_++) {
				int i_200_ = i_199_ * ((Class161_Sub1) this).anInt10746;
				for (int i_201_ = 0; i_201_ < ((Class161_Sub1) this).anInt10746; i_201_++)
					is_189_[i_200_ + i_201_] = (is_189_[i_200_ + i_201_] & 0xffffff | (is[i_200_ + i_201_] != 0 ? -16777216 : 0));
			}
		}
		method2591(0, 0, ((Class161_Sub1) this).anInt10746, ((Class161_Sub1) this).anInt10747, is_189_, 0, ((Class161_Sub1) this).anInt10746);
	}

	public Interface6 method2616() {
		return ((Class161_Sub1) this).anInterface6_10745;
	}

	public Interface6 method2642() {
		return ((Class161_Sub1) this).anInterface6_10745;
	}

	void method2608(float f, float f_202_, float f_203_, float f_204_, float f_205_, float f_206_, int i, int i_207_, int i_208_, int i_209_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397)
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3926(f, f_202_, f_203_, f_204_, f_205_, f_206_, f_203_ + f_205_ - f, f_204_ + f_206_ - f_202_, 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_207_);
		else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_208_);
			if (((Class161_Sub1) this).aBool10754) {
				float f_210_ = (float) method45();
				float f_211_ = (float) method2589();
				float f_212_ = (f_203_ - f) / f_210_;
				float f_213_ = (f_204_ - f_202_) / f_210_;
				float f_214_ = (f_205_ - f) / f_211_;
				float f_215_ = (f_206_ - f_202_) / f_211_;
				float f_216_ = f_214_ * (float) ((Class161_Sub1) this).anInt10749;
				float f_217_ = f_215_ * (float) ((Class161_Sub1) this).anInt10749;
				float f_218_ = f_212_ * (float) ((Class161_Sub1) this).anInt10752;
				float f_219_ = f_213_ * (float) ((Class161_Sub1) this).anInt10752;
				float f_220_ = -f_212_ * (float) ((Class161_Sub1) this).anInt10748;
				float f_221_ = -f_213_ * (float) ((Class161_Sub1) this).anInt10748;
				float f_222_ = -f_214_ * (float) ((Class161_Sub1) this).anInt10756;
				float f_223_ = -f_215_ * (float) ((Class161_Sub1) this).anInt10756;
				f = f + f_218_ + f_216_;
				f_202_ = f_202_ + f_219_ + f_217_;
				f_203_ = f_203_ + f_220_ + f_216_;
				f_204_ = f_204_ + f_221_ + f_217_;
				f_205_ = f_205_ + f_218_ + f_222_;
				f_206_ = f_206_ + f_219_ + f_223_;
			}
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i, i_207_);
			float f_224_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(2135991201).method1648();
			float f_225_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1954648179).method1646();
			class426.aClass250_4998.method3444();
			class426.aClass250_4998.aFloatArray2728[0] = (f_203_ - f) * 2.0F / f_224_;
			class426.aClass250_4998.aFloatArray2728[1] = (f_204_ - f_202_) * 2.0F / f_225_;
			class426.aClass250_4998.aFloatArray2728[4] = (f_205_ - f) * 2.0F / f_224_;
			class426.aClass250_4998.aFloatArray2728[5] = (f_206_ - f_202_) * 2.0F / f_225_;
			class426.aClass250_4998.aFloatArray2728[12] = ((f + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_224_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = ((f_202_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_225_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2618(int i, int i_226_, int i_227_, int i_228_, int i_229_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			i += ((Class161_Sub1) this).anInt10752;
			i_226_ += ((Class161_Sub1) this).anInt10749;
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_226_, (float) (i + ((Class161_Sub1) this).anInt10746), (float) (i_226_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_228_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_229_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_227_, i_228_);
			i += ((Class161_Sub1) this).anInt10752;
			i_226_ += ((Class161_Sub1) this).anInt10749;
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1165983882).method1648();
			float f_230_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(86576708).method1646();
			class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_230_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_226_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_230_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2646(int i, int i_231_, int i_232_, int i_233_, int i_234_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			i += ((Class161_Sub1) this).anInt10752;
			i_231_ += ((Class161_Sub1) this).anInt10749;
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_231_, (float) (i + ((Class161_Sub1) this).anInt10746), (float) (i_231_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_233_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_234_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_232_, i_233_);
			i += ((Class161_Sub1) this).anInt10752;
			i_231_ += ((Class161_Sub1) this).anInt10749;
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1934290224).method1648();
			float f_235_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1875863474).method1646();
			class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_235_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_231_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_235_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2644(int i, int i_236_, int i_237_, int i_238_, int i_239_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			i += ((Class161_Sub1) this).anInt10752;
			i_236_ += ((Class161_Sub1) this).anInt10749;
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_236_, (float) (i + ((Class161_Sub1) this).anInt10746), (float) (i_236_ + ((Class161_Sub1) this).anInt10747), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_238_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_239_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_237_, i_238_);
			i += ((Class161_Sub1) this).anInt10752;
			i_236_ += ((Class161_Sub1) this).anInt10749;
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1066452923).method1648();
			float f_240_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(566849582).method1646();
			class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_240_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_236_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_240_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public void method2620(int i, int i_241_, Class167 class167, int i_242_, int i_243_) {
		((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
		Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
		class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
		class426.method5179(1, -1);
		i += ((Class161_Sub1) this).anInt10752;
		i_241_ += ((Class161_Sub1) this).anInt10749;
		float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1486613598).method1648();
		float f_244_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(907065445).method1646();
		class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_244_, 1.0F, 1.0F);
		class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[13] = (((float) i_241_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_244_) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
		class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
		class426.anInt4995 = 0;
		class426.aClass362_5003 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass362_10497);
		Interface43 interface43 = ((Class167_Sub3) (Class167_Sub3) class167).anInterface43_10964;
		class426.anInterface43_5002 = interface43;
		class426.aClass250_5000.method3448(interface43.method226((float) ((Class161_Sub1) this).anInt10746), interface43.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.aClass250_5000.aFloatArray2728[12] = interface43.method226((float) (i - i_242_));
		class426.aClass250_5000.aFloatArray2728[13] = interface43.method224((float) (i_241_ - i_243_));
		class426.method5181();
	}

	public void method2626(int i, int i_245_, Class167 class167, int i_246_, int i_247_) {
		((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
		Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
		class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
		class426.method5179(1, -1);
		i += ((Class161_Sub1) this).anInt10752;
		i_245_ += ((Class161_Sub1) this).anInt10749;
		float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(367942799).method1648();
		float f_248_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-130014144).method1646();
		class426.aClass250_4998.method3448((float) ((Class161_Sub1) this).anInt10746 * 2.0F / f, (float) ((Class161_Sub1) this).anInt10747 * 2.0F / f_248_, 1.0F, 1.0F);
		class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[13] = (((float) i_245_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_248_) - 1.0F;
		class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
		class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
		class426.anInt4995 = 0;
		class426.aClass362_5003 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass362_10497);
		Interface43 interface43 = ((Class167_Sub3) (Class167_Sub3) class167).anInterface43_10964;
		class426.anInterface43_5002 = interface43;
		class426.aClass250_5000.method3448(interface43.method226((float) ((Class161_Sub1) this).anInt10746), interface43.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.aClass250_5000.aFloatArray2728[12] = interface43.method226((float) (i - i_246_));
		class426.aClass250_5000.aFloatArray2728[13] = interface43.method224((float) (i_245_ - i_247_));
		class426.method5181();
	}

	void method2622(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_250_ = i_250_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_251_ = (i_251_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_250_ / ((Class161_Sub1) this).anInt10746);
				i_249_ += (((Class161_Sub1) this).anInt10749 * i_251_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_249_, (float) (i + i_250_), (float) (i_249_ + i_251_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_253_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_254_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_252_, i_253_);
			if (((Class161_Sub1) this).aBool10754) {
				i_250_ = i_250_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_251_ = (i_251_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_250_ / ((Class161_Sub1) this).anInt10746);
				i_249_ += (((Class161_Sub1) this).anInt10749 * i_251_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-839800086).method1648();
			float f_256_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1215243629).method1646();
			class426.aClass250_4998.method3448((float) i_250_ * 2.0F / f, (float) i_251_ * 2.0F / f_256_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_249_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_256_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	void method2623(int i, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_258_ = i_258_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_259_ = (i_259_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_258_ / ((Class161_Sub1) this).anInt10746);
				i_257_ += (((Class161_Sub1) this).anInt10749 * i_259_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_257_, (float) (i + i_258_), (float) (i_257_ + i_259_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_261_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_262_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_260_, i_261_);
			if (((Class161_Sub1) this).aBool10754) {
				i_258_ = i_258_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_259_ = (i_259_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_258_ / ((Class161_Sub1) this).anInt10746);
				i_257_ += (((Class161_Sub1) this).anInt10749 * i_259_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1645997083).method1648();
			float f_264_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1626152017).method1646();
			class426.aClass250_4998.method3448((float) i_258_ * 2.0F / f, (float) i_259_ * 2.0F / f_264_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_257_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_264_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	public int method2633() {
		return ((Class161_Sub1) this).anInt10746;
	}

	void method2625(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_, int i_271_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_266_ = i_266_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_267_ = (i_267_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_266_ / ((Class161_Sub1) this).anInt10746);
				i_265_ += (((Class161_Sub1) this).anInt10749 * i_267_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_265_, (float) (i + i_266_), (float) (i_265_ + i_267_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_269_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_270_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_268_, i_269_);
			if (((Class161_Sub1) this).aBool10754) {
				i_266_ = i_266_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_267_ = (i_267_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_266_ / ((Class161_Sub1) this).anInt10746);
				i_265_ += (((Class161_Sub1) this).anInt10749 * i_267_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-971203681).method1648();
			float f_272_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(45712364).method1646();
			class426.aClass250_4998.method3448((float) i_266_ * 2.0F / f, (float) i_267_ * 2.0F / f_272_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_265_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_272_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	Class161_Sub1(Class106_Sub3 class106_sub3, int i, int i_273_, int[] is, int i_274_, int i_275_) {
		((Class161_Sub1) this).anInt10749 = 0;
		((Class161_Sub1) this).anInt10752 = 0;
		((Class161_Sub1) this).anInt10756 = 0;
		((Class161_Sub1) this).anInt10748 = 0;
		((Class161_Sub1) this).aClass106_Sub3_10751 = class106_sub3;
		((Class161_Sub1) this).anInt10746 = i;
		((Class161_Sub1) this).anInt10747 = i_273_;
		((Class161_Sub1) this).anInterface6_10745 = null;
		((Class161_Sub1) this).anInterface43_10744 = class106_sub3.method9636(i, i_273_, false, is, i_274_, i_275_);
		((Class161_Sub1) this).anInterface43_10744.method253(true, true);
		((Class161_Sub1) this).aBool10750 = ((Class161_Sub1) this).anInterface43_10744.method42() != i;
		((Class161_Sub1) this).aBool10753 = ((Class161_Sub1) this).anInterface43_10744.method41() != i_273_;
		((Class161_Sub1) this).aBool10755 = (!((Class161_Sub1) this).aBool10750 && ((Class161_Sub1) this).anInterface43_10744.method228());
		((Class161_Sub1) this).aBool10743 = (!((Class161_Sub1) this).aBool10753 && ((Class161_Sub1) this).anInterface43_10744.method228());
	}

	public void method2628(int i, int i_276_, int i_277_, int i_278_) {
		((Class161_Sub1) this).anInt10752 = i;
		((Class161_Sub1) this).anInt10749 = i_276_;
		((Class161_Sub1) this).anInt10748 = i_277_;
		((Class161_Sub1) this).anInt10756 = i_278_;
		((Class161_Sub1) this).aBool10754 = (((Class161_Sub1) this).anInt10752 != 0 || ((Class161_Sub1) this).anInt10749 != 0 || ((Class161_Sub1) this).anInt10748 != 0 || ((Class161_Sub1) this).anInt10756 != 0);
	}

	public int method148() {
		return (((Class161_Sub1) this).anInt10746 + ((Class161_Sub1) this).anInt10752 + ((Class161_Sub1) this).anInt10748);
	}

	public void method2585(int[] is) {
		is[0] = ((Class161_Sub1) this).anInt10752;
		is[1] = ((Class161_Sub1) this).anInt10749;
		is[2] = ((Class161_Sub1) this).anInt10748;
		is[3] = ((Class161_Sub1) this).anInt10756;
	}

	public void method2629(int[] is) {
		is[0] = ((Class161_Sub1) this).anInt10752;
		is[1] = ((Class161_Sub1) this).anInt10749;
		is[2] = ((Class161_Sub1) this).anInt10748;
		is[3] = ((Class161_Sub1) this).anInt10756;
	}

	public void method2648(int[] is) {
		is[0] = ((Class161_Sub1) this).anInt10752;
		is[1] = ((Class161_Sub1) this).anInt10749;
		is[2] = ((Class161_Sub1) this).anInt10748;
		is[3] = ((Class161_Sub1) this).anInt10756;
	}

	public int method2635() {
		return ((Class161_Sub1) this).anInt10747;
	}

	public int method2632() {
		return ((Class161_Sub1) this).anInt10746;
	}

	public void method2627(int i, int i_279_, int i_280_, int i_281_, int[] is, int i_282_, int i_283_) {
		((Class161_Sub1) this).anInterface43_10744.method230(i, i_279_, i_280_, i_281_, is, i_282_, i_283_);
	}

	Class161_Sub1(Class106_Sub3 class106_sub3, int i, int i_284_, boolean bool, boolean bool_285_) {
		((Class161_Sub1) this).anInt10749 = 0;
		((Class161_Sub1) this).anInt10752 = 0;
		((Class161_Sub1) this).anInt10756 = 0;
		((Class161_Sub1) this).anInt10748 = 0;
		((Class161_Sub1) this).aClass106_Sub3_10751 = class106_sub3;
		((Class161_Sub1) this).anInt10746 = i;
		((Class161_Sub1) this).anInt10747 = i_284_;
		if (bool_285_) {
			Interface45 interface45 = class106_sub3.method9639((bool ? Class171.aClass171_2071 : Class171.aClass171_2068), Class88.aClass88_1218, i, i_284_);
			((Class161_Sub1) this).anInterface6_10745 = interface45.method260(0);
			((Class161_Sub1) this).anInterface43_10744 = interface45;
		} else {
			((Class161_Sub1) this).anInterface43_10744 = class106_sub3.method9634((bool ? Class171.aClass171_2071 : Class171.aClass171_2068), Class88.aClass88_1218, i, i_284_);
			((Class161_Sub1) this).anInterface6_10745 = null;
		}
		((Class161_Sub1) this).anInterface43_10744.method253(true, true);
		((Class161_Sub1) this).aBool10750 = ((Class161_Sub1) this).anInterface43_10744.method42() != i;
		((Class161_Sub1) this).aBool10753 = ((Class161_Sub1) this).anInterface43_10744.method41() != i_284_;
		((Class161_Sub1) this).aBool10755 = (!((Class161_Sub1) this).aBool10750 && ((Class161_Sub1) this).anInterface43_10744.method228());
		((Class161_Sub1) this).aBool10743 = (!((Class161_Sub1) this).aBool10753 && ((Class161_Sub1) this).anInterface43_10744.method228());
	}

	public int method2634() {
		return ((Class161_Sub1) this).anInt10747;
	}

	public void method2586(int i, int i_286_, int i_287_, int i_288_) {
		((Class161_Sub1) this).anInt10752 = i;
		((Class161_Sub1) this).anInt10749 = i_286_;
		((Class161_Sub1) this).anInt10748 = i_287_;
		((Class161_Sub1) this).anInt10756 = i_288_;
		((Class161_Sub1) this).aBool10754 = (((Class161_Sub1) this).anInt10752 != 0 || ((Class161_Sub1) this).anInt10749 != 0 || ((Class161_Sub1) this).anInt10748 != 0 || ((Class161_Sub1) this).anInt10756 != 0);
	}

	public int method2636() {
		return ((Class161_Sub1) this).anInt10747;
	}

	public int method2645() {
		return (((Class161_Sub1) this).anInt10747 + ((Class161_Sub1) this).anInt10749 + ((Class161_Sub1) this).anInt10756);
	}

	public int method2637() {
		return (((Class161_Sub1) this).anInt10747 + ((Class161_Sub1) this).anInt10749 + ((Class161_Sub1) this).anInt10756);
	}

	public void method2612(int i, int i_289_, int i_290_, int i_291_, int i_292_, int i_293_) {
		((Class161_Sub1) this).anInterface43_10744.method246(i, i_289_, i_290_, i_291_, i_292_, i_293_);
	}

	void method2606(float f, float f_294_, float f_295_, float f_296_, float f_297_, float f_298_, int i, int i_299_, int i_300_, int i_301_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397)
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3926(f, f_294_, f_295_, f_296_, f_297_, f_298_, f_295_ + f_297_ - f, f_296_ + f_298_ - f_294_, 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method235(), 0.0F, 0.0F, ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744.method235(), ((Class161_Sub1) this).anInterface43_10744.method257(), ((Class161_Sub1) this).anInterface43_10744, i_299_);
		else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_300_);
			if (((Class161_Sub1) this).aBool10754) {
				float f_302_ = (float) method45();
				float f_303_ = (float) method2589();
				float f_304_ = (f_295_ - f) / f_302_;
				float f_305_ = (f_296_ - f_294_) / f_302_;
				float f_306_ = (f_297_ - f) / f_303_;
				float f_307_ = (f_298_ - f_294_) / f_303_;
				float f_308_ = f_306_ * (float) ((Class161_Sub1) this).anInt10749;
				float f_309_ = f_307_ * (float) ((Class161_Sub1) this).anInt10749;
				float f_310_ = f_304_ * (float) ((Class161_Sub1) this).anInt10752;
				float f_311_ = f_305_ * (float) ((Class161_Sub1) this).anInt10752;
				float f_312_ = -f_304_ * (float) ((Class161_Sub1) this).anInt10748;
				float f_313_ = -f_305_ * (float) ((Class161_Sub1) this).anInt10748;
				float f_314_ = -f_306_ * (float) ((Class161_Sub1) this).anInt10756;
				float f_315_ = -f_307_ * (float) ((Class161_Sub1) this).anInt10756;
				f = f + f_310_ + f_308_;
				f_294_ = f_294_ + f_311_ + f_309_;
				f_295_ = f_295_ + f_312_ + f_308_;
				f_296_ = f_296_ + f_313_ + f_309_;
				f_297_ = f_297_ + f_310_ + f_314_;
				f_298_ = f_298_ + f_311_ + f_315_;
			}
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i, i_299_);
			float f_316_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(629975111).method1648();
			float f_317_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-886843155).method1646();
			class426.aClass250_4998.method3444();
			class426.aClass250_4998.aFloatArray2728[0] = (f_295_ - f) * 2.0F / f_316_;
			class426.aClass250_4998.aFloatArray2728[1] = (f_296_ - f_294_) * 2.0F / f_317_;
			class426.aClass250_4998.aFloatArray2728[4] = (f_297_ - f) * 2.0F / f_316_;
			class426.aClass250_4998.aFloatArray2728[5] = (f_298_ - f_294_) * 2.0F / f_317_;
			class426.aClass250_4998.aFloatArray2728[12] = ((f + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_316_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = ((f_294_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_317_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}

	void method2640(float f, float f_318_, float f_319_, float f_320_, float f_321_, float f_322_, int i, Class167 class167, int i_323_, int i_324_) {
		((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
		Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
		class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
		class426.method5179(1, -1);
		float f_325_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1190424200).method1648();
		float f_326_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(-793634671).method1646();
		class426.aClass250_4998.method3444();
		if (((Class161_Sub1) this).aBool10754) {
			float f_327_ = ((float) ((Class161_Sub1) this).anInt10746 / (float) method45());
			float f_328_ = ((float) ((Class161_Sub1) this).anInt10747 / (float) method2589());
			class426.aClass250_4998.aFloatArray2728[0] = (f_319_ - f) * f_327_;
			class426.aClass250_4998.aFloatArray2728[1] = (f_320_ - f_318_) * f_327_;
			class426.aClass250_4998.aFloatArray2728[4] = (f_321_ - f) * f_328_;
			class426.aClass250_4998.aFloatArray2728[5] = (f_322_ - f_318_) * f_328_;
			class426.aClass250_4998.aFloatArray2728[12] = ((f + (float) ((Class161_Sub1) this).anInt10752) * f_327_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
			class426.aClass250_4998.aFloatArray2728[13] = (((f_318_ + (float) ((Class161_Sub1) this).anInt10749) * f_328_) + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
		} else {
			class426.aClass250_4998.aFloatArray2728[0] = f_319_ - f;
			class426.aClass250_4998.aFloatArray2728[1] = f_320_ - f_318_;
			class426.aClass250_4998.aFloatArray2728[4] = f_321_ - f;
			class426.aClass250_4998.aFloatArray2728[5] = f_322_ - f_318_;
			class426.aClass250_4998.aFloatArray2728[12] = f + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590();
			class426.aClass250_4998.aFloatArray2728[13] = (f_318_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590());
		}
		Class250 class250 = ((Class161_Sub1) this).aClass106_Sub3_10751.aClass250_10399;
		class250.method3444();
		class250.aFloatArray2728[0] = 2.0F / f_325_;
		class250.aFloatArray2728[5] = 2.0F / f_326_;
		class250.aFloatArray2728[12] = -1.0F;
		class250.aFloatArray2728[13] = -1.0F;
		class250.aFloatArray2728[14] = -1.0F;
		class426.aClass250_4998.method3445(class250);
		class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
		class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
		class426.anInt4995 = 0;
		class426.aClass362_5003 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass362_10497);
		Interface43 interface43 = ((Class167_Sub3) (Class167_Sub3) class167).anInterface43_10964;
		class426.anInterface43_5002 = interface43;
		class426.aClass250_5000.method3444();
		class426.aClass250_5000.aFloatArray2728[0] = (f_319_ - f) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[1] = (f_320_ - f_318_) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[4] = (f_321_ - f) * interface43.method224(1.0F);
		class426.aClass250_5000.aFloatArray2728[5] = (f_322_ - f_318_) * interface43.method224(1.0F);
		class426.aClass250_5000.aFloatArray2728[12] = (f - (float) i_323_) * interface43.method226(1.0F);
		class426.aClass250_5000.aFloatArray2728[13] = (f_318_ - (float) i_324_) * interface43.method224(1.0F);
		class426.method5181();
	}

	public int method146() {
		return (((Class161_Sub1) this).anInt10746 + ((Class161_Sub1) this).anInt10752 + ((Class161_Sub1) this).anInt10748);
	}

	public int method147() {
		return (((Class161_Sub1) this).anInt10746 + ((Class161_Sub1) this).anInt10752 + ((Class161_Sub1) this).anInt10748);
	}

	void method2593(int i, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_) {
		if (((Class161_Sub1) this).aClass106_Sub3_10751.method9621() != Class352.aClass352_4397) {
			if (((Class161_Sub1) this).aBool10754) {
				i_330_ = i_330_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_331_ = (i_331_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_330_ / ((Class161_Sub1) this).anInt10746);
				i_329_ += (((Class161_Sub1) this).anInt10749 * i_331_ / ((Class161_Sub1) this).anInt10747);
			}
			((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass290_10384.method3922((float) i, (float) i_329_, (float) (i + i_330_), (float) (i_329_ + i_331_), ((Class161_Sub1) this).anInterface43_10744.method226(0.0F), ((Class161_Sub1) this).anInterface43_10744.method224(0.0F), ((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), ((Class161_Sub1) this).anInterface43_10744, i_333_);
		} else {
			((Class161_Sub1) this).aClass106_Sub3_10751.method9612();
			((Class161_Sub1) this).aClass106_Sub3_10751.method9591(i_334_);
			Class426 class426 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).aClass426_10376);
			class426.anInterface43_4996 = ((Class161_Sub1) this).anInterface43_10744;
			class426.method5179(i_332_, i_333_);
			if (((Class161_Sub1) this).aBool10754) {
				i_330_ = i_330_ * ((Class161_Sub1) this).anInt10746 / method45();
				i_331_ = (i_331_ * ((Class161_Sub1) this).anInt10747 / method2589());
				i += (((Class161_Sub1) this).anInt10752 * i_330_ / ((Class161_Sub1) this).anInt10746);
				i_329_ += (((Class161_Sub1) this).anInt10749 * i_331_ / ((Class161_Sub1) this).anInt10747);
			}
			float f = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1260499810).method1648();
			float f_336_ = (float) ((Class161_Sub1) this).aClass106_Sub3_10751.method1683(1513692634).method1646();
			class426.aClass250_4998.method3448((float) i_330_ * 2.0F / f, (float) i_331_ * 2.0F / f_336_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_329_ + ((Class161_Sub1) this).aClass106_Sub3_10751.method9590()) * 2.0F / f_336_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3448(((Class161_Sub1) this).anInterface43_10744.method226((float) ((Class161_Sub1) this).anInt10746), ((Class161_Sub1) this).anInterface43_10744.method224((float) ((Class161_Sub1) this).anInt10747), 1.0F, 1.0F);
			class426.anInterface44_5001 = (((Class106_Sub3) ((Class161_Sub1) this).aClass106_Sub3_10751).anInterface44_10445);
			class426.anInt4995 = 0;
			class426.aClass362_5003 = ((Class106_Sub3) (((Class161_Sub1) this).aClass106_Sub3_10751)).aClass362_10497;
			class426.method5180();
		}
	}
}
