package game;

/* Class219_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

public class Class219_Sub3 extends Class219 implements Interface40 {
	int anInt9902;
	int anInt9903;
	int anInt9904;

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	long method3094() {
		return ((Class219_Sub3) this).aLong2516;
	}

	public void method202() {
		((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.method10090(this);
	}

	public void method205() {
		((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.method10090(this);
	}

	public void method39() {
		super.method39();
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	Class219_Sub3(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class106_sub3_sub1, class171, Class88.aClass88_1218, false, i * i_0_ * i_1_);
		((Class219_Sub3) this).anInt9904 = i;
		((Class219_Sub3) this).anInt9902 = i_0_;
		((Class219_Sub3) this).anInt9903 = i_1_;
		((Class219_Sub3) this).aLong2516 = (IDirect3DDevice.CreateVolumeTexture(((Class106_Sub3_Sub1) ((Class219_Sub3) this).aClass106_Sub3_Sub1_2514).aLong11066, i, i_0_, i_1_, 1, 0, Class106_Sub3_Sub1.method10094(class171, (((Class219_Sub3) this).aClass88_2512)), 1));
		((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.method9661(((Class219_Sub3) this).anInt9904 * ((Class219_Sub3) this).anInt9902 * (class171.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(((Class219_Sub3) this).aLong2516, 0, 0, 0, 0, ((Class219_Sub3) this).anInt9904, ((Class219_Sub3) this).anInt9902, ((Class219_Sub3) this).anInt9903, (((Class219_Sub3) this).anInt9904 * (class171.anInt2074 * 1572594303)), 0, (((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.aLong10444));
	}

	public void method38() {
		super.method39();
	}

	public void method204() {
		((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.method10090(this);
	}

	long method3095() {
		return ((Class219_Sub3) this).aLong2516;
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}

	public void method206() {
		((Class219_Sub3) this).aClass106_Sub3_Sub1_2514.method10090(this);
	}

	long method3097() {
		return ((Class219_Sub3) this).aLong2516;
	}

	long method3098() {
		return ((Class219_Sub3) this).aLong2516;
	}
}
