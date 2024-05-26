package game;

/* Class133_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub21 extends Class133 {
	int anInt10355;
	int anInt10356;

	public void method2309() {
		Class122.aClass130Array1483[((Class133_Sub21) this).anInt10356 * -1852838757].method2268(1951016484).method10516(((Class133_Sub21) this).anInt10355 * -834555509, true, 648650492);
	}

	public void method2303(int i) {
		Class122.aClass130Array1483[((Class133_Sub21) this).anInt10356 * -1852838757].method2268(-490315237).method10516(((Class133_Sub21) this).anInt10355 * -834555509, true, 648650492);
	}

	Class133_Sub21(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub21) this).anInt10356 = class572_sub15.readUnsignedShort(647518597) * 952113555;
		((Class133_Sub21) this).anInt10355 = class572_sub15.readUnsignedShort(647518597) * 1771138595;
	}

	public static Interface57 method9565(RSByteBuffer class572_sub15, int i) {
		Class506 class506 = Class16.method671(class572_sub15.readUnsignedByte(2104922867), (byte) 33);
		if (class506 == Class506.aClass506_5596)
			return Class492.method5873(class572_sub15, (byte) 0);
		if (Class506.aClass506_5594 == class506)
			return Class336.method4235(class572_sub15, 136378691);
		if (Class506.aClass506_5595 == class506)
			return Class133_Sub20.method9536(class572_sub15, 88452601);
		return null;
	}
}
