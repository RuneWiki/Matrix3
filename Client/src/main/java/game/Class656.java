package game;

/* Class656 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class656 implements Iterator {
	Class675 aClass675_8415;
	Class572 aClass572_8416;
	Class572 aClass572_8417 = null;
	protected static int anInt8418;

	void method7712() {
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	public void method7713(Class675 class675, byte i) {
		((Class656) this).aClass675_8415 = class675;
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	void method7714(int i) {
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	public Class572 method7715(byte i) {
		method7714(1886250193);
		return (Class572) next();
	}

	public void method7716() {
		if (null == ((Class656) this).aClass572_8417)
			throw new IllegalStateException();
		((Class656) this).aClass572_8417.method6794((byte) -36);
		((Class656) this).aClass572_8417 = null;
	}

	public boolean hasNext() {
		return (((Class656) this).aClass572_8416 != ((Class656) this).aClass675_8415.aClass572_8547);
	}

	public void remove() {
		if (null == ((Class656) this).aClass572_8417)
			throw new IllegalStateException();
		((Class656) this).aClass572_8417.method6794((byte) 29);
		((Class656) this).aClass572_8417 = null;
	}

	public boolean method7717() {
		return (((Class656) this).aClass572_8416 != ((Class656) this).aClass675_8415.aClass572_8547);
	}

	public boolean method7718() {
		return (((Class656) this).aClass572_8416 != ((Class656) this).aClass675_8415.aClass572_8547);
	}

	public Object method7719() {
		Class572 class572 = ((Class656) this).aClass572_8416;
		if (class572 == ((Class656) this).aClass675_8415.aClass572_8547) {
			class572 = null;
			((Class656) this).aClass572_8416 = null;
		} else
			((Class656) this).aClass572_8416 = class572.aClass572_6433;
		((Class656) this).aClass572_8417 = class572;
		return class572;
	}

	public void method7720() {
		if (null == ((Class656) this).aClass572_8417)
			throw new IllegalStateException();
		((Class656) this).aClass572_8417.method6794((byte) 9);
		((Class656) this).aClass572_8417 = null;
	}

	public Object method7721() {
		Class572 class572 = ((Class656) this).aClass572_8416;
		if (class572 == ((Class656) this).aClass675_8415.aClass572_8547) {
			class572 = null;
			((Class656) this).aClass572_8416 = null;
		} else
			((Class656) this).aClass572_8416 = class572.aClass572_6433;
		((Class656) this).aClass572_8417 = class572;
		return class572;
	}

	public Object next() {
		Class572 class572 = ((Class656) this).aClass572_8416;
		if (class572 == ((Class656) this).aClass675_8415.aClass572_8547) {
			class572 = null;
			((Class656) this).aClass572_8416 = null;
		} else
			((Class656) this).aClass572_8416 = class572.aClass572_6433;
		((Class656) this).aClass572_8417 = class572;
		return class572;
	}

	void method7722() {
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	void method7723() {
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	public Class656(Class675 class675) {
		((Class656) this).aClass675_8415 = class675;
		((Class656) this).aClass572_8416 = ((Class656) this).aClass675_8415.aClass572_8547.aClass572_6433;
		((Class656) this).aClass572_8417 = null;
	}

	public Class572 method7724() {
		method7714(1949295822);
		return (Class572) next();
	}

	static final void method7725(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 8443);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1483996493 * class73.anInt860;
	}

	static final void method7726(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool896 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 24957);
		if (class73.activeComponent * -1665128073 == -1 && !class83.aBool1079)
			Class278_Sub1.method8871(-1718435171 * class73.selfId, -869487355);
	}
}
