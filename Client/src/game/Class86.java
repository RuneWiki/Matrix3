package game;

/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86 {
	public int anInt1189;
	public int anInt1190;
	public int anInt1191;
	int anInt1192;
	public int anInt1193;
	public int anInt1194;
	public int anInt1195;

	public Class86(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1193 = i * 1368828903;
		anInt1190 = i_0_ * 1765263439;
		anInt1191 = 628738217 * i_1_;
		((Class86) this).anInt1192 = -856665989 * i_2_;
		anInt1189 = -233369847 * i_3_;
		anInt1194 = -223776263 * i_4_;
		anInt1195 = -963547665 * i_5_;
	}

	public Class86() {
		/* empty */
	}

	public boolean method1274(Class86 class86_6_, int i) {
		return (526464983 * anInt1193 == class86_6_.anInt1193 * 526464983 && (-1018540369 * class86_6_.anInt1190 == -1018540369 * anInt1190) && 1873501081 * class86_6_.anInt1191 == 1873501081 * anInt1191 && (1348669107 * ((Class86) this).anInt1192 == ((Class86) class86_6_).anInt1192 * 1348669107) && 805515065 * class86_6_.anInt1189 == 805515065 * anInt1189 && -423460791 * anInt1194 == class86_6_.anInt1194 * -423460791 && (-581082865 * class86_6_.anInt1195 == anInt1195 * -581082865));
	}

	static final void method1275(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub13_9220, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 1 : 0, 930051282);
		Exception_Sub2.method10186(-1409017873);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		Class623.method7443(-1133968740);
		client.aBool8854 = false;
	}

	static final void method1276(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		if (((Cs2Executor) class441).anInt5121 * -5771979 >= 10)
			throw new RuntimeException();
		if (class73.anObjectArray897 != null) {
			Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
			class572_sub20.thizInterface = class73;
			class572_sub20.params = class73.anObjectArray897;
			((Cs2LaunchArgs) class572_sub20).anInt9155 = ((Cs2Executor) class441).anInt5121 * 506491673 + -1395097899;
			client.aClass675_8812.method7940(class572_sub20, -2108301267);
		}
	}

	static final void method1277(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt906 * 1036765709;
	}

	static int method1278(Class572_Sub12_Sub10 class572_sub12_sub10, Class284 class284, byte i) {
		String string = Class406.method4920(class572_sub12_sub10, -962364166);
		int[] is = Class298.method3975(class572_sub12_sub10, -2070976484);
		if (is != null)
			string = new StringBuilder().append(string).append(Class191.method2895(is, 360416337)).toString();
		int i_7_ = class284.method3833(string, Class44.aClass161Array443, 1477349465);
		if (((Class572_Sub12_Sub10) class572_sub12_sub10).aBool11399)
			i_7_ += Class458.aClass161_5208.method2587() + 4;
		return i_7_;
	}

	static final void method1279(Cs2Executor class441, short i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_8_, (short) 3931);
		Class83 class83 = Class534.aClass83Array5975[i_8_ >> 16];
		Class1.method472(class73, class83, class441, 200393680);
	}

	public static void method1280(VarDefinition class179, byte i) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(1, (long) (473591285 * class179.id));
		class572_sub12_sub11.method10384(-1933054298);
	}
}
