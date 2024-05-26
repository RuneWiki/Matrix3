package game;

/* Class202_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class202_Sub1_Sub2 extends Class202_Sub1 implements Interface18 {
	Class127 aClass127_11245 = new Class127(64);
	Class248 aClass248_11246;

	public Iterator iterator() {
		return new Class473(this);
	}

	public int method45() {
		return super.method113((byte) 106);
	}

	Class179_Sub1 method10209(int i, int i_0_) {
		byte[] is = (((Class202_Sub1_Sub2) this).aClass248_11246.getFile(aClass272_9649.method3668((byte) -4).anInt2591 * 1890065851, i, 618452095));
		Class179_Sub1 class179_sub1 = new Class179_Sub1(aClass272_9649, i);
		if (null != is)
			class179_sub1.method109(new RSByteBuffer(is), -531877751);
		return class179_sub1;
	}

	public Interface17 getDefinition(int i, int i_1_) {
		Class179_Sub1 class179_sub1;
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			class179_sub1 = (Class179_Sub1) ((Class202_Sub1_Sub2) this).aClass127_11245.method2246((long) i);
			if (null == class179_sub1) {
				class179_sub1 = method10209(i, 433374540);
				((Class202_Sub1_Sub2) this).aClass127_11245.method2229(class179_sub1, (long) i);
			}
		}
		return class179_sub1;
	}

	public void method10210(int i, int i_2_) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2235(i, 1727905287);
		}
	}

	public void method10211(int i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2234((byte) 27);
		}
	}

	public Class202_Sub1_Sub2(Class437 class437, VarDomainType class272, Class435 class435, Class248 class248) {
		super(class437, class272, class435, (class248 != null ? class248.method3376((class272.method3668((byte) 33).anInt2591 * 1890065851), 721358361) : 0));
		((Class202_Sub1_Sub2) this).aClass248_11246 = class248;
	}

	public int method113(byte i) {
		return super.method113((byte) 126);
	}

	public Interface17 method114(int i) {
		Class179_Sub1 class179_sub1;
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			class179_sub1 = (Class179_Sub1) ((Class202_Sub1_Sub2) this).aClass127_11245.method2246((long) i);
			if (null == class179_sub1) {
				class179_sub1 = method10209(i, 576588853);
				((Class202_Sub1_Sub2) this).aClass127_11245.method2229(class179_sub1, (long) i);
			}
		}
		return class179_sub1;
	}

	public void method10212() {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2231((byte) -8);
		}
	}

	public Iterator method10213() {
		return new Class473(this);
	}

	public void method10214(int i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2235(i, 1928095411);
		}
	}

	public void method10215(byte i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2231((byte) -124);
		}
	}

	public void method10216(int i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2235(i, 1495520940);
		}
	}

	public void method10217(int i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2235(i, 2080350565);
		}
	}

	public void method10218(int i) {
		synchronized (((Class202_Sub1_Sub2) this).aClass127_11245) {
			((Class202_Sub1_Sub2) this).aClass127_11245.method2235(i, 1790169135);
		}
	}
}
