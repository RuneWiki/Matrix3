package game;

/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class507 {
	static int[] anIntArray5599;
	static Player aClass456_Sub1_Sub2_Sub3_Sub2_5600;

	Class507() throws Throwable {
		throw new Error();
	}

	static Class65[] method6033(int i) {
		return new Class65[] { Class65.aClass65_683, Class65.aClass65_679, Class65.aClass65_682, Class65.aClass65_680, Class65.aClass65_681 };
	}

	static final void method6034(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class418.method5107(class73, class83, class441, (byte) -6);
	}

	static final void method6035(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class547_Sub1.aBool8995 ? 1 : 0;
	}

	public static final void method6036(int i, boolean bool, int i_0_) {
		if (null != Class251.aClass572_Sub10_2731 && (i >= 0 && i < Class251.aClass572_Sub10_2731.anInt9082 * -58096969)) {
			Class343 class343 = Class251.aClass572_Sub10_2731.aClass343Array9084[i];
			Class195 class195 = Class166.method2676((byte) 8);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3672, class195.aClass650_2340, -1174688113);
			class572_sub25.aRsByteBuffer.writeByte(3 + ObjectDefinitions.method6069(class343.aString4361, -1375456187), -1384395473);
			class572_sub25.aRsByteBuffer.writeShort(i, -779097176);
			class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
			class572_sub25.aRsByteBuffer.writeString(class343.aString4361, (byte) -46);
			//System.out.println("p26: " + i + ", " + bool + ", " + class343.aString4361);
			class195.method2929(class572_sub25, (byte) -70);
		}
	}

	public static void method6037(int i, String string, int i_1_, byte i_2_) {
		Cs2Script class572_sub12_sub8 = Class224.method3150(Class530.aClass530_5915, i, -1, 351534156);
		if (null != class572_sub12_sub8) {
			Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
			((Cs2Executor) class441).intLocals = new int[class572_sub12_sub8.nIntLocals * -210642863];
			((Cs2Executor) class441).objectLocals = new String[1139034625 * class572_sub12_sub8.nObjectLocals];
			((Cs2Executor) class441).objectLocals[0] = string;
			((Cs2Executor) class441).intLocals[0] = i_1_;
			Class572_Sub16_Sub3.method10067(class572_sub12_sub8, 200000, class441, -96139582);
		}
	}
}
