package game;

/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class ItemDefinitions implements Interface17 {
	int anInt8115;
	public static final int anInt8116 = 1;
	public static final int anInt8117 = 2;
	static final int anInt8118 = 6;
	static final int anInt8119 = 5;
	public int anInt8120;
	Interface18 anInterface18_8121;
	int anInt8122;
	int anInt8123;
	public int anInt8124 = 1843907425;
	int anInt8125;
	Class628 aClass628_8126;
	short[] aShortArray8127;
	short[] aShortArray8128;
	byte[] aByteArray8129;
	short[] aShortArray8130;
	int anInt8131;
	int anInt8132;
	byte[] aByteArray8133;
	public int anInt8134;
	int anInt8135;
	public int anInt8136;
	public int anInt8137;
	public int anInt8138;
	public int anInt8139;
	short[] aShortArray8140;
	public int anInt8141;
	public int anInt8142;
	public boolean aBool8143;
	public String[] aStringArray8144;
	public String[] aStringArray8145;
	int[] anIntArray8146;
	int[] anIntArray8147;
	int anInt8148;
	int anInt8149;
	public int anInt8150;
	public static short[] aShortArray8151 = new short[256];
	public static final int anInt8152 = 0;
	int anInt8153;
	int anInt8154;
	int anInt8155;
	int anInt8156;
	public int anInt8157;
	int anInt8158;
	int anInt8159;
	public int[] anIntArray8160;
	int anInt8161;
	byte[] aByteArray8162;
	int anInt8163;
	int anInt8164;
	int anInt8165;
	public int anInt8166;
	int[] anIntArray8167;
	int[] anIntArray8168;
	public int anInt8169;
	public int anInt8170;
	public int anInt8171;
	public int anInt8172;
	public int anInt8173;
	public int anInt8174;
	String aString8175;
	int anInt8176;
	int anInt8177;
	public int anInt8178;
	public int equipLookHideSlot;
	public String aString8180 = "null";
	int anInt8181;
	int anInt8182;
	public boolean aBool8183;
	public int anInt8184;
	Class676 aClass676_8185;
	int anInt8186;
	int anInt8187;
	public int anInt8188;
	public int equipSlot;
	public boolean aBool8190;
	public int anInt8191;
	public boolean aBool8192;
	static String aString8193 = "</col>";
	static int anInt8194;

	public int method7520(int i, int i_0_, int i_1_) {
		if (null == ((ItemDefinitions) this).aClass676_8185)
			return i_0_;
		LinkableInt class572_sub26 = ((LinkableInt) ((ItemDefinitions) this).aClass676_8185.get((long) i));
		if (null == class572_sub26)
			return i_0_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(1289378430);
			if (i_2_ == 0)
				break;
			method7521(class572_sub15, i_2_, (byte) -22);
		}
	}

	void method7521(RSByteBuffer class572_sub15, int i, byte i_3_) {
		if (i == 1)
			((ItemDefinitions) this).anInt8125 = class572_sub15.readBigSmart((byte) 74) * 882693423;
		else if (i == 2)
			aString8180 = class572_sub15.readString(1295706626);
		else if (4 == i)
			anInt8134 = class572_sub15.readUnsignedShort(647518597) * -876075611;
		else if (5 == i)
			anInt8157 = class572_sub15.readUnsignedShort(647518597) * 1485684467;
		else if (6 == i)
			anInt8120 = class572_sub15.readUnsignedShort(647518597) * 1545878793;
		else if (7 == i) {
			anInt8138 = class572_sub15.readUnsignedShort(647518597) * 161781607;
			if (-1450208169 * anInt8138 > 32767)
				anInt8138 -= -1754857472;
		} else if (i == 8) {
			anInt8139 = class572_sub15.readUnsignedShort(647518597) * 1440787741;
			if (anInt8139 * -222724811 > 32767)
				anInt8139 -= -1390608384;
		} else if (11 == i)
			anInt8174 = -584906881;
		else if (i == 12)
			anInt8142 = class572_sub15.readInt(-307959828) * 1033053859;
		else if (i == 13)
			equipSlot = class572_sub15.readUnsignedByte(1060323669) * -1127488921;
		else if (14 == i)
			equipLookHideSlot = class572_sub15.readUnsignedByte(86321606) * 1652590425;
		else if (i == 16)
			aBool8143 = true;
		else if (18 == i)
			anInt8141 = class572_sub15.readUnsignedShort(647518597) * -480610667;
		else if (23 == i)
			((ItemDefinitions) this).anInt8161 = class572_sub15.readBigSmart((byte) 28) * -1284837833;
		else if (i == 24)
			((ItemDefinitions) this).anInt8132 = class572_sub15.readBigSmart((byte) 117) * -392037289;
		else if (25 == i)
			((ItemDefinitions) this).anInt8153 = class572_sub15.readBigSmart((byte) 88) * 422753557;
		else if (26 == i)
			((ItemDefinitions) this).anInt8154 = class572_sub15.readBigSmart((byte) 20) * -1165594139;
		else if (27 == i)
			anInt8150 = class572_sub15.readUnsignedByte(2056413026) * 517647611;
		else if (i >= 30 && i < 35)
			aStringArray8144[i - 30] = class572_sub15.readString(1295706626);
		else if (i >= 35 && i < 40)
			aStringArray8145[i - 35] = class572_sub15.readString(1295706626);
		else if (40 == i) {
			int i_4_ = class572_sub15.readUnsignedByte(1195316955);
			((ItemDefinitions) this).aShortArray8127 = new short[i_4_];
			((ItemDefinitions) this).aShortArray8140 = new short[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				((ItemDefinitions) this).aShortArray8127[i_5_] = (short) class572_sub15.readUnsignedShort(647518597);
				((ItemDefinitions) this).aShortArray8140[i_5_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 41) {
			int i_6_ = class572_sub15.readUnsignedByte(165441022);
			((ItemDefinitions) this).aShortArray8130 = new short[i_6_];
			((ItemDefinitions) this).aShortArray8128 = new short[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				((ItemDefinitions) this).aShortArray8130[i_7_] = (short) class572_sub15.readUnsignedShort(647518597);
				((ItemDefinitions) this).aShortArray8128[i_7_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 42) {
			int i_8_ = class572_sub15.readUnsignedByte(776058591);
			((ItemDefinitions) this).aByteArray8129 = new byte[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				((ItemDefinitions) this).aByteArray8129[i_9_] = class572_sub15.readByte(2098378565);
		} else if (43 == i) {
			anInt8191 = class572_sub15.readInt(625865060) * 1551316927;
			aBool8190 = true;
		} else if (44 == i) {
			int i_10_ = class572_sub15.readUnsignedShort(647518597);
			int i_11_ = 0;
			for (int i_12_ = i_10_; i_12_ > 0; i_12_ >>= 1)
				i_11_++;
			((ItemDefinitions) this).aByteArray8162 = new byte[i_11_];
			byte i_13_ = 0;
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				if ((i_10_ & 1 << i_14_) > 0) {
					((ItemDefinitions) this).aByteArray8162[i_14_] = i_13_;
					i_13_++;
				} else
					((ItemDefinitions) this).aByteArray8162[i_14_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_15_ = class572_sub15.readUnsignedShort(647518597);
			int i_16_ = 0;
			for (int i_17_ = i_15_; i_17_ > 0; i_17_ >>= 1)
				i_16_++;
			((ItemDefinitions) this).aByteArray8133 = new byte[i_16_];
			byte i_18_ = 0;
			for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				if ((i_15_ & 1 << i_19_) > 0) {
					((ItemDefinitions) this).aByteArray8133[i_19_] = i_18_;
					i_18_++;
				} else
					((ItemDefinitions) this).aByteArray8133[i_19_] = (byte) -1;
			}
		} else if (65 == i)
			aBool8183 = true;
		else if (i == 78)
			((ItemDefinitions) this).anInt8155 = class572_sub15.readBigSmart((byte) 26) * 1699069027;
		else if (i == 79)
			((ItemDefinitions) this).anInt8156 = class572_sub15.readBigSmart((byte) 12) * -560786309;
		else if (i == 90)
			((ItemDefinitions) this).anInt8163 = class572_sub15.readBigSmart((byte) 20) * -1460475531;
		else if (i == 91)
			((ItemDefinitions) this).anInt8165 = class572_sub15.readBigSmart((byte) 51) * 1491357221;
		else if (92 == i)
			((ItemDefinitions) this).anInt8164 = class572_sub15.readBigSmart((byte) 56) * 1143540903;
		else if (93 == i)
			((ItemDefinitions) this).anInt8148 = class572_sub15.readBigSmart((byte) 124) * 622463121;
		else if (i == 94)
			anInt8124 = class572_sub15.readUnsignedShort(647518597) * -1843907425;
		else if (95 == i)
			anInt8166 = class572_sub15.readUnsignedShort(647518597) * 497153465;
		else if (96 == i)
			anInt8184 = class572_sub15.readUnsignedByte(1984364667) * -1121923473;
		else if (97 == i)
			anInt8170 = class572_sub15.readUnsignedShort(647518597) * 1766636639;
		else if (98 == i)
			anInt8169 = class572_sub15.readUnsignedShort(647518597) * 75825745;
		else if (i >= 100 && i < 110) {
			if (((ItemDefinitions) this).anIntArray8167 == null) {
				((ItemDefinitions) this).anIntArray8167 = new int[10];
				((ItemDefinitions) this).anIntArray8168 = new int[10];
			}
			((ItemDefinitions) this).anIntArray8167[i - 100] = class572_sub15.readUnsignedShort(647518597);
			((ItemDefinitions) this).anIntArray8168[i - 100] = class572_sub15.readUnsignedShort(647518597);
		} else if (i == 110)
			((ItemDefinitions) this).anInt8177 = class572_sub15.readUnsignedShort(647518597) * 271346997;
		else if (i == 111)
			((ItemDefinitions) this).anInt8149 = class572_sub15.readUnsignedShort(647518597) * 1122882873;
		else if (i == 112)
			((ItemDefinitions) this).anInt8182 = class572_sub15.readUnsignedShort(647518597) * 645161119;
		else if (i == 113)
			((ItemDefinitions) this).anInt8186 = class572_sub15.readByte(257749148) * 1869319277;
		else if (i == 114)
			((ItemDefinitions) this).anInt8181 = class572_sub15.readByte(555783705) * -833724771;
		else if (115 == i)
			anInt8137 = class572_sub15.readUnsignedByte(920917403) * 166200085;
		else if (121 == i)
			((ItemDefinitions) this).anInt8122 = class572_sub15.readUnsignedShort(647518597) * -239849301;
		else if (i == 122)
			anInt8172 = class572_sub15.readUnsignedShort(647518597) * 110250543;
		else if (i == 125) {
			((ItemDefinitions) this).anInt8115 = (class572_sub15.readByte(1715620759) << 2) * -765489449;
			((ItemDefinitions) this).anInt8159 = (class572_sub15.readByte(1174345236) << 2) * 984980299;
			((ItemDefinitions) this).anInt8187 = (class572_sub15.readByte(205108809) << 2) * 160606435;
		} else if (126 == i) {
			((ItemDefinitions) this).anInt8158 = (class572_sub15.readByte(2096361743) << 2) * 1177310869;
			((ItemDefinitions) this).anInt8135 = (class572_sub15.readByte(1940087333) << 2) * -2114536221;
			((ItemDefinitions) this).anInt8131 = (class572_sub15.readByte(1072339369) << 2) * -895293173;
		} else if (i == 127 || i == 128 || 129 == i || 130 == i) {
			class572_sub15.readUnsignedByte(771687072);
			class572_sub15.readUnsignedShort(647518597);
		} else if (i == 132) {
			int i_20_ = class572_sub15.readUnsignedByte(798249938);
			anIntArray8160 = new int[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				anIntArray8160[i_21_] = class572_sub15.readUnsignedShort(647518597);
		} else if (i == 134)
			anInt8136 = class572_sub15.readUnsignedByte(1047846191) * 998343161;
		else if (i == 139)
			((ItemDefinitions) this).anInt8176 = class572_sub15.readUnsignedShort(647518597) * 410997517;
		else if (i == 140)
			anInt8188 = class572_sub15.readUnsignedShort(647518597) * -674683849;
		else if (i >= 142 && i < 147) {
			if (((ItemDefinitions) this).anIntArray8146 == null) {
				((ItemDefinitions) this).anIntArray8146 = new int[6];
				Arrays.fill(((ItemDefinitions) this).anIntArray8146, -1);
			}
			((ItemDefinitions) this).anIntArray8146[i - 142] = class572_sub15.readUnsignedShort(647518597);
		} else if (i >= 150 && i < 155) {
			if (null == ((ItemDefinitions) this).anIntArray8147) {
				((ItemDefinitions) this).anIntArray8147 = new int[5];
				Arrays.fill(((ItemDefinitions) this).anIntArray8147, -1);
			}
			((ItemDefinitions) this).anIntArray8147[i - 150] = class572_sub15.readUnsignedShort(647518597);
		} else if (i != 156) {
			if (157 == i)
				aBool8192 = true;
			else if (161 == i)
				anInt8173 = class572_sub15.readUnsignedShort(647518597) * -1557694805;
			else if (i == 162)
				anInt8171 = class572_sub15.readUnsignedShort(647518597) * 327439013;
			else if (163 == i)
				anInt8178 = class572_sub15.readUnsignedShort(647518597) * 584690215;
			else if (i == 164)
				((ItemDefinitions) this).aString8175 = class572_sub15.readString(1295706626);
			else if (i == 165)
				anInt8174 = -1169813762;
			else if (249 == i) {
				int i_22_ = class572_sub15.readUnsignedByte(1683673234);
				if (((ItemDefinitions) this).aClass676_8185 == null) {
					int i_23_ = HashTable.nextPowerOfTwo(i_22_, 1315358674);
					((ItemDefinitions) this).aClass676_8185 = new Class676(i_23_);
				}
				for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
					boolean bool = class572_sub15.readUnsignedByte(404190049) == 1;
					int i_25_ = class572_sub15.read24BitInt(1140925462);
					Class572 class572;
					if (bool)
						class572 = new LinkableObject(class572_sub15.readString(1295706626));
					else
						class572 = new LinkableInt(class572_sub15.readInt(985294000));
					((ItemDefinitions) this).aClass676_8185.put(class572, (long) i_25_);
				}
			}
		}
	}

	void method7522(Class646 class646, ItemDefinitions class631_26_, ItemDefinitions class631_27_, Class279 class279, Class435 class435, byte i) {
		((ItemDefinitions) this).anInt8125 = ((ItemDefinitions) class631_26_).anInt8125 * 1;
		anInt8134 = 1 * class631_26_.anInt8134;
		anInt8157 = class631_26_.anInt8157 * 1;
		anInt8120 = class631_26_.anInt8120 * 1;
		anInt8166 = class631_26_.anInt8166 * 1;
		anInt8138 = 1 * class631_26_.anInt8138;
		anInt8139 = class631_26_.anInt8139 * 1;
		ItemDefinitions class631_28_ = (class646 == Class646.aClass646_8323 ? class631_26_ : class631_27_);
		((ItemDefinitions) this).aShortArray8127 = ((ItemDefinitions) class631_28_).aShortArray8127;
		((ItemDefinitions) this).aShortArray8140 = ((ItemDefinitions) class631_28_).aShortArray8140;
		((ItemDefinitions) this).aByteArray8129 = ((ItemDefinitions) class631_28_).aByteArray8129;
		((ItemDefinitions) this).aShortArray8130 = ((ItemDefinitions) class631_28_).aShortArray8130;
		((ItemDefinitions) this).aShortArray8128 = ((ItemDefinitions) class631_28_).aShortArray8128;
		aString8180 = class631_27_.aString8180;
		aBool8143 = class631_27_.aBool8143;
		if (Class646.aClass646_8323 == class646) {
			anInt8142 = 1 * class631_27_.anInt8142;
			anInt8174 = -584906881;
		} else if (class646 == Class646.aClass646_8320) {
			aString8180 = ((ItemDefinitions) class631_27_).aString8175;
			anInt8142 = ((int) Math.floor((double) (class631_27_.anInt8142 * -1448231669 / (1609770391 * class631_27_.anInt8178))) * 1033053859);
			anInt8174 = -584906881;
			aBool8183 = class631_27_.aBool8183;
			anInt8124 = class631_26_.anInt8124 * 1;
			((ItemDefinitions) this).anIntArray8146 = ((ItemDefinitions) class631_26_).anIntArray8146;
			((ItemDefinitions) this).anIntArray8147 = ((ItemDefinitions) class631_26_).anIntArray8147;
			aStringArray8145 = new String[5];
			aStringArray8145[0] = Class279.aClass279_2950.method3758(class435, 16711935);
			aStringArray8145[4] = class279.method3758(class435, 16711935);
		} else {
			anInt8142 = 0;
			anInt8174 = class631_27_.anInt8174 * 1;
			equipSlot = class631_27_.equipSlot * 1;
			equipLookHideSlot = class631_27_.equipLookHideSlot * 1;
			anInt8150 = 1 * class631_27_.anInt8150;
			((ItemDefinitions) this).anInt8161 = 1 * ((ItemDefinitions) class631_27_).anInt8161;
			((ItemDefinitions) this).anInt8132 = ((ItemDefinitions) class631_27_).anInt8132 * 1;
			((ItemDefinitions) this).anInt8155 = 1 * ((ItemDefinitions) class631_27_).anInt8155;
			((ItemDefinitions) this).anInt8153 = ((ItemDefinitions) class631_27_).anInt8153 * 1;
			((ItemDefinitions) this).anInt8154 = 1 * ((ItemDefinitions) class631_27_).anInt8154;
			((ItemDefinitions) this).anInt8156 = ((ItemDefinitions) class631_27_).anInt8156 * 1;
			((ItemDefinitions) this).anInt8115 = ((ItemDefinitions) class631_27_).anInt8115 * 1;
			((ItemDefinitions) this).anInt8158 = 1 * ((ItemDefinitions) class631_27_).anInt8158;
			((ItemDefinitions) this).anInt8159 = 1 * ((ItemDefinitions) class631_27_).anInt8159;
			((ItemDefinitions) this).anInt8135 = 1 * ((ItemDefinitions) class631_27_).anInt8135;
			((ItemDefinitions) this).anInt8187 = ((ItemDefinitions) class631_27_).anInt8187 * 1;
			((ItemDefinitions) this).anInt8131 = ((ItemDefinitions) class631_27_).anInt8131 * 1;
			((ItemDefinitions) this).anInt8163 = ((ItemDefinitions) class631_27_).anInt8163 * 1;
			((ItemDefinitions) this).anInt8164 = ((ItemDefinitions) class631_27_).anInt8164 * 1;
			((ItemDefinitions) this).anInt8165 = 1 * ((ItemDefinitions) class631_27_).anInt8165;
			((ItemDefinitions) this).anInt8148 = 1 * ((ItemDefinitions) class631_27_).anInt8148;
			anInt8124 = 1 * class631_27_.anInt8124;
			anInt8137 = 1 * class631_27_.anInt8137;
			aStringArray8144 = class631_27_.aStringArray8144;
			((ItemDefinitions) this).aClass676_8185 = ((ItemDefinitions) class631_27_).aClass676_8185;
			aStringArray8145 = new String[5];
			if (class631_27_.aStringArray8145 != null) {
				for (int i_29_ = 0; i_29_ < 4; i_29_++)
					aStringArray8145[i_29_] = class631_27_.aStringArray8145[i_29_];
			}
			aStringArray8145[4] = class279.method3758(class435, 16711935);
		}
	}

	void method7523(ItemDefinitions class631_30_, ItemDefinitions class631_31_, Class435 class435, byte i) {
		method7522(Class646.aClass646_8323, class631_30_, class631_31_, null, class435, (byte) 1);
	}

	void method7524(ItemDefinitions class631_32_, ItemDefinitions class631_33_, Class435 class435, int i) {
		method7522(Class646.aClass646_8321, class631_32_, class631_33_, Class279.aClass279_2958, class435, (byte) 1);
	}

	void method7525(ItemDefinitions class631_34_, ItemDefinitions class631_35_, Class435 class435, short i) {
		method7522(Class646.aClass646_8322, class631_34_, class631_35_, Class279.aClass279_3117, class435, (byte) 1);
	}

	public final Model method7526(Class106 class106, int i, int i_36_, Class474 class474, Class663 class663, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		if (null != ((ItemDefinitions) this).anIntArray8167 && i_36_ > 1) {
			int i_42_ = -1;
			for (int i_43_ = 0; i_43_ < 10; i_43_++) {
				if (i_36_ >= ((ItemDefinitions) this).anIntArray8168[i_43_] && 0 != ((ItemDefinitions) this).anIntArray8168[i_43_])
					i_42_ = ((ItemDefinitions) this).anIntArray8167[i_43_];
			}
			if (i_42_ != -1)
				return (((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(i_42_, 1114173595)).method7526(class106, i, 1, class474, class663, i_37_, i_38_, i_39_, i_40_, 1045305966));
		}
		int i_44_ = i;
		if (null != class663)
			i_44_ |= class663.method7794(-399024617);
		Model model;
		synchronized (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass127_8100) {
			model = ((Model) (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass127_8100.method2246((long) (((ItemDefinitions) this).anInt8123 * 1178726943 | class106.anInt1416 * 1862175997 << 29))));
		}
		if (null == model || class106.method1756(model.method1353(), i_44_) != 0) {
			if (model != null)
				i_44_ = class106.method1798(i_44_, model.method1353());
			int i_45_ = i_44_;
			if (null != ((ItemDefinitions) this).aShortArray8130)
				i_45_ |= 0x8000;
			if (null != ((ItemDefinitions) this).aShortArray8127 || null != class474)
				i_45_ |= 0x4000;
			if (((ItemDefinitions) this).anInt8177 * -1989526243 != 128)
				i_45_ |= 0x1;
			if (449349897 * ((ItemDefinitions) this).anInt8149 != 128)
				i_45_ |= 0x2;
			if (128 != 843365215 * ((ItemDefinitions) this).anInt8182)
				i_45_ |= 0x4;
			Class159 class159 = Class159.method2569((((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099), 714117583 * ((ItemDefinitions) this).anInt8125, 0);
			if (class159 == null)
				return null;
			if (class159.anInt1773 < 13)
				class159.method2567(2);
			model = (class106.method1755(class159, i_45_, -554929703 * (((Class628) ((ItemDefinitions) this).aClass628_8126).anInt8104), 64 + -1509532315 * ((ItemDefinitions) this).anInt8186, ((ItemDefinitions) this).anInt8181 * 2119136905 + 850));
			if (-1989526243 * ((ItemDefinitions) this).anInt8177 != 128 || 128 != 449349897 * ((ItemDefinitions) this).anInt8149 || 128 != ((ItemDefinitions) this).anInt8182 * 843365215)
				model.method1464(((ItemDefinitions) this).anInt8177 * -1989526243, ((ItemDefinitions) this).anInt8149 * 449349897, 843365215 * ((ItemDefinitions) this).anInt8182);
			if (((ItemDefinitions) this).aShortArray8127 != null) {
				for (int i_46_ = 0; i_46_ < ((ItemDefinitions) this).aShortArray8127.length; i_46_++) {
					if (((ItemDefinitions) this).aByteArray8129 != null && i_46_ < ((ItemDefinitions) this).aByteArray8129.length)
						model.method1393((((ItemDefinitions) this).aShortArray8127[i_46_]), aShortArray8151[(((ItemDefinitions) this).aByteArray8129[i_46_]) & 0xff]);
					else
						model.method1393((((ItemDefinitions) this).aShortArray8127[i_46_]), (((ItemDefinitions) this).aShortArray8140[i_46_]));
				}
			}
			if (((ItemDefinitions) this).aShortArray8130 != null) {
				for (int i_47_ = 0; i_47_ < ((ItemDefinitions) this).aShortArray8130.length; i_47_++)
					model.method1494((((ItemDefinitions) this).aShortArray8130[i_47_]), (((ItemDefinitions) this).aShortArray8128[i_47_]));
			}
			if (null != class474) {
				for (int i_48_ = 0; i_48_ < 10; i_48_++) {
					for (int i_49_ = 0; (i_49_ < Class639_Sub19.aShortArrayArray9570[i_48_].length); i_49_++) {
						if (class474.anIntArray5326[i_48_] < (Class47.aShortArrayArrayArray471[i_48_][i_49_]).length)
							model.method1393((Class639_Sub19.aShortArrayArray9570[i_48_][i_49_]), (Class47.aShortArrayArrayArray471[i_48_][i_49_][(class474.anIntArray5326[i_48_])]));
					}
				}
			}
			model.method1450(i_44_);
			synchronized (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass127_8100) {
				((Class628) ((ItemDefinitions) this).aClass628_8126).aClass127_8100.method2229(model, (long) (((ItemDefinitions) this).anInt8123 * 1178726943 | 1862175997 * class106.anInt1416 << 29));
			}
		}
		if (null != class663 || 0 != i_40_) {
			model = model.method1351((byte) 1, i_44_, true);
			if (class663 != null)
				class663.method7797(model, 0, (byte) -103);
			if (0 != i_40_)
				model.method1396(i_37_, i_38_, i_39_, i_40_);
		}
		model.method1450(i);
		return model;
	}

	public ItemDefinitions method7527(int i, int i_50_) {
		if (((ItemDefinitions) this).anIntArray8167 != null && i > 1) {
			int i_51_ = -1;
			for (int i_52_ = 0; i_52_ < 10; i_52_++) {
				if (i >= ((ItemDefinitions) this).anIntArray8168[i_52_] && 0 != ((ItemDefinitions) this).anIntArray8168[i_52_])
					i_51_ = ((ItemDefinitions) this).anIntArray8167[i_52_];
			}
			if (i_51_ != -1)
				return (ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(i_51_, -35483422);
		}
		return this;
	}

	int[] method7528(Class106 class106, Class106 class106_53_, int i, int i_54_, int i_55_, boolean bool, int i_56_, Class102 class102, Class474 class474, Class484 class484, byte i_57_) {
		Class159 class159 = Class159.method2569((((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099), ((ItemDefinitions) this).anInt8125 * 714117583, 0);
		if (null == class159)
			return null;
		if (class159.anInt1773 < 13)
			class159.method2567(2);
		if (((ItemDefinitions) this).aShortArray8127 != null) {
			for (int i_58_ = 0; i_58_ < ((ItemDefinitions) this).aShortArray8127.length; i_58_++) {
				if (null != ((ItemDefinitions) this).aByteArray8129 && i_58_ < ((ItemDefinitions) this).aByteArray8129.length)
					class159.method2562((((ItemDefinitions) this).aShortArray8127[i_58_]), aShortArray8151[(((ItemDefinitions) this).aByteArray8129[i_58_]) & 0xff]);
				else
					class159.method2562((((ItemDefinitions) this).aShortArray8127[i_58_]), (((ItemDefinitions) this).aShortArray8140[i_58_]));
			}
		}
		if (((ItemDefinitions) this).aShortArray8130 != null) {
			for (int i_59_ = 0; i_59_ < ((ItemDefinitions) this).aShortArray8130.length; i_59_++)
				class159.method2563(((ItemDefinitions) this).aShortArray8130[i_59_], ((ItemDefinitions) this).aShortArray8128[i_59_]);
		}
		if (null != class474) {
			for (int i_60_ = 0; i_60_ < 10; i_60_++) {
				for (int i_61_ = 0; i_61_ < Class639_Sub19.aShortArrayArray9570[i_60_].length; i_61_++) {
					if (class474.anIntArray5326[i_60_] < (Class47.aShortArrayArrayArray471[i_60_][i_61_]).length)
						class159.method2562(Class639_Sub19.aShortArrayArray9570[i_60_][i_61_], (Class47.aShortArrayArrayArray471[i_60_][i_61_][class474.anIntArray5326[i_60_]]));
				}
			}
		}
		int i_62_ = 2048;
		boolean bool_63_ = false;
		if (-1989526243 * ((ItemDefinitions) this).anInt8177 != 128 || 128 != ((ItemDefinitions) this).anInt8149 * 449349897 || 128 != 843365215 * ((ItemDefinitions) this).anInt8182) {
			bool_63_ = true;
			i_62_ |= 0x7;
		}
		Model model = class106.method1755(class159, i_62_, 64, 64 + (((ItemDefinitions) this).anInt8186 * -1509532315), 768 + (2119136905 * ((ItemDefinitions) this).anInt8181));
		if (!model.method1397())
			return null;
		if (bool_63_)
			model.method1464(((ItemDefinitions) this).anInt8177 * -1989526243, ((ItemDefinitions) this).anInt8149 * 449349897, 843365215 * ((ItemDefinitions) this).anInt8182);
		Class161 class161 = null;
		if (-1 != 1138984625 * anInt8169) {
			class161 = (((ItemDefinitions) this).aClass628_8126.method7479(class106, class106_53_, -290938977 * anInt8170, 10, 1, 0, true, true, 0, class102, class474, class484, ((ItemDefinitions) this).anInterface18_8121, 1911017735));
			if (class161 == null)
				return null;
		} else if (823999695 * anInt8172 != -1) {
			class161 = (((ItemDefinitions) this).aClass628_8126.method7479(class106, class106_53_, -227128829 * ((ItemDefinitions) this).anInt8122, i, i_54_, i_55_, false, true, 0, class102, class474, class484, ((ItemDefinitions) this).anInterface18_8121, 870736985));
			if (null == class161)
				return null;
		} else if (269209991 * anInt8188 != -1) {
			class161 = (((ItemDefinitions) this).aClass628_8126.method7479(class106, class106_53_, ((ItemDefinitions) this).anInt8176 * -1174424635, i, i_54_, i_55_, false, true, 0, class102, class474, class484, ((ItemDefinitions) this).anInterface18_8121, 1782957382));
			if (class161 == null)
				return null;
		} else if (-1 != -1024768723 * anInt8171) {
			class161 = (((ItemDefinitions) this).aClass628_8126.method7479(class106, class106_53_, -1999842301 * anInt8173, 10, 1, 0, true, true, 0, class102, class474, class484, ((ItemDefinitions) this).anInterface18_8121, -1566629103));
			if (null == class161)
				return null;
		}
		int i_64_;
		if (bool)
			i_64_ = (int) ((double) (anInt8134 * 1107442221) * 1.5) << 2;
		else if (2 == i_54_)
			i_64_ = (int) (1.04 * (double) (anInt8134 * 1107442221)) << 2;
		else
			i_64_ = 1107442221 * anInt8134 << 2;
		Class250 class250 = class106.method1765();
		Class250 class250_65_ = class106.method1752();
		class250_65_.method3452(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class106.method1683(934160294).method1648(), (float) class106.method1683(-302685417).method1646());
		class106.method1764(class250_65_);
		class106.method2004(0, 0, class106.method1683(686434932).method1648(), class106.method1683(1350128063).method1646());
		Class261 class261 = new Class261();
		class106.method1761(class261);
		class106.method1709(0.95F + (float) (Math.random() / 10.0));
		class106.method1767(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class261 class261_66_ = class106.method1753();
		class261_66_.method3571(0.0F, 0.0F, 1.0F, Class325.method4146(-(anInt8166 * -1330675575) << 3));
		class261_66_.method3576(0.0F, 1.0F, 0.0F, Class325.method4146(anInt8120 * -69312199 << 3));
		class261_66_.method3580((float) (-1450208169 * anInt8138 << 2), (float) ((((Class325.anIntArray4103[anInt8157 * -1383953861 << 3]) * i_64_) >> 14) - model.method1382() / 2 + (anInt8139 * -222724811 << 2)), (float) ((anInt8139 * -222724811 << 2) + (i_64_ * (Class325.anIntArray4105[(anInt8157 * -1383953861 << 3)]) >> 14)));
		class261_66_.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(anInt8157 * -1383953861 << 3));
		class106.method1715(0, 0, 36, 32);
		class106.method1719(2, 0);
		class106.method1725(0, 0, 36, 32, 0, 0);
		class106.method1991(0, -1, 0);
		model.method1375(class261_66_, null, 1);
		class106.method1764(class250);
		int[] is = class106.method1696(0, 0, 36, 32);
		if (i_54_ >= 1) {
			is = method7529(is, -16777214, 1441333632);
			if (i_54_ >= 2)
				is = method7529(is, -1, 1441333632);
		}
		if (0 != i_55_)
			method7538(is, i_55_, (byte) -65);
		if (-1 != anInt8172 * 823999695)
			class161.method2595(0, 0);
		else if (-1 != anInt8188 * 269209991)
			class161.method2595(0, 0);
		class106.method1744(is, 0, 36, 36, 32, 174204020).method2595(0, 0);
		if (-1 != anInt8169 * 1138984625)
			class161.method2595(0, 0);
		if (-1 != anInt8171 * -1024768723)
			class161.method2595(0, 0);
		if (1 == i_56_ || 2 == i_56_ && (1 == 532985983 * anInt8174 || 1 != i) && i != -1)
			class102.method1620(Cs2CallPointer.method5631(i, (((Class628) (((ItemDefinitions) this).aClass628_8126)).aClass435_8098), class484, (byte) 29), 0, 9, -256, -16777215, 36069326);
		is = class106.method1696(0, 0, 36, 32);
		for (int i_67_ = 0; i_67_ < is.length; i_67_++) {
			if ((is[i_67_] & 0xffffff) == 0)
				is[i_67_] = 0;
			else
				is[i_67_] |= ~0xffffff;
		}
		return is;
	}

	int[] method7529(int[] is, int i, int i_68_) {
		int[] is_69_ = new int[1152];
		int i_70_ = 0;
		for (int i_71_ = 0; i_71_ < 32; i_71_++) {
			for (int i_72_ = 0; i_72_ < 36; i_72_++) {
				int i_73_ = is[i_70_];
				if (0 == i_73_) {
					if (i_72_ > 0 && is[i_70_ - 1] != 0)
						i_73_ = i;
					else if (i_71_ > 0 && is[i_70_ - 36] != 0)
						i_73_ = i;
					else if (i_72_ < 35 && 0 != is[1 + i_70_])
						i_73_ = i;
					else if (i_71_ < 31 && 0 != is[i_70_ + 36])
						i_73_ = i;
				}
				is_69_[i_70_++] = i_73_;
			}
		}
		return is_69_;
	}

	ItemDefinitions(int i, Interface18 interface18, Class628 class628) {
		anInt8134 = 195434768;
		anInt8157 = 0;
		anInt8120 = 0;
		anInt8166 = 0;
		anInt8138 = 0;
		anInt8139 = 0;
		anInt8174 = 0;
		anInt8141 = 480610667;
		anInt8142 = 1033053859;
		aBool8143 = false;
		equipSlot = 1127488921;
		equipLookHideSlot = -1652590425;
		anInt8150 = -517647611;
		((ItemDefinitions) this).anInt8161 = 1284837833;
		((ItemDefinitions) this).anInt8132 = 392037289;
		((ItemDefinitions) this).anInt8153 = -422753557;
		((ItemDefinitions) this).anInt8154 = 1165594139;
		((ItemDefinitions) this).anInt8155 = -1699069027;
		((ItemDefinitions) this).anInt8156 = 560786309;
		((ItemDefinitions) this).anInt8115 = 0;
		((ItemDefinitions) this).anInt8158 = 0;
		((ItemDefinitions) this).anInt8159 = 0;
		((ItemDefinitions) this).anInt8135 = 0;
		((ItemDefinitions) this).anInt8187 = 0;
		((ItemDefinitions) this).anInt8131 = 0;
		((ItemDefinitions) this).anInt8163 = 1460475531;
		((ItemDefinitions) this).anInt8164 = -1143540903;
		((ItemDefinitions) this).anInt8165 = -1491357221;
		((ItemDefinitions) this).anInt8148 = -622463121;
		anInt8169 = -75825745;
		anInt8170 = -1766636639;
		((ItemDefinitions) this).anInt8122 = 239849301;
		anInt8172 = -110250543;
		anInt8173 = 1557694805;
		anInt8171 = -327439013;
		((ItemDefinitions) this).aString8175 = "null";
		anInt8178 = 0;
		((ItemDefinitions) this).anInt8177 = 372677248;
		((ItemDefinitions) this).anInt8149 = 1995086976;
		((ItemDefinitions) this).anInt8182 = 976244608;
		((ItemDefinitions) this).anInt8186 = 0;
		((ItemDefinitions) this).anInt8181 = 0;
		anInt8137 = 0;
		aBool8183 = false;
		anInt8184 = 0;
		anInt8136 = 0;
		((ItemDefinitions) this).anInt8176 = -410997517;
		anInt8188 = 674683849;
		aBool8190 = false;
		aBool8192 = false;
		((ItemDefinitions) this).anInt8123 = -1852503585 * i;
		((ItemDefinitions) this).anInterface18_8121 = interface18;
		((ItemDefinitions) this).aClass628_8126 = class628;
		aStringArray8144 = (String[]) ((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102.clone();
		aStringArray8145 = (String[]) ((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101.clone();
	}

	public final boolean method7530(boolean bool, Class634 class634, int i) {
		int i_74_;
		int i_75_;
		int i_76_;
		if (bool) {
			if (class634 != null && class634.anIntArray8217 != null) {
				i_74_ = class634.anIntArray8217[0];
				i_75_ = class634.anIntArray8217[1];
				i_76_ = class634.anIntArray8217[2];
			} else {
				i_74_ = 1779036733 * ((ItemDefinitions) this).anInt8153;
				i_75_ = ((ItemDefinitions) this).anInt8154 * -1581685779;
				i_76_ = ((ItemDefinitions) this).anInt8156 * -2097304909;
			}
		} else if (class634 != null && class634.anIntArray8216 != null) {
			i_74_ = class634.anIntArray8216[0];
			i_75_ = class634.anIntArray8216[1];
			i_76_ = class634.anIntArray8216[2];
		} else {
			i_74_ = ((ItemDefinitions) this).anInt8161 * 1363027847;
			i_75_ = ((ItemDefinitions) this).anInt8132 * 1523363687;
			i_76_ = ((ItemDefinitions) this).anInt8155 * 1059235147;
		}
		if (i_74_ == -1)
			return true;
		boolean bool_77_ = true;
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099.method3369(i_74_, 0, (byte) -102))
			bool_77_ = false;
		if (i_75_ != -1 && !((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099.method3369(i_75_, 0, (byte) -54))
			bool_77_ = false;
		if (i_76_ != -1 && !((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099.method3369(i_76_, 0, (byte) -18))
			bool_77_ = false;
		return bool_77_;
	}

	public final Class159 method7531(boolean bool, Class634 class634, byte i) {
		int i_78_;
		int i_79_;
		int i_80_;
		if (bool) {
			if (null != class634 && null != class634.anIntArray8217) {
				i_78_ = class634.anIntArray8217[0];
				i_79_ = class634.anIntArray8217[1];
				i_80_ = class634.anIntArray8217[2];
			} else {
				i_78_ = 1779036733 * ((ItemDefinitions) this).anInt8153;
				i_79_ = -1581685779 * ((ItemDefinitions) this).anInt8154;
				i_80_ = ((ItemDefinitions) this).anInt8156 * -2097304909;
			}
		} else if (class634 != null && class634.anIntArray8216 != null) {
			i_78_ = class634.anIntArray8216[0];
			i_79_ = class634.anIntArray8216[1];
			i_80_ = class634.anIntArray8216[2];
		} else {
			i_78_ = ((ItemDefinitions) this).anInt8161 * 1363027847;
			i_79_ = ((ItemDefinitions) this).anInt8132 * 1523363687;
			i_80_ = ((ItemDefinitions) this).anInt8155 * 1059235147;
		}
		if (i_78_ == -1)
			return null;
		Class159 class159 = Class159.method2569((((Class628) (((ItemDefinitions) this).aClass628_8126)).aClass248_8099), i_78_, 0);
		if (null == class159)
			return null;
		if (class159.anInt1773 < 13)
			class159.method2567(2);
		if (-1 != i_79_) {
			Class159 class159_81_ = Class159.method2569((((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099), i_79_, 0);
			if (class159_81_.anInt1773 < 13)
				class159_81_.method2567(2);
			if (-1 != i_80_) {
				Class159 class159_82_ = Class159.method2569((((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099), i_80_, 0);
				if (class159_82_.anInt1773 < 13)
					class159_82_.method2567(2);
				Class159[] class159s = { class159, class159_81_, class159_82_ };
				class159 = new Class159(class159s, 3);
			} else {
				Class159[] class159s = { class159, class159_81_ };
				class159 = new Class159(class159s, 2);
			}
		}
		if (!bool && (((ItemDefinitions) this).anInt8115 * -1288485657 != 0 || ((ItemDefinitions) this).anInt8159 * 1291163235 != 0 || 1677450443 * ((ItemDefinitions) this).anInt8187 != 0))
			class159.method2564(((ItemDefinitions) this).anInt8115 * -1288485657, ((ItemDefinitions) this).anInt8159 * 1291163235, ((ItemDefinitions) this).anInt8187 * 1677450443);
		if (bool && (-426588995 * ((ItemDefinitions) this).anInt8158 != 0 || 0 != -1749784373 * ((ItemDefinitions) this).anInt8135 || 0 != ((ItemDefinitions) this).anInt8131 * -580937053))
			class159.method2564(-426588995 * ((ItemDefinitions) this).anInt8158, ((ItemDefinitions) this).anInt8135 * -1749784373, ((ItemDefinitions) this).anInt8131 * -580937053);
		if (((ItemDefinitions) this).aShortArray8127 != null) {
			short[] is;
			if (null != class634 && null != class634.aShortArray8220)
				is = class634.aShortArray8220;
			else
				is = ((ItemDefinitions) this).aShortArray8140;
			for (int i_83_ = 0; i_83_ < ((ItemDefinitions) this).aShortArray8127.length; i_83_++)
				class159.method2562(((ItemDefinitions) this).aShortArray8127[i_83_], is[i_83_]);
		}
		if (((ItemDefinitions) this).aShortArray8130 != null) {
			short[] is;
			if (null != class634 && class634.aShortArray8221 != null)
				is = class634.aShortArray8221;
			else
				is = ((ItemDefinitions) this).aShortArray8128;
			for (int i_84_ = 0; i_84_ < ((ItemDefinitions) this).aShortArray8130.length; i_84_++)
				class159.method2563(((ItemDefinitions) this).aShortArray8130[i_84_], is[i_84_]);
		}
		return class159;
	}

	public final boolean method7532(boolean bool, Class634 class634, int i) {
		int i_85_;
		int i_86_;
		if (bool) {
			if (null != class634 && null != class634.anIntArray8219) {
				i_85_ = class634.anIntArray8219[0];
				i_86_ = class634.anIntArray8219[1];
			} else {
				i_85_ = ((ItemDefinitions) this).anInt8165 * 1851334061;
				i_86_ = -1329940367 * ((ItemDefinitions) this).anInt8148;
			}
		} else if (null != class634 && class634.anIntArray8211 != null) {
			i_85_ = class634.anIntArray8211[0];
			i_86_ = class634.anIntArray8211[1];
		} else {
			i_85_ = ((ItemDefinitions) this).anInt8163 * -1940529443;
			i_86_ = 1748753175 * ((ItemDefinitions) this).anInt8164;
		}
		if (-1 == i_85_)
			return true;
		boolean bool_87_ = true;
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099.method3369(i_85_, 0, (byte) -28))
			bool_87_ = false;
		if (-1 != i_86_ && !((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099.method3369(i_86_, 0, (byte) -108))
			bool_87_ = false;
		return bool_87_;
	}

	public final Class159 method7533(boolean bool, Class634 class634, int i) {
		int i_88_;
		int i_89_;
		if (bool) {
			if (class634 != null && null != class634.anIntArray8219) {
				i_88_ = class634.anIntArray8219[0];
				i_89_ = class634.anIntArray8219[1];
			} else {
				i_88_ = 1851334061 * ((ItemDefinitions) this).anInt8165;
				i_89_ = -1329940367 * ((ItemDefinitions) this).anInt8148;
			}
		} else if (null != class634 && class634.anIntArray8211 != null) {
			i_88_ = class634.anIntArray8211[0];
			i_89_ = class634.anIntArray8211[1];
		} else {
			i_88_ = ((ItemDefinitions) this).anInt8163 * -1940529443;
			i_89_ = ((ItemDefinitions) this).anInt8164 * 1748753175;
		}
		if (i_88_ == -1)
			return null;
		Class159 class159 = Class159.method2569((((Class628) (((ItemDefinitions) this).aClass628_8126)).aClass248_8099), i_88_, 0);
		if (class159.anInt1773 < 13)
			class159.method2567(2);
		if (-1 != i_89_) {
			Class159 class159_90_ = Class159.method2569((((Class628) ((ItemDefinitions) this).aClass628_8126).aClass248_8099), i_89_, 0);
			if (class159_90_.anInt1773 < 13)
				class159_90_.method2567(2);
			Class159[] class159s = { class159, class159_90_ };
			class159 = new Class159(class159s, 2);
		}
		if (((ItemDefinitions) this).aShortArray8127 != null) {
			short[] is;
			if (class634 != null && null != class634.aShortArray8220)
				is = class634.aShortArray8220;
			else
				is = ((ItemDefinitions) this).aShortArray8140;
			for (int i_91_ = 0; i_91_ < ((ItemDefinitions) this).aShortArray8127.length; i_91_++)
				class159.method2562(((ItemDefinitions) this).aShortArray8127[i_91_], is[i_91_]);
		}
		if (((ItemDefinitions) this).aShortArray8130 != null) {
			short[] is;
			if (class634 != null && null != class634.aShortArray8221)
				is = class634.aShortArray8221;
			else
				is = ((ItemDefinitions) this).aShortArray8128;
			for (int i_92_ = 0; i_92_ < ((ItemDefinitions) this).aShortArray8130.length; i_92_++)
				class159.method2563(((ItemDefinitions) this).aShortArray8130[i_92_], is[i_92_]);
		}
		return class159;
	}

	public String method7534(int i, String string, byte i_93_) {
		if (null == ((ItemDefinitions) this).aClass676_8185)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) ((ItemDefinitions) this).aClass676_8185.get((long) i));
		if (null == class572_sub9)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public int method7535(int i, byte i_94_) {
		if (null == ((ItemDefinitions) this).anIntArray8147)
			return -1;
		return ((ItemDefinitions) this).anIntArray8147[i];
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1651963571);
			if (i == 0)
				break;
			method7521(class572_sub15, i, (byte) -104);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1806312197);
			if (i == 0)
				break;
			method7521(class572_sub15, i, (byte) -11);
		}
	}

	public void method104(byte i) {
		if (-1 != 1138984625 * anInt8169)
			method7523((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(1138984625 * anInt8169, 445288836), (ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-290938977 * anInt8170, -622374257), ((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098, (byte) 21);
		else if (823999695 * anInt8172 != -1)
			method7524(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(823999695 * anInt8172, 1423175509)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8122 * -227128829, -760966245)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -1950233215);
		else if (269209991 * anInt8188 != -1)
			method7525(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(269209991 * anInt8188, -368402500)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8176 * -1174424635, -1621762809)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (short) 884);
		else if (anInt8171 * -1024768723 != -1)
			method7539(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-1024768723 * anInt8171, 1311691567)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(anInt8173 * -1999842301, 2110378061)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -84215194);
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aBool8106 && aBool8143) {
			anInt8137 = 0;
			aStringArray8144 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102);
			aStringArray8145 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101);
			aBool8183 = false;
			anIntArray8160 = null;
			if (((ItemDefinitions) this).aClass676_8185 != null) {
				boolean bool = false;
				for (Class572 class572 = ((ItemDefinitions) this).aClass676_8185.method7968((byte) 35); class572 != null; class572 = ((ItemDefinitions) this).aClass676_8185.method7969(1887718196)) {
					Class264 class264 = ((Class264) (((Class628) ((ItemDefinitions) this).aClass628_8126).anInterface18_8103.getDefinition((int) (381237825124074065L * class572.hash), 1310039603)));
					if (class264.aBool2834)
						class572.method6794((byte) 11);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) this).aClass676_8185 = null;
			}
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1525086514);
			if (i == 0)
				break;
			method7521(class572_sub15, i, (byte) -42);
		}
	}

	public void method103() {
		if (-1 != 1138984625 * anInt8169)
			method7523(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(1138984625 * anInt8169, -16749345)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-290938977 * anInt8170, -1424410750)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (byte) 123);
		else if (823999695 * anInt8172 != -1)
			method7524(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(823999695 * anInt8172, 1895135960)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8122 * -227128829, 2000426000)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -615547017);
		else if (269209991 * anInt8188 != -1)
			method7525(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(269209991 * anInt8188, 2017022759)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8176 * -1174424635, 1874305235)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (short) 884);
		else if (anInt8171 * -1024768723 != -1)
			method7539(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-1024768723 * anInt8171, 1254547035)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(anInt8173 * -1999842301, -1154421782)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -1335734692);
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aBool8106 && aBool8143) {
			anInt8137 = 0;
			aStringArray8144 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102);
			aStringArray8145 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101);
			aBool8183 = false;
			anIntArray8160 = null;
			if (((ItemDefinitions) this).aClass676_8185 != null) {
				boolean bool = false;
				for (Class572 class572 = ((ItemDefinitions) this).aClass676_8185.method7968((byte) 17); class572 != null; class572 = ((ItemDefinitions) this).aClass676_8185.method7969(-345831143)) {
					Class264 class264 = ((Class264) (((Class628) ((ItemDefinitions) this).aClass628_8126).anInterface18_8103.getDefinition((int) (381237825124074065L * class572.hash), -1309400312)));
					if (class264.aBool2834)
						class572.method6794((byte) -13);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) this).aClass676_8185 = null;
			}
		}
	}

	public void method110() {
		if (-1 != 1138984625 * anInt8169)
			method7523(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(1138984625 * anInt8169, 1949850589)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-290938977 * anInt8170, -1351449392)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (byte) 47);
		else if (823999695 * anInt8172 != -1)
			method7524(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(823999695 * anInt8172, 1054485806)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8122 * -227128829, -797318024)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -879278525);
		else if (269209991 * anInt8188 != -1)
			method7525(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(269209991 * anInt8188, 1519335657)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8176 * -1174424635, -1488211725)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (short) 884);
		else if (anInt8171 * -1024768723 != -1)
			method7539(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-1024768723 * anInt8171, 1034523696)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(anInt8173 * -1999842301, -553911942)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -235966304);
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aBool8106 && aBool8143) {
			anInt8137 = 0;
			aStringArray8144 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102);
			aStringArray8145 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101);
			aBool8183 = false;
			anIntArray8160 = null;
			if (((ItemDefinitions) this).aClass676_8185 != null) {
				boolean bool = false;
				for (Class572 class572 = ((ItemDefinitions) this).aClass676_8185.method7968((byte) 24); class572 != null; class572 = ((ItemDefinitions) this).aClass676_8185.method7969(-35461384)) {
					Class264 class264 = ((Class264) (((Class628) ((ItemDefinitions) this).aClass628_8126).anInterface18_8103.getDefinition((int) (381237825124074065L * class572.hash), -1820223281)));
					if (class264.aBool2834)
						class572.method6794((byte) 37);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) this).aClass676_8185 = null;
			}
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1162997685);
			if (i == 0)
				break;
			method7521(class572_sub15, i, (byte) -120);
		}
	}

	public void method106() {
		if (-1 != 1138984625 * anInt8169)
			method7523((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(1138984625 * anInt8169, -881155535), (ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-290938977 * anInt8170, 1670914830), ((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098, (byte) 29);
		else if (823999695 * anInt8172 != -1)
			method7524(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(823999695 * anInt8172, 662205573)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8122 * -227128829, -1852281285)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), 1439921496);
		else if (269209991 * anInt8188 != -1)
			method7525(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(269209991 * anInt8188, 551729287)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8176 * -1174424635, -689342008)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (short) 884);
		else if (anInt8171 * -1024768723 != -1)
			method7539(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-1024768723 * anInt8171, -498861687)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(anInt8173 * -1999842301, -993675005)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), 1181558695);
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aBool8106 && aBool8143) {
			anInt8137 = 0;
			aStringArray8144 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102);
			aStringArray8145 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101);
			aBool8183 = false;
			anIntArray8160 = null;
			if (((ItemDefinitions) this).aClass676_8185 != null) {
				boolean bool = false;
				for (Class572 class572 = ((ItemDefinitions) this).aClass676_8185.method7968((byte) 5); class572 != null; class572 = ((ItemDefinitions) this).aClass676_8185.method7969(-123094834)) {
					Class264 class264 = ((Class264) (((Class628) ((ItemDefinitions) this).aClass628_8126).anInterface18_8103.getDefinition((int) (381237825124074065L * class572.hash), 435984796)));
					if (class264.aBool2834)
						class572.method6794((byte) -26);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) this).aClass676_8185 = null;
			}
		}
	}

	public int method7536(int i, int i_95_) {
		if (null == ((ItemDefinitions) this).anIntArray8146)
			return -1;
		return ((ItemDefinitions) this).anIntArray8146[i];
	}

	public int method7537(int i) {
		if (null == ((ItemDefinitions) this).anIntArray8147)
			return -1;
		return ((ItemDefinitions) this).anIntArray8147[i];
	}

	public void method112() {
		if (-1 != 1138984625 * anInt8169)
			method7523(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(1138984625 * anInt8169, -1270902638)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-290938977 * anInt8170, 1012983501)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (byte) 13);
		else if (823999695 * anInt8172 != -1)
			method7524(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(823999695 * anInt8172, -253800413)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8122 * -227128829, -1234047240)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -1330547367);
		else if (269209991 * anInt8188 != -1)
			method7525(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(269209991 * anInt8188, -2023649657)), (ItemDefinitions) (((ItemDefinitions) this).anInterface18_8121.getDefinition(((ItemDefinitions) this).anInt8176 * -1174424635, -1160538504)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), (short) 884);
		else if (anInt8171 * -1024768723 != -1)
			method7539(((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(-1024768723 * anInt8171, 1518064792)), ((ItemDefinitions) ((ItemDefinitions) this).anInterface18_8121.getDefinition(anInt8173 * -1999842301, 39420765)), (((Class628) ((ItemDefinitions) this).aClass628_8126).aClass435_8098), -1907799012);
		if (!((Class628) ((ItemDefinitions) this).aClass628_8126).aBool8106 && aBool8143) {
			anInt8137 = 0;
			aStringArray8144 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8102);
			aStringArray8145 = (((Class628) ((ItemDefinitions) this).aClass628_8126).aStringArray8101);
			aBool8183 = false;
			anIntArray8160 = null;
			if (((ItemDefinitions) this).aClass676_8185 != null) {
				boolean bool = false;
				for (Class572 class572 = ((ItemDefinitions) this).aClass676_8185.method7968((byte) 33); class572 != null; class572 = ((ItemDefinitions) this).aClass676_8185.method7969(763720788)) {
					Class264 class264 = ((Class264) (((Class628) ((ItemDefinitions) this).aClass628_8126).anInterface18_8103.getDefinition((int) (381237825124074065L * class572.hash), 1760552130)));
					if (class264.aBool2834)
						class572.method6794((byte) 22);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) this).aClass676_8185 = null;
			}
		}
	}

	void method7538(int[] is, int i, byte i_96_) {
		for (int i_97_ = 31; i_97_ > 0; i_97_--) {
			int i_98_ = 36 * i_97_;
			for (int i_99_ = 35; i_99_ > 0; i_99_--) {
				if (0 == is[i_98_ + i_99_] && is[i_98_ + i_99_ - 1 - 36] != 0)
					is[i_99_ + i_98_] = i;
			}
		}
	}

	void method7539(ItemDefinitions class631_100_, ItemDefinitions class631_101_, Class435 class435, int i) {
		method7522(Class646.aClass646_8320, class631_100_, class631_101_, Class279.aClass279_2964, class435, (byte) 1);
	}

	void method7540(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			((ItemDefinitions) this).anInt8125 = class572_sub15.readBigSmart((byte) 110) * 882693423;
		else if (i == 2)
			aString8180 = class572_sub15.readString(1295706626);
		else if (4 == i)
			anInt8134 = class572_sub15.readUnsignedShort(647518597) * -876075611;
		else if (5 == i)
			anInt8157 = class572_sub15.readUnsignedShort(647518597) * 1485684467;
		else if (6 == i)
			anInt8120 = class572_sub15.readUnsignedShort(647518597) * 1545878793;
		else if (7 == i) {
			anInt8138 = class572_sub15.readUnsignedShort(647518597) * 161781607;
			if (-1450208169 * anInt8138 > 32767)
				anInt8138 -= -1754857472;
		} else if (i == 8) {
			anInt8139 = class572_sub15.readUnsignedShort(647518597) * 1440787741;
			if (anInt8139 * -222724811 > 32767)
				anInt8139 -= -1390608384;
		} else if (11 == i)
			anInt8174 = -584906881;
		else if (i == 12)
			anInt8142 = class572_sub15.readInt(614343996) * 1033053859;
		else if (i == 13)
			equipSlot = class572_sub15.readUnsignedByte(778243493) * -1127488921;
		else if (14 == i)
			equipLookHideSlot = class572_sub15.readUnsignedByte(1301182778) * 1652590425;
		else if (i == 16)
			aBool8143 = true;
		else if (18 == i)
			anInt8141 = class572_sub15.readUnsignedShort(647518597) * -480610667;
		else if (23 == i)
			((ItemDefinitions) this).anInt8161 = class572_sub15.readBigSmart((byte) 59) * -1284837833;
		else if (i == 24)
			((ItemDefinitions) this).anInt8132 = class572_sub15.readBigSmart((byte) 104) * -392037289;
		else if (25 == i)
			((ItemDefinitions) this).anInt8153 = class572_sub15.readBigSmart((byte) 99) * 422753557;
		else if (26 == i)
			((ItemDefinitions) this).anInt8154 = class572_sub15.readBigSmart((byte) 17) * -1165594139;
		else if (27 == i)
			anInt8150 = class572_sub15.readUnsignedByte(1804237432) * 517647611;
		else if (i >= 30 && i < 35)
			aStringArray8144[i - 30] = class572_sub15.readString(1295706626);
		else if (i >= 35 && i < 40)
			aStringArray8145[i - 35] = class572_sub15.readString(1295706626);
		else if (40 == i) {
			int i_102_ = class572_sub15.readUnsignedByte(1689843381);
			((ItemDefinitions) this).aShortArray8127 = new short[i_102_];
			((ItemDefinitions) this).aShortArray8140 = new short[i_102_];
			for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
				((ItemDefinitions) this).aShortArray8127[i_103_] = (short) class572_sub15.readUnsignedShort(647518597);
				((ItemDefinitions) this).aShortArray8140[i_103_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 41) {
			int i_104_ = class572_sub15.readUnsignedByte(536197245);
			((ItemDefinitions) this).aShortArray8130 = new short[i_104_];
			((ItemDefinitions) this).aShortArray8128 = new short[i_104_];
			for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
				((ItemDefinitions) this).aShortArray8130[i_105_] = (short) class572_sub15.readUnsignedShort(647518597);
				((ItemDefinitions) this).aShortArray8128[i_105_] = (short) class572_sub15.readUnsignedShort(647518597);
			}
		} else if (i == 42) {
			int i_106_ = class572_sub15.readUnsignedByte(1909944473);
			((ItemDefinitions) this).aByteArray8129 = new byte[i_106_];
			for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
				((ItemDefinitions) this).aByteArray8129[i_107_] = class572_sub15.readByte(941474165);
		} else if (43 == i) {
			anInt8191 = class572_sub15.readInt(913616917) * 1551316927;
			aBool8190 = true;
		} else if (44 == i) {
			int i_108_ = class572_sub15.readUnsignedShort(647518597);
			int i_109_ = 0;
			for (int i_110_ = i_108_; i_110_ > 0; i_110_ >>= 1)
				i_109_++;
			((ItemDefinitions) this).aByteArray8162 = new byte[i_109_];
			byte i_111_ = 0;
			for (int i_112_ = 0; i_112_ < i_109_; i_112_++) {
				if ((i_108_ & 1 << i_112_) > 0) {
					((ItemDefinitions) this).aByteArray8162[i_112_] = i_111_;
					i_111_++;
				} else
					((ItemDefinitions) this).aByteArray8162[i_112_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_113_ = class572_sub15.readUnsignedShort(647518597);
			int i_114_ = 0;
			for (int i_115_ = i_113_; i_115_ > 0; i_115_ >>= 1)
				i_114_++;
			((ItemDefinitions) this).aByteArray8133 = new byte[i_114_];
			byte i_116_ = 0;
			for (int i_117_ = 0; i_117_ < i_114_; i_117_++) {
				if ((i_113_ & 1 << i_117_) > 0) {
					((ItemDefinitions) this).aByteArray8133[i_117_] = i_116_;
					i_116_++;
				} else
					((ItemDefinitions) this).aByteArray8133[i_117_] = (byte) -1;
			}
		} else if (65 == i)
			aBool8183 = true;
		else if (i == 78)
			((ItemDefinitions) this).anInt8155 = class572_sub15.readBigSmart((byte) 64) * 1699069027;
		else if (i == 79)
			((ItemDefinitions) this).anInt8156 = class572_sub15.readBigSmart((byte) 104) * -560786309;
		else if (i == 90)
			((ItemDefinitions) this).anInt8163 = class572_sub15.readBigSmart((byte) 105) * -1460475531;
		else if (i == 91)
			((ItemDefinitions) this).anInt8165 = class572_sub15.readBigSmart((byte) 13) * 1491357221;
		else if (92 == i)
			((ItemDefinitions) this).anInt8164 = class572_sub15.readBigSmart((byte) 29) * 1143540903;
		else if (93 == i)
			((ItemDefinitions) this).anInt8148 = class572_sub15.readBigSmart((byte) 71) * 622463121;
		else if (i == 94)
			anInt8124 = class572_sub15.readUnsignedShort(647518597) * -1843907425;
		else if (95 == i)
			anInt8166 = class572_sub15.readUnsignedShort(647518597) * 497153465;
		else if (96 == i)
			anInt8184 = class572_sub15.readUnsignedByte(1463263475) * -1121923473;
		else if (97 == i)
			anInt8170 = class572_sub15.readUnsignedShort(647518597) * 1766636639;
		else if (98 == i)
			anInt8169 = class572_sub15.readUnsignedShort(647518597) * 75825745;
		else if (i >= 100 && i < 110) {
			if (((ItemDefinitions) this).anIntArray8167 == null) {
				((ItemDefinitions) this).anIntArray8167 = new int[10];
				((ItemDefinitions) this).anIntArray8168 = new int[10];
			}
			((ItemDefinitions) this).anIntArray8167[i - 100] = class572_sub15.readUnsignedShort(647518597);
			((ItemDefinitions) this).anIntArray8168[i - 100] = class572_sub15.readUnsignedShort(647518597);
		} else if (i == 110)
			((ItemDefinitions) this).anInt8177 = class572_sub15.readUnsignedShort(647518597) * 271346997;
		else if (i == 111)
			((ItemDefinitions) this).anInt8149 = class572_sub15.readUnsignedShort(647518597) * 1122882873;
		else if (i == 112)
			((ItemDefinitions) this).anInt8182 = class572_sub15.readUnsignedShort(647518597) * 645161119;
		else if (i == 113)
			((ItemDefinitions) this).anInt8186 = class572_sub15.readByte(210586822) * 1869319277;
		else if (i == 114)
			((ItemDefinitions) this).anInt8181 = class572_sub15.readByte(1077282177) * -833724771;
		else if (115 == i)
			anInt8137 = class572_sub15.readUnsignedByte(281971451) * 166200085;
		else if (121 == i)
			((ItemDefinitions) this).anInt8122 = class572_sub15.readUnsignedShort(647518597) * -239849301;
		else if (i == 122)
			anInt8172 = class572_sub15.readUnsignedShort(647518597) * 110250543;
		else if (i == 125) {
			((ItemDefinitions) this).anInt8115 = (class572_sub15.readByte(372423198) << 2) * -765489449;
			((ItemDefinitions) this).anInt8159 = (class572_sub15.readByte(1142222156) << 2) * 984980299;
			((ItemDefinitions) this).anInt8187 = (class572_sub15.readByte(1463543213) << 2) * 160606435;
		} else if (126 == i) {
			((ItemDefinitions) this).anInt8158 = (class572_sub15.readByte(602968188) << 2) * 1177310869;
			((ItemDefinitions) this).anInt8135 = (class572_sub15.readByte(2085199202) << 2) * -2114536221;
			((ItemDefinitions) this).anInt8131 = (class572_sub15.readByte(1822952584) << 2) * -895293173;
		} else if (i == 127 || i == 128 || 129 == i || 130 == i) {
			class572_sub15.readUnsignedByte(189692894);
			class572_sub15.readUnsignedShort(647518597);
		} else if (i == 132) {
			int i_118_ = class572_sub15.readUnsignedByte(2033941577);
			anIntArray8160 = new int[i_118_];
			for (int i_119_ = 0; i_119_ < i_118_; i_119_++)
				anIntArray8160[i_119_] = class572_sub15.readUnsignedShort(647518597);
		} else if (i == 134)
			anInt8136 = class572_sub15.readUnsignedByte(1088912899) * 998343161;
		else if (i == 139)
			((ItemDefinitions) this).anInt8176 = class572_sub15.readUnsignedShort(647518597) * 410997517;
		else if (i == 140)
			anInt8188 = class572_sub15.readUnsignedShort(647518597) * -674683849;
		else if (i >= 142 && i < 147) {
			if (((ItemDefinitions) this).anIntArray8146 == null) {
				((ItemDefinitions) this).anIntArray8146 = new int[6];
				Arrays.fill(((ItemDefinitions) this).anIntArray8146, -1);
			}
			((ItemDefinitions) this).anIntArray8146[i - 142] = class572_sub15.readUnsignedShort(647518597);
		} else if (i >= 150 && i < 155) {
			if (null == ((ItemDefinitions) this).anIntArray8147) {
				((ItemDefinitions) this).anIntArray8147 = new int[5];
				Arrays.fill(((ItemDefinitions) this).anIntArray8147, -1);
			}
			((ItemDefinitions) this).anIntArray8147[i - 150] = class572_sub15.readUnsignedShort(647518597);
		} else if (i != 156) {
			if (157 == i)
				aBool8192 = true;
			else if (161 == i)
				anInt8173 = class572_sub15.readUnsignedShort(647518597) * -1557694805;
			else if (i == 162)
				anInt8171 = class572_sub15.readUnsignedShort(647518597) * 327439013;
			else if (163 == i)
				anInt8178 = class572_sub15.readUnsignedShort(647518597) * 584690215;
			else if (i == 164)
				((ItemDefinitions) this).aString8175 = class572_sub15.readString(1295706626);
			else if (i == 165)
				anInt8174 = -1169813762;
			else if (249 == i) {
				int i_120_ = class572_sub15.readUnsignedByte(811031108);
				if (((ItemDefinitions) this).aClass676_8185 == null) {
					int i_121_ = HashTable.nextPowerOfTwo(i_120_, 339238121);
					((ItemDefinitions) this).aClass676_8185 = new Class676(i_121_);
				}
				for (int i_122_ = 0; i_122_ < i_120_; i_122_++) {
					boolean bool = class572_sub15.readUnsignedByte(502501794) == 1;
					int i_123_ = class572_sub15.read24BitInt(1140925462);
					Class572 class572;
					if (bool)
						class572 = new LinkableObject(class572_sub15.readString(1295706626));
					else
						class572 = new LinkableInt(class572_sub15.readInt(187773728));
					((ItemDefinitions) this).aClass676_8185.put(class572, (long) i_123_);
				}
			}
		}
	}

	public int method7541(int i, int i_124_) {
		if (null == ((ItemDefinitions) this).aClass676_8185)
			return i_124_;
		LinkableInt class572_sub26 = ((LinkableInt) ((ItemDefinitions) this).aClass676_8185.get((long) i));
		if (null == class572_sub26)
			return i_124_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public int method7542(int i, int i_125_) {
		if (null == ((ItemDefinitions) this).aClass676_8185)
			return i_125_;
		LinkableInt class572_sub26 = ((LinkableInt) ((ItemDefinitions) this).aClass676_8185.get((long) i));
		if (null == class572_sub26)
			return i_125_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public int method7543(int i) {
		if (null == ((ItemDefinitions) this).anIntArray8146)
			return -1;
		return ((ItemDefinitions) this).anIntArray8146[i];
	}

	public int method7544(int i) {
		if (null == ((ItemDefinitions) this).anIntArray8146)
			return -1;
		return ((ItemDefinitions) this).anIntArray8146[i];
	}

	public int method7545(int i) {
		if (null == ((ItemDefinitions) this).anIntArray8147)
			return -1;
		return ((ItemDefinitions) this).anIntArray8147[i];
	}

	public int method7546(int i) {
		if (null == ((ItemDefinitions) this).anIntArray8147)
			return -1;
		return ((ItemDefinitions) this).anIntArray8147[i];
	}

	static final void method7547(Cs2Executor class441, byte i) {
		int i_126_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_126_, (short) 19877);
		Class83 class83 = Class534.aClass83Array5975[i_126_ >> 16];
		Class7.method508(class73, class83, class441, 1771755046);
	}
}
