package game;

/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class449 {
	static char[] aCharArray5166;
	static int[] anIntArray5167;
	static char[] aCharArray5168 = new char[64];
	public static Class248 aClass248_5169;

	static {
		for (int i = 0; i < 26; i++)
			aCharArray5168[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5168[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5168[i] = (char) (i + 48 - 52);
		aCharArray5168[62] = '+';
		aCharArray5168[63] = '/';
		aCharArray5166 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray5166[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray5166[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5166[i] = (char) (i + 48 - 52);
		aCharArray5166[62] = '*';
		aCharArray5166[63] = '-';
		anIntArray5167 = new int[128];
		for (int i = 0; i < anIntArray5167.length; i++)
			anIntArray5167[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray5167[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray5167[i] = i - 97 + 26;
		for (int i = 48; i <= 57; i++)
			anIntArray5167[i] = i - 48 + 52;
		int[] is = anIntArray5167;
		anIntArray5167[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray5167;
		anIntArray5167[47] = 63;
		is_0_[45] = 63;
	}

	static String method5361(byte[] is, int i, int i_1_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_2_ = i; i_2_ < i + i_1_; i_2_ += 3) {
			int i_3_ = is[i_2_] & 0xff;
			stringbuilder.append(aCharArray5168[i_3_ >>> 2]);
			if (i_2_ < i_1_ - 1) {
				int i_4_ = is[1 + i_2_] & 0xff;
				stringbuilder.append(aCharArray5168[(i_3_ & 0x3) << 4 | i_4_ >>> 4]);
				if (i_2_ < i_1_ - 2) {
					int i_5_ = is[2 + i_2_] & 0xff;
					stringbuilder.append(aCharArray5168[(i_4_ & 0xf) << 2 | i_5_ >>> 6]).append(aCharArray5168[i_5_ & 0x3f]);
				} else
					stringbuilder.append(aCharArray5168[(i_4_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(aCharArray5168[(i_3_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	static String method5362(byte[] is, int i, int i_6_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_7_ = i; i_7_ < i + i_6_; i_7_ += 3) {
			int i_8_ = is[i_7_] & 0xff;
			stringbuilder.append(aCharArray5168[i_8_ >>> 2]);
			if (i_7_ < i_6_ - 1) {
				int i_9_ = is[1 + i_7_] & 0xff;
				stringbuilder.append(aCharArray5168[(i_8_ & 0x3) << 4 | i_9_ >>> 4]);
				if (i_7_ < i_6_ - 2) {
					int i_10_ = is[2 + i_7_] & 0xff;
					stringbuilder.append(aCharArray5168[(i_9_ & 0xf) << 2 | i_10_ >>> 6]).append(aCharArray5168[i_10_ & 0x3f]);
				} else
					stringbuilder.append(aCharArray5168[(i_9_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(aCharArray5168[(i_8_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	Class449() throws Throwable {
		throw new Error();
	}

	static final void method5363(Cs2Executor class441, byte i) {
		int i_11_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub11_9219.method7863(i_11_, 1871815107);
	}
}
