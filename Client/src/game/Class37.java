package game;

/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37 {
	int[] anIntArray388;
	int anInt389;
	int[] anIntArray390 = null;
	int[] anIntArray391;
	int[] anIntArray392;
	Class79 aClass79_393;
	int anInt394;
	int[] anIntArray395;

	void method787(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method788(Class79 class79) {
		((Class37) this).aClass79_393 = class79;
		int i = ((Class37) this).aClass79_393.method1184();
		((Class37) this).aClass79_393.method1197(16);
		((Class37) this).anInt394 = (((Class37) this).aClass79_393.method1196() != 0 ? ((Class37) this).aClass79_393.method1197(4) + 1 : 1);
		if (((Class37) this).aClass79_393.method1196() != 0) {
			((Class37) this).anInt389 = ((Class37) this).aClass79_393.method1197(8) + 1;
			if (((Class37) this).anIntArray388 == null || (((Class37) this).anIntArray388.length != ((Class37) this).anInt389))
				((Class37) this).anIntArray388 = new int[((Class37) this).anInt389];
			else
				method787(((Class37) this).anIntArray388);
			if (((Class37) this).anIntArray395 == null || (((Class37) this).anIntArray395.length != ((Class37) this).anInt389))
				((Class37) this).anIntArray395 = new int[((Class37) this).anInt389];
			else
				method787(((Class37) this).anIntArray395);
			for (int i_0_ = 0; i_0_ < ((Class37) this).anInt389; i_0_++) {
				((Class37) this).anIntArray388[i_0_] = ((Class37) this).aClass79_393.method1197(method789(i - 1));
				((Class37) this).anIntArray395[i_0_] = ((Class37) this).aClass79_393.method1197(method789(i - 1));
			}
		} else
			((Class37) this).anInt389 = 0;
		((Class37) this).aClass79_393.method1197(2);
		if (((Class37) this).anInt394 > 1) {
			((Class37) this).anIntArray390 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				((Class37) this).anIntArray390[i_1_] = ((Class37) this).aClass79_393.method1197(4);
		}
		if (((Class37) this).anIntArray391 == null || (((Class37) this).anIntArray391.length != ((Class37) this).anInt394))
			((Class37) this).anIntArray391 = new int[((Class37) this).anInt394];
		else
			method787(((Class37) this).anIntArray391);
		if (((Class37) this).anIntArray392 == null || (((Class37) this).anIntArray392.length != ((Class37) this).anInt394))
			((Class37) this).anIntArray392 = new int[((Class37) this).anInt394];
		else
			method787(((Class37) this).anIntArray392);
		for (int i_2_ = 0; i_2_ < ((Class37) this).anInt394; i_2_++) {
			((Class37) this).aClass79_393.method1197(8);
			((Class37) this).anIntArray391[i_2_] = ((Class37) this).aClass79_393.method1197(8);
			((Class37) this).anIntArray392[i_2_] = ((Class37) this).aClass79_393.method1197(8);
		}
	}

	Class37() {
		/* empty */
	}

	int method789(int i) {
		int i_3_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_3_++;
		return i_3_;
	}
}
