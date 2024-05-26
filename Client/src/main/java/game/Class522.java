package game;

/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class522 {
	Class522() throws Throwable {
		throw new Error();
	}

	public static int method6220(int i, int i_0_) {
		int i_1_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_1_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_1_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_1_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_1_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_1_++;
		}
		return i_1_ + i;
	}

	static final void method6221(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		class73.anInt801 = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]) * -1149298601;
		class73.anInt789 = 443194189 * (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class555.method6575(class73, (short) 32432);
	}

	static final void method6222(Cs2Executor class441, int i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -11) != Class416.aClass416_4933)
			throw new RuntimeException();
		((Class658_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8930((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1686636880);
	}
}
