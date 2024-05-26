package game;

/* Class658 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class658 {
	Class411 aClass411_8421;
	static boolean aBool8422;

	public abstract void method7733(float f);

	public abstract void method7734(float f, int i);

	public abstract boolean method7735(byte i);

	public abstract Class240 method7736(int i);

	public abstract void method7737(RSByteBuffer class572_sub15, int i);

	public abstract void method7738(float f);

	public abstract void method7739(Class403 class403, Class261 class261, int i, int i_0_, float f, byte i_1_);

	public abstract Class240 method7740();

	public abstract void method7741(float f);

	public abstract boolean method7742();

	public abstract boolean method7743();

	public abstract boolean method7744();

	public abstract Class240 method7745(int i);

	public abstract void method7746(Class403 class403, Class261 class261, int i, int i_2_, float f);

	Class658(Class411 class411) {
		((Class658) this).aClass411_8421 = class411;
	}

	public abstract void method7747(Class403 class403, Class261 class261, int i, int i_3_, float f);

	public abstract void method7748(Class403 class403, Class261 class261, int i, int i_4_, float f);

	public abstract Class240 method7749();

	public abstract void method7750(RSByteBuffer class572_sub15);

	public abstract void method7751(RSByteBuffer class572_sub15);

	public abstract Class240 method7752();

	public abstract Class240 method7753();

	public abstract Class240 method7754();

	static final void method7755(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(1684750741) == 1 ? 1 : 0;
	}

	static void method7756(Cs2Executor class441, byte i) {
		Class129.method2261(-2110845545);
		Class127.method2252(class441, (byte) 11);
	}

	public static String method7757(byte[] is, int i, int i_5_, int i_6_) {
		char[] cs = new char[i_5_];
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
			int i_9_ = is[i_8_ + i] & 0xff;
			if (0 != i_9_) {
				if (i_9_ >= 128 && i_9_ < 160) {
					int i_10_ = Class436.aCharArray5066[i_9_ - 128];
					if (0 == i_10_)
						i_10_ = 63;
					i_9_ = i_10_;
				}
				cs[i_7_++] = (char) i_9_;
			}
		}
		return new String(cs, 0, i_7_);
	}

	public static short method1823(int i, int i_11_) {
		int i_12_ = i >> 10 & 0x3f;
		int i_13_ = i >> 3 & 0x70;
		int i_14_ = i & 0x7f;
		i_13_ = i_14_ <= 64 ? i_14_ * i_13_ >> 7 : (127 - i_14_) * i_13_ >> 7;
		int i_15_ = i_14_ + i_13_;
		int i_16_;
		if (i_15_ != 0)
			i_16_ = (i_13_ << 8) / i_15_;
		else
			i_16_ = i_13_ << 1;
		int i_17_ = i_15_;
		return (short) (i_12_ << 10 | i_16_ >> 4 << 7 | i_17_);
	}

	static final void method7759(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class7.aString38 != null && Class7.aString38.equalsIgnoreCase(string))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}
