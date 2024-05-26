package game;

/* Class271_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class271_Sub1 extends Class271 implements Interface61 {
	public void method8354(int i, int i_0_) {
		anInt2883 = i * -1343196239;
	}

	public void method299(short i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3752, client.aClass195_8589.aClass650_2340, -1103472948);
		class572_sub25.aRsByteBuffer.write24BitInteger(556665043 * anInt2880, -1355130195);
		class572_sub25.aRsByteBuffer.writeByte(anInt2882 * -70556595, -1384395473);
		class572_sub25.aRsByteBuffer.writeByteC(anInt2883 * -182192815, (byte) -12);
		class572_sub25.aRsByteBuffer.writeShort128(anInt2864 * -1360173935, -16711936);
		class572_sub25.aRsByteBuffer.method8505(anInt2877 * 2132077325, 1786339599);
		class572_sub25.aRsByteBuffer.write24BitInteger(anInt2878 * -886939291, -176812214);
		class572_sub25.aRsByteBuffer.method8505(anInt2879 * -715141369, 1633359216);
		class572_sub25.aRsByteBuffer.writeShortLE128(1603434765 * anInt2876, (byte) 0);
		client.aClass195_8589.method2929(class572_sub25, (byte) -25);
	}

	public void method8355(int i) {
		anInt2882 = 1986688133 * i;
	}

	public void method8356(int i, byte i_1_) {
		anInt2864 = 1462426737 * (-1360173935 * anInt2864 | i);
	}

	public void method8357(int i, int i_2_) {
		anInt2882 = 1986688133 * i;
	}

	public void method8358(int i, int i_3_, int i_4_) {
		if (0 == i && i_3_ > 32767)
			i_3_ = 32767;
		else if (i_3_ > 8388607)
			i_3_ = 8388607;
		switch (i) {
			case 3:
				anInt2879 = 1954705079 * i_3_;
				break;
			case 1:
				anInt2878 = i_3_ * 77981805;
				break;
			case 5:
				anInt2880 = i_3_ * -900231333;
				break;
			case 0:
				anInt2876 = -2054947387 * i_3_;
				break;
		}
	}

	public void method151() {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3752, client.aClass195_8589.aClass650_2340, -232782830);
		class572_sub25.aRsByteBuffer.write24BitInteger(556665043 * anInt2880, 1280609882);
		class572_sub25.aRsByteBuffer.writeByte(anInt2882 * -70556595, -1384395473);
		class572_sub25.aRsByteBuffer.writeByteC(anInt2883 * -182192815, (byte) 55);
		class572_sub25.aRsByteBuffer.writeShort128(anInt2864 * -1360173935, -16711936);
		class572_sub25.aRsByteBuffer.method8505(anInt2877 * 2132077325, 2118703339);
		class572_sub25.aRsByteBuffer.write24BitInteger(anInt2878 * -886939291, -1943529241);
		class572_sub25.aRsByteBuffer.method8505(anInt2879 * -715141369, 2078712669);
		class572_sub25.aRsByteBuffer.writeShortLE128(1603434765 * anInt2876, (byte) -81);
		client.aClass195_8589.method2929(class572_sub25, (byte) -20);
	}

	public void method8359(int i) {
		anInt2883 = i * -1343196239;
	}

	public void method8360(int i) {
		anInt2883 = i * -1343196239;
	}

	public void method8361(int i) {
		anInt2883 = i * -1343196239;
	}

	public void method8362(int i) {
		anInt2864 = 1462426737 * (-1360173935 * anInt2864 | i);
	}

	public void method8363(int i) {
		anInt2882 = 1986688133 * i;
	}

	public void method8364(int i, int i_5_) {
		if (0 == i && i_5_ > 32767)
			i_5_ = 32767;
		else if (i_5_ > 8388607)
			i_5_ = 8388607;
		switch (i) {
			case 3:
				anInt2879 = 1954705079 * i_5_;
				break;
			case 1:
				anInt2878 = i_5_ * 77981805;
				break;
			case 5:
				anInt2880 = i_5_ * -900231333;
				break;
			case 0:
				anInt2876 = -2054947387 * i_5_;
				break;
		}
	}

	public void method8365(int i) {
		anInt2864 = 1462426737 * (-1360173935 * anInt2864 | i);
	}

	public void method8366(int i) {
		anInt2882 = 1986688133 * i;
	}

	public void method8367(int i, int i_6_) {
		if (0 == i && i_6_ > 32767)
			i_6_ = 32767;
		else if (i_6_ > 8388607)
			i_6_ = 8388607;
		switch (i) {
			case 3:
				anInt2879 = 1954705079 * i_6_;
				break;
			case 1:
				anInt2878 = i_6_ * 77981805;
				break;
			case 5:
				anInt2880 = i_6_ * -900231333;
				break;
			case 0:
				anInt2876 = -2054947387 * i_6_;
				break;
		}
	}

	static final void method8368(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_8_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		if (2 != -22820201 * class73.anInt892)
			throw new RuntimeException("");
		NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(class73.anInt803 * -1063203465, 376398896));
		if (null == class73.aClass399_908)
			class73.aClass399_908 = new Class399(class410, false);
		class73.aClass399_908.aLong4723 = Class542.method6439(-1017681363) * -6756611017005174427L;
		if (i_8_ < 0 || i_8_ >= class410.anIntArray4854.length)
			throw new RuntimeException("");
		class73.aClass399_908.anIntArray4720[i_8_] = i_7_;
		Class555.method6575(class73, (short) 23273);
	}

	static final void method8369(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).aClass572_Sub10_5104.aByte9090;
	}

	static final void method8370(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class323.method4125(i_9_ >> 14 & 0x3fff, i_9_ & 0x3fff, (byte) 6);
	}
}
