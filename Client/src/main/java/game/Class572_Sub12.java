package game;

/* Class572_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12 extends Class572 {
	public Class572_Sub12 aClass572_Sub12_9092;
	public long aLong9093;
	public Class572_Sub12 aClass572_Sub12_9094;

	public void method8412(int i) {
		if (aClass572_Sub12_9092 != null) {
			aClass572_Sub12_9092.aClass572_Sub12_9094 = aClass572_Sub12_9094;
			aClass572_Sub12_9094.aClass572_Sub12_9092 = aClass572_Sub12_9092;
			aClass572_Sub12_9094 = null;
			aClass572_Sub12_9092 = null;
		}
	}

	static void method8413(Class106 class106, int i, int i_0_, InterfaceDefinitions class73, int i_1_) {
		int i_2_ = 127;
		int i_3_ = 7;
		for (int i_4_ = 63; i_4_ >= 0; i_4_--) {
			int i_5_ = (i_4_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_2_ & 0x7f;
			Class245.method3353(false, true, (byte) 95);
			int i_6_ = Class460.anIntArray4096[i_5_];
			Class472.method5585(false, true, (byte) -2);
			class106.method1725(i, ((63 - i_4_) * (1360982075 * class73.anInt765) >> 6) + i_0_, 669238293 * class73.anInt764, 1 + (1360982075 * class73.anInt765 >> 6), ~0xffffff | i_6_, 0);
		}
	}

	static final void method8414(Cs2Executor class441, byte i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -15046);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class465.method5493(class73, class83, class441, (short) -29597);
	}
}
