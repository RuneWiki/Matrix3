package game;

/* Class484 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class484 {
	public int anInt5390 = -462089548;
	static final int anInt5391 = 4;
	public int[] anIntArray5392 = null;
	public int[] anIntArray5393 = null;
	static final int anInt5394 = 4;
	public boolean aBool5395;
	static final int anInt5396 = 4;
	public int anInt5397;
	public int anInt5398;
	public int anInt5399;
	public int anInt5400;
	public boolean aBool5401;
	static final int anInt5402 = 7;
	public int anInt5403;
	public int anInt5404;
	public byte aByte5405;
	public int anInt5406;
	public short[][] aShortArrayArray5407;
	public short[][][] aShortArrayArrayArray5408;
	public boolean aBool5409;
	public int anInt5410 = 1119306356;
	public short aShort5411;
	public int anInt5412;
	public int anInt5413;
	public int anInt5414;
	public boolean aBool5415;
	public int anInt5416;
	public int anInt5417;
	public int anInt5418;
	public static int anInt5419;

	public Class484(Class248 class248) {
		anInt5397 = -588615716;
		anInt5399 = -986304033;
		anInt5400 = -767066347;
		anInt5404 = 1209702995;
		anInt5403 = 1767930053;
		aBool5395 = true;
		aShort5411 = (short) -1;
		aByte5405 = (byte) 0;
		anInt5398 = -190533340;
		aBool5409 = true;
		anInt5406 = 1309085298;
		aBool5401 = true;
		anInt5412 = 1847885691;
		anInt5413 = -1226940793;
		anInt5414 = 1533831821;
		anInt5416 = -794343680;
		anInt5417 = -1882456097;
		anInt5418 = -7732864;
		byte[] is = class248.method3373((Class471.aClass471_5282.anInt5290 * 960259487), (byte) -11);
		method5758(new RSByteBuffer(is), (byte) -65);
	}

	void method5758(RSByteBuffer class572_sub15, byte i) {
		boolean bool = false;
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1306556363);
			if (0 == i_0_)
				break;
			if (1 == i_0_) {
				if (null == anIntArray5392) {
					anInt5390 = -462089548;
					anIntArray5392 = new int[4];
					anIntArray5393 = new int[4];
				}
				for (int i_1_ = 0; i_1_ < anIntArray5392.length; i_1_++) {
					anIntArray5392[i_1_] = class572_sub15.readShort(-710976385);
					anIntArray5393[i_1_] = class572_sub15.readShort(-710976385);
				}
				bool = true;
			} else if (2 == i_0_)
				anInt5400 = class572_sub15.readBigSmart((byte) 113) * 767066347;
			else if (3 == i_0_) {
				anInt5390 = class572_sub15.readUnsignedByte(-9661429) * -115522387;
				anIntArray5392 = new int[anInt5390 * 1403567909];
				anIntArray5393 = new int[1403567909 * anInt5390];
			} else if (4 == i_0_)
				aBool5395 = false;
			else if (5 == i_0_)
				anInt5404 = class572_sub15.read24BitInt(1140925462) * -1209702995;
			else if (6 == i_0_)
				anInt5403 = class572_sub15.read24BitInt(1140925462) * -1767930053;
			else if (7 == i_0_) {
				aShortArrayArray5407 = new short[10][4];
				aShortArrayArrayArray5408 = new short[10][4][];
				for (int i_2_ = 0; i_2_ < 10; i_2_++) {
					for (int i_3_ = 0; i_3_ < 4; i_3_++) {
						int i_4_ = class572_sub15.readUnsignedShort(647518597);
						if (65535 == i_4_)
							i_4_ = -1;
						aShortArrayArray5407[i_2_][i_3_] = (short) i_4_;
						int i_5_ = class572_sub15.readUnsignedShort(647518597);
						aShortArrayArrayArray5408[i_2_][i_3_] = new short[i_5_];
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
							int i_7_ = class572_sub15.readUnsignedShort(647518597);
							if (65535 == i_7_)
								i_7_ = -1;
							aShortArrayArrayArray5408[i_2_][i_3_][i_6_] = (short) i_7_;
						}
					}
				}
			} else if (i_0_ == 8)
				aBool5409 = false;
			else if (i_0_ == 9)
				anInt5406 = class572_sub15.readUnsignedByte(1756572392) * 654542649;
			else if (10 == i_0_)
				aBool5401 = false;
			else if (i_0_ == 11)
				anInt5412 = class572_sub15.readUnsignedByte(1169811090) * 615961897;
			else if (i_0_ == 12) {
				anInt5413 = class572_sub15.readUnsignedShort(647518597) * 1226940793;
				anInt5414 = class572_sub15.readUnsignedShort(647518597) * -1533831821;
			} else if (i_0_ == 13)
				anInt5397 = class572_sub15.readUnsignedByte(409178661) * 2000329719;
			else if (14 == i_0_)
				anInt5410 = class572_sub15.readUnsignedByte(1210188749) * -1867657059;
			else if (i_0_ == 15)
				anInt5399 = class572_sub15.readUnsignedByte(1547924640) * 1086232937;
			else if (i_0_ == 16)
				aBool5415 = true;
			else if (i_0_ == 17)
				anInt5416 = class572_sub15.readInt(45906839) * -135767879;
			else if (i_0_ == 18)
				anInt5417 = class572_sub15.readInt(-780413399) * -1858863071;
			else if (19 == i_0_)
				anInt5418 = class572_sub15.readInt(840753583) * 63759869;
			else if (i_0_ == 20) {
				aShort5411 = (short) class572_sub15.readUnsignedShort(647518597);
				aByte5405 = (byte) class572_sub15.readUnsignedByte(1305391693);
			} else if (21 == i_0_)
				anInt5398 = class572_sub15.readUnsignedByte(1336378780) * -431402063;
		}
		if (!bool) {
			if (anIntArray5392 == null) {
				anInt5390 = -462089548;
				anIntArray5392 = new int[4];
				anIntArray5393 = new int[4];
			}
			for (int i_8_ = 0; i_8_ < anIntArray5392.length; i_8_++) {
				anIntArray5392[i_8_] = 0;
				anIntArray5393[i_8_] = i_8_ * 20;
			}
		}
	}

	void method5759(RSByteBuffer class572_sub15) {
		boolean bool = false;
		for (;;) {
			int i = class572_sub15.readUnsignedByte(972292362);
			if (0 == i)
				break;
			if (1 == i) {
				if (null == anIntArray5392) {
					anInt5390 = -462089548;
					anIntArray5392 = new int[4];
					anIntArray5393 = new int[4];
				}
				for (int i_9_ = 0; i_9_ < anIntArray5392.length; i_9_++) {
					anIntArray5392[i_9_] = class572_sub15.readShort(-710976385);
					anIntArray5393[i_9_] = class572_sub15.readShort(-710976385);
				}
				bool = true;
			} else if (2 == i)
				anInt5400 = class572_sub15.readBigSmart((byte) 12) * 767066347;
			else if (3 == i) {
				anInt5390 = class572_sub15.readUnsignedByte(1641660958) * -115522387;
				anIntArray5392 = new int[anInt5390 * 1403567909];
				anIntArray5393 = new int[1403567909 * anInt5390];
			} else if (4 == i)
				aBool5395 = false;
			else if (5 == i)
				anInt5404 = class572_sub15.read24BitInt(1140925462) * -1209702995;
			else if (6 == i)
				anInt5403 = class572_sub15.read24BitInt(1140925462) * -1767930053;
			else if (7 == i) {
				aShortArrayArray5407 = new short[10][4];
				aShortArrayArrayArray5408 = new short[10][4][];
				for (int i_10_ = 0; i_10_ < 10; i_10_++) {
					for (int i_11_ = 0; i_11_ < 4; i_11_++) {
						int i_12_ = class572_sub15.readUnsignedShort(647518597);
						if (65535 == i_12_)
							i_12_ = -1;
						aShortArrayArray5407[i_10_][i_11_] = (short) i_12_;
						int i_13_ = class572_sub15.readUnsignedShort(647518597);
						aShortArrayArrayArray5408[i_10_][i_11_] = new short[i_13_];
						for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
							int i_15_ = class572_sub15.readUnsignedShort(647518597);
							if (65535 == i_15_)
								i_15_ = -1;
							aShortArrayArrayArray5408[i_10_][i_11_][i_14_] = (short) i_15_;
						}
					}
				}
			} else if (i == 8)
				aBool5409 = false;
			else if (i == 9)
				anInt5406 = class572_sub15.readUnsignedByte(2083784728) * 654542649;
			else if (10 == i)
				aBool5401 = false;
			else if (i == 11)
				anInt5412 = class572_sub15.readUnsignedByte(618882806) * 615961897;
			else if (i == 12) {
				anInt5413 = class572_sub15.readUnsignedShort(647518597) * 1226940793;
				anInt5414 = class572_sub15.readUnsignedShort(647518597) * -1533831821;
			} else if (i == 13)
				anInt5397 = class572_sub15.readUnsignedByte(2052403792) * 2000329719;
			else if (14 == i)
				anInt5410 = class572_sub15.readUnsignedByte(2008528509) * -1867657059;
			else if (i == 15)
				anInt5399 = class572_sub15.readUnsignedByte(1456765588) * 1086232937;
			else if (i == 16)
				aBool5415 = true;
			else if (i == 17)
				anInt5416 = class572_sub15.readInt(1211821400) * -135767879;
			else if (i == 18)
				anInt5417 = class572_sub15.readInt(377794182) * -1858863071;
			else if (19 == i)
				anInt5418 = class572_sub15.readInt(-103064863) * 63759869;
			else if (i == 20) {
				aShort5411 = (short) class572_sub15.readUnsignedShort(647518597);
				aByte5405 = (byte) class572_sub15.readUnsignedByte(1973828689);
			} else if (21 == i)
				anInt5398 = class572_sub15.readUnsignedByte(1464824349) * -431402063;
		}
		if (!bool) {
			if (anIntArray5392 == null) {
				anInt5390 = -462089548;
				anIntArray5392 = new int[4];
				anIntArray5393 = new int[4];
			}
			for (int i = 0; i < anIntArray5392.length; i++) {
				anIntArray5392[i] = 0;
				anIntArray5393[i] = i * 20;
			}
		}
	}

	static final void method5760(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (string.startsWith(Class520.method6215(0, 2009472133)) || string.startsWith(Class520.method6215(1, 2009472133)))
			string = string.substring(7);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class339.method4259(string, (byte) -108) ? 1 : 0;
	}

	static final void method5761(boolean bool, byte i) {
		Class572_Sub15_Sub2 class572_sub15_sub2 = ((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330;
		while (class572_sub15_sub2.method10396((-875297237 * (((Class195) client.aClass195_8589).anInt2333)), 1257391373) >= 15) {
			int i_16_ = class572_sub15_sub2.readBits(15, -1809904620);
			if (32767 == i_16_)
				break;
			boolean bool_17_ = false;
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_16_));
			if (null == class572_sub9) {
				NPC class456_sub1_sub2_sub3_sub1 = (new NPC(client.aClass613_8605.method7285(1363525436)));
				class456_sub1_sub2_sub3_sub1.anInt11633 = 2118180903 * i_16_;
				class572_sub9 = new LinkableObject(class456_sub1_sub2_sub3_sub1);
				client.aClass676_8622.put(class572_sub9, (long) i_16_);
				client.aClass572_Sub9Array8623[(client.anInt8624 += -123495603) * 617551237 - 1] = class572_sub9;
				bool_17_ = true;
			}
			NPC class456_sub1_sub2_sub3_sub1 = (NPC) class572_sub9.anObject9081;
			client.anIntArray8626[((client.anInt8625 += 1417012813) * 765313669 - 1)] = i_16_;
			class456_sub1_sub2_sub3_sub1.anInt11649 = client.anInt8629 * -875697841;
			if (class456_sub1_sub2_sub3_sub1.aClass410_11803 != null && class456_sub1_sub2_sub3_sub1.aClass410_11803.method4955((short) 229))
				Class259.method3561(class456_sub1_sub2_sub3_sub1, 537533828);
			int i_18_;
			if (bool) {
				i_18_ = class572_sub15_sub2.readBits(8, -1809904620);
				if (i_18_ > 127)
					i_18_ -= 256;
			} else {
				i_18_ = class572_sub15_sub2.readBits(5, -1809904620);
				if (i_18_ > 15)
					i_18_ -= 32;
			}
			int i_19_ = class572_sub15_sub2.readBits(2, -1809904620);
			int i_20_;
			if (bool) {
				i_20_ = class572_sub15_sub2.readBits(8, -1809904620);
				if (i_20_ > 127)
					i_20_ -= 256;
			} else {
				i_20_ = class572_sub15_sub2.readBits(5, -1809904620);
				if (i_20_ > 15)
					i_20_ -= 32;
			}
			int i_21_ = (class572_sub15_sub2.readBits(3, -1809904620) + 4 << 11 & 0x3fff);
			int i_22_ = class572_sub15_sub2.readBits(1, -1809904620);
			if (i_22_ == 1)
				client.anIntArray8628[(client.anInt8627 += -720093963) * 865439581 - 1] = i_16_;
			class456_sub1_sub2_sub3_sub1.method10680((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(class572_sub15_sub2.readBits(15, -1809904620), -525582173)), (byte) -86);
			int i_23_ = class572_sub15_sub2.readBits(1, -1809904620);
			class456_sub1_sub2_sub3_sub1.method10525((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792 * 358769667), (byte) 68);
			class456_sub1_sub2_sub3_sub1.anInt11653 = ((-1233753521 * class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4823) << 3) * -631722783;
			if (bool_17_)
				class456_sub1_sub2_sub3_sub1.method10516(i_21_, true, 648650492);
			class456_sub1_sub2_sub3_sub1.method10686(i_19_, i_18_ + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]), (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) + i_20_, i_23_ == 1, class456_sub1_sub2_sub3_sub1.method10556((short) -31197), -785457560);
			if (class456_sub1_sub2_sub3_sub1.aClass410_11803.method4955((short) 229))
				Class617.method7399(class456_sub1_sub2_sub3_sub1.aByte9009, (class456_sub1_sub2_sub3_sub1.screenX[0]), (class456_sub1_sub2_sub3_sub1.screenY[0]), 0, null, class456_sub1_sub2_sub3_sub1, null, -2092001184);
			if (bool_17_)
				class456_sub1_sub2_sub3_sub1.method10678(2118480191);
		}
		class572_sub15_sub2.method10395(-746840004);
	}

	static final void method5762(Cs2Executor class441, int i) {
		int i_24_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_24_, (short) 10418);
		Class83 class83 = Class534.aClass83Array5975[i_24_ >> 16];
		Class202.method2994(class73, class83, class441, (byte) -76);
	}
}
