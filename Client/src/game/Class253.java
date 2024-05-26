package game;

/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class253 implements Iterator {
	static int anInt2734;
	Class639 this$0;
	int anInt2735;

	public boolean method3508() {
		return (((Class253) this).anInt2735 * -1988184757 < 1292974489 * ((Class253) this).this$0.anInt8284);
	}

	public boolean hasNext() {
		return (((Class253) this).anInt2735 * -1988184757 < 1292974489 * ((Class253) this).this$0.anInt8284);
	}

	public Object next() {
		int i = (((Class253) this).anInt2735 += -349885341) * -1988184757 - 1;
		synchronized (((Class639) ((Class253) this).this$0).aClass127_8282) {
			Interface17 interface17 = (Interface17) ((Class639) ((Class253) this).this$0).aClass127_8282.method2246((long) i);
			if (interface17 != null) {
				Interface17 interface17_0_ = interface17;
				return interface17_0_;
			}
		}
		return ((Class253) this).this$0.method7568(i, -722956270);
	}

	Class253(Class639 class639) {
		((Class253) this).this$0 = class639;
	}

	public Object method3509() {
		int i = (((Class253) this).anInt2735 += -349885341) * -1988184757 - 1;
		synchronized (((Class639) ((Class253) this).this$0).aClass127_8282) {
			Interface17 interface17 = (Interface17) ((Class639) ((Class253) this).this$0).aClass127_8282.method2246((long) i);
			if (interface17 != null) {
				Interface17 interface17_1_ = interface17;
				return interface17_1_;
			}
		}
		return ((Class253) this).this$0.method7568(i, -722956270);
	}

	public boolean method3510() {
		return (((Class253) this).anInt2735 * -1988184757 < 1292974489 * ((Class253) this).this$0.anInt8284);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object method3511() {
		int i = (((Class253) this).anInt2735 += -349885341) * -1988184757 - 1;
		synchronized (((Class639) ((Class253) this).this$0).aClass127_8282) {
			Interface17 interface17 = (Interface17) ((Class639) ((Class253) this).this$0).aClass127_8282.method2246((long) i);
			if (interface17 != null) {
				Interface17 interface17_2_ = interface17;
				return interface17_2_;
			}
		}
		return ((Class253) this).this$0.method7568(i, -722956270);
	}

	public void method3512() {
		throw new UnsupportedOperationException();
	}

	public void method3513() {
		throw new UnsupportedOperationException();
	}

	static int method3514(int i, int i_3_, int i_4_) {
		int i_5_ = i >> 31 & i_3_ - 1;
		return (i + (i >>> 31)) % i_3_ + i_5_;
	}

	static final void method3515(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class301.method3995(class73, class83, class441, (byte) 1);
	}

	static boolean method3516(int i) {
		if (null != client.aByteArray8565)
			return Class480.method5716(-1665128073);
		if (-1 != Class13.anInt68 * -2082178003)
			return Class279.method3763(684590662);
		return Class63.method1022(Class13.aString70, Class13.aString103, 1795499125);
	}

	static final void method3517(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_6_, (short) 1203);
		Class83 class83 = Class534.aClass83Array5975[i_6_ >> 16];
		VarBitDefinition.method5227(class73, class83, class441, 2027713948);
	}
}
