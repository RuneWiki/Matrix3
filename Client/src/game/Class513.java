package game;

/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class513 implements Interface52 {
	static Class513 aClass513_5705;
	static Class513 aClass513_5706 = new Class513(0);
	static Class513 aClass513_5707;
	static Class513 aClass513_5708;
	static Class513 aClass513_5709;
	static Class513 aClass513_5710 = new Class513(1);
	int anInt5711;

	public int method43() {
		return -951007571 * ((Class513) this).anInt5711;
	}

	public int method45() {
		return -951007571 * ((Class513) this).anInt5711;
	}

	static {
		aClass513_5707 = new Class513(2);
		aClass513_5708 = new Class513(3);
		aClass513_5705 = new Class513(4);
		aClass513_5709 = new Class513(5);
	}

	public int method143() {
		return -951007571 * ((Class513) this).anInt5711;
	}

	Class513(int i) {
		((Class513) this).anInt5711 = -1371632347 * i;
	}

	public int method61() {
		return -951007571 * ((Class513) this).anInt5711;
	}

	public int getId(int i) {
		return -951007571 * ((Class513) this).anInt5711;
	}

	static void method6085(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		TwitchWebcamDevice twitchwebcamdevice = Class380.method4642(i_0_, (byte) 71);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method2695(i_1_);
		if (twitchwebcamdevicecapability == null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = twitchwebcamdevicecapability.anInt3665 * -264917623;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = twitchwebcamdevicecapability.anInt3666 * -1851940155;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1746432387 * twitchwebcamdevicecapability.anInt3667;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1774990093 * twitchwebcamdevicecapability.anInt3668;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 2109989933 * twitchwebcamdevicecapability.anInt3669;
		}
	}

	static final void method6086(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class336.method4237(class73, class83, class441, -1654190175);
	}

	static final void method6087(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		client.anInt8831 = 858183233 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class386.aClass669_4641 = Class448.method5356((((Cs2Executor) class441).intStack[1 + (1369304407 * ((Cs2Executor) class441).intStackPtr)]), 1107009278);
		if (null == Class386.aClass669_4641)
			Class386.aClass669_4641 = Class669.aClass669_8518;
		client.anInt8680 = ((((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]) * 1948953255);
		Class195 class195 = Class166.method2676((byte) 59);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3781, class195.aClass650_2340, -142464423);
		class572_sub25.aRsByteBuffer.writeByte(822360513 * client.anInt8831, -1384395473);
		class572_sub25.aRsByteBuffer.writeByte(Class386.aClass669_4641.anInt8520 * -1986278251, -1384395473);
		class572_sub25.aRsByteBuffer.writeByte(1878285591 * client.anInt8680, -1384395473);
		class195.method2929(class572_sub25, (byte) -83);
	}

	public static boolean method6088(boolean bool, int i) {
		boolean bool_2_ = Class272_Sub2.aClass106_9517.method1786();
		if (bool != bool_2_) {
			if (bool) {
				if (!Class272_Sub2.aClass106_9517.method1809())
					bool = false;
			} else
				Class272_Sub2.aClass106_9517.method1785();
			if (bool_2_ != bool) {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210, bool ? 1 : 0, 802050105);
				Class623.method7443(-1118688350);
				return true;
			}
			return false;
		}
		return true;
	}

	public static boolean method6089(CharSequence charsequence, int i) {
		return Class403.method4786(charsequence, 10, true, (short) -25795);
	}

	static final void method6090(Cs2Executor class441, byte i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (0 != client.anInt8861 * 1472719885 && i_3_ < 351572371 * client.anInt8865)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = client.aClass23Array8650[i_3_].aString153;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}
}
