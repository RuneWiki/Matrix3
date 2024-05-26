package game;

/* Class479_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class479_Sub1 extends Class479 {
	public static Class248 aClass248_8936;

	Class572_Sub25 method5657() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3757, client.aClass195_8589.aClass650_2340, 631935564);
	}

	void method5652(int i) {
		Class572_Sub13 class572_sub13 = method8224(-1894867939);
		if (class572_sub13 != null) {
			int i_0_ = method5649(class572_sub13, 32767, 2049960810);
			int i_1_ = class572_sub13.method8425(-1749784373);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = class572_sub13.method8417(1636759235);
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ > 65535)
				i_2_ = 65535;
			int i_3_ = 0;
			if (class572_sub13.method8416((byte) 10) == 2)
				i_3_ = 1;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3765, client.aClass195_8589.aClass650_2340, 746661881);
			class572_sub25.aRsByteBuffer.writeShort128(i_0_ | i_3_ << 15, -16711936);
			class572_sub25.aRsByteBuffer.writeInt(i_2_ | i_1_ << 16, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -70);
		}
	}

	boolean method5662(byte i) {
		return (method8224(-1472472918) != null || (((Class479_Sub1) this).aLong5350 * -7613164673240222681L < Class69.method1067(-1814189497) - 2000L));
	}

	Class572_Sub13 method8224(int i) {
		return (Class572_Sub13) client.aClass675_8745.method7932((byte) 50);
	}

	Class572_Sub25 method5654(int i) {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3757, client.aClass195_8589.aClass650_2340, 943217605);
	}

	void method5651(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13, byte i) {
		/* empty */
	}

	int method5650(byte i) {
		return 0;
	}

	boolean method5655() {
		return (method8224(85495268) != null || (((Class479_Sub1) this).aLong5350 * -7613164673240222681L < Class69.method1067(-2090927338) - 2000L));
	}

	boolean method5663() {
		return (method8224(-622611194) != null || (((Class479_Sub1) this).aLong5350 * -7613164673240222681L < Class69.method1067(-2073898693) - 2000L));
	}

	Class572_Sub25 method5658() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3757, client.aClass195_8589.aClass650_2340, 540024179);
	}

	int method5660() {
		return 0;
	}

	Class572_Sub25 method5653() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3757, client.aClass195_8589.aClass650_2340, 583667206);
	}

	int method5659() {
		return 0;
	}

	void method5661(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13) {
		/* empty */
	}

	Class479_Sub1() {
		/* empty */
	}

	void method5665() {
		Class572_Sub13 class572_sub13 = method8224(-380208366);
		if (class572_sub13 != null) {
			int i = method5649(class572_sub13, 32767, 1759874757);
			int i_4_ = class572_sub13.method8425(-1749784373);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = class572_sub13.method8417(1636759235);
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 65535)
				i_5_ = 65535;
			int i_6_ = 0;
			if (class572_sub13.method8416((byte) 10) == 2)
				i_6_ = 1;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3765, client.aClass195_8589.aClass650_2340, -334356976);
			class572_sub25.aRsByteBuffer.writeShort128(i | i_6_ << 15, -16711936);
			class572_sub25.aRsByteBuffer.writeInt(i_5_ | i_4_ << 16, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -25);
		}
	}

	static final void method8225(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Integer.toString(i_7_);
	}

	static final void method8226(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class604.method7148((byte) 3);
	}

	static final void method8227(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class572_Sub12_Sub1.anInt11251 * 288786331;
	}
}
