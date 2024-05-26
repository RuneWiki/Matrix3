package game;

/* Class629 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class629 implements Iterator {
	Class572 aClass572_8107;
	int anInt8108;
	Class676 aClass676_8109;
	Class572 aClass572_8110 = null;
	public static Class639_Sub20 aClass639_Sub20_8111;

	public Class629(Class676 class676) {
		((Class629) this).aClass676_8109 = class676;
		method7504(-746081542);
	}

	void method7504(int i) {
		((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[0].aClass572_6433);
		((Class629) this).anInt8108 = -1875808761;
		((Class629) this).aClass572_8110 = null;
	}

	public Class572 method7505(int i) {
		method7504(-1272918279);
		return (Class572) next();
	}

	public Class572 method7506() {
		method7504(318550780);
		return (Class572) next();
	}

	public boolean hasNext() {
		if (((Class629) this).aClass572_8107 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]))
			return true;
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[(((Class629) this).anInt8108 += -1875808761) * 655138743 - 1].aClass572_6433) != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1].aClass572_6433);
				return true;
			}
			((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1]);
		}
		return false;
	}

	public void remove() {
		if (null == ((Class629) this).aClass572_8110)
			throw new IllegalStateException();
		((Class629) this).aClass572_8110.method6794((byte) -27);
		((Class629) this).aClass572_8110 = null;
	}

	public boolean method7507() {
		if (((Class629) this).aClass572_8107 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]))
			return true;
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[(((Class629) this).anInt8108 += -1875808761) * 655138743 - 1].aClass572_6433) != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1].aClass572_6433);
				return true;
			}
			((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1]);
		}
		return false;
	}

	public boolean method7508() {
		if (((Class629) this).aClass572_8107 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]))
			return true;
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[(((Class629) this).anInt8108 += -1875808761) * 655138743 - 1].aClass572_6433) != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1].aClass572_6433);
				return true;
			}
			((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1]);
		}
		return false;
	}

	public Object method7509() {
		if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]) != ((Class629) this).aClass572_8107) {
			Class572 class572 = ((Class629) this).aClass572_8107;
			((Class629) this).aClass572_8107 = class572.aClass572_6433;
			((Class629) this).aClass572_8110 = class572;
			return class572;
		}
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			Class572 class572 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((((Class629) this).anInt8108 += -1875808761) * 655138743 - 1)].aClass572_6433);
			if (class572 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = class572.aClass572_6433;
				((Class629) this).aClass572_8110 = class572;
				return class572;
			}
		}
		return null;
	}

	public Object method7510() {
		if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]) != ((Class629) this).aClass572_8107) {
			Class572 class572 = ((Class629) this).aClass572_8107;
			((Class629) this).aClass572_8107 = class572.aClass572_6433;
			((Class629) this).aClass572_8110 = class572;
			return class572;
		}
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			Class572 class572 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((((Class629) this).anInt8108 += -1875808761) * 655138743 - 1)].aClass572_6433);
			if (class572 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = class572.aClass572_6433;
				((Class629) this).aClass572_8110 = class572;
				return class572;
			}
		}
		return null;
	}

	public void method7511() {
		if (null == ((Class629) this).aClass572_8110)
			throw new IllegalStateException();
		((Class629) this).aClass572_8110.method6794((byte) -95);
		((Class629) this).aClass572_8110 = null;
	}

	public void method7512() {
		if (null == ((Class629) this).aClass572_8110)
			throw new IllegalStateException();
		((Class629) this).aClass572_8110.method6794((byte) -26);
		((Class629) this).aClass572_8110 = null;
	}

	void method7513() {
		((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[0].aClass572_6433);
		((Class629) this).anInt8108 = -1875808761;
		((Class629) this).aClass572_8110 = null;
	}

	void method7514() {
		((Class629) this).aClass572_8107 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[0].aClass572_6433);
		((Class629) this).anInt8108 = -1875808761;
		((Class629) this).aClass572_8110 = null;
	}

	public Object next() {
		if ((((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[655138743 * ((Class629) this).anInt8108 - 1]) != ((Class629) this).aClass572_8107) {
			Class572 class572 = ((Class629) this).aClass572_8107;
			((Class629) this).aClass572_8107 = class572.aClass572_6433;
			((Class629) this).aClass572_8110 = class572;
			return class572;
		}
		while (655138743 * ((Class629) this).anInt8108 < (((Class676) ((Class629) this).aClass676_8109).anInt8553 * 1786127235)) {
			Class572 class572 = (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((((Class629) this).anInt8108 += -1875808761) * 655138743 - 1)].aClass572_6433);
			if (class572 != (((Class676) ((Class629) this).aClass676_8109).aClass572Array8549[((Class629) this).anInt8108 * 655138743 - 1])) {
				((Class629) this).aClass572_8107 = class572.aClass572_6433;
				((Class629) this).aClass572_8110 = class572;
				return class572;
			}
		}
		return null;
	}

	public static int method7515(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = 255 - i_1_;
		i_0_ = ((i_0_ & 0xff00ff) * i_1_ & ~0xff00ff | (i_0_ & 0xff00) * i_1_ & 0xff0000) >>> 8;
		return (((i_3_ * (i & 0xff00ff) & ~0xff00ff | i_3_ * (i & 0xff00) & 0xff0000) >>> 8) + i_0_);
	}

	static final void method7516(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		NPC class456_sub1_sub2_sub3_sub1 = ((NPC) ((Cs2Executor) class441).entity);
		int i_5_ = class456_sub1_sub2_sub3_sub1.method10684(i_4_, -2117536172);
		int i_6_ = class456_sub1_sub2_sub3_sub1.method10689(i_4_, -281142006);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_5_;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_6_;
	}
}
