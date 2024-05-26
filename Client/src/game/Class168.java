package game;

/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168 {
	Class106_Sub1 aClass106_Sub1_2053;
	Interface5 anInterface5_2054;
	Class127 aClass127_2055 = new Class127(10485760, 256);

	Class168(Class106_Sub1 class106_sub1, Interface5 interface5) {
		((Class168) this).aClass106_Sub1_2053 = class106_sub1;
		((Class168) this).anInterface5_2054 = interface5;
	}

	Class155_Sub4 method2684(MaterialInformation class101) {
		return method2685(class101, class101.anInt1338 * 1913535271);
	}

	Class155_Sub4 method2685(MaterialInformation class101, int i) {
		Class155_Sub4 class155_sub4 = ((Class155_Sub4) ((Class168) this).aClass127_2055.method2246((long) (class101.textureId * 811137757)));
		if (class155_sub4 != null)
			return class155_sub4;
		if (!method2686(class101, i))
			return null;
		if (i == -1)
			i = class101.anInt1338 * 1913535271;
		Class155_Sub4 class155_sub4_0_;
		if (!class101.aBool1341 || !((Class168) this).aClass106_Sub1_2053.method1786()) {
			int[] is;
			if (class101.aClass511_1342 != Class511.aClass511_5695 || !Class649.method7677(class101.effectId, 1162969921))
				is = (((Class168) this).anInterface5_2054.method24(class101.textureId * 811137757, 0.7F, i, i, false, 1371302107));
			else
				is = (((Class168) this).anInterface5_2054.method23(class101.textureId * 811137757, 0.7F, i, i, true, -1436081926));
			class155_sub4_0_ = new Class155_Sub4(((Class168) this).aClass106_Sub1_2053, 3553, i, i, class101.aByte1362 != 0, is, 0, 0, false);
		} else {
			float[] fs = (((Class168) this).anInterface5_2054.method31(class101.textureId * 811137757, 0.7F, i, i, false, -195973809));
			class155_sub4_0_ = new Class155_Sub4(((Class168) this).aClass106_Sub1_2053, 3553, Class171.aClass171_2071, Class88.aClass88_1220, i, i, class101.aByte1362 != 0, fs, Class171.aClass171_2071);
		}
		class155_sub4_0_.method9195(class101.aByte1344 == 1, class101.aByte1345 == 1);
		((Class168) this).aClass127_2055.method2230(class155_sub4_0_, (long) (class101.textureId * 811137757), i * i, 373678062);
		return class155_sub4_0_;
	}

	boolean method2686(MaterialInformation class101, int i) {
		if (i == -1)
			i = class101.anInt1338 * 1913535271;
		if (!class101.aBool1341 || !((Class168) this).aClass106_Sub1_2053.method1786()) {
			if (class101.aClass511_1342 != Class511.aClass511_5695 || !Class649.method7677(class101.effectId, 957741583))
				return (((Class168) this).anInterface5_2054.method25(class101.textureId * 811137757, Class514.aClass514_5713, 0.7F, i, i, false, -379556705));
			return (((Class168) this).anInterface5_2054.method25(class101.textureId * 811137757, Class514.aClass514_5714, 0.7F, i, i, true, 1627392649));
		}
		return (((Class168) this).anInterface5_2054.method25(class101.textureId * 811137757, Class514.aClass514_5712, 0.7F, i, i, false, 1005067694));
	}

	void method2687() {
		((Class168) this).aClass127_2055.method2235(5, 1615020111);
	}

	void method2688() {
		((Class168) this).aClass127_2055.method2231((byte) -38);
	}

	void method2689() {
		((Class168) this).aClass127_2055.method2235(5, 1785114793);
	}

	void method2690() {
		((Class168) this).aClass127_2055.method2235(5, 1610918243);
	}

	void method2691() {
		((Class168) this).aClass127_2055.method2231((byte) -96);
	}

	void method2692() {
		((Class168) this).aClass127_2055.method2231((byte) -21);
	}

	void method2693() {
		((Class168) this).aClass127_2055.method2231((byte) -124);
	}
}
