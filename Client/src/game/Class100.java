package game;

/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100 {
	public static int[] anIntArray1284;
	public static final int anInt1285 = 32;
	public static final int anInt1286 = 16;
	public static final int anInt1287 = 1;
	public static final int anInt1288 = 2;
	public static final int anInt1289 = 8191;
	public static final int anInt1290 = 64;
	public static int[] anIntArray1291 = { 3, 7, 15 };
	public static final int anInt1292 = 0;
	public static final int anInt1293 = 1023;
	public static final int anInt1294 = 16;
	public static final int anInt1295 = 0;
	public static final int anInt1296 = 8;
	public static final int anInt1297 = 2;
	public static Class616 aClass616_1298;

	static {
		anIntArray1284 = new int[] { 2047, 16383, 65535 };
	}

	Class100() throws Throwable {
		throw new Error();
	}

	static final void method1592(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -534004211) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray889 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method1593(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 220520282) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray831 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	public static int method1594(byte[] is, int i, int i_0_) {
		return Class543.method6446(is, 0, i, (byte) -57);
	}

	public static Class667 method1595(int i) {
		if (Class16.aClass667_132 == null)
			return Class667.aClass667_8503;
		return Class16.aClass667_132;
	}
}
