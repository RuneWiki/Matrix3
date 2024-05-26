package game;

/* Class527 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class527 implements Interface57 {
	int[] anIntArray5894;
	int anInt5895;
	int anInt5896;

	public boolean method321(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		if (null == class572_sub13) {
			if (-798772873 * ((Class527) this).anInt5896 != -1)
				return false;
		} else {
			if (((Class527) this).anInt5896 * -798772873 != class572_sub13.method8416((byte) 10))
				return false;
			if (1132591737 * ((Class527) this).anInt5895 > class572_sub13.method8419(-1841144))
				return false;
			int[] is = ((Class527) this).anIntArray5894;
			for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
				int i_1_ = is[i_0_];
				if (!class549.method6514(i_1_, (byte) 1))
					return false;
			}
		}
		return true;
	}

	public boolean method320(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549, int i_2_) {
		if (null == class572_sub13) {
			if (-798772873 * ((Class527) this).anInt5896 != -1)
				return false;
		} else {
			if (((Class527) this).anInt5896 * -798772873 != class572_sub13.method8416((byte) 10))
				return false;
			if (1132591737 * ((Class527) this).anInt5895 > class572_sub13.method8419(-1841144))
				return false;
			int[] is = ((Class527) this).anIntArray5894;
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				int i_4_ = is[i_3_];
				if (!class549.method6514(i_4_, (byte) 1))
					return false;
			}
		}
		return true;
	}

	public boolean method322(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		if (null == class572_sub13) {
			if (-798772873 * ((Class527) this).anInt5896 != -1)
				return false;
		} else {
			if (((Class527) this).anInt5896 * -798772873 != class572_sub13.method8416((byte) 10))
				return false;
			if (1132591737 * ((Class527) this).anInt5895 > class572_sub13.method8419(-1841144))
				return false;
			int[] is = ((Class527) this).anIntArray5894;
			for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
				int i_6_ = is[i_5_];
				if (!class549.method6514(i_6_, (byte) 1))
					return false;
			}
		}
		return true;
	}

	Class527(int i, int i_7_, int[] is) {
		((Class527) this).anInt5896 = i * 1252423751;
		((Class527) this).anInt5895 = 2115981257 * i_7_;
		((Class527) this).anIntArray5894 = is;
	}

	static void method6313(String string, String string_8_, String string_9_, boolean bool, boolean bool_10_, int i) {
		Class195 class195 = Class166.method2676((byte) 48);
		if (class195.method2933(-1997447373) != null) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3778, class195.aClass650_2340, -601052609);
			class572_sub25.aRsByteBuffer.writeShort((ObjectDefinitions.method6069(string, -1920199476) + ObjectDefinitions.method6069(string_8_, -1425635789) + ObjectDefinitions.method6069(string_9_, -1799246344) + 1), -1504332447);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -122);
			class572_sub25.aRsByteBuffer.writeString(string_8_, (byte) -109);
			class572_sub25.aRsByteBuffer.writeString(string_9_, (byte) -25);
			int i_11_ = 0;
			if (bool)
				i_11_ |= 0x1;
			if (bool_10_)
				i_11_ |= 0x2;
			class572_sub25.aRsByteBuffer.writeByte(i_11_, -1384395473);
			class195.method2929(class572_sub25, (byte) -12);
		}
	}

	static final void method6314(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		short i_13_ = (short) (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		short i_14_ = (short) (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		if (i_12_ >= 0 && i_12_ < 5) {
			class73.method1105(i_12_, i_13_, i_14_, 33984);
			Class555.method6575(class73, (short) 6750);
			if (class73.activeComponent * -1665128073 == -1 && !class83.aBool1079)
				Class440.method5278(class73.selfId * -1718435171, i_12_, 1285223166);
		}
	}

	static final void method6315(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.aBool769 ? 1 : 0;
	}

	static final void method6316(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).aClass572_Sub10_5104.anInt9082 * -58096969;
	}

	static final void method6317(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method6318(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (client.aClass73_8880 == null ? -1 : client.aClass73_8880.selfId * -1718435171);
	}

	static final void method6319(InterfaceDefinitions class73, int i, byte[] is, byte[] is_15_, Cs2Executor class441, int i_16_) {
		if (class73.aByteArrayArray791 == null) {
			if (null != is) {
				class73.aByteArrayArray791 = new byte[11][];
				class73.aByteArrayArray778 = new byte[11][];
				class73.anIntArray749 = new int[11];
				class73.anIntArray841 = new int[11];
				class73.anIntArray894 = new int[11];
			} else
				return;
		}
		class73.aByteArrayArray791[i] = is;
		if (is != null)
			class73.aBool837 = true;
		else {
			class73.aBool837 = false;
			for (int i_17_ = 0; i_17_ < class73.aByteArrayArray791.length; i_17_++) {
				if (null != class73.aByteArrayArray791[i_17_] || class73.anIntArray894[i_17_] > 0) {
					class73.aBool837 = true;
					break;
				}
			}
		}
		class73.aByteArrayArray778[i] = is_15_;
	}

	static int method6320(byte i) {
		return (Class390.anInt4655 += -1351052915) * 1945246021 - 1;
	}

	static final void method6321(Cs2Executor class441, int i) {
		OutgoingPacket.method4058((((Cs2Executor) class441).entity), class441, 1249914325);
	}
}
