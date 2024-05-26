package game;

/* Class479_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class479_Sub2 extends Class479 {
	Queue aQueue8974 = new LinkedList();

	void method5661(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13) {
		method8276(class572_sub15, (Class572_Sub13_Sub1) class572_sub13, -374225942);
	}

	int method5650(byte i) {
		return 1;
	}

	void method8275(Class572_Sub13_Sub1 class572_sub13_sub1, byte i) {
		((Class479_Sub2) this).aQueue8974.add(class572_sub13_sub1);
		if (((Class479_Sub2) this).aQueue8974.size() > 10)
			((Class479_Sub2) this).aQueue8974.poll();
	}

	void method8276(RSByteBuffer class572_sub15, Class572_Sub13_Sub1 class572_sub13_sub1, int i) {
		class572_sub15.writeByte(class572_sub13_sub1.method10308(2098666465), -1384395473);
	}

	boolean method5662(byte i) {
		return (!((Class479_Sub2) this).aQueue8974.isEmpty() || (-7613164673240222681L * ((Class479_Sub2) this).aLong5350 < Class69.method1067(-1865040773) - 2000L));
	}

	void method5651(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13, byte i) {
		method8276(class572_sub15, (Class572_Sub13_Sub1) class572_sub13, 1143962155);
	}

	Class572_Sub25 method5654(int i) {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3697, client.aClass195_8589.aClass650_2340, 571792265);
	}

	Class479_Sub2() {
		/* empty */
	}

	void method5665() {
		Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) ((Class479_Sub2) this).aQueue8974.poll();
		if (class572_sub13_sub1 != null) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3729, client.aClass195_8589.aClass650_2340, -1301858933);
			class572_sub25.aRsByteBuffer.writeIntLE((class572_sub13_sub1.method8417(1636759235) | class572_sub13_sub1.method8425(-1749784373) << 16), (byte) 116);
			class572_sub25.aRsByteBuffer.writeByte((class572_sub13_sub1.method10301((byte) 17) << 1 | class572_sub13_sub1.method10308(2115575239) & 0x1), -1384395473);
			class572_sub25.aRsByteBuffer.writeShort(method5649(class572_sub13_sub1, 65535, 1688949669), -1130833438);
			client.aClass195_8589.method2929(class572_sub25, (byte) -71);
			class572_sub13_sub1.method8421(421222932);
		}
	}

	boolean method5655() {
		return (!((Class479_Sub2) this).aQueue8974.isEmpty() || (-7613164673240222681L * ((Class479_Sub2) this).aLong5350 < Class69.method1067(-2085527764) - 2000L));
	}

	boolean method5663() {
		return (!((Class479_Sub2) this).aQueue8974.isEmpty() || (-7613164673240222681L * ((Class479_Sub2) this).aLong5350 < Class69.method1067(-2006440174) - 2000L));
	}

	Class572_Sub25 method5658() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3697, client.aClass195_8589.aClass650_2340, -1543304105);
	}

	Class572_Sub25 method5657() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3697, client.aClass195_8589.aClass650_2340, 1014584896);
	}

	Class572_Sub25 method5653() {
		return Class378.sendOutPacket(OutgoingPacket.aClass312_3697, client.aClass195_8589.aClass650_2340, -2106602091);
	}

	void method5652(int i) {
		Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) ((Class479_Sub2) this).aQueue8974.poll();
		if (class572_sub13_sub1 != null) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3729, client.aClass195_8589.aClass650_2340, -1867816476);
			class572_sub25.aRsByteBuffer.writeIntLE((class572_sub13_sub1.method8417(1636759235) | class572_sub13_sub1.method8425(-1749784373) << 16), (byte) 10);
			class572_sub25.aRsByteBuffer.writeByte((class572_sub13_sub1.method10301((byte) 78) << 1 | class572_sub13_sub1.method10308(2055003586) & 0x1), -1384395473);
			class572_sub25.aRsByteBuffer.writeShort(method5649(class572_sub13_sub1, 65535, 1863496804), -1856955135);
			client.aClass195_8589.method2929(class572_sub25, (byte) -26);
			class572_sub13_sub1.method8421(421222932);
		}
	}

	int method5659() {
		return 1;
	}

	int method5660() {
		return 1;
	}
}
