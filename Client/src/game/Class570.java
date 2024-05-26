package game;

/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class570 {
	static long aLong6399;

	abstract long method6763(byte i);

	abstract long method6764();

	abstract void method6765(int i);

	abstract long method6766();

	abstract int method6767(long l);

	Class570() {
		/* empty */
	}

	abstract void method6768();

	abstract long method6769(int i);

	abstract void method6770();

	abstract void method6771();

	final int method6772(long l) {
		long l_0_ = method6763((byte) -13);
		if (l_0_ > 0L)
			Class198.method2977(l_0_);
		return method6767(l);
	}

	abstract long method6773();

	abstract int method6774(long l);

	abstract int method6775(long l);

	abstract void method6776();

	final int method6777(long l) {
		long l_1_ = method6763((byte) 42);
		if (l_1_ > 0L)
			Class198.method2977(l_1_);
		return method6767(l);
	}

	static final void method6778(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 20112);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class128.method2257(class73, class83, class441, -1776256163);
	}
}
