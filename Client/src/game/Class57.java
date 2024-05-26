package game;

/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57 implements Interface2 {
	Class46 this$0;
	int anInt528;
	int anInt529;

	Class57(Class46 class46, RSByteBuffer class572_sub15) {
		((Class57) this).this$0 = class46;
		((Class57) this).anInt529 = class572_sub15.readUnsignedShort(647518597) * 490491865;
		((Class57) this).anInt528 = class572_sub15.readUnsignedByte(1524784352) * 1842147269;
	}

	public void method16(Class49 class49) {
		class49.method860(((Class57) this).anInt529 * -40550295, -913656051 * ((Class57) this).anInt528, -799621569);
		class49.method854(-40550295 * ((Class57) this).anInt529, 1493492562).method2107(1338912726);
	}

	public void method15(Class49 class49, int i) {
		class49.method860(((Class57) this).anInt529 * -40550295, -913656051 * ((Class57) this).anInt528, 276296795);
		class49.method854(-40550295 * ((Class57) this).anInt529, 1493492562).method2107(-354422300);
	}

	public void method17(Class49 class49) {
		class49.method860(((Class57) this).anInt529 * -40550295, -913656051 * ((Class57) this).anInt528, -809692024);
		class49.method854(-40550295 * ((Class57) this).anInt529, 1493492562).method2107(1763581912);
	}

	public static Class500[] method1000(byte i) {
		return (new Class500[] { Class500.aClass500_5514, Class500.aClass500_5513, Class500.aClass500_5515 });
	}

	public static int method1001(int i, int i_0_, float f, int i_1_) {
		return Class629.method7515(i, i_0_, (int) f, 1940235028);
	}

	static final void method1002(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 240);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class468.method5553(class73, class83, class441, -1467232578);
	}
}
