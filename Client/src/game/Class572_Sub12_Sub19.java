package game;

/* Class572_Sub12_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub19 extends Class572_Sub12 {
	Class664 aClass664_11480;
	String aString11481;
	int anInt11482;

	boolean method10457(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		boolean bool = true;
		class572_sub12_sub10.method8412(724585842);
		Class572_Sub12_Sub10 class572_sub12_sub10_0_ = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) this).aClass664_11480.method7848(-1042067865));
		while (null != class572_sub12_sub10_0_) {
			if (Class245.method3348((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 * -44467871), (((Class572_Sub12_Sub10) class572_sub12_sub10_0_).anInt11402 * -44467871), 1309730970)) {
				VarTransmitLevel.method7437(class572_sub12_sub10, class572_sub12_sub10_0_, (byte) -98);
				((Class572_Sub12_Sub19) this).anInt11482 += -1898653721;
				return !bool;
			}
			class572_sub12_sub10_0_ = (Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) this).aClass664_11480.method7845(-1258000014);
			bool = false;
		}
		((Class572_Sub12_Sub19) this).aClass664_11480.method7842(class572_sub12_sub10, 1351261154);
		((Class572_Sub12_Sub19) this).anInt11482 += -1898653721;
		return bool;
	}

	int method10458(int i) {
		if (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489 != (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094))
			return -44467871 * (((Class572_Sub12_Sub10) (Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)).anInt11402);
		return -1;
	}

	boolean method10459(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		int i_1_ = method10458(-948440616);
		class572_sub12_sub10.method8412(724585842);
		((Class572_Sub12_Sub19) this).anInt11482 -= -1898653721;
		if (944917463 * ((Class572_Sub12_Sub19) this).anInt11482 == 0) {
			method6794((byte) 41);
			method8412(724585842);
			Class25.anInt173 -= -1155198607;
			Class25.aClass127_179.method2229(this, (8440972884689828221L * (((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11400)));
			return false;
		}
		return i_1_ != method10458(-1248600683);
	}

	Class572_Sub12_Sub19(String string) {
		((Class572_Sub12_Sub19) this).aString11481 = string;
		((Class572_Sub12_Sub19) this).aClass664_11480 = new Class664();
	}

	int method10460() {
		if (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489 != (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094))
			return -44467871 * (((Class572_Sub12_Sub10) (Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) this).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)).anInt11402);
		return -1;
	}
}
