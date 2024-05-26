package game;

/* Class572_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class RSByteBuffer extends Class572 {
	public static final int anInt9115 = 100;
	public static final int anInt9116 = 5000;
	public byte[] b;
	public int o;
	static int[] anIntArray9119 = new int[256];
	static final int anInt9120 = -306674912;
	public static long[] aLongArray9121;
	static final long aLong9122 = -3932672073523589310L;

	public float method8448(byte i) {
		return Float.intBitsToFloat(readInt(982095154));
	}

	public RSByteBuffer(int i, boolean bool) {
		b = Class448.method5350(i, bool, -99732022);
	}

	public void method8449(byte i) {
		if (b != null)
			Class448.method5355(b, (byte) 57);
		b = null;
	}

	public void writeByte(int i, int i_0_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public void writeShort(int i, int i_1_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public void write24BitInteger(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public void method8453(int i, int i_2_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void writeInt(int i, int i_3_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public void method8455(int i, int i_4_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
	}

	public void method8456(long l) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 32);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) l;
	}

	public void method8457(long l) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 40);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 32);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) l;
	}

	public void method8458(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
	}

	public void writeString(String string, byte i) {
		int i_5_ = string.indexOf('\0');
		if (i_5_ >= 0)
			throw new IllegalArgumentException("");
		o += (Class590.method6998(string, 0, string.length(), b, -1585139053 * o, (byte) 73) * 310393755);
		b[(o += 310393755) * -1585139053 - 1] = (byte) 0;
	}

	public void method8460(String string, byte i) {
		int i_6_ = string.indexOf('\0');
		if (i_6_ >= 0)
			throw new IllegalArgumentException("");
		b[(o += 310393755) * -1585139053 - 1] = (byte) 0;
		o += (Class590.method6998(string, 0, string.length(), b, o * -1585139053, (byte) 65) * 310393755);
		b[(o += 310393755) * -1585139053 - 1] = (byte) 0;
	}

	public void writeByte128(int i, int i_7_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
	}

	public void writeBytes(byte[] is, int i, int i_8_, byte i_9_) {
		for (int i_10_ = i; i_10_ < i_8_ + i; i_10_++)
			b[(o += 310393755) * -1585139053 - 1] = is[i_10_];
	}

	public void method8463(RSByteBuffer class572_sub15_11_, byte i) {
		writeBytes(class572_sub15_11_.b, 0, -1585139053 * class572_sub15_11_.o, (byte) -12);
	}

	public void method8464(int i, int i_12_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		b[-1585139053 * o - i - 2] = (byte) (i >> 8);
		b[-1585139053 * o - i - 1] = (byte) i;
	}

	public int readIntV2(int i) {
		o += 1241575020;
		return (((b[-1585139053 * o - 1] & 0xff) << 8) + (((b[o * -1585139053 - 3] & 0xff) << 24) + ((b[-1585139053 * o - 4] & 0xff) << 16)) + (b[o * -1585139053 - 2] & 0xff));
	}

	int method8466(byte i) {
		int i_13_ = b[(o += 310393755) * -1585139053 - 1];
		int i_14_ = 0;
		for (/**/; i_13_ < 0; i_13_ = b[(o += 310393755) * -1585139053 - 1])
			i_14_ = (i_14_ | i_13_ & 0x7f) << 7;
		return i_14_ | i_13_;
	}

	public int readUnsignedByte(int i) {
		return (b[(o += 310393755) * -1585139053 - 1] & 0xff);
	}

	public byte readByte(int i) {
		return b[(o += 310393755) * -1585139053 - 1];
	}

	public int readUnsignedShort(int i) {
		o += 620787510;
		return ((b[o * -1585139053 - 1] & 0xff) + ((b[-1585139053 * o - 2] & 0xff) << 8));
	}

	public int readShort(int i) {
		o += 620787510;
		int i_15_ = (((b[o * -1585139053 - 2] & 0xff) << 8) + (b[o * -1585139053 - 1] & 0xff));
		if (i_15_ > 32767)
			i_15_ -= 65536;
		return i_15_;
	}

	public int read24BitInt(int i) {
		o += 931181265;
		return ((b[-1585139053 * o - 1] & 0xff) + (((b[-1585139053 * o - 2] & 0xff) << 8) + ((b[o * -1585139053 - 3] & 0xff) << 16)));
	}

	public RSByteBuffer(int i) {
		b = Class448.method5351(i, 622291734);
		o = 0;
	}

	public int readInt(int i) {
		o += 1241575020;
		return ((b[-1585139053 * o - 1] & 0xff) + (((b[o * -1585139053 - 2] & 0xff) << 8) + (((b[-1585139053 * o - 4] & 0xff) << 24) + ((b[o * -1585139053 - 3] & 0xff) << 16))));
	}

	public void method8473(long l, int i, byte i_16_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_17_ = i * 8; i_17_ >= 0; i_17_ -= 8)
			b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> i_17_);
	}

	public long method8474(int i) {
		long l = (long) readUnsignedByte(210055123) & 0xffffffffL;
		long l_18_ = (long) readInt(-481199323) & 0xffffffffL;
		return l_18_ + (l << 32);
	}

	public long method8475(int i) {
		long l = (long) readUnsignedShort(647518597) & 0xffffffffL;
		long l_19_ = (long) readInt(2047344697) & 0xffffffffL;
		return l_19_ + (l << 32);
	}

	public long method8476(byte i) {
		long l = (long) readInt(547026563) & 0xffffffffL;
		long l_20_ = (long) readInt(1766364429) & 0xffffffffL;
		return l_20_ + (l << 32);
	}

	public long method8477(int i, int i_21_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_22_ = 8 * i;
		long l = 0L;
		for (/**/; i_22_ >= 0; i_22_ -= 8)
			l |= ((long) (b[(o += 310393755) * -1585139053 - 1]) & 0xffL) << i_22_;
		return l;
	}

	public void method8478(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public String readVersionedString(int i) {
		byte i_23_ = b[(o += 310393755) * -1585139053 - 1];
		if (0 != i_23_)
			throw new IllegalStateException("");
		int i_24_ = -1585139053 * o;
		while (b[(o += 310393755) * -1585139053 - 1] != 0) {
			/* empty */
		}
		int i_25_ = -1585139053 * o - i_24_ - 1;
		if (i_25_ == 0)
			return "";
		return Class658.method7757(b, i_24_, i_25_, 1200545473);
	}

	public String method8480(int i) {
		byte i_26_ = b[(o += 310393755) * -1585139053 - 1];
		if (i_26_ != 0)
			throw new IllegalStateException("");
		int i_27_ = method8466((byte) 15);
		if (o * -1585139053 + i_27_ > b.length)
			throw new IllegalStateException("");
		String string = Class642.method7609(b, o * -1585139053, i_27_, -946819585);
		o += i_27_ * 310393755;
		return string;
	}

	public void method8481(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		b[-1585139053 * o - i - 1] = (byte) i;
	}

	public int readSmart(int i) {
		int i_28_ = b[-1585139053 * o] & 0xff;
		if (i_28_ < 128)
			return readUnsignedByte(1907064531) - 64;
		return readUnsignedShort(647518597) - 49152;
	}

	public int readUnsignedSmart(int i) {
		int i_29_ = b[o * -1585139053] & 0xff;
		if (i_29_ < 128)
			return readUnsignedByte(1333259702);
		return readUnsignedShort(647518597) - 32768;
	}

	public int readSmart(byte i) {
		int i_30_ = b[-1585139053 * o] & 0xff;
		if (i_30_ < 128)
			return readUnsignedByte(1315656579) - 1;
		return readUnsignedShort(647518597) - 32769;
	}

	public int readSmart2(int i) {
		int i_31_ = 0;
		int i_32_;
		for (i_32_ = readUnsignedSmart(1460544454); i_32_ == 32767; i_32_ = readUnsignedSmart(1113082640))
			i_31_ += 32767;
		i_31_ += i_32_;
		return i_31_;
	}

	public int method8486(byte i) {
		if (b[-1585139053 * o] < 0)
			return readInt(-133374340) & 0x7fffffff;
		return readUnsignedShort(647518597);
	}

	public int readBigSmart(byte i) {
		if (b[-1585139053 * o] < 0)
			return readInt(267791779) & 0x7fffffff;
		int i_33_ = readUnsignedShort(647518597);
		if (32767 == i_33_)
			return -1;
		return i_33_;
	}

	public void method8488(int[] is, int i) {
		int i_34_ = -1585139053 * o / 8;
		o = 0;
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			int i_36_ = readInt(-736022810);
			int i_37_ = readInt(786797545);
			int i_38_ = 0;
			int i_39_ = -1640531527;
			int i_40_ = 32;
			while (i_40_-- > 0) {
				i_36_ += (i_37_ + (i_37_ << 4 ^ i_37_ >>> 5) ^ is[i_38_ & 0x3] + i_38_);
				i_38_ += i_39_;
				i_37_ += ((i_36_ << 4 ^ i_36_ >>> 5) + i_36_ ^ is[i_38_ >>> 11 & 0x3] + i_38_);
			}
			o -= -1811817256;
			writeInt(i_36_, -1743753997);
			writeInt(i_37_, -1743753997);
		}
	}

	public void method8489(int[] is, int i, int i_41_, int i_42_) {
		int i_43_ = -1585139053 * o;
		o = i * 310393755;
		int i_44_ = (i_41_ - i) / 8;
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			int i_46_ = readInt(962156157);
			int i_47_ = readInt(-402332418);
			int i_48_ = 0;
			int i_49_ = -1640531527;
			int i_50_ = 32;
			while (i_50_-- > 0) {
				i_46_ += (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ i_48_ + is[i_48_ & 0x3]);
				i_48_ += i_49_;
				i_47_ += (i_46_ + (i_46_ << 4 ^ i_46_ >>> 5) ^ i_48_ + is[i_48_ >>> 11 & 0x3]);
			}
			o -= -1811817256;
			writeInt(i_46_, -1743753997);
			writeInt(i_47_, -1743753997);
		}
		o = i_43_ * 310393755;
	}

	public void method8490(int[] is, int i, int i_51_, int i_52_) {
		int i_53_ = -1585139053 * o;
		o = i * 310393755;
		int i_54_ = (i_51_ - i) / 8;
		for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
			int i_56_ = readInt(-59514712);
			int i_57_ = readInt(2073150244);
			int i_58_ = -957401312;
			int i_59_ = -1640531527;
			int i_60_ = 32;
			while (i_60_-- > 0) {
				i_57_ -= (i_56_ + (i_56_ << 4 ^ i_56_ >>> 5) ^ i_58_ + is[i_58_ >>> 11 & 0x3]);
				i_58_ -= i_59_;
				i_56_ -= ((i_57_ << 4 ^ i_57_ >>> 5) + i_57_ ^ is[i_58_ & 0x3] + i_58_);
			}
			o -= -1811817256;
			writeInt(i_56_, -1743753997);
			writeInt(i_57_, -1743753997);
		}
		o = i_53_ * 310393755;
	}

	public int method8491(int i) {
		o += 931181265;
		int i_61_ = (((b[o * -1585139053 - 2] & 0xff) << 8) + ((b[-1585139053 * o - 3] & 0xff) << 16) + (b[o * -1585139053 - 1] & 0xff));
		if (i_61_ > 8388607)
			i_61_ -= 16777216;
		return i_61_;
	}

	public int method8492() {
		int i = b[o * -1585139053] & 0xff;
		if (i < 128)
			return readUnsignedByte(-62097613);
		return readUnsignedShort(647518597) - 32768;
	}

	public void writeByteC(int i, byte i_62_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void write128Byte(int i, byte i_63_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (128 - i);
	}

	public int readUnsignedByte128(int i) {
		return ((b[(o += 310393755) * -1585139053 - 1] - 128) & 0xff);
	}

	public int readUnsigned128Byte(byte i) {
		return ((128 - b[(o += 310393755) * -1585139053 - 1]) & 0xff);
	}

	public byte readByte128(byte i) {
		return (byte) ((b[(o += 310393755) * -1585139053 - 1]) - 128);
	}

	public byte readByteC(int i) {
		return (byte) (0 - (b[(o += 310393755) * -1585139053 - 1]));
	}

	public byte read128Byte(int i) {
		return (byte) (128 - (b[(o += 310393755) * -1585139053 - 1]));
	}

	public void writeShortLE(int i, int i_64_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8501(int i, int i_65_) {
		if (i >= 0 && i < 128)
			writeByte(i, -1384395473);
		else if (i >= 0 && i < 32768)
			writeShort(32768 + i, -811965306);
		else
			throw new IllegalArgumentException();
	}

	public int readUnsignedShort128(byte i) {
		o += 620787510;
		return (((b[o * -1585139053 - 2] & 0xff) << 8) + (b[o * -1585139053 - 1] - 128 & 0xff));
	}

	public int readUnsignedShortLE128(byte i) {
		o += 620787510;
		return ((b[o * -1585139053 - 2] - 128 & 0xff) + ((b[o * -1585139053 - 1] & 0xff) << 8));
	}

	public int readShort128(int i) {
		o += 620787510;
		int i_66_ = (((b[-1585139053 * o - 2] & 0xff) << 8) + (b[-1585139053 * o - 1] - 128 & 0xff));
		if (i_66_ > 32767)
			i_66_ -= 65536;
		return i_66_;
	}

	public void method8505(int i, int i_67_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public int read24BitIntegerV3(int i) {
		o += 931181265;
		return ((b[o * -1585139053 - 3] & 0xff) + (((b[o * -1585139053 - 2] & 0xff) << 8) + ((b[-1585139053 * o - 1] & 0xff) << 16)));
	}

	public void writeIntLE(int i, byte i_68_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
	}

	public void writeIntV1(int i, int i_69_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
	}

	public void writeIntV2(int i, byte i_70_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public int readIntV1(byte i) {
		o += 1241575020;
		return (((b[-1585139053 * o - 4] & 0xff) << 8) + (((b[o * -1585139053 - 1] & 0xff) << 16) + ((b[-1585139053 * o - 2] & 0xff) << 24)) + (b[o * -1585139053 - 3] & 0xff));
	}

	public void readBytesA(byte[] is, int i, int i_71_, int i_72_) {
		for (int i_73_ = i; i_73_ < i_71_ + i; i_73_++)
			is[i_73_] = (byte) ((b[(o += 310393755) * -1585139053 - 1]) - 128);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_74_ = i;
			for (int i_75_ = 0; i_75_ < 8; i_75_++) {
				if ((i_74_ & 0x1) == 1)
					i_74_ = i_74_ >>> 1 ^ ~0x12477cdf;
				else
					i_74_ >>>= 1;
			}
			anIntArray9119[i] = i_74_;
		}
		aLongArray9121 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_76_ = 0; i_76_ < 8; i_76_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray9121[i] = l;
		}
	}

	public int method8512(byte i) {
		o += 1241575020;
		return ((b[o * -1585139053 - 4] & 0xff) + (((b[o * -1585139053 - 2] & 0xff) << 16) + ((b[-1585139053 * o - 1] & 0xff) << 24) + ((b[o * -1585139053 - 3] & 0xff) << 8)));
	}

	public void method8513(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8514(long l) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 56);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 48);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 40);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 32);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) (l >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (int) l;
	}

	public RSByteBuffer(byte[] is) {
		b = is;
		o = 0;
	}

	public int readIntLE(int i) {
		o += 1241575020;
		return (((b[-1585139053 * o - 3] & 0xff) << 8) + (((b[-1585139053 * o - 1] & 0xff) << 24) + ((b[-1585139053 * o - 2] & 0xff) << 16)) + (b[-1585139053 * o - 4] & 0xff));
	}

	public int method8516(int i) {
		o += 620787510;
		int i_77_ = ((b[-1585139053 * o - 2] & 0xff) + ((b[-1585139053 * o - 1] & 0xff) << 8));
		if (i_77_ > 32767)
			i_77_ -= 65536;
		return i_77_;
	}

	void method8517(int i, byte i_78_) {
		if (0 != (i & ~0x7f)) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, -1384395473);
					writeByte(i >>> 21 | 0x80, -1384395473);
				}
				writeByte(i >>> 14 | 0x80, -1384395473);
			}
			writeByte(i >>> 7 | 0x80, -1384395473);
		}
		writeByte(i & 0x7f, -1384395473);
	}

	public void readBytes(byte[] is, int i, int i_79_, int i_80_) {
		for (int i_81_ = i; i_81_ < i_79_ + i; i_81_++)
			is[i_81_] = b[(o += 310393755) * -1585139053 - 1];
	}

	public String readString(int i) {
		int i_82_ = o * -1585139053;
		while (b[(o += 310393755) * -1585139053 - 1] != 0) {
			/* empty */
		}
		int i_83_ = -1585139053 * o - i_82_ - 1;
		if (i_83_ == 0)
			return "";
		return Class658.method7757(b, i_82_, i_83_, 863390208);
	}

	public void method8520(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		b[-1585139053 * o - i - 1] = (byte) i;
	}

	public int method8521(int i, int i_84_) {
		int i_85_ = Class543.method6446(b, i, o * -1585139053, (byte) -118);
		writeInt(i_85_, -1743753997);
		return i_85_;
	}

	public void method8522(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		b[-1585139053 * o - i - 1] = (byte) i;
	}

	void method8523(int i) {
		if (0 != (i & ~0x7f)) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, -1384395473);
					writeByte(i >>> 21 | 0x80, -1384395473);
				}
				writeByte(i >>> 14 | 0x80, -1384395473);
			}
			writeByte(i >>> 7 | 0x80, -1384395473);
		}
		writeByte(i & 0x7f, -1384395473);
	}

	public int method8524() {
		o += 620787510;
		return ((b[o * -1585139053 - 1] & 0xff) + ((b[-1585139053 * o - 2] & 0xff) << 8));
	}

	public int method8525() {
		o += 620787510;
		return ((b[o * -1585139053 - 1] & 0xff) + ((b[-1585139053 * o - 2] & 0xff) << 8));
	}

	public int method8526() {
		int i = b[-1585139053 * o] & 0xff;
		if (i < 128)
			return readUnsignedByte(952527769) - 64;
		return readUnsignedShort(647518597) - 49152;
	}

	public void writeShort128(int i, int i_86_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
	}

	public void method8528(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public void method8529(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
	}

	public void method8530(int[] is, int i) {
		int i_87_ = o * -1585139053 / 8;
		o = 0;
		for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
			int i_89_ = readInt(73956227);
			int i_90_ = readInt(-41216566);
			int i_91_ = -957401312;
			int i_92_ = -1640531527;
			int i_93_ = 32;
			while (i_93_-- > 0) {
				i_90_ -= ((i_89_ << 4 ^ i_89_ >>> 5) + i_89_ ^ is[i_91_ >>> 11 & 0x3] + i_91_);
				i_91_ -= i_92_;
				i_89_ -= ((i_90_ << 4 ^ i_90_ >>> 5) + i_90_ ^ is[i_91_ & 0x3] + i_91_);
			}
			o -= -1811817256;
			writeInt(i_89_, -1743753997);
			writeInt(i_90_, -1743753997);
		}
	}

	public void method8531(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void method8532(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public int method8533() {
		if (b[-1585139053 * o] < 0)
			return readInt(-661068829) & 0x7fffffff;
		int i = readUnsignedShort(647518597);
		if (32767 == i)
			return -1;
		return i;
	}

	public void method8534(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8535(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
	}

	public void writeShortLE128(int i, byte i_94_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8537(BigInteger biginteger, BigInteger biginteger_95_, int i) {
		int i_96_ = -1585139053 * o;
		o = 0;
		byte[] is = new byte[i_96_];
		readBytes(is, 0, i_96_, 1484863876);
		BigInteger biginteger_97_ = new BigInteger(is);
		BigInteger biginteger_98_ = biginteger_97_.modPow(biginteger, biginteger_95_);
		byte[] is_99_ = biginteger_98_.toByteArray();
		o = 0;
		writeShort(is_99_.length, -1990921582);
		writeBytes(is_99_, 0, is_99_.length, (byte) -87);
	}

	public void write24BitInteger(int i, int i_100_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}

	public int readUnsignedShortLE(byte i) {
		o += 620787510;
		return (((b[o * -1585139053 - 1] & 0xff) << 8) + (b[-1585139053 * o - 2] & 0xff));
	}

	public void method8540(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void method8541(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void method8542(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void method8543(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public void method8544(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (0 - i);
	}

	public int method8545() {
		return (0 - b[(o += 310393755) * -1585139053 - 1] & 0xff);
	}

	public boolean method8546(byte i) {
		o -= 1241575020;
		int i_101_ = Class543.method6446(b, 0, -1585139053 * o, (byte) -82);
		int i_102_ = readInt(1643712982);
		if (i_101_ == i_102_)
			return true;
		return false;
	}

	public int readUnsignedByteC(int i) {
		return (0 - b[(o += 310393755) * -1585139053 - 1] & 0xff);
	}

	public int method8548(byte i) {
		o += 620787510;
		int i_103_ = ((b[-1585139053 * o - 2] - 128 & 0xff) + ((b[o * -1585139053 - 1] & 0xff) << 8));
		if (i_103_ > 32767)
			i_103_ -= 65536;
		return i_103_;
	}

	public boolean method8549() {
		o -= 1241575020;
		int i = Class543.method6446(b, 0, -1585139053 * o, (byte) -4);
		int i_104_ = readInt(2115438508);
		if (i == i_104_)
			return true;
		return false;
	}

	public void method8550(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
	}

	public void method8551(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + 128);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8552(int i, int i_105_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		b[-1585139053 * o - i - 1] = (byte) i;
	}

	public void method8553(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
	}

	public void method8554(CharSequence charsequence, byte i) {
		int i_106_ = Class514.method6091(charsequence, (byte) 37);
		b[(o += 310393755) * -1585139053 - 1] = (byte) 0;
		method8517(i_106_, (byte) 111);
		o += Class294.method3956(b, o * -1585139053, charsequence, -440257173) * 310393755;
	}

	public void writeBytesReversed(byte[] is, int i, int i_107_, byte i_108_) {
		for (int i_109_ = i + i_107_ - 1; i_109_ >= i; i_109_--)
			is[i_109_] = b[(o += 310393755) * -1585139053 - 1];
	}

	public void method8556(int i) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
	}

	public String method8557(int i) {
		if (b[-1585139053 * o] == 0) {
			o += 310393755;
			return null;
		}
		return readString(1295706626);
	}

	public static void method8558(String string, byte i) {
		Class190.aString2235 = string;
		Class190.anInt2237 = Class190.aString2235.length() * -911481991;
	}
}
