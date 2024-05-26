package game;

/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class318 implements Interface35 {
	Class127 aClass127_3873 = new Class127(64);
	Class248 aClass248_3874;
	static Class284 aClass284_3875;

	public Class318(Class248 class248) {
		((Class318) this).aClass248_3874 = class248;
	}

	public Class314 method208(int i, byte i_0_) {
		Class314 class314 = (Class314) ((Class318) this).aClass127_3873.method2246((long) i);
		if (class314 != null)
			return class314;
		byte[] is = ((Class318) this).aClass248_3874.getFile(0, i, 947697398);
		class314 = new Class314();
		if (null != is)
			class314.method4066(new RSByteBuffer(is), i, 1003501150);
		((Class318) this).aClass127_3873.method2229(class314, (long) i);
		return class314;
	}

	public Class314 method209(int i) {
		Class314 class314 = (Class314) ((Class318) this).aClass127_3873.method2246((long) i);
		if (class314 != null)
			return class314;
		byte[] is = ((Class318) this).aClass248_3874.getFile(0, i, -1605820361);
		class314 = new Class314();
		if (null != is)
			class314.method4066(new RSByteBuffer(is), i, 1238309146);
		((Class318) this).aClass127_3873.method2229(class314, (long) i);
		return class314;
	}

	static final void method4090(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aBool4257 ? 1 : 0;
	}
}
