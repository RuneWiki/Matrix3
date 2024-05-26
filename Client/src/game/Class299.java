package game;

/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class299 implements Iterator {
	int anInt3482;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_3483;
	int anInt3484 = 0;

	public boolean method3976() {
		return (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268));
	}

	public boolean hasNext() {
		return (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268));
	}

	public Object next() {
		if (((Class299) this).anInt3482 * 742401525 != 1539930043 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11270))
			throw new ConcurrentModificationException();
		if (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268)) {
			Object object = (((Class306) (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).aClass306Array11272[((Class299) this).anInt3484 * 1004778221])).anObject3543);
			((Class299) this).anInt3484 += 347896549;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method3977() {
		return (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268));
	}

	public void method3978() {
		throw new UnsupportedOperationException();
	}

	public void method3979() {
		throw new UnsupportedOperationException();
	}

	public Object method3980() {
		if (((Class299) this).anInt3482 * 742401525 != 1539930043 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11270))
			throw new ConcurrentModificationException();
		if (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268)) {
			Object object = (((Class306) (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).aClass306Array11272[((Class299) this).anInt3484 * 1004778221])).anObject3543);
			((Class299) this).anInt3484 += 347896549;
			return object;
		}
		throw new NoSuchElementException();
	}

	Class299(AbstractQueue_Sub1 abstractqueue_sub1) {
		((Class299) this).anInt3482 = -746526481 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11270);
		((Class299) this).anAbstractQueue_Sub1_3483 = abstractqueue_sub1;
	}

	public Object method3981() {
		if (((Class299) this).anInt3482 * 742401525 != 1539930043 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11270))
			throw new ConcurrentModificationException();
		if (1004778221 * ((Class299) this).anInt3484 < -1363508737 * (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).anInt11268)) {
			Object object = (((Class306) (((AbstractQueue_Sub1) ((Class299) this).anAbstractQueue_Sub1_3483).aClass306Array11272[((Class299) this).anInt3484 * 1004778221])).anObject3543);
			((Class299) this).anInt3484 += 347896549;
			return object;
		}
		throw new NoSuchElementException();
	}

	static final void method3982(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub14 class572_sub12_sub14 = Class100.aClass616_1298.method7372(i_0_, 1949236019);
		if (null == class572_sub12_sub14.anIntArray11463)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub14.anIntArray11463.length;
	}

	static final void method3983(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		boolean bool = Class278_Sub1.aclient9503.method6921(new File(string), (byte) -52);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = bool ? 1 : 0;
	}
}
