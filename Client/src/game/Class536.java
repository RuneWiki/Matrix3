package game;

/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class536 {
	short aShort5986;
	public Class536 aClass536_5987;
	public Class456_Sub1_Sub4 aClass456_Sub1_Sub4_5988;
	public Class456_Sub1_Sub4 aClass456_Sub1_Sub4_5989;
	public Class456_Sub1_Sub3 aClass456_Sub1_Sub3_5990;
	public byte aByte5991;
	public Class456_Sub1_Sub1 aClass456_Sub1_Sub1_5992;
	Class456_Sub1_Sub5 aClass456_Sub1_Sub5_5993;
	public Class543 aClass543_5994;
	short aShort5995;
	short aShort5996;
	short aShort5997;
	public Class456_Sub1_Sub3 aClass456_Sub1_Sub3_5998;

	public Class536(int i) {
		aByte5991 = (byte) i;
	}

	public static void method6380(int i) {
		if (Class557.method6591(1379425910))
			Class506.method6032(new Class446(), (byte) 5);
	}

	static final void method6381(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class385.method4663(8, i_0_ << 16 | i_1_, i_2_, "", (byte) -127);
	}

	public static void method6382(boolean bool, int i) {
		if (bool) {
			if (-507155049 * client.anInt8790 != -1)
				Class7.method506(-507155049 * client.anInt8790, 1875203792);
			for (Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) -38)); class572_sub29 != null; class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7969(1478485486))) {
				if (!class572_sub29.method6793((short) 150)) {
					class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) -26));
					if (null == class572_sub29)
						break;
				}
				Class96.method1554(class572_sub29, true, false, 1099844624);
			}
			client.anInt8790 = 254025177;
			client.aClass676_8760 = new Class676(8);
			Class103.method1642(213545155);
			client.anInt8790 = 530536867 * JS5ConfigGroup.aClass484_2593.anInt5404;
			if (-1 != -507155049 * client.anInt8790) {
				Class288.method3884(false, (byte) 9);
				Class54.method987((byte) 90);
				Class627.method7475(client.anInt8790 * -507155049, null, 37407838);
			}
		}
		Class408.method4940(-822501703);
		Class133_Sub1.aClass411_Sub1_9827.method5025(true, -2095889043);
		Class13.aBool114 = false;
		Class305.method4010((byte) -94);
		client.anInt8751 = 1983555971;
		GraphicsDefinition.method7772(client.anInt8750 * 415097709, -1447681941);
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 = new Player(null);
		Class507.aClass456_Sub1_Sub2_Sub3_Sub2_5600 = new Player(null);
		Class507.aClass456_Sub1_Sub2_Sub3_Sub2_5600.anInt11633 = 58605490;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5395((float) (client.aClass613_8605.method7347(-833117337) * 512 / 2), 0.0F, (float) (client.aClass613_8605.method7278(277214477) * 512 / 2));
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0] = client.aClass613_8605.method7347(-395894911) / 2;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0] = client.aClass613_8605.method7278(277214477) / 2;
		Class49.anInt490 = 0;
		Class36.anInt387 = 0;
		if (5 == Class18.anInt143 * 625220759) {
			Class36.anInt387 = (-1260801525 * Class39.anInt402 << 9) * 70707251;
			Class49.anInt490 = -114706035 * (1899264025 * Class9.anInt44 << 9);
		} else
			Class540.method6417((byte) -64);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
	}
}
