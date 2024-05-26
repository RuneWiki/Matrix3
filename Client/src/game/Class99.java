package game;

/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99 {
	static final int anInt1264 = 2;
	static short[] aShortArray1265;
	static short[] aShortArray1266;
	static short[] aShortArray1267;
	static short[] aShortArray1268;
	Class572_Sub23 aClass572_Sub23_1269 = null;
	static short[] aShortArray1270 = new short[500];
	int anInt1271 = 0;
	short[] aShortArray1272;
	short[] aShortArray1273;
	short[] aShortArray1274;
	static final int anInt1275 = 1;
	byte[] aByteArray1276;
	short[] aShortArray1277;
	boolean aBool1278 = false;
	boolean aBool1279 = false;
	boolean aBool1280 = false;
	short[] aShortArray1281;
	static final int anInt1282 = 2;
	static byte[] aByteArray1283;

	static {
		aShortArray1265 = new short[500];
		aShortArray1266 = new short[500];
		aShortArray1267 = new short[500];
		aShortArray1268 = new short[500];
		aByteArray1283 = new byte[500];
	}

	Class99(byte[] is, Class572_Sub23 class572_sub23) {
		((Class99) this).aClass572_Sub23_1269 = class572_sub23;
		try {
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			RSByteBuffer class572_sub15_0_ = new RSByteBuffer(is);
			int i = class572_sub15.readUnsignedByte(465530513);
			class572_sub15.o += 620787510;
			int i_1_ = class572_sub15.readUnsignedShort(647518597);
			int i_2_ = 0;
			int i_3_ = -1;
			int i_4_ = -1;
			class572_sub15_0_.o = (class572_sub15.o * -1585139053 + i_1_) * 310393755;
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
				int i_6_ = (((Class572_Sub23) ((Class99) this).aClass572_Sub23_1269).anIntArray9196[i_5_]);
				if (i_6_ == 0)
					i_3_ = i_5_;
				int i_7_ = class572_sub15.readUnsignedByte(1162707184);
				if (i_7_ > 0) {
					if (i_6_ == 0)
						i_4_ = i_5_;
					aShortArray1270[i_2_] = (short) i_5_;
					short i_8_ = 0;
					if (i_6_ == 3 || i_6_ == 10)
						i_8_ = (short) 128;
					if (i >= 2 && i_6_ == 7) {
						if ((i_7_ & 0x1) != 0) {
							aShortArray1265[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
							class572_sub15_0_.readSmart(16777215);
						} else
							aShortArray1265[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0) {
							aShortArray1266[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
							class572_sub15_0_.readSmart(16777215);
						} else
							aShortArray1266[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0) {
							aShortArray1267[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
							class572_sub15_0_.readSmart(16777215);
						} else
							aShortArray1267[i_2_] = i_8_;
					} else {
						if ((i_7_ & 0x1) != 0)
							aShortArray1265[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
						else
							aShortArray1265[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0)
							aShortArray1266[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
						else
							aShortArray1266[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0)
							aShortArray1267[i_2_] = (short) class572_sub15_0_.readSmart(16777215);
						else
							aShortArray1267[i_2_] = i_8_;
					}
					aByteArray1283[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
					if (i_6_ == 2 || i_6_ == 9) {
						aShortArray1265[i_2_] = (short) (aShortArray1265[i_2_] << 2 & 0x3fff);
						aShortArray1266[i_2_] = (short) (aShortArray1266[i_2_] << 2 & 0x3fff);
						aShortArray1267[i_2_] = (short) (aShortArray1267[i_2_] << 2 & 0x3fff);
					}
					aShortArray1268[i_2_] = (short) -1;
					if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
						if (i_3_ > i_4_) {
							aShortArray1268[i_2_] = (short) i_3_;
							i_4_ = i_3_;
						}
					} else if (i_6_ == 5)
						((Class99) this).aBool1278 = true;
					else if (i_6_ == 7)
						((Class99) this).aBool1279 = true;
					else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
						((Class99) this).aBool1280 = true;
					i_2_++;
				}
			}
			if (class572_sub15_0_.o * -1585139053 != is.length)
				throw new RuntimeException();
			((Class99) this).anInt1271 = i_2_;
			((Class99) this).aShortArray1272 = new short[i_2_];
			((Class99) this).aShortArray1273 = new short[i_2_];
			((Class99) this).aShortArray1281 = new short[i_2_];
			((Class99) this).aShortArray1277 = new short[i_2_];
			((Class99) this).aShortArray1274 = new short[i_2_];
			((Class99) this).aByteArray1276 = new byte[i_2_];
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
				((Class99) this).aShortArray1272[i_9_] = aShortArray1270[i_9_];
				((Class99) this).aShortArray1273[i_9_] = aShortArray1265[i_9_];
				((Class99) this).aShortArray1281[i_9_] = aShortArray1266[i_9_];
				((Class99) this).aShortArray1277[i_9_] = aShortArray1267[i_9_];
				((Class99) this).aShortArray1274[i_9_] = aShortArray1268[i_9_];
				((Class99) this).aByteArray1276[i_9_] = aByteArray1283[i_9_];
			}
		} catch (Exception exception) {
			((Class99) this).anInt1271 = 0;
			((Class99) this).aBool1278 = false;
			((Class99) this).aBool1279 = false;
		}
	}
}
