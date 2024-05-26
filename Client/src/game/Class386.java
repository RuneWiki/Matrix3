package game;

/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class386 implements Interface17 {
	int[][] anIntArrayArray4617;
	public String aString4618;
	public String aString4619;
	public int[] anIntArray4620;
	public int anInt4621;
	public int anInt4622 = 0;
	public int anInt4623 = 0;
	public boolean aBool4624 = false;
	public int anInt4625;
	public int[][] anIntArrayArray4626;
	public int[] anIntArray4627;
	Class676 aClass676_4628;
	public int anInt4629;
	int[] anIntArray4630;
	int[] anIntArray4631;
	int[] anIntArray4632;
	public String[] aStringArray4633;
	public int[] anIntArray4634;
	int[][] anIntArrayArray4635;
	int[] anIntArray4636;
	int[] anIntArray4637;
	public String[] aStringArray4638;
	Interface18 anInterface18_4639;
	static int[] anIntArray4640;
	public static Class669 aClass669_4641;
	public static int anInt4642;

	public boolean method4665(Interface13 interface13, int i, int i_0_) {
		if (anIntArray4620 == null || i < 0 || i >= anIntArray4620.length)
			return false;
		VarDefinition class179 = ((Interface15) interface13).method94(VarDomainType.PLAYER_CONFIGS, anIntArray4620[i], (byte) 29);
		int i_1_ = interface13.method73(class179, -1335594890);
		if (i_1_ < ((Class386) this).anIntArray4630[i] || i_1_ > ((Class386) this).anIntArray4632[i])
			return false;
		return true;
	}

	public void method106() {
		if (aString4619 == null)
			aString4619 = aString4618;
	}

	public boolean method4666(Interface13 interface13, int i) {
		if (((Class386) this).anIntArrayArray4617 != null) {
			for (int i_2_ = 0; i_2_ < ((Class386) this).anIntArrayArray4617.length; i_2_++) {
				VarDefinition class179 = (((Interface15) interface13).method94(VarDomainType.PLAYER_CONFIGS, ((Class386) this).anIntArrayArray4617[i_2_][0], (byte) 35));
				if (interface13.method73(class179, -1996180798) >= ((Class386) this).anIntArrayArray4617[i_2_][1])
					return true;
			}
		}
		if (((Class386) this).anIntArrayArray4635 != null) {
			for (int i_3_ = 0; i_3_ < ((Class386) this).anIntArrayArray4635.length; i_3_++) {
				VarBitDefinition class429 = (((Interface15) interface13).method95(((Class386) this).anIntArrayArray4635[i_3_][0], 819446449));
				if (interface13.method72(class429, -1544248109) >= ((Class386) this).anIntArrayArray4635[i_3_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method4667(Interface13 interface13, byte i) {
		if (((Class386) this).anIntArrayArray4617 != null) {
			for (int i_4_ = 0; i_4_ < ((Class386) this).anIntArrayArray4617.length; i_4_++) {
				VarDefinition class179 = (((Interface15) interface13).method94(VarDomainType.PLAYER_CONFIGS, ((Class386) this).anIntArrayArray4617[i_4_][0], (byte) 120));
				if (interface13.method73(class179, -1666975959) >= ((Class386) this).anIntArrayArray4617[i_4_][2])
					return true;
			}
		}
		if (null != ((Class386) this).anIntArrayArray4635) {
			for (int i_5_ = 0; i_5_ < ((Class386) this).anIntArrayArray4635.length; i_5_++) {
				VarBitDefinition class429 = (((Interface15) interface13).method95(((Class386) this).anIntArrayArray4635[i_5_][0], 819446449));
				if (interface13.method72(class429, -1137646594) >= ((Class386) this).anIntArrayArray4635[i_5_][2])
					return true;
			}
		}
		return false;
	}

	public boolean method4668(Interface13 interface13, int i) {
		if (Class492.method5872(interface13, ((Class386) this).anInterface18_4639, (byte) 1) < anInt4629 * -1776717747)
			return false;
		if (anIntArrayArray4626 != null) {
			for (int i_6_ = 0; i_6_ < anIntArrayArray4626.length; i_6_++) {
				if (((Interface54) interface13).method311(anIntArrayArray4626[i_6_][0], 281592615) < anIntArrayArray4626[i_6_][1])
					return false;
			}
		}
		if (anIntArray4627 != null) {
			for (int i_7_ = 0; i_7_ < anIntArray4627.length; i_7_++) {
				if (!((Class386) ((Class386) this).anInterface18_4639.getDefinition(anIntArray4627[i_7_], -1769757586)).method4667(interface13, (byte) 29))
					return false;
			}
		}
		if (null != anIntArray4620) {
			for (int i_8_ = 0; i_8_ < anIntArray4620.length; i_8_++) {
				VarDefinition class179 = ((Interface15) interface13).method94((VarDomainType.PLAYER_CONFIGS), (anIntArray4620[i_8_]), (byte) 56);
				int i_9_ = interface13.method73(class179, -1548945434);
				if (i_9_ < ((Class386) this).anIntArray4630[i_8_] || i_9_ > ((Class386) this).anIntArray4632[i_8_])
					return false;
			}
		}
		if (anIntArray4634 != null) {
			for (int i_10_ = 0; i_10_ < anIntArray4634.length; i_10_++) {
				VarBitDefinition class429 = ((Interface15) interface13).method95(anIntArray4634[i_10_], 819446449);
				int i_11_ = interface13.method72(class429, -1876661288);
				if (i_11_ < ((Class386) this).anIntArray4631[i_10_] || i_11_ > ((Class386) this).anIntArray4636[i_10_])
					return false;
			}
		}
		return true;
	}

	public boolean method4669(Interface13 interface13, int i) {
		if (Class492.method5872(interface13, ((Class386) this).anInterface18_4639, (byte) 1) < anInt4629 * -1776717747)
			return false;
		return true;
	}

	public boolean method4670(Interface13 interface13, int i, int i_12_) {
		if (null == anIntArrayArray4626 || i < 0 || i >= anIntArrayArray4626.length)
			return false;
		if (((Interface54) interface13).method311(anIntArrayArray4626[i][0], 281592615) < anIntArrayArray4626[i][1])
			return false;
		return true;
	}

	public boolean method4671(Interface13 interface13, int i, int i_13_) {
		if (null == anIntArray4627 || i < 0 || i >= anIntArray4627.length)
			return false;
		if (!((Class386) ((Class386) this).anInterface18_4639.getDefinition(anIntArray4627[i], 612214935)).method4667(interface13, (byte) 16))
			return false;
		return true;
	}

	public boolean method4672(Interface13 interface13, int i, byte i_14_) {
		if (anIntArray4634 == null || i < 0 || i >= anIntArray4634.length)
			return false;
		VarBitDefinition class429 = ((Interface15) interface13).method95(anIntArray4634[i], 819446449);
		int i_15_ = interface13.method72(class429, -156170800);
		if (i_15_ < ((Class386) this).anIntArray4631[i] || i_15_ > ((Class386) this).anIntArray4636[i])
			return false;
		return true;
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2104122074);
			if (i == 0)
				break;
			method4677(class572_sub15, i, (byte) -34);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(353310692);
			if (i == 0)
				break;
			method4677(class572_sub15, i, (byte) 20);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2102926720);
			if (i == 0)
				break;
			method4677(class572_sub15, i, (byte) 103);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1952758327);
			if (i == 0)
				break;
			method4677(class572_sub15, i, (byte) -38);
		}
	}

	public int method4673(int i, int i_16_, int i_17_) {
		if (((Class386) this).aClass676_4628 == null)
			return i_16_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class386) this).aClass676_4628.get((long) i));
		if (class572_sub26 == null)
			return i_16_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public void method104(byte i) {
		if (aString4619 == null)
			aString4619 = aString4618;
	}

	public void method112() {
		if (aString4619 == null)
			aString4619 = aString4618;
	}

	void method4674(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			aString4618 = class572_sub15.readVersionedString(-839513311);
		else if (i == 2)
			aString4619 = class572_sub15.readVersionedString(-1872799029);
		else if (3 == i) {
			int i_18_ = class572_sub15.readUnsignedByte(2144324644);
			((Class386) this).anIntArrayArray4617 = new int[i_18_][3];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				((Class386) this).anIntArrayArray4617[i_19_][0] = class572_sub15.readUnsignedShort(647518597);
				((Class386) this).anIntArrayArray4617[i_19_][1] = class572_sub15.readInt(139991495);
				((Class386) this).anIntArrayArray4617[i_19_][2] = class572_sub15.readInt(-985241579);
			}
		} else if (4 == i) {
			int i_20_ = class572_sub15.readUnsignedByte(791827911);
			((Class386) this).anIntArrayArray4635 = new int[i_20_][3];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				((Class386) this).anIntArrayArray4635[i_21_][0] = class572_sub15.readUnsignedShort(647518597);
				((Class386) this).anIntArrayArray4635[i_21_][1] = class572_sub15.readInt(-882533292);
				((Class386) this).anIntArrayArray4635[i_21_][2] = class572_sub15.readInt(1767165652);
			}
		} else if (5 == i)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 6)
			anInt4622 = class572_sub15.readUnsignedByte(1177651286) * -1492788447;
		else if (i == 7)
			anInt4623 = class572_sub15.readUnsignedByte(269811376) * -268599581;
		else if (8 == i)
			aBool4624 = true;
		else if (9 == i)
			anInt4625 = class572_sub15.readUnsignedByte(785547116) * -85515001;
		else if (10 == i) {
			int i_22_ = class572_sub15.readUnsignedByte(297563323);
			((Class386) this).anIntArray4637 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
				((Class386) this).anIntArray4637[i_23_] = class572_sub15.readInt(1245716531);
		} else if (12 == i)
			class572_sub15.readInt(-693941316);
		else if (13 == i) {
			int i_24_ = class572_sub15.readUnsignedByte(1765023818);
			anIntArray4627 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				anIntArray4627[i_25_] = class572_sub15.readUnsignedShort(647518597);
		} else if (14 == i) {
			int i_26_ = class572_sub15.readUnsignedByte(2337822);
			anIntArrayArray4626 = new int[i_26_][2];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				anIntArrayArray4626[i_27_][0] = class572_sub15.readUnsignedByte(1663024153);
				anIntArrayArray4626[i_27_][1] = class572_sub15.readUnsignedByte(1572498296);
			}
		} else if (15 == i)
			anInt4629 = class572_sub15.readUnsignedShort(647518597) * 1132415109;
		else if (i == 17)
			anInt4621 = class572_sub15.readBigSmart((byte) 95) * 1431921881;
		else if (i == 18) {
			int i_28_ = class572_sub15.readUnsignedByte(804172547);
			anIntArray4620 = new int[i_28_];
			((Class386) this).anIntArray4630 = new int[i_28_];
			((Class386) this).anIntArray4632 = new int[i_28_];
			aStringArray4633 = new String[i_28_];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				anIntArray4620[i_29_] = class572_sub15.readInt(509467821);
				((Class386) this).anIntArray4630[i_29_] = class572_sub15.readInt(-257593354);
				((Class386) this).anIntArray4632[i_29_] = class572_sub15.readInt(-83008269);
				aStringArray4633[i_29_] = class572_sub15.readString(1295706626);
			}
		} else if (19 == i) {
			int i_30_ = class572_sub15.readUnsignedByte(1612072906);
			anIntArray4634 = new int[i_30_];
			((Class386) this).anIntArray4631 = new int[i_30_];
			((Class386) this).anIntArray4636 = new int[i_30_];
			aStringArray4638 = new String[i_30_];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				anIntArray4634[i_31_] = class572_sub15.readInt(1737601962);
				((Class386) this).anIntArray4631[i_31_] = class572_sub15.readInt(460798661);
				((Class386) this).anIntArray4636[i_31_] = class572_sub15.readInt(2026646629);
				aStringArray4638[i_31_] = class572_sub15.readString(1295706626);
			}
		} else if (249 == i) {
			int i_32_ = class572_sub15.readUnsignedByte(1360691224);
			if (null == ((Class386) this).aClass676_4628) {
				int i_33_ = HashTable.nextPowerOfTwo(i_32_, 1082993336);
				((Class386) this).aClass676_4628 = new Class676(i_33_);
			}
			for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
				boolean bool = class572_sub15.readUnsignedByte(1633157967) == 1;
				int i_35_ = class572_sub15.read24BitInt(1140925462);
				Class572 class572;
				if (bool)
					class572 = new LinkableObject(class572_sub15.readString(1295706626));
				else
					class572 = new LinkableInt(class572_sub15.readInt(2101419962));
				((Class386) this).aClass676_4628.put(class572, (long) i_35_);
			}
		}
	}

	public int method4675(int i, int i_36_) {
		if (((Class386) this).aClass676_4628 == null)
			return i_36_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class386) this).aClass676_4628.get((long) i));
		if (class572_sub26 == null)
			return i_36_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public int method4676(int i, int i_37_) {
		if (((Class386) this).aClass676_4628 == null)
			return i_37_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class386) this).aClass676_4628.get((long) i));
		if (class572_sub26 == null)
			return i_37_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	void method4677(RSByteBuffer class572_sub15, int i, byte i_38_) {
		if (i == 1)
			aString4618 = class572_sub15.readVersionedString(-2092985732);
		else if (i == 2)
			aString4619 = class572_sub15.readVersionedString(-765173138);
		else if (3 == i) {
			int i_39_ = class572_sub15.readUnsignedByte(827714570);
			((Class386) this).anIntArrayArray4617 = new int[i_39_][3];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				((Class386) this).anIntArrayArray4617[i_40_][0] = class572_sub15.readUnsignedShort(647518597);
				((Class386) this).anIntArrayArray4617[i_40_][1] = class572_sub15.readInt(1316043651);
				((Class386) this).anIntArrayArray4617[i_40_][2] = class572_sub15.readInt(1404468517);
			}
		} else if (4 == i) {
			int i_41_ = class572_sub15.readUnsignedByte(1002523662);
			((Class386) this).anIntArrayArray4635 = new int[i_41_][3];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				((Class386) this).anIntArrayArray4635[i_42_][0] = class572_sub15.readUnsignedShort(647518597);
				((Class386) this).anIntArrayArray4635[i_42_][1] = class572_sub15.readInt(196422301);
				((Class386) this).anIntArrayArray4635[i_42_][2] = class572_sub15.readInt(-318057134);
			}
		} else if (5 == i)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 6)
			anInt4622 = class572_sub15.readUnsignedByte(-69592378) * -1492788447;
		else if (i == 7)
			anInt4623 = class572_sub15.readUnsignedByte(-87494095) * -268599581;
		else if (8 == i)
			aBool4624 = true;
		else if (9 == i)
			anInt4625 = class572_sub15.readUnsignedByte(1673898540) * -85515001;
		else if (10 == i) {
			int i_43_ = class572_sub15.readUnsignedByte(817483996);
			((Class386) this).anIntArray4637 = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				((Class386) this).anIntArray4637[i_44_] = class572_sub15.readInt(-535197486);
		} else if (12 == i)
			class572_sub15.readInt(1965811465);
		else if (13 == i) {
			int i_45_ = class572_sub15.readUnsignedByte(975627197);
			anIntArray4627 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				anIntArray4627[i_46_] = class572_sub15.readUnsignedShort(647518597);
		} else if (14 == i) {
			int i_47_ = class572_sub15.readUnsignedByte(1935963892);
			anIntArrayArray4626 = new int[i_47_][2];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
				anIntArrayArray4626[i_48_][0] = class572_sub15.readUnsignedByte(1237189988);
				anIntArrayArray4626[i_48_][1] = class572_sub15.readUnsignedByte(1103581183);
			}
		} else if (15 == i)
			anInt4629 = class572_sub15.readUnsignedShort(647518597) * 1132415109;
		else if (i == 17)
			anInt4621 = class572_sub15.readBigSmart((byte) 32) * 1431921881;
		else if (i == 18) {
			int i_49_ = class572_sub15.readUnsignedByte(564416065);
			anIntArray4620 = new int[i_49_];
			((Class386) this).anIntArray4630 = new int[i_49_];
			((Class386) this).anIntArray4632 = new int[i_49_];
			aStringArray4633 = new String[i_49_];
			for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
				anIntArray4620[i_50_] = class572_sub15.readInt(576811526);
				((Class386) this).anIntArray4630[i_50_] = class572_sub15.readInt(1269205105);
				((Class386) this).anIntArray4632[i_50_] = class572_sub15.readInt(2143640747);
				aStringArray4633[i_50_] = class572_sub15.readString(1295706626);
			}
		} else if (19 == i) {
			int i_51_ = class572_sub15.readUnsignedByte(1891952190);
			anIntArray4634 = new int[i_51_];
			((Class386) this).anIntArray4631 = new int[i_51_];
			((Class386) this).anIntArray4636 = new int[i_51_];
			aStringArray4638 = new String[i_51_];
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
				anIntArray4634[i_52_] = class572_sub15.readInt(782966161);
				((Class386) this).anIntArray4631[i_52_] = class572_sub15.readInt(324678937);
				((Class386) this).anIntArray4636[i_52_] = class572_sub15.readInt(2026191388);
				aStringArray4638[i_52_] = class572_sub15.readString(1295706626);
			}
		} else if (249 == i) {
			int i_53_ = class572_sub15.readUnsignedByte(1675561072);
			if (null == ((Class386) this).aClass676_4628) {
				int i_54_ = HashTable.nextPowerOfTwo(i_53_, 1494289863);
				((Class386) this).aClass676_4628 = new Class676(i_54_);
			}
			for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
				boolean bool = class572_sub15.readUnsignedByte(486859501) == 1;
				int i_56_ = class572_sub15.read24BitInt(1140925462);
				Class572 class572;
				if (bool)
					class572 = new LinkableObject(class572_sub15.readString(1295706626));
				else
					class572 = new LinkableInt(class572_sub15.readInt(1204175643));
				((Class386) this).aClass676_4628.put(class572, (long) i_56_);
			}
		}
	}

	public int method4678(int i, int i_57_) {
		if (((Class386) this).aClass676_4628 == null)
			return i_57_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class386) this).aClass676_4628.get((long) i));
		if (class572_sub26 == null)
			return i_57_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	Class386(int i, Interface18 interface18) {
		anInt4621 = -1431921881;
		((Class386) this).anInterface18_4639 = interface18;
	}

	public void method103() {
		if (aString4619 == null)
			aString4619 = aString4618;
	}

	public String method4679(int i, String string, int i_58_) {
		if (null == ((Class386) this).aClass676_4628)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) ((Class386) this).aClass676_4628.get((long) i));
		if (class572_sub9 == null)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_59_ = class572_sub15.readUnsignedByte(1368085156);
			if (i_59_ == 0)
				break;
			method4677(class572_sub15, i_59_, (byte) 27);
		}
	}

	public void method110() {
		if (aString4619 == null)
			aString4619 = aString4618;
	}

	static final void method4680(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_60_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_61_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831 != null)
			Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831.method5606(i_60_, i_61_, (byte) 3);
	}

	static final void method4681(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_62_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_63_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		if (i_62_ >= 0 && i_62_ < 2)
			client.anIntArrayArrayArray8689[i_62_] = new int[i_63_ << 1][4];
	}

	static final void method4682(Cs2Executor class441, byte i) {
		OutgoingPacket.method4058((((Cs2Executor) class441).aClass456_Sub1_Sub5_Sub1_5118), class441, -2120794535);
	}

	public static Class634 method4683(ItemDefinitions class631, RSByteBuffer class572_sub15, int i) {
		return Class420.method5134(class631, class572_sub15, 2, 1720914189);
	}

	static int method4684(InterfaceDefinitions class73, int i, int i_64_) {
		if (!client.method7992(class73).method8646(i, (byte) 78) && null == class73.anObjectArray776)
			return -1;
		return ((null != class73.anIntArray850 && class73.anIntArray850.length > i) ? class73.anIntArray850[i] : -1);
	}

	static final void method4685(Cs2Executor class441, int i) {
		int i_65_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (0 != 1472719885 * client.anInt8861 && i_65_ < 351572371 * client.anInt8865)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = client.aClass23Array8650[i_65_].aString151;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}

	static final void method4686(Cs2Executor class441, int i) {
		int i_66_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aByteArray4271[i_66_];
	}
}
