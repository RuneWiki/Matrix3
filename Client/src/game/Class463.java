package game;

/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class463 {
	public int anInt5233;
	static int anInt5234;

	public Class463(int i) {
		anInt5233 = i * 282426451;
	}

	static void method5475(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), -636555444))).method4667(Class133_Sub23.playerVarsProvider, (byte) 109) ? 1 : 0);
	}

	static final void method5476(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_1_, -225876280));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(i_0_, -552288335)).method4953(i_1_, class264.aString2833, 1697828621);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(i_0_, 1829031040)).method4952(i_1_, class264.anInt2832 * -1132777561, 156194632));
	}

	static final void method5477(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class284 class284 = Class549_Sub1.method8097(Class88.aClass248_1226, i_3_, 0, 707569257);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class284.method3835(string, i_2_, Class14.aClass161Array123, -991932046);
	}

	public static void method5478(int i, int i_4_) {
		if (i != 835742603 * client.anInt8580) {
			client.anInt8620 = 0;
			if (1 == client.anInt8580 * 835742603 && 18 != i)
				Class620.method7428(-1031760431);
			if (i == 13 || 14 == i)
				Class405.method4851(-1400821870);
			if (13 != i && null != Class665_Sub1.aClass555_8908) {
				Class665_Sub1.aClass555_8908.method6558(703719362);
				Class665_Sub1.aClass555_8908 = null;
			}
			if (12 == i)
				Class536.method6382((6 == 835742603 * client.anInt8580 || client.anInt8580 * 835742603 == 0 || ((-1114159579 * JS5ConfigGroup.aClass484_2593.anInt5404) != -507155049 * client.anInt8790)), 571775031);
			if (i == 5) {
				boolean bool;
				if (100383219 * JS5ConfigGroup.aClass484_2593.anInt5403 == -1)
					bool = (15 == client.anInt8580 * 835742603 || 835742603 * client.anInt8580 == 4);
				else
					bool = (100383219 * JS5ConfigGroup.aClass484_2593.anInt5403 != -507155049 * client.anInt8790);
				Class246.method3358(bool, -1806761884);
			}
			if (i == 15 || i == 4) {
				if (!Class253.method3516(-435944734))
					return;
			} else if (i == 2 || 11 == i && 3 != client.anInt8580 * 835742603) {
				if (!Class405.method4851(589336513))
					return;
			} else if (0 == i)
				Class467.method5543((byte) -67);
			if (Class177.method2766(i, (short) 5257))
				client.aClass613_8605.method7297((byte) 0);
			if (i == 18 || i == 12)
				Class175.method2754((byte) 0);
			boolean bool = (8 == i || Class133_Sub12.method9368(i, 2134888631) || Class19.method692(i, (byte) 4));
			boolean bool_5_ = (8 == 835742603 * client.anInt8580 || Class133_Sub12.method9368(client.anInt8580 * 835742603, 2134888631) || Class19.method692(client.anInt8580 * 835742603, (byte) 4));
			if (bool != bool_5_)
				Class51.aClass278_491.method3729(!bool, 1801933192);
			if (Class177.method2766(i, (short) -3214) || 13 == i || 14 == i)
				Class272_Sub2.aClass106_9517.method2044();
			client.anInt8580 = -1084398557 * i;
		}
	}

	static final void method5479(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub18_9206, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 1 : 0, 1671033753);
		Class623.method7443(-1164154583);
		client.aBool8854 = false;
	}
}
