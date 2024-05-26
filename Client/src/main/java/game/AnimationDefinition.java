package game;

/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationDefinition implements Interface17 {
	public int[] anIntArray1541;
	int anInt1542;
	public int anInt1543;
	public int[] anIntArray1544;
	public int[] anIntArray1545;
	public int[] anIntArray1546;
	public static boolean aBool1547 = false;
	public Class91 aClass91_1548;
	public int anInt1549;
	public int[][] anIntArrayArray1550;
	public int anInt1551;
	public int priority;
	public int anInt1553;
	public int anInt1554;
	public int anInt1555;
	public int anInt1556;
	public int[] anIntArray1557;
	public int anInt1558;
	Class92 aClass92_1559;
	public boolean aBool1560;
	public int anInt1561;
	public int[] anIntArray1562;
	public boolean aBool1563;
	Class676 aClass676_1564;
	public int anInt1565 = 0;

	public boolean method2289() {
		if (null == anIntArray1544)
			return true;
		boolean bool = true;
		int[] is = anIntArray1544;
		for (int i = 0; i < is.length; i++) {
			int i_0_ = is[i];
			if (aClass92_1559.method1522(i_0_ >>> 16, -1457820512) == null)
				bool = false;
		}
		return bool;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_1_ = class572_sub15.readUnsignedByte(1981776937);
			if (0 == i_1_)
				break;
			method2290(class572_sub15, i_1_, (byte) 14);
		}
	}

	void method2290(RSByteBuffer class572_sub15, int i, byte i_2_) {
		if (i == 1) {
			int i_3_ = class572_sub15.readUnsignedShort(647518597);
			anIntArray1546 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray1546[i_4_] = class572_sub15.readUnsignedShort(647518597);
			anIntArray1544 = new int[i_3_];
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
				anIntArray1544[i_5_] = class572_sub15.readUnsignedShort(647518597);
			for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
				anIntArray1544[i_6_] = (class572_sub15.readUnsignedShort(647518597) << 16) + anIntArray1544[i_6_];
		} else if (i == 2)
			anInt1549 = class572_sub15.readUnsignedShort(647518597) * 371038549;
		else if (5 == i)
			priority = class572_sub15.readUnsignedByte(279026059) * -1755350377; // this one is priority
		else if (i == 6)
			anInt1553 = class572_sub15.readUnsignedShort(647518597) * -1033062413;
		else if (i == 7)
			anInt1554 = class572_sub15.readUnsignedShort(647518597) * -184219643;
		else if (8 == i)
			anInt1555 = class572_sub15.readUnsignedByte(1032874254) * -618684055;
		else if (9 == i)
			anInt1556 = class572_sub15.readUnsignedByte(1292441921) * 1874660579;
		else if (i == 10)
			anInt1561 = class572_sub15.readUnsignedByte(1599874554) * 1885827415;
		else if (11 == i)
			anInt1558 = class572_sub15.readUnsignedByte(1360637508) * -1822054635;
		else if (12 == i) {
			int i_7_ = class572_sub15.readUnsignedByte(1442775975);
			anIntArray1545 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				anIntArray1545[i_8_] = class572_sub15.readUnsignedShort(647518597);
			for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
				anIntArray1545[i_9_] = (class572_sub15.readUnsignedShort(647518597) << 16) + anIntArray1545[i_9_];
		} else if (13 == i) {
			int i_10_ = class572_sub15.readUnsignedShort(647518597);
			anIntArrayArray1550 = new int[i_10_][];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				int i_12_ = class572_sub15.readUnsignedByte(1918281950);
				if (i_12_ > 0) {
					anIntArrayArray1550[i_11_] = new int[i_12_];
					anIntArrayArray1550[i_11_][0] = class572_sub15.read24BitInt(1140925462);
					for (int i_13_ = 1; i_13_ < i_12_; i_13_++)
						anIntArrayArray1550[i_11_][i_13_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (i == 14)
			aBool1563 = true;
		else if (i == 15)
			aBool1560 = true;
		else if (16 != i && i != 18) {
			if (i == 19) {
				if (null == anIntArray1541) {
					anIntArray1541 = new int[anIntArrayArray1550.length];
					for (int i_14_ = 0; i_14_ < anIntArrayArray1550.length; i_14_++)
						anIntArray1541[i_14_] = 255;
				}
				anIntArray1541[class572_sub15.readUnsignedByte(1042739245)] = class572_sub15.readUnsignedByte(1670201480);
			} else if (20 == i) {
				if (anIntArray1562 == null || null == anIntArray1557) {
					anIntArray1562 = new int[anIntArrayArray1550.length];
					anIntArray1557 = new int[anIntArrayArray1550.length];
					for (int i_15_ = 0; i_15_ < anIntArrayArray1550.length; i_15_++) {
						anIntArray1562[i_15_] = 256;
						anIntArray1557[i_15_] = 256;
					}
				}
				int i_16_ = class572_sub15.readUnsignedByte(1367212483);
				anIntArray1562[i_16_] = class572_sub15.readUnsignedShort(647518597);
				anIntArray1557[i_16_] = class572_sub15.readUnsignedShort(647518597);
			} else if (22 == i)
				anInt1551 = class572_sub15.readUnsignedByte(90126815) * -1536499191;
			else if (23 == i)
				class572_sub15.readUnsignedShort(647518597);
			else if (24 == i) {
				//832 one
				anInt1542 = class572_sub15.readUnsignedShort(647518597) * 347463745;
				if (aClass92_1559 != null) {
					aClass91_1548 = ((Class91) (((Class92) aClass92_1559).anInterface18_1237.getDefinition(1899376577 * anInt1542, 1654588638)));
				}
			} else if (i == 249) {
				int i_17_ = class572_sub15.readUnsignedByte(1111186698);
				if (aClass676_1564 == null) {
					int i_18_ = HashTable.nextPowerOfTwo(i_17_, 821229053);
					aClass676_1564 = new Class676(i_18_);
				}
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					boolean bool = class572_sub15.readUnsignedByte(352111803) == 1;
					int i_20_ = class572_sub15.read24BitInt(1140925462);
					Class572 class572;
					if (bool)
						class572 = new LinkableObject(class572_sub15.readString(1295706626));
					else
						class572 = new LinkableInt(class572_sub15.readInt(-643871564));
					aClass676_1564.put(class572, (long) i_20_);
				}
			}
		}
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1342431305);
			if (0 == i)
				break;
			method2290(class572_sub15, i, (byte) 52);
		}
	}

	public boolean method2291(int i) {
		if (null == anIntArray1544)
			return true;
		boolean bool = true;
		int[] is = anIntArray1544;
		for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
			int i_22_ = is[i_21_];
			if (aClass92_1559.method1522(i_22_ >>> 16, -1415214655) == null)
				bool = false;
		}
		return bool;
	}

	public int method2292(int i, int i_23_, int i_24_) {
		if (null == aClass676_1564)
			return i_23_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_1564.get((long) i));
		if (class572_sub26 == null)
			return i_23_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	public String method2293(int i, String string, byte i_25_) {
		if (aClass676_1564 == null)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) aClass676_1564.get((long) i));
		if (null == class572_sub9)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(397572176);
			if (0 == i)
				break;
			method2290(class572_sub15, i, (byte) -61);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(12545211);
			if (0 == i)
				break;
			method2290(class572_sub15, i, (byte) 3);
		}
	}

	public void method104(byte i) {
		if (-1 == anInt1556 * 802199755) {
			if (aClass91_1548 != null && aClass91_1548.aBoolArray1235 != null)
				anInt1556 = -545646138;
			else
				anInt1556 = 0;
		}
		if (anInt1561 * 657197671 == -1) {
			if (null != aClass91_1548 && aClass91_1548.aBoolArray1235 != null)
				anInt1561 = -523312466;
			else
				anInt1561 = 0;
		}
		if (null != anIntArray1546) {
			anInt1565 = 0;
			for (int i_26_ = 0; i_26_ < anIntArray1546.length; i_26_++)
				anInt1565 += -1322406283 * anIntArray1546[i_26_];
		}
	}

	public void method103() {
		if (-1 == anInt1556 * 802199755) {
			if (aClass91_1548 != null && aClass91_1548.aBoolArray1235 != null)
				anInt1556 = -545646138;
			else
				anInt1556 = 0;
		}
		if (anInt1561 * 657197671 == -1) {
			if (null != aClass91_1548 && aClass91_1548.aBoolArray1235 != null)
				anInt1561 = -523312466;
			else
				anInt1561 = 0;
		}
		if (null != anIntArray1546) {
			anInt1565 = 0;
			for (int i = 0; i < anIntArray1546.length; i++)
				anInt1565 += -1322406283 * anIntArray1546[i];
		}
	}

	void method2294(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			int i_27_ = class572_sub15.readUnsignedShort(647518597);
			anIntArray1546 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray1546[i_28_] = class572_sub15.readUnsignedShort(647518597);
			anIntArray1544 = new int[i_27_];
			for (int i_29_ = 0; i_29_ < i_27_; i_29_++)
				anIntArray1544[i_29_] = class572_sub15.readUnsignedShort(647518597);
			for (int i_30_ = 0; i_30_ < i_27_; i_30_++)
				anIntArray1544[i_30_] = (class572_sub15.readUnsignedShort(647518597) << 16) + anIntArray1544[i_30_];
		} else if (i == 2)
			anInt1549 = class572_sub15.readUnsignedShort(647518597) * 371038549;
		else if (5 == i)
			priority = class572_sub15.readUnsignedByte(67975830) * -1755350377;
		else if (i == 6)
			anInt1553 = class572_sub15.readUnsignedShort(647518597) * -1033062413;
		else if (i == 7)
			anInt1554 = class572_sub15.readUnsignedShort(647518597) * -184219643;
		else if (8 == i)
			anInt1555 = class572_sub15.readUnsignedByte(205434467) * -618684055;
		else if (9 == i)
			anInt1556 = class572_sub15.readUnsignedByte(102302283) * 1874660579;
		else if (i == 10)
			anInt1561 = class572_sub15.readUnsignedByte(639390282) * 1885827415;
		else if (11 == i)
			anInt1558 = class572_sub15.readUnsignedByte(1021380090) * -1822054635;
		else if (12 == i) {
			int i_31_ = class572_sub15.readUnsignedByte(1401812359);
			anIntArray1545 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
				anIntArray1545[i_32_] = class572_sub15.readUnsignedShort(647518597);
			for (int i_33_ = 0; i_33_ < i_31_; i_33_++)
				anIntArray1545[i_33_] = (class572_sub15.readUnsignedShort(647518597) << 16) + anIntArray1545[i_33_];
		} else if (13 == i) {
			int i_34_ = class572_sub15.readUnsignedShort(647518597);
			anIntArrayArray1550 = new int[i_34_][];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				int i_36_ = class572_sub15.readUnsignedByte(1491881077);
				if (i_36_ > 0) {
					anIntArrayArray1550[i_35_] = new int[i_36_];
					anIntArrayArray1550[i_35_][0] = class572_sub15.read24BitInt(1140925462);
					for (int i_37_ = 1; i_37_ < i_36_; i_37_++)
						anIntArrayArray1550[i_35_][i_37_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (i == 14)
			aBool1563 = true;
		else if (i == 15)
			aBool1560 = true;
		else if (16 != i && i != 18) {
			if (i == 19) {
				if (null == anIntArray1541) {
					anIntArray1541 = new int[anIntArrayArray1550.length];
					for (int i_38_ = 0; i_38_ < anIntArrayArray1550.length; i_38_++)
						anIntArray1541[i_38_] = 255;
				}
				anIntArray1541[class572_sub15.readUnsignedByte(135605911)] = class572_sub15.readUnsignedByte(1824478524);
			} else if (20 == i) {
				if (anIntArray1562 == null || null == anIntArray1557) {
					anIntArray1562 = new int[anIntArrayArray1550.length];
					anIntArray1557 = new int[anIntArrayArray1550.length];
					for (int i_39_ = 0; i_39_ < anIntArrayArray1550.length; i_39_++) {
						anIntArray1562[i_39_] = 256;
						anIntArray1557[i_39_] = 256;
					}
				}
				int i_40_ = class572_sub15.readUnsignedByte(452561753);
				anIntArray1562[i_40_] = class572_sub15.readUnsignedShort(647518597);
				anIntArray1557[i_40_] = class572_sub15.readUnsignedShort(647518597);
			} else if (22 == i)
				anInt1551 = class572_sub15.readUnsignedByte(468649171) * -1536499191;
			else if (23 == i)
				class572_sub15.readUnsignedShort(647518597);
			else if (24 == i) {
				anInt1542 = class572_sub15.readUnsignedShort(647518597) * 347463745;
				if (aClass92_1559 != null)
					aClass91_1548 = (Class91) aClass92_1559.anInterface18_1237.getDefinition(1899376577 * anInt1542, 997827058);
			} else if (i == 249) {
				int i_41_ = class572_sub15.readUnsignedByte(1130539273);
				if (aClass676_1564 == null) {
					int i_42_ = HashTable.nextPowerOfTwo(i_41_, 293822912);
					aClass676_1564 = new Class676(i_42_);
				}
				for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
					boolean bool = class572_sub15.readUnsignedByte(-7872962) == 1;
					int i_44_ = class572_sub15.read24BitInt(1140925462);
					Class572 class572;
					if (bool)
						class572 = new LinkableObject(class572_sub15.readString(1295706626));
					else
						class572 = new LinkableInt(class572_sub15.readInt(-474949393));
					aClass676_1564.put(class572, (long) i_44_);
				}
			}
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2086008914);
			if (0 == i)
				break;
			method2290(class572_sub15, i, (byte) -79);
		}
	}

	public void method112() {
		if (-1 == anInt1556 * 802199755) {
			if (aClass91_1548 != null && aClass91_1548.aBoolArray1235 != null)
				anInt1556 = -545646138;
			else
				anInt1556 = 0;
		}
		if (anInt1561 * 657197671 == -1) {
			if (null != aClass91_1548 && aClass91_1548.aBoolArray1235 != null)
				anInt1561 = -523312466;
			else
				anInt1561 = 0;
		}
		if (null != anIntArray1546) {
			anInt1565 = 0;
			for (int i = 0; i < anIntArray1546.length; i++)
				anInt1565 += -1322406283 * anIntArray1546[i];
		}
	}

	public void method106() {
		if (-1 == anInt1556 * 802199755) {
			if (aClass91_1548 != null && aClass91_1548.aBoolArray1235 != null)
				anInt1556 = -545646138;
			else
				anInt1556 = 0;
		}
		if (anInt1561 * 657197671 == -1) {
			if (null != aClass91_1548 && aClass91_1548.aBoolArray1235 != null)
				anInt1561 = -523312466;
			else
				anInt1561 = 0;
		}
		if (null != anIntArray1546) {
			anInt1565 = 0;
			for (int i = 0; i < anIntArray1546.length; i++)
				anInt1565 += -1322406283 * anIntArray1546[i];
		}
	}

	public int method2295(int i, int i_45_) {
		if (null == aClass676_1564)
			return i_45_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_1564.get((long) i));
		if (class572_sub26 == null)
			return i_45_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	public void method110() {
		if (-1 == anInt1556 * 802199755) {
			if (aClass91_1548 != null && aClass91_1548.aBoolArray1235 != null)
				anInt1556 = -545646138;
			else
				anInt1556 = 0;
		}
		if (anInt1561 * 657197671 == -1) {
			if (null != aClass91_1548 && aClass91_1548.aBoolArray1235 != null)
				anInt1561 = -523312466;
			else
				anInt1561 = 0;
		}
		if (null != anIntArray1546) {
			anInt1565 = 0;
			for (int i = 0; i < anIntArray1546.length; i++)
				anInt1565 += -1322406283 * anIntArray1546[i];
		}
	}

	public boolean method2296() {
		if (null == anIntArray1544)
			return true;
		boolean bool = true;
		int[] is = anIntArray1544;
		for (int i = 0; i < is.length; i++) {
			int i_46_ = is[i];
			if (aClass92_1559.method1522(i_46_ >>> 16, -556074579) == null)
				bool = false;
		}
		return bool;
	}

	public int method2297(int i, int i_47_) {
		if (null == aClass676_1564)
			return i_47_;
		LinkableInt class572_sub26 = ((LinkableInt) aClass676_1564.get((long) i));
		if (class572_sub26 == null)
			return i_47_;
		return class572_sub26.anInt9258 * -1945426987;
	}

	AnimationDefinition(int i, Class92 class92) {
		anInt1542 = -347463745;
		anInt1549 = -371038549;
		priority = -186817293;
		anInt1553 = 1033062413;
		anInt1554 = 184219643;
		anInt1555 = -1120179301;
		anInt1556 = -1874660579;
		anInt1561 = -1885827415;
		anInt1558 = 650858026;
		aBool1563 = false;
		aBool1560 = false;
		anInt1551 = 1536499191;
		anInt1543 = i * 740487611;
		aClass92_1559 = class92;
	}

	static final void method2298(Cs2Executor class441, int i) {
		int i_48_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_48_, (short) -29069);
		Class83 class83 = Class534.aClass83Array5975[i_48_ >> 16];
		Class665_Sub5.method8155(class73, class83, class441, Class68.aClass68_699, -1274866119);
	}

	static final void method2299(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class12.method562(class73, class83, class441, (byte) -25);
	}

	static final void method2300(Cs2Executor class441, int i) {
		int i_49_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_49_, (short) -21433);
		Class83 class83 = Class534.aClass83Array5975[i_49_ >> 16];
		Class6.method498(class73, class83, class441, 1129313460);
	}

	static final void method2301(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_50_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_51_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_52_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class385.method4663(5, i_50_ << 16 | i_51_, i_52_, "", (byte) -45);
	}
}
