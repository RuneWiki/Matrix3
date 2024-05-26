package game;

/* Class572_Sub16_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub16_Sub4 extends Class572_Sub16 {
	int anInt10985;
	boolean aBool10986;
	Class336 this$0;

	void method8563(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub4) this).anInt10985 = class572_sub15.readUnsignedShort(647518597) * 1034925921;
		((Class572_Sub16_Sub4) this).aBool10986 = class572_sub15.readUnsignedByte(1965994105) == 1;
	}

	void method8565(RSByteBuffer class572_sub15, int i) {
		((Class572_Sub16_Sub4) this).anInt10985 = class572_sub15.readUnsignedShort(647518597) * 1034925921;
		((Class572_Sub16_Sub4) this).aBool10986 = class572_sub15.readUnsignedByte(346295486) == 1;
	}

	void method8560(Class334 class334, byte i) {
		class334.method4194((1754868897 * ((Class572_Sub16_Sub4) this).anInt10985), ((Class572_Sub16_Sub4) this).aBool10986, 747232668);
	}

	void method8562(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub4) this).anInt10985 = class572_sub15.readUnsignedShort(647518597) * 1034925921;
		((Class572_Sub16_Sub4) this).aBool10986 = class572_sub15.readUnsignedByte(1686037979) == 1;
	}

	void method8561(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub4) this).anInt10985 = class572_sub15.readUnsignedShort(647518597) * 1034925921;
		((Class572_Sub16_Sub4) this).aBool10986 = class572_sub15.readUnsignedByte(822021900) == 1;
	}

	void method8564(Class334 class334) {
		class334.method4194((1754868897 * ((Class572_Sub16_Sub4) this).anInt10985), ((Class572_Sub16_Sub4) this).aBool10986, 2035429545);
	}

	Class572_Sub16_Sub4(Class336 class336) {
		((Class572_Sub16_Sub4) this).this$0 = class336;
		((Class572_Sub16_Sub4) this).anInt10985 = -1034925921;
	}

	void method8566(Class334 class334) {
		class334.method4194((1754868897 * ((Class572_Sub16_Sub4) this).anInt10985), ((Class572_Sub16_Sub4) this).aBool10986, 1726221830);
	}

	void method8559(Class334 class334) {
		class334.method4194((1754868897 * ((Class572_Sub16_Sub4) this).anInt10985), ((Class572_Sub16_Sub4) this).aBool10986, 620427464);
	}

	public static boolean method10068(int i, short i_0_) {
		return (i >= 1870735441 * Class516.aClass516_5722.anInt5742 && i <= Class516.aClass516_5734.anInt5742 * 1870735441);
	}
}
