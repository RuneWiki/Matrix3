package game;

/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.ArrayList;

public final class Class439 {
	static int anInt5082;
	public static Class127 aClass127_5083;
	static int anInt5084 = 0;
	static final int anInt5085 = 200000;
	static int[] anIntArray5086 = new int[3];
	static Class240[] aClass240Array5087;
	static boolean aBool5088;
	static String aString5089;
	static ArrayList anArrayList5090;
	static final int anInt5091 = 2000000;
	static int anInt5092;
	public static int anInt5093;

	static {
		aClass127_5083 = new Class127(4);
		aClass240Array5087 = new Class240[2];
		aBool5088 = false;
		aString5089 = null;
		anArrayList5090 = new ArrayList();
		anInt5082 = 0;
		anInt5092 = 0;
	}

	Class439() throws Throwable {
		throw new Error();
	}

	public static final void method5276(boolean bool, byte i) {
		Class195[] class195s = client.aClass195Array8592;
		for (int i_0_ = 0; i_0_ < class195s.length; i_0_++) {
			Class195 class195 = class195s[i_0_];
			try {
				class195.method2936((byte) -39);
			} catch (IOException ioexception) {
				/* empty */
			}
			class195.method2943(-1668735921);
		}
		Class203.method3010(16711935);
		Class269.method3656(-71545171);
		Class556.method6587(false, -1273571518);
		client.aClass613_8605.method7296(124070904);
		client.aClass613_8605.method7295((byte) -1);
		client.aClass613_8605.method7299(1928248706);
		Class537.method6386(1139548088);
		RSSocket.method7604(-1259126911);
		Class272_Sub2.method8875(true, 767234281);
		Class334.method4223((byte) -33);
		Class569.method6761(-232428494);
		client.anInt8728 = -1675423621;
		if (bool)
			Class463.method5478(4, 326931861);
		else {
			Class463.method5478(12, 381907670);
			try {
				Class277.method3718(VarTransmitLevel.anApplet8067, "loggedout", 974535694);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	public static void method5277(int i) {
		Class390.aMap4653.clear();
		Class390.aClass676_4654.method7964((byte) 116);
		Class390.aClass664_4656.method7841((short) -18348);
		Class390.anInt4655 = 0;
	}
}
