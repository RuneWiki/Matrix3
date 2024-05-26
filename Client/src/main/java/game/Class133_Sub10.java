package game;

/* Class133_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub10 extends Class133 {
	int anInt9860;
	int anInt9861;

	boolean method2307() {
		Class344.audio.method937((((Class133_Sub10) this).anInt9860 * -494621707), (((Class133_Sub10) this).anInt9861 * 648594549), 1194992176);
		return true;
	}

	Class133_Sub10(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub10) this).anInt9860 = class572_sub15.readUnsignedShort(647518597) * -622172067;
		((Class133_Sub10) this).anInt9861 = class572_sub15.readUnsignedByte(1708882089) * 423357405;
	}

	boolean method2305(int i) {
		Class344.audio.method937((((Class133_Sub10) this).anInt9860 * -494621707), (((Class133_Sub10) this).anInt9861 * 648594549), -1905089585);
		return true;
	}

	public void method2309() {
		Class344.audio.sendMusic((((Class133_Sub10) this).anInt9860 * -494621707));
	}

	boolean method2306() {
		Class344.audio.method937((((Class133_Sub10) this).anInt9860 * -494621707), (((Class133_Sub10) this).anInt9861 * 648594549), -66581912);
		return true;
	}

	public void method2303(int i) {
		Class344.audio.sendMusic((((Class133_Sub10) this).anInt9860 * -494621707));
	}

	boolean method2308() {
		Class344.audio.method937((((Class133_Sub10) this).anInt9860 * -494621707), (((Class133_Sub10) this).anInt9861 * 648594549), 2145443249);
		return true;
	}

	static int method9352(int i, int i_0_, int i_1_) {
		if (i == Class516.aClass516_5738.anInt5742 * 1870735441 || Class516.aClass516_5728.anInt5742 * 1870735441 == i)
			return Class456_Sub1_Sub4_Sub1.anIntArray11548[i_0_ & 0x3];
		return Class456_Sub1_Sub4_Sub1.anIntArray11544[i_0_ & 0x3];
	}
}
