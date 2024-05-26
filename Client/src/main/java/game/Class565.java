package game;

/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.MalformedURLException;
import java.net.URL;

public abstract class Class565 {
	Class127 aClass127_6358 = new Class127(20);
	Class248 aClass248_6359;
	public static Class639_Sub7 aClass639_Sub7_6360;
	public static short[] aShortArray6361;

	void method6685() {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2231((byte) -57);
		}
	}

	void method6686(int i) {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2231((byte) -37);
		}
	}

	void method6687(int i, int i_0_) {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2235(i, 2141943638);
		}
	}

	void method6688(short i) {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2234((byte) -68);
		}
	}

	void method6689() {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2231((byte) -39);
		}
	}

	Class565(Class248 class248) {
		((Class565) this).aClass248_6359 = class248;
	}

	void method6690() {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2231((byte) -121);
		}
	}

	void method6691(int i) {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2235(i, 1596460249);
		}
	}

	void method6692(int i) {
		synchronized (((Class565) this).aClass127_6358) {
			((Class565) this).aClass127_6358.method2235(i, 2113961862);
		}
	}

	static final void method6693(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt784 * -1942295757;
	}

	static final void method6694(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = 255;
		int i_5_ = 256;
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_1_, i_2_, i_4_, Class126.aClass126_1509.method2215(382808601), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_5_, i_3_);
	}

	static final void method6695(Cs2Executor class441, byte i) {
		throw new RuntimeException("");
	}

	static final void method6696(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(-483403748) == 1 ? 1 : 0;
	}

	public static final void method6697(int i) {
		Class380.aClass570_4594.method6765(-1042067865);
		for (int i_6_ = 0; i_6_ < 32; i_6_++)
			Class584.aLongArray7737[i_6_] = 0L;
		for (int i_7_ = 0; i_7_ < 32; i_7_++)
			Class584.aLongArray7738[i_7_] = 0L;
		Class584.anInt7749 = 0;
	}

	static boolean method6698(String string, byte i) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static void method6699(Entity class456_sub1_sub2_sub3, int[] is, int i, boolean bool, short i_8_) {
		if (class456_sub1_sub2_sub3.anIntArray11640 != null) {
			boolean bool_9_ = true;
			for (int i_10_ = 0; i_10_ < class456_sub1_sub2_sub3.anIntArray11640.length; i_10_++) {
				if (is[i_10_] != class456_sub1_sub2_sub3.anIntArray11640[i_10_]) {
					bool_9_ = false;
					break;
				}
			}
			Class663 class663 = class456_sub1_sub2_sub3.aClass663_11670;
			if (bool_9_ && class663.method7786(1637229935)) {
				AnimationDefinition class132 = class456_sub1_sub2_sub3.aClass663_11670.method7787(153948485);
				int i_11_ = class132.anInt1558 * -730435523;
				if (1 == i_11_)
					class663.method7805(i, (short) 256);
				if (i_11_ == 2)
					class663.method7831(1426582922);
			}
		}
		boolean bool_12_ = true;
		for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
			if (is[i_13_] != -1)
				bool_12_ = false;
			if (class456_sub1_sub2_sub3.anIntArray11640 == null || class456_sub1_sub2_sub3.anIntArray11640[i_13_] == -1 || ((((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(is[i_13_], 1209490694)).priority) * 1882694951 >= ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class456_sub1_sub2_sub3.anIntArray11640[i_13_], -1653065083))).priority * 1882694951)) {
				class456_sub1_sub2_sub3.anIntArray11640 = is;
				class456_sub1_sub2_sub3.aClass663_11670.method7827(i, -1600147130);
				if (bool)
					class456_sub1_sub2_sub3.anInt11663 = 1079727145 * class456_sub1_sub2_sub3.stepsCount;
			}
		}
		if (bool_12_) {
			class456_sub1_sub2_sub3.anIntArray11640 = is;
			class456_sub1_sub2_sub3.aClass663_11670.method7827(i, -1988601642);
			if (bool)
				class456_sub1_sub2_sub3.anInt11663 = class456_sub1_sub2_sub3.stepsCount * 1079727145;
		}
	}

	static String method6700(String string, boolean bool, int i) {
		String string_14_ = bool ? "https://" : "http://";
		if (Class434.aClass434_5045 == Class151.aClass434_1702)
			string = new StringBuilder().append(string).append("-wtrc").toString();
		else if (Class151.aClass434_1702 == Class434.aClass434_5043)
			string = new StringBuilder().append(string).append("-wtqa").toString();
		else if (Class151.aClass434_1702 == Class434.aClass434_5039)
			string = new StringBuilder().append(string).append("-wtwip").toString();
		else if (Class151.aClass434_1702 == Class434.aClass434_5038)
			string = new StringBuilder().append(string).append("-wti").toString();
		else if (Class434.aClass434_5048 == Class151.aClass434_1702)
			string = new StringBuilder().append(string).append("-demo").toString();
		else if (Class151.aClass434_1702 == Class434.aClass434_5047)
			string = "local";
		String string_15_ = "";
		if (null != client.aString8561)
			string_15_ = new StringBuilder().append("/p=").append(client.aString8561).toString();
		String string_16_ = new StringBuilder().append(client.aClass437_8705.aString5074).append(".com").toString();
		return new StringBuilder().append(string_14_).append(string).append(".").append(string_16_).append("/l=").append(Class594.aClass435_7823.anInt5061 * 1179461595).append("/a=").append(client.anInt8808 * -1421244803).append(string_15_).append("/").toString();
	}

	static final void method6701(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -29) != Class416.aClass416_4933)
			throw new RuntimeException();
		((Class658_Sub2) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8927((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]), (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]), (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]), -560314512);
	}
}
