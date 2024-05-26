package game;

/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class502 {
	public Class499 aClass499_5546;
	public Interface57 anInterface57_5547;
	public Class499 aClass499_5548;
	public int anInt5549;
	public boolean aBool5550;
	public Class499 aClass499_5551;
	public Interface57 anInterface57_5552;
	public int anInt5553;
	public Interface57 anInterface57_5554;
	public Interface57 anInterface57_5555;
	static int[] anIntArray5556;
	static Class675 aClass675_5557;

	public Class502(Class248 class248) {
		byte[] is = class248.method3373((Class471.aClass471_5286.anInt5290 * 960259487), (byte) -6);
		method5998(new RSByteBuffer(is), (byte) 0);
	}

	void method5998(RSByteBuffer class572_sub15, byte i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1189676237);
			if (0 == i_0_)
				break;
			if (i_0_ == 1)
				anInterface57_5554 = Class133_Sub21.method9565(class572_sub15, -501754599);
			else if (i_0_ == 2)
				anInterface57_5547 = Class133_Sub21.method9565(class572_sub15, 1802051336);
			else if (i_0_ == 3)
				anInterface57_5555 = Class133_Sub21.method9565(class572_sub15, 70597553);
			else if (i_0_ == 4)
				anInterface57_5552 = Class133_Sub21.method9565(class572_sub15, -198066508);
			else if (5 == i_0_)
				aClass499_5546 = Class133_Sub20.method9536(class572_sub15, -2099578769);
			else if (i_0_ == 6)
				aClass499_5551 = Class133_Sub20.method9536(class572_sub15, -1736767303);
			else if (7 == i_0_)
				aClass499_5548 = Class133_Sub20.method9536(class572_sub15, -1934498518);
			else if (i_0_ == 8)
				Class133_Sub21.method9565(class572_sub15, -1338556125);
			else if (i_0_ == 9)
				Class133_Sub21.method9565(class572_sub15, -1861223870);
			else if (10 == i_0_)
				Class133_Sub21.method9565(class572_sub15, -2107905161);
			else if (i_0_ == 11)
				aBool5550 = true;
			else if (12 == i_0_)
				anInt5553 = class572_sub15.readInt(765623231) * 2116299701;
			else if (i_0_ == 13)
				anInt5549 = class572_sub15.readInt(1011995164) * 23014133;
		}
	}

	void method5999(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(530500610);
			if (0 == i)
				break;
			if (i == 1)
				anInterface57_5554 = Class133_Sub21.method9565(class572_sub15, 227439767);
			else if (i == 2)
				anInterface57_5547 = Class133_Sub21.method9565(class572_sub15, 1491794596);
			else if (i == 3)
				anInterface57_5555 = Class133_Sub21.method9565(class572_sub15, -1403475947);
			else if (i == 4)
				anInterface57_5552 = Class133_Sub21.method9565(class572_sub15, -370183449);
			else if (5 == i)
				aClass499_5546 = Class133_Sub20.method9536(class572_sub15, -616129903);
			else if (i == 6)
				aClass499_5551 = Class133_Sub20.method9536(class572_sub15, -1167103801);
			else if (7 == i)
				aClass499_5548 = Class133_Sub20.method9536(class572_sub15, -1295291174);
			else if (i == 8)
				Class133_Sub21.method9565(class572_sub15, -306462357);
			else if (i == 9)
				Class133_Sub21.method9565(class572_sub15, -2070053866);
			else if (10 == i)
				Class133_Sub21.method9565(class572_sub15, -618113180);
			else if (i == 11)
				aBool5550 = true;
			else if (12 == i)
				anInt5553 = class572_sub15.readInt(1419860998) * 2116299701;
			else if (i == 13)
				anInt5549 = class572_sub15.readInt(152682382) * 23014133;
		}
	}

	void method6000(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2089283341);
			if (0 == i)
				break;
			if (i == 1)
				anInterface57_5554 = Class133_Sub21.method9565(class572_sub15, 1219814888);
			else if (i == 2)
				anInterface57_5547 = Class133_Sub21.method9565(class572_sub15, 1975898041);
			else if (i == 3)
				anInterface57_5555 = Class133_Sub21.method9565(class572_sub15, 1357226314);
			else if (i == 4)
				anInterface57_5552 = Class133_Sub21.method9565(class572_sub15, -999997216);
			else if (5 == i)
				aClass499_5546 = Class133_Sub20.method9536(class572_sub15, -1721228746);
			else if (i == 6)
				aClass499_5551 = Class133_Sub20.method9536(class572_sub15, -1075072106);
			else if (7 == i)
				aClass499_5548 = Class133_Sub20.method9536(class572_sub15, -2053319682);
			else if (i == 8)
				Class133_Sub21.method9565(class572_sub15, -700416337);
			else if (i == 9)
				Class133_Sub21.method9565(class572_sub15, 1647223003);
			else if (10 == i)
				Class133_Sub21.method9565(class572_sub15, 1192460638);
			else if (i == 11)
				aBool5550 = true;
			else if (12 == i)
				anInt5553 = class572_sub15.readInt(-209191012) * 2116299701;
			else if (i == 13)
				anInt5549 = class572_sub15.readInt(-537236312) * 23014133;
		}
	}

	void method6001(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(927624763);
			if (0 == i)
				break;
			if (i == 1)
				anInterface57_5554 = Class133_Sub21.method9565(class572_sub15, -130019060);
			else if (i == 2)
				anInterface57_5547 = Class133_Sub21.method9565(class572_sub15, 271980484);
			else if (i == 3)
				anInterface57_5555 = Class133_Sub21.method9565(class572_sub15, 639899390);
			else if (i == 4)
				anInterface57_5552 = Class133_Sub21.method9565(class572_sub15, 566134978);
			else if (5 == i)
				aClass499_5546 = Class133_Sub20.method9536(class572_sub15, -223280293);
			else if (i == 6)
				aClass499_5551 = Class133_Sub20.method9536(class572_sub15, -785775023);
			else if (7 == i)
				aClass499_5548 = Class133_Sub20.method9536(class572_sub15, -1110105911);
			else if (i == 8)
				Class133_Sub21.method9565(class572_sub15, 1149276731);
			else if (i == 9)
				Class133_Sub21.method9565(class572_sub15, 207545853);
			else if (10 == i)
				Class133_Sub21.method9565(class572_sub15, 799883034);
			else if (i == 11)
				aBool5550 = true;
			else if (12 == i)
				anInt5553 = class572_sub15.readInt(277289399) * 2116299701;
			else if (i == 13)
				anInt5549 = class572_sub15.readInt(862757988) * 23014133;
		}
	}

	void method6002(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(270388979);
			if (0 == i)
				break;
			if (i == 1)
				anInterface57_5554 = Class133_Sub21.method9565(class572_sub15, 1211945778);
			else if (i == 2)
				anInterface57_5547 = Class133_Sub21.method9565(class572_sub15, -1040345457);
			else if (i == 3)
				anInterface57_5555 = Class133_Sub21.method9565(class572_sub15, 1845260928);
			else if (i == 4)
				anInterface57_5552 = Class133_Sub21.method9565(class572_sub15, -2072585477);
			else if (5 == i)
				aClass499_5546 = Class133_Sub20.method9536(class572_sub15, -116750356);
			else if (i == 6)
				aClass499_5551 = Class133_Sub20.method9536(class572_sub15, 458041213);
			else if (7 == i)
				aClass499_5548 = Class133_Sub20.method9536(class572_sub15, 186692275);
			else if (i == 8)
				Class133_Sub21.method9565(class572_sub15, -605305410);
			else if (i == 9)
				Class133_Sub21.method9565(class572_sub15, -580378117);
			else if (10 == i)
				Class133_Sub21.method9565(class572_sub15, -1329539900);
			else if (i == 11)
				aBool5550 = true;
			else if (12 == i)
				anInt5553 = class572_sub15.readInt(-441347462) * 2116299701;
			else if (i == 13)
				anInt5549 = class572_sub15.readInt(1146607899) * 23014133;
		}
	}

	static RSByteBuffer method6003(int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(518);
		Class345.anIntArray4373 = new int[4];
		Class345.anIntArray4373[0] = (int) (Math.random() * 9.9999999E7);
		Class345.anIntArray4373[1] = (int) (Math.random() * 9.9999999E7);
		Class345.anIntArray4373[2] = (int) (Math.random() * 9.9999999E7);
		Class345.anIntArray4373[3] = (int) (Math.random() * 9.9999999E7);
		class572_sub15.writeByte(10, -1384395473);
		class572_sub15.writeInt(Class345.anIntArray4373[0], -1743753997);
		class572_sub15.writeInt(Class345.anIntArray4373[1], -1743753997);
		class572_sub15.writeInt(Class345.anIntArray4373[2], -1743753997);
		class572_sub15.writeInt(Class345.anIntArray4373[3], -1743753997);
		return class572_sub15;
	}

	static final void method6004(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == client.anInt8861 * 1472719885 && i_1_ < client.anInt8860 * 681720871)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_1_].anInt207 * 1870287645;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method6005(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class491.method5862(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1554645239), 200, (byte) 119);
	}

	public static long method6006(int i, int i_2_) {
		return 86400000L * (long) (11745 + i);
	}
}
