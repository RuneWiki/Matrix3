package game;

/* Class219_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class219_Sub2_Sub1 extends Class219_Sub2 implements Interface45 {
	public void method201(Class367 class367) {
		super.method203(class367);
	}

	public void method245(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		super.method230(i, i_0_, i_1_, i_2_, is, i_3_, i_4_);
	}

	public void method232(int i, int i_5_, int i_6_, int i_7_, int[] is, int i_8_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) this).aLong2516, 0);
		long l_9_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), i_6_, i_7_, 21, 0, 0, true);
		((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.method9661(i_7_ * i_6_ * 4);
		if (Class32.method767(IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), l, i, i_5_, i_6_, i_7_, l_9_, 0, 0, i_6_, i_7_, 1))) {
			IDirect3DSurface.Download(l_9_, 0, 0, i_6_, i_7_, i_6_ * 4, 16, (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aLong10444));
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.clear();
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_9_);
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public void method248(int i, int i_10_, int i_11_, int i_12_, int[] is, int i_13_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) this).aLong2516, 0);
		long l_14_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), i_11_, i_12_, 21, 0, 0, true);
		((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.method9661(i_12_ * i_11_ * 4);
		if (Class32.method767(IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), l, i, i_10_, i_11_, i_12_, l_14_, 0, 0, i_11_, i_12_, 1))) {
			IDirect3DSurface.Download(l_14_, 0, 0, i_11_, i_12_, i_11_ * 4, 16, (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aLong10444));
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.clear();
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_14_);
	}

	public int method41() {
		return super.method41();
	}

	public float method226(float f) {
		return super.method226(f);
	}

	public float method224(float f) {
		return super.method224(f);
	}

	public void method225(int i, int i_15_, int i_16_, int i_17_, int[] is, int i_18_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) this).aLong2516, 0);
		long l_19_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), i_16_, i_17_, 21, 0, 0, true);
		((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.method9661(i_17_ * i_16_ * 4);
		if (Class32.method767(IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), l, i, i_15_, i_16_, i_17_, l_19_, 0, 0, i_16_, i_17_, 1))) {
			IDirect3DSurface.Download(l_19_, 0, 0, i_16_, i_17_, i_16_ * 4, 16, (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aLong10444));
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.clear();
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_19_);
	}

	public void method253(boolean bool, boolean bool_20_) {
		super.method253(bool, bool_20_);
	}

	public int method42() {
		return super.method42();
	}

	public void method205() {
		super.method202();
	}

	public void method233(int i, int i_21_, int i_22_, int i_23_, int[] is, int[] is_24_, int i_25_) {
		super.method233(i, i_21_, i_22_, i_23_, is, is_24_, i_25_);
	}

	public Interface6 method260(int i) {
		return new Class332(this, i);
	}

	public float method235() {
		return super.method235();
	}

	public float method257() {
		return super.method257();
	}

	public boolean method237() {
		return super.method237();
	}

	public void method202() {
		super.method202();
	}

	public void method244(boolean bool, boolean bool_26_) {
		super.method253(bool, bool_26_);
	}

	public void method256(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		super.method246(i, i_27_, i_28_, i_29_, i_30_, i_31_);
	}

	public int method236() {
		return super.method42();
	}

	public int method159() {
		return super.method42();
	}

	public void method39() {
		super.method39();
	}

	public float method240(float f) {
		return super.method226(f);
	}

	public boolean method231() {
		return super.method228();
	}

	public boolean method242() {
		return super.method228();
	}

	public boolean method243() {
		return super.method228();
	}

	public void method255(int i, int i_32_, int i_33_, int i_34_, byte[] is, Class171 class171, int i_35_, int i_36_) {
		super.method227(i, i_32_, i_33_, i_34_, is, class171, i_35_, i_36_);
	}

	public void method38() {
		super.method39();
	}

	Class219_Sub2_Sub1(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, Class88 class88, int i, int i_37_) {
		super(class106_sub3_sub1, class171, class88, i, i_37_, 1025, 0);
	}

	public void method247(int i, int i_38_, int i_39_, int i_40_, int[] is, int i_41_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class219_Sub2_Sub1) this).aLong2516, 0);
		long l_42_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), i_39_, i_40_, 21, 0, 0, true);
		((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.method9661(i_40_ * i_39_ * 4);
		if (Class32.method767(IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514)).aLong11066), l, i, i_38_, i_39_, i_40_, l_42_, 0, 0, i_39_, i_40_, 1))) {
			IDirect3DSurface.Download(l_42_, 0, 0, i_39_, i_40_, i_39_ * 4, 16, (((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aLong10444));
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.clear();
			((Class219_Sub2_Sub1) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_42_);
	}

	public boolean method228() {
		return super.method228();
	}

	public void method249(int i, int i_43_, int i_44_, int i_45_, int[] is, int[] is_46_, int i_47_) {
		super.method233(i, i_43_, i_44_, i_45_, is, is_46_, i_47_);
	}

	public float method250() {
		return super.method235();
	}

	public float method239() {
		return super.method235();
	}

	public float method229() {
		return super.method257();
	}

	public float method252() {
		return super.method257();
	}

	public boolean method234() {
		return super.method237();
	}

	public boolean method238() {
		return super.method237();
	}

	public void method204() {
		super.method202();
	}

	public void method227(int i, int i_48_, int i_49_, int i_50_, byte[] is, Class171 class171, int i_51_, int i_52_) {
		super.method227(i, i_48_, i_49_, i_50_, is, class171, i_51_, i_52_);
	}

	public void method206() {
		super.method202();
	}

	public int method251() {
		return super.method41();
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}

	public Interface6 method261(int i) {
		return new Class332(this, i);
	}

	public float method254(float f) {
		return super.method224(f);
	}

	public void method246(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_) {
		super.method246(i, i_53_, i_54_, i_55_, i_56_, i_57_);
	}

	public void method230(int i, int i_58_, int i_59_, int i_60_, int[] is, int i_61_, int i_62_) {
		super.method230(i, i_58_, i_59_, i_60_, is, i_61_, i_62_);
	}

	public void method241(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		super.method246(i, i_63_, i_64_, i_65_, i_66_, i_67_);
	}
}
