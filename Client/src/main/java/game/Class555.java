package game;

/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class555 {
	public abstract void method6558(int i);

	public abstract boolean method6559(int i, int i_0_) throws IOException;

	public abstract int method6560(byte[] is, int i, int i_1_, int i_2_) throws IOException;

	public abstract void method6561(byte[] is, int i, int i_3_) throws IOException;

	public abstract void method6562();

	public abstract int method6563(byte i) throws IOException;

	public abstract void method6564(int i);

	Class555() {
		/* empty */
	}

	public abstract int method6565(byte[] is, int i, int i_4_) throws IOException;

	public abstract int method6566(byte[] is, int i, int i_5_) throws IOException;

	public abstract int method6567(byte[] is, int i, int i_6_) throws IOException;

	public abstract void method6568(byte[] is, int i, int i_7_) throws IOException;

	public abstract boolean method6569(int i) throws IOException;

	public abstract void method6570(byte[] is, int i, int i_8_, byte i_9_) throws IOException;

	public abstract void method6571();

	public abstract void method6572();

	static final void method6573(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class537.method6385(class73, class83, class441, -1435471458);
	}

	static final void method6574(Cs2Executor class441, int i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class460.anIntArray4096[i_10_ & 0xffff];
	}

	public static void method6575(InterfaceDefinitions class73, short i) {
		if (client.anInt8818 * -330568105 == class73.anInt928 * 1312588281)
			client.aBoolArray8784[class73.anInt927 * 1525996737] = true;
	}

	static final void method6576(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -915372029;
		int i_11_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_13_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_14_ = (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_15_ = (((Cs2Executor) class441).intStack[4 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_11_, i_12_, i_14_, Class126.aClass126_1509.method2215(-1854400851), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_15_, i_13_);
	}
}
