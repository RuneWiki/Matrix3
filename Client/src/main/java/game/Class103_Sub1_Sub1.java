package game;

/* Class103_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103_Sub1_Sub1 extends Class103_Sub1 {
	int anInt11154;
	Interface33 anInterface33_11155;
	static int[] anIntArray11156 = new int[6];
	Class106_Sub3 aClass106_Sub3_11157;
	static int[][] anIntArrayArray11158 = new int[6][];

	Class103_Sub1_Sub1(Class106_Sub3 class106_sub3, int i) {
		((Class103_Sub1_Sub1) this).aClass106_Sub3_11157 = class106_sub3;
		((Class103_Sub1_Sub1) this).anInt11154 = i;
	}

	Interface33 method9566() {
		if (((Class103_Sub1_Sub1) this).anInterface33_11155 == null) {
			Interface5 interface5 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.anInterface5_1408);
			MaterialInformation class101 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.aClass94_1396.getTexture(((Class103_Sub1_Sub1) this).anInt11154, 820866441));
			if (class101 == null)
				return null;
			if (class101.anIntArray1336 == null)
				return null;
			anIntArray11156[0] = class101.anIntArray1336[0];
			anIntArray11156[1] = class101.anIntArray1336[1];
			anIntArray11156[2] = class101.anIntArray1336[2];
			anIntArray11156[3] = class101.anIntArray1336[3];
			anIntArray11156[4] = class101.anIntArray1336[4];
			anIntArray11156[5] = class101.anIntArray1336[5];
			for (int i = 0; i < 6; i++) {
				if (anIntArray11156[i] < 0)
					return null;
				if (!interface5.method25(anIntArray11156[i], Class514.aClass514_5714, 1.0F, class101.anInt1338 * 1913535271, class101.anInt1338 * 1913535271, false, -1548491709))
					return null;
			}
			for (int i = 0; i < 6; i++) {
				anIntArrayArray11158[i] = interface5.method23(anIntArray11156[i], 1.0F, class101.anInt1338 * 1913535271, class101.anInt1338 * 1913535271, false, -1087512644);
				if (anIntArrayArray11158[i] == null || (anIntArrayArray11158[i].length != (class101.anInt1338 * 1913535271 * (class101.anInt1338 * 1913535271))))
					return null;
			}
			((Class103_Sub1_Sub1) this).anInterface33_11155 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.method9759(class101.anInt1338 * 1913535271, class101.aByte1362 != 0, anIntArrayArray11158));
		}
		return ((Class103_Sub1_Sub1) this).anInterface33_11155;
	}

	Interface33 method9567() {
		if (((Class103_Sub1_Sub1) this).anInterface33_11155 == null) {
			Interface5 interface5 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.anInterface5_1408);
			MaterialInformation class101 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.aClass94_1396.getTexture(((Class103_Sub1_Sub1) this).anInt11154, -409134951));
			if (class101 == null)
				return null;
			if (class101.anIntArray1336 == null)
				return null;
			anIntArray11156[0] = class101.anIntArray1336[0];
			anIntArray11156[1] = class101.anIntArray1336[1];
			anIntArray11156[2] = class101.anIntArray1336[2];
			anIntArray11156[3] = class101.anIntArray1336[3];
			anIntArray11156[4] = class101.anIntArray1336[4];
			anIntArray11156[5] = class101.anIntArray1336[5];
			for (int i = 0; i < 6; i++) {
				if (anIntArray11156[i] < 0)
					return null;
				if (!interface5.method25(anIntArray11156[i], Class514.aClass514_5714, 1.0F, class101.anInt1338 * 1913535271, class101.anInt1338 * 1913535271, false, 148283693))
					return null;
			}
			for (int i = 0; i < 6; i++) {
				anIntArrayArray11158[i] = interface5.method23(anIntArray11156[i], 1.0F, class101.anInt1338 * 1913535271, class101.anInt1338 * 1913535271, false, -1005396699);
				if (anIntArrayArray11158[i] == null || (anIntArrayArray11158[i].length != (class101.anInt1338 * 1913535271 * (class101.anInt1338 * 1913535271))))
					return null;
			}
			((Class103_Sub1_Sub1) this).anInterface33_11155 = (((Class103_Sub1_Sub1) this).aClass106_Sub3_11157.method9759(class101.anInt1338 * 1913535271, class101.aByte1362 != 0, anIntArrayArray11158));
		}
		return ((Class103_Sub1_Sub1) this).anInterface33_11155;
	}
}
