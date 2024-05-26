package game;

/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class514 {
	public static Class514 aClass514_5712;
	public static Class514 aClass514_5713;
	public static Class514 aClass514_5714 = new Class514(0);

	static {
		aClass514_5713 = new Class514(1);
		aClass514_5712 = new Class514(2);
	}

	Class514(int i) {
		/* empty */
	}

	public static int method6091(CharSequence charsequence, byte i) {
		int i_0_ = charsequence.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			char c = charsequence.charAt(i_2_);
			if (c <= '\u007f')
				i_1_++;
			else if (c <= '\u07ff')
				i_1_ += 2;
			else
				i_1_ += 3;
		}
		return i_1_;
	}

	static final void method6092(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_5_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		if (i_4_ == -1)
			throw new RuntimeException();
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_4_, 2088046992));
		if (class645.aClass283_8314.getId(-861080347) != i_3_)
			throw new RuntimeException();
		int[] is = class645.method7634(Integer.valueOf(i_5_), 1719214866);
		int i_6_ = 0;
		if (is != null)
			i_6_ = is.length;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_6_;
	}

	static final void method6093(int i) {
		if (-507155049 * client.anInt8790 != -1) {
			int i_7_ = Class26.aClass564_216.method6657((short) -9926);
			int i_8_ = Class26.aClass564_216.method6658((byte) -93);
			Class572_Sub13 class572_sub13 = (Class572_Sub13) client.aClass675_8745.method7932((byte) 50);
			if (class572_sub13 != null) {
				i_7_ = class572_sub13.method8417(1636759235);
				i_8_ = class572_sub13.method8425(-1749784373);
			}
			if (client.aClass73_8770 != null && client.aClass73_8771 == Class619.aClass73_8062) {
				client.aBool8775 = true;
				client.anInt8845 = 0;
				client.anInt8777 = 0;
				client.anInt8778 = Class269.anInt2861 * -2024907613;
				client.anInt8779 = -863298637 * client.anInt7739;
			}
			Class568.method6750(null, -507155049 * client.anInt8790, 0, 0, 1960824389 * Class269.anInt2861, client.anInt7739 * -530390519, 0, 0, i_7_, i_8_, -540452515);
			if (Class383.aClass73_4610 != null)
				Class323.method4124(i_7_, i_8_, (short) 255);
		}
	}
}
