package game;

/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66 {
	Class66() throws Throwable {
		throw new Error();
	}

	public static final int method1048(int i, int i_0_, byte i_1_) {
		if (-1 == i)
			return 12345678;
		i_0_ = (i & 0x7f) * i_0_ >> 7;
		if (i_0_ < 2)
			i_0_ = 2;
		else if (i_0_ > 126)
			i_0_ = 126;
		return (i & 0xff80) + i_0_;
	}

	static final void method1049(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		if (class73.aString847 == null)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class73.aString847;
	}

	public static final void method1050(String string, int i) {
		if (null != string) {
			String string_2_ = Class251.method3503(string, Class414.aClass207_4922, -116138386);
			if (string_2_ != null) {
				for (int i_3_ = 0; i_3_ < client.anInt8865 * 351572371; i_3_++) {
					Class23 class23 = client.aClass23Array8650[i_3_];
					String string_4_ = class23.aString153;
					String string_5_ = Class251.method3503(string_4_, Class414.aClass207_4922, 843166876);
					if (Class665_Sub29.method9128(string, string_2_, string_4_, string_5_, (byte) 1)) {
						client.anInt8865 -= -1803668325;
						for (int i_6_ = i_3_; i_6_ < 351572371 * client.anInt8865; i_6_++)
							client.aClass23Array8650[i_6_] = client.aClass23Array8650[i_6_ + 1];
						client.anInt8715 = 2017179605 * client.anInt8839;
						Class195 class195 = Class166.method2676((byte) 47);
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3723, class195.aClass650_2340, 713914434);
						class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -1280130191), -1384395473);
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -32);
						class195.method2929(class572_sub25, (byte) -69);
						break;
					}
				}
			}
		}
	}
}
