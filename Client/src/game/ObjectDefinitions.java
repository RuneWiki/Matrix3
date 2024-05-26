package game;

/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class ObjectDefinitions implements Interface17 {
	public int[] anIntArray5605;
	public static short[] aShortArray5606 = new short[256];
	public int anInt5607;
	Class518 aClass518_5608;
	Interface18 anInterface18_5609;
	public int anInt5610;
	int[][] anIntArrayArray5611;
	byte[] aByteArray5612;
	short[] aShortArray5613;
	static final int anInt5614 = 6;
	byte[] aByteArray5615;
	byte aByte5616;
	short[] aShortArray5617;
	short[] aShortArray5618;
	public int anInt5619;
	public int anInt5620;
	short[] aShortArray5621;
	byte aByte5622;
	public int anInt5623;
	public int sizeX;
	public int sizeY;
	public int anInt5626;
	public int anInt5627;
	byte aByte5628;
	int anInt5629;
	public boolean aBool5630;
	public int[] anIntArray5631;
	public int anInt5632;
	public boolean aBool5633;
	int anInt5634;
	int[] anIntArray5635;
	public boolean aBool5636;
	public int anInt5637;
	int anInt5638;
	int anInt5639;
	public String[] aStringArray5640;
	int anInt5641;
	public int anInt5642;
	public String name = "null";
	byte[] aByteArray5644;
	int[] anIntArray5645;
	int anInt5646;
	public boolean aBool5647;
	public boolean aBool5648;
	public int anInt5649;
	byte[] aByteArray5650;
	int[] anIntArray5651;
	int anInt5652;
	int anInt5653;
	int anInt5654;
	int anInt5655;
	public int anInt5656;
	int anInt5657;
	public boolean aBool5658;
	boolean aBool5659;
	public int anInt5660;
	public int anInt5661;
	public boolean aBool5662;
	int anInt5663;
	public int anInt5664;
	public int anInt5665;
	byte aByte5666 = 0;
	public boolean aBool5667;
	public int anInt5668;
	int anInt5669;
	public int anInt5670;
	public int[] anIntArray5671;
	public boolean aBool5672;
	int anInt5673;
	public boolean aBool5674;
	public boolean aBool5675;
	Class676 parameters;
	public boolean aBool5677;
	public boolean aBool5678;
	public int anInt5679;
	public int anInt5680;
	byte aByte5681;
	public boolean aBool5682;
	public Class512 aClass512_5683;
	public Class326 aClass326_5684;
	static final int anInt5685 = 127007;

	public boolean method6041(int i, byte i_0_) {
		if (anIntArray5645 != null && i != -1) {
			for (int i_1_ = 0; i_1_ < anIntArray5645.length; i_1_++) {
				if (anIntArray5645[i_1_] == i)
					return true;
			}
		}
		return false;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(484642285);
			if (i_2_ == 0)
				break;
			method6044(class572_sub15, i_2_, (byte) 67);
		}
	}

	public void method104(byte i) {
		method6058((byte) -25);
		if (aBool5659)
			anInt5626 = 0;
		if (!((Class518) aClass518_5608).aBool5754 && aBool5675) {
			aStringArray5640 = null;
			anIntArray5631 = null;
		}
	}

	public void method103() {
		method6058((byte) -83);
		if (aBool5659)
			anInt5626 = 0;
		if (!((Class518) aClass518_5608).aBool5754 && aBool5675) {
			aStringArray5640 = null;
			anIntArray5631 = null;
		}
	}

	public final boolean method6042(int i, byte i_3_) {
		if (anIntArrayArray5611 == null)
			return true;
		boolean bool = true;
		for (int i_4_ = 0; i_4_ < aByteArray5644.length; i_4_++) {
			if (aByteArray5644[i_4_] == i) {
				for (int i_5_ = 0; i_5_ < anIntArrayArray5611[i_4_].length; i_5_++) {
					if (!aClass518_5608.method6133(anIntArrayArray5611[i_4_][i_5_], (short) 2958))
						bool = false;
				}
			}
		}
		return bool;
	}

	public final boolean method6043(Class463 class463, byte i) {
		if (anIntArrayArray5611 == null)
			return true;
		boolean bool = true;
		for (int i_6_ = 0; i_6_ < anIntArrayArray5611.length; i_6_++) {
			for (int i_7_ = 0; i_7_ < anIntArrayArray5611[i_6_].length; i_7_++) {
				boolean bool_8_ = (aClass518_5608.method6133(anIntArrayArray5611[i_6_][i_7_], (short) 28021));
				bool &= bool_8_;
				if (!bool_8_)
					class463.anInt5233 = (anIntArrayArray5611[i_6_][i_7_] * 282426451);
			}
		}
		return bool;
	}

	void method6044(RSByteBuffer class572_sub15, int i, byte i_9_) {
		if (1 == i) {
			int i_10_ = class572_sub15.readUnsignedByte(1651020988);
			aByteArray5644 = new byte[i_10_];
			anIntArrayArray5611 = new int[i_10_][];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				aByteArray5644[i_11_] = class572_sub15.readByte(681653255);
				int i_12_ = class572_sub15.readUnsignedByte(197181477);
				anIntArrayArray5611[i_11_] = new int[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
					anIntArrayArray5611[i_11_][i_13_] = class572_sub15.readBigSmart((byte) 76);
			}
		} else if (2 == i)
			name = class572_sub15.readString(1295706626).intern();
		else if (14 == i)
			sizeX = class572_sub15.readUnsignedByte(496906106) * 1755098015;
		else if (15 == i)
			sizeY = class572_sub15.readUnsignedByte(957130815) * -1692133213;
		else if (17 == i)
			anInt5626 = 0;
		else if (i != 18) {
			if (19 == i)
				anInt5627 = class572_sub15.readUnsignedByte(-67686056) * -1342119497;
			else if (21 == i)
				aByte5628 = (byte) 1;
			else if (i == 22)
				aBool5630 = true;
			else if (i == 23)
				anInt5680 = -132827261;
			else if (i == 24) {
				int i_14_ = class572_sub15.readBigSmart((byte) 111);
				if (i_14_ != -1)
					anIntArray5645 = new int[] { i_14_ };
			} else if (i == 27)
				anInt5626 = -2059086905;
			else if (i == 28)
				anInt5637 = ((class572_sub15.readUnsignedByte(1285183603) << 2) * 1239286817);
			else if (i == 29)
				anInt5638 = class572_sub15.readByte(666910166) * -1366763105;
			else if (i == 39)
				anInt5639 = class572_sub15.readByte(1155476950) * 48188655;
			else if (i >= 30 && i < 35)
				aStringArray5640[i - 30] = class572_sub15.readString(1295706626).intern();
			else if (40 == i) {
				int i_15_ = class572_sub15.readUnsignedByte(-48487645);
				aShortArray5613 = new short[i_15_];
				aShortArray5621 = new short[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					aShortArray5613[i_16_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5621[i_16_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (i == 41) {
				int i_17_ = class572_sub15.readUnsignedByte(1203274259);
				aShortArray5618 = new short[i_17_];
				aShortArray5617 = new short[i_17_];
				for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
					aShortArray5618[i_18_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5617[i_18_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (42 == i) {
				int i_19_ = class572_sub15.readUnsignedByte(1006126172);
				aByteArray5615 = new byte[i_19_];
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
					aByteArray5615[i_20_] = class572_sub15.readByte(943581788);
			} else if (44 == i) {
				int i_21_ = class572_sub15.readUnsignedShort(647518597);
				int i_22_ = 0;
				for (int i_23_ = i_21_; i_23_ > 0; i_23_ >>= 1)
					i_22_++;
				aByteArray5612 = new byte[i_22_];
				byte i_24_ = 0;
				for (int i_25_ = 0; i_25_ < i_22_; i_25_++) {
					if ((i_21_ & 1 << i_25_) > 0) {
						aByteArray5612[i_25_] = i_24_;
						i_24_++;
					} else
						aByteArray5612[i_25_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_26_ = class572_sub15.readUnsignedShort(647518597);
				int i_27_ = 0;
				for (int i_28_ = i_26_; i_28_ > 0; i_28_ >>= 1)
					i_27_++;
				aByteArray5650 = new byte[i_27_];
				byte i_29_ = 0;
				for (int i_30_ = 0; i_30_ < i_27_; i_30_++) {
					if ((i_26_ & 1 << i_30_) > 0) {
						aByteArray5650[i_30_] = i_29_;
						i_29_++;
					} else
						aByteArray5650[i_30_] = (byte) -1;
				}
			} else if (i == 62)
				aBool5647 = true;
			else if (64 == i)
				aBool5648 = false;
			else if (i == 65)
				anInt5646 = class572_sub15.readUnsignedShort(647518597) * -1447430701;
			else if (66 == i)
				anInt5634 = class572_sub15.readUnsignedShort(647518597) * -1617532341;
			else if (i == 67)
				anInt5641 = class572_sub15.readUnsignedShort(647518597) * -1984944005;
			else if (i == 69)
				class572_sub15.readUnsignedByte(847033500);
			else if (70 == i)
				anInt5652 = ((class572_sub15.readShort(-710976385) << 2) * -125233473);
			else if (i == 71)
				anInt5653 = ((class572_sub15.readShort(-710976385) << 2) * 1801330487);
			else if (i == 72)
				anInt5654 = (class572_sub15.readShort(-710976385) << 2) * 160437821;
			else if (i == 73)
				aBool5658 = true;
			else if (i == 74)
				aBool5659 = true;
			else if (75 == i)
				anInt5660 = class572_sub15.readUnsignedByte(1794094240) * 2000837393;
			else if (i == 77 || i == 92) {
				anInt5663 = class572_sub15.readUnsignedShort(647518597) * 1826386259;
				if (anInt5663 * 742456027 == 65535)
					anInt5663 = -1826386259;
				anInt5669 = class572_sub15.readUnsignedShort(647518597) * 1520719743;
				if (2039703679 * anInt5669 == 65535)
					anInt5669 = -1520719743;
				int i_31_ = -1;
				if (i == 92)
					i_31_ = class572_sub15.readBigSmart((byte) 64);
				int i_32_ = class572_sub15.readUnsignedByte(1731659959);
				anIntArray5605 = new int[i_32_ + 2];
				for (int i_33_ = 0; i_33_ <= i_32_; i_33_++)
					anIntArray5605[i_33_] = class572_sub15.readBigSmart((byte) 32);
				anIntArray5605[i_32_ + 1] = i_31_;
			} else if (i == 78) {
				anInt5665 = class572_sub15.readUnsignedShort(647518597) * 785693061;
				anInt5656 = class572_sub15.readUnsignedByte(952383665) * 1515773199;
			} else if (79 == i) {
				anInt5620 = class572_sub15.readUnsignedShort(647518597) * -230294397;
				anInt5670 = class572_sub15.readUnsignedShort(647518597) * 135699349;
				anInt5656 = class572_sub15.readUnsignedByte(1727595439) * 1515773199;
				int i_34_ = class572_sub15.readUnsignedByte(197137537);
				anIntArray5671 = new int[i_34_];
				for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
					anIntArray5671[i_35_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 81) {
				aByte5628 = (byte) 2;
				anInt5629 = class572_sub15.readUnsignedByte(252492046) * -2015779584;
			} else if (i == 82)
				aBool5633 = true;
			else if (88 == i)
				aBool5674 = false;
			else if (89 == i)
				aBool5672 = false;
			else if (91 == i)
				aBool5675 = true;
			else if (93 == i) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readUnsignedShort(647518597) * 847763877;
			} else if (i == 94)
				aByte5628 = (byte) 4;
			else if (95 == i) {
				aByte5628 = (byte) 5;
				anInt5629 = class572_sub15.readShort(-710976385) * 847763877;
			} else if (97 == i)
				aBool5662 = true;
			else if (i == 98)
				aBool5677 = true;
			else if (99 == i || 100 == i) {
				class572_sub15.readUnsignedByte(401533998);
				class572_sub15.readUnsignedShort(647518597);
			} else if (101 == i)
				anInt5649 = class572_sub15.readUnsignedByte(854510697) * -1280227029;
			else if (102 == i)
				anInt5623 = class572_sub15.readUnsignedShort(647518597) * -1897506333;
			else if (i == 103)
				anInt5680 = 0;
			else if (i == 104)
				anInt5668 = class572_sub15.readUnsignedByte(2090388243) * -1794811581;
			else if (105 == i)
				aBool5678 = true;
			else if (i == 106) {
				int i_36_ = class572_sub15.readUnsignedByte(1044300990);
				int i_37_ = 0;
				anIntArray5645 = new int[i_36_];
				anIntArray5635 = new int[i_36_];
				for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
					anIntArray5645[i_38_] = class572_sub15.readBigSmart((byte) 10);
					i_37_ += anIntArray5635[i_38_] = class572_sub15.readUnsignedByte(501174984);
				}
				for (int i_39_ = 0; i_39_ < i_36_; i_39_++)
					anIntArray5635[i_39_] = (anIntArray5635[i_39_] * 65535 / i_37_);
			} else if (i == 107)
				anInt5642 = class572_sub15.readUnsignedShort(647518597) * 463278105;
			else if (i >= 150 && i < 155) {
				aStringArray5640[i - 150] = class572_sub15.readString(1295706626).intern();
				if (!((Class518) aClass518_5608).aBool5754)
					aStringArray5640[i - 150] = null;
			} else if (160 == i) {
				int i_40_ = class572_sub15.readUnsignedByte(1482747492);
				anIntArray5631 = new int[i_40_];
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
					anIntArray5631[i_41_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 162) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readInt(1002805651) * 847763877;
			} else if (i == 163) {
				aByte5616 = class572_sub15.readByte(2034265382);
				aByte5681 = class572_sub15.readByte(405140143);
				aByte5622 = class572_sub15.readByte(747926055);
				aByte5666 = class572_sub15.readByte(948671211);
			} else if (i == 164)
				anInt5655 = class572_sub15.readShort(-710976385) * -595169085;
			else if (i == 165)
				anInt5673 = class572_sub15.readShort(-710976385) * -1895300649;
			else if (i == 166)
				anInt5657 = class572_sub15.readShort(-710976385) * 1722019511;
			else if (i == 167)
				anInt5661 = class572_sub15.readUnsignedShort(647518597) * -997094573;
			else if (168 != i && 169 != i) {
				if (i == 170)
					anInt5632 = class572_sub15.readUnsignedSmart(278840142) * -1611518913;
				else if (i == 171)
					anInt5664 = class572_sub15.readUnsignedSmart(1433745363) * -1873643089;
				else if (173 == i) {
					anInt5679 = class572_sub15.readUnsignedShort(647518597) * -719748883;
					anInt5610 = class572_sub15.readUnsignedShort(647518597) * 695569589;
				} else if (177 == i)
					aBool5667 = true;
				else if (i == 178)
					anInt5619 = class572_sub15.readUnsignedByte(584458904) * -1582597129;
				else if (i == 186)
					aClass512_5683 = ((Class512) Class455.method5387(Class70.method1078((byte) 73), class572_sub15.readUnsignedByte(451328302), -2144931931));
				else if (189 == i)
					aBool5682 = true;
				else if (i >= 190 && i < 196) {
					if (anIntArray5651 == null) {
						anIntArray5651 = new int[6];
						Arrays.fill(anIntArray5651, -1);
					}
					anIntArray5651[i - 190] = class572_sub15.readUnsignedShort(647518597);
				} else if (196 == i)
					Class455.method5387(Class567.method6721(-1954197384), class572_sub15.readUnsignedByte(905108059), -1874264473);
				else if (197 == i)
					Class455.method5387(Class57.method1000((byte) -90), class572_sub15.readUnsignedByte(61088174), -2049457415);
				else if (i != 198 && i != 199) {
					if (200 == i)
						aBool5636 = true;
					else if (i == 201) {
						aClass326_5684 = new Class326();
						aClass326_5684.aFloat4113 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4106 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4108 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4109 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4110 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4111 = (float) class572_sub15.readSmart(16777215);
					} else if (i == 249) {
						int i_42_ = class572_sub15.readUnsignedByte(1726600378);
						if (parameters == null) {
							int i_43_ = HashTable.nextPowerOfTwo(i_42_, 381692796);
							parameters = new Class676(i_43_);
						}
						for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
							boolean bool = class572_sub15.readUnsignedByte(2070926371) == 1;
							int i_45_ = class572_sub15.read24BitInt(1140925462);
							Class572 class572;
							if (bool)
								class572 = new LinkableObject(class572_sub15.readString(1295706626).intern());
							else
								class572 = (new LinkableInt(class572_sub15.readInt(21884454)));
							parameters.put(class572, (long) i_45_);
						}
					}
				}
			}
		}
	}

	void method6045(RSByteBuffer class572_sub15, int i) {
		if (1 == i) {
			int i_46_ = class572_sub15.readUnsignedByte(23847097);
			aByteArray5644 = new byte[i_46_];
			anIntArrayArray5611 = new int[i_46_][];
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
				aByteArray5644[i_47_] = class572_sub15.readByte(1872048798);
				int i_48_ = class572_sub15.readUnsignedByte(291614877);
				anIntArrayArray5611[i_47_] = new int[i_48_];
				for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
					anIntArrayArray5611[i_47_][i_49_] = class572_sub15.readBigSmart((byte) 59);
			}
		} else if (2 == i)
			name = class572_sub15.readString(1295706626).intern();
		else if (14 == i)
			sizeX = class572_sub15.readUnsignedByte(2096869887) * 1755098015;
		else if (15 == i)
			sizeY = class572_sub15.readUnsignedByte(1194677684) * -1692133213;
		else if (17 == i)
			anInt5626 = 0;
		else if (i != 18) {
			if (19 == i)
				anInt5627 = class572_sub15.readUnsignedByte(910010429) * -1342119497;
			else if (21 == i)
				aByte5628 = (byte) 1;
			else if (i == 22)
				aBool5630 = true;
			else if (i == 23)
				anInt5680 = -132827261;
			else if (i == 24) {
				int i_50_ = class572_sub15.readBigSmart((byte) 54);
				if (i_50_ != -1)
					anIntArray5645 = new int[] { i_50_ };
			} else if (i == 27)
				anInt5626 = -2059086905;
			else if (i == 28)
				anInt5637 = ((class572_sub15.readUnsignedByte(1154901369) << 2) * 1239286817);
			else if (i == 29)
				anInt5638 = class572_sub15.readByte(449994262) * -1366763105;
			else if (i == 39)
				anInt5639 = class572_sub15.readByte(2006747203) * 48188655;
			else if (i >= 30 && i < 35)
				aStringArray5640[i - 30] = class572_sub15.readString(1295706626).intern();
			else if (40 == i) {
				int i_51_ = class572_sub15.readUnsignedByte(1973150311);
				aShortArray5613 = new short[i_51_];
				aShortArray5621 = new short[i_51_];
				for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
					aShortArray5613[i_52_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5621[i_52_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (i == 41) {
				int i_53_ = class572_sub15.readUnsignedByte(1863024444);
				aShortArray5618 = new short[i_53_];
				aShortArray5617 = new short[i_53_];
				for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
					aShortArray5618[i_54_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5617[i_54_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (42 == i) {
				int i_55_ = class572_sub15.readUnsignedByte(1290991943);
				aByteArray5615 = new byte[i_55_];
				for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
					aByteArray5615[i_56_] = class572_sub15.readByte(1155398255);
			} else if (44 == i) {
				int i_57_ = class572_sub15.readUnsignedShort(647518597);
				int i_58_ = 0;
				for (int i_59_ = i_57_; i_59_ > 0; i_59_ >>= 1)
					i_58_++;
				aByteArray5612 = new byte[i_58_];
				byte i_60_ = 0;
				for (int i_61_ = 0; i_61_ < i_58_; i_61_++) {
					if ((i_57_ & 1 << i_61_) > 0) {
						aByteArray5612[i_61_] = i_60_;
						i_60_++;
					} else
						aByteArray5612[i_61_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_62_ = class572_sub15.readUnsignedShort(647518597);
				int i_63_ = 0;
				for (int i_64_ = i_62_; i_64_ > 0; i_64_ >>= 1)
					i_63_++;
				aByteArray5650 = new byte[i_63_];
				byte i_65_ = 0;
				for (int i_66_ = 0; i_66_ < i_63_; i_66_++) {
					if ((i_62_ & 1 << i_66_) > 0) {
						aByteArray5650[i_66_] = i_65_;
						i_65_++;
					} else
						aByteArray5650[i_66_] = (byte) -1;
				}
			} else if (i == 62)
				aBool5647 = true;
			else if (64 == i)
				aBool5648 = false;
			else if (i == 65)
				anInt5646 = class572_sub15.readUnsignedShort(647518597) * -1447430701;
			else if (66 == i)
				anInt5634 = class572_sub15.readUnsignedShort(647518597) * -1617532341;
			else if (i == 67)
				anInt5641 = class572_sub15.readUnsignedShort(647518597) * -1984944005;
			else if (i == 69)
				class572_sub15.readUnsignedByte(955107413);
			else if (70 == i)
				anInt5652 = ((class572_sub15.readShort(-710976385) << 2) * -125233473);
			else if (i == 71)
				anInt5653 = ((class572_sub15.readShort(-710976385) << 2) * 1801330487);
			else if (i == 72)
				anInt5654 = (class572_sub15.readShort(-710976385) << 2) * 160437821;
			else if (i == 73)
				aBool5658 = true;
			else if (i == 74)
				aBool5659 = true;
			else if (75 == i)
				anInt5660 = class572_sub15.readUnsignedByte(626810543) * 2000837393;
			else if (i == 77 || i == 92) {
				anInt5663 = class572_sub15.readUnsignedShort(647518597) * 1826386259;
				if (anInt5663 * 742456027 == 65535)
					anInt5663 = -1826386259;
				anInt5669 = class572_sub15.readUnsignedShort(647518597) * 1520719743;
				if (2039703679 * anInt5669 == 65535)
					anInt5669 = -1520719743;
				int i_67_ = -1;
				if (i == 92)
					i_67_ = class572_sub15.readBigSmart((byte) 109);
				int i_68_ = class572_sub15.readUnsignedByte(1308128178);
				anIntArray5605 = new int[i_68_ + 2];
				for (int i_69_ = 0; i_69_ <= i_68_; i_69_++)
					anIntArray5605[i_69_] = class572_sub15.readBigSmart((byte) 116);
				anIntArray5605[i_68_ + 1] = i_67_;
			} else if (i == 78) {
				anInt5665 = class572_sub15.readUnsignedShort(647518597) * 785693061;
				anInt5656 = class572_sub15.readUnsignedByte(-50220077) * 1515773199;
			} else if (79 == i) {
				anInt5620 = class572_sub15.readUnsignedShort(647518597) * -230294397;
				anInt5670 = class572_sub15.readUnsignedShort(647518597) * 135699349;
				anInt5656 = class572_sub15.readUnsignedByte(1990427740) * 1515773199;
				int i_70_ = class572_sub15.readUnsignedByte(743489596);
				anIntArray5671 = new int[i_70_];
				for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
					anIntArray5671[i_71_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 81) {
				aByte5628 = (byte) 2;
				anInt5629 = class572_sub15.readUnsignedByte(1083820927) * -2015779584;
			} else if (i == 82)
				aBool5633 = true;
			else if (88 == i)
				aBool5674 = false;
			else if (89 == i)
				aBool5672 = false;
			else if (91 == i)
				aBool5675 = true;
			else if (93 == i) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readUnsignedShort(647518597) * 847763877;
			} else if (i == 94)
				aByte5628 = (byte) 4;
			else if (95 == i) {
				aByte5628 = (byte) 5;
				anInt5629 = class572_sub15.readShort(-710976385) * 847763877;
			} else if (97 == i)
				aBool5662 = true;
			else if (i == 98)
				aBool5677 = true;
			else if (99 == i || 100 == i) {
				class572_sub15.readUnsignedByte(311843443);
				class572_sub15.readUnsignedShort(647518597);
			} else if (101 == i)
				anInt5649 = class572_sub15.readUnsignedByte(392622961) * -1280227029;
			else if (102 == i)
				anInt5623 = class572_sub15.readUnsignedShort(647518597) * -1897506333;
			else if (i == 103)
				anInt5680 = 0;
			else if (i == 104)
				anInt5668 = class572_sub15.readUnsignedByte(1400632564) * -1794811581;
			else if (105 == i)
				aBool5678 = true;
			else if (i == 106) {
				int i_72_ = class572_sub15.readUnsignedByte(261485630);
				int i_73_ = 0;
				anIntArray5645 = new int[i_72_];
				anIntArray5635 = new int[i_72_];
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					anIntArray5645[i_74_] = class572_sub15.readBigSmart((byte) 28);
					i_73_ += anIntArray5635[i_74_] = class572_sub15.readUnsignedByte(902545041);
				}
				for (int i_75_ = 0; i_75_ < i_72_; i_75_++)
					anIntArray5635[i_75_] = (anIntArray5635[i_75_] * 65535 / i_73_);
			} else if (i == 107)
				anInt5642 = class572_sub15.readUnsignedShort(647518597) * 463278105;
			else if (i >= 150 && i < 155) {
				aStringArray5640[i - 150] = class572_sub15.readString(1295706626).intern();
				if (!((Class518) aClass518_5608).aBool5754)
					aStringArray5640[i - 150] = null;
			} else if (160 == i) {
				int i_76_ = class572_sub15.readUnsignedByte(1630564984);
				anIntArray5631 = new int[i_76_];
				for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
					anIntArray5631[i_77_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 162) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readInt(1645703067) * 847763877;
			} else if (i == 163) {
				aByte5616 = class572_sub15.readByte(1024585238);
				aByte5681 = class572_sub15.readByte(2059256036);
				aByte5622 = class572_sub15.readByte(1858230733);
				aByte5666 = class572_sub15.readByte(1710254640);
			} else if (i == 164)
				anInt5655 = class572_sub15.readShort(-710976385) * -595169085;
			else if (i == 165)
				anInt5673 = class572_sub15.readShort(-710976385) * -1895300649;
			else if (i == 166)
				anInt5657 = class572_sub15.readShort(-710976385) * 1722019511;
			else if (i == 167)
				anInt5661 = class572_sub15.readUnsignedShort(647518597) * -997094573;
			else if (168 != i && 169 != i) {
				if (i == 170)
					anInt5632 = class572_sub15.readUnsignedSmart(-529518147) * -1611518913;
				else if (i == 171)
					anInt5664 = class572_sub15.readUnsignedSmart(-142202716) * -1873643089;
				else if (173 == i) {
					anInt5679 = class572_sub15.readUnsignedShort(647518597) * -719748883;
					anInt5610 = class572_sub15.readUnsignedShort(647518597) * 695569589;
				} else if (177 == i)
					aBool5667 = true;
				else if (i == 178)
					anInt5619 = class572_sub15.readUnsignedByte(1532487779) * -1582597129;
				else if (i == 186)
					aClass512_5683 = ((Class512) Class455.method5387(Class70.method1078((byte) 53), class572_sub15.readUnsignedByte(1156499868), -1941281703));
				else if (189 == i)
					aBool5682 = true;
				else if (i >= 190 && i < 196) {
					if (anIntArray5651 == null) {
						anIntArray5651 = new int[6];
						Arrays.fill(anIntArray5651, -1);
					}
					anIntArray5651[i - 190] = class572_sub15.readUnsignedShort(647518597);
				} else if (196 == i)
					Class455.method5387(Class567.method6721(-1954197384), class572_sub15.readUnsignedByte(1082313716), -1983994209);
				else if (197 == i)
					Class455.method5387(Class57.method1000((byte) -68), class572_sub15.readUnsignedByte(896666529), -2068135761);
				else if (i != 198 && i != 199) {
					if (200 == i)
						aBool5636 = true;
					else if (i == 201) {
						aClass326_5684 = new Class326();
						aClass326_5684.aFloat4113 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4106 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4108 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4109 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4110 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4111 = (float) class572_sub15.readSmart(16777215);
					} else if (i == 249) {
						int i_78_ = class572_sub15.readUnsignedByte(2125533908);
						if (parameters == null) {
							int i_79_ = HashTable.nextPowerOfTwo(i_78_, 739413861);
							parameters = new Class676(i_79_);
						}
						for (int i_80_ = 0; i_80_ < i_78_; i_80_++) {
							boolean isString = class572_sub15.readUnsignedByte(569260114) == 1;
							int size = class572_sub15.read24BitInt(1140925462);
							Class572 class572;
							if (isString)
								class572 = new LinkableObject(class572_sub15.readString(1295706626).intern());
							else
								class572 = (new LinkableInt(class572_sub15.readInt(816777642)));
							parameters.put(class572, (long) size);
						}
					}
				}
			}
		}
	}

	public String method6046(int i, String string, int i_82_) {
		if (parameters == null)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) parameters.get((long) i));
		if (null == class572_sub9)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public final ObjectDefinitions method6047(Interface15 interface15, Interface13 interface13, int i) {
		int i_83_ = -1;
		if (-1 != anInt5663 * 742456027) {
			VarBitDefinition class429 = interface15.method95(742456027 * anInt5663, 819446449);
			if (null != class429)
				i_83_ = interface13.method72(class429, -100275540);
		} else if (anInt5669 * 2039703679 != -1) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, (anInt5669 * 2039703679), (byte) 33);
			if (class179 != null)
				i_83_ = interface13.method73(class179, -1662396513);
		}
		if (i_83_ < 0 || i_83_ >= anIntArray5605.length - 1) {
			int i_84_ = anIntArray5605[anIntArray5605.length - 1];
			if (i_84_ != -1)
				return (ObjectDefinitions) anInterface18_5609.getDefinition(i_84_, -379447016);
			return null;
		}
		if (anIntArray5605[i_83_] == -1)
			return null;
		return (ObjectDefinitions) anInterface18_5609.getDefinition(anIntArray5605[i_83_], 1113256593);
	}

	public int method6048(int i, int i_85_, byte i_86_) {
		if (null == parameters)
			return i_85_;
		LinkableInt class572_sub26 = ((LinkableInt) parameters.get((long) i));
		if (class572_sub26 == null)
			return i_85_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(119011236);
			if (i == 0)
				break;
			method6044(class572_sub15, i, (byte) 118);
		}
	}

	public boolean method6049(int i) {
		if (anIntArray5605 == null)
			return -1 != anInt5665 * 412637005 || null != anIntArray5671;
		for (int i_87_ = 0; i_87_ < anIntArray5605.length; i_87_++) {
			if (-1 != anIntArray5605[i_87_]) {
				ObjectDefinitions class509_88_ = ((ObjectDefinitions) anInterface18_5609.getDefinition(anIntArray5605[i_87_], -264670105));
				if (class509_88_.anInt5665 * 412637005 != -1 || class509_88_.anIntArray5671 != null)
					return true;
			}
		}
		return false;
	}

	public boolean method6050(int i) {
		return anIntArray5645 != null;
	}

	public int method6051() {
		if (anIntArray5645 != null) {
			if (anIntArray5645.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_89_ = 0; i_89_ < anIntArray5645.length; i_89_++) {
					if (i <= anIntArray5635[i_89_])
						return anIntArray5645[i_89_];
					i -= anIntArray5635[i_89_];
				}
			} else
				return anIntArray5645[0];
		}
		return -1;
	}

	public int method6052(byte i) {
		if (anIntArray5645 != null) {
			if (anIntArray5645.length > 1) {
				int i_90_ = (int) (Math.random() * 65535.0);
				for (int i_91_ = 0; i_91_ < anIntArray5645.length; i_91_++) {
					if (i_90_ <= anIntArray5635[i_91_])
						return anIntArray5645[i_91_];
					i_90_ -= anIntArray5635[i_91_];
				}
			} else
				return anIntArray5645[0];
		}
		return -1;
	}

	public int[] method6053(byte i) {
		return anIntArray5645;
	}

	void method6054(RSByteBuffer class572_sub15, int i) {
		if (1 == i) {
			int i_92_ = class572_sub15.readUnsignedByte(339114072);
			aByteArray5644 = new byte[i_92_];
			anIntArrayArray5611 = new int[i_92_][];
			for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
				aByteArray5644[i_93_] = class572_sub15.readByte(390542996);
				int i_94_ = class572_sub15.readUnsignedByte(1119253958);
				anIntArrayArray5611[i_93_] = new int[i_94_];
				for (int i_95_ = 0; i_95_ < i_94_; i_95_++)
					anIntArrayArray5611[i_93_][i_95_] = class572_sub15.readBigSmart((byte) 53);
			}
		} else if (2 == i)
			name = class572_sub15.readString(1295706626).intern();
		else if (14 == i)
			sizeX = class572_sub15.readUnsignedByte(294312385) * 1755098015;
		else if (15 == i)
			sizeY = class572_sub15.readUnsignedByte(469199942) * -1692133213;
		else if (17 == i)
			anInt5626 = 0;
		else if (i != 18) {
			if (19 == i)
				anInt5627 = class572_sub15.readUnsignedByte(1808192899) * -1342119497;
			else if (21 == i)
				aByte5628 = (byte) 1;
			else if (i == 22)
				aBool5630 = true;
			else if (i == 23)
				anInt5680 = -132827261;
			else if (i == 24) {
				int i_96_ = class572_sub15.readBigSmart((byte) 48);
				if (i_96_ != -1)
					anIntArray5645 = new int[] { i_96_ };
			} else if (i == 27)
				anInt5626 = -2059086905;
			else if (i == 28)
				anInt5637 = ((class572_sub15.readUnsignedByte(1268156990) << 2) * 1239286817);
			else if (i == 29)
				anInt5638 = class572_sub15.readByte(1832461455) * -1366763105;
			else if (i == 39)
				anInt5639 = class572_sub15.readByte(9885950) * 48188655;
			else if (i >= 30 && i < 35)
				aStringArray5640[i - 30] = class572_sub15.readString(1295706626).intern();
			else if (40 == i) {
				int i_97_ = class572_sub15.readUnsignedByte(1505693440);
				aShortArray5613 = new short[i_97_];
				aShortArray5621 = new short[i_97_];
				for (int i_98_ = 0; i_98_ < i_97_; i_98_++) {
					aShortArray5613[i_98_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5621[i_98_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (i == 41) {
				int i_99_ = class572_sub15.readUnsignedByte(375904316);
				aShortArray5618 = new short[i_99_];
				aShortArray5617 = new short[i_99_];
				for (int i_100_ = 0; i_100_ < i_99_; i_100_++) {
					aShortArray5618[i_100_] = (short) class572_sub15.readUnsignedShort(647518597);
					aShortArray5617[i_100_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (42 == i) {
				int i_101_ = class572_sub15.readUnsignedByte(1401020164);
				aByteArray5615 = new byte[i_101_];
				for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
					aByteArray5615[i_102_] = class572_sub15.readByte(2008820595);
			} else if (44 == i) {
				int i_103_ = class572_sub15.readUnsignedShort(647518597);
				int i_104_ = 0;
				for (int i_105_ = i_103_; i_105_ > 0; i_105_ >>= 1)
					i_104_++;
				aByteArray5612 = new byte[i_104_];
				byte i_106_ = 0;
				for (int i_107_ = 0; i_107_ < i_104_; i_107_++) {
					if ((i_103_ & 1 << i_107_) > 0) {
						aByteArray5612[i_107_] = i_106_;
						i_106_++;
					} else
						aByteArray5612[i_107_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_108_ = class572_sub15.readUnsignedShort(647518597);
				int i_109_ = 0;
				for (int i_110_ = i_108_; i_110_ > 0; i_110_ >>= 1)
					i_109_++;
				aByteArray5650 = new byte[i_109_];
				byte i_111_ = 0;
				for (int i_112_ = 0; i_112_ < i_109_; i_112_++) {
					if ((i_108_ & 1 << i_112_) > 0) {
						aByteArray5650[i_112_] = i_111_;
						i_111_++;
					} else
						aByteArray5650[i_112_] = (byte) -1;
				}
			} else if (i == 62)
				aBool5647 = true;
			else if (64 == i)
				aBool5648 = false;
			else if (i == 65)
				anInt5646 = class572_sub15.readUnsignedShort(647518597) * -1447430701;
			else if (66 == i)
				anInt5634 = class572_sub15.readUnsignedShort(647518597) * -1617532341;
			else if (i == 67)
				anInt5641 = class572_sub15.readUnsignedShort(647518597) * -1984944005;
			else if (i == 69)
				class572_sub15.readUnsignedByte(57422429);
			else if (70 == i)
				anInt5652 = ((class572_sub15.readShort(-710976385) << 2) * -125233473);
			else if (i == 71)
				anInt5653 = ((class572_sub15.readShort(-710976385) << 2) * 1801330487);
			else if (i == 72)
				anInt5654 = (class572_sub15.readShort(-710976385) << 2) * 160437821;
			else if (i == 73)
				aBool5658 = true;
			else if (i == 74)
				aBool5659 = true;
			else if (75 == i)
				anInt5660 = class572_sub15.readUnsignedByte(755954518) * 2000837393;
			else if (i == 77 || i == 92) {
				anInt5663 = class572_sub15.readUnsignedShort(647518597) * 1826386259;
				if (anInt5663 * 742456027 == 65535)
					anInt5663 = -1826386259;
				anInt5669 = class572_sub15.readUnsignedShort(647518597) * 1520719743;
				if (2039703679 * anInt5669 == 65535)
					anInt5669 = -1520719743;
				int i_113_ = -1;
				if (i == 92)
					i_113_ = class572_sub15.readBigSmart((byte) 127);
				int i_114_ = class572_sub15.readUnsignedByte(1241916514);
				anIntArray5605 = new int[i_114_ + 2];
				for (int i_115_ = 0; i_115_ <= i_114_; i_115_++)
					anIntArray5605[i_115_] = class572_sub15.readBigSmart((byte) 85);
				anIntArray5605[i_114_ + 1] = i_113_;
			} else if (i == 78) {
				anInt5665 = class572_sub15.readUnsignedShort(647518597) * 785693061;
				anInt5656 = class572_sub15.readUnsignedByte(716273700) * 1515773199;
			} else if (79 == i) {
				anInt5620 = class572_sub15.readUnsignedShort(647518597) * -230294397;
				anInt5670 = class572_sub15.readUnsignedShort(647518597) * 135699349;
				anInt5656 = class572_sub15.readUnsignedByte(1695501818) * 1515773199;
				int i_116_ = class572_sub15.readUnsignedByte(615793463);
				anIntArray5671 = new int[i_116_];
				for (int i_117_ = 0; i_117_ < i_116_; i_117_++)
					anIntArray5671[i_117_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 81) {
				aByte5628 = (byte) 2;
				anInt5629 = class572_sub15.readUnsignedByte(1720930006) * -2015779584;
			} else if (i == 82)
				aBool5633 = true;
			else if (88 == i)
				aBool5674 = false;
			else if (89 == i)
				aBool5672 = false;
			else if (91 == i)
				aBool5675 = true;
			else if (93 == i) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readUnsignedShort(647518597) * 847763877;
			} else if (i == 94)
				aByte5628 = (byte) 4;
			else if (95 == i) {
				aByte5628 = (byte) 5;
				anInt5629 = class572_sub15.readShort(-710976385) * 847763877;
			} else if (97 == i)
				aBool5662 = true;
			else if (i == 98)
				aBool5677 = true;
			else if (99 == i || 100 == i) {
				class572_sub15.readUnsignedByte(1360415855);
				class572_sub15.readUnsignedShort(647518597);
			} else if (101 == i)
				anInt5649 = class572_sub15.readUnsignedByte(749238532) * -1280227029;
			else if (102 == i)
				anInt5623 = class572_sub15.readUnsignedShort(647518597) * -1897506333;
			else if (i == 103)
				anInt5680 = 0;
			else if (i == 104)
				anInt5668 = class572_sub15.readUnsignedByte(408242142) * -1794811581;
			else if (105 == i)
				aBool5678 = true;
			else if (i == 106) {
				int i_118_ = class572_sub15.readUnsignedByte(684394962);
				int i_119_ = 0;
				anIntArray5645 = new int[i_118_];
				anIntArray5635 = new int[i_118_];
				for (int i_120_ = 0; i_120_ < i_118_; i_120_++) {
					anIntArray5645[i_120_] = class572_sub15.readBigSmart((byte) 87);
					i_119_ += anIntArray5635[i_120_] = class572_sub15.readUnsignedByte(2090897977);
				}
				for (int i_121_ = 0; i_121_ < i_118_; i_121_++)
					anIntArray5635[i_121_] = (anIntArray5635[i_121_] * 65535 / i_119_);
			} else if (i == 107)
				anInt5642 = class572_sub15.readUnsignedShort(647518597) * 463278105;
			else if (i >= 150 && i < 155) {
				aStringArray5640[i - 150] = class572_sub15.readString(1295706626).intern();
				if (!((Class518) aClass518_5608).aBool5754)
					aStringArray5640[i - 150] = null;
			} else if (160 == i) {
				int i_122_ = class572_sub15.readUnsignedByte(713628763);
				anIntArray5631 = new int[i_122_];
				for (int i_123_ = 0; i_123_ < i_122_; i_123_++)
					anIntArray5631[i_123_] = class572_sub15.readUnsignedShort(647518597);
			} else if (i == 162) {
				aByte5628 = (byte) 3;
				anInt5629 = class572_sub15.readInt(-132074736) * 847763877;
			} else if (i == 163) {
				aByte5616 = class572_sub15.readByte(406693383);
				aByte5681 = class572_sub15.readByte(238399376);
				aByte5622 = class572_sub15.readByte(2050511568);
				aByte5666 = class572_sub15.readByte(1828539969);
			} else if (i == 164)
				anInt5655 = class572_sub15.readShort(-710976385) * -595169085;
			else if (i == 165)
				anInt5673 = class572_sub15.readShort(-710976385) * -1895300649;
			else if (i == 166)
				anInt5657 = class572_sub15.readShort(-710976385) * 1722019511;
			else if (i == 167)
				anInt5661 = class572_sub15.readUnsignedShort(647518597) * -997094573;
			else if (168 != i && 169 != i) {
				if (i == 170)
					anInt5632 = class572_sub15.readUnsignedSmart(581056259) * -1611518913;
				else if (i == 171)
					anInt5664 = class572_sub15.readUnsignedSmart(-182618955) * -1873643089;
				else if (173 == i) {
					anInt5679 = class572_sub15.readUnsignedShort(647518597) * -719748883;
					anInt5610 = class572_sub15.readUnsignedShort(647518597) * 695569589;
				} else if (177 == i)
					aBool5667 = true;
				else if (i == 178)
					anInt5619 = class572_sub15.readUnsignedByte(2076298289) * -1582597129;
				else if (i == 186)
					aClass512_5683 = ((Class512) Class455.method5387(Class70.method1078((byte) 126), class572_sub15.readUnsignedByte(502253577), -2010074755));
				else if (189 == i)
					aBool5682 = true;
				else if (i >= 190 && i < 196) {
					if (anIntArray5651 == null) {
						anIntArray5651 = new int[6];
						Arrays.fill(anIntArray5651, -1);
					}
					anIntArray5651[i - 190] = class572_sub15.readUnsignedShort(647518597);
				} else if (196 == i)
					Class455.method5387(Class567.method6721(-1954197384), class572_sub15.readUnsignedByte(734371718), -1961556725);
				else if (197 == i)
					Class455.method5387(Class57.method1000((byte) -113), class572_sub15.readUnsignedByte(1302844762), -1925009363);
				else if (i != 198 && i != 199) {
					if (200 == i)
						aBool5636 = true;
					else if (i == 201) {
						aClass326_5684 = new Class326();
						aClass326_5684.aFloat4113 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4106 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4108 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4109 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4110 = (float) class572_sub15.readSmart(16777215);
						aClass326_5684.aFloat4111 = (float) class572_sub15.readSmart(16777215);
					} else if (i == 249) {
						int i_124_ = class572_sub15.readUnsignedByte(1641849845);
						if (parameters == null) {
							int i_125_ = HashTable.nextPowerOfTwo(i_124_, 414520581);
							parameters = new Class676(i_125_);
						}
						for (int i_126_ = 0; i_126_ < i_124_; i_126_++) {
							boolean bool = class572_sub15.readUnsignedByte(961705461) == 1;
							int i_127_ = class572_sub15.read24BitInt(1140925462);
							Class572 class572;
							if (bool)
								class572 = new LinkableObject(class572_sub15.readString(1295706626).intern());
							else
								class572 = (new LinkableInt(class572_sub15.readInt(837860998)));
							parameters.put(class572, (long) i_127_);
						}
					}
				}
			}
		}
	}

	public int method6055(int i, int i_128_) {
		if (null == anIntArray5651)
			return -1;
		return anIntArray5651[i];
	}

	public boolean method6056() {
		return (anIntArray5645 != null && anIntArray5645.length > 1);
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1809370616);
			if (i == 0)
				break;
			method6044(class572_sub15, i, (byte) 39);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(366874909);
			if (i == 0)
				break;
			method6044(class572_sub15, i, (byte) 44);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(6360610);
			if (i == 0)
				break;
			method6044(class572_sub15, i, (byte) 72);
		}
	}

	public void method112() {
		method6058((byte) -44);
		if (aBool5659)
			anInt5626 = 0;
		if (!((Class518) aClass518_5608).aBool5754 && aBool5675) {
			aStringArray5640 = null;
			anIntArray5631 = null;
		}
	}

	public final synchronized Class647 method6057(Class106 class106, int i, int i_129_, int i_130_, Class174 class174, Class174 class174_131_, int i_132_, int i_133_, int i_134_, boolean bool, Class508 class508, int i_135_) {
		if (Class537.method6383(i_129_, -293580697))
			i_129_ = 1870735441 * Class516.aClass516_5723.anInt5742;
		long l = (long) ((i_129_ << 3) + (-131590913 * anInt5607 << 10) + i_130_);
		l |= (long) (1862175997 * class106.anInt1416 << 29);
		if (class508 != null)
			l |= ((Class508) class508).aLong5601 * 154464788768081199L << 32;
		int i_136_ = i;
		if (aByte5628 == 3)
			i_136_ |= 0x7;
		else {
			if (0 != aByte5628 || 0 != -1496350233 * anInt5673)
				i_136_ |= 0x2;
			if (1281867755 * anInt5655 != 0)
				i_136_ |= 0x1;
			if (-2114564345 * anInt5657 != 0)
				i_136_ |= 0x4;
		}
		if (bool)
			i_136_ |= 0x40000;
		boolean bool_137_ = (aByte5628 != 0 && (null != class174 || null != class174_131_));
		boolean bool_138_ = (anInt5655 * 1281867755 != 0 || anInt5673 * -1496350233 != 0 || anInt5657 * -2114564345 != 0);
		Class647 class647;
		synchronized (((Class518) aClass518_5608).aClass127_5749) {
			class647 = (Class647) ((Class518) aClass518_5608).aClass127_5749.method2246(l);
		}
		Model model = (Model) (null != class647 ? class647.anObject8324 : null);
		Class572_Sub12_Sub18 class572_sub12_sub18 = null;
		if (model == null || class106.method1756(model.method1353(), i_136_) != 0) {
			if (null != model)
				i_136_ = class106.method1798(i_136_, model.method1353());
			int i_139_ = i_136_;
			if (Class516.aClass516_5739.anInt5742 * 1870735441 == i_129_ && i_130_ > 3)
				i_139_ |= 0x5;
			model = method6063(class106, i_139_, i_129_, i_130_, class508, (byte) 32);
			if (null == model)
				return null;
			if (1870735441 * Class516.aClass516_5739.anInt5742 == i_129_ && i_130_ > 3)
				model.method1355(2048);
			if (bool && !bool_137_ && !bool_138_)
				class572_sub12_sub18 = model.method1398(null);
			model.method1450(i_136_);
			class647 = new Class647(model, class572_sub12_sub18);
			synchronized (((Class518) aClass518_5608).aClass127_5749) {
				((Class518) aClass518_5608).aClass127_5749.method2229(class647, l);
			}
		} else {
			class572_sub12_sub18 = (Class572_Sub12_Sub18) class647.anObject8325;
			if (bool && class572_sub12_sub18 == null && !bool_137_ && !bool_138_)
				class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647.anObject8325 = model.method1398(null));
		}
		if (bool_137_ || bool_138_) {
			model = model.method1351((byte) 0, i_136_, true);
			if (bool_137_)
				model.method1463(aByte5628, anInt5629 * -1793366483, class174, class174_131_, i_132_, i_133_, i_134_);
			if (bool_138_)
				model.method1358(anInt5655 * 1281867755, anInt5673 * -1496350233, -2114564345 * anInt5657);
			if (bool)
				class572_sub12_sub18 = model.method1398(null);
			model.method1450(i);
		} else
			model = model.method1351((byte) 0, i, true);
		((Class518) aClass518_5608).aClass647_5747.anObject8324 = model;
		((Class518) aClass518_5608).aClass647_5747.anObject8325 = class572_sub12_sub18;
		return ((Class518) aClass518_5608).aClass647_5747;
	}

	public void method106() {
		method6058((byte) -77);
		if (aBool5659)
			anInt5626 = 0;
		if (!((Class518) aClass518_5608).aBool5754 && aBool5675) {
			aStringArray5640 = null;
			anIntArray5631 = null;
		}
	}

	void method6058(byte i) {
		if (-1 == anInt5627 * -1262171129) {
			anInt5627 = 0;
			if (aByteArray5644 != null && aByteArray5644.length == 1 && (1870735441 * Class516.aClass516_5739.anInt5742 == aByteArray5644[0]))
				anInt5627 = -1342119497;
			for (int i_140_ = 0; i_140_ < 5; i_140_++) {
				if (aStringArray5640[i_140_] != null) {
					anInt5627 = -1342119497;
					break;
				}
			}
		}
		if (-648940047 * anInt5660 == -1)
			anInt5660 = 2000837393 * (anInt5626 * -665518601 != 0 ? 1 : 0);
		if (method6050(521457555) || aBool5677 || null != anIntArray5605)
			aBool5667 = true;
	}

	public void method110() {
		method6058((byte) -103);
		if (aBool5659)
			anInt5626 = 0;
		if (!((Class518) aClass518_5608).aBool5754 && aBool5675) {
			aStringArray5640 = null;
			anIntArray5631 = null;
		}
	}

	void method6059() {
		if (-1 == anInt5627 * -1262171129) {
			anInt5627 = 0;
			if (aByteArray5644 != null && aByteArray5644.length == 1 && (1870735441 * Class516.aClass516_5739.anInt5742 == aByteArray5644[0]))
				anInt5627 = -1342119497;
			for (int i = 0; i < 5; i++) {
				if (aStringArray5640[i] != null) {
					anInt5627 = -1342119497;
					break;
				}
			}
		}
		if (-648940047 * anInt5660 == -1)
			anInt5660 = 2000837393 * (anInt5626 * -665518601 != 0 ? 1 : 0);
		if (method6050(1959813001) || aBool5677 || null != anIntArray5605)
			aBool5667 = true;
	}

	public final boolean method6060(int i) {
		if (anIntArrayArray5611 == null)
			return true;
		boolean bool = true;
		for (int i_141_ = 0; i_141_ < aByteArray5644.length; i_141_++) {
			if (aByteArray5644[i_141_] == i) {
				for (int i_142_ = 0; (i_142_ < anIntArrayArray5611[i_141_].length); i_142_++) {
					if (!aClass518_5608.method6133((anIntArrayArray5611[i_141_][i_142_]), (short) 26201))
						bool = false;
				}
			}
		}
		return bool;
	}

	ObjectDefinitions(int i, Class518 class518, Interface18 interface18) {
		sizeX = 1755098015;
		sizeY = -1692133213;
		anInt5626 = 176793486;
		anInt5627 = 1342119497;
		aByte5628 = (byte) 0;
		anInt5629 = -847763877;
		aBool5630 = false;
		anInt5680 = 132827261;
		anInt5632 = -869929920;
		anInt5664 = 0;
		anIntArray5645 = null;
		anIntArray5635 = null;
		aBool5636 = false;
		anInt5637 = 2004944960;
		anInt5638 = 0;
		anInt5639 = 0;
		anInt5642 = -463278105;
		anInt5623 = 1897506333;
		aBool5662 = false;
		anInt5649 = 0;
		aBool5678 = false;
		aBool5647 = false;
		aBool5648 = true;
		anInt5646 = -587536000;
		anInt5634 = -885709440;
		anInt5641 = -669762176;
		anInt5652 = 0;
		anInt5653 = 0;
		anInt5654 = 0;
		anInt5655 = 0;
		anInt5673 = 0;
		anInt5657 = 0;
		aBool5658 = false;
		aBool5659 = false;
		anInt5660 = -2000837393;
		anInt5661 = 0;
		anInt5663 = -1826386259;
		anInt5669 = -1520719743;
		anInt5665 = -785693061;
		anInt5656 = 0;
		anInt5619 = 0;
		anInt5668 = 1884547517;
		anInt5620 = 0;
		anInt5670 = 0;
		aBool5672 = true;
		aBool5633 = false;
		aBool5674 = true;
		aBool5675 = false;
		aBool5677 = false;
		anInt5679 = 427879680;
		anInt5610 = 1972155648;
		aBool5667 = false;
		aBool5682 = false;
		aClass512_5683 = Class512.aClass512_5700;
		anInt5607 = 1226763007 * i;
		aClass518_5608 = class518;
		anInterface18_5609 = interface18;
		aStringArray5640 = (String[]) ((Class518) aClass518_5608).aStringArray5752.clone();
	}

	public final synchronized Model method6061(Class106 class106, int i, int i_143_, int i_144_, Class174 class174, Class174 class174_145_, int i_146_, int i_147_, int i_148_, Class663 class663, Class508 class508, int i_149_) {
		if (Class537.method6383(i_143_, -463377428))
			i_143_ = 1870735441 * Class516.aClass516_5723.anInt5742;
		long l = (long) (i_144_ + ((i_143_ << 3) + (anInt5607 * -131590913 << 10)));
		int i_150_ = i;
		l |= (long) (1862175997 * class106.anInt1416 << 29);
		if (null != class508)
			l |= 154464788768081199L * ((Class508) class508).aLong5601 << 32;
		if (null != class663)
			i |= class663.method7794(267631831);
		if (aByte5628 == 3)
			i |= 0x7;
		else {
			if (aByte5628 != 0 || -1496350233 * anInt5673 != 0)
				i |= 0x2;
			if (0 != anInt5655 * 1281867755)
				i |= 0x1;
			if (0 != -2114564345 * anInt5657)
				i |= 0x4;
		}
		if (i_143_ == Class516.aClass516_5739.anInt5742 * 1870735441 && i_144_ > 3)
			i |= 0x5;
		Model model;
		synchronized (((Class518) aClass518_5608).aClass127_5750) {
			model = (Model) ((Class518) aClass518_5608).aClass127_5750.method2246(l);
		}
		if (model == null || class106.method1756(model.method1353(), i) != 0) {
			if (null != model)
				i = class106.method1798(i, model.method1353());
			model = method6063(class106, i, i_143_, i_144_, class508, (byte) -97);
			if (model == null)
				return null;
			synchronized (((Class518) aClass518_5608).aClass127_5750) {
				((Class518) aClass518_5608).aClass127_5750.method2229(model, l);
			}
		}
		boolean bool = false;
		if (class663 != null) {
			model = model.method1351((byte) 1, i, true);
			bool = true;
			class663.method7797(model, i_144_ & 0x3, (byte) -117);
		}
		if (Class516.aClass516_5739.anInt5742 * 1870735441 == i_143_ && i_144_ > 3) {
			if (!bool) {
				model = model.method1351((byte) 3, i, true);
				bool = true;
			}
			model.method1355(2048);
		}
		if (aByte5628 != 0) {
			if (!bool) {
				model = model.method1351((byte) 3, i, true);
				bool = true;
			}
			model.method1463(aByte5628, anInt5629 * -1793366483, class174, class174_145_, i_146_, i_147_, i_148_);
		}
		if (1281867755 * anInt5655 != 0 || 0 != -1496350233 * anInt5673 || anInt5657 * -2114564345 != 0) {
			if (!bool) {
				model = model.method1351((byte) 3, i, true);
				bool = true;
			}
			model.method1358(1281867755 * anInt5655, -1496350233 * anInt5673, -2114564345 * anInt5657);
		}
		if (bool)
			model.method1450(i_150_);
		return model;
	}

	public boolean method6062(int i) {
		return (anIntArray5645 != null && anIntArray5645.length > 1);
	}

	Model method6063(Class106 class106, int i, int i_151_, int i_152_, Class508 class508, byte i_153_) {
		int i_154_ = anInt5638 * 1878786655 + 64;
		int i_155_ = -69277109 * anInt5639 + 850;
		int i_156_ = i;
		boolean bool = (aBool5647 || (i_151_ == 1870735441 * Class516.aClass516_5729.anInt5742 && i_152_ > 3));
		if (bool)
			i |= 0x10;
		if (i_152_ == 0) {
			if (anInt5646 * 898312795 != 128 || 0 != anInt5652 * -865773249)
				i |= 0x1;
			if (anInt5641 * 1427207859 != 128 || anInt5654 * -504975083 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (anInt5634 * 1899990883 != 128 || 0 != anInt5653 * -955267449)
			i |= 0x2;
		if (null != aShortArray5613)
			i |= 0x4000;
		if (aShortArray5618 != null)
			i |= 0x8000;
		if (0 != aByte5666)
			i |= 0x80000;
		Model model = null;
		if (aByteArray5644 != null) {
			int i_157_ = -1;
			for (int i_158_ = 0; i_158_ < aByteArray5644.length; i_158_++) {
				if (aByteArray5644[i_158_] == i_151_) {
					i_157_ = i_158_;
					break;
				}
			}
			if (-1 == i_157_)
				return null;
			int[] is = ((null != class508 && null != ((Class508) class508).anIntArray5602) ? ((Class508) class508).anIntArray5602 : anIntArrayArray5611[i_157_]);
			int i_159_ = is.length;
			if (i_159_ > 0) {
				long l = (long) (class106.anInt1416 * 1862175997);
				for (int i_160_ = 0; i_160_ < i_159_; i_160_++)
					l = 67783L * l + (long) is[i_160_];
				synchronized (((Class518) aClass518_5608).aClass127_5748) {
					model = ((Model) ((Class518) aClass518_5608).aClass127_5748.method2246(l));
				}
				if (null != model) {
					if (i_154_ != model.method1390())
						i |= 0x1000;
					if (i_155_ != model.method1391())
						i |= 0x2000;
				}
				if (model == null || class106.method1756(model.method1353(), i) != 0) {
					int i_161_ = i | 0x1f01f;
					if (null != model)
						i_161_ = class106.method1798(i_161_, model.method1353());
					Class159 class159 = null;
					synchronized (((Class518) aClass518_5608).aClass159Array5753) {
						for (int i_162_ = 0; i_162_ < i_159_; i_162_++) {
							byte[] is_163_ = aClass518_5608.method6136(is[i_162_], 49248435);
							if (null == is_163_) {
								Model class89_164_ = null;
								return class89_164_;
							}
							class159 = new Class159(is_163_);
							if (class159.anInt1773 < 13)
								class159.method2567(2);
							if (i_159_ > 1)
								((Class518) aClass518_5608).aClass159Array5753[i_162_] = class159;
						}
						if (i_159_ > 1)
							class159 = new Class159((((Class518) (aClass518_5608)).aClass159Array5753), i_159_);
					}
					model = class106.method1755(class159, i_161_, 1583875953 * (((Class518) (aClass518_5608)).anInt5751), i_154_, i_155_);
					synchronized (((Class518) aClass518_5608).aClass127_5748) {
						((Class518) aClass518_5608).aClass127_5748.method2229(model, l);
					}
				}
			}
		}
		if (model == null)
			return null;
		Model class89_165_ = model.method1351((byte) 0, i, true);
		if (i_154_ != model.method1390())
			class89_165_.method1385(i_154_);
		if (i_155_ != model.method1391())
			class89_165_.method1502(i_155_);
		if (bool)
			class89_165_.method1359();
		if (Class516.aClass516_5723.anInt5742 * 1870735441 == i_151_ && i_152_ > 3) {
			class89_165_.method1412(2048);
			class89_165_.method1358(180, 0, -180);
		}
		i_152_ &= 0x3;
		if (1 == i_152_)
			class89_165_.method1412(4096);
		else if (2 == i_152_)
			class89_165_.method1412(8192);
		else if (i_152_ == 3)
			class89_165_.method1412(12288);
		if (null != aShortArray5613) {
			short[] is;
			if (class508 != null && ((Class508) class508).aShortArray5603 != null)
				is = ((Class508) class508).aShortArray5603;
			else
				is = aShortArray5621;
			for (int i_166_ = 0; i_166_ < aShortArray5613.length; i_166_++) {
				if (aByteArray5615 != null && i_166_ < aByteArray5615.length)
					class89_165_.method1393((aShortArray5613[i_166_]), (aShortArray5606[(aByteArray5615[i_166_]) & 0xff]));
				else
					class89_165_.method1393((aShortArray5613[i_166_]), is[i_166_]);
			}
		}
		if (aShortArray5618 != null) {
			short[] is;
			if (class508 != null && null != ((Class508) class508).aShortArray5604)
				is = ((Class508) class508).aShortArray5604;
			else
				is = aShortArray5617;
			for (int i_167_ = 0; i_167_ < aShortArray5618.length; i_167_++)
				class89_165_.method1494((aShortArray5618[i_167_]), is[i_167_]);
		}
		if (0 != aByte5666)
			class89_165_.method1396(aByte5616, aByte5681, aByte5622, aByte5666 & 0xff);
		if (128 != 898312795 * anInt5646 || anInt5634 * 1899990883 != 128 || anInt5641 * 1427207859 != 128)
			class89_165_.method1464(898312795 * anInt5646, 1899990883 * anInt5634, anInt5641 * 1427207859);
		if (-865773249 * anInt5652 != 0 || 0 != anInt5653 * -955267449 || 0 != anInt5654 * -504975083)
			class89_165_.method1358(anInt5652 * -865773249, anInt5653 * -955267449, -504975083 * anInt5654);
		class89_165_.method1450(i_156_);
		return class89_165_;
	}

	public boolean method6064() {
		if (anIntArray5605 == null)
			return -1 != anInt5665 * 412637005 || null != anIntArray5671;
		for (int i = 0; i < anIntArray5605.length; i++) {
			if (-1 != anIntArray5605[i]) {
				ObjectDefinitions class509_168_ = (ObjectDefinitions) anInterface18_5609.getDefinition(anIntArray5605[i], -96275364);
				if (class509_168_.anInt5665 * 412637005 != -1 || class509_168_.anIntArray5671 != null)
					return true;
			}
		}
		return false;
	}

	public boolean method6065() {
		return (anIntArray5645 != null && anIntArray5645.length > 1);
	}

	public boolean method6066() {
		return (anIntArray5645 != null && anIntArray5645.length > 1);
	}

	public int method6067(int i) {
		if (null == anIntArray5651)
			return -1;
		return anIntArray5651[i];
	}

	static final void method6068(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class522.method6221(class73, class83, class441, -1952070290);
	}

	public static int method6069(String string, int i) {
		return string.length() + 1;
	}
}
