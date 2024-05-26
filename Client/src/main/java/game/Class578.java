package game;

/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class578 {
	static Class578 aClass578_7668;
	static Class578 aClass578_7669;
	public static Class578 aClass578_7670 = new Class578();

	Class578() {
		/* empty */
	}

	static {
		aClass578_7669 = new Class578();
		aClass578_7668 = new Class578();
	}

	static final void method6831(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1830744058;
		class73.aBool777 = true;
		class73.anInt758 = Math.max(Math.min((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr * 1369304407)]), 2816), 0) * -1439552163;
		class73.anInt822 = Math.max(Math.min((((Cs2Executor) class441).intStack[(1369304407 * ((Cs2Executor) class441).intStackPtr + 1)]), 2816), 0) * -1087942931;
		class73.anInt792 = Math.max(Math.min((((Cs2Executor) class441).intStack[2 + (((Cs2Executor) class441).intStackPtr * 1369304407)]), 2816), 0) * 611287559;
		int i_0_ = Math.max(Math.min((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr * 1369304407 + 3)]), 255), 0);
		int i_1_ = Math.max(Math.min((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr * 1369304407 + 4)]), 255), 0);
		int i_2_ = Math.max(Math.min((((Cs2Executor) class441).intStack[(1369304407 * ((Cs2Executor) class441).intStackPtr + 5)]), 255), 0);
		class73.anInt825 = 1847460299 * (i_0_ << 16 | i_1_ << 8 | i_2_);
		class73.anInt904 = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 6]) * -947014997);
		class73.anInt922 = (1177819705 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 7]));
		class73.anInt824 = ((((Cs2Executor) class441).intStack[8 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * -546156717);
		class73.anInt839 = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 9]) * 1373593273);
		Class555.method6575(class73, (short) 6624);
	}

	static final void method6832(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class121.method2182(class73, class83, class441, (short) -12272);
	}

	static final void method6833(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
	}

	static void method6834(Class531 class531, int i) {
		class531.aClass456_Sub1_5929 = null;
		synchronized (Class531.aStack5931) {
			if (Class531.aStack5931.size() < 200)
				Class531.aStack5931.push(class531);
		}
	}
}
