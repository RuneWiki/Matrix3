package game;

/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class378 implements Interface38 {
	public int anInt4574;
	public Class320 aClass320_4575;
	public boolean aBool4576;
	public int anInt4577;
	public int anInt4578;
	public int anInt4579;
	public int anInt4580;
	public int anInt4581;
	public int anInt4582;
	public int anInt4583;
	public Class300 aClass300_4584;

	public Class310 method217() {
		return Class310.aClass310_3653;
	}

	public Class310 method215(byte i) {
		return Class310.aClass310_3653;
	}

	public Class310 method214() {
		return Class310.aClass310_3653;
	}

	public Class310 method216() {
		return Class310.aClass310_3653;
	}

	public Class310 method218() {
		return Class310.aClass310_3653;
	}

	Class378(int i, Class320 class320, Class300 class300, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt4583 = i * 1955088255;
		aClass320_4575 = class320;
		aClass300_4584 = class300;
		anInt4582 = i_0_ * 1324941639;
		anInt4577 = 122865387 * i_1_;
		anInt4581 = i_2_ * 1190318419;
		anInt4579 = 12264713 * i_3_;
		anInt4578 = 501149549 * i_4_;
		anInt4580 = 145285127 * i_5_;
		anInt4574 = i_6_ * 2008264851;
		aBool4576 = bool;
	}

	public static Class311 method4625(RSByteBuffer class572_sub15, int i) {
		int i_7_ = class572_sub15.readBigSmart((byte) 49);
		return new Class311(i_7_);
	}

	public static void method4626(boolean bool, int i) {
		Class344.audio.method920((short) -8725);
		if (Class435.method5266(client.anInt8580 * 835742603, (byte) -60)) {
			Class195[] class195s = client.aClass195Array8592;
			for (int i_8_ = 0; i_8_ < class195s.length; i_8_++) {
				Class195 class195 = class195s[i_8_];
				class195.anInt2337 += 394568993;
				if (class195.anInt2337 * -1242489119 < 50 && !bool)
					return;
				class195.anInt2337 = 0;
				if (!class195.aBool2344 && class195.method2933(-2013879938) != null) {
					Class572_Sub25 class572_sub25 = sendOutPacket(OutgoingPacket.aClass312_3770, class195.aClass650_2340, -472052082);
					class195.method2929(class572_sub25, (byte) -116);
					try {
						class195.method2936((byte) 8);
					} catch (IOException ioexception) {
						class195.aBool2344 = true;
					}
				}
			}
			Class344.audio.method920((short) 2141);
		}
	}

	static final void method4627(Cs2Executor class441, byte i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub6_9222.method7863(i_9_, 45940963);
	}

	static final void method4628(Cs2Executor class441, int i) {
		OutgoingPacket.method4058(((Class456_Sub1) ((Cs2Executor) class441).anInterface65_5117), class441, -638493247);
	}

	static final void method4629(Cs2Executor class441, byte i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_10_, (short) 1372);
		Class83 class83 = Class534.aClass83Array5975[i_10_ >> 16];
		Class298.method3972(class73, class83, class441, -932404972);
	}

	static void method4630(InterfaceDefinitions class73, int i, int i_11_, int i_12_) {
		if (client.aBool8754) {
			Class264 class264 = (Class264) (Class572_Sub12_Sub1.anInt11252 * -881690847 != -1 ? (Class273.aClass639_Sub3_2901.getDefinition(-881690847 * Class572_Sub12_Sub1.anInt11252, 896629964)) : null);
			if (client.method7992(class73).method8650((short) 2210) && 0 != (Class8.anInt43 * -1613657659 & 0x20) && (class264 == null || (class73.method1096((-881690847 * Class572_Sub12_Sub1.anInt11252), -1132777561 * class264.anInt2832, (byte) 78) != -1132777561 * class264.anInt2832)))
				Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(class73.aString847).toString(), Class510.anInt5693 * 1904277101, 58, 411192987 * class73.nvmtheindexisotherone, 0L, -1665128073 * class73.activeComponent, class73.selfId * -1718435171, true, false, (long) ((-1665128073 * class73.activeComponent << 32) | -1718435171 * class73.selfId), false, 1447140101);
		}
		for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
			String string = Class104_Sub2.method9934(class73, i_13_, (byte) 0);
			if (null != string)
				Class592.method7012(string, class73.aString847, Class386.method4684(class73, i_13_, -1042067865), 1007, 411192987 * class73.nvmtheindexisotherone, (long) (1 + i_13_), class73.activeComponent * -1665128073, class73.selfId * -1718435171, true, false, (long) ((-1665128073 * class73.activeComponent << 32) | class73.selfId * -1718435171), false, 1447140101);
		}
		String string = Class607.method7252(class73, -1046506137);
		if (string != null)
			Class592.method7012(string, class73.aString847, class73.anInt740 * -1424115843, 25, class73.nvmtheindexisotherone * 411192987, 0L, class73.activeComponent * -1665128073, class73.selfId * -1718435171, true, false, (long) (class73.activeComponent * -1665128073 << 32 | -1718435171 * class73.selfId), false, 1447140101);
		for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
			String string_15_ = Class104_Sub2.method9934(class73, i_14_, (byte) 0);
			if (null != string_15_)
				Class592.method7012(string_15_, class73.aString847, Class386.method4684(class73, i_14_, -1042067865), 57, 411192987 * class73.nvmtheindexisotherone, (long) (1 + i_14_), class73.activeComponent * -1665128073, class73.selfId * -1718435171, true, false, (long) ((-1665128073 * class73.activeComponent << 32) | -1718435171 * class73.selfId), false, 1447140101);
		}
		if (client.method7992(class73).method8645((byte) 5)) {
			if (null != class73.aString849)
				Class592.method7012(class73.aString849, "", -1, 30, 411192987 * class73.nvmtheindexisotherone, 0L, class73.activeComponent * -1665128073, -1718435171 * class73.selfId, true, false, (long) ((-1665128073 * class73.activeComponent << 32) | class73.selfId * -1718435171), false, 1447140101);
			else
				Class592.method7012(Class279.aClass279_2967.method3758(Class594.aClass435_7823, 16711935), "", -1, 30, class73.nvmtheindexisotherone * 411192987, 0L, class73.activeComponent * -1665128073, class73.selfId * -1718435171, true, false, (long) (-1665128073 * class73.activeComponent << 32 | class73.selfId * -1718435171), false, 1447140101);
		}
	}

	public static Class572_Sub25 sendOutPacket(OutgoingPacket packet, Class650 class650, int i) {
		Class572_Sub25 class572_sub25 = Class104_Sub1_Sub2.method10145((byte) 109);
		((Class572_Sub25) class572_sub25).aClass312_9253 = packet;
		((Class572_Sub25) class572_sub25).anInt9251 = ((OutgoingPacket) packet).anInt3792 * -94096627;
		if (-1 == -531565405 * ((Class572_Sub25) class572_sub25).anInt9251)
			class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(260);
		else if (-2 == -531565405 * ((Class572_Sub25) class572_sub25).anInt9251)
			class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(10000);
		else if (((Class572_Sub25) class572_sub25).anInt9251 * -531565405 <= 18)
			class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(20);
		else if (((Class572_Sub25) class572_sub25).anInt9251 * -531565405 <= 98)
			class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(100);
		else
			class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(260);
		class572_sub25.aRsByteBuffer.method10388(class650, (byte) 34);
		class572_sub25.aRsByteBuffer.method10389((((OutgoingPacket) ((Class572_Sub25) class572_sub25).aClass312_9253).anInt3763) * 1414223481, -965204308);
		class572_sub25.anInt9254 = 0;
		return class572_sub25;
	}

	static boolean method4632(int i, int i_16_) {
		if (3 == i || i == 4 || i == 5 || 6 == i || i == 1001 || i == 1002)
			return true;
		if (2 == i)
			return true;
		return false;
	}

	static void method4633(int i) {
		Class192.anInt2304 = 0;
		Class192.anInt2310 = 3733871;
		Class192.anInt2300 = 343091919;
	}
}
