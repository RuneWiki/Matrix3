package game;

/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303 implements Interface38 {
	public int anInt3531;
	public Class320 aClass320_3532;
	public Class300 aClass300_3533;
	public int anInt3534;
	public int anInt3535;
	public static Class224_Sub1[] aClass224_Sub1Array3536;

	public Class310 method218() {
		return Class310.aClass310_3660;
	}

	public Class310 method215(byte i) {
		return Class310.aClass310_3660;
	}

	public Class310 method214() {
		return Class310.aClass310_3660;
	}

	public Class310 method216() {
		return Class310.aClass310_3660;
	}

	public Class310 method217() {
		return Class310.aClass310_3660;
	}

	Class303(int i, Class320 class320, Class300 class300, int i_0_, int i_1_) {
		anInt3535 = i * 1098616609;
		aClass320_3532 = class320;
		aClass300_3533 = class300;
		anInt3534 = -589134881 * i_0_;
		anInt3531 = i_1_ * -1554847467;
	}

	public static int method4003(String string, int i) {
		return Class572_Sub2.aTwitchTV8969.ChatSendMessage(string);
	}

	static void method4004(String string, int i) {
		client.aString8561 = string;
		if (Class554.method6557(-1568066155) != Class578.aClass578_7670) {
			try {
				String string_2_ = VarTransmitLevel.anApplet8067.getParameter(Class328.aClass328_4191.aString4200);
				String string_3_ = VarTransmitLevel.anApplet8067.getParameter(Class328.aClass328_4186.aString4200);
				String string_4_ = new StringBuilder().append(string_2_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_3_).toString();
				if (string.length() == 0)
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				else
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=").append(Class5.method489(Class69.method1067(-2000435103) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
				Class277.method3717(VarTransmitLevel.anApplet8067, new StringBuilder().append("document.cookie=\"").append(string_4_).append("\"").toString(), (byte) -71);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method4005(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class271_Sub1.method8368(class73, class441, (byte) 36);
	}
}
