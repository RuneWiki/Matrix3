package game;

/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class268 implements Interface52 {
	int anInt2848;
	public static Class268 aClass268_2849;
	public static Class268 aClass268_2850 = new Class268(0);

	public int method45() {
		return ((Class268) this).anInt2848 * 1201430729;
	}

	public int method61() {
		return ((Class268) this).anInt2848 * 1201430729;
	}

	public int getId(int i) {
		return ((Class268) this).anInt2848 * 1201430729;
	}

	public int method143() {
		return ((Class268) this).anInt2848 * 1201430729;
	}

	static {
		aClass268_2849 = new Class268(1);
	}

	public int method43() {
		return ((Class268) this).anInt2848 * 1201430729;
	}

	Class268(int i) {
		((Class268) this).anInt2848 = i * 1266530681;
	}

	static final void method3654(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, boolean bool_4_, int i_5_) {
		if (!bool && (i_0_ < 512 || i_1_ < 512 || i_0_ > (client.aClass613_8605.method7347(199370968) - 2) * 512 || i_1_ > (client.aClass613_8605.method7278(277214477) - 2) * 512)) {
			float[] fs = client.aFloatArray8677;
			client.aFloatArray8677[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int i_6_ = Class314.method4072(i_0_, i_1_, i, -1959207623) - i_3_;
			client.aClass261_8582.method3568(Class272_Sub2.aClass106_9517.method1762());
			client.aClass261_8582.method3580((float) i_2_, 0.0F, 0.0F);
			Class272_Sub2.aClass106_9517.method1761(client.aClass261_8582);
			if (bool)
				Class272_Sub2.aClass106_9517.method2035((float) i_0_, (float) i_6_, (float) i_1_, (client.aFloatArray8677));
			else
				Class272_Sub2.aClass106_9517.method1792((float) i_0_, (float) i_6_, (float) i_1_, (client.aFloatArray8677));
			client.aClass261_8582.method3580((float) -i_2_, 0.0F, 0.0F);
			Class272_Sub2.aClass106_9517.method1761(client.aClass261_8582);
			if (!bool_4_) {
				client.aFloatArray8677[0] -= (float) (client.anInt8855 * 759890131);
				client.aFloatArray8677[1] -= (float) (client.anInt8590 * -393638955);
			}
		}
	}
}
