package game;

/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class589 {
	public static String aString7804;
	public static String aString7805;
	public static String aString7806;
	static String aString7807;

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString7805 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString7806 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString7807 = string.toLowerCase();
		aString7804 = String.format("%s (%s) [%s]", new Object[] { aString7805, aString7806, aString7807 });
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	Class589() throws Throwable {
		throw new Error();
	}

	static final void method6992(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt775 * -2139739529;
	}

	static final void method6993(byte i) {
		int i_0_ = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_1_]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				Class461.method5469(class456_sub1_sub2_sub3_sub2, false, 2026359301);
		}
	}

	static final void method6994(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		String string_2_ = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3685, client.aClass195_8632.aClass650_2340, -2126832319);
		class572_sub25.aRsByteBuffer.writeShort((ObjectDefinitions.method6069(string, -935308010) + ObjectDefinitions.method6069(string_2_, -2022211965)), -905669308);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -128);
		class572_sub25.aRsByteBuffer.writeString(string_2_, (byte) -101);
		client.aClass195_8632.method2929(class572_sub25, (byte) -93);
	}
}
