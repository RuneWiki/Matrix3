package game;

/* Class594 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class594 implements Interface69 {
	Class603 this$0;
	public static Class435 aClass435_7823;

	Class594(Class603 class603) {
		((Class594) this).this$0 = class603;
	}

	public byte[] method429(int i, short i_0_) {
		return ((Class603) ((Class594) this).this$0).anInterface58_7880.method325(i, -1423007090);
	}

	public byte[] method428(int i) {
		return ((Class603) ((Class594) this).this$0).anInterface58_7880.method325(i, -1093155894);
	}

	static final void method7023(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class308.method4030(class73, class83, class441, (byte) 9);
	}

	static final void method7024(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -363412087) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray885 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method7025(Cs2Executor class441, byte i) {
		Class497 class497 = new Class497();
		class497.method5935((Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]), (short) -17829);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class497.method5938(1021604845);
	}

	static final void method7026(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool919 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 14080);
	}
}
