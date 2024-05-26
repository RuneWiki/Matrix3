package game;

/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class535 {
	int anInt5976;
	int anInt5977;
	int anInt5978;
	int anInt5979;
	int anInt5980;
	int anInt5981;
	int anInt5982;
	int anInt5983;
	int anInt5984;
	int anInt5985;

	Class535(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		((Class535) this).anInt5981 = i;
		((Class535) this).anInt5977 = i_0_;
		((Class535) this).anInt5978 = i_1_;
		((Class535) this).anInt5983 = i_2_ * i_2_;
		((Class535) this).anInt5980 = ((Class535) this).anInt5981 + i_3_;
		((Class535) this).anInt5979 = ((Class535) this).anInt5981 + i_4_;
		((Class535) this).anInt5982 = ((Class535) this).anInt5977 + i_5_;
		((Class535) this).anInt5976 = ((Class535) this).anInt5977 + i_6_;
		((Class535) this).anInt5984 = ((Class535) this).anInt5978 + i_7_;
		((Class535) this).anInt5985 = ((Class535) this).anInt5978 + i_8_;
	}

	public boolean method6376(int i, int i_9_, int i_10_) {
		if (i < ((Class535) this).anInt5980 || i > ((Class535) this).anInt5979)
			return false;
		if (i_9_ < ((Class535) this).anInt5982 || i_9_ > ((Class535) this).anInt5976)
			return false;
		if (i_10_ < ((Class535) this).anInt5984 || i_10_ > ((Class535) this).anInt5985)
			return false;
		int i_11_ = i - ((Class535) this).anInt5981;
		int i_12_ = i_10_ - ((Class535) this).anInt5978;
		return i_11_ * i_11_ + i_12_ * i_12_ < ((Class535) this).anInt5983;
	}

	public boolean method6377(int i, int i_13_, int i_14_) {
		if (i < ((Class535) this).anInt5980 || i > ((Class535) this).anInt5979)
			return false;
		if (i_13_ < ((Class535) this).anInt5982 || i_13_ > ((Class535) this).anInt5976)
			return false;
		if (i_14_ < ((Class535) this).anInt5984 || i_14_ > ((Class535) this).anInt5985)
			return false;
		int i_15_ = i - ((Class535) this).anInt5981;
		int i_16_ = i_14_ - ((Class535) this).anInt5978;
		return i_15_ * i_15_ + i_16_ * i_16_ < ((Class535) this).anInt5983;
	}

	public boolean method6378(int i, int i_17_, int i_18_) {
		if (i < ((Class535) this).anInt5980 || i > ((Class535) this).anInt5979)
			return false;
		if (i_17_ < ((Class535) this).anInt5982 || i_17_ > ((Class535) this).anInt5976)
			return false;
		if (i_18_ < ((Class535) this).anInt5984 || i_18_ > ((Class535) this).anInt5985)
			return false;
		int i_19_ = i - ((Class535) this).anInt5981;
		int i_20_ = i_18_ - ((Class535) this).anInt5978;
		return i_19_ * i_19_ + i_20_ * i_20_ < ((Class535) this).anInt5983;
	}

	void method6379(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		((Class535) this).anInt5981 = i;
		((Class535) this).anInt5977 = i_21_;
		((Class535) this).anInt5978 = i_22_;
		((Class535) this).anInt5983 = i_23_ * i_23_;
		((Class535) this).anInt5980 = ((Class535) this).anInt5981 + i_24_;
		((Class535) this).anInt5979 = ((Class535) this).anInt5981 + i_25_;
		((Class535) this).anInt5982 = ((Class535) this).anInt5977 + i_26_;
		((Class535) this).anInt5976 = ((Class535) this).anInt5977 + i_27_;
		((Class535) this).anInt5984 = ((Class535) this).anInt5978 + i_28_;
		((Class535) this).anInt5985 = ((Class535) this).anInt5978 + i_29_;
	}
}
