package game;

/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class479 {
	long aLong5348;
	Class675 aClass675_5349 = new Class675();
	long aLong5350;
	int anInt5351;
	int anInt5352;

	Class479() {
		((Class479) this).aLong5348 = 362877080769834161L;
		((Class479) this).aLong5350 = -3701926468772395927L;
		((Class479) this).anInt5351 = -2131434961;
		((Class479) this).anInt5352 = -727557871;
	}

	void method5646(byte i) {
		((Class479) this).aClass675_5349.method7918(-1746498088);
		((Class479) this).aLong5348 = 362877080769834161L;
		((Class479) this).aLong5350 = -3701926468772395927L;
		((Class479) this).anInt5351 = -2131434961;
		((Class479) this).anInt5352 = -727557871;
	}

	void method5647() {
		((Class479) this).aClass675_5349.method7918(1291966961);
		((Class479) this).aLong5348 = 362877080769834161L;
		((Class479) this).aLong5350 = -3701926468772395927L;
		((Class479) this).anInt5351 = -2131434961;
		((Class479) this).anInt5352 = -727557871;
	}

	void method5648(Class572_Sub13 class572_sub13, byte i) {
		((Class479) this).aClass675_5349.method7940(class572_sub13, -2054504439);
	}

	int method5649(Class572_Sub13 class572_sub13, int i, int i_0_) {
		long l;
		if (-1L == ((Class479) this).aLong5348 * 7253727569808450479L)
			l = (long) i;
		else {
			l = (class572_sub13.method8426(-1625076140) - 7253727569808450479L * ((Class479) this).aLong5348);
			if (l > (long) i)
				l = (long) i;
		}
		((Class479) this).aLong5348 = class572_sub13.method8426(-1625076140) * -362877080769834161L;
		return (int) l;
	}

	abstract int method5650(byte i);

	abstract void method5651(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13, byte i);

	abstract void method5652(int i);

	abstract Class572_Sub25 method5653();

	abstract Class572_Sub25 method5654(int i);

	abstract boolean method5655();

	void method5656() {
		((Class479) this).aClass675_5349.method7918(-1470827944);
		((Class479) this).aLong5348 = 362877080769834161L;
		((Class479) this).aLong5350 = -3701926468772395927L;
		((Class479) this).anInt5351 = -2131434961;
		((Class479) this).anInt5352 = -727557871;
	}

	abstract Class572_Sub25 method5657();

	abstract Class572_Sub25 method5658();

	abstract int method5659();

	abstract int method5660();

	abstract void method5661(RSByteBuffer class572_sub15, Class572_Sub13 class572_sub13);

	abstract boolean method5662(byte i);

	abstract boolean method5663();

	void method5664() {
		if (method5662((byte) 36)) {
			Class572_Sub25 class572_sub25 = null;
			int i = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			Iterator iterator = ((Class479) this).aClass675_5349.iterator();
			while (iterator.hasNext()) {
				Class572_Sub13 class572_sub13 = (Class572_Sub13) iterator.next();
				if (null != class572_sub25 && ((class572_sub25.aRsByteBuffer.o * -1585139053) - i >= 252 - (6 + method5650((byte) -27))))
					break;
				class572_sub13.method6794((byte) -41);
				int i_3_ = class572_sub13.method8425(-1749784373);
				if (i_3_ < -1)
					i_3_ = -1;
				else if (i_3_ > 65534)
					i_3_ = 65534;
				int i_4_ = class572_sub13.method8417(1636759235);
				if (i_4_ < -1)
					i_4_ = -1;
				else if (i_4_ > 65534)
					i_4_ = 65534;
				if (((Class479) this).anInt5351 * -1167697103 == i_4_ && ((Class479) this).anInt5352 * 1248872463 == i_3_)
					class572_sub13.method8421(421222932);
				else {
					if (null == class572_sub25) {
						class572_sub25 = method5654(-826944091);
						class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
						i = (class572_sub25.aRsByteBuffer.o * -1585139053);
						class572_sub25.aRsByteBuffer.o += 620787510;
						i_1_ = 0;
						i_2_ = 0;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					if (-1L != (-7613164673240222681L * ((Class479) this).aLong5350)) {
						i_5_ = i_4_ - -1167697103 * ((Class479) this).anInt5351;
						i_6_ = i_3_ - ((Class479) this).anInt5352 * 1248872463;
						i_7_ = (int) ((class572_sub13.method8426(-1625076140) - (((Class479) this).aLong5350 * -7613164673240222681L)) / 20L);
						i_1_ += (class572_sub13.method8426(-1625076140) - (-7613164673240222681L * ((Class479) this).aLong5350)) % 20L;
					} else {
						i_5_ = i_4_;
						i_6_ = i_3_;
						i_7_ = 2147483647;
					}
					((Class479) this).anInt5351 = i_4_ * 2131434961;
					((Class479) this).anInt5352 = i_3_ * 727557871;
					if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
						i_5_ += 32;
						i_6_ += 32;
						class572_sub25.aRsByteBuffer.writeShort((i_5_ << 6) + (i_7_ << 12) + i_6_, -1243294602);
					} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
						i_5_ += 128;
						i_6_ += 128;
						class572_sub25.aRsByteBuffer.writeByte(128 + i_7_, -1384395473);
						class572_sub25.aRsByteBuffer.writeShort(i_6_ + (i_5_ << 8), -1518998651);
					} else if (i_7_ < 32) {
						class572_sub25.aRsByteBuffer.writeByte(192 + i_7_, -1384395473);
						if (i_4_ == -1 || -1 == i_3_)
							class572_sub25.aRsByteBuffer.writeInt(-2147483648, -1743753997);
						else
							class572_sub25.aRsByteBuffer.writeInt(i_4_ | i_3_ << 16, -1743753997);
					} else {
						class572_sub25.aRsByteBuffer.writeShort((i_7_ & 0x1fff) + 57344, -1781594963);
						if (-1 == i_4_ || i_3_ == -1)
							class572_sub25.aRsByteBuffer.writeInt(-2147483648, -1743753997);
						else
							class572_sub25.aRsByteBuffer.writeInt(i_4_ | i_3_ << 16, -1743753997);
					}
					i_2_++;
					method5651(class572_sub25.aRsByteBuffer, class572_sub13, (byte) 0);
					((Class479) this).aLong5350 = (class572_sub13.method8426(-1625076140) * 3701926468772395927L);
					class572_sub13.method8421(421222932);
				}
			}
			if (class572_sub25 != null) {
				class572_sub25.aRsByteBuffer.method8552((class572_sub25.aRsByteBuffer.o * -1585139053) - i, -907214115);
				int i_8_ = (class572_sub25.aRsByteBuffer.o * -1585139053);
				class572_sub25.aRsByteBuffer.o = i * 310393755;
				class572_sub25.aRsByteBuffer.writeByte(i_1_ / i_2_, -1384395473);
				class572_sub25.aRsByteBuffer.writeByte(i_1_ % i_2_, -1384395473);
				class572_sub25.aRsByteBuffer.o = i_8_ * 310393755;
				client.aClass195_8589.method2929(class572_sub25, (byte) -20);
			}
		}
		method5652(-812278045);
	}

	abstract void method5665();

	void method5666(int i) {
		if (method5662((byte) 65)) {
			Class572_Sub25 class572_sub25 = null;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			Iterator iterator = ((Class479) this).aClass675_5349.iterator();
			while (iterator.hasNext()) {
				Class572_Sub13 class572_sub13 = (Class572_Sub13) iterator.next();
				if (null != class572_sub25 && ((class572_sub25.aRsByteBuffer.o * -1585139053) - i_9_ >= 252 - (6 + method5650((byte) 26))))
					break;
				class572_sub13.method6794((byte) 71);
				int i_12_ = class572_sub13.method8425(-1749784373);
				if (i_12_ < -1)
					i_12_ = -1;
				else if (i_12_ > 65534)
					i_12_ = 65534;
				int i_13_ = class572_sub13.method8417(1636759235);
				if (i_13_ < -1)
					i_13_ = -1;
				else if (i_13_ > 65534)
					i_13_ = 65534;
				if (((Class479) this).anInt5351 * -1167697103 == i_13_ && ((Class479) this).anInt5352 * 1248872463 == i_12_)
					class572_sub13.method8421(421222932);
				else {
					if (null == class572_sub25) {
						class572_sub25 = method5654(-826944091);
						class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
						i_9_ = (class572_sub25.aRsByteBuffer.o) * -1585139053;
						class572_sub25.aRsByteBuffer.o += 620787510;
						i_10_ = 0;
						i_11_ = 0;
					}
					int i_14_;
					int i_15_;
					int i_16_;
					if (-1L != (-7613164673240222681L * ((Class479) this).aLong5350)) {
						i_14_ = (i_13_ - -1167697103 * ((Class479) this).anInt5351);
						i_15_ = i_12_ - ((Class479) this).anInt5352 * 1248872463;
						i_16_ = (int) ((class572_sub13.method8426(-1625076140) - (((Class479) this).aLong5350 * -7613164673240222681L)) / 20L);
						i_10_ += (class572_sub13.method8426(-1625076140) - (-7613164673240222681L * ((Class479) this).aLong5350)) % 20L;
					} else {
						i_14_ = i_13_;
						i_15_ = i_12_;
						i_16_ = 2147483647;
					}
					((Class479) this).anInt5351 = i_13_ * 2131434961;
					((Class479) this).anInt5352 = i_12_ * 727557871;
					if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31 && i_15_ >= -32 && i_15_ <= 31) {
						i_14_ += 32;
						i_15_ += 32;
						class572_sub25.aRsByteBuffer.writeShort((i_14_ << 6) + (i_16_ << 12) + i_15_, -1958090054);
					} else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127 && i_15_ >= -128 && i_15_ <= 127) {
						i_14_ += 128;
						i_15_ += 128;
						class572_sub25.aRsByteBuffer.writeByte(128 + i_16_, -1384395473);
						class572_sub25.aRsByteBuffer.writeShort(i_15_ + (i_14_ << 8), -1917795748);
					} else if (i_16_ < 32) {
						class572_sub25.aRsByteBuffer.writeByte(192 + i_16_, -1384395473);
						if (i_13_ == -1 || -1 == i_12_)
							class572_sub25.aRsByteBuffer.writeInt(-2147483648, -1743753997);
						else
							class572_sub25.aRsByteBuffer.writeInt(i_13_ | i_12_ << 16, -1743753997);
					} else {
						class572_sub25.aRsByteBuffer.writeShort((i_16_ & 0x1fff) + 57344, -1435293093);
						if (-1 == i_13_ || i_12_ == -1)
							class572_sub25.aRsByteBuffer.writeInt(-2147483648, -1743753997);
						else
							class572_sub25.aRsByteBuffer.writeInt(i_13_ | i_12_ << 16, -1743753997);
					}
					i_11_++;
					method5651(class572_sub25.aRsByteBuffer, class572_sub13, (byte) 0);
					((Class479) this).aLong5350 = (class572_sub13.method8426(-1625076140) * 3701926468772395927L);
					class572_sub13.method8421(421222932);
				}
			}
			if (class572_sub25 != null) {
				class572_sub25.aRsByteBuffer.method8552((class572_sub25.aRsByteBuffer.o * -1585139053) - i_9_, 360660143);
				int i_17_ = (class572_sub25.aRsByteBuffer.o * -1585139053);
				class572_sub25.aRsByteBuffer.o = i_9_ * 310393755;
				class572_sub25.aRsByteBuffer.writeByte(i_10_ / i_11_, -1384395473);
				class572_sub25.aRsByteBuffer.writeByte(i_10_ % i_11_, -1384395473);
				class572_sub25.aRsByteBuffer.o = i_17_ * 310393755;
				client.aClass195_8589.method2929(class572_sub25, (byte) -70);
			}
		}
		method5652(-2084050895);
	}

	static final void method5667(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int i_18_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (-1 == i_18_)
			throw new RuntimeException("");
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = new StringBuilder().append(string).append((char) i_18_).toString();
	}

	static final void method5668(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_19_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) == 1);
		if (0 == i_19_)
			Class547_Sub1.aBool8999 = bool;
		else if (1 == i_19_)
			Class547_Sub1.aBool9002 = bool;
		else if (i_19_ == 2)
			Class547_Sub1.aBool9001 = bool;
		else
			throw new RuntimeException();
	}

	static final void method5669(Cs2Executor class441, byte i) {
		Class92.method1531(class441, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976, (short) -12832);
	}

	static void method5670(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class18.method679(1947721006);
	}

	public static int method5671(int i, int i_20_, byte i_21_) {
		int i_22_ = 0;
		for (/**/; i_20_ > 0; i_20_--) {
			i_22_ = i_22_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_22_;
	}

	static final void method5672(int i) {
		client.anInt8645 = 664497205;
		client.anInt8646 = 0;
		Class481.aClass572_Sub15_5361 = null;
		Class600.method7064(-1924395598);
	}

	public static Class572_Sub25 method5673(byte i) {
		Class572_Sub25 class572_sub25 = Class104_Sub1_Sub2.method10145((byte) 55);
		((Class572_Sub25) class572_sub25).aClass312_9253 = null;
		((Class572_Sub25) class572_sub25).anInt9251 = 0;
		class572_sub25.aRsByteBuffer = new Class572_Sub15_Sub2(5000);
		return class572_sub25;
	}

	static final int method5674(int i, int i_23_, int i_24_, int i_25_) {
		if (i == i_23_)
			return i;
		int i_26_ = 128 - i_24_;
		int i_27_ = i_24_ * (i_23_ & 0x7f) + (i & 0x7f) * i_26_ >> 7;
		int i_28_ = (i & 0x380) * i_26_ + (i_23_ & 0x380) * i_24_ >> 7;
		int i_29_ = (i_23_ & 0xfc00) * i_24_ + i_26_ * (i & 0xfc00) >> 7;
		return i_29_ & 0xfc00 | i_28_ & 0x380 | i_27_ & 0x7f;
	}
}
