package game;

/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class418 {
	public int[] anIntArray4944;
	public short[] aShortArray4945;
	static int anInt4946;

	public Class418(int[] is, short[] is_0_) {
		anIntArray4944 = is;
		aShortArray4945 = is_0_;
	}

	public Class418(NPCDefintion class410) {
		anIntArray4944 = new int[8];
		aShortArray4945 = new short[8];
		int i = 0;
		if (class410.anIntArray4822 != null && null != class410.aShortArray4817) {
			i = class410.anIntArray4822.length;
			System.arraycopy(class410.anIntArray4822, 0, anIntArray4944, 0, i);
			System.arraycopy(class410.aShortArray4817, 0, aShortArray4945, 0, i);
		}
		for (int i_1_ = i; i_1_ < 8; i_1_++) {
			anIntArray4944[i_1_] = -1;
			aShortArray4945[i_1_] = (short) -1;
		}
	}

	static final void method5107(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt804 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -1342032263;
		Class555.method6575(class73, (short) 30675);
		if (-1 == -1665128073 * class73.activeComponent && !class83.aBool1079)
			Class251.method3504(-1718435171 * class73.selfId, -1722955899);
	}

	static void method5108(Class106 class106, byte i) {
		if (Class25.aBool165)
			Class128.method2255(class106, 1624868481);
		else
			Class130.method2282(class106, (byte) 68);
	}

	public static int method5109(long l) {
		Class388.method4694(l);
		return Class273.aCalendar2899.get(1);
	}

	public static void method5110(byte i) {
		for (Class572_Sub27 class572_sub27 = ((Class572_Sub27) Class572_Sub27.aClass675_9272.method7932((byte) 50)); class572_sub27 != null; class572_sub27 = (Class572_Sub27) Class572_Sub27.aClass675_9272.method7926(1108710342)) {
			if (((Class572_Sub27) class572_sub27).aBool9270)
				class572_sub27.method8631((short) 28424);
		}
		for (Class572_Sub27 class572_sub27 = ((Class572_Sub27) Class572_Sub27.aClass675_9261.method7932((byte) 50)); class572_sub27 != null; class572_sub27 = (Class572_Sub27) Class572_Sub27.aClass675_9261.method7926(1711326864)) {
			if (((Class572_Sub27) class572_sub27).aBool9270)
				class572_sub27.method8631((short) -17927);
		}
	}
}
