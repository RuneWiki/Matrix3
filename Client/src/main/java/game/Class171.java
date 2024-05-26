package game;

/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class171 {
	public static Class171 aClass171_2063;
	public static Class171 aClass171_2064;
	public int anInt2065;
	public static Class171 aClass171_2066;
	public static Class171 aClass171_2067;
	public static Class171 aClass171_2068 = new Class171(1, 3);
	static Class171 aClass171_2069;
	static Class171 aClass171_2070;
	public static Class171 aClass171_2071 = new Class171(0, 4);
	public static Class171 aClass171_2072;
	public static Class171 aClass171_2073 = new Class171(2, 1);
	public int anInt2074;

	Class171(int i, int i_0_) {
		anInt2065 = 1437640717 * i;
		anInt2074 = i_0_ * 725474687;
	}

	static {
		aClass171_2064 = new Class171(8, 1);
		aClass171_2067 = new Class171(6, 2);
		aClass171_2066 = new Class171(4, 1);
		aClass171_2069 = new Class171(9, 3);
		aClass171_2070 = new Class171(5, 4);
		aClass171_2063 = new Class171(3, 1);
		aClass171_2072 = new Class171(7, 1);
	}

	static final void method2705(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_1_ >> 28;
	}

	static final void method2706(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class497 class497;
		if (i_2_ >= (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.stepsCount * -2037536229) || i_2_ < 0)
			class497 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10530(-1277156147);
		else {
			byte i_3_ = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009;
			Class497 class497_4_ = client.aClass613_8605.method7280((byte) -41);
			int i_5_ = (class497_4_.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[i_2_]));
			int i_6_ = (417324155 * class497_4_.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[i_2_]));
			class497 = new Class497(i_3_, i_5_, i_6_);
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class497.method5938(530516905);
	}

	static final void method2707(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3678, client.aClass195_8632.aClass650_2340, 199411081);
		class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -1812744137), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -41);
		client.aClass195_8632.method2929(class572_sub25, (byte) -105);
	}

	static final void method2708(Cs2Executor class441, byte i) {
		Class572_Sub12_Sub6.method10313(((String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581])), (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1, (byte) 0);
	}
}
