package game;

/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class347 {
	Class339 aClass339_4386;
	Class248 aClass248_4387;
	Class248 aClass248_4388;
	static int anInt4389;

	public Class347(Class248 class248, Class248 class248_0_) {
		((Class347) this).aClass248_4387 = class248;
		((Class347) this).aClass248_4388 = class248_0_;
	}

	public Interface50 method4334(Interface38 interface38, int i) {
		if (null == interface38)
			return null;
		Class310 class310 = interface38.method215((byte) 4);
		if (class310 == Class310.aClass310_3656)
			return new Class333((Class292) interface38);
		if (class310 == Class310.aClass310_3653)
			return new Class341(method4335((byte) 50), (Class378) interface38);
		if (class310 == Class310.aClass310_3660)
			return new Class421(((Class347) this).aClass248_4387, (Class303) interface38);
		if (class310 == Class310.aClass310_3657)
			return new Class421_Sub1(((Class347) this).aClass248_4387, (Class303_Sub1) interface38);
		if (class310 == Class310.aClass310_3652)
			return new Class344_Sub2(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class375_Sub3) interface38);
		if (Class310.aClass310_3651 == class310)
			return new Class344_Sub1(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class375_Sub2) interface38);
		if (Class310.aClass310_3654 == class310)
			return new Class344_Sub3(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class375_Sub1) interface38);
		if (Class310.aClass310_3658 == class310)
			return new Class348(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class313) interface38);
		if (class310 == Class310.aClass310_3659)
			return new Class424(((Class347) this).aClass248_4387, (Class311) interface38);
		if (class310 == Class310.aClass310_3655)
			return new Class344_Sub3_Sub1(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class375_Sub1_Sub1) interface38);
		if (Class310.aClass310_3661 == class310)
			return new Class359(((Class347) this).aClass248_4387, ((Class347) this).aClass248_4388, (Class371) interface38);
		return null;
	}

	Class339 method4335(byte i) {
		if (((Class347) this).aClass339_4386 == null)
			((Class347) this).aClass339_4386 = new Class339();
		return ((Class347) this).aClass339_4386;
	}

	static final void method4336(Cs2Executor class441, short i) {
		boolean bool = false;
		String string = "";
		if (null != ((Cs2Executor) class441).aClass189_5123 && ((Cs2Executor) class441).aClass189_5123.method2853(-1866646469)) {
			File file = ((Cs2Executor) class441).aClass189_5123.method2852((byte) -65);
			if (null != file) {
				string = file.getPath();
				if (null == string)
					string = "";
			}
			bool = true;
			((Cs2Executor) class441).aClass189_5123 = null;
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = bool ? 1 : 0;
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}
}
