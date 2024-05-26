package game;

/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class346 implements Interface17 {
	byte[] aByteArray4374;
	int[] anIntArray4375;
	short[] aShortArray4376;
	short[] aShortArray4377;
	short[] aShortArray4378;
	short[] aShortArray4379;
	byte[] aByteArray4380;
	Class248 aClass248_4381;
	int[] anIntArray4382 = { -1, -1, -1, -1, -1 };
	public static int[] anIntArray4383 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	public static int[] anIntArray4384 = { 7, 8, 9, 10, 11, 12, 13, 15 };
	public static int anInt4385;

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(878409701);
			if (0 == i_0_)
				break;
			method4329(class572_sub15, i_0_, (byte) 1);
		}
	}

	Class346(int i, Class248 class248) {
		((Class346) this).aClass248_4381 = class248;
	}

	public boolean method4321(int i) {
		if (((Class346) this).anIntArray4375 == null)
			return true;
		boolean bool = true;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i_1_ = 0; i_1_ < ((Class346) this).anIntArray4375.length; i_1_++) {
				if (!((Class346) this).aClass248_4381.method3369(((Class346) this).anIntArray4375[i_1_], 0, (byte) -64))
					bool = false;
			}
		}
		return bool;
	}

	public Class159 method4322(byte i) {
		if (((Class346) this).anIntArray4375 == null)
			return null;
		Class159[] class159s = new Class159[((Class346) this).anIntArray4375.length];
		synchronized (((Class346) this).aClass248_4381) {
			for (int i_2_ = 0; i_2_ < ((Class346) this).anIntArray4375.length; i_2_++)
				class159s[i_2_] = Class159.method2569(((Class346) this).aClass248_4381, (((Class346) this).anIntArray4375[i_2_]), 0);
		}
		for (int i_3_ = 0; i_3_ < ((Class346) this).anIntArray4375.length; i_3_++) {
			if (class159s[i_3_].anInt1773 < 13)
				class159s[i_3_].method2567(2);
		}
		Class159 class159;
		if (1 == class159s.length)
			class159 = class159s[0];
		else
			class159 = new Class159(class159s, class159s.length);
		if (null == class159)
			return null;
		if (null != ((Class346) this).aShortArray4377) {
			for (int i_4_ = 0; i_4_ < ((Class346) this).aShortArray4377.length; i_4_++)
				class159.method2562(((Class346) this).aShortArray4377[i_4_], ((Class346) this).aShortArray4376[i_4_]);
		}
		if (null != ((Class346) this).aShortArray4378) {
			for (int i_5_ = 0; i_5_ < ((Class346) this).aShortArray4378.length; i_5_++)
				class159.method2563(((Class346) this).aShortArray4378[i_5_], ((Class346) this).aShortArray4379[i_5_]);
		}
		return class159;
	}

	void method4323(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			class572_sub15.readUnsignedByte(918506022);
		else if (2 == i) {
			int i_6_ = class572_sub15.readUnsignedByte(-89080345);
			((Class346) this).anIntArray4375 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				((Class346) this).anIntArray4375[i_7_] = class572_sub15.readBigSmart((byte) 77);
		} else if (i != 3) {
			if (40 == i) {
				int i_8_ = class572_sub15.readUnsignedByte(1582146909);
				((Class346) this).aShortArray4377 = new short[i_8_];
				((Class346) this).aShortArray4376 = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					((Class346) this).aShortArray4377[i_9_] = (short) class572_sub15.readUnsignedShort(647518597);
					((Class346) this).aShortArray4376[i_9_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (41 == i) {
				int i_10_ = class572_sub15.readUnsignedByte(258680706);
				((Class346) this).aShortArray4378 = new short[i_10_];
				((Class346) this).aShortArray4379 = new short[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					((Class346) this).aShortArray4378[i_11_] = (short) class572_sub15.readUnsignedShort(647518597);
					((Class346) this).aShortArray4379[i_11_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (i == 44) {
				int i_12_ = class572_sub15.readUnsignedShort(647518597);
				int i_13_ = 0;
				for (int i_14_ = i_12_; i_14_ > 0; i_14_ >>= 1)
					i_13_++;
				((Class346) this).aByteArray4380 = new byte[i_13_];
				byte i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					if ((i_12_ & 1 << i_16_) > 0) {
						((Class346) this).aByteArray4380[i_16_] = i_15_;
						i_15_++;
					} else
						((Class346) this).aByteArray4380[i_16_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_17_ = class572_sub15.readUnsignedShort(647518597);
				int i_18_ = 0;
				for (int i_19_ = i_17_; i_19_ > 0; i_19_ >>= 1)
					i_18_++;
				((Class346) this).aByteArray4374 = new byte[i_18_];
				byte i_20_ = 0;
				for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
					if ((i_17_ & 1 << i_21_) > 0) {
						((Class346) this).aByteArray4374[i_21_] = i_20_;
						i_20_++;
					} else
						((Class346) this).aByteArray4374[i_21_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				((Class346) this).anIntArray4382[i - 60] = class572_sub15.readBigSmart((byte) 115);
		}
	}

	public Class159 method4324(int i) {
		Class159[] class159s = new Class159[5];
		int i_22_ = 0;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i_23_ = 0; i_23_ < 5; i_23_++) {
				if (-1 != ((Class346) this).anIntArray4382[i_23_])
					class159s[i_22_++] = Class159.method2569(((Class346) this).aClass248_4381, (((Class346) this).anIntArray4382[i_23_]), 0);
			}
		}
		for (int i_24_ = 0; i_24_ < 5; i_24_++) {
			if (null != class159s[i_24_] && class159s[i_24_].anInt1773 < 13)
				class159s[i_24_].method2567(2);
		}
		Class159 class159 = new Class159(class159s, i_22_);
		if (null != ((Class346) this).aShortArray4377) {
			for (int i_25_ = 0; i_25_ < ((Class346) this).aShortArray4377.length; i_25_++)
				class159.method2562(((Class346) this).aShortArray4377[i_25_], ((Class346) this).aShortArray4376[i_25_]);
		}
		if (null != ((Class346) this).aShortArray4378) {
			for (int i_26_ = 0; i_26_ < ((Class346) this).aShortArray4378.length; i_26_++)
				class159.method2563(((Class346) this).aShortArray4378[i_26_], ((Class346) this).aShortArray4379[i_26_]);
		}
		return class159;
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1601750701);
			if (0 == i)
				break;
			method4329(class572_sub15, i, (byte) 1);
		}
	}

	public boolean method4325(byte i) {
		boolean bool = true;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i_27_ = 0; i_27_ < 5; i_27_++) {
				if (-1 != ((Class346) this).anIntArray4382[i_27_] && !(((Class346) this).aClass248_4381.method3369(((Class346) this).anIntArray4382[i_27_], 0, (byte) -123)))
					bool = false;
			}
		}
		return bool;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(314136981);
			if (0 == i)
				break;
			method4329(class572_sub15, i, (byte) 1);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1909569579);
			if (0 == i)
				break;
			method4329(class572_sub15, i, (byte) 1);
		}
	}

	public boolean method4326() {
		if (((Class346) this).anIntArray4375 == null)
			return true;
		boolean bool = true;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i = 0; i < ((Class346) this).anIntArray4375.length; i++) {
				if (!((Class346) this).aClass248_4381.method3369(((Class346) this).anIntArray4375[i], 0, (byte) -6))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method4327() {
		if (((Class346) this).anIntArray4375 == null)
			return true;
		boolean bool = true;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i = 0; i < ((Class346) this).anIntArray4375.length; i++) {
				if (!((Class346) this).aClass248_4381.method3369(((Class346) this).anIntArray4375[i], 0, (byte) -3))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method4328() {
		boolean bool = true;
		synchronized (((Class346) this).aClass248_4381) {
			for (int i = 0; i < 5; i++) {
				if (-1 != ((Class346) this).anIntArray4382[i] && !(((Class346) this).aClass248_4381.method3369(((Class346) this).anIntArray4382[i], 0, (byte) -122)))
					bool = false;
			}
		}
		return bool;
	}

	void method4329(RSByteBuffer class572_sub15, int i, byte i_28_) {
		if (1 == i)
			class572_sub15.readUnsignedByte(-112568765);
		else if (2 == i) {
			int i_29_ = class572_sub15.readUnsignedByte(1421590922);
			((Class346) this).anIntArray4375 = new int[i_29_];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
				((Class346) this).anIntArray4375[i_30_] = class572_sub15.readBigSmart((byte) 11);
		} else if (i != 3) {
			if (40 == i) {
				int i_31_ = class572_sub15.readUnsignedByte(1148245275);
				((Class346) this).aShortArray4377 = new short[i_31_];
				((Class346) this).aShortArray4376 = new short[i_31_];
				for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
					((Class346) this).aShortArray4377[i_32_] = (short) class572_sub15.readUnsignedShort(647518597);
					((Class346) this).aShortArray4376[i_32_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (41 == i) {
				int i_33_ = class572_sub15.readUnsignedByte(1060217248);
				((Class346) this).aShortArray4378 = new short[i_33_];
				((Class346) this).aShortArray4379 = new short[i_33_];
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					((Class346) this).aShortArray4378[i_34_] = (short) class572_sub15.readUnsignedShort(647518597);
					((Class346) this).aShortArray4379[i_34_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (i == 44) {
				int i_35_ = class572_sub15.readUnsignedShort(647518597);
				int i_36_ = 0;
				for (int i_37_ = i_35_; i_37_ > 0; i_37_ >>= 1)
					i_36_++;
				((Class346) this).aByteArray4380 = new byte[i_36_];
				byte i_38_ = 0;
				for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
					if ((i_35_ & 1 << i_39_) > 0) {
						((Class346) this).aByteArray4380[i_39_] = i_38_;
						i_38_++;
					} else
						((Class346) this).aByteArray4380[i_39_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_40_ = class572_sub15.readUnsignedShort(647518597);
				int i_41_ = 0;
				for (int i_42_ = i_40_; i_42_ > 0; i_42_ >>= 1)
					i_41_++;
				((Class346) this).aByteArray4374 = new byte[i_41_];
				byte i_43_ = 0;
				for (int i_44_ = 0; i_44_ < i_41_; i_44_++) {
					if ((i_40_ & 1 << i_44_) > 0) {
						((Class346) this).aByteArray4374[i_44_] = i_43_;
						i_43_++;
					} else
						((Class346) this).aByteArray4374[i_44_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				((Class346) this).anIntArray4382[i - 60] = class572_sub15.readBigSmart((byte) 44);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1472481242);
			if (0 == i)
				break;
			method4329(class572_sub15, i, (byte) 1);
		}
	}

	public void method104(byte i) {
		/* empty */
	}

	static final void method4330(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		HashTable.method5541(class73, class83, class441, 1544448116);
	}

	static final void method4331(Cs2Executor class441, int i) {
		int i_45_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_45_, (short) -18183);
		Class83 class83 = Class534.aClass83Array5975[i_45_ >> 16];
		Class427.method5192(class73, class83, class441, 225103158);
	}

	static final void method4332(Cs2Executor class441, int i) {
		Class477.method5644(true, 1260844292);
	}

	static Class572_Sub24 method4333(byte i) {
		Class649 class649 = null;
		Class572_Sub24 class572_sub24 = new Class572_Sub24(client.aClass437_8705, 0);
		try {
			class649 = Class504.method6027("", client.aClass437_8705.aString5074, false, -1988511486);
			byte[] is = new byte[(int) class649.method7667(668769978)];
			int i_46_;
			for (int i_47_ = 0; i_47_ < is.length; i_47_ += i_46_) {
				i_46_ = class649.method7665(is, i_47_, is.length - i_47_, -847349832);
				if (i_46_ == -1)
					throw new IOException();
			}
			class572_sub24 = new Class572_Sub24(new RSByteBuffer(is), client.aClass437_8705, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class649)
				class649.method7673(1896824521);
		} catch (Exception exception) {
			/* empty */
		}
		return class572_sub24;
	}
}
