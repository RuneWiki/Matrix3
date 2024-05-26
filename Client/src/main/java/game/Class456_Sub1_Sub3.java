package game;

/* Class456_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class456_Sub1_Sub3 extends Class456_Sub1 {
	protected short aShort11506;
	protected short aShort11507;
	int anInt11508 = 0;
	Class572_Sub36[] aClass572_Sub36Array11509 = new Class572_Sub36[4];

	Class456_Sub1_Sub3(Class523 class523, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		super(class523);
		aByte9009 = (byte) i_2_;
		aByte9008 = (byte) i_3_;
		aShort11507 = (short) i_4_;
		aShort11506 = (short) i_5_;
		method5401(new Class240((float) i, (float) i_0_, (float) i_1_));
		for (int i_6_ = 0; i_6_ < 4; i_6_++)
			((Class456_Sub1_Sub3) this).aClass572_Sub36Array11509[i_6_] = null;
	}

	final void method8304() {
		throw new IllegalStateException();
	}

	int method8346(Class572_Sub36[] class572_sub36s) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			((Class456_Sub1_Sub3) this).anInt11508 = method8311(((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858), (((Class456_Sub1_Sub3) this).aClass572_Sub36Array11509), (short) 376) * -1162018105;
			aBool5195 = false;
		}
		for (int i = 0; i < 2033786615 * ((Class456_Sub1_Sub3) this).anInt11508; i++)
			class572_sub36s[i] = ((Class456_Sub1_Sub3) this).aClass572_Sub36Array11509[i];
		return 2033786615 * ((Class456_Sub1_Sub3) this).anInt11508;
	}

	boolean method8308(int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(131560129 * ((Class523) aClass523_9010).anInt5865 + (((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5859 * 308188993))][(((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5825 * -123518785 + 131560129 * ((Class523) aClass523_9010).anInt5865)]);
	}

	final boolean method8299(int i) {
		return false;
	}

	final boolean method8332() {
		return false;
	}

	final void method8303(int i) {
		throw new IllegalStateException();
	}

	int method8352(Class572_Sub36[] class572_sub36s, byte i) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			((Class456_Sub1_Sub3) this).anInt11508 = method8311(((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858), (((Class456_Sub1_Sub3) this).aClass572_Sub36Array11509), (short) 8675) * -1162018105;
			aBool5195 = false;
		}
		for (int i_7_ = 0; i_7_ < 2033786615 * ((Class456_Sub1_Sub3) this).anInt11508; i_7_++)
			class572_sub36s[i_7_] = ((Class456_Sub1_Sub3) this).aClass572_Sub36Array11509[i_7_];
		return 2033786615 * ((Class456_Sub1_Sub3) this).anInt11508;
	}

	final boolean method8333() {
		return false;
	}

	final boolean method8334() {
		return false;
	}

	final boolean method8347() {
		return false;
	}

	final boolean method8349() {
		return false;
	}

	final void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_8_, int i_9_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method8338() {
		throw new IllegalStateException();
	}

	final void method8343() {
		throw new IllegalStateException();
	}

	final void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_10_, int i_11_, boolean bool, int i_12_) {
		throw new IllegalStateException();
	}

	boolean method8307(Class106 class106, int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6355(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858), method8310((byte) -58)));
	}

	boolean method8345(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6355(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858), method8310((byte) -20)));
	}

	boolean method8335(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6355(aByte9008, ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825), ((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858), method8310((byte) 9)));
	}

	boolean method8318() {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(131560129 * ((Class523) aClass523_9010).anInt5865 + (((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5859 * 308188993))][(((int) class240.aFloat2657 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5825 * -123518785 + 131560129 * ((Class523) aClass523_9010).anInt5865)]);
	}
}
