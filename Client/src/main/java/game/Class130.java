package game;

/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class130 {
	int[] anIntArray1526;
	int anInt1527;
	public int anInt1528;
	public boolean aBool1529 = false;
	NPC aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
	static final int anInt1531 = 25;
	Player aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
	static byte[][][] aByteArrayArrayArray1533;

	boolean method2264(int i) {
		if (-1099388557 * anInt1528 >= 0) {
			NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1099388557 * anInt1528, -1954580705));
			boolean bool = class410.method4951((byte) 0);
			if (null == ((Class130) this).anIntArray1526) {
				Class538 class538 = ((Class538) (Class197.aClass639_Sub11_2359.getDefinition(1071699547 * class410.anInt4805, -370769756)));
				((Class130) this).anIntArray1526 = class538.method6391(-2073043299);
			}
			int[] is = ((Class130) this).anIntArray1526;
			for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
				int i_1_ = is[i_0_];
				bool &= ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_1_, -756368992)).method2291(1573688057);
			}
			return bool;
		}
		return true;
	}

	boolean method2265() {
		if (-1099388557 * anInt1528 >= 0) {
			NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1099388557 * anInt1528, -132852339));
			boolean bool = class410.method4951((byte) 0);
			if (null == ((Class130) this).anIntArray1526) {
				Class538 class538 = ((Class538) (Class197.aClass639_Sub11_2359.getDefinition(1071699547 * class410.anInt4805, -346057830)));
				((Class130) this).anIntArray1526 = class538.method6391(-2124003225);
			}
			int[] is = ((Class130) this).anIntArray1526;
			for (int i = 0; i < is.length; i++) {
				int i_2_ = is[i];
				bool &= ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_2_, -2091186946)).method2291(341511121);
			}
			return bool;
		}
		return true;
	}

	void method2266(int i) {
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
		aBool1529 = false;
	}

	void method2267() {
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
		aBool1529 = false;
	}

	Class130(RSByteBuffer class572_sub15, int i) {
		((Class130) this).anInt1527 = i * -1558673581;
		int i_3_ = class572_sub15.readUnsignedByte(2077622582);
		switch (i_3_) {
			default:
				anInt1528 = -807969723;
				break;
			case 1:
				anInt1528 = -807969723;
				break;
			case 0:
				anInt1528 = class572_sub15.readBigSmart((byte) 55) * 807969723;
		}
		class572_sub15.readString(1295706626);
	}

	public Entity method2268(int i) {
		if (null != ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530)
			return ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530;
		return ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532;
	}

	void method2269(int i, int i_4_, int i_5_, int i_6_) {
		if (!aBool1529) {
			aBool1529 = true;
			if (-1099388557 * anInt1528 >= 0) {
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = (new NPC(client.aClass613_8605.method7285(1828545934), 25));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11633 = ((Class130) this).anInt1527 * -1776972451;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11649 = 1226228503 * client.cycles;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10680(((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1099388557 * anInt1528, 1733601098)), (byte) -111);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10525(358769667 * (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.aClass410_11803.anInt4792), (byte) -80);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11653 = (-631722783 * (-1233753521 * (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.aClass410_11803.anInt4823) << 3));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11646 = (((Class122.anInt1486 += 571007091) * -1163606853 - 1) * -2010033325);
			} else {
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = (new Player(client.aClass613_8605.method7285(1799924868), 25));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.decodePlayerAppearance(Class481.aClass572_Sub15_5361, (byte) 16);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11633 = ((Class130) this).anInt1527 * -1776972451;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11649 = 1226228503 * client.cycles;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11646 = (((Class122.anInt1486 += 571007091) * -1163606853 - 1) * -2010033325);
			}
		}
		if (-1099388557 * anInt1528 >= 0) {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i_5_, i, i_4_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -28607), -785457560);
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10516(i_6_, true, 648650492);
		} else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i_5_;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i, i_4_, (byte) 71);
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10516(i_6_, true, 648650492);
		}
	}

	void method2270() {
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
		aBool1529 = false;
	}

	void method2271() {
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
		aBool1529 = false;
	}

	void method2272(int i, int i_7_, int i_8_, int i_9_) {
		if (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 != null)
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i, i_7_, i_8_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -446), -785457560);
		else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i_7_, i_8_, (byte) 119);
		}
	}

	void method2273() {
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = null;
		((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = null;
		aBool1529 = false;
	}

	void method2274(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (!aBool1529) {
			aBool1529 = true;
			if (-1099388557 * anInt1528 >= 0) {
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 = (new NPC(client.aClass613_8605.method7285(1590477454), 25));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11633 = ((Class130) this).anInt1527 * -1776972451;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11649 = 1226228503 * client.cycles;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10680(((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1099388557 * anInt1528, -825091617)), (byte) -51);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10525(358769667 * (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.aClass410_11803.anInt4792), (byte) -109);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11653 = (-631722783 * (-1233753521 * (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.aClass410_11803.anInt4823) << 3));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.anInt11646 = (((Class122.anInt1486 += 571007091) * -1163606853 - 1) * -2010033325);
			} else {
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532 = (new Player(client.aClass613_8605.method7285(1201436394), 25));
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.decodePlayerAppearance(Class481.aClass572_Sub15_5361, (byte) 16);
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11633 = ((Class130) this).anInt1527 * -1776972451;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11649 = 1226228503 * client.cycles;
				((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.anInt11646 = (((Class122.anInt1486 += 571007091) * -1163606853 - 1) * -2010033325);
			}
		}
		if (-1099388557 * anInt1528 >= 0) {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i_11_, i, i_10_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -14619), -785457560);
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10516(i_12_, true, 648650492);
		} else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i_11_;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i, i_10_, (byte) 96);
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10516(i_12_, true, 648650492);
		}
	}

	void method2275(int i, int i_14_, int i_15_) {
		if (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 != null)
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i, i_14_, i_15_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -21314), -785457560);
		else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i_14_, i_15_, (byte) 125);
		}
	}

	void method2276(int i, int i_16_, int i_17_) {
		if (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 != null)
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i, i_16_, i_17_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -12872), -785457560);
		else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i_16_, i_17_, (byte) 89);
		}
	}

	void method2277(int i, int i_18_, int i_19_) {
		if (((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530 != null)
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10686(i, i_18_, i_19_, true, ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub1_1530.method10556((short) -17871), -785457560);
		else {
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9009 = ((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.aByte9008 = (byte) i;
			((Class130) this).aClass456_Sub1_Sub2_Sub3_Sub2_1532.method10699(i_18_, i_19_, (byte) 115);
		}
	}

	static final void method2278(Cs2Executor class441, byte i) {
		int i_20_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_20_, (short) -10349);
		Class83 class83 = Class534.aClass83Array5975[i_20_ >> 16];
		Class12.method562(class73, class83, class441, (byte) -17);
	}

	static final void method2279(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_21_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_22_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		boolean bool_23_ = ((((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) == 1);
		Class639.method7587(i_21_, bool, i_22_, bool_23_, -962538552);
	}

	public static void method2280(String string, int i, int i_24_) {
		if (null == Class633.aClass641_8196)
			Class633.aClass641_8196 = new RSSocket(true);
		Class633.aClass641_8196.address = string;
		Class633.aClass641_8196.id = (i + 1099) * -1002799573;
		Class633.aClass641_8196.port = Class633.aClass641_8196.id * -984285601 + -1352120000;
		Class633.aClass641_8196.securePort = 2123758304 + -172050845 * Class633.aClass641_8196.id;
		Class633.aClass641_8196.aBool8289 = true;
	}

	public static void method2281(int i, int i_25_, int i_26_, int i_27_) {
		Class497 class497 = client.aClass613_8605.method7280((byte) -104);
		int i_28_ = i_25_ + class497.localX * -2109597897;
		int i_29_ = 417324155 * class497.localY + i_26_;
		if (client.aClass613_8605.method7285(1392187729) != null && (client.aClass613_8605.method7327(58721466) != Class569.aClass569_6394) && i_25_ >= 0 && i_26_ >= 0 && i_25_ < client.aClass613_8605.method7347(1616063245) && i_26_ < client.aClass613_8605.method7278(277214477)) {
			long l = (long) (i << 28 | i_29_ << 14 | i_28_);
			Class572_Sub42 class572_sub42 = (Class572_Sub42) client.aClass676_8749.get(l);
			if (class572_sub42 == null)
				client.aClass613_8605.method7285(1845574834).method6282(i, i_25_, i_26_, (byte) 2);
			else {
				Class572_Sub40 class572_sub40 = ((Class572_Sub40) class572_sub42.aClass675_9435.method7932((byte) 50));
				if (class572_sub40 == null)
					client.aClass613_8605.method7285(2013081112).method6282(i, i_25_, i_26_, (byte) 2);
				else {
					int i_30_ = -1;
					int i_31_ = -1;
					int i_32_ = -1;
					Class261 class261 = null;
					Class261 class261_33_ = null;
					Class261 class261_34_ = null;
					Class456_Sub1_Sub5_Sub1 class456_sub1_sub5_sub1 = ((Class456_Sub1_Sub5_Sub1) client.aClass613_8605.method7285(1633847794).method6282(i, i_25_, i_26_, (byte) 2));
					if (null == class456_sub1_sub5_sub1)
						class456_sub1_sub5_sub1 = (new Class456_Sub1_Sub5_Sub1(client.aClass613_8605.method7285(1690856245), i_25_ << 265, client.aClass613_8605.method7285(1421570035).aClass174Array5875[i].method2713(i_25_, i_26_, -1497957054), i_26_ << 265, i, i));
					else {
						i_30_ = -1239711419 * class456_sub1_sub5_sub1.anInt11712;
						i_31_ = -1730788149 * class456_sub1_sub5_sub1.anInt11704;
						i_32_ = class456_sub1_sub5_sub1.anInt11706 * -325747261;
						class261 = class456_sub1_sub5_sub1.aClass261_11702;
						class261_33_ = class456_sub1_sub5_sub1.aClass261_11707;
						class261_34_ = class456_sub1_sub5_sub1.aClass261_11710;
						Class456_Sub1_Sub5_Sub1 class456_sub1_sub5_sub1_35_ = class456_sub1_sub5_sub1;
						class456_sub1_sub5_sub1.anInt11706 = -893737707;
						class456_sub1_sub5_sub1_35_.anInt11704 = -786628835;
						class456_sub1_sub5_sub1.aClass523_9010 = client.aClass613_8605.method7285(1279266324);
					}
					class456_sub1_sub5_sub1.anInt11712 = -1802611867 * class572_sub40.anInt9401;
					class456_sub1_sub5_sub1.anInt11703 = (((Class572_Sub40) class572_sub40).anInt9400 * 995395263);
					while_76_: do {
						Class572_Sub40 class572_sub40_36_;
						do {
							class572_sub40_36_ = (Class572_Sub40) class572_sub42.aClass675_9435.method7926(875975171);
							if (class572_sub40_36_ == null)
								break while_76_;
						} while ((class456_sub1_sub5_sub1.anInt11712 * -1239711419) == 1544118073 * class572_sub40_36_.anInt9401);
						class456_sub1_sub5_sub1.anInt11704 = 1239052171 * class572_sub40_36_.anInt9401;
						class456_sub1_sub5_sub1.anInt11705 = -987277259 * ((Class572_Sub40) class572_sub40_36_).anInt9400;
						for (;;) {
							Class572_Sub40 class572_sub40_37_ = ((Class572_Sub40) class572_sub42.aClass675_9435.method7926(355114913));
							if (class572_sub40_37_ == null)
								break;
							if (((class456_sub1_sub5_sub1.anInt11712 * -1239711419) != class572_sub40_37_.anInt9401 * 1544118073) && ((class456_sub1_sub5_sub1.anInt11704 * -1730788149) != (class572_sub40_37_.anInt9401 * 1544118073))) {
								class456_sub1_sub5_sub1.anInt11706 = (1064399699 * class572_sub40_37_.anInt9401);
								class456_sub1_sub5_sub1.anInt11708 = (1774134659 * (((Class572_Sub40) class572_sub40_37_).anInt9400));
							}
						}
					} while (false);
					int i_38_ = Class314.method4072(256 + (i_25_ << 9), (i_26_ << 9) + 256, i, -2106890386);
					class456_sub1_sub5_sub1.method5395((float) (i_25_ << 265), (float) i_38_, (float) (i_26_ << 265));
					if (-1239711419 * class456_sub1_sub5_sub1.anInt11712 != i_30_) {
						if (class456_sub1_sub5_sub1.anInt11712 * -1239711419 == i_31_)
							class456_sub1_sub5_sub1.aClass261_11702 = class261_33_;
						else if ((class456_sub1_sub5_sub1.anInt11712 * -1239711419) == i_32_)
							class456_sub1_sub5_sub1.aClass261_11702 = class261_34_;
						else if (((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((class456_sub1_sub5_sub1.anInt11712 * -1239711419), -780750416))).aBool8192)
							class456_sub1_sub5_sub1.aClass261_11702 = Class593.method7022(361611615);
						else
							class456_sub1_sub5_sub1.aClass261_11702 = null;
					}
					if (-1 == class456_sub1_sub5_sub1.anInt11704 * -1730788149)
						class456_sub1_sub5_sub1.aClass261_11707 = null;
					else if (class456_sub1_sub5_sub1.anInt11704 * -1730788149 != i_31_) {
						if (class456_sub1_sub5_sub1.anInt11704 * -1730788149 == i_30_)
							class456_sub1_sub5_sub1.aClass261_11707 = class261;
						else if ((class456_sub1_sub5_sub1.anInt11704 * -1730788149) == i_32_)
							class456_sub1_sub5_sub1.aClass261_11707 = class261_34_;
						else if (((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((class456_sub1_sub5_sub1.anInt11704 * -1730788149), -1281874537))).aBool8192)
							class456_sub1_sub5_sub1.aClass261_11707 = Class593.method7022(880469377);
						else
							class456_sub1_sub5_sub1.aClass261_11707 = null;
					}
					if (-325747261 * class456_sub1_sub5_sub1.anInt11706 == -1)
						class456_sub1_sub5_sub1.aClass261_11710 = null;
					else if (i_32_ != (-325747261 * class456_sub1_sub5_sub1.anInt11706)) {
						if (-325747261 * class456_sub1_sub5_sub1.anInt11706 == i_30_)
							class456_sub1_sub5_sub1.aClass261_11710 = class261;
						else if (i_31_ == -325747261 * (class456_sub1_sub5_sub1.anInt11706))
							class456_sub1_sub5_sub1.aClass261_11710 = class261_33_;
						else if (((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((-325747261 * class456_sub1_sub5_sub1.anInt11706), -293428693))).aBool8192)
							class456_sub1_sub5_sub1.aClass261_11710 = Class593.method7022(-973671613);
						else
							class456_sub1_sub5_sub1.aClass261_11710 = null;
					}
					class456_sub1_sub5_sub1.anInt11709 = 0;
					class456_sub1_sub5_sub1.aByte9009 = (byte) i;
					class456_sub1_sub5_sub1.aByte9008 = (byte) i;
					if (client.aClass613_8605.method7287((byte) 73).method3689(i_25_, i_26_, -2141001603))
						class456_sub1_sub5_sub1.aByte9008++;
					client.aClass613_8605.method7285(1141655392).method6238(i, i_25_, i_26_, i_38_, class456_sub1_sub5_sub1, (short) 877);
				}
			}
		}
	}

	static void method2282(Class106 class106, byte i) {
		if ((357782167 * Class25.anInt172 >= 2 || client.aBool8754) && null == client.aClass73_8770) {
			String string;
			if (client.aBool8754 && Class25.anInt172 * 357782167 < 2)
				string = new StringBuilder().append(client.aString8757).append(Class279.aClass279_3090.method3758(Class594.aClass435_7823, 16711935)).append(client.aString8732).append(" ").append(Class3.aString26).toString();
			else if (Class572_Sub30.method8665((short) 733) && 357782167 * Class25.anInt172 > 2)
				string = Class406.method4920((Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311), -681645146);
			else {
				Class572_Sub12_Sub10 class572_sub12_sub10 = Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311;
				if (class572_sub12_sub10 == null)
					return;
				string = Class406.method4920(class572_sub12_sub10, -1083019243);
				int[] is = Class298.method3975(class572_sub12_sub10, -1734282837);
				if (null != is)
					string = new StringBuilder().append(string).append(Class191.method2895(is, 75412559)).toString();
			}
			if (357782167 * Class25.anInt172 > 2)
				string = new StringBuilder().append(string).append(GraphicsDefinition.method7770(16777215, (byte) -86)).append(" / ").append(Class25.anInt172 * 357782167 - 2).append(Class279.aClass279_3082.method3758(Class594.aClass435_7823, 16711935)).toString();
			if (null != Class25.aClass73_181) {
				Class102 class102 = Class25.aClass73_181.method1092((Class133_Sub20.aClass324_10261), (client.anInterface19_8776), (byte) 16);
				if (null == class102)
					class102 = Class1.aClass102_16;
				class102.method1616(string, -403567843 * Class25.anInt187, Class25.anInt183 * 1460500409, Class25.aClass73_181.anInt764 * 669238293, 1360982075 * Class25.aClass73_181.anInt765, (-1311491911 * Class25.aClass73_181.anInt918), Class25.aClass73_181.anInt787 * 1572041513, 843263117 * Class25.aClass73_181.anInt891, Class25.aClass73_181.anInt832 * 881082513, client.aRandom8673, Class439.anInt5093, client.anIntArray8642, Class44.aClass161Array443, Class103.anIntArray1384, (byte) 29);
				VarBitDefinition.method5229(client.anIntArray8642[0], client.anIntArray8642[1], client.anIntArray8642[2], client.anIntArray8642[3], -1738978456);
			}
		}
	}
}
