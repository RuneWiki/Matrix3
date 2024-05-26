package game;

/* Class651 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class651 implements Interface52 {
	static Class651 aClass651_8378;
	public static Class651 aClass651_8379;
	static Class651 aClass651_8380 = new Class651(-1);
	static Class651 aClass651_8381;
	public static Class651 aClass651_8382;
	public static Class651 aClass651_8383;
	static Class651 aClass651_8384;
	static Class651 aClass651_8385;
	int anInt8386;
	public static Class651 aClass651_8387;
	static Class651 aClass651_8388;

	public int method43() {
		return ((Class651) this).anInt8386 * 2101594675;
	}

	Class651(int i) {
		((Class651) this).anInt8386 = i * -803979013;
	}

	static {
		aClass651_8379 = new Class651(-2);
		aClass651_8387 = new Class651(-3);
		aClass651_8381 = new Class651(-4);
		aClass651_8382 = new Class651(-5);
		aClass651_8383 = new Class651(2);
		aClass651_8384 = new Class651(3);
		aClass651_8385 = new Class651(7);
		aClass651_8378 = new Class651(9);
		aClass651_8388 = new Class651(37);
	}

	public int getId(int i) {
		return ((Class651) this).anInt8386 * 2101594675;
	}

	public int method45() {
		return ((Class651) this).anInt8386 * 2101594675;
	}

	public int method143() {
		return ((Class651) this).anInt8386 * 2101594675;
	}

	public int method61() {
		return ((Class651) this).anInt8386 * 2101594675;
	}

	static final void method7693(Cs2Executor class441, byte i) {
		if (0 != ((Cs2Executor) class441).callStackPtr * -1384972465) {
			Cs2CallPointer class475 = (((Cs2Executor) class441).callStack[(((Cs2Executor) class441).callStackPtr -= 528398255) * -1384972465]);
			((Cs2Executor) class441).current = ((Cs2CallPointer) class475).script;
			((Cs2Executor) class441).aClass574Array5107 = (((Cs2Executor) class441).current.aClass574Array11379);
			((Cs2Executor) class441).anIntArray5124 = (((Cs2Executor) class441).current.anIntArray11380);
			((Cs2Executor) class441).instrPtr = ((Cs2CallPointer) class475).instrPtr * 526646869;
			((Cs2Executor) class441).intLocals = ((Cs2CallPointer) class475).intLocals;
			((Cs2Executor) class441).objectLocals = ((Cs2CallPointer) class475).objectLocals;
			((Cs2Executor) class441).longLocals = ((Cs2CallPointer) class475).longLocals;
		}
	}

	static final void method7694(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class195 class195 = Class166.method2676((byte) 26);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3696, class195.aClass650_2340, -726348406);
		class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
		int i_1_ = class572_sub25.aRsByteBuffer.o * -1585139053;
		class572_sub25.aRsByteBuffer.writeByte(i_0_, -1384395473);
		class572_sub25.aRsByteBuffer.writeShort(-1986499651 * ((Cs2Executor) class441).aClass305_5105.anInt3541, -1646498080);
		((Cs2Executor) class441).aClass305_5105.aClass572_Sub12_Sub15_3540.method10424(class572_sub25.aRsByteBuffer, ((Cs2Executor) class441).aClass305_5105.anIntArray3539, (byte) 0);
		class572_sub25.aRsByteBuffer.method8552((class572_sub25.aRsByteBuffer.o * -1585139053 - i_1_), -1106558390);
		class195.method2929(class572_sub25, (byte) -4);
	}
}
