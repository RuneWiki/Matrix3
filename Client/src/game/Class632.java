package game;

/* Class632 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class632 {
	Class632() throws Throwable {
		throw new Error();
	}

	static final void method7548(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		UnderlayDefinition underlayDefinition;
		if (((Cs2Executor) class441).aBool5128)
			underlayDefinition = ((Cs2Executor) class441).aClass443_5112;
		else
			underlayDefinition = ((Cs2Executor) class441).aClass443_5126;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = underlayDefinition.method5285((((Cs2Executor) class441).entity.aClass83_11622), i_0_, -1, (byte) -99) ? 1 : 0;
	}
}
