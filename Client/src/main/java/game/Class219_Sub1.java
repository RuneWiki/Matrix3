package game;

/* Class219_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

public class Class219_Sub1 extends Class219 implements Interface33 {
	int anInt9744;

	public void method207(Class367 class367) {
		super.method203(class367);
	}

	public void method202() {
		((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.method10088(this);
	}

	public void method39() {
		super.method39();
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public void method205() {
		((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.method10088(this);
	}

	public void method204() {
		((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.method10088(this);
	}

	Class219_Sub1(Class106_Sub3_Sub1 class106_sub3_sub1, int i, boolean bool, int[][] is) {
		super(class106_sub3_sub1, Class171.aClass171_2071, Class88.aClass88_1218, bool && ((Class106_Sub3_Sub1) class106_sub3_sub1).aBool11034, i * i * 6);
		((Class219_Sub1) this).anInt9744 = i;
		if (((Class219_Sub1) this).aBool2515)
			((Class219_Sub1) this).aLong2516 = (IDirect3DDevice.CreateCubeTexture((((Class106_Sub3_Sub1) ((Class219_Sub1) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub1) this).anInt9744, 0, 1024, 21, 1));
		else
			((Class219_Sub1) this).aLong2516 = (IDirect3DDevice.CreateCubeTexture((((Class106_Sub3_Sub1) ((Class219_Sub1) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub1) this).anInt9744, 1, 0, 21, 1));
		ByteBuffer bytebuffer = ((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.method9661(((Class219_Sub1) this).anInt9744 * ((Class219_Sub1) this).anInt9744 * 4);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(((Class219_Sub1) this).aLong2516, i_0_, 0, 0, 0, ((Class219_Sub1) this).anInt9744, ((Class219_Sub1) this).anInt9744, ((Class219_Sub1) this).anInt9744 * 4, 0, (((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.aLong10444));
		}
	}

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	public void method38() {
		super.method39();
	}

	public void method206() {
		((Class219_Sub1) this).aClass106_Sub3_Sub1_2514.method10088(this);
	}
}
