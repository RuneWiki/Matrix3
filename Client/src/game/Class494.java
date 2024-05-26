package game;

/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class494 {
	public Interface57 anInterface57_5489;
	public static Class8 aClass8_5490;

	void method5896(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(469460277);
			if (i_0_ == 0)
				break;
			if (i_0_ == 1)
				anInterface57_5489 = Class133_Sub21.method9565(class572_sub15, -202953925);
		}
	}

	void method5897(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1915625221);
			if (i == 0)
				break;
			if (i == 1)
				anInterface57_5489 = Class133_Sub21.method9565(class572_sub15, -936253245);
		}
	}

	public Class494(Class248 class248) {
		byte[] is = class248.method3373((960259487 * Class471.aClass471_5287.anInt5290), (byte) -4);
		if (is != null)
			method5896(new RSByteBuffer(is), -992431393);
	}

	public static void method5898(int i) {
		synchronized (Class474.aClass127_5325) {
			Class474.aClass127_5325.method2231((byte) -104);
		}
		synchronized (Class474.aClass127_5323) {
			Class474.aClass127_5323.method2231((byte) -97);
		}
	}

	static final void method5899(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class622.method7441(class73, class83, class441, 1580346191);
	}

	static final void method5900(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921) == 1 ? 1 : 0;
	}

	static Class437[] method5901(int i) {
		return (new Class437[] { Class437.aClass437_5071, Class437.aClass437_5068, Class437.aClass437_5069, Class437.aClass437_5073, Class437.aClass437_5072, Class437.aClass437_5070 });
	}

	static final void method5902(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -674);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class286.method3868(class73, class83, class441, -1899316808);
	}

	public static Class564 method5903(Component component, boolean bool, int i) {
		return new Class564_Sub1(component, bool);
	}

	static final void method5904(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		if ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) > (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]));
	}

	static final void method5905(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub16_9236, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) != 0) ? 1 : 0, 1986523384);
		Class623.method7443(-1519017289);
	}

	public static void method5906(String string, String string_2_, int i, boolean bool, String string_3_, int i_4_) {
		if (client.anInt8580 * 835742603 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3727, client.aClass195_8632.aClass650_2340, 195063468);
			class572_sub25.aRsByteBuffer.writeShort(0, -2030400551);
			int i_5_ = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -99);
			class572_sub25.aRsByteBuffer.writeString(string_2_, (byte) -20);
			class572_sub25.aRsByteBuffer.writeByte(i, -1384395473);
			class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
			class572_sub25.aRsByteBuffer.writeString(string_3_, (byte) -53);
			class572_sub25.aRsByteBuffer.o += -2122211011;
			class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_5_, (-1585139053 * class572_sub25.aRsByteBuffer.o), 2067566567);
			class572_sub25.aRsByteBuffer.method8464((-1585139053 * class572_sub25.aRsByteBuffer.o) - i_5_, -1404479454);
			client.aClass195_8632.method2929(class572_sub25, (byte) -125);
			if (i < 13) {
				client.aBool8602 = true;
				Class423_Sub2.method9279(-787746092);
			}
			Class16.aClass662_129 = Class662.aClass662_8454;
		}
	}

	static void method5907(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(20, (long) i_6_ << 32 | (long) i);
		class572_sub12_sub11.method10338(2042903017);
		((GameTask) class572_sub12_sub11).p1 = 720886855 * i_7_;
		((GameTask) class572_sub12_sub11).p2 = i_8_ * 1921029481;
	}
}
