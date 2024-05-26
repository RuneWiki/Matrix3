package game;

/* Class591_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class591_Sub4 extends Class591 {
	static int anInt9348;
	static Class652 aClass652_9349 = new Class652();
	Entity aClass456_Sub1_Sub2_Sub3_9350;
	int anInt9351;
	int anInt9352;
	int anInt9353;
	int anInt9354;

	Class591_Sub4() {
		/* empty */
	}

	static {
		anInt9348 = 0;
	}

	public static final void method8718(String string, byte i) {
		if (null != Class328.aClass196Array4209) {
			Class195 class195 = Class166.method2676((byte) 107);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3698, class195.aClass650_2340, 759271226);
			class572_sub25.aRsByteBuffer.writeByte(ObjectDefinitions.method6069(string, -1154047697), -1384395473);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -40);
			class195.method2929(class572_sub25, (byte) -90);
		}
	}
}
