package game;

/* Class104_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class104_Sub2 extends Class104 {
	public abstract int method9923(int i, int i_0_);

	public abstract int method9924();

	abstract void method9925(int i, int i_1_);

	abstract void method9926(int i, int i_2_);

	abstract void method9927(int i, int i_3_);

	abstract void method9928(int i, int i_4_);

	Class104_Sub2() {
		/* empty */
	}

	public abstract int method9929();

	public abstract int method9930(int i, int i_5_);

	public abstract int method9931(int i, int i_6_);

	public abstract int method9932(int i, int i_7_);

	static final void method9933(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8214(964961485) ? 1 : 0;
	}

	static String method9934(InterfaceDefinitions class73, int i, byte i_8_) {
		if (!client.method7992(class73).method8646(i, (byte) 106) && null == class73.anObjectArray776)
			return null;
		if (class73.aStringArray867 == null || class73.aStringArray867.length <= i || class73.aStringArray867[i] == null || class73.aStringArray867[i].trim().length() == 0) {
			if (client.aBool8763)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class73.aStringArray867[i];
	}

	public static String[] method9935(String string, char c, int i) {
		int i_9_ = Class562.method6636(string, c, -754915238);
		String[] strings = new String[i_9_ + 1];
		int i_10_ = 0;
		int i_11_ = 0;
		for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
			int i_13_;
			for (i_13_ = i_11_; string.charAt(i_13_) != c; i_13_++) {
				/* empty */
			}
			strings[i_10_++] = string.substring(i_11_, i_13_);
			i_11_ = 1 + i_13_;
		}
		strings[i_9_] = string.substring(i_11_);
		return strings;
	}

	static void method9936(Class572_Sub15_Sub2 class572_sub15_sub2, short i) {
		boolean bool = class572_sub15_sub2.readUnsignedByte(1494164620) == 1;
		if (bool) {
			boolean bool_14_ = false;
			int i_15_ = class572_sub15_sub2.method10390((byte) 29) << 24;
			i_15_ |= class572_sub15_sub2.method10390((byte) 105) << 16;
			i_15_ |= class572_sub15_sub2.method10390((byte) 126) << 8;
			i_15_ |= class572_sub15_sub2.method10390((byte) 40);
			Class494.aClass8_5490.method514((Class677.aLong8557 * 2130813622689909177L), i_15_, (byte) 27);
		}
	}
}
