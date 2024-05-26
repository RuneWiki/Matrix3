package game;

/* Class572_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class572_Sub39 extends Class572 {
	NativeHeapBuffer aNativeHeapBuffer9390;
	Class174_Sub3 aClass174_Sub3_9391;
	int anInt9392;
	float aFloat9393;
	Class86 aClass86_9394;
	Stream aStream9395;
	Class158_Sub1 aClass158_Sub1_9396;
	Class142 aClass142_9397;
	int[] anIntArray9398;
	Class106_Sub1 aClass106_Sub1_9399;

	Class572_Sub39(Class174_Sub3 class174_sub3, int i, int i_0_, Class86 class86) {
		((Class572_Sub39) this).aClass174_Sub3_9391 = class174_sub3;
		((Class572_Sub39) this).aClass106_Sub1_9399 = (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass106_Sub1_10906);
		((Class572_Sub39) this).anInt9392 = i;
		((Class572_Sub39) this).aFloat9393 = (float) i_0_;
		((Class572_Sub39) this).aClass86_9394 = class86;
		((Class572_Sub39) this).anIntArray9398 = new int[(((Class572_Sub39) this).aClass174_Sub3_9391.anInt2086 * -1715487093 * (((Class572_Sub39) this).aClass174_Sub3_9391.anInt2089 * 792439321))];
		((Class572_Sub39) this).aClass158_Sub1_9396 = new Class158_Sub1(((Class572_Sub39) this).aClass106_Sub1_9399, 5123, null, 1);
	}

	void method8766(int i) {
		((Class572_Sub39) this).aNativeHeapBuffer9390 = ((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aNativeHeap10051.method772(i * 4, true);
		((Class572_Sub39) this).aStream9395 = new Stream(((Class572_Sub39) this).aNativeHeapBuffer9390);
	}

	void method8767(int i) {
		((Class572_Sub39) this).aStream9395.method2799(i * 4 + 3);
		((Class572_Sub39) this).aStream9395.method2800(-1);
	}

	void method8768(int i) {
		((Class572_Sub39) this).aStream9395.method2799(i * 4 + 3);
		((Class572_Sub39) this).aStream9395.method2800(-1);
	}

	void method8769(int[] is, int i) {
		int i_1_ = 0;
		Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aClass572_Sub15_Sub1_10158);
		class572_sub15_sub1.o = 0;
		if (((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aBool10153) {
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				int i_3_ = is[i_2_];
				short[] is_4_ = (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aShortArrayArray10882[i_3_]);
				int i_5_ = ((Class572_Sub39) this).anIntArray9398[i_3_];
				if (i_5_ != 0 && is_4_ != null) {
					int i_6_ = 0;
					int i_7_ = 0;
					while (i_7_ < is_4_.length) {
						if ((i_5_ & 1 << i_6_++) != 0) {
							class572_sub15_sub1.writeShort((is_4_[i_7_++] & 0xffff), -1635573803);
							i_1_++;
							class572_sub15_sub1.writeShort((is_4_[i_7_++] & 0xffff), -1203497006);
							i_1_++;
							class572_sub15_sub1.writeShort((is_4_[i_7_++] & 0xffff), -1123541648);
							i_1_++;
						} else
							i_7_ += 3;
					}
				}
			}
		} else {
			for (int i_8_ = 0; i_8_ < i; i_8_++) {
				int i_9_ = is[i_8_];
				short[] is_10_ = (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aShortArrayArray10882[i_9_]);
				int i_11_ = ((Class572_Sub39) this).anIntArray9398[i_9_];
				if (i_11_ != 0 && is_10_ != null) {
					int i_12_ = 0;
					int i_13_ = 0;
					while (i_13_ < is_10_.length) {
						if ((i_11_ & 1 << i_12_++) != 0) {
							class572_sub15_sub1.method8453((is_10_[i_13_++] & 0xffff), 1466287247);
							i_1_++;
							class572_sub15_sub1.method8453((is_10_[i_13_++] & 0xffff), 2010672337);
							i_1_++;
							class572_sub15_sub1.method8453((is_10_[i_13_++] & 0xffff), 1732618069);
							i_1_++;
						} else
							i_13_ += 3;
					}
				}
			}
		}
		if (i_1_ > 0) {
			((Class572_Sub39) this).aClass158_Sub1_9396.method69(5123, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053);
			((Class572_Sub39) this).aClass106_Sub1_9399.method9416((((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10895), (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10903), ((Class572_Sub39) this).aClass142_9397, (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10878));
			((Class572_Sub39) this).aClass106_Sub1_9399.method9420(((Class572_Sub39) this).anInt9392, (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).anInt10879 & 0x7) != 0, (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).anInt10879 & 0x8) != 0);
			if (((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aBool10135)
				((Class572_Sub39) this).aClass106_Sub1_9399.method1790(2147483647, ((Class572_Sub39) this).aClass86_9394);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class572_Sub39) this).aFloat9393, 1.0F / ((Class572_Sub39) this).aFloat9393, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class572_Sub39) this).aClass106_Sub1_9399.method9416((((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10895), (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10903), ((Class572_Sub39) this).aClass142_9397, (((Class174_Sub3) ((Class572_Sub39) this).aClass174_Sub3_9391).aClass142_10878));
			((Class572_Sub39) this).aClass106_Sub1_9399.method9411(((Class572_Sub39) this).aClass158_Sub1_9396, 4, 0, i_1_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method8770(int i) {
		((Class572_Sub39) this).aStream9395.method2803();
		Interface9 interface9 = (((Class572_Sub39) this).aClass106_Sub1_9399.method9414(4, ((Class572_Sub39) this).aNativeHeapBuffer9390, i * 4, false));
		if (interface9 instanceof Class154_Sub1)
			((Class572_Sub39) this).aNativeHeapBuffer9390.method1038();
		((Class572_Sub39) this).aClass142_9397 = new Class142(interface9, 5121, 4, 0);
		((Class572_Sub39) this).aNativeHeapBuffer9390 = null;
		((Class572_Sub39) this).aStream9395 = null;
	}

	void method8771(int i) {
		((Class572_Sub39) this).aNativeHeapBuffer9390 = ((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aNativeHeap10051.method772(i * 4, true);
		((Class572_Sub39) this).aStream9395 = new Stream(((Class572_Sub39) this).aNativeHeapBuffer9390);
	}

	void method8772(int i) {
		((Class572_Sub39) this).aNativeHeapBuffer9390 = ((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aNativeHeap10051.method772(i * 4, true);
		((Class572_Sub39) this).aStream9395 = new Stream(((Class572_Sub39) this).aNativeHeapBuffer9390);
	}

	void method8773(int i) {
		((Class572_Sub39) this).aNativeHeapBuffer9390 = ((Class106_Sub1) ((Class572_Sub39) this).aClass106_Sub1_9399).aNativeHeap10051.method772(i * 4, true);
		((Class572_Sub39) this).aStream9395 = new Stream(((Class572_Sub39) this).aNativeHeapBuffer9390);
	}

	void method8774(int i, int i_14_, int i_15_, float f) {
		if (((Class572_Sub39) this).anInt9392 != -1) {
			MaterialInformation class101 = (((Class572_Sub39) this).aClass106_Sub1_9399.aClass94_1396.getTexture(((Class572_Sub39) this).anInt9392, 841007025));
			int i_16_ = class101.aByte1366 & 0xff;
			if (i_16_ != 0 && class101.effectId != 4) {
				int i_17_;
				if (i_15_ < 0)
					i_17_ = 0;
				else if (i_15_ > 127)
					i_17_ = 16777215;
				else
					i_17_ = 131586 * i_15_;
				if (i_16_ == 256)
					i_14_ = i_17_;
				else {
					int i_18_ = i_16_;
					int i_19_ = 256 - i_16_;
					i_14_ = ((((i_17_ & 0xff00ff) * i_18_ + (i_14_ & 0xff00ff) * i_19_) & ~0xff00ff) + (((i_17_ & 0xff00) * i_18_ + (i_14_ & 0xff00) * i_19_) & 0xff0000)) >> 8;
				}
			}
			int i_20_ = class101.aByte1368 & 0xff;
			if (i_20_ != 0) {
				i_20_ += 256;
				int i_21_ = ((i_14_ & 0xff0000) >> 16) * i_20_;
				if (i_21_ > 65535)
					i_21_ = 65535;
				int i_22_ = ((i_14_ & 0xff00) >> 8) * i_20_;
				if (i_22_ > 65535)
					i_22_ = 65535;
				int i_23_ = (i_14_ & 0xff) * i_20_;
				if (i_23_ > 65535)
					i_23_ = 65535;
				i_14_ = (i_21_ << 8 & 0xff0000) + (i_22_ & 0xff00) + (i_23_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_24_ = i_14_ >> 16 & 0xff;
			int i_25_ = i_14_ >> 8 & 0xff;
			int i_26_ = i_14_ & 0xff;
			i_24_ *= f;
			if (i_24_ < 0)
				i_24_ = 0;
			else if (i_24_ > 255)
				i_24_ = 255;
			i_25_ *= f;
			if (i_25_ < 0)
				i_25_ = 0;
			else if (i_25_ > 255)
				i_25_ = 255;
			i_26_ *= f;
			if (i_26_ < 0)
				i_26_ = 0;
			else if (i_26_ > 255)
				i_26_ = 255;
			i_14_ = i_24_ << 16 | i_25_ << 8 | i_26_;
		}
		((Class572_Sub39) this).aStream9395.method2799(i * 4);
		((Class572_Sub39) this).aStream9395.method2800((byte) (i_14_ >> 16));
		((Class572_Sub39) this).aStream9395.method2800((byte) (i_14_ >> 8));
		((Class572_Sub39) this).aStream9395.method2800((byte) i_14_);
	}

	void method8775(int i) {
		((Class572_Sub39) this).aStream9395.method2799(i * 4 + 3);
		((Class572_Sub39) this).aStream9395.method2800(-1);
	}

	void method8776(int i, int i_27_, int i_28_) {
		((Class572_Sub39) this).anIntArray9398[i_27_ * (((Class572_Sub39) this).aClass174_Sub3_9391.anInt2086 * -1715487093) + i] |= 1 << i_28_;
	}

	void method8777(int i) {
		((Class572_Sub39) this).aStream9395.method2799(i * 4 + 3);
		((Class572_Sub39) this).aStream9395.method2800(-1);
	}

	void method8778(int i) {
		((Class572_Sub39) this).aStream9395.method2799(i * 4 + 3);
		((Class572_Sub39) this).aStream9395.method2800(-1);
	}

	void method8779(int i) {
		((Class572_Sub39) this).aStream9395.method2803();
		Interface9 interface9 = (((Class572_Sub39) this).aClass106_Sub1_9399.method9414(4, ((Class572_Sub39) this).aNativeHeapBuffer9390, i * 4, false));
		if (interface9 instanceof Class154_Sub1)
			((Class572_Sub39) this).aNativeHeapBuffer9390.method1038();
		((Class572_Sub39) this).aClass142_9397 = new Class142(interface9, 5121, 4, 0);
		((Class572_Sub39) this).aNativeHeapBuffer9390 = null;
		((Class572_Sub39) this).aStream9395 = null;
	}
}
