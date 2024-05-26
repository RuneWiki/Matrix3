package game;

/* Class456_Sub1_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub2_Sub5 extends Class456_Sub1_Sub2 {
	public int anInt11739;
	int anInt11740;
	public int anInt11741;
	int anInt11742;
	Class485 aClass485_11743;
	int anInt11744;
	int anInt11745;
	int anInt11746;
	int anInt11747;
	public int anInt11748;
	boolean aBool11749;
	boolean aBool11750 = false;
	double aDouble11751;
	double aDouble11752;
	boolean aBool11753;
	double aDouble11754;
	double aDouble11755;
	double aDouble11756;
	Class663 aClass663_11757;
	int anInt11758;
	public int anInt11759;
	int anInt11760;

	public int method8310(byte i) {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11742 * -57077071;
	}

	boolean method8300(int i) {
		return false;
	}

	boolean method8301(byte i) {
		return ((Class456_Sub1_Sub2_Sub5) this).aBool11753;
	}

	final void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_0_, int i_1_, boolean bool) {
		throw new IllegalStateException();
	}

	public int method10635(byte i) {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11760 * 2014733073;
	}

	Class531 method8350(Class106 class106, int i) {
		Model model = method10646(class106, 2048, (byte) 1);
		if (null == model)
			return null;
		Class261 class261 = method5392();
		method10639(class106, model, class261, -993326042);
		Class531 class531 = Class572_Sub16_Sub9.method10262(false, -665463290);
		model.method1375(class261, aClass90Array9007[0], 0);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 != null) {
			Class105 class105 = ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5767();
			class106.method1760(class105);
		}
		((Class456_Sub1_Sub2_Sub5) this).aBool11753 = model.method1400();
		model.method1379();
		((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
		return class531;
	}

	public final void method10636(int i, int i_2_, int i_3_, int i_4_, byte i_5_) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			float f = (float) i - class240.aFloat2653;
			float f_6_ = (float) i_2_ - class240.aFloat2657;
			float f_7_ = (float) Math.sqrt((double) (f * f + f_6_ * f_6_));
			if (0.0F != f_7_) {
				class240.aFloat2653 += (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) * f / f_7_;
				class240.aFloat2657 += (f_6_ * (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) / f_7_);
			}
			if (((Class456_Sub1_Sub2_Sub5) this).aBool11749)
				class240.aFloat2656 = (float) (Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2140200343) - (((Class456_Sub1_Sub2_Sub5) this).anInt11758 * -1211773721));
			method5401(class240);
		}
		double d = (double) (1 + 1095263993 * anInt11739 - i_4_);
		((Class456_Sub1_Sub2_Sub5) this).aDouble11751 = (double) ((float) i - class240.aFloat2653) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11752 = (double) ((float) i_2_ - class240.aFloat2657) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11756 = Math.sqrt((((Class456_Sub1_Sub2_Sub5) this).aDouble11751 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11751) + (((Class456_Sub1_Sub2_Sub5) this).aDouble11752 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11752));
		if (((Class456_Sub1_Sub2_Sub5) this).anInt11744 * 1589968073 != -1) {
			if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750)
				((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (-((Class456_Sub1_Sub2_Sub5) this).aDouble11756 * Math.tan(0.02454369 * (double) ((((Class456_Sub1_Sub2_Sub5) this).anInt11744) * 1589968073)));
			((Class456_Sub1_Sub2_Sub5) this).aDouble11755 = (((double) ((float) i_3_ - class240.aFloat2656) - d * ((Class456_Sub1_Sub2_Sub5) this).aDouble11754) * 2.0 / (d * d));
		} else
			((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (double) ((float) i_3_ - class240.aFloat2656) / d;
		class240.method3261();
	}

	public void method10637(int i) {
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			if (0 != 553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) {
				Entity class456_sub1_sub2_sub3 = null;
				if (1797623853 * client.anInt8646 == 4)
					class456_sub1_sub2_sub3 = Class122.aClass130Array1483[553957097 * (((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1].method2268(-1766882293);
				else if ((((Class456_Sub1_Sub2_Sub5) this).anInt11746 * 553957097) < 0) {
					int i_8_ = (-(553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					if (client.anInt8728 * -1921142451 == i_8_)
						class456_sub1_sub2_sub3 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_8_]);
				} else {
					int i_9_ = ((553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_9_));
					if (class572_sub9 != null)
						class456_sub1_sub2_sub3 = ((Entity) class572_sub9.anObject9081);
				}
				if (null != class456_sub1_sub2_sub3) {
					Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
					method5395(class240.aFloat2653, (float) ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2063853517)) - (-1211773721 * (((Class456_Sub1_Sub2_Sub5) this).anInt11758))), class240.aFloat2657);
					if ((-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740) >= 0) {
						Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) -20);
						int i_10_ = 0;
						int i_11_ = 0;
						if (null != class538.anIntArrayArray6025 && (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740]) != null) {
							i_10_ += (class538.anIntArrayArray6025[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863][0]);
							i_11_ += (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][2]);
						}
						if (null != class538.anIntArrayArray6029 && (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740 * -1326006863)]) != null) {
							i_10_ += (class538.anIntArrayArray6029[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][0]);
							i_11_ += (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863][2]);
						}
						if (0 != i_10_ || 0 != i_11_) {
							int i_12_ = class456_sub1_sub2_sub3.aClass15_11655.method645(1235870346);
							int i_13_ = i_12_;
							if (class456_sub1_sub2_sub3.anIntArray11651 != null && (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]) != -1)
								i_13_ = (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]);
							int i_14_ = i_13_ - i_12_ & 0x3fff;
							int i_15_ = Class325.anIntArray4103[i_14_];
							int i_16_ = Class325.anIntArray4105[i_14_];
							int i_17_ = i_16_ * i_10_ + i_15_ * i_11_ >> 14;
							i_11_ = i_11_ * i_16_ - i_10_ * i_15_ >> 14;
							i_10_ = i_17_;
							Class240 class240_18_ = Class240.method3276(method5394().aClass240_2647);
							class240_18_.aFloat2653 += (float) i_10_;
							class240_18_.aFloat2657 += (float) i_11_;
							method5401(class240_18_);
							class240_18_.method3261();
						}
					}
				}
			}
		}
	}

	boolean method8329() {
		return ((Class456_Sub1_Sub2_Sub5) this).aBool11753;
	}

	boolean method8315() {
		return false;
	}

	void method8336(Class106 class106, int i) {
		Model model = method10646(class106, 0, (byte) 1);
		if (null != model) {
			Class261 class261 = method5392();
			((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
			model.method1379();
			method10639(class106, model, class261, -1401865211);
		}
	}

	public void method10638() {
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			if (0 != 553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) {
				Entity class456_sub1_sub2_sub3 = null;
				if (1797623853 * client.anInt8646 == 4)
					class456_sub1_sub2_sub3 = Class122.aClass130Array1483[553957097 * (((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1].method2268(-1337414556);
				else if ((((Class456_Sub1_Sub2_Sub5) this).anInt11746 * 553957097) < 0) {
					int i = (-(553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					if (client.anInt8728 * -1921142451 == i)
						class456_sub1_sub2_sub3 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
				} else {
					int i = ((553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i));
					if (class572_sub9 != null)
						class456_sub1_sub2_sub3 = ((Entity) class572_sub9.anObject9081);
				}
				if (null != class456_sub1_sub2_sub3) {
					Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
					method5395(class240.aFloat2653, (float) ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2135010243)) - (-1211773721 * (((Class456_Sub1_Sub2_Sub5) this).anInt11758))), class240.aFloat2657);
					if ((-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740) >= 0) {
						Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) -65);
						int i = 0;
						int i_19_ = 0;
						if (null != class538.anIntArrayArray6025 && (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740]) != null) {
							i += (class538.anIntArrayArray6025[(((Class456_Sub1_Sub2_Sub5) this).anInt11740 * -1326006863)][0]);
							i_19_ += (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][2]);
						}
						if (null != class538.anIntArrayArray6029 && (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740 * -1326006863)]) != null) {
							i += (class538.anIntArrayArray6029[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][0]);
							i_19_ += (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863][2]);
						}
						if (0 != i || 0 != i_19_) {
							int i_20_ = class456_sub1_sub2_sub3.aClass15_11655.method645(-67445037);
							int i_21_ = i_20_;
							if (class456_sub1_sub2_sub3.anIntArray11651 != null && (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]) != -1)
								i_21_ = (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]);
							int i_22_ = i_21_ - i_20_ & 0x3fff;
							int i_23_ = Class325.anIntArray4103[i_22_];
							int i_24_ = Class325.anIntArray4105[i_22_];
							int i_25_ = i_24_ * i + i_23_ * i_19_ >> 14;
							i_19_ = i_19_ * i_24_ - i * i_23_ >> 14;
							i = i_25_;
							Class240 class240_26_ = Class240.method3276(method5394().aClass240_2647);
							class240_26_.aFloat2653 += (float) i;
							class240_26_.aFloat2657 += (float) i_19_;
							method5401(class240_26_);
							class240_26_.method3261();
						}
					}
				}
			}
		}
	}

	void method10639(Class106 class106, Model model, Class261 class261, int i) {
		model.method1426(class261);
		Class84[] class84s = model.method1394();
		Class175[] class175s = model.method1507();
		if ((null == ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 || ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.aBool5432) && (class84s != null || class175s != null))
			((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 = Class485.method5766(client.cycles, true);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 != null) {
			((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5771(class106, (long) client.cycles, class84s, class175s, false);
			((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5775(aByte9009, aShort11503, aShort11499, aShort11500, aShort11502);
		}
	}

	public final void method10640(int i, byte i_27_) {
		((Class456_Sub1_Sub2_Sub5) this).aBool11750 = true;
		Class238 class238 = new Class238(method5394());
		class238.aClass240_2647.aFloat2653 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11751 * (double) i;
		class238.aClass240_2647.aFloat2657 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11752 * (double) i;
		if (((Class456_Sub1_Sub2_Sub5) this).aBool11749)
			class238.aClass240_2647.aFloat2656 = (float) (Class314.method4072((int) (class238.aClass240_2647.aFloat2653), (int) (class238.aClass240_2647.aFloat2657), aByte9009, -2123641687) - (-1211773721 * ((Class456_Sub1_Sub2_Sub5) this).anInt11758));
		else if (((Class456_Sub1_Sub2_Sub5) this).anInt11744 * 1589968073 != -1) {
			class238.aClass240_2647.aFloat2656 += (((Class456_Sub1_Sub2_Sub5) this).aDouble11754 * (double) i + (double) i * ((double) i * (0.5 * (((Class456_Sub1_Sub2_Sub5) this).aDouble11755))));
			((Class456_Sub1_Sub2_Sub5) this).aDouble11754 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11755 * (double) i;
		} else
			class238.aClass240_2647.aFloat2656 += (double) i * ((Class456_Sub1_Sub2_Sub5) this).aDouble11754;
		class238.aClass230_2648.method3172(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class456_Sub1_Sub2_Sub5) this).aDouble11754, (((Class456_Sub1_Sub2_Sub5) this).aDouble11756)));
		Class230 class230 = Class230.method3210();
		class230.method3172(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class456_Sub1_Sub2_Sub5) this).aDouble11751, ((Class456_Sub1_Sub2_Sub5) this).aDouble11752) - 3.1415927F));
		class238.aClass230_2648.method3189(class230);
		class230.method3165();
		method5402(class238);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7802(1, -1691967148) && ((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7800(-24083291))
			((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7799(1754817976);
	}

	boolean method8297(Class106 class106, int i, int i_28_, int i_29_) {
		return false;
	}

	public void method10641() {
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			if (0 != 553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) {
				Entity class456_sub1_sub2_sub3 = null;
				if (1797623853 * client.anInt8646 == 4)
					class456_sub1_sub2_sub3 = Class122.aClass130Array1483[553957097 * (((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1].method2268(1684095928);
				else if ((((Class456_Sub1_Sub2_Sub5) this).anInt11746 * 553957097) < 0) {
					int i = (-(553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					if (client.anInt8728 * -1921142451 == i)
						class456_sub1_sub2_sub3 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
				} else {
					int i = ((553957097 * ((Class456_Sub1_Sub2_Sub5) this).anInt11746) - 1);
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i));
					if (class572_sub9 != null)
						class456_sub1_sub2_sub3 = ((Entity) class572_sub9.anObject9081);
				}
				if (null != class456_sub1_sub2_sub3) {
					Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
					method5395(class240.aFloat2653, (float) ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2063254215)) - (-1211773721 * (((Class456_Sub1_Sub2_Sub5) this).anInt11758))), class240.aFloat2657);
					if ((-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740) >= 0) {
						Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) 120);
						int i = 0;
						int i_30_ = 0;
						if (null != class538.anIntArrayArray6025 && (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740]) != null) {
							i += (class538.anIntArrayArray6025[(((Class456_Sub1_Sub2_Sub5) this).anInt11740 * -1326006863)][0]);
							i_30_ += (class538.anIntArrayArray6025[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][2]);
						}
						if (null != class538.anIntArrayArray6029 && (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740 * -1326006863)]) != null) {
							i += (class538.anIntArrayArray6029[-1326006863 * ((Class456_Sub1_Sub2_Sub5) this).anInt11740][0]);
							i_30_ += (class538.anIntArrayArray6029[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863][2]);
						}
						if (0 != i || 0 != i_30_) {
							int i_31_ = class456_sub1_sub2_sub3.aClass15_11655.method645(528430465);
							int i_32_ = i_31_;
							if (class456_sub1_sub2_sub3.anIntArray11651 != null && (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]) != -1)
								i_32_ = (class456_sub1_sub2_sub3.anIntArray11651[(((Class456_Sub1_Sub2_Sub5) this).anInt11740) * -1326006863]);
							int i_33_ = i_32_ - i_31_ & 0x3fff;
							int i_34_ = Class325.anIntArray4103[i_33_];
							int i_35_ = Class325.anIntArray4105[i_33_];
							int i_36_ = i_35_ * i + i_34_ * i_30_ >> 14;
							i_30_ = i_30_ * i_35_ - i * i_34_ >> 14;
							i = i_36_;
							Class240 class240_37_ = Class240.method3276(method5394().aClass240_2647);
							class240_37_.aFloat2653 += (float) i;
							class240_37_.aFloat2657 += (float) i_30_;
							method5401(class240_37_);
							class240_37_.method3261();
						}
					}
				}
			}
		}
	}

	Class531 method8326(Class106 class106) {
		Model model = method10646(class106, 2048, (byte) 1);
		if (null == model)
			return null;
		Class261 class261 = method5392();
		method10639(class106, model, class261, -305552663);
		Class531 class531 = Class572_Sub16_Sub9.method10262(false, -415635128);
		model.method1375(class261, aClass90Array9007[0], 0);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 != null) {
			Class105 class105 = ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5767();
			class106.method1760(class105);
		}
		((Class456_Sub1_Sub2_Sub5) this).aBool11753 = model.method1400();
		model.method1379();
		((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
		return class531;
	}

	final boolean method8333() {
		return false;
	}

	boolean method8342() {
		return false;
	}

	boolean method8331() {
		return false;
	}

	public int method8322() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11742 * -57077071;
	}

	boolean method8314() {
		return ((Class456_Sub1_Sub2_Sub5) this).aBool11753;
	}

	boolean method8317() {
		return ((Class456_Sub1_Sub2_Sub5) this).aBool11753;
	}

	final void method8338() {
		throw new IllegalStateException();
	}

	boolean method8319() {
		return ((Class456_Sub1_Sub2_Sub5) this).aBool11753;
	}

	public int method8320() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11742 * -57077071;
	}

	final void method8303(int i) {
		throw new IllegalStateException();
	}

	final void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_38_, int i_39_, boolean bool, int i_40_) {
		throw new IllegalStateException();
	}

	public int method8323() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11742 * -57077071;
	}

	public int method8316() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11742 * -57077071;
	}

	public Class535 method8341(Class106 class106) {
		return null;
	}

	Class531 method8328(Class106 class106) {
		Model model = method10646(class106, 2048, (byte) 1);
		if (null == model)
			return null;
		Class261 class261 = method5392();
		method10639(class106, model, class261, 231143838);
		Class531 class531 = Class572_Sub16_Sub9.method10262(false, -973534272);
		model.method1375(class261, aClass90Array9007[0], 0);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 != null) {
			Class105 class105 = ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5767();
			class106.method1760(class105);
		}
		((Class456_Sub1_Sub2_Sub5) this).aBool11753 = model.method1400();
		model.method1379();
		((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
		return class531;
	}

	void method8313(Class106 class106) {
		Model model = method10646(class106, 0, (byte) 1);
		if (null != model) {
			Class261 class261 = method5392();
			((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
			model.method1379();
			method10639(class106, model, class261, 2145231149);
		}
	}

	void method8330(Class106 class106) {
		Model model = method10646(class106, 0, (byte) 1);
		if (null != model) {
			Class261 class261 = method5392();
			((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
			model.method1379();
			method10639(class106, model, class261, 1261002597);
		}
	}

	boolean method8321(Class106 class106, int i, int i_41_) {
		return false;
	}

	final boolean method8332() {
		return false;
	}

	void method10469(byte i) {
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = aShort11499 = (short) (int) (class240.aFloat2653 / 512.0F);
		aShort11500 = aShort11502 = (short) (int) (class240.aFloat2657 / 512.0F);
	}

	final boolean method8334() {
		return false;
	}

	final boolean method8347() {
		return false;
	}

	final boolean method8349() {
		return false;
	}

	public Class535 method8344(Class106 class106) {
		return null;
	}

	final void method8343() {
		throw new IllegalStateException();
	}

	final void method8304() {
		throw new IllegalStateException();
	}

	void method10470() {
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = aShort11499 = (short) (int) (class240.aFloat2653 / 512.0F);
		aShort11500 = aShort11502 = (short) (int) (class240.aFloat2657 / 512.0F);
	}

	void method10471() {
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = aShort11499 = (short) (int) (class240.aFloat2653 / 512.0F);
		aShort11500 = aShort11502 = (short) (int) (class240.aFloat2657 / 512.0F);
	}

	final boolean method8299(int i) {
		return false;
	}

	public Class535 method8305(Class106 class106) {
		return null;
	}

	public void method10642(byte i) {
		if (null != ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743)
			((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5783();
	}

	public int method10643() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11760 * 2014733073;
	}

	public int method10644() {
		return ((Class456_Sub1_Sub2_Sub5) this).anInt11760 * 2014733073;
	}

	public final void method10645(int i, int i_42_, int i_43_, int i_44_) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			float f = (float) i - class240.aFloat2653;
			float f_45_ = (float) i_42_ - class240.aFloat2657;
			float f_46_ = (float) Math.sqrt((double) (f * f + f_45_ * f_45_));
			if (0.0F != f_46_) {
				class240.aFloat2653 += (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) * f / f_46_;
				class240.aFloat2657 += (f_45_ * (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) / f_46_);
			}
			if (((Class456_Sub1_Sub2_Sub5) this).aBool11749)
				class240.aFloat2656 = (float) (Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2049790302) - (((Class456_Sub1_Sub2_Sub5) this).anInt11758 * -1211773721));
			method5401(class240);
		}
		double d = (double) (1 + 1095263993 * anInt11739 - i_44_);
		((Class456_Sub1_Sub2_Sub5) this).aDouble11751 = (double) ((float) i - class240.aFloat2653) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11752 = (double) ((float) i_42_ - class240.aFloat2657) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11756 = Math.sqrt((((Class456_Sub1_Sub2_Sub5) this).aDouble11751 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11751) + (((Class456_Sub1_Sub2_Sub5) this).aDouble11752 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11752));
		if (((Class456_Sub1_Sub2_Sub5) this).anInt11744 * 1589968073 != -1) {
			if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750)
				((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (-((Class456_Sub1_Sub2_Sub5) this).aDouble11756 * Math.tan(0.02454369 * (double) ((((Class456_Sub1_Sub2_Sub5) this).anInt11744) * 1589968073)));
			((Class456_Sub1_Sub2_Sub5) this).aDouble11755 = (((double) ((float) i_43_ - class240.aFloat2656) - d * ((Class456_Sub1_Sub2_Sub5) this).aDouble11754) * 2.0 / (d * d));
		} else
			((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (double) ((float) i_43_ - class240.aFloat2656) / d;
		class240.method3261();
	}

	public Class535 method8306(Class106 class106, byte i) {
		return null;
	}

	Model method10646(Class106 class106, int i, byte i_47_) {
		GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(-219470065 * ((Class456_Sub1_Sub2_Sub5) this).anInt11745, -808152378)));
		return class659.method7760(class106, i, (((Class456_Sub1_Sub2_Sub5) this).aClass663_11757), (byte) 2, 2036702454);
	}

	public final void method10647(int i, int i_48_, int i_49_, int i_50_) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750) {
			float f = (float) i - class240.aFloat2653;
			float f_51_ = (float) i_48_ - class240.aFloat2657;
			float f_52_ = (float) Math.sqrt((double) (f * f + f_51_ * f_51_));
			if (0.0F != f_52_) {
				class240.aFloat2653 += (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) * f / f_52_;
				class240.aFloat2657 += (f_51_ * (float) (((Class456_Sub1_Sub2_Sub5) this).anInt11747 * -1851213107) / f_52_);
			}
			if (((Class456_Sub1_Sub2_Sub5) this).aBool11749)
				class240.aFloat2656 = (float) (Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, aByte9009, -2031148080) - (((Class456_Sub1_Sub2_Sub5) this).anInt11758 * -1211773721));
			method5401(class240);
		}
		double d = (double) (1 + 1095263993 * anInt11739 - i_50_);
		((Class456_Sub1_Sub2_Sub5) this).aDouble11751 = (double) ((float) i - class240.aFloat2653) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11752 = (double) ((float) i_48_ - class240.aFloat2657) / d;
		((Class456_Sub1_Sub2_Sub5) this).aDouble11756 = Math.sqrt((((Class456_Sub1_Sub2_Sub5) this).aDouble11751 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11751) + (((Class456_Sub1_Sub2_Sub5) this).aDouble11752 * ((Class456_Sub1_Sub2_Sub5) this).aDouble11752));
		if (((Class456_Sub1_Sub2_Sub5) this).anInt11744 * 1589968073 != -1) {
			if (!((Class456_Sub1_Sub2_Sub5) this).aBool11750)
				((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (-((Class456_Sub1_Sub2_Sub5) this).aDouble11756 * Math.tan(0.02454369 * (double) ((((Class456_Sub1_Sub2_Sub5) this).anInt11744) * 1589968073)));
			((Class456_Sub1_Sub2_Sub5) this).aDouble11755 = (((double) ((float) i_49_ - class240.aFloat2656) - d * ((Class456_Sub1_Sub2_Sub5) this).aDouble11754) * 2.0 / (d * d));
		} else
			((Class456_Sub1_Sub2_Sub5) this).aDouble11754 = (double) ((float) i_49_ - class240.aFloat2656) / d;
		class240.method3261();
	}

	Class531 method8327(Class106 class106) {
		Model model = method10646(class106, 2048, (byte) 1);
		if (null == model)
			return null;
		Class261 class261 = method5392();
		method10639(class106, model, class261, 628097614);
		Class531 class531 = Class572_Sub16_Sub9.method10262(false, -164007692);
		model.method1375(class261, aClass90Array9007[0], 0);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass485_11743 != null) {
			Class105 class105 = ((Class456_Sub1_Sub2_Sub5) this).aClass485_11743.method5767();
			class106.method1760(class105);
		}
		((Class456_Sub1_Sub2_Sub5) this).aBool11753 = model.method1400();
		model.method1379();
		((Class456_Sub1_Sub2_Sub5) this).anInt11742 = model.method1382() * -1911818671;
		return class531;
	}

	public Class456_Sub1_Sub2_Sub5(Class523 class523, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, boolean bool, int i_65_, int i_66_) {
		super(class523, i_53_, i_54_, i_55_, Class314.method4072(i_55_, i_56_, i_53_, -2124478885) - i_57_, i_56_, i_55_ >> 9, i_55_ >> 9, i_56_ >> 9, i_56_ >> 9, false, (byte) 0);
		((Class456_Sub1_Sub2_Sub5) this).anInt11742 = 0;
		((Class456_Sub1_Sub2_Sub5) this).aBool11753 = false;
		((Class456_Sub1_Sub2_Sub5) this).anInt11760 = 0;
		((Class456_Sub1_Sub2_Sub5) this).anInt11745 = 1447618543 * i;
		anInt11748 = 1897232843 * i_58_;
		anInt11739 = -1289127095 * i_59_;
		((Class456_Sub1_Sub2_Sub5) this).anInt11744 = -439100039 * i_60_;
		((Class456_Sub1_Sub2_Sub5) this).anInt11747 = 2092548613 * i_61_;
		((Class456_Sub1_Sub2_Sub5) this).anInt11746 = i_62_ * -1626767015;
		anInt11759 = i_63_ * -420610659;
		((Class456_Sub1_Sub2_Sub5) this).anInt11758 = i_57_ * 1331726039;
		anInt11741 = -1707162525 * i_64_;
		((Class456_Sub1_Sub2_Sub5) this).aBool11749 = bool;
		((Class456_Sub1_Sub2_Sub5) this).aBool11750 = false;
		((Class456_Sub1_Sub2_Sub5) this).anInt11740 = i_65_ * 188050257;
		((Class456_Sub1_Sub2_Sub5) this).anInt11760 = -640225807 * i_66_;
		int i_67_ = (((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(((Class456_Sub1_Sub2_Sub5) this).anInt11745 * -219470065, 737102660))).anInt8433 * 1281094747);
		((Class456_Sub1_Sub2_Sub5) this).aClass663_11757 = new Class663_Sub3(this, false);
		((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7801(i_67_, 751680147);
		method8339(1, -838631322);
	}

	public final void method10648(int i) {
		((Class456_Sub1_Sub2_Sub5) this).aBool11750 = true;
		Class238 class238 = new Class238(method5394());
		class238.aClass240_2647.aFloat2653 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11751 * (double) i;
		class238.aClass240_2647.aFloat2657 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11752 * (double) i;
		if (((Class456_Sub1_Sub2_Sub5) this).aBool11749)
			class238.aClass240_2647.aFloat2656 = (float) (Class314.method4072((int) (class238.aClass240_2647.aFloat2653), (int) (class238.aClass240_2647.aFloat2657), aByte9009, -2077899657) - (-1211773721 * ((Class456_Sub1_Sub2_Sub5) this).anInt11758));
		else if (((Class456_Sub1_Sub2_Sub5) this).anInt11744 * 1589968073 != -1) {
			class238.aClass240_2647.aFloat2656 += (((Class456_Sub1_Sub2_Sub5) this).aDouble11754 * (double) i + (double) i * ((double) i * (0.5 * (((Class456_Sub1_Sub2_Sub5) this).aDouble11755))));
			((Class456_Sub1_Sub2_Sub5) this).aDouble11754 += ((Class456_Sub1_Sub2_Sub5) this).aDouble11755 * (double) i;
		} else
			class238.aClass240_2647.aFloat2656 += (double) i * ((Class456_Sub1_Sub2_Sub5) this).aDouble11754;
		class238.aClass230_2648.method3172(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class456_Sub1_Sub2_Sub5) this).aDouble11754, (((Class456_Sub1_Sub2_Sub5) this).aDouble11756)));
		Class230 class230 = Class230.method3210();
		class230.method3172(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class456_Sub1_Sub2_Sub5) this).aDouble11751, ((Class456_Sub1_Sub2_Sub5) this).aDouble11752) - 3.1415927F));
		class238.aClass230_2648.method3189(class230);
		class230.method3165();
		method5402(class238);
		if (((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7802(1, -1881612638) && ((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7800(-24083291))
			((Class456_Sub1_Sub2_Sub5) this).aClass663_11757.method7799(1126028822);
	}
}
