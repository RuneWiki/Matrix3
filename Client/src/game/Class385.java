package game;

/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class385 {
	public String aString4612;
	public Class67[] aClass67Array4613;
	public String aString4614;
	public Class67[] aClass67Array4615;
	public String aString4616;

	void method4658(Class380 class380) {
		aString4616 = class380.method4635((byte) 23);
		aString4612 = class380.method4635((byte) -105);
		aString4614 = class380.method4635((byte) -114);
		int i = class380.method4634((byte) 125);
		int i_0_ = class380.method4634((byte) 109);
		aClass67Array4615 = 0 == i ? null : new Class67[i];
		aClass67Array4613 = 0 == i_0_ ? null : new Class67[i_0_];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			aClass67Array4615[i_1_] = new Class67();
			aClass67Array4615[i_1_].method1051(class380, -1475848813);
		}
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			aClass67Array4613[i_2_] = new Class67();
			aClass67Array4613[i_2_].method1051(class380, -1475848813);
		}
	}

	Class385() {
		/* empty */
	}

	void method4659(Class380 class380, int i) {
		aString4616 = class380.method4635((byte) -2);
		aString4612 = class380.method4635((byte) -84);
		aString4614 = class380.method4635((byte) -40);
		int i_3_ = class380.method4634((byte) 62);
		int i_4_ = class380.method4634((byte) 19);
		aClass67Array4615 = 0 == i_3_ ? null : new Class67[i_3_];
		aClass67Array4613 = 0 == i_4_ ? null : new Class67[i_4_];
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			aClass67Array4615[i_5_] = new Class67();
			aClass67Array4615[i_5_].method1051(class380, -1475848813);
		}
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
			aClass67Array4613[i_6_] = new Class67();
			aClass67Array4613[i_6_].method1051(class380, -1475848813);
		}
	}

	void method4660(Class380 class380) {
		aString4616 = class380.method4635((byte) -108);
		aString4612 = class380.method4635((byte) -10);
		aString4614 = class380.method4635((byte) -121);
		int i = class380.method4634((byte) 88);
		int i_7_ = class380.method4634((byte) 124);
		aClass67Array4615 = 0 == i ? null : new Class67[i];
		aClass67Array4613 = 0 == i_7_ ? null : new Class67[i_7_];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			aClass67Array4615[i_8_] = new Class67();
			aClass67Array4615[i_8_].method1051(class380, -1475848813);
		}
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
			aClass67Array4613[i_9_] = new Class67();
			aClass67Array4613[i_9_].method1051(class380, -1475848813);
		}
	}

	public static Class305 method4661(RSByteBuffer class572_sub15, int i) {
		Class305 class305 = new Class305();
		class305.anInt3541 = class572_sub15.readUnsignedShort(647518597) * -745166955;
		class305.aClass572_Sub12_Sub15_3540 = Class111.aClass244_1428.method3345(class305.anInt3541 * -1986499651, -969606525);
		return class305;
	}

	public static Class654[] method4662(Class672 class672, int i) {
		int[] is = class672.method7887((byte) -52);
		Class654[] class654s = new Class654[is.length >> 2];
		for (int i_10_ = 0; i_10_ < class654s.length; i_10_++) {
			Class654 class654 = new Class654();
			class654s[i_10_] = class654;
			class654.anInt8402 = -809304419 * is[i_10_ << 2];
			class654.anInt8401 = is[(i_10_ << 2) + 1] * 235007389;
			class654.anInt8400 = -1904382299 * is[2 + (i_10_ << 2)];
			((Class654) class654).anInt8403 = is[3 + (i_10_ << 2)] * -262567991;
		}
		return class654s;
	}

	public static void method4663(int i, int i_11_, int i_12_, String string, byte i_13_) {
		InterfaceDefinitions class73 = Class530.method6338(i_11_, i_12_, -582563422);
		if (null != class73) {
			if (class73.anObjectArray776 != null) {
				Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
				class572_sub20.thizInterface = class73;
				class572_sub20.anInt9152 = 1713252989 * i;
				class572_sub20.aString9154 = string;
				class572_sub20.params = class73.anObjectArray776;
				Class34.executeCs2(class572_sub20, -2108865528);
			}
			if (client.method7992(class73).method8646(i - 1, (byte) 126)) {
				Class195 class195 = Class166.method2676((byte) 121);
				if (835742603 * client.anInt8580 == 5 || 1 == client.anInt8580 * 835742603 || 835742603 * client.anInt8580 == 6) {
					if (class73.aString747 != null && class73.aClass68_905 != null) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3690, class195.aClass650_2340, 58506892);
						class572_sub25.aRsByteBuffer.writeByte(7 + ObjectDefinitions.method6069(class73.aString747, -1330496452) + 1, -1384395473);
						class572_sub25.aRsByteBuffer.writeShortLE(i_12_, -971252436);
						class572_sub25.aRsByteBuffer.writeString(class73.aString747, (byte) -11);
						class572_sub25.aRsByteBuffer.writeByte128(i, -91940512);
						class572_sub25.aRsByteBuffer.writeByteC(class73.aClass68_905.getId(-1360880652), (byte) 6);
						class572_sub25.aRsByteBuffer.writeInt(i_11_, -1743753997);
						class195.method2929(class572_sub25, (byte) -98);
					} else
						Class292.method3951(class195, class73, i, i_11_, i_12_, (byte) -10);
				}
			} else if (!RS3Applet.HOSTED) {
				//System.out.println("ACCESS MASK  BLOCKED PACKET:" + i + "," + (i_11_ >>> 16) + "," + (i_11_ & 0xFFFF) + "," + i_12_ + "," + (class73.nvmtheindexisotherone * 411192987));
			}
		}
	}

	static final void method4664(Cs2Executor class441, int i) {
		int i_14_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_14_, (short) -17968);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt800 * 1450945799;
	}
}
