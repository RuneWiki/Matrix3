package game;

/* Class665_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub10 extends Class665 {
	public int method8189() {
		return volume * -767431539;
	}

	void method7855(int i) {
		volume = 2081142341 * i;
	}

	int method7863(int i, int i_0_) {
		return 1;
	}

	int method7858(byte i) {
		return 3;
	}

	public Class665_Sub10(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	void setVolume(int i, byte i_1_) {
		volume = 2081142341 * i;
	}

	public int method8190(int i) {
		return volume * -767431539;
	}

	int method7861() {
		return 3;
	}

	int method7862(int i) {
		return 1;
	}

	int method7856(int i) {
		return 1;
	}

	int method7864(int i) {
		return 1;
	}

	public Class665_Sub10(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	public void method8191() {
		if (volume * -767431539 < 0 || -767431539 * volume > 4)
			volume = method7858((byte) -106) * 2081142341;
	}

	public void method8192() {
		if (volume * -767431539 < 0 || -767431539 * volume > 4)
			volume = method7858((byte) -96) * 2081142341;
	}

	void method7865(int i) {
		volume = 2081142341 * i;
	}

	public void method8193(int i) {
		if (volume * -767431539 < 0 || -767431539 * volume > 4)
			volume = method7858((byte) -105) * 2081142341;
	}

	public int method8194() {
		return volume * -767431539;
	}

	public int method8195() {
		return volume * -767431539;
	}

	int method7857(int i) {
		return 1;
	}

	public int method8196() {
		return volume * -767431539;
	}

	static final void method8197(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class531.method6344(class73, class441, (byte) 4);
	}

	public static Class375 method8198(RSByteBuffer class572_sub15, byte i) {
		Class375_Sub1 class375_sub1 = (Class375_Sub1) Class279.method3765(class572_sub15, 1404876633);
		int i_2_ = class572_sub15.readShort(-710976385);
		return new Class375_Sub1_Sub1(class375_sub1.aClass320_4560, class375_sub1.aClass300_4556, -1706069299 * class375_sub1.anInt4557, class375_sub1.anInt4558 * -1354888403, class375_sub1.anInt4559 * -139432737, -670814997 * class375_sub1.anInt4562, -1271031675 * class375_sub1.anInt4561, class375_sub1.anInt4563 * -857233559, -983568713 * class375_sub1.anInt4555, 1272757203 * class375_sub1.anInt9421, class375_sub1.anInt9418 * 279216161, class375_sub1.anInt9419 * -1920095593, -1242571089 * class375_sub1.anInt9420, class375_sub1.anInt9422 * 265336869, class375_sub1.anInt9417 * -870755199, i_2_);
	}
}
