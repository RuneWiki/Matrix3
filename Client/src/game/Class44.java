package game;

/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44 implements Interface2 {
	int anInt441;
	Class115 aClass115_442;
	Class46 this$0;
	static Class161[] aClass161Array443;
	public static Class248 aClass248_444;
	static int anInt445;

	Class44(Class46 class46, RSByteBuffer class572_sub15) {
		((Class44) this).this$0 = class46;
		((Class44) this).anInt441 = class572_sub15.readUnsignedShort(647518597) * 2083925933;
		((Class44) this).aClass115_442 = new Class115(class572_sub15, false, false, ((Class46) class46).anInterface1_463);
	}

	public void method15(Class49 class49, int i) {
		class49.method874(((Class44) this).anInt441 * -74773467, ((Class44) this).aClass115_442, (byte) 90);
	}

	public void method16(Class49 class49) {
		class49.method874(((Class44) this).anInt441 * -74773467, ((Class44) this).aClass115_442, (byte) 47);
	}

	public void method17(Class49 class49) {
		class49.method874(((Class44) this).anInt441 * -74773467, ((Class44) this).aClass115_442, (byte) 47);
	}

	public static boolean method822(int i, byte i_0_) {
		return ((i >= Class516.aClass516_5743.anInt5742 * 1870735441 && i <= 1870735441 * Class516.aClass516_5728.anInt5742) || Class516.aClass516_5720.anInt5742 * 1870735441 == i);
	}

	static final void method823(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = client.anInt8706 * 267033007;
		int i_6_ = client.anInt8707 * -158522847;
		if (1251161273 * client.anInt8606 == 1) {
			Class161 class161 = (Class481.aClass161Array5362[-311274581 * client.anInt8803 / 100]);
			class161.method2595(i_5_ - 8, i_6_ - 8);
		}
		if (client.anInt8606 * 1251161273 == 2) {
			Class161 class161 = (Class481.aClass161Array5362[-311274581 * client.anInt8803 / 100 + 4]);
			class161.method2595(i_5_ - 8, i_6_ - 8);
		}
	}
}
