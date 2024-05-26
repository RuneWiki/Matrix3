package game;

/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class551 implements Interface17, Interface73 {
	int[] anIntArray6302;
	int anInt6303 = -379956947;
	int anInt6304 = -428106967;
	Class554 aClass554_6305 = Class554.aClass554_6317;
	int anInt6306 = 187129933;

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(247899472);
			if (i == 0)
				break;
			method6534(class572_sub15, i, -1418470975);
		}
	}

	public void method468(int i, int i_0_) {
		/* empty */
	}

	void method6534(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (i == 1)
			((Class551) this).anInt6303 = class572_sub15.readUnsignedShort(647518597) * 379956947;
		else if (i == 2) {
			((Class551) this).anIntArray6302 = new int[class572_sub15.readUnsignedByte(1299565331)];
			for (int i_2_ = 0; i_2_ < ((Class551) this).anIntArray6302.length; i_2_++)
				((Class551) this).anIntArray6302[i_2_] = class572_sub15.readUnsignedShort(647518597);
		} else if (3 == i)
			((Class551) this).anInt6304 = class572_sub15.readUnsignedByte(229581934) * 428106967;
		else if (4 == i)
			((Class551) this).aClass554_6305 = ((Class554) Class455.method5387(Class665_Sub1.method8107(-702680908), class572_sub15.readUnsignedByte(1440538127), -2010177028));
		else if (5 == i)
			((Class551) this).anInt6306 = class572_sub15.readBigSmart((byte) 48) * -187129933;
		else if (i == 6)
			class572_sub15.readBigSmart((byte) 55);
	}

	public void method103() {
		/* empty */
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(687848364);
			if (i == 0)
				break;
			method6534(class572_sub15, i, -1007228536);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-51615522);
			if (i == 0)
				break;
			method6534(class572_sub15, i, -530319570);
		}
	}

	public void method112() {
		/* empty */
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-8523113);
			if (i == 0)
				break;
			method6534(class572_sub15, i, 2131892441);
		}
	}

	public void method106() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_3_ = class572_sub15.readUnsignedByte(2146438231);
			if (i_3_ == 0)
				break;
			method6534(class572_sub15, i_3_, -797688406);
		}
	}

	Class551() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	static final void method6535(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) -15471);
		Class83 class83 = Class534.aClass83Array5975[i_4_ >> 16];
		Class288.method3882(class73, class83, class441, 1933560738);
	}

	static final void method6536(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_5_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_6_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_6_, -1367252248));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = ((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_5_, -583324076)).method1162(i_6_, class264.aString2833, 794272869);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_5_, 1236125937)).method1161(i_6_, class264.anInt2832 * -1132777561, -1016940856));
	}

	static final void method6537(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class423_Sub2.anInt9762 * 792485251;
	}

	static void method6538(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 3]);
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2]);
		int i_9_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1]);
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		if (i_7_ > ((Cs2Executor) class441).globalArrayLengths[i_8_])
			throw new RuntimeException();
		if (i_7_ > ((Cs2Executor) class441).globalArrayLengths[i_9_])
			throw new RuntimeException();
		if (i_9_ == i_8_)
			throw new RuntimeException();
		Class530.method6335(((Cs2Executor) class441).globalArrays[i_8_], ((Cs2Executor) class441).globalArrays[i_9_], 0, i_7_ - 1, 726587605);
	}

	public static void method6539(Class572_Sub12 class572_sub12, Class572_Sub12 class572_sub12_10_, int i) {
		if (null != class572_sub12.aClass572_Sub12_9092)
			class572_sub12.method8412(724585842);
		class572_sub12.aClass572_Sub12_9092 = class572_sub12_10_;
		class572_sub12.aClass572_Sub12_9094 = class572_sub12_10_.aClass572_Sub12_9094;
		class572_sub12.aClass572_Sub12_9092.aClass572_Sub12_9094 = class572_sub12;
		class572_sub12.aClass572_Sub12_9094.aClass572_Sub12_9092 = class572_sub12;
	}

	static final void method6540(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class534.method6372(class73, class83, class441, -1506384732);
	}
}
