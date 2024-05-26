package game;

/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class504 {
	public int[] anIntArray5577;
	public static final int anInt5578 = 1;
	static final int anInt5579 = 2;
	public int[] anIntArray5580;
	public int anInt5581 = 45974377;
	public int anInt5582 = -1668408473;
	public int[] anIntArray5583;
	public static final int anInt5584 = 0;

	void method6021(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(839497122);
			if (0 == i_0_)
				break;
			if (1 == i_0_) {
				int i_1_ = class572_sub15.readUnsignedByte(144632858);
				anIntArray5580 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < anIntArray5580.length; i_2_++) {
					anIntArray5580[i_2_] = class572_sub15.readUnsignedByte(19440565);
					if (anIntArray5580[i_2_] != 0 && 2 != anIntArray5580[i_2_]) {
						/* empty */
					}
				}
			} else if (i_0_ == 3)
				anInt5581 = class572_sub15.readUnsignedByte(365457810) * -45974377;
			else if (4 == i_0_)
				anInt5582 = class572_sub15.readUnsignedByte(-46623098) * 1668408473;
			else if (i_0_ == 5) {
				anIntArray5583 = new int[class572_sub15.readUnsignedByte(-71379634)];
				for (int i_3_ = 0; i_3_ < anIntArray5583.length; i_3_++)
					anIntArray5583[i_3_] = class572_sub15.readUnsignedByte(1192511255);
			} else if (6 == i_0_) {
				anIntArray5577 = new int[class572_sub15.readUnsignedByte(182362861)];
				for (int i_4_ = 0; i_4_ < anIntArray5577.length; i_4_++)
					anIntArray5577[i_4_] = class572_sub15.readUnsignedByte(564133566);
			}
		}
		if (anIntArray5580 == null)
			throw new RuntimeException("");
	}

	public Class504(Class248 class248) {
		byte[] is = class248.method3373((960259487 * Class471.aClass471_5289.anInt5290), (byte) -3);
		method6021(new RSByteBuffer(is), 2112106803);
	}

	void method6022(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(238119784);
			if (0 == i)
				break;
			if (1 == i) {
				int i_5_ = class572_sub15.readUnsignedByte(2025142684);
				anIntArray5580 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < anIntArray5580.length; i_6_++) {
					anIntArray5580[i_6_] = class572_sub15.readUnsignedByte(-7960065);
					if (anIntArray5580[i_6_] != 0 && 2 != anIntArray5580[i_6_]) {
						/* empty */
					}
				}
			} else if (i == 3)
				anInt5581 = class572_sub15.readUnsignedByte(2015526011) * -45974377;
			else if (4 == i)
				anInt5582 = class572_sub15.readUnsignedByte(390203106) * 1668408473;
			else if (i == 5) {
				anIntArray5583 = new int[class572_sub15.readUnsignedByte(1806438909)];
				for (int i_7_ = 0; i_7_ < anIntArray5583.length; i_7_++)
					anIntArray5583[i_7_] = class572_sub15.readUnsignedByte(1992199978);
			} else if (6 == i) {
				anIntArray5577 = new int[class572_sub15.readUnsignedByte(733866855)];
				for (int i_8_ = 0; i_8_ < anIntArray5577.length; i_8_++)
					anIntArray5577[i_8_] = class572_sub15.readUnsignedByte(2043420730);
			}
		}
		if (anIntArray5580 == null)
			throw new RuntimeException("");
	}

	static final void method6023(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		InterfaceDefinitions class73_9_ = Class76.method1152(class83, class73, (short) -4406);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73_9_ == null ? -1 : -1718435171 * class73_9_.selfId;
	}

	static final void method6024(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_10_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_11_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		InterfaceDefinitions class73 = Class530.method6338(i_10_ << 16 | i_11_, i_12_, 2079798378);
		Class131.method2286(-1705608345);
		Class572_Sub30 class572_sub30 = client.method7992(class73);
		Class639_Sub16.method8968(class73, class572_sub30.method8647((byte) 0), class572_sub30.anInt9302 * 1054444675, 16711935);
	}

	static final void method6025(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method6026(Cs2Executor class441, int i) throws Exception_Sub4 {
		int i_13_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class133_Sub1.aClass411_Sub1_9827.method4971(BaseVarType.method7259(i_13_, (byte) -35), true, 128070272);
		client.aBool8685 = true;
	}

	public static Class649 method6027(String string, String string_14_, boolean bool, int i) {
		File file = new File(Class622.aFile8068, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class649 class649;
				try {
					Class649 class649_15_ = new Class649(file, "rw", 10000L);
					class649 = class649_15_;
				} catch (IOException ioexception) {
					break;
				}
				return class649;
			}
		} while (false);
		String string_16_ = "";
		if (Class381.anInt4602 * 253532407 == 33)
			string_16_ = "_rc";
		else if (253532407 * Class381.anInt4602 == 34)
			string_16_ = "_wip";
		File file_17_ = new File(Class302.aString3530, new StringBuilder().append("jagex_").append(string_14_).append("_preferences").append(string).append(string_16_).append(".dat").toString());
		do {
			if (!bool && file_17_.exists()) {
				Class649 class649;
				try {
					Class649 class649_18_ = new Class649(file_17_, "rw", 10000L);
					class649 = class649_18_;
				} catch (IOException ioexception) {
					break;
				}
				return class649;
			}
		} while (false);
		Class649 class649;
		try {
			Class649 class649_19_ = new Class649(file, "rw", 10000L);
			class649 = class649_19_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class649;
	}
}
