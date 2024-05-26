package game;

/* Class572_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub24 extends Class572 {
	public Class665_Sub4 aClass665_Sub4_9200;
	public Class665_Sub1 aClass665_Sub1_9201;
	public Class665_Sub32 aClass665_Sub32_9202;
	public Class665_Sub2 aClass665_Sub2_9203;
	public Class665_Sub20 aClass665_Sub20_9204;
	public Class665_Sub30 aClass665_Sub30_9205;
	public Class665_Sub18 aClass665_Sub18_9206;
	public Class665_Sub22 aClass665_Sub22_9207;
	public Class665_Sub23 aClass665_Sub23_9208;
	Class665_Sub9 aClass665_Sub9_9209;
	public Class665_Sub21 aClass665_Sub21_9210;
	public Class665_Sub10 aClass665_Sub10_9211;
	public Class665_Sub29 aClass665_Sub29_9212;
	public Class665_Sub25 aClass665_Sub25_9213;
	public Class665_Sub27 aClass665_Sub27_9214;
	public Class665_Sub14 aClass665_Sub14_9215;
	public static final int anInt9216 = 245;
	Class437 aClass437_9217;
	public Class665_Sub28 aClass665_Sub28_9218;
	public Class665_Sub11 aClass665_Sub11_9219;
	public Class665_Sub13 aClass665_Sub13_9220;
	public Class665_Sub24 aClass665_Sub24_9221;
	public Class665_Sub6 aClass665_Sub6_9222;
	public Class665_Sub34 aClass665_Sub34_9223;
	public static final int anInt9224 = 500;
	Class673 aClass673_9225;
	public Class665_Sub15 aClass665_Sub15_9226;
	public Class665_Sub7 aClass665_Sub7_9227;
	public Class665_Sub31 aClass665_Sub31_9228;
	static final int anInt9229 = 34;
	public Class665_Sub12 aClass665_Sub12_9230;
	public Class665_Sub30 aClass665_Sub30_9231;
	static final int anInt9232 = 44;
	public Class665_Sub35 aClass665_Sub35_9233;
	public Class665_Sub20 aClass665_Sub20_9234;
	public Class665_Sub1 aClass665_Sub1_9235;
	public Class665_Sub16 aClass665_Sub16_9236;
	public Class665_Sub19 aClass665_Sub19_9237;
	public Class665_Sub33 aClass665_Sub33_9238;
	public Class665_Sub3 aClass665_Sub3_9239;
	public Class665_Sub26 aClass665_Sub26_9240;
	public Class665_Sub17 aClass665_Sub17_9241;
	Class665_Sub8 aClass665_Sub8_9242;
	public Class665_Sub15 aClass665_Sub15_9243;
	public Class665_Sub15 aClass665_Sub15_9244;
	public Class665_Sub15 aClass665_Sub15_9245;
	public Class665_Sub15 musicVolume;
	public Class665_Sub2 aClass665_Sub2_9247;
	public Class665_Sub5 aClass665_Sub5_9248;
	static final int anInt9249 = 23;

	public Class572_Sub24(RSByteBuffer class572_sub15, Class437 class437, int i) {
		((Class572_Sub24) this).aClass437_9217 = class437;
		((Class572_Sub24) this).aClass673_9225 = new Class673(-456796019 * Class584.anInt7769, 133994349 * Class584.anInt7742, Class184.aString2167.indexOf("arm") != -1, Class572_Sub12_Sub2.aString11255.startsWith("win"));
		aClass665_Sub30_9205 = new Class665_Sub30(i, this);
		method8621(class572_sub15, 483161518);
	}

	void method8609(boolean bool, boolean bool_0_, int i) {
		if (bool || aClass665_Sub32_9202 == null)
			aClass665_Sub32_9202 = new Class665_Sub32(this);
		if (bool || null == aClass665_Sub2_9247)
			aClass665_Sub2_9247 = new Class665_Sub2(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub9_9209)
			((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(this);
		if (bool || null == aClass665_Sub2_9203)
			aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(1734566843), this);
		if (bool || aClass665_Sub21_9210 == null)
			aClass665_Sub21_9210 = new Class665_Sub21(this);
		if (bool || aClass665_Sub10_9211 == null)
			aClass665_Sub10_9211 = new Class665_Sub10(this);
		if (bool || null == aClass665_Sub29_9212)
			aClass665_Sub29_9212 = new Class665_Sub29(this);
		if (bool || null == aClass665_Sub27_9214)
			aClass665_Sub27_9214 = new Class665_Sub27(this);
		if (bool || null == aClass665_Sub14_9215)
			aClass665_Sub14_9215 = new Class665_Sub14(this);
		if (bool || null == aClass665_Sub11_9219)
			aClass665_Sub11_9219 = new Class665_Sub11(this);
		if (bool || null == aClass665_Sub23_9208)
			aClass665_Sub23_9208 = new Class665_Sub23(this);
		if (bool || aClass665_Sub28_9218 == null)
			aClass665_Sub28_9218 = new Class665_Sub28(this);
		if (bool || aClass665_Sub26_9240 == null)
			aClass665_Sub26_9240 = new Class665_Sub26(this);
		if (bool || null == aClass665_Sub13_9220)
			aClass665_Sub13_9220 = new Class665_Sub13(this);
		if (bool || null == aClass665_Sub24_9221)
			aClass665_Sub24_9221 = new Class665_Sub24(this);
		if (bool || null == aClass665_Sub6_9222)
			aClass665_Sub6_9222 = new Class665_Sub6(this);
		if (bool || aClass665_Sub34_9223 == null)
			aClass665_Sub34_9223 = new Class665_Sub34(this);
		if (bool || null == aClass665_Sub4_9200)
			aClass665_Sub4_9200 = new Class665_Sub4(this);
		if (bool || aClass665_Sub1_9235 == null)
			aClass665_Sub1_9235 = new Class665_Sub1(this);
		if (bool || null == aClass665_Sub1_9201)
			aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(-1935321203), this);
		if (bool || null == aClass665_Sub7_9227)
			aClass665_Sub7_9227 = new Class665_Sub7(this);
		if (bool || null == aClass665_Sub31_9228)
			aClass665_Sub31_9228 = new Class665_Sub31(this);
		if (bool || null == aClass665_Sub5_9248)
			aClass665_Sub5_9248 = new Class665_Sub5(this);
		if (bool || aClass665_Sub12_9230 == null)
			aClass665_Sub12_9230 = new Class665_Sub12(this);
		if (bool || null == aClass665_Sub30_9231)
			aClass665_Sub30_9231 = new Class665_Sub30(this);
		if (bool || aClass665_Sub30_9205 == null)
			aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1961117420), this);
		if (bool || aClass665_Sub35_9233 == null)
			aClass665_Sub35_9233 = new Class665_Sub35(this);
		if (bool || aClass665_Sub20_9234 == null)
			aClass665_Sub20_9234 = new Class665_Sub20(this);
		if (bool || aClass665_Sub20_9204 == null)
			aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(1796602989), this);
		if (bool || aClass665_Sub16_9236 == null)
			aClass665_Sub16_9236 = new Class665_Sub16(this);
		if (bool || null == aClass665_Sub19_9237)
			aClass665_Sub19_9237 = new Class665_Sub19(this);
		if (bool || null == aClass665_Sub33_9238)
			aClass665_Sub33_9238 = new Class665_Sub33(this);
		if (bool || aClass665_Sub3_9239 == null)
			aClass665_Sub3_9239 = new Class665_Sub3(this);
		if (bool || null == aClass665_Sub22_9207)
			aClass665_Sub22_9207 = new Class665_Sub22(this);
		if (bool || null == aClass665_Sub17_9241)
			aClass665_Sub17_9241 = new Class665_Sub17(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub8_9242)
			((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(this);
		if (bool || aClass665_Sub25_9213 == null)
			aClass665_Sub25_9213 = new Class665_Sub25(this);
		if (bool || bool_0_ || null == aClass665_Sub15_9243)
			aClass665_Sub15_9243 = new Class665_Sub15(this);
		if (bool || bool_0_ || aClass665_Sub15_9244 == null)
			aClass665_Sub15_9244 = new Class665_Sub15(this);
		if (bool || bool_0_ || aClass665_Sub15_9245 == null)
			aClass665_Sub15_9245 = new Class665_Sub15(this);
		if (bool || bool_0_ || musicVolume == null)
			musicVolume = new Class665_Sub15(this);
		if (bool || bool_0_ || null == aClass665_Sub15_9226)
			aClass665_Sub15_9226 = new Class665_Sub15(this);
		if (bool || bool_0_ || aClass665_Sub18_9206 == null)
			aClass665_Sub18_9206 = new Class665_Sub18(this);
	}

	void method8610(RSByteBuffer class572_sub15, int i, short i_1_) {
		aClass665_Sub10_9211 = new Class665_Sub10(class572_sub15.readUnsignedByte(1045302348), this);
		class572_sub15.o += 310393755;
		aClass665_Sub1_9235 = new Class665_Sub1(class572_sub15.readUnsignedByte(2133195515) + 1, this);
		aClass665_Sub28_9218 = new Class665_Sub28(class572_sub15.readUnsignedByte(1883592867), this);
		class572_sub15.o += 310393755;
		aClass665_Sub26_9240 = new Class665_Sub26(class572_sub15.readUnsignedByte(554121092), this);
		aClass665_Sub14_9215 = new Class665_Sub14(class572_sub15.readUnsignedByte(1893783458), this);
		class572_sub15.readUnsignedByte(1077081242);
		aClass665_Sub5_9248 = new Class665_Sub5(class572_sub15.readUnsignedByte(413231098), this);
		int i_2_ = class572_sub15.readUnsignedByte(1255674281);
		int i_3_ = 0;
		if (i >= 17)
			i_3_ = class572_sub15.readUnsignedByte(408441364);
		aClass665_Sub24_9221 = new Class665_Sub24(i_2_ > i_3_ ? i_2_ : i_3_, this);
		boolean bool = true;
		boolean bool_4_ = true;
		if (i >= 2) {
			bool = class572_sub15.readUnsignedByte(364733249) == 1;
			if (i >= 17)
				bool_4_ = class572_sub15.readUnsignedByte(162187554) == 1;
		} else {
			bool = class572_sub15.readUnsignedByte(164792017) == 1;
			class572_sub15.readUnsignedByte(846584237);
		}
		aClass665_Sub13_9220 = new Class665_Sub13(bool | bool_4_ ? 1 : 0, this);
		aClass665_Sub35_9233 = new Class665_Sub35(class572_sub15.readUnsignedByte(688699011), this);
		aClass665_Sub11_9219 = new Class665_Sub11(class572_sub15.readUnsignedByte(448563826), this);
		aClass665_Sub2_9247 = new Class665_Sub2(class572_sub15.readUnsignedByte(388656437), this);
		aClass665_Sub18_9206 = new Class665_Sub18(class572_sub15.readUnsignedByte(1781625018), this);
		aClass665_Sub15_9243 = new Class665_Sub15(class572_sub15.readUnsignedByte(2077339411), this);
		if (i >= 20)
			aClass665_Sub15_9245 = new Class665_Sub15(class572_sub15.readUnsignedByte(1365881286), this);
		else
			aClass665_Sub15_9245 = new Class665_Sub15(aClass665_Sub15_9243.method8970(660014728), this);
		musicVolume = new Class665_Sub15(class572_sub15.readUnsignedByte(712974281), this);
		aClass665_Sub15_9244 = new Class665_Sub15(class572_sub15.readUnsignedByte(244498414), this);
		if (i >= 21)
			aClass665_Sub15_9226 = new Class665_Sub15(class572_sub15.readUnsignedByte(1202727127), this);
		else
			aClass665_Sub15_9226 = new Class665_Sub15(musicVolume.method8970(660014728), this);
		if (i >= 1) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedShort(647518597);
		}
		if (i >= 3 && i < 6)
			class572_sub15.readUnsignedByte(1144041957);
		if (i >= 4)
			aClass665_Sub4_9200 = new Class665_Sub4(class572_sub15.readUnsignedByte(2104016837), this);
		class572_sub15.readInt(806917926);
		if (i >= 6)
			aClass665_Sub20_9234 = new Class665_Sub20(class572_sub15.readUnsignedByte(112399364), this);
		if (i >= 7)
			aClass665_Sub22_9207 = new Class665_Sub22(class572_sub15.readUnsignedByte(445658943), this);
		if (i >= 8)
			class572_sub15.readUnsignedByte(2059019273);
		if (i >= 9)
			aClass665_Sub29_9212 = new Class665_Sub29(class572_sub15.readUnsignedByte(982194388), this);
		if (i >= 10)
			aClass665_Sub21_9210 = new Class665_Sub21(class572_sub15.readUnsignedByte(97541397), this);
		if (i >= 11)
			aClass665_Sub16_9236 = new Class665_Sub16(class572_sub15.readUnsignedByte(1390486554), this);
		if (i >= 12)
			aClass665_Sub26_9240 = new Class665_Sub26(class572_sub15.readUnsignedByte(205336722), this);
		if (i >= 13)
			aClass665_Sub23_9208 = new Class665_Sub23(class572_sub15.readUnsignedByte(1756411666), this);
		if (i >= 14)
			aClass665_Sub30_9231 = new Class665_Sub30(class572_sub15.readUnsignedByte(149521269), this);
		if (i >= 15)
			aClass665_Sub33_9238 = new Class665_Sub33(class572_sub15.readUnsignedByte(1943381227), this);
		if (i >= 16)
			aClass665_Sub12_9230 = new Class665_Sub12(class572_sub15.readUnsignedByte(2039704666), this);
		if (i >= 18)
			aClass665_Sub19_9237 = new Class665_Sub19(class572_sub15.readUnsignedByte(906304620), this);
		if (i >= 19)
			aClass665_Sub7_9227 = new Class665_Sub7(class572_sub15.readUnsignedByte(1716724055), this);
		if (i >= 22)
			aClass665_Sub3_9239 = new Class665_Sub3(class572_sub15.readUnsignedByte(2094326239), this);
	}

	public RSByteBuffer method8611(int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(44);
		class572_sub15.writeByte(34, -1384395473);
		class572_sub15.writeByte(aClass665_Sub32_9202.method9153(2108763655), -1384395473);
		class572_sub15.writeByte(aClass665_Sub2_9247.method8120(1593841576), -1384395473);
		class572_sub15.writeByte(((Class572_Sub24) this).aClass665_Sub9_9209.method8179((short) 17911), -1384395473);
		class572_sub15.writeByte(aClass665_Sub21_9210.method9045(769854921), -1384395473);
		class572_sub15.writeByte(aClass665_Sub10_9211.method8190(614563141), -1384395473);
		class572_sub15.writeByte(aClass665_Sub29_9212.method9121(1134939369), -1384395473);
		class572_sub15.writeByte(aClass665_Sub27_9214.method9100(1516174876), -1384395473);
		class572_sub15.writeByte(aClass665_Sub14_9215.method8241((byte) 6), -1384395473);
		class572_sub15.writeByte(aClass665_Sub11_9219.method8203(1515773199), -1384395473);
		class572_sub15.writeByte(aClass665_Sub23_9208.method9058((byte) 73), -1384395473);
		class572_sub15.writeByte(aClass665_Sub28_9218.method9109(-477232025), -1384395473);
		class572_sub15.writeByte(aClass665_Sub26_9240.method9090(1384739083), -1384395473);
		class572_sub15.writeByte(aClass665_Sub13_9220.method8236(130276068), -1384395473);
		class572_sub15.writeByte(aClass665_Sub24_9221.method9070((byte) 49), -1384395473);
		class572_sub15.writeByte(aClass665_Sub6_9222.method8156((short) 4095), -1384395473);
		class572_sub15.writeByte(0, -1384395473);
		class572_sub15.writeByte(aClass665_Sub34_9223.method9173(1824130277), -1384395473);
		class572_sub15.writeByte(aClass665_Sub4_9200.method8132(1101638087), -1384395473);
		class572_sub15.writeByte(aClass665_Sub1_9235.method8101(201456727), -1384395473);
		class572_sub15.writeByte(aClass665_Sub7_9227.method8165(1302336574), -1384395473);
		class572_sub15.writeByte(aClass665_Sub31_9228.method9141(1044574983), -1384395473);
		class572_sub15.writeByte(aClass665_Sub5_9248.method8148(1068793870), -1384395473);
		class572_sub15.writeByte(aClass665_Sub12_9230.method8213(-2008324424), -1384395473);
		class572_sub15.writeByte(aClass665_Sub30_9231.method9129(2122306351), -1384395473);
		class572_sub15.writeByte(0, -1384395473);
		class572_sub15.writeByte(aClass665_Sub35_9233.method9183(-1766763163), -1384395473);
		class572_sub15.writeByte(aClass665_Sub20_9234.method9038(1197466271), -1384395473);
		class572_sub15.writeByte(aClass665_Sub16_9236.method8983(1837656090), -1384395473);
		class572_sub15.writeByte(aClass665_Sub19_9237.method9030(166869769), -1384395473);
		class572_sub15.writeByte(aClass665_Sub33_9238.method9169((byte) 9), -1384395473);
		class572_sub15.writeByte(aClass665_Sub3_9239.method8122(89230085), -1384395473);
		class572_sub15.writeByte(aClass665_Sub22_9207.method9048(-414103683), -1384395473);
		class572_sub15.writeByte(aClass665_Sub17_9241.method9008(-1578822099), -1384395473);
		class572_sub15.writeByte(((Class572_Sub24) this).aClass665_Sub8_9242.method8173(-841878221), -1384395473);
		class572_sub15.writeByte(aClass665_Sub25_9213.method9084(644616847), -1384395473);
		class572_sub15.writeByte(aClass665_Sub15_9243.method8970(660014728), -1384395473);
		class572_sub15.writeByte(aClass665_Sub15_9244.method8970(660014728), -1384395473);
		class572_sub15.writeByte(aClass665_Sub15_9245.method8970(660014728), -1384395473);
		class572_sub15.writeByte(musicVolume.method8970(660014728), -1384395473);
		class572_sub15.writeByte(aClass665_Sub15_9226.method8970(660014728), -1384395473);
		class572_sub15.writeByte(aClass665_Sub18_9206.method9016(483113396), -1384395473);
		return class572_sub15;
	}

	public void method8612(Class665_Sub30 class665_sub30, boolean bool, byte i) {
		class665_sub30.method9131(bool, -1993223830);
		method8613(269334018);
	}

	void method8613(int i) {
		aClass665_Sub32_9202.method9150(1170696214);
		aClass665_Sub2_9247.method8115(-362424668);
		((Class572_Sub24) this).aClass665_Sub9_9209.method8178(-188053614);
		aClass665_Sub2_9203.method8115(-1160691966);
		aClass665_Sub21_9210.method9042((byte) 76);
		aClass665_Sub10_9211.method8193(1104484692);
		aClass665_Sub29_9212.method9120(-648940047);
		aClass665_Sub27_9214.method9101(-478815323);
		aClass665_Sub14_9215.method8242((byte) 8);
		aClass665_Sub11_9219.method8200(140964270);
		aClass665_Sub23_9208.method9056(864174512);
		aClass665_Sub28_9218.method9113(-279550995);
		aClass665_Sub26_9240.method9092(718530680);
		aClass665_Sub13_9220.method8235(1161317196);
		aClass665_Sub24_9221.method9074(-2034547725);
		aClass665_Sub6_9222.method8157(673572675);
		aClass665_Sub34_9223.method9170((byte) -24);
		aClass665_Sub4_9200.method8130(-1042067865);
		aClass665_Sub1_9235.method8100(-51777458);
		aClass665_Sub1_9201.method8100(-1494078039);
		aClass665_Sub7_9227.method8163(-655387767);
		aClass665_Sub31_9228.method9142(2000189866);
		aClass665_Sub5_9248.method8150((byte) -15);
		aClass665_Sub12_9230.method8216(259050349);
		aClass665_Sub30_9231.method9133(2049935718);
		aClass665_Sub30_9205.method9133(1996915574);
		aClass665_Sub35_9233.method9184((byte) -19);
		aClass665_Sub20_9234.method9039((byte) 50);
		aClass665_Sub20_9204.method9039((byte) 33);
		aClass665_Sub16_9236.method8981((short) 797);
		aClass665_Sub19_9237.method9029((short) 736);
		aClass665_Sub33_9238.method9161(-1719951055);
		aClass665_Sub3_9239.method8124((byte) -29);
		aClass665_Sub22_9207.method9049(-1990679661);
		aClass665_Sub17_9241.method9007(-1314255521);
		((Class572_Sub24) this).aClass665_Sub8_9242.method8172(-382724039);
		aClass665_Sub25_9213.method9086(-555878228);
		aClass665_Sub15_9243.method8969((byte) -101);
		aClass665_Sub15_9244.method8969((byte) -55);
		aClass665_Sub15_9245.method8969((byte) -120);
		musicVolume.method8969((byte) -121);
		aClass665_Sub15_9226.method8969((byte) -102);
		aClass665_Sub18_9206.method9014(1437000367);
	}

	public Class673 method8614(byte i) {
		return ((Class572_Sub24) this).aClass673_9225;
	}

	public Class437 method8615(int i) {
		return ((Class572_Sub24) this).aClass437_9217;
	}

	void method8616(RSByteBuffer class572_sub15) {
		if (null == class572_sub15 || null == class572_sub15.b)
			method8609(true, true, 286438080);
		else {
			int i = class572_sub15.readUnsignedByte(496531466);
			if (i < 23) {
				try {
					method8610(class572_sub15, i, (short) 14936);
				} catch (Exception exception) {
					method8609(true, true, 1654276083);
				}
				method8609(false, true, 1625528092);
			} else if (i > 34)
				method8609(true, true, -21739054);
			else {
				if (i >= 29)
					aClass665_Sub32_9202 = new Class665_Sub32(class572_sub15.readUnsignedByte(1584676172), this);
				aClass665_Sub2_9247 = new Class665_Sub2(class572_sub15.readUnsignedByte(1911826293), this);
				if (i >= 31)
					((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(class572_sub15.readUnsignedByte(479014796), this);
				aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(1584704950), this);
				aClass665_Sub21_9210 = new Class665_Sub21(class572_sub15.readUnsignedByte(1087161990), this);
				aClass665_Sub10_9211 = new Class665_Sub10(class572_sub15.readUnsignedByte(2040562173), this);
				aClass665_Sub29_9212 = new Class665_Sub29(class572_sub15.readUnsignedByte(1492069420), this);
				if (i >= 27)
					aClass665_Sub27_9214 = new Class665_Sub27(class572_sub15.readUnsignedByte(172500750), this);
				aClass665_Sub14_9215 = new Class665_Sub14(class572_sub15.readUnsignedByte(988448521), this);
				aClass665_Sub11_9219 = new Class665_Sub11(class572_sub15.readUnsignedByte(1772088359), this);
				aClass665_Sub23_9208 = new Class665_Sub23(class572_sub15.readUnsignedByte(649064014), this);
				aClass665_Sub28_9218 = new Class665_Sub28(class572_sub15.readUnsignedByte(1900748668), this);
				aClass665_Sub26_9240 = new Class665_Sub26(class572_sub15.readUnsignedByte(1662630273), this);
				aClass665_Sub13_9220 = new Class665_Sub13(class572_sub15.readUnsignedByte(1834364459), this);
				aClass665_Sub24_9221 = new Class665_Sub24(class572_sub15.readUnsignedByte(915769847), this);
				if (i >= 33)
					aClass665_Sub6_9222 = new Class665_Sub6(class572_sub15.readUnsignedByte(2099485619), this);
				if (i >= 34)
					class572_sub15.readUnsignedByte(1984765336);
				if (i >= 24)
					aClass665_Sub34_9223 = new Class665_Sub34(class572_sub15.readUnsignedByte(168306193), this);
				aClass665_Sub4_9200 = new Class665_Sub4(class572_sub15.readUnsignedByte(985578025), this);
				aClass665_Sub1_9235 = new Class665_Sub1(class572_sub15.readUnsignedByte(842855887), this);
				aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(1389741439), this);
				aClass665_Sub7_9227 = new Class665_Sub7(class572_sub15.readUnsignedByte(1003586450), this);
				if (i >= 25)
					aClass665_Sub31_9228 = new Class665_Sub31(class572_sub15.readUnsignedByte(1957658786), this);
				aClass665_Sub5_9248 = new Class665_Sub5(class572_sub15.readUnsignedByte(39211643), this);
				if (i <= 25)
					class572_sub15.o += 310393755;
				aClass665_Sub12_9230 = new Class665_Sub12(class572_sub15.readUnsignedByte(1305667830), this);
				aClass665_Sub30_9231 = new Class665_Sub30(class572_sub15.readUnsignedByte(434781839), this);
				aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1578825681), this);
				class572_sub15.readUnsignedByte(1988962741);
				aClass665_Sub35_9233 = new Class665_Sub35(class572_sub15.readUnsignedByte(282578180), this);
				aClass665_Sub20_9234 = new Class665_Sub20(class572_sub15.readUnsignedByte(115937523), this);
				aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(-1173707162), this);
				aClass665_Sub16_9236 = new Class665_Sub16(class572_sub15.readUnsignedByte(1836738652), this);
				aClass665_Sub19_9237 = new Class665_Sub19(class572_sub15.readUnsignedByte(1755879365), this);
				aClass665_Sub33_9238 = new Class665_Sub33(class572_sub15.readUnsignedByte(904345166), this);
				aClass665_Sub3_9239 = new Class665_Sub3(class572_sub15.readUnsignedByte(1827769859), this);
				aClass665_Sub22_9207 = new Class665_Sub22(class572_sub15.readUnsignedByte(1449376309), this);
				if (i >= 26)
					aClass665_Sub17_9241 = new Class665_Sub17(class572_sub15.readUnsignedByte(675813601), this);
				if (i >= 28)
					((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(class572_sub15.readUnsignedByte(826888831), this);
				if (i >= 30)
					aClass665_Sub25_9213 = new Class665_Sub25(class572_sub15.readUnsignedByte(615182648), this);
				aClass665_Sub15_9243 = new Class665_Sub15(class572_sub15.readUnsignedByte(1408889066), this);
				aClass665_Sub15_9244 = new Class665_Sub15(class572_sub15.readUnsignedByte(476960157), this);
				aClass665_Sub15_9245 = new Class665_Sub15(class572_sub15.readUnsignedByte(573732207), this);
				musicVolume = new Class665_Sub15(class572_sub15.readUnsignedByte(1830186276), this);
				aClass665_Sub15_9226 = new Class665_Sub15(class572_sub15.readUnsignedByte(349329190), this);
				aClass665_Sub18_9206 = new Class665_Sub18(class572_sub15.readUnsignedByte(194502828), this);
				method8609(false, i < 32, 1611027513);
			}
		}
		method8613(1577868867);
	}

	void method8617(RSByteBuffer class572_sub15) {
		if (null == class572_sub15 || null == class572_sub15.b)
			method8609(true, true, -459821795);
		else {
			int i = class572_sub15.readUnsignedByte(229373778);
			if (i < 23) {
				try {
					method8610(class572_sub15, i, (short) -6146);
				} catch (Exception exception) {
					method8609(true, true, -1639134);
				}
				method8609(false, true, 1601218950);
			} else if (i > 34)
				method8609(true, true, 1560644769);
			else {
				if (i >= 29)
					aClass665_Sub32_9202 = new Class665_Sub32(class572_sub15.readUnsignedByte(1076012837), this);
				aClass665_Sub2_9247 = new Class665_Sub2(class572_sub15.readUnsignedByte(496710426), this);
				if (i >= 31)
					((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(class572_sub15.readUnsignedByte(824956970), this);
				aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(1521060515), this);
				aClass665_Sub21_9210 = new Class665_Sub21(class572_sub15.readUnsignedByte(1430258708), this);
				aClass665_Sub10_9211 = new Class665_Sub10(class572_sub15.readUnsignedByte(349928743), this);
				aClass665_Sub29_9212 = new Class665_Sub29(class572_sub15.readUnsignedByte(930387992), this);
				if (i >= 27)
					aClass665_Sub27_9214 = new Class665_Sub27(class572_sub15.readUnsignedByte(385008323), this);
				aClass665_Sub14_9215 = new Class665_Sub14(class572_sub15.readUnsignedByte(422258122), this);
				aClass665_Sub11_9219 = new Class665_Sub11(class572_sub15.readUnsignedByte(90331591), this);
				aClass665_Sub23_9208 = new Class665_Sub23(class572_sub15.readUnsignedByte(8104126), this);
				aClass665_Sub28_9218 = new Class665_Sub28(class572_sub15.readUnsignedByte(177012101), this);
				aClass665_Sub26_9240 = new Class665_Sub26(class572_sub15.readUnsignedByte(1413200500), this);
				aClass665_Sub13_9220 = new Class665_Sub13(class572_sub15.readUnsignedByte(742366000), this);
				aClass665_Sub24_9221 = new Class665_Sub24(class572_sub15.readUnsignedByte(533551686), this);
				if (i >= 33)
					aClass665_Sub6_9222 = new Class665_Sub6(class572_sub15.readUnsignedByte(945208098), this);
				if (i >= 34)
					class572_sub15.readUnsignedByte(1596191794);
				if (i >= 24)
					aClass665_Sub34_9223 = new Class665_Sub34(class572_sub15.readUnsignedByte(144912268), this);
				aClass665_Sub4_9200 = new Class665_Sub4(class572_sub15.readUnsignedByte(834462442), this);
				aClass665_Sub1_9235 = new Class665_Sub1(class572_sub15.readUnsignedByte(1586029977), this);
				aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(-1124933273), this);
				aClass665_Sub7_9227 = new Class665_Sub7(class572_sub15.readUnsignedByte(2036216782), this);
				if (i >= 25)
					aClass665_Sub31_9228 = new Class665_Sub31(class572_sub15.readUnsignedByte(697331987), this);
				aClass665_Sub5_9248 = new Class665_Sub5(class572_sub15.readUnsignedByte(1952399065), this);
				if (i <= 25)
					class572_sub15.o += 310393755;
				aClass665_Sub12_9230 = new Class665_Sub12(class572_sub15.readUnsignedByte(1057596700), this);
				aClass665_Sub30_9231 = new Class665_Sub30(class572_sub15.readUnsignedByte(-13407320), this);
				aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1561075361), this);
				class572_sub15.readUnsignedByte(442596846);
				aClass665_Sub35_9233 = new Class665_Sub35(class572_sub15.readUnsignedByte(568224198), this);
				aClass665_Sub20_9234 = new Class665_Sub20(class572_sub15.readUnsignedByte(382038234), this);
				aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(-590345792), this);
				aClass665_Sub16_9236 = new Class665_Sub16(class572_sub15.readUnsignedByte(245487209), this);
				aClass665_Sub19_9237 = new Class665_Sub19(class572_sub15.readUnsignedByte(-41223028), this);
				aClass665_Sub33_9238 = new Class665_Sub33(class572_sub15.readUnsignedByte(1984602806), this);
				aClass665_Sub3_9239 = new Class665_Sub3(class572_sub15.readUnsignedByte(1627682970), this);
				aClass665_Sub22_9207 = new Class665_Sub22(class572_sub15.readUnsignedByte(-60012324), this);
				if (i >= 26)
					aClass665_Sub17_9241 = new Class665_Sub17(class572_sub15.readUnsignedByte(2008540783), this);
				if (i >= 28)
					((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(class572_sub15.readUnsignedByte(1614536316), this);
				if (i >= 30)
					aClass665_Sub25_9213 = new Class665_Sub25(class572_sub15.readUnsignedByte(-25714848), this);
				aClass665_Sub15_9243 = new Class665_Sub15(class572_sub15.readUnsignedByte(833058020), this);
				aClass665_Sub15_9244 = new Class665_Sub15(class572_sub15.readUnsignedByte(920911020), this);
				aClass665_Sub15_9245 = new Class665_Sub15(class572_sub15.readUnsignedByte(1962829550), this);
				musicVolume = new Class665_Sub15(class572_sub15.readUnsignedByte(1840721307), this);
				aClass665_Sub15_9226 = new Class665_Sub15(class572_sub15.readUnsignedByte(1513901944), this);
				aClass665_Sub18_9206 = new Class665_Sub18(class572_sub15.readUnsignedByte(1667589933), this);
				method8609(false, i < 32, 958422393);
			}
		}
		method8613(1572978332);
	}

	void method8618(boolean bool, boolean bool_5_) {
		if (bool || aClass665_Sub32_9202 == null)
			aClass665_Sub32_9202 = new Class665_Sub32(this);
		if (bool || null == aClass665_Sub2_9247)
			aClass665_Sub2_9247 = new Class665_Sub2(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub9_9209)
			((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(this);
		if (bool || null == aClass665_Sub2_9203)
			aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(2027569919), this);
		if (bool || aClass665_Sub21_9210 == null)
			aClass665_Sub21_9210 = new Class665_Sub21(this);
		if (bool || aClass665_Sub10_9211 == null)
			aClass665_Sub10_9211 = new Class665_Sub10(this);
		if (bool || null == aClass665_Sub29_9212)
			aClass665_Sub29_9212 = new Class665_Sub29(this);
		if (bool || null == aClass665_Sub27_9214)
			aClass665_Sub27_9214 = new Class665_Sub27(this);
		if (bool || null == aClass665_Sub14_9215)
			aClass665_Sub14_9215 = new Class665_Sub14(this);
		if (bool || null == aClass665_Sub11_9219)
			aClass665_Sub11_9219 = new Class665_Sub11(this);
		if (bool || null == aClass665_Sub23_9208)
			aClass665_Sub23_9208 = new Class665_Sub23(this);
		if (bool || aClass665_Sub28_9218 == null)
			aClass665_Sub28_9218 = new Class665_Sub28(this);
		if (bool || aClass665_Sub26_9240 == null)
			aClass665_Sub26_9240 = new Class665_Sub26(this);
		if (bool || null == aClass665_Sub13_9220)
			aClass665_Sub13_9220 = new Class665_Sub13(this);
		if (bool || null == aClass665_Sub24_9221)
			aClass665_Sub24_9221 = new Class665_Sub24(this);
		if (bool || null == aClass665_Sub6_9222)
			aClass665_Sub6_9222 = new Class665_Sub6(this);
		if (bool || aClass665_Sub34_9223 == null)
			aClass665_Sub34_9223 = new Class665_Sub34(this);
		if (bool || null == aClass665_Sub4_9200)
			aClass665_Sub4_9200 = new Class665_Sub4(this);
		if (bool || aClass665_Sub1_9235 == null)
			aClass665_Sub1_9235 = new Class665_Sub1(this);
		if (bool || null == aClass665_Sub1_9201)
			aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(108064486), this);
		if (bool || null == aClass665_Sub7_9227)
			aClass665_Sub7_9227 = new Class665_Sub7(this);
		if (bool || null == aClass665_Sub31_9228)
			aClass665_Sub31_9228 = new Class665_Sub31(this);
		if (bool || null == aClass665_Sub5_9248)
			aClass665_Sub5_9248 = new Class665_Sub5(this);
		if (bool || aClass665_Sub12_9230 == null)
			aClass665_Sub12_9230 = new Class665_Sub12(this);
		if (bool || null == aClass665_Sub30_9231)
			aClass665_Sub30_9231 = new Class665_Sub30(this);
		if (bool || aClass665_Sub30_9205 == null)
			aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1966843130), this);
		if (bool || aClass665_Sub35_9233 == null)
			aClass665_Sub35_9233 = new Class665_Sub35(this);
		if (bool || aClass665_Sub20_9234 == null)
			aClass665_Sub20_9234 = new Class665_Sub20(this);
		if (bool || aClass665_Sub20_9204 == null)
			aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(-516470061), this);
		if (bool || aClass665_Sub16_9236 == null)
			aClass665_Sub16_9236 = new Class665_Sub16(this);
		if (bool || null == aClass665_Sub19_9237)
			aClass665_Sub19_9237 = new Class665_Sub19(this);
		if (bool || null == aClass665_Sub33_9238)
			aClass665_Sub33_9238 = new Class665_Sub33(this);
		if (bool || aClass665_Sub3_9239 == null)
			aClass665_Sub3_9239 = new Class665_Sub3(this);
		if (bool || null == aClass665_Sub22_9207)
			aClass665_Sub22_9207 = new Class665_Sub22(this);
		if (bool || null == aClass665_Sub17_9241)
			aClass665_Sub17_9241 = new Class665_Sub17(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub8_9242)
			((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(this);
		if (bool || aClass665_Sub25_9213 == null)
			aClass665_Sub25_9213 = new Class665_Sub25(this);
		if (bool || bool_5_ || null == aClass665_Sub15_9243)
			aClass665_Sub15_9243 = new Class665_Sub15(this);
		if (bool || bool_5_ || aClass665_Sub15_9244 == null)
			aClass665_Sub15_9244 = new Class665_Sub15(this);
		if (bool || bool_5_ || aClass665_Sub15_9245 == null)
			aClass665_Sub15_9245 = new Class665_Sub15(this);
		if (bool || bool_5_ || musicVolume == null)
			musicVolume = new Class665_Sub15(this);
		if (bool || bool_5_ || null == aClass665_Sub15_9226)
			aClass665_Sub15_9226 = new Class665_Sub15(this);
		if (bool || bool_5_ || aClass665_Sub18_9206 == null)
			aClass665_Sub18_9206 = new Class665_Sub18(this);
	}

	void method8619(boolean bool, boolean bool_6_) {
		if (bool || aClass665_Sub32_9202 == null)
			aClass665_Sub32_9202 = new Class665_Sub32(this);
		if (bool || null == aClass665_Sub2_9247)
			aClass665_Sub2_9247 = new Class665_Sub2(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub9_9209)
			((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(this);
		if (bool || null == aClass665_Sub2_9203)
			aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(1685151832), this);
		if (bool || aClass665_Sub21_9210 == null)
			aClass665_Sub21_9210 = new Class665_Sub21(this);
		if (bool || aClass665_Sub10_9211 == null)
			aClass665_Sub10_9211 = new Class665_Sub10(this);
		if (bool || null == aClass665_Sub29_9212)
			aClass665_Sub29_9212 = new Class665_Sub29(this);
		if (bool || null == aClass665_Sub27_9214)
			aClass665_Sub27_9214 = new Class665_Sub27(this);
		if (bool || null == aClass665_Sub14_9215)
			aClass665_Sub14_9215 = new Class665_Sub14(this);
		if (bool || null == aClass665_Sub11_9219)
			aClass665_Sub11_9219 = new Class665_Sub11(this);
		if (bool || null == aClass665_Sub23_9208)
			aClass665_Sub23_9208 = new Class665_Sub23(this);
		if (bool || aClass665_Sub28_9218 == null)
			aClass665_Sub28_9218 = new Class665_Sub28(this);
		if (bool || aClass665_Sub26_9240 == null)
			aClass665_Sub26_9240 = new Class665_Sub26(this);
		if (bool || null == aClass665_Sub13_9220)
			aClass665_Sub13_9220 = new Class665_Sub13(this);
		if (bool || null == aClass665_Sub24_9221)
			aClass665_Sub24_9221 = new Class665_Sub24(this);
		if (bool || null == aClass665_Sub6_9222)
			aClass665_Sub6_9222 = new Class665_Sub6(this);
		if (bool || aClass665_Sub34_9223 == null)
			aClass665_Sub34_9223 = new Class665_Sub34(this);
		if (bool || null == aClass665_Sub4_9200)
			aClass665_Sub4_9200 = new Class665_Sub4(this);
		if (bool || aClass665_Sub1_9235 == null)
			aClass665_Sub1_9235 = new Class665_Sub1(this);
		if (bool || null == aClass665_Sub1_9201)
			aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(-1452989743), this);
		if (bool || null == aClass665_Sub7_9227)
			aClass665_Sub7_9227 = new Class665_Sub7(this);
		if (bool || null == aClass665_Sub31_9228)
			aClass665_Sub31_9228 = new Class665_Sub31(this);
		if (bool || null == aClass665_Sub5_9248)
			aClass665_Sub5_9248 = new Class665_Sub5(this);
		if (bool || aClass665_Sub12_9230 == null)
			aClass665_Sub12_9230 = new Class665_Sub12(this);
		if (bool || null == aClass665_Sub30_9231)
			aClass665_Sub30_9231 = new Class665_Sub30(this);
		if (bool || aClass665_Sub30_9205 == null)
			aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1635751235), this);
		if (bool || aClass665_Sub35_9233 == null)
			aClass665_Sub35_9233 = new Class665_Sub35(this);
		if (bool || aClass665_Sub20_9234 == null)
			aClass665_Sub20_9234 = new Class665_Sub20(this);
		if (bool || aClass665_Sub20_9204 == null)
			aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(561577165), this);
		if (bool || aClass665_Sub16_9236 == null)
			aClass665_Sub16_9236 = new Class665_Sub16(this);
		if (bool || null == aClass665_Sub19_9237)
			aClass665_Sub19_9237 = new Class665_Sub19(this);
		if (bool || null == aClass665_Sub33_9238)
			aClass665_Sub33_9238 = new Class665_Sub33(this);
		if (bool || aClass665_Sub3_9239 == null)
			aClass665_Sub3_9239 = new Class665_Sub3(this);
		if (bool || null == aClass665_Sub22_9207)
			aClass665_Sub22_9207 = new Class665_Sub22(this);
		if (bool || null == aClass665_Sub17_9241)
			aClass665_Sub17_9241 = new Class665_Sub17(this);
		if (bool || null == ((Class572_Sub24) this).aClass665_Sub8_9242)
			((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(this);
		if (bool || aClass665_Sub25_9213 == null)
			aClass665_Sub25_9213 = new Class665_Sub25(this);
		if (bool || bool_6_ || null == aClass665_Sub15_9243)
			aClass665_Sub15_9243 = new Class665_Sub15(this);
		if (bool || bool_6_ || aClass665_Sub15_9244 == null)
			aClass665_Sub15_9244 = new Class665_Sub15(this);
		if (bool || bool_6_ || aClass665_Sub15_9245 == null)
			aClass665_Sub15_9245 = new Class665_Sub15(this);
		if (bool || bool_6_ || musicVolume == null)
			musicVolume = new Class665_Sub15(this);
		if (bool || bool_6_ || null == aClass665_Sub15_9226)
			aClass665_Sub15_9226 = new Class665_Sub15(this);
		if (bool || bool_6_ || aClass665_Sub18_9206 == null)
			aClass665_Sub18_9206 = new Class665_Sub18(this);
	}

	void method8620() {
		aClass665_Sub32_9202.method9150(-92530542);
		aClass665_Sub2_9247.method8115(866167201);
		((Class572_Sub24) this).aClass665_Sub9_9209.method8178(276159417);
		aClass665_Sub2_9203.method8115(1737136757);
		aClass665_Sub21_9210.method9042((byte) 4);
		aClass665_Sub10_9211.method8193(653612339);
		aClass665_Sub29_9212.method9120(-648940047);
		aClass665_Sub27_9214.method9101(-2101174573);
		aClass665_Sub14_9215.method8242((byte) 85);
		aClass665_Sub11_9219.method8200(176009730);
		aClass665_Sub23_9208.method9056(864174512);
		aClass665_Sub28_9218.method9113(-1821714548);
		aClass665_Sub26_9240.method9092(1368677452);
		aClass665_Sub13_9220.method8235(438593350);
		aClass665_Sub24_9221.method9074(-736119111);
		aClass665_Sub6_9222.method8157(1709972693);
		aClass665_Sub34_9223.method9170((byte) -43);
		aClass665_Sub4_9200.method8130(-1042067865);
		aClass665_Sub1_9235.method8100(-822185990);
		aClass665_Sub1_9201.method8100(-2090033012);
		aClass665_Sub7_9227.method8163(-655387767);
		aClass665_Sub31_9228.method9142(886497676);
		aClass665_Sub5_9248.method8150((byte) 23);
		aClass665_Sub12_9230.method8216(-860355120);
		aClass665_Sub30_9231.method9133(2029713185);
		aClass665_Sub30_9205.method9133(2117411704);
		aClass665_Sub35_9233.method9184((byte) -68);
		aClass665_Sub20_9234.method9039((byte) 38);
		aClass665_Sub20_9204.method9039((byte) 111);
		aClass665_Sub16_9236.method8981((short) 797);
		aClass665_Sub19_9237.method9029((short) 736);
		aClass665_Sub33_9238.method9161(-571514224);
		aClass665_Sub3_9239.method8124((byte) -7);
		aClass665_Sub22_9207.method9049(-1990679661);
		aClass665_Sub17_9241.method9007(-1030715452);
		((Class572_Sub24) this).aClass665_Sub8_9242.method8172(-1270370395);
		aClass665_Sub25_9213.method9086(-555878228);
		aClass665_Sub15_9243.method8969((byte) -80);
		aClass665_Sub15_9244.method8969((byte) -37);
		aClass665_Sub15_9245.method8969((byte) -46);
		musicVolume.method8969((byte) -127);
		aClass665_Sub15_9226.method8969((byte) -90);
		aClass665_Sub18_9206.method9014(-1342282425);
	}

	void method8621(RSByteBuffer class572_sub15, int i) {
		if (null == class572_sub15 || null == class572_sub15.b)
			method8609(true, true, 598328191);
		else {
			int i_7_ = class572_sub15.readUnsignedByte(689242180);
			if (i_7_ < 23) {
				try {
					method8610(class572_sub15, i_7_, (short) -25290);
				} catch (Exception exception) {
					method8609(true, true, 229003977);
				}
				method8609(false, true, -52103481);
			} else if (i_7_ > 34)
				method8609(true, true, 387778616);
			else {
				if (i_7_ >= 29)
					aClass665_Sub32_9202 = new Class665_Sub32(class572_sub15.readUnsignedByte(1231933385), this);
				aClass665_Sub2_9247 = new Class665_Sub2(class572_sub15.readUnsignedByte(1115749600), this);
				if (i_7_ >= 31)
					((Class572_Sub24) this).aClass665_Sub9_9209 = new Class665_Sub9(class572_sub15.readUnsignedByte(2104720441), this);
				aClass665_Sub2_9203 = new Class665_Sub2(aClass665_Sub2_9247.method8120(1718669252), this);
				aClass665_Sub21_9210 = new Class665_Sub21(class572_sub15.readUnsignedByte(680111218), this);
				aClass665_Sub10_9211 = new Class665_Sub10(class572_sub15.readUnsignedByte(1706844958), this);
				aClass665_Sub29_9212 = new Class665_Sub29(class572_sub15.readUnsignedByte(912263477), this);
				if (i_7_ >= 27)
					aClass665_Sub27_9214 = new Class665_Sub27(class572_sub15.readUnsignedByte(600529536), this);
				aClass665_Sub14_9215 = new Class665_Sub14(class572_sub15.readUnsignedByte(1619672792), this);
				aClass665_Sub11_9219 = new Class665_Sub11(class572_sub15.readUnsignedByte(-17648715), this);
				aClass665_Sub23_9208 = new Class665_Sub23(class572_sub15.readUnsignedByte(1911022937), this);
				aClass665_Sub28_9218 = new Class665_Sub28(class572_sub15.readUnsignedByte(1108759524), this);
				aClass665_Sub26_9240 = new Class665_Sub26(class572_sub15.readUnsignedByte(365595455), this);
				aClass665_Sub13_9220 = new Class665_Sub13(class572_sub15.readUnsignedByte(246558652), this);
				aClass665_Sub24_9221 = new Class665_Sub24(class572_sub15.readUnsignedByte(-3005815), this);
				if (i_7_ >= 33)
					aClass665_Sub6_9222 = new Class665_Sub6(class572_sub15.readUnsignedByte(420180013), this);
				if (i_7_ >= 34)
					class572_sub15.readUnsignedByte(-68784218);
				if (i_7_ >= 24)
					aClass665_Sub34_9223 = new Class665_Sub34(class572_sub15.readUnsignedByte(1767595128), this);
				aClass665_Sub4_9200 = new Class665_Sub4(class572_sub15.readUnsignedByte(1380544316), this);
				aClass665_Sub1_9235 = new Class665_Sub1(class572_sub15.readUnsignedByte(-60697845), this);
				aClass665_Sub1_9201 = new Class665_Sub1(aClass665_Sub1_9235.method8101(377118517), this);
				aClass665_Sub7_9227 = new Class665_Sub7(class572_sub15.readUnsignedByte(874979605), this);
				if (i_7_ >= 25)
					aClass665_Sub31_9228 = new Class665_Sub31(class572_sub15.readUnsignedByte(2088477456), this);
				aClass665_Sub5_9248 = new Class665_Sub5(class572_sub15.readUnsignedByte(1429384418), this);
				if (i_7_ <= 25)
					class572_sub15.o += 310393755;
				aClass665_Sub12_9230 = new Class665_Sub12(class572_sub15.readUnsignedByte(1707063447), this);
				aClass665_Sub30_9231 = new Class665_Sub30(class572_sub15.readUnsignedByte(1271803145), this);
				aClass665_Sub30_9205 = new Class665_Sub30(aClass665_Sub30_9231.method9129(1725837348), this);
				class572_sub15.readUnsignedByte(829627377);
				aClass665_Sub35_9233 = new Class665_Sub35(class572_sub15.readUnsignedByte(172565995), this);
				aClass665_Sub20_9234 = new Class665_Sub20(class572_sub15.readUnsignedByte(632669421), this);
				aClass665_Sub20_9204 = new Class665_Sub20(aClass665_Sub20_9234.method9038(-531045280), this);
				aClass665_Sub16_9236 = new Class665_Sub16(class572_sub15.readUnsignedByte(843470112), this);
				aClass665_Sub19_9237 = new Class665_Sub19(class572_sub15.readUnsignedByte(1544695743), this);
				aClass665_Sub33_9238 = new Class665_Sub33(class572_sub15.readUnsignedByte(820175785), this);
				aClass665_Sub3_9239 = new Class665_Sub3(class572_sub15.readUnsignedByte(1775076029), this);
				aClass665_Sub22_9207 = new Class665_Sub22(class572_sub15.readUnsignedByte(1268049432), this);
				if (i_7_ >= 26)
					aClass665_Sub17_9241 = new Class665_Sub17(class572_sub15.readUnsignedByte(731220109), this);
				if (i_7_ >= 28)
					((Class572_Sub24) this).aClass665_Sub8_9242 = new Class665_Sub8(class572_sub15.readUnsignedByte(961949865), this);
				if (i_7_ >= 30)
					aClass665_Sub25_9213 = new Class665_Sub25(class572_sub15.readUnsignedByte(1102533217), this);
				aClass665_Sub15_9243 = new Class665_Sub15(class572_sub15.readUnsignedByte(1093804097), this);
				aClass665_Sub15_9244 = new Class665_Sub15(class572_sub15.readUnsignedByte(501763774), this);
				aClass665_Sub15_9245 = new Class665_Sub15(class572_sub15.readUnsignedByte(1734232177), this);
				musicVolume = new Class665_Sub15(class572_sub15.readUnsignedByte(1940731743), this);
				aClass665_Sub15_9226 = new Class665_Sub15(class572_sub15.readUnsignedByte(51161710), this);
				aClass665_Sub18_9206 = new Class665_Sub18(class572_sub15.readUnsignedByte(1431006655), this);
				method8609(false, i_7_ < 32, 140058496);
			}
		}
		method8613(1479397466);
	}

	public void method8622(Class665 class665, int i, int i_8_) {
		class665.method7859(i, -684105039);
		method8613(149338259);
	}

	public Class572_Sub24(Class437 class437, int i) {
		((Class572_Sub24) this).aClass437_9217 = class437;
		((Class572_Sub24) this).aClass673_9225 = new Class673(-456796019 * Class584.anInt7769, Class584.anInt7742 * 133994349, (Class184.aString2167.toLowerCase().indexOf("arm") != -1), Class572_Sub12_Sub2.aString11255.startsWith("win"));
		aClass665_Sub30_9205 = new Class665_Sub30(i, this);
		method8609(true, true, 1205696678);
	}
}
