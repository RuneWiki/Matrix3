package game;

/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class487 implements Iterable {
	Class489[] aClass489Array5449;

	void method5790(byte[] is, byte i) {
		method5796((byte) -93);
		if (is == null)
			((Class487) this).aClass489Array5449 = new Class489[0];
		else
			method5793(new RSByteBuffer(is), -2100549287);
	}

	public int method5791(byte i) {
		return ((Class487) this).aClass489Array5449.length;
	}

	void method5792(byte[] is) {
		method5796((byte) -19);
		if (is == null)
			((Class487) this).aClass489Array5449 = new Class489[0];
		else
			method5793(new RSByteBuffer(is), -2100549287);
	}

	void method5793(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1522696583);
			if (i_0_ == 0)
				break;
			if (1 == i_0_) {
				int i_1_ = class572_sub15.readUnsignedByte(446390297);
				int i_2_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
					int i_4_ = class572_sub15.readUnsignedByte(349075359);
					int i_5_ = class572_sub15.readUnsignedShort(647518597);
					int i_6_ = class572_sub15.readUnsignedByte(768981550);
					boolean bool = 0 != (i_6_ & 0x1);
					int i_7_ = 0;
					if ((i_6_ & 0x2) != 0)
						i_7_ = class572_sub15.readUnsignedByte(1537437799);
					boolean bool_8_ = class572_sub15.readUnsignedByte(-26177053) == 1;
					linkedlist.add(new Class489(i_4_, i_5_, bool, bool_8_, i_7_));
					if (i_4_ > i_2_)
						i_2_ = i_4_;
				}
				((Class487) this).aClass489Array5449 = new Class489[i_2_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					((Class487) this).aClass489Array5449[class489.method5816(1986326126)] = class489;
				}
			}
		}
	}

	public Class489 method5794(int i, int i_9_) {
		return ((Class487) this).aClass489Array5449[i];
	}

	public Class487(Class248 class248) {
		method5790(class248.method3373((Class471.aClass471_5288.anInt5290 * 960259487), (byte) 34), (byte) -56);
	}

	public Iterator iterator() {
		return new Class495(((Class487) this).aClass489Array5449);
	}

	public Iterator method5795() {
		return new Class495(((Class487) this).aClass489Array5449);
	}

	void method5796(byte i) {
		((Class487) this).aClass489Array5449 = null;
	}

	void method5797() {
		((Class487) this).aClass489Array5449 = null;
	}

	void method5798(byte[] is) {
		method5796((byte) -115);
		if (is == null)
			((Class487) this).aClass489Array5449 = new Class489[0];
		else
			method5793(new RSByteBuffer(is), -2100549287);
	}

	void method5799() {
		((Class487) this).aClass489Array5449 = null;
	}

	public int method5800() {
		return ((Class487) this).aClass489Array5449.length;
	}

	void method5801(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(655623062);
			if (i == 0)
				break;
			if (1 == i) {
				int i_10_ = class572_sub15.readUnsignedByte(1446671675);
				int i_11_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
					int i_13_ = class572_sub15.readUnsignedByte(273978121);
					int i_14_ = class572_sub15.readUnsignedShort(647518597);
					int i_15_ = class572_sub15.readUnsignedByte(1131982736);
					boolean bool = 0 != (i_15_ & 0x1);
					int i_16_ = 0;
					if ((i_15_ & 0x2) != 0)
						i_16_ = class572_sub15.readUnsignedByte(582370243);
					boolean bool_17_ = class572_sub15.readUnsignedByte(749638114) == 1;
					linkedlist.add(new Class489(i_13_, i_14_, bool, bool_17_, i_16_));
					if (i_13_ > i_11_)
						i_11_ = i_13_;
				}
				((Class487) this).aClass489Array5449 = new Class489[i_11_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					((Class487) this).aClass489Array5449[class489.method5816(376923290)] = class489;
				}
			}
		}
	}

	static final void method5802(Cs2Executor class441, int i) {
		int i_18_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_18_, (short) 615);
		Class83 class83 = Class534.aClass83Array5975[i_18_ >> 16];
		Class456_Sub1_Sub2.method10472(class73, class83, class441, -573875336);
	}

	static final void method5803(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}
}
