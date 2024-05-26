package game;

/* Class572_Sub12_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class572_Sub12_Sub4_Sub2 extends Class572_Sub12_Sub4 {
	SoftReference aSoftReference11729;

	Object method10284(int i) {
		return ((Class572_Sub12_Sub4_Sub2) this).aSoftReference11729.get();
	}

	Class572_Sub12_Sub4_Sub2(Object object, int i) {
		super(i);
		((Class572_Sub12_Sub4_Sub2) this).aSoftReference11729 = new SoftReference(object);
	}

	Object method10287() {
		return ((Class572_Sub12_Sub4_Sub2) this).aSoftReference11729.get();
	}

	boolean method10285(int i) {
		return true;
	}

	Object method10288() {
		return ((Class572_Sub12_Sub4_Sub2) this).aSoftReference11729.get();
	}

	boolean method10286() {
		return true;
	}
}
