package game;

/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class495 implements Iterator {
	Class489[] aClass489Array5491;
	int anInt5492;

	Class495(Class489[] class489s) {
		((Class495) this).aClass489Array5491 = class489s;
	}

	public boolean hasNext() {
		return (1188785995 * ((Class495) this).anInt5492 < ((Class495) this).aClass489Array5491.length);
	}

	public Object next() {
		return (((Class495) this).aClass489Array5491[(((Class495) this).anInt5492 += 932455011) * 1188785995 - 1]);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method5908() {
		return (1188785995 * ((Class495) this).anInt5492 < ((Class495) this).aClass489Array5491.length);
	}

	public boolean method5909() {
		return (1188785995 * ((Class495) this).anInt5492 < ((Class495) this).aClass489Array5491.length);
	}

	public Object method5910() {
		return (((Class495) this).aClass489Array5491[(((Class495) this).anInt5492 += 932455011) * 1188785995 - 1]);
	}

	public void method5911() {
		throw new UnsupportedOperationException();
	}

	public void method5912() {
		throw new UnsupportedOperationException();
	}

	public Object method5913() {
		return (((Class495) this).aClass489Array5491[(((Class495) this).anInt5492 += 932455011) * 1188785995 - 1]);
	}

	static final void method5914(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_1_ = client.exchangeSlots[i_0_].method7007(818731540);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 5 == i_1_ ? 1 : 0;
	}

	static final void method5915(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class100.aClass616_1298.method7372(i_2_, -2110135321).anIntArray11463[i_3_]);
	}

	static final void method5916(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class167_Sub1.method10040(-1225581009).getId(1799708664);
	}
}
