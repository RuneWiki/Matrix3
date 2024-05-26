package game;

/* Class133_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub14 extends Class133 {
	int anInt9947;
	public static Class248 aClass248_9948;

	public void method2309() {
		Class442.aClass120Array5129[1269942205 * ((Class133_Sub14) this).anInt9947].method2169(-400142490);
	}

	public void method2303(int i) {
		Class442.aClass120Array5129[1269942205 * ((Class133_Sub14) this).anInt9947].method2169(930220374);
	}

	Class133_Sub14(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub14) this).anInt9947 = class572_sub15.readUnsignedShort(647518597) * 864168853;
	}

	static byte method9371(int i, int i_0_, byte i_1_) {
		if (i != Class516.aClass516_5720.anInt5742 * 1870735441)
			return (byte) 0;
		if ((i_0_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}
}
