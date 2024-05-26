package game;

/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class354 {
	int anInt4403;
	long aLong4404;

	Class354(Class364[] class364s) {
		for (int i = 0; i < class364s.length; i++)
			method4420(class364s[i]);
	}

	public final int method4415() {
		return ((Class354) this).anInt4403;
	}

	public final Class364 method4416(int i) {
		return Class364.method4486(method4417(i));
	}

	final int method4417(int i) {
		return ((int) (((Class354) this).aLong4404 >> Class364.anInt4478 * i) & 0xf);
	}

	Class354(Class364 class364) {
		((Class354) this).aLong4404 = (long) ((Class364) class364).anInt4465;
		((Class354) this).anInt4403 = 1;
	}

	final int method4418(int i) {
		return ((int) (((Class354) this).aLong4404 >> Class364.anInt4478 * i) & 0xf);
	}

	final int method4419(int i) {
		return ((int) (((Class354) this).aLong4404 >> Class364.anInt4478 * i) & 0xf);
	}

	final void method4420(Class364 class364) {
		((Class354) this).aLong4404 |= (long) (((Class364) class364).anInt4465 << Class364.anInt4478 * ((Class354) this).anInt4403++);
	}

	final int method4421(int i) {
		return ((int) (((Class354) this).aLong4404 >> Class364.anInt4478 * i) & 0xf);
	}
}
