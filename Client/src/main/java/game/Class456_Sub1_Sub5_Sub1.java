package game;

/* Class456_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub5_Sub1 extends Class456_Sub1_Sub5 {
	static Class261 aClass261_11701 = new Class261();
	public Class261 aClass261_11702;
	public int anInt11703;
	public int anInt11704 = -786628835;
	public int anInt11705;
	public int anInt11706 = -893737707;
	public Class261 aClass261_11707;
	public int anInt11708;
	public int anInt11709;
	public Class261 aClass261_11710;
	int anInt11711;
	public int anInt11712;
	boolean aBool11713;
	int anInt11714;
	int anInt11715;
	int anInt11716;
	int anInt11717;

	boolean method8321(Class106 class106, int i, int i_0_) {
		Class261 class261 = class106.method1753();
		class261.method3583(method5394());
		class261.method3580(0.0F, -10.0F, 0.0F);
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(anInt11712 * -1239711419, -728640822)).method7526(class106, 131072, anInt11703 * 1704726277, null, null, 0, 0, 0, 0, -1796512934));
		if (model != null) {
			if (null == aClass261_11702)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			if (model.method1376(i, i_0_, aClass261_11701, true, 0))
				return true;
		}
		if (-1730788149 * anInt11704 != -1) {
			model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, 1281721793)).method7526(class106, 131072, -2060829393 * anInt11705, null, null, 0, 0, 0, 0, 867471213));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				if (model.method1376(i, i_0_, aClass261_11701, true, 0))
					return true;
			}
		}
		if (-1 != -325747261 * anInt11706) {
			model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, -1257368950)).method7526(class106, 131072, anInt11708 * -1551511447, null, null, 0, 0, 0, 0, -1048896158));
			if (model != null) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				if (model.method1376(i, i_0_, aClass261_11701, true, 0))
					return true;
			}
		}
		return false;
	}

	public int method8316() {
		return -10;
	}

	boolean method8300(int i) {
		return false;
	}

	boolean method8301(byte i) {
		return ((Class456_Sub1_Sub5_Sub1) this).aBool11713;
	}

	Class531 method8326(Class106 class106) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		Class543 class543 = aClass523_9010.method6284(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, -495345206);
		Class456_Sub1_Sub1 class456_sub1_sub1 = aClass523_9010.method6254(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 466898678);
		int i = 0;
		if (null != class543 && class543.aClass456_Sub1_Sub2_6099.aBool11498)
			i = class543.aClass456_Sub1_Sub2_6099.method8310((byte) -1);
		if (null != class456_sub1_sub1 && class456_sub1_sub1.aShort11275 > -i)
			i = -class456_sub1_sub1.aShort11275;
		if (-1743753997 * anInt11709 != i) {
			class240.aFloat2656 += (float) (i - anInt11709 * -1743753997);
			method5401(class240);
			anInt11709 = -447312837 * i;
		}
		Class261 class261 = class106.method1753();
		class261.method3594();
		if (0 == -1743753997 * anInt11709) {
			boolean bool = false;
			boolean bool_1_ = false;
			boolean bool_2_ = false;
			Class174 class174 = aClass523_9010.aClass174Array5875[aByte9008];
			int i_3_ = 540907893 * ((Class456_Sub1_Sub5_Sub1) this).anInt11711 << 1;
			int i_4_ = i_3_;
			int i_5_ = -i_3_ / 2;
			int i_6_ = -i_4_ / 2;
			int i_7_ = class174.method2726(i_5_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_6_, 358769667);
			int i_8_ = i_3_ / 2;
			int i_9_ = -i_4_ / 2;
			int i_10_ = class174.method2726((int) class240.aFloat2653 + i_8_, i_9_ + (int) class240.aFloat2657, 358769667);
			int i_11_ = -i_3_ / 2;
			int i_12_ = i_4_ / 2;
			int i_13_ = class174.method2726(i_11_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_12_, 358769667);
			int i_14_ = i_3_ / 2;
			int i_15_ = i_4_ / 2;
			int i_16_ = class174.method2726((int) class240.aFloat2653 + i_14_, i_15_ + (int) class240.aFloat2657, 358769667);
			int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
			int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
			int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
			int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
			if (i_4_ != 0) {
				int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_), (double) i_4_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_21_)
					class261.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(i_21_));
			}
			if (i_3_ != 0) {
				int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_), (double) i_3_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_22_)
					class261.method3576(0.0F, 0.0F, 1.0F, Class325.method4146(-i_22_));
			}
			int i_23_ = i_16_ + i_7_;
			if (i_10_ + i_13_ < i_23_)
				i_23_ = i_10_ + i_13_;
			i_23_ = (i_23_ >> 1) - (int) class240.aFloat2656;
			if (0 != i_23_)
				class261.method3580(0.0F, (float) i_23_, 0.0F);
		}
		class240.method3261();
		Class240 class240_24_ = method5394().aClass240_2647;
		class261.method3580(class240_24_.aFloat2653, class240_24_.aFloat2656 - 10.0F, class240_24_.aFloat2657);
		Class531 class531 = Class572_Sub16_Sub9.method10262(true, 253241087);
		((Class456_Sub1_Sub5_Sub1) this).aBool11713 = false;
		((Class456_Sub1_Sub5_Sub1) this).anInt11711 = 0;
		if (anInt11706 * -325747261 != -1) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, -1217100299)).method7526(class106, 526336, anInt11708 * -1551511447, null, null, ((Class456_Sub1_Sub5_Sub1) this).anInt11714 * -2130783463, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, -1320121269 * ((Class456_Sub1_Sub5_Sub1) this).anInt11717, -460693787));
			if (null != model) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[2], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		if (-1 != anInt11704 * -1730788149) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, -1421134721)).method7526(class106, 526336, -2060829393 * anInt11705, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 951810218));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[1], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
					((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, 391057630)).method7526(class106, 526336, anInt11703 * 1704726277, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, ((Class456_Sub1_Sub5_Sub1) this).anInt11716 * -540298871, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 1670584215));
		if (model != null) {
			if (aClass261_11702 == null)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			model.method1375(aClass261_11701, aClass90Array9007[0], 0);
			((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
			if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
		}
		return class531;
	}

	public Class535 method8344(Class106 class106) {
		return null;
	}

	public int method8324() {
		return -1743753997 * anInt11709 - method8310((byte) -28);
	}

	void method8336(Class106 class106, int i) {
		/* empty */
	}

	void method10614(int i) {
		((Class456_Sub1_Sub5_Sub1) this).anInt11714 = (32 + (int) (Math.random() * 4.0)) * 272685353;
		((Class456_Sub1_Sub5_Sub1) this).anInt11715 = (3 + (int) (Math.random() * 2.0)) * 335911225;
		((Class456_Sub1_Sub5_Sub1) this).anInt11716 = (16 + (int) (Math.random() * 3.0)) * 117314745;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-137484310) == 1)
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 10.0) * -1642603165;
		else
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 20.0) * -1642603165;
	}

	int method8298(int i) {
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, 1001114224));
		int i_25_ = 1444769865 * class631.anInt8136;
		if (-1 != -1730788149 * anInt11704) {
			ItemDefinitions class631_26_ = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(anInt11704 * -1730788149, -988259328));
			if (1444769865 * class631_26_.anInt8136 > i_25_)
				i_25_ = class631_26_.anInt8136 * 1444769865;
		}
		if (-1 != -325747261 * anInt11706) {
			ItemDefinitions class631_27_ = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, 1529366995));
			if (1444769865 * class631_27_.anInt8136 > i_25_)
				i_25_ = class631_27_.anInt8136 * 1444769865;
		}
		return i_25_;
	}

	public int method8312(int i) {
		return -1743753997 * anInt11709 - method8310((byte) 61);
	}

	boolean method8342() {
		return false;
	}

	boolean method8297(Class106 class106, int i, int i_28_, int i_29_) {
		Class261 class261 = class106.method1753();
		class261.method3583(method5394());
		class261.method3580(0.0F, -10.0F, 0.0F);
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(anInt11712 * -1239711419, 2142699898)).method7526(class106, 131072, anInt11703 * 1704726277, null, null, 0, 0, 0, 0, 1848694404));
		if (model != null) {
			if (null == aClass261_11702)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			if (model.method1376(i, i_28_, aClass261_11701, true, 0))
				return true;
		}
		if (-1730788149 * anInt11704 != -1) {
			model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, 232253505)).method7526(class106, 131072, -2060829393 * anInt11705, null, null, 0, 0, 0, 0, 1957932908));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				if (model.method1376(i, i_28_, aClass261_11701, true, 0))
					return true;
			}
		}
		if (-1 != -325747261 * anInt11706) {
			model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, -125423985)).method7526(class106, 131072, anInt11708 * -1551511447, null, null, 0, 0, 0, 0, -1207253231));
			if (model != null) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				if (model.method1376(i, i_28_, aClass261_11701, true, 0))
					return true;
			}
		}
		return false;
	}

	boolean method8315() {
		return false;
	}

	int method8296() {
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, 1436531493));
		int i = 1444769865 * class631.anInt8136;
		if (-1 != -1730788149 * anInt11704) {
			ItemDefinitions class631_30_ = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(anInt11704 * -1730788149, 710107377));
			if (1444769865 * class631_30_.anInt8136 > i)
				i = class631_30_.anInt8136 * 1444769865;
		}
		if (-1 != -325747261 * anInt11706) {
			ItemDefinitions class631_31_ = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, 1979116112));
			if (1444769865 * class631_31_.anInt8136 > i)
				i = class631_31_.anInt8136 * 1444769865;
		}
		return i;
	}

	boolean method8317() {
		return ((Class456_Sub1_Sub5_Sub1) this).aBool11713;
	}

	boolean method8329() {
		return ((Class456_Sub1_Sub5_Sub1) this).aBool11713;
	}

	boolean method8319() {
		return ((Class456_Sub1_Sub5_Sub1) this).aBool11713;
	}

	public int method8320() {
		return -10;
	}

	public Class456_Sub1_Sub5_Sub1(Class523 class523, int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		super(class523, i, i_32_, i_33_, i_34_, i_35_);
		aClass261_11702 = null;
		aClass261_11707 = null;
		aClass261_11710 = null;
		anInt11709 = 0;
		((Class456_Sub1_Sub5_Sub1) this).anInt11711 = 0;
		((Class456_Sub1_Sub5_Sub1) this).aBool11713 = false;
		method8339(3, -140011371);
		method10614(1978128932);
	}

	public int method8322() {
		return -10;
	}

	public int method8323() {
		return -10;
	}

	public Class535 method8306(Class106 class106, byte i) {
		return null;
	}

	public int method8325() {
		return -1743753997 * anInt11709 - method8310((byte) -62);
	}

	boolean method8314() {
		return ((Class456_Sub1_Sub5_Sub1) this).aBool11713;
	}

	void method8313(Class106 class106) {
		/* empty */
	}

	Class531 method8328(Class106 class106) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		Class543 class543 = aClass523_9010.method6284(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 446457399);
		Class456_Sub1_Sub1 class456_sub1_sub1 = aClass523_9010.method6254(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, -478499635);
		int i = 0;
		if (null != class543 && class543.aClass456_Sub1_Sub2_6099.aBool11498)
			i = class543.aClass456_Sub1_Sub2_6099.method8310((byte) -9);
		if (null != class456_sub1_sub1 && class456_sub1_sub1.aShort11275 > -i)
			i = -class456_sub1_sub1.aShort11275;
		if (-1743753997 * anInt11709 != i) {
			class240.aFloat2656 += (float) (i - anInt11709 * -1743753997);
			method5401(class240);
			anInt11709 = -447312837 * i;
		}
		Class261 class261 = class106.method1753();
		class261.method3594();
		if (0 == -1743753997 * anInt11709) {
			boolean bool = false;
			boolean bool_36_ = false;
			boolean bool_37_ = false;
			Class174 class174 = aClass523_9010.aClass174Array5875[aByte9008];
			int i_38_ = 540907893 * ((Class456_Sub1_Sub5_Sub1) this).anInt11711 << 1;
			int i_39_ = i_38_;
			int i_40_ = -i_38_ / 2;
			int i_41_ = -i_39_ / 2;
			int i_42_ = class174.method2726(i_40_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_41_, 358769667);
			int i_43_ = i_38_ / 2;
			int i_44_ = -i_39_ / 2;
			int i_45_ = class174.method2726((int) class240.aFloat2653 + i_43_, i_44_ + (int) class240.aFloat2657, 358769667);
			int i_46_ = -i_38_ / 2;
			int i_47_ = i_39_ / 2;
			int i_48_ = class174.method2726(i_46_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_47_, 358769667);
			int i_49_ = i_38_ / 2;
			int i_50_ = i_39_ / 2;
			int i_51_ = class174.method2726((int) class240.aFloat2653 + i_49_, i_50_ + (int) class240.aFloat2657, 358769667);
			int i_52_ = i_42_ < i_45_ ? i_42_ : i_45_;
			int i_53_ = i_48_ < i_51_ ? i_48_ : i_51_;
			int i_54_ = i_45_ < i_51_ ? i_45_ : i_51_;
			int i_55_ = i_42_ < i_48_ ? i_42_ : i_48_;
			if (i_39_ != 0) {
				int i_56_ = ((int) (Math.atan2((double) (i_52_ - i_53_), (double) i_39_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_56_)
					class261.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(i_56_));
			}
			if (i_38_ != 0) {
				int i_57_ = ((int) (Math.atan2((double) (i_55_ - i_54_), (double) i_38_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_57_)
					class261.method3576(0.0F, 0.0F, 1.0F, Class325.method4146(-i_57_));
			}
			int i_58_ = i_51_ + i_42_;
			if (i_45_ + i_48_ < i_58_)
				i_58_ = i_45_ + i_48_;
			i_58_ = (i_58_ >> 1) - (int) class240.aFloat2656;
			if (0 != i_58_)
				class261.method3580(0.0F, (float) i_58_, 0.0F);
		}
		class240.method3261();
		Class240 class240_59_ = method5394().aClass240_2647;
		class261.method3580(class240_59_.aFloat2653, class240_59_.aFloat2656 - 10.0F, class240_59_.aFloat2657);
		Class531 class531 = Class572_Sub16_Sub9.method10262(true, -1699171486);
		((Class456_Sub1_Sub5_Sub1) this).aBool11713 = false;
		((Class456_Sub1_Sub5_Sub1) this).anInt11711 = 0;
		if (anInt11706 * -325747261 != -1) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, -1833781291)).method7526(class106, 526336, anInt11708 * -1551511447, null, null, ((Class456_Sub1_Sub5_Sub1) this).anInt11714 * -2130783463, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, -1320121269 * ((Class456_Sub1_Sub5_Sub1) this).anInt11717, 1672024098));
			if (null != model) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[2], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		if (-1 != anInt11704 * -1730788149) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, -1175685525)).method7526(class106, 526336, -2060829393 * anInt11705, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 1518773772));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[1], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
					((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, -1026706494)).method7526(class106, 526336, anInt11703 * 1704726277, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, ((Class456_Sub1_Sub5_Sub1) this).anInt11716 * -540298871, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 563643147));
		if (model != null) {
			if (aClass261_11702 == null)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			model.method1375(aClass261_11701, aClass90Array9007[0], 0);
			((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
			if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
		}
		return class531;
	}

	boolean method8331() {
		return false;
	}

	void method8330(Class106 class106) {
		/* empty */
	}

	Class531 method8327(Class106 class106) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		Class543 class543 = aClass523_9010.method6284(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 305368697);
		Class456_Sub1_Sub1 class456_sub1_sub1 = aClass523_9010.method6254(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, -354297855);
		int i = 0;
		if (null != class543 && class543.aClass456_Sub1_Sub2_6099.aBool11498)
			i = class543.aClass456_Sub1_Sub2_6099.method8310((byte) 21);
		if (null != class456_sub1_sub1 && class456_sub1_sub1.aShort11275 > -i)
			i = -class456_sub1_sub1.aShort11275;
		if (-1743753997 * anInt11709 != i) {
			class240.aFloat2656 += (float) (i - anInt11709 * -1743753997);
			method5401(class240);
			anInt11709 = -447312837 * i;
		}
		Class261 class261 = class106.method1753();
		class261.method3594();
		if (0 == -1743753997 * anInt11709) {
			boolean bool = false;
			boolean bool_60_ = false;
			boolean bool_61_ = false;
			Class174 class174 = aClass523_9010.aClass174Array5875[aByte9008];
			int i_62_ = 540907893 * ((Class456_Sub1_Sub5_Sub1) this).anInt11711 << 1;
			int i_63_ = i_62_;
			int i_64_ = -i_62_ / 2;
			int i_65_ = -i_63_ / 2;
			int i_66_ = class174.method2726(i_64_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_65_, 358769667);
			int i_67_ = i_62_ / 2;
			int i_68_ = -i_63_ / 2;
			int i_69_ = class174.method2726((int) class240.aFloat2653 + i_67_, i_68_ + (int) class240.aFloat2657, 358769667);
			int i_70_ = -i_62_ / 2;
			int i_71_ = i_63_ / 2;
			int i_72_ = class174.method2726(i_70_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_71_, 358769667);
			int i_73_ = i_62_ / 2;
			int i_74_ = i_63_ / 2;
			int i_75_ = class174.method2726((int) class240.aFloat2653 + i_73_, i_74_ + (int) class240.aFloat2657, 358769667);
			int i_76_ = i_66_ < i_69_ ? i_66_ : i_69_;
			int i_77_ = i_72_ < i_75_ ? i_72_ : i_75_;
			int i_78_ = i_69_ < i_75_ ? i_69_ : i_75_;
			int i_79_ = i_66_ < i_72_ ? i_66_ : i_72_;
			if (i_63_ != 0) {
				int i_80_ = ((int) (Math.atan2((double) (i_76_ - i_77_), (double) i_63_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_80_)
					class261.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(i_80_));
			}
			if (i_62_ != 0) {
				int i_81_ = ((int) (Math.atan2((double) (i_79_ - i_78_), (double) i_62_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_81_)
					class261.method3576(0.0F, 0.0F, 1.0F, Class325.method4146(-i_81_));
			}
			int i_82_ = i_75_ + i_66_;
			if (i_69_ + i_72_ < i_82_)
				i_82_ = i_69_ + i_72_;
			i_82_ = (i_82_ >> 1) - (int) class240.aFloat2656;
			if (0 != i_82_)
				class261.method3580(0.0F, (float) i_82_, 0.0F);
		}
		class240.method3261();
		Class240 class240_83_ = method5394().aClass240_2647;
		class261.method3580(class240_83_.aFloat2653, class240_83_.aFloat2656 - 10.0F, class240_83_.aFloat2657);
		Class531 class531 = Class572_Sub16_Sub9.method10262(true, -507191395);
		((Class456_Sub1_Sub5_Sub1) this).aBool11713 = false;
		((Class456_Sub1_Sub5_Sub1) this).anInt11711 = 0;
		if (anInt11706 * -325747261 != -1) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, 564718632)).method7526(class106, 526336, anInt11708 * -1551511447, null, null, ((Class456_Sub1_Sub5_Sub1) this).anInt11714 * -2130783463, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, -1320121269 * ((Class456_Sub1_Sub5_Sub1) this).anInt11717, 1377270307));
			if (null != model) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[2], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		if (-1 != anInt11704 * -1730788149) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, -1321136470)).method7526(class106, 526336, -2060829393 * anInt11705, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 173455130));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[1], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
					((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, 1939207820)).method7526(class106, 526336, anInt11703 * 1704726277, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, ((Class456_Sub1_Sub5_Sub1) this).anInt11716 * -540298871, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, 874494338));
		if (model != null) {
			if (aClass261_11702 == null)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			model.method1375(aClass261_11701, aClass90Array9007[0], 0);
			((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
			if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
		}
		return class531;
	}

	public Class535 method8341(Class106 class106) {
		return null;
	}

	public Class535 method8305(Class106 class106) {
		return null;
	}

	public int method8310(byte i) {
		return -10;
	}

	void method10615() {
		((Class456_Sub1_Sub5_Sub1) this).anInt11714 = (32 + (int) (Math.random() * 4.0)) * 272685353;
		((Class456_Sub1_Sub5_Sub1) this).anInt11715 = (3 + (int) (Math.random() * 2.0)) * 335911225;
		((Class456_Sub1_Sub5_Sub1) this).anInt11716 = (16 + (int) (Math.random() * 3.0)) * 117314745;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(906621897) == 1)
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 10.0) * -1642603165;
		else
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 20.0) * -1642603165;
	}

	void method10616() {
		((Class456_Sub1_Sub5_Sub1) this).anInt11714 = (32 + (int) (Math.random() * 4.0)) * 272685353;
		((Class456_Sub1_Sub5_Sub1) this).anInt11715 = (3 + (int) (Math.random() * 2.0)) * 335911225;
		((Class456_Sub1_Sub5_Sub1) this).anInt11716 = (16 + (int) (Math.random() * 3.0)) * 117314745;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(42692684) == 1)
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 10.0) * -1642603165;
		else
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 20.0) * -1642603165;
	}

	void method10617() {
		((Class456_Sub1_Sub5_Sub1) this).anInt11714 = (32 + (int) (Math.random() * 4.0)) * 272685353;
		((Class456_Sub1_Sub5_Sub1) this).anInt11715 = (3 + (int) (Math.random() * 2.0)) * 335911225;
		((Class456_Sub1_Sub5_Sub1) this).anInt11716 = (16 + (int) (Math.random() * 3.0)) * 117314745;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1382747510) == 1)
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 10.0) * -1642603165;
		else
			((Class456_Sub1_Sub5_Sub1) this).anInt11717 = (int) (Math.random() * 20.0) * -1642603165;
	}

	Class531 method8350(Class106 class106, int i) {
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		Class543 class543 = aClass523_9010.method6284(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, -1895812607);
		Class456_Sub1_Sub1 class456_sub1_sub1 = aClass523_9010.method6254(aByte9009, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 55538533);
		int i_84_ = 0;
		if (null != class543 && class543.aClass456_Sub1_Sub2_6099.aBool11498)
			i_84_ = class543.aClass456_Sub1_Sub2_6099.method8310((byte) -36);
		if (null != class456_sub1_sub1 && class456_sub1_sub1.aShort11275 > -i_84_)
			i_84_ = -class456_sub1_sub1.aShort11275;
		if (-1743753997 * anInt11709 != i_84_) {
			class240.aFloat2656 += (float) (i_84_ - anInt11709 * -1743753997);
			method5401(class240);
			anInt11709 = -447312837 * i_84_;
		}
		Class261 class261 = class106.method1753();
		class261.method3594();
		if (0 == -1743753997 * anInt11709) {
			boolean bool = false;
			boolean bool_85_ = false;
			boolean bool_86_ = false;
			Class174 class174 = aClass523_9010.aClass174Array5875[aByte9008];
			int i_87_ = 540907893 * ((Class456_Sub1_Sub5_Sub1) this).anInt11711 << 1;
			int i_88_ = i_87_;
			int i_89_ = -i_87_ / 2;
			int i_90_ = -i_88_ / 2;
			int i_91_ = class174.method2726(i_89_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_90_, 358769667);
			int i_92_ = i_87_ / 2;
			int i_93_ = -i_88_ / 2;
			int i_94_ = class174.method2726((int) class240.aFloat2653 + i_92_, i_93_ + (int) class240.aFloat2657, 358769667);
			int i_95_ = -i_87_ / 2;
			int i_96_ = i_88_ / 2;
			int i_97_ = class174.method2726(i_95_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_96_, 358769667);
			int i_98_ = i_87_ / 2;
			int i_99_ = i_88_ / 2;
			int i_100_ = class174.method2726((int) class240.aFloat2653 + i_98_, i_99_ + (int) class240.aFloat2657, 358769667);
			int i_101_ = i_91_ < i_94_ ? i_91_ : i_94_;
			int i_102_ = i_97_ < i_100_ ? i_97_ : i_100_;
			int i_103_ = i_94_ < i_100_ ? i_94_ : i_100_;
			int i_104_ = i_91_ < i_97_ ? i_91_ : i_97_;
			if (i_88_ != 0) {
				int i_105_ = ((int) (Math.atan2((double) (i_101_ - i_102_), (double) i_88_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_105_)
					class261.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(i_105_));
			}
			if (i_87_ != 0) {
				int i_106_ = ((int) (Math.atan2((double) (i_104_ - i_103_), (double) i_87_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_106_)
					class261.method3576(0.0F, 0.0F, 1.0F, Class325.method4146(-i_106_));
			}
			int i_107_ = i_100_ + i_91_;
			if (i_94_ + i_97_ < i_107_)
				i_107_ = i_94_ + i_97_;
			i_107_ = (i_107_ >> 1) - (int) class240.aFloat2656;
			if (0 != i_107_)
				class261.method3580(0.0F, (float) i_107_, 0.0F);
		}
		class240.method3261();
		Class240 class240_108_ = method5394().aClass240_2647;
		class261.method3580(class240_108_.aFloat2653, class240_108_.aFloat2656 - 10.0F, class240_108_.aFloat2657);
		Class531 class531 = Class572_Sub16_Sub9.method10262(true, -727063426);
		((Class456_Sub1_Sub5_Sub1) this).aBool11713 = false;
		((Class456_Sub1_Sub5_Sub1) this).anInt11711 = 0;
		if (anInt11706 * -325747261 != -1) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-325747261 * anInt11706, -1876667286)).method7526(class106, 526336, anInt11708 * -1551511447, null, null, ((Class456_Sub1_Sub5_Sub1) this).anInt11714 * -2130783463, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, -1320121269 * ((Class456_Sub1_Sub5_Sub1) this).anInt11717, 1912568529));
			if (null != model) {
				if (aClass261_11710 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11710);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[2], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		if (-1 != anInt11704 * -1730788149) {
			Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1730788149 * anInt11704, 1168871036)).method7526(class106, 526336, -2060829393 * anInt11705, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, -540298871 * ((Class456_Sub1_Sub5_Sub1) this).anInt11716, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, -2132322736));
			if (model != null) {
				if (aClass261_11707 == null)
					aClass261_11701.method3594();
				else
					aClass261_11701.method3568(aClass261_11707);
				aClass261_11701.method3584(class261);
				model.method1375(aClass261_11701, aClass90Array9007[1], 0);
				((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
				if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
					((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
			}
		}
		Model model = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(-1239711419 * anInt11712, -424665883)).method7526(class106, 526336, anInt11703 * 1704726277, null, null, -2130783463 * ((Class456_Sub1_Sub5_Sub1) this).anInt11714, -70548215 * ((Class456_Sub1_Sub5_Sub1) this).anInt11715, ((Class456_Sub1_Sub5_Sub1) this).anInt11716 * -540298871, ((Class456_Sub1_Sub5_Sub1) this).anInt11717 * -1320121269, -1549078249));
		if (model != null) {
			if (aClass261_11702 == null)
				aClass261_11701.method3594();
			else
				aClass261_11701.method3568(aClass261_11702);
			aClass261_11701.method3584(class261);
			model.method1375(aClass261_11701, aClass90Array9007[0], 0);
			((Class456_Sub1_Sub5_Sub1) this).aBool11713 |= model.method1400();
			if (model.method1379() > ((Class456_Sub1_Sub5_Sub1) this).anInt11711 * 540907893)
				((Class456_Sub1_Sub5_Sub1) this).anInt11711 = model.method1379() * 1959898845;
		}
		return class531;
	}
}
