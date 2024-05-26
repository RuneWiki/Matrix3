package game;

/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class VarDefinition implements Interface16 {
	public VarTransmitLevel transmitLevel = VarTransmitLevel.NEVER;
	public int id;
	public ScriptVarType dataType;
	public VarDomainType domain;
	public boolean isTemp = true;

	boolean method2767(int i) {
		if (domain == null || dataType == null)
			return false;
		return true;
	}

	VarDefinition(VarDomainType class272, int i) {
		domain = class272;
		id = i * 1965495901;
	}

	abstract void method2768(RSByteBuffer class572_sub15, int i, int i_0_);

	abstract void method2769(RSByteBuffer class572_sub15, int i);

	public Object method2770(byte i) {
		return domain.method3669(this, (byte) -24);
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_1_ = class572_sub15.readUnsignedByte(1702271187);
			if (i_1_ == 0)
				break;
			Class177 class177 = ((Class177) Class455.method5387(Class212.method3065(653539501), i_1_, -2022449750));
			if (class177 != null) {
				switch (((Class177) class177).anInt2107 * -552408029) {
					case 2:
						class572_sub15.readVersionedString(-1532889039);
						break;
					case 6:
						Class455.method5387(Class165.method2669(-402200419), class572_sub15.readUnsignedByte(1842977122), -1888373423);
						break;
					case 1: {
						int i_2_ = class572_sub15.readUnsignedByte(444873275);
						dataType = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(804888795), i_2_, -1895600322));
						if (null == dataType)
							throw new IllegalStateException("");
						break;
					}
					case 0:
						break;
					case 4:
						isTemp = false;
						break;
					case 5:
						transmitLevel = ((VarTransmitLevel) Class455.method5387(Class4.method487((byte) -23), class572_sub15.readUnsignedByte(342099597), -1947777498));
						break;
					default:
						throw new IllegalStateException("");
				}
			} else
				method2768(class572_sub15, i_1_, 1261579686);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1038705419);
			if (i == 0)
				break;
			Class177 class177 = ((Class177) Class455.method5387(Class212.method3065(818016242), i, -1876982078));
			if (class177 != null) {
				switch (((Class177) class177).anInt2107 * -552408029) {
					case 2:
						class572_sub15.readVersionedString(-2118463001);
						break;
					case 6:
						Class455.method5387(Class165.method2669(2122953380), class572_sub15.readUnsignedByte(100025338), -2101358014);
						break;
					case 1: {
						int i_3_ = class572_sub15.readUnsignedByte(529425300);
						dataType = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(711298789), i_3_, -1933574266));
						if (null == dataType)
							throw new IllegalStateException("");
						break;
					}
					case 0:
						break;
					case 4:
						isTemp = false;
						break;
					case 5:
						transmitLevel = ((VarTransmitLevel) Class455.method5387(Class4.method487((byte) 66), class572_sub15.readUnsignedByte(791306974), -2089134796));
						break;
					default:
						throw new IllegalStateException("");
				}
			} else
				method2768(class572_sub15, i, 1261579686);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(765696628);
			if (i == 0)
				break;
			Class177 class177 = ((Class177) Class455.method5387(Class212.method3065(-186933076), i, -2094575622));
			if (class177 != null) {
				switch (((Class177) class177).anInt2107 * -552408029) {
					case 2:
						class572_sub15.readVersionedString(-786457280);
						break;
					case 6:
						Class455.method5387(Class165.method2669(-41666697), class572_sub15.readUnsignedByte(1667900486), -1963302671);
						break;
					case 1: {
						int i_4_ = class572_sub15.readUnsignedByte(867725646);
						dataType = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(307830284), i_4_, -2135772547));
						if (null == dataType)
							throw new IllegalStateException("");
						break;
					}
					case 0:
						break;
					case 4:
						isTemp = false;
						break;
					case 5:
						transmitLevel = ((VarTransmitLevel) Class455.method5387(Class4.method487((byte) -50), class572_sub15.readUnsignedByte(729238897), -2004257260));
						break;
					default:
						throw new IllegalStateException("");
				}
			} else
				method2768(class572_sub15, i, 1261579686);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1600554416);
			if (i == 0)
				break;
			Class177 class177 = ((Class177) Class455.method5387(Class212.method3065(-1096619749), i, -2048532222));
			if (class177 != null) {
				switch (((Class177) class177).anInt2107 * -552408029) {
					case 2:
						class572_sub15.readVersionedString(-1238588603);
						break;
					case 6:
						Class455.method5387(Class165.method2669(1047771245), class572_sub15.readUnsignedByte(623218506), -2067949372);
						break;
					case 1: {
						int i_5_ = class572_sub15.readUnsignedByte(1575524884);
						dataType = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(1773489537), i_5_, -2099150375));
						if (null == dataType)
							throw new IllegalStateException("");
						break;
					}
					case 0:
						break;
					case 4:
						isTemp = false;
						break;
					case 5:
						transmitLevel = ((VarTransmitLevel) Class455.method5387(Class4.method487((byte) -77), class572_sub15.readUnsignedByte(1934906374), -1860124764));
						break;
					default:
						throw new IllegalStateException("");
				}
			} else
				method2768(class572_sub15, i, 1261579686);
		}
	}

	abstract void method2771(RSByteBuffer class572_sub15, int i);

	boolean method2772() {
		if (domain == null || dataType == null)
			return false;
		return true;
	}

	boolean method2773() {
		if (domain == null || dataType == null)
			return false;
		return true;
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(81215210);
			if (i == 0)
				break;
			Class177 class177 = ((Class177) Class455.method5387(Class212.method3065(-845411369), i, -2129064022));
			if (class177 != null) {
				switch (((Class177) class177).anInt2107 * -552408029) {
					case 2:
						class572_sub15.readVersionedString(-798681209);
						break;
					case 6:
						Class455.method5387(Class165.method2669(-1257649600), class572_sub15.readUnsignedByte(76884576), -1900073153);
						break;
					case 1: {
						int i_6_ = class572_sub15.readUnsignedByte(359226618);
						dataType = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(1745098923), i_6_, -2032815738));
						if (null == dataType)
							throw new IllegalStateException("");
						break;
					}
					case 0:
						break;
					case 4:
						isTemp = false;
						break;
					case 5:
						transmitLevel = ((VarTransmitLevel) Class455.method5387(Class4.method487((byte) -17), class572_sub15.readUnsignedByte(1863773943), -2017989249));
						break;
					default:
						throw new IllegalStateException("");
				}
			} else
				method2768(class572_sub15, i, 1261579686);
		}
	}

	public static void method2774(int i, byte i_7_) {
		if (-1 != i && !Class572_Sub12_Sub2.aBoolArray11253[i]) {
			Class306.aClass248_3544.method3378(i, 114494676);
			Class534.aClass83Array5975[i] = null;
		}
	}

	static int method2775(int i, int i_8_, int i_9_) {
		if (9 == i_8_)
			i = i + 1 & 0x3;
		if (10 == i_8_)
			i = i + 3 & 0x3;
		if (i_8_ == 11)
			i = 3 + i & 0x3;
		return i;
	}

	static final void method2776(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_10_ = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) - 1);
		if (i_10_ < 0 || i_10_ > 9)
			throw new RuntimeException();
		Class241.method3322(class73, i_10_, class441, (byte) -50);
	}

	static final void method2777(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class572_Sub29 class572_sub29 = (Class572_Sub29) client.aClass676_8760.get((long) i_11_);
		if (class572_sub29 != null && i_12_ == class572_sub29.anInt9301 * 493419501)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method2778(Cs2Executor class441, int i) {
		int i_13_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method7863(i_13_, -864226474);
	}

	static final void method2779(Cs2Executor class441, int i) {
		int i_14_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_14_, (short) 7350);
		method2776(class73, class441, -431154340);
	}

	public static final void method2780(int i) {
		Class195 class195 = Class166.method2676((byte) 16);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3713, class195.aClass650_2340, -1812746815);
		class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
		class195.method2929(class572_sub25, (byte) -27);
	}

	public static void method2781(Class387 class387, int i) {
		InputStream_Sub1.aClass387_9533 = class387;
	}
}
