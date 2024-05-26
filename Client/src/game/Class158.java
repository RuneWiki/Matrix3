package game;

/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class158 {
	Class106_Sub1 aClass106_Sub1_1768;
	Buffer aBuffer1769;

	void method2551(byte[] is, int i) {
		if (((Class158) this).aBuffer1769 == null || ((Class158) this).aBuffer1769.method42() < i)
			((Class158) this).aBuffer1769 = ((Class106_Sub1) ((Class158) this).aClass106_Sub1_1768).aNativeHeap10051.method772(i, false);
		((Class158) this).aBuffer1769.method100(is, 0, 0, i);
	}

	Class158(Class106_Sub1 class106_sub1, Buffer buffer) {
		((Class158) this).aClass106_Sub1_1768 = class106_sub1;
		((Class158) this).aBuffer1769 = buffer;
	}

	Class158(Class106_Sub1 class106_sub1, byte[] is, int i) {
		((Class158) this).aClass106_Sub1_1768 = class106_sub1;
		((Class158) this).aBuffer1769 = ((Class106_Sub1) ((Class158) this).aClass106_Sub1_1768).aNativeHeap10051.method772(i, false);
		if (is != null)
			((Class158) this).aBuffer1769.method100(is, 0, 0, i);
	}
}
