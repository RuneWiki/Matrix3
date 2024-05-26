package game;

/* Class133_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class133_Sub8 extends Class133 {
	int anInt9852;
	int anInt9853;
	public static Applet anApplet9854;

	Class133_Sub8(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub8) this).anInt9852 = class572_sub15.readUnsignedShort(647518597) * -1711746581;
		((Class133_Sub8) this).anInt9853 = class572_sub15.readInt(261861707) * -811316601;
	}

	public void method2303(int i) {
		client.anInt8789 = client.cycles * -1924388537;
		client.anInt8652 = (client.cycles + ((Class133_Sub8) this).anInt9852 * -613953853) * -1431314153;
		Class212.anInt2461 = 1983306535 * client.anInt8653;
		Class431.anInt5037 = -1835116689 * client.anInt8654;
		Class633.anInt8210 = -2098048101 * client.anInt8655;
		Class316.anInt3871 = 867130597 * client.anInt8635;
		client.anInt8653 = (-1734714569 * ((Class133_Sub8) this).anInt9853 >>> 24) * -588912915;
		client.anInt8654 = (-800400117 * (((Class133_Sub8) this).anInt9853 * -1734714569 >>> 16 & 0xff));
		client.anInt8655 = ((((Class133_Sub8) this).anInt9853 * -1734714569 >>> 8 & 0xff) * 327301855);
		client.anInt8635 = -62956269 * (((Class133_Sub8) this).anInt9853 * -1734714569 & 0xff);
	}

	public void method2309() {
		client.anInt8789 = client.cycles * -1924388537;
		client.anInt8652 = (client.cycles + ((Class133_Sub8) this).anInt9852 * -613953853) * -1431314153;
		Class212.anInt2461 = 1983306535 * client.anInt8653;
		Class431.anInt5037 = -1835116689 * client.anInt8654;
		Class633.anInt8210 = -2098048101 * client.anInt8655;
		Class316.anInt3871 = 867130597 * client.anInt8635;
		client.anInt8653 = (-1734714569 * ((Class133_Sub8) this).anInt9853 >>> 24) * -588912915;
		client.anInt8654 = (-800400117 * (((Class133_Sub8) this).anInt9853 * -1734714569 >>> 16 & 0xff));
		client.anInt8655 = ((((Class133_Sub8) this).anInt9853 * -1734714569 >>> 8 & 0xff) * 327301855);
		client.anInt8635 = -62956269 * (((Class133_Sub8) this).anInt9853 * -1734714569 & 0xff);
	}

	public static String method9349(int i) {
		return Class16.aString134;
	}
}
