package game;

/* Class456_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class456_Sub1_Sub2 extends Class456_Sub1 {
	public boolean aBool11498;
	public short aShort11499;
	public short aShort11500;
	byte aByte11501;
	public short aShort11502;
	public short aShort11503;
	int anInt11504 = 0;
	Class572_Sub36[] aClass572_Sub36Array11505 = new Class572_Sub36[4];

	boolean method8345(Class106 class106) {
		return (aClass523_9010.aClass533_5828.method6356(aByte9008, aShort11503, aShort11499, aShort11500, aShort11502, method8306(class106, (byte) -29)));
	}

	void method10469(byte i) {
		/* empty */
	}

	int method8352(Class572_Sub36[] class572_sub36s, byte i) {
		if (aBool5195) {
			((Class456_Sub1_Sub2) this).anInt11504 = 0;
			int i_0_ = Math.max(0, aShort11503);
			int i_1_ = Math.min((((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009]).length - 1, aShort11499);
			int i_2_ = Math.max(0, aShort11500);
			int i_3_ = Math.min((((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_0_]).length - 1, aShort11502);
			while_50_: for (/**/; i_0_ <= i_1_; i_0_++) {
				for (/**/; i_2_ <= i_3_; i_2_++) {
					long l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_0_][i_2_]);
					long l_4_ = 0L;
					while_49_: while (l_4_ <= 48L) {
						int i_5_ = (int) (l >>> (int) l_4_ & 0xffffL);
						if (i_5_ <= 0)
							break;
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[i_5_ - 1]);
						for (int i_6_ = 0; i_6_ < (-1847254213 * ((Class456_Sub1_Sub2) this).anInt11504); i_6_++) {
							if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_6_]) == class541.aClass572_Sub36_6086) {
								l_4_ += 16L;
								continue while_49_;
							}
						}
						((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[(((Class456_Sub1_Sub2) this).anInt11504 += 1202175475) * -1847254213 - 1] = class541.aClass572_Sub36_6086;
						if ((-1847254213 * ((Class456_Sub1_Sub2) this).anInt11504) == 4)
							break while_50_;
						l_4_ += 16L;
					}
				}
			}
			for (int i_7_ = ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213; i_7_ < 4; i_7_++)
				((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_7_] = null;
			if (((Class456_Sub1_Sub2) this).aByte11501 != 0) {
				int i_8_ = (aShort11503 - 308188993 * ((Class523) aClass523_9010).anInt5859);
				int i_9_ = (aShort11500 - ((Class523) aClass523_9010).anInt5825 * -123518785);
				short i_10_;
				int i_11_;
				int i_12_;
				short i_13_;
				if (1 == ((Class456_Sub1_Sub2) this).aByte11501) {
					if (i_9_ > i_8_) {
						i_10_ = aShort11503;
						i_11_ = aShort11500 - 1;
						i_12_ = 1 + aShort11503;
						i_13_ = aShort11500;
					} else {
						i_10_ = aShort11503;
						i_11_ = aShort11500 + 1;
						i_12_ = aShort11503 - 1;
						i_13_ = aShort11500;
					}
				} else if (i_9_ > -i_8_) {
					i_10_ = aShort11503;
					i_11_ = aShort11500 - 1;
					i_12_ = aShort11503 - 1;
					i_13_ = aShort11500;
				} else {
					i_10_ = aShort11503;
					i_11_ = 1 + aShort11500;
					i_12_ = aShort11503 + 1;
					i_13_ = aShort11500;
				}
				int i_14_ = 0;
				while_52_: for (/**/; (i_14_ < ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213); i_14_++) {
					long l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_10_][i_11_]);
					while (l != 0L) {
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_14_]) == class541.aClass572_Sub36_6086)
							continue while_52_;
					}
					l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_12_][i_13_]);
					while (l != 0L) {
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_14_]) == class541.aClass572_Sub36_6086)
							continue while_52_;
					}
					for (int i_15_ = i_14_; i_15_ < (((Class456_Sub1_Sub2) this).anInt11504 * -1847254213) - 1; i_15_++)
						((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_15_] = (((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_15_ + 1]);
					((Class456_Sub1_Sub2) this).anInt11504 -= 1202175475;
				}
			}
			aBool5195 = false;
		}
		for (int i_16_ = 0; i_16_ < ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213; i_16_++)
			class572_sub36s[i_16_] = ((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_16_];
		return ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213;
	}

	Class456_Sub1_Sub2(Class523 class523, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, byte i_25_) {
		super(class523);
		aByte9009 = (byte) i;
		aByte9008 = (byte) i_17_;
		method5401(new Class240((float) i_18_, (float) i_19_, (float) i_20_));
		aShort11503 = (short) i_21_;
		aShort11499 = (short) i_22_;
		aShort11500 = (short) i_23_;
		aShort11502 = (short) i_24_;
		aBool11498 = bool;
		((Class456_Sub1_Sub2) this).aByte11501 = i_25_;
		for (int i_26_ = 0; i_26_ < 4; i_26_++)
			((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_26_] = null;
	}

	boolean method8308(int i) {
		for (int i_27_ = aShort11503; i_27_ <= aShort11499; i_27_++) {
			for (int i_28_ = aShort11500; i_28_ <= aShort11502; i_28_++) {
				int i_29_ = (i_27_ - ((Class523) aClass523_9010).anInt5859 * 308188993 + ((Class523) aClass523_9010).anInt5865 * 131560129);
				if (i_29_ >= 0 && i_29_ < (((Class523) aClass523_9010).aBoolArrayArray5885).length) {
					int i_30_ = (i_28_ - -123518785 * ((Class523) aClass523_9010).anInt5825 + (131560129 * ((Class523) aClass523_9010).anInt5865));
					if (i_30_ >= 0 && i_30_ < (((Class523) aClass523_9010).aBoolArrayArray5885).length && (((Class523) aClass523_9010).aBoolArrayArray5885[i_29_][i_30_]))
						return true;
				}
			}
		}
		return false;
	}

	void method10470() {
		/* empty */
	}

	boolean method8307(Class106 class106, int i) {
		return (aClass523_9010.aClass533_5828.method6356(aByte9008, aShort11503, aShort11499, aShort11500, aShort11502, method8306(class106, (byte) -72)));
	}

	int method8346(Class572_Sub36[] class572_sub36s) {
		if (aBool5195) {
			((Class456_Sub1_Sub2) this).anInt11504 = 0;
			int i = Math.max(0, aShort11503);
			int i_31_ = Math.min((((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009]).length - 1, aShort11499);
			int i_32_ = Math.max(0, aShort11500);
			int i_33_ = Math.min((((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i]).length - 1, aShort11502);
			while_54_: for (/**/; i <= i_31_; i++) {
				for (/**/; i_32_ <= i_33_; i_32_++) {
					long l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i][i_32_]);
					long l_34_ = 0L;
					while_53_: while (l_34_ <= 48L) {
						int i_35_ = (int) (l >>> (int) l_34_ & 0xffffL);
						if (i_35_ <= 0)
							break;
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[i_35_ - 1]);
						for (int i_36_ = 0; i_36_ < -1847254213 * (((Class456_Sub1_Sub2) this).anInt11504); i_36_++) {
							if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_36_]) == class541.aClass572_Sub36_6086) {
								l_34_ += 16L;
								continue while_53_;
							}
						}
						((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[(((Class456_Sub1_Sub2) this).anInt11504 += 1202175475) * -1847254213 - 1] = class541.aClass572_Sub36_6086;
						if ((-1847254213 * ((Class456_Sub1_Sub2) this).anInt11504) == 4)
							break while_54_;
						l_34_ += 16L;
					}
				}
			}
			for (int i_37_ = ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213; i_37_ < 4; i_37_++)
				((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_37_] = null;
			if (((Class456_Sub1_Sub2) this).aByte11501 != 0) {
				int i_38_ = (aShort11503 - 308188993 * ((Class523) aClass523_9010).anInt5859);
				int i_39_ = (aShort11500 - ((Class523) aClass523_9010).anInt5825 * -123518785);
				short i_40_;
				int i_41_;
				int i_42_;
				short i_43_;
				if (1 == ((Class456_Sub1_Sub2) this).aByte11501) {
					if (i_39_ > i_38_) {
						i_40_ = aShort11503;
						i_41_ = aShort11500 - 1;
						i_42_ = 1 + aShort11503;
						i_43_ = aShort11500;
					} else {
						i_40_ = aShort11503;
						i_41_ = aShort11500 + 1;
						i_42_ = aShort11503 - 1;
						i_43_ = aShort11500;
					}
				} else if (i_39_ > -i_38_) {
					i_40_ = aShort11503;
					i_41_ = aShort11500 - 1;
					i_42_ = aShort11503 - 1;
					i_43_ = aShort11500;
				} else {
					i_40_ = aShort11503;
					i_41_ = 1 + aShort11500;
					i_42_ = aShort11503 + 1;
					i_43_ = aShort11500;
				}
				int i_44_ = 0;
				while_56_: for (/**/; (i_44_ < ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213); i_44_++) {
					long l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_40_][i_41_]);
					while (l != 0L) {
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_44_]) == class541.aClass572_Sub36_6086)
							continue while_56_;
					}
					l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i_42_][i_43_]);
					while (l != 0L) {
						Class541 class541 = (((Class523) aClass523_9010).aClass541Array5878[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if ((((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_44_]) == class541.aClass572_Sub36_6086)
							continue while_56_;
					}
					for (int i_45_ = i_44_; i_45_ < (((Class456_Sub1_Sub2) this).anInt11504 * -1847254213) - 1; i_45_++)
						((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_45_] = (((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i_45_ + 1]);
					((Class456_Sub1_Sub2) this).anInt11504 -= 1202175475;
				}
			}
			aBool5195 = false;
		}
		for (int i = 0; i < ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213; i++)
			class572_sub36s[i] = ((Class456_Sub1_Sub2) this).aClass572_Sub36Array11505[i];
		return ((Class456_Sub1_Sub2) this).anInt11504 * -1847254213;
	}

	void method10471() {
		/* empty */
	}

	boolean method8335(Class106 class106) {
		return (aClass523_9010.aClass533_5828.method6356(aByte9008, aShort11503, aShort11499, aShort11500, aShort11502, method8306(class106, (byte) -126)));
	}

	boolean method8318() {
		for (int i = aShort11503; i <= aShort11499; i++) {
			for (int i_46_ = aShort11500; i_46_ <= aShort11502; i_46_++) {
				int i_47_ = (i - ((Class523) aClass523_9010).anInt5859 * 308188993 + ((Class523) aClass523_9010).anInt5865 * 131560129);
				if (i_47_ >= 0 && i_47_ < (((Class523) aClass523_9010).aBoolArrayArray5885).length) {
					int i_48_ = (i_46_ - -123518785 * ((Class523) aClass523_9010).anInt5825 + (131560129 * ((Class523) aClass523_9010).anInt5865));
					if (i_48_ >= 0 && i_48_ < (((Class523) aClass523_9010).aBoolArrayArray5885).length && (((Class523) aClass523_9010).aBoolArrayArray5885[i_47_][i_48_]))
						return true;
				}
			}
		}
		return false;
	}

	static final void method10472(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aString847 = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
	}
}
