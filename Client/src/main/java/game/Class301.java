package game;

/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class301 {
	public static Class301 aClass301_3490;
	public static Class301 aClass301_3491;
	public static Class301 aClass301_3492;
	public static Class301 aClass301_3493;
	public static Class301 aClass301_3494;
	public static Class301 aClass301_3495;
	public static Class301 aClass301_3496;
	public static Class301 aClass301_3497 = new Class301(7);
	public static Class301 REVMOVE_GROUND_ITEM;
	public static Class301 PROJECTILE;
	public static Class301 SEND_OBJECT;
	public static Class301 REMOVE_OBJECT;
	public static Class301 aClass301_3502;
	public static Class301 ADJUSTED_PROJECTILE;
	public static Class301 SEND_GROUND_ITEM;

	Class301(int i) {
		/* empty */
	}

	static {
		aClass301_3493 = new Class301(9);
		aClass301_3492 = new Class301(-1);
		aClass301_3495 = new Class301(5);
		aClass301_3494 = new Class301(10);
		SEND_OBJECT = new Class301(6);
		aClass301_3496 = new Class301(7);
		aClass301_3490 = new Class301(5);
		REVMOVE_GROUND_ITEM = new Class301(3);
		PROJECTILE = new Class301(21);
		aClass301_3491 = new Class301(8);
		REMOVE_OBJECT = new Class301(2);
		aClass301_3502 = new Class301(-1);
		ADJUSTED_PROJECTILE = new Class301(18);
		SEND_GROUND_ITEM = new Class301(7);
	}

	public static void method3994(byte i) {
		synchronized (Class19.aClass127_145) {
			Class19.aClass127_145.method2231((byte) -102);
		}
	}

	static final void method3995(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 731038298) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray763 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method3996(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1;
	}

	static final void method3997(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		Class550.method6533(i_0_, string, bool, 23336122);
	}

	static final void method3998(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		int i_5_ = 256;
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_1_, i_2_, i_4_, Class126.aClass126_1509.method2215(-1368328102), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_5_, i_3_);
	}

	static final boolean method3999(Class639_Sub16 class639_sub16, int i, int i_6_, int i_7_) {
		ObjectDefinitions class509 = (ObjectDefinitions) class639_sub16.getDefinition(i, 1219272990);
		if (i_6_ == 11)
			i_6_ = 10;
		if (i_6_ >= 5 && i_6_ <= 8)
			i_6_ = 4;
		return class509.method6042(i_6_, (byte) -96);
	}

	public static void method4000(int i, int i_8_) {
		synchronized (Class474.aClass127_5325) {
			Class474.aClass127_5325.method2235(i, 1529234639);
		}
		synchronized (Class474.aClass127_5323) {
			Class474.aClass127_5323.method2235(i, 1900224417);
		}
	}

	static final void method4001(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method848((short) 32767) ? 1 : 0;
	}
}
