package game;

/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class371 implements Interface38 {
	public static final int anInt4527 = 0;
	public static final int anInt4528 = 1;
	public static final int anInt4529 = 2;
	public Class320 aClass320_4530;
	public int anInt4531;
	public int anInt4532;
	public int anInt4533;
	public Class300 aClass300_4534;
	public int anInt4535;
	public int anInt4536;

	Class371(Class320 class320, Class300 class300, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		aClass320_4530 = class320;
		aClass300_4534 = class300;
		anInt4531 = 593723021 * i;
		anInt4533 = 1084400631 * i_0_;
		anInt4532 = 634732787 * i_1_;
		anInt4535 = 1559472155 * i_2_;
		anInt4536 = i_3_ * 1626351873;
	}

	public Class310 method218() {
		return Class310.aClass310_3661;
	}

	public Class310 method214() {
		return Class310.aClass310_3661;
	}

	public Class310 method215(byte i) {
		return Class310.aClass310_3661;
	}

	public Class310 method217() {
		return Class310.aClass310_3661;
	}

	public Class310 method216() {
		return Class310.aClass310_3661;
	}

	static final void method4603(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class611.method7269(class73, class83, class441, -478040439);
	}

	static final void method4604(Cs2Executor class441, int i) {
		Class78.method1178(408732153);
	}

	public static void method4605(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class520.aLinkedList5808.addLast(new Class521(i, i_4_, i_5_ - i, i_6_ - i_4_));
	}

	static final void method4606(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class134_Sub1.method9976((byte) 0);
	}

	static final void method4607(int i, int i_8_) {
		int i_9_ = client.cycles - client.anInt8669 * 908226871;
		if (i_9_ >= 100) {
			Class18.anInt143 = Class111.method2081((byte) -122) * 1860248359;
			Class419.anInt4958 = 1724865785;
			Class566.anInt6375 = 2114279121;
		} else {
			float f = 1.0F - (float) ((100 - i_9_) * (100 - i_9_) * (100 - i_9_)) / 1000000.0F;
			int i_10_;
			if (Class111.method2081((byte) -6) == 1) {
				Class572_Sub17 class572_sub17 = Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -99).method5146(-324236549);
				Class497 class497 = client.aClass613_8605.method7280((byte) -81);
				Class455.anInt5187 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method4999(1276740472) * 2607.5945876176133) & 0x3fff) * 58615007;
				Class406.anInt4765 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * -2607.5945876176133) & 0x3fff) * 1259382101;
				Class88.anInt1225 = 0;
				client.anInt8859 = (int) ((float) (1848910519 * Class179_Sub2.anInt10735) + (float) ((int) ((double) (199182677 * client.anInt8821) / (4.0 * (Math.tan((double) ((Class133_Sub1.aClass411_Sub1_9827.method4998((byte) -86)) / 2.0F))))) - (Class179_Sub2.anInt10735 * 1848910519)) * f) * 1842040031;
				Class36.anInt387 = (int) ((float) (Class667.anInt8510 * 2075242513) + ((float) (class572_sub17.anInt9126 * -862367545 - class497.localX * -2077331968 - Class667.anInt8510 * 2075242513) * f)) * 70707251;
				Class572_Sub13_Sub2.anInt11451 = ((int) (f * (float) (-(-930360273 * class572_sub17.anInt9127) - 2061733271 * Class428.anInt5022) + (float) (2061733271 * Class428.anInt5022)) * -371247041);
				Class49.anInt490 = (-114706035 * (int) ((float) (1085185065 * ItemDefinitions.anInt8194) + f * (float) ((class572_sub17.anInt9124 * -1661817525) - (-1078397440 * class497.localY) - (1085185065 * ItemDefinitions.anInt8194))));
				i_10_ = (-(Class406.anInt4765 * 426389501) - Class119.anInt1467 * 1024812525) & 0x3fff;
				if (i_10_ > 8192)
					i_10_ -= 16384;
				else if (i_10_ < -8192)
					i_10_ += 16384;
			} else {
				int i_11_ = (int) client.aFloat8822;
				if (-171256967 * client.anInt8686 >> 8 > i_11_)
					i_11_ = -171256967 * client.anInt8686 >> 8;
				if (client.aBoolArray8842[4] && 128 + client.anIntArray8848[4] > i_11_)
					i_11_ = client.anIntArray8848[4] + 128;
				int i_12_ = (-706438965 * client.anInt8665 + (int) client.aFloat8678 & 0x3fff);
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class246.method3359(1007135537 * Entity.anInt11674, (Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, -374189215 * Class274.anInt2911, -1884443693) - client.anInt8684 * 1915481369), -1126693191 * Class165.anInt2050, i_11_, i_12_, 3 * (i_11_ >> 3) + 600 << 2, i, -1578371688);
				Class36.anInt387 = ((int) ((float) (Class36.anInt387 * 386814715 - 2075242513 * Class667.anInt8510) * f + (float) (Class667.anInt8510 * 2075242513)) * 70707251);
				Class572_Sub13_Sub2.anInt11451 = ((int) ((float) (2061733271 * Class428.anInt5022) + f * (float) ((-1094666305 * Class572_Sub13_Sub2.anInt11451) - (2061733271 * Class428.anInt5022))) * -371247041);
				Class49.anInt490 = (int) ((float) (ItemDefinitions.anInt8194 * 1085185065) + f * (float) (Class49.anInt490 * -999214779 - (ItemDefinitions.anInt8194 * 1085185065))) * -114706035;
				Class455.anInt5187 = (58615007 * (int) ((float) (277086999 * Class75.anInt943) + f * (float) (1406555935 * Class455.anInt5187 - (Class75.anInt943 * 277086999))));
				i_10_ = (Class406.anInt4765 * 426389501 - Class119.anInt1467 * 1024812525);
				if (i_10_ > 8192)
					i_10_ -= 16384;
				else if (i_10_ < -8192)
					i_10_ += 16384;
			}
			Class406.anInt4765 = 1259382101 * (int) ((float) (Class119.anInt1467 * 1024812525) + f * (float) i_10_);
			Class406.anInt4765 = (426389501 * Class406.anInt4765 & 0x3fff) * 1259382101;
			client.anInt8859 = (int) ((float) (Class179_Sub2.anInt10735 * 1848910519) + ((float) (-694980833 * client.anInt8859 - 1848910519 * Class179_Sub2.anInt10735) * f)) * 1842040031;
		}
	}
}
