package game;

/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class511 implements Interface52 {
	public static Class511 aClass511_5695 = new Class511(0);
	public static Class511 aClass511_5696 = new Class511(1);
	public static Class511 aClass511_5697 = new Class511(2);
	int anInt5698;

	public int method61() {
		return 222503281 * ((Class511) this).anInt5698;
	}

	public int getId(int i) {
		return 222503281 * ((Class511) this).anInt5698;
	}

	public int method143() {
		return 222503281 * ((Class511) this).anInt5698;
	}

	public int method45() {
		return 222503281 * ((Class511) this).anInt5698;
	}

	Class511(int i) {
		((Class511) this).anInt5698 = i * -200048751;
	}

	public int method43() {
		return 222503281 * ((Class511) this).anInt5698;
	}

	static final void method6077(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class26.aClass564_216.method6658((byte) -38);
	}

	static final void method6078(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_0_, 1073885120));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class645.method7635(575416907);
	}

	static final void method6079(Cs2Executor class441, byte i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method854(i_1_, 1493492562).method2099((byte) 42);
	}

	static final void method6080(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_2_ >= 1 && i_2_ <= 2) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub20_9234), i_2_, 948549380);
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub20_9204), i_2_, 2125455446);
			Class623.method7443(-1865795086);
		}
	}

	public static Class313 method6081(RSByteBuffer class572_sub15, byte i) {
		String string = class572_sub15.readString(1295706626);
		Class320 class320 = (Class133_Sub20.method9537(272383510)[class572_sub15.readUnsignedByte(1586344760)]);
		Class300 class300 = (Class480.method5718(602516429)[class572_sub15.readUnsignedByte(1403753075)]);
		int i_3_ = class572_sub15.readShort(-710976385);
		int i_4_ = class572_sub15.readShort(-710976385);
		int i_5_ = class572_sub15.readUnsignedByte(114894012);
		int i_6_ = class572_sub15.readUnsignedByte(261872858);
		int i_7_ = class572_sub15.readUnsignedByte(271128333);
		int i_8_ = class572_sub15.readUnsignedShort(647518597);
		int i_9_ = class572_sub15.readUnsignedShort(647518597);
		int i_10_ = class572_sub15.readBigSmart((byte) 109);
		int i_11_ = class572_sub15.readInt(811424030);
		int i_12_ = class572_sub15.readInt(882245794);
		return new Class313(string, class320, class300, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_);
	}
}
