package game;

// import vartracker.Cs2Tracker;

/* Class595 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class595 {
	static Class595 aClass595_7824;
	public static Class595 aClass595_7825;
	public static Class595 aClass595_7826;
	public static Class595 aClass595_7827;
	public static Class595 aClass595_7828;
	public static Class595 aClass595_7829;
	public static Class595 aClass595_7830;
	public static Class595 aClass595_7831;
	public static Class595 aClass595_7832;
	static Class595 aClass595_7833 = new Class595(0);
	public int anInt7834;

	static {
		aClass595_7825 = new Class595(1);
		aClass595_7826 = new Class595(2);
		aClass595_7827 = new Class595(3);
		aClass595_7828 = new Class595(4);
		aClass595_7829 = new Class595(5);
		aClass595_7830 = new Class595(6);
		aClass595_7831 = new Class595(7);
		aClass595_7824 = new Class595(8);
		aClass595_7832 = new Class595(9);
	}

	Class595(int i) {
		anInt7834 = i * -659753889;
	}

	static final void method7027(Cs2Executor class441, byte i) throws Exception_Sub2 {
		VarBitDefinition var = (VarBitDefinition) (((Cs2Executor) class441).current.anObjectArray11384[((Cs2Executor) class441).instrPtr * -1280867039]);
		IVarDomain domain = ((IVarDomain) ((((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]) == 0 ? ((Cs2Executor) class441).main_configs_map.get(var.baseVar.domain) : ((Cs2Executor) class441).playerentity_configs_map.get(var.baseVar.domain)));
		try {
			int value = (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
			// Cs2Tracker.trackWrite(class441, var, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
			domain.method81(var, value, 9550832);
		} catch (Exception_Sub2 exception_sub2) {
			if (domain instanceof Class510)
				Class202.method2998(class441, Class574.aClass574_7386, exception_sub2, "VO", 558087233);
			else
				throw exception_sub2;
		}
	}

	static final void method7028(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class452.method5376(class73, class83, class441, -726241895);
	}

	static final void method7029(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_0_ & i_1_;
	}

	static final void method7030(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		Class297.method3968(string, bool, 6787778);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class626.anInt8089 * 43052443;
	}

	static final void method7031(Cs2Executor class441, int i) {
		if (null == Class298.aShortArray3480 || (1870974211 * Class335_Sub1.anInt9694 >= 43052443 * Class626.anInt8089))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = ((Class298.aShortArray3480[(Class335_Sub1.anInt9694 += -244447829) * 1870974211 - 1]) & 0xffff);
	}

	static final void method7032(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		client.aShort8851 = (short) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8851 <= 0)
			client.aShort8851 = (short) 1;
		client.aShort8852 = (short) (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8852 <= 0)
			client.aShort8852 = (short) 32767;
		else if (client.aShort8852 < client.aShort8851)
			client.aShort8852 = client.aShort8851;
		client.aShort8853 = (short) (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8853 <= 0)
			client.aShort8853 = (short) 1;
		client.aShort8693 = (short) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]);
		if (client.aShort8693 <= 0)
			client.aShort8693 = (short) 32767;
		else if (client.aShort8693 < client.aShort8853)
			client.aShort8693 = client.aShort8853;
	}

	static final void method7033(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub23_9208.method7863(i_2_, -1896270008);
	}

	public static boolean method7034(byte[] is, byte i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		int i_3_ = class572_sub15.readUnsignedByte(1323512326);
		if (2 != i_3_)
			return false;
		boolean bool = class572_sub15.readUnsignedByte(1641768513) == 1;
		if (bool)
			Class289.method3920(class572_sub15, (byte) -93);
		Class39.method797(class572_sub15, 830479011);
		return true;
	}

	static final void method7035(Cs2Executor class441, int i) {
		Class10.method540(1608270640);
	}
}
