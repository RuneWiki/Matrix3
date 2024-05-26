package game;

/* Class456_Sub1_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public abstract class Entity extends Class456_Sub1_Sub2 implements Interface48 {
	public byte aByte11605;
	byte aByte11606;
	public int[] anIntArray11607;
	Class583 aClass583_11608;
	public int anInt11609;
	int anInt11610;
	public int[] anIntArray11611;
	public boolean aBool11612;
	public int anInt11613;
	public int anInt11614;
	public int stepsCount;
	int anInt11616;
	int anInt11617;
	int anInt11618;
	public int anInt11619;
	public int[] screenX;
	static final int anInt11621 = 20;
	public Class83 aClass83_11622;
	public int[] anIntArray11623;
	public int anInt11624;
	public int[] anIntArray11625;
	public byte aByte11626;
	public Class652 aClass652_11627;
	public int[] anIntArray11628;
	static final int anInt11629 = 5;
	public Class586[] currentGraphics;
	public Class663_Sub2 aClass663_Sub2_11631;
	int anInt11632;
	public int anInt11633 = -2118180903;
	public int anInt11634;
	public int anInt11635;
	public int anInt11636;
	public int anInt11637;
	public int anInt11638;
	public int anInt11639;
	public int[] anIntArray11640;
	public int anInt11641;
	public int anInt11642;
	public byte aByte11643;
	public byte aByte11644;
	int anInt11645;
	public int anInt11646;
	int anInt11647;
	int anInt11648;
	public int anInt11649;
	public Class663_Sub3_Sub1[] aClass663_Sub3_Sub1Array11650;
	public int[] anIntArray11651;
	public int anInt11652;
	public int anInt11653;
	public int anInt11654;
	public Class15 aClass15_11655;
	public Class15 aClass15_11656;
	public Class15 aClass15_11657;
	int anInt11658;
	Class485 aClass485_11659;
	public int[] screenY;
	public byte[] aByteArray11661;
	public int anInt11662;
	public int anInt11663;
	public int anInt11664;
	public int[] anIntArray11665;
	boolean aBool11666;
	boolean aBool11667;
	public Model[] models;
	public Interface71 anInterface71_11669;
	public Class663 aClass663_11670;
	public int anInt11671;
	int anInt11672;
	public IVarDomain anInterface14_11673;
	public static int anInt11674;

	public int method10514() {
		return ((Entity) this).anInt11632 * -1880837087;
	}

	boolean method10515(int i) {
		if (-1 == 1990220905 * ((Entity) this).anInt11672)
			return false;
		return method10537((((Entity) this).anInt11672 * 1990220905), (byte) 36);
	}

	public int method8310(byte i) {
		if (-1926256345 * ((Entity) this).anInt11610 == -32768)
			return 0;
		return -1926256345 * ((Entity) this).anInt11610;
	}

	boolean method8300(int i) {
		return false;
	}

	public void method10516(int i, boolean bool, int i_0_) {
		Class538 class538 = method10554((byte) 34);
		if (bool || 2080485441 * class538.anInt6049 != 0 || anInt11653 * 1589221153 != 0) {
			anInt11654 = (i & 0x3fff) * 911726529;
			aClass15_11655.method644(anInt11654 * 478165057, (byte) 37);
		}
	}

	public int method10517(short i) {
		Class538 class538 = method10554((byte) 88);
		int i_1_ = 452190977 * aClass15_11655.anInt125;
		boolean bool;
		if (class538.anInt6049 * 2080485441 != 0)
			bool = aClass15_11655.method643(anInt11654 * 478165057, 2080485441 * class538.anInt6049, -296295651 * class538.anInt6044, (byte) 0);
		else
			bool = aClass15_11655.method643(anInt11654 * 478165057, anInt11653 * 1589221153, anInt11653 * 1589221153, (byte) 0);
		int i_2_ = aClass15_11655.anInt125 * 452190977 - i_1_;
		if (0 != i_2_)
			anInt11652 += 1592029897;
		else {
			anInt11652 = 0;
			aClass15_11655.method644(anInt11654 * 478165057, (byte) 41);
		}
		if (bool) {
			if (0 != class538.anInt6051 * -854929471) {
				if (i_2_ > 0)
					aClass15_11656.method643(493296853 * class538.anInt6053, -854929471 * class538.anInt6051, class538.anInt6052 * 2075431863, (byte) 0);
				else
					aClass15_11656.method643(-(class538.anInt6053 * 493296853), -854929471 * class538.anInt6051, 2075431863 * class538.anInt6052, (byte) 0);
			}
			if (class538.anInt6047 * -1419879853 != 0)
				aClass15_11657.method643(class538.anInt6050 * -2091503247, -1419879853 * class538.anInt6047, class538.anInt6035 * -487536661, (byte) 0);
		} else {
			if (0 != -854929471 * class538.anInt6051)
				aClass15_11656.method643(0, class538.anInt6051 * -854929471, class538.anInt6052 * 2075431863, (byte) 0);
			else
				aClass15_11656.method644(0, (byte) 33);
			if (0 != class538.anInt6047 * -1419879853)
				aClass15_11657.method643(0, class538.anInt6047 * -1419879853, -487536661 * class538.anInt6035, (byte) 0);
			else
				aClass15_11657.method644(0, (byte) 39);
		}
		return i_2_;
	}

	public void method10518(int[] is, int[] is_3_, byte i) {
		if (null == anIntArray11607 && null != is)
			anIntArray11607 = new int[Class93.aClass504_1247.anIntArray5580.length];
		else if (null == is) {
			anIntArray11607 = null;
			return;
		}
		for (int i_4_ = 0; i_4_ < anIntArray11607.length; i_4_++)
			anIntArray11607[i_4_] = -1;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is_3_[i_5_];
			int i_7_ = 0;
			while (i_7_ < anIntArray11607.length) {
				if ((i_6_ & 0x1) != 0)
					anIntArray11607[i_7_] = is[i_5_];
				i_7_++;
				i_6_ >>= 1;
			}
		}
	}

	public boolean method10519(int i, int i_8_, int i_9_) {
		if (anIntArray11651 == null) {
			if (i_8_ == -1)
				return true;
			anIntArray11651 = new int[Class93.aClass504_1247.anIntArray5580.length];
			for (int i_10_ = 0; i_10_ < Class93.aClass504_1247.anIntArray5580.length; i_10_++)
				anIntArray11651[i_10_] = -1;
		}
		Class538 class538 = method10554((byte) -48);
		int i_11_ = 256;
		if (class538.anIntArray6045 != null && class538.anIntArray6045[i] > 0)
			i_11_ = class538.anIntArray6045[i];
		if (i_8_ == -1) {
			if (-1 == anIntArray11651[i])
				return true;
			int i_12_ = aClass15_11655.method645(-2142003940);
			int i_13_ = anIntArray11651[i];
			int i_14_ = i_12_ - i_13_;
			if (i_14_ >= -i_11_ && i_14_ <= i_11_) {
				anIntArray11651[i] = -1;
				for (int i_15_ = 0; i_15_ < Class93.aClass504_1247.anIntArray5580.length; i_15_++) {
					if (anIntArray11651[i_15_] != -1)
						return true;
				}
				anIntArray11651 = null;
				return true;
			}
			if (i_14_ > 0 && i_14_ <= 8192 || i_14_ <= -8192)
				anIntArray11651[i] = i_13_ + i_11_ & 0x3fff;
			else
				anIntArray11651[i] = i_13_ - i_11_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray11651[i])
			anIntArray11651[i] = aClass15_11655.method645(1746592548);
		int i_16_ = anIntArray11651[i];
		int i_17_ = i_8_ - i_16_;
		if (i_17_ >= -i_11_ && i_17_ <= i_11_) {
			anIntArray11651[i] = i_8_;
			return true;
		}
		if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
			anIntArray11651[i] = i_11_ + i_16_ & 0x3fff;
		else
			anIntArray11651[i] = i_16_ - i_11_ & 0x3fff;
		return false;
	}

	boolean method8315() {
		return false;
	}

	public final void method10520(int i, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_, int i_22_) {
		Class586 class586 = currentGraphics[i_21_];
		int i_23_ = class586.id * -1701003211;
		if (-1 != i && -1 != i_23_) {
			if (i_23_ == i) {
				GraphicsDefinition class659 = (GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i, -2145695919);
				if (class659.aBool8427 && -1 != class659.anInt8433 * 1281094747) {
					AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class659.anInt8433 * 1281094747, -1607704379)));
					int i_24_ = class132.anInt1558 * -730435523;
					if (i_24_ == 0)
						return;
					if (i_24_ == 2) {
						class586.aClass663_7776.method7831(14412574);
						return;
					}
				}
			} else {
				GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i, -401620861));
				GraphicsDefinition class659_25_ = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i_23_, 221600923));
				if (-1 != 1281094747 * class659.anInt8433 && class659_25_.anInt8433 * 1281094747 != -1) {
					AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, -1946968577)));
					AnimationDefinition class132_26_ = (AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659_25_.anInt8433, -1162295563));
					if (1882694951 * class132.priority < class132_26_.priority * 1882694951)
						return;
				}
			}
		}
		int i_27_ = 0;
		if (i != -1 && !((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i, -2076282614)).aBool8427)
			i_27_ = 2;
		if (-1 != i && bool)
			i_27_ = 1;
		class586.id = i * -803171811;
		class586.anInt7778 = i_20_ * 103886255;
		class586.height = -231350429 * (i_18_ >> 16);
		class586.anInt7777 = i_19_ * -1914017185;
		class586.aClass663_7776.method7792((-1 != i ? (((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i, 1476646957)).anInt8433) * 1281094747 : -1), i_18_ & 0xffff, i_27_, false, 2031674070);
	}

	public final void method10521(byte i) {
		stepsCount = 0;
		anInt11663 = 0;
	}

	public final void method10522(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		boolean bool = true;
		boolean bool_34_ = true;
		for (int i_35_ = 0; i_35_ < 1403567909 * JS5ConfigGroup.aClass484_2593.anInt5390; i_35_++) {
			if (anIntArray11628[i_35_] > i_31_)
				bool = false;
			else
				bool_34_ = false;
		}
		int i_36_ = -1;
		int i_37_ = -1;
		int i_38_ = 0;
		if (i >= 0) {
			Class519 class519 = ((Class519) Class319.aClass639_Sub17_3889.getDefinition(i, 1599451536));
			i_37_ = class519.anInt5774 * -575487365;
			i_38_ = class519.anInt5765 * -1707195987;
		}
		if (bool_34_) {
			if (-1 == i_37_)
				return;
			i_36_ = 0;
			int i_39_ = 0;
			if (i_37_ == 0)
				i_39_ = anIntArray11628[0];
			else if (1 == i_37_)
				i_39_ = anIntArray11623[0];
			for (int i_40_ = 1; i_40_ < JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909; i_40_++) {
				if (0 == i_37_) {
					if (anIntArray11628[i_40_] < i_39_) {
						i_36_ = i_40_;
						i_39_ = anIntArray11628[i_40_];
					}
				} else if (i_37_ == 1 && anIntArray11623[i_40_] < i_39_) {
					i_36_ = i_40_;
					i_39_ = anIntArray11623[i_40_];
				}
			}
			if (1 == i_37_ && i_39_ >= i_28_)
				return;
		} else {
			if (bool)
				((Entity) this).aByte11606 = (byte) 0;
			for (int i_41_ = 0; i_41_ < JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909; i_41_++) {
				int i_42_ = ((Entity) this).aByte11606;
				((Entity) this).aByte11606 = (byte) ((((Entity) this).aByte11606 + 1) % (JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909));
				if (anIntArray11628[i_42_] <= i_31_) {
					i_36_ = i_42_;
					break;
				}
			}
		}
		if (i_36_ >= 0) {
			anIntArray11611[i_36_] = i;
			anIntArray11623[i_36_] = i_28_;
			anIntArray11625[i_36_] = i_29_;
			anIntArray11665[i_36_] = i_30_;
			anIntArray11628[i_36_] = i_32_ + (i_38_ + i_31_);
		}
	}

	boolean method10523() {
		if (-1 == 1990220905 * ((Entity) this).anInt11672)
			return false;
		return method10537((((Entity) this).anInt11672 * 1990220905), (byte) 115);
	}

	public final void method10524(int i, int i_43_) {
		Class566 class566 = (Class566) Class506.aClass639_Sub21_5598.getDefinition(i, -49291338);
		for (Class591_Sub6 class591_sub6 = (Class591_Sub6) aClass652_11627.method7697(32851010); null != class591_sub6; class591_sub6 = (Class591_Sub6) aClass652_11627.method7698(1583068267)) {
			if (class591_sub6.aClass566_9434 == class566) {
				class591_sub6.method7002((byte) 33);
				break;
			}
		}
	}

	public int method8312(int i) {
		Class538 class538 = method10554((byte) 6);
		int i_44_;
		if (-1 != class538.anInt6054 * -893579993)
			i_44_ = -893579993 * class538.anInt6054;
		else if (-32768 == -1818465511 * ((Entity) this).anInt11658)
			i_44_ = 200;
		else
			i_44_ = -(-1818465511 * ((Entity) this).anInt11658);
		Class238 class238 = method5394();
		int i_45_ = (int) class238.aClass240_2647.aFloat2653 >> 9;
		int i_46_ = (int) class238.aClass240_2647.aFloat2657 >> 9;
		if (null != aClass523_9010 && i_45_ >= 1 && i_46_ >= 1 && i_45_ <= client.aClass613_8605.method7347(1681374347) - 1 && i_46_ <= client.aClass613_8605.method7278(277214477) - 1) {
			Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][i_45_][i_46_]);
			if (class536 != null && null != class536.aClass456_Sub1_Sub1_5992)
				return i_44_ + class536.aClass456_Sub1_Sub1_5992.aShort11275;
		}
		return i_44_;
	}

	public void method10525(int i, byte i_47_) {
		((Entity) this).anInt11632 = -8925215 * i;
	}

	Entity(Class523 class523, Class202_Sub1 class202_sub1) {
		this(class523, 10, class202_sub1);
	}

	public void method10526(int i) {
		((Entity) this).anInt11632 = -8925215 * i;
	}

	void method10527(Model model, byte i) {
		int i_48_ = 452190977 * aClass15_11656.anInt125;
		int i_49_ = aClass15_11657.anInt125 * 452190977;
		if (i_48_ != 0 || i_49_ != 0) {
			int i_50_ = model.method1382() / 2;
			model.method1358(0, -i_50_, 0);
			model.method1500(i_48_ & 0x3fff);
			model.method1368(i_49_ & 0x3fff);
			model.method1358(0, i_50_, 0);
		}
	}

	void method10528(Class106 class106, Class538 class538, int i, int i_51_, int i_52_, int i_53_, int i_54_) {
		for (int index = 0; index < currentGraphics.length; index++) {
			byte i_56_ = 0;
			if (index == 0)
				i_56_ = (byte) 2;
			else if (index == 1)
				i_56_ = (byte) 5;
			else if (2 == index)
				i_56_ = (byte) 1;
			else if (3 == index)
				i_56_ = (byte) 7;
			else if (index == 4)
				i_56_ = (byte) 8;
			Class586 class586 = currentGraphics[index];
			if (class586.id * -1701003211 != -1 && !class586.aClass663_7776.method7793(-2079565300)) {
				GraphicsDefinition graphic = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(-1701003211 * class586.id, 235749166)));
				int i_57_ = i;
				if (0 != class586.anInt7777 * 1510764959)
					i_57_ |= 0x5;
				if (class586.height * 632461899 != 0)
					i_57_ |= 0x2;
				if (class586.anInt7778 * 1525958991 >= 0)
					i_57_ |= 0x7;
				if (1525958991 * class586.anInt7778 >= 0 && class538.anIntArrayArray6025 != null && (class538.anIntArrayArray6025[1525958991 * class586.anInt7778]) != null) {
					Model model = (models[1 + index] = graphic.method7760(class106, i_57_, class586.aClass663_7776, i_56_, 2140189820));
					if (null != model) {
						int i_58_ = 0;
						int i_59_ = 0;
						int i_60_ = 0;
						if (null != class538.anIntArrayArray6025 && (class538.anIntArrayArray6025[class586.anInt7778 * 1525958991]) != null) {
							i_58_ += (class538.anIntArrayArray6025[1525958991 * class586.anInt7778][0]);
							i_59_ += (class538.anIntArrayArray6025[1525958991 * class586.anInt7778][1]);
							i_60_ += (class538.anIntArrayArray6025[class586.anInt7778 * 1525958991][2]);
						}
						if (class538.anIntArrayArray6029 != null && null != (class538.anIntArrayArray6029[1525958991 * class586.anInt7778])) {
							i_58_ += (class538.anIntArrayArray6029[1525958991 * class586.anInt7778][0]);
							i_59_ += (class538.anIntArrayArray6029[1525958991 * class586.anInt7778][1]);
							i_60_ += (class538.anIntArrayArray6029[class586.anInt7778 * 1525958991][2]);
						}
						if (i_60_ != 0 || i_58_ != 0) {
							int i_61_ = i_53_;
							if (anIntArray11651 != null && (anIntArray11651[class586.anInt7778 * 1525958991]) != -1)
								i_61_ = (anIntArray11651[1525958991 * class586.anInt7778]);
							int i_62_ = ((1670182912 * class586.anInt7777 + i_61_ - i_53_) & 0x3fff);
							if (0 != i_62_)
								model.method1355(i_62_);
							int i_63_ = Class325.anIntArray4103[i_62_];
							int i_64_ = Class325.anIntArray4105[i_62_];
							int i_65_ = i_64_ * i_58_ + i_60_ * i_63_ >> 14;
							i_60_ = i_60_ * i_64_ - i_63_ * i_58_ >> 14;
							i_58_ = i_65_;
						}
						model.method1358(i_58_, i_59_, i_60_);
						if (0 != class586.height * 632461899)
							model.method1358(0, -(632461899 * class586.height) << 2, 0);
					}
				} else {
					// System.out.println(index+", "+models.length);
					Model model = (models[1 + index] = (graphic.method7764(class106, i_57_, class586.anInt7777 * 1670182912, (((Entity) this).anInt11616 * -329006609), (((Entity) this).anInt11648 * -1081740099), (((Entity) this).anInt11618 * -2092938715), class586.aClass663_7776, i_56_, 1913622280)));
					if (null != model && class586.height * 632461899 != 0)
						model.method1358(0, -(632461899 * class586.height) << 2, 0);
				}
			} else
				models[index + 1] = null;
		}
	}

	public void method10529(int i) {
		((Entity) this).anInt11632 = -8925215 * i;
	}

	boolean method8301(byte i) {
		return ((Entity) this).aBool11667;
	}

	public Class497 method10530(int i) {
		Class240 class240 = method5394().aClass240_2647;
		Class497 class497 = client.aClass613_8605.method7280((byte) -84);
		int i_66_ = (((int) class240.aFloat2653 >> 9) + class497.localX * -2109597897);
		int i_67_ = (((int) class240.aFloat2657 >> 9) + class497.localY * 417324155);
		return new Class497(aByte9009, i_66_, i_67_);
	}

	public abstract int method10531(int i);

	public void method10532(int i) {
		if (((Entity) this).aClass583_11608 != null && (((Class583) ((Entity) this).aClass583_11608).aString7730) != null) {
			((Class583) ((Entity) this).aClass583_11608).anInt7727 -= -547525443;
			if (505998997 * ((Class583) (((Entity) this).aClass583_11608)).anInt7727 == 0)
				((Class583) ((Entity) this).aClass583_11608).aString7730 = null;
		}
	}

	public abstract boolean method10533(int i);

	public void method10534() {
		if (((Entity) this).aClass583_11608 != null && (((Class583) ((Entity) this).aClass583_11608).aString7730) != null) {
			((Class583) ((Entity) this).aClass583_11608).anInt7727 -= -547525443;
			if (505998997 * ((Class583) (((Entity) this).aClass583_11608)).anInt7727 == 0)
				((Class583) ((Entity) this).aClass583_11608).aString7730 = null;
		}
	}

	public abstract int method10535();

	void method10536(Class106 class106, Model[] class89s, Class261 class261, boolean bool, int i) {
		if (!bool) {
			int i_68_ = 0;
			int i_69_ = 0;
			int i_70_ = 0;
			int i_71_ = 0;
			int i_72_ = -1;
			int i_73_ = -1;
			Class84[][] class84s = new Class84[class89s.length][];
			Class175[][] class175s = new Class175[class89s.length][];
			for (int i_74_ = 0; i_74_ < class89s.length; i_74_++) {
				if (null != class89s[i_74_]) {
					class89s[i_74_].method1426(class261);
					class84s[i_74_] = class89s[i_74_].method1394();
					class175s[i_74_] = class89s[i_74_].method1507();
					if (null != class84s[i_74_]) {
						i_72_ = i_74_;
						i_69_++;
						i_68_ += class84s[i_74_].length;
					}
					if (null != class175s[i_74_]) {
						i_73_ = i_74_;
						i_71_++;
						i_70_ += class175s[i_74_].length;
					}
				}
			}
			if ((null == ((Entity) this).aClass485_11659 || ((Entity) this).aClass485_11659.aBool5432) && (i_69_ > 0 || i_71_ > 0))
				((Entity) this).aClass485_11659 = Class485.method5766(client.cycles, true);
			if (null != ((Entity) this).aClass485_11659) {
				Object object = null;
				Class84[] class84s_75_;
				if (i_69_ == 1)
					class84s_75_ = class84s[i_72_];
				else {
					class84s_75_ = new Class84[i_68_];
					int i_76_ = 0;
					for (int i_77_ = 0; i_77_ < class89s.length; i_77_++) {
						if (null != class84s[i_77_]) {
							System.arraycopy(class84s[i_77_], 0, class84s_75_, i_76_, class84s[i_77_].length);
							i_76_ += class84s[i_77_].length;
						}
					}
				}
				Object object_78_ = null;
				Class175[] class175s_79_;
				if (i_71_ == 1)
					class175s_79_ = class175s[i_73_];
				else {
					class175s_79_ = new Class175[i_70_];
					int i_80_ = 0;
					for (int i_81_ = 0; i_81_ < class89s.length; i_81_++) {
						if (null != class175s[i_81_]) {
							System.arraycopy(class175s[i_81_], 0, class175s_79_, i_80_, class175s[i_81_].length);
							i_80_ += class175s[i_81_].length;
						}
					}
				}
				((Entity) this).aClass485_11659.method5771(class106, (long) client.cycles, class84s_75_, class175s_79_, false);
				((Entity) this).aBool11666 = true;
			}
		} else if (null != ((Entity) this).aClass485_11659)
			((Entity) this).aClass485_11659.method5770((long) client.cycles);
		if (((Entity) this).aClass485_11659 != null)
			((Entity) this).aClass485_11659.method5775(aByte9009, aShort11503, aShort11499, aShort11500, aShort11502);
	}

	public void method10470() {
		int i = ((((Entity) this).anInt11632 * -1880837087 - 1 << 8) + 240);
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = (short) ((int) class240.aFloat2653 - i >> 9);
		aShort11500 = (short) ((int) class240.aFloat2657 - i >> 9);
		aShort11499 = (short) (i + (int) class240.aFloat2653 >> 9);
		aShort11502 = (short) ((int) class240.aFloat2657 + i >> 9);
	}

	boolean method10537(int i, byte i_82_) {
		if (i == anInt11671 * 226833971)
			return true;
		aClass83_11622 = Class195.method2947(i, null, null, true, 1500169052);
		if (aClass83_11622 == null)
			return false;
		anInt11671 = -2103921413 * i;
		Class281.method3798(aClass83_11622.aClass73Array1081, 94389987);
		return true;
	}

	void method10538(int i) {
		if (-1 != anInt11671 * 226833971) {
			VarDefinition.method2774(226833971 * anInt11671, (byte) -100);
			aClass83_11622 = null;
			anInt11671 = 2103921413;
		}
	}

	Entity(Class523 class523, int i, Class202_Sub1 class202_sub1) {
		super(class523, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		((Entity) this).anInt11632 = -8925215;
		((Entity) this).anInt11610 = 1689550848;
		((Entity) this).anInt11658 = 527138816;
		aBool11612 = true;
		anInt11613 = 0;
		anInt11614 = -1052554037;
		anInt11646 = 0;
		((Entity) this).anInt11617 = 0;
		((Entity) this).aByte11606 = (byte) 0;
		anIntArray11611 = new int[1403567909 * JS5ConfigGroup.aClass484_2593.anInt5390];
		anIntArray11623 = new int[JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909];
		anIntArray11628 = new int[JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909];
		anIntArray11625 = new int[1403567909 * JS5ConfigGroup.aClass484_2593.anInt5390];
		anIntArray11665 = new int[JS5ConfigGroup.aClass484_2593.anInt5390 * 1403567909];
		aClass652_11627 = new Class652();
		anInt11619 = -320688299;
		anIntArray11640 = null;
		aClass663_Sub2_11631 = new Class663_Sub2(this, false);
		aClass663_11670 = new Class663_Sub3(this, false);
		anInt11641 = -1008238467;
		anInt11642 = 1559016237;
		aByte11605 = (byte) 0;
		((Entity) this).anInt11645 = -207138037;
		((Entity) this).anInt11647 = 0;
		anInt11649 = 0;
		anInt11652 = 0;
		anInt11653 = 1487724800;
		aClass15_11655 = new Class15();
		aClass15_11656 = new Class15();
		aClass15_11657 = new Class15();
		stepsCount = 0;
		anInt11662 = 0;
		anInt11663 = 0;
		anInt11664 = 0;
		((Entity) this).aBool11666 = false;
		((Entity) this).aBool11667 = false;
		anInt11671 = 2103921413;
		((Entity) this).anInt11672 = 464849959;
		anInterface14_11673 = new Class581(this);
		screenX = new int[i];
		screenY = new int[i];
		aByteArray11661 = new byte[i];
		models = new Model[6];
		currentGraphics = new Class586[5];
		for (int i_83_ = 0; i_83_ < 5; i_83_++)
			currentGraphics[i_83_] = new Class586(this);
		aClass663_Sub3_Sub1Array11650 = (new Class663_Sub3_Sub1[Class93.aClass504_1247.anIntArray5580.length]);
		anInterface71_11669 = new Class630(class202_sub1);
	}

	public void method10539(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		if (!method10515(1716215120)) {
			if (-1 != i)
				client.aBoolArray8784[i] = true;
			else {
				for (int i_91_ = 0; i_91_ < 107; i_91_++)
					client.aBoolArray8784[i_91_] = true;
			}
		} else
			Class348.method4343(aClass83_11622.method1257(-2030394250), -1, i_84_, i_85_, i_86_, i_87_, i_88_, i_89_, i, false, (byte) -16);
	}

	public void method10540(int i, int i_92_, boolean bool, byte i_93_) {
		if (method10515(1716215120))
			Class133_Sub3.method9337(aClass83_11622.aClass73Array1081, -1, i, i_92_, bool, 2102062173);
	}

	public abstract int method10541(int i);

	public int method8325() {
		Class538 class538 = method10554((byte) -45);
		int i;
		if (-1 != class538.anInt6054 * -893579993)
			i = -893579993 * class538.anInt6054;
		else if (-32768 == -1818465511 * ((Entity) this).anInt11658)
			i = 200;
		else
			i = -(-1818465511 * ((Entity) this).anInt11658);
		Class238 class238 = method5394();
		int i_94_ = (int) class238.aClass240_2647.aFloat2653 >> 9;
		int i_95_ = (int) class238.aClass240_2647.aFloat2657 >> 9;
		if (null != aClass523_9010 && i_94_ >= 1 && i_95_ >= 1 && i_94_ <= client.aClass613_8605.method7347(-814717237) - 1 && i_95_ <= client.aClass613_8605.method7278(277214477) - 1) {
			Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][i_94_][i_95_]);
			if (class536 != null && null != class536.aClass456_Sub1_Sub1_5992)
				return i + class536.aClass456_Sub1_Sub1_5992.aShort11275;
		}
		return i;
	}

	public Class572_Sub17 method10542(int i) {
		Class240 class240 = method5394().aClass240_2647;
		Class497 class497 = client.aClass613_8605.method7280((byte) -15);
		int i_96_ = -2077331968 * class497.localX + (int) class240.aFloat2653;
		int i_97_ = (int) class240.aFloat2656;
		int i_98_ = class497.localY * -1078397440 + (int) class240.aFloat2657;
		return new Class572_Sub17(aByte9009, i_96_, i_97_, i_98_);
	}

	void method10543() {
		if (null != ((Entity) this).aClass485_11659)
			((Entity) this).aClass485_11659.method5783();
	}

	boolean method8331() {
		return false;
	}

	public void method10544(int i, int i_99_) {
		if (1990220905 * ((Entity) this).anInt11672 != anInt11671 * 226833971)
			method10538(-301721447);
		((Entity) this).anInt11672 = -464849959 * i;
	}

	boolean method8317() {
		return ((Entity) this).aBool11667;
	}

	boolean method8329() {
		return ((Entity) this).aBool11667;
	}

	boolean method8319() {
		return ((Entity) this).aBool11667;
	}

	public void method10545(String string, int i, int i_100_, int i_101_, int i_102_) {
		if (((Entity) this).aClass583_11608 == null)
			((Entity) this).aClass583_11608 = new Class583();
		((Class583) ((Entity) this).aClass583_11608).aString7730 = string;
		((Class583) ((Entity) this).aClass583_11608).anInt7726 = i * 1947406395;
		((Class583) ((Entity) this).aClass583_11608).anInt7728 = i_100_ * -928785829;
		((Class583) ((Entity) this).aClass583_11608).anInt7727 = (((Class583) ((Entity) this).aClass583_11608).anInt7729 = i_101_ * -690069765) * -258820697;
	}

	public int method8316() {
		if (-1926256345 * ((Entity) this).anInt11610 == -32768)
			return 0;
		return -1926256345 * ((Entity) this).anInt11610;
	}

	public void method10546(int i, int i_103_) {
		Class538 class538 = method10554((byte) 25);
		if (2080485441 * class538.anInt6049 != 0 || anInt11653 * 1589221153 != 0) {
			aClass15_11655.method647((byte) 24);
			int i_104_ = i - 452190977 * aClass15_11655.anInt125 & 0x3fff;
			if (i_104_ > 8192)
				anInt11654 = 911726529 * (452190977 * aClass15_11655.anInt125 - (16384 - i_104_));
			else
				anInt11654 = 911726529 * (i_104_ + aClass15_11655.anInt125 * 452190977);
		}
	}

	public int method8323() {
		if (-1926256345 * ((Entity) this).anInt11610 == -32768)
			return 0;
		return -1926256345 * ((Entity) this).anInt11610;
	}

	public void method10547(int i) {
		Class538 class538 = method10554((byte) -54);
		if (2080485441 * class538.anInt6049 != 0 || anInt11653 * 1589221153 != 0) {
			aClass15_11655.method647((byte) 40);
			int i_105_ = i - 452190977 * aClass15_11655.anInt125 & 0x3fff;
			if (i_105_ > 8192)
				anInt11654 = 911726529 * (452190977 * aClass15_11655.anInt125 - (16384 - i_105_));
			else
				anInt11654 = 911726529 * (i_105_ + aClass15_11655.anInt125 * 452190977);
		}
	}

	public void method10548(int i) {
		Class538 class538 = method10554((byte) -17);
		if (2080485441 * class538.anInt6049 != 0 || anInt11653 * 1589221153 != 0) {
			aClass15_11655.method647((byte) 63);
			int i_106_ = i - 452190977 * aClass15_11655.anInt125 & 0x3fff;
			if (i_106_ > 8192)
				anInt11654 = 911726529 * (452190977 * aClass15_11655.anInt125 - (16384 - i_106_));
			else
				anInt11654 = 911726529 * (i_106_ + aClass15_11655.anInt125 * 452190977);
		}
	}

	public int method10549() {
		return ((Entity) this).anInt11632 * -1880837087;
	}

	public void method10550(int i) {
		Class538 class538 = method10554((byte) 20);
		if (2080485441 * class538.anInt6049 != 0 || anInt11653 * 1589221153 != 0) {
			aClass15_11655.method647((byte) 12);
			int i_107_ = i - 452190977 * aClass15_11655.anInt125 & 0x3fff;
			if (i_107_ > 8192)
				anInt11654 = 911726529 * (452190977 * aClass15_11655.anInt125 - (16384 - i_107_));
			else
				anInt11654 = 911726529 * (i_107_ + aClass15_11655.anInt125 * 452190977);
		}
	}

	boolean method8314() {
		return ((Entity) this).aBool11667;
	}

	public final void method10551() {
		stepsCount = 0;
		anInt11663 = 0;
	}

	public final void method10552() {
		stepsCount = 0;
		anInt11663 = 0;
	}

	public abstract Class583 method10553();

	public Class538 method10554(byte i) {
		int i_108_ = method10572((byte) -51);
		if (i_108_ == -1)
			return Class639_Sub11.aClass538_9538;
		return ((Class538) Class197.aClass639_Sub11_2359.getDefinition(i_108_, -2137117077));
	}

	public final void method10555(int i) {
		Class566 class566 = ((Class566) Class506.aClass639_Sub21_5598.getDefinition(i, -161600075));
		for (Class591_Sub6 class591_sub6 = (Class591_Sub6) aClass652_11627.method7697(1716273919); null != class591_sub6; class591_sub6 = (Class591_Sub6) aClass652_11627.method7698(-2119200737)) {
			if (class591_sub6.aClass566_9434 == class566) {
				class591_sub6.method7002((byte) 35);
				break;
			}
		}
	}

	public int method10556(short i) {
		return ((Entity) this).anInt11632 * -1880837087;
	}

	public void method10471() {
		int i = ((((Entity) this).anInt11632 * -1880837087 - 1 << 8) + 240);
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = (short) ((int) class240.aFloat2653 - i >> 9);
		aShort11500 = (short) ((int) class240.aFloat2657 - i >> 9);
		aShort11499 = (short) (i + (int) class240.aFloat2653 >> 9);
		aShort11502 = (short) ((int) class240.aFloat2657 + i >> 9);
	}

	public void finalize() {
		if (null != ((Entity) this).aClass485_11659)
			((Entity) this).aClass485_11659.method5783();
	}

	abstract int method10557();

	abstract int method10558();

	public abstract int method10559();

	public int method8322() {
		if (-1926256345 * ((Entity) this).anInt11610 == -32768)
			return 0;
		return -1926256345 * ((Entity) this).anInt11610;
	}

	public void method10560() {
		if (((Entity) this).aClass583_11608 != null && (((Class583) ((Entity) this).aClass583_11608).aString7730) != null) {
			((Class583) ((Entity) this).aClass583_11608).anInt7727 -= -547525443;
			if (505998997 * ((Class583) (((Entity) this).aClass583_11608)).anInt7727 == 0)
				((Class583) ((Entity) this).aClass583_11608).aString7730 = null;
		}
	}

	public abstract boolean method10561();

	public abstract boolean method10562();

	public abstract boolean method10563();

	public abstract Class583 method10564();

	public abstract Class583 method10565();

	boolean method10566() {
		if (-1 == 1990220905 * ((Entity) this).anInt11672)
			return false;
		return method10537((((Entity) this).anInt11672 * 1990220905), (byte) 88);
	}

	public abstract Class583 method10567(int i);

	public int method10568() {
		return ((Entity) this).anInt11632 * -1880837087;
	}

	public void method10569(int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		if (method10515(1716215120))
			client.method7991(aClass83_11622, aClass83_11622.method1257(-2134288162), -1, i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_, i_115_);
	}

	void method10570(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_) {
		Class240 class240 = method5394().aClass240_2647;
		int i_122_ = aShort11499 + aShort11503 >> 1;
		int i_123_ = aShort11502 + aShort11500 >> 1;
		int i_124_ = Class325.anIntArray4103[i];
		int i_125_ = Class325.anIntArray4105[i];
		int i_126_ = -i_117_ / 2;
		int i_127_ = -i_118_ / 2;
		int i_128_ = i_125_ * i_126_ + i_124_ * i_127_ >> 14;
		int i_129_ = i_127_ * i_125_ - i_124_ * i_126_ >> 14;
		int i_130_ = Class20.method698((int) class240.aFloat2653 + i_128_, (int) class240.aFloat2657 + i_129_, i_122_, i_123_, aByte9009, -1990694826);
		int i_131_ = i_117_ / 2;
		int i_132_ = -i_118_ / 2;
		int i_133_ = i_125_ * i_131_ + i_132_ * i_124_ >> 14;
		int i_134_ = i_125_ * i_132_ - i_124_ * i_131_ >> 14;
		int i_135_ = Class20.method698((int) class240.aFloat2653 + i_133_, i_134_ + (int) class240.aFloat2657, i_122_, i_123_, aByte9009, -1990694826);
		int i_136_ = -i_117_ / 2;
		int i_137_ = i_118_ / 2;
		int i_138_ = i_124_ * i_137_ + i_125_ * i_136_ >> 14;
		int i_139_ = i_137_ * i_125_ - i_136_ * i_124_ >> 14;
		int i_140_ = Class20.method698((int) class240.aFloat2653 + i_138_, (int) class240.aFloat2657 + i_139_, i_122_, i_123_, aByte9009, -1990694826);
		int i_141_ = i_117_ / 2;
		int i_142_ = i_118_ / 2;
		int i_143_ = i_141_ * i_125_ + i_142_ * i_124_ >> 14;
		int i_144_ = i_125_ * i_142_ - i_141_ * i_124_ >> 14;
		int i_145_ = Class20.method698(i_143_ + (int) class240.aFloat2653, (int) class240.aFloat2657 + i_144_, i_122_, i_123_, aByte9009, -1990694826);
		int i_146_ = i_130_ < i_135_ ? i_130_ : i_135_;
		int i_147_ = i_140_ < i_145_ ? i_140_ : i_145_;
		int i_148_ = i_135_ < i_145_ ? i_135_ : i_145_;
		int i_149_ = i_130_ < i_140_ ? i_130_ : i_140_;
		((Entity) this).anInt11616 = ((int) (Math.atan2((double) (i_146_ - i_147_), (double) i_118_) * 2607.5945876176133) & 0x3fff) * -65434353;
		((Entity) this).anInt11648 = ((int) (Math.atan2((double) (i_149_ - i_148_), (double) i_117_) * 2607.5945876176133) & 0x3fff) * -401693035;
		if (((Entity) this).anInt11616 * -329006609 != 0 && i_119_ != 0) {
			int i_150_ = 16384 - i_119_;
			if (((Entity) this).anInt11616 * -329006609 > 8192) {
				if (((Entity) this).anInt11616 * -329006609 < i_150_)
					((Entity) this).anInt11616 = -65434353 * i_150_;
			} else if (-329006609 * ((Entity) this).anInt11616 > i_119_)
				((Entity) this).anInt11616 = i_119_ * -65434353;
		}
		if (-1081740099 * ((Entity) this).anInt11648 != 0 && i_120_ != 0) {
			int i_151_ = 16384 - i_120_;
			if (((Entity) this).anInt11648 * -1081740099 > 8192) {
				if (-1081740099 * ((Entity) this).anInt11648 < i_151_)
					((Entity) this).anInt11648 = -401693035 * i_151_;
			} else if ((-1081740099 * ((Entity) this).anInt11648) > i_120_)
				((Entity) this).anInt11648 = i_120_ * -401693035;
		}
		((Entity) this).anInt11618 = (i_130_ + i_145_) * 176734637;
		if (i_140_ + i_135_ < ((Entity) this).anInt11618 * -2092938715)
			((Entity) this).anInt11618 = 176734637 * (i_140_ + i_135_);
		((Entity) this).anInt11618 = ((((Entity) this).anInt11618 * -2092938715 >> 1) - (int) class240.aFloat2656) * 176734637;
	}

	public void method10469(byte i) {
		int i_152_ = ((((Entity) this).anInt11632 * -1880837087 - 1 << 8) + 240);
		Class240 class240 = method5394().aClass240_2647;
		aShort11503 = (short) ((int) class240.aFloat2653 - i_152_ >> 9);
		aShort11500 = (short) ((int) class240.aFloat2657 - i_152_ >> 9);
		aShort11499 = (short) (i_152_ + (int) class240.aFloat2653 >> 9);
		aShort11502 = (short) ((int) class240.aFloat2657 + i_152_ >> 9);
	}

	boolean method8342() {
		return false;
	}

	public final void method10571(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_) {
		Class566 class566 = ((Class566) Class506.aClass639_Sub21_5598.getDefinition(i, -1856373272));
		Class591_Sub6 class591_sub6 = null;
		Class591_Sub6 class591_sub6_159_ = null;
		int i_160_ = class566.anInt6365 * -581700213;
		int i_161_ = 0;
		for (Class591_Sub6 class591_sub6_162_ = (Class591_Sub6) aClass652_11627.method7697(-1620146286); null != class591_sub6_162_; class591_sub6_162_ = (Class591_Sub6) aClass652_11627.method7698(1856012932)) {
			i_161_++;
			if (class566 == class591_sub6_162_.aClass566_9434) {
				class591_sub6_162_.method8800(i_153_ + i_155_, i_156_, i_157_, i_154_, 1930126286);
				return;
			}
			if (1542976037 * class591_sub6_162_.aClass566_9434.anInt6364 <= 1542976037 * class566.anInt6364)
				class591_sub6 = class591_sub6_162_;
			if (-581700213 * class591_sub6_162_.aClass566_9434.anInt6365 > i_160_) {
				class591_sub6_159_ = class591_sub6_162_;
				i_160_ = class591_sub6_162_.aClass566_9434.anInt6365 * -581700213;
			}
		}
		if (null != class591_sub6_159_ || i_161_ < JS5ConfigGroup.aClass484_2593.anInt5397 * -500787769) {
			Class591_Sub6 class591_sub6_163_ = new Class591_Sub6(class566);
			if (class591_sub6 == null)
				aClass652_11627.method7707(class591_sub6_163_, (byte) 96);
			else
				Class191.method2893(class591_sub6_163_, class591_sub6, (byte) -22);
			class591_sub6_163_.method8800(i_155_ + i_153_, i_156_, i_157_, i_154_, 2026055384);
			if (i_161_ >= -500787769 * JS5ConfigGroup.aClass484_2593.anInt5397)
				class591_sub6_159_.method7002((byte) 73);
		}
	}

	public int method8324() {
		Class538 class538 = method10554((byte) 12);
		int i;
		if (-1 != class538.anInt6054 * -893579993)
			i = -893579993 * class538.anInt6054;
		else if (-32768 == -1818465511 * ((Entity) this).anInt11658)
			i = 200;
		else
			i = -(-1818465511 * ((Entity) this).anInt11658);
		Class238 class238 = method5394();
		int i_164_ = (int) class238.aClass240_2647.aFloat2653 >> 9;
		int i_165_ = (int) class238.aClass240_2647.aFloat2657 >> 9;
		if (null != aClass523_9010 && i_164_ >= 1 && i_165_ >= 1 && i_164_ <= client.aClass613_8605.method7347(2131170286) - 1 && i_165_ <= client.aClass613_8605.method7278(277214477) - 1) {
			Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][i_164_][i_165_]);
			if (class536 != null && null != class536.aClass456_Sub1_Sub1_5992)
				return i + class536.aClass456_Sub1_Sub1_5992.aShort11275;
		}
		return i;
	}

	abstract int method10572(byte i);

	public int method8320() {
		if (-1926256345 * ((Entity) this).anInt11610 == -32768)
			return 0;
		return -1926256345 * ((Entity) this).anInt11610;
	}

	public static byte[] method10573(byte[] is, int i, int i_166_, int i_167_) {
		byte[] is_168_;
		if (i > 0) {
			is_168_ = new byte[i_166_];
			for (int i_169_ = 0; i_169_ < i_166_; i_169_++)
				is_168_[i_169_] = is[i_169_ + i];
		} else
			is_168_ = is;
		Class638 class638 = new Class638();
		class638.method7563((byte) 9);
		class638.method7564(is_168_, (long) (i_166_ * 8));
		byte[] is_170_ = new byte[64];
		class638.method7566(is_170_, 0, -1556576356);
		return is_170_;
	}

	public static Class106 method10574(Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, int i, int i_171_, short i_172_) {
		return new Class106_Sub2(canvas, mapSize, interface5, interface35, interface36, interface37, i, i_171_);
	}
}
