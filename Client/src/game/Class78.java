package game;

/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78 implements Interface17 {
	int anInt957;
	public int anInt958;
	public int anInt959;
	public int anInt960 = 1855892375;
	public int anInt961 = 1688214689;
	public int anInt962;
	Interface18 anInterface18_963;
	public String aString964;
	public int anInt965;
	Class676 aClass676_966;
	public static final int anInt967 = 1;
	public static final int anInt968 = 2;
	public int anInt969;
	public int anInt970;
	public boolean aBool971;
	int anInt972;
	public String[] aStringArray973;
	public int anInt974;
	int anInt975;
	int anInt976;
	int anInt977;
	Class40 aClass40_978;
	int anInt979;
	public int anInt980;
	int anInt981;
	int anInt982;
	int anInt983;
	public int[] anIntArray984;
	public static final int anInt985 = 0;
	public int anInt986;
	public int anInt987;
	public int anInt988 = -1500086339;
	public String aString989;
	public int anInt990;
	public int anInt991;
	public int anInt992;
	public int anInt993;
	public boolean aBool994;
	public int anInt995;
	public Class39 aClass39_996;
	public Class75 aClass75_997;
	public int[] anIntArray998;
	public byte[] aByteArray999;
	public int anInt1000;
	public boolean aBool1001;
	public int[] anIntArray1002;
	public int anInt1003;
	public int anInt1004;

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(81193281);
			if (i_0_ == 0)
				break;
			method1165(class572_sub15, i_0_, 1997824519);
		}
	}

	public void method112() {
		if (anIntArray1002 != null) {
			for (int i = 0; i < anIntArray1002.length; i += 2) {
				if (anIntArray1002[i] < -855683561 * anInt986)
					anInt986 = anIntArray1002[i] * -1300444761;
				else if (anIntArray1002[i] > -232986123 * anInt1003)
					anInt1003 = -1567114659 * anIntArray1002[i];
				if (anIntArray1002[1 + i] < 1944042083 * anInt987)
					anInt987 = 1957467979 * anIntArray1002[1 + i];
				else if (anIntArray1002[1 + i] > anInt962 * -266857517)
					anInt962 = anIntArray1002[i + 1] * 1884732507;
			}
		}
	}

	public boolean method1158(Interface15 interface15, Interface13 interface13, int i) {
		int i_1_ = -1;
		if (((Class78) this).anInt979 * 26487667 != -1) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, 26487667 * ((Class78) this).anInt979, (byte) 116);
			i_1_ = interface13.method73(class179, -1312612955);
		} else if (((Class78) this).anInt972 * 762815139 != -1) {
			VarBitDefinition class429 = interface15.method95(762815139 * ((Class78) this).anInt972, 819446449);
			i_1_ = interface13.method72(class429, -56249900);
		} else
			return true;
		if (anIntArray984 == null) {
			if (i_1_ < 1434377501 * ((Class78) this).anInt976 || i_1_ > ((Class78) this).anInt977 * -538314359)
				return false;
		} else {
			if (i_1_ < 0 || i_1_ >= anIntArray984.length - 1) {
				int i_2_ = anIntArray984[anIntArray984.length - 1];
				if (-1 != i_2_) {
					if (-1 != 1434377501 * ((Class78) this).anInt976 && ((Class78) this).anInt977 * -538314359 != -1 && (i_1_ < 1434377501 * ((Class78) this).anInt976 || i_1_ > ((Class78) this).anInt977 * -538314359))
						return false;
				} else
					return false;
			}
			if (anIntArray984[i_1_] == -1)
				return false;
		}
		boolean bool = false;
		int i_3_;
		if (((Class78) this).anInt983 * 1491765401 != -1) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, 1491765401 * ((Class78) this).anInt983, (byte) 111);
			i_3_ = interface13.method73(class179, -1525710316);
		} else if (((Class78) this).anInt982 * -360791013 != -1) {
			VarBitDefinition class429 = interface15.method95(-360791013 * ((Class78) this).anInt982, 819446449);
			i_3_ = interface13.method72(class429, -622829855);
		} else
			return true;
		if (i_3_ < ((Class78) this).anInt957 * -2039535299 || i_3_ > ((Class78) this).anInt981 * -243722121)
			return false;
		return true;
	}

	public Class161 method1159(Class106 class106, boolean bool, int i) {
		int i_4_ = bool ? -1553254241 * anInt961 : anInt960 * -1756791847;
		int i_5_ = i_4_ | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i_5_);
		if (class161 != null)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(i_4_, 2141444197))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), i_4_, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i_5_);
		}
		return class161;
	}

	public Class161 method1160(Class106 class106, byte i) {
		Class161 class161 = ((Class161) (((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) (-1443445467 * ((Class78) this).anInt975 | 0x20000 | 1862175997 * class106.anInt1416 << 29))));
		if (class161 != null)
			return class161;
		((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(-1443445467 * ((Class78) this).anInt975, -890182276);
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), -1443445467 * ((Class78) this).anInt975, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) (((Class78) this).anInt975 * -1443445467 | 0x20000 | 1862175997 * class106.anInt1416 << 29));
		}
		return class161;
	}

	public int method1161(int i, int i_6_, int i_7_) {
		if (null == ((Class78) this).aClass676_966)
			return i_6_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class78) this).aClass676_966.get((long) i));
		if (class572_sub26 == null)
			return i_6_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public String method1162(int i, String string, int i_8_) {
		if (null == ((Class78) this).aClass676_966)
			return string;
		LinkableObject class572_sub9 = ((LinkableObject) ((Class78) this).aClass676_966.get((long) i));
		if (class572_sub9 == null)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public final Class78 method1163(Interface15 interface15, Interface13 interface13, int i) {
		int i_9_ = -1;
		if (-1 != 762815139 * ((Class78) this).anInt972) {
			VarBitDefinition class429 = interface15.method95(762815139 * ((Class78) this).anInt972, 819446449);
			if (null != class429)
				i_9_ = interface13.method72(class429, 1030506665);
		} else if (-1 != ((Class78) this).anInt979 * 26487667) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, ((Class78) this).anInt979 * 26487667, (byte) 34);
			if (class179 != null)
				i_9_ = interface13.method73(class179, -1857555971);
		}
		if (i_9_ < 0 || i_9_ >= anIntArray984.length - 1) {
			int i_10_ = anIntArray984[anIntArray984.length - 1];
			if (-1 != i_10_)
				return (Class78) ((Class78) this).anInterface18_963.getDefinition(i_10_, -1303841042);
			return null;
		}
		if (-1 == anIntArray984[i_9_])
			return null;
		return (Class78) ((Class78) this).anInterface18_963.getDefinition(anIntArray984[i_9_], -155158971);
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1459539135);
			if (i == 0)
				break;
			method1165(class572_sub15, i, 1997824519);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1955594903);
			if (i == 0)
				break;
			method1165(class572_sub15, i, 1997824519);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1130325697);
			if (i == 0)
				break;
			method1165(class572_sub15, i, 1997824519);
		}
	}

	public void method110() {
		if (anIntArray1002 != null) {
			for (int i = 0; i < anIntArray1002.length; i += 2) {
				if (anIntArray1002[i] < -855683561 * anInt986)
					anInt986 = anIntArray1002[i] * -1300444761;
				else if (anIntArray1002[i] > -232986123 * anInt1003)
					anInt1003 = -1567114659 * anIntArray1002[i];
				if (anIntArray1002[1 + i] < 1944042083 * anInt987)
					anInt987 = 1957467979 * anIntArray1002[1 + i];
				else if (anIntArray1002[1 + i] > anInt962 * -266857517)
					anInt962 = anIntArray1002[i + 1] * 1884732507;
			}
		}
	}

	public void method103() {
		if (anIntArray1002 != null) {
			for (int i = 0; i < anIntArray1002.length; i += 2) {
				if (anIntArray1002[i] < -855683561 * anInt986)
					anInt986 = anIntArray1002[i] * -1300444761;
				else if (anIntArray1002[i] > -232986123 * anInt1003)
					anInt1003 = -1567114659 * anIntArray1002[i];
				if (anIntArray1002[1 + i] < 1944042083 * anInt987)
					anInt987 = 1957467979 * anIntArray1002[1 + i];
				else if (anIntArray1002[1 + i] > anInt962 * -266857517)
					anInt962 = anIntArray1002[i + 1] * 1884732507;
			}
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1065863052);
			if (i == 0)
				break;
			method1165(class572_sub15, i, 1997824519);
		}
	}

	public Class161 method1164(Class106 class106) {
		int i = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, 1744076718))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i);
		}
		return class161;
	}

	public void method106() {
		if (anIntArray1002 != null) {
			for (int i = 0; i < anIntArray1002.length; i += 2) {
				if (anIntArray1002[i] < -855683561 * anInt986)
					anInt986 = anIntArray1002[i] * -1300444761;
				else if (anIntArray1002[i] > -232986123 * anInt1003)
					anInt1003 = -1567114659 * anIntArray1002[i];
				if (anIntArray1002[1 + i] < 1944042083 * anInt987)
					anInt987 = 1957467979 * anIntArray1002[1 + i];
				else if (anIntArray1002[1 + i] > anInt962 * -266857517)
					anInt962 = anIntArray1002[i + 1] * 1884732507;
			}
		}
	}

	void method1165(RSByteBuffer class572_sub15, int i, int i_11_) {
		if (i == 1)
			anInt960 = class572_sub15.readBigSmart((byte) 79) * -1855892375;
		else if (2 == i)
			anInt961 = class572_sub15.readBigSmart((byte) 10) * -1688214689;
		else if (i == 3)
			aString964 = class572_sub15.readString(1295706626);
		else if (i == 4)
			anInt958 = class572_sub15.read24BitInt(1140925462) * -1118592111;
		else if (i == 5)
			anInt988 = class572_sub15.read24BitInt(1140925462) * 1500086339;
		else if (i == 6)
			anInt965 = class572_sub15.readUnsignedByte(1777007651) * -1242065329;
		else if (7 == i) {
			int i_12_ = class572_sub15.readUnsignedByte(295582951);
			if ((i_12_ & 0x1) == 0)
				aBool971 = false;
			if (2 == (i_12_ & 0x2))
				aBool994 = true;
		} else if (8 == i)
			class572_sub15.readUnsignedByte(2001124145);
		else if (i == 9) {
			((Class78) this).anInt972 = class572_sub15.readUnsignedShort(647518597) * 1675043083;
			if (65535 == 762815139 * ((Class78) this).anInt972)
				((Class78) this).anInt972 = -1675043083;
			((Class78) this).anInt979 = class572_sub15.readUnsignedShort(647518597) * 661647803;
			if (65535 == ((Class78) this).anInt979 * 26487667)
				((Class78) this).anInt979 = -661647803;
			((Class78) this).anInt976 = class572_sub15.readInt(-104789191) * 1486671157;
			((Class78) this).anInt977 = class572_sub15.readInt(549610937) * -744076103;
		} else if (i >= 10 && i <= 14)
			aStringArray973[i - 10] = class572_sub15.readString(1295706626);
		else if (i == 15) {
			int i_13_ = class572_sub15.readUnsignedByte(1712552298);
			anIntArray1002 = new int[i_13_ * 2];
			for (int i_14_ = 0; i_14_ < 2 * i_13_; i_14_++)
				anIntArray1002[i_14_] = class572_sub15.readShort(-710976385);
			anInt990 = class572_sub15.readInt(-443992561) * 1900671211;
			int i_15_ = class572_sub15.readUnsignedByte(932366305);
			anIntArray998 = new int[i_15_];
			for (int i_16_ = 0; i_16_ < anIntArray998.length; i_16_++)
				anIntArray998[i_16_] = class572_sub15.readInt(-749307584);
			aByteArray999 = new byte[i_13_];
			for (int i_17_ = 0; i_17_ < i_13_; i_17_++)
				aByteArray999[i_17_] = class572_sub15.readByte(1710014308);
		} else if (16 == i)
			aBool1001 = false;
		else if (17 == i)
			aString989 = class572_sub15.readString(1295706626);
		else if (18 == i)
			((Class78) this).anInt975 = class572_sub15.readBigSmart((byte) 104) * -2107257171;
		else if (i == 19)
			anInt980 = class572_sub15.readUnsignedShort(647518597) * -1606432575;
		else if (20 == i) {
			((Class78) this).anInt982 = class572_sub15.readUnsignedShort(647518597) * -1547078125;
			if (65535 == -360791013 * ((Class78) this).anInt982)
				((Class78) this).anInt982 = 1547078125;
			((Class78) this).anInt983 = class572_sub15.readUnsignedShort(647518597) * 901729193;
			if (1491765401 * ((Class78) this).anInt983 == 65535)
				((Class78) this).anInt983 = -901729193;
			((Class78) this).anInt957 = class572_sub15.readInt(-149719007) * -1370098155;
			((Class78) this).anInt981 = class572_sub15.readInt(1747107086) * 980173127;
		} else if (21 == i)
			anInt970 = class572_sub15.readInt(264775366) * -902527497;
		else if (22 == i)
			anInt969 = class572_sub15.readInt(1863761113) * -827677281;
		else if (23 == i) {
			anInt991 = class572_sub15.readUnsignedByte(833103209) * 2120914601;
			anInt992 = class572_sub15.readUnsignedByte(-111987119) * 980767673;
			anInt993 = class572_sub15.readUnsignedByte(945109774) * -1859046955;
		} else if (i == 24) {
			anInt1004 = class572_sub15.readShort(-710976385) * -1866380891;
			anInt995 = class572_sub15.readShort(-710976385) * -242101335;
		} else if (25 == i)
			anInt974 = class572_sub15.readBigSmart((byte) 40) * 473053915;
		else if (26 == i || i == 27) {
			((Class78) this).anInt972 = class572_sub15.readUnsignedShort(647518597) * 1675043083;
			if (65535 == 762815139 * ((Class78) this).anInt972)
				((Class78) this).anInt972 = -1675043083;
			((Class78) this).anInt979 = class572_sub15.readUnsignedShort(647518597) * 661647803;
			if (26487667 * ((Class78) this).anInt979 == 65535)
				((Class78) this).anInt979 = -661647803;
			int i_18_ = -1;
			if (27 == i) {
				i_18_ = class572_sub15.readUnsignedShort(647518597);
				if (65535 == i_18_)
					i_18_ = -1;
			}
			int i_19_ = class572_sub15.readUnsignedByte(1095338484);
			anIntArray984 = new int[i_19_ + 2];
			for (int i_20_ = 0; i_20_ <= i_19_; i_20_++) {
				anIntArray984[i_20_] = class572_sub15.readUnsignedShort(647518597);
				if (anIntArray984[i_20_] == 65535)
					anIntArray984[i_20_] = -1;
			}
			anIntArray984[1 + i_19_] = i_18_;
		} else if (28 == i)
			anInt1000 = class572_sub15.readUnsignedByte(1758457728) * 307815679;
		else if (i == 29)
			aClass39_996 = ((Class39) Class455.method5387(Class477.method5645(1563418699), class572_sub15.readUnsignedByte(362106515), -1907342975));
		else if (30 == i)
			aClass75_997 = ((Class75) Class455.method5387(Class13.method615((byte) 0), class572_sub15.readUnsignedByte(516085790), -2057470580));
		else if (i == 249) {
			int i_21_ = class572_sub15.readUnsignedByte(758158366);
			if (null == ((Class78) this).aClass676_966) {
				int i_22_ = HashTable.nextPowerOfTwo(i_21_, 1920981901);
				((Class78) this).aClass676_966 = new Class676(i_22_);
			}
			for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
				boolean bool = class572_sub15.readUnsignedByte(1945099043) == 1;
				int i_24_ = class572_sub15.read24BitInt(1140925462);
				Class572 class572;
				if (bool)
					class572 = new LinkableObject(class572_sub15.readString(1295706626));
				else
					class572 = new LinkableInt(class572_sub15.readInt(-561242837));
				((Class78) this).aClass676_966.put(class572, (long) i_24_);
			}
		}
	}

	Class78(int i, Interface18 interface18, Class40 class40) {
		anInt965 = 0;
		aBool971 = true;
		aBool994 = false;
		aStringArray973 = new String[5];
		((Class78) this).anInt975 = 2107257171;
		((Class78) this).anInt976 = -1486671157;
		((Class78) this).anInt977 = 744076103;
		((Class78) this).anInt972 = -1675043083;
		((Class78) this).anInt979 = -661647803;
		((Class78) this).anInt982 = 1547078125;
		((Class78) this).anInt983 = -901729193;
		anIntArray984 = null;
		anInt986 = -847038887;
		anInt987 = 190015669;
		anInt1003 = -2147483648;
		anInt962 = -2147483648;
		anInt991 = -2120914601;
		anInt992 = -980767673;
		anInt993 = 1859046955;
		aClass39_996 = Class39.aClass39_398;
		aClass75_997 = Class75.aClass75_942;
		anInt1000 = -307815679;
		aBool1001 = true;
		anInt980 = 1606432575;
		anInt974 = -473053915;
		anInt959 = -514711199 * i;
		((Class78) this).anInterface18_963 = interface18;
		((Class78) this).aClass40_978 = class40;
	}

	public Class161 method1166(Class106 class106) {
		int i = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, -1796892845))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i);
		}
		return class161;
	}

	public Class161 method1167(Class106 class106) {
		int i = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, -2017046528))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i);
		}
		return class161;
	}

	public Class161 method1168(Class106 class106) {
		int i = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, 1680030911))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i);
		}
		return class161;
	}

	public Class161 method1169(Class106 class106, byte i) {
		int i_25_ = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i_25_);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, 1388691279))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i_25_);
		}
		return class161;
	}

	public Class161 method1170(Class106 class106) {
		Class161 class161 = ((Class161) (((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) (-1443445467 * ((Class78) this).anInt975 | 0x20000 | 1862175997 * class106.anInt1416 << 29))));
		if (class161 != null)
			return class161;
		((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(-1443445467 * ((Class78) this).anInt975, 165041911);
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), -1443445467 * ((Class78) this).anInt975, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) (((Class78) this).anInt975 * -1443445467 | 0x20000 | 1862175997 * class106.anInt1416 << 29));
		}
		return class161;
	}

	public Class161 method1171(Class106 class106) {
		Class161 class161 = ((Class161) (((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) (-1443445467 * ((Class78) this).anInt975 | 0x20000 | 1862175997 * class106.anInt1416 << 29))));
		if (class161 != null)
			return class161;
		((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(-1443445467 * ((Class78) this).anInt975, -194206515);
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), -1443445467 * ((Class78) this).anInt975, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) (((Class78) this).anInt975 * -1443445467 | 0x20000 | 1862175997 * class106.anInt1416 << 29));
		}
		return class161;
	}

	public Class161 method1172(Class106 class106) {
		int i = anInt974 * 1112093011 | 1862175997 * class106.anInt1416 << 29;
		Class161 class161 = (Class161) ((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) i);
		if (null != class161)
			return class161;
		if (!((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(1112093011 * anInt974, 357768077))
			return null;
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), 1112093011 * anInt974, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) i);
		}
		return class161;
	}

	public int method1173(int i, int i_26_) {
		if (null == ((Class78) this).aClass676_966)
			return i_26_;
		LinkableInt class572_sub26 = ((LinkableInt) ((Class78) this).aClass676_966.get((long) i));
		if (class572_sub26 == null)
			return i_26_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public void method104(byte i) {
		if (anIntArray1002 != null) {
			for (int i_27_ = 0; i_27_ < anIntArray1002.length; i_27_ += 2) {
				if (anIntArray1002[i_27_] < -855683561 * anInt986)
					anInt986 = anIntArray1002[i_27_] * -1300444761;
				else if (anIntArray1002[i_27_] > -232986123 * anInt1003)
					anInt1003 = -1567114659 * anIntArray1002[i_27_];
				if (anIntArray1002[1 + i_27_] < 1944042083 * anInt987)
					anInt987 = 1957467979 * anIntArray1002[1 + i_27_];
				else if (anIntArray1002[1 + i_27_] > anInt962 * -266857517)
					anInt962 = anIntArray1002[i_27_ + 1] * 1884732507;
			}
		}
	}

	public Class161 method1174(Class106 class106) {
		Class161 class161 = ((Class161) (((Class40) ((Class78) this).aClass40_978).aClass127_404.method2246((long) (-1443445467 * ((Class78) this).anInt975 | 0x20000 | 1862175997 * class106.anInt1416 << 29))));
		if (class161 != null)
			return class161;
		((Class40) ((Class78) this).aClass40_978).aClass248_403.method3383(-1443445467 * ((Class78) this).anInt975, 1612639375);
		Class87 class87 = Class160.method2571((((Class40) ((Class78) this).aClass40_978).aClass248_403), -1443445467 * ((Class78) this).anInt975, 0);
		if (class87 != null) {
			class161 = class106.method1711(class87, true);
			((Class40) ((Class78) this).aClass40_978).aClass127_404.method2229(class161, (long) (((Class78) this).anInt975 * -1443445467 | 0x20000 | 1862175997 * class106.anInt1416 << 29));
		}
		return class161;
	}

	static void method1175(Class106 class106, ObjectDefinitions class509, int i, int i_28_, int i_29_, int i_30_) {
		Class242 class242 = ((Class242) Class560.aClass639_Sub1_6348.getDefinition(class509.anInt5623 * 337621963, 2095348656));
		if (-1 != 499643409 * class242.anInt2662) {
			if (class509.aBool5662) {
				i += class509.anInt5649 * -1413403261;
				i &= 0x3;
			} else
				i = 0;
			Class161 class161 = class242.method3335(class106, i, class509.aBool5678, (byte) 22);
			if (class161 != null) {
				int i_31_ = class509.sizeX * -876498849;
				int i_32_ = class509.sizeY * 1922784011;
				if ((i & 0x1) == 1) {
					i_31_ = 1922784011 * class509.sizeY;
					i_32_ = -876498849 * class509.sizeX;
				}
				int i_33_ = class161.method45();
				int i_34_ = class161.method2589();
				if (class242.aBool2664) {
					i_33_ = 4 * i_31_;
					i_34_ = 4 * i_32_;
				}
				if (class242.anInt2665 * -1243356569 != 0)
					class161.method2598(i_28_, i_29_ - 4 * (i_32_ - 1), i_33_, i_34_, 0, (~0xffffff | class242.anInt2665 * -1243356569), 1);
				else
					class161.method2597(i_28_, i_29_ - (i_32_ - 1) * 4, i_33_, i_34_);
			}
		}
	}

	static final void method1176(Cs2Executor class441, int i) {
		if (1 == -81165077 * Class200.anInt2390)
			Class200.aBool2389 = true;
		else if (3 == -81165077 * Class200.anInt2390)
			Class200.aBool2388 = true;
	}

	static final void method1177(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_35_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_36_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class240 class240 = Class240.method3316((float) i_35_, (float) i_35_, (float) i_35_);
		if (class240.aFloat2653 == -1.0F)
			class240.aFloat2653 = Float.POSITIVE_INFINITY;
		if (-1.0F == class240.aFloat2656)
			class240.aFloat2656 = Float.POSITIVE_INFINITY;
		if (class240.aFloat2657 == -1.0F)
			class240.aFloat2657 = Float.POSITIVE_INFINITY;
		Class133_Sub1.aClass411_Sub1_9827.method5024(class240, -733668675);
		Class133_Sub1.aClass411_Sub1_9827.method4974((float) i_36_ / 1000.0F, -50559917);
		class240.method3261();
	}

	public static final void method1178(int i) {
		if (!client.aBool8682) {
			client.aFloat8679 += (24.0F - client.aFloat8679) / 2.0F;
			client.aBool8685 = true;
			client.aBool8682 = true;
		}
	}
}
