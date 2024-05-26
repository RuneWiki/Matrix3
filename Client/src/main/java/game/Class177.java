package game;

/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class177 implements Interface52 {
	static Class177 aClass177_2100;
	static Class177 aClass177_2101;
	static Class177 aClass177_2102;
	static Class177 aClass177_2103;
	static Class177 aClass177_2104;
	static Class177 aClass177_2105;
	static Class177 aClass177_2106 = new Class177(2, 1);
	int anInt2107;
	int anInt2108;

	public int method143() {
		return -1813454079 * ((Class177) this).anInt2108;
	}

	public int method45() {
		return -1813454079 * ((Class177) this).anInt2108;
	}

	static {
		aClass177_2101 = new Class177(3, 2);
		aClass177_2100 = new Class177(1, 3);
		aClass177_2103 = new Class177(5, 4);
		aClass177_2104 = new Class177(6, 5);
		aClass177_2105 = new Class177(0, 6);
		aClass177_2102 = new Class177(4, 7);
	}

	public int getId(int i) {
		return -1813454079 * ((Class177) this).anInt2108;
	}

	Class177(int i, int i_0_) {
		((Class177) this).anInt2107 = i * -564452469;
		((Class177) this).anInt2108 = -362799871 * i_0_;
	}

	public int method43() {
		return -1813454079 * ((Class177) this).anInt2108;
	}

	public int method61() {
		return -1813454079 * ((Class177) this).anInt2108;
	}

	public static boolean method2762(String string, int i, String string_1_, int i_2_) {
		if (i == 0) {
			boolean bool;
			try {
				if (!Class590.aString7808.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_3_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_4_ = 0; i_4_ < string.length(); i_4_++) {
					if (string_3_.indexOf(string.charAt(i_4_)) == -1)
						throw new Exception();
				}
				Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
				bool = true;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 1) {
			boolean bool;
			try {
				Object object = Class277.method3720(Class590.anApplet7809, string_1_, (new Object[] { new URL(Class590.anApplet7809.getCodeBase(), string).toString() }), 1462275123);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (2 == i) {
			boolean bool;
			try {
				Class590.anApplet7809.getAppletContext().showDocument(new URL(Class590.anApplet7809.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class277.method3718(Class590.anApplet7809, "loggedout", 974535694);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				Class590.anApplet7809.getAppletContext().showDocument(new URL(Class590.anApplet7809.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static final void method2763(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) 6409);
		Class645.method7647(class73, class441, -1958112823);
	}

	static final void method2764(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (Class619.method7419(Class502.method6006((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1198303205), Class594.aClass435_7823.getId(-2072510155), -1830245962));
	}

	static void method2765(int i) {
		synchronized (Class19.aClass127_145) {
			Class19.aClass127_145.method2234((byte) -10);
		}
	}

	static boolean method2766(int i, short i_6_) {
		return i == 9 || 7 == i || i == 18 || i == 3 || i == 10;
	}
}
