package game;

/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class457 {
	Class127 aClass127_5199 = new Class127(2);
	Class248 aClass248_5200;
	static int anInt5201;

	void method5410(int i, int i_0_) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2235(i, 1398041750);
		}
	}

	void method5411() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2231((byte) -53);
		}
	}

	void method5412() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2231((byte) -128);
		}
	}

	void method5413(byte i) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2234((byte) 80);
		}
	}

	Class457(Class248 class248) {
		((Class457) this).aClass248_5200 = class248;
	}

	void method5414() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2231((byte) -45);
		}
	}

	void method5415() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2234((byte) -25);
		}
	}

	void method5416(int i) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2235(i, 1478149273);
		}
	}

	void method5417(int i) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2235(i, 1484907455);
		}
	}

	void method5418(int i) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2235(i, 2079571869);
		}
	}

	void method5419() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2234((byte) -46);
		}
	}

	void method5420(int i) {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2231((byte) -72);
		}
	}

	void method5421() {
		synchronized (((Class457) this).aClass127_5199) {
			((Class457) this).aClass127_5199.method2234((byte) -28);
		}
	}

	static final void method5422(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub4_9200), i_1_, 732149285);
		Class623.method7443(-1440275188);
		client.aBool8854 = false;
	}

	static final void method5423(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class78 class78 = ((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_2_, 1936440878));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class78.anInt965 * 1751892143;
	}

	public static String method5424(CharSequence charsequence, int i) {
		String string = Class411_Sub1.method9571(Class490.method5847(charsequence, 2075023208));
		if (null == string)
			string = "";
		return string;
	}

	public static void method5425(int i, int i_3_) {
		if (835742603 * client.anInt8580 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3748, client.aClass195_8632.aClass650_2340, -1813381481);
			class572_sub25.aRsByteBuffer.writeByte(i, -1384395473);
			client.aClass195_8632.method2929(class572_sub25, (byte) -39);
		}
	}

	public static final void method5426(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		Class442.anInt5132 = 236536067 * i;
		Class438.anInt5081 = i_4_ * -60353361;
		Class44.anInt445 = 1259795305 * i_5_;
		Class643.anInt8310 = -1154680919 * i_6_;
		Class347.anInt4389 = i_7_ * 1504548579;
		if (625220759 * Class18.anInt143 == 1)
			Class67.method1056(-1456532429);
		if (Class347.anInt4389 * -219783477 >= 100) {
			int i_9_ = 256 + Class442.anInt5132 * 543380992;
			int i_10_ = 2038734336 * Class438.anInt5081 + 256;
			int i_11_ = (Class314.method4072(i_9_, i_10_, -374189215 * Class274.anInt2911, -2109260900) - 611634393 * Class44.anInt445);
			int i_12_ = i_9_ - Class36.anInt387 * 386814715;
			int i_13_ = i_11_ - Class572_Sub13_Sub2.anInt11451 * -1094666305;
			int i_14_ = i_10_ - Class49.anInt490 * -999214779;
			int i_15_ = (int) Math.sqrt((double) (i_14_ * i_14_ + i_12_ * i_12_));
			Class455.anInt5187 = ((int) (Math.atan2((double) i_13_, (double) i_15_) * 2607.5945876176133) & 0x3fff) * 58615007;
			Class406.anInt4765 = ((int) (Math.atan2((double) i_12_, (double) i_14_) * -2607.5945876176133) & 0x3fff) * 1259382101;
			Class88.anInt1225 = 0;
			if (Class455.anInt5187 * 1406555935 < 1024)
				Class455.anInt5187 = -107774976;
			if (1406555935 * Class455.anInt5187 > 3072)
				Class455.anInt5187 = -323324928;
		}
		Class18.anInt143 = 711307203;
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
	}

	static void method5427(Entity class456_sub1_sub2_sub3, int i) {
		if (class456_sub1_sub2_sub3 instanceof NPC) {
			NPC class456_sub1_sub2_sub3_sub1 = (NPC) class456_sub1_sub2_sub3;
			if (null != class456_sub1_sub2_sub3_sub1.aClass410_11803)
				Class72.method1087(class456_sub1_sub2_sub3_sub1, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != class456_sub1_sub2_sub3_sub1.aByte9009), (byte) -87);
		} else if (class456_sub1_sub2_sub3 instanceof Player) {
			Player class456_sub1_sub2_sub3_sub2 = (Player) class456_sub1_sub2_sub3;
			Class569.method6762(class456_sub1_sub2_sub3_sub2, ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) != class456_sub1_sub2_sub3_sub2.aByte9009), (byte) -114);
		}
	}

	static final void method5428(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class614.anInt8038 * 1319874821;
	}

	public static void method5429(int i) {
		synchronized (Class474.aClass127_5325) {
			Class474.aClass127_5325.method2234((byte) 70);
		}
		synchronized (Class474.aClass127_5323) {
			Class474.aClass127_5323.method2234((byte) 19);
		}
	}
}
