package game;

/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class518 {
	Class647 aClass647_5747;
	Class127 aClass127_5748 = new Class127(500);
	Class127 aClass127_5749 = new Class127(30);
	Class127 aClass127_5750 = new Class127(50);
	int anInt5751;
	String[] aStringArray5752;
	Class159[] aClass159Array5753 = new Class159[4];
	boolean aBool5754;

	void method6126(int i) {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2235(i, 1604047017);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2235(i, 1699825924);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2235(i, 1703178487);
		}
	}

	void method6127(boolean bool, byte i) {
		if (((Class518) this).aBool5754 != bool) {
			((Class518) this).aBool5754 = bool;
			method6129((byte) -26);
		}
	}

	void method6128(int i, int i_0_) {
		((Class518) this).anInt5751 = 1150671249 * i;
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2231((byte) -120);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2231((byte) -10);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2231((byte) -83);
		}
	}

	void method6129(byte i) {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2231((byte) -13);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2231((byte) -128);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2231((byte) -122);
		}
		((Class518) this).aClass159Array5753 = new Class159[4];
		((Class518) this).aClass647_5747 = new Class647(null, null);
	}

	void method6130(int i, byte i_1_) {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2235(i, 1857365248);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2235(i, 1894760681);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2235(i, 1965068772);
		}
	}

	abstract boolean method6131(int i);

	abstract boolean method6132(int i);

	abstract boolean method6133(int i, short i_2_);

	Class518(boolean bool, Class435 class435, Class437 class437) {
		((Class518) this).aClass647_5747 = new Class647(null, null);
		((Class518) this).aBool5754 = bool;
		if (Class437.aClass437_5072 == class437)
			((Class518) this).aStringArray5752 = (new String[] { null, null, null, null, null, Class279.aClass279_3058.method3758(class435, 16711935) });
		else
			((Class518) this).aStringArray5752 = new String[] { null, null, null, null, null, null };
	}

	abstract boolean method6134(int i);

	abstract boolean method6135(int i);

	abstract byte[] method6136(int i, int i_3_);

	abstract byte[] method6137(int i);

	void method6138(byte i) {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2234((byte) -102);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2234((byte) -17);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2234((byte) 52);
		}
	}

	void method6139() {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2231((byte) -85);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2231((byte) -119);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2231((byte) -121);
		}
		((Class518) this).aClass159Array5753 = new Class159[4];
		((Class518) this).aClass647_5747 = new Class647(null, null);
	}

	void method6140() {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2231((byte) -114);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2231((byte) -12);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2231((byte) -43);
		}
		((Class518) this).aClass159Array5753 = new Class159[4];
		((Class518) this).aClass647_5747 = new Class647(null, null);
	}

	void method6141(int i) {
		((Class518) this).anInt5751 = 1150671249 * i;
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2231((byte) -11);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2231((byte) -106);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2231((byte) -31);
		}
	}

	void method6142() {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2234((byte) -1);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2234((byte) -74);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2234((byte) -22);
		}
	}

	void method6143() {
		synchronized (((Class518) this).aClass127_5748) {
			((Class518) this).aClass127_5748.method2234((byte) -23);
		}
		synchronized (((Class518) this).aClass127_5749) {
			((Class518) this).aClass127_5749.method2234((byte) -55);
		}
		synchronized (((Class518) this).aClass127_5750) {
			((Class518) this).aClass127_5750.method2234((byte) 83);
		}
	}

	static final void method6144(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class115 class115 = Class221.aClass49_2607.method854(i_4_, 1493492562);
		if (class115.method2111((byte) -13) == null)
			class115.method2110(client.anInterface1_8558, (byte) -23);
		if (bool) {
			Class179_Sub2 class179_sub2 = ((Class179_Sub2) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i_5_, 2005648550));
			switch (1433734045 * class179_sub2.dataType.aClass609_3406.anInt7961) {
				case 1:
					((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = class115.method2111((byte) -52).method450(((class179_sub2.id) * 473591285), 923195830);
					break;
				default:
					((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = (class115.method2111((byte) -116).method134(class179_sub2.id * 473591285, (byte) 0));
					break;
				case 2:
					((Cs2Executor) class441).longStack[((((Cs2Executor) class441).longStackPtr += -879214973) * 1097105451) - 1] = class115.method2111((byte) -57).method438(((class179_sub2.id) * 473591285), (short) -4192);
			}
		} else {
			VarBitDefinition class429 = (VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i_5_, -885407746);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class429.method5218((class115.method2111((byte) -111).method450((class429.baseVar.id * 473591285), 923195830)), (byte) 62);
		}
	}

	static final void method6145(Cs2Executor class441, int i) {
		InterfaceDefinitions class73 = (((Cs2Executor) class441).entity.aClass83_11622.method1256((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), 86388298));
		class73.aClass73Array916 = null;
		class73.aClass73Array917 = null;
		Class555.method6575(class73, (short) 3318);
	}

	static final void method6146(int i, byte i_6_) {
		Class418.method5110((byte) -70);
		int i_7_ = (((Class179_Sub2) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i, -292814452)).anInt10734 * 470803421);
		if (0 != i_7_) {
			int i_8_ = (Class133_Sub23.playerVarsProvider.method73((VarDefinition) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i, 704645884), -1171275042));
			if (5 == i_7_)
				client.anInt8637 = i_8_ * -528431449;
			if (6 == i_7_)
				client.anInt8761 = i_8_ * -708500399;
		}
	}

	static final void method6147(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}
}
