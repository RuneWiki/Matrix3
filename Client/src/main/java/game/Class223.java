package game;

/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223 implements Interface26 {
	boolean aBool2611;
	static Class572_Sub12_Sub10 aClass572_Sub12_Sub10_2612;
	String aString2613;

	void method3127() {
		((Class223) this).aBool2611 = true;
	}

	public int method136(int i) {
		if (((Class223) this).aBool2611)
			return 100;
		int i_0_;
		try {
			i_0_ = Class297.aClass567_3477.method6718(((Class223) this).aString2613, (byte) 0);
		} catch (Exception_Sub5 exception_sub5) {
			Class280.method3793(Class268.aClass268_2850, exception_sub5.aString11239, exception_sub5.anInt11240 * -1592646523, exception_sub5.getCause(), 1059805756);
			((Class223) this).aBool2611 = true;
			return 100;
		}
		return i_0_;
	}

	boolean method3128(int i) {
		return ((Class223) this).aBool2611;
	}

	void method3129(byte i) {
		((Class223) this).aBool2611 = true;
	}

	public Class258 method142(int i) {
		return Class258.aClass258_2783;
	}

	public int method143() {
		if (((Class223) this).aBool2611)
			return 100;
		int i;
		try {
			i = Class297.aClass567_3477.method6718(((Class223) this).aString2613, (byte) 0);
		} catch (Exception_Sub5 exception_sub5) {
			Class280.method3793(Class268.aClass268_2850, exception_sub5.aString11239, exception_sub5.anInt11240 * -1592646523, exception_sub5.getCause(), 682266626);
			((Class223) this).aBool2611 = true;
			return 100;
		}
		return i;
	}

	public Class258 method141() {
		return Class258.aClass258_2783;
	}

	Class223(String string) {
		((Class223) this).aString2613 = string;
	}

	public Class258 method145() {
		return Class258.aClass258_2783;
	}

	boolean method3130() {
		return ((Class223) this).aBool2611;
	}

	boolean method3131() {
		return ((Class223) this).aBool2611;
	}

	public Class258 method144() {
		return Class258.aClass258_2783;
	}

	void method3132() {
		((Class223) this).aBool2611 = true;
	}

	static final void method3133(Cs2Executor class441, byte i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 7856);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class578.method6831(class73, class83, class441, 483005737);
	}

	static final void method3134(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method3135(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_2_, 1325753066));
		if (1138984625 * class631.anInt8169 == -1 && class631.anInt8170 * -290938977 >= 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class631.anInt8170 * -290938977;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_2_;
	}
}
