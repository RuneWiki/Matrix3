package game;

/* Exception_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub4 extends Exception {
	Exception_Sub4() {
		/* empty */
	}

	public static Class375 method10189(RSByteBuffer class572_sub15, byte i) {
		Class375 class375 = Class616.method7376(class572_sub15, 1369304407);
		int i_0_ = class572_sub15.readInt(-24220438);
		int i_1_ = class572_sub15.readInt(516847165);
		int i_2_ = class572_sub15.readBigSmart((byte) 104);
		return new Class375_Sub2(class375.aClass320_4560, class375.aClass300_4556, class375.anInt4557 * -1706069299, class375.anInt4558 * -1354888403, -139432737 * class375.anInt4559, -670814997 * class375.anInt4562, -1271031675 * class375.anInt4561, class375.anInt4563 * -857233559, class375.anInt4555 * -983568713, i_0_, i_1_, i_2_);
	}

	static final void method10190(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_3_, -503370505));
		if (class631.anInt8171 * -1024768723 == -1 && -1999842301 * class631.anInt8173 >= 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class631.anInt8173 * -1999842301;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_3_;
	}
}
