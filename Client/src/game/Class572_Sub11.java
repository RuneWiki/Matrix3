package game;

/* Class572_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub11 extends Class572 {
	public short aShort9091;

	public Class572_Sub11(short i) {
		aShort9091 = i;
	}

	public static void method8410(int i) {
		if (Class633.aBool8198) {
			if (-2034996635 * Class633.anInt8206 < Class488.anInt5454 * -302396515)
				Class633.anInt8206 = Class488.anInt5454 * -629838631;
			while (-2034996635 * Class633.anInt8206 < Class297.anInt3474 * 2041051721) {
				Class481_Sub1 class481_sub1 = Class505.method6029(-2034996635 * Class633.anInt8206, (byte) -109);
				if (class481_sub1 == null || -1 != 944028155 * class481_sub1.anInt8940)
					Class633.anInt8206 += 844576621;
				else {
					if (null == Class633.aClass461_8201)
						Class633.aClass461_8201 = client.aClass455_8759.method5379((class481_sub1.aString8938), -1943651101);
					int i_0_ = 633548015 * Class633.aClass461_8201.anInt5216;
					if (i_0_ == -1)
						break;
					class481_sub1.anInt8940 = i_0_ * -1905956557;
					Class633.anInt8206 += 844576621;
					Class633.aClass461_8201 = null;
				}
			}
		}
	}

	static final void method8411(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (null == Class534.aClass83Array5975[i_1_])
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (Class534.aClass83Array5975[i_1_].aClass73Array1081[i_2_].anInt863) * 863821067;
	}
}
