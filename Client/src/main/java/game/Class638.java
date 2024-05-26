package game;

/* Class638 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class638 {
	int anInt8267;
	public static final int anInt8268 = 64;
	static final int anInt8269 = 10;
	static final String aString8270 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static long[][] aLongArrayArray8271 = new long[8][256];
	static long[] aLongArray8272 = new long[11];
	byte[] aByteArray8273 = new byte[32];
	byte[] aByteArray8274 = new byte[64];
	int anInt8275 = 0;
	long[] aLongArray8276;
	static final int anInt8277 = 512;
	long[] aLongArray8278;
	long[] aLongArray8279;
	long[] aLongArray8280;
	long[] aLongArray8281;

	void method7562(byte i) {
		int i_0_ = 0;
		int i_1_ = 0;
		while (i_0_ < 8) {
			((Class638) this).aLongArray8280[i_0_] = ((long) ((Class638) this).aByteArray8274[i_1_] << 56 ^ ((long) ((Class638) this).aByteArray8274[i_1_ + 1] & 0xffL) << 48 ^ ((long) ((Class638) this).aByteArray8274[i_1_ + 2] & 0xffL) << 40 ^ ((long) ((Class638) this).aByteArray8274[3 + i_1_] & 0xffL) << 32 ^ ((long) ((Class638) this).aByteArray8274[4 + i_1_] & 0xffL) << 24 ^ ((long) ((Class638) this).aByteArray8274[i_1_ + 5] & 0xffL) << 16 ^ ((long) ((Class638) this).aByteArray8274[6 + i_1_] & 0xffL) << 8 ^ ((long) ((Class638) this).aByteArray8274[i_1_ + 7] & 0xffL));
			i_0_++;
			i_1_ += 8;
		}
		for (i_0_ = 0; i_0_ < 8; i_0_++)
			((Class638) this).aLongArray8278[i_0_] = (((Class638) this).aLongArray8280[i_0_] ^ (((Class638) this).aLongArray8279[i_0_] = ((Class638) this).aLongArray8281[i_0_]));
		for (i_0_ = 1; i_0_ <= 10; i_0_++) {
			for (i_1_ = 0; i_1_ < 8; i_1_++) {
				((Class638) this).aLongArray8276[i_1_] = 0L;
				int i_2_ = 0;
				int i_3_ = 56;
				while (i_2_ < 8) {
					((Class638) this).aLongArray8276[i_1_] ^= (aLongArrayArray8271[i_2_][(int) ((((Class638) this).aLongArray8279[i_1_ - i_2_ & 0x7]) >>> i_3_) & 0xff]);
					i_2_++;
					i_3_ -= 8;
				}
			}
			for (i_1_ = 0; i_1_ < 8; i_1_++)
				((Class638) this).aLongArray8279[i_1_] = ((Class638) this).aLongArray8276[i_1_];
			((Class638) this).aLongArray8279[0] ^= aLongArray8272[i_0_];
			for (i_1_ = 0; i_1_ < 8; i_1_++) {
				((Class638) this).aLongArray8276[i_1_] = ((Class638) this).aLongArray8279[i_1_];
				int i_4_ = 0;
				int i_5_ = 56;
				while (i_4_ < 8) {
					((Class638) this).aLongArray8276[i_1_] ^= (aLongArrayArray8271[i_4_][(int) ((((Class638) this).aLongArray8278[i_1_ - i_4_ & 0x7]) >>> i_5_) & 0xff]);
					i_4_++;
					i_5_ -= 8;
				}
			}
			for (i_1_ = 0; i_1_ < 8; i_1_++)
				((Class638) this).aLongArray8278[i_1_] = ((Class638) this).aLongArray8276[i_1_];
		}
		for (i_0_ = 0; i_0_ < 8; i_0_++)
			((Class638) this).aLongArray8281[i_0_] ^= (((Class638) this).aLongArray8278[i_0_] ^ ((Class638) this).aLongArray8280[i_0_]);
	}

	void method7563(byte i) {
		for (int i_6_ = 0; i_6_ < 32; i_6_++)
			((Class638) this).aByteArray8273[i_6_] = (byte) 0;
		((Class638) this).anInt8267 = 0;
		((Class638) this).anInt8275 = 0;
		((Class638) this).aByteArray8274[0] = (byte) 0;
		for (int i_7_ = 0; i_7_ < 8; i_7_++)
			((Class638) this).aLongArray8281[i_7_] = 0L;
	}

	void method7564(byte[] is, long l) {
		int i = 0;
		int i_8_ = 8 - ((int) l & 0x7) & 0x7;
		int i_9_ = ((Class638) this).anInt8275 * 975362999 & 0x7;
		long l_10_ = l;
		int i_11_ = 31;
		int i_12_ = 0;
		for (/**/; i_11_ >= 0; i_11_--) {
			i_12_ += (((int) l_10_ & 0xff) + (((Class638) this).aByteArray8273[i_11_] & 0xff));
			((Class638) this).aByteArray8273[i_11_] = (byte) i_12_;
			i_12_ >>>= 8;
			l_10_ >>>= 8;
		}
		while (l > 8L) {
			int i_13_ = is[i] << i_8_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_8_;
			if (i_13_ < 0 || i_13_ >= 256)
				throw new RuntimeException();
			((Class638) this).aByteArray8274[(679848937 * ((Class638) this).anInt8267)] |= i_13_ >>> i_9_;
			((Class638) this).anInt8267 += -611066791;
			((Class638) this).anInt8275 += 1466954247 * (8 - i_9_);
			if (512 == ((Class638) this).anInt8275 * 975362999) {
				method7562((byte) 71);
				((Class638) this).anInt8267 = 0;
				((Class638) this).anInt8275 = 0;
			}
			((Class638) this).aByteArray8274[(679848937 * ((Class638) this).anInt8267)] = (byte) (i_13_ << 8 - i_9_ & 0xff);
			((Class638) this).anInt8275 += 1466954247 * i_9_;
			l -= 8L;
			i++;
		}
		int i_14_;
		if (l > 0L) {
			i_14_ = is[i] << i_8_ & 0xff;
			((Class638) this).aByteArray8274[(((Class638) this).anInt8267 * 679848937)] |= i_14_ >>> i_9_;
		} else
			i_14_ = 0;
		if (l + (long) i_9_ < 8L)
			((Class638) this).anInt8275 += l * 1466954247L;
		else {
			((Class638) this).anInt8267 += -611066791;
			((Class638) this).anInt8275 += 1466954247 * (8 - i_9_);
			l -= (long) (8 - i_9_);
			if (512 == 975362999 * ((Class638) this).anInt8275) {
				method7562((byte) 90);
				((Class638) this).anInt8267 = 0;
				((Class638) this).anInt8275 = 0;
			}
			((Class638) this).aByteArray8274[(679848937 * ((Class638) this).anInt8267)] = (byte) (i_14_ << 8 - i_9_ & 0xff);
			((Class638) this).anInt8275 += 1466954247 * (int) l;
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_15_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = ((i & 0x1) == 0 ? (long) (i_15_ >>> 8) : (long) (i_15_ & 0xff));
			long l_16_ = l << 1;
			if (l_16_ >= 256L)
				l_16_ ^= 0x11dL;
			long l_17_ = l_16_ << 1;
			if (l_17_ >= 256L)
				l_17_ ^= 0x11dL;
			long l_18_ = l_17_ ^ l;
			long l_19_ = l_17_ << 1;
			if (l_19_ >= 256L)
				l_19_ ^= 0x11dL;
			long l_20_ = l_19_ ^ l;
			aLongArrayArray8271[0][i] = (l << 56 | l << 48 | l_17_ << 40 | l << 32 | l_19_ << 24 | l_18_ << 16 | l_16_ << 8 | l_20_);
			for (int i_21_ = 1; i_21_ < 8; i_21_++)
				aLongArrayArray8271[i_21_][i] = (aLongArrayArray8271[i_21_ - 1][i] >>> 8 | aLongArrayArray8271[i_21_ - 1][i] << 56);
		}
		aLongArray8272[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_22_ = (i - 1) * 8;
			aLongArray8272[i] = (aLongArrayArray8271[0][i_22_] & ~0xffffffffffffffL ^ aLongArrayArray8271[1][1 + i_22_] & 0xff000000000000L ^ aLongArrayArray8271[2][2 + i_22_] & 0xff0000000000L ^ aLongArrayArray8271[3][3 + i_22_] & 0xff00000000L ^ aLongArrayArray8271[4][4 + i_22_] & 0xff000000L ^ aLongArrayArray8271[5][5 + i_22_] & 0xff0000L ^ aLongArrayArray8271[6][i_22_ + 6] & 0xff00L ^ aLongArrayArray8271[7][i_22_ + 7] & 0xffL);
		}
	}

	Class638() {
		((Class638) this).anInt8267 = 0;
		((Class638) this).aLongArray8281 = new long[8];
		((Class638) this).aLongArray8279 = new long[8];
		((Class638) this).aLongArray8276 = new long[8];
		((Class638) this).aLongArray8280 = new long[8];
		((Class638) this).aLongArray8278 = new long[8];
	}

	void method7565() {
		int i = 0;
		int i_23_ = 0;
		while (i < 8) {
			((Class638) this).aLongArray8280[i] = ((long) ((Class638) this).aByteArray8274[i_23_] << 56 ^ ((long) ((Class638) this).aByteArray8274[i_23_ + 1] & 0xffL) << 48 ^ ((long) ((Class638) this).aByteArray8274[i_23_ + 2] & 0xffL) << 40 ^ ((long) ((Class638) this).aByteArray8274[3 + i_23_] & 0xffL) << 32 ^ ((long) ((Class638) this).aByteArray8274[4 + i_23_] & 0xffL) << 24 ^ ((long) ((Class638) this).aByteArray8274[i_23_ + 5] & 0xffL) << 16 ^ ((long) ((Class638) this).aByteArray8274[6 + i_23_] & 0xffL) << 8 ^ ((long) ((Class638) this).aByteArray8274[i_23_ + 7] & 0xffL));
			i++;
			i_23_ += 8;
		}
		for (i = 0; i < 8; i++)
			((Class638) this).aLongArray8278[i] = (((Class638) this).aLongArray8280[i] ^ (((Class638) this).aLongArray8279[i] = ((Class638) this).aLongArray8281[i]));
		for (i = 1; i <= 10; i++) {
			for (i_23_ = 0; i_23_ < 8; i_23_++) {
				((Class638) this).aLongArray8276[i_23_] = 0L;
				int i_24_ = 0;
				int i_25_ = 56;
				while (i_24_ < 8) {
					((Class638) this).aLongArray8276[i_23_] ^= (aLongArrayArray8271[i_24_][(int) ((((Class638) this).aLongArray8279[i_23_ - i_24_ & 0x7]) >>> i_25_) & 0xff]);
					i_24_++;
					i_25_ -= 8;
				}
			}
			for (i_23_ = 0; i_23_ < 8; i_23_++)
				((Class638) this).aLongArray8279[i_23_] = ((Class638) this).aLongArray8276[i_23_];
			((Class638) this).aLongArray8279[0] ^= aLongArray8272[i];
			for (i_23_ = 0; i_23_ < 8; i_23_++) {
				((Class638) this).aLongArray8276[i_23_] = ((Class638) this).aLongArray8279[i_23_];
				int i_26_ = 0;
				int i_27_ = 56;
				while (i_26_ < 8) {
					((Class638) this).aLongArray8276[i_23_] ^= (aLongArrayArray8271[i_26_][(int) ((((Class638) this).aLongArray8278[i_23_ - i_26_ & 0x7]) >>> i_27_) & 0xff]);
					i_26_++;
					i_27_ -= 8;
				}
			}
			for (i_23_ = 0; i_23_ < 8; i_23_++)
				((Class638) this).aLongArray8278[i_23_] = ((Class638) this).aLongArray8276[i_23_];
		}
		for (i = 0; i < 8; i++)
			((Class638) this).aLongArray8281[i] ^= (((Class638) this).aLongArray8278[i] ^ ((Class638) this).aLongArray8280[i]);
	}

	void method7566(byte[] is, int i, int i_28_) {
		((Class638) this).aByteArray8274[(((Class638) this).anInt8267 * 679848937)] |= 128 >>> (975362999 * ((Class638) this).anInt8275 & 0x7);
		((Class638) this).anInt8267 += -611066791;
		if (((Class638) this).anInt8267 * 679848937 > 32) {
			while (679848937 * ((Class638) this).anInt8267 < 64)
				((Class638) this).aByteArray8274[((((Class638) this).anInt8267 += -611066791) * 679848937 - 1)] = (byte) 0;
			method7562((byte) 120);
			((Class638) this).anInt8267 = 0;
		}
		while (((Class638) this).anInt8267 * 679848937 < 32)
			((Class638) this).aByteArray8274[(((Class638) this).anInt8267 += -611066791) * 679848937 - 1] = (byte) 0;
		System.arraycopy(((Class638) this).aByteArray8273, 0, ((Class638) this).aByteArray8274, 32, 32);
		method7562((byte) 23);
		int i_29_ = 0;
		int i_30_ = i;
		while (i_29_ < 8) {
			long l = ((Class638) this).aLongArray8281[i_29_];
			is[i_30_] = (byte) (int) (l >>> 56);
			is[i_30_ + 1] = (byte) (int) (l >>> 48);
			is[i_30_ + 2] = (byte) (int) (l >>> 40);
			is[i_30_ + 3] = (byte) (int) (l >>> 32);
			is[i_30_ + 4] = (byte) (int) (l >>> 24);
			is[i_30_ + 5] = (byte) (int) (l >>> 16);
			is[6 + i_30_] = (byte) (int) (l >>> 8);
			is[i_30_ + 7] = (byte) (int) l;
			i_29_++;
			i_30_ += 8;
		}
	}

	static final void method7567(Cs2Executor class441, int i) {
		int i_31_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_31_, (short) 20100);
		Class83 class83 = Class534.aClass83Array5975[i_31_ >> 16];
		Class622.method7441(class73, class83, class441, 2095413699);
	}
}
