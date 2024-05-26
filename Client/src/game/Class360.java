package game;

/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class360 {
	Interface5 anInterface5_4428;
	Class106_Sub3 aClass106_Sub3_4429;
	Class127 aClass127_4430 = new Class127(10485760, 256);

	void method4443() {
		((Class360) this).aClass127_4430.method2235(5, 1632222048);
	}

	Interface43 method4444(MaterialInformation class101) {
		return method4445(class101, class101.anInt1338 * 1913535271);
	}

	Interface43 method4445(MaterialInformation class101, int i) {
		long l = (long) (i << 16 | class101.textureId * 811137757);
		Interface43 interface43 = (Interface43) ((Class360) this).aClass127_4430.method2246(l);
		if (interface43 != null)
			return interface43;
		if (!method4448(class101, i))
			return null;
		if (i == -1)
			i = class101.anInt1338 * 1913535271;
		Interface43 interface43_0_;
		if (!class101.aBool1341 || !((Class360) this).aClass106_Sub3_4429.method1786()) {
			int[] is;
			if (class101.aClass511_1342 != Class511.aClass511_5695 || !Class649.method7677(class101.effectId, 931945130))
				is = (((Class360) this).anInterface5_4428.method24(class101.textureId * 811137757, 0.7F, i, i, false, 1371302107));
			else
				is = (((Class360) this).anInterface5_4428.method23(class101.textureId * 811137757, 0.7F, i, i, true, -1958047749));
			interface43_0_ = ((Class360) this).aClass106_Sub3_4429.method9711(i, i, true, is);
		} else {
			float[] fs = (((Class360) this).anInterface5_4428.method31(class101.textureId * 811137757, 0.7F, i, i, false, -195973809));
			interface43_0_ = ((Class360) this).aClass106_Sub3_4429.method9633(Class171.aClass171_2071, i, i, true, fs);
		}
		interface43_0_.method253(class101.aByte1344 == 1, class101.aByte1345 == 1);
		((Class360) this).aClass127_4430.method2230(interface43_0_, l, i * i, 528495706);
		return interface43_0_;
	}

	void method4446() {
		((Class360) this).aClass127_4430.method2235(5, 2014697854);
	}

	void method4447() {
		((Class360) this).aClass127_4430.method2231((byte) -22);
	}

	boolean method4448(MaterialInformation class101, int i) {
		if (i == -1)
			i = class101.anInt1338 * 1913535271;
		if (!class101.aBool1341 || !((Class360) this).aClass106_Sub3_4429.method1786()) {
			if (class101.aClass511_1342 != Class511.aClass511_5695 || !Class649.method7677(class101.effectId, 1865356884))
				return (((Class360) this).anInterface5_4428.method25(class101.textureId * 811137757, Class514.aClass514_5713, 0.7F, i, i, false, 346332354));
			return (((Class360) this).anInterface5_4428.method25(class101.textureId * 811137757, Class514.aClass514_5714, 0.7F, i, i, true, 2130420931));
		}
		return (((Class360) this).anInterface5_4428.method25(class101.textureId * 811137757, Class514.aClass514_5712, 0.7F, i, i, false, -1612092517));
	}

	Class360(Class106_Sub3 class106_sub3, Interface5 interface5) {
		((Class360) this).aClass106_Sub3_4429 = class106_sub3;
		((Class360) this).anInterface5_4428 = interface5;
	}

	void method4449() {
		((Class360) this).aClass127_4430.method2231((byte) -1);
	}

	void method4450() {
		((Class360) this).aClass127_4430.method2231((byte) -125);
	}
}
