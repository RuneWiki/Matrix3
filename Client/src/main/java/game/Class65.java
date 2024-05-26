package game;

/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.management.GarbageCollectorMXBean;

public class Class65 {
	public int anInt678;
	static Class65 aClass65_679;
	static Class65 aClass65_680;
	public static Class65 aClass65_681 = new Class65(0, 104);
	static Class65 aClass65_682;
	static Class65 aClass65_683;
	public int anInt684;
	static GarbageCollectorMXBean aGarbageCollectorMXBean685;

	Class65(int i, int i_0_) {
		anInt684 = -1355533623 * i;
		anInt678 = 337497773 * i_0_;
	}

	static {
		aClass65_679 = new Class65(1, 120);
		aClass65_680 = new Class65(2, 136);
		aClass65_683 = new Class65(3, 168);
		aClass65_682 = new Class65(4, 72);
	}

	static final void method1031(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).longStackPtr -= -1758429946;
		if ((((Cs2Executor) class441).longStack[1097105451 * ((Cs2Executor) class441).longStackPtr]) < (((Cs2Executor) class441).longStack[1 + ((Cs2Executor) class441).longStackPtr * 1097105451]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]));
	}

	static final void method1032(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		class73.anInt891 = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]) * 835483205;
		class73.anInt832 = (-949518223 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]));
		class73.anInt830 = (-1624298353 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]));
		Class555.method6575(class73, (short) 26322);
	}

	public static void method1033(float f, Class240 class240, Class240 class240_1_, Class240 class240_2_, Class240 class240_3_, Class240 class240_4_, float f_5_, float f_6_, float f_7_, float f_8_, int i) {
		if (!class240_1_.method3271(class240)) {
			Class240 class240_9_ = Class240.method3277(class240_1_, class240);
			float f_10_ = class240_9_.method3301();
			if (f_5_ > 0.0F) {
				class240_3_ = Class240.method3276(class240_3_);
				class240_3_.method3284(f_6_ * (f_10_ / f_5_));
			}
			if (class240_3_.aFloat2653 == Float.POSITIVE_INFINITY || Float.isNaN(class240.aFloat2653) || f_10_ > f_7_) {
				class240.method3269(class240_1_);
				class240_2_.method3270();
			} else {
				Class240 class240_11_ = Class240.method3276(class240_2_);
				class240_11_.method3282();
				Class240 class240_12_ = Class240.method3263(class240_11_, class240_3_);
				Class240 class240_13_ = Class240.method3283(class240_11_, class240_12_);
				class240_13_.method3284(0.5F);
				Class240 class240_14_ = Class240.method3276(class240_2_);
				Class240 class240_15_ = Class240.method3276(class240_9_);
				class240_15_.method3282();
				if (class240_13_.aFloat2653 > class240_15_.aFloat2653) {
					if (class240_9_.aFloat2653 < 0.0F) {
						class240_14_.aFloat2653 += class240_3_.aFloat2653 * f;
						if (class240_14_.aFloat2653 > 0.0F)
							class240_14_.aFloat2653 = 0.0F;
					} else {
						class240_14_.aFloat2653 -= class240_3_.aFloat2653 * f;
						if (class240_14_.aFloat2653 < 0.0F)
							class240_14_.aFloat2653 = 0.0F;
					}
				} else if (class240_11_.aFloat2653 < class240_4_.aFloat2653) {
					if (class240_9_.aFloat2653 < 0.0F) {
						class240_14_.aFloat2653 -= f * class240_3_.aFloat2653;
						if (class240_14_.aFloat2653 < -class240_4_.aFloat2653)
							class240_14_.aFloat2653 = -class240_4_.aFloat2653;
					} else {
						class240_14_.aFloat2653 += f * class240_3_.aFloat2653;
						if (class240_14_.aFloat2653 > class240_4_.aFloat2653)
							class240_14_.aFloat2653 = class240_4_.aFloat2653;
					}
				}
				if (class240_13_.aFloat2656 > class240_15_.aFloat2656) {
					if (class240_9_.aFloat2656 < 0.0F) {
						class240_14_.aFloat2656 += class240_3_.aFloat2656 * f;
						if (class240_14_.aFloat2656 > 0.0F)
							class240_14_.aFloat2656 = 0.0F;
					} else {
						class240_14_.aFloat2656 -= class240_3_.aFloat2656 * f;
						if (class240_14_.aFloat2656 < 0.0F)
							class240_14_.aFloat2656 = 0.0F;
					}
				} else if (class240_11_.aFloat2656 < class240_4_.aFloat2656) {
					if (class240_9_.aFloat2656 < 0.0F) {
						class240_14_.aFloat2656 -= f * class240_3_.aFloat2656;
						if (class240_14_.aFloat2656 < -class240_4_.aFloat2656)
							class240_14_.aFloat2656 = -class240_4_.aFloat2656;
					} else {
						class240_14_.aFloat2656 += f * class240_3_.aFloat2656;
						if (class240_14_.aFloat2656 > class240_4_.aFloat2656)
							class240_14_.aFloat2656 = class240_4_.aFloat2656;
					}
				}
				if (class240_13_.aFloat2657 > class240_15_.aFloat2657) {
					if (class240_9_.aFloat2657 < 0.0F) {
						class240_14_.aFloat2657 += f * class240_3_.aFloat2657;
						if (class240_14_.aFloat2657 > 0.0F)
							class240_14_.aFloat2657 = 0.0F;
					} else {
						class240_14_.aFloat2657 -= class240_3_.aFloat2657 * f;
						if (class240_14_.aFloat2657 < 0.0F)
							class240_14_.aFloat2657 = 0.0F;
					}
				} else if (class240_11_.aFloat2657 < class240_4_.aFloat2657) {
					if (class240_9_.aFloat2657 < 0.0F) {
						class240_14_.aFloat2657 -= f * class240_3_.aFloat2657;
						if (class240_14_.aFloat2657 < -class240_4_.aFloat2657)
							class240_14_.aFloat2657 = -class240_4_.aFloat2657;
					} else {
						class240_14_.aFloat2657 += class240_3_.aFloat2657 * f;
						if (class240_14_.aFloat2657 > class240_4_.aFloat2657)
							class240_14_.aFloat2657 = class240_4_.aFloat2657;
					}
				}
				class240_2_.method3315(class240_14_, 0.8F);
				if (f_10_ < f_8_ && class240_2_.method3301() < f_8_) {
					class240.method3269(class240_1_);
					class240_2_.method3270();
				} else
					class240.method3305(Class240.method3287(class240_2_, f));
				class240_11_.method3261();
				class240_14_.method3261();
				class240_15_.method3261();
			}
		}
	}

	public static int method1034(CharSequence charsequence, CharSequence charsequence_16_, Class435 class435, int i) {
		int i_17_ = charsequence.length();
		int i_18_ = charsequence_16_.length();
		int i_19_ = 0;
		int i_20_ = 0;
		char c = '\0';
		char c_21_ = '\0';
		while (i_19_ - c < i_17_ || i_20_ - c_21_ < i_18_) {
			if (i_19_ - c >= i_17_)
				return -1;
			if (i_20_ - c_21_ >= i_18_)
				return 1;
			char c_22_;
			if (c != 0) {
				c_22_ = c;
				boolean bool = false;
			} else
				c_22_ = charsequence.charAt(i_19_++);
			char c_23_;
			if (0 != c_21_) {
				c_23_ = c_21_;
				boolean bool = false;
			} else
				c_23_ = charsequence_16_.charAt(i_20_++);
			c = Class254.method3520(c_22_, 343783365);
			c_21_ = Class254.method3520(c_23_, 186109890);
			c_22_ = Class58.method1004(c_22_, class435, -1564724018);
			c_23_ = Class58.method1004(c_23_, class435, -1743695282);
			if (c_23_ != c_22_ && (Character.toUpperCase(c_22_) != Character.toUpperCase(c_23_))) {
				c_22_ = Character.toLowerCase(c_22_);
				c_23_ = Character.toLowerCase(c_23_);
				if (c_23_ != c_22_)
					return (Class96.method1553(c_22_, class435, 1100376991) - Class96.method1553(c_23_, class435, 1597370558));
			}
		}
		int i_24_ = Math.min(i_17_, i_18_);
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
			if (class435 == Class435.aClass435_5053) {
				i_19_ = i_17_ - 1 - i_25_;
				i_20_ = i_18_ - 1 - i_25_;
			} else
				i_19_ = i_20_ = i_25_;
			char c_26_ = charsequence.charAt(i_19_);
			char c_27_ = charsequence_16_.charAt(i_20_);
			if (c_26_ != c_27_ && (Character.toUpperCase(c_26_) != Character.toUpperCase(c_27_))) {
				c_26_ = Character.toLowerCase(c_26_);
				c_27_ = Character.toLowerCase(c_27_);
				if (c_26_ != c_27_)
					return (Class96.method1553(c_26_, class435, 1145921266) - Class96.method1553(c_27_, class435, 1204843410));
			}
		}
		int i_28_ = i_17_ - i_18_;
		if (i_28_ != 0)
			return i_28_;
		for (int i_29_ = 0; i_29_ < i_24_; i_29_++) {
			char c_30_ = charsequence.charAt(i_29_);
			char c_31_ = charsequence_16_.charAt(i_29_);
			if (c_30_ != c_31_)
				return (Class96.method1553(c_30_, class435, 299367847) - Class96.method1553(c_31_, class435, 1495986141));
		}
		return 0;
	}

	static final void method1035(Class301 class301, int i) {
		Class572_Sub15_Sub2 class572_sub15_sub2 = ((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330;
		if (class301 == Class301.aClass301_3495) {
			int i_32_ = class572_sub15_sub2.readInt(888258970);
			int i_33_ = class572_sub15_sub2.readUnsignedByte(994758911);
			((ObjectDefinitions) client.aClass613_8605.method7288(970189945).getDefinition(i_32_, -1977025767)).method6042(i_33_, (byte) -21);
		} else if (Class301.REVMOVE_GROUND_ITEM == class301) {
			int i_34_ = class572_sub15_sub2.readUnsignedShortLE128((byte) 53);
			int i_35_ = class572_sub15_sub2.readUnsigned128Byte((byte) 94);
			Class497 class497 = client.aClass613_8605.method7280((byte) -28);
			int i_36_ = (i_35_ & 0x7) + -121366019 * Class63.anInt674;
			int i_37_ = class497.localY * 417324155 + i_36_;
			int i_38_ = Class396.anInt4690 * -1396283279 + (i_35_ >> 4 & 0x7);
			int i_39_ = -2109597897 * class497.localX + i_38_;
			Class572_Sub42 class572_sub42 = ((Class572_Sub42) (client.aClass676_8749.get((long) (445399373 * Class653.anInt8399 << 28 | i_37_ << 14 | i_39_))));
			if (null != class572_sub42) {
				for (Class572_Sub40 class572_sub40 = (Class572_Sub40) class572_sub42.aClass675_9435.method7932((byte) 50); class572_sub40 != null; class572_sub40 = (Class572_Sub40) class572_sub42.aClass675_9435.method7926(2002197972)) {
					if (i_34_ == class572_sub40.anInt9401 * 1544118073) {
						class572_sub40.method6794((byte) 35);
						break;
					}
				}
				if (class572_sub42.aClass675_9435.method7928((byte) 9))
					class572_sub42.method6794((byte) -29);
				if (i_38_ >= 0 && i_36_ >= 0 && i_38_ < client.aClass613_8605.method7347(-14612338) && i_36_ < client.aClass613_8605.method7278(277214477))
					Class130.method2281(445399373 * Class653.anInt8399, i_38_, i_36_, -588070078);
			}
		} else if (class301 == Class301.aClass301_3490) {
			int i_40_ = class572_sub15_sub2.readUnsignedShort128((byte) 81);
			int i_41_ = class572_sub15_sub2.readUnsignedShortLE128((byte) 75);
			int i_42_ = class572_sub15_sub2.readUnsignedByte128(917620962);
			Class497 class497 = client.aClass613_8605.method7280((byte) -119);
			int i_43_ = (i_42_ & 0x7) + Class63.anInt674 * -121366019;
			int i_44_ = class497.localY * 417324155 + i_43_;
			int i_45_ = Class396.anInt4690 * -1396283279 + (i_42_ >> 4 & 0x7);
			int i_46_ = -2109597897 * class497.localX + i_45_;
			boolean bool = (i_45_ >= 0 && i_43_ >= 0 && i_45_ < client.aClass613_8605.method7347(1416616891) && i_43_ < client.aClass613_8605.method7278(277214477));
			if (bool || client.aClass613_8605.method7327(1865937194).method6752(912354779)) {
				Class35.method783(445399373 * Class653.anInt8399, i_46_, i_44_, new Class572_Sub40(i_40_, i_41_), (short) 5000);
				if (bool)
					Class130.method2281(Class653.anInt8399 * 445399373, i_45_, i_43_, -486958998);
			}
		} else if (class301 == Class301.aClass301_3497) {
			int i_47_ = class572_sub15_sub2.readUnsignedByte(-3240998);
			int i_48_ = (i_47_ >> 4 & 0x7) + Class396.anInt4690 * -1396283279;
			int i_49_ = (i_47_ & 0x7) + Class63.anInt674 * -121366019;
			int i_50_ = class572_sub15_sub2.readIntV1((byte) 0);
			int i_51_ = class572_sub15_sub2.readUnsignedByteC(-369806529);
			int i_52_ = class572_sub15_sub2.readUnsignedByte(857413996);
			int i_53_ = i_52_ >> 2;
			int i_54_ = i_52_ & 0x3;
			int i_55_ = client.anIntArray8713[i_53_];
			if (client.aClass613_8605.method7327(-656957484) != Class569.aClass569_6394)
				Class665_Sub24.method9083(445399373 * Class653.anInt8399, i_48_, i_49_, i_55_, i_53_, i_54_, i_50_, i_51_, -124613373);
		} else if (Class301.aClass301_3494 == class301) {
			int i_56_ = class572_sub15_sub2.readUnsignedByte(888838755);
			int i_57_ = Class396.anInt4690 * -1396283279 + (i_56_ >> 4 & 0x7);
			int i_58_ = (i_56_ & 0x7) + -121366019 * Class63.anInt674;
			int i_59_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (65535 == i_59_)
				i_59_ = -1;
			int i_60_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_61_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_62_ = class572_sub15_sub2.readUnsignedByte(1574205074);
			int i_63_ = class572_sub15_sub2.readShort(-710976385);
			if (client.aClass613_8605.method7327(-1174716474) != Class569.aClass569_6394) {
				if (i_57_ >= 0 && i_58_ >= 0 && i_57_ < client.aClass613_8605.method7347(927360489) && i_58_ < client.aClass613_8605.method7278(277214477)) {
					if (i_59_ == -1) {
						Class572_Sub12_Sub9 class572_sub12_sub9 = ((Class572_Sub12_Sub9) client.aClass676_8747.get((long) (i_57_ << 16 | i_58_)));
						if (class572_sub12_sub9 != null) {
							((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390.method10601(-980567998);
							class572_sub12_sub9.method6794((byte) 48);
						}
					} else {
						int i_64_ = 512 * i_57_ + 256;
						int i_65_ = 256 + i_58_ * 512;
						int i_66_ = Class653.anInt8399 * 445399373;
						if (i_66_ < 3 && client.aClass613_8605.method7287((byte) 15).method3689(i_57_, i_58_, -2047516266))
							i_66_++;
						Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (new Class456_Sub1_Sub2_Sub4(client.aClass613_8605.method7285(1652241066), i_59_, i_61_, 445399373 * Class653.anInt8399, i_66_, i_64_, Class314.method4072(i_64_, i_65_, (445399373 * Class653.anInt8399), -2134915573) - i_60_, i_65_, i_57_, i_57_, i_58_, i_58_, i_62_, false, i_63_));
						client.aClass676_8747.put(new Class572_Sub12_Sub9(class456_sub1_sub2_sub4), (long) (i_57_ << 16 | i_58_));
					}
				}
			}
		} else if (Class301.aClass301_3496 == class301) {
			int i_67_ = class572_sub15_sub2.readUnsignedByte(867324750);
			Class497 class497 = client.aClass613_8605.method7280((byte) -66);
			int i_68_ = (i_67_ & 0x7) + Class63.anInt674 * -121366019;
			int i_69_ = 417324155 * class497.localY + i_68_;
			int i_70_ = (i_67_ >> 4 & 0x7) + Class396.anInt4690 * -1396283279;
			int i_71_ = i_70_ + class497.localX * -2109597897;
			int i_72_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_73_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_74_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (null != client.aClass676_8749) {
				Class572_Sub42 class572_sub42 = ((Class572_Sub42) (client.aClass676_8749.get((long) (Class653.anInt8399 * 445399373 << 28 | i_69_ << 14 | i_71_))));
				if (null != class572_sub42) {
					for (Class572_Sub40 class572_sub40 = (Class572_Sub40) class572_sub42.aClass675_9435.method7932((byte) 50); class572_sub40 != null; class572_sub40 = (Class572_Sub40) class572_sub42.aClass675_9435.method7926(2088962163)) {
						if (1544118073 * class572_sub40.anInt9401 == i_72_ && i_73_ == (-1812999493 * (((Class572_Sub40) class572_sub40).anInt9400))) {
							class572_sub40.method6794((byte) 36);
							((Class572_Sub40) class572_sub40).anInt9400 = i_74_ * -501308813;
							Class35.method783(445399373 * Class653.anInt8399, i_71_, i_69_, class572_sub40, (short) 5000);
							break;
						}
					}
					if (i_70_ >= 0 && i_68_ >= 0 && i_70_ < client.aClass613_8605.method7347(930460440) && i_68_ < client.aClass613_8605.method7278(277214477))
						Class130.method2281(445399373 * Class653.anInt8399, i_70_, i_68_, 1481241853);
				}
			}
		} else if (Class301.PROJECTILE == class301) {
			int i_75_ = class572_sub15_sub2.readUnsignedByte(1441595571);
			int i_76_ = (i_75_ >> 4 & 0xf) + Class396.anInt4690 * 1502400738;
			int i_77_ = (i_75_ & 0xf) + Class63.anInt674 * -242732038;
			int i_78_ = class572_sub15_sub2.readUnsignedByte(-12938756);
			boolean bool = 0 != (i_78_ & 0x1);
			boolean bool_79_ = 0 != (i_78_ & 0x2);
			int i_80_ = bool_79_ ? i_78_ >> 2 : -1;
			int i_81_ = i_76_ + class572_sub15_sub2.readByte(22851656);
			int i_82_ = i_77_ + class572_sub15_sub2.readByte(674844930);
			int i_83_ = class572_sub15_sub2.readShort(-710976385);
			int i_84_ = class572_sub15_sub2.readShort(-710976385);
			int i_85_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_86_ = class572_sub15_sub2.readUnsignedByte(187121169);
			if (bool_79_)
				i_86_ = (byte) i_86_;
			else
				i_86_ *= 4;
			int i_87_ = class572_sub15_sub2.readUnsignedByte(870838976) * 4;
			int i_88_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_89_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_90_ = class572_sub15_sub2.readUnsignedByte(717854048);
			int i_91_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (i_90_ == 255)
				i_90_ = -1;
			int i_92_ = class572_sub15_sub2.readShort(-710976385);
			if (client.aClass613_8605.method7327(-595397109) != Class569.aClass569_6394) {
				if (i_76_ >= 0 && i_77_ >= 0 && (i_76_ < client.aClass613_8605.method7347(-1499183889) * 2) && i_77_ < client.aClass613_8605.method7347(1093153345) * 2 && i_81_ >= 0 && i_82_ >= 0 && i_81_ < client.aClass613_8605.method7278(277214477) * 2 && i_82_ < client.aClass613_8605.method7278(277214477) * 2 && i_85_ != 65535) {
					i_76_ = 256 * i_76_;
					i_77_ = 256 * i_77_;
					i_81_ *= 256;
					i_82_ *= 256;
					i_86_ <<= 2;
					i_87_ <<= 2;
					i_91_ <<= 2;
					Class473.method5595(i_85_, i_83_, i_84_, i_80_, i_86_, i_87_, i_76_, i_77_, i_81_, i_82_, i_88_, i_89_, i_90_, i_91_, bool, i_92_, (short) -7839);
				}
			}
		} else if (class301 == Class301.aClass301_3491) {
			int i_93_ = class572_sub15_sub2.readUnsignedByte(1548501857);
			int i_94_ = -1396283279 * Class396.anInt4690 + (i_93_ >> 4 & 0x7);
			int i_95_ = -121366019 * Class63.anInt674 + (i_93_ & 0x7);
			int i_96_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (i_96_ == 65535)
				i_96_ = -1;
			int i_97_ = class572_sub15_sub2.readUnsignedByte(458393124);
			int i_98_ = i_97_ >> 4 & 0xf;
			int i_99_ = i_97_ & 0x7;
			int i_100_ = class572_sub15_sub2.readUnsignedByte(581931121);
			int i_101_ = class572_sub15_sub2.readUnsignedByte(186957177);
			int i_102_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (client.aClass613_8605.method7327(-997445076) != Class569.aClass569_6394) {
				if (i_94_ >= 0 && i_95_ >= 0 && i_94_ < client.aClass613_8605.method7347(670686413) && i_95_ < client.aClass613_8605.method7278(277214477)) {
					int i_103_ = i_98_ + 1;
					if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) >= i_94_ - i_103_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) <= i_103_ + i_94_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) >= i_95_ - i_103_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) <= i_103_ + i_95_) {
						Class240 class240 = new Class240((float) (i_94_ << 9), 0.0F, (float) (i_95_ << 9));
						int i_104_ = Class653.anInt8399 * 445399373;
						Class344.audio.sendSoundEffect(Class124.aClass124_1504, i_96_, i_99_, i_101_, Class126.aClass126_1509.method2215(-177974177), Class93.aClass93_1242, 0.0F, (float) (i_98_ << 9), class240, i_104_, i_102_, i_100_);
					}
				}
			}
		} else if (class301 == Class301.aClass301_3502) {
			int i_105_ = class572_sub15_sub2.readUnsignedByteC(-1015995365);
			int i_106_ = i_105_ >> 2;
			int i_107_ = client.anIntArray8713[i_106_];
			int i_108_ = class572_sub15_sub2.readUnsignedByteC(-1466644389);
			int i_109_ = (i_108_ >> 4 & 0x7) + Class396.anInt4690 * -1396283279;
			int i_110_ = -121366019 * Class63.anInt674 + (i_108_ & 0x7);
			int i_111_ = class572_sub15_sub2.readUnsignedByteC(1348120741);
			int i_112_ = class572_sub15_sub2.readIntV2(43117052);
			if (1870735441 * Class516.aClass516_5740.anInt5742 == i_106_)
				i_106_ = Class516.aClass516_5739.anInt5742 * 1870735441;
			if (1 == (i_111_ & 0x1))
				Class517.method6125(445399373 * Class653.anInt8399, i_109_, i_110_, i_107_, i_112_, i_106_, null, -367029905);
			else {
				int[] is = null;
				if ((i_111_ & 0x2) == 2) {
					int i_113_ = class572_sub15_sub2.readUnsignedByte(-85106071);
					is = new int[i_113_];
					for (int i_114_ = 0; i_114_ < i_113_; i_114_++)
						is[i_114_] = class572_sub15_sub2.readInt(847755304);
				}
				short[] is_115_ = null;
				if (4 == (i_111_ & 0x4)) {
					int i_116_ = class572_sub15_sub2.readUnsignedByte(616281173);
					is_115_ = new short[i_116_];
					for (int i_117_ = 0; i_117_ < i_116_; i_117_++)
						is_115_[i_117_] = (short) class572_sub15_sub2.readUnsignedShort(647518597);
				}
				short[] is_118_ = null;
				if ((i_111_ & 0x8) == 8) {
					int i_119_ = class572_sub15_sub2.readUnsignedByte(1189092131);
					is_118_ = new short[i_119_];
					for (int i_120_ = 0; i_120_ < i_119_; i_120_++)
						is_118_[i_120_] = (short) class572_sub15_sub2.readUnsignedShort(647518597);
				}
				Class517.method6125(Class653.anInt8399 * 445399373, i_109_, i_110_, i_107_, i_112_, i_106_, new Class508((Class572_Sub34.aLong9345 * 4992496043789863469L), is, is_115_, is_118_), 706976117);
				Class572_Sub34.aLong9345 += 7088082468960048549L;
			}
		} else if (class301 == Class301.ADJUSTED_PROJECTILE) {
			int i_121_ = class572_sub15_sub2.readUnsignedByte(132146270);
			boolean bool = 0 != (i_121_ & 0x80);
			int i_122_ = (i_121_ >> 3 & 0x7) + -1396283279 * Class396.anInt4690;
			int i_123_ = (i_121_ & 0x7) + -121366019 * Class63.anInt674;
			int i_124_ = i_122_ + class572_sub15_sub2.readByte(1544850523);
			int i_125_ = i_123_ + class572_sub15_sub2.readByte(1405705507);
			int i_126_ = class572_sub15_sub2.readShort(-710976385);
			int i_127_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_128_ = class572_sub15_sub2.readUnsignedByte(1925176063) * 4;
			int i_129_ = class572_sub15_sub2.readUnsignedByte(1703657702) * 4;
			int i_130_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_131_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_132_ = class572_sub15_sub2.readUnsignedByte(1766370602);
			int i_133_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_134_ = class572_sub15_sub2.readShort(-710976385);
			if (255 == i_132_)
				i_132_ = -1;
			if (client.aClass613_8605.method7327(-402208459) != Class569.aClass569_6394) {
				if (i_122_ >= 0 && i_123_ >= 0 && i_122_ < client.aClass613_8605.method7347(1360873043) && i_123_ < client.aClass613_8605.method7278(277214477) && i_124_ >= 0 && i_125_ >= 0 && i_124_ < client.aClass613_8605.method7347(996645133) && i_125_ < client.aClass613_8605.method7278(277214477) && i_127_ != 65535) {
					i_122_ = 256 + 512 * i_122_;
					i_123_ = i_123_ * 512 + 256;
					i_124_ = 256 + i_124_ * 512;
					i_125_ = i_125_ * 512 + 256;
					i_128_ <<= 2;
					i_129_ <<= 2;
					i_133_ <<= 2;
					Class456_Sub1_Sub2_Sub5 class456_sub1_sub2_sub5 = (new Class456_Sub1_Sub2_Sub5(client.aClass613_8605.method7285(1112689385), i_127_, Class653.anInt8399 * 445399373, Class653.anInt8399 * 445399373, i_122_, i_123_, i_128_, i_130_ + client.cycles, i_131_ + client.cycles, i_132_, i_133_, 0, i_126_, i_129_, bool, -1, i_134_));
					class456_sub1_sub2_sub5.method10636(i_124_, i_125_, Class314.method4072(i_124_, i_125_, Class653.anInt8399 * 445399373, -2068550181) - i_129_, i_130_ + client.cycles, (byte) -83);
					client.aClass675_8774.method7940(new Class572_Sub12_Sub6(class456_sub1_sub2_sub5), -1783725233);
				}
			}
		} else if (class301 == Class301.aClass301_3492) {
			class572_sub15_sub2.readUnsignedByte(-15507076);
			int i_135_ = class572_sub15_sub2.readUnsignedByte(-50313712);
			int i_136_ = (i_135_ >> 4 & 0x7) + -1396283279 * Class396.anInt4690;
			int i_137_ = (i_135_ & 0x7) + Class63.anInt674 * -121366019;
			int i_138_ = class572_sub15_sub2.readUnsignedShort(647518597);
			int i_139_ = class572_sub15_sub2.readUnsignedByte(1013486505);
			int i_140_ = class572_sub15_sub2.read24BitInt(1140925462);
			String string = class572_sub15_sub2.readString(1295706626);
			if (client.aClass613_8605.method7327(39537757) != Class569.aClass569_6394)
				Class573.method6804(Class653.anInt8399 * 445399373, i_136_, i_137_, i_139_, i_138_, i_140_, string, 2043076360);
		} else if (Class301.REMOVE_OBJECT == class301) {
			int i_141_ = class572_sub15_sub2.readUnsigned128Byte((byte) 105);
			int i_142_ = (i_141_ >> 4 & 0x7) + -1396283279 * Class396.anInt4690;
			int i_143_ = (i_141_ & 0x7) + -121366019 * Class63.anInt674;
			int i_144_ = class572_sub15_sub2.readUnsignedByte(1582501520);
			int i_145_ = i_144_ >> 2;
			int i_146_ = i_144_ & 0x3;
			int i_147_ = client.anIntArray8713[i_145_];
			if (client.aClass613_8605.method7327(1157053946).method6752(269117719) || (i_142_ >= 0 && i_143_ >= 0 && i_142_ < client.aClass613_8605.method7347(1302664866) && i_143_ < client.aClass613_8605.method7278(277214477)))
				Class500.method5952(Class653.anInt8399 * 445399373, i_142_, i_143_, i_147_, -1, i_145_, i_146_, -2119628336);
		} else if (Class301.aClass301_3493 == class301) {
			int i_148_ = class572_sub15_sub2.readUnsignedByte(2038912703);
			int i_149_ = Class396.anInt4690 * -1396283279 + (i_148_ >> 4 & 0x7);
			int i_150_ = (i_148_ & 0x7) + Class63.anInt674 * -121366019;
			int i_151_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (i_151_ == 65535)
				i_151_ = -1;
			int i_152_ = class572_sub15_sub2.readUnsignedByte(-76193963);
			int i_153_ = i_152_ >> 4 & 0xf;
			int i_154_ = i_152_ & 0x7;
			int i_155_ = class572_sub15_sub2.readUnsignedByte(2058154524);
			int i_156_ = class572_sub15_sub2.readUnsignedByte(121582426);
			int i_157_ = class572_sub15_sub2.readUnsignedShort(647518597);
			boolean bool = class572_sub15_sub2.readUnsignedByte(844271978) == 1;
			if (client.aClass613_8605.method7327(1179654220) != Class569.aClass569_6394) {
				if (i_149_ >= 0 && i_150_ >= 0 && i_149_ < client.aClass613_8605.method7347(-1025708868) && i_150_ < client.aClass613_8605.method7278(277214477)) {
					int i_158_ = 1 + i_153_;
					if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) >= i_149_ - i_158_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) <= i_158_ + i_149_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) >= i_150_ - i_158_ && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) <= i_158_ + i_150_) {
						Class240 class240 = new Class240((float) (i_149_ << 9), 0.0F, (float) (i_150_ << 9));
						int i_159_ = 445399373 * Class653.anInt8399;
						int i_160_ = (bool ? Class126.aClass126_1511.method2215(-1817388419) : Class126.aClass126_1509.method2215(-1490939094));
						Class344.audio.sendSoundEffect(Class124.aClass124_1504, i_151_, i_154_, i_156_, i_160_, Class93.aClass93_1242, 0.0F, (float) (i_153_ << 9), class240, i_159_, i_157_, i_155_);
					}
				}
			}
		} else if (Class301.SEND_OBJECT == class301) {
			int i_161_ = class572_sub15_sub2.readInt(7069031);
			int i_162_ = class572_sub15_sub2.readUnsignedByte(667081628);
			int i_163_ = i_162_ >> 2;
			int i_164_ = i_162_ & 0x3;
			int i_165_ = client.anIntArray8713[i_163_];
			int i_166_ = class572_sub15_sub2.readUnsigned128Byte((byte) 92);
			int i_167_ = (i_166_ >> 4 & 0x7) + -1396283279 * Class396.anInt4690;
			int i_168_ = (i_166_ & 0x7) + Class63.anInt674 * -121366019;
			if (client.aClass613_8605.method7327(-1185590567).method6752(422166146) || (i_167_ >= 0 && i_168_ >= 0 && i_167_ < client.aClass613_8605.method7347(1100795196) && i_168_ < client.aClass613_8605.method7278(277214477)))
				Class500.method5952(445399373 * Class653.anInt8399, i_167_, i_168_, i_165_, i_161_, i_163_, i_164_, -2119628336);
		} else if (class301 == Class301.SEND_GROUND_ITEM) {
			int i_169_ = class572_sub15_sub2.readUnsignedByteC(1601686930);
			Class497 class497 = client.aClass613_8605.method7280((byte) -59);
			int i_170_ = (i_169_ & 0x7) + -121366019 * Class63.anInt674;
			int i_171_ = class497.localY * 417324155 + i_170_;
			int i_172_ = (i_169_ >> 4 & 0x7) + Class396.anInt4690 * -1396283279;
			int i_173_ = i_172_ + class497.localX * -2109597897;
			int amount = class572_sub15_sub2.readUnsignedShortLE((byte) -21);
			int id = class572_sub15_sub2.readUnsignedShort128((byte) 64);
			int i_176_ = class572_sub15_sub2.readUnsignedShort(647518597);
			if (i_176_ != client.anInt8728 * -1921142451) {
				boolean bool = (i_172_ >= 0 && i_170_ >= 0 && i_172_ < client.aClass613_8605.method7347(-293797999) && (i_170_ < client.aClass613_8605.method7278(277214477)));
				if (bool || client.aClass613_8605.method7327(-237374488).method6752(1662979015)) {
					Class35.method783(445399373 * Class653.anInt8399, i_173_, i_171_, new Class572_Sub40(id, amount), (short) 5000);
					if (bool)
						Class130.method2281(Class653.anInt8399 * 445399373, i_172_, i_170_, 148253968);
				}
			}
		} else {
			Class640.method7592(new StringBuilder().append("").append(class301).toString(), new RuntimeException(), -24368769);
			Class439.method5276(false, (byte) 8);
		}
	}

	static void method1036(Class572_Sub12_Sub19 class572_sub12_sub19, int i, int i_177_) {
		if (Class25.aBool165) {
			Class284 class284 = VarBitDefinition.method5230(1341288248);
			int i_178_ = 0;
			for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.method7848(-1042067865)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.method7845(-1743475465))) {
				int i_179_ = Class86.method1278(class572_sub12_sub10, class284, (byte) 28);
				if (i_179_ > i_178_)
					i_178_ = i_179_;
			}
			i_178_ += 8;
			int i_180_ = 21 + (-211596715 * Class25.anInt162 * ((((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482) * 944917463));
			Class612.anInt7989 = 928246093 * ((Class25.aBool191 ? 26 : 22) + (Class25.anInt162 * -211596715 * (((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482 * 944917463)));
			int i_181_ = (Class442.anInt5133 * -699022169 + -1568261905 * Class25.anInt180);
			if (i_178_ + i_181_ > Class269.anInt2861 * 1960824389)
				i_181_ = -699022169 * Class442.anInt5133 - i_178_;
			if (i_181_ < 0)
				i_181_ = 0;
			int i_182_ = (Class25.aBool191 ? 1 + (-801958417 * class284.anInt3412 + 20) : 31);
			int i_183_ = i - i_182_ + class284.anInt3412 * -801958417 + 1;
			if (i_180_ + i_183_ > Class584.anInt7739 * -530390519)
				i_183_ = -530390519 * Class584.anInt7739 - i_180_;
			if (i_183_ < 0)
				i_183_ = 0;
			Class310.anInt3663 = i_181_ * -1665125711;
			Class463.anInt5234 = i_183_ * -582994809;
			Class2.anInt20 = -2129654077 * i_178_;
			Class25.aClass572_Sub12_Sub19_178 = class572_sub12_sub19;
		}
	}
}
