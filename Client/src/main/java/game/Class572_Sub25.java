package game;

/* Class572_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub25 extends Class572 {
	static Class572_Sub25[] aClass572_Sub25Array9250 = new Class572_Sub25[300];
	int anInt9251;
	public Class572_Sub15_Sub2 aRsByteBuffer;
	OutgoingPacket aClass312_9253;
	public int anInt9254;
	static int anInt9255 = 0;
	static String aString9256;

	public void method8623(int i) {
		if (-459476819 * anInt9255 < aClass572_Sub25Array9250.length)
			aClass572_Sub25Array9250[((anInt9255 += 1391588133) * -459476819 - 1)] = this;
	}

	Class572_Sub25() {
		/* empty */
	}

	public void method8624() {
		if (-459476819 * anInt9255 < aClass572_Sub25Array9250.length)
			aClass572_Sub25Array9250[((anInt9255 += 1391588133) * -459476819 - 1)] = this;
	}

	public static Class572_Sub25 method8625() {
		Class572_Sub25 class572_sub25 = Class104_Sub1_Sub2.method10145((byte) 31);
		((Class572_Sub25) class572_sub25).aClass312_9253 = null;
		((Class572_Sub25) class572_sub25).anInt9251 = 0;
		class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(5000);
		return class572_sub25;
	}

	public void method8626() {
		if (-459476819 * anInt9255 < aClass572_Sub25Array9250.length)
			aClass572_Sub25Array9250[((anInt9255 += 1391588133) * -459476819 - 1)] = this;
	}

	static final void method8627(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt798 * -579902323;
	}

	static final void method8628(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 12830);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class308.method4030(class73, class83, class441, (byte) 9);
	}
}
