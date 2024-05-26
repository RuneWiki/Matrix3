package game;

/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class415 implements Interface72 {
	Class437 aClass437_4923;
	String[] aStringArray4924;
	Class248 aClass248_4925;
	Class127 aClass127_4926 = new Class127(50);
	Class127 aClass127_4927 = new Class127(5);
	int anInt4928;
	boolean aBool4929;

	Class415(boolean bool, Class248 class248, Class435 class435, Class437 class437) {
		((Class415) this).aBool4929 = bool;
		((Class415) this).aClass248_4925 = class248;
		((Class415) this).aClass437_4923 = class437;
		if (((Class415) this).aClass437_4923 == Class437.aClass437_5072)
			((Class415) this).aStringArray4924 = (new String[] { null, null, null, null, null, Class279.aClass279_3058.method3758(class435, 16711935) });
		else
			((Class415) this).aStringArray4924 = new String[] { null, null, null, null, null, null };
	}

	void method5087(boolean bool, int i) {
		if (((Class415) this).aBool4929 != bool) {
			((Class415) this).aBool4929 = bool;
			method5089(553177270);
		}
	}

	void method5088(boolean bool) {
		if (((Class415) this).aBool4929 != bool) {
			((Class415) this).aBool4929 = bool;
			method5089(502340507);
		}
	}

	void method5089(int i) {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2231((byte) -80);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2231((byte) -14);
		}
	}

	void method5090(int i, byte i_0_) {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2235(i, 1558387567);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2235(i, 1411720685);
		}
	}

	void method5091(int i, byte i_1_) {
		((Class415) this).anInt4928 = i * -805626107;
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2231((byte) -67);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2231((byte) -71);
		}
	}

	void method5092(int i) {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2234((byte) 13);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2234((byte) -9);
		}
	}

	void method5093(int i) {
		((Class415) this).anInt4928 = i * -805626107;
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2231((byte) -23);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2231((byte) -1);
		}
	}

	void method5094() {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2231((byte) -79);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2231((byte) -2);
		}
	}

	void method5095(int i) {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2235(i, 1652114500);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2235(i, 1674800490);
		}
	}

	void method5096(int i) {
		synchronized (((Class415) this).aClass127_4926) {
			((Class415) this).aClass127_4926.method2235(i, 1865078170);
		}
		synchronized (((Class415) this).aClass127_4927) {
			((Class415) this).aClass127_4927.method2235(i, 1664754272);
		}
	}

	static final void method5097(Cs2Executor class441, byte i) {
		throw new RuntimeException("");
	}

	static final void method5098(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.method4187(i_2_, i_3_, i_4_, (byte) -60);
	}
}
