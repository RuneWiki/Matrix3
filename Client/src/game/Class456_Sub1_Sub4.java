package game;

/* Class456_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class456_Sub1_Sub4 extends Class456_Sub1 {
	static int[] anIntArray11510 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public static final int anInt11511 = 2;
	public static final int anInt11512 = 4;
	public static final int anInt11513 = 8;
	public static final int anInt11514 = 16;
	public static final int anInt11515 = 128;
	public static final int anInt11516 = 1;
	Class572_Sub36[] aClass572_Sub36Array11517;
	public static final int anInt11518 = 32;
	public short aShort11519;
	int anInt11520 = 0;
	public static final int anInt11521 = 64;

	int method8352(Class572_Sub36[] class572_sub36s, byte i) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			int i_0_ = ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825);
			int i_1_ = ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825);
			int i_2_ = 0;
			if (i_0_ == ((Class523) aClass523_9010).anInt5859 * 308188993)
				i_2_++;
			else if (308188993 * ((Class523) aClass523_9010).anInt5859 < i_0_)
				i_2_ += 2;
			if (i_1_ == -123518785 * ((Class523) aClass523_9010).anInt5825)
				i_2_ += 3;
			else if (-123518785 * ((Class523) aClass523_9010).anInt5825 > i_1_)
				i_2_ += 6;
			int i_3_ = anIntArray11510[i_2_];
			if (0 == (aShort11519 & i_3_)) {
				if (aShort11519 == 1 && i_0_ > 0)
					i_0_--;
				else if (4 == aShort11519 && i_0_ <= -1396185127 * aClass523_9010.anInt5833)
					i_0_++;
				else if (aShort11519 == 8 && i_1_ > 0)
					i_1_--;
				else if (aShort11519 == 2 && i_1_ <= -1519623925 * aClass523_9010.anInt5834)
					i_1_++;
				else if (aShort11519 == 16 && i_0_ > 0 && i_1_ <= -1519623925 * aClass523_9010.anInt5834) {
					i_0_--;
					i_1_++;
				} else if (aShort11519 == 32 && i_0_ <= -1396185127 * aClass523_9010.anInt5833 && i_1_ <= -1519623925 * aClass523_9010.anInt5834) {
					i_0_++;
					i_1_++;
				} else if (aShort11519 == 128 && i_0_ > 0 && i_1_ > 0) {
					i_0_--;
					i_1_--;
				} else if (64 == aShort11519 && i_0_ <= -1396185127 * aClass523_9010.anInt5833 && i_1_ > 0) {
					i_0_++;
					i_1_--;
				} else
					throw new RuntimeException("");
			}
			((Class456_Sub1_Sub4) this).anInt11520 = method8311(i_0_, i_1_, (((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517), (short) 30209) * 496696083;
			aBool5195 = false;
		}
		for (int i_4_ = 0; i_4_ < ((Class456_Sub1_Sub4) this).anInt11520 * -867301605; i_4_++)
			class572_sub36s[i_4_] = ((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517[i_4_];
		return ((Class456_Sub1_Sub4) this).anInt11520 * -867301605;
	}

	Class456_Sub1_Sub4(Class523 class523, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		super(class523);
		((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517 = new Class572_Sub36[4];
		aByte9009 = (byte) i_7_;
		aByte9008 = (byte) i_8_;
		aShort11519 = (short) i_9_;
		method5401(new Class240((float) i, (float) i_5_, (float) i_6_));
		for (int i_10_ = 0; i_10_ < 4; i_10_++)
			((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517[i_10_] = null;
	}

	boolean method8308(int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5859 * 308188993 + 131560129 * ((Class523) aClass523_9010).anInt5865)][(((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825) - -123518785 * ((Class523) aClass523_9010).anInt5825 + ((Class523) aClass523_9010).anInt5865 * 131560129)]);
	}

	boolean method8307(Class106 class106, int i) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6363(this, aByte9008, ((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858), ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825)));
	}

	int method8346(Class572_Sub36[] class572_sub36s) {
		if (aBool5195) {
			Class240 class240 = method5394().aClass240_2647;
			int i = ((int) class240.aFloat2653 >> aClass523_9010.anInt5858 * 406704825);
			int i_11_ = ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825);
			int i_12_ = 0;
			if (i == ((Class523) aClass523_9010).anInt5859 * 308188993)
				i_12_++;
			else if (308188993 * ((Class523) aClass523_9010).anInt5859 < i)
				i_12_ += 2;
			if (i_11_ == -123518785 * ((Class523) aClass523_9010).anInt5825)
				i_12_ += 3;
			else if (-123518785 * ((Class523) aClass523_9010).anInt5825 > i_11_)
				i_12_ += 6;
			int i_13_ = anIntArray11510[i_12_];
			if (0 == (aShort11519 & i_13_)) {
				if (aShort11519 == 1 && i > 0)
					i--;
				else if (4 == aShort11519 && i <= -1396185127 * aClass523_9010.anInt5833)
					i++;
				else if (aShort11519 == 8 && i_11_ > 0)
					i_11_--;
				else if (aShort11519 == 2 && i_11_ <= -1519623925 * aClass523_9010.anInt5834)
					i_11_++;
				else if (aShort11519 == 16 && i > 0 && i_11_ <= -1519623925 * aClass523_9010.anInt5834) {
					i--;
					i_11_++;
				} else if (aShort11519 == 32 && i <= -1396185127 * aClass523_9010.anInt5833 && (i_11_ <= -1519623925 * aClass523_9010.anInt5834)) {
					i++;
					i_11_++;
				} else if (aShort11519 == 128 && i > 0 && i_11_ > 0) {
					i--;
					i_11_--;
				} else if (64 == aShort11519 && i <= -1396185127 * aClass523_9010.anInt5833 && i_11_ > 0) {
					i++;
					i_11_--;
				} else
					throw new RuntimeException("");
			}
			((Class456_Sub1_Sub4) this).anInt11520 = method8311(i, i_11_, (((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517), (short) 30979) * 496696083;
			aBool5195 = false;
		}
		for (int i = 0; i < ((Class456_Sub1_Sub4) this).anInt11520 * -867301605; i++)
			class572_sub36s[i] = ((Class456_Sub1_Sub4) this).aClass572_Sub36Array11517[i];
		return ((Class456_Sub1_Sub4) this).anInt11520 * -867301605;
	}

	boolean method8345(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6363(this, aByte9008, ((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858), ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825)));
	}

	boolean method8335(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		return (aClass523_9010.aClass533_5828.method6363(this, aByte9008, ((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858), ((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825)));
	}

	boolean method8318() {
		Class240 class240 = method5394().aClass240_2647;
		return (((Class523) aClass523_9010).aBoolArrayArray5885[(((int) class240.aFloat2653 >> 406704825 * aClass523_9010.anInt5858) - ((Class523) aClass523_9010).anInt5859 * 308188993 + 131560129 * ((Class523) aClass523_9010).anInt5865)][(((int) class240.aFloat2657 >> aClass523_9010.anInt5858 * 406704825) - -123518785 * ((Class523) aClass523_9010).anInt5825 + ((Class523) aClass523_9010).anInt5865 * 131560129)]);
	}
}
