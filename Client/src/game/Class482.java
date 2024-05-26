package game;

/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class482 {
	public int[][] anIntArrayArray5363 = new int[3][5];
	public static final int anInt5364 = 1;
	public static final int anInt5365 = 2;
	public static final int anInt5366 = 3;
	public static final int anInt5367 = 5;
	public static final int anInt5368 = 1;
	static final int anInt5369 = 100;
	public static final int anInt5370 = 3;
	public static final int anInt5371 = 4;
	static final int anInt5372 = 3;
	public static final int anInt5373 = 0;
	public static final int anInt5374 = 0;
	public static final int anInt5375 = 2;
	public int anInt5376;
	public int anInt5377;
	public int anInt5378;
	public int anInt5379;
	public int anInt5380;
	public int anInt5381;
	public int anInt5382;

	void method5740(RSByteBuffer class572_sub15, byte i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(699043908);
			if (0 == i_0_)
				break;
			if (1 == i_0_)
				anInt5376 = class572_sub15.readInt(1198755656) * -1333579593;
			else if (2 == i_0_)
				anInt5377 = class572_sub15.readInt(1817542597) * -379103517;
			else if (i_0_ == 3)
				anInt5382 = class572_sub15.readInt(58883659) * -380499857;
			else if (4 == i_0_)
				anInt5378 = class572_sub15.readUnsignedByte(174194301) * 166541715;
			else if (5 == i_0_)
				anInt5379 = class572_sub15.readUnsignedByte(455502745) * -1828548161;
			else if (i_0_ == 6)
				anInt5380 = class572_sub15.readInt(1338014722) * 486156875;
			else if (7 == i_0_)
				anInt5381 = class572_sub15.readInt(-317591943) * -1857731827;
			else if (i_0_ >= 100) {
				i_0_ -= 100;
				anIntArrayArray5363[i_0_ & (int) (Math.pow(2.0, 3.0) - 1.0)][i_0_ >> 3] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	void method5741(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1093529100);
			if (0 == i)
				break;
			if (1 == i)
				anInt5376 = class572_sub15.readInt(368079347) * -1333579593;
			else if (2 == i)
				anInt5377 = class572_sub15.readInt(861892549) * -379103517;
			else if (i == 3)
				anInt5382 = class572_sub15.readInt(961903660) * -380499857;
			else if (4 == i)
				anInt5378 = class572_sub15.readUnsignedByte(1629744675) * 166541715;
			else if (5 == i)
				anInt5379 = class572_sub15.readUnsignedByte(2120529050) * -1828548161;
			else if (i == 6)
				anInt5380 = class572_sub15.readInt(-649572829) * 486156875;
			else if (7 == i)
				anInt5381 = class572_sub15.readInt(83470780) * -1857731827;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray5363[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	void method5742(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(347462734);
			if (0 == i)
				break;
			if (1 == i)
				anInt5376 = class572_sub15.readInt(-324236811) * -1333579593;
			else if (2 == i)
				anInt5377 = class572_sub15.readInt(1903676431) * -379103517;
			else if (i == 3)
				anInt5382 = class572_sub15.readInt(-670851621) * -380499857;
			else if (4 == i)
				anInt5378 = class572_sub15.readUnsignedByte(1806555712) * 166541715;
			else if (5 == i)
				anInt5379 = class572_sub15.readUnsignedByte(686526538) * -1828548161;
			else if (i == 6)
				anInt5380 = class572_sub15.readInt(438248323) * 486156875;
			else if (7 == i)
				anInt5381 = class572_sub15.readInt(2122732176) * -1857731827;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray5363[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	public Class482(Class248 class248) {
		byte[] is = class248.method3373((960259487 * Class471.aClass471_5285.anInt5290), (byte) -37);
		if (null != is) {
			/* empty */
		}
		method5740(new RSByteBuffer(is), (byte) 1);
	}

	public static void method5743(int i, int i_1_) {
		Class294.anInt3455 = i * -338953965;
		synchronized (Class474.aClass127_5323) {
			Class474.aClass127_5323.method2231((byte) -97);
		}
		synchronized (Class474.aClass127_5325) {
			Class474.aClass127_5325.method2231((byte) -101);
		}
	}

	static final void method5744(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class594.method7024(class73, class83, class441, (byte) 0);
	}

	public static int[] method5745(int i, byte i_2_) {
		int[] is = new int[3];
		Class388.method4694(Class502.method6006(i, 1908603425));
		is[0] = Class273.aCalendar2899.get(5);
		is[1] = Class273.aCalendar2899.get(2);
		is[2] = Class273.aCalendar2899.get(1);
		return is;
	}

	static final void method5746(Cs2Executor class441, byte i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6461(i_3_);
		if (null == class572_sub12_sub5) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (class572_sub12_sub5.anInt11327 * 949322831 - 1186523151 * class572_sub12_sub5.anInt11326);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (class572_sub12_sub5.anInt11329 * -1909732425 - class572_sub12_sub5.anInt11328 * -1560625877);
		}
	}

	static final void method5747(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub24_9221, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1636801533);
		client.aClass613_8605.method7302(430782079);
		Class623.method7443(-1725428006);
		client.aBool8854 = false;
	}

	public static void method5748(int i, int i_4_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(15, (long) i);
		class572_sub12_sub11.method10384(-1814292585);
	}
}
