package game;

/* Class572_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class572_Sub14 extends Class572 {
	int anInt9103;
	Class174_Sub1 aClass174_Sub1_9104;
	int anInt9105;
	float aFloat9106;
	Class86 aClass86_9107;
	Interface44 anInterface44_9108;
	long aLong9109;
	int[] anIntArray9110;
	int anInt9111 = 0;
	int anInt9112;
	int anInt9113;
	Class106_Sub3 aClass106_Sub3_9114;

	void method8433(int i) {
		((Class572_Sub14) this).aLong9109 = ((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.allocateMemory((long) (i * 4));
		for (int i_0_ = 3; i_0_ < i * 4; i_0_ += 4)
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) i_0_, (byte) 0);
	}

	void method8434(int i, int i_1_, int i_2_, float f) {
		if (((Class572_Sub14) this).anInt9105 != -1) {
			MaterialInformation class101 = (((Class572_Sub14) this).aClass106_Sub3_9114.aClass94_1396.getTexture(((Class572_Sub14) this).anInt9105, -119414607));
			int i_3_ = class101.aByte1366 & 0xff;
			if (i_3_ != 0 && class101.effectId != 4) {
				int i_4_;
				if (i_2_ < 0)
					i_4_ = 0;
				else if (i_2_ > 127)
					i_4_ = 16777215;
				else
					i_4_ = 131586 * i_2_;
				if (i_3_ == 256)
					i_1_ = i_4_;
				else {
					int i_5_ = i_3_;
					int i_6_ = 256 - i_3_;
					i_1_ = (((i_4_ & 0xff00ff) * i_5_ + (i_1_ & 0xff00ff) * i_6_ & ~0xff00ff) + ((i_4_ & 0xff00) * i_5_ + (i_1_ & 0xff00) * i_6_ & 0xff0000)) >> 8;
				}
			}
			int i_7_ = class101.aByte1368 & 0xff;
			if (i_7_ != 0) {
				i_7_ += 256;
				int i_8_ = ((i_1_ & 0xff0000) >> 16) * i_7_;
				if (i_8_ > 65535)
					i_8_ = 65535;
				int i_9_ = ((i_1_ & 0xff00) >> 8) * i_7_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				int i_10_ = (i_1_ & 0xff) * i_7_;
				if (i_10_ > 65535)
					i_10_ = 65535;
				i_1_ = (i_8_ << 8 & 0xff0000) + (i_9_ & 0xff00) + (i_10_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_11_ = i_1_ >> 16 & 0xff;
			int i_12_ = i_1_ >> 8 & 0xff;
			int i_13_ = i_1_ & 0xff;
			i_11_ *= f;
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 255)
				i_11_ = 255;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_13_ *= f;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			i_1_ = i_11_ << 16 | i_12_ << 8 | i_13_;
		}
		if ((((Class106_Sub3) ((Class572_Sub14) this).aClass106_Sub3_9114).anInt10477) == 0) {
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 0L, (byte) (i_1_ >> 16));
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 1L, (byte) (i_1_ >> 8));
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 2L, (byte) i_1_);
		} else {
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 0L, (byte) i_1_);
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 1L, (byte) (i_1_ >> 8));
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 2L, (byte) (i_1_ >> 16));
		}
	}

	void method8435(int i) {
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method8436(int i, int i_14_, int i_15_) {
		((Class572_Sub14) this).anIntArray9110[i_14_ * (((Class572_Sub14) this).aClass174_Sub1_9104.anInt2086 * -1715487093) + i] |= 1 << i_15_;
		((Class572_Sub14) this).anInt9111++;
	}

	void method8437(int i, int i_16_, int i_17_) {
		((Class572_Sub14) this).anIntArray9110[i_16_ * (((Class572_Sub14) this).aClass174_Sub1_9104.anInt2086 * -1715487093) + i] |= 1 << i_17_;
		((Class572_Sub14) this).anInt9111++;
	}

	void method8438(int i) {
		((Class572_Sub14) this).anInterface44_9108 = ((Class572_Sub14) this).aClass106_Sub3_9114.method9723(false);
		((Class572_Sub14) this).anInterface44_9108.method259(i * 4, 4);
		((Class572_Sub14) this).anInterface44_9108.method223(0, i * 4, ((Class572_Sub14) this).aLong9109);
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.freeMemory(((Class572_Sub14) this).aLong9109);
	}

	void method8439(int[] is, int i) {
		((Class572_Sub14) this).anInt9103 = 0;
		((Class572_Sub14) this).anInt9112 = 32767;
		((Class572_Sub14) this).anInt9113 = -32768;
		ByteBuffer bytebuffer = ((Class572_Sub14) this).aClass106_Sub3_9114.aByteBuffer10378;
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			int i_19_ = is[i_18_];
			short[] is_20_ = (((Class174_Sub1) ((Class572_Sub14) this).aClass174_Sub1_9104).aShortArrayArray10695[i_19_]);
			int i_21_ = ((Class572_Sub14) this).anIntArray9110[i_19_];
			if (i_21_ != 0 && is_20_ != null) {
				int i_22_ = 0;
				int i_23_ = 0;
				while (i_23_ < is_20_.length) {
					if ((i_21_ & 1 << i_22_++) != 0) {
						for (int i_24_ = 0; i_24_ < 3; i_24_++) {
							int i_25_ = is_20_[i_23_++] & 0xffff;
							if (i_25_ > ((Class572_Sub14) this).anInt9113)
								((Class572_Sub14) this).anInt9113 = i_25_;
							if (i_25_ < ((Class572_Sub14) this).anInt9112)
								((Class572_Sub14) this).anInt9112 = i_25_;
							bytebuffer.putShort((short) i_25_);
						}
						((Class572_Sub14) this).anInt9103 += 3;
					} else
						i_23_ += 3;
				}
			}
		}
	}

	void method8440(int i) {
		((Class572_Sub14) this).aLong9109 = ((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.allocateMemory((long) (i * 4));
		for (int i_26_ = 3; i_26_ < i * 4; i_26_ += 4)
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) i_26_, (byte) 0);
	}

	void method8441(int i) {
		((Class572_Sub14) this).anInterface44_9108 = ((Class572_Sub14) this).aClass106_Sub3_9114.method9723(false);
		((Class572_Sub14) this).anInterface44_9108.method259(i * 4, 4);
		((Class572_Sub14) this).anInterface44_9108.method223(0, i * 4, ((Class572_Sub14) this).aLong9109);
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.freeMemory(((Class572_Sub14) this).aLong9109);
	}

	void method8442(int i) {
		((Class572_Sub14) this).aLong9109 = ((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.allocateMemory((long) (i * 4));
		for (int i_27_ = 3; i_27_ < i * 4; i_27_ += 4)
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) i_27_, (byte) 0);
	}

	void method8443(int i) {
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method8444(int i) {
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) (i * 4) + 3L, (byte) -1);
	}

	Class572_Sub14(Class174_Sub1 class174_sub1, int i, int i_28_, Class86 class86) {
		((Class572_Sub14) this).anInt9103 = 0;
		((Class572_Sub14) this).anInt9112 = 0;
		((Class572_Sub14) this).anInt9113 = 0;
		((Class572_Sub14) this).aClass174_Sub1_9104 = class174_sub1;
		((Class572_Sub14) this).aClass106_Sub3_9114 = (((Class174_Sub1) ((Class572_Sub14) this).aClass174_Sub1_9104).aClass106_Sub3_10688);
		((Class572_Sub14) this).anInt9105 = i;
		((Class572_Sub14) this).aFloat9106 = (float) i_28_;
		((Class572_Sub14) this).aClass86_9107 = class86;
		((Class572_Sub14) this).anIntArray9110 = new int[(((Class572_Sub14) this).aClass174_Sub1_9104.anInt2086 * -1715487093 * (((Class572_Sub14) this).aClass174_Sub1_9104.anInt2089 * 792439321))];
	}

	void method8445(int i) {
		((Class572_Sub14) this).anInterface44_9108 = ((Class572_Sub14) this).aClass106_Sub3_9114.method9723(false);
		((Class572_Sub14) this).anInterface44_9108.method259(i * 4, 4);
		((Class572_Sub14) this).anInterface44_9108.method223(0, i * 4, ((Class572_Sub14) this).aLong9109);
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.freeMemory(((Class572_Sub14) this).aLong9109);
	}

	void method8446(int i) {
		((Class572_Sub14) this).anInterface44_9108 = ((Class572_Sub14) this).aClass106_Sub3_9114.method9723(false);
		((Class572_Sub14) this).anInterface44_9108.method259(i * 4, 4);
		((Class572_Sub14) this).anInterface44_9108.method223(0, i * 4, ((Class572_Sub14) this).aLong9109);
		((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.freeMemory(((Class572_Sub14) this).aLong9109);
	}

	void method8447(int i) {
		((Class572_Sub14) this).aLong9109 = ((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.allocateMemory((long) (i * 4));
		for (int i_29_ = 3; i_29_ < i * 4; i_29_ += 4)
			((Class572_Sub14) this).aClass106_Sub3_9114.anUnsafe10377.putByte(((Class572_Sub14) this).aLong9109 + (long) i_29_, (byte) 0);
	}
}
