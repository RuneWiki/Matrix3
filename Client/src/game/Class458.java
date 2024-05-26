package game;

/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Class458 {
	static Queue aQueue5202;
	static int anInt5203;
	static boolean aBool5204;
	static Class479_Sub1 aClass479_Sub1_5205;
	static long aLong5206 = -329293226375729003L;
	static Class479_Sub2 aClass479_Sub2_5207;
	static Class161 aClass161_5208;

	public static void method5430() {
		aClass479_Sub1_5205.method5646((byte) 114);
		aClass479_Sub2_5207.method5646((byte) 99);
		aLong5206 = -329293226375729003L;
		aBool5204 = true;
	}

	static {
		anInt5203 = 0;
		aBool5204 = true;
		aClass479_Sub1_5205 = new Class479_Sub1();
		aClass479_Sub2_5207 = new Class479_Sub2();
		aQueue5202 = new LinkedList();
	}

	public static void method5431() {
		if (Class557.method6591(1734878358))
			Class506.method6032(new Class446(), (byte) 5);
	}

	public static void method5432() {
		Class305.method4011(-874746469);
	}

	public static void method5433() {
		Class500.method5948((byte) 100);
		aClass479_Sub1_5205.method5666(-944536453);
		aClass479_Sub2_5207.method5666(-1703160620);
		if (client.anInt8609 * 2134888631 > 0) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3730, client.aClass195_8589.aClass650_2340, 981182219);
			class572_sub25.aRsByteBuffer.writeShort(-50380068 * client.anInt8609, -2142978461);
			for (int i = 0; i < 2134888631 * client.anInt8609; i++) {
				Interface64 interface64 = client.anInterface64Array8610[i];
				long l = (interface64.method384(1335279474) - aLong5206 * 1627438549222122819L);
				if (l > 16777215L)
					l = 16777215L;
				aLong5206 = interface64.method384(1335279474) * 329293226375729003L;
				class572_sub25.aRsByteBuffer.writeByte(interface64.method383(-1329582272), -1384395473);
				class572_sub25.aRsByteBuffer.write24BitInteger((int) l, -968295729);
			}
			client.aClass195_8589.method2929(class572_sub25, (byte) -99);
		}
		if (anInt5203 * -12527375 > 0)
			anInt5203 -= 101390353;
		if (client.aBool8685 && anInt5203 * -12527375 <= 0) {
			anInt5203 = 2027807060;
			client.aBool8685 = false;
			int i;
			int i_0_;
			if (1 == Class18.anInt143 * 625220759) {
				if (Class133_Sub1.aClass411_Sub1_9827.method4994(-1588989689) == Class413.aClass413_4915) {
					Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -86);
					i = Class125.method2211(class423_sub3.aClass230_9806, -350201138) >> 3;
					int i_1_ = 1024;
					i_0_ = (3 * i_1_ - (Class572_Sub22.method8601((class423_sub3.aClass230_9806), 1931835733) >> 3)) % (i_1_ * 2);
				} else {
					i = 0;
					i_0_ = 0;
				}
			} else {
				i = (int) client.aFloat8822 >> 3;
				i_0_ = (int) client.aFloat8678 >> 3;
			}
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3686, client.aClass195_8589.aClass650_2340, -869589433);
			class572_sub25.aRsByteBuffer.writeShort(i_0_, -1030503644);
			class572_sub25.aRsByteBuffer.writeShortLE128(i, (byte) -27);
			client.aClass195_8589.method2929(class572_sub25, (byte) -17);
		}
		if (Class408.aBool4780 != aBool5204) {
			aBool5204 = Class408.aBool4780;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3724, client.aClass195_8589.aClass650_2340, -884286435);
			class572_sub25.aRsByteBuffer.writeByte(Class408.aBool4780 ? 1 : 0, -1384395473);
			client.aClass195_8589.method2929(class572_sub25, (byte) -86);
		}
		if (!client.aBool8854) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3680, client.aClass195_8589.aClass650_2340, -1387604176);
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
			int i = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(1862528925);
			class572_sub25.aRsByteBuffer.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 7);
			class572_sub25.aRsByteBuffer.method8552((-1585139053 * class572_sub25.aRsByteBuffer.o) - i, 1343010446);
			client.aClass195_8589.method2929(class572_sub25, (byte) -34);
			client.aBool8854 = true;
		}
	}

	public static void method5434() {
		Class305.method4011(569645573);
	}

	public static void method5435() {
		if (Class557.method6591(-687265034))
			Class506.method6032(new Class446(), (byte) 5);
	}

	public static void method5436() {
		aClass479_Sub1_5205.method5646((byte) 75);
		aClass479_Sub2_5207.method5646((byte) 43);
		aLong5206 = -329293226375729003L;
		aBool5204 = true;
	}

	public static void method5437() {
		if (Class557.method6591(13473569))
			Class506.method6032(new Class446(), (byte) 5);
	}

	static void method5438() {
		synchronized (aQueue5202) {
			Point point;
			if (Class584.aCanvas7745.isShowing())
				point = Class584.aCanvas7745.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				if (null == point || !Class584.aCanvas7745.isShowing() || !Class408.aBool4780)
					class572_sub13_sub1.method8421(421222932);
				else {
					class572_sub13_sub1.method10305(point, 1151764840);
					if (!class572_sub13_sub1.method10302(1002201293) && (class572_sub13_sub1.method8417(1636759235) < 1960824389 * Class269.anInt2861) && (class572_sub13_sub1.method8425(-1749784373) < Class584.anInt7739 * -530390519) && class572_sub13_sub1.method8417(1636759235) >= 0 && class572_sub13_sub1.method8425(-1749784373) >= 0) {
						int i = class572_sub13_sub1.method8416((byte) 10);
						if (class572_sub13_sub1.method8416((byte) 10) == -1)
							aClass479_Sub2_5207.method5648(class572_sub13_sub1, (byte) 6);
						else if (Class566.method6715(i, (byte) 0))
							aClass479_Sub2_5207.method8275(class572_sub13_sub1, (byte) 23);
					}
				}
			}
		}
	}

	public static void method5439() {
		aClass479_Sub1_5205.method5646((byte) 75);
		aClass479_Sub2_5207.method5646((byte) 80);
		aLong5206 = -329293226375729003L;
		aBool5204 = true;
	}

	static void method5440() {
		synchronized (aQueue5202) {
			Point point;
			if (Class584.aCanvas7745.isShowing())
				point = Class584.aCanvas7745.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				if (null == point || !Class584.aCanvas7745.isShowing() || !Class408.aBool4780)
					class572_sub13_sub1.method8421(421222932);
				else {
					class572_sub13_sub1.method10305(point, 898886559);
					if (!class572_sub13_sub1.method10302(1374579584) && (class572_sub13_sub1.method8417(1636759235) < 1960824389 * Class269.anInt2861) && (class572_sub13_sub1.method8425(-1749784373) < Class584.anInt7739 * -530390519) && class572_sub13_sub1.method8417(1636759235) >= 0 && class572_sub13_sub1.method8425(-1749784373) >= 0) {
						int i = class572_sub13_sub1.method8416((byte) 10);
						if (class572_sub13_sub1.method8416((byte) 10) == -1)
							aClass479_Sub2_5207.method5648(class572_sub13_sub1, (byte) 6);
						else if (Class566.method6715(i, (byte) 0))
							aClass479_Sub2_5207.method8275(class572_sub13_sub1, (byte) -75);
					}
				}
			}
		}
	}

	public static void method5441() {
		synchronized (aQueue5202) {
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				class572_sub13_sub1.method8421(421222932);
			}
		}
	}

	public static void method5442() {
		synchronized (aQueue5202) {
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				class572_sub13_sub1.method8421(421222932);
			}
		}
	}

	public static void method5443() {
		Class500.method5948((byte) 100);
		aClass479_Sub1_5205.method5666(-263329762);
		aClass479_Sub2_5207.method5666(-1894654746);
		if (client.anInt8609 * 2134888631 > 0) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3730, client.aClass195_8589.aClass650_2340, -672803872);
			class572_sub25.aRsByteBuffer.writeShort(-50380068 * client.anInt8609, -886351913);
			for (int i = 0; i < 2134888631 * client.anInt8609; i++) {
				Interface64 interface64 = client.anInterface64Array8610[i];
				long l = (interface64.method384(1335279474) - aLong5206 * 1627438549222122819L);
				if (l > 16777215L)
					l = 16777215L;
				aLong5206 = interface64.method384(1335279474) * 329293226375729003L;
				class572_sub25.aRsByteBuffer.writeByte(interface64.method383(-1378088108), -1384395473);
				class572_sub25.aRsByteBuffer.write24BitInteger((int) l, 726052383);
			}
			client.aClass195_8589.method2929(class572_sub25, (byte) -20);
		}
		if (anInt5203 * -12527375 > 0)
			anInt5203 -= 101390353;
		if (client.aBool8685 && anInt5203 * -12527375 <= 0) {
			anInt5203 = 2027807060;
			client.aBool8685 = false;
			int i;
			int i_2_;
			if (1 == Class18.anInt143 * 625220759) {
				if (Class133_Sub1.aClass411_Sub1_9827.method4994(-1571911890) == Class413.aClass413_4915) {
					Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -50);
					i = Class125.method2211(class423_sub3.aClass230_9806, -350201138) >> 3;
					int i_3_ = 1024;
					i_2_ = (3 * i_3_ - (Class572_Sub22.method8601((class423_sub3.aClass230_9806), 661011808) >> 3)) % (i_3_ * 2);
				} else {
					i = 0;
					i_2_ = 0;
				}
			} else {
				i = (int) client.aFloat8822 >> 3;
				i_2_ = (int) client.aFloat8678 >> 3;
			}
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3686, client.aClass195_8589.aClass650_2340, -1415243365);
			class572_sub25.aRsByteBuffer.writeShort(i_2_, -1391811191);
			class572_sub25.aRsByteBuffer.writeShortLE128(i, (byte) -57);
			client.aClass195_8589.method2929(class572_sub25, (byte) -91);
		}
		if (Class408.aBool4780 != aBool5204) {
			aBool5204 = Class408.aBool4780;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3724, client.aClass195_8589.aClass650_2340, 185032135);
			class572_sub25.aRsByteBuffer.writeByte(Class408.aBool4780 ? 1 : 0, -1384395473);
			client.aClass195_8589.method2929(class572_sub25, (byte) -115);
		}
		if (!client.aBool8854) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3680, client.aClass195_8589.aClass650_2340, -1271280485);
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
			int i = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(1293789007);
			class572_sub25.aRsByteBuffer.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 42);
			class572_sub25.aRsByteBuffer.method8552((-1585139053 * class572_sub25.aRsByteBuffer.o) - i, -830763069);
			client.aClass195_8589.method2929(class572_sub25, (byte) -46);
			client.aBool8854 = true;
		}
	}

	Class458() throws Throwable {
		throw new Error();
	}

	static final void method5444(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) -9146);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt774 * -1883230751;
	}

	static final void method5445(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -915372029;
	}
}
