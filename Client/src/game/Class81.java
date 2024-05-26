package game;

/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81 implements Interface2 {
	Class46 this$0;
	int anInt1076;
	int anInt1077;
	public static Class639_Sub8 aClass639_Sub8_1078;

	public void method15(Class49 class49, int i) {
		class49.method891(((Class81) this).anInt1076 * -1621687089, ((Class81) this).anInt1077 * -75253511, 1875168396);
		class49.method854(-1621687089 * ((Class81) this).anInt1076, 1493492562).method2107(304666365);
	}

	public void method16(Class49 class49) {
		class49.method891(((Class81) this).anInt1076 * -1621687089, ((Class81) this).anInt1077 * -75253511, -872311995);
		class49.method854(-1621687089 * ((Class81) this).anInt1076, 1493492562).method2107(1272071458);
	}

	public void method17(Class49 class49) {
		class49.method891(((Class81) this).anInt1076 * -1621687089, ((Class81) this).anInt1077 * -75253511, 758202122);
		class49.method854(-1621687089 * ((Class81) this).anInt1076, 1493492562).method2107(833989820);
	}

	Class81(Class46 class46, RSByteBuffer class572_sub15) {
		((Class81) this).this$0 = class46;
		((Class81) this).anInt1076 = class572_sub15.readUnsignedShort(647518597) * -681868753;
		((Class81) this).anInt1077 = class572_sub15.readUnsignedShort(647518597) * -53769911;
	}

	public static int method1242(int i) {
		synchronized (Class474.aClass127_5325) {
			int i_0_ = Class474.aClass127_5325.method2237((byte) 54);
			return i_0_;
		}
	}

	static void method1243(RSByteBuffer class572_sub15, long l) {
		Class383 class383;
		if (Class13.aString99 != null && Class13.aString99.length() == 6) {
			if (Class13.aBool75)
				class383 = Class383.aClass383_4605;
			else
				class383 = Class383.aClass383_4604;
		} else if (Class494.aClass8_5490.method515(l))
			class383 = Class383.aClass383_4608;
		else
			class383 = Class383.aClass383_4606;
		class572_sub15.writeByte(class383.getId(132682908), -1384395473);
		switch (class383.anInt4609 * -1382742533) {
			case 3:
				class572_sub15.o += 1241575020;
				break;
			case 0:
			case 2:
				class572_sub15.write24BitInteger(Integer.parseInt(Class13.aString99), 284991974);
				class572_sub15.o += 310393755;
				break;
			case 1:
				class572_sub15.writeInt(Class494.aClass8_5490.method516(l), -1743753997);
				break;
		}
	}

	static void method1244(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2]), -1184713537))).method4672(Class133_Sub23.playerVarsProvider, (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), (byte) -12)) ? 1 : 0;
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	static final void method1245(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt842 * -1681379547;
	}

	static final void method1246(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (client.anInt8861 * 1472719885 == 2 && i_1_ < 681720871 * client.anInt8860) {
			Class26 class26 = client.aClass26Array8863[i_1_];
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class26.aString209;
			if (class26.aString206 != null)
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = class26.aString206;
			else
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = "";
		} else {
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}

	static final void method1247(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 2569);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class307.method4018(class73, class83, class441, (byte) 95);
	}
}
