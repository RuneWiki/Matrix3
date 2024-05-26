package game;

/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class664 implements Iterable {
	Class572_Sub12 aClass572_Sub12_8488;
	public Class572_Sub12 aClass572_Sub12_8489 = new Class572_Sub12();
	public static Class639_Sub22 aClass639_Sub22_8490;

	public void method7841(short i) {
		while (aClass572_Sub12_8489.aClass572_Sub12_9094 != aClass572_Sub12_8489)
			aClass572_Sub12_8489.aClass572_Sub12_9094.method8412(724585842);
	}

	public void method7842(Class572_Sub12 class572_sub12, int i) {
		if (class572_sub12.aClass572_Sub12_9092 != null)
			class572_sub12.method8412(724585842);
		class572_sub12.aClass572_Sub12_9092 = aClass572_Sub12_8489.aClass572_Sub12_9092;
		class572_sub12.aClass572_Sub12_9094 = aClass572_Sub12_8489;
		class572_sub12.aClass572_Sub12_9092.aClass572_Sub12_9094 = class572_sub12;
		class572_sub12.aClass572_Sub12_9094.aClass572_Sub12_9092 = class572_sub12;
	}

	public Class572_Sub12 method7843(int i) {
		Class572_Sub12 class572_sub12 = aClass572_Sub12_8489.aClass572_Sub12_9094;
		if (class572_sub12 == aClass572_Sub12_8489)
			return null;
		class572_sub12.method8412(724585842);
		return class572_sub12;
	}

	public int method7844(byte i) {
		int i_0_ = 0;
		for (Class572_Sub12 class572_sub12 = aClass572_Sub12_8489.aClass572_Sub12_9094; class572_sub12 != aClass572_Sub12_8489; class572_sub12 = class572_sub12.aClass572_Sub12_9094)
			i_0_++;
		return i_0_;
	}

	public Class572_Sub12 method7845(int i) {
		Class572_Sub12 class572_sub12 = ((Class664) this).aClass572_Sub12_8488;
		if (aClass572_Sub12_8489 == class572_sub12) {
			((Class664) this).aClass572_Sub12_8488 = null;
			return null;
		}
		((Class664) this).aClass572_Sub12_8488 = class572_sub12.aClass572_Sub12_9094;
		return class572_sub12;
	}

	public Iterator iterator() {
		return new Class677(this);
	}

	public Iterator method7846() {
		return new Class677(this);
	}

	public void method7847() {
		while (aClass572_Sub12_8489.aClass572_Sub12_9094 != aClass572_Sub12_8489)
			aClass572_Sub12_8489.aClass572_Sub12_9094.method8412(724585842);
	}

	public Class572_Sub12 method7848(int i) {
		return method7850(null, 1036236272);
	}

	public int method7849() {
		int i = 0;
		for (Class572_Sub12 class572_sub12 = aClass572_Sub12_8489.aClass572_Sub12_9094; class572_sub12 != aClass572_Sub12_8489; class572_sub12 = class572_sub12.aClass572_Sub12_9094)
			i++;
		return i;
	}

	Class572_Sub12 method7850(Class572_Sub12 class572_sub12, int i) {
		Class572_Sub12 class572_sub12_1_;
		if (class572_sub12 == null)
			class572_sub12_1_ = aClass572_Sub12_8489.aClass572_Sub12_9094;
		else
			class572_sub12_1_ = class572_sub12;
		if (class572_sub12_1_ == aClass572_Sub12_8489) {
			((Class664) this).aClass572_Sub12_8488 = null;
			return null;
		}
		((Class664) this).aClass572_Sub12_8488 = class572_sub12_1_.aClass572_Sub12_9094;
		return class572_sub12_1_;
	}

	public void method7851() {
		while (aClass572_Sub12_8489.aClass572_Sub12_9094 != aClass572_Sub12_8489)
			aClass572_Sub12_8489.aClass572_Sub12_9094.method8412(724585842);
	}

	public Class664() {
		aClass572_Sub12_8489.aClass572_Sub12_9094 = aClass572_Sub12_8489;
		aClass572_Sub12_8489.aClass572_Sub12_9092 = aClass572_Sub12_8489;
	}

	public int method7852() {
		int i = 0;
		for (Class572_Sub12 class572_sub12 = aClass572_Sub12_8489.aClass572_Sub12_9094; class572_sub12 != aClass572_Sub12_8489; class572_sub12 = class572_sub12.aClass572_Sub12_9094)
			i++;
		return i;
	}

	static boolean method7853(int i, short i_2_) {
		return 16 == i || 17 == i || i == 8;
	}

	static final void method7854(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3739, client.aClass195_8589.aClass650_2340, -18735249);
		class572_sub25.aRsByteBuffer.writeShort(i_3_, -1677082746);
		client.aClass195_8589.method2929(class572_sub25, (byte) -92);
	}
}
