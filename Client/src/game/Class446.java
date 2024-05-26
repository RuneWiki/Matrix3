package game;

/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class446 implements Interface53 {
	public void method308(int i, int i_0_, int i_1_) {
		int i_2_ = i >> 16;
		int i_3_ = i & 0xffff;
		synchronized (Class458.aQueue5202) {
			Class458.aQueue5202.add(Class398.method4767(i_2_, i_3_, i_0_, i_1_, 1264538632));
		}
	}

	public void method306(int i, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i >> 16;
		int i_8_ = i & 0xffff;
		synchronized (Class458.aQueue5202) {
			Class458.aQueue5202.add(Class398.method4767(i_7_, i_8_, i_4_, i_5_, 958995861));
		}
	}

	public void method310(int i, int i_9_, int i_10_) {
		int i_11_ = i >> 16;
		int i_12_ = i & 0xffff;
		synchronized (Class458.aQueue5202) {
			Class458.aQueue5202.add(Class398.method4767(i_11_, i_12_, i_9_, i_10_, 930674811));
		}
	}

	public void method307(boolean bool, int i) {
		/* empty */
	}

	public void method309(boolean bool) {
		/* empty */
	}

	public void method305(boolean bool) {
		/* empty */
	}

	public static int method5340(int i, int i_13_, int i_14_, int i_15_) {
		if (Class547_Sub1.anInt8987 * 448209883 < 100)
			return -2;
		int i_16_ = -2;
		int i_17_ = 2147483647;
		int i_18_ = i_13_ - Class547_Sub1.anInt6143;
		int i_19_ = i_14_ - Class547_Sub1.anInt6165;
		for (Class572_Sub19 class572_sub19 = ((Class572_Sub19) Class547_Sub1.aClass675_6149.method7932((byte) 50)); null != class572_sub19; class572_sub19 = (Class572_Sub19) Class547_Sub1.aClass675_6149.method7926(84286035)) {
			if (class572_sub19.anInt9142 * 295399623 == i) {
				int i_20_ = class572_sub19.anInt9140 * -1389911785;
				int i_21_ = 599105849 * class572_sub19.anInt9141;
				int i_22_ = (i_20_ + Class547_Sub1.anInt6143 << 14 | Class547_Sub1.anInt6165 + i_21_);
				int i_23_ = ((i_18_ - i_20_) * (i_18_ - i_20_) + (i_19_ - i_21_) * (i_19_ - i_21_));
				if (i_16_ < 0 || i_23_ < i_17_) {
					i_16_ = i_22_;
					i_17_ = i_23_;
				}
			}
		}
		return i_16_;
	}

	static final void method5341(Cs2Executor class441, byte i) {
		int i_24_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_24_, (short) 18672);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 449197009 * class73.anInt780;
	}
}
