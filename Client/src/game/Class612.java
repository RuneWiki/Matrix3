package game;

/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class612 {
	static Class612 aClass612_7977 = new Class612(0, false);
	public static Class612 aClass612_7978 = new Class612(1, false);
	static Class612 aClass612_7979 = new Class612(2, false);
	static Class612 aClass612_7980 = new Class612(3, false);
	public boolean aBool7981;
	static Class612 aClass612_7982;
	static Class612 aClass612_7983;
	static Class612 aClass612_7984;
	static Class612 aClass612_7985 = new Class612(4, false);
	int anInt7986;
	static Class612 aClass612_7987;
	static int anInt7988;
	static int anInt7989;

	static {
		aClass612_7982 = new Class612(5, true);
		aClass612_7987 = new Class612(6, true);
		aClass612_7983 = new Class612(7, true);
		aClass612_7984 = new Class612(8, true);
	}

	Class612(int i, boolean bool) {
		((Class612) this).anInt7986 = i * 1025702903;
		aBool7981 = bool;
	}

	static final void method7275(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class240 class240 = Class240.method3316((float) i_0_, (float) i_1_, (float) i_2_);
		Class133_Sub1.aClass411_Sub1_9827.method4979(class240, (byte) 103);
		class240.method3261();
	}

	static final void method7276(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_3_, -1824674394)).anInt8174) * 532985983 == 1 ? 1 : 0;
	}
}
