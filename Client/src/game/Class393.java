package game;

/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class393 {
	static Class393 aClass393_4665;
	public static Class393 aClass393_4666;
	static Class393 aClass393_4667;
	public static Class393 aClass393_4668;
	static Class393 aClass393_4669 = new Class393(0);
	public static Class393 aClass393_4670;
	int anInt4671;

	static {
		aClass393_4665 = new Class393(1);
		aClass393_4667 = new Class393(2);
		aClass393_4668 = new Class393(3);
		aClass393_4666 = new Class393(4);
		aClass393_4670 = new Class393(5);
	}

	Class393(int i) {
		((Class393) this).anInt4671 = i * 1244540539;
	}

	static final void method4732(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -1957439894;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 4]);
		int i_5_ = (((Cs2Executor) class441).intStack[5 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class603 class603 = Class344.audio.method935(Class124.aClass124_1504, Class344.audio, i_0_, i_1_, i_3_, Class126.aClass126_1509.method2215(-1150684554), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_4_, false, 803860465);
		if (class603 != null)
			Class344.audio.method952(class603, i_5_, i_2_, (byte) 12);
	}

	static final void method4733(Cs2Executor class441, byte i) {
		Class104.method1654(-2116210864);
	}

	static final void method4734(Entity class456_sub1_sub2_sub3, int i) {
		Class663 class663 = class456_sub1_sub2_sub3.aClass663_11670;
		if ((client.cycles == class456_sub1_sub2_sub3.anInt11639 * -1601124661) || !class663.method7786(1916421701) || class663.method7803(1, -2004615007)) {
			int i_6_ = (-1601124661 * class456_sub1_sub2_sub3.anInt11639 - 88781565 * class456_sub1_sub2_sub3.anInt11638);
			int i_7_ = (client.cycles - class456_sub1_sub2_sub3.anInt11638 * 88781565);
			int i_8_ = (class456_sub1_sub2_sub3.anInt11634 * 2012755456 + class456_sub1_sub2_sub3.method10556((short) -3609) * 256);
			int i_9_ = (1522627072 * class456_sub1_sub2_sub3.anInt11636 + (class456_sub1_sub2_sub3.method10556((short) -23871) * 256));
			int i_10_ = (class456_sub1_sub2_sub3.anInt11635 * 946614784 + (class456_sub1_sub2_sub3.method10556((short) -26179) * 256));
			int i_11_ = (1892185600 * class456_sub1_sub2_sub3.anInt11637 + (class456_sub1_sub2_sub3.method10556((short) -28547) * 256));
			Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
			class456_sub1_sub2_sub3.method5395((float) ((i_7_ * i_10_ + i_8_ * (i_6_ - i_7_)) / i_6_), (float) (int) class240.aFloat2656, (float) ((i_9_ * (i_6_ - i_7_) + i_11_ * i_7_) / i_6_));
		}
		class456_sub1_sub2_sub3.anInt11662 = 0;
		class456_sub1_sub2_sub3.method10516((-1423603271 * (class456_sub1_sub2_sub3.anInt11624)), false, 648650492);
	}

	static int method4735(byte[][] is, byte[][] is_12_, int[] is_13_, byte[] is_14_, int[] is_15_, int i, int i_16_, int i_17_) {
		int i_18_ = is_13_[i];
		int i_19_ = is_15_[i] + i_18_;
		int i_20_ = is_13_[i_16_];
		int i_21_ = i_20_ + is_15_[i_16_];
		int i_22_ = i_18_;
		if (i_20_ > i_18_)
			i_22_ = i_20_;
		int i_23_ = i_19_;
		if (i_21_ < i_19_)
			i_23_ = i_21_;
		int i_24_ = is_14_[i] & 0xff;
		if ((is_14_[i_16_] & 0xff) < i_24_)
			i_24_ = is_14_[i_16_] & 0xff;
		byte[] is_25_ = is_12_[i];
		byte[] is_26_ = is[i_16_];
		int i_27_ = i_22_ - i_18_;
		int i_28_ = i_22_ - i_20_;
		for (int i_29_ = i_22_; i_29_ < i_23_; i_29_++) {
			int i_30_ = is_25_[i_27_++] + is_26_[i_28_++];
			if (i_30_ < i_24_)
				i_24_ = i_30_;
		}
		return -i_24_;
	}
}
