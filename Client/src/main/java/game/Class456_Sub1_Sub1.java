package game;

/* Class456_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class456_Sub1_Sub1 extends Class456_Sub1 {
	int anInt11273 = 0;
	Class572_Sub36[] aClass572_Sub36Array11274 = new Class572_Sub36[4];
	public short aShort11275;

	boolean method8308(int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(131560129 * ((Class523) aClass523_9010).anInt5865 + (((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - 308188993 * ((Class523) aClass523_9010).anInt5859))][(((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5825 * -123518785 + 131560129 * ((Class523) aClass523_9010).anInt5865)]);
	}

	boolean method8345(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6368(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858)));
	}

	boolean method8307(Class106 class106, int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6368(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858)));
	}

	Class456_Sub1_Sub1(Class523 class523, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(class523);
		aByte9009 = (byte) i_2_;
		aByte9008 = (byte) i_3_;
		aShort11275 = (short) i_4_;
		method5401(new Class240((float) i, (float) i_0_, (float) i_1_));
		for (int i_5_ = 0; i_5_ < 4; i_5_++)
			((Class456_Sub1_Sub1) this).aClass572_Sub36Array11274[i_5_] = null;
	}

	int method8346(Class572_Sub36[] class572_sub36s) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			((Class456_Sub1_Sub1) this).anInt11273 = method8311(((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825), (((Class456_Sub1_Sub1) this).aClass572_Sub36Array11274), (short) 11480) * -1622708133;
			aBool5195 = false;
		}
		for (int i = 0; i < ((Class456_Sub1_Sub1) this).anInt11273 * -1008189485; i++)
			class572_sub36s[i] = ((Class456_Sub1_Sub1) this).aClass572_Sub36Array11274[i];
		return -1008189485 * ((Class456_Sub1_Sub1) this).anInt11273;
	}

	int method8352(Class572_Sub36[] class572_sub36s, byte i) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			((Class456_Sub1_Sub1) this).anInt11273 = method8311(((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825), (((Class456_Sub1_Sub1) this).aClass572_Sub36Array11274), (short) 526) * -1622708133;
			aBool5195 = false;
		}
		for (int i_6_ = 0; i_6_ < ((Class456_Sub1_Sub1) this).anInt11273 * -1008189485; i_6_++)
			class572_sub36s[i_6_] = ((Class456_Sub1_Sub1) this).aClass572_Sub36Array11274[i_6_];
		return -1008189485 * ((Class456_Sub1_Sub1) this).anInt11273;
	}

	boolean method8335(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6368(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858)));
	}

	boolean method8318() {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(131560129 * ((Class523) aClass523_9010).anInt5865 + (((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - 308188993 * ((Class523) aClass523_9010).anInt5859))][(((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5825 * -123518785 + 131560129 * ((Class523) aClass523_9010).anInt5865)]);
	}

	static final void method10258(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -27815);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class51.method908(class73, class83, class441, (byte) -117);
	}
}
