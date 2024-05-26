package game;

/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class304 implements Interface37 {
	Class127 aClass127_3537 = new Class127(64);
	Class248 aClass248_3538;

	public void method4006() {
		((Class304) this).aClass127_3537.method2231((byte) -61);
	}

	public void method4007() {
		((Class304) this).aClass127_3537.method2231((byte) -62);
	}

	public void method4008(byte i) {
		((Class304) this).aClass127_3537.method2231((byte) -33);
	}

	public Class309 method212(int i, int i_0_) {
		Class309 class309 = (Class309) ((Class304) this).aClass127_3537.method2246((long) i);
		if (null != class309)
			return class309;
		byte[] is = ((Class304) this).aClass248_3538.getFile(1, i, -189355138);
		class309 = new Class309();
		class309.anInt3637 = i * -1439205621;
		if (is != null)
			class309.method4032(new RSByteBuffer(is), 1654200664);
		class309.method4037(-1438599631);
		((Class304) this).aClass127_3537.method2229(class309, (long) i);
		return class309;
	}

	public Class304(Class248 class248) {
		((Class304) this).aClass248_3538 = class248;
	}

	public Class309 method213(int i) {
		Class309 class309 = (Class309) ((Class304) this).aClass127_3537.method2246((long) i);
		if (null != class309)
			return class309;
		byte[] is = ((Class304) this).aClass248_3538.getFile(1, i, -1971115819);
		class309 = new Class309();
		class309.anInt3637 = i * -1439205621;
		if (is != null)
			class309.method4032(new RSByteBuffer(is), 1412146406);
		class309.method4037(748642332);
		((Class304) this).aClass127_3537.method2229(class309, (long) i);
		return class309;
	}

	static final void method4009(Cs2Executor class441, byte i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 19953);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >> 16];
		Class227.method3159(class73, class83, class441, -80692688);
	}
}
