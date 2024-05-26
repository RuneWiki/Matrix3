package game;

/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462 {
	static Class462 aClass462_5217;
	public static Class462 aClass462_5218;
	public static Class462 aClass462_5219;
	static Class462 aClass462_5220;
	public static Class462 aClass462_5221;
	public static Class462 aClass462_5222;
	public static Class462 aClass462_5223;
	public static Class462 aClass462_5224 = new Class462(1);
	public static Class462 aClass462_5225;
	static Class462 aClass462_5226;
	static Class462 aClass462_5227;
	static Class462 aClass462_5228;
	static Class462 aClass462_5229;
	static Class462 aClass462_5230;
	public static Class462 aClass462_5231;
	public int anInt5232;

	static {
		aClass462_5218 = new Class462(2);
		aClass462_5225 = new Class462(4);
		aClass462_5231 = new Class462(8);
		aClass462_5221 = new Class462(16);
		aClass462_5222 = new Class462(32);
		aClass462_5223 = new Class462(64);
		aClass462_5219 = new Class462(128);
		aClass462_5217 = new Class462(256);
		aClass462_5226 = new Class462(512);
		aClass462_5227 = new Class462(1024);
		aClass462_5228 = new Class462(2048);
		aClass462_5229 = new Class462(4096);
		aClass462_5230 = new Class462(8192);
		aClass462_5220 = new Class462(16384);
	}

	Class462(int i) {
		anInt5232 = 43790177 * i;
	}

	static final void method5473(Cs2Executor class441, byte i) {
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 16) != Class416.aClass416_4933)
			throw new RuntimeException();
		((Class658_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8923((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), (byte) 1);
	}

	public static void method5474(String string, int i, byte i_0_) {
		if (Class633.aClass641_8208 == null)
			Class633.aClass641_8208 = new RSSocket(true);
		Class633.aClass641_8208.address = string;
		Class633.aClass641_8208.id = -1002799573 * (1099 + i);
		Class633.aClass641_8208.port = -1352120000 + -984285601 * Class633.aClass641_8208.id;
		Class633.aClass641_8208.securePort = 974886224 + Class633.aClass641_8208.id * -172050845;
	}
}
