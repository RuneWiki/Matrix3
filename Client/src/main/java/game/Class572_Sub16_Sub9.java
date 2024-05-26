package game;

/* Class572_Sub16_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub16_Sub9 extends Class572_Sub16 {
	Class336 this$0;
	int anInt11295;
	long aLong11296;

	void method8563(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub9) this).anInt11295 = class572_sub15.readInt(1620625625) * 1694525669;
		((Class572_Sub16_Sub9) this).aLong11296 = class572_sub15.method8476((byte) 4) * -3875935366030844183L;
	}

	void method8565(RSByteBuffer class572_sub15, int i) {
		((Class572_Sub16_Sub9) this).anInt11295 = class572_sub15.readInt(2001916584) * 1694525669;
		((Class572_Sub16_Sub9) this).aLong11296 = class572_sub15.method8476((byte) 4) * -3875935366030844183L;
	}

	void method8560(Class334 class334, byte i) {
		class334.method4198((((Class572_Sub16_Sub9) this).anInt11295 * 652809453), (((Class572_Sub16_Sub9) this).aLong11296 * -2240308831370798759L));
	}

	Class572_Sub16_Sub9(Class336 class336) {
		((Class572_Sub16_Sub9) this).this$0 = class336;
	}

	void method8562(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub9) this).anInt11295 = class572_sub15.readInt(-519124434) * 1694525669;
		((Class572_Sub16_Sub9) this).aLong11296 = class572_sub15.method8476((byte) 4) * -3875935366030844183L;
	}

	void method8566(Class334 class334) {
		class334.method4198((((Class572_Sub16_Sub9) this).anInt11295 * 652809453), (((Class572_Sub16_Sub9) this).aLong11296 * -2240308831370798759L));
	}

	void method8564(Class334 class334) {
		class334.method4198((((Class572_Sub16_Sub9) this).anInt11295 * 652809453), (((Class572_Sub16_Sub9) this).aLong11296 * -2240308831370798759L));
	}

	void method8561(RSByteBuffer class572_sub15) {
		((Class572_Sub16_Sub9) this).anInt11295 = class572_sub15.readInt(2141566842) * 1694525669;
		((Class572_Sub16_Sub9) this).aLong11296 = class572_sub15.method8476((byte) 4) * -3875935366030844183L;
	}

	void method8559(Class334 class334) {
		class334.method4198((((Class572_Sub16_Sub9) this).anInt11295 * 652809453), (((Class572_Sub16_Sub9) this).aLong11296 * -2240308831370798759L));
	}

	public static Class531 method10262(boolean bool, int i) {
		synchronized (Class531.aStack5931) {
			Class531 class531;
			if (Class531.aStack5931.isEmpty())
				class531 = new Class531();
			else
				class531 = (Class531) Class531.aStack5931.pop();
			((Class531) class531).aBool5930 = bool;
			Class531 class531_0_ = class531;
			return class531_0_;
		}
	}
}
