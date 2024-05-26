package game;

/* Class572_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub1 extends Class572_Sub12 implements Interface17, Interface73 {
	public int anInt11247;
	public int[] anIntArray11248;
	public int anInt11249 = 0;
	public int[] anIntArray11250;
	public static int anInt11251;
	static int anInt11252;

	Class572_Sub12_Sub1() {
		anInt11247 = 0;
	}

	public void method469(int i) {
		/* empty */
	}

	void method10219(RSByteBuffer class572_sub15, int i, int i_0_) {
		if (i == 2)
			anInt11247 = class572_sub15.readUnsignedShort(647518597) * 157390597;
		else if (i == 4) {
			anInt11249 = class572_sub15.readUnsignedByte(2029692968) * 1019946753;
			anIntArray11248 = new int[anInt11249 * -333063935];
			anIntArray11250 = new int[anInt11249 * -333063935];
			for (int i_1_ = 0; i_1_ < anInt11249 * -333063935; i_1_++) {
				anIntArray11248[i_1_] = class572_sub15.readUnsignedShort(647518597);
				anIntArray11250[i_1_] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(550708833);
			if (0 == i)
				break;
			method10219(class572_sub15, i, -2032935595);
		}
	}

	public void method468(int i, int i_2_) {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_3_ = class572_sub15.readUnsignedByte(-19728307);
			if (0 == i_3_)
				break;
			method10219(class572_sub15, i_3_, -2032935595);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(974610615);
			if (0 == i)
				break;
			method10219(class572_sub15, i, -2032935595);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1026122263);
			if (0 == i)
				break;
			method10219(class572_sub15, i, -2032935595);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(5065787);
			if (0 == i)
				break;
			method10219(class572_sub15, i, -2032935595);
		}
	}

	public void method112() {
		/* empty */
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	void method10220(RSByteBuffer class572_sub15, int i) {
		if (i == 2)
			anInt11247 = class572_sub15.readUnsignedShort(647518597) * 157390597;
		else if (i == 4) {
			anInt11249 = class572_sub15.readUnsignedByte(1394247483) * 1019946753;
			anIntArray11248 = new int[anInt11249 * -333063935];
			anIntArray11250 = new int[anInt11249 * -333063935];
			for (int i_4_ = 0; i_4_ < anInt11249 * -333063935; i_4_++) {
				anIntArray11248[i_4_] = class572_sub15.readUnsignedShort(647518597);
				anIntArray11250[i_4_] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	void method10221(RSByteBuffer class572_sub15, int i) {
		if (i == 2)
			anInt11247 = class572_sub15.readUnsignedShort(647518597) * 157390597;
		else if (i == 4) {
			anInt11249 = class572_sub15.readUnsignedByte(749893711) * 1019946753;
			anIntArray11248 = new int[anInt11249 * -333063935];
			anIntArray11250 = new int[anInt11249 * -333063935];
			for (int i_5_ = 0; i_5_ < anInt11249 * -333063935; i_5_++) {
				anIntArray11248[i_5_] = class572_sub15.readUnsignedShort(647518597);
				anIntArray11250[i_5_] = class572_sub15.readUnsignedShort(647518597);
			}
		}
	}

	static final void method10222(Cs2Executor class441, int i) {
		Class120.method2180(1879206078);
		Class25.aBool191 = false;
	}

	static void method10223(int i, int i_6_) {
		for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(2129089948))) {
			if (Class281.method3800((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 * -44467871), -2085312969) && i == 200110927 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11392 >> 16)
				Class607.method7250(class572_sub12_sub10, -1632383228);
		}
	}
}
