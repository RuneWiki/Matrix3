package game;

/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class490 {
	String aString5464;
	int anInt5465;

	Class490() {
		/* empty */
	}

	static final void method5845(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -15074);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class539.method6402(class73, class83, true, 0, class441, (byte) -36);
	}

	static final void method5846(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 110);
	}

	static long method5847(CharSequence charsequence, int i) {
		long l = 0L;
		int i_1_ = charsequence.length();
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			l *= 37L;
			char c = charsequence.charAt(i_2_);
			if (c >= 'A' && c <= 'Z')
				l += (long) (c + '\001' - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) ('\001' + c - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static final void method5848(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_5_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class385.method4663(9, i_3_ << 16 | i_4_, i_5_, "", (byte) -114);
	}

	static void method5849(byte i) {
		Class108.aClass549_1426.method6523(-1067312834);
		Class26.aClass564_216.method6660((short) 31426);
		Class278_Sub1.aclient9503.method6894((byte) -69);
		client.aCanvas7745.setBackground(Color.black);
		client.anInt8753 = 2083756903;
		Class108.aClass549_1426 = Class191.method2891(client.aCanvas7745, (short) 18426);
		Class26.aClass564_216 = Class494.method5903(client.aCanvas7745, true, 780902634);
	}

	static final void method5850(Cs2Executor class441, byte i) {
		Class288.method3881(class441, (((Cs2Executor) class441).entity), -1782401028);
	}

	public static void method5851(int i, byte i_6_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(5, (long) i);
		class572_sub12_sub11.method10384(-2094590506);
	}

	static final void method5852(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub5_9248, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 1 : 0, 1833117391);
		Class623.method7443(-1829316103);
		client.aBool8854 = false;
	}
}
