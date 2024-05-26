package game;

/* Class362_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

import java.nio.ByteBuffer;

public class Class362_Sub2 extends Class362 {
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_9741;
	long aLong9742 = 0L;

	void method9247() {
		method9249();
	}

	void method9248(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_, byte i_2_, byte i_3_, byte i_4_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_0_);
		bytebuffer.put(i_1_);
		bytebuffer.put(i_2_);
		bytebuffer.put(i_3_);
		bytebuffer.put(i_4_);
	}

	public void method39() {
		if (((Class362_Sub2) this).aLong9742 != 0L) {
			IUnknown.Release(((Class362_Sub2) this).aLong9742);
			((Class362_Sub2) this).aLong9742 = 0L;
		}
		((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.method9573(this);
	}

	void method9249() {
		if (((Class362_Sub2) this).aLong9742 != 0L) {
			((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.method10097(((Class362_Sub2) this).aLong9742);
			((Class362_Sub2) this).aLong9742 = 0L;
		}
	}

	public void finalize() {
		method9249();
	}

	public void method38() {
		if (((Class362_Sub2) this).aLong9742 != 0L) {
			IUnknown.Release(((Class362_Sub2) this).aLong9742);
			((Class362_Sub2) this).aLong9742 = 0L;
		}
		((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.method9573(this);
	}

	Class362_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, Class354[] class354s) {
		super(class354s);
		((Class362_Sub2) this).aClass106_Sub3_Sub1_9741 = class106_sub3_sub1;
		byte i = 0;
		ByteBuffer bytebuffer = ((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.aByteBuffer10378;
		bytebuffer.clear();
		for (short i_5_ = 0; i_5_ < aClass354Array4440.length; i_5_++) {
			short i_6_ = 0;
			Class354 class354 = aClass354Array4440[i_5_];
			for (int i_7_ = 0; i_7_ < class354.method4415(); i_7_++) {
				Class364 class364 = class354.method4416(i_7_);
				if (class364 == Class364.aClass364_4472)
					method9248(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class364 == Class364.aClass364_4464)
					method9248(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class364 == Class364.aClass364_4468)
					method9248(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class364 == Class364.aClass364_4471) {
					Class362_Sub2 class362_sub2_8_ = this;
					ByteBuffer bytebuffer_9_ = bytebuffer;
					short i_10_ = i_5_;
					short i_11_ = i_6_;
					byte i_12_ = 0;
					byte i_13_ = 0;
					byte i_14_ = 5;
					byte i_15_ = i;
					i++;
					class362_sub2_8_.method9248(bytebuffer_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_);
				} else if (class364 == Class364.aClass364_4482) {
					Class362_Sub2 class362_sub2_16_ = this;
					ByteBuffer bytebuffer_17_ = bytebuffer;
					short i_18_ = i_5_;
					short i_19_ = i_6_;
					byte i_20_ = 1;
					byte i_21_ = 0;
					byte i_22_ = 5;
					byte i_23_ = i;
					i++;
					class362_sub2_16_.method9248(bytebuffer_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_);
				} else if (class364 == Class364.aClass364_4469) {
					Class362_Sub2 class362_sub2_24_ = this;
					ByteBuffer bytebuffer_25_ = bytebuffer;
					short i_26_ = i_5_;
					short i_27_ = i_6_;
					byte i_28_ = 2;
					byte i_29_ = 0;
					byte i_30_ = 5;
					byte i_31_ = i;
					i++;
					class362_sub2_24_.method9248(bytebuffer_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_);
				} else if (class364 == Class364.aClass364_4470) {
					Class362_Sub2 class362_sub2_32_ = this;
					ByteBuffer bytebuffer_33_ = bytebuffer;
					short i_34_ = i_5_;
					short i_35_ = i_6_;
					byte i_36_ = 3;
					byte i_37_ = 0;
					byte i_38_ = 5;
					byte i_39_ = i;
					i++;
					class362_sub2_32_.method9248(bytebuffer_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_);
				}
				i_6_ += class364.anInt4466;
			}
		}
		method9248(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		((Class362_Sub2) this).aLong9742 = (IDirect3DDevice.CreateVertexDeclaration(((Class106_Sub3_Sub1) ((Class362_Sub2) this).aClass106_Sub3_Sub1_9741).aLong11066, ((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.aLong10444));
		((Class362_Sub2) this).aClass106_Sub3_Sub1_9741.method9803(this);
	}
}
