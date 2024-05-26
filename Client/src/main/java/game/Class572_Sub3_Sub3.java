package game;

/* Class572_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub3_Sub3 extends Class572_Sub3 {
	Class420 this$0;
	int anInt11317;

	void method8263(RSByteBuffer class572_sub15) {
		((Class572_Sub3_Sub3) this).anInt11317 = class572_sub15.readUnsignedShort(647518597) * 326742429;
		class572_sub15.readUnsignedByte(1591645077);
		if (class572_sub15.readUnsignedByte(1586122270) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
	}

	void method8262(RSByteBuffer class572_sub15, int i) {
		((Class572_Sub3_Sub3) this).anInt11317 = class572_sub15.readUnsignedShort(647518597) * 326742429;
		class572_sub15.readUnsignedByte(517192272);
		if (class572_sub15.readUnsignedByte(371267944) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
	}

	void method8261(Class572_Sub10 class572_sub10, int i) {
		class572_sub10.method8398((-1101701963 * ((Class572_Sub3_Sub3) this).anInt11317), (byte) -37);
	}

	void method8265(RSByteBuffer class572_sub15) {
		((Class572_Sub3_Sub3) this).anInt11317 = class572_sub15.readUnsignedShort(647518597) * 326742429;
		class572_sub15.readUnsignedByte(614874054);
		if (class572_sub15.readUnsignedByte(1976151516) != 255) {
			class572_sub15.o -= 310393755;
			class572_sub15.method8476((byte) 4);
		}
	}

	Class572_Sub3_Sub3(Class420 class420) {
		((Class572_Sub3_Sub3) this).this$0 = class420;
		((Class572_Sub3_Sub3) this).anInt11317 = -326742429;
	}

	void method8264(Class572_Sub10 class572_sub10) {
		class572_sub10.method8398((-1101701963 * ((Class572_Sub3_Sub3) this).anInt11317), (byte) -53);
	}

	public static short[] method10283(short[] is, int i) {
		if (is == null)
			return null;
		short[] is_0_ = new short[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}
}
