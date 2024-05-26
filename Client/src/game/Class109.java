package game;

/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class109 implements Interface70 {
	Class54 this$0;

	Class109(Class54 class54) {
		((Class109) this).this$0 = class54;
	}

	public void method430(Object object, float[] fs, Object[] objects, int i) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1517443124);
		float f_0_ = class603.method7112(1453440004);
		Class240 class240_1_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) 41));
		float f_2_ = 0.0F;
		float f_3_ = class240_1_.method3301();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		fs[0] = f_2_;
		fs[1] = f_2_;
	}

	public void method433(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1428846747);
		float f_5_ = class603.method7112(1869587796);
		Class240 class240_6_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) 28));
		float f_7_ = 0.0F;
		float f_8_ = class240_6_.method3301();
		if (f_8_ >= f_5_)
			f_7_ = 0.0F;
		if (f_8_ <= f)
			f_7_ = 1.0F;
		else {
			float f_9_ = 1.0F - 1.0F / (f_5_ - f) * (f_8_ - f);
			if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
				f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
			f_7_ = f_9_;
		}
		fs[0] = f_7_;
		fs[1] = f_7_;
	}

	public void method431(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1960535578);
		float f_10_ = class603.method7112(1500921770);
		Class240 class240_11_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) -23));
		float f_12_ = 0.0F;
		float f_13_ = class240_11_.method3301();
		if (f_13_ >= f_10_)
			f_12_ = 0.0F;
		if (f_13_ <= f)
			f_12_ = 1.0F;
		else {
			float f_14_ = 1.0F - 1.0F / (f_10_ - f) * (f_13_ - f);
			if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
			f_12_ = f_14_;
		}
		fs[0] = f_12_;
		fs[1] = f_12_;
	}

	public void method432(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1683733895);
		float f_15_ = class603.method7112(2000326297);
		Class240 class240_16_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) -32));
		float f_17_ = 0.0F;
		float f_18_ = class240_16_.method3301();
		if (f_18_ >= f_15_)
			f_17_ = 0.0F;
		if (f_18_ <= f)
			f_17_ = 1.0F;
		else {
			float f_19_ = 1.0F - 1.0F / (f_15_ - f) * (f_18_ - f);
			if ((double) f_19_ < 0.0 || (double) f_19_ > 1.0)
				f_19_ = Math.min(Math.max(f_19_, 0.0F), 1.0F);
			f_17_ = f_19_;
		}
		fs[0] = f_17_;
		fs[1] = f_17_;
	}

	public void method434(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1574698767);
		float f_20_ = class603.method7112(1805521401);
		Class240 class240_21_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) 5));
		float f_22_ = 0.0F;
		float f_23_ = class240_21_.method3301();
		if (f_23_ >= f_20_)
			f_22_ = 0.0F;
		if (f_23_ <= f)
			f_22_ = 1.0F;
		else {
			float f_24_ = 1.0F - 1.0F / (f_20_ - f) * (f_23_ - f);
			if ((double) f_24_ < 0.0 || (double) f_24_ > 1.0)
				f_24_ = Math.min(Math.max(f_24_, 0.0F), 1.0F);
			f_22_ = f_24_;
		}
		fs[0] = f_22_;
		fs[1] = f_22_;
	}

	public void method435(Object object, float[] fs, Object[] objects) {
		Class603 class603 = (Class603) object;
		Class240 class240 = class603.method7110(2055439811);
		float f = class603.method7094(1892014883);
		float f_25_ = class603.method7112(2121722488);
		Class240 class240_26_ = Class240.method3277(class240, ((Class109) this).this$0.method939((byte) -100));
		float f_27_ = 0.0F;
		float f_28_ = class240_26_.method3301();
		if (f_28_ >= f_25_)
			f_27_ = 0.0F;
		if (f_28_ <= f)
			f_27_ = 1.0F;
		else {
			float f_29_ = 1.0F - 1.0F / (f_25_ - f) * (f_28_ - f);
			if ((double) f_29_ < 0.0 || (double) f_29_ > 1.0)
				f_29_ = Math.min(Math.max(f_29_, 0.0F), 1.0F);
			f_27_ = f_29_;
		}
		fs[0] = f_27_;
		fs[1] = f_27_;
	}

	static final void method2065(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub15_9244.method8970(660014728);
	}

	static final void method2066(Cs2Executor class441, int i) {
		int i_30_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (!Class272_Sub2.aClass106_9517.method1677())
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 3;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method7863(i_30_, -1773498676);
	}

	public static int method2067(int i) {
		return 10;
	}

	public static int method2068(int i, int i_31_, byte i_32_) {
		int i_33_ = 1;
		for (/**/; i_31_ > 1; i_31_ >>= 1) {
			if (0 != (i_31_ & 0x1))
				i_33_ *= i;
			i *= i;
		}
		if (i_31_ == 1)
			return i * i_33_;
		return i_33_;
	}

	public static int method2069(Class248 class248, int i) {
		int i_34_ = 0;
		if (class248.method3383(Class1.anInt10 * 70190271, -1325188405))
			i_34_++;
		if (class248.method3383(2035300345 * Class587.anInt7782, 718707363))
			i_34_++;
		if (class248.method3383(1784828941 * Class1.anInt13, -369724382))
			i_34_++;
		if (class248.method3383(Class1.anInt17 * -159010103, -661694514))
			i_34_++;
		if (class248.method3383(Class567.anInt6380 * -131560899, -548700016))
			i_34_++;
		if (class248.method3383(-728770177 * Class1.anInt15, 396226502))
			i_34_++;
		if (class248.method3383(Cs2CallPointer.anInt5332 * 971324975, -459691557))
			i_34_++;
		if (class248.method3383(Class402_Sub1.anInt9683 * 568642775, 369586437))
			i_34_++;
		if (class248.method3383(-1874210791 * Class67.anInt693, 1300931767))
			i_34_++;
		if (class248.method3383(-2139618225 * Class562.anInt6357, -1393828459))
			i_34_++;
		return i_34_;
	}

	static final void method2070(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, short i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 276225891) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray890 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}
}
