package game;

/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public abstract class Class406 {
	Class404 aClass404_4756;
	String aString4757;
	int anInt4758;
	Class404 aClass404_4759;
	int anInt4760;
	Class405[] aClass405Array4761;
	protected int anInt4762 = -1363937537;
	static Interface4 anInterface4_4763 = new Class389();
	static boolean[][] aBoolArrayArray4764;
	public static int anInt4765;

	public abstract void method4857();

	public abstract void method4858();

	public abstract void method4859();

	public final void method4860(Class572_Sub8_Sub1 class572_sub8_sub1, int i, Interface34 interface34, byte i_0_) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4840(class572_sub8_sub1, i, interface34);
	}

	public String method4861(int i) {
		return ((Class406) this).aString4757;
	}

	abstract Class405 method4862(Class106_Sub3 class106_sub3, Class385 class385);

	public Class405 method4863(String string, int i) throws Exception_Sub3_Sub2 {
		Class405[] class405s = ((Class406) this).aClass405Array4761;
		for (int i_1_ = 0; i_1_ < class405s.length; i_1_++) {
			Class405 class405 = class405s[i_1_];
			String string_2_ = class405.method4821(344259418);
			if (string_2_ != null && string_2_.equals(string)) {
				if (!class405.method4803())
					throw new Exception_Sub3_Sub2(string);
				return class405;
			}
		}
		throw new Exception_Sub3_Sub2(string);
	}

	public final void method4864(int i, int i_3_, Interface34 interface34, short i_4_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4818(i, i_3_, interface34);
	}

	public final Class405 method4865(int i, int i_5_) {
		return ((Class406) this).aClass405Array4761[i];
	}

	public int method4866(Class405 class405, byte i) {
		for (int i_6_ = 0; i_6_ < ((Class406) this).aClass405Array4761.length; i_6_++) {
			if (class405 == ((Class406) this).aClass405Array4761[i_6_])
				return i_6_;
		}
		return -1;
	}

	public abstract boolean method4867();

	public abstract boolean method4868(Class405 class405);

	public final Class405 method4869(int i) {
		return (anInt4762 * 772077313 >= 0 ? ((Class406) this).aClass405Array4761[772077313 * anInt4762] : null);
	}

	public final void method4870(Class572_Sub8_Sub1 class572_sub8_sub1, float f, byte i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4804(class572_sub8_sub1, f);
	}

	abstract Class572_Sub8_Sub1 method4871(Class394 class394);

	public final void method4872(int i, float f, float f_7_, float f_8_, int i_9_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4843(i, f, f_7_, f_8_);
	}

	public final void method4873(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_10_, float f_11_, float f_12_, int i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4807(class572_sub8_sub1, f, f_10_, f_11_, f_12_);
	}

	public final void method4874(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_13_, float f_14_, byte i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4806(class572_sub8_sub1, f, f_13_, f_14_);
	}

	public final void method4875(Class572_Sub8_Sub1 class572_sub8_sub1, Class240 class240, byte i) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4806(class572_sub8_sub1, class240.aFloat2653, class240.aFloat2656, class240.aFloat2657);
	}

	public final void method4876(Class572_Sub8_Sub1 class572_sub8_sub1, Class209 class209, int i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4807(class572_sub8_sub1, class209.aFloat2436, class209.aFloat2434, class209.aFloat2433, class209.aFloat2435);
	}

	public final void method4877(Class572_Sub8_Sub1 class572_sub8_sub1, float[] fs, int i) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4808(class572_sub8_sub1, fs, fs.length);
	}

	public final void method4878(Class572_Sub8_Sub1 class572_sub8_sub1, int i, short i_15_) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_16_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_17_ = (float) (i & 0xff) / 255.0F;
		float f_18_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4873(class572_sub8_sub1, f, f_16_, f_17_, f_18_, -2043898618);
	}

	public final void method4879(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250, int i) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4810(class572_sub8_sub1, class250);
	}

	public final int method4880(int i) {
		return anInt4762 * 772077313;
	}

	public final void method4881(int i, float f, float f_19_, float f_20_, float f_21_, int i_22_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4813(i, f, f_19_, f_20_, f_21_);
	}

	public final void method4882(int i, Class240 class240, byte i_23_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4843(i, class240.aFloat2653, class240.aFloat2656, class240.aFloat2657);
	}

	public final void method4883(int i, float[] fs, int i_24_, int i_25_) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4802(i, fs, i_24_);
	}

	public final void method4884(int i, Class250 class250, int i_26_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4850(i, class250);
	}

	public Class572_Sub8_Sub1 method4885(String string, int i) throws Exception_Sub3_Sub1 {
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class572_Sub8_Sub1) ((Class406) this).aClass404_4756.method4792(string, -1763765014));
		if (null == class572_sub8_sub1)
			throw new Exception_Sub3_Sub1(string);
		return class572_sub8_sub1;
	}

	abstract Class572_Sub8_Sub1 method4886(Class394 class394);

	public Class572_Sub8_Sub1 method4887(int i, byte i_27_) {
		return ((Class572_Sub8_Sub1) ((Class406) this).aClass404_4759.method4791(i, 627294371));
	}

	public Class572_Sub8_Sub1 method4888(String string, byte i) {
		return ((Class572_Sub8_Sub1) ((Class406) this).aClass404_4759.method4792(string, 89475041));
	}

	public Class572_Sub8_Sub1 method4889(int i, byte i_28_) {
		return ((Class572_Sub8_Sub1) ((Class406) this).aClass404_4756.method4791(i, 1748339967));
	}

	void method4890() {
		/* empty */
	}

	public abstract boolean method4891();

	Class406(Class106_Sub3 class106_sub3, Class381 class381) {
		((Class406) this).aString4757 = ((Class381) class381).aString4598;
		((Class406) this).anInt4760 = -260120349 * ((Class381) class381).aClass394Array4595.length;
		((Class406) this).aClass404_4756 = new Class404(54093003 * ((Class406) this).anInt4760, anInterface4_4763);
		for (int i = 0; i < ((Class406) this).anInt4760 * 54093003; i++)
			((Class406) this).aClass404_4756.method4793(i, (((Class394) ((Class381) class381).aClass394Array4595[i]).aString4672), method4871(((Class381) class381).aClass394Array4595[i]), (byte) -83);
		((Class406) this).anInt4758 = ((Class381) class381).aClass394Array4599.length * -1362517633;
		((Class406) this).aClass404_4759 = new Class404(1156849279 * ((Class406) this).anInt4758, anInterface4_4763);
		for (int i = 0; i < 1156849279 * ((Class406) this).anInt4758; i++)
			((Class406) this).aClass404_4759.method4793(i, (((Class394) ((Class381) class381).aClass394Array4599[i]).aString4672), method4871(((Class381) class381).aClass394Array4599[i]), (byte) 17);
		((Class406) this).aClass405Array4761 = new Class405[((Class381) class381).aClass385Array4600.length];
		for (int i = 0; i < ((Class381) class381).aClass385Array4600.length; i++)
			((Class406) this).aClass405Array4761[i] = method4862(class106_sub3, ((Class381) class381).aClass385Array4600[i]);
	}

	public abstract void method4892();

	public abstract void method4893();

	public abstract boolean method4894(Class405 class405);

	public String method4895() {
		return ((Class406) this).aString4757;
	}

	public String method4896() {
		return ((Class406) this).aString4757;
	}

	public String method4897() {
		return ((Class406) this).aString4757;
	}

	abstract Class405 method4898(Class106_Sub3 class106_sub3, Class385 class385);

	public final int method4899() {
		return ((Class406) this).aClass405Array4761.length;
	}

	public final int method4900() {
		return ((Class406) this).aClass405Array4761.length;
	}

	void method4901() {
		/* empty */
	}

	public Class405 method4902(int i) {
		Class405[] class405s = ((Class406) this).aClass405Array4761;
		for (int i_29_ = 0; i_29_ < class405s.length; i_29_++) {
			Class405 class405 = class405s[i_29_];
			if (class405.method4803())
				return class405;
		}
		return null;
	}

	public final void method4903(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250, byte i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4809(class572_sub8_sub1, class250);
	}

	public int method4904() {
		return ((Class406) this).anInt4758 * 1156849279;
	}

	public final void method4905(int i, Class250 class250, byte i_30_) {
		((Class406) this).aClass405Array4761[772077313 * anInt4762].method4831(i, class250);
	}

	public final int method4906() {
		return anInt4762 * 772077313;
	}

	public final int method4907() {
		return anInt4762 * 772077313;
	}

	public final void method4908(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_31_, int i) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4801(class572_sub8_sub1, f, f_31_);
	}

	public final int method4909(int i) {
		return ((Class406) this).aClass405Array4761.length;
	}

	public final void method4910(int i, Class250 class250, byte i_32_) {
		((Class406) this).aClass405Array4761[anInt4762 * 772077313].method4816(i, class250);
	}

	public int method4911(int i) {
		return 54093003 * ((Class406) this).anInt4760;
	}

	public abstract boolean method4912(Class405 class405);

	public final int method4913() {
		return ((Class406) this).aClass405Array4761.length;
	}

	public int method4914() {
		return ((Class406) this).anInt4758 * 1156849279;
	}

	public int method4915() {
		return 54093003 * ((Class406) this).anInt4760;
	}

	public int method4916() {
		return 54093003 * ((Class406) this).anInt4760;
	}

	public int method4917(int i) {
		return ((Class406) this).anInt4758 * 1156849279;
	}

	void method4918() {
		/* empty */
	}

	public abstract void method4919();

	static String method4920(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		if (((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403 == null || ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403.length() == 0) {
			if ((null != ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391) && ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391.length() > 0)
				return new StringBuilder().append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11393).append(Class279.aClass279_3090.method3758(Class594.aClass435_7823, 16711935)).append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391).toString();
			return ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11393;
		}
		if (null != ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391 && ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391.length() > 0)
			return new StringBuilder().append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11393).append(Class279.aClass279_3090.method3758(Class594.aClass435_7823, 16711935)).append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391).append(Class279.aClass279_3090.method3758(Class594.aClass435_7823, 16711935)).append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403).toString();
		return new StringBuilder().append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11393).append(Class279.aClass279_3090.method3758(Class594.aClass435_7823, 16711935)).append(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403).toString();
	}

	static final void method4921(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class394.method4740(class73, class83, class441, -1665128073);
	}

	static final void method4922(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class317.method4085(class73, class83, class441, (byte) 88);
	}

	static final void method4923(Cs2Executor class441, int i) {
		int i_33_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_33_, (short) -21058);
		Class83 class83 = Class534.aClass83Array5975[i_33_ >> 16];
		Class289_Sub2.method8865(class73, class83, class441, -664258256);
	}

	static final void method4924(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		Class284 class284 = class73.method1093(Class133_Sub20.aClass324_10261, client.anInterface19_8776, 794160678);
		int i_34_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Point point = class284.method3838(class73.aString829, 669238293 * class73.anInt764, -32738705 * class73.anInt830, i_34_, Class14.aClass161Array123, -1360249581);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = point.x;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = point.y;
	}

	static final void method4925(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_35_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_36_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (-1 == i_36_)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class100.aClass616_1298.method7372(i_35_, 198221254).method10413((char) i_36_, -325540386);
	}

	static final boolean method4926(Class536[][][] class536s, int i, int i_37_, int i_38_, boolean bool, short i_39_) {
		byte[][][] is = client.aClass613_8605.method7346((byte) 117);
		byte i_40_ = bool ? (byte) 1 : (byte) (client.anInt8699 * 2074321681 & 0xff);
		if (i_40_ == is[-374189215 * Class274.anInt2911][i_37_][i_38_])
			return false;
		Class274 class274 = client.aClass613_8605.method7287((byte) -88);
		if (0 == ((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_37_][i_38_]) & 0x4))
			return false;
		int i_41_ = 0;
		int i_42_ = 0;
		client.anIntArray8658[i_41_] = i_37_;
		client.anIntArray8562[i_41_++] = i_38_;
		is[Class274.anInt2911 * -374189215][i_37_][i_38_] = i_40_;
		while (i_42_ != i_41_) {
			int i_43_ = client.anIntArray8658[i_42_] & 0xffff;
			int i_44_ = client.anIntArray8658[i_42_] >> 16 & 0xff;
			int i_45_ = client.anIntArray8658[i_42_] >> 24 & 0xff;
			int i_46_ = client.anIntArray8562[i_42_] & 0xffff;
			int i_47_ = client.anIntArray8562[i_42_] >> 16 & 0xff;
			i_42_ = i_42_ + 1 & 0xfff;
			boolean bool_48_ = false;
			if (0 == ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][i_43_][i_46_]) & 0x4))
				bool_48_ = true;
			boolean bool_49_ = false;
			if (class536s != null) {
				int i_50_ = Class274.anInt2911 * -374189215 + 1;
				while_31_: for (/**/; i_50_ <= 3; i_50_++) {
					if (class536s[i_50_] != null && ((class274.aByteArrayArrayArray2909[i_50_][i_43_][i_46_]) & 0x8) == 0) {
						if (bool_48_ && class536s[i_50_][i_43_][i_46_] != null) {
							if (null != (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5988)) {
								int i_51_ = Class593.method7020(i_44_, -1042067865);
								if (i_51_ == (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5988.aShort11519) || ((class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989) != null && (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989.aShort11519) == i_51_))
									continue;
								if (0 != i_45_) {
									int i_52_ = Class593.method7020(i_45_, -1042067865);
									if (i_52_ == (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5988.aShort11519) || (null != (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989) && (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989.aShort11519) == i_52_))
										continue;
								}
								if (0 != i_47_) {
									int i_53_ = Class593.method7020(i_47_, -1042067865);
									if ((class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5988.aShort11519) == i_53_ || (null != (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989) && (class536s[i_50_][i_43_][i_46_].aClass456_Sub1_Sub4_5989.aShort11519) == i_53_))
										continue;
								}
							}
							Class536 class536 = class536s[i_50_][i_43_][i_46_];
							if (null != class536.aClass543_5994) {
								for (Class543 class543 = class536.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
									Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
									if (class456_sub1_sub2 instanceof Interface65) {
										Interface65 interface65 = (Interface65) class456_sub1_sub2;
										int i_54_ = interface65.method304(1220917671);
										int i_55_ = interface65.method383(-136201696);
										if (i_54_ == 21)
											i_54_ = 19;
										int i_56_ = i_54_ | i_55_ << 6;
										if (i_56_ == i_44_ || i_45_ != 0 && i_56_ == i_45_ || 0 != i_47_ && i_56_ == i_47_)
											continue while_31_;
									}
								}
							}
						}
						Class536 class536 = class536s[i_50_][i_43_][i_46_];
						if (class536 != null && class536.aClass543_5994 != null) {
							for (Class543 class543 = class536.aClass543_5994; null != class543; class543 = class543.aClass543_6100) {
								Class456_Sub1_Sub2 class456_sub1_sub2 = class543.aClass456_Sub1_Sub2_6099;
								if ((class456_sub1_sub2.aShort11499 != class456_sub1_sub2.aShort11503) || (class456_sub1_sub2.aShort11500 != class456_sub1_sub2.aShort11502)) {
									short i_57_ = class456_sub1_sub2.aShort11503;
									short i_58_ = class456_sub1_sub2.aShort11499;
									short i_59_ = class456_sub1_sub2.aShort11500;
									short i_60_ = class456_sub1_sub2.aShort11502;
									int i_61_ = Math.max(0, Math.min(i_57_, (is[i_50_].length - 1)));
									int i_62_ = Math.max(0, Math.min(i_59_, (is[i_50_][0]).length - 1));
									int i_63_ = Math.max(0, Math.min(i_58_, (is[i_50_].length - 1)));
									int i_64_ = Math.max(0, Math.min(i_60_, (is[i_50_][0]).length - 1));
									for (/**/; i_61_ <= i_63_; i_61_++) {
										for (/**/; i_62_ <= i_64_; i_62_++)
											is[i_50_][i_61_][i_62_] = i_40_;
									}
								}
							}
						}
						is[i_50_][i_43_][i_46_] = i_40_;
						bool_49_ = true;
					}
				}
			}
			if (bool_49_) {
				int i_65_ = client.aClass613_8605.method7285(1080018415).aClass174Array5875[1 + Class274.anInt2911 * -374189215].method2713(i_43_, i_46_, 1286964414);
				if (client.anIntArray8701[i] < i_65_)
					client.anIntArray8701[i] = i_65_;
				int i_66_ = i_43_ << 9;
				int i_67_ = i_46_ << 9;
				if (client.anIntArray8716[i] > i_66_)
					client.anIntArray8716[i] = i_66_;
				else if (client.anIntArray8717[i] < i_66_)
					client.anIntArray8717[i] = i_66_;
				if (client.anIntArray8719[i] > i_67_)
					client.anIntArray8719[i] = i_67_;
				else if (client.anIntArray8718[i] < i_67_)
					client.anIntArray8718[i] = i_67_;
			}
			if (!bool_48_) {
				if (i_43_ >= 1 && (is[-374189215 * Class274.anInt2911][i_43_ - 1][i_46_] != i_40_)) {
					client.anIntArray8658[i_41_] = i_43_ - 1 | 0x120000 | ~0x2cffffff;
					client.anIntArray8562[i_41_] = i_46_ | 0x130000;
					i_41_ = i_41_ + 1 & 0xfff;
					is[Class274.anInt2911 * -374189215][i_43_ - 1][i_46_] = i_40_;
				}
				if (++i_46_ < client.aClass613_8605.method7278(277214477)) {
					if (i_43_ - 1 >= 0 && (is[-374189215 * Class274.anInt2911][i_43_ - 1][i_46_]) != i_40_ && 0 == ((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_43_][i_46_]) & 0x4) && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][i_43_ - 1][i_46_ - 1]) & 0x4) == 0) {
						client.anIntArray8658[i_41_] = i_43_ - 1 | 0x120000 | 0x52000000;
						client.anIntArray8562[i_41_] = i_46_ | 0x130000;
						i_41_ = 1 + i_41_ & 0xfff;
						is[Class274.anInt2911 * -374189215][i_43_ - 1][i_46_] = i_40_;
					}
					if (is[Class274.anInt2911 * -374189215][i_43_][i_46_] != i_40_) {
						client.anIntArray8658[i_41_] = i_43_ | 0x520000 | 0x13000000;
						client.anIntArray8562[i_41_] = i_46_ | 0x530000;
						i_41_ = i_41_ + 1 & 0xfff;
						is[Class274.anInt2911 * -374189215][i_43_][i_46_] = i_40_;
					}
					if ((1 + i_43_ < client.aClass613_8605.method7347(-176325012)) && (is[Class274.anInt2911 * -374189215][1 + i_43_][i_46_]) != i_40_ && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][i_43_][i_46_]) & 0x4) == 0 && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][1 + i_43_][i_46_ - 1]) & 0x4) == 0) {
						client.anIntArray8658[i_41_] = i_43_ + 1 | 0x520000 | ~0x6dffffff;
						client.anIntArray8562[i_41_] = i_46_ | 0x530000;
						i_41_ = 1 + i_41_ & 0xfff;
						is[Class274.anInt2911 * -374189215][i_43_ + 1][i_46_] = i_40_;
					}
				}
				i_46_--;
				if (1 + i_43_ < client.aClass613_8605.method7347(-51474349) && (is[Class274.anInt2911 * -374189215][1 + i_43_][i_46_] != i_40_)) {
					client.anIntArray8658[i_41_] = 1 + i_43_ | 0x920000 | 0x53000000;
					client.anIntArray8562[i_41_] = i_46_ | 0x930000;
					i_41_ = i_41_ + 1 & 0xfff;
					is[Class274.anInt2911 * -374189215][1 + i_43_][i_46_] = i_40_;
				}
				if (--i_46_ >= 0) {
					if (i_43_ - 1 >= 0 && (is[Class274.anInt2911 * -374189215][i_43_ - 1][i_46_]) != i_40_ && ((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_43_][i_46_]) & 0x4) == 0 && 0 == ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][i_43_ - 1][1 + i_46_]) & 0x4)) {
						client.anIntArray8658[i_41_] = i_43_ - 1 | 0xd20000 | 0x12000000;
						client.anIntArray8562[i_41_] = i_46_ | 0xd30000;
						i_41_ = 1 + i_41_ & 0xfff;
						is[-374189215 * Class274.anInt2911][i_43_ - 1][i_46_] = i_40_;
					}
					if (is[-374189215 * Class274.anInt2911][i_43_][i_46_] != i_40_) {
						client.anIntArray8658[i_41_] = i_43_ | 0xd20000 | ~0x6cffffff;
						client.anIntArray8562[i_41_] = i_46_ | 0xd30000;
						i_41_ = 1 + i_41_ & 0xfff;
						is[Class274.anInt2911 * -374189215][i_43_][i_46_] = i_40_;
					}
					if ((i_43_ + 1 < client.aClass613_8605.method7347(1602817281)) && (is[-374189215 * Class274.anInt2911][1 + i_43_][i_46_]) != i_40_ && 0 == ((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_43_][i_46_]) & 0x4) && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][1 + i_43_][1 + i_46_]) & 0x4) == 0) {
						client.anIntArray8658[i_41_] = 1 + i_43_ | 0x920000 | ~0x2dffffff;
						client.anIntArray8562[i_41_] = i_46_ | 0x930000;
						i_41_ = i_41_ + 1 & 0xfff;
						is[-374189215 * Class274.anInt2911][1 + i_43_][i_46_] = i_40_;
					}
				}
			}
		}
		if (client.anIntArray8701[i] != -1000000) {
			client.anIntArray8701[i] += 40;
			client.anIntArray8716[i] -= 512;
			client.anIntArray8717[i] += 512;
			client.anIntArray8718[i] += 512;
			client.anIntArray8719[i] -= 512;
		}
		return true;
	}
}
