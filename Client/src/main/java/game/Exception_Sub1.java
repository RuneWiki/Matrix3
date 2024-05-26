package game;

/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub1 extends Exception {
	int anInt11230;

	public int method10173() {
		return 1377937851 * ((Exception_Sub1) this).anInt11230;
	}

	Exception_Sub1() throws Throwable {
		throw new Error();
	}

	public int method10174() {
		return 1377937851 * ((Exception_Sub1) this).anInt11230;
	}

	public int method10175(short i) {
		return 1377937851 * ((Exception_Sub1) this).anInt11230;
	}

	static final void method10176(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, short i_6_) {
		if (0 == 1797623853 * client.anInt8646) {
			int i_7_ = 1657484935 * Class184.anInt2163;
			int[] is = Class184.anIntArray2154;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_8_]];
				if (null != class456_sub1_sub2_sub3_sub2)
					class456_sub1_sub2_sub3_sub2.method10539(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 510291431);
			}
			for (int i_9_ = 0; i_9_ < 765313669 * client.anInt8625; i_9_++) {
				int i_10_ = client.anIntArray8626[i_9_];
				LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_10_));
				if (null != class572_sub9)
					((Entity) class572_sub9.anObject9081).method10539(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 1073747904);
			}
		}
	}
}
