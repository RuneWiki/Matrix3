package game;

/* Class670 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class670 implements Interface17, Interface73 {
	public int anInt8521;
	public int anInt8522;
	int anInt8523 = 0;
	public boolean aBool8524;
	public int anInt8525;
	public boolean aBool8526;
	public int anInt8527;
	public int anInt8528;
	public int anInt8529;

	Class670() {
		anInt8522 = -1035295431;
		anInt8525 = -516712960;
		aBool8524 = true;
		aBool8526 = true;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1424196760);
			if (0 == i_0_)
				break;
			method7879(class572_sub15, i_0_, (byte) 1);
		}
	}

	public void method110() {
		/* empty */
	}

	void method7878(int i, int i_1_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_2_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_3_ = (double) (i & 0xff) / 256.0;
		double d_4_ = d;
		if (d_2_ < d_4_)
			d_4_ = d_2_;
		if (d_3_ < d_4_)
			d_4_ = d_3_;
		double d_5_ = d;
		if (d_2_ > d_5_)
			d_5_ = d_2_;
		if (d_3_ > d_5_)
			d_5_ = d_3_;
		double d_6_ = 0.0;
		double d_7_ = 0.0;
		double d_8_ = (d_4_ + d_5_) / 2.0;
		if (d_4_ != d_5_) {
			if (d_8_ < 0.5)
				d_7_ = (d_5_ - d_4_) / (d_5_ + d_4_);
			if (d_8_ >= 0.5)
				d_7_ = (d_5_ - d_4_) / (2.0 - d_5_ - d_4_);
			if (d == d_5_)
				d_6_ = (d_2_ - d_3_) / (d_5_ - d_4_);
			else if (d_2_ == d_5_)
				d_6_ = 2.0 + (d_3_ - d) / (d_5_ - d_4_);
			else if (d_3_ == d_5_)
				d_6_ = (d - d_2_) / (d_5_ - d_4_) + 4.0;
		}
		d_6_ /= 6.0;
		anInt8521 = (int) (d_7_ * 256.0) * 1729808041;
		anInt8527 = -105987155 * (int) (256.0 * d_8_);
		if (anInt8521 * 285293977 < 0)
			anInt8521 = 0;
		else if (anInt8521 * 285293977 > 255)
			anInt8521 = -1280581033;
		if (anInt8527 * 1437308965 < 0)
			anInt8527 = 0;
		else if (1437308965 * anInt8527 > 255)
			anInt8527 = -1256920749;
		if (d_8_ > 0.5)
			anInt8529 = (int) (d_7_ * (1.0 - d_8_) * 512.0) * 1568563175;
		else
			anInt8529 = (int) (d_8_ * d_7_ * 512.0) * 1568563175;
		if (1906066391 * anInt8529 < 1)
			anInt8529 = 1568563175;
		anInt8528 = (int) (d_6_ * (double) (1906066391 * anInt8529)) * -1388870665;
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method468(int i, int i_9_) {
		/* empty */
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1632375881);
			if (0 == i)
				break;
			method7879(class572_sub15, i, (byte) 48);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(236494110);
			if (0 == i)
				break;
			method7879(class572_sub15, i, (byte) -72);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(521932376);
			if (0 == i)
				break;
			method7879(class572_sub15, i, (byte) -35);
		}
	}

	public void method103() {
		/* empty */
	}

	void method7879(RSByteBuffer class572_sub15, int i, byte i_10_) {
		if (i == 1) {
			((Class670) this).anInt8523 = class572_sub15.read24BitInt(1140925462) * 2122824627;
			method7878(-757634181 * ((Class670) this).anInt8523, 264890327);
		} else if (i == 2) {
			anInt8522 = class572_sub15.readUnsignedShort(647518597) * 1035295431;
			if (65535 == 1278559991 * anInt8522)
				anInt8522 = -1035295431;
		} else if (3 == i)
			anInt8525 = (class572_sub15.readUnsignedShort(647518597) << 2) * 829462987;
		else if (i == 4)
			aBool8524 = false;
		else if (5 == i)
			aBool8526 = false;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(612456953);
			if (0 == i)
				break;
			method7879(class572_sub15, i, (byte) -10);
		}
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	void method7880(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			((Class670) this).anInt8523 = class572_sub15.read24BitInt(1140925462) * 2122824627;
			method7878(-757634181 * ((Class670) this).anInt8523, 264890327);
		} else if (i == 2) {
			anInt8522 = class572_sub15.readUnsignedShort(647518597) * 1035295431;
			if (65535 == 1278559991 * anInt8522)
				anInt8522 = -1035295431;
		} else if (3 == i)
			anInt8525 = (class572_sub15.readUnsignedShort(647518597) << 2) * 829462987;
		else if (i == 4)
			aBool8524 = false;
		else if (5 == i)
			aBool8526 = false;
	}

	void method7881(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_11_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_12_ = (double) (i & 0xff) / 256.0;
		double d_13_ = d;
		if (d_11_ < d_13_)
			d_13_ = d_11_;
		if (d_12_ < d_13_)
			d_13_ = d_12_;
		double d_14_ = d;
		if (d_11_ > d_14_)
			d_14_ = d_11_;
		if (d_12_ > d_14_)
			d_14_ = d_12_;
		double d_15_ = 0.0;
		double d_16_ = 0.0;
		double d_17_ = (d_13_ + d_14_) / 2.0;
		if (d_13_ != d_14_) {
			if (d_17_ < 0.5)
				d_16_ = (d_14_ - d_13_) / (d_14_ + d_13_);
			if (d_17_ >= 0.5)
				d_16_ = (d_14_ - d_13_) / (2.0 - d_14_ - d_13_);
			if (d == d_14_)
				d_15_ = (d_11_ - d_12_) / (d_14_ - d_13_);
			else if (d_11_ == d_14_)
				d_15_ = 2.0 + (d_12_ - d) / (d_14_ - d_13_);
			else if (d_12_ == d_14_)
				d_15_ = (d - d_11_) / (d_14_ - d_13_) + 4.0;
		}
		d_15_ /= 6.0;
		anInt8521 = (int) (d_16_ * 256.0) * 1729808041;
		anInt8527 = -105987155 * (int) (256.0 * d_17_);
		if (anInt8521 * 285293977 < 0)
			anInt8521 = 0;
		else if (anInt8521 * 285293977 > 255)
			anInt8521 = -1280581033;
		if (anInt8527 * 1437308965 < 0)
			anInt8527 = 0;
		else if (1437308965 * anInt8527 > 255)
			anInt8527 = -1256920749;
		if (d_17_ > 0.5)
			anInt8529 = (int) (d_16_ * (1.0 - d_17_) * 512.0) * 1568563175;
		else
			anInt8529 = (int) (d_17_ * d_16_ * 512.0) * 1568563175;
		if (1906066391 * anInt8529 < 1)
			anInt8529 = 1568563175;
		anInt8528 = (int) (d_15_ * (double) (1906066391 * anInt8529)) * -1388870665;
	}

	public static void method7882(int i, String string, int i_18_) {
		Class375_Sub3.method8878(i, 0, "", "", "", string, 1921854908);
	}

	static final void method7883(Cs2Executor class441, int i) {
		int i_19_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_19_, (short) 18278);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -579902323 * class73.anInt798;
	}
}
