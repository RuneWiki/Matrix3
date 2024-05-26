package game;

/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26 {
	public String aString205;
	public String aString206;
	public int anInt207;
	public int anInt208;
	public String aString209;
	public int anInt210;
	public String aString211;
	public boolean aBool212;
	public boolean aBool213;
	public int anInt214;
	public static Class284 aClass284_215;
	public static Class564 aClass564_216;
	public static Class639_Sub18 aClass639_Sub18_217;

	Class26() {
		/* empty */
	}

	public static int method754(short i) {
		if (Class520.aTwitchEventLiveStreams5810 == null || (Class520.anInt5805 * 2049710447 >= Class520.aTwitchEventLiveStreams5810.streamCount - 1))
			return -1;
		return (Class520.anInt5805 += -1921292913) * 2049710447;
	}

	static final void method755(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		Class665_Sub5.method8155(class73, class83, class441, (bool ? Class68.aClass68_700 : Class68.aClass68_696), -1949292144);
	}

	static final void method756(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -19376677) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray724 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method757(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		i_0_--;
		if (null == class73.aStringArray867 || i_0_ >= class73.aStringArray867.length || null == class73.aStringArray867[i_0_])
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class73.aStringArray867[i_0_];
	}

	static final void method758(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class71.method1082(class73, class83, class441, (byte) 6);
	}
}
