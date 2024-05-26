package game;

/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class623 {
	static Class623 aClass623_8069;
	int anInt8070;
	static Class623 aClass623_8071;
	static Class623 aClass623_8072 = new Class623(3);
	static Class623 aClass623_8073;
	static Class623 aClass623_8074;
	static Class623 aClass623_8075;
	static Class623 aClass623_8076 = new Class623(2);
	public static Class248 idx41;

	Class623(int i) {
		((Class623) this).anInt8070 = -754444171 * i;
	}

	static {
		aClass623_8071 = new Class623(0);
		aClass623_8069 = new Class623(6);
		aClass623_8073 = new Class623(5);
		aClass623_8074 = new Class623(4);
		aClass623_8075 = new Class623(1);
	}

	public static void method7443(int i) {
		Class649 class649 = null;
		try {
			class649 = Class504.method6027("", client.aClass437_8705.aString5074, true, -498949036);
			RSByteBuffer class572_sub15 = Class213.aClass572_Sub24_2463.method8611(1628690579);
			class649.method7674(class572_sub15.b, 0, -1585139053 * class572_sub15.o, 54995638);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class649 != null)
				class649.method7673(1257655288);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method7444(byte i) {
		InterfaceDefinitions.aClass127_743.method2231((byte) -77);
		InterfaceDefinitions.aClass127_823.method2231((byte) -117);
		InterfaceDefinitions.aClass127_744.method2231((byte) -28);
		InterfaceDefinitions.aClass127_745.method2231((byte) -3);
	}

	static final void method7445(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class26.aClass564_216.method6657((short) 587);
	}

	static final void method7446(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class385.method4663(3, i_0_ << 16 | i_1_, i_2_, "", (byte) -45);
	}

	public static Class481_Sub1 method7447(int i) {
		return Class505.method6029((Class633.aClass641_8197.id * 2112639107), (byte) -27);
	}

	public static final void method7448(String string, int i) {
		int i_3_ = client.aBool8659 ? 400 : 200;
		if (null != string) {
			if (681720871 * client.anInt8860 >= i_3_)
				Class670.method7882(4, (client.aBool8659 ? Class279.aClass279_2987.method3758(Class594.aClass435_7823, 16711935) : Class279.aClass279_2988.method3758(Class594.aClass435_7823, 16711935)), -275471418);
			else {
				String string_4_ = Class251.method3503(string, Class414.aClass207_4922, 576718026);
				if (string_4_ != null) {
					for (int i_5_ = 0; i_5_ < client.anInt8860 * 681720871; i_5_++) {
						Class26 class26 = client.aClass26Array8863[i_5_];
						String string_6_ = Class251.method3503(class26.aString209, Class414.aClass207_4922, 1815457352);
						if (null != string_6_ && string_6_.equals(string_4_)) {
							Class670.method7882(4, new StringBuilder().append(string).append(Class279.aClass279_3097.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
							return;
						}
						if (class26.aString206 != null) {
							String string_7_ = Class251.method3503(class26.aString206, Class414.aClass207_4922, -569816393);
							if (null != string_7_ && string_7_.equals(string_4_)) {
								Class670.method7882(4, new StringBuilder().append(string).append(Class279.aClass279_3097.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
								return;
							}
						}
					}
					for (int i_8_ = 0; i_8_ < client.anInt8865 * 351572371; i_8_++) {
						Class23 class23 = client.aClass23Array8650[i_8_];
						String string_9_ = Class251.method3503(class23.aString153, Class414.aClass207_4922, -853754025);
						if (null != string_9_ && string_9_.equals(string_4_)) {
							Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3070.method3758(Class594.aClass435_7823, 16711935)).append(string).append(Class279.aClass279_3105.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
							return;
						}
						if (class23.aString152 != null) {
							String string_10_ = Class251.method3503(class23.aString152, Class414.aClass207_4922, 1578563190);
							if (null != string_10_ && string_10_.equals(string_4_)) {
								Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3070.method3758(Class594.aClass435_7823, 16711935)).append(string).append(Class279.aClass279_3105.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
								return;
							}
						}
					}
					if (Class251.method3503((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username), Class414.aClass207_4922, 187761775).equals(string_4_))
						Class670.method7882(4, (Class279.aClass279_3101.method3758(Class594.aClass435_7823, 16711935)), -275471418);
					else {
						Class195 class195 = Class166.method2676((byte) 112);
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3755, class195.aClass650_2340, 760126707);
						class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -981681656), -1384395473);
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -90);
						class195.method2929(class572_sub25, (byte) -10);
					}
				}
			}
		}
	}

	static RSByteBuffer method7449(int i) {
		RSByteBuffer class572_sub15 = Class502.method6003(-832324364);
		long l;
		if (-1 != Class13.anInt68 * -2082178003)
			l = (long) (-2082178003 * Class13.anInt68);
		else if (-1L == Class13.aLong79 * -1112276700564261009L)
			l = BaseVarType.method7262(Class13.aString70, 1356838043);
		else
			l = Class13.aLong79 * -1112276700564261009L;
		Class677.aLong8557 = 8632581027365940361L * l;
		Class81.method1243(class572_sub15, l);
		class572_sub15.writeString(Class13.aString103, (byte) -53);
		class572_sub15.method8514(-4296995748627057289L * Class13.aLong98);
		class572_sub15.method8514(5568742277358735529L * client.aLong8767);
		class572_sub15.method8537(Class18.LOGIN_PUBLIC_EXPONENT, Class18.LOGIN_MODULUS, 1828923002);
		return class572_sub15;
	}
}
