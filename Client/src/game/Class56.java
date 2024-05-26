package game;

/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56 implements Interface3 {
	Class46 this$0;
	Class116 aClass116_527;

	public void method17(Class49 class49) {
		class49.method859(((Class56) this).aClass116_527, 2128100533);
	}

	public void method15(Class49 class49, int i) {
		class49.method859(((Class56) this).aClass116_527, 2086711907);
	}

	public void method16(Class49 class49) {
		class49.method859(((Class56) this).aClass116_527, 2140201847);
	}

	Class56(Class46 class46, RSByteBuffer class572_sub15) {
		((Class56) this).this$0 = class46;
		boolean bool = class572_sub15.readUnsignedByte(1372683661) != 255;
		if (bool)
			class572_sub15.o -= 310393755;
		((Class56) this).aClass116_527 = new Class116(class572_sub15, bool, true);
	}

	public static int method995(int i) {
		if (!Class672.method7894((byte) -5))
			return 0;
		return Class520.anInt5786 * -1732728929;
	}

	static final void method996(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -12935);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class296.method3965(class73, class83, class441, -469223998);
	}

	static final void method997(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class438.method5275(class73, class83, class441, -86433512);
	}

	static final void method998(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class111.aClass244_1428.method3345(i_1_, -2105289773).anIntArray11470[i_2_]);
	}

	static final void method999(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1036765709 * class73.anInt906;
	}
}
