package game;

/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class345 {
	String aString4369;
	String aString4370;
	String aString4371;
	static String aString4372;
	static int[] anIntArray4373;

	Class345(String string, String string_0_, String string_1_) {
		((Class345) this).aString4371 = string;
		((Class345) this).aString4370 = string_0_;
		((Class345) this).aString4369 = string_1_;
	}

	static void method4317(byte i) {
		for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7848(-1042067865)); null != class572_sub12_sub19; class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7845(-2111693130))) {
			if ((((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482 * 944917463) > 1) {
				((Class572_Sub12_Sub19) class572_sub12_sub19).anInt11482 = 0;
				Class25.aClass127_179.method2229(class572_sub12_sub19, ((((Class572_Sub12_Sub10) (Class572_Sub12_Sub10) (((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.aClass572_Sub12_8489.aClass572_Sub12_9094)).aLong11400) * 8440972884689828221L));
				((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.method7841((short) -23116);
			}
		}
		Class25.anInt173 = 0;
		Class25.anInt172 = 0;
		Class25.aClass675_174.method7918(-1407469614);
		Class25.aClass676_175.method7964((byte) 85);
		Class25.aClass664_176.method7841((short) -24189);
		Class412.method5075(Class223.aClass572_Sub12_Sub10_2612, -493965605);
	}

	public static int method4318(int i, byte i_2_) {
		Class520.aTwitchWebcamFrameData5807 = null;
		Class520.aClass161_5817 = null;
		if (i < 0 || i >= Class520.aTwitchWebcamDeviceArray5812.length)
			return -1;
		return (Class572_Sub2.aTwitchTV8969.StopWebcamDevice(Class520.aTwitchWebcamDeviceArray5812[i].anInt2059 * 1798659347));
	}

	static final void method4319(Cs2Executor class441, int i) {
		((Cs2Executor) class441).longStack[(((Cs2Executor) class441).longStackPtr += -879214973) * 1097105451 - 1] = (((Cs2Executor) class441).longLocals[(((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039])]);
	}

	static final boolean method4320(char c, int i) {
		return c == '\u00a0' || ' ' == c || '_' == c || c == '-';
	}
}
