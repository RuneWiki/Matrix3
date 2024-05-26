package game;

/* Class344_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class344_Sub3 extends Class344 {
	Class161 aClass161_9763;
	Class161 aClass161_9764;
	Class161 aClass161_9765;
	Class161 aClass161_9766;
	Class161 aClass161_9767;
	Class161 aClass161_9768;

	void method4308(boolean bool, int i, int i_0_, int i_1_) {
		if (bool) {
			int[] is = new int[4];
			Class272_Sub2.aClass106_9517.method1718(is);
			Class272_Sub2.aClass106_9517.method1715(i, i_0_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 + i), i_0_ + (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562));
			int i_2_ = ((Class344_Sub3) this).aClass161_9765.method45();
			int i_3_ = ((Class344_Sub3) this).aClass161_9765.method2589();
			int i_4_ = ((Class344_Sub3) this).aClass161_9766.method45();
			int i_5_ = ((Class344_Sub3) this).aClass161_9766.method2589();
			((Class344_Sub3) this).aClass161_9765.method2595(i, (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 - i_3_) / 2 + i_0_);
			((Class344_Sub3) this).aClass161_9766.method2595((-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 + i - i_4_), (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 - i_5_) / 2 + i_0_);
			Class272_Sub2.aClass106_9517.method1715(i, i_0_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 + i), i_0_ + ((Class344_Sub3) this).aClass161_9768.method2589());
			((Class344_Sub3) this).aClass161_9768.method2600(i + i_2_, i_0_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 - i_2_ - i_4_), ((Class344_Sub3) this).aClass375_4364.anInt4562 * -670814997);
			int i_6_ = ((Class344_Sub3) this).aClass161_9767.method2589();
			Class272_Sub2.aClass106_9517.method1715(i, i_0_ + -670814997 * (((Class344_Sub3) this).aClass375_4364.anInt4562) - i_6_, i + (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559), i_0_ + (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562));
			((Class344_Sub3) this).aClass161_9767.method2600(i + i_2_, (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 + i_0_ - i_6_), (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 - i_2_ - i_4_), -670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562);
			Class272_Sub2.aClass106_9517.method1715(is[0], is[1], is[2], is[3]);
		}
	}

	public void method299(short i) {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -1645736805);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -1567690008);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -847450175);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -1025551038);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, 123472450);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -319995164);
	}

	Class344_Sub3(Class248 class248, Class248 class248_7_, Class375_Sub1 class375_sub1) {
		super(class248, class248_7_, (Class375) class375_sub1);
	}

	void method4307(boolean bool, int i, int i_8_, int i_9_) {
		int i_10_ = i + ((Class344_Sub3) this).aClass161_9765.method45();
		int i_11_ = (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 + i - ((Class344_Sub3) this).aClass161_9766.method45());
		int i_12_ = i_8_ + ((Class344_Sub3) this).aClass161_9768.method2589();
		int i_13_ = (i_8_ + ((Class344_Sub3) this).aClass375_4364.anInt4562 * -670814997 - ((Class344_Sub3) this).aClass161_9767.method2589());
		int i_14_ = i_11_ - i_10_;
		int i_15_ = i_13_ - i_12_;
		int i_16_ = method4306((byte) -89) * i_14_ / 10000;
		int[] is = new int[4];
		Class272_Sub2.aClass106_9517.method1718(is);
		Class272_Sub2.aClass106_9517.method1715(i_10_, i_12_, i_16_ + i_10_, i_13_);
		method9282(i_10_, i_12_, i_14_, i_15_, (byte) -110);
		Class272_Sub2.aClass106_9517.method1715(i_16_ + i_10_, i_12_, i_11_, i_13_);
		((Class344_Sub3) this).aClass161_9763.method2600(i_10_, i_12_, i_14_, i_15_);
		Class272_Sub2.aClass106_9517.method1715(is[0], is[1], is[2], is[3]);
	}

	void method9282(int i, int i_17_, int i_18_, int i_19_, byte i_20_) {
		((Class344_Sub3) this).aClass161_9764.method2600(i, i_17_, i_18_, i_19_);
	}

	public boolean method297(int i) {
		if (!super.method297(2100410340))
			return false;
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(((class375_sub1.anInt9421) * 1272757203), -2008941090))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(279216161 * class375_sub1.anInt9418, -1997708386))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(((class375_sub1.anInt9419) * -1920095593), -1092957159))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383((-1242571089 * (class375_sub1.anInt9420)), -1799899140))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(class375_sub1.anInt9422 * 265336869, 605451903))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(class375_sub1.anInt9417 * -870755199, 329873233))
			return false;
		return true;
	}

	public void method149() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -1773717587);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -750939641);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -1551084812);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -1559906040);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -1472103355);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -836742778);
	}

	public void method298() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -306724220);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -1074422792);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -554408931);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -478046148);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -1615800198);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -1239537822);
	}

	public void method38() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -924723555);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -307532709);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -1695760552);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -1411306704);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -333708837);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -948454240);
	}

	public void method103() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -567994179);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -1747107778);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -1957370595);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -1304855297);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -885241490);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -1256523112);
	}

	public void method110() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -2112121280);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -658541296);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -871936383);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -310759343);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -2115929584);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -1286580827);
	}

	public void method112() {
		super.method299((short) 1212);
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		((Class344_Sub3) this).aClass161_9764 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9421 * 1272757203, -224590764);
		((Class344_Sub3) this).aClass161_9763 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, 279216161 * class375_sub1.anInt9418, -477400623);
		((Class344_Sub3) this).aClass161_9765 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9419 * -1920095593, -494558362);
		((Class344_Sub3) this).aClass161_9766 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -1242571089 * class375_sub1.anInt9420, -886208726);
		((Class344_Sub3) this).aClass161_9768 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, class375_sub1.anInt9422 * 265336869, -2100217261);
		((Class344_Sub3) this).aClass161_9767 = Class505.method6030(((Class344_Sub3) this).aClass248_4367, -870755199 * class375_sub1.anInt9417, -1043892403);
	}

	void method9283(int i, int i_21_, int i_22_, int i_23_) {
		((Class344_Sub3) this).aClass161_9764.method2600(i, i_21_, i_22_, i_23_);
	}

	public boolean method301() {
		if (!super.method297(1548721706))
			return false;
		Class375_Sub1 class375_sub1 = (Class375_Sub1) ((Class344_Sub3) this).aClass375_4364;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(((class375_sub1.anInt9421) * 1272757203), -1464136511))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(279216161 * class375_sub1.anInt9418, 575791575))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(((class375_sub1.anInt9419) * -1920095593), -793632539))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(-1242571089 * class375_sub1.anInt9420, 256387144))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(class375_sub1.anInt9422 * 265336869, -655625250))
			return false;
		if (!((Class344_Sub3) this).aClass248_4367.method3383(((class375_sub1.anInt9417) * -870755199), -1156164881))
			return false;
		return true;
	}

	void method4309(boolean bool, int i, int i_24_) {
		int i_25_ = i + ((Class344_Sub3) this).aClass161_9765.method45();
		int i_26_ = (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 + i - ((Class344_Sub3) this).aClass161_9766.method45());
		int i_27_ = i_24_ + ((Class344_Sub3) this).aClass161_9768.method2589();
		int i_28_ = (i_24_ + ((Class344_Sub3) this).aClass375_4364.anInt4562 * -670814997 - ((Class344_Sub3) this).aClass161_9767.method2589());
		int i_29_ = i_26_ - i_25_;
		int i_30_ = i_28_ - i_27_;
		int i_31_ = method4306((byte) -4) * i_29_ / 10000;
		int[] is = new int[4];
		Class272_Sub2.aClass106_9517.method1718(is);
		Class272_Sub2.aClass106_9517.method1715(i_25_, i_27_, i_31_ + i_25_, i_28_);
		method9282(i_25_, i_27_, i_29_, i_30_, (byte) -38);
		Class272_Sub2.aClass106_9517.method1715(i_31_ + i_25_, i_27_, i_26_, i_28_);
		((Class344_Sub3) this).aClass161_9763.method2600(i_25_, i_27_, i_29_, i_30_);
		Class272_Sub2.aClass106_9517.method1715(is[0], is[1], is[2], is[3]);
	}

	void method4310(boolean bool, int i, int i_32_) {
		int i_33_ = i + ((Class344_Sub3) this).aClass161_9765.method45();
		int i_34_ = (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 + i - ((Class344_Sub3) this).aClass161_9766.method45());
		int i_35_ = i_32_ + ((Class344_Sub3) this).aClass161_9768.method2589();
		int i_36_ = (i_32_ + ((Class344_Sub3) this).aClass375_4364.anInt4562 * -670814997 - ((Class344_Sub3) this).aClass161_9767.method2589());
		int i_37_ = i_34_ - i_33_;
		int i_38_ = i_36_ - i_35_;
		int i_39_ = method4306((byte) -26) * i_37_ / 10000;
		int[] is = new int[4];
		Class272_Sub2.aClass106_9517.method1718(is);
		Class272_Sub2.aClass106_9517.method1715(i_33_, i_35_, i_39_ + i_33_, i_36_);
		method9282(i_33_, i_35_, i_37_, i_38_, (byte) -79);
		Class272_Sub2.aClass106_9517.method1715(i_39_ + i_33_, i_35_, i_34_, i_36_);
		((Class344_Sub3) this).aClass161_9763.method2600(i_33_, i_35_, i_37_, i_38_);
		Class272_Sub2.aClass106_9517.method1715(is[0], is[1], is[2], is[3]);
	}

	void method4311(boolean bool, int i, int i_40_) {
		if (bool) {
			int[] is = new int[4];
			Class272_Sub2.aClass106_9517.method1718(is);
			Class272_Sub2.aClass106_9517.method1715(i, i_40_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 + i), i_40_ + (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562));
			int i_41_ = ((Class344_Sub3) this).aClass161_9765.method45();
			int i_42_ = ((Class344_Sub3) this).aClass161_9765.method2589();
			int i_43_ = ((Class344_Sub3) this).aClass161_9766.method45();
			int i_44_ = ((Class344_Sub3) this).aClass161_9766.method2589();
			((Class344_Sub3) this).aClass161_9765.method2595(i, (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 - i_42_) / 2 + i_40_);
			((Class344_Sub3) this).aClass161_9766.method2595((-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 + i - i_43_), (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 - i_44_) / 2 + i_40_);
			Class272_Sub2.aClass106_9517.method1715(i, i_40_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 + i), i_40_ + ((Class344_Sub3) this).aClass161_9768.method2589());
			((Class344_Sub3) this).aClass161_9768.method2600(i + i_41_, i_40_, (((Class344_Sub3) this).aClass375_4364.anInt4559 * -139432737 - i_41_ - i_43_), ((Class344_Sub3) this).aClass375_4364.anInt4562 * -670814997);
			int i_45_ = ((Class344_Sub3) this).aClass161_9767.method2589();
			Class272_Sub2.aClass106_9517.method1715(i, i_40_ + -670814997 * (((Class344_Sub3) this).aClass375_4364.anInt4562) - i_45_, i + (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559), i_40_ + (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562));
			((Class344_Sub3) this).aClass161_9767.method2600(i + i_41_, (-670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562 + i_40_ - i_45_), (-139432737 * ((Class344_Sub3) this).aClass375_4364.anInt4559 - i_41_ - i_43_), -670814997 * ((Class344_Sub3) this).aClass375_4364.anInt4562);
			Class272_Sub2.aClass106_9517.method1715(is[0], is[1], is[2], is[3]);
		}
	}

	static final void method9284(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStackPtr -= -1830744058;
		byte[] is = null;
		byte[] is_46_ = null;
		int i_47_;
		for (i_47_ = 0; (i_47_ < 10 && ((((Cs2Executor) class441).intStack[i_47_ + 1369304407 * ((Cs2Executor) class441).intStackPtr]) >= 0)); i_47_ += 2) {
			/* empty */
		}
		if (i_47_ > 0) {
			is = new byte[i_47_ / 2];
			is_46_ = new byte[i_47_ / 2];
			for (i_47_ -= 2; i_47_ >= 0; i_47_ -= 2) {
				is[i_47_ / 2] = (byte) (((Cs2Executor) class441).intStack[(1369304407 * ((Cs2Executor) class441).intStackPtr + i_47_)]);
				is_46_[i_47_ / 2] = (byte) (((Cs2Executor) class441).intStack[(i_47_ + ((Cs2Executor) class441).intStackPtr * 1369304407 + 1)]);
			}
		}
		Class391.method4722(class73, is, is_46_, class441, (byte) 96);
	}
}
