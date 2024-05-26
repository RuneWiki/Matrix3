package game;

/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class573 implements Interface62 {
	Class456_Sub1_Sub2_Sub6 aClass456_Sub1_Sub2_Sub6_6434;

	public boolean method375(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 == ((Class573) this).aClass456_Sub1_Sub2_Sub6_6434);
	}

	public boolean method374(Class456_Sub1_Sub2 class456_sub1_sub2, int i) {
		return (class456_sub1_sub2 == ((Class573) this).aClass456_Sub1_Sub2_Sub6_6434);
	}

	public boolean method373(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 == ((Class573) this).aClass456_Sub1_Sub2_Sub6_6434);
	}

	public boolean method372(Class456_Sub1_Sub2 class456_sub1_sub2) {
		return (class456_sub1_sub2 == ((Class573) this).aClass456_Sub1_Sub2_Sub6_6434);
	}

	Class573(Class456_Sub1_Sub2_Sub6 class456_sub1_sub2_sub6) {
		((Class573) this).aClass456_Sub1_Sub2_Sub6_6434 = class456_sub1_sub2_sub6;
	}

	static final void method6802(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		if (-1 != class73.nvmtheindexisotherone * 411192987)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -830487355 * class73.anInt903;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	public static final void method6803(String string, byte i) {
		if (string != null) {
			String string_0_ = Class251.method3503(string, Class414.aClass207_4922, 1949765620);
			if (string_0_ != null) {
				for (int i_1_ = 0; i_1_ < client.anInt8860 * 681720871; i_1_++) {
					Class26 class26 = client.aClass26Array8863[i_1_];
					String string_2_ = class26.aString209;
					String string_3_ = Class251.method3503(string_2_, Class414.aClass207_4922, -747623569);
					if (Class665_Sub29.method9128(string, string_0_, string_2_, string_3_, (byte) 1)) {
						client.anInt8860 -= -149982313;
						for (int i_4_ = i_1_; i_4_ < 681720871 * client.anInt8860; i_4_++)
							client.aClass26Array8863[i_4_] = client.aClass26Array8863[1 + i_4_];
						client.anInt8715 = client.anInt8839 * 2017179605;
						Class195 class195 = Class166.method2676((byte) 62);
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3684, class195.aClass650_2340, 350217396);
						class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -1006070098), -1384395473);
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -35);
						class195.method2929(class572_sub25, (byte) -113);
						break;
					}
				}
			}
		}
	}

	public static void method6804(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, String string, int i_10_) {
		Class591_Sub3 class591_sub3 = new Class591_Sub3();
		((Class591_Sub3) class591_sub3).anInt9325 = 1311844377 * i;
		((Class591_Sub3) class591_sub3).anInt9322 = -261483015 * i_5_;
		((Class591_Sub3) class591_sub3).anInt9321 = i_6_ * 865956615;
		((Class591_Sub3) class591_sub3).anInt9323 = (client.cycles + i_8_) * 1354014555;
		((Class591_Sub3) class591_sub3).anInt9320 = 1043592841 * i_7_;
		((Class591_Sub3) class591_sub3).aString9319 = string;
		((Class591_Sub3) class591_sub3).anInt9324 = 699328143 * i_9_;
		client.aClass652_8748.method7703(class591_sub3, (short) -3741);
	}

	static final void method6805(Cs2Executor class441, byte i) {
		int i_11_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class538 class538 = ((Class538) Class197.aClass639_Sub11_2359.getDefinition(i_11_, 992622619));
		if (null != class538.anIntArray6017 && class538.anIntArray6017.length > 0) {
			int i_12_ = 0;
			int i_13_ = class538.anIntArray6018[0];
			for (int i_14_ = 1; i_14_ < class538.anIntArray6017.length; i_14_++) {
				if (class538.anIntArray6018[i_14_] > i_13_) {
					i_12_ = i_14_;
					i_13_ = class538.anIntArray6018[i_14_];
				}
			}
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class538.anIntArray6017[i_12_];
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 265246257 * class538.anInt6022;
	}
}
