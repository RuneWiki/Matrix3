package game;

/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class392 {
	int[] anIntArray4661;
	static Class103 aClass103_4662;
	public static Class248 aClass248_4663;
	public static Class248 aClass248_4664;

	public Class392(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
			/* empty */
		}
		((Class392) this).anIntArray4661 = new int[i + i];
		for (int i_0_ = 0; i_0_ < i + i; i_0_++)
			((Class392) this).anIntArray4661[i_0_] = -1;
		for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
			int i_2_;
			for (i_2_ = is[i_1_] & i - 1; ((Class392) this).anIntArray4661[i_2_ + i_2_ + 1] != -1; i_2_ = 1 + i_2_ & i - 1) {
				/* empty */
			}
			((Class392) this).anIntArray4661[i_2_ + i_2_] = is[i_1_];
			((Class392) this).anIntArray4661[i_2_ + i_2_ + 1] = i_1_;
		}
	}

	public int method4724(int i) {
		int i_3_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_4_ = i & i_3_;
		for (;;) {
			int i_5_ = ((Class392) this).anIntArray4661[1 + (i_4_ + i_4_)];
			if (i_5_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_4_ + i_4_])
				return i_5_;
			i_4_ = i_4_ + 1 & i_3_;
		}
	}

	public int method4725(int i) {
		int i_6_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_7_ = i & i_6_;
		for (;;) {
			int i_8_ = ((Class392) this).anIntArray4661[1 + (i_7_ + i_7_)];
			if (i_8_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_7_ + i_7_])
				return i_8_;
			i_7_ = i_7_ + 1 & i_6_;
		}
	}

	public int method4726(int i) {
		int i_9_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_10_ = i & i_9_;
		for (;;) {
			int i_11_ = ((Class392) this).anIntArray4661[1 + (i_10_ + i_10_)];
			if (i_11_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_10_ + i_10_])
				return i_11_;
			i_10_ = i_10_ + 1 & i_9_;
		}
	}

	public int method4727(int i) {
		int i_12_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_13_ = i & i_12_;
		for (;;) {
			int i_14_ = ((Class392) this).anIntArray4661[1 + (i_13_ + i_13_)];
			if (i_14_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_13_ + i_13_])
				return i_14_;
			i_13_ = i_13_ + 1 & i_12_;
		}
	}

	public int method4728(int i) {
		int i_15_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_16_ = i & i_15_;
		for (;;) {
			int i_17_ = ((Class392) this).anIntArray4661[1 + (i_16_ + i_16_)];
			if (i_17_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_16_ + i_16_])
				return i_17_;
			i_16_ = i_16_ + 1 & i_15_;
		}
	}

	public int method4729(int i, int i_18_) {
		int i_19_ = (((Class392) this).anIntArray4661.length >> 1) - 1;
		int i_20_ = i & i_19_;
		for (;;) {
			int i_21_ = ((Class392) this).anIntArray4661[1 + (i_20_ + i_20_)];
			if (i_21_ == -1)
				return -1;
			if (i == ((Class392) this).anIntArray4661[i_20_ + i_20_])
				return i_21_;
			i_20_ = i_20_ + 1 & i_19_;
		}
	}

	public static void method4730(byte i) {
		if (Class520.aBool5800) {
			int i_22_ = Class572_Sub2.aTwitchTV8969.ShutdownTTV();
			if (0 == i_22_) {
				Class572_Sub2.aTwitchTV8969 = null;
				Class520.aBool5800 = false;
			}
		}
	}

	public static final void method4731(int i, int i_23_) {
		if (null != Class251.aClass572_Sub10_2731 && (i >= 0 && i < Class251.aClass572_Sub10_2731.anInt9082 * -58096969)) {
			Class343 class343 = Class251.aClass572_Sub10_2731.aClass343Array9084[i];
			if (class343.aByte4360 == -1) {
				Class195 class195 = Class166.method2676((byte) 50);
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3705, class195.aClass650_2340, -1212248874);
				class572_sub25.aRsByteBuffer.writeByte(2 + ObjectDefinitions.method6069(class343.aString4361, -2141290465), -1384395473);
				class572_sub25.aRsByteBuffer.writeShort(i, -1617771891);
				class572_sub25.aRsByteBuffer.writeString(class343.aString4361, (byte) -128);
				class195.method2929(class572_sub25, (byte) -46);
			}
		}
	}
}
