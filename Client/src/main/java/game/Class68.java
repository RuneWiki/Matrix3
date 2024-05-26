package game;

/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class68 implements Interface52 {
	public int anInt694;
	public static Class68 aClass68_695 = new Class68(4, 0);
	public static Class68 aClass68_696;
	int anInt697;
	public static Class68 aClass68_698;
	public static Class68 aClass68_699;
	public static Class68 aClass68_700 = new Class68(5, 1);
	public static Class68 aClass68_701;

	static {
		aClass68_696 = new Class68(0, 2);
		aClass68_701 = new Class68(1, 3);
		aClass68_698 = new Class68(2, 4);
		aClass68_699 = new Class68(3, 5);
	}

	public int getId(int i) {
		return -1571686105 * ((Class68) this).anInt697;
	}

	public int method43() {
		return -1571686105 * ((Class68) this).anInt697;
	}

	Class68(int i, int i_0_) {
		anInt694 = i * 769437869;
		((Class68) this).anInt697 = i_0_ * 334227095;
	}

	public int method45() {
		return -1571686105 * ((Class68) this).anInt697;
	}

	public int method61() {
		return -1571686105 * ((Class68) this).anInt697;
	}

	public int method143() {
		return -1571686105 * ((Class68) this).anInt697;
	}

	static void method1058(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		TwitchWebcamDevice twitchwebcamdevice = Class380.method4642(i_1_, (byte) 33);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method2694(i_2_);
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
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = twitchwebcamdevicecapability.anInt3668 * 1774990093;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 2109989933 * twitchwebcamdevicecapability.anInt3669;
		}
	}

	static final void method1059(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) -7333);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class594.method7026(class73, class83, class441, -199311768);
	}

	static final void method1060(Cs2Executor class441, byte i) {
		Class572_Sub17 class572_sub17 = (Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -746112025 * class572_sub17.anInt9123;
	}

	static final void method1061(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class2.aClass134_21 != null ? 1 : 0;
	}

	static final void method1062(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method7863(i_4_, 898492127);
	}

	static final void method1063(Cs2Executor class441, int i) {
		if (client.aString8887 != null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method1064(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) 4584);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class656.method7726(class73, class83, class441, -2077967507);
	}

	static final void method1065(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class307.method4018(class73, class83, class441, (byte) 109);
	}
}
