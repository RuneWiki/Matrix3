package game;

/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	String aString1454;

	Class116(RSByteBuffer class572_sub15, boolean bool, boolean bool_0_) {
		if (bool)
			class572_sub15.method8476((byte) 4);
		if (bool_0_)
			((Class116) this).aString1454 = class572_sub15.method8557(-1788294626);
		else
			((Class116) this).aString1454 = null;
	}

	public String method2143(byte i) {
		return ((Class116) this).aString1454;
	}

	static final void method2144(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.aBool773 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
	}

	static final void method2145(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8738 ? 1 : 0;
	}

	static final void method2146(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Class456_Sub1) ((Cs2Executor) class441).anInterface65_5117).method8312(-1822343975);
	}

	static final void method2147(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) - 1);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, 46081428));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class631.method7535(i_2_, (byte) 88);
	}

	static final void method2148(Cs2Executor class441, byte i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) 8986);
		int i_4_ = -1;
		int i_5_ = -1;
		Class71 class71 = class73.method1099(Class272_Sub2.aClass106_9517, -2097547372);
		if (null != class71) {
			i_4_ = class71.anInt711 * -1355315821;
			i_5_ = class71.anInt710 * -1763697347;
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_4_;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_5_;
	}

	static final void method2149(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method849(-963634316);
	}
}
