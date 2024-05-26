package game;

/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 implements Interface52 {
	int anInt466;
	public static Class47 aClass47_467 = new Class47(1, 0);
	public static Class47 aClass47_468;
	public static Class47 aClass47_469 = new Class47(0, 1);
	int anInt470;
	public static short[][][] aShortArrayArrayArray471;

	public static Class47[] method838(short i) {
		return new Class47[] { aClass47_469, aClass47_467, aClass47_468 };
	}

	Class47(int i, int i_0_) {
		((Class47) this).anInt466 = i * 490161855;
		((Class47) this).anInt470 = i_0_ * 606214107;
	}

	public int method45() {
		return -239334317 * ((Class47) this).anInt470;
	}

	static {
		aClass47_468 = new Class47(2, 2);
	}

	public int method143() {
		return -239334317 * ((Class47) this).anInt470;
	}

	public int method61() {
		return -239334317 * ((Class47) this).anInt470;
	}

	public int getId(int i) {
		return -239334317 * ((Class47) this).anInt470;
	}

	public int method43() {
		return -239334317 * ((Class47) this).anInt470;
	}

	public static int[] method839(int i) {
		return (new int[] { -1060508549 * Class1.anInt14, Class1.anInt9 * -901270193, 932397655 * Class1.anInt12 });
	}

	static final void method840(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 822360513 * client.anInt8831;
	}

	static final void method841(Cs2Executor class441, int i) {
		System.out.println(((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581)]);
	}

	public static final void method842(String string, boolean bool, int i) {
		int i_1_ = client.aBool8659 ? 400 : 100;
		if (null != string) {
			if (client.anInt8865 * 351572371 >= i_1_)
				Class670.method7882(4, (client.aBool8659 ? Class279.aClass279_2976.method3758(Class594.aClass435_7823, 16711935) : Class279.aClass279_3099.method3758(Class594.aClass435_7823, 16711935)), -275471418);
			else {
				String string_2_ = Class251.method3503(string, Class414.aClass207_4922, 1154861609);
				if (string_2_ != null) {
					for (int i_3_ = 0; i_3_ < 351572371 * client.anInt8865; i_3_++) {
						Class23 class23 = client.aClass23Array8650[i_3_];
						String string_4_ = Class251.method3503(class23.aString153, Class414.aClass207_4922, 598994851);
						if (string_4_ != null && string_4_.equals(string_2_)) {
							Class670.method7882(4, new StringBuilder().append(string).append(Class279.aClass279_3100.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
							return;
						}
						if (class23.aString152 != null) {
							String string_5_ = Class251.method3503(class23.aString152, Class414.aClass207_4922, -678544334);
							if (null != string_5_ && string_5_.equals(string_2_)) {
								Class670.method7882(4, new StringBuilder().append(string).append(Class279.aClass279_3100.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
								return;
							}
						}
					}
					for (int i_6_ = 0; i_6_ < client.anInt8860 * 681720871; i_6_++) {
						Class26 class26 = client.aClass26Array8863[i_6_];
						String string_7_ = Class251.method3503(class26.aString209, Class414.aClass207_4922, 770427478);
						if (string_7_ != null && string_7_.equals(string_2_)) {
							Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3106.method3758(Class594.aClass435_7823, 16711935)).append(string).append(Class279.aClass279_3011.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
							return;
						}
						if (class26.aString206 != null) {
							String string_8_ = Class251.method3503(class26.aString206, Class414.aClass207_4922, 976168569);
							if (null != string_8_ && string_8_.equals(string_2_)) {
								Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3106.method3758(Class594.aClass435_7823, 16711935)).append(string).append(Class279.aClass279_3011.method3758(Class594.aClass435_7823, 16711935)).toString(), -275471418);
								return;
							}
						}
					}
					if (Class251.method3503((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username), Class414.aClass207_4922, -710013244).equals(string_2_))
						Class670.method7882(4, (Class279.aClass279_3102.method3758(Class594.aClass435_7823, 16711935)), -275471418);
					else {
						Class195 class195 = Class166.method2676((byte) 73);
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3750, class195.aClass650_2340, -934501987);
						class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -871536245) + 1, -1384395473);
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -35);
						class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
						class195.method2929(class572_sub25, (byte) -119);
					}
				}
			}
		}
	}

	static final void method843(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_9_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_10_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_10_ == -1)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class100.aClass616_1298.method7372(i_9_, -109239894).method10412((char) i_10_, 954364634);
	}
}
