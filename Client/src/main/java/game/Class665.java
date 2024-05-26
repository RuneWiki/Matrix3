package game;

/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class665 {
	protected static final int anInt8491 = 2;
	protected static final int anInt8492 = 1;
	public static final int anInt8493 = 3;
	protected Class572_Sub24 aClass572_Sub24_8494;
	protected int volume;

	abstract void method7855(int i);

	abstract int method7856(int i);

	abstract int method7857(int i);

	abstract int method7858(byte i);

	void method7859(int i, int i_0_) {
		if (method7863(i, -1214812195) != 3)
			setVolume(i, (byte) 24);
	}

	abstract void setVolume(int i, byte i_1_);

	abstract int method7861();

	abstract int method7862(int i);

	abstract int method7863(int i, int i_2_);

	abstract int method7864(int i);

	Class665(Class572_Sub24 class572_sub24) {
		aClass572_Sub24_8494 = class572_sub24;
		volume = method7858((byte) -113) * 2081142341;
	}

	abstract void method7865(int i);

	Class665(int i, Class572_Sub24 class572_sub24) {
		volume = 2081142341 * i;
		aClass572_Sub24_8494 = class572_sub24;
	}

	void method7866(int i) {
		if (method7863(i, 132956108) != 3)
			setVolume(i, (byte) 107);
	}

	void method7867(int i) {
		if (method7863(i, -1377904402) != 3)
			setVolume(i, (byte) 38);
	}

	public static final void method7868(String string, String string_3_, int i) {
		Class195 class195 = Class166.method2676((byte) 64);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3732, class195.aClass650_2340, 435206607);
		if (string_3_.length() > 30)
			string_3_ = string_3_.substring(0, 30);
		class572_sub25.aRsByteBuffer.writeByte((ObjectDefinitions.method6069(string, -2017326790) + ObjectDefinitions.method6069(string_3_, -1147678493)), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -9);
		class572_sub25.aRsByteBuffer.writeString(string_3_, (byte) -106);
		class195.method2929(class572_sub25, (byte) -97);
	}

	static final void method7869(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		MaterialInformation.method1603(class73, class441, 894979412);
	}
}
