package game;

/* Class675 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class Class675 implements Iterable, Collection {
	Class572 aClass572_8546;
	public Class572 aClass572_8547 = new Class572();

	public Class675() {
		aClass572_8547.aClass572_6433 = aClass572_8547;
		aClass572_8547.aClass572_6431 = aClass572_8547;
	}

	public void method7918(int i) {
		while (aClass572_8547 != aClass572_8547.aClass572_6433)
			aClass572_8547.aClass572_6433.method6794((byte) -82);
	}

	public int method7919() {
		return super.hashCode();
	}

	public Class572 method7920(int i) {
		Class572 class572 = aClass572_8547.aClass572_6433;
		if (class572 == aClass572_8547)
			return null;
		class572.method6794((byte) 47);
		return class572;
	}

	void method7921(Class675 class675_0_, Class572 class572, byte i) {
		Class572 class572_1_ = aClass572_8547.aClass572_6431;
		aClass572_8547.aClass572_6431 = class572.aClass572_6431;
		class572.aClass572_6431.aClass572_6433 = aClass572_8547;
		if (aClass572_8547 != class572) {
			class572.aClass572_6431 = class675_0_.aClass572_8547.aClass572_6431;
			class572.aClass572_6431.aClass572_6433 = class572;
			class572_1_.aClass572_6433 = class675_0_.aClass572_8547;
			class675_0_.aClass572_8547.aClass572_6431 = class572_1_;
		}
	}

	public int method7922() {
		return method7927(1120522574);
	}

	public void method7923(Class675 class675_2_, int i) {
		if (aClass572_8547.aClass572_6433 != aClass572_8547)
			method7921(class675_2_, aClass572_8547.aClass572_6433, (byte) -100);
	}

	Class572 method7924(Class572 class572, int i) {
		Class572 class572_3_;
		if (null == class572)
			class572_3_ = aClass572_8547.aClass572_6433;
		else
			class572_3_ = class572;
		if (class572_3_ == aClass572_8547) {
			((Class675) this).aClass572_8546 = null;
			return null;
		}
		((Class675) this).aClass572_8546 = class572_3_.aClass572_6433;
		return class572_3_;
	}

	public Class572 method7925(int i) {
		return method7955(null, -1702123361);
	}

	public Class572 method7926(int i) {
		Class572 class572 = ((Class675) this).aClass572_8546;
		if (class572 == aClass572_8547) {
			((Class675) this).aClass572_8546 = null;
			return null;
		}
		((Class675) this).aClass572_8546 = class572.aClass572_6433;
		return class572;
	}

	public int method7927(int i) {
		int i_4_ = 0;
		for (Class572 class572 = aClass572_8547.aClass572_6433; class572 != aClass572_8547; class572 = class572.aClass572_6433)
			i_4_++;
		return i_4_;
	}

	public boolean method7928(byte i) {
		return aClass572_8547.aClass572_6433 == aClass572_8547;
	}

	Class572[] method7929(byte i) {
		Class572[] class572s = new Class572[method7927(-409963443)];
		int i_5_ = 0;
		for (Class572 class572 = aClass572_8547.aClass572_6433; class572 != aClass572_8547; class572 = class572.aClass572_6433)
			class572s[i_5_++] = class572;
		return class572s;
	}

	public int size() {
		return method7927(-47151480);
	}

	public boolean isEmpty() {
		return method7928((byte) -59);
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return method7929((byte) 1);
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Class572 class572 = aClass572_8547.aClass572_6433; class572 != aClass572_8547; class572 = class572.aClass572_6433)
			objects[i++] = class572;
		return objects;
	}

	boolean method7930(Class572 class572, byte i) {
		method7940(class572, -1673304281);
		return true;
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	public Object[] method7931() {
		return method7929((byte) 1);
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public Class572 method7932(byte i) {
		return method7924(null, -491851003);
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public boolean add(Object object) {
		return method7930((Class572) object, (byte) -19);
	}

	public Class572 method7933(int i) {
		Class572 class572 = ((Class675) this).aClass572_8546;
		if (class572 == aClass572_8547) {
			((Class675) this).aClass572_8546 = null;
			return null;
		}
		((Class675) this).aClass572_8546 = class572.aClass572_6431;
		return class572;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public int method7934() {
		return super.hashCode();
	}

	public int method7935() {
		return super.hashCode();
	}

	public void clear() {
		method7918(-314259602);
	}

	public Iterator method7936() {
		return new Class656(this);
	}

	public Object[] method7937() {
		return method7929((byte) 1);
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method7938(Object object) {
		throw new RuntimeException();
	}

	public boolean method7939() {
		return method7928((byte) -70);
	}

	public void method7940(Class572 class572, int i) {
		if (null != class572.aClass572_6431)
			class572.method6794((byte) 68);
		class572.aClass572_6431 = aClass572_8547.aClass572_6431;
		class572.aClass572_6433 = aClass572_8547;
		class572.aClass572_6431.aClass572_6433 = class572;
		class572.aClass572_6433.aClass572_6431 = class572;
	}

	public Object[] method7941() {
		return method7929((byte) 1);
	}

	public boolean method7942(Object object) {
		return super.equals(object);
	}

	public boolean method7943(Object object) {
		return super.equals(object);
	}

	public void method7944() {
		while (aClass572_8547 != aClass572_8547.aClass572_6433)
			aClass572_8547.aClass572_6433.method6794((byte) 20);
	}

	public boolean method7945(Object object) {
		throw new RuntimeException();
	}

	public void method7946() {
		while (aClass572_8547 != aClass572_8547.aClass572_6433)
			aClass572_8547.aClass572_6433.method6794((byte) -1);
	}

	public void method7947() {
		while (aClass572_8547 != aClass572_8547.aClass572_6433)
			aClass572_8547.aClass572_6433.method6794((byte) 84);
	}

	public Iterator iterator() {
		return new Class656(this);
	}

	public boolean method7948() {
		return aClass572_8547.aClass572_6433 == aClass572_8547;
	}

	public boolean method7949() {
		return aClass572_8547.aClass572_6433 == aClass572_8547;
	}

	public boolean method7950() {
		return aClass572_8547.aClass572_6433 == aClass572_8547;
	}

	public boolean method7951() {
		return aClass572_8547.aClass572_6433 == aClass572_8547;
	}

	public boolean method7952(Object object) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public Object[] method7953() {
		return method7929((byte) 1);
	}

	public boolean method7954() {
		return method7928((byte) -64);
	}

	Class572 method7955(Class572 class572, int i) {
		Class572 class572_6_;
		if (null == class572)
			class572_6_ = aClass572_8547.aClass572_6431;
		else
			class572_6_ = class572;
		if (aClass572_8547 == class572_6_) {
			((Class675) this).aClass572_8546 = null;
			return null;
		}
		((Class675) this).aClass572_8546 = class572_6_.aClass572_6431;
		return class572_6_;
	}

	public int method7956() {
		int i = 0;
		for (Class572 class572 = aClass572_8547.aClass572_6433; class572 != aClass572_8547; class572 = class572.aClass572_6433)
			i++;
		return i;
	}

	public void method7957() {
		while (aClass572_8547 != aClass572_8547.aClass572_6433)
			aClass572_8547.aClass572_6433.method6794((byte) -99);
	}

	public int method7958() {
		return method7927(-480052948);
	}

	public void method7959() {
		method7918(618698342);
	}

	static void method7960(long l) {
		Class273.aCalendar2898.setTime(new Date(l));
	}

	static void method7961(int i, int i_7_, byte i_8_) {
		if (Class25.anInt164 * 2039670899 == 1)
			Class319.method4094(Class108.aClass572_Sub12_Sub10_1425, i, i_7_, (byte) -5);
		else if (2 == 2039670899 * Class25.anInt164)
			Class398.method4765(i, i_7_, -1231710845);
		Class25.anInt164 = 0;
		Class108.aClass572_Sub12_Sub10_1425 = null;
	}
}
