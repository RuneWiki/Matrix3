package game;

/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	int anInt11268;
	Map aMap11269;
	int anInt11270 = 0;
	Comparator aComparator11271;
	Class306[] aClass306Array11272;

	public Object[] method10239() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator11271 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11271);
		else
			Arrays.sort(objects);
		return objects;
	}

	public AbstractQueue_Sub1(int i, Comparator comparator) {
		((AbstractQueue_Sub1) this).aClass306Array11272 = new Class306[i];
		((AbstractQueue_Sub1) this).aMap11269 = new HashMap();
		((AbstractQueue_Sub1) this).aComparator11271 = comparator;
	}

	public int size() {
		return -1363508737 * ((AbstractQueue_Sub1) this).anInt11268;
	}

	public boolean offer(Object object) {
		if (((AbstractQueue_Sub1) this).aMap11269.containsKey(object))
			throw new IllegalArgumentException("");
		((AbstractQueue_Sub1) this).anInt11270 += -284641933;
		int i = -1363508737 * ((AbstractQueue_Sub1) this).anInt11268;
		if (i >= ((AbstractQueue_Sub1) this).aClass306Array11272.length)
			method10257((byte) -1);
		((AbstractQueue_Sub1) this).anInt11268 += 524385791;
		if (i == 0) {
			((AbstractQueue_Sub1) this).aClass306Array11272[0] = new Class306(object, 0);
			((AbstractQueue_Sub1) this).aMap11269.put(object, ((AbstractQueue_Sub1) this).aClass306Array11272[0]);
		} else {
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = new Class306(object, i);
			((AbstractQueue_Sub1) this).aMap11269.put(object, ((AbstractQueue_Sub1) this).aClass306Array11272[i]);
			method10246(i, (byte) 101);
		}
		return true;
	}

	public Object peek() {
		if (-1363508737 * ((AbstractQueue_Sub1) this).anInt11268 == 0)
			return null;
		return (((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[0]).anObject3543);
	}

	void method10240() {
		int i = 1 + (((AbstractQueue_Sub1) this).aClass306Array11272.length << 1);
		((AbstractQueue_Sub1) this).aClass306Array11272 = ((Class306[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass306Array11272, i));
	}

	public boolean remove(Object object) {
		Class306 class306 = (Class306) ((AbstractQueue_Sub1) this).aMap11269.remove(object);
		if (class306 == null)
			return false;
		((AbstractQueue_Sub1) this).anInt11270 += -284641933;
		((AbstractQueue_Sub1) this).anInt11268 -= 524385791;
		if (1593070499 * ((Class306) class306).anInt3542 == -1363508737 * ((AbstractQueue_Sub1) this).anInt11268) {
			((AbstractQueue_Sub1) this).aClass306Array11272[-1363508737 * ((AbstractQueue_Sub1) this).anInt11268] = null;
			return true;
		}
		Class306 class306_0_ = (((AbstractQueue_Sub1) this).aClass306Array11272[-1363508737 * ((AbstractQueue_Sub1) this).anInt11268]);
		((AbstractQueue_Sub1) this).aClass306Array11272[((AbstractQueue_Sub1) this).anInt11268 * -1363508737] = null;
		((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499] = class306_0_;
		((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499])).anInt3542 = ((Class306) class306).anInt3542 * 1;
		method10245(((Class306) class306).anInt3542 * 1593070499, (byte) 4);
		if ((((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499]) == class306_0_)
			method10246(((Class306) class306).anInt3542 * 1593070499, (byte) -69);
		return true;
	}

	void method10241(int i) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_1_;
		for (int i_2_ = ((AbstractQueue_Sub1) this).anInt11268 * -1363508737 >>> 1; i < i_2_; i = i_1_) {
			int i_3_ = (i << 1) + 1;
			Class306 class306_4_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_3_];
			int i_5_ = (i << 1) + 2;
			Class306 class306_6_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_5_];
			if (null != ((AbstractQueue_Sub1) this).aComparator11271) {
				if (i_5_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737 && (((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306_4_).anObject3543, ((Class306) class306_6_).anObject3543)) > 0)
					i_1_ = i_5_;
				else
					i_1_ = i_3_;
			} else if ((i_5_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((Comparable) ((Class306) class306_4_).anObject3543).compareTo(((Class306) class306_6_).anObject3543)) > 0)
				i_1_ = i_5_;
			else
				i_1_ = i_3_;
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_1_])).anObject3543)) <= 0)
					break;
			} else if ((((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_1_])).anObject3543)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = ((AbstractQueue_Sub1) this).aClass306Array11272[i_1_];
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	public boolean contains(Object object) {
		return ((AbstractQueue_Sub1) this).aMap11269.containsKey(object);
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	void method10242(int i) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_7_;
		for (/**/; i > 0; i = i_7_) {
			i_7_ = i - 1 >>> 1;
			Class306 class306_8_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_7_];
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) class306_8_).anObject3543)) >= 0)
					break;
			} else if (((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) class306_8_).anObject3543) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306_8_;
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = i * -280725493;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	public Iterator method10243() {
		return new Class299(this);
	}

	public int method10244() {
		return -1363508737 * ((AbstractQueue_Sub1) this).anInt11268;
	}

	public Object poll() {
		if (0 == -1363508737 * ((AbstractQueue_Sub1) this).anInt11268)
			return null;
		((AbstractQueue_Sub1) this).anInt11270 += -284641933;
		Object object = (((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[0]).anObject3543);
		((AbstractQueue_Sub1) this).aMap11269.remove(object);
		((AbstractQueue_Sub1) this).anInt11268 -= 524385791;
		if (0 == ((AbstractQueue_Sub1) this).anInt11268 * -1363508737)
			((AbstractQueue_Sub1) this).aClass306Array11272[-1363508737 * ((AbstractQueue_Sub1) this).anInt11268] = null;
		else {
			((AbstractQueue_Sub1) this).aClass306Array11272[0] = (((AbstractQueue_Sub1) this).aClass306Array11272[((AbstractQueue_Sub1) this).anInt11268 * -1363508737]);
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[0]).anInt3542 = 0;
			((AbstractQueue_Sub1) this).aClass306Array11272[((AbstractQueue_Sub1) this).anInt11268 * -1363508737] = null;
			method10245(0, (byte) 4);
		}
		return object;
	}

	void method10245(int i, byte i_9_) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_10_;
		for (int i_11_ = ((AbstractQueue_Sub1) this).anInt11268 * -1363508737 >>> 1; i < i_11_; i = i_10_) {
			int i_12_ = (i << 1) + 1;
			Class306 class306_13_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_12_];
			int i_14_ = (i << 1) + 2;
			Class306 class306_15_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_14_];
			if (null != ((AbstractQueue_Sub1) this).aComparator11271) {
				if ((i_14_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306_13_).anObject3543, ((Class306) class306_15_).anObject3543)) > 0)
					i_10_ = i_14_;
				else
					i_10_ = i_12_;
			} else if ((i_14_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((Comparable) ((Class306) class306_13_).anObject3543).compareTo(((Class306) class306_15_).anObject3543)) > 0)
				i_10_ = i_14_;
			else
				i_10_ = i_12_;
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_10_])).anObject3543)) <= 0)
					break;
			} else if ((((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_10_])).anObject3543)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = ((AbstractQueue_Sub1) this).aClass306Array11272[i_10_];
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	void method10246(int i, byte i_16_) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_17_;
		for (/**/; i > 0; i = i_17_) {
			i_17_ = i - 1 >>> 1;
			Class306 class306_18_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_17_];
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) class306_18_).anObject3543)) >= 0)
					break;
			} else if (((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) class306_18_).anObject3543) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306_18_;
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = i * -280725493;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	public int method10247() {
		return -1363508737 * ((AbstractQueue_Sub1) this).anInt11268;
	}

	public Object[] method10248() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator11271 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11271);
		else
			Arrays.sort(objects);
		return objects;
	}

	void method10249(int i) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_19_;
		for (/**/; i > 0; i = i_19_) {
			i_19_ = i - 1 >>> 1;
			Class306 class306_20_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_19_];
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) class306_20_).anObject3543)) >= 0)
					break;
			} else if (((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) class306_20_).anObject3543) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306_20_;
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = i * -280725493;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	void method10250(int i) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_21_;
		for (int i_22_ = ((AbstractQueue_Sub1) this).anInt11268 * -1363508737 >>> 1; i < i_22_; i = i_21_) {
			int i_23_ = (i << 1) + 1;
			Class306 class306_24_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_23_];
			int i_25_ = (i << 1) + 2;
			Class306 class306_26_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_25_];
			if (null != ((AbstractQueue_Sub1) this).aComparator11271) {
				if ((i_25_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306_24_).anObject3543, ((Class306) class306_26_).anObject3543)) > 0)
					i_21_ = i_25_;
				else
					i_21_ = i_23_;
			} else if ((i_25_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((Comparable) ((Class306) class306_24_).anObject3543).compareTo(((Class306) class306_26_).anObject3543)) > 0)
				i_21_ = i_25_;
			else
				i_21_ = i_23_;
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_21_])).anObject3543)) <= 0)
					break;
			} else if ((((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_21_])).anObject3543)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = ((AbstractQueue_Sub1) this).aClass306Array11272[i_21_];
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	void method10251(int i) {
		Class306 class306 = ((AbstractQueue_Sub1) this).aClass306Array11272[i];
		int i_27_;
		for (int i_28_ = ((AbstractQueue_Sub1) this).anInt11268 * -1363508737 >>> 1; i < i_28_; i = i_27_) {
			int i_29_ = (i << 1) + 1;
			Class306 class306_30_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_29_];
			int i_31_ = (i << 1) + 2;
			Class306 class306_32_ = ((AbstractQueue_Sub1) this).aClass306Array11272[i_31_];
			if (null != ((AbstractQueue_Sub1) this).aComparator11271) {
				if ((i_31_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306_30_).anObject3543, ((Class306) class306_32_).anObject3543)) > 0)
					i_27_ = i_31_;
				else
					i_27_ = i_29_;
			} else if ((i_31_ < ((AbstractQueue_Sub1) this).anInt11268 * -1363508737) && (((Comparable) ((Class306) class306_30_).anObject3543).compareTo(((Class306) class306_32_).anObject3543)) > 0)
				i_27_ = i_31_;
			else
				i_27_ = i_29_;
			if (((AbstractQueue_Sub1) this).aComparator11271 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator11271.compare(((Class306) class306).anObject3543, ((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_27_])).anObject3543)) <= 0)
					break;
			} else if ((((Comparable) ((Class306) class306).anObject3543).compareTo(((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[i_27_])).anObject3543)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass306Array11272[i] = ((AbstractQueue_Sub1) this).aClass306Array11272[i_27_];
			((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
		}
		((AbstractQueue_Sub1) this).aClass306Array11272[i] = class306;
		((Class306) ((AbstractQueue_Sub1) this).aClass306Array11272[i]).anInt3542 = -280725493 * i;
	}

	public Iterator iterator() {
		return new Class299(this);
	}

	public boolean method10252(Object object) {
		return ((AbstractQueue_Sub1) this).aMap11269.containsKey(object);
	}

	public boolean method10253(Object object) {
		return ((AbstractQueue_Sub1) this).aMap11269.containsKey(object);
	}

	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator11271 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11271);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object[] method10254() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator11271 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11271);
		else
			Arrays.sort(objects);
		return objects;
	}

	public boolean method10255(Object object) {
		Class306 class306 = (Class306) ((AbstractQueue_Sub1) this).aMap11269.remove(object);
		if (class306 == null)
			return false;
		((AbstractQueue_Sub1) this).anInt11270 += -284641933;
		((AbstractQueue_Sub1) this).anInt11268 -= 524385791;
		if (1593070499 * ((Class306) class306).anInt3542 == -1363508737 * ((AbstractQueue_Sub1) this).anInt11268) {
			((AbstractQueue_Sub1) this).aClass306Array11272[-1363508737 * ((AbstractQueue_Sub1) this).anInt11268] = null;
			return true;
		}
		Class306 class306_33_ = (((AbstractQueue_Sub1) this).aClass306Array11272[-1363508737 * ((AbstractQueue_Sub1) this).anInt11268]);
		((AbstractQueue_Sub1) this).aClass306Array11272[((AbstractQueue_Sub1) this).anInt11268 * -1363508737] = null;
		((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499] = class306_33_;
		((Class306) (((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499])).anInt3542 = ((Class306) class306).anInt3542 * 1;
		method10245(((Class306) class306).anInt3542 * 1593070499, (byte) 4);
		if ((((AbstractQueue_Sub1) this).aClass306Array11272[((Class306) class306).anInt3542 * 1593070499]) == class306_33_)
			method10246(((Class306) class306).anInt3542 * 1593070499, (byte) -16);
		return true;
	}

	public Object[] method10256() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator11271 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11271);
		else
			Arrays.sort(objects);
		return objects;
	}

	void method10257(byte i) {
		int i_34_ = 1 + (((AbstractQueue_Sub1) this).aClass306Array11272.length << 1);
		((AbstractQueue_Sub1) this).aClass306Array11272 = ((Class306[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass306Array11272, i_34_));
	}
}
