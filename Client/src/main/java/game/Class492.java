package game;

/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class492 {
	public static final int anInt5482 = 6;

	Class492() throws Throwable {
		throw new Error();
	}

	static final void method5865(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool785 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 11675);
	}

	static final void method5866(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class639_Sub4.method8896(class73, class83, class441, 813798799);
	}

	static final void method5867(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class26.aClass564_216.method6653(-1601262847) ? 1 : 0;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class26.aClass564_216.method6654((byte) -61) ? 1 : 0;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class26.aClass564_216.method6662(-185135602) ? 1 : 0;
	}

	static final void method5868(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (2 == 1472719885 * client.anInt8861 && i_0_ < 681720871 * client.anInt8860)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.aClass26Array8863[i_0_].aBool212 ? 1 : 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method5869(Cs2Executor class441, int i) {
		Class84.method1271((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), -1, -1, false, -1942116259);
	}

	static final void method5870(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6461(i_1_);
		if (class572_sub12_sub5 == null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1186523151 * class572_sub12_sub5.anInt11326;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub5.anInt11328 * -1560625877;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 949322831 * class572_sub12_sub5.anInt11327;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub5.anInt11329 * -1909732425;
		}
	}

	static final void method5871(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int[] is = Class665_Sub11.method8207(string, class441, -1335368520);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray872 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.anIntArray873 = is;
		class73.aBool857 = true;
	}

	static int method5872(Interface13 interface13, Interface18 interface18, byte i) {
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < interface18.method113((byte) 11); i_3_++) {
			Class386 class386 = (Class386) interface18.getDefinition(i_3_, -323571882);
			if (class386.method4667(interface13, (byte) 35))
				i_2_ += class386.anInt4625 * 775764151;
		}
		return i_2_;
	}

	static Class527 method5873(RSByteBuffer class572_sub15, byte i) {
		int i_4_ = class572_sub15.readUnsignedByte(570391778);
		int i_5_ = class572_sub15.readUnsignedByte(1777316095);
		int i_6_ = class572_sub15.readUnsignedByte(910550662);
		int[] is = new int[i_6_];
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
			is[i_7_] = class572_sub15.readUnsignedByte(1947140024);
		return new Class527(i_4_, i_5_, is);
	}
}
