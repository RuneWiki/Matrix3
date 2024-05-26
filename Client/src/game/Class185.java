package game;

/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class185 {
	volatile boolean aBool2168;
	URL anURL2169;
	volatile byte[] aByteArray2170;
	public static Interface15 anInterface15_2171;
	public static int anInt2172;

	boolean method2830() {
		return ((Class185) this).aBool2168;
	}

	Class185(URL url) {
		((Class185) this).anURL2169 = url;
	}

	byte[] method2831(int i) {
		return ((Class185) this).aByteArray2170;
	}

	boolean method2832(int i) {
		return ((Class185) this).aBool2168;
	}

	byte[] method2833() {
		return ((Class185) this).aByteArray2170;
	}

	byte[] method2834() {
		return ((Class185) this).aByteArray2170;
	}

	static String method2835(String string, byte i) {
		String string_0_ = null;
		int i_1_ = string.indexOf("--> ");
		if (i_1_ >= 0) {
			string_0_ = string.substring(0, i_1_ + 4);
			string = string.substring(4 + i_1_);
		}
		int i_2_ = -1;
		if (string.startsWith("directlogin "))
			i_2_ = string.indexOf(" ", "directlogin ".length());
		if (i_2_ >= 0) {
			int i_3_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_2_)).append(" ").toString();
			for (int i_4_ = 1 + i_2_; i_4_ < i_3_; i_4_++)
				string = new StringBuilder().append(string).append("*").toString();
		}
		if (string_0_ != null)
			return new StringBuilder().append(string_0_).append(string).toString();
		return string;
	}

	public static int method2836(int i, int i_5_, int i_6_, int i_7_) {
		i_6_ &= 0x3;
		if (i_6_ == 0)
			return i;
		if (i_6_ == 1)
			return i_5_;
		if (i_6_ == 2)
			return 7 - i;
		return 7 - i_5_;
	}

	static void method2837(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = ((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1]), 1357162515))).anInt4622 * -717920031;
	}

	static final void method2838(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class500.method5949(class73, class83, class441, (byte) 63);
	}

	static final void method2839(Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class259.method3562(i_8_ >> 14 & 0x3fff, i_8_ & 0x3fff, (short) 1010);
	}

	static final void method2840(Cs2Executor class441, int i) {
		float f = Class325.method4146(((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
		Class572_Sub12_Sub17_Sub1 class572_sub12_sub17_sub1 = new Class572_Sub12_Sub17_Sub1(Class133_Sub1.aClass411_Sub1_9827.method9569(-992381955), f);
		Class133_Sub1.aClass411_Sub1_9827.method5041(class572_sub12_sub17_sub1, -435326039);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1603351871 * class572_sub12_sub17_sub1.anInt11479;
	}

	static final void method2841(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub3_9239.method8122(-28484802);
	}

	static final void method2842(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1117512735 * Class598.anInt7851;
	}

	static boolean method2843(Interface65 interface65, int i) {
		ObjectDefinitions class509 = ((ObjectDefinitions) client.aClass613_8605.method7288(-1007434488).getDefinition(interface65.method136(-1649899628), -238768712));
		if (-1 == 337621963 * class509.anInt5623)
			return true;
		Class242 class242 = ((Class242) Class560.aClass639_Sub1_6348.getDefinition(class509.anInt5623 * 337621963, 313650123));
		if (-1 == class242.anInt2662 * 499643409)
			return true;
		return class242.method3331(1619682677);
	}

	static boolean method2844(int i, byte i_9_) {
		return i == 5 || 11 == i;
	}
}
