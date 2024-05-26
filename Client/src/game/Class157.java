package game;

/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157 {
	Interface12 anInterface12_1756;
	static final int anInt1757 = 128;
	boolean aBool1758 = true;
	Class180 aClass180_1759;
	int anInt1760;
	static final int anInt1761 = 7;
	Class106_Sub1 aClass106_Sub1_1762;
	int anInt1763;
	int anInt1764;
	Class155_Sub4 aClass155_Sub4_1765;
	Class158_Sub1 aClass158_Sub1_1766;
	int anInt1767 = -1;

	void method2545() {
		method2546(((Class157) this).anInterface12_1756, ((Class157) this).anInt1764);
	}

	void method2546(Interface12 interface12, int i) {
		if (i != 0) {
			method2549();
			((Class157) this).aClass106_Sub1_1762.method9422(((Class157) this).aClass155_Sub4_1765);
			((Class157) this).aClass106_Sub1_1762.method9411(interface12, 4, 0, i);
		}
	}

	void method2547(byte[] is, int i) {
		((Class157) this).aClass158_Sub1_1766.method69(5123, is, i * 2);
		method2546(((Class157) this).aClass158_Sub1_1766, i);
	}

	Class157(Class106_Sub1 class106_sub1, Class180 class180, Class174_Sub3 class174_sub3, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class157) this).aClass106_Sub1_1762 = class106_sub1;
		((Class157) this).aClass180_1759 = class180;
		((Class157) this).anInt1760 = i_2_;
		((Class157) this).anInt1763 = i_3_;
		int i_4_ = 1 << i_1_;
		int i_5_ = 0;
		int i_6_ = i << i_1_;
		int i_7_ = i_0_ << i_1_;
		for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
			int i_9_ = ((i_7_ + i_8_) * (class174_sub3.anInt2086 * -1715487093) + i_6_);
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
				short[] is = (((Class174_Sub3) class174_sub3).aShortArrayArray10882[i_9_++]);
				if (is != null)
					i_5_ += is.length;
			}
		}
		((Class157) this).anInt1764 = i_5_;
		if (i_5_ > 0) {
			RSByteBuffer class572_sub15 = new RSByteBuffer(i_5_ * 2);
			if (((Class106_Sub1) ((Class157) this).aClass106_Sub1_1762).aBool10153) {
				for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
					int i_12_ = ((i_7_ + i_11_) * (class174_sub3.anInt2086 * -1715487093) + i_6_);
					for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
						short[] is = (((Class174_Sub3) class174_sub3).aShortArrayArray10882[i_12_++]);
						if (is != null) {
							for (int i_14_ = 0; i_14_ < is.length; i_14_++)
								class572_sub15.writeShort(is[i_14_] & 0xffff, -1869892645);
						}
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
					int i_16_ = ((i_7_ + i_15_) * (class174_sub3.anInt2086 * -1715487093) + i_6_);
					for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
						short[] is = (((Class174_Sub3) class174_sub3).aShortArrayArray10882[i_16_++]);
						if (is != null) {
							for (int i_18_ = 0; i_18_ < is.length; i_18_++)
								class572_sub15.method8453(is[i_18_] & 0xffff, 1719910861);
						}
					}
				}
			}
			((Class157) this).anInterface12_1756 = (((Class157) this).aClass106_Sub1_1762.method9412(5123, class572_sub15.b, class572_sub15.o * -1585139053, false));
			((Class157) this).aClass158_Sub1_1766 = new Class158_Sub1(((Class157) this).aClass106_Sub1_1762, 5123, null, 1);
		} else
			((Class157) this).aClass155_Sub4_1765 = null;
	}

	void method2548() {
		method2546(((Class157) this).anInterface12_1756, ((Class157) this).anInt1764);
	}

	void method2549() {
		if (((Class157) this).aBool1758) {
			((Class157) this).aBool1758 = false;
			byte[] is = ((Class180) ((Class157) this).aClass180_1759).aByteArray2116;
			byte[] is_19_ = (((Class106_Sub1) ((Class157) this).aClass106_Sub1_1762).aByteArray10193);
			int i = 0;
			int i_20_ = ((Class180) ((Class157) this).aClass180_1759).anInt2118;
			int i_21_ = (((Class157) this).anInt1760 + (((Class157) this).anInt1763 * (((Class180) ((Class157) this).aClass180_1759).anInt2118)));
			for (int i_22_ = -128; i_22_ < 0; i_22_++) {
				i = (i << 8) - i;
				for (int i_23_ = -128; i_23_ < 0; i_23_++) {
					if (is[i_21_++] != 0)
						i++;
				}
				i_21_ += i_20_ - 128;
			}
			if (((Class157) this).aClass155_Sub4_1765 != null && ((Class157) this).anInt1767 == i)
				((Class157) this).aBool1758 = false;
			else {
				((Class157) this).anInt1767 = i;
				int i_24_ = 0;
				i_21_ = (((Class157) this).anInt1760 + ((Class157) this).anInt1763 * i_20_);
				for (int i_25_ = -128; i_25_ < 0; i_25_++) {
					for (int i_26_ = -128; i_26_ < 0; i_26_++) {
						if (is[i_21_] != 0)
							is_19_[i_24_++] = (byte) 68;
						else {
							int i_27_ = 0;
							if (is[i_21_ - 1] != 0)
								i_27_++;
							if (is[i_21_ + 1] != 0)
								i_27_++;
							if (is[i_21_ - i_20_] != 0)
								i_27_++;
							if (is[i_21_ + i_20_] != 0)
								i_27_++;
							is_19_[i_24_++] = (byte) (17 * i_27_);
						}
						i_21_++;
					}
					i_21_ += (((Class180) ((Class157) this).aClass180_1759).anInt2118) - 128;
				}
				if (((Class157) this).aClass155_Sub4_1765 == null) {
					((Class157) this).aClass155_Sub4_1765 = new Class155_Sub4((((Class157) this).aClass106_Sub1_1762), 3553, Class171.aClass171_2073, Class88.aClass88_1218, 128, 128, false, (((Class106_Sub1) (((Class157) this).aClass106_Sub1_1762)).aByteArray10193), Class171.aClass171_2073, false);
					((Class157) this).aClass155_Sub4_1765.method9195(false, false);
					((Class157) this).aClass155_Sub4_1765.method2517(true);
				} else
					((Class157) this).aClass155_Sub4_1765.method9196(0, 0, 128, 128, (((Class106_Sub1) ((Class157) this).aClass106_Sub1_1762).aByteArray10193), Class171.aClass171_2073, 0, 0, false);
			}
		}
	}

	void method2550() {
		if (((Class157) this).aBool1758) {
			((Class157) this).aBool1758 = false;
			byte[] is = ((Class180) ((Class157) this).aClass180_1759).aByteArray2116;
			byte[] is_28_ = (((Class106_Sub1) ((Class157) this).aClass106_Sub1_1762).aByteArray10193);
			int i = 0;
			int i_29_ = ((Class180) ((Class157) this).aClass180_1759).anInt2118;
			int i_30_ = (((Class157) this).anInt1760 + (((Class157) this).anInt1763 * (((Class180) ((Class157) this).aClass180_1759).anInt2118)));
			for (int i_31_ = -128; i_31_ < 0; i_31_++) {
				i = (i << 8) - i;
				for (int i_32_ = -128; i_32_ < 0; i_32_++) {
					if (is[i_30_++] != 0)
						i++;
				}
				i_30_ += i_29_ - 128;
			}
			if (((Class157) this).aClass155_Sub4_1765 != null && ((Class157) this).anInt1767 == i)
				((Class157) this).aBool1758 = false;
			else {
				((Class157) this).anInt1767 = i;
				int i_33_ = 0;
				i_30_ = (((Class157) this).anInt1760 + ((Class157) this).anInt1763 * i_29_);
				for (int i_34_ = -128; i_34_ < 0; i_34_++) {
					for (int i_35_ = -128; i_35_ < 0; i_35_++) {
						if (is[i_30_] != 0)
							is_28_[i_33_++] = (byte) 68;
						else {
							int i_36_ = 0;
							if (is[i_30_ - 1] != 0)
								i_36_++;
							if (is[i_30_ + 1] != 0)
								i_36_++;
							if (is[i_30_ - i_29_] != 0)
								i_36_++;
							if (is[i_30_ + i_29_] != 0)
								i_36_++;
							is_28_[i_33_++] = (byte) (17 * i_36_);
						}
						i_30_++;
					}
					i_30_ += (((Class180) ((Class157) this).aClass180_1759).anInt2118) - 128;
				}
				if (((Class157) this).aClass155_Sub4_1765 == null) {
					((Class157) this).aClass155_Sub4_1765 = new Class155_Sub4((((Class157) this).aClass106_Sub1_1762), 3553, Class171.aClass171_2073, Class88.aClass88_1218, 128, 128, false, (((Class106_Sub1) (((Class157) this).aClass106_Sub1_1762)).aByteArray10193), Class171.aClass171_2073, false);
					((Class157) this).aClass155_Sub4_1765.method9195(false, false);
					((Class157) this).aClass155_Sub4_1765.method2517(true);
				} else
					((Class157) this).aClass155_Sub4_1765.method9196(0, 0, 128, 128, (((Class106_Sub1) ((Class157) this).aClass106_Sub1_1762).aByteArray10193), Class171.aClass171_2073, 0, 0, false);
			}
		}
	}
}
