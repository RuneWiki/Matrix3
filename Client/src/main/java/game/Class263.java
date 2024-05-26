package game;

/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class263 {
	public static final int anInt2811 = 16;
	public static final int anInt2812 = 17;
	public static final int anInt2813 = 8;
	public static final int anInt2814 = 5;
	public static final int anInt2815 = 9;
	public static final int anInt2816 = 15;
	public static final int anInt2817 = 2;
	public static final int anInt2818 = 14;
	public static final int anInt2819 = 10;
	public static final int anInt2820 = 11;
	public static final int anInt2821 = 12;
	public static final int anInt2822 = 1;
	public static final int anInt2823 = 3;
	public static final int anInt2824 = 4;
	public static final int anInt2825 = 13;
	public static final int anInt2826 = 6;
	public static final int anInt2827 = 19;
	public static final int anInt2828 = 0;
	public static final int anInt2829 = 18;
	public static final int anInt2830 = 7;

	Class263() throws Throwable {
		throw new Error();
	}

	static final void method3610(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 29046);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class388.method4692(class73, class83, class441, 2141946791);
	}

	static final void method3611(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1464023164);
		if (null != class572_sub12_sub5) {
			boolean bool = class572_sub12_sub5.method10290(i_1_ >> 28 & 0x3, i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff, Class439.anIntArray5086, (byte) 1);
			if (bool) {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[1];
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[2];
			} else {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
			}
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		}
	}

	static void method3612(int i, int i_2_, int i_3_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(1, (long) i);
		class572_sub12_sub11.method10338(1745748249);
		((GameTask) class572_sub12_sub11).p1 = i_2_ * 720886855;
	}

	public static float method3613(Class230 class230, byte i) {
		Class240 class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
		class240.method3288(class230);
		double d = 1.5707963267948966 - Math.acos((double) class240.aFloat2656);
		class240.method3261();
		return (float) d;
	}
}
