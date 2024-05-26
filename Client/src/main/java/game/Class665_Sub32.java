package game;

/* Class665_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub32 extends Class665 {
	public static final int anInt9620 = 0;
	public static final int anInt9621 = 1;

	public Class665_Sub32(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	int method7861() {
		return 1;
	}

	public void method9150(int i) {
		if (-767431539 * volume != 1 && 0 != volume * -767431539)
			volume = method7858((byte) -50) * 2081142341;
	}

	public int method7856(int i) {
		return 1;
	}

	public boolean method9151(byte i) {
		return true;
	}

	public int method9152() {
		return -767431539 * volume;
	}

	public Class665_Sub32(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	public int method9153(int i) {
		return -767431539 * volume;
	}

	public int method7863(int i, int i_0_) {
		return 1;
	}

	public int method7862(int i) {
		return 1;
	}

	public int method7857(int i) {
		return 1;
	}

	public int method7864(int i) {
		return 1;
	}

	int method7858(byte i) {
		return 1;
	}

	void method7865(int i) {
		volume = i * 2081142341;
	}

	void method7855(int i) {
		volume = i * 2081142341;
	}

	public void method9154() {
		if (-767431539 * volume != 1 && 0 != volume * -767431539)
			volume = method7858((byte) -95) * 2081142341;
	}

	public void method9155() {
		if (-767431539 * volume != 1 && 0 != volume * -767431539)
			volume = method7858((byte) -63) * 2081142341;
	}

	public void method9156() {
		if (-767431539 * volume != 1 && 0 != volume * -767431539)
			volume = method7858((byte) -4) * 2081142341;
	}

	public void method9157() {
		if (-767431539 * volume != 1 && 0 != volume * -767431539)
			volume = method7858((byte) -84) * 2081142341;
	}

	public int method9158() {
		return -767431539 * volume;
	}

	void setVolume(int i, byte i_1_) {
		volume = i * 2081142341;
	}

	public static int method9159(int i, int i_2_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_3_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_4_ = (double) (i & 0xff) / 256.0;
		double d_5_ = d;
		if (d_3_ < d_5_)
			d_5_ = d_3_;
		if (d_4_ < d_5_)
			d_5_ = d_4_;
		double d_6_ = d;
		if (d_3_ > d_6_)
			d_6_ = d_3_;
		if (d_4_ > d_6_)
			d_6_ = d_4_;
		double d_7_ = 0.0;
		double d_8_ = 0.0;
		double d_9_ = (d_6_ + d_5_) / 2.0;
		if (d_6_ != d_5_) {
			if (d_9_ < 0.5)
				d_8_ = (d_6_ - d_5_) / (d_6_ + d_5_);
			if (d_9_ >= 0.5)
				d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
			if (d == d_6_)
				d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
			else if (d_6_ == d_3_)
				d_7_ = 2.0 + (d_4_ - d) / (d_6_ - d_5_);
			else if (d_4_ == d_6_)
				d_7_ = 4.0 + (d - d_3_) / (d_6_ - d_5_);
		}
		d_7_ /= 6.0;
		int i_10_ = (int) (256.0 * d_7_);
		int i_11_ = (int) (d_8_ * 256.0);
		int i_12_ = (int) (d_9_ * 256.0);
		if (i_11_ < 0)
			i_11_ = 0;
		else if (i_11_ > 255)
			i_11_ = 255;
		if (i_12_ < 0)
			i_12_ = 0;
		else if (i_12_ > 255)
			i_12_ = 255;
		if (i_12_ > 243)
			i_11_ >>= 4;
		else if (i_12_ > 217)
			i_11_ >>= 3;
		else if (i_12_ > 192)
			i_11_ >>= 2;
		else if (i_12_ > 179)
			i_11_ >>= 1;
		return ((i_12_ >> 1) + ((i_11_ >> 5 << 7) + ((i_10_ & 0xff) >> 2 << 10)));
	}

	static final void method9160(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class422.aByte4988;
	}
}
