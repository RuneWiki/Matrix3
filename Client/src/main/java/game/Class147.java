package game;

/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	Class106_Sub1 aClass106_Sub1_1682;
	int anInt1683;
	Class148[] aClass148Array1684;
	int anInt1685;
	int anInt1686 = 0;
	Class137 aClass137_1687;
	Class148_Sub6 aClass148_Sub6_1688;

	boolean method2474(int i) {
		return ((Class147) this).aClass148Array1684[i].method2479();
	}

	boolean method2475(int i) {
		return ((Class147) this).aClass148Array1684[i].method2479();
	}

	Class147(Class106_Sub1 class106_sub1) {
		((Class147) this).anInt1683 = 0;
		((Class147) this).anInt1685 = 0;
		((Class147) this).aClass106_Sub1_1682 = class106_sub1;
		((Class147) this).aClass137_1687 = new Class137(class106_sub1);
		((Class147) this).aClass148Array1684 = new Class148[16];
		((Class147) this).aClass148Array1684[1] = new Class148_Sub5(class106_sub1);
		((Class147) this).aClass148Array1684[2] = new Class148_Sub2(class106_sub1, ((Class147) this).aClass137_1687);
		((Class147) this).aClass148Array1684[4] = new Class148_Sub4(class106_sub1, ((Class147) this).aClass137_1687);
		((Class147) this).aClass148Array1684[5] = new Class148_Sub9(class106_sub1, ((Class147) this).aClass137_1687);
		((Class147) this).aClass148Array1684[6] = new Class148_Sub3(class106_sub1);
		((Class147) this).aClass148Array1684[7] = new Class148_Sub1(class106_sub1);
		((Class147) this).aClass148Array1684[3] = ((Class147) this).aClass148_Sub6_1688 = new Class148_Sub6(class106_sub1);
		((Class147) this).aClass148Array1684[8] = new Class148_Sub7(class106_sub1, ((Class147) this).aClass137_1687);
		((Class147) this).aClass148Array1684[9] = new Class148_Sub8(class106_sub1, ((Class147) this).aClass137_1687);
		if (!((Class147) this).aClass148Array1684[8].method2479())
			((Class147) this).aClass148Array1684[8] = ((Class147) this).aClass148Array1684[4];
		if (!((Class147) this).aClass148Array1684[9].method2479())
			((Class147) this).aClass148Array1684[9] = ((Class147) this).aClass148Array1684[8];
	}

	boolean method2476(int i) {
		return ((Class147) this).aClass148Array1684[i].method2479();
	}

	void method2477(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= ((Class147) this).aClass106_Sub1_1682.method9380();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class147) this).anInt1685 != i) {
			if (((Class147) this).anInt1685 != 0)
				((Class147) this).aClass148Array1684[((Class147) this).anInt1685 & 0x7fffffff].method2483();
			if (i != 0) {
				((Class147) this).aClass148Array1684[i & 0x7fffffff].method2481(bool);
				((Class147) this).aClass148Array1684[i & 0x7fffffff].method2484(bool);
				((Class147) this).aClass148Array1684[i & 0x7fffffff].method2489(i_0_, i_1_);
			}
			((Class147) this).anInt1685 = i;
			((Class147) this).anInt1686 = i_0_;
			((Class147) this).anInt1683 = i_1_;
		} else if (((Class147) this).anInt1685 != 0) {
			((Class147) this).aClass148Array1684[((Class147) this).anInt1685 & 0x7fffffff].method2484(bool);
			if (((Class147) this).anInt1686 != i_0_ || ((Class147) this).anInt1683 != i_1_) {
				((Class147) this).aClass148Array1684[((Class147) this).anInt1685 & 0x7fffffff].method2489(i_0_, i_1_);
				((Class147) this).anInt1686 = i_0_;
				((Class147) this).anInt1683 = i_1_;
			}
		}
	}

	boolean method2478(Class155 class155, int i) {
		if (((Class147) this).anInt1685 == 0)
			return false;
		((Class147) this).aClass148Array1684[((Class147) this).anInt1685 & 0x7fffffff].method2486(class155, i);
		return true;
	}
}
