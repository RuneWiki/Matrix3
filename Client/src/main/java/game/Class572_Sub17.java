package game;

/* Class572_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub17 extends Class572 implements Interface25 {
	public int anInt9123;
	public int anInt9124;
	static Class572_Sub17[] aClass572_Sub17Array9125 = new Class572_Sub17[0];
	public int anInt9126;
	public int anInt9127;
	static int anInt9128;

	public Class572_Sub17(int i, int i_0_, int i_1_, int i_2_) {
		anInt9123 = 280995799 * i;
		anInt9126 = 1365537015 * i_0_;
		anInt9127 = 664138447 * i_1_;
		anInt9124 = i_2_ * -683445149;
	}

	void method8569(RSByteBuffer class572_sub15, byte i) {
		class572_sub15.writeByte(anInt9123 * -746112025, -1384395473);
		class572_sub15.writeInt(-862367545 * anInt9126, -1743753997);
		class572_sub15.writeInt(anInt9127 * -930360273, -1743753997);
		class572_sub15.writeInt(-1661817525 * anInt9124, -1743753997);
	}

	Class572_Sub17(int i, boolean bool) {
		if (i == -1)
			anInt9123 = -280995799;
		else {
			anInt9123 = (i >> 28 & 0x3) * 280995799;
			anInt9126 = 1365537015 * ((i >> 14 & 0x3fff) << 9);
			anInt9127 = 0;
			anInt9124 = ((i & 0x3fff) << 9) * -683445149;
			if (bool) {
				anInt9126 += 1685124864;
				anInt9124 += 1131700992;
			}
		}
	}

	void method8570(int i, int i_3_, int i_4_, int i_5_, short i_6_) {
		anInt9123 = 280995799 * i;
		anInt9126 = i_3_ * 1365537015;
		anInt9127 = i_4_ * 664138447;
		anInt9124 = -683445149 * i_5_;
	}

	void method8571(Class572_Sub17 class572_sub17_7_, byte i) {
		anInt9123 = 1 * class572_sub17_7_.anInt9123;
		anInt9126 = class572_sub17_7_.anInt9126 * 1;
		anInt9127 = 1 * class572_sub17_7_.anInt9127;
		anInt9124 = class572_sub17_7_.anInt9124 * 1;
	}

	public Class240 method8572(int i) {
		return new Class240((float) (anInt9126 * -862367545), (float) (-930360273 * anInt9127), (float) (-1661817525 * anInt9124));
	}

	public void method137(RSByteBuffer class572_sub15, int i) {
		anInt9123 = class572_sub15.readUnsignedByte(230674277) * 280995799;
		anInt9126 = class572_sub15.readInt(-608655213) * 1365537015;
		anInt9127 = class572_sub15.readInt(834941354) * 664138447;
		anInt9124 = class572_sub15.readInt(1466724087) * -683445149;
	}

	public Class572_Sub17() {
		anInt9123 = -280995799;
	}

	public int method136(int i) {
		return Class598.method7047(-1204667307);
	}

	public void method138(RSByteBuffer class572_sub15, byte i) {
		method8569(class572_sub15, (byte) -63);
	}

	void method8573(int i, boolean bool, int i_8_) {
		if (i == -1)
			anInt9123 = -280995799;
		else {
			anInt9123 = (i >> 28 & 0x3) * 280995799;
			anInt9126 = 1365537015 * ((i >> 14 & 0x3fff) << 9);
			anInt9127 = 0;
			anInt9124 = -683445149 * ((i & 0x3fff) << 9);
			if (bool) {
				anInt9126 += 1685124864;
				anInt9124 += 1131700992;
			}
		}
	}

	public String method8574() {
		return new StringBuilder().append("Level: ").append(-746112025 * anInt9123).append(" Coord: ").append(anInt9126 * -862367545).append(",").append(-930360273 * anInt9127).append(",").append(-1661817525 * anInt9124).append(" Coord Split: ").append(-862367545 * anInt9126 >> 15).append(",").append(anInt9124 * -1661817525 >> 15).append(",").append(anInt9126 * -862367545 >> 9 & 0x3f).append(",").append(-1661817525 * anInt9124 >> 9 & 0x3f).append(",").append(-862367545 * anInt9126 & 0x1ff).append(",").append(-1661817525 * anInt9124 & 0x1ff).toString();
	}

	public String method8575() {
		return new StringBuilder().append("Level: ").append(-746112025 * anInt9123).append(" Coord: ").append(anInt9126 * -862367545).append(",").append(-930360273 * anInt9127).append(",").append(-1661817525 * anInt9124).append(" Coord Split: ").append(-862367545 * anInt9126 >> 15).append(",").append(anInt9124 * -1661817525 >> 15).append(",").append(anInt9126 * -862367545 >> 9 & 0x3f).append(",").append(-1661817525 * anInt9124 >> 9 & 0x3f).append(",").append(-862367545 * anInt9126 & 0x1ff).append(",").append(-1661817525 * anInt9124 & 0x1ff).toString();
	}

	public int method61() {
		return Class598.method7047(85933828);
	}

	Class572_Sub17(Class572_Sub17 class572_sub17_9_) {
		anInt9123 = class572_sub17_9_.anInt9123 * 1;
		anInt9126 = class572_sub17_9_.anInt9126 * 1;
		anInt9127 = class572_sub17_9_.anInt9127 * 1;
		anInt9124 = 1 * class572_sub17_9_.anInt9124;
	}

	static int method8576() {
		return 13;
	}

	static int method8577() {
		return 13;
	}

	static int method8578() {
		return 13;
	}

	public int method45() {
		return Class598.method7047(172477207);
	}

	public int method43() {
		return Class598.method7047(-1510721999);
	}

	public void method135(RSByteBuffer class572_sub15) {
		method8569(class572_sub15, (byte) 114);
	}

	public String toString() {
		return new StringBuilder().append("Level: ").append(-746112025 * anInt9123).append(" Coord: ").append(anInt9126 * -862367545).append(",").append(-930360273 * anInt9127).append(",").append(-1661817525 * anInt9124).append(" Coord Split: ").append(-862367545 * anInt9126 >> 15).append(",").append(anInt9124 * -1661817525 >> 15).append(",").append(anInt9126 * -862367545 >> 9 & 0x3f).append(",").append(-1661817525 * anInt9124 >> 9 & 0x3f).append(",").append(-862367545 * anInt9126 & 0x1ff).append(",").append(-1661817525 * anInt9124 & 0x1ff).toString();
	}

	public void method139(RSByteBuffer class572_sub15) {
		method8569(class572_sub15, (byte) -52);
	}

	public void method140(RSByteBuffer class572_sub15) {
		anInt9123 = class572_sub15.readUnsignedByte(619310937) * 280995799;
		anInt9126 = class572_sub15.readInt(85960802) * 1365537015;
		anInt9127 = class572_sub15.readInt(1425146540) * 664138447;
		anInt9124 = class572_sub15.readInt(1566132698) * -683445149;
	}

	static final void method8579(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		class73.anInt818 = -901734683 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		class73.anInt909 = (-663396071 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]));
		Class555.method6575(class73, (short) 7551);
	}

	public static void method8580(int i, byte i_10_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(10, (long) i);
		class572_sub12_sub11.method10384(-1998944081);
	}
}
