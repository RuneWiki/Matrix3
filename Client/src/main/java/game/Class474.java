package game;

/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class474 {
	public static final int anInt5313 = 1073741824;
	public boolean aBool5314;
	static final int anInt5315 = 1073741823;
	int anInt5316;
	int[] anIntArray5317;
	Class634[] aClass634Array5318;
	public int anInt5319 = 295349167;
	long aLong5320;
	public static final int anInt5321 = -2147483648;
	long aLong5322;
	static Class127 aClass127_5323;
	static int[] anIntArray5324 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static Class127 aClass127_5325 = new Class127(260);
	public int[] anIntArray5326;

	public void method5598(int i, int[] is, Class634[] class634s, int[] is_0_, boolean bool, int i_1_, int i_2_) {
		if (1418780203 * ((Class474) this).anInt5316 != i)
			((Class474) this).anInt5316 = 667086979 * i;
		((Class474) this).anIntArray5317 = is;
		((Class474) this).aClass634Array5318 = class634s;
		anIntArray5326 = is_0_;
		aBool5314 = bool;
		anInt5319 = i_1_ * -295349167;
		method5603((byte) 1);
	}

	public void method5599(int i, int i_3_, Class639_Sub22 class639_sub22, byte i_4_) {
		int i_5_ = anIntArray5324[i];
		if (class639_sub22.getDefinition(i_3_, 1512591559) != null) {
			((Class474) this).anIntArray5317[i_5_] = i_3_ | ~0x7fffffff;
			method5603((byte) -38);
		}
	}

	public Model method5600(Class106 class106, int i, Class639_Sub22 class639_sub22, Class639_Sub15 class639_sub15, Class639_Sub5 class639_sub5, Interface15 interface15, Interface13 interface13, Class663 class663, byte i_6_) {
		if (anInt5319 * -1560513359 != -1)
			return (((NPCDefintion) class639_sub15.getDefinition(anInt5319 * -1560513359, -1070864937)).method4950(class106, i, interface15, interface13, class663, null, 1733197024));
		int i_7_ = class663 != null ? i | class663.method7794(-35235674) : i;
		Model model;
		synchronized (aClass127_5323) {
			model = (Model) aClass127_5323.method2246(-2530620689744880979L * (((Class474) this).aLong5322));
		}
		if (null == model || class106.method1756(model.method1353(), i_7_) != 0) {
			if (model != null)
				i_7_ = class106.method1798(i_7_, model.method1353());
			int i_8_ = i_7_;
			boolean bool = false;
			for (int i_9_ = 0; i_9_ < ((Class474) this).anIntArray5317.length; i_9_++) {
				int i_10_ = ((Class474) this).anIntArray5317[i_9_];
				Class634 class634 = null;
				if (0 != (i_10_ & 0x40000000)) {
					if (((Class474) this).aClass634Array5318 != null && ((Class474) this).aClass634Array5318[i_9_] != null)
						class634 = ((Class474) this).aClass634Array5318[i_9_];
					if (!((ItemDefinitions) class639_sub5.getDefinition(i_10_ & 0x3fffffff, 1423716670)).method7532(aBool5314, class634, -1042067865))
						bool = true;
				} else if (0 != (i_10_ & ~0x7fffffff) && !((Class346) class639_sub22.getDefinition(i_10_ & 0x3fffffff, 1340246772)).method4325((byte) 111))
					bool = true;
			}
			if (bool)
				return null;
			Class159[] class159s = new Class159[((Class474) this).anIntArray5317.length];
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < ((Class474) this).anIntArray5317.length; i_12_++) {
				int i_13_ = ((Class474) this).anIntArray5317[i_12_];
				Class634 class634 = null;
				if ((i_13_ & 0x40000000) != 0) {
					if (((Class474) this).aClass634Array5318 != null && null != ((Class474) this).aClass634Array5318[i_12_])
						class634 = ((Class474) this).aClass634Array5318[i_12_];
					Class159 class159 = ((ItemDefinitions) class639_sub5.getDefinition(i_13_ & 0x3fffffff, 1062141630)).method7533(aBool5314, class634, 2054490828);
					if (class159 != null)
						class159s[i_11_++] = class159;
				} else if ((i_13_ & ~0x7fffffff) != 0) {
					Class159 class159 = ((Class346) class639_sub22.getDefinition(i_13_ & 0x3fffffff, -543310170)).method4324(976283130);
					if (class159 != null)
						class159s[i_11_++] = class159;
				}
			}
			Class159 class159 = new Class159(class159s, i_11_);
			i_8_ |= 0x4000;
			model = class106.method1755(class159, i_8_, Class294.anInt3455 * -1186285285, 64, 768);
			for (int i_14_ = 0; i_14_ < 10; i_14_++) {
				for (int i_15_ = 0; i_15_ < Class639_Sub19.aShortArrayArray9570[i_14_].length; i_15_++) {
					if (anIntArray5326[i_14_] < (Class47.aShortArrayArrayArray471[i_14_][i_15_]).length)
						model.method1393((Class639_Sub19.aShortArrayArray9570[i_14_][i_15_]), (Class47.aShortArrayArrayArray471[i_14_][i_15_][anIntArray5326[i_14_]]));
				}
			}
			model.method1450(i_7_);
			synchronized (aClass127_5323) {
				aClass127_5323.method2229(model, (-2530620689744880979L * ((Class474) this).aLong5322));
			}
		}
		if (class663 == null)
			return model;
		Model class89_16_ = model.method1351((byte) 4, i_7_, true);
		class663.method7797(class89_16_, 0, (byte) -116);
		return class89_16_;
	}

	public void method5601(boolean bool, short i) {
		aBool5314 = bool;
		method5603((byte) -26);
	}

	public static void method5602() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2234((byte) 16);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2234((byte) -27);
		}
	}

	void method5603(byte i) {
		long[] ls = RSByteBuffer.aLongArray9121;
		((Class474) this).aLong5322 = 6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((1418780203 * ((Class474) this).anInt5316) >> 8)) & 0xffL)]));
		((Class474) this).aLong5322 = (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) ((((Class474) this).aLong5322 * -2530620689744880979L ^ (long) (1418780203 * ((Class474) this).anInt5316)) & 0xffL)]) * -6474249947232216795L;
		for (int i_17_ = 0; i_17_ < ((Class474) this).anIntArray5317.length; i_17_++) {
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((((Class474) this).anIntArray5317[i_17_]) >> 24)) & 0xffL)]));
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) ((((Class474) this).anIntArray5317[i_17_]) >> 16)) & 0xffL)]) * -6474249947232216795L;
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((((Class474) this).anIntArray5317[i_17_]) >> 8)) & 0xffL)]));
			((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i_17_])) & 0xffL)]));
		}
		if (((Class474) this).aClass634Array5318 != null) {
			for (int i_18_ = 0; i_18_ < ((Class474) this).aClass634Array5318.length; i_18_++) {
				if (((Class474) this).aClass634Array5318[i_18_] != null) {
					int[] is;
					int[] is_19_;
					if (aBool5314) {
						is = (((Class474) this).aClass634Array5318[i_18_].anIntArray8217);
						is_19_ = (((Class474) this).aClass634Array5318[i_18_].anIntArray8219);
					} else {
						is = (((Class474) this).aClass634Array5318[i_18_].anIntArray8216);
						is_19_ = (((Class474) this).aClass634Array5318[i_18_].anIntArray8211);
					}
					if (is != null) {
						for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
							((Class474) this).aLong5322 = (((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (is[i_20_] >> 8)) & 0xffL)])) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is[i_20_]) & 0xffL)]));
						}
					}
					if (is_19_ != null) {
						for (int i_21_ = 0; i_21_ < is_19_.length; i_21_++) {
							((Class474) this).aLong5322 = (((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (is_19_[i_21_] >> 8)) & 0xffL)]) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is_19_[i_21_]) & 0xffL)]));
						}
					}
					if ((((Class474) this).aClass634Array5318[i_18_].aShortArray8220) != null) {
						for (int i_22_ = 0; i_22_ < (((Class474) this).aClass634Array5318[i_18_].aShortArray8220).length; i_22_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i_18_].aShortArray8220[i_22_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ (ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).aClass634Array5318[i_18_].aShortArray8220[i_22_])) & 0xffL)])));
						}
					}
					if ((((Class474) this).aClass634Array5318[i_18_].aShortArray8221) != null) {
						for (int i_23_ = 0; i_23_ < (((Class474) this).aClass634Array5318[i_18_].aShortArray8221).length; i_23_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i_18_].aShortArray8221[i_23_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) (((Class474) this).aClass634Array5318[i_18_].aShortArray8221[i_23_])) & 0xffL)])));
						}
					}
				}
			}
		}
		for (int i_24_ = 0; i_24_ < 10; i_24_++)
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) anIntArray5326[i_24_]) & 0xffL)]) * -6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (aBool5314 ? 1 : 0)) & 0xffL)]));
	}

	public Model method5604(Class106 class106, int i, Class639_Sub22 class639_sub22, Class639_Sub18 class639_sub18, Class663 class663, int i_25_, int i_26_, int i_27_, int i_28_) {
		int i_29_ = null != class663 ? i | class663.method7794(-1471654657) : i;
		long l = (long) i_27_ << 32 | (long) (i_26_ << 16) | (long) i_25_;
		Model model;
		synchronized (aClass127_5323) {
			model = (Model) aClass127_5323.method2246(l);
		}
		if (model == null || class106.method1756(model.method1353(), i_29_) != 0) {
			if (model != null)
				i_29_ = class106.method1798(i_29_, model.method1353());
			int i_30_ = i_29_;
			Class159[] class159s = new Class159[3];
			int i_31_ = 0;
			if (((Class346) class639_sub22.getDefinition(i_25_, 685470020)).method4325((byte) 62) && ((Class346) class639_sub22.getDefinition(i_26_, -611829931)).method4325((byte) 5) && ((Class346) class639_sub22.getDefinition(i_27_, 1868334117)).method4325((byte) 42)) {
				Class159 class159 = ((Class346) class639_sub22.getDefinition(i_25_, 1600806279)).method4324(-2022110579);
				if (null != class159)
					class159s[i_31_++] = class159;
				class159 = ((Class346) class639_sub22.getDefinition(i_26_, -22005515)).method4324(229232020);
				if (class159 != null)
					class159s[i_31_++] = class159;
				class159 = ((Class346) class639_sub22.getDefinition(i_27_, -253184921)).method4324(936689986);
				if (null != class159)
					class159s[i_31_++] = class159;
				class159 = new Class159(class159s, i_31_);
				i_30_ |= 0x4000;
				model = class106.method1755(class159, i_30_, -1186285285 * Class294.anInt3455, 64, 768);
				for (int i_32_ = 0; i_32_ < 10; i_32_++) {
					for (int i_33_ = 0; (i_33_ < Class639_Sub19.aShortArrayArray9570[i_32_].length); i_33_++) {
						if (anIntArray5326[i_32_] < (Class47.aShortArrayArrayArray471[i_32_][i_33_]).length)
							model.method1393((Class639_Sub19.aShortArrayArray9570[i_32_][i_33_]), (Class47.aShortArrayArrayArray471[i_32_][i_33_][anIntArray5326[i_32_]]));
					}
				}
				model.method1450(i_29_);
				synchronized (aClass127_5323) {
					aClass127_5323.method2229(model, l);
				}
			} else
				return null;
		}
		if (null == class663)
			return model;
		model = model.method1351((byte) 4, i_29_, true);
		class663.method7797(model, 0, (byte) -68);
		return model;
	}

	public Model method5605(Class106 class106, int i, Class639_Sub11 class639_sub11, Class639_Sub22 class639_sub22, Class639_Sub15 class639_sub15, Class639_Sub5 class639_sub5, Interface15 interface15, Interface13 interface13, Class663 class663, Class663 class663_34_, Class663[] class663s, int[] is, int i_35_, boolean bool, Class504 class504, int i_36_) {
		if (-1 != -1560513359 * anInt5319)
			return (((NPCDefintion) class639_sub15.getDefinition(-1560513359 * anInt5319, 772736376)).method4948(class106, i, class639_sub11, interface15, interface13, class663, class663_34_, class663s, is, i_35_, null, -1022064230));
		int i_37_ = i;
		long l = -2530620689744880979L * ((Class474) this).aLong5322;
		int[] is_38_ = ((Class474) this).anIntArray5317;
		boolean bool_39_ = false;
		boolean bool_40_ = false;
		if (class663 != null) {
			AnimationDefinition class132 = class663.method7787(153948485);
			if (null != class132 && (class132.anInt1553 * 196196667 >= 0 || 224298189 * class132.anInt1554 >= 0)) {
				is_38_ = new int[((Class474) this).anIntArray5317.length];
				for (int i_41_ = 0; i_41_ < is_38_.length; i_41_++)
					is_38_[i_41_] = ((Class474) this).anIntArray5317[i_41_];
				if (class132.anInt1553 * 196196667 >= 0 && class504.anInt5581 * 281592615 != -1) {
					bool_39_ = true;
					if (65535 == class132.anInt1553 * 196196667) {
						is_38_[class504.anInt5581 * 281592615] = 0;
						for (int i_42_ = 0; i_42_ < class504.anIntArray5583.length; i_42_++)
							is_38_[class504.anIntArray5583[i_42_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_38_[class504.anInt5581 * 281592615] = 196196667 * class132.anInt1553 | 0x40000000;
						for (int i_43_ = 0; i_43_ < class504.anIntArray5583.length; i_43_++)
							is_38_[class504.anIntArray5583[i_43_]] = 0;
						l ^= ((long) is_38_[281592615 * class504.anInt5581] << 32);
					}
				}
				if (class132.anInt1554 * 224298189 >= 0 && -1 != 647507881 * class504.anInt5582) {
					bool_40_ = true;
					if (65535 == class132.anInt1554 * 224298189) {
						is_38_[647507881 * class504.anInt5582] = 0;
						for (int i_44_ = 0; i_44_ < class504.anIntArray5577.length; i_44_++)
							is_38_[class504.anIntArray5577[i_44_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_38_[class504.anInt5582 * 647507881] = 224298189 * class132.anInt1554 | 0x40000000;
						for (int i_45_ = 0; i_45_ < class504.anIntArray5577.length; i_45_++)
							is_38_[class504.anIntArray5577[i_45_]] = 0;
						l ^= (long) is_38_[class504.anInt5582 * 647507881];
					}
				}
			}
		}
		boolean bool_46_ = false;
		int i_47_ = null != class663s ? class663s.length : 0;
		for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
			if (null != class663s[i_48_]) {
				i_37_ |= class663s[i_48_].method7794(246935304);
				bool_46_ = true;
			}
		}
		if (null != class663) {
			i_37_ |= class663.method7794(-1918415679);
			bool_46_ = true;
		}
		if (class663_34_ != null) {
			i_37_ |= class663_34_.method7794(1976631143);
			bool_46_ = true;
		}
		boolean bool_49_ = false;
		if (is != null) {
			for (int i_50_ = 0; i_50_ < is.length; i_50_++) {
				if (is[i_50_] != -1) {
					i_37_ |= 0x20;
					bool_49_ = true;
				}
			}
		}
		Model model;
		synchronized (aClass127_5325) {
			model = (Model) aClass127_5325.method2246(l);
		}
		Class538 class538 = null;
		if (((Class474) this).anInt5316 * 1418780203 != -1)
			class538 = ((Class538) class639_sub11.getDefinition((1418780203 * ((Class474) this).anInt5316), -1736782071));
		if (model == null || class106.method1756(model.method1353(), i_37_) != 0) {
			if (null != model)
				i_37_ = class106.method1798(i_37_, model.method1353());
			int i_51_ = i_37_;
			boolean bool_52_ = false;
			for (int i_53_ = 0; i_53_ < is_38_.length; i_53_++) {
				int i_54_ = is_38_[i_53_];
				Class634 class634 = null;
				boolean bool_55_ = false;
				if (bool_39_) {
					if (class504.anInt5581 * 281592615 == i_53_)
						bool_55_ = true;
					else {
						for (int i_56_ = 0; i_56_ < class504.anIntArray5583.length; i_56_++) {
							if (class504.anIntArray5583[i_56_] == i_53_) {
								bool_55_ = true;
								break;
							}
						}
					}
				}
				if (bool_40_) {
					if (i_53_ == class504.anInt5582 * 647507881)
						bool_55_ = true;
					else {
						for (int i_57_ = 0; i_57_ < class504.anIntArray5577.length; i_57_++) {
							if (class504.anIntArray5577[i_57_] == i_53_) {
								bool_55_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_54_ & 0x40000000)) {
					if (!bool_55_ && ((Class474) this).aClass634Array5318 != null && null != ((Class474) this).aClass634Array5318[i_53_])
						class634 = ((Class474) this).aClass634Array5318[i_53_];
					if (!((ItemDefinitions) class639_sub5.getDefinition(i_54_ & 0x3fffffff, 2142749646)).method7530(aBool5314, class634, -1092825496))
						bool_52_ = true;
				} else if (0 != (i_54_ & ~0x7fffffff) && !((Class346) class639_sub22.getDefinition(i_54_ & 0x3fffffff, 2025720798)).method4321(1523363687))
					bool_52_ = true;
			}
			if (bool_52_) {
				if (6646151587766358861L * ((Class474) this).aLong5320 != -1L) {
					synchronized (aClass127_5325) {
						model = (Model) (aClass127_5325.method2246(((Class474) this).aLong5320 * 6646151587766358861L));
					}
				}
				if (null == model || class106.method1756(model.method1353(), i_37_) != 0)
					return null;
			} else {
				Class159[] class159s = new Class159[is_38_.length];
				for (int i_58_ = 0; i_58_ < is_38_.length; i_58_++) {
					int i_59_ = is_38_[i_58_];
					Class634 class634 = null;
					boolean bool_60_ = i_58_ == 5 && bool_39_ || 3 == i_58_ && bool_40_;
					if ((i_59_ & 0x40000000) != 0) {
						if (!bool_60_ && null != ((Class474) this).aClass634Array5318 && (((Class474) this).aClass634Array5318[i_58_] != null))
							class634 = ((Class474) this).aClass634Array5318[i_58_];
						Class159 class159 = ((ItemDefinitions) class639_sub5.getDefinition(i_59_ & 0x3fffffff, -1597715602)).method7531(aBool5314, class634, (byte) 114);
						if (class159 != null)
							class159s[i_58_] = class159;
					} else if ((i_59_ & ~0x7fffffff) != 0) {
						Class159 class159 = ((Class346) class639_sub22.getDefinition(i_59_ & 0x3fffffff, 1481089439)).method4322((byte) 1);
						if (null != class159)
							class159s[i_58_] = class159;
					}
				}
				if (class538 != null && null != class538.anIntArrayArray6025) {
					for (int i_61_ = 0; i_61_ < class538.anIntArrayArray6025.length; i_61_++) {
						if (class159s[i_61_] != null) {
							int i_62_ = 0;
							int i_63_ = 0;
							int i_64_ = 0;
							int i_65_ = 0;
							int i_66_ = 0;
							int i_67_ = 0;
							if (class538.anIntArrayArray6025[i_61_] != null) {
								i_62_ = class538.anIntArrayArray6025[i_61_][0];
								i_63_ = class538.anIntArrayArray6025[i_61_][1];
								i_64_ = class538.anIntArrayArray6025[i_61_][2];
								i_65_ = (class538.anIntArrayArray6025[i_61_][3] << 3);
								i_66_ = (class538.anIntArrayArray6025[i_61_][4] << 3);
								i_67_ = (class538.anIntArrayArray6025[i_61_][5] << 3);
							}
							if (i_65_ != 0 || 0 != i_66_ || i_67_ != 0)
								class159s[i_61_].method2565(i_65_, i_66_, i_67_);
							if (i_62_ != 0 || 0 != i_63_ || i_64_ != 0)
								class159s[i_61_].method2564(i_62_, i_63_, i_64_);
						}
					}
				}
				Class159 class159 = new Class159(class159s, class159s.length);
				i_51_ |= 0x4000;
				model = class106.method1755(class159, i_51_, Class294.anInt3455 * -1186285285, 64, 850);
				for (int i_68_ = 0; i_68_ < 10; i_68_++) {
					for (int i_69_ = 0; (i_69_ < Class639_Sub19.aShortArrayArray9570[i_68_].length); i_69_++) {
						if (anIntArray5326[i_68_] != -1 && anIntArray5326[i_68_] < (Class47.aShortArrayArrayArray471[i_68_][i_69_]).length)
							model.method1393((Class639_Sub19.aShortArrayArray9570[i_68_][i_69_]), (Class47.aShortArrayArrayArray471[i_68_][i_69_][anIntArray5326[i_68_]]));
					}
				}
				model.method1483();
				if (bool) {
					model.method1450(i_37_);
					synchronized (aClass127_5325) {
						aClass127_5325.method2229(model, l);
					}
					((Class474) this).aLong5320 = l * -7440358893958259323L;
				}
			}
		}
		Model class89_70_ = model.method1351((byte) 4, i_37_, true);
		if (!bool_46_ && !bool_49_)
			return class89_70_;
		Class261[] class261s = null;
		if (null != class538)
			class261s = class538.method6390(-165599041);
		if (bool_49_ && class261s != null) {
			for (int i_71_ = 0; i_71_ < is.length; i_71_++) {
				if (class261s[i_71_] != null)
					class89_70_.method1345(class261s[i_71_], 1 << i_71_, true);
			}
		}
		int i_72_ = 0;
		int i_73_ = 1;
		while (i_72_ < i_47_) {
			if (class663s[i_72_] != null)
				class663s[i_72_].method7798(class89_70_, 0, i_73_, (byte) -102);
			i_72_++;
			i_73_ <<= 1;
		}
		if (bool_49_) {
			for (i_72_ = 0; i_72_ < is.length; i_72_++) {
				if (is[i_72_] != -1) {
					i_73_ = is[i_72_] - i_35_;
					i_73_ &= 0x3fff;
					Class261 class261 = new Class261();
					class261.method3571(0.0F, 1.0F, 0.0F, Class325.method4146(i_73_));
					class89_70_.method1345(class261, 1 << i_72_, false);
				}
			}
		}
		if (bool_49_ && null != class261s) {
			for (i_72_ = 0; i_72_ < is.length; i_72_++) {
				if (null != class261s[i_72_])
					class89_70_.method1345(class261s[i_72_], 1 << i_72_, false);
			}
		}
		if (null != class663 && null != class663_34_)
			Class503.method6020(class89_70_, class663, class663_34_, -1165460745);
		else if (class663 != null)
			class663.method7797(class89_70_, 0, (byte) -4);
		else if (null != class663_34_)
			class663_34_.method7797(class89_70_, 0, (byte) -108);
		return class89_70_;
	}

	public void method5606(int i, int i_74_, byte i_75_) {
		anIntArray5326[i] = i_74_;
		method5603((byte) -76);
	}

	static {
		aClass127_5323 = new Class127(5);
	}

	public void method5607(boolean bool) {
		aBool5314 = bool;
		method5603((byte) -11);
	}

	public void method5608(boolean bool) {
		aBool5314 = bool;
		method5603((byte) -99);
	}

	public void method5609(boolean bool) {
		aBool5314 = bool;
		method5603((byte) -72);
	}

	void method5610() {
		long[] ls = RSByteBuffer.aLongArray9121;
		((Class474) this).aLong5322 = 6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((1418780203 * ((Class474) this).anInt5316) >> 8)) & 0xffL)]));
		((Class474) this).aLong5322 = (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) ((((Class474) this).aLong5322 * -2530620689744880979L ^ (long) (1418780203 * ((Class474) this).anInt5316)) & 0xffL)]) * -6474249947232216795L;
		for (int i = 0; i < ((Class474) this).anIntArray5317.length; i++) {
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 24)) & 0xffL)])));
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).anIntArray5317[i] >> 16)) & 0xffL)]) * -6474249947232216795L;
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 8)) & 0xffL)])));
			((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((Class474) this).anIntArray5317[i]) & 0xffL)])));
		}
		if (((Class474) this).aClass634Array5318 != null) {
			for (int i = 0; i < ((Class474) this).aClass634Array5318.length; i++) {
				if (((Class474) this).aClass634Array5318[i] != null) {
					int[] is;
					int[] is_76_;
					if (aBool5314) {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8217);
						is_76_ = (((Class474) this).aClass634Array5318[i].anIntArray8219);
					} else {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8216);
						is_76_ = (((Class474) this).aClass634Array5318[i].anIntArray8211);
					}
					if (is != null) {
						for (int i_77_ = 0; i_77_ < is.length; i_77_++) {
							((Class474) this).aLong5322 = (((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (is[i_77_] >> 8)) & 0xffL)])) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is[i_77_]) & 0xffL)]));
						}
					}
					if (is_76_ != null) {
						for (int i_78_ = 0; i_78_ < is_76_.length; i_78_++) {
							((Class474) this).aLong5322 = (((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (is_76_[i_78_] >> 8)) & 0xffL)]) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is_76_[i_78_]) & 0xffL)]));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8220 != null) {
						for (int i_79_ = 0; i_79_ < (((Class474) this).aClass634Array5318[i].aShortArray8220).length; i_79_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8220[i_79_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ (ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8220[i_79_])) & 0xffL)])));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8221 != null) {
						for (int i_80_ = 0; i_80_ < (((Class474) this).aClass634Array5318[i].aShortArray8221).length; i_80_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8221[i_80_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8221[i_80_])) & 0xffL)])));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) anIntArray5326[i]) & 0xffL)]) * -6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (aBool5314 ? 1 : 0)) & 0xffL)]));
	}

	public static void method5611() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2231((byte) -24);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2231((byte) -35);
		}
	}

	public static void method5612() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2234((byte) 23);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2234((byte) -45);
		}
	}

	void method5613() {
		long[] ls = RSByteBuffer.aLongArray9121;
		((Class474) this).aLong5322 = 6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((1418780203 * ((Class474) this).anInt5316) >> 8)) & 0xffL)]));
		((Class474) this).aLong5322 = (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) ((((Class474) this).aLong5322 * -2530620689744880979L ^ (long) (1418780203 * ((Class474) this).anInt5316)) & 0xffL)]) * -6474249947232216795L;
		for (int i = 0; i < ((Class474) this).anIntArray5317.length; i++) {
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 24)) & 0xffL)])));
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).anIntArray5317[i] >> 16)) & 0xffL)]) * -6474249947232216795L;
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 8)) & 0xffL)])));
			((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((Class474) this).anIntArray5317[i]) & 0xffL)])));
		}
		if (((Class474) this).aClass634Array5318 != null) {
			for (int i = 0; i < ((Class474) this).aClass634Array5318.length; i++) {
				if (((Class474) this).aClass634Array5318[i] != null) {
					int[] is;
					int[] is_81_;
					if (aBool5314) {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8217);
						is_81_ = (((Class474) this).aClass634Array5318[i].anIntArray8219);
					} else {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8216);
						is_81_ = (((Class474) this).aClass634Array5318[i].anIntArray8211);
					}
					if (is != null) {
						for (int i_82_ = 0; i_82_ < is.length; i_82_++) {
							((Class474) this).aLong5322 = (((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (is[i_82_] >> 8)) & 0xffL)])) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is[i_82_]) & 0xffL)]));
						}
					}
					if (is_81_ != null) {
						for (int i_83_ = 0; i_83_ < is_81_.length; i_83_++) {
							((Class474) this).aLong5322 = (((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (is_81_[i_83_] >> 8)) & 0xffL)]) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is_81_[i_83_]) & 0xffL)]));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8220 != null) {
						for (int i_84_ = 0; i_84_ < (((Class474) this).aClass634Array5318[i].aShortArray8220).length; i_84_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8220[i_84_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ (ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8220[i_84_])) & 0xffL)])));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8221 != null) {
						for (int i_85_ = 0; i_85_ < (((Class474) this).aClass634Array5318[i].aShortArray8221).length; i_85_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8221[i_85_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8221[i_85_])) & 0xffL)])));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) anIntArray5326[i]) & 0xffL)]) * -6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (aBool5314 ? 1 : 0)) & 0xffL)]));
	}

	public static int method5614() {
		synchronized (aClass127_5325) {
			int i = aClass127_5325.method2237((byte) 60);
			return i;
		}
	}

	public static void method5615(int i) {
		Class294.anInt3455 = i * -338953965;
		synchronized (aClass127_5323) {
			aClass127_5323.method2231((byte) -8);
		}
		synchronized (aClass127_5325) {
			aClass127_5325.method2231((byte) -94);
		}
	}

	public static void method5616() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2234((byte) 88);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2234((byte) 54);
		}
	}

	public static void method5617() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2234((byte) -9);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2234((byte) -38);
		}
	}

	void method5618() {
		long[] ls = RSByteBuffer.aLongArray9121;
		((Class474) this).aLong5322 = 6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((1418780203 * ((Class474) this).anInt5316) >> 8)) & 0xffL)]));
		((Class474) this).aLong5322 = (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ ls[(int) ((((Class474) this).aLong5322 * -2530620689744880979L ^ (long) (1418780203 * ((Class474) this).anInt5316)) & 0xffL)]) * -6474249947232216795L;
		for (int i = 0; i < ((Class474) this).anIntArray5317.length; i++) {
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 24)) & 0xffL)])));
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).anIntArray5317[i] >> 16)) & 0xffL)]) * -6474249947232216795L;
			((Class474) this).aLong5322 = (-6474249947232216795L * (-2530620689744880979L * ((Class474) this).aLong5322 >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (((Class474) this).anIntArray5317[i] >> 8)) & 0xffL)])));
			((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) ((Class474) this).anIntArray5317[i]) & 0xffL)])));
		}
		if (((Class474) this).aClass634Array5318 != null) {
			for (int i = 0; i < ((Class474) this).aClass634Array5318.length; i++) {
				if (((Class474) this).aClass634Array5318[i] != null) {
					int[] is;
					int[] is_86_;
					if (aBool5314) {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8217);
						is_86_ = (((Class474) this).aClass634Array5318[i].anIntArray8219);
					} else {
						is = (((Class474) this).aClass634Array5318[i].anIntArray8216);
						is_86_ = (((Class474) this).aClass634Array5318[i].anIntArray8211);
					}
					if (is != null) {
						for (int i_87_ = 0; i_87_ < is.length; i_87_++) {
							((Class474) this).aLong5322 = (((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (is[i_87_] >> 8)) & 0xffL)])) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is[i_87_]) & 0xffL)]));
						}
					}
					if (is_86_ != null) {
						for (int i_88_ = 0; i_88_ < is_86_.length; i_88_++) {
							((Class474) this).aLong5322 = (((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (is_86_[i_88_] >> 8)) & 0xffL)]) * -6474249947232216795L);
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) is_86_[i_88_]) & 0xffL)]));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8220 != null) {
						for (int i_89_ = 0; i_89_ < (((Class474) this).aClass634Array5318[i].aShortArray8220).length; i_89_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8220[i_89_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((-2530620689744880979L * ((Class474) this).aLong5322) >>> 8 ^ (ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8220[i_89_])) & 0xffL)])));
						}
					}
					if (((Class474) this).aClass634Array5318[i].aShortArray8221 != null) {
						for (int i_90_ = 0; i_90_ < (((Class474) this).aClass634Array5318[i].aShortArray8221).length; i_90_++) {
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) ((((Class474) this).aClass634Array5318[i].aShortArray8221[i_90_]) >> 8)) & 0xffL)])));
							((Class474) this).aLong5322 = (-6474249947232216795L * ((((Class474) this).aLong5322 * -2530620689744880979L) >>> 8 ^ (ls[(int) (((-2530620689744880979L * (((Class474) this).aLong5322)) ^ (long) (((Class474) this).aClass634Array5318[i].aShortArray8221[i_90_])) & 0xffL)])));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((Class474) this).aLong5322 = (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((((Class474) this).aLong5322 * -2530620689744880979L) ^ (long) anIntArray5326[i]) & 0xffL)]) * -6474249947232216795L;
		((Class474) this).aLong5322 = (-6474249947232216795L * (((Class474) this).aLong5322 * -2530620689744880979L >>> 8 ^ ls[(int) (((-2530620689744880979L * ((Class474) this).aLong5322) ^ (long) (aBool5314 ? 1 : 0)) & 0xffL)]));
	}

	public static void method5619() {
		synchronized (aClass127_5325) {
			aClass127_5325.method2234((byte) -31);
		}
		synchronized (aClass127_5323) {
			aClass127_5323.method2234((byte) -22);
		}
	}

	public void method5620(int i, int i_91_, Class639_Sub5 class639_sub5, short i_92_) {
		if (i_91_ == -1)
			((Class474) this).anIntArray5317[i] = 0;
		else if (class639_sub5.getDefinition(i_91_, -373338576) != null) {
			((Class474) this).anIntArray5317[i] = i_91_ | 0x40000000;
			method5603((byte) -60);
		}
	}

	static final void method5621(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.aBool777 = false;
		Class555.method6575(class73, (short) 3315);
	}

	static final void method5622(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt740 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 854702549;
	}

	static final void method5623(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 2036794487 * Class13.anInt111;
	}

	static int method5624(NPC class456_sub1_sub2_sub3_sub1, byte i) {
		NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
		if (class410.anIntArray4795 != null) {
			class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 543159680);
			if (null == class410)
				return -1;
		}
		int i_93_ = class410.anInt4841 * 499278571;
		Class538 class538 = class456_sub1_sub2_sub3_sub1.method10554((byte) -21);
		int i_94_ = class456_sub1_sub2_sub3_sub1.aClass663_Sub2_11631.method7795(-1478180242);
		if (i_94_ == -1 || class456_sub1_sub2_sub3_sub1.aClass663_Sub2_11631.aBool9556)
			i_93_ = class410.anInt4839 * -588253189;
		else if (class538.anInt6026 * -182549727 == i_94_ || i_94_ == -1172829509 * class538.anInt6027 || i_94_ == class538.anInt6019 * -1871450263 || i_94_ == class538.anInt6028 * -1351448577)
			i_93_ = 164584663 * class410.anInt4842;
		else if (i_94_ == -1506072601 * class538.anInt6030 || i_94_ == 1966431491 * class538.anInt6031 || i_94_ == class538.anInt6033 * 1541680687 || -500215193 * class538.anInt6032 == i_94_)
			i_93_ = class410.anInt4840 * -501509183;
		return i_93_;
	}

	static final void method5625(int i) {
		Class13.aLong79 = -4922727120155625359L;
		Class13.aLong98 = 0L;
		Class13.anInt68 = 916769883;
	}
}
