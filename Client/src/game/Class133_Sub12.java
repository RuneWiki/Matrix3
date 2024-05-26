package game;

/* Class133_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub12 extends Class133 {
	int anInt9939;
	int anInt9940;
	int anInt9941;

	public void method2303(int i) {
		Class130 class130 = (Class122.aClass130Array1483[((Class133_Sub12) this).anInt9940 * 1147316443]);
		Class118 class118 = (Class557.aClass118Array6331[((Class133_Sub12) this).anInt9939 * -53025371]);
		class118.method2153(class130, -1534855293 * ((Class133_Sub12) this).anInt9941, -869356818);
	}

	public void method2309() {
		Class130 class130 = (Class122.aClass130Array1483[((Class133_Sub12) this).anInt9940 * 1147316443]);
		Class118 class118 = (Class557.aClass118Array6331[((Class133_Sub12) this).anInt9939 * -53025371]);
		class118.method2153(class130, -1534855293 * ((Class133_Sub12) this).anInt9941, -2108772686);
	}

	Class133_Sub12(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub12) this).anInt9940 = class572_sub15.readUnsignedShort(647518597) * 467735379;
		((Class133_Sub12) this).anInt9939 = class572_sub15.readUnsignedShort(647518597) * 1096120877;
		((Class133_Sub12) this).anInt9941 = class572_sub15.readUnsignedByte(1973778778) * 1803308843;
	}

	public static boolean method9368(int i, int i_0_) {
		return (12 == i || i == 9 || 15 == i || i == 2 || 6 == i || i == 0 || 10 == i);
	}

	public static final void method9369(String string, int i) {
		if (!string.equals("")) {
			Class195 class195 = Class166.method2676((byte) 83);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3713, class195.aClass650_2340, -188028429);
			class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -947683410), -1384395473);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -25);
			class195.method2929(class572_sub25, (byte) -44);
		}
	}
}
