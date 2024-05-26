package game;

/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class260 {
	public long method3563(byte i) {
		return System.nanoTime();
	}

	public Class260() {
		System.nanoTime();
	}

	public static String method3564(int i) {
		return Class91.aFile1236.getAbsolutePath();
	}

	static final void method3565(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (string != null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = string.length();
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static float method3566(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, int i_5_) {
		float f_6_ = 0.0F;
		float f_7_ = f_2_ - f;
		float f_8_ = f_3_ - f_0_;
		float f_9_ = f_4_ - f_1_;
		float f_10_ = 0.0F;
		float f_11_ = 0.0F;
		float f_12_ = 0.0F;
		Class523 class523 = client.aClass613_8605.method7285(1596056556);
		for (/**/; f_6_ < 1.1F; f_6_ += 0.1F) {
			float f_13_ = f_6_ * f_7_ + f;
			float f_14_ = f_0_ + f_6_ * f_8_;
			float f_15_ = f_9_ * f_6_ + f_1_;
			int i_16_ = (int) f_13_ >> 9;
			int i_17_ = (int) f_15_ >> 9;
			if (i_16_ > 0 && i_17_ > 0 && i_16_ < client.aClass613_8605.method7347(-1313231347) && i_17_ < client.aClass613_8605.method7278(277214477)) {
				int i_18_ = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009;
				if (i_18_ < 3 && ((client.aClass613_8605.method7287((byte) 29).aByteArrayArrayArray2909[1][i_16_][i_17_]) & 0x2) != 0)
					i_18_++;
				int i_19_ = class523.aClass174Array5838[i_18_].method2726((int) f_13_, (int) f_15_, 358769667);
				if ((float) i_19_ < f_14_) {
					if (i >= 2)
						return (f_6_ - 0.1F + method3566(f_10_, f_11_, f_12_, f_13_, f_14_, f_15_, i - 1, 1177776710) * 0.1F);
					return f_6_;
				}
			}
			f_10_ = f_13_;
			f_11_ = f_14_;
			f_12_ = f_15_;
		}
		return -1.0F;
	}
}
