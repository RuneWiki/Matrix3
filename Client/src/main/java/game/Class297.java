package game;

/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class297 {
	static Class297 aClass297_3467;
	public static Class297 aClass297_3468 = new Class297(8);
	public static Class297 aClass297_3469;
	public static Class297 aClass297_3470;
	public static Class297 aClass297_3471 = new Class297(16);
	public int anInt3472;
	static int anInt3473;
	public static int anInt3474;
	static Class248 aClass248_3475;
	static int anInt3476;
	public static Class567 aClass567_3477;

	Class297(int i) {
		anInt3472 = i * -911014823;
	}

	static {
		aClass297_3469 = new Class297(8);
		aClass297_3470 = new Class297(16);
		aClass297_3467 = new Class297(32);
	}

	static final void method3966(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).longStackPtr -= -1758429946;
		if ((((Cs2Executor) class441).longStack[((Cs2Executor) class441).longStackPtr * 1097105451]) <= (((Cs2Executor) class441).longStack[1097105451 * ((Cs2Executor) class441).longStackPtr + 1]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]));
	}

	static final void method3967(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class578.method6831(class73, class83, class441, 1768708329);
	}

	public static void method3968(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class335_Sub1.anInt9694 = 0;
		if (client.anInt8826 * 519269993 != 696710655 * client.anInt8870 || bool != client.aBool8871 || !string.equals(Class294.aString3456)) {
			Class294.aString3456 = string;
			client.anInt8870 = -872830057 * client.anInt8826;
			client.aBool8871 = bool;
			short[] is = new short[16];
			int i_0_ = 0;
			int i_1_ = bool ? 32768 : 0;
			int i_2_ = i_1_ + (bool ? Class111.aClass244_1428.anInt2669 * -426050249 : Class111.aClass244_1428.anInt2672 * 1076291605);
			for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++) {
				Class572_Sub12_Sub15 class572_sub12_sub15 = Class111.aClass244_1428.method3345(i_3_, -740210077);
				if (class572_sub12_sub15.aBool11472 && class572_sub12_sub15.method10420((byte) 81).toLowerCase().indexOf(string) != -1) {
					if (i_0_ >= 50) {
						Class626.anInt8089 = 2020101997;
						Class298.aShortArray3480 = null;
						return;
					}
					if (i_0_ >= is.length) {
						short[] is_4_ = new short[is.length * 2];
						for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
							is_4_[i_5_] = is[i_5_];
						is = is_4_;
					}
					is[i_0_++] = (short) i_3_;
				}
			}
			Class298.aShortArray3480 = is;
			Class626.anInt8089 = i_0_ * -2020101997;
			String[] strings = new String[Class626.anInt8089 * 43052443];
			for (int i_6_ = 0; i_6_ < Class626.anInt8089 * 43052443; i_6_++)
				strings[i_6_] = Class111.aClass244_1428.method3345(is[i_6_], 716551917).method10420((byte) 49);
			Class455.method5389(strings, Class298.aShortArray3480, (byte) -10);
		}
	}

	static final void method3969(Cs2Executor class441, int i) {
		Class572_Sub17 class572_sub17 = (Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -1) != Class416.aClass416_4931)
			throw new RuntimeException();
		Class658_Sub5 class658_sub5 = ((Class658_Sub5) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040));
		class658_sub5.method9026(class572_sub17, (byte) 58);
		client.aBool8685 = true;
	}

	static final void method3970(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		class73.anInt760 = 1256520373 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		class73.anInt761 = 200498991 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		class73.anInt805 = 0;
		class73.anInt924 = 0;
		int i_7_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		if (i_7_ < 0)
			i_7_ = 0;
		else if (i_7_ > 4)
			i_7_ = 4;
		int i_8_ = (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (i_8_ < 0)
			i_8_ = 0;
		else if (i_8_ > 4)
			i_8_ = 4;
		class73.aByte756 = (byte) i_7_;
		class73.aByte757 = (byte) i_8_;
		Class555.method6575(class73, (short) 29826);
		Class179_Sub1.method9993(class83, class73, 326047010);
		if (-1285279191 * class73.anInt752 == 0)
			Class496.method5923(class83, class73, false, (byte) -7);
	}

	static final void method3971(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub16_9236.method8983(1230713064) == 1 ? 1 : 0;
	}
}
