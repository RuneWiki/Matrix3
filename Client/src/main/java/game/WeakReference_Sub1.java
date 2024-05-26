package game;

/* WeakReference_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReference_Sub1 extends WeakReference {
	WeakReference_Sub1 aWeakReference_Sub1_11522;
	int anInt11523;

	WeakReference_Sub1(Object object, ReferenceQueue referencequeue, int i, Object object_0_) {
		super(object, referencequeue);
		((WeakReference_Sub1) this).anInt11523 = -458928073 * i;
	}
}
