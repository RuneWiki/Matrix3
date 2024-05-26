package game;

/* Class591_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class591_Sub1 extends Class591 {
	String aString9179;
	int anInt9180 = (int) (Class69.method1067(-1789071085) / 1000L) * 1471939499;
	short aShort9181;

	Class591_Sub1(String string, int i) {
		((Class591_Sub1) this).aString9179 = string;
		((Class591_Sub1) this).aShort9181 = (short) i;
	}

	static final void method8602(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]);
		int i_4_ = 256;
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_0_, i_1_, i_3_, Class126.aClass126_1509.method2215(470713946), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_4_, i_2_);
	}

	static final void method8603(Cs2Executor class441, int i) {
		Class131.method2286(-1705608345);
	}

	static final void method8604(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_5_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class530_Sub1.getContainerItemId(i_5_, i_6_, false, (byte) 86);
	}
}
