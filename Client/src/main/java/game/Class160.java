package game;

/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160 {
	static final int anInt1819 = 0;
	static final int anInt1820 = 1;
	static final int anInt1821 = 0;

	public static Class87 method2571(Class248 class248, int i, int i_0_) {
		byte[] is = class248.getFile(i, i_0_, 1171097566);
		if (is == null)
			return null;
		return method2575(is)[0];
	}

	public static Class87 method2572(Class248 class248, int i) {
		byte[] is = class248.method3373(i, (byte) -54);
		if (is == null)
			return null;
		return method2575(is)[0];
	}

	public static Class87[] method2573(Class248 class248, int i, int i_1_) {
		byte[] is = class248.getFile(i, i_1_, -1514995783);
		if (is == null)
			return null;
		return method2575(is);
	}

	public static Class87[] method2574(Class248 class248, int i) {
		byte[] is = class248.method3373(i, (byte) 16);
		if (is == null)
			return null;
		return method2575(is);
	}

	public static Class87[] method2575(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		class572_sub15.o = (is.length - 2) * 310393755;
		int i = class572_sub15.readUnsignedShort(647518597);
		int i_2_ = i >> 15;
		int i_3_ = i & 0x7fff;
		if (i_2_ == 0) {
			Class87_Sub1[] class87_sub1s = new Class87_Sub1[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				class87_sub1s[i_4_] = new Class87_Sub1();
			class572_sub15.o = (is.length - 7 - i_3_ * 8) * 310393755;
			int i_5_ = class572_sub15.readUnsignedShort(647518597);
			int i_6_ = class572_sub15.readUnsignedShort(647518597);
			int i_7_ = (class572_sub15.readUnsignedByte(1991319986) & 0xff) + 1;
			for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
				class87_sub1s[i_8_].anInt9968 = class572_sub15.readUnsignedShort(647518597);
			for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
				class87_sub1s[i_9_].anInt9970 = class572_sub15.readUnsignedShort(647518597);
			for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
				((Class87_Sub1) class87_sub1s[i_10_]).anInt9973 = class572_sub15.readUnsignedShort(647518597);
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++)
				((Class87_Sub1) class87_sub1s[i_11_]).anInt9966 = class572_sub15.readUnsignedShort(647518597);
			for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
				Class87_Sub1 class87_sub1 = class87_sub1s[i_12_];
				((Class87_Sub1) class87_sub1).anInt9974 = (i_5_ - ((Class87_Sub1) class87_sub1).anInt9973 - class87_sub1.anInt9968);
				((Class87_Sub1) class87_sub1).anInt9971 = (i_6_ - ((Class87_Sub1) class87_sub1).anInt9966 - class87_sub1.anInt9970);
			}
			class572_sub15.o = (is.length - 7 - i_3_ * 8 - (i_7_ - 1) * 3) * 310393755;
			int[] is_13_ = new int[i_7_];
			for (int i_14_ = 1; i_14_ < i_7_; i_14_++) {
				is_13_[i_14_] = class572_sub15.read24BitInt(1140925462);
				if (is_13_[i_14_] == 0)
					is_13_[i_14_] = 1;
			}
			for (int i_15_ = 0; i_15_ < i_3_; i_15_++)
				class87_sub1s[i_15_].anIntArray9967 = is_13_;
			class572_sub15.o = 0;
			for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
				Class87_Sub1 class87_sub1 = class87_sub1s[i_16_];
				int i_17_ = (((Class87_Sub1) class87_sub1).anInt9973 * ((Class87_Sub1) class87_sub1).anInt9966);
				class87_sub1.aByteArray9969 = new byte[i_17_];
				int i_18_ = class572_sub15.readUnsignedByte(1189109216);
				if ((i_18_ & 0x2) == 0) {
					if ((i_18_ & 0x1) == 0) {
						for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
							class87_sub1.aByteArray9969[i_19_] = class572_sub15.readByte(1553091593);
					} else {
						for (int i_20_ = 0; i_20_ < ((Class87_Sub1) class87_sub1).anInt9973; i_20_++) {
							for (int i_21_ = 0; (i_21_ < ((Class87_Sub1) class87_sub1).anInt9966); i_21_++)
								class87_sub1.aByteArray9969[i_20_ + i_21_ * ((Class87_Sub1) class87_sub1).anInt9973] = class572_sub15.readByte(897074811);
						}
					}
				} else {
					boolean bool = false;
					class87_sub1.aByteArray9972 = new byte[i_17_];
					if ((i_18_ & 0x1) == 0) {
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
							class87_sub1.aByteArray9969[i_22_] = class572_sub15.readByte(554637771);
						for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
							byte i_24_ = (class87_sub1.aByteArray9972[i_23_] = class572_sub15.readByte(744628849));
							bool = bool | i_24_ != -1;
						}
					} else {
						for (int i_25_ = 0; i_25_ < ((Class87_Sub1) class87_sub1).anInt9973; i_25_++) {
							for (int i_26_ = 0; (i_26_ < ((Class87_Sub1) class87_sub1).anInt9966); i_26_++)
								class87_sub1.aByteArray9969[i_25_ + i_26_ * ((Class87_Sub1) class87_sub1).anInt9973] = class572_sub15.readByte(1902803396);
						}
						for (int i_27_ = 0; i_27_ < ((Class87_Sub1) class87_sub1).anInt9973; i_27_++) {
							for (int i_28_ = 0; (i_28_ < ((Class87_Sub1) class87_sub1).anInt9966); i_28_++) {
								byte i_29_ = (class87_sub1.aByteArray9972[i_27_ + i_28_ * (((Class87_Sub1) class87_sub1).anInt9973)] = class572_sub15.readByte(167099307));
								bool = bool | i_29_ != -1;
							}
						}
					}
					if (!bool)
						class87_sub1.aByteArray9972 = null;
				}
			}
			return class87_sub1s;
		}
		Class87_Sub2[] class87_sub2s = new Class87_Sub2[i_3_];
		class572_sub15.o = 0;
		int i_30_ = class572_sub15.readUnsignedByte(64555656);
		if (i_30_ == 0) {
			boolean bool = class572_sub15.readUnsignedByte(39143585) == 1;
			int i_31_ = class572_sub15.readUnsignedShort(647518597);
			int i_32_ = class572_sub15.readUnsignedShort(647518597);
			for (int i_33_ = 0; i_33_ < i_3_; i_33_++) {
				int[] is_34_ = new int[i_31_ * i_32_];
				for (int i_35_ = 0; i_35_ < i_31_ * i_32_; i_35_++) {
					is_34_[i_35_] = ~0xffffff | class572_sub15.read24BitInt(1140925462);
					if (is_34_[i_35_] == -65281)
						is_34_[i_35_] = 0;
				}
				if (bool) {
					for (int i_36_ = 0; i_36_ < i_31_ * i_32_; i_36_++) {
						is_34_[i_36_] &= 0xffffff;
						is_34_[i_36_] |= class572_sub15.readUnsignedByte(2028578289) << 24;
					}
				}
				class87_sub2s[i_33_] = new Class87_Sub2(i_31_, i_32_, is_34_);
			}
		} else {
			if (i_30_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class87_sub2s;
	}

	Class160() throws Throwable {
		throw new Error();
	}
}
