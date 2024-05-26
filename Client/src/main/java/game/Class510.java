package game;

/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class510 implements IVarDomain {
	static final long aLong5686 = 1L;
	static final long aLong5687 = 4611686018427387904L;
	int[] anIntArray5688;
	static final long aLong5689 = 500L;
	int[] anIntArray5690;
	static final long aLong5691 = 4611686018427387903L;
	Class676 aClass676_5692 = new Class676(128);
	static int anInt5693;
	public static Class248 idx14;

	public int method71(VarBitDefinition class429) {
		return class429.method5218((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), (byte) 109);
	}

	public void method92(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	public void method6070(byte i) {
		for (int i_0_ = 0; i_0_ < Class472.aClass202_Sub1_Sub1_5310.method113((byte) 27); i_0_++) {
			Class179_Sub2 class179_sub2 = ((Class179_Sub2) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i_0_, -1723915695));
			if (null != class179_sub2) {
				((Class510) this).anIntArray5690[i_0_] = 0;
				((Class510) this).anIntArray5688[i_0_] = 0;
			}
		}
		((Class510) this).aClass676_5692 = new Class676(128);
	}

	public int method73(VarDefinition class179, int i) {
		return (((Class510) this).anIntArray5688[class179.id * 473591285]);
	}

	public void method76(VarDefinition class179, int i, short i_1_) {
		((Class510) this).anIntArray5688[class179.id * 473591285] = i;
		Class572_Sub2 class572_sub2 = ((Class572_Sub2) ((Class510) this).aClass676_5692.get((long) (class179.id * 473591285)));
		if (null != class572_sub2)
			class572_sub2.aLong8968 = ((Class69.method1067(-1747256470) + 500L) * -3051605443725198317L);
		else {
			class572_sub2 = new Class572_Sub2(Class69.method1067(-2003714215) + 500L);
			((Class510) this).aClass676_5692.put(class572_sub2, (long) (473591285 * class179.id));
		}
	}

	public void method6071(VarDefinition class179, int i, int i_2_) {
		((Class510) this).anIntArray5690[473591285 * class179.id] = i;
		Class572_Sub2 class572_sub2 = ((Class572_Sub2) ((Class510) this).aClass676_5692.get((long) (class179.id * 473591285)));
		if (class572_sub2 != null) {
			if (4611686018427387905L != class572_sub2.aLong8968 * 3148940942659989019L)
				class572_sub2.aLong8968 = (Class69.method1067(-2091980088) + 500L | 0x4000000000000000L) * -3051605443725198317L;
		} else {
			class572_sub2 = new Class572_Sub2(4611686018427387905L);
			((Class510) this).aClass676_5692.put(class572_sub2, (long) (473591285 * class179.id));
		}
	}

	//
	public int method72(VarBitDefinition class429, int i) {
		return class429.method5218((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), (byte) 29);
	}

	public void method6072(VarBitDefinition class429, int i, int i_3_) {
		try {
			int i_4_ = class429.method5224((((Class510) this).anIntArray5690[(class429.baseVar.id * 473591285)]), i, (byte) -36);
			method6071(class429.baseVar, i_4_, -488916437);
		} catch (Exception_Sub2 exception_sub2) {
			/* empty */
		}
	}

	public long method77(VarDefinition class179, int i) {
		throw new UnsupportedOperationException();
	}

	public void method78(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	public Object method87(VarDefinition class179) {
		throw new UnsupportedOperationException();
	}

	public void method80(VarDefinition class179, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	public int method74(VarDefinition class179) {
		return (((Class510) this).anIntArray5688[class179.id * 473591285]);
	}

	public void method79(VarDefinition class179, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method84(VarDefinition class179, int i) {
		((Class510) this).anIntArray5688[class179.id * 473591285] = i;
		Class572_Sub2 class572_sub2 = ((Class572_Sub2) ((Class510) this).aClass676_5692.get((long) (class179.id * 473591285)));
		if (null != class572_sub2)
			class572_sub2.aLong8968 = ((Class69.method1067(-2012623391) + 500L) * -3051605443725198317L);
		else {
			class572_sub2 = new Class572_Sub2(Class69.method1067(-2050533507) + 500L);
			((Class510) this).aClass676_5692.put(class572_sub2, (long) (473591285 * class179.id));
		}
	}

	public void method91(VarDefinition class179, int i) {
		((Class510) this).anIntArray5688[class179.id * 473591285] = i;
		Class572_Sub2 class572_sub2 = ((Class572_Sub2) ((Class510) this).aClass676_5692.get((long) (class179.id * 473591285)));
		if (null != class572_sub2)
			class572_sub2.aLong8968 = ((Class69.method1067(-1645068871) + 500L) * -3051605443725198317L);
		else {
			class572_sub2 = new Class572_Sub2(Class69.method1067(-1653954300) + 500L);
			((Class510) this).aClass676_5692.put(class572_sub2, (long) (473591285 * class179.id));
		}
	}

	public int method6073(boolean bool, byte i) {
		long l = Class69.method1067(-2126329368);
		for (Class572_Sub2 class572_sub2 = ((Class572_Sub2) (bool ? ((Class510) this).aClass676_5692.method7968((byte) 113) : ((Class510) this).aClass676_5692.method7969(1603222739))); class572_sub2 != null; class572_sub2 = (Class572_Sub2) ((Class510) this).aClass676_5692.method7969(-187647576)) {
			if ((3148940942659989019L * class572_sub2.aLong8968 & 0x3fffffffffffffffL) < l) {
				if (0L != (3148940942659989019L * class572_sub2.aLong8968 & 0x4000000000000000L)) {
					int i_5_ = (int) (class572_sub2.hash * 381237825124074065L);
					((Class510) this).anIntArray5688[i_5_] = ((Class510) this).anIntArray5690[i_5_];
					class572_sub2.method6794((byte) 114);
					return i_5_;
				}
				class572_sub2.method6794((byte) -35);
			}
		}
		return -1;
	}

	public long method85(VarDefinition class179) {
		throw new UnsupportedOperationException();
	}

	public void method86(VarDefinition class179, long l) {
		throw new UnsupportedOperationException();
	}

	public Object method82(VarDefinition class179, byte i) {
		throw new UnsupportedOperationException();
	}

	public Object method88(VarDefinition class179) {
		throw new UnsupportedOperationException();
	}

	public Object method90(VarDefinition class179) {
		throw new UnsupportedOperationException();
	}

	public void method83(VarDefinition class179, int i) {
		((Class510) this).anIntArray5688[class179.id * 473591285] = i;
		Class572_Sub2 class572_sub2 = ((Class572_Sub2) ((Class510) this).aClass676_5692.get((long) (class179.id * 473591285)));
		if (null != class572_sub2)
			class572_sub2.aLong8968 = ((Class69.method1067(-1997059899) + 500L) * -3051605443725198317L);
		else {
			class572_sub2 = new Class572_Sub2(Class69.method1067(-1875183461) + 500L);
			((Class510) this).aClass676_5692.put(class572_sub2, (long) (473591285 * class179.id));
		}
	}

	public void method93(VarBitDefinition class429, int i) throws Exception_Sub2 {
		int i_6_ = class429.method5224((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), i, (byte) -126);
		method76(class429.baseVar, i_6_, (short) 255);
	}

	public void method75(VarBitDefinition class429, int i) throws Exception_Sub2 {
		int i_7_ = class429.method5224((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), i, (byte) -73);
		method76(class429.baseVar, i_7_, (short) 255);
	}

	public void method81(VarBitDefinition class429, int i, int i_8_) throws Exception_Sub2 {
		int i_9_ = class429.method5224((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), i, (byte) -91);
		method76(class429.baseVar, i_9_, (short) 255);
	}

	public Class510() {
		((Class510) this).anIntArray5690 = new int[Class472.aClass202_Sub1_Sub1_5310.method113((byte) 71)];
		((Class510) this).anIntArray5688 = new int[Class472.aClass202_Sub1_Sub1_5310.method113((byte) 22)];
	}

	public void method89(VarBitDefinition class429, int i) throws Exception_Sub2 {
		int i_10_ = class429.method5224((((Class510) this).anIntArray5688[(class429.baseVar.id * 473591285)]), i, (byte) -120);
		method76(class429.baseVar, i_10_, (short) 255);
	}

	static final void method6074(Cs2Executor class441, int i) {
		int i_11_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub34_9223.method7863(i_11_, 1935898175);
	}

	static void method6075(Class271_Sub1 class271_sub1, int i) {
		class271_sub1.method8357(0, 147202822);
		int i_12_;
		if (-456796019 * Class584.anInt7769 >= 96) {
			int i_13_ = Class134_Sub1.method9976((byte) 0);
			if (i_13_ <= 101) {
				Class390.method4710((byte) -69);
				i_12_ = 4;
			} else if (i_13_ <= 504) {
				Class613.method7363((byte) 0);
				i_12_ = 3;
			} else if (i_13_ <= 1000) {
				Class120.method2178((byte) 4);
				i_12_ = 2;
			} else {
				Class92.method1532(true, -1730087248);
				i_12_ = 1;
			}
			class271_sub1.method8358(0, i_13_, -126530990);
		} else {
			Class92.method1532(true, 1827074119);
			i_12_ = 1;
			class271_sub1.method8356(64, (byte) 24);
		}
		if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1593093566) != 0) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), 0, 952151672);
			BaseVarType.method7260(0, false, 1414879214);
		} else
			Class213.aClass572_Sub24_2463.method8612((Class213.aClass572_Sub24_2463.aClass665_Sub30_9205), true, (byte) 10);
		Class623.method7443(-1511900728);
		class271_sub1.method8354(i_12_, 1260396708);
	}

	static final void method6076(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub11_9219.method8201(-1657585300) ? 1 : 0;
	}
}
