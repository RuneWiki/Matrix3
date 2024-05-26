package game;

/* Class219_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

import java.nio.ByteBuffer;

public class Class219_Sub2 extends Class219 implements Interface43 {
	int anInt9750;
	float aFloat9751;
	float aFloat9752;
	int anInt9753;
	boolean aBool9754;
	boolean aBool9755;

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	Class219_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, Class88 class88, int i, int i_0_, int i_1_, int i_2_) {
		super(class106_sub3_sub1, class171, class88, false, i * i_0_);
		if (!((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aBool11055) {
			((Class219_Sub2) this).anInt9750 = HashTable.nextPowerOfTwo(i, 2132475267);
			((Class219_Sub2) this).anInt9753 = HashTable.nextPowerOfTwo(i_0_, 1704566298);
			((Class219_Sub2) this).aFloat9751 = (float) i / (float) ((Class219_Sub2) this).anInt9750;
			((Class219_Sub2) this).aFloat9752 = (float) i_0_ / (float) ((Class219_Sub2) this).anInt9753;
		} else {
			((Class219_Sub2) this).anInt9750 = i;
			((Class219_Sub2) this).anInt9753 = i_0_;
			((Class219_Sub2) this).aFloat9751 = 1.0F;
			((Class219_Sub2) this).aFloat9752 = 1.0F;
		}
		((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture(((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 0, i_1_, Class106_Sub3_Sub1.method10094((((Class219_Sub2) this).aClass171_2513), (((Class219_Sub2) this).aClass88_2512)), i_2_));
	}

	Class219_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, int i, int i_3_, boolean bool, int[] is, int i_4_, int i_5_) {
		super(class106_sub3_sub1, Class171.aClass171_2071, Class88.aClass88_1218, bool && ((Class106_Sub3_Sub1) class106_sub3_sub1).aBool11050, i * i_3_);
		if (!((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aBool11055) {
			((Class219_Sub2) this).anInt9750 = HashTable.nextPowerOfTwo(i, 1819424046);
			((Class219_Sub2) this).anInt9753 = HashTable.nextPowerOfTwo(i_3_, 292035657);
			((Class219_Sub2) this).aFloat9751 = (float) i / (float) ((Class219_Sub2) this).anInt9750;
			((Class219_Sub2) this).aFloat9752 = (float) i_3_ / (float) ((Class219_Sub2) this).anInt9753;
			if (i != ((Class219_Sub2) this).anInt9750 || i_3_ != ((Class219_Sub2) this).anInt9753) {
				is = (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1794(i, i_3_, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, is, i_4_, i_5_, -1229401204));
				i_4_ = 0;
				i_5_ = ((Class219_Sub2) this).anInt9750;
			}
		} else {
			((Class219_Sub2) this).anInt9750 = i;
			((Class219_Sub2) this).anInt9753 = i_3_;
			((Class219_Sub2) this).aFloat9751 = 1.0F;
			((Class219_Sub2) this).aFloat9752 = 1.0F;
		}
		if (bool)
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 0, 1024, 21, 1));
		else
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 1, 0, 21, 1));
		if (i_5_ == 0)
			i_5_ = ((Class219_Sub2) this).anInt9750;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_5_ * ((Class219_Sub2) this).anInt9753 * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_4_, i_5_ * ((Class219_Sub2) this).anInt9753);
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, 0, 0, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, i_5_ * ((((Class219_Sub2) this).aClass171_2513.anInt2074) * 1572594303), 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
	}

	Class219_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, int i, int i_6_, boolean bool, byte[] is, int i_7_, int i_8_) {
		super(class106_sub3_sub1, class171, Class88.aClass88_1218, bool && ((Class106_Sub3_Sub1) class106_sub3_sub1).aBool11050, i * i_6_);
		if (!((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aBool11055) {
			((Class219_Sub2) this).anInt9750 = HashTable.nextPowerOfTwo(i, 1462709114);
			((Class219_Sub2) this).anInt9753 = HashTable.nextPowerOfTwo(i_6_, 589099189);
			((Class219_Sub2) this).aFloat9751 = (float) i / (float) ((Class219_Sub2) this).anInt9750;
			((Class219_Sub2) this).aFloat9752 = (float) i_6_ / (float) ((Class219_Sub2) this).anInt9753;
			if (i != ((Class219_Sub2) this).anInt9750 || i_6_ != ((Class219_Sub2) this).anInt9753) {
				is = (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1796(i, i_6_, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, is, i_7_, i_8_, class171.anInt2074 * 1572594303, (byte) -103));
				i_7_ = 0;
				i_8_ = ((Class219_Sub2) this).anInt9750;
			}
		} else {
			((Class219_Sub2) this).anInt9750 = i;
			((Class219_Sub2) this).anInt9753 = i_6_;
			((Class219_Sub2) this).aFloat9751 = 1.0F;
			((Class219_Sub2) this).aFloat9752 = 1.0F;
		}
		if (bool)
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 0, 1024, Class106_Sub3_Sub1.method10094((((Class219_Sub2) this).aClass171_2513), Class88.aClass88_1218), 1));
		else
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 1, 0, Class106_Sub3_Sub1.method10094((((Class219_Sub2) this).aClass171_2513), Class88.aClass88_1218), 1));
		if (i_8_ == 0)
			i_8_ = ((Class219_Sub2) this).anInt9750;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_8_ * ((Class219_Sub2) this).anInt9753 * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		if (((Class219_Sub2) this).aClass171_2513 == Class171.aClass171_2063) {
			bytebuffer.put(is, i_7_, (((Class219_Sub2) this).anInt9753 * ((Class219_Sub2) this).anInt9750 / 2));
			IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, 0, 0, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753 / 4, ((Class219_Sub2) this).anInt9750 / 4 * 8, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		} else if (((Class219_Sub2) this).aClass171_2513 == Class171.aClass171_2072) {
			bytebuffer.put(is, i_7_, (((Class219_Sub2) this).anInt9753 * ((Class219_Sub2) this).anInt9750));
			IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, 0, 0, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753 / 4, ((Class219_Sub2) this).anInt9750 / 4 * 16, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		} else {
			bytebuffer.put(is, i_7_, i_8_ * ((Class219_Sub2) this).anInt9753);
			IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, 0, 0, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, i_8_ * ((((Class219_Sub2) this).aClass171_2513.anInt2074) * 1572594303), 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		}
	}

	public float method226(float f) {
		return f / (float) ((Class219_Sub2) this).anInt9750;
	}

	public int method42() {
		return ((Class219_Sub2) this).anInt9750;
	}

	public int method41() {
		return ((Class219_Sub2) this).anInt9753;
	}

	long method3097() {
		return ((Class219_Sub2) this).aLong2516;
	}

	public float method224(float f) {
		return f / (float) ((Class219_Sub2) this).anInt9753;
	}

	long method3094() {
		return ((Class219_Sub2) this).aLong2516;
	}

	public float method257() {
		return ((Class219_Sub2) this).aFloat9752;
	}

	public boolean method228() {
		return true;
	}

	public void method39() {
		super.method39();
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public void method253(boolean bool, boolean bool_9_) {
		((Class219_Sub2) this).aBool9754 = bool;
		((Class219_Sub2) this).aBool9755 = bool_9_;
	}

	public void method230(int i, int i_10_, int i_11_, int i_12_, int[] is, int i_13_, int i_14_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		if (i_14_ == 0)
			i_14_ = i_11_;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_14_ * i_12_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_13_, i_14_ * i_12_);
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, i, i_10_, i_11_, i_12_, i_14_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303), 0, ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444);
	}

	public void method227(int i, int i_15_, int i_16_, int i_17_, byte[] is, Class171 class171, int i_18_, int i_19_) {
		if (((Class219_Sub2) this).aClass171_2513 != class171 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		if (i_19_ == 0)
			i_19_ = i_16_;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_19_ * i_17_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.put(is, i_18_, i_19_ * i_17_);
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, i, i_15_, i_16_, i_17_, i_19_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303), 0, ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444);
	}

	public void method232(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_21_ * i_22_ * 4);
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class219_Sub2) this).aLong2516, 0, i, i_20_, i_21_, i_22_, i_21_ * 4, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		bytebuffer.asIntBuffer().get(is, i_23_, i_21_ * i_22_);
	}

	public void method233(int i, int i_24_, int i_25_, int i_26_, int[] is, int[] is_27_, int i_28_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		method233(i, i_24_, i_25_, i_26_, is, null, i_28_);
	}

	public void method246(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		int[] is = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1696(i_32_, i_33_, i_30_, i_31_);
		if (is != null) {
			for (int i_34_ = 0; i_34_ < is.length; i_34_++)
				is[i_34_] |= ~0xffffff;
			method230(i, i_29_, i_30_, i_31_, is, 0, i_30_);
		}
	}

	public void method202() {
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method10089(this);
	}

	public float method254(float f) {
		return f / (float) ((Class219_Sub2) this).anInt9753;
	}

	public float method250() {
		return ((Class219_Sub2) this).aFloat9751;
	}

	public void method38() {
		super.method39();
	}

	public int method236() {
		return ((Class219_Sub2) this).anInt9750;
	}

	Class219_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, int i, int i_35_, boolean bool, float[] fs, int i_36_, int i_37_) {
		super(class106_sub3_sub1, class171, Class88.aClass88_1218, bool && ((Class106_Sub3_Sub1) class106_sub3_sub1).aBool11050, i * i_35_);
		if (!((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aBool11055) {
			((Class219_Sub2) this).anInt9750 = HashTable.nextPowerOfTwo(i, 1897712057);
			((Class219_Sub2) this).anInt9753 = HashTable.nextPowerOfTwo(i_35_, 1986036301);
			((Class219_Sub2) this).aFloat9751 = (float) i / (float) ((Class219_Sub2) this).anInt9750;
			((Class219_Sub2) this).aFloat9752 = (float) i_35_ / (float) ((Class219_Sub2) this).anInt9753;
			if (i != ((Class219_Sub2) this).anInt9750 || i_35_ != ((Class219_Sub2) this).anInt9753) {
				fs = (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1795(i, i_35_, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, fs, i_36_, i_37_, class171.anInt2074 * 1572594303, -1622631584));
				i_36_ = 0;
				i_37_ = ((Class219_Sub2) this).anInt9750;
			}
		} else {
			((Class219_Sub2) this).anInt9750 = i;
			((Class219_Sub2) this).anInt9753 = i_35_;
			((Class219_Sub2) this).aFloat9751 = 1.0F;
			((Class219_Sub2) this).aFloat9752 = 1.0F;
		}
		if (bool)
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 0, 1024, Class106_Sub3_Sub1.method10094((((Class219_Sub2) this).aClass171_2513), Class88.aClass88_1213), 1));
		else
			((Class219_Sub2) this).aLong2516 = (IDirect3DDevice.CreateTexture((((Class106_Sub3_Sub1) ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514).aLong11066), ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, 1, 0, Class106_Sub3_Sub1.method10094((((Class219_Sub2) this).aClass171_2513), Class88.aClass88_1213), 1));
		if (i_37_ == 0)
			i_37_ = ((Class219_Sub2) this).anInt9750;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_37_ * ((Class219_Sub2) this).anInt9753 * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303) * 4);
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_36_, (i_37_ * ((Class219_Sub2) this).anInt9753 * ((((Class219_Sub2) this).aClass171_2513.anInt2074) * 1572594303)));
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, 0, 0, ((Class219_Sub2) this).anInt9750, ((Class219_Sub2) this).anInt9753, i_37_ * ((((Class219_Sub2) this).aClass171_2513.anInt2074) * 1572594303) * 4, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
	}

	public int method251() {
		return ((Class219_Sub2) this).anInt9753;
	}

	public float method240(float f) {
		return f / (float) ((Class219_Sub2) this).anInt9750;
	}

	public boolean method231() {
		return true;
	}

	public boolean method242() {
		return true;
	}

	public boolean method243() {
		return true;
	}

	public float method252() {
		return ((Class219_Sub2) this).aFloat9752;
	}

	public void method245(int i, int i_38_, int i_39_, int i_40_, int[] is, int i_41_, int i_42_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		if (i_42_ == 0)
			i_42_ = i_39_;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_42_ * i_40_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_41_, i_42_ * i_40_);
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, i, i_38_, i_39_, i_40_, i_42_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303), 0, ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444);
	}

	long method3095() {
		return ((Class219_Sub2) this).aLong2516;
	}

	public void method244(boolean bool, boolean bool_43_) {
		((Class219_Sub2) this).aBool9754 = bool;
		((Class219_Sub2) this).aBool9755 = bool_43_;
	}

	public void method248(int i, int i_44_, int i_45_, int i_46_, int[] is, int i_47_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_45_ * i_46_ * 4);
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class219_Sub2) this).aLong2516, 0, i, i_44_, i_45_, i_46_, i_45_ * 4, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		bytebuffer.asIntBuffer().get(is, i_47_, i_45_ * i_46_);
	}

	public void method249(int i, int i_48_, int i_49_, int i_50_, int[] is, int[] is_51_, int i_52_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		method233(i, i_48_, i_49_, i_50_, is, null, i_52_);
	}

	Class219_Sub2(Class106_Sub3_Sub1 class106_sub3_sub1, Class171 class171, Class88 class88, int i, int i_53_) {
		this(class106_sub3_sub1, class171, class88, i, i_53_, 0, 1);
	}

	public float method239() {
		return ((Class219_Sub2) this).aFloat9751;
	}

	public float method229() {
		return ((Class219_Sub2) this).aFloat9752;
	}

	public int method159() {
		return ((Class219_Sub2) this).anInt9750;
	}

	public boolean method234() {
		return false;
	}

	public void method205() {
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method10089(this);
	}

	public void method204() {
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method10089(this);
	}

	public void method247(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_55_ * i_56_ * 4);
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class219_Sub2) this).aLong2516, 0, i, i_54_, i_55_, i_56_, i_55_ * 4, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		bytebuffer.asIntBuffer().get(is, i_57_, i_55_ * i_56_);
	}

	public void method206() {
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method10089(this);
	}

	public boolean method238() {
		return false;
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}

	public void method225(int i, int i_58_, int i_59_, int i_60_, int[] is, int i_61_) {
		if (((Class219_Sub2) this).aClass171_2513 != Class171.aClass171_2071 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_59_ * i_60_ * 4);
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class219_Sub2) this).aLong2516, 0, i, i_58_, i_59_, i_60_, i_59_ * 4, 0, (((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444));
		bytebuffer.asIntBuffer().get(is, i_61_, i_59_ * i_60_);
	}

	public boolean method237() {
		return false;
	}

	long method3098() {
		return ((Class219_Sub2) this).aLong2516;
	}

	public void method241(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_) {
		int[] is = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1696(i_65_, i_66_, i_63_, i_64_);
		if (is != null) {
			for (int i_67_ = 0; i_67_ < is.length; i_67_++)
				is[i_67_] |= ~0xffffff;
			method230(i, i_62_, i_63_, i_64_, is, 0, i_63_);
		}
	}

	public void method255(int i, int i_68_, int i_69_, int i_70_, byte[] is, Class171 class171, int i_71_, int i_72_) {
		if (((Class219_Sub2) this).aClass171_2513 != class171 || ((Class219_Sub2) this).aClass88_2512 != Class88.aClass88_1218)
			throw new RuntimeException();
		if (i_72_ == 0)
			i_72_ = i_69_;
		((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method9661(i_72_ * i_70_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303));
		ByteBuffer bytebuffer = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aByteBuffer10378;
		bytebuffer.clear();
		bytebuffer.put(is, i_71_, i_72_ * i_70_);
		IDirect3DTexture.Upload(((Class219_Sub2) this).aLong2516, 0, i, i_68_, i_69_, i_70_, i_72_ * (((Class219_Sub2) this).aClass171_2513.anInt2074 * 1572594303), 0, ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.aLong10444);
	}

	public void method256(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		int[] is = ((Class219_Sub2) this).aClass106_Sub3_Sub1_2514.method1696(i_76_, i_77_, i_74_, i_75_);
		if (is != null) {
			for (int i_78_ = 0; i_78_ < is.length; i_78_++)
				is[i_78_] |= ~0xffffff;
			method230(i, i_73_, i_74_, i_75_, is, 0, i_74_);
		}
	}

	public float method235() {
		return ((Class219_Sub2) this).aFloat9751;
	}
}
