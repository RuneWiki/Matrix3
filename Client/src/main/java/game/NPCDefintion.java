package game;

/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class NPCDefintion implements Interface17 {
	Class676 aClass676_4785;
	Class415 aClass415_4786;
	int[] anIntArray4787;
	Interface18 anInterface18_4788;
	public int anInt4789;
	public int anInt4790;
	public String aString4791 = "null";
	public int anInt4792 = -1636145493;
	public int[] anIntArray4793;
	public int anInt4794;
	public int[] anIntArray4795;
	public static short[] aShortArray4796 = new short[256];
	short[] aShortArray4797;
	public short[] aShortArray4798;
	int anInt4799;
	short[] aShortArray4800;
	public short[] aShortArray4801;
	public byte[] aByteArray4802;
	public byte[] aByteArray4803;
	byte aByte4804;
	public int anInt4805 = -948726227;
	byte aByte4806;
	byte aByte4807 = 0;
	public String[] aStringArray4808;
	static final int anInt4809 = 6;
	public int anInt4810 = 711549909;
	public int anInt4811;
	public int anInt4812;
	int anInt4813;
	public boolean aBool4814;
	public boolean aBool4815;
	public boolean aBool4816;
	public short[] aShortArray4817;
	int anInt4818;
	public int anInt4819;
	public static final int anInt4820 = 8;
	byte aByte4821;
	public int[] anIntArray4822;
	public int anInt4823;
	public boolean aBool4824 = true;
	int anInt4825;
	int anInt4826;
	public boolean aBool4827;
	public boolean aBool4828;
	public boolean aBool4829;
	public short aShort4830;
	public short aShort4831;
	public byte aByte4832;
	public int anInt4833;
	int anInt4834;
	public byte aByte4835;
	public byte aByte4836;
	public static final int anInt4837 = 1;
	byte[] aByteArray4838;
	public int anInt4839;
	public int anInt4840;
	public int anInt4841;
	public int anInt4842;
	public int anInt4843;
	public byte aByte4844;
	public static final int anInt4845 = 2;
	public Class661 aClass661_4846;
	int[][] anIntArrayArray4847;
	public short aShort4848;
	public int anInt4849;
	public int[] anIntArray4850;
	public byte aByte4851;
	public int anInt4852;
	public Class326 aClass326_4853;
	public int[] anIntArray4854;
	public int anInt4855;
	public int anInt4856;
	public boolean aBool4857;
	public int anInt4858;
	public boolean aBool4859;
	public static Class248 aClass248_4860;
	static Class161 aClass161_4861;

	public final boolean method4945() {
		if (null == anIntArray4793)
			return true;
		boolean bool = true;
		int[] is = anIntArray4793;
		for (int i = 0; i < is.length; i++) {
			int i_0_ = is[i];
			if (!((Class415) aClass415_4786).aClass248_4925.method3369(i_0_, 0, (byte) -128))
				bool = false;
		}
		return bool;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_1_ = class572_sub15.readUnsignedByte(1958961106);
			if (0 == i_1_)
				break;
			method4946(class572_sub15, i_1_, (byte) 73);
		}
	}

	void method4946(RSByteBuffer class572_sub15, int i, byte i_2_) {
		if (i == 1) {
			int i_3_ = class572_sub15.readUnsignedByte(203063499);
			anIntArray4793 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray4793[i_4_] = class572_sub15.readBigSmart((byte) 118);
		} else if (2 == i)
			aString4791 = class572_sub15.readString(1295706626);
		else if (12 == i)
			anInt4792 = class572_sub15.readUnsignedByte(882779873) * -1636145493;
		else if (i >= 30 && i < 35)
			aStringArray4808[i - 30] = class572_sub15.readString(1295706626);
		else if (40 == i) {
			int i_5_ = class572_sub15.readUnsignedByte(1034615251);
			aShortArray4797 = new short[i_5_];
			aShortArray4798 = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				aShortArray4797[i_6_] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray4798[i_6_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 41) {
			int i_7_ = class572_sub15.readUnsignedByte(1986418111);
			aShortArray4800 = new short[i_7_];
			aShortArray4801 = new short[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				aShortArray4800[i_8_] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray4801[i_8_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (42 == i) {
			int i_9_ = class572_sub15.readUnsignedByte(1232795089);
			aByteArray4838 = new byte[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				aByteArray4838[i_10_] = class572_sub15.readByte(988938473);
		} else if (44 == i) {
			int i_11_ = class572_sub15.readUnsignedShort(647518597);
			int i_12_ = 0;
			for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
				i_12_++;
			aByteArray4802 = new byte[i_12_];
			byte i_14_ = 0;
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
				if ((i_11_ & 1 << i_15_) > 0) {
					aByteArray4802[i_15_] = i_14_;
					i_14_++;
				} else
					aByteArray4802[i_15_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_16_ = class572_sub15.readUnsignedShort(647518597);
			int i_17_ = 0;
			for (int i_18_ = i_16_; i_18_ > 0; i_18_ >>= 1)
				i_17_++;
			aByteArray4803 = new byte[i_17_];
			byte i_19_ = 0;
			for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
				if ((i_16_ & 1 << i_20_) > 0) {
					aByteArray4803[i_20_] = i_19_;
					i_19_++;
				} else
					aByteArray4803[i_20_] = (byte) -1;
			}
		} else if (60 == i) {
			int i_21_ = class572_sub15.readUnsignedByte(1212970764);
			anIntArray4854 = new int[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
				anIntArray4854[i_22_] = class572_sub15.readBigSmart((byte) 73);
		} else if (93 == i)
			aBool4824 = false;
		else if (i == 95)
			anInt4812 = class572_sub15.readUnsignedShort(647518597) * -591264867;
		else if (i == 97)
			anInt4813 = class572_sub15.readUnsignedShort(647518597) * -1763369391;
		else if (i == 98)
			anInt4799 = class572_sub15.readUnsignedShort(647518597) * -196568321;
		else if (99 == i)
			aBool4815 = true;
		else if (i == 100)
			anInt4818 = class572_sub15.readByte(822814067) * 384196905;
		else if (101 == i)
			anInt4834 = class572_sub15.readByte(1472913296) * -1130815399;
		else if (i == 102) {
			int i_23_ = class572_sub15.readUnsignedByte(1566319285);
			int i_24_ = 0;
			for (int i_25_ = i_23_; 0 != i_25_; i_25_ >>= 1)
				i_24_++;
			anIntArray4822 = new int[i_24_];
			aShortArray4817 = new short[i_24_];
			for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
				if (0 == (i_23_ & 1 << i_26_)) {
					anIntArray4822[i_26_] = -1;
					aShortArray4817[i_26_] = (short) -1;
				} else {
					anIntArray4822[i_26_] = class572_sub15.readBigSmart((byte) 103);
					aShortArray4817[i_26_] = (short) class572_sub15.readSmart((byte) 122);
				}
			}
		} else if (i == 103)
			anInt4823 = class572_sub15.readUnsignedShort(647518597) * -1014207313;
		else if (i == 106 || 118 == i) {
			anInt4825 = class572_sub15.readUnsignedShort(647518597) * -1768586905;
			if (65535 == anInt4825 * 233114199)
				anInt4825 = 1768586905;
			anInt4826 = class572_sub15.readUnsignedShort(647518597) * -417924781;
			if (65535 == anInt4826 * 2037363419)
				anInt4826 = 417924781;
			int i_27_ = -1;
			if (118 == i) {
				i_27_ = class572_sub15.readUnsignedShort(647518597);
				if (65535 == i_27_)
					i_27_ = -1;
			}
			int i_28_ = class572_sub15.readUnsignedByte(326320922);
			anIntArray4795 = new int[i_28_ + 2];
			for (int i_29_ = 0; i_29_ <= i_28_; i_29_++) {
				anIntArray4795[i_29_] = class572_sub15.readUnsignedShort(647518597);
				if (65535 == anIntArray4795[i_29_])
					anIntArray4795[i_29_] = -1;
			}
			anIntArray4795[1 + i_28_] = i_27_;
		} else if (i == 107)
			aBool4827 = false;
		else if (i == 109)
			aBool4828 = false;
		else if (111 == i)
			aBool4829 = false;
		else if (i == 113) {
			aShort4830 = (short) class572_sub15.readUnsignedShort(647518597);
			aShort4831 = (short) class572_sub15.readUnsignedShort(647518597);
		} else if (i == 114) {
			aByte4832 = class572_sub15.readByte(965097114);
			aByte4844 = class572_sub15.readByte(1894300408);
		} else if (i == 119)
			aByte4836 = class572_sub15.readByte(285275705);
		else if (i == 121) {
			anIntArrayArray4847 = new int[anIntArray4793.length][];
			int i_30_ = class572_sub15.readUnsignedByte(1680329354);
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				int i_32_ = class572_sub15.readUnsignedByte(1490197434);
				int[] is = (anIntArrayArray4847[i_32_] = new int[3]);
				is[0] = class572_sub15.readByte(2032668351);
				is[1] = class572_sub15.readByte(1950351028);
				is[2] = class572_sub15.readByte(1259522617);
			}
		} else if (i == 123)
			anInt4833 = class572_sub15.readUnsignedShort(647518597) * 954500357;
		else if (125 == i)
			aClass661_4846 = ((Class661) Class455.method5387(Class343.method4304(920535481), class572_sub15.readByte(1732673273), -1975154204));
		else if (127 == i)
			anInt4805 = class572_sub15.readUnsignedShort(647518597) * 948726227;
		else if (i == 128)
			Class455.method5387(Class404.method4797(972520775), class572_sub15.readUnsignedByte(1829283963), -1894692524);
		else if (134 == i) {
			anInt4839 = class572_sub15.readUnsignedShort(647518597) * -698057933;
			if (65535 == anInt4839 * -588253189)
				anInt4839 = 698057933;
			anInt4840 = class572_sub15.readUnsignedShort(647518597) * 1592687681;
			if (65535 == anInt4840 * -501509183)
				anInt4840 = -1592687681;
			anInt4841 = class572_sub15.readUnsignedShort(647518597) * 509359555;
			if (65535 == 499278571 * anInt4841)
				anInt4841 = -509359555;
			anInt4842 = class572_sub15.readUnsignedShort(647518597) * -1484433689;
			if (65535 == 164584663 * anInt4842)
				anInt4842 = 1484433689;
			anInt4843 = class572_sub15.readUnsignedByte(117001396) * -1729464507;
		} else if (i == 135 || i == 136) {
			class572_sub15.readUnsignedByte(1428674120);
			class572_sub15.readUnsignedShort(647518597);
		} else if (i == 137)
			anInt4810 = class572_sub15.readUnsignedShort(647518597) * -711549909;
		else if (i == 138)
			anInt4811 = class572_sub15.readBigSmart((byte) 39) * -1045633701;
		else if (i == 140)
			anInt4790 = class572_sub15.readUnsignedByte(677176171) * 1792379735;
		else if (141 == i)
			aBool4814 = true;
		else if (i == 142)
			anInt4849 = class572_sub15.readUnsignedShort(647518597) * 849528197;
		else if (143 == i)
			aBool4816 = true;
		else if (i >= 150 && i < 155) {
			aStringArray4808[i - 150] = class572_sub15.readString(1295706626);
			if (!((Class415) aClass415_4786).aBool4929)
				aStringArray4808[i - 150] = null;
		} else if (i == 155) {
			aByte4804 = class572_sub15.readByte(1429972085);
			aByte4821 = class572_sub15.readByte(1121180721);
			aByte4806 = class572_sub15.readByte(896024414);
			aByte4807 = class572_sub15.readByte(700734582);
		} else if (i == 158)
			aByte4851 = (byte) 1;
		else if (i == 159)
			aByte4851 = (byte) 0;
		else if (i == 160) {
			int i_33_ = class572_sub15.readUnsignedByte(817322605);
			anIntArray4850 = new int[i_33_];
			for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
				anIntArray4850[i_34_] = class572_sub15.readUnsignedShort(647518597);
		} else if (162 != i) {
			if (i == 163)
				anInt4852 = class572_sub15.readUnsignedByte(1859319831) * -2095865035;
			else if (164 == i) {
				anInt4794 = class572_sub15.readUnsignedShort(647518597) * 1401169931;
				anInt4855 = class572_sub15.readUnsignedShort(647518597) * 32599317;
			} else if (i == 165)
				anInt4856 = class572_sub15.readUnsignedByte(1992010652) * -441240859;
			else if (168 == i)
				anInt4789 = class572_sub15.readUnsignedByte(790359347) * 1376856245;
			else if (i == 169)
				aBool4857 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray4787) {
					anIntArray4787 = new int[6];
					Arrays.fill(anIntArray4787, -1);
				}
				int i_35_ = class572_sub15.readUnsignedShort(647518597);
				if (65535 == i_35_)
					i_35_ = -1;
				anIntArray4787[i - 170] = i_35_;
			} else if (i != 178) {
				if (i == 179) {
					aClass326_4853 = new Class326();
					aClass326_4853.aFloat4113 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4106 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4108 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4109 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4110 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4111 = (float) class572_sub15.readSmart(16777215);
				} else if (i == 180)
					anInt4858 = ((class572_sub15.readUnsignedByte(367907073) & 0xff) * -1008431223);
				else if (181 == i) {
					aShort4848 = (short) class572_sub15.readUnsignedShort(647518597);
					aByte4835 = (byte) class572_sub15.readUnsignedByte(834962875);
				} else if (182 == i)
					aBool4859 = true;
				else if (i == 249) {
					int i_36_ = class572_sub15.readUnsignedByte(767858753);
					if (aClass676_4785 == null) {
						int i_37_ = HashTable.nextPowerOfTwo(i_36_, 2103712774);
						aClass676_4785 = new Class676(i_37_);
					}
					for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
						boolean bool = class572_sub15.readUnsignedByte(401502156) == 1;
						int i_39_ = class572_sub15.read24BitInt(1140925462);
						Class572 class572;
						if (bool)
							class572 = (new LinkableObject(class572_sub15.readString(1295706626)));
						else
							class572 = (new LinkableInt(class572_sub15.readInt(693796940)));
						aClass676_4785.put(class572, (long) i_39_);
					}
				}
			}
		}
	}

	public final NPCDefintion method4947(Interface15 interface15, Interface13 interface13, int i) {
		int i_40_ = -1;
		if (anInt4825 * 233114199 != -1) {
			VarBitDefinition class429 = interface15.method95(anInt4825 * 233114199, 819446449);
			if (null != class429)
				i_40_ = interface13.method72(class429, 22089601);
		} else if (-1 != 2037363419 * anInt4826) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, (anInt4826 * 2037363419), (byte) 36);
			if (class179 != null)
				i_40_ = interface13.method73(class179, -2001327877);
		}
		if (i_40_ < 0 || i_40_ >= anIntArray4795.length - 1) {
			int i_41_ = anIntArray4795[anIntArray4795.length - 1];
			if (i_41_ != -1)
				return (NPCDefintion) anInterface18_4788.getDefinition(i_41_, -1495396043);
			return null;
		}
		if (anIntArray4795[i_40_] == -1)
			return null;
		return (NPCDefintion) anInterface18_4788.getDefinition(anIntArray4795[i_40_], 2001361868);
	}

	public final Model method4948(Class106 class106, int i, Class639_Sub11 class639_sub11, Interface15 interface15, Interface13 interface13, Class663 class663, Class663 class663_42_, Class663[] class663s, int[] is, int i_43_, Class399 class399, int i_44_) {
		return method4949(class106, i, class639_sub11, interface15, interface13, class663, class663_42_, class663s, is, i_43_, class399, 1071699547 * anInt4805, true, (byte) 49);
	}

	public final Model method4949(Class106 class106, int i, Class639_Sub11 class639_sub11, Interface15 interface15, Interface13 interface13, Class663 class663, Class663 class663_45_, Class663[] class663s, int[] is, int i_46_, Class399 class399, int i_47_, boolean bool, byte i_48_) {
		if (anIntArray4795 != null) {
			NPCDefintion class410_49_ = method4947(interface15, interface13, -143570980);
			if (class410_49_ == null)
				return null;
			return class410_49_.method4949(class106, i, class639_sub11, interface15, interface13, class663, class663_45_, class663s, is, i_46_, class399, i_47_, bool, (byte) 56);
		}
		int i_50_ = i;
		if (450782463 * anInt4799 != 128)
			i_50_ |= 0x2;
		if (anInt4813 * -2015302991 != 128)
			i_50_ |= 0x5;
		boolean bool_51_ = false;
		int i_52_ = null != class663s ? class663s.length : 0;
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
			if (null != class663s[i_53_]) {
				i_50_ |= class663s[i_53_].method7794(1345538829);
				bool_51_ = true;
			}
		}
		if (null != class663) {
			i_50_ |= class663.method7794(-106622716);
			bool_51_ = true;
		}
		if (null != class663_45_) {
			i_50_ |= class663_45_.method7794(-323852501);
			bool_51_ = true;
		}
		long l = (long) (anInt4819 * 1355909985 | class106.anInt1416 * 1862175997 << 16);
		if (null != class399)
			l |= class399.aLong4723 * -7699086172219811731L << 24;
		Model model;
		synchronized (((Class415) aClass415_4786).aClass127_4926) {
			model = (Model) ((Class415) aClass415_4786).aClass127_4926.method2246(l);
		}
		Class538 class538 = null;
		if (!bool && -1 != i_47_)
			class538 = (Class538) class639_sub11.getDefinition(i_47_, -1676145998);
		else if (1071699547 * anInt4805 != -1)
			class538 = (Class538) class639_sub11.getDefinition(1071699547 * anInt4805, 1585481083);
		if (model == null || (model.method1353() & i_50_) != i_50_) {
			if (null != model)
				i_50_ |= model.method1353();
			int i_54_ = i_50_;
			if (aShortArray4797 != null)
				i_54_ |= 0x4000;
			if (aShortArray4800 != null)
				i_54_ |= 0x8000;
			if (0 != aByte4807)
				i_54_ |= 0x80000;
			int[] is_55_ = (class399 != null && class399.anIntArray4720 != null ? class399.anIntArray4720 : anIntArray4793);
			boolean bool_56_ = false;
			synchronized (((Class415) aClass415_4786).aClass248_4925) {
				for (int i_57_ = 0; i_57_ < is_55_.length; i_57_++) {
					if (is_55_[i_57_] != -1 && !((Class415) aClass415_4786).aClass248_4925.method3369(is_55_[i_57_], 0, (byte) -114))
						bool_56_ = true;
				}
			}
			if (bool_56_)
				return null;
			Class159[] class159s = new Class159[is_55_.length];
			for (int i_58_ = 0; i_58_ < is_55_.length; i_58_++) {
				if (-1 != is_55_[i_58_]) {
					synchronized (((Class415) aClass415_4786).aClass248_4925) {
						class159s[i_58_] = Class159.method2569((((Class415) (aClass415_4786)).aClass248_4925), is_55_[i_58_], 0);
					}
					if (null != class159s[i_58_]) {
						if (class159s[i_58_].anInt1773 < 13)
							class159s[i_58_].method2567(2);
						if (anIntArrayArray4847 != null && (anIntArrayArray4847[i_58_] != null))
							class159s[i_58_].method2564((anIntArrayArray4847[i_58_][0]), (anIntArrayArray4847[i_58_][1]), (anIntArrayArray4847[i_58_][2]));
					}
				}
			}
			if (null != class399) {
				for (int i_59_ = 0; i_59_ < class159s.length; i_59_++) {
					if (null != class159s[i_59_]) {
						if (((Class399) class399).aFloatArray4724 != null && (((Class399) class399).aFloatArray4724[i_59_] != 0.0F))
							class159s[i_59_].method2554(((Class399) class399).aFloatArray4724[i_59_]);
						if (((Class399) class399).anIntArrayArray4722 != null)
							class159s[i_59_].method2565((((Class399) class399).anIntArrayArray4722[i_59_][0]), (((Class399) class399).anIntArrayArray4722[i_59_][1]), (((Class399) class399).anIntArrayArray4722[i_59_][2]));
						if (((Class399) class399).anIntArrayArray4719 != null)
							class159s[i_59_].method2564((((Class399) class399).anIntArrayArray4719[i_59_][0]), (((Class399) class399).anIntArrayArray4719[i_59_][1]), (((Class399) class399).anIntArrayArray4719[i_59_][2]));
					}
				}
			}
			if (null != class538 && class538.anIntArrayArray6025 != null) {
				for (int i_60_ = 0; i_60_ < class538.anIntArrayArray6025.length; i_60_++) {
					if (i_60_ < class159s.length && class159s[i_60_] != null) {
						int i_61_ = 0;
						int i_62_ = 0;
						int i_63_ = 0;
						int i_64_ = 0;
						int i_65_ = 0;
						int i_66_ = 0;
						if (class538.anIntArrayArray6025[i_60_] != null) {
							i_61_ = class538.anIntArrayArray6025[i_60_][0];
							i_62_ = class538.anIntArrayArray6025[i_60_][1];
							i_63_ = class538.anIntArrayArray6025[i_60_][2];
							i_64_ = class538.anIntArrayArray6025[i_60_][3] << 3;
							i_65_ = class538.anIntArrayArray6025[i_60_][4] << 3;
							i_66_ = class538.anIntArrayArray6025[i_60_][5] << 3;
						}
						if (0 != i_64_ || i_65_ != 0 || 0 != i_66_)
							class159s[i_60_].method2565(i_64_, i_65_, i_66_);
						if (0 != i_61_ || i_62_ != 0 || 0 != i_63_)
							class159s[i_60_].method2564(i_61_, i_62_, i_63_);
					}
				}
			}
			Class159 class159;
			if (1 == class159s.length)
				class159 = class159s[0];
			else
				class159 = new Class159(class159s, class159s.length);
			model = (class106.method1755(class159, i_54_, (((Class415) aClass415_4786).anInt4928 * -939141683), 64 + anInt4818 * -965883111, anInt4834 * -2094741619 + 850));
			if (null != aShortArray4797) {
				short[] is_67_;
				if (null != class399 && null != class399.aShortArray4721)
					is_67_ = class399.aShortArray4721;
				else
					is_67_ = aShortArray4798;
				for (int i_68_ = 0; i_68_ < aShortArray4797.length; i_68_++) {
					if (null != aByteArray4838 && i_68_ < aByteArray4838.length)
						model.method1393((aShortArray4797[i_68_]), aShortArray4796[(aByteArray4838[i_68_]) & 0xff]);
					else
						model.method1393((aShortArray4797[i_68_]), is_67_[i_68_]);
				}
			}
			if (null != aShortArray4800) {
				short[] is_69_;
				if (null != class399 && class399.aShortArray4725 != null)
					is_69_ = class399.aShortArray4725;
				else
					is_69_ = aShortArray4801;
				for (int i_70_ = 0; i_70_ < aShortArray4800.length; i_70_++)
					model.method1494((aShortArray4800[i_70_]), is_69_[i_70_]);
			}
			if (0 != aByte4807)
				model.method1396(aByte4804, aByte4821, aByte4806, aByte4807 & 0xff);
			model.method1483();
			model.method1450(i_50_);
			synchronized (((Class415) aClass415_4786).aClass127_4926) {
				((Class415) aClass415_4786).aClass127_4926.method2229(model, l);
			}
		}
		Model class89_71_ = model.method1351((byte) 4, i_50_, true);
		boolean bool_72_ = false;
		if (null != is) {
			for (int i_73_ = 0; i_73_ < 12; i_73_++) {
				if (-1 != is[i_73_])
					bool_72_ = true;
			}
		}
		if (!bool_51_ && !bool_72_)
			return class89_71_;
		Class261[] class261s = null;
		if (class538 != null)
			class261s = class538.method6390(-1477842364);
		if (bool_72_ && class261s != null) {
			for (int i_74_ = 0; i_74_ < 12; i_74_++) {
				if (class261s[i_74_] != null)
					class89_71_.method1345(class261s[i_74_], 1 << i_74_, true);
			}
		}
		int i_75_ = 0;
		int i_76_ = 1;
		while (i_75_ < i_52_) {
			if (class663s[i_75_] != null)
				class663s[i_75_].method7798(class89_71_, 0, i_76_, (byte) -98);
			i_75_++;
			i_76_ <<= 1;
		}
		if (bool_72_) {
			for (i_75_ = 0; i_75_ < 12; i_75_++) {
				if (-1 != is[i_75_]) {
					i_76_ = is[i_75_] - i_46_;
					i_76_ &= 0x3fff;
					Class261 class261 = new Class261();
					class261.method3571(0.0F, 1.0F, 0.0F, Class325.method4146(i_76_));
					class89_71_.method1345(class261, 1 << i_75_, false);
				}
			}
		}
		if (bool_72_ && null != class261s) {
			for (i_75_ = 0; i_75_ < 12; i_75_++) {
				if (null != class261s[i_75_])
					class89_71_.method1345(class261s[i_75_], 1 << i_75_, false);
			}
		}
		if (null != class663 && null != class663_45_)
			Class503.method6020(class89_71_, class663, class663_45_, 1435909456);
		else if (class663 != null)
			class663.method7797(class89_71_, 0, (byte) -102);
		else if (class663_45_ != null)
			class663_45_.method7797(class89_71_, 0, (byte) -97);
		if (anInt4813 * -2015302991 != 128 || anInt4799 * 450782463 != 128)
			class89_71_.method1464(anInt4813 * -2015302991, anInt4799 * 450782463, anInt4813 * -2015302991);
		class89_71_.method1450(i);
		return class89_71_;
	}

	public final Model method4950(Class106 class106, int i, Interface15 interface15, Interface13 interface13, Class663 class663, Class399 class399, int i_77_) {
		if (null != anIntArray4795) {
			NPCDefintion class410_78_ = method4947(interface15, interface13, 1502405380);
			if (class410_78_ == null)
				return null;
			return class410_78_.method4950(class106, i, interface15, interface13, class663, class399, 1068746800);
		}
		if (null == anIntArray4854 && (class399 == null || null == class399.anIntArray4720))
			return null;
		int i_79_ = i;
		if (class663 != null)
			i_79_ |= class663.method7794(-80649236);
		long l = (long) (1355909985 * anInt4819 | class106.anInt1416 * 1862175997 << 16);
		if (null != class399)
			l |= class399.aLong4723 * -7699086172219811731L << 24;
		Model model;
		synchronized (((Class415) aClass415_4786).aClass127_4927) {
			model = (Model) ((Class415) aClass415_4786).aClass127_4927.method2246(l);
		}
		if (null == model || (model.method1353() & i_79_) != i_79_) {
			if (null != model)
				i_79_ |= model.method1353();
			int i_80_ = i_79_;
			if (aShortArray4797 != null)
				i_80_ |= 0x4000;
			if (null != aShortArray4800)
				i_80_ |= 0x8000;
			if (0 != aByte4807)
				i_80_ |= 0x80000;
			int[] is = (class399 != null && null != class399.anIntArray4720 ? class399.anIntArray4720 : anIntArray4854);
			boolean bool = false;
			synchronized (((Class415) aClass415_4786).aClass248_4925) {
				for (int i_81_ = 0; i_81_ < is.length; i_81_++) {
					if (!((Class415) aClass415_4786).aClass248_4925.method3369(is[i_81_], 0, (byte) -119))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class159[] class159s = new Class159[is.length];
			synchronized (((Class415) aClass415_4786).aClass248_4925) {
				for (int i_82_ = 0; i_82_ < is.length; i_82_++)
					class159s[i_82_] = Class159.method2569((((Class415) (aClass415_4786)).aClass248_4925), is[i_82_], 0);
			}
			for (int i_83_ = 0; i_83_ < is.length; i_83_++) {
				if (null != class159s[i_83_] && class159s[i_83_].anInt1773 < 13)
					class159s[i_83_].method2567(2);
			}
			Class159 class159;
			if (class159s.length == 1)
				class159 = class159s[0];
			else
				class159 = new Class159(class159s, class159s.length);
			model = class106.method1755(class159, i_80_, (((Class415) aClass415_4786).anInt4928) * -939141683, 64, 768);
			if (aShortArray4797 != null) {
				short[] is_84_;
				if (class399 != null && class399.aShortArray4721 != null)
					is_84_ = class399.aShortArray4721;
				else
					is_84_ = aShortArray4798;
				for (int i_85_ = 0; i_85_ < aShortArray4797.length; i_85_++) {
					if (null != aByteArray4838 && i_85_ < aByteArray4838.length)
						model.method1393((aShortArray4797[i_85_]), aShortArray4796[(aByteArray4838[i_85_]) & 0xff]);
					else
						model.method1393((aShortArray4797[i_85_]), is_84_[i_85_]);
				}
			}
			if (null != aShortArray4800) {
				short[] is_86_;
				if (null != class399 && class399.aShortArray4725 != null)
					is_86_ = class399.aShortArray4725;
				else
					is_86_ = aShortArray4801;
				for (int i_87_ = 0; i_87_ < aShortArray4800.length; i_87_++)
					model.method1494((aShortArray4800[i_87_]), is_86_[i_87_]);
			}
			if (0 != aByte4807)
				model.method1396(aByte4804, aByte4821, aByte4806, aByte4807 & 0xff);
			model.method1450(i_79_);
			synchronized (((Class415) aClass415_4786).aClass127_4927) {
				((Class415) aClass415_4786).aClass127_4927.method2229(model, l);
			}
		}
		if (class663 != null) {
			model = model.method1351((byte) 1, i_79_, true);
			class663.method7797(model, 0, (byte) -94);
		}
		model.method1450(i);
		return model;
	}

	public final boolean method4951(byte i) {
		if (null == anIntArray4793)
			return true;
		boolean bool = true;
		int[] is = anIntArray4793;
		for (int i_88_ = 0; i_88_ < is.length; i_88_++) {
			int i_89_ = is[i_88_];
			if (!((Class415) aClass415_4786).aClass248_4925.method3369(i_89_, 0, (byte) -73))
				bool = false;
		}
		return bool;
	}

	public int method4952(int i, int i_90_, int i_91_) {
		if (null == aClass676_4785)
			return i_90_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_4785.get((long) i));
		if (class572_sub26 == null)
			return i_90_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	public String method4953(int i, String string, int i_92_) {
		if (aClass676_4785 == null)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) aClass676_4785.get((long) i));
		if (null == class572_sub9)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public void method104(byte i) {
		if (anIntArray4793 == null)
			anIntArray4793 = new int[0];
		if (-1 == aByte4851) {
			if (aClass415_4786 == null || (Class437.aClass437_5072 == (((Class415) aClass415_4786).aClass437_4923)))
				aByte4851 = (byte) 1;
			else
				aByte4851 = (byte) 0;
		}
	}

	public int method4954(int i, int i_93_) {
		if (null == anIntArray4787)
			return -1;
		return anIntArray4787[i];
	}

	public boolean method4955(short i) {
		if (null == anIntArray4795)
			return (anInt4839 * -588253189 != -1 || anInt4841 * 499278571 != -1 || -1 != 164584663 * anInt4842);
		for (int i_94_ = 0; i_94_ < anIntArray4795.length; i_94_++) {
			if (anIntArray4795[i_94_] != -1) {
				NPCDefintion class410_95_ = ((NPCDefintion) anInterface18_4788.getDefinition(anIntArray4795[i_94_], 236233688));
				if (-1 != -588253189 * class410_95_.anInt4839 || class410_95_.anInt4841 * 499278571 != -1 || 164584663 * class410_95_.anInt4842 != -1)
					return true;
			}
		}
		return false;
	}

	public void method106() {
		if (anIntArray4793 == null)
			anIntArray4793 = new int[0];
		if (-1 == aByte4851) {
			if (aClass415_4786 == null || (Class437.aClass437_5072 == (((Class415) aClass415_4786).aClass437_4923)))
				aByte4851 = (byte) 1;
			else
				aByte4851 = (byte) 0;
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1479912398);
			if (0 == i)
				break;
			method4946(class572_sub15, i, (byte) -40);
		}
	}

	public void method110() {
		if (anIntArray4793 == null)
			anIntArray4793 = new int[0];
		if (-1 == aByte4851) {
			if (aClass415_4786 == null || (Class437.aClass437_5072 == (((Class415) aClass415_4786).aClass437_4923)))
				aByte4851 = (byte) 1;
			else
				aByte4851 = (byte) 0;
		}
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(449592238);
			if (0 == i)
				break;
			method4946(class572_sub15, i, (byte) 26);
		}
	}

	public void method103() {
		if (anIntArray4793 == null)
			anIntArray4793 = new int[0];
		if (-1 == aByte4851) {
			if (aClass415_4786 == null || (Class437.aClass437_5072 == (((Class415) aClass415_4786).aClass437_4923)))
				aByte4851 = (byte) 1;
			else
				aByte4851 = (byte) 0;
		}
	}

	public boolean method4956() {
		if (null == anIntArray4795)
			return (anInt4839 * -588253189 != -1 || anInt4841 * 499278571 != -1 || -1 != 164584663 * anInt4842);
		for (int i = 0; i < anIntArray4795.length; i++) {
			if (anIntArray4795[i] != -1) {
				NPCDefintion class410_96_ = ((NPCDefintion) anInterface18_4788.getDefinition(anIntArray4795[i], -1309862476));
				if (-1 != -588253189 * class410_96_.anInt4839 || class410_96_.anInt4841 * 499278571 != -1 || 164584663 * class410_96_.anInt4842 != -1)
					return true;
			}
		}
		return false;
	}

	public void method112() {
		if (anIntArray4793 == null)
			anIntArray4793 = new int[0];
		if (-1 == aByte4851) {
			if (aClass415_4786 == null || (Class437.aClass437_5072 == (((Class415) aClass415_4786).aClass437_4923)))
				aByte4851 = (byte) 1;
			else
				aByte4851 = (byte) 0;
		}
	}

	public boolean method4957() {
		if (null == anIntArray4795)
			return (anInt4839 * -588253189 != -1 || anInt4841 * 499278571 != -1 || -1 != 164584663 * anInt4842);
		for (int i = 0; i < anIntArray4795.length; i++) {
			if (anIntArray4795[i] != -1) {
				NPCDefintion class410_97_ = (NPCDefintion) anInterface18_4788.getDefinition(anIntArray4795[i], -987571122);
				if (-1 != -588253189 * class410_97_.anInt4839 || class410_97_.anInt4841 * 499278571 != -1 || 164584663 * class410_97_.anInt4842 != -1)
					return true;
			}
		}
		return false;
	}

	void method4958(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			int i_98_ = class572_sub15.readUnsignedByte(1854810615);
			anIntArray4793 = new int[i_98_];
			for (int i_99_ = 0; i_99_ < i_98_; i_99_++)
				anIntArray4793[i_99_] = class572_sub15.readBigSmart((byte) 26);
		} else if (2 == i)
			aString4791 = class572_sub15.readString(1295706626);
		else if (12 == i)
			anInt4792 = class572_sub15.readUnsignedByte(1238099214) * -1636145493;
		else if (i >= 30 && i < 35)
			aStringArray4808[i - 30] = class572_sub15.readString(1295706626);
		else if (40 == i) {
			int i_100_ = class572_sub15.readUnsignedByte(1316288142);
			aShortArray4797 = new short[i_100_];
			aShortArray4798 = new short[i_100_];
			for (int i_101_ = 0; i_101_ < i_100_; i_101_++) {
				aShortArray4797[i_101_] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray4798[i_101_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 41) {
			int i_102_ = class572_sub15.readUnsignedByte(566411750);
			aShortArray4800 = new short[i_102_];
			aShortArray4801 = new short[i_102_];
			for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
				aShortArray4800[i_103_] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray4801[i_103_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (42 == i) {
			int i_104_ = class572_sub15.readUnsignedByte(567296116);
			aByteArray4838 = new byte[i_104_];
			for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
				aByteArray4838[i_105_] = class572_sub15.readByte(1519028864);
		} else if (44 == i) {
			int i_106_ = class572_sub15.readUnsignedShort(647518597);
			int i_107_ = 0;
			for (int i_108_ = i_106_; i_108_ > 0; i_108_ >>= 1)
				i_107_++;
			aByteArray4802 = new byte[i_107_];
			byte i_109_ = 0;
			for (int i_110_ = 0; i_110_ < i_107_; i_110_++) {
				if ((i_106_ & 1 << i_110_) > 0) {
					aByteArray4802[i_110_] = i_109_;
					i_109_++;
				} else
					aByteArray4802[i_110_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_111_ = class572_sub15.readUnsignedShort(647518597);
			int i_112_ = 0;
			for (int i_113_ = i_111_; i_113_ > 0; i_113_ >>= 1)
				i_112_++;
			aByteArray4803 = new byte[i_112_];
			byte i_114_ = 0;
			for (int i_115_ = 0; i_115_ < i_112_; i_115_++) {
				if ((i_111_ & 1 << i_115_) > 0) {
					aByteArray4803[i_115_] = i_114_;
					i_114_++;
				} else
					aByteArray4803[i_115_] = (byte) -1;
			}
		} else if (60 == i) {
			int i_116_ = class572_sub15.readUnsignedByte(1815986730);
			anIntArray4854 = new int[i_116_];
			for (int i_117_ = 0; i_117_ < i_116_; i_117_++)
				anIntArray4854[i_117_] = class572_sub15.readBigSmart((byte) 48);
		} else if (93 == i)
			aBool4824 = false;
		else if (i == 95)
			anInt4812 = class572_sub15.readUnsignedShort(647518597) * -591264867;
		else if (i == 97)
			anInt4813 = class572_sub15.readUnsignedShort(647518597) * -1763369391;
		else if (i == 98)
			anInt4799 = class572_sub15.readUnsignedShort(647518597) * -196568321;
		else if (99 == i)
			aBool4815 = true;
		else if (i == 100)
			anInt4818 = class572_sub15.readByte(1828208623) * 384196905;
		else if (101 == i)
			anInt4834 = class572_sub15.readByte(275342026) * -1130815399;
		else if (i == 102) {
			int i_118_ = class572_sub15.readUnsignedByte(1465186586);
			int i_119_ = 0;
			for (int i_120_ = i_118_; 0 != i_120_; i_120_ >>= 1)
				i_119_++;
			anIntArray4822 = new int[i_119_];
			aShortArray4817 = new short[i_119_];
			for (int i_121_ = 0; i_121_ < i_119_; i_121_++) {
				if (0 == (i_118_ & 1 << i_121_)) {
					anIntArray4822[i_121_] = -1;
					aShortArray4817[i_121_] = (short) -1;
				} else {
					anIntArray4822[i_121_] = class572_sub15.readBigSmart((byte) 42);
					aShortArray4817[i_121_] = (short) class572_sub15.readSmart((byte) 84);
				}
			}
		} else if (i == 103)
			anInt4823 = class572_sub15.readUnsignedShort(647518597) * -1014207313;
		else if (i == 106 || 118 == i) {
			anInt4825 = class572_sub15.readUnsignedShort(647518597) * -1768586905;
			if (65535 == anInt4825 * 233114199)
				anInt4825 = 1768586905;
			anInt4826 = class572_sub15.readUnsignedShort(647518597) * -417924781;
			if (65535 == anInt4826 * 2037363419)
				anInt4826 = 417924781;
			int i_122_ = -1;
			if (118 == i) {
				i_122_ = class572_sub15.readUnsignedShort(647518597);
				if (65535 == i_122_)
					i_122_ = -1;
			}
			int i_123_ = class572_sub15.readUnsignedByte(385798583);
			anIntArray4795 = new int[i_123_ + 2];
			for (int i_124_ = 0; i_124_ <= i_123_; i_124_++) {
				anIntArray4795[i_124_] = class572_sub15.readUnsignedShort(647518597);
				if (65535 == anIntArray4795[i_124_])
					anIntArray4795[i_124_] = -1;
			}
			anIntArray4795[1 + i_123_] = i_122_;
		} else if (i == 107)
			aBool4827 = false;
		else if (i == 109)
			aBool4828 = false;
		else if (111 == i)
			aBool4829 = false;
		else if (i == 113) {
			aShort4830 = (short) class572_sub15.readUnsignedShort(647518597);
			aShort4831 = (short) class572_sub15.readUnsignedShort(647518597);
		} else if (i == 114) {
			aByte4832 = class572_sub15.readByte(1640878792);
			aByte4844 = class572_sub15.readByte(317003288);
		} else if (i == 119)
			aByte4836 = class572_sub15.readByte(414338128);
		else if (i == 121) {
			anIntArrayArray4847 = new int[anIntArray4793.length][];
			int i_125_ = class572_sub15.readUnsignedByte(354897432);
			for (int i_126_ = 0; i_126_ < i_125_; i_126_++) {
				int i_127_ = class572_sub15.readUnsignedByte(1798316856);
				int[] is = (anIntArrayArray4847[i_127_] = new int[3]);
				is[0] = class572_sub15.readByte(1452502797);
				is[1] = class572_sub15.readByte(137963336);
				is[2] = class572_sub15.readByte(513555679);
			}
		} else if (i == 123)
			anInt4833 = class572_sub15.readUnsignedShort(647518597) * 954500357;
		else if (125 == i)
			aClass661_4846 = ((Class661) Class455.method5387(Class343.method4304(487532585), class572_sub15.readByte(1751608630), -2040239341));
		else if (127 == i)
			anInt4805 = class572_sub15.readUnsignedShort(647518597) * 948726227;
		else if (i == 128)
			Class455.method5387(Class404.method4797(1506340973), class572_sub15.readUnsignedByte(477084126), -1966738143);
		else if (134 == i) {
			anInt4839 = class572_sub15.readUnsignedShort(647518597) * -698057933;
			if (65535 == anInt4839 * -588253189)
				anInt4839 = 698057933;
			anInt4840 = class572_sub15.readUnsignedShort(647518597) * 1592687681;
			if (65535 == anInt4840 * -501509183)
				anInt4840 = -1592687681;
			anInt4841 = class572_sub15.readUnsignedShort(647518597) * 509359555;
			if (65535 == 499278571 * anInt4841)
				anInt4841 = -509359555;
			anInt4842 = class572_sub15.readUnsignedShort(647518597) * -1484433689;
			if (65535 == 164584663 * anInt4842)
				anInt4842 = 1484433689;
			anInt4843 = class572_sub15.readUnsignedByte(869489569) * -1729464507;
		} else if (i == 135 || i == 136) {
			class572_sub15.readUnsignedByte(1983385814);
			class572_sub15.readUnsignedShort(647518597);
		} else if (i == 137)
			anInt4810 = class572_sub15.readUnsignedShort(647518597) * -711549909;
		else if (i == 138)
			anInt4811 = class572_sub15.readBigSmart((byte) 57) * -1045633701;
		else if (i == 140)
			anInt4790 = class572_sub15.readUnsignedByte(163789197) * 1792379735;
		else if (141 == i)
			aBool4814 = true;
		else if (i == 142)
			anInt4849 = class572_sub15.readUnsignedShort(647518597) * 849528197;
		else if (143 == i)
			aBool4816 = true;
		else if (i >= 150 && i < 155) {
			aStringArray4808[i - 150] = class572_sub15.readString(1295706626);
			if (!((Class415) aClass415_4786).aBool4929)
				aStringArray4808[i - 150] = null;
		} else if (i == 155) {
			aByte4804 = class572_sub15.readByte(81678022);
			aByte4821 = class572_sub15.readByte(1992332391);
			aByte4806 = class572_sub15.readByte(1935755169);
			aByte4807 = class572_sub15.readByte(892141607);
		} else if (i == 158)
			aByte4851 = (byte) 1;
		else if (i == 159)
			aByte4851 = (byte) 0;
		else if (i == 160) {
			int i_128_ = class572_sub15.readUnsignedByte(1386991760);
			anIntArray4850 = new int[i_128_];
			for (int i_129_ = 0; i_129_ < i_128_; i_129_++)
				anIntArray4850[i_129_] = class572_sub15.readUnsignedShort(647518597);
		} else if (162 != i) {
			if (i == 163)
				anInt4852 = class572_sub15.readUnsignedByte(962757461) * -2095865035;
			else if (164 == i) {
				anInt4794 = class572_sub15.readUnsignedShort(647518597) * 1401169931;
				anInt4855 = class572_sub15.readUnsignedShort(647518597) * 32599317;
			} else if (i == 165)
				anInt4856 = class572_sub15.readUnsignedByte(2089200013) * -441240859;
			else if (168 == i)
				anInt4789 = class572_sub15.readUnsignedByte(1424547646) * 1376856245;
			else if (i == 169)
				aBool4857 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray4787) {
					anIntArray4787 = new int[6];
					Arrays.fill(anIntArray4787, -1);
				}
				int i_130_ = class572_sub15.readUnsignedShort(647518597);
				if (65535 == i_130_)
					i_130_ = -1;
				anIntArray4787[i - 170] = i_130_;
			} else if (i != 178) {
				if (i == 179) {
					aClass326_4853 = new Class326();
					aClass326_4853.aFloat4113 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4106 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4108 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4109 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4110 = (float) class572_sub15.readSmart(16777215);
					aClass326_4853.aFloat4111 = (float) class572_sub15.readSmart(16777215);
				} else if (i == 180)
					anInt4858 = ((class572_sub15.readUnsignedByte(1835215119) & 0xff) * -1008431223);
				else if (181 == i) {
					aShort4848 = (short) class572_sub15.readUnsignedShort(647518597);
					aByte4835 = (byte) class572_sub15.readUnsignedByte(1208233023);
				} else if (182 == i)
					aBool4859 = true;
				else if (i == 249) {
					int i_131_ = class572_sub15.readUnsignedByte(1215770268);
					if (aClass676_4785 == null) {
						int i_132_ = HashTable.nextPowerOfTwo(i_131_, 866313752);
						aClass676_4785 = new Class676(i_132_);
					}
					for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
						boolean bool = class572_sub15.readUnsignedByte(88199508) == 1;
						int i_134_ = class572_sub15.read24BitInt(1140925462);
						Class572 class572;
						if (bool)
							class572 = (new LinkableObject(class572_sub15.readString(1295706626)));
						else
							class572 = (new LinkableInt(class572_sub15.readInt(1904816402)));
						aClass676_4785.put(class572, (long) i_134_);
					}
				}
			}
		}
	}

	public int method4959(int i, int i_135_) {
		if (null == aClass676_4785)
			return i_135_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_4785.get((long) i));
		if (class572_sub26 == null)
			return i_135_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(865648813);
			if (0 == i)
				break;
			method4946(class572_sub15, i, (byte) -75);
		}
	}

	public final boolean method4960() {
		if (null == anIntArray4793)
			return true;
		boolean bool = true;
		int[] is = anIntArray4793;
		for (int i = 0; i < is.length; i++) {
			int i_136_ = is[i];
			if (!((Class415) aClass415_4786).aClass248_4925.method3369(i_136_, 0, (byte) -100))
				bool = false;
		}
		return bool;
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(177717461);
			if (0 == i)
				break;
			method4946(class572_sub15, i, (byte) 34);
		}
	}

	public int method4961(int i, int i_137_) {
		if (null == aClass676_4785)
			return i_137_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_4785.get((long) i));
		if (class572_sub26 == null)
			return i_137_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	NPCDefintion(int i, Class415 class415, Interface18 interface18) {
		anInt4812 = 591264867;
		anInt4813 = 1921984640;
		anInt4799 = 609058688;
		aBool4815 = false;
		aBool4816 = false;
		aBool4814 = false;
		anInt4818 = 0;
		anInt4834 = 0;
		anIntArray4822 = null;
		aShortArray4817 = null;
		anInt4811 = 1045633701;
		anInt4823 = 1905104352;
		anInt4825 = 1768586905;
		anInt4826 = 417924781;
		aBool4827 = true;
		aBool4828 = true;
		aBool4829 = true;
		aShort4830 = (short) 0;
		aShort4831 = (short) 0;
		aByte4832 = (byte) -96;
		aByte4844 = (byte) -16;
		aShort4848 = (short) -1;
		aByte4835 = (byte) 0;
		aByte4836 = (byte) 0;
		anInt4839 = 698057933;
		anInt4840 = -1592687681;
		anInt4841 = -509359555;
		anInt4842 = 1484433689;
		anInt4843 = 0;
		anInt4789 = 0;
		anInt4790 = 1790299049;
		anInt4833 = -954500357;
		aClass661_4846 = Class661.aClass661_8447;
		anInt4849 = -849528197;
		aByte4851 = (byte) -1;
		anInt4852 = 2095865035;
		anInt4794 = -2077750528;
		anInt4855 = -244509440;
		anInt4856 = 0;
		aBool4857 = true;
		anInt4858 = 0;
		aBool4859 = false;
		anInt4819 = i * -1525786463;
		aClass415_4786 = class415;
		anInterface18_4788 = interface18;
		aStringArray4808 = (String[]) ((Class415) aClass415_4786).aStringArray4924.clone();
	}

	public boolean method4962() {
		if (null == anIntArray4795)
			return (anInt4839 * -588253189 != -1 || anInt4841 * 499278571 != -1 || -1 != 164584663 * anInt4842);
		for (int i = 0; i < anIntArray4795.length; i++) {
			if (anIntArray4795[i] != -1) {
				NPCDefintion class410_138_ = (NPCDefintion) anInterface18_4788.getDefinition(anIntArray4795[i], 804366288);
				if (-1 != -588253189 * class410_138_.anInt4839 || class410_138_.anInt4841 * 499278571 != -1 || 164584663 * class410_138_.anInt4842 != -1)
					return true;
			}
		}
		return false;
	}

	public boolean method4963(Interface15 interface15, Interface13 interface13, byte i) {
		if (null == anIntArray4795)
			return true;
		int i_139_ = -1;
		if (233114199 * anInt4825 != -1) {
			VarBitDefinition class429 = interface15.method95(anInt4825 * 233114199, 819446449);
			if (null != class429)
				i_139_ = interface13.method72(class429, 1718995720);
		} else if (-1 != 2037363419 * anInt4826) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, (2037363419 * anInt4826), (byte) 60);
			if (class179 != null)
				i_139_ = interface13.method73(class179, -1537179848);
		}
		if (i_139_ < 0 || i_139_ >= anIntArray4795.length - 1) {
			int i_140_ = anIntArray4795[anIntArray4795.length - 1];
			if (i_140_ != -1)
				return true;
			return false;
		}
		if (anIntArray4795[i_139_] == -1)
			return false;
		return true;
	}

	static int method4964(Class481_Sub1 class481_sub1, Class481_Sub1 class481_sub1_141_, int i, boolean bool, int i_142_) {
		if (1 == i) {
			int i_143_ = -1371162219 * class481_sub1.anInt5360;
			int i_144_ = class481_sub1_141_.anInt5360 * -1371162219;
			if (!bool) {
				if (i_143_ == -1)
					i_143_ = 2001;
				if (i_144_ == -1)
					i_144_ = 2001;
			}
			return i_143_ - i_144_;
		}
		if (2 == i)
			return Class65.method1034(class481_sub1.method8230(-1950922918), class481_sub1_141_.method8230(-1683155284), Class594.aClass435_7823, 16711935);
		if (i == 3) {
			if (class481_sub1.aString8937.equals("-")) {
				if (class481_sub1_141_.aString8937.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class481_sub1_141_.aString8937.equals("-"))
				return bool ? 1 : -1;
			return Class65.method1034(class481_sub1.aString8937, class481_sub1_141_.aString8937, Class594.aClass435_7823, 16711935);
		}
		if (i == 4)
			return (class481_sub1.method5723(-1944226614) ? class481_sub1_141_.method5723(443636508) ? 0 : 1 : class481_sub1_141_.method5723(-1626901271) ? -1 : 0);
		if (i == 5)
			return (class481_sub1.method5721(-96506881) ? class481_sub1_141_.method5721(-96506881) ? 0 : 1 : class481_sub1_141_.method5721(-96506881) ? -1 : 0);
		if (i == 6)
			return (class481_sub1.method5722(938638777) ? class481_sub1_141_.method5722(1574940472) ? 0 : 1 : class481_sub1_141_.method5722(-1390855677) ? -1 : 0);
		if (i == 7)
			return (class481_sub1.method5720((byte) -20) ? class481_sub1_141_.method5720((byte) -15) ? 0 : 1 : class481_sub1_141_.method5720((byte) -7) ? -1 : 0);
		if (8 == i) {
			int i_145_ = 944028155 * class481_sub1.anInt8940;
			int i_146_ = class481_sub1_141_.anInt8940 * 944028155;
			if (bool) {
				if (1000 == i_145_)
					i_145_ = -1;
				if (1000 == i_146_)
					i_146_ = -1;
			} else {
				if (i_145_ == -1)
					i_145_ = 1000;
				if (-1 == i_146_)
					i_146_ = 1000;
			}
			return i_145_ - i_146_;
		}
		return (1695041271 * class481_sub1.anInt8939 - 1695041271 * class481_sub1_141_.anInt8939);
	}

	static void method4965(int i, byte i_147_) {
		Class185.anInt2172 = 106919739 * i;
		Class547_Sub1.anInt8982 = 1904285671;
		Class547_Sub1.anInt8983 = 1743033659;
		Class280.method3794(-1196385012);
	}

	static final void method4966(Cs2Executor class441, int i) {
		Class419.method5124((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), -1939955752);
	}
}
