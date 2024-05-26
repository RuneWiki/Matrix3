package game;

/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114 implements Interface2 {
	int anInt1439;
	int anInt1440;
	Class46 this$0;

	public void method17(Class49 class49) {
		if (-1 != ((Class114) this).anInt1440 * -1882349773) {
			try {
				class49.method864((byte) -15).method81((VarBitDefinition) (((Class46) ((Class114) this).this$0).anInterface1_463.method1((byte) -73).getDefinition(-1882349773 * ((Class114) this).anInt1440, 477052493)), ((Class114) this).anInt1439 * 255858499, 9550832);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method15(Class49 class49, int i) {
		if (-1 != ((Class114) this).anInt1440 * -1882349773) {
			try {
				class49.method864((byte) -82).method81((VarBitDefinition) (((Class46) ((Class114) this).this$0).anInterface1_463.method1((byte) 32).getDefinition(-1882349773 * ((Class114) this).anInt1440, -783422736)), ((Class114) this).anInt1439 * 255858499, 9550832);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method16(Class49 class49) {
		if (-1 != ((Class114) this).anInt1440 * -1882349773) {
			try {
				class49.method864((byte) 29).method81((VarBitDefinition) (((Class46) ((Class114) this).this$0).anInterface1_463.method1((byte) -92).getDefinition(-1882349773 * ((Class114) this).anInt1440, 593599461)), ((Class114) this).anInt1439 * 255858499, 9550832);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	Class114(Class46 class46, RSByteBuffer class572_sub15) {
		((Class114) this).this$0 = class46;
		int i = class572_sub15.readUnsignedShort(647518597);
		if (i != 65535) {
			((Class114) this).anInt1440 = -979667973 * i;
			((Class114) this).anInt1439 = class572_sub15.readInt(-212575611) * -894784149;
		} else {
			((Class114) this).anInt1440 = 979667973;
			((Class114) this).anInt1439 = 0;
		}
	}

	static final void method2094(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1450945799 * class73.anInt800;
	}

	static final void method2095(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method9109(-477232025) == 1 ? 1 : 0;
	}

	public static Class572_Sub12_Sub10 method2096(int i) {
		return Class580.aClass572_Sub12_Sub10_7702;
	}
}
