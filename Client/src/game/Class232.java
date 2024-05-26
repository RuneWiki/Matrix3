package game;

/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class232 {
	int anInt2628;
	int anInt2629;
	int anInt2630;
	byte[] aByteArray2631;
	public static Class202_Sub1_Sub2 aClass202_Sub1_Sub2_2632;

	Class232(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
		((Class232) this).anInt2630 = -1542214055 * i;
		((Class232) this).anInt2628 = i_0_ * 1293621043;
		((Class232) this).anInt2629 = 1785344015 * i_1_;
		((Class232) this).aByteArray2631 = is;
	}

	public static int method3215(int i, int i_3_, int i_4_) {
		Class520.aTwitchWebcamFrameData5807 = new TwitchWebcamFrameData();
		if (i < 0 || i >= Class520.aTwitchWebcamDeviceArray5812.length)
			return -1;
		return (Class572_Sub2.aTwitchTV8969.StartWebcamDevice((Class520.aTwitchWebcamDeviceArray5812[i].anInt2059 * 1798659347), i_3_));
	}

	static final void method3216(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) -13600);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class537.method6385(class73, class83, class441, 704744857);
	}

	static final void method3217(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub29 class572_sub29 = (Class572_Sub29) client.aClass676_8760.get((long) i_6_);
		if (class572_sub29 != null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method3218(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_7_ < 0 || i_7_ > 1)
			i_7_ = 0;
		Class513.method6088(i_7_ == 1, -837306223);
	}

	static final void method3219(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		boolean bool = 1 == (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		boolean bool_8_ = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]) == 1);
		Class133_Sub1.aClass411_Sub1_9827.method5016(bool, bool_8_, -1042067865);
	}

	static InterfaceDefinitions method3220(InterfaceDefinitions class73, byte i) {
		InterfaceDefinitions class73_9_ = client.method7993(class73);
		if (null == class73_9_)
			class73_9_ = class73.aClass73_852;
		return class73_9_;
	}

	static final void method3221(Cs2Executor class441, byte i) {
		if (1 == Class18.anInt143 * 625220759)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) >> 3;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (int) client.aFloat8678 >> 3;
	}

	static final void method3222(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_10_ = (String) (((Cs2Executor) class441).objectStack[1 + 1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		if (null == string_10_)
			string_10_ = "";
		if (string_10_.length() > 80)
			string_10_ = string_10_.substring(0, 80);
		Class195 class195 = Class166.method2676((byte) 47);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3719, class195.aClass650_2340, -1745568822);
		class572_sub25.aRsByteBuffer.writeByte((ObjectDefinitions.method6069(string, -1289305483) + 2 + ObjectDefinitions.method6069(string_10_, -1619224632)), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -95);
		class572_sub25.aRsByteBuffer.writeByte(i_11_ - 1, -1384395473);
		class572_sub25.aRsByteBuffer.writeByte(i_12_, -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string_10_, (byte) -55);
		class195.method2929(class572_sub25, (byte) -121);
	}

	static void method3223(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = ((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), 1863616571))).aBool4624 ? 1 : 0;
	}
}
