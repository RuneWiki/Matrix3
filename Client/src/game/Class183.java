package game;

/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class183 {
	int anInt2142;
	float aFloat2143 = 1.0F;
	float aFloat2144 = 1.0F;
	int anInt2145;
	int anInt2146;
	int anInt2147;
	int anInt2148;
	int anInt2149;
	int anInt2150;
	int anInt2151;
	float aFloat2152;
	static int anInt2153;

	void method2816(Class183 class183_0_, byte i) {
		((Class183) this).aFloat2143 = ((Class183) class183_0_).aFloat2143;
		((Class183) this).aFloat2144 = ((Class183) class183_0_).aFloat2144;
		((Class183) this).anInt2142 = 1 * ((Class183) class183_0_).anInt2142;
		((Class183) this).anInt2146 = 1 * ((Class183) class183_0_).anInt2146;
		((Class183) this).anInt2145 = ((Class183) class183_0_).anInt2145 * 1;
		((Class183) this).anInt2147 = 1 * ((Class183) class183_0_).anInt2147;
	}

	Class183(int i, float f, float f_1_, int i_2_, int i_3_, int i_4_) {
		((Class183) this).anInt2145 = 63450653 * i;
		((Class183) this).aFloat2143 = f;
		((Class183) this).aFloat2144 = f_1_;
		((Class183) this).anInt2142 = i_2_ * -1072168045;
		((Class183) this).anInt2146 = i_3_ * -1694545889;
		((Class183) this).anInt2147 = i_4_ * -151753937;
	}

	Class183 method2817(int i) {
		return new Class183(((Class183) this).anInt2145 * 307102773, ((Class183) this).aFloat2143, ((Class183) this).aFloat2144, 1046778523 * ((Class183) this).anInt2142, 1065235423 * ((Class183) this).anInt2146, ((Class183) this).anInt2147 * 1317977039);
	}

	Class183(int i) {
		((Class183) this).anInt2145 = 63450653 * i;
	}

	public static int method2818(String string, int i) {
		return Class572_Sub2.aTwitchTV8969.SetStreamTitle(string, client.aClass437_8705.aString5075);
	}

	static final void method2819(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) -9864);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class213.method3072(class73, class83, class441, 440709533);
	}

	static void method2820(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1]), -594386043))).method4668(Class133_Sub23.playerVarsProvider, 1969852135) ? 1 : 0);
	}
}
