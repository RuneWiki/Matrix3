package game;

/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class563 implements Comparator {
	Class289_Sub1 this$0;

	int method6638(Class605 class605, Class605 class605_0_, byte i) {
		float f = class605.method7237((byte) 10);
		float f_1_ = class605_0_.method7237((byte) 71);
		if (f_1_ > f)
			return 1;
		if (f_1_ < f)
			return -1;
		return 0;
	}

	public int method6639(Object object, Object object_2_) {
		return method6638((Class605) object, (Class605) object_2_, (byte) 0);
	}

	public int compare(Object object, Object object_3_) {
		return method6638((Class605) object, (Class605) object_3_, (byte) 0);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method6640(Object object, Object object_4_) {
		return method6638((Class605) object, (Class605) object_4_, (byte) 0);
	}

	public boolean method6641(Object object) {
		return super.equals(object);
	}

	public int method6642(Object object, Object object_5_) {
		return method6638((Class605) object, (Class605) object_5_, (byte) 0);
	}

	public int method6643(Object object, Object object_6_) {
		return method6638((Class605) object, (Class605) object_6_, (byte) 0);
	}

	Class563(Class289_Sub1 class289_sub1) {
		((Class563) this).this$0 = class289_sub1;
	}

	public boolean method6644(Object object) {
		return super.equals(object);
	}

	public int method6645(Object object, Object object_7_) {
		return method6638((Class605) object, (Class605) object_7_, (byte) 0);
	}

	static final void method6646(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.anInt8753 * 1658171305;
	}

	static final void method6647(Cs2Executor class441, short i) {
		int i_8_ = ((client.anIntArrayArrayArray8689[(((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)])]).length >> 1);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_8_;
	}

	static final void method6648(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).aClass456_Sub1_Sub5_Sub1_5118.method8312(554292168);
	}

	public static void method6649(byte i) {
		Class500.method5948((byte) 100);
		Class458.aClass479_Sub1_5205.method5666(-685848126);
		Class458.aClass479_Sub2_5207.method5666(-902734252);
		if (client.anInt8609 * 2134888631 > 0) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3730, client.aClass195_8589.aClass650_2340, 104132119);
			class572_sub25.aRsByteBuffer.writeShort(-50380068 * client.anInt8609, -1155836842);
			for (int i_9_ = 0; i_9_ < 2134888631 * client.anInt8609; i_9_++) {
				Interface64 interface64 = client.anInterface64Array8610[i_9_];
				long l = (interface64.method384(1335279474) - Class458.aLong5206 * 1627438549222122819L);
				if (l > 16777215L)
					l = 16777215L;
				Class458.aLong5206 = interface64.method384(1335279474) * 329293226375729003L;
				class572_sub25.aRsByteBuffer.writeByte(interface64.method383(-1243674537), -1384395473);
				class572_sub25.aRsByteBuffer.write24BitInteger((int) l, 1425883144);
			}
			client.aClass195_8589.method2929(class572_sub25, (byte) -53);
		}
		if (Class458.anInt5203 * -12527375 > 0)
			Class458.anInt5203 -= 101390353;
		if (client.aBool8685 && Class458.anInt5203 * -12527375 <= 0) {
			Class458.anInt5203 = 2027807060;
			client.aBool8685 = false;
			int i_10_;
			int i_11_;
			if (1 == Class18.anInt143 * 625220759) {
				if (Class133_Sub1.aClass411_Sub1_9827.method4994(-328946624) == Class413.aClass413_4915) {
					Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -58);
					i_10_ = Class125.method2211(class423_sub3.aClass230_9806, -350201138) >> 3;
					int i_12_ = 1024;
					i_11_ = (3 * i_12_ - (Class572_Sub22.method8601((class423_sub3.aClass230_9806), 556414705) >> 3)) % (i_12_ * 2);
				} else {
					i_10_ = 0;
					i_11_ = 0;
				}
			} else {
				i_10_ = (int) client.aFloat8822 >> 3;
				i_11_ = (int) client.aFloat8678 >> 3;
			}
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3686, client.aClass195_8589.aClass650_2340, -872241726);
			class572_sub25.aRsByteBuffer.writeShort(i_11_, -1496089494);
			class572_sub25.aRsByteBuffer.writeShortLE128(i_10_, (byte) -32);
			client.aClass195_8589.method2929(class572_sub25, (byte) -69);
		}
		if (Class408.aBool4780 != Class458.aBool5204) {
			Class458.aBool5204 = Class408.aBool4780;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3724, client.aClass195_8589.aClass650_2340, -107967266);
			class572_sub25.aRsByteBuffer.writeByte(Class408.aBool4780 ? 1 : 0, -1384395473);
			client.aClass195_8589.method2929(class572_sub25, (byte) -31);
		}
		if (!client.aBool8854) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3680, client.aClass195_8589.aClass650_2340, 303716658);
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
			int i_13_ = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(1431860626);
			class572_sub25.aRsByteBuffer.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 70);
			class572_sub25.aRsByteBuffer.method8552(-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_13_, -188553048);
			client.aClass195_8589.method2929(class572_sub25, (byte) -48);
			client.aBool8854 = true;
		}
	}

	static void method6650(short i) {
		Class549_Sub1.anIntArray8901[44] = 71;
		Class549_Sub1.anIntArray8901[45] = 26;
		Class549_Sub1.anIntArray8901[46] = 72;
		Class549_Sub1.anIntArray8901[47] = 73;
		Class549_Sub1.anIntArray8901[59] = 57;
		Class549_Sub1.anIntArray8901[61] = 27;
		Class549_Sub1.anIntArray8901[91] = 42;
		Class549_Sub1.anIntArray8901[92] = 74;
		Class549_Sub1.anIntArray8901[93] = 43;
		Class549_Sub1.anIntArray8901[192] = 28;
		Class549_Sub1.anIntArray8901[222] = 58;
		Class549_Sub1.anIntArray8901[520] = 59;
	}

	static final void method6651(Cs2Executor class441, short i) {
		int i_14_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class133_Sub1.aClass411_Sub1_9827.method4995(i_14_, (byte) -26);
	}
}
