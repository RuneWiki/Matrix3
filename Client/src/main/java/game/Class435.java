package game;

/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Locale;

public class Class435 implements Interface52 {
	String aString5051;
	static Class435[] aClass435Array5052;
	public static Class435 aClass435_5053;
	public static Class435 aClass435_5054 = new Class435("EN", "en", "English", Class434.aClass434_5044, 0, "GB");
	static Class435 aClass435_5055;
	public static Class435 aClass435_5056;
	public static Class435 aClass435_5057;
	String aString5058;
	public static final int anInt5059 = 7;
	public static Class435 aClass435_5060;
	public int anInt5061;
	Locale aLocale5062;
	public static Class435 aClass435_5063 = new Class435("DE", "de", "German", Class434.aClass434_5044, 1, "DE");
	public static Class248 idx40;
	static int anInt5065;

	public String method5255() {
		return method5261((byte) 3).toLowerCase(Locale.ENGLISH);
	}

	Class435(String string, String string_0_, String string_1_, Class434 class434, int i, String string_2_) {
		((Class435) this).aString5051 = string;
		((Class435) this).aString5058 = string_0_;
		anInt5061 = i * -1888846765;
		if (null != string_2_)
			((Class435) this).aLocale5062 = new Locale(string_0_.substring(0, 2), string_2_);
		else
			((Class435) this).aLocale5062 = new Locale(string_0_.substring(0, 2));
	}

	public int method143() {
		return 1179461595 * anInt5061;
	}

	public int getId(int i) {
		return 1179461595 * anInt5061;
	}

	public Locale method5256(int i) {
		return ((Class435) this).aLocale5062;
	}

	public static Class435 method5257(int i, int i_3_) {
		if (i < 0 || i >= aClass435Array5052.length)
			return null;
		return aClass435Array5052[i];
	}

	static {
		aClass435_5053 = new Class435("FR", "fr", "French", Class434.aClass434_5044, 2, "FR");
		aClass435_5060 = new Class435("PT", "pt", "Portuguese", Class434.aClass434_5044, 3, "BR");
		aClass435_5055 = new Class435("NL", "nl", "Dutch", Class434.aClass434_5039, 4, "NL");
		aClass435_5056 = new Class435("ES", "es", "Spanish", Class434.aClass434_5039, 5, "ES");
		aClass435_5057 = new Class435("ES_MX", "es-mx", "Spanish (Latin American)", Class434.aClass434_5044, 6, "MX");
		Class435[] class435s = method5262(1876540418);
		aClass435Array5052 = new Class435[class435s.length];
		Class435[] class435s_4_ = class435s;
		for (int i = 0; i < class435s_4_.length; i++) {
			Class435 class435 = class435s_4_[i];
			if (null != aClass435Array5052[class435.anInt5061 * 1179461595])
				throw new IllegalStateException();
			aClass435Array5052[class435.anInt5061 * 1179461595] = class435;
		}
	}

	public static void method5258(long[] ls, int[] is, byte i) {
		Class343.method4300(ls, is, 0, ls.length - 1, -1741692888);
	}

	public int method43() {
		return 1179461595 * anInt5061;
	}

	public int method61() {
		return 1179461595 * anInt5061;
	}

	public String toString() {
		return method5261((byte) 3).toLowerCase(Locale.ENGLISH);
	}

	public String method5259() {
		return method5261((byte) 3).toLowerCase(Locale.ENGLISH);
	}

	String method5260() {
		return ((Class435) this).aString5058;
	}

	String method5261(byte i) {
		return ((Class435) this).aString5058;
	}

	public static Class435[] method5262(int i) {
		return new Class435[] { aClass435_5060, aClass435_5055, aClass435_5056, aClass435_5054, aClass435_5063, aClass435_5053, aClass435_5057 };
	}

	public int method45() {
		return 1179461595 * anInt5061;
	}

	public static Class106 method5263(int i, Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, int i_5_, int i_6_) {
		int i_7_ = 0;
		int i_8_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_7_ = dimension.width;
			i_8_ = dimension.height;
		}
		return Class106.method1888(i, canvas, mapSize, interface5, interface35, interface36, interface37, class248, i_5_, i_7_, i_8_, 625220759);
	}

	static void method5264(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class412.method5071(-136522880);
	}

	static final void method5265(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -483196944) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray900 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	public static boolean method5266(int i, byte i_9_) {
		return 1 == i || i == 18 || 4 == i;
	}

	static final void method5267(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt892 = -1922498699;
		class73.anInt803 = 903518299 * client.anInt8728;
		class73.anInt794 = 0;
		if (class73.activeComponent * -1665128073 == -1 && !class83.aBool1079)
			Class309.method4043(-1718435171 * class73.selfId, 997635259);
	}
}
