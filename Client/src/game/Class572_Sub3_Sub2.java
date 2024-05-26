package game;

/* Class572_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub3_Sub2 extends Class572_Sub3 {
	int anInt10990;
	byte aByte10991;
	int anInt10992;
	String aString10993;
	Class420 this$0;

	void method8262(RSByteBuffer class572_sub15, int i) {
		((Class572_Sub3_Sub2) this).anInt10990 = class572_sub15.readUnsignedShort(647518597) * -276982587;
		((Class572_Sub3_Sub2) this).aByte10991 = class572_sub15.readByte(889120723);
		((Class572_Sub3_Sub2) this).anInt10992 = class572_sub15.readUnsignedShort(647518597) * 514835119;
		class572_sub15.method8476((byte) 4);
		((Class572_Sub3_Sub2) this).aString10993 = class572_sub15.readString(1295706626);
	}

	void method8265(RSByteBuffer class572_sub15) {
		((Class572_Sub3_Sub2) this).anInt10990 = class572_sub15.readUnsignedShort(647518597) * -276982587;
		((Class572_Sub3_Sub2) this).aByte10991 = class572_sub15.readByte(1348742221);
		((Class572_Sub3_Sub2) this).anInt10992 = class572_sub15.readUnsignedShort(647518597) * 514835119;
		class572_sub15.method8476((byte) 4);
		((Class572_Sub3_Sub2) this).aString10993 = class572_sub15.readString(1295706626);
	}

	void method8261(Class572_Sub10 class572_sub10, int i) {
		Class343 class343 = (class572_sub10.aClass343Array9084[235719181 * ((Class572_Sub3_Sub2) this).anInt10990]);
		class343.aByte4360 = ((Class572_Sub3_Sub2) this).aByte10991;
		class343.anInt4359 = ((Class572_Sub3_Sub2) this).anInt10992 * 1212222765;
		class343.aString4361 = ((Class572_Sub3_Sub2) this).aString10993;
	}

	Class572_Sub3_Sub2(Class420 class420) {
		((Class572_Sub3_Sub2) this).this$0 = class420;
		((Class572_Sub3_Sub2) this).anInt10990 = 276982587;
	}

	void method8263(RSByteBuffer class572_sub15) {
		((Class572_Sub3_Sub2) this).anInt10990 = class572_sub15.readUnsignedShort(647518597) * -276982587;
		((Class572_Sub3_Sub2) this).aByte10991 = class572_sub15.readByte(853548091);
		((Class572_Sub3_Sub2) this).anInt10992 = class572_sub15.readUnsignedShort(647518597) * 514835119;
		class572_sub15.method8476((byte) 4);
		((Class572_Sub3_Sub2) this).aString10993 = class572_sub15.readString(1295706626);
	}

	void method8264(Class572_Sub10 class572_sub10) {
		Class343 class343 = (class572_sub10.aClass343Array9084[235719181 * ((Class572_Sub3_Sub2) this).anInt10990]);
		class343.aByte4360 = ((Class572_Sub3_Sub2) this).aByte10991;
		class343.anInt4359 = ((Class572_Sub3_Sub2) this).anInt10992 * 1212222765;
		class343.aString4361 = ((Class572_Sub3_Sub2) this).aString10993;
	}

	static final void method10073(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class102.method1641((char) i_0_, 1687600561) ? 1 : 0;
	}
}
