package game;

/* Class572_Sub3_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub3_Sub5 extends Class572_Sub3 {
	Class420 this$0;
	int anInt11436;
	String aString11437;
	byte aByte11438;

	void method8263(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(1155676076) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
		((Class572_Sub3_Sub5) this).aString11437 = class572_sub15.method8557(-802255086);
		((Class572_Sub3_Sub5) this).anInt11436 = class572_sub15.readUnsignedShort(647518597) * -911572559;
		((Class572_Sub3_Sub5) this).aByte11438 = class572_sub15.readByte(573582245);
		class572_sub15.method8476((byte) 4);
	}

	void method8262(RSByteBuffer class572_sub15, int i) {
		if (class572_sub15.readUnsignedByte(838862077) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
		((Class572_Sub3_Sub5) this).aString11437 = class572_sub15.method8557(-1350064596);
		((Class572_Sub3_Sub5) this).anInt11436 = class572_sub15.readUnsignedShort(647518597) * -911572559;
		((Class572_Sub3_Sub5) this).aByte11438 = class572_sub15.readByte(801499760);
		class572_sub15.method8476((byte) 4);
	}

	void method8261(Class572_Sub10 class572_sub10, int i) {
		Class343 class343 = new Class343();
		class343.aString4361 = ((Class572_Sub3_Sub5) this).aString11437;
		class343.anInt4359 = ((Class572_Sub3_Sub5) this).anInt11436 * 924548531;
		class343.aByte4360 = ((Class572_Sub3_Sub5) this).aByte11438;
		class572_sub10.method8397(class343, -1012199747);
	}

	Class572_Sub3_Sub5(Class420 class420) {
		((Class572_Sub3_Sub5) this).this$0 = class420;
		((Class572_Sub3_Sub5) this).aString11437 = null;
	}

	void method8265(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(1473411670) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
		((Class572_Sub3_Sub5) this).aString11437 = class572_sub15.method8557(-1632127380);
		((Class572_Sub3_Sub5) this).anInt11436 = class572_sub15.readUnsignedShort(647518597) * -911572559;
		((Class572_Sub3_Sub5) this).aByte11438 = class572_sub15.readByte(41204530);
		class572_sub15.method8476((byte) 4);
	}

	void method8264(Class572_Sub10 class572_sub10) {
		Class343 class343 = new Class343();
		class343.aString4361 = ((Class572_Sub3_Sub5) this).aString11437;
		class343.anInt4359 = ((Class572_Sub3_Sub5) this).anInt11436 * 924548531;
		class343.aByte4360 = ((Class572_Sub3_Sub5) this).aByte11438;
		class572_sub10.method8397(class343, -910981748);
	}

	static void method10386(int i, int i_0_, int i_1_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(6, (long) i);
		class572_sub12_sub11.method10338(1872699190);
		((GameTask) class572_sub12_sub11).p1 = 720886855 * i_0_;
	}

	static final void method10387(Cs2Executor class441, int i) {
		int i_2_ = 0;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < Class303.aClass224_Sub1Array3536.length; i_4_++) {
			if (Class303.aClass224_Sub1Array3536[i_4_] != null && Class303.aClass224_Sub1Array3536[i_4_].method8836(-1315818255)) {
				i_2_ += Class303.aClass224_Sub1Array3536[i_4_].method8834(1686729894);
				i_3_ += Class303.aClass224_Sub1Array3536[i_4_].method8835(801081549);
			}
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0 == i_2_ ? 0 : 100 * i_3_ / i_2_;
	}
}
