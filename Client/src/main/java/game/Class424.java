package game;

/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class424 implements Interface50 {
	Class161 aClass161_4990;
	Class311 aClass311_4991;
	Class248 aClass248_4992;

	Class424(Class248 class248, Class311 class311) {
		((Class424) this).aClass248_4992 = class248;
		((Class424) this).aClass311_4991 = class311;
	}

	public void method300(boolean bool, int i) {
		if (bool) {
			int i_0_ = ((Class269.anInt2861 * 1960824389 > client.anInt8724 * -507276561) ? Class269.anInt2861 * 1960824389 : -507276561 * client.anInt8724);
			int i_1_ = ((Class584.anInt7739 * -530390519 > client.anInt8725 * -199235591) ? -530390519 * Class584.anInt7739 : -199235591 * client.anInt8725);
			int i_2_ = ((Class424) this).aClass161_4990.method45();
			int i_3_ = ((Class424) this).aClass161_4990.method2589();
			int i_4_ = 0;
			int i_5_ = i_0_;
			int i_6_ = i_3_ * i_0_ / i_2_;
			int i_7_ = (i_1_ - i_6_) / 2;
			if (i_6_ > i_1_) {
				i_7_ = 0;
				i_6_ = i_1_;
				i_5_ = i_1_ * i_2_ / i_3_;
				i_4_ = (i_0_ - i_5_) / 2;
			}
			((Class424) this).aClass161_4990.method2597(i_4_, i_7_, i_5_, i_6_);
		}
	}

	public void method103() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -102191745);
	}

	public boolean method297(int i) {
		return ((Class424) this).aClass248_4992.method3383(((((Class424) this).aClass311_4991.anInt3664) * 1500585849), 2133894980);
	}

	public void method149() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -1944783814);
	}

	public void method298() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -1628061183);
	}

	public void method38() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -1438436086);
	}

	public void method299(short i) {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -874769164);
	}

	public void method110() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -109965440);
	}

	public void method112() {
		((Class424) this).aClass161_4990 = Class505.method6030(((Class424) this).aClass248_4992, 1500585849 * (((Class424) this).aClass311_4991.anInt3664), -570524670);
	}

	public boolean method301() {
		return ((Class424) this).aClass248_4992.method3383(((((Class424) this).aClass311_4991.anInt3664) * 1500585849), -1028168893);
	}

	public void method302(boolean bool) {
		if (bool) {
			int i = ((Class269.anInt2861 * 1960824389 > client.anInt8724 * -507276561) ? Class269.anInt2861 * 1960824389 : -507276561 * client.anInt8724);
			int i_8_ = ((Class584.anInt7739 * -530390519 > client.anInt8725 * -199235591) ? -530390519 * Class584.anInt7739 : -199235591 * client.anInt8725);
			int i_9_ = ((Class424) this).aClass161_4990.method45();
			int i_10_ = ((Class424) this).aClass161_4990.method2589();
			int i_11_ = 0;
			int i_12_ = i;
			int i_13_ = i_10_ * i / i_9_;
			int i_14_ = (i_8_ - i_13_) / 2;
			if (i_13_ > i_8_) {
				i_14_ = 0;
				i_13_ = i_8_;
				i_12_ = i_8_ * i_9_ / i_10_;
				i_11_ = (i - i_12_) / 2;
			}
			((Class424) this).aClass161_4990.method2597(i_11_, i_14_, i_12_, i_13_);
		}
	}

	public void method303(boolean bool) {
		if (bool) {
			int i = ((Class269.anInt2861 * 1960824389 > client.anInt8724 * -507276561) ? Class269.anInt2861 * 1960824389 : -507276561 * client.anInt8724);
			int i_15_ = ((Class584.anInt7739 * -530390519 > client.anInt8725 * -199235591) ? -530390519 * Class584.anInt7739 : -199235591 * client.anInt8725);
			int i_16_ = ((Class424) this).aClass161_4990.method45();
			int i_17_ = ((Class424) this).aClass161_4990.method2589();
			int i_18_ = 0;
			int i_19_ = i;
			int i_20_ = i_17_ * i / i_16_;
			int i_21_ = (i_15_ - i_20_) / 2;
			if (i_20_ > i_15_) {
				i_21_ = 0;
				i_20_ = i_15_;
				i_19_ = i_15_ * i_16_ / i_17_;
				i_18_ = (i - i_19_) / 2;
			}
			((Class424) this).aClass161_4990.method2597(i_18_, i_21_, i_19_, i_20_);
		}
	}

	static void method5171(boolean bool, int i) {
		Class190.aString2235 = Class190.aString2235.trim();
		Class190.anInt2236 = 0;
		if (Class190.aString2235.length() == 0)
			Class190.anInt2237 = 0;
		else {
			Class118.method2154(new StringBuilder().append("--> ").append(Class190.aString2235).toString(), 1192178643);
			Class266.method3632(Class190.aString2235, false, bool, -1655281180);
			if (!bool) {
				Class190.anInt2237 = 0;
				Class190.aString2235 = "";
			} else
				Class190.anInt2237 = Class190.aString2235.length() * -911481991;
		}
	}

	static final void method5172(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		Class572_Sub12_Sub1 class572_sub12_sub1 = ((Class572_Sub12_Sub1) (Class639_Sub10.aClass639_Sub4_9534.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]), 2044518608)));
		int i_22_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_23_ = -1;
		for (int i_24_ = 0; i_24_ < class572_sub12_sub1.anInt11249 * -333063935; i_24_++) {
			if (i_22_ == class572_sub12_sub1.anIntArray11248[i_24_]) {
				i_23_ = class572_sub12_sub1.anIntArray11250[i_24_];
				break;
			}
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_23_;
	}

	static final void method5173(Cs2Executor class441, int i) {
		int i_25_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub10_9211), i_25_, 1530340337);
		client.aClass613_8605.method7302(460139690);
		Class623.method7443(-1829499776);
		client.aBool8854 = false;
	}
}
