package game;

/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class448 {
	static byte[][] aByteArrayArray5158;
	static int anInt5159 = 0;
	static int anInt5160;
	static byte[][] aByteArrayArray5161;
	static byte[][] aByteArrayArray5162;
	static int anInt5163 = 0;
	static int[] anIntArray5164;
	static Class668 aClass668_5165;

	public static synchronized byte[] method5350(int i, boolean bool, int i_0_) {
		if ((100 == i || i < 100 && bool) && anInt5159 * -27368725 > 0) {
			byte[] is = aByteArrayArray5161[(anInt5159 -= -220187197) * -27368725];
			aByteArrayArray5161[-27368725 * anInt5159] = null;
			return is;
		}
		if ((5000 == i || i < 5000 && bool) && anInt5163 * 659402417 > 0) {
			byte[] is = aByteArrayArray5162[(anInt5163 -= 1484380753) * 659402417];
			aByteArrayArray5162[anInt5163 * 659402417] = null;
			return is;
		}
		if ((i == 30000 || i < 30000 && bool) && anInt5160 * -1182203041 > 0) {
			byte[] is = aByteArrayArray5158[(anInt5160 -= 1646925983) * -1182203041];
			aByteArrayArray5158[anInt5160 * -1182203041] = null;
			return is;
		}
		if (null != Class130.aByteArrayArrayArray1533) {
			for (int i_1_ = 0; i_1_ < Class639_Sub5.anIntArray9531.length; i_1_++) {
				if ((i == Class639_Sub5.anIntArray9531[i_1_] || i < Class639_Sub5.anIntArray9531[i_1_] && bool) && anIntArray5164[i_1_] > 0) {
					byte[] is = (Class130.aByteArrayArrayArray1533[i_1_][--anIntArray5164[i_1_]]);
					Class130.aByteArrayArrayArray1533[i_1_][(anIntArray5164[i_1_])] = null;
					return is;
				}
			}
		}
		if (bool && null != Class639_Sub5.anIntArray9531) {
			for (int i_2_ = 0; i_2_ < Class639_Sub5.anIntArray9531.length; i_2_++) {
				if (i <= Class639_Sub5.anIntArray9531[i_2_] && (anIntArray5164[i_2_] < Class130.aByteArrayArrayArray1533[i_2_].length))
					return new byte[Class639_Sub5.anIntArray9531[i_2_]];
			}
		}
		return new byte[i];
	}

	public static synchronized byte[] method5351(int i, int i_3_) {
		return method5350(i, false, -2137190247);
	}

	Class448() throws Throwable {
		throw new Error();
	}

	static {
		anInt5160 = 0;
		aByteArrayArray5161 = new byte[1000][];
		aByteArrayArray5162 = new byte[250][];
		aByteArrayArray5158 = new byte[50][];
	}

	public static synchronized void method5352(byte[] is) {
		if (100 == is.length && -27368725 * anInt5159 < 1000)
			aByteArrayArray5161[(anInt5159 += -220187197) * -27368725 - 1] = is;
		else if (is.length == 5000 && 659402417 * anInt5163 < 250)
			aByteArrayArray5162[(anInt5163 += 1484380753) * 659402417 - 1] = is;
		else if (30000 == is.length && -1182203041 * anInt5160 < 50)
			aByteArrayArray5158[(anInt5160 += 1646925983) * -1182203041 - 1] = is;
		else if (null != Class130.aByteArrayArrayArray1533) {
			for (int i = 0; i < Class639_Sub5.anIntArray9531.length; i++) {
				if (is.length == Class639_Sub5.anIntArray9531[i] && (anIntArray5164[i] < Class130.aByteArrayArrayArray1533[i].length)) {
					Class130.aByteArrayArrayArray1533[i][anIntArray5164[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized byte[] method5353(int i) {
		return method5350(i, false, -1371394734);
	}

	public static synchronized void method5354(byte[] is) {
		if (100 == is.length && -27368725 * anInt5159 < 1000)
			aByteArrayArray5161[(anInt5159 += -220187197) * -27368725 - 1] = is;
		else if (is.length == 5000 && 659402417 * anInt5163 < 250)
			aByteArrayArray5162[(anInt5163 += 1484380753) * 659402417 - 1] = is;
		else if (30000 == is.length && -1182203041 * anInt5160 < 50)
			aByteArrayArray5158[(anInt5160 += 1646925983) * -1182203041 - 1] = is;
		else if (null != Class130.aByteArrayArrayArray1533) {
			for (int i = 0; i < Class639_Sub5.anIntArray9531.length; i++) {
				if (is.length == Class639_Sub5.anIntArray9531[i] && (anIntArray5164[i] < Class130.aByteArrayArrayArray1533[i].length)) {
					Class130.aByteArrayArrayArray1533[i][anIntArray5164[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized void method5355(byte[] is, byte i) {
		if (100 == is.length && -27368725 * anInt5159 < 1000)
			aByteArrayArray5161[(anInt5159 += -220187197) * -27368725 - 1] = is;
		else if (is.length == 5000 && 659402417 * anInt5163 < 250)
			aByteArrayArray5162[(anInt5163 += 1484380753) * 659402417 - 1] = is;
		else if (30000 == is.length && -1182203041 * anInt5160 < 50)
			aByteArrayArray5158[(anInt5160 += 1646925983) * -1182203041 - 1] = is;
		else if (null != Class130.aByteArrayArrayArray1533) {
			for (int i_4_ = 0; i_4_ < Class639_Sub5.anIntArray9531.length; i_4_++) {
				if (is.length == Class639_Sub5.anIntArray9531[i_4_] && (anIntArray5164[i_4_] < Class130.aByteArrayArrayArray1533[i_4_].length)) {
					Class130.aByteArrayArrayArray1533[i_4_][anIntArray5164[i_4_]++] = is;
					break;
				}
			}
		}
	}

	public static Class669 method5356(int i, int i_5_) {
		Class669[] class669s = Class276.method3716(-795792585);
		for (int i_6_ = 0; i_6_ < class669s.length; i_6_++) {
			Class669 class669 = class669s[i_6_];
			if (-1986278251 * class669.anInt8520 == i)
				return class669;
		}
		return null;
	}

	static final String method5357(int i, int i_7_) {
		String string = Integer.toString(i);
		for (int i_8_ = string.length() - 3; i_8_ > 0; i_8_ -= 3)
			string = new StringBuilder().append(string.substring(0, i_8_)).append(Class3.aString23).append(string.substring(i_8_)).toString();
		if (string.length() > 9)
			return new StringBuilder().append(" ").append(GraphicsDefinition.method7770(65408, (byte) -15)).append(string.substring(0, string.length() - 8)).append(Class279.aClass279_3048.method3758(Class594.aClass435_7823, 16711935)).append(" (").append(string).append(")").append(Class3.aString22).toString();
		if (string.length() > 6)
			return new StringBuilder().append(" ").append(GraphicsDefinition.method7770(16777215, (byte) -49)).append(string.substring(0, string.length() - 4)).append(Class279.aClass279_3093.method3758(Class594.aClass435_7823, 16711935)).append(" (").append(string).append(")").append(Class3.aString22).toString();
		return new StringBuilder().append(" ").append(GraphicsDefinition.method7770(16776960, (byte) 21)).append(string).append(Class3.aString22).toString();
	}

	static final void method5358(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub15 class572_sub12_sub15 = Class111.aClass244_1428.method3345(i_9_, 1183123442);
		if (null == class572_sub12_sub15.anIntArray11470)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub15.anIntArray11470.length;
	}

	static final void method5359(Cs2Executor class441, int i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_11_ = client.exchangeSlots[i_10_].method7007(63928265);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 2 == i_11_ ? 1 : 0;
	}

	static final void method5360(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aByte4286;
	}
}
