package game;

/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class245 {
	static final int anInt2677 = 1;
	static final int anInt2678 = 4;
	static final int anInt2679 = 2;
	static final int anInt2680 = 3;
	static final int anInt2681 = 0;
	static final int anInt2682 = 6;
	static final int anInt2683 = 7;

	Class245() throws Throwable {
		throw new Error();
	}

	static boolean method3348(int i, int i_0_, int i_1_) {
		if (i_0_ >= 1000 && i < 1000)
			return true;
		if (i_0_ < 1000 && i < 1000) {
			if (Class83.method1258(i, -478141147))
				return true;
			if (Class83.method1258(i_0_, -478141147))
				return false;
			return true;
		}
		if (i_0_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static final void method3349(Cs2Executor class441, byte i) {
		NPC class456_sub1_sub2_sub3_sub1 = ((NPC) ((Cs2Executor) class441).entity);
		boolean bool = false;
		NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
		if (class410.anIntArray4795 != null)
			class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1606363845);
		if (class410 != null)
			bool = class410.aBool4827;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = bool ? 1 : 0;
	}

	static final void method3350(int i) {
		if (client.aFloat8822 < 1077.0F)
			client.aFloat8822 = 1077.0F;
		if (client.aFloat8822 > 2987.0F)
			client.aFloat8822 = 2987.0F;
		for (/**/; client.aFloat8678 >= 16384.0F; client.aFloat8678 -= 16384.0F) {
			/* empty */
		}
		for (/**/; client.aFloat8678 < 0.0F; client.aFloat8678 += 16384.0F) {
			/* empty */
		}
		Class274 class274 = client.aClass613_8605.method7287((byte) -74);
		Class523 class523 = client.aClass613_8605.method7285(1085574320);
		int i_2_ = 1007135537 * Entity.anInt11674 >> 9;
		int i_3_ = Class165.anInt2050 * -1126693191 >> 9;
		int i_4_ = Class314.method4072((1007135537 * Entity.anInt11674), Class165.anInt2050 * -1126693191, Class274.anInt2911 * -374189215, -1805988153);
		int i_5_ = 0;
		if (i_2_ > 3 && i_3_ > 3 && i_2_ < client.aClass613_8605.method7347(872442568) - 4 && i_3_ < client.aClass613_8605.method7278(277214477) - 4) {
			for (int i_6_ = i_2_ - 4; i_6_ <= 4 + i_2_; i_6_++) {
				for (int i_7_ = i_3_ - 4; i_7_ <= i_3_ + 4; i_7_++) {
					int i_8_ = -374189215 * Class274.anInt2911;
					if (i_8_ < 3 && class274.method3689(i_6_, i_7_, -2022498892))
						i_8_++;
					int i_9_ = 0;
					byte[][] is = client.aClass613_8605.method7307(i_8_, 660236451);
					if (null != is)
						i_9_ = (is[i_6_][i_7_] & 0xff) * 8 << 2;
					if (class523.aClass174Array5875 != null && null != class523.aClass174Array5875[i_8_]) {
						int i_10_ = i_4_ - (class523.aClass174Array5875[i_8_].method2713(i_6_, i_7_, -572563136) - i_9_);
						if (i_10_ > i_5_)
							i_5_ = i_10_;
					}
				}
			}
		}
		int i_11_ = 1536 * (i_5_ >> 2);
		if (i_11_ > 786432)
			i_11_ = 786432;
		if (i_11_ < 262144)
			i_11_ = 262144;
		if (i_11_ > -171256967 * client.anInt8686)
			client.anInt8686 += 406595273 * ((i_11_ - client.anInt8686 * -171256967) / 24);
		else if (i_11_ < client.anInt8686 * -171256967)
			client.anInt8686 += (i_11_ - client.anInt8686 * -171256967) / 80 * 406595273;
	}

	public static final void method3351(int i) {
		for (int i_12_ = 0; i_12_ < 5; i_12_++)
			client.aBoolArray8842[i_12_] = false;
		client.anInt8690 = 1542880195;
		client.anInt8711 = -527050097;
		Class643.anInt8310 = 0;
		Class347.anInt4389 = 0;
		Class18.anInt143 = -574470578;
		if (Class111.method2081((byte) -100) == 1) {
			Class497 class497 = client.aClass613_8605.method7280((byte) -108);
			int i_13_ = -2109597897 * class497.localX << 9;
			int i_14_ = 417324155 * class497.localY << 9;
			int i_15_ = 1000 / Class425.method5176(154124627);
			Class133_Sub1.aClass411_Sub1_9827.method5012((float) i_15_ / 1000.0F, (client.aClass613_8605.method7293(-444440354).anIntArrayArrayArray3141), client.aClass613_8605.method7287((byte) -55), i_13_, i_14_, (byte) -30);
		}
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
		client.anInt8669 = -1410198393 * client.cycles;
		Class667.anInt8510 = Class36.anInt387 * 524410443;
		Class428.anInt5022 = -1652835303 * Class572_Sub13_Sub2.anInt11451;
		ItemDefinitions.anInt8194 = -1316646979 * Class49.anInt490;
		Class75.anInt943 = -698355399 * Class455.anInt5187;
		Class119.anInt1467 = Class406.anInt4765 * -610619311;
		Class179_Sub2.anInt10735 = client.anInt8859 * 358878937;
	}

	static void method3352(Class655 class655, int i) {
		Class16.aClass655_133 = class655;
	}

	public static void method3353(boolean bool, boolean bool_16_, byte i) {
		if (bool) {
			Class460.anInt5214 += -1525232765;
			Class397.method4760(1493033042);
		}
		if (bool_16_) {
			Class460.anInt5211 += 1007582257;
			Class105.method1655(1134455722);
		}
	}
}
