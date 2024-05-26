package game;

/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class430 {
	int anInt5032;
	int anInt5033;
	Class497 aClass497_5034;

	int method5232(byte i) {
		return (client.anIntArray8713[((Class430) this).anInt5032 * -1391761209]);
	}

	public Interface65 method5233(int i) {
		Interface65 interface65 = method5234(89978852);
		if (null == interface65)
			return null;
		if (interface65.method136(-1701073873) != ((Class430) this).anInt5033 * -1766466183)
			return null;
		return interface65;
	}

	public Class430(Class497 class497, int i, int i_0_, int i_1_) {
		((Class430) this).aClass497_5034 = class497;
		((Class430) this).anInt5032 = 1874516215 * i;
		((Class430) this).anInt5033 = -331154231 * i_1_;
	}

	Interface65 method5234(int i) {
		int i_2_ = ((Class430) this).aClass497_5034.anInt5504 * -1080556115;
		Class497 class497 = client.aClass613_8605.method7280((byte) -9);
		int i_3_ = (-2109597897 * ((Class430) this).aClass497_5034.localX - class497.localX * -2109597897);
		int i_4_ = (417324155 * ((Class430) this).aClass497_5034.localY - class497.localY * 417324155);
		if (i_3_ < 0 || i_4_ < 0 || i_3_ >= client.aClass613_8605.method7347(1743209002) || i_4_ >= client.aClass613_8605.method7278(277214477) || client.aClass613_8605.method7285(1574362078) == null)
			return null;
		switch (method5232((byte) -22)) {
			case 0:
				return ((Interface65) client.aClass613_8605.method7285(1498505656).method6277(i_2_, i_3_, i_4_, -1973584047));
			default:
				return null;
			case 1:
				return ((Interface65) client.aClass613_8605.method7285(1902165557).method6251(i_2_, i_3_, i_4_, -1958784374));
			case 3:
				return (Interface65) client.aClass613_8605.method7285(2088511721).method6254(i_2_, i_3_, i_4_, -955368641);
			case 2:
				return ((Interface65) (client.aClass613_8605.method7285(2137776872).method6246(i_2_, i_3_, i_4_, client.anInterface62_8873, (byte) 76)));
		}
	}

	int method5235() {
		return (client.anIntArray8713[((Class430) this).anInt5032 * -1391761209]);
	}

	int method5236() {
		return (client.anIntArray8713[((Class430) this).anInt5032 * -1391761209]);
	}

	int method5237() {
		return (client.anIntArray8713[((Class430) this).anInt5032 * -1391761209]);
	}

	static final void method5238(Cs2Executor class441, short i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) 297);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class435.method5265(class73, class83, class441, 420066864);
	}

	static final void method5239(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1932382663);
		if (class572_sub12_sub5 != null) {
			boolean bool = class572_sub12_sub5.method10290(i_6_ >> 28 & 0x3, i_6_ >> 14 & 0x3fff, i_6_ & 0x3fff, Class439.anIntArray5086, (byte) 1);
			if (bool)
				Class323.method4125(Class439.anIntArray5086[1], Class439.anIntArray5086[2], (byte) 6);
		}
	}

	static void method5240(int i) {
		if (Class648.method7663(835742603 * client.anInt8580, -1042067865)) {
			if (client.aClass195_8632.method2933(-2002689227) == null)
				Class463.method5478(15, -400753647);
			else
				Class463.method5478(5, 676180341);
		} else if (835742603 * client.anInt8580 == 15 || 835742603 * client.anInt8580 == 2)
			Class463.method5478(12, 309490542);
		else if (4 == 835742603 * client.anInt8580)
			Class463.method5478(12, 1190848303);
	}
}
