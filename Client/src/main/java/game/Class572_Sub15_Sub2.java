package game;

/* Class572_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub15_Sub2 extends RSByteBuffer {
	Class650 aClass650_11439;
	static int[] anIntArray11440 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215,
		33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	int anInt11441;

	public void method10388(Class650 class650, byte i) {
		((Class572_Sub15_Sub2) this).aClass650_11439 = class650;
	}

	public void method10389(int i, int i_0_) {
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i + ((Class572_Sub15_Sub2) this).aClass650_11439.method7679((byte) 7));
	}

	public int method10390(byte i) {
		return ((b[(o += 310393755) * -1585139053 - 1] - ((Class572_Sub15_Sub2) this).aClass650_11439.method7679((byte) 7)) & 0xff);
	}

	public boolean method10391(int i) {
		int i_1_ = ((b[-1585139053 * o] - ((Class572_Sub15_Sub2) this).aClass650_11439.method7692(741711185)) & 0xff);
		if (i_1_ < 128)
			return false;
		return true;
	}

	public int method10392(short i) {
		int i_2_ = ((b[(o += 310393755) * -1585139053 - 1] - ((Class572_Sub15_Sub2) this).aClass650_11439.method7679((byte) 7)) & 0xff);
		if (i_2_ < 128)
			return i_2_;
		return ((i_2_ - 128 << 8) + ((b[(o += 310393755) * -1585139053 - 1] - ((Class572_Sub15_Sub2) this).aClass650_11439.method7679((byte) 7)) & 0xff));
	}

	public void method10393(byte[] is, int i, int i_3_, int i_4_) {
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
			is[i + i_5_] = (byte) ((b[(o += 310393755) * -1585139053 - 1]) - ((Class572_Sub15_Sub2) this).aClass650_11439.method7679((byte) 7));
	}

	public int readBits(int i, int i_6_) {
		int i_7_ = ((Class572_Sub15_Sub2) this).anInt11441 * 1645434219 >> 3;
		int i_8_ = 8 - (1645434219 * ((Class572_Sub15_Sub2) this).anInt11441 & 0x7);
		int i_9_ = 0;
		((Class572_Sub15_Sub2) this).anInt11441 += i * -2025443517;
		for (/**/; i > i_8_; i_8_ = 8) {
			i_9_ += ((b[i_7_++] & anIntArray11440[i_8_]) << i - i_8_);
			i -= i_8_;
		}
		if (i_8_ == i)
			i_9_ += b[i_7_] & anIntArray11440[i_8_];
		else
			i_9_ += b[i_7_] >> i_8_ - i & anIntArray11440[i];
		return i_9_;
	}

	public void method10395(int i) {
		o = (310393755 * ((7 + 1645434219 * ((Class572_Sub15_Sub2) this).anInt11441) / 8));
	}

	public int method10396(int i, int i_10_) {
		return 8 * i - ((Class572_Sub15_Sub2) this).anInt11441 * 1645434219;
	}

	public Class572_Sub15_Sub2(int i) {
		super(i);
	}

	public void method10397(int i) {
		((Class572_Sub15_Sub2) this).anInt11441 = o * -575812664;
	}
}
